package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoshirongyuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoshirongyuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoshirongyuView;


/**
 * 教师荣誉
 *
 * @author 
 * @email 
 * @date 2021-04-30 12:49:21
 */
public interface JiaoshirongyuService extends IService<JiaoshirongyuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoshirongyuVO> selectListVO(Wrapper<JiaoshirongyuEntity> wrapper);
   	
   	JiaoshirongyuVO selectVO(@Param("ew") Wrapper<JiaoshirongyuEntity> wrapper);
   	
   	List<JiaoshirongyuView> selectListView(Wrapper<JiaoshirongyuEntity> wrapper);
   	
   	JiaoshirongyuView selectView(@Param("ew") Wrapper<JiaoshirongyuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoshirongyuEntity> wrapper);
   	
}

