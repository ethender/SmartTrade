
CREATE DATABASE IF NOT EXISTS swifttrade;

USE swifttrade;

CREATE TABLE  IF NOT EXISTS trading(
tradeid INT PRIMARY KEY AUTO_INCREMENT,
tradedate VARCHAR(100),
tradestate varchar(75),
stocks varchar(250)
);


CREATE TABLE IF NOT EXISTS  stock(
stockid INT PRIMARY KEY AUTO_INCREMENT,
symbol VARCHAR(150) UNIQUE NOT NULL,
series VARCHAR(25),
openprice FLOAT(15),
highprice FLOAT(15),
lowprice FLOAT(15),
ltp FLOAT(15),
previousprice FLOAT(15),
netprice FLOAT(15),
tradedquantity FLOAT(15),
turnoverinlakhs FLOAT(15),
lastcropannouncementdate VARCHAR(75),
lastcropannouncement VARCHAR(255)
);

