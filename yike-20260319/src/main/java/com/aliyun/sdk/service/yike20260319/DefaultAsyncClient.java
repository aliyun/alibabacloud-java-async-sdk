// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260319;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.yike20260319.models.*;
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
        this.product = "Yike";
        this.version = "2026-03-19";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-shanghai", "yike.cn-shanghai.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AddYikeProductionMembers  AddYikeProductionMembersRequest
     * @return AddYikeProductionMembersResponse
     */
    @Override
    public CompletableFuture<AddYikeProductionMembersResponse> addYikeProductionMembers(AddYikeProductionMembersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddYikeProductionMembers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddYikeProductionMembersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddYikeProductionMembersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddYikeUserCredit  AddYikeUserCreditRequest
     * @return AddYikeUserCreditResponse
     */
    @Override
    public CompletableFuture<AddYikeUserCreditResponse> addYikeUserCredit(AddYikeUserCreditRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddYikeUserCredit").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddYikeUserCreditResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddYikeUserCreditResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchGetYikeAIAppJob  BatchGetYikeAIAppJobRequest
     * @return BatchGetYikeAIAppJobResponse
     */
    @Override
    public CompletableFuture<BatchGetYikeAIAppJobResponse> batchGetYikeAIAppJob(BatchGetYikeAIAppJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchGetYikeAIAppJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchGetYikeAIAppJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchGetYikeAIAppJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchGetYikeAssetMediaInfos  BatchGetYikeAssetMediaInfosRequest
     * @return BatchGetYikeAssetMediaInfosResponse
     */
    @Override
    public CompletableFuture<BatchGetYikeAssetMediaInfosResponse> batchGetYikeAssetMediaInfos(BatchGetYikeAssetMediaInfosRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchGetYikeAssetMediaInfos").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchGetYikeAssetMediaInfosResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchGetYikeAssetMediaInfosResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateYikeAssetUpload  CreateYikeAssetUploadRequest
     * @return CreateYikeAssetUploadResponse
     */
    @Override
    public CompletableFuture<CreateYikeAssetUploadResponse> createYikeAssetUpload(CreateYikeAssetUploadRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateYikeAssetUpload").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateYikeAssetUploadResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateYikeAssetUploadResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateYikeProduction  CreateYikeProductionRequest
     * @return CreateYikeProductionResponse
     */
    @Override
    public CompletableFuture<CreateYikeProductionResponse> createYikeProduction(CreateYikeProductionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateYikeProduction").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateYikeProductionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateYikeProductionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateYikeUser  CreateYikeUserRequest
     * @return CreateYikeUserResponse
     */
    @Override
    public CompletableFuture<CreateYikeUserResponse> createYikeUser(CreateYikeUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateYikeUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateYikeUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateYikeUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateYikeWorkspace  CreateYikeWorkspaceRequest
     * @return CreateYikeWorkspaceResponse
     */
    @Override
    public CompletableFuture<CreateYikeWorkspaceResponse> createYikeWorkspace(CreateYikeWorkspaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateYikeWorkspace").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateYikeWorkspaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateYikeWorkspaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteYikeAssetMediaInfos  DeleteYikeAssetMediaInfosRequest
     * @return DeleteYikeAssetMediaInfosResponse
     */
    @Override
    public CompletableFuture<DeleteYikeAssetMediaInfosResponse> deleteYikeAssetMediaInfos(DeleteYikeAssetMediaInfosRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteYikeAssetMediaInfos").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteYikeAssetMediaInfosResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteYikeAssetMediaInfosResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetImageGenerationJob  GetImageGenerationJobRequest
     * @return GetImageGenerationJobResponse
     */
    @Override
    public CompletableFuture<GetImageGenerationJobResponse> getImageGenerationJob(GetImageGenerationJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetImageGenerationJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetImageGenerationJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetImageGenerationJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetVideoGenerationJob  GetVideoGenerationJobRequest
     * @return GetVideoGenerationJobResponse
     */
    @Override
    public CompletableFuture<GetVideoGenerationJobResponse> getVideoGenerationJob(GetVideoGenerationJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetVideoGenerationJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVideoGenerationJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVideoGenerationJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetYikeAIAppJob  GetYikeAIAppJobRequest
     * @return GetYikeAIAppJobResponse
     */
    @Override
    public CompletableFuture<GetYikeAIAppJobResponse> getYikeAIAppJob(GetYikeAIAppJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetYikeAIAppJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetYikeAIAppJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetYikeAIAppJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetYikeAgentJob  GetYikeAgentJobRequest
     * @return GetYikeAgentJobResponse
     */
    @Override
    public CompletableFuture<GetYikeAgentJobResponse> getYikeAgentJob(GetYikeAgentJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetYikeAgentJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetYikeAgentJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetYikeAgentJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetYikeAssetMediaInfo  GetYikeAssetMediaInfoRequest
     * @return GetYikeAssetMediaInfoResponse
     */
    @Override
    public CompletableFuture<GetYikeAssetMediaInfoResponse> getYikeAssetMediaInfo(GetYikeAssetMediaInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetYikeAssetMediaInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetYikeAssetMediaInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetYikeAssetMediaInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetYikeProjectExportJob  GetYikeProjectExportJobRequest
     * @return GetYikeProjectExportJobResponse
     */
    @Override
    public CompletableFuture<GetYikeProjectExportJobResponse> getYikeProjectExportJob(GetYikeProjectExportJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetYikeProjectExportJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetYikeProjectExportJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetYikeProjectExportJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetYikePromptExpansionVoiceFixJob  GetYikePromptExpansionVoiceFixJobRequest
     * @return GetYikePromptExpansionVoiceFixJobResponse
     */
    @Override
    public CompletableFuture<GetYikePromptExpansionVoiceFixJobResponse> getYikePromptExpansionVoiceFixJob(GetYikePromptExpansionVoiceFixJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetYikePromptExpansionVoiceFixJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetYikePromptExpansionVoiceFixJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetYikePromptExpansionVoiceFixJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetYikeStoryboardJob  GetYikeStoryboardJobRequest
     * @return GetYikeStoryboardJobResponse
     */
    @Override
    public CompletableFuture<GetYikeStoryboardJobResponse> getYikeStoryboardJob(GetYikeStoryboardJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetYikeStoryboardJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetYikeStoryboardJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetYikeStoryboardJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetYikeUser  GetYikeUserRequest
     * @return GetYikeUserResponse
     */
    @Override
    public CompletableFuture<GetYikeUserResponse> getYikeUser(GetYikeUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetYikeUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetYikeUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetYikeUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetYikeUserCredit  GetYikeUserCreditRequest
     * @return GetYikeUserCreditResponse
     */
    @Override
    public CompletableFuture<GetYikeUserCreditResponse> getYikeUserCredit(GetYikeUserCreditRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetYikeUserCredit").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetYikeUserCreditResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetYikeUserCreditResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetYikeVoiceNarratorJob  GetYikeVoiceNarratorJobRequest
     * @return GetYikeVoiceNarratorJobResponse
     */
    @Override
    public CompletableFuture<GetYikeVoiceNarratorJobResponse> getYikeVoiceNarratorJob(GetYikeVoiceNarratorJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetYikeVoiceNarratorJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetYikeVoiceNarratorJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetYikeVoiceNarratorJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListYikeAssetFolders  ListYikeAssetFoldersRequest
     * @return ListYikeAssetFoldersResponse
     */
    @Override
    public CompletableFuture<ListYikeAssetFoldersResponse> listYikeAssetFolders(ListYikeAssetFoldersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListYikeAssetFolders").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListYikeAssetFoldersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListYikeAssetFoldersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListYikeProductions  ListYikeProductionsRequest
     * @return ListYikeProductionsResponse
     */
    @Override
    public CompletableFuture<ListYikeProductionsResponse> listYikeProductions(ListYikeProductionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListYikeProductions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListYikeProductionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListYikeProductionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListYikeWorkspaces  ListYikeWorkspacesRequest
     * @return ListYikeWorkspacesResponse
     */
    @Override
    public CompletableFuture<ListYikeWorkspacesResponse> listYikeWorkspaces(ListYikeWorkspacesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListYikeWorkspaces").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListYikeWorkspacesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListYikeWorkspacesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PrecheckYikeAIAppJob  PrecheckYikeAIAppJobRequest
     * @return PrecheckYikeAIAppJobResponse
     */
    @Override
    public CompletableFuture<PrecheckYikeAIAppJobResponse> precheckYikeAIAppJob(PrecheckYikeAIAppJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PrecheckYikeAIAppJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PrecheckYikeAIAppJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PrecheckYikeAIAppJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RegisterYikeAssetMediaInfo  RegisterYikeAssetMediaInfoRequest
     * @return RegisterYikeAssetMediaInfoResponse
     */
    @Override
    public CompletableFuture<RegisterYikeAssetMediaInfoResponse> registerYikeAssetMediaInfo(RegisterYikeAssetMediaInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RegisterYikeAssetMediaInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RegisterYikeAssetMediaInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RegisterYikeAssetMediaInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ResumeYikeStoryboardJob  ResumeYikeStoryboardJobRequest
     * @return ResumeYikeStoryboardJobResponse
     */
    @Override
    public CompletableFuture<ResumeYikeStoryboardJobResponse> resumeYikeStoryboardJob(ResumeYikeStoryboardJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResumeYikeStoryboardJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResumeYikeStoryboardJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResumeYikeStoryboardJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetYikeCallbackConfig  SetYikeCallbackConfigRequest
     * @return SetYikeCallbackConfigResponse
     */
    @Override
    public CompletableFuture<SetYikeCallbackConfigResponse> setYikeCallbackConfig(SetYikeCallbackConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetYikeCallbackConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetYikeCallbackConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetYikeCallbackConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetYikeUserRole  SetYikeUserRoleRequest
     * @return SetYikeUserRoleResponse
     */
    @Override
    public CompletableFuture<SetYikeUserRoleResponse> setYikeUserRole(SetYikeUserRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetYikeUserRole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetYikeUserRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetYikeUserRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubYikeUserCredit  SubYikeUserCreditRequest
     * @return SubYikeUserCreditResponse
     */
    @Override
    public CompletableFuture<SubYikeUserCreditResponse> subYikeUserCredit(SubYikeUserCreditRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubYikeUserCredit").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubYikeUserCreditResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubYikeUserCreditResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitImageGenerationJob  SubmitImageGenerationJobRequest
     * @return SubmitImageGenerationJobResponse
     */
    @Override
    public CompletableFuture<SubmitImageGenerationJobResponse> submitImageGenerationJob(SubmitImageGenerationJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitImageGenerationJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitImageGenerationJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitImageGenerationJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitVideoGenerationJob  SubmitVideoGenerationJobRequest
     * @return SubmitVideoGenerationJobResponse
     */
    @Override
    public CompletableFuture<SubmitVideoGenerationJobResponse> submitVideoGenerationJob(SubmitVideoGenerationJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitVideoGenerationJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitVideoGenerationJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitVideoGenerationJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitYikeAIAppJob  SubmitYikeAIAppJobRequest
     * @return SubmitYikeAIAppJobResponse
     */
    @Override
    public CompletableFuture<SubmitYikeAIAppJobResponse> submitYikeAIAppJob(SubmitYikeAIAppJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitYikeAIAppJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitYikeAIAppJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitYikeAIAppJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitYikeAvatarNarratorJob  SubmitYikeAvatarNarratorJobRequest
     * @return SubmitYikeAvatarNarratorJobResponse
     */
    @Override
    public CompletableFuture<SubmitYikeAvatarNarratorJobResponse> submitYikeAvatarNarratorJob(SubmitYikeAvatarNarratorJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitYikeAvatarNarratorJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitYikeAvatarNarratorJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitYikeAvatarNarratorJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitYikeProjectExportJob  SubmitYikeProjectExportJobRequest
     * @return SubmitYikeProjectExportJobResponse
     */
    @Override
    public CompletableFuture<SubmitYikeProjectExportJobResponse> submitYikeProjectExportJob(SubmitYikeProjectExportJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitYikeProjectExportJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitYikeProjectExportJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitYikeProjectExportJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitYikePromptExpansionVoiceFixJob  SubmitYikePromptExpansionVoiceFixJobRequest
     * @return SubmitYikePromptExpansionVoiceFixJobResponse
     */
    @Override
    public CompletableFuture<SubmitYikePromptExpansionVoiceFixJobResponse> submitYikePromptExpansionVoiceFixJob(SubmitYikePromptExpansionVoiceFixJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitYikePromptExpansionVoiceFixJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitYikePromptExpansionVoiceFixJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitYikePromptExpansionVoiceFixJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitYikeStoryboardJob  SubmitYikeStoryboardJobRequest
     * @return SubmitYikeStoryboardJobResponse
     */
    @Override
    public CompletableFuture<SubmitYikeStoryboardJobResponse> submitYikeStoryboardJob(SubmitYikeStoryboardJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitYikeStoryboardJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitYikeStoryboardJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitYikeStoryboardJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitYikeVideoCloneJob  SubmitYikeVideoCloneJobRequest
     * @return SubmitYikeVideoCloneJobResponse
     */
    @Override
    public CompletableFuture<SubmitYikeVideoCloneJobResponse> submitYikeVideoCloneJob(SubmitYikeVideoCloneJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitYikeVideoCloneJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitYikeVideoCloneJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitYikeVideoCloneJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitYikeVoiceNarratorJob  SubmitYikeVoiceNarratorJobRequest
     * @return SubmitYikeVoiceNarratorJobResponse
     */
    @Override
    public CompletableFuture<SubmitYikeVoiceNarratorJobResponse> submitYikeVoiceNarratorJob(SubmitYikeVoiceNarratorJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitYikeVoiceNarratorJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitYikeVoiceNarratorJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitYikeVoiceNarratorJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateYikeProduction  UpdateYikeProductionRequest
     * @return UpdateYikeProductionResponse
     */
    @Override
    public CompletableFuture<UpdateYikeProductionResponse> updateYikeProduction(UpdateYikeProductionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateYikeProduction").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateYikeProductionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateYikeProductionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateYikeProductionMemberAuth  UpdateYikeProductionMemberAuthRequest
     * @return UpdateYikeProductionMemberAuthResponse
     */
    @Override
    public CompletableFuture<UpdateYikeProductionMemberAuthResponse> updateYikeProductionMemberAuth(UpdateYikeProductionMemberAuthRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateYikeProductionMemberAuth").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateYikeProductionMemberAuthResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateYikeProductionMemberAuthResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
