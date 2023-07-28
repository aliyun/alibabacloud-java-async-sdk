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
      * Indicates whether the call was successful. Valid values:
      * *   true: The call was successful.
      * *   false: The call failed.
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
      * The ID of the resource for which alerts are triggered.
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
      * You can create an instant test task only by using the Alibaba Cloud account that you used to enable Network Analysis and Monitoring. For more information, see [Billing of Network Analysis and Monitoring](~~341649~~).
      * This topic provides an example to show how to create an instant test task. The name of the task is `task1`. The tested address is `http://www.aliyun.com`. The test type is `HTTP`. The number of detection points is `1`.
      *
     */
    CompletableFuture<CreateInstantSiteMonitorResponse> createInstantSiteMonitor(CreateInstantSiteMonitorRequest request);

    /**
      * The name of the metric.
      * Valid values of N: 1 to 10
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
      * The ID of the region where the resource group resides.
      * For information about how to obtain the ID of the region where a resource group resides, see [GetResourceGroup](~~158866~~).
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
      * Indicates whether the call was successful. Valid values:
      * *   true: The call was successful.
      * *   false: The call failed.
      *
     */
    CompletableFuture<CreateSiteMonitorResponse> createSiteMonitor(CreateSiteMonitorRequest request);

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
      * Indicates whether the call is successful. Valid values:
      * *   true: The call is successful.
      * *   false: The call fails.
      *
     */
    CompletableFuture<DeleteHybridMonitorSLSGroupResponse> deleteHybridMonitorSLSGroup(DeleteHybridMonitorSLSGroupRequest request);

    /**
      * Indicates whether the call was successful. Valid values:
      * *   true: The call was successful.
      * *   false: The call failed.
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
      * The operation that you want to perform. Set the value to DescribeAlertLogHistogram.
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
      * The name of the event-triggered alert rule.
      * For information about how to obtain the name of an event-triggered alert rule, see [DescribeEventRuleList](~~114996~~).
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
      * Indicates whether the call is successful. Valid values:
      * *   true: The call is successful.
      * *   false: The call fails.
      *
     */
    CompletableFuture<DescribeHybridMonitorSLSGroupResponse> describeHybridMonitorSLSGroup(DescribeHybridMonitorSLSGroupRequest request);

    /**
      * Indicates whether the call was successful. Valid values:
      * *   true: The call was successful.
      * *   false: The call failed.
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
      * The number of entries to return on each page.
      * Default value: 1000. This value indicates that a maximum of 1,000 entries of monitoring data can be returned on each page.
      * >  The maximum value of the Length parameter in a request is 1440.
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
      * The HTTP status code.
      * >  The status code 200 indicates that the call was successful.
      *
     */
    CompletableFuture<DescribeMetricRuleTemplateListResponse> describeMetricRuleTemplateList(DescribeMetricRuleTemplateListRequest request);

    /**
      * The order in which data is sorted. Valid values:
      * *   True: sorts data in ascending order.
      * *   False (default value): sorts data in descending order.
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
      * The details of the execution error. Valid values:
      * *   `Command.ErrorCode.Fail.Downlaod.REGIN_ID`: Failed to obtain the region ID.
      * *   `Command.ErrorCode.Fail.Downlaod.SYSAK`: Failed to download the .rpm package of System Analyse Kit (SysAK).
      * *   `Command.ErrorCode.Fail.Downlaod.CMON_FILE`: Failed to download the CMON file.
      * *   `Command.ErrorCode.Fail.Downlaod.BTF`: Failed to start SysAK because the BTF file is not found.
      * *   `Command.ErrorCode.Fail.Start.SYSAK`: Failed to start SysAK due to an unknown error.
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
      * You can create an instant test task only by using the Alibaba Cloud account that you used to enable Network Analysis and Monitoring. For more information, see [Billing of Network Analysis and Monitoring](~~341649~~).
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
      * Indicates whether the call was successful. Valid values:
      * *   true: The call was successful.
      * *   false: The call failed.
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
      * The alias of the extended field that specifies the result of basic operations performed on aggregation results.
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
      * Indicates whether the call was successful. Valid values:
      * *   true: The call was successful.
      * *   false: The call failed.
      *
     */
    CompletableFuture<PutGroupMetricRuleResponse> putGroupMetricRule(PutGroupMetricRuleRequest request);

    /**
      * The tag value of the metric.
      * Valid values of N: 1 to 100.
      * >  You must specify a key and a value for a tag at the same time.
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
      * The mute period during which new alerts are not sent even if the trigger conditions are met. Unit: seconds. Default value: 86400.
      * >  If an alert is not cleared within the mute period, a new alert notification is sent when the mute period ends.
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
