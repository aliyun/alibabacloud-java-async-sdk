// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dm20151123.models.*;
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

    CompletableFuture<AddIpfilterResponse> addIpfilter(AddIpfilterRequest request);

    CompletableFuture<ApproveReplyMailAddressResponse> approveReplyMailAddress(ApproveReplyMailAddressRequest request);

    CompletableFuture<BatchSendMailResponse> batchSendMail(BatchSendMailRequest request);

    CompletableFuture<CheckDomainResponse> checkDomain(CheckDomainRequest request);

    CompletableFuture<CheckReplyToMailAddressResponse> checkReplyToMailAddress(CheckReplyToMailAddressRequest request);

    CompletableFuture<CreateDomainResponse> createDomain(CreateDomainRequest request);

    CompletableFuture<CreateMailAddressResponse> createMailAddress(CreateMailAddressRequest request);

    CompletableFuture<CreateReceiverResponse> createReceiver(CreateReceiverRequest request);

    CompletableFuture<CreateTagResponse> createTag(CreateTagRequest request);

    CompletableFuture<DeleteDomainResponse> deleteDomain(DeleteDomainRequest request);

    CompletableFuture<DeleteInvalidAddressResponse> deleteInvalidAddress(DeleteInvalidAddressRequest request);

    CompletableFuture<DeleteIpfilterByEdmIdResponse> deleteIpfilterByEdmId(DeleteIpfilterByEdmIdRequest request);

    CompletableFuture<DeleteMailAddressResponse> deleteMailAddress(DeleteMailAddressRequest request);

    CompletableFuture<DeleteReceiverResponse> deleteReceiver(DeleteReceiverRequest request);

    CompletableFuture<DeleteReceiverDetailResponse> deleteReceiverDetail(DeleteReceiverDetailRequest request);

    CompletableFuture<DeleteTagResponse> deleteTag(DeleteTagRequest request);

    CompletableFuture<DescAccountSummaryResponse> descAccountSummary(DescAccountSummaryRequest request);

    CompletableFuture<DescDomainResponse> descDomain(DescDomainRequest request);

    CompletableFuture<GetIpProtectionResponse> getIpProtection(GetIpProtectionRequest request);

    CompletableFuture<GetIpfilterListResponse> getIpfilterList(GetIpfilterListRequest request);

    CompletableFuture<GetTrackListResponse> getTrackList(GetTrackListRequest request);

    CompletableFuture<GetTrackListByMailFromAndTagNameResponse> getTrackListByMailFromAndTagName(GetTrackListByMailFromAndTagNameRequest request);

    CompletableFuture<ModifyMailAddressResponse> modifyMailAddress(ModifyMailAddressRequest request);

    CompletableFuture<ModifyPWByDomainResponse> modifyPWByDomain(ModifyPWByDomainRequest request);

    CompletableFuture<ModifyTagResponse> modifyTag(ModifyTagRequest request);

    CompletableFuture<QueryDomainByParamResponse> queryDomainByParam(QueryDomainByParamRequest request);

    CompletableFuture<QueryInvalidAddressResponse> queryInvalidAddress(QueryInvalidAddressRequest request);

    CompletableFuture<QueryMailAddressByParamResponse> queryMailAddressByParam(QueryMailAddressByParamRequest request);

    CompletableFuture<QueryReceiverByParamResponse> queryReceiverByParam(QueryReceiverByParamRequest request);

    CompletableFuture<QueryReceiverDetailResponse> queryReceiverDetail(QueryReceiverDetailRequest request);

    CompletableFuture<QueryTagByParamResponse> queryTagByParam(QueryTagByParamRequest request);

    CompletableFuture<QueryTaskByParamResponse> queryTaskByParam(QueryTaskByParamRequest request);

    CompletableFuture<SaveReceiverDetailResponse> saveReceiverDetail(SaveReceiverDetailRequest request);

    CompletableFuture<SendTestByTemplateResponse> sendTestByTemplate(SendTestByTemplateRequest request);

    CompletableFuture<SenderStatisticsByTagNameAndBatchIDResponse> senderStatisticsByTagNameAndBatchID(SenderStatisticsByTagNameAndBatchIDRequest request);

    CompletableFuture<SenderStatisticsDetailByParamResponse> senderStatisticsDetailByParam(SenderStatisticsDetailByParamRequest request);

    CompletableFuture<SingleSendMailResponse> singleSendMail(SingleSendMailRequest request);

    CompletableFuture<UpdateIpProtectionResponse> updateIpProtection(UpdateIpProtectionRequest request);

}
