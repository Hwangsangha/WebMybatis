package com.example.demo.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.example.demo.domain.dto.board.BoardDTO;
import com.example.demo.mapper.BoardMapper;
import com.example.demo.service.BoardService;

@Service
public class BoardServiceProc implements BoardService {

	@Autowired
	private BoardMapper mapper;//DAO 역할

	@Autowired
	HttpServletRequest request;
	
	@Override
	public void findAll(Model model) {
		List<BoardDTO> result=mapper.findAll();
		model.addAttribute("list", result);
	}

	@Override
	public void save(BoardDTO dto) {
		mapper.save(dto);
	}

}
