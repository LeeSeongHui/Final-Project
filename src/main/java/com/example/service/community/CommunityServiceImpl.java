package com.example.service.community;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Community;
import com.example.entity.CommunityView;
import com.example.mapper.CommunityMapper;
import com.example.repository.CommunityRepository;
import com.example.repository.CommunityViewRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CommunityServiceImpl implements CommunityService {

    @Autowired CommunityRepository cRepository;
    @Autowired CommunityViewRepository cViewRepository;
    @Autowired CommunityMapper cMapper;
    
    @Override
    public int insertCommnuityOne(Community obj) {
        try {
            cRepository.save(obj);
            return 1;
        }
        catch(Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override
    public List<CommunityView> selectCommunityList(long first, long last) {
        try {
            return cViewRepository.findByRnumBetweenOrderByRnumAsc(first, last);
            // return cRepository.selectOrderByNoDescPaging(first, last);
        }
        catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public long countCommunityList() {
        try {
            return cRepository.countBy();
        }
        catch(Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override
    public Community selectCommunityOne(long no) {
        try {
            return cRepository.findById(no).orElse(null);
        }
        catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public int updatehit(long no) {
        try {
            return cMapper.updatehit(no);
            
        }
        catch(Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

  




    

}
