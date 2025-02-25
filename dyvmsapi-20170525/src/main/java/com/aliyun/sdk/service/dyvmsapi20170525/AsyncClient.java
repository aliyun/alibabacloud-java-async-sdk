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
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 200 times per second per account.</p>
     * 
     * @param request the request parameters of AddVirtualNumberRelation  AddVirtualNumberRelationRequest
     * @return AddVirtualNumberRelationResponse
     */
    CompletableFuture<AddVirtualNumberRelationResponse> addVirtualNumberRelation(AddVirtualNumberRelationRequest request);

    /**
     * <b>description</b> :
     * <p>  In an intelligent speech interaction task, you can use the robot communication scripts preset in the Voice Messaging Service console, or invoke the callback function to return the response mode configured by the business party in each call.</p>
     * <ul>
     * <li>The BatchRobotSmartCall operation is used to initiate an outbound robocall task by using the robot communication scripts preset in the Voice Messaging Service console.</li>
     * </ul>
     * <h2>Prerequisites</h2>
     * <ul>
     * <li>You have passed the real-name verification for an enterprise user and passed the enterprise qualification review.</li>
     * <li>You have purchased numbers in the <a href="https://dyvms.console.aliyun.com/dyvms.htm#/number/normal">Voice Messaging Service console</a>.</li>
     * <li>You have added communication scripts on the <a href="https://dyvms.console.aliyun.com/dyvms.htm#/smart-call/saas/robot/list">Communication script management</a> page, and the communication scripts have been approved.<blockquote>
     * <p>Before you call this operation, make sure that you are familiar with the <a href="https://www.aliyun.com/price/product#/vms/detail">billing</a> of Voice Messaging Service (VMS).</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of BatchRobotSmartCall  BatchRobotSmartCallRequest
     * @return BatchRobotSmartCallResponse
     */
    CompletableFuture<BatchRobotSmartCallResponse> batchRobotSmartCall(BatchRobotSmartCallRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of CancelOrderRobotTask  CancelOrderRobotTaskRequest
     * @return CancelOrderRobotTaskResponse
     */
    CompletableFuture<CancelOrderRobotTaskResponse> cancelOrderRobotTask(CancelOrderRobotTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Only a task in progress can be terminated by calling the CancelRobotTask operation, and the task cannot be resumed after it is terminated.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of CancelRobotTask  CancelRobotTaskRequest
     * @return CancelRobotTaskResponse
     */
    CompletableFuture<CancelRobotTaskResponse> cancelRobotTask(CancelRobotTaskRequest request);

    /**
     * @param request the request parameters of ChangeMediaType  ChangeMediaTypeRequest
     * @return ChangeMediaTypeResponse
     */
    CompletableFuture<ChangeMediaTypeResponse> changeMediaType(ChangeMediaTypeRequest request);

    /**
     * <b>description</b> :
     * <p>You can create up to 1,000 voice notifications for each task.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of CreateCallTask  CreateCallTaskRequest
     * @return CreateCallTaskResponse
     */
    CompletableFuture<CreateCallTaskResponse> createCallTask(CreateCallTaskRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to initiate an outbound robocall task by using the robot communication scripts preset in the Voice Messaging Service console. In an intelligent speech interaction task, you can use the robot communication scripts preset in the Voice Messaging Service console, or invoke the callback function to return the response mode configured by the business party in each call.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of CreateRobotTask  CreateRobotTaskRequest
     * @return CreateRobotTaskResponse
     */
    CompletableFuture<CreateRobotTaskResponse> createRobotTask(CreateRobotTaskRequest request);

    /**
     * @param request the request parameters of DegradeVideoFile  DegradeVideoFileRequest
     * @return DegradeVideoFileResponse
     */
    CompletableFuture<DegradeVideoFileResponse> degradeVideoFile(DegradeVideoFileRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete only tasks that are not started, that are completed, and that are terminated.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of DeleteRobotTask  DeleteRobotTaskRequest
     * @return DeleteRobotTaskResponse
     */
    CompletableFuture<DeleteRobotTaskResponse> deleteRobotTask(DeleteRobotTaskRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of ExecuteCallTask  ExecuteCallTaskRequest
     * @return ExecuteCallTaskResponse
     */
    CompletableFuture<ExecuteCallTaskResponse> executeCallTask(ExecuteCallTaskRequest request);

    /**
     * @param request the request parameters of GetCallMediaType  GetCallMediaTypeRequest
     * @return GetCallMediaTypeResponse
     */
    CompletableFuture<GetCallMediaTypeResponse> getCallMediaType(GetCallMediaTypeRequest request);

    /**
     * @param request the request parameters of GetCallProgress  GetCallProgressRequest
     * @return GetCallProgressResponse
     */
    CompletableFuture<GetCallProgressResponse> getCallProgress(GetCallProgressRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of GetHotlineQualificationByOrder  GetHotlineQualificationByOrderRequest
     * @return GetHotlineQualificationByOrderResponse
     */
    CompletableFuture<GetHotlineQualificationByOrderResponse> getHotlineQualificationByOrder(GetHotlineQualificationByOrderRequest request);

    /**
     * @param request the request parameters of GetTemporaryFileUrl  GetTemporaryFileUrlRequest
     * @return GetTemporaryFileUrlResponse
     */
    CompletableFuture<GetTemporaryFileUrlResponse> getTemporaryFileUrl(GetTemporaryFileUrlRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to five times per second per account.</p>
     * 
     * @param request the request parameters of GetToken  GetTokenRequest
     * @return GetTokenResponse
     */
    CompletableFuture<GetTokenResponse> getToken(GetTokenRequest request);

    /**
     * @param request the request parameters of GetVideoFieldUrl  GetVideoFieldUrlRequest
     * @return GetVideoFieldUrlResponse
     */
    CompletableFuture<GetVideoFieldUrlResponse> getVideoFieldUrl(GetVideoFieldUrlRequest request);

    /**
     * <b>description</b> :
     * <p>  Your enterprise qualification is approved. For more information, see <a href="https://help.aliyun.com/document_detail/149795.html">Submit enterprise qualifications</a>.</p>
     * <ul>
     * <li>Voice numbers are purchased. For more information, see <a href="https://help.aliyun.com/document_detail/149794.html">Purchase numbers</a>.</li>
     * <li>When the subscriber answers the call, the subscriber hears a voice that instructs the subscriber to press a key as needed. If the <a href="https://help.aliyun.com/document_detail/112503.html">message receipt</a> feature is enabled, the Voice Messaging Service (VMS) platform returns the information about the key pressed by the subscriber to the business system. The key information includes the order confirmation, questionnaire survey, and satisfaction survey completed by the subscriber.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of IvrCall  IvrCallRequest
     * @return IvrCallResponse
     */
    CompletableFuture<IvrCallResponse> ivrCall(IvrCallRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of ListCallTask  ListCallTaskRequest
     * @return ListCallTaskResponse
     */
    CompletableFuture<ListCallTaskResponse> listCallTask(ListCallTaskRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of ListCallTaskDetail  ListCallTaskDetailRequest
     * @return ListCallTaskDetailResponse
     */
    CompletableFuture<ListCallTaskDetailResponse> listCallTaskDetail(ListCallTaskDetailRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of ListHotlineTransferNumber  ListHotlineTransferNumberRequest
     * @return ListHotlineTransferNumberResponse
     */
    CompletableFuture<ListHotlineTransferNumberResponse> listHotlineTransferNumber(ListHotlineTransferNumberRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of ListHotlineTransferRegisterFile  ListHotlineTransferRegisterFileRequest
     * @return ListHotlineTransferRegisterFileResponse
     */
    CompletableFuture<ListHotlineTransferRegisterFileResponse> listHotlineTransferRegisterFile(ListHotlineTransferRegisterFileRequest request);

    /**
     * @param request the request parameters of PauseVideoFile  PauseVideoFileRequest
     * @return PauseVideoFileResponse
     */
    CompletableFuture<PauseVideoFileResponse> pauseVideoFile(PauseVideoFileRequest request);

    /**
     * @param request the request parameters of PlayVideoFile  PlayVideoFileRequest
     * @return PlayVideoFileResponse
     */
    CompletableFuture<PlayVideoFileResponse> playVideoFile(PlayVideoFileRequest request);

    /**
     * <b>description</b> :
     * <p>QueryCallDetailByCallId is a common query operation. You can call this operation to query the details of a voice notification, voice verification code, interactive voice response (IVR), intelligent inbound voice call, intelligent outbound voice call, or intelligent robocall.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of QueryCallDetailByCallId  QueryCallDetailByCallIdRequest
     * @return QueryCallDetailByCallIdResponse
     */
    CompletableFuture<QueryCallDetailByCallIdResponse> queryCallDetailByCallId(QueryCallDetailByCallIdRequest request);

    /**
     * @param request the request parameters of QueryCallDetailByTaskId  QueryCallDetailByTaskIdRequest
     * @return QueryCallDetailByTaskIdResponse
     */
    CompletableFuture<QueryCallDetailByTaskIdResponse> queryCallDetailByTaskId(QueryCallDetailByTaskIdRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of QueryCallInPoolTransferConfig  QueryCallInPoolTransferConfigRequest
     * @return QueryCallInPoolTransferConfigResponse
     */
    CompletableFuture<QueryCallInPoolTransferConfigResponse> queryCallInPoolTransferConfig(QueryCallInPoolTransferConfigRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of QueryCallInTransferRecord  QueryCallInTransferRecordRequest
     * @return QueryCallInTransferRecordResponse
     */
    CompletableFuture<QueryCallInTransferRecordResponse> queryCallInTransferRecord(QueryCallInTransferRecordRequest request);

    /**
     * @param request the request parameters of QueryRobotInfoList  QueryRobotInfoListRequest
     * @return QueryRobotInfoListResponse
     */
    CompletableFuture<QueryRobotInfoListResponse> queryRobotInfoList(QueryRobotInfoListRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of QueryRobotTaskCallDetail  QueryRobotTaskCallDetailRequest
     * @return QueryRobotTaskCallDetailResponse
     */
    CompletableFuture<QueryRobotTaskCallDetailResponse> queryRobotTaskCallDetail(QueryRobotTaskCallDetailRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of QueryRobotTaskCallList  QueryRobotTaskCallListRequest
     * @return QueryRobotTaskCallListResponse
     */
    CompletableFuture<QueryRobotTaskCallListResponse> queryRobotTaskCallList(QueryRobotTaskCallListRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of QueryRobotTaskDetail  QueryRobotTaskDetailRequest
     * @return QueryRobotTaskDetailResponse
     */
    CompletableFuture<QueryRobotTaskDetailResponse> queryRobotTaskDetail(QueryRobotTaskDetailRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of QueryRobotTaskList  QueryRobotTaskListRequest
     * @return QueryRobotTaskListResponse
     */
    CompletableFuture<QueryRobotTaskListResponse> queryRobotTaskList(QueryRobotTaskListRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of QueryRobotv2AllList  QueryRobotv2AllListRequest
     * @return QueryRobotv2AllListResponse
     */
    CompletableFuture<QueryRobotv2AllListResponse> queryRobotv2AllList(QueryRobotv2AllListRequest request);

    /**
     * @param request the request parameters of QueryVideoPlayProgress  QueryVideoPlayProgressRequest
     * @return QueryVideoPlayProgressResponse
     */
    CompletableFuture<QueryVideoPlayProgressResponse> queryVideoPlayProgress(QueryVideoPlayProgressRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of QueryVirtualNumber  QueryVirtualNumberRequest
     * @return QueryVirtualNumberResponse
     */
    CompletableFuture<QueryVirtualNumberResponse> queryVirtualNumber(QueryVirtualNumberRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 200 times per second per account.</p>
     * 
     * @param request the request parameters of QueryVirtualNumberRelation  QueryVirtualNumberRelationRequest
     * @return QueryVirtualNumberRelationResponse
     */
    CompletableFuture<QueryVirtualNumberRelationResponse> queryVirtualNumberRelation(QueryVirtualNumberRelationRequest request);

    /**
     * @param request the request parameters of QueryVoiceFileAuditInfo  QueryVoiceFileAuditInfoRequest
     * @return QueryVoiceFileAuditInfoResponse
     */
    CompletableFuture<QueryVoiceFileAuditInfoResponse> queryVoiceFileAuditInfo(QueryVoiceFileAuditInfoRequest request);

    /**
     * @param request the request parameters of RecoverCallInConfig  RecoverCallInConfigRequest
     * @return RecoverCallInConfigResponse
     */
    CompletableFuture<RecoverCallInConfigResponse> recoverCallInConfig(RecoverCallInConfigRequest request);

    /**
     * @param request the request parameters of ResumeVideoFile  ResumeVideoFileRequest
     * @return ResumeVideoFileResponse
     */
    CompletableFuture<ResumeVideoFileResponse> resumeVideoFile(ResumeVideoFileRequest request);

    /**
     * @param request the request parameters of SeekVideoFile  SeekVideoFileRequest
     * @return SeekVideoFileResponse
     */
    CompletableFuture<SeekVideoFileResponse> seekVideoFile(SeekVideoFileRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of SendVerification  SendVerificationRequest
     * @return SendVerificationResponse
     */
    CompletableFuture<SendVerificationResponse> sendVerification(SendVerificationRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of SetTransferCalleePoolConfig  SetTransferCalleePoolConfigRequest
     * @return SetTransferCalleePoolConfigResponse
     */
    CompletableFuture<SetTransferCalleePoolConfigResponse> setTransferCalleePoolConfig(SetTransferCalleePoolConfigRequest request);

    /**
     * <b>description</b> :
     * <p>  Due to business adjustments, the updates of the voice notification and voice verification code services have been stopped in regions outside the Chinese mainland and the services have been discontinued since March 2022. Only qualified customers can continue using the voice notification and voice verification code services.</p>
     * <ul>
     * <li>For more information about voice plans or voice service billing, see <a href="https://help.aliyun.com/document_detail/150083.html">Pricing of VMS on China site (aliyun.com)</a>.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 1,000 times per second per account.</p>
     * 
     * @param request the request parameters of SingleCallByTts  SingleCallByTtsRequest
     * @return SingleCallByTtsResponse
     */
    CompletableFuture<SingleCallByTtsResponse> singleCallByTts(SingleCallByTtsRequest request);

    /**
     * @param request the request parameters of SingleCallByVideo  SingleCallByVideoRequest
     * @return SingleCallByVideoResponse
     */
    CompletableFuture<SingleCallByVideoResponse> singleCallByVideo(SingleCallByVideoRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Due to business adjustments, the updates of the voice notification and voice verification code services have been stopped in regions outside the Chinese mainland and the services have been discontinued since March 2022. Only qualified customers can continue using the voice notification and voice verification code services.
     * You can call the <a href="https://help.aliyun.com/document_detail/393519.html">SingleCallByTts</a> operation to send voice notifications with variables.</p>
     * </blockquote>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 1,200 times per second per account.</p>
     * 
     * @param request the request parameters of SingleCallByVoice  SingleCallByVoiceRequest
     * @return SingleCallByVoiceResponse
     */
    CompletableFuture<SingleCallByVoiceResponse> singleCallByVoice(SingleCallByVoiceRequest request);

    /**
     * @param request the request parameters of SkipVideoFile  SkipVideoFileRequest
     * @return SkipVideoFileResponse
     */
    CompletableFuture<SkipVideoFileResponse> skipVideoFile(SkipVideoFileRequest request);

    /**
     * <b>description</b> :
     * <p>  The SmartCall operation must be used together with the <a href="https://help.aliyun.com/document_detail/112703.html">intelligent outbound HTTP operation</a>. After the call initiated by the Voice Messaging Service (VMS) platform is connected, the VMS platform sends the text converted from speech back to the business side, and the business side then returns the follow-up action to the VMS platform.</p>
     * <ul>
     * <li>The SmartCall operation does not support the following characters: <code>@ = : &quot;&quot; $ { } ^ * ￥</code>.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 1,000 times per second per account.</p>
     * 
     * @param request the request parameters of SmartCall  SmartCallRequest
     * @return SmartCallResponse
     */
    CompletableFuture<SmartCallResponse> smartCall(SmartCallRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to initiate a specified action on the called number of an outbound robocall when the call is transferred to an agent of the call center.</p>
     * <blockquote>
     * <p>You can only initiate the action of bridging a called number and an agent of the call center.</p>
     * </blockquote>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of SmartCallOperate  SmartCallOperateRequest
     * @return SmartCallOperateResponse
     */
    CompletableFuture<SmartCallOperateResponse> smartCallOperate(SmartCallOperateRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of StartRobotTask  StartRobotTaskRequest
     * @return StartRobotTaskResponse
     */
    CompletableFuture<StartRobotTaskResponse> startRobotTask(StartRobotTaskRequest request);

    /**
     * @param request the request parameters of StopCallInConfig  StopCallInConfigRequest
     * @return StopCallInConfigResponse
     */
    CompletableFuture<StopCallInConfigResponse> stopCallInConfig(StopCallInConfigRequest request);

    /**
     * <b>description</b> :
     * <p>After you stop a robocall task, you can call the <a href="~~StartRobotTask~~">StartRobotTask</a> operation to start it again.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of StopRobotTask  StopRobotTaskRequest
     * @return StopRobotTaskResponse
     */
    CompletableFuture<StopRobotTaskResponse> stopRobotTask(StopRobotTaskRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of SubmitHotlineTransferRegister  SubmitHotlineTransferRegisterRequest
     * @return SubmitHotlineTransferRegisterResponse
     */
    CompletableFuture<SubmitHotlineTransferRegisterResponse> submitHotlineTransferRegister(SubmitHotlineTransferRegisterRequest request);

    /**
     * @param request the request parameters of UpgradeVideoFile  UpgradeVideoFileRequest
     * @return UpgradeVideoFileResponse
     */
    CompletableFuture<UpgradeVideoFileResponse> upgradeVideoFile(UpgradeVideoFileRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of UploadRobotTaskCalledFile  UploadRobotTaskCalledFileRequest
     * @return UploadRobotTaskCalledFileResponse
     */
    CompletableFuture<UploadRobotTaskCalledFileResponse> uploadRobotTaskCalledFile(UploadRobotTaskCalledFileRequest request);

}
