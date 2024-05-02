package com.example.comboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.comboard.dao.IBoardDao;
import com.example.comboard.dto.BoardDto;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class BoardService implements IBoardService{
	
	@Autowired
	private IBoardDao boardDao;
	
	@Override
	public List<BoardDto> getBoardList() {
		log.info("BoardService...list...");
		return boardDao.selectAll();
	}

	@Override
	public BoardDto getBoard(Long bno) {
		log.info("BoardService...getBoard...");
		return boardDao.selectOne(bno);
	}
}
