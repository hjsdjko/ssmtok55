package com.entity.model;

import com.entity.QiyexiangceEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 企业相册
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-17 19:05:34
 */
public class QiyexiangceModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 相册类型
	 */
	
	private String xiangceleixing;
		
	/**
	 * 封面图
	 */
	
	private String fengmiantu;
		
	/**
	 * 部门名
	 */
	
	private String bumenming;
		
	/**
	 * 简述
	 */
	
	private String jianshu;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 相册图片
	 */
	
	private String xiangcetupian;
				
	
	/**
	 * 设置：相册类型
	 */
	 
	public void setXiangceleixing(String xiangceleixing) {
		this.xiangceleixing = xiangceleixing;
	}
	
	/**
	 * 获取：相册类型
	 */
	public String getXiangceleixing() {
		return xiangceleixing;
	}
				
	
	/**
	 * 设置：封面图
	 */
	 
	public void setFengmiantu(String fengmiantu) {
		this.fengmiantu = fengmiantu;
	}
	
	/**
	 * 获取：封面图
	 */
	public String getFengmiantu() {
		return fengmiantu;
	}
				
	
	/**
	 * 设置：部门名
	 */
	 
	public void setBumenming(String bumenming) {
		this.bumenming = bumenming;
	}
	
	/**
	 * 获取：部门名
	 */
	public String getBumenming() {
		return bumenming;
	}
				
	
	/**
	 * 设置：简述
	 */
	 
	public void setJianshu(String jianshu) {
		this.jianshu = jianshu;
	}
	
	/**
	 * 获取：简述
	 */
	public String getJianshu() {
		return jianshu;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：相册图片
	 */
	 
	public void setXiangcetupian(String xiangcetupian) {
		this.xiangcetupian = xiangcetupian;
	}
	
	/**
	 * 获取：相册图片
	 */
	public String getXiangcetupian() {
		return xiangcetupian;
	}
			
}
