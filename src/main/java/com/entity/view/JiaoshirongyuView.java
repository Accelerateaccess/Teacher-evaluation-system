package com.entity.view;

import com.entity.JiaoshirongyuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 教师荣誉
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-30 12:49:21
 */
@TableName("jiaoshirongyu")
public class JiaoshirongyuView  extends JiaoshirongyuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaoshirongyuView(){
	}
 
 	public JiaoshirongyuView(JiaoshirongyuEntity jiaoshirongyuEntity){
 	try {
			BeanUtils.copyProperties(this, jiaoshirongyuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
