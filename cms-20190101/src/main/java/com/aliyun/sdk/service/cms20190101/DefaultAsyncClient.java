// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.cms20190101.models.*;
import darabonba.core.utils.*;
import com.aliyun.sdk.gateway.pop.*;
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
        this.product = "Cms";
        this.version = "2019-01-01";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-beijing", "metrics.cn-beijing.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-jva", "metrics.cn-zhengzhou-jva.aliyuncs.com"),
            new TeaPair("cn-heyuan", "metrics.cn-heyuan.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "metrics.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("ap-northeast-2", "metrics.ap-northeast-2.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "metrics.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "metrics.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "metrics.ap-southeast-3.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "metrics.ap-southeast-5.aliyuncs.com"),
            new TeaPair("ap-southeast-6", "metrics.ap-southeast-6.aliyuncs.com"),
            new TeaPair("ap-southeast-7", "metrics.ap-southeast-7.aliyuncs.com"),
            new TeaPair("ap-southeast-8", "metrics.ap-southeast-8.aliyuncs.com"),
            new TeaPair("cn-zhongwei", "metrics.cn-zhongwei.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "metrics.cn-wulanchabu.aliyuncs.com"),
            new TeaPair("cn-qingdao", "metrics.cn-qingdao.aliyuncs.com"),
            new TeaPair("cn-wuhan-lr", "metrics.cn-wuhan-lr.aliyuncs.com"),
            new TeaPair("cn-shanghai", "metrics.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-hongkong", "metrics.cn-hongkong.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "metrics.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-chengdu", "metrics.cn-chengdu.aliyuncs.com"),
            new TeaPair("cn-guangzhou", "metrics.cn-guangzhou.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "metrics.cn-huhehaote.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "metrics.cn-hangzhou.aliyuncs.com"),
            new TeaPair("us-southeast-1", "metrics.us-southeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "metrics.eu-west-1.aliyuncs.com"),
            new TeaPair("eu-west-2", "metrics.eu-west-2.aliyuncs.com"),
            new TeaPair("eu-central-1", "metrics.eu-central-1.aliyuncs.com"),
            new TeaPair("us-east-1", "metrics.us-east-1.aliyuncs.com"),
            new TeaPair("us-west-1", "metrics.us-west-1.aliyuncs.com"),
            new TeaPair("na-south-1", "metrics.na-south-1.aliyuncs.com"),
            new TeaPair("me-east-1", "metrics.me-east-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "metrics.ap-south-1.aliyuncs.com"),
            new TeaPair("me-central-1", "metrics.me-central-1.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "metrics.cn-hangzhou-finance.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "metrics.cn-shenzhen-finance-1.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "metrics.cn-beijing-finance-1.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "metrics.cn-shanghai-finance-1.aliyuncs.com"),
            new TeaPair("cn-wulanchabu-gic-1", "metrics.cn-wulanchabu-gic-1.aliyuncs.com"),
            new TeaPair("cn-heyuan-acdr-1", "metrics.cn-heyuan-acdr-1.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "metrics.cn-north-2-gov-1.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to attach a tag to the application group <code>7301****</code>. In this example, the tag key is <code>key1</code> and the tag value is <code>value1</code>.</p>
     * 
     * @param request the request parameters of AddTags  AddTagsRequest
     * @return AddTagsResponse
     */
    @Override
    public CompletableFuture<AddTagsResponse> addTags(AddTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddTags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example of applying the alert template <code>700****</code> to the application group <code>123456</code>. The generated alert rule has the ID <code>applyTemplate8ab74c6b-9f27-47ab-8841-de01dc08****</code> and the name <code>test123</code>.</p>
     * 
     * @param request the request parameters of ApplyMetricRuleTemplate  ApplyMetricRuleTemplateRequest
     * @return ApplyMetricRuleTemplateResponse
     */
    @Override
    public CompletableFuture<ApplyMetricRuleTemplateResponse> applyMetricRuleTemplate(ApplyMetricRuleTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ApplyMetricRuleTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApplyMetricRuleTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApplyMetricRuleTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example of creating a site monitoring task named <code>HangZhou_ECS1</code>. The monitored address of the task is <code>https://www.aliyun.com</code>, and the monitoring type is <code>HTTP</code>. The response shows that the site monitoring task is created. The name of the task is <code>HangZhou_ECS1</code>, and the ID is <code>679fbe4f-b80b-4706-91b2-5427b43e****</code>.</p>
     * 
     * @param request the request parameters of BatchCreateInstantSiteMonitor  BatchCreateInstantSiteMonitorRequest
     * @return BatchCreateInstantSiteMonitorResponse
     */
    @Override
    public CompletableFuture<BatchCreateInstantSiteMonitorResponse> batchCreateInstantSiteMonitor(BatchCreateInstantSiteMonitorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchCreateInstantSiteMonitor").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchCreateInstantSiteMonitorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchCreateInstantSiteMonitorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Before you begin</h3>
     * <p>Make sure that you have called the <a href="https://help.aliyun.com/document_detail/2330730.html">Cursor</a> operation to obtain the initial Cursor.</p>
     * <h3>Usage notes</h3>
     * <p>This topic provides an example to export the monitoring data of the <code>cpu_idle</code> metric for the <code>acs_ecs_dashboard</code> cloud service by using an initial Cursor. A maximum of 1,000 data records are returned each time.</p>
     * 
     * @param request the request parameters of BatchExport  BatchExportRequest
     * @return BatchExportResponse
     */
    @Override
    public CompletableFuture<BatchExportResponse> batchExport(BatchExportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchExport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchExportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchExportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The Alibaba Cloud services supported by this operation include cloud servers (ECS), ApsaraDB RDS, and Server Load Balancer (SLB).
     * This topic provides an example on how to automatically create an application group for resources that are attached with the tag key <code>ecs_instance</code>. The alert contact group of the application group is <code>ECS_Group</code>.</p>
     * 
     * @param request the request parameters of CreateDynamicTagGroup  CreateDynamicTagGroupRequest
     * @return CreateDynamicTagGroupResponse
     */
    @Override
    public CompletableFuture<CreateDynamicTagGroupResponse> createDynamicTagGroup(CreateDynamicTagGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDynamicTagGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDynamicTagGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDynamicTagGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create an alert rule for the monitoring metric <code>cpu_total</code> of Elastic Computing Service (ECS) in the application group <code>123456</code>. The alert rule ID is <code>456789</code>, the alert rule name is <code>ECS_Rule1</code>, the alert severity is <code>Critical</code>, the statistical method is <code>Average</code>, the comparison operator is <code>GreaterThanOrEqualToThreshold</code>, the threshold is <code>90</code>, and the retry count is <code>3</code>. The response shows that the alert rule <code>ECS_Rule1</code> is created.</p>
     * 
     * @param request the request parameters of CreateGroupMetricRules  CreateGroupMetricRulesRequest
     * @return CreateGroupMetricRulesResponse
     */
    @Override
    public CompletableFuture<CreateGroupMetricRulesResponse> createGroupMetricRules(CreateGroupMetricRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateGroupMetricRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateGroupMetricRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateGroupMetricRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateGroupMonitoringAgentProcess  CreateGroupMonitoringAgentProcessRequest
     * @return CreateGroupMonitoringAgentProcessResponse
     */
    @Override
    public CompletableFuture<CreateGroupMonitoringAgentProcessResponse> createGroupMonitoringAgentProcess(CreateGroupMonitoringAgentProcessRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateGroupMonitoringAgentProcess").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateGroupMonitoringAgentProcessResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateGroupMonitoringAgentProcessResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create an availability monitoring task named <code>task1</code> with the detection type set to <code>HTTP</code> in application group <code>123456</code>. Alert notifications are sent by email and DingTalk chatbot.</p>
     * 
     * @param request the request parameters of CreateHostAvailability  CreateHostAvailabilityRequest
     * @return CreateHostAvailabilityResponse
     */
    @Override
    public CompletableFuture<CreateHostAvailabilityResponse> createHostAvailability(CreateHostAvailabilityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateHostAvailability").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateHostAvailabilityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateHostAvailabilityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Before you begin</h2>
     * <p>Make sure that you have activated Hybrid Cloud Monitoring. For more information, see <a href="https://help.aliyun.com/document_detail/250773.html">Activate Hybrid Cloud Monitoring</a>.</p>
     * <h2>Operation description</h2>
     * <p>This topic provides an example on how to create a metric repository named <code>aliyun</code> with a data storage duration of <code>cms.s1.3xlarge</code>. The response indicates that the metric repository is created.</p>
     * 
     * @param request the request parameters of CreateHybridMonitorNamespace  CreateHybridMonitorNamespaceRequest
     * @return CreateHybridMonitorNamespaceResponse
     */
    @Override
    public CompletableFuture<CreateHybridMonitorNamespaceResponse> createHybridMonitorNamespace(CreateHybridMonitorNamespaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateHybridMonitorNamespace").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateHybridMonitorNamespaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateHybridMonitorNamespaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Before you begin</h3>
     * <p>Make sure that you have activated Simple Log Service (SLS) and created a project and a Logstore. For more information, see <a href="https://help.aliyun.com/document_detail/54604.html">Quick Start</a>.</p>
     * <h3>Operation description</h3>
     * <p>This topic provides an example on how to create a Logstore group named <code>Logstore_test</code>. The region is <code>ap-southeast-1</code>, the project is <code>aliyun-project</code>, and the Logstore is <code>Logstore-ECS</code>. The response shows that the Logstore group is created.</p>
     * 
     * @param request the request parameters of CreateHybridMonitorSLSGroup  CreateHybridMonitorSLSGroupRequest
     * @return CreateHybridMonitorSLSGroupResponse
     */
    @Override
    public CompletableFuture<CreateHybridMonitorSLSGroupResponse> createHybridMonitorSLSGroup(CreateHybridMonitorSLSGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateHybridMonitorSLSGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateHybridMonitorSLSGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateHybridMonitorSLSGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>Before calling this operation, make sure that Hybrid Cloud Monitoring is activated.</li>
     * <li>To create a metric for SLS logs, make sure that SLS is activated and that you have created a project and a Logstore.</li>
     * <li>Depending on the value of <code>TaskType</code>, some parameters are required. For example, when <code>TaskType</code> is set to <code>aliyun_fc</code>, you must set <code>YARMConfig</code>. When <code>TaskType</code> is set to <code>aliyun_sls</code>, you must configure parameters such as <code>CollectInterval</code>.</li>
     * <li>For cross-account operations, specify <code>TargetUserId</code> or <code>TargetUserIdList</code> to import resources of other members into Hybrid Cloud Monitoring.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateHybridMonitorTask  CreateHybridMonitorTaskRequest
     * @return CreateHybridMonitorTaskResponse
     */
    @Override
    public CompletableFuture<CreateHybridMonitorTaskResponse> createHybridMonitorTask(CreateHybridMonitorTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateHybridMonitorTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateHybridMonitorTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateHybridMonitorTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only Alibaba Cloud accounts that have activated Network Analysis and Monitoring can create one-time synthetic monitoring tasks.
     * This topic provides an example of how to create a one-time synthetic monitoring task. The task name is <code>task1</code>, the monitored address is <code>http://www.aliyun.com</code>, the task type is <code>HTTP</code>, and the number of detection points is <code>1</code>.</p>
     * 
     * @param request the request parameters of CreateInstantSiteMonitor  CreateInstantSiteMonitorRequest
     * @return CreateInstantSiteMonitorResponse
     */
    @Override
    public CompletableFuture<CreateInstantSiteMonitorResponse> createInstantSiteMonitor(CreateInstantSiteMonitorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateInstantSiteMonitor").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateInstantSiteMonitorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateInstantSiteMonitorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Background information</h3>
     * <ul>
     * <li>CloudMonitor blocks alert notifications based on the blacklist policies that take effect. To block alert notifications when the value of a metric that belongs to a cloud service reaches the threshold that you specified, add the metric to a blacklist policy.</li>
     * <li>CloudMonitor allows you to create blacklist policies only based on threshold metrics. You cannot create blacklist policies based on system events. For more information about the cloud services and the thresholds of the metrics that are supported by CloudMonitor, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateMetricRuleBlackList  CreateMetricRuleBlackListRequest
     * @return CreateMetricRuleBlackListResponse
     */
    @Override
    public CompletableFuture<CreateMetricRuleBlackListResponse> createMetricRuleBlackList(CreateMetricRuleBlackListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateMetricRuleBlackList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMetricRuleBlackListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMetricRuleBlackListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMetricRuleResources  CreateMetricRuleResourcesRequest
     * @return CreateMetricRuleResourcesResponse
     */
    @Override
    public CompletableFuture<CreateMetricRuleResourcesResponse> createMetricRuleResources(CreateMetricRuleResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateMetricRuleResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMetricRuleResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMetricRuleResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMetricRuleTemplate  CreateMetricRuleTemplateRequest
     * @return CreateMetricRuleTemplateResponse
     */
    @Override
    public CompletableFuture<CreateMetricRuleTemplateResponse> createMetricRuleTemplate(CreateMetricRuleTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateMetricRuleTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMetricRuleTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMetricRuleTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMonitorAgentProcess  CreateMonitorAgentProcessRequest
     * @return CreateMonitorAgentProcessResponse
     */
    @Override
    public CompletableFuture<CreateMonitorAgentProcessResponse> createMonitorAgentProcess(CreateMonitorAgentProcessRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateMonitorAgentProcess").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMonitorAgentProcessResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMonitorAgentProcessResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example of creating an application group named <code>ECS_Group</code>.</p>
     * 
     * @param request the request parameters of CreateMonitorGroup  CreateMonitorGroupRequest
     * @return CreateMonitorGroupResponse
     */
    @Override
    public CompletableFuture<CreateMonitorGroupResponse> createMonitorGroup(CreateMonitorGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateMonitorGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMonitorGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMonitorGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create an application group by using the resource group <code>CloudMonitor</code> and the alert contact group <code>ECS_Group</code>. The region ID of the resource group is <code>cn-hangzhou</code>.</p>
     * 
     * @param request the request parameters of CreateMonitorGroupByResourceGroupId  CreateMonitorGroupByResourceGroupIdRequest
     * @return CreateMonitorGroupByResourceGroupIdResponse
     */
    @Override
    public CompletableFuture<CreateMonitorGroupByResourceGroupIdResponse> createMonitorGroupByResourceGroupId(CreateMonitorGroupByResourceGroupIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateMonitorGroupByResourceGroupId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMonitorGroupByResourceGroupIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMonitorGroupByResourceGroupIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can add a maximum of 1,000 instances to an application group at a time. You can add a maximum of 3,000 instances of an Alibaba Cloud service to an application group. The total number of instances that you can add to an application group is unlimited.
     * In this example, an Elastic Compute Service (ECS) instance in the <code>China (Hangzhou)</code> region is added to the <code>3607****</code> application group. The instance ID is <code>i-2ze26xj5wwy12****</code> and the instance name is <code>test-instance-ecs</code>.</p>
     * 
     * @param request the request parameters of CreateMonitorGroupInstances  CreateMonitorGroupInstancesRequest
     * @return CreateMonitorGroupInstancesResponse
     */
    @Override
    public CompletableFuture<CreateMonitorGroupInstancesResponse> createMonitorGroupInstances(CreateMonitorGroupInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateMonitorGroupInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMonitorGroupInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMonitorGroupInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Creates a pause alert notification policy for a specified application group. After the policy is created, alert notifications for the application group are paused during the time period specified by StartTime and EndTime (unit: milliseconds). Currently, PolicyType supports only PauseNotify (pause notification).</p>
     * 
     * @param request the request parameters of CreateMonitorGroupNotifyPolicy  CreateMonitorGroupNotifyPolicyRequest
     * @return CreateMonitorGroupNotifyPolicyResponse
     */
    @Override
    public CompletableFuture<CreateMonitorGroupNotifyPolicyResponse> createMonitorGroupNotifyPolicy(CreateMonitorGroupNotifyPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateMonitorGroupNotifyPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMonitorGroupNotifyPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMonitorGroupNotifyPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMonitoringAgentProcess  CreateMonitoringAgentProcessRequest
     * @return CreateMonitoringAgentProcessResponse
     */
    @Override
    public CompletableFuture<CreateMonitoringAgentProcessResponse> createMonitoringAgentProcess(CreateMonitoringAgentProcessRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateMonitoringAgentProcess").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMonitoringAgentProcessResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMonitoringAgentProcessResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic describes how to create a site monitoring task. The example creates a task named <code>HanZhou_ECS1</code> to monitor the URL <code>https://www.aliyun.com</code> over <code>HTTPS</code>.</p>
     * 
     * @param request the request parameters of CreateSiteMonitor  CreateSiteMonitorRequest
     * @return CreateSiteMonitorResponse
     */
    @Override
    public CompletableFuture<CreateSiteMonitorResponse> createSiteMonitor(CreateSiteMonitorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSiteMonitor").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSiteMonitorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSiteMonitorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Before you begin</h3>
     * <p>Make sure that Hybrid Cloud Monitoring is activated. For more information, see <a href="https://help.aliyun.com/document_detail/250773.html">Activate Hybrid Cloud Monitoring</a>.</p>
     * <h3>Background information</h3>
     * <p>Call this operation to obtain an initial cursor, and then call the <a href="https://help.aliyun.com/document_detail/2329847.html">BatchExport</a> operation to export monitoring data.</p>
     * <h3>Usage notes</h3>
     * <p>This topic provides an example to define the data export scope for the <code>cpu_idle</code> metric of the <code>acs_ecs_dashboard</code> cloud service at a 60-second interval from <code>1641627000000</code> (2022-01-08 15:30:00) to <code>1641645000000</code> (2022-01-08 20:30:00). The response displays the Cursor information.</p>
     * 
     * @param request the request parameters of Cursor  CursorRequest
     * @return CursorResponse
     */
    @Override
    public CompletableFuture<CursorResponse> cursor(CursorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("Cursor").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CursorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CursorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteContact  DeleteContactRequest
     * @return DeleteContactResponse
     */
    @Override
    public CompletableFuture<DeleteContactResponse> deleteContact(DeleteContactRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteContact").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteContactResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteContactResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteContactGroup  DeleteContactGroupRequest
     * @return DeleteContactGroupResponse
     */
    @Override
    public CompletableFuture<DeleteContactGroupResponse> deleteContactGroup(DeleteContactGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteContactGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteContactGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteContactGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteCustomMetric  DeleteCustomMetricRequest
     * @return DeleteCustomMetricResponse
     */
    @Override
    public CompletableFuture<DeleteCustomMetricResponse> deleteCustomMetric(DeleteCustomMetricRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCustomMetric").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCustomMetricResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCustomMetricResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDynamicTagGroup  DeleteDynamicTagGroupRequest
     * @return DeleteDynamicTagGroupResponse
     */
    @Override
    public CompletableFuture<DeleteDynamicTagGroupResponse> deleteDynamicTagGroup(DeleteDynamicTagGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDynamicTagGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDynamicTagGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDynamicTagGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteEventRuleTargets  DeleteEventRuleTargetsRequest
     * @return DeleteEventRuleTargetsResponse
     */
    @Override
    public CompletableFuture<DeleteEventRuleTargetsResponse> deleteEventRuleTargets(DeleteEventRuleTargetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteEventRuleTargets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteEventRuleTargetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteEventRuleTargetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteEventRules  DeleteEventRulesRequest
     * @return DeleteEventRulesResponse
     */
    @Override
    public CompletableFuture<DeleteEventRulesResponse> deleteEventRules(DeleteEventRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteEventRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteEventRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteEventRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteExporterOutput  DeleteExporterOutputRequest
     * @return DeleteExporterOutputResponse
     */
    @Override
    public CompletableFuture<DeleteExporterOutputResponse> deleteExporterOutput(DeleteExporterOutputRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteExporterOutput").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteExporterOutputResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteExporterOutputResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteExporterRule  DeleteExporterRuleRequest
     * @return DeleteExporterRuleResponse
     */
    @Override
    public CompletableFuture<DeleteExporterRuleResponse> deleteExporterRule(DeleteExporterRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteExporterRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteExporterRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteExporterRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteGroupMonitoringAgentProcess  DeleteGroupMonitoringAgentProcessRequest
     * @return DeleteGroupMonitoringAgentProcessResponse
     */
    @Override
    public CompletableFuture<DeleteGroupMonitoringAgentProcessResponse> deleteGroupMonitoringAgentProcess(DeleteGroupMonitoringAgentProcessRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteGroupMonitoringAgentProcess").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteGroupMonitoringAgentProcessResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteGroupMonitoringAgentProcessResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteHostAvailability  DeleteHostAvailabilityRequest
     * @return DeleteHostAvailabilityResponse
     */
    @Override
    public CompletableFuture<DeleteHostAvailabilityResponse> deleteHostAvailability(DeleteHostAvailabilityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteHostAvailability").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteHostAvailabilityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteHostAvailabilityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>If a metric import task is created for metrics in a namespace, you cannot delete the namespace unless you delete the task first.
     * This topic provides an example on how to delete a namespace named <code>aliyun</code>. The response shows that the namespace is deleted.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteHybridMonitorNamespace  DeleteHybridMonitorNamespaceRequest
     * @return DeleteHybridMonitorNamespaceResponse
     */
    @Override
    public CompletableFuture<DeleteHybridMonitorNamespaceResponse> deleteHybridMonitorNamespace(DeleteHybridMonitorNamespaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteHybridMonitorNamespace").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteHybridMonitorNamespaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteHybridMonitorNamespaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to delete a Logstore group named <code>Logstore_test</code>. The response shows that the Logstore group is deleted.</p>
     * 
     * @param request the request parameters of DeleteHybridMonitorSLSGroup  DeleteHybridMonitorSLSGroupRequest
     * @return DeleteHybridMonitorSLSGroupResponse
     */
    @Override
    public CompletableFuture<DeleteHybridMonitorSLSGroupResponse> deleteHybridMonitorSLSGroup(DeleteHybridMonitorSLSGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteHybridMonitorSLSGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteHybridMonitorSLSGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteHybridMonitorSLSGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to delete a metric import task whose ID is <code>36****</code>. The returned result indicates that the metric import task is deleted.</p>
     * 
     * @param request the request parameters of DeleteHybridMonitorTask  DeleteHybridMonitorTaskRequest
     * @return DeleteHybridMonitorTaskResponse
     */
    @Override
    public CompletableFuture<DeleteHybridMonitorTaskResponse> deleteHybridMonitorTask(DeleteHybridMonitorTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteHybridMonitorTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteHybridMonitorTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteHybridMonitorTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteLogMonitor  DeleteLogMonitorRequest
     * @return DeleteLogMonitorResponse
     */
    @Override
    public CompletableFuture<DeleteLogMonitorResponse> deleteLogMonitor(DeleteLogMonitorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLogMonitor").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLogMonitorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLogMonitorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMetricRuleBlackList  DeleteMetricRuleBlackListRequest
     * @return DeleteMetricRuleBlackListResponse
     */
    @Override
    public CompletableFuture<DeleteMetricRuleBlackListResponse> deleteMetricRuleBlackList(DeleteMetricRuleBlackListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMetricRuleBlackList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMetricRuleBlackListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMetricRuleBlackListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMetricRuleResources  DeleteMetricRuleResourcesRequest
     * @return DeleteMetricRuleResourcesResponse
     */
    @Override
    public CompletableFuture<DeleteMetricRuleResourcesResponse> deleteMetricRuleResources(DeleteMetricRuleResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMetricRuleResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMetricRuleResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMetricRuleResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMetricRuleTargets  DeleteMetricRuleTargetsRequest
     * @return DeleteMetricRuleTargetsResponse
     */
    @Override
    public CompletableFuture<DeleteMetricRuleTargetsResponse> deleteMetricRuleTargets(DeleteMetricRuleTargetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMetricRuleTargets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMetricRuleTargetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMetricRuleTargetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMetricRuleTemplate  DeleteMetricRuleTemplateRequest
     * @return DeleteMetricRuleTemplateResponse
     */
    @Override
    public CompletableFuture<DeleteMetricRuleTemplateResponse> deleteMetricRuleTemplate(DeleteMetricRuleTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMetricRuleTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMetricRuleTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMetricRuleTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMetricRules  DeleteMetricRulesRequest
     * @return DeleteMetricRulesResponse
     */
    @Override
    public CompletableFuture<DeleteMetricRulesResponse> deleteMetricRules(DeleteMetricRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMetricRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMetricRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMetricRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMonitorGroup  DeleteMonitorGroupRequest
     * @return DeleteMonitorGroupResponse
     */
    @Override
    public CompletableFuture<DeleteMonitorGroupResponse> deleteMonitorGroup(DeleteMonitorGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMonitorGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMonitorGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMonitorGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMonitorGroupDynamicRule  DeleteMonitorGroupDynamicRuleRequest
     * @return DeleteMonitorGroupDynamicRuleResponse
     */
    @Override
    public CompletableFuture<DeleteMonitorGroupDynamicRuleResponse> deleteMonitorGroupDynamicRule(DeleteMonitorGroupDynamicRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMonitorGroupDynamicRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMonitorGroupDynamicRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMonitorGroupDynamicRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMonitorGroupInstances  DeleteMonitorGroupInstancesRequest
     * @return DeleteMonitorGroupInstancesResponse
     */
    @Override
    public CompletableFuture<DeleteMonitorGroupInstancesResponse> deleteMonitorGroupInstances(DeleteMonitorGroupInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMonitorGroupInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMonitorGroupInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMonitorGroupInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMonitorGroupNotifyPolicy  DeleteMonitorGroupNotifyPolicyRequest
     * @return DeleteMonitorGroupNotifyPolicyResponse
     */
    @Override
    public CompletableFuture<DeleteMonitorGroupNotifyPolicyResponse> deleteMonitorGroupNotifyPolicy(DeleteMonitorGroupNotifyPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMonitorGroupNotifyPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMonitorGroupNotifyPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMonitorGroupNotifyPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMonitoringAgentProcess  DeleteMonitoringAgentProcessRequest
     * @return DeleteMonitoringAgentProcessResponse
     */
    @Override
    public CompletableFuture<DeleteMonitoringAgentProcessResponse> deleteMonitoringAgentProcess(DeleteMonitoringAgentProcessRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMonitoringAgentProcess").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMonitoringAgentProcessResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMonitoringAgentProcessResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSiteMonitors  DeleteSiteMonitorsRequest
     * @return DeleteSiteMonitorsResponse
     */
    @Override
    public CompletableFuture<DeleteSiteMonitorsResponse> deleteSiteMonitors(DeleteSiteMonitorsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSiteMonitors").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSiteMonitorsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSiteMonitorsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeActiveMetricRuleList  DescribeActiveMetricRuleListRequest
     * @return DescribeActiveMetricRuleListResponse
     */
    @Override
    public CompletableFuture<DescribeActiveMetricRuleListResponse> describeActiveMetricRuleList(DescribeActiveMetricRuleListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeActiveMetricRuleList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeActiveMetricRuleListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeActiveMetricRuleListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DescribeAlertHistoryList is deprecated, please use Cms::2019-01-01::DescribeAlertLogList instead.  * @description This API operation is no longer maintained. We recommend that you call the [DescribeAlertLogList](https://help.aliyun.com/document_detail/201087.html) operation.
     * 
     * @param request the request parameters of DescribeAlertHistoryList  DescribeAlertHistoryListRequest
     * @return DescribeAlertHistoryListResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<DescribeAlertHistoryListResponse> describeAlertHistoryList(DescribeAlertHistoryListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAlertHistoryList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAlertHistoryListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAlertHistoryListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation can query only the alert history within the last year.
     * This topic provides an example on how to query the alert history statistics of Elastic Compute Service (ECS) from the <code>product</code> dimension of Alibaba Cloud services.</p>
     * 
     * @param request the request parameters of DescribeAlertLogCount  DescribeAlertLogCountRequest
     * @return DescribeAlertLogCountResponse
     */
    @Override
    public CompletableFuture<DescribeAlertLogCountResponse> describeAlertLogCount(DescribeAlertLogCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAlertLogCount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAlertLogCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAlertLogCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to query the histogram list of ECS alert history from the Alibaba Cloud service <code>product</code> dimension.</p>
     * 
     * @param request the request parameters of DescribeAlertLogHistogram  DescribeAlertLogHistogramRequest
     * @return DescribeAlertLogHistogramResponse
     */
    @Override
    public CompletableFuture<DescribeAlertLogHistogramResponse> describeAlertLogHistogram(DescribeAlertLogHistogramRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAlertLogHistogram").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAlertLogHistogramResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAlertLogHistogramResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation can query the alert history only within the last year.
     * This topic provides an example to show how to query the alert history of Elastic Compute Service (ECS) from the cloud service <code>product</code> dimension.</p>
     * 
     * @param request the request parameters of DescribeAlertLogList  DescribeAlertLogListRequest
     * @return DescribeAlertLogListResponse
     */
    @Override
    public CompletableFuture<DescribeAlertLogListResponse> describeAlertLogList(DescribeAlertLogListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAlertLogList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAlertLogListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAlertLogListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example to show how to set a threshold-based alert rule for the metric <code>cpu_total</code> of the Elastic Compute Service (ECS) instance <code>i-uf6j91r34rnwawoo****</code> in the <code>acs_ecs_dashboard</code> namespace. The alert contact group is <code>ECS_Group</code>, the alert rule name is <code>test123</code>, the alert rule ID is <code>a151cd6023eacee2f0978e03863cc1697c89508****</code>, the statistical method for the Critical level is <code>Average</code>, the comparison operator for the Critical level is <code>GreaterThanOrEqualToThreshold</code>, the threshold for the Critical level is <code>90</code>, and the retry count for the Critical level is <code>3</code>.</p>
     * <blockquote>
     * <p>On August 15, 2024, Statistics validation was increased. The statistical value must correspond to the Statistics of the metric. For more information about how to obtain the value of this parameter, see <a href="https://www.alibabacloud.com/help/en/cms/support/appendix-1-metrics">Alibaba Cloud service monitoring metrics</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeAlertingMetricRuleResources  DescribeAlertingMetricRuleResourcesRequest
     * @return DescribeAlertingMetricRuleResourcesResponse
     */
    @Override
    public CompletableFuture<DescribeAlertingMetricRuleResourcesResponse> describeAlertingMetricRuleResources(DescribeAlertingMetricRuleResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAlertingMetricRuleResources").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAlertingMetricRuleResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAlertingMetricRuleResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeContactGroupList  DescribeContactGroupListRequest
     * @return DescribeContactGroupListResponse
     */
    @Override
    public CompletableFuture<DescribeContactGroupListResponse> describeContactGroupList(DescribeContactGroupListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeContactGroupList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeContactGroupListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeContactGroupListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeContactList  DescribeContactListRequest
     * @return DescribeContactListResponse
     */
    @Override
    public CompletableFuture<DescribeContactListResponse> describeContactList(DescribeContactListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeContactList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeContactListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeContactListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeContactListByContactGroup  DescribeContactListByContactGroupRequest
     * @return DescribeContactListByContactGroupResponse
     */
    @Override
    public CompletableFuture<DescribeContactListByContactGroupResponse> describeContactListByContactGroup(DescribeContactListByContactGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeContactListByContactGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeContactListByContactGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeContactListByContactGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCustomEventAttribute  DescribeCustomEventAttributeRequest
     * @return DescribeCustomEventAttributeResponse
     */
    @Override
    public CompletableFuture<DescribeCustomEventAttributeResponse> describeCustomEventAttribute(DescribeCustomEventAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCustomEventAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCustomEventAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCustomEventAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation queries the number of times that a custom event occurred for each service.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeCustomEventCount  DescribeCustomEventCountRequest
     * @return DescribeCustomEventCountResponse
     */
    @Override
    public CompletableFuture<DescribeCustomEventCountResponse> describeCustomEventCount(DescribeCustomEventCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCustomEventCount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCustomEventCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCustomEventCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCustomEventHistogram  DescribeCustomEventHistogramRequest
     * @return DescribeCustomEventHistogramResponse
     */
    @Override
    public CompletableFuture<DescribeCustomEventHistogramResponse> describeCustomEventHistogram(DescribeCustomEventHistogramRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCustomEventHistogram").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCustomEventHistogramResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCustomEventHistogramResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call the DescribeMetricList operation to query the metrics of cloud services. For more information, see <a href="https://help.aliyun.com/document_detail/51936.html">DescribeMetricList</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeCustomMetricList  DescribeCustomMetricListRequest
     * @return DescribeCustomMetricListResponse
     */
    @Override
    public CompletableFuture<DescribeCustomMetricListResponse> describeCustomMetricList(DescribeCustomMetricListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCustomMetricList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCustomMetricListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCustomMetricListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to query the rules for the tag key <code>tagkey1</code>. The response shows that two rules are returned. The rule IDs are <code>1536df65-a719-429d-8813-73cc40d7****</code> and <code>56e8cebb-b3d7-4a91-9880-78a8c84f****</code>.</p>
     * 
     * @param request the request parameters of DescribeDynamicTagRuleList  DescribeDynamicTagRuleListRequest
     * @return DescribeDynamicTagRuleListResponse
     */
    @Override
    public CompletableFuture<DescribeDynamicTagRuleListResponse> describeDynamicTagRuleList(DescribeDynamicTagRuleListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDynamicTagRuleList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDynamicTagRuleListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDynamicTagRuleListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the details of the event-triggered alert rule <code>testRule</code>.</p>
     * 
     * @param request the request parameters of DescribeEventRuleAttribute  DescribeEventRuleAttributeRequest
     * @return DescribeEventRuleAttributeResponse
     */
    @Override
    public CompletableFuture<DescribeEventRuleAttributeResponse> describeEventRuleAttribute(DescribeEventRuleAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeEventRuleAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeEventRuleAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeEventRuleAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeEventRuleList  DescribeEventRuleListRequest
     * @return DescribeEventRuleListResponse
     */
    @Override
    public CompletableFuture<DescribeEventRuleListResponse> describeEventRuleList(DescribeEventRuleListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeEventRuleList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeEventRuleListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeEventRuleListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example to query the details of the event-triggered alert rule <code>testRule</code>.</p>
     * 
     * @param request the request parameters of DescribeEventRuleTargetList  DescribeEventRuleTargetListRequest
     * @return DescribeEventRuleTargetListResponse
     */
    @Override
    public CompletableFuture<DescribeEventRuleTargetListResponse> describeEventRuleTargetList(DescribeEventRuleTargetListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeEventRuleTargetList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeEventRuleTargetListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeEventRuleTargetListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeExporterOutputList  DescribeExporterOutputListRequest
     * @return DescribeExporterOutputListResponse
     */
    @Override
    public CompletableFuture<DescribeExporterOutputListResponse> describeExporterOutputList(DescribeExporterOutputListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeExporterOutputList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeExporterOutputListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeExporterOutputListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query all alert rules in the alert rule list of the current Alibaba Cloud account. The response shows that the alert rule list contains only one alert rule. The alert rule is named <code>Rule_01</code> and has an ID of <code>applyTemplate344cfd42-0f32-4fd6-805a-88d7908a****</code>.</p>
     * 
     * @param request the request parameters of DescribeExporterRuleList  DescribeExporterRuleListRequest
     * @return DescribeExporterRuleListResponse
     */
    @Override
    public CompletableFuture<DescribeExporterRuleListResponse> describeExporterRuleList(DescribeExporterRuleListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeExporterRuleList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeExporterRuleListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeExporterRuleListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can create a process monitoring task to monitor all or the specified Elastic Compute Service (ECS) instances in an application group and configure alert rules for the process monitoring task.</p>
     * 
     * @param request the request parameters of DescribeGroupMonitoringAgentProcess  DescribeGroupMonitoringAgentProcessRequest
     * @return DescribeGroupMonitoringAgentProcessResponse
     */
    @Override
    public CompletableFuture<DescribeGroupMonitoringAgentProcessResponse> describeGroupMonitoringAgentProcess(DescribeGroupMonitoringAgentProcessRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeGroupMonitoringAgentProcess").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeGroupMonitoringAgentProcessResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeGroupMonitoringAgentProcessResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the list of availability monitoring tasks for the current account. The response shows that the current account has one availability monitoring task record <code>ecs_instance</code>.</p>
     * 
     * @param request the request parameters of DescribeHostAvailabilityList  DescribeHostAvailabilityListRequest
     * @return DescribeHostAvailabilityListResponse
     */
    @Override
    public CompletableFuture<DescribeHostAvailabilityListResponse> describeHostAvailabilityList(DescribeHostAvailabilityListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHostAvailabilityList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHostAvailabilityListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHostAvailabilityListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Prerequisites</h2>
     * <p>Hybrid Cloud Monitoring is activated. For more information, see <a href="https://help.aliyun.com/document_detail/250773.html">Activate Hybrid Cloud Monitoring</a>.</p>
     * <h2><a href="#"></a>Limits</h2>
     * <p>The size of monitoring data that is returned in each call cannot exceed 1.5 MB. If the returned data reaches the upper limit, the query fails. You must reset the query conditions.</p>
     * <h2><a href="#"></a>Operation description</h2>
     * <p>This topic provides an example to show how to query the monitoring data of the <code>AliyunEcs_cpu_total</code> metric in the <code>default-aliyun</code> namespace from <code>1653804865</code> (14:14:25 on May 29, 2022) to <code>1653805225</code> (14:20:25 on May 29, 2022).</p>
     * 
     * @param request the request parameters of DescribeHybridMonitorDataList  DescribeHybridMonitorDataListRequest
     * @return DescribeHybridMonitorDataListResponse
     */
    @Override
    public CompletableFuture<DescribeHybridMonitorDataListResponse> describeHybridMonitorDataList(DescribeHybridMonitorDataListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHybridMonitorDataList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHybridMonitorDataListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHybridMonitorDataListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This example shows how to query all namespaces that belong to the current account. The response indicates that only one namespace, <code>aliyun-test</code>, exists.</p>
     * 
     * @param request the request parameters of DescribeHybridMonitorNamespaceList  DescribeHybridMonitorNamespaceListRequest
     * @return DescribeHybridMonitorNamespaceListResponse
     */
    @Override
    public CompletableFuture<DescribeHybridMonitorNamespaceListResponse> describeHybridMonitorNamespaceList(DescribeHybridMonitorNamespaceListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHybridMonitorNamespaceList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHybridMonitorNamespaceListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHybridMonitorNamespaceListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to query all Logstore groups in the current account. The response shows that the current account has two Logstore groups: <code>Logstore_test</code> and <code>Logstore_aliyun</code>.</p>
     * 
     * @param request the request parameters of DescribeHybridMonitorSLSGroup  DescribeHybridMonitorSLSGroupRequest
     * @return DescribeHybridMonitorSLSGroupResponse
     */
    @Override
    public CompletableFuture<DescribeHybridMonitorSLSGroupResponse> describeHybridMonitorSLSGroup(DescribeHybridMonitorSLSGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHybridMonitorSLSGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHybridMonitorSLSGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHybridMonitorSLSGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query all metric import tasks that belong to the current Alibaba Cloud account. The returned result indicates that the current account has only one metric import task. The metric import task is named <code>aliyun_task</code>.</p>
     * 
     * @param request the request parameters of DescribeHybridMonitorTaskList  DescribeHybridMonitorTaskListRequest
     * @return DescribeHybridMonitorTaskListResponse
     */
    @Override
    public CompletableFuture<DescribeHybridMonitorTaskListResponse> describeHybridMonitorTaskList(DescribeHybridMonitorTaskListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHybridMonitorTaskList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHybridMonitorTaskListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHybridMonitorTaskListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeLogMonitorAttribute  DescribeLogMonitorAttributeRequest
     * @return DescribeLogMonitorAttributeResponse
     */
    @Override
    public CompletableFuture<DescribeLogMonitorAttributeResponse> describeLogMonitorAttribute(DescribeLogMonitorAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLogMonitorAttribute").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLogMonitorAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLogMonitorAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeLogMonitorList  DescribeLogMonitorListRequest
     * @return DescribeLogMonitorListResponse
     */
    @Override
    public CompletableFuture<DescribeLogMonitorListResponse> describeLogMonitorList(DescribeLogMonitorListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLogMonitorList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLogMonitorListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLogMonitorListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Limits</h3>
     * <ul>
     * <li>The total free quota is 1 million calls per month for the DescribeMetricLast, DescribeMetricList, DescribeMetricData, and DescribeMetricTop operations. If the free quota is used up and CloudMonitor Basic (pay-as-you-go) is not activated, these API operations can no longer be called as expected. If you have activated CloudMonitor Basic (pay-as-you-go), these API operations can still be called even if the free quota is used up. If the free quota is used up, you are automatically charged for the excess usage based on the pay-as-you-go billing method. For more information about how to activate CloudMonitor Basic (pay-as-you-go), see <a href="https://common-buy.aliyun.com/?spm=a2c4g.11186623.0.0.6c8f3481IbSHgG%5C&commodityCode=cms_basic_public_cn%5C&from_biz_channel=help_bill">Enable the pay-as-you-go billing method</a>.</li>
     * <li>Each API operation can be called up to 10 times per second. An Alibaba Cloud account and the Resource Access Management (RAM) users within the account share the quota.</li>
     * </ul>
     * <h3><a href="#"></a>Description</h3>
     * <blockquote>
     * <p>Different from <a href="https://help.aliyun.com/document_detail/51936.html">DescribeMetricList</a>, the DescribeMetricData operation provides statistical features. You can set the Dimension parameter to <code>{&quot;instanceId&quot;: &quot;i-abcdefgh12****&quot;}</code> to aggregate all data of your Alibaba Cloud account.
     * This topic provides an example on how to query the monitoring data of the <code>cpu_idle</code> metric for Elastic Compute Service (ECS). The namespace of ECS is <code>acs_ecs_dashboard</code>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeMetricData  DescribeMetricDataRequest
     * @return DescribeMetricDataResponse
     */
    @Override
    public CompletableFuture<DescribeMetricDataResponse> describeMetricData(DescribeMetricDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMetricData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMetricDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMetricDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Before you begin</h3>
     * <ul>
     * <li>Invocations of DescribeMetricLast, DescribeMetricList, DescribeMetricData, and DescribeMetricTop share a combined free quota of 1,000,000 calls per month. After the free quota is exhausted, if you have not activated CloudMonitor Basic pay-as-you-go billing method, you cannot use this API normally. If you have activated CloudMonitor Basic pay-as-you-go billing method, the API continues to work after the free quota is exhausted, and usage beyond the free quota is automatically billed. For the method to activate pay-as-you-go billing, see <a href="https://common-buy.aliyun.com/?spm=a2c4g.11186623.0.0.6c8f3481IbSHgG&commodityCode=cms_basic_public_cn&from_biz_channel=help_bill">Activate pay-as-you-go billing</a>.</li>
     * <li>The rate limit for a single API operation is 50 calls per second. This limit is shared by an Alibaba Cloud account and all Resource Access Management (RAM) users under the account.<blockquote>
     * <p>When you invoke an API operation, if the response contains <code>Throttling.User</code> or <code>Request was denied due to user flow control</code>, the API is being throttled. For the handling method, see <a href="https://help.aliyun.com/document_detail/2615031.html">How do I handle query API throttling</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h3>Notes</h3>
     * <p>The storage duration of cloud service monitoring data depends on the <code>Period</code> (statistical period). A larger <code>Period</code> value results in sparser monitoring data and a longer storage duration. The relationships are as follows:</p>
     * <ul>
     * <li>If <code>Period</code> is less than 60 seconds, the storage duration is 7 days.</li>
     * <li>If <code>Period</code> is equal to 60 seconds, the storage duration is 31 days.</li>
     * <li>If <code>Period</code> is greater than or equal to 300 seconds, the storage duration is 91 days.</li>
     * </ul>
     * <h3>Operation description</h3>
     * <p>This topic provides an example of how to query the latest monitoring data of the <code>CPUUtilization</code> metric for the cloud service <code>acs_ecs_dashboard</code>. The response shows that for instance <code>i-abcdefgh12****</code> under account <code>123456789876****</code>, the maximum value is 100, the minimum value is 93.1, and the average value is 99.52 at a 60-second interval.</p>
     * 
     * @param request the request parameters of DescribeMetricLast  DescribeMetricLastRequest
     * @return DescribeMetricLastResponse
     */
    @Override
    public CompletableFuture<DescribeMetricLastResponse> describeMetricLast(DescribeMetricLastRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMetricLast").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMetricLastResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMetricLastResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Limits</h3>
     * <ul>
     * <li>You have a free quota of 1 million total API calls per month for the DescribeMetricLast, DescribeMetricList, DescribeMetricData, and DescribeMetricTop operations. If you use up the free quota and have not enabled the pay-as-you-go billing method for CloudMonitor Basic, you can no longer use these API operations. If you have enabled the pay-as-you-go billing method, you can continue to use the API operations after the free quota is used up. API calls that exceed the free quota are automatically charged on a pay-as-you-go basis. For more information, see <a href="https://common-buy.aliyun.com/?spm=a2c4g.11186623.0.0.6c8f3481IbSHgG%5C&commodityCode=cms_basic_public_cn%5C&from_biz_channel=help_bill">Enable pay-as-you-go</a>.</li>
     * <li>You can call each API operation up to 50 times per second. This limit is shared between an Alibaba Cloud account and its RAM users.<blockquote>
     * <p>If you receive the <code>Throttling.User</code> or <code>Request was denied due to user flow control</code> error message when you call an API operation, the API call is throttled. For more information, see <a href="https://help.aliyun.com/document_detail/2615031.html">How do I resolve an API call throttling issue?</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h3>Notes</h3>
     * <p>The storage duration of monitoring data for a cloud service depends on the <code>Period</code> (statistical period). A larger <code>Period</code> value indicates that the monitoring data is less granular and is stored for a longer period. The relationship is as follows:</p>
     * <ul>
     * <li>If the value of <code>Period</code> is less than 60 seconds, the storage duration is 7 days.</li>
     * <li>If the value of <code>Period</code> is 60 seconds, the storage duration is 31 days.</li>
     * <li>If the value of <code>Period</code> is 300 seconds or greater, the storage duration is 91 days.</li>
     * </ul>
     * <h3>Usage notes</h3>
     * <p>This topic provides an example of how to query the monitoring data of the <code>cpu_idle</code> metric for the <code>acs_ecs_dashboard</code> cloud service. The response shows the data for the instance <code>i-abcdefgh12****</code>, which belongs to the Alibaba Cloud account <code>120886317861****</code>. At a 60 second interval, the maximum, minimum, and average values of the metric are 100, 93.1, and 99.52, respectively.</p>
     * 
     * @param request the request parameters of DescribeMetricList  DescribeMetricListRequest
     * @return DescribeMetricListResponse
     */
    @Override
    public CompletableFuture<DescribeMetricListResponse> describeMetricList(DescribeMetricListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMetricList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMetricListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMetricListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Use this operation together with DescribeMetricList and DescribeMetricLast. For more information, see <a href="https://help.aliyun.com/document_detail/51936.html">DescribeMetricList</a> and <a href="https://help.aliyun.com/document_detail/51939.html">DescribeMetricLast</a>.</p>
     * 
     * @param request the request parameters of DescribeMetricMetaList  DescribeMetricMetaListRequest
     * @return DescribeMetricMetaListResponse
     */
    @Override
    public CompletableFuture<DescribeMetricMetaListResponse> describeMetricMetaList(DescribeMetricMetaListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMetricMetaList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMetricMetaListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMetricMetaListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeMetricRuleBlackList  DescribeMetricRuleBlackListRequest
     * @return DescribeMetricRuleBlackListResponse
     */
    @Override
    public CompletableFuture<DescribeMetricRuleBlackListResponse> describeMetricRuleBlackList(DescribeMetricRuleBlackListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMetricRuleBlackList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMetricRuleBlackListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMetricRuleBlackListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeMetricRuleCount  DescribeMetricRuleCountRequest
     * @return DescribeMetricRuleCountResponse
     */
    @Override
    public CompletableFuture<DescribeMetricRuleCountResponse> describeMetricRuleCount(DescribeMetricRuleCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMetricRuleCount").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMetricRuleCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMetricRuleCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query all alert rules in the alert rule list under the current Alibaba Cloud account. The response shows that the alert rule list contains only one alert rule. The name of the alert rule is <code>Rule_01</code> and the ID is <code>applyTemplate344cfd42-0f32-4fd6-805a-88d7908a****</code>.</p>
     * 
     * @param request the request parameters of DescribeMetricRuleList  DescribeMetricRuleListRequest
     * @return DescribeMetricRuleListResponse
     */
    @Override
    public CompletableFuture<DescribeMetricRuleListResponse> describeMetricRuleList(DescribeMetricRuleListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMetricRuleList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMetricRuleListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMetricRuleListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>This topic provides an example to query the target resources associated with the alert rule <code>ae06917_75a8c43178ab66****</code>.</p>
     * 
     * @param request the request parameters of DescribeMetricRuleTargets  DescribeMetricRuleTargetsRequest
     * @return DescribeMetricRuleTargetsResponse
     */
    @Override
    public CompletableFuture<DescribeMetricRuleTargetsResponse> describeMetricRuleTargets(DescribeMetricRuleTargetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMetricRuleTargets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMetricRuleTargetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMetricRuleTargetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the details of the alert template <code>70****</code>.</p>
     * 
     * @param request the request parameters of DescribeMetricRuleTemplateAttribute  DescribeMetricRuleTemplateAttributeRequest
     * @return DescribeMetricRuleTemplateAttributeResponse
     */
    @Override
    public CompletableFuture<DescribeMetricRuleTemplateAttributeResponse> describeMetricRuleTemplateAttribute(DescribeMetricRuleTemplateAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMetricRuleTemplateAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMetricRuleTemplateAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMetricRuleTemplateAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example of querying alert templates. The response shows that the alert template list contains two alert templates: <code>ECS_Template1</code> and <code>ECS_Template2</code>.</p>
     * 
     * @param request the request parameters of DescribeMetricRuleTemplateList  DescribeMetricRuleTemplateListRequest
     * @return DescribeMetricRuleTemplateListResponse
     */
    @Override
    public CompletableFuture<DescribeMetricRuleTemplateListResponse> describeMetricRuleTemplateList(DescribeMetricRuleTemplateListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMetricRuleTemplateList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMetricRuleTemplateListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMetricRuleTemplateListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Limits</h3>
     * <ul>
     * <li>The total free quota is 1 million calls per month for the DescribeMetricLast, DescribeMetricList, DescribeMetricData, and DescribeMetricTop operations. If the free quota is used up and CloudMonitor Basic (pay-as-you-go) is not activated, these API operations can no longer be called as expected. If you have activated CloudMonitor Basic (pay-as-you-go), these API operations can still be called even if the free quota is used up. After the free quota is used up, you are charged for the excess usage based on the pay-as-you-go billing method. For more information about how to activate CloudMonitor Basic (pay-as-you-go), see <a href="https://common-buy.aliyun.com/?spm=a2c4g.11186623.0.0.6c8f3481IbSHgG%5C&commodityCode=cms_basic_public_cn%5C&from_biz_channel=help_bill">Enable the pay-as-you-go billing method</a>.</li>
     * <li>Each API operation can be called up to 10 times per second. An Alibaba Cloud account and the Resource Access Management (RAM) users within the account share the quota.</li>
     * </ul>
     * <h3><a href="#"></a>Precautions</h3>
     * <p>The storage duration of the monitoring data of each cloud service is related to the <code>Period</code> parameter (statistical period). A larger value of the <code>Period</code> parameter indicates that the monitoring data is distributed in a larger time range and the storage duration of the monitoring data is longer. The following list describes the specific relationships:</p>
     * <ul>
     * <li>The storage duration is 7 days if the value of the <code>Period</code> parameter is less than 60 seconds.</li>
     * <li>The storage duration is 31 days if the value of the <code>Period</code> parameter is 60 seconds.</li>
     * <li>The storage duration is 91 days if the value of the <code>Period</code> is greater than or equal to 300 seconds.</li>
     * </ul>
     * <h3><a href="#"></a>Operation description</h3>
     * <p>This topic provides an example on how to query the monitoring data of the <code>cpu_idle</code> metric in the last 60 seconds for Elastic Compute Service (ECS). The namespace of ECS is <code>acs_ecs_dashboard</code>. The monitoring data is sorted in descending order based on the <code>Average</code> field.</p>
     * 
     * @param request the request parameters of DescribeMetricTop  DescribeMetricTopRequest
     * @return DescribeMetricTopResponse
     */
    @Override
    public CompletableFuture<DescribeMetricTopResponse> describeMetricTop(DescribeMetricTopRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMetricTop").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMetricTopResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMetricTopResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeMonitorGroupCategories  DescribeMonitorGroupCategoriesRequest
     * @return DescribeMonitorGroupCategoriesResponse
     */
    @Override
    public CompletableFuture<DescribeMonitorGroupCategoriesResponse> describeMonitorGroupCategories(DescribeMonitorGroupCategoriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMonitorGroupCategories").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMonitorGroupCategoriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMonitorGroupCategoriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeMonitorGroupDynamicRules  DescribeMonitorGroupDynamicRulesRequest
     * @return DescribeMonitorGroupDynamicRulesResponse
     */
    @Override
    public CompletableFuture<DescribeMonitorGroupDynamicRulesResponse> describeMonitorGroupDynamicRules(DescribeMonitorGroupDynamicRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMonitorGroupDynamicRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMonitorGroupDynamicRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMonitorGroupDynamicRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeMonitorGroupInstanceAttribute  DescribeMonitorGroupInstanceAttributeRequest
     * @return DescribeMonitorGroupInstanceAttributeResponse
     */
    @Override
    public CompletableFuture<DescribeMonitorGroupInstanceAttributeResponse> describeMonitorGroupInstanceAttribute(DescribeMonitorGroupInstanceAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMonitorGroupInstanceAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMonitorGroupInstanceAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMonitorGroupInstanceAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeMonitorGroupInstances  DescribeMonitorGroupInstancesRequest
     * @return DescribeMonitorGroupInstancesResponse
     */
    @Override
    public CompletableFuture<DescribeMonitorGroupInstancesResponse> describeMonitorGroupInstances(DescribeMonitorGroupInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMonitorGroupInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMonitorGroupInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMonitorGroupInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeMonitorGroupNotifyPolicyList  DescribeMonitorGroupNotifyPolicyListRequest
     * @return DescribeMonitorGroupNotifyPolicyListResponse
     */
    @Override
    public CompletableFuture<DescribeMonitorGroupNotifyPolicyListResponse> describeMonitorGroupNotifyPolicyList(DescribeMonitorGroupNotifyPolicyListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMonitorGroupNotifyPolicyList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMonitorGroupNotifyPolicyListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMonitorGroupNotifyPolicyListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to query the list of application groups for the current account. The response shows that the current account has two application groups: <code>testGroup124</code> and <code>test123</code>.</p>
     * 
     * @param request the request parameters of DescribeMonitorGroups  DescribeMonitorGroupsRequest
     * @return DescribeMonitorGroupsResponse
     */
    @Override
    public CompletableFuture<DescribeMonitorGroupsResponse> describeMonitorGroups(DescribeMonitorGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMonitorGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMonitorGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMonitorGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeMonitorResourceQuotaAttribute  DescribeMonitorResourceQuotaAttributeRequest
     * @return DescribeMonitorResourceQuotaAttributeResponse
     */
    @Override
    public CompletableFuture<DescribeMonitorResourceQuotaAttributeResponse> describeMonitorResourceQuotaAttribute(DescribeMonitorResourceQuotaAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMonitorResourceQuotaAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMonitorResourceQuotaAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMonitorResourceQuotaAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeMonitoringAgentAccessKey  DescribeMonitoringAgentAccessKeyRequest
     * @return DescribeMonitoringAgentAccessKeyResponse
     */
    @Override
    public CompletableFuture<DescribeMonitoringAgentAccessKeyResponse> describeMonitoringAgentAccessKey(DescribeMonitoringAgentAccessKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMonitoringAgentAccessKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMonitoringAgentAccessKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMonitoringAgentAccessKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeMonitoringAgentConfig  DescribeMonitoringAgentConfigRequest
     * @return DescribeMonitoringAgentConfigResponse
     */
    @Override
    public CompletableFuture<DescribeMonitoringAgentConfigResponse> describeMonitoringAgentConfig(DescribeMonitoringAgentConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMonitoringAgentConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMonitoringAgentConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMonitoringAgentConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeMonitoringAgentHosts  DescribeMonitoringAgentHostsRequest
     * @return DescribeMonitoringAgentHostsResponse
     */
    @Override
    public CompletableFuture<DescribeMonitoringAgentHostsResponse> describeMonitoringAgentHosts(DescribeMonitoringAgentHostsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMonitoringAgentHosts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMonitoringAgentHostsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMonitoringAgentHostsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before you call this operation, you must call the CreateMonitoringAgentProcess operation to create a process monitoring task. For more information, see <a href="https://help.aliyun.com/document_detail/2513212.html">CreateMonitoringAgentProcess</a>.
     * This topic provides an example of how to query the list of processes for the resource i-hp3hl3cx1pbahzy8\<em>\</em>\<em>\</em>. The response shows the details of the Nginx and HTTP processes.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeMonitoringAgentProcesses  DescribeMonitoringAgentProcessesRequest
     * @return DescribeMonitoringAgentProcessesResponse
     */
    @Override
    public CompletableFuture<DescribeMonitoringAgentProcessesResponse> describeMonitoringAgentProcesses(DescribeMonitoringAgentProcessesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMonitoringAgentProcesses").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMonitoringAgentProcessesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMonitoringAgentProcessesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic describes how to query the status of the CloudMonitor agent that is installed on the <code>i-hp3dunahluwajv6f****</code> instance. The result indicates that the CloudMonitor agent is in the <code>running</code> state.</p>
     * 
     * @param request the request parameters of DescribeMonitoringAgentStatuses  DescribeMonitoringAgentStatusesRequest
     * @return DescribeMonitoringAgentStatusesResponse
     */
    @Override
    public CompletableFuture<DescribeMonitoringAgentStatusesResponse> describeMonitoringAgentStatuses(DescribeMonitoringAgentStatusesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMonitoringAgentStatuses").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMonitoringAgentStatusesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMonitoringAgentStatusesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeMonitoringConfig  DescribeMonitoringConfigRequest
     * @return DescribeMonitoringConfigResponse
     */
    @Override
    public CompletableFuture<DescribeMonitoringConfigResponse> describeMonitoringConfig(DescribeMonitoringConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMonitoringConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMonitoringConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMonitoringConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeProductResourceTagKeyList  DescribeProductResourceTagKeyListRequest
     * @return DescribeProductResourceTagKeyListResponse
     */
    @Override
    public CompletableFuture<DescribeProductResourceTagKeyListResponse> describeProductResourceTagKeyList(DescribeProductResourceTagKeyListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeProductResourceTagKeyList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeProductResourceTagKeyListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeProductResourceTagKeyListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeProductsOfActiveMetricRule  DescribeProductsOfActiveMetricRuleRequest
     * @return DescribeProductsOfActiveMetricRuleResponse
     */
    @Override
    public CompletableFuture<DescribeProductsOfActiveMetricRuleResponse> describeProductsOfActiveMetricRule(DescribeProductsOfActiveMetricRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeProductsOfActiveMetricRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeProductsOfActiveMetricRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeProductsOfActiveMetricRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Obtains the information about the connected cloud services, including the description, namespace, and tags of each service.</p>
     * 
     * @param request the request parameters of DescribeProjectMeta  DescribeProjectMetaRequest
     * @return DescribeProjectMetaResponse
     */
    @Override
    public CompletableFuture<DescribeProjectMetaResponse> describeProjectMeta(DescribeProjectMetaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeProjectMeta").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeProjectMetaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeProjectMetaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example of querying the details of the site monitoring task <code>cc641dff-c19d-45f3-ad0a-818a0c4f****</code>. The response shows that the task name is <code>test123</code>, the monitored address is <code>https://aliyun.com</code>, and the carrier is <code>Alibaba</code>.</p>
     * 
     * @param request the request parameters of DescribeSiteMonitorAttribute  DescribeSiteMonitorAttributeRequest
     * @return DescribeSiteMonitorAttributeResponse
     */
    @Override
    public CompletableFuture<DescribeSiteMonitorAttributeResponse> describeSiteMonitorAttribute(DescribeSiteMonitorAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSiteMonitorAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSiteMonitorAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSiteMonitorAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSiteMonitorData  DescribeSiteMonitorDataRequest
     * @return DescribeSiteMonitorDataResponse
     */
    @Override
    public CompletableFuture<DescribeSiteMonitorDataResponse> describeSiteMonitorData(DescribeSiteMonitorDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSiteMonitorData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSiteMonitorDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSiteMonitorDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>本文将提供一个示例，查询运营商“联通”在“贵阳市”的探测点详情。</p>
     * 
     * @param request the request parameters of DescribeSiteMonitorISPCityList  DescribeSiteMonitorISPCityListRequest
     * @return DescribeSiteMonitorISPCityListResponse
     */
    @Override
    public CompletableFuture<DescribeSiteMonitorISPCityListResponse> describeSiteMonitorISPCityList(DescribeSiteMonitorISPCityListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSiteMonitorISPCityList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSiteMonitorISPCityListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSiteMonitorISPCityListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to query the list of site monitoring tasks for the current account. The response shows that the current account has one site monitoring record named <code>HanZhou_ECS2</code>.</p>
     * 
     * @param request the request parameters of DescribeSiteMonitorList  DescribeSiteMonitorListRequest
     * @return DescribeSiteMonitorListResponse
     */
    @Override
    public CompletableFuture<DescribeSiteMonitorListResponse> describeSiteMonitorList(DescribeSiteMonitorListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSiteMonitorList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSiteMonitorListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSiteMonitorListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only Alibaba Cloud accounts with Network Analysis and Monitoring activated can create one-time detection tasks.
     * This topic provides an example of how to query the detection logs for the one-time detection task <code>afa5c3ce-f944-4363-9edb-ce919a29****</code>.</p>
     * 
     * @param request the request parameters of DescribeSiteMonitorLog  DescribeSiteMonitorLogRequest
     * @return DescribeSiteMonitorLogResponse
     */
    @Override
    public CompletableFuture<DescribeSiteMonitorLogResponse> describeSiteMonitorLog(DescribeSiteMonitorLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSiteMonitorLog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSiteMonitorLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSiteMonitorLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSiteMonitorQuota  DescribeSiteMonitorQuotaRequest
     * @return DescribeSiteMonitorQuotaResponse
     */
    @Override
    public CompletableFuture<DescribeSiteMonitorQuotaResponse> describeSiteMonitorQuota(DescribeSiteMonitorQuotaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSiteMonitorQuota").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSiteMonitorQuotaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSiteMonitorQuotaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the average statistics of the <code>Availability</code> metric in the site monitoring task whose ID is <code>ef4cdc8b-9dc7-43e7-810e-f950e56c****</code>. The returned result shows that the availability is <code>100</code>.</p>
     * 
     * @param request the request parameters of DescribeSiteMonitorStatistics  DescribeSiteMonitorStatisticsRequest
     * @return DescribeSiteMonitorStatisticsResponse
     */
    @Override
    public CompletableFuture<DescribeSiteMonitorStatisticsResponse> describeSiteMonitorStatistics(DescribeSiteMonitorStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSiteMonitorStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSiteMonitorStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSiteMonitorStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example to query the details of detection points for the carrier China Unicom in Beijing.</p>
     * 
     * @param request the request parameters of DescribeSyntheticProbeList  DescribeSyntheticProbeListRequest
     * @return DescribeSyntheticProbeListResponse
     */
    @Override
    public CompletableFuture<DescribeSyntheticProbeListResponse> describeSyntheticProbeList(DescribeSyntheticProbeListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSyntheticProbeList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSyntheticProbeListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSyntheticProbeListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSystemEventAttribute  DescribeSystemEventAttributeRequest
     * @return DescribeSystemEventAttributeResponse
     */
    @Override
    public CompletableFuture<DescribeSystemEventAttributeResponse> describeSystemEventAttribute(DescribeSystemEventAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSystemEventAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSystemEventAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSystemEventAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Background information</h3>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/114972.html">DescribeSystemEventMetaList</a> to obtain the Alibaba Cloud services and their system events supported by CloudMonitor.</p>
     * <h3>Operation description</h3>
     * <p>This topic provides an example of how to query the number of events that occurred for Elastic Compute Service (<code>ECS</code>) under the current account. The response shows that a total of 3 events occurred.</p>
     * 
     * @param request the request parameters of DescribeSystemEventCount  DescribeSystemEventCountRequest
     * @return DescribeSystemEventCountResponse
     */
    @Override
    public CompletableFuture<DescribeSystemEventCountResponse> describeSystemEventCount(DescribeSystemEventCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSystemEventCount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSystemEventCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSystemEventCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSystemEventHistogram  DescribeSystemEventHistogramRequest
     * @return DescribeSystemEventHistogramResponse
     */
    @Override
    public CompletableFuture<DescribeSystemEventHistogramResponse> describeSystemEventHistogram(DescribeSystemEventHistogramRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSystemEventHistogram").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSystemEventHistogramResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSystemEventHistogramResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSystemEventMetaList  DescribeSystemEventMetaListRequest
     * @return DescribeSystemEventMetaListResponse
     */
    @Override
    public CompletableFuture<DescribeSystemEventMetaListResponse> describeSystemEventMetaList(DescribeSystemEventMetaListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSystemEventMetaList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSystemEventMetaListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSystemEventMetaListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeTagKeyList  DescribeTagKeyListRequest
     * @return DescribeTagKeyListResponse
     */
    @Override
    public CompletableFuture<DescribeTagKeyListResponse> describeTagKeyList(DescribeTagKeyListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTagKeyList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTagKeyListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTagKeyListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeTagValueList  DescribeTagValueListRequest
     * @return DescribeTagValueListResponse
     */
    @Override
    public CompletableFuture<DescribeTagValueListResponse> describeTagValueList(DescribeTagValueListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTagValueList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTagValueListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTagValueListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeUnhealthyHostAvailability  DescribeUnhealthyHostAvailabilityRequest
     * @return DescribeUnhealthyHostAvailabilityResponse
     */
    @Override
    public CompletableFuture<DescribeUnhealthyHostAvailabilityResponse> describeUnhealthyHostAvailability(DescribeUnhealthyHostAvailabilityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUnhealthyHostAvailability").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUnhealthyHostAvailabilityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUnhealthyHostAvailabilityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisableActiveMetricRule  DisableActiveMetricRuleRequest
     * @return DisableActiveMetricRuleResponse
     */
    @Override
    public CompletableFuture<DisableActiveMetricRuleResponse> disableActiveMetricRule(DisableActiveMetricRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableActiveMetricRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableActiveMetricRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableActiveMetricRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisableEventRules  DisableEventRulesRequest
     * @return DisableEventRulesResponse
     */
    @Override
    public CompletableFuture<DisableEventRulesResponse> disableEventRules(DisableEventRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableEventRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableEventRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableEventRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisableHostAvailability  DisableHostAvailabilityRequest
     * @return DisableHostAvailabilityResponse
     */
    @Override
    public CompletableFuture<DisableHostAvailabilityResponse> disableHostAvailability(DisableHostAvailabilityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableHostAvailability").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableHostAvailabilityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableHostAvailabilityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisableMetricRules  DisableMetricRulesRequest
     * @return DisableMetricRulesResponse
     */
    @Override
    public CompletableFuture<DisableMetricRulesResponse> disableMetricRules(DisableMetricRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableMetricRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableMetricRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableMetricRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisableSiteMonitors  DisableSiteMonitorsRequest
     * @return DisableSiteMonitorsResponse
     */
    @Override
    public CompletableFuture<DisableSiteMonitorsResponse> disableSiteMonitors(DisableSiteMonitorsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableSiteMonitors").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableSiteMonitorsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableSiteMonitorsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example of setting a threshold alert rule for the <code>cpu_total</code> metric of the instance <code>i-uf6j91r34rnwawoo****</code> in the <code>acs_ecs_dashboard</code> namespace of Elastic Compute Service (ECS). The alert contact group for the alert rule is <code>ECS_Group</code>, the alert rule name is <code>test123</code>, the alert rule ID is <code>a151cd6023eacee2f0978e03863cc1697c89508****</code>, the statistical method for the Critical level is <code>Average</code>, the comparison operator for the Critical level is <code>GreaterThanOrEqualToThreshold</code>, the threshold for the Critical level is <code>90</code>, and the alert retry count for the Critical level is <code>3</code>.</p>
     * <blockquote>
     * <p>On August 15, 2024, Statistics validation was added. The statistical value must be the Statistics value corresponding to the metric. For more information about how to obtain the value of this parameter, see <a href="https://www.alibabacloud.com/help/en/cms/support/appendix-1-metrics">Alibaba Cloud service monitoring metrics</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of EnableActiveMetricRule  EnableActiveMetricRuleRequest
     * @return EnableActiveMetricRuleResponse
     */
    @Override
    public CompletableFuture<EnableActiveMetricRuleResponse> enableActiveMetricRule(EnableActiveMetricRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableActiveMetricRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableActiveMetricRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableActiveMetricRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnableEventRules  EnableEventRulesRequest
     * @return EnableEventRulesResponse
     */
    @Override
    public CompletableFuture<EnableEventRulesResponse> enableEventRules(EnableEventRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableEventRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableEventRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableEventRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnableHostAvailability  EnableHostAvailabilityRequest
     * @return EnableHostAvailabilityResponse
     */
    @Override
    public CompletableFuture<EnableHostAvailabilityResponse> enableHostAvailability(EnableHostAvailabilityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableHostAvailability").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableHostAvailabilityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableHostAvailabilityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnableMetricRuleBlackList  EnableMetricRuleBlackListRequest
     * @return EnableMetricRuleBlackListResponse
     */
    @Override
    public CompletableFuture<EnableMetricRuleBlackListResponse> enableMetricRuleBlackList(EnableMetricRuleBlackListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableMetricRuleBlackList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableMetricRuleBlackListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableMetricRuleBlackListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnableMetricRules  EnableMetricRulesRequest
     * @return EnableMetricRulesResponse
     */
    @Override
    public CompletableFuture<EnableMetricRulesResponse> enableMetricRules(EnableMetricRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableMetricRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableMetricRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableMetricRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnableSiteMonitors  EnableSiteMonitorsRequest
     * @return EnableSiteMonitorsResponse
     */
    @Override
    public CompletableFuture<EnableSiteMonitorsResponse> enableSiteMonitors(EnableSiteMonitorsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableSiteMonitors").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableSiteMonitorsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableSiteMonitorsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Before you begin</h2>
     * <p>Make sure that the Cloud Assistant agent is installed on the Alibaba Cloud host. For more information about how to install the Cloud Assistant agent, see <a href="https://help.aliyun.com/document_detail/64601.html">Cloud Assistant overview</a>.</p>
     * <h2>Background information</h2>
     * <p>This operation applies only to Alibaba Cloud hosts, namely ECS instances.
     * The success rate of installing the CloudMonitor agent by calling this API operation is approximately 95%. If the installation fails, install the agent manually. For more information about how to install the CloudMonitor agent, see <a href="https://help.aliyun.com/document_detail/183482.html">Install and uninstall the CloudMonitor agent for C++</a>.</p>
     * <h2>Usage notes</h2>
     * <p>This topic provides an example on how to forcibly install the latest version of the CloudMonitor agent on the Alibaba Cloud host i-m5e0k0bexac8tykr****.</p>
     * 
     * @param request the request parameters of InstallMonitoringAgent  InstallMonitoringAgentRequest
     * @return InstallMonitoringAgentResponse
     */
    @Override
    public CompletableFuture<InstallMonitoringAgentResponse> installMonitoringAgent(InstallMonitoringAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InstallMonitoringAgent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InstallMonitoringAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InstallMonitoringAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyGroupMonitoringAgentProcess  ModifyGroupMonitoringAgentProcessRequest
     * @return ModifyGroupMonitoringAgentProcessResponse
     */
    @Override
    public CompletableFuture<ModifyGroupMonitoringAgentProcessResponse> modifyGroupMonitoringAgentProcess(ModifyGroupMonitoringAgentProcessRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyGroupMonitoringAgentProcess").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyGroupMonitoringAgentProcessResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyGroupMonitoringAgentProcessResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to change the name of availability monitoring task <code>12345</code> in application group <code>123456</code> to <code>task2</code>.</p>
     * 
     * @param request the request parameters of ModifyHostAvailability  ModifyHostAvailabilityRequest
     * @return ModifyHostAvailabilityResponse
     */
    @Override
    public CompletableFuture<ModifyHostAvailabilityResponse> modifyHostAvailability(ModifyHostAvailabilityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyHostAvailability").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyHostAvailabilityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyHostAvailabilityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * @param request the request parameters of ModifyHostInfo  ModifyHostInfoRequest
     * @return ModifyHostInfoResponse
     */
    @Override
    public CompletableFuture<ModifyHostInfoResponse> modifyHostInfo(ModifyHostInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyHostInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyHostInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyHostInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to change the data storage duration of the metric store <code>aliyun</code> to <code>cms.s1.2xlarge</code>. The response shows that the metric store is modified.</p>
     * 
     * @param request the request parameters of ModifyHybridMonitorNamespace  ModifyHybridMonitorNamespaceRequest
     * @return ModifyHybridMonitorNamespaceResponse
     */
    @Override
    public CompletableFuture<ModifyHybridMonitorNamespaceResponse> modifyHybridMonitorNamespace(ModifyHybridMonitorNamespaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyHybridMonitorNamespace").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyHybridMonitorNamespaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyHybridMonitorNamespaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to change the Logstore in the <code>aliyun-project</code> log project in the <code>ap-southeast-1</code> region of the Logstore group <code>Logstore_test</code> to <code>Logstore-aliyun-all</code>. The response shows that the Logstore group is modified.</p>
     * 
     * @param request the request parameters of ModifyHybridMonitorSLSGroup  ModifyHybridMonitorSLSGroupRequest
     * @return ModifyHybridMonitorSLSGroupResponse
     */
    @Override
    public CompletableFuture<ModifyHybridMonitorSLSGroupResponse> modifyHybridMonitorSLSGroup(ModifyHybridMonitorSLSGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyHybridMonitorSLSGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyHybridMonitorSLSGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyHybridMonitorSLSGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to change the collection interval of the SLS log monitoring task <code>36****</code> to <code>15</code> seconds. The response shows that the metric is modified.</p>
     * 
     * @param request the request parameters of ModifyHybridMonitorTask  ModifyHybridMonitorTaskRequest
     * @return ModifyHybridMonitorTaskResponse
     */
    @Override
    public CompletableFuture<ModifyHybridMonitorTaskResponse> modifyHybridMonitorTask(ModifyHybridMonitorTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyHybridMonitorTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyHybridMonitorTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyHybridMonitorTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyMetricRuleBlackList  ModifyMetricRuleBlackListRequest
     * @return ModifyMetricRuleBlackListResponse
     */
    @Override
    public CompletableFuture<ModifyMetricRuleBlackListResponse> modifyMetricRuleBlackList(ModifyMetricRuleBlackListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyMetricRuleBlackList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyMetricRuleBlackListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyMetricRuleBlackListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to modify an alert template whose version is <code>1</code> and ID is <code>123456</code>. The alert level is changed to <code>Critical</code>. The statistical method is changed to <code>Average</code>. The alert threshold comparator is changed to <code>GreaterThanOrEqualToThreshold</code>. The alert threshold is changed to <code>90</code>. The number of alert retries is changed to <code>3</code>. The response shows that the alert template is modified.</p>
     * 
     * @param request the request parameters of ModifyMetricRuleTemplate  ModifyMetricRuleTemplateRequest
     * @return ModifyMetricRuleTemplateResponse
     */
    @Override
    public CompletableFuture<ModifyMetricRuleTemplateResponse> modifyMetricRuleTemplate(ModifyMetricRuleTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyMetricRuleTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyMetricRuleTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyMetricRuleTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyMonitorGroup  ModifyMonitorGroupRequest
     * @return ModifyMonitorGroupResponse
     */
    @Override
    public CompletableFuture<ModifyMonitorGroupResponse> modifyMonitorGroup(ModifyMonitorGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyMonitorGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyMonitorGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyMonitorGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyMonitorGroupInstances  ModifyMonitorGroupInstancesRequest
     * @return ModifyMonitorGroupInstancesResponse
     */
    @Override
    public CompletableFuture<ModifyMonitorGroupInstancesResponse> modifyMonitorGroupInstances(ModifyMonitorGroupInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyMonitorGroupInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyMonitorGroupInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyMonitorGroupInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifySiteMonitor  ModifySiteMonitorRequest
     * @return ModifySiteMonitorResponse
     */
    @Override
    public CompletableFuture<ModifySiteMonitorResponse> modifySiteMonitor(ModifySiteMonitorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySiteMonitor").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySiteMonitorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySiteMonitorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PutContact  PutContactRequest
     * @return PutContactResponse
     */
    @Override
    public CompletableFuture<PutContactResponse> putContact(PutContactRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PutContact").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutContactResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutContactResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PutContactGroup  PutContactGroupRequest
     * @return PutContactGroupResponse
     */
    @Override
    public CompletableFuture<PutContactGroupResponse> putContactGroup(PutContactGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PutContactGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutContactGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutContactGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PutCustomEvent  PutCustomEventRequest
     * @return PutCustomEventResponse
     */
    @Override
    public CompletableFuture<PutCustomEventResponse> putCustomEvent(PutCustomEventRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PutCustomEvent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutCustomEventResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutCustomEventResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must call the PutCustomEvent operation to report the monitoring data of the custom event. For more information, see <a href="https://help.aliyun.com/document_detail/115012.html">PutCustomEvent</a>.</p>
     * 
     * @param request the request parameters of PutCustomEventRule  PutCustomEventRuleRequest
     * @return PutCustomEventRuleResponse
     */
    @Override
    public CompletableFuture<PutCustomEventRuleResponse> putCustomEventRule(PutCustomEventRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PutCustomEventRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutCustomEventRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutCustomEventRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>We recommend that you use the <a href="https://help.aliyun.com/document_detail/383455.html">PutHybridMonitorMetricData</a> operation in Enterprise CloudMonitor.</p>
     * </blockquote>
     * 
     * @param request the request parameters of PutCustomMetric  PutCustomMetricRequest
     * @return PutCustomMetricResponse
     */
    @Override
    public CompletableFuture<PutCustomMetricResponse> putCustomMetric(PutCustomMetricRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PutCustomMetric").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutCustomMetricResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutCustomMetricResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before calling this operation, call the PutCustomMetric operation to report custom monitoring data. For more information, see <a href="https://help.aliyun.com/document_detail/115004.html">PutCustomMetric</a>.</p>
     * 
     * @param request the request parameters of PutCustomMetricRule  PutCustomMetricRuleRequest
     * @return PutCustomMetricRuleResponse
     */
    @Override
    public CompletableFuture<PutCustomMetricRuleResponse> putCustomMetricRule(PutCustomMetricRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PutCustomMetricRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutCustomMetricRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutCustomMetricRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If the specified alert rule name does not exist, a new alert rule is created. If the specified alert rule name already exists, the existing alert rule is modified.
     * This topic provides an example on how to create an event-triggered alert rule named <code>myRuleName</code> for the Alibaba Cloud service <code>ecs</code>.</p>
     * 
     * @param request the request parameters of PutEventRule  PutEventRuleRequest
     * @return PutEventRuleResponse
     */
    @Override
    public CompletableFuture<PutEventRuleResponse> putEventRule(PutEventRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PutEventRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutEventRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutEventRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PutEventRuleTargets  PutEventRuleTargetsRequest
     * @return PutEventRuleTargetsResponse
     */
    @Override
    public CompletableFuture<PutEventRuleTargetsResponse> putEventRuleTargets(PutEventRuleTargetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PutEventRuleTargets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutEventRuleTargetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutEventRuleTargetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Only Log Service (SLS) is supported. More products will be supported in the future.</p>
     * </blockquote>
     * 
     * @param request the request parameters of PutExporterOutput  PutExporterOutputRequest
     * @return PutExporterOutputResponse
     */
    @Override
    public CompletableFuture<PutExporterOutputResponse> putExporterOutput(PutExporterOutputRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PutExporterOutput").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutExporterOutputResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutExporterOutputResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PutExporterRule  PutExporterRuleRequest
     * @return PutExporterRuleResponse
     */
    @Override
    public CompletableFuture<PutExporterRuleResponse> putExporterRule(PutExporterRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PutExporterRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutExporterRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutExporterRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example of creating an alert rule for the <code>cpu_total</code> monitoring metric of the Elastic Computing Service server (an Alibaba Cloud service) in the application group <code>17285****</code>. The alert rule ID is <code>123456</code>, the alert rule name is <code>Rule_test</code>, the alert level is <code>Critical</code>, the statistical method is <code>Average</code>, the threshold comparison operator is <code>GreaterThanOrEqualToThreshold</code>, the threshold is <code>90</code>, and the retry count is <code>3</code>. The response shows that the alert rule is created and the alert rule ID is <code>123456</code>.</p>
     * 
     * @param request the request parameters of PutGroupMetricRule  PutGroupMetricRuleRequest
     * @return PutGroupMetricRuleResponse
     */
    @Override
    public CompletableFuture<PutGroupMetricRuleResponse> putGroupMetricRule(PutGroupMetricRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PutGroupMetricRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutGroupMetricRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutGroupMetricRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Prerequisites</h2>
     * <p>Make sure that you have activated Enterprise CloudMonitor. For more information, see <a href="https://help.aliyun.com/document_detail/250773.html">Activate Enterprise CloudMonitor</a>.</p>
     * <h2>Limits</h2>
     * <p>The size of the monitoring data that you can report at a time cannot exceed 1 MB.</p>
     * <h2>Usage notes</h2>
     * <p>This topic provides an example to show how to report the monitoring data of the <code>CPU_Usage</code> metric to the <code>default-aliyun</code> metric namespace of Enterprise CloudMonitor.</p>
     * 
     * @param request the request parameters of PutHybridMonitorMetricData  PutHybridMonitorMetricDataRequest
     * @return PutHybridMonitorMetricDataResponse
     */
    @Override
    public CompletableFuture<PutHybridMonitorMetricDataResponse> putHybridMonitorMetricData(PutHybridMonitorMetricDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PutHybridMonitorMetricData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutHybridMonitorMetricDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutHybridMonitorMetricDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to create a log monitoring metric named <code>cpu_total</code>. The response shows that the log monitoring metric is created. The log monitoring metric ID is <code>16****</code>.</p>
     * 
     * @param request the request parameters of PutLogMonitor  PutLogMonitorRequest
     * @return PutLogMonitorResponse
     */
    @Override
    public CompletableFuture<PutLogMonitorResponse> putLogMonitor(PutLogMonitorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PutLogMonitor").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutLogMonitorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutLogMonitorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>This topic provides an example on how to associate the resource <code>acs:mns:ap-southeast-1:120886317861****:/queues/test/message</code> with the alert rule <code>ae06917_75a8c43178ab66****</code>. The alert trigger target ID is <code>1</code>. The response shows that the resource is associated.</p>
     * 
     * @param request the request parameters of PutMetricRuleTargets  PutMetricRuleTargetsRequest
     * @return PutMetricRuleTargetsResponse
     */
    @Override
    public CompletableFuture<PutMetricRuleTargetsResponse> putMetricRuleTargets(PutMetricRuleTargetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PutMetricRuleTargets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutMetricRuleTargetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutMetricRuleTargetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PutMonitorGroupDynamicRule  PutMonitorGroupDynamicRuleRequest
     * @return PutMonitorGroupDynamicRuleResponse
     */
    @Override
    public CompletableFuture<PutMonitorGroupDynamicRuleResponse> putMonitorGroupDynamicRule(PutMonitorGroupDynamicRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PutMonitorGroupDynamicRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutMonitorGroupDynamicRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutMonitorGroupDynamicRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PutMonitoringConfig  PutMonitoringConfigRequest
     * @return PutMonitoringConfigResponse
     */
    @Override
    public CompletableFuture<PutMonitoringConfigResponse> putMonitoringConfig(PutMonitoringConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PutMonitoringConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutMonitoringConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutMonitoringConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to configure a threshold-based alert rule for the <code>cpu_total</code> metric of a cloud server (ECS) instance <code>i-uf6j91r34rnwawoo****</code> in the <code>acs_ecs_dashboard</code> namespace. The alert contact group for the alert rule is <code>ECS_Group</code>, the alert rule name is <code>test123</code>, the alert rule ID is <code>a151cd6023eacee2f0978e03863cc1697c89508****</code>, the statistical method for the Critical level is <code>Average</code>, the comparison operator for the Critical level is <code>GreaterThanOrEqualToThreshold</code>, the threshold for the Critical level is <code>90</code>, and the alert retry count for the Critical level is <code>3</code>.</p>
     * <blockquote>
     * <p>On August 15, 2024, Statistics validation is increased. The statistical value must match the Statistics of the corresponding metric. For more information about how to obtain the valid values for this parameter, see <a href="https://www.alibabacloud.com/help/en/cms/support/appendix-1-metrics">Alibaba Cloud service metrics</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of PutResourceMetricRule  PutResourceMetricRuleRequest
     * @return PutResourceMetricRuleResponse
     */
    @Override
    public CompletableFuture<PutResourceMetricRuleResponse> putResourceMetricRule(PutResourceMetricRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PutResourceMetricRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutResourceMetricRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutResourceMetricRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example of the Settings for a threshold alert rule for the <code>cpu_total</code> monitoring metric of the ECS server <code>i-uf6j91r34rnwawoo****</code> in the <code>acs_ecs_dashboard</code> namespace. The alert contact group for the alert rule is <code>ECS_Group</code>, the alert rule name is <code>test123</code>, the alert rule ID is <code>a151cd6023eacee2f0978e03863cc1697c89508****</code>, the statistical method for the Critical level is <code>Average</code>, the comparison operator for the Critical level is <code>GreaterThanOrEqualToThreshold</code>, the threshold for the Critical level is <code>90</code>, and the alert retry count for the Critical level is <code>3</code>.</p>
     * <blockquote>
     * <p>On August 15, 2024, Statistics validation was increased. The statistical value must match the Statistics value of the corresponding metric. For more information about how to obtain the value of this parameter, see <a href="https://www.alibabacloud.com/help/en/cms/support/appendix-1-metrics">Alibaba Cloud service monitoring metrics</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of PutResourceMetricRules  PutResourceMetricRulesRequest
     * @return PutResourceMetricRulesResponse
     */
    @Override
    public CompletableFuture<PutResourceMetricRulesResponse> putResourceMetricRules(PutResourceMetricRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PutResourceMetricRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutResourceMetricRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutResourceMetricRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveTags  RemoveTagsRequest
     * @return RemoveTagsResponse
     */
    @Override
    public CompletableFuture<RemoveTagsResponse> removeTags(RemoveTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveTags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Tests whether a system event can be triggered as expected. Simulates a system event and verifies the response when the event triggers an alert.</p>
     * 
     * @param request the request parameters of SendDryRunSystemEvent  SendDryRunSystemEventRequest
     * @return SendDryRunSystemEventResponse
     */
    @Override
    public CompletableFuture<SendDryRunSystemEventResponse> sendDryRunSystemEvent(SendDryRunSystemEventRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SendDryRunSystemEvent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendDryRunSystemEventResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendDryRunSystemEventResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This API operation is not applicable to Elastic Compute Service (ECS) instances. To uninstall the agent from an ECS instance, see <a href="https://help.aliyun.com/document_detail/183482.html">Install and uninstall the CloudMonitor agent</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UninstallMonitoringAgent  UninstallMonitoringAgentRequest
     * @return UninstallMonitoringAgentResponse
     */
    @Override
    public CompletableFuture<UninstallMonitoringAgentResponse> uninstallMonitoringAgent(UninstallMonitoringAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UninstallMonitoringAgent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UninstallMonitoringAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UninstallMonitoringAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
