package com.dao;

import com.entity.QiyedongtaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiyedongtaiVO;
import com.entity.view.QiyedongtaiView;


/**
 * 企业动态
 * 
 * @author 
 * @email 
 * @date 2021-04-17 19:05:34
 */
public interface QiyedongtaiDao extends BaseMapper<QiyedongtaiEntity> {
	
	List<QiyedongtaiVO> selectListVO(@Param("ew") Wrapper<QiyedongtaiEntity> wrapper);
	
	QiyedongtaiVO selectVO(@Param("ew") Wrapper<QiyedongtaiEntity> wrapper);
	
	List<QiyedongtaiView> selectListView(@Param("ew") Wrapper<QiyedongtaiEntity> wrapper);

	List<QiyedongtaiView> selectListView(Pagination page,@Param("ew") Wrapper<QiyedongtaiEntity> wrapper);
	
	QiyedongtaiView selectView(@Param("ew") Wrapper<QiyedongtaiEntity> wrapper);
	
}
