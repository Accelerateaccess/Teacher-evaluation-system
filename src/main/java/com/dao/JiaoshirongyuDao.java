package com.dao;

import com.entity.JiaoshirongyuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoshirongyuVO;
import com.entity.view.JiaoshirongyuView;


/**
 * 教师荣誉
 * 
 * @author 
 * @email 
 * @date 2021-04-30 12:49:21
 */
public interface JiaoshirongyuDao extends BaseMapper<JiaoshirongyuEntity> {
	
	List<JiaoshirongyuVO> selectListVO(@Param("ew") Wrapper<JiaoshirongyuEntity> wrapper);
	
	JiaoshirongyuVO selectVO(@Param("ew") Wrapper<JiaoshirongyuEntity> wrapper);
	
	List<JiaoshirongyuView> selectListView(@Param("ew") Wrapper<JiaoshirongyuEntity> wrapper);

	List<JiaoshirongyuView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoshirongyuEntity> wrapper);
	
	JiaoshirongyuView selectView(@Param("ew") Wrapper<JiaoshirongyuEntity> wrapper);
	
}
