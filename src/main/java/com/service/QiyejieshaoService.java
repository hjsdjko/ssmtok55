package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiyejieshaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiyejieshaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiyejieshaoView;


/**
 * 企业介绍
 *
 * @author 
 * @email 
 * @date 2021-04-17 19:05:34
 */
public interface QiyejieshaoService extends IService<QiyejieshaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiyejieshaoVO> selectListVO(Wrapper<QiyejieshaoEntity> wrapper);
   	
   	QiyejieshaoVO selectVO(@Param("ew") Wrapper<QiyejieshaoEntity> wrapper);
   	
   	List<QiyejieshaoView> selectListView(Wrapper<QiyejieshaoEntity> wrapper);
   	
   	QiyejieshaoView selectView(@Param("ew") Wrapper<QiyejieshaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiyejieshaoEntity> wrapper);
   	
}

