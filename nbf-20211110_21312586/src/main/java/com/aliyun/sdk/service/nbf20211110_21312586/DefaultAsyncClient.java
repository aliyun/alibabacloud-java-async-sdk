// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nbf20211110_21312586;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.nbf20211110_21312586.models.*;
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
        this.product = "NBF";
        this.version = "2021-11-10_21-31-25-86";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    @Override
    public CompletableFuture<ApiTestResponse> apiTest(ApiTestRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ApiTest").setMethod(HttpMethod.POST).setPathRegex("/nbf_gateway_inner/1_0_0/apiTest").setBodyType(BodyType.STRING).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApiTestResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApiTestResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<BuildSdkResponse> buildSdk(BuildSdkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BuildSdk").setMethod(HttpMethod.POST).setPathRegex("/nbf_gateway_inner/1_0_0/buildSdk").setBodyType(BodyType.STRING).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BuildSdkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BuildSdkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateAndReleaseApiResponse> createAndReleaseApi(CreateAndReleaseApiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateAndReleaseApi").setMethod(HttpMethod.POST).setPathRegex("/nbf_gateway_inner/1_0_0/createAndReleaseApi").setBodyType(BodyType.STRING).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAndReleaseApiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAndReleaseApiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateSdkVersionResponse> createSdkVersion(CreateSdkVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateSdkVersion").setMethod(HttpMethod.POST).setPathRegex("/nbf_gateway_inner/1_0_0/createSdkVersion").setBodyType(BodyType.STRING).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSdkVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSdkVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteApiResponse> deleteApi(DeleteApiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteApi").setMethod(HttpMethod.POST).setPathRegex("/nbf_gateway_inner/1_0_0/deleteApi").setBodyType(BodyType.STRING).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteApiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteApiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetResultResponse> getResult(GetResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetResult").setMethod(HttpMethod.POST).setPathRegex("/nbf_gateway_inner/1_0_0/getResult").setBodyType(BodyType.STRING).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<OpenApiGenericProxyResponse> openApiGenericProxy(OpenApiGenericProxyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("OpenApiGenericProxy").setMethod(HttpMethod.POST).setPathRegex("/nbf_gateway_inner/1_0_0/openApiGenericProxy").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OpenApiGenericProxyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OpenApiGenericProxyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<PreCheckResponse> preCheck(PreCheckRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PreCheck").setMethod(HttpMethod.POST).setPathRegex("/nbf_gateway_inner/1_0_0/preCheck").setBodyType(BodyType.STRING).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PreCheckResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PreCheckResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<PublishSdkResponse> publishSdk(PublishSdkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PublishSdk").setMethod(HttpMethod.POST).setPathRegex("/nbf_gateway_inner/1_0_0/publishSdk").setBodyType(BodyType.STRING).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PublishSdkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PublishSdkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<SerializeApiResponse> serializeApi(SerializeApiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SerializeApi").setMethod(HttpMethod.POST).setPathRegex("/nbf_gateway_inner/1_0_0/serializeApi").setBodyType(BodyType.STRING).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SerializeApiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SerializeApiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UpdateAndReleaseApiResponse> updateAndReleaseApi(UpdateAndReleaseApiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateAndReleaseApi").setMethod(HttpMethod.POST).setPathRegex("/nbf_gateway_inner/1_0_0/updateAndReleaseApi").setBodyType(BodyType.STRING).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAndReleaseApiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAndReleaseApiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
