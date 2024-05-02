package com.dao;

import com.entity.QiyexiangceEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiyexiangceVO;
import com.entity.view.QiyexiangceView;


/**
 * 企业相册
 * 
 * @author 
 * @email 
 * @date 2021-04-17 19:05:34
 */
public interface QiyexiangceDao extends BaseMapper<QiyexiangceEntity> {
	
	List<QiyexiangceVO> selectListVO(@Param("ew") Wrapper<QiyexiangceEntity> wrapper);
	
	QiyexiangceVO selectVO(@Param("ew") Wrapper<QiyexiangceEntity> wrapper);
	
	List<QiyexiangceView> selectListView(@Param("ew") Wrapper<QiyexiangceEntity> wrapper);

	List<QiyexiangceView> selectListView(Pagination page,@Param("ew") Wrapper<QiyexiangceEntity> wrapper);
	
	QiyexiangceView selectView(@Param("ew") Wrapper<QiyexiangceEntity> wrapper);
	
}
