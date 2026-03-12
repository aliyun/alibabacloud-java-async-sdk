// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pailangstudio20240710;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.pailangstudio20240710.models.*;
import darabonba.core.utils.*;
import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;

import java.util.concurrent.CompletableFuture;


/**
 * <p>Main client.</p>
 */
public final class DefaultAsyncClient implements AsyncClient {

    protected final String product;
    protected final String version;
    protected final String endpointRule;
    protected final java.util.Map<String, String> endpointMap;
    protected final TeaRequest REQUEST;
    protected final TeaAsyncHandler handler;

    protected DefaultAsyncClient(ClientConfiguration configuration) {
        this.handler = new TeaAsyncHandler(configuration);
        this.product = "PAILangStudio";
        this.version = "2024-07-10";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of CreateDeployment  CreateDeploymentRequest
     * @return CreateDeploymentResponse
     */
    @Override
    public CompletableFuture<CreateDeploymentResponse> createDeployment(CreateDeploymentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateDeployment").setMethod(HttpMethod.POST).setPathRegex("/api/v1/langstudio/deployments").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDeploymentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDeploymentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateKnowledgeBase  CreateKnowledgeBaseRequest
     * @return CreateKnowledgeBaseResponse
     */
    @Override
    public CompletableFuture<CreateKnowledgeBaseResponse> createKnowledgeBase(CreateKnowledgeBaseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateKnowledgeBase").setMethod(HttpMethod.POST).setPathRegex("/api/v1/langstudio/knowledgebases").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateKnowledgeBaseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateKnowledgeBaseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateKnowledgeBaseJob  CreateKnowledgeBaseJobRequest
     * @return CreateKnowledgeBaseJobResponse
     */
    @Override
    public CompletableFuture<CreateKnowledgeBaseJobResponse> createKnowledgeBaseJob(CreateKnowledgeBaseJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateKnowledgeBaseJob").setMethod(HttpMethod.POST).setPathRegex("/api/v1/langstudio/knowledgebases/{KnowledgeBaseId}/knowledgebasejobs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateKnowledgeBaseJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateKnowledgeBaseJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateRuntime  CreateRuntimeRequest
     * @return CreateRuntimeResponse
     */
    @Override
    public CompletableFuture<CreateRuntimeResponse> createRuntime(CreateRuntimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateRuntime").setMethod(HttpMethod.POST).setPathRegex("/api/v1/langstudio/runtimes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRuntimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRuntimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSnapshot  CreateSnapshotRequest
     * @return CreateSnapshotResponse
     */
    @Override
    public CompletableFuture<CreateSnapshotResponse> createSnapshot(CreateSnapshotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateSnapshot").setMethod(HttpMethod.POST).setPathRegex("/api/v1/langstudio/snapshots").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSnapshotResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSnapshotResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDeployment  DeleteDeploymentRequest
     * @return DeleteDeploymentResponse
     */
    @Override
    public CompletableFuture<DeleteDeploymentResponse> deleteDeployment(DeleteDeploymentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteDeployment").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/langstudio/deployments/{DeploymentId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDeploymentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDeploymentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteKnowledgeBase  DeleteKnowledgeBaseRequest
     * @return DeleteKnowledgeBaseResponse
     */
    @Override
    public CompletableFuture<DeleteKnowledgeBaseResponse> deleteKnowledgeBase(DeleteKnowledgeBaseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteKnowledgeBase").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/langstudio/knowledgebases/{KnowledgeBaseId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteKnowledgeBaseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteKnowledgeBaseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteKnowledgeBaseJob  DeleteKnowledgeBaseJobRequest
     * @return DeleteKnowledgeBaseJobResponse
     */
    @Override
    public CompletableFuture<DeleteKnowledgeBaseJobResponse> deleteKnowledgeBaseJob(DeleteKnowledgeBaseJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteKnowledgeBaseJob").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/langstudio/knowledgebases/{KnowledgeBaseId}/knowledgebasejobs/{KnowledgeBaseJobId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteKnowledgeBaseJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteKnowledgeBaseJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteRuntime  DeleteRuntimeRequest
     * @return DeleteRuntimeResponse
     */
    @Override
    public CompletableFuture<DeleteRuntimeResponse> deleteRuntime(DeleteRuntimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteRuntime").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/langstudio/runtimes/{RuntimeId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRuntimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRuntimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSnapshot  DeleteSnapshotRequest
     * @return DeleteSnapshotResponse
     */
    @Override
    public CompletableFuture<DeleteSnapshotResponse> deleteSnapshot(DeleteSnapshotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteSnapshot").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/langstudio/snapshots/{SnapshotId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSnapshotResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSnapshotResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDeployment  GetDeploymentRequest
     * @return GetDeploymentResponse
     */
    @Override
    public CompletableFuture<GetDeploymentResponse> getDeployment(GetDeploymentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDeployment").setMethod(HttpMethod.GET).setPathRegex("/api/v1/langstudio/deployments/{DeploymentId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDeploymentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDeploymentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetKnowledgeBase  GetKnowledgeBaseRequest
     * @return GetKnowledgeBaseResponse
     */
    @Override
    public CompletableFuture<GetKnowledgeBaseResponse> getKnowledgeBase(GetKnowledgeBaseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetKnowledgeBase").setMethod(HttpMethod.GET).setPathRegex("/api/v1/langstudio/knowledgebases/{KnowledgeBaseId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetKnowledgeBaseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetKnowledgeBaseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetKnowledgeBaseJob  GetKnowledgeBaseJobRequest
     * @return GetKnowledgeBaseJobResponse
     */
    @Override
    public CompletableFuture<GetKnowledgeBaseJobResponse> getKnowledgeBaseJob(GetKnowledgeBaseJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetKnowledgeBaseJob").setMethod(HttpMethod.GET).setPathRegex("/api/v1/langstudio/knowledgebases/{KnowledgeBaseId}/knowledgebasejobs/{KnowledgeBaseJobId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetKnowledgeBaseJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetKnowledgeBaseJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetRuntime  GetRuntimeRequest
     * @return GetRuntimeResponse
     */
    @Override
    public CompletableFuture<GetRuntimeResponse> getRuntime(GetRuntimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetRuntime").setMethod(HttpMethod.GET).setPathRegex("/api/v1/langstudio/runtimes/{RuntimeId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRuntimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRuntimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSnapshot  GetSnapshotRequest
     * @return GetSnapshotResponse
     */
    @Override
    public CompletableFuture<GetSnapshotResponse> getSnapshot(GetSnapshotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetSnapshot").setMethod(HttpMethod.GET).setPathRegex("/api/v1/langstudio/snapshots/{SnapshotId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSnapshotResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSnapshotResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDeployments  ListDeploymentsRequest
     * @return ListDeploymentsResponse
     */
    @Override
    public CompletableFuture<ListDeploymentsResponse> listDeployments(ListDeploymentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDeployments").setMethod(HttpMethod.GET).setPathRegex("/api/v1/langstudio/deployments").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDeploymentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDeploymentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListKnowledgeBaseChunks  ListKnowledgeBaseChunksRequest
     * @return ListKnowledgeBaseChunksResponse
     */
    @Override
    public CompletableFuture<ListKnowledgeBaseChunksResponse> listKnowledgeBaseChunks(ListKnowledgeBaseChunksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListKnowledgeBaseChunks").setMethod(HttpMethod.GET).setPathRegex("/api/v1/langstudio/knowledgebases/{KnowledgeBaseId}/knowledgebasechunks").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListKnowledgeBaseChunksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListKnowledgeBaseChunksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListKnowledgeBaseJobs  ListKnowledgeBaseJobsRequest
     * @return ListKnowledgeBaseJobsResponse
     */
    @Override
    public CompletableFuture<ListKnowledgeBaseJobsResponse> listKnowledgeBaseJobs(ListKnowledgeBaseJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListKnowledgeBaseJobs").setMethod(HttpMethod.GET).setPathRegex("/api/v1/langstudio/knowledgebases/{KnowledgeBaseId}/knowledgebasejobs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListKnowledgeBaseJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListKnowledgeBaseJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListKnowledgeBases  ListKnowledgeBasesRequest
     * @return ListKnowledgeBasesResponse
     */
    @Override
    public CompletableFuture<ListKnowledgeBasesResponse> listKnowledgeBases(ListKnowledgeBasesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListKnowledgeBases").setMethod(HttpMethod.GET).setPathRegex("/api/v1/langstudio/knowledgebases").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListKnowledgeBasesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListKnowledgeBasesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRuntimes  ListRuntimesRequest
     * @return ListRuntimesResponse
     */
    @Override
    public CompletableFuture<ListRuntimesResponse> listRuntimes(ListRuntimesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListRuntimes").setMethod(HttpMethod.GET).setPathRegex("/api/v1/langstudio/runtimes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRuntimesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRuntimesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSnapshots  ListSnapshotsRequest
     * @return ListSnapshotsResponse
     */
    @Override
    public CompletableFuture<ListSnapshotsResponse> listSnapshots(ListSnapshotsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSnapshots").setMethod(HttpMethod.GET).setPathRegex("/api/v1/langstudio/snapshots").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSnapshotsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSnapshotsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RetrieveKnowledgeBase  RetrieveKnowledgeBaseRequest
     * @return RetrieveKnowledgeBaseResponse
     */
    @Override
    public CompletableFuture<RetrieveKnowledgeBaseResponse> retrieveKnowledgeBase(RetrieveKnowledgeBaseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RetrieveKnowledgeBase").setMethod(HttpMethod.POST).setPathRegex("/api/v1/langstudio/knowledgebases/{KnowledgeBaseId}/action/retrieve").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RetrieveKnowledgeBaseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RetrieveKnowledgeBaseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateDeployment  UpdateDeploymentRequest
     * @return UpdateDeploymentResponse
     */
    @Override
    public CompletableFuture<UpdateDeploymentResponse> updateDeployment(UpdateDeploymentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateDeployment").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/langstudio/deployments/{DeploymentId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDeploymentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDeploymentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateKnowledgeBase  UpdateKnowledgeBaseRequest
     * @return UpdateKnowledgeBaseResponse
     */
    @Override
    public CompletableFuture<UpdateKnowledgeBaseResponse> updateKnowledgeBase(UpdateKnowledgeBaseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateKnowledgeBase").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/langstudio/knowledgebases/{KnowledgeBaseId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateKnowledgeBaseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateKnowledgeBaseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateKnowledgeBaseChunk  UpdateKnowledgeBaseChunkRequest
     * @return UpdateKnowledgeBaseChunkResponse
     */
    @Override
    public CompletableFuture<UpdateKnowledgeBaseChunkResponse> updateKnowledgeBaseChunk(UpdateKnowledgeBaseChunkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateKnowledgeBaseChunk").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/langstudio/knowledgebases/{KnowledgeBaseId}/knowledgebasechunks/{KnowledgeBaseChunkId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateKnowledgeBaseChunkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateKnowledgeBaseChunkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateKnowledgeBaseJob  UpdateKnowledgeBaseJobRequest
     * @return UpdateKnowledgeBaseJobResponse
     */
    @Override
    public CompletableFuture<UpdateKnowledgeBaseJobResponse> updateKnowledgeBaseJob(UpdateKnowledgeBaseJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateKnowledgeBaseJob").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/langstudio/knowledgebases/{KnowledgeBaseId}/knowledgebasejobs/{KnowledgeBaseJobId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateKnowledgeBaseJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateKnowledgeBaseJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateRuntime  UpdateRuntimeRequest
     * @return UpdateRuntimeResponse
     */
    @Override
    public CompletableFuture<UpdateRuntimeResponse> updateRuntime(UpdateRuntimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateRuntime").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/langstudio/runtimes/{RuntimeId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateRuntimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateRuntimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateSnapshot  UpdateSnapshotRequest
     * @return UpdateSnapshotResponse
     */
    @Override
    public CompletableFuture<UpdateSnapshotResponse> updateSnapshot(UpdateSnapshotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateSnapshot").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/langstudio/snapshots/{SnapshotId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSnapshotResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSnapshotResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
