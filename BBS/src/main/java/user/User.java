package user;

public class User {
	// 접근 제한자 private: class 외부에서 사용 불가 //
	// 접근 제한자 public: class 내●외부 가리지 않고 사용 가능 //
	// 접근 제한자 protected: 같은 패키지 또는 자식 클래스에 사용가능 //
	// 접근 제한자 default: 같은 패키지에 소속된 클래스에서만 사용가능 //
	private String userID;
	private String userPassword;
	private String userName;
	private String userGender;
	private String userEmail;
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
}
