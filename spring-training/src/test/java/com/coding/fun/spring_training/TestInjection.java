package com.coding.fun.spring_training;

import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.Test;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestInjection extends UnitTestBase{
	
	@Test
	public void testSetter() {
		InjectionService service = super.getBean("injectionService");
	}

}
