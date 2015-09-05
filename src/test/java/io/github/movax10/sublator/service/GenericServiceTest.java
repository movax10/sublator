package io.github.movax10.sublator.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import io.github.movax10.sublator.config.JPAConfig;
import io.github.movax10.sublator.config.ServiceConfig;
import io.github.movax10.sublator.persist.entity.Authority;
import io.github.movax10.sublator.persist.entity.User;
import io.github.movax10.sublator.service.dto.AuthorityDto;
import io.github.movax10.sublator.service.dto.UserDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {JPAConfig.class, ServiceConfig.class })
public class GenericServiceTest {
	
	@Autowired
	private GenericService<User, UserDto, Long> userService;
	
	@Autowired
    private GenericService<Authority, AuthorityDto, Long> authorityService;
	
	@Test
	public void testFindOneUser() {
		UserDto userDto = userService.findOne(1L);
		Assert.assertNotNull(userDto);
		Assert.assertEquals(1, userDto.getId().longValue());
	}
	
	@Test
    public void testFindOneAuthority() {
        AuthorityDto authorityDto = authorityService.findOne(1L);
        Assert.assertNotNull(authorityDto);
        Assert.assertEquals(1, authorityDto.getId().longValue());
    }
	
	@Test
    public void testFindAll() {
        List<AuthorityDto> authorities = authorityService.findAll();
        Assert.assertFalse(authorities.isEmpty());
    }
	
	@Test
    public void testSave() {
        AuthorityDto authorityDto = new AuthorityDto();
        authorityDto.setName("test authority");
    }

}
