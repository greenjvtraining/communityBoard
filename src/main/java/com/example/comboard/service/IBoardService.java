package com.example.comboard.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.comboard.dto.BoardDto;

@Service
public interface IBoardService {

	public List<BoardDto> getBoardList();
	public BoardDto getBoard(Long bno);
}
