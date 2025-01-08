// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.sls20201230.models.*;
import darabonba.core.utils.*;
import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;

import java.util.concurrent.CompletableFuture;


/**
 * <p>Main client.</p>
 */
public final class DefaultAsyncClient implements AsyncClient {

    protected final String product;
    protected final String version;
    protected final String endpointRule;
    protected final java.util.Map<String, String> endpointMap;
    protected final TeaRequest REQUEST;
    protected final TeaAsyncHandler handler;

    protected DefaultAsyncClient(ClientConfiguration configuration) {
        this.handler = new TeaAsyncHandler(configuration);
        this.product = "Sls";
        this.version = "2020-12-30";
        this.endpointRule = "central";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of ApplyConfigToMachineGroup  ApplyConfigToMachineGroupRequest
     * @return ApplyConfigToMachineGroupResponse
     */
    @Override
    public CompletableFuture<ApplyConfigToMachineGroupResponse> applyConfigToMachineGroup(ApplyConfigToMachineGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ApplyConfigToMachineGroup").setMethod(HttpMethod.PUT).setPathRegex("/machinegroups/{machineGroup}/configs/{configName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApplyConfigToMachineGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApplyConfigToMachineGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    @Override
    public CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ChangeResourceGroup").setMethod(HttpMethod.PUT).setPathRegex("/resourcegroup").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ConsumerGroupHeartBeatResponse> consumerGroupHeartBeat(ConsumerGroupHeartBeatRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ConsumerGroupHeartBeat").setMethod(HttpMethod.POST).setPathRegex("/logstores/{logstore}/consumergroups/{consumerGroup}?type=heartbeat").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ConsumerGroupHeartBeatResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ConsumerGroupHeartBeatResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ConsumerGroupUpdateCheckPointResponse> consumerGroupUpdateCheckPoint(ConsumerGroupUpdateCheckPointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ConsumerGroupUpdateCheckPoint").setMethod(HttpMethod.POST).setPathRegex("/logstores/{logstore}/consumergroups/{consumerGroup}?type=checkpoint").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ConsumerGroupUpdateCheckPointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ConsumerGroupUpdateCheckPointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAgentInstanceConfig  CreateAgentInstanceConfigRequest
     * @return CreateAgentInstanceConfigResponse
     */
    @Override
    public CompletableFuture<CreateAgentInstanceConfigResponse> createAgentInstanceConfig(CreateAgentInstanceConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateAgentInstanceConfig").setMethod(HttpMethod.POST).setPathRegex("/agentinstanceconfigs").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAgentInstanceConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAgentInstanceConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAlert  CreateAlertRequest
     * @return CreateAlertResponse
     */
    @Override
    public CompletableFuture<CreateAlertResponse> createAlert(CreateAlertRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateAlert").setMethod(HttpMethod.POST).setPathRegex("/alerts").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAlertResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAlertResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAnnotationDataSet  CreateAnnotationDataSetRequest
     * @return CreateAnnotationDataSetResponse
     */
    @Override
    public CompletableFuture<CreateAnnotationDataSetResponse> createAnnotationDataSet(CreateAnnotationDataSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateAnnotationDataSet").setMethod(HttpMethod.POST).setPathRegex("/ml/annotationdataset").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAnnotationDataSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAnnotationDataSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAnnotationLabel  CreateAnnotationLabelRequest
     * @return CreateAnnotationLabelResponse
     */
    @Override
    public CompletableFuture<CreateAnnotationLabelResponse> createAnnotationLabel(CreateAnnotationLabelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateAnnotationLabel").setMethod(HttpMethod.POST).setPathRegex("/ml/annotationlabel").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAnnotationLabelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAnnotationLabelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateConfigResponse> createConfig(CreateConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateConfig").setMethod(HttpMethod.POST).setPathRegex("/configs").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateConsumerGroupResponse> createConsumerGroup(CreateConsumerGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateConsumerGroup").setMethod(HttpMethod.POST).setPathRegex("/logstores/{logstore}/consumergroups").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateConsumerGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateConsumerGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateDashboardResponse> createDashboard(CreateDashboardRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateDashboard").setMethod(HttpMethod.POST).setPathRegex("/dashboards").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDashboardResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDashboardResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of CreateDomain  CreateDomainRequest
     * @return CreateDomainResponse
     */
    @Override
    public CompletableFuture<CreateDomainResponse> createDomain(CreateDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateDomain").setMethod(HttpMethod.POST).setPathRegex("/domains").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDownloadJob  CreateDownloadJobRequest
     * @return CreateDownloadJobResponse
     */
    @Override
    public CompletableFuture<CreateDownloadJobResponse> createDownloadJob(CreateDownloadJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateDownloadJob").setMethod(HttpMethod.POST).setPathRegex("/downloadjobs").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDownloadJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDownloadJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateETL  CreateETLRequest
     * @return CreateETLResponse
     */
    @Override
    public CompletableFuture<CreateETLResponse> createETL(CreateETLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateETL").setMethod(HttpMethod.POST).setPathRegex("/etls").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateETLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateETLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of CreateIndex  CreateIndexRequest
     * @return CreateIndexResponse
     */
    @Override
    public CompletableFuture<CreateIndexResponse> createIndex(CreateIndexRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateIndex").setMethod(HttpMethod.POST).setPathRegex("/logstores/{logstore}/index").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateIndexResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateIndexResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateLogStoreResponse> createLogStore(CreateLogStoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateLogStore").setMethod(HttpMethod.POST).setPathRegex("/logstores").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLogStoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLogStoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of CreateLogging  CreateLoggingRequest
     * @return CreateLoggingResponse
     */
    @Override
    public CompletableFuture<CreateLoggingResponse> createLogging(CreateLoggingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateLogging").setMethod(HttpMethod.POST).setPathRegex("/logging").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLoggingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLoggingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The UK (London) region is supported. Supported regions are constantly updated.</p>
     * 
     * @param request the request parameters of CreateLogtailPipelineConfig  CreateLogtailPipelineConfigRequest
     * @return CreateLogtailPipelineConfigResponse
     */
    @Override
    public CompletableFuture<CreateLogtailPipelineConfigResponse> createLogtailPipelineConfig(CreateLogtailPipelineConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateLogtailPipelineConfig").setMethod(HttpMethod.POST).setPathRegex("/pipelineconfigs").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLogtailPipelineConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLogtailPipelineConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of CreateMachineGroup  CreateMachineGroupRequest
     * @return CreateMachineGroupResponse
     */
    @Override
    public CompletableFuture<CreateMachineGroupResponse> createMachineGroup(CreateMachineGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateMachineGroup").setMethod(HttpMethod.POST).setPathRegex("/machinegroups").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMachineGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMachineGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateMetricStoreResponse> createMetricStore(CreateMetricStoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateMetricStore").setMethod(HttpMethod.POST).setPathRegex("/metricstores").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMetricStoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMetricStoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateOSSExport  CreateOSSExportRequest
     * @return CreateOSSExportResponse
     */
    @Override
    public CompletableFuture<CreateOSSExportResponse> createOSSExport(CreateOSSExportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateOSSExport").setMethod(HttpMethod.POST).setPathRegex("/ossexports").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateOSSExportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateOSSExportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateOSSHDFSExport  CreateOSSHDFSExportRequest
     * @return CreateOSSHDFSExportResponse
     */
    @Override
    public CompletableFuture<CreateOSSHDFSExportResponse> createOSSHDFSExport(CreateOSSHDFSExportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateOSSHDFSExport").setMethod(HttpMethod.POST).setPathRegex("/osshdfsexports").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateOSSHDFSExportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateOSSHDFSExportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateOSSIngestion  CreateOSSIngestionRequest
     * @return CreateOSSIngestionResponse
     */
    @Override
    public CompletableFuture<CreateOSSIngestionResponse> createOSSIngestion(CreateOSSIngestionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateOSSIngestion").setMethod(HttpMethod.POST).setPathRegex("/ossingestions").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateOSSIngestionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateOSSIngestionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of CreateOssExternalStore  CreateOssExternalStoreRequest
     * @return CreateOssExternalStoreResponse
     */
    @Override
    public CompletableFuture<CreateOssExternalStoreResponse> createOssExternalStore(CreateOssExternalStoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateOssExternalStore").setMethod(HttpMethod.POST).setPathRegex("/externalstores").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateOssExternalStoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateOssExternalStoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateProject  CreateProjectRequest
     * @return CreateProjectResponse
     */
    @Override
    public CompletableFuture<CreateProjectResponse> createProject(CreateProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateProject").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of CreateRdsExternalStore  CreateRdsExternalStoreRequest
     * @return CreateRdsExternalStoreResponse
     */
    @Override
    public CompletableFuture<CreateRdsExternalStoreResponse> createRdsExternalStore(CreateRdsExternalStoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateRdsExternalStore").setMethod(HttpMethod.POST).setPathRegex("/externalstores").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRdsExternalStoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRdsExternalStoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateSavedSearchResponse> createSavedSearch(CreateSavedSearchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateSavedSearch").setMethod(HttpMethod.POST).setPathRegex("/savedsearches").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSavedSearchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSavedSearchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateScheduledSQL  CreateScheduledSQLRequest
     * @return CreateScheduledSQLResponse
     */
    @Override
    public CompletableFuture<CreateScheduledSQLResponse> createScheduledSQL(CreateScheduledSQLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateScheduledSQL").setMethod(HttpMethod.POST).setPathRegex("/scheduledsqls").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateScheduledSQLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateScheduledSQLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>*Before you call this operation, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/223777.html">billing</a> of Dedicated SQL.</p>
     * 
     * @param request the request parameters of CreateSqlInstance  CreateSqlInstanceRequest
     * @return CreateSqlInstanceResponse
     */
    @Override
    public CompletableFuture<CreateSqlInstanceResponse> createSqlInstance(CreateSqlInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateSqlInstance").setMethod(HttpMethod.POST).setPathRegex("/sqlinstance").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSqlInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSqlInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateStoreView  CreateStoreViewRequest
     * @return CreateStoreViewResponse
     */
    @Override
    public CompletableFuture<CreateStoreViewResponse> createStoreView(CreateStoreViewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateStoreView").setMethod(HttpMethod.POST).setPathRegex("/storeviews").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateStoreViewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateStoreViewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateTicket  CreateTicketRequest
     * @return CreateTicketResponse
     */
    @Override
    public CompletableFuture<CreateTicketResponse> createTicket(CreateTicketRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateTicket").setMethod(HttpMethod.POST).setPathRegex("/tickets").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTicketResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTicketResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteAgentInstanceConfig  DeleteAgentInstanceConfigRequest
     * @return DeleteAgentInstanceConfigResponse
     */
    @Override
    public CompletableFuture<DeleteAgentInstanceConfigResponse> deleteAgentInstanceConfig(DeleteAgentInstanceConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteAgentInstanceConfig").setMethod(HttpMethod.DELETE).setPathRegex("/agentinstanceconfigs/{configName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAgentInstanceConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAgentInstanceConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteAlert  DeleteAlertRequest
     * @return DeleteAlertResponse
     */
    @Override
    public CompletableFuture<DeleteAlertResponse> deleteAlert(DeleteAlertRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteAlert").setMethod(HttpMethod.DELETE).setPathRegex("/alerts/{alertName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAlertResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAlertResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteAnnotationData  DeleteAnnotationDataRequest
     * @return DeleteAnnotationDataResponse
     */
    @Override
    public CompletableFuture<DeleteAnnotationDataResponse> deleteAnnotationData(DeleteAnnotationDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteAnnotationData").setMethod(HttpMethod.DELETE).setPathRegex("/ml/annotationdataset/{datasetId}/annotationdata/{annotationdataId}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAnnotationDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAnnotationDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can delete a dataset only if no data exists in the dataset.</p>
     * 
     * @param request the request parameters of DeleteAnnotationDataSet  DeleteAnnotationDataSetRequest
     * @return DeleteAnnotationDataSetResponse
     */
    @Override
    public CompletableFuture<DeleteAnnotationDataSetResponse> deleteAnnotationDataSet(DeleteAnnotationDataSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteAnnotationDataSet").setMethod(HttpMethod.DELETE).setPathRegex("/ml/annotationdataset/{datasetId}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAnnotationDataSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAnnotationDataSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only non-built-in tags can be deleted.</p>
     * 
     * @param request the request parameters of DeleteAnnotationLabel  DeleteAnnotationLabelRequest
     * @return DeleteAnnotationLabelResponse
     */
    @Override
    public CompletableFuture<DeleteAnnotationLabelResponse> deleteAnnotationLabel(DeleteAnnotationLabelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteAnnotationLabel").setMethod(HttpMethod.DELETE).setPathRegex("/ml/annotationlabel/{labelId}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAnnotationLabelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAnnotationLabelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must use the Simple Log Service endpoint for the China (Shanghai) or Singapore region to call the operation.</p>
     * 
     * @param request the request parameters of DeleteCollectionPolicy  DeleteCollectionPolicyRequest
     * @return DeleteCollectionPolicyResponse
     */
    @Override
    public CompletableFuture<DeleteCollectionPolicyResponse> deleteCollectionPolicy(DeleteCollectionPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteCollectionPolicy").setMethod(HttpMethod.DELETE).setPathRegex("/collectionpolicy/{policyName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCollectionPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCollectionPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteConfigResponse> deleteConfig(DeleteConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteConfig").setMethod(HttpMethod.DELETE).setPathRegex("/configs/{configName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteConsumerGroupResponse> deleteConsumerGroup(DeleteConsumerGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteConsumerGroup").setMethod(HttpMethod.DELETE).setPathRegex("/logstores/{logstore}/consumergroups/{consumerGroup}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteConsumerGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteConsumerGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteDashboardResponse> deleteDashboard(DeleteDashboardRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteDashboard").setMethod(HttpMethod.DELETE).setPathRegex("/dashboards/{dashboardName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDashboardResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDashboardResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of DeleteDomain  DeleteDomainRequest
     * @return DeleteDomainResponse
     */
    @Override
    public CompletableFuture<DeleteDomainResponse> deleteDomain(DeleteDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteDomain").setMethod(HttpMethod.DELETE).setPathRegex("/domains/{domainName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDownloadJob  DeleteDownloadJobRequest
     * @return DeleteDownloadJobResponse
     */
    @Override
    public CompletableFuture<DeleteDownloadJobResponse> deleteDownloadJob(DeleteDownloadJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteDownloadJob").setMethod(HttpMethod.DELETE).setPathRegex("/downloadjobs/{downloadJobName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDownloadJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDownloadJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteETL  DeleteETLRequest
     * @return DeleteETLResponse
     */
    @Override
    public CompletableFuture<DeleteETLResponse> deleteETL(DeleteETLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteETL").setMethod(HttpMethod.DELETE).setPathRegex("/etls/{etlName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteETLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteETLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of DeleteExternalStore  DeleteExternalStoreRequest
     * @return DeleteExternalStoreResponse
     */
    @Override
    public CompletableFuture<DeleteExternalStoreResponse> deleteExternalStore(DeleteExternalStoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteExternalStore").setMethod(HttpMethod.DELETE).setPathRegex("/externalstores/{externalStoreName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteExternalStoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteExternalStoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of DeleteIndex  DeleteIndexRequest
     * @return DeleteIndexResponse
     */
    @Override
    public CompletableFuture<DeleteIndexResponse> deleteIndex(DeleteIndexRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteIndex").setMethod(HttpMethod.DELETE).setPathRegex("/logstores/{logstore}/index").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteIndexResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteIndexResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>Host consists of a project name and a Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of DeleteLogStore  DeleteLogStoreRequest
     * @return DeleteLogStoreResponse
     */
    @Override
    public CompletableFuture<DeleteLogStoreResponse> deleteLogStore(DeleteLogStoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteLogStore").setMethod(HttpMethod.DELETE).setPathRegex("/logstores/{logstore}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLogStoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLogStoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteLogging  DeleteLoggingRequest
     * @return DeleteLoggingResponse
     */
    @Override
    public CompletableFuture<DeleteLoggingResponse> deleteLogging(DeleteLoggingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteLogging").setMethod(HttpMethod.DELETE).setPathRegex("/logging").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLoggingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLoggingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The UK (London) region is supported. Supported regions are constantly updated.</p>
     * 
     * @param request the request parameters of DeleteLogtailPipelineConfig  DeleteLogtailPipelineConfigRequest
     * @return DeleteLogtailPipelineConfigResponse
     */
    @Override
    public CompletableFuture<DeleteLogtailPipelineConfigResponse> deleteLogtailPipelineConfig(DeleteLogtailPipelineConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteLogtailPipelineConfig").setMethod(HttpMethod.DELETE).setPathRegex("/pipelineconfigs/{configName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLogtailPipelineConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLogtailPipelineConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of DeleteMachineGroup  DeleteMachineGroupRequest
     * @return DeleteMachineGroupResponse
     */
    @Override
    public CompletableFuture<DeleteMachineGroupResponse> deleteMachineGroup(DeleteMachineGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteMachineGroup").setMethod(HttpMethod.DELETE).setPathRegex("/machinegroups/{machineGroup}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMachineGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMachineGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteMetricStoreResponse> deleteMetricStore(DeleteMetricStoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteMetricStore").setMethod(HttpMethod.DELETE).setPathRegex("/metricstores/{name}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMetricStoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMetricStoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteOSSExport  DeleteOSSExportRequest
     * @return DeleteOSSExportResponse
     */
    @Override
    public CompletableFuture<DeleteOSSExportResponse> deleteOSSExport(DeleteOSSExportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteOSSExport").setMethod(HttpMethod.DELETE).setPathRegex("/ossexports/{ossExportName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteOSSExportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteOSSExportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteOSSHDFSExport  DeleteOSSHDFSExportRequest
     * @return DeleteOSSHDFSExportResponse
     */
    @Override
    public CompletableFuture<DeleteOSSHDFSExportResponse> deleteOSSHDFSExport(DeleteOSSHDFSExportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteOSSHDFSExport").setMethod(HttpMethod.DELETE).setPathRegex("/osshdfsexports/{ossExportName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteOSSHDFSExportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteOSSHDFSExportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteOSSIngestion  DeleteOSSIngestionRequest
     * @return DeleteOSSIngestionResponse
     */
    @Override
    public CompletableFuture<DeleteOSSIngestionResponse> deleteOSSIngestion(DeleteOSSIngestionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteOSSIngestion").setMethod(HttpMethod.DELETE).setPathRegex("/ossingestions/{ossIngestionName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteOSSIngestionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteOSSIngestionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteProjectResponse> deleteProject(DeleteProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteProject").setMethod(HttpMethod.DELETE).setPathRegex("/").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteProjectPolicyResponse> deleteProjectPolicy(DeleteProjectPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteProjectPolicy").setMethod(HttpMethod.DELETE).setPathRegex("/policy").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteProjectPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteProjectPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteSavedSearchResponse> deleteSavedSearch(DeleteSavedSearchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteSavedSearch").setMethod(HttpMethod.DELETE).setPathRegex("/savedsearches/{savedsearchName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSavedSearchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSavedSearchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteScheduledSQL  DeleteScheduledSQLRequest
     * @return DeleteScheduledSQLResponse
     */
    @Override
    public CompletableFuture<DeleteScheduledSQLResponse> deleteScheduledSQL(DeleteScheduledSQLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteScheduledSQL").setMethod(HttpMethod.DELETE).setPathRegex("/scheduledsqls/{scheduledSQLName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteScheduledSQLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteScheduledSQLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteStoreView  DeleteStoreViewRequest
     * @return DeleteStoreViewResponse
     */
    @Override
    public CompletableFuture<DeleteStoreViewResponse> deleteStoreView(DeleteStoreViewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteStoreView").setMethod(HttpMethod.DELETE).setPathRegex("/storeviews/{name}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteStoreViewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteStoreViewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    @Override
    public CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeRegions").setMethod(HttpMethod.GET).setPathRegex("/regions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisableAlert  DisableAlertRequest
     * @return DisableAlertResponse
     */
    @Override
    public CompletableFuture<DisableAlertResponse> disableAlert(DisableAlertRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DisableAlert").setMethod(HttpMethod.PUT).setPathRegex("/alerts/{alertName}?action=disable").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableAlertResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableAlertResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisableScheduledSQL  DisableScheduledSQLRequest
     * @return DisableScheduledSQLResponse
     */
    @Override
    public CompletableFuture<DisableScheduledSQLResponse> disableScheduledSQL(DisableScheduledSQLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DisableScheduledSQL").setMethod(HttpMethod.PUT).setPathRegex("/scheduledsqls/{scheduledSQLName}?action=disable").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableScheduledSQLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableScheduledSQLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnableAlert  EnableAlertRequest
     * @return EnableAlertResponse
     */
    @Override
    public CompletableFuture<EnableAlertResponse> enableAlert(EnableAlertRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("EnableAlert").setMethod(HttpMethod.PUT).setPathRegex("/alerts/{alertName}?action=enable").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableAlertResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableAlertResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnableScheduledSQL  EnableScheduledSQLRequest
     * @return EnableScheduledSQLResponse
     */
    @Override
    public CompletableFuture<EnableScheduledSQLResponse> enableScheduledSQL(EnableScheduledSQLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("EnableScheduledSQL").setMethod(HttpMethod.PUT).setPathRegex("/scheduledsqls/{scheduledSQLName}?action=enable").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableScheduledSQLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableScheduledSQLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAgentInstanceConfig  GetAgentInstanceConfigRequest
     * @return GetAgentInstanceConfigResponse
     */
    @Override
    public CompletableFuture<GetAgentInstanceConfigResponse> getAgentInstanceConfig(GetAgentInstanceConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAgentInstanceConfig").setMethod(HttpMethod.GET).setPathRegex("/agentinstanceconfigs/{configName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgentInstanceConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgentInstanceConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAlert  GetAlertRequest
     * @return GetAlertResponse
     */
    @Override
    public CompletableFuture<GetAlertResponse> getAlert(GetAlertRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAlert").setMethod(HttpMethod.GET).setPathRegex("/alerts/{alertName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAlertResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAlertResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAnnotationData  GetAnnotationDataRequest
     * @return GetAnnotationDataResponse
     */
    @Override
    public CompletableFuture<GetAnnotationDataResponse> getAnnotationData(GetAnnotationDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAnnotationData").setMethod(HttpMethod.GET).setPathRegex("/ml/annotationdataset/{datasetId}/annotationdata/{annotationdataId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAnnotationDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAnnotationDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAnnotationDataSet  GetAnnotationDataSetRequest
     * @return GetAnnotationDataSetResponse
     */
    @Override
    public CompletableFuture<GetAnnotationDataSetResponse> getAnnotationDataSet(GetAnnotationDataSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAnnotationDataSet").setMethod(HttpMethod.GET).setPathRegex("/ml/annotationdataset/{datasetId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAnnotationDataSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAnnotationDataSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAnnotationLabel  GetAnnotationLabelRequest
     * @return GetAnnotationLabelResponse
     */
    @Override
    public CompletableFuture<GetAnnotationLabelResponse> getAnnotationLabel(GetAnnotationLabelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAnnotationLabel").setMethod(HttpMethod.GET).setPathRegex("/ml/annotationlabel/{labelId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAnnotationLabelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAnnotationLabelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of GetAppliedConfigs  GetAppliedConfigsRequest
     * @return GetAppliedConfigsResponse
     */
    @Override
    public CompletableFuture<GetAppliedConfigsResponse> getAppliedConfigs(GetAppliedConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAppliedConfigs").setMethod(HttpMethod.GET).setPathRegex("/machinegroups/{machineGroup}/configs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAppliedConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAppliedConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of GetAppliedMachineGroups  GetAppliedMachineGroupsRequest
     * @return GetAppliedMachineGroupsResponse
     */
    @Override
    public CompletableFuture<GetAppliedMachineGroupsResponse> getAppliedMachineGroups(GetAppliedMachineGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAppliedMachineGroups").setMethod(HttpMethod.GET).setPathRegex("/configs/{configName}/machinegroups").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAppliedMachineGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAppliedMachineGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of GetCheckPoint  GetCheckPointRequest
     * @return GetCheckPointResponse
     */
    @Override
    public CompletableFuture<GetCheckPointResponse> getCheckPoint(GetCheckPointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetCheckPoint").setMethod(HttpMethod.GET).setPathRegex("/logstores/{logstore}/consumergroups/{consumerGroup}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCheckPointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCheckPointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCollectionPolicy  GetCollectionPolicyRequest
     * @return GetCollectionPolicyResponse
     */
    @Override
    public CompletableFuture<GetCollectionPolicyResponse> getCollectionPolicy(GetCollectionPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetCollectionPolicy").setMethod(HttpMethod.GET).setPathRegex("/collectionpolicy/{policyName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCollectionPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCollectionPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetConfigResponse> getConfig(GetConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetConfig").setMethod(HttpMethod.GET).setPathRegex("/configs/{configName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetContextLogsResponse> getContextLogs(GetContextLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetContextLogs").setMethod(HttpMethod.GET).setPathRegex("/logstores/{logstore}?type=context_log").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetContextLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetContextLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetCursorResponse> getCursor(GetCursorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetCursor").setMethod(HttpMethod.GET).setPathRegex("/logstores/{logstore}/shards/{shardId}?type=cursor").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCursorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCursorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCursorTime  GetCursorTimeRequest
     * @return GetCursorTimeResponse
     */
    @Override
    public CompletableFuture<GetCursorTimeResponse> getCursorTime(GetCursorTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetCursorTime").setMethod(HttpMethod.GET).setPathRegex("/logstores/{logstore}/shards/{shardId}?type=cursor_time").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCursorTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCursorTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetDashboardResponse> getDashboard(GetDashboardRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDashboard").setMethod(HttpMethod.GET).setPathRegex("/dashboards/{dashboardName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDashboardResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDashboardResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDownloadJob  GetDownloadJobRequest
     * @return GetDownloadJobResponse
     */
    @Override
    public CompletableFuture<GetDownloadJobResponse> getDownloadJob(GetDownloadJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDownloadJob").setMethod(HttpMethod.GET).setPathRegex("/downloadjobs/{downloadJobName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDownloadJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDownloadJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetETL  GetETLRequest
     * @return GetETLResponse
     */
    @Override
    public CompletableFuture<GetETLResponse> getETL(GetETLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetETL").setMethod(HttpMethod.GET).setPathRegex("/etls/{etlName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetETLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetETLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetExternalStoreResponse> getExternalStore(GetExternalStoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetExternalStore").setMethod(HttpMethod.GET).setPathRegex("/externalstores/{externalStoreName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetExternalStoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetExternalStoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetHistogramsResponse> getHistograms(GetHistogramsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetHistograms").setMethod(HttpMethod.GET).setPathRegex("/logstores/{logstore}/index?type=histogram").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHistogramsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHistogramsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of GetIndex  GetIndexRequest
     * @return GetIndexResponse
     */
    @Override
    public CompletableFuture<GetIndexResponse> getIndex(GetIndexRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetIndex").setMethod(HttpMethod.GET).setPathRegex("/logstores/{logstore}/index").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetIndexResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetIndexResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of GetLogStore  GetLogStoreRequest
     * @return GetLogStoreResponse
     */
    @Override
    public CompletableFuture<GetLogStoreResponse> getLogStore(GetLogStoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetLogStore").setMethod(HttpMethod.GET).setPathRegex("/logstores/{logstore}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLogStoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLogStoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLogStoreMeteringMode  GetLogStoreMeteringModeRequest
     * @return GetLogStoreMeteringModeResponse
     */
    @Override
    public CompletableFuture<GetLogStoreMeteringModeResponse> getLogStoreMeteringMode(GetLogStoreMeteringModeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetLogStoreMeteringMode").setMethod(HttpMethod.GET).setPathRegex("/logstores/{logstore}/meteringmode").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLogStoreMeteringModeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLogStoreMeteringModeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of GetLogging  GetLoggingRequest
     * @return GetLoggingResponse
     */
    @Override
    public CompletableFuture<GetLoggingResponse> getLogging(GetLoggingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetLogging").setMethod(HttpMethod.GET).setPathRegex("/logging").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLoggingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLoggingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetLogsResponse> getLogs(GetLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetLogs").setMethod(HttpMethod.GET).setPathRegex("/logstores/{logstore}?type=log").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetLogsV2Response> getLogsV2(GetLogsV2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetLogsV2").setMethod(HttpMethod.POST).setPathRegex("/logstores/{logstore}/logs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLogsV2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLogsV2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The UK (London) region is supported. Supported regions are constantly updated.</p>
     * 
     * @param request the request parameters of GetLogtailPipelineConfig  GetLogtailPipelineConfigRequest
     * @return GetLogtailPipelineConfigResponse
     */
    @Override
    public CompletableFuture<GetLogtailPipelineConfigResponse> getLogtailPipelineConfig(GetLogtailPipelineConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetLogtailPipelineConfig").setMethod(HttpMethod.GET).setPathRegex("/pipelineconfigs/{configName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLogtailPipelineConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLogtailPipelineConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMLServiceResults  GetMLServiceResultsRequest
     * @return GetMLServiceResultsResponse
     */
    @Override
    public CompletableFuture<GetMLServiceResultsResponse> getMLServiceResults(GetMLServiceResultsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMLServiceResults").setMethod(HttpMethod.POST).setPathRegex("/ml/service/{serviceName}/analysis").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMLServiceResultsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMLServiceResultsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of GetMachineGroup  GetMachineGroupRequest
     * @return GetMachineGroupResponse
     */
    @Override
    public CompletableFuture<GetMachineGroupResponse> getMachineGroup(GetMachineGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMachineGroup").setMethod(HttpMethod.GET).setPathRegex("/machinegroups/{machineGroup}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMachineGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMachineGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetMetricStoreResponse> getMetricStore(GetMetricStoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMetricStore").setMethod(HttpMethod.GET).setPathRegex("/metricstores/{name}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMetricStoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMetricStoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMetricStoreMeteringMode  GetMetricStoreMeteringModeRequest
     * @return GetMetricStoreMeteringModeResponse
     */
    @Override
    public CompletableFuture<GetMetricStoreMeteringModeResponse> getMetricStoreMeteringMode(GetMetricStoreMeteringModeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMetricStoreMeteringMode").setMethod(HttpMethod.GET).setPathRegex("/metricstores/{metricStore}/meteringmode").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMetricStoreMeteringModeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMetricStoreMeteringModeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetOSSExport  GetOSSExportRequest
     * @return GetOSSExportResponse
     */
    @Override
    public CompletableFuture<GetOSSExportResponse> getOSSExport(GetOSSExportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetOSSExport").setMethod(HttpMethod.GET).setPathRegex("/ossexports/{ossExportName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOSSExportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOSSExportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetOSSHDFSExport  GetOSSHDFSExportRequest
     * @return GetOSSHDFSExportResponse
     */
    @Override
    public CompletableFuture<GetOSSHDFSExportResponse> getOSSHDFSExport(GetOSSHDFSExportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetOSSHDFSExport").setMethod(HttpMethod.GET).setPathRegex("/osshdfsexports/{ossExportName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOSSHDFSExportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOSSHDFSExportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetOSSIngestion  GetOSSIngestionRequest
     * @return GetOSSIngestionResponse
     */
    @Override
    public CompletableFuture<GetOSSIngestionResponse> getOSSIngestion(GetOSSIngestionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetOSSIngestion").setMethod(HttpMethod.GET).setPathRegex("/ossingestions/{ossIngestionName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOSSIngestionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOSSIngestionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of GetProject  GetProjectRequest
     * @return GetProjectResponse
     */
    @Override
    public CompletableFuture<GetProjectResponse> getProject(GetProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetProject").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetProjectLogsResponse> getProjectLogs(GetProjectLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetProjectLogs").setMethod(HttpMethod.GET).setPathRegex("/logs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetProjectLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetProjectLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetProjectPolicyResponse> getProjectPolicy(GetProjectPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetProjectPolicy").setMethod(HttpMethod.GET).setPathRegex("/policy").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetProjectPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetProjectPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetSavedSearchResponse> getSavedSearch(GetSavedSearchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetSavedSearch").setMethod(HttpMethod.GET).setPathRegex("/savedsearches/{savedsearchName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSavedSearchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSavedSearchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetScheduledSQL  GetScheduledSQLRequest
     * @return GetScheduledSQLResponse
     */
    @Override
    public CompletableFuture<GetScheduledSQLResponse> getScheduledSQL(GetScheduledSQLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetScheduledSQL").setMethod(HttpMethod.GET).setPathRegex("/scheduledsqls/{scheduledSQLName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetScheduledSQLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetScheduledSQLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSlsService  GetSlsServiceRequest
     * @return GetSlsServiceResponse
     */
    @Override
    public CompletableFuture<GetSlsServiceResponse> getSlsService(GetSlsServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetSlsService").setMethod(HttpMethod.GET).setPathRegex("/slsservice").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSlsServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSlsServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSqlInstance  GetSqlInstanceRequest
     * @return GetSqlInstanceResponse
     */
    @Override
    public CompletableFuture<GetSqlInstanceResponse> getSqlInstance(GetSqlInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetSqlInstance").setMethod(HttpMethod.GET).setPathRegex("/sqlinstance").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSqlInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSqlInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetStoreView  GetStoreViewRequest
     * @return GetStoreViewResponse
     */
    @Override
    public CompletableFuture<GetStoreViewResponse> getStoreView(GetStoreViewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetStoreView").setMethod(HttpMethod.GET).setPathRegex("/storeviews/{name}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetStoreViewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetStoreViewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetStoreViewIndex  GetStoreViewIndexRequest
     * @return GetStoreViewIndexResponse
     */
    @Override
    public CompletableFuture<GetStoreViewIndexResponse> getStoreViewIndex(GetStoreViewIndexRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetStoreViewIndex").setMethod(HttpMethod.GET).setPathRegex("/storeviews/{name}/index").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetStoreViewIndexResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetStoreViewIndexResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAgentInstanceConfigs  ListAgentInstanceConfigsRequest
     * @return ListAgentInstanceConfigsResponse
     */
    @Override
    public CompletableFuture<ListAgentInstanceConfigsResponse> listAgentInstanceConfigs(ListAgentInstanceConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAgentInstanceConfigs").setMethod(HttpMethod.GET).setPathRegex("/agentinstanceconfigs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAgentInstanceConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAgentInstanceConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAlerts  ListAlertsRequest
     * @return ListAlertsResponse
     */
    @Override
    public CompletableFuture<ListAlertsResponse> listAlerts(ListAlertsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAlerts").setMethod(HttpMethod.GET).setPathRegex("/alerts").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAlertsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAlertsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAnnotationData  ListAnnotationDataRequest
     * @return ListAnnotationDataResponse
     */
    @Override
    public CompletableFuture<ListAnnotationDataResponse> listAnnotationData(ListAnnotationDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAnnotationData").setMethod(HttpMethod.GET).setPathRegex("/ml/annotationdataset/{datasetId}/annotationdata").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAnnotationDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAnnotationDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAnnotationDataSets  ListAnnotationDataSetsRequest
     * @return ListAnnotationDataSetsResponse
     */
    @Override
    public CompletableFuture<ListAnnotationDataSetsResponse> listAnnotationDataSets(ListAnnotationDataSetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAnnotationDataSets").setMethod(HttpMethod.GET).setPathRegex("/ml/annotationdataset").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAnnotationDataSetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAnnotationDataSetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAnnotationLabels  ListAnnotationLabelsRequest
     * @return ListAnnotationLabelsResponse
     */
    @Override
    public CompletableFuture<ListAnnotationLabelsResponse> listAnnotationLabels(ListAnnotationLabelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAnnotationLabels").setMethod(HttpMethod.GET).setPathRegex("/ml/annotationlabel").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAnnotationLabelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAnnotationLabelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must use the Simple Log Service endpoint for the China (Shanghai) or Singapore region to call the operation.</p>
     * 
     * @param request the request parameters of ListCollectionPolicies  ListCollectionPoliciesRequest
     * @return ListCollectionPoliciesResponse
     */
    @Override
    public CompletableFuture<ListCollectionPoliciesResponse> listCollectionPolicies(ListCollectionPoliciesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListCollectionPolicies").setMethod(HttpMethod.GET).setPathRegex("/collectionpolicy").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCollectionPoliciesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCollectionPoliciesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ListConfigResponse> listConfig(ListConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListConfig").setMethod(HttpMethod.GET).setPathRegex("/configs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ListConsumerGroupResponse> listConsumerGroup(ListConsumerGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListConsumerGroup").setMethod(HttpMethod.GET).setPathRegex("/logstores/{logstore}/consumergroups").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListConsumerGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListConsumerGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ListDashboardResponse> listDashboard(ListDashboardRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDashboard").setMethod(HttpMethod.GET).setPathRegex("/dashboards").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDashboardResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDashboardResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ListDomainsResponse> listDomains(ListDomainsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDomains").setMethod(HttpMethod.GET).setPathRegex("/domains").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDomainsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDomainsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDownloadJobs  ListDownloadJobsRequest
     * @return ListDownloadJobsResponse
     */
    @Override
    public CompletableFuture<ListDownloadJobsResponse> listDownloadJobs(ListDownloadJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDownloadJobs").setMethod(HttpMethod.GET).setPathRegex("/downloadjobs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDownloadJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDownloadJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListETLs  ListETLsRequest
     * @return ListETLsResponse
     */
    @Override
    public CompletableFuture<ListETLsResponse> listETLs(ListETLsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListETLs").setMethod(HttpMethod.GET).setPathRegex("/etls").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListETLsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListETLsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ListLogStoresResponse> listLogStores(ListLogStoresRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListLogStores").setMethod(HttpMethod.GET).setPathRegex("/logstores").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLogStoresResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLogStoresResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The UK (London) region is supported. Supported regions are constantly updated.</p>
     * 
     * @param request the request parameters of ListLogtailPipelineConfig  ListLogtailPipelineConfigRequest
     * @return ListLogtailPipelineConfigResponse
     */
    @Override
    public CompletableFuture<ListLogtailPipelineConfigResponse> listLogtailPipelineConfig(ListLogtailPipelineConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListLogtailPipelineConfig").setMethod(HttpMethod.GET).setPathRegex("/pipelineconfigs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLogtailPipelineConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLogtailPipelineConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of ListMachineGroup  ListMachineGroupRequest
     * @return ListMachineGroupResponse
     */
    @Override
    public CompletableFuture<ListMachineGroupResponse> listMachineGroup(ListMachineGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMachineGroup").setMethod(HttpMethod.GET).setPathRegex("/machinegroups").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMachineGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMachineGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of ListMachines  ListMachinesRequest
     * @return ListMachinesResponse
     */
    @Override
    public CompletableFuture<ListMachinesResponse> listMachines(ListMachinesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMachines").setMethod(HttpMethod.GET).setPathRegex("/machinegroups/{machineGroup}/machines").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMachinesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMachinesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ListMetricStoresResponse> listMetricStores(ListMetricStoresRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMetricStores").setMethod(HttpMethod.GET).setPathRegex("/metricstores").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMetricStoresResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMetricStoresResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListOSSExports  ListOSSExportsRequest
     * @return ListOSSExportsResponse
     */
    @Override
    public CompletableFuture<ListOSSExportsResponse> listOSSExports(ListOSSExportsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListOSSExports").setMethod(HttpMethod.GET).setPathRegex("/ossexports").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListOSSExportsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListOSSExportsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListOSSHDFSExports  ListOSSHDFSExportsRequest
     * @return ListOSSHDFSExportsResponse
     */
    @Override
    public CompletableFuture<ListOSSHDFSExportsResponse> listOSSHDFSExports(ListOSSHDFSExportsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListOSSHDFSExports").setMethod(HttpMethod.GET).setPathRegex("/osshdfsexports").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListOSSHDFSExportsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListOSSHDFSExportsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListOSSIngestions  ListOSSIngestionsRequest
     * @return ListOSSIngestionsResponse
     */
    @Override
    public CompletableFuture<ListOSSIngestionsResponse> listOSSIngestions(ListOSSIngestionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListOSSIngestions").setMethod(HttpMethod.GET).setPathRegex("/ossingestions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListOSSIngestionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListOSSIngestionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of ListProject  ListProjectRequest
     * @return ListProjectResponse
     */
    @Override
    public CompletableFuture<ListProjectResponse> listProject(ListProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListProject").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of ListSavedSearch  ListSavedSearchRequest
     * @return ListSavedSearchResponse
     */
    @Override
    public CompletableFuture<ListSavedSearchResponse> listSavedSearch(ListSavedSearchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSavedSearch").setMethod(HttpMethod.GET).setPathRegex("/savedsearches").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSavedSearchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSavedSearchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListScheduledSQLs  ListScheduledSQLsRequest
     * @return ListScheduledSQLsResponse
     */
    @Override
    public CompletableFuture<ListScheduledSQLsResponse> listScheduledSQLs(ListScheduledSQLsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListScheduledSQLs").setMethod(HttpMethod.GET).setPathRegex("/scheduledsqls").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListScheduledSQLsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListScheduledSQLsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListShards  ListShardsRequest
     * @return ListShardsResponse
     */
    @Override
    public CompletableFuture<ListShardsResponse> listShards(ListShardsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListShards").setMethod(HttpMethod.GET).setPathRegex("/logstores/{logstore}/shards").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListShardsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListShardsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListStoreViews  ListStoreViewsRequest
     * @return ListStoreViewsResponse
     */
    @Override
    public CompletableFuture<ListStoreViewsResponse> listStoreViews(ListStoreViewsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListStoreViews").setMethod(HttpMethod.GET).setPathRegex("/storeviews").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListStoreViewsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListStoreViewsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTagResources").setMethod(HttpMethod.GET).setPathRegex("/tags").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of MergeShard  MergeShardRequest
     * @return MergeShardResponse
     */
    @Override
    public CompletableFuture<MergeShardResponse> mergeShard(MergeShardRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("MergeShard").setMethod(HttpMethod.POST).setPathRegex("/logstores/{logstore}/shards/{shard}?action=merge").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MergeShardResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MergeShardResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OpenSlsService  OpenSlsServiceRequest
     * @return OpenSlsServiceResponse
     */
    @Override
    public CompletableFuture<OpenSlsServiceResponse> openSlsService(OpenSlsServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("OpenSlsService").setMethod(HttpMethod.POST).setPathRegex("/slsservice").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OpenSlsServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OpenSlsServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You cannot call this operation in OpenAPI Explorer. You can use Simple Log Service SDK to call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/29063.html">SLS SDK Reference</a>.</p>
     * 
     * @param request the request parameters of PullLogs  PullLogsRequest
     * @return PullLogsResponse
     */
    @Override
    public CompletableFuture<PullLogsResponse> pullLogs(PullLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PullLogs").setMethod(HttpMethod.GET).setPathRegex("/logstores/{logStore}/shards/{shardId}?type=log").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PullLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PullLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PutAnnotationData  PutAnnotationDataRequest
     * @return PutAnnotationDataResponse
     */
    @Override
    public CompletableFuture<PutAnnotationDataResponse> putAnnotationData(PutAnnotationDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PutAnnotationData").setMethod(HttpMethod.PUT).setPathRegex("/ml/annotationdataset/{datasetId}/annotationdata").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutAnnotationDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutAnnotationDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You cannot call this operation by using cloud service SDKs that are provided by Alibaba Cloud OpenAPI Portal. You can use Simple Log Service SDK to call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/29063.html">SLS SDK Reference</a>.</p>
     * 
     * @param request the request parameters of PutLogs  PutLogsRequest
     * @return PutLogsResponse
     */
    @Override
    public CompletableFuture<PutLogsResponse> putLogs(PutLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PutLogs").setMethod(HttpMethod.POST).setPathRegex("/logstores/{logstore}/shards/lb").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<PutProjectPolicyResponse> putProjectPolicy(PutProjectPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PutProjectPolicy").setMethod(HttpMethod.POST).setPathRegex("/policy").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutProjectPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutProjectPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PutProjectTransferAcceleration  PutProjectTransferAccelerationRequest
     * @return PutProjectTransferAccelerationResponse
     */
    @Override
    public CompletableFuture<PutProjectTransferAccelerationResponse> putProjectTransferAcceleration(PutProjectTransferAccelerationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PutProjectTransferAcceleration").setMethod(HttpMethod.PUT).setPathRegex("/transferacceleration").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutProjectTransferAccelerationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutProjectTransferAccelerationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<PutWebtrackingResponse> putWebtracking(PutWebtrackingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PutWebtracking").setMethod(HttpMethod.POST).setPathRegex("/logstores/{logstoreName}/track").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutWebtrackingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutWebtrackingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RefreshToken  RefreshTokenRequest
     * @return RefreshTokenResponse
     */
    @Override
    public CompletableFuture<RefreshTokenResponse> refreshToken(RefreshTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RefreshToken").setMethod(HttpMethod.POST).setPathRegex("/token/refresh").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RefreshTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RefreshTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of RemoveConfigFromMachineGroup  RemoveConfigFromMachineGroupRequest
     * @return RemoveConfigFromMachineGroupResponse
     */
    @Override
    public CompletableFuture<RemoveConfigFromMachineGroupResponse> removeConfigFromMachineGroup(RemoveConfigFromMachineGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RemoveConfigFromMachineGroup").setMethod(HttpMethod.DELETE).setPathRegex("/machinegroups/{machineGroup}/configs/{configName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveConfigFromMachineGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveConfigFromMachineGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<SplitShardResponse> splitShard(SplitShardRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SplitShard").setMethod(HttpMethod.POST).setPathRegex("/logstores/{logstore}/shards/{shard}?action=split").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SplitShardResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SplitShardResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartETL  StartETLRequest
     * @return StartETLResponse
     */
    @Override
    public CompletableFuture<StartETLResponse> startETL(StartETLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StartETL").setMethod(HttpMethod.PUT).setPathRegex("/etls/{etlName}?action=START").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartETLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartETLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartOSSExport  StartOSSExportRequest
     * @return StartOSSExportResponse
     */
    @Override
    public CompletableFuture<StartOSSExportResponse> startOSSExport(StartOSSExportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StartOSSExport").setMethod(HttpMethod.PUT).setPathRegex("/ossexports/{ossExportName}?action=START").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartOSSExportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartOSSExportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartOSSHDFSExport  StartOSSHDFSExportRequest
     * @return StartOSSHDFSExportResponse
     */
    @Override
    public CompletableFuture<StartOSSHDFSExportResponse> startOSSHDFSExport(StartOSSHDFSExportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StartOSSHDFSExport").setMethod(HttpMethod.PUT).setPathRegex("/osshdfsexports/{ossExportName}?action=START").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartOSSHDFSExportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartOSSHDFSExportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartOSSIngestion  StartOSSIngestionRequest
     * @return StartOSSIngestionResponse
     */
    @Override
    public CompletableFuture<StartOSSIngestionResponse> startOSSIngestion(StartOSSIngestionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StartOSSIngestion").setMethod(HttpMethod.PUT).setPathRegex("/ossingestions/{ossIngestionName}?action=START").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartOSSIngestionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartOSSIngestionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopETL  StopETLRequest
     * @return StopETLResponse
     */
    @Override
    public CompletableFuture<StopETLResponse> stopETL(StopETLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopETL").setMethod(HttpMethod.PUT).setPathRegex("/etls/{etlName}?action=STOP").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopETLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopETLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopOSSExport  StopOSSExportRequest
     * @return StopOSSExportResponse
     */
    @Override
    public CompletableFuture<StopOSSExportResponse> stopOSSExport(StopOSSExportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopOSSExport").setMethod(HttpMethod.PUT).setPathRegex("/ossexports/{ossExportName}?action=STOP").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopOSSExportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopOSSExportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopOSSHDFSExport  StopOSSHDFSExportRequest
     * @return StopOSSHDFSExportResponse
     */
    @Override
    public CompletableFuture<StopOSSHDFSExportResponse> stopOSSHDFSExport(StopOSSHDFSExportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopOSSHDFSExport").setMethod(HttpMethod.PUT).setPathRegex("/osshdfsexports/{ossExportName}?action=STOP").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopOSSHDFSExportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopOSSHDFSExportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopOSSIngestion  StopOSSIngestionRequest
     * @return StopOSSIngestionResponse
     */
    @Override
    public CompletableFuture<StopOSSIngestionResponse> stopOSSIngestion(StopOSSIngestionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopOSSIngestion").setMethod(HttpMethod.PUT).setPathRegex("/ossingestions/{ossIngestionName}?action=STOP").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopOSSIngestionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopOSSIngestionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TagResources").setMethod(HttpMethod.POST).setPathRegex("/tag").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UntagResources").setMethod(HttpMethod.POST).setPathRegex("/untag").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UntagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UntagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateAgentInstanceConfig  UpdateAgentInstanceConfigRequest
     * @return UpdateAgentInstanceConfigResponse
     */
    @Override
    public CompletableFuture<UpdateAgentInstanceConfigResponse> updateAgentInstanceConfig(UpdateAgentInstanceConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateAgentInstanceConfig").setMethod(HttpMethod.PUT).setPathRegex("/agentinstanceconfigs/{configName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAgentInstanceConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAgentInstanceConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateAlert  UpdateAlertRequest
     * @return UpdateAlertResponse
     */
    @Override
    public CompletableFuture<UpdateAlertResponse> updateAlert(UpdateAlertRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateAlert").setMethod(HttpMethod.PUT).setPathRegex("/alerts/{alertName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAlertResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAlertResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateAnnotationDataSet  UpdateAnnotationDataSetRequest
     * @return UpdateAnnotationDataSetResponse
     */
    @Override
    public CompletableFuture<UpdateAnnotationDataSetResponse> updateAnnotationDataSet(UpdateAnnotationDataSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateAnnotationDataSet").setMethod(HttpMethod.PUT).setPathRegex("/ml/annotationdataset/{datasetId}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAnnotationDataSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAnnotationDataSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can update only the names of the tags in a tag set.</p>
     * 
     * @param request the request parameters of UpdateAnnotationLabel  UpdateAnnotationLabelRequest
     * @return UpdateAnnotationLabelResponse
     */
    @Override
    public CompletableFuture<UpdateAnnotationLabelResponse> updateAnnotationLabel(UpdateAnnotationLabelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateAnnotationLabel").setMethod(HttpMethod.PUT).setPathRegex("/ml/annotationlabel").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAnnotationLabelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAnnotationLabelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<UpdateConfigResponse> updateConfig(UpdateConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateConfig").setMethod(HttpMethod.PUT).setPathRegex("/configs/{configName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<UpdateConsumerGroupResponse> updateConsumerGroup(UpdateConsumerGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateConsumerGroup").setMethod(HttpMethod.PUT).setPathRegex("/logstores/{logstore}/consumergroups/{consumerGroup}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateConsumerGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateConsumerGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of UpdateDashboard  UpdateDashboardRequest
     * @return UpdateDashboardResponse
     */
    @Override
    public CompletableFuture<UpdateDashboardResponse> updateDashboard(UpdateDashboardRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateDashboard").setMethod(HttpMethod.PUT).setPathRegex("/dashboards/{dashboardName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDashboardResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDashboardResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateETL  UpdateETLRequest
     * @return UpdateETLResponse
     */
    @Override
    public CompletableFuture<UpdateETLResponse> updateETL(UpdateETLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateETL").setMethod(HttpMethod.PUT).setPathRegex("/etls/{etlName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateETLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateETLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>Host consists of a project name and a Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of UpdateIndex  UpdateIndexRequest
     * @return UpdateIndexResponse
     */
    @Override
    public CompletableFuture<UpdateIndexResponse> updateIndex(UpdateIndexRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateIndex").setMethod(HttpMethod.PUT).setPathRegex("/logstores/{logstore}/index").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateIndexResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateIndexResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<UpdateLogStoreResponse> updateLogStore(UpdateLogStoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateLogStore").setMethod(HttpMethod.PUT).setPathRegex("/logstores/{logstore}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLogStoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLogStoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<UpdateLogStoreEncryptionResponse> updateLogStoreEncryption(UpdateLogStoreEncryptionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateLogStoreEncryption").setMethod(HttpMethod.PUT).setPathRegex("/logstores/{logstore}/encryption").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLogStoreEncryptionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLogStoreEncryptionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateLogStoreMeteringMode  UpdateLogStoreMeteringModeRequest
     * @return UpdateLogStoreMeteringModeResponse
     */
    @Override
    public CompletableFuture<UpdateLogStoreMeteringModeResponse> updateLogStoreMeteringMode(UpdateLogStoreMeteringModeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateLogStoreMeteringMode").setMethod(HttpMethod.PUT).setPathRegex("/logstores/{logstore}/meteringmode").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLogStoreMeteringModeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLogStoreMeteringModeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of UpdateLogging  UpdateLoggingRequest
     * @return UpdateLoggingResponse
     */
    @Override
    public CompletableFuture<UpdateLoggingResponse> updateLogging(UpdateLoggingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateLogging").setMethod(HttpMethod.PUT).setPathRegex("/logging").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLoggingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLoggingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The UK (London) region is supported. Supported regions are constantly updated.</p>
     * 
     * @param request the request parameters of UpdateLogtailPipelineConfig  UpdateLogtailPipelineConfigRequest
     * @return UpdateLogtailPipelineConfigResponse
     */
    @Override
    public CompletableFuture<UpdateLogtailPipelineConfigResponse> updateLogtailPipelineConfig(UpdateLogtailPipelineConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateLogtailPipelineConfig").setMethod(HttpMethod.PUT).setPathRegex("/pipelineconfigs/{configName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLogtailPipelineConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLogtailPipelineConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of UpdateMachineGroup  UpdateMachineGroupRequest
     * @return UpdateMachineGroupResponse
     */
    @Override
    public CompletableFuture<UpdateMachineGroupResponse> updateMachineGroup(UpdateMachineGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateMachineGroup").setMethod(HttpMethod.PUT).setPathRegex("/machinegroups/{groupName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMachineGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMachineGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of UpdateMachineGroupMachine  UpdateMachineGroupMachineRequest
     * @return UpdateMachineGroupMachineResponse
     */
    @Override
    public CompletableFuture<UpdateMachineGroupMachineResponse> updateMachineGroupMachine(UpdateMachineGroupMachineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateMachineGroupMachine").setMethod(HttpMethod.PUT).setPathRegex("/machinegroups/{machineGroup}/machines").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMachineGroupMachineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMachineGroupMachineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<UpdateMetricStoreResponse> updateMetricStore(UpdateMetricStoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateMetricStore").setMethod(HttpMethod.PUT).setPathRegex("/metricstores/{name}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMetricStoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMetricStoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateMetricStoreMeteringMode  UpdateMetricStoreMeteringModeRequest
     * @return UpdateMetricStoreMeteringModeResponse
     */
    @Override
    public CompletableFuture<UpdateMetricStoreMeteringModeResponse> updateMetricStoreMeteringMode(UpdateMetricStoreMeteringModeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateMetricStoreMeteringMode").setMethod(HttpMethod.PUT).setPathRegex("/metricstores/{metricStore}/meteringmode").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMetricStoreMeteringModeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMetricStoreMeteringModeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateOSSExport  UpdateOSSExportRequest
     * @return UpdateOSSExportResponse
     */
    @Override
    public CompletableFuture<UpdateOSSExportResponse> updateOSSExport(UpdateOSSExportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateOSSExport").setMethod(HttpMethod.PUT).setPathRegex("/ossexports/{ossExportName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateOSSExportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateOSSExportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateOSSHDFSExport  UpdateOSSHDFSExportRequest
     * @return UpdateOSSHDFSExportResponse
     */
    @Override
    public CompletableFuture<UpdateOSSHDFSExportResponse> updateOSSHDFSExport(UpdateOSSHDFSExportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateOSSHDFSExport").setMethod(HttpMethod.PUT).setPathRegex("/osshdfsexports/{ossExportName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateOSSHDFSExportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateOSSHDFSExportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateOSSIngestion  UpdateOSSIngestionRequest
     * @return UpdateOSSIngestionResponse
     */
    @Override
    public CompletableFuture<UpdateOSSIngestionResponse> updateOSSIngestion(UpdateOSSIngestionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateOSSIngestion").setMethod(HttpMethod.PUT).setPathRegex("/ossingestions/{ossIngestionName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateOSSIngestionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateOSSIngestionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of UpdateOssExternalStore  UpdateOssExternalStoreRequest
     * @return UpdateOssExternalStoreResponse
     */
    @Override
    public CompletableFuture<UpdateOssExternalStoreResponse> updateOssExternalStore(UpdateOssExternalStoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateOssExternalStore").setMethod(HttpMethod.PUT).setPathRegex("/externalstores/{externalStoreName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateOssExternalStoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateOssExternalStoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<UpdateProjectResponse> updateProject(UpdateProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateProject").setMethod(HttpMethod.PUT).setPathRegex("/").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Log Service endpoint. You must specify a project in Host.</p>
     * 
     * @param request the request parameters of UpdateRdsExternalStore  UpdateRdsExternalStoreRequest
     * @return UpdateRdsExternalStoreResponse
     */
    @Override
    public CompletableFuture<UpdateRdsExternalStoreResponse> updateRdsExternalStore(UpdateRdsExternalStoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateRdsExternalStore").setMethod(HttpMethod.PUT).setPathRegex("/externalstores/{externalStoreName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateRdsExternalStoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateRdsExternalStoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<UpdateSavedSearchResponse> updateSavedSearch(UpdateSavedSearchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateSavedSearch").setMethod(HttpMethod.PUT).setPathRegex("/savedsearches/{savedsearchName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSavedSearchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSavedSearchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateScheduledSQL  UpdateScheduledSQLRequest
     * @return UpdateScheduledSQLResponse
     */
    @Override
    public CompletableFuture<UpdateScheduledSQLResponse> updateScheduledSQL(UpdateScheduledSQLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateScheduledSQL").setMethod(HttpMethod.PUT).setPathRegex("/scheduledsqls/{scheduledSQLName}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateScheduledSQLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateScheduledSQLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateSqlInstance  UpdateSqlInstanceRequest
     * @return UpdateSqlInstanceResponse
     */
    @Override
    public CompletableFuture<UpdateSqlInstanceResponse> updateSqlInstance(UpdateSqlInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateSqlInstance").setMethod(HttpMethod.PUT).setPathRegex("/sqlinstance").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSqlInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSqlInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateStoreView  UpdateStoreViewRequest
     * @return UpdateStoreViewResponse
     */
    @Override
    public CompletableFuture<UpdateStoreViewResponse> updateStoreView(UpdateStoreViewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateStoreView").setMethod(HttpMethod.PUT).setPathRegex("/storeviews/{name}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateStoreViewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateStoreViewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpsertCollectionPolicy  UpsertCollectionPolicyRequest
     * @return UpsertCollectionPolicyResponse
     */
    @Override
    public CompletableFuture<UpsertCollectionPolicyResponse> upsertCollectionPolicy(UpsertCollectionPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpsertCollectionPolicy").setMethod(HttpMethod.POST).setPathRegex("/collectionpolicy").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpsertCollectionPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpsertCollectionPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
