package com.example.consumingWebService;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    private String anime;
	private String character;
	private String quote;

	public Quote() {
	}

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public String getAnime() {
		return anime;
	}

	public void setAnime(String anime) {
		this.anime = anime;
	}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

	@Override
	public String toString() {
		return "Quote{" +
				"anime='" + anime + '\'' +
				", character='" + character + '\'' +
				", quote='" + quote + '\'' +
				'}';
	}
}
