/* Write your T-SQL query statement below */
select email as 'Email' from Person
Group By email having count(email) > 1;