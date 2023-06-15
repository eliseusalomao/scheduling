package br.com.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import br.com.user.User;

public class UserTest {
	
	@Test
	void UserWithAllData() {
		User user = new User("Eliseu", "eliseu@gmail");
		Assert.assertTrue(user.getNome().length() != 0
						 && user.getEmail().length() != 0);
	}

}
