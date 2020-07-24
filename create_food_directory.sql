CREATE DATABASE  IF NOT EXISTS food_directory;
USE food_directory;

DROP TABLE IF EXISTS food_list;

CREATE TABLE food_list (
  food_restaurant_id int(11) NOT NULL AUTO_INCREMENT,
  food_id int(3) not NULL,
  food_name varchar(45) DEFAULT NULL,
  food_price int(4) not null,
  food_availability boolean DEFAULT false,
  PRIMARY KEY (food_restaurant_id,food_id)
) ;

INSERT INTO food_list VALUES 
	(1,1,'idli',20,true),(1,2,'dosa',25,true),(1,3,'chappathi',30,true),(1,4,'poori',35,true),
	(2,1,'idli',25,true),(2,2,'dosa',30,true),(2,3,'chappathi',35,true),(2,4,'poori',40,true),
    (3,1,'idli',30,true),(3,2,'dosa',35,true),(3,3,'chappathi',40,true),(3,4,'poori',45,true),
    (4,1,'idli',50,true),(4,2,'dosa',55,true),(4,3,'chappathi',60,true),(4,4,'poori',65,true),
    (5,1,'idli',20,true),(5,2,'dosa',20,true),(5,3,'chappathi',20,true),(5,4,'poori',20,true);
  
DROP TABLE IF EXISTS restaurant_list;

CREATE TABLE  restaurant_list (
  restaurant_id int(5) NOT NULL auto_increment,
  restaurant_name varchar(200) not NULL,
  restaurant_rating int(1),
  restaurant_address varchar(500) not NULL,
  restaurant_availability boolean DEFAULT false,
  PRIMARY KEY (restaurant_id)
) ;

INSERT INTO restaurant_list VALUES 
	(1,'HOTEL SANGEETHA',4,'NAVALUR-CHENNAI',TRUE),
	(2,'ADAYAR ANANDHA BHAVAN',3,'NAVALUR -CHENNAI',TRUE),
	(3,'HOTEL ANNAPOORNA',3,'NAVALUR -CHENNAI',TRUE),
	(4,'HOTEL GANGA',3,'NAVALUR -CHENNAI',TRUE),
	(5,'GHUMA GHOOMULU',4,'NAVALUR -CHENNAI',TRUE);
    
    
 DROP TABLE IF EXISTS order_list;   
    
 CREATE TABLE  order_list (
  order_id int(5) NOT NULL auto_increment,
  customer_id varchar(200) not NULL,
  restaurant_id double(1,1),
  food_id int(5) not NULL,
  PRIMARY KEY (order_id)
) ;   



