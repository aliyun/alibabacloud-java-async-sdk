// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.notifications20241225;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.notifications20241225.models.*;
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
     * @param request the request parameters of DelMessage  DelMessageRequest
     * @return DelMessageResponse
     */
    CompletableFuture<DelMessageResponse> delMessage(DelMessageRequest request);

    /**
     * @param request the request parameters of DeleteAllMessage  DeleteAllMessageRequest
     * @return DeleteAllMessageResponse
     */
    CompletableFuture<DeleteAllMessageResponse> deleteAllMessage(DeleteAllMessageRequest request);

    /**
     * @param request the request parameters of ReadAllMessage  ReadAllMessageRequest
     * @return ReadAllMessageResponse
     */
    CompletableFuture<ReadAllMessageResponse> readAllMessage(ReadAllMessageRequest request);

    /**
     * @param request the request parameters of ReadClassName  ReadClassNameRequest
     * @return ReadClassNameResponse
     */
    CompletableFuture<ReadClassNameResponse> readClassName(ReadClassNameRequest request);

    /**
     * @param request the request parameters of ReadMessage  ReadMessageRequest
     * @return ReadMessageResponse
     */
    CompletableFuture<ReadMessageResponse> readMessage(ReadMessageRequest request);

    /**
     * @param request the request parameters of ReadMessageContent  ReadMessageContentRequest
     * @return ReadMessageContentResponse
     */
    CompletableFuture<ReadMessageContentResponse> readMessageContent(ReadMessageContentRequest request);

    /**
     * @param request the request parameters of ReadMessageList  ReadMessageListRequest
     * @return ReadMessageListResponse
     */
    CompletableFuture<ReadMessageListResponse> readMessageList(ReadMessageListRequest request);

    /**
     * @param request the request parameters of ReadMessageNewTotal  ReadMessageNewTotalRequest
     * @return ReadMessageNewTotalResponse
     */
    CompletableFuture<ReadMessageNewTotalResponse> readMessageNewTotal(ReadMessageNewTotalRequest request);

    /**
     * @param request the request parameters of ReadNumGroupByClass  ReadNumGroupByClassRequest
     * @return ReadNumGroupByClassResponse
     */
    CompletableFuture<ReadNumGroupByClassResponse> readNumGroupByClass(ReadNumGroupByClassRequest request);

    /**
     * @param request the request parameters of ReadNumGroupTotal  ReadNumGroupTotalRequest
     * @return ReadNumGroupTotalResponse
     */
    CompletableFuture<ReadNumGroupTotalResponse> readNumGroupTotal(ReadNumGroupTotalRequest request);

}
