insert into customer(id, name) values (1000, 'Akhil');
insert into customer(id, name) values (1001, 'Karthik');
insert into customer(id, name) values (1002, 'Aditya');

insert into my_transaction(id, description, total, save_date, customer_id) values (1001, 'Purchase A', 100, '2020-04-15 04:20:12', 1000);
insert into my_transaction(id, description, total, save_date, customer_id) values (1002, 'Purchase B', 50, '2020-04-13 04:20:12', 1000);
insert into my_transaction(id, description, total, save_date, customer_id) values (1003, 'Purchase C', 120, '2020-04-14 10:20:10', 1000);
insert into my_transaction(id, description, total, save_date, customer_id) values (1004, 'Purchase 10', 175.32, '2020-04-11 10:20:10', 1000);
insert into my_transaction(id, description, total, save_date, customer_id) values (1005, 'Purchase 20', 65.75, '2020-04-10 10:20:10', 1000);
insert into my_transaction(id, description, total, save_date, customer_id) values (1006, 'Purchase 30', 210.50, '2020-04-14 10:20:10', 1000);
insert into my_transaction(id, description, total, save_date, customer_id) values (1009, 'Purchase 31', 42.80, '2020-04-13 10:20:10', 1000);

insert into my_transaction(id, description, total, save_date, customer_id) values (1200, 'Purchase 100', 25.60, '2020-04-13 10:20:10', 1002);
insert into my_transaction(id, description, total, save_date, customer_id) values (1201, 'Purchase 101', 80.50, '2020-04-13 10:20:10', 1002);
insert into my_transaction(id, description, total, save_date, customer_id) values (1202, 'Purchase 102', 116.14, '2020-04-13 10:20:10', 1002);

insert into my_transaction(id, description, total, save_date, customer_id) values (1008, 'Purchase E', 200, '2020-04-13 10:20:10', 1001);