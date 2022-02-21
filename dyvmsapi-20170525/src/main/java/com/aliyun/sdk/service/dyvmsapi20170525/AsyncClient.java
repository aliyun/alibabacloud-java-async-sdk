// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dyvmsapi20170525.models.*;
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

    CompletableFuture<AddRtcAccountResponse> addRtcAccount(AddRtcAccountRequest request);

    CompletableFuture<AddVirtualNumberRelationResponse> addVirtualNumberRelation(AddVirtualNumberRelationRequest request);

    CompletableFuture<BatchRobotSmartCallResponse> batchRobotSmartCall(BatchRobotSmartCallRequest request);

    CompletableFuture<CancelCallResponse> cancelCall(CancelCallRequest request);

    CompletableFuture<CancelOrderRobotTaskResponse> cancelOrderRobotTask(CancelOrderRobotTaskRequest request);

    CompletableFuture<CancelRobotTaskResponse> cancelRobotTask(CancelRobotTaskRequest request);

    CompletableFuture<ClickToDialResponse> clickToDial(ClickToDialRequest request);

    CompletableFuture<CreateCallTaskResponse> createCallTask(CreateCallTaskRequest request);

    CompletableFuture<CreateRobotTaskResponse> createRobotTask(CreateRobotTaskRequest request);

    CompletableFuture<DeleteRobotTaskResponse> deleteRobotTask(DeleteRobotTaskRequest request);

    CompletableFuture<ExecuteCallTaskResponse> executeCallTask(ExecuteCallTaskRequest request);

    CompletableFuture<GetCallInfoResponse> getCallInfo(GetCallInfoRequest request);

    CompletableFuture<GetHotlineQualificationByOrderResponse> getHotlineQualificationByOrder(GetHotlineQualificationByOrderRequest request);

    CompletableFuture<GetMqttTokenResponse> getMqttToken(GetMqttTokenRequest request);

    CompletableFuture<GetRtcTokenResponse> getRtcToken(GetRtcTokenRequest request);

    CompletableFuture<GetTokenResponse> getToken(GetTokenRequest request);

    CompletableFuture<IvrCallResponse> ivrCall(IvrCallRequest request);

    CompletableFuture<ListCallTaskResponse> listCallTask(ListCallTaskRequest request);

    CompletableFuture<ListCallTaskDetailResponse> listCallTaskDetail(ListCallTaskDetailRequest request);

    CompletableFuture<ListHotlineTransferNumberResponse> listHotlineTransferNumber(ListHotlineTransferNumberRequest request);

    CompletableFuture<ListHotlineTransferRegisterFileResponse> listHotlineTransferRegisterFile(ListHotlineTransferRegisterFileRequest request);

    CompletableFuture<QueryCallDetailByCallIdResponse> queryCallDetailByCallId(QueryCallDetailByCallIdRequest request);

    CompletableFuture<QueryCallDetailByTaskIdResponse> queryCallDetailByTaskId(QueryCallDetailByTaskIdRequest request);

    CompletableFuture<QueryCallInPoolTransferConfigResponse> queryCallInPoolTransferConfig(QueryCallInPoolTransferConfigRequest request);

    CompletableFuture<QueryCallInTransferRecordResponse> queryCallInTransferRecord(QueryCallInTransferRecordRequest request);

    CompletableFuture<QueryRobotInfoListResponse> queryRobotInfoList(QueryRobotInfoListRequest request);

    CompletableFuture<QueryRobotTaskCallDetailResponse> queryRobotTaskCallDetail(QueryRobotTaskCallDetailRequest request);

    CompletableFuture<QueryRobotTaskCallListResponse> queryRobotTaskCallList(QueryRobotTaskCallListRequest request);

    CompletableFuture<QueryRobotTaskDetailResponse> queryRobotTaskDetail(QueryRobotTaskDetailRequest request);

    CompletableFuture<QueryRobotTaskListResponse> queryRobotTaskList(QueryRobotTaskListRequest request);

    CompletableFuture<QueryRobotv2AllListResponse> queryRobotv2AllList(QueryRobotv2AllListRequest request);

    CompletableFuture<QueryVirtualNumberResponse> queryVirtualNumber(QueryVirtualNumberRequest request);

    CompletableFuture<QueryVirtualNumberRelationResponse> queryVirtualNumberRelation(QueryVirtualNumberRelationRequest request);

    CompletableFuture<QueryVoiceFileAuditInfoResponse> queryVoiceFileAuditInfo(QueryVoiceFileAuditInfoRequest request);

    CompletableFuture<RefreshMqttTokenResponse> refreshMqttToken(RefreshMqttTokenRequest request);

    CompletableFuture<SendVerificationResponse> sendVerification(SendVerificationRequest request);

    CompletableFuture<SetTransferCalleePoolConfigResponse> setTransferCalleePoolConfig(SetTransferCalleePoolConfigRequest request);

    CompletableFuture<SingleCallByTtsResponse> singleCallByTts(SingleCallByTtsRequest request);

    CompletableFuture<SingleCallByVoiceResponse> singleCallByVoice(SingleCallByVoiceRequest request);

    CompletableFuture<SmartCallResponse> smartCall(SmartCallRequest request);

    CompletableFuture<SmartCallOperateResponse> smartCallOperate(SmartCallOperateRequest request);

    CompletableFuture<StartRobotTaskResponse> startRobotTask(StartRobotTaskRequest request);

    CompletableFuture<StopRobotTaskResponse> stopRobotTask(StopRobotTaskRequest request);

    CompletableFuture<SubmitHotlineTransferRegisterResponse> submitHotlineTransferRegister(SubmitHotlineTransferRegisterRequest request);

    CompletableFuture<UploadRobotTaskCalledFileResponse> uploadRobotTaskCalledFile(UploadRobotTaskCalledFileRequest request);

}
