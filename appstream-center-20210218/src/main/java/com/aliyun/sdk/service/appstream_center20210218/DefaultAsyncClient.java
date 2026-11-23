// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210218;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.appstream_center20210218.models.*;
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
        this.product = "appstream-center";
        this.version = "2021-02-18";
        this.endpointRule = "regional";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
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
    @Override
    public CompletableFuture<CreateThirdAppAccessTokenResponse> createThirdAppAccessToken(CreateThirdAppAccessTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateThirdAppAccessToken").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateThirdAppAccessTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateThirdAppAccessTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExpireLoginToken  ExpireLoginTokenRequest
     * @return ExpireLoginTokenResponse
     */
    @Override
    public CompletableFuture<ExpireLoginTokenResponse> expireLoginToken(ExpireLoginTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ExpireLoginToken").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExpireLoginTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExpireLoginTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Retrieves an authorization code that contains user identity and permission information, which can be used to invoke cloud applications in integration scenarios.</p>
     * 
     * @param request the request parameters of GetAuthCode  GetAuthCodeRequest
     * @return GetAuthCodeResponse
     */
    @Override
    public CompletableFuture<GetAuthCodeResponse> getAuthCode(GetAuthCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAuthCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAuthCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAuthCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetLatestThirdAppAccessTokenResponse> getLatestThirdAppAccessToken(GetLatestThirdAppAccessTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetLatestThirdAppAccessToken").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLatestThirdAppAccessTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLatestThirdAppAccessTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetStsToken  GetStsTokenRequest
     * @return GetStsTokenResponse
     */
    @Override
    public CompletableFuture<GetStsTokenResponse> getStsToken(GetStsTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetStsToken").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetStsTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetStsTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
