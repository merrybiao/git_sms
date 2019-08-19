package com.accp;

public class Person {
	 //发送验证码的请求路径URL
    private static final String
            SERVER_URL="https://api.netease.im/sms/sendtemplate.action";
    //网易云信分配的账号，请替换你在管理后台应用下申请的Appkey
    private static final String
            APP_KEY="9eb1b7d968095f786d7257701bc12b69";
    //网易云信分配的密钥，请替换你在管理后台应用下申请的appSecret
    private static final String APP_SECRET="90493a75775d";
    //随机数
    private static final String NONCE="123456";
    //短信模板ID
    private static final String TEMPLATEID="14823014";
    //手机号，接收者号码列表，JSONArray格式，限制接收者号码个数最多为100个
    private static final String MOBILES="['15827167589','15827167589']";
  
	
	private String name;
	
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
