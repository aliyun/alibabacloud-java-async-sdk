// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appflow20230904;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.appflow20230904.models.*;
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
     * @param request the request parameters of CreateFlow  CreateFlowRequest
     * @return CreateFlowResponse
     */
    CompletableFuture<CreateFlowResponse> createFlow(CreateFlowRequest request);

    /**
     * @param request the request parameters of CreateUserAuthConfig  CreateUserAuthConfigRequest
     * @return CreateUserAuthConfigResponse
     */
    CompletableFuture<CreateUserAuthConfigResponse> createUserAuthConfig(CreateUserAuthConfigRequest request);

    /**
     * @param request the request parameters of DeleteFlow  DeleteFlowRequest
     * @return DeleteFlowResponse
     */
    CompletableFuture<DeleteFlowResponse> deleteFlow(DeleteFlowRequest request);

    /**
     * @param request the request parameters of DeleteUserAuthConfig  DeleteUserAuthConfigRequest
     * @return DeleteUserAuthConfigResponse
     */
    CompletableFuture<DeleteUserAuthConfigResponse> deleteUserAuthConfig(DeleteUserAuthConfigRequest request);

    /**
     * @param request the request parameters of DisableFlow  DisableFlowRequest
     * @return DisableFlowResponse
     */
    CompletableFuture<DisableFlowResponse> disableFlow(DisableFlowRequest request);

    /**
     * @param request the request parameters of EnableFlow  EnableFlowRequest
     * @return EnableFlowResponse
     */
    CompletableFuture<EnableFlowResponse> enableFlow(EnableFlowRequest request);

    /**
     * @param request the request parameters of GenerateUserSessionToken  GenerateUserSessionTokenRequest
     * @return GenerateUserSessionTokenResponse
     */
    CompletableFuture<GenerateUserSessionTokenResponse> generateUserSessionToken(GenerateUserSessionTokenRequest request);

    /**
     * @param request the request parameters of GetFlow  GetFlowRequest
     * @return GetFlowResponse
     */
    CompletableFuture<GetFlowResponse> getFlow(GetFlowRequest request);

    /**
     * @param request the request parameters of GetUserAuthConfig  GetUserAuthConfigRequest
     * @return GetUserAuthConfigResponse
     */
    CompletableFuture<GetUserAuthConfigResponse> getUserAuthConfig(GetUserAuthConfigRequest request);

    /**
     * @param request the request parameters of InvokeAction  InvokeActionRequest
     * @return InvokeActionResponse
     */
    CompletableFuture<InvokeActionResponse> invokeAction(InvokeActionRequest request);

    ResponseIterable<InvokeActionResponseBody> invokeActionWithResponseIterable(InvokeActionRequest request);

    /**
     * @param request the request parameters of LaunchFlow  LaunchFlowRequest
     * @return LaunchFlowResponse
     */
    CompletableFuture<LaunchFlowResponse> launchFlow(LaunchFlowRequest request);

    /**
     * @param request the request parameters of ListUserAuthConfigs  ListUserAuthConfigsRequest
     * @return ListUserAuthConfigsResponse
     */
    CompletableFuture<ListUserAuthConfigsResponse> listUserAuthConfigs(ListUserAuthConfigsRequest request);

    /**
     * @param request the request parameters of UpdateFlow  UpdateFlowRequest
     * @return UpdateFlowResponse
     */
    CompletableFuture<UpdateFlowResponse> updateFlow(UpdateFlowRequest request);

    /**
     * @param request the request parameters of UpdateUserAuthConfig  UpdateUserAuthConfigRequest
     * @return UpdateUserAuthConfigResponse
     */
    CompletableFuture<UpdateUserAuthConfigResponse> updateUserAuthConfig(UpdateUserAuthConfigRequest request);

    /**
     * @param request the request parameters of WithdrawFlow  WithdrawFlowRequest
     * @return WithdrawFlowResponse
     */
    CompletableFuture<WithdrawFlowResponse> withdrawFlow(WithdrawFlowRequest request);

}
