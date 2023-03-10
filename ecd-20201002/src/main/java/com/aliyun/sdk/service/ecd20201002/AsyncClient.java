// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ecd20201002.models.*;
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

    CompletableFuture<ApproveFotaUpdateResponse> approveFotaUpdate(ApproveFotaUpdateRequest request);

    CompletableFuture<ChangePasswordResponse> changePassword(ChangePasswordRequest request);

    CompletableFuture<DeleteFingerPrintTemplateResponse> deleteFingerPrintTemplate(DeleteFingerPrintTemplateRequest request);

    CompletableFuture<DescribeDirectoriesResponse> describeDirectories(DescribeDirectoriesRequest request);

    CompletableFuture<DescribeFingerPrintTemplatesResponse> describeFingerPrintTemplates(DescribeFingerPrintTemplatesRequest request);

    CompletableFuture<DescribeGlobalDesktopsResponse> describeGlobalDesktops(DescribeGlobalDesktopsRequest request);

    CompletableFuture<DescribeOfficeSitesResponse> describeOfficeSites(DescribeOfficeSitesRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeSnapshotsResponse> describeSnapshots(DescribeSnapshotsRequest request);

    CompletableFuture<EncryptPasswordResponse> encryptPassword(EncryptPasswordRequest request);

    CompletableFuture<GetCloudDriveServiceMountTokenResponse> getCloudDriveServiceMountToken(GetCloudDriveServiceMountTokenRequest request);

    CompletableFuture<GetLoginTokenResponse> getLoginToken(GetLoginTokenRequest request);

    CompletableFuture<IsKeepAliveResponse> isKeepAlive(IsKeepAliveRequest request);

    CompletableFuture<RebootDesktopsResponse> rebootDesktops(RebootDesktopsRequest request);

    /**
      * The validity period of a logon token is 15 minutes. If an end user does not exit a client in 15 minutes, the logon token for the client must be refreshed. You can call this operation to refresh the client token.
      *
     */
    CompletableFuture<RefreshLoginTokenResponse> refreshLoginToken(RefreshLoginTokenRequest request);

    CompletableFuture<ReportSessionStatusResponse> reportSessionStatus(ReportSessionStatusRequest request);

    CompletableFuture<ResetPasswordResponse> resetPassword(ResetPasswordRequest request);

    CompletableFuture<ResetSnapshotResponse> resetSnapshot(ResetSnapshotRequest request);

    CompletableFuture<SendTokenCodeResponse> sendTokenCode(SendTokenCodeRequest request);

    CompletableFuture<SetFingerPrintTemplateResponse> setFingerPrintTemplate(SetFingerPrintTemplateRequest request);

    CompletableFuture<SetFingerPrintTemplateDescriptionResponse> setFingerPrintTemplateDescription(SetFingerPrintTemplateDescriptionRequest request);

    /**
      * ## Description
      * If the call is successful, the cloud desktops enter the Running state.
      *
     */
    CompletableFuture<StartDesktopsResponse> startDesktops(StartDesktopsRequest request);

    CompletableFuture<StartRecordContentResponse> startRecordContent(StartRecordContentRequest request);

    /**
      * ## Description
      * The cloud desktops that you want to stop by calling this operation must be in the Running state. If the call is successful, the cloud desktops enter the Stopped state.
      *
     */
    CompletableFuture<StopDesktopsResponse> stopDesktops(StopDesktopsRequest request);

    CompletableFuture<StopRecordContentResponse> stopRecordContent(StopRecordContentRequest request);

    CompletableFuture<UnbindUserDesktopResponse> unbindUserDesktop(UnbindUserDesktopRequest request);

    CompletableFuture<VerifyCredentialResponse> verifyCredential(VerifyCredentialRequest request);

}
