// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.pts20201020.models.*;
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

    CompletableFuture<AdjustJMeterSceneSpeedResponse> adjustJMeterSceneSpeed(AdjustJMeterSceneSpeedRequest request);

    CompletableFuture<AdjustPtsSceneSpeedResponse> adjustPtsSceneSpeed(AdjustPtsSceneSpeedRequest request);

    CompletableFuture<CreatePtsSceneResponse> createPtsScene(CreatePtsSceneRequest request);

    CompletableFuture<CreatePtsSceneBaseLineFromReportResponse> createPtsSceneBaseLineFromReport(CreatePtsSceneBaseLineFromReportRequest request);

    CompletableFuture<DeletePtsSceneResponse> deletePtsScene(DeletePtsSceneRequest request);

    CompletableFuture<DeletePtsSceneBaseLineResponse> deletePtsSceneBaseLine(DeletePtsSceneBaseLineRequest request);

    CompletableFuture<DeletePtsScenesResponse> deletePtsScenes(DeletePtsScenesRequest request);

    CompletableFuture<GetAllRegionsResponse> getAllRegions(GetAllRegionsRequest request);

    CompletableFuture<GetJMeterLogsResponse> getJMeterLogs(GetJMeterLogsRequest request);

    CompletableFuture<GetJMeterReportDetailsResponse> getJMeterReportDetails(GetJMeterReportDetailsRequest request);

    CompletableFuture<GetJMeterSampleMetricsResponse> getJMeterSampleMetrics(GetJMeterSampleMetricsRequest request);

    CompletableFuture<GetJMeterSamplingLogsResponse> getJMeterSamplingLogs(GetJMeterSamplingLogsRequest request);

    CompletableFuture<GetJMeterSceneRunningDataResponse> getJMeterSceneRunningData(GetJMeterSceneRunningDataRequest request);

    CompletableFuture<GetOpenJMeterSceneResponse> getOpenJMeterScene(GetOpenJMeterSceneRequest request);

    CompletableFuture<GetPtsDebugSampleLogsResponse> getPtsDebugSampleLogs(GetPtsDebugSampleLogsRequest request);

    CompletableFuture<GetPtsReportDetailsResponse> getPtsReportDetails(GetPtsReportDetailsRequest request);

    CompletableFuture<GetPtsReportsBySceneIdResponse> getPtsReportsBySceneId(GetPtsReportsBySceneIdRequest request);

    CompletableFuture<GetPtsSceneResponse> getPtsScene(GetPtsSceneRequest request);

    CompletableFuture<GetPtsSceneBaseLineResponse> getPtsSceneBaseLine(GetPtsSceneBaseLineRequest request);

    CompletableFuture<GetPtsSceneRunningDataResponse> getPtsSceneRunningData(GetPtsSceneRunningDataRequest request);

    CompletableFuture<GetPtsSceneRunningStatusResponse> getPtsSceneRunningStatus(GetPtsSceneRunningStatusRequest request);

    CompletableFuture<GetUserVpcSecurityGroupResponse> getUserVpcSecurityGroup(GetUserVpcSecurityGroupRequest request);

    CompletableFuture<GetUserVpcVSwitchResponse> getUserVpcVSwitch(GetUserVpcVSwitchRequest request);

    CompletableFuture<GetUserVpcsResponse> getUserVpcs(GetUserVpcsRequest request);

    CompletableFuture<ListEnvsResponse> listEnvs(ListEnvsRequest request);

    CompletableFuture<ListJMeterReportsResponse> listJMeterReports(ListJMeterReportsRequest request);

    CompletableFuture<ListOpenJMeterScenesResponse> listOpenJMeterScenes(ListOpenJMeterScenesRequest request);

    CompletableFuture<ListPtsReportsResponse> listPtsReports(ListPtsReportsRequest request);

    CompletableFuture<ListPtsSceneResponse> listPtsScene(ListPtsSceneRequest request);

    CompletableFuture<ModifyPtsSceneResponse> modifyPtsScene(ModifyPtsSceneRequest request);

    CompletableFuture<RemoveEnvResponse> removeEnv(RemoveEnvRequest request);

    CompletableFuture<RemoveOpenJMeterSceneResponse> removeOpenJMeterScene(RemoveOpenJMeterSceneRequest request);

    CompletableFuture<SaveEnvResponse> saveEnv(SaveEnvRequest request);

    CompletableFuture<SaveOpenJMeterSceneResponse> saveOpenJMeterScene(SaveOpenJMeterSceneRequest request);

    CompletableFuture<SavePtsSceneResponse> savePtsScene(SavePtsSceneRequest request);

    CompletableFuture<StartDebugPtsSceneResponse> startDebugPtsScene(StartDebugPtsSceneRequest request);

    CompletableFuture<StartDebuggingJMeterSceneResponse> startDebuggingJMeterScene(StartDebuggingJMeterSceneRequest request);

    CompletableFuture<StartPtsSceneResponse> startPtsScene(StartPtsSceneRequest request);

    CompletableFuture<StartTestingJMeterSceneResponse> startTestingJMeterScene(StartTestingJMeterSceneRequest request);

    CompletableFuture<StopDebugPtsSceneResponse> stopDebugPtsScene(StopDebugPtsSceneRequest request);

    CompletableFuture<StopDebuggingJMeterSceneResponse> stopDebuggingJMeterScene(StopDebuggingJMeterSceneRequest request);

    CompletableFuture<StopPtsSceneResponse> stopPtsScene(StopPtsSceneRequest request);

    CompletableFuture<StopTestingJMeterSceneResponse> stopTestingJMeterScene(StopTestingJMeterSceneRequest request);

    CompletableFuture<UpdatePtsSceneBaseLineResponse> updatePtsSceneBaseLine(UpdatePtsSceneBaseLineRequest request);

}
