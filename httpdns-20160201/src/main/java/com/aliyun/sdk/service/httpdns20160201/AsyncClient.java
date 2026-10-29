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
     * @param request the request parameters of CreateSdnsRuleCategory  CreateSdnsRuleCategoryRequest
     * @return CreateSdnsRuleCategoryResponse
     */
    CompletableFuture<CreateSdnsRuleCategoryResponse> createSdnsRuleCategory(CreateSdnsRuleCategoryRequest request);

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
     * <b>description</b> :
     * <h1>Operation description</h1>
     * <ul>
     * <li>You can specify the page number (PageNumber) and the number of entries per page (PageSize) for the query.</li>
     * <li>By default, the domain name list is sorted in descending order of the time when the domain names were added.</li>
     * </ul>
     * 
     * @param request the request parameters of ListDomains  ListDomainsRequest
     * @return ListDomainsResponse
     */
    CompletableFuture<ListDomainsResponse> listDomains(ListDomainsRequest request);

    /**
     * @param request the request parameters of RefreshResolveCache  RefreshResolveCacheRequest
     * @return RefreshResolveCacheResponse
     */
    CompletableFuture<RefreshResolveCacheResponse> refreshResolveCache(RefreshResolveCacheRequest request);

    /**
     * @param request the request parameters of SdnsDeleteRuleCategory  SdnsDeleteRuleCategoryRequest
     * @return SdnsDeleteRuleCategoryResponse
     */
    CompletableFuture<SdnsDeleteRuleCategoryResponse> sdnsDeleteRuleCategory(SdnsDeleteRuleCategoryRequest request);

    /**
     * @param request the request parameters of SdnsGetRuleCategory  SdnsGetRuleCategoryRequest
     * @return SdnsGetRuleCategoryResponse
     */
    CompletableFuture<SdnsGetRuleCategoryResponse> sdnsGetRuleCategory(SdnsGetRuleCategoryRequest request);

    /**
     * @param request the request parameters of SdnsListRuleCategories  SdnsListRuleCategoriesRequest
     * @return SdnsListRuleCategoriesResponse
     */
    CompletableFuture<SdnsListRuleCategoriesResponse> sdnsListRuleCategories(SdnsListRuleCategoriesRequest request);

    /**
     * @param request the request parameters of SdnsSwitchRuleCategory  SdnsSwitchRuleCategoryRequest
     * @return SdnsSwitchRuleCategoryResponse
     */
    CompletableFuture<SdnsSwitchRuleCategoryResponse> sdnsSwitchRuleCategory(SdnsSwitchRuleCategoryRequest request);

    /**
     * @param request the request parameters of SdnsVerifyRuleCategory  SdnsVerifyRuleCategoryRequest
     * @return SdnsVerifyRuleCategoryResponse
     */
    CompletableFuture<SdnsVerifyRuleCategoryResponse> sdnsVerifyRuleCategory(SdnsVerifyRuleCategoryRequest request);

    /**
     * @param request the request parameters of UpdateSdnsRuleCategory  UpdateSdnsRuleCategoryRequest
     * @return UpdateSdnsRuleCategoryResponse
     */
    CompletableFuture<UpdateSdnsRuleCategoryResponse> updateSdnsRuleCategory(UpdateSdnsRuleCategoryRequest request);

}
