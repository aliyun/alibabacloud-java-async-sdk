// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.domain20180129.models.*;
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
     * <b>description</b> :
     * <p>After the task detail result is confirmed, it can no longer be queried from the <a href="https://help.aliyun.com/document_detail/69361.html">PollTaskResult</a> API.</p>
     * 
     * @param request the request parameters of AcknowledgeTaskResult  AcknowledgeTaskResultRequest
     * @return AcknowledgeTaskResultResponse
     */
    CompletableFuture<AcknowledgeTaskResultResponse> acknowledgeTaskResult(AcknowledgeTaskResultRequest request);

    /**
     * @param request the request parameters of BatchFuzzyMatchDomainSensitiveWord  BatchFuzzyMatchDomainSensitiveWordRequest
     * @return BatchFuzzyMatchDomainSensitiveWordResponse
     */
    CompletableFuture<BatchFuzzyMatchDomainSensitiveWordResponse> batchFuzzyMatchDomainSensitiveWord(BatchFuzzyMatchDomainSensitiveWordRequest request);

    /**
     * @param request the request parameters of CancelDomainVerification  CancelDomainVerificationRequest
     * @return CancelDomainVerificationResponse
     */
    CompletableFuture<CancelDomainVerificationResponse> cancelDomainVerification(CancelDomainVerificationRequest request);

    /**
     * @param request the request parameters of CancelOperationAudit  CancelOperationAuditRequest
     * @return CancelOperationAuditResponse
     */
    CompletableFuture<CancelOperationAuditResponse> cancelOperationAudit(CancelOperationAuditRequest request);

    /**
     * @param request the request parameters of CancelQualificationVerification  CancelQualificationVerificationRequest
     * @return CancelQualificationVerificationResponse
     */
    CompletableFuture<CancelQualificationVerificationResponse> cancelQualificationVerification(CancelQualificationVerificationRequest request);

    /**
     * @param request the request parameters of CancelTask  CancelTaskRequest
     * @return CancelTaskResponse
     */
    CompletableFuture<CancelTaskResponse> cancelTask(CancelTaskRequest request);

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>For the legitimacy requirements of domain names, see <a href="https://help.aliyun.com/document_detail/67788.html">Domain Name Legitimacy</a>.</p>
     * <blockquote>
     * <p>The CheckDomain API has a frequency limit. The combined queries per second (QPS) limit for an Alibaba Cloud account and its RAM users is 10, and the total QPS limit for this API is 100.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CheckDomain  CheckDomainRequest
     * @return CheckDomainResponse
     */
    CompletableFuture<CheckDomainResponse> checkDomain(CheckDomainRequest request);

    /**
     * @param request the request parameters of CheckDomainSunriseClaim  CheckDomainSunriseClaimRequest
     * @return CheckDomainSunriseClaimResponse
     */
    CompletableFuture<CheckDomainSunriseClaimResponse> checkDomainSunriseClaim(CheckDomainSunriseClaimRequest request);

    /**
     * @param request the request parameters of CheckIntlFixPriceDomainStatus  CheckIntlFixPriceDomainStatusRequest
     * @return CheckIntlFixPriceDomainStatusResponse
     */
    CompletableFuture<CheckIntlFixPriceDomainStatusResponse> checkIntlFixPriceDomainStatus(CheckIntlFixPriceDomainStatusRequest request);

    /**
     * @param request the request parameters of CheckMaxYearOfServerLock  CheckMaxYearOfServerLockRequest
     * @return CheckMaxYearOfServerLockResponse
     */
    CompletableFuture<CheckMaxYearOfServerLockResponse> checkMaxYearOfServerLock(CheckMaxYearOfServerLockRequest request);

    /**
     * @param request the request parameters of CheckProcessingServerLockApply  CheckProcessingServerLockApplyRequest
     * @return CheckProcessingServerLockApplyResponse
     */
    CompletableFuture<CheckProcessingServerLockApplyResponse> checkProcessingServerLockApply(CheckProcessingServerLockApplyRequest request);

    /**
     * @param request the request parameters of CheckTransferInFeasibility  CheckTransferInFeasibilityRequest
     * @return CheckTransferInFeasibilityResponse
     */
    CompletableFuture<CheckTransferInFeasibilityResponse> checkTransferInFeasibility(CheckTransferInFeasibilityRequest request);

    /**
     * <b>description</b> :
     * <p>Directly confirm the transfer-in mailbox.</p>
     * 
     * @param request the request parameters of ConfirmTransferInEmail  ConfirmTransferInEmailRequest
     * @return ConfirmTransferInEmailResponse
     */
    CompletableFuture<ConfirmTransferInEmailResponse> confirmTransferInEmail(ConfirmTransferInEmailRequest request);

    /**
     * @param request the request parameters of CreateIntlFixedPriceDomainOrder  CreateIntlFixedPriceDomainOrderRequest
     * @return CreateIntlFixedPriceDomainOrderResponse
     */
    CompletableFuture<CreateIntlFixedPriceDomainOrderResponse> createIntlFixedPriceDomainOrder(CreateIntlFixedPriceDomainOrderRequest request);

    /**
     * @param request the request parameters of DeleteContactTemplates  DeleteContactTemplatesRequest
     * @return DeleteContactTemplatesResponse
     */
    CompletableFuture<DeleteContactTemplatesResponse> deleteContactTemplates(DeleteContactTemplatesRequest request);

    /**
     * @param request the request parameters of DeleteDomainGroup  DeleteDomainGroupRequest
     * @return DeleteDomainGroupResponse
     */
    CompletableFuture<DeleteDomainGroupResponse> deleteDomainGroup(DeleteDomainGroupRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>If you want to use the email address again after deletion, you must complete email verification again.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteEmailVerification  DeleteEmailVerificationRequest
     * @return DeleteEmailVerificationResponse
     */
    CompletableFuture<DeleteEmailVerificationResponse> deleteEmailVerification(DeleteEmailVerificationRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>If the API call succeeds, the System immediately deletes the corresponding domain name registrant profile.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteRegistrantProfile  DeleteRegistrantProfileRequest
     * @return DeleteRegistrantProfileResponse
     */
    CompletableFuture<DeleteRegistrantProfileResponse> deleteRegistrantProfile(DeleteRegistrantProfileRequest request);

    /**
     * @param request the request parameters of DomainKnowledgeRetrieve  DomainKnowledgeRetrieveRequest
     * @return DomainKnowledgeRetrieveResponse
     */
    CompletableFuture<DomainKnowledgeRetrieveResponse> domainKnowledgeRetrieve(DomainKnowledgeRetrieveRequest request);

    /**
     * @param request the request parameters of DomainSpecialBizCancel  DomainSpecialBizCancelRequest
     * @return DomainSpecialBizCancelResponse
     */
    CompletableFuture<DomainSpecialBizCancelResponse> domainSpecialBizCancel(DomainSpecialBizCancelRequest request);

    /**
     * @param request the request parameters of EmailVerified  EmailVerifiedRequest
     * @return EmailVerifiedResponse
     */
    CompletableFuture<EmailVerifiedResponse> emailVerified(EmailVerifiedRequest request);

    /**
     * @param request the request parameters of FuzzyMatchDomainSensitiveWord  FuzzyMatchDomainSensitiveWordRequest
     * @return FuzzyMatchDomainSensitiveWordResponse
     */
    CompletableFuture<FuzzyMatchDomainSensitiveWordResponse> fuzzyMatchDomainSensitiveWord(FuzzyMatchDomainSensitiveWordRequest request);

    /**
     * @param request the request parameters of GetIntlFixPriceDomainListUrl  GetIntlFixPriceDomainListUrlRequest
     * @return GetIntlFixPriceDomainListUrlResponse
     */
    CompletableFuture<GetIntlFixPriceDomainListUrlResponse> getIntlFixPriceDomainListUrl(GetIntlFixPriceDomainListUrlRequest request);

    /**
     * @param request the request parameters of GetOperationOssUploadPolicy  GetOperationOssUploadPolicyRequest
     * @return GetOperationOssUploadPolicyResponse
     */
    CompletableFuture<GetOperationOssUploadPolicyResponse> getOperationOssUploadPolicy(GetOperationOssUploadPolicyRequest request);

    /**
     * @param request the request parameters of GetQualificationUploadPolicy  GetQualificationUploadPolicyRequest
     * @return GetQualificationUploadPolicyResponse
     */
    CompletableFuture<GetQualificationUploadPolicyResponse> getQualificationUploadPolicy(GetQualificationUploadPolicyRequest request);

    /**
     * @param request the request parameters of ListEmailVerification  ListEmailVerificationRequest
     * @return ListEmailVerificationResponse
     */
    CompletableFuture<ListEmailVerificationResponse> listEmailVerification(ListEmailVerificationRequest request);

    /**
     * @param request the request parameters of ListServerLock  ListServerLockRequest
     * @return ListServerLockResponse
     */
    CompletableFuture<ListServerLockResponse> listServerLock(ListServerLockRequest request);

    /**
     * @param request the request parameters of LookupTmchNotice  LookupTmchNoticeRequest
     * @return LookupTmchNoticeResponse
     */
    CompletableFuture<LookupTmchNoticeResponse> lookupTmchNotice(LookupTmchNoticeRequest request);

    /**
     * <b>description</b> :
     * <p>This API must be used together with <a href="~~AcknowledgeTaskResult~~">AcknowledgeTaskResult</a> to confirm job results. Once a job result is confirmed, the corresponding job record can no longer be queried through this API.</p>
     * 
     * @param request the request parameters of PollTaskResult  PollTaskResultRequest
     * @return PollTaskResultResponse
     */
    CompletableFuture<PollTaskResultResponse> pollTaskResult(PollTaskResultRequest request);

    /**
     * <b>description</b> :
     * <p>Search for domain names under your current Alibaba Cloud account that meet specific conditions. A maximum of <strong>5000</strong> entries are displayed. If the result reaches <strong>5000</strong> entries, narrow your search scope.</p>
     * 
     * @param request the request parameters of QueryAdvancedDomainList  QueryAdvancedDomainListRequest
     * @return QueryAdvancedDomainListResponse
     */
    CompletableFuture<QueryAdvancedDomainListResponse> queryAdvancedDomainList(QueryAdvancedDomainListRequest request);

    /**
     * @param request the request parameters of QueryArtExtension  QueryArtExtensionRequest
     * @return QueryArtExtensionResponse
     */
    CompletableFuture<QueryArtExtensionResponse> queryArtExtension(QueryArtExtensionRequest request);

    /**
     * @param request the request parameters of QueryChangeLogList  QueryChangeLogListRequest
     * @return QueryChangeLogListResponse
     */
    CompletableFuture<QueryChangeLogListResponse> queryChangeLogList(QueryChangeLogListRequest request);

    /**
     * @param request the request parameters of QueryContactInfo  QueryContactInfoRequest
     * @return QueryContactInfoResponse
     */
    CompletableFuture<QueryContactInfoResponse> queryContactInfo(QueryContactInfoRequest request);

    /**
     * @param request the request parameters of QueryDSRecord  QueryDSRecordRequest
     * @return QueryDSRecordResponse
     */
    CompletableFuture<QueryDSRecordResponse> queryDSRecord(QueryDSRecordRequest request);

    /**
     * @param request the request parameters of QueryDnsHost  QueryDnsHostRequest
     * @return QueryDnsHostResponse
     */
    CompletableFuture<QueryDnsHostResponse> queryDnsHost(QueryDnsHostRequest request);

    /**
     * @param request the request parameters of QueryDomainAdminDivision  QueryDomainAdminDivisionRequest
     * @return QueryDomainAdminDivisionResponse
     */
    CompletableFuture<QueryDomainAdminDivisionResponse> queryDomainAdminDivision(QueryDomainAdminDivisionRequest request);

    /**
     * @param request the request parameters of QueryDomainByDomainName  QueryDomainByDomainNameRequest
     * @return QueryDomainByDomainNameResponse
     */
    CompletableFuture<QueryDomainByDomainNameResponse> queryDomainByDomainName(QueryDomainByDomainNameRequest request);

    /**
     * @param request the request parameters of QueryDomainByInstanceId  QueryDomainByInstanceIdRequest
     * @return QueryDomainByInstanceIdResponse
     */
    CompletableFuture<QueryDomainByInstanceIdResponse> queryDomainByInstanceId(QueryDomainByInstanceIdRequest request);

    /**
     * @param request the request parameters of QueryDomainGroupList  QueryDomainGroupListRequest
     * @return QueryDomainGroupListResponse
     */
    CompletableFuture<QueryDomainGroupListResponse> queryDomainGroupList(QueryDomainGroupListRequest request);

    /**
     * @param request the request parameters of QueryDomainList  QueryDomainListRequest
     * @return QueryDomainListResponse
     */
    CompletableFuture<QueryDomainListResponse> queryDomainList(QueryDomainListRequest request);

    /**
     * @param request the request parameters of QueryDomainRealNameVerificationInfo  QueryDomainRealNameVerificationInfoRequest
     * @return QueryDomainRealNameVerificationInfoResponse
     */
    CompletableFuture<QueryDomainRealNameVerificationInfoResponse> queryDomainRealNameVerificationInfo(QueryDomainRealNameVerificationInfoRequest request);

    /**
     * @param request the request parameters of QueryDomainRealTimePrice  QueryDomainRealTimePriceRequest
     * @return QueryDomainRealTimePriceResponse
     */
    CompletableFuture<QueryDomainRealTimePriceResponse> queryDomainRealTimePrice(QueryDomainRealTimePriceRequest request);

    /**
     * @param request the request parameters of QueryDomainSpecialBizDetail  QueryDomainSpecialBizDetailRequest
     * @return QueryDomainSpecialBizDetailResponse
     */
    CompletableFuture<QueryDomainSpecialBizDetailResponse> queryDomainSpecialBizDetail(QueryDomainSpecialBizDetailRequest request);

    /**
     * @param request the request parameters of QueryDomainSpecialBizInfoByDomain  QueryDomainSpecialBizInfoByDomainRequest
     * @return QueryDomainSpecialBizInfoByDomainResponse
     */
    CompletableFuture<QueryDomainSpecialBizInfoByDomainResponse> queryDomainSpecialBizInfoByDomain(QueryDomainSpecialBizInfoByDomainRequest request);

    /**
     * @param request the request parameters of QueryDomainSuffix  QueryDomainSuffixRequest
     * @return QueryDomainSuffixResponse
     */
    CompletableFuture<QueryDomainSuffixResponse> queryDomainSuffix(QueryDomainSuffixRequest request);

    /**
     * @param request the request parameters of QueryEmailVerification  QueryEmailVerificationRequest
     * @return QueryEmailVerificationResponse
     */
    CompletableFuture<QueryEmailVerificationResponse> queryEmailVerification(QueryEmailVerificationRequest request);

    /**
     * @param request the request parameters of QueryEnsAssociation  QueryEnsAssociationRequest
     * @return QueryEnsAssociationResponse
     */
    CompletableFuture<QueryEnsAssociationResponse> queryEnsAssociation(QueryEnsAssociationRequest request);

    /**
     * @param request the request parameters of QueryFailReasonForDomainRealNameVerification  QueryFailReasonForDomainRealNameVerificationRequest
     * @return QueryFailReasonForDomainRealNameVerificationResponse
     */
    CompletableFuture<QueryFailReasonForDomainRealNameVerificationResponse> queryFailReasonForDomainRealNameVerification(QueryFailReasonForDomainRealNameVerificationRequest request);

    /**
     * @param request the request parameters of QueryFailReasonForRegistrantProfileRealNameVerification  QueryFailReasonForRegistrantProfileRealNameVerificationRequest
     * @return QueryFailReasonForRegistrantProfileRealNameVerificationResponse
     */
    CompletableFuture<QueryFailReasonForRegistrantProfileRealNameVerificationResponse> queryFailReasonForRegistrantProfileRealNameVerification(QueryFailReasonForRegistrantProfileRealNameVerificationRequest request);

    /**
     * @param request the request parameters of QueryFailingReasonListForQualification  QueryFailingReasonListForQualificationRequest
     * @return QueryFailingReasonListForQualificationResponse
     */
    CompletableFuture<QueryFailingReasonListForQualificationResponse> queryFailingReasonListForQualification(QueryFailingReasonListForQualificationRequest request);

    /**
     * @param request the request parameters of QueryIntlFixedPriceOrderList  QueryIntlFixedPriceOrderListRequest
     * @return QueryIntlFixedPriceOrderListResponse
     */
    CompletableFuture<QueryIntlFixedPriceOrderListResponse> queryIntlFixedPriceOrderList(QueryIntlFixedPriceOrderListRequest request);

    /**
     * @param request the request parameters of QueryLocalEnsAssociation  QueryLocalEnsAssociationRequest
     * @return QueryLocalEnsAssociationResponse
     */
    CompletableFuture<QueryLocalEnsAssociationResponse> queryLocalEnsAssociation(QueryLocalEnsAssociationRequest request);

    /**
     * @param request the request parameters of QueryOperationAuditInfoDetail  QueryOperationAuditInfoDetailRequest
     * @return QueryOperationAuditInfoDetailResponse
     */
    CompletableFuture<QueryOperationAuditInfoDetailResponse> queryOperationAuditInfoDetail(QueryOperationAuditInfoDetailRequest request);

    /**
     * @param request the request parameters of QueryOperationAuditInfoList  QueryOperationAuditInfoListRequest
     * @return QueryOperationAuditInfoListResponse
     */
    CompletableFuture<QueryOperationAuditInfoListResponse> queryOperationAuditInfoList(QueryOperationAuditInfoListRequest request);

    /**
     * @param request the request parameters of QueryQualificationDetail  QueryQualificationDetailRequest
     * @return QueryQualificationDetailResponse
     */
    CompletableFuture<QueryQualificationDetailResponse> queryQualificationDetail(QueryQualificationDetailRequest request);

    /**
     * @param request the request parameters of QueryRegistrantProfileRealNameVerificationInfo  QueryRegistrantProfileRealNameVerificationInfoRequest
     * @return QueryRegistrantProfileRealNameVerificationInfoResponse
     */
    CompletableFuture<QueryRegistrantProfileRealNameVerificationInfoResponse> queryRegistrantProfileRealNameVerificationInfo(QueryRegistrantProfileRealNameVerificationInfoRequest request);

    /**
     * <b>description</b> :
     * <p>You can pass in optional parameters to help you find registrant profiles more precisely. For example:</p>
     * <ul>
     * <li>If you already know the ID of a registrant profile, you can pass in the registrant profile ID to query detailed profile information.</li>
     * <li>If you do not know the ID of a registrant profile, you can pass in parameters such as the domain name registrant name to query detailed profile information.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryRegistrantProfiles  QueryRegistrantProfilesRequest
     * @return QueryRegistrantProfilesResponse
     */
    CompletableFuture<QueryRegistrantProfilesResponse> queryRegistrantProfiles(QueryRegistrantProfilesRequest request);

    /**
     * @param request the request parameters of QueryServerLock  QueryServerLockRequest
     * @return QueryServerLockResponse
     */
    CompletableFuture<QueryServerLockResponse> queryServerLock(QueryServerLockRequest request);

    /**
     * @param request the request parameters of QueryTaskDetailHistory  QueryTaskDetailHistoryRequest
     * @return QueryTaskDetailHistoryResponse
     */
    CompletableFuture<QueryTaskDetailHistoryResponse> queryTaskDetailHistory(QueryTaskDetailHistoryRequest request);

    /**
     * @param request the request parameters of QueryTaskDetailList  QueryTaskDetailListRequest
     * @return QueryTaskDetailListResponse
     */
    CompletableFuture<QueryTaskDetailListResponse> queryTaskDetailList(QueryTaskDetailListRequest request);

    /**
     * @param request the request parameters of QueryTaskInfoHistory  QueryTaskInfoHistoryRequest
     * @return QueryTaskInfoHistoryResponse
     */
    CompletableFuture<QueryTaskInfoHistoryResponse> queryTaskInfoHistory(QueryTaskInfoHistoryRequest request);

    /**
     * @param request the request parameters of QueryTaskList  QueryTaskListRequest
     * @return QueryTaskListResponse
     */
    CompletableFuture<QueryTaskListResponse> queryTaskList(QueryTaskListRequest request);

    /**
     * @param request the request parameters of QueryTransferInByInstanceId  QueryTransferInByInstanceIdRequest
     * @return QueryTransferInByInstanceIdResponse
     */
    CompletableFuture<QueryTransferInByInstanceIdResponse> queryTransferInByInstanceId(QueryTransferInByInstanceIdRequest request);

    /**
     * @param request the request parameters of QueryTransferInList  QueryTransferInListRequest
     * @return QueryTransferInListResponse
     */
    CompletableFuture<QueryTransferInListResponse> queryTransferInList(QueryTransferInListRequest request);

    /**
     * @param request the request parameters of QueryTransferOutInfo  QueryTransferOutInfoRequest
     * @return QueryTransferOutInfoResponse
     */
    CompletableFuture<QueryTransferOutInfoResponse> queryTransferOutInfo(QueryTransferOutInfoRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Identity verification document review takes 3 to 5 business days. After the authority completes the review, you can invoke the <a href="https://help.aliyun.com/document_detail/67701.html">QueryRegistrantProfiles</a> API to query the identity verification result.  </li>
     * <li>If identity verification fails, refer to <a href="https://help.aliyun.com/document_detail/35885.html">Reasons for Identity Verification Failure and Solutions</a> for troubleshooting and resolution.<blockquote>
     * <p>You must invoke this API using the POST method; otherwise, the invocation will fail. When using a software development kit (SDK), set the <strong>method</strong> parameter of the request object to <strong>POST</strong>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of RegistrantProfileRealNameVerification  RegistrantProfileRealNameVerificationRequest
     * @return RegistrantProfileRealNameVerificationResponse
     */
    CompletableFuture<RegistrantProfileRealNameVerificationResponse> registrantProfileRealNameVerification(RegistrantProfileRealNameVerificationRequest request);

    /**
     * @param request the request parameters of ResendEmailVerification  ResendEmailVerificationRequest
     * @return ResendEmailVerificationResponse
     */
    CompletableFuture<ResendEmailVerificationResponse> resendEmailVerification(ResendEmailVerificationRequest request);

    /**
     * @param request the request parameters of ResetQualificationVerification  ResetQualificationVerificationRequest
     * @return ResetQualificationVerificationResponse
     */
    CompletableFuture<ResetQualificationVerificationResponse> resetQualificationVerification(ResetQualificationVerificationRequest request);

    /**
     * @param request the request parameters of SaveBatchDomainRemark  SaveBatchDomainRemarkRequest
     * @return SaveBatchDomainRemarkResponse
     */
    CompletableFuture<SaveBatchDomainRemarkResponse> saveBatchDomainRemark(SaveBatchDomainRemarkRequest request);

    /**
     * <b>description</b> :
     * <p>This is an asynchronous operation. To query the result of the task, call the <a href="~~QueryTaskDetailList~~">QueryTaskDetailList</a> operation.</p>
     * 
     * @param request the request parameters of SaveBatchTaskForApplyQuickTransferOutOpenly  SaveBatchTaskForApplyQuickTransferOutOpenlyRequest
     * @return SaveBatchTaskForApplyQuickTransferOutOpenlyResponse
     */
    CompletableFuture<SaveBatchTaskForApplyQuickTransferOutOpenlyResponse> saveBatchTaskForApplyQuickTransferOutOpenly(SaveBatchTaskForApplyQuickTransferOutOpenlyRequest request);

    /**
     * <b>description</b> :
     * <p>Starting from March 1, 2022, domain names can only be registered by using real-name verified domain name registrant profiles. Passing registrant information directly to register domain names is no longer supported.
     * To register a domain name, you must specify associated domain name to be registered, associated domain name registrant information, and the DNS servers. You must associate associated domain name registrant information by using the ID of a real-name verified domain name registrant profile. For DNS servers, you can use the default Alibaba Cloud DNS or specify custom DNS servers.</p>
     * <blockquote>
     * <ul>
     * <li>The total number of domain names registered per week cannot exceed 100,000.</li>
     * <li>Registration payments can only be made by using the account cash balance. Credit limits are not supported.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>The request parameter format for the <strong>SaveBatchTaskForCreatingOrderActivate</strong> operation is OrderActivateParam.N.*, where N represents the sequence number of associated domain name.
     * To query the task execution result, call the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of SaveBatchTaskForCreatingOrderActivate  SaveBatchTaskForCreatingOrderActivateRequest
     * @return SaveBatchTaskForCreatingOrderActivateResponse
     */
    CompletableFuture<SaveBatchTaskForCreatingOrderActivateResponse> saveBatchTaskForCreatingOrderActivate(SaveBatchTaskForCreatingOrderActivateRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">Query Task Detail List</a> API.</p>
     * 
     * @param request the request parameters of SaveBatchTaskForCreatingOrderRedeem  SaveBatchTaskForCreatingOrderRedeemRequest
     * @return SaveBatchTaskForCreatingOrderRedeemResponse
     */
    CompletableFuture<SaveBatchTaskForCreatingOrderRedeemResponse> saveBatchTaskForCreatingOrderRedeem(SaveBatchTaskForCreatingOrderRedeemRequest request);

    /**
     * <b>description</b> :
     * <p>To query the task result, call the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> operation.</p>
     * 
     * @param request the request parameters of SaveBatchTaskForCreatingOrderRenew  SaveBatchTaskForCreatingOrderRenewRequest
     * @return SaveBatchTaskForCreatingOrderRenewResponse
     */
    CompletableFuture<SaveBatchTaskForCreatingOrderRenewResponse> saveBatchTaskForCreatingOrderRenew(SaveBatchTaskForCreatingOrderRenewRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by invoking the QueryTaskDetailList API. For more information, see <a href="https://help.aliyun.com/document_detail/67710.htm?spm=a2c4g.11186623.0.0.5096389cgV6sng">QueryTaskDetailList</a>.</p>
     * 
     * @param request the request parameters of SaveBatchTaskForCreatingOrderTransfer  SaveBatchTaskForCreatingOrderTransferRequest
     * @return SaveBatchTaskForCreatingOrderTransferResponse
     */
    CompletableFuture<SaveBatchTaskForCreatingOrderTransferResponse> saveBatchTaskForCreatingOrderTransfer(SaveBatchTaskForCreatingOrderTransferRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the task execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> API.</p>
     * 
     * @param request the request parameters of SaveBatchTaskForDomainNameProxyService  SaveBatchTaskForDomainNameProxyServiceRequest
     * @return SaveBatchTaskForDomainNameProxyServiceResponse
     */
    CompletableFuture<SaveBatchTaskForDomainNameProxyServiceResponse> saveBatchTaskForDomainNameProxyService(SaveBatchTaskForDomainNameProxyServiceRequest request);

    /**
     * @param request the request parameters of SaveBatchTaskForGenerateDomainCertificate  SaveBatchTaskForGenerateDomainCertificateRequest
     * @return SaveBatchTaskForGenerateDomainCertificateResponse
     */
    CompletableFuture<SaveBatchTaskForGenerateDomainCertificateResponse> saveBatchTaskForGenerateDomainCertificate(SaveBatchTaskForGenerateDomainCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>To query the task result, call the <a href="~~QueryTaskDetailList~~">QueryTaskDetailList</a> API.</p>
     * 
     * @param request the request parameters of SaveBatchTaskForModifyingDomainDns  SaveBatchTaskForModifyingDomainDnsRequest
     * @return SaveBatchTaskForModifyingDomainDnsResponse
     */
    CompletableFuture<SaveBatchTaskForModifyingDomainDnsResponse> saveBatchTaskForModifyingDomainDns(SaveBatchTaskForModifyingDomainDnsRequest request);

    /**
     * <b>description</b> :
     * <p>To query task execution results, call the <a href="~~QueryTaskDetailList~~">QueryTaskDetailList</a> API.</p>
     * 
     * @param request the request parameters of SaveBatchTaskForReserveDropListDomain  SaveBatchTaskForReserveDropListDomainRequest
     * @return SaveBatchTaskForReserveDropListDomainResponse
     */
    CompletableFuture<SaveBatchTaskForReserveDropListDomainResponse> saveBatchTaskForReserveDropListDomain(SaveBatchTaskForReserveDropListDomainRequest request);

    /**
     * <b>description</b> :
     * <p>This is an asynchronous operation. After submitting the task, call <code>QueryTaskDetailList</code> to check its status.</p>
     * 
     * @param request the request parameters of SaveBatchTaskForTransferOutByAuthorizationCode  SaveBatchTaskForTransferOutByAuthorizationCodeRequest
     * @return SaveBatchTaskForTransferOutByAuthorizationCodeResponse
     */
    CompletableFuture<SaveBatchTaskForTransferOutByAuthorizationCodeResponse> saveBatchTaskForTransferOutByAuthorizationCode(SaveBatchTaskForTransferOutByAuthorizationCodeRequest request);

    /**
     * <b>description</b> :
     * <p>To check the result of the task, call the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> API.</p>
     * 
     * @param request the request parameters of SaveBatchTaskForTransferProhibitionLock  SaveBatchTaskForTransferProhibitionLockRequest
     * @return SaveBatchTaskForTransferProhibitionLockResponse
     */
    CompletableFuture<SaveBatchTaskForTransferProhibitionLockResponse> saveBatchTaskForTransferProhibitionLock(SaveBatchTaskForTransferProhibitionLockRequest request);

    /**
     * <b>description</b> :
     * <p>To check the status of the task, call the <a href="~~QueryTaskDetailList~~">QueryTaskDetailList</a> operation.</p>
     * 
     * @param request the request parameters of SaveBatchTaskForUpdateProhibitionLock  SaveBatchTaskForUpdateProhibitionLockRequest
     * @return SaveBatchTaskForUpdateProhibitionLockResponse
     */
    CompletableFuture<SaveBatchTaskForUpdateProhibitionLockResponse> saveBatchTaskForUpdateProhibitionLock(SaveBatchTaskForUpdateProhibitionLockRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">Query Task Detail List</a> API.</p>
     * 
     * @param request the request parameters of SaveBatchTaskForUpdatingContactInfoByNewContact  SaveBatchTaskForUpdatingContactInfoByNewContactRequest
     * @return SaveBatchTaskForUpdatingContactInfoByNewContactResponse
     */
    CompletableFuture<SaveBatchTaskForUpdatingContactInfoByNewContactResponse> saveBatchTaskForUpdatingContactInfoByNewContact(SaveBatchTaskForUpdatingContactInfoByNewContactRequest request);

    /**
     * <b>description</b> :
     * <p>To check the task result, call the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> operation.</p>
     * 
     * @param request the request parameters of SaveBatchTaskForUpdatingContactInfoByRegistrantProfileId  SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdRequest
     * @return SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse
     */
    CompletableFuture<SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse> saveBatchTaskForUpdatingContactInfoByRegistrantProfileId(SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdRequest request);

    /**
     * @param request the request parameters of SaveDomainGroup  SaveDomainGroupRequest
     * @return SaveDomainGroupResponse
     */
    CompletableFuture<SaveDomainGroupResponse> saveDomainGroup(SaveDomainGroupRequest request);

    /**
     * <b>description</b> :
     * <p>The domain name registrant profile contains registrant information. When you create or update a registrant profile, we recommend that you fill in all registrant information according to your actual situation and ensure consistency between the Chinese and English versions. To avoid faults during domain name registry review, we recommend entering all English registrant information in lowercase letters. For specific requirements, see the parameter descriptions below.</p>
     * 
     * @param request the request parameters of SaveRegistrantProfile  SaveRegistrantProfileRequest
     * @return SaveRegistrantProfileResponse
     */
    CompletableFuture<SaveRegistrantProfileResponse> saveRegistrantProfile(SaveRegistrantProfileRequest request);

    /**
     * @param request the request parameters of SaveRegistrantProfileRealNameVerification  SaveRegistrantProfileRealNameVerificationRequest
     * @return SaveRegistrantProfileRealNameVerificationResponse
     */
    CompletableFuture<SaveRegistrantProfileRealNameVerificationResponse> saveRegistrantProfileRealNameVerification(SaveRegistrantProfileRealNameVerificationRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by using the <a href="~~QueryTaskDetailList~~">QueryTaskDetailList</a> API.</p>
     * 
     * @param request the request parameters of SaveSingleTaskForAddingDSRecord  SaveSingleTaskForAddingDSRecordRequest
     * @return SaveSingleTaskForAddingDSRecordResponse
     */
    CompletableFuture<SaveSingleTaskForAddingDSRecordResponse> saveSingleTaskForAddingDSRecord(SaveSingleTaskForAddingDSRecordRequest request);

    /**
     * <b>description</b> :
     * <p>This is an asynchronous operation. To check the task\&quot;s status, call the <a href="~~QueryTaskDetailList~~">QueryTaskDetailList</a> API.</p>
     * 
     * @param request the request parameters of SaveSingleTaskForApplyQuickTransferOutOpenly  SaveSingleTaskForApplyQuickTransferOutOpenlyRequest
     * @return SaveSingleTaskForApplyQuickTransferOutOpenlyResponse
     */
    CompletableFuture<SaveSingleTaskForApplyQuickTransferOutOpenlyResponse> saveSingleTaskForApplyQuickTransferOutOpenly(SaveSingleTaskForApplyQuickTransferOutOpenlyRequest request);

    /**
     * @param request the request parameters of SaveSingleTaskForApprovingTransferOut  SaveSingleTaskForApprovingTransferOutRequest
     * @return SaveSingleTaskForApprovingTransferOutResponse
     */
    CompletableFuture<SaveSingleTaskForApprovingTransferOutResponse> saveSingleTaskForApprovingTransferOut(SaveSingleTaskForApprovingTransferOutRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the task execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> API.</p>
     * 
     * @param request the request parameters of SaveSingleTaskForAssociatingEns  SaveSingleTaskForAssociatingEnsRequest
     * @return SaveSingleTaskForAssociatingEnsResponse
     */
    CompletableFuture<SaveSingleTaskForAssociatingEnsResponse> saveSingleTaskForAssociatingEns(SaveSingleTaskForAssociatingEnsRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by invoking the QueryTaskDetailList API (<del>67710</del>).</p>
     * 
     * @param request the request parameters of SaveSingleTaskForCancelingTransferIn  SaveSingleTaskForCancelingTransferInRequest
     * @return SaveSingleTaskForCancelingTransferInResponse
     */
    CompletableFuture<SaveSingleTaskForCancelingTransferInResponse> saveSingleTaskForCancelingTransferIn(SaveSingleTaskForCancelingTransferInRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by invoking the QueryTaskDetailList API (<del>67710</del>).</p>
     * 
     * @param request the request parameters of SaveSingleTaskForCancelingTransferOut  SaveSingleTaskForCancelingTransferOutRequest
     * @return SaveSingleTaskForCancelingTransferOutResponse
     */
    CompletableFuture<SaveSingleTaskForCancelingTransferOutResponse> saveSingleTaskForCancelingTransferOut(SaveSingleTaskForCancelingTransferOutRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the task execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> API.</p>
     * 
     * @param request the request parameters of SaveSingleTaskForCreatingDnsHost  SaveSingleTaskForCreatingDnsHostRequest
     * @return SaveSingleTaskForCreatingDnsHostResponse
     */
    CompletableFuture<SaveSingleTaskForCreatingDnsHostResponse> saveSingleTaskForCreatingDnsHost(SaveSingleTaskForCreatingDnsHostRequest request);

    /**
     * <b>description</b> :
     * <p>Starting from March 1, 2022, you can associated domain names only by using real-name verified domain name registrant profiles. Passing registrant information directly to associated domain names is no longer supported.
     * To register a domain name, you must specify the domain name, registrant information, and DNS servers. You must associate the registrant information with a real-name verified domain name registrant profile by specifying the profile ID. You can use the default Alibaba Cloud DNS servers or specify custom DNS servers.
     * You can call the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> operation to query the task execution result.</p>
     * 
     * @param request the request parameters of SaveSingleTaskForCreatingOrderActivate  SaveSingleTaskForCreatingOrderActivateRequest
     * @return SaveSingleTaskForCreatingOrderActivateResponse
     */
    CompletableFuture<SaveSingleTaskForCreatingOrderActivateResponse> saveSingleTaskForCreatingOrderActivate(SaveSingleTaskForCreatingOrderActivateRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> API.</p>
     * 
     * @param request the request parameters of SaveSingleTaskForCreatingOrderRedeem  SaveSingleTaskForCreatingOrderRedeemRequest
     * @return SaveSingleTaskForCreatingOrderRedeemResponse
     */
    CompletableFuture<SaveSingleTaskForCreatingOrderRedeemResponse> saveSingleTaskForCreatingOrderRedeem(SaveSingleTaskForCreatingOrderRedeemRequest request);

    /**
     * <b>description</b> :
     * <p>To check the execution results of the task, call <a href="~~QueryTaskDetailList~~">QueryTaskDetailList</a>.</p>
     * 
     * @param request the request parameters of SaveSingleTaskForCreatingOrderRenew  SaveSingleTaskForCreatingOrderRenewRequest
     * @return SaveSingleTaskForCreatingOrderRenewResponse
     */
    CompletableFuture<SaveSingleTaskForCreatingOrderRenewResponse> saveSingleTaskForCreatingOrderRenew(SaveSingleTaskForCreatingOrderRenewRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the task execution result by calling the QueryTaskDetailList API (<del>67710</del>).</p>
     * 
     * @param request the request parameters of SaveSingleTaskForCreatingOrderTransfer  SaveSingleTaskForCreatingOrderTransferRequest
     * @return SaveSingleTaskForCreatingOrderTransferResponse
     */
    CompletableFuture<SaveSingleTaskForCreatingOrderTransferResponse> saveSingleTaskForCreatingOrderTransfer(SaveSingleTaskForCreatingOrderTransferRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the task execution result by using the <a href="~~QueryTaskDetailList~~">QueryTaskDetailList</a> API.</p>
     * 
     * @param request the request parameters of SaveSingleTaskForDeletingDSRecord  SaveSingleTaskForDeletingDSRecordRequest
     * @return SaveSingleTaskForDeletingDSRecordResponse
     */
    CompletableFuture<SaveSingleTaskForDeletingDSRecordResponse> saveSingleTaskForDeletingDSRecord(SaveSingleTaskForDeletingDSRecordRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by using the <a href="~~QueryTaskDetailList~~">QueryTaskDetailList</a> API.</p>
     * 
     * @param request the request parameters of SaveSingleTaskForDeletingDnsHost  SaveSingleTaskForDeletingDnsHostRequest
     * @return SaveSingleTaskForDeletingDnsHostResponse
     */
    CompletableFuture<SaveSingleTaskForDeletingDnsHostResponse> saveSingleTaskForDeletingDnsHost(SaveSingleTaskForDeletingDnsHostRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> API.</p>
     * 
     * @param request the request parameters of SaveSingleTaskForDisassociatingEns  SaveSingleTaskForDisassociatingEnsRequest
     * @return SaveSingleTaskForDisassociatingEnsResponse
     */
    CompletableFuture<SaveSingleTaskForDisassociatingEnsResponse> saveSingleTaskForDisassociatingEns(SaveSingleTaskForDisassociatingEnsRequest request);

    /**
     * <b>description</b> :
     * <p>Invoke the SaveSingleTaskForDomainNameProxyService API to submit a domain name proxy service job.</p>
     * 
     * @param request the request parameters of SaveSingleTaskForDomainNameProxyService  SaveSingleTaskForDomainNameProxyServiceRequest
     * @return SaveSingleTaskForDomainNameProxyServiceResponse
     */
    CompletableFuture<SaveSingleTaskForDomainNameProxyServiceResponse> saveSingleTaskForDomainNameProxyService(SaveSingleTaskForDomainNameProxyServiceRequest request);

    /**
     * @param request the request parameters of SaveSingleTaskForGenerateDomainCertificate  SaveSingleTaskForGenerateDomainCertificateRequest
     * @return SaveSingleTaskForGenerateDomainCertificateResponse
     */
    CompletableFuture<SaveSingleTaskForGenerateDomainCertificateResponse> saveSingleTaskForGenerateDomainCertificate(SaveSingleTaskForGenerateDomainCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the task execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> API.</p>
     * 
     * @param request the request parameters of SaveSingleTaskForModifyingDSRecord  SaveSingleTaskForModifyingDSRecordRequest
     * @return SaveSingleTaskForModifyingDSRecordResponse
     */
    CompletableFuture<SaveSingleTaskForModifyingDSRecordResponse> saveSingleTaskForModifyingDSRecord(SaveSingleTaskForModifyingDSRecordRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> API.</p>
     * 
     * @param request the request parameters of SaveSingleTaskForModifyingDnsHost  SaveSingleTaskForModifyingDnsHostRequest
     * @return SaveSingleTaskForModifyingDnsHostResponse
     */
    CompletableFuture<SaveSingleTaskForModifyingDnsHostResponse> saveSingleTaskForModifyingDnsHost(SaveSingleTaskForModifyingDnsHostRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by calling the QueryTaskDetailList API (<del>67710</del>). The transfer password is returned in the TaskResult field of the corresponding job.</p>
     * 
     * @param request the request parameters of SaveSingleTaskForQueryingTransferAuthorizationCode  SaveSingleTaskForQueryingTransferAuthorizationCodeRequest
     * @return SaveSingleTaskForQueryingTransferAuthorizationCodeResponse
     */
    CompletableFuture<SaveSingleTaskForQueryingTransferAuthorizationCodeResponse> saveSingleTaskForQueryingTransferAuthorizationCode(SaveSingleTaskForQueryingTransferAuthorizationCodeRequest request);

    /**
     * @param request the request parameters of SaveSingleTaskForReserveDropListDomain  SaveSingleTaskForReserveDropListDomainRequest
     * @return SaveSingleTaskForReserveDropListDomainResponse
     */
    CompletableFuture<SaveSingleTaskForReserveDropListDomainResponse> saveSingleTaskForReserveDropListDomain(SaveSingleTaskForReserveDropListDomainRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> API.</p>
     * 
     * @param request the request parameters of SaveSingleTaskForSaveArtExtension  SaveSingleTaskForSaveArtExtensionRequest
     * @return SaveSingleTaskForSaveArtExtensionResponse
     */
    CompletableFuture<SaveSingleTaskForSaveArtExtensionResponse> saveSingleTaskForSaveArtExtension(SaveSingleTaskForSaveArtExtensionRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> API.</p>
     * 
     * @param request the request parameters of SaveSingleTaskForSynchronizingDSRecord  SaveSingleTaskForSynchronizingDSRecordRequest
     * @return SaveSingleTaskForSynchronizingDSRecordResponse
     */
    CompletableFuture<SaveSingleTaskForSynchronizingDSRecordResponse> saveSingleTaskForSynchronizingDSRecord(SaveSingleTaskForSynchronizingDSRecordRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">Query Task Detail List</a> API.</p>
     * 
     * @param request the request parameters of SaveSingleTaskForSynchronizingDnsHost  SaveSingleTaskForSynchronizingDnsHostRequest
     * @return SaveSingleTaskForSynchronizingDnsHostResponse
     */
    CompletableFuture<SaveSingleTaskForSynchronizingDnsHostResponse> saveSingleTaskForSynchronizingDnsHost(SaveSingleTaskForSynchronizingDnsHostRequest request);

    /**
     * <b>description</b> :
     * <p>The task ID.</p>
     * 
     * @param request the request parameters of SaveSingleTaskForTransferOutByAuthorizationCode  SaveSingleTaskForTransferOutByAuthorizationCodeRequest
     * @return SaveSingleTaskForTransferOutByAuthorizationCodeResponse
     */
    CompletableFuture<SaveSingleTaskForTransferOutByAuthorizationCodeResponse> saveSingleTaskForTransferOutByAuthorizationCode(SaveSingleTaskForTransferOutByAuthorizationCodeRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the task execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">List Task Details</a> API.</p>
     * 
     * @param request the request parameters of SaveSingleTaskForTransferProhibitionLock  SaveSingleTaskForTransferProhibitionLockRequest
     * @return SaveSingleTaskForTransferProhibitionLockResponse
     */
    CompletableFuture<SaveSingleTaskForTransferProhibitionLockResponse> saveSingleTaskForTransferProhibitionLock(SaveSingleTaskForTransferProhibitionLockRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by using the <a href="~~QueryTaskDetailList~~">QueryTaskDetailList</a> API.</p>
     * 
     * @param request the request parameters of SaveSingleTaskForUpdateProhibitionLock  SaveSingleTaskForUpdateProhibitionLockRequest
     * @return SaveSingleTaskForUpdateProhibitionLockResponse
     */
    CompletableFuture<SaveSingleTaskForUpdateProhibitionLockResponse> saveSingleTaskForUpdateProhibitionLock(SaveSingleTaskForUpdateProhibitionLockRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> API.</p>
     * 
     * @param request the request parameters of SaveSingleTaskForUpdatingContactInfo  SaveSingleTaskForUpdatingContactInfoRequest
     * @return SaveSingleTaskForUpdatingContactInfoResponse
     */
    CompletableFuture<SaveSingleTaskForUpdatingContactInfoResponse> saveSingleTaskForUpdatingContactInfo(SaveSingleTaskForUpdatingContactInfoRequest request);

    /**
     * <b>description</b> :
     * <p>Invoke SaveTaskForSubmittingDomainDelete to submit a domain deletion job.</p>
     * 
     * @param request the request parameters of SaveTaskForSubmittingDomainDelete  SaveTaskForSubmittingDomainDeleteRequest
     * @return SaveTaskForSubmittingDomainDeleteResponse
     */
    CompletableFuture<SaveTaskForSubmittingDomainDeleteResponse> saveTaskForSubmittingDomainDelete(SaveTaskForSubmittingDomainDeleteRequest request);

    /**
     * @param request the request parameters of SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredential  SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest
     * @return SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponse
     */
    CompletableFuture<SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponse> saveTaskForSubmittingDomainRealNameVerificationByIdentityCredential(SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest request);

    /**
     * @param request the request parameters of SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileID  SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDRequest
     * @return SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponse
     */
    CompletableFuture<SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponse> saveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileID(SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDRequest request);

    /**
     * <b>description</b> :
     * <p>Query the task execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> API.</p>
     * 
     * @param request the request parameters of SaveTaskForUpdatingRegistrantInfoByIdentityCredential  SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest
     * @return SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponse
     */
    CompletableFuture<SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponse> saveTaskForUpdatingRegistrantInfoByIdentityCredential(SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest request);

    /**
     * <b>description</b> :
     * <p>Call the <a href="https://help.aliyun.com/document_detail/67710.htm?spm=a2c4g.11186623.0.0.33f47edeV0nkFx">QueryTaskDetailList</a> API to check the task result. After a successful update, the registrant information for the domain name is updated to match the registrant profile. If the domain name requires real-name verification, it becomes verified.</p>
     * 
     * @param request the request parameters of SaveTaskForUpdatingRegistrantInfoByRegistrantProfileID  SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDRequest
     * @return SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse
     */
    CompletableFuture<SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse> saveTaskForUpdatingRegistrantInfoByRegistrantProfileID(SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDRequest request);

    /**
     * <b>description</b> :
     * <p>If you have a large number of domain names, a slow response may occur when you call an API operation to query domain names. In this case, you can call this operation to query domain names more quickly. When you call this operation for the first time, specify the request parameters except ScrollId. A scroll ID is returned without other data. In the second request, use the scroll ID obtained from the previous response. In subsequent requests, the newly specified request parameters do not take effect, and the request parameters that are specified in the first request prevail.</p>
     * 
     * @param request the request parameters of ScrollDomainList  ScrollDomainListRequest
     * @return ScrollDomainListResponse
     */
    CompletableFuture<ScrollDomainListResponse> scrollDomainList(ScrollDomainListRequest request);

    /**
     * @param request the request parameters of SetDefaultRegistrantProfile  SetDefaultRegistrantProfileRequest
     * @return SetDefaultRegistrantProfileResponse
     */
    CompletableFuture<SetDefaultRegistrantProfileResponse> setDefaultRegistrantProfile(SetDefaultRegistrantProfileRequest request);

    /**
     * <b>description</b> :
     * <p>This operation currently supports only domain names registered on the China site (aliyun.com).
     * <strong>Before using this operation, make sure that you fully understand the billing method and <a href="https://wanwang.aliyun.com/help/price.html?spm=5176.22941859.J_9989412330.10.68a51838KnzTeD">pricing</a> of domain name services.</strong></p>
     * 
     * @param request the request parameters of SetupDomainAutoRenew  SetupDomainAutoRenewRequest
     * @return SetupDomainAutoRenewResponse
     */
    CompletableFuture<SetupDomainAutoRenewResponse> setupDomainAutoRenew(SetupDomainAutoRenewRequest request);

    /**
     * @param request the request parameters of SubmitDomainSpecialBizCredentials  SubmitDomainSpecialBizCredentialsRequest
     * @return SubmitDomainSpecialBizCredentialsResponse
     */
    CompletableFuture<SubmitDomainSpecialBizCredentialsResponse> submitDomainSpecialBizCredentials(SubmitDomainSpecialBizCredentialsRequest request);

    /**
     * <b>description</b> :
     * <p>After receiving the verification email, you must log on to your mailbox and complete verification within 3 days. If the verification email has expired, you can invoke the <a href="https://help.aliyun.com/document_detail/67734.html">ResendEmailVerification</a> API to resend the verification email.</p>
     * 
     * @param request the request parameters of SubmitEmailVerification  SubmitEmailVerificationRequest
     * @return SubmitEmailVerificationResponse
     */
    CompletableFuture<SubmitEmailVerificationResponse> submitEmailVerification(SubmitEmailVerificationRequest request);

    /**
     * @param request the request parameters of SubmitOperationAuditInfo  SubmitOperationAuditInfoRequest
     * @return SubmitOperationAuditInfoResponse
     */
    CompletableFuture<SubmitOperationAuditInfoResponse> submitOperationAuditInfo(SubmitOperationAuditInfoRequest request);

    /**
     * @param request the request parameters of SubmitOperationCredentials  SubmitOperationCredentialsRequest
     * @return SubmitOperationCredentialsResponse
     */
    CompletableFuture<SubmitOperationCredentialsResponse> submitOperationCredentials(SubmitOperationCredentialsRequest request);

    /**
     * @param request the request parameters of TransferInCheckMailToken  TransferInCheckMailTokenRequest
     * @return TransferInCheckMailTokenResponse
     */
    CompletableFuture<TransferInCheckMailTokenResponse> transferInCheckMailToken(TransferInCheckMailTokenRequest request);

    /**
     * @param request the request parameters of TransferInReenterTransferAuthorizationCode  TransferInReenterTransferAuthorizationCodeRequest
     * @return TransferInReenterTransferAuthorizationCodeResponse
     */
    CompletableFuture<TransferInReenterTransferAuthorizationCodeResponse> transferInReenterTransferAuthorizationCode(TransferInReenterTransferAuthorizationCodeRequest request);

    /**
     * <b>description</b> :
     * <p>The system automatically retrieves the registrant\&quot;s email address from WHOIS. If the email address is incorrect or cannot be retrieved, the system will re-scrape the WHOIS email address.</p>
     * 
     * @param request the request parameters of TransferInRefetchWhoisEmail  TransferInRefetchWhoisEmailRequest
     * @return TransferInRefetchWhoisEmailResponse
     */
    CompletableFuture<TransferInRefetchWhoisEmailResponse> transferInRefetchWhoisEmail(TransferInRefetchWhoisEmailRequest request);

    /**
     * @param request the request parameters of TransferInResendMailToken  TransferInResendMailTokenRequest
     * @return TransferInResendMailTokenResponse
     */
    CompletableFuture<TransferInResendMailTokenResponse> transferInResendMailToken(TransferInResendMailTokenRequest request);

    /**
     * @param request the request parameters of UpdateDomainToDomainGroup  UpdateDomainToDomainGroupRequest
     * @return UpdateDomainToDomainGroupResponse
     */
    CompletableFuture<UpdateDomainToDomainGroupResponse> updateDomainToDomainGroup(UpdateDomainToDomainGroupRequest request);

    /**
     * @param request the request parameters of VerifyContactField  VerifyContactFieldRequest
     * @return VerifyContactFieldResponse
     */
    CompletableFuture<VerifyContactFieldResponse> verifyContactField(VerifyContactFieldRequest request);

    /**
     * @param request the request parameters of VerifyEmail  VerifyEmailRequest
     * @return VerifyEmailResponse
     */
    CompletableFuture<VerifyEmailResponse> verifyEmail(VerifyEmailRequest request);

}
