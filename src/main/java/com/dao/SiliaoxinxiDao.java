package com.dao;

import com.entity.SiliaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SiliaoxinxiVO;
import com.entity.view.SiliaoxinxiView;


/**
 * 私聊信息
 * 
 * @author 
 * @email 
 * @date 2023-03-31 14:50:08
 */
public interface SiliaoxinxiDao extends BaseMapper<SiliaoxinxiEntity> {
	
	List<SiliaoxinxiVO> selectListVO(@Param("ew") Wrapper<SiliaoxinxiEntity> wrapper);
	
	SiliaoxinxiVO selectVO(@Param("ew") Wrapper<SiliaoxinxiEntity> wrapper);
	
	List<SiliaoxinxiView> selectListView(@Param("ew") Wrapper<SiliaoxinxiEntity> wrapper);

	List<SiliaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<SiliaoxinxiEntity> wrapper);
	
	SiliaoxinxiView selectView(@Param("ew") Wrapper<SiliaoxinxiEntity> wrapper);
	

}
