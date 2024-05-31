package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JiaoshizipingEntity;
import com.entity.view.JiaoshizipingView;

import com.service.JiaoshizipingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 教师自评
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-30 12:49:21
 */
@RestController
@RequestMapping("/jiaoshiziping")
public class JiaoshizipingController {
    @Autowired
    private JiaoshizipingService jiaoshizipingService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiaoshizipingEntity jiaoshiziping, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			jiaoshiziping.setJiaoshizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiaoshizipingEntity> ew = new EntityWrapper<JiaoshizipingEntity>();
		PageUtils page = jiaoshizipingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaoshiziping), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiaoshizipingEntity jiaoshiziping, 
		HttpServletRequest request){
        EntityWrapper<JiaoshizipingEntity> ew = new EntityWrapper<JiaoshizipingEntity>();
		PageUtils page = jiaoshizipingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaoshiziping), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiaoshizipingEntity jiaoshiziping){
       	EntityWrapper<JiaoshizipingEntity> ew = new EntityWrapper<JiaoshizipingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiaoshiziping, "jiaoshiziping")); 
        return R.ok().put("data", jiaoshizipingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiaoshizipingEntity jiaoshiziping){
        EntityWrapper< JiaoshizipingEntity> ew = new EntityWrapper< JiaoshizipingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiaoshiziping, "jiaoshiziping")); 
		JiaoshizipingView jiaoshizipingView =  jiaoshizipingService.selectView(ew);
		return R.ok("查询教师自评成功").put("data", jiaoshizipingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiaoshizipingEntity jiaoshiziping = jiaoshizipingService.selectById(id);
        return R.ok().put("data", jiaoshiziping);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiaoshizipingEntity jiaoshiziping = jiaoshizipingService.selectById(id);
        return R.ok().put("data", jiaoshiziping);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiaoshizipingEntity jiaoshiziping, HttpServletRequest request){
    	jiaoshiziping.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiaoshiziping);

        jiaoshizipingService.insert(jiaoshiziping);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiaoshizipingEntity jiaoshiziping, HttpServletRequest request){
    	jiaoshiziping.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiaoshiziping);

        jiaoshizipingService.insert(jiaoshiziping);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody JiaoshizipingEntity jiaoshiziping, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiaoshiziping);
        jiaoshizipingService.updateById(jiaoshiziping);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiaoshizipingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<JiaoshizipingEntity> wrapper = new EntityWrapper<JiaoshizipingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			wrapper.eq("jiaoshizhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = jiaoshizipingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
