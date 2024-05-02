package com.entity.vo;

import com.entity.QiyejieshaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 企业介绍
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-17 19:05:34
 */
public class QiyejieshaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 介绍类型
	 */
	
	private String jieshaoleixing;
		
	/**
	 * 介绍目标
	 */
	
	private String jieshaomubiao;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 企业名称
	 */
	
	private String qiyemingcheng;
		
	/**
	 * 企业类型
	 */
	
	private String qiyeleixing;
		
	/**
	 * 地址
	 */
	
	private String dizhi;
		
	/**
	 * 创立时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chuanglishijian;
		
	/**
	 * 具体介绍
	 */
	
	private String jutijieshao;
		
	/**
	 * 发展历程
	 */
	
	private String fazhanlicheng;
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：介绍类型
	 */
	 
	public void setJieshaoleixing(String jieshaoleixing) {
		this.jieshaoleixing = jieshaoleixing;
	}
	
	/**
	 * 获取：介绍类型
	 */
	public String getJieshaoleixing() {
		return jieshaoleixing;
	}
				
	
	/**
	 * 设置：介绍目标
	 */
	 
	public void setJieshaomubiao(String jieshaomubiao) {
		this.jieshaomubiao = jieshaomubiao;
	}
	
	/**
	 * 获取：介绍目标
	 */
	public String getJieshaomubiao() {
		return jieshaomubiao;
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
	 * 设置：企业名称
	 */
	 
	public void setQiyemingcheng(String qiyemingcheng) {
		this.qiyemingcheng = qiyemingcheng;
	}
	
	/**
	 * 获取：企业名称
	 */
	public String getQiyemingcheng() {
		return qiyemingcheng;
	}
				
	
	/**
	 * 设置：企业类型
	 */
	 
	public void setQiyeleixing(String qiyeleixing) {
		this.qiyeleixing = qiyeleixing;
	}
	
	/**
	 * 获取：企业类型
	 */
	public String getQiyeleixing() {
		return qiyeleixing;
	}
				
	
	/**
	 * 设置：地址
	 */
	 
	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}
	
	/**
	 * 获取：地址
	 */
	public String getDizhi() {
		return dizhi;
	}
				
	
	/**
	 * 设置：创立时间
	 */
	 
	public void setChuanglishijian(Date chuanglishijian) {
		this.chuanglishijian = chuanglishijian;
	}
	
	/**
	 * 获取：创立时间
	 */
	public Date getChuanglishijian() {
		return chuanglishijian;
	}
				
	
	/**
	 * 设置：具体介绍
	 */
	 
	public void setJutijieshao(String jutijieshao) {
		this.jutijieshao = jutijieshao;
	}
	
	/**
	 * 获取：具体介绍
	 */
	public String getJutijieshao() {
		return jutijieshao;
	}
				
	
	/**
	 * 设置：发展历程
	 */
	 
	public void setFazhanlicheng(String fazhanlicheng) {
		this.fazhanlicheng = fazhanlicheng;
	}
	
	/**
	 * 获取：发展历程
	 */
	public String getFazhanlicheng() {
		return fazhanlicheng;
	}
			
}
