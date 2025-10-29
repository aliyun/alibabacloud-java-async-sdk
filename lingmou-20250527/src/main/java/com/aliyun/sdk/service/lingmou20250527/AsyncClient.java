// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lingmou20250527;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.lingmou20250527.models.*;
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
     * @param request the request parameters of CloseChatInstanceSessions  CloseChatInstanceSessionsRequest
     * @return CloseChatInstanceSessionsResponse
     */
    CompletableFuture<CloseChatInstanceSessionsResponse> closeChatInstanceSessions(CloseChatInstanceSessionsRequest request);

    /**
     * @param request the request parameters of CreateBackgroundPic  CreateBackgroundPicRequest
     * @return CreateBackgroundPicResponse
     */
    CompletableFuture<CreateBackgroundPicResponse> createBackgroundPic(CreateBackgroundPicRequest request);

    /**
     * @param request the request parameters of CreateChatConfig  CreateChatConfigRequest
     * @return CreateChatConfigResponse
     */
    CompletableFuture<CreateChatConfigResponse> createChatConfig(CreateChatConfigRequest request);

    /**
     * @param request the request parameters of CreateChatSession  CreateChatSessionRequest
     * @return CreateChatSessionResponse
     */
    CompletableFuture<CreateChatSessionResponse> createChatSession(CreateChatSessionRequest request);

    /**
     * @param request the request parameters of CreateNoTrainPicAvatar  CreateNoTrainPicAvatarRequest
     * @return CreateNoTrainPicAvatarResponse
     */
    CompletableFuture<CreateNoTrainPicAvatarResponse> createNoTrainPicAvatar(CreateNoTrainPicAvatarRequest request);

    /**
     * @param request the request parameters of GetUploadPolicy  GetUploadPolicyRequest
     * @return GetUploadPolicyResponse
     */
    CompletableFuture<GetUploadPolicyResponse> getUploadPolicy(GetUploadPolicyRequest request);

    /**
     * @param request the request parameters of QueryChatInstanceSessions  QueryChatInstanceSessionsRequest
     * @return QueryChatInstanceSessionsResponse
     */
    CompletableFuture<QueryChatInstanceSessionsResponse> queryChatInstanceSessions(QueryChatInstanceSessionsRequest request);

}
