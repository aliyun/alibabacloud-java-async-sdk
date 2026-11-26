// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.rtc20180111.models.*;
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
     * <h1>Usage notes</h1>
     * <p>This operation adds a recording configuration template. For example, when you add a recording configuration template, you can configure parameters such as recording specifications and encoding options.</p>
     * <h1>QPS limits</h1>
     * <p>The QPS limit for a single user is 100 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable rate. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of AddRecordTemplate  AddRecordTemplateRequest
     * @return AddRecordTemplateResponse
     */
    CompletableFuture<AddRecordTemplateResponse> addRecordTemplate(AddRecordTemplateRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 10 calls per second for this API operation. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of CreateAppAgentTemplate  CreateAppAgentTemplateRequest
     * @return CreateAppAgentTemplateResponse
     */
    CompletableFuture<CreateAppAgentTemplateResponse> createAppAgentTemplate(CreateAppAgentTemplateRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit per user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of CreateAppLayout  CreateAppLayoutRequest
     * @return CreateAppLayoutResponse
     */
    CompletableFuture<CreateAppLayoutResponse> createAppLayout(CreateAppLayoutRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for a single user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of CreateAppRecordTemplate  CreateAppRecordTemplateRequest
     * @return CreateAppRecordTemplateResponse
     */
    CompletableFuture<CreateAppRecordTemplateResponse> createAppRecordTemplate(CreateAppRecordTemplateRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation creates a stream forwarding template for an RTC 3.0 application.</p>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Make API calls at a reasonable rate.</p>
     * 
     * @param request the request parameters of CreateAppStreamingOutTemplate  CreateAppStreamingOutTemplateRequest
     * @return CreateAppStreamingOutTemplateResponse
     */
    CompletableFuture<CreateAppStreamingOutTemplateResponse> createAppStreamingOutTemplate(CreateAppStreamingOutTemplateRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation as needed.</p>
     * 
     * @param request the request parameters of CreateAppViewTemplate  CreateAppViewTemplateRequest
     * @return CreateAppViewTemplateResponse
     */
    CompletableFuture<CreateAppViewTemplateResponse> createAppViewTemplate(CreateAppViewTemplateRequest request);

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>This operation is used to create a relay rule.</p>
     * <h1>QPS limit</h1>
     * <p>The per-user QPS limit of this operation is 1,000 calls per minute. If the limit is exceeded, API calls will be throttled, which may affect your business. Call the operation properly. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of CreateAutoLiveStreamRule  CreateAutoLiveStreamRuleRequest
     * @return CreateAutoLiveStreamRuleResponse
     */
    CompletableFuture<CreateAutoLiveStreamRuleResponse> createAutoLiveStreamRule(CreateAutoLiveStreamRuleRequest request);

    /**
     * @param request the request parameters of CreateCloudNotePhrases  CreateCloudNotePhrasesRequest
     * @return CreateCloudNotePhrasesResponse
     */
    CompletableFuture<CreateCloudNotePhrasesResponse> createCloudNotePhrases(CreateCloudNotePhrasesRequest request);

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>This operation is used to create a callback for subscribing to room messages. For example, when you create a callback, you can configure parameters such as the callback URL and event type.</p>
     * <h1>QPS limit</h1>
     * <p>The per-user QPS limit of this operation is 1,000 calls per minute. If the limit is exceeded, API calls are throttled, which may affect your business. Make sure that you call this operation at a reasonable frequency. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of CreateEventSubscribe  CreateEventSubscribeRequest
     * @return CreateEventSubscribeResponse
     */
    CompletableFuture<CreateEventSubscribeResponse> createEventSubscribe(CreateEventSubscribeRequest request);

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>This operation creates a bypass live streaming layout. For example, you can configure parameters such as the number of audio mixes and the main pane.</p>
     * <h1>QPS limit</h1>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Make API calls at a reasonable frequency. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of CreateMPULayout  CreateMPULayoutRequest
     * @return CreateMPULayoutResponse
     */
    CompletableFuture<CreateMPULayoutResponse> createMPULayout(CreateMPULayoutRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>The QPS limit per user for this API operation is 10 queries per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of DeleteAppAgentTemplate  DeleteAppAgentTemplateRequest
     * @return DeleteAppAgentTemplateResponse
     */
    CompletableFuture<DeleteAppAgentTemplateResponse> deleteAppAgentTemplate(DeleteAppAgentTemplateRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit per user for this API operation is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of DeleteAppLayout  DeleteAppLayoutRequest
     * @return DeleteAppLayoutResponse
     */
    CompletableFuture<DeleteAppLayoutResponse> deleteAppLayout(DeleteAppLayoutRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>The queries per second (QPS) limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of DeleteAppRecordTemplate  DeleteAppRecordTemplateRequest
     * @return DeleteAppRecordTemplateResponse
     */
    CompletableFuture<DeleteAppRecordTemplateResponse> deleteAppRecordTemplate(DeleteAppRecordTemplateRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation deletes a stream ingest template for an RTC 3.0 application.</p>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of DeleteAppStreamingOutTemplate  DeleteAppStreamingOutTemplateRequest
     * @return DeleteAppStreamingOutTemplateResponse
     */
    CompletableFuture<DeleteAppStreamingOutTemplateResponse> deleteAppStreamingOutTemplate(DeleteAppStreamingOutTemplateRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for this API is 10 calls per second for each user. If you exceed this limit, rate limiting is triggered. This may affect your business. Call this API at a reasonable rate.</p>
     * 
     * @param request the request parameters of DeleteAppViewTemplate  DeleteAppViewTemplateRequest
     * @return DeleteAppViewTemplateResponse
     */
    CompletableFuture<DeleteAppViewTemplateResponse> deleteAppViewTemplate(DeleteAppViewTemplateRequest request);

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/353179.html">CreateAutoLiveStreamRule</a> to create a bypass rule.</p>
     * <h1>QPS limits</h1>
     * <p>The QPS limit for a single user is 1,000 calls per minute. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable frequency. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DeleteAutoLiveStreamRule  DeleteAutoLiveStreamRuleRequest
     * @return DeleteAutoLiveStreamRuleResponse
     */
    CompletableFuture<DeleteAutoLiveStreamRuleResponse> deleteAutoLiveStreamRule(DeleteAutoLiveStreamRuleRequest request);

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>This operation deletes a channel.</p>
     * <h1>QPS limit</h1>
     * <p>This operation has no QPS limit per user. Call this operation as needed. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DeleteChannel  DeleteChannelRequest
     * @return DeleteChannelResponse
     */
    CompletableFuture<DeleteChannelResponse> deleteChannel(DeleteChannelRequest request);

    /**
     * @param request the request parameters of DeleteCloudNotePhrases  DeleteCloudNotePhrasesRequest
     * @return DeleteCloudNotePhrasesResponse
     */
    CompletableFuture<DeleteCloudNotePhrasesResponse> deleteCloudNotePhrases(DeleteCloudNotePhrasesRequest request);

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/274447.html">CreateEventSubscribe</a> to create a callback for subscribing to room messages.</p>
     * <h1>QPS limits</h1>
     * <p>The QPS limit of this operation is 1,000 calls per minute per user. If the limit is exceeded, API calls are throttled, which may affect your business. We recommend that you call this operation at a reasonable rate. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DeleteEventSubscribe  DeleteEventSubscribeRequest
     * @return DeleteEventSubscribeResponse
     */
    CompletableFuture<DeleteEventSubscribeResponse> deleteEventSubscribe(DeleteEventSubscribeRequest request);

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/162192.html">CreateMPULayout</a> to create a bypass live streaming layout.</p>
     * <h1>QPS limits</h1>
     * <p>The per-user QPS limit for this operation is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Make API calls at a reasonable rate. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DeleteMPULayout  DeleteMPULayoutRequest
     * @return DeleteMPULayoutResponse
     */
    CompletableFuture<DeleteMPULayoutResponse> deleteMPULayout(DeleteMPULayoutRequest request);

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/193625.html">AddRecordTemplate</a> to add a recording configuration template.</p>
     * <h1>QPS limits</h1>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation as needed. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DeleteRecordTemplate  DeleteRecordTemplateRequest
     * @return DeleteRecordTemplateResponse
     */
    CompletableFuture<DeleteRecordTemplateResponse> deleteRecordTemplate(DeleteRecordTemplateRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>This API supports a maximum of 10 calls per second per user. If you exceed this limit, rate limiting is applied to your API calls, which may affect your business operations. Use this API judiciously.</p>
     * 
     * @param request the request parameters of DescribeAllCallback  DescribeAllCallbackRequest
     * @return DescribeAllCallbackResponse
     */
    CompletableFuture<DescribeAllCallbackResponse> describeAllCallback(DescribeAllCallbackRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>This API operation supports a maximum of 10 queries per second per user. If you exceed this limit, rate limiting is triggered, which may affect your application. Call this API only as needed.</p>
     * 
     * @param request the request parameters of DescribeAppAgentFunctionStatus  DescribeAppAgentFunctionStatusRequest
     * @return DescribeAppAgentFunctionStatusResponse
     */
    CompletableFuture<DescribeAppAgentFunctionStatusResponse> describeAppAgentFunctionStatus(DescribeAppAgentFunctionStatusRequest request);

    /**
     * <b>description</b> :
     * <h3>Rate limits</h3>
     * <p>The rate limit for this API operation is 10 queries per second (QPS) per user. If you exceed the limit, API calls are throttled, which may affect your business. Call this operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of DescribeAppAgentTemplates  DescribeAppAgentTemplatesRequest
     * @return DescribeAppAgentTemplatesResponse
     */
    CompletableFuture<DescribeAppAgentTemplatesResponse> describeAppAgentTemplates(DescribeAppAgentTemplatesRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>The QPS limit for a single user is 10 queries per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call the API operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of DescribeAppCallStatus  DescribeAppCallStatusRequest
     * @return DescribeAppCallStatusResponse
     */
    CompletableFuture<DescribeAppCallStatusResponse> describeAppCallStatus(DescribeAppCallStatusRequest request);

    /**
     * <b>description</b> :
     * <h3>Queries per second (QPS) limit</h3>
     * <p>The queries per second (QPS) limit for this API is 10 requests per second per user. If the limit is exceeded, API calls will be subject to rate limiting, which may impact your business. Please invoke the API appropriately.</p>
     * 
     * @param request the request parameters of DescribeAppCallbackSecretKey  DescribeAppCallbackSecretKeyRequest
     * @return DescribeAppCallbackSecretKeyResponse
     */
    CompletableFuture<DescribeAppCallbackSecretKeyResponse> describeAppCallbackSecretKey(DescribeAppCallbackSecretKeyRequest request);

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>Before invoking this API, you must have already created an application in the RTC console.  </p>
     * <h3>queries per second (QPS) limit</h3>
     * <p>The QPS limit for this API is 200 requests per minute per user. If the limit is exceeded, API calls will be subject to Rate Limiting, which may Impact your business. Please invoke the API appropriately.</p>
     * 
     * @param request the request parameters of DescribeAppKey  DescribeAppKeyRequest
     * @return DescribeAppKeyResponse
     */
    CompletableFuture<DescribeAppKeyResponse> describeAppKey(DescribeAppKeyRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>This API supports up to 10 queries per second (QPS) per user. Exceeding this limit triggers rate limiting, which may affect your business operations. Use the API judiciously.</p>
     * 
     * @param request the request parameters of DescribeAppLayouts  DescribeAppLayoutsRequest
     * @return DescribeAppLayoutsResponse
     */
    CompletableFuture<DescribeAppLayoutsResponse> describeAppLayouts(DescribeAppLayoutsRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for this API is 10 for each user. API calls that exceed this limit are subject to rate limiting, which may impact your business. We recommend that you call this API at a reasonable rate.</p>
     * 
     * @param request the request parameters of DescribeAppLiveStreamStatus  DescribeAppLiveStreamStatusRequest
     * @return DescribeAppLiveStreamStatusResponse
     */
    CompletableFuture<DescribeAppLiveStreamStatusResponse> describeAppLiveStreamStatus(DescribeAppLiveStreamStatusRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The QPS limit for this operation is 10 calls per second per user. Exceeding this limit triggers rate limiting, which may affect your business. Call this operation only as needed.</p>
     * 
     * @param request the request parameters of DescribeAppRecordStatus  DescribeAppRecordStatusRequest
     * @return DescribeAppRecordStatusResponse
     */
    CompletableFuture<DescribeAppRecordStatusResponse> describeAppRecordStatus(DescribeAppRecordStatusRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user calling this API operation is 10 queries per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this API operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of DescribeAppRecordTemplates  DescribeAppRecordTemplatesRequest
     * @return DescribeAppRecordTemplatesResponse
     */
    CompletableFuture<DescribeAppRecordTemplatesResponse> describeAppRecordTemplates(DescribeAppRecordTemplatesRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The QPS limit for this API is 10 requests per second per user. Exceeding this limit triggers rate limiting, which may affect your service. Call this API only when necessary.</p>
     * 
     * @param request the request parameters of DescribeAppRecordingFiles  DescribeAppRecordingFilesRequest
     * @return DescribeAppRecordingFilesResponse
     */
    CompletableFuture<DescribeAppRecordingFilesResponse> describeAppRecordingFiles(DescribeAppRecordingFilesRequest request);

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to view the list of stream ingest templates for an RTC 3.0 application.  </p>
     * <h3>Queries per second (QPS) limit</h3>
     * <p>The QPS limit for this API is 10 queries per second per user. If this limit is exceeded, API calls will be rate-limited, which may impact your business. Please invoke the API appropriately.</p>
     * 
     * @param request the request parameters of DescribeAppStreamingOutTemplates  DescribeAppStreamingOutTemplatesRequest
     * @return DescribeAppStreamingOutTemplatesResponse
     */
    CompletableFuture<DescribeAppStreamingOutTemplatesResponse> describeAppStreamingOutTemplates(DescribeAppStreamingOutTemplatesRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>This API has a QPS limit of 10 queries per second (QPS) per user. If you exceed this limit, rate limiting is triggered, which can affect your business operations. Call the API at a reasonable rate.</p>
     * 
     * @param request the request parameters of DescribeAppViewStatus  DescribeAppViewStatusRequest
     * @return DescribeAppViewStatusResponse
     */
    CompletableFuture<DescribeAppViewStatusResponse> describeAppViewStatus(DescribeAppViewStatusRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The per-user QPS limit for this operation is 10 calls per second. Exceeding this limit triggers rate limiting, which may affect your business. You should call this operation only as needed.</p>
     * 
     * @param request the request parameters of DescribeAppViewTemplates  DescribeAppViewTemplatesRequest
     * @return DescribeAppViewTemplatesResponse
     */
    CompletableFuture<DescribeAppViewTemplatesResponse> describeAppViewTemplates(DescribeAppViewTemplatesRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation queries the list of applications. For example, you can obtain data such as the application ID, application name, and application type from the query results.</p>
     * <h3>QPS limits</h3>
     * <p>The QPS limit for a single user is 200 calls per minute. If this limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of DescribeApps  DescribeAppsRequest
     * @return DescribeAppsResponse
     */
    CompletableFuture<DescribeAppsResponse> describeApps(DescribeAppsRequest request);

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/353179.html">CreateAutoLiveStreamRule</a> to create a bypass rule.</p>
     * <h1>QPS limit</h1>
     * <p>The QPS limit for a single user is 1,000 calls per minute. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable frequency. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeAutoLiveStreamRule  DescribeAutoLiveStreamRuleRequest
     * @return DescribeAutoLiveStreamRuleResponse
     */
    CompletableFuture<DescribeAutoLiveStreamRuleResponse> describeAutoLiveStreamRule(DescribeAutoLiveStreamRuleRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation queries the details of a single communication session. For example, you can query the communication status and user details.</p>
     * <h3>QPS limit</h3>
     * <p>The QPS limit per user for this operation is 10 queries per second. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable frequency.</p>
     * 
     * @param request the request parameters of DescribeCall  DescribeCallRequest
     * @return DescribeCallResponse
     */
    CompletableFuture<DescribeCallResponse> describeCall(DescribeCallRequest request);

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to query communication records created within a specified time range. For example, you can query information such as call duration, status, and user count.  </p>
     * <h3>Rate Limiting</h3>
     * <p>The queries per second (QPS) limit for this API is 10 calls per second per user. If this limit is exceeded, API calls will be rate-limited, which may impact your business. Please invoke the API appropriately.</p>
     * 
     * @param request the request parameters of DescribeCallList  DescribeCallListRequest
     * @return DescribeCallListResponse
     */
    CompletableFuture<DescribeCallListResponse> describeCallList(DescribeCallListRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>This API supports up to 10 queries per second (QPS) per user. If you exceed this limit, the system applies rate limiting to your API calls, which may affect your business operations. Plan your API calls accordingly.</p>
     * 
     * @param request the request parameters of DescribeCallbacks  DescribeCallbacksRequest
     * @return DescribeCallbacksResponse
     */
    CompletableFuture<DescribeCallbacksResponse> describeCallbacks(DescribeCallbacksRequest request);

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to query online channel information.  </p>
     * <h3>queries per second (QPS) Limit</h3>
     * <p>The QPS limit for this API is 10 queries per second per user. If the limit is exceeded, Rate Limiting will be applied to your API Call, which may Impact your business. Please invoke the API reasonably.</p>
     * 
     * @param request the request parameters of DescribeChannel  DescribeChannelRequest
     * @return DescribeChannelResponse
     */
    CompletableFuture<DescribeChannelResponse> describeChannel(DescribeChannelRequest request);

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to query the list of users in an online channel.  </p>
     * <h3>QPS Limit</h3>
     * <p>The queries per second (QPS) limit for this API is 10 requests per second per user. If the limit is exceeded, API calls will be subject to rate limiting, which may impact your business. Invoke this API appropriately.</p>
     * 
     * @param request the request parameters of DescribeChannelAllUsers  DescribeChannelAllUsersRequest
     * @return DescribeChannelAllUsersResponse
     */
    CompletableFuture<DescribeChannelAllUsersResponse> describeChannelAllUsers(DescribeChannelAllUsersRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation retrieves the regional distribution statistics of a channel.</p>
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit per user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Plan your API calls accordingly.</p>
     * 
     * @param request the request parameters of DescribeChannelAreaDistributionStatData  DescribeChannelAreaDistributionStatDataRequest
     * @return DescribeChannelAreaDistributionStatDataResponse
     */
    CompletableFuture<DescribeChannelAreaDistributionStatDataResponse> describeChannelAreaDistributionStatData(DescribeChannelAreaDistributionStatDataRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation queries the channel distribution statistics. You can query the statistics by dimension, such as operating system type or SDK version.</p>
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for a single user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of DescribeChannelDistributionStatData  DescribeChannelDistributionStatDataRequest
     * @return DescribeChannelDistributionStatDataResponse
     */
    CompletableFuture<DescribeChannelDistributionStatDataResponse> describeChannelDistributionStatData(DescribeChannelDistributionStatDataRequest request);

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to query channel overview data. For example, you can query basic communication information, Trend Indicators, and other information.  </p>
     * <h3>queries per second (QPS) Limit</h3>
     * <p>The QPS limit for this API is 10 queries per second per User. If the limit is exceeded, Rate Limiting will be applied to API Calls, which may Impact your business. Invoke the API appropriately.</p>
     * 
     * @param request the request parameters of DescribeChannelOverallData  DescribeChannelOverallDataRequest
     * @return DescribeChannelOverallDataResponse
     */
    CompletableFuture<DescribeChannelOverallDataResponse> describeChannelOverallData(DescribeChannelOverallDataRequest request);

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>This operation queries the list of online users in a channel, excluding detailed user information.</p>
     * <h1>QPS limit</h1>
     * <p>The QPS limit for a single user is 1,000 calls per minute. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls appropriately. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeChannelParticipants  DescribeChannelParticipantsRequest
     * @return DescribeChannelParticipantsResponse
     */
    CompletableFuture<DescribeChannelParticipantsResponse> describeChannelParticipants(DescribeChannelParticipantsRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation retrieves the list of publishing users in a channel in descending order of online duration. For example, you can query information such as the time when a user joined the call and the communication duration from the user list.</p>
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for a single user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of DescribeChannelTopPubUserList  DescribeChannelTopPubUserListRequest
     * @return DescribeChannelTopPubUserListResponse
     */
    CompletableFuture<DescribeChannelTopPubUserListResponse> describeChannelTopPubUserList(DescribeChannelTopPubUserListRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation queries the information of a user in an online channel.</p>
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit per user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call the operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of DescribeChannelUser  DescribeChannelUserRequest
     * @return DescribeChannelUserResponse
     */
    CompletableFuture<DescribeChannelUserResponse> describeChannelUser(DescribeChannelUserRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation queries the user data in the channel overview. For example, you can query metric data details and overview data.</p>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable frequency.</p>
     * 
     * @param request the request parameters of DescribeChannelUserMetrics  DescribeChannelUserMetricsRequest
     * @return DescribeChannelUserMetricsResponse
     */
    CompletableFuture<DescribeChannelUserMetricsResponse> describeChannelUserMetrics(DescribeChannelUserMetricsRequest request);

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>This operation queries the details of online users in a channel. For example, you can query the total number of users in communication mode and live streaming mode.</p>
     * <h1>QPS limit</h1>
     * <p>The queries per second (QPS) limit for a single user is 100 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call the operation at a reasonable frequency. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeChannelUsers  DescribeChannelUsersRequest
     * @return DescribeChannelUsersResponse
     */
    CompletableFuture<DescribeChannelUsersResponse> describeChannelUsers(DescribeChannelUsersRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation queries all active channels under a single AppId.</p>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 10 queries per second. If the limit is exceeded, API calls are throttled, which may affect your services. Make API calls at a reasonable rate.</p>
     * 
     * @param request the request parameters of DescribeChannels  DescribeChannelsRequest
     * @return DescribeChannelsResponse
     */
    CompletableFuture<DescribeChannelsResponse> describeChannels(DescribeChannelsRequest request);

    /**
     * @param request the request parameters of DescribeCloudNotePhrases  DescribeCloudNotePhrasesRequest
     * @return DescribeCloudNotePhrasesResponse
     */
    CompletableFuture<DescribeCloudNotePhrasesResponse> describeCloudNotePhrases(DescribeCloudNotePhrasesRequest request);

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to query the list of meeting summary job files that have generated summary results.  </p>
     * <h3>Queries Per Second (QPS) Limit</h3>
     * <p>The QPS limit for this API is 10 queries per second (QPS) per user. If this limit is exceeded, API calls will be subject to Rate Limiting, which may Impact your business. Please invoke the API appropriately.</p>
     * 
     * @param request the request parameters of DescribeCloudNotes  DescribeCloudNotesRequest
     * @return DescribeCloudNotesResponse
     */
    CompletableFuture<DescribeCloudNotesResponse> describeCloudNotes(DescribeCloudNotesRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit per user for this API operation is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of DescribeCloudRecordStatus  DescribeCloudRecordStatusRequest
     * @return DescribeCloudRecordStatusResponse
     */
    CompletableFuture<DescribeCloudRecordStatusResponse> describeCloudRecordStatus(DescribeCloudRecordStatusRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation retrieves a list of end-to-end user events. For example, you can obtain information such as the event name and event type from the event list.</p>
     * <h3>QPS limits</h3>
     * <p>The QPS limit per user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of DescribeEndPointEventList  DescribeEndPointEventListRequest
     * @return DescribeEndPointEventListResponse
     */
    CompletableFuture<DescribeEndPointEventListResponse> describeEndPointEventList(DescribeEndPointEventListRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation retrieves end-to-end metric data. For example, you can retrieve metric information for subscribers and publishers.</p>
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for a single user is 10. If the number of calls per second exceeds the limit, throttling is triggered, which may affect your business. Make API calls at a reasonable frequency.</p>
     * 
     * @param request the request parameters of DescribeEndPointMetricData  DescribeEndPointMetricDataRequest
     * @return DescribeEndPointMetricDataResponse
     */
    CompletableFuture<DescribeEndPointMetricDataResponse> describeEndPointMetricData(DescribeEndPointMetricDataRequest request);

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to retrieve the distribution of factors impacting abnormal diagnosis. When using this API, you can query data from the last 48 hours, with each query covering a time range of no more than 24 hours.</p>
     * <h3>QPS Limit</h3>
     * <p>The queries per second (QPS) limit for this API is 10 per user. If this limit is exceeded, API calls will be subject to rate limiting, which may impact your service. Please call the API responsibly.</p>
     * 
     * @param request the request parameters of DescribeFaultDiagnosisFactorDistributionStat  DescribeFaultDiagnosisFactorDistributionStatRequest
     * @return DescribeFaultDiagnosisFactorDistributionStatResponse
     */
    CompletableFuture<DescribeFaultDiagnosisFactorDistributionStatResponse> describeFaultDiagnosisFactorDistributionStat(DescribeFaultDiagnosisFactorDistributionStatRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation retrieves the overview data of exception diagnostics. When you call this operation, you can query data from the last 48 hours, and the query time range cannot exceed 24 hours.</p>
     * <h3>QPS limits</h3>
     * <p>The queries per second (QPS) limit on this operation is 10 per user. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation as needed.</p>
     * 
     * @param request the request parameters of DescribeFaultDiagnosisOverallData  DescribeFaultDiagnosisOverallDataRequest
     * @return DescribeFaultDiagnosisOverallDataResponse
     */
    CompletableFuture<DescribeFaultDiagnosisOverallDataResponse> describeFaultDiagnosisOverallData(DescribeFaultDiagnosisOverallDataRequest request);

    /**
     * <b>description</b> :
     * <p>[responses_200_schema_properties_UserDetail_properties_CreatedTs_description]Call creation time, represented as a UNIX timestamp in seconds.</p>
     * 
     * @param request the request parameters of DescribeFaultDiagnosisUserDetail  DescribeFaultDiagnosisUserDetailRequest
     * @return DescribeFaultDiagnosisUserDetailResponse
     */
    CompletableFuture<DescribeFaultDiagnosisUserDetailResponse> describeFaultDiagnosisUserDetail(DescribeFaultDiagnosisUserDetailRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation is used to retrieve the detailed user list for fault diagnosis. When you call this operation, you can query data from the last 48 hours, and the query time range cannot exceed 24 hours.</p>
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for a single user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of DescribeFaultDiagnosisUserList  DescribeFaultDiagnosisUserListRequest
     * @return DescribeFaultDiagnosisUserListResponse
     */
    CompletableFuture<DescribeFaultDiagnosisUserListResponse> describeFaultDiagnosisUserList(DescribeFaultDiagnosisUserListRequest request);

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before calling this operation, call <a href="https://help.aliyun.com/document_detail/162192.html">CreateMPULayout</a> to create a bypass live streaming layout.</p>
     * <h1>QPS limit</h1>
     * <p>The per-user QPS limit for this operation is 10 calls per second. Exceeding this limit triggers rate limiting, which may affect your business. Call this operation appropriately. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeMPULayoutInfoList  DescribeMPULayoutInfoListRequest
     * @return DescribeMPULayoutInfoListResponse
     */
    CompletableFuture<DescribeMPULayoutInfoListResponse> describeMPULayoutInfoList(DescribeMPULayoutInfoListRequest request);

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to obtain the list of publishing users in a communication session based on the subscriber. For example, you can retrieve detailed information about both the subscriber and the publishing users.  </p>
     * <h3>queries per second (QPS) Limit</h3>
     * <p>The QPS limit for this API is 10 requests per second per user. If this limit is exceeded, API calls will be subject to rate limiting, which may affect your business. Please invoke the API appropriately.</p>
     * 
     * @param request the request parameters of DescribePubUserListBySubUser  DescribePubUserListBySubUserRequest
     * @return DescribePubUserListBySubUserResponse
     */
    CompletableFuture<DescribePubUserListBySubUserResponse> describePubUserListBySubUser(DescribePubUserListBySubUserRequest request);

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to obtain the downlink experience quality metrics of a user in a single communication session. For example, you can retrieve information such as the metric types that impact communication experience and audio/video trend indicators.  </p>
     * <h3>QPS Limit</h3>
     * <p>The queries per second (QPS) limit for this API is 10 per user. If this limit is exceeded, API calls will be subject to rate limiting, which may affect your business. Please invoke the API appropriately.</p>
     * 
     * @param request the request parameters of DescribeQoeMetricData  DescribeQoeMetricDataRequest
     * @return DescribeQoeMetricDataResponse
     */
    CompletableFuture<DescribeQoeMetricDataResponse> describeQoeMetricData(DescribeQoeMetricDataRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation queries the regional distribution data of quality statistics. When you call this operation, the following limits apply:</p>
     * <ul>
     * <li>You can query data within any time range in the last 365 days, excluding the current day.</li>
     * <li>If the query time range is less than 24 hours, the data is aggregated by hour. If the query time range is 24 hours or more, the data is aggregated by day.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for a single user is 10. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable frequency.</p>
     * 
     * @param request the request parameters of DescribeQualityAreaDistributionStatData  DescribeQualityAreaDistributionStatDataRequest
     * @return DescribeQualityAreaDistributionStatDataResponse
     */
    CompletableFuture<DescribeQualityAreaDistributionStatDataResponse> describeQualityAreaDistributionStatData(DescribeQualityAreaDistributionStatDataRequest request);

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to obtain the distribution data of quality statistics. The following limits apply when using this API:</p>
     * <ul>
     * <li>You can query data for any period within the last 365 days (excluding the current day).</li>
     * <li>If the query range is less than 24 hours, the data is aggregated by hour. If the query range is greater than or equal to 24 hours, the data is aggregated by day.</li>
     * </ul>
     * <h3>Queries per second (QPS) limit</h3>
     * <p>The QPS limit for this API is 10 queries per second (QPS) per user. If you exceed this limit, your API calls will be subject to Rate Limiting, which may Impact your business. Please invoke the API reasonably.</p>
     * 
     * @param request the request parameters of DescribeQualityDistributionStatData  DescribeQualityDistributionStatDataRequest
     * @return DescribeQualityDistributionStatDataResponse
     */
    CompletableFuture<DescribeQualityDistributionStatDataResponse> describeQualityDistributionStatData(DescribeQualityDistributionStatDataRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation retrieves the distribution data of operating systems and SDK versions in quality statistics. The following limits apply when you call this operation:</p>
     * <ul>
     * <li>You can query data within the last 365 days, excluding the current day.</li>
     * <li>If the query time range is less than 24 hours, the data is aggregated by hour. If the query time range is 24 hours or more, the data is aggregated by day.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable frequency.</p>
     * 
     * @param request the request parameters of DescribeQualityOsSdkVersionDistributionStatData  DescribeQualityOsSdkVersionDistributionStatDataRequest
     * @return DescribeQualityOsSdkVersionDistributionStatDataResponse
     */
    CompletableFuture<DescribeQualityOsSdkVersionDistributionStatDataResponse> describeQualityOsSdkVersionDistributionStatData(DescribeQualityOsSdkVersionDistributionStatDataRequest request);

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to obtain overview data of quality statistics. The following restrictions apply when using this API:  </p>
     * <ul>
     * <li>You can query data for any time range within the last 365 days (excluding the current day).  </li>
     * <li>If the query range is less than 24 hours, the data is aggregated by hour. If the query range is greater than or equal to 24 hours, the data is aggregated by day.</li>
     * </ul>
     * <h3>queries per second (QPS) Limit</h3>
     * <p>The QPS limit for this API is 10 queries per second per user. If you exceed this limit, your API calls will be subject to Rate Limiting, which may Impact your business. Please invoke the API appropriately.</p>
     * 
     * @param request the request parameters of DescribeQualityOverallData  DescribeQualityOverallDataRequest
     * @return DescribeQualityOverallDataResponse
     */
    CompletableFuture<DescribeQualityOverallDataResponse> describeQualityOverallData(DescribeQualityOverallDataRequest request);

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>This operation is used to query the list of files generated by recording. For example, you can query parameters such as the creation time and recording duration of files generated by recording.</p>
     * <h1>QPS limit</h1>
     * <p>The per-user QPS limit of this operation is 10 calls per second. If the limit is exceeded, API calls will be throttled, which may affect your business. Please call this operation reasonably. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of DescribeRecordFiles  DescribeRecordFilesRequest
     * @return DescribeRecordFilesResponse
     */
    CompletableFuture<DescribeRecordFilesResponse> describeRecordFiles(DescribeRecordFilesRequest request);

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/193625.html">AddRecordTemplate</a> to add a recording template.</p>
     * <h1>QPS limit</h1>
     * <p>The QPS limit for a single user is 100 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable rate. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeRecordTemplates  DescribeRecordTemplatesRequest
     * @return DescribeRecordTemplatesResponse
     */
    CompletableFuture<DescribeRecordTemplatesResponse> describeRecordTemplates(DescribeRecordTemplatesRequest request);

    /**
     * @param request the request parameters of DescribeRtcChannelList  DescribeRtcChannelListRequest
     * @return DescribeRtcChannelListResponse
     */
    CompletableFuture<DescribeRtcChannelListResponse> describeRtcChannelList(DescribeRtcChannelListRequest request);

    /**
     * @param request the request parameters of DescribeRtcChannelMetric  DescribeRtcChannelMetricRequest
     * @return DescribeRtcChannelMetricResponse
     */
    CompletableFuture<DescribeRtcChannelMetricResponse> describeRtcChannelMetric(DescribeRtcChannelMetricRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The maximum query time range is 30 days.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeRtcDurationData  DescribeRtcDurationDataRequest
     * @return DescribeRtcDurationDataResponse
     */
    CompletableFuture<DescribeRtcDurationDataResponse> describeRtcDurationData(DescribeRtcDurationDataRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The maximum time range that can be queried is 30 days.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeRtcPeakChannelCntData  DescribeRtcPeakChannelCntDataRequest
     * @return DescribeRtcPeakChannelCntDataResponse
     */
    CompletableFuture<DescribeRtcPeakChannelCntDataResponse> describeRtcPeakChannelCntData(DescribeRtcPeakChannelCntDataRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The maximum time span between the start time and the end time of a data query is 30 days.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeRtcUserCntData  DescribeRtcUserCntDataRequest
     * @return DescribeRtcUserCntDataResponse
     */
    CompletableFuture<DescribeRtcUserCntDataResponse> describeRtcUserCntData(DescribeRtcUserCntDataRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The QPS limit per user for this API operation is 10 queries per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of DescribeStreamingOutStatus  DescribeStreamingOutStatusRequest
     * @return DescribeStreamingOutStatusResponse
     */
    CompletableFuture<DescribeStreamingOutStatusResponse> describeStreamingOutStatus(DescribeStreamingOutStatusRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The per-user QPS limit for this API is 10 calls per second. Exceeding this limit triggers rate limiting, which may affect your business. Call the API responsibly.</p>
     * 
     * @param request the request parameters of DescribeSystemLayoutList  DescribeSystemLayoutListRequest
     * @return DescribeSystemLayoutListResponse
     */
    CompletableFuture<DescribeSystemLayoutListResponse> describeSystemLayoutList(DescribeSystemLayoutListRequest request);

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to retrieve the regional distribution data of usage statistics. The following restrictions apply when using this API:</p>
     * <ul>
     * <li>You can query data for any period within the last 365 days (excluding the current day).</li>
     * <li>If the query range is less than 24 hours, the data is aggregated by hour. If the query range is greater than or equal to 24 hours, the data is aggregated by day.</li>
     * </ul>
     * <h3>QPS Limit</h3>
     * <p>The queries per second (QPS) limit for this API is 10 requests per second per user. If you exceed this limit, your API calls will be subject to rate limiting, which may impact your business. Please invoke the API appropriately.</p>
     * 
     * @param request the request parameters of DescribeUsageAreaDistributionStatData  DescribeUsageAreaDistributionStatDataRequest
     * @return DescribeUsageAreaDistributionStatDataResponse
     */
    CompletableFuture<DescribeUsageAreaDistributionStatDataResponse> describeUsageAreaDistributionStatData(DescribeUsageAreaDistributionStatDataRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation queries the distribution data of usage statistics. When you call this operation, the following limits apply:</p>
     * <ul>
     * <li>You can query data within any time range in the last 365 days, excluding the current day.</li>
     * <li>If the query time range is less than 24 hours, the data is aggregated by hour. If the query time range is 24 hours or more, the data is aggregated by day.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for a single user is 10. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable rate.</p>
     * 
     * @param request the request parameters of DescribeUsageDistributionStatData  DescribeUsageDistributionStatDataRequest
     * @return DescribeUsageDistributionStatDataResponse
     */
    CompletableFuture<DescribeUsageDistributionStatDataResponse> describeUsageDistributionStatData(DescribeUsageDistributionStatDataRequest request);

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to obtain the distribution data of operating systems and SDK versions in usage statistics. When using this API, the following restrictions apply:  </p>
     * <ul>
     * <li>You can query data for any period within the last 365 days (excluding the current day).  </li>
     * <li>If the query range is less than 24 hours, the data is aggregated by hour. If the query range is greater than or equal to 24 hours, the data is aggregated by day.</li>
     * </ul>
     * <h3>Rate Limiting</h3>
     * <p>The queries per second (QPS) limit for this API is 10 requests per second per user. If you exceed this limit, your API calls will be rate-limited, which may impact your business. Please invoke the API appropriately.</p>
     * 
     * @param request the request parameters of DescribeUsageOsSdkVersionDistributionStatData  DescribeUsageOsSdkVersionDistributionStatDataRequest
     * @return DescribeUsageOsSdkVersionDistributionStatDataResponse
     */
    CompletableFuture<DescribeUsageOsSdkVersionDistributionStatDataResponse> describeUsageOsSdkVersionDistributionStatData(DescribeUsageOsSdkVersionDistributionStatDataRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation retrieves the overview data of usage statistics. The following limits apply when you call this operation:</p>
     * <ul>
     * <li>You can query data for any time range within the last 365 days, excluding the current day.</li>
     * <li>If the query time range is less than 24 hours, the data is aggregated by hour. If the query time range is 24 hours or more, the data is aggregated by day.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable rate.</p>
     * 
     * @param request the request parameters of DescribeUsageOverallData  DescribeUsageOverallDataRequest
     * @return DescribeUsageOverallDataResponse
     */
    CompletableFuture<DescribeUsageOverallDataResponse> describeUsageOverallData(DescribeUsageOverallDataRequest request);

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>This operation is used to query the real-time information of a user in a channel. For example, you can query information such as the user role type and the time of joining the meeting.</p>
     * <h1>QPS limit</h1>
     * <p>The per-user QPS limit of this operation is 100 times per second. If the limit is exceeded, API calls will be throttled, which may affect your business. Call this operation properly. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of DescribeUserInfoInChannel  DescribeUserInfoInChannelRequest
     * @return DescribeUserInfoInChannelResponse
     */
    CompletableFuture<DescribeUserInfoInChannelResponse> describeUserInfoInChannel(DescribeUserInfoInChannelRequest request);

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/353179.html">CreateAutoLiveStreamRule</a> to create a bypass rule.</p>
     * <h1>QPS limit</h1>
     * <p>The QPS limit per user is 1,000 requests per minute. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable rate. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of DisableAutoLiveStreamRule  DisableAutoLiveStreamRuleRequest
     * @return DisableAutoLiveStreamRuleResponse
     */
    CompletableFuture<DisableAutoLiveStreamRuleResponse> disableAutoLiveStreamRule(DisableAutoLiveStreamRuleRequest request);

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/353179.html">CreateAutoLiveStreamRule</a> to create a bypass rule.</p>
     * <h1>QPS limit</h1>
     * <p>The QPS limit per user for this operation is 1,000 calls per minute. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable rate. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of EnableAutoLiveStreamRule  EnableAutoLiveStreamRuleRequest
     * @return EnableAutoLiveStreamRuleResponse
     */
    CompletableFuture<EnableAutoLiveStreamRuleResponse> enableAutoLiveStreamRule(EnableAutoLiveStreamRuleRequest request);

    /**
     * @param request the request parameters of GetAgent  GetAgentRequest
     * @return GetAgentResponse
     */
    CompletableFuture<GetAgentResponse> getAgent(GetAgentRequest request);

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/93183.html">StartMpuTask</a> to start a bypass transcoding task.</p>
     * <h1>QPS limit</h1>
     * <p>The QPS limit for a single user is 4,000 calls per minute. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable rate. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of GetMPUTaskStatus  GetMPUTaskStatusRequest
     * @return GetMPUTaskStatusResponse
     */
    CompletableFuture<GetMPUTaskStatusResponse> getMPUTaskStatus(GetMPUTaskStatusRequest request);

    /**
     * <b>description</b> :
     * <h4>Usage notes</h4>
     * <p>This operation modifies the name of a specified application.</p>
     * <h4>QPS limit</h4>
     * <p>The queries per second (QPS) limit per user for this operation is 200 calls per minute. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of ModifyApp  ModifyAppRequest
     * @return ModifyAppResponse
     */
    CompletableFuture<ModifyAppResponse> modifyApp(ModifyAppRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>The queries per second (QPS) limit per user for this API operation is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of ModifyAppAgentFunctionStatus  ModifyAppAgentFunctionStatusRequest
     * @return ModifyAppAgentFunctionStatusResponse
     */
    CompletableFuture<ModifyAppAgentFunctionStatusResponse> modifyAppAgentFunctionStatus(ModifyAppAgentFunctionStatusRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call the API at a reasonable rate.</p>
     * 
     * @param request the request parameters of ModifyAppAgentTemplate  ModifyAppAgentTemplateRequest
     * @return ModifyAppAgentTemplateResponse
     */
    CompletableFuture<ModifyAppAgentTemplateResponse> modifyAppAgentTemplate(ModifyAppAgentTemplateRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>The QPS limit per user for this API operation is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable rate.</p>
     * 
     * @param request the request parameters of ModifyAppCallbackStatus  ModifyAppCallbackStatusRequest
     * @return ModifyAppCallbackStatusResponse
     */
    CompletableFuture<ModifyAppCallbackStatusResponse> modifyAppCallbackStatus(ModifyAppCallbackStatusRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>This API supports a maximum of 10 calls per second per user. Exceeding this limit triggers rate limiting, which may impact your business operations. Use the API judiciously.</p>
     * 
     * @param request the request parameters of ModifyAppLayout  ModifyAppLayoutRequest
     * @return ModifyAppLayoutResponse
     */
    CompletableFuture<ModifyAppLayoutResponse> modifyAppLayout(ModifyAppLayoutRequest request);

    /**
     * <b>description</b> :
     * <h3>Queries per second (QPS) limit</h3>
     * <p>The queries per second (QPS) limit for this API is 10 per user per second. If the limit is exceeded, API calls will be subject to Rate Limiting, which may impact your business. Please invoke the API appropriately.</p>
     * 
     * @param request the request parameters of ModifyAppLiveStreamStatus  ModifyAppLiveStreamStatusRequest
     * @return ModifyAppLiveStreamStatusResponse
     */
    CompletableFuture<ModifyAppLiveStreamStatusResponse> modifyAppLiveStreamStatus(ModifyAppLiveStreamStatusRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit per user for this API operation is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of ModifyAppRecordStatus  ModifyAppRecordStatusRequest
     * @return ModifyAppRecordStatusResponse
     */
    CompletableFuture<ModifyAppRecordStatusResponse> modifyAppRecordStatus(ModifyAppRecordStatusRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>This API supports up to 10 calls per second per user. If you exceed this limit, rate limiting is triggered, which might affect your service. Call the API at a reasonable frequency.</p>
     * 
     * @param request the request parameters of ModifyAppRecordTemplate  ModifyAppRecordTemplateRequest
     * @return ModifyAppRecordTemplateResponse
     */
    CompletableFuture<ModifyAppRecordTemplateResponse> modifyAppRecordTemplate(ModifyAppRecordTemplateRequest request);

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API modifies the stream ingest template for an RTC 3.0 application.  </p>
     * <h3>QPS Limit</h3>
     * <p>The queries per second (QPS) limit for this API is 10 per user. If you exceed this limit, your API calls will be subject to rate limiting, which may impact your business. Please invoke the API appropriately.</p>
     * 
     * @param request the request parameters of ModifyAppStreamingOutTemplate  ModifyAppStreamingOutTemplateRequest
     * @return ModifyAppStreamingOutTemplateResponse
     */
    CompletableFuture<ModifyAppStreamingOutTemplateResponse> modifyAppStreamingOutTemplate(ModifyAppStreamingOutTemplateRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>The queries per second (QPS) limit for a single user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of ModifyAppViewStatus  ModifyAppViewStatusRequest
     * @return ModifyAppViewStatusResponse
     */
    CompletableFuture<ModifyAppViewStatusResponse> modifyAppViewStatus(ModifyAppViewStatusRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>This API supports up to 10 calls per second per user. Exceeding this limit triggers rate limiting, which may affect your business. Use this API with caution.</p>
     * 
     * @param request the request parameters of ModifyAppViewTemplate  ModifyAppViewTemplateRequest
     * @return ModifyAppViewTemplateResponse
     */
    CompletableFuture<ModifyAppViewTemplateResponse> modifyAppViewTemplate(ModifyAppViewTemplateRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call the API at a reasonable frequency.</p>
     * 
     * @param request the request parameters of ModifyCallbackMeta  ModifyCallbackMetaRequest
     * @return ModifyCallbackMetaResponse
     */
    CompletableFuture<ModifyCallbackMetaResponse> modifyCallbackMeta(ModifyCallbackMetaRequest request);

    /**
     * @param request the request parameters of ModifyCloudNotePhrases  ModifyCloudNotePhrasesRequest
     * @return ModifyCloudNotePhrasesResponse
     */
    CompletableFuture<ModifyCloudNotePhrasesResponse> modifyCloudNotePhrases(ModifyCloudNotePhrasesRequest request);

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/162192.html">CreateMPULayout</a> to create a bypass live streaming layout.</p>
     * <h1>QPS limit</h1>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Make API calls at a reasonable rate. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of ModifyMPULayout  ModifyMPULayoutRequest
     * @return ModifyMPULayoutResponse
     */
    CompletableFuture<ModifyMPULayoutResponse> modifyMPULayout(ModifyMPULayoutRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 10 queries per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of ModifyStreamingProperty  ModifyStreamingPropertyRequest
     * @return ModifyStreamingPropertyResponse
     */
    CompletableFuture<ModifyStreamingPropertyResponse> modifyStreamingProperty(ModifyStreamingPropertyRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The QPS limit per user is 10 calls per second. If this limit is exceeded, API calls are throttled, which may affect your services. Call the API at a reasonable rate.</p>
     * 
     * @param request the request parameters of ModifyViewLayout  ModifyViewLayoutRequest
     * @return ModifyViewLayoutResponse
     */
    CompletableFuture<ModifyViewLayoutResponse> modifyViewLayout(ModifyViewLayoutRequest request);

    /**
     * @param request the request parameters of NotifyAgent  NotifyAgentRequest
     * @return NotifyAgentResponse
     */
    CompletableFuture<NotifyAgentResponse> notifyAgent(NotifyAgentRequest request);

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>This API removes specified end users from a channel.</p>
     * <h1>QPS limit</h1>
     * <p>The queries per second (QPS) limit for this API is 1,000 calls per minute per user. If you exceed the limit, API calls are subject to rate limiting, which may affect your business. Call this API at a reasonable rate. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of RemoveTerminals  RemoveTerminalsRequest
     * @return RemoveTerminalsResponse
     */
    CompletableFuture<RemoveTerminalsResponse> removeTerminals(RemoveTerminalsRequest request);

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to kick users out of an online channel.  </p>
     * <h3>queries per second (QPS) Limit</h3>
     * <p>The QPS limit for this API is 10 requests per second per user. If the limit is exceeded, API calls will be subject to Rate Limiting, which may Impact your business. Please invoke the API appropriately.</p>
     * 
     * @param request the request parameters of RemoveUsers  RemoveUsersRequest
     * @return RemoveUsersResponse
     */
    CompletableFuture<RemoveUsersResponse> removeUsers(RemoveUsersRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for this API is 10 per user. If you exceed this limit, API calls are subject to rate limiting, which may affect your business. Call this API at a reasonable frequency.</p>
     * 
     * @param request the request parameters of RtcCancelSipInvite  RtcCancelSipInviteRequest
     * @return RtcCancelSipInviteResponse
     */
    CompletableFuture<RtcCancelSipInviteResponse> rtcCancelSipInvite(RtcCancelSipInviteRequest request);

    /**
     * @param request the request parameters of RtcSendSipDtmf  RtcSendSipDtmfRequest
     * @return RtcSendSipDtmfResponse
     */
    CompletableFuture<RtcSendSipDtmfResponse> rtcSendSipDtmf(RtcSendSipDtmfRequest request);

    /**
     * <b>description</b> :
     * <h3>Rate limit</h3>
     * <p>The queries per second (QPS) limit for a single user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of RtcSipInviteMember  RtcSipInviteMemberRequest
     * @return RtcSipInviteMemberResponse
     */
    CompletableFuture<RtcSipInviteMemberResponse> rtcSipInviteMember(RtcSipInviteMemberRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of RtcSipMute  RtcSipMuteRequest
     * @return RtcSipMuteResponse
     */
    CompletableFuture<RtcSipMuteResponse> rtcSipMute(RtcSipMuteRequest request);

    /**
     * @param request the request parameters of StartAgent  StartAgentRequest
     * @return StartAgentResponse
     */
    CompletableFuture<StartAgentResponse> startAgent(StartAgentRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>The queries per second (QPS) limit for this API is 10 calls per second per user. If you exceed the limit, API calls are subject to rate limiting, which may affect your business. Call the API at a reasonable rate.</p>
     * 
     * @param request the request parameters of StartCategoryCallback  StartCategoryCallbackRequest
     * @return StartCategoryCallbackResponse
     */
    CompletableFuture<StartCategoryCallbackResponse> startCategoryCallback(StartCategoryCallbackRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation starts a meeting minutes task for an online channel. If you need meeting minutes and subtitles, enable all features.</p>
     * <h3>QPS limits</h3>
     * <p>The queries per second (QPS) limit per user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call the operation at a reasonable frequency.</p>
     * <blockquote>
     * <p>Concurrency limits</p>
     * <ul>
     * <li>Only one meeting minutes task can run in the same channel at a time.</li>
     * <li>You can start and stop meeting minutes tasks multiple times in the same channel, but the TaskId must be different each time.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of StartCloudNote  StartCloudNoteRequest
     * @return StartCloudNoteResponse
     */
    CompletableFuture<StartCloudNoteResponse> startCloudNote(StartCloudNoteRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation starts a cloud recording task for an online channel.</p>
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for a single user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of StartCloudRecord  StartCloudRecordRequest
     * @return StartCloudRecordResponse
     */
    CompletableFuture<StartCloudRecordResponse> startCloudRecord(StartCloudRecordRequest request);

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>This operation is used to start a bypass relaying task. When you use the bypass relaying service, ApsaraVideo Live has the following limits:
     * &lt;props=&quot;china&quot;&gt;- For the concurrency limit on tasks, see <a href="https://help.aliyun.com/document_detail/71050.html#section-eaz-anq-a47">Concurrency limits</a>. If you have special requirements, <a href="https://selfservice.console.aliyun.com/ticket/createIndex">submit a ticket</a> two weeks in advance.
     * &lt;props=&quot;intl&quot;&gt;- For the concurrency limit on tasks, see <a href="https://www.alibabacloud.com/help/rtc-61399/latest/60e652#section-eaz-anq-a47">Concurrency limits</a>. If you have special requirements, <a href="https://workorder-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a> two weeks in advance.</p>
     * <ul>
     * <li>If the transcoding feature is disabled, each account can concurrently push up to 20 original-quality live streams per live streaming accelerated domain name by default. If you have special requirements, <a href="https://selfservice.console.aliyun.com/ticket/createIndex">submit a ticket</a>.</li>
     * <li>If the transcoding feature is enabled, each account can concurrently push up to 10 transcoded live streams per live streaming accelerated domain name by default. If you have special requirements, <a href="https://selfservice.console.aliyun.com/ticket/createIndex">submit a ticket</a>.</li>
     * </ul>
     * <h1>QPS limit</h1>
     * <p>The QPS limit for a single user calling this operation is 500 queries per second. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable frequency. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of StartMPUTask  StartMPUTaskRequest
     * @return StartMPUTaskResponse
     */
    CompletableFuture<StartMPUTaskResponse> startMPUTask(StartMPUTaskRequest request);

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <ul>
     * <li>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/193625.html">AddRecordTemplate</a> to add a recording configuration template.
     * &lt;props=&quot;china&quot;&gt;- By default, you can start a maximum of 100 recording tasks at the same time. If the limit is exceeded, new recording tasks become unavailable. If you have special requirements, <a href="https://selfservice.console.aliyun.com/ticket/createIndex">submit a ticket</a>.
     * &lt;props=&quot;intl&quot;&gt;- By default, you can start a maximum of 100 recording tasks at the same time. If the limit is exceeded, new recording tasks become unavailable. If you have special requirements, <a href="https://workorder-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a>.</li>
     * </ul>
     * <h1>QPS limit</h1>
     * <p>The QPS limit for a single user is 500 queries per second. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls properly. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of StartRecordTask  StartRecordTaskRequest
     * @return StartRecordTaskResponse
     */
    CompletableFuture<StartRecordTaskResponse> startRecordTask(StartRecordTaskRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation starts a bypass streaming task for an online channel.</p>
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for a single user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of StartStreamingOut  StartStreamingOutRequest
     * @return StartStreamingOutResponse
     */
    CompletableFuture<StartStreamingOutResponse> startStreamingOut(StartStreamingOutRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>The QPS limit for a single user is 10 queries per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call the API operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of StartView  StartViewRequest
     * @return StartViewResponse
     */
    CompletableFuture<StartViewResponse> startView(StartViewRequest request);

    /**
     * @param request the request parameters of StopAgent  StopAgentRequest
     * @return StopAgentResponse
     */
    CompletableFuture<StopAgentResponse> stopAgent(StopAgentRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Make API calls at a reasonable rate.</p>
     * 
     * @param request the request parameters of StopCategoryCallback  StopCategoryCallbackRequest
     * @return StopCategoryCallbackResponse
     */
    CompletableFuture<StopCategoryCallbackResponse> stopCategoryCallback(StopCategoryCallbackRequest request);

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used by the server to actively shut down an online channel.  </p>
     * <h3>queries per second (QPS) Limit</h3>
     * <p>The QPS limit for this API is 10 queries per second per user. If the limit is exceeded, API calls will be subject to rate limiting, which may impact your service. Invoke this API appropriately.</p>
     * 
     * @param request the request parameters of StopChannel  StopChannelRequest
     * @return StopChannelResponse
     */
    CompletableFuture<StopChannelResponse> stopChannel(StopChannelRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation stops a meeting minutes task for an online channel.</p>
     * <h3>QPS limits</h3>
     * <p>The QPS limit per user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call the operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of StopCloudNote  StopCloudNoteRequest
     * @return StopCloudNoteResponse
     */
    CompletableFuture<StopCloudNoteResponse> stopCloudNote(StopCloudNoteRequest request);

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to stop an online channel cloud recording job.  </p>
     * <h3>queries per second (QPS) Limit</h3>
     * <p>The QPS limit for this API is 10 queries per second (QPS) per user. If the limit is exceeded, API calls will be subject to rate limiting, which may impact your business. Please invoke the API appropriately.</p>
     * 
     * @param request the request parameters of StopCloudRecord  StopCloudRecordRequest
     * @return StopCloudRecordResponse
     */
    CompletableFuture<StopCloudRecordResponse> stopCloudRecord(StopCloudRecordRequest request);

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <ul>
     * <li>Before you call this operation, you must have called <a href="https://help.aliyun.com/document_detail/93183.html">StartMpuTask</a> to start a stream relay task.</li>
     * <li>If you need to stop a stream relay task and the stream relay task is abnormal (the StopMPUTask operation is not called to stop the task), the stream relay task is automatically stopped 2 minutes after the last user leaves the channel. After the task is stopped, if you need to resume stream relay, you need to call the <a href="https://help.aliyun.com/document_detail/93183.html">StartMpuTask</a> operation again.</li>
     * </ul>
     * <h1>QPS limit</h1>
     * <p>The QPS limit per user for this operation is 500 times per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call the operation properly. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of StopMPUTask  StopMPUTaskRequest
     * @return StopMPUTaskResponse
     */
    CompletableFuture<StopMPUTaskResponse> stopMPUTask(StopMPUTaskRequest request);

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before you call this operation, you must call the <a href="https://help.aliyun.com/document_detail/193528.html">StartRecordTask</a> operation to start a video recording task.</p>
     * <h1>QPS limit</h1>
     * <p>You can call this operation up to 4,000 times per minute per user. If the number of calls per minute exceeds the limit, throttling is triggered, which may affect your business. Call this operation as required. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of StopRecordTask  StopRecordTaskRequest
     * @return StopRecordTaskResponse
     */
    CompletableFuture<StopRecordTaskResponse> stopRecordTask(StopRecordTaskRequest request);

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to stop a bypass stream ingest job for an online channel.  </p>
     * <h3>queries per second (QPS) Limit</h3>
     * <p>The QPS limit for this API is 10 queries per second (QPS) per user. If the limit is exceeded, API calls will be subject to rate limiting, which may impact your business. Invoke this API appropriately.</p>
     * 
     * @param request the request parameters of StopStreamingOut  StopStreamingOutRequest
     * @return StopStreamingOutResponse
     */
    CompletableFuture<StopStreamingOutResponse> stopStreamingOut(StopStreamingOutRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The QPS limit for this API is 10 requests per second per user. Exceeding this limit triggers rate limiting, which can affect your application. Therefore, call the API judiciously.</p>
     * 
     * @param request the request parameters of StopView  StopViewRequest
     * @return StopViewResponse
     */
    CompletableFuture<StopViewResponse> stopView(StopViewRequest request);

    /**
     * @param request the request parameters of UpdateAgent  UpdateAgentRequest
     * @return UpdateAgentResponse
     */
    CompletableFuture<UpdateAgentResponse> updateAgent(UpdateAgentRequest request);

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/353179.html">CreateAutoLiveStreamRule</a> to create a bypass rule.</p>
     * <h1>QPS limits</h1>
     * <p>The QPS limit for a single user is 1,000 calls per minute. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable frequency. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of UpdateAutoLiveStreamRule  UpdateAutoLiveStreamRuleRequest
     * @return UpdateAutoLiveStreamRuleResponse
     */
    CompletableFuture<UpdateAutoLiveStreamRuleResponse> updateAutoLiveStreamRule(UpdateAutoLiveStreamRuleRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage</h3>
     * <p>Updates a cloud recording task for an online channel.</p>
     * <h3>QPS limit</h3>
     * <p>This API supports up to 10 requests per second per user. Exceeding this limit triggers rate limiting, which may affect your service. Call the API responsibly.</p>
     * 
     * @param request the request parameters of UpdateCloudRecord  UpdateCloudRecordRequest
     * @return UpdateCloudRecordResponse
     */
    CompletableFuture<UpdateCloudRecordResponse> updateCloudRecord(UpdateCloudRecordRequest request);

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <ul>
     * <li>Before calling this API, you must have called <a href="https://help.aliyun.com/document_detail/93183.html">StartMpuTask</a> to start a bypass relay task.</li>
     * <li>This API must be called while the task is running normally. Calls are invalid when the task has not started, has ended, or is in an abnormal state. You can call <a href="https://help.aliyun.com/document_detail/93181.html">GetMPUTaskStatus</a> to obtain the task running status.</li>
     * </ul>
     * <h1>QPS limit</h1>
     * <p>The per-user QPS limit of this API is 4,000 calls per minute. If the limit is exceeded, API calls are throttled, which may affect your business. Please call reasonably. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS Limits</a>.</p>
     * 
     * @param request the request parameters of UpdateMPUTask  UpdateMPUTaskRequest
     * @return UpdateMPUTaskResponse
     */
    CompletableFuture<UpdateMPUTaskResponse> updateMPUTask(UpdateMPUTaskRequest request);

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/193528.html">StartRecordTask</a> to start a video recording task.</p>
     * <h1>QPS limits</h1>
     * <p>The QPS limit for a single user is 100 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable frequency. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of UpdateRecordTask  UpdateRecordTaskRequest
     * @return UpdateRecordTaskResponse
     */
    CompletableFuture<UpdateRecordTaskResponse> updateRecordTask(UpdateRecordTaskRequest request);

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/193625.html">AddRecordTemplate</a> to add a recording configuration template.</p>
     * <h1>QPS limits</h1>
     * <p>The QPS limit for a single user is 100 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable rate. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of UpdateRecordTemplate  UpdateRecordTemplateRequest
     * @return UpdateRecordTemplateResponse
     */
    CompletableFuture<UpdateRecordTemplateResponse> updateRecordTemplate(UpdateRecordTemplateRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation updates a bypass live streaming task for an online channel.</p>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 10 requests per second. If the limit is exceeded, API calls are throttled, which may affect your services. Make API calls at a reasonable frequency.</p>
     * 
     * @param request the request parameters of UpdateStreamingOut  UpdateStreamingOutRequest
     * @return UpdateStreamingOutResponse
     */
    CompletableFuture<UpdateStreamingOutResponse> updateStreamingOut(UpdateStreamingOutRequest request);

}
