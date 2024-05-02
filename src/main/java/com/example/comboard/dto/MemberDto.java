package com.example.comboard.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberDto {
	private Long mno;
	private String name;
	private String id;
	private String pw;
	private String phone;
	private String addr;
}
