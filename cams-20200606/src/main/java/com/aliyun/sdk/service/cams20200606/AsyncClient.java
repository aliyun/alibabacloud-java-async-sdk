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

    CompletableFuture<AddChatappPhoneNumberResponse> addChatappPhoneNumber(AddChatappPhoneNumberRequest request);

    /**
      * You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<BeeBotAssociateResponse> beeBotAssociate(BeeBotAssociateRequest request);

    /**
      * You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<BeeBotChatResponse> beeBotChat(BeeBotChatRequest request);

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<ChatappBindWabaResponse> chatappBindWaba(ChatappBindWabaRequest request);

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<ChatappEmbedSignUpResponse> chatappEmbedSignUp(ChatappEmbedSignUpRequest request);

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<ChatappMigrationRegisterResponse> chatappMigrationRegister(ChatappMigrationRegisterRequest request);

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<ChatappMigrationVerifiedResponse> chatappMigrationVerified(ChatappMigrationVerifiedRequest request);

    CompletableFuture<ChatappPhoneNumberDeregisterResponse> chatappPhoneNumberDeregister(ChatappPhoneNumberDeregisterRequest request);

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<ChatappPhoneNumberRegisterResponse> chatappPhoneNumberRegister(ChatappPhoneNumberRegisterRequest request);

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<ChatappSyncPhoneNumberResponse> chatappSyncPhoneNumber(ChatappSyncPhoneNumberRequest request);

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<ChatappVerifyAndRegisterResponse> chatappVerifyAndRegister(ChatappVerifyAndRegisterRequest request);

    /**
      * The status of the phone number.
      *
     */
    CompletableFuture<CreateChatappMigrationInitiateResponse> createChatappMigrationInitiate(CreateChatappMigrationInitiateRequest request);

    /**
      * The error message.
      *
     */
    CompletableFuture<CreateChatappTemplateResponse> createChatappTemplate(CreateChatappTemplateRequest request);

    /**
      * ### QPS limit
      * You can call this operation up to five times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DeleteChatappTemplateResponse> deleteChatappTemplate(DeleteChatappTemplateRequest request);

    CompletableFuture<EnableWhatsappROIMetricResponse> enableWhatsappROIMetric(EnableWhatsappROIMetricRequest request);

    CompletableFuture<GetChatappPhoneNumberMetricResponse> getChatappPhoneNumberMetric(GetChatappPhoneNumberMetricRequest request);

    /**
      * ### QPS limit
      * You can call this API operation up to five times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<GetChatappTemplateDetailResponse> getChatappTemplateDetail(GetChatappTemplateDetailRequest request);

    CompletableFuture<GetChatappTemplateMetricResponse> getChatappTemplateMetric(GetChatappTemplateMetricRequest request);

    /**
      * You can call this operation up to five times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<GetChatappUploadAuthorizationResponse> getChatappUploadAuthorization(GetChatappUploadAuthorizationRequest request);

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<GetChatappVerifyCodeResponse> getChatappVerifyCode(GetChatappVerifyCodeRequest request);

    /**
      * The ID of the phone number.
      *
     */
    CompletableFuture<GetMigrationVerifyCodeResponse> getMigrationVerifyCode(GetMigrationVerifyCodeRequest request);

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<GetPhoneNumberVerificationStatusResponse> getPhoneNumberVerificationStatus(GetPhoneNumberVerificationStatusRequest request);

    CompletableFuture<GetPreValidatePhoneIdResponse> getPreValidatePhoneId(GetPreValidatePhoneIdRequest request);

    CompletableFuture<GetWhatsappConnectionCatalogResponse> getWhatsappConnectionCatalog(GetWhatsappConnectionCatalogRequest request);

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<IsvGetAppIdResponse> isvGetAppId(IsvGetAppIdRequest request);

    /**
      * ### QPS limit
      * You can call this operation up to five times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<ListChatappTemplateResponse> listChatappTemplate(ListChatappTemplateRequest request);

    CompletableFuture<ListProductResponse> listProduct(ListProductRequest request);

    CompletableFuture<ListProductCatalogResponse> listProductCatalog(ListProductCatalogRequest request);

    /**
      * The name of the message template.
      *
     */
    CompletableFuture<ModifyChatappTemplateResponse> modifyChatappTemplate(ModifyChatappTemplateRequest request);

    /**
      * ModifyPhoneBusinessProfile
      *
     */
    CompletableFuture<ModifyPhoneBusinessProfileResponse> modifyPhoneBusinessProfile(ModifyPhoneBusinessProfileRequest request);

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<QueryChatappBindWabaResponse> queryChatappBindWaba(QueryChatappBindWabaRequest request);

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<QueryChatappPhoneNumbersResponse> queryChatappPhoneNumbers(QueryChatappPhoneNumbersRequest request);

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<QueryPhoneBusinessProfileResponse> queryPhoneBusinessProfile(QueryPhoneBusinessProfileRequest request);

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<QueryWabaBusinessInfoResponse> queryWabaBusinessInfo(QueryWabaBusinessInfoRequest request);

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      * You can send messages to up to 1,000 phone numbers in a single request.
      *
     */
    CompletableFuture<SendChatappMassMessageResponse> sendChatappMassMessage(SendChatappMassMessageRequest request);

    /**
      * You can call this operation up to 200 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<SendChatappMessageResponse> sendChatappMessage(SendChatappMessageRequest request);

    /**
      * You can call this operation up to five times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<SubmitIsvCustomerTermsResponse> submitIsvCustomerTerms(SubmitIsvCustomerTermsRequest request);

    /**
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<UpdateAccountWebhookResponse> updateAccountWebhook(UpdateAccountWebhookRequest request);

    /**
      * The error message returned.
      *
     */
    CompletableFuture<UpdatePhoneWebhookResponse> updatePhoneWebhook(UpdatePhoneWebhookRequest request);

}
