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


import com.dao.ZhuanjiapingfenDao;
import com.entity.ZhuanjiapingfenEntity;
import com.service.ZhuanjiapingfenService;
import com.entity.vo.ZhuanjiapingfenVO;
import com.entity.view.ZhuanjiapingfenView;

@Service("zhuanjiapingfenService")
public class ZhuanjiapingfenServiceImpl extends ServiceImpl<ZhuanjiapingfenDao, ZhuanjiapingfenEntity> implements ZhuanjiapingfenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuanjiapingfenEntity> page = this.selectPage(
                new Query<ZhuanjiapingfenEntity>(params).getPage(),
                new EntityWrapper<ZhuanjiapingfenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuanjiapingfenEntity> wrapper) {
		  Page<ZhuanjiapingfenView> page =new Query<ZhuanjiapingfenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhuanjiapingfenVO> selectListVO(Wrapper<ZhuanjiapingfenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuanjiapingfenVO selectVO(Wrapper<ZhuanjiapingfenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuanjiapingfenView> selectListView(Wrapper<ZhuanjiapingfenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuanjiapingfenView selectView(Wrapper<ZhuanjiapingfenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
