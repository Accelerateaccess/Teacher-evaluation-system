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


import com.dao.JiaoshirongyuDao;
import com.entity.JiaoshirongyuEntity;
import com.service.JiaoshirongyuService;
import com.entity.vo.JiaoshirongyuVO;
import com.entity.view.JiaoshirongyuView;

@Service("jiaoshirongyuService")
public class JiaoshirongyuServiceImpl extends ServiceImpl<JiaoshirongyuDao, JiaoshirongyuEntity> implements JiaoshirongyuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoshirongyuEntity> page = this.selectPage(
                new Query<JiaoshirongyuEntity>(params).getPage(),
                new EntityWrapper<JiaoshirongyuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoshirongyuEntity> wrapper) {
		  Page<JiaoshirongyuView> page =new Query<JiaoshirongyuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoshirongyuVO> selectListVO(Wrapper<JiaoshirongyuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoshirongyuVO selectVO(Wrapper<JiaoshirongyuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoshirongyuView> selectListView(Wrapper<JiaoshirongyuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoshirongyuView selectView(Wrapper<JiaoshirongyuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
