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


import com.dao.QiyedongtaiDao;
import com.entity.QiyedongtaiEntity;
import com.service.QiyedongtaiService;
import com.entity.vo.QiyedongtaiVO;
import com.entity.view.QiyedongtaiView;

@Service("qiyedongtaiService")
public class QiyedongtaiServiceImpl extends ServiceImpl<QiyedongtaiDao, QiyedongtaiEntity> implements QiyedongtaiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiyedongtaiEntity> page = this.selectPage(
                new Query<QiyedongtaiEntity>(params).getPage(),
                new EntityWrapper<QiyedongtaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiyedongtaiEntity> wrapper) {
		  Page<QiyedongtaiView> page =new Query<QiyedongtaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QiyedongtaiVO> selectListVO(Wrapper<QiyedongtaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QiyedongtaiVO selectVO(Wrapper<QiyedongtaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QiyedongtaiView> selectListView(Wrapper<QiyedongtaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiyedongtaiView selectView(Wrapper<QiyedongtaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
