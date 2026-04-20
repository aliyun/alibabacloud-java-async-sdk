// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adbai20250812;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.adbai20250812.models.*;
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
     * @param request the request parameters of CreateAgentPlatform  CreateAgentPlatformRequest
     * @return CreateAgentPlatformResponse
     */
    CompletableFuture<CreateAgentPlatformResponse> createAgentPlatform(CreateAgentPlatformRequest request);

    /**
     * @param request the request parameters of CreateEmbodiedAIPlatform  CreateEmbodiedAIPlatformRequest
     * @return CreateEmbodiedAIPlatformResponse
     */
    CompletableFuture<CreateEmbodiedAIPlatformResponse> createEmbodiedAIPlatform(CreateEmbodiedAIPlatformRequest request);

    /**
     * @param request the request parameters of DeleteAgentPlatform  DeleteAgentPlatformRequest
     * @return DeleteAgentPlatformResponse
     */
    CompletableFuture<DeleteAgentPlatformResponse> deleteAgentPlatform(DeleteAgentPlatformRequest request);

    /**
     * @param request the request parameters of DeleteEmbodiedAIPlatform  DeleteEmbodiedAIPlatformRequest
     * @return DeleteEmbodiedAIPlatformResponse
     */
    CompletableFuture<DeleteEmbodiedAIPlatformResponse> deleteEmbodiedAIPlatform(DeleteEmbodiedAIPlatformRequest request);

    /**
     * @param request the request parameters of DescribeChatMessage  DescribeChatMessageRequest
     * @return DescribeChatMessageResponse
     */
    CompletableFuture<DescribeChatMessageResponse> describeChatMessage(DescribeChatMessageRequest request);

    ResponseIterable<DescribeChatMessageResponseBody> describeChatMessageWithResponseIterable(DescribeChatMessageRequest request);

    /**
     * @param request the request parameters of DescribeEmbodiedAIPlatforms  DescribeEmbodiedAIPlatformsRequest
     * @return DescribeEmbodiedAIPlatformsResponse
     */
    CompletableFuture<DescribeEmbodiedAIPlatformsResponse> describeEmbodiedAIPlatforms(DescribeEmbodiedAIPlatformsRequest request);

    /**
     * @param request the request parameters of GetEmbodiedAIPlatformResourceUsageInfo  GetEmbodiedAIPlatformResourceUsageInfoRequest
     * @return GetEmbodiedAIPlatformResourceUsageInfoResponse
     */
    CompletableFuture<GetEmbodiedAIPlatformResourceUsageInfoResponse> getEmbodiedAIPlatformResourceUsageInfo(GetEmbodiedAIPlatformResourceUsageInfoRequest request);

    /**
     * @param request the request parameters of LockEmbodiedAIPlatform  LockEmbodiedAIPlatformRequest
     * @return LockEmbodiedAIPlatformResponse
     */
    CompletableFuture<LockEmbodiedAIPlatformResponse> lockEmbodiedAIPlatform(LockEmbodiedAIPlatformRequest request);

    /**
     * @param request the request parameters of ModifyAgentPlatform  ModifyAgentPlatformRequest
     * @return ModifyAgentPlatformResponse
     */
    CompletableFuture<ModifyAgentPlatformResponse> modifyAgentPlatform(ModifyAgentPlatformRequest request);

    /**
     * @param request the request parameters of ModifyEmbodiedAIPlatform  ModifyEmbodiedAIPlatformRequest
     * @return ModifyEmbodiedAIPlatformResponse
     */
    CompletableFuture<ModifyEmbodiedAIPlatformResponse> modifyEmbodiedAIPlatform(ModifyEmbodiedAIPlatformRequest request);

    /**
     * @param request the request parameters of ResetEmbodiedAIPlatformPassword  ResetEmbodiedAIPlatformPasswordRequest
     * @return ResetEmbodiedAIPlatformPasswordResponse
     */
    CompletableFuture<ResetEmbodiedAIPlatformPasswordResponse> resetEmbodiedAIPlatformPassword(ResetEmbodiedAIPlatformPasswordRequest request);

    /**
     * @param request the request parameters of UnlockEmbodiedAIPlatform  UnlockEmbodiedAIPlatformRequest
     * @return UnlockEmbodiedAIPlatformResponse
     */
    CompletableFuture<UnlockEmbodiedAIPlatformResponse> unlockEmbodiedAIPlatform(UnlockEmbodiedAIPlatformRequest request);

}
