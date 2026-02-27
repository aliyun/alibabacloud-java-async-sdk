// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.wyota20210420.models.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;

import java.util.concurrent.CompletableFuture;

public interface AsyncClient extends SdkAutoCloseable {

    static DefaultAsyncClientBuilder builder() {
        return new DefaultAsyncClientBuilder();
    }

    static AsyncClient create() {
        return builder().build();
    }

    /**
     * @param request the request parameters of AddTerminal  AddTerminalRequest
     * @return AddTerminalResponse
     */
    CompletableFuture<AddTerminalResponse> addTerminal(AddTerminalRequest request);

    /**
     * @param request the request parameters of AddTerminals  AddTerminalsRequest
     * @return AddTerminalsResponse
     */
    CompletableFuture<AddTerminalsResponse> addTerminals(AddTerminalsRequest request);

    /**
     * @param request the request parameters of BindAccountLessLoginUser  BindAccountLessLoginUserRequest
     * @return BindAccountLessLoginUserResponse
     */
    CompletableFuture<BindAccountLessLoginUserResponse> bindAccountLessLoginUser(BindAccountLessLoginUserRequest request);

    /**
     * @param request the request parameters of BindPasswordFreeLoginUser  BindPasswordFreeLoginUserRequest
     * @return BindPasswordFreeLoginUserResponse
     */
    CompletableFuture<BindPasswordFreeLoginUserResponse> bindPasswordFreeLoginUser(BindPasswordFreeLoginUserRequest request);

    /**
     * @param request the request parameters of DescribeDeviceSeats  DescribeDeviceSeatsRequest
     * @return DescribeDeviceSeatsResponse
     */
    CompletableFuture<DescribeDeviceSeatsResponse> describeDeviceSeats(DescribeDeviceSeatsRequest request);

    /**
     * @param request the request parameters of ListTerminal  ListTerminalRequest
     * @return ListTerminalResponse
     */
    CompletableFuture<ListTerminalResponse> listTerminal(ListTerminalRequest request);

    /**
     * @param request the request parameters of SendOpsMessageToTerminals  SendOpsMessageToTerminalsRequest
     * @return SendOpsMessageToTerminalsResponse
     */
    CompletableFuture<SendOpsMessageToTerminalsResponse> sendOpsMessageToTerminals(SendOpsMessageToTerminalsRequest request);

    /**
     * @param request the request parameters of UnbindAccountLessLoginUser  UnbindAccountLessLoginUserRequest
     * @return UnbindAccountLessLoginUserResponse
     */
    CompletableFuture<UnbindAccountLessLoginUserResponse> unbindAccountLessLoginUser(UnbindAccountLessLoginUserRequest request);

    /**
     * @param request the request parameters of UnbindDeviceSeats  UnbindDeviceSeatsRequest
     * @return UnbindDeviceSeatsResponse
     */
    CompletableFuture<UnbindDeviceSeatsResponse> unbindDeviceSeats(UnbindDeviceSeatsRequest request);

    /**
     * @param request the request parameters of UnbindPasswordFreeLoginUser  UnbindPasswordFreeLoginUserRequest
     * @return UnbindPasswordFreeLoginUserResponse
     */
    CompletableFuture<UnbindPasswordFreeLoginUserResponse> unbindPasswordFreeLoginUser(UnbindPasswordFreeLoginUserRequest request);

}
