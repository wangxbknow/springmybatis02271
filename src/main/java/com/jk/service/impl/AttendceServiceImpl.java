/**
 * Copyright (C), 2015-2019,
 * FileName: AttendceServiceImpl
 * Author:   王肖波
 * Date:     2019/2/27 21:43
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


package com.jk.service.impl;

import com.jk.dao.AttendsMapper;
import com.jk.entity.Attends;
import com.jk.service.AttendceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 王肖波
 * @create 2019/2/27
 * @since 1.0.0
 */
@Service
public class AttendceServiceImpl implements AttendceService{

    @Autowired
    private AttendsMapper attendsMapper;
    @Override
    public List<Attends> attendsList(Attends attends) {
        return attendsMapper.attendsList(attends);
    }
}
