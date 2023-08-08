DROP DATABASE IF EXISTS `gamedepartment`;
CREATE DATABASE `gamedepartment`;
USE `gamedepartment`;

CREATE TABLE `game`(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    gameName VARCHAR(100) DEFAULT "no name...",
    gameValue DOUBLE DEFAULT 0.0,
    gameDescription VARCHAR(200) DEFAULT "no description...",
    gameCover VARCHAR(200) DEFAULT "no image"
);
#right syntax to use near ',' at line 1

CREATE TABLE `costumer`(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    costumerName VARCHAR(100) DEFAULT "GUEST",
    costumerEmail VARCHAR(150) NOT NULL,
    costumerPasswd VARCHAR(20) NOT NULL
);