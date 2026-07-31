select MAX(salary) as secondHighestSalary
from employee
 where salary < (select MAX(salary) from employee);