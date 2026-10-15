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
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>Call this operation over HTTPS POST, sign the request with an AccessKey pair or STS credentials, and grant the ecd:CreateUserInvitationCode permission. You can only create management codes for users and terminal groups that belong to the Alibaba Cloud account of the caller identity.</li>
     * <li>You must specify either EndUserIds or the single-user compatible parameter EndUserId. Batch requests support 1 to 100 users. An independent eight-digit management code is generated for each user. Empty items or duplicate users are not supported.</li>
     * <li>Users in a single request share the same TerminalGroupId and ValidityMinutes. Repeated calls can create multiple different management codes for the same user.</li>
     * <li>Both users and groups must already exist and belong to the current account. The group cannot be in a deleted state. After parameter and user validation passes, the entire batch is written. The system does not create codes user by user and return partial results.</li>
     * <li>A management code is a terminal redemption credential. Provide it to the corresponding user only through trusted channels and avoid recording the complete code in public logs.</li>
     * <li>The returned Data is always an array, even if only one code is created, in which case it is a single-element array. Creating a code does not mean that the terminal has completed management. A UUID and binding time are generated only after the device uses the code to complete management.</li>
     * <li>Status indicates only the usage status: ACTIVE means unused, and USED means used. To determine whether a code has expired, refer to the Expired field returned by the server. The EXPIRED status is not used.</li>
     * <li>This operation does not have a ClientToken parameter for business idempotence. Resending a creation request may generate a new management code. If you encounter uncertain results such as timeouts, check whether the code has been created before retrying unconditionally.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateUserInvitationCode  CreateUserInvitationCodeRequest
     * @return CreateUserInvitationCodeResponse
     */
    CompletableFuture<CreateUserInvitationCodeResponse> createUserInvitationCode(CreateUserInvitationCodeRequest request);

    /**
     * @param request the request parameters of DeleteClients  DeleteClientsRequest
     * @return DeleteClientsResponse
     */
    CompletableFuture<DeleteClientsResponse> deleteClients(DeleteClientsRequest request);

    /**
     * @param request the request parameters of DescribeClients  DescribeClientsRequest
     * @return DescribeClientsResponse
     */
    CompletableFuture<DescribeClientsResponse> describeClients(DescribeClientsRequest request);

    /**
     * @param request the request parameters of GetCustomResourceStats  GetCustomResourceStatsRequest
     * @return GetCustomResourceStatsResponse
     */
    CompletableFuture<GetCustomResourceStatsResponse> getCustomResourceStats(GetCustomResourceStatsRequest request);

    /**
     * @param request the request parameters of GetOrCreateInvitationCode  GetOrCreateInvitationCodeRequest
     * @return GetOrCreateInvitationCodeResponse
     */
    CompletableFuture<GetOrCreateInvitationCodeResponse> getOrCreateInvitationCode(GetOrCreateInvitationCodeRequest request);

    /**
     * @param request the request parameters of GetTerminalCount  GetTerminalCountRequest
     * @return GetTerminalCountResponse
     */
    CompletableFuture<GetTerminalCountResponse> getTerminalCount(GetTerminalCountRequest request);

    /**
     * @param request the request parameters of ListTerminal  ListTerminalRequest
     * @return ListTerminalResponse
     */
    CompletableFuture<ListTerminalResponse> listTerminal(ListTerminalRequest request);

    /**
     * @param request the request parameters of ListVersionDistribution  ListVersionDistributionRequest
     * @return ListVersionDistributionResponse
     */
    CompletableFuture<ListVersionDistributionResponse> listVersionDistribution(ListVersionDistributionRequest request);

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
     * @param request the request parameters of UnbindPasswordFreeLoginUser  UnbindPasswordFreeLoginUserRequest
     * @return UnbindPasswordFreeLoginUserResponse
     */
    CompletableFuture<UnbindPasswordFreeLoginUserResponse> unbindPasswordFreeLoginUser(UnbindPasswordFreeLoginUserRequest request);

}
