package com.dao;

import com.entity.ZhuanjiapingfenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuanjiapingfenVO;
import com.entity.view.ZhuanjiapingfenView;


/**
 * 专家评分
 * 
 * @author 
 * @email 
 * @date 2021-04-30 12:49:21
 */
public interface ZhuanjiapingfenDao extends BaseMapper<ZhuanjiapingfenEntity> {
	
	List<ZhuanjiapingfenVO> selectListVO(@Param("ew") Wrapper<ZhuanjiapingfenEntity> wrapper);
	
	ZhuanjiapingfenVO selectVO(@Param("ew") Wrapper<ZhuanjiapingfenEntity> wrapper);
	
	List<ZhuanjiapingfenView> selectListView(@Param("ew") Wrapper<ZhuanjiapingfenEntity> wrapper);

	List<ZhuanjiapingfenView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuanjiapingfenEntity> wrapper);
	
	ZhuanjiapingfenView selectView(@Param("ew") Wrapper<ZhuanjiapingfenEntity> wrapper);
	
}
