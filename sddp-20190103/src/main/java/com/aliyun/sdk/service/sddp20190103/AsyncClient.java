// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.sddp20190103.models.*;
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

    CompletableFuture<CreateConfigResponse> createConfig(CreateConfigRequest request);

    CompletableFuture<CreateDataLimitResponse> createDataLimit(CreateDataLimitRequest request);

    CompletableFuture<CreateRuleResponse> createRule(CreateRuleRequest request);

    CompletableFuture<CreateScanTaskResponse> createScanTask(CreateScanTaskRequest request);

    CompletableFuture<CreateSlrRoleResponse> createSlrRole(CreateSlrRoleRequest request);

    CompletableFuture<DeleteDataLimitResponse> deleteDataLimit(DeleteDataLimitRequest request);

    CompletableFuture<DeleteRuleResponse> deleteRule(DeleteRuleRequest request);

    CompletableFuture<DescribeCategoryTemplateRuleListResponse> describeCategoryTemplateRuleList(DescribeCategoryTemplateRuleListRequest request);

    CompletableFuture<DescribeColumnsResponse> describeColumns(DescribeColumnsRequest request);

    CompletableFuture<DescribeConfigsResponse> describeConfigs(DescribeConfigsRequest request);

    CompletableFuture<DescribeDataAssetsResponse> describeDataAssets(DescribeDataAssetsRequest request);

    CompletableFuture<DescribeDataLimitDetailResponse> describeDataLimitDetail(DescribeDataLimitDetailRequest request);

    CompletableFuture<DescribeDataLimitSetResponse> describeDataLimitSet(DescribeDataLimitSetRequest request);

    CompletableFuture<DescribeDataLimitsResponse> describeDataLimits(DescribeDataLimitsRequest request);

    CompletableFuture<DescribeDataMaskingRunHistoryResponse> describeDataMaskingRunHistory(DescribeDataMaskingRunHistoryRequest request);

    CompletableFuture<DescribeDataMaskingTasksResponse> describeDataMaskingTasks(DescribeDataMaskingTasksRequest request);

    CompletableFuture<DescribeEventDetailResponse> describeEventDetail(DescribeEventDetailRequest request);

    CompletableFuture<DescribeEventTypesResponse> describeEventTypes(DescribeEventTypesRequest request);

    CompletableFuture<DescribeEventsResponse> describeEvents(DescribeEventsRequest request);

    CompletableFuture<DescribeInstanceSourcesResponse> describeInstanceSources(DescribeInstanceSourcesRequest request);

    CompletableFuture<DescribeInstancesResponse> describeInstances(DescribeInstancesRequest request);

    CompletableFuture<DescribeOssObjectDetailResponse> describeOssObjectDetail(DescribeOssObjectDetailRequest request);

    CompletableFuture<DescribeOssObjectsResponse> describeOssObjects(DescribeOssObjectsRequest request);

    CompletableFuture<DescribePackagesResponse> describePackages(DescribePackagesRequest request);

    CompletableFuture<DescribeRiskLevelsResponse> describeRiskLevels(DescribeRiskLevelsRequest request);

    CompletableFuture<DescribeRulesResponse> describeRules(DescribeRulesRequest request);

    CompletableFuture<DescribeTablesResponse> describeTables(DescribeTablesRequest request);

    CompletableFuture<DescribeUserStatusResponse> describeUserStatus(DescribeUserStatusRequest request);

    CompletableFuture<DisableUserConfigResponse> disableUserConfig(DisableUserConfigRequest request);

    CompletableFuture<ExecDatamaskResponse> execDatamask(ExecDatamaskRequest request);

    CompletableFuture<ManualTriggerMaskingProcessResponse> manualTriggerMaskingProcess(ManualTriggerMaskingProcessRequest request);

    CompletableFuture<ModifyDataLimitResponse> modifyDataLimit(ModifyDataLimitRequest request);

    CompletableFuture<ModifyDefaultLevelResponse> modifyDefaultLevel(ModifyDefaultLevelRequest request);

    CompletableFuture<ModifyEventStatusResponse> modifyEventStatus(ModifyEventStatusRequest request);

    CompletableFuture<ModifyEventTypeStatusResponse> modifyEventTypeStatus(ModifyEventTypeStatusRequest request);

    CompletableFuture<ModifyReportTaskStatusResponse> modifyReportTaskStatus(ModifyReportTaskStatusRequest request);

    CompletableFuture<ModifyRuleResponse> modifyRule(ModifyRuleRequest request);

    CompletableFuture<ModifyRuleStatusResponse> modifyRuleStatus(ModifyRuleStatusRequest request);

    CompletableFuture<StopMaskingProcessResponse> stopMaskingProcess(StopMaskingProcessRequest request);

}
