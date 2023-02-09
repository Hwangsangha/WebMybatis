package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.domain.dto.board.BoardDTO;
import com.example.demo.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	@GetMapping("/boards")
	public String list(Model model) {
		System.out.println("service:"+service);
		service.findAll(model);
		
		return "board/list";
	}
	
	@GetMapping("/boards/registration")
	public String write() {
		return "board/write";
	}
	
	@PostMapping("/boards/registration")
	public String write(BoardDTO dto) {
		System.out.println(">>>>:"+dto);
		
		service.save(dto);
		
		return "redirect:/boards";
	}

}
