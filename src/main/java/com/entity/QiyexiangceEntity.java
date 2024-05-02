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
 * 企业相册
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-17 19:05:34
 */
@TableName("qiyexiangce")
public class QiyexiangceEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QiyexiangceEntity() {
		
	}
	
	public QiyexiangceEntity(T t) {
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
	 * 相册名称
	 */
					
	private String xiangcemingcheng;
	
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
	 * 设置：相册名称
	 */
	public void setXiangcemingcheng(String xiangcemingcheng) {
		this.xiangcemingcheng = xiangcemingcheng;
	}
	/**
	 * 获取：相册名称
	 */
	public String getXiangcemingcheng() {
		return xiangcemingcheng;
	}
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
