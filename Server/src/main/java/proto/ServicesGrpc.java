package proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: ChatProto.proto")
public final class ServicesGrpc {

  private ServicesGrpc() {}

  public static final String SERVICE_NAME = "Services";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.ChatProto.Request,
      proto.ChatProto.Response> getSendRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendRequest",
      requestType = proto.ChatProto.Request.class,
      responseType = proto.ChatProto.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.ChatProto.Request,
      proto.ChatProto.Response> getSendRequestMethod() {
    io.grpc.MethodDescriptor<proto.ChatProto.Request, proto.ChatProto.Response> getSendRequestMethod;
    if ((getSendRequestMethod = ServicesGrpc.getSendRequestMethod) == null) {
      synchronized (ServicesGrpc.class) {
        if ((getSendRequestMethod = ServicesGrpc.getSendRequestMethod) == null) {
          ServicesGrpc.getSendRequestMethod = getSendRequestMethod = 
              io.grpc.MethodDescriptor.<proto.ChatProto.Request, proto.ChatProto.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Services", "sendRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ChatProto.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ChatProto.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new ServicesMethodDescriptorSupplier("sendRequest"))
                  .build();
          }
        }
     }
     return getSendRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.ChatProto.Request,
      proto.ChatProto.Response> getStreamResponsesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "streamResponses",
      requestType = proto.ChatProto.Request.class,
      responseType = proto.ChatProto.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<proto.ChatProto.Request,
      proto.ChatProto.Response> getStreamResponsesMethod() {
    io.grpc.MethodDescriptor<proto.ChatProto.Request, proto.ChatProto.Response> getStreamResponsesMethod;
    if ((getStreamResponsesMethod = ServicesGrpc.getStreamResponsesMethod) == null) {
      synchronized (ServicesGrpc.class) {
        if ((getStreamResponsesMethod = ServicesGrpc.getStreamResponsesMethod) == null) {
          ServicesGrpc.getStreamResponsesMethod = getStreamResponsesMethod = 
              io.grpc.MethodDescriptor.<proto.ChatProto.Request, proto.ChatProto.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Services", "streamResponses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ChatProto.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ChatProto.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new ServicesMethodDescriptorSupplier("streamResponses"))
                  .build();
          }
        }
     }
     return getStreamResponsesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.ChatProto.Request,
      proto.ChatProto.Response> getStreamRequestsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "streamRequests",
      requestType = proto.ChatProto.Request.class,
      responseType = proto.ChatProto.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<proto.ChatProto.Request,
      proto.ChatProto.Response> getStreamRequestsMethod() {
    io.grpc.MethodDescriptor<proto.ChatProto.Request, proto.ChatProto.Response> getStreamRequestsMethod;
    if ((getStreamRequestsMethod = ServicesGrpc.getStreamRequestsMethod) == null) {
      synchronized (ServicesGrpc.class) {
        if ((getStreamRequestsMethod = ServicesGrpc.getStreamRequestsMethod) == null) {
          ServicesGrpc.getStreamRequestsMethod = getStreamRequestsMethod = 
              io.grpc.MethodDescriptor.<proto.ChatProto.Request, proto.ChatProto.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Services", "streamRequests"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ChatProto.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ChatProto.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new ServicesMethodDescriptorSupplier("streamRequests"))
                  .build();
          }
        }
     }
     return getStreamRequestsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.ChatProto.Request,
      proto.ChatProto.Response> getStreamRequestsAndResponsesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "streamRequestsAndResponses",
      requestType = proto.ChatProto.Request.class,
      responseType = proto.ChatProto.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<proto.ChatProto.Request,
      proto.ChatProto.Response> getStreamRequestsAndResponsesMethod() {
    io.grpc.MethodDescriptor<proto.ChatProto.Request, proto.ChatProto.Response> getStreamRequestsAndResponsesMethod;
    if ((getStreamRequestsAndResponsesMethod = ServicesGrpc.getStreamRequestsAndResponsesMethod) == null) {
      synchronized (ServicesGrpc.class) {
        if ((getStreamRequestsAndResponsesMethod = ServicesGrpc.getStreamRequestsAndResponsesMethod) == null) {
          ServicesGrpc.getStreamRequestsAndResponsesMethod = getStreamRequestsAndResponsesMethod = 
              io.grpc.MethodDescriptor.<proto.ChatProto.Request, proto.ChatProto.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Services", "streamRequestsAndResponses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ChatProto.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ChatProto.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new ServicesMethodDescriptorSupplier("streamRequestsAndResponses"))
                  .build();
          }
        }
     }
     return getStreamRequestsAndResponsesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServicesStub newStub(io.grpc.Channel channel) {
    return new ServicesStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServicesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ServicesBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServicesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ServicesFutureStub(channel);
  }

  /**
   */
  public static abstract class ServicesImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * unary call
     * </pre>
     */
    public void sendRequest(proto.ChatProto.Request request,
        io.grpc.stub.StreamObserver<proto.ChatProto.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getSendRequestMethod(), responseObserver);
    }

