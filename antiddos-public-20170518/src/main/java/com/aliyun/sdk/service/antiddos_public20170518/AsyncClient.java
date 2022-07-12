// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antiddos_public20170518;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.antiddos_public20170518.models.*;
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

    CompletableFuture<DescribeBgpPackByIpResponse> describeBgpPackByIp(DescribeBgpPackByIpRequest request);

    CompletableFuture<DescribeCapResponse> describeCap(DescribeCapRequest request);

    CompletableFuture<DescribeDdosCountResponse> describeDdosCount(DescribeDdosCountRequest request);

    CompletableFuture<DescribeDdosCreditResponse> describeDdosCredit(DescribeDdosCreditRequest request);

    CompletableFuture<DescribeDdosEventListResponse> describeDdosEventList(DescribeDdosEventListRequest request);

    CompletableFuture<DescribeDdosThresholdResponse> describeDdosThreshold(DescribeDdosThresholdRequest request);

    CompletableFuture<DescribeInstanceResponse> describeInstance(DescribeInstanceRequest request);

    CompletableFuture<DescribeInstanceIpAddressResponse> describeInstanceIpAddress(DescribeInstanceIpAddressRequest request);

    CompletableFuture<DescribeIpDdosThresholdResponse> describeIpDdosThreshold(DescribeIpDdosThresholdRequest request);

    CompletableFuture<DescribeIpLocationServiceResponse> describeIpLocationService(DescribeIpLocationServiceRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<ModifyDdosStatusResponse> modifyDdosStatus(ModifyDdosStatusRequest request);

    CompletableFuture<ModifyDefenseThresholdResponse> modifyDefenseThreshold(ModifyDefenseThresholdRequest request);

}
