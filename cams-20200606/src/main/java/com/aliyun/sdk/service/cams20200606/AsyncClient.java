// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cams20200606.models.*;
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
      * You can call this operation up to 100 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<BeeBotAssociateResponse> beeBotAssociate(BeeBotAssociateRequest request);

    /**
      * You can call this operation up to 100 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<BeeBotChatResponse> beeBotChat(BeeBotChatRequest request);

    CompletableFuture<ChatappBindWabaResponse> chatappBindWaba(ChatappBindWabaRequest request);

    CompletableFuture<ChatappEmbedSignUpResponse> chatappEmbedSignUp(ChatappEmbedSignUpRequest request);

    CompletableFuture<ChatappMigrationRegisterResponse> chatappMigrationRegister(ChatappMigrationRegisterRequest request);

    CompletableFuture<ChatappMigrationVerifiedResponse> chatappMigrationVerified(ChatappMigrationVerifiedRequest request);

    CompletableFuture<ChatappPhoneNumberRegisterResponse> chatappPhoneNumberRegister(ChatappPhoneNumberRegisterRequest request);

    CompletableFuture<ChatappSyncPhoneNumberResponse> chatappSyncPhoneNumber(ChatappSyncPhoneNumberRequest request);

    CompletableFuture<ChatappVerifyAndRegisterResponse> chatappVerifyAndRegister(ChatappVerifyAndRegisterRequest request);

    CompletableFuture<CreateChatappMigrationInitiateResponse> createChatappMigrationInitiate(CreateChatappMigrationInitiateRequest request);

    /**
      * ### QPS limit
      * You can call this operation up to 5 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.
      *
     */
    CompletableFuture<CreateChatappTemplateResponse> createChatappTemplate(CreateChatappTemplateRequest request);

    /**
      * ### QPS limit
      * You can call this operation up to 5 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.
      *
     */
    CompletableFuture<DeleteChatappTemplateResponse> deleteChatappTemplate(DeleteChatappTemplateRequest request);

    /**
      * ### QPS limit
      * You can call this operation up to 5 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.
      *
     */
    CompletableFuture<GetChatappTemplateDetailResponse> getChatappTemplateDetail(GetChatappTemplateDetailRequest request);

    CompletableFuture<GetChatappVerifyCodeResponse> getChatappVerifyCode(GetChatappVerifyCodeRequest request);

    CompletableFuture<GetMigrationVerifyCodeResponse> getMigrationVerifyCode(GetMigrationVerifyCodeRequest request);

    CompletableFuture<GetPhoneNumberVerificationStatusResponse> getPhoneNumberVerificationStatus(GetPhoneNumberVerificationStatusRequest request);

    CompletableFuture<IsvGetAppIdResponse> isvGetAppId(IsvGetAppIdRequest request);

    /**
      * ### QPS limit
      * You can call this operation up to 5 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.
      *
     */
    CompletableFuture<ListChatappTemplateResponse> listChatappTemplate(ListChatappTemplateRequest request);

    CompletableFuture<ModifyChatappTemplateResponse> modifyChatappTemplate(ModifyChatappTemplateRequest request);

    CompletableFuture<ModifyPhoneBusinessProfileResponse> modifyPhoneBusinessProfile(ModifyPhoneBusinessProfileRequest request);

    /**
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<QueryChatappBindWabaResponse> queryChatappBindWaba(QueryChatappBindWabaRequest request);

    /**
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<QueryChatappPhoneNumbersResponse> queryChatappPhoneNumbers(QueryChatappPhoneNumbersRequest request);

    CompletableFuture<QueryPhoneBusinessProfileResponse> queryPhoneBusinessProfile(QueryPhoneBusinessProfileRequest request);

    CompletableFuture<QueryWabaBusinessInfoResponse> queryWabaBusinessInfo(QueryWabaBusinessInfoRequest request);

    /**
      * You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.
      * Can support up to 1,000 numbers per request.
      *
     */
    CompletableFuture<SendChatappMassMessageResponse> sendChatappMassMessage(SendChatappMassMessageRequest request);

    /**
      * You can call this operation up to 200 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.
      *
     */
    CompletableFuture<SendChatappMessageResponse> sendChatappMessage(SendChatappMessageRequest request);

    CompletableFuture<UpdateAccountWebhookResponse> updateAccountWebhook(UpdateAccountWebhookRequest request);

    CompletableFuture<UpdatePhoneWebhookResponse> updatePhoneWebhook(UpdatePhoneWebhookRequest request);

}
