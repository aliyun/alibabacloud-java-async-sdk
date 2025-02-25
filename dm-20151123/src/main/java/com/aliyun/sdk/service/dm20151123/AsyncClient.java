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

    /**
     * @param request the request parameters of AddIpfilter  AddIpfilterRequest
     * @return AddIpfilterResponse
     */
    CompletableFuture<AddIpfilterResponse> addIpfilter(AddIpfilterRequest request);

    /**
     * @param request the request parameters of ApproveReplyMailAddress  ApproveReplyMailAddressRequest
     * @return ApproveReplyMailAddressResponse
     */
    CompletableFuture<ApproveReplyMailAddressResponse> approveReplyMailAddress(ApproveReplyMailAddressRequest request);

    /**
     * @param request the request parameters of BatchSendMail  BatchSendMailRequest
     * @return BatchSendMailResponse
     */
    CompletableFuture<BatchSendMailResponse> batchSendMail(BatchSendMailRequest request);

    /**
     * @param request the request parameters of CheckDomain  CheckDomainRequest
     * @return CheckDomainResponse
     */
    CompletableFuture<CheckDomainResponse> checkDomain(CheckDomainRequest request);

    /**
     * @param request the request parameters of CheckReplyToMailAddress  CheckReplyToMailAddressRequest
     * @return CheckReplyToMailAddressResponse
     */
    CompletableFuture<CheckReplyToMailAddressResponse> checkReplyToMailAddress(CheckReplyToMailAddressRequest request);

    /**
     * @param request the request parameters of CreateDomain  CreateDomainRequest
     * @return CreateDomainResponse
     */
    CompletableFuture<CreateDomainResponse> createDomain(CreateDomainRequest request);

    /**
     * @param request the request parameters of CreateMailAddress  CreateMailAddressRequest
     * @return CreateMailAddressResponse
     */
    CompletableFuture<CreateMailAddressResponse> createMailAddress(CreateMailAddressRequest request);

    /**
     * @param request the request parameters of CreateReceiver  CreateReceiverRequest
     * @return CreateReceiverResponse
     */
    CompletableFuture<CreateReceiverResponse> createReceiver(CreateReceiverRequest request);

    /**
     * @param request the request parameters of CreateTag  CreateTagRequest
     * @return CreateTagResponse
     */
    CompletableFuture<CreateTagResponse> createTag(CreateTagRequest request);

    /**
     * @param request the request parameters of CreateUserSuppression  CreateUserSuppressionRequest
     * @return CreateUserSuppressionResponse
     */
    CompletableFuture<CreateUserSuppressionResponse> createUserSuppression(CreateUserSuppressionRequest request);

    /**
     * @param request the request parameters of DeleteDomain  DeleteDomainRequest
     * @return DeleteDomainResponse
     */
    CompletableFuture<DeleteDomainResponse> deleteDomain(DeleteDomainRequest request);

    /**
     * @param request the request parameters of DeleteInvalidAddress  DeleteInvalidAddressRequest
     * @return DeleteInvalidAddressResponse
     */
    CompletableFuture<DeleteInvalidAddressResponse> deleteInvalidAddress(DeleteInvalidAddressRequest request);

    /**
     * @param request the request parameters of DeleteIpfilterByEdmId  DeleteIpfilterByEdmIdRequest
     * @return DeleteIpfilterByEdmIdResponse
     */
    CompletableFuture<DeleteIpfilterByEdmIdResponse> deleteIpfilterByEdmId(DeleteIpfilterByEdmIdRequest request);

    /**
     * @param request the request parameters of DeleteMailAddress  DeleteMailAddressRequest
     * @return DeleteMailAddressResponse
     */
    CompletableFuture<DeleteMailAddressResponse> deleteMailAddress(DeleteMailAddressRequest request);

    /**
     * @param request the request parameters of DeleteReceiver  DeleteReceiverRequest
     * @return DeleteReceiverResponse
     */
    CompletableFuture<DeleteReceiverResponse> deleteReceiver(DeleteReceiverRequest request);

    /**
     * @param request the request parameters of DeleteReceiverDetail  DeleteReceiverDetailRequest
     * @return DeleteReceiverDetailResponse
     */
    CompletableFuture<DeleteReceiverDetailResponse> deleteReceiverDetail(DeleteReceiverDetailRequest request);

    /**
     * @param request the request parameters of DeleteTag  DeleteTagRequest
     * @return DeleteTagResponse
     */
    CompletableFuture<DeleteTagResponse> deleteTag(DeleteTagRequest request);

    /**
     * @param request the request parameters of DescAccountSummary  DescAccountSummaryRequest
     * @return DescAccountSummaryResponse
     */
    CompletableFuture<DescAccountSummaryResponse> descAccountSummary(DescAccountSummaryRequest request);

    /**
     * @param request the request parameters of DescDomain  DescDomainRequest
     * @return DescDomainResponse
     */
    CompletableFuture<DescDomainResponse> descDomain(DescDomainRequest request);

    /**
     * @param request the request parameters of GetIpProtection  GetIpProtectionRequest
     * @return GetIpProtectionResponse
     */
    CompletableFuture<GetIpProtectionResponse> getIpProtection(GetIpProtectionRequest request);

    /**
     * @param request the request parameters of GetIpfilterList  GetIpfilterListRequest
     * @return GetIpfilterListResponse
     */
    CompletableFuture<GetIpfilterListResponse> getIpfilterList(GetIpfilterListRequest request);

    /**
     * @param request the request parameters of GetSuppressionListLevel  GetSuppressionListLevelRequest
     * @return GetSuppressionListLevelResponse
     */
    CompletableFuture<GetSuppressionListLevelResponse> getSuppressionListLevel(GetSuppressionListLevelRequest request);

    /**
     * @param request the request parameters of GetTrackList  GetTrackListRequest
     * @return GetTrackListResponse
     */
    CompletableFuture<GetTrackListResponse> getTrackList(GetTrackListRequest request);

    /**
     * @param request the request parameters of GetTrackListByMailFromAndTagName  GetTrackListByMailFromAndTagNameRequest
     * @return GetTrackListByMailFromAndTagNameResponse
     */
    CompletableFuture<GetTrackListByMailFromAndTagNameResponse> getTrackListByMailFromAndTagName(GetTrackListByMailFromAndTagNameRequest request);

    /**
     * @param request the request parameters of GetUser  GetUserRequest
     * @return GetUserResponse
     */
    CompletableFuture<GetUserResponse> getUser(GetUserRequest request);

    /**
     * @param request the request parameters of ListUserSuppression  ListUserSuppressionRequest
     * @return ListUserSuppressionResponse
     */
    CompletableFuture<ListUserSuppressionResponse> listUserSuppression(ListUserSuppressionRequest request);

    /**
     * @param request the request parameters of ModifyMailAddress  ModifyMailAddressRequest
     * @return ModifyMailAddressResponse
     */
    CompletableFuture<ModifyMailAddressResponse> modifyMailAddress(ModifyMailAddressRequest request);

    /**
     * @param request the request parameters of ModifyPWByDomain  ModifyPWByDomainRequest
     * @return ModifyPWByDomainResponse
     */
    CompletableFuture<ModifyPWByDomainResponse> modifyPWByDomain(ModifyPWByDomainRequest request);

    /**
     * @param request the request parameters of ModifyTag  ModifyTagRequest
     * @return ModifyTagResponse
     */
    CompletableFuture<ModifyTagResponse> modifyTag(ModifyTagRequest request);

    /**
     * @param request the request parameters of QueryDomainByParam  QueryDomainByParamRequest
     * @return QueryDomainByParamResponse
     */
    CompletableFuture<QueryDomainByParamResponse> queryDomainByParam(QueryDomainByParamRequest request);

    /**
     * @param request the request parameters of QueryInvalidAddress  QueryInvalidAddressRequest
     * @return QueryInvalidAddressResponse
     */
    CompletableFuture<QueryInvalidAddressResponse> queryInvalidAddress(QueryInvalidAddressRequest request);

    /**
     * @param request the request parameters of QueryMailAddressByParam  QueryMailAddressByParamRequest
     * @return QueryMailAddressByParamResponse
     */
    CompletableFuture<QueryMailAddressByParamResponse> queryMailAddressByParam(QueryMailAddressByParamRequest request);

    /**
     * @param request the request parameters of QueryReceiverByParam  QueryReceiverByParamRequest
     * @return QueryReceiverByParamResponse
     */
    CompletableFuture<QueryReceiverByParamResponse> queryReceiverByParam(QueryReceiverByParamRequest request);

    /**
     * @param request the request parameters of QueryReceiverDetail  QueryReceiverDetailRequest
     * @return QueryReceiverDetailResponse
     */
    CompletableFuture<QueryReceiverDetailResponse> queryReceiverDetail(QueryReceiverDetailRequest request);

    /**
     * @param request the request parameters of QueryTagByParam  QueryTagByParamRequest
     * @return QueryTagByParamResponse
     */
    CompletableFuture<QueryTagByParamResponse> queryTagByParam(QueryTagByParamRequest request);

    /**
     * @param request the request parameters of QueryTaskByParam  QueryTaskByParamRequest
     * @return QueryTaskByParamResponse
     */
    CompletableFuture<QueryTaskByParamResponse> queryTaskByParam(QueryTaskByParamRequest request);

    /**
     * @param request the request parameters of RemoveUserSuppression  RemoveUserSuppressionRequest
     * @return RemoveUserSuppressionResponse
     */
    CompletableFuture<RemoveUserSuppressionResponse> removeUserSuppression(RemoveUserSuppressionRequest request);

    /**
     * @param request the request parameters of SaveReceiverDetail  SaveReceiverDetailRequest
     * @return SaveReceiverDetailResponse
     */
    CompletableFuture<SaveReceiverDetailResponse> saveReceiverDetail(SaveReceiverDetailRequest request);

    /**
     * @param request the request parameters of SendTestByTemplate  SendTestByTemplateRequest
     * @return SendTestByTemplateResponse
     */
    CompletableFuture<SendTestByTemplateResponse> sendTestByTemplate(SendTestByTemplateRequest request);

    /**
     * @param request the request parameters of SenderStatisticsByTagNameAndBatchID  SenderStatisticsByTagNameAndBatchIDRequest
     * @return SenderStatisticsByTagNameAndBatchIDResponse
     */
    CompletableFuture<SenderStatisticsByTagNameAndBatchIDResponse> senderStatisticsByTagNameAndBatchID(SenderStatisticsByTagNameAndBatchIDRequest request);

    /**
     * @param request the request parameters of SenderStatisticsDetailByParam  SenderStatisticsDetailByParamRequest
     * @return SenderStatisticsDetailByParamResponse
     */
    CompletableFuture<SenderStatisticsDetailByParamResponse> senderStatisticsDetailByParam(SenderStatisticsDetailByParamRequest request);

    /**
     * @param request the request parameters of SetSuppressionListLevel  SetSuppressionListLevelRequest
     * @return SetSuppressionListLevelResponse
     */
    CompletableFuture<SetSuppressionListLevelResponse> setSuppressionListLevel(SetSuppressionListLevelRequest request);

    /**
     * @param request the request parameters of SingleSendMail  SingleSendMailRequest
     * @return SingleSendMailResponse
     */
    CompletableFuture<SingleSendMailResponse> singleSendMail(SingleSendMailRequest request);

    /**
     * @param request the request parameters of UpdateIpProtection  UpdateIpProtectionRequest
     * @return UpdateIpProtectionResponse
     */
    CompletableFuture<UpdateIpProtectionResponse> updateIpProtection(UpdateIpProtectionRequest request);

    /**
     * @param request the request parameters of UpdateUser  UpdateUserRequest
     * @return UpdateUserResponse
     */
    CompletableFuture<UpdateUserResponse> updateUser(UpdateUserRequest request);

}
