package io.github.movax10.service.dto;

import org.dozer.Mapping;

public class TranslationDto {

	@Mapping("word")
	private String word;
	
	@Mapping("count")
	private Integer count;

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
}
