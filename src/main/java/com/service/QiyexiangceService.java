package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiyexiangceEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiyexiangceVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiyexiangceView;


/**
 * 企业相册
 *
 * @author 
 * @email 
 * @date 2021-04-17 19:05:34
 */
public interface QiyexiangceService extends IService<QiyexiangceEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiyexiangceVO> selectListVO(Wrapper<QiyexiangceEntity> wrapper);
   	
   	QiyexiangceVO selectVO(@Param("ew") Wrapper<QiyexiangceEntity> wrapper);
   	
   	List<QiyexiangceView> selectListView(Wrapper<QiyexiangceEntity> wrapper);
   	
   	QiyexiangceView selectView(@Param("ew") Wrapper<QiyexiangceEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiyexiangceEntity> wrapper);
   	
}

