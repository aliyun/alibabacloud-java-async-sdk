// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datahub20240620;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.datahub20240620.models.*;
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
     * @param request the request parameters of GetConnector  GetConnectorRequest
     * @return GetConnectorResponse
     */
    CompletableFuture<GetConnectorResponse> getConnector(GetConnectorRequest request);

    /**
     * @param request the request parameters of GetGroup  GetGroupRequest
     * @return GetGroupResponse
     */
    CompletableFuture<GetGroupResponse> getGroup(GetGroupRequest request);

    /**
     * @param request the request parameters of GetProject  GetProjectRequest
     * @return GetProjectResponse
     */
    CompletableFuture<GetProjectResponse> getProject(GetProjectRequest request);

    /**
     * @param request the request parameters of GetSchema  GetSchemaRequest
     * @return GetSchemaResponse
     */
    CompletableFuture<GetSchemaResponse> getSchema(GetSchemaRequest request);

    /**
     * @param request the request parameters of GetSubscription  GetSubscriptionRequest
     * @return GetSubscriptionResponse
     */
    CompletableFuture<GetSubscriptionResponse> getSubscription(GetSubscriptionRequest request);

    /**
     * @param request the request parameters of GetTopic  GetTopicRequest
     * @return GetTopicResponse
     */
    CompletableFuture<GetTopicResponse> getTopic(GetTopicRequest request);

    /**
     * @param request the request parameters of ListConnectors  ListConnectorsRequest
     * @return ListConnectorsResponse
     */
    CompletableFuture<ListConnectorsResponse> listConnectors(ListConnectorsRequest request);

    /**
     * @param request the request parameters of ListGroups  ListGroupsRequest
     * @return ListGroupsResponse
     */
    CompletableFuture<ListGroupsResponse> listGroups(ListGroupsRequest request);

    /**
     * @param request the request parameters of ListProjects  ListProjectsRequest
     * @return ListProjectsResponse
     */
    CompletableFuture<ListProjectsResponse> listProjects(ListProjectsRequest request);

    /**
     * @param request the request parameters of ListSchemas  ListSchemasRequest
     * @return ListSchemasResponse
     */
    CompletableFuture<ListSchemasResponse> listSchemas(ListSchemasRequest request);

    /**
     * @param request the request parameters of ListSubscriptions  ListSubscriptionsRequest
     * @return ListSubscriptionsResponse
     */
    CompletableFuture<ListSubscriptionsResponse> listSubscriptions(ListSubscriptionsRequest request);

    /**
     * @param request the request parameters of ListTopics  ListTopicsRequest
     * @return ListTopicsResponse
     */
    CompletableFuture<ListTopicsResponse> listTopics(ListTopicsRequest request);

}