    /**
     * <pre>
     *server stream
     * </pre>
     */
    public void streamResponses(proto.ChatProto.Request request,
        io.grpc.stub.StreamObserver<proto.ChatProto.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getStreamResponsesMethod(), responseObserver);
    }

    /**
     * <pre>
     *client stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<proto.ChatProto.Request> streamRequests(
        io.grpc.stub.StreamObserver<proto.ChatProto.Response> responseObserver) {
      return asyncUnimplementedStreamingCall(getStreamRequestsMethod(), responseObserver);
    }

    /**
     * <pre>
     *biridectional stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<proto.ChatProto.Request> streamRequestsAndResponses(
        io.grpc.stub.StreamObserver<proto.ChatProto.Response> responseObserver) {
      return asyncUnimplementedStreamingCall(getStreamRequestsAndResponsesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendRequestMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.ChatProto.Request,
                proto.ChatProto.Response>(
                  this, METHODID_SEND_REQUEST)))
          .addMethod(
            getStreamResponsesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                proto.ChatProto.Request,
                proto.ChatProto.Response>(
                  this, METHODID_STREAM_RESPONSES)))
          .addMethod(
            getStreamRequestsMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                proto.ChatProto.Request,
                proto.ChatProto.Response>(
                  this, METHODID_STREAM_REQUESTS)))
          .addMethod(
            getStreamRequestsAndResponsesMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                proto.ChatProto.Request,
                proto.ChatProto.Response>(
                  this, METHODID_STREAM_REQUESTS_AND_RESPONSES)))
          .build();
    }
  }

  /**
   */
  public static final class ServicesStub extends io.grpc.stub.AbstractStub<ServicesStub> {
    private ServicesStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServicesStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServicesStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServicesStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary call
     * </pre>
     */
    public void sendRequest(proto.ChatProto.Request request,
        io.grpc.stub.StreamObserver<proto.ChatProto.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *server stream
     * </pre>
     */
    public void streamResponses(proto.ChatProto.Request request,
        io.grpc.stub.StreamObserver<proto.ChatProto.Response> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getStreamResponsesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *client stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<proto.ChatProto.Request> streamRequests(
        io.grpc.stub.StreamObserver<proto.ChatProto.Response> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getStreamRequestsMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *biridectional stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<proto.ChatProto.Request> streamRequestsAndResponses(
        io.grpc.stub.StreamObserver<proto.ChatProto.Response> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getStreamRequestsAndResponsesMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class ServicesBlockingStub extends io.grpc.stub.AbstractStub<ServicesBlockingStub> {
    private ServicesBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServicesBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServicesBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServicesBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary call
     * </pre>
     */
    public proto.ChatProto.Response sendRequest(proto.ChatProto.Request request) {
      return blockingUnaryCall(
          getChannel(), getSendRequestMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *server stream
     * </pre>
     */
    public java.util.Iterator<proto.ChatProto.Response> streamResponses(
        proto.ChatProto.Request request) {
      return blockingServerStreamingCall(
          getChannel(), getStreamResponsesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ServicesFutureStub extends io.grpc.stub.AbstractStub<ServicesFutureStub> {
    private ServicesFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServicesFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServicesFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServicesFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary call
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.ChatProto.Response> sendRequest(
        proto.ChatProto.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getSendRequestMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_REQUEST = 0;
  private static final int METHODID_STREAM_RESPONSES = 1;
  private static final int METHODID_STREAM_REQUESTS = 2;
  private static final int METHODID_STREAM_REQUESTS_AND_RESPONSES = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServicesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServicesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_REQUEST:
          serviceImpl.sendRequest((proto.ChatProto.Request) request,
              (io.grpc.stub.StreamObserver<proto.ChatProto.Response>) responseObserver);
          break;
        case METHODID_STREAM_RESPONSES:
          serviceImpl.streamResponses((proto.ChatProto.Request) request,
              (io.grpc.stub.StreamObserver<proto.ChatProto.Response>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STREAM_REQUESTS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamRequests(
              (io.grpc.stub.StreamObserver<proto.ChatProto.Response>) responseObserver);
        case METHODID_STREAM_REQUESTS_AND_RESPONSES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamRequestsAndResponses(
              (io.grpc.stub.StreamObserver<proto.ChatProto.Response>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServicesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.ChatProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Services");
    }
  }

  private static final class ServicesFileDescriptorSupplier
      extends ServicesBaseDescriptorSupplier {
    ServicesFileDescriptorSupplier() {}
  }

  private static final class ServicesMethodDescriptorSupplier
      extends ServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServicesMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ServicesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServicesFileDescriptorSupplier())
              .addMethod(getSendRequestMethod())
              .addMethod(getStreamResponsesMethod())
              .addMethod(getStreamRequestsMethod())
              .addMethod(getStreamRequestsAndResponsesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
