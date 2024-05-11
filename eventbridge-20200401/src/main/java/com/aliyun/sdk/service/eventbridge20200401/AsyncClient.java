// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.eventbridge20200401.models.*;
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
      * You can call this API operation to create an API destination.
      *
     */
    CompletableFuture<CreateApiDestinationResponse> createApiDestination(CreateApiDestinationRequest request);

    /**
      * You can call this API operation to create a connection.
      *
     */
    CompletableFuture<CreateConnectionResponse> createConnection(CreateConnectionRequest request);

    /**
      * You can call this API operation to create an event bus.
      *
     */
    CompletableFuture<CreateEventBusResponse> createEventBus(CreateEventBusRequest request);

    /**
      * You can call this operation to create an event source.
      *
     */
    CompletableFuture<CreateEventSourceResponse> createEventSource(CreateEventSourceRequest request);

    /**
      * You can call this API operation to create an event stream.
      *
     */
    CompletableFuture<CreateEventStreamingResponse> createEventStreaming(CreateEventStreamingRequest request);

    /**
      * You can call this API operation to create an event rule.
      *
     */
    CompletableFuture<CreateRuleResponse> createRule(CreateRuleRequest request);

    /**
      * You can call this API operation to create a service-linked role for your cloud service.
      *
     */
    CompletableFuture<CreateServiceLinkedRoleForProductResponse> createServiceLinkedRoleForProduct(CreateServiceLinkedRoleForProductRequest request);

    /**
      * You can call this API operation to delete an API destination.
      *
     */
    CompletableFuture<DeleteApiDestinationResponse> deleteApiDestination(DeleteApiDestinationRequest request);

    /**
      * You can call this API operation to delete a connection.
      *
     */
    CompletableFuture<DeleteConnectionResponse> deleteConnection(DeleteConnectionRequest request);

    /**
      * You can call this API operation to delete an event bus.
      *
     */
    CompletableFuture<DeleteEventBusResponse> deleteEventBus(DeleteEventBusRequest request);

    /**
      * You can call this API operation to delete an event source.
      *
     */
    CompletableFuture<DeleteEventSourceResponse> deleteEventSource(DeleteEventSourceRequest request);

    /**
      * You can call this API operation to delete an event stream.
      *
     */
    CompletableFuture<DeleteEventStreamingResponse> deleteEventStreaming(DeleteEventStreamingRequest request);

    /**
      * You can call this API operation to delete an event rule.
      *
     */
    CompletableFuture<DeleteRuleResponse> deleteRule(DeleteRuleRequest request);

    /**
      * You can call this API operation to delete one or more event targets of an event rule.
      *
     */
    CompletableFuture<DeleteTargetsResponse> deleteTargets(DeleteTargetsRequest request);

    /**
      * You can call this API operation to disable an event rule.
      *
     */
    CompletableFuture<DisableRuleResponse> disableRule(DisableRuleRequest request);

    /**
      * You can call this API operation to enable an event rule.
      *
     */
    CompletableFuture<EnableRuleResponse> enableRule(EnableRuleRequest request);

    CompletableFuture<EventCenterCheckEnabledOnDefaultBusResponse> eventCenterCheckEnabledOnDefaultBus(EventCenterCheckEnabledOnDefaultBusRequest request);

    CompletableFuture<EventCenterDisableOnDefaultBusResponse> eventCenterDisableOnDefaultBus(EventCenterDisableOnDefaultBusRequest request);

    CompletableFuture<EventCenterEnableOnDefaultBusResponse> eventCenterEnableOnDefaultBus(EventCenterEnableOnDefaultBusRequest request);

    CompletableFuture<EventCenterQueryEventsResponse> eventCenterQueryEvents(EventCenterQueryEventsRequest request);

    /**
      * You can call this API operation to query the information about an API destination.
      *
     */
    CompletableFuture<GetApiDestinationResponse> getApiDestination(GetApiDestinationRequest request);

    /**
      * You can call this API operation to query the configurations of a connection.
      *
     */
    CompletableFuture<GetConnectionResponse> getConnection(GetConnectionRequest request);

    /**
      * You can call this API operation to query the detailed information about an event bus.
      *
     */
    CompletableFuture<GetEventBusResponse> getEventBus(GetEventBusRequest request);

    /**
      * You can call this API operation to query the details of an event stream.
      *
     */
    CompletableFuture<GetEventStreamingResponse> getEventStreaming(GetEventStreamingRequest request);

    /**
      * You can call this API operation to query the details of an event rule.
      *
     */
    CompletableFuture<GetRuleResponse> getRule(GetRuleRequest request);

    /**
      * You can call this API operation to query all Alibaba Cloud service event sources.
      *
     */
    CompletableFuture<ListAliyunOfficialEventSourcesResponse> listAliyunOfficialEventSources(ListAliyunOfficialEventSourcesRequest request);

    /**
      * You can use this API operation to query a list of API destinations.
      *
     */
    CompletableFuture<ListApiDestinationsResponse> listApiDestinations(ListApiDestinationsRequest request);

    /**
      * You can call this API operation to query connections.
      *
     */
    CompletableFuture<ListConnectionsResponse> listConnections(ListConnectionsRequest request);

    /**
      * You can call this API operation to query all event buses.
      *
     */
    CompletableFuture<ListEventBusesResponse> listEventBuses(ListEventBusesRequest request);

    /**
      * You can call this API operation to query event streams.
      *
     */
    CompletableFuture<ListEventStreamingsResponse> listEventStreamings(ListEventStreamingsRequest request);

    /**
      * You can call this API operation to query all rules of an event bus.
      *
     */
    CompletableFuture<ListRulesResponse> listRules(ListRulesRequest request);

    CompletableFuture<ListTargetsResponse> listTargets(ListTargetsRequest request);

    /**
      * You can call this API operation to query custom event sources.
      *
     */
    CompletableFuture<ListUserDefinedEventSourcesResponse> listUserDefinedEventSources(ListUserDefinedEventSourcesRequest request);

    /**
      * You can call this API operation to stop an event stream that is running.
      *
     */
    CompletableFuture<PauseEventStreamingResponse> pauseEventStreaming(PauseEventStreamingRequest request);

    /**
      * You can call this API operation to create or update event targets under a rule.
      *
     */
    CompletableFuture<PutTargetsResponse> putTargets(PutTargetsRequest request);

    /**
      * You can call this API operation to query the content of an event.
      *
     */
    CompletableFuture<QueryEventResponse> queryEvent(QueryEventRequest request);

    /**
      * You can call this API operation to query event traces.
      *
     */
    CompletableFuture<QueryEventTracesResponse> queryEventTraces(QueryEventTracesRequest request);

    /**
      * You can call this API operation to query event traces by event ID.
      *
     */
    CompletableFuture<QueryTracedEventByEventIdResponse> queryTracedEventByEventId(QueryTracedEventByEventIdRequest request);

    /**
      * You can call this API operation to query event traces by time range.
      *
     */
    CompletableFuture<QueryTracedEventsResponse> queryTracedEvents(QueryTracedEventsRequest request);

    /**
      * You can call this API operation to enable a created or deactivated event stream.
      *
     */
    CompletableFuture<StartEventStreamingResponse> startEventStreaming(StartEventStreamingRequest request);

    /**
      * You can call this API operation to check whether the event pattern matches the provided JSON format.
      *
     */
    CompletableFuture<TestEventPatternResponse> testEventPattern(TestEventPatternRequest request);

    /**
      * You can call this API operation to update an API destination.
      *
     */
    CompletableFuture<UpdateApiDestinationResponse> updateApiDestination(UpdateApiDestinationRequest request);

    /**
      * You can call this API operation to update a connection.
      *
     */
    CompletableFuture<UpdateConnectionResponse> updateConnection(UpdateConnectionRequest request);

    /**
      * You can call this API operation to modify an event bus.
      *
     */
    CompletableFuture<UpdateEventBusResponse> updateEventBus(UpdateEventBusRequest request);

    /**
      * You can call this API operation to update an event source.
      *
     */
    CompletableFuture<UpdateEventSourceResponse> updateEventSource(UpdateEventSourceRequest request);

    /**
      * You can call this API operation to modify the information about an event stream, such as the basic information and the information about the event source, event filtering rule, and event target.
      *
     */
    CompletableFuture<UpdateEventStreamingResponse> updateEventStreaming(UpdateEventStreamingRequest request);

    /**
      * You can call this API operation to update the configurations of an event rule.
      *
     */
    CompletableFuture<UpdateRuleResponse> updateRule(UpdateRuleRequest request);

}
