package com.oracle.web.service;

import java.util.List;

import com.oracle.web.bean.Monster;
import com.oracle.web.bean.PageBean;
import com.oracle.web.bean.SubMonster;

public interface MonsterService {

	int save(Monster monster);

	void delete(Monster monster);

	Monster queryOneMonster(Integer monsterId);

	void update(Monster monster);

	List<SubMonster> Bypage(int i);

	List<SubMonster> list();
	
	int getCounts();

	PageBean<SubMonster> selectAllByPageHelper(Integer pageNow);

}
