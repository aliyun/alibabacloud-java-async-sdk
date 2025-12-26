// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pailangstudio20240710;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.pailangstudio20240710.models.*;
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
     * @param request the request parameters of CreateKnowledgeBase  CreateKnowledgeBaseRequest
     * @return CreateKnowledgeBaseResponse
     */
    CompletableFuture<CreateKnowledgeBaseResponse> createKnowledgeBase(CreateKnowledgeBaseRequest request);

    /**
     * @param request the request parameters of CreateKnowledgeBaseJob  CreateKnowledgeBaseJobRequest
     * @return CreateKnowledgeBaseJobResponse
     */
    CompletableFuture<CreateKnowledgeBaseJobResponse> createKnowledgeBaseJob(CreateKnowledgeBaseJobRequest request);

    /**
     * @param request the request parameters of DeleteKnowledgeBase  DeleteKnowledgeBaseRequest
     * @return DeleteKnowledgeBaseResponse
     */
    CompletableFuture<DeleteKnowledgeBaseResponse> deleteKnowledgeBase(DeleteKnowledgeBaseRequest request);

    /**
     * @param request the request parameters of DeleteKnowledgeBaseJob  DeleteKnowledgeBaseJobRequest
     * @return DeleteKnowledgeBaseJobResponse
     */
    CompletableFuture<DeleteKnowledgeBaseJobResponse> deleteKnowledgeBaseJob(DeleteKnowledgeBaseJobRequest request);

    /**
     * @param request the request parameters of GetKnowledgeBase  GetKnowledgeBaseRequest
     * @return GetKnowledgeBaseResponse
     */
    CompletableFuture<GetKnowledgeBaseResponse> getKnowledgeBase(GetKnowledgeBaseRequest request);

    /**
     * @param request the request parameters of GetKnowledgeBaseJob  GetKnowledgeBaseJobRequest
     * @return GetKnowledgeBaseJobResponse
     */
    CompletableFuture<GetKnowledgeBaseJobResponse> getKnowledgeBaseJob(GetKnowledgeBaseJobRequest request);

    /**
     * @param request the request parameters of ListKnowledgeBaseJobs  ListKnowledgeBaseJobsRequest
     * @return ListKnowledgeBaseJobsResponse
     */
    CompletableFuture<ListKnowledgeBaseJobsResponse> listKnowledgeBaseJobs(ListKnowledgeBaseJobsRequest request);

    /**
     * @param request the request parameters of ListKnowledgeBases  ListKnowledgeBasesRequest
     * @return ListKnowledgeBasesResponse
     */
    CompletableFuture<ListKnowledgeBasesResponse> listKnowledgeBases(ListKnowledgeBasesRequest request);

    /**
     * @param request the request parameters of RetrieveKnowledgeBase  RetrieveKnowledgeBaseRequest
     * @return RetrieveKnowledgeBaseResponse
     */
    CompletableFuture<RetrieveKnowledgeBaseResponse> retrieveKnowledgeBase(RetrieveKnowledgeBaseRequest request);

    /**
     * @param request the request parameters of UpdateKnowledgeBase  UpdateKnowledgeBaseRequest
     * @return UpdateKnowledgeBaseResponse
     */
    CompletableFuture<UpdateKnowledgeBaseResponse> updateKnowledgeBase(UpdateKnowledgeBaseRequest request);

    /**
     * @param request the request parameters of UpdateKnowledgeBaseJob  UpdateKnowledgeBaseJobRequest
     * @return UpdateKnowledgeBaseJobResponse
     */
    CompletableFuture<UpdateKnowledgeBaseJobResponse> updateKnowledgeBaseJob(UpdateKnowledgeBaseJobRequest request);

}
