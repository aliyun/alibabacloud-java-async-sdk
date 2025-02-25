// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qianzhou20211111;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.qianzhou20211111.models.*;
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
     * @param request the request parameters of AICreateSessionMessage  AICreateSessionMessageRequest
     * @return AICreateSessionMessageResponse
     */
    CompletableFuture<AICreateSessionMessageResponse> aICreateSessionMessage(AICreateSessionMessageRequest request);

    ResponseIterable<AICreateSessionMessageResponseBody> aICreateSessionMessageWithResponseIterable(AICreateSessionMessageRequest request);

    /**
     * @param request the request parameters of CreateDiagnosis  CreateDiagnosisRequest
     * @return CreateDiagnosisResponse
     */
    CompletableFuture<CreateDiagnosisResponse> createDiagnosis(CreateDiagnosisRequest request);

    /**
     * @param request the request parameters of GetCluster  GetClusterRequest
     * @return GetClusterResponse
     */
    CompletableFuture<GetClusterResponse> getCluster(GetClusterRequest request);

    /**
     * @param request the request parameters of GetClusterWarning  GetClusterWarningRequest
     * @return GetClusterWarningResponse
     */
    CompletableFuture<GetClusterWarningResponse> getClusterWarning(GetClusterWarningRequest request);

    /**
     * @param request the request parameters of GetDiagnosisResult  GetDiagnosisResultRequest
     * @return GetDiagnosisResultResponse
     */
    CompletableFuture<GetDiagnosisResultResponse> getDiagnosisResult(GetDiagnosisResultRequest request);

    /**
     * @param request the request parameters of GetUserClusterWarning  GetUserClusterWarningRequest
     * @return GetUserClusterWarningResponse
     */
    CompletableFuture<GetUserClusterWarningResponse> getUserClusterWarning(GetUserClusterWarningRequest request);

    /**
     * @deprecated OpenAPI GetWebshellToken is deprecated  * @param request  the request parameters of GetWebshellToken  GetWebshellTokenRequest
     * @return GetWebshellTokenResponse
     */
    @Deprecated
    CompletableFuture<GetWebshellTokenResponse> getWebshellToken(GetWebshellTokenRequest request);

    /**
     * @param request the request parameters of Hello  HelloRequest
     * @return HelloResponse
     */
    CompletableFuture<HelloResponse> hello(HelloRequest request);

    /**
     * @param request the request parameters of ListClusterDeprecatedAPI  ListClusterDeprecatedAPIRequest
     * @return ListClusterDeprecatedAPIResponse
     */
    CompletableFuture<ListClusterDeprecatedAPIResponse> listClusterDeprecatedAPI(ListClusterDeprecatedAPIRequest request);

    /**
     * @param request the request parameters of ListClusterImages  ListClusterImagesRequest
     * @return ListClusterImagesResponse
     */
    CompletableFuture<ListClusterImagesResponse> listClusterImages(ListClusterImagesRequest request);

    /**
     * @param request the request parameters of ListUserClusters  ListUserClustersRequest
     * @return ListUserClustersResponse
     */
    CompletableFuture<ListUserClustersResponse> listUserClusters(ListUserClustersRequest request);

    /**
     * @param request the request parameters of QueryByInstanceInfo  QueryByInstanceInfoRequest
     * @return QueryByInstanceInfoResponse
     */
    CompletableFuture<QueryByInstanceInfoResponse> queryByInstanceInfo(QueryByInstanceInfoRequest request);

    /**
     * @param request the request parameters of QueryNodeInfo  QueryNodeInfoRequest
     * @return QueryNodeInfoResponse
     */
    CompletableFuture<QueryNodeInfoResponse> queryNodeInfo(QueryNodeInfoRequest request);

}
