// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.aliding20230426.models.*;
import darabonba.core.sse.SSEHttpResponseHandler;
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
        this.product = "aliding";
        this.version = "2023-04-26";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AddAttendee  AddAttendeeRequest
     * @return AddAttendeeResponse
     */
    @Override
    public CompletableFuture<AddAttendeeResponse> addAttendee(AddAttendeeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddAttendee").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/calendar/addAttendee").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddAttendeeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddAttendeeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddDriveSpace  AddDriveSpaceRequest
     * @return AddDriveSpaceResponse
     */
    @Override
    public CompletableFuture<AddDriveSpaceResponse> addDriveSpace(AddDriveSpaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddDriveSpace").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/addDriveSpace").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddDriveSpaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddDriveSpaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddFolder  AddFolderRequest
     * @return AddFolderResponse
     */
    @Override
    public CompletableFuture<AddFolderResponse> addFolder(AddFolderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddFolder").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/addFolder").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddFolderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddFolderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddMeetingRooms  AddMeetingRoomsRequest
     * @return AddMeetingRoomsResponse
     */
    @Override
    public CompletableFuture<AddMeetingRoomsResponse> addMeetingRooms(AddMeetingRoomsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddMeetingRooms").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/calendar/addMeetingRooms").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddMeetingRoomsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddMeetingRoomsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddMultiDimTable  AddMultiDimTableRequest
     * @return AddMultiDimTableResponse
     */
    @Override
    public CompletableFuture<AddMultiDimTableResponse> addMultiDimTable(AddMultiDimTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddMultiDimTable").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/table/addMultiDimTable").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddMultiDimTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddMultiDimTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddPermission  AddPermissionRequest
     * @return AddPermissionResponse
     */
    @Override
    public CompletableFuture<AddPermissionResponse> addPermission(AddPermissionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddPermission").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/addPermission").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddPermissionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddPermissionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddRecordPermission  AddRecordPermissionRequest
     * @return AddRecordPermissionResponse
     */
    @Override
    public CompletableFuture<AddRecordPermissionResponse> addRecordPermission(AddRecordPermissionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddRecordPermission").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/addRecordPermission").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddRecordPermissionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddRecordPermissionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddScenegroupMember  AddScenegroupMemberRequest
     * @return AddScenegroupMemberResponse
     */
    @Override
    public CompletableFuture<AddScenegroupMemberResponse> addScenegroupMember(AddScenegroupMemberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddScenegroupMember").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/im/addScenegroupMember").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddScenegroupMemberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddScenegroupMemberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddTicketMemo  AddTicketMemoRequest
     * @return AddTicketMemoResponse
     */
    @Override
    public CompletableFuture<AddTicketMemoResponse> addTicketMemo(AddTicketMemoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddTicketMemo").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ticket/addTicketMemo").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddTicketMemoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddTicketMemoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddWorkspace  AddWorkspaceRequest
     * @return AddWorkspaceResponse
     */
    @Override
    public CompletableFuture<AddWorkspaceResponse> addWorkspace(AddWorkspaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddWorkspace").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v2/documents/addWorkspace").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddWorkspaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddWorkspaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddWorkspaceDocMembers  AddWorkspaceDocMembersRequest
     * @return AddWorkspaceDocMembersResponse
     */
    @Override
    public CompletableFuture<AddWorkspaceDocMembersResponse> addWorkspaceDocMembers(AddWorkspaceDocMembersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddWorkspaceDocMembers").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/addWorkspaceDocMembers").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddWorkspaceDocMembersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddWorkspaceDocMembersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddWorkspaceMembers  AddWorkspaceMembersRequest
     * @return AddWorkspaceMembersResponse
     */
    @Override
    public CompletableFuture<AddWorkspaceMembersResponse> addWorkspaceMembers(AddWorkspaceMembersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddWorkspaceMembers").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/addWorkspaceMembers").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddWorkspaceMembersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddWorkspaceMembersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AssignTicket  AssignTicketRequest
     * @return AssignTicketResponse
     */
    @Override
    public CompletableFuture<AssignTicketResponse> assignTicket(AssignTicketRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AssignTicket").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ticket/assignTicket").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssignTicketResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssignTicketResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchGetFormDataByIdList  BatchGetFormDataByIdListRequest
     * @return BatchGetFormDataByIdListResponse
     */
    @Override
    public CompletableFuture<BatchGetFormDataByIdListResponse> batchGetFormDataByIdList(BatchGetFormDataByIdListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BatchGetFormDataByIdList").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/batchGetFormDataByIdList").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchGetFormDataByIdListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchGetFormDataByIdListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchRemovalByFormInstanceIdList  BatchRemovalByFormInstanceIdListRequest
     * @return BatchRemovalByFormInstanceIdListResponse
     */
    @Override
    public CompletableFuture<BatchRemovalByFormInstanceIdListResponse> batchRemovalByFormInstanceIdList(BatchRemovalByFormInstanceIdListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BatchRemovalByFormInstanceIdList").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/batchRemovalByFormInstanceIdList").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchRemovalByFormInstanceIdListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchRemovalByFormInstanceIdListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchSaveFormData  BatchSaveFormDataRequest
     * @return BatchSaveFormDataResponse
     */
    @Override
    public CompletableFuture<BatchSaveFormDataResponse> batchSaveFormData(BatchSaveFormDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BatchSaveFormData").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/batchSaveFormData").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchSaveFormDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchSaveFormDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchUpdateFormDataByInstanceId  BatchUpdateFormDataByInstanceIdRequest
     * @return BatchUpdateFormDataByInstanceIdResponse
     */
    @Override
    public CompletableFuture<BatchUpdateFormDataByInstanceIdResponse> batchUpdateFormDataByInstanceId(BatchUpdateFormDataByInstanceIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BatchUpdateFormDataByInstanceId").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/batchUpdateFormDataByInstanceId").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchUpdateFormDataByInstanceIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchUpdateFormDataByInstanceIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchUpdateFormDataByInstanceMap  BatchUpdateFormDataByInstanceMapRequest
     * @return BatchUpdateFormDataByInstanceMapResponse
     */
    @Override
    public CompletableFuture<BatchUpdateFormDataByInstanceMapResponse> batchUpdateFormDataByInstanceMap(BatchUpdateFormDataByInstanceMapRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BatchUpdateFormDataByInstanceMap").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/batchUpdateFormDataByInstanceMap").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchUpdateFormDataByInstanceMapResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchUpdateFormDataByInstanceMapResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CancelScheduleConference  CancelScheduleConferenceRequest
     * @return CancelScheduleConferenceResponse
     */
    @Override
    public CompletableFuture<CancelScheduleConferenceResponse> cancelScheduleConference(CancelScheduleConferenceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CancelScheduleConference").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/cancelScheduleConference").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelScheduleConferenceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelScheduleConferenceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckAlibabaStaff  CheckAlibabaStaffRequest
     * @return CheckAlibabaStaffResponse
     */
    @Override
    public CompletableFuture<CheckAlibabaStaffResponse> checkAlibabaStaff(CheckAlibabaStaffRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CheckAlibabaStaff").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/im/checkAlibabaStaff").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckAlibabaStaffResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckAlibabaStaffResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckUserIsGroupMember  CheckUserIsGroupMemberRequest
     * @return CheckUserIsGroupMemberResponse
     */
    @Override
    public CompletableFuture<CheckUserIsGroupMemberResponse> checkUserIsGroupMember(CheckUserIsGroupMemberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CheckUserIsGroupMember").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/im/checkUserIsGroupMember").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckUserIsGroupMemberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckUserIsGroupMemberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of Clear  ClearRequest
     * @return ClearResponse
     */
    @Override
    public CompletableFuture<ClearResponse> clear(ClearRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("Clear").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/clear").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ClearResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ClearResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ClearData  ClearDataRequest
     * @return ClearDataResponse
     */
    @Override
    public CompletableFuture<ClearDataResponse> clearData(ClearDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ClearData").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/clearData").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ClearDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ClearDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloseVideoConference  CloseVideoConferenceRequest
     * @return CloseVideoConferenceResponse
     */
    @Override
    public CompletableFuture<CloseVideoConferenceResponse> closeVideoConference(CloseVideoConferenceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CloseVideoConference").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/closeVideoConference").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloseVideoConferenceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloseVideoConferenceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CommentListReport  CommentListReportRequest
     * @return CommentListReportResponse
     */
    @Override
    public CompletableFuture<CommentListReportResponse> commentListReport(CommentListReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CommentListReport").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/log/commentListReport").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CommentListReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CommentListReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CommitFile  CommitFileRequest
     * @return CommitFileResponse
     */
    @Override
    public CompletableFuture<CommitFileResponse> commitFile(CommitFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CommitFile").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/commitFile").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CommitFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CommitFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CopyDentry  CopyDentryRequest
     * @return CopyDentryResponse
     */
    @Override
    public CompletableFuture<CopyDentryResponse> copyDentry(CopyDentryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CopyDentry").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v2/documents/copyDentry").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CopyDentryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CopyDentryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDeliveryPlan  CreateDeliveryPlanRequest
     * @return CreateDeliveryPlanResponse
     */
    @Override
    public CompletableFuture<CreateDeliveryPlanResponse> createDeliveryPlan(CreateDeliveryPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateDeliveryPlan").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/watt/createDeliveryPlan").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDeliveryPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDeliveryPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDingtalkPersonalTodoTask  CreateDingtalkPersonalTodoTaskRequest
     * @return CreateDingtalkPersonalTodoTaskResponse
     */
    @Override
    public CompletableFuture<CreateDingtalkPersonalTodoTaskResponse> createDingtalkPersonalTodoTask(CreateDingtalkPersonalTodoTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateDingtalkPersonalTodoTask").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/task/createDingtalkPersonalTodoTask").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDingtalkPersonalTodoTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDingtalkPersonalTodoTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateEvent  CreateEventRequest
     * @return CreateEventResponse
     */
    @Override
    public CompletableFuture<CreateEventResponse> createEvent(CreateEventRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateEvent").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/calendar/createEvent").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateEventResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateEventResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateLive  CreateLiveRequest
     * @return CreateLiveResponse
     */
    @Override
    public CompletableFuture<CreateLiveResponse> createLive(CreateLiveRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateLive").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/createLive").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLiveResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLiveResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMeetingRoom  CreateMeetingRoomRequest
     * @return CreateMeetingRoomResponse
     */
    @Override
    public CompletableFuture<CreateMeetingRoomResponse> createMeetingRoom(CreateMeetingRoomRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateMeetingRoom").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/createMeetingRoom").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMeetingRoomResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMeetingRoomResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMeetingRoomGroup  CreateMeetingRoomGroupRequest
     * @return CreateMeetingRoomGroupResponse
     */
    @Override
    public CompletableFuture<CreateMeetingRoomGroupResponse> createMeetingRoomGroup(CreateMeetingRoomGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateMeetingRoomGroup").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/createMeetingRoomGroup").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMeetingRoomGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMeetingRoomGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMessage  CreateMessageRequest
     * @return CreateMessageResponse
     */
    @Override
    public CompletableFuture<CreateMessageResponse> createMessage(CreateMessageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateMessage").setMethod(HttpMethod.POST).setPathRegex("/ai/v1/assistant/createMessage").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMessageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMessageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMultiDimTableField  CreateMultiDimTableFieldRequest
     * @return CreateMultiDimTableFieldResponse
     */
    @Override
    public CompletableFuture<CreateMultiDimTableFieldResponse> createMultiDimTableField(CreateMultiDimTableFieldRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateMultiDimTableField").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/table/createMultiDimTableField").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMultiDimTableFieldResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMultiDimTableFieldResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateOrUpdateFormData  CreateOrUpdateFormDataRequest
     * @return CreateOrUpdateFormDataResponse
     */
    @Override
    public CompletableFuture<CreateOrUpdateFormDataResponse> createOrUpdateFormData(CreateOrUpdateFormDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateOrUpdateFormData").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/createOrUpdateFormData").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateOrUpdateFormDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateOrUpdateFormDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateOrgHonorTemplate  CreateOrgHonorTemplateRequest
     * @return CreateOrgHonorTemplateResponse
     */
    @Override
    public CompletableFuture<CreateOrgHonorTemplateResponse> createOrgHonorTemplate(CreateOrgHonorTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateOrgHonorTemplate").setMethod(HttpMethod.POST).setPathRegex("/aliding/v1/honor/createOrgHonorTemplate").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateOrgHonorTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateOrgHonorTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreatePersonalTodoTask  CreatePersonalTodoTaskRequest
     * @return CreatePersonalTodoTaskResponse
     */
    @Override
    public CompletableFuture<CreatePersonalTodoTaskResponse> createPersonalTodoTask(CreatePersonalTodoTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePersonalTodoTask").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/task/createPersonalTodoTask").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePersonalTodoTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePersonalTodoTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateReport  CreateReportRequest
     * @return CreateReportResponse
     */
    @Override
    public CompletableFuture<CreateReportResponse> createReport(CreateReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateReport").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/log/createReport").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateRun  CreateRunRequest
     * @return CreateRunResponse
     */
    @Override
    public CompletableFuture<CreateRunResponse> createRun(CreateRunRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateRun").setMethod(HttpMethod.POST).setPathRegex("/ai/v1/assistant/createRun").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRunResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRunResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<CreateRunResponseBody> createRunWithResponseIterable(CreateRunRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("CreateRun").setMethod(HttpMethod.POST).setPathRegex("/ai/v1/assistant/createRun").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        CreateRunResponseBodyIterator iterator = CreateRunResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of CreateScenegroup  CreateScenegroupRequest
     * @return CreateScenegroupResponse
     */
    @Override
    public CompletableFuture<CreateScenegroupResponse> createScenegroup(CreateScenegroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateScenegroup").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/im/createScenegroup").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateScenegroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateScenegroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateScheduleConference  CreateScheduleConferenceRequest
     * @return CreateScheduleConferenceResponse
     */
    @Override
    public CompletableFuture<CreateScheduleConferenceResponse> createScheduleConference(CreateScheduleConferenceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateScheduleConference").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/createScheduleConference").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateScheduleConferenceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateScheduleConferenceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSearchDome  CreateSearchDomeRequest
     * @return CreateSearchDomeResponse
     */
    @Override
    public CompletableFuture<CreateSearchDomeResponse> createSearchDome(CreateSearchDomeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateSearchDome").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/watt/createSearchDome").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSearchDomeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSearchDomeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSearchKeyword  CreateSearchKeywordRequest
     * @return CreateSearchKeywordResponse
     */
    @Override
    public CompletableFuture<CreateSearchKeywordResponse> createSearchKeyword(CreateSearchKeywordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateSearchKeyword").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/watt/createSearchKeyword").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSearchKeywordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSearchKeywordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSheet  CreateSheetRequest
     * @return CreateSheetResponse
     */
    @Override
    public CompletableFuture<CreateSheetResponse> createSheet(CreateSheetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateSheet").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/createSheet").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSheetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSheetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSubscribedCalendar  CreateSubscribedCalendarRequest
     * @return CreateSubscribedCalendarResponse
     */
    @Override
    public CompletableFuture<CreateSubscribedCalendarResponse> createSubscribedCalendar(CreateSubscribedCalendarRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateSubscribedCalendar").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/calendar/createSubscribedCalendar").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSubscribedCalendarResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSubscribedCalendarResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateThread  CreateThreadRequest
     * @return CreateThreadResponse
     */
    @Override
    public CompletableFuture<CreateThreadResponse> createThread(CreateThreadRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateThread").setMethod(HttpMethod.POST).setPathRegex("/ai/v1/assistant/createThread").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateThreadResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateThreadResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateTicket").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ticket/createTicket").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTicketResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTicketResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateTodoTask  CreateTodoTaskRequest
     * @return CreateTodoTaskResponse
     */
    @Override
    public CompletableFuture<CreateTodoTaskResponse> createTodoTask(CreateTodoTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateTodoTask").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/task/createTodoTask").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTodoTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTodoTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateVideoConference  CreateVideoConferenceRequest
     * @return CreateVideoConferenceResponse
     */
    @Override
    public CompletableFuture<CreateVideoConferenceResponse> createVideoConference(CreateVideoConferenceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateVideoConference").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/createVideoConference").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVideoConferenceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVideoConferenceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateWorkspace  CreateWorkspaceRequest
     * @return CreateWorkspaceResponse
     */
    @Override
    public CompletableFuture<CreateWorkspaceResponse> createWorkspace(CreateWorkspaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateWorkspace").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/createWorkspace").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateWorkspaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateWorkspaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateWorkspaceDoc  CreateWorkspaceDocRequest
     * @return CreateWorkspaceDocResponse
     */
    @Override
    public CompletableFuture<CreateWorkspaceDocResponse> createWorkspaceDoc(CreateWorkspaceDocRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateWorkspaceDoc").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/createWorkspaceDoc").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateWorkspaceDocResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateWorkspaceDocResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteColumns  DeleteColumnsRequest
     * @return DeleteColumnsResponse
     */
    @Override
    public CompletableFuture<DeleteColumnsResponse> deleteColumns(DeleteColumnsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteColumns").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/deleteColumns").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteColumnsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteColumnsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDentry  DeleteDentryRequest
     * @return DeleteDentryResponse
     */
    @Override
    public CompletableFuture<DeleteDentryResponse> deleteDentry(DeleteDentryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteDentry").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/deleteDentry").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDentryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDentryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDriveSpace  DeleteDriveSpaceRequest
     * @return DeleteDriveSpaceResponse
     */
    @Override
    public CompletableFuture<DeleteDriveSpaceResponse> deleteDriveSpace(DeleteDriveSpaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteDriveSpace").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/deleteDriveSpace").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDriveSpaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDriveSpaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteEvent  DeleteEventRequest
     * @return DeleteEventResponse
     */
    @Override
    public CompletableFuture<DeleteEventResponse> deleteEvent(DeleteEventRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteEvent").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/calendar/deleteEvent").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteEventResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteEventResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteFormData  DeleteFormDataRequest
     * @return DeleteFormDataResponse
     */
    @Override
    public CompletableFuture<DeleteFormDataResponse> deleteFormData(DeleteFormDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteFormData").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/deleteFormData").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFormDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFormDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteInstance  DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    @Override
    public CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteInstance").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/deleteInstance").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteLive  DeleteLiveRequest
     * @return DeleteLiveResponse
     */
    @Override
    public CompletableFuture<DeleteLiveResponse> deleteLive(DeleteLiveRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteLive").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/deleteLive").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLiveResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLiveResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMeetingRoom  DeleteMeetingRoomRequest
     * @return DeleteMeetingRoomResponse
     */
    @Override
    public CompletableFuture<DeleteMeetingRoomResponse> deleteMeetingRoom(DeleteMeetingRoomRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteMeetingRoom").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/deleteMeetingRoom").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMeetingRoomResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMeetingRoomResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMeetingRoomGroup  DeleteMeetingRoomGroupRequest
     * @return DeleteMeetingRoomGroupResponse
     */
    @Override
    public CompletableFuture<DeleteMeetingRoomGroupResponse> deleteMeetingRoomGroup(DeleteMeetingRoomGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteMeetingRoomGroup").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/deleteMeetingRoomGroup").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMeetingRoomGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMeetingRoomGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMultiDimTableField  DeleteMultiDimTableFieldRequest
     * @return DeleteMultiDimTableFieldResponse
     */
    @Override
    public CompletableFuture<DeleteMultiDimTableFieldResponse> deleteMultiDimTableField(DeleteMultiDimTableFieldRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteMultiDimTableField").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/table/deleteMultiDimTableField").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMultiDimTableFieldResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMultiDimTableFieldResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMultiDimTableRecords  DeleteMultiDimTableRecordsRequest
     * @return DeleteMultiDimTableRecordsResponse
     */
    @Override
    public CompletableFuture<DeleteMultiDimTableRecordsResponse> deleteMultiDimTableRecords(DeleteMultiDimTableRecordsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteMultiDimTableRecords").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/table/deleteMultiDimTableRecords").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMultiDimTableRecordsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMultiDimTableRecordsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeletePermission  DeletePermissionRequest
     * @return DeletePermissionResponse
     */
    @Override
    public CompletableFuture<DeletePermissionResponse> deletePermission(DeletePermissionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeletePermission").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/deletePermission").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePermissionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePermissionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteRows  DeleteRowsRequest
     * @return DeleteRowsResponse
     */
    @Override
    public CompletableFuture<DeleteRowsResponse> deleteRows(DeleteRowsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteRows").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/deleteRows").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRowsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRowsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteScenegroupMember  DeleteScenegroupMemberRequest
     * @return DeleteScenegroupMemberResponse
     */
    @Override
    public CompletableFuture<DeleteScenegroupMemberResponse> deleteScenegroupMember(DeleteScenegroupMemberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteScenegroupMember").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/im/deleteScenegroupMember").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteScenegroupMemberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteScenegroupMemberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSheet  DeleteSheetRequest
     * @return DeleteSheetResponse
     */
    @Override
    public CompletableFuture<DeleteSheetResponse> deleteSheet(DeleteSheetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteSheet").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/deleteSheet").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSheetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSheetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSubscribedCalendar  DeleteSubscribedCalendarRequest
     * @return DeleteSubscribedCalendarResponse
     */
    @Override
    public CompletableFuture<DeleteSubscribedCalendarResponse> deleteSubscribedCalendar(DeleteSubscribedCalendarRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteSubscribedCalendar").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/calendar/deleteSubscribedCalendar").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSubscribedCalendarResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSubscribedCalendarResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteTodoTask  DeleteTodoTaskRequest
     * @return DeleteTodoTaskResponse
     */
    @Override
    public CompletableFuture<DeleteTodoTaskResponse> deleteTodoTask(DeleteTodoTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteTodoTask").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/task/deleteTodoTask").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTodoTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTodoTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteWorkspaceDocMembers  DeleteWorkspaceDocMembersRequest
     * @return DeleteWorkspaceDocMembersResponse
     */
    @Override
    public CompletableFuture<DeleteWorkspaceDocMembersResponse> deleteWorkspaceDocMembers(DeleteWorkspaceDocMembersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteWorkspaceDocMembers").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/deleteWorkspaceDocMembers").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteWorkspaceDocMembersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteWorkspaceDocMembersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteWorkspaceMembers  DeleteWorkspaceMembersRequest
     * @return DeleteWorkspaceMembersResponse
     */
    @Override
    public CompletableFuture<DeleteWorkspaceMembersResponse> deleteWorkspaceMembers(DeleteWorkspaceMembersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteWorkspaceMembers").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/deleteWorkspaceMembers").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteWorkspaceMembersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteWorkspaceMembersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DocBlocksQuery  DocBlocksQueryRequest
     * @return DocBlocksQueryResponse
     */
    @Override
    public CompletableFuture<DocBlocksQueryResponse> docBlocksQuery(DocBlocksQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DocBlocksQuery").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/docBlocksQuery").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DocBlocksQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DocBlocksQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DocUpdateContent  DocUpdateContentRequest
     * @return DocUpdateContentResponse
     */
    @Override
    public CompletableFuture<DocUpdateContentResponse> docUpdateContent(DocUpdateContentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DocUpdateContent").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/docUpdateContent").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DocUpdateContentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DocUpdateContentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExecuteBatchTask  ExecuteBatchTaskRequest
     * @return ExecuteBatchTaskResponse
     */
    @Override
    public CompletableFuture<ExecuteBatchTaskResponse> executeBatchTask(ExecuteBatchTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExecuteBatchTask").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/executeBatchTask").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteBatchTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteBatchTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExecutePlatformTask  ExecutePlatformTaskRequest
     * @return ExecutePlatformTaskResponse
     */
    @Override
    public CompletableFuture<ExecutePlatformTaskResponse> executePlatformTask(ExecutePlatformTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExecutePlatformTask").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/executePlatformTask").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecutePlatformTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecutePlatformTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExecuteTask  ExecuteTaskRequest
     * @return ExecuteTaskResponse
     */
    @Override
    public CompletableFuture<ExecuteTaskResponse> executeTask(ExecuteTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExecuteTask").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/executeTask").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExpandGroupCapacity  ExpandGroupCapacityRequest
     * @return ExpandGroupCapacityResponse
     */
    @Override
    public CompletableFuture<ExpandGroupCapacityResponse> expandGroupCapacity(ExpandGroupCapacityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExpandGroupCapacity").setMethod(HttpMethod.POST).setPathRegex("/aliding/v1/im/expandGroupCapacity").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExpandGroupCapacityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExpandGroupCapacityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FinishTicket  FinishTicketRequest
     * @return FinishTicketResponse
     */
    @Override
    public CompletableFuture<FinishTicketResponse> finishTicket(FinishTicketRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FinishTicket").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ticket/finishTicket").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FinishTicketResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FinishTicketResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetActivityList  GetActivityListRequest
     * @return GetActivityListResponse
     */
    @Override
    public CompletableFuture<GetActivityListResponse> getActivityList(GetActivityListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetActivityList").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/getActivityList").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetActivityListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetActivityListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAllSheets  GetAllSheetsRequest
     * @return GetAllSheetsResponse
     */
    @Override
    public CompletableFuture<GetAllSheetsResponse> getAllSheets(GetAllSheetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAllSheets").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/getAllSheets").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAllSheetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAllSheetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAssistantCapability  GetAssistantCapabilityRequest
     * @return GetAssistantCapabilityResponse
     */
    @Override
    public CompletableFuture<GetAssistantCapabilityResponse> getAssistantCapability(GetAssistantCapabilityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAssistantCapability").setMethod(HttpMethod.POST).setPathRegex("/ai/v1/assistant/getAssistantCapability").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAssistantCapabilityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAssistantCapabilityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetConversaionSpace  GetConversaionSpaceRequest
     * @return GetConversaionSpaceResponse
     */
    @Override
    public CompletableFuture<GetConversaionSpaceResponse> getConversaionSpace(GetConversaionSpaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetConversaionSpace").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/getConversaionSpace").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetConversaionSpaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetConversaionSpaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCorpAccomplishmentTasks  GetCorpAccomplishmentTasksRequest
     * @return GetCorpAccomplishmentTasksResponse
     */
    @Override
    public CompletableFuture<GetCorpAccomplishmentTasksResponse> getCorpAccomplishmentTasks(GetCorpAccomplishmentTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetCorpAccomplishmentTasks").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/getCorpAccomplishmentTasks").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCorpAccomplishmentTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCorpAccomplishmentTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCorpTasks  GetCorpTasksRequest
     * @return GetCorpTasksResponse
     */
    @Override
    public CompletableFuture<GetCorpTasksResponse> getCorpTasks(GetCorpTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetCorpTasks").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/getCorpTasks").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCorpTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCorpTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDeptNo  GetDeptNoRequest
     * @return GetDeptNoResponse
     */
    @Override
    public CompletableFuture<GetDeptNoResponse> getDeptNo(GetDeptNoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDeptNo").setMethod(HttpMethod.POST).setPathRegex("/aliding/v1/dept/getDeptNo").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDeptNoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDeptNoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDocContent  GetDocContentRequest
     * @return GetDocContentResponse
     */
    @Override
    public CompletableFuture<GetDocContentResponse> getDocContent(GetDocContentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDocContent").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v2/documents/getDocContent").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDocContentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDocContentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDocContentTakId  GetDocContentTakIdRequest
     * @return GetDocContentTakIdResponse
     */
    @Override
    public CompletableFuture<GetDocContentTakIdResponse> getDocContentTakId(GetDocContentTakIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDocContentTakId").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v2/documents/getDocContentTakId").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDocContentTakIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDocContentTakIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetEvent  GetEventRequest
     * @return GetEventResponse
     */
    @Override
    public CompletableFuture<GetEventResponse> getEvent(GetEventRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetEvent").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/calendar/getEvent").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetEventResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetEventResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetFieldDefByUuid  GetFieldDefByUuidRequest
     * @return GetFieldDefByUuidResponse
     */
    @Override
    public CompletableFuture<GetFieldDefByUuidResponse> getFieldDefByUuid(GetFieldDefByUuidRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetFieldDefByUuid").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/getFieldDefByUuid").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFieldDefByUuidResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFieldDefByUuidResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetFileDownloadInfo  GetFileDownloadInfoRequest
     * @return GetFileDownloadInfoResponse
     */
    @Override
    public CompletableFuture<GetFileDownloadInfoResponse> getFileDownloadInfo(GetFileDownloadInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetFileDownloadInfo").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/getFileDownloadInfo").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFileDownloadInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFileDownloadInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetFileUploadInfo  GetFileUploadInfoRequest
     * @return GetFileUploadInfoResponse
     */
    @Override
    public CompletableFuture<GetFileUploadInfoResponse> getFileUploadInfo(GetFileUploadInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetFileUploadInfo").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/getFileUploadInfo").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFileUploadInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFileUploadInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetFormComponentDefinitionList  GetFormComponentDefinitionListRequest
     * @return GetFormComponentDefinitionListResponse
     */
    @Override
    public CompletableFuture<GetFormComponentDefinitionListResponse> getFormComponentDefinitionList(GetFormComponentDefinitionListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetFormComponentDefinitionList").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/getFormComponentDefinitionList").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFormComponentDefinitionListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFormComponentDefinitionListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetFormDataByID  GetFormDataByIDRequest
     * @return GetFormDataByIDResponse
     */
    @Override
    public CompletableFuture<GetFormDataByIDResponse> getFormDataByID(GetFormDataByIDRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetFormDataByID").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/getFormDataByID").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFormDataByIDResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFormDataByIDResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetFormListInApp  GetFormListInAppRequest
     * @return GetFormListInAppResponse
     */
    @Override
    public CompletableFuture<GetFormListInAppResponse> getFormListInApp(GetFormListInAppRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetFormListInApp").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/getFormListInApp").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFormListInAppResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFormListInAppResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetGroupLiveList  GetGroupLiveListRequest
     * @return GetGroupLiveListResponse
     */
    @Override
    public CompletableFuture<GetGroupLiveListResponse> getGroupLiveList(GetGroupLiveListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetGroupLiveList").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/getGroupLiveList").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetGroupLiveListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetGroupLiveListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetInnerGroupMembers  GetInnerGroupMembersRequest
     * @return GetInnerGroupMembersResponse
     */
    @Override
    public CompletableFuture<GetInnerGroupMembersResponse> getInnerGroupMembers(GetInnerGroupMembersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetInnerGroupMembers").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/im/getInnerGroupMembers").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInnerGroupMembersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInnerGroupMembersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetInstanceById  GetInstanceByIdRequest
     * @return GetInstanceByIdResponse
     */
    @Override
    public CompletableFuture<GetInstanceByIdResponse> getInstanceById(GetInstanceByIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetInstanceById").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/getInstanceById").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceByIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceByIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetInstanceIdList  GetInstanceIdListRequest
     * @return GetInstanceIdListResponse
     */
    @Override
    public CompletableFuture<GetInstanceIdListResponse> getInstanceIdList(GetInstanceIdListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetInstanceIdList").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/getInstanceIdList").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceIdListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceIdListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetInstances  GetInstancesRequest
     * @return GetInstancesResponse
     */
    @Override
    public CompletableFuture<GetInstancesResponse> getInstances(GetInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetInstances").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/getInstances").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetInstancesByIdList  GetInstancesByIdListRequest
     * @return GetInstancesByIdListResponse
     */
    @Override
    public CompletableFuture<GetInstancesByIdListResponse> getInstancesByIdList(GetInstancesByIdListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetInstancesByIdList").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/getInstancesByIdList").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstancesByIdListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstancesByIdListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLiveReplayUrl  GetLiveReplayUrlRequest
     * @return GetLiveReplayUrlResponse
     */
    @Override
    public CompletableFuture<GetLiveReplayUrlResponse> getLiveReplayUrl(GetLiveReplayUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetLiveReplayUrl").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/getLiveReplayUrl").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLiveReplayUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLiveReplayUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMeCorpSubmission  GetMeCorpSubmissionRequest
     * @return GetMeCorpSubmissionResponse
     */
    @Override
    public CompletableFuture<GetMeCorpSubmissionResponse> getMeCorpSubmission(GetMeCorpSubmissionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMeCorpSubmission").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/getMeCorpSubmission").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMeCorpSubmissionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMeCorpSubmissionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMeetingRoomsSchedule  GetMeetingRoomsScheduleRequest
     * @return GetMeetingRoomsScheduleResponse
     */
    @Override
    public CompletableFuture<GetMeetingRoomsScheduleResponse> getMeetingRoomsSchedule(GetMeetingRoomsScheduleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMeetingRoomsSchedule").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/calendar/getMeetingRoomsSchedule").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMeetingRoomsScheduleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMeetingRoomsScheduleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMineWorkspace  GetMineWorkspaceRequest
     * @return GetMineWorkspaceResponse
     */
    @Override
    public CompletableFuture<GetMineWorkspaceResponse> getMineWorkspace(GetMineWorkspaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMineWorkspace").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v2/documents/getMineWorkspace").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMineWorkspaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMineWorkspaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMultiDimTableAllFields  GetMultiDimTableAllFieldsRequest
     * @return GetMultiDimTableAllFieldsResponse
     */
    @Override
    public CompletableFuture<GetMultiDimTableAllFieldsResponse> getMultiDimTableAllFields(GetMultiDimTableAllFieldsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMultiDimTableAllFields").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/table/getMultiDimTableAllFields").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMultiDimTableAllFieldsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMultiDimTableAllFieldsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMultiDimTableAllSheets  GetMultiDimTableAllSheetsRequest
     * @return GetMultiDimTableAllSheetsResponse
     */
    @Override
    public CompletableFuture<GetMultiDimTableAllSheetsResponse> getMultiDimTableAllSheets(GetMultiDimTableAllSheetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMultiDimTableAllSheets").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/table/getMultiDimTableAllSheets").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMultiDimTableAllSheetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMultiDimTableAllSheetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMultiDimTableRecord  GetMultiDimTableRecordRequest
     * @return GetMultiDimTableRecordResponse
     */
    @Override
    public CompletableFuture<GetMultiDimTableRecordResponse> getMultiDimTableRecord(GetMultiDimTableRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMultiDimTableRecord").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/table/getMultiDimTableRecord").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMultiDimTableRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMultiDimTableRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMultiDimTableSheet  GetMultiDimTableSheetRequest
     * @return GetMultiDimTableSheetResponse
     */
    @Override
    public CompletableFuture<GetMultiDimTableSheetResponse> getMultiDimTableSheet(GetMultiDimTableSheetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMultiDimTableSheet").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/table/getMultiDimTableSheet").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMultiDimTableSheetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMultiDimTableSheetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMultipartFileUploadInfos  GetMultipartFileUploadInfosRequest
     * @return GetMultipartFileUploadInfosResponse
     */
    @Override
    public CompletableFuture<GetMultipartFileUploadInfosResponse> getMultipartFileUploadInfos(GetMultipartFileUploadInfosRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMultipartFileUploadInfos").setMethod(HttpMethod.POST).setPathRegex("/GetMultipartFileUploadInfos").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMultipartFileUploadInfosResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMultipartFileUploadInfosResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetNewestInnerGroups  GetNewestInnerGroupsRequest
     * @return GetNewestInnerGroupsResponse
     */
    @Override
    public CompletableFuture<GetNewestInnerGroupsResponse> getNewestInnerGroups(GetNewestInnerGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetNewestInnerGroups").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/im/getNewestInnerGroups").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetNewestInnerGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetNewestInnerGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetNode  GetNodeRequest
     * @return GetNodeResponse
     */
    @Override
    public CompletableFuture<GetNodeResponse> getNode(GetNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetNode").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v2/documents/getNode").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetNodeByUrl  GetNodeByUrlRequest
     * @return GetNodeByUrlResponse
     */
    @Override
    public CompletableFuture<GetNodeByUrlResponse> getNodeByUrl(GetNodeByUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetNodeByUrl").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v2/documents/getNodeByUrl").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetNodeByUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetNodeByUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetNodes  GetNodesRequest
     * @return GetNodesResponse
     */
    @Override
    public CompletableFuture<GetNodesResponse> getNodes(GetNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetNodes").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v2/documents/getNodes").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetNotifyMe  GetNotifyMeRequest
     * @return GetNotifyMeResponse
     */
    @Override
    public CompletableFuture<GetNotifyMeResponse> getNotifyMe(GetNotifyMeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetNotifyMe").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/getNotifyMe").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetNotifyMeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetNotifyMeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetOpenUrl  GetOpenUrlRequest
     * @return GetOpenUrlResponse
     */
    @Override
    public CompletableFuture<GetOpenUrlResponse> getOpenUrl(GetOpenUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetOpenUrl").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/getOpenUrl").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOpenUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOpenUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetOperationRecords  GetOperationRecordsRequest
     * @return GetOperationRecordsResponse
     */
    @Override
    public CompletableFuture<GetOperationRecordsResponse> getOperationRecords(GetOperationRecordsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetOperationRecords").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/getOperationRecords").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOperationRecordsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOperationRecordsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetOrgLiveList  GetOrgLiveListRequest
     * @return GetOrgLiveListResponse
     */
    @Override
    public CompletableFuture<GetOrgLiveListResponse> getOrgLiveList(GetOrgLiveListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetOrgLiveList").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/getOrgLiveList").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOrgLiveListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOrgLiveListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetOrgOrWebOpenDocContentTaskId  GetOrgOrWebOpenDocContentTaskIdRequest
     * @return GetOrgOrWebOpenDocContentTaskIdResponse
     */
    @Override
    public CompletableFuture<GetOrgOrWebOpenDocContentTaskIdResponse> getOrgOrWebOpenDocContentTaskId(GetOrgOrWebOpenDocContentTaskIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetOrgOrWebOpenDocContentTaskId").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v2/documents/getOrgOrWebOpenDocContentTaskId").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOrgOrWebOpenDocContentTaskIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOrgOrWebOpenDocContentTaskIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetProcessDefinition  GetProcessDefinitionRequest
     * @return GetProcessDefinitionResponse
     */
    @Override
    public CompletableFuture<GetProcessDefinitionResponse> getProcessDefinition(GetProcessDefinitionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetProcessDefinition").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/getProcessDefinition").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetProcessDefinitionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetProcessDefinitionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetRange  GetRangeRequest
     * @return GetRangeResponse
     */
    @Override
    public CompletableFuture<GetRangeResponse> getRange(GetRangeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetRange").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/getRange").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRangeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRangeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetRelatedWorkspaces  GetRelatedWorkspacesRequest
     * @return GetRelatedWorkspacesResponse
     */
    @Override
    public CompletableFuture<GetRelatedWorkspacesResponse> getRelatedWorkspaces(GetRelatedWorkspacesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetRelatedWorkspaces").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/getRelatedWorkspaces").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRelatedWorkspacesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRelatedWorkspacesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetReportTemplateByName  GetReportTemplateByNameRequest
     * @return GetReportTemplateByNameResponse
     */
    @Override
    public CompletableFuture<GetReportTemplateByNameResponse> getReportTemplateByName(GetReportTemplateByNameRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetReportTemplateByName").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/log/getReportTemplateByName").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetReportTemplateByNameResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetReportTemplateByNameResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetReportUnReadCount  GetReportUnReadCountRequest
     * @return GetReportUnReadCountResponse
     */
    @Override
    public CompletableFuture<GetReportUnReadCountResponse> getReportUnReadCount(GetReportUnReadCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetReportUnReadCount").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/log/getReportUnReadCount").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetReportUnReadCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetReportUnReadCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetRunningTasks  GetRunningTasksRequest
     * @return GetRunningTasksResponse
     */
    @Override
    public CompletableFuture<GetRunningTasksResponse> getRunningTasks(GetRunningTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetRunningTasks").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/getRunningTasks").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRunningTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRunningTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSchedule  GetScheduleRequest
     * @return GetScheduleResponse
     */
    @Override
    public CompletableFuture<GetScheduleResponse> getSchedule(GetScheduleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetSchedule").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/calendar/getSchedule").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetScheduleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetScheduleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSheet  GetSheetRequest
     * @return GetSheetResponse
     */
    @Override
    public CompletableFuture<GetSheetResponse> getSheet(GetSheetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetSheet").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/getSheet").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSheetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSheetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSheetContentJobId  GetSheetContentJobIdRequest
     * @return GetSheetContentJobIdResponse
     */
    @Override
    public CompletableFuture<GetSheetContentJobIdResponse> getSheetContentJobId(GetSheetContentJobIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetSheetContentJobId").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v2/documents/getSheetContentJobId").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSheetContentJobIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSheetContentJobIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSpaceDirectories  GetSpaceDirectoriesRequest
     * @return GetSpaceDirectoriesResponse
     */
    @Override
    public CompletableFuture<GetSpaceDirectoriesResponse> getSpaceDirectories(GetSpaceDirectoriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetSpaceDirectories").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v2/documents/getSpaceDirectories").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSpaceDirectoriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSpaceDirectoriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSubscribedCalendar  GetSubscribedCalendarRequest
     * @return GetSubscribedCalendarResponse
     */
    @Override
    public CompletableFuture<GetSubscribedCalendarResponse> getSubscribedCalendar(GetSubscribedCalendarRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetSubscribedCalendar").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/calendar/getSubscribedCalendar").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSubscribedCalendarResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSubscribedCalendarResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTaskCopies  GetTaskCopiesRequest
     * @return GetTaskCopiesResponse
     */
    @Override
    public CompletableFuture<GetTaskCopiesResponse> getTaskCopies(GetTaskCopiesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTaskCopies").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/getTaskCopies").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTaskCopiesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTaskCopiesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTemplateListByUserId  GetTemplateListByUserIdRequest
     * @return GetTemplateListByUserIdResponse
     */
    @Override
    public CompletableFuture<GetTemplateListByUserIdResponse> getTemplateListByUserId(GetTemplateListByUserIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTemplateListByUserId").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/log/getTemplateListByUserId").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTemplateListByUserIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTemplateListByUserIdResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTicket").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ticket/getTicket").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTicketResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTicketResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTodoTask  GetTodoTaskRequest
     * @return GetTodoTaskResponse
     */
    @Override
    public CompletableFuture<GetTodoTaskResponse> getTodoTask(GetTodoTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTodoTask").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/task/getTodoTask").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTodoTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTodoTaskResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetUser").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/im/getUser").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetUserId  GetUserIdRequest
     * @return GetUserIdResponse
     */
    @Override
    public CompletableFuture<GetUserIdResponse> getUserId(GetUserIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetUserId").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/im/getUserId").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUserIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUserIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetUserIdByOrgIdAndStaffId  GetUserIdByOrgIdAndStaffIdRequest
     * @return GetUserIdByOrgIdAndStaffIdResponse
     */
    @Override
    public CompletableFuture<GetUserIdByOrgIdAndStaffIdResponse> getUserIdByOrgIdAndStaffId(GetUserIdByOrgIdAndStaffIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetUserIdByOrgIdAndStaffId").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/im/getUserIdByOrgIdAndStaffId").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUserIdByOrgIdAndStaffIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUserIdByOrgIdAndStaffIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetUserLatestPlan  GetUserLatestPlanRequest
     * @return GetUserLatestPlanResponse
     */
    @Override
    public CompletableFuture<GetUserLatestPlanResponse> getUserLatestPlan(GetUserLatestPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetUserLatestPlan").setMethod(HttpMethod.POST).setPathRegex("/aliding/v1/indepding/getUserLatestPlan").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUserLatestPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUserLatestPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetWorkspace  GetWorkspaceRequest
     * @return GetWorkspaceResponse
     */
    @Override
    public CompletableFuture<GetWorkspaceResponse> getWorkspace(GetWorkspaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetWorkspace").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v2/documents/getWorkspace").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWorkspaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWorkspaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetWorkspaces  GetWorkspacesRequest
     * @return GetWorkspacesResponse
     */
    @Override
    public CompletableFuture<GetWorkspacesResponse> getWorkspaces(GetWorkspacesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetWorkspaces").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v2/documents/getWorkspaces").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWorkspacesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWorkspacesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GrantHonor  GrantHonorRequest
     * @return GrantHonorResponse
     */
    @Override
    public CompletableFuture<GrantHonorResponse> grantHonor(GrantHonorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GrantHonor").setMethod(HttpMethod.POST).setPathRegex("/aliding/v1/honor/grantHonor").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GrantHonorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GrantHonorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InitMultipartFileUpload  InitMultipartFileUploadRequest
     * @return InitMultipartFileUploadResponse
     */
    @Override
    public CompletableFuture<InitMultipartFileUploadResponse> initMultipartFileUpload(InitMultipartFileUploadRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InitMultipartFileUpload").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/initMultipartFileUpload").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InitMultipartFileUploadResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InitMultipartFileUploadResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InsertColumnsBefore  InsertColumnsBeforeRequest
     * @return InsertColumnsBeforeResponse
     */
    @Override
    public CompletableFuture<InsertColumnsBeforeResponse> insertColumnsBefore(InsertColumnsBeforeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InsertColumnsBefore").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/insertColumnsBefore").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InsertColumnsBeforeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InsertColumnsBeforeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InsertContentWithOptions  InsertContentWithOptionsRequest
     * @return InsertContentWithOptionsResponse
     */
    @Override
    public CompletableFuture<InsertContentWithOptionsResponse> insertContentWithOptions(InsertContentWithOptionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InsertContentWithOptions").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/insertContentWithOptions").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InsertContentWithOptionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InsertContentWithOptionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InsertMultiDimTableRecord  InsertMultiDimTableRecordRequest
     * @return InsertMultiDimTableRecordResponse
     */
    @Override
    public CompletableFuture<InsertMultiDimTableRecordResponse> insertMultiDimTableRecord(InsertMultiDimTableRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InsertMultiDimTableRecord").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/table/insertMultiDimTableRecord").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InsertMultiDimTableRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InsertMultiDimTableRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InsertRowsBefore  InsertRowsBeforeRequest
     * @return InsertRowsBeforeResponse
     */
    @Override
    public CompletableFuture<InsertRowsBeforeResponse> insertRowsBefore(InsertRowsBeforeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InsertRowsBefore").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/insertRowsBefore").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InsertRowsBeforeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InsertRowsBeforeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InviteUsers  InviteUsersRequest
     * @return InviteUsersResponse
     */
    @Override
    public CompletableFuture<InviteUsersResponse> inviteUsers(InviteUsersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InviteUsers").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/inviteUsers").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InviteUsersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InviteUsersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InvokeAssistant  InvokeAssistantRequest
     * @return InvokeAssistantResponse
     */
    @Override
    public CompletableFuture<InvokeAssistantResponse> invokeAssistant(InvokeAssistantRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InvokeAssistant").setMethod(HttpMethod.POST).setPathRegex("/ai/v1/assistant/invokeAssistant").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InvokeAssistantResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InvokeAssistantResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<InvokeAssistantResponseBody> invokeAssistantWithResponseIterable(InvokeAssistantRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("InvokeAssistant").setMethod(HttpMethod.POST).setPathRegex("/ai/v1/assistant/invokeAssistant").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        InvokeAssistantResponseBodyIterator iterator = InvokeAssistantResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of InvokeSkill  InvokeSkillRequest
     * @return InvokeSkillResponse
     */
    @Override
    public CompletableFuture<InvokeSkillResponse> invokeSkill(InvokeSkillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InvokeSkill").setMethod(HttpMethod.POST).setPathRegex("/ai/v1/skill/invoke").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InvokeSkillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InvokeSkillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListApplication  ListApplicationRequest
     * @return ListApplicationResponse
     */
    @Override
    public CompletableFuture<ListApplicationResponse> listApplication(ListApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListApplication").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/listApplication").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCalendars  ListCalendarsRequest
     * @return ListCalendarsResponse
     */
    @Override
    public CompletableFuture<ListCalendarsResponse> listCalendars(ListCalendarsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListCalendars").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/calendar/listCalendars").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCalendarsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCalendarsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDentries  ListDentriesRequest
     * @return ListDentriesResponse
     */
    @Override
    public CompletableFuture<ListDentriesResponse> listDentries(ListDentriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDentries").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/listDentries").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDentriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDentriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDriveSpaces  ListDriveSpacesRequest
     * @return ListDriveSpacesResponse
     */
    @Override
    public CompletableFuture<ListDriveSpacesResponse> listDriveSpaces(ListDriveSpacesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDriveSpaces").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/listDriveSpaces").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDriveSpacesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDriveSpacesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListEvents  ListEventsRequest
     * @return ListEventsResponse
     */
    @Override
    public CompletableFuture<ListEventsResponse> listEvents(ListEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListEvents").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/calendar/listEvents").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListEventsView  ListEventsViewRequest
     * @return ListEventsViewResponse
     */
    @Override
    public CompletableFuture<ListEventsViewResponse> listEventsView(ListEventsViewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListEventsView").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/calendar/listEventsView").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEventsViewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEventsViewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFormRemarks  ListFormRemarksRequest
     * @return ListFormRemarksResponse
     */
    @Override
    public CompletableFuture<ListFormRemarksResponse> listFormRemarks(ListFormRemarksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListFormRemarks").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/listFormRemarks").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFormRemarksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFormRemarksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMessage  ListMessageRequest
     * @return ListMessageResponse
     */
    @Override
    public CompletableFuture<ListMessageResponse> listMessage(ListMessageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMessage").setMethod(HttpMethod.POST).setPathRegex("/ai/v1/assistant/listMessage").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMessageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMessageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMultiDimTableRecords  ListMultiDimTableRecordsRequest
     * @return ListMultiDimTableRecordsResponse
     */
    @Override
    public CompletableFuture<ListMultiDimTableRecordsResponse> listMultiDimTableRecords(ListMultiDimTableRecordsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMultiDimTableRecords").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/table/listMultiDimTableRecords").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMultiDimTableRecordsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMultiDimTableRecordsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListNavigationByFormType  ListNavigationByFormTypeRequest
     * @return ListNavigationByFormTypeResponse
     */
    @Override
    public CompletableFuture<ListNavigationByFormTypeResponse> listNavigationByFormType(ListNavigationByFormTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListNavigationByFormType").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/listNavigationByFormType").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListNavigationByFormTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListNavigationByFormTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListNodes  ListNodesRequest
     * @return ListNodesResponse
     */
    @Override
    public CompletableFuture<ListNodesResponse> listNodes(ListNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListNodes").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v2/documents/listNodes").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPermissions  ListPermissionsRequest
     * @return ListPermissionsResponse
     */
    @Override
    public CompletableFuture<ListPermissionsResponse> listPermissions(ListPermissionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPermissions").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/listPermissions").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPermissionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPermissionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListReport  ListReportRequest
     * @return ListReportResponse
     */
    @Override
    public CompletableFuture<ListReportResponse> listReport(ListReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListReport").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/log/listReport").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTableDataByFormInstanceIdTableId  ListTableDataByFormInstanceIdTableIdRequest
     * @return ListTableDataByFormInstanceIdTableIdResponse
     */
    @Override
    public CompletableFuture<ListTableDataByFormInstanceIdTableIdResponse> listTableDataByFormInstanceIdTableId(ListTableDataByFormInstanceIdTableIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTableDataByFormInstanceIdTableId").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/listTableDataByFormInstanceIdTableId").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTableDataByFormInstanceIdTableIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTableDataByFormInstanceIdTableIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTeams  ListTeamsRequest
     * @return ListTeamsResponse
     */
    @Override
    public CompletableFuture<ListTeamsResponse> listTeams(ListTeamsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTeams").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v2/documents/listTeams").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTeamsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTeamsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTemplate  ListTemplateRequest
     * @return ListTemplateResponse
     */
    @Override
    public CompletableFuture<ListTemplateResponse> listTemplate(ListTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTemplate").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/listTemplate").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTicketOperateRecord  ListTicketOperateRecordRequest
     * @return ListTicketOperateRecordResponse
     */
    @Override
    public CompletableFuture<ListTicketOperateRecordResponse> listTicketOperateRecord(ListTicketOperateRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTicketOperateRecord").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ticket/listTicketOperateRecord").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTicketOperateRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTicketOperateRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListWorkspaces  ListWorkspacesRequest
     * @return ListWorkspacesResponse
     */
    @Override
    public CompletableFuture<ListWorkspacesResponse> listWorkspaces(ListWorkspacesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListWorkspaces").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v2/documents/listWorkspaces").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListWorkspacesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListWorkspacesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PatchEvent  PatchEventRequest
     * @return PatchEventResponse
     */
    @Override
    public CompletableFuture<PatchEventResponse> patchEvent(PatchEventRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PatchEvent").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/calendar/patchEvent").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PatchEventResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PatchEventResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryCloudRecordText  QueryCloudRecordTextRequest
     * @return QueryCloudRecordTextResponse
     */
    @Override
    public CompletableFuture<QueryCloudRecordTextResponse> queryCloudRecordText(QueryCloudRecordTextRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryCloudRecordText").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/queryCloudRecordText").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryCloudRecordTextResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryCloudRecordTextResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryCloudRecordVideo  QueryCloudRecordVideoRequest
     * @return QueryCloudRecordVideoResponse
     */
    @Override
    public CompletableFuture<QueryCloudRecordVideoResponse> queryCloudRecordVideo(QueryCloudRecordVideoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryCloudRecordVideo").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/queryCloudRecordVideo").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryCloudRecordVideoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryCloudRecordVideoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryCloudRecordVideoPlayInfo  QueryCloudRecordVideoPlayInfoRequest
     * @return QueryCloudRecordVideoPlayInfoResponse
     */
    @Override
    public CompletableFuture<QueryCloudRecordVideoPlayInfoResponse> queryCloudRecordVideoPlayInfo(QueryCloudRecordVideoPlayInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryCloudRecordVideoPlayInfo").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/queryCloudRecordVideoPlayInfo").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryCloudRecordVideoPlayInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryCloudRecordVideoPlayInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryConferenceInfo  QueryConferenceInfoRequest
     * @return QueryConferenceInfoResponse
     */
    @Override
    public CompletableFuture<QueryConferenceInfoResponse> queryConferenceInfo(QueryConferenceInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryConferenceInfo").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/queryConferenceInfo").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryConferenceInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryConferenceInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryConferenceInfoByRoomCode  QueryConferenceInfoByRoomCodeRequest
     * @return QueryConferenceInfoByRoomCodeResponse
     */
    @Override
    public CompletableFuture<QueryConferenceInfoByRoomCodeResponse> queryConferenceInfoByRoomCode(QueryConferenceInfoByRoomCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryConferenceInfoByRoomCode").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/queryConferenceInfoByRoomCode").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryConferenceInfoByRoomCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryConferenceInfoByRoomCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryConferenceMembers  QueryConferenceMembersRequest
     * @return QueryConferenceMembersResponse
     */
    @Override
    public CompletableFuture<QueryConferenceMembersResponse> queryConferenceMembers(QueryConferenceMembersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryConferenceMembers").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/queryConferenceMembers").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryConferenceMembersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryConferenceMembersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryDentriesInfo  QueryDentriesInfoRequest
     * @return QueryDentriesInfoResponse
     */
    @Override
    public CompletableFuture<QueryDentriesInfoResponse> queryDentriesInfo(QueryDentriesInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryDentriesInfo").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/queryDentriesInfo").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDentriesInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDentriesInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryDentry  QueryDentryRequest
     * @return QueryDentryResponse
     */
    @Override
    public CompletableFuture<QueryDentryResponse> queryDentry(QueryDentryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryDentry").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v2/documents/queryDentry").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDentryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDentryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryGroupLiveInfo  QueryGroupLiveInfoRequest
     * @return QueryGroupLiveInfoResponse
     */
    @Override
    public CompletableFuture<QueryGroupLiveInfoResponse> queryGroupLiveInfo(QueryGroupLiveInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryGroupLiveInfo").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/queryGroupLiveInfo").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryGroupLiveInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryGroupLiveInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryLiveInfo  QueryLiveInfoRequest
     * @return QueryLiveInfoResponse
     */
    @Override
    public CompletableFuture<QueryLiveInfoResponse> queryLiveInfo(QueryLiveInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryLiveInfo").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/queryLiveInfo").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryLiveInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryLiveInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryLiveWatchDetail  QueryLiveWatchDetailRequest
     * @return QueryLiveWatchDetailResponse
     */
    @Override
    public CompletableFuture<QueryLiveWatchDetailResponse> queryLiveWatchDetail(QueryLiveWatchDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryLiveWatchDetail").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/queryLiveWatchDetail").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryLiveWatchDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryLiveWatchDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryLiveWatchUserList  QueryLiveWatchUserListRequest
     * @return QueryLiveWatchUserListResponse
     */
    @Override
    public CompletableFuture<QueryLiveWatchUserListResponse> queryLiveWatchUserList(QueryLiveWatchUserListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryLiveWatchUserList").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/queryLiveWatchUserList").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryLiveWatchUserListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryLiveWatchUserListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryMeetingRoom  QueryMeetingRoomRequest
     * @return QueryMeetingRoomResponse
     */
    @Override
    public CompletableFuture<QueryMeetingRoomResponse> queryMeetingRoom(QueryMeetingRoomRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryMeetingRoom").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/queryMeetingRoom").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryMeetingRoomResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryMeetingRoomResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryMeetingRoomGroup  QueryMeetingRoomGroupRequest
     * @return QueryMeetingRoomGroupResponse
     */
    @Override
    public CompletableFuture<QueryMeetingRoomGroupResponse> queryMeetingRoomGroup(QueryMeetingRoomGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryMeetingRoomGroup").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/queryMeetingRoomGroup").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryMeetingRoomGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryMeetingRoomGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryMeetingRoomGroupList  QueryMeetingRoomGroupListRequest
     * @return QueryMeetingRoomGroupListResponse
     */
    @Override
    public CompletableFuture<QueryMeetingRoomGroupListResponse> queryMeetingRoomGroupList(QueryMeetingRoomGroupListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryMeetingRoomGroupList").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/queryMeetingRoomGroupList").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryMeetingRoomGroupListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryMeetingRoomGroupListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryMeetingRoomList  QueryMeetingRoomListRequest
     * @return QueryMeetingRoomListResponse
     */
    @Override
    public CompletableFuture<QueryMeetingRoomListResponse> queryMeetingRoomList(QueryMeetingRoomListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryMeetingRoomList").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/queryMeetingRoomList").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryMeetingRoomListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryMeetingRoomListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryMinutes  QueryMinutesRequest
     * @return QueryMinutesResponse
     */
    @Override
    public CompletableFuture<QueryMinutesResponse> queryMinutes(QueryMinutesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryMinutes").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/queryMinutes").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryMinutesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryMinutesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryMinutesSummary  QueryMinutesSummaryRequest
     * @return QueryMinutesSummaryResponse
     */
    @Override
    public CompletableFuture<QueryMinutesSummaryResponse> queryMinutesSummary(QueryMinutesSummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryMinutesSummary").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/queryMinutesSummary").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryMinutesSummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryMinutesSummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryMinutesText  QueryMinutesTextRequest
     * @return QueryMinutesTextResponse
     */
    @Override
    public CompletableFuture<QueryMinutesTextResponse> queryMinutesText(QueryMinutesTextRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryMinutesText").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/queryMinutesText").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryMinutesTextResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryMinutesTextResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryOrgHonors  QueryOrgHonorsRequest
     * @return QueryOrgHonorsResponse
     */
    @Override
    public CompletableFuture<QueryOrgHonorsResponse> queryOrgHonors(QueryOrgHonorsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryOrgHonors").setMethod(HttpMethod.POST).setPathRegex("/aliding/v1/honor/queryOrgHonors").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryOrgHonorsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryOrgHonorsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryOrgTodoTasks  QueryOrgTodoTasksRequest
     * @return QueryOrgTodoTasksResponse
     */
    @Override
    public CompletableFuture<QueryOrgTodoTasksResponse> queryOrgTodoTasks(QueryOrgTodoTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryOrgTodoTasks").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/task/queryOrgTodoTasks").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryOrgTodoTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryOrgTodoTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryRecordMinutesUrl  QueryRecordMinutesUrlRequest
     * @return QueryRecordMinutesUrlResponse
     */
    @Override
    public CompletableFuture<QueryRecordMinutesUrlResponse> queryRecordMinutesUrl(QueryRecordMinutesUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryRecordMinutesUrl").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/queryRecordMinutesUrl").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryRecordMinutesUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryRecordMinutesUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryReportDetail  QueryReportDetailRequest
     * @return QueryReportDetailResponse
     */
    @Override
    public CompletableFuture<QueryReportDetailResponse> queryReportDetail(QueryReportDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryReportDetail").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/log/queryReportDetail").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryReportDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryReportDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryScheduleConference  QueryScheduleConferenceRequest
     * @return QueryScheduleConferenceResponse
     */
    @Override
    public CompletableFuture<QueryScheduleConferenceResponse> queryScheduleConference(QueryScheduleConferenceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryScheduleConference").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/queryScheduleConference").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryScheduleConferenceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryScheduleConferenceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryScheduleConferenceInfo  QueryScheduleConferenceInfoRequest
     * @return QueryScheduleConferenceInfoResponse
     */
    @Override
    public CompletableFuture<QueryScheduleConferenceInfoResponse> queryScheduleConferenceInfo(QueryScheduleConferenceInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryScheduleConferenceInfo").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/queryScheduleConferenceInfo").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryScheduleConferenceInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryScheduleConferenceInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryUserHonors  QueryUserHonorsRequest
     * @return QueryUserHonorsResponse
     */
    @Override
    public CompletableFuture<QueryUserHonorsResponse> queryUserHonors(QueryUserHonorsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryUserHonors").setMethod(HttpMethod.POST).setPathRegex("/aliding/v1/honor/queryUserHonors").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryUserHonorsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryUserHonorsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecallHonor  RecallHonorRequest
     * @return RecallHonorResponse
     */
    @Override
    public CompletableFuture<RecallHonorResponse> recallHonor(RecallHonorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RecallHonor").setMethod(HttpMethod.POST).setPathRegex("/aliding/v1/honor/recallHonor").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecallHonorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecallHonorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReceiverListReport  ReceiverListReportRequest
     * @return ReceiverListReportResponse
     */
    @Override
    public CompletableFuture<ReceiverListReportResponse> receiverListReport(ReceiverListReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ReceiverListReport").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/log/receiverListReport").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReceiverListReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReceiverListReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RedirectTask  RedirectTaskRequest
     * @return RedirectTaskResponse
     */
    @Override
    public CompletableFuture<RedirectTaskResponse> redirectTask(RedirectTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RedirectTask").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/redirectTask").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RedirectTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RedirectTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveAttendee  RemoveAttendeeRequest
     * @return RemoveAttendeeResponse
     */
    @Override
    public CompletableFuture<RemoveAttendeeResponse> removeAttendee(RemoveAttendeeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RemoveAttendee").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/calendar/removeAttendee").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveAttendeeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveAttendeeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveMeetingRooms  RemoveMeetingRoomsRequest
     * @return RemoveMeetingRoomsResponse
     */
    @Override
    public CompletableFuture<RemoveMeetingRoomsResponse> removeMeetingRooms(RemoveMeetingRoomsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RemoveMeetingRooms").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/calendar/removeMeetingRooms").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveMeetingRoomsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveMeetingRoomsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RespondEvent  RespondEventRequest
     * @return RespondEventResponse
     */
    @Override
    public CompletableFuture<RespondEventResponse> respondEvent(RespondEventRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RespondEvent").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/calendar/respondEvent").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RespondEventResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RespondEventResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RetrieveRun  RetrieveRunRequest
     * @return RetrieveRunResponse
     */
    @Override
    public CompletableFuture<RetrieveRunResponse> retrieveRun(RetrieveRunRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RetrieveRun").setMethod(HttpMethod.POST).setPathRegex("/ai/v1/assistant/retrieveRun").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RetrieveRunResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RetrieveRunResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveContent  SaveContentRequest
     * @return SaveContentResponse
     */
    @Override
    public CompletableFuture<SaveContentResponse> saveContent(SaveContentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SaveContent").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/log/saveContent").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveContentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveContentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveFormData  SaveFormDataRequest
     * @return SaveFormDataResponse
     */
    @Override
    public CompletableFuture<SaveFormDataResponse> saveFormData(SaveFormDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SaveFormData").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/saveFormData").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveFormDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveFormDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveFormRemark  SaveFormRemarkRequest
     * @return SaveFormRemarkResponse
     */
    @Override
    public CompletableFuture<SaveFormRemarkResponse> saveFormRemark(SaveFormRemarkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SaveFormRemark").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/saveFormRemark").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveFormRemarkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveFormRemarkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SearchEmployeeFieldValues  SearchEmployeeFieldValuesRequest
     * @return SearchEmployeeFieldValuesResponse
     */
    @Override
    public CompletableFuture<SearchEmployeeFieldValuesResponse> searchEmployeeFieldValues(SearchEmployeeFieldValuesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SearchEmployeeFieldValues").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/searchEmployeeFieldValues").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchEmployeeFieldValuesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchEmployeeFieldValuesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SearchFormDataIdList  SearchFormDataIdListRequest
     * @return SearchFormDataIdListResponse
     */
    @Override
    public CompletableFuture<SearchFormDataIdListResponse> searchFormDataIdList(SearchFormDataIdListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SearchFormDataIdList").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/searchFormDataIdList").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchFormDataIdListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchFormDataIdListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SearchFormDataSecondGeneration  SearchFormDataSecondGenerationRequest
     * @return SearchFormDataSecondGenerationResponse
     */
    @Override
    public CompletableFuture<SearchFormDataSecondGenerationResponse> searchFormDataSecondGeneration(SearchFormDataSecondGenerationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SearchFormDataSecondGeneration").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/searchFormDataSecondGeneration").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchFormDataSecondGenerationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchFormDataSecondGenerationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SearchFormDataSecondGenerationNoTableField  SearchFormDataSecondGenerationNoTableFieldRequest
     * @return SearchFormDataSecondGenerationNoTableFieldResponse
     */
    @Override
    public CompletableFuture<SearchFormDataSecondGenerationNoTableFieldResponse> searchFormDataSecondGenerationNoTableField(SearchFormDataSecondGenerationNoTableFieldRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SearchFormDataSecondGenerationNoTableField").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/searchFormDataSecondGenerationNoTableField").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchFormDataSecondGenerationNoTableFieldResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchFormDataSecondGenerationNoTableFieldResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SearchFormDatas  SearchFormDatasRequest
     * @return SearchFormDatasResponse
     */
    @Override
    public CompletableFuture<SearchFormDatasResponse> searchFormDatas(SearchFormDatasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SearchFormDatas").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/searchFormDatas").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchFormDatasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchFormDatasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SearchInnerGroups  SearchInnerGroupsRequest
     * @return SearchInnerGroupsResponse
     */
    @Override
    public CompletableFuture<SearchInnerGroupsResponse> searchInnerGroups(SearchInnerGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SearchInnerGroups").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/im/searchInnerGroups").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchInnerGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchInnerGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SendBanner  SendBannerRequest
     * @return SendBannerResponse
     */
    @Override
    public CompletableFuture<SendBannerResponse> sendBanner(SendBannerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SendBanner").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/watt/sendBanner").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendBannerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendBannerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SendPopup  SendPopupRequest
     * @return SendPopupResponse
     */
    @Override
    public CompletableFuture<SendPopupResponse> sendPopup(SendPopupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SendPopup").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/watt/sendPopup").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendPopupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendPopupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SendSearchShade  SendSearchShadeRequest
     * @return SendSearchShadeResponse
     */
    @Override
    public CompletableFuture<SendSearchShadeResponse> sendSearchShade(SendSearchShadeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SendSearchShade").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/watt/sendSearchShade").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendSearchShadeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendSearchShadeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetColumnsVisibility  SetColumnsVisibilityRequest
     * @return SetColumnsVisibilityResponse
     */
    @Override
    public CompletableFuture<SetColumnsVisibilityResponse> setColumnsVisibility(SetColumnsVisibilityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SetColumnsVisibility").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/setColumnsVisibility").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetColumnsVisibilityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetColumnsVisibilityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetConferenceHosts  SetConferenceHostsRequest
     * @return SetConferenceHostsResponse
     */
    @Override
    public CompletableFuture<SetConferenceHostsResponse> setConferenceHosts(SetConferenceHostsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SetConferenceHosts").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/setConferenceHosts").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetConferenceHostsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetConferenceHostsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetRowsVisibility  SetRowsVisibilityRequest
     * @return SetRowsVisibilityResponse
     */
    @Override
    public CompletableFuture<SetRowsVisibilityResponse> setRowsVisibility(SetRowsVisibilityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SetRowsVisibility").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/setRowsVisibility").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetRowsVisibilityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetRowsVisibilityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SimpleListReport  SimpleListReportRequest
     * @return SimpleListReportResponse
     */
    @Override
    public CompletableFuture<SimpleListReportResponse> simpleListReport(SimpleListReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SimpleListReport").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/log/simpleListReport").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SimpleListReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SimpleListReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartCloudRecord  StartCloudRecordRequest
     * @return StartCloudRecordResponse
     */
    @Override
    public CompletableFuture<StartCloudRecordResponse> startCloudRecord(StartCloudRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StartCloudRecord").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/startCloudRecord").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartCloudRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartCloudRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartInstance  StartInstanceRequest
     * @return StartInstanceResponse
     */
    @Override
    public CompletableFuture<StartInstanceResponse> startInstance(StartInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StartInstance").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/startInstance").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartMinutes  StartMinutesRequest
     * @return StartMinutesResponse
     */
    @Override
    public CompletableFuture<StartMinutesResponse> startMinutes(StartMinutesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StartMinutes").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/startMinutes").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartMinutesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartMinutesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StatisticsListByTypeReport  StatisticsListByTypeReportRequest
     * @return StatisticsListByTypeReportResponse
     */
    @Override
    public CompletableFuture<StatisticsListByTypeReportResponse> statisticsListByTypeReport(StatisticsListByTypeReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StatisticsListByTypeReport").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/log/statisticsListByTypeReport").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StatisticsListByTypeReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StatisticsListByTypeReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StatisticsReport  StatisticsReportRequest
     * @return StatisticsReportResponse
     */
    @Override
    public CompletableFuture<StatisticsReportResponse> statisticsReport(StatisticsReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StatisticsReport").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/log/statisticsReport").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StatisticsReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StatisticsReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopCloudRecord  StopCloudRecordRequest
     * @return StopCloudRecordResponse
     */
    @Override
    public CompletableFuture<StopCloudRecordResponse> stopCloudRecord(StopCloudRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopCloudRecord").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/stopCloudRecord").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopCloudRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopCloudRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopMinutes  StopMinutesRequest
     * @return StopMinutesResponse
     */
    @Override
    public CompletableFuture<StopMinutesResponse> stopMinutes(StopMinutesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopMinutes").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/stopMinutes").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopMinutesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopMinutesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubscribeCalendar  SubscribeCalendarRequest
     * @return SubscribeCalendarResponse
     */
    @Override
    public CompletableFuture<SubscribeCalendarResponse> subscribeCalendar(SubscribeCalendarRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SubscribeCalendar").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/calendar/subscribeCalendar").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubscribeCalendarResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubscribeCalendarResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubscribeEvent  SubscribeEventRequest
     * @return SubscribeEventResponse
     */
    @Override
    public CompletableFuture<SubscribeEventResponse> subscribeEvent(SubscribeEventRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SubscribeEvent").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/subscribeEvent").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubscribeEventResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubscribeEventResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SwitchMainOrg  SwitchMainOrgRequest
     * @return SwitchMainOrgResponse
     */
    @Override
    public CompletableFuture<SwitchMainOrgResponse> switchMainOrg(SwitchMainOrgRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SwitchMainOrg").setMethod(HttpMethod.POST).setPathRegex("/aliding/v1/user/switchMainOrg").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SwitchMainOrgResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SwitchMainOrgResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SyncDingType  SyncDingTypeRequest
     * @return SyncDingTypeResponse
     */
    @Override
    public CompletableFuture<SyncDingTypeResponse> syncDingType(SyncDingTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SyncDingType").setMethod(HttpMethod.POST).setPathRegex("/aliding/v1/indepding/syncDingType").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SyncDingTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SyncDingTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TerminateInstance  TerminateInstanceRequest
     * @return TerminateInstanceResponse
     */
    @Override
    public CompletableFuture<TerminateInstanceResponse> terminateInstance(TerminateInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TerminateInstance").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/terminateInstance").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TerminateInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TerminateInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TransferTicket  TransferTicketRequest
     * @return TransferTicketResponse
     */
    @Override
    public CompletableFuture<TransferTicketResponse> transferTicket(TransferTicketRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TransferTicket").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ticket/transferTicket").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TransferTicketResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TransferTicketResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UnsubscribeCalendar  UnsubscribeCalendarRequest
     * @return UnsubscribeCalendarResponse
     */
    @Override
    public CompletableFuture<UnsubscribeCalendarResponse> unsubscribeCalendar(UnsubscribeCalendarRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UnsubscribeCalendar").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/calendar/unsubscribeCalendar").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnsubscribeCalendarResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnsubscribeCalendarResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UnsubscribeEvent  UnsubscribeEventRequest
     * @return UnsubscribeEventResponse
     */
    @Override
    public CompletableFuture<UnsubscribeEventResponse> unsubscribeEvent(UnsubscribeEventRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UnsubscribeEvent").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/unsubscribeEvent").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnsubscribeEventResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnsubscribeEventResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateFormData  UpdateFormDataRequest
     * @return UpdateFormDataResponse
     */
    @Override
    public CompletableFuture<UpdateFormDataResponse> updateFormData(UpdateFormDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateFormData").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/updateFormData").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateFormDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateFormDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateInstance  UpdateInstanceRequest
     * @return UpdateInstanceResponse
     */
    @Override
    public CompletableFuture<UpdateInstanceResponse> updateInstance(UpdateInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateInstance").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/updateInstance").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateLive  UpdateLiveRequest
     * @return UpdateLiveResponse
     */
    @Override
    public CompletableFuture<UpdateLiveResponse> updateLive(UpdateLiveRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateLive").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/updateLive").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLiveResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLiveResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateMeetingRoom  UpdateMeetingRoomRequest
     * @return UpdateMeetingRoomResponse
     */
    @Override
    public CompletableFuture<UpdateMeetingRoomResponse> updateMeetingRoom(UpdateMeetingRoomRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateMeetingRoom").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/updateMeetingRoom").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMeetingRoomResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMeetingRoomResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateMeetingRoomGroup  UpdateMeetingRoomGroupRequest
     * @return UpdateMeetingRoomGroupResponse
     */
    @Override
    public CompletableFuture<UpdateMeetingRoomGroupResponse> updateMeetingRoomGroup(UpdateMeetingRoomGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateMeetingRoomGroup").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/updateMeetingRoomGroup").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMeetingRoomGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMeetingRoomGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateMultiDimTable  UpdateMultiDimTableRequest
     * @return UpdateMultiDimTableResponse
     */
    @Override
    public CompletableFuture<UpdateMultiDimTableResponse> updateMultiDimTable(UpdateMultiDimTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateMultiDimTable").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/table/updateMultiDimTable").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMultiDimTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMultiDimTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateMultiDimTableField  UpdateMultiDimTableFieldRequest
     * @return UpdateMultiDimTableFieldResponse
     */
    @Override
    public CompletableFuture<UpdateMultiDimTableFieldResponse> updateMultiDimTableField(UpdateMultiDimTableFieldRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateMultiDimTableField").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/table/updateMultiDimTableField").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMultiDimTableFieldResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMultiDimTableFieldResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateMultiDimTableRecords  UpdateMultiDimTableRecordsRequest
     * @return UpdateMultiDimTableRecordsResponse
     */
    @Override
    public CompletableFuture<UpdateMultiDimTableRecordsResponse> updateMultiDimTableRecords(UpdateMultiDimTableRecordsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateMultiDimTableRecords").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/table/updateMultiDimTableRecords").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMultiDimTableRecordsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMultiDimTableRecordsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdatePermission  UpdatePermissionRequest
     * @return UpdatePermissionResponse
     */
    @Override
    public CompletableFuture<UpdatePermissionResponse> updatePermission(UpdatePermissionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdatePermission").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/updatePermission").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePermissionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePermissionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateRange  UpdateRangeRequest
     * @return UpdateRangeResponse
     */
    @Override
    public CompletableFuture<UpdateRangeResponse> updateRange(UpdateRangeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateRange").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/updateRange").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateRangeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateRangeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateScheduleConfSettings  UpdateScheduleConfSettingsRequest
     * @return UpdateScheduleConfSettingsResponse
     */
    @Override
    public CompletableFuture<UpdateScheduleConfSettingsResponse> updateScheduleConfSettings(UpdateScheduleConfSettingsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateScheduleConfSettings").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/updateScheduleConfSettings").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateScheduleConfSettingsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateScheduleConfSettingsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateScheduleConference  UpdateScheduleConferenceRequest
     * @return UpdateScheduleConferenceResponse
     */
    @Override
    public CompletableFuture<UpdateScheduleConferenceResponse> updateScheduleConference(UpdateScheduleConferenceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateScheduleConference").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/updateScheduleConference").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateScheduleConferenceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateScheduleConferenceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateStatus  UpdateStatusRequest
     * @return UpdateStatusResponse
     */
    @Override
    public CompletableFuture<UpdateStatusResponse> updateStatus(UpdateStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateStatus").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/yida/updateStatus").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateSubscribedCalendars  UpdateSubscribedCalendarsRequest
     * @return UpdateSubscribedCalendarsResponse
     */
    @Override
    public CompletableFuture<UpdateSubscribedCalendarsResponse> updateSubscribedCalendars(UpdateSubscribedCalendarsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateSubscribedCalendars").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/calendar/updateSubscribedCalendars").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSubscribedCalendarsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSubscribedCalendarsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateTodoTask  UpdateTodoTaskRequest
     * @return UpdateTodoTaskResponse
     */
    @Override
    public CompletableFuture<UpdateTodoTaskResponse> updateTodoTask(UpdateTodoTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateTodoTask").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/task/updateTodoTask").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTodoTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTodoTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateTodoTaskExecutorStatus  UpdateTodoTaskExecutorStatusRequest
     * @return UpdateTodoTaskExecutorStatusResponse
     */
    @Override
    public CompletableFuture<UpdateTodoTaskExecutorStatusResponse> updateTodoTaskExecutorStatus(UpdateTodoTaskExecutorStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateTodoTaskExecutorStatus").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/task/updateTodoTaskExecutorStatus").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTodoTaskExecutorStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTodoTaskExecutorStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateUserAvatar  UpdateUserAvatarRequest
     * @return UpdateUserAvatarResponse
     */
    @Override
    public CompletableFuture<UpdateUserAvatarResponse> updateUserAvatar(UpdateUserAvatarRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateUserAvatar").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/contact/updateUserAvatar").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateUserAvatarResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateUserAvatarResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateVideoConferenceSetting  UpdateVideoConferenceSettingRequest
     * @return UpdateVideoConferenceSettingResponse
     */
    @Override
    public CompletableFuture<UpdateVideoConferenceSettingResponse> updateVideoConferenceSetting(UpdateVideoConferenceSettingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateVideoConferenceSetting").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/ysp/updateVideoConferenceSetting").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateVideoConferenceSettingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateVideoConferenceSettingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateWorkspaceDocMembers  UpdateWorkspaceDocMembersRequest
     * @return UpdateWorkspaceDocMembersResponse
     */
    @Override
    public CompletableFuture<UpdateWorkspaceDocMembersResponse> updateWorkspaceDocMembers(UpdateWorkspaceDocMembersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateWorkspaceDocMembers").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/updateWorkspaceDocMembers").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateWorkspaceDocMembersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateWorkspaceDocMembersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateWorkspaceMembers  UpdateWorkspaceMembersRequest
     * @return UpdateWorkspaceMembersResponse
     */
    @Override
    public CompletableFuture<UpdateWorkspaceMembersResponse> updateWorkspaceMembers(UpdateWorkspaceMembersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateWorkspaceMembers").setMethod(HttpMethod.POST).setPathRegex("/dingtalk/v1/documents/updateWorkspaceMembers").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateWorkspaceMembersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateWorkspaceMembersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UploadMedia  UploadMediaRequest
     * @return UploadMediaResponse
     */
    @Override
    public CompletableFuture<UploadMediaResponse> uploadMedia(UploadMediaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UploadMedia").setMethod(HttpMethod.POST).setPathRegex("/aliding/v1/documents/uploadMedia").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UploadMediaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UploadMediaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of WearOrgHonor  WearOrgHonorRequest
     * @return WearOrgHonorResponse
     */
    @Override
    public CompletableFuture<WearOrgHonorResponse> wearOrgHonor(WearOrgHonorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("WearOrgHonor").setMethod(HttpMethod.POST).setPathRegex("/aliding/v1/honor/wearOrgHonor").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(WearOrgHonorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<WearOrgHonorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
