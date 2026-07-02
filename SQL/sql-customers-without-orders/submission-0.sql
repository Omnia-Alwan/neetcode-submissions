-- select name 
-- from customers
-- where customers.id not exists in orders.customer_id;

SELECT name
FROM customers
WHERE NOT EXISTS (
  SELECT id
  FROM orders
  WHERE customers.id = orders.customer_id 
);