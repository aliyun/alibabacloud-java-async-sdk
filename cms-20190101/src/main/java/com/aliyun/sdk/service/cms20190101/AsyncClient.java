// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cms20190101.models.*;
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
      * This topic provides an example on how to add a tag to an application group whose ID is `7301****`. In this example, the key of the tag is `key1` and the value of the tag is `value1`.
      *
     */
    CompletableFuture<AddTagsResponse> addTags(AddTagsRequest request);

    /**
      * The ID of the application group to which the alert template is applied.
      * For more information about how to query the ID of an application group, see [DescribeMonitorGroups](~~115032~~).
      *
     */
    CompletableFuture<ApplyMetricRuleTemplateResponse> applyMetricRuleTemplate(ApplyMetricRuleTemplateRequest request);

    /**
      * The extended options of the protocol that is used by the site monitoring task. The options vary based on the protocol.
      *
     */
    CompletableFuture<BatchCreateInstantSiteMonitorResponse> batchCreateInstantSiteMonitor(BatchCreateInstantSiteMonitorRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<BatchCreateIntantSiteMonitorResponse> batchCreateIntantSiteMonitor(BatchCreateIntantSiteMonitorRequest request);

    /**
      * ### [](#)Prerequisites
      * The `Cursor` information is returned by calling the [Cursor](~~2330730~~) operation.
      * ### [](#)Description
      * This topic provides an example on how to export the monitoring data of the `cpu_idle` metric for Elastic Compute Service (ECS). The namespace of ECS is `acs_ecs_dashboard`. The `Cursor` information is specified. A maximum of 1,000 data entries can be returned in each response.
      *
     */
    CompletableFuture<BatchExportResponse> batchExport(BatchExportRequest request);

    CompletableFuture<CreateCmsCallNumOrderResponse> createCmsCallNumOrder(CreateCmsCallNumOrderRequest request);

    CompletableFuture<CreateCmsOrderResponse> createCmsOrder(CreateCmsOrderRequest request);

    CompletableFuture<CreateCmsSmspackageOrderResponse> createCmsSmspackageOrder(CreateCmsSmspackageOrderRequest request);

    /**
      * Specifies whether the application group automatically subscribes to event notifications. If events whose severity level is critical or warning occur on resources in an application group, CloudMonitor sends alert notifications. Valid values:
      * *   true: The application group automatically subscribes to event notifications.
      * *   false (default value): The application group does not automatically subscribe to event notifications.
      *
     */
    CompletableFuture<CreateDynamicTagGroupResponse> createDynamicTagGroup(CreateDynamicTagGroupRequest request);

    /**
      * The details of the alert rules.
      *
     */
    CompletableFuture<CreateGroupMetricRulesResponse> createGroupMetricRules(CreateGroupMetricRulesRequest request);

    CompletableFuture<CreateGroupMonitoringAgentProcessResponse> createGroupMonitoringAgentProcess(CreateGroupMonitoringAgentProcessRequest request);

    /**
      * This topic provides an example on how to create an availability monitoring task named `task1` in an application group named `123456`. The TaskType parameter of the task is set to `HTTP`. After you start the task, the system sends alerts by using the specified email address and DingTalk chatbot.
      *
     */
    CompletableFuture<CreateHostAvailabilityResponse> createHostAvailability(CreateHostAvailabilityRequest request);

    /**
      * Indicates whether the call was successful. Valid values:
      * *   true: The call was successful.
      * *   false: The call failed.
      *
     */
    CompletableFuture<CreateHybridMonitorNamespaceResponse> createHybridMonitorNamespace(CreateHybridMonitorNamespaceRequest request);

    /**
      * The Log Service projects.
      * Valid values of N: 1 to 25.
      *
     */
    CompletableFuture<CreateHybridMonitorSLSGroupResponse> createHybridMonitorSLSGroup(CreateHybridMonitorSLSGroupRequest request);

    /**
      * The dimension based on which data is aggregated. This parameter is equivalent to the GROUP BY clause in SQL.
      *
     */
    CompletableFuture<CreateHybridMonitorTaskResponse> createHybridMonitorTask(CreateHybridMonitorTaskRequest request);

    /**
      * You can create an instant test task only by using the Alibaba Cloud account that you used to enable Network Analysis and Monitoring. 
      * This topic provides an example to show how to create an instant test task. The name of the task is `task1`. The tested address is `http://www.aliyun.com`. The test type is `HTTP`. The number of detection points is `1`.
      *
     */
    CompletableFuture<CreateInstantSiteMonitorResponse> createInstantSiteMonitor(CreateInstantSiteMonitorRequest request);

    /**
      * ### Background information
      * *   CloudMonitor blocks alert notifications based on the blacklist policies that take effect. To block alert notifications when the value of a metric that belongs to a cloud service reaches the threshold that you specified, add the metric to a blacklist policy.
      * *   CloudMonitor allows you to create blacklist policies only based on threshold metrics. You cannot create blacklist policies based on system events. For more information about the cloud services and the thresholds of the metrics that are supported by CloudMonitor, see [Appendix 1: Metrics](~~163515~~).
      *
     */
    CompletableFuture<CreateMetricRuleBlackListResponse> createMetricRuleBlackList(CreateMetricRuleBlackListRequest request);

    CompletableFuture<CreateMetricRuleResourcesResponse> createMetricRuleResources(CreateMetricRuleResourcesRequest request);

    CompletableFuture<CreateMetricRuleTemplateResponse> createMetricRuleTemplate(CreateMetricRuleTemplateRequest request);

    CompletableFuture<CreateMonitorAgentProcessResponse> createMonitorAgentProcess(CreateMonitorAgentProcessRequest request);

    /**
      * The name of the application group.
      *
     */
    CompletableFuture<CreateMonitorGroupResponse> createMonitorGroup(CreateMonitorGroupRequest request);

    /**
      * This topic provides an example on how to create an application group by using the resource group `CloudMonitor` and the alert contact group `ECS_Group`. The region ID of the resource group is `cn-hangzhou`.
      *
     */
    CompletableFuture<CreateMonitorGroupByResourceGroupIdResponse> createMonitorGroupByResourceGroupId(CreateMonitorGroupByResourceGroupIdRequest request);

    /**
      * The abbreviation of the Alibaba Cloud service name.
      * To obtain the abbreviation of an Alibaba Cloud service name, call the [DescribeProjectMeta](~~114916~~) operation. The `metricCategory` tag in the `Labels` response parameter indicates the abbreviation of the Alibaba Cloud service name.
      *
     */
    CompletableFuture<CreateMonitorGroupInstancesResponse> createMonitorGroupInstances(CreateMonitorGroupInstancesRequest request);

    /**
      * The type of the policy. Valid value: PauseNotify.
      *
     */
    CompletableFuture<CreateMonitorGroupNotifyPolicyResponse> createMonitorGroupNotifyPolicy(CreateMonitorGroupNotifyPolicyRequest request);

    CompletableFuture<CreateMonitoringAgentProcessResponse> createMonitoringAgentProcess(CreateMonitoringAgentProcessRequest request);

    /**
      * This topic provides an example on how to create a site monitoring task named `HanZhou_ECS1`. The URL that is monitored by the task is `https://www.aliyun.com` and the type of the task is `HTTPS`.
      *
     */
    CompletableFuture<CreateSiteMonitorResponse> createSiteMonitor(CreateSiteMonitorRequest request);

    /**
      * ### [](#)Prerequisites
      * Hybrid Cloud Monitoring is activated. For more information, see [Activate Hybrid Cloud Monitoring](~~250773~~).
      * ### [](#)Background information
      * You can call this operation to obtain the Cursor information and then call the [BatchExport](~~2329847~~) operation to export the monitoring data.
      * ### [](#)Description
      * This topic provides an example on how to define the monitoring data of a specified metric for a specified cloud service. In this example, the namespace of the cloud service is set to `acs_ecs_dashboard`, the metric is set to `cpu_idle`, the start time is set to `1641627000000`, and the end time is set to `1641645000000`. The number of idle CPU cores on your Elastic Compute Service (ECS) instances is measured every 60 seconds from 15:30:00, January 8, 2022 to 20:30:00, January 8, 2022. The `Cursor` information is returned.
      *
     */
    CompletableFuture<CursorResponse> cursor(CursorRequest request);

    CompletableFuture<DeleteContactResponse> deleteContact(DeleteContactRequest request);

    CompletableFuture<DeleteContactGroupResponse> deleteContactGroup(DeleteContactGroupRequest request);

    CompletableFuture<DeleteCustomMetricResponse> deleteCustomMetric(DeleteCustomMetricRequest request);

    CompletableFuture<DeleteDynamicTagGroupResponse> deleteDynamicTagGroup(DeleteDynamicTagGroupRequest request);

    CompletableFuture<DeleteEventRuleTargetsResponse> deleteEventRuleTargets(DeleteEventRuleTargetsRequest request);

    CompletableFuture<DeleteEventRulesResponse> deleteEventRules(DeleteEventRulesRequest request);

    CompletableFuture<DeleteExporterOutputResponse> deleteExporterOutput(DeleteExporterOutputRequest request);

    CompletableFuture<DeleteExporterRuleResponse> deleteExporterRule(DeleteExporterRuleRequest request);

    CompletableFuture<DeleteGroupMonitoringAgentProcessResponse> deleteGroupMonitoringAgentProcess(DeleteGroupMonitoringAgentProcessRequest request);

    CompletableFuture<DeleteHostAvailabilityResponse> deleteHostAvailability(DeleteHostAvailabilityRequest request);

    /**
      * Indicates whether the call was successful. Valid values:
      * *   true: The call was successful.
      * *   false: The call failed.
      *
     */
    CompletableFuture<DeleteHybridMonitorNamespaceResponse> deleteHybridMonitorNamespace(DeleteHybridMonitorNamespaceRequest request);

    /**
      * This topic provides an example on how to delete a Logstore group named `Logstore_test`. The response shows that the Logstore group is deleted.
      *
     */
    CompletableFuture<DeleteHybridMonitorSLSGroupResponse> deleteHybridMonitorSLSGroup(DeleteHybridMonitorSLSGroupRequest request);

    /**
      * This topic provides an example on how to delete a metric import task whose ID is `36****`. The returned result indicates that the metric import task is deleted.
      *
     */
    CompletableFuture<DeleteHybridMonitorTaskResponse> deleteHybridMonitorTask(DeleteHybridMonitorTaskRequest request);

    CompletableFuture<DeleteLogMonitorResponse> deleteLogMonitor(DeleteLogMonitorRequest request);

    CompletableFuture<DeleteMetricRuleBlackListResponse> deleteMetricRuleBlackList(DeleteMetricRuleBlackListRequest request);

    CompletableFuture<DeleteMetricRuleResourcesResponse> deleteMetricRuleResources(DeleteMetricRuleResourcesRequest request);

    CompletableFuture<DeleteMetricRuleTargetsResponse> deleteMetricRuleTargets(DeleteMetricRuleTargetsRequest request);

    CompletableFuture<DeleteMetricRuleTemplateResponse> deleteMetricRuleTemplate(DeleteMetricRuleTemplateRequest request);

    CompletableFuture<DeleteMetricRulesResponse> deleteMetricRules(DeleteMetricRulesRequest request);

    CompletableFuture<DeleteMonitorGroupResponse> deleteMonitorGroup(DeleteMonitorGroupRequest request);

    CompletableFuture<DeleteMonitorGroupDynamicRuleResponse> deleteMonitorGroupDynamicRule(DeleteMonitorGroupDynamicRuleRequest request);

    CompletableFuture<DeleteMonitorGroupInstancesResponse> deleteMonitorGroupInstances(DeleteMonitorGroupInstancesRequest request);

    CompletableFuture<DeleteMonitorGroupNotifyPolicyResponse> deleteMonitorGroupNotifyPolicy(DeleteMonitorGroupNotifyPolicyRequest request);

    CompletableFuture<DeleteMonitoringAgentProcessResponse> deleteMonitoringAgentProcess(DeleteMonitoringAgentProcessRequest request);

    CompletableFuture<DeleteSiteMonitorsResponse> deleteSiteMonitors(DeleteSiteMonitorsRequest request);

    CompletableFuture<DescribeActiveMetricRuleListResponse> describeActiveMetricRuleList(DescribeActiveMetricRuleListRequest request);

    /**
      * @deprecated
      * This API operation is no longer maintained. We recommend that you call the [DescribeAlertLogList](~~201087~~) operation.
      *
     */
    CompletableFuture<DescribeAlertHistoryListResponse> describeAlertHistoryList(DescribeAlertHistoryListRequest request);

    /**
      * This topic provides an example to show how to query the statistics of alert logs for Elastic Compute Service (ECS) based on the `product` dimension.
      *
     */
    CompletableFuture<DescribeAlertLogCountResponse> describeAlertLogCount(DescribeAlertLogCountRequest request);

    /**
      * This topic provides an example on how to query the number of alert logs for Elastic Compute Service (ECS) based on the `product` dimension.
      *
     */
    CompletableFuture<DescribeAlertLogHistogramResponse> describeAlertLogHistogram(DescribeAlertLogHistogramRequest request);

    /**
      * Indicates whether the call was successful. Valid values:
      * *   true: The call was successful.
      * *   false: The call failed.
      *
     */
    CompletableFuture<DescribeAlertLogListResponse> describeAlertLogList(DescribeAlertLogListRequest request);

    CompletableFuture<DescribeAlertingMetricRuleResourcesResponse> describeAlertingMetricRuleResources(DescribeAlertingMetricRuleResourcesRequest request);

    CompletableFuture<DescribeContactGroupListResponse> describeContactGroupList(DescribeContactGroupListRequest request);

    CompletableFuture<DescribeContactListResponse> describeContactList(DescribeContactListRequest request);

    CompletableFuture<DescribeContactListByContactGroupResponse> describeContactListByContactGroup(DescribeContactListByContactGroupRequest request);

    CompletableFuture<DescribeCustomEventAttributeResponse> describeCustomEventAttribute(DescribeCustomEventAttributeRequest request);

    /**
      * The name of the custom event.
      *
     */
    CompletableFuture<DescribeCustomEventCountResponse> describeCustomEventCount(DescribeCustomEventCountRequest request);

    CompletableFuture<DescribeCustomEventHistogramResponse> describeCustomEventHistogram(DescribeCustomEventHistogramRequest request);

    /**
      * The ID of the application group.
      * For more information, see [DescribeMonitorGroups](~~115032~~).
      *
     */
    CompletableFuture<DescribeCustomMetricListResponse> describeCustomMetricList(DescribeCustomMetricListRequest request);

    /**
      * The HTTP status code.
      * >  The status code 200 indicates that the call was successful.
      *
     */
    CompletableFuture<DescribeDynamicTagRuleListResponse> describeDynamicTagRuleList(DescribeDynamicTagRuleListRequest request);

    /**
      * This topic provides an example to show how to query the details of an event-triggered alert rule named `testRule`.
      *
     */
    CompletableFuture<DescribeEventRuleAttributeResponse> describeEventRuleAttribute(DescribeEventRuleAttributeRequest request);

    CompletableFuture<DescribeEventRuleListResponse> describeEventRuleList(DescribeEventRuleListRequest request);

    /**
      * The error message.
      *
     */
    CompletableFuture<DescribeEventRuleTargetListResponse> describeEventRuleTargetList(DescribeEventRuleTargetListRequest request);

    CompletableFuture<DescribeExporterOutputListResponse> describeExporterOutputList(DescribeExporterOutputListRequest request);

    CompletableFuture<DescribeExporterRuleListResponse> describeExporterRuleList(DescribeExporterRuleListRequest request);

    /**
      * The ID of the application group.
      *
     */
    CompletableFuture<DescribeGroupMonitoringAgentProcessResponse> describeGroupMonitoringAgentProcess(DescribeGroupMonitoringAgentProcessRequest request);

    /**
      * The ID of the availability monitoring task.
      *
     */
    CompletableFuture<DescribeHostAvailabilityListResponse> describeHostAvailabilityList(DescribeHostAvailabilityListRequest request);

    /**
      * The tag key.
      *
     */
    CompletableFuture<DescribeHybridMonitorDataListResponse> describeHybridMonitorDataList(DescribeHybridMonitorDataListRequest request);

    /**
      * The data retention period. Valid values:
      * *   cms.s1.large: Data is stored for 15 days.
      * *   cms.s1.xlarge: Data is stored for 32 days.
      * *   cms.s1.2xlarge: Data is stored for 63 days.
      * *   cms.s1.3xlarge: Data is stored for 93 days.
      * *   cms.s1.6xlarge: Data is stored for 185 days.
      * *   cms.s1.12xlarge: Data is stored for 376 days.
      *
     */
    CompletableFuture<DescribeHybridMonitorNamespaceListResponse> describeHybridMonitorNamespaceList(DescribeHybridMonitorNamespaceListRequest request);

    /**
      * In this example, all Logstore groups within the current account are queried. The response shows that the current account has two Logstore groups: `Logstore_test` and `Logstore_aliyun`.
      *
     */
    CompletableFuture<DescribeHybridMonitorSLSGroupResponse> describeHybridMonitorSLSGroup(DescribeHybridMonitorSLSGroupRequest request);

    /**
      * This topic provides an example on how to query all metric import tasks that belong to the current Alibaba Cloud account. The returned result indicates that the current account has only one metric import task. The metric import task is named `aliyun_task`.
      *
     */
    CompletableFuture<DescribeHybridMonitorTaskListResponse> describeHybridMonitorTaskList(DescribeHybridMonitorTaskListRequest request);

    CompletableFuture<DescribeLogMonitorAttributeResponse> describeLogMonitorAttribute(DescribeLogMonitorAttributeRequest request);

    CompletableFuture<DescribeLogMonitorListResponse> describeLogMonitorList(DescribeLogMonitorListRequest request);

    /**
      * The statistical period of the metric.
      * Valid values: 15, 60, 900, and 3600.
      * Unit: seconds.
      * > 
      * *   If this parameter is not specified, monitoring data is queried based on the period in which metric values are reported.
      * *   For more information about the statistical period of a metric that is specified by the `MetricName` parameter, see [Appendix 1: Metrics](~~163515~~).
      *
     */
    CompletableFuture<DescribeMetricDataResponse> describeMetricData(DescribeMetricDataRequest request);

    /**
      * ### [](#)Limits
      * Each API operation can be called up to 50 times per second. An Alibaba Cloud account and the RAM users within the account share the quota.
      * ### [](#)Precautions
      * The storage duration of the monitoring data of each cloud service is related to the `Period` parameter (statistical period). A larger value of the `Period` parameter indicates that the monitoring data is distributed in a larger time range and the storage duration of the monitoring data is longer. The following list describes the specific relationships:
      * *   If the value of the `Period` parameter is less than 60 seconds, the storage duration is seven days.
      * *   If the value of the `Period` parameter is 60 seconds, the storage duration is 31 days.
      * *   If the value of the `Period` parameter is 300 seconds, the storage duration is 91 days.
      * ### [](#)Description
      * This topic provides an example on how to query the latest monitoring data of the `CPUUtilization` metric for Elastic Compute Service (ECS). The namespace of ECS is `acs_ecs_dashboard`. The returned result indicates that the monitoring data for the instance `i-abcdefgh12****` of the account `123456789876****` is queried at an interval of 60 seconds. The maximum, minimum, and average values of the metric are 100, 93.1, and 99.52.
      *
     */
    CompletableFuture<DescribeMetricLastResponse> describeMetricLast(DescribeMetricLastRequest request);

    /**
      * The name of the metric.
      * For more information about metric names, see [Appendix 1: Metrics](~~163515~~).
      *
     */
    CompletableFuture<DescribeMetricListResponse> describeMetricList(DescribeMetricListRequest request);

    /**
      * The namespace of the service.
      * For more information, see [Appendix 1: Metrics](~~163515~~).
      *
     */
    CompletableFuture<DescribeMetricMetaListResponse> describeMetricMetaList(DescribeMetricMetaListRequest request);

    CompletableFuture<DescribeMetricRuleBlackListResponse> describeMetricRuleBlackList(DescribeMetricRuleBlackListRequest request);

    CompletableFuture<DescribeMetricRuleCountResponse> describeMetricRuleCount(DescribeMetricRuleCountRequest request);

    /**
      * This topic provides an example on how to query all alert rules within your Alibaba Cloud account. The returned result shows that only one alert rule is found. The name of the alert rule is `Rule_01` and the ID is `applyTemplate344cfd42-0f32-4fd6-805a-88d7908a****`.
      *
     */
    CompletableFuture<DescribeMetricRuleListResponse> describeMetricRuleList(DescribeMetricRuleListRequest request);

    /**
      * The parameters of the alert callback. The parameters are in the JSON format.
      *
     */
    CompletableFuture<DescribeMetricRuleTargetsResponse> describeMetricRuleTargets(DescribeMetricRuleTargetsRequest request);

    /**
      * The operation that you want to perform. Set the value to DescribeMetricRuleTemplateAttribute.
      *
     */
    CompletableFuture<DescribeMetricRuleTemplateAttributeResponse> describeMetricRuleTemplateAttribute(DescribeMetricRuleTemplateAttributeRequest request);

    /**
      * This topic provides an example on how to query alert templates. In this example, the following alert templates are returned in the response: `ECS_Template1` and `ECS_Template2`.
      *
     */
    CompletableFuture<DescribeMetricRuleTemplateListResponse> describeMetricRuleTemplateList(DescribeMetricRuleTemplateListRequest request);

    /**
      * ### [](#)Limits
      * Each API operation can be called up to 10 times per second. An Alibaba Cloud account and the RAM users within the account share the quota.
      * ### [](#)Precautions
      * The storage duration of the monitoring data of each cloud service is related to the `Period` parameter (statistical period). A larger value of the `Period` parameter indicates that the monitoring data is distributed in a larger time range and the storage duration of the monitoring data is longer. The following list describes the specific relationships:
      * *   If the value of the `Period` parameter is less than 60 seconds, the storage duration is seven days.
      * *   If the value of the `Period` parameter is 60 seconds, the storage duration is 31 days.
      * *   If the value of the `Period` parameter is 300 seconds, the storage duration is 91 days.
      * ### [](#)Description
      * This topic provides an example to show how to query the monitoring data of the `cpu_idle` metric in the last 60 seconds for Elastic Compute Service (ECS). The namespace of ECS is `acs_ecs_dashboard`. The monitoring data is sorted in the descending order based on the `Average` field.
      *
     */
    CompletableFuture<DescribeMetricTopResponse> describeMetricTop(DescribeMetricTopRequest request);

    CompletableFuture<DescribeMonitorGroupCategoriesResponse> describeMonitorGroupCategories(DescribeMonitorGroupCategoriesRequest request);

    CompletableFuture<DescribeMonitorGroupDynamicRulesResponse> describeMonitorGroupDynamicRules(DescribeMonitorGroupDynamicRulesRequest request);

    CompletableFuture<DescribeMonitorGroupInstanceAttributeResponse> describeMonitorGroupInstanceAttribute(DescribeMonitorGroupInstanceAttributeRequest request);

    CompletableFuture<DescribeMonitorGroupInstancesResponse> describeMonitorGroupInstances(DescribeMonitorGroupInstancesRequest request);

    CompletableFuture<DescribeMonitorGroupNotifyPolicyListResponse> describeMonitorGroupNotifyPolicyList(DescribeMonitorGroupNotifyPolicyListRequest request);

    /**
      * This topic provides an example of how to query the application groups of the current account. The response shows that the current account has two application groups: `testGroup124` and `test123`.
      *
     */
    CompletableFuture<DescribeMonitorGroupsResponse> describeMonitorGroups(DescribeMonitorGroupsRequest request);

    CompletableFuture<DescribeMonitorResourceQuotaAttributeResponse> describeMonitorResourceQuotaAttribute(DescribeMonitorResourceQuotaAttributeRequest request);

    CompletableFuture<DescribeMonitoringAgentAccessKeyResponse> describeMonitoringAgentAccessKey(DescribeMonitoringAgentAccessKeyRequest request);

    CompletableFuture<DescribeMonitoringAgentConfigResponse> describeMonitoringAgentConfig(DescribeMonitoringAgentConfigRequest request);

    CompletableFuture<DescribeMonitoringAgentHostsResponse> describeMonitoringAgentHosts(DescribeMonitoringAgentHostsRequest request);

    /**
      * The operation that you want to perform. Set the value to DescribeMonitoringAgentProcesses.
      *
     */
    CompletableFuture<DescribeMonitoringAgentProcessesResponse> describeMonitoringAgentProcesses(DescribeMonitoringAgentProcessesRequest request);

    /**
      * This topic describes how to query the status of the CloudMonitor agent that is installed on the `i-hp3dunahluwajv6f****` instance. The result indicates that the CloudMonitor agent is in the `running` state.
      *
     */
    CompletableFuture<DescribeMonitoringAgentStatusesResponse> describeMonitoringAgentStatuses(DescribeMonitoringAgentStatusesRequest request);

    CompletableFuture<DescribeMonitoringConfigResponse> describeMonitoringConfig(DescribeMonitoringConfigRequest request);

    /**
      * The operation that you want to perform. Set the value to DescribeProductResourceTagKeyList.
      *
     */
    CompletableFuture<DescribeProductResourceTagKeyListResponse> describeProductResourceTagKeyList(DescribeProductResourceTagKeyListRequest request);

    CompletableFuture<DescribeProductsOfActiveMetricRuleResponse> describeProductsOfActiveMetricRule(DescribeProductsOfActiveMetricRuleRequest request);

    /**
      * The information obtained by this operation includes the service description, namespace, and tags.
      *
     */
    CompletableFuture<DescribeProjectMetaResponse> describeProjectMeta(DescribeProjectMetaRequest request);

    /**
      * The operation that you want to perform. Set the value to DescribeSiteMonitorAttribute.
      *
     */
    CompletableFuture<DescribeSiteMonitorAttributeResponse> describeSiteMonitorAttribute(DescribeSiteMonitorAttributeRequest request);

    CompletableFuture<DescribeSiteMonitorDataResponse> describeSiteMonitorData(DescribeSiteMonitorDataRequest request);

    /**
      * This topic provides an example on how to query the detection points that are provided by China Unicom in Guiyang.
      *
     */
    CompletableFuture<DescribeSiteMonitorISPCityListResponse> describeSiteMonitorISPCityList(DescribeSiteMonitorISPCityListRequest request);

    /**
      * The content of the HTTP request.
      *
     */
    CompletableFuture<DescribeSiteMonitorListResponse> describeSiteMonitorList(DescribeSiteMonitorListRequest request);

    /**
      * You can create an instant test task only by using the Alibaba Cloud account that you used to enable Network Analysis and Monitoring.
      * This topic provides an example to show how to query the logs of an instant test task whose ID is `afa5c3ce-f944-4363-9edb-ce919a29****`.
      *
     */
    CompletableFuture<DescribeSiteMonitorLogResponse> describeSiteMonitorLog(DescribeSiteMonitorLogRequest request);

    CompletableFuture<DescribeSiteMonitorQuotaResponse> describeSiteMonitorQuota(DescribeSiteMonitorQuotaRequest request);

    CompletableFuture<DescribeSiteMonitorStatisticsResponse> describeSiteMonitorStatistics(DescribeSiteMonitorStatisticsRequest request);

    CompletableFuture<DescribeSystemEventAttributeResponse> describeSystemEventAttribute(DescribeSystemEventAttributeRequest request);

    /**
      * The operation that you want to perform. Set the value to DescribeSystemEventCount.
      *
     */
    CompletableFuture<DescribeSystemEventCountResponse> describeSystemEventCount(DescribeSystemEventCountRequest request);

    CompletableFuture<DescribeSystemEventHistogramResponse> describeSystemEventHistogram(DescribeSystemEventHistogramRequest request);

    CompletableFuture<DescribeSystemEventMetaListResponse> describeSystemEventMetaList(DescribeSystemEventMetaListRequest request);

    CompletableFuture<DescribeTagKeyListResponse> describeTagKeyList(DescribeTagKeyListRequest request);

    /**
      * The operation that you want to perform. Set the value to DescribeTagValueList.
      *
     */
    CompletableFuture<DescribeTagValueListResponse> describeTagValueList(DescribeTagValueListRequest request);

    CompletableFuture<DescribeUnhealthyHostAvailabilityResponse> describeUnhealthyHostAvailability(DescribeUnhealthyHostAvailabilityRequest request);

    CompletableFuture<DisableActiveMetricRuleResponse> disableActiveMetricRule(DisableActiveMetricRuleRequest request);

    CompletableFuture<DisableEventRulesResponse> disableEventRules(DisableEventRulesRequest request);

    CompletableFuture<DisableHostAvailabilityResponse> disableHostAvailability(DisableHostAvailabilityRequest request);

    CompletableFuture<DisableMetricRulesResponse> disableMetricRules(DisableMetricRulesRequest request);

    CompletableFuture<DisableSiteMonitorsResponse> disableSiteMonitors(DisableSiteMonitorsRequest request);

    CompletableFuture<EnableActiveMetricRuleResponse> enableActiveMetricRule(EnableActiveMetricRuleRequest request);

    CompletableFuture<EnableEventRulesResponse> enableEventRules(EnableEventRulesRequest request);

    CompletableFuture<EnableHostAvailabilityResponse> enableHostAvailability(EnableHostAvailabilityRequest request);

    CompletableFuture<EnableMetricRuleBlackListResponse> enableMetricRuleBlackList(EnableMetricRuleBlackListRequest request);

    CompletableFuture<EnableMetricRulesResponse> enableMetricRules(EnableMetricRulesRequest request);

    CompletableFuture<EnableSiteMonitorsResponse> enableSiteMonitors(EnableSiteMonitorsRequest request);

    /**
      * Indicates whether the call was successful. Valid values:
      * *   true: The call was successful.
      * *   false: The call failed.
      *
     */
    CompletableFuture<InstallMonitoringAgentResponse> installMonitoringAgent(InstallMonitoringAgentRequest request);

    CompletableFuture<ModifyGroupMonitoringAgentProcessResponse> modifyGroupMonitoringAgentProcess(ModifyGroupMonitoringAgentProcessRequest request);

    /**
      * This topic provides an example on how to change the name of an availability monitoring task named `12345` in an application group named `123456` to `task2`.
      *
     */
    CompletableFuture<ModifyHostAvailabilityResponse> modifyHostAvailability(ModifyHostAvailabilityRequest request);

    /**
      * ****
      *
     */
    CompletableFuture<ModifyHostInfoResponse> modifyHostInfo(ModifyHostInfoRequest request);

    /**
      * Indicates whether the call was successful. Valid values:
      * *   true: The call was successful.
      * *   false: The call failed.
      *
     */
    CompletableFuture<ModifyHybridMonitorNamespaceResponse> modifyHybridMonitorNamespace(ModifyHybridMonitorNamespaceRequest request);

    /**
      * The Log Service projects.
      * Valid values of N: 1 to 25.
      *
     */
    CompletableFuture<ModifyHybridMonitorSLSGroupResponse> modifyHybridMonitorSLSGroup(ModifyHybridMonitorSLSGroupRequest request);

    /**
      * This topic provides an example on how to change the collection period of a metric import task whose ID is `36****` to `15` seconds. The task is used to monitor the logs that are imported from Log Service. The returned result indicates that the metric is modified.
      *
     */
    CompletableFuture<ModifyHybridMonitorTaskResponse> modifyHybridMonitorTask(ModifyHybridMonitorTaskRequest request);

    CompletableFuture<ModifyMetricRuleBlackListResponse> modifyMetricRuleBlackList(ModifyMetricRuleBlackListRequest request);

    /**
      * Indicates whether the call was successful. Valid values:
      * *   true: The call was successful.
      * *   false: The call failed.
      *
     */
    CompletableFuture<ModifyMetricRuleTemplateResponse> modifyMetricRuleTemplate(ModifyMetricRuleTemplateRequest request);

    CompletableFuture<ModifyMonitorGroupResponse> modifyMonitorGroup(ModifyMonitorGroupRequest request);

    CompletableFuture<ModifyMonitorGroupInstancesResponse> modifyMonitorGroupInstances(ModifyMonitorGroupInstancesRequest request);

    /**
      * The number of site monitoring tasks.
      *
     */
    CompletableFuture<ModifySiteMonitorResponse> modifySiteMonitor(ModifySiteMonitorRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<OpenCmsServiceResponse> openCmsService(OpenCmsServiceRequest request);

    CompletableFuture<PutContactResponse> putContact(PutContactRequest request);

    /**
      * The operation that you want to perform. Set the value to PutContactGroup.
      *
     */
    CompletableFuture<PutContactGroupResponse> putContactGroup(PutContactGroupRequest request);

    CompletableFuture<PutCustomEventResponse> putCustomEvent(PutCustomEventRequest request);

    /**
      * The operation that you want to perform. Set the value to PutCustomEventRule.
      *
     */
    CompletableFuture<PutCustomEventRuleResponse> putCustomEventRule(PutCustomEventRuleRequest request);

    /**
      * The dimensions that specify the resources whose monitoring data you want to query. Valid values of N: 1 to 21.
      * Set the value to a collection of key-value pairs. Format:`{"Key":"Value"}`.
      * The key or value must be 1 to 64 bytes in length. Excessive characters are truncated.
      * The key or value can contain letters, digits, periods (.), hyphens (-), underscores (\\_), forward slashes (/), and backslashes (\\\\).
      * >  Dimensions must be formatted as a JSON string in a specified order.
      *
     */
    CompletableFuture<PutCustomMetricResponse> putCustomMetric(PutCustomMetricRequest request);

    /**
      * The operation that you want to perform. Set the value to PutCustomMetricRule.
      *
     */
    CompletableFuture<PutCustomMetricRuleResponse> putCustomMetricRule(PutCustomMetricRuleRequest request);

    /**
      * The ID of the application group to which the event-triggered alert rule belongs.
      *
     */
    CompletableFuture<PutEventRuleResponse> putEventRule(PutEventRuleRequest request);

    CompletableFuture<PutEventRuleTargetsResponse> putEventRuleTargets(PutEventRuleTargetsRequest request);

    /**
      * > The monitoring data can be exported only to Log Service. More services will be supported in the future.
      *
     */
    CompletableFuture<PutExporterOutputResponse> putExporterOutput(PutExporterOutputRequest request);

    CompletableFuture<PutExporterRuleResponse> putExporterRule(PutExporterRuleRequest request);

    /**
      * This topic provides an example on how to create an alert rule for the `cpu_total` metric of Elastic Compute Service (ECS) in the `17285****` application group. The ID of the alert rule is `123456`. The name of the alert rule is `Rule_test`. The alert level is `Critical`. The statistical method is `Average`. The alert threshold comparator is `GreaterThanOrEqualToThreshold`. The alert threshold is `90`. The number of alert retries is `3`. The returned result shows that the alert rule is created and the alert rule ID is `123456`.
      *
     */
    CompletableFuture<PutGroupMetricRuleResponse> putGroupMetricRule(PutGroupMetricRuleRequest request);

    /**
      * # [](#)Prerequisites
      * Hybrid Cloud Monitoring is activated. For more information, see [Activate Hybrid Cloud Monitoring](~~250773~~).
      * # [](#)Limits
      * The size of the monitoring data that you import at a time must be less than or equal to 1 MB.
      * # [](#)Description
      * This topic provides an example on how to import the monitoring data of the `CPU_Usage` metric to the `default-aliyun` namespace of Hybrid Cloud Monitoring.
      *
     */
    CompletableFuture<PutHybridMonitorMetricDataResponse> putHybridMonitorMetricData(PutHybridMonitorMetricDataRequest request);

    /**
      * The name of the log field that is used for matching in the filter condition. Valid values of N: 1 to 10.
      *
     */
    CompletableFuture<PutLogMonitorResponse> putLogMonitor(PutLogMonitorRequest request);

    /**
      * Indicates whether the call was successful. Valid values:
      * *   true: The call was successful.
      * *   false: The call failed.
      *
     */
    CompletableFuture<PutMetricRuleTargetsResponse> putMetricRuleTargets(PutMetricRuleTargetsRequest request);

    CompletableFuture<PutMonitorGroupDynamicRuleResponse> putMonitorGroupDynamicRule(PutMonitorGroupDynamicRuleRequest request);

    CompletableFuture<PutMonitoringConfigResponse> putMonitoringConfig(PutMonitoringConfigRequest request);

    /**
      * This topic provides an example to show how to create a threshold-triggered alert rule for the `cpu_total` metric of an Elastic Compute Service (ECS) instance whose ID is `i-uf6j91r34rnwawoo****`. The namespace of ECS is `acs_ecs_dashboard`. The alert contact group of the alert rule is `ECS_Group`. The name of the alert rule is `test123`. The ID of the alert rule is `a151cd6023eacee2f0978e03863cc1697c89508****`. The statistical method for Critical-level alerts is `Average`. The comparison operator for Critical-level alerts is `GreaterThanOrEqualToThreshold`. The threshold for Critical-level alerts is `90`. The consecutive number of times for which the metric value meets the trigger condition before a Critical-level alert is triggered is `3`.
      *
     */
    CompletableFuture<PutResourceMetricRuleResponse> putResourceMetricRule(PutResourceMetricRuleRequest request);

    /**
      * Indicates whether the call was successful. Valid values:
      * *   true: The call was successful.
      * *   false: The call failed.
      *
     */
    CompletableFuture<PutResourceMetricRulesResponse> putResourceMetricRules(PutResourceMetricRulesRequest request);

    CompletableFuture<RemoveTagsResponse> removeTags(RemoveTagsRequest request);

    /**
      * The name of the cloud service.
      * >  For information about the system events supported by Cloud Monitor for Alibaba Cloud services, see [System events](~~167388~~).
      *
     */
    CompletableFuture<SendDryRunSystemEventResponse> sendDryRunSystemEvent(SendDryRunSystemEventRequest request);

    /**
      * The operation that you want to perform. Set the value to UninstallMonitoringAgent.
      *
     */
    CompletableFuture<UninstallMonitoringAgentResponse> uninstallMonitoringAgent(UninstallMonitoringAgentRequest request);

}
