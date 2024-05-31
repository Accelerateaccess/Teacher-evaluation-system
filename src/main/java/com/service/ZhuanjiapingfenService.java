package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuanjiapingfenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuanjiapingfenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuanjiapingfenView;


/**
 * 专家评分
 *
 * @author 
 * @email 
 * @date 2021-04-30 12:49:21
 */
public interface ZhuanjiapingfenService extends IService<ZhuanjiapingfenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuanjiapingfenVO> selectListVO(Wrapper<ZhuanjiapingfenEntity> wrapper);
   	
   	ZhuanjiapingfenVO selectVO(@Param("ew") Wrapper<ZhuanjiapingfenEntity> wrapper);
   	
   	List<ZhuanjiapingfenView> selectListView(Wrapper<ZhuanjiapingfenEntity> wrapper);
   	
   	ZhuanjiapingfenView selectView(@Param("ew") Wrapper<ZhuanjiapingfenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuanjiapingfenEntity> wrapper);
   	
}

