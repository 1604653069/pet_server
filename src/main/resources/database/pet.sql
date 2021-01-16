/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50709
Source Host           : localhost:3306
Source Database       : pet

Target Server Type    : MYSQL
Target Server Version : 50709
File Encoding         : 65001

Date: 2021-01-16 09:22:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tbl_user
-- ----------------------------
DROP TABLE IF EXISTS `tbl_user`;
CREATE TABLE `tbl_user` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `sex` int(11) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `tel` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_user
-- ----------------------------
INSERT INTO `tbl_user` VALUES ('1', 'admin', 'admin', '1', '12', '113222221', '北京天安门');
