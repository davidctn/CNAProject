package com.demo.grpcchat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.lognet.springboot.grpc.GRpcService;
import com.demo.grpcchat.proto.ChatGrpc;
import com.demo.grpcchat.proto.ChatOuterClass.Message;

import io.grpc.stub.StreamObserver;


@GRpcService
public class ChatService extends ChatGrpc.ChatImplBase{
	
	@Override
	public StreamObserver<Message> chatCall(final StreamObserver<Message> response){
		return new StreamObserver<Message>() {

			@Override
			public void onNext(Message value) {
				
			}

			@Override
			public void onError(Throwable t) {
				System.err.println("Error occurred : "+t.getMessage());
			}

			@Override
			public void onCompleted() {
				response.onCompleted();
			}
			
		};
	}

}
