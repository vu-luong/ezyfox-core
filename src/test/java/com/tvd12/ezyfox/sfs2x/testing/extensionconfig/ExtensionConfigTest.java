package com.tvd12.ezyfox.sfs2x.testing.extensionconfig;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tvd12.ezyfox.core.annotation.AppContextConfiguration;
import com.tvd12.ezyfox.core.config.ExtensionConfiguration;
import com.tvd12.ezyfox.core.structure.RequestResponseClass;

@ContextConfiguration(classes = {TestAppConfig.class})
@AppContextConfiguration(clazz = TestAppConfig.class)
public class ExtensionConfigTest extends AbstractTestNGSpringContextTests {
	
	protected static final Logger LOGGER
			= LoggerFactory.getLogger(ExtensionConfigTest.class);

	@Autowired
	private ExtensionConfiguration extensionConfig;
	
	@BeforeMethod
	public void init() {
		extensionConfig.load(getClass());
	}
	
	@Test
	public void testFindValidExtensionUser() {
		assertEquals(TestUser.class, extensionConfig.getUserClass());
	}
	
	@Test
	public void testFindValidClientActionListeners() {
		List<RequestResponseClass> listeners = extensionConfig.getRequestResponseClientClasses();
		assertEquals(3, listeners.size());
		for(RequestResponseClass listener : listeners) {
			String command = listener.getRequestCommand();
			assertNotNull(command);
			LOGGER.info("client request command = " + command);
		}
	}
}
