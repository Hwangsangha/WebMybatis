package com.example.demo.service;

import org.springframework.ui.Model;

import com.example.demo.domain.dto.board.BoardDTO;

public interface BoardService {

	void findAll(Model model);

	void save(BoardDTO dto);

}
