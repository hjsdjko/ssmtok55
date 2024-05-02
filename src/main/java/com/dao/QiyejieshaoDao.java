package com.dao;

import com.entity.QiyejieshaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiyejieshaoVO;
import com.entity.view.QiyejieshaoView;


/**
 * 企业介绍
 * 
 * @author 
 * @email 
 * @date 2021-04-17 19:05:34
 */
public interface QiyejieshaoDao extends BaseMapper<QiyejieshaoEntity> {
	
	List<QiyejieshaoVO> selectListVO(@Param("ew") Wrapper<QiyejieshaoEntity> wrapper);
	
	QiyejieshaoVO selectVO(@Param("ew") Wrapper<QiyejieshaoEntity> wrapper);
	
	List<QiyejieshaoView> selectListView(@Param("ew") Wrapper<QiyejieshaoEntity> wrapper);

	List<QiyejieshaoView> selectListView(Pagination page,@Param("ew") Wrapper<QiyejieshaoEntity> wrapper);
	
	QiyejieshaoView selectView(@Param("ew") Wrapper<QiyejieshaoEntity> wrapper);
	
}
