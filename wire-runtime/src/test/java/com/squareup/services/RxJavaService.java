// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/rxjava_service.proto at 6:1
package com.squareup.services;

import com.squareup.services.anotherpackage.SendDataRequest;
import com.squareup.services.anotherpackage.SendDataResponse;
import java.lang.Override;
import javax.inject.Inject;
import retrofit.http.Body;
import retrofit.http.POST;
import rx.functions.Func1;

/**
 * An example service.
 */
public final class RxJavaService {
  private final Func1<SendDataRequest, SendDataResponse> sendSomeData = new Func1<SendDataRequest, SendDataResponse>() {
    @Override
    public SendDataResponse call(SendDataRequest request) {
      return endpoint.sendSomeData(request);
    }
  };

  private final Func1<SendDataRequest, SendDataResponse> sendSomeMoreData = new Func1<SendDataRequest, SendDataResponse>() {
    @Override
    public SendDataResponse call(SendDataRequest request) {
      return endpoint.sendSomeMoreData(request);
    }
  };

  private final Endpoint endpoint;

  @Inject
  public RxJavaService(Endpoint endpoint) {
    this.endpoint = endpoint;
  }

  public Func1<SendDataRequest, SendDataResponse> getSendSomeData() {
    return sendSomeData;
  }

  public Func1<SendDataRequest, SendDataResponse> getSendSomeMoreData() {
    return sendSomeMoreData;
  }

  public interface Endpoint {
    /**
     * Sends some data.
     */
    @POST("/com.squareup.services.RxJavaService/SendSomeData")
    SendDataResponse sendSomeData(@Body SendDataRequest request);

    /**
     * Sends some more data.
     */
    @POST("/com.squareup.services.RxJavaService/SendSomeMoreData")
    SendDataResponse sendSomeMoreData(@Body SendDataRequest request);
  }
}
