// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.ccc20200701.models.*;
import darabonba.core.utils.*;
import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;

import java.util.concurrent.CompletableFuture;


/**
 * <p>Main client.</p>
 */
public final class DefaultAsyncClient implements AsyncClient {

    protected final String product;
    protected final String version;
    protected final String endpointRule;
    protected final java.util.Map<String, String> endpointMap;
    protected final TeaRequest REQUEST;
    protected final TeaAsyncHandler handler;

    protected DefaultAsyncClient(ClientConfiguration configuration) {
        this.handler = new TeaAsyncHandler(configuration);
        this.product = "CCC";
        this.version = "2020-07-01";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("ap-northeast-1", "ccc.aliyuncs.com"),
            new TeaPair("ap-south-1", "ccc.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "ccc.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "ccc.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "ccc.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "ccc.aliyuncs.com"),
            new TeaPair("cn-beijing", "ccc.aliyuncs.com"),
            new TeaPair("cn-chengdu", "ccc.aliyuncs.com"),
            new TeaPair("cn-hongkong", "ccc.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "ccc.aliyuncs.com"),
            new TeaPair("cn-qingdao", "ccc.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "ccc.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "ccc.aliyuncs.com"),
            new TeaPair("eu-central-1", "ccc.aliyuncs.com"),
            new TeaPair("eu-west-1", "ccc.aliyuncs.com"),
            new TeaPair("me-east-1", "ccc.aliyuncs.com"),
            new TeaPair("us-east-1", "ccc.aliyuncs.com"),
            new TeaPair("us-west-1", "ccc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "ccc.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "ccc.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "ccc.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "ccc.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AbortCampaign  AbortCampaignRequest
     * @return AbortCampaignResponse
     */
    @Override
    public CompletableFuture<AbortCampaignResponse> abortCampaign(AbortCampaignRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AbortCampaign").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AbortCampaignResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AbortCampaignResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AcceptChat  AcceptChatRequest
     * @return AcceptChatResponse
     */
    @Override
    public CompletableFuture<AcceptChatResponse> acceptChat(AcceptChatRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AcceptChat").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AcceptChatResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AcceptChatResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddBlacklistCallTagging  AddBlacklistCallTaggingRequest
     * @return AddBlacklistCallTaggingResponse
     */
    @Override
    public CompletableFuture<AddBlacklistCallTaggingResponse> addBlacklistCallTagging(AddBlacklistCallTaggingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddBlacklistCallTagging").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddBlacklistCallTaggingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddBlacklistCallTaggingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddCases  AddCasesRequest
     * @return AddCasesResponse
     */
    @Override
    public CompletableFuture<AddCasesResponse> addCases(AddCasesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddCases").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddCasesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddCasesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddNumbersToSkillGroup  AddNumbersToSkillGroupRequest
     * @return AddNumbersToSkillGroupResponse
     */
    @Override
    public CompletableFuture<AddNumbersToSkillGroupResponse> addNumbersToSkillGroup(AddNumbersToSkillGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddNumbersToSkillGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddNumbersToSkillGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddNumbersToSkillGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddPersonalNumbersToUser  AddPersonalNumbersToUserRequest
     * @return AddPersonalNumbersToUserResponse
     */
    @Override
    public CompletableFuture<AddPersonalNumbersToUserResponse> addPersonalNumbersToUser(AddPersonalNumbersToUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddPersonalNumbersToUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddPersonalNumbersToUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddPersonalNumbersToUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddPhoneNumberToSkillGroups  AddPhoneNumberToSkillGroupsRequest
     * @return AddPhoneNumberToSkillGroupsResponse
     */
    @Override
    public CompletableFuture<AddPhoneNumberToSkillGroupsResponse> addPhoneNumberToSkillGroups(AddPhoneNumberToSkillGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddPhoneNumberToSkillGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddPhoneNumberToSkillGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddPhoneNumberToSkillGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddPhoneNumbers  AddPhoneNumbersRequest
     * @return AddPhoneNumbersResponse
     */
    @Override
    public CompletableFuture<AddPhoneNumbersResponse> addPhoneNumbers(AddPhoneNumbersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddPhoneNumbers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddPhoneNumbersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddPhoneNumbersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddSchemaProperty  AddSchemaPropertyRequest
     * @return AddSchemaPropertyResponse
     */
    @Override
    public CompletableFuture<AddSchemaPropertyResponse> addSchemaProperty(AddSchemaPropertyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddSchemaProperty").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddSchemaPropertyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddSchemaPropertyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddSkillGroupsToUser  AddSkillGroupsToUserRequest
     * @return AddSkillGroupsToUserResponse
     */
    @Override
    public CompletableFuture<AddSkillGroupsToUserResponse> addSkillGroupsToUser(AddSkillGroupsToUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddSkillGroupsToUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddSkillGroupsToUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddSkillGroupsToUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddTicketTask  AddTicketTaskRequest
     * @return AddTicketTaskResponse
     */
    @Override
    public CompletableFuture<AddTicketTaskResponse> addTicketTask(AddTicketTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddTicketTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddTicketTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddTicketTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddUsersToSkillGroup  AddUsersToSkillGroupRequest
     * @return AddUsersToSkillGroupResponse
     */
    @Override
    public CompletableFuture<AddUsersToSkillGroupResponse> addUsersToSkillGroup(AddUsersToSkillGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddUsersToSkillGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddUsersToSkillGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddUsersToSkillGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AnalyzeConversation  AnalyzeConversationRequest
     * @return AnalyzeConversationResponse
     */
    @Override
    public CompletableFuture<AnalyzeConversationResponse> analyzeConversation(AnalyzeConversationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AnalyzeConversation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AnalyzeConversationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AnalyzeConversationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AnswerCall  AnswerCallRequest
     * @return AnswerCallResponse
     */
    @Override
    public CompletableFuture<AnswerCallResponse> answerCall(AnswerCallRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AnswerCall").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AnswerCallResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AnswerCallResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AppendCases  AppendCasesRequest
     * @return AppendCasesResponse
     */
    @Override
    public CompletableFuture<AppendCasesResponse> appendCases(AppendCasesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AppendCases").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AppendCasesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AppendCasesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI AssignUsers is deprecated, please use CCC::2020-07-01::ImportRamUsers instead.  * @param request  the request parameters of AssignUsers  AssignUsersRequest
     * @return AssignUsersResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<AssignUsersResponse> assignUsers(AssignUsersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssignUsers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssignUsersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssignUsersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BargeInCall  BargeInCallRequest
     * @return BargeInCallResponse
     */
    @Override
    public CompletableFuture<BargeInCallResponse> bargeInCall(BargeInCallRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BargeInCall").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BargeInCallResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BargeInCallResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BlindTransfer  BlindTransferRequest
     * @return BlindTransferResponse
     */
    @Override
    public CompletableFuture<BlindTransferResponse> blindTransfer(BlindTransferRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BlindTransfer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BlindTransferResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BlindTransferResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BridgeRtcCall  BridgeRtcCallRequest
     * @return BridgeRtcCallResponse
     */
    @Override
    public CompletableFuture<BridgeRtcCallResponse> bridgeRtcCall(BridgeRtcCallRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BridgeRtcCall").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BridgeRtcCallResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BridgeRtcCallResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CancelAttendedTransfer  CancelAttendedTransferRequest
     * @return CancelAttendedTransferResponse
     */
    @Override
    public CompletableFuture<CancelAttendedTransferResponse> cancelAttendedTransfer(CancelAttendedTransferRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelAttendedTransfer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelAttendedTransferResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelAttendedTransferResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChangeVisibility  ChangeVisibilityRequest
     * @return ChangeVisibilityResponse
     */
    @Override
    public CompletableFuture<ChangeVisibilityResponse> changeVisibility(ChangeVisibilityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChangeVisibility").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeVisibilityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeVisibilityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChangeWorkMode  ChangeWorkModeRequest
     * @return ChangeWorkModeResponse
     */
    @Override
    public CompletableFuture<ChangeWorkModeResponse> changeWorkMode(ChangeWorkModeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChangeWorkMode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeWorkModeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeWorkModeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ClaimChat  ClaimChatRequest
     * @return ClaimChatResponse
     */
    @Override
    public CompletableFuture<ClaimChatResponse> claimChat(ClaimChatRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ClaimChat").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ClaimChatResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ClaimChatResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CoachCall  CoachCallRequest
     * @return CoachCallResponse
     */
    @Override
    public CompletableFuture<CoachCallResponse> coachCall(CoachCallRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CoachCall").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CoachCallResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CoachCallResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CommitContactFlow  CommitContactFlowRequest
     * @return CommitContactFlowResponse
     */
    @Override
    public CompletableFuture<CommitContactFlowResponse> commitContactFlow(CommitContactFlowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CommitContactFlow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CommitContactFlowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CommitContactFlowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CompleteAttendedTransfer  CompleteAttendedTransferRequest
     * @return CompleteAttendedTransferResponse
     */
    @Override
    public CompletableFuture<CompleteAttendedTransferResponse> completeAttendedTransfer(CompleteAttendedTransferRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CompleteAttendedTransfer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CompleteAttendedTransferResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CompleteAttendedTransferResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAudioFile  CreateAudioFileRequest
     * @return CreateAudioFileResponse
     */
    @Override
    public CompletableFuture<CreateAudioFileResponse> createAudioFile(CreateAudioFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAudioFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAudioFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAudioFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateCallTags  CreateCallTagsRequest
     * @return CreateCallTagsResponse
     */
    @Override
    public CompletableFuture<CreateCallTagsResponse> createCallTags(CreateCallTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCallTags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCallTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCallTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateCampaign  CreateCampaignRequest
     * @return CreateCampaignResponse
     */
    @Override
    public CompletableFuture<CreateCampaignResponse> createCampaign(CreateCampaignRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCampaign").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCampaignResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCampaignResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateContactFlow  CreateContactFlowRequest
     * @return CreateContactFlowResponse
     */
    @Override
    public CompletableFuture<CreateContactFlowResponse> createContactFlow(CreateContactFlowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateContactFlow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateContactFlowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateContactFlowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI CreateCustomCallTagging is deprecated, please use CCC::2020-07-01::CreateCustomCallTaggings instead.  * @param request  the request parameters of CreateCustomCallTagging  CreateCustomCallTaggingRequest
     * @return CreateCustomCallTaggingResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<CreateCustomCallTaggingResponse> createCustomCallTagging(CreateCustomCallTaggingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCustomCallTagging").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCustomCallTaggingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCustomCallTaggingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    @Override
    public CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSchema  CreateSchemaRequest
     * @return CreateSchemaResponse
     */
    @Override
    public CompletableFuture<CreateSchemaResponse> createSchema(CreateSchemaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSchema").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSchemaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSchemaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSkillGroup  CreateSkillGroupRequest
     * @return CreateSkillGroupResponse
     */
    @Override
    public CompletableFuture<CreateSkillGroupResponse> createSkillGroup(CreateSkillGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSkillGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSkillGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSkillGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateTicket  CreateTicketRequest
     * @return CreateTicketResponse
     */
    @Override
    public CompletableFuture<CreateTicketResponse> createTicket(CreateTicketRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTicket").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTicketResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTicketResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateUser  CreateUserRequest
     * @return CreateUserResponse
     */
    @Override
    public CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteAudioFile  DeleteAudioFileRequest
     * @return DeleteAudioFileResponse
     */
    @Override
    public CompletableFuture<DeleteAudioFileResponse> deleteAudioFile(DeleteAudioFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAudioFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAudioFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAudioFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteCallTag  DeleteCallTagRequest
     * @return DeleteCallTagResponse
     */
    @Override
    public CompletableFuture<DeleteCallTagResponse> deleteCallTag(DeleteCallTagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCallTag").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCallTagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCallTagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteContactFlow  DeleteContactFlowRequest
     * @return DeleteContactFlowResponse
     */
    @Override
    public CompletableFuture<DeleteContactFlowResponse> deleteContactFlow(DeleteContactFlowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteContactFlow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteContactFlowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteContactFlowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteCustomCallTagging  DeleteCustomCallTaggingRequest
     * @return DeleteCustomCallTaggingResponse
     */
    @Override
    public CompletableFuture<DeleteCustomCallTaggingResponse> deleteCustomCallTagging(DeleteCustomCallTaggingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCustomCallTagging").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCustomCallTaggingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCustomCallTaggingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDocument  DeleteDocumentRequest
     * @return DeleteDocumentResponse
     */
    @Override
    public CompletableFuture<DeleteDocumentResponse> deleteDocument(DeleteDocumentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDocument").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDocumentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDocumentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDocuments  DeleteDocumentsRequest
     * @return DeleteDocumentsResponse
     */
    @Override
    public CompletableFuture<DeleteDocumentsResponse> deleteDocuments(DeleteDocumentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDocuments").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDocumentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDocumentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSchema  DeleteSchemaRequest
     * @return DeleteSchemaResponse
     */
    @Override
    public CompletableFuture<DeleteSchemaResponse> deleteSchema(DeleteSchemaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSchema").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSchemaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSchemaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSchemaProperty  DeleteSchemaPropertyRequest
     * @return DeleteSchemaPropertyResponse
     */
    @Override
    public CompletableFuture<DeleteSchemaPropertyResponse> deleteSchemaProperty(DeleteSchemaPropertyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSchemaProperty").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSchemaPropertyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSchemaPropertyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSkillGroup  DeleteSkillGroupRequest
     * @return DeleteSkillGroupResponse
     */
    @Override
    public CompletableFuture<DeleteSkillGroupResponse> deleteSkillGroup(DeleteSkillGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSkillGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSkillGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSkillGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteTicket  DeleteTicketRequest
     * @return DeleteTicketResponse
     */
    @Override
    public CompletableFuture<DeleteTicketResponse> deleteTicket(DeleteTicketRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTicket").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTicketResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTicketResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteTicketTemplate  DeleteTicketTemplateRequest
     * @return DeleteTicketTemplateResponse
     */
    @Override
    public CompletableFuture<DeleteTicketTemplateResponse> deleteTicketTemplate(DeleteTicketTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTicketTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTicketTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTicketTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisableSchemaProperty  DisableSchemaPropertyRequest
     * @return DisableSchemaPropertyResponse
     */
    @Override
    public CompletableFuture<DisableSchemaPropertyResponse> disableSchemaProperty(DisableSchemaPropertyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableSchemaProperty").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableSchemaPropertyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableSchemaPropertyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisableTicketTemplate  DisableTicketTemplateRequest
     * @return DisableTicketTemplateResponse
     */
    @Override
    public CompletableFuture<DisableTicketTemplateResponse> disableTicketTemplate(DisableTicketTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableTicketTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableTicketTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableTicketTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DiscardEditingContactFlow  DiscardEditingContactFlowRequest
     * @return DiscardEditingContactFlowResponse
     */
    @Override
    public CompletableFuture<DiscardEditingContactFlowResponse> discardEditingContactFlow(DiscardEditingContactFlowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DiscardEditingContactFlow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DiscardEditingContactFlowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DiscardEditingContactFlowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnableSchemaProperty  EnableSchemaPropertyRequest
     * @return EnableSchemaPropertyResponse
     */
    @Override
    public CompletableFuture<EnableSchemaPropertyResponse> enableSchemaProperty(EnableSchemaPropertyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableSchemaProperty").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableSchemaPropertyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableSchemaPropertyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnableTicketTemplate  EnableTicketTemplateRequest
     * @return EnableTicketTemplateResponse
     */
    @Override
    public CompletableFuture<EnableTicketTemplateResponse> enableTicketTemplate(EnableTicketTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableTicketTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableTicketTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableTicketTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EndConference  EndConferenceRequest
     * @return EndConferenceResponse
     */
    @Override
    public CompletableFuture<EndConferenceResponse> endConference(EndConferenceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EndConference").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EndConferenceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EndConferenceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI ExportCustomCallTagging is deprecated, please use CCC::2020-07-01::ExportCustomCallTaggings instead.  * @param request  the request parameters of ExportCustomCallTagging  ExportCustomCallTaggingRequest
     * @return ExportCustomCallTaggingResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<ExportCustomCallTaggingResponse> exportCustomCallTagging(ExportCustomCallTaggingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ExportCustomCallTagging").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExportCustomCallTaggingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExportCustomCallTaggingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExportDoNotCallNumbers  ExportDoNotCallNumbersRequest
     * @return ExportDoNotCallNumbersResponse
     */
    @Override
    public CompletableFuture<ExportDoNotCallNumbersResponse> exportDoNotCallNumbers(ExportDoNotCallNumbersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ExportDoNotCallNumbers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExportDoNotCallNumbersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExportDoNotCallNumbersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FinishTicketTask  FinishTicketTaskRequest
     * @return FinishTicketTaskResponse
     */
    @Override
    public CompletableFuture<FinishTicketTaskResponse> finishTicketTask(FinishTicketTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FinishTicketTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FinishTicketTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FinishTicketTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAccessChannelOfStaging  GetAccessChannelOfStagingRequest
     * @return GetAccessChannelOfStagingResponse
     */
    @Override
    public CompletableFuture<GetAccessChannelOfStagingResponse> getAccessChannelOfStaging(GetAccessChannelOfStagingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAccessChannelOfStaging").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAccessChannelOfStagingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAccessChannelOfStagingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAudioFile  GetAudioFileRequest
     * @return GetAudioFileResponse
     */
    @Override
    public CompletableFuture<GetAudioFileResponse> getAudioFile(GetAudioFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAudioFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAudioFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAudioFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAudioFileDownloadUrl  GetAudioFileDownloadUrlRequest
     * @return GetAudioFileDownloadUrlResponse
     */
    @Override
    public CompletableFuture<GetAudioFileDownloadUrlResponse> getAudioFileDownloadUrl(GetAudioFileDownloadUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAudioFileDownloadUrl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAudioFileDownloadUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAudioFileDownloadUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAudioFileUploadParameters  GetAudioFileUploadParametersRequest
     * @return GetAudioFileUploadParametersResponse
     */
    @Override
    public CompletableFuture<GetAudioFileUploadParametersResponse> getAudioFileUploadParameters(GetAudioFileUploadParametersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAudioFileUploadParameters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAudioFileUploadParametersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAudioFileUploadParametersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCallDetailRecord  GetCallDetailRecordRequest
     * @return GetCallDetailRecordResponse
     */
    @Override
    public CompletableFuture<GetCallDetailRecordResponse> getCallDetailRecord(GetCallDetailRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCallDetailRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCallDetailRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCallDetailRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCampaign  GetCampaignRequest
     * @return GetCampaignResponse
     */
    @Override
    public CompletableFuture<GetCampaignResponse> getCampaign(GetCampaignRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCampaign").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCampaignResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCampaignResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCaseFileUploadUrl  GetCaseFileUploadUrlRequest
     * @return GetCaseFileUploadUrlResponse
     */
    @Override
    public CompletableFuture<GetCaseFileUploadUrlResponse> getCaseFileUploadUrl(GetCaseFileUploadUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCaseFileUploadUrl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCaseFileUploadUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCaseFileUploadUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetChatMediaUrl  GetChatMediaUrlRequest
     * @return GetChatMediaUrlResponse
     */
    @Override
    public CompletableFuture<GetChatMediaUrlResponse> getChatMediaUrl(GetChatMediaUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetChatMediaUrl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetChatMediaUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetChatMediaUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetChatRoutingProfile  GetChatRoutingProfileRequest
     * @return GetChatRoutingProfileResponse
     */
    @Override
    public CompletableFuture<GetChatRoutingProfileResponse> getChatRoutingProfile(GetChatRoutingProfileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetChatRoutingProfile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetChatRoutingProfileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetChatRoutingProfileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetContactFlow  GetContactFlowRequest
     * @return GetContactFlowResponse
     */
    @Override
    public CompletableFuture<GetContactFlowResponse> getContactFlow(GetContactFlowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetContactFlow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetContactFlowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetContactFlowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetConversationDetail  GetConversationDetailRequest
     * @return GetConversationDetailResponse
     */
    @Override
    public CompletableFuture<GetConversationDetailResponse> getConversationDetail(GetConversationDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetConversationDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetConversationDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetConversationDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDataChannelCredentials  GetDataChannelCredentialsRequest
     * @return GetDataChannelCredentialsResponse
     */
    @Override
    public CompletableFuture<GetDataChannelCredentialsResponse> getDataChannelCredentials(GetDataChannelCredentialsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDataChannelCredentials").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDataChannelCredentialsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDataChannelCredentialsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDoNotCallFileUploadParameters  GetDoNotCallFileUploadParametersRequest
     * @return GetDoNotCallFileUploadParametersResponse
     */
    @Override
    public CompletableFuture<GetDoNotCallFileUploadParametersResponse> getDoNotCallFileUploadParameters(GetDoNotCallFileUploadParametersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDoNotCallFileUploadParameters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDoNotCallFileUploadParametersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDoNotCallFileUploadParametersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDocumentUploadParameters  GetDocumentUploadParametersRequest
     * @return GetDocumentUploadParametersResponse
     */
    @Override
    public CompletableFuture<GetDocumentUploadParametersResponse> getDocumentUploadParameters(GetDocumentUploadParametersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDocumentUploadParameters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDocumentUploadParametersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDocumentUploadParametersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetEarlyMediaRecording  GetEarlyMediaRecordingRequest
     * @return GetEarlyMediaRecordingResponse
     */
    @Override
    public CompletableFuture<GetEarlyMediaRecordingResponse> getEarlyMediaRecording(GetEarlyMediaRecordingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetEarlyMediaRecording").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetEarlyMediaRecordingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetEarlyMediaRecordingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHistoricalCallerReport  GetHistoricalCallerReportRequest
     * @return GetHistoricalCallerReportResponse
     */
    @Override
    public CompletableFuture<GetHistoricalCallerReportResponse> getHistoricalCallerReport(GetHistoricalCallerReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetHistoricalCallerReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHistoricalCallerReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHistoricalCallerReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHistoricalCampaignReport  GetHistoricalCampaignReportRequest
     * @return GetHistoricalCampaignReportResponse
     */
    @Override
    public CompletableFuture<GetHistoricalCampaignReportResponse> getHistoricalCampaignReport(GetHistoricalCampaignReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetHistoricalCampaignReport").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHistoricalCampaignReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHistoricalCampaignReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHistoricalInstanceReport  GetHistoricalInstanceReportRequest
     * @return GetHistoricalInstanceReportResponse
     */
    @Override
    public CompletableFuture<GetHistoricalInstanceReportResponse> getHistoricalInstanceReport(GetHistoricalInstanceReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetHistoricalInstanceReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHistoricalInstanceReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHistoricalInstanceReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetInstance  GetInstanceRequest
     * @return GetInstanceResponse
     */
    @Override
    public CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetInstanceTrendingReport  GetInstanceTrendingReportRequest
     * @return GetInstanceTrendingReportResponse
     */
    @Override
    public CompletableFuture<GetInstanceTrendingReportResponse> getInstanceTrendingReport(GetInstanceTrendingReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetInstanceTrendingReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceTrendingReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceTrendingReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetIvrTrackingSummary  GetIvrTrackingSummaryRequest
     * @return GetIvrTrackingSummaryResponse
     */
    @Override
    public CompletableFuture<GetIvrTrackingSummaryResponse> getIvrTrackingSummary(GetIvrTrackingSummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetIvrTrackingSummary").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetIvrTrackingSummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetIvrTrackingSummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLoginDetails  GetLoginDetailsRequest
     * @return GetLoginDetailsResponse
     */
    @Override
    public CompletableFuture<GetLoginDetailsResponse> getLoginDetails(GetLoginDetailsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetLoginDetails").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLoginDetailsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLoginDetailsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMonoRecording  GetMonoRecordingRequest
     * @return GetMonoRecordingResponse
     */
    @Override
    public CompletableFuture<GetMonoRecordingResponse> getMonoRecording(GetMonoRecordingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMonoRecording").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMonoRecordingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMonoRecordingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMultiChannelRecording  GetMultiChannelRecordingRequest
     * @return GetMultiChannelRecordingResponse
     */
    @Override
    public CompletableFuture<GetMultiChannelRecordingResponse> getMultiChannelRecording(GetMultiChannelRecordingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMultiChannelRecording").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMultiChannelRecordingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMultiChannelRecordingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetNumberLocation  GetNumberLocationRequest
     * @return GetNumberLocationResponse
     */
    @Override
    public CompletableFuture<GetNumberLocationResponse> getNumberLocation(GetNumberLocationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetNumberLocation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetNumberLocationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetNumberLocationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetRealtimeCampaignStats  GetRealtimeCampaignStatsRequest
     * @return GetRealtimeCampaignStatsResponse
     */
    @Override
    public CompletableFuture<GetRealtimeCampaignStatsResponse> getRealtimeCampaignStats(GetRealtimeCampaignStatsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetRealtimeCampaignStats").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRealtimeCampaignStatsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRealtimeCampaignStatsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetRealtimeInstanceStates  GetRealtimeInstanceStatesRequest
     * @return GetRealtimeInstanceStatesResponse
     */
    @Override
    public CompletableFuture<GetRealtimeInstanceStatesResponse> getRealtimeInstanceStates(GetRealtimeInstanceStatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetRealtimeInstanceStates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRealtimeInstanceStatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRealtimeInstanceStatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSchema  GetSchemaRequest
     * @return GetSchemaResponse
     */
    @Override
    public CompletableFuture<GetSchemaResponse> getSchema(GetSchemaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSchema").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSchemaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSchemaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSkillGroup  GetSkillGroupRequest
     * @return GetSkillGroupResponse
     */
    @Override
    public CompletableFuture<GetSkillGroupResponse> getSkillGroup(GetSkillGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSkillGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSkillGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSkillGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTicket  GetTicketRequest
     * @return GetTicketResponse
     */
    @Override
    public CompletableFuture<GetTicketResponse> getTicket(GetTicketRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTicket").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTicketResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTicketResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTicketSummaryReport  GetTicketSummaryReportRequest
     * @return GetTicketSummaryReportResponse
     */
    @Override
    public CompletableFuture<GetTicketSummaryReportResponse> getTicketSummaryReport(GetTicketSummaryReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTicketSummaryReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTicketSummaryReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTicketSummaryReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTicketTemplate  GetTicketTemplateRequest
     * @return GetTicketTemplateResponse
     */
    @Override
    public CompletableFuture<GetTicketTemplateResponse> getTicketTemplate(GetTicketTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTicketTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTicketTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTicketTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTurnCredentials  GetTurnCredentialsRequest
     * @return GetTurnCredentialsResponse
     */
    @Override
    public CompletableFuture<GetTurnCredentialsResponse> getTurnCredentials(GetTurnCredentialsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTurnCredentials").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTurnCredentialsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTurnCredentialsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTurnServerList  GetTurnServerListRequest
     * @return GetTurnServerListResponse
     */
    @Override
    public CompletableFuture<GetTurnServerListResponse> getTurnServerList(GetTurnServerListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTurnServerList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTurnServerListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTurnServerListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetUploadAudioDataParams  GetUploadAudioDataParamsRequest
     * @return GetUploadAudioDataParamsResponse
     */
    @Override
    public CompletableFuture<GetUploadAudioDataParamsResponse> getUploadAudioDataParams(GetUploadAudioDataParamsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetUploadAudioDataParams").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUploadAudioDataParamsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUploadAudioDataParamsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetUser  GetUserRequest
     * @return GetUserResponse
     */
    @Override
    public CompletableFuture<GetUserResponse> getUser(GetUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetVideo  GetVideoRequest
     * @return GetVideoResponse
     */
    @Override
    public CompletableFuture<GetVideoResponse> getVideo(GetVideoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetVideo").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVideoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVideoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetVisitorLoginDetails  GetVisitorLoginDetailsRequest
     * @return GetVisitorLoginDetailsResponse
     */
    @Override
    public CompletableFuture<GetVisitorLoginDetailsResponse> getVisitorLoginDetails(GetVisitorLoginDetailsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetVisitorLoginDetails").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVisitorLoginDetailsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVisitorLoginDetailsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetVoicemailRecording  GetVoicemailRecordingRequest
     * @return GetVoicemailRecordingResponse
     */
    @Override
    public CompletableFuture<GetVoicemailRecordingResponse> getVoicemailRecording(GetVoicemailRecordingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetVoicemailRecording").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVoicemailRecordingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVoicemailRecordingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of HoldCall  HoldCallRequest
     * @return HoldCallResponse
     */
    @Override
    public CompletableFuture<HoldCallResponse> holdCall(HoldCallRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("HoldCall").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(HoldCallResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<HoldCallResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ImportAdmins  ImportAdminsRequest
     * @return ImportAdminsResponse
     */
    @Override
    public CompletableFuture<ImportAdminsResponse> importAdmins(ImportAdminsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ImportAdmins").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ImportAdminsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ImportAdminsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ImportCorpNumbers  ImportCorpNumbersRequest
     * @return ImportCorpNumbersResponse
     */
    @Override
    public CompletableFuture<ImportCorpNumbersResponse> importCorpNumbers(ImportCorpNumbersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ImportCorpNumbers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ImportCorpNumbersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ImportCorpNumbersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI ImportCustomCallTagging is deprecated, please use CCC::2020-07-01::ImportCustomCallTaggings instead.  * @param request  the request parameters of ImportCustomCallTagging  ImportCustomCallTaggingRequest
     * @return ImportCustomCallTaggingResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<ImportCustomCallTaggingResponse> importCustomCallTagging(ImportCustomCallTaggingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ImportCustomCallTagging").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ImportCustomCallTaggingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ImportCustomCallTaggingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ImportDoNotCallNumbers  ImportDoNotCallNumbersRequest
     * @return ImportDoNotCallNumbersResponse
     */
    @Override
    public CompletableFuture<ImportDoNotCallNumbersResponse> importDoNotCallNumbers(ImportDoNotCallNumbersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ImportDoNotCallNumbers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ImportDoNotCallNumbersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ImportDoNotCallNumbersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ImportDocuments  ImportDocumentsRequest
     * @return ImportDocumentsResponse
     */
    @Override
    public CompletableFuture<ImportDocumentsResponse> importDocuments(ImportDocumentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ImportDocuments").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ImportDocumentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ImportDocumentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InitiateAttendedTransfer  InitiateAttendedTransferRequest
     * @return InitiateAttendedTransferResponse
     */
    @Override
    public CompletableFuture<InitiateAttendedTransferResponse> initiateAttendedTransfer(InitiateAttendedTransferRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InitiateAttendedTransfer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InitiateAttendedTransferResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InitiateAttendedTransferResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InterceptCall  InterceptCallRequest
     * @return InterceptCallResponse
     */
    @Override
    public CompletableFuture<InterceptCallResponse> interceptCall(InterceptCallRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InterceptCall").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InterceptCallResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InterceptCallResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of LaunchAuthentication  LaunchAuthenticationRequest
     * @return LaunchAuthenticationResponse
     */
    @Override
    public CompletableFuture<LaunchAuthenticationResponse> launchAuthentication(LaunchAuthenticationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("LaunchAuthentication").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(LaunchAuthenticationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<LaunchAuthenticationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of LaunchSurvey  LaunchSurveyRequest
     * @return LaunchSurveyResponse
     */
    @Override
    public CompletableFuture<LaunchSurveyResponse> launchSurvey(LaunchSurveyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("LaunchSurvey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(LaunchSurveyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<LaunchSurveyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAgentStateLogs  ListAgentStateLogsRequest
     * @return ListAgentStateLogsResponse
     */
    @Override
    public CompletableFuture<ListAgentStateLogsResponse> listAgentStateLogs(ListAgentStateLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAgentStateLogs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAgentStateLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAgentStateLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI ListAgentStates is deprecated, please use CCC::2020-07-01::ListRealtimeAgentStates instead.  * @param request  the request parameters of ListAgentStates  ListAgentStatesRequest
     * @return ListAgentStatesResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<ListAgentStatesResponse> listAgentStates(ListAgentStatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAgentStates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAgentStatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAgentStatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI ListAgentSummaryReportsSinceMidnight is deprecated, please use CCC::2020-07-01::ListHistoricalAgentReport instead.  * @param request  the request parameters of ListAgentSummaryReportsSinceMidnight  ListAgentSummaryReportsSinceMidnightRequest
     * @return ListAgentSummaryReportsSinceMidnightResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<ListAgentSummaryReportsSinceMidnightResponse> listAgentSummaryReportsSinceMidnight(ListAgentSummaryReportsSinceMidnightRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAgentSummaryReportsSinceMidnight").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAgentSummaryReportsSinceMidnightResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAgentSummaryReportsSinceMidnightResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAttempts  ListAttemptsRequest
     * @return ListAttemptsResponse
     */
    @Override
    public CompletableFuture<ListAttemptsResponse> listAttempts(ListAttemptsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAttempts").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAttemptsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAttemptsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAudioFiles  ListAudioFilesRequest
     * @return ListAudioFilesResponse
     */
    @Override
    public CompletableFuture<ListAudioFilesResponse> listAudioFiles(ListAudioFilesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAudioFiles").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAudioFilesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAudioFilesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListBlacklistCallTaggings  ListBlacklistCallTaggingsRequest
     * @return ListBlacklistCallTaggingsResponse
     */
    @Override
    public CompletableFuture<ListBlacklistCallTaggingsResponse> listBlacklistCallTaggings(ListBlacklistCallTaggingsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListBlacklistCallTaggings").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListBlacklistCallTaggingsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListBlacklistCallTaggingsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListBriefSkillGroups  ListBriefSkillGroupsRequest
     * @return ListBriefSkillGroupsResponse
     */
    @Override
    public CompletableFuture<ListBriefSkillGroupsResponse> listBriefSkillGroups(ListBriefSkillGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListBriefSkillGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListBriefSkillGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListBriefSkillGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCallDetailRecords  ListCallDetailRecordsRequest
     * @return ListCallDetailRecordsResponse
     */
    @Override
    public CompletableFuture<ListCallDetailRecordsResponse> listCallDetailRecords(ListCallDetailRecordsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCallDetailRecords").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCallDetailRecordsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCallDetailRecordsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCallDetailRecordsV2  ListCallDetailRecordsV2Request
     * @return ListCallDetailRecordsV2Response
     */
    @Override
    public CompletableFuture<ListCallDetailRecordsV2Response> listCallDetailRecordsV2(ListCallDetailRecordsV2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCallDetailRecordsV2").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCallDetailRecordsV2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCallDetailRecordsV2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCallSummaries  ListCallSummariesRequest
     * @return ListCallSummariesResponse
     */
    @Override
    public CompletableFuture<ListCallSummariesResponse> listCallSummaries(ListCallSummariesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCallSummaries").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCallSummariesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCallSummariesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCallTags  ListCallTagsRequest
     * @return ListCallTagsResponse
     */
    @Override
    public CompletableFuture<ListCallTagsResponse> listCallTags(ListCallTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCallTags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCallTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCallTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCampaignTrendingReport  ListCampaignTrendingReportRequest
     * @return ListCampaignTrendingReportResponse
     */
    @Override
    public CompletableFuture<ListCampaignTrendingReportResponse> listCampaignTrendingReport(ListCampaignTrendingReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCampaignTrendingReport").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCampaignTrendingReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCampaignTrendingReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCampaigns  ListCampaignsRequest
     * @return ListCampaignsResponse
     */
    @Override
    public CompletableFuture<ListCampaignsResponse> listCampaigns(ListCampaignsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCampaigns").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCampaignsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCampaignsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCases  ListCasesRequest
     * @return ListCasesResponse
     */
    @Override
    public CompletableFuture<ListCasesResponse> listCases(ListCasesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCases").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCasesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCasesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCategories  ListCategoriesRequest
     * @return ListCategoriesResponse
     */
    @Override
    public CompletableFuture<ListCategoriesResponse> listCategories(ListCategoriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCategories").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCategoriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCategoriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCommonTicketFields  ListCommonTicketFieldsRequest
     * @return ListCommonTicketFieldsResponse
     */
    @Override
    public CompletableFuture<ListCommonTicketFieldsResponse> listCommonTicketFields(ListCommonTicketFieldsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCommonTicketFields").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCommonTicketFieldsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCommonTicketFieldsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListConfigItems  ListConfigItemsRequest
     * @return ListConfigItemsResponse
     */
    @Override
    public CompletableFuture<ListConfigItemsResponse> listConfigItems(ListConfigItemsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListConfigItems").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListConfigItemsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListConfigItemsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListContactFlows  ListContactFlowsRequest
     * @return ListContactFlowsResponse
     */
    @Override
    public CompletableFuture<ListContactFlowsResponse> listContactFlows(ListContactFlowsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListContactFlows").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListContactFlowsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListContactFlowsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI ListCustomCallTagging is deprecated, please use CCC::2020-07-01::ListCustomCallTaggings instead.  * @param request  the request parameters of ListCustomCallTagging  ListCustomCallTaggingRequest
     * @return ListCustomCallTaggingResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<ListCustomCallTaggingResponse> listCustomCallTagging(ListCustomCallTaggingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCustomCallTagging").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCustomCallTaggingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCustomCallTaggingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDevices  ListDevicesRequest
     * @return ListDevicesResponse
     */
    @Override
    public CompletableFuture<ListDevicesResponse> listDevices(ListDevicesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDevices").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDevicesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDevicesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDoNotCallNumbers  ListDoNotCallNumbersRequest
     * @return ListDoNotCallNumbersResponse
     */
    @Override
    public CompletableFuture<ListDoNotCallNumbersResponse> listDoNotCallNumbers(ListDoNotCallNumbersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDoNotCallNumbers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDoNotCallNumbersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDoNotCallNumbersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDocuments  ListDocumentsRequest
     * @return ListDocumentsResponse
     */
    @Override
    public CompletableFuture<ListDocumentsResponse> listDocuments(ListDocumentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDocuments").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDocumentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDocumentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFlashSmsApplications  ListFlashSmsApplicationsRequest
     * @return ListFlashSmsApplicationsResponse
     */
    @Override
    public CompletableFuture<ListFlashSmsApplicationsResponse> listFlashSmsApplications(ListFlashSmsApplicationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListFlashSmsApplications").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFlashSmsApplicationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFlashSmsApplicationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFlashSmsTemplates  ListFlashSmsTemplatesRequest
     * @return ListFlashSmsTemplatesResponse
     */
    @Override
    public CompletableFuture<ListFlashSmsTemplatesResponse> listFlashSmsTemplates(ListFlashSmsTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListFlashSmsTemplates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFlashSmsTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFlashSmsTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListGroupChatMessages  ListGroupChatMessagesRequest
     * @return ListGroupChatMessagesResponse
     */
    @Override
    public CompletableFuture<ListGroupChatMessagesResponse> listGroupChatMessages(ListGroupChatMessagesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListGroupChatMessages").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListGroupChatMessagesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListGroupChatMessagesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListHistoricalAgentReport  ListHistoricalAgentReportRequest
     * @return ListHistoricalAgentReportResponse
     */
    @Override
    public CompletableFuture<ListHistoricalAgentReportResponse> listHistoricalAgentReport(ListHistoricalAgentReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListHistoricalAgentReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListHistoricalAgentReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListHistoricalAgentReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListHistoricalAgentSkillGroupReport  ListHistoricalAgentSkillGroupReportRequest
     * @return ListHistoricalAgentSkillGroupReportResponse
     */
    @Override
    public CompletableFuture<ListHistoricalAgentSkillGroupReportResponse> listHistoricalAgentSkillGroupReport(ListHistoricalAgentSkillGroupReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListHistoricalAgentSkillGroupReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListHistoricalAgentSkillGroupReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListHistoricalAgentSkillGroupReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListHistoricalSkillGroupReport  ListHistoricalSkillGroupReportRequest
     * @return ListHistoricalSkillGroupReportResponse
     */
    @Override
    public CompletableFuture<ListHistoricalSkillGroupReportResponse> listHistoricalSkillGroupReport(ListHistoricalSkillGroupReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListHistoricalSkillGroupReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListHistoricalSkillGroupReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListHistoricalSkillGroupReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInstances  ListInstancesRequest
     * @return ListInstancesResponse
     */
    @Override
    public CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInstancesOfUser  ListInstancesOfUserRequest
     * @return ListInstancesOfUserResponse
     */
    @Override
    public CompletableFuture<ListInstancesOfUserResponse> listInstancesOfUser(ListInstancesOfUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListInstancesOfUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstancesOfUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstancesOfUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListIntervalAgentReport  ListIntervalAgentReportRequest
     * @return ListIntervalAgentReportResponse
     */
    @Override
    public CompletableFuture<ListIntervalAgentReportResponse> listIntervalAgentReport(ListIntervalAgentReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListIntervalAgentReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListIntervalAgentReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListIntervalAgentReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListIntervalAgentSkillGroupReport  ListIntervalAgentSkillGroupReportRequest
     * @return ListIntervalAgentSkillGroupReportResponse
     */
    @Override
    public CompletableFuture<ListIntervalAgentSkillGroupReportResponse> listIntervalAgentSkillGroupReport(ListIntervalAgentSkillGroupReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListIntervalAgentSkillGroupReport").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListIntervalAgentSkillGroupReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListIntervalAgentSkillGroupReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListIntervalInstanceReport  ListIntervalInstanceReportRequest
     * @return ListIntervalInstanceReportResponse
     */
    @Override
    public CompletableFuture<ListIntervalInstanceReportResponse> listIntervalInstanceReport(ListIntervalInstanceReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListIntervalInstanceReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListIntervalInstanceReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListIntervalInstanceReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListIntervalSkillGroupReport  ListIntervalSkillGroupReportRequest
     * @return ListIntervalSkillGroupReportResponse
     */
    @Override
    public CompletableFuture<ListIntervalSkillGroupReportResponse> listIntervalSkillGroupReport(ListIntervalSkillGroupReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListIntervalSkillGroupReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListIntervalSkillGroupReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListIntervalSkillGroupReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListIvrTrackingDetails  ListIvrTrackingDetailsRequest
     * @return ListIvrTrackingDetailsResponse
     */
    @Override
    public CompletableFuture<ListIvrTrackingDetailsResponse> listIvrTrackingDetails(ListIvrTrackingDetailsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListIvrTrackingDetails").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListIvrTrackingDetailsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListIvrTrackingDetailsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI ListLegacyAgentEventLogs is deprecated, please use CCC::2020-07-01::ListAgentStateLogs instead.  * @param request  the request parameters of ListLegacyAgentEventLogs  ListLegacyAgentEventLogsRequest
     * @return ListLegacyAgentEventLogsResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<ListLegacyAgentEventLogsResponse> listLegacyAgentEventLogs(ListLegacyAgentEventLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListLegacyAgentEventLogs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLegacyAgentEventLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLegacyAgentEventLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI ListLegacyAgentStatusLogs is deprecated, please use CCC::2020-07-01::ListAgentStateLogs instead.  * @param request  the request parameters of ListLegacyAgentStatusLogs  ListLegacyAgentStatusLogsRequest
     * @return ListLegacyAgentStatusLogsResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<ListLegacyAgentStatusLogsResponse> listLegacyAgentStatusLogs(ListLegacyAgentStatusLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListLegacyAgentStatusLogs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLegacyAgentStatusLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLegacyAgentStatusLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListLegacyAppraiseLogs  ListLegacyAppraiseLogsRequest
     * @return ListLegacyAppraiseLogsResponse
     */
    @Override
    public CompletableFuture<ListLegacyAppraiseLogsResponse> listLegacyAppraiseLogs(ListLegacyAppraiseLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListLegacyAppraiseLogs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLegacyAppraiseLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLegacyAppraiseLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListLegacyQueueEventLogs  ListLegacyQueueEventLogsRequest
     * @return ListLegacyQueueEventLogsResponse
     */
    @Override
    public CompletableFuture<ListLegacyQueueEventLogsResponse> listLegacyQueueEventLogs(ListLegacyQueueEventLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListLegacyQueueEventLogs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLegacyQueueEventLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLegacyQueueEventLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMonoRecordings  ListMonoRecordingsRequest
     * @return ListMonoRecordingsResponse
     */
    @Override
    public CompletableFuture<ListMonoRecordingsResponse> listMonoRecordings(ListMonoRecordingsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMonoRecordings").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMonoRecordingsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMonoRecordingsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMultiChannelRecordings  ListMultiChannelRecordingsRequest
     * @return ListMultiChannelRecordingsResponse
     */
    @Override
    public CompletableFuture<ListMultiChannelRecordingsResponse> listMultiChannelRecordings(ListMultiChannelRecordingsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMultiChannelRecordings").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMultiChannelRecordingsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMultiChannelRecordingsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListOutboundNumbersOfUser  ListOutboundNumbersOfUserRequest
     * @return ListOutboundNumbersOfUserResponse
     */
    @Override
    public CompletableFuture<ListOutboundNumbersOfUserResponse> listOutboundNumbersOfUser(ListOutboundNumbersOfUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListOutboundNumbersOfUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListOutboundNumbersOfUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListOutboundNumbersOfUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPersonalNumbersOfUser  ListPersonalNumbersOfUserRequest
     * @return ListPersonalNumbersOfUserResponse
     */
    @Override
    public CompletableFuture<ListPersonalNumbersOfUserResponse> listPersonalNumbersOfUser(ListPersonalNumbersOfUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPersonalNumbersOfUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPersonalNumbersOfUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPersonalNumbersOfUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPhoneNumbers  ListPhoneNumbersRequest
     * @return ListPhoneNumbersResponse
     */
    @Override
    public CompletableFuture<ListPhoneNumbersResponse> listPhoneNumbers(ListPhoneNumbersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPhoneNumbers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPhoneNumbersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPhoneNumbersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPhoneNumbersOfSkillGroup  ListPhoneNumbersOfSkillGroupRequest
     * @return ListPhoneNumbersOfSkillGroupResponse
     */
    @Override
    public CompletableFuture<ListPhoneNumbersOfSkillGroupResponse> listPhoneNumbersOfSkillGroup(ListPhoneNumbersOfSkillGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPhoneNumbersOfSkillGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPhoneNumbersOfSkillGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPhoneNumbersOfSkillGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPrivilegesOfUser  ListPrivilegesOfUserRequest
     * @return ListPrivilegesOfUserResponse
     */
    @Override
    public CompletableFuture<ListPrivilegesOfUserResponse> listPrivilegesOfUser(ListPrivilegesOfUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPrivilegesOfUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPrivilegesOfUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPrivilegesOfUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRamUsers  ListRamUsersRequest
     * @return ListRamUsersResponse
     */
    @Override
    public CompletableFuture<ListRamUsersResponse> listRamUsers(ListRamUsersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListRamUsers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRamUsersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRamUsersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRealtimeAgentStates  ListRealtimeAgentStatesRequest
     * @return ListRealtimeAgentStatesResponse
     */
    @Override
    public CompletableFuture<ListRealtimeAgentStatesResponse> listRealtimeAgentStates(ListRealtimeAgentStatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListRealtimeAgentStates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRealtimeAgentStatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRealtimeAgentStatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRealtimeSkillGroupStates  ListRealtimeSkillGroupStatesRequest
     * @return ListRealtimeSkillGroupStatesResponse
     */
    @Override
    public CompletableFuture<ListRealtimeSkillGroupStatesResponse> listRealtimeSkillGroupStates(ListRealtimeSkillGroupStatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListRealtimeSkillGroupStates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRealtimeSkillGroupStatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRealtimeSkillGroupStatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRecentCallDetailRecords  ListRecentCallDetailRecordsRequest
     * @return ListRecentCallDetailRecordsResponse
     */
    @Override
    public CompletableFuture<ListRecentCallDetailRecordsResponse> listRecentCallDetailRecords(ListRecentCallDetailRecordsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListRecentCallDetailRecords").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRecentCallDetailRecordsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRecentCallDetailRecordsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRoles  ListRolesRequest
     * @return ListRolesResponse
     */
    @Override
    public CompletableFuture<ListRolesResponse> listRoles(ListRolesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListRoles").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRolesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRolesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI ListSkillGroupStates is deprecated, please use CCC::2020-07-01::ListRealtimeSkillGroupStates instead.  * @param request  the request parameters of ListSkillGroupStates  ListSkillGroupStatesRequest
     * @return ListSkillGroupStatesResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<ListSkillGroupStatesResponse> listSkillGroupStates(ListSkillGroupStatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSkillGroupStates").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSkillGroupStatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSkillGroupStatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI ListSkillGroupSummaryReportsSinceMidnight is deprecated, please use CCC::2020-07-01::ListHistoricalSkillGroupReport instead.  * @param request  the request parameters of ListSkillGroupSummaryReportsSinceMidnight  ListSkillGroupSummaryReportsSinceMidnightRequest
     * @return ListSkillGroupSummaryReportsSinceMidnightResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<ListSkillGroupSummaryReportsSinceMidnightResponse> listSkillGroupSummaryReportsSinceMidnight(ListSkillGroupSummaryReportsSinceMidnightRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSkillGroupSummaryReportsSinceMidnight").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSkillGroupSummaryReportsSinceMidnightResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSkillGroupSummaryReportsSinceMidnightResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSkillGroups  ListSkillGroupsRequest
     * @return ListSkillGroupsResponse
     */
    @Override
    public CompletableFuture<ListSkillGroupsResponse> listSkillGroups(ListSkillGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSkillGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSkillGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSkillGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSkillLevelsOfUser  ListSkillLevelsOfUserRequest
     * @return ListSkillLevelsOfUserResponse
     */
    @Override
    public CompletableFuture<ListSkillLevelsOfUserResponse> listSkillLevelsOfUser(ListSkillLevelsOfUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSkillLevelsOfUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSkillLevelsOfUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSkillLevelsOfUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTicketTasks  ListTicketTasksRequest
     * @return ListTicketTasksResponse
     */
    @Override
    public CompletableFuture<ListTicketTasksResponse> listTicketTasks(ListTicketTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTicketTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTicketTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTicketTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTicketTemplates  ListTicketTemplatesRequest
     * @return ListTicketTemplatesResponse
     */
    @Override
    public CompletableFuture<ListTicketTemplatesResponse> listTicketTemplates(ListTicketTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTicketTemplates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTicketTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTicketTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTickets  ListTicketsRequest
     * @return ListTicketsResponse
     */
    @Override
    public CompletableFuture<ListTicketsResponse> listTickets(ListTicketsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTickets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTicketsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTicketsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListUnassignedNumbers  ListUnassignedNumbersRequest
     * @return ListUnassignedNumbersResponse
     */
    @Override
    public CompletableFuture<ListUnassignedNumbersResponse> listUnassignedNumbers(ListUnassignedNumbersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListUnassignedNumbers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUnassignedNumbersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUnassignedNumbersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListUserLevelsOfSkillGroup  ListUserLevelsOfSkillGroupRequest
     * @return ListUserLevelsOfSkillGroupResponse
     */
    @Override
    public CompletableFuture<ListUserLevelsOfSkillGroupResponse> listUserLevelsOfSkillGroup(ListUserLevelsOfSkillGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListUserLevelsOfSkillGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUserLevelsOfSkillGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUserLevelsOfSkillGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListUsers  ListUsersRequest
     * @return ListUsersResponse
     */
    @Override
    public CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListUsers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUsersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUsersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListVoicemails  ListVoicemailsRequest
     * @return ListVoicemailsResponse
     */
    @Override
    public CompletableFuture<ListVoicemailsResponse> listVoicemails(ListVoicemailsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListVoicemails").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVoicemailsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVoicemailsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListWaitingChats  ListWaitingChatsRequest
     * @return ListWaitingChatsResponse
     */
    @Override
    public CompletableFuture<ListWaitingChatsResponse> listWaitingChats(ListWaitingChatsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListWaitingChats").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListWaitingChatsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListWaitingChatsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of MakeCall  MakeCallRequest
     * @return MakeCallResponse
     */
    @Override
    public CompletableFuture<MakeCallResponse> makeCall(MakeCallRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MakeCall").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MakeCallResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MakeCallResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyAudioFile  ModifyAudioFileRequest
     * @return ModifyAudioFileResponse
     */
    @Override
    public CompletableFuture<ModifyAudioFileResponse> modifyAudioFile(ModifyAudioFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAudioFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAudioFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAudioFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyCustomCallTagging  ModifyCustomCallTaggingRequest
     * @return ModifyCustomCallTaggingResponse
     */
    @Override
    public CompletableFuture<ModifyCustomCallTaggingResponse> modifyCustomCallTagging(ModifyCustomCallTaggingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyCustomCallTagging").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyCustomCallTaggingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyCustomCallTaggingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyInstance  ModifyInstanceRequest
     * @return ModifyInstanceResponse
     */
    @Override
    public CompletableFuture<ModifyInstanceResponse> modifyInstance(ModifyInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyPhoneNumber  ModifyPhoneNumberRequest
     * @return ModifyPhoneNumberResponse
     */
    @Override
    public CompletableFuture<ModifyPhoneNumberResponse> modifyPhoneNumber(ModifyPhoneNumberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyPhoneNumber").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyPhoneNumberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyPhoneNumberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifySkillGroup  ModifySkillGroupRequest
     * @return ModifySkillGroupResponse
     */
    @Override
    public CompletableFuture<ModifySkillGroupResponse> modifySkillGroup(ModifySkillGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySkillGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySkillGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySkillGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifySkillLevelsOfUser  ModifySkillLevelsOfUserRequest
     * @return ModifySkillLevelsOfUserResponse
     */
    @Override
    public CompletableFuture<ModifySkillLevelsOfUserResponse> modifySkillLevelsOfUser(ModifySkillLevelsOfUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySkillLevelsOfUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySkillLevelsOfUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySkillLevelsOfUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyUser  ModifyUserRequest
     * @return ModifyUserResponse
     */
    @Override
    public CompletableFuture<ModifyUserResponse> modifyUser(ModifyUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyUserLevelsOfSkillGroup  ModifyUserLevelsOfSkillGroupRequest
     * @return ModifyUserLevelsOfSkillGroupResponse
     */
    @Override
    public CompletableFuture<ModifyUserLevelsOfSkillGroupResponse> modifyUserLevelsOfSkillGroup(ModifyUserLevelsOfSkillGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyUserLevelsOfSkillGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyUserLevelsOfSkillGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyUserLevelsOfSkillGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of MonitorCall  MonitorCallRequest
     * @return MonitorCallResponse
     */
    @Override
    public CompletableFuture<MonitorCallResponse> monitorCall(MonitorCallRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MonitorCall").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MonitorCallResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MonitorCallResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of MuteCall  MuteCallRequest
     * @return MuteCallResponse
     */
    @Override
    public CompletableFuture<MuteCallResponse> muteCall(MuteCallRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MuteCall").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MuteCallResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MuteCallResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PauseCampaign  PauseCampaignRequest
     * @return PauseCampaignResponse
     */
    @Override
    public CompletableFuture<PauseCampaignResponse> pauseCampaign(PauseCampaignRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PauseCampaign").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PauseCampaignResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PauseCampaignResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PickOutboundNumbers  PickOutboundNumbersRequest
     * @return PickOutboundNumbersResponse
     */
    @Override
    public CompletableFuture<PickOutboundNumbersResponse> pickOutboundNumbers(PickOutboundNumbersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PickOutboundNumbers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PickOutboundNumbersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PickOutboundNumbersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PollUserStatus  PollUserStatusRequest
     * @return PollUserStatusResponse
     */
    @Override
    public CompletableFuture<PollUserStatusResponse> pollUserStatus(PollUserStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PollUserStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PollUserStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PollUserStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ProcessAliMeCallbackOfStaging  ProcessAliMeCallbackOfStagingRequest
     * @return ProcessAliMeCallbackOfStagingResponse
     */
    @Override
    public CompletableFuture<ProcessAliMeCallbackOfStagingResponse> processAliMeCallbackOfStaging(ProcessAliMeCallbackOfStagingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ProcessAliMeCallbackOfStaging").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ProcessAliMeCallbackOfStagingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ProcessAliMeCallbackOfStagingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PublishContactFlow  PublishContactFlowRequest
     * @return PublishContactFlowResponse
     */
    @Override
    public CompletableFuture<PublishContactFlowResponse> publishContactFlow(PublishContactFlowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PublishContactFlow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PublishContactFlowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PublishContactFlowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReadyForService  ReadyForServiceRequest
     * @return ReadyForServiceResponse
     */
    @Override
    public CompletableFuture<ReadyForServiceResponse> readyForService(ReadyForServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReadyForService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReadyForServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReadyForServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RedialCall  RedialCallRequest
     * @return RedialCallResponse
     */
    @Override
    public CompletableFuture<RedialCallResponse> redialCall(RedialCallRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RedialCall").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RedialCallResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RedialCallResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RegisterDevice  RegisterDeviceRequest
     * @return RegisterDeviceResponse
     */
    @Override
    public CompletableFuture<RegisterDeviceResponse> registerDevice(RegisterDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RegisterDevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RegisterDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RegisterDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RegisterDevices  RegisterDevicesRequest
     * @return RegisterDevicesResponse
     */
    @Override
    public CompletableFuture<RegisterDevicesResponse> registerDevices(RegisterDevicesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RegisterDevices").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RegisterDevicesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RegisterDevicesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RejectChat  RejectChatRequest
     * @return RejectChatResponse
     */
    @Override
    public CompletableFuture<RejectChatResponse> rejectChat(RejectChatRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RejectChat").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RejectChatResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RejectChatResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RejectTicket  RejectTicketRequest
     * @return RejectTicketResponse
     */
    @Override
    public CompletableFuture<RejectTicketResponse> rejectTicket(RejectTicketRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RejectTicket").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RejectTicketResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RejectTicketResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReleaseCall  ReleaseCallRequest
     * @return ReleaseCallResponse
     */
    @Override
    public CompletableFuture<ReleaseCallResponse> releaseCall(ReleaseCallRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReleaseCall").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReleaseCallResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReleaseCallResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReleaseChat  ReleaseChatRequest
     * @return ReleaseChatResponse
     */
    @Override
    public CompletableFuture<ReleaseChatResponse> releaseChat(ReleaseChatRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReleaseChat").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReleaseChatResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReleaseChatResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveBlacklistCallTagging  RemoveBlacklistCallTaggingRequest
     * @return RemoveBlacklistCallTaggingResponse
     */
    @Override
    public CompletableFuture<RemoveBlacklistCallTaggingResponse> removeBlacklistCallTagging(RemoveBlacklistCallTaggingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveBlacklistCallTagging").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveBlacklistCallTaggingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveBlacklistCallTaggingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveDoNotCallNumbers  RemoveDoNotCallNumbersRequest
     * @return RemoveDoNotCallNumbersResponse
     */
    @Override
    public CompletableFuture<RemoveDoNotCallNumbersResponse> removeDoNotCallNumbers(RemoveDoNotCallNumbersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveDoNotCallNumbers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveDoNotCallNumbersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveDoNotCallNumbersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemovePersonalNumbersFromUser  RemovePersonalNumbersFromUserRequest
     * @return RemovePersonalNumbersFromUserResponse
     */
    @Override
    public CompletableFuture<RemovePersonalNumbersFromUserResponse> removePersonalNumbersFromUser(RemovePersonalNumbersFromUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemovePersonalNumbersFromUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemovePersonalNumbersFromUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemovePersonalNumbersFromUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemovePhoneNumberFromSkillGroups  RemovePhoneNumberFromSkillGroupsRequest
     * @return RemovePhoneNumberFromSkillGroupsResponse
     */
    @Override
    public CompletableFuture<RemovePhoneNumberFromSkillGroupsResponse> removePhoneNumberFromSkillGroups(RemovePhoneNumberFromSkillGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemovePhoneNumberFromSkillGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemovePhoneNumberFromSkillGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemovePhoneNumberFromSkillGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemovePhoneNumbers  RemovePhoneNumbersRequest
     * @return RemovePhoneNumbersResponse
     */
    @Override
    public CompletableFuture<RemovePhoneNumbersResponse> removePhoneNumbers(RemovePhoneNumbersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemovePhoneNumbers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemovePhoneNumbersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemovePhoneNumbersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemovePhoneNumbersFromSkillGroup  RemovePhoneNumbersFromSkillGroupRequest
     * @return RemovePhoneNumbersFromSkillGroupResponse
     */
    @Override
    public CompletableFuture<RemovePhoneNumbersFromSkillGroupResponse> removePhoneNumbersFromSkillGroup(RemovePhoneNumbersFromSkillGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemovePhoneNumbersFromSkillGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemovePhoneNumbersFromSkillGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemovePhoneNumbersFromSkillGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveSkillGroupsFromUser  RemoveSkillGroupsFromUserRequest
     * @return RemoveSkillGroupsFromUserResponse
     */
    @Override
    public CompletableFuture<RemoveSkillGroupsFromUserResponse> removeSkillGroupsFromUser(RemoveSkillGroupsFromUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveSkillGroupsFromUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveSkillGroupsFromUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveSkillGroupsFromUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveUsers  RemoveUsersRequest
     * @return RemoveUsersResponse
     */
    @Override
    public CompletableFuture<RemoveUsersResponse> removeUsers(RemoveUsersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveUsers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveUsersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveUsersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveUsersFromSkillGroup  RemoveUsersFromSkillGroupRequest
     * @return RemoveUsersFromSkillGroupResponse
     */
    @Override
    public CompletableFuture<RemoveUsersFromSkillGroupResponse> removeUsersFromSkillGroup(RemoveUsersFromSkillGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveUsersFromSkillGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveUsersFromSkillGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveUsersFromSkillGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ResetAgentState  ResetAgentStateRequest
     * @return ResetAgentStateResponse
     */
    @Override
    public CompletableFuture<ResetAgentStateResponse> resetAgentState(ResetAgentStateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResetAgentState").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetAgentStateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetAgentStateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ResetUserPassword  ResetUserPasswordRequest
     * @return ResetUserPasswordResponse
     */
    @Override
    public CompletableFuture<ResetUserPasswordResponse> resetUserPassword(ResetUserPasswordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResetUserPassword").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetUserPasswordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetUserPasswordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RestoreArchivedRecordings  RestoreArchivedRecordingsRequest
     * @return RestoreArchivedRecordingsResponse
     */
    @Override
    public CompletableFuture<RestoreArchivedRecordingsResponse> restoreArchivedRecordings(RestoreArchivedRecordingsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RestoreArchivedRecordings").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RestoreArchivedRecordingsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RestoreArchivedRecordingsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ResubmitTicket  ResubmitTicketRequest
     * @return ResubmitTicketResponse
     */
    @Override
    public CompletableFuture<ResubmitTicketResponse> resubmitTicket(ResubmitTicketRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResubmitTicket").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResubmitTicketResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResubmitTicketResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ResumeCampaign  ResumeCampaignRequest
     * @return ResumeCampaignResponse
     */
    @Override
    public CompletableFuture<ResumeCampaignResponse> resumeCampaign(ResumeCampaignRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResumeCampaign").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResumeCampaignResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResumeCampaignResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RetrieveCall  RetrieveCallRequest
     * @return RetrieveCallResponse
     */
    @Override
    public CompletableFuture<RetrieveCallResponse> retrieveCall(RetrieveCallRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RetrieveCall").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RetrieveCallResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RetrieveCallResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveDocument  SaveDocumentRequest
     * @return SaveDocumentResponse
     */
    @Override
    public CompletableFuture<SaveDocumentResponse> saveDocument(SaveDocumentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveDocument").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveDocumentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveDocumentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveRTCStatsV2  SaveRTCStatsV2Request
     * @return SaveRTCStatsV2Response
     */
    @Override
    public CompletableFuture<SaveRTCStatsV2Response> saveRTCStatsV2(SaveRTCStatsV2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveRTCStatsV2").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveRTCStatsV2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveRTCStatsV2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveTerminalLog  SaveTerminalLogRequest
     * @return SaveTerminalLogResponse
     */
    @Override
    public CompletableFuture<SaveTerminalLogResponse> saveTerminalLog(SaveTerminalLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveTerminalLog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveTerminalLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveTerminalLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveWebRTCStats  SaveWebRTCStatsRequest
     * @return SaveWebRTCStatsResponse
     */
    @Override
    public CompletableFuture<SaveWebRTCStatsResponse> saveWebRTCStats(SaveWebRTCStatsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveWebRTCStats").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveWebRTCStatsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveWebRTCStatsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveWebRtcInfo  SaveWebRtcInfoRequest
     * @return SaveWebRtcInfoResponse
     */
    @Override
    public CompletableFuture<SaveWebRtcInfoResponse> saveWebRtcInfo(SaveWebRtcInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveWebRtcInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveWebRtcInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveWebRtcInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SendDtmfSignaling  SendDtmfSignalingRequest
     * @return SendDtmfSignalingResponse
     */
    @Override
    public CompletableFuture<SendDtmfSignalingResponse> sendDtmfSignaling(SendDtmfSignalingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SendDtmfSignaling").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendDtmfSignalingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendDtmfSignalingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SignInGroup  SignInGroupRequest
     * @return SignInGroupResponse
     */
    @Override
    public CompletableFuture<SignInGroupResponse> signInGroup(SignInGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SignInGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SignInGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SignInGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SignOutGroup  SignOutGroupRequest
     * @return SignOutGroupResponse
     */
    @Override
    public CompletableFuture<SignOutGroupResponse> signOutGroup(SignOutGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SignOutGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SignOutGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SignOutGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartBack2BackCall  StartBack2BackCallRequest
     * @return StartBack2BackCallResponse
     */
    @Override
    public CompletableFuture<StartBack2BackCallResponse> startBack2BackCall(StartBack2BackCallRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartBack2BackCall").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartBack2BackCallResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartBack2BackCallResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartChat  StartChatRequest
     * @return StartChatResponse
     */
    @Override
    public CompletableFuture<StartChatResponse> startChat(StartChatRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartChat").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartChatResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartChatResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartConference  StartConferenceRequest
     * @return StartConferenceResponse
     */
    @Override
    public CompletableFuture<StartConferenceResponse> startConference(StartConferenceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartConference").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartConferenceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartConferenceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartEditContactFlow  StartEditContactFlowRequest
     * @return StartEditContactFlowResponse
     */
    @Override
    public CompletableFuture<StartEditContactFlowResponse> startEditContactFlow(StartEditContactFlowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartEditContactFlow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartEditContactFlowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartEditContactFlowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartPredictiveCall  StartPredictiveCallRequest
     * @return StartPredictiveCallResponse
     */
    @Override
    public CompletableFuture<StartPredictiveCallResponse> startPredictiveCall(StartPredictiveCallRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartPredictiveCall").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartPredictiveCallResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartPredictiveCallResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartPrivacyCall  StartPrivacyCallRequest
     * @return StartPrivacyCallResponse
     */
    @Override
    public CompletableFuture<StartPrivacyCallResponse> startPrivacyCall(StartPrivacyCallRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartPrivacyCall").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartPrivacyCallResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartPrivacyCallResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitCampaign  SubmitCampaignRequest
     * @return SubmitCampaignResponse
     */
    @Override
    public CompletableFuture<SubmitCampaignResponse> submitCampaign(SubmitCampaignRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitCampaign").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitCampaignResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitCampaignResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SwitchToConference  SwitchToConferenceRequest
     * @return SwitchToConferenceResponse
     */
    @Override
    public CompletableFuture<SwitchToConferenceResponse> switchToConference(SwitchToConferenceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SwitchToConference").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SwitchToConferenceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SwitchToConferenceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TakeBreak  TakeBreakRequest
     * @return TakeBreakResponse
     */
    @Override
    public CompletableFuture<TakeBreakResponse> takeBreak(TakeBreakRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TakeBreak").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TakeBreakResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TakeBreakResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TerminateTicket  TerminateTicketRequest
     * @return TerminateTicketResponse
     */
    @Override
    public CompletableFuture<TerminateTicketResponse> terminateTicket(TerminateTicketRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TerminateTicket").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TerminateTicketResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TerminateTicketResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TransferTicketTask  TransferTicketTaskRequest
     * @return TransferTicketTaskResponse
     */
    @Override
    public CompletableFuture<TransferTicketTaskResponse> transferTicketTask(TransferTicketTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TransferTicketTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TransferTicketTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TransferTicketTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UnmuteCall  UnmuteCallRequest
     * @return UnmuteCallResponse
     */
    @Override
    public CompletableFuture<UnmuteCallResponse> unmuteCall(UnmuteCallRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnmuteCall").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnmuteCallResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnmuteCallResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UnregisterDevice  UnregisterDeviceRequest
     * @return UnregisterDeviceResponse
     */
    @Override
    public CompletableFuture<UnregisterDeviceResponse> unregisterDevice(UnregisterDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnregisterDevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnregisterDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnregisterDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateCampaign  UpdateCampaignRequest
     * @return UpdateCampaignResponse
     */
    @Override
    public CompletableFuture<UpdateCampaignResponse> updateCampaign(UpdateCampaignRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateCampaign").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCampaignResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCampaignResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateChatRoutingProfile  UpdateChatRoutingProfileRequest
     * @return UpdateChatRoutingProfileResponse
     */
    @Override
    public CompletableFuture<UpdateChatRoutingProfileResponse> updateChatRoutingProfile(UpdateChatRoutingProfileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateChatRoutingProfile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateChatRoutingProfileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateChatRoutingProfileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateConfigItems  UpdateConfigItemsRequest
     * @return UpdateConfigItemsResponse
     */
    @Override
    public CompletableFuture<UpdateConfigItemsResponse> updateConfigItems(UpdateConfigItemsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateConfigItems").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateConfigItemsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateConfigItemsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateSchemaProperty  UpdateSchemaPropertyRequest
     * @return UpdateSchemaPropertyResponse
     */
    @Override
    public CompletableFuture<UpdateSchemaPropertyResponse> updateSchemaProperty(UpdateSchemaPropertyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSchemaProperty").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSchemaPropertyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSchemaPropertyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateTicket  UpdateTicketRequest
     * @return UpdateTicketResponse
     */
    @Override
    public CompletableFuture<UpdateTicketResponse> updateTicket(UpdateTicketRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateTicket").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTicketResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTicketResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of WithdrawTicket  WithdrawTicketRequest
     * @return WithdrawTicketResponse
     */
    @Override
    public CompletableFuture<WithdrawTicketResponse> withdrawTicket(WithdrawTicketRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("WithdrawTicket").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(WithdrawTicketResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<WithdrawTicketResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
