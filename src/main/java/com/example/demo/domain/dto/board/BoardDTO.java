package com.example.demo.domain.dto.board;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class BoardDTO {
	private long bno;
	private String subject;
	private String content;
	private String creater;
	private int readCount;
	private LocalDateTime createdDate;
	private LocalDateTime updatedDate;
}
