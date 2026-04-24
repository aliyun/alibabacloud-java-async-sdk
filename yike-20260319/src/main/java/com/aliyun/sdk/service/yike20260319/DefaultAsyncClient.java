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
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
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

}
