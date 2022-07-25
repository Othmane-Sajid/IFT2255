package model.enums;

public enum AccountState {
	valid("v", "valide"),
	invalid("i", "invalide"),
	suspended("s", "suspendu");


	private String key;
	private String value;


	private AccountState(String key, String value) {
		this.key = key;
		this.value = value;
	}


	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
