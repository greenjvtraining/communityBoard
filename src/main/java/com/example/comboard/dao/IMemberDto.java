package com.example.comboard.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.comboard.dto.MemberDto;

@Mapper
public interface IMemberDto {
	public List<MemberDto> getMemberList();
	public MemberDto getMember(Long mno);
}
