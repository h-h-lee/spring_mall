package kr.spring.adminInfo.dao;

import kr.spring.login.vo.LoginVO;

public interface AdminInfoMapper {
	
	public LoginVO adminInfo(String mem_id); //내정보
	
	public int updateInfoAction(LoginVO loginVO); //내정보 수정

}
