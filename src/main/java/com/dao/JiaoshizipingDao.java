package com.dao;

import com.entity.JiaoshizipingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoshizipingVO;
import com.entity.view.JiaoshizipingView;


/**
 * 教师自评
 * 
 * @author 
 * @email 
 * @date 2021-04-30 12:49:21
 */
public interface JiaoshizipingDao extends BaseMapper<JiaoshizipingEntity> {
	
	List<JiaoshizipingVO> selectListVO(@Param("ew") Wrapper<JiaoshizipingEntity> wrapper);
	
	JiaoshizipingVO selectVO(@Param("ew") Wrapper<JiaoshizipingEntity> wrapper);
	
	List<JiaoshizipingView> selectListView(@Param("ew") Wrapper<JiaoshizipingEntity> wrapper);

	List<JiaoshizipingView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoshizipingEntity> wrapper);
	
	JiaoshizipingView selectView(@Param("ew") Wrapper<JiaoshizipingEntity> wrapper);
	
}
