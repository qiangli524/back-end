package com.yoooho.mall.service.convern;


import com.yoooho.mall.domain.Dept;
import com.yoooho.mall.service.dto.DeptSmallDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author Zheng Jie
* @date 2019-03-25
*/
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DeptSmallMapper extends BaseMapper<DeptSmallDTO, Dept> {

}
