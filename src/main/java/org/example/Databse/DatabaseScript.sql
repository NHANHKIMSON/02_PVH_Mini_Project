CREATE DATABASE productmanagementDB;


CREATE TABLE stock(
                      id serial primary key,
                      name varchar(250),
                      unit_price decimal check ( unit_price>0 ),
                      qty int check ( qty>0 ),
                      import_date varchar(250)
);
INSERT INTO stock(name, unit_price, qty, import_date) VALUES
                                                          ('Coca',2.3,19,'10-11-2024'),
                                                          ('Sting',2.5,2,'10-12-2024'),
                                                          ('Ichitan',1,2,'10-01-2024'),
                                                          ('Water',1.5,61,'30-01-2025'),
                                                          ('Carabav',1,3,'01-11-2024'),
                                                          ('Red Bull',2.3,7,'11-02-2025'),
                                                          ('pocariswet',1,22,'10-11-2023'),
                                                          ('Milk',2.3,40,'20-01-2024'),
                                                          ('Soda',1.8,60,'15-02-2025'),
                                                          ('beer',1,11,'14-11-2023');
