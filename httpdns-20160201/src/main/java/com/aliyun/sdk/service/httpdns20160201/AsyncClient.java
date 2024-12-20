// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.httpdns20160201;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.httpdns20160201.models.*;
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
     * @param request the request parameters of AddDomain  AddDomainRequest
     * @return AddDomainResponse
     */
    CompletableFuture<AddDomainResponse> addDomain(AddDomainRequest request);

    /**
     * @param request the request parameters of DeleteDomain  DeleteDomainRequest
     * @return DeleteDomainResponse
     */
    CompletableFuture<DeleteDomainResponse> deleteDomain(DeleteDomainRequest request);

    /**
     * @param request the request parameters of DescribeDomains  DescribeDomainsRequest
     * @return DescribeDomainsResponse
     */
    CompletableFuture<DescribeDomainsResponse> describeDomains(DescribeDomainsRequest request);

    /**
     * @param request the request parameters of GetAccountInfo  GetAccountInfoRequest
     * @return GetAccountInfoResponse
     */
    CompletableFuture<GetAccountInfoResponse> getAccountInfo(GetAccountInfoRequest request);

    /**
     * @param request the request parameters of GetResolveCountSummary  GetResolveCountSummaryRequest
     * @return GetResolveCountSummaryResponse
     */
    CompletableFuture<GetResolveCountSummaryResponse> getResolveCountSummary(GetResolveCountSummaryRequest request);

    /**
     * @param request the request parameters of GetResolveStatistics  GetResolveStatisticsRequest
     * @return GetResolveStatisticsResponse
     */
    CompletableFuture<GetResolveStatisticsResponse> getResolveStatistics(GetResolveStatisticsRequest request);

    /**
     * @param request the request parameters of ListDomains  ListDomainsRequest
     * @return ListDomainsResponse
     */
    CompletableFuture<ListDomainsResponse> listDomains(ListDomainsRequest request);

}
