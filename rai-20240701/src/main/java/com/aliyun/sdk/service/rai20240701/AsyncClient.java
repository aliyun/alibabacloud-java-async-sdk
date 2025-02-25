// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rai20240701;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.rai20240701.models.*;
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
     * @param request the request parameters of BatchContentAsyncDetect  BatchContentAsyncDetectRequest
     * @return BatchContentAsyncDetectResponse
     */
    CompletableFuture<BatchContentAsyncDetectResponse> batchContentAsyncDetect(BatchContentAsyncDetectRequest request);

    /**
     * @param request the request parameters of BatchContentSyncDetect  BatchContentSyncDetectRequest
     * @return BatchContentSyncDetectResponse
     */
    CompletableFuture<BatchContentSyncDetectResponse> batchContentSyncDetect(BatchContentSyncDetectRequest request);

    /**
     * @param request the request parameters of CheckAccount  CheckAccountRequest
     * @return CheckAccountResponse
     */
    CompletableFuture<CheckAccountResponse> checkAccount(CheckAccountRequest request);

    /**
     * @param request the request parameters of ContentAsyncDetect  ContentAsyncDetectRequest
     * @return ContentAsyncDetectResponse
     */
    CompletableFuture<ContentAsyncDetectResponse> contentAsyncDetect(ContentAsyncDetectRequest request);

    /**
     * @param request the request parameters of ContentSyncDetect  ContentSyncDetectRequest
     * @return ContentSyncDetectResponse
     */
    CompletableFuture<ContentSyncDetectResponse> contentSyncDetect(ContentSyncDetectRequest request);

    /**
     * @param request the request parameters of GetContentDetectResult  GetContentDetectResultRequest
     * @return GetContentDetectResultResponse
     */
    CompletableFuture<GetContentDetectResultResponse> getContentDetectResult(GetContentDetectResultRequest request);

    /**
     * @param request the request parameters of ListSensitiveWord  ListSensitiveWordRequest
     * @return ListSensitiveWordResponse
     */
    CompletableFuture<ListSensitiveWordResponse> listSensitiveWord(ListSensitiveWordRequest request);

    /**
     * @param request the request parameters of RegisterAccount  RegisterAccountRequest
     * @return RegisterAccountResponse
     */
    CompletableFuture<RegisterAccountResponse> registerAccount(RegisterAccountRequest request);

    /**
     * @param request the request parameters of SyncSensitiveWord  SyncSensitiveWordRequest
     * @return SyncSensitiveWordResponse
     */
    CompletableFuture<SyncSensitiveWordResponse> syncSensitiveWord(SyncSensitiveWordRequest request);

}
