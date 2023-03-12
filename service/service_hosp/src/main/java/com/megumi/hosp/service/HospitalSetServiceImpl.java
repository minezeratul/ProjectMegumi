package com.megumi.hosp.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.megumi.hosp.mapper.HospitalSetMapper;
import com.megumi.model.hosp.HospitalSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Minzeratul
 * @date 2023/3/12 15:16
 */

@Service
public class HospitalSetServiceImpl extends ServiceImpl<HospitalSetMapper, HospitalSet> implements HospitalSetService {

    @Autowired
    private HospitalSetMapper hospitalSetMapper;

}
