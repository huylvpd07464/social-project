package com.social.service;

import java.util.List;

import com.social.models.Message;
import com.social.models.User;

public interface MessageService {
	public Message createMessage(User user, Integer chatId, Message req) throws Exception;
	
	public List<Message> findChatsMessages(Integer chatId) throws Exception;
}
