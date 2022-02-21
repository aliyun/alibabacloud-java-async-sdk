// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.onsmqtt20200420.models.*;
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

    CompletableFuture<ApplyTokenResponse> applyToken(ApplyTokenRequest request);

    CompletableFuture<BatchQuerySessionByClientIdsResponse> batchQuerySessionByClientIds(BatchQuerySessionByClientIdsRequest request);

    CompletableFuture<CreateGroupIdResponse> createGroupId(CreateGroupIdRequest request);

    CompletableFuture<DeleteGroupIdResponse> deleteGroupId(DeleteGroupIdRequest request);

    CompletableFuture<GetDeviceCredentialResponse> getDeviceCredential(GetDeviceCredentialRequest request);

    CompletableFuture<ListGroupIdResponse> listGroupId(ListGroupIdRequest request);

    CompletableFuture<QueryMqttTraceDeviceResponse> queryMqttTraceDevice(QueryMqttTraceDeviceRequest request);

    CompletableFuture<QueryMqttTraceMessageOfClientResponse> queryMqttTraceMessageOfClient(QueryMqttTraceMessageOfClientRequest request);

    CompletableFuture<QueryMqttTraceMessagePublishResponse> queryMqttTraceMessagePublish(QueryMqttTraceMessagePublishRequest request);

    CompletableFuture<QueryMqttTraceMessageSubscribeResponse> queryMqttTraceMessageSubscribe(QueryMqttTraceMessageSubscribeRequest request);

    CompletableFuture<QuerySessionByClientIdResponse> querySessionByClientId(QuerySessionByClientIdRequest request);

    CompletableFuture<QueryTokenResponse> queryToken(QueryTokenRequest request);

    CompletableFuture<RefreshDeviceCredentialResponse> refreshDeviceCredential(RefreshDeviceCredentialRequest request);

    CompletableFuture<RegisterDeviceCredentialResponse> registerDeviceCredential(RegisterDeviceCredentialRequest request);

    CompletableFuture<RevokeTokenResponse> revokeToken(RevokeTokenRequest request);

    CompletableFuture<SendMessageResponse> sendMessage(SendMessageRequest request);

    CompletableFuture<UnRegisterDeviceCredentialResponse> unRegisterDeviceCredential(UnRegisterDeviceCredentialRequest request);

}
