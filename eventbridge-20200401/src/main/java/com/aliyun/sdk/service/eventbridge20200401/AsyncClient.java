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
     * @param request the request parameters of AskLuma  AskLumaRequest
     * @return AskLumaResponse
     */
    CompletableFuture<AskLumaResponse> askLuma(AskLumaRequest request);

    /**
     * <b>description</b> :
     * <p>Checks for a service-linked role by name.</p>
     * 
     * @param request the request parameters of CheckServiceLinkedRoleForProduct  CheckServiceLinkedRoleForProductRequest
     * @return CheckServiceLinkedRoleForProductResponse
     */
    CompletableFuture<CheckServiceLinkedRoleForProductResponse> checkServiceLinkedRoleForProduct(CheckServiceLinkedRoleForProductRequest request);

    /**
     * @param request the request parameters of CreateAgent  CreateAgentRequest
     * @return CreateAgentResponse
     */
    CompletableFuture<CreateAgentResponse> createAgent(CreateAgentRequest request);

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
     * <p>Creates a connection configuration.</p>
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
     * <p>Creates an external event source.</p>
     * 
     * @param request the request parameters of CreateEventSource  CreateEventSourceRequest
     * @return CreateEventSourceResponse
     */
    CompletableFuture<CreateEventSourceResponse> createEventSource(CreateEventSourceRequest request);

    /**
     * <b>description</b> :
     * <p>Creates an event stream.</p>
     * 
     * @param request the request parameters of CreateEventStreaming  CreateEventStreamingRequest
     * @return CreateEventStreamingResponse
     */
    CompletableFuture<CreateEventStreamingResponse> createEventStreaming(CreateEventStreamingRequest request);

    /**
     * @param request the request parameters of CreateNamespace  CreateNamespaceRequest
     * @return CreateNamespaceResponse
     */
    CompletableFuture<CreateNamespaceResponse> createNamespace(CreateNamespaceRequest request);

    /**
     * <b>description</b> :
     * <p>Creates an event rule.</p>
     * 
     * @param request the request parameters of CreateRule  CreateRuleRequest
     * @return CreateRuleResponse
     */
    CompletableFuture<CreateRuleResponse> createRule(CreateRuleRequest request);

    /**
     * <b>description</b> :
     * <p>Creates the service-linked role (SLR) that is associated with a specified product.</p>
     * 
     * @param request the request parameters of CreateServiceLinkedRoleForProduct  CreateServiceLinkedRoleForProductRequest
     * @return CreateServiceLinkedRoleForProductResponse
     */
    CompletableFuture<CreateServiceLinkedRoleForProductResponse> createServiceLinkedRoleForProduct(CreateServiceLinkedRoleForProductRequest request);

    /**
     * <b>description</b> :
     * <p>Creates an event target under the specified rule.</p>
     * 
     * @param request the request parameters of CreateTable  CreateTableRequest
     * @return CreateTableResponse
     */
    CompletableFuture<CreateTableResponse> createTable(CreateTableRequest request);

    /**
     * @param request the request parameters of DeleteAgent  DeleteAgentRequest
     * @return DeleteAgentResponse
     */
    CompletableFuture<DeleteAgentResponse> deleteAgent(DeleteAgentRequest request);

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
     * @param request the request parameters of DeleteEventAnalysisJob  DeleteEventAnalysisJobRequest
     * @return DeleteEventAnalysisJobResponse
     */
    CompletableFuture<DeleteEventAnalysisJobResponse> deleteEventAnalysisJob(DeleteEventAnalysisJobRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes an event bus.</p>
     * 
     * @param request the request parameters of DeleteEventBus  DeleteEventBusRequest
     * @return DeleteEventBusResponse
     */
    CompletableFuture<DeleteEventBusResponse> deleteEventBus(DeleteEventBusRequest request);

    /**
     * @param request the request parameters of DeleteEventHouseRuntime  DeleteEventHouseRuntimeRequest
     * @return DeleteEventHouseRuntimeResponse
     */
    CompletableFuture<DeleteEventHouseRuntimeResponse> deleteEventHouseRuntime(DeleteEventHouseRuntimeRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes an event source.</p>
     * 
     * @param request the request parameters of DeleteEventSource  DeleteEventSourceRequest
     * @return DeleteEventSourceResponse
     */
    CompletableFuture<DeleteEventSourceResponse> deleteEventSource(DeleteEventSourceRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes an event stream.</p>
     * 
     * @param request the request parameters of DeleteEventStreaming  DeleteEventStreamingRequest
     * @return DeleteEventStreamingResponse
     */
    CompletableFuture<DeleteEventStreamingResponse> deleteEventStreaming(DeleteEventStreamingRequest request);

    /**
     * @param request the request parameters of DeleteNamespace  DeleteNamespaceRequest
     * @return DeleteNamespaceResponse
     */
    CompletableFuture<DeleteNamespaceResponse> deleteNamespace(DeleteNamespaceRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to delete an event rule.</p>
     * 
     * @param request the request parameters of DeleteRule  DeleteRuleRequest
     * @return DeleteRuleResponse
     */
    CompletableFuture<DeleteRuleResponse> deleteRule(DeleteRuleRequest request);

    /**
     * @param request the request parameters of DeleteTable  DeleteTableRequest
     * @return DeleteTableResponse
     */
    CompletableFuture<DeleteTableResponse> deleteTable(DeleteTableRequest request);

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
     * <p>Discovers information about an event source.</p>
     * 
     * @param request the request parameters of DiscoverEventSource  DiscoverEventSourceRequest
     * @return DiscoverEventSourceResponse
     */
    CompletableFuture<DiscoverEventSourceResponse> discoverEventSource(DiscoverEventSourceRequest request);

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
     * @param request the request parameters of GenerateAgentDataSemantics  GenerateAgentDataSemanticsRequest
     * @return GenerateAgentDataSemanticsResponse
     */
    CompletableFuture<GenerateAgentDataSemanticsResponse> generateAgentDataSemantics(GenerateAgentDataSemanticsRequest request);

    /**
     * @param request the request parameters of GetAgent  GetAgentRequest
     * @return GetAgentResponse
     */
    CompletableFuture<GetAgentResponse> getAgent(GetAgentRequest request);

    /**
     * @param request the request parameters of GetAgentDataSemantics  GetAgentDataSemanticsRequest
     * @return GetAgentDataSemanticsResponse
     */
    CompletableFuture<GetAgentDataSemanticsResponse> getAgentDataSemantics(GetAgentDataSemanticsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query the information about an API destination.</p>
     * 
     * @param request the request parameters of GetApiDestination  GetApiDestinationRequest
     * @return GetApiDestinationResponse
     */
    CompletableFuture<GetApiDestinationResponse> getApiDestination(GetApiDestinationRequest request);

    /**
     * @param request the request parameters of GetCatalog  GetCatalogRequest
     * @return GetCatalogResponse
     */
    CompletableFuture<GetCatalogResponse> getCatalog(GetCatalogRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the configuration of a single connection.</p>
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
     * @param request the request parameters of GetEventHouseRuntime  GetEventHouseRuntimeRequest
     * @return GetEventHouseRuntimeResponse
     */
    CompletableFuture<GetEventHouseRuntimeResponse> getEventHouseRuntime(GetEventHouseRuntimeRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the details of an event stream.</p>
     * 
     * @param request the request parameters of GetEventStreaming  GetEventStreamingRequest
     * @return GetEventStreamingResponse
     */
    CompletableFuture<GetEventStreamingResponse> getEventStreaming(GetEventStreamingRequest request);

    /**
     * @param request the request parameters of GetGenerateAgentDataSemanticsProgress  GetGenerateAgentDataSemanticsProgressRequest
     * @return GetGenerateAgentDataSemanticsProgressResponse
     */
    CompletableFuture<GetGenerateAgentDataSemanticsProgressResponse> getGenerateAgentDataSemanticsProgress(GetGenerateAgentDataSemanticsProgressRequest request);

    /**
     * @param request the request parameters of GetNamespace  GetNamespaceRequest
     * @return GetNamespaceResponse
     */
    CompletableFuture<GetNamespaceResponse> getNamespace(GetNamespaceRequest request);

    /**
     * <b>description</b> :
     * <p>Gets the details of an event rule.</p>
     * 
     * @param request the request parameters of GetRule  GetRuleRequest
     * @return GetRuleResponse
     */
    CompletableFuture<GetRuleResponse> getRule(GetRuleRequest request);

    /**
     * @param request the request parameters of GetTable  GetTableRequest
     * @return GetTableResponse
     */
    CompletableFuture<GetTableResponse> getTable(GetTableRequest request);

    /**
     * @param request the request parameters of ListAgents  ListAgentsRequest
     * @return ListAgentsResponse
     */
    CompletableFuture<ListAgentsResponse> listAgents(ListAgentsRequest request);

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
     * @param request the request parameters of ListCatalogs  ListCatalogsRequest
     * @return ListCatalogsResponse
     */
    CompletableFuture<ListCatalogsResponse> listCatalogs(ListCatalogsRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves a list of connection configurations.</p>
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
     * @param request the request parameters of ListEventHouseRuntimes  ListEventHouseRuntimesRequest
     * @return ListEventHouseRuntimesResponse
     */
    CompletableFuture<ListEventHouseRuntimesResponse> listEventHouseRuntimes(ListEventHouseRuntimesRequest request);

    /**
     * <b>description</b> :
     * <p>Queries event streams.</p>
     * 
     * @param request the request parameters of ListEventStreamings  ListEventStreamingsRequest
     * @return ListEventStreamingsResponse
     */
    CompletableFuture<ListEventStreamingsResponse> listEventStreamings(ListEventStreamingsRequest request);

    /**
     * @param request the request parameters of ListNamespaces  ListNamespacesRequest
     * @return ListNamespacesResponse
     */
    CompletableFuture<ListNamespacesResponse> listNamespaces(ListNamespacesRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query all rules of an event bus.</p>
     * 
     * @param request the request parameters of ListRules  ListRulesRequest
     * @return ListRulesResponse
     */
    CompletableFuture<ListRulesResponse> listRules(ListRulesRequest request);

    /**
     * @param request the request parameters of ListTables  ListTablesRequest
     * @return ListTablesResponse
     */
    CompletableFuture<ListTablesResponse> listTables(ListTablesRequest request);

    /**
     * @param request the request parameters of ListTargets  ListTargetsRequest
     * @return ListTargetsResponse
     */
    CompletableFuture<ListTargetsResponse> listTargets(ListTargetsRequest request);

    /**
     * <b>description</b> :
     * <p>Queries all custom event sources.</p>
     * 
     * @param request the request parameters of ListUserDefinedEventSources  ListUserDefinedEventSourcesRequest
     * @return ListUserDefinedEventSourcesResponse
     */
    CompletableFuture<ListUserDefinedEventSourcesResponse> listUserDefinedEventSources(ListUserDefinedEventSourcesRequest request);

    /**
     * <b>description</b> :
     * <p>Pauses a running event stream.</p>
     * 
     * @param request the request parameters of PauseEventStreaming  PauseEventStreamingRequest
     * @return PauseEventStreamingResponse
     */
    CompletableFuture<PauseEventStreamingResponse> pauseEventStreaming(PauseEventStreamingRequest request);

    /**
     * @param request the request parameters of PollAskResult  PollAskResultRequest
     * @return PollAskResultResponse
     */
    CompletableFuture<PollAskResultResponse> pollAskResult(PollAskResultRequest request);

    /**
     * <b>description</b> :
     * <p>Sends one or more events to an event bus.</p>
     * 
     * @param request the request parameters of PutEvents  PutEventsRequest
     * @return PutEventsResponse
     */
    CompletableFuture<PutEventsResponse> putEvents(PutEventsRequest request);

    /**
     * <b>description</b> :
     * <p>Creates or updates event targets for a specified rule.</p>
     * 
     * @param request the request parameters of PutTargets  PutTargetsRequest
     * @return PutTargetsResponse
     */
    CompletableFuture<PutTargetsResponse> putTargets(PutTargetsRequest request);

    /**
     * @param request the request parameters of QueryAskLumaLog  QueryAskLumaLogRequest
     * @return QueryAskLumaLogResponse
     */
    CompletableFuture<QueryAskLumaLogResponse> queryAskLumaLog(QueryAskLumaLogRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query the content of an event.</p>
     * 
     * @param request the request parameters of QueryEvent  QueryEventRequest
     * @return QueryEventResponse
     */
    CompletableFuture<QueryEventResponse> queryEvent(QueryEventRequest request);

    /**
     * @param request the request parameters of QueryEventHouse  QueryEventHouseRequest
     * @return QueryEventHouseResponse
     */
    CompletableFuture<QueryEventHouseResponse> queryEventHouse(QueryEventHouseRequest request);

    /**
     * <b>description</b> :
     * <p>Executes a single read-only SQL statement and returns a structured result set. BeginTime and EndTime only constrain the internal EventHouse data referenced in the SQL statement and do not affect mounted external data sources.</p>
     * 
     * @param request the request parameters of QueryEventHouseWithTimeRange  QueryEventHouseWithTimeRangeRequest
     * @return QueryEventHouseWithTimeRangeResponse
     */
    CompletableFuture<QueryEventHouseWithTimeRangeResponse> queryEventHouseWithTimeRange(QueryEventHouseWithTimeRangeRequest request);

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
     * <p>Queries for event traces within a specified time range.</p>
     * 
     * @param request the request parameters of QueryTracedEvents  QueryTracedEventsRequest
     * @return QueryTracedEventsResponse
     */
    CompletableFuture<QueryTracedEventsResponse> queryTracedEvents(QueryTracedEventsRequest request);

    /**
     * @param request the request parameters of SaveAgentDataSemantics  SaveAgentDataSemanticsRequest
     * @return SaveAgentDataSemanticsResponse
     */
    CompletableFuture<SaveAgentDataSemanticsResponse> saveAgentDataSemantics(SaveAgentDataSemanticsRequest request);

    /**
     * <b>description</b> :
     * <p>Enables a created or disabled event stream.</p>
     * 
     * @param request the request parameters of StartEventStreaming  StartEventStreamingRequest
     * @return StartEventStreamingResponse
     */
    CompletableFuture<StartEventStreamingResponse> startEventStreaming(StartEventStreamingRequest request);

    /**
     * <b>description</b> :
     * <p>Use this action to test an event pattern before you apply it to a rule.</p>
     * 
     * @param request the request parameters of TestEventPattern  TestEventPatternRequest
     * @return TestEventPatternResponse
     */
    CompletableFuture<TestEventPatternResponse> testEventPattern(TestEventPatternRequest request);

    /**
     * <b>description</b> :
     * <p>Returns a list of all external event sources.</p>
     * 
     * @param request the request parameters of TestEventSourceConfig  TestEventSourceConfigRequest
     * @return TestEventSourceConfigResponse
     */
    CompletableFuture<TestEventSourceConfigResponse> testEventSourceConfig(TestEventSourceConfigRequest request);

    /**
     * @param request the request parameters of UpdateAgent  UpdateAgentRequest
     * @return UpdateAgentResponse
     */
    CompletableFuture<UpdateAgentResponse> updateAgent(UpdateAgentRequest request);

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
     * <p>Updates connection configurations.</p>
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
     * @param request the request parameters of UpdateEventHouseRuntime  UpdateEventHouseRuntimeRequest
     * @return UpdateEventHouseRuntimeResponse
     */
    CompletableFuture<UpdateEventHouseRuntimeResponse> updateEventHouseRuntime(UpdateEventHouseRuntimeRequest request);

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
     * <p>Modifies the basic information, event source information, event filtering pattern, or event target information of an event stream.</p>
     * 
     * @param request the request parameters of UpdateEventStreaming  UpdateEventStreamingRequest
     * @return UpdateEventStreamingResponse
     */
    CompletableFuture<UpdateEventStreamingResponse> updateEventStreaming(UpdateEventStreamingRequest request);

    /**
     * <b>description</b> :
     * <p>Updates the billing method, compute unit (CU) resources, and other configurations of an event stream.</p>
     * 
     * @param request the request parameters of UpdateEventStreamingBusinessOption  UpdateEventStreamingBusinessOptionRequest
     * @return UpdateEventStreamingBusinessOptionResponse
     */
    CompletableFuture<UpdateEventStreamingBusinessOptionResponse> updateEventStreamingBusinessOption(UpdateEventStreamingBusinessOptionRequest request);

    /**
     * @param request the request parameters of UpdateNamespace  UpdateNamespaceRequest
     * @return UpdateNamespaceResponse
     */
    CompletableFuture<UpdateNamespaceResponse> updateNamespace(UpdateNamespaceRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to update the configurations of an event rule.</p>
     * 
     * @param request the request parameters of UpdateRule  UpdateRuleRequest
     * @return UpdateRuleResponse
     */
    CompletableFuture<UpdateRuleResponse> updateRule(UpdateRuleRequest request);

    /**
     * <b>description</b> :
     * <p>Updates the configuration of an event rule.</p>
     * 
     * @param request the request parameters of UpdateTable  UpdateTableRequest
     * @return UpdateTableResponse
     */
    CompletableFuture<UpdateTableResponse> updateTable(UpdateTableRequest request);

}
