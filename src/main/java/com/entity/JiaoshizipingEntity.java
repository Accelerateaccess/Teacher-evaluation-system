package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 教师自评
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-30 12:49:21
 */
@TableName("jiaoshiziping")
public class JiaoshizipingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaoshizipingEntity() {
		
	}
	
	public JiaoshizipingEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 教师账号
	 */
					
	private String jiaoshizhanghao;
	
	/**
	 * 教师姓名
	 */
					
	private String jiaoshixingming;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 教育科学知识
	 */
					
	private String jiaoyukexuezhishi;
	
	/**
	 * 教学设计
	 */
					
	private String jiaoxuesheji;
	
	/**
	 * 教学组织
	 */
					
	private String jiaoxuezuzhi;
	
	/**
	 * 教学管理
	 */
					
	private String jiaoxueguanli;
	
	/**
	 * 媒体和技术使用
	 */
					
	private String meitihejishushiyong;
	
	/**
	 * 信息表达
	 */
					
	private String xinxibiaoda;
	
	/**
	 * 教学评价
	 */
					
	private String jiaoxuepingjia;
	
	/**
	 * 教学反思
	 */
					
	private String jiaoxuefansi;
	
	/**
	 * 教学研究
	 */
					
	private String jiaoxueyanjiu;
	
	/**
	 * 学术交流
	 */
					
	private String xueshujiaoliu;
	
	/**
	 * 总分
	 */
					
	private Float zongfen;
	
	/**
	 * 自我评价
	 */
					
	private String ziwopingjia;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：教师账号
	 */
	public void setJiaoshizhanghao(String jiaoshizhanghao) {
		this.jiaoshizhanghao = jiaoshizhanghao;
	}
	/**
	 * 获取：教师账号
	 */
	public String getJiaoshizhanghao() {
		return jiaoshizhanghao;
	}
	/**
	 * 设置：教师姓名
	 */
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
	/**
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
	/**
	 * 设置：教育科学知识
	 */
	public void setJiaoyukexuezhishi(String jiaoyukexuezhishi) {
		this.jiaoyukexuezhishi = jiaoyukexuezhishi;
	}
	/**
	 * 获取：教育科学知识
	 */
	public String getJiaoyukexuezhishi() {
		return jiaoyukexuezhishi;
	}
	/**
	 * 设置：教学设计
	 */
	public void setJiaoxuesheji(String jiaoxuesheji) {
		this.jiaoxuesheji = jiaoxuesheji;
	}
	/**
	 * 获取：教学设计
	 */
	public String getJiaoxuesheji() {
		return jiaoxuesheji;
	}
	/**
	 * 设置：教学组织
	 */
	public void setJiaoxuezuzhi(String jiaoxuezuzhi) {
		this.jiaoxuezuzhi = jiaoxuezuzhi;
	}
	/**
	 * 获取：教学组织
	 */
	public String getJiaoxuezuzhi() {
		return jiaoxuezuzhi;
	}
	/**
	 * 设置：教学管理
	 */
	public void setJiaoxueguanli(String jiaoxueguanli) {
		this.jiaoxueguanli = jiaoxueguanli;
	}
	/**
	 * 获取：教学管理
	 */
	public String getJiaoxueguanli() {
		return jiaoxueguanli;
	}
	/**
	 * 设置：媒体和技术使用
	 */
	public void setMeitihejishushiyong(String meitihejishushiyong) {
		this.meitihejishushiyong = meitihejishushiyong;
	}
	/**
	 * 获取：媒体和技术使用
	 */
	public String getMeitihejishushiyong() {
		return meitihejishushiyong;
	}
	/**
	 * 设置：信息表达
	 */
	public void setXinxibiaoda(String xinxibiaoda) {
		this.xinxibiaoda = xinxibiaoda;
	}
	/**
	 * 获取：信息表达
	 */
	public String getXinxibiaoda() {
		return xinxibiaoda;
	}
	/**
	 * 设置：教学评价
	 */
	public void setJiaoxuepingjia(String jiaoxuepingjia) {
		this.jiaoxuepingjia = jiaoxuepingjia;
	}
	/**
	 * 获取：教学评价
	 */
	public String getJiaoxuepingjia() {
		return jiaoxuepingjia;
	}
	/**
	 * 设置：教学反思
	 */
	public void setJiaoxuefansi(String jiaoxuefansi) {
		this.jiaoxuefansi = jiaoxuefansi;
	}
	/**
	 * 获取：教学反思
	 */
	public String getJiaoxuefansi() {
		return jiaoxuefansi;
	}
	/**
	 * 设置：教学研究
	 */
	public void setJiaoxueyanjiu(String jiaoxueyanjiu) {
		this.jiaoxueyanjiu = jiaoxueyanjiu;
	}
	/**
	 * 获取：教学研究
	 */
	public String getJiaoxueyanjiu() {
		return jiaoxueyanjiu;
	}
	/**
	 * 设置：学术交流
	 */
	public void setXueshujiaoliu(String xueshujiaoliu) {
		this.xueshujiaoliu = xueshujiaoliu;
	}
	/**
	 * 获取：学术交流
	 */
	public String getXueshujiaoliu() {
		return xueshujiaoliu;
	}
	/**
	 * 设置：总分
	 */
	public void setZongfen(Float zongfen) {
		this.zongfen = zongfen;
	}
	/**
	 * 获取：总分
	 */
	public Float getZongfen() {
		return zongfen;
	}
	/**
	 * 设置：自我评价
	 */
	public void setZiwopingjia(String ziwopingjia) {
		this.ziwopingjia = ziwopingjia;
	}
	/**
	 * 获取：自我评价
	 */
	public String getZiwopingjia() {
		return ziwopingjia;
	}

}