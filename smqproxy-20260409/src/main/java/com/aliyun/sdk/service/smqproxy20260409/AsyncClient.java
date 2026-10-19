// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smqproxy20260409;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.smqproxy20260409.models.*;
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
     * <h2>Request description</h2>
     * <ul>
     * <li>Use this operation together with BatchReceiveMessage.</li>
     * <li>The result of a batch operation may contain both successful and failed sub-requests. The HTTP status code is 204 only when all sub-requests succeed.</li>
     * <li>A maximum of 16 messages can be deleted per request.</li>
     * <li>Provide the list of <code>ReceiptHandle</code> values returned from the previous consumption to identify the messages to delete.</li>
     * <li>This operation succeeds only when executed before <code>NextVisibleTime</code>. After the timeout, the message becomes Active again, the ReceiptHandle becomes invalid, and you must consume the message again to obtain a new handle.</li>
     * </ul>
     * 
     * @param request the request parameters of BatchDeleteMessage  BatchDeleteMessageRequest
     * @return BatchDeleteMessageResponse
     */
    CompletableFuture<BatchDeleteMessageResponse> batchDeleteMessage(BatchDeleteMessageRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation batch peeks at messages in a specified queue. You can peek at up to 16 messages at a time.</li>
     * <li>This operation does not change the message status. Messages remain in the Active state.</li>
     * <li>Long polling is not supported.</li>
     * <li>Provide <code>queueName</code> as a path parameter, and set the query parameter <code>peekonly=true</code> along with <code>numOfMessages</code> (range: 1 to 16) to specify the number of messages to peek at.</li>
     * <li>A successful response returns an array containing the details of the requested messages, including but not limited to the message ID, body, and enqueue time.</li>
     * <li>If the specified queue does not exist or no visible messages are in the queue, the corresponding error code is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of BatchPeekMessage  BatchPeekMessageRequest
     * @return BatchPeekMessageResponse
     */
    CompletableFuture<BatchPeekMessageResponse> batchPeekMessage(BatchPeekMessageRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation changes the status of received messages to Inactive. The Inactive duration is determined by the <code>VisibilityTimeout</code> attribute of the queue.</li>
     * <li>Consumers must call DeleteMessage to delete messages within the VisibilityTimeout period. Otherwise, messages become Active again.</li>
     * <li>Long polling is supported: if you set <code>waitseconds &gt; 0</code> and the queue is empty, the request waits until a message arrives or the timeout expires.<blockquote>
     * <p>Notice: After long polling is enabled, reduce the concurrency of external long polling calls and select an appropriate long polling duration. The server dynamically adjusts the concurrency limit for long polling based on factors such as the number of long polling requests, long polling wait time, and number of access IP addresses. When the queue has no messages, requests that exceed the long polling limit cannot be listened to and directly return 404 MessageNotExist (billed normally by request count). If you need to temporarily increase the long polling limit, submit a ticket promptly.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of BatchReceiveMessage  BatchReceiveMessageRequest
     * @return BatchReceiveMessageResponse
     */
    CompletableFuture<BatchReceiveMessageResponse> batchReceiveMessage(BatchReceiveMessageRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>The total size of messages in a single batch request must not exceed 64 KB.</li>
     * <li><code>BatchSendMessage</code> and <code>SendMessage</code> use the same URL path. They are distinguished by the body structure: if the body contains a <code>Messages</code> array, it is a batch send operation. Otherwise, it is a single message send operation.</li>
     * <li>The response of a batch operation may contain both successful and failed sub-messages.</li>
     * <li>Each request can contain multiple message objects. Each message object can have a different delay time and priority.</li>
     * <li>For FIFO queues, you can use the <code>MessageGroupId</code> parameter to specify a message group ID.</li>
     * </ul>
     * 
     * @param request the request parameters of BatchSendMessage  BatchSendMessageRequest
     * @return BatchSendMessageResponse
     */
    CompletableFuture<BatchSendMessageResponse> batchSendMessage(BatchSendMessageRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation allows you to modify the VisibilityTimeout of a message that has been consumed and is currently in the Inactive state. The VisibilityTimeout is the countdown from the current moment until the message becomes Active again.</li>
     * <li>A successful invocation returns a new <code>ReceiptHandle</code>. Use this new handle for subsequent delete or visibility timeout modification operations on this message.</li>
     * <li>This operation can only be invoked successfully before <code>NextVisibleTime</code>. Otherwise, a fault is returned.</li>
     * <li>Common scenarios include when a consumer requires a longer processing time and needs to extend the VisibilityTimeout to prevent the message from being consumed again.</li>
     * </ul>
     * 
     * @param request the request parameters of ChangeMessageVisibility  ChangeMessageVisibilityRequest
     * @return ChangeMessageVisibilityResponse
     */
    CompletableFuture<ChangeMessageVisibilityResponse> changeMessageVisibility(ChangeMessageVisibilityRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>After a message is published, it is pushed to the endpoints of all subscriptions under the topic.</li>
     * <li>You do not need to set <code>MessageAttributes</code> when pushing messages to queues or HTTP endpoints.</li>
     * <li>You must set the corresponding <code>MessageAttributes</code> sub-properties when pushing messages to email, SMS, or mobile push endpoints.</li>
     * <li>Base64-encode the message content beforehand to avoid special character issues.</li>
     * </ul>
     * 
     * @param request the request parameters of PublishMessage  PublishMessageRequest
     * @return PublishMessageResponse
     */
    CompletableFuture<PublishMessageResponse> publishMessage(PublishMessageRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>The <strong>SendMessage</strong> operation sends a message to a specified queue.</li>
     * <li>Messages can be consumed immediately or delayed by setting the <code>DelaySeconds</code> parameter.</li>
     * <li>You can specify a priority for the message. A smaller value indicates a higher priority.</li>
     * <li>For FIFO queues, use <code>MessageGroupId</code> to ensure ordered delivery of messages within the same group.</li>
     * <li>You can also set custom attributes in <code>UserProperties</code> as a JSON-formatted string to provide additional information.</li>
     * <li>When <code>DelaySeconds</code> is greater than 0, the <code>ReceiptHandle</code> returned by the API can be used to delete the delayed message before it becomes Active.</li>
     * </ul>
     * 
     * @param request the request parameters of SendMessage  SendMessageRequest
     * @return SendMessageResponse
     */
    CompletableFuture<SendMessageResponse> sendMessage(SendMessageRequest request);

}
