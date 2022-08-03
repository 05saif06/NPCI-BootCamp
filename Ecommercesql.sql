use Ecommerce;
desc Category;
drop table Product;
drop table Category;
 create table Category(
category_id bigint primary key auto_increment,
category_name varchar(255)
);
alter table Category auto_increment = 0;
create table Product(
id bigint primary key auto_increment,
sku varchar(255),
name varchar(255),
description varchar(255),
unit_price decimal(13,2),
image_url varchar(255),
units_in_stock int,
date_created datetime(6),
last_updated datetime(6),
category_id bigint,
foreign key (category_id) references Category(category_id)
);
alter table Product auto_increment = 101;

insert into category values(1, "SmartPhone");
insert into category values(2, "Apparel");
insert into category values(3, "Beauty");

select * from Product;
insert into Product values(0,"IP1370","Iphone 13 Pink 128GB", "Iphone 13 Pink 128GB 2 Back camera 12MP each and 1 front camera", 69999, "https://www.powerplanetonline.com/cdnassets/apple_iphone_13_mini_rosa_01_l.jpg", 
20, "2021-09-20", "2022-07-19", 1);
insert into Product values(0,"BC3270","Black Chinos", "Black stretchable 32 inch chinos", 699, "https://encrypted-tbn2.gstatic.com/shopping?q=tbn:ANd9GcRFLRmPcLm0CEMl_Mqzm5taD3DqTcZWyJL78cmcmkP_PQoIOcRBXl0jIqiaQyoca5iN2DY3H_B3DMx4XhSFMCdKen5F1DbKNbw2Qr5w6qs3WhabDk_XkvY8&usqp=CAc", 
200, "2021-04-20", "2022-05-10", 2);
insert into Product values(0,"VL5060",'VLCC Sunscreen SPF 50+++', 'VLCC sun protection formula cream 50++', 599, 'https://encrypted-tbn2.gstatic.com/shopping?q=tbn:ANd9GcRtHmILzGE9FzS5MKeNeeCAtshIiim5MUeufvHxkOOOLzJxvI52yVzCh5tPP1Ar6u8W2hzBNALfeVE&usqp=CAc', 100, '2022-03-12', '2022-06-27', 3
);
insert into Product values(0,"MR0030",'Mosturiser', 'Mosturiser to hydrate skin', 299, 'https://encrypted-tbn1.gstatic.com/shopping?q=tbn:ANd9GcQqs7_GQSqi4rpQNkFcGqf6nEXwA-zOErZobX99LQhTChonsHRuz7msOD8r6c3YHhbcF7vWDUweNm8&usqp=CAc', '300', '2022-03-12', '2022-06-27', 3
);
insert into Product values(0,"RG0828",'Realme GT Master Edition', 'Realme GT master Edition 8GB Ram 128GB ROM', 27999, 'https://encrypted-tbn3.gstatic.com/shopping?q=tbn:ANd9GcQphb6F109sBiUD-Z3RmTyhyKQNaBzyY87CqaTFdNdjcGgUeYtcHFrfFCkybLC7RcgLLIjOD2lrGsdPuKnVZhhaNOzlLnTdb385FaLmUbMY&usqp=CAc', '30', '2022-01-15', '2022-09-19', 1
);