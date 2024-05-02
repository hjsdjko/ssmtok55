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
 * 企业动态
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-17 19:05:34
 */
@TableName("qiyedongtai")
public class QiyedongtaiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QiyedongtaiEntity() {
		
	}
	
	public QiyedongtaiEntity(T t) {
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
	 * 动态标题
	 */
					
	private String dongtaibiaoti;
	
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
	 * 设置：动态标题
	 */
	public void setDongtaibiaoti(String dongtaibiaoti) {
		this.dongtaibiaoti = dongtaibiaoti;
	}
	/**
	 * 获取：动态标题
	 */
	public String getDongtaibiaoti() {
		return dongtaibiaoti;
	}
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
