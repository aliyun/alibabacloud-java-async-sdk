// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.linkvisual20180120.models.*;
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
     * @param request the request parameters of AddEventRecordPlanDevice  AddEventRecordPlanDeviceRequest
     * @return AddEventRecordPlanDeviceResponse
     */
    CompletableFuture<AddEventRecordPlanDeviceResponse> addEventRecordPlanDevice(AddEventRecordPlanDeviceRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 100.<blockquote>
     * <p>Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * </li>
     * <li>After you invoke this API operation, the system returns the ID of the device group (<strong>DeviceGroupId</strong>). Save this value locally for use when invoking other API operations.</li>
     * </ul>
     * 
     * @param request the request parameters of AddFaceDeviceGroup  AddFaceDeviceGroupRequest
     * @return AddFaceDeviceGroupResponse
     */
    CompletableFuture<AddFaceDeviceGroupResponse> addFaceDeviceGroup(AddFaceDeviceGroupRequest request);

    /**
     * @param request the request parameters of AddFaceDeviceToDeviceGroup  AddFaceDeviceToDeviceGroupRequest
     * @return AddFaceDeviceToDeviceGroupResponse
     */
    CompletableFuture<AddFaceDeviceToDeviceGroupResponse> addFaceDeviceToDeviceGroup(AddFaceDeviceToDeviceGroupRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 100.<blockquote>
     * <p>Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * </li>
     * <li>Configure a URL for downloading the user\&quot;s face image in advance.<blockquote>
     * <p>Only JPEG and JPG image formats are supported, and the image URL cannot contain Chinese characters.</p>
     * </blockquote>
     * </li>
     * <li>After you invoke this API operation, the system returns a user ID (<strong>UserId</strong>). Save this value locally for use when you invoke other API operations.</li>
     * </ul>
     * 
     * @param request the request parameters of AddFaceUser  AddFaceUserRequest
     * @return AddFaceUserResponse
     */
    CompletableFuture<AddFaceUserResponse> addFaceUser(AddFaceUserRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>The maximum queries per second (QPS) limit for a single Alibaba Cloud account to invoke this API operation is 100.<blockquote>
     * <p>Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * </li>
     * <li>After you invoke this API operation, the system returns the ID of the user group (<strong>UserGroupId</strong>). Save this value locally for use when you invoke other API operations.</li>
     * </ul>
     * 
     * @param request the request parameters of AddFaceUserGroup  AddFaceUserGroupRequest
     * @return AddFaceUserGroupResponse
     */
    CompletableFuture<AddFaceUserGroupResponse> addFaceUserGroup(AddFaceUserGroupRequest request);

    /**
     * @param request the request parameters of AddFaceUserGroupAndDeviceGroupRelation  AddFaceUserGroupAndDeviceGroupRelationRequest
     * @return AddFaceUserGroupAndDeviceGroupRelationResponse
     */
    CompletableFuture<AddFaceUserGroupAndDeviceGroupRelationResponse> addFaceUserGroupAndDeviceGroupRelation(AddFaceUserGroupAndDeviceGroupRelationRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 100.<blockquote>
     * <p>Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * </li>
     * <li>Configure a download URL for the user\&quot;s face image in advance.<blockquote>
     * <p>Only images in JPEG and JPG format are supported, and the image URL cannot contain Chinese characters.</p>
     * </blockquote>
     * </li>
     * <li>After you invoke this API operation, the system returns the unique identity (<strong>Data</strong>) of the user\&quot;s face image. Save this value locally for use when you invoke other API operations.</li>
     * </ul>
     * 
     * @param request the request parameters of AddFaceUserPicture  AddFaceUserPictureRequest
     * @return AddFaceUserPictureResponse
     */
    CompletableFuture<AddFaceUserPictureResponse> addFaceUserPicture(AddFaceUserPictureRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this operation is 100.
     *     &gt; Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * 
     * @param request the request parameters of AddFaceUserToUserGroup  AddFaceUserToUserGroupRequest
     * @return AddFaceUserToUserGroupResponse
     */
    CompletableFuture<AddFaceUserToUserGroupResponse> addFaceUserToUserGroup(AddFaceUserToUserGroupRequest request);

    /**
     * @param request the request parameters of AddRecordPlanDevice  AddRecordPlanDeviceRequest
     * @return AddRecordPlanDeviceResponse
     */
    CompletableFuture<AddRecordPlanDeviceResponse> addRecordPlanDevice(AddRecordPlanDeviceRequest request);

    /**
     * @param request the request parameters of BatchQueryVisionDeviceInfo  BatchQueryVisionDeviceInfoRequest
     * @return BatchQueryVisionDeviceInfoResponse
     */
    CompletableFuture<BatchQueryVisionDeviceInfoResponse> batchQueryVisionDeviceInfo(BatchQueryVisionDeviceInfoRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>If you invoke this operation on an Enterprise instance, you must specify the <strong>IotInstanceId</strong> request parameter. Otherwise, the invocation failed.</p>
     * 
     * @param request the request parameters of BindPictureSearchAppWithDevices  BindPictureSearchAppWithDevicesRequest
     * @return BindPictureSearchAppWithDevicesResponse
     */
    CompletableFuture<BindPictureSearchAppWithDevicesResponse> bindPictureSearchAppWithDevices(BindPictureSearchAppWithDevicesRequest request);

    /**
     * @param request the request parameters of CheckFaceUserDoExistOnDevice  CheckFaceUserDoExistOnDeviceRequest
     * @return CheckFaceUserDoExistOnDeviceResponse
     */
    CompletableFuture<CheckFaceUserDoExistOnDeviceResponse> checkFaceUserDoExistOnDevice(CheckFaceUserDoExistOnDeviceRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this operation is 100.
     *     &gt; Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * 
     * @param request the request parameters of ClearFaceDeviceDB  ClearFaceDeviceDBRequest
     * @return ClearFaceDeviceDBResponse
     */
    CompletableFuture<ClearFaceDeviceDBResponse> clearFaceDeviceDB(ClearFaceDeviceDBRequest request);

    /**
     * @param request the request parameters of CreateEventRecordPlan  CreateEventRecordPlanRequest
     * @return CreateEventRecordPlanResponse
     */
    CompletableFuture<CreateEventRecordPlanResponse> createEventRecordPlan(CreateEventRecordPlanRequest request);

    /**
     * @param request the request parameters of CreateGbDevice  CreateGbDeviceRequest
     * @return CreateGbDeviceResponse
     */
    CompletableFuture<CreateGbDeviceResponse> createGbDevice(CreateGbDeviceRequest request);

    /**
     * <b>description</b> :
     * <p>A single local video recording upload job supports uploading up to 200 files. The maximum number of items in the TimeSlot list is 200.</p>
     * 
     * @param request the request parameters of CreateLocalFileUploadJob  CreateLocalFileUploadJobRequest
     * @return CreateLocalFileUploadJobResponse
     */
    CompletableFuture<CreateLocalFileUploadJobResponse> createLocalFileUploadJob(CreateLocalFileUploadJobRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>The maximum duration for a single time-based download is 30 minutes.</li>
     * <li>Download tasks and files are retained for up to 1 day. You can re-download them after they expire.</li>
     * <li>A single instance supports up to 10 concurrent downloads. Completed downloads are not counted.</li>
     * <li>If the audio and video encoding parameters change, the downloaded recording defaults to the first half of the recording.</li>
     * <li>Due to fluctuations in the device\&quot;s upstream network, the link may be abnormally disconnected or the device may actively drop data. As a result, the uploaded and downloaded recordings may be incomplete.</li>
     * <li>The downloaded recording data is determined by the device\&quot;s stream pushing logic. If the pushed data is abnormal, the duration of the downloaded recording may not match the time period specified in the task settings.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this operation is 50.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users under a single Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateLocalRecordDownloadByTimeJob  CreateLocalRecordDownloadByTimeJobRequest
     * @return CreateLocalRecordDownloadByTimeJobResponse
     */
    CompletableFuture<CreateLocalRecordDownloadByTimeJobResponse> createLocalRecordDownloadByTimeJob(CreateLocalRecordDownloadByTimeJobRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 100.</p>
     * <blockquote>
     * <p>A Resource Access Management (RAM) user shares the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreatePictureSearchApp  CreatePictureSearchAppRequest
     * @return CreatePictureSearchAppResponse
     */
    CompletableFuture<CreatePictureSearchAppResponse> createPictureSearchApp(CreatePictureSearchAppRequest request);

    /**
     * <b>description</b> :
     * <p>Integrated image search retrieves both face and human body features simultaneously during an image search.</p>
     * <blockquote>
     * <p>This feature requires the deployment of face and human body detection algorithms on V-series edge all-in-one machines.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreatePictureSearchJob  CreatePictureSearchJobRequest
     * @return CreatePictureSearchJobResponse
     */
    CompletableFuture<CreatePictureSearchJobResponse> createPictureSearchJob(CreatePictureSearchJobRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>Maximum duration for a single time-based download: 30 minutes.</li>
     * <li>Download time precision: The precision of the download time range is within 10 seconds. For example, if you select a 20-second data segment to download, up to 30 seconds of data may be downloaded.</li>
     * <li>Maximum number of recording files for a single time-based download: 100.</li>
     * <li>Download tasks and files are retained for up to 1 day. You can re-download them after they expire.</li>
     * <li>Maximum concurrent downloads per instance: 10. Completed downloads are not counted.</li>
     * <li>If the audio and video encoding parameters change, the first half of the recording is downloaded by default.</li>
     * <li>If the download time ranges of recordings overlap, the cloud deduplicates the overlapping data.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to call this API operation is 50.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users under a single Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateRecordDownloadByTimeJob  CreateRecordDownloadByTimeJobRequest
     * @return CreateRecordDownloadByTimeJobResponse
     */
    CompletableFuture<CreateRecordDownloadByTimeJobResponse> createRecordDownloadByTimeJob(CreateRecordDownloadByTimeJobRequest request);

    /**
     * @param request the request parameters of CreateRecordPlan  CreateRecordPlanRequest
     * @return CreateRecordPlanResponse
     */
    CompletableFuture<CreateRecordPlanResponse> createRecordPlan(CreateRecordPlanRequest request);

    /**
     * @param request the request parameters of CreateRtmpDevice  CreateRtmpDeviceRequest
     * @return CreateRtmpDeviceResponse
     */
    CompletableFuture<CreateRtmpDeviceResponse> createRtmpDevice(CreateRtmpDeviceRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 50.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users under an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateStreamPushJob  CreateStreamPushJobRequest
     * @return CreateStreamPushJobResponse
     */
    CompletableFuture<CreateStreamPushJobResponse> createStreamPushJob(CreateStreamPushJobRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this operation is 50.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users under a single Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateStreamSnapshotJob  CreateStreamSnapshotJobRequest
     * @return CreateStreamSnapshotJobResponse
     */
    CompletableFuture<CreateStreamSnapshotJobResponse> createStreamSnapshotJob(CreateStreamSnapshotJobRequest request);

    /**
     * @param request the request parameters of CreateTimeTemplate  CreateTimeTemplateRequest
     * @return CreateTimeTemplateResponse
     */
    CompletableFuture<CreateTimeTemplateResponse> createTimeTemplate(CreateTimeTemplateRequest request);

    /**
     * @param request the request parameters of DeleteEventRecordPlan  DeleteEventRecordPlanRequest
     * @return DeleteEventRecordPlanResponse
     */
    CompletableFuture<DeleteEventRecordPlanResponse> deleteEventRecordPlan(DeleteEventRecordPlanRequest request);

    /**
     * @param request the request parameters of DeleteEventRecordPlanDevice  DeleteEventRecordPlanDeviceRequest
     * @return DeleteEventRecordPlanDeviceResponse
     */
    CompletableFuture<DeleteEventRecordPlanDeviceResponse> deleteEventRecordPlanDevice(DeleteEventRecordPlanDeviceRequest request);

    /**
     * @param request the request parameters of DeleteFaceDeviceGroup  DeleteFaceDeviceGroupRequest
     * @return DeleteFaceDeviceGroupResponse
     */
    CompletableFuture<DeleteFaceDeviceGroupResponse> deleteFaceDeviceGroup(DeleteFaceDeviceGroupRequest request);

    /**
     * @param request the request parameters of DeleteFaceUser  DeleteFaceUserRequest
     * @return DeleteFaceUserResponse
     */
    CompletableFuture<DeleteFaceUserResponse> deleteFaceUser(DeleteFaceUserRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this operation is 100.</p>
     * <blockquote>
     * <p>Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteFaceUserGroup  DeleteFaceUserGroupRequest
     * @return DeleteFaceUserGroupResponse
     */
    CompletableFuture<DeleteFaceUserGroupResponse> deleteFaceUserGroup(DeleteFaceUserGroupRequest request);

    /**
     * <b>description</b> :
     * <h2>Before you begin</h2>
     * <p>The maximum number of queries per second (QPS) per Alibaba Cloud account for invoking this operation is 100.
     *     &gt; Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * 
     * @param request the request parameters of DeleteFaceUserGroupAndDeviceGroupRelation  DeleteFaceUserGroupAndDeviceGroupRelationRequest
     * @return DeleteFaceUserGroupAndDeviceGroupRelationResponse
     */
    CompletableFuture<DeleteFaceUserGroupAndDeviceGroupRelationResponse> deleteFaceUserGroupAndDeviceGroupRelation(DeleteFaceUserGroupAndDeviceGroupRelationRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this operation is 100.</p>
     * <blockquote>
     * <p>Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteFaceUserPicture  DeleteFaceUserPictureRequest
     * @return DeleteFaceUserPictureResponse
     */
    CompletableFuture<DeleteFaceUserPictureResponse> deleteFaceUserPicture(DeleteFaceUserPictureRequest request);

    /**
     * @param request the request parameters of DeleteGbDevice  DeleteGbDeviceRequest
     * @return DeleteGbDeviceResponse
     */
    CompletableFuture<DeleteGbDeviceResponse> deleteGbDevice(DeleteGbDeviceRequest request);

    /**
     * <b>description</b> :
     * <p>After you stop a local recording upload task, the recording files that have been created are not deleted.</p>
     * 
     * @param request the request parameters of DeleteLocalFileUploadJob  DeleteLocalFileUploadJobRequest
     * @return DeleteLocalFileUploadJobResponse
     */
    CompletableFuture<DeleteLocalFileUploadJobResponse> deleteLocalFileUploadJob(DeleteLocalFileUploadJobRequest request);

    /**
     * @param request the request parameters of DeletePicture  DeletePictureRequest
     * @return DeletePictureResponse
     */
    CompletableFuture<DeletePictureResponse> deletePicture(DeletePictureRequest request);

    /**
     * @param request the request parameters of DeleteRecord  DeleteRecordRequest
     * @return DeleteRecordResponse
     */
    CompletableFuture<DeleteRecordResponse> deleteRecord(DeleteRecordRequest request);

    /**
     * @param request the request parameters of DeleteRecordPlan  DeleteRecordPlanRequest
     * @return DeleteRecordPlanResponse
     */
    CompletableFuture<DeleteRecordPlanResponse> deleteRecordPlan(DeleteRecordPlanRequest request);

    /**
     * @param request the request parameters of DeleteRecordPlanDevice  DeleteRecordPlanDeviceRequest
     * @return DeleteRecordPlanDeviceResponse
     */
    CompletableFuture<DeleteRecordPlanDeviceResponse> deleteRecordPlanDevice(DeleteRecordPlanDeviceRequest request);

    /**
     * @param request the request parameters of DeleteRtmpDevice  DeleteRtmpDeviceRequest
     * @return DeleteRtmpDeviceResponse
     */
    CompletableFuture<DeleteRtmpDeviceResponse> deleteRtmpDevice(DeleteRtmpDeviceRequest request);

    /**
     * @param request the request parameters of DeleteRtmpKey  DeleteRtmpKeyRequest
     * @return DeleteRtmpKeyResponse
     */
    CompletableFuture<DeleteRtmpKeyResponse> deleteRtmpKey(DeleteRtmpKeyRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>A single Alibaba Cloud account can invoke this operation up to 50 times per second (QPS).</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users under a single Alibaba Cloud account share the quota of that account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteStreamPushJob  DeleteStreamPushJobRequest
     * @return DeleteStreamPushJobResponse
     */
    CompletableFuture<DeleteStreamPushJobResponse> deleteStreamPushJob(DeleteStreamPushJobRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 50.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users under a single Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteStreamSnapshotJob  DeleteStreamSnapshotJobRequest
     * @return DeleteStreamSnapshotJobResponse
     */
    CompletableFuture<DeleteStreamSnapshotJobResponse> deleteStreamSnapshotJob(DeleteStreamSnapshotJobRequest request);

    /**
     * @param request the request parameters of DeleteTimeTemplate  DeleteTimeTemplateRequest
     * @return DeleteTimeTemplateResponse
     */
    CompletableFuture<DeleteTimeTemplateResponse> deleteTimeTemplate(DeleteTimeTemplateRequest request);

    /**
     * @param request the request parameters of EnableGbSubDevice  EnableGbSubDeviceRequest
     * @return EnableGbSubDeviceResponse
     */
    CompletableFuture<EnableGbSubDeviceResponse> enableGbSubDevice(EnableGbSubDeviceRequest request);

    /**
     * <b>description</b> :
     * <p>Integrated image search retrieves both facial and body features during an image search.</p>
     * <blockquote>
     * <p>This feature requires the deployment of face and body detection algorithms on V-series edge all-in-one machines.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetPictureSearchJobStatus  GetPictureSearchJobStatusRequest
     * @return GetPictureSearchJobStatusResponse
     */
    CompletableFuture<GetPictureSearchJobStatusResponse> getPictureSearchJobStatus(GetPictureSearchJobStatusRequest request);

    /**
     * @param request the request parameters of PictureSearchPicture  PictureSearchPictureRequest
     * @return PictureSearchPictureResponse
     */
    CompletableFuture<PictureSearchPictureResponse> pictureSearchPicture(PictureSearchPictureRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to call this API operation is 10.  </p>
     * <blockquote>
     * <p>Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryCarProcessEvents  QueryCarProcessEventsRequest
     * @return QueryCarProcessEventsResponse
     */
    CompletableFuture<QueryCarProcessEventsResponse> queryCarProcessEvents(QueryCarProcessEventsRequest request);

    /**
     * @param request the request parameters of QueryDeviceEvent  QueryDeviceEventRequest
     * @return QueryDeviceEventResponse
     */
    CompletableFuture<QueryDeviceEventResponse> queryDeviceEvent(QueryDeviceEventRequest request);

    /**
     * @param request the request parameters of QueryDeviceEventPicture  QueryDeviceEventPictureRequest
     * @return QueryDeviceEventPictureResponse
     */
    CompletableFuture<QueryDeviceEventPictureResponse> queryDeviceEventPicture(QueryDeviceEventPictureRequest request);

    /**
     * @param request the request parameters of QueryDeviceEventRecord  QueryDeviceEventRecordRequest
     * @return QueryDeviceEventRecordResponse
     */
    CompletableFuture<QueryDeviceEventRecordResponse> queryDeviceEventRecord(QueryDeviceEventRecordRequest request);

    /**
     * @param request the request parameters of QueryDevicePictureByList  QueryDevicePictureByListRequest
     * @return QueryDevicePictureByListResponse
     */
    CompletableFuture<QueryDevicePictureByListResponse> queryDevicePictureByList(QueryDevicePictureByListRequest request);

    /**
     * @param request the request parameters of QueryDevicePictureFile  QueryDevicePictureFileRequest
     * @return QueryDevicePictureFileResponse
     */
    CompletableFuture<QueryDevicePictureFileResponse> queryDevicePictureFile(QueryDevicePictureFileRequest request);

    /**
     * @param request the request parameters of QueryDevicePictureLifeCycle  QueryDevicePictureLifeCycleRequest
     * @return QueryDevicePictureLifeCycleResponse
     */
    CompletableFuture<QueryDevicePictureLifeCycleResponse> queryDevicePictureLifeCycle(QueryDevicePictureLifeCycleRequest request);

    /**
     * @param request the request parameters of QueryDeviceRecordLifeCycle  QueryDeviceRecordLifeCycleRequest
     * @return QueryDeviceRecordLifeCycleResponse
     */
    CompletableFuture<QueryDeviceRecordLifeCycleResponse> queryDeviceRecordLifeCycle(QueryDeviceRecordLifeCycleRequest request);

    /**
     * @param request the request parameters of QueryDeviceVodUrl  QueryDeviceVodUrlRequest
     * @return QueryDeviceVodUrlResponse
     */
    CompletableFuture<QueryDeviceVodUrlResponse> queryDeviceVodUrl(QueryDeviceVodUrlRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>This operation is supported only in scenarios where IPC devices are directly connected to IoT Platform.</p>
     * 
     * @param request the request parameters of QueryDeviceVodUrlByTime  QueryDeviceVodUrlByTimeRequest
     * @return QueryDeviceVodUrlByTimeResponse
     */
    CompletableFuture<QueryDeviceVodUrlByTimeResponse> queryDeviceVodUrlByTime(QueryDeviceVodUrlByTimeRequest request);

    /**
     * @param request the request parameters of QueryEventRecordPlanDetail  QueryEventRecordPlanDetailRequest
     * @return QueryEventRecordPlanDetailResponse
     */
    CompletableFuture<QueryEventRecordPlanDetailResponse> queryEventRecordPlanDetail(QueryEventRecordPlanDetailRequest request);

    /**
     * @param request the request parameters of QueryEventRecordPlanDeviceByDevice  QueryEventRecordPlanDeviceByDeviceRequest
     * @return QueryEventRecordPlanDeviceByDeviceResponse
     */
    CompletableFuture<QueryEventRecordPlanDeviceByDeviceResponse> queryEventRecordPlanDeviceByDevice(QueryEventRecordPlanDeviceByDeviceRequest request);

    /**
     * @param request the request parameters of QueryEventRecordPlanDeviceByPlan  QueryEventRecordPlanDeviceByPlanRequest
     * @return QueryEventRecordPlanDeviceByPlanResponse
     */
    CompletableFuture<QueryEventRecordPlanDeviceByPlanResponse> queryEventRecordPlanDeviceByPlan(QueryEventRecordPlanDeviceByPlanRequest request);

    /**
     * @param request the request parameters of QueryEventRecordPlans  QueryEventRecordPlansRequest
     * @return QueryEventRecordPlansResponse
     */
    CompletableFuture<QueryEventRecordPlansResponse> queryEventRecordPlans(QueryEventRecordPlansRequest request);

    /**
     * @param request the request parameters of QueryFaceAllDeviceGroup  QueryFaceAllDeviceGroupRequest
     * @return QueryFaceAllDeviceGroupResponse
     */
    CompletableFuture<QueryFaceAllDeviceGroupResponse> queryFaceAllDeviceGroup(QueryFaceAllDeviceGroupRequest request);

    /**
     * @param request the request parameters of QueryFaceAllUserGroup  QueryFaceAllUserGroupRequest
     * @return QueryFaceAllUserGroupResponse
     */
    CompletableFuture<QueryFaceAllUserGroupResponse> queryFaceAllUserGroup(QueryFaceAllUserGroupRequest request);

    /**
     * @param request the request parameters of QueryFaceAllUserGroupAndDeviceGroupRelation  QueryFaceAllUserGroupAndDeviceGroupRelationRequest
     * @return QueryFaceAllUserGroupAndDeviceGroupRelationResponse
     */
    CompletableFuture<QueryFaceAllUserGroupAndDeviceGroupRelationResponse> queryFaceAllUserGroupAndDeviceGroupRelation(QueryFaceAllUserGroupAndDeviceGroupRelationRequest request);

    /**
     * @param request the request parameters of QueryFaceAllUserIdsByGroupId  QueryFaceAllUserIdsByGroupIdRequest
     * @return QueryFaceAllUserIdsByGroupIdResponse
     */
    CompletableFuture<QueryFaceAllUserIdsByGroupIdResponse> queryFaceAllUserIdsByGroupId(QueryFaceAllUserIdsByGroupIdRequest request);

    /**
     * @param request the request parameters of QueryFaceCustomUserIdByUserId  QueryFaceCustomUserIdByUserIdRequest
     * @return QueryFaceCustomUserIdByUserIdResponse
     */
    CompletableFuture<QueryFaceCustomUserIdByUserIdResponse> queryFaceCustomUserIdByUserId(QueryFaceCustomUserIdByUserIdRequest request);

    /**
     * @param request the request parameters of QueryFaceDeviceGroupsByDevice  QueryFaceDeviceGroupsByDeviceRequest
     * @return QueryFaceDeviceGroupsByDeviceResponse
     */
    CompletableFuture<QueryFaceDeviceGroupsByDeviceResponse> queryFaceDeviceGroupsByDevice(QueryFaceDeviceGroupsByDeviceRequest request);

    /**
     * @param request the request parameters of QueryFaceUser  QueryFaceUserRequest
     * @return QueryFaceUserResponse
     */
    CompletableFuture<QueryFaceUserResponse> queryFaceUser(QueryFaceUserRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 100.<blockquote>
     * <p>Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of QueryFaceUserBatch  QueryFaceUserBatchRequest
     * @return QueryFaceUserBatchResponse
     */
    CompletableFuture<QueryFaceUserBatchResponse> queryFaceUserBatch(QueryFaceUserBatchRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 100.<blockquote>
     * <p>Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of QueryFaceUserByName  QueryFaceUserByNameRequest
     * @return QueryFaceUserByNameResponse
     */
    CompletableFuture<QueryFaceUserByNameResponse> queryFaceUserByName(QueryFaceUserByNameRequest request);

    /**
     * @param request the request parameters of QueryFaceUserGroup  QueryFaceUserGroupRequest
     * @return QueryFaceUserGroupResponse
     */
    CompletableFuture<QueryFaceUserGroupResponse> queryFaceUserGroup(QueryFaceUserGroupRequest request);

    /**
     * @param request the request parameters of QueryFaceUserGroupAndDeviceGroupRelation  QueryFaceUserGroupAndDeviceGroupRelationRequest
     * @return QueryFaceUserGroupAndDeviceGroupRelationResponse
     */
    CompletableFuture<QueryFaceUserGroupAndDeviceGroupRelationResponse> queryFaceUserGroupAndDeviceGroupRelation(QueryFaceUserGroupAndDeviceGroupRelationRequest request);

    /**
     * @param request the request parameters of QueryFaceUserIdByCustomUserId  QueryFaceUserIdByCustomUserIdRequest
     * @return QueryFaceUserIdByCustomUserIdResponse
     */
    CompletableFuture<QueryFaceUserIdByCustomUserIdResponse> queryFaceUserIdByCustomUserId(QueryFaceUserIdByCustomUserIdRequest request);

    /**
     * @param request the request parameters of QueryGbSubDeviceList  QueryGbSubDeviceListRequest
     * @return QueryGbSubDeviceListResponse
     */
    CompletableFuture<QueryGbSubDeviceListResponse> queryGbSubDeviceList(QueryGbSubDeviceListRequest request);

    /**
     * @param request the request parameters of QueryLiveStreaming  QueryLiveStreamingRequest
     * @return QueryLiveStreamingResponse
     */
    CompletableFuture<QueryLiveStreamingResponse> queryLiveStreaming(QueryLiveStreamingRequest request);

    /**
     * @param request the request parameters of QueryLocalFileUploadJob  QueryLocalFileUploadJobRequest
     * @return QueryLocalFileUploadJobResponse
     */
    CompletableFuture<QueryLocalFileUploadJobResponse> queryLocalFileUploadJob(QueryLocalFileUploadJobRequest request);

    /**
     * @param request the request parameters of QueryMonthRecord  QueryMonthRecordRequest
     * @return QueryMonthRecordResponse
     */
    CompletableFuture<QueryMonthRecordResponse> queryMonthRecord(QueryMonthRecordRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 500.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users under a single Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryPictureFiles  QueryPictureFilesRequest
     * @return QueryPictureFilesResponse
     */
    CompletableFuture<QueryPictureFilesResponse> queryPictureFiles(QueryPictureFilesRequest request);

    /**
     * @param request the request parameters of QueryPictureSearchAiboxes  QueryPictureSearchAiboxesRequest
     * @return QueryPictureSearchAiboxesResponse
     */
    CompletableFuture<QueryPictureSearchAiboxesResponse> queryPictureSearchAiboxes(QueryPictureSearchAiboxesRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 100.</p>
     * <blockquote>
     * <p>Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryPictureSearchApps  QueryPictureSearchAppsRequest
     * @return QueryPictureSearchAppsResponse
     */
    CompletableFuture<QueryPictureSearchAppsResponse> queryPictureSearchApps(QueryPictureSearchAppsRequest request);

    /**
     * @param request the request parameters of QueryPictureSearchDevices  QueryPictureSearchDevicesRequest
     * @return QueryPictureSearchDevicesResponse
     */
    CompletableFuture<QueryPictureSearchDevicesResponse> queryPictureSearchDevices(QueryPictureSearchDevicesRequest request);

    /**
     * <b>description</b> :
     * <p>Integrated image search means that both faces and human bodies are retrieved simultaneously during an image search.</p>
     * <blockquote>
     * <p>This feature requires the deployment of face and human body detection algorithms on V-series edge all-in-one machines.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryPictureSearchJob  QueryPictureSearchJobRequest
     * @return QueryPictureSearchJobResponse
     */
    CompletableFuture<QueryPictureSearchJobResponse> queryPictureSearchJob(QueryPictureSearchJobRequest request);

    /**
     * @param request the request parameters of QueryPictureSearchJobResult  QueryPictureSearchJobResultRequest
     * @return QueryPictureSearchJobResultResponse
     */
    CompletableFuture<QueryPictureSearchJobResultResponse> queryPictureSearchJobResult(QueryPictureSearchJobResultRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 250.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users within a single Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryRecord  QueryRecordRequest
     * @return QueryRecordResponse
     */
    CompletableFuture<QueryRecordResponse> queryRecord(QueryRecordRequest request);

    /**
     * @param request the request parameters of QueryRecordByRecordId  QueryRecordByRecordIdRequest
     * @return QueryRecordByRecordIdResponse
     */
    CompletableFuture<QueryRecordByRecordIdResponse> queryRecordByRecordId(QueryRecordByRecordIdRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>The obtained recording download URL is valid for 1 hour.</p>
     * <h2>QPS limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 50.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users under a single Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryRecordDownloadJobById  QueryRecordDownloadJobByIdRequest
     * @return QueryRecordDownloadJobByIdResponse
     */
    CompletableFuture<QueryRecordDownloadJobByIdResponse> queryRecordDownloadJobById(QueryRecordDownloadJobByIdRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>The obtained recording download URL is valid for 1 hour.</p>
     * <h2>QPS limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 50.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users within a single Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryRecordDownloadJobList  QueryRecordDownloadJobListRequest
     * @return QueryRecordDownloadJobListResponse
     */
    CompletableFuture<QueryRecordDownloadJobListResponse> queryRecordDownloadJobList(QueryRecordDownloadJobListRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>Generating a cloud recording file takes a long time. You must poll this operation to obtain the progress. The download URL is generated only after the progress is complete.</p>
     * 
     * @param request the request parameters of QueryRecordDownloadUrl  QueryRecordDownloadUrlRequest
     * @return QueryRecordDownloadUrlResponse
     */
    CompletableFuture<QueryRecordDownloadUrlResponse> queryRecordDownloadUrl(QueryRecordDownloadUrlRequest request);

    /**
     * @param request the request parameters of QueryRecordPlanDetail  QueryRecordPlanDetailRequest
     * @return QueryRecordPlanDetailResponse
     */
    CompletableFuture<QueryRecordPlanDetailResponse> queryRecordPlanDetail(QueryRecordPlanDetailRequest request);

    /**
     * @param request the request parameters of QueryRecordPlanDeviceByDevice  QueryRecordPlanDeviceByDeviceRequest
     * @return QueryRecordPlanDeviceByDeviceResponse
     */
    CompletableFuture<QueryRecordPlanDeviceByDeviceResponse> queryRecordPlanDeviceByDevice(QueryRecordPlanDeviceByDeviceRequest request);

    /**
     * @param request the request parameters of QueryRecordPlanDeviceByPlan  QueryRecordPlanDeviceByPlanRequest
     * @return QueryRecordPlanDeviceByPlanResponse
     */
    CompletableFuture<QueryRecordPlanDeviceByPlanResponse> queryRecordPlanDeviceByPlan(QueryRecordPlanDeviceByPlanRequest request);

    /**
     * @param request the request parameters of QueryRecordPlans  QueryRecordPlansRequest
     * @return QueryRecordPlansResponse
     */
    CompletableFuture<QueryRecordPlansResponse> queryRecordPlans(QueryRecordPlansRequest request);

    /**
     * @param request the request parameters of QueryRecordUrl  QueryRecordUrlRequest
     * @return QueryRecordUrlResponse
     */
    CompletableFuture<QueryRecordUrlResponse> queryRecordUrl(QueryRecordUrlRequest request);

    /**
     * @param request the request parameters of QueryRecordUrlByTime  QueryRecordUrlByTimeRequest
     * @return QueryRecordUrlByTimeResponse
     */
    CompletableFuture<QueryRecordUrlByTimeResponse> queryRecordUrlByTime(QueryRecordUrlByTimeRequest request);

    /**
     * @param request the request parameters of QueryRtmpKey  QueryRtmpKeyRequest
     * @return QueryRtmpKeyResponse
     */
    CompletableFuture<QueryRtmpKeyResponse> queryRtmpKey(QueryRtmpKeyRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to call this API operation is 50.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users within a single Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryStreamPushJob  QueryStreamPushJobRequest
     * @return QueryStreamPushJobResponse
     */
    CompletableFuture<QueryStreamPushJobResponse> queryStreamPushJob(QueryStreamPushJobRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this operation is 50.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users under a single Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryStreamPushJobList  QueryStreamPushJobListRequest
     * @return QueryStreamPushJobListResponse
     */
    CompletableFuture<QueryStreamPushJobListResponse> queryStreamPushJobList(QueryStreamPushJobListRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 50.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users under a single Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryStreamSnapshotJob  QueryStreamSnapshotJobRequest
     * @return QueryStreamSnapshotJobResponse
     */
    CompletableFuture<QueryStreamSnapshotJobResponse> queryStreamSnapshotJob(QueryStreamSnapshotJobRequest request);

    /**
     * @param request the request parameters of QueryTimeTemplate  QueryTimeTemplateRequest
     * @return QueryTimeTemplateResponse
     */
    CompletableFuture<QueryTimeTemplateResponse> queryTimeTemplate(QueryTimeTemplateRequest request);

    /**
     * @param request the request parameters of QueryTimeTemplateDetail  QueryTimeTemplateDetailRequest
     * @return QueryTimeTemplateDetailResponse
     */
    CompletableFuture<QueryTimeTemplateDetailResponse> queryTimeTemplateDetail(QueryTimeTemplateDetailRequest request);

    /**
     * @param request the request parameters of QueryVisionDeviceInfo  QueryVisionDeviceInfoRequest
     * @return QueryVisionDeviceInfoResponse
     */
    CompletableFuture<QueryVisionDeviceInfoResponse> queryVisionDeviceInfo(QueryVisionDeviceInfoRequest request);

    /**
     * @param request the request parameters of QueryVoiceIntercom  QueryVoiceIntercomRequest
     * @return QueryVoiceIntercomResponse
     */
    CompletableFuture<QueryVoiceIntercomResponse> queryVoiceIntercom(QueryVoiceIntercomRequest request);

    /**
     * @param request the request parameters of RefreshGbSubDeviceList  RefreshGbSubDeviceListRequest
     * @return RefreshGbSubDeviceListResponse
     */
    CompletableFuture<RefreshGbSubDeviceListResponse> refreshGbSubDeviceList(RefreshGbSubDeviceListRequest request);

    /**
     * @param request the request parameters of RemoveFaceDeviceFromDeviceGroup  RemoveFaceDeviceFromDeviceGroupRequest
     * @return RemoveFaceDeviceFromDeviceGroupResponse
     */
    CompletableFuture<RemoveFaceDeviceFromDeviceGroupResponse> removeFaceDeviceFromDeviceGroup(RemoveFaceDeviceFromDeviceGroupRequest request);

    /**
     * @param request the request parameters of RemoveFaceUserFromUserGroup  RemoveFaceUserFromUserGroupRequest
     * @return RemoveFaceUserFromUserGroupResponse
     */
    CompletableFuture<RemoveFaceUserFromUserGroupResponse> removeFaceUserFromUserGroup(RemoveFaceUserFromUserGroupRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>By default, images are permanently stored in the cloud before you configure the cloud storage image lifecycle.</p>
     * </blockquote>
     * 
     * @param request the request parameters of SetDevicePictureLifeCycle  SetDevicePictureLifeCycleRequest
     * @return SetDevicePictureLifeCycleResponse
     */
    CompletableFuture<SetDevicePictureLifeCycleResponse> setDevicePictureLifeCycle(SetDevicePictureLifeCycleRequest request);

    /**
     * @param request the request parameters of SetDeviceRecordLifeCycle  SetDeviceRecordLifeCycleRequest
     * @return SetDeviceRecordLifeCycleResponse
     */
    CompletableFuture<SetDeviceRecordLifeCycleResponse> setDeviceRecordLifeCycle(SetDeviceRecordLifeCycleRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>Before you invoke this operation, you must implement the Thing Specification Language (TSL) model service for stopping live streaming with the identity <strong>StopPushStreaming</strong> on the IPC device. If this service is not implemented on the IPC device, or the IPC device does not return a normal response after receiving the service invocation, the IPC device will not stop pushing the stream. For more information about TSL models, see <a href="https://help.aliyun.com/document_detail/73727.html">What is a TSL model</a>.</li>
     * <li>If no one is watching the stream on the IPC device, you do not need to invoke this operation. IoT Platform automatically triggers the device to stop pushing the stream.</li>
     * <li>During the procedure of triggering a video recording event, invoking this operation causes interruptions to the video file. Use this operation with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of StopLiveStreaming  StopLiveStreamingRequest
     * @return StopLiveStreamingResponse
     */
    CompletableFuture<StopLiveStreamingResponse> stopLiveStreaming(StopLiveStreamingRequest request);

    /**
     * @param request the request parameters of StopTriggeredRecord  StopTriggeredRecordRequest
     * @return StopTriggeredRecordResponse
     */
    CompletableFuture<StopTriggeredRecordResponse> stopTriggeredRecord(StopTriggeredRecordRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation to transfer devices to another instance, contact technical support to evaluate the migration plan and prevent features from becoming unavailable after the migration.
     * <strong>Before you begin</strong></p>
     * <ul>
     * <li>The devices to be transferred have the video service feature enabled.<ul>
     * <li>Devices in the Enterprise instance: Log on to the IoT Platform console and click <strong>Enterprise instance</strong>. In the left-side navigation pane, choose <strong>Video Service</strong> &gt; <strong>Access Service</strong>. On the <strong>Access Service</strong> page, click the <strong>Product Management</strong> tab. Check the product to which the device to be transferred belongs, and make sure that the <strong>Enabled/Disabled Status</strong> column displays <strong>Enabled</strong>.</li>
     * <li>Devices in an Enterprise Edition instance: The video service is enabled.</li>
     * </ul>
     * </li>
     * <li>The device distribution task is complete. For more information, see <a href="https://help.aliyun.com/document_detail/199390.html">CreateDeviceDistributeJob</a> or <a href="https://help.aliyun.com/document_detail/143450.html">Device distribution</a>.</li>
     * <li>Make sure that a picture lifecycle is configured for camera devices. If no picture lifecycle is configured for a camera device, calling this operation automatically sets the picture lifecycle to 180 days. For more information, see <a href="https://help.aliyun.com/document_detail/107880.html">SetDevicePictureLifeCycle</a>.
     * <strong>Background information</strong></li>
     * <li>If the source instance and target instance are of different types, review the Billable methods of the instances before the migration. For more information about Billable methods, see <a href="https://help.aliyun.com/document_detail/124250.html">Billing overview</a>.</li>
     * <li>During the migration, devices go offline. The more devices you migrate, the longer the migration takes. Data generated by the devices during this period cannot be retained.</li>
     * </ul>
     * 
     * @param request the request parameters of TransferDeviceInstance  TransferDeviceInstanceRequest
     * @return TransferDeviceInstanceResponse
     */
    CompletableFuture<TransferDeviceInstanceResponse> transferDeviceInstance(TransferDeviceInstanceRequest request);

    /**
     * @param request the request parameters of TriggerCapturePicture  TriggerCapturePictureRequest
     * @return TriggerCapturePictureResponse
     */
    CompletableFuture<TriggerCapturePictureResponse> triggerCapturePicture(TriggerCapturePictureRequest request);

    /**
     * @param request the request parameters of TriggerRecord  TriggerRecordRequest
     * @return TriggerRecordResponse
     */
    CompletableFuture<TriggerRecordResponse> triggerRecord(TriggerRecordRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>If you invoke this operation on an Enterprise instance, you must specify the <strong>IotInstanceId</strong> request parameter. Otherwise, the call is failed.</p>
     * 
     * @param request the request parameters of UnbindPictureSearchAppWithDevices  UnbindPictureSearchAppWithDevicesRequest
     * @return UnbindPictureSearchAppWithDevicesResponse
     */
    CompletableFuture<UnbindPictureSearchAppWithDevicesResponse> unbindPictureSearchAppWithDevices(UnbindPictureSearchAppWithDevicesRequest request);

    /**
     * @param request the request parameters of UpdateEventRecordPlan  UpdateEventRecordPlanRequest
     * @return UpdateEventRecordPlanResponse
     */
    CompletableFuture<UpdateEventRecordPlanResponse> updateEventRecordPlan(UpdateEventRecordPlanRequest request);

    /**
     * @param request the request parameters of UpdateFaceUser  UpdateFaceUserRequest
     * @return UpdateFaceUserResponse
     */
    CompletableFuture<UpdateFaceUserResponse> updateFaceUser(UpdateFaceUserRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 100.
     *     &gt; Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * 
     * @param request the request parameters of UpdateFaceUserGroupAndDeviceGroupRelation  UpdateFaceUserGroupAndDeviceGroupRelationRequest
     * @return UpdateFaceUserGroupAndDeviceGroupRelationResponse
     */
    CompletableFuture<UpdateFaceUserGroupAndDeviceGroupRelationResponse> updateFaceUserGroupAndDeviceGroupRelation(UpdateFaceUserGroupAndDeviceGroupRelationRequest request);

    /**
     * @param request the request parameters of UpdateGbDevice  UpdateGbDeviceRequest
     * @return UpdateGbDeviceResponse
     */
    CompletableFuture<UpdateGbDeviceResponse> updateGbDevice(UpdateGbDeviceRequest request);

    /**
     * @param request the request parameters of UpdateInstanceInternetProtocol  UpdateInstanceInternetProtocolRequest
     * @return UpdateInstanceInternetProtocolResponse
     */
    CompletableFuture<UpdateInstanceInternetProtocolResponse> updateInstanceInternetProtocol(UpdateInstanceInternetProtocolRequest request);

    /**
     * @param request the request parameters of UpdatePictureSearchApp  UpdatePictureSearchAppRequest
     * @return UpdatePictureSearchAppResponse
     */
    CompletableFuture<UpdatePictureSearchAppResponse> updatePictureSearchApp(UpdatePictureSearchAppRequest request);

    /**
     * @param request the request parameters of UpdateRecordPlan  UpdateRecordPlanRequest
     * @return UpdateRecordPlanResponse
     */
    CompletableFuture<UpdateRecordPlanResponse> updateRecordPlan(UpdateRecordPlanRequest request);

    /**
     * @param request the request parameters of UpdateRtmpKey  UpdateRtmpKeyRequest
     * @return UpdateRtmpKeyResponse
     */
    CompletableFuture<UpdateRtmpKeyResponse> updateRtmpKey(UpdateRtmpKeyRequest request);

    /**
     * @param request the request parameters of UpdateTimeTemplate  UpdateTimeTemplateRequest
     * @return UpdateTimeTemplateResponse
     */
    CompletableFuture<UpdateTimeTemplateResponse> updateTimeTemplate(UpdateTimeTemplateRequest request);

}
