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
     * <b>description</b> :
     * <p>You can call this operation to create or restore configurations based on the codes of common configuration items. This allows you to manage the configurations of common configuration items.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateConfig  CreateConfigRequest
     * @return CreateConfigResponse
     */
    CompletableFuture<CreateConfigResponse> createConfig(CreateConfigRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to authorize DSC to scan data assets to ensure the security of the data assets.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateDataLimit  CreateDataLimitRequest
     * @return CreateDataLimitResponse
     */
    CompletableFuture<CreateDataLimitResponse> createDataLimit(CreateDataLimitRequest request);

    /**
     * @param request the request parameters of CreateRule  CreateRuleRequest
     * @return CreateRuleResponse
     */
    CompletableFuture<CreateRuleResponse> createRule(CreateRuleRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to create a custom scan task for authorized data assets. You can customize the interval between two consecutive scan tasks and the time when the scan task is executed next time.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateScanTask  CreateScanTaskRequest
     * @return CreateScanTaskResponse
     */
    CompletableFuture<CreateScanTaskResponse> createScanTask(CreateScanTaskRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to allow DSC to access the data assets in services such as Object Storage Service (OSS), ApsaraDB RDS, and MaxCompute. After you call this operation, the system automatically creates a service-linked role named AliyunServiceRoleForSDDP and attaches the AliyunServiceRolePolicyForSDDP policy to the role.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateSlrRole  CreateSlrRoleRequest
     * @return CreateSlrRoleResponse
     */
    CompletableFuture<CreateSlrRoleResponse> createSlrRole(CreateSlrRoleRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to revoke the permissions on a data asset from Data Security Center (DSC).</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteDataLimit  DeleteDataLimitRequest
     * @return DeleteDataLimitResponse
     */
    CompletableFuture<DeleteDataLimitResponse> deleteDataLimit(DeleteDataLimitRequest request);

    /**
     * @param request the request parameters of DeleteRule  DeleteRuleRequest
     * @return DeleteRuleResponse
     */
    CompletableFuture<DeleteRuleResponse> deleteRule(DeleteRuleRequest request);

    /**
     * @param request the request parameters of DescribeCategoryTemplateList  DescribeCategoryTemplateListRequest
     * @return DescribeCategoryTemplateListResponse
     */
    CompletableFuture<DescribeCategoryTemplateListResponse> describeCategoryTemplateList(DescribeCategoryTemplateListRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query rules in a classification template.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeCategoryTemplateRuleList  DescribeCategoryTemplateRuleListRequest
     * @return DescribeCategoryTemplateRuleListResponse
     */
    CompletableFuture<DescribeCategoryTemplateRuleListResponse> describeCategoryTemplateRuleList(DescribeCategoryTemplateRuleListRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the data in columns of a table that may contain sensitive data. This helps you analyze sensitive data.</p>
     * <h2><a href="#"></a>Precautions</h2>
     * <p>The DescribeColumns operation is changed to DescribeColumnsV2. We recommend that you call the DescribeColumnsV2 operation when you develop your applications.</p>
     * <h2><a href="#qps"></a>Limits</h2>
     * <p>Each Alibaba Cloud account can call this operation up to 10 times per second. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeColumns  DescribeColumnsRequest
     * @return DescribeColumnsResponse
     */
    CompletableFuture<DescribeColumnsResponse> describeColumns(DescribeColumnsRequest request);

    /**
     * @param request the request parameters of DescribeColumnsV2  DescribeColumnsV2Request
     * @return DescribeColumnsV2Response
     */
    CompletableFuture<DescribeColumnsV2Response> describeColumnsV2(DescribeColumnsV2Request request);

    /**
     * @param request the request parameters of DescribeConfigs  DescribeConfigsRequest
     * @return DescribeConfigsResponse
     */
    CompletableFuture<DescribeConfigsResponse> describeConfigs(DescribeConfigsRequest request);

    /**
     * @param request the request parameters of DescribeDataAssets  DescribeDataAssetsRequest
     * @return DescribeDataAssetsResponse
     */
    CompletableFuture<DescribeDataAssetsResponse> describeDataAssets(DescribeDataAssetsRequest request);

    /**
     * @param request the request parameters of DescribeDataLimitDetail  DescribeDataLimitDetailRequest
     * @return DescribeDataLimitDetailResponse
     */
    CompletableFuture<DescribeDataLimitDetailResponse> describeDataLimitDetail(DescribeDataLimitDetailRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the data assets that are authorized to be scanned. This facilitates resource search and aggregation.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeDataLimitSet  DescribeDataLimitSetRequest
     * @return DescribeDataLimitSetResponse
     */
    CompletableFuture<DescribeDataLimitSetResponse> describeDataLimitSet(DescribeDataLimitSetRequest request);

    /**
     * @param request the request parameters of DescribeDataLimits  DescribeDataLimitsRequest
     * @return DescribeDataLimitsResponse
     */
    CompletableFuture<DescribeDataLimitsResponse> describeDataLimits(DescribeDataLimitsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the execution information of a static de-identification task, including the status and progress.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeDataMaskingRunHistory  DescribeDataMaskingRunHistoryRequest
     * @return DescribeDataMaskingRunHistoryResponse
     */
    CompletableFuture<DescribeDataMaskingRunHistoryResponse> describeDataMaskingRunHistory(DescribeDataMaskingRunHistoryRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query static de-identification tasks. This facilitates task queries and management.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeDataMaskingTasks  DescribeDataMaskingTasksRequest
     * @return DescribeDataMaskingTasksResponse
     */
    CompletableFuture<DescribeDataMaskingTasksResponse> describeDataMaskingTasks(DescribeDataMaskingTasksRequest request);

    /**
     * @param request the request parameters of DescribeDataObjectColumnDetail  DescribeDataObjectColumnDetailRequest
     * @return DescribeDataObjectColumnDetailResponse
     */
    CompletableFuture<DescribeDataObjectColumnDetailResponse> describeDataObjectColumnDetail(DescribeDataObjectColumnDetailRequest request);

    /**
     * @param request the request parameters of DescribeDataObjectColumnDetailV2  DescribeDataObjectColumnDetailV2Request
     * @return DescribeDataObjectColumnDetailV2Response
     */
    CompletableFuture<DescribeDataObjectColumnDetailV2Response> describeDataObjectColumnDetailV2(DescribeDataObjectColumnDetailV2Request request);

    /**
     * @param request the request parameters of DescribeDataObjects  DescribeDataObjectsRequest
     * @return DescribeDataObjectsResponse
     */
    CompletableFuture<DescribeDataObjectsResponse> describeDataObjects(DescribeDataObjectsRequest request);

    /**
     * @param request the request parameters of DescribeDocTypes  DescribeDocTypesRequest
     * @return DescribeDocTypesResponse
     */
    CompletableFuture<DescribeDocTypesResponse> describeDocTypes(DescribeDocTypesRequest request);

    /**
     * @param request the request parameters of DescribeEventDetail  DescribeEventDetailRequest
     * @return DescribeEventDetailResponse
     */
    CompletableFuture<DescribeEventDetailResponse> describeEventDetail(DescribeEventDetailRequest request);

    /**
     * @param request the request parameters of DescribeEventTypes  DescribeEventTypesRequest
     * @return DescribeEventTypesResponse
     */
    CompletableFuture<DescribeEventTypesResponse> describeEventTypes(DescribeEventTypesRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query anomalous events that may involve data leaks. This helps you search for and handle anomalous events.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeEvents  DescribeEventsRequest
     * @return DescribeEventsResponse
     */
    CompletableFuture<DescribeEventsResponse> describeEvents(DescribeEventsRequest request);

    /**
     * @param request the request parameters of DescribeIdentifyTaskStatus  DescribeIdentifyTaskStatusRequest
     * @return DescribeIdentifyTaskStatusResponse
     */
    CompletableFuture<DescribeIdentifyTaskStatusResponse> describeIdentifyTaskStatus(DescribeIdentifyTaskStatusRequest request);

    /**
     * <b>description</b> :
     * <p>You can query a list of unauthorized or authorized data assets based on the value of AuthStatus.
     * This operation is no longer used for the KMS console of the new version.</p>
     * <h1><a href="#qps-"></a>QPS limits</h1>
     * <p>This operation can be called up to 10 times per second for each Alibaba Cloud account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeInstanceSources  DescribeInstanceSourcesRequest
     * @return DescribeInstanceSourcesResponse
     */
    CompletableFuture<DescribeInstanceSourcesResponse> describeInstanceSources(DescribeInstanceSourcesRequest request);

    /**
     * <b>description</b> :
     * <p>When you call the DescribeInstances operation, you can specify parameters such as Name and RiskLevelId to query data assets that meet filter conditions.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeInstances  DescribeInstancesRequest
     * @return DescribeInstancesResponse
     */
    CompletableFuture<DescribeInstancesResponse> describeInstances(DescribeInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of an Object Storage Service (OSS) object. This helps you locate sensitive data detected in OSS.</p>
     * <h2><a href="#"></a>Precautions</h2>
     * <p>The DescribeOssObjectDetail operation is chagned to DescribeOssObjectDetailV2. We recommend that you call the DescribeOssObjectDetailV2 operation when you develop your applications.</p>
     * <h2><a href="#qps"></a>Limits</h2>
     * <p>Each Alibaba Cloud account can call this operation up to 10 times per second. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeOssObjectDetail  DescribeOssObjectDetailRequest
     * @return DescribeOssObjectDetailResponse
     */
    CompletableFuture<DescribeOssObjectDetailResponse> describeOssObjectDetail(DescribeOssObjectDetailRequest request);

    /**
     * @param request the request parameters of DescribeOssObjectDetailV2  DescribeOssObjectDetailV2Request
     * @return DescribeOssObjectDetailV2Response
     */
    CompletableFuture<DescribeOssObjectDetailV2Response> describeOssObjectDetailV2(DescribeOssObjectDetailV2Request request);

    /**
     * @param request the request parameters of DescribeOssObjects  DescribeOssObjectsRequest
     * @return DescribeOssObjectsResponse
     */
    CompletableFuture<DescribeOssObjectsResponse> describeOssObjects(DescribeOssObjectsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query MaxCompute packages that are scanned by DSC. This helps you search for MaxCompute packages and view the summary of MaxCompute packages.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribePackages  DescribePackagesRequest
     * @return DescribePackagesResponse
     */
    CompletableFuture<DescribePackagesResponse> describePackages(DescribePackagesRequest request);

    /**
     * @param request the request parameters of DescribeParentInstance  DescribeParentInstanceRequest
     * @return DescribeParentInstanceResponse
     */
    CompletableFuture<DescribeParentInstanceResponse> describeParentInstance(DescribeParentInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the sensitivity levels that are defined in the current rule template provided by DSC. This helps you learn about the number of times that each sensitivity level is referenced in the rule template and the highest sensitivity level.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeRiskLevels  DescribeRiskLevelsRequest
     * @return DescribeRiskLevelsResponse
     */
    CompletableFuture<DescribeRiskLevelsResponse> describeRiskLevels(DescribeRiskLevelsRequest request);

    /**
     * @param request the request parameters of DescribeRules  DescribeRulesRequest
     * @return DescribeRulesResponse
     */
    CompletableFuture<DescribeRulesResponse> describeRules(DescribeRulesRequest request);

    /**
     * <b>description</b> :
     * <p>When you call the DescribeTables operation to query tables, you can specify parameters such as Name and RiskLevelId to filter tables.</p>
     * <h1>Limits</h1>
     * <p>You can send up to 10 requests per second to call this operation by using your Alibaba Cloud account. If you send excessive requests, throttling is implemented, and your business may be affected.</p>
     * 
     * @param request the request parameters of DescribeTables  DescribeTablesRequest
     * @return DescribeTablesResponse
     */
    CompletableFuture<DescribeTablesResponse> describeTables(DescribeTablesRequest request);

    /**
     * @param request the request parameters of DescribeTemplateAllRules  DescribeTemplateAllRulesRequest
     * @return DescribeTemplateAllRulesResponse
     */
    CompletableFuture<DescribeTemplateAllRulesResponse> describeTemplateAllRules(DescribeTemplateAllRulesRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the information about the current account. This helps you get familiar with your account that accesses Data Security Center (DSC).</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeUserStatus  DescribeUserStatusRequest
     * @return DescribeUserStatusResponse
     */
    CompletableFuture<DescribeUserStatusResponse> describeUserStatus(DescribeUserStatusRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to disable a configuration item based on the code of the configuration item. This helps you modify configurations at the earliest opportunity.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DisableUserConfig  DisableUserConfigRequest
     * @return DisableUserConfigResponse
     */
    CompletableFuture<DisableUserConfigResponse> disableUserConfig(DisableUserConfigRequest request);

    /**
     * @param request the request parameters of ExecDatamask  ExecDatamaskRequest
     * @return ExecDatamaskResponse
     */
    CompletableFuture<ExecDatamaskResponse> execDatamask(ExecDatamaskRequest request);

    /**
     * @param request the request parameters of ManualTriggerMaskingProcess  ManualTriggerMaskingProcessRequest
     * @return ManualTriggerMaskingProcessResponse
     */
    CompletableFuture<ManualTriggerMaskingProcessResponse> manualTriggerMaskingProcess(ManualTriggerMaskingProcessRequest request);

    /**
     * @param request the request parameters of ModifyDataLimit  ModifyDataLimitRequest
     * @return ModifyDataLimitResponse
     */
    CompletableFuture<ModifyDataLimitResponse> modifyDataLimit(ModifyDataLimitRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify the sensitivity levels of data. This helps you manage the sensitivity levels.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyDefaultLevel  ModifyDefaultLevelRequest
     * @return ModifyDefaultLevelResponse
     */
    CompletableFuture<ModifyDefaultLevelResponse> modifyDefaultLevel(ModifyDefaultLevelRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to handle anomalous events that involve data leaks. This helps protect your data assets at the earliest opportunity.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyEventStatus  ModifyEventStatusRequest
     * @return ModifyEventStatusResponse
     */
    CompletableFuture<ModifyEventStatusResponse> modifyEventStatus(ModifyEventStatusRequest request);

    /**
     * @param request the request parameters of ModifyEventTypeStatus  ModifyEventTypeStatusRequest
     * @return ModifyEventTypeStatusResponse
     */
    CompletableFuture<ModifyEventTypeStatusResponse> modifyEventTypeStatus(ModifyEventTypeStatusRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to enable or disable the report task. After you activate Data Security Center (DSC), the report task is enabled by default. After you disable the report task, you cannot view statistics that are newly generated in the Report Center module, on the Overview page of the Cloud Native Data Audit module, and in the Data security lab module. Existing statistics are not affected.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyReportTaskStatus  ModifyReportTaskStatusRequest
     * @return ModifyReportTaskStatusResponse
     */
    CompletableFuture<ModifyReportTaskStatusResponse> modifyReportTaskStatus(ModifyReportTaskStatusRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, you must configure request parameters to specify the rule name, rule ID, and rule content.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyRule  ModifyRuleRequest
     * @return ModifyRuleResponse
     */
    CompletableFuture<ModifyRuleResponse> modifyRule(ModifyRuleRequest request);

    /**
     * @param request the request parameters of ModifyRuleStatus  ModifyRuleStatusRequest
     * @return ModifyRuleStatusResponse
     */
    CompletableFuture<ModifyRuleStatusResponse> modifyRuleStatus(ModifyRuleStatusRequest request);

    /**
     * @param request the request parameters of ScanOssObjectV1  ScanOssObjectV1Request
     * @return ScanOssObjectV1Response
     */
    CompletableFuture<ScanOssObjectV1Response> scanOssObjectV1(ScanOssObjectV1Request request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to stop a de-identification task that is running. For example, you can stop a de-identification task that is used to de-identify specific data.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of StopMaskingProcess  StopMaskingProcessRequest
     * @return StopMaskingProcessResponse
     */
    CompletableFuture<StopMaskingProcessResponse> stopMaskingProcess(StopMaskingProcessRequest request);

}
