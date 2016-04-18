package io.github.movax10.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import io.github.movax10.service.dto.TranslationDto;

@Service
public class SublateService implements ISublateService{

	public List<TranslationDto> getTranslations() {
		List<TranslationDto> translationList = new ArrayList<TranslationDto>();
		TranslationDto translation1 = new TranslationDto();
		translation1.setWord("apple");
		translation1.setCount(10);
		
		TranslationDto translation2 = new TranslationDto();
		translation2.setWord("tree");
		translation2.setCount(36);
		
		translationList.add(translation1);
		translationList.add(translation2);
		return translationList;
	}

}
