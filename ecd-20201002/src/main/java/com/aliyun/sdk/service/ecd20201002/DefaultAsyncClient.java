// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.ecd20201002.models.*;
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
        this.product = "ecd";
        this.version = "2020-10-02";
        this.endpointRule = "regional";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of ApproveFotaUpdate  ApproveFotaUpdateRequest
     * @return ApproveFotaUpdateResponse
     */
    @Override
    public CompletableFuture<ApproveFotaUpdateResponse> approveFotaUpdate(ApproveFotaUpdateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ApproveFotaUpdate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApproveFotaUpdateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApproveFotaUpdateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChangePassword  ChangePasswordRequest
     * @return ChangePasswordResponse
     */
    @Override
    public CompletableFuture<ChangePasswordResponse> changePassword(ChangePasswordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChangePassword").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangePasswordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangePasswordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteFingerPrintTemplate  DeleteFingerPrintTemplateRequest
     * @return DeleteFingerPrintTemplateResponse
     */
    @Override
    public CompletableFuture<DeleteFingerPrintTemplateResponse> deleteFingerPrintTemplate(DeleteFingerPrintTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteFingerPrintTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFingerPrintTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFingerPrintTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDirectories  DescribeDirectoriesRequest
     * @return DescribeDirectoriesResponse
     */
    @Override
    public CompletableFuture<DescribeDirectoriesResponse> describeDirectories(DescribeDirectoriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDirectories").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDirectoriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDirectoriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeFingerPrintTemplates  DescribeFingerPrintTemplatesRequest
     * @return DescribeFingerPrintTemplatesResponse
     */
    @Override
    public CompletableFuture<DescribeFingerPrintTemplatesResponse> describeFingerPrintTemplates(DescribeFingerPrintTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeFingerPrintTemplates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeFingerPrintTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeFingerPrintTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeGlobalDesktops  DescribeGlobalDesktopsRequest
     * @return DescribeGlobalDesktopsResponse
     */
    @Override
    public CompletableFuture<DescribeGlobalDesktopsResponse> describeGlobalDesktops(DescribeGlobalDesktopsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeGlobalDesktops").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeGlobalDesktopsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeGlobalDesktopsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeOfficeSites  DescribeOfficeSitesRequest
     * @return DescribeOfficeSitesResponse
     */
    @Override
    public CompletableFuture<DescribeOfficeSitesResponse> describeOfficeSites(DescribeOfficeSitesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeOfficeSites").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeOfficeSitesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeOfficeSitesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    @Override
    public CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRegions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSnapshots  DescribeSnapshotsRequest
     * @return DescribeSnapshotsResponse
     */
    @Override
    public CompletableFuture<DescribeSnapshotsResponse> describeSnapshots(DescribeSnapshotsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSnapshots").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSnapshotsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSnapshotsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeUserResources  DescribeUserResourcesRequest
     * @return DescribeUserResourcesResponse
     */
    @Override
    public CompletableFuture<DescribeUserResourcesResponse> describeUserResources(DescribeUserResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUserResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUserResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUserResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EncryptPassword  EncryptPasswordRequest
     * @return EncryptPasswordResponse
     */
    @Override
    public CompletableFuture<EncryptPasswordResponse> encryptPassword(EncryptPasswordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EncryptPassword").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EncryptPasswordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EncryptPasswordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCloudDriveServiceMountToken  GetCloudDriveServiceMountTokenRequest
     * @return GetCloudDriveServiceMountTokenResponse
     */
    @Override
    public CompletableFuture<GetCloudDriveServiceMountTokenResponse> getCloudDriveServiceMountToken(GetCloudDriveServiceMountTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCloudDriveServiceMountToken").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCloudDriveServiceMountTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCloudDriveServiceMountTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetConnectionTicket  GetConnectionTicketRequest
     * @return GetConnectionTicketResponse
     */
    @Override
    public CompletableFuture<GetConnectionTicketResponse> getConnectionTicket(GetConnectionTicketRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetConnectionTicket").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetConnectionTicketResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetConnectionTicketResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLoginToken  GetLoginTokenRequest
     * @return GetLoginTokenResponse
     */
    @Override
    public CompletableFuture<GetLoginTokenResponse> getLoginToken(GetLoginTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetLoginToken").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLoginTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLoginTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of IsKeepAlive  IsKeepAliveRequest
     * @return IsKeepAliveResponse
     */
    @Override
    public CompletableFuture<IsKeepAliveResponse> isKeepAlive(IsKeepAliveRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("IsKeepAlive").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(IsKeepAliveResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<IsKeepAliveResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryEdsAgentReportConfig  QueryEdsAgentReportConfigRequest
     * @return QueryEdsAgentReportConfigResponse
     */
    @Override
    public CompletableFuture<QueryEdsAgentReportConfigResponse> queryEdsAgentReportConfig(QueryEdsAgentReportConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryEdsAgentReportConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryEdsAgentReportConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryEdsAgentReportConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RebootDesktops  RebootDesktopsRequest
     * @return RebootDesktopsResponse
     */
    @Override
    public CompletableFuture<RebootDesktopsResponse> rebootDesktops(RebootDesktopsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RebootDesktops").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RebootDesktopsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RebootDesktopsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RefreshLoginToken  RefreshLoginTokenRequest
     * @return RefreshLoginTokenResponse
     */
    @Override
    public CompletableFuture<RefreshLoginTokenResponse> refreshLoginToken(RefreshLoginTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RefreshLoginToken").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RefreshLoginTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RefreshLoginTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReportEdsAgentInfo  ReportEdsAgentInfoRequest
     * @return ReportEdsAgentInfoResponse
     */
    @Override
    public CompletableFuture<ReportEdsAgentInfoResponse> reportEdsAgentInfo(ReportEdsAgentInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReportEdsAgentInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReportEdsAgentInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReportEdsAgentInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReportSessionStatus  ReportSessionStatusRequest
     * @return ReportSessionStatusResponse
     */
    @Override
    public CompletableFuture<ReportSessionStatusResponse> reportSessionStatus(ReportSessionStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReportSessionStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReportSessionStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReportSessionStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ResetPassword  ResetPasswordRequest
     * @return ResetPasswordResponse
     */
    @Override
    public CompletableFuture<ResetPasswordResponse> resetPassword(ResetPasswordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResetPassword").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetPasswordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetPasswordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ResetSnapshot  ResetSnapshotRequest
     * @return ResetSnapshotResponse
     */
    @Override
    public CompletableFuture<ResetSnapshotResponse> resetSnapshot(ResetSnapshotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResetSnapshot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetSnapshotResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetSnapshotResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SendTokenCode  SendTokenCodeRequest
     * @return SendTokenCodeResponse
     */
    @Override
    public CompletableFuture<SendTokenCodeResponse> sendTokenCode(SendTokenCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SendTokenCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendTokenCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendTokenCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetFingerPrintTemplate  SetFingerPrintTemplateRequest
     * @return SetFingerPrintTemplateResponse
     */
    @Override
    public CompletableFuture<SetFingerPrintTemplateResponse> setFingerPrintTemplate(SetFingerPrintTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetFingerPrintTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetFingerPrintTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetFingerPrintTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetFingerPrintTemplateDescription  SetFingerPrintTemplateDescriptionRequest
     * @return SetFingerPrintTemplateDescriptionResponse
     */
    @Override
    public CompletableFuture<SetFingerPrintTemplateDescriptionResponse> setFingerPrintTemplateDescription(SetFingerPrintTemplateDescriptionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetFingerPrintTemplateDescription").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetFingerPrintTemplateDescriptionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetFingerPrintTemplateDescriptionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The cloud computers that you want to start must be in the Stopped state. After you call this operation, the cloud computers enter the Running state.</p>
     * 
     * @param request the request parameters of StartDesktops  StartDesktopsRequest
     * @return StartDesktopsResponse
     */
    @Override
    public CompletableFuture<StartDesktopsResponse> startDesktops(StartDesktopsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartDesktops").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartDesktopsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartDesktopsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartRecordContent  StartRecordContentRequest
     * @return StartRecordContentResponse
     */
    @Override
    public CompletableFuture<StartRecordContentResponse> startRecordContent(StartRecordContentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartRecordContent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartRecordContentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartRecordContentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The cloud computers that you want to stop must be in the Running state. After you call this operation, the cloud computers enter the Stopped state.</p>
     * 
     * @param request the request parameters of StopDesktops  StopDesktopsRequest
     * @return StopDesktopsResponse
     */
    @Override
    public CompletableFuture<StopDesktopsResponse> stopDesktops(StopDesktopsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopDesktops").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopDesktopsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopDesktopsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopRecordContent  StopRecordContentRequest
     * @return StopRecordContentResponse
     */
    @Override
    public CompletableFuture<StopRecordContentResponse> stopRecordContent(StopRecordContentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopRecordContent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopRecordContentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopRecordContentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UnbindUserDesktop  UnbindUserDesktopRequest
     * @return UnbindUserDesktopResponse
     */
    @Override
    public CompletableFuture<UnbindUserDesktopResponse> unbindUserDesktop(UnbindUserDesktopRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnbindUserDesktop").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnbindUserDesktopResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnbindUserDesktopResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of VerifyCredential  VerifyCredentialRequest
     * @return VerifyCredentialResponse
     */
    @Override
    public CompletableFuture<VerifyCredentialResponse> verifyCredential(VerifyCredentialRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("VerifyCredential").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VerifyCredentialResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VerifyCredentialResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
