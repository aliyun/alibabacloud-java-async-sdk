// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.sophonsoar20220728.models.*;
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
     * @param request the request parameters of BatchModifyInstanceStatus  BatchModifyInstanceStatusRequest
     * @return BatchModifyInstanceStatusResponse
     */
    CompletableFuture<BatchModifyInstanceStatusResponse> batchModifyInstanceStatus(BatchModifyInstanceStatusRequest request);

    /**
     * @param request the request parameters of ComparePlaybooks  ComparePlaybooksRequest
     * @return ComparePlaybooksResponse
     */
    CompletableFuture<ComparePlaybooksResponse> comparePlaybooks(ComparePlaybooksRequest request);

    /**
     * @param request the request parameters of CreatePlaybook  CreatePlaybookRequest
     * @return CreatePlaybookResponse
     */
    CompletableFuture<CreatePlaybookResponse> createPlaybook(CreatePlaybookRequest request);

    /**
     * @param request the request parameters of DebugPlaybook  DebugPlaybookRequest
     * @return DebugPlaybookResponse
     */
    CompletableFuture<DebugPlaybookResponse> debugPlaybook(DebugPlaybookRequest request);

    /**
     * @param request the request parameters of DeleteComponentAsset  DeleteComponentAssetRequest
     * @return DeleteComponentAssetResponse
     */
    CompletableFuture<DeleteComponentAssetResponse> deleteComponentAsset(DeleteComponentAssetRequest request);

    /**
     * @param request the request parameters of DeletePlaybook  DeletePlaybookRequest
     * @return DeletePlaybookResponse
     */
    CompletableFuture<DeletePlaybookResponse> deletePlaybook(DeletePlaybookRequest request);

    /**
     * @param request the request parameters of DescribeApiList  DescribeApiListRequest
     * @return DescribeApiListResponse
     */
    CompletableFuture<DescribeApiListResponse> describeApiList(DescribeApiListRequest request);

    /**
     * @param request the request parameters of DescribeComponentAssetForm  DescribeComponentAssetFormRequest
     * @return DescribeComponentAssetFormResponse
     */
    CompletableFuture<DescribeComponentAssetFormResponse> describeComponentAssetForm(DescribeComponentAssetFormRequest request);

    /**
     * @param request the request parameters of DescribeComponentAssets  DescribeComponentAssetsRequest
     * @return DescribeComponentAssetsResponse
     */
    CompletableFuture<DescribeComponentAssetsResponse> describeComponentAssets(DescribeComponentAssetsRequest request);

    /**
     * @param request the request parameters of DescribeComponentList  DescribeComponentListRequest
     * @return DescribeComponentListResponse
     */
    CompletableFuture<DescribeComponentListResponse> describeComponentList(DescribeComponentListRequest request);

    /**
     * @param request the request parameters of DescribeComponentPlaybook  DescribeComponentPlaybookRequest
     * @return DescribeComponentPlaybookResponse
     */
    CompletableFuture<DescribeComponentPlaybookResponse> describeComponentPlaybook(DescribeComponentPlaybookRequest request);

    /**
     * @param request the request parameters of DescribeComponentsJs  DescribeComponentsJsRequest
     * @return DescribeComponentsJsResponse
     */
    CompletableFuture<DescribeComponentsJsResponse> describeComponentsJs(DescribeComponentsJsRequest request);

    /**
     * @param request the request parameters of DescribeDistinctReleases  DescribeDistinctReleasesRequest
     * @return DescribeDistinctReleasesResponse
     */
    CompletableFuture<DescribeDistinctReleasesResponse> describeDistinctReleases(DescribeDistinctReleasesRequest request);

    /**
     * @param request the request parameters of DescribeEnumItems  DescribeEnumItemsRequest
     * @return DescribeEnumItemsResponse
     */
    CompletableFuture<DescribeEnumItemsResponse> describeEnumItems(DescribeEnumItemsRequest request);

    /**
     * @param request the request parameters of DescribeExecutePlaybooks  DescribeExecutePlaybooksRequest
     * @return DescribeExecutePlaybooksResponse
     */
    CompletableFuture<DescribeExecutePlaybooksResponse> describeExecutePlaybooks(DescribeExecutePlaybooksRequest request);

    /**
     * @param request the request parameters of DescribeField  DescribeFieldRequest
     * @return DescribeFieldResponse
     */
    CompletableFuture<DescribeFieldResponse> describeField(DescribeFieldRequest request);

    /**
     * @param request the request parameters of DescribeLatestRecordSchema  DescribeLatestRecordSchemaRequest
     * @return DescribeLatestRecordSchemaResponse
     */
    CompletableFuture<DescribeLatestRecordSchemaResponse> describeLatestRecordSchema(DescribeLatestRecordSchemaRequest request);

    /**
     * @param request the request parameters of DescribeNodeParamTags  DescribeNodeParamTagsRequest
     * @return DescribeNodeParamTagsResponse
     */
    CompletableFuture<DescribeNodeParamTagsResponse> describeNodeParamTags(DescribeNodeParamTagsRequest request);

    /**
     * @param request the request parameters of DescribeNodeUsedInfos  DescribeNodeUsedInfosRequest
     * @return DescribeNodeUsedInfosResponse
     */
    CompletableFuture<DescribeNodeUsedInfosResponse> describeNodeUsedInfos(DescribeNodeUsedInfosRequest request);

    /**
     * @param request the request parameters of DescribePlaybook  DescribePlaybookRequest
     * @return DescribePlaybookResponse
     */
    CompletableFuture<DescribePlaybookResponse> describePlaybook(DescribePlaybookRequest request);

    /**
     * @param request the request parameters of DescribePlaybookInputOutput  DescribePlaybookInputOutputRequest
     * @return DescribePlaybookInputOutputResponse
     */
    CompletableFuture<DescribePlaybookInputOutputResponse> describePlaybookInputOutput(DescribePlaybookInputOutputRequest request);

    /**
     * @param request the request parameters of DescribePlaybookMetrics  DescribePlaybookMetricsRequest
     * @return DescribePlaybookMetricsResponse
     */
    CompletableFuture<DescribePlaybookMetricsResponse> describePlaybookMetrics(DescribePlaybookMetricsRequest request);

    /**
     * @param request the request parameters of DescribePlaybookNodesOutput  DescribePlaybookNodesOutputRequest
     * @return DescribePlaybookNodesOutputResponse
     */
    CompletableFuture<DescribePlaybookNodesOutputResponse> describePlaybookNodesOutput(DescribePlaybookNodesOutputRequest request);

    /**
     * @param request the request parameters of DescribePlaybookNumberMetrics  DescribePlaybookNumberMetricsRequest
     * @return DescribePlaybookNumberMetricsResponse
     */
    CompletableFuture<DescribePlaybookNumberMetricsResponse> describePlaybookNumberMetrics(DescribePlaybookNumberMetricsRequest request);

    /**
     * @param request the request parameters of DescribePlaybookReleases  DescribePlaybookReleasesRequest
     * @return DescribePlaybookReleasesResponse
     */
    CompletableFuture<DescribePlaybookReleasesResponse> describePlaybookReleases(DescribePlaybookReleasesRequest request);

    /**
     * @param request the request parameters of DescribePlaybooks  DescribePlaybooksRequest
     * @return DescribePlaybooksResponse
     */
    CompletableFuture<DescribePlaybooksResponse> describePlaybooks(DescribePlaybooksRequest request);

    /**
     * @param request the request parameters of DescribePopApi  DescribePopApiRequest
     * @return DescribePopApiResponse
     */
    CompletableFuture<DescribePopApiResponse> describePopApi(DescribePopApiRequest request);

    /**
     * @param request the request parameters of DescribePopApiItemList  DescribePopApiItemListRequest
     * @return DescribePopApiItemListResponse
     */
    CompletableFuture<DescribePopApiItemListResponse> describePopApiItemList(DescribePopApiItemListRequest request);

    /**
     * @param request the request parameters of DescribePopApiVersionList  DescribePopApiVersionListRequest
     * @return DescribePopApiVersionListResponse
     */
    CompletableFuture<DescribePopApiVersionListResponse> describePopApiVersionList(DescribePopApiVersionListRequest request);

    /**
     * @param request the request parameters of DescribeProcessTasks  DescribeProcessTasksRequest
     * @return DescribeProcessTasksResponse
     */
    CompletableFuture<DescribeProcessTasksResponse> describeProcessTasks(DescribeProcessTasksRequest request);

    /**
     * @param request the request parameters of DescribeSoarRecordActionOutputList  DescribeSoarRecordActionOutputListRequest
     * @return DescribeSoarRecordActionOutputListResponse
     */
    CompletableFuture<DescribeSoarRecordActionOutputListResponse> describeSoarRecordActionOutputList(DescribeSoarRecordActionOutputListRequest request);

    /**
     * @param request the request parameters of DescribeSoarRecordInOutput  DescribeSoarRecordInOutputRequest
     * @return DescribeSoarRecordInOutputResponse
     */
    CompletableFuture<DescribeSoarRecordInOutputResponse> describeSoarRecordInOutput(DescribeSoarRecordInOutputRequest request);

    /**
     * @param request the request parameters of DescribeSoarRecords  DescribeSoarRecordsRequest
     * @return DescribeSoarRecordsResponse
     */
    CompletableFuture<DescribeSoarRecordsResponse> describeSoarRecords(DescribeSoarRecordsRequest request);

    /**
     * @param request the request parameters of DescribeSoarTaskAndActions  DescribeSoarTaskAndActionsRequest
     * @return DescribeSoarTaskAndActionsResponse
     */
    CompletableFuture<DescribeSoarTaskAndActionsResponse> describeSoarTaskAndActions(DescribeSoarTaskAndActionsRequest request);

    /**
     * @param request the request parameters of DescribeSophonCommands  DescribeSophonCommandsRequest
     * @return DescribeSophonCommandsResponse
     */
    CompletableFuture<DescribeSophonCommandsResponse> describeSophonCommands(DescribeSophonCommandsRequest request);

    /**
     * @param request the request parameters of DescriberPython3ScriptLogs  DescriberPython3ScriptLogsRequest
     * @return DescriberPython3ScriptLogsResponse
     */
    CompletableFuture<DescriberPython3ScriptLogsResponse> describerPython3ScriptLogs(DescriberPython3ScriptLogsRequest request);

    /**
     * @param request the request parameters of ModifyComponentAsset  ModifyComponentAssetRequest
     * @return ModifyComponentAssetResponse
     */
    CompletableFuture<ModifyComponentAssetResponse> modifyComponentAsset(ModifyComponentAssetRequest request);

    /**
     * @param request the request parameters of ModifyPlaybook  ModifyPlaybookRequest
     * @return ModifyPlaybookResponse
     */
    CompletableFuture<ModifyPlaybookResponse> modifyPlaybook(ModifyPlaybookRequest request);

    /**
     * @param request the request parameters of ModifyPlaybookInputOutput  ModifyPlaybookInputOutputRequest
     * @return ModifyPlaybookInputOutputResponse
     */
    CompletableFuture<ModifyPlaybookInputOutputResponse> modifyPlaybookInputOutput(ModifyPlaybookInputOutputRequest request);

    /**
     * @param request the request parameters of ModifyPlaybookInstanceStatus  ModifyPlaybookInstanceStatusRequest
     * @return ModifyPlaybookInstanceStatusResponse
     */
    CompletableFuture<ModifyPlaybookInstanceStatusResponse> modifyPlaybookInstanceStatus(ModifyPlaybookInstanceStatusRequest request);

    /**
     * @param request the request parameters of PublishPlaybook  PublishPlaybookRequest
     * @return PublishPlaybookResponse
     */
    CompletableFuture<PublishPlaybookResponse> publishPlaybook(PublishPlaybookRequest request);

    /**
     * @param request the request parameters of QueryTreeData  QueryTreeDataRequest
     * @return QueryTreeDataResponse
     */
    CompletableFuture<QueryTreeDataResponse> queryTreeData(QueryTreeDataRequest request);

    /**
     * @param request the request parameters of RenamePlaybookNode  RenamePlaybookNodeRequest
     * @return RenamePlaybookNodeResponse
     */
    CompletableFuture<RenamePlaybookNodeResponse> renamePlaybookNode(RenamePlaybookNodeRequest request);

    /**
     * @param request the request parameters of RevertPlaybookRelease  RevertPlaybookReleaseRequest
     * @return RevertPlaybookReleaseResponse
     */
    CompletableFuture<RevertPlaybookReleaseResponse> revertPlaybookRelease(RevertPlaybookReleaseRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing method and pricing of Security Orchestration Automation Response (SOAR). For more information, see <a href="https://www.alibabacloud.com/en/pricing-calculator?_p_lc=1&spm=openapi-amp.newDocPublishment.0.0.4c41281fWhbdPa#/commodity/vm_intl">Pricing</a>.</p>
     * 
     * @param request the request parameters of RunPython3Script  RunPython3ScriptRequest
     * @return RunPython3ScriptResponse
     */
    CompletableFuture<RunPython3ScriptResponse> runPython3Script(RunPython3ScriptRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and pricing of Security Orchestration Automation Response (SOAR). For more information, see <a href="https://www.alibabacloud.com/en/pricing-calculator?_p_lc=1&spm=a2796.7960336.3034855210.1.7adab91arMeIx2#/commodity/vm_intl">Pricing</a>.</p>
     * 
     * @param request the request parameters of TriggerPlaybook  TriggerPlaybookRequest
     * @return TriggerPlaybookResponse
     */
    CompletableFuture<TriggerPlaybookResponse> triggerPlaybook(TriggerPlaybookRequest request);

    /**
     * @param request the request parameters of TriggerProcessTask  TriggerProcessTaskRequest
     * @return TriggerProcessTaskResponse
     */
    CompletableFuture<TriggerProcessTaskResponse> triggerProcessTask(TriggerProcessTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and pricing of Security Orchestration Automation Response (SOAR). For more information, see <a href="https://www.alibabacloud.com/en/pricing-calculator?_p_lc=1&spm=a2796.7960336.3034855210.1.7adab91arMeIx2#/commodity/vm_intl">Pricing</a>.</p>
     * 
     * @param request the request parameters of TriggerSophonPlaybook  TriggerSophonPlaybookRequest
     * @return TriggerSophonPlaybookResponse
     */
    CompletableFuture<TriggerSophonPlaybookResponse> triggerSophonPlaybook(TriggerSophonPlaybookRequest request);

    /**
     * @param request the request parameters of VerifyPlaybook  VerifyPlaybookRequest
     * @return VerifyPlaybookResponse
     */
    CompletableFuture<VerifyPlaybookResponse> verifyPlaybook(VerifyPlaybookRequest request);

    /**
     * @param request the request parameters of VerifyPythonFile  VerifyPythonFileRequest
     * @return VerifyPythonFileResponse
     */
    CompletableFuture<VerifyPythonFileResponse> verifyPythonFile(VerifyPythonFileRequest request);

}
