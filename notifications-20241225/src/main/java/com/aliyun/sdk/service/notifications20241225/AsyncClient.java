// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.notifications20241225;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.notifications20241225.models.*;
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
     * @param request the request parameters of CreateWebhookContact  CreateWebhookContactRequest
     * @return CreateWebhookContactResponse
     */
    CompletableFuture<CreateWebhookContactResponse> createWebhookContact(CreateWebhookContactRequest request);

    /**
     * @param request the request parameters of DelMessage  DelMessageRequest
     * @return DelMessageResponse
     */
    CompletableFuture<DelMessageResponse> delMessage(DelMessageRequest request);

    /**
     * @param request the request parameters of DeleteAllMessage  DeleteAllMessageRequest
     * @return DeleteAllMessageResponse
     */
    CompletableFuture<DeleteAllMessageResponse> deleteAllMessage(DeleteAllMessageRequest request);

    /**
     * @param request the request parameters of DeleteWebhookContact  DeleteWebhookContactRequest
     * @return DeleteWebhookContactResponse
     */
    CompletableFuture<DeleteWebhookContactResponse> deleteWebhookContact(DeleteWebhookContactRequest request);

    /**
     * @param request the request parameters of ReadAllCommonContacts  ReadAllCommonContactsRequest
     * @return ReadAllCommonContactsResponse
     */
    CompletableFuture<ReadAllCommonContactsResponse> readAllCommonContacts(ReadAllCommonContactsRequest request);

    /**
     * @param request the request parameters of ReadAllMarketingPreferences  ReadAllMarketingPreferencesRequest
     * @return ReadAllMarketingPreferencesResponse
     */
    CompletableFuture<ReadAllMarketingPreferencesResponse> readAllMarketingPreferences(ReadAllMarketingPreferencesRequest request);

    /**
     * @param request the request parameters of ReadAllMessage  ReadAllMessageRequest
     * @return ReadAllMessageResponse
     */
    CompletableFuture<ReadAllMessageResponse> readAllMessage(ReadAllMessageRequest request);

    /**
     * @param request the request parameters of ReadAllWebhookContacts  ReadAllWebhookContactsRequest
     * @return ReadAllWebhookContactsResponse
     */
    CompletableFuture<ReadAllWebhookContactsResponse> readAllWebhookContacts(ReadAllWebhookContactsRequest request);

    /**
     * @param request the request parameters of ReadCategoryGroupList  ReadCategoryGroupListRequest
     * @return ReadCategoryGroupListResponse
     */
    CompletableFuture<ReadCategoryGroupListResponse> readCategoryGroupList(ReadCategoryGroupListRequest request);

    /**
     * @param request the request parameters of ReadClassName  ReadClassNameRequest
     * @return ReadClassNameResponse
     */
    CompletableFuture<ReadClassNameResponse> readClassName(ReadClassNameRequest request);

    /**
     * @param request the request parameters of ReadCommonContact  ReadCommonContactRequest
     * @return ReadCommonContactResponse
     */
    CompletableFuture<ReadCommonContactResponse> readCommonContact(ReadCommonContactRequest request);

    /**
     * @param request the request parameters of ReadMarketingPreference  ReadMarketingPreferenceRequest
     * @return ReadMarketingPreferenceResponse
     */
    CompletableFuture<ReadMarketingPreferenceResponse> readMarketingPreference(ReadMarketingPreferenceRequest request);

    /**
     * @param request the request parameters of ReadMessage  ReadMessageRequest
     * @return ReadMessageResponse
     */
    CompletableFuture<ReadMessageResponse> readMessage(ReadMessageRequest request);

    /**
     * @param request the request parameters of ReadMessageContent  ReadMessageContentRequest
     * @return ReadMessageContentResponse
     */
    CompletableFuture<ReadMessageContentResponse> readMessageContent(ReadMessageContentRequest request);

    /**
     * @param request the request parameters of ReadMessageLanguage  ReadMessageLanguageRequest
     * @return ReadMessageLanguageResponse
     */
    CompletableFuture<ReadMessageLanguageResponse> readMessageLanguage(ReadMessageLanguageRequest request);

    /**
     * @param request the request parameters of ReadMessageList  ReadMessageListRequest
     * @return ReadMessageListResponse
     */
    CompletableFuture<ReadMessageListResponse> readMessageList(ReadMessageListRequest request);

    /**
     * @param request the request parameters of ReadMessageNewTotal  ReadMessageNewTotalRequest
     * @return ReadMessageNewTotalResponse
     */
    CompletableFuture<ReadMessageNewTotalResponse> readMessageNewTotal(ReadMessageNewTotalRequest request);

    /**
     * @param request the request parameters of ReadNumGroupByClass  ReadNumGroupByClassRequest
     * @return ReadNumGroupByClassResponse
     */
    CompletableFuture<ReadNumGroupByClassResponse> readNumGroupByClass(ReadNumGroupByClassRequest request);

    /**
     * @param request the request parameters of ReadNumGroupTotal  ReadNumGroupTotalRequest
     * @return ReadNumGroupTotalResponse
     */
    CompletableFuture<ReadNumGroupTotalResponse> readNumGroupTotal(ReadNumGroupTotalRequest request);

    /**
     * @param request the request parameters of ReadRevisionHistoryList  ReadRevisionHistoryListRequest
     * @return ReadRevisionHistoryListResponse
     */
    CompletableFuture<ReadRevisionHistoryListResponse> readRevisionHistoryList(ReadRevisionHistoryListRequest request);

    /**
     * @param request the request parameters of ReadUserSubscriptionList  ReadUserSubscriptionListRequest
     * @return ReadUserSubscriptionListResponse
     */
    CompletableFuture<ReadUserSubscriptionListResponse> readUserSubscriptionList(ReadUserSubscriptionListRequest request);

    /**
     * @param request the request parameters of ReadWebhookContact  ReadWebhookContactRequest
     * @return ReadWebhookContactResponse
     */
    CompletableFuture<ReadWebhookContactResponse> readWebhookContact(ReadWebhookContactRequest request);

    /**
     * @param request the request parameters of ReadWebhookContactSendTemplateList  ReadWebhookContactSendTemplateListRequest
     * @return ReadWebhookContactSendTemplateListResponse
     */
    CompletableFuture<ReadWebhookContactSendTemplateListResponse> readWebhookContactSendTemplateList(ReadWebhookContactSendTemplateListRequest request);

    /**
     * @param request the request parameters of ResetUserSubscription  ResetUserSubscriptionRequest
     * @return ResetUserSubscriptionResponse
     */
    CompletableFuture<ResetUserSubscriptionResponse> resetUserSubscription(ResetUserSubscriptionRequest request);

    /**
     * @param request the request parameters of TestWebhookContact  TestWebhookContactRequest
     * @return TestWebhookContactResponse
     */
    CompletableFuture<TestWebhookContactResponse> testWebhookContact(TestWebhookContactRequest request);

    /**
     * @param request the request parameters of UpdateMarketingPreference  UpdateMarketingPreferenceRequest
     * @return UpdateMarketingPreferenceResponse
     */
    CompletableFuture<UpdateMarketingPreferenceResponse> updateMarketingPreference(UpdateMarketingPreferenceRequest request);

    /**
     * @param request the request parameters of UpdateMessageLanguage  UpdateMessageLanguageRequest
     * @return UpdateMessageLanguageResponse
     */
    CompletableFuture<UpdateMessageLanguageResponse> updateMessageLanguage(UpdateMessageLanguageRequest request);

    /**
     * @param request the request parameters of UpdateWebhookContact  UpdateWebhookContactRequest
     * @return UpdateWebhookContactResponse
     */
    CompletableFuture<UpdateWebhookContactResponse> updateWebhookContact(UpdateWebhookContactRequest request);

}
