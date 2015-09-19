package io.github.movax10.controller;

import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import io.github.movax10.service.ISublateService;
import io.github.movax10.service.dto.TranslationDto;

@Controller
@Scope("request")
public class SublateController {
	
    @Autowired
    private DozerBeanMapper mapper;

    @Autowired
    private ISublateService sublateService;

	
    @RequestMapping(value = "/sublate", method = RequestMethod.GET)
    public @ResponseBody List<TranslationDto> usersList() {

        return sublateService.getTranslations();
    }
}
