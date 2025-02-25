// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qianzhou20211111;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.qianzhou20211111.models.*;
import darabonba.core.sse.SSEHttpResponseHandler;
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
        this.product = "qianzhou";
        this.version = "2021-11-11";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AICreateSessionMessage  AICreateSessionMessageRequest
     * @return AICreateSessionMessageResponse
     */
    @Override
    public CompletableFuture<AICreateSessionMessageResponse> aICreateSessionMessage(AICreateSessionMessageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AICreateSessionMessage").setMethod(HttpMethod.POST).setPathRegex("/popapi/AICreateSessionMessage").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AICreateSessionMessageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AICreateSessionMessageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<AICreateSessionMessageResponseBody> aICreateSessionMessageWithResponseIterable(AICreateSessionMessageRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("AICreateSessionMessage").setMethod(HttpMethod.POST).setPathRegex("/popapi/AICreateSessionMessage").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        AICreateSessionMessageResponseBodyIterator iterator = AICreateSessionMessageResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of CreateDiagnosis  CreateDiagnosisRequest
     * @return CreateDiagnosisResponse
     */
    @Override
    public CompletableFuture<CreateDiagnosisResponse> createDiagnosis(CreateDiagnosisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateDiagnosis").setMethod(HttpMethod.POST).setPathRegex("/popapi/createDiagnosis").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDiagnosisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDiagnosisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCluster  GetClusterRequest
     * @return GetClusterResponse
     */
    @Override
    public CompletableFuture<GetClusterResponse> getCluster(GetClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetCluster").setMethod(HttpMethod.GET).setPathRegex("/popapi/getCluster").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetClusterWarning  GetClusterWarningRequest
     * @return GetClusterWarningResponse
     */
    @Override
    public CompletableFuture<GetClusterWarningResponse> getClusterWarning(GetClusterWarningRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetClusterWarning").setMethod(HttpMethod.GET).setPathRegex("/popapi/getKeyClusterWarningList").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetClusterWarningResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetClusterWarningResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDiagnosisResult  GetDiagnosisResultRequest
     * @return GetDiagnosisResultResponse
     */
    @Override
    public CompletableFuture<GetDiagnosisResultResponse> getDiagnosisResult(GetDiagnosisResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDiagnosisResult").setMethod(HttpMethod.GET).setPathRegex("/popapi/GetDiagnosisResult").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDiagnosisResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDiagnosisResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetUserClusterWarning  GetUserClusterWarningRequest
     * @return GetUserClusterWarningResponse
     */
    @Override
    public CompletableFuture<GetUserClusterWarningResponse> getUserClusterWarning(GetUserClusterWarningRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetUserClusterWarning").setMethod(HttpMethod.GET).setPathRegex("/popapi/listUserKeyClusters").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUserClusterWarningResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUserClusterWarningResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI GetWebshellToken is deprecated  * @param request  the request parameters of GetWebshellToken  GetWebshellTokenRequest
     * @return GetWebshellTokenResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<GetWebshellTokenResponse> getWebshellToken(GetWebshellTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetWebshellToken").setMethod(HttpMethod.GET).setPathRegex("/popapi/getChorusToken").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWebshellTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWebshellTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of Hello  HelloRequest
     * @return HelloResponse
     */
    @Override
    public CompletableFuture<HelloResponse> hello(HelloRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("Hello").setMethod(HttpMethod.GET).setPathRegex("/popapi/hello").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(HelloResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<HelloResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListClusterDeprecatedAPI  ListClusterDeprecatedAPIRequest
     * @return ListClusterDeprecatedAPIResponse
     */
    @Override
    public CompletableFuture<ListClusterDeprecatedAPIResponse> listClusterDeprecatedAPI(ListClusterDeprecatedAPIRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListClusterDeprecatedAPI").setMethod(HttpMethod.POST).setPathRegex("/popapi/listDeprecatedK8sAPI").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListClusterDeprecatedAPIResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListClusterDeprecatedAPIResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListClusterImages  ListClusterImagesRequest
     * @return ListClusterImagesResponse
     */
    @Override
    public CompletableFuture<ListClusterImagesResponse> listClusterImages(ListClusterImagesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListClusterImages").setMethod(HttpMethod.POST).setPathRegex("/popapi/listClusterPodImages").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListClusterImagesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListClusterImagesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListUserClusters  ListUserClustersRequest
     * @return ListUserClustersResponse
     */
    @Override
    public CompletableFuture<ListUserClustersResponse> listUserClusters(ListUserClustersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListUserClusters").setMethod(HttpMethod.GET).setPathRegex("/popapi/listUserClusters").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUserClustersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUserClustersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryByInstanceInfo  QueryByInstanceInfoRequest
     * @return QueryByInstanceInfoResponse
     */
    @Override
    public CompletableFuture<QueryByInstanceInfoResponse> queryByInstanceInfo(QueryByInstanceInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryByInstanceInfo").setMethod(HttpMethod.POST).setPathRegex("/popapi/queryByInstanceInfo").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryByInstanceInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryByInstanceInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryNodeInfo  QueryNodeInfoRequest
     * @return QueryNodeInfoResponse
     */
    @Override
    public CompletableFuture<QueryNodeInfoResponse> queryNodeInfo(QueryNodeInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryNodeInfo").setMethod(HttpMethod.GET).setPathRegex("/popapi/queryByInstanceId").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryNodeInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryNodeInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
