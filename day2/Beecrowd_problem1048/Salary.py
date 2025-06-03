salary = float(input())

if salary <= 400.00:
    percentage = 15
elif salary <= 800.00:
    percentage = 12
elif salary <= 1200.00:
    percentage = 10
elif salary <= 2000.00:
    percentage = 7
else:
    percentage = 4

reajuste = salary * percentage / 100
new_salary = salary + reajuste

print(f"Novo salario: {new_salary:.2f}")
print(f"Reajuste ganho: {reajuste:.2f}")
print(f"Em percentual: {percentage} %")