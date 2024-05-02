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


import com.dao.QiyejieshaoDao;
import com.entity.QiyejieshaoEntity;
import com.service.QiyejieshaoService;
import com.entity.vo.QiyejieshaoVO;
import com.entity.view.QiyejieshaoView;

@Service("qiyejieshaoService")
public class QiyejieshaoServiceImpl extends ServiceImpl<QiyejieshaoDao, QiyejieshaoEntity> implements QiyejieshaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiyejieshaoEntity> page = this.selectPage(
                new Query<QiyejieshaoEntity>(params).getPage(),
                new EntityWrapper<QiyejieshaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiyejieshaoEntity> wrapper) {
		  Page<QiyejieshaoView> page =new Query<QiyejieshaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QiyejieshaoVO> selectListVO(Wrapper<QiyejieshaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QiyejieshaoVO selectVO(Wrapper<QiyejieshaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QiyejieshaoView> selectListView(Wrapper<QiyejieshaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiyejieshaoView selectView(Wrapper<QiyejieshaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
