package com.yedam.collection;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;
import com.yedam.db2.EmployeeVO;

public class BoardDao {
	public List<Board> getBoardList() {
		List<Board> list = new ArrayList<>();
		list.add(new Board("제목1","내용1"));
		list.add(new Board("제목2","내용2"));
		list.add(new Board("제목3","내용3"));
		
		return list;
	}

}
