// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.wyota20210420.models.*;
import darabonba.core.utils.*;
import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;

import java.util.concurrent.CompletableFuture;


/**
 * <p>Main client.</p>
 */
public final class DefaultAsyncClient implements AsyncClient {

    protected final String product;
    protected final String version;
    protected final String endpointRule;
    protected final java.util.Map<String, String> endpointMap;
    protected final TeaRequest REQUEST;
    protected final TeaAsyncHandler handler;

    protected DefaultAsyncClient(ClientConfiguration configuration) {
        this.handler = new TeaAsyncHandler(configuration);
        this.product = "wyota";
        this.version = "2021-04-20";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AddTerminal  AddTerminalRequest
     * @return AddTerminalResponse
     */
    @Override
    public CompletableFuture<AddTerminalResponse> addTerminal(AddTerminalRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddTerminal").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddTerminalResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddTerminalResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddTerminals  AddTerminalsRequest
     * @return AddTerminalsResponse
     */
    @Override
    public CompletableFuture<AddTerminalsResponse> addTerminals(AddTerminalsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddTerminals").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddTerminalsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddTerminalsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BindAccountLessLoginUser  BindAccountLessLoginUserRequest
     * @return BindAccountLessLoginUserResponse
     */
    @Override
    public CompletableFuture<BindAccountLessLoginUserResponse> bindAccountLessLoginUser(BindAccountLessLoginUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BindAccountLessLoginUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BindAccountLessLoginUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BindAccountLessLoginUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BindPasswordFreeLoginUser  BindPasswordFreeLoginUserRequest
     * @return BindPasswordFreeLoginUserResponse
     */
    @Override
    public CompletableFuture<BindPasswordFreeLoginUserResponse> bindPasswordFreeLoginUser(BindPasswordFreeLoginUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BindPasswordFreeLoginUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BindPasswordFreeLoginUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BindPasswordFreeLoginUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDeviceSeats  DescribeDeviceSeatsRequest
     * @return DescribeDeviceSeatsResponse
     */
    @Override
    public CompletableFuture<DescribeDeviceSeatsResponse> describeDeviceSeats(DescribeDeviceSeatsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDeviceSeats").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDeviceSeatsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDeviceSeatsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTerminal  ListTerminalRequest
     * @return ListTerminalResponse
     */
    @Override
    public CompletableFuture<ListTerminalResponse> listTerminal(ListTerminalRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTerminal").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTerminalResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTerminalResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SendOpsMessageToTerminals  SendOpsMessageToTerminalsRequest
     * @return SendOpsMessageToTerminalsResponse
     */
    @Override
    public CompletableFuture<SendOpsMessageToTerminalsResponse> sendOpsMessageToTerminals(SendOpsMessageToTerminalsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SendOpsMessageToTerminals").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendOpsMessageToTerminalsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendOpsMessageToTerminalsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UnbindAccountLessLoginUser  UnbindAccountLessLoginUserRequest
     * @return UnbindAccountLessLoginUserResponse
     */
    @Override
    public CompletableFuture<UnbindAccountLessLoginUserResponse> unbindAccountLessLoginUser(UnbindAccountLessLoginUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnbindAccountLessLoginUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnbindAccountLessLoginUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnbindAccountLessLoginUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UnbindDeviceSeats  UnbindDeviceSeatsRequest
     * @return UnbindDeviceSeatsResponse
     */
    @Override
    public CompletableFuture<UnbindDeviceSeatsResponse> unbindDeviceSeats(UnbindDeviceSeatsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnbindDeviceSeats").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnbindDeviceSeatsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnbindDeviceSeatsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UnbindPasswordFreeLoginUser  UnbindPasswordFreeLoginUserRequest
     * @return UnbindPasswordFreeLoginUserResponse
     */
    @Override
    public CompletableFuture<UnbindPasswordFreeLoginUserResponse> unbindPasswordFreeLoginUser(UnbindPasswordFreeLoginUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnbindPasswordFreeLoginUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnbindPasswordFreeLoginUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnbindPasswordFreeLoginUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
