import pymysql

from openpyxl.workbook import Workbook
from pymysql.cursors import Cursor


def write_to_sheet(wb: Workbook, sheet_name: str, headers: tuple, cursor: Cursor):
    """
    将数据写入Excel
    :param wb: 工作簿
    :param sheet_name: 工作表的名字
    :param headers: 表头
    :param cursor: 抓取数据的游标
    """
    sheet = wb.create_sheet(sheet_name)
    sheet.append(headers)
    while row := cursor.fetchone():
        sheet.append(row)


def main():
    # 创建工作簿对象
    wb = Workbook()
    conn = pymysql.connect(host='10.7.174.55', port=3306,
                           user='long', password='long.123456',
                           database='hrs', charset='utf8mb4')
    try:
        with conn.cursor() as cursor:  # type: Cursor
            cursor.execute('select dno, dname, dloc from tb_dept')
            write_to_sheet(wb, '部门', ('编号', '名称', '所在地'), cursor)
            cursor.execute(
                'select eno, ename, job, mgr, sal, comm, dno from tb_emp'
            )
            write_to_sheet(wb, '员工', ('编号', '姓名', '职位', '主管', '月薪', '补贴', '所在部门'), cursor)

    except pymysql.MySQLError as err:
        print(err)
    finally:
        wb.save('人力资源信息表1.xlsx')
        conn.close()


if __name__ == '__main__':
    main()
