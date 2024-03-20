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

    CompletableFuture<AcknowledgeTaskResultResponse> acknowledgeTaskResult(AcknowledgeTaskResultRequest request);

    CompletableFuture<BatchFuzzyMatchDomainSensitiveWordResponse> batchFuzzyMatchDomainSensitiveWord(BatchFuzzyMatchDomainSensitiveWordRequest request);

    CompletableFuture<CancelDomainVerificationResponse> cancelDomainVerification(CancelDomainVerificationRequest request);

    CompletableFuture<CancelOperationAuditResponse> cancelOperationAudit(CancelOperationAuditRequest request);

    CompletableFuture<CancelQualificationVerificationResponse> cancelQualificationVerification(CancelQualificationVerificationRequest request);

    CompletableFuture<CancelTaskResponse> cancelTask(CancelTaskRequest request);

    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    CompletableFuture<CheckDomainResponse> checkDomain(CheckDomainRequest request);

    CompletableFuture<CheckDomainSunriseClaimResponse> checkDomainSunriseClaim(CheckDomainSunriseClaimRequest request);

    CompletableFuture<CheckMaxYearOfServerLockResponse> checkMaxYearOfServerLock(CheckMaxYearOfServerLockRequest request);

    CompletableFuture<CheckProcessingServerLockApplyResponse> checkProcessingServerLockApply(CheckProcessingServerLockApplyRequest request);

    CompletableFuture<CheckTransferInFeasibilityResponse> checkTransferInFeasibility(CheckTransferInFeasibilityRequest request);

    CompletableFuture<ConfirmTransferInEmailResponse> confirmTransferInEmail(ConfirmTransferInEmailRequest request);

    CompletableFuture<DeleteContactTemplatesResponse> deleteContactTemplates(DeleteContactTemplatesRequest request);

    CompletableFuture<DeleteDomainGroupResponse> deleteDomainGroup(DeleteDomainGroupRequest request);

    CompletableFuture<DeleteEmailVerificationResponse> deleteEmailVerification(DeleteEmailVerificationRequest request);

    CompletableFuture<DeleteRegistrantProfileResponse> deleteRegistrantProfile(DeleteRegistrantProfileRequest request);

    CompletableFuture<DomainSpecialBizCancelResponse> domainSpecialBizCancel(DomainSpecialBizCancelRequest request);

    CompletableFuture<EmailVerifiedResponse> emailVerified(EmailVerifiedRequest request);

    CompletableFuture<FuzzyMatchDomainSensitiveWordResponse> fuzzyMatchDomainSensitiveWord(FuzzyMatchDomainSensitiveWordRequest request);

    CompletableFuture<GetOperationOssUploadPolicyResponse> getOperationOssUploadPolicy(GetOperationOssUploadPolicyRequest request);

    CompletableFuture<GetQualificationUploadPolicyResponse> getQualificationUploadPolicy(GetQualificationUploadPolicyRequest request);

    CompletableFuture<ListEmailVerificationResponse> listEmailVerification(ListEmailVerificationRequest request);

    CompletableFuture<ListServerLockResponse> listServerLock(ListServerLockRequest request);

    CompletableFuture<LookupTmchNoticeResponse> lookupTmchNotice(LookupTmchNoticeRequest request);

    CompletableFuture<PollTaskResultResponse> pollTaskResult(PollTaskResultRequest request);

    CompletableFuture<QueryAdvancedDomainListResponse> queryAdvancedDomainList(QueryAdvancedDomainListRequest request);

    CompletableFuture<QueryArtExtensionResponse> queryArtExtension(QueryArtExtensionRequest request);

    CompletableFuture<QueryChangeLogListResponse> queryChangeLogList(QueryChangeLogListRequest request);

    CompletableFuture<QueryContactInfoResponse> queryContactInfo(QueryContactInfoRequest request);

    CompletableFuture<QueryDSRecordResponse> queryDSRecord(QueryDSRecordRequest request);

    CompletableFuture<QueryDnsHostResponse> queryDnsHost(QueryDnsHostRequest request);

    CompletableFuture<QueryDomainAdminDivisionResponse> queryDomainAdminDivision(QueryDomainAdminDivisionRequest request);

    CompletableFuture<QueryDomainByDomainNameResponse> queryDomainByDomainName(QueryDomainByDomainNameRequest request);

    CompletableFuture<QueryDomainByInstanceIdResponse> queryDomainByInstanceId(QueryDomainByInstanceIdRequest request);

    CompletableFuture<QueryDomainGroupListResponse> queryDomainGroupList(QueryDomainGroupListRequest request);

    CompletableFuture<QueryDomainListResponse> queryDomainList(QueryDomainListRequest request);

    CompletableFuture<QueryDomainRealNameVerificationInfoResponse> queryDomainRealNameVerificationInfo(QueryDomainRealNameVerificationInfoRequest request);

    CompletableFuture<QueryDomainSpecialBizDetailResponse> queryDomainSpecialBizDetail(QueryDomainSpecialBizDetailRequest request);

    CompletableFuture<QueryDomainSpecialBizInfoByDomainResponse> queryDomainSpecialBizInfoByDomain(QueryDomainSpecialBizInfoByDomainRequest request);

    CompletableFuture<QueryDomainSuffixResponse> queryDomainSuffix(QueryDomainSuffixRequest request);

    CompletableFuture<QueryEmailVerificationResponse> queryEmailVerification(QueryEmailVerificationRequest request);

    CompletableFuture<QueryEnsAssociationResponse> queryEnsAssociation(QueryEnsAssociationRequest request);

    CompletableFuture<QueryFailReasonForDomainRealNameVerificationResponse> queryFailReasonForDomainRealNameVerification(QueryFailReasonForDomainRealNameVerificationRequest request);

    CompletableFuture<QueryFailReasonForRegistrantProfileRealNameVerificationResponse> queryFailReasonForRegistrantProfileRealNameVerification(QueryFailReasonForRegistrantProfileRealNameVerificationRequest request);

    CompletableFuture<QueryFailingReasonListForQualificationResponse> queryFailingReasonListForQualification(QueryFailingReasonListForQualificationRequest request);

    CompletableFuture<QueryLocalEnsAssociationResponse> queryLocalEnsAssociation(QueryLocalEnsAssociationRequest request);

    CompletableFuture<QueryOperationAuditInfoDetailResponse> queryOperationAuditInfoDetail(QueryOperationAuditInfoDetailRequest request);

    CompletableFuture<QueryOperationAuditInfoListResponse> queryOperationAuditInfoList(QueryOperationAuditInfoListRequest request);

    CompletableFuture<QueryQualificationDetailResponse> queryQualificationDetail(QueryQualificationDetailRequest request);

    CompletableFuture<QueryRegistrantProfileRealNameVerificationInfoResponse> queryRegistrantProfileRealNameVerificationInfo(QueryRegistrantProfileRealNameVerificationInfoRequest request);

    CompletableFuture<QueryRegistrantProfilesResponse> queryRegistrantProfiles(QueryRegistrantProfilesRequest request);

    CompletableFuture<QueryServerLockResponse> queryServerLock(QueryServerLockRequest request);

    CompletableFuture<QueryTaskDetailHistoryResponse> queryTaskDetailHistory(QueryTaskDetailHistoryRequest request);

    CompletableFuture<QueryTaskDetailListResponse> queryTaskDetailList(QueryTaskDetailListRequest request);

    CompletableFuture<QueryTaskInfoHistoryResponse> queryTaskInfoHistory(QueryTaskInfoHistoryRequest request);

    CompletableFuture<QueryTaskListResponse> queryTaskList(QueryTaskListRequest request);

    CompletableFuture<QueryTransferInByInstanceIdResponse> queryTransferInByInstanceId(QueryTransferInByInstanceIdRequest request);

    CompletableFuture<QueryTransferInListResponse> queryTransferInList(QueryTransferInListRequest request);

    CompletableFuture<QueryTransferOutInfoResponse> queryTransferOutInfo(QueryTransferOutInfoRequest request);

    CompletableFuture<RegistrantProfileRealNameVerificationResponse> registrantProfileRealNameVerification(RegistrantProfileRealNameVerificationRequest request);

    CompletableFuture<ResendEmailVerificationResponse> resendEmailVerification(ResendEmailVerificationRequest request);

    CompletableFuture<ResetQualificationVerificationResponse> resetQualificationVerification(ResetQualificationVerificationRequest request);

    CompletableFuture<SaveBatchDomainRemarkResponse> saveBatchDomainRemark(SaveBatchDomainRemarkRequest request);

    CompletableFuture<SaveBatchTaskForApplyQuickTransferOutOpenlyResponse> saveBatchTaskForApplyQuickTransferOutOpenly(SaveBatchTaskForApplyQuickTransferOutOpenlyRequest request);

    CompletableFuture<SaveBatchTaskForCreatingOrderActivateResponse> saveBatchTaskForCreatingOrderActivate(SaveBatchTaskForCreatingOrderActivateRequest request);

    CompletableFuture<SaveBatchTaskForCreatingOrderRedeemResponse> saveBatchTaskForCreatingOrderRedeem(SaveBatchTaskForCreatingOrderRedeemRequest request);

    CompletableFuture<SaveBatchTaskForCreatingOrderRenewResponse> saveBatchTaskForCreatingOrderRenew(SaveBatchTaskForCreatingOrderRenewRequest request);

    CompletableFuture<SaveBatchTaskForCreatingOrderTransferResponse> saveBatchTaskForCreatingOrderTransfer(SaveBatchTaskForCreatingOrderTransferRequest request);

    CompletableFuture<SaveBatchTaskForDomainNameProxyServiceResponse> saveBatchTaskForDomainNameProxyService(SaveBatchTaskForDomainNameProxyServiceRequest request);

    CompletableFuture<SaveBatchTaskForGenerateDomainCertificateResponse> saveBatchTaskForGenerateDomainCertificate(SaveBatchTaskForGenerateDomainCertificateRequest request);

    CompletableFuture<SaveBatchTaskForModifyingDomainDnsResponse> saveBatchTaskForModifyingDomainDns(SaveBatchTaskForModifyingDomainDnsRequest request);

    CompletableFuture<SaveBatchTaskForReserveDropListDomainResponse> saveBatchTaskForReserveDropListDomain(SaveBatchTaskForReserveDropListDomainRequest request);

    CompletableFuture<SaveBatchTaskForTransferProhibitionLockResponse> saveBatchTaskForTransferProhibitionLock(SaveBatchTaskForTransferProhibitionLockRequest request);

    CompletableFuture<SaveBatchTaskForUpdateProhibitionLockResponse> saveBatchTaskForUpdateProhibitionLock(SaveBatchTaskForUpdateProhibitionLockRequest request);

    CompletableFuture<SaveBatchTaskForUpdatingContactInfoByNewContactResponse> saveBatchTaskForUpdatingContactInfoByNewContact(SaveBatchTaskForUpdatingContactInfoByNewContactRequest request);

    CompletableFuture<SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse> saveBatchTaskForUpdatingContactInfoByRegistrantProfileId(SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdRequest request);

    CompletableFuture<SaveDomainGroupResponse> saveDomainGroup(SaveDomainGroupRequest request);

    CompletableFuture<SaveRegistrantProfileResponse> saveRegistrantProfile(SaveRegistrantProfileRequest request);

    CompletableFuture<SaveRegistrantProfileRealNameVerificationResponse> saveRegistrantProfileRealNameVerification(SaveRegistrantProfileRealNameVerificationRequest request);

    CompletableFuture<SaveSingleTaskForAddingDSRecordResponse> saveSingleTaskForAddingDSRecord(SaveSingleTaskForAddingDSRecordRequest request);

    CompletableFuture<SaveSingleTaskForApplyQuickTransferOutOpenlyResponse> saveSingleTaskForApplyQuickTransferOutOpenly(SaveSingleTaskForApplyQuickTransferOutOpenlyRequest request);

    CompletableFuture<SaveSingleTaskForApprovingTransferOutResponse> saveSingleTaskForApprovingTransferOut(SaveSingleTaskForApprovingTransferOutRequest request);

    CompletableFuture<SaveSingleTaskForAssociatingEnsResponse> saveSingleTaskForAssociatingEns(SaveSingleTaskForAssociatingEnsRequest request);

    CompletableFuture<SaveSingleTaskForCancelingTransferInResponse> saveSingleTaskForCancelingTransferIn(SaveSingleTaskForCancelingTransferInRequest request);

    CompletableFuture<SaveSingleTaskForCancelingTransferOutResponse> saveSingleTaskForCancelingTransferOut(SaveSingleTaskForCancelingTransferOutRequest request);

    CompletableFuture<SaveSingleTaskForCreatingDnsHostResponse> saveSingleTaskForCreatingDnsHost(SaveSingleTaskForCreatingDnsHostRequest request);

    CompletableFuture<SaveSingleTaskForCreatingOrderActivateResponse> saveSingleTaskForCreatingOrderActivate(SaveSingleTaskForCreatingOrderActivateRequest request);

    CompletableFuture<SaveSingleTaskForCreatingOrderRedeemResponse> saveSingleTaskForCreatingOrderRedeem(SaveSingleTaskForCreatingOrderRedeemRequest request);

    CompletableFuture<SaveSingleTaskForCreatingOrderRenewResponse> saveSingleTaskForCreatingOrderRenew(SaveSingleTaskForCreatingOrderRenewRequest request);

    CompletableFuture<SaveSingleTaskForCreatingOrderTransferResponse> saveSingleTaskForCreatingOrderTransfer(SaveSingleTaskForCreatingOrderTransferRequest request);

    CompletableFuture<SaveSingleTaskForDeletingDSRecordResponse> saveSingleTaskForDeletingDSRecord(SaveSingleTaskForDeletingDSRecordRequest request);

    CompletableFuture<SaveSingleTaskForDeletingDnsHostResponse> saveSingleTaskForDeletingDnsHost(SaveSingleTaskForDeletingDnsHostRequest request);

    CompletableFuture<SaveSingleTaskForDisassociatingEnsResponse> saveSingleTaskForDisassociatingEns(SaveSingleTaskForDisassociatingEnsRequest request);

    CompletableFuture<SaveSingleTaskForDomainNameProxyServiceResponse> saveSingleTaskForDomainNameProxyService(SaveSingleTaskForDomainNameProxyServiceRequest request);

    CompletableFuture<SaveSingleTaskForGenerateDomainCertificateResponse> saveSingleTaskForGenerateDomainCertificate(SaveSingleTaskForGenerateDomainCertificateRequest request);

    CompletableFuture<SaveSingleTaskForModifyingDSRecordResponse> saveSingleTaskForModifyingDSRecord(SaveSingleTaskForModifyingDSRecordRequest request);

    CompletableFuture<SaveSingleTaskForModifyingDnsHostResponse> saveSingleTaskForModifyingDnsHost(SaveSingleTaskForModifyingDnsHostRequest request);

    CompletableFuture<SaveSingleTaskForQueryingTransferAuthorizationCodeResponse> saveSingleTaskForQueryingTransferAuthorizationCode(SaveSingleTaskForQueryingTransferAuthorizationCodeRequest request);

    CompletableFuture<SaveSingleTaskForSaveArtExtensionResponse> saveSingleTaskForSaveArtExtension(SaveSingleTaskForSaveArtExtensionRequest request);

    CompletableFuture<SaveSingleTaskForSynchronizingDSRecordResponse> saveSingleTaskForSynchronizingDSRecord(SaveSingleTaskForSynchronizingDSRecordRequest request);

    CompletableFuture<SaveSingleTaskForSynchronizingDnsHostResponse> saveSingleTaskForSynchronizingDnsHost(SaveSingleTaskForSynchronizingDnsHostRequest request);

    CompletableFuture<SaveSingleTaskForTransferProhibitionLockResponse> saveSingleTaskForTransferProhibitionLock(SaveSingleTaskForTransferProhibitionLockRequest request);

    CompletableFuture<SaveSingleTaskForUpdateProhibitionLockResponse> saveSingleTaskForUpdateProhibitionLock(SaveSingleTaskForUpdateProhibitionLockRequest request);

    CompletableFuture<SaveSingleTaskForUpdatingContactInfoResponse> saveSingleTaskForUpdatingContactInfo(SaveSingleTaskForUpdatingContactInfoRequest request);

    CompletableFuture<SaveTaskForSubmittingDomainDeleteResponse> saveTaskForSubmittingDomainDelete(SaveTaskForSubmittingDomainDeleteRequest request);

    CompletableFuture<SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponse> saveTaskForSubmittingDomainRealNameVerificationByIdentityCredential(SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest request);

    CompletableFuture<SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponse> saveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileID(SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDRequest request);

    CompletableFuture<SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponse> saveTaskForUpdatingRegistrantInfoByIdentityCredential(SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest request);

    CompletableFuture<SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse> saveTaskForUpdatingRegistrantInfoByRegistrantProfileID(SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDRequest request);

    /**
      * If you have a large number of domain names, a slow response may occur when you call an API operation to query domain names. In this case, you can call this operation to query domain names more quickly. When you call this operation for the first time, specify the request parameters except ScrollId. A scroll ID is returned without other data. In the second request, use the scroll ID obtained from the previous response. In subsequent requests, the newly specified request parameters do not take effect, and the request parameters that are specified in the first request prevail.
      *
     */
    CompletableFuture<ScrollDomainListResponse> scrollDomainList(ScrollDomainListRequest request);

    CompletableFuture<SetDefaultRegistrantProfileResponse> setDefaultRegistrantProfile(SetDefaultRegistrantProfileRequest request);

    CompletableFuture<SetupDomainAutoRenewResponse> setupDomainAutoRenew(SetupDomainAutoRenewRequest request);

    CompletableFuture<SubmitDomainSpecialBizCredentialsResponse> submitDomainSpecialBizCredentials(SubmitDomainSpecialBizCredentialsRequest request);

    CompletableFuture<SubmitEmailVerificationResponse> submitEmailVerification(SubmitEmailVerificationRequest request);

    CompletableFuture<SubmitOperationAuditInfoResponse> submitOperationAuditInfo(SubmitOperationAuditInfoRequest request);

    CompletableFuture<SubmitOperationCredentialsResponse> submitOperationCredentials(SubmitOperationCredentialsRequest request);

    CompletableFuture<TransferInCheckMailTokenResponse> transferInCheckMailToken(TransferInCheckMailTokenRequest request);

    CompletableFuture<TransferInReenterTransferAuthorizationCodeResponse> transferInReenterTransferAuthorizationCode(TransferInReenterTransferAuthorizationCodeRequest request);

    CompletableFuture<TransferInRefetchWhoisEmailResponse> transferInRefetchWhoisEmail(TransferInRefetchWhoisEmailRequest request);

    CompletableFuture<TransferInResendMailTokenResponse> transferInResendMailToken(TransferInResendMailTokenRequest request);

    CompletableFuture<UpdateDomainToDomainGroupResponse> updateDomainToDomainGroup(UpdateDomainToDomainGroupRequest request);

    CompletableFuture<VerifyContactFieldResponse> verifyContactField(VerifyContactFieldRequest request);

    CompletableFuture<VerifyEmailResponse> verifyEmail(VerifyEmailRequest request);

}
