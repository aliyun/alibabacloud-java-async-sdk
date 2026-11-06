// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cloud_siem20241212.models.*;
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
     * <p>Cancels a specified security operations Agent conversation turn. Before calling this operation, use CreateCopilotConversation to create a session and obtain the ConversationId, then use CreateCopilotChat to initiate a streaming conversation and obtain the TurnId from the response.</p>
     * 
     * @param request the request parameters of CancelCopilotTurn  CancelCopilotTurnRequest
     * @return CancelCopilotTurnResponse
     */
    CompletableFuture<CancelCopilotTurnResponse> cancelCopilotTurn(CancelCopilotTurnRequest request);

    /**
     * <b>description</b> :
     * <p>Checks the execution status of a specified upgrade item. You must specify the upgrade item ID (UpgradeItemId) when calling this operation. The response includes the checkpoint status (CheckStatus) and check result (CheckResult) of the upgrade item.</p>
     * 
     * @param request the request parameters of CheckUpgradeItem  CheckUpgradeItemRequest
     * @return CheckUpgradeItemResponse
     */
    CompletableFuture<CheckUpgradeItemResponse> checkUpgradeItem(CheckUpgradeItemRequest request);

    /**
     * <b>description</b> :
     * <p>The request parameter JsonConfig is a complex JSON configuration. A utility class is provided to help with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of CreateAutoDisposeConfig  CreateAutoDisposeConfigRequest
     * @return CreateAutoDisposeConfigResponse
     */
    CompletableFuture<CreateAutoDisposeConfigResponse> createAutoDisposeConfig(CreateAutoDisposeConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Sends a message to a security operations agent session and returns the result as an SSE event stream.</p>
     * 
     * @param request the request parameters of CreateCopilotChat  CreateCopilotChatRequest
     * @return CreateCopilotChatResponse
     */
    CompletableFuture<CreateCopilotChatResponse> createCopilotChat(CreateCopilotChatRequest request);

    ResponseIterable<String> createCopilotChatWithResponseIterable(CreateCopilotChatRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a security operations Agent session.</p>
     * 
     * @param request the request parameters of CreateCopilotConversation  CreateCopilotConversationRequest
     * @return CreateCopilotConversationResponse
     */
    CompletableFuture<CreateCopilotConversationResponse> createCopilotConversation(CreateCopilotConversationRequest request);

    /**
     * @param request the request parameters of CreateDataIngestion  CreateDataIngestionRequest
     * @return CreateDataIngestionResponse
     */
    CompletableFuture<CreateDataIngestionResponse> createDataIngestion(CreateDataIngestionRequest request);

    /**
     * @param request the request parameters of CreateDataSet  CreateDataSetRequest
     * @return CreateDataSetResponse
     */
    CompletableFuture<CreateDataSetResponse> createDataSet(CreateDataSetRequest request);

    /**
     * <b>description</b> :
     * <p>The JSON Configurations input parameter is a complex JSON configuration. A supporting tool is provided to assist with specific configuration examples. For more information, see <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of CreateDataSource  CreateDataSourceRequest
     * @return CreateDataSourceResponse
     */
    CompletableFuture<CreateDataSourceResponse> createDataSource(CreateDataSourceRequest request);

    /**
     * @param request the request parameters of CreateDetectionRule  CreateDetectionRuleRequest
     * @return CreateDetectionRuleResponse
     */
    CompletableFuture<CreateDetectionRuleResponse> createDetectionRule(CreateDetectionRuleRequest request);

    /**
     * @param request the request parameters of CreateExportTask  CreateExportTaskRequest
     * @return CreateExportTaskResponse
     */
    CompletableFuture<CreateExportTaskResponse> createExportTask(CreateExportTaskRequest request);

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON Configurations string. We provide a utility class to help with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of CreateLogStore  CreateLogStoreRequest
     * @return CreateLogStoreResponse
     */
    CompletableFuture<CreateLogStoreResponse> createLogStore(CreateLogStoreRequest request);

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. A utility class is provided to help with specific configuration examples. Refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of CreateNormalizationRule  CreateNormalizationRuleRequest
     * @return CreateNormalizationRuleResponse
     */
    CompletableFuture<CreateNormalizationRuleResponse> createNormalizationRule(CreateNormalizationRuleRequest request);

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. To help with specific configuration examples, we provide a supporting utility class. Refer to the <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of CreateNormalizationSchema  CreateNormalizationSchemaRequest
     * @return CreateNormalizationSchemaResponse
     */
    CompletableFuture<CreateNormalizationSchemaResponse> createNormalizationSchema(CreateNormalizationSchemaRequest request);

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex set of JSON Configurations. We provide a utility class with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of CreateProduct  CreateProductRequest
     * @return CreateProductResponse
     */
    CompletableFuture<CreateProductResponse> createProduct(CreateProductRequest request);

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a complex JSON configuration. A utility class is provided to assist with specific configuration examples. For more information, see <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of CreateResponseRule  CreateResponseRuleRequest
     * @return CreateResponseRuleResponse
     */
    CompletableFuture<CreateResponseRuleResponse> createResponseRule(CreateResponseRuleRequest request);

    /**
     * @param request the request parameters of CreateVendor  CreateVendorRequest
     * @return CreateVendorResponse
     */
    CompletableFuture<CreateVendorResponse> createVendor(CreateVendorRequest request);

    /**
     * @param request the request parameters of DeleteDataIngestion  DeleteDataIngestionRequest
     * @return DeleteDataIngestionResponse
     */
    CompletableFuture<DeleteDataIngestionResponse> deleteDataIngestion(DeleteDataIngestionRequest request);

    /**
     * @param request the request parameters of DeleteDataSet  DeleteDataSetRequest
     * @return DeleteDataSetResponse
     */
    CompletableFuture<DeleteDataSetResponse> deleteDataSet(DeleteDataSetRequest request);

    /**
     * @param request the request parameters of DeleteDataSetRecord  DeleteDataSetRecordRequest
     * @return DeleteDataSetRecordResponse
     */
    CompletableFuture<DeleteDataSetRecordResponse> deleteDataSetRecord(DeleteDataSetRecordRequest request);

    /**
     * @param request the request parameters of DeleteDataSource  DeleteDataSourceRequest
     * @return DeleteDataSourceResponse
     */
    CompletableFuture<DeleteDataSourceResponse> deleteDataSource(DeleteDataSourceRequest request);

    /**
     * @param request the request parameters of DeleteDetectionRule  DeleteDetectionRuleRequest
     * @return DeleteDetectionRuleResponse
     */
    CompletableFuture<DeleteDetectionRuleResponse> deleteDetectionRule(DeleteDetectionRuleRequest request);

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration string. We provide a utility class with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of DeleteLogStore  DeleteLogStoreRequest
     * @return DeleteLogStoreResponse
     */
    CompletableFuture<DeleteLogStoreResponse> deleteLogStore(DeleteLogStoreRequest request);

    /**
     * @param request the request parameters of DeleteNormalizationRule  DeleteNormalizationRuleRequest
     * @return DeleteNormalizationRuleResponse
     */
    CompletableFuture<DeleteNormalizationRuleResponse> deleteNormalizationRule(DeleteNormalizationRuleRequest request);

    /**
     * @param request the request parameters of DeleteNormalizationRuleVersion  DeleteNormalizationRuleVersionRequest
     * @return DeleteNormalizationRuleVersionResponse
     */
    CompletableFuture<DeleteNormalizationRuleVersionResponse> deleteNormalizationRuleVersion(DeleteNormalizationRuleVersionRequest request);

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a complex JSON configuration. A utility class is provided to assist with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of DeleteNormalizationSchema  DeleteNormalizationSchemaRequest
     * @return DeleteNormalizationSchemaResponse
     */
    CompletableFuture<DeleteNormalizationSchemaResponse> deleteNormalizationSchema(DeleteNormalizationSchemaRequest request);

    /**
     * @param request the request parameters of DeleteProduct  DeleteProductRequest
     * @return DeleteProductResponse
     */
    CompletableFuture<DeleteProductResponse> deleteProduct(DeleteProductRequest request);

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time limits. Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent at other times.</p>
     * 
     * @param request the request parameters of DeleteResponseRule  DeleteResponseRuleRequest
     * @return DeleteResponseRuleResponse
     */
    CompletableFuture<DeleteResponseRuleResponse> deleteResponseRule(DeleteResponseRuleRequest request);

    /**
     * @param request the request parameters of DeleteVendor  DeleteVendorRequest
     * @return DeleteVendorResponse
     */
    CompletableFuture<DeleteVendorResponse> deleteVendor(DeleteVendorRequest request);

    /**
     * @param request the request parameters of DisableDataIngestion  DisableDataIngestionRequest
     * @return DisableDataIngestionResponse
     */
    CompletableFuture<DisableDataIngestionResponse> disableDataIngestion(DisableDataIngestionRequest request);

    /**
     * @param request the request parameters of EnableDataIngestion  EnableDataIngestionRequest
     * @return EnableDataIngestionResponse
     */
    CompletableFuture<EnableDataIngestionResponse> enableDataIngestion(EnableDataIngestionRequest request);

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a highly complex JSON configuration. A supporting utility class is provided to help with specific configuration examples. For more information, see <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of ExecuteAutoDisposeRecords  ExecuteAutoDisposeRecordsRequest
     * @return ExecuteAutoDisposeRecordsResponse
     */
    CompletableFuture<ExecuteAutoDisposeRecordsResponse> executeAutoDisposeRecords(ExecuteAutoDisposeRecordsRequest request);

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. To help you configure it, a utility class is provided. For specific configuration examples, refer to the <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of ExecuteLogQuery  ExecuteLogQueryRequest
     * @return ExecuteLogQueryResponse
     */
    CompletableFuture<ExecuteLogQueryResponse> executeLogQuery(ExecuteLogQueryRequest request);

    /**
     * <b>description</b> :
     * <p>The JsonConfig input parameter is a complex JSON configuration string. We provide a utility class to help with specific configuration examples. For more information, see <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * <h3>Before you begin</h3>
     * <ol>
     * <li>Before calling this operation, ensure that a pending upgrade order exists (created through the Alibaba Cloud Management Console or a business flow).</li>
     * <li>Call ListUpgradeItems to view the items that can be upgraded, and call CheckUpgradeItem to perform a dry run.</li>
     * <li>If no items can be upgraded, the API returns an error.</li>
     * </ol>
     * 
     * @param request the request parameters of ExecuteUpgrade  ExecuteUpgradeRequest
     * @return ExecuteUpgradeResponse
     */
    CompletableFuture<ExecuteUpgradeResponse> executeUpgrade(ExecuteUpgradeRequest request);

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. We provide a utility class to help with specific configuration examples. For more information, see <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of GetAlert  GetAlertRequest
     * @return GetAlertResponse
     */
    CompletableFuture<GetAlertResponse> getAlert(GetAlertRequest request);

    /**
     * <b>description</b> :
     * <p>The request parameter JsonConfig is a highly complex JSON configuration. To simplify this, we provide a utility class for specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of GetAutoDisposeConfig  GetAutoDisposeConfigRequest
     * @return GetAutoDisposeConfigResponse
     */
    CompletableFuture<GetAutoDisposeConfigResponse> getAutoDisposeConfig(GetAutoDisposeConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Queries a specified security operations agent session.</p>
     * 
     * @param request the request parameters of GetCopilotConversation  GetCopilotConversationRequest
     * @return GetCopilotConversationResponse
     */
    CompletableFuture<GetCopilotConversationResponse> getCopilotConversation(GetCopilotConversationRequest request);

    /**
     * <b>description</b> :
     * <p>Queries a specified Security Operations agent conversation turn. Before calling this operation, call CreateCopilotConversation to create a session and obtain the ConversationId, and then call CreateCopilotChat to initiate a conversation and obtain the TurnId.</p>
     * 
     * @param request the request parameters of GetCopilotTurn  GetCopilotTurnRequest
     * @return GetCopilotTurnResponse
     */
    CompletableFuture<GetCopilotTurnResponse> getCopilotTurn(GetCopilotTurnRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the security operations agent conversation turn based on the client message ID. Before calling this operation, call CreateCopilotConversation to create a conversation and then call CreateCopilotChat to initiate a conversation. The ClientMessageId is specified by the client when initiating the conversation.</p>
     * 
     * @param request the request parameters of GetCopilotTurnByClientMessageId  GetCopilotTurnByClientMessageIdRequest
     * @return GetCopilotTurnByClientMessageIdResponse
     */
    CompletableFuture<GetCopilotTurnByClientMessageIdResponse> getCopilotTurnByClientMessageId(GetCopilotTurnByClientMessageIdRequest request);

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration string. We provide a utility class to help with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of GetDataBatchIngestion  GetDataBatchIngestionRequest
     * @return GetDataBatchIngestionResponse
     */
    CompletableFuture<GetDataBatchIngestionResponse> getDataBatchIngestion(GetDataBatchIngestionRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the log storage region, project, capacity, Logstore, and multi-account delivery settings of the current account. Before you update the multi-account configuration, read Data.DeliverySettings.ConfigurationVersion and TargetProject, and pass them to the write operation as is. The capacity is measured in GB, and the TTL is measured in days. The account UID in DeliverySettings is a string. If the system fails to read the optional delivery settings, the cause is returned in DeliverySettingsError, and other storage information is still returned.</p>
     * 
     * @param request the request parameters of GetDataStorage  GetDataStorageRequest
     * @return GetDataStorageResponse
     */
    CompletableFuture<GetDataStorageResponse> getDataStorage(GetDataStorageRequest request);

    /**
     * @param request the request parameters of GetDetectionStatistic  GetDetectionStatisticRequest
     * @return GetDetectionStatisticResponse
     */
    CompletableFuture<GetDetectionStatisticResponse> getDetectionStatistic(GetDetectionStatisticRequest request);

    /**
     * @param request the request parameters of GetExportTask  GetExportTaskRequest
     * @return GetExportTaskResponse
     */
    CompletableFuture<GetExportTaskResponse> getExportTask(GetExportTaskRequest request);

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a complex JSON configuration. We provide a supporting utility class to help with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of GetIncident  GetIncidentRequest
     * @return GetIncidentResponse
     */
    CompletableFuture<GetIncidentResponse> getIncident(GetIncidentRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the generated AI investigation results for a specified event. You can first call ListIncidentInvestigations to obtain the report ID or display ID, and then call this operation to query the details.
     * The query priority is as follows:</p>
     * <ol>
     * <li>If IncidentInvestigationId is specified, the query is performed by report ID.</li>
     * <li>If the report ID is not specified but IncidentInvestigationDisplayId is specified, the query is performed by display ID.</li>
     * <li>If neither identifier is specified, the most recent successfully completed investigation result for the event corresponding to IncidentUuid is returned, sorted in descending order by investigation end time.
     * If no matching investigation record is found, IncidentInvestigation is empty.
     * IncidentInvestigationStatus indicates the judgment category in the report. Both IncidentInvestigationReport and IncidentInvestigationOutput are JSON-formatted strings. You must parse them in JSON format before using their fields. Internal fields may change with report versions, and callers must be compatible with missing fields. The examples show only part of the report content.</li>
     * </ol>
     * 
     * @param request the request parameters of GetIncidentInvestigation  GetIncidentInvestigationRequest
     * @return GetIncidentInvestigationResponse
     */
    CompletableFuture<GetIncidentInvestigationResponse> getIncidentInvestigation(GetIncidentInvestigationRequest request);

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration string. A utility class is provided to help with specific configuration examples. Refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of GetLogTicket  GetLogTicketRequest
     * @return GetLogTicketResponse
     */
    CompletableFuture<GetLogTicketResponse> getLogTicket(GetLogTicketRequest request);

    /**
     * <b>description</b> :
     * <p>The request parameter JsonConfig contains highly complex JSON configurations. To help you configure it, we provide a utility class with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of GetNormalizationRule  GetNormalizationRuleRequest
     * @return GetNormalizationRuleResponse
     */
    CompletableFuture<GetNormalizationRuleResponse> getNormalizationRule(GetNormalizationRuleRequest request);

    /**
     * @param request the request parameters of GetNormalizationRuleVersion  GetNormalizationRuleVersionRequest
     * @return GetNormalizationRuleVersionResponse
     */
    CompletableFuture<GetNormalizationRuleVersionResponse> getNormalizationRuleVersion(GetNormalizationRuleVersionRequest request);

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a complex JSON configuration. We provide a utility class with specific configuration examples. For more information, see <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of GetNormalizationSchema  GetNormalizationSchemaRequest
     * @return GetNormalizationSchemaResponse
     */
    CompletableFuture<GetNormalizationSchemaResponse> getNormalizationSchema(GetNormalizationSchemaRequest request);

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions.
     * Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time range.</p>
     * 
     * @param request the request parameters of GetResponseRuleStatistic  GetResponseRuleStatisticRequest
     * @return GetResponseRuleStatisticResponse
     */
    CompletableFuture<GetResponseRuleStatisticResponse> getResponseRuleStatistic(GetResponseRuleStatisticRequest request);

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. A utility class is provided to help with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of GetUserConfig  GetUserConfigRequest
     * @return GetUserConfigResponse
     */
    CompletableFuture<GetUserConfigResponse> getUserConfig(GetUserConfigRequest request);

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a complex JSON configuration. To help you configure it, we provide a utility class with specific configuration examples. For more information, see <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of ListAlertAggregations  ListAlertAggregationsRequest
     * @return ListAlertAggregationsResponse
     */
    CompletableFuture<ListAlertAggregationsResponse> listAlertAggregations(ListAlertAggregationsRequest request);

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON Configurations. We provide a utility class with configuration examples to help you get started. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * <h3>Before you begin</h3>
     * <p>Before invoking this operation, ensure that Cloud SIEM storage resources (the alert-record Logstore in the Simple Log Service project) are activated. Invoke GetDataStorage to check the storage status. If storage is not activated, purchase SIEM storage first. Otherwise, the invocation will fail.</p>
     * 
     * @param request the request parameters of ListAlerts  ListAlertsRequest
     * @return ListAlertsResponse
     */
    CompletableFuture<ListAlertsResponse> listAlerts(ListAlertsRequest request);

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions. Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time range.</p>
     * 
     * @param request the request parameters of ListAutoDisposeEntities  ListAutoDisposeEntitiesRequest
     * @return ListAutoDisposeEntitiesResponse
     */
    CompletableFuture<ListAutoDisposeEntitiesResponse> listAutoDisposeEntities(ListAutoDisposeEntitiesRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the message list of a specified security operations Agent conversation.</p>
     * 
     * @param request the request parameters of ListCopilotMessages  ListCopilotMessagesRequest
     * @return ListCopilotMessagesResponse
     */
    CompletableFuture<ListCopilotMessagesResponse> listCopilotMessages(ListCopilotMessagesRequest request);

    /**
     * @param request the request parameters of ListDataConnectors  ListDataConnectorsRequest
     * @return ListDataConnectorsResponse
     */
    CompletableFuture<ListDataConnectorsResponse> listDataConnectors(ListDataConnectorsRequest request);

    /**
     * @param request the request parameters of ListDataIngestionTemplates  ListDataIngestionTemplatesRequest
     * @return ListDataIngestionTemplatesResponse
     */
    CompletableFuture<ListDataIngestionTemplatesResponse> listDataIngestionTemplates(ListDataIngestionTemplatesRequest request);

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions.
     * Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time range.</p>
     * 
     * @param request the request parameters of ListDataIngestions  ListDataIngestionsRequest
     * @return ListDataIngestionsResponse
     */
    CompletableFuture<ListDataIngestionsResponse> listDataIngestions(ListDataIngestionsRequest request);

    /**
     * @param request the request parameters of ListDataSetRecords  ListDataSetRecordsRequest
     * @return ListDataSetRecordsResponse
     */
    CompletableFuture<ListDataSetRecordsResponse> listDataSetRecords(ListDataSetRecordsRequest request);

    /**
     * @param request the request parameters of ListDataSets  ListDataSetsRequest
     * @return ListDataSetsResponse
     */
    CompletableFuture<ListDataSetsResponse> listDataSets(ListDataSetsRequest request);

    /**
     * @param request the request parameters of ListDataSourceTemplates  ListDataSourceTemplatesRequest
     * @return ListDataSourceTemplatesResponse
     */
    CompletableFuture<ListDataSourceTemplatesResponse> listDataSourceTemplates(ListDataSourceTemplatesRequest request);

    /**
     * <b>description</b> :
     * <p>Notification delivery is subject to frequency and time limits. Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time frame.</p>
     * 
     * @param request the request parameters of ListDataSources  ListDataSourcesRequest
     * @return ListDataSourcesResponse
     */
    CompletableFuture<ListDataSourcesResponse> listDataSources(ListDataSourcesRequest request);

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time limits.
     * Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent at other times.</p>
     * 
     * @param request the request parameters of ListDetectionRules  ListDetectionRulesRequest
     * @return ListDetectionRulesResponse
     */
    CompletableFuture<ListDetectionRulesResponse> listDetectionRules(ListDetectionRulesRequest request);

    /**
     * <b>description</b> :
     * <p>Notification delivery is subject to frequency and time limits. Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time frame.</p>
     * 
     * @param request the request parameters of ListIncidents  ListIncidentsRequest
     * @return ListIncidentsResponse
     */
    CompletableFuture<ListIncidentsResponse> listIncidents(ListIncidentsRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves a list of log projects associated with threat detection and response.</p>
     * 
     * @param request the request parameters of ListLogProjects  ListLogProjectsRequest
     * @return ListLogProjectsResponse
     */
    CompletableFuture<ListLogProjectsResponse> listLogProjects(ListLogProjectsRequest request);

    /**
     * <b>description</b> :
     * <p>The request parameter JsonConfig involves complex JSON configurations. We provide a supporting utility class to help with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of ListLogRegions  ListLogRegionsRequest
     * @return ListLogRegionsResponse
     */
    CompletableFuture<ListLogRegionsResponse> listLogRegions(ListLogRegionsRequest request);

    /**
     * <b>description</b> :
     * <p>Notification delivery is subject to frequency and time limits. Each user can receive a maximum of two notifications per day between 08:00 and 20:00, and no notifications are sent at other times.</p>
     * 
     * @param request the request parameters of ListLogStores  ListLogStoresRequest
     * @return ListLogStoresResponse
     */
    CompletableFuture<ListLogStoresResponse> listLogStores(ListLogStoresRequest request);

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions.
     * Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time window.</p>
     * 
     * @param request the request parameters of ListNormalizationCategories  ListNormalizationCategoriesRequest
     * @return ListNormalizationCategoriesResponse
     */
    CompletableFuture<ListNormalizationCategoriesResponse> listNormalizationCategories(ListNormalizationCategoriesRequest request);

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. A utility class is provided for configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of ListNormalizationFields  ListNormalizationFieldsRequest
     * @return ListNormalizationFieldsResponse
     */
    CompletableFuture<ListNormalizationFieldsResponse> listNormalizationFields(ListNormalizationFieldsRequest request);

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. We provide a utility class to help with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of ListNormalizationRuleCapacities  ListNormalizationRuleCapacitiesRequest
     * @return ListNormalizationRuleCapacitiesResponse
     */
    CompletableFuture<ListNormalizationRuleCapacitiesResponse> listNormalizationRuleCapacities(ListNormalizationRuleCapacitiesRequest request);

    /**
     * @param request the request parameters of ListNormalizationRuleVersions  ListNormalizationRuleVersionsRequest
     * @return ListNormalizationRuleVersionsResponse
     */
    CompletableFuture<ListNormalizationRuleVersionsResponse> listNormalizationRuleVersions(ListNormalizationRuleVersionsRequest request);

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions.
     * Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time window.</p>
     * 
     * @param request the request parameters of ListNormalizationRules  ListNormalizationRulesRequest
     * @return ListNormalizationRulesResponse
     */
    CompletableFuture<ListNormalizationRulesResponse> listNormalizationRules(ListNormalizationRulesRequest request);

    /**
     * <b>description</b> :
     * <p>The request parameter JsonConfig is a complex JSON configuration. To help with specific configuration examples, we provide a utility class. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of ListNormalizationSchemas  ListNormalizationSchemasRequest
     * @return ListNormalizationSchemasResponse
     */
    CompletableFuture<ListNormalizationSchemasResponse> listNormalizationSchemas(ListNormalizationSchemasRequest request);

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. We provide a utility class and configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of ListNormalizationSecurityDomains  ListNormalizationSecurityDomainsRequest
     * @return ListNormalizationSecurityDomainsResponse
     */
    CompletableFuture<ListNormalizationSecurityDomainsResponse> listNormalizationSecurityDomains(ListNormalizationSecurityDomainsRequest request);

    /**
     * @param request the request parameters of ListProducts  ListProductsRequest
     * @return ListProductsResponse
     */
    CompletableFuture<ListProductsResponse> listProducts(ListProductsRequest request);

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. We provide a utility class with specific configuration examples. For more information, see <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of ListQueryViews  ListQueryViewsRequest
     * @return ListQueryViewsResponse
     */
    CompletableFuture<ListQueryViewsResponse> listQueryViews(ListQueryViewsRequest request);

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions.
     * Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time range.</p>
     * 
     * @param request the request parameters of ListResponseRuleFields  ListResponseRuleFieldsRequest
     * @return ListResponseRuleFieldsResponse
     */
    CompletableFuture<ListResponseRuleFieldsResponse> listResponseRuleFields(ListResponseRuleFieldsRequest request);

    /**
     * <b>description</b> :
     * <p>Notification sending is limited by frequency and time. Each user can receive a maximum of two notifications per day between 08:00 and 20:00, and no notifications are sent at other times.</p>
     * 
     * @param request the request parameters of ListResponseRules  ListResponseRulesRequest
     * @return ListResponseRulesResponse
     */
    CompletableFuture<ListResponseRulesResponse> listResponseRules(ListResponseRulesRequest request);

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON Configurations string. We provide a utility class with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of ListTags  ListTagsRequest
     * @return ListTagsResponse
     */
    CompletableFuture<ListTagsResponse> listTags(ListTagsRequest request);

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. A utility class is provided to help with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of ListTrafficStatistics  ListTrafficStatisticsRequest
     * @return ListTrafficStatisticsResponse
     */
    CompletableFuture<ListTrafficStatisticsResponse> listTrafficStatistics(ListTrafficStatisticsRequest request);

    /**
     * <b>description</b> :
     * <p>The JsonConfig input parameter is a complex JSON configuration. To help you configure it, we provide a utility class with specific configuration examples. Refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of ListUpgradeItems  ListUpgradeItemsRequest
     * @return ListUpgradeItemsResponse
     */
    CompletableFuture<ListUpgradeItemsResponse> listUpgradeItems(ListUpgradeItemsRequest request);

    /**
     * @param request the request parameters of ListVendors  ListVendorsRequest
     * @return ListVendorsResponse
     */
    CompletableFuture<ListVendorsResponse> listVendors(ListVendorsRequest request);

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions.
     * Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time window.</p>
     * 
     * @param request the request parameters of RefreshDataSource  RefreshDataSourceRequest
     * @return RefreshDataSourceResponse
     */
    CompletableFuture<RefreshDataSourceResponse> refreshDataSource(RefreshDataSourceRequest request);

    /**
     * @param request the request parameters of ResetDataStorage  ResetDataStorageRequest
     * @return ResetDataStorageResponse
     */
    CompletableFuture<ResetDataStorageResponse> resetDataStorage(ResetDataStorageRequest request);

    /**
     * <b>description</b> :
     * <p>Resumes the event stream for a security operations agent conversation turn from a specified cursor.</p>
     * 
     * @param request the request parameters of ResumeCopilotTurnStream  ResumeCopilotTurnStreamRequest
     * @return ResumeCopilotTurnStreamResponse
     */
    CompletableFuture<ResumeCopilotTurnStreamResponse> resumeCopilotTurnStream(ResumeCopilotTurnStreamRequest request);

    ResponseIterable<String> resumeCopilotTurnStreamWithResponseIterable(ResumeCopilotTurnStreamRequest request);

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions.
     * Each user can receive a maximum of two notifications per day between 08:00 and 20:00. No notifications are sent outside this time range.</p>
     * 
     * @param request the request parameters of SetDefaultNormalizationRuleVersion  SetDefaultNormalizationRuleVersionRequest
     * @return SetDefaultNormalizationRuleVersionResponse
     */
    CompletableFuture<SetDefaultNormalizationRuleVersionResponse> setDefaultNormalizationRuleVersion(SetDefaultNormalizationRuleVersionRequest request);

    /**
     * <b>description</b> :
     * <p>Notification delivery is subject to frequency and time limits. Each user can receive up to two notifications per day between 08:00 and 20:00, and no notifications are sent outside this time frame.</p>
     * 
     * @param request the request parameters of UpdateAlert  UpdateAlertRequest
     * @return UpdateAlertResponse
     */
    CompletableFuture<UpdateAlertResponse> updateAlert(UpdateAlertRequest request);

    /**
     * <b>description</b> :
     * <p>The <code>JsonConfig</code> parameter is a complex JSON configuration. See the <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a> for helper utility classes and configuration examples.</p>
     * 
     * @param request the request parameters of UpdateAutoDisposeConfig  UpdateAutoDisposeConfigRequest
     * @return UpdateAutoDisposeConfigResponse
     */
    CompletableFuture<UpdateAutoDisposeConfigResponse> updateAutoDisposeConfig(UpdateAutoDisposeConfigRequest request);

    /**
     * <b>description</b> :
     * <p>The AutoDecisionEntityList parameter is a JSON-formatted string. A helper class is available to simplify its creation. For an example, see the <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of UpdateAutoDisposeRecord  UpdateAutoDisposeRecordRequest
     * @return UpdateAutoDisposeRecordResponse
     */
    CompletableFuture<UpdateAutoDisposeRecordResponse> updateAutoDisposeRecord(UpdateAutoDisposeRecordRequest request);

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a complex JSON configuration. A supporting tool class that contains configuration examples is provided to help you. For more information, see the <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of UpdateDataBatchIngestion  UpdateDataBatchIngestionRequest
     * @return UpdateDataBatchIngestionResponse
     */
    CompletableFuture<UpdateDataBatchIngestionResponse> updateDataBatchIngestion(UpdateDataBatchIngestionRequest request);

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time restrictions.
     * Each user can receive a maximum of two notifications per day between 08:00 and 20:00 (UTC+8). No notifications are sent outside this time range.</p>
     * 
     * @param request the request parameters of UpdateDataConnector  UpdateDataConnectorRequest
     * @return UpdateDataConnectorResponse
     */
    CompletableFuture<UpdateDataConnectorResponse> updateDataConnector(UpdateDataConnectorRequest request);

    /**
     * @param request the request parameters of UpdateDataIngestion  UpdateDataIngestionRequest
     * @return UpdateDataIngestionResponse
     */
    CompletableFuture<UpdateDataIngestionResponse> updateDataIngestion(UpdateDataIngestionRequest request);

    /**
     * @param request the request parameters of UpdateDataIngestionTemplate  UpdateDataIngestionTemplateRequest
     * @return UpdateDataIngestionTemplateResponse
     */
    CompletableFuture<UpdateDataIngestionTemplateResponse> updateDataIngestionTemplate(UpdateDataIngestionTemplateRequest request);

    /**
     * @param request the request parameters of UpdateDataSet  UpdateDataSetRequest
     * @return UpdateDataSetResponse
     */
    CompletableFuture<UpdateDataSetResponse> updateDataSet(UpdateDataSetRequest request);

    /**
     * <b>description</b> :
     * <p>Notifications are subject to frequency and time limits. Each user can receive a maximum of two notifications per day between 08:00 and 20:00.</p>
     * 
     * @param request the request parameters of UpdateDataSetRecord  UpdateDataSetRecordRequest
     * @return UpdateDataSetRecordResponse
     */
    CompletableFuture<UpdateDataSetRecordResponse> updateDataSetRecord(UpdateDataSetRecordRequest request);

    /**
     * @param request the request parameters of UpdateDataSource  UpdateDataSourceRequest
     * @return UpdateDataSourceResponse
     */
    CompletableFuture<UpdateDataSourceResponse> updateDataSource(UpdateDataSourceRequest request);

    /**
     * @param request the request parameters of UpdateDataSourceTemplate  UpdateDataSourceTemplateRequest
     * @return UpdateDataSourceTemplateResponse
     */
    CompletableFuture<UpdateDataSourceTemplateResponse> updateDataSourceTemplate(UpdateDataSourceTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>Updates the log storage region or the global switch for multi-account centralized delivery. Submit these two operations separately. Before modifying the global switch, call GetDataStorage and use the returned ConfigurationVersion and TargetProject values. Do not copy the fixed version and account from the examples. The current V2 version does not support the legacy DeliveryStatus global switch. After the update, call GetDataStorage again to obtain the latest configuration.</p>
     * 
     * @param request the request parameters of UpdateDataStorage  UpdateDataStorageRequest
     * @return UpdateDataStorageResponse
     */
    CompletableFuture<UpdateDataStorageResponse> updateDataStorage(UpdateDataStorageRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that the Cloud Security Center (Cloud SIEM) data storage service is activated for your account and the data storage order has not expired. You can call the GetDataStorage operation to check the status of the data storage order.</p>
     * 
     * @param request the request parameters of UpdateDataStorageDelivery  UpdateDataStorageDeliveryRequest
     * @return UpdateDataStorageDeliveryResponse
     */
    CompletableFuture<UpdateDataStorageDeliveryResponse> updateDataStorageDelivery(UpdateDataStorageDeliveryRequest request);

    /**
     * @param request the request parameters of UpdateDataStorageTtl  UpdateDataStorageTtlRequest
     * @return UpdateDataStorageTtlResponse
     */
    CompletableFuture<UpdateDataStorageTtlResponse> updateDataStorageTtl(UpdateDataStorageTtlRequest request);

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. To help you configure it, a utility class is provided with specific configuration examples. Refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of UpdateDetectionRule  UpdateDetectionRuleRequest
     * @return UpdateDetectionRuleResponse
     */
    CompletableFuture<UpdateDetectionRuleResponse> updateDetectionRule(UpdateDetectionRuleRequest request);

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. To help you configure it, we provide a utility class with specific configuration examples. Refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of UpdateNormalizationRule  UpdateNormalizationRuleRequest
     * @return UpdateNormalizationRuleResponse
     */
    CompletableFuture<UpdateNormalizationRuleResponse> updateNormalizationRule(UpdateNormalizationRuleRequest request);

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. A utility class is provided to help with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of UpdateNormalizationSchema  UpdateNormalizationSchemaRequest
     * @return UpdateNormalizationSchemaResponse
     */
    CompletableFuture<UpdateNormalizationSchemaResponse> updateNormalizationSchema(UpdateNormalizationSchemaRequest request);

    /**
     * @param request the request parameters of UpdateProduct  UpdateProductRequest
     * @return UpdateProductResponse
     */
    CompletableFuture<UpdateProductResponse> updateProduct(UpdateProductRequest request);

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a very complex JSON configuration. Therefore, we provide a utility class to help with specific configuration examples. Refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of UpdateResponseRule  UpdateResponseRuleRequest
     * @return UpdateResponseRuleResponse
     */
    CompletableFuture<UpdateResponseRuleResponse> updateResponseRule(UpdateResponseRuleRequest request);

    /**
     * @param request the request parameters of UpdateVendor  UpdateVendorRequest
     * @return UpdateVendorResponse
     */
    CompletableFuture<UpdateVendorResponse> updateVendor(UpdateVendorRequest request);

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a complex JSON configuration. To simplify this, we provide a utility class to assist with specific configuration examples. For more information, refer to the <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of ValidateLogStore  ValidateLogStoreRequest
     * @return ValidateLogStoreResponse
     */
    CompletableFuture<ValidateLogStoreResponse> validateLogStore(ValidateLogStoreRequest request);

    /**
     * <b>description</b> :
     * <p>The JsonConfig request parameter is a highly complex JSON configuration. To help you configure it, we provide a utility class with specific configuration examples. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * @param request the request parameters of ValidateNormalizationRule  ValidateNormalizationRuleRequest
     * @return ValidateNormalizationRuleResponse
     */
    CompletableFuture<ValidateNormalizationRuleResponse> validateNormalizationRule(ValidateNormalizationRuleRequest request);

}
