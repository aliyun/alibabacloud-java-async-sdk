// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ons20190214.models.*;
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
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * When you call the <strong>ListTagResources</strong> operation, specify at least one of the following parameters in the request: <strong>Key</strong> and <strong>ResourceId</strong>. You can specify a resource ID to query all tags that are attached to the specified resource. You can also specify a tag key to query the tag value and resource to which the tag is attached.</p>
     * </blockquote>
     * <ul>
     * <li>If you include the <strong>Key</strong> parameter in a request, you can obtain the tag value and the ID of the resource to which the tag is attached.</li>
     * <li>If you include the <strong>ResourceId</strong> parameter in a request, you can obtain the keys and values of all tags that are attached to the specified resource.</li>
     * </ul>
     * 
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * You can call this operation in scenarios in which you want to know the message consumption progress of a specified consumer group in production environments. You can obtain the information about message consumption and consumption latency based on the returned information. This operation returns the total number of accumulated messages in all topics to which the specified consumer group subscribes and the number of accumulated messages in each topic.</p>
     * </blockquote>
     * 
     * @param request the request parameters of OnsConsumerAccumulate  OnsConsumerAccumulateRequest
     * @return OnsConsumerAccumulateResponse
     */
    CompletableFuture<OnsConsumerAccumulateResponse> onsConsumerAccumulate(OnsConsumerAccumulateRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * When messages are accumulated in a topic, you can call this operation to check whether a consumer is online.</p>
     * </blockquote>
     * 
     * @param request the request parameters of OnsConsumerGetConnection  OnsConsumerGetConnectionRequest
     * @return OnsConsumerGetConnectionResponse
     */
    CompletableFuture<OnsConsumerGetConnectionResponse> onsConsumerGetConnection(OnsConsumerGetConnectionRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * You can call this operation to clear accumulated messages or reset a consumer offset to a specified timestamp. You can use one of the following methods to clear accumulated messages:</p>
     * </blockquote>
     * <ul>
     * <li>Clear all accumulated messages in a specified topic.</li>
     * <li>Clear the messages that were published to the specified topic before a specified point in time.</li>
     * </ul>
     * 
     * @param request the request parameters of OnsConsumerResetOffset  OnsConsumerResetOffsetRequest
     * @return OnsConsumerResetOffsetResponse
     */
    CompletableFuture<OnsConsumerResetOffsetResponse> onsConsumerResetOffset(OnsConsumerResetOffsetRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * <ul>
     * <li>You can call this operation in scenarios in which consumers are online and messages are accumulated. You can troubleshoot errors based on the information that is returned by this operation. You can check whether all consumers in the consumer group subscribe to the same topics and tags, and whether load balancing is performed as expected. You can also obtain the information about thread stack traces of online consumers.</li>
     * <li>This operation uses multiple backend operations to query and aggregate data. The system requires a long period of time to process a request. We recommend that you do not frequently call this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of OnsConsumerStatus  OnsConsumerStatusRequest
     * @return OnsConsumerStatusResponse
     */
    CompletableFuture<OnsConsumerStatusResponse> onsConsumerStatus(OnsConsumerStatusRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * You can call this operation to query the point in time when the earliest stored message was published to a specified topic and the point in time when the most recently stored message was published to the specified topic. You can also call this operation to query the most recent point in time when a message in the topic was consumed. This operation is usually used with the \<em>\<em>OnsConsumerAccumulate\</em>\</em> operation to display the overview of the consumption progress.</p>
     * </blockquote>
     * 
     * @param request the request parameters of OnsConsumerTimeSpan  OnsConsumerTimeSpanRequest
     * @return OnsConsumerTimeSpanResponse
     */
    CompletableFuture<OnsConsumerTimeSpanResponse> onsConsumerTimeSpan(OnsConsumerTimeSpanRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * This operation uses the exact match method to query a dead-letter message based on the message ID. You can obtain the message ID that is required to query the information about a dead-letter message from the SendResult parameter that is returned after the message is sent. You can also obtain the message ID by calling the OnsDLQMessagePageQueryByGroupId operation to query multiple messages at a time. The queried information about the dead-letter message includes the point in time when the message is stored, the message body, and attributes such as the message tag and the message key.</p>
     * </blockquote>
     * 
     * @param request the request parameters of OnsDLQMessageGetById  OnsDLQMessageGetByIdRequest
     * @return OnsDLQMessageGetByIdResponse
     */
    CompletableFuture<OnsDLQMessageGetByIdResponse> onsDLQMessageGetById(OnsDLQMessageGetByIdRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * <ul>
     * <li>If you do not know the ID of the dead-letter message that you want to query, you can call this operation to query all dead-letter messages that are sent to a specified consumer group within a specified time range. The results are returned by page.</li>
     * <li>We recommend that you specify a short time range to query dead-letter messages in this method. If you specify a long time range, a large number of dead-letter messages are returned. In this case, you cannot find the dead-letter message that you want to query in an efficient manner. You can perform the following steps to query dead-letter messages:<ol>
     * <li>Perform a paged query by specifying the group ID, start time, end time, and number of entries to return on each page. If matched messages are found, the information about the dead-letter messages on the first page, total number of pages, and task ID are returned by default.</li>
     * <li>Specify the task ID and a page number to call this operation again to query the dead-letter messages on the specified page. In this query, the BeginTime, EndTime, and PageSize parameters do not take effect. By default, the system uses the values of these parameters that you specified in the request when you created the specified query task.</li>
     * </ol>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of OnsDLQMessagePageQueryByGroupId  OnsDLQMessagePageQueryByGroupIdRequest
     * @return OnsDLQMessagePageQueryByGroupIdResponse
     */
    CompletableFuture<OnsDLQMessagePageQueryByGroupIdResponse> onsDLQMessagePageQueryByGroupId(OnsDLQMessagePageQueryByGroupIdRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * <ul>
     * <li>A dead-letter message is a message that still fails to be consumed after the number of consumption retries reaches the upper limit. If the message still cannot be consumed after you re-send it, a message with the same message ID is added to the corresponding dead-letter queue. You can query the message ID on the Dead-letter Queues page in the ApsaraMQ for RocketMQ console or by calling API operations. You can obtain the number of consumption failures for a message based on the number of dead-letter messages with the same message ID in the dead-letter queue.</li>
     * <li>A dead-letter message is a message that fails to be consumed after the number of consumption retries reaches the upper limit. Generally, dead-letter messages are produced because of incorrect consumption logic. We recommend that you troubleshoot the consumption failures and then call this operation to send the message to the consumer group for consumption again.</li>
     * <li>ApsaraMQ for RocketMQ does not manage the status of dead-letter messages based on the consumption status of the dead-letter messages. After you call this operation to send a dead-letter message to a consumer group and the message is consumed, ApsaraMQ for RocketMQ does not remove the dead-letter message from the dead-letter queue. You must manage dead-letter messages and determine whether to send a dead-letter message to a consumer group for consumption. This way, you do not resend or reconsume the messages that are consumed.</li>
     * </ul>
     * 
     * @param request the request parameters of OnsDLQMessageResendById  OnsDLQMessageResendByIdRequest
     * @return OnsDLQMessageResendByIdResponse
     */
    CompletableFuture<OnsDLQMessageResendByIdResponse> onsDLQMessageResendById(OnsDLQMessageResendByIdRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * You can call this operation to configure the permissions for a consumer group to read messages based on a specified region of ApsaraMQ for RocketMQ and a specified group ID. You can call this operation in scenarios in which you want to forbid consumers in a specific group from reading messages.</p>
     * </blockquote>
     * 
     * @param request the request parameters of OnsGroupConsumerUpdate  OnsGroupConsumerUpdateRequest
     * @return OnsGroupConsumerUpdateResponse
     */
    CompletableFuture<OnsGroupConsumerUpdateResponse> onsGroupConsumerUpdate(OnsGroupConsumerUpdateRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * When you release a new application or implement new business logic, you need new consumer groups. You can call this operation to create a consumer group.</p>
     * </blockquote>
     * 
     * @param request the request parameters of OnsGroupCreate  OnsGroupCreateRequest
     * @return OnsGroupCreateResponse
     */
    CompletableFuture<OnsGroupCreateResponse> onsGroupCreate(OnsGroupCreateRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</li>
     * <li>After you delete a group, the consumers in the group immediately stop receiving messages. Exercise caution when you call this operation.
     * You can call this operation to delete a group when you need to reclaim the resources of the group. For example, after an application is brought offline, you can delete the groups that are used for the application. After you delete a group, the backend of ApsaraMQ for RocketMQ reclaims the resources of the group. The system requires a long period of time to reclaim the resources. We recommend that you do not create a group that uses the same name as a deleted group immediately after you delete the group. If the system fails to delete the specified group, troubleshoot the issue based on the error code.</li>
     * </ul>
     * 
     * @param request the request parameters of OnsGroupDelete  OnsGroupDeleteRequest
     * @return OnsGroupDeleteResponse
     */
    CompletableFuture<OnsGroupDeleteResponse> onsGroupDelete(OnsGroupDeleteRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * 
     * @param request the request parameters of OnsGroupList  OnsGroupListRequest
     * @return OnsGroupListResponse
     */
    CompletableFuture<OnsGroupListResponse> onsGroupList(OnsGroupListRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * 
     * @param request the request parameters of OnsGroupSubDetail  OnsGroupSubDetailRequest
     * @return OnsGroupSubDetailResponse
     */
    CompletableFuture<OnsGroupSubDetailResponse> onsGroupSubDetail(OnsGroupSubDetailRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * To send and receive messages, a client must be connected to a ApsaraMQ for RocketMQ instance by using an endpoint. You can call this operation to query the endpoints of the instance.</p>
     * </blockquote>
     * 
     * @param request the request parameters of OnsInstanceBaseInfo  OnsInstanceBaseInfoRequest
     * @return OnsInstanceBaseInfoResponse
     */
    CompletableFuture<OnsInstanceBaseInfoResponse> onsInstanceBaseInfo(OnsInstanceBaseInfoRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * An instance is a virtual machine (VM) that can be used to store information about the topics and groups of ApsaraMQ for RocketMQ. You can call this operation when you need to create service resources for the business that you want to launch. Before you call this operation, take note of the following limits:</p>
     * </blockquote>
     * <ul>
     * <li>A maximum of eight ApsaraMQ for RocketMQ instances can be deployed in each region.</li>
     * <li>This operation can be called to create only a Standard Edition instance. You can use the ApsaraMQ for RocketMQ console to create Standard Edition instances and Enterprise Platinum Edition instances. For information about how to create ApsaraMQ for RocketMQ instances, see <a href="https://help.aliyun.com/document_detail/200153.html">Manage instances</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of OnsInstanceCreate  OnsInstanceCreateRequest
     * @return OnsInstanceCreateResponse
     */
    CompletableFuture<OnsInstanceCreateResponse> onsInstanceCreate(OnsInstanceCreateRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * <ul>
     * <li>You can call this operation when you need to reclaim resources. For example, after you unpublish an application, you can reclaim the resources that were used for the application. An instance can be deleted only when the instance does not contain topics and groups.</li>
     * <li>After an instance is deleted, the instance cannot be restored. Exercise caution when you call this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of OnsInstanceDelete  OnsInstanceDeleteRequest
     * @return OnsInstanceDeleteResponse
     */
    CompletableFuture<OnsInstanceDeleteResponse> onsInstanceDelete(OnsInstanceDeleteRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * 
     * @param request the request parameters of OnsInstanceInServiceList  OnsInstanceInServiceListRequest
     * @return OnsInstanceInServiceListResponse
     */
    CompletableFuture<OnsInstanceInServiceListResponse> onsInstanceInServiceList(OnsInstanceInServiceListRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * A maximum of eight ApsaraMQ for RocketMQ instances can be deployed in each region.</p>
     * </blockquote>
     * 
     * @param request the request parameters of OnsInstanceUpdate  OnsInstanceUpdateRequest
     * @return OnsInstanceUpdateResponse
     */
    CompletableFuture<OnsInstanceUpdateResponse> onsInstanceUpdate(OnsInstanceUpdateRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * 
     * @param request the request parameters of OnsMessageDetail  OnsMessageDetailRequest
     * @return OnsMessageDetailResponse
     */
    CompletableFuture<OnsMessageDetailResponse> onsMessageDetail(OnsMessageDetailRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * <ul>
     * <li>This operation uses the fuzzy match method to query messages based on a specified message key. The same message key may be used by multiple messages. Therefore, the returned result may contain information about multiple messages.</li>
     * <li>This operation can be used in scenarios in which you cannot obtain the IDs of the messages that you want to query. You can perform the following steps to query the information about messages:<ol>
     * <li>Call this operation to query message IDs.</li>
     * <li>Call the <strong>OnsMessageGetByMsgId</strong> operation that uses the exact match method to query the details of a specified message. For more information about the <strong>OnsMessageGetByMsgId</strong> operation, see <a href="https://help.aliyun.com/document_detail/29607.html">OnsMessageGetByMsgId</a>.</li>
     * </ol>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of OnsMessageGetByKey  OnsMessageGetByKeyRequest
     * @return OnsMessageGetByKeyResponse
     */
    CompletableFuture<OnsMessageGetByKeyResponse> onsMessageGetByKey(OnsMessageGetByKeyRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * <ul>
     * <li>If a message is not consumed as expected, you can call this operation to query the information about the message for troubleshooting.</li>
     * <li>This operation uses the exact match method to query a message based on the message ID. You can obtain the message ID from the SendResult parameter that is returned after the message is sent. You must store the returned information after each message is sent. The queried information about a message includes the point in time when the message was sent, the broker on which the message is stored, and the attributes of the message such as the message key and tag.</li>
     * </ul>
     * 
     * @param request the request parameters of OnsMessageGetByMsgId  OnsMessageGetByMsgIdRequest
     * @return OnsMessageGetByMsgIdResponse
     */
    CompletableFuture<OnsMessageGetByMsgIdResponse> onsMessageGetByMsgId(OnsMessageGetByMsgIdRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * <ul>
     * <li>If you do not know the ID or key of a message that you want to query, you can call this operation to query all messages that are stored in the topic within a specified time range. The results are displayed by page.</li>
     * <li>We recommend that you specify a short time range to query messages. If you specify a long time range, a large number of messages are returned. In this case, you cannot find the message that you want to query in an efficient manner. You can perform the following steps to query messages:<ol>
     * <li>Perform a paged query by specifying the topic, start time, end time, and number of entries to return on each page. If the topic contains messages, the information about the messages on the first page, total number of pages, and task ID are returned by default.</li>
     * <li>Specify the task ID and a page number to call this operation again to query the messages on the specified page. The BeginTime, EndTime, and PageSize parameters do not take effect. By default, the system uses the values of these parameters that you specified in the request when you created the specified query task.</li>
     * </ol>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of OnsMessagePageQueryByTopic  OnsMessagePageQueryByTopicRequest
     * @return OnsMessagePageQueryByTopicResponse
     */
    CompletableFuture<OnsMessagePageQueryByTopicResponse> onsMessagePageQueryByTopic(OnsMessagePageQueryByTopicRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * This operation can be used to check whether messages in a specified topic can be consumed by consumers in a specified consumer group. This operation obtains the body of the message that is specified by the MsgId parameter, re-encapsulates the message body to produce a new message, and then pushes the new message to a specified consumer. The content of the message that is sent to the consumer is the same as the content of the original message. They are not the same message because they use different message IDs.</p>
     * </blockquote>
     * 
     * @param request the request parameters of OnsMessagePush  OnsMessagePushRequest
     * @return OnsMessagePushResponse
     */
    CompletableFuture<OnsMessagePushResponse> onsMessagePush(OnsMessagePushRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * <ul>
     * <li>You can call this operation to check whether a specified message is consumed. If the message is not consumed, you can troubleshoot the issue based on the returned information.</li>
     * <li>This operation queries information based on the built-in offset mechanism of ApsaraMQ for RocketMQ. In most cases, the results are correct. If you have reset the consumer offset or cleared accumulated messages, the results may not be correct.</li>
     * </ul>
     * 
     * @param request the request parameters of OnsMessageTrace  OnsMessageTraceRequest
     * @return OnsMessageTraceResponse
     */
    CompletableFuture<OnsMessageTraceResponse> onsMessageTrace(OnsMessageTraceRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * When you use an SDK to access and manage a ApsaraMQ for RocketMQ instance, you must sequentially specify the information about two regions. You can query the information about the second region by calling the OnsRegionList operation. You must apply for a public endpoint in the following scenarios:</p>
     * </blockquote>
     * <ul>
     * <li>Connect your application to ApsaraMQ for RocketMQ: Select the nearest API gateway endpoint based on the region where your application is deployed, and enter the corresponding <strong>region ID</strong>. The <strong>regionId</strong> is used to access Alibaba Cloud API Gateway because ApsaraMQ for RocketMQ instances provide API services by using the OpenAPI Explorer platform, which is also called POP.</li>
     * <li>Access a region to manage its resources: Specify a region where you want to manage ApsaraMQ for RocketMQ resources and enter the region ID. You can call the <strong>OnsRegionList</strong> operation to query a region ID.</li>
     * </ul>
     * 
     * @param request the request parameters of OnsRegionList  OnsRegionListRequest
     * @return OnsRegionListResponse
     */
    CompletableFuture<OnsRegionListResponse> onsRegionList(OnsRegionListRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * When you want to release a new application or expand your business, you can call this operation to create a topic based on your business requirements.</p>
     * </blockquote>
     * 
     * @param request the request parameters of OnsTopicCreate  OnsTopicCreateRequest
     * @return OnsTopicCreateResponse
     */
    CompletableFuture<OnsTopicCreateResponse> onsTopicCreate(OnsTopicCreateRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur. - After you delete the topic, the publishing and subscription relationships that are constructed based on the topic are cleared. Exercise caution when you call this operation.
     * You can call this operation to delete a topic when you need to reclaim the resources from the topic. For example, after an application is brought offline, you can delete the topics that are used for the application. After you delete a topic, the backend of ApsaraMQ for RocketMQ reclaims the resources from the topic. The system requires a long period of time to reclaim the resources. After you delete a topic, we recommend that you do not create a topic that uses the same name as the deleted topic within a short period of time. If the system fails to delete the specified topic, troubleshoot the issue based on the error code.</p>
     * </blockquote>
     * 
     * @param request the request parameters of OnsTopicDelete  OnsTopicDeleteRequest
     * @return OnsTopicDeleteResponse
     */
    CompletableFuture<OnsTopicDeleteResponse> onsTopicDelete(OnsTopicDeleteRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * This operation returns the basic information about topics and does not return the details of topics.</p>
     * </blockquote>
     * 
     * @param request the request parameters of OnsTopicList  OnsTopicListRequest
     * @return OnsTopicListResponse
     */
    CompletableFuture<OnsTopicListResponse> onsTopicList(OnsTopicListRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * You can determine the resource usage of a topic based on the information that is returned by this operation. The returned information includes the total number of messages in the topic and the most recent point in time when a message was published to the topic.</p>
     * </blockquote>
     * 
     * @param request the request parameters of OnsTopicStatus  OnsTopicStatusRequest
     * @return OnsTopicStatusResponse
     */
    CompletableFuture<OnsTopicStatusResponse> onsTopicStatus(OnsTopicStatusRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * You can call this operation to query the online consumer groups that subscribe to a specified topic. If all consumers in a group are offline, the information about the group is not returned.</p>
     * </blockquote>
     * 
     * @param request the request parameters of OnsTopicSubDetail  OnsTopicSubDetailRequest
     * @return OnsTopicSubDetailResponse
     */
    CompletableFuture<OnsTopicSubDetailResponse> onsTopicSubDetail(OnsTopicSubDetailRequest request);

    /**
     * @deprecated OpenAPI OnsTopicUpdate is deprecated  * @description > API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * You can call this operation to forbid read or write operations on a specific topic.
     * 
     * @param request the request parameters of OnsTopicUpdate  OnsTopicUpdateRequest
     * @return OnsTopicUpdateResponse
     */
    @Deprecated
    CompletableFuture<OnsTopicUpdateResponse> onsTopicUpdate(OnsTopicUpdateRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * <ul>
     * <li>Before you call this operation to query the details of the trace of a message, you must create a task to query the trace of the message based on the message ID or message key and obtain the task ID. Then, you can call this operation to query the details of the message trace based on the task ID. You can call the <a href="https://help.aliyun.com/document_detail/445322.html">OnsTraceQueryByMsgId</a> operation or the <a href="https://help.aliyun.com/document_detail/445324.html">OnsTraceQueryByMsgKey</a> operation to create a task to query the trace of the message and obtain the task ID from the <strong>QueryId</strong> response parameter.</li>
     * <li>A trace query task is time-consuming. If you call this operation to query the details immediately after you create a trace query task, the results may be empty. In this case, we recommend that you try again later.</li>
     * </ul>
     * 
     * @param request the request parameters of OnsTraceGetResult  OnsTraceGetResultRequest
     * @return OnsTraceGetResultResponse
     */
    CompletableFuture<OnsTraceGetResultResponse> onsTraceGetResult(OnsTraceGetResultRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * If you want to query the trace of a message based on the message ID, you can call this operation to create a query task. After you obtain the task ID, you can call the <a href="https://help.aliyun.com/document_detail/59832.html">OnsTraceGetResult</a> operation to query the details of the message trace based on the task ID.</p>
     * </blockquote>
     * 
     * @param request the request parameters of OnsTraceQueryByMsgId  OnsTraceQueryByMsgIdRequest
     * @return OnsTraceQueryByMsgIdResponse
     */
    CompletableFuture<OnsTraceQueryByMsgIdResponse> onsTraceQueryByMsgId(OnsTraceQueryByMsgIdRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * If you want to query the trace of a message based on the message key that you obtained, you can call this operation to create a query task. After you obtain the task ID, you can call the OnsTraceGetResult operation to query the details of the message trace based on the task ID.</p>
     * </blockquote>
     * 
     * @param request the request parameters of OnsTraceQueryByMsgKey  OnsTraceQueryByMsgKeyRequest
     * @return OnsTraceQueryByMsgKeyResponse
     */
    CompletableFuture<OnsTraceQueryByMsgKeyResponse> onsTraceQueryByMsgKey(OnsTraceQueryByMsgKeyRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * You can call this operation to query the following statistics that are collected in a production environment:</p>
     * </blockquote>
     * <ul>
     * <li>The number of messages that are consumed during each sampling period</li>
     * <li>The transactions per second (TPS) for message consumption during each sampling period
     * If your application consumes a small number of messages and does not consume messages at specific intervals, we recommend that you query the number of messages that are consumed during each sampling period because the statistics of TPS may not show a clear change trend.</li>
     * </ul>
     * 
     * @param request the request parameters of OnsTrendGroupOutputTps  OnsTrendGroupOutputTpsRequest
     * @return OnsTrendGroupOutputTpsResponse
     */
    CompletableFuture<OnsTrendGroupOutputTpsResponse> onsTrendGroupOutputTps(OnsTrendGroupOutputTpsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * You can call this operation to query the statistics of messages that are published to a specific topic in a production environment. You can query the number of messages that are published to the topic or the transactions per second (TPS) for message publishing within a specified time range based on your business requirements.
     * If your application publishes a small number of messages and does not publish messages at specific intervals, we recommend that you query the number of messages that are published to the topic during each sampling period because the statistics of TPS may not show a clear change trend.</p>
     * </blockquote>
     * 
     * @param request the request parameters of OnsTrendTopicInputTps  OnsTrendTopicInputTpsRequest
     * @return OnsTrendTopicInputTpsResponse
     */
    CompletableFuture<OnsTrendTopicInputTpsResponse> onsTrendTopicInputTps(OnsTrendTopicInputTpsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * You can call this operation the first time you use ApsaraMQ for RocketMQ. You can use ApsaraMQ for RocketMQ only after the service is activated.
     * The ApsaraMQ for RocketMQ service can be activated only in the China (Hangzhou) region. Service activation is not billed.</p>
     * </blockquote>
     * 
     * @param request the request parameters of OpenOnsService  OpenOnsServiceRequest
     * @return OpenOnsServiceResponse
     */
    CompletableFuture<OpenOnsServiceResponse> openOnsService(OpenOnsServiceRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * You can call this operation to attach tags to a source. You can use tags to classify resources in ApsaraMQ for RocketMQ. This can help you aggregate and search resources in an efficient manner.</p>
     * </blockquote>
     * 
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

}
