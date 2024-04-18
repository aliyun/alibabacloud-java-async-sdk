// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dyvmsapi20170525.models.*;
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
      * ### QPS limits
      * You can call this operation up to 200 times per second per account.
      *
     */
    CompletableFuture<AddVirtualNumberRelationResponse> addVirtualNumberRelation(AddVirtualNumberRelationRequest request);

    /**
      * *   In an intelligent speech interaction task, you can use the robot communication scripts preset in the Voice Messaging Service console, or invoke the callback function to return the response mode configured by the business party in each call.
      * *   The BatchRobotSmartCall operation is used to initiate an outbound robocall task by using the robot communication scripts preset in the Voice Messaging Service console.
      * ## Prerequisites
      * *   You have passed the real-name verification for an enterprise user and passed the enterprise qualification review.
      * *   You have purchased numbers in the [Voice Messaging Service console](https://dyvms.console.aliyun.com/dyvms.htm#/number/normal).
      * *   You have added communication scripts on the [Communication script management](https://dyvms.console.aliyun.com/dyvms.htm#/smart-call/saas/robot/list) page, and the communication scripts have been approved.
      * > Before you call this operation, make sure that you are familiar with the [billing](https://www.aliyun.com/price/product#/vms/detail) of Voice Messaging Service (VMS).
      *
     */
    CompletableFuture<BatchRobotSmartCallResponse> batchRobotSmartCall(BatchRobotSmartCallRequest request);

    /**
      * ### QPS limits
      * You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<CancelOrderRobotTaskResponse> cancelOrderRobotTask(CancelOrderRobotTaskRequest request);

    /**
      * Only a task in progress can be terminated by calling the CancelRobotTask operation, and the task cannot be resumed after it is terminated.
      * ### QPS limits
      * You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<CancelRobotTaskResponse> cancelRobotTask(CancelRobotTaskRequest request);

    CompletableFuture<ChangeMediaTypeResponse> changeMediaType(ChangeMediaTypeRequest request);

    /**
      * You can create up to 1,000 voice notifications for each task.
      * ### QPS limits
      * You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<CreateCallTaskResponse> createCallTask(CreateCallTaskRequest request);

    /**
      * You can call this operation to initiate an outbound robocall task by using the robot communication scripts preset in the Voice Messaging Service console. In an intelligent speech interaction task, you can use the robot communication scripts preset in the Voice Messaging Service console, or invoke the callback function to return the response mode configured by the business party in each call.
      * ### QPS limits
      * You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<CreateRobotTaskResponse> createRobotTask(CreateRobotTaskRequest request);

    CompletableFuture<DegradeVideoFileResponse> degradeVideoFile(DegradeVideoFileRequest request);

    /**
      * You can call this operation to delete only tasks that are not started, that are completed, and that are terminated.
      * ### QPS limits
      * You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DeleteRobotTaskResponse> deleteRobotTask(DeleteRobotTaskRequest request);

    /**
      * ### QPS limits
      * You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<ExecuteCallTaskResponse> executeCallTask(ExecuteCallTaskRequest request);

    CompletableFuture<GetCallProgressResponse> getCallProgress(GetCallProgressRequest request);

    /**
      * ### QPS limits
      * You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<GetHotlineQualificationByOrderResponse> getHotlineQualificationByOrder(GetHotlineQualificationByOrderRequest request);

    /**
      * ### QPS limits
      * You can call this operation up to five times per second per account.
      *
     */
    CompletableFuture<GetTokenResponse> getToken(GetTokenRequest request);

    CompletableFuture<GetVideoFieldUrlResponse> getVideoFieldUrl(GetVideoFieldUrlRequest request);

    /**
      * *   Your enterprise qualification is approved. For more information, see [Submit enterprise qualifications](~~149795~~).
      * *   Voice numbers are purchased. For more information, see [Purchase numbers](~~149794~~).
      * *   When the subscriber answers the call, the subscriber hears a voice that instructs the subscriber to press a key as needed. If the [message receipt](~~112503~~) feature is enabled, the Voice Messaging Service (VMS) platform returns the information about the key pressed by the subscriber to the business system. The key information includes the order confirmation, questionnaire survey, and satisfaction survey completed by the subscriber.
      * ## QPS limits
      * You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<IvrCallResponse> ivrCall(IvrCallRequest request);

    /**
      * ### QPS limits
      * You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<ListCallTaskResponse> listCallTask(ListCallTaskRequest request);

    /**
      * ### QPS limits
      * You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<ListCallTaskDetailResponse> listCallTaskDetail(ListCallTaskDetailRequest request);

    /**
      * ### QPS limits
      * You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<ListHotlineTransferNumberResponse> listHotlineTransferNumber(ListHotlineTransferNumberRequest request);

    /**
      * ### QPS limits
      * You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<ListHotlineTransferRegisterFileResponse> listHotlineTransferRegisterFile(ListHotlineTransferRegisterFileRequest request);

    CompletableFuture<PauseVideoFileResponse> pauseVideoFile(PauseVideoFileRequest request);

    CompletableFuture<PlayVideoFileResponse> playVideoFile(PlayVideoFileRequest request);

    /**
      * QueryCallDetailByCallId is a common query operation. You can call this operation to query the details of a voice notification, voice verification code, interactive voice response (IVR), intelligent inbound voice call, intelligent outbound voice call, or intelligent robocall.
      * ### QPS limits
      * You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<QueryCallDetailByCallIdResponse> queryCallDetailByCallId(QueryCallDetailByCallIdRequest request);

    CompletableFuture<QueryCallDetailByTaskIdResponse> queryCallDetailByTaskId(QueryCallDetailByTaskIdRequest request);

    /**
      * ### QPS limits
      * You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<QueryCallInPoolTransferConfigResponse> queryCallInPoolTransferConfig(QueryCallInPoolTransferConfigRequest request);

    /**
      * ### QPS limits
      * You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<QueryCallInTransferRecordResponse> queryCallInTransferRecord(QueryCallInTransferRecordRequest request);

    CompletableFuture<QueryRobotInfoListResponse> queryRobotInfoList(QueryRobotInfoListRequest request);

    /**
      * ### QPS limits
      * You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<QueryRobotTaskCallDetailResponse> queryRobotTaskCallDetail(QueryRobotTaskCallDetailRequest request);

    /**
      * ### QPS limits
      * You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<QueryRobotTaskCallListResponse> queryRobotTaskCallList(QueryRobotTaskCallListRequest request);

    /**
      * ### QPS limits
      * You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<QueryRobotTaskDetailResponse> queryRobotTaskDetail(QueryRobotTaskDetailRequest request);

    /**
      * ### QPS limits
      * You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<QueryRobotTaskListResponse> queryRobotTaskList(QueryRobotTaskListRequest request);

    /**
      * ### QPS limits
      * You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<QueryRobotv2AllListResponse> queryRobotv2AllList(QueryRobotv2AllListRequest request);

    CompletableFuture<QueryVideoPlayProgressResponse> queryVideoPlayProgress(QueryVideoPlayProgressRequest request);

    /**
      * ### QPS limits
      * You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<QueryVirtualNumberResponse> queryVirtualNumber(QueryVirtualNumberRequest request);

    /**
      * ### QPS limits
      * You can call this operation up to 200 times per second per account.
      *
     */
    CompletableFuture<QueryVirtualNumberRelationResponse> queryVirtualNumberRelation(QueryVirtualNumberRelationRequest request);

    CompletableFuture<QueryVoiceFileAuditInfoResponse> queryVoiceFileAuditInfo(QueryVoiceFileAuditInfoRequest request);

    CompletableFuture<RecoverCallInConfigResponse> recoverCallInConfig(RecoverCallInConfigRequest request);

    CompletableFuture<ResumeVideoFileResponse> resumeVideoFile(ResumeVideoFileRequest request);

    CompletableFuture<SeekVideoFileResponse> seekVideoFile(SeekVideoFileRequest request);

    /**
      * ### QPS limits
      * You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<SendVerificationResponse> sendVerification(SendVerificationRequest request);

    /**
      * ### QPS limits
      * You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<SetTransferCalleePoolConfigResponse> setTransferCalleePoolConfig(SetTransferCalleePoolConfigRequest request);

    /**
      * *   Due to business adjustments, the updates of the voice notification and voice verification code services have been stopped in regions outside the Chinese mainland and the services have been discontinued since March 2022. Only qualified customers can continue using the voice notification and voice verification code services.
      * *   For more information about voice plans or voice service billing, see [Pricing of VMS on China site (aliyun.com)](~~150083~~).
      * ### QPS limits
      * You can call this operation up to 1,000 times per second per account.
      *
     */
    CompletableFuture<SingleCallByTtsResponse> singleCallByTts(SingleCallByTtsRequest request);

    CompletableFuture<SingleCallByVideoResponse> singleCallByVideo(SingleCallByVideoRequest request);

    /**
      * > Due to business adjustments, the updates of the voice notification and voice verification code services have been stopped in regions outside the Chinese mainland and the services have been discontinued since March 2022. Only qualified customers can continue using the voice notification and voice verification code services.
      * You can call the [SingleCallByTts](~~393519~~) operation to send voice notifications with variables.
      * ### QPS limits
      * You can call this operation up to 1,200 times per second per account.
      *
     */
    CompletableFuture<SingleCallByVoiceResponse> singleCallByVoice(SingleCallByVoiceRequest request);

    CompletableFuture<SkipVideoFileResponse> skipVideoFile(SkipVideoFileRequest request);

    /**
      * *   The SmartCall operation must be used together with the [intelligent outbound HTTP operation](~~112703~~). After the call initiated by the Voice Messaging Service (VMS) platform is connected, the VMS platform sends the text converted from speech back to the business side, and the business side then returns the follow-up action to the VMS platform.
      * *   The SmartCall operation does not support the following characters: `@ = : "" $ { } ^ * ￥`.
      * ### QPS limits
      * You can call this operation up to 1,000 times per second per account.
      *
     */
    CompletableFuture<SmartCallResponse> smartCall(SmartCallRequest request);

    /**
      * You can call this operation to initiate a specified action on the called number of an outbound robocall when the call is transferred to an agent of the call center.
      * > You can only initiate the action of bridging a called number and an agent of the call center.
      * ### QPS limits
      * You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<SmartCallOperateResponse> smartCallOperate(SmartCallOperateRequest request);

    /**
      * ### QPS limits
      * You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<StartRobotTaskResponse> startRobotTask(StartRobotTaskRequest request);

    CompletableFuture<StopCallInConfigResponse> stopCallInConfig(StopCallInConfigRequest request);

    /**
      * After you stop a robocall task, you can call the [StartRobotTask](~~StartRobotTask~~) operation to start it again.
      * ### QPS limits
      * You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<StopRobotTaskResponse> stopRobotTask(StopRobotTaskRequest request);

    /**
      * ### QPS limits
      * You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<SubmitHotlineTransferRegisterResponse> submitHotlineTransferRegister(SubmitHotlineTransferRegisterRequest request);

    CompletableFuture<UpgradeVideoFileResponse> upgradeVideoFile(UpgradeVideoFileRequest request);

    /**
      * ### QPS limits
      * You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<UploadRobotTaskCalledFileResponse> uploadRobotTaskCalledFile(UploadRobotTaskCalledFileRequest request);

}
