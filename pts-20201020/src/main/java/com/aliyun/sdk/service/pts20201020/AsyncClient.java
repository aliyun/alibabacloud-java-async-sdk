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

    /**
     * @param request the request parameters of AdjustJMeterSceneSpeed  AdjustJMeterSceneSpeedRequest
     * @return AdjustJMeterSceneSpeedResponse
     */
    CompletableFuture<AdjustJMeterSceneSpeedResponse> adjustJMeterSceneSpeed(AdjustJMeterSceneSpeedRequest request);

    /**
     * <b>description</b> :
     * <p>In concurrency mode, only the concurrency of the first API is passed as that of a session.
     * In requests per second (RPS) mode, the RPS of each API can be adjusted. Make sure that the RPS decreases in the API order in the same session.</p>
     * 
     * @param request the request parameters of AdjustPtsSceneSpeed  AdjustPtsSceneSpeedRequest
     * @return AdjustPtsSceneSpeedResponse
     */
    CompletableFuture<AdjustPtsSceneSpeedResponse> adjustPtsSceneSpeed(AdjustPtsSceneSpeedRequest request);

    /**
     * @param request the request parameters of CreatePtsScene  CreatePtsSceneRequest
     * @return CreatePtsSceneResponse
     */
    CompletableFuture<CreatePtsSceneResponse> createPtsScene(CreatePtsSceneRequest request);

    /**
     * @param request the request parameters of CreatePtsSceneBaseLineFromReport  CreatePtsSceneBaseLineFromReportRequest
     * @return CreatePtsSceneBaseLineFromReportResponse
     */
    CompletableFuture<CreatePtsSceneBaseLineFromReportResponse> createPtsSceneBaseLineFromReport(CreatePtsSceneBaseLineFromReportRequest request);

    /**
     * @param request the request parameters of DeletePtsScene  DeletePtsSceneRequest
     * @return DeletePtsSceneResponse
     */
    CompletableFuture<DeletePtsSceneResponse> deletePtsScene(DeletePtsSceneRequest request);

    /**
     * @param request the request parameters of DeletePtsSceneBaseLine  DeletePtsSceneBaseLineRequest
     * @return DeletePtsSceneBaseLineResponse
     */
    CompletableFuture<DeletePtsSceneBaseLineResponse> deletePtsSceneBaseLine(DeletePtsSceneBaseLineRequest request);

    /**
     * @param request the request parameters of DeletePtsScenes  DeletePtsScenesRequest
     * @return DeletePtsScenesResponse
     */
    CompletableFuture<DeletePtsScenesResponse> deletePtsScenes(DeletePtsScenesRequest request);

    /**
     * @param request the request parameters of GetAllRegions  GetAllRegionsRequest
     * @return GetAllRegionsResponse
     */
    CompletableFuture<GetAllRegionsResponse> getAllRegions(GetAllRegionsRequest request);

    /**
     * @param request the request parameters of GetJMeterLogs  GetJMeterLogsRequest
     * @return GetJMeterLogsResponse
     */
    CompletableFuture<GetJMeterLogsResponse> getJMeterLogs(GetJMeterLogsRequest request);

    /**
     * @param request the request parameters of GetJMeterReportDetails  GetJMeterReportDetailsRequest
     * @return GetJMeterReportDetailsResponse
     */
    CompletableFuture<GetJMeterReportDetailsResponse> getJMeterReportDetails(GetJMeterReportDetailsRequest request);

    /**
     * @param request the request parameters of GetJMeterSampleMetrics  GetJMeterSampleMetricsRequest
     * @return GetJMeterSampleMetricsResponse
     */
    CompletableFuture<GetJMeterSampleMetricsResponse> getJMeterSampleMetrics(GetJMeterSampleMetricsRequest request);

    /**
     * @param request the request parameters of GetJMeterSamplingLogs  GetJMeterSamplingLogsRequest
     * @return GetJMeterSamplingLogsResponse
     */
    CompletableFuture<GetJMeterSamplingLogsResponse> getJMeterSamplingLogs(GetJMeterSamplingLogsRequest request);

    /**
     * @param request the request parameters of GetJMeterSceneRunningData  GetJMeterSceneRunningDataRequest
     * @return GetJMeterSceneRunningDataResponse
     */
    CompletableFuture<GetJMeterSceneRunningDataResponse> getJMeterSceneRunningData(GetJMeterSceneRunningDataRequest request);

    /**
     * @param request the request parameters of GetOpenJMeterScene  GetOpenJMeterSceneRequest
     * @return GetOpenJMeterSceneResponse
     */
    CompletableFuture<GetOpenJMeterSceneResponse> getOpenJMeterScene(GetOpenJMeterSceneRequest request);

    /**
     * @param request the request parameters of GetPtsDebugSampleLogs  GetPtsDebugSampleLogsRequest
     * @return GetPtsDebugSampleLogsResponse
     */
    CompletableFuture<GetPtsDebugSampleLogsResponse> getPtsDebugSampleLogs(GetPtsDebugSampleLogsRequest request);

    /**
     * @param request the request parameters of GetPtsReportDetails  GetPtsReportDetailsRequest
     * @return GetPtsReportDetailsResponse
     */
    CompletableFuture<GetPtsReportDetailsResponse> getPtsReportDetails(GetPtsReportDetailsRequest request);

    /**
     * @param request the request parameters of GetPtsReportsBySceneId  GetPtsReportsBySceneIdRequest
     * @return GetPtsReportsBySceneIdResponse
     */
    CompletableFuture<GetPtsReportsBySceneIdResponse> getPtsReportsBySceneId(GetPtsReportsBySceneIdRequest request);

    /**
     * @param request the request parameters of GetPtsScene  GetPtsSceneRequest
     * @return GetPtsSceneResponse
     */
    CompletableFuture<GetPtsSceneResponse> getPtsScene(GetPtsSceneRequest request);

    /**
     * @param request the request parameters of GetPtsSceneBaseLine  GetPtsSceneBaseLineRequest
     * @return GetPtsSceneBaseLineResponse
     */
    CompletableFuture<GetPtsSceneBaseLineResponse> getPtsSceneBaseLine(GetPtsSceneBaseLineRequest request);

    /**
     * @param request the request parameters of GetPtsSceneRunningData  GetPtsSceneRunningDataRequest
     * @return GetPtsSceneRunningDataResponse
     */
    CompletableFuture<GetPtsSceneRunningDataResponse> getPtsSceneRunningData(GetPtsSceneRunningDataRequest request);

    /**
     * @param request the request parameters of GetPtsSceneRunningStatus  GetPtsSceneRunningStatusRequest
     * @return GetPtsSceneRunningStatusResponse
     */
    CompletableFuture<GetPtsSceneRunningStatusResponse> getPtsSceneRunningStatus(GetPtsSceneRunningStatusRequest request);

    /**
     * @param request the request parameters of GetUserVpcSecurityGroup  GetUserVpcSecurityGroupRequest
     * @return GetUserVpcSecurityGroupResponse
     */
    CompletableFuture<GetUserVpcSecurityGroupResponse> getUserVpcSecurityGroup(GetUserVpcSecurityGroupRequest request);

    /**
     * @param request the request parameters of GetUserVpcVSwitch  GetUserVpcVSwitchRequest
     * @return GetUserVpcVSwitchResponse
     */
    CompletableFuture<GetUserVpcVSwitchResponse> getUserVpcVSwitch(GetUserVpcVSwitchRequest request);

    /**
     * @param request the request parameters of GetUserVpcs  GetUserVpcsRequest
     * @return GetUserVpcsResponse
     */
    CompletableFuture<GetUserVpcsResponse> getUserVpcs(GetUserVpcsRequest request);

    /**
     * @param request the request parameters of ListEnvs  ListEnvsRequest
     * @return ListEnvsResponse
     */
    CompletableFuture<ListEnvsResponse> listEnvs(ListEnvsRequest request);

    /**
     * @param request the request parameters of ListJMeterReports  ListJMeterReportsRequest
     * @return ListJMeterReportsResponse
     */
    CompletableFuture<ListJMeterReportsResponse> listJMeterReports(ListJMeterReportsRequest request);

    /**
     * @param request the request parameters of ListOpenJMeterScenes  ListOpenJMeterScenesRequest
     * @return ListOpenJMeterScenesResponse
     */
    CompletableFuture<ListOpenJMeterScenesResponse> listOpenJMeterScenes(ListOpenJMeterScenesRequest request);

    /**
     * @param request the request parameters of ListPtsReports  ListPtsReportsRequest
     * @return ListPtsReportsResponse
     */
    CompletableFuture<ListPtsReportsResponse> listPtsReports(ListPtsReportsRequest request);

    /**
     * @param request the request parameters of ListPtsScene  ListPtsSceneRequest
     * @return ListPtsSceneResponse
     */
    CompletableFuture<ListPtsSceneResponse> listPtsScene(ListPtsSceneRequest request);

    /**
     * @param request the request parameters of ListVpcConfigs  ListVpcConfigsRequest
     * @return ListVpcConfigsResponse
     */
    CompletableFuture<ListVpcConfigsResponse> listVpcConfigs(ListVpcConfigsRequest request);

    /**
     * @param request the request parameters of ModifyPtsScene  ModifyPtsSceneRequest
     * @return ModifyPtsSceneResponse
     */
    CompletableFuture<ModifyPtsSceneResponse> modifyPtsScene(ModifyPtsSceneRequest request);

    /**
     * @param request the request parameters of RemoveEnv  RemoveEnvRequest
     * @return RemoveEnvResponse
     */
    CompletableFuture<RemoveEnvResponse> removeEnv(RemoveEnvRequest request);

    /**
     * @param request the request parameters of RemoveOpenJMeterScene  RemoveOpenJMeterSceneRequest
     * @return RemoveOpenJMeterSceneResponse
     */
    CompletableFuture<RemoveOpenJMeterSceneResponse> removeOpenJMeterScene(RemoveOpenJMeterSceneRequest request);

    /**
     * @param request the request parameters of SaveEnv  SaveEnvRequest
     * @return SaveEnvResponse
     */
    CompletableFuture<SaveEnvResponse> saveEnv(SaveEnvRequest request);

    /**
     * @param request the request parameters of SaveOpenJMeterScene  SaveOpenJMeterSceneRequest
     * @return SaveOpenJMeterSceneResponse
     */
    CompletableFuture<SaveOpenJMeterSceneResponse> saveOpenJMeterScene(SaveOpenJMeterSceneRequest request);

    /**
     * @param request the request parameters of SavePtsScene  SavePtsSceneRequest
     * @return SavePtsSceneResponse
     */
    CompletableFuture<SavePtsSceneResponse> savePtsScene(SavePtsSceneRequest request);

    /**
     * @param request the request parameters of StartDebugPtsScene  StartDebugPtsSceneRequest
     * @return StartDebugPtsSceneResponse
     */
    CompletableFuture<StartDebugPtsSceneResponse> startDebugPtsScene(StartDebugPtsSceneRequest request);

    /**
     * @param request the request parameters of StartDebuggingJMeterScene  StartDebuggingJMeterSceneRequest
     * @return StartDebuggingJMeterSceneResponse
     */
    CompletableFuture<StartDebuggingJMeterSceneResponse> startDebuggingJMeterScene(StartDebuggingJMeterSceneRequest request);

    /**
     * @param request the request parameters of StartPtsScene  StartPtsSceneRequest
     * @return StartPtsSceneResponse
     */
    CompletableFuture<StartPtsSceneResponse> startPtsScene(StartPtsSceneRequest request);

    /**
     * @param request the request parameters of StartTestingJMeterScene  StartTestingJMeterSceneRequest
     * @return StartTestingJMeterSceneResponse
     */
    CompletableFuture<StartTestingJMeterSceneResponse> startTestingJMeterScene(StartTestingJMeterSceneRequest request);

    /**
     * @param request the request parameters of StopDebugPtsScene  StopDebugPtsSceneRequest
     * @return StopDebugPtsSceneResponse
     */
    CompletableFuture<StopDebugPtsSceneResponse> stopDebugPtsScene(StopDebugPtsSceneRequest request);

    /**
     * @param request the request parameters of StopDebuggingJMeterScene  StopDebuggingJMeterSceneRequest
     * @return StopDebuggingJMeterSceneResponse
     */
    CompletableFuture<StopDebuggingJMeterSceneResponse> stopDebuggingJMeterScene(StopDebuggingJMeterSceneRequest request);

    /**
     * @param request the request parameters of StopPtsScene  StopPtsSceneRequest
     * @return StopPtsSceneResponse
     */
    CompletableFuture<StopPtsSceneResponse> stopPtsScene(StopPtsSceneRequest request);

    /**
     * @param request the request parameters of StopTestingJMeterScene  StopTestingJMeterSceneRequest
     * @return StopTestingJMeterSceneResponse
     */
    CompletableFuture<StopTestingJMeterSceneResponse> stopTestingJMeterScene(StopTestingJMeterSceneRequest request);

    /**
     * @param request the request parameters of UpdatePtsSceneBaseLine  UpdatePtsSceneBaseLineRequest
     * @return UpdatePtsSceneBaseLineResponse
     */
    CompletableFuture<UpdatePtsSceneBaseLineResponse> updatePtsSceneBaseLine(UpdatePtsSceneBaseLineRequest request);

}
