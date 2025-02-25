// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tingwu20230930;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.tingwu20230930.models.*;
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
     * @param request the request parameters of CreateTask  CreateTaskRequest
     * @return CreateTaskResponse
     */
    CompletableFuture<CreateTaskResponse> createTask(CreateTaskRequest request);

    /**
     * @param request the request parameters of CreateTranscriptionPhrases  CreateTranscriptionPhrasesRequest
     * @return CreateTranscriptionPhrasesResponse
     */
    CompletableFuture<CreateTranscriptionPhrasesResponse> createTranscriptionPhrases(CreateTranscriptionPhrasesRequest request);

    /**
     * @param request the request parameters of DeleteTranscriptionPhrases  DeleteTranscriptionPhrasesRequest
     * @return DeleteTranscriptionPhrasesResponse
     */
    CompletableFuture<DeleteTranscriptionPhrasesResponse> deleteTranscriptionPhrases(DeleteTranscriptionPhrasesRequest request);

    /**
     * @param request the request parameters of GetTaskInfo  GetTaskInfoRequest
     * @return GetTaskInfoResponse
     */
    CompletableFuture<GetTaskInfoResponse> getTaskInfo(GetTaskInfoRequest request);

    /**
     * @param request the request parameters of GetTranscriptionPhrases  GetTranscriptionPhrasesRequest
     * @return GetTranscriptionPhrasesResponse
     */
    CompletableFuture<GetTranscriptionPhrasesResponse> getTranscriptionPhrases(GetTranscriptionPhrasesRequest request);

    /**
     * @param request the request parameters of ListTranscriptionPhrases  ListTranscriptionPhrasesRequest
     * @return ListTranscriptionPhrasesResponse
     */
    CompletableFuture<ListTranscriptionPhrasesResponse> listTranscriptionPhrases(ListTranscriptionPhrasesRequest request);

    /**
     * @param request the request parameters of UpdateTranscriptionPhrases  UpdateTranscriptionPhrasesRequest
     * @return UpdateTranscriptionPhrasesResponse
     */
    CompletableFuture<UpdateTranscriptionPhrasesResponse> updateTranscriptionPhrases(UpdateTranscriptionPhrasesRequest request);

}
