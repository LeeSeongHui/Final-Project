package com.example.service.classunit;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.dto.ClassUnit;

@Service
public interface ClassUnitService {
    
    /* (1) ClassUnit 등록*/
	public int insertUnitOne(ClassUnit obj);
	
	/* (1-1) 클래스 가격 조회 => Unit 등록 시 추가 금액 등록을 위해 */
	public long selectPriceOne(long classcode); 
		
	/* (2) ClassUnit 전체 조회 */
	public List<ClassUnit> selectUnitList(long classcode);
	
	/* (2-1) ClassUnit 하나 조회 */
	public ClassUnit selectUnitOne(ClassUnit obj);
	
	/* (3) ClassUnit 수정 */
	public int updateUnitOne(ClassUnit obj);
	
	/* (4) ClassUnit 삭제 -> View 상에서만 삭제(DB에서는 삭제 불가) */
	public int updateUnitOneInactive(long no);
	
	/* (4-1) ClassUnit 일괄 삭제 */
    public int updateUnitBatchInactive(Map<String, Object> map);

}
