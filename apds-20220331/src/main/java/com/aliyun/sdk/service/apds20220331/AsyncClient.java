// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apds20220331;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.apds20220331.models.*;
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
     * @param request the request parameters of CreateMigrationGroup  CreateMigrationGroupRequest
     * @return CreateMigrationGroupResponse
     */
    CompletableFuture<CreateMigrationGroupResponse> createMigrationGroup(CreateMigrationGroupRequest request);

    /**
     * @param request the request parameters of CreateMigrationJob  CreateMigrationJobRequest
     * @return CreateMigrationJobResponse
     */
    CompletableFuture<CreateMigrationJobResponse> createMigrationJob(CreateMigrationJobRequest request);

    /**
     * @param request the request parameters of CreatePayOrderCallback  CreatePayOrderCallbackRequest
     * @return CreatePayOrderCallbackResponse
     */
    CompletableFuture<CreatePayOrderCallbackResponse> createPayOrderCallback(CreatePayOrderCallbackRequest request);

    /**
     * @param request the request parameters of CreateRefund  CreateRefundRequest
     * @return CreateRefundResponse
     */
    CompletableFuture<CreateRefundResponse> createRefund(CreateRefundRequest request);

    /**
     * @param request the request parameters of CreateSurveyJob  CreateSurveyJobRequest
     * @return CreateSurveyJobResponse
     */
    CompletableFuture<CreateSurveyJobResponse> createSurveyJob(CreateSurveyJobRequest request);

    /**
     * @param request the request parameters of CreateSurveyJobOffline  CreateSurveyJobOfflineRequest
     * @return CreateSurveyJobOfflineResponse
     */
    CompletableFuture<CreateSurveyJobOfflineResponse> createSurveyJobOffline(CreateSurveyJobOfflineRequest request);

    /**
     * @param request the request parameters of DeleteMigrationJob  DeleteMigrationJobRequest
     * @return DeleteMigrationJobResponse
     */
    CompletableFuture<DeleteMigrationJobResponse> deleteMigrationJob(DeleteMigrationJobRequest request);

    /**
     * @param request the request parameters of DeleteOssFile  DeleteOssFileRequest
     * @return DeleteOssFileResponse
     */
    CompletableFuture<DeleteOssFileResponse> deleteOssFile(DeleteOssFileRequest request);

    /**
     * @param request the request parameters of DeleteSurveyJob  DeleteSurveyJobRequest
     * @return DeleteSurveyJobResponse
     */
    CompletableFuture<DeleteSurveyJobResponse> deleteSurveyJob(DeleteSurveyJobRequest request);

    /**
     * @param request the request parameters of DeleteSurveyResources  DeleteSurveyResourcesRequest
     * @return DeleteSurveyResourcesResponse
     */
    CompletableFuture<DeleteSurveyResourcesResponse> deleteSurveyResources(DeleteSurveyResourcesRequest request);

    /**
     * @param request the request parameters of DescribeMigrationJobConfig  DescribeMigrationJobConfigRequest
     * @return DescribeMigrationJobConfigResponse
     */
    CompletableFuture<DescribeMigrationJobConfigResponse> describeMigrationJobConfig(DescribeMigrationJobConfigRequest request);

    /**
     * @param request the request parameters of DescribeMigrationJobCount  DescribeMigrationJobCountRequest
     * @return DescribeMigrationJobCountResponse
     */
    CompletableFuture<DescribeMigrationJobCountResponse> describeMigrationJobCount(DescribeMigrationJobCountRequest request);

    /**
     * @param request the request parameters of DescribeOssSts  DescribeOssStsRequest
     * @return DescribeOssStsResponse
     */
    CompletableFuture<DescribeOssStsResponse> describeOssSts(DescribeOssStsRequest request);

    /**
     * @param request the request parameters of DescribeSummaryByStatus  DescribeSummaryByStatusRequest
     * @return DescribeSummaryByStatusResponse
     */
    CompletableFuture<DescribeSummaryByStatusResponse> describeSummaryByStatus(DescribeSummaryByStatusRequest request);

    /**
     * @param request the request parameters of DescribeSummaryByStatusAndGroup  DescribeSummaryByStatusAndGroupRequest
     * @return DescribeSummaryByStatusAndGroupResponse
     */
    CompletableFuture<DescribeSummaryByStatusAndGroupResponse> describeSummaryByStatusAndGroup(DescribeSummaryByStatusAndGroupRequest request);

    /**
     * @param request the request parameters of DescribeSurveyJob  DescribeSurveyJobRequest
     * @return DescribeSurveyJobResponse
     */
    CompletableFuture<DescribeSurveyJobResponse> describeSurveyJob(DescribeSurveyJobRequest request);

    /**
     * @param request the request parameters of DescribeSurveyJobCount  DescribeSurveyJobCountRequest
     * @return DescribeSurveyJobCountResponse
     */
    CompletableFuture<DescribeSurveyJobCountResponse> describeSurveyJobCount(DescribeSurveyJobCountRequest request);

    /**
     * @param request the request parameters of DescribeSurveyResourceTag  DescribeSurveyResourceTagRequest
     * @return DescribeSurveyResourceTagResponse
     */
    CompletableFuture<DescribeSurveyResourceTagResponse> describeSurveyResourceTag(DescribeSurveyResourceTagRequest request);

    /**
     * @param request the request parameters of DescribeSurveyTemplate  DescribeSurveyTemplateRequest
     * @return DescribeSurveyTemplateResponse
     */
    CompletableFuture<DescribeSurveyTemplateResponse> describeSurveyTemplate(DescribeSurveyTemplateRequest request);

    /**
     * @param request the request parameters of GetTableMetaInfo  GetTableMetaInfoRequest
     * @return GetTableMetaInfoResponse
     */
    CompletableFuture<GetTableMetaInfoResponse> getTableMetaInfo(GetTableMetaInfoRequest request);

    /**
     * @param request the request parameters of GetTaskDetail  GetTaskDetailRequest
     * @return GetTaskDetailResponse
     */
    CompletableFuture<GetTaskDetailResponse> getTaskDetail(GetTaskDetailRequest request);

    /**
     * @param request the request parameters of ListAppDownloadHistory  ListAppDownloadHistoryRequest
     * @return ListAppDownloadHistoryResponse
     */
    CompletableFuture<ListAppDownloadHistoryResponse> listAppDownloadHistory(ListAppDownloadHistoryRequest request);

    /**
     * @param request the request parameters of ListMigrationJobs  ListMigrationJobsRequest
     * @return ListMigrationJobsResponse
     */
    CompletableFuture<ListMigrationJobsResponse> listMigrationJobs(ListMigrationJobsRequest request);

    /**
     * @param request the request parameters of ListSurveyJobDownLoadJobs  ListSurveyJobDownLoadJobsRequest
     * @return ListSurveyJobDownLoadJobsResponse
     */
    CompletableFuture<ListSurveyJobDownLoadJobsResponse> listSurveyJobDownLoadJobs(ListSurveyJobDownLoadJobsRequest request);

    /**
     * @param request the request parameters of ListSurveyJobs  ListSurveyJobsRequest
     * @return ListSurveyJobsResponse
     */
    CompletableFuture<ListSurveyJobsResponse> listSurveyJobs(ListSurveyJobsRequest request);

    /**
     * @param request the request parameters of ListSurveyResourceByMigrationGroups  ListSurveyResourceByMigrationGroupsRequest
     * @return ListSurveyResourceByMigrationGroupsResponse
     */
    CompletableFuture<ListSurveyResourceByMigrationGroupsResponse> listSurveyResourceByMigrationGroups(ListSurveyResourceByMigrationGroupsRequest request);

    /**
     * @param request the request parameters of ListSurveyResourceConnections  ListSurveyResourceConnectionsRequest
     * @return ListSurveyResourceConnectionsResponse
     */
    CompletableFuture<ListSurveyResourceConnectionsResponse> listSurveyResourceConnections(ListSurveyResourceConnectionsRequest request);

    /**
     * @param request the request parameters of ListSurveyResourceTypes  ListSurveyResourceTypesRequest
     * @return ListSurveyResourceTypesResponse
     */
    CompletableFuture<ListSurveyResourceTypesResponse> listSurveyResourceTypes(ListSurveyResourceTypesRequest request);

    /**
     * @param request the request parameters of ListSurveyResourcesDetail  ListSurveyResourcesDetailRequest
     * @return ListSurveyResourcesDetailResponse
     */
    CompletableFuture<ListSurveyResourcesDetailResponse> listSurveyResourcesDetail(ListSurveyResourcesDetailRequest request);

    /**
     * @param request the request parameters of PopCreateTask  PopCreateTaskRequest
     * @return PopCreateTaskResponse
     */
    CompletableFuture<PopCreateTaskResponse> popCreateTask(PopCreateTaskRequest request);

    /**
     * @param request the request parameters of PopDownloadTemplate  PopDownloadTemplateRequest
     * @return PopDownloadTemplateResponse
     */
    CompletableFuture<PopDownloadTemplateResponse> popDownloadTemplate(PopDownloadTemplateRequest request);

    /**
     * @param request the request parameters of PopEditTask  PopEditTaskRequest
     * @return PopEditTaskResponse
     */
    CompletableFuture<PopEditTaskResponse> popEditTask(PopEditTaskRequest request);

    /**
     * @param request the request parameters of RecoverMigrationJob  RecoverMigrationJobRequest
     * @return RecoverMigrationJobResponse
     */
    CompletableFuture<RecoverMigrationJobResponse> recoverMigrationJob(RecoverMigrationJobRequest request);

    /**
     * @param request the request parameters of SingleScriptSyncTranslate  SingleScriptSyncTranslateRequest
     * @return SingleScriptSyncTranslateResponse
     */
    CompletableFuture<SingleScriptSyncTranslateResponse> singleScriptSyncTranslate(SingleScriptSyncTranslateRequest request);

    /**
     * @param request the request parameters of StopSyncMigrationJob  StopSyncMigrationJobRequest
     * @return StopSyncMigrationJobResponse
     */
    CompletableFuture<StopSyncMigrationJobResponse> stopSyncMigrationJob(StopSyncMigrationJobRequest request);

    /**
     * @param request the request parameters of SyncMigrationJob  SyncMigrationJobRequest
     * @return SyncMigrationJobResponse
     */
    CompletableFuture<SyncMigrationJobResponse> syncMigrationJob(SyncMigrationJobRequest request);

    /**
     * @param request the request parameters of UpdatePushApp  UpdatePushAppRequest
     * @return UpdatePushAppResponse
     */
    CompletableFuture<UpdatePushAppResponse> updatePushApp(UpdatePushAppRequest request);

}
