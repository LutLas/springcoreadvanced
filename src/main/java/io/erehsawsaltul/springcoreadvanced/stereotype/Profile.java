package io.erehsawsaltul.springcoreadvanced.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {
	@Value("Java Architect and Instructor")
	private String title;
	@Value("HacksPWAZO")
	private String company;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "[title=" + title + ", company=" + company + "]";
	}

}
