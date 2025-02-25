// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cms20190101.models.*;
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
     * <p>This topic provides an example on how to add a tag to an application group whose ID is <code>7301****</code>. In this example, the key of the tag is <code>key1</code> and the value of the tag is <code>value1</code>.</p>
     * 
     * @param request the request parameters of AddTags  AddTagsRequest
     * @return AddTagsResponse
     */
    CompletableFuture<AddTagsResponse> addTags(AddTagsRequest request);

    /**
     * <b>description</b> :
     * <p>In this example, the <code>700****</code> alert template is applied to the <code>123456</code> application group. For the generated alert rule, the ID is <code>applyTemplate8ab74c6b-9f27-47ab-8841-de01dc08****</code>, and the name is <code>test123</code>.</p>
     * 
     * @param request the request parameters of ApplyMetricRuleTemplate  ApplyMetricRuleTemplateRequest
     * @return ApplyMetricRuleTemplateResponse
     */
    CompletableFuture<ApplyMetricRuleTemplateResponse> applyMetricRuleTemplate(ApplyMetricRuleTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create a site monitoring task named <code>HangZhou_ECS1</code>. The URL that is monitored by the task is <code>https://www.aliyun.com</code> and the type of the task is <code>HTTP</code>. The returned result shows that the site monitoring task is created. The name of the site monitoring task is <code>HangZhou_ECS1</code> and the task ID is <code>679fbe4f-b80b-4706-91b2-5427b43e****</code>.</p>
     * 
     * @param request the request parameters of BatchCreateInstantSiteMonitor  BatchCreateInstantSiteMonitorRequest
     * @return BatchCreateInstantSiteMonitorResponse
     */
    CompletableFuture<BatchCreateInstantSiteMonitorResponse> batchCreateInstantSiteMonitor(BatchCreateInstantSiteMonitorRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>The <code>Cursor</code> information is returned by calling the <a href="https://help.aliyun.com/document_detail/2330730.html">Cursor</a> operation.</p>
     * <h3><a href="#"></a>Description</h3>
     * <p>This topic provides an example on how to export the monitoring data of the <code>cpu_idle</code> metric for Elastic Compute Service (ECS). The namespace of ECS is <code>acs_ecs_dashboard</code>. The <code>Cursor</code> information is specified. A maximum of 1,000 data entries can be returned in each response.</p>
     * 
     * @param request the request parameters of BatchExport  BatchExportRequest
     * @return BatchExportResponse
     */
    CompletableFuture<BatchExportResponse> batchExport(BatchExportRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is available for Elastic Compute Service (ECS), ApsaraDB RDS, and Server Load Balancer (SLB).
     * This topic provides an example to show how to create an application group for resources whose tag key is <code>ecs_instance</code>. In this example, the alert contact group of the application group is <code>ECS_Group</code>.</p>
     * 
     * @param request the request parameters of CreateDynamicTagGroup  CreateDynamicTagGroupRequest
     * @return CreateDynamicTagGroupResponse
     */
    CompletableFuture<CreateDynamicTagGroupResponse> createDynamicTagGroup(CreateDynamicTagGroupRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example to show how to create an alert rule for the <code>cpu_total</code> metric of Elastic Compute Service (ECS) in the <code>123456</code> application group. The ID of the alert rule is <code>456789</code>. The name of the alert rule is <code>ECS_Rule1</code>. The alert level is <code>Critical</code>. The statistical method is <code>Average</code>. The comparison operator is <code>GreaterThanOrEqualToThreshold</code>. The alert threshold is <code>90</code>. The number of alert retries is <code>3</code>. The response shows that the alert rule named <code>ECS_Rule1</code> is created.</p>
     * 
     * @param request the request parameters of CreateGroupMetricRules  CreateGroupMetricRulesRequest
     * @return CreateGroupMetricRulesResponse
     */
    CompletableFuture<CreateGroupMetricRulesResponse> createGroupMetricRules(CreateGroupMetricRulesRequest request);

    /**
     * @param request the request parameters of CreateGroupMonitoringAgentProcess  CreateGroupMonitoringAgentProcessRequest
     * @return CreateGroupMonitoringAgentProcessResponse
     */
    CompletableFuture<CreateGroupMonitoringAgentProcessResponse> createGroupMonitoringAgentProcess(CreateGroupMonitoringAgentProcessRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create an availability monitoring task named <code>task1</code> in an application group named <code>123456</code>. The TaskType parameter of the task is set to <code>HTTP</code>. After you start the task, the system sends alerts by using the specified email address and DingTalk chatbot.</p>
     * 
     * @param request the request parameters of CreateHostAvailability  CreateHostAvailabilityRequest
     * @return CreateHostAvailabilityResponse
     */
    CompletableFuture<CreateHostAvailabilityResponse> createHostAvailability(CreateHostAvailabilityRequest request);

    /**
     * <b>description</b> :
     * <h1><a href="#"></a>Prerequisites</h1>
     * <p>Hybrid Cloud Monitoring is activated. For more information, see <a href="https://help.aliyun.com/document_detail/250773.html">Activate Hybrid Cloud Monitoring</a>.</p>
     * <h1><a href="#"></a>Description</h1>
     * <p>This topic provides an example on how to create a namespace named <code>aliyun</code>. In this example, the data retention period of the namespace is set to <code>cms.s1.3xlarge</code>. The returned result indicates that the namespace is created.</p>
     * 
     * @param request the request parameters of CreateHybridMonitorNamespace  CreateHybridMonitorNamespaceRequest
     * @return CreateHybridMonitorNamespaceResponse
     */
    CompletableFuture<CreateHybridMonitorNamespaceResponse> createHybridMonitorNamespace(CreateHybridMonitorNamespaceRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Prerequisites</h2>
     * <p>Simple Log Service is activated. A project and a Logstore are created in Simple Log Service. For more information, see <a href="https://help.aliyun.com/document_detail/54604.html">Getting Started</a>.</p>
     * <h2><a href="#"></a>Description</h2>
     * <p>This topic provides an example on how to create a Logstore group named <code>Logstore_test</code>. The region ID is <code>cn-hangzhou</code>. The project is <code>aliyun-project</code>. The Logstore is <code>Logstore-ECS</code>. The response shows that the Logstore group is created.</p>
     * 
     * @param request the request parameters of CreateHybridMonitorSLSGroup  CreateHybridMonitorSLSGroupRequest
     * @return CreateHybridMonitorSLSGroupResponse
     */
    CompletableFuture<CreateHybridMonitorSLSGroupResponse> createHybridMonitorSLSGroup(CreateHybridMonitorSLSGroupRequest request);

    /**
     * <b>description</b> :
     * <h1><a href="#"></a>Prerequisites</h1>
     * <ul>
     * <li>Hybrid Cloud Monitoring is activated. For more information, see <a href="https://help.aliyun.com/document_detail/250773.html">Activate Hybrid Cloud Monitoring</a>.</li>
     * <li>If you want to create a metric for logs imported from Simple Log Service, make sure that you have activated Simple Log Service and created a project and a Logstore. For more information, see <a href="https://help.aliyun.com/document_detail/54604.html">Getting Started</a>.</li>
     * </ul>
     * <h1><a href="#"></a>Description</h1>
     * <p>This topic provides an example on how to create a metric import task named <code>aliyun_task</code> for Elastic Compute Service (ECS). The task imports the <code>cpu_total</code> metric to the <code>aliyun</code> namespace. The response shows that the metric import task is created.</p>
     * 
     * @param request the request parameters of CreateHybridMonitorTask  CreateHybridMonitorTaskRequest
     * @return CreateHybridMonitorTaskResponse
     */
    CompletableFuture<CreateHybridMonitorTaskResponse> createHybridMonitorTask(CreateHybridMonitorTaskRequest request);

    /**
     * <b>description</b> :
     * <p>You can create an instant test task only by using the Alibaba Cloud account that you used to enable Network Analysis and Monitoring. 
     * This topic provides an example to show how to create an instant test task. The name of the task is <code>task1</code>. The tested address is <code>http://www.aliyun.com</code>. The test type is <code>HTTP</code>. The number of detection points is <code>1</code>.</p>
     * 
     * @param request the request parameters of CreateInstantSiteMonitor  CreateInstantSiteMonitorRequest
     * @return CreateInstantSiteMonitorResponse
     */
    CompletableFuture<CreateInstantSiteMonitorResponse> createInstantSiteMonitor(CreateInstantSiteMonitorRequest request);

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
    CompletableFuture<CreateMetricRuleBlackListResponse> createMetricRuleBlackList(CreateMetricRuleBlackListRequest request);

    /**
     * @param request the request parameters of CreateMetricRuleResources  CreateMetricRuleResourcesRequest
     * @return CreateMetricRuleResourcesResponse
     */
    CompletableFuture<CreateMetricRuleResourcesResponse> createMetricRuleResources(CreateMetricRuleResourcesRequest request);

    /**
     * @param request the request parameters of CreateMetricRuleTemplate  CreateMetricRuleTemplateRequest
     * @return CreateMetricRuleTemplateResponse
     */
    CompletableFuture<CreateMetricRuleTemplateResponse> createMetricRuleTemplate(CreateMetricRuleTemplateRequest request);

    /**
     * @param request the request parameters of CreateMonitorAgentProcess  CreateMonitorAgentProcessRequest
     * @return CreateMonitorAgentProcessResponse
     */
    CompletableFuture<CreateMonitorAgentProcessResponse> createMonitorAgentProcess(CreateMonitorAgentProcessRequest request);

    /**
     * <b>description</b> :
     * <p>In this example, an application group named <code>ECS_Group</code> is created.</p>
     * 
     * @param request the request parameters of CreateMonitorGroup  CreateMonitorGroupRequest
     * @return CreateMonitorGroupResponse
     */
    CompletableFuture<CreateMonitorGroupResponse> createMonitorGroup(CreateMonitorGroupRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create an application group by using the resource group <code>CloudMonitor</code> and the alert contact group <code>ECS_Group</code>. The region ID of the resource group is <code>cn-hangzhou</code>.</p>
     * 
     * @param request the request parameters of CreateMonitorGroupByResourceGroupId  CreateMonitorGroupByResourceGroupIdRequest
     * @return CreateMonitorGroupByResourceGroupIdResponse
     */
    CompletableFuture<CreateMonitorGroupByResourceGroupIdResponse> createMonitorGroupByResourceGroupId(CreateMonitorGroupByResourceGroupIdRequest request);

    /**
     * <b>description</b> :
     * <p>You can add a maximum of 1,000 instances to an application group at a time. You can add a maximum of 3,000 instances of an Alibaba Cloud service to an application group. The total number of instances that you can add to an application group is unlimited.
     * In this example, an Elastic Compute Service (ECS) instance in the <code>China (Hangzhou)</code> region is added to the <code>3607****</code> application group. The instance ID is <code>i-2ze26xj5wwy12****</code> and the instance name is <code>test-instance-ecs</code>.</p>
     * 
     * @param request the request parameters of CreateMonitorGroupInstances  CreateMonitorGroupInstancesRequest
     * @return CreateMonitorGroupInstancesResponse
     */
    CompletableFuture<CreateMonitorGroupInstancesResponse> createMonitorGroupInstances(CreateMonitorGroupInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>If the policy is valid, no alert notifications are sent for the application group.
     * This topic describes how to create the <code>PauseNotify</code> policy to pause alert notifications for the <code>7301****</code> application group. The StartTime parameter is set to <code>1622949300000</code> and the EndTime parameter is set to <code>1623208500000</code>. This indicates that the policy is valid from <code>2021-06-06 11:15:00 UTC+8</code> to <code>2021-06-09 11:15:00 UTC+8</code>.</p>
     * 
     * @param request the request parameters of CreateMonitorGroupNotifyPolicy  CreateMonitorGroupNotifyPolicyRequest
     * @return CreateMonitorGroupNotifyPolicyResponse
     */
    CompletableFuture<CreateMonitorGroupNotifyPolicyResponse> createMonitorGroupNotifyPolicy(CreateMonitorGroupNotifyPolicyRequest request);

    /**
     * @param request the request parameters of CreateMonitoringAgentProcess  CreateMonitoringAgentProcessRequest
     * @return CreateMonitoringAgentProcessResponse
     */
    CompletableFuture<CreateMonitoringAgentProcessResponse> createMonitoringAgentProcess(CreateMonitoringAgentProcessRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create a site monitoring task named <code>HanZhou_ECS1</code>. The URL that is monitored by the task is <code>https://www.aliyun.com</code> and the type of the task is <code>HTTPS</code>.</p>
     * 
     * @param request the request parameters of CreateSiteMonitor  CreateSiteMonitorRequest
     * @return CreateSiteMonitorResponse
     */
    CompletableFuture<CreateSiteMonitorResponse> createSiteMonitor(CreateSiteMonitorRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>Hybrid Cloud Monitoring is activated. For more information, see <a href="https://help.aliyun.com/document_detail/250773.html">Activate Hybrid Cloud Monitoring</a>.</p>
     * <h3><a href="#"></a>Background information</h3>
     * <p>You can call this operation to obtain the Cursor information and then call the <a href="https://help.aliyun.com/document_detail/2329847.html">BatchExport</a> operation to export the monitoring data.</p>
     * <h3><a href="#"></a>Description</h3>
     * <p>This topic provides an example on how to define the monitoring data of a specified metric for a specified cloud service. In this example, the namespace of the cloud service is set to <code>acs_ecs_dashboard</code>, the metric is set to <code>cpu_idle</code>, the start time is set to <code>1641627000000</code>, and the end time is set to <code>1641645000000</code>. The number of idle CPU cores on your Elastic Compute Service (ECS) instances is measured every 60 seconds from 15:30:00, January 8, 2022 to 20:30:00, January 8, 2022. The <code>Cursor</code> information is returned.</p>
     * 
     * @param request the request parameters of Cursor  CursorRequest
     * @return CursorResponse
     */
    CompletableFuture<CursorResponse> cursor(CursorRequest request);

    /**
     * @param request the request parameters of DeleteContact  DeleteContactRequest
     * @return DeleteContactResponse
     */
    CompletableFuture<DeleteContactResponse> deleteContact(DeleteContactRequest request);

    /**
     * @param request the request parameters of DeleteContactGroup  DeleteContactGroupRequest
     * @return DeleteContactGroupResponse
     */
    CompletableFuture<DeleteContactGroupResponse> deleteContactGroup(DeleteContactGroupRequest request);

    /**
     * @param request the request parameters of DeleteCustomMetric  DeleteCustomMetricRequest
     * @return DeleteCustomMetricResponse
     */
    CompletableFuture<DeleteCustomMetricResponse> deleteCustomMetric(DeleteCustomMetricRequest request);

    /**
     * @param request the request parameters of DeleteDynamicTagGroup  DeleteDynamicTagGroupRequest
     * @return DeleteDynamicTagGroupResponse
     */
    CompletableFuture<DeleteDynamicTagGroupResponse> deleteDynamicTagGroup(DeleteDynamicTagGroupRequest request);

    /**
     * @param request the request parameters of DeleteEventRuleTargets  DeleteEventRuleTargetsRequest
     * @return DeleteEventRuleTargetsResponse
     */
    CompletableFuture<DeleteEventRuleTargetsResponse> deleteEventRuleTargets(DeleteEventRuleTargetsRequest request);

    /**
     * @param request the request parameters of DeleteEventRules  DeleteEventRulesRequest
     * @return DeleteEventRulesResponse
     */
    CompletableFuture<DeleteEventRulesResponse> deleteEventRules(DeleteEventRulesRequest request);

    /**
     * @param request the request parameters of DeleteExporterOutput  DeleteExporterOutputRequest
     * @return DeleteExporterOutputResponse
     */
    CompletableFuture<DeleteExporterOutputResponse> deleteExporterOutput(DeleteExporterOutputRequest request);

    /**
     * @param request the request parameters of DeleteExporterRule  DeleteExporterRuleRequest
     * @return DeleteExporterRuleResponse
     */
    CompletableFuture<DeleteExporterRuleResponse> deleteExporterRule(DeleteExporterRuleRequest request);

    /**
     * @param request the request parameters of DeleteGroupMonitoringAgentProcess  DeleteGroupMonitoringAgentProcessRequest
     * @return DeleteGroupMonitoringAgentProcessResponse
     */
    CompletableFuture<DeleteGroupMonitoringAgentProcessResponse> deleteGroupMonitoringAgentProcess(DeleteGroupMonitoringAgentProcessRequest request);

    /**
     * @param request the request parameters of DeleteHostAvailability  DeleteHostAvailabilityRequest
     * @return DeleteHostAvailabilityResponse
     */
    CompletableFuture<DeleteHostAvailabilityResponse> deleteHostAvailability(DeleteHostAvailabilityRequest request);

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
    CompletableFuture<DeleteHybridMonitorNamespaceResponse> deleteHybridMonitorNamespace(DeleteHybridMonitorNamespaceRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to delete a Logstore group named <code>Logstore_test</code>. The response shows that the Logstore group is deleted.</p>
     * 
     * @param request the request parameters of DeleteHybridMonitorSLSGroup  DeleteHybridMonitorSLSGroupRequest
     * @return DeleteHybridMonitorSLSGroupResponse
     */
    CompletableFuture<DeleteHybridMonitorSLSGroupResponse> deleteHybridMonitorSLSGroup(DeleteHybridMonitorSLSGroupRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to delete a metric import task whose ID is <code>36****</code>. The returned result indicates that the metric import task is deleted.</p>
     * 
     * @param request the request parameters of DeleteHybridMonitorTask  DeleteHybridMonitorTaskRequest
     * @return DeleteHybridMonitorTaskResponse
     */
    CompletableFuture<DeleteHybridMonitorTaskResponse> deleteHybridMonitorTask(DeleteHybridMonitorTaskRequest request);

    /**
     * @param request the request parameters of DeleteLogMonitor  DeleteLogMonitorRequest
     * @return DeleteLogMonitorResponse
     */
    CompletableFuture<DeleteLogMonitorResponse> deleteLogMonitor(DeleteLogMonitorRequest request);

    /**
     * @param request the request parameters of DeleteMetricRuleBlackList  DeleteMetricRuleBlackListRequest
     * @return DeleteMetricRuleBlackListResponse
     */
    CompletableFuture<DeleteMetricRuleBlackListResponse> deleteMetricRuleBlackList(DeleteMetricRuleBlackListRequest request);

    /**
     * @param request the request parameters of DeleteMetricRuleResources  DeleteMetricRuleResourcesRequest
     * @return DeleteMetricRuleResourcesResponse
     */
    CompletableFuture<DeleteMetricRuleResourcesResponse> deleteMetricRuleResources(DeleteMetricRuleResourcesRequest request);

    /**
     * @param request the request parameters of DeleteMetricRuleTargets  DeleteMetricRuleTargetsRequest
     * @return DeleteMetricRuleTargetsResponse
     */
    CompletableFuture<DeleteMetricRuleTargetsResponse> deleteMetricRuleTargets(DeleteMetricRuleTargetsRequest request);

    /**
     * @param request the request parameters of DeleteMetricRuleTemplate  DeleteMetricRuleTemplateRequest
     * @return DeleteMetricRuleTemplateResponse
     */
    CompletableFuture<DeleteMetricRuleTemplateResponse> deleteMetricRuleTemplate(DeleteMetricRuleTemplateRequest request);

    /**
     * @param request the request parameters of DeleteMetricRules  DeleteMetricRulesRequest
     * @return DeleteMetricRulesResponse
     */
    CompletableFuture<DeleteMetricRulesResponse> deleteMetricRules(DeleteMetricRulesRequest request);

    /**
     * @param request the request parameters of DeleteMonitorGroup  DeleteMonitorGroupRequest
     * @return DeleteMonitorGroupResponse
     */
    CompletableFuture<DeleteMonitorGroupResponse> deleteMonitorGroup(DeleteMonitorGroupRequest request);

    /**
     * @param request the request parameters of DeleteMonitorGroupDynamicRule  DeleteMonitorGroupDynamicRuleRequest
     * @return DeleteMonitorGroupDynamicRuleResponse
     */
    CompletableFuture<DeleteMonitorGroupDynamicRuleResponse> deleteMonitorGroupDynamicRule(DeleteMonitorGroupDynamicRuleRequest request);

    /**
     * @param request the request parameters of DeleteMonitorGroupInstances  DeleteMonitorGroupInstancesRequest
     * @return DeleteMonitorGroupInstancesResponse
     */
    CompletableFuture<DeleteMonitorGroupInstancesResponse> deleteMonitorGroupInstances(DeleteMonitorGroupInstancesRequest request);

    /**
     * @param request the request parameters of DeleteMonitorGroupNotifyPolicy  DeleteMonitorGroupNotifyPolicyRequest
     * @return DeleteMonitorGroupNotifyPolicyResponse
     */
    CompletableFuture<DeleteMonitorGroupNotifyPolicyResponse> deleteMonitorGroupNotifyPolicy(DeleteMonitorGroupNotifyPolicyRequest request);

    /**
     * @param request the request parameters of DeleteMonitoringAgentProcess  DeleteMonitoringAgentProcessRequest
     * @return DeleteMonitoringAgentProcessResponse
     */
    CompletableFuture<DeleteMonitoringAgentProcessResponse> deleteMonitoringAgentProcess(DeleteMonitoringAgentProcessRequest request);

    /**
     * @param request the request parameters of DeleteSiteMonitors  DeleteSiteMonitorsRequest
     * @return DeleteSiteMonitorsResponse
     */
    CompletableFuture<DeleteSiteMonitorsResponse> deleteSiteMonitors(DeleteSiteMonitorsRequest request);

    /**
     * @param request the request parameters of DescribeActiveMetricRuleList  DescribeActiveMetricRuleListRequest
     * @return DescribeActiveMetricRuleListResponse
     */
    CompletableFuture<DescribeActiveMetricRuleListResponse> describeActiveMetricRuleList(DescribeActiveMetricRuleListRequest request);

    /**
     * @deprecated OpenAPI DescribeAlertHistoryList is deprecated, please use Cms::2019-01-01::DescribeAlertLogList instead.  * @description This API operation is no longer maintained. We recommend that you call the [DescribeAlertLogList](https://help.aliyun.com/document_detail/201087.html) operation.
     * 
     * @param request the request parameters of DescribeAlertHistoryList  DescribeAlertHistoryListRequest
     * @return DescribeAlertHistoryListResponse
     */
    @Deprecated
    CompletableFuture<DescribeAlertHistoryListResponse> describeAlertHistoryList(DescribeAlertHistoryListRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the statistics of alert logs.
     * This topic provides an example on how to query the statistics of alert logs for Elastic Compute Service (ECS) based on the <code>product</code> dimension.</p>
     * 
     * @param request the request parameters of DescribeAlertLogCount  DescribeAlertLogCountRequest
     * @return DescribeAlertLogCountResponse
     */
    CompletableFuture<DescribeAlertLogCountResponse> describeAlertLogCount(DescribeAlertLogCountRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the number of alert logs for Elastic Compute Service (ECS) based on the <code>product</code> dimension.</p>
     * 
     * @param request the request parameters of DescribeAlertLogHistogram  DescribeAlertLogHistogramRequest
     * @return DescribeAlertLogHistogramResponse
     */
    CompletableFuture<DescribeAlertLogHistogramResponse> describeAlertLogHistogram(DescribeAlertLogHistogramRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the operation to query only the alert logs within the last year.
     * This topic provides an example to show how to query the alert logs of Elastic Compute Service (ECS) based on the <code>product</code> dimension.</p>
     * 
     * @param request the request parameters of DescribeAlertLogList  DescribeAlertLogListRequest
     * @return DescribeAlertLogListResponse
     */
    CompletableFuture<DescribeAlertLogListResponse> describeAlertLogList(DescribeAlertLogListRequest request);

    /**
     * @param request the request parameters of DescribeAlertingMetricRuleResources  DescribeAlertingMetricRuleResourcesRequest
     * @return DescribeAlertingMetricRuleResourcesResponse
     */
    CompletableFuture<DescribeAlertingMetricRuleResourcesResponse> describeAlertingMetricRuleResources(DescribeAlertingMetricRuleResourcesRequest request);

    /**
     * @param request the request parameters of DescribeContactGroupList  DescribeContactGroupListRequest
     * @return DescribeContactGroupListResponse
     */
    CompletableFuture<DescribeContactGroupListResponse> describeContactGroupList(DescribeContactGroupListRequest request);

    /**
     * @param request the request parameters of DescribeContactList  DescribeContactListRequest
     * @return DescribeContactListResponse
     */
    CompletableFuture<DescribeContactListResponse> describeContactList(DescribeContactListRequest request);

    /**
     * @param request the request parameters of DescribeContactListByContactGroup  DescribeContactListByContactGroupRequest
     * @return DescribeContactListByContactGroupResponse
     */
    CompletableFuture<DescribeContactListByContactGroupResponse> describeContactListByContactGroup(DescribeContactListByContactGroupRequest request);

    /**
     * @param request the request parameters of DescribeCustomEventAttribute  DescribeCustomEventAttributeRequest
     * @return DescribeCustomEventAttributeResponse
     */
    CompletableFuture<DescribeCustomEventAttributeResponse> describeCustomEventAttribute(DescribeCustomEventAttributeRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> This operation counts the number of times that a custom event occurred for each service.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeCustomEventCount  DescribeCustomEventCountRequest
     * @return DescribeCustomEventCountResponse
     */
    CompletableFuture<DescribeCustomEventCountResponse> describeCustomEventCount(DescribeCustomEventCountRequest request);

    /**
     * @param request the request parameters of DescribeCustomEventHistogram  DescribeCustomEventHistogramRequest
     * @return DescribeCustomEventHistogramResponse
     */
    CompletableFuture<DescribeCustomEventHistogramResponse> describeCustomEventHistogram(DescribeCustomEventHistogramRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call the DescribeMetricList operation to query the metrics of cloud services. For more information, see <a href="https://help.aliyun.com/document_detail/51936.html">DescribeMetricList</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeCustomMetricList  DescribeCustomMetricListRequest
     * @return DescribeCustomMetricListResponse
     */
    CompletableFuture<DescribeCustomMetricListResponse> describeCustomMetricList(DescribeCustomMetricListRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example to show how to query tag rules that are related to <code>tagkey1</code>. The sample responses indicate that two tag rules are found. The rule IDs are <code>1536df65-a719-429d-8813-73cc40d7****</code> and <code>56e8cebb-b3d7-4a91-9880-78a8c84f****</code>.</p>
     * 
     * @param request the request parameters of DescribeDynamicTagRuleList  DescribeDynamicTagRuleListRequest
     * @return DescribeDynamicTagRuleListResponse
     */
    CompletableFuture<DescribeDynamicTagRuleListResponse> describeDynamicTagRuleList(DescribeDynamicTagRuleListRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example to show how to query the details of an event-triggered alert rule named <code>testRule</code>.</p>
     * 
     * @param request the request parameters of DescribeEventRuleAttribute  DescribeEventRuleAttributeRequest
     * @return DescribeEventRuleAttributeResponse
     */
    CompletableFuture<DescribeEventRuleAttributeResponse> describeEventRuleAttribute(DescribeEventRuleAttributeRequest request);

    /**
     * @param request the request parameters of DescribeEventRuleList  DescribeEventRuleListRequest
     * @return DescribeEventRuleListResponse
     */
    CompletableFuture<DescribeEventRuleListResponse> describeEventRuleList(DescribeEventRuleListRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example to show how to query the details of an event-triggered alert rule named <code>testRule</code>.</p>
     * 
     * @param request the request parameters of DescribeEventRuleTargetList  DescribeEventRuleTargetListRequest
     * @return DescribeEventRuleTargetListResponse
     */
    CompletableFuture<DescribeEventRuleTargetListResponse> describeEventRuleTargetList(DescribeEventRuleTargetListRequest request);

    /**
     * @param request the request parameters of DescribeExporterOutputList  DescribeExporterOutputListRequest
     * @return DescribeExporterOutputListResponse
     */
    CompletableFuture<DescribeExporterOutputListResponse> describeExporterOutputList(DescribeExporterOutputListRequest request);

    /**
     * @param request the request parameters of DescribeExporterRuleList  DescribeExporterRuleListRequest
     * @return DescribeExporterRuleListResponse
     */
    CompletableFuture<DescribeExporterRuleListResponse> describeExporterRuleList(DescribeExporterRuleListRequest request);

    /**
     * <b>description</b> :
     * <p>You can create a process monitoring task to monitor all or the specified Elastic Compute Service (ECS) instances in an application group and configure alert rules for the process monitoring task.</p>
     * 
     * @param request the request parameters of DescribeGroupMonitoringAgentProcess  DescribeGroupMonitoringAgentProcessRequest
     * @return DescribeGroupMonitoringAgentProcessResponse
     */
    CompletableFuture<DescribeGroupMonitoringAgentProcessResponse> describeGroupMonitoringAgentProcess(DescribeGroupMonitoringAgentProcessRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example to show how to query all the availability monitoring tasks of your Alibaba Cloud account. The sample responses indicate that the account has one availability monitoring task named <code>ecs_instance</code>.</p>
     * 
     * @param request the request parameters of DescribeHostAvailabilityList  DescribeHostAvailabilityListRequest
     * @return DescribeHostAvailabilityListResponse
     */
    CompletableFuture<DescribeHostAvailabilityListResponse> describeHostAvailabilityList(DescribeHostAvailabilityListRequest request);

    /**
     * <b>description</b> :
     * <h1><a href="#"></a>Prerequisites</h1>
     * <p>Hybrid Cloud Monitoring is activated. For more information, see <a href="https://help.aliyun.com/document_detail/250773.html">Activate Hybrid Cloud Monitoring</a>.</p>
     * <h1><a href="#"></a>Limits</h1>
     * <p>The size of monitoring data that is returned in each call cannot exceed 1.5 MB. If the returned data reaches the upper limit, the query fails. You must reset the query conditions.</p>
     * <h1><a href="#"></a>Description</h1>
     * <p>This topic provides an example to show how to query the monitoring data of the <code>AliyunEcs_cpu_total</code> metric in the <code>default-aliyun</code> namespace from <code>1653804865</code> (14:14:25 on May 29, 2022) to <code>1653805225</code> (14:20:25 on May 29, 2022).</p>
     * 
     * @param request the request parameters of DescribeHybridMonitorDataList  DescribeHybridMonitorDataListRequest
     * @return DescribeHybridMonitorDataListResponse
     */
    CompletableFuture<DescribeHybridMonitorDataListResponse> describeHybridMonitorDataList(DescribeHybridMonitorDataListRequest request);

    /**
     * <b>description</b> :
     * <p>In this example, all namespaces within the current account are queried. The response shows that the current account has only one namespace named <code>aliyun-test</code>.</p>
     * 
     * @param request the request parameters of DescribeHybridMonitorNamespaceList  DescribeHybridMonitorNamespaceListRequest
     * @return DescribeHybridMonitorNamespaceListResponse
     */
    CompletableFuture<DescribeHybridMonitorNamespaceListResponse> describeHybridMonitorNamespaceList(DescribeHybridMonitorNamespaceListRequest request);

    /**
     * <b>description</b> :
     * <p>In this example, all Logstore groups within the current account are queried. The response shows that the current account has two Logstore groups: <code>Logstore_test</code> and <code>Logstore_aliyun</code>.</p>
     * 
     * @param request the request parameters of DescribeHybridMonitorSLSGroup  DescribeHybridMonitorSLSGroupRequest
     * @return DescribeHybridMonitorSLSGroupResponse
     */
    CompletableFuture<DescribeHybridMonitorSLSGroupResponse> describeHybridMonitorSLSGroup(DescribeHybridMonitorSLSGroupRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query all metric import tasks that belong to the current Alibaba Cloud account. The returned result indicates that the current account has only one metric import task. The metric import task is named <code>aliyun_task</code>.</p>
     * 
     * @param request the request parameters of DescribeHybridMonitorTaskList  DescribeHybridMonitorTaskListRequest
     * @return DescribeHybridMonitorTaskListResponse
     */
    CompletableFuture<DescribeHybridMonitorTaskListResponse> describeHybridMonitorTaskList(DescribeHybridMonitorTaskListRequest request);

    /**
     * @param request the request parameters of DescribeLogMonitorAttribute  DescribeLogMonitorAttributeRequest
     * @return DescribeLogMonitorAttributeResponse
     */
    CompletableFuture<DescribeLogMonitorAttributeResponse> describeLogMonitorAttribute(DescribeLogMonitorAttributeRequest request);

    /**
     * @param request the request parameters of DescribeLogMonitorList  DescribeLogMonitorListRequest
     * @return DescribeLogMonitorListResponse
     */
    CompletableFuture<DescribeLogMonitorListResponse> describeLogMonitorList(DescribeLogMonitorListRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Limits</h3>
     * <p>Each API operation can be called up to 10 times per second. An Alibaba Cloud account and the RAM users within the account share the quota.</p>
     * <h3><a href="#"></a>Description</h3>
     * <blockquote>
     * <p> Different from <a href="https://help.aliyun.com/document_detail/51936.html">DescribeMetricList</a>, the DescribeMetricData operation provides statistical features. You can set the Dimension parameter to <code>{&quot;instanceId&quot;: &quot;i-abcdefgh12****&quot;}</code> to aggregate all data of your Alibaba Cloud account.
     * This topic provides an example to show how to query the monitoring data of the <code>cpu_idle</code> metric for Elastic Compute Service (ECS). The namespace of ECS is <code>acs_ecs_dashboard</code>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeMetricData  DescribeMetricDataRequest
     * @return DescribeMetricDataResponse
     */
    CompletableFuture<DescribeMetricDataResponse> describeMetricData(DescribeMetricDataRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Limits</h3>
     * <p>Each API operation can be called up to 50 times per second. An Alibaba Cloud account and the RAM users within the account share the quota.</p>
     * <blockquote>
     * <p> If <code>Throttling.User</code> or <code>Request was denied due to user flow control</code> is returned when you call an API operation, the API operation is throttled. For more information about how to handle the issue, see <a href="https://help.aliyun.com/document_detail/2615031.html">How do I handle the throttling of a query API?</a></p>
     * </blockquote>
     * <h3><a href="#"></a>Precautions</h3>
     * <p>The storage duration of the monitoring data of each cloud service is related to the <code>Period</code> parameter (statistical period). A larger value of the <code>Period</code> parameter indicates that the monitoring data is distributed in a larger time range and the storage duration of the monitoring data is longer. The following list describes the specific relationships:</p>
     * <ul>
     * <li>If the value of the <code>Period</code> parameter is less than 60 seconds, the storage duration is seven days.</li>
     * <li>If the value of the <code>Period</code> parameter is 60 seconds, the storage duration is 31 days.</li>
     * <li>If the value of the <code>Period</code> parameter is 300 seconds, the storage duration is 91 days.</li>
     * </ul>
     * <h3><a href="#"></a>Description</h3>
     * <p>This topic provides an example on how to query the latest monitoring data of the <code>CPUUtilization</code> metric for Elastic Compute Service (ECS). The namespace of ECS is <code>acs_ecs_dashboard</code>. The returned result indicates that the monitoring data for the instance <code>i-abcdefgh12****</code> of the account <code>123456789876****</code> is queried at an interval of 60 seconds. The maximum, minimum, and average values of the metric are 100, 93.1, and 99.52.</p>
     * 
     * @param request the request parameters of DescribeMetricLast  DescribeMetricLastRequest
     * @return DescribeMetricLastResponse
     */
    CompletableFuture<DescribeMetricLastResponse> describeMetricLast(DescribeMetricLastRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each API operation can be called up to 50 times per second. An Alibaba Cloud account and the RAM users within the account share the quota. </p>
     * <blockquote>
     * <p>This topic provides an example to show how to query the monitoring data of the <code>cpu_idle</code> metric for Elastic Compute Service (ECS). The namespace of ECS is <code>acs_ecs_dashboard</code>. The returned result indicates that the monitoring data for the instance <code>i-abcdefgh12****</code> of the account <code>120886317861****</code> is queried at an interval of 60 seconds. The maximum, minimum, and average values of the metric are 100, 93.1, and 99.52.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeMetricList  DescribeMetricListRequest
     * @return DescribeMetricListResponse
     */
    CompletableFuture<DescribeMetricListResponse> describeMetricList(DescribeMetricListRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is used together with DescribeMetricList and DescribeMetricLast. For more information, see <a href="https://help.aliyun.com/document_detail/51936.html">DescribeMetricList</a> and <a href="https://help.aliyun.com/document_detail/51939.html">DescribeMetricLast</a>.</p>
     * 
     * @param request the request parameters of DescribeMetricMetaList  DescribeMetricMetaListRequest
     * @return DescribeMetricMetaListResponse
     */
    CompletableFuture<DescribeMetricMetaListResponse> describeMetricMetaList(DescribeMetricMetaListRequest request);

    /**
     * @param request the request parameters of DescribeMetricRuleBlackList  DescribeMetricRuleBlackListRequest
     * @return DescribeMetricRuleBlackListResponse
     */
    CompletableFuture<DescribeMetricRuleBlackListResponse> describeMetricRuleBlackList(DescribeMetricRuleBlackListRequest request);

    /**
     * @param request the request parameters of DescribeMetricRuleCount  DescribeMetricRuleCountRequest
     * @return DescribeMetricRuleCountResponse
     */
    CompletableFuture<DescribeMetricRuleCountResponse> describeMetricRuleCount(DescribeMetricRuleCountRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query all alert rules within your Alibaba Cloud account. The returned result shows that only one alert rule is found. The name of the alert rule is <code>Rule_01</code> and the ID is <code>applyTemplate344cfd42-0f32-4fd6-805a-88d7908a****</code>.</p>
     * 
     * @param request the request parameters of DescribeMetricRuleList  DescribeMetricRuleListRequest
     * @return DescribeMetricRuleListResponse
     */
    CompletableFuture<DescribeMetricRuleListResponse> describeMetricRuleList(DescribeMetricRuleListRequest request);

    /**
     * <b>description</b> :
     * <h2>Limit</h2>
     * <p>This operation supports only Message Service (MNS) resources. </p>
     * <blockquote>
     * <p>This topic provides an example on how to query the resources that are associated with an alert rule whose ID is <code>ae06917_75a8c43178ab66****</code>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeMetricRuleTargets  DescribeMetricRuleTargetsRequest
     * @return DescribeMetricRuleTargetsResponse
     */
    CompletableFuture<DescribeMetricRuleTargetsResponse> describeMetricRuleTargets(DescribeMetricRuleTargetsRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the details of an alert template whose ID is <code>70****</code>.</p>
     * 
     * @param request the request parameters of DescribeMetricRuleTemplateAttribute  DescribeMetricRuleTemplateAttributeRequest
     * @return DescribeMetricRuleTemplateAttributeResponse
     */
    CompletableFuture<DescribeMetricRuleTemplateAttributeResponse> describeMetricRuleTemplateAttribute(DescribeMetricRuleTemplateAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query alert templates. In this example, the following alert templates are returned in the response: <code>ECS_Template1</code> and <code>ECS_Template2</code>.</p>
     * 
     * @param request the request parameters of DescribeMetricRuleTemplateList  DescribeMetricRuleTemplateListRequest
     * @return DescribeMetricRuleTemplateListResponse
     */
    CompletableFuture<DescribeMetricRuleTemplateListResponse> describeMetricRuleTemplateList(DescribeMetricRuleTemplateListRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Limits</h3>
     * <p>Each API operation can be called up to 10 times per second. An Alibaba Cloud account and the RAM users within the account share the quota.</p>
     * <h3><a href="#"></a>Precautions</h3>
     * <p>The storage duration of the monitoring data of each cloud service is related to the <code>Period</code> parameter (statistical period). A larger value of the <code>Period</code> parameter indicates that the monitoring data is distributed in a larger time range and the storage duration of the monitoring data is longer. The following list describes the specific relationships:</p>
     * <ul>
     * <li>If the value of the <code>Period</code> parameter is less than 60 seconds, the storage duration is seven days.</li>
     * <li>If the value of the <code>Period</code> parameter is 60 seconds, the storage duration is 31 days.</li>
     * <li>If the value of the <code>Period</code> parameter is 300 seconds, the storage duration is 91 days.</li>
     * </ul>
     * <h3><a href="#"></a>Description</h3>
     * <p>This topic provides an example to show how to query the monitoring data of the <code>cpu_idle</code> metric in the last 60 seconds for Elastic Compute Service (ECS). The namespace of ECS is <code>acs_ecs_dashboard</code>. The monitoring data is sorted in the descending order based on the <code>Average</code> field.</p>
     * 
     * @param request the request parameters of DescribeMetricTop  DescribeMetricTopRequest
     * @return DescribeMetricTopResponse
     */
    CompletableFuture<DescribeMetricTopResponse> describeMetricTop(DescribeMetricTopRequest request);

    /**
     * @param request the request parameters of DescribeMonitorGroupCategories  DescribeMonitorGroupCategoriesRequest
     * @return DescribeMonitorGroupCategoriesResponse
     */
    CompletableFuture<DescribeMonitorGroupCategoriesResponse> describeMonitorGroupCategories(DescribeMonitorGroupCategoriesRequest request);

    /**
     * @param request the request parameters of DescribeMonitorGroupDynamicRules  DescribeMonitorGroupDynamicRulesRequest
     * @return DescribeMonitorGroupDynamicRulesResponse
     */
    CompletableFuture<DescribeMonitorGroupDynamicRulesResponse> describeMonitorGroupDynamicRules(DescribeMonitorGroupDynamicRulesRequest request);

    /**
     * @param request the request parameters of DescribeMonitorGroupInstanceAttribute  DescribeMonitorGroupInstanceAttributeRequest
     * @return DescribeMonitorGroupInstanceAttributeResponse
     */
    CompletableFuture<DescribeMonitorGroupInstanceAttributeResponse> describeMonitorGroupInstanceAttribute(DescribeMonitorGroupInstanceAttributeRequest request);

    /**
     * @param request the request parameters of DescribeMonitorGroupInstances  DescribeMonitorGroupInstancesRequest
     * @return DescribeMonitorGroupInstancesResponse
     */
    CompletableFuture<DescribeMonitorGroupInstancesResponse> describeMonitorGroupInstances(DescribeMonitorGroupInstancesRequest request);

    /**
     * @param request the request parameters of DescribeMonitorGroupNotifyPolicyList  DescribeMonitorGroupNotifyPolicyListRequest
     * @return DescribeMonitorGroupNotifyPolicyListResponse
     */
    CompletableFuture<DescribeMonitorGroupNotifyPolicyListResponse> describeMonitorGroupNotifyPolicyList(DescribeMonitorGroupNotifyPolicyListRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to query the application groups of the current account. The response shows that the current account has two application groups: <code>testGroup124</code> and <code>test123</code>.</p>
     * 
     * @param request the request parameters of DescribeMonitorGroups  DescribeMonitorGroupsRequest
     * @return DescribeMonitorGroupsResponse
     */
    CompletableFuture<DescribeMonitorGroupsResponse> describeMonitorGroups(DescribeMonitorGroupsRequest request);

    /**
     * @param request the request parameters of DescribeMonitorResourceQuotaAttribute  DescribeMonitorResourceQuotaAttributeRequest
     * @return DescribeMonitorResourceQuotaAttributeResponse
     */
    CompletableFuture<DescribeMonitorResourceQuotaAttributeResponse> describeMonitorResourceQuotaAttribute(DescribeMonitorResourceQuotaAttributeRequest request);

    /**
     * @param request the request parameters of DescribeMonitoringAgentAccessKey  DescribeMonitoringAgentAccessKeyRequest
     * @return DescribeMonitoringAgentAccessKeyResponse
     */
    CompletableFuture<DescribeMonitoringAgentAccessKeyResponse> describeMonitoringAgentAccessKey(DescribeMonitoringAgentAccessKeyRequest request);

    /**
     * @param request the request parameters of DescribeMonitoringAgentConfig  DescribeMonitoringAgentConfigRequest
     * @return DescribeMonitoringAgentConfigResponse
     */
    CompletableFuture<DescribeMonitoringAgentConfigResponse> describeMonitoringAgentConfig(DescribeMonitoringAgentConfigRequest request);

    /**
     * @param request the request parameters of DescribeMonitoringAgentHosts  DescribeMonitoringAgentHostsRequest
     * @return DescribeMonitoringAgentHostsResponse
     */
    CompletableFuture<DescribeMonitoringAgentHostsResponse> describeMonitoringAgentHosts(DescribeMonitoringAgentHostsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> Before you call this operation, call the CreateMonitoringAgentProcess operation to create processes. For more information, see <a href="https://help.aliyun.com/document_detail/114951.html~">CreateMonitoringAgentProcess</a>.
     * This topic provides an example of how to query the processes of the <code>i-hp3hl3cx1pbahzy8****</code> instance. The response indicates the details of the <code>NGINX</code> and <code>HTTP</code> processes.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeMonitoringAgentProcesses  DescribeMonitoringAgentProcessesRequest
     * @return DescribeMonitoringAgentProcessesResponse
     */
    CompletableFuture<DescribeMonitoringAgentProcessesResponse> describeMonitoringAgentProcesses(DescribeMonitoringAgentProcessesRequest request);

    /**
     * <b>description</b> :
     * <p>This topic describes how to query the status of the CloudMonitor agent that is installed on the <code>i-hp3dunahluwajv6f****</code> instance. The result indicates that the CloudMonitor agent is in the <code>running</code> state.</p>
     * 
     * @param request the request parameters of DescribeMonitoringAgentStatuses  DescribeMonitoringAgentStatusesRequest
     * @return DescribeMonitoringAgentStatusesResponse
     */
    CompletableFuture<DescribeMonitoringAgentStatusesResponse> describeMonitoringAgentStatuses(DescribeMonitoringAgentStatusesRequest request);

    /**
     * @param request the request parameters of DescribeMonitoringConfig  DescribeMonitoringConfigRequest
     * @return DescribeMonitoringConfigResponse
     */
    CompletableFuture<DescribeMonitoringConfigResponse> describeMonitoringConfig(DescribeMonitoringConfigRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> If a tag is attached to multiple cloud resources in the region, the key of the tag is returned only once.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeProductResourceTagKeyList  DescribeProductResourceTagKeyListRequest
     * @return DescribeProductResourceTagKeyListResponse
     */
    CompletableFuture<DescribeProductResourceTagKeyListResponse> describeProductResourceTagKeyList(DescribeProductResourceTagKeyListRequest request);

    /**
     * @param request the request parameters of DescribeProductsOfActiveMetricRule  DescribeProductsOfActiveMetricRuleRequest
     * @return DescribeProductsOfActiveMetricRuleResponse
     */
    CompletableFuture<DescribeProductsOfActiveMetricRuleResponse> describeProductsOfActiveMetricRule(DescribeProductsOfActiveMetricRuleRequest request);

    /**
     * <b>description</b> :
     * <p>The information obtained by this operation includes the service description, namespace, and tags.</p>
     * 
     * @param request the request parameters of DescribeProjectMeta  DescribeProjectMetaRequest
     * @return DescribeProjectMetaResponse
     */
    CompletableFuture<DescribeProjectMetaResponse> describeProjectMeta(DescribeProjectMetaRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the details of a site monitoring task whose ID is <code>cc641dff-c19d-45f3-ad0a-818a0c4f****</code>. The returned result indicates that the task name is <code>test123</code>, the URL that is monitored by the task is <code>https://aliyun.com</code>, and the name of the carrier is <code>Alibaba</code>.</p>
     * 
     * @param request the request parameters of DescribeSiteMonitorAttribute  DescribeSiteMonitorAttributeRequest
     * @return DescribeSiteMonitorAttributeResponse
     */
    CompletableFuture<DescribeSiteMonitorAttributeResponse> describeSiteMonitorAttribute(DescribeSiteMonitorAttributeRequest request);

    /**
     * @param request the request parameters of DescribeSiteMonitorData  DescribeSiteMonitorDataRequest
     * @return DescribeSiteMonitorDataResponse
     */
    CompletableFuture<DescribeSiteMonitorDataResponse> describeSiteMonitorData(DescribeSiteMonitorDataRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the detection points that are provided by China Unicom in Guiyang.</p>
     * 
     * @param request the request parameters of DescribeSiteMonitorISPCityList  DescribeSiteMonitorISPCityListRequest
     * @return DescribeSiteMonitorISPCityListResponse
     */
    CompletableFuture<DescribeSiteMonitorISPCityListResponse> describeSiteMonitorISPCityList(DescribeSiteMonitorISPCityListRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query all the site monitoring tasks of your Alibaba Cloud account. In this example, the returned result indicates that the Alibaba Cloud account has one site monitoring task named <code>HanZhou_ECS2</code>.</p>
     * 
     * @param request the request parameters of DescribeSiteMonitorList  DescribeSiteMonitorListRequest
     * @return DescribeSiteMonitorListResponse
     */
    CompletableFuture<DescribeSiteMonitorListResponse> describeSiteMonitorList(DescribeSiteMonitorListRequest request);

    /**
     * <b>description</b> :
     * <p>You can create an instant test task only by using the Alibaba Cloud account that you used to enable Network Analysis and Monitoring.
     * This topic provides an example to show how to query the logs of an instant test task whose ID is <code>afa5c3ce-f944-4363-9edb-ce919a29****</code>.</p>
     * 
     * @param request the request parameters of DescribeSiteMonitorLog  DescribeSiteMonitorLogRequest
     * @return DescribeSiteMonitorLogResponse
     */
    CompletableFuture<DescribeSiteMonitorLogResponse> describeSiteMonitorLog(DescribeSiteMonitorLogRequest request);

    /**
     * @param request the request parameters of DescribeSiteMonitorQuota  DescribeSiteMonitorQuotaRequest
     * @return DescribeSiteMonitorQuotaResponse
     */
    CompletableFuture<DescribeSiteMonitorQuotaResponse> describeSiteMonitorQuota(DescribeSiteMonitorQuotaRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the statistics of the <code>Availability</code> metric for a site monitoring task whose ID is <code>ef4cdc8b-9dc7-43e7-810e-f950e56c****</code>. The result indicates that the availability rate of the site is <code>100%</code>.</p>
     * 
     * @param request the request parameters of DescribeSiteMonitorStatistics  DescribeSiteMonitorStatisticsRequest
     * @return DescribeSiteMonitorStatisticsResponse
     */
    CompletableFuture<DescribeSiteMonitorStatisticsResponse> describeSiteMonitorStatistics(DescribeSiteMonitorStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeSyntheticProbeList  DescribeSyntheticProbeListRequest
     * @return DescribeSyntheticProbeListResponse
     */
    CompletableFuture<DescribeSyntheticProbeListResponse> describeSyntheticProbeList(DescribeSyntheticProbeListRequest request);

    /**
     * @param request the request parameters of DescribeSystemEventAttribute  DescribeSystemEventAttributeRequest
     * @return DescribeSystemEventAttributeResponse
     */
    CompletableFuture<DescribeSystemEventAttributeResponse> describeSystemEventAttribute(DescribeSystemEventAttributeRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Background information</h3>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/114972.html">DescribeSystemEventMetaList</a> operation to query the cloud services supported by CloudMonitor and their system events.</p>
     * <h3><a href="#"></a>Description</h3>
     * <p>This topic provides an example on how to query the number of times that a system event of <code>Elastic Compute Service (ECS)</code> has occurred. The returned result shows that the specified system event has occurred three times.</p>
     * 
     * @param request the request parameters of DescribeSystemEventCount  DescribeSystemEventCountRequest
     * @return DescribeSystemEventCountResponse
     */
    CompletableFuture<DescribeSystemEventCountResponse> describeSystemEventCount(DescribeSystemEventCountRequest request);

    /**
     * @param request the request parameters of DescribeSystemEventHistogram  DescribeSystemEventHistogramRequest
     * @return DescribeSystemEventHistogramResponse
     */
    CompletableFuture<DescribeSystemEventHistogramResponse> describeSystemEventHistogram(DescribeSystemEventHistogramRequest request);

    /**
     * @param request the request parameters of DescribeSystemEventMetaList  DescribeSystemEventMetaListRequest
     * @return DescribeSystemEventMetaListResponse
     */
    CompletableFuture<DescribeSystemEventMetaListResponse> describeSystemEventMetaList(DescribeSystemEventMetaListRequest request);

    /**
     * @param request the request parameters of DescribeTagKeyList  DescribeTagKeyListRequest
     * @return DescribeTagKeyListResponse
     */
    CompletableFuture<DescribeTagKeyListResponse> describeTagKeyList(DescribeTagKeyListRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to query the tag values corresponding to <code>tagKey1</code>. The return results are <code>tagValue1</code> and <code>tagValue2</code>.</p>
     * 
     * @param request the request parameters of DescribeTagValueList  DescribeTagValueListRequest
     * @return DescribeTagValueListResponse
     */
    CompletableFuture<DescribeTagValueListResponse> describeTagValueList(DescribeTagValueListRequest request);

    /**
     * @param request the request parameters of DescribeUnhealthyHostAvailability  DescribeUnhealthyHostAvailabilityRequest
     * @return DescribeUnhealthyHostAvailabilityResponse
     */
    CompletableFuture<DescribeUnhealthyHostAvailabilityResponse> describeUnhealthyHostAvailability(DescribeUnhealthyHostAvailabilityRequest request);

    /**
     * @param request the request parameters of DisableActiveMetricRule  DisableActiveMetricRuleRequest
     * @return DisableActiveMetricRuleResponse
     */
    CompletableFuture<DisableActiveMetricRuleResponse> disableActiveMetricRule(DisableActiveMetricRuleRequest request);

    /**
     * @param request the request parameters of DisableEventRules  DisableEventRulesRequest
     * @return DisableEventRulesResponse
     */
    CompletableFuture<DisableEventRulesResponse> disableEventRules(DisableEventRulesRequest request);

    /**
     * @param request the request parameters of DisableHostAvailability  DisableHostAvailabilityRequest
     * @return DisableHostAvailabilityResponse
     */
    CompletableFuture<DisableHostAvailabilityResponse> disableHostAvailability(DisableHostAvailabilityRequest request);

    /**
     * @param request the request parameters of DisableMetricRules  DisableMetricRulesRequest
     * @return DisableMetricRulesResponse
     */
    CompletableFuture<DisableMetricRulesResponse> disableMetricRules(DisableMetricRulesRequest request);

    /**
     * @param request the request parameters of DisableSiteMonitors  DisableSiteMonitorsRequest
     * @return DisableSiteMonitorsResponse
     */
    CompletableFuture<DisableSiteMonitorsResponse> disableSiteMonitors(DisableSiteMonitorsRequest request);

    /**
     * @param request the request parameters of EnableActiveMetricRule  EnableActiveMetricRuleRequest
     * @return EnableActiveMetricRuleResponse
     */
    CompletableFuture<EnableActiveMetricRuleResponse> enableActiveMetricRule(EnableActiveMetricRuleRequest request);

    /**
     * @param request the request parameters of EnableEventRules  EnableEventRulesRequest
     * @return EnableEventRulesResponse
     */
    CompletableFuture<EnableEventRulesResponse> enableEventRules(EnableEventRulesRequest request);

    /**
     * @param request the request parameters of EnableHostAvailability  EnableHostAvailabilityRequest
     * @return EnableHostAvailabilityResponse
     */
    CompletableFuture<EnableHostAvailabilityResponse> enableHostAvailability(EnableHostAvailabilityRequest request);

    /**
     * @param request the request parameters of EnableMetricRuleBlackList  EnableMetricRuleBlackListRequest
     * @return EnableMetricRuleBlackListResponse
     */
    CompletableFuture<EnableMetricRuleBlackListResponse> enableMetricRuleBlackList(EnableMetricRuleBlackListRequest request);

    /**
     * @param request the request parameters of EnableMetricRules  EnableMetricRulesRequest
     * @return EnableMetricRulesResponse
     */
    CompletableFuture<EnableMetricRulesResponse> enableMetricRules(EnableMetricRulesRequest request);

    /**
     * @param request the request parameters of EnableSiteMonitors  EnableSiteMonitorsRequest
     * @return EnableSiteMonitorsResponse
     */
    CompletableFuture<EnableSiteMonitorsResponse> enableSiteMonitors(EnableSiteMonitorsRequest request);

    /**
     * <b>description</b> :
     * <h2>Prerequisites</h2>
     * <p>The Cloud Assistant client is installed on an ECS instance. For more information about how to install the Cloud Assistant client, see <a href="https://help.aliyun.com/document_detail/64601.html">Overview</a>.</p>
     * 
     * @param request the request parameters of InstallMonitoringAgent  InstallMonitoringAgentRequest
     * @return InstallMonitoringAgentResponse
     */
    CompletableFuture<InstallMonitoringAgentResponse> installMonitoringAgent(InstallMonitoringAgentRequest request);

    /**
     * @param request the request parameters of ModifyGroupMonitoringAgentProcess  ModifyGroupMonitoringAgentProcessRequest
     * @return ModifyGroupMonitoringAgentProcessResponse
     */
    CompletableFuture<ModifyGroupMonitoringAgentProcessResponse> modifyGroupMonitoringAgentProcess(ModifyGroupMonitoringAgentProcessRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to change the name of an availability monitoring task named <code>12345</code> in an application group named <code>123456</code> to <code>task2</code>.</p>
     * 
     * @param request the request parameters of ModifyHostAvailability  ModifyHostAvailabilityRequest
     * @return ModifyHostAvailabilityResponse
     */
    CompletableFuture<ModifyHostAvailabilityResponse> modifyHostAvailability(ModifyHostAvailabilityRequest request);

    /**
     * <b>description</b> :
     * <hr>
     * 
     * @param request the request parameters of ModifyHostInfo  ModifyHostInfoRequest
     * @return ModifyHostInfoResponse
     */
    CompletableFuture<ModifyHostInfoResponse> modifyHostInfo(ModifyHostInfoRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to change the data retention period of the <code>aliyun</code> namespace to <code>cms.s1.2xlarge</code>. The response shows that the namespace is modified.</p>
     * 
     * @param request the request parameters of ModifyHybridMonitorNamespace  ModifyHybridMonitorNamespaceRequest
     * @return ModifyHybridMonitorNamespaceResponse
     */
    CompletableFuture<ModifyHybridMonitorNamespaceResponse> modifyHybridMonitorNamespace(ModifyHybridMonitorNamespaceRequest request);

    /**
     * <b>description</b> :
     * <p>In this example, a Logstore group named <code>Logstore_test</code> is modified. The Logstore of the <code>aliyun-project</code> project in the <code>cn-hangzhou</code> region is changed to <code>Logstore-aliyun-all</code>. The response shows that the Logstore group is modified.</p>
     * 
     * @param request the request parameters of ModifyHybridMonitorSLSGroup  ModifyHybridMonitorSLSGroupRequest
     * @return ModifyHybridMonitorSLSGroupResponse
     */
    CompletableFuture<ModifyHybridMonitorSLSGroupResponse> modifyHybridMonitorSLSGroup(ModifyHybridMonitorSLSGroupRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to change the collection period of a metric import task whose ID is <code>36****</code> to <code>15</code> seconds. The task is used to monitor the logs that are imported from Log Service. The returned result indicates that the metric is modified.</p>
     * 
     * @param request the request parameters of ModifyHybridMonitorTask  ModifyHybridMonitorTaskRequest
     * @return ModifyHybridMonitorTaskResponse
     */
    CompletableFuture<ModifyHybridMonitorTaskResponse> modifyHybridMonitorTask(ModifyHybridMonitorTaskRequest request);

    /**
     * @param request the request parameters of ModifyMetricRuleBlackList  ModifyMetricRuleBlackListRequest
     * @return ModifyMetricRuleBlackListResponse
     */
    CompletableFuture<ModifyMetricRuleBlackListResponse> modifyMetricRuleBlackList(ModifyMetricRuleBlackListRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to modify an alert template whose version is <code>1</code> and ID is <code>123456</code>. The alert level is changed to <code>Critical</code>. The statistical method is changed to <code>Average</code>. The alert threshold comparator is changed to <code>GreaterThanOrEqualToThreshold</code>. The alert threshold is changed to <code>90</code>. The number of alert retries is changed to <code>3</code>. The response shows that the alert template is modified.</p>
     * 
     * @param request the request parameters of ModifyMetricRuleTemplate  ModifyMetricRuleTemplateRequest
     * @return ModifyMetricRuleTemplateResponse
     */
    CompletableFuture<ModifyMetricRuleTemplateResponse> modifyMetricRuleTemplate(ModifyMetricRuleTemplateRequest request);

    /**
     * @param request the request parameters of ModifyMonitorGroup  ModifyMonitorGroupRequest
     * @return ModifyMonitorGroupResponse
     */
    CompletableFuture<ModifyMonitorGroupResponse> modifyMonitorGroup(ModifyMonitorGroupRequest request);

    /**
     * @param request the request parameters of ModifyMonitorGroupInstances  ModifyMonitorGroupInstancesRequest
     * @return ModifyMonitorGroupInstancesResponse
     */
    CompletableFuture<ModifyMonitorGroupInstancesResponse> modifyMonitorGroupInstances(ModifyMonitorGroupInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>The number of site monitoring tasks.</p>
     * 
     * @param request the request parameters of ModifySiteMonitor  ModifySiteMonitorRequest
     * @return ModifySiteMonitorResponse
     */
    CompletableFuture<ModifySiteMonitorResponse> modifySiteMonitor(ModifySiteMonitorRequest request);

    /**
     * @deprecated OpenAPI OpenCmsService is deprecated  * @param request  the request parameters of OpenCmsService  OpenCmsServiceRequest
     * @return OpenCmsServiceResponse
     */
    @Deprecated
    CompletableFuture<OpenCmsServiceResponse> openCmsService(OpenCmsServiceRequest request);

    /**
     * @param request the request parameters of PutContact  PutContactRequest
     * @return PutContactResponse
     */
    CompletableFuture<PutContactResponse> putContact(PutContactRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create an alert contact group named <code>ECS_Group</code>.</p>
     * 
     * @param request the request parameters of PutContactGroup  PutContactGroupRequest
     * @return PutContactGroupResponse
     */
    CompletableFuture<PutContactGroupResponse> putContactGroup(PutContactGroupRequest request);

    /**
     * @param request the request parameters of PutCustomEvent  PutCustomEventRequest
     * @return PutCustomEventResponse
     */
    CompletableFuture<PutCustomEventResponse> putCustomEvent(PutCustomEventRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, call the PutCustomEvent operation to report the monitoring data of the custom event. For more information, see <a href="https://help.aliyun.com/document_detail/115012.html">PutCustomEvent</a>.</p>
     * 
     * @param request the request parameters of PutCustomEventRule  PutCustomEventRuleRequest
     * @return PutCustomEventRuleResponse
     */
    CompletableFuture<PutCustomEventRuleResponse> putCustomEventRule(PutCustomEventRuleRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> We recommend that you call the <a href="https://help.aliyun.com/document_detail/383455.html">PutHybridMonitorMetricData</a> operation of Hybrid Cloud Monitoring to report monitoring data.</p>
     * </blockquote>
     * 
     * @param request the request parameters of PutCustomMetric  PutCustomMetricRequest
     * @return PutCustomMetricResponse
     */
    CompletableFuture<PutCustomMetricResponse> putCustomMetric(PutCustomMetricRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, call the PutCustomMetric operation to report custom monitoring data. For more information, see <a href="https://help.aliyun.com/document_detail/115004.html">PutCustomMetric</a>.</p>
     * 
     * @param request the request parameters of PutCustomMetricRule  PutCustomMetricRuleRequest
     * @return PutCustomMetricRuleResponse
     */
    CompletableFuture<PutCustomMetricRuleResponse> putCustomMetricRule(PutCustomMetricRuleRequest request);

    /**
     * <b>description</b> :
     * <p>If the specified rule name does not exist, an event-triggered alert rule is created. If the specified rule name exists, the specified event-triggered alert rule is modified.
     * In this example, the <code>myRuleName</code> alert rule is created for the <code>ecs</code> cloud service.</p>
     * 
     * @param request the request parameters of PutEventRule  PutEventRuleRequest
     * @return PutEventRuleResponse
     */
    CompletableFuture<PutEventRuleResponse> putEventRule(PutEventRuleRequest request);

    /**
     * @param request the request parameters of PutEventRuleTargets  PutEventRuleTargetsRequest
     * @return PutEventRuleTargetsResponse
     */
    CompletableFuture<PutEventRuleTargetsResponse> putEventRuleTargets(PutEventRuleTargetsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The monitoring data can be exported only to Log Service. More services will be supported in the future.</p>
     * </blockquote>
     * 
     * @param request the request parameters of PutExporterOutput  PutExporterOutputRequest
     * @return PutExporterOutputResponse
     */
    CompletableFuture<PutExporterOutputResponse> putExporterOutput(PutExporterOutputRequest request);

    /**
     * @param request the request parameters of PutExporterRule  PutExporterRuleRequest
     * @return PutExporterRuleResponse
     */
    CompletableFuture<PutExporterRuleResponse> putExporterRule(PutExporterRuleRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create an alert rule for the <code>cpu_total</code> metric of Elastic Compute Service (ECS) in the <code>17285****</code> application group. The ID of the alert rule is <code>123456</code>. The name of the alert rule is <code>Rule_test</code>. The alert level is <code>Critical</code>. The statistical method is <code>Average</code>. The alert threshold comparator is <code>GreaterThanOrEqualToThreshold</code>. The alert threshold is <code>90</code>. The number of alert retries is <code>3</code>. The returned result shows that the alert rule is created and the alert rule ID is <code>123456</code>.</p>
     * 
     * @param request the request parameters of PutGroupMetricRule  PutGroupMetricRuleRequest
     * @return PutGroupMetricRuleResponse
     */
    CompletableFuture<PutGroupMetricRuleResponse> putGroupMetricRule(PutGroupMetricRuleRequest request);

    /**
     * <b>description</b> :
     * <h1><a href="#"></a>Prerequisites</h1>
     * <p>Hybrid Cloud Monitoring is activated. For more information, see <a href="https://help.aliyun.com/document_detail/250773.html">Activate Hybrid Cloud Monitoring</a>.</p>
     * <h1><a href="#"></a>Limits</h1>
     * <p>The size of the monitoring data that you import at a time must be less than or equal to 1 MB.</p>
     * <h1><a href="#"></a>Description</h1>
     * <p>This topic provides an example on how to import the monitoring data of the <code>CPU_Usage</code> metric to the <code>default-aliyun</code> namespace of Hybrid Cloud Monitoring.</p>
     * 
     * @param request the request parameters of PutHybridMonitorMetricData  PutHybridMonitorMetricDataRequest
     * @return PutHybridMonitorMetricDataResponse
     */
    CompletableFuture<PutHybridMonitorMetricDataResponse> putHybridMonitorMetricData(PutHybridMonitorMetricDataRequest request);

    /**
     * <b>description</b> :
     * <p>In the example of this topic, the <code>cpu_total</code> log monitoring metric is created. The response shows that the log monitoring metric is created and the metric ID is <code>16****</code>.</p>
     * 
     * @param request the request parameters of PutLogMonitor  PutLogMonitorRequest
     * @return PutLogMonitorResponse
     */
    CompletableFuture<PutLogMonitorResponse> putLogMonitor(PutLogMonitorRequest request);

    /**
     * <b>description</b> :
     * <h1><a href="#"></a></h1>
     * <p>This topic provides an example on how to associate an alert rule with a resource. In this example, the alert rule is <code>ae06917_75a8c43178ab66****</code>, the resource is <code>acs:mns:cn-hangzhou:120886317861****:/queues/test/message</code>, and the ID of the resource for which alerts are triggered is <code>1</code>. The response indicates that the resource is associated with the specified alert rule.</p>
     * 
     * @param request the request parameters of PutMetricRuleTargets  PutMetricRuleTargetsRequest
     * @return PutMetricRuleTargetsResponse
     */
    CompletableFuture<PutMetricRuleTargetsResponse> putMetricRuleTargets(PutMetricRuleTargetsRequest request);

    /**
     * @param request the request parameters of PutMonitorGroupDynamicRule  PutMonitorGroupDynamicRuleRequest
     * @return PutMonitorGroupDynamicRuleResponse
     */
    CompletableFuture<PutMonitorGroupDynamicRuleResponse> putMonitorGroupDynamicRule(PutMonitorGroupDynamicRuleRequest request);

    /**
     * @param request the request parameters of PutMonitoringConfig  PutMonitoringConfigRequest
     * @return PutMonitoringConfigResponse
     */
    CompletableFuture<PutMonitoringConfigResponse> putMonitoringConfig(PutMonitoringConfigRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create a threshold-triggered alert rule for the <code>cpu_total</code> metric of an Elastic Compute Service (ECS) instance whose ID is <code>i-uf6j91r34rnwawoo****</code>. The namespace of ECS metrics is <code>acs_ecs_dashboard</code>. The alert contact group of the alert rule is <code>ECS_Group</code>. The name of the alert rule is <code>test123</code>. The ID of the alert rule is <code>a151cd6023eacee2f0978e03863cc1697c89508****</code>. The statistical method for Critical-level alerts is <code>Average</code>. The comparison operator for Critical-level alerts is <code>GreaterThanOrEqualToThreshold</code>. The threshold for Critical-level alerts is <code>90</code>. The consecutive number of times for which the metric value meets the trigger condition before a Critical-level alert is triggered is <code>3</code>.</p>
     * <blockquote>
     * <p> Statistics verification was added on August 15, 2024. Only the statistical value of the corresponding metric can be set for the Statistics parameter. For more information about how to obtain the value of this parameter, see <a href="https://www.alibabacloud.com/help/en/cms/support/appendix-1-metrics">Appendix 1: Metrics</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of PutResourceMetricRule  PutResourceMetricRuleRequest
     * @return PutResourceMetricRuleResponse
     */
    CompletableFuture<PutResourceMetricRuleResponse> putResourceMetricRule(PutResourceMetricRuleRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create a threshold-triggered alert rule for the <code>cpu_total</code> metric of an Elastic Compute Service (ECS) instance whose ID is <code>i-uf6j91r34rnwawoo****</code>. The namespace of ECS metrics is <code>acs_ecs_dashboard</code>. The alert contact group of the alert rule is <code>ECS_Group</code>. The name of the alert rule is <code>test123</code>. The ID of the alert rule is <code>a151cd6023eacee2f0978e03863cc1697c89508****</code>. The statistical method for Critical-level alerts is <code>Average</code>. The comparison operator for Critical-level alerts is <code>GreaterThanOrEqualToThreshold</code>. The threshold for Critical-level alerts is <code>90</code>. The consecutive number of times for which the metric value meets the trigger condition before a Critical-level alert is triggered is <code>3</code>.</p>
     * <blockquote>
     * <p> Statistics verification was added on August 15, 2024. Only the statistical value of the corresponding metric can be set for the Statistics parameter. For more information about how to obtain the value of this parameter, see <a href="https://www.alibabacloud.com/help/en/cms/support/appendix-1-metrics">Appendix 1: Metrics</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of PutResourceMetricRules  PutResourceMetricRulesRequest
     * @return PutResourceMetricRulesResponse
     */
    CompletableFuture<PutResourceMetricRulesResponse> putResourceMetricRules(PutResourceMetricRulesRequest request);

    /**
     * @param request the request parameters of RemoveTags  RemoveTagsRequest
     * @return RemoveTagsResponse
     */
    CompletableFuture<RemoveTagsResponse> removeTags(RemoveTagsRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is used to test whether a system event can be triggered as expected. You can call this operation to simulate a system event and check whether an expected response is returned after an alert is triggered by the system event.</p>
     * 
     * @param request the request parameters of SendDryRunSystemEvent  SendDryRunSystemEventRequest
     * @return SendDryRunSystemEventResponse
     */
    CompletableFuture<SendDryRunSystemEventResponse> sendDryRunSystemEvent(SendDryRunSystemEventRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> This API operation is not applicable to ECS instances. To uninstall the agent from an ECS instance, see <a href="https://help.aliyun.com/document_detail/183482.html">Install and uninstall the Cloud Monitor agent</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UninstallMonitoringAgent  UninstallMonitoringAgentRequest
     * @return UninstallMonitoringAgentResponse
     */
    CompletableFuture<UninstallMonitoringAgentResponse> uninstallMonitoringAgent(UninstallMonitoringAgentRequest request);

}
