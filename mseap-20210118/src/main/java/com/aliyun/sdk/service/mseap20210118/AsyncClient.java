// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mseap20210118;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.mseap20210118.models.*;
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
     * @param request the request parameters of ActivateLicense  ActivateLicenseRequest
     * @return ActivateLicenseResponse
     */
    CompletableFuture<ActivateLicenseResponse> activateLicense(ActivateLicenseRequest request);

    /**
     * @param request the request parameters of CallbackTask  CallbackTaskRequest
     * @return CallbackTaskResponse
     */
    CompletableFuture<CallbackTaskResponse> callbackTask(CallbackTaskRequest request);

    /**
     * @param request the request parameters of DescribeAgreementStatus  DescribeAgreementStatusRequest
     * @return DescribeAgreementStatusResponse
     */
    CompletableFuture<DescribeAgreementStatusResponse> describeAgreementStatus(DescribeAgreementStatusRequest request);

    /**
     * @param request the request parameters of GenerateUploadFilePolicyForPartner  GenerateUploadFilePolicyForPartnerRequest
     * @return GenerateUploadFilePolicyForPartnerResponse
     */
    CompletableFuture<GenerateUploadFilePolicyForPartnerResponse> generateUploadFilePolicyForPartner(GenerateUploadFilePolicyForPartnerRequest request);

    /**
     * @param request the request parameters of GetNodeByFlowId  GetNodeByFlowIdRequest
     * @return GetNodeByFlowIdResponse
     */
    CompletableFuture<GetNodeByFlowIdResponse> getNodeByFlowId(GetNodeByFlowIdRequest request);

    /**
     * @param request the request parameters of GetNodeByTemplateId  GetNodeByTemplateIdRequest
     * @return GetNodeByTemplateIdResponse
     */
    CompletableFuture<GetNodeByTemplateIdResponse> getNodeByTemplateId(GetNodeByTemplateIdRequest request);

    /**
     * @param request the request parameters of GetProxyByType  GetProxyByTypeRequest
     * @return GetProxyByTypeResponse
     */
    CompletableFuture<GetProxyByTypeResponse> getProxyByType(GetProxyByTypeRequest request);

    /**
     * @param request the request parameters of GetRedisValue  GetRedisValueRequest
     * @return GetRedisValueResponse
     */
    CompletableFuture<GetRedisValueResponse> getRedisValue(GetRedisValueRequest request);

    /**
     * @param request the request parameters of GetVariable  GetVariableRequest
     * @return GetVariableResponse
     */
    CompletableFuture<GetVariableResponse> getVariable(GetVariableRequest request);

    /**
     * @param request the request parameters of IdentifyCode  IdentifyCodeRequest
     * @return IdentifyCodeResponse
     */
    CompletableFuture<IdentifyCodeResponse> identifyCode(IdentifyCodeRequest request);

    /**
     * @param request the request parameters of PullRpaModel  PullRpaModelRequest
     * @return PullRpaModelResponse
     */
    CompletableFuture<PullRpaModelResponse> pullRpaModel(PullRpaModelRequest request);

    /**
     * @param request the request parameters of PullTask  PullTaskRequest
     * @return PullTaskResponse
     */
    CompletableFuture<PullTaskResponse> pullTask(PullTaskRequest request);

    /**
     * @param request the request parameters of PushRpaTask  PushRpaTaskRequest
     * @return PushRpaTaskResponse
     */
    CompletableFuture<PushRpaTaskResponse> pushRpaTask(PushRpaTaskRequest request);

    /**
     * @param request the request parameters of PushRpaTaskDetail  PushRpaTaskDetailRequest
     * @return PushRpaTaskDetailResponse
     */
    CompletableFuture<PushRpaTaskDetailResponse> pushRpaTaskDetail(PushRpaTaskDetailRequest request);

    /**
     * @param request the request parameters of SendNotificationForPartner  SendNotificationForPartnerRequest
     * @return SendNotificationForPartnerResponse
     */
    CompletableFuture<SendNotificationForPartnerResponse> sendNotificationForPartner(SendNotificationForPartnerRequest request);

    /**
     * @param request the request parameters of SetRedisValue  SetRedisValueRequest
     * @return SetRedisValueResponse
     */
    CompletableFuture<SetRedisValueResponse> setRedisValue(SetRedisValueRequest request);

    /**
     * @param request the request parameters of UpdateAgreementStatus  UpdateAgreementStatusRequest
     * @return UpdateAgreementStatusResponse
     */
    CompletableFuture<UpdateAgreementStatusResponse> updateAgreementStatus(UpdateAgreementStatusRequest request);

}
