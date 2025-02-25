// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.domain20180129.models.*;
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
        this.product = "Domain";
        this.version = "2018-01-29";
        this.endpointRule = "central";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AcknowledgeTaskResult  AcknowledgeTaskResultRequest
     * @return AcknowledgeTaskResultResponse
     */
    @Override
    public CompletableFuture<AcknowledgeTaskResultResponse> acknowledgeTaskResult(AcknowledgeTaskResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AcknowledgeTaskResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AcknowledgeTaskResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AcknowledgeTaskResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchFuzzyMatchDomainSensitiveWord  BatchFuzzyMatchDomainSensitiveWordRequest
     * @return BatchFuzzyMatchDomainSensitiveWordResponse
     */
    @Override
    public CompletableFuture<BatchFuzzyMatchDomainSensitiveWordResponse> batchFuzzyMatchDomainSensitiveWord(BatchFuzzyMatchDomainSensitiveWordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchFuzzyMatchDomainSensitiveWord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchFuzzyMatchDomainSensitiveWordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchFuzzyMatchDomainSensitiveWordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CancelDomainVerification  CancelDomainVerificationRequest
     * @return CancelDomainVerificationResponse
     */
    @Override
    public CompletableFuture<CancelDomainVerificationResponse> cancelDomainVerification(CancelDomainVerificationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelDomainVerification").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelDomainVerificationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelDomainVerificationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CancelOperationAudit  CancelOperationAuditRequest
     * @return CancelOperationAuditResponse
     */
    @Override
    public CompletableFuture<CancelOperationAuditResponse> cancelOperationAudit(CancelOperationAuditRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelOperationAudit").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelOperationAuditResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelOperationAuditResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CancelQualificationVerification  CancelQualificationVerificationRequest
     * @return CancelQualificationVerificationResponse
     */
    @Override
    public CompletableFuture<CancelQualificationVerificationResponse> cancelQualificationVerification(CancelQualificationVerificationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelQualificationVerification").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelQualificationVerificationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelQualificationVerificationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CancelTask  CancelTaskRequest
     * @return CancelTaskResponse
     */
    @Override
    public CompletableFuture<CancelTaskResponse> cancelTask(CancelTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    @Override
    public CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChangeResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckDomain  CheckDomainRequest
     * @return CheckDomainResponse
     */
    @Override
    public CompletableFuture<CheckDomainResponse> checkDomain(CheckDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckDomainSunriseClaim  CheckDomainSunriseClaimRequest
     * @return CheckDomainSunriseClaimResponse
     */
    @Override
    public CompletableFuture<CheckDomainSunriseClaimResponse> checkDomainSunriseClaim(CheckDomainSunriseClaimRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckDomainSunriseClaim").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckDomainSunriseClaimResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckDomainSunriseClaimResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckIntlFixPriceDomainStatus  CheckIntlFixPriceDomainStatusRequest
     * @return CheckIntlFixPriceDomainStatusResponse
     */
    @Override
    public CompletableFuture<CheckIntlFixPriceDomainStatusResponse> checkIntlFixPriceDomainStatus(CheckIntlFixPriceDomainStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckIntlFixPriceDomainStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckIntlFixPriceDomainStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckIntlFixPriceDomainStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckMaxYearOfServerLock  CheckMaxYearOfServerLockRequest
     * @return CheckMaxYearOfServerLockResponse
     */
    @Override
    public CompletableFuture<CheckMaxYearOfServerLockResponse> checkMaxYearOfServerLock(CheckMaxYearOfServerLockRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckMaxYearOfServerLock").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckMaxYearOfServerLockResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckMaxYearOfServerLockResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckProcessingServerLockApply  CheckProcessingServerLockApplyRequest
     * @return CheckProcessingServerLockApplyResponse
     */
    @Override
    public CompletableFuture<CheckProcessingServerLockApplyResponse> checkProcessingServerLockApply(CheckProcessingServerLockApplyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckProcessingServerLockApply").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckProcessingServerLockApplyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckProcessingServerLockApplyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckTransferInFeasibility  CheckTransferInFeasibilityRequest
     * @return CheckTransferInFeasibilityResponse
     */
    @Override
    public CompletableFuture<CheckTransferInFeasibilityResponse> checkTransferInFeasibility(CheckTransferInFeasibilityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckTransferInFeasibility").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckTransferInFeasibilityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckTransferInFeasibilityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ConfirmTransferInEmail  ConfirmTransferInEmailRequest
     * @return ConfirmTransferInEmailResponse
     */
    @Override
    public CompletableFuture<ConfirmTransferInEmailResponse> confirmTransferInEmail(ConfirmTransferInEmailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ConfirmTransferInEmail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ConfirmTransferInEmailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ConfirmTransferInEmailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateIntlFixedPriceDomainOrder  CreateIntlFixedPriceDomainOrderRequest
     * @return CreateIntlFixedPriceDomainOrderResponse
     */
    @Override
    public CompletableFuture<CreateIntlFixedPriceDomainOrderResponse> createIntlFixedPriceDomainOrder(CreateIntlFixedPriceDomainOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateIntlFixedPriceDomainOrder").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateIntlFixedPriceDomainOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateIntlFixedPriceDomainOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteContactTemplates  DeleteContactTemplatesRequest
     * @return DeleteContactTemplatesResponse
     */
    @Override
    public CompletableFuture<DeleteContactTemplatesResponse> deleteContactTemplates(DeleteContactTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteContactTemplates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteContactTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteContactTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDomainGroup  DeleteDomainGroupRequest
     * @return DeleteDomainGroupResponse
     */
    @Override
    public CompletableFuture<DeleteDomainGroupResponse> deleteDomainGroup(DeleteDomainGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDomainGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDomainGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDomainGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteEmailVerification  DeleteEmailVerificationRequest
     * @return DeleteEmailVerificationResponse
     */
    @Override
    public CompletableFuture<DeleteEmailVerificationResponse> deleteEmailVerification(DeleteEmailVerificationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteEmailVerification").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteEmailVerificationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteEmailVerificationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteRegistrantProfile  DeleteRegistrantProfileRequest
     * @return DeleteRegistrantProfileResponse
     */
    @Override
    public CompletableFuture<DeleteRegistrantProfileResponse> deleteRegistrantProfile(DeleteRegistrantProfileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRegistrantProfile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRegistrantProfileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRegistrantProfileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DomainSpecialBizCancel  DomainSpecialBizCancelRequest
     * @return DomainSpecialBizCancelResponse
     */
    @Override
    public CompletableFuture<DomainSpecialBizCancelResponse> domainSpecialBizCancel(DomainSpecialBizCancelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DomainSpecialBizCancel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DomainSpecialBizCancelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DomainSpecialBizCancelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EmailVerified  EmailVerifiedRequest
     * @return EmailVerifiedResponse
     */
    @Override
    public CompletableFuture<EmailVerifiedResponse> emailVerified(EmailVerifiedRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EmailVerified").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EmailVerifiedResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EmailVerifiedResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FuzzyMatchDomainSensitiveWord  FuzzyMatchDomainSensitiveWordRequest
     * @return FuzzyMatchDomainSensitiveWordResponse
     */
    @Override
    public CompletableFuture<FuzzyMatchDomainSensitiveWordResponse> fuzzyMatchDomainSensitiveWord(FuzzyMatchDomainSensitiveWordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FuzzyMatchDomainSensitiveWord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FuzzyMatchDomainSensitiveWordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FuzzyMatchDomainSensitiveWordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetIntlFixPriceDomainListUrl  GetIntlFixPriceDomainListUrlRequest
     * @return GetIntlFixPriceDomainListUrlResponse
     */
    @Override
    public CompletableFuture<GetIntlFixPriceDomainListUrlResponse> getIntlFixPriceDomainListUrl(GetIntlFixPriceDomainListUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetIntlFixPriceDomainListUrl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetIntlFixPriceDomainListUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetIntlFixPriceDomainListUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetOperationOssUploadPolicy  GetOperationOssUploadPolicyRequest
     * @return GetOperationOssUploadPolicyResponse
     */
    @Override
    public CompletableFuture<GetOperationOssUploadPolicyResponse> getOperationOssUploadPolicy(GetOperationOssUploadPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetOperationOssUploadPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOperationOssUploadPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOperationOssUploadPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetQualificationUploadPolicy  GetQualificationUploadPolicyRequest
     * @return GetQualificationUploadPolicyResponse
     */
    @Override
    public CompletableFuture<GetQualificationUploadPolicyResponse> getQualificationUploadPolicy(GetQualificationUploadPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetQualificationUploadPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetQualificationUploadPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetQualificationUploadPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListEmailVerification  ListEmailVerificationRequest
     * @return ListEmailVerificationResponse
     */
    @Override
    public CompletableFuture<ListEmailVerificationResponse> listEmailVerification(ListEmailVerificationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListEmailVerification").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEmailVerificationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEmailVerificationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListServerLock  ListServerLockRequest
     * @return ListServerLockResponse
     */
    @Override
    public CompletableFuture<ListServerLockResponse> listServerLock(ListServerLockRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListServerLock").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListServerLockResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListServerLockResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of LookupTmchNotice  LookupTmchNoticeRequest
     * @return LookupTmchNoticeResponse
     */
    @Override
    public CompletableFuture<LookupTmchNoticeResponse> lookupTmchNotice(LookupTmchNoticeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("LookupTmchNotice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(LookupTmchNoticeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<LookupTmchNoticeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PollTaskResult  PollTaskResultRequest
     * @return PollTaskResultResponse
     */
    @Override
    public CompletableFuture<PollTaskResultResponse> pollTaskResult(PollTaskResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PollTaskResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PollTaskResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PollTaskResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryAdvancedDomainList  QueryAdvancedDomainListRequest
     * @return QueryAdvancedDomainListResponse
     */
    @Override
    public CompletableFuture<QueryAdvancedDomainListResponse> queryAdvancedDomainList(QueryAdvancedDomainListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryAdvancedDomainList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryAdvancedDomainListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryAdvancedDomainListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryArtExtension  QueryArtExtensionRequest
     * @return QueryArtExtensionResponse
     */
    @Override
    public CompletableFuture<QueryArtExtensionResponse> queryArtExtension(QueryArtExtensionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryArtExtension").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryArtExtensionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryArtExtensionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryChangeLogList  QueryChangeLogListRequest
     * @return QueryChangeLogListResponse
     */
    @Override
    public CompletableFuture<QueryChangeLogListResponse> queryChangeLogList(QueryChangeLogListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryChangeLogList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryChangeLogListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryChangeLogListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryContactInfo  QueryContactInfoRequest
     * @return QueryContactInfoResponse
     */
    @Override
    public CompletableFuture<QueryContactInfoResponse> queryContactInfo(QueryContactInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryContactInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryContactInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryContactInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryDSRecord  QueryDSRecordRequest
     * @return QueryDSRecordResponse
     */
    @Override
    public CompletableFuture<QueryDSRecordResponse> queryDSRecord(QueryDSRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDSRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDSRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDSRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryDnsHost  QueryDnsHostRequest
     * @return QueryDnsHostResponse
     */
    @Override
    public CompletableFuture<QueryDnsHostResponse> queryDnsHost(QueryDnsHostRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDnsHost").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDnsHostResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDnsHostResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryDomainAdminDivision  QueryDomainAdminDivisionRequest
     * @return QueryDomainAdminDivisionResponse
     */
    @Override
    public CompletableFuture<QueryDomainAdminDivisionResponse> queryDomainAdminDivision(QueryDomainAdminDivisionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDomainAdminDivision").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDomainAdminDivisionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDomainAdminDivisionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryDomainByDomainName  QueryDomainByDomainNameRequest
     * @return QueryDomainByDomainNameResponse
     */
    @Override
    public CompletableFuture<QueryDomainByDomainNameResponse> queryDomainByDomainName(QueryDomainByDomainNameRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDomainByDomainName").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDomainByDomainNameResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDomainByDomainNameResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryDomainByInstanceId  QueryDomainByInstanceIdRequest
     * @return QueryDomainByInstanceIdResponse
     */
    @Override
    public CompletableFuture<QueryDomainByInstanceIdResponse> queryDomainByInstanceId(QueryDomainByInstanceIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDomainByInstanceId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDomainByInstanceIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDomainByInstanceIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryDomainGroupList  QueryDomainGroupListRequest
     * @return QueryDomainGroupListResponse
     */
    @Override
    public CompletableFuture<QueryDomainGroupListResponse> queryDomainGroupList(QueryDomainGroupListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDomainGroupList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDomainGroupListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDomainGroupListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryDomainList  QueryDomainListRequest
     * @return QueryDomainListResponse
     */
    @Override
    public CompletableFuture<QueryDomainListResponse> queryDomainList(QueryDomainListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDomainList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDomainListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDomainListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryDomainRealNameVerificationInfo  QueryDomainRealNameVerificationInfoRequest
     * @return QueryDomainRealNameVerificationInfoResponse
     */
    @Override
    public CompletableFuture<QueryDomainRealNameVerificationInfoResponse> queryDomainRealNameVerificationInfo(QueryDomainRealNameVerificationInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDomainRealNameVerificationInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDomainRealNameVerificationInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDomainRealNameVerificationInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryDomainSpecialBizDetail  QueryDomainSpecialBizDetailRequest
     * @return QueryDomainSpecialBizDetailResponse
     */
    @Override
    public CompletableFuture<QueryDomainSpecialBizDetailResponse> queryDomainSpecialBizDetail(QueryDomainSpecialBizDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDomainSpecialBizDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDomainSpecialBizDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDomainSpecialBizDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryDomainSpecialBizInfoByDomain  QueryDomainSpecialBizInfoByDomainRequest
     * @return QueryDomainSpecialBizInfoByDomainResponse
     */
    @Override
    public CompletableFuture<QueryDomainSpecialBizInfoByDomainResponse> queryDomainSpecialBizInfoByDomain(QueryDomainSpecialBizInfoByDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDomainSpecialBizInfoByDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDomainSpecialBizInfoByDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDomainSpecialBizInfoByDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryDomainSuffix  QueryDomainSuffixRequest
     * @return QueryDomainSuffixResponse
     */
    @Override
    public CompletableFuture<QueryDomainSuffixResponse> queryDomainSuffix(QueryDomainSuffixRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDomainSuffix").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDomainSuffixResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDomainSuffixResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryEmailVerification  QueryEmailVerificationRequest
     * @return QueryEmailVerificationResponse
     */
    @Override
    public CompletableFuture<QueryEmailVerificationResponse> queryEmailVerification(QueryEmailVerificationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryEmailVerification").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryEmailVerificationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryEmailVerificationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryEnsAssociation  QueryEnsAssociationRequest
     * @return QueryEnsAssociationResponse
     */
    @Override
    public CompletableFuture<QueryEnsAssociationResponse> queryEnsAssociation(QueryEnsAssociationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryEnsAssociation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryEnsAssociationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryEnsAssociationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryFailReasonForDomainRealNameVerification  QueryFailReasonForDomainRealNameVerificationRequest
     * @return QueryFailReasonForDomainRealNameVerificationResponse
     */
    @Override
    public CompletableFuture<QueryFailReasonForDomainRealNameVerificationResponse> queryFailReasonForDomainRealNameVerification(QueryFailReasonForDomainRealNameVerificationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryFailReasonForDomainRealNameVerification").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryFailReasonForDomainRealNameVerificationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryFailReasonForDomainRealNameVerificationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryFailReasonForRegistrantProfileRealNameVerification  QueryFailReasonForRegistrantProfileRealNameVerificationRequest
     * @return QueryFailReasonForRegistrantProfileRealNameVerificationResponse
     */
    @Override
    public CompletableFuture<QueryFailReasonForRegistrantProfileRealNameVerificationResponse> queryFailReasonForRegistrantProfileRealNameVerification(QueryFailReasonForRegistrantProfileRealNameVerificationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryFailReasonForRegistrantProfileRealNameVerification").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryFailReasonForRegistrantProfileRealNameVerificationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryFailReasonForRegistrantProfileRealNameVerificationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryFailingReasonListForQualification  QueryFailingReasonListForQualificationRequest
     * @return QueryFailingReasonListForQualificationResponse
     */
    @Override
    public CompletableFuture<QueryFailingReasonListForQualificationResponse> queryFailingReasonListForQualification(QueryFailingReasonListForQualificationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryFailingReasonListForQualification").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryFailingReasonListForQualificationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryFailingReasonListForQualificationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryIntlFixedPriceOrderList  QueryIntlFixedPriceOrderListRequest
     * @return QueryIntlFixedPriceOrderListResponse
     */
    @Override
    public CompletableFuture<QueryIntlFixedPriceOrderListResponse> queryIntlFixedPriceOrderList(QueryIntlFixedPriceOrderListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryIntlFixedPriceOrderList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryIntlFixedPriceOrderListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryIntlFixedPriceOrderListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryLocalEnsAssociation  QueryLocalEnsAssociationRequest
     * @return QueryLocalEnsAssociationResponse
     */
    @Override
    public CompletableFuture<QueryLocalEnsAssociationResponse> queryLocalEnsAssociation(QueryLocalEnsAssociationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryLocalEnsAssociation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryLocalEnsAssociationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryLocalEnsAssociationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryOperationAuditInfoDetail  QueryOperationAuditInfoDetailRequest
     * @return QueryOperationAuditInfoDetailResponse
     */
    @Override
    public CompletableFuture<QueryOperationAuditInfoDetailResponse> queryOperationAuditInfoDetail(QueryOperationAuditInfoDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryOperationAuditInfoDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryOperationAuditInfoDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryOperationAuditInfoDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryOperationAuditInfoList  QueryOperationAuditInfoListRequest
     * @return QueryOperationAuditInfoListResponse
     */
    @Override
    public CompletableFuture<QueryOperationAuditInfoListResponse> queryOperationAuditInfoList(QueryOperationAuditInfoListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryOperationAuditInfoList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryOperationAuditInfoListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryOperationAuditInfoListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryQualificationDetail  QueryQualificationDetailRequest
     * @return QueryQualificationDetailResponse
     */
    @Override
    public CompletableFuture<QueryQualificationDetailResponse> queryQualificationDetail(QueryQualificationDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryQualificationDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryQualificationDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryQualificationDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryRegistrantProfileRealNameVerificationInfo  QueryRegistrantProfileRealNameVerificationInfoRequest
     * @return QueryRegistrantProfileRealNameVerificationInfoResponse
     */
    @Override
    public CompletableFuture<QueryRegistrantProfileRealNameVerificationInfoResponse> queryRegistrantProfileRealNameVerificationInfo(QueryRegistrantProfileRealNameVerificationInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryRegistrantProfileRealNameVerificationInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryRegistrantProfileRealNameVerificationInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryRegistrantProfileRealNameVerificationInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryRegistrantProfiles  QueryRegistrantProfilesRequest
     * @return QueryRegistrantProfilesResponse
     */
    @Override
    public CompletableFuture<QueryRegistrantProfilesResponse> queryRegistrantProfiles(QueryRegistrantProfilesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryRegistrantProfiles").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryRegistrantProfilesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryRegistrantProfilesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryServerLock  QueryServerLockRequest
     * @return QueryServerLockResponse
     */
    @Override
    public CompletableFuture<QueryServerLockResponse> queryServerLock(QueryServerLockRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryServerLock").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryServerLockResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryServerLockResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryTaskDetailHistory  QueryTaskDetailHistoryRequest
     * @return QueryTaskDetailHistoryResponse
     */
    @Override
    public CompletableFuture<QueryTaskDetailHistoryResponse> queryTaskDetailHistory(QueryTaskDetailHistoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryTaskDetailHistory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryTaskDetailHistoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryTaskDetailHistoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryTaskDetailList  QueryTaskDetailListRequest
     * @return QueryTaskDetailListResponse
     */
    @Override
    public CompletableFuture<QueryTaskDetailListResponse> queryTaskDetailList(QueryTaskDetailListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryTaskDetailList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryTaskDetailListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryTaskDetailListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryTaskInfoHistory  QueryTaskInfoHistoryRequest
     * @return QueryTaskInfoHistoryResponse
     */
    @Override
    public CompletableFuture<QueryTaskInfoHistoryResponse> queryTaskInfoHistory(QueryTaskInfoHistoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryTaskInfoHistory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryTaskInfoHistoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryTaskInfoHistoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryTaskList  QueryTaskListRequest
     * @return QueryTaskListResponse
     */
    @Override
    public CompletableFuture<QueryTaskListResponse> queryTaskList(QueryTaskListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryTaskList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryTaskListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryTaskListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryTransferInByInstanceId  QueryTransferInByInstanceIdRequest
     * @return QueryTransferInByInstanceIdResponse
     */
    @Override
    public CompletableFuture<QueryTransferInByInstanceIdResponse> queryTransferInByInstanceId(QueryTransferInByInstanceIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryTransferInByInstanceId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryTransferInByInstanceIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryTransferInByInstanceIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryTransferInList  QueryTransferInListRequest
     * @return QueryTransferInListResponse
     */
    @Override
    public CompletableFuture<QueryTransferInListResponse> queryTransferInList(QueryTransferInListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryTransferInList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryTransferInListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryTransferInListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryTransferOutInfo  QueryTransferOutInfoRequest
     * @return QueryTransferOutInfoResponse
     */
    @Override
    public CompletableFuture<QueryTransferOutInfoResponse> queryTransferOutInfo(QueryTransferOutInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryTransferOutInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryTransferOutInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryTransferOutInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RegistrantProfileRealNameVerification  RegistrantProfileRealNameVerificationRequest
     * @return RegistrantProfileRealNameVerificationResponse
     */
    @Override
    public CompletableFuture<RegistrantProfileRealNameVerificationResponse> registrantProfileRealNameVerification(RegistrantProfileRealNameVerificationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RegistrantProfileRealNameVerification").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RegistrantProfileRealNameVerificationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RegistrantProfileRealNameVerificationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ResendEmailVerification  ResendEmailVerificationRequest
     * @return ResendEmailVerificationResponse
     */
    @Override
    public CompletableFuture<ResendEmailVerificationResponse> resendEmailVerification(ResendEmailVerificationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResendEmailVerification").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResendEmailVerificationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResendEmailVerificationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ResetQualificationVerification  ResetQualificationVerificationRequest
     * @return ResetQualificationVerificationResponse
     */
    @Override
    public CompletableFuture<ResetQualificationVerificationResponse> resetQualificationVerification(ResetQualificationVerificationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResetQualificationVerification").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetQualificationVerificationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetQualificationVerificationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveBatchDomainRemark  SaveBatchDomainRemarkRequest
     * @return SaveBatchDomainRemarkResponse
     */
    @Override
    public CompletableFuture<SaveBatchDomainRemarkResponse> saveBatchDomainRemark(SaveBatchDomainRemarkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveBatchDomainRemark").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveBatchDomainRemarkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveBatchDomainRemarkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveBatchTaskForApplyQuickTransferOutOpenly  SaveBatchTaskForApplyQuickTransferOutOpenlyRequest
     * @return SaveBatchTaskForApplyQuickTransferOutOpenlyResponse
     */
    @Override
    public CompletableFuture<SaveBatchTaskForApplyQuickTransferOutOpenlyResponse> saveBatchTaskForApplyQuickTransferOutOpenly(SaveBatchTaskForApplyQuickTransferOutOpenlyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveBatchTaskForApplyQuickTransferOutOpenly").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveBatchTaskForApplyQuickTransferOutOpenlyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveBatchTaskForApplyQuickTransferOutOpenlyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveBatchTaskForCreatingOrderActivate  SaveBatchTaskForCreatingOrderActivateRequest
     * @return SaveBatchTaskForCreatingOrderActivateResponse
     */
    @Override
    public CompletableFuture<SaveBatchTaskForCreatingOrderActivateResponse> saveBatchTaskForCreatingOrderActivate(SaveBatchTaskForCreatingOrderActivateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveBatchTaskForCreatingOrderActivate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveBatchTaskForCreatingOrderActivateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveBatchTaskForCreatingOrderActivateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveBatchTaskForCreatingOrderRedeem  SaveBatchTaskForCreatingOrderRedeemRequest
     * @return SaveBatchTaskForCreatingOrderRedeemResponse
     */
    @Override
    public CompletableFuture<SaveBatchTaskForCreatingOrderRedeemResponse> saveBatchTaskForCreatingOrderRedeem(SaveBatchTaskForCreatingOrderRedeemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveBatchTaskForCreatingOrderRedeem").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveBatchTaskForCreatingOrderRedeemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveBatchTaskForCreatingOrderRedeemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveBatchTaskForCreatingOrderRenew  SaveBatchTaskForCreatingOrderRenewRequest
     * @return SaveBatchTaskForCreatingOrderRenewResponse
     */
    @Override
    public CompletableFuture<SaveBatchTaskForCreatingOrderRenewResponse> saveBatchTaskForCreatingOrderRenew(SaveBatchTaskForCreatingOrderRenewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveBatchTaskForCreatingOrderRenew").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveBatchTaskForCreatingOrderRenewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveBatchTaskForCreatingOrderRenewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveBatchTaskForCreatingOrderTransfer  SaveBatchTaskForCreatingOrderTransferRequest
     * @return SaveBatchTaskForCreatingOrderTransferResponse
     */
    @Override
    public CompletableFuture<SaveBatchTaskForCreatingOrderTransferResponse> saveBatchTaskForCreatingOrderTransfer(SaveBatchTaskForCreatingOrderTransferRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveBatchTaskForCreatingOrderTransfer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveBatchTaskForCreatingOrderTransferResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveBatchTaskForCreatingOrderTransferResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveBatchTaskForDomainNameProxyService  SaveBatchTaskForDomainNameProxyServiceRequest
     * @return SaveBatchTaskForDomainNameProxyServiceResponse
     */
    @Override
    public CompletableFuture<SaveBatchTaskForDomainNameProxyServiceResponse> saveBatchTaskForDomainNameProxyService(SaveBatchTaskForDomainNameProxyServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveBatchTaskForDomainNameProxyService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveBatchTaskForDomainNameProxyServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveBatchTaskForDomainNameProxyServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveBatchTaskForGenerateDomainCertificate  SaveBatchTaskForGenerateDomainCertificateRequest
     * @return SaveBatchTaskForGenerateDomainCertificateResponse
     */
    @Override
    public CompletableFuture<SaveBatchTaskForGenerateDomainCertificateResponse> saveBatchTaskForGenerateDomainCertificate(SaveBatchTaskForGenerateDomainCertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveBatchTaskForGenerateDomainCertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveBatchTaskForGenerateDomainCertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveBatchTaskForGenerateDomainCertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveBatchTaskForModifyingDomainDns  SaveBatchTaskForModifyingDomainDnsRequest
     * @return SaveBatchTaskForModifyingDomainDnsResponse
     */
    @Override
    public CompletableFuture<SaveBatchTaskForModifyingDomainDnsResponse> saveBatchTaskForModifyingDomainDns(SaveBatchTaskForModifyingDomainDnsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveBatchTaskForModifyingDomainDns").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveBatchTaskForModifyingDomainDnsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveBatchTaskForModifyingDomainDnsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveBatchTaskForReserveDropListDomain  SaveBatchTaskForReserveDropListDomainRequest
     * @return SaveBatchTaskForReserveDropListDomainResponse
     */
    @Override
    public CompletableFuture<SaveBatchTaskForReserveDropListDomainResponse> saveBatchTaskForReserveDropListDomain(SaveBatchTaskForReserveDropListDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveBatchTaskForReserveDropListDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveBatchTaskForReserveDropListDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveBatchTaskForReserveDropListDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveBatchTaskForTransferOutByAuthorizationCode  SaveBatchTaskForTransferOutByAuthorizationCodeRequest
     * @return SaveBatchTaskForTransferOutByAuthorizationCodeResponse
     */
    @Override
    public CompletableFuture<SaveBatchTaskForTransferOutByAuthorizationCodeResponse> saveBatchTaskForTransferOutByAuthorizationCode(SaveBatchTaskForTransferOutByAuthorizationCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveBatchTaskForTransferOutByAuthorizationCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveBatchTaskForTransferOutByAuthorizationCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveBatchTaskForTransferOutByAuthorizationCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveBatchTaskForTransferProhibitionLock  SaveBatchTaskForTransferProhibitionLockRequest
     * @return SaveBatchTaskForTransferProhibitionLockResponse
     */
    @Override
    public CompletableFuture<SaveBatchTaskForTransferProhibitionLockResponse> saveBatchTaskForTransferProhibitionLock(SaveBatchTaskForTransferProhibitionLockRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveBatchTaskForTransferProhibitionLock").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveBatchTaskForTransferProhibitionLockResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveBatchTaskForTransferProhibitionLockResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveBatchTaskForUpdateProhibitionLock  SaveBatchTaskForUpdateProhibitionLockRequest
     * @return SaveBatchTaskForUpdateProhibitionLockResponse
     */
    @Override
    public CompletableFuture<SaveBatchTaskForUpdateProhibitionLockResponse> saveBatchTaskForUpdateProhibitionLock(SaveBatchTaskForUpdateProhibitionLockRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveBatchTaskForUpdateProhibitionLock").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveBatchTaskForUpdateProhibitionLockResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveBatchTaskForUpdateProhibitionLockResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveBatchTaskForUpdatingContactInfoByNewContact  SaveBatchTaskForUpdatingContactInfoByNewContactRequest
     * @return SaveBatchTaskForUpdatingContactInfoByNewContactResponse
     */
    @Override
    public CompletableFuture<SaveBatchTaskForUpdatingContactInfoByNewContactResponse> saveBatchTaskForUpdatingContactInfoByNewContact(SaveBatchTaskForUpdatingContactInfoByNewContactRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveBatchTaskForUpdatingContactInfoByNewContact").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveBatchTaskForUpdatingContactInfoByNewContactResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveBatchTaskForUpdatingContactInfoByNewContactResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveBatchTaskForUpdatingContactInfoByRegistrantProfileId  SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdRequest
     * @return SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse
     */
    @Override
    public CompletableFuture<SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse> saveBatchTaskForUpdatingContactInfoByRegistrantProfileId(SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveBatchTaskForUpdatingContactInfoByRegistrantProfileId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveDomainGroup  SaveDomainGroupRequest
     * @return SaveDomainGroupResponse
     */
    @Override
    public CompletableFuture<SaveDomainGroupResponse> saveDomainGroup(SaveDomainGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveDomainGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveDomainGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveDomainGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveRegistrantProfile  SaveRegistrantProfileRequest
     * @return SaveRegistrantProfileResponse
     */
    @Override
    public CompletableFuture<SaveRegistrantProfileResponse> saveRegistrantProfile(SaveRegistrantProfileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveRegistrantProfile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveRegistrantProfileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveRegistrantProfileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveRegistrantProfileRealNameVerification  SaveRegistrantProfileRealNameVerificationRequest
     * @return SaveRegistrantProfileRealNameVerificationResponse
     */
    @Override
    public CompletableFuture<SaveRegistrantProfileRealNameVerificationResponse> saveRegistrantProfileRealNameVerification(SaveRegistrantProfileRealNameVerificationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveRegistrantProfileRealNameVerification").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveRegistrantProfileRealNameVerificationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveRegistrantProfileRealNameVerificationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveSingleTaskForAddingDSRecord  SaveSingleTaskForAddingDSRecordRequest
     * @return SaveSingleTaskForAddingDSRecordResponse
     */
    @Override
    public CompletableFuture<SaveSingleTaskForAddingDSRecordResponse> saveSingleTaskForAddingDSRecord(SaveSingleTaskForAddingDSRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveSingleTaskForAddingDSRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveSingleTaskForAddingDSRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveSingleTaskForAddingDSRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveSingleTaskForApplyQuickTransferOutOpenly  SaveSingleTaskForApplyQuickTransferOutOpenlyRequest
     * @return SaveSingleTaskForApplyQuickTransferOutOpenlyResponse
     */
    @Override
    public CompletableFuture<SaveSingleTaskForApplyQuickTransferOutOpenlyResponse> saveSingleTaskForApplyQuickTransferOutOpenly(SaveSingleTaskForApplyQuickTransferOutOpenlyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveSingleTaskForApplyQuickTransferOutOpenly").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveSingleTaskForApplyQuickTransferOutOpenlyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveSingleTaskForApplyQuickTransferOutOpenlyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveSingleTaskForApprovingTransferOut  SaveSingleTaskForApprovingTransferOutRequest
     * @return SaveSingleTaskForApprovingTransferOutResponse
     */
    @Override
    public CompletableFuture<SaveSingleTaskForApprovingTransferOutResponse> saveSingleTaskForApprovingTransferOut(SaveSingleTaskForApprovingTransferOutRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveSingleTaskForApprovingTransferOut").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveSingleTaskForApprovingTransferOutResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveSingleTaskForApprovingTransferOutResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveSingleTaskForAssociatingEns  SaveSingleTaskForAssociatingEnsRequest
     * @return SaveSingleTaskForAssociatingEnsResponse
     */
    @Override
    public CompletableFuture<SaveSingleTaskForAssociatingEnsResponse> saveSingleTaskForAssociatingEns(SaveSingleTaskForAssociatingEnsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveSingleTaskForAssociatingEns").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveSingleTaskForAssociatingEnsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveSingleTaskForAssociatingEnsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveSingleTaskForCancelingTransferIn  SaveSingleTaskForCancelingTransferInRequest
     * @return SaveSingleTaskForCancelingTransferInResponse
     */
    @Override
    public CompletableFuture<SaveSingleTaskForCancelingTransferInResponse> saveSingleTaskForCancelingTransferIn(SaveSingleTaskForCancelingTransferInRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveSingleTaskForCancelingTransferIn").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveSingleTaskForCancelingTransferInResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveSingleTaskForCancelingTransferInResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveSingleTaskForCancelingTransferOut  SaveSingleTaskForCancelingTransferOutRequest
     * @return SaveSingleTaskForCancelingTransferOutResponse
     */
    @Override
    public CompletableFuture<SaveSingleTaskForCancelingTransferOutResponse> saveSingleTaskForCancelingTransferOut(SaveSingleTaskForCancelingTransferOutRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveSingleTaskForCancelingTransferOut").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveSingleTaskForCancelingTransferOutResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveSingleTaskForCancelingTransferOutResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveSingleTaskForCreatingDnsHost  SaveSingleTaskForCreatingDnsHostRequest
     * @return SaveSingleTaskForCreatingDnsHostResponse
     */
    @Override
    public CompletableFuture<SaveSingleTaskForCreatingDnsHostResponse> saveSingleTaskForCreatingDnsHost(SaveSingleTaskForCreatingDnsHostRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveSingleTaskForCreatingDnsHost").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveSingleTaskForCreatingDnsHostResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveSingleTaskForCreatingDnsHostResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveSingleTaskForCreatingOrderActivate  SaveSingleTaskForCreatingOrderActivateRequest
     * @return SaveSingleTaskForCreatingOrderActivateResponse
     */
    @Override
    public CompletableFuture<SaveSingleTaskForCreatingOrderActivateResponse> saveSingleTaskForCreatingOrderActivate(SaveSingleTaskForCreatingOrderActivateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveSingleTaskForCreatingOrderActivate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveSingleTaskForCreatingOrderActivateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveSingleTaskForCreatingOrderActivateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveSingleTaskForCreatingOrderRedeem  SaveSingleTaskForCreatingOrderRedeemRequest
     * @return SaveSingleTaskForCreatingOrderRedeemResponse
     */
    @Override
    public CompletableFuture<SaveSingleTaskForCreatingOrderRedeemResponse> saveSingleTaskForCreatingOrderRedeem(SaveSingleTaskForCreatingOrderRedeemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveSingleTaskForCreatingOrderRedeem").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveSingleTaskForCreatingOrderRedeemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveSingleTaskForCreatingOrderRedeemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveSingleTaskForCreatingOrderRenew  SaveSingleTaskForCreatingOrderRenewRequest
     * @return SaveSingleTaskForCreatingOrderRenewResponse
     */
    @Override
    public CompletableFuture<SaveSingleTaskForCreatingOrderRenewResponse> saveSingleTaskForCreatingOrderRenew(SaveSingleTaskForCreatingOrderRenewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveSingleTaskForCreatingOrderRenew").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveSingleTaskForCreatingOrderRenewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveSingleTaskForCreatingOrderRenewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveSingleTaskForCreatingOrderTransfer  SaveSingleTaskForCreatingOrderTransferRequest
     * @return SaveSingleTaskForCreatingOrderTransferResponse
     */
    @Override
    public CompletableFuture<SaveSingleTaskForCreatingOrderTransferResponse> saveSingleTaskForCreatingOrderTransfer(SaveSingleTaskForCreatingOrderTransferRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveSingleTaskForCreatingOrderTransfer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveSingleTaskForCreatingOrderTransferResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveSingleTaskForCreatingOrderTransferResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveSingleTaskForDeletingDSRecord  SaveSingleTaskForDeletingDSRecordRequest
     * @return SaveSingleTaskForDeletingDSRecordResponse
     */
    @Override
    public CompletableFuture<SaveSingleTaskForDeletingDSRecordResponse> saveSingleTaskForDeletingDSRecord(SaveSingleTaskForDeletingDSRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveSingleTaskForDeletingDSRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveSingleTaskForDeletingDSRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveSingleTaskForDeletingDSRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveSingleTaskForDeletingDnsHost  SaveSingleTaskForDeletingDnsHostRequest
     * @return SaveSingleTaskForDeletingDnsHostResponse
     */
    @Override
    public CompletableFuture<SaveSingleTaskForDeletingDnsHostResponse> saveSingleTaskForDeletingDnsHost(SaveSingleTaskForDeletingDnsHostRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveSingleTaskForDeletingDnsHost").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveSingleTaskForDeletingDnsHostResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveSingleTaskForDeletingDnsHostResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveSingleTaskForDisassociatingEns  SaveSingleTaskForDisassociatingEnsRequest
     * @return SaveSingleTaskForDisassociatingEnsResponse
     */
    @Override
    public CompletableFuture<SaveSingleTaskForDisassociatingEnsResponse> saveSingleTaskForDisassociatingEns(SaveSingleTaskForDisassociatingEnsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveSingleTaskForDisassociatingEns").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveSingleTaskForDisassociatingEnsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveSingleTaskForDisassociatingEnsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveSingleTaskForDomainNameProxyService  SaveSingleTaskForDomainNameProxyServiceRequest
     * @return SaveSingleTaskForDomainNameProxyServiceResponse
     */
    @Override
    public CompletableFuture<SaveSingleTaskForDomainNameProxyServiceResponse> saveSingleTaskForDomainNameProxyService(SaveSingleTaskForDomainNameProxyServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveSingleTaskForDomainNameProxyService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveSingleTaskForDomainNameProxyServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveSingleTaskForDomainNameProxyServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveSingleTaskForGenerateDomainCertificate  SaveSingleTaskForGenerateDomainCertificateRequest
     * @return SaveSingleTaskForGenerateDomainCertificateResponse
     */
    @Override
    public CompletableFuture<SaveSingleTaskForGenerateDomainCertificateResponse> saveSingleTaskForGenerateDomainCertificate(SaveSingleTaskForGenerateDomainCertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveSingleTaskForGenerateDomainCertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveSingleTaskForGenerateDomainCertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveSingleTaskForGenerateDomainCertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveSingleTaskForModifyingDSRecord  SaveSingleTaskForModifyingDSRecordRequest
     * @return SaveSingleTaskForModifyingDSRecordResponse
     */
    @Override
    public CompletableFuture<SaveSingleTaskForModifyingDSRecordResponse> saveSingleTaskForModifyingDSRecord(SaveSingleTaskForModifyingDSRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveSingleTaskForModifyingDSRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveSingleTaskForModifyingDSRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveSingleTaskForModifyingDSRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveSingleTaskForModifyingDnsHost  SaveSingleTaskForModifyingDnsHostRequest
     * @return SaveSingleTaskForModifyingDnsHostResponse
     */
    @Override
    public CompletableFuture<SaveSingleTaskForModifyingDnsHostResponse> saveSingleTaskForModifyingDnsHost(SaveSingleTaskForModifyingDnsHostRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveSingleTaskForModifyingDnsHost").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveSingleTaskForModifyingDnsHostResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveSingleTaskForModifyingDnsHostResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveSingleTaskForQueryingTransferAuthorizationCode  SaveSingleTaskForQueryingTransferAuthorizationCodeRequest
     * @return SaveSingleTaskForQueryingTransferAuthorizationCodeResponse
     */
    @Override
    public CompletableFuture<SaveSingleTaskForQueryingTransferAuthorizationCodeResponse> saveSingleTaskForQueryingTransferAuthorizationCode(SaveSingleTaskForQueryingTransferAuthorizationCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveSingleTaskForQueryingTransferAuthorizationCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveSingleTaskForQueryingTransferAuthorizationCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveSingleTaskForQueryingTransferAuthorizationCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveSingleTaskForReserveDropListDomain  SaveSingleTaskForReserveDropListDomainRequest
     * @return SaveSingleTaskForReserveDropListDomainResponse
     */
    @Override
    public CompletableFuture<SaveSingleTaskForReserveDropListDomainResponse> saveSingleTaskForReserveDropListDomain(SaveSingleTaskForReserveDropListDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveSingleTaskForReserveDropListDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveSingleTaskForReserveDropListDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveSingleTaskForReserveDropListDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveSingleTaskForSaveArtExtension  SaveSingleTaskForSaveArtExtensionRequest
     * @return SaveSingleTaskForSaveArtExtensionResponse
     */
    @Override
    public CompletableFuture<SaveSingleTaskForSaveArtExtensionResponse> saveSingleTaskForSaveArtExtension(SaveSingleTaskForSaveArtExtensionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveSingleTaskForSaveArtExtension").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveSingleTaskForSaveArtExtensionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveSingleTaskForSaveArtExtensionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveSingleTaskForSynchronizingDSRecord  SaveSingleTaskForSynchronizingDSRecordRequest
     * @return SaveSingleTaskForSynchronizingDSRecordResponse
     */
    @Override
    public CompletableFuture<SaveSingleTaskForSynchronizingDSRecordResponse> saveSingleTaskForSynchronizingDSRecord(SaveSingleTaskForSynchronizingDSRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveSingleTaskForSynchronizingDSRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveSingleTaskForSynchronizingDSRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveSingleTaskForSynchronizingDSRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveSingleTaskForSynchronizingDnsHost  SaveSingleTaskForSynchronizingDnsHostRequest
     * @return SaveSingleTaskForSynchronizingDnsHostResponse
     */
    @Override
    public CompletableFuture<SaveSingleTaskForSynchronizingDnsHostResponse> saveSingleTaskForSynchronizingDnsHost(SaveSingleTaskForSynchronizingDnsHostRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveSingleTaskForSynchronizingDnsHost").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveSingleTaskForSynchronizingDnsHostResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveSingleTaskForSynchronizingDnsHostResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveSingleTaskForTransferOutByAuthorizationCode  SaveSingleTaskForTransferOutByAuthorizationCodeRequest
     * @return SaveSingleTaskForTransferOutByAuthorizationCodeResponse
     */
    @Override
    public CompletableFuture<SaveSingleTaskForTransferOutByAuthorizationCodeResponse> saveSingleTaskForTransferOutByAuthorizationCode(SaveSingleTaskForTransferOutByAuthorizationCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveSingleTaskForTransferOutByAuthorizationCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveSingleTaskForTransferOutByAuthorizationCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveSingleTaskForTransferOutByAuthorizationCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveSingleTaskForTransferProhibitionLock  SaveSingleTaskForTransferProhibitionLockRequest
     * @return SaveSingleTaskForTransferProhibitionLockResponse
     */
    @Override
    public CompletableFuture<SaveSingleTaskForTransferProhibitionLockResponse> saveSingleTaskForTransferProhibitionLock(SaveSingleTaskForTransferProhibitionLockRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveSingleTaskForTransferProhibitionLock").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveSingleTaskForTransferProhibitionLockResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveSingleTaskForTransferProhibitionLockResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveSingleTaskForUpdateProhibitionLock  SaveSingleTaskForUpdateProhibitionLockRequest
     * @return SaveSingleTaskForUpdateProhibitionLockResponse
     */
    @Override
    public CompletableFuture<SaveSingleTaskForUpdateProhibitionLockResponse> saveSingleTaskForUpdateProhibitionLock(SaveSingleTaskForUpdateProhibitionLockRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveSingleTaskForUpdateProhibitionLock").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveSingleTaskForUpdateProhibitionLockResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveSingleTaskForUpdateProhibitionLockResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveSingleTaskForUpdatingContactInfo  SaveSingleTaskForUpdatingContactInfoRequest
     * @return SaveSingleTaskForUpdatingContactInfoResponse
     */
    @Override
    public CompletableFuture<SaveSingleTaskForUpdatingContactInfoResponse> saveSingleTaskForUpdatingContactInfo(SaveSingleTaskForUpdatingContactInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveSingleTaskForUpdatingContactInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveSingleTaskForUpdatingContactInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveSingleTaskForUpdatingContactInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveTaskForSubmittingDomainDelete  SaveTaskForSubmittingDomainDeleteRequest
     * @return SaveTaskForSubmittingDomainDeleteResponse
     */
    @Override
    public CompletableFuture<SaveTaskForSubmittingDomainDeleteResponse> saveTaskForSubmittingDomainDelete(SaveTaskForSubmittingDomainDeleteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveTaskForSubmittingDomainDelete").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveTaskForSubmittingDomainDeleteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveTaskForSubmittingDomainDeleteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredential  SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest
     * @return SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponse
     */
    @Override
    public CompletableFuture<SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponse> saveTaskForSubmittingDomainRealNameVerificationByIdentityCredential(SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredential").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileID  SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDRequest
     * @return SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponse
     */
    @Override
    public CompletableFuture<SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponse> saveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileID(SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileID").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveTaskForUpdatingRegistrantInfoByIdentityCredential  SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest
     * @return SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponse
     */
    @Override
    public CompletableFuture<SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponse> saveTaskForUpdatingRegistrantInfoByIdentityCredential(SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveTaskForUpdatingRegistrantInfoByIdentityCredential").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveTaskForUpdatingRegistrantInfoByRegistrantProfileID  SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDRequest
     * @return SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse
     */
    @Override
    public CompletableFuture<SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse> saveTaskForUpdatingRegistrantInfoByRegistrantProfileID(SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveTaskForUpdatingRegistrantInfoByRegistrantProfileID").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you have a large number of domain names, a slow response may occur when you call an API operation to query domain names. In this case, you can call this operation to query domain names more quickly. When you call this operation for the first time, specify the request parameters except ScrollId. A scroll ID is returned without other data. In the second request, use the scroll ID obtained from the previous response. In subsequent requests, the newly specified request parameters do not take effect, and the request parameters that are specified in the first request prevail.</p>
     * 
     * @param request the request parameters of ScrollDomainList  ScrollDomainListRequest
     * @return ScrollDomainListResponse
     */
    @Override
    public CompletableFuture<ScrollDomainListResponse> scrollDomainList(ScrollDomainListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ScrollDomainList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ScrollDomainListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ScrollDomainListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetDefaultRegistrantProfile  SetDefaultRegistrantProfileRequest
     * @return SetDefaultRegistrantProfileResponse
     */
    @Override
    public CompletableFuture<SetDefaultRegistrantProfileResponse> setDefaultRegistrantProfile(SetDefaultRegistrantProfileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetDefaultRegistrantProfile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetDefaultRegistrantProfileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetDefaultRegistrantProfileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetupDomainAutoRenew  SetupDomainAutoRenewRequest
     * @return SetupDomainAutoRenewResponse
     */
    @Override
    public CompletableFuture<SetupDomainAutoRenewResponse> setupDomainAutoRenew(SetupDomainAutoRenewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetupDomainAutoRenew").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetupDomainAutoRenewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetupDomainAutoRenewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitDomainSpecialBizCredentials  SubmitDomainSpecialBizCredentialsRequest
     * @return SubmitDomainSpecialBizCredentialsResponse
     */
    @Override
    public CompletableFuture<SubmitDomainSpecialBizCredentialsResponse> submitDomainSpecialBizCredentials(SubmitDomainSpecialBizCredentialsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitDomainSpecialBizCredentials").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitDomainSpecialBizCredentialsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitDomainSpecialBizCredentialsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitEmailVerification  SubmitEmailVerificationRequest
     * @return SubmitEmailVerificationResponse
     */
    @Override
    public CompletableFuture<SubmitEmailVerificationResponse> submitEmailVerification(SubmitEmailVerificationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitEmailVerification").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitEmailVerificationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitEmailVerificationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitOperationAuditInfo  SubmitOperationAuditInfoRequest
     * @return SubmitOperationAuditInfoResponse
     */
    @Override
    public CompletableFuture<SubmitOperationAuditInfoResponse> submitOperationAuditInfo(SubmitOperationAuditInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitOperationAuditInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitOperationAuditInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitOperationAuditInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitOperationCredentials  SubmitOperationCredentialsRequest
     * @return SubmitOperationCredentialsResponse
     */
    @Override
    public CompletableFuture<SubmitOperationCredentialsResponse> submitOperationCredentials(SubmitOperationCredentialsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitOperationCredentials").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitOperationCredentialsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitOperationCredentialsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TransferInCheckMailToken  TransferInCheckMailTokenRequest
     * @return TransferInCheckMailTokenResponse
     */
    @Override
    public CompletableFuture<TransferInCheckMailTokenResponse> transferInCheckMailToken(TransferInCheckMailTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TransferInCheckMailToken").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TransferInCheckMailTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TransferInCheckMailTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TransferInReenterTransferAuthorizationCode  TransferInReenterTransferAuthorizationCodeRequest
     * @return TransferInReenterTransferAuthorizationCodeResponse
     */
    @Override
    public CompletableFuture<TransferInReenterTransferAuthorizationCodeResponse> transferInReenterTransferAuthorizationCode(TransferInReenterTransferAuthorizationCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TransferInReenterTransferAuthorizationCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TransferInReenterTransferAuthorizationCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TransferInReenterTransferAuthorizationCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TransferInRefetchWhoisEmail  TransferInRefetchWhoisEmailRequest
     * @return TransferInRefetchWhoisEmailResponse
     */
    @Override
    public CompletableFuture<TransferInRefetchWhoisEmailResponse> transferInRefetchWhoisEmail(TransferInRefetchWhoisEmailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TransferInRefetchWhoisEmail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TransferInRefetchWhoisEmailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TransferInRefetchWhoisEmailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TransferInResendMailToken  TransferInResendMailTokenRequest
     * @return TransferInResendMailTokenResponse
     */
    @Override
    public CompletableFuture<TransferInResendMailTokenResponse> transferInResendMailToken(TransferInResendMailTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TransferInResendMailToken").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TransferInResendMailTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TransferInResendMailTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateDomainToDomainGroup  UpdateDomainToDomainGroupRequest
     * @return UpdateDomainToDomainGroupResponse
     */
    @Override
    public CompletableFuture<UpdateDomainToDomainGroupResponse> updateDomainToDomainGroup(UpdateDomainToDomainGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDomainToDomainGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDomainToDomainGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDomainToDomainGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of VerifyContactField  VerifyContactFieldRequest
     * @return VerifyContactFieldResponse
     */
    @Override
    public CompletableFuture<VerifyContactFieldResponse> verifyContactField(VerifyContactFieldRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("VerifyContactField").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VerifyContactFieldResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VerifyContactFieldResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of VerifyEmail  VerifyEmailRequest
     * @return VerifyEmailResponse
     */
    @Override
    public CompletableFuture<VerifyEmailResponse> verifyEmail(VerifyEmailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("VerifyEmail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VerifyEmailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VerifyEmailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
