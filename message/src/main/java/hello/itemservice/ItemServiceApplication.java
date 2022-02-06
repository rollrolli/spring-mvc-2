package hello.itemservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;

@SpringBootApplication
public class ItemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemServiceApplication.class, args);
	}

	/*
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasenames("messages", "errors");
		// /resources/message.properties 와 /resources/errors.properties 를 읽어옴
		// 국제화 기능 사용 시에는 messages_ko.properties, messages_en.properties 와 같이 뒤에 언어 정보를 주면 됨
		messageSource.setDefaultEncoding("UTF-8");
		return messageSource;
	}
	*/

	// 스프링 부트를 쓰면 MessageSource 를 자동으로 빈으로 등록해준다.
	// basename 은 application.properties 에 등록해주면 된다.
}
