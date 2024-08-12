// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.wyota20210420.models.*;
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

    CompletableFuture<ActivateDeviceResponse> activateDevice(ActivateDeviceRequest request);

    CompletableFuture<AddDeviceFromSNResponse> addDeviceFromSN(AddDeviceFromSNRequest request);

    CompletableFuture<AddDeviceSeatsAndLabelsResponse> addDeviceSeatsAndLabels(AddDeviceSeatsAndLabelsRequest request);

    CompletableFuture<AddDevicesFromCSVResponse> addDevicesFromCSV(AddDevicesFromCSVRequest request);

    CompletableFuture<AddLabelsResponse> addLabels(AddLabelsRequest request);

    CompletableFuture<AddOrUpdateDeviceSeatsResponse> addOrUpdateDeviceSeats(AddOrUpdateDeviceSeatsRequest request);

    CompletableFuture<AddTerminalResponse> addTerminal(AddTerminalRequest request);

    CompletableFuture<AttachEndUsersResponse> attachEndUsers(AttachEndUsersRequest request);

    CompletableFuture<AttachLabelResponse> attachLabel(AttachLabelRequest request);

    CompletableFuture<AttachLabelsResponse> attachLabels(AttachLabelsRequest request);

    CompletableFuture<BindAccountLessLoginUserResponse> bindAccountLessLoginUser(BindAccountLessLoginUserRequest request);

    CompletableFuture<CheckUuidValidResponse> checkUuidValid(CheckUuidValidRequest request);

    CompletableFuture<CreateAppOtaTaskResponse> createAppOtaTask(CreateAppOtaTaskRequest request);

    CompletableFuture<CreateAppOtaVersionResponse> createAppOtaVersion(CreateAppOtaVersionRequest request);

    CompletableFuture<DeleteAppOtaVersionsResponse> deleteAppOtaVersions(DeleteAppOtaVersionsRequest request);

    CompletableFuture<DeleteDevicesResponse> deleteDevices(DeleteDevicesRequest request);

    CompletableFuture<DeleteLabelResponse> deleteLabel(DeleteLabelRequest request);

    CompletableFuture<DescribeAppOtaVersionResponse> describeAppOtaVersion(DescribeAppOtaVersionRequest request);

    CompletableFuture<DescribeDeviceSeatsResponse> describeDeviceSeats(DescribeDeviceSeatsRequest request);

    CompletableFuture<DescribeDeviceVersionDetailResponse> describeDeviceVersionDetail(DescribeDeviceVersionDetailRequest request);

    CompletableFuture<DescribeSnLabelCountsResponse> describeSnLabelCounts(DescribeSnLabelCountsRequest request);

    CompletableFuture<DescribeWorkZonesResponse> describeWorkZones(DescribeWorkZonesRequest request);

    CompletableFuture<DetachEndUsersResponse> detachEndUsers(DetachEndUsersRequest request);

    CompletableFuture<DetachLabelResponse> detachLabel(DetachLabelRequest request);

    CompletableFuture<DetachLabelsResponse> detachLabels(DetachLabelsRequest request);

    CompletableFuture<GenerateOssUrlResponse> generateOssUrl(GenerateOssUrlRequest request);

    CompletableFuture<GetAppOtaLatestVersionResponse> getAppOtaLatestVersion(GetAppOtaLatestVersionRequest request);

    CompletableFuture<GetDeviceConfigsResponse> getDeviceConfigs(GetDeviceConfigsRequest request);

    CompletableFuture<GetDeviceOtaAutoStatusResponse> getDeviceOtaAutoStatus(GetDeviceOtaAutoStatusRequest request);

    CompletableFuture<GetDeviceOtaInfoResponse> getDeviceOtaInfo(GetDeviceOtaInfoRequest request);

    CompletableFuture<GetDeviceOtaInfoTestResponse> getDeviceOtaInfoTest(GetDeviceOtaInfoTestRequest request);

    CompletableFuture<GetDeviceOtaTaskVersionInfoResponse> getDeviceOtaTaskVersionInfo(GetDeviceOtaTaskVersionInfoRequest request);

    CompletableFuture<GetDeviceUpgradeStatusResponse> getDeviceUpgradeStatus(GetDeviceUpgradeStatusRequest request);

    CompletableFuture<GetExportDeviceInfoOssUrlResponse> getExportDeviceInfoOssUrl(GetExportDeviceInfoOssUrlRequest request);

    CompletableFuture<GetFbOssConfigResponse> getFbOssConfig(GetFbOssConfigRequest request);

    CompletableFuture<GetOssConfigResponse> getOssConfig(GetOssConfigRequest request);

    CompletableFuture<GetVersionDownloadUrlResponse> getVersionDownloadUrl(GetVersionDownloadUrlRequest request);

    CompletableFuture<ListDeviceOtaTaskByTenantResponse> listDeviceOtaTaskByTenant(ListDeviceOtaTaskByTenantRequest request);

    CompletableFuture<ListDeviceSeatsResponse> listDeviceSeats(ListDeviceSeatsRequest request);

    CompletableFuture<ListDevicesResponse> listDevices(ListDevicesRequest request);

    CompletableFuture<ListFbIssueLabelsResponse> listFbIssueLabels(ListFbIssueLabelsRequest request);

    CompletableFuture<ListFbIssueLabelsByLCResponse> listFbIssueLabelsByLC(ListFbIssueLabelsByLCRequest request);

    CompletableFuture<ListLabelsResponse> listLabels(ListLabelsRequest request);

    CompletableFuture<ListTenantDeviceOtaInfoResponse> listTenantDeviceOtaInfo(ListTenantDeviceOtaInfoRequest request);

    CompletableFuture<ListTerminalResponse> listTerminal(ListTerminalRequest request);

    CompletableFuture<ListTerminalsResponse> listTerminals(ListTerminalsRequest request);

    CompletableFuture<ListTrustDevicesResponse> listTrustDevices(ListTrustDevicesRequest request);

    CompletableFuture<ListUserFbAcIssuesResponse> listUserFbAcIssues(ListUserFbAcIssuesRequest request);

    CompletableFuture<ListUserFbIssuesResponse> listUserFbIssues(ListUserFbIssuesRequest request);

    CompletableFuture<ModifyDevicesSecureNetworkTypeResponse> modifyDevicesSecureNetworkType(ModifyDevicesSecureNetworkTypeRequest request);

    CompletableFuture<ModifySecureNetworkTypeResponse> modifySecureNetworkType(ModifySecureNetworkTypeRequest request);

    CompletableFuture<RegisterDeviceResponse> registerDevice(RegisterDeviceRequest request);

    CompletableFuture<ReportAppOtaInfoResponse> reportAppOtaInfo(ReportAppOtaInfoRequest request);

    CompletableFuture<ReportDeviceOtaInfoResponse> reportDeviceOtaInfo(ReportDeviceOtaInfoRequest request);

    CompletableFuture<ReportUserFbAcIssueResponse> reportUserFbAcIssue(ReportUserFbAcIssueRequest request);

    CompletableFuture<ReportUserFbIssueResponse> reportUserFbIssue(ReportUserFbIssueRequest request);

    CompletableFuture<SendOpsMessageToTerminalsResponse> sendOpsMessageToTerminals(SendOpsMessageToTerminalsRequest request);

    CompletableFuture<SetDeviceOtaAutoStatusResponse> setDeviceOtaAutoStatus(SetDeviceOtaAutoStatusRequest request);

    CompletableFuture<SetDeviceOtaTaskStatusResponse> setDeviceOtaTaskStatus(SetDeviceOtaTaskStatusRequest request);

    CompletableFuture<UnbindAccountLessLoginUserResponse> unbindAccountLessLoginUser(UnbindAccountLessLoginUserRequest request);

    CompletableFuture<UnbindDeviceSeatsResponse> unbindDeviceSeats(UnbindDeviceSeatsRequest request);

    CompletableFuture<UpdateAliasResponse> updateAlias(UpdateAliasRequest request);

    CompletableFuture<UpdateDeviceBindedEndUserResponse> updateDeviceBindedEndUser(UpdateDeviceBindedEndUserRequest request);

    CompletableFuture<UpdateLabelResponse> updateLabel(UpdateLabelRequest request);

    CompletableFuture<UpdateTerminalPolicyResponse> updateTerminalPolicy(UpdateTerminalPolicyRequest request);

}
