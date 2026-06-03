// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain_intl20171218;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.domain_intl20171218.models.*;
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
     * @param request the request parameters of CancelTask  CancelTaskRequest
     * @return CancelTaskResponse
     */
    CompletableFuture<CancelTaskResponse> cancelTask(CancelTaskRequest request);

    /**
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
     * @param request the request parameters of CheckTransferInFeasibility  CheckTransferInFeasibilityRequest
     * @return CheckTransferInFeasibilityResponse
     */
    CompletableFuture<CheckTransferInFeasibilityResponse> checkTransferInFeasibility(CheckTransferInFeasibilityRequest request);

    /**
     * @param request the request parameters of ConfirmTransferInEmail  ConfirmTransferInEmailRequest
     * @return ConfirmTransferInEmailResponse
     */
    CompletableFuture<ConfirmTransferInEmailResponse> confirmTransferInEmail(ConfirmTransferInEmailRequest request);

    /**
     * @param request the request parameters of DeleteEmailVerification  DeleteEmailVerificationRequest
     * @return DeleteEmailVerificationResponse
     */
    CompletableFuture<DeleteEmailVerificationResponse> deleteEmailVerification(DeleteEmailVerificationRequest request);

    /**
     * @param request the request parameters of DeleteRegistrantProfile  DeleteRegistrantProfileRequest
     * @return DeleteRegistrantProfileResponse
     */
    CompletableFuture<DeleteRegistrantProfileResponse> deleteRegistrantProfile(DeleteRegistrantProfileRequest request);

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
     * @param request the request parameters of ListEmailVerification  ListEmailVerificationRequest
     * @return ListEmailVerificationResponse
     */
    CompletableFuture<ListEmailVerificationResponse> listEmailVerification(ListEmailVerificationRequest request);

    /**
     * @param request the request parameters of LookupTmchNotice  LookupTmchNoticeRequest
     * @return LookupTmchNoticeResponse
     */
    CompletableFuture<LookupTmchNoticeResponse> lookupTmchNotice(LookupTmchNoticeRequest request);

    /**
     * @param request the request parameters of PollTaskResult  PollTaskResultRequest
     * @return PollTaskResultResponse
     */
    CompletableFuture<PollTaskResultResponse> pollTaskResult(PollTaskResultRequest request);

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
     * @param request the request parameters of QueryLocalEnsAssociation  QueryLocalEnsAssociationRequest
     * @return QueryLocalEnsAssociationResponse
     */
    CompletableFuture<QueryLocalEnsAssociationResponse> queryLocalEnsAssociation(QueryLocalEnsAssociationRequest request);

    /**
     * @param request the request parameters of QueryRegistrantProfileRealNameVerificationInfo  QueryRegistrantProfileRealNameVerificationInfoRequest
     * @return QueryRegistrantProfileRealNameVerificationInfoResponse
     */
    CompletableFuture<QueryRegistrantProfileRealNameVerificationInfoResponse> queryRegistrantProfileRealNameVerificationInfo(QueryRegistrantProfileRealNameVerificationInfoRequest request);

    /**
     * @param request the request parameters of QueryRegistrantProfiles  QueryRegistrantProfilesRequest
     * @return QueryRegistrantProfilesResponse
     */
    CompletableFuture<QueryRegistrantProfilesResponse> queryRegistrantProfiles(QueryRegistrantProfilesRequest request);

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
     * @param request the request parameters of SaveBatchTaskForCreatingOrderActivate  SaveBatchTaskForCreatingOrderActivateRequest
     * @return SaveBatchTaskForCreatingOrderActivateResponse
     */
    CompletableFuture<SaveBatchTaskForCreatingOrderActivateResponse> saveBatchTaskForCreatingOrderActivate(SaveBatchTaskForCreatingOrderActivateRequest request);

    /**
     * @param request the request parameters of SaveBatchTaskForCreatingOrderRedeem  SaveBatchTaskForCreatingOrderRedeemRequest
     * @return SaveBatchTaskForCreatingOrderRedeemResponse
     */
    CompletableFuture<SaveBatchTaskForCreatingOrderRedeemResponse> saveBatchTaskForCreatingOrderRedeem(SaveBatchTaskForCreatingOrderRedeemRequest request);

    /**
     * @param request the request parameters of SaveBatchTaskForCreatingOrderRenew  SaveBatchTaskForCreatingOrderRenewRequest
     * @return SaveBatchTaskForCreatingOrderRenewResponse
     */
    CompletableFuture<SaveBatchTaskForCreatingOrderRenewResponse> saveBatchTaskForCreatingOrderRenew(SaveBatchTaskForCreatingOrderRenewRequest request);

    /**
     * @param request the request parameters of SaveBatchTaskForCreatingOrderTransfer  SaveBatchTaskForCreatingOrderTransferRequest
     * @return SaveBatchTaskForCreatingOrderTransferResponse
     */
    CompletableFuture<SaveBatchTaskForCreatingOrderTransferResponse> saveBatchTaskForCreatingOrderTransfer(SaveBatchTaskForCreatingOrderTransferRequest request);

    /**
     * @param request the request parameters of SaveBatchTaskForDomainNameProxyService  SaveBatchTaskForDomainNameProxyServiceRequest
     * @return SaveBatchTaskForDomainNameProxyServiceResponse
     */
    CompletableFuture<SaveBatchTaskForDomainNameProxyServiceResponse> saveBatchTaskForDomainNameProxyService(SaveBatchTaskForDomainNameProxyServiceRequest request);

    /**
     * @param request the request parameters of SaveBatchTaskForModifyingDomainDns  SaveBatchTaskForModifyingDomainDnsRequest
     * @return SaveBatchTaskForModifyingDomainDnsResponse
     */
    CompletableFuture<SaveBatchTaskForModifyingDomainDnsResponse> saveBatchTaskForModifyingDomainDns(SaveBatchTaskForModifyingDomainDnsRequest request);

    /**
     * @param request the request parameters of SaveBatchTaskForReserveDropListDomain  SaveBatchTaskForReserveDropListDomainRequest
     * @return SaveBatchTaskForReserveDropListDomainResponse
     */
    CompletableFuture<SaveBatchTaskForReserveDropListDomainResponse> saveBatchTaskForReserveDropListDomain(SaveBatchTaskForReserveDropListDomainRequest request);

    /**
     * @param request the request parameters of SaveBatchTaskForTransferProhibitionLock  SaveBatchTaskForTransferProhibitionLockRequest
     * @return SaveBatchTaskForTransferProhibitionLockResponse
     */
    CompletableFuture<SaveBatchTaskForTransferProhibitionLockResponse> saveBatchTaskForTransferProhibitionLock(SaveBatchTaskForTransferProhibitionLockRequest request);

    /**
     * @param request the request parameters of SaveBatchTaskForUpdateProhibitionLock  SaveBatchTaskForUpdateProhibitionLockRequest
     * @return SaveBatchTaskForUpdateProhibitionLockResponse
     */
    CompletableFuture<SaveBatchTaskForUpdateProhibitionLockResponse> saveBatchTaskForUpdateProhibitionLock(SaveBatchTaskForUpdateProhibitionLockRequest request);

    /**
     * @param request the request parameters of SaveBatchTaskForUpdatingContactInfo  SaveBatchTaskForUpdatingContactInfoRequest
     * @return SaveBatchTaskForUpdatingContactInfoResponse
     */
    CompletableFuture<SaveBatchTaskForUpdatingContactInfoResponse> saveBatchTaskForUpdatingContactInfo(SaveBatchTaskForUpdatingContactInfoRequest request);

    /**
     * @param request the request parameters of SaveBatchTaskForUpdatingContactInfoByNewContact  SaveBatchTaskForUpdatingContactInfoByNewContactRequest
     * @return SaveBatchTaskForUpdatingContactInfoByNewContactResponse
     */
    CompletableFuture<SaveBatchTaskForUpdatingContactInfoByNewContactResponse> saveBatchTaskForUpdatingContactInfoByNewContact(SaveBatchTaskForUpdatingContactInfoByNewContactRequest request);

    /**
     * @param request the request parameters of SaveRegistrantProfile  SaveRegistrantProfileRequest
     * @return SaveRegistrantProfileResponse
     */
    CompletableFuture<SaveRegistrantProfileResponse> saveRegistrantProfile(SaveRegistrantProfileRequest request);

    /**
     * @param request the request parameters of SaveSingleTaskForAddingDSRecord  SaveSingleTaskForAddingDSRecordRequest
     * @return SaveSingleTaskForAddingDSRecordResponse
     */
    CompletableFuture<SaveSingleTaskForAddingDSRecordResponse> saveSingleTaskForAddingDSRecord(SaveSingleTaskForAddingDSRecordRequest request);

    /**
     * @param request the request parameters of SaveSingleTaskForApprovingTransferOut  SaveSingleTaskForApprovingTransferOutRequest
     * @return SaveSingleTaskForApprovingTransferOutResponse
     */
    CompletableFuture<SaveSingleTaskForApprovingTransferOutResponse> saveSingleTaskForApprovingTransferOut(SaveSingleTaskForApprovingTransferOutRequest request);

    /**
     * @param request the request parameters of SaveSingleTaskForAssociatingEns  SaveSingleTaskForAssociatingEnsRequest
     * @return SaveSingleTaskForAssociatingEnsResponse
     */
    CompletableFuture<SaveSingleTaskForAssociatingEnsResponse> saveSingleTaskForAssociatingEns(SaveSingleTaskForAssociatingEnsRequest request);

    /**
     * @param request the request parameters of SaveSingleTaskForCancelingTransferIn  SaveSingleTaskForCancelingTransferInRequest
     * @return SaveSingleTaskForCancelingTransferInResponse
     */
    CompletableFuture<SaveSingleTaskForCancelingTransferInResponse> saveSingleTaskForCancelingTransferIn(SaveSingleTaskForCancelingTransferInRequest request);

    /**
     * @param request the request parameters of SaveSingleTaskForCancelingTransferOut  SaveSingleTaskForCancelingTransferOutRequest
     * @return SaveSingleTaskForCancelingTransferOutResponse
     */
    CompletableFuture<SaveSingleTaskForCancelingTransferOutResponse> saveSingleTaskForCancelingTransferOut(SaveSingleTaskForCancelingTransferOutRequest request);

    /**
     * @param request the request parameters of SaveSingleTaskForCreatingDnsHost  SaveSingleTaskForCreatingDnsHostRequest
     * @return SaveSingleTaskForCreatingDnsHostResponse
     */
    CompletableFuture<SaveSingleTaskForCreatingDnsHostResponse> saveSingleTaskForCreatingDnsHost(SaveSingleTaskForCreatingDnsHostRequest request);

    /**
     * @param request the request parameters of SaveSingleTaskForCreatingOrderActivate  SaveSingleTaskForCreatingOrderActivateRequest
     * @return SaveSingleTaskForCreatingOrderActivateResponse
     */
    CompletableFuture<SaveSingleTaskForCreatingOrderActivateResponse> saveSingleTaskForCreatingOrderActivate(SaveSingleTaskForCreatingOrderActivateRequest request);

    /**
     * @param request the request parameters of SaveSingleTaskForCreatingOrderRedeem  SaveSingleTaskForCreatingOrderRedeemRequest
     * @return SaveSingleTaskForCreatingOrderRedeemResponse
     */
    CompletableFuture<SaveSingleTaskForCreatingOrderRedeemResponse> saveSingleTaskForCreatingOrderRedeem(SaveSingleTaskForCreatingOrderRedeemRequest request);

    /**
     * @param request the request parameters of SaveSingleTaskForCreatingOrderRenew  SaveSingleTaskForCreatingOrderRenewRequest
     * @return SaveSingleTaskForCreatingOrderRenewResponse
     */
    CompletableFuture<SaveSingleTaskForCreatingOrderRenewResponse> saveSingleTaskForCreatingOrderRenew(SaveSingleTaskForCreatingOrderRenewRequest request);

    /**
     * @param request the request parameters of SaveSingleTaskForCreatingOrderTransfer  SaveSingleTaskForCreatingOrderTransferRequest
     * @return SaveSingleTaskForCreatingOrderTransferResponse
     */
    CompletableFuture<SaveSingleTaskForCreatingOrderTransferResponse> saveSingleTaskForCreatingOrderTransfer(SaveSingleTaskForCreatingOrderTransferRequest request);

    /**
     * @param request the request parameters of SaveSingleTaskForDeletingDSRecord  SaveSingleTaskForDeletingDSRecordRequest
     * @return SaveSingleTaskForDeletingDSRecordResponse
     */
    CompletableFuture<SaveSingleTaskForDeletingDSRecordResponse> saveSingleTaskForDeletingDSRecord(SaveSingleTaskForDeletingDSRecordRequest request);

    /**
     * @param request the request parameters of SaveSingleTaskForDeletingDnsHost  SaveSingleTaskForDeletingDnsHostRequest
     * @return SaveSingleTaskForDeletingDnsHostResponse
     */
    CompletableFuture<SaveSingleTaskForDeletingDnsHostResponse> saveSingleTaskForDeletingDnsHost(SaveSingleTaskForDeletingDnsHostRequest request);

    /**
     * @param request the request parameters of SaveSingleTaskForDisassociatingEns  SaveSingleTaskForDisassociatingEnsRequest
     * @return SaveSingleTaskForDisassociatingEnsResponse
     */
    CompletableFuture<SaveSingleTaskForDisassociatingEnsResponse> saveSingleTaskForDisassociatingEns(SaveSingleTaskForDisassociatingEnsRequest request);

    /**
     * @param request the request parameters of SaveSingleTaskForDomainNameProxyService  SaveSingleTaskForDomainNameProxyServiceRequest
     * @return SaveSingleTaskForDomainNameProxyServiceResponse
     */
    CompletableFuture<SaveSingleTaskForDomainNameProxyServiceResponse> saveSingleTaskForDomainNameProxyService(SaveSingleTaskForDomainNameProxyServiceRequest request);

    /**
     * @param request the request parameters of SaveSingleTaskForModifyingDSRecord  SaveSingleTaskForModifyingDSRecordRequest
     * @return SaveSingleTaskForModifyingDSRecordResponse
     */
    CompletableFuture<SaveSingleTaskForModifyingDSRecordResponse> saveSingleTaskForModifyingDSRecord(SaveSingleTaskForModifyingDSRecordRequest request);

    /**
     * @param request the request parameters of SaveSingleTaskForModifyingDnsHost  SaveSingleTaskForModifyingDnsHostRequest
     * @return SaveSingleTaskForModifyingDnsHostResponse
     */
    CompletableFuture<SaveSingleTaskForModifyingDnsHostResponse> saveSingleTaskForModifyingDnsHost(SaveSingleTaskForModifyingDnsHostRequest request);

    /**
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
     * @param request the request parameters of SaveSingleTaskForSaveArtExtension  SaveSingleTaskForSaveArtExtensionRequest
     * @return SaveSingleTaskForSaveArtExtensionResponse
     */
    CompletableFuture<SaveSingleTaskForSaveArtExtensionResponse> saveSingleTaskForSaveArtExtension(SaveSingleTaskForSaveArtExtensionRequest request);

    /**
     * @param request the request parameters of SaveSingleTaskForSynchronizingDSRecord  SaveSingleTaskForSynchronizingDSRecordRequest
     * @return SaveSingleTaskForSynchronizingDSRecordResponse
     */
    CompletableFuture<SaveSingleTaskForSynchronizingDSRecordResponse> saveSingleTaskForSynchronizingDSRecord(SaveSingleTaskForSynchronizingDSRecordRequest request);

    /**
     * @param request the request parameters of SaveSingleTaskForSynchronizingDnsHost  SaveSingleTaskForSynchronizingDnsHostRequest
     * @return SaveSingleTaskForSynchronizingDnsHostResponse
     */
    CompletableFuture<SaveSingleTaskForSynchronizingDnsHostResponse> saveSingleTaskForSynchronizingDnsHost(SaveSingleTaskForSynchronizingDnsHostRequest request);

    /**
     * @param request the request parameters of SaveSingleTaskForTransferProhibitionLock  SaveSingleTaskForTransferProhibitionLockRequest
     * @return SaveSingleTaskForTransferProhibitionLockResponse
     */
    CompletableFuture<SaveSingleTaskForTransferProhibitionLockResponse> saveSingleTaskForTransferProhibitionLock(SaveSingleTaskForTransferProhibitionLockRequest request);

    /**
     * @param request the request parameters of SaveSingleTaskForUpdateProhibitionLock  SaveSingleTaskForUpdateProhibitionLockRequest
     * @return SaveSingleTaskForUpdateProhibitionLockResponse
     */
    CompletableFuture<SaveSingleTaskForUpdateProhibitionLockResponse> saveSingleTaskForUpdateProhibitionLock(SaveSingleTaskForUpdateProhibitionLockRequest request);

    /**
     * @param request the request parameters of SaveSingleTaskForUpdatingContactInfo  SaveSingleTaskForUpdatingContactInfoRequest
     * @return SaveSingleTaskForUpdatingContactInfoResponse
     */
    CompletableFuture<SaveSingleTaskForUpdatingContactInfoResponse> saveSingleTaskForUpdatingContactInfo(SaveSingleTaskForUpdatingContactInfoRequest request);

    /**
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
     * @param request the request parameters of SaveTaskForUpdatingRegistrantInfoByIdentityCredential  SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest
     * @return SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponse
     */
    CompletableFuture<SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponse> saveTaskForUpdatingRegistrantInfoByIdentityCredential(SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest request);

    /**
     * @param request the request parameters of SaveTaskForUpdatingRegistrantInfoByRegistrantProfileID  SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDRequest
     * @return SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse
     */
    CompletableFuture<SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse> saveTaskForUpdatingRegistrantInfoByRegistrantProfileID(SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDRequest request);

    /**
     * @param request the request parameters of SubmitEmailVerification  SubmitEmailVerificationRequest
     * @return SubmitEmailVerificationResponse
     */
    CompletableFuture<SubmitEmailVerificationResponse> submitEmailVerification(SubmitEmailVerificationRequest request);

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
