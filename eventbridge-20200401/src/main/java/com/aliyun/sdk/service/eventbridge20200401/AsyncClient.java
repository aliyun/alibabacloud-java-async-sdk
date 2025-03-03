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
     * <b>description</b> :
     * <p>You can call this API operation to create an API destination.</p>
     * 
     * @param request the request parameters of CreateApiDestination  CreateApiDestinationRequest
     * @return CreateApiDestinationResponse
     */
    CompletableFuture<CreateApiDestinationResponse> createApiDestination(CreateApiDestinationRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to create a connection.</p>
     * 
     * @param request the request parameters of CreateConnection  CreateConnectionRequest
     * @return CreateConnectionResponse
     */
    CompletableFuture<CreateConnectionResponse> createConnection(CreateConnectionRequest request);

    /**
     * <b>description</b> :
     * <p>Creates an event bus.</p>
     * 
     * @param request the request parameters of CreateEventBus  CreateEventBusRequest
     * @return CreateEventBusResponse
     */
    CompletableFuture<CreateEventBusResponse> createEventBus(CreateEventBusRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to create an event source.</p>
     * 
     * @param request the request parameters of CreateEventSource  CreateEventSourceRequest
     * @return CreateEventSourceResponse
     */
    CompletableFuture<CreateEventSourceResponse> createEventSource(CreateEventSourceRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to create an event stream.</p>
     * 
     * @param request the request parameters of CreateEventStreaming  CreateEventStreamingRequest
     * @return CreateEventStreamingResponse
     */
    CompletableFuture<CreateEventStreamingResponse> createEventStreaming(CreateEventStreamingRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to create an event rule.</p>
     * 
     * @param request the request parameters of CreateRule  CreateRuleRequest
     * @return CreateRuleResponse
     */
    CompletableFuture<CreateRuleResponse> createRule(CreateRuleRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to create a service-linked role for your cloud service.</p>
     * 
     * @param request the request parameters of CreateServiceLinkedRoleForProduct  CreateServiceLinkedRoleForProductRequest
     * @return CreateServiceLinkedRoleForProductResponse
     */
    CompletableFuture<CreateServiceLinkedRoleForProductResponse> createServiceLinkedRoleForProduct(CreateServiceLinkedRoleForProductRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to delete an API destination.</p>
     * 
     * @param request the request parameters of DeleteApiDestination  DeleteApiDestinationRequest
     * @return DeleteApiDestinationResponse
     */
    CompletableFuture<DeleteApiDestinationResponse> deleteApiDestination(DeleteApiDestinationRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to delete a connection.</p>
     * 
     * @param request the request parameters of DeleteConnection  DeleteConnectionRequest
     * @return DeleteConnectionResponse
     */
    CompletableFuture<DeleteConnectionResponse> deleteConnection(DeleteConnectionRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to delete an event bus.</p>
     * 
     * @param request the request parameters of DeleteEventBus  DeleteEventBusRequest
     * @return DeleteEventBusResponse
     */
    CompletableFuture<DeleteEventBusResponse> deleteEventBus(DeleteEventBusRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to delete an event source.</p>
     * 
     * @param request the request parameters of DeleteEventSource  DeleteEventSourceRequest
     * @return DeleteEventSourceResponse
     */
    CompletableFuture<DeleteEventSourceResponse> deleteEventSource(DeleteEventSourceRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to delete an event stream.</p>
     * 
     * @param request the request parameters of DeleteEventStreaming  DeleteEventStreamingRequest
     * @return DeleteEventStreamingResponse
     */
    CompletableFuture<DeleteEventStreamingResponse> deleteEventStreaming(DeleteEventStreamingRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to delete an event rule.</p>
     * 
     * @param request the request parameters of DeleteRule  DeleteRuleRequest
     * @return DeleteRuleResponse
     */
    CompletableFuture<DeleteRuleResponse> deleteRule(DeleteRuleRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to delete one or more event targets of an event rule.</p>
     * 
     * @param request the request parameters of DeleteTargets  DeleteTargetsRequest
     * @return DeleteTargetsResponse
     */
    CompletableFuture<DeleteTargetsResponse> deleteTargets(DeleteTargetsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to disable an event rule.</p>
     * 
     * @param request the request parameters of DisableRule  DisableRuleRequest
     * @return DisableRuleResponse
     */
    CompletableFuture<DisableRuleResponse> disableRule(DisableRuleRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to enable an event rule.</p>
     * 
     * @param request the request parameters of EnableRule  EnableRuleRequest
     * @return EnableRuleResponse
     */
    CompletableFuture<EnableRuleResponse> enableRule(EnableRuleRequest request);

    /**
     * @param request the request parameters of EventCenterQueryEvents  EventCenterQueryEventsRequest
     * @return EventCenterQueryEventsResponse
     */
    CompletableFuture<EventCenterQueryEventsResponse> eventCenterQueryEvents(EventCenterQueryEventsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query the information about an API destination.</p>
     * 
     * @param request the request parameters of GetApiDestination  GetApiDestinationRequest
     * @return GetApiDestinationResponse
     */
    CompletableFuture<GetApiDestinationResponse> getApiDestination(GetApiDestinationRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query the configurations of a connection.</p>
     * 
     * @param request the request parameters of GetConnection  GetConnectionRequest
     * @return GetConnectionResponse
     */
    CompletableFuture<GetConnectionResponse> getConnection(GetConnectionRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query the detailed information about an event bus.</p>
     * 
     * @param request the request parameters of GetEventBus  GetEventBusRequest
     * @return GetEventBusResponse
     */
    CompletableFuture<GetEventBusResponse> getEventBus(GetEventBusRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query the details of an event stream.</p>
     * 
     * @param request the request parameters of GetEventStreaming  GetEventStreamingRequest
     * @return GetEventStreamingResponse
     */
    CompletableFuture<GetEventStreamingResponse> getEventStreaming(GetEventStreamingRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query the details of an event rule.</p>
     * 
     * @param request the request parameters of GetRule  GetRuleRequest
     * @return GetRuleResponse
     */
    CompletableFuture<GetRuleResponse> getRule(GetRuleRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query all Alibaba Cloud service event sources.</p>
     * 
     * @param request the request parameters of ListAliyunOfficialEventSources  ListAliyunOfficialEventSourcesRequest
     * @return ListAliyunOfficialEventSourcesResponse
     */
    CompletableFuture<ListAliyunOfficialEventSourcesResponse> listAliyunOfficialEventSources(ListAliyunOfficialEventSourcesRequest request);

    /**
     * <b>description</b> :
     * <p>You can use this API operation to query a list of API destinations.</p>
     * 
     * @param request the request parameters of ListApiDestinations  ListApiDestinationsRequest
     * @return ListApiDestinationsResponse
     */
    CompletableFuture<ListApiDestinationsResponse> listApiDestinations(ListApiDestinationsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query connections.</p>
     * 
     * @param request the request parameters of ListConnections  ListConnectionsRequest
     * @return ListConnectionsResponse
     */
    CompletableFuture<ListConnectionsResponse> listConnections(ListConnectionsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query all event buses.</p>
     * 
     * @param request the request parameters of ListEventBuses  ListEventBusesRequest
     * @return ListEventBusesResponse
     */
    CompletableFuture<ListEventBusesResponse> listEventBuses(ListEventBusesRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query event streams.</p>
     * 
     * @param request the request parameters of ListEventStreamings  ListEventStreamingsRequest
     * @return ListEventStreamingsResponse
     */
    CompletableFuture<ListEventStreamingsResponse> listEventStreamings(ListEventStreamingsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query all rules of an event bus.</p>
     * 
     * @param request the request parameters of ListRules  ListRulesRequest
     * @return ListRulesResponse
     */
    CompletableFuture<ListRulesResponse> listRules(ListRulesRequest request);

    /**
     * @param request the request parameters of ListTargets  ListTargetsRequest
     * @return ListTargetsResponse
     */
    CompletableFuture<ListTargetsResponse> listTargets(ListTargetsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query custom event sources.</p>
     * 
     * @param request the request parameters of ListUserDefinedEventSources  ListUserDefinedEventSourcesRequest
     * @return ListUserDefinedEventSourcesResponse
     */
    CompletableFuture<ListUserDefinedEventSourcesResponse> listUserDefinedEventSources(ListUserDefinedEventSourcesRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to stop an event stream that is running.</p>
     * 
     * @param request the request parameters of PauseEventStreaming  PauseEventStreamingRequest
     * @return PauseEventStreamingResponse
     */
    CompletableFuture<PauseEventStreamingResponse> pauseEventStreaming(PauseEventStreamingRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to create or update event targets under a rule.</p>
     * 
     * @param request the request parameters of PutTargets  PutTargetsRequest
     * @return PutTargetsResponse
     */
    CompletableFuture<PutTargetsResponse> putTargets(PutTargetsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query the content of an event.</p>
     * 
     * @param request the request parameters of QueryEvent  QueryEventRequest
     * @return QueryEventResponse
     */
    CompletableFuture<QueryEventResponse> queryEvent(QueryEventRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query event traces.</p>
     * 
     * @param request the request parameters of QueryEventTraces  QueryEventTracesRequest
     * @return QueryEventTracesResponse
     */
    CompletableFuture<QueryEventTracesResponse> queryEventTraces(QueryEventTracesRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query event traces by event ID.</p>
     * 
     * @param request the request parameters of QueryTracedEventByEventId  QueryTracedEventByEventIdRequest
     * @return QueryTracedEventByEventIdResponse
     */
    CompletableFuture<QueryTracedEventByEventIdResponse> queryTracedEventByEventId(QueryTracedEventByEventIdRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query event traces by time range.</p>
     * 
     * @param request the request parameters of QueryTracedEvents  QueryTracedEventsRequest
     * @return QueryTracedEventsResponse
     */
    CompletableFuture<QueryTracedEventsResponse> queryTracedEvents(QueryTracedEventsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to enable a created or deactivated event stream.</p>
     * 
     * @param request the request parameters of StartEventStreaming  StartEventStreamingRequest
     * @return StartEventStreamingResponse
     */
    CompletableFuture<StartEventStreamingResponse> startEventStreaming(StartEventStreamingRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to check whether the event pattern matches the provided JSON format.</p>
     * 
     * @param request the request parameters of TestEventPattern  TestEventPatternRequest
     * @return TestEventPatternResponse
     */
    CompletableFuture<TestEventPatternResponse> testEventPattern(TestEventPatternRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to update an API destination.</p>
     * 
     * @param request the request parameters of UpdateApiDestination  UpdateApiDestinationRequest
     * @return UpdateApiDestinationResponse
     */
    CompletableFuture<UpdateApiDestinationResponse> updateApiDestination(UpdateApiDestinationRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to update a connection.</p>
     * 
     * @param request the request parameters of UpdateConnection  UpdateConnectionRequest
     * @return UpdateConnectionResponse
     */
    CompletableFuture<UpdateConnectionResponse> updateConnection(UpdateConnectionRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to update an event bus.</p>
     * 
     * @param request the request parameters of UpdateEventBus  UpdateEventBusRequest
     * @return UpdateEventBusResponse
     */
    CompletableFuture<UpdateEventBusResponse> updateEventBus(UpdateEventBusRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to update an event source.</p>
     * 
     * @param request the request parameters of UpdateEventSource  UpdateEventSourceRequest
     * @return UpdateEventSourceResponse
     */
    CompletableFuture<UpdateEventSourceResponse> updateEventSource(UpdateEventSourceRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to modify the information about an event stream, such as the basic information and the information about the event source, event filtering rule, and event target.</p>
     * 
     * @param request the request parameters of UpdateEventStreaming  UpdateEventStreamingRequest
     * @return UpdateEventStreamingResponse
     */
    CompletableFuture<UpdateEventStreamingResponse> updateEventStreaming(UpdateEventStreamingRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to update the configurations of an event rule.</p>
     * 
     * @param request the request parameters of UpdateRule  UpdateRuleRequest
     * @return UpdateRuleResponse
     */
    CompletableFuture<UpdateRuleResponse> updateRule(UpdateRuleRequest request);

}
