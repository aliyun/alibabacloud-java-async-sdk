// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentitydata20251127;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.agentidentitydata20251127.models.*;
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
     * @param request the request parameters of AssumeRoleForWorkloadIdentity  AssumeRoleForWorkloadIdentityRequest
     * @return AssumeRoleForWorkloadIdentityResponse
     */
    CompletableFuture<AssumeRoleForWorkloadIdentityResponse> assumeRoleForWorkloadIdentity(AssumeRoleForWorkloadIdentityRequest request);

    /**
     * @param request the request parameters of CompleteResourceTokenAuth  CompleteResourceTokenAuthRequest
     * @return CompleteResourceTokenAuthResponse
     */
    CompletableFuture<CompleteResourceTokenAuthResponse> completeResourceTokenAuth(CompleteResourceTokenAuthRequest request);

    /**
     * @param request the request parameters of GetResourceAPIKey  GetResourceAPIKeyRequest
     * @return GetResourceAPIKeyResponse
     */
    CompletableFuture<GetResourceAPIKeyResponse> getResourceAPIKey(GetResourceAPIKeyRequest request);

    /**
     * @param request the request parameters of GetResourceOAuth2Token  GetResourceOAuth2TokenRequest
     * @return GetResourceOAuth2TokenResponse
     */
    CompletableFuture<GetResourceOAuth2TokenResponse> getResourceOAuth2Token(GetResourceOAuth2TokenRequest request);

    /**
     * @param request the request parameters of GetWorkloadAccessToken  GetWorkloadAccessTokenRequest
     * @return GetWorkloadAccessTokenResponse
     */
    CompletableFuture<GetWorkloadAccessTokenResponse> getWorkloadAccessToken(GetWorkloadAccessTokenRequest request);

    /**
     * @param request the request parameters of GetWorkloadAccessTokenForJWT  GetWorkloadAccessTokenForJWTRequest
     * @return GetWorkloadAccessTokenForJWTResponse
     */
    CompletableFuture<GetWorkloadAccessTokenForJWTResponse> getWorkloadAccessTokenForJWT(GetWorkloadAccessTokenForJWTRequest request);

    /**
     * @param request the request parameters of GetWorkloadAccessTokenForUserId  GetWorkloadAccessTokenForUserIdRequest
     * @return GetWorkloadAccessTokenForUserIdResponse
     */
    CompletableFuture<GetWorkloadAccessTokenForUserIdResponse> getWorkloadAccessTokenForUserId(GetWorkloadAccessTokenForUserIdRequest request);

}
