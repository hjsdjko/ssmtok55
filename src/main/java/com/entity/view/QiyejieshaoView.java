package com.entity.view;

import com.entity.QiyejieshaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 企业介绍
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-17 19:05:34
 */
@TableName("qiyejieshao")
public class QiyejieshaoView  extends QiyejieshaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QiyejieshaoView(){
	}
 
 	public QiyejieshaoView(QiyejieshaoEntity qiyejieshaoEntity){
 	try {
			BeanUtils.copyProperties(this, qiyejieshaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
