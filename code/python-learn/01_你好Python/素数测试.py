import time

if __name__ == '__main__':
    startTime = time.time()

    for number in range(2, 100):

        # 创建一个布尔值，保存结果，默认number是质数
        flag = True
        # 获取2 - number 之间的所有数
        for j in range(2, number):
            # 判断number是否能被j整除
            if number % j == 0:
                # 如果能被j整除,则不是质数,修改布尔值为False
                flag = False

        # 如果为True则输出
        if flag:
            print("%d 是个质数！" % number)
    endTime = time.time()

    print("运行时间：{}".format(endTime - startTime))
