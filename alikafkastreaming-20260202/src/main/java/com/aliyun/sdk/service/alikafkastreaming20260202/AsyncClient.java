// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafkastreaming20260202;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.alikafkastreaming20260202.models.*;
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
     * @param request the request parameters of CheckSqlContent  CheckSqlContentRequest
     * @return CheckSqlContentResponse
     */
    CompletableFuture<CheckSqlContentResponse> checkSqlContent(CheckSqlContentRequest request);

    /**
     * @param request the request parameters of CreateComputeInstance  CreateComputeInstanceRequest
     * @return CreateComputeInstanceResponse
     */
    CompletableFuture<CreateComputeInstanceResponse> createComputeInstance(CreateComputeInstanceRequest request);

    /**
     * @param request the request parameters of CreateComputeJob  CreateComputeJobRequest
     * @return CreateComputeJobResponse
     */
    CompletableFuture<CreateComputeJobResponse> createComputeJob(CreateComputeJobRequest request);

    /**
     * @param request the request parameters of DeleteComputeInstance  DeleteComputeInstanceRequest
     * @return DeleteComputeInstanceResponse
     */
    CompletableFuture<DeleteComputeInstanceResponse> deleteComputeInstance(DeleteComputeInstanceRequest request);

    /**
     * @param request the request parameters of DeleteComputeJob  DeleteComputeJobRequest
     * @return DeleteComputeJobResponse
     */
    CompletableFuture<DeleteComputeJobResponse> deleteComputeJob(DeleteComputeJobRequest request);

    /**
     * @param request the request parameters of GetComputeInstance  GetComputeInstanceRequest
     * @return GetComputeInstanceResponse
     */
    CompletableFuture<GetComputeInstanceResponse> getComputeInstance(GetComputeInstanceRequest request);

    /**
     * @param request the request parameters of GetComputeJob  GetComputeJobRequest
     * @return GetComputeJobResponse
     */
    CompletableFuture<GetComputeJobResponse> getComputeJob(GetComputeJobRequest request);

    /**
     * @param request the request parameters of GetJobDebugData  GetJobDebugDataRequest
     * @return GetJobDebugDataResponse
     */
    CompletableFuture<GetJobDebugDataResponse> getJobDebugData(GetJobDebugDataRequest request);

    /**
     * @param request the request parameters of ListComputeInstances  ListComputeInstancesRequest
     * @return ListComputeInstancesResponse
     */
    CompletableFuture<ListComputeInstancesResponse> listComputeInstances(ListComputeInstancesRequest request);

    /**
     * @param request the request parameters of ListComputeInstancesInPage  ListComputeInstancesInPageRequest
     * @return ListComputeInstancesInPageResponse
     */
    CompletableFuture<ListComputeInstancesInPageResponse> listComputeInstancesInPage(ListComputeInstancesInPageRequest request);

    /**
     * @param request the request parameters of ListComputeJobs  ListComputeJobsRequest
     * @return ListComputeJobsResponse
     */
    CompletableFuture<ListComputeJobsResponse> listComputeJobs(ListComputeJobsRequest request);

    /**
     * @param request the request parameters of ListSupportedConnectors  ListSupportedConnectorsRequest
     * @return ListSupportedConnectorsResponse
     */
    CompletableFuture<ListSupportedConnectorsResponse> listSupportedConnectors(ListSupportedConnectorsRequest request);

    /**
     * @param request the request parameters of ReopenComputeInstance  ReopenComputeInstanceRequest
     * @return ReopenComputeInstanceResponse
     */
    CompletableFuture<ReopenComputeInstanceResponse> reopenComputeInstance(ReopenComputeInstanceRequest request);

    /**
     * @param request the request parameters of RestartComputeJob  RestartComputeJobRequest
     * @return RestartComputeJobResponse
     */
    CompletableFuture<RestartComputeJobResponse> restartComputeJob(RestartComputeJobRequest request);

    /**
     * @param request the request parameters of StartComputeInstance  StartComputeInstanceRequest
     * @return StartComputeInstanceResponse
     */
    CompletableFuture<StartComputeInstanceResponse> startComputeInstance(StartComputeInstanceRequest request);

    /**
     * @param request the request parameters of StartComputeJob  StartComputeJobRequest
     * @return StartComputeJobResponse
     */
    CompletableFuture<StartComputeJobResponse> startComputeJob(StartComputeJobRequest request);

    /**
     * @param request the request parameters of StopComputeInstance  StopComputeInstanceRequest
     * @return StopComputeInstanceResponse
     */
    CompletableFuture<StopComputeInstanceResponse> stopComputeInstance(StopComputeInstanceRequest request);

    /**
     * @param request the request parameters of StopComputeJob  StopComputeJobRequest
     * @return StopComputeJobResponse
     */
    CompletableFuture<StopComputeJobResponse> stopComputeJob(StopComputeJobRequest request);

    /**
     * @param request the request parameters of UpdateComputeInstanceName  UpdateComputeInstanceNameRequest
     * @return UpdateComputeInstanceNameResponse
     */
    CompletableFuture<UpdateComputeInstanceNameResponse> updateComputeInstanceName(UpdateComputeInstanceNameRequest request);

    /**
     * @param request the request parameters of UpdateComputeJob  UpdateComputeJobRequest
     * @return UpdateComputeJobResponse
     */
    CompletableFuture<UpdateComputeJobResponse> updateComputeJob(UpdateComputeJobRequest request);

    /**
     * @param request the request parameters of UpdateComputeJobCu  UpdateComputeJobCuRequest
     * @return UpdateComputeJobCuResponse
     */
    CompletableFuture<UpdateComputeJobCuResponse> updateComputeJobCu(UpdateComputeJobCuRequest request);

    /**
     * @param request the request parameters of UpdateComputeJobDraftSql  UpdateComputeJobDraftSqlRequest
     * @return UpdateComputeJobDraftSqlResponse
     */
    CompletableFuture<UpdateComputeJobDraftSqlResponse> updateComputeJobDraftSql(UpdateComputeJobDraftSqlRequest request);

}
