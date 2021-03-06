package trs.network.protobuffprotocol;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.1)",
    comments = "Source: trs.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TrsServiceGrpc {

  private TrsServiceGrpc() {}

  public static final String SERVICE_NAME = "chat.protocol.TrsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest,
      trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> getAddTheatreShowObserverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addTheatreShowObserver",
      requestType = trs.network.protobuffprotocol.TrsProtobufs.TrsRequest.class,
      responseType = trs.network.protobuffprotocol.TrsProtobufs.TrsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest,
      trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> getAddTheatreShowObserverMethod() {
    io.grpc.MethodDescriptor<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest, trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> getAddTheatreShowObserverMethod;
    if ((getAddTheatreShowObserverMethod = TrsServiceGrpc.getAddTheatreShowObserverMethod) == null) {
      synchronized (TrsServiceGrpc.class) {
        if ((getAddTheatreShowObserverMethod = TrsServiceGrpc.getAddTheatreShowObserverMethod) == null) {
          TrsServiceGrpc.getAddTheatreShowObserverMethod = getAddTheatreShowObserverMethod =
              io.grpc.MethodDescriptor.<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest, trs.network.protobuffprotocol.TrsProtobufs.TrsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addTheatreShowObserver"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trs.network.protobuffprotocol.TrsProtobufs.TrsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trs.network.protobuffprotocol.TrsProtobufs.TrsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrsServiceMethodDescriptorSupplier("addTheatreShowObserver"))
              .build();
        }
      }
    }
    return getAddTheatreShowObserverMethod;
  }

  private static volatile io.grpc.MethodDescriptor<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest,
      trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> getAddSeatObserverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addSeatObserver",
      requestType = trs.network.protobuffprotocol.TrsProtobufs.TrsRequest.class,
      responseType = trs.network.protobuffprotocol.TrsProtobufs.TrsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest,
      trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> getAddSeatObserverMethod() {
    io.grpc.MethodDescriptor<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest, trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> getAddSeatObserverMethod;
    if ((getAddSeatObserverMethod = TrsServiceGrpc.getAddSeatObserverMethod) == null) {
      synchronized (TrsServiceGrpc.class) {
        if ((getAddSeatObserverMethod = TrsServiceGrpc.getAddSeatObserverMethod) == null) {
          TrsServiceGrpc.getAddSeatObserverMethod = getAddSeatObserverMethod =
              io.grpc.MethodDescriptor.<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest, trs.network.protobuffprotocol.TrsProtobufs.TrsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addSeatObserver"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trs.network.protobuffprotocol.TrsProtobufs.TrsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trs.network.protobuffprotocol.TrsProtobufs.TrsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrsServiceMethodDescriptorSupplier("addSeatObserver"))
              .build();
        }
      }
    }
    return getAddSeatObserverMethod;
  }

  private static volatile io.grpc.MethodDescriptor<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest,
      trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = trs.network.protobuffprotocol.TrsProtobufs.TrsRequest.class,
      responseType = trs.network.protobuffprotocol.TrsProtobufs.TrsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest,
      trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest, trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> getLoginMethod;
    if ((getLoginMethod = TrsServiceGrpc.getLoginMethod) == null) {
      synchronized (TrsServiceGrpc.class) {
        if ((getLoginMethod = TrsServiceGrpc.getLoginMethod) == null) {
          TrsServiceGrpc.getLoginMethod = getLoginMethod =
              io.grpc.MethodDescriptor.<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest, trs.network.protobuffprotocol.TrsProtobufs.TrsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trs.network.protobuffprotocol.TrsProtobufs.TrsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trs.network.protobuffprotocol.TrsProtobufs.TrsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrsServiceMethodDescriptorSupplier("login"))
              .build();
        }
      }
    }
    return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest,
      trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> getLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "logout",
      requestType = trs.network.protobuffprotocol.TrsProtobufs.TrsRequest.class,
      responseType = trs.network.protobuffprotocol.TrsProtobufs.TrsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest,
      trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> getLogoutMethod() {
    io.grpc.MethodDescriptor<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest, trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> getLogoutMethod;
    if ((getLogoutMethod = TrsServiceGrpc.getLogoutMethod) == null) {
      synchronized (TrsServiceGrpc.class) {
        if ((getLogoutMethod = TrsServiceGrpc.getLogoutMethod) == null) {
          TrsServiceGrpc.getLogoutMethod = getLogoutMethod =
              io.grpc.MethodDescriptor.<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest, trs.network.protobuffprotocol.TrsProtobufs.TrsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "logout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trs.network.protobuffprotocol.TrsProtobufs.TrsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trs.network.protobuffprotocol.TrsProtobufs.TrsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrsServiceMethodDescriptorSupplier("logout"))
              .build();
        }
      }
    }
    return getLogoutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest,
      trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> getFindAllTheatreShowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findAllTheatreShow",
      requestType = trs.network.protobuffprotocol.TrsProtobufs.TrsRequest.class,
      responseType = trs.network.protobuffprotocol.TrsProtobufs.TrsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest,
      trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> getFindAllTheatreShowMethod() {
    io.grpc.MethodDescriptor<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest, trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> getFindAllTheatreShowMethod;
    if ((getFindAllTheatreShowMethod = TrsServiceGrpc.getFindAllTheatreShowMethod) == null) {
      synchronized (TrsServiceGrpc.class) {
        if ((getFindAllTheatreShowMethod = TrsServiceGrpc.getFindAllTheatreShowMethod) == null) {
          TrsServiceGrpc.getFindAllTheatreShowMethod = getFindAllTheatreShowMethod =
              io.grpc.MethodDescriptor.<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest, trs.network.protobuffprotocol.TrsProtobufs.TrsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findAllTheatreShow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trs.network.protobuffprotocol.TrsProtobufs.TrsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trs.network.protobuffprotocol.TrsProtobufs.TrsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrsServiceMethodDescriptorSupplier("findAllTheatreShow"))
              .build();
        }
      }
    }
    return getFindAllTheatreShowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest,
      trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> getFindAllSeatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findAllSeats",
      requestType = trs.network.protobuffprotocol.TrsProtobufs.TrsRequest.class,
      responseType = trs.network.protobuffprotocol.TrsProtobufs.TrsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest,
      trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> getFindAllSeatsMethod() {
    io.grpc.MethodDescriptor<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest, trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> getFindAllSeatsMethod;
    if ((getFindAllSeatsMethod = TrsServiceGrpc.getFindAllSeatsMethod) == null) {
      synchronized (TrsServiceGrpc.class) {
        if ((getFindAllSeatsMethod = TrsServiceGrpc.getFindAllSeatsMethod) == null) {
          TrsServiceGrpc.getFindAllSeatsMethod = getFindAllSeatsMethod =
              io.grpc.MethodDescriptor.<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest, trs.network.protobuffprotocol.TrsProtobufs.TrsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findAllSeats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trs.network.protobuffprotocol.TrsProtobufs.TrsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trs.network.protobuffprotocol.TrsProtobufs.TrsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrsServiceMethodDescriptorSupplier("findAllSeats"))
              .build();
        }
      }
    }
    return getFindAllSeatsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest,
      trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> getFindAllReservationsByTheatreShowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findAllReservationsByTheatreShow",
      requestType = trs.network.protobuffprotocol.TrsProtobufs.TrsRequest.class,
      responseType = trs.network.protobuffprotocol.TrsProtobufs.TrsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest,
      trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> getFindAllReservationsByTheatreShowMethod() {
    io.grpc.MethodDescriptor<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest, trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> getFindAllReservationsByTheatreShowMethod;
    if ((getFindAllReservationsByTheatreShowMethod = TrsServiceGrpc.getFindAllReservationsByTheatreShowMethod) == null) {
      synchronized (TrsServiceGrpc.class) {
        if ((getFindAllReservationsByTheatreShowMethod = TrsServiceGrpc.getFindAllReservationsByTheatreShowMethod) == null) {
          TrsServiceGrpc.getFindAllReservationsByTheatreShowMethod = getFindAllReservationsByTheatreShowMethod =
              io.grpc.MethodDescriptor.<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest, trs.network.protobuffprotocol.TrsProtobufs.TrsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findAllReservationsByTheatreShow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trs.network.protobuffprotocol.TrsProtobufs.TrsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trs.network.protobuffprotocol.TrsProtobufs.TrsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrsServiceMethodDescriptorSupplier("findAllReservationsByTheatreShow"))
              .build();
        }
      }
    }
    return getFindAllReservationsByTheatreShowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest,
      trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> getFindTodaysTheatreShowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findTodaysTheatreShow",
      requestType = trs.network.protobuffprotocol.TrsProtobufs.TrsRequest.class,
      responseType = trs.network.protobuffprotocol.TrsProtobufs.TrsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest,
      trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> getFindTodaysTheatreShowMethod() {
    io.grpc.MethodDescriptor<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest, trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> getFindTodaysTheatreShowMethod;
    if ((getFindTodaysTheatreShowMethod = TrsServiceGrpc.getFindTodaysTheatreShowMethod) == null) {
      synchronized (TrsServiceGrpc.class) {
        if ((getFindTodaysTheatreShowMethod = TrsServiceGrpc.getFindTodaysTheatreShowMethod) == null) {
          TrsServiceGrpc.getFindTodaysTheatreShowMethod = getFindTodaysTheatreShowMethod =
              io.grpc.MethodDescriptor.<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest, trs.network.protobuffprotocol.TrsProtobufs.TrsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findTodaysTheatreShow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trs.network.protobuffprotocol.TrsProtobufs.TrsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trs.network.protobuffprotocol.TrsProtobufs.TrsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrsServiceMethodDescriptorSupplier("findTodaysTheatreShow"))
              .build();
        }
      }
    }
    return getFindTodaysTheatreShowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest,
      trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> getSaveSpectatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveSpectator",
      requestType = trs.network.protobuffprotocol.TrsProtobufs.TrsRequest.class,
      responseType = trs.network.protobuffprotocol.TrsProtobufs.TrsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest,
      trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> getSaveSpectatorMethod() {
    io.grpc.MethodDescriptor<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest, trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> getSaveSpectatorMethod;
    if ((getSaveSpectatorMethod = TrsServiceGrpc.getSaveSpectatorMethod) == null) {
      synchronized (TrsServiceGrpc.class) {
        if ((getSaveSpectatorMethod = TrsServiceGrpc.getSaveSpectatorMethod) == null) {
          TrsServiceGrpc.getSaveSpectatorMethod = getSaveSpectatorMethod =
              io.grpc.MethodDescriptor.<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest, trs.network.protobuffprotocol.TrsProtobufs.TrsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saveSpectator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trs.network.protobuffprotocol.TrsProtobufs.TrsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trs.network.protobuffprotocol.TrsProtobufs.TrsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrsServiceMethodDescriptorSupplier("saveSpectator"))
              .build();
        }
      }
    }
    return getSaveSpectatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest,
      trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> getSaveReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveReservation",
      requestType = trs.network.protobuffprotocol.TrsProtobufs.TrsRequest.class,
      responseType = trs.network.protobuffprotocol.TrsProtobufs.TrsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest,
      trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> getSaveReservationMethod() {
    io.grpc.MethodDescriptor<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest, trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> getSaveReservationMethod;
    if ((getSaveReservationMethod = TrsServiceGrpc.getSaveReservationMethod) == null) {
      synchronized (TrsServiceGrpc.class) {
        if ((getSaveReservationMethod = TrsServiceGrpc.getSaveReservationMethod) == null) {
          TrsServiceGrpc.getSaveReservationMethod = getSaveReservationMethod =
              io.grpc.MethodDescriptor.<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest, trs.network.protobuffprotocol.TrsProtobufs.TrsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saveReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trs.network.protobuffprotocol.TrsProtobufs.TrsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trs.network.protobuffprotocol.TrsProtobufs.TrsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrsServiceMethodDescriptorSupplier("saveReservation"))
              .build();
        }
      }
    }
    return getSaveReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest,
      trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> getSaveTheatreShowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveTheatreShow",
      requestType = trs.network.protobuffprotocol.TrsProtobufs.TrsRequest.class,
      responseType = trs.network.protobuffprotocol.TrsProtobufs.TrsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest,
      trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> getSaveTheatreShowMethod() {
    io.grpc.MethodDescriptor<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest, trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> getSaveTheatreShowMethod;
    if ((getSaveTheatreShowMethod = TrsServiceGrpc.getSaveTheatreShowMethod) == null) {
      synchronized (TrsServiceGrpc.class) {
        if ((getSaveTheatreShowMethod = TrsServiceGrpc.getSaveTheatreShowMethod) == null) {
          TrsServiceGrpc.getSaveTheatreShowMethod = getSaveTheatreShowMethod =
              io.grpc.MethodDescriptor.<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest, trs.network.protobuffprotocol.TrsProtobufs.TrsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saveTheatreShow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trs.network.protobuffprotocol.TrsProtobufs.TrsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trs.network.protobuffprotocol.TrsProtobufs.TrsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrsServiceMethodDescriptorSupplier("saveTheatreShow"))
              .build();
        }
      }
    }
    return getSaveTheatreShowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest,
      trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> getUpdateTheatreShowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateTheatreShow",
      requestType = trs.network.protobuffprotocol.TrsProtobufs.TrsRequest.class,
      responseType = trs.network.protobuffprotocol.TrsProtobufs.TrsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest,
      trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> getUpdateTheatreShowMethod() {
    io.grpc.MethodDescriptor<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest, trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> getUpdateTheatreShowMethod;
    if ((getUpdateTheatreShowMethod = TrsServiceGrpc.getUpdateTheatreShowMethod) == null) {
      synchronized (TrsServiceGrpc.class) {
        if ((getUpdateTheatreShowMethod = TrsServiceGrpc.getUpdateTheatreShowMethod) == null) {
          TrsServiceGrpc.getUpdateTheatreShowMethod = getUpdateTheatreShowMethod =
              io.grpc.MethodDescriptor.<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest, trs.network.protobuffprotocol.TrsProtobufs.TrsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateTheatreShow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trs.network.protobuffprotocol.TrsProtobufs.TrsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trs.network.protobuffprotocol.TrsProtobufs.TrsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrsServiceMethodDescriptorSupplier("updateTheatreShow"))
              .build();
        }
      }
    }
    return getUpdateTheatreShowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest,
      trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> getDeleteTheatreShowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteTheatreShow",
      requestType = trs.network.protobuffprotocol.TrsProtobufs.TrsRequest.class,
      responseType = trs.network.protobuffprotocol.TrsProtobufs.TrsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest,
      trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> getDeleteTheatreShowMethod() {
    io.grpc.MethodDescriptor<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest, trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> getDeleteTheatreShowMethod;
    if ((getDeleteTheatreShowMethod = TrsServiceGrpc.getDeleteTheatreShowMethod) == null) {
      synchronized (TrsServiceGrpc.class) {
        if ((getDeleteTheatreShowMethod = TrsServiceGrpc.getDeleteTheatreShowMethod) == null) {
          TrsServiceGrpc.getDeleteTheatreShowMethod = getDeleteTheatreShowMethod =
              io.grpc.MethodDescriptor.<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest, trs.network.protobuffprotocol.TrsProtobufs.TrsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteTheatreShow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trs.network.protobuffprotocol.TrsProtobufs.TrsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trs.network.protobuffprotocol.TrsProtobufs.TrsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrsServiceMethodDescriptorSupplier("deleteTheatreShow"))
              .build();
        }
      }
    }
    return getDeleteTheatreShowMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TrsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrsServiceStub>() {
        @java.lang.Override
        public TrsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrsServiceStub(channel, callOptions);
        }
      };
    return TrsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TrsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrsServiceBlockingStub>() {
        @java.lang.Override
        public TrsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrsServiceBlockingStub(channel, callOptions);
        }
      };
    return TrsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TrsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrsServiceFutureStub>() {
        @java.lang.Override
        public TrsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrsServiceFutureStub(channel, callOptions);
        }
      };
    return TrsServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TrsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest> addTheatreShowObserver(
        io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getAddTheatreShowObserverMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest> addSeatObserver(
        io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getAddSeatObserverMethod(), responseObserver);
    }

    /**
     */
    public void login(trs.network.protobuffprotocol.TrsProtobufs.TrsRequest request,
        io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void logout(trs.network.protobuffprotocol.TrsProtobufs.TrsRequest request,
        io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLogoutMethod(), responseObserver);
    }

    /**
     */
    public void findAllTheatreShow(trs.network.protobuffprotocol.TrsProtobufs.TrsRequest request,
        io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindAllTheatreShowMethod(), responseObserver);
    }

    /**
     */
    public void findAllSeats(trs.network.protobuffprotocol.TrsProtobufs.TrsRequest request,
        io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindAllSeatsMethod(), responseObserver);
    }

    /**
     */
    public void findAllReservationsByTheatreShow(trs.network.protobuffprotocol.TrsProtobufs.TrsRequest request,
        io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindAllReservationsByTheatreShowMethod(), responseObserver);
    }

    /**
     */
    public void findTodaysTheatreShow(trs.network.protobuffprotocol.TrsProtobufs.TrsRequest request,
        io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindTodaysTheatreShowMethod(), responseObserver);
    }

    /**
     */
    public void saveSpectator(trs.network.protobuffprotocol.TrsProtobufs.TrsRequest request,
        io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveSpectatorMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest> saveReservation(
        io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSaveReservationMethod(), responseObserver);
    }

    /**
     */
    public void saveTheatreShow(trs.network.protobuffprotocol.TrsProtobufs.TrsRequest request,
        io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveTheatreShowMethod(), responseObserver);
    }

    /**
     */
    public void updateTheatreShow(trs.network.protobuffprotocol.TrsProtobufs.TrsRequest request,
        io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateTheatreShowMethod(), responseObserver);
    }

    /**
     */
    public void deleteTheatreShow(trs.network.protobuffprotocol.TrsProtobufs.TrsRequest request,
        io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTheatreShowMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddTheatreShowObserverMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                trs.network.protobuffprotocol.TrsProtobufs.TrsRequest,
                trs.network.protobuffprotocol.TrsProtobufs.TrsResponse>(
                  this, METHODID_ADD_THEATRE_SHOW_OBSERVER)))
          .addMethod(
            getAddSeatObserverMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                trs.network.protobuffprotocol.TrsProtobufs.TrsRequest,
                trs.network.protobuffprotocol.TrsProtobufs.TrsResponse>(
                  this, METHODID_ADD_SEAT_OBSERVER)))
          .addMethod(
            getLoginMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                trs.network.protobuffprotocol.TrsProtobufs.TrsRequest,
                trs.network.protobuffprotocol.TrsProtobufs.TrsResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getLogoutMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                trs.network.protobuffprotocol.TrsProtobufs.TrsRequest,
                trs.network.protobuffprotocol.TrsProtobufs.TrsResponse>(
                  this, METHODID_LOGOUT)))
          .addMethod(
            getFindAllTheatreShowMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                trs.network.protobuffprotocol.TrsProtobufs.TrsRequest,
                trs.network.protobuffprotocol.TrsProtobufs.TrsResponse>(
                  this, METHODID_FIND_ALL_THEATRE_SHOW)))
          .addMethod(
            getFindAllSeatsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                trs.network.protobuffprotocol.TrsProtobufs.TrsRequest,
                trs.network.protobuffprotocol.TrsProtobufs.TrsResponse>(
                  this, METHODID_FIND_ALL_SEATS)))
          .addMethod(
            getFindAllReservationsByTheatreShowMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                trs.network.protobuffprotocol.TrsProtobufs.TrsRequest,
                trs.network.protobuffprotocol.TrsProtobufs.TrsResponse>(
                  this, METHODID_FIND_ALL_RESERVATIONS_BY_THEATRE_SHOW)))
          .addMethod(
            getFindTodaysTheatreShowMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                trs.network.protobuffprotocol.TrsProtobufs.TrsRequest,
                trs.network.protobuffprotocol.TrsProtobufs.TrsResponse>(
                  this, METHODID_FIND_TODAYS_THEATRE_SHOW)))
          .addMethod(
            getSaveSpectatorMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                trs.network.protobuffprotocol.TrsProtobufs.TrsRequest,
                trs.network.protobuffprotocol.TrsProtobufs.TrsResponse>(
                  this, METHODID_SAVE_SPECTATOR)))
          .addMethod(
            getSaveReservationMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                trs.network.protobuffprotocol.TrsProtobufs.TrsRequest,
                trs.network.protobuffprotocol.TrsProtobufs.TrsResponse>(
                  this, METHODID_SAVE_RESERVATION)))
          .addMethod(
            getSaveTheatreShowMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                trs.network.protobuffprotocol.TrsProtobufs.TrsRequest,
                trs.network.protobuffprotocol.TrsProtobufs.TrsResponse>(
                  this, METHODID_SAVE_THEATRE_SHOW)))
          .addMethod(
            getUpdateTheatreShowMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                trs.network.protobuffprotocol.TrsProtobufs.TrsRequest,
                trs.network.protobuffprotocol.TrsProtobufs.TrsResponse>(
                  this, METHODID_UPDATE_THEATRE_SHOW)))
          .addMethod(
            getDeleteTheatreShowMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                trs.network.protobuffprotocol.TrsProtobufs.TrsRequest,
                trs.network.protobuffprotocol.TrsProtobufs.TrsResponse>(
                  this, METHODID_DELETE_THEATRE_SHOW)))
          .build();
    }
  }

  /**
   */
  public static final class TrsServiceStub extends io.grpc.stub.AbstractAsyncStub<TrsServiceStub> {
    private TrsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrsServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest> addTheatreShowObserver(
        io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getAddTheatreShowObserverMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest> addSeatObserver(
        io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getAddSeatObserverMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void login(trs.network.protobuffprotocol.TrsProtobufs.TrsRequest request,
        io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logout(trs.network.protobuffprotocol.TrsProtobufs.TrsRequest request,
        io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAllTheatreShow(trs.network.protobuffprotocol.TrsProtobufs.TrsRequest request,
        io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindAllTheatreShowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAllSeats(trs.network.protobuffprotocol.TrsProtobufs.TrsRequest request,
        io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindAllSeatsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAllReservationsByTheatreShow(trs.network.protobuffprotocol.TrsProtobufs.TrsRequest request,
        io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindAllReservationsByTheatreShowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findTodaysTheatreShow(trs.network.protobuffprotocol.TrsProtobufs.TrsRequest request,
        io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindTodaysTheatreShowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveSpectator(trs.network.protobuffprotocol.TrsProtobufs.TrsRequest request,
        io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveSpectatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsRequest> saveReservation(
        io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getSaveReservationMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void saveTheatreShow(trs.network.protobuffprotocol.TrsProtobufs.TrsRequest request,
        io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveTheatreShowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTheatreShow(trs.network.protobuffprotocol.TrsProtobufs.TrsRequest request,
        io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateTheatreShowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTheatreShow(trs.network.protobuffprotocol.TrsProtobufs.TrsRequest request,
        io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTheatreShowMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TrsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TrsServiceBlockingStub> {
    private TrsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public trs.network.protobuffprotocol.TrsProtobufs.TrsResponse login(trs.network.protobuffprotocol.TrsProtobufs.TrsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public trs.network.protobuffprotocol.TrsProtobufs.TrsResponse logout(trs.network.protobuffprotocol.TrsProtobufs.TrsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLogoutMethod(), getCallOptions(), request);
    }

    /**
     */
    public trs.network.protobuffprotocol.TrsProtobufs.TrsResponse findAllTheatreShow(trs.network.protobuffprotocol.TrsProtobufs.TrsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindAllTheatreShowMethod(), getCallOptions(), request);
    }

    /**
     */
    public trs.network.protobuffprotocol.TrsProtobufs.TrsResponse findAllSeats(trs.network.protobuffprotocol.TrsProtobufs.TrsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindAllSeatsMethod(), getCallOptions(), request);
    }

    /**
     */
    public trs.network.protobuffprotocol.TrsProtobufs.TrsResponse findAllReservationsByTheatreShow(trs.network.protobuffprotocol.TrsProtobufs.TrsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindAllReservationsByTheatreShowMethod(), getCallOptions(), request);
    }

    /**
     */
    public trs.network.protobuffprotocol.TrsProtobufs.TrsResponse findTodaysTheatreShow(trs.network.protobuffprotocol.TrsProtobufs.TrsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindTodaysTheatreShowMethod(), getCallOptions(), request);
    }

    /**
     */
    public trs.network.protobuffprotocol.TrsProtobufs.TrsResponse saveSpectator(trs.network.protobuffprotocol.TrsProtobufs.TrsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveSpectatorMethod(), getCallOptions(), request);
    }

    /**
     */
    public trs.network.protobuffprotocol.TrsProtobufs.TrsResponse saveTheatreShow(trs.network.protobuffprotocol.TrsProtobufs.TrsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveTheatreShowMethod(), getCallOptions(), request);
    }

    /**
     */
    public trs.network.protobuffprotocol.TrsProtobufs.TrsResponse updateTheatreShow(trs.network.protobuffprotocol.TrsProtobufs.TrsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTheatreShowMethod(), getCallOptions(), request);
    }

    /**
     */
    public trs.network.protobuffprotocol.TrsProtobufs.TrsResponse deleteTheatreShow(trs.network.protobuffprotocol.TrsProtobufs.TrsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTheatreShowMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TrsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TrsServiceFutureStub> {
    private TrsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> login(
        trs.network.protobuffprotocol.TrsProtobufs.TrsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> logout(
        trs.network.protobuffprotocol.TrsProtobufs.TrsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> findAllTheatreShow(
        trs.network.protobuffprotocol.TrsProtobufs.TrsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindAllTheatreShowMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> findAllSeats(
        trs.network.protobuffprotocol.TrsProtobufs.TrsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindAllSeatsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> findAllReservationsByTheatreShow(
        trs.network.protobuffprotocol.TrsProtobufs.TrsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindAllReservationsByTheatreShowMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> findTodaysTheatreShow(
        trs.network.protobuffprotocol.TrsProtobufs.TrsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindTodaysTheatreShowMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> saveSpectator(
        trs.network.protobuffprotocol.TrsProtobufs.TrsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveSpectatorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> saveTheatreShow(
        trs.network.protobuffprotocol.TrsProtobufs.TrsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveTheatreShowMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> updateTheatreShow(
        trs.network.protobuffprotocol.TrsProtobufs.TrsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateTheatreShowMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse> deleteTheatreShow(
        trs.network.protobuffprotocol.TrsProtobufs.TrsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTheatreShowMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_LOGOUT = 1;
  private static final int METHODID_FIND_ALL_THEATRE_SHOW = 2;
  private static final int METHODID_FIND_ALL_SEATS = 3;
  private static final int METHODID_FIND_ALL_RESERVATIONS_BY_THEATRE_SHOW = 4;
  private static final int METHODID_FIND_TODAYS_THEATRE_SHOW = 5;
  private static final int METHODID_SAVE_SPECTATOR = 6;
  private static final int METHODID_SAVE_THEATRE_SHOW = 7;
  private static final int METHODID_UPDATE_THEATRE_SHOW = 8;
  private static final int METHODID_DELETE_THEATRE_SHOW = 9;
  private static final int METHODID_ADD_THEATRE_SHOW_OBSERVER = 10;
  private static final int METHODID_ADD_SEAT_OBSERVER = 11;
  private static final int METHODID_SAVE_RESERVATION = 12;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TrsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TrsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((trs.network.protobuffprotocol.TrsProtobufs.TrsRequest) request,
              (io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse>) responseObserver);
          break;
        case METHODID_LOGOUT:
          serviceImpl.logout((trs.network.protobuffprotocol.TrsProtobufs.TrsRequest) request,
              (io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse>) responseObserver);
          break;
        case METHODID_FIND_ALL_THEATRE_SHOW:
          serviceImpl.findAllTheatreShow((trs.network.protobuffprotocol.TrsProtobufs.TrsRequest) request,
              (io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse>) responseObserver);
          break;
        case METHODID_FIND_ALL_SEATS:
          serviceImpl.findAllSeats((trs.network.protobuffprotocol.TrsProtobufs.TrsRequest) request,
              (io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse>) responseObserver);
          break;
        case METHODID_FIND_ALL_RESERVATIONS_BY_THEATRE_SHOW:
          serviceImpl.findAllReservationsByTheatreShow((trs.network.protobuffprotocol.TrsProtobufs.TrsRequest) request,
              (io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse>) responseObserver);
          break;
        case METHODID_FIND_TODAYS_THEATRE_SHOW:
          serviceImpl.findTodaysTheatreShow((trs.network.protobuffprotocol.TrsProtobufs.TrsRequest) request,
              (io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse>) responseObserver);
          break;
        case METHODID_SAVE_SPECTATOR:
          serviceImpl.saveSpectator((trs.network.protobuffprotocol.TrsProtobufs.TrsRequest) request,
              (io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse>) responseObserver);
          break;
        case METHODID_SAVE_THEATRE_SHOW:
          serviceImpl.saveTheatreShow((trs.network.protobuffprotocol.TrsProtobufs.TrsRequest) request,
              (io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_THEATRE_SHOW:
          serviceImpl.updateTheatreShow((trs.network.protobuffprotocol.TrsProtobufs.TrsRequest) request,
              (io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse>) responseObserver);
          break;
        case METHODID_DELETE_THEATRE_SHOW:
          serviceImpl.deleteTheatreShow((trs.network.protobuffprotocol.TrsProtobufs.TrsRequest) request,
              (io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse>) responseObserver);
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
        case METHODID_ADD_THEATRE_SHOW_OBSERVER:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.addTheatreShowObserver(
              (io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse>) responseObserver);
        case METHODID_ADD_SEAT_OBSERVER:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.addSeatObserver(
              (io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse>) responseObserver);
        case METHODID_SAVE_RESERVATION:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.saveReservation(
              (io.grpc.stub.StreamObserver<trs.network.protobuffprotocol.TrsProtobufs.TrsResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TrsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TrsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return trs.network.protobuffprotocol.TrsProtobufs.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TrsService");
    }
  }

  private static final class TrsServiceFileDescriptorSupplier
      extends TrsServiceBaseDescriptorSupplier {
    TrsServiceFileDescriptorSupplier() {}
  }

  private static final class TrsServiceMethodDescriptorSupplier
      extends TrsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TrsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TrsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TrsServiceFileDescriptorSupplier())
              .addMethod(getAddTheatreShowObserverMethod())
              .addMethod(getAddSeatObserverMethod())
              .addMethod(getLoginMethod())
              .addMethod(getLogoutMethod())
              .addMethod(getFindAllTheatreShowMethod())
              .addMethod(getFindAllSeatsMethod())
              .addMethod(getFindAllReservationsByTheatreShowMethod())
              .addMethod(getFindTodaysTheatreShowMethod())
              .addMethod(getSaveSpectatorMethod())
              .addMethod(getSaveReservationMethod())
              .addMethod(getSaveTheatreShowMethod())
              .addMethod(getUpdateTheatreShowMethod())
              .addMethod(getDeleteTheatreShowMethod())
              .build();
        }
      }
    }
    return result;
  }
}
