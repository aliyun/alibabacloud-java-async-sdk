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

    CompletableFuture<CreateHpoExperimentResponse> createHpoExperiment(CreateHpoExperimentRequest request);

    CompletableFuture<DeleteHpoExperimentResponse> deleteHpoExperiment(DeleteHpoExperimentRequest request);

    CompletableFuture<GetHpoExperimentResponse> getHpoExperiment(GetHpoExperimentRequest request);

    CompletableFuture<GetHpoTrialResponse> getHpoTrial(GetHpoTrialRequest request);

    CompletableFuture<ListHpoExperimentsResponse> listHpoExperiments(ListHpoExperimentsRequest request);

    CompletableFuture<ListHpoTrialLogsResponse> listHpoTrialLogs(ListHpoTrialLogsRequest request);

    CompletableFuture<ListHpoTrialsResponse> listHpoTrials(ListHpoTrialsRequest request);

    CompletableFuture<RestartHpoTrialsResponse> restartHpoTrials(RestartHpoTrialsRequest request);

    CompletableFuture<StopHpoExperimentResponse> stopHpoExperiment(StopHpoExperimentRequest request);

    CompletableFuture<StopHpoTrialsResponse> stopHpoTrials(StopHpoTrialsRequest request);

}
