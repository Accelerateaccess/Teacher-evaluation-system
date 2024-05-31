package com.entity.model;

import com.entity.ZhuanjiapingfenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 专家评分
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-30 12:49:21
 */
public class ZhuanjiapingfenModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 专家姓名
	 */
	
	private String zhuanjiaxingming;
		
	/**
	 * 教育教学知识
	 */
	
	private Float jiaoyujiaoxuezhishi;
		
	/**
	 * 教学设计
	 */
	
	private Float jiaoxuesheji;
		
	/**
	 * 媒体和技术使用
	 */
	
	private Float meitihejishushiyong;
		
	/**
	 * 信息表达
	 */
	
	private Float xinxibiaoda;
		
	/**
	 * 教学组织
	 */
	
	private Float jiaoxuezuzhi;
		
	/**
	 * 教学管理
	 */
	
	private Float jiaoxueguanli;
		
	/**
	 * 教学评价
	 */
	
	private Float jiaoxuepingjia;
		
	/**
	 * 教学反思
	 */
	
	private Float jiaoxuefansi;
		
	/**
	 * 教学研究
	 */
	
	private Float jiaoxueyanjiu;
		
	/**
	 * 学术交流
	 */
	
	private Float xueshujiaoliu;
		
	/**
	 * 总分
	 */
	
	private Float zongfen;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 教师账号
	 */
	
	private String jiaoshizhanghao;
		
	/**
	 * 手机
	 */
	
	private String shouji;
				
	
	/**
	 * 设置：专家姓名
	 */
	 
	public void setZhuanjiaxingming(String zhuanjiaxingming) {
		this.zhuanjiaxingming = zhuanjiaxingming;
	}
	
	/**
	 * 获取：专家姓名
	 */
	public String getZhuanjiaxingming() {
		return zhuanjiaxingming;
	}
				
	
	/**
	 * 设置：教育教学知识
	 */
	 
	public void setJiaoyujiaoxuezhishi(Float jiaoyujiaoxuezhishi) {
		this.jiaoyujiaoxuezhishi = jiaoyujiaoxuezhishi;
	}
	
	/**
	 * 获取：教育教学知识
	 */
	public Float getJiaoyujiaoxuezhishi() {
		return jiaoyujiaoxuezhishi;
	}
				
	
	/**
	 * 设置：教学设计
	 */
	 
	public void setJiaoxuesheji(Float jiaoxuesheji) {
		this.jiaoxuesheji = jiaoxuesheji;
	}
	
	/**
	 * 获取：教学设计
	 */
	public Float getJiaoxuesheji() {
		return jiaoxuesheji;
	}
				
	
	/**
	 * 设置：媒体和技术使用
	 */
	 
	public void setMeitihejishushiyong(Float meitihejishushiyong) {
		this.meitihejishushiyong = meitihejishushiyong;
	}
	
	/**
	 * 获取：媒体和技术使用
	 */
	public Float getMeitihejishushiyong() {
		return meitihejishushiyong;
	}
				
	
	/**
	 * 设置：信息表达
	 */
	 
	public void setXinxibiaoda(Float xinxibiaoda) {
		this.xinxibiaoda = xinxibiaoda;
	}
	
	/**
	 * 获取：信息表达
	 */
	public Float getXinxibiaoda() {
		return xinxibiaoda;
	}
				
	
	/**
	 * 设置：教学组织
	 */
	 
	public void setJiaoxuezuzhi(Float jiaoxuezuzhi) {
		this.jiaoxuezuzhi = jiaoxuezuzhi;
	}
	
	/**
	 * 获取：教学组织
	 */
	public Float getJiaoxuezuzhi() {
		return jiaoxuezuzhi;
	}
				
	
	/**
	 * 设置：教学管理
	 */
	 
	public void setJiaoxueguanli(Float jiaoxueguanli) {
		this.jiaoxueguanli = jiaoxueguanli;
	}
	
	/**
	 * 获取：教学管理
	 */
	public Float getJiaoxueguanli() {
		return jiaoxueguanli;
	}
				
	
	/**
	 * 设置：教学评价
	 */
	 
	public void setJiaoxuepingjia(Float jiaoxuepingjia) {
		this.jiaoxuepingjia = jiaoxuepingjia;
	}
	
	/**
	 * 获取：教学评价
	 */
	public Float getJiaoxuepingjia() {
		return jiaoxuepingjia;
	}
				
	
	/**
	 * 设置：教学反思
	 */
	 
	public void setJiaoxuefansi(Float jiaoxuefansi) {
		this.jiaoxuefansi = jiaoxuefansi;
	}
	
	/**
	 * 获取：教学反思
	 */
	public Float getJiaoxuefansi() {
		return jiaoxuefansi;
	}
				
	
	/**
	 * 设置：教学研究
	 */
	 
	public void setJiaoxueyanjiu(Float jiaoxueyanjiu) {
		this.jiaoxueyanjiu = jiaoxueyanjiu;
	}
	
	/**
	 * 获取：教学研究
	 */
	public Float getJiaoxueyanjiu() {
		return jiaoxueyanjiu;
	}
				
	
	/**
	 * 设置：学术交流
	 */
	 
	public void setXueshujiaoliu(Float xueshujiaoliu) {
		this.xueshujiaoliu = xueshujiaoliu;
	}
	
	/**
	 * 获取：学术交流
	 */
	public Float getXueshujiaoliu() {
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
			
}
