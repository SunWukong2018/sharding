DROP TABLE IF EXISTS `t_order_0`;
CREATE TABLE `t_order_0` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `order_id` varchar(32) DEFAULT NULL COMMENT '顺序编号',
  `user_id` varchar(32) DEFAULT NULL COMMENT '用户编号',
  `userName` varchar(32) DEFAULT NULL COMMENT '用户名',
  `passWord` varchar(32) DEFAULT NULL COMMENT '密码',
  `user_sex` varchar(32) DEFAULT NULL COMMENT '性别',
  `nick_name` varchar(32) DEFAULT NULL COMMENT '昵称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8  COLLATE=utf8_bin;

DROP TABLE IF EXISTS `t_order_1`;
CREATE TABLE `t_order_1` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `order_id` varchar(32) DEFAULT NULL COMMENT '顺序编号',
  `user_id` varchar(32) DEFAULT NULL COMMENT '用户编号',
  `userName` varchar(32) DEFAULT NULL COMMENT '用户名',
  `passWord` varchar(32) DEFAULT NULL COMMENT '密码',
  `user_sex` varchar(32) DEFAULT NULL COMMENT '性别',
  `nick_name` varchar(32) DEFAULT NULL COMMENT '昵称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8  COLLATE=utf8_bin;