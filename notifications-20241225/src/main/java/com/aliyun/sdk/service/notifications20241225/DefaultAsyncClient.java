// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.notifications20241225;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.notifications20241225.models.*;
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
        this.product = "Notifications";
        this.version = "2024-12-25";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("ap-southeast-1", "notifications-intl.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "notifications.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of CreateWebhookContact  CreateWebhookContactRequest
     * @return CreateWebhookContactResponse
     */
    @Override
    public CompletableFuture<CreateWebhookContactResponse> createWebhookContact(CreateWebhookContactRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateWebhookContact").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateWebhookContactResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateWebhookContactResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DelMessage  DelMessageRequest
     * @return DelMessageResponse
     */
    @Override
    public CompletableFuture<DelMessageResponse> delMessage(DelMessageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DelMessage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DelMessageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DelMessageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteAllMessage  DeleteAllMessageRequest
     * @return DeleteAllMessageResponse
     */
    @Override
    public CompletableFuture<DeleteAllMessageResponse> deleteAllMessage(DeleteAllMessageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAllMessage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAllMessageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAllMessageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteWebhookContact  DeleteWebhookContactRequest
     * @return DeleteWebhookContactResponse
     */
    @Override
    public CompletableFuture<DeleteWebhookContactResponse> deleteWebhookContact(DeleteWebhookContactRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteWebhookContact").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteWebhookContactResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteWebhookContactResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReadAllCommonContacts  ReadAllCommonContactsRequest
     * @return ReadAllCommonContactsResponse
     */
    @Override
    public CompletableFuture<ReadAllCommonContactsResponse> readAllCommonContacts(ReadAllCommonContactsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReadAllCommonContacts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReadAllCommonContactsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReadAllCommonContactsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReadAllMarketingPreferences  ReadAllMarketingPreferencesRequest
     * @return ReadAllMarketingPreferencesResponse
     */
    @Override
    public CompletableFuture<ReadAllMarketingPreferencesResponse> readAllMarketingPreferences(ReadAllMarketingPreferencesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReadAllMarketingPreferences").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReadAllMarketingPreferencesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReadAllMarketingPreferencesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReadAllMessage  ReadAllMessageRequest
     * @return ReadAllMessageResponse
     */
    @Override
    public CompletableFuture<ReadAllMessageResponse> readAllMessage(ReadAllMessageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReadAllMessage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReadAllMessageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReadAllMessageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReadAllWebhookContacts  ReadAllWebhookContactsRequest
     * @return ReadAllWebhookContactsResponse
     */
    @Override
    public CompletableFuture<ReadAllWebhookContactsResponse> readAllWebhookContacts(ReadAllWebhookContactsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReadAllWebhookContacts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReadAllWebhookContactsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReadAllWebhookContactsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReadCategoryGroupList  ReadCategoryGroupListRequest
     * @return ReadCategoryGroupListResponse
     */
    @Override
    public CompletableFuture<ReadCategoryGroupListResponse> readCategoryGroupList(ReadCategoryGroupListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReadCategoryGroupList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReadCategoryGroupListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReadCategoryGroupListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReadClassName  ReadClassNameRequest
     * @return ReadClassNameResponse
     */
    @Override
    public CompletableFuture<ReadClassNameResponse> readClassName(ReadClassNameRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReadClassName").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReadClassNameResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReadClassNameResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReadCommonContact  ReadCommonContactRequest
     * @return ReadCommonContactResponse
     */
    @Override
    public CompletableFuture<ReadCommonContactResponse> readCommonContact(ReadCommonContactRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReadCommonContact").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReadCommonContactResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReadCommonContactResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReadMarketingPreference  ReadMarketingPreferenceRequest
     * @return ReadMarketingPreferenceResponse
     */
    @Override
    public CompletableFuture<ReadMarketingPreferenceResponse> readMarketingPreference(ReadMarketingPreferenceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReadMarketingPreference").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReadMarketingPreferenceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReadMarketingPreferenceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReadMessage  ReadMessageRequest
     * @return ReadMessageResponse
     */
    @Override
    public CompletableFuture<ReadMessageResponse> readMessage(ReadMessageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReadMessage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReadMessageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReadMessageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReadMessageContent  ReadMessageContentRequest
     * @return ReadMessageContentResponse
     */
    @Override
    public CompletableFuture<ReadMessageContentResponse> readMessageContent(ReadMessageContentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReadMessageContent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReadMessageContentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReadMessageContentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReadMessageLanguage  ReadMessageLanguageRequest
     * @return ReadMessageLanguageResponse
     */
    @Override
    public CompletableFuture<ReadMessageLanguageResponse> readMessageLanguage(ReadMessageLanguageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReadMessageLanguage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReadMessageLanguageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReadMessageLanguageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReadMessageList  ReadMessageListRequest
     * @return ReadMessageListResponse
     */
    @Override
    public CompletableFuture<ReadMessageListResponse> readMessageList(ReadMessageListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReadMessageList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReadMessageListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReadMessageListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReadMessageNewTotal  ReadMessageNewTotalRequest
     * @return ReadMessageNewTotalResponse
     */
    @Override
    public CompletableFuture<ReadMessageNewTotalResponse> readMessageNewTotal(ReadMessageNewTotalRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReadMessageNewTotal").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReadMessageNewTotalResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReadMessageNewTotalResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReadNumGroupByClass  ReadNumGroupByClassRequest
     * @return ReadNumGroupByClassResponse
     */
    @Override
    public CompletableFuture<ReadNumGroupByClassResponse> readNumGroupByClass(ReadNumGroupByClassRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReadNumGroupByClass").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReadNumGroupByClassResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReadNumGroupByClassResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReadNumGroupTotal  ReadNumGroupTotalRequest
     * @return ReadNumGroupTotalResponse
     */
    @Override
    public CompletableFuture<ReadNumGroupTotalResponse> readNumGroupTotal(ReadNumGroupTotalRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReadNumGroupTotal").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReadNumGroupTotalResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReadNumGroupTotalResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReadRevisionHistoryList  ReadRevisionHistoryListRequest
     * @return ReadRevisionHistoryListResponse
     */
    @Override
    public CompletableFuture<ReadRevisionHistoryListResponse> readRevisionHistoryList(ReadRevisionHistoryListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReadRevisionHistoryList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReadRevisionHistoryListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReadRevisionHistoryListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReadUserSubscriptionList  ReadUserSubscriptionListRequest
     * @return ReadUserSubscriptionListResponse
     */
    @Override
    public CompletableFuture<ReadUserSubscriptionListResponse> readUserSubscriptionList(ReadUserSubscriptionListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReadUserSubscriptionList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReadUserSubscriptionListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReadUserSubscriptionListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReadWebhookContact  ReadWebhookContactRequest
     * @return ReadWebhookContactResponse
     */
    @Override
    public CompletableFuture<ReadWebhookContactResponse> readWebhookContact(ReadWebhookContactRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReadWebhookContact").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReadWebhookContactResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReadWebhookContactResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReadWebhookContactSendTemplateList  ReadWebhookContactSendTemplateListRequest
     * @return ReadWebhookContactSendTemplateListResponse
     */
    @Override
    public CompletableFuture<ReadWebhookContactSendTemplateListResponse> readWebhookContactSendTemplateList(ReadWebhookContactSendTemplateListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReadWebhookContactSendTemplateList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReadWebhookContactSendTemplateListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReadWebhookContactSendTemplateListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ResetUserSubscription  ResetUserSubscriptionRequest
     * @return ResetUserSubscriptionResponse
     */
    @Override
    public CompletableFuture<ResetUserSubscriptionResponse> resetUserSubscription(ResetUserSubscriptionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResetUserSubscription").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetUserSubscriptionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetUserSubscriptionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TestWebhookContact  TestWebhookContactRequest
     * @return TestWebhookContactResponse
     */
    @Override
    public CompletableFuture<TestWebhookContactResponse> testWebhookContact(TestWebhookContactRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TestWebhookContact").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TestWebhookContactResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TestWebhookContactResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateMarketingPreference  UpdateMarketingPreferenceRequest
     * @return UpdateMarketingPreferenceResponse
     */
    @Override
    public CompletableFuture<UpdateMarketingPreferenceResponse> updateMarketingPreference(UpdateMarketingPreferenceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateMarketingPreference").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMarketingPreferenceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMarketingPreferenceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateMessageLanguage  UpdateMessageLanguageRequest
     * @return UpdateMessageLanguageResponse
     */
    @Override
    public CompletableFuture<UpdateMessageLanguageResponse> updateMessageLanguage(UpdateMessageLanguageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateMessageLanguage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMessageLanguageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMessageLanguageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateWebhookContact  UpdateWebhookContactRequest
     * @return UpdateWebhookContactResponse
     */
    @Override
    public CompletableFuture<UpdateWebhookContactResponse> updateWebhookContact(UpdateWebhookContactRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateWebhookContact").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateWebhookContactResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateWebhookContactResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
