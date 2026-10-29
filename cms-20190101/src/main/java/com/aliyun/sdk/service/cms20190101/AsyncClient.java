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
     * <p>This topic provides an example of how to attach a tag to the application group <code>7301****</code>. In this example, the tag key is <code>key1</code> and the tag value is <code>value1</code>.</p>
     * 
     * @param request the request parameters of AddTags  AddTagsRequest
     * @return AddTagsResponse
     */
    CompletableFuture<AddTagsResponse> addTags(AddTagsRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example of applying the alert template <code>700****</code> to the application group <code>123456</code>. The generated alert rule has the ID <code>applyTemplate8ab74c6b-9f27-47ab-8841-de01dc08****</code> and the name <code>test123</code>.</p>
     * 
     * @param request the request parameters of ApplyMetricRuleTemplate  ApplyMetricRuleTemplateRequest
     * @return ApplyMetricRuleTemplateResponse
     */
    CompletableFuture<ApplyMetricRuleTemplateResponse> applyMetricRuleTemplate(ApplyMetricRuleTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example of creating a site monitoring task named <code>HangZhou_ECS1</code>. The monitored address of the task is <code>https://www.aliyun.com</code>, and the monitoring type is <code>HTTP</code>. The response shows that the site monitoring task is created. The name of the task is <code>HangZhou_ECS1</code>, and the ID is <code>679fbe4f-b80b-4706-91b2-5427b43e****</code>.</p>
     * 
     * @param request the request parameters of BatchCreateInstantSiteMonitor  BatchCreateInstantSiteMonitorRequest
     * @return BatchCreateInstantSiteMonitorResponse
     */
    CompletableFuture<BatchCreateInstantSiteMonitorResponse> batchCreateInstantSiteMonitor(BatchCreateInstantSiteMonitorRequest request);

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
    CompletableFuture<BatchExportResponse> batchExport(BatchExportRequest request);

    /**
     * <b>description</b> :
     * <p>The Alibaba Cloud services supported by this operation include cloud servers (ECS), ApsaraDB RDS, and Server Load Balancer (SLB).
     * This topic provides an example on how to automatically create an application group for resources that are attached with the tag key <code>ecs_instance</code>. The alert contact group of the application group is <code>ECS_Group</code>.</p>
     * 
     * @param request the request parameters of CreateDynamicTagGroup  CreateDynamicTagGroupRequest
     * @return CreateDynamicTagGroupResponse
     */
    CompletableFuture<CreateDynamicTagGroupResponse> createDynamicTagGroup(CreateDynamicTagGroupRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create an alert rule for the monitoring metric <code>cpu_total</code> of Elastic Computing Service (ECS) in the application group <code>123456</code>. The alert rule ID is <code>456789</code>, the alert rule name is <code>ECS_Rule1</code>, the alert severity is <code>Critical</code>, the statistical method is <code>Average</code>, the comparison operator is <code>GreaterThanOrEqualToThreshold</code>, the threshold is <code>90</code>, and the retry count is <code>3</code>. The response shows that the alert rule <code>ECS_Rule1</code> is created.</p>
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
     * <p>This topic provides an example on how to create an availability monitoring task named <code>task1</code> with the detection type set to <code>HTTP</code> in application group <code>123456</code>. Alert notifications are sent by email and DingTalk chatbot.</p>
     * 
     * @param request the request parameters of CreateHostAvailability  CreateHostAvailabilityRequest
     * @return CreateHostAvailabilityResponse
     */
    CompletableFuture<CreateHostAvailabilityResponse> createHostAvailability(CreateHostAvailabilityRequest request);

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
    CompletableFuture<CreateHybridMonitorNamespaceResponse> createHybridMonitorNamespace(CreateHybridMonitorNamespaceRequest request);

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
    CompletableFuture<CreateHybridMonitorSLSGroupResponse> createHybridMonitorSLSGroup(CreateHybridMonitorSLSGroupRequest request);

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
    CompletableFuture<CreateHybridMonitorTaskResponse> createHybridMonitorTask(CreateHybridMonitorTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Only Alibaba Cloud accounts that have activated Network Analysis and Monitoring can create one-time synthetic monitoring tasks.
     * This topic provides an example of how to create a one-time synthetic monitoring task. The task name is <code>task1</code>, the monitored address is <code>http://www.aliyun.com</code>, the task type is <code>HTTP</code>, and the number of detection points is <code>1</code>.</p>
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
     * <p>This topic provides an example of creating an application group named <code>ECS_Group</code>.</p>
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
     * <p>Creates a pause alert notification policy for a specified application group. After the policy is created, alert notifications for the application group are paused during the time period specified by StartTime and EndTime (unit: milliseconds). Currently, PolicyType supports only PauseNotify (pause notification).</p>
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
     * <p>This topic describes how to create a site monitoring task. The example creates a task named <code>HanZhou_ECS1</code> to monitor the URL <code>https://www.aliyun.com</code> over <code>HTTPS</code>.</p>
     * 
     * @param request the request parameters of CreateSiteMonitor  CreateSiteMonitorRequest
     * @return CreateSiteMonitorResponse
     */
    CompletableFuture<CreateSiteMonitorResponse> createSiteMonitor(CreateSiteMonitorRequest request);

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
     * <p>This operation can query only the alert history within the last year.
     * This topic provides an example on how to query the alert history statistics of Elastic Compute Service (ECS) from the <code>product</code> dimension of Alibaba Cloud services.</p>
     * 
     * @param request the request parameters of DescribeAlertLogCount  DescribeAlertLogCountRequest
     * @return DescribeAlertLogCountResponse
     */
    CompletableFuture<DescribeAlertLogCountResponse> describeAlertLogCount(DescribeAlertLogCountRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to query the histogram list of ECS alert history from the Alibaba Cloud service <code>product</code> dimension.</p>
     * 
     * @param request the request parameters of DescribeAlertLogHistogram  DescribeAlertLogHistogramRequest
     * @return DescribeAlertLogHistogramResponse
     */
    CompletableFuture<DescribeAlertLogHistogramResponse> describeAlertLogHistogram(DescribeAlertLogHistogramRequest request);

    /**
     * <b>description</b> :
     * <p>This operation can query the alert history only within the last year.
     * This topic provides an example to show how to query the alert history of Elastic Compute Service (ECS) from the cloud service <code>product</code> dimension.</p>
     * 
     * @param request the request parameters of DescribeAlertLogList  DescribeAlertLogListRequest
     * @return DescribeAlertLogListResponse
     */
    CompletableFuture<DescribeAlertLogListResponse> describeAlertLogList(DescribeAlertLogListRequest request);

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
     * <p>This operation queries the number of times that a custom event occurred for each service.</p>
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
     * <p>You can call the DescribeMetricList operation to query the metrics of cloud services. For more information, see <a href="https://help.aliyun.com/document_detail/51936.html">DescribeMetricList</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeCustomMetricList  DescribeCustomMetricListRequest
     * @return DescribeCustomMetricListResponse
     */
    CompletableFuture<DescribeCustomMetricListResponse> describeCustomMetricList(DescribeCustomMetricListRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to query the rules for the tag key <code>tagkey1</code>. The response shows that two rules are returned. The rule IDs are <code>1536df65-a719-429d-8813-73cc40d7****</code> and <code>56e8cebb-b3d7-4a91-9880-78a8c84f****</code>.</p>
     * 
     * @param request the request parameters of DescribeDynamicTagRuleList  DescribeDynamicTagRuleListRequest
     * @return DescribeDynamicTagRuleListResponse
     */
    CompletableFuture<DescribeDynamicTagRuleListResponse> describeDynamicTagRuleList(DescribeDynamicTagRuleListRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the details of the event-triggered alert rule <code>testRule</code>.</p>
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
     * <p>This topic provides an example to query the details of the event-triggered alert rule <code>testRule</code>.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to query all alert rules in the alert rule list of the current Alibaba Cloud account. The response shows that the alert rule list contains only one alert rule. The alert rule is named <code>Rule_01</code> and has an ID of <code>applyTemplate344cfd42-0f32-4fd6-805a-88d7908a****</code>.</p>
     * 
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
     * <p>This topic provides an example on how to query the list of availability monitoring tasks for the current account. The response shows that the current account has one availability monitoring task record <code>ecs_instance</code>.</p>
     * 
     * @param request the request parameters of DescribeHostAvailabilityList  DescribeHostAvailabilityListRequest
     * @return DescribeHostAvailabilityListResponse
     */
    CompletableFuture<DescribeHostAvailabilityListResponse> describeHostAvailabilityList(DescribeHostAvailabilityListRequest request);

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
    CompletableFuture<DescribeHybridMonitorDataListResponse> describeHybridMonitorDataList(DescribeHybridMonitorDataListRequest request);

    /**
     * <b>description</b> :
     * <p>This example shows how to query all namespaces that belong to the current account. The response indicates that only one namespace, <code>aliyun-test</code>, exists.</p>
     * 
     * @param request the request parameters of DescribeHybridMonitorNamespaceList  DescribeHybridMonitorNamespaceListRequest
     * @return DescribeHybridMonitorNamespaceListResponse
     */
    CompletableFuture<DescribeHybridMonitorNamespaceListResponse> describeHybridMonitorNamespaceList(DescribeHybridMonitorNamespaceListRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to query all Logstore groups in the current account. The response shows that the current account has two Logstore groups: <code>Logstore_test</code> and <code>Logstore_aliyun</code>.</p>
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
    CompletableFuture<DescribeMetricDataResponse> describeMetricData(DescribeMetricDataRequest request);

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
    CompletableFuture<DescribeMetricLastResponse> describeMetricLast(DescribeMetricLastRequest request);

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
    CompletableFuture<DescribeMetricListResponse> describeMetricList(DescribeMetricListRequest request);

    /**
     * <b>description</b> :
     * <p>Use this operation together with DescribeMetricList and DescribeMetricLast. For more information, see <a href="https://help.aliyun.com/document_detail/51936.html">DescribeMetricList</a> and <a href="https://help.aliyun.com/document_detail/51939.html">DescribeMetricLast</a>.</p>
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
     * <p>This topic provides an example on how to query all alert rules in the alert rule list under the current Alibaba Cloud account. The response shows that the alert rule list contains only one alert rule. The name of the alert rule is <code>Rule_01</code> and the ID is <code>applyTemplate344cfd42-0f32-4fd6-805a-88d7908a****</code>.</p>
     * 
     * @param request the request parameters of DescribeMetricRuleList  DescribeMetricRuleListRequest
     * @return DescribeMetricRuleListResponse
     */
    CompletableFuture<DescribeMetricRuleListResponse> describeMetricRuleList(DescribeMetricRuleListRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>This topic provides an example to query the target resources associated with the alert rule <code>ae06917_75a8c43178ab66****</code>.</p>
     * 
     * @param request the request parameters of DescribeMetricRuleTargets  DescribeMetricRuleTargetsRequest
     * @return DescribeMetricRuleTargetsResponse
     */
    CompletableFuture<DescribeMetricRuleTargetsResponse> describeMetricRuleTargets(DescribeMetricRuleTargetsRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the details of the alert template <code>70****</code>.</p>
     * 
     * @param request the request parameters of DescribeMetricRuleTemplateAttribute  DescribeMetricRuleTemplateAttributeRequest
     * @return DescribeMetricRuleTemplateAttributeResponse
     */
    CompletableFuture<DescribeMetricRuleTemplateAttributeResponse> describeMetricRuleTemplateAttribute(DescribeMetricRuleTemplateAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example of querying alert templates. The response shows that the alert template list contains two alert templates: <code>ECS_Template1</code> and <code>ECS_Template2</code>.</p>
     * 
     * @param request the request parameters of DescribeMetricRuleTemplateList  DescribeMetricRuleTemplateListRequest
     * @return DescribeMetricRuleTemplateListResponse
     */
    CompletableFuture<DescribeMetricRuleTemplateListResponse> describeMetricRuleTemplateList(DescribeMetricRuleTemplateListRequest request);

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
     * <p>This topic provides an example of how to query the list of application groups for the current account. The response shows that the current account has two application groups: <code>testGroup124</code> and <code>test123</code>.</p>
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
     * <p>Before you call this operation, you must call the CreateMonitoringAgentProcess operation to create a process monitoring task. For more information, see <a href="https://help.aliyun.com/document_detail/2513212.html">CreateMonitoringAgentProcess</a>.
     * This topic provides an example of how to query the list of processes for the resource i-hp3hl3cx1pbahzy8\<em>\</em>\<em>\</em>. The response shows the details of the Nginx and HTTP processes.</p>
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
     * <p>Obtains the information about the connected cloud services, including the description, namespace, and tags of each service.</p>
     * 
     * @param request the request parameters of DescribeProjectMeta  DescribeProjectMetaRequest
     * @return DescribeProjectMetaResponse
     */
    CompletableFuture<DescribeProjectMetaResponse> describeProjectMeta(DescribeProjectMetaRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example of querying the details of the site monitoring task <code>cc641dff-c19d-45f3-ad0a-818a0c4f****</code>. The response shows that the task name is <code>test123</code>, the monitored address is <code>https://aliyun.com</code>, and the carrier is <code>Alibaba</code>.</p>
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
     * <p>本文将提供一个示例，查询运营商“联通”在“贵阳市”的探测点详情。</p>
     * 
     * @param request the request parameters of DescribeSiteMonitorISPCityList  DescribeSiteMonitorISPCityListRequest
     * @return DescribeSiteMonitorISPCityListResponse
     */
    CompletableFuture<DescribeSiteMonitorISPCityListResponse> describeSiteMonitorISPCityList(DescribeSiteMonitorISPCityListRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to query the list of site monitoring tasks for the current account. The response shows that the current account has one site monitoring record named <code>HanZhou_ECS2</code>.</p>
     * 
     * @param request the request parameters of DescribeSiteMonitorList  DescribeSiteMonitorListRequest
     * @return DescribeSiteMonitorListResponse
     */
    CompletableFuture<DescribeSiteMonitorListResponse> describeSiteMonitorList(DescribeSiteMonitorListRequest request);

    /**
     * <b>description</b> :
     * <p>Only Alibaba Cloud accounts with Network Analysis and Monitoring activated can create one-time detection tasks.
     * This topic provides an example of how to query the detection logs for the one-time detection task <code>afa5c3ce-f944-4363-9edb-ce919a29****</code>.</p>
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
     * <p>This topic provides an example on how to query the average statistics of the <code>Availability</code> metric in the site monitoring task whose ID is <code>ef4cdc8b-9dc7-43e7-810e-f950e56c****</code>. The returned result shows that the availability is <code>100</code>.</p>
     * 
     * @param request the request parameters of DescribeSiteMonitorStatistics  DescribeSiteMonitorStatisticsRequest
     * @return DescribeSiteMonitorStatisticsResponse
     */
    CompletableFuture<DescribeSiteMonitorStatisticsResponse> describeSiteMonitorStatistics(DescribeSiteMonitorStatisticsRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example to query the details of detection points for the carrier China Unicom in Beijing.</p>
     * 
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
     * <h3>Background information</h3>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/114972.html">DescribeSystemEventMetaList</a> to obtain the Alibaba Cloud services and their system events supported by CloudMonitor.</p>
     * <h3>Operation description</h3>
     * <p>This topic provides an example of how to query the number of events that occurred for Elastic Compute Service (<code>ECS</code>) under the current account. The response shows that a total of 3 events occurred.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example of setting a threshold alert rule for the <code>cpu_total</code> metric of the instance <code>i-uf6j91r34rnwawoo****</code> in the <code>acs_ecs_dashboard</code> namespace of Elastic Compute Service (ECS). The alert contact group for the alert rule is <code>ECS_Group</code>, the alert rule name is <code>test123</code>, the alert rule ID is <code>a151cd6023eacee2f0978e03863cc1697c89508****</code>, the statistical method for the Critical level is <code>Average</code>, the comparison operator for the Critical level is <code>GreaterThanOrEqualToThreshold</code>, the threshold for the Critical level is <code>90</code>, and the alert retry count for the Critical level is <code>3</code>.</p>
     * <blockquote>
     * <p>On August 15, 2024, Statistics validation was added. The statistical value must be the Statistics value corresponding to the metric. For more information about how to obtain the value of this parameter, see <a href="https://www.alibabacloud.com/help/en/cms/support/appendix-1-metrics">Alibaba Cloud service monitoring metrics</a>.</p>
     * </blockquote>
     * 
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
    CompletableFuture<InstallMonitoringAgentResponse> installMonitoringAgent(InstallMonitoringAgentRequest request);

    /**
     * @param request the request parameters of ModifyGroupMonitoringAgentProcess  ModifyGroupMonitoringAgentProcessRequest
     * @return ModifyGroupMonitoringAgentProcessResponse
     */
    CompletableFuture<ModifyGroupMonitoringAgentProcessResponse> modifyGroupMonitoringAgentProcess(ModifyGroupMonitoringAgentProcessRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to change the name of availability monitoring task <code>12345</code> in application group <code>123456</code> to <code>task2</code>.</p>
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
     * <p>This topic provides an example on how to change the data storage duration of the metric store <code>aliyun</code> to <code>cms.s1.2xlarge</code>. The response shows that the metric store is modified.</p>
     * 
     * @param request the request parameters of ModifyHybridMonitorNamespace  ModifyHybridMonitorNamespaceRequest
     * @return ModifyHybridMonitorNamespaceResponse
     */
    CompletableFuture<ModifyHybridMonitorNamespaceResponse> modifyHybridMonitorNamespace(ModifyHybridMonitorNamespaceRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to change the Logstore in the <code>aliyun-project</code> log project in the <code>ap-southeast-1</code> region of the Logstore group <code>Logstore_test</code> to <code>Logstore-aliyun-all</code>. The response shows that the Logstore group is modified.</p>
     * 
     * @param request the request parameters of ModifyHybridMonitorSLSGroup  ModifyHybridMonitorSLSGroupRequest
     * @return ModifyHybridMonitorSLSGroupResponse
     */
    CompletableFuture<ModifyHybridMonitorSLSGroupResponse> modifyHybridMonitorSLSGroup(ModifyHybridMonitorSLSGroupRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to change the collection interval of the SLS log monitoring task <code>36****</code> to <code>15</code> seconds. The response shows that the metric is modified.</p>
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
     * @param request the request parameters of ModifySiteMonitor  ModifySiteMonitorRequest
     * @return ModifySiteMonitorResponse
     */
    CompletableFuture<ModifySiteMonitorResponse> modifySiteMonitor(ModifySiteMonitorRequest request);

    /**
     * @param request the request parameters of PutContact  PutContactRequest
     * @return PutContactResponse
     */
    CompletableFuture<PutContactResponse> putContact(PutContactRequest request);

    /**
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
     * <p>Before you call this operation, you must call the PutCustomEvent operation to report the monitoring data of the custom event. For more information, see <a href="https://help.aliyun.com/document_detail/115012.html">PutCustomEvent</a>.</p>
     * 
     * @param request the request parameters of PutCustomEventRule  PutCustomEventRuleRequest
     * @return PutCustomEventRuleResponse
     */
    CompletableFuture<PutCustomEventRuleResponse> putCustomEventRule(PutCustomEventRuleRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>We recommend that you use the <a href="https://help.aliyun.com/document_detail/383455.html">PutHybridMonitorMetricData</a> operation in Enterprise CloudMonitor.</p>
     * </blockquote>
     * 
     * @param request the request parameters of PutCustomMetric  PutCustomMetricRequest
     * @return PutCustomMetricResponse
     */
    CompletableFuture<PutCustomMetricResponse> putCustomMetric(PutCustomMetricRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, call the PutCustomMetric operation to report custom monitoring data. For more information, see <a href="https://help.aliyun.com/document_detail/115004.html">PutCustomMetric</a>.</p>
     * 
     * @param request the request parameters of PutCustomMetricRule  PutCustomMetricRuleRequest
     * @return PutCustomMetricRuleResponse
     */
    CompletableFuture<PutCustomMetricRuleResponse> putCustomMetricRule(PutCustomMetricRuleRequest request);

    /**
     * <b>description</b> :
     * <p>If the specified alert rule name does not exist, a new alert rule is created. If the specified alert rule name already exists, the existing alert rule is modified.
     * This topic provides an example on how to create an event-triggered alert rule named <code>myRuleName</code> for the Alibaba Cloud service <code>ecs</code>.</p>
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
     * <p>Only Log Service (SLS) is supported. More products will be supported in the future.</p>
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
     * <p>This topic provides an example of creating an alert rule for the <code>cpu_total</code> monitoring metric of the Elastic Computing Service server (an Alibaba Cloud service) in the application group <code>17285****</code>. The alert rule ID is <code>123456</code>, the alert rule name is <code>Rule_test</code>, the alert level is <code>Critical</code>, the statistical method is <code>Average</code>, the threshold comparison operator is <code>GreaterThanOrEqualToThreshold</code>, the threshold is <code>90</code>, and the retry count is <code>3</code>. The response shows that the alert rule is created and the alert rule ID is <code>123456</code>.</p>
     * 
     * @param request the request parameters of PutGroupMetricRule  PutGroupMetricRuleRequest
     * @return PutGroupMetricRuleResponse
     */
    CompletableFuture<PutGroupMetricRuleResponse> putGroupMetricRule(PutGroupMetricRuleRequest request);

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
    CompletableFuture<PutHybridMonitorMetricDataResponse> putHybridMonitorMetricData(PutHybridMonitorMetricDataRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to create a log monitoring metric named <code>cpu_total</code>. The response shows that the log monitoring metric is created. The log monitoring metric ID is <code>16****</code>.</p>
     * 
     * @param request the request parameters of PutLogMonitor  PutLogMonitorRequest
     * @return PutLogMonitorResponse
     */
    CompletableFuture<PutLogMonitorResponse> putLogMonitor(PutLogMonitorRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>This topic provides an example on how to associate the resource <code>acs:mns:ap-southeast-1:120886317861****:/queues/test/message</code> with the alert rule <code>ae06917_75a8c43178ab66****</code>. The alert trigger target ID is <code>1</code>. The response shows that the resource is associated.</p>
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
     * <p>This topic provides an example on how to configure a threshold-based alert rule for the <code>cpu_total</code> metric of a cloud server (ECS) instance <code>i-uf6j91r34rnwawoo****</code> in the <code>acs_ecs_dashboard</code> namespace. The alert contact group for the alert rule is <code>ECS_Group</code>, the alert rule name is <code>test123</code>, the alert rule ID is <code>a151cd6023eacee2f0978e03863cc1697c89508****</code>, the statistical method for the Critical level is <code>Average</code>, the comparison operator for the Critical level is <code>GreaterThanOrEqualToThreshold</code>, the threshold for the Critical level is <code>90</code>, and the alert retry count for the Critical level is <code>3</code>.</p>
     * <blockquote>
     * <p>On August 15, 2024, Statistics validation is increased. The statistical value must match the Statistics of the corresponding metric. For more information about how to obtain the valid values for this parameter, see <a href="https://www.alibabacloud.com/help/en/cms/support/appendix-1-metrics">Alibaba Cloud service metrics</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of PutResourceMetricRule  PutResourceMetricRuleRequest
     * @return PutResourceMetricRuleResponse
     */
    CompletableFuture<PutResourceMetricRuleResponse> putResourceMetricRule(PutResourceMetricRuleRequest request);

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
    CompletableFuture<PutResourceMetricRulesResponse> putResourceMetricRules(PutResourceMetricRulesRequest request);

    /**
     * @param request the request parameters of RemoveTags  RemoveTagsRequest
     * @return RemoveTagsResponse
     */
    CompletableFuture<RemoveTagsResponse> removeTags(RemoveTagsRequest request);

    /**
     * <b>description</b> :
     * <p>Tests whether a system event can be triggered as expected. Simulates a system event and verifies the response when the event triggers an alert.</p>
     * 
     * @param request the request parameters of SendDryRunSystemEvent  SendDryRunSystemEventRequest
     * @return SendDryRunSystemEventResponse
     */
    CompletableFuture<SendDryRunSystemEventResponse> sendDryRunSystemEvent(SendDryRunSystemEventRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This API operation is not applicable to Elastic Compute Service (ECS) instances. To uninstall the agent from an ECS instance, see <a href="https://help.aliyun.com/document_detail/183482.html">Install and uninstall the CloudMonitor agent</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UninstallMonitoringAgent  UninstallMonitoringAgentRequest
     * @return UninstallMonitoringAgentResponse
     */
    CompletableFuture<UninstallMonitoringAgentResponse> uninstallMonitoringAgent(UninstallMonitoringAgentRequest request);

}
