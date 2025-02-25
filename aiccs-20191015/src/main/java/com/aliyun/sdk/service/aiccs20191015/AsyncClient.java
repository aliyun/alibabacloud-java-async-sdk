// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.aiccs20191015.models.*;
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
     * @param request the request parameters of AddHotlineNumber  AddHotlineNumberRequest
     * @return AddHotlineNumberResponse
     */
    CompletableFuture<AddHotlineNumberResponse> addHotlineNumber(AddHotlineNumberRequest request);

    /**
     * @param request the request parameters of AddOuterAccount  AddOuterAccountRequest
     * @return AddOuterAccountResponse
     */
    CompletableFuture<AddOuterAccountResponse> addOuterAccount(AddOuterAccountRequest request);

    /**
     * @param request the request parameters of AddSkillGroup  AddSkillGroupRequest
     * @return AddSkillGroupResponse
     */
    CompletableFuture<AddSkillGroupResponse> addSkillGroup(AddSkillGroupRequest request);

    /**
     * @param request the request parameters of AiccsSmartCall  AiccsSmartCallRequest
     * @return AiccsSmartCallResponse
     */
    CompletableFuture<AiccsSmartCallResponse> aiccsSmartCall(AiccsSmartCallRequest request);

    /**
     * @param request the request parameters of AiccsSmartCallOperate  AiccsSmartCallOperateRequest
     * @return AiccsSmartCallOperateResponse
     */
    CompletableFuture<AiccsSmartCallOperateResponse> aiccsSmartCallOperate(AiccsSmartCallOperateRequest request);

    /**
     * @param request the request parameters of AnswerCall  AnswerCallRequest
     * @return AnswerCallResponse
     */
    CompletableFuture<AnswerCallResponse> answerCall(AnswerCallRequest request);

    /**
     * @param request the request parameters of AttachTask  AttachTaskRequest
     * @return AttachTaskResponse
     */
    CompletableFuture<AttachTaskResponse> attachTask(AttachTaskRequest request);

    /**
     * @param request the request parameters of BatchCreateQualityProjects  BatchCreateQualityProjectsRequest
     * @return BatchCreateQualityProjectsResponse
     */
    CompletableFuture<BatchCreateQualityProjectsResponse> batchCreateQualityProjects(BatchCreateQualityProjectsRequest request);

    /**
     * @param request the request parameters of CancelTask  CancelTaskRequest
     * @return CancelTaskResponse
     */
    CompletableFuture<CancelTaskResponse> cancelTask(CancelTaskRequest request);

    /**
     * @param request the request parameters of ChangeChatAgentStatus  ChangeChatAgentStatusRequest
     * @return ChangeChatAgentStatusResponse
     */
    CompletableFuture<ChangeChatAgentStatusResponse> changeChatAgentStatus(ChangeChatAgentStatusRequest request);

    /**
     * @param request the request parameters of ChangeQualityProjectStatus  ChangeQualityProjectStatusRequest
     * @return ChangeQualityProjectStatusResponse
     */
    CompletableFuture<ChangeQualityProjectStatusResponse> changeQualityProjectStatus(ChangeQualityProjectStatusRequest request);

    /**
     * @param request the request parameters of CreateAgent  CreateAgentRequest
     * @return CreateAgentResponse
     */
    CompletableFuture<CreateAgentResponse> createAgent(CreateAgentRequest request);

    /**
     * @param request the request parameters of CreateAiOutboundTask  CreateAiOutboundTaskRequest
     * @return CreateAiOutboundTaskResponse
     */
    CompletableFuture<CreateAiOutboundTaskResponse> createAiOutboundTask(CreateAiOutboundTaskRequest request);

    /**
     * @param request the request parameters of CreateAiOutboundTaskBatch  CreateAiOutboundTaskBatchRequest
     * @return CreateAiOutboundTaskBatchResponse
     */
    CompletableFuture<CreateAiOutboundTaskBatchResponse> createAiOutboundTaskBatch(CreateAiOutboundTaskBatchRequest request);

    /**
     * @param request the request parameters of CreateDepartment  CreateDepartmentRequest
     * @return CreateDepartmentResponse
     */
    CompletableFuture<CreateDepartmentResponse> createDepartment(CreateDepartmentRequest request);

    /**
     * @param request the request parameters of CreateOutboundTask  CreateOutboundTaskRequest
     * @return CreateOutboundTaskResponse
     */
    CompletableFuture<CreateOutboundTaskResponse> createOutboundTask(CreateOutboundTaskRequest request);

    /**
     * @param request the request parameters of CreateQualityProject  CreateQualityProjectRequest
     * @return CreateQualityProjectResponse
     */
    CompletableFuture<CreateQualityProjectResponse> createQualityProject(CreateQualityProjectRequest request);

    /**
     * @param request the request parameters of CreateQualityRule  CreateQualityRuleRequest
     * @return CreateQualityRuleResponse
     */
    CompletableFuture<CreateQualityRuleResponse> createQualityRule(CreateQualityRuleRequest request);

    /**
     * @param request the request parameters of CreateSkillGroup  CreateSkillGroupRequest
     * @return CreateSkillGroupResponse
     */
    CompletableFuture<CreateSkillGroupResponse> createSkillGroup(CreateSkillGroupRequest request);

    /**
     * @param request the request parameters of CreateTask  CreateTaskRequest
     * @return CreateTaskResponse
     */
    CompletableFuture<CreateTaskResponse> createTask(CreateTaskRequest request);

    /**
     * @param request the request parameters of CreateThirdSsoAgent  CreateThirdSsoAgentRequest
     * @return CreateThirdSsoAgentResponse
     */
    CompletableFuture<CreateThirdSsoAgentResponse> createThirdSsoAgent(CreateThirdSsoAgentRequest request);

    /**
     * @param request the request parameters of DeleteAgent  DeleteAgentRequest
     * @return DeleteAgentResponse
     */
    CompletableFuture<DeleteAgentResponse> deleteAgent(DeleteAgentRequest request);

    /**
     * @param request the request parameters of DeleteAiOutboundTask  DeleteAiOutboundTaskRequest
     * @return DeleteAiOutboundTaskResponse
     */
    CompletableFuture<DeleteAiOutboundTaskResponse> deleteAiOutboundTask(DeleteAiOutboundTaskRequest request);

    /**
     * @param request the request parameters of DeleteDepartment  DeleteDepartmentRequest
     * @return DeleteDepartmentResponse
     */
    CompletableFuture<DeleteDepartmentResponse> deleteDepartment(DeleteDepartmentRequest request);

    /**
     * @param request the request parameters of DeleteHotlineNumber  DeleteHotlineNumberRequest
     * @return DeleteHotlineNumberResponse
     */
    CompletableFuture<DeleteHotlineNumberResponse> deleteHotlineNumber(DeleteHotlineNumberRequest request);

    /**
     * @param request the request parameters of DeleteOutboundTask  DeleteOutboundTaskRequest
     * @return DeleteOutboundTaskResponse
     */
    CompletableFuture<DeleteOutboundTaskResponse> deleteOutboundTask(DeleteOutboundTaskRequest request);

    /**
     * @param request the request parameters of DeleteOuterAccount  DeleteOuterAccountRequest
     * @return DeleteOuterAccountResponse
     */
    CompletableFuture<DeleteOuterAccountResponse> deleteOuterAccount(DeleteOuterAccountRequest request);

    /**
     * @param request the request parameters of DeleteQualityProject  DeleteQualityProjectRequest
     * @return DeleteQualityProjectResponse
     */
    CompletableFuture<DeleteQualityProjectResponse> deleteQualityProject(DeleteQualityProjectRequest request);

    /**
     * @param request the request parameters of DeleteQualityRule  DeleteQualityRuleRequest
     * @return DeleteQualityRuleResponse
     */
    CompletableFuture<DeleteQualityRuleResponse> deleteQualityRule(DeleteQualityRuleRequest request);

    /**
     * @param request the request parameters of DeleteSkillGroup  DeleteSkillGroupRequest
     * @return DeleteSkillGroupResponse
     */
    CompletableFuture<DeleteSkillGroupResponse> deleteSkillGroup(DeleteSkillGroupRequest request);

    /**
     * @param request the request parameters of DescribeRecordData  DescribeRecordDataRequest
     * @return DescribeRecordDataResponse
     */
    CompletableFuture<DescribeRecordDataResponse> describeRecordData(DescribeRecordDataRequest request);

    /**
     * @param request the request parameters of EditQualityProject  EditQualityProjectRequest
     * @return EditQualityProjectResponse
     */
    CompletableFuture<EditQualityProjectResponse> editQualityProject(EditQualityProjectRequest request);

    /**
     * @param request the request parameters of EditQualityRule  EditQualityRuleRequest
     * @return EditQualityRuleResponse
     */
    CompletableFuture<EditQualityRuleResponse> editQualityRule(EditQualityRuleRequest request);

    /**
     * @param request the request parameters of EditQualityRuleTag  EditQualityRuleTagRequest
     * @return EditQualityRuleTagResponse
     */
    CompletableFuture<EditQualityRuleTagResponse> editQualityRuleTag(EditQualityRuleTagRequest request);

    /**
     * @param request the request parameters of EncryptPhoneNum  EncryptPhoneNumRequest
     * @return EncryptPhoneNumResponse
     */
    CompletableFuture<EncryptPhoneNumResponse> encryptPhoneNum(EncryptPhoneNumRequest request);

    /**
     * @param request the request parameters of FetchCall  FetchCallRequest
     * @return FetchCallResponse
     */
    CompletableFuture<FetchCallResponse> fetchCall(FetchCallRequest request);

    /**
     * @param request the request parameters of FinishHotlineService  FinishHotlineServiceRequest
     * @return FinishHotlineServiceResponse
     */
    CompletableFuture<FinishHotlineServiceResponse> finishHotlineService(FinishHotlineServiceRequest request);

    /**
     * @param request the request parameters of GenerateWebSocketSign  GenerateWebSocketSignRequest
     * @return GenerateWebSocketSignResponse
     */
    CompletableFuture<GenerateWebSocketSignResponse> generateWebSocketSign(GenerateWebSocketSignRequest request);

    /**
     * @param request the request parameters of GetAgent  GetAgentRequest
     * @return GetAgentResponse
     */
    CompletableFuture<GetAgentResponse> getAgent(GetAgentRequest request);

    /**
     * @param request the request parameters of GetAgentBasisStatus  GetAgentBasisStatusRequest
     * @return GetAgentBasisStatusResponse
     */
    CompletableFuture<GetAgentBasisStatusResponse> getAgentBasisStatus(GetAgentBasisStatusRequest request);

    /**
     * @param request the request parameters of GetAgentById  GetAgentByIdRequest
     * @return GetAgentByIdResponse
     */
    CompletableFuture<GetAgentByIdResponse> getAgentById(GetAgentByIdRequest request);

    /**
     * @param request the request parameters of GetAgentDetailReport  GetAgentDetailReportRequest
     * @return GetAgentDetailReportResponse
     */
    CompletableFuture<GetAgentDetailReportResponse> getAgentDetailReport(GetAgentDetailReportRequest request);

    /**
     * @param request the request parameters of GetAgentIndexRealTime  GetAgentIndexRealTimeRequest
     * @return GetAgentIndexRealTimeResponse
     */
    CompletableFuture<GetAgentIndexRealTimeResponse> getAgentIndexRealTime(GetAgentIndexRealTimeRequest request);

    /**
     * @param request the request parameters of GetAgentServiceStatus  GetAgentServiceStatusRequest
     * @return GetAgentServiceStatusResponse
     */
    CompletableFuture<GetAgentServiceStatusResponse> getAgentServiceStatus(GetAgentServiceStatusRequest request);

    /**
     * @param request the request parameters of GetAgentStatistics  GetAgentStatisticsRequest
     * @return GetAgentStatisticsResponse
     */
    CompletableFuture<GetAgentStatisticsResponse> getAgentStatistics(GetAgentStatisticsRequest request);

    /**
     * @param request the request parameters of GetAiOutboundTaskBizData  GetAiOutboundTaskBizDataRequest
     * @return GetAiOutboundTaskBizDataResponse
     */
    CompletableFuture<GetAiOutboundTaskBizDataResponse> getAiOutboundTaskBizData(GetAiOutboundTaskBizDataRequest request);

    /**
     * @param request the request parameters of GetAiOutboundTaskDetail  GetAiOutboundTaskDetailRequest
     * @return GetAiOutboundTaskDetailResponse
     */
    CompletableFuture<GetAiOutboundTaskDetailResponse> getAiOutboundTaskDetail(GetAiOutboundTaskDetailRequest request);

    /**
     * @param request the request parameters of GetAiOutboundTaskExecDetail  GetAiOutboundTaskExecDetailRequest
     * @return GetAiOutboundTaskExecDetailResponse
     */
    CompletableFuture<GetAiOutboundTaskExecDetailResponse> getAiOutboundTaskExecDetail(GetAiOutboundTaskExecDetailRequest request);

    /**
     * @param request the request parameters of GetAiOutboundTaskList  GetAiOutboundTaskListRequest
     * @return GetAiOutboundTaskListResponse
     */
    CompletableFuture<GetAiOutboundTaskListResponse> getAiOutboundTaskList(GetAiOutboundTaskListRequest request);

    /**
     * @param request the request parameters of GetAiOutboundTaskProgress  GetAiOutboundTaskProgressRequest
     * @return GetAiOutboundTaskProgressResponse
     */
    CompletableFuture<GetAiOutboundTaskProgressResponse> getAiOutboundTaskProgress(GetAiOutboundTaskProgressRequest request);

    /**
     * @param request the request parameters of GetAllDepartment  GetAllDepartmentRequest
     * @return GetAllDepartmentResponse
     */
    CompletableFuture<GetAllDepartmentResponse> getAllDepartment(GetAllDepartmentRequest request);

    /**
     * @param request the request parameters of GetCallSoundRecord  GetCallSoundRecordRequest
     * @return GetCallSoundRecordResponse
     */
    CompletableFuture<GetCallSoundRecordResponse> getCallSoundRecord(GetCallSoundRecordRequest request);

    /**
     * @param request the request parameters of GetConfigNumList  GetConfigNumListRequest
     * @return GetConfigNumListResponse
     */
    CompletableFuture<GetConfigNumListResponse> getConfigNumList(GetConfigNumListRequest request);

    /**
     * @param request the request parameters of GetCustomerInfo  GetCustomerInfoRequest
     * @return GetCustomerInfoResponse
     */
    CompletableFuture<GetCustomerInfoResponse> getCustomerInfo(GetCustomerInfoRequest request);

    /**
     * @param request the request parameters of GetDepGroupTreeData  GetDepGroupTreeDataRequest
     * @return GetDepGroupTreeDataResponse
     */
    CompletableFuture<GetDepGroupTreeDataResponse> getDepGroupTreeData(GetDepGroupTreeDataRequest request);

    /**
     * @param request the request parameters of GetDepartmentalLatitudeAgentStatus  GetDepartmentalLatitudeAgentStatusRequest
     * @return GetDepartmentalLatitudeAgentStatusResponse
     */
    CompletableFuture<GetDepartmentalLatitudeAgentStatusResponse> getDepartmentalLatitudeAgentStatus(GetDepartmentalLatitudeAgentStatusRequest request);

    /**
     * @param request the request parameters of GetHotlineAgentDetail  GetHotlineAgentDetailRequest
     * @return GetHotlineAgentDetailResponse
     */
    CompletableFuture<GetHotlineAgentDetailResponse> getHotlineAgentDetail(GetHotlineAgentDetailRequest request);

    /**
     * @param request the request parameters of GetHotlineAgentDetailReport  GetHotlineAgentDetailReportRequest
     * @return GetHotlineAgentDetailReportResponse
     */
    CompletableFuture<GetHotlineAgentDetailReportResponse> getHotlineAgentDetailReport(GetHotlineAgentDetailReportRequest request);

    /**
     * @param request the request parameters of GetHotlineAgentStatus  GetHotlineAgentStatusRequest
     * @return GetHotlineAgentStatusResponse
     */
    CompletableFuture<GetHotlineAgentStatusResponse> getHotlineAgentStatus(GetHotlineAgentStatusRequest request);

    /**
     * @param request the request parameters of GetHotlineCallAction  GetHotlineCallActionRequest
     * @return GetHotlineCallActionResponse
     */
    CompletableFuture<GetHotlineCallActionResponse> getHotlineCallAction(GetHotlineCallActionRequest request);

    /**
     * @param request the request parameters of GetHotlineGroupDetailReport  GetHotlineGroupDetailReportRequest
     * @return GetHotlineGroupDetailReportResponse
     */
    CompletableFuture<GetHotlineGroupDetailReportResponse> getHotlineGroupDetailReport(GetHotlineGroupDetailReportRequest request);

    /**
     * @param request the request parameters of GetHotlineMessageLog  GetHotlineMessageLogRequest
     * @return GetHotlineMessageLogResponse
     */
    CompletableFuture<GetHotlineMessageLogResponse> getHotlineMessageLog(GetHotlineMessageLogRequest request);

    /**
     * @param request the request parameters of GetHotlineRuntimeInfo  GetHotlineRuntimeInfoRequest
     * @return GetHotlineRuntimeInfoResponse
     */
    CompletableFuture<GetHotlineRuntimeInfoResponse> getHotlineRuntimeInfo(GetHotlineRuntimeInfoRequest request);

    /**
     * @param request the request parameters of GetHotlineServiceStatistics  GetHotlineServiceStatisticsRequest
     * @return GetHotlineServiceStatisticsResponse
     */
    CompletableFuture<GetHotlineServiceStatisticsResponse> getHotlineServiceStatistics(GetHotlineServiceStatisticsRequest request);

    /**
     * @param request the request parameters of GetHotlineWaitingNumber  GetHotlineWaitingNumberRequest
     * @return GetHotlineWaitingNumberResponse
     */
    CompletableFuture<GetHotlineWaitingNumberResponse> getHotlineWaitingNumber(GetHotlineWaitingNumberRequest request);

    /**
     * @param request the request parameters of GetIndexCurrentValue  GetIndexCurrentValueRequest
     * @return GetIndexCurrentValueResponse
     */
    CompletableFuture<GetIndexCurrentValueResponse> getIndexCurrentValue(GetIndexCurrentValueRequest request);

    /**
     * @param request the request parameters of GetInstanceList  GetInstanceListRequest
     * @return GetInstanceListResponse
     */
    CompletableFuture<GetInstanceListResponse> getInstanceList(GetInstanceListRequest request);

    /**
     * @param request the request parameters of GetMcuLvsIp  GetMcuLvsIpRequest
     * @return GetMcuLvsIpResponse
     */
    CompletableFuture<GetMcuLvsIpResponse> getMcuLvsIp(GetMcuLvsIpRequest request);

    /**
     * @param request the request parameters of GetNumLocation  GetNumLocationRequest
     * @return GetNumLocationResponse
     */
    CompletableFuture<GetNumLocationResponse> getNumLocation(GetNumLocationRequest request);

    /**
     * @param request the request parameters of GetOnlineSeatInformation  GetOnlineSeatInformationRequest
     * @return GetOnlineSeatInformationResponse
     */
    CompletableFuture<GetOnlineSeatInformationResponse> getOnlineSeatInformation(GetOnlineSeatInformationRequest request);

    /**
     * @param request the request parameters of GetOnlineServiceVolume  GetOnlineServiceVolumeRequest
     * @return GetOnlineServiceVolumeResponse
     */
    CompletableFuture<GetOnlineServiceVolumeResponse> getOnlineServiceVolume(GetOnlineServiceVolumeRequest request);

    /**
     * @param request the request parameters of GetOutbounNumList  GetOutbounNumListRequest
     * @return GetOutbounNumListResponse
     */
    CompletableFuture<GetOutbounNumListResponse> getOutbounNumList(GetOutbounNumListRequest request);

    /**
     * @param request the request parameters of GetQualityProjectDetail  GetQualityProjectDetailRequest
     * @return GetQualityProjectDetailResponse
     */
    CompletableFuture<GetQualityProjectDetailResponse> getQualityProjectDetail(GetQualityProjectDetailRequest request);

    /**
     * @param request the request parameters of GetQualityProjectList  GetQualityProjectListRequest
     * @return GetQualityProjectListResponse
     */
    CompletableFuture<GetQualityProjectListResponse> getQualityProjectList(GetQualityProjectListRequest request);

    /**
     * @param request the request parameters of GetQualityProjectLog  GetQualityProjectLogRequest
     * @return GetQualityProjectLogResponse
     */
    CompletableFuture<GetQualityProjectLogResponse> getQualityProjectLog(GetQualityProjectLogRequest request);

    /**
     * @param request the request parameters of GetQualityResult  GetQualityResultRequest
     * @return GetQualityResultResponse
     */
    CompletableFuture<GetQualityResultResponse> getQualityResult(GetQualityResultRequest request);

    /**
     * @param request the request parameters of GetQualityRuleDetail  GetQualityRuleDetailRequest
     * @return GetQualityRuleDetailResponse
     */
    CompletableFuture<GetQualityRuleDetailResponse> getQualityRuleDetail(GetQualityRuleDetailRequest request);

    /**
     * @param request the request parameters of GetQualityRuleList  GetQualityRuleListRequest
     * @return GetQualityRuleListResponse
     */
    CompletableFuture<GetQualityRuleListResponse> getQualityRuleList(GetQualityRuleListRequest request);

    /**
     * @param request the request parameters of GetQualityRuleTagList  GetQualityRuleTagListRequest
     * @return GetQualityRuleTagListResponse
     */
    CompletableFuture<GetQualityRuleTagListResponse> getQualityRuleTagList(GetQualityRuleTagListRequest request);

    /**
     * @param request the request parameters of GetQueueInformation  GetQueueInformationRequest
     * @return GetQueueInformationResponse
     */
    CompletableFuture<GetQueueInformationResponse> getQueueInformation(GetQueueInformationRequest request);

    /**
     * @param request the request parameters of GetRecordData  GetRecordDataRequest
     * @return GetRecordDataResponse
     */
    CompletableFuture<GetRecordDataResponse> getRecordData(GetRecordDataRequest request);

    /**
     * @param request the request parameters of GetRecordUrl  GetRecordUrlRequest
     * @return GetRecordUrlResponse
     */
    CompletableFuture<GetRecordUrlResponse> getRecordUrl(GetRecordUrlRequest request);

    /**
     * @param request the request parameters of GetRtcToken  GetRtcTokenRequest
     * @return GetRtcTokenResponse
     */
    CompletableFuture<GetRtcTokenResponse> getRtcToken(GetRtcTokenRequest request);

    /**
     * @param request the request parameters of GetSeatInformation  GetSeatInformationRequest
     * @return GetSeatInformationResponse
     */
    CompletableFuture<GetSeatInformationResponse> getSeatInformation(GetSeatInformationRequest request);

    /**
     * @param request the request parameters of GetSkillGroupAgentStatusDetails  GetSkillGroupAgentStatusDetailsRequest
     * @return GetSkillGroupAgentStatusDetailsResponse
     */
    CompletableFuture<GetSkillGroupAgentStatusDetailsResponse> getSkillGroupAgentStatusDetails(GetSkillGroupAgentStatusDetailsRequest request);

    /**
     * @param request the request parameters of GetSkillGroupAndAgentStatusSummary  GetSkillGroupAndAgentStatusSummaryRequest
     * @return GetSkillGroupAndAgentStatusSummaryResponse
     */
    CompletableFuture<GetSkillGroupAndAgentStatusSummaryResponse> getSkillGroupAndAgentStatusSummary(GetSkillGroupAndAgentStatusSummaryRequest request);

    /**
     * @param request the request parameters of GetSkillGroupLatitudeState  GetSkillGroupLatitudeStateRequest
     * @return GetSkillGroupLatitudeStateResponse
     */
    CompletableFuture<GetSkillGroupLatitudeStateResponse> getSkillGroupLatitudeState(GetSkillGroupLatitudeStateRequest request);

    /**
     * @param request the request parameters of GetSkillGroupServiceCapability  GetSkillGroupServiceCapabilityRequest
     * @return GetSkillGroupServiceCapabilityResponse
     */
    CompletableFuture<GetSkillGroupServiceCapabilityResponse> getSkillGroupServiceCapability(GetSkillGroupServiceCapabilityRequest request);

    /**
     * @param request the request parameters of GetSkillGroupServiceStatus  GetSkillGroupServiceStatusRequest
     * @return GetSkillGroupServiceStatusResponse
     */
    CompletableFuture<GetSkillGroupServiceStatusResponse> getSkillGroupServiceStatus(GetSkillGroupServiceStatusRequest request);

    /**
     * @param request the request parameters of GetSkillGroupStatusTotal  GetSkillGroupStatusTotalRequest
     * @return GetSkillGroupStatusTotalResponse
     */
    CompletableFuture<GetSkillGroupStatusTotalResponse> getSkillGroupStatusTotal(GetSkillGroupStatusTotalRequest request);

    /**
     * @param request the request parameters of HangUpDoubleCall  HangUpDoubleCallRequest
     * @return HangUpDoubleCallResponse
     */
    CompletableFuture<HangUpDoubleCallResponse> hangUpDoubleCall(HangUpDoubleCallRequest request);

    /**
     * @param request the request parameters of HangupCall  HangupCallRequest
     * @return HangupCallResponse
     */
    CompletableFuture<HangupCallResponse> hangupCall(HangupCallRequest request);

    /**
     * @param request the request parameters of HangupOperate  HangupOperateRequest
     * @return HangupOperateResponse
     */
    CompletableFuture<HangupOperateResponse> hangupOperate(HangupOperateRequest request);

    /**
     * @param request the request parameters of HangupThirdCall  HangupThirdCallRequest
     * @return HangupThirdCallResponse
     */
    CompletableFuture<HangupThirdCallResponse> hangupThirdCall(HangupThirdCallRequest request);

    /**
     * @param request the request parameters of HoldCall  HoldCallRequest
     * @return HoldCallResponse
     */
    CompletableFuture<HoldCallResponse> holdCall(HoldCallRequest request);

    /**
     * @param request the request parameters of HotlineSessionQuery  HotlineSessionQueryRequest
     * @return HotlineSessionQueryResponse
     */
    CompletableFuture<HotlineSessionQueryResponse> hotlineSessionQuery(HotlineSessionQueryRequest request);

    /**
     * @param request the request parameters of InsertAiOutboundPhoneNums  InsertAiOutboundPhoneNumsRequest
     * @return InsertAiOutboundPhoneNumsResponse
     */
    CompletableFuture<InsertAiOutboundPhoneNumsResponse> insertAiOutboundPhoneNums(InsertAiOutboundPhoneNumsRequest request);

    /**
     * @param request the request parameters of InsertTaskDetail  InsertTaskDetailRequest
     * @return InsertTaskDetailResponse
     */
    CompletableFuture<InsertTaskDetailResponse> insertTaskDetail(InsertTaskDetailRequest request);

    /**
     * @param request the request parameters of JoinThirdCall  JoinThirdCallRequest
     * @return JoinThirdCallResponse
     */
    CompletableFuture<JoinThirdCallResponse> joinThirdCall(JoinThirdCallRequest request);

    /**
     * @param request the request parameters of ListAgentBySkillGroupId  ListAgentBySkillGroupIdRequest
     * @return ListAgentBySkillGroupIdResponse
     */
    CompletableFuture<ListAgentBySkillGroupIdResponse> listAgentBySkillGroupId(ListAgentBySkillGroupIdRequest request);

    /**
     * @param request the request parameters of ListAiccsRobot  ListAiccsRobotRequest
     * @return ListAiccsRobotResponse
     */
    CompletableFuture<ListAiccsRobotResponse> listAiccsRobot(ListAiccsRobotRequest request);

    /**
     * @param request the request parameters of ListChatRecordDetail  ListChatRecordDetailRequest
     * @return ListChatRecordDetailResponse
     */
    CompletableFuture<ListChatRecordDetailResponse> listChatRecordDetail(ListChatRecordDetailRequest request);

    /**
     * @param request the request parameters of ListDialog  ListDialogRequest
     * @return ListDialogResponse
     */
    CompletableFuture<ListDialogResponse> listDialog(ListDialogRequest request);

    /**
     * @param request the request parameters of ListHotlineRecord  ListHotlineRecordRequest
     * @return ListHotlineRecordResponse
     */
    CompletableFuture<ListHotlineRecordResponse> listHotlineRecord(ListHotlineRecordRequest request);

    /**
     * @param request the request parameters of ListHotlineRecordDetail  ListHotlineRecordDetailRequest
     * @return ListHotlineRecordDetailResponse
     */
    CompletableFuture<ListHotlineRecordDetailResponse> listHotlineRecordDetail(ListHotlineRecordDetailRequest request);

    /**
     * @param request the request parameters of ListOutboundPhoneNumber  ListOutboundPhoneNumberRequest
     * @return ListOutboundPhoneNumberResponse
     */
    CompletableFuture<ListOutboundPhoneNumberResponse> listOutboundPhoneNumber(ListOutboundPhoneNumberRequest request);

    /**
     * @param request the request parameters of ListRobotCallDialog  ListRobotCallDialogRequest
     * @return ListRobotCallDialogResponse
     */
    CompletableFuture<ListRobotCallDialogResponse> listRobotCallDialog(ListRobotCallDialogRequest request);

    /**
     * @param request the request parameters of ListRobotNode  ListRobotNodeRequest
     * @return ListRobotNodeResponse
     */
    CompletableFuture<ListRobotNodeResponse> listRobotNode(ListRobotNodeRequest request);

    /**
     * @param request the request parameters of ListRobotParams  ListRobotParamsRequest
     * @return ListRobotParamsResponse
     */
    CompletableFuture<ListRobotParamsResponse> listRobotParams(ListRobotParamsRequest request);

    /**
     * @param request the request parameters of ListRoles  ListRolesRequest
     * @return ListRolesResponse
     */
    CompletableFuture<ListRolesResponse> listRoles(ListRolesRequest request);

    /**
     * @param request the request parameters of ListSkillGroup  ListSkillGroupRequest
     * @return ListSkillGroupResponse
     */
    CompletableFuture<ListSkillGroupResponse> listSkillGroup(ListSkillGroupRequest request);

    /**
     * @param request the request parameters of ListTask  ListTaskRequest
     * @return ListTaskResponse
     */
    CompletableFuture<ListTaskResponse> listTask(ListTaskRequest request);

    /**
     * @param request the request parameters of ListTaskDetail  ListTaskDetailRequest
     * @return ListTaskDetailResponse
     */
    CompletableFuture<ListTaskDetailResponse> listTaskDetail(ListTaskDetailRequest request);

    /**
     * @param request the request parameters of LlmSmartCall  LlmSmartCallRequest
     * @return LlmSmartCallResponse
     */
    CompletableFuture<LlmSmartCallResponse> llmSmartCall(LlmSmartCallRequest request);

    /**
     * @param request the request parameters of MakeCall  MakeCallRequest
     * @return MakeCallResponse
     */
    CompletableFuture<MakeCallResponse> makeCall(MakeCallRequest request);

    /**
     * @param request the request parameters of MakeDoubleCall  MakeDoubleCallRequest
     * @return MakeDoubleCallResponse
     */
    CompletableFuture<MakeDoubleCallResponse> makeDoubleCall(MakeDoubleCallRequest request);

    /**
     * @param request the request parameters of QueryHotlineInQueue  QueryHotlineInQueueRequest
     * @return QueryHotlineInQueueResponse
     */
    CompletableFuture<QueryHotlineInQueueResponse> queryHotlineInQueue(QueryHotlineInQueueRequest request);

    /**
     * @param request the request parameters of QueryHotlineNumber  QueryHotlineNumberRequest
     * @return QueryHotlineNumberResponse
     */
    CompletableFuture<QueryHotlineNumberResponse> queryHotlineNumber(QueryHotlineNumberRequest request);

    /**
     * @param request the request parameters of QueryOutboundTask  QueryOutboundTaskRequest
     * @return QueryOutboundTaskResponse
     */
    CompletableFuture<QueryOutboundTaskResponse> queryOutboundTask(QueryOutboundTaskRequest request);

    /**
     * @param request the request parameters of QuerySkillGroups  QuerySkillGroupsRequest
     * @return QuerySkillGroupsResponse
     */
    CompletableFuture<QuerySkillGroupsResponse> querySkillGroups(QuerySkillGroupsRequest request);

    /**
     * @param request the request parameters of QueryTaskDetail  QueryTaskDetailRequest
     * @return QueryTaskDetailResponse
     */
    CompletableFuture<QueryTaskDetailResponse> queryTaskDetail(QueryTaskDetailRequest request);

    /**
     * @param request the request parameters of QueryTickets  QueryTicketsRequest
     * @return QueryTicketsResponse
     */
    CompletableFuture<QueryTicketsResponse> queryTickets(QueryTicketsRequest request);

    /**
     * @param request the request parameters of QueryTouchList  QueryTouchListRequest
     * @return QueryTouchListResponse
     */
    CompletableFuture<QueryTouchListResponse> queryTouchList(QueryTouchListRequest request);

    /**
     * @param request the request parameters of RemoveAgentFromSkillGroup  RemoveAgentFromSkillGroupRequest
     * @return RemoveAgentFromSkillGroupResponse
     */
    CompletableFuture<RemoveAgentFromSkillGroupResponse> removeAgentFromSkillGroup(RemoveAgentFromSkillGroupRequest request);

    /**
     * @param request the request parameters of RemoveSkillGroup  RemoveSkillGroupRequest
     * @return RemoveSkillGroupResponse
     */
    CompletableFuture<RemoveSkillGroupResponse> removeSkillGroup(RemoveSkillGroupRequest request);

    /**
     * @param request the request parameters of ResetHotlineNumber  ResetHotlineNumberRequest
     * @return ResetHotlineNumberResponse
     */
    CompletableFuture<ResetHotlineNumberResponse> resetHotlineNumber(ResetHotlineNumberRequest request);

    /**
     * @param request the request parameters of RestartOutboundTask  RestartOutboundTaskRequest
     * @return RestartOutboundTaskResponse
     */
    CompletableFuture<RestartOutboundTaskResponse> restartOutboundTask(RestartOutboundTaskRequest request);

    /**
     * @param request the request parameters of RobotCall  RobotCallRequest
     * @return RobotCallResponse
     */
    CompletableFuture<RobotCallResponse> robotCall(RobotCallRequest request);

    /**
     * @param request the request parameters of SendCcoSmartCall  SendCcoSmartCallRequest
     * @return SendCcoSmartCallResponse
     */
    CompletableFuture<SendCcoSmartCallResponse> sendCcoSmartCall(SendCcoSmartCallRequest request);

    /**
     * @param request the request parameters of SendCcoSmartCallOperate  SendCcoSmartCallOperateRequest
     * @return SendCcoSmartCallOperateResponse
     */
    CompletableFuture<SendCcoSmartCallOperateResponse> sendCcoSmartCallOperate(SendCcoSmartCallOperateRequest request);

    /**
     * @param request the request parameters of SendHotlineHeartBeat  SendHotlineHeartBeatRequest
     * @return SendHotlineHeartBeatResponse
     */
    CompletableFuture<SendHotlineHeartBeatResponse> sendHotlineHeartBeat(SendHotlineHeartBeatRequest request);

    /**
     * @param request the request parameters of StartAiOutboundTask  StartAiOutboundTaskRequest
     * @return StartAiOutboundTaskResponse
     */
    CompletableFuture<StartAiOutboundTaskResponse> startAiOutboundTask(StartAiOutboundTaskRequest request);

    /**
     * @param request the request parameters of StartCall  StartCallRequest
     * @return StartCallResponse
     */
    CompletableFuture<StartCallResponse> startCall(StartCallRequest request);

    /**
     * @param request the request parameters of StartCallV2  StartCallV2Request
     * @return StartCallV2Response
     */
    CompletableFuture<StartCallV2Response> startCallV2(StartCallV2Request request);

    /**
     * @param request the request parameters of StartChatWork  StartChatWorkRequest
     * @return StartChatWorkResponse
     */
    CompletableFuture<StartChatWorkResponse> startChatWork(StartChatWorkRequest request);

    /**
     * @param request the request parameters of StartHotlineService  StartHotlineServiceRequest
     * @return StartHotlineServiceResponse
     */
    CompletableFuture<StartHotlineServiceResponse> startHotlineService(StartHotlineServiceRequest request);

    /**
     * @param request the request parameters of StartMicroOutbound  StartMicroOutboundRequest
     * @return StartMicroOutboundResponse
     */
    CompletableFuture<StartMicroOutboundResponse> startMicroOutbound(StartMicroOutboundRequest request);

    /**
     * @param request the request parameters of StartTask  StartTaskRequest
     * @return StartTaskResponse
     */
    CompletableFuture<StartTaskResponse> startTask(StartTaskRequest request);

    /**
     * @param request the request parameters of StopAiOutboundTask  StopAiOutboundTaskRequest
     * @return StopAiOutboundTaskResponse
     */
    CompletableFuture<StopAiOutboundTaskResponse> stopAiOutboundTask(StopAiOutboundTaskRequest request);

    /**
     * @param request the request parameters of StopTask  StopTaskRequest
     * @return StopTaskResponse
     */
    CompletableFuture<StopTaskResponse> stopTask(StopTaskRequest request);

    /**
     * @param request the request parameters of SuspendHotlineService  SuspendHotlineServiceRequest
     * @return SuspendHotlineServiceResponse
     */
    CompletableFuture<SuspendHotlineServiceResponse> suspendHotlineService(SuspendHotlineServiceRequest request);

    /**
     * @param request the request parameters of SuspendOutboundTask  SuspendOutboundTaskRequest
     * @return SuspendOutboundTaskResponse
     */
    CompletableFuture<SuspendOutboundTaskResponse> suspendOutboundTask(SuspendOutboundTaskRequest request);

    /**
     * @param request the request parameters of TerminateAiOutboundTask  TerminateAiOutboundTaskRequest
     * @return TerminateAiOutboundTaskResponse
     */
    CompletableFuture<TerminateAiOutboundTaskResponse> terminateAiOutboundTask(TerminateAiOutboundTaskRequest request);

    /**
     * @param request the request parameters of TransferCallToSkillGroup  TransferCallToSkillGroupRequest
     * @return TransferCallToSkillGroupResponse
     */
    CompletableFuture<TransferCallToSkillGroupResponse> transferCallToSkillGroup(TransferCallToSkillGroupRequest request);

    /**
     * @param request the request parameters of UpdateAgent  UpdateAgentRequest
     * @return UpdateAgentResponse
     */
    CompletableFuture<UpdateAgentResponse> updateAgent(UpdateAgentRequest request);

    /**
     * @param request the request parameters of UpdateAiOutboundTask  UpdateAiOutboundTaskRequest
     * @return UpdateAiOutboundTaskResponse
     */
    CompletableFuture<UpdateAiOutboundTaskResponse> updateAiOutboundTask(UpdateAiOutboundTaskRequest request);

    /**
     * @param request the request parameters of UpdateDepartment  UpdateDepartmentRequest
     * @return UpdateDepartmentResponse
     */
    CompletableFuture<UpdateDepartmentResponse> updateDepartment(UpdateDepartmentRequest request);

    /**
     * @param request the request parameters of UpdateOuterAccount  UpdateOuterAccountRequest
     * @return UpdateOuterAccountResponse
     */
    CompletableFuture<UpdateOuterAccountResponse> updateOuterAccount(UpdateOuterAccountRequest request);

    /**
     * @param request the request parameters of UpdateSkillGroup  UpdateSkillGroupRequest
     * @return UpdateSkillGroupResponse
     */
    CompletableFuture<UpdateSkillGroupResponse> updateSkillGroup(UpdateSkillGroupRequest request);

}
