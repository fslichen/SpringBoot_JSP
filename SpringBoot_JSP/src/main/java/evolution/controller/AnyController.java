package evolution.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AnyController {
	@Value("${message}")
	private String message;

	@GetMapping("/get")
	public String get(Map<String, Object> model) {
		model.put("time", new Date());
		model.put("message", this.message);
		// Goes to welcome.jsp under /WEB-INF/jsp folder.
		// The complete location should be "/WEB-INF/jsp/welcome.jsp"
		// See application.properties to get the settings for prefix and suffix.
		return "welcome";
	}
}
