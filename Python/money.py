input_money = int(input("투입한 돈 : "))
object_money = int(input("물건 가격 : "))
change_money = input_money - object_money
print("거스름돈 : ", change_money)
five_hundred = change_money // 500
change_money = change_money % 500
one_hundred = change_money // 100
print("500원 : ", five_hundred)
print("100원 : ", one_hundred)
