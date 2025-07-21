/* Write your T-SQL query statement below */
select e.name as 'Employee' from Employee e Inner Join Employee m On (e.managerId = m.id) 
where e.salary > m.salary;