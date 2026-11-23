// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210218;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.appstream_center20210218.models.*;
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
     * <b>description</b> :
     * <p>When you call this operation, you must provide Resource and specify both ResourceType and ResourceId. Only a single cloud desktop is supported. You cannot omit Resource to authorize or query all cloud desktops.
     * AuthorizerId is the WyId of the user and cannot be replaced by a username. BusinessChannel supports Enterprise and Business. If omitted, the default value is Enterprise.
     * Before creation, the user must belong to the current calling account and have access permissions for the target cloud desktop. This operation only creates an access token. It does not create a user or add an authorization relationship between the user and the cloud desktop. Each successful call creates a new time-limited token. To obtain an existing token, call GetLatestThirdAppAccessToken and pass the same AuthorizerId and Resource.
     * The unit of Expiration is seconds. Valid values: 1 to 15552000. If omitted, the default value is 15552000, which equals 180 days. Permanent validity is not supported. Keep the returned AccessToken secure and avoid displaying the full token in logs or public content.</p>
     * 
     * @param request the request parameters of CreateThirdAppAccessToken  CreateThirdAppAccessTokenRequest
     * @return CreateThirdAppAccessTokenResponse
     */
    CompletableFuture<CreateThirdAppAccessTokenResponse> createThirdAppAccessToken(CreateThirdAppAccessTokenRequest request);

    /**
     * @param request the request parameters of ExpireLoginToken  ExpireLoginTokenRequest
     * @return ExpireLoginTokenResponse
     */
    CompletableFuture<ExpireLoginTokenResponse> expireLoginToken(ExpireLoginTokenRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves an authorization code that contains user identity and permission information, which can be used to invoke cloud applications in integration scenarios.</p>
     * 
     * @param request the request parameters of GetAuthCode  GetAuthCodeRequest
     * @return GetAuthCodeResponse
     */
    CompletableFuture<GetAuthCodeResponse> getAuthCode(GetAuthCodeRequest request);

    /**
     * <b>description</b> :
     * <p>You must provide Resource and specify both ResourceType and ResourceId when calling this operation. Only a single cloud desktop is supported. You cannot omit Resource to authorize or query all cloud desktops.
     * AuthorizerId is the WyId of the user and cannot be replaced by a username. BusinessChannel supports Enterprise and Business. If omitted, the default value is Enterprise.
     * The AuthorizerId and Resource in the query conditions must be consistent with those used when the token was created. This operation only returns the current valid token for the current account, user, and cloud desktop. It does not create a new token, renew the token, or restore or roll back to a historical token. If no valid token is found, the token has expired, or the corresponding cache has been cleared, AccessToken.NotFound is returned. To obtain a new token, call CreateThirdAppAccessToken.
     * Keep the returned AccessToken secure and avoid displaying the full token in logs or public content.</p>
     * 
     * @param request the request parameters of GetLatestThirdAppAccessToken  GetLatestThirdAppAccessTokenRequest
     * @return GetLatestThirdAppAccessTokenResponse
     */
    CompletableFuture<GetLatestThirdAppAccessTokenResponse> getLatestThirdAppAccessToken(GetLatestThirdAppAccessTokenRequest request);

    /**
     * @param request the request parameters of GetStsToken  GetStsTokenRequest
     * @return GetStsTokenResponse
     */
    CompletableFuture<GetStsTokenResponse> getStsToken(GetStsTokenRequest request);

}
