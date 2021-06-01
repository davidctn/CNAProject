package com.demo.grpcchatclient;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.demo.grpcchat.proto.ChatGrpc;
import com.demo.grpcchat.proto.ChatOuterClass.Message;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

@Component("chatClient")
public class ChatClient {
	
	ChatGrpc.ChatStub stub;


	@PostConstruct
	public void init() {
		try {
			ManagedChannel managedChannel = ManagedChannelBuilder
					.forAddress("localhost", 6565).usePlaintext().build();
			stub = ChatGrpc.newStub(managedChannel);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
