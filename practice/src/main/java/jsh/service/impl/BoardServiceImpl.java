package jsh.service.impl;

import java.util.List;

import jsh.domain.Board;
import jsh.mapper.BoardMapper;
import jsh.service.BoardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BoardServiceImpl implements BoardService {

	private BoardMapper boardmapper;

	@Override
	public void register(Board board) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Board read(Integer boardNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modify(Board board) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Integer boardNo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Board> list() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}



}
