package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiyedongtaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiyedongtaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiyedongtaiView;


/**
 * 企业动态
 *
 * @author 
 * @email 
 * @date 2021-04-17 19:05:34
 */
public interface QiyedongtaiService extends IService<QiyedongtaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiyedongtaiVO> selectListVO(Wrapper<QiyedongtaiEntity> wrapper);
   	
   	QiyedongtaiVO selectVO(@Param("ew") Wrapper<QiyedongtaiEntity> wrapper);
   	
   	List<QiyedongtaiView> selectListView(Wrapper<QiyedongtaiEntity> wrapper);
   	
   	QiyedongtaiView selectView(@Param("ew") Wrapper<QiyedongtaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiyedongtaiEntity> wrapper);
   	
}

