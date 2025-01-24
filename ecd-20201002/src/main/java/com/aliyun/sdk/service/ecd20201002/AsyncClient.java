// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ecd20201002.models.*;
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
     * @param request the request parameters of ApproveFotaUpdate  ApproveFotaUpdateRequest
     * @return ApproveFotaUpdateResponse
     */
    CompletableFuture<ApproveFotaUpdateResponse> approveFotaUpdate(ApproveFotaUpdateRequest request);

    /**
     * @param request the request parameters of ChangePassword  ChangePasswordRequest
     * @return ChangePasswordResponse
     */
    CompletableFuture<ChangePasswordResponse> changePassword(ChangePasswordRequest request);

    /**
     * @param request the request parameters of DeleteFingerPrintTemplate  DeleteFingerPrintTemplateRequest
     * @return DeleteFingerPrintTemplateResponse
     */
    CompletableFuture<DeleteFingerPrintTemplateResponse> deleteFingerPrintTemplate(DeleteFingerPrintTemplateRequest request);

    /**
     * @param request the request parameters of DescribeDirectories  DescribeDirectoriesRequest
     * @return DescribeDirectoriesResponse
     */
    CompletableFuture<DescribeDirectoriesResponse> describeDirectories(DescribeDirectoriesRequest request);

    /**
     * @param request the request parameters of DescribeFingerPrintTemplates  DescribeFingerPrintTemplatesRequest
     * @return DescribeFingerPrintTemplatesResponse
     */
    CompletableFuture<DescribeFingerPrintTemplatesResponse> describeFingerPrintTemplates(DescribeFingerPrintTemplatesRequest request);

    /**
     * @param request the request parameters of DescribeGlobalDesktops  DescribeGlobalDesktopsRequest
     * @return DescribeGlobalDesktopsResponse
     */
    CompletableFuture<DescribeGlobalDesktopsResponse> describeGlobalDesktops(DescribeGlobalDesktopsRequest request);

    /**
     * @param request the request parameters of DescribeOfficeSites  DescribeOfficeSitesRequest
     * @return DescribeOfficeSitesResponse
     */
    CompletableFuture<DescribeOfficeSitesResponse> describeOfficeSites(DescribeOfficeSitesRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of DescribeSnapshots  DescribeSnapshotsRequest
     * @return DescribeSnapshotsResponse
     */
    CompletableFuture<DescribeSnapshotsResponse> describeSnapshots(DescribeSnapshotsRequest request);

    /**
     * @param request the request parameters of DescribeUserResources  DescribeUserResourcesRequest
     * @return DescribeUserResourcesResponse
     */
    CompletableFuture<DescribeUserResourcesResponse> describeUserResources(DescribeUserResourcesRequest request);

    /**
     * @param request the request parameters of EncryptPassword  EncryptPasswordRequest
     * @return EncryptPasswordResponse
     */
    CompletableFuture<EncryptPasswordResponse> encryptPassword(EncryptPasswordRequest request);

    /**
     * @param request the request parameters of GetCloudDriveServiceMountToken  GetCloudDriveServiceMountTokenRequest
     * @return GetCloudDriveServiceMountTokenResponse
     */
    CompletableFuture<GetCloudDriveServiceMountTokenResponse> getCloudDriveServiceMountToken(GetCloudDriveServiceMountTokenRequest request);

    /**
     * @param request the request parameters of GetConnectionTicket  GetConnectionTicketRequest
     * @return GetConnectionTicketResponse
     */
    CompletableFuture<GetConnectionTicketResponse> getConnectionTicket(GetConnectionTicketRequest request);

    /**
     * @param request the request parameters of GetLoginToken  GetLoginTokenRequest
     * @return GetLoginTokenResponse
     */
    CompletableFuture<GetLoginTokenResponse> getLoginToken(GetLoginTokenRequest request);

    /**
     * @param request the request parameters of IsKeepAlive  IsKeepAliveRequest
     * @return IsKeepAliveResponse
     */
    CompletableFuture<IsKeepAliveResponse> isKeepAlive(IsKeepAliveRequest request);

    /**
     * @param request the request parameters of QueryEdsAgentReportConfig  QueryEdsAgentReportConfigRequest
     * @return QueryEdsAgentReportConfigResponse
     */
    CompletableFuture<QueryEdsAgentReportConfigResponse> queryEdsAgentReportConfig(QueryEdsAgentReportConfigRequest request);

    /**
     * @param request the request parameters of RebootDesktops  RebootDesktopsRequest
     * @return RebootDesktopsResponse
     */
    CompletableFuture<RebootDesktopsResponse> rebootDesktops(RebootDesktopsRequest request);

    /**
     * @param request the request parameters of RefreshLoginToken  RefreshLoginTokenRequest
     * @return RefreshLoginTokenResponse
     */
    CompletableFuture<RefreshLoginTokenResponse> refreshLoginToken(RefreshLoginTokenRequest request);

    /**
     * @param request the request parameters of ReportEdsAgentInfo  ReportEdsAgentInfoRequest
     * @return ReportEdsAgentInfoResponse
     */
    CompletableFuture<ReportEdsAgentInfoResponse> reportEdsAgentInfo(ReportEdsAgentInfoRequest request);

    /**
     * @param request the request parameters of ReportSessionStatus  ReportSessionStatusRequest
     * @return ReportSessionStatusResponse
     */
    CompletableFuture<ReportSessionStatusResponse> reportSessionStatus(ReportSessionStatusRequest request);

    /**
     * @param request the request parameters of ResetPassword  ResetPasswordRequest
     * @return ResetPasswordResponse
     */
    CompletableFuture<ResetPasswordResponse> resetPassword(ResetPasswordRequest request);

    /**
     * @param request the request parameters of ResetSnapshot  ResetSnapshotRequest
     * @return ResetSnapshotResponse
     */
    CompletableFuture<ResetSnapshotResponse> resetSnapshot(ResetSnapshotRequest request);

    /**
     * @param request the request parameters of SendTokenCode  SendTokenCodeRequest
     * @return SendTokenCodeResponse
     */
    CompletableFuture<SendTokenCodeResponse> sendTokenCode(SendTokenCodeRequest request);

    /**
     * @param request the request parameters of SetFingerPrintTemplate  SetFingerPrintTemplateRequest
     * @return SetFingerPrintTemplateResponse
     */
    CompletableFuture<SetFingerPrintTemplateResponse> setFingerPrintTemplate(SetFingerPrintTemplateRequest request);

    /**
     * @param request the request parameters of SetFingerPrintTemplateDescription  SetFingerPrintTemplateDescriptionRequest
     * @return SetFingerPrintTemplateDescriptionResponse
     */
    CompletableFuture<SetFingerPrintTemplateDescriptionResponse> setFingerPrintTemplateDescription(SetFingerPrintTemplateDescriptionRequest request);

    /**
     * <b>description</b> :
     * <p>The cloud computers that you want to start must be in the Stopped state. After you call this operation, the cloud computers enter the Running state.</p>
     * 
     * @param request the request parameters of StartDesktops  StartDesktopsRequest
     * @return StartDesktopsResponse
     */
    CompletableFuture<StartDesktopsResponse> startDesktops(StartDesktopsRequest request);

    /**
     * @param request the request parameters of StartRecordContent  StartRecordContentRequest
     * @return StartRecordContentResponse
     */
    CompletableFuture<StartRecordContentResponse> startRecordContent(StartRecordContentRequest request);

    /**
     * <b>description</b> :
     * <p>The cloud computers that you want to stop must be in the Running state. After you call this operation, the cloud computers enter the Stopped state.</p>
     * 
     * @param request the request parameters of StopDesktops  StopDesktopsRequest
     * @return StopDesktopsResponse
     */
    CompletableFuture<StopDesktopsResponse> stopDesktops(StopDesktopsRequest request);

    /**
     * @param request the request parameters of StopRecordContent  StopRecordContentRequest
     * @return StopRecordContentResponse
     */
    CompletableFuture<StopRecordContentResponse> stopRecordContent(StopRecordContentRequest request);

    /**
     * @param request the request parameters of UnbindUserDesktop  UnbindUserDesktopRequest
     * @return UnbindUserDesktopResponse
     */
    CompletableFuture<UnbindUserDesktopResponse> unbindUserDesktop(UnbindUserDesktopRequest request);

    /**
     * @param request the request parameters of VerifyCredential  VerifyCredentialRequest
     * @return VerifyCredentialResponse
     */
    CompletableFuture<VerifyCredentialResponse> verifyCredential(VerifyCredentialRequest request);

}
