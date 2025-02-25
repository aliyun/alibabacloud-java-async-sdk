// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20191211;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.onsmqtt20191211.models.*;
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

    CompletableFuture<ApplyTokenResponse> applyToken(ApplyTokenRequest request);

    CompletableFuture<BatchQuerySessionByClientIdsResponse> batchQuerySessionByClientIds(BatchQuerySessionByClientIdsRequest request);

    CompletableFuture<BatchSendMessagesResponse> batchSendMessages(BatchSendMessagesRequest request);

    CompletableFuture<CreateGroupIdResponse> createGroupId(CreateGroupIdRequest request);

    CompletableFuture<DeleteGroupIdResponse> deleteGroupId(DeleteGroupIdRequest request);

    CompletableFuture<ListGroupIdResponse> listGroupId(ListGroupIdRequest request);

    CompletableFuture<QuerySessionByClientIdResponse> querySessionByClientId(QuerySessionByClientIdRequest request);

    CompletableFuture<QueryTokenResponse> queryToken(QueryTokenRequest request);

    CompletableFuture<RevokeTokenResponse> revokeToken(RevokeTokenRequest request);

    CompletableFuture<SendMessageResponse> sendMessage(SendMessageRequest request);

}
