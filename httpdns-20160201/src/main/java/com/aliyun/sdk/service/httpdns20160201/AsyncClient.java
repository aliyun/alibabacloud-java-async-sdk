// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.httpdns20160201;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.httpdns20160201.models.*;
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

    CompletableFuture<AddDomainResponse> addDomain(AddDomainRequest request);

    CompletableFuture<DeleteDomainResponse> deleteDomain(DeleteDomainRequest request);

    CompletableFuture<DescribeDomainsResponse> describeDomains(DescribeDomainsRequest request);

    CompletableFuture<GetAccountInfoResponse> getAccountInfo(GetAccountInfoRequest request);

    CompletableFuture<GetResolveCountSummaryResponse> getResolveCountSummary(GetResolveCountSummaryRequest request);

    CompletableFuture<GetResolveStatisticsResponse> getResolveStatistics(GetResolveStatisticsRequest request);

    CompletableFuture<ListDomainsResponse> listDomains(ListDomainsRequest request);

}
