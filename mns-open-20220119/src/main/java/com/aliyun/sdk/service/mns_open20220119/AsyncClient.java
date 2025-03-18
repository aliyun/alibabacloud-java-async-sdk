// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mns_open20220119;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.mns_open20220119.models.*;
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
     * @param request the request parameters of AuthorizeEndpointAcl  AuthorizeEndpointAclRequest
     * @return AuthorizeEndpointAclResponse
     */
    CompletableFuture<AuthorizeEndpointAclResponse> authorizeEndpointAcl(AuthorizeEndpointAclRequest request);

    /**
     * @param request the request parameters of CreateEventRule  CreateEventRuleRequest
     * @return CreateEventRuleResponse
     */
    CompletableFuture<CreateEventRuleResponse> createEventRule(CreateEventRuleRequest request);

    /**
     * @param request the request parameters of CreateQueue  CreateQueueRequest
     * @return CreateQueueResponse
     */
    CompletableFuture<CreateQueueResponse> createQueue(CreateQueueRequest request);

    /**
     * @param request the request parameters of CreateTopic  CreateTopicRequest
     * @return CreateTopicResponse
     */
    CompletableFuture<CreateTopicResponse> createTopic(CreateTopicRequest request);

    /**
     * @param request the request parameters of DeleteEventRule  DeleteEventRuleRequest
     * @return DeleteEventRuleResponse
     */
    CompletableFuture<DeleteEventRuleResponse> deleteEventRule(DeleteEventRuleRequest request);

    /**
     * @param request the request parameters of DeleteQueue  DeleteQueueRequest
     * @return DeleteQueueResponse
     */
    CompletableFuture<DeleteQueueResponse> deleteQueue(DeleteQueueRequest request);

    /**
     * @param request the request parameters of DeleteTopic  DeleteTopicRequest
     * @return DeleteTopicResponse
     */
    CompletableFuture<DeleteTopicResponse> deleteTopic(DeleteTopicRequest request);

    /**
     * @param request the request parameters of DisableEndpoint  DisableEndpointRequest
     * @return DisableEndpointResponse
     */
    CompletableFuture<DisableEndpointResponse> disableEndpoint(DisableEndpointRequest request);

    /**
     * @param request the request parameters of EnableEndpoint  EnableEndpointRequest
     * @return EnableEndpointResponse
     */
    CompletableFuture<EnableEndpointResponse> enableEndpoint(EnableEndpointRequest request);

    /**
     * @param request the request parameters of GetEndpointAttribute  GetEndpointAttributeRequest
     * @return GetEndpointAttributeResponse
     */
    CompletableFuture<GetEndpointAttributeResponse> getEndpointAttribute(GetEndpointAttributeRequest request);

    /**
     * @param request the request parameters of GetQueueAttributes  GetQueueAttributesRequest
     * @return GetQueueAttributesResponse
     */
    CompletableFuture<GetQueueAttributesResponse> getQueueAttributes(GetQueueAttributesRequest request);

    /**
     * @param request the request parameters of GetSubscriptionAttributes  GetSubscriptionAttributesRequest
     * @return GetSubscriptionAttributesResponse
     */
    CompletableFuture<GetSubscriptionAttributesResponse> getSubscriptionAttributes(GetSubscriptionAttributesRequest request);

    /**
     * @param request the request parameters of GetTopicAttributes  GetTopicAttributesRequest
     * @return GetTopicAttributesResponse
     */
    CompletableFuture<GetTopicAttributesResponse> getTopicAttributes(GetTopicAttributesRequest request);

    /**
     * @param request the request parameters of ListQueue  ListQueueRequest
     * @return ListQueueResponse
     */
    CompletableFuture<ListQueueResponse> listQueue(ListQueueRequest request);

    /**
     * @param request the request parameters of ListSubscriptionByTopic  ListSubscriptionByTopicRequest
     * @return ListSubscriptionByTopicResponse
     */
    CompletableFuture<ListSubscriptionByTopicResponse> listSubscriptionByTopic(ListSubscriptionByTopicRequest request);

    /**
     * @param request the request parameters of ListTopic  ListTopicRequest
     * @return ListTopicResponse
     */
    CompletableFuture<ListTopicResponse> listTopic(ListTopicRequest request);

    /**
     * @param request the request parameters of RevokeEndpointAcl  RevokeEndpointAclRequest
     * @return RevokeEndpointAclResponse
     */
    CompletableFuture<RevokeEndpointAclResponse> revokeEndpointAcl(RevokeEndpointAclRequest request);

    /**
     * @param request the request parameters of SetQueueAttributes  SetQueueAttributesRequest
     * @return SetQueueAttributesResponse
     */
    CompletableFuture<SetQueueAttributesResponse> setQueueAttributes(SetQueueAttributesRequest request);

    /**
     * @param request the request parameters of SetSubscriptionAttributes  SetSubscriptionAttributesRequest
     * @return SetSubscriptionAttributesResponse
     */
    CompletableFuture<SetSubscriptionAttributesResponse> setSubscriptionAttributes(SetSubscriptionAttributesRequest request);

    /**
     * @param request the request parameters of SetTopicAttributes  SetTopicAttributesRequest
     * @return SetTopicAttributesResponse
     */
    CompletableFuture<SetTopicAttributesResponse> setTopicAttributes(SetTopicAttributesRequest request);

    /**
     * @param request the request parameters of Subscribe  SubscribeRequest
     * @return SubscribeResponse
     */
    CompletableFuture<SubscribeResponse> subscribe(SubscribeRequest request);

    /**
     * @param request the request parameters of Unsubscribe  UnsubscribeRequest
     * @return UnsubscribeResponse
     */
    CompletableFuture<UnsubscribeResponse> unsubscribe(UnsubscribeRequest request);

}
