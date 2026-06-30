// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.realtranslationagent20260622;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.realtranslationagent20260622.models.*;
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
     * @param request the request parameters of CancelTranslationTask  CancelTranslationTaskRequest
     * @return CancelTranslationTaskResponse
     */
    CompletableFuture<CancelTranslationTaskResponse> cancelTranslationTask(CancelTranslationTaskRequest request);

    /**
     * @param request the request parameters of GetOriginalFileUrl  GetOriginalFileUrlRequest
     * @return GetOriginalFileUrlResponse
     */
    CompletableFuture<GetOriginalFileUrlResponse> getOriginalFileUrl(GetOriginalFileUrlRequest request);

    /**
     * @param request the request parameters of GetTranslatedFileUrl  GetTranslatedFileUrlRequest
     * @return GetTranslatedFileUrlResponse
     */
    CompletableFuture<GetTranslatedFileUrlResponse> getTranslatedFileUrl(GetTranslatedFileUrlRequest request);

    /**
     * @param request the request parameters of GetTranslationTask  GetTranslationTaskRequest
     * @return GetTranslationTaskResponse
     */
    CompletableFuture<GetTranslationTaskResponse> getTranslationTask(GetTranslationTaskRequest request);

    /**
     * @param request the request parameters of ListTranslationTasks  ListTranslationTasksRequest
     * @return ListTranslationTasksResponse
     */
    CompletableFuture<ListTranslationTasksResponse> listTranslationTasks(ListTranslationTasksRequest request);

    /**
     * @param request the request parameters of SubmitTranslationTask  SubmitTranslationTaskRequest
     * @return SubmitTranslationTaskResponse
     */
    CompletableFuture<SubmitTranslationTaskResponse> submitTranslationTask(SubmitTranslationTaskRequest request);

}
