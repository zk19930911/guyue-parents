package com.gy.designpattern.bridge.message;

/**
 * @ClassName MessageSMS
 * @Description TOOD
 * @Author lipeng
 * @Date 2020-02-23 23:46
 */
public class MessageSys implements MessageImplementor {

	@Override
	public void send(String message, String toUser) {
		System.out.println(" 向" + toUser + ", 发送系统消息:" + message);
	}
}
