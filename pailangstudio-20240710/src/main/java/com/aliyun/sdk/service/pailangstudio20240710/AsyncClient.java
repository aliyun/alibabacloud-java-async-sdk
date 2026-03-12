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
     * @param request the request parameters of CreateDeployment  CreateDeploymentRequest
     * @return CreateDeploymentResponse
     */
    CompletableFuture<CreateDeploymentResponse> createDeployment(CreateDeploymentRequest request);

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
     * @param request the request parameters of CreateRuntime  CreateRuntimeRequest
     * @return CreateRuntimeResponse
     */
    CompletableFuture<CreateRuntimeResponse> createRuntime(CreateRuntimeRequest request);

    /**
     * @param request the request parameters of CreateSnapshot  CreateSnapshotRequest
     * @return CreateSnapshotResponse
     */
    CompletableFuture<CreateSnapshotResponse> createSnapshot(CreateSnapshotRequest request);

    /**
     * @param request the request parameters of DeleteDeployment  DeleteDeploymentRequest
     * @return DeleteDeploymentResponse
     */
    CompletableFuture<DeleteDeploymentResponse> deleteDeployment(DeleteDeploymentRequest request);

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
     * @param request the request parameters of DeleteRuntime  DeleteRuntimeRequest
     * @return DeleteRuntimeResponse
     */
    CompletableFuture<DeleteRuntimeResponse> deleteRuntime(DeleteRuntimeRequest request);

    /**
     * @param request the request parameters of DeleteSnapshot  DeleteSnapshotRequest
     * @return DeleteSnapshotResponse
     */
    CompletableFuture<DeleteSnapshotResponse> deleteSnapshot(DeleteSnapshotRequest request);

    /**
     * @param request the request parameters of GetDeployment  GetDeploymentRequest
     * @return GetDeploymentResponse
     */
    CompletableFuture<GetDeploymentResponse> getDeployment(GetDeploymentRequest request);

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
     * @param request the request parameters of GetRuntime  GetRuntimeRequest
     * @return GetRuntimeResponse
     */
    CompletableFuture<GetRuntimeResponse> getRuntime(GetRuntimeRequest request);

    /**
     * @param request the request parameters of GetSnapshot  GetSnapshotRequest
     * @return GetSnapshotResponse
     */
    CompletableFuture<GetSnapshotResponse> getSnapshot(GetSnapshotRequest request);

    /**
     * @param request the request parameters of ListDeployments  ListDeploymentsRequest
     * @return ListDeploymentsResponse
     */
    CompletableFuture<ListDeploymentsResponse> listDeployments(ListDeploymentsRequest request);

    /**
     * @param request the request parameters of ListKnowledgeBaseChunks  ListKnowledgeBaseChunksRequest
     * @return ListKnowledgeBaseChunksResponse
     */
    CompletableFuture<ListKnowledgeBaseChunksResponse> listKnowledgeBaseChunks(ListKnowledgeBaseChunksRequest request);

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
     * @param request the request parameters of ListRuntimes  ListRuntimesRequest
     * @return ListRuntimesResponse
     */
    CompletableFuture<ListRuntimesResponse> listRuntimes(ListRuntimesRequest request);

    /**
     * @param request the request parameters of ListSnapshots  ListSnapshotsRequest
     * @return ListSnapshotsResponse
     */
    CompletableFuture<ListSnapshotsResponse> listSnapshots(ListSnapshotsRequest request);

    /**
     * @param request the request parameters of RetrieveKnowledgeBase  RetrieveKnowledgeBaseRequest
     * @return RetrieveKnowledgeBaseResponse
     */
    CompletableFuture<RetrieveKnowledgeBaseResponse> retrieveKnowledgeBase(RetrieveKnowledgeBaseRequest request);

    /**
     * @param request the request parameters of UpdateDeployment  UpdateDeploymentRequest
     * @return UpdateDeploymentResponse
     */
    CompletableFuture<UpdateDeploymentResponse> updateDeployment(UpdateDeploymentRequest request);

    /**
     * @param request the request parameters of UpdateKnowledgeBase  UpdateKnowledgeBaseRequest
     * @return UpdateKnowledgeBaseResponse
     */
    CompletableFuture<UpdateKnowledgeBaseResponse> updateKnowledgeBase(UpdateKnowledgeBaseRequest request);

    /**
     * @param request the request parameters of UpdateKnowledgeBaseChunk  UpdateKnowledgeBaseChunkRequest
     * @return UpdateKnowledgeBaseChunkResponse
     */
    CompletableFuture<UpdateKnowledgeBaseChunkResponse> updateKnowledgeBaseChunk(UpdateKnowledgeBaseChunkRequest request);

    /**
     * @param request the request parameters of UpdateKnowledgeBaseJob  UpdateKnowledgeBaseJobRequest
     * @return UpdateKnowledgeBaseJobResponse
     */
    CompletableFuture<UpdateKnowledgeBaseJobResponse> updateKnowledgeBaseJob(UpdateKnowledgeBaseJobRequest request);

    /**
     * @param request the request parameters of UpdateRuntime  UpdateRuntimeRequest
     * @return UpdateRuntimeResponse
     */
    CompletableFuture<UpdateRuntimeResponse> updateRuntime(UpdateRuntimeRequest request);

    /**
     * @param request the request parameters of UpdateSnapshot  UpdateSnapshotRequest
     * @return UpdateSnapshotResponse
     */
    CompletableFuture<UpdateSnapshotResponse> updateSnapshot(UpdateSnapshotRequest request);

}
