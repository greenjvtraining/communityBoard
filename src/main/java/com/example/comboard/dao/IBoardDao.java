package com.example.comboard.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.comboard.dto.BoardDto;

@Mapper
public interface IBoardDao {
	
	public List<BoardDto> selectAll();
	public BoardDto selectOne(Long bno);
}
