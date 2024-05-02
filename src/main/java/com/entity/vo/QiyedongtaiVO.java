package com.entity.vo;

import com.entity.QiyedongtaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 企业动态
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-17 19:05:34
 */
public class QiyedongtaiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 动态图片
	 */
	
	private String dongtaitupian;
		
	/**
	 * 动态类型
	 */
	
	private String dongtaileixing;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 动态内容
	 */
	
	private String dongtaineirong;
				
	
	/**
	 * 设置：动态图片
	 */
	 
	public void setDongtaitupian(String dongtaitupian) {
		this.dongtaitupian = dongtaitupian;
	}
	
	/**
	 * 获取：动态图片
	 */
	public String getDongtaitupian() {
		return dongtaitupian;
	}
				
	
	/**
	 * 设置：动态类型
	 */
	 
	public void setDongtaileixing(String dongtaileixing) {
		this.dongtaileixing = dongtaileixing;
	}
	
	/**
	 * 获取：动态类型
	 */
	public String getDongtaileixing() {
		return dongtaileixing;
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
	 * 设置：动态内容
	 */
	 
	public void setDongtaineirong(String dongtaineirong) {
		this.dongtaineirong = dongtaineirong;
	}
	
	/**
	 * 获取：动态内容
	 */
	public String getDongtaineirong() {
		return dongtaineirong;
	}
			
}
