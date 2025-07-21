/* Write your T-SQL query statement below */
select c.name as 'Customers' from Customers c left join Orders o 
On (c.id = o.customerId) where o.id is null