// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.sophonsoar20220728.models.*;
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

    CompletableFuture<BatchModifyInstanceStatusResponse> batchModifyInstanceStatus(BatchModifyInstanceStatusRequest request);

    CompletableFuture<ComparePlaybooksResponse> comparePlaybooks(ComparePlaybooksRequest request);

    CompletableFuture<CreatePlaybookResponse> createPlaybook(CreatePlaybookRequest request);

    CompletableFuture<DebugPlaybookResponse> debugPlaybook(DebugPlaybookRequest request);

    CompletableFuture<DeleteComponentAssetResponse> deleteComponentAsset(DeleteComponentAssetRequest request);

    CompletableFuture<DeletePlaybookResponse> deletePlaybook(DeletePlaybookRequest request);

    CompletableFuture<DescribeApiListResponse> describeApiList(DescribeApiListRequest request);

    CompletableFuture<DescribeComponentAssetFormResponse> describeComponentAssetForm(DescribeComponentAssetFormRequest request);

    CompletableFuture<DescribeComponentAssetsResponse> describeComponentAssets(DescribeComponentAssetsRequest request);

    CompletableFuture<DescribeComponentListResponse> describeComponentList(DescribeComponentListRequest request);

    CompletableFuture<DescribeComponentPlaybookResponse> describeComponentPlaybook(DescribeComponentPlaybookRequest request);

    CompletableFuture<DescribeComponentsJsResponse> describeComponentsJs(DescribeComponentsJsRequest request);

    CompletableFuture<DescribeDistinctReleasesResponse> describeDistinctReleases(DescribeDistinctReleasesRequest request);

    CompletableFuture<DescribeEnumItemsResponse> describeEnumItems(DescribeEnumItemsRequest request);

    CompletableFuture<DescribeExecutePlaybooksResponse> describeExecutePlaybooks(DescribeExecutePlaybooksRequest request);

    CompletableFuture<DescribeFieldResponse> describeField(DescribeFieldRequest request);

    CompletableFuture<DescribeLatestRecordSchemaResponse> describeLatestRecordSchema(DescribeLatestRecordSchemaRequest request);

    CompletableFuture<DescribeNodeParamTagsResponse> describeNodeParamTags(DescribeNodeParamTagsRequest request);

    CompletableFuture<DescribeNodeUsedInfosResponse> describeNodeUsedInfos(DescribeNodeUsedInfosRequest request);

    CompletableFuture<DescribePlaybookResponse> describePlaybook(DescribePlaybookRequest request);

    CompletableFuture<DescribePlaybookInputOutputResponse> describePlaybookInputOutput(DescribePlaybookInputOutputRequest request);

    CompletableFuture<DescribePlaybookMetricsResponse> describePlaybookMetrics(DescribePlaybookMetricsRequest request);

    CompletableFuture<DescribePlaybookNodesOutputResponse> describePlaybookNodesOutput(DescribePlaybookNodesOutputRequest request);

    CompletableFuture<DescribePlaybookNumberMetricsResponse> describePlaybookNumberMetrics(DescribePlaybookNumberMetricsRequest request);

    CompletableFuture<DescribePlaybookReleasesResponse> describePlaybookReleases(DescribePlaybookReleasesRequest request);

    CompletableFuture<DescribePlaybooksResponse> describePlaybooks(DescribePlaybooksRequest request);

    CompletableFuture<DescribePopApiResponse> describePopApi(DescribePopApiRequest request);

    CompletableFuture<DescribePopApiItemListResponse> describePopApiItemList(DescribePopApiItemListRequest request);

    CompletableFuture<DescribePopApiVersionListResponse> describePopApiVersionList(DescribePopApiVersionListRequest request);

    CompletableFuture<DescribeProcessTasksResponse> describeProcessTasks(DescribeProcessTasksRequest request);

    CompletableFuture<DescribeSoarRecordActionOutputListResponse> describeSoarRecordActionOutputList(DescribeSoarRecordActionOutputListRequest request);

    CompletableFuture<DescribeSoarRecordInOutputResponse> describeSoarRecordInOutput(DescribeSoarRecordInOutputRequest request);

    CompletableFuture<DescribeSoarRecordsResponse> describeSoarRecords(DescribeSoarRecordsRequest request);

    CompletableFuture<DescribeSoarTaskAndActionsResponse> describeSoarTaskAndActions(DescribeSoarTaskAndActionsRequest request);

    CompletableFuture<DescribeSophonCommandsResponse> describeSophonCommands(DescribeSophonCommandsRequest request);

    CompletableFuture<DescriberPython3ScriptLogsResponse> describerPython3ScriptLogs(DescriberPython3ScriptLogsRequest request);

    CompletableFuture<ModifyComponentAssetResponse> modifyComponentAsset(ModifyComponentAssetRequest request);

    CompletableFuture<ModifyPlaybookResponse> modifyPlaybook(ModifyPlaybookRequest request);

    CompletableFuture<ModifyPlaybookInputOutputResponse> modifyPlaybookInputOutput(ModifyPlaybookInputOutputRequest request);

    CompletableFuture<ModifyPlaybookInstanceStatusResponse> modifyPlaybookInstanceStatus(ModifyPlaybookInstanceStatusRequest request);

    CompletableFuture<PublishPlaybookResponse> publishPlaybook(PublishPlaybookRequest request);

    CompletableFuture<QueryTreeDataResponse> queryTreeData(QueryTreeDataRequest request);

    CompletableFuture<RenamePlaybookNodeResponse> renamePlaybookNode(RenamePlaybookNodeRequest request);

    CompletableFuture<RevertPlaybookReleaseResponse> revertPlaybookRelease(RevertPlaybookReleaseRequest request);

    /**
      * Before you call this operation, make sure that you understand the billing method and pricing of Security Orchestration Automation Response (SOAR). For more information, see [Pricing](https://www.aliyun.com/price/product#/sas/detail/sas).
      *
     */
    CompletableFuture<RunPython3ScriptResponse> runPython3Script(RunPython3ScriptRequest request);

    /**
      * Before you call this operation, make sure that you understand the billing methods and pricing of Security Orchestration Automation Response (SOAR). For more information, see [Pricing](https://www.aliyun.com/price/product#/sas/detail/sas).
      *
     */
    CompletableFuture<TriggerPlaybookResponse> triggerPlaybook(TriggerPlaybookRequest request);

    CompletableFuture<TriggerProcessTaskResponse> triggerProcessTask(TriggerProcessTaskRequest request);

    /**
      * Before you call this operation, make sure that you understand the billing methods and pricing of Security Orchestration Automation Response (SOAR). For more information, see [Pricing](https://www.aliyun.com/price/product#/sas/detail/sas).
      *
     */
    CompletableFuture<TriggerSophonPlaybookResponse> triggerSophonPlaybook(TriggerSophonPlaybookRequest request);

    CompletableFuture<VerifyPlaybookResponse> verifyPlaybook(VerifyPlaybookRequest request);

    CompletableFuture<VerifyPythonFileResponse> verifyPythonFile(VerifyPythonFileRequest request);

}
