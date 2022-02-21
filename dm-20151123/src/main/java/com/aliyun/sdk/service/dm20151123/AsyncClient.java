// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dm20151123.models.*;
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

    CompletableFuture<AddIpfilterResponse> addIpfilter(AddIpfilterRequest request);

    CompletableFuture<ApproveMailTemplateResponse> approveMailTemplate(ApproveMailTemplateRequest request);

    CompletableFuture<ApproveReplyMailAddressResponse> approveReplyMailAddress(ApproveReplyMailAddressRequest request);

    CompletableFuture<ApproveSmsTemplateResponse> approveSmsTemplate(ApproveSmsTemplateRequest request);

    CompletableFuture<ApproveTemplateResponse> approveTemplate(ApproveTemplateRequest request);

    CompletableFuture<BatchSendMailResponse> batchSendMail(BatchSendMailRequest request);

    CompletableFuture<CheckDomainResponse> checkDomain(CheckDomainRequest request);

    CompletableFuture<CheckInvalidAddressResponse> checkInvalidAddress(CheckInvalidAddressRequest request);

    CompletableFuture<CheckReplyToMailAddressResponse> checkReplyToMailAddress(CheckReplyToMailAddressRequest request);

    CompletableFuture<CreateDayuResponse> createDayu(CreateDayuRequest request);

    CompletableFuture<CreateDomainResponse> createDomain(CreateDomainRequest request);

    CompletableFuture<CreateMailAddressResponse> createMailAddress(CreateMailAddressRequest request);

    CompletableFuture<CreateReceiverResponse> createReceiver(CreateReceiverRequest request);

    CompletableFuture<CreateSignResponse> createSign(CreateSignRequest request);

    CompletableFuture<CreateTagResponse> createTag(CreateTagRequest request);

    CompletableFuture<CreateTemplateResponse> createTemplate(CreateTemplateRequest request);

    CompletableFuture<DeleteDomainResponse> deleteDomain(DeleteDomainRequest request);

    CompletableFuture<DeleteInvalidAddressResponse> deleteInvalidAddress(DeleteInvalidAddressRequest request);

    CompletableFuture<DeleteIpfilterByEdmIdResponse> deleteIpfilterByEdmId(DeleteIpfilterByEdmIdRequest request);

    CompletableFuture<DeleteMailAddressResponse> deleteMailAddress(DeleteMailAddressRequest request);

    CompletableFuture<DeleteReceiverResponse> deleteReceiver(DeleteReceiverRequest request);

    CompletableFuture<DeleteReceiverDetailResponse> deleteReceiverDetail(DeleteReceiverDetailRequest request);

    CompletableFuture<DeleteSignResponse> deleteSign(DeleteSignRequest request);

    CompletableFuture<DeleteTagResponse> deleteTag(DeleteTagRequest request);

    CompletableFuture<DeleteTemplateResponse> deleteTemplate(DeleteTemplateRequest request);

    CompletableFuture<DescAccountSummaryResponse> descAccountSummary(DescAccountSummaryRequest request);

    CompletableFuture<DescAccountSummary2Response> descAccountSummary2(DescAccountSummary2Request request);

    CompletableFuture<DescDomainResponse> descDomain(DescDomainRequest request);

    CompletableFuture<DescTemplateResponse> descTemplate(DescTemplateRequest request);

    CompletableFuture<EnableAccountResponse> enableAccount(EnableAccountRequest request);

    CompletableFuture<GetAccountListResponse> getAccountList(GetAccountListRequest request);

    CompletableFuture<GetIpProtectionResponse> getIpProtection(GetIpProtectionRequest request);

    CompletableFuture<GetIpfilterListResponse> getIpfilterList(GetIpfilterListRequest request);

    CompletableFuture<GetMailAddressMsgCallBackUrlResponse> getMailAddressMsgCallBackUrl(GetMailAddressMsgCallBackUrlRequest request);

    CompletableFuture<GetRegionListResponse> getRegionList(GetRegionListRequest request);

    CompletableFuture<GetSenderAddressListResponse> getSenderAddressList(GetSenderAddressListRequest request);

    CompletableFuture<GetTrackListResponse> getTrackList(GetTrackListRequest request);

    CompletableFuture<GetTrackListByMailFromAndTagNameResponse> getTrackListByMailFromAndTagName(GetTrackListByMailFromAndTagNameRequest request);

    CompletableFuture<MigrateMarketResponse> migrateMarket(MigrateMarketRequest request);

    CompletableFuture<ModifyAccountNotificationResponse> modifyAccountNotification(ModifyAccountNotificationRequest request);

    CompletableFuture<ModifyMailAddressResponse> modifyMailAddress(ModifyMailAddressRequest request);

    CompletableFuture<ModifyPWByDomainResponse> modifyPWByDomain(ModifyPWByDomainRequest request);

    CompletableFuture<ModifySenderAddressNotificationResponse> modifySenderAddressNotification(ModifySenderAddressNotificationRequest request);

    CompletableFuture<ModifyTagResponse> modifyTag(ModifyTagRequest request);

    CompletableFuture<ModifyTemplateResponse> modifyTemplate(ModifyTemplateRequest request);

    CompletableFuture<QueryDomainByParamResponse> queryDomainByParam(QueryDomainByParamRequest request);

    CompletableFuture<QueryInvalidAddressResponse> queryInvalidAddress(QueryInvalidAddressRequest request);

    CompletableFuture<QueryMailAddressByParamResponse> queryMailAddressByParam(QueryMailAddressByParamRequest request);

    CompletableFuture<QueryReceiverByParamResponse> queryReceiverByParam(QueryReceiverByParamRequest request);

    CompletableFuture<QueryReceiverDetailResponse> queryReceiverDetail(QueryReceiverDetailRequest request);

    CompletableFuture<QuerySignByParamResponse> querySignByParam(QuerySignByParamRequest request);

    CompletableFuture<QuerySmsStatisticsResponse> querySmsStatistics(QuerySmsStatisticsRequest request);

    CompletableFuture<QueryTagByParamResponse> queryTagByParam(QueryTagByParamRequest request);

    CompletableFuture<QueryTaskByParamResponse> queryTaskByParam(QueryTaskByParamRequest request);

    CompletableFuture<QueryTemplateByParamResponse> queryTemplateByParam(QueryTemplateByParamRequest request);

    CompletableFuture<SaveReceiverDetailResponse> saveReceiverDetail(SaveReceiverDetailRequest request);

    CompletableFuture<SendMailUseTemplateResponse> sendMailUseTemplate(SendMailUseTemplateRequest request);

    CompletableFuture<SendTestByTemplateResponse> sendTestByTemplate(SendTestByTemplateRequest request);

    CompletableFuture<SenderStatisticsByTagNameAndBatchIDResponse> senderStatisticsByTagNameAndBatchID(SenderStatisticsByTagNameAndBatchIDRequest request);

    CompletableFuture<SenderStatisticsDetailByParamResponse> senderStatisticsDetailByParam(SenderStatisticsDetailByParamRequest request);

    CompletableFuture<SingleSendMailResponse> singleSendMail(SingleSendMailRequest request);

    CompletableFuture<SingleSendSmsResponse> singleSendSms(SingleSendSmsRequest request);

    CompletableFuture<UpdateDomainTrackNameResponse> updateDomainTrackName(UpdateDomainTrackNameRequest request);

    CompletableFuture<UpdateIpProtectionResponse> updateIpProtection(UpdateIpProtectionRequest request);

    CompletableFuture<UpdateMailAddressMsgCallBackUrlResponse> updateMailAddressMsgCallBackUrl(UpdateMailAddressMsgCallBackUrlRequest request);

}
