// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.aiccs20191015.models.*;
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

    CompletableFuture<AddHotlineNumberResponse> addHotlineNumber(AddHotlineNumberRequest request);

    CompletableFuture<AddOuterAccountResponse> addOuterAccount(AddOuterAccountRequest request);

    CompletableFuture<AddSkillGroupResponse> addSkillGroup(AddSkillGroupRequest request);

    CompletableFuture<AiccsEchoResponse> aiccsEcho(AiccsEchoRequest request);

    CompletableFuture<AiccsSmartCallResponse> aiccsSmartCall(AiccsSmartCallRequest request);

    CompletableFuture<AiccsSmartCallOperateResponse> aiccsSmartCallOperate(AiccsSmartCallOperateRequest request);

    CompletableFuture<AnswerCallResponse> answerCall(AnswerCallRequest request);

    CompletableFuture<AttachTaskResponse> attachTask(AttachTaskRequest request);

    CompletableFuture<BatchCreateQualityProjectsResponse> batchCreateQualityProjects(BatchCreateQualityProjectsRequest request);

    CompletableFuture<CancelTaskResponse> cancelTask(CancelTaskRequest request);

    CompletableFuture<ChangeChatAgentStatusResponse> changeChatAgentStatus(ChangeChatAgentStatusRequest request);

    CompletableFuture<ChangeQualityProjectStatusResponse> changeQualityProjectStatus(ChangeQualityProjectStatusRequest request);

    CompletableFuture<CreateAccountGroupResponse> createAccountGroup(CreateAccountGroupRequest request);

    CompletableFuture<CreateAgentResponse> createAgent(CreateAgentRequest request);

    CompletableFuture<CreateAiOutboundTaskResponse> createAiOutboundTask(CreateAiOutboundTaskRequest request);

    CompletableFuture<CreateAiOutboundTaskBatchResponse> createAiOutboundTaskBatch(CreateAiOutboundTaskBatchRequest request);

    CompletableFuture<CreateDepartmentResponse> createDepartment(CreateDepartmentRequest request);

    CompletableFuture<CreateNameListResponse> createNameList(CreateNameListRequest request);

    CompletableFuture<CreateOutboundTaskResponse> createOutboundTask(CreateOutboundTaskRequest request);

    CompletableFuture<CreateQualityProjectResponse> createQualityProject(CreateQualityProjectRequest request);

    CompletableFuture<CreateQualityRuleResponse> createQualityRule(CreateQualityRuleRequest request);

    CompletableFuture<CreateSkillGroupResponse> createSkillGroup(CreateSkillGroupRequest request);

    CompletableFuture<CreateTaskResponse> createTask(CreateTaskRequest request);

    CompletableFuture<CreateThirdSsoAgentResponse> createThirdSsoAgent(CreateThirdSsoAgentRequest request);

    CompletableFuture<DeleteAccountGroupResponse> deleteAccountGroup(DeleteAccountGroupRequest request);

    CompletableFuture<DeleteAgentResponse> deleteAgent(DeleteAgentRequest request);

    CompletableFuture<DeleteAiOutboundTaskResponse> deleteAiOutboundTask(DeleteAiOutboundTaskRequest request);

    CompletableFuture<DeleteDepartmentResponse> deleteDepartment(DeleteDepartmentRequest request);

    CompletableFuture<DeleteHotlineNumberResponse> deleteHotlineNumber(DeleteHotlineNumberRequest request);

    CompletableFuture<DeleteOutboundTaskResponse> deleteOutboundTask(DeleteOutboundTaskRequest request);

    CompletableFuture<DeleteOuterAccountResponse> deleteOuterAccount(DeleteOuterAccountRequest request);

    CompletableFuture<DeleteQualityProjectResponse> deleteQualityProject(DeleteQualityProjectRequest request);

    CompletableFuture<DeleteQualityRuleResponse> deleteQualityRule(DeleteQualityRuleRequest request);

    CompletableFuture<DeleteSkillGroupResponse> deleteSkillGroup(DeleteSkillGroupRequest request);

    CompletableFuture<DeleteTaskAiOutboundTaskResponse> deleteTaskAiOutboundTask(DeleteTaskAiOutboundTaskRequest request);

    CompletableFuture<DescribeRecordDataResponse> describeRecordData(DescribeRecordDataRequest request);

    CompletableFuture<EditQualityProjectResponse> editQualityProject(EditQualityProjectRequest request);

    CompletableFuture<EditQualityRuleResponse> editQualityRule(EditQualityRuleRequest request);

    CompletableFuture<EditQualityRuleTagResponse> editQualityRuleTag(EditQualityRuleTagRequest request);

    CompletableFuture<EncryptPhoneNumResponse> encryptPhoneNum(EncryptPhoneNumRequest request);

    CompletableFuture<FetchCallResponse> fetchCall(FetchCallRequest request);

    CompletableFuture<FinishHotlineServiceResponse> finishHotlineService(FinishHotlineServiceRequest request);

    CompletableFuture<GenerateWebSocketSignResponse> generateWebSocketSign(GenerateWebSocketSignRequest request);

    CompletableFuture<GetAgentResponse> getAgent(GetAgentRequest request);

    CompletableFuture<GetAgentBasisStatusResponse> getAgentBasisStatus(GetAgentBasisStatusRequest request);

    CompletableFuture<GetAgentByIdResponse> getAgentById(GetAgentByIdRequest request);

    CompletableFuture<GetAgentDetailReportResponse> getAgentDetailReport(GetAgentDetailReportRequest request);

    CompletableFuture<GetAgentIndexRealTimeResponse> getAgentIndexRealTime(GetAgentIndexRealTimeRequest request);

    CompletableFuture<GetAgentServiceStatusResponse> getAgentServiceStatus(GetAgentServiceStatusRequest request);

    CompletableFuture<GetAgentStatisticsResponse> getAgentStatistics(GetAgentStatisticsRequest request);

    CompletableFuture<GetAgentStatusResponse> getAgentStatus(GetAgentStatusRequest request);

    CompletableFuture<GetAiOutboundTaskBizDataResponse> getAiOutboundTaskBizData(GetAiOutboundTaskBizDataRequest request);

    CompletableFuture<GetAiOutboundTaskDetailResponse> getAiOutboundTaskDetail(GetAiOutboundTaskDetailRequest request);

    CompletableFuture<GetAiOutboundTaskExecDetailResponse> getAiOutboundTaskExecDetail(GetAiOutboundTaskExecDetailRequest request);

    CompletableFuture<GetAiOutboundTaskListResponse> getAiOutboundTaskList(GetAiOutboundTaskListRequest request);

    CompletableFuture<GetAiOutboundTaskProgressResponse> getAiOutboundTaskProgress(GetAiOutboundTaskProgressRequest request);

    CompletableFuture<GetAllDepartmentResponse> getAllDepartment(GetAllDepartmentRequest request);

    CompletableFuture<GetCallSoundRecordResponse> getCallSoundRecord(GetCallSoundRecordRequest request);

    CompletableFuture<GetConfigNumListResponse> getConfigNumList(GetConfigNumListRequest request);

    CompletableFuture<GetCustomerInfoResponse> getCustomerInfo(GetCustomerInfoRequest request);

    CompletableFuture<GetDepGroupTreeDataResponse> getDepGroupTreeData(GetDepGroupTreeDataRequest request);

    CompletableFuture<GetDepartmentalLatitudeAgentStatusResponse> getDepartmentalLatitudeAgentStatus(GetDepartmentalLatitudeAgentStatusRequest request);

    CompletableFuture<GetHotlineAgentDetailResponse> getHotlineAgentDetail(GetHotlineAgentDetailRequest request);

    CompletableFuture<GetHotlineAgentDetailReportResponse> getHotlineAgentDetailReport(GetHotlineAgentDetailReportRequest request);

    CompletableFuture<GetHotlineAgentStatusResponse> getHotlineAgentStatus(GetHotlineAgentStatusRequest request);

    CompletableFuture<GetHotlineCallActionResponse> getHotlineCallAction(GetHotlineCallActionRequest request);

    CompletableFuture<GetHotlineGroupDetailReportResponse> getHotlineGroupDetailReport(GetHotlineGroupDetailReportRequest request);

    CompletableFuture<GetHotlineMessageLogResponse> getHotlineMessageLog(GetHotlineMessageLogRequest request);

    CompletableFuture<GetHotlineRuntimeInfoResponse> getHotlineRuntimeInfo(GetHotlineRuntimeInfoRequest request);

    CompletableFuture<GetHotlineServiceStatisticsResponse> getHotlineServiceStatistics(GetHotlineServiceStatisticsRequest request);

    CompletableFuture<GetHotlineWaitingNumberResponse> getHotlineWaitingNumber(GetHotlineWaitingNumberRequest request);

    CompletableFuture<GetIndexCurrentValueResponse> getIndexCurrentValue(GetIndexCurrentValueRequest request);

    CompletableFuture<GetInstanceListResponse> getInstanceList(GetInstanceListRequest request);

    CompletableFuture<GetListDepartmentResponse> getListDepartment(GetListDepartmentRequest request);

    CompletableFuture<GetMcuLvsIpResponse> getMcuLvsIp(GetMcuLvsIpRequest request);

    CompletableFuture<GetNumLocationResponse> getNumLocation(GetNumLocationRequest request);

    CompletableFuture<GetOnlineSeatInformationResponse> getOnlineSeatInformation(GetOnlineSeatInformationRequest request);

    CompletableFuture<GetOnlineServiceVolumeResponse> getOnlineServiceVolume(GetOnlineServiceVolumeRequest request);

    CompletableFuture<GetOutbounNumListResponse> getOutbounNumList(GetOutbounNumListRequest request);

    CompletableFuture<GetQualityProjectDetailResponse> getQualityProjectDetail(GetQualityProjectDetailRequest request);

    CompletableFuture<GetQualityProjectListResponse> getQualityProjectList(GetQualityProjectListRequest request);

    CompletableFuture<GetQualityProjectLogResponse> getQualityProjectLog(GetQualityProjectLogRequest request);

    CompletableFuture<GetQualityResultResponse> getQualityResult(GetQualityResultRequest request);

    CompletableFuture<GetQualityRuleDetailResponse> getQualityRuleDetail(GetQualityRuleDetailRequest request);

    CompletableFuture<GetQualityRuleListResponse> getQualityRuleList(GetQualityRuleListRequest request);

    CompletableFuture<GetQualityRuleTagListResponse> getQualityRuleTagList(GetQualityRuleTagListRequest request);

    CompletableFuture<GetQueueInformationResponse> getQueueInformation(GetQueueInformationRequest request);

    CompletableFuture<GetRecordDataResponse> getRecordData(GetRecordDataRequest request);

    CompletableFuture<GetRecordUrlResponse> getRecordUrl(GetRecordUrlRequest request);

    CompletableFuture<GetRtcTokenResponse> getRtcToken(GetRtcTokenRequest request);

    CompletableFuture<GetSeatInformationResponse> getSeatInformation(GetSeatInformationRequest request);

    CompletableFuture<GetSkillGroupAgentStatusDetailsResponse> getSkillGroupAgentStatusDetails(GetSkillGroupAgentStatusDetailsRequest request);

    CompletableFuture<GetSkillGroupAndAgentStatusSummaryResponse> getSkillGroupAndAgentStatusSummary(GetSkillGroupAndAgentStatusSummaryRequest request);

    CompletableFuture<GetSkillGroupLatitudeStateResponse> getSkillGroupLatitudeState(GetSkillGroupLatitudeStateRequest request);

    CompletableFuture<GetSkillGroupServiceCapabilityResponse> getSkillGroupServiceCapability(GetSkillGroupServiceCapabilityRequest request);

    CompletableFuture<GetSkillGroupServiceStatusResponse> getSkillGroupServiceStatus(GetSkillGroupServiceStatusRequest request);

    CompletableFuture<GetSkillGroupStatusTotalResponse> getSkillGroupStatusTotal(GetSkillGroupStatusTotalRequest request);

    CompletableFuture<HangUpDoubleCallResponse> hangUpDoubleCall(HangUpDoubleCallRequest request);

    CompletableFuture<HangupCallResponse> hangupCall(HangupCallRequest request);

    CompletableFuture<HangupThirdCallResponse> hangupThirdCall(HangupThirdCallRequest request);

    CompletableFuture<HoldCallResponse> holdCall(HoldCallRequest request);

    CompletableFuture<HotlineSessionQueryResponse> hotlineSessionQuery(HotlineSessionQueryRequest request);

    CompletableFuture<InsertAiOutboundPhoneNumsResponse> insertAiOutboundPhoneNums(InsertAiOutboundPhoneNumsRequest request);

    CompletableFuture<InsertTaskDetailResponse> insertTaskDetail(InsertTaskDetailRequest request);

    CompletableFuture<JoinThirdCallResponse> joinThirdCall(JoinThirdCallRequest request);

    CompletableFuture<ListAgentBySkillGroupIdResponse> listAgentBySkillGroupId(ListAgentBySkillGroupIdRequest request);

    CompletableFuture<ListAiccsRobotResponse> listAiccsRobot(ListAiccsRobotRequest request);

    CompletableFuture<ListChatRecordDetailResponse> listChatRecordDetail(ListChatRecordDetailRequest request);

    CompletableFuture<ListDialogResponse> listDialog(ListDialogRequest request);

    CompletableFuture<ListDialogByCreateTimeResponse> listDialogByCreateTime(ListDialogByCreateTimeRequest request);

    CompletableFuture<ListHotlineRecordResponse> listHotlineRecord(ListHotlineRecordRequest request);

    CompletableFuture<ListHotlineRecordDetailResponse> listHotlineRecordDetail(ListHotlineRecordDetailRequest request);

    CompletableFuture<ListHotlineRecordsResponse> listHotlineRecords(ListHotlineRecordsRequest request);

    CompletableFuture<ListOutboundPhoneNumberResponse> listOutboundPhoneNumber(ListOutboundPhoneNumberRequest request);

    CompletableFuture<ListOutboundStrategiesResponse> listOutboundStrategies(ListOutboundStrategiesRequest request);

    CompletableFuture<ListOuterOrderedNumbersResponse> listOuterOrderedNumbers(ListOuterOrderedNumbersRequest request);

    CompletableFuture<ListRobotAllResponse> listRobotAll(ListRobotAllRequest request);

    CompletableFuture<ListRobotCallDialogResponse> listRobotCallDialog(ListRobotCallDialogRequest request);

    CompletableFuture<ListRobotNodeResponse> listRobotNode(ListRobotNodeRequest request);

    CompletableFuture<ListRobotParamsResponse> listRobotParams(ListRobotParamsRequest request);

    CompletableFuture<ListRolesResponse> listRoles(ListRolesRequest request);

    CompletableFuture<ListSkillGroupResponse> listSkillGroup(ListSkillGroupRequest request);

    CompletableFuture<ListTaskResponse> listTask(ListTaskRequest request);

    CompletableFuture<ListTaskDetailResponse> listTaskDetail(ListTaskDetailRequest request);

    CompletableFuture<MakeCallResponse> makeCall(MakeCallRequest request);

    CompletableFuture<MakeDoubleCallResponse> makeDoubleCall(MakeDoubleCallRequest request);

    CompletableFuture<QueryHotlineInQueueResponse> queryHotlineInQueue(QueryHotlineInQueueRequest request);

    CompletableFuture<QueryHotlineNumberResponse> queryHotlineNumber(QueryHotlineNumberRequest request);

    CompletableFuture<QueryOutboundTaskResponse> queryOutboundTask(QueryOutboundTaskRequest request);

    CompletableFuture<QuerySkillGroupsResponse> querySkillGroups(QuerySkillGroupsRequest request);

    CompletableFuture<QueryTaskDetailResponse> queryTaskDetail(QueryTaskDetailRequest request);

    CompletableFuture<QueryTaskResultResponse> queryTaskResult(QueryTaskResultRequest request);

    CompletableFuture<QueryTicketsResponse> queryTickets(QueryTicketsRequest request);

    CompletableFuture<QueryTouchListResponse> queryTouchList(QueryTouchListRequest request);

    CompletableFuture<RemoveAgentFromSkillGroupResponse> removeAgentFromSkillGroup(RemoveAgentFromSkillGroupRequest request);

    CompletableFuture<RemoveSkillGroupResponse> removeSkillGroup(RemoveSkillGroupRequest request);

    CompletableFuture<ResetHotlineNumberResponse> resetHotlineNumber(ResetHotlineNumberRequest request);

    CompletableFuture<RestartOutboundTaskResponse> restartOutboundTask(RestartOutboundTaskRequest request);

    CompletableFuture<RobotCallResponse> robotCall(RobotCallRequest request);

    CompletableFuture<SendCcoSmartCallResponse> sendCcoSmartCall(SendCcoSmartCallRequest request);

    CompletableFuture<SendCcoSmartCallOperateResponse> sendCcoSmartCallOperate(SendCcoSmartCallOperateRequest request);

    CompletableFuture<SendHotlineHeartBeatResponse> sendHotlineHeartBeat(SendHotlineHeartBeatRequest request);

    CompletableFuture<SendMicroCommandResponse> sendMicroCommand(SendMicroCommandRequest request);

    CompletableFuture<SendOutboundCommandResponse> sendOutboundCommand(SendOutboundCommandRequest request);

    CompletableFuture<SmartOutboundResponse> smartOutbound(SmartOutboundRequest request);

    CompletableFuture<StartAiOutboundTaskResponse> startAiOutboundTask(StartAiOutboundTaskRequest request);

    CompletableFuture<StartCallResponse> startCall(StartCallRequest request);

    CompletableFuture<StartCallV2Response> startCallV2(StartCallV2Request request);

    CompletableFuture<StartChatWorkResponse> startChatWork(StartChatWorkRequest request);

    CompletableFuture<StartHotlineServiceResponse> startHotlineService(StartHotlineServiceRequest request);

    CompletableFuture<StartMicroOutboundResponse> startMicroOutbound(StartMicroOutboundRequest request);

    CompletableFuture<StartMicroOutboundNewResponse> startMicroOutboundNew(StartMicroOutboundNewRequest request);

    CompletableFuture<StartTaskResponse> startTask(StartTaskRequest request);

    CompletableFuture<StartTaskByAppResponse> startTaskByApp(StartTaskByAppRequest request);

    CompletableFuture<StopAiOutboundTaskResponse> stopAiOutboundTask(StopAiOutboundTaskRequest request);

    CompletableFuture<StopTaskResponse> stopTask(StopTaskRequest request);

    CompletableFuture<SuspendHotlineServiceResponse> suspendHotlineService(SuspendHotlineServiceRequest request);

    CompletableFuture<SuspendOutboundTaskResponse> suspendOutboundTask(SuspendOutboundTaskRequest request);

    CompletableFuture<TerminateAiOutboundTaskResponse> terminateAiOutboundTask(TerminateAiOutboundTaskRequest request);

    CompletableFuture<TerminateTaskAiOutboundTaskResponse> terminateTaskAiOutboundTask(TerminateTaskAiOutboundTaskRequest request);

    CompletableFuture<TestApiAResponse> testApiA(TestApiARequest request);

    CompletableFuture<TransferCallToSkillGroupResponse> transferCallToSkillGroup(TransferCallToSkillGroupRequest request);

    CompletableFuture<UpdateAgentResponse> updateAgent(UpdateAgentRequest request);

    CompletableFuture<UpdateAiOutboundTaskResponse> updateAiOutboundTask(UpdateAiOutboundTaskRequest request);

    CompletableFuture<UpdateDepartmentResponse> updateDepartment(UpdateDepartmentRequest request);

    CompletableFuture<UpdateOuterAccountResponse> updateOuterAccount(UpdateOuterAccountRequest request);

    CompletableFuture<UpdateSkillGroupResponse> updateSkillGroup(UpdateSkillGroupRequest request);

}
