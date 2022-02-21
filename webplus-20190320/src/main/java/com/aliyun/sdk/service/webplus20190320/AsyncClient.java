// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.webplus20190320.models.*;
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

    CompletableFuture<AbortChangeResponse> abortChange(AbortChangeRequest request);

    CompletableFuture<CreateAppEnvResponse> createAppEnv(CreateAppEnvRequest request);

    CompletableFuture<CreateApplicationResponse> createApplication(CreateApplicationRequest request);

    CompletableFuture<CreateConfigTemplateResponse> createConfigTemplate(CreateConfigTemplateRequest request);

    CompletableFuture<CreateOrderResponse> createOrder(CreateOrderRequest request);

    CompletableFuture<CreatePkgVersionResponse> createPkgVersion(CreatePkgVersionRequest request);

    CompletableFuture<CreateStorageResponse> createStorage(CreateStorageRequest request);

    CompletableFuture<DeleteAppEnvResponse> deleteAppEnv(DeleteAppEnvRequest request);

    CompletableFuture<DeleteApplicationResponse> deleteApplication(DeleteApplicationRequest request);

    CompletableFuture<DeleteChangeResponse> deleteChange(DeleteChangeRequest request);

    CompletableFuture<DeleteConfigTemplateResponse> deleteConfigTemplate(DeleteConfigTemplateRequest request);

    CompletableFuture<DeletePkgVersionResponse> deletePkgVersion(DeletePkgVersionRequest request);

    CompletableFuture<DeployAppEnvResponse> deployAppEnv(DeployAppEnvRequest request);

    CompletableFuture<DescribeAppEnvInstanceHealthResponse> describeAppEnvInstanceHealth(DescribeAppEnvInstanceHealthRequest request);

    CompletableFuture<DescribeAppEnvStatusResponse> describeAppEnvStatus(DescribeAppEnvStatusRequest request);

    CompletableFuture<DescribeAppEnvsResponse> describeAppEnvs(DescribeAppEnvsRequest request);

    CompletableFuture<DescribeApplicationsResponse> describeApplications(DescribeApplicationsRequest request);

    CompletableFuture<DescribeCategoriesResponse> describeCategories(DescribeCategoriesRequest request);

    CompletableFuture<DescribeChangeResponse> describeChange(DescribeChangeRequest request);

    CompletableFuture<DescribeChangesResponse> describeChanges(DescribeChangesRequest request);

    CompletableFuture<DescribeConfigIndexResponse> describeConfigIndex(DescribeConfigIndexRequest request);

    CompletableFuture<DescribeConfigOptionsResponse> describeConfigOptions(DescribeConfigOptionsRequest request);

    CompletableFuture<DescribeConfigSettingsResponse> describeConfigSettings(DescribeConfigSettingsRequest request);

    CompletableFuture<DescribeConfigTemplatesResponse> describeConfigTemplates(DescribeConfigTemplatesRequest request);

    CompletableFuture<DescribeEnvResourceResponse> describeEnvResource(DescribeEnvResourceRequest request);

    CompletableFuture<DescribeEventsResponse> describeEvents(DescribeEventsRequest request);

    CompletableFuture<DescribeGatherLogResultResponse> describeGatherLogResult(DescribeGatherLogResultRequest request);

    CompletableFuture<DescribeGatherStatsResultResponse> describeGatherStatsResult(DescribeGatherStatsResultRequest request);

    CompletableFuture<DescribeInstanceHealthResponse> describeInstanceHealth(DescribeInstanceHealthRequest request);

    CompletableFuture<DescribePkgVersionsResponse> describePkgVersions(DescribePkgVersionsRequest request);

    CompletableFuture<DescribePublicConfigTemplatesResponse> describePublicConfigTemplates(DescribePublicConfigTemplatesRequest request);

    CompletableFuture<DescribeStacksResponse> describeStacks(DescribeStacksRequest request);

    CompletableFuture<DescribeStorageResponse> describeStorage(DescribeStorageRequest request);

    CompletableFuture<GatherAppEnvLogResponse> gatherAppEnvLog(GatherAppEnvLogRequest request);

    CompletableFuture<GatherAppEnvStatsResponse> gatherAppEnvStats(GatherAppEnvStatsRequest request);

    CompletableFuture<PauseChangeResponse> pauseChange(PauseChangeRequest request);

    CompletableFuture<RebuildAppEnvResponse> rebuildAppEnv(RebuildAppEnvRequest request);

    CompletableFuture<RestartAppEnvResponse> restartAppEnv(RestartAppEnvRequest request);

    CompletableFuture<ResumeChangeResponse> resumeChange(ResumeChangeRequest request);

    CompletableFuture<StartAppEnvResponse> startAppEnv(StartAppEnvRequest request);

    CompletableFuture<StopAppEnvResponse> stopAppEnv(StopAppEnvRequest request);

    CompletableFuture<TerminateAppEnvResponse> terminateAppEnv(TerminateAppEnvRequest request);

    CompletableFuture<UpdateAppEnvResponse> updateAppEnv(UpdateAppEnvRequest request);

    CompletableFuture<UpdateApplicationResponse> updateApplication(UpdateApplicationRequest request);

    CompletableFuture<UpdateConfigTemplateResponse> updateConfigTemplate(UpdateConfigTemplateRequest request);

    CompletableFuture<ValidateConfigSettingResponse> validateConfigSetting(ValidateConfigSettingRequest request);

}
