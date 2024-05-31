package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoshizipingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoshizipingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoshizipingView;


/**
 * 教师自评
 *
 * @author 
 * @email 
 * @date 2021-04-30 12:49:21
 */
public interface JiaoshizipingService extends IService<JiaoshizipingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoshizipingVO> selectListVO(Wrapper<JiaoshizipingEntity> wrapper);
   	
   	JiaoshizipingVO selectVO(@Param("ew") Wrapper<JiaoshizipingEntity> wrapper);
   	
   	List<JiaoshizipingView> selectListView(Wrapper<JiaoshizipingEntity> wrapper);
   	
   	JiaoshizipingView selectView(@Param("ew") Wrapper<JiaoshizipingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoshizipingEntity> wrapper);
   	
}

