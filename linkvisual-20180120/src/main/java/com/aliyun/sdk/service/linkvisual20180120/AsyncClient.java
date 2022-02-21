// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.linkvisual20180120.models.*;
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

    CompletableFuture<AddEventRecordPlanDeviceResponse> addEventRecordPlanDevice(AddEventRecordPlanDeviceRequest request);

    CompletableFuture<AddFaceDeviceGroupResponse> addFaceDeviceGroup(AddFaceDeviceGroupRequest request);

    CompletableFuture<AddFaceDeviceToDeviceGroupResponse> addFaceDeviceToDeviceGroup(AddFaceDeviceToDeviceGroupRequest request);

    CompletableFuture<AddFaceUserResponse> addFaceUser(AddFaceUserRequest request);

    CompletableFuture<AddFaceUserGroupResponse> addFaceUserGroup(AddFaceUserGroupRequest request);

    CompletableFuture<AddFaceUserGroupAndDeviceGroupRelationResponse> addFaceUserGroupAndDeviceGroupRelation(AddFaceUserGroupAndDeviceGroupRelationRequest request);

    CompletableFuture<AddFaceUserPictureResponse> addFaceUserPicture(AddFaceUserPictureRequest request);

    CompletableFuture<AddFaceUserToUserGroupResponse> addFaceUserToUserGroup(AddFaceUserToUserGroupRequest request);

    CompletableFuture<AddRecordPlanDeviceResponse> addRecordPlanDevice(AddRecordPlanDeviceRequest request);

    CompletableFuture<BindAIPlanWithDevicesResponse> bindAIPlanWithDevices(BindAIPlanWithDevicesRequest request);

    CompletableFuture<BindPictureSearchAppWithDevicesResponse> bindPictureSearchAppWithDevices(BindPictureSearchAppWithDevicesRequest request);

    CompletableFuture<CheckFaceUserDoExistOnDeviceResponse> checkFaceUserDoExistOnDevice(CheckFaceUserDoExistOnDeviceRequest request);

    CompletableFuture<ClearFaceDeviceDBResponse> clearFaceDeviceDB(ClearFaceDeviceDBRequest request);

    CompletableFuture<ConfigAIActionResponse> configAIAction(ConfigAIActionRequest request);

    CompletableFuture<CreateAIAppResponse> createAIApp(CreateAIAppRequest request);

    CompletableFuture<CreateAIPlanResponse> createAIPlan(CreateAIPlanRequest request);

    CompletableFuture<CreateAlgorithmResponse> createAlgorithm(CreateAlgorithmRequest request);

    CompletableFuture<CreateDevicePurifyJobResponse> createDevicePurifyJob(CreateDevicePurifyJobRequest request);

    CompletableFuture<CreateDevicePurifyJobByPlanIdResponse> createDevicePurifyJobByPlanId(CreateDevicePurifyJobByPlanIdRequest request);

    CompletableFuture<CreateDevicePurifyPlanResponse> createDevicePurifyPlan(CreateDevicePurifyPlanRequest request);

    CompletableFuture<CreateEventRecordPlanResponse> createEventRecordPlan(CreateEventRecordPlanRequest request);

    CompletableFuture<CreateLocalFileUploadJobResponse> createLocalFileUploadJob(CreateLocalFileUploadJobRequest request);

    CompletableFuture<CreateModelResponse> createModel(CreateModelRequest request);

    CompletableFuture<CreatePictureSearchAppResponse> createPictureSearchApp(CreatePictureSearchAppRequest request);

    CompletableFuture<CreatePictureSearchJobResponse> createPictureSearchJob(CreatePictureSearchJobRequest request);

    CompletableFuture<CreateRecordPlanResponse> createRecordPlan(CreateRecordPlanRequest request);

    CompletableFuture<CreateTimeTemplateResponse> createTimeTemplate(CreateTimeTemplateRequest request);

    CompletableFuture<DeleteAlgorithmResponse> deleteAlgorithm(DeleteAlgorithmRequest request);

    CompletableFuture<DeleteEventRecordPlanResponse> deleteEventRecordPlan(DeleteEventRecordPlanRequest request);

    CompletableFuture<DeleteEventRecordPlanDeviceResponse> deleteEventRecordPlanDevice(DeleteEventRecordPlanDeviceRequest request);

    CompletableFuture<DeleteFaceDeviceGroupResponse> deleteFaceDeviceGroup(DeleteFaceDeviceGroupRequest request);

    CompletableFuture<DeleteFaceUserResponse> deleteFaceUser(DeleteFaceUserRequest request);

    CompletableFuture<DeleteFaceUserGroupResponse> deleteFaceUserGroup(DeleteFaceUserGroupRequest request);

    CompletableFuture<DeleteFaceUserGroupAndDeviceGroupRelationResponse> deleteFaceUserGroupAndDeviceGroupRelation(DeleteFaceUserGroupAndDeviceGroupRelationRequest request);

    CompletableFuture<DeleteFaceUserPictureResponse> deleteFaceUserPicture(DeleteFaceUserPictureRequest request);

    CompletableFuture<DeleteLocalFileUploadJobResponse> deleteLocalFileUploadJob(DeleteLocalFileUploadJobRequest request);

    CompletableFuture<DeleteModelResponse> deleteModel(DeleteModelRequest request);

    CompletableFuture<DeleteRecordResponse> deleteRecord(DeleteRecordRequest request);

    CompletableFuture<DeleteRecordPlanResponse> deleteRecordPlan(DeleteRecordPlanRequest request);

    CompletableFuture<DeleteRecordPlanDeviceResponse> deleteRecordPlanDevice(DeleteRecordPlanDeviceRequest request);

    CompletableFuture<DeleteTimeTemplateResponse> deleteTimeTemplate(DeleteTimeTemplateRequest request);

    CompletableFuture<DeployModelBatchResponse> deployModelBatch(DeployModelBatchRequest request);

    CompletableFuture<DetectUserFaceByUrlResponse> detectUserFaceByUrl(DetectUserFaceByUrlRequest request);

    CompletableFuture<GetAIActionResponse> getAIAction(GetAIActionRequest request);

    CompletableFuture<GetAIActionConfigResponse> getAIActionConfig(GetAIActionConfigRequest request);

    CompletableFuture<GetAIAppResponse> getAIApp(GetAIAppRequest request);

    CompletableFuture<GetAIJobResponse> getAIJob(GetAIJobRequest request);

    CompletableFuture<GetAIPlanResponse> getAIPlan(GetAIPlanRequest request);

    CompletableFuture<GetAlgorithmDetailByIdResponse> getAlgorithmDetailById(GetAlgorithmDetailByIdRequest request);

    CompletableFuture<GetAlgorithmDetailByNameResponse> getAlgorithmDetailByName(GetAlgorithmDetailByNameRequest request);

    CompletableFuture<GetDevicePurifyJobByJobIdResponse> getDevicePurifyJobByJobId(GetDevicePurifyJobByJobIdRequest request);

    CompletableFuture<GetModelDetailResponse> getModelDetail(GetModelDetailRequest request);

    CompletableFuture<GetModelDetailByIdResponse> getModelDetailById(GetModelDetailByIdRequest request);

    CompletableFuture<GetModelOssPolicyResponse> getModelOssPolicy(GetModelOssPolicyRequest request);

    CompletableFuture<GetPictureInfoWithVectorIdsResponse> getPictureInfoWithVectorIds(GetPictureInfoWithVectorIdsRequest request);

    CompletableFuture<GetPictureSearchJobStatusResponse> getPictureSearchJobStatus(GetPictureSearchJobStatusRequest request);

    CompletableFuture<GetPictureWithVectorIdResponse> getPictureWithVectorId(GetPictureWithVectorIdRequest request);

    CompletableFuture<ListAlgorithmsByPageResponse> listAlgorithmsByPage(ListAlgorithmsByPageRequest request);

    CompletableFuture<ListDeployTaskByModelIdAndDevicesResponse> listDeployTaskByModelIdAndDevices(ListDeployTaskByModelIdAndDevicesRequest request);

    CompletableFuture<ListDeployTaskByPageResponse> listDeployTaskByPage(ListDeployTaskByPageRequest request);

    CompletableFuture<ListModelVersionsByPageResponse> listModelVersionsByPage(ListModelVersionsByPageRequest request);

    CompletableFuture<ListModelsByPageResponse> listModelsByPage(ListModelsByPageRequest request);

    CompletableFuture<PictureSearchPictureResponse> pictureSearchPicture(PictureSearchPictureRequest request);

    CompletableFuture<QueryAIActionResponse> queryAIAction(QueryAIActionRequest request);

    CompletableFuture<QueryAIAppResponse> queryAIApp(QueryAIAppRequest request);

    CompletableFuture<QueryAIJobsResponse> queryAIJobs(QueryAIJobsRequest request);

    CompletableFuture<QueryAIPlanResponse> queryAIPlan(QueryAIPlanRequest request);

    CompletableFuture<QueryAIPlanTemplatesResponse> queryAIPlanTemplates(QueryAIPlanTemplatesRequest request);

    CompletableFuture<QueryCarProcessEventsResponse> queryCarProcessEvents(QueryCarProcessEventsRequest request);

    CompletableFuture<QueryDeviceEventResponse> queryDeviceEvent(QueryDeviceEventRequest request);

    CompletableFuture<QueryDeviceEventPictureResponse> queryDeviceEventPicture(QueryDeviceEventPictureRequest request);

    CompletableFuture<QueryDeviceEventRecordResponse> queryDeviceEventRecord(QueryDeviceEventRecordRequest request);

    CompletableFuture<QueryDeviceFileVodResponse> queryDeviceFileVod(QueryDeviceFileVodRequest request);

    CompletableFuture<QueryDevicePictureByListResponse> queryDevicePictureByList(QueryDevicePictureByListRequest request);

    CompletableFuture<QueryDevicePictureFileResponse> queryDevicePictureFile(QueryDevicePictureFileRequest request);

    CompletableFuture<QueryDevicePictureLifeCycleResponse> queryDevicePictureLifeCycle(QueryDevicePictureLifeCycleRequest request);

    CompletableFuture<QueryDevicePurifyJobsResponse> queryDevicePurifyJobs(QueryDevicePurifyJobsRequest request);

    CompletableFuture<QueryDevicePurifyPlanByPlanIdResponse> queryDevicePurifyPlanByPlanId(QueryDevicePurifyPlanByPlanIdRequest request);

    CompletableFuture<QueryDevicePurifyPlansResponse> queryDevicePurifyPlans(QueryDevicePurifyPlansRequest request);

    CompletableFuture<QueryDeviceRecordLifeCycleResponse> queryDeviceRecordLifeCycle(QueryDeviceRecordLifeCycleRequest request);

    CompletableFuture<QueryDeviceVodUrlResponse> queryDeviceVodUrl(QueryDeviceVodUrlRequest request);

    CompletableFuture<QueryDeviceVodUrlByTimeResponse> queryDeviceVodUrlByTime(QueryDeviceVodUrlByTimeRequest request);

    CompletableFuture<QueryEventRecordPlanDetailResponse> queryEventRecordPlanDetail(QueryEventRecordPlanDetailRequest request);

    CompletableFuture<QueryEventRecordPlanDeviceByDeviceResponse> queryEventRecordPlanDeviceByDevice(QueryEventRecordPlanDeviceByDeviceRequest request);

    CompletableFuture<QueryEventRecordPlanDeviceByPlanResponse> queryEventRecordPlanDeviceByPlan(QueryEventRecordPlanDeviceByPlanRequest request);

    CompletableFuture<QueryEventRecordPlansResponse> queryEventRecordPlans(QueryEventRecordPlansRequest request);

    CompletableFuture<QueryFaceAllDeviceGroupResponse> queryFaceAllDeviceGroup(QueryFaceAllDeviceGroupRequest request);

    CompletableFuture<QueryFaceAllUserGroupResponse> queryFaceAllUserGroup(QueryFaceAllUserGroupRequest request);

    CompletableFuture<QueryFaceAllUserGroupAndDeviceGroupRelationResponse> queryFaceAllUserGroupAndDeviceGroupRelation(QueryFaceAllUserGroupAndDeviceGroupRelationRequest request);

    CompletableFuture<QueryFaceAllUserIdsByGroupIdResponse> queryFaceAllUserIdsByGroupId(QueryFaceAllUserIdsByGroupIdRequest request);

    CompletableFuture<QueryFaceCustomUserIdByUserIdResponse> queryFaceCustomUserIdByUserId(QueryFaceCustomUserIdByUserIdRequest request);

    CompletableFuture<QueryFaceDeviceGroupsByDeviceResponse> queryFaceDeviceGroupsByDevice(QueryFaceDeviceGroupsByDeviceRequest request);

    CompletableFuture<QueryFaceUserResponse> queryFaceUser(QueryFaceUserRequest request);

    CompletableFuture<QueryFaceUserBatchResponse> queryFaceUserBatch(QueryFaceUserBatchRequest request);

    CompletableFuture<QueryFaceUserByNameResponse> queryFaceUserByName(QueryFaceUserByNameRequest request);

    CompletableFuture<QueryFaceUserGroupResponse> queryFaceUserGroup(QueryFaceUserGroupRequest request);

    CompletableFuture<QueryFaceUserGroupAndDeviceGroupRelationResponse> queryFaceUserGroupAndDeviceGroupRelation(QueryFaceUserGroupAndDeviceGroupRelationRequest request);

    CompletableFuture<QueryFaceUserIdByCustomUserIdResponse> queryFaceUserIdByCustomUserId(QueryFaceUserIdByCustomUserIdRequest request);

    CompletableFuture<QueryIotIdsByAIPlanResponse> queryIotIdsByAIPlan(QueryIotIdsByAIPlanRequest request);

    CompletableFuture<QueryLiveStreamingResponse> queryLiveStreaming(QueryLiveStreamingRequest request);

    CompletableFuture<QueryLocalFileUploadJobResponse> queryLocalFileUploadJob(QueryLocalFileUploadJobRequest request);

    CompletableFuture<QueryMonthRecordResponse> queryMonthRecord(QueryMonthRecordRequest request);

    CompletableFuture<QueryPictureFilesResponse> queryPictureFiles(QueryPictureFilesRequest request);

    CompletableFuture<QueryPictureSearchAiboxesResponse> queryPictureSearchAiboxes(QueryPictureSearchAiboxesRequest request);

    CompletableFuture<QueryPictureSearchAppResponse> queryPictureSearchApp(QueryPictureSearchAppRequest request);

    CompletableFuture<QueryPictureSearchAppsResponse> queryPictureSearchApps(QueryPictureSearchAppsRequest request);

    CompletableFuture<QueryPictureSearchDevicesResponse> queryPictureSearchDevices(QueryPictureSearchDevicesRequest request);

    CompletableFuture<QueryPictureSearchJobResponse> queryPictureSearchJob(QueryPictureSearchJobRequest request);

    CompletableFuture<QueryPictureSearchJobResultResponse> queryPictureSearchJobResult(QueryPictureSearchJobResultRequest request);

    CompletableFuture<QueryRecordResponse> queryRecord(QueryRecordRequest request);

    CompletableFuture<QueryRecordByRecordIdResponse> queryRecordByRecordId(QueryRecordByRecordIdRequest request);

    CompletableFuture<QueryRecordDownloadUrlResponse> queryRecordDownloadUrl(QueryRecordDownloadUrlRequest request);

    CompletableFuture<QueryRecordPlanDetailResponse> queryRecordPlanDetail(QueryRecordPlanDetailRequest request);

    CompletableFuture<QueryRecordPlanDeviceByDeviceResponse> queryRecordPlanDeviceByDevice(QueryRecordPlanDeviceByDeviceRequest request);

    CompletableFuture<QueryRecordPlanDeviceByPlanResponse> queryRecordPlanDeviceByPlan(QueryRecordPlanDeviceByPlanRequest request);

    CompletableFuture<QueryRecordPlansResponse> queryRecordPlans(QueryRecordPlansRequest request);

    CompletableFuture<QueryRecordUrlResponse> queryRecordUrl(QueryRecordUrlRequest request);

    CompletableFuture<QueryRecordUrlByTimeResponse> queryRecordUrlByTime(QueryRecordUrlByTimeRequest request);

    CompletableFuture<QueryStandardAIAppTemplatesResponse> queryStandardAIAppTemplates(QueryStandardAIAppTemplatesRequest request);

    CompletableFuture<QueryTimeTemplateResponse> queryTimeTemplate(QueryTimeTemplateRequest request);

    CompletableFuture<QueryTimeTemplateDetailResponse> queryTimeTemplateDetail(QueryTimeTemplateDetailRequest request);

    CompletableFuture<QueryVoiceIntercomResponse> queryVoiceIntercom(QueryVoiceIntercomRequest request);

    CompletableFuture<RemoveAIAppResponse> removeAIApp(RemoveAIAppRequest request);

    CompletableFuture<RemoveAIPlanResponse> removeAIPlan(RemoveAIPlanRequest request);

    CompletableFuture<RemoveDevicePurifyPlanResponse> removeDevicePurifyPlan(RemoveDevicePurifyPlanRequest request);

    CompletableFuture<RemoveFaceDeviceFromDeviceGroupResponse> removeFaceDeviceFromDeviceGroup(RemoveFaceDeviceFromDeviceGroupRequest request);

    CompletableFuture<RemoveFaceUserFromUserGroupResponse> removeFaceUserFromUserGroup(RemoveFaceUserFromUserGroupRequest request);

    CompletableFuture<SetDevicePictureLifeCycleResponse> setDevicePictureLifeCycle(SetDevicePictureLifeCycleRequest request);

    CompletableFuture<SetDeviceRecordLifeCycleResponse> setDeviceRecordLifeCycle(SetDeviceRecordLifeCycleRequest request);

    CompletableFuture<StopLiveStreamingResponse> stopLiveStreaming(StopLiveStreamingRequest request);

    CompletableFuture<StopTriggeredRecordResponse> stopTriggeredRecord(StopTriggeredRecordRequest request);

    CompletableFuture<TransferDeviceInstanceResponse> transferDeviceInstance(TransferDeviceInstanceRequest request);

    CompletableFuture<TriggerCapturePictureResponse> triggerCapturePicture(TriggerCapturePictureRequest request);

    CompletableFuture<TriggerRecordResponse> triggerRecord(TriggerRecordRequest request);

    CompletableFuture<UnbindAIPlanWithDevicesResponse> unbindAIPlanWithDevices(UnbindAIPlanWithDevicesRequest request);

    CompletableFuture<UnbindPictureSearchAppWithDevicesResponse> unbindPictureSearchAppWithDevices(UnbindPictureSearchAppWithDevicesRequest request);

    CompletableFuture<UpdateAIAppResponse> updateAIApp(UpdateAIAppRequest request);

    CompletableFuture<UpdateAIPlanResponse> updateAIPlan(UpdateAIPlanRequest request);

    CompletableFuture<UpdateDevicePurifyPlanResponse> updateDevicePurifyPlan(UpdateDevicePurifyPlanRequest request);

    CompletableFuture<UpdateEventRecordPlanResponse> updateEventRecordPlan(UpdateEventRecordPlanRequest request);

    CompletableFuture<UpdateFaceUserResponse> updateFaceUser(UpdateFaceUserRequest request);

    CompletableFuture<UpdateFaceUserGroupAndDeviceGroupRelationResponse> updateFaceUserGroupAndDeviceGroupRelation(UpdateFaceUserGroupAndDeviceGroupRelationRequest request);

    CompletableFuture<UpdateModelResponse> updateModel(UpdateModelRequest request);

    CompletableFuture<UpdatePictureSearchAppResponse> updatePictureSearchApp(UpdatePictureSearchAppRequest request);

    CompletableFuture<UpdateRecordPlanResponse> updateRecordPlan(UpdateRecordPlanRequest request);

    CompletableFuture<UpdateTimeTemplateResponse> updateTimeTemplate(UpdateTimeTemplateRequest request);

}
