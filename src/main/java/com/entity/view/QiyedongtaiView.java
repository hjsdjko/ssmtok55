package com.entity.view;

import com.entity.QiyedongtaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 企业动态
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-17 19:05:34
 */
@TableName("qiyedongtai")
public class QiyedongtaiView  extends QiyedongtaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QiyedongtaiView(){
	}
 
 	public QiyedongtaiView(QiyedongtaiEntity qiyedongtaiEntity){
 	try {
			BeanUtils.copyProperties(this, qiyedongtaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
