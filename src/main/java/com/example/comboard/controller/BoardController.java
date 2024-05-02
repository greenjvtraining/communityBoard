package com.example.comboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.comboard.service.IBoardService;

import lombok.extern.log4j.Log4j2;

@Controller
@RequestMapping("/board")
@Log4j2
public class BoardController {

	@Autowired
	private IBoardService boardService;
	
	@RequestMapping("/list")
	public String list(Model model) {
		log.info("list.......");
		
		model.addAttribute("list", boardService.getBoardList());
		return "board/list";
	}
	
	@RequestMapping("/detail/{bno}")
	public String detail(@PathVariable("bno") Long bno, Model model) {
		log.info("detail.......bno : " + bno);
		model.addAttribute("board", boardService.getBoard(bno));
		
		return "board/detail";
		
	}
}
