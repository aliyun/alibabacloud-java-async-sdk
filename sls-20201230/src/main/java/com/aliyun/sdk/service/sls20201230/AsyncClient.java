// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.sls20201230.models.*;
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
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of ApplyConfigToMachineGroup  ApplyConfigToMachineGroupRequest
     * @return ApplyConfigToMachineGroupResponse
     */
    CompletableFuture<ApplyConfigToMachineGroupResponse> applyConfigToMachineGroup(ApplyConfigToMachineGroupRequest request);

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>Connections between consumers and Simple Log Service are established by sending heartbeat messages at regular intervals. If Simple Log Service does not receive heartbeat messages from a consumer on schedule, Simple Log Service deletes the consumer.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * <li>The name of the consumer group is obtained. For more information, see <a href="https://help.aliyun.com/document_detail/74964.html">ListConsumerGroup</a>.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:ConsumerGroupHeartBeat</code></td>
     * <td align="left"><code>acs:log:${regionId}:${accountId}:project/{#ProjectName}/logstore/{#LogstoreName}/consumergroup/{#ConsumerGroupName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of ConsumerGroupHeartBeat  ConsumerGroupHeartBeatRequest
     * @return ConsumerGroupHeartBeatResponse
     */
    CompletableFuture<ConsumerGroupHeartBeatResponse> consumerGroupHeartBeat(ConsumerGroupHeartBeatRequest request);

    /**
     * <b>description</b> :
     * <p>  If you do not specify a consumer, you must set <strong>forceSuccess</strong> to <strong>true</strong>. Otherwise, the checkpoint cannot be updated.</p>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ConsumerGroupUpdateCheckPoint  ConsumerGroupUpdateCheckPointRequest
     * @return ConsumerGroupUpdateCheckPointResponse
     */
    CompletableFuture<ConsumerGroupUpdateCheckPointResponse> consumerGroupUpdateCheckPoint(ConsumerGroupUpdateCheckPointRequest request);

    /**
     * @param request the request parameters of CreateAgentInstanceConfig  CreateAgentInstanceConfigRequest
     * @return CreateAgentInstanceConfigResponse
     */
    CompletableFuture<CreateAgentInstanceConfigResponse> createAgentInstanceConfig(CreateAgentInstanceConfigRequest request);

    /**
     * @param request the request parameters of CreateAlert  CreateAlertRequest
     * @return CreateAlertResponse
     */
    CompletableFuture<CreateAlertResponse> createAlert(CreateAlertRequest request);

    /**
     * @param request the request parameters of CreateAnnotationDataSet  CreateAnnotationDataSetRequest
     * @return CreateAnnotationDataSetResponse
     */
    CompletableFuture<CreateAnnotationDataSetResponse> createAnnotationDataSet(CreateAnnotationDataSetRequest request);

    /**
     * @param request the request parameters of CreateAnnotationLabel  CreateAnnotationLabelRequest
     * @return CreateAnnotationLabelResponse
     */
    CompletableFuture<CreateAnnotationLabelResponse> createAnnotationLabel(CreateAnnotationLabelRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * <li>You can create up to 100 Logtail configurations in a project.</li>
     * <li>The Logtail configuration is planned out. For more information, see <a href="https://help.aliyun.com/document_detail/29058.html">Logtail configurations</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateConfig  CreateConfigRequest
     * @return CreateConfigResponse
     */
    CompletableFuture<CreateConfigResponse> createConfig(CreateConfigRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>You can create up to 30 consumer groups for a Logstore. The name of a consumer group must be unique in a project.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * <li>Simple Log Service provides examples of both regular log consumption and consumer group-based log consumption by using Simple Log Service SDK for Java. For more information, see <a href="https://help.aliyun.com/document_detail/120035.html">Consume log data</a> and <a href="https://help.aliyun.com/document_detail/28998.html">Use consumer groups to consume data</a>.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:CreateConsumerGroup</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/logstore/{#logstoreName}/consumergroup/{#ConsumerGroup}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of CreateConsumerGroup  CreateConsumerGroupRequest
     * @return CreateConsumerGroupResponse
     */
    CompletableFuture<CreateConsumerGroupResponse> createConsumerGroup(CreateConsumerGroupRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDashboard  CreateDashboardRequest
     * @return CreateDashboardResponse
     */
    CompletableFuture<CreateDashboardResponse> createDashboard(CreateDashboardRequest request);

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of CreateDomain  CreateDomainRequest
     * @return CreateDomainResponse
     */
    CompletableFuture<CreateDomainResponse> createDomain(CreateDomainRequest request);

    /**
     * @param request the request parameters of CreateDownloadJob  CreateDownloadJobRequest
     * @return CreateDownloadJobResponse
     */
    CompletableFuture<CreateDownloadJobResponse> createDownloadJob(CreateDownloadJobRequest request);

    /**
     * @param request the request parameters of CreateETL  CreateETLRequest
     * @return CreateETLResponse
     */
    CompletableFuture<CreateETLResponse> createETL(CreateETLRequest request);

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of CreateIndex  CreateIndexRequest
     * @return CreateIndexResponse
     */
    CompletableFuture<CreateIndexResponse> createIndex(CreateIndexRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * <li>You can create up to 200 Logstores in each project.</li>
     * <li>If the retention period of a log reaches the data retention period that you specified for the Logstore, the log is deleted.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:CreateLogStore</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/logstore/{#LogstoreName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of CreateLogStore  CreateLogStoreRequest
     * @return CreateLogStoreResponse
     */
    CompletableFuture<CreateLogStoreResponse> createLogStore(CreateLogStoreRequest request);

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of CreateLogging  CreateLoggingRequest
     * @return CreateLoggingResponse
     */
    CompletableFuture<CreateLoggingResponse> createLogging(CreateLoggingRequest request);

    /**
     * <b>description</b> :
     * <p>The UK (London) region is supported. Supported regions are constantly updated.</p>
     * 
     * @param request the request parameters of CreateLogtailPipelineConfig  CreateLogtailPipelineConfigRequest
     * @return CreateLogtailPipelineConfigResponse
     */
    CompletableFuture<CreateLogtailPipelineConfigResponse> createLogtailPipelineConfig(CreateLogtailPipelineConfigRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of CreateMachineGroup  CreateMachineGroupRequest
     * @return CreateMachineGroupResponse
     */
    CompletableFuture<CreateMachineGroupResponse> createMachineGroup(CreateMachineGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Metricstores are used to store metric data. For more information, see <a href="https://help.aliyun.com/document_detail/174965.html">Metric data</a>.</p>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query metric data is obtained. The information includes the name of the project to which the metric data belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * <li>You can create up to 200 Logstores or Metricstores in a project.</li>
     * <li>Metric data is automatically deleted when the retention period of the metric data ends.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateMetricStore  CreateMetricStoreRequest
     * @return CreateMetricStoreResponse
     */
    CompletableFuture<CreateMetricStoreResponse> createMetricStore(CreateMetricStoreRequest request);

    /**
     * @param request the request parameters of CreateOSSExport  CreateOSSExportRequest
     * @return CreateOSSExportResponse
     */
    CompletableFuture<CreateOSSExportResponse> createOSSExport(CreateOSSExportRequest request);

    /**
     * @param request the request parameters of CreateOSSHDFSExport  CreateOSSHDFSExportRequest
     * @return CreateOSSHDFSExportResponse
     */
    CompletableFuture<CreateOSSHDFSExportResponse> createOSSHDFSExport(CreateOSSHDFSExportRequest request);

    /**
     * @param request the request parameters of CreateOSSIngestion  CreateOSSIngestionRequest
     * @return CreateOSSIngestionResponse
     */
    CompletableFuture<CreateOSSIngestionResponse> createOSSIngestion(CreateOSSIngestionRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of CreateOssExternalStore  CreateOssExternalStoreRequest
     * @return CreateOssExternalStoreResponse
     */
    CompletableFuture<CreateOssExternalStoreResponse> createOssExternalStore(CreateOssExternalStoreRequest request);

    /**
     * @param request the request parameters of CreateProject  CreateProjectRequest
     * @return CreateProjectResponse
     */
    CompletableFuture<CreateProjectResponse> createProject(CreateProjectRequest request);

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of CreateRdsExternalStore  CreateRdsExternalStoreRequest
     * @return CreateRdsExternalStoreResponse
     */
    CompletableFuture<CreateRdsExternalStoreResponse> createRdsExternalStore(CreateRdsExternalStoreRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * <li>Limits are imposed when you use Simple Log Service to query logs. We recommend that you specify query statements and query time ranges based on the limits. For more information, see <a href="https://help.aliyun.com/document_detail/43772.html">Log search overview</a> and <a href="https://help.aliyun.com/document_detail/53608.html">Log analysis overview</a>.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:CreateSavedSearch</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/savedsearch/{#SavedSearchName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of CreateSavedSearch  CreateSavedSearchRequest
     * @return CreateSavedSearchResponse
     */
    CompletableFuture<CreateSavedSearchResponse> createSavedSearch(CreateSavedSearchRequest request);

    /**
     * @param request the request parameters of CreateScheduledSQL  CreateScheduledSQLRequest
     * @return CreateScheduledSQLResponse
     */
    CompletableFuture<CreateScheduledSQLResponse> createScheduledSQL(CreateScheduledSQLRequest request);

    /**
     * <b>description</b> :
     * <p>*Before you call this operation, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/223777.html">billing</a> of Dedicated SQL.</p>
     * 
     * @param request the request parameters of CreateSqlInstance  CreateSqlInstanceRequest
     * @return CreateSqlInstanceResponse
     */
    CompletableFuture<CreateSqlInstanceResponse> createSqlInstance(CreateSqlInstanceRequest request);

    /**
     * @param request the request parameters of CreateStoreView  CreateStoreViewRequest
     * @return CreateStoreViewResponse
     */
    CompletableFuture<CreateStoreViewResponse> createStoreView(CreateStoreViewRequest request);

    /**
     * @param request the request parameters of CreateTicket  CreateTicketRequest
     * @return CreateTicketResponse
     */
    CompletableFuture<CreateTicketResponse> createTicket(CreateTicketRequest request);

    /**
     * @param request the request parameters of DeleteAgentInstanceConfig  DeleteAgentInstanceConfigRequest
     * @return DeleteAgentInstanceConfigResponse
     */
    CompletableFuture<DeleteAgentInstanceConfigResponse> deleteAgentInstanceConfig(DeleteAgentInstanceConfigRequest request);

    /**
     * @param request the request parameters of DeleteAlert  DeleteAlertRequest
     * @return DeleteAlertResponse
     */
    CompletableFuture<DeleteAlertResponse> deleteAlert(DeleteAlertRequest request);

    /**
     * @param request the request parameters of DeleteAnnotationData  DeleteAnnotationDataRequest
     * @return DeleteAnnotationDataResponse
     */
    CompletableFuture<DeleteAnnotationDataResponse> deleteAnnotationData(DeleteAnnotationDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can delete a dataset only if no data exists in the dataset.</p>
     * 
     * @param request the request parameters of DeleteAnnotationDataSet  DeleteAnnotationDataSetRequest
     * @return DeleteAnnotationDataSetResponse
     */
    CompletableFuture<DeleteAnnotationDataSetResponse> deleteAnnotationDataSet(DeleteAnnotationDataSetRequest request);

    /**
     * <b>description</b> :
     * <p>Only non-built-in tags can be deleted.</p>
     * 
     * @param request the request parameters of DeleteAnnotationLabel  DeleteAnnotationLabelRequest
     * @return DeleteAnnotationLabelResponse
     */
    CompletableFuture<DeleteAnnotationLabelResponse> deleteAnnotationLabel(DeleteAnnotationLabelRequest request);

    /**
     * <b>description</b> :
     * <p>You must use the Simple Log Service endpoint for the China (Shanghai) or Singapore region to call the operation.</p>
     * 
     * @param request the request parameters of DeleteCollectionPolicy  DeleteCollectionPolicyRequest
     * @return DeleteCollectionPolicyResponse
     */
    CompletableFuture<DeleteCollectionPolicyResponse> deleteCollectionPolicy(DeleteCollectionPolicyRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>If a Logtail configuration is applied to a machine group, you cannot collect data from the machine group after you delete the Logtail configuration.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * <li>The name of the required Logtail configuration is obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29043.html">ListConfig</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteConfig  DeleteConfigRequest
     * @return DeleteConfigResponse
     */
    CompletableFuture<DeleteConfigResponse> deleteConfig(DeleteConfigRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * <li>The name of the consumer group is obtained. For more information, see <a href="https://help.aliyun.com/document_detail/74964.html">ListConsumerGroup</a>.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:DeleteConsumerGroup</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/logstore/{#logstoreName}/consumergroup/{#ConsumerGroup}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of DeleteConsumerGroup  DeleteConsumerGroupRequest
     * @return DeleteConsumerGroupResponse
     */
    CompletableFuture<DeleteConsumerGroupResponse> deleteConsumerGroup(DeleteConsumerGroupRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDashboard  DeleteDashboardRequest
     * @return DeleteDashboardResponse
     */
    CompletableFuture<DeleteDashboardResponse> deleteDashboard(DeleteDashboardRequest request);

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of DeleteDomain  DeleteDomainRequest
     * @return DeleteDomainResponse
     */
    CompletableFuture<DeleteDomainResponse> deleteDomain(DeleteDomainRequest request);

    /**
     * @param request the request parameters of DeleteDownloadJob  DeleteDownloadJobRequest
     * @return DeleteDownloadJobResponse
     */
    CompletableFuture<DeleteDownloadJobResponse> deleteDownloadJob(DeleteDownloadJobRequest request);

    /**
     * @param request the request parameters of DeleteETL  DeleteETLRequest
     * @return DeleteETLResponse
     */
    CompletableFuture<DeleteETLResponse> deleteETL(DeleteETLRequest request);

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of DeleteExternalStore  DeleteExternalStoreRequest
     * @return DeleteExternalStoreResponse
     */
    CompletableFuture<DeleteExternalStoreResponse> deleteExternalStore(DeleteExternalStoreRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of DeleteIndex  DeleteIndexRequest
     * @return DeleteIndexResponse
     */
    CompletableFuture<DeleteIndexResponse> deleteIndex(DeleteIndexRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>Host consists of a project name and a Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of DeleteLogStore  DeleteLogStoreRequest
     * @return DeleteLogStoreResponse
     */
    CompletableFuture<DeleteLogStoreResponse> deleteLogStore(DeleteLogStoreRequest request);

    /**
     * @param request the request parameters of DeleteLogging  DeleteLoggingRequest
     * @return DeleteLoggingResponse
     */
    CompletableFuture<DeleteLoggingResponse> deleteLogging(DeleteLoggingRequest request);

    /**
     * <b>description</b> :
     * <p>The UK (London) region is supported. Supported regions are constantly updated.</p>
     * 
     * @param request the request parameters of DeleteLogtailPipelineConfig  DeleteLogtailPipelineConfigRequest
     * @return DeleteLogtailPipelineConfigResponse
     */
    CompletableFuture<DeleteLogtailPipelineConfigResponse> deleteLogtailPipelineConfig(DeleteLogtailPipelineConfigRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of DeleteMachineGroup  DeleteMachineGroupRequest
     * @return DeleteMachineGroupResponse
     */
    CompletableFuture<DeleteMachineGroupResponse> deleteMachineGroup(DeleteMachineGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Metricstores are used to store metric data. For more information, see <a href="https://help.aliyun.com/document_detail/174965.html">Metric data</a>.</p>
     * <ul>
     * <li>You must specify an existing Metricstore.</li>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query metric data is obtained. The information includes the name of the project to which the metric data belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * <li>You can create up to 200 Logstores or Metricstores in a project.</li>
     * <li>Metric data is automatically deleted when the retention period of the metric data ends.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteMetricStore  DeleteMetricStoreRequest
     * @return DeleteMetricStoreResponse
     */
    CompletableFuture<DeleteMetricStoreResponse> deleteMetricStore(DeleteMetricStoreRequest request);

    /**
     * @param request the request parameters of DeleteOSSExport  DeleteOSSExportRequest
     * @return DeleteOSSExportResponse
     */
    CompletableFuture<DeleteOSSExportResponse> deleteOSSExport(DeleteOSSExportRequest request);

    /**
     * @param request the request parameters of DeleteOSSHDFSExport  DeleteOSSHDFSExportRequest
     * @return DeleteOSSHDFSExportResponse
     */
    CompletableFuture<DeleteOSSHDFSExportResponse> deleteOSSHDFSExport(DeleteOSSHDFSExportRequest request);

    /**
     * @param request the request parameters of DeleteOSSIngestion  DeleteOSSIngestionRequest
     * @return DeleteOSSIngestionResponse
     */
    CompletableFuture<DeleteOSSIngestionResponse> deleteOSSIngestion(DeleteOSSIngestionRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>After you delete a project, all logs stored in the project and the configurations of the project are deleted and cannot be restored. Proceed with caution.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:DeleteProject</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of DeleteProject  DeleteProjectRequest
     * @return DeleteProjectResponse
     */
    CompletableFuture<DeleteProjectResponse> deleteProject(DeleteProjectRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a></li>
     * </ul>
     * 
     * @param request the request parameters of DeleteProjectPolicy  DeleteProjectPolicyRequest
     * @return DeleteProjectPolicyResponse
     */
    CompletableFuture<DeleteProjectPolicyResponse> deleteProjectPolicy(DeleteProjectPolicyRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * <li>After you delete a saved search, it cannot be restored. Proceed with caution.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:DeleteSavedSearch</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/savedsearch/{#SavedSearchName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of DeleteSavedSearch  DeleteSavedSearchRequest
     * @return DeleteSavedSearchResponse
     */
    CompletableFuture<DeleteSavedSearchResponse> deleteSavedSearch(DeleteSavedSearchRequest request);

    /**
     * @param request the request parameters of DeleteScheduledSQL  DeleteScheduledSQLRequest
     * @return DeleteScheduledSQLResponse
     */
    CompletableFuture<DeleteScheduledSQLResponse> deleteScheduledSQL(DeleteScheduledSQLRequest request);

    /**
     * @param request the request parameters of DeleteStoreView  DeleteStoreViewRequest
     * @return DeleteStoreViewResponse
     */
    CompletableFuture<DeleteStoreViewResponse> deleteStoreView(DeleteStoreViewRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of DisableAlert  DisableAlertRequest
     * @return DisableAlertResponse
     */
    CompletableFuture<DisableAlertResponse> disableAlert(DisableAlertRequest request);

    /**
     * @param request the request parameters of DisableScheduledSQL  DisableScheduledSQLRequest
     * @return DisableScheduledSQLResponse
     */
    CompletableFuture<DisableScheduledSQLResponse> disableScheduledSQL(DisableScheduledSQLRequest request);

    /**
     * @param request the request parameters of EnableAlert  EnableAlertRequest
     * @return EnableAlertResponse
     */
    CompletableFuture<EnableAlertResponse> enableAlert(EnableAlertRequest request);

    /**
     * @param request the request parameters of EnableScheduledSQL  EnableScheduledSQLRequest
     * @return EnableScheduledSQLResponse
     */
    CompletableFuture<EnableScheduledSQLResponse> enableScheduledSQL(EnableScheduledSQLRequest request);

    /**
     * @param request the request parameters of GetAgentInstanceConfig  GetAgentInstanceConfigRequest
     * @return GetAgentInstanceConfigResponse
     */
    CompletableFuture<GetAgentInstanceConfigResponse> getAgentInstanceConfig(GetAgentInstanceConfigRequest request);

    /**
     * @param request the request parameters of GetAlert  GetAlertRequest
     * @return GetAlertResponse
     */
    CompletableFuture<GetAlertResponse> getAlert(GetAlertRequest request);

    /**
     * @param request the request parameters of GetAnnotationData  GetAnnotationDataRequest
     * @return GetAnnotationDataResponse
     */
    CompletableFuture<GetAnnotationDataResponse> getAnnotationData(GetAnnotationDataRequest request);

    /**
     * @param request the request parameters of GetAnnotationDataSet  GetAnnotationDataSetRequest
     * @return GetAnnotationDataSetResponse
     */
    CompletableFuture<GetAnnotationDataSetResponse> getAnnotationDataSet(GetAnnotationDataSetRequest request);

    /**
     * @param request the request parameters of GetAnnotationLabel  GetAnnotationLabelRequest
     * @return GetAnnotationLabelResponse
     */
    CompletableFuture<GetAnnotationLabelResponse> getAnnotationLabel(GetAnnotationLabelRequest request);

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of GetAppliedConfigs  GetAppliedConfigsRequest
     * @return GetAppliedConfigsResponse
     */
    CompletableFuture<GetAppliedConfigsResponse> getAppliedConfigs(GetAppliedConfigsRequest request);

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of GetAppliedMachineGroups  GetAppliedMachineGroupsRequest
     * @return GetAppliedMachineGroupsResponse
     */
    CompletableFuture<GetAppliedMachineGroupsResponse> getAppliedMachineGroups(GetAppliedMachineGroupsRequest request);

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of GetCheckPoint  GetCheckPointRequest
     * @return GetCheckPointResponse
     */
    CompletableFuture<GetCheckPointResponse> getCheckPoint(GetCheckPointRequest request);

    /**
     * @param request the request parameters of GetCollectionPolicy  GetCollectionPolicyRequest
     * @return GetCollectionPolicyResponse
     */
    CompletableFuture<GetCollectionPolicyResponse> getCollectionPolicy(GetCollectionPolicyRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * <li>The name of the required Logtail configuration is obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29043.html">ListConfig</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of GetConfig  GetConfigRequest
     * @return GetConfigResponse
     */
    CompletableFuture<GetConfigResponse> getConfig(GetConfigRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>You can specify a log as the start log. The time range of a contextual query is one day before and one day after the generation time of the start log.</li>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * <li>Indexes are configured before you query logs. For more information, see <a href="https://help.aliyun.com/document_detail/90732.html">Create indexes</a>.</li>
     * <li>The values of the pack_id and pack_meta fields are obtained before you query logs. The fields are internal fields, and you can obtain the values by using the debugging feature of your browser in the Simple Log Service console.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:GetLogStoreContextLogs</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/logstore/{#LogstoreName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of GetContextLogs  GetContextLogsRequest
     * @return GetContextLogsResponse
     */
    CompletableFuture<GetContextLogsResponse> getContextLogs(GetContextLogsRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>The following content describes the relationships among a cursor, project, Logstore, and shard:<ul>
     * <li>A project can have multiple Logstores.</li>
     * <li>A Logstore can have multiple shards.</li>
     * <li>You can use a cursor to obtain a log in a shard.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetCursor  GetCursorRequest
     * @return GetCursorResponse
     */
    CompletableFuture<GetCursorResponse> getCursor(GetCursorRequest request);

    /**
     * @param request the request parameters of GetCursorTime  GetCursorTimeRequest
     * @return GetCursorTimeResponse
     */
    CompletableFuture<GetCursorTimeResponse> getCursorTime(GetCursorTimeRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of GetDashboard  GetDashboardRequest
     * @return GetDashboardResponse
     */
    CompletableFuture<GetDashboardResponse> getDashboard(GetDashboardRequest request);

    /**
     * @param request the request parameters of GetDownloadJob  GetDownloadJobRequest
     * @return GetDownloadJobResponse
     */
    CompletableFuture<GetDownloadJobResponse> getDownloadJob(GetDownloadJobRequest request);

    /**
     * @param request the request parameters of GetETL  GetETLRequest
     * @return GetETLResponse
     */
    CompletableFuture<GetETLResponse> getETL(GetETLRequest request);

    /**
     * <b>description</b> :
     * <p>  The supported data sources of external stores include Object Storage Service (OSS) buckets and ApsaraDB RDS for MySQL databases in a virtual private cloud (VPC).</p>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * </ul>
     * 
     * @param request the request parameters of GetExternalStore  GetExternalStoreRequest
     * @return GetExternalStoreResponse
     */
    CompletableFuture<GetExternalStoreResponse> getExternalStore(GetExternalStoreRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>The time range is evenly divided into subintervals in the responses. If the time range that is specified in the request remains unchanged, the subintervals in the responses also remain unchanged.</li>
     * <li>If the number of logs in a Logstore significantly changes, Simple Log Service cannot predict the number of times that you must call this operation to obtain the complete result. In this case, you must check the value of the progress parameter in the response of each request and determine whether to call this operation one more time to obtain the complete result. Each time you call this operation, the same number of charge units (CUs) are consumed.</li>
     * <li>After a log is written to a Logstore, you can call the GetHistograms or GetLogs operation to query the log after a short latency. The latency of a query varies based on the type of the log. Simple Log Service classifies logs into the following types based on the log time:<ul>
     * <li>Real-time data: The difference between the time record in a log and the current time on Simple Log Service is within the interval (-180 seconds,900 seconds]. For example, if a log was generated at 12:03:00, September 25, 2014 (UTC) and Simple Log Service received the log at 12:05:00, September 25, 2014 (UTC), Simple Log Service processes the log as real-time data. After real-time data is written to a Logstore, the data can be queried with a maximum latency of 3 seconds.</li>
     * <li>Historical data: The difference between the time record in a log and the current time on Simple Log Service is within the interval [-604,800 seconds,-180 seconds). For example, if a log was generated at 12:00:00, September 25, 2014 (UTC) and Simple Log Service received the log at 12:05:00, September 25, 2014 (UTC), Simple Log Service processes the log as historical data. This type of log is usually generated in data backfill scenarios.
     * After real-time data is written to a Logstore, the data can be queried with a maximum latency of 3 seconds. For 99.9% of queries, the latency is no more than 1 second.<blockquote>
     * <p>Simple Log Service calculates the difference between the log time that is specified by the <strong>time</strong> field and the receiving time that is specified by the <strong>tag</strong>:<strong>receive_time</strong> field for each log. The receiving time indicates the time at which Simple Log Service receives the log. If the difference is within the interval (-180 seconds,900 seconds], Simple Log Service processes the log as real-time data. If the difference is within the interval [-604,800 seconds,-180 seconds), Simple Log Service processes the log as historical data.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li>Simple Log Service provides examples on how to call the GetHistograms operation by using Simple Log Service SDK for Java. For more information, see <a href="https://help.aliyun.com/document_detail/462234.html">Use GetHistograms to query the distribution of logs</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of GetHistograms  GetHistogramsRequest
     * @return GetHistogramsResponse
     */
    CompletableFuture<GetHistogramsResponse> getHistograms(GetHistogramsRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of GetIndex  GetIndexRequest
     * @return GetIndexResponse
     */
    CompletableFuture<GetIndexResponse> getIndex(GetIndexRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of GetLogStore  GetLogStoreRequest
     * @return GetLogStoreResponse
     */
    CompletableFuture<GetLogStoreResponse> getLogStore(GetLogStoreRequest request);

    /**
     * @param request the request parameters of GetLogStoreMeteringMode  GetLogStoreMeteringModeRequest
     * @return GetLogStoreMeteringModeResponse
     */
    CompletableFuture<GetLogStoreMeteringModeResponse> getLogStoreMeteringMode(GetLogStoreMeteringModeRequest request);

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of GetLogging  GetLoggingRequest
     * @return GetLoggingResponse
     */
    CompletableFuture<GetLoggingResponse> getLogging(GetLoggingRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p><strong>Note</strong> Simple Log Service allows you to create a Scheduled SQL job. For more information, see <a href="https://help.aliyun.com/document_detail/286457.html">Create a scheduled SQL job</a>.</p>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * <li>Limits are imposed when you use Simple Log Service to query logs. We recommend that you specify query statements and query time ranges based on the limits. For more information, see <a href="https://help.aliyun.com/document_detail/43772.html">Log search overview</a> and <a href="https://help.aliyun.com/document_detail/53608.html">Log analysis overview</a>.</li>
     * <li>Indexes are configured before you query logs. For more information, see <a href="https://help.aliyun.com/document_detail/90732.html">Create indexes</a>.</li>
     * <li>If the number of logs in a Logstore significantly changes, Simple Log Service cannot predict the number of times that you must call this operation to obtain the complete results. In this case, you must check the value of the x-log-progress parameter in the response of each request and determine whether to call this operation one more time to obtain the complete results. Each time you call this operation, the same number of charge units (CUs) are consumed.</li>
     * <li>After a log is written to a Logstore, you can call the GetHistograms or the GetLogs operation to query the log. The latency of the query varies based on the type of the log. Simple Log Service classifies logs into the following types based on log timestamps:<ul>
     * <li>Real-time data: The difference between the time record in a log of this type and the current time on Simple Log Service is within the interval (-180 seconds,900 seconds\]. For example, if a log was generated at 12:03:00, September 25, 2014 (UTC) and Simple Log Service received the log at 12:05:00, September 25, 2014 (UTC), Simple Log Service processes the log as real-time data. This type of log is usually generated in common scenarios.</li>
     * <li>Historical data: The difference between the time record in a log of this type and the current time on Simple Log Service is within the interval [-604,800 seconds,-180 seconds). For example, if a log was generated at 12:00:00, September 25, 2014 (UTC) and Simple Log Service received the log at 12:05:00, September 25, 2014 (UTC), Simple Log Service processes the log as historical data. This type of log is usually generated in data backfill scenarios. After real-time data is written to a Logstore, the data can be queried with an approximate latency of 3 seconds.
     * <strong>Note</strong> Simple Log Service calculates the difference between the log time that is specified by the <strong>time</strong> field and the receiving time that is specified by the <strong>tag</strong>:<strong>receive_time</strong> field for each log. The receiving time indicates when Simple Log Service receives the log. If the difference is within the interval (-180 seconds,900 seconds\], Simple Log Service processes the log as real-time data. If the difference is within the interval [-604,800 seconds,-180 seconds), Simple Log Service processes the log as historical data.</li>
     * </ul>
     * </li>
     * <li>Simple Log Service provides examples on how to call the GetLogs operation by using Simple Log Service SDK for Java and Simple Log Service SDK for Python. For more information, see <a href="https://help.aliyun.com/document_detail/407683.html">Examples of calling the GetLogs operation by using Simple Log Service SDK for Java</a> and <a href="https://help.aliyun.com/document_detail/407684.html">Examples of calling the GetLogs operation by using Simple Log Service SDK for Python</a>.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:GetLogStoreLogs</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/logstore/{#LogstoreName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of GetLogs  GetLogsRequest
     * @return GetLogsResponse
     */
    CompletableFuture<GetLogsResponse> getLogs(GetLogsRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation by using Alibaba Cloud SDK for Go, Java, TypeScript, or Python.</p>
     * <ul>
     * <li>You can call this operation by using Simple Log Service SDK for Go or Java.</li>
     * <li>For more information, see <a href="https://help.aliyun.com/document_detail/29029.html">GetLogs</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of GetLogsV2  GetLogsV2Request
     * @return GetLogsV2Response
     */
    CompletableFuture<GetLogsV2Response> getLogsV2(GetLogsV2Request request);

    /**
     * <b>description</b> :
     * <p>The UK (London) region is supported. Supported regions are constantly updated.</p>
     * 
     * @param request the request parameters of GetLogtailPipelineConfig  GetLogtailPipelineConfigRequest
     * @return GetLogtailPipelineConfigResponse
     */
    CompletableFuture<GetLogtailPipelineConfigResponse> getLogtailPipelineConfig(GetLogtailPipelineConfigRequest request);

    /**
     * @param request the request parameters of GetMLServiceResults  GetMLServiceResultsRequest
     * @return GetMLServiceResultsResponse
     */
    CompletableFuture<GetMLServiceResultsResponse> getMLServiceResults(GetMLServiceResultsRequest request);

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of GetMachineGroup  GetMachineGroupRequest
     * @return GetMachineGroupResponse
     */
    CompletableFuture<GetMachineGroupResponse> getMachineGroup(GetMachineGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Metricstores are used to store metric data. For more information about Metricstores, see <a href="https://help.aliyun.com/document_detail/171723.html">Metricstores</a>. For more information about metric data, see <a href="https://help.aliyun.com/document_detail/174965.html">Metric data</a>. You can call this operation to query the settings of a Metricstore. To query the metric data in a Metricstore, see <a href="https://help.aliyun.com/document_detail/174968.html">Query and analysis</a> and <a href="https://help.aliyun.com/document_detail/2771318.html">GetLogsV2</a>.</p>
     * <ul>
     * <li>You must specify an existing Metricstore.</li>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query metric data is obtained. The information includes the name of the project to which the metric data belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * <li>You can create up to 200 Logstores or Metricstores in a project.</li>
     * <li>Metric data is automatically deleted when the retention period of the metric data ends.</li>
     * </ul>
     * 
     * @param request the request parameters of GetMetricStore  GetMetricStoreRequest
     * @return GetMetricStoreResponse
     */
    CompletableFuture<GetMetricStoreResponse> getMetricStore(GetMetricStoreRequest request);

    /**
     * @param request the request parameters of GetMetricStoreMeteringMode  GetMetricStoreMeteringModeRequest
     * @return GetMetricStoreMeteringModeResponse
     */
    CompletableFuture<GetMetricStoreMeteringModeResponse> getMetricStoreMeteringMode(GetMetricStoreMeteringModeRequest request);

    /**
     * @param request the request parameters of GetOSSExport  GetOSSExportRequest
     * @return GetOSSExportResponse
     */
    CompletableFuture<GetOSSExportResponse> getOSSExport(GetOSSExportRequest request);

    /**
     * @param request the request parameters of GetOSSHDFSExport  GetOSSHDFSExportRequest
     * @return GetOSSHDFSExportResponse
     */
    CompletableFuture<GetOSSHDFSExportResponse> getOSSHDFSExport(GetOSSHDFSExportRequest request);

    /**
     * @param request the request parameters of GetOSSIngestion  GetOSSIngestionRequest
     * @return GetOSSIngestionResponse
     */
    CompletableFuture<GetOSSIngestionResponse> getOSSIngestion(GetOSSIngestionRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of GetProject  GetProjectRequest
     * @return GetProjectResponse
     */
    CompletableFuture<GetProjectResponse> getProject(GetProjectRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * <li>Indexes are configured before you query logs. For more information, see <a href="https://help.aliyun.com/document_detail/90732.html">Create indexes</a>.</li>
     * <li>Limits are imposed when you use Simple Log Service to query logs. We recommend that you specify query statements and query time ranges based on the limits. For more information, see <a href="https://help.aliyun.com/document_detail/43772.html">Log search overview</a> and <a href="https://help.aliyun.com/document_detail/53608.html">Log analysis overview</a>.</li>
     * <li>You must set query to a standard SQL statement.</li>
     * <li>You must specify a Logstore in the FROM clause of an SQL statement. A Logstore can be used as an SQL table.</li>
     * <li>You must specify a time range in an SQL statement by using the <strong>date</strong> or <strong>time</strong> parameter. The value of the <strong>date</strong> parameter is a timestamp. The value of the <strong>time</strong> parameter is an integer, and the unit of the value is seconds.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:GetProjectLogs</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of GetProjectLogs  GetProjectLogsRequest
     * @return GetProjectLogsResponse
     */
    CompletableFuture<GetProjectLogsResponse> getProjectLogs(GetProjectLogsRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a></li>
     * </ul>
     * 
     * @param request the request parameters of GetProjectPolicy  GetProjectPolicyRequest
     * @return GetProjectPolicyResponse
     */
    CompletableFuture<GetProjectPolicyResponse> getProjectPolicy(GetProjectPolicyRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * <li>You can call the ListSavedSearch operation to query the name of a saved search.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:GetSavedSearch</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/savedsearch/{#SavedSearchName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of GetSavedSearch  GetSavedSearchRequest
     * @return GetSavedSearchResponse
     */
    CompletableFuture<GetSavedSearchResponse> getSavedSearch(GetSavedSearchRequest request);

    /**
     * @param request the request parameters of GetScheduledSQL  GetScheduledSQLRequest
     * @return GetScheduledSQLResponse
     */
    CompletableFuture<GetScheduledSQLResponse> getScheduledSQL(GetScheduledSQLRequest request);

    /**
     * @param request the request parameters of GetSlsService  GetSlsServiceRequest
     * @return GetSlsServiceResponse
     */
    CompletableFuture<GetSlsServiceResponse> getSlsService(GetSlsServiceRequest request);

    /**
     * @param request the request parameters of GetSqlInstance  GetSqlInstanceRequest
     * @return GetSqlInstanceResponse
     */
    CompletableFuture<GetSqlInstanceResponse> getSqlInstance(GetSqlInstanceRequest request);

    /**
     * @param request the request parameters of GetStoreView  GetStoreViewRequest
     * @return GetStoreViewResponse
     */
    CompletableFuture<GetStoreViewResponse> getStoreView(GetStoreViewRequest request);

    /**
     * @param request the request parameters of GetStoreViewIndex  GetStoreViewIndexRequest
     * @return GetStoreViewIndexResponse
     */
    CompletableFuture<GetStoreViewIndexResponse> getStoreViewIndex(GetStoreViewIndexRequest request);

    /**
     * @param request the request parameters of ListAgentInstanceConfigs  ListAgentInstanceConfigsRequest
     * @return ListAgentInstanceConfigsResponse
     */
    CompletableFuture<ListAgentInstanceConfigsResponse> listAgentInstanceConfigs(ListAgentInstanceConfigsRequest request);

    /**
     * @param request the request parameters of ListAlerts  ListAlertsRequest
     * @return ListAlertsResponse
     */
    CompletableFuture<ListAlertsResponse> listAlerts(ListAlertsRequest request);

    /**
     * @param request the request parameters of ListAnnotationData  ListAnnotationDataRequest
     * @return ListAnnotationDataResponse
     */
    CompletableFuture<ListAnnotationDataResponse> listAnnotationData(ListAnnotationDataRequest request);

    /**
     * @param request the request parameters of ListAnnotationDataSets  ListAnnotationDataSetsRequest
     * @return ListAnnotationDataSetsResponse
     */
    CompletableFuture<ListAnnotationDataSetsResponse> listAnnotationDataSets(ListAnnotationDataSetsRequest request);

    /**
     * @param request the request parameters of ListAnnotationLabels  ListAnnotationLabelsRequest
     * @return ListAnnotationLabelsResponse
     */
    CompletableFuture<ListAnnotationLabelsResponse> listAnnotationLabels(ListAnnotationLabelsRequest request);

    /**
     * <b>description</b> :
     * <p>You must use the Simple Log Service endpoint for the China (Shanghai) or Singapore region to call the operation.</p>
     * 
     * @param request the request parameters of ListCollectionPolicies  ListCollectionPoliciesRequest
     * @return ListCollectionPoliciesResponse
     */
    CompletableFuture<ListCollectionPoliciesResponse> listCollectionPolicies(ListCollectionPoliciesRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ListConfig  ListConfigRequest
     * @return ListConfigResponse
     */
    CompletableFuture<ListConfigResponse> listConfig(ListConfigRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:ListConsumerGroup</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/logstore/{#LogstoreName}/consumergroup/*</code></td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of ListConsumerGroup  ListConsumerGroupRequest
     * @return ListConsumerGroupResponse
     */
    CompletableFuture<ListConsumerGroupResponse> listConsumerGroup(ListConsumerGroupRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ListDashboard  ListDashboardRequest
     * @return ListDashboardResponse
     */
    CompletableFuture<ListDashboardResponse> listDashboard(ListDashboardRequest request);

    /**
     * <b>description</b> :
     * <p>  Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * <ul>
     * <li>Only one custom domain name can be bound to each project.</li>
     * </ul>
     * 
     * @param request the request parameters of ListDomains  ListDomainsRequest
     * @return ListDomainsResponse
     */
    CompletableFuture<ListDomainsResponse> listDomains(ListDomainsRequest request);

    /**
     * @param request the request parameters of ListDownloadJobs  ListDownloadJobsRequest
     * @return ListDownloadJobsResponse
     */
    CompletableFuture<ListDownloadJobsResponse> listDownloadJobs(ListDownloadJobsRequest request);

    /**
     * @param request the request parameters of ListETLs  ListETLsRequest
     * @return ListETLsResponse
     */
    CompletableFuture<ListETLsResponse> listETLs(ListETLsRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:ListLogStores</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/logstore/*</code></td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of ListLogStores  ListLogStoresRequest
     * @return ListLogStoresResponse
     */
    CompletableFuture<ListLogStoresResponse> listLogStores(ListLogStoresRequest request);

    /**
     * <b>description</b> :
     * <p>The UK (London) region is supported. Supported regions are constantly updated.</p>
     * 
     * @param request the request parameters of ListLogtailPipelineConfig  ListLogtailPipelineConfigRequest
     * @return ListLogtailPipelineConfigResponse
     */
    CompletableFuture<ListLogtailPipelineConfigResponse> listLogtailPipelineConfig(ListLogtailPipelineConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of ListMachineGroup  ListMachineGroupRequest
     * @return ListMachineGroupResponse
     */
    CompletableFuture<ListMachineGroupResponse> listMachineGroup(ListMachineGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of ListMachines  ListMachinesRequest
     * @return ListMachinesResponse
     */
    CompletableFuture<ListMachinesResponse> listMachines(ListMachinesRequest request);

    /**
     * <b>description</b> :
     * <p>  Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * <ul>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query metric data is obtained. The information includes the name of the project to which the metric data belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ListMetricStores  ListMetricStoresRequest
     * @return ListMetricStoresResponse
     */
    CompletableFuture<ListMetricStoresResponse> listMetricStores(ListMetricStoresRequest request);

    /**
     * @param request the request parameters of ListOSSExports  ListOSSExportsRequest
     * @return ListOSSExportsResponse
     */
    CompletableFuture<ListOSSExportsResponse> listOSSExports(ListOSSExportsRequest request);

    /**
     * @param request the request parameters of ListOSSHDFSExports  ListOSSHDFSExportsRequest
     * @return ListOSSHDFSExportsResponse
     */
    CompletableFuture<ListOSSHDFSExportsResponse> listOSSHDFSExports(ListOSSHDFSExportsRequest request);

    /**
     * @param request the request parameters of ListOSSIngestions  ListOSSIngestionsRequest
     * @return ListOSSIngestionsResponse
     */
    CompletableFuture<ListOSSIngestionsResponse> listOSSIngestions(ListOSSIngestionsRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of ListProject  ListProjectRequest
     * @return ListProjectResponse
     */
    CompletableFuture<ListProjectResponse> listProject(ListProjectRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of ListSavedSearch  ListSavedSearchRequest
     * @return ListSavedSearchResponse
     */
    CompletableFuture<ListSavedSearchResponse> listSavedSearch(ListSavedSearchRequest request);

    /**
     * @param request the request parameters of ListScheduledSQLs  ListScheduledSQLsRequest
     * @return ListScheduledSQLsResponse
     */
    CompletableFuture<ListScheduledSQLsResponse> listScheduledSQLs(ListScheduledSQLsRequest request);

    /**
     * @param request the request parameters of ListShards  ListShardsRequest
     * @return ListShardsResponse
     */
    CompletableFuture<ListShardsResponse> listShards(ListShardsRequest request);

    /**
     * @param request the request parameters of ListStoreViews  ListStoreViewsRequest
     * @return ListStoreViewsResponse
     */
    CompletableFuture<ListStoreViewsResponse> listStoreViews(ListStoreViewsRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a></li>
     * <li>For more information, see <a href="https://help.aliyun.com/document_detail/29049.html">Authorization rules</a>. The following types of resources are supported: project, Logstore, dashboard, machine group, and Logtail configuration.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:ListTagResources</code></td>
     * <td align="left">The resource format varies based on the resource type.\-<code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}</code>\-<code>acs:log:${regionName}:${accountId}:project/${projectName}/logstore/${logstoreName}</code>\-<code>acs:log:${regionName}:${accountId}:project/${projectName}/dashboard/${dashboardName}</code>\-<code>acs:log:${regionName}:${accountId}:project/${projectName}/machinegroup/${machineGroupName}</code>\-<code>acs:log:${regionName}:${accountId}:project/${projectName}/logtailconfig/${logtailConfigName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of MergeShard  MergeShardRequest
     * @return MergeShardResponse
     */
    CompletableFuture<MergeShardResponse> mergeShard(MergeShardRequest request);

    /**
     * @param request the request parameters of OpenSlsService  OpenSlsServiceRequest
     * @return OpenSlsServiceResponse
     */
    CompletableFuture<OpenSlsServiceResponse> openSlsService(OpenSlsServiceRequest request);

    /**
     * <b>description</b> :
     * <p>You cannot call this operation in OpenAPI Explorer. You can use Simple Log Service SDK to call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/29063.html">SLS SDK Reference</a>.</p>
     * 
     * @param request the request parameters of PullLogs  PullLogsRequest
     * @return PullLogsResponse
     */
    CompletableFuture<PullLogsResponse> pullLogs(PullLogsRequest request);

    /**
     * @param request the request parameters of PutAnnotationData  PutAnnotationDataRequest
     * @return PutAnnotationDataResponse
     */
    CompletableFuture<PutAnnotationDataResponse> putAnnotationData(PutAnnotationDataRequest request);

    /**
     * <b>description</b> :
     * <p>You cannot call this operation by using cloud service SDKs that are provided by Alibaba Cloud OpenAPI Portal. You can use Simple Log Service SDK to call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/29063.html">SLS SDK Reference</a>.</p>
     * 
     * @param request the request parameters of PutLogs  PutLogsRequest
     * @return PutLogsResponse
     */
    CompletableFuture<PutLogsResponse> putLogs(PutLogsRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>Alibaba Cloud Simple Log Service allows you to configure a project policy to authorize other users to access the specified Log Service resources.<ul>
     * <li>You must configure a project policy based on policy syntax. Before you configure a project policy, you must be familiar with the Action, Resource, and Condition parameters. For more information, see <a href="https://help.aliyun.com/document_detail/128139.html">RAM</a>.</li>
     * <li>If you set the Principal element to an asterisk (\<em>) and do not configure the Condition element when you configure a project policy, the policy applies to all users except for the project owner. If you set the Principal element to an asterisk (\</em>) and configure the Condition element when you configure a project policy, the policy applies to all users including the project owner.</li>
     * <li>You can configure multiple project policies for a project. The total size of the policies cannot exceed 16 KB.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of PutProjectPolicy  PutProjectPolicyRequest
     * @return PutProjectPolicyResponse
     */
    CompletableFuture<PutProjectPolicyResponse> putProjectPolicy(PutProjectPolicyRequest request);

    /**
     * @param request the request parameters of PutProjectTransferAcceleration  PutProjectTransferAccelerationRequest
     * @return PutProjectTransferAccelerationResponse
     */
    CompletableFuture<PutProjectTransferAccelerationResponse> putProjectTransferAcceleration(PutProjectTransferAccelerationRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * <li>You can call this operation to collect logs from web pages or clients.</li>
     * <li>If you use web tracking to collect logs and you do not call this operation, you can send only one log to Simple Log Service in a request. For more information, see <a href="https://help.aliyun.com/document_detail/31752.html">Use web tracking to collect logs</a>.</li>
     * <li>If you want to collect a large amount of log data, you can call this operation to send multiple logs to Simple Log Service in one request.</li>
     * <li>Before you can call this operation to send logs to a Logstore, you must enable web tracking for the Logstore. For more information, see <a href="https://help.aliyun.com/document_detail/31752.html">Use web tracking to collect logs</a>.</li>
     * <li>You cannot call this operation to send the logs of multiple topics to Simple Log Service at a time.</li>
     * <li>If you call this operation, anonymous users from the Internet are granted the write permissions on the Logstore. This may generate dirty data because AccessKey pair-based authentication is not performed.</li>
     * </ul>
     * 
     * @param request the request parameters of PutWebtracking  PutWebtrackingRequest
     * @return PutWebtrackingResponse
     */
    CompletableFuture<PutWebtrackingResponse> putWebtracking(PutWebtrackingRequest request);

    /**
     * @param request the request parameters of RefreshToken  RefreshTokenRequest
     * @return RefreshTokenResponse
     */
    CompletableFuture<RefreshTokenResponse> refreshToken(RefreshTokenRequest request);

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of RemoveConfigFromMachineGroup  RemoveConfigFromMachineGroupRequest
     * @return RemoveConfigFromMachineGroupResponse
     */
    CompletableFuture<RemoveConfigFromMachineGroupResponse> removeConfigFromMachineGroup(RemoveConfigFromMachineGroupRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>Each shard has an MD5 hash range, and each range is a left-closed, right-open interval. The interval is in the <code>[BeginKey,EndKey)</code> format. A shard can be in the readwrite or readonly state. You can split a shard and merge shards. For more information, see <a href="https://help.aliyun.com/document_detail/28976.html">Shard</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of SplitShard  SplitShardRequest
     * @return SplitShardResponse
     */
    CompletableFuture<SplitShardResponse> splitShard(SplitShardRequest request);

    /**
     * @param request the request parameters of StartETL  StartETLRequest
     * @return StartETLResponse
     */
    CompletableFuture<StartETLResponse> startETL(StartETLRequest request);

    /**
     * @param request the request parameters of StartOSSExport  StartOSSExportRequest
     * @return StartOSSExportResponse
     */
    CompletableFuture<StartOSSExportResponse> startOSSExport(StartOSSExportRequest request);

    /**
     * @param request the request parameters of StartOSSHDFSExport  StartOSSHDFSExportRequest
     * @return StartOSSHDFSExportResponse
     */
    CompletableFuture<StartOSSHDFSExportResponse> startOSSHDFSExport(StartOSSHDFSExportRequest request);

    /**
     * @param request the request parameters of StartOSSIngestion  StartOSSIngestionRequest
     * @return StartOSSIngestionResponse
     */
    CompletableFuture<StartOSSIngestionResponse> startOSSIngestion(StartOSSIngestionRequest request);

    /**
     * @param request the request parameters of StopETL  StopETLRequest
     * @return StopETLResponse
     */
    CompletableFuture<StopETLResponse> stopETL(StopETLRequest request);

    /**
     * @param request the request parameters of StopOSSExport  StopOSSExportRequest
     * @return StopOSSExportResponse
     */
    CompletableFuture<StopOSSExportResponse> stopOSSExport(StopOSSExportRequest request);

    /**
     * @param request the request parameters of StopOSSHDFSExport  StopOSSHDFSExportRequest
     * @return StopOSSHDFSExportResponse
     */
    CompletableFuture<StopOSSHDFSExportResponse> stopOSSHDFSExport(StopOSSHDFSExportRequest request);

    /**
     * @param request the request parameters of StopOSSIngestion  StopOSSIngestionRequest
     * @return StopOSSIngestionResponse
     */
    CompletableFuture<StopOSSIngestionResponse> stopOSSIngestion(StopOSSIngestionRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a></li>
     * <li>For more information, see <a href="https://help.aliyun.com/document_detail/29049.html">Authorization rules</a>. The following types of resources are supported: project, Logstore, dashboard, machine group, and Logtail configuration.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:TagResources</code></td>
     * <td align="left">The resource format varies based on the resource type.\-<code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}</code>\-<code>acs:log:${regionName}:${accountId}:project/${projectName}/logstore/${logstoreName}</code>\-<code>acs:log:${regionName}:${accountId}:project/${projectName}/dashboard/${dashboardName}</code>\-<code>acs:log:${regionName}:${accountId}:project/${projectName}/machinegroup/${machineGroupName}</code>\-<code>acs:log:${regionName}:${accountId}:project/${projectName}/logtailconfig/${logtailConfigName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> For more information, see <a href="https://help.aliyun.com/document_detail/29049.html">Authorization rules</a>. The following types of resources are supported: project, Logstore, dashboard, machine group, and Logtail configuration.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:UntagResources</code></td>
     * <td align="left">The resource format varies based on the resource type.\-<code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}</code>\-<code>acs:log:${regionName}:${accountId}:project/${projectName}/logstore/${logstoreName}</code>\-<code>acs:log:${regionName}:${accountId}:project/${projectName}/dashboard/${dashboardName}</code>\-<code>acs:log:${regionName}:${accountId}:project/${projectName}/machinegroup/${machineGroupName}</code>\-<code>acs:log:${regionName}:${accountId}:project/${projectName}/logtailconfig/${logtailConfigName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * @param request the request parameters of UpdateAgentInstanceConfig  UpdateAgentInstanceConfigRequest
     * @return UpdateAgentInstanceConfigResponse
     */
    CompletableFuture<UpdateAgentInstanceConfigResponse> updateAgentInstanceConfig(UpdateAgentInstanceConfigRequest request);

    /**
     * @param request the request parameters of UpdateAlert  UpdateAlertRequest
     * @return UpdateAlertResponse
     */
    CompletableFuture<UpdateAlertResponse> updateAlert(UpdateAlertRequest request);

    /**
     * @param request the request parameters of UpdateAnnotationDataSet  UpdateAnnotationDataSetRequest
     * @return UpdateAnnotationDataSetResponse
     */
    CompletableFuture<UpdateAnnotationDataSetResponse> updateAnnotationDataSet(UpdateAnnotationDataSetRequest request);

    /**
     * <b>description</b> :
     * <p>You can update only the names of the tags in a tag set.</p>
     * 
     * @param request the request parameters of UpdateAnnotationLabel  UpdateAnnotationLabelRequest
     * @return UpdateAnnotationLabelResponse
     */
    CompletableFuture<UpdateAnnotationLabelResponse> updateAnnotationLabel(UpdateAnnotationLabelRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>After you update a Logtail configuration that is applied to a machine group, the new configuration immediately takes effect.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * <li>The Logtail configuration is planned out. For more information, see <a href="https://help.aliyun.com/document_detail/29058.html">Logtail configurations</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateConfig  UpdateConfigRequest
     * @return UpdateConfigResponse
     */
    CompletableFuture<UpdateConfigResponse> updateConfig(UpdateConfigRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:UpdateConsumerGroup</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/logstore/{#logstoreName}/consumergroup/{#ConsumerGroup}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of UpdateConsumerGroup  UpdateConsumerGroupRequest
     * @return UpdateConsumerGroupResponse
     */
    CompletableFuture<UpdateConsumerGroupResponse> updateConsumerGroup(UpdateConsumerGroupRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of UpdateDashboard  UpdateDashboardRequest
     * @return UpdateDashboardResponse
     */
    CompletableFuture<UpdateDashboardResponse> updateDashboard(UpdateDashboardRequest request);

    /**
     * @param request the request parameters of UpdateETL  UpdateETLRequest
     * @return UpdateETLResponse
     */
    CompletableFuture<UpdateETLResponse> updateETL(UpdateETLRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>Host consists of a project name and a Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of UpdateIndex  UpdateIndexRequest
     * @return UpdateIndexResponse
     */
    CompletableFuture<UpdateIndexResponse> updateIndex(UpdateIndexRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Log Service endpoint. You must specify a project in Host.</li>
     * <li>You can call the UpdateLogStore operation to change only the time-to-live (TTL) attribute.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateLogStore  UpdateLogStoreRequest
     * @return UpdateLogStoreResponse
     */
    CompletableFuture<UpdateLogStoreResponse> updateLogStore(UpdateLogStoreRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Limits</h2>
     * <p>If you specify a data encryption method when you configure data encryption settings, you cannot switch to the other method after the configuration. In addition, you cannot change the encryption algorithm or the encryption type. You can only enable or disable the encryption feature by using the enable parameter. If you specify the encryption method by using the service key of Simple Log Service when you configure data encryption settings, you cannot switch to the encryption method by using Bring Your Own Key (BYOK) keys after the configuration.</p>
     * <h2><a href="#"></a>Create encryption configurations</h2>
     * <h3><a href="#"></a>Encryption by using service keys</h3>
     * <p>Simple Log Service is fully responsible for data encryption and key management. No additional operations are required. When you create encryption configurations for the Logstore, you must specify the enable and encryptType parameters.</p>
     * <h3><a href="#byok"></a>Encryption by using BYOK keys</h3>
     * <p>You must create a customer master key (CMK) in Key Management Service (KMS). Then, Simple Log Service encrypts logs by using the CMK. When you create encryption configurations for the Logstore, you must specify the enable, encryptType, and userCmkInfo parameters.</p>
     * <h2><a href="#"></a>Enable or disable the encryption feature</h2>
     * <p>After you create encryption configurations for the Logstore, you cannot modify the encryptType or userCmkInfo parameters. However, you can enable and disable the encryption feature by using the enable parameter.</p>
     * 
     * @param request the request parameters of UpdateLogStoreEncryption  UpdateLogStoreEncryptionRequest
     * @return UpdateLogStoreEncryptionResponse
     */
    CompletableFuture<UpdateLogStoreEncryptionResponse> updateLogStoreEncryption(UpdateLogStoreEncryptionRequest request);

    /**
     * @param request the request parameters of UpdateLogStoreMeteringMode  UpdateLogStoreMeteringModeRequest
     * @return UpdateLogStoreMeteringModeResponse
     */
    CompletableFuture<UpdateLogStoreMeteringModeResponse> updateLogStoreMeteringMode(UpdateLogStoreMeteringModeRequest request);

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of UpdateLogging  UpdateLoggingRequest
     * @return UpdateLoggingResponse
     */
    CompletableFuture<UpdateLoggingResponse> updateLogging(UpdateLoggingRequest request);

    /**
     * <b>description</b> :
     * <p>The UK (London) region is supported. Supported regions are constantly updated.</p>
     * 
     * @param request the request parameters of UpdateLogtailPipelineConfig  UpdateLogtailPipelineConfigRequest
     * @return UpdateLogtailPipelineConfigResponse
     */
    CompletableFuture<UpdateLogtailPipelineConfigResponse> updateLogtailPipelineConfig(UpdateLogtailPipelineConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of UpdateMachineGroup  UpdateMachineGroupRequest
     * @return UpdateMachineGroupResponse
     */
    CompletableFuture<UpdateMachineGroupResponse> updateMachineGroup(UpdateMachineGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of UpdateMachineGroupMachine  UpdateMachineGroupMachineRequest
     * @return UpdateMachineGroupMachineResponse
     */
    CompletableFuture<UpdateMachineGroupMachineResponse> updateMachineGroupMachine(UpdateMachineGroupMachineRequest request);

    /**
     * <b>description</b> :
     * <p>Metricstores are used to store metric data. For more information, see <a href="https://help.aliyun.com/document_detail/174965.html">Metric data</a>.</p>
     * <ul>
     * <li>You must specify an existing Metricstore.</li>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query metric data is obtained. The information includes the name of the project to which the metric data belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * <li>You can create up to 200 Logstores or Metricstores in a project.</li>
     * <li>Metric data is automatically deleted when the retention period of the metric data ends.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateMetricStore  UpdateMetricStoreRequest
     * @return UpdateMetricStoreResponse
     */
    CompletableFuture<UpdateMetricStoreResponse> updateMetricStore(UpdateMetricStoreRequest request);

    /**
     * @param request the request parameters of UpdateMetricStoreMeteringMode  UpdateMetricStoreMeteringModeRequest
     * @return UpdateMetricStoreMeteringModeResponse
     */
    CompletableFuture<UpdateMetricStoreMeteringModeResponse> updateMetricStoreMeteringMode(UpdateMetricStoreMeteringModeRequest request);

    /**
     * @param request the request parameters of UpdateOSSExport  UpdateOSSExportRequest
     * @return UpdateOSSExportResponse
     */
    CompletableFuture<UpdateOSSExportResponse> updateOSSExport(UpdateOSSExportRequest request);

    /**
     * @param request the request parameters of UpdateOSSHDFSExport  UpdateOSSHDFSExportRequest
     * @return UpdateOSSHDFSExportResponse
     */
    CompletableFuture<UpdateOSSHDFSExportResponse> updateOSSHDFSExport(UpdateOSSHDFSExportRequest request);

    /**
     * @param request the request parameters of UpdateOSSIngestion  UpdateOSSIngestionRequest
     * @return UpdateOSSIngestionResponse
     */
    CompletableFuture<UpdateOSSIngestionResponse> updateOSSIngestion(UpdateOSSIngestionRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of UpdateOssExternalStore  UpdateOssExternalStoreRequest
     * @return UpdateOssExternalStoreResponse
     */
    CompletableFuture<UpdateOssExternalStoreResponse> updateOssExternalStore(UpdateOssExternalStoreRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:UpdateProject</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of UpdateProject  UpdateProjectRequest
     * @return UpdateProjectResponse
     */
    CompletableFuture<UpdateProjectResponse> updateProject(UpdateProjectRequest request);

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of UpdateRdsExternalStore  UpdateRdsExternalStoreRequest
     * @return UpdateRdsExternalStoreResponse
     */
    CompletableFuture<UpdateRdsExternalStoreResponse> updateRdsExternalStore(UpdateRdsExternalStoreRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * <li>Limits are imposed when you use Simple Log Service to query logs. We recommend that you specify query statements and query time ranges based on the limits. For more information, see <a href="https://help.aliyun.com/document_detail/43772.html">Log search overview</a> and <a href="https://help.aliyun.com/document_detail/53608.html">Log analysis overview</a>.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:UpdateSavedSearch</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/savedsearch/{#SavedSearchName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of UpdateSavedSearch  UpdateSavedSearchRequest
     * @return UpdateSavedSearchResponse
     */
    CompletableFuture<UpdateSavedSearchResponse> updateSavedSearch(UpdateSavedSearchRequest request);

    /**
     * @param request the request parameters of UpdateScheduledSQL  UpdateScheduledSQLRequest
     * @return UpdateScheduledSQLResponse
     */
    CompletableFuture<UpdateScheduledSQLResponse> updateScheduledSQL(UpdateScheduledSQLRequest request);

    /**
     * @param request the request parameters of UpdateSqlInstance  UpdateSqlInstanceRequest
     * @return UpdateSqlInstanceResponse
     */
    CompletableFuture<UpdateSqlInstanceResponse> updateSqlInstance(UpdateSqlInstanceRequest request);

    /**
     * @param request the request parameters of UpdateStoreView  UpdateStoreViewRequest
     * @return UpdateStoreViewResponse
     */
    CompletableFuture<UpdateStoreViewResponse> updateStoreView(UpdateStoreViewRequest request);

    /**
     * @param request the request parameters of UpsertCollectionPolicy  UpsertCollectionPolicyRequest
     * @return UpsertCollectionPolicyResponse
     */
    CompletableFuture<UpsertCollectionPolicyResponse> upsertCollectionPolicy(UpsertCollectionPolicyRequest request);

}
