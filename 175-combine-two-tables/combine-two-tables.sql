/* Write your T-SQL query statement below */
select p.firstName, p.lastName, a.city, a.state from Person p Left Join Address a 
On (p.personId = a.personId) 
