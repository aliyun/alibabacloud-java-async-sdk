// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.nis20211216.models.*;
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
      * You can call this operation to initiate a task for analyzing network reachability by specifying only the information about the source and destination. You do not need to create a network path for reachability analysis. The analysis result is not recorded in the system. If you want to record the path parameters and analysis result in the Network Intelligence Service (NIS) console, we recommend that you call the **createNetworkReachableAnalysis** operation.
      *
     */
    CompletableFuture<CreateAndAnalyzeNetworkPathResponse> createAndAnalyzeNetworkPath(CreateAndAnalyzeNetworkPathRequest request);

    /**
      * *   You can call the **CreateNetworkPath** operation to create network paths in multiple networking scenarios and between multiple resources. After a path is created, the path parameters are saved for repeated analysis.
      * *   You can create up to 100 network paths within one Alibaba Cloud account.
      *
     */
    CompletableFuture<CreateNetworkPathResponse> createNetworkPath(CreateNetworkPathRequest request);

    /**
      * *   The **CreateNetworkReachableAnalysis** operation is used to create a task for analyzing the reachability of the network path that is created by calling the **CreateNetworkPath** operation and record the analysis results.
      * *   The **CreateNetworkReachableAnalysis** operation can be called to repeatedly analyze the reachability of a network path.
      * *   You can create up to 1,000 reachability analysis records within one Alibaba Cloud account.
      *
     */
    CompletableFuture<CreateNetworkReachableAnalysisResponse> createNetworkReachableAnalysis(CreateNetworkReachableAnalysisRequest request);

    CompletableFuture<DeleteNetworkPathResponse> deleteNetworkPath(DeleteNetworkPathRequest request);

    CompletableFuture<DeleteNetworkReachableAnalysisResponse> deleteNetworkReachableAnalysis(DeleteNetworkReachableAnalysisRequest request);

    CompletableFuture<GetInternetTupleResponse> getInternetTuple(GetInternetTupleRequest request);

    CompletableFuture<GetNatTopNResponse> getNatTopN(GetNatTopNRequest request);

    /**
      * **GetNetworkReachableAnalysis** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can query the state of the task for analyzing network reachability.
      * *   The **init** state indicates that the task is in progress.
      * *   The **finish** state indicates that the task is complete. In this state, you can obtain the analysis result.
      *
     */
    CompletableFuture<GetNetworkReachableAnalysisResponse> getNetworkReachableAnalysis(GetNetworkReachableAnalysisRequest request);

}
