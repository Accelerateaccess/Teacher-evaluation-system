-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssm9m0be
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','http://localhost:8080/ssm9m0be/upload/picture1.jpg'),(2,'picture2','http://localhost:8080/ssm9m0be/upload/picture2.jpg'),(3,'picture3','http://localhost:8080/ssm9m0be/upload/picture3.jpg'),(6,'homepage',NULL);
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiaoshi`
--

DROP TABLE IF EXISTS `jiaoshi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiaoshi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jiaoshizhanghao` varchar(200) DEFAULT NULL COMMENT '教师账号',
  `mima` varchar(200) DEFAULT NULL COMMENT '密码',
  `jiaoshixingming` varchar(200) DEFAULT NULL COMMENT '教师姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='教师';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiaoshi`
--

LOCK TABLES `jiaoshi` WRITE;
/*!40000 ALTER TABLE `jiaoshi` DISABLE KEYS */;
INSERT INTO `jiaoshi` VALUES (11,'2022-03-30 04:49:34','教师1','123456','教师姓名1','男','13823888881','773890001@qq.com'),(12,'2022-03-30 04:49:34','教师2','123456','教师姓名2','男','13823888882','773890002@qq.com'),(13,'2022-03-30 04:49:34','教师3','123456','教师姓名3','男','13823888883','773890003@qq.com'),(14,'2022-03-30 04:49:34','教师4','123456','教师姓名4','男','13823888884','773890004@qq.com'),(15,'2022-03-30 04:49:34','教师5','123456','教师姓名5','男','13823888885','773890005@qq.com'),(16,'2022-03-30 04:49:34','教师6','123456','教师姓名6','男','13823888886','773890006@qq.com');
/*!40000 ALTER TABLE `jiaoshi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiaoshirongyu`
--

DROP TABLE IF EXISTS `jiaoshirongyu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiaoshirongyu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jiaoshizhanghao` varchar(200) DEFAULT NULL COMMENT '教师账号',
  `jiaoshixingming` varchar(200) DEFAULT NULL COMMENT '教师姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `zhuanye` varchar(200) DEFAULT NULL COMMENT '专业',
  `xueli` varchar(200) DEFAULT NULL COMMENT '学历',
  `gongling` varchar(200) DEFAULT NULL COMMENT '工龄',
  `gongzuojingli` longtext COMMENT '工作经历',
  `gerentezhang` longtext COMMENT '个人特长',
  `jiaoyubeijing` varchar(200) DEFAULT NULL COMMENT '教育背景',
  `huojiangzhengshu` varchar(200) DEFAULT NULL COMMENT '获奖证书',
  `biyexuexiao` varchar(200) DEFAULT NULL COMMENT '毕业学校',
  `xiangxixinxi` longtext COMMENT '详细信息',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='教师荣誉';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiaoshirongyu`
--

LOCK TABLES `jiaoshirongyu` WRITE;
/*!40000 ALTER TABLE `jiaoshirongyu` DISABLE KEYS */;
INSERT INTO `jiaoshirongyu` VALUES (21,'2022-03-30 04:49:34','教师账号1','教师姓名1','性别1','手机1','专业1','学历1','工龄1','工作经历1','个人特长1','教育背景1','','毕业学校1','详细信息1','2022-03-30 12:49:34',1),(22,'2022-03-30 04:49:34','教师账号2','教师姓名2','性别2','手机2','专业2','学历2','工龄2','工作经历2','个人特长2','教育背景2','','毕业学校2','详细信息2','2022-03-30 12:49:34',2),(23,'2022-03-30 04:49:34','教师账号3','教师姓名3','性别3','手机3','专业3','学历3','工龄3','工作经历3','个人特长3','教育背景3','','毕业学校3','详细信息3','2022-03-30 12:49:34',3),(24,'2022-03-30 04:49:34','教师账号4','教师姓名4','性别4','手机4','专业4','学历4','工龄4','工作经历4','个人特长4','教育背景4','','毕业学校4','详细信息4','2022-03-30 12:49:34',4),(25,'2022-03-30 04:49:34','教师账号5','教师姓名5','性别5','手机5','专业5','学历5','工龄5','工作经历5','个人特长5','教育背景5','','毕业学校5','详细信息5','2022-03-30 12:49:34',5),(26,'2022-03-30 04:49:34','教师账号6','教师姓名6','性别6','手机6','专业6','学历6','工龄6','工作经历6','个人特长6','教育背景6','','毕业学校6','详细信息6','2022-03-30 12:49:34',6);
/*!40000 ALTER TABLE `jiaoshirongyu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiaoshiziping`
--

DROP TABLE IF EXISTS `jiaoshiziping`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiaoshiziping` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jiaoshizhanghao` varchar(200) DEFAULT NULL COMMENT '教师账号',
  `jiaoshixingming` varchar(200) DEFAULT NULL COMMENT '教师姓名',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `jiaoyukexuezhishi` varchar(200) DEFAULT NULL COMMENT '教育科学知识',
  `jiaoxuesheji` varchar(200) DEFAULT NULL COMMENT '教学设计',
  `jiaoxuezuzhi` varchar(200) DEFAULT NULL COMMENT '教学组织',
  `jiaoxueguanli` varchar(200) DEFAULT NULL COMMENT '教学管理',
  `meitihejishushiyong` varchar(200) DEFAULT NULL COMMENT '媒体和技术使用',
  `xinxibiaoda` varchar(200) DEFAULT NULL COMMENT '信息表达',
  `jiaoxuepingjia` varchar(200) DEFAULT NULL COMMENT '教学评价',
  `jiaoxuefansi` varchar(200) DEFAULT NULL COMMENT '教学反思',
  `jiaoxueyanjiu` varchar(200) DEFAULT NULL COMMENT '教学研究',
  `xueshujiaoliu` varchar(200) DEFAULT NULL COMMENT '学术交流',
  `zongfen` float DEFAULT NULL COMMENT '总分',
  `ziwopingjia` longtext COMMENT '自我评价',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='教师自评';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiaoshiziping`
--

LOCK TABLES `jiaoshiziping` WRITE;
/*!40000 ALTER TABLE `jiaoshiziping` DISABLE KEYS */;
INSERT INTO `jiaoshiziping` VALUES (41,'2022-03-30 04:49:34','教师账号1','教师姓名1','手机1','教育科学知识1','教学设计1','教学组织1','教学管理1','媒体和技术使用1','信息表达1','教学评价1','教学反思1','教学研究1','学术交流1',1,'自我评价1'),(42,'2022-03-30 04:49:34','教师账号2','教师姓名2','手机2','教育科学知识2','教学设计2','教学组织2','教学管理2','媒体和技术使用2','信息表达2','教学评价2','教学反思2','教学研究2','学术交流2',2,'自我评价2'),(43,'2022-03-30 04:49:34','教师账号3','教师姓名3','手机3','教育科学知识3','教学设计3','教学组织3','教学管理3','媒体和技术使用3','信息表达3','教学评价3','教学反思3','教学研究3','学术交流3',3,'自我评价3'),(44,'2022-03-30 04:49:34','教师账号4','教师姓名4','手机4','教育科学知识4','教学设计4','教学组织4','教学管理4','媒体和技术使用4','信息表达4','教学评价4','教学反思4','教学研究4','学术交流4',4,'自我评价4'),(45,'2022-03-30 04:49:34','教师账号5','教师姓名5','手机5','教育科学知识5','教学设计5','教学组织5','教学管理5','媒体和技术使用5','信息表达5','教学评价5','教学反思5','教学研究5','学术交流5',5,'自我评价5'),(46,'2022-03-30 04:49:34','教师账号6','教师姓名6','手机6','教育科学知识6','教学设计6','教学组织6','教学管理6','媒体和技术使用6','信息表达6','教学评价6','教学反思6','教学研究6','学术交流6',6,'自我评价6');
/*!40000 ALTER TABLE `jiaoshiziping` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storeup`
--

DROP TABLE IF EXISTS `storeup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) DEFAULT NULL COMMENT '收藏id',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '收藏名称',
  `picture` varchar(200) NOT NULL COMMENT '收藏图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='收藏表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeup`
--

LOCK TABLES `storeup` WRITE;
/*!40000 ALTER TABLE `storeup` DISABLE KEYS */;
/*!40000 ALTER TABLE `storeup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1,'abo','users','管理员','55jhh48b89bpuxr4mq3h1t328q1ucybv','2022-03-30 04:50:32','2022-03-30 05:50:32');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2022-03-30 04:49:34');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhuanjia`
--

DROP TABLE IF EXISTS `zhuanjia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhuanjia` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhuanjiazhanghao` varchar(200) NOT NULL COMMENT '专家账号',
  `zhuanjiaxingming` varchar(200) NOT NULL COMMENT '专家姓名',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `zhaopian` varchar(200) DEFAULT NULL COMMENT '照片',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhuanjiazhanghao` (`zhuanjiazhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='专家';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhuanjia`
--

LOCK TABLES `zhuanjia` WRITE;
/*!40000 ALTER TABLE `zhuanjia` DISABLE KEYS */;
INSERT INTO `zhuanjia` VALUES (31,'2022-03-30 04:49:34','专家1','专家姓名1','123456','男','13823888881','773890001@qq.com','http://localhost:8080/ssm9m0be/upload/zhuanjia_zhaopian1.jpg'),(32,'2022-03-30 04:49:34','专家2','专家姓名2','123456','男','13823888882','773890002@qq.com','http://localhost:8080/ssm9m0be/upload/zhuanjia_zhaopian2.jpg'),(33,'2022-03-30 04:49:34','专家3','专家姓名3','123456','男','13823888883','773890003@qq.com','http://localhost:8080/ssm9m0be/upload/zhuanjia_zhaopian3.jpg'),(34,'2022-03-30 04:49:34','专家4','专家姓名4','123456','男','13823888884','773890004@qq.com','http://localhost:8080/ssm9m0be/upload/zhuanjia_zhaopian4.jpg'),(35,'2022-03-30 04:49:34','专家5','专家姓名5','123456','男','13823888885','773890005@qq.com','http://localhost:8080/ssm9m0be/upload/zhuanjia_zhaopian5.jpg'),(36,'2022-03-30 04:49:34','专家6','专家姓名6','123456','男','13823888886','773890006@qq.com','http://localhost:8080/ssm9m0be/upload/zhuanjia_zhaopian6.jpg');
/*!40000 ALTER TABLE `zhuanjia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhuanjiapingfen`
--

DROP TABLE IF EXISTS `zhuanjiapingfen`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhuanjiapingfen` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhuanjiazhanghao` varchar(200) DEFAULT NULL COMMENT '专家账号',
  `zhuanjiaxingming` varchar(200) DEFAULT NULL COMMENT '专家姓名',
  `jiaoyujiaoxuezhishi` float DEFAULT NULL COMMENT '教育教学知识',
  `jiaoxuesheji` float DEFAULT NULL COMMENT '教学设计',
  `meitihejishushiyong` float DEFAULT NULL COMMENT '媒体和技术使用',
  `xinxibiaoda` float DEFAULT NULL COMMENT '信息表达',
  `jiaoxuezuzhi` float DEFAULT NULL COMMENT '教学组织',
  `jiaoxueguanli` float DEFAULT NULL COMMENT '教学管理',
  `jiaoxuepingjia` float DEFAULT NULL COMMENT '教学评价',
  `jiaoxuefansi` float DEFAULT NULL COMMENT '教学反思',
  `jiaoxueyanjiu` float DEFAULT NULL COMMENT '教学研究',
  `xueshujiaoliu` float DEFAULT NULL COMMENT '学术交流',
  `zongfen` float DEFAULT NULL COMMENT '总分',
  `jiaoshixingming` varchar(200) DEFAULT NULL COMMENT '教师姓名',
  `jiaoshizhanghao` varchar(200) DEFAULT NULL COMMENT '教师账号',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8 COMMENT='专家评分';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhuanjiapingfen`
--

LOCK TABLES `zhuanjiapingfen` WRITE;
/*!40000 ALTER TABLE `zhuanjiapingfen` DISABLE KEYS */;
INSERT INTO `zhuanjiapingfen` VALUES (51,'2022-03-30 04:49:34','专家账号1','专家姓名1',1,1,1,1,1,1,1,1,1,1,1,'教师姓名1','教师账号1','手机1'),(52,'2022-03-30 04:49:34','专家账号2','专家姓名2',2,2,2,2,2,2,2,2,2,2,2,'教师姓名2','教师账号2','手机2'),(53,'2022-03-30 04:49:34','专家账号3','专家姓名3',3,3,3,3,3,3,3,3,3,3,3,'教师姓名3','教师账号3','手机3'),(54,'2022-03-30 04:49:34','专家账号4','专家姓名4',4,4,4,4,4,4,4,4,4,4,4,'教师姓名4','教师账号4','手机4'),(55,'2022-03-30 04:49:34','专家账号5','专家姓名5',5,5,5,5,5,5,5,5,5,5,5,'教师姓名5','教师账号5','手机5'),(56,'2022-03-30 04:49:34','专家账号6','专家姓名6',6,6,6,6,6,6,6,6,6,6,6,'教师姓名6','教师账号6','手机6');
/*!40000 ALTER TABLE `zhuanjiapingfen` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-03 12:05:29
