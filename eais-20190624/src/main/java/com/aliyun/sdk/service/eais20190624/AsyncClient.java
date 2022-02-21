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

    CompletableFuture<CreateEaiResponse> createEai(CreateEaiRequest request);

    CompletableFuture<CreateEaiAllResponse> createEaiAll(CreateEaiAllRequest request);

    CompletableFuture<DeleteEaiResponse> deleteEai(DeleteEaiRequest request);

    CompletableFuture<DeleteEaiAllResponse> deleteEaiAll(DeleteEaiAllRequest request);

    CompletableFuture<DescribeEaisResponse> describeEais(DescribeEaisRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request);

    CompletableFuture<DetachEaiResponse> detachEai(DetachEaiRequest request);

    CompletableFuture<GetPrivateIpResponse> getPrivateIp(GetPrivateIpRequest request);

}
