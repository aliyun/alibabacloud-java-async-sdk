// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mseap20210118;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.mseap20210118.models.*;
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
        this.product = "mseap";
        this.version = "2021-01-18";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of ActivateLicense  ActivateLicenseRequest
     * @return ActivateLicenseResponse
     */
    @Override
    public CompletableFuture<ActivateLicenseResponse> activateLicense(ActivateLicenseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ActivateLicense").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ActivateLicenseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ActivateLicenseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CallbackTask  CallbackTaskRequest
     * @return CallbackTaskResponse
     */
    @Override
    public CompletableFuture<CallbackTaskResponse> callbackTask(CallbackTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CallbackTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CallbackTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CallbackTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAgreementStatus  DescribeAgreementStatusRequest
     * @return DescribeAgreementStatusResponse
     */
    @Override
    public CompletableFuture<DescribeAgreementStatusResponse> describeAgreementStatus(DescribeAgreementStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAgreementStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAgreementStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAgreementStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GenerateUploadFilePolicyForPartner  GenerateUploadFilePolicyForPartnerRequest
     * @return GenerateUploadFilePolicyForPartnerResponse
     */
    @Override
    public CompletableFuture<GenerateUploadFilePolicyForPartnerResponse> generateUploadFilePolicyForPartner(GenerateUploadFilePolicyForPartnerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GenerateUploadFilePolicyForPartner").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateUploadFilePolicyForPartnerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateUploadFilePolicyForPartnerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetNodeByFlowId  GetNodeByFlowIdRequest
     * @return GetNodeByFlowIdResponse
     */
    @Override
    public CompletableFuture<GetNodeByFlowIdResponse> getNodeByFlowId(GetNodeByFlowIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetNodeByFlowId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetNodeByFlowIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetNodeByFlowIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetNodeByTemplateId  GetNodeByTemplateIdRequest
     * @return GetNodeByTemplateIdResponse
     */
    @Override
    public CompletableFuture<GetNodeByTemplateIdResponse> getNodeByTemplateId(GetNodeByTemplateIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetNodeByTemplateId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetNodeByTemplateIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetNodeByTemplateIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPlatformUserInfoForPartner  GetPlatformUserInfoForPartnerRequest
     * @return GetPlatformUserInfoForPartnerResponse
     */
    @Override
    public CompletableFuture<GetPlatformUserInfoForPartnerResponse> getPlatformUserInfoForPartner(GetPlatformUserInfoForPartnerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPlatformUserInfoForPartner").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPlatformUserInfoForPartnerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPlatformUserInfoForPartnerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetProxyByType  GetProxyByTypeRequest
     * @return GetProxyByTypeResponse
     */
    @Override
    public CompletableFuture<GetProxyByTypeResponse> getProxyByType(GetProxyByTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetProxyByType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetProxyByTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetProxyByTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetRedisValue  GetRedisValueRequest
     * @return GetRedisValueResponse
     */
    @Override
    public CompletableFuture<GetRedisValueResponse> getRedisValue(GetRedisValueRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetRedisValue").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRedisValueResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRedisValueResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetVariable  GetVariableRequest
     * @return GetVariableResponse
     */
    @Override
    public CompletableFuture<GetVariableResponse> getVariable(GetVariableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetVariable").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVariableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVariableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of IdentifyCode  IdentifyCodeRequest
     * @return IdentifyCodeResponse
     */
    @Override
    public CompletableFuture<IdentifyCodeResponse> identifyCode(IdentifyCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("IdentifyCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(IdentifyCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<IdentifyCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PullRpaModel  PullRpaModelRequest
     * @return PullRpaModelResponse
     */
    @Override
    public CompletableFuture<PullRpaModelResponse> pullRpaModel(PullRpaModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PullRpaModel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PullRpaModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PullRpaModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PullTask  PullTaskRequest
     * @return PullTaskResponse
     */
    @Override
    public CompletableFuture<PullTaskResponse> pullTask(PullTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PullTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PullTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PullTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PushRpaTask  PushRpaTaskRequest
     * @return PushRpaTaskResponse
     */
    @Override
    public CompletableFuture<PushRpaTaskResponse> pushRpaTask(PushRpaTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PushRpaTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PushRpaTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PushRpaTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PushRpaTaskDetail  PushRpaTaskDetailRequest
     * @return PushRpaTaskDetailResponse
     */
    @Override
    public CompletableFuture<PushRpaTaskDetailResponse> pushRpaTaskDetail(PushRpaTaskDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PushRpaTaskDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PushRpaTaskDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PushRpaTaskDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SendNotificationForPartner  SendNotificationForPartnerRequest
     * @return SendNotificationForPartnerResponse
     */
    @Override
    public CompletableFuture<SendNotificationForPartnerResponse> sendNotificationForPartner(SendNotificationForPartnerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SendNotificationForPartner").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendNotificationForPartnerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendNotificationForPartnerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetRedisValue  SetRedisValueRequest
     * @return SetRedisValueResponse
     */
    @Override
    public CompletableFuture<SetRedisValueResponse> setRedisValue(SetRedisValueRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetRedisValue").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetRedisValueResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetRedisValueResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateAgreementStatus  UpdateAgreementStatusRequest
     * @return UpdateAgreementStatusResponse
     */
    @Override
    public CompletableFuture<UpdateAgreementStatusResponse> updateAgreementStatus(UpdateAgreementStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAgreementStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAgreementStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAgreementStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
