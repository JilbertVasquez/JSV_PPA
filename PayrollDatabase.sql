show databases;
create database payrolldb;
use payrolldb;
create table payrolljil (
id int not null auto_increment,
enumber int not null,
name varchar(255),
designation varchar(255),
dateofjoining varchar(255),
salary int,
primary key (id));