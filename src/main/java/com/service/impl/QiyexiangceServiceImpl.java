package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.QiyexiangceDao;
import com.entity.QiyexiangceEntity;
import com.service.QiyexiangceService;
import com.entity.vo.QiyexiangceVO;
import com.entity.view.QiyexiangceView;

@Service("qiyexiangceService")
public class QiyexiangceServiceImpl extends ServiceImpl<QiyexiangceDao, QiyexiangceEntity> implements QiyexiangceService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiyexiangceEntity> page = this.selectPage(
                new Query<QiyexiangceEntity>(params).getPage(),
                new EntityWrapper<QiyexiangceEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiyexiangceEntity> wrapper) {
		  Page<QiyexiangceView> page =new Query<QiyexiangceView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QiyexiangceVO> selectListVO(Wrapper<QiyexiangceEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QiyexiangceVO selectVO(Wrapper<QiyexiangceEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QiyexiangceView> selectListView(Wrapper<QiyexiangceEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiyexiangceView selectView(Wrapper<QiyexiangceEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
