// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiautoml20220828;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.paiautoml20220828.models.*;
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

    CompletableFuture<CreateAutofeExperimentResponse> createAutofeExperiment(CreateAutofeExperimentRequest request);

    CompletableFuture<CreateHpoExperimentResponse> createHpoExperiment(CreateHpoExperimentRequest request);

    CompletableFuture<CreateServiceIdentityRoleResponse> createServiceIdentityRole(CreateServiceIdentityRoleRequest request);

    CompletableFuture<DeleteHpoExperimentResponse> deleteHpoExperiment(DeleteHpoExperimentRequest request);

    CompletableFuture<GetAutofeExperimentResponse> getAutofeExperiment(GetAutofeExperimentRequest request);

    CompletableFuture<GetHpoExperimentResponse> getHpoExperiment(GetHpoExperimentRequest request);

    CompletableFuture<GetHpoTrialResponse> getHpoTrial(GetHpoTrialRequest request);

    CompletableFuture<GetServiceIdentityRoleResponse> getServiceIdentityRole(GetServiceIdentityRoleRequest request);

    CompletableFuture<ListHpoExperimentLogsResponse> listHpoExperimentLogs(ListHpoExperimentLogsRequest request);

    CompletableFuture<ListHpoExperimentsResponse> listHpoExperiments(ListHpoExperimentsRequest request);

    CompletableFuture<ListHpoTrialCommandsResponse> listHpoTrialCommands(ListHpoTrialCommandsRequest request);

    CompletableFuture<ListHpoTrialLogNamesResponse> listHpoTrialLogNames(ListHpoTrialLogNamesRequest request);

    CompletableFuture<ListHpoTrialLogsResponse> listHpoTrialLogs(ListHpoTrialLogsRequest request);

    CompletableFuture<ListHpoTrialsResponse> listHpoTrials(ListHpoTrialsRequest request);

    CompletableFuture<RestartHpoTrialsResponse> restartHpoTrials(RestartHpoTrialsRequest request);

    CompletableFuture<StopHpoExperimentResponse> stopHpoExperiment(StopHpoExperimentRequest request);

    CompletableFuture<StopHpoTrialsResponse> stopHpoTrials(StopHpoTrialsRequest request);

    CompletableFuture<UpdateHpoExperimentResponse> updateHpoExperiment(UpdateHpoExperimentRequest request);

}
