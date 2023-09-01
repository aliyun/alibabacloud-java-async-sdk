// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eais20190624;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.eais20190624.models.*;
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

    CompletableFuture<AttachEaiResponse> attachEai(AttachEaiRequest request);

    CompletableFuture<AttachEaisEiResponse> attachEaisEi(AttachEaisEiRequest request);

    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    CompletableFuture<CreateEaiResponse> createEai(CreateEaiRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<CreateEaiAllResponse> createEaiAll(CreateEaiAllRequest request);

    CompletableFuture<CreateEaiEciResponse> createEaiEci(CreateEaiEciRequest request);

    CompletableFuture<CreateEaiEcsResponse> createEaiEcs(CreateEaiEcsRequest request);

    CompletableFuture<CreateEaiJupyterResponse> createEaiJupyter(CreateEaiJupyterRequest request);

    CompletableFuture<CreateEaisEiResponse> createEaisEi(CreateEaisEiRequest request);

    CompletableFuture<DeleteEaiResponse> deleteEai(DeleteEaiRequest request);

    CompletableFuture<DeleteEaiAllResponse> deleteEaiAll(DeleteEaiAllRequest request);

    CompletableFuture<DeleteEaisEiResponse> deleteEaisEi(DeleteEaisEiRequest request);

    CompletableFuture<DescribeEaisResponse> describeEais(DescribeEaisRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DetachEaiResponse> detachEai(DetachEaiRequest request);

    CompletableFuture<DetachEaisEiResponse> detachEaisEi(DetachEaisEiRequest request);

    CompletableFuture<GetInstanceMetricsResponse> getInstanceMetrics(GetInstanceMetricsRequest request);

    CompletableFuture<StartEaisEiResponse> startEaisEi(StartEaisEiRequest request);

    CompletableFuture<StopEaisEiResponse> stopEaisEi(StopEaisEiRequest request);

}
