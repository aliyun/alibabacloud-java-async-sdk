// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smc20190601;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.smc20190601.models.*;
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

    CompletableFuture<CreateReplicationJobResponse> createReplicationJob(CreateReplicationJobRequest request);

    CompletableFuture<CutOverReplicationJobResponse> cutOverReplicationJob(CutOverReplicationJobRequest request);

    CompletableFuture<DeleteReplicationJobResponse> deleteReplicationJob(DeleteReplicationJobRequest request);

    CompletableFuture<DeleteSourceServerResponse> deleteSourceServer(DeleteSourceServerRequest request);

    CompletableFuture<DescribeReplicationJobsResponse> describeReplicationJobs(DescribeReplicationJobsRequest request);

    CompletableFuture<DescribeSourceServersResponse> describeSourceServers(DescribeSourceServersRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ModifyReplicationJobAttributeResponse> modifyReplicationJobAttribute(ModifyReplicationJobAttributeRequest request);

    CompletableFuture<ModifySourceServerAttributeResponse> modifySourceServerAttribute(ModifySourceServerAttributeRequest request);

    CompletableFuture<StartReplicationJobResponse> startReplicationJob(StartReplicationJobRequest request);

    CompletableFuture<StopReplicationJobResponse> stopReplicationJob(StopReplicationJobRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

}
