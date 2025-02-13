// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieoauth2_1_0;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.aligenieoauth2_1_0.models.*;
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
     * @param request the request parameters of ExecuteScene  ExecuteSceneRequest
     * @return ExecuteSceneResponse
     */
    CompletableFuture<ExecuteSceneResponse> executeScene(ExecuteSceneRequest request);

    /**
     * @param request the request parameters of GetSceneList  GetSceneListRequest
     * @return GetSceneListResponse
     */
    CompletableFuture<GetSceneListResponse> getSceneList(GetSceneListRequest request);

    /**
     * @param request the request parameters of GetUserBasicInfo  GetUserBasicInfoRequest
     * @return GetUserBasicInfoResponse
     */
    CompletableFuture<GetUserBasicInfoResponse> getUserBasicInfo(GetUserBasicInfoRequest request);

    /**
     * @param request the request parameters of GetUserPhone  GetUserPhoneRequest
     * @return GetUserPhoneResponse
     */
    CompletableFuture<GetUserPhoneResponse> getUserPhone(GetUserPhoneRequest request);

    /**
     * @param request the request parameters of OAuth2RevocationEndpoint  OAuth2RevocationEndpointRequest
     * @return OAuth2RevocationEndpointResponse
     */
    CompletableFuture<OAuth2RevocationEndpointResponse> oAuth2RevocationEndpoint(OAuth2RevocationEndpointRequest request);

    /**
     * @param request the request parameters of OAuth2TokenEndpoint  OAuth2TokenEndpointRequest
     * @return OAuth2TokenEndpointResponse
     */
    CompletableFuture<OAuth2TokenEndpointResponse> oAuth2TokenEndpoint(OAuth2TokenEndpointRequest request);

    /**
     * @param request the request parameters of PushDeviceNotification  PushDeviceNotificationRequest
     * @return PushDeviceNotificationResponse
     */
    CompletableFuture<PushDeviceNotificationResponse> pushDeviceNotification(PushDeviceNotificationRequest request);

    /**
     * @param request the request parameters of QueryDeviceList  QueryDeviceListRequest
     * @return QueryDeviceListResponse
     */
    CompletableFuture<QueryDeviceListResponse> queryDeviceList(QueryDeviceListRequest request);

}
