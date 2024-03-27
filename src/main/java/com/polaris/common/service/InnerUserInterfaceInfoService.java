package com.polaris.common.service;

import com.polaris.common.entity.UserInterfaceInfo;


/**
* @author polaris
* @description 针对表【user_interface_info(用户调用接口关系表)】的数据库操作Service
* @createDate 2024-03-21 21:31:26
*/
public interface InnerUserInterfaceInfoService {
    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);
    boolean invokeCount(long interfaceInfoId,long userId);
}
