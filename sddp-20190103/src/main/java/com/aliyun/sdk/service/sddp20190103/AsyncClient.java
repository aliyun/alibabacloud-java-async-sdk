// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.sddp20190103.models.*;
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
      * You can call this operation to create or restore configurations based on the codes of common configuration items. This allows you to manage the configurations of common configuration items.
      * # Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<CreateConfigResponse> createConfig(CreateConfigRequest request);

    /**
      * You can call this operation to authorize DSC to scan data assets to ensure the security of the data assets.
      * # Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<CreateDataLimitResponse> createDataLimit(CreateDataLimitRequest request);

    CompletableFuture<CreateRuleResponse> createRule(CreateRuleRequest request);

    /**
      * You can call this operation to create a custom scan task for authorized data assets. You can customize the interval between two consecutive scan tasks and the time when the scan task is executed next time.
      * # Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<CreateScanTaskResponse> createScanTask(CreateScanTaskRequest request);

    /**
      * You can call this operation to allow DSC to access the data assets in services such as Object Storage Service (OSS), ApsaraDB RDS, and MaxCompute. After you call this operation, the system automatically creates a service-linked role named AliyunServiceRoleForSDDP and attaches the AliyunServiceRolePolicyForSDDP policy to the role.
      * # Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<CreateSlrRoleResponse> createSlrRole(CreateSlrRoleRequest request);

    /**
      * You can call this operation to revoke the permissions on a data asset from Data Security Center (DSC).
      * # Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DeleteDataLimitResponse> deleteDataLimit(DeleteDataLimitRequest request);

    CompletableFuture<DeleteRuleResponse> deleteRule(DeleteRuleRequest request);

    CompletableFuture<DescribeCategoryTemplateListResponse> describeCategoryTemplateList(DescribeCategoryTemplateListRequest request);

    /**
      * You can call this operation to query rules in a classification template.
      * # Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeCategoryTemplateRuleListResponse> describeCategoryTemplateRuleList(DescribeCategoryTemplateRuleListRequest request);

    /**
      * You can call this operation to query the data in columns of a table that may contain sensitive data. This helps you analyze sensitive data.
      * ## [](#)Precautions
      * The DescribeColumns operation is changed to DescribeColumnsV2. We recommend that you call the DescribeColumnsV2 operation when you develop your applications.
      * ## [](#qps)Limits
      * Each Alibaba Cloud account can call this operation up to 10 times per second. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeColumnsResponse> describeColumns(DescribeColumnsRequest request);

    CompletableFuture<DescribeColumnsV2Response> describeColumnsV2(DescribeColumnsV2Request request);

    CompletableFuture<DescribeConfigsResponse> describeConfigs(DescribeConfigsRequest request);

    CompletableFuture<DescribeDataAssetsResponse> describeDataAssets(DescribeDataAssetsRequest request);

    CompletableFuture<DescribeDataLimitDetailResponse> describeDataLimitDetail(DescribeDataLimitDetailRequest request);

    /**
      * You can call this operation to query the data assets that are authorized to be scanned. This facilitates resource search and aggregation.
      * # Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeDataLimitSetResponse> describeDataLimitSet(DescribeDataLimitSetRequest request);

    CompletableFuture<DescribeDataLimitsResponse> describeDataLimits(DescribeDataLimitsRequest request);

    /**
      * You can call this operation to query the execution information of a static de-identification task, including the status and progress.
      * # Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeDataMaskingRunHistoryResponse> describeDataMaskingRunHistory(DescribeDataMaskingRunHistoryRequest request);

    /**
      * You can call this operation to query static de-identification tasks. This facilitates task queries and management.
      * # Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeDataMaskingTasksResponse> describeDataMaskingTasks(DescribeDataMaskingTasksRequest request);

    CompletableFuture<DescribeDataObjectColumnDetailResponse> describeDataObjectColumnDetail(DescribeDataObjectColumnDetailRequest request);

    CompletableFuture<DescribeDataObjectColumnDetailV2Response> describeDataObjectColumnDetailV2(DescribeDataObjectColumnDetailV2Request request);

    CompletableFuture<DescribeDataObjectsResponse> describeDataObjects(DescribeDataObjectsRequest request);

    CompletableFuture<DescribeDocTypesResponse> describeDocTypes(DescribeDocTypesRequest request);

    CompletableFuture<DescribeEventDetailResponse> describeEventDetail(DescribeEventDetailRequest request);

    CompletableFuture<DescribeEventTypesResponse> describeEventTypes(DescribeEventTypesRequest request);

    /**
      * You can call this operation to query anomalous events that may involve data leaks. This helps you search for and handle anomalous events.
      * # Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeEventsResponse> describeEvents(DescribeEventsRequest request);

    /**
      * You can query a list of unauthorized or authorized data assets based on the value of AuthStatus.
      * This operation is no longer used for the KMS console of the new version.
      * # [](#qps-)QPS limits
      * This operation can be called up to 10 times per second for each Alibaba Cloud account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeInstanceSourcesResponse> describeInstanceSources(DescribeInstanceSourcesRequest request);

    /**
      * When you call the DescribeInstances operation, you can specify parameters such as Name and RiskLevelId to query data assets that meet filter conditions.
      * # Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeInstancesResponse> describeInstances(DescribeInstancesRequest request);

    /**
      * You can call this operation to query the details of an Object Storage Service (OSS) object. This helps you locate sensitive data detected in OSS.
      * ## [](#)Precautions
      * The DescribeOssObjectDetail operation is chagned to DescribeOssObjectDetailV2. We recommend that you call the DescribeOssObjectDetailV2 operation when you develop your applications.
      * ## [](#qps)Limits
      * Each Alibaba Cloud account can call this operation up to 10 times per second. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeOssObjectDetailResponse> describeOssObjectDetail(DescribeOssObjectDetailRequest request);

    CompletableFuture<DescribeOssObjectDetailV2Response> describeOssObjectDetailV2(DescribeOssObjectDetailV2Request request);

    CompletableFuture<DescribeOssObjectsResponse> describeOssObjects(DescribeOssObjectsRequest request);

    /**
      * You can call this operation to query MaxCompute packages that are scanned by DSC. This helps you search for MaxCompute packages and view the summary of MaxCompute packages.
      * # Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribePackagesResponse> describePackages(DescribePackagesRequest request);

    CompletableFuture<DescribeParentInstanceResponse> describeParentInstance(DescribeParentInstanceRequest request);

    /**
      * You can call this operation to query the sensitivity levels that are defined in the current rule template provided by DSC. This helps you learn about the number of times that each sensitivity level is referenced in the rule template and the highest sensitivity level.
      * # Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeRiskLevelsResponse> describeRiskLevels(DescribeRiskLevelsRequest request);

    CompletableFuture<DescribeRulesResponse> describeRules(DescribeRulesRequest request);

    /**
      * When you call the DescribeTables operation to query tables, you can specify parameters such as Name and RiskLevelId to filter tables.
      * # Limits
      * You can send up to 10 requests per second to call this operation by using your Alibaba Cloud account. If you send excessive requests, throttling is implemented, and your business may be affected.
      *
     */
    CompletableFuture<DescribeTablesResponse> describeTables(DescribeTablesRequest request);

    CompletableFuture<DescribeTemplateAllRulesResponse> describeTemplateAllRules(DescribeTemplateAllRulesRequest request);

    /**
      * You can call this operation to query the information about the current account. This helps you get familiar with your account that accesses Data Security Center (DSC).
      * # Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeUserStatusResponse> describeUserStatus(DescribeUserStatusRequest request);

    /**
      * You can call this operation to disable a configuration item based on the code of the configuration item. This helps you modify configurations at the earliest opportunity.
      * # Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DisableUserConfigResponse> disableUserConfig(DisableUserConfigRequest request);

    CompletableFuture<ExecDatamaskResponse> execDatamask(ExecDatamaskRequest request);

    CompletableFuture<ManualTriggerMaskingProcessResponse> manualTriggerMaskingProcess(ManualTriggerMaskingProcessRequest request);

    CompletableFuture<ModifyDataLimitResponse> modifyDataLimit(ModifyDataLimitRequest request);

    /**
      * You can call this operation to modify the sensitivity levels of data. This helps you manage the sensitivity levels.
      * # Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<ModifyDefaultLevelResponse> modifyDefaultLevel(ModifyDefaultLevelRequest request);

    /**
      * You can call this operation to handle anomalous events that involve data leaks. This helps protect your data assets at the earliest opportunity.
      * # Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<ModifyEventStatusResponse> modifyEventStatus(ModifyEventStatusRequest request);

    CompletableFuture<ModifyEventTypeStatusResponse> modifyEventTypeStatus(ModifyEventTypeStatusRequest request);

    /**
      * You can call this operation to enable or disable the report task. After you activate Data Security Center (DSC), the report task is enabled by default. After you disable the report task, you cannot view statistics that are newly generated in the Report Center module, on the Overview page of the Cloud Native Data Audit module, and in the Data security lab module. Existing statistics are not affected.
      * # Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<ModifyReportTaskStatusResponse> modifyReportTaskStatus(ModifyReportTaskStatusRequest request);

    /**
      * When you call this operation, you must configure request parameters to specify the rule name, rule ID, and rule content.
      * # Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<ModifyRuleResponse> modifyRule(ModifyRuleRequest request);

    CompletableFuture<ModifyRuleStatusResponse> modifyRuleStatus(ModifyRuleStatusRequest request);

    CompletableFuture<ScanOssObjectV1Response> scanOssObjectV1(ScanOssObjectV1Request request);

    /**
      * You can call this operation to stop a de-identification task that is running. For example, you can stop a de-identification task that is used to de-identify specific data.
      * # Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<StopMaskingProcessResponse> stopMaskingProcess(StopMaskingProcessRequest request);

}
