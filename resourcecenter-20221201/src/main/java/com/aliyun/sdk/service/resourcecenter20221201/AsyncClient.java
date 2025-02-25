// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.resourcecenter20221201.models.*;
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
     * @param request the request parameters of AssociateDefaultFilter  AssociateDefaultFilterRequest
     * @return AssociateDefaultFilterResponse
     */
    CompletableFuture<AssociateDefaultFilterResponse> associateDefaultFilter(AssociateDefaultFilterRequest request);

    /**
     * @param request the request parameters of CreateFilter  CreateFilterRequest
     * @return CreateFilterResponse
     */
    CompletableFuture<CreateFilterResponse> createFilter(CreateFilterRequest request);

    /**
     * @param request the request parameters of CreateSavedQuery  CreateSavedQueryRequest
     * @return CreateSavedQueryResponse
     */
    CompletableFuture<CreateSavedQueryResponse> createSavedQuery(CreateSavedQueryRequest request);

    /**
     * @param request the request parameters of DeleteFilter  DeleteFilterRequest
     * @return DeleteFilterResponse
     */
    CompletableFuture<DeleteFilterResponse> deleteFilter(DeleteFilterRequest request);

    /**
     * @param request the request parameters of DeleteSavedQuery  DeleteSavedQueryRequest
     * @return DeleteSavedQueryResponse
     */
    CompletableFuture<DeleteSavedQueryResponse> deleteSavedQuery(DeleteSavedQueryRequest request);

    /**
     * @param request the request parameters of DisableMultiAccountResourceCenter  DisableMultiAccountResourceCenterRequest
     * @return DisableMultiAccountResourceCenterResponse
     */
    CompletableFuture<DisableMultiAccountResourceCenterResponse> disableMultiAccountResourceCenter(DisableMultiAccountResourceCenterRequest request);

    /**
     * @param request the request parameters of DisableResourceCenter  DisableResourceCenterRequest
     * @return DisableResourceCenterResponse
     */
    CompletableFuture<DisableResourceCenterResponse> disableResourceCenter(DisableResourceCenterRequest request);

    /**
     * @param request the request parameters of DisassociateDefaultFilter  DisassociateDefaultFilterRequest
     * @return DisassociateDefaultFilterResponse
     */
    CompletableFuture<DisassociateDefaultFilterResponse> disassociateDefaultFilter(DisassociateDefaultFilterRequest request);

    /**
     * <b>description</b> :
     * <p>If you have created a resource directory for your enterprise, you can enable the cross-account resource search feature by using the management account of the resource directory or a delegated administrator account of Resource Center to view the resources of members in the resource directory. For more information about a resource directory, see <a href="https://help.aliyun.com/document_detail/200506.html">Resource Directory overview</a>.</p>
     * 
     * @param request the request parameters of EnableMultiAccountResourceCenter  EnableMultiAccountResourceCenterRequest
     * @return EnableMultiAccountResourceCenterResponse
     */
    CompletableFuture<EnableMultiAccountResourceCenterResponse> enableMultiAccountResourceCenter(EnableMultiAccountResourceCenterRequest request);

    /**
     * @param request the request parameters of EnableResourceCenter  EnableResourceCenterRequest
     * @return EnableResourceCenterResponse
     */
    CompletableFuture<EnableResourceCenterResponse> enableResourceCenter(EnableResourceCenterRequest request);

    /**
     * @param request the request parameters of ExecuteMultiAccountSQLQuery  ExecuteMultiAccountSQLQueryRequest
     * @return ExecuteMultiAccountSQLQueryResponse
     */
    CompletableFuture<ExecuteMultiAccountSQLQueryResponse> executeMultiAccountSQLQuery(ExecuteMultiAccountSQLQueryRequest request);

    /**
     * @param request the request parameters of ExecuteSQLQuery  ExecuteSQLQueryRequest
     * @return ExecuteSQLQueryResponse
     */
    CompletableFuture<ExecuteSQLQueryResponse> executeSQLQuery(ExecuteSQLQueryRequest request);

    /**
     * @param request the request parameters of GetExampleQuery  GetExampleQueryRequest
     * @return GetExampleQueryResponse
     */
    CompletableFuture<GetExampleQueryResponse> getExampleQuery(GetExampleQueryRequest request);

    /**
     * @param request the request parameters of GetMultiAccountResourceCenterServiceStatus  GetMultiAccountResourceCenterServiceStatusRequest
     * @return GetMultiAccountResourceCenterServiceStatusResponse
     */
    CompletableFuture<GetMultiAccountResourceCenterServiceStatusResponse> getMultiAccountResourceCenterServiceStatus(GetMultiAccountResourceCenterServiceStatusRequest request);

    /**
     * @param request the request parameters of GetMultiAccountResourceConfiguration  GetMultiAccountResourceConfigurationRequest
     * @return GetMultiAccountResourceConfigurationResponse
     */
    CompletableFuture<GetMultiAccountResourceConfigurationResponse> getMultiAccountResourceConfiguration(GetMultiAccountResourceConfigurationRequest request);

    /**
     * @param request the request parameters of GetResourceCenterServiceStatus  GetResourceCenterServiceStatusRequest
     * @return GetResourceCenterServiceStatusResponse
     */
    CompletableFuture<GetResourceCenterServiceStatusResponse> getResourceCenterServiceStatus(GetResourceCenterServiceStatusRequest request);

    /**
     * @param request the request parameters of GetResourceConfiguration  GetResourceConfigurationRequest
     * @return GetResourceConfigurationResponse
     */
    CompletableFuture<GetResourceConfigurationResponse> getResourceConfiguration(GetResourceConfigurationRequest request);

    /**
     * @param request the request parameters of GetResourceCounts  GetResourceCountsRequest
     * @return GetResourceCountsResponse
     */
    CompletableFuture<GetResourceCountsResponse> getResourceCounts(GetResourceCountsRequest request);

    /**
     * @param request the request parameters of GetSavedQuery  GetSavedQueryRequest
     * @return GetSavedQueryResponse
     */
    CompletableFuture<GetSavedQueryResponse> getSavedQuery(GetSavedQueryRequest request);

    /**
     * @param request the request parameters of ListExampleQueries  ListExampleQueriesRequest
     * @return ListExampleQueriesResponse
     */
    CompletableFuture<ListExampleQueriesResponse> listExampleQueries(ListExampleQueriesRequest request);

    /**
     * @param request the request parameters of ListFilters  ListFiltersRequest
     * @return ListFiltersResponse
     */
    CompletableFuture<ListFiltersResponse> listFilters(ListFiltersRequest request);

    /**
     * @param request the request parameters of ListMultiAccountResourceGroups  ListMultiAccountResourceGroupsRequest
     * @return ListMultiAccountResourceGroupsResponse
     */
    CompletableFuture<ListMultiAccountResourceGroupsResponse> listMultiAccountResourceGroups(ListMultiAccountResourceGroupsRequest request);

    /**
     * @param request the request parameters of ListMultiAccountTagKeys  ListMultiAccountTagKeysRequest
     * @return ListMultiAccountTagKeysResponse
     */
    CompletableFuture<ListMultiAccountTagKeysResponse> listMultiAccountTagKeys(ListMultiAccountTagKeysRequest request);

    /**
     * @param request the request parameters of ListMultiAccountTagValues  ListMultiAccountTagValuesRequest
     * @return ListMultiAccountTagValuesResponse
     */
    CompletableFuture<ListMultiAccountTagValuesResponse> listMultiAccountTagValues(ListMultiAccountTagValuesRequest request);

    /**
     * @param request the request parameters of ListResourceTypes  ListResourceTypesRequest
     * @return ListResourceTypesResponse
     */
    CompletableFuture<ListResourceTypesResponse> listResourceTypes(ListResourceTypesRequest request);

    /**
     * @param request the request parameters of ListSavedQueries  ListSavedQueriesRequest
     * @return ListSavedQueriesResponse
     */
    CompletableFuture<ListSavedQueriesResponse> listSavedQueries(ListSavedQueriesRequest request);

    /**
     * @param request the request parameters of ListTagKeys  ListTagKeysRequest
     * @return ListTagKeysResponse
     */
    CompletableFuture<ListTagKeysResponse> listTagKeys(ListTagKeysRequest request);

    /**
     * @param request the request parameters of ListTagValues  ListTagValuesRequest
     * @return ListTagValuesResponse
     */
    CompletableFuture<ListTagValuesResponse> listTagValues(ListTagValuesRequest request);

    /**
     * <b>description</b> :
     * <p>  You can use this operation to search for only resources whose types are supported by Resource Center in services that work with Resource Center. For more information about the services and the resource types that are supported by Resource Center, see <a href="https://help.aliyun.com/document_detail/477798.html">Services that work with Resource Center</a>.</p>
     * <ul>
     * <li>Before you use a RAM user or a RAM role to call the operation, you must make sure that the RAM user or RAM role is granted the required permissions. For more information, see <a href="https://help.aliyun.com/document_detail/600556.html">Grant a RAM user the permissions to use Resource Center</a>.</li>
     * <li>By default, the operation returns a maximum of 20 entries. You can configure the <code>MaxResults</code> parameter to specify the maximum number of entries to return.</li>
     * <li>If the response does not contain the <code>NextToken</code> parameter, all entries are returned. Otherwise, more entries exist. If you want to obtain the entries, you can call the operation again to initiate another query request. In the request, set the <code>NextToken</code> parameter to the value of <code>NextToken</code> in the last response of the operation. If you do not configure the <code>NextToken</code> parameter, entries on the first page are returned by default.</li>
     * <li>You can specify one or more filter conditions to narrow the search scope. For more information about supported filter parameters and matching methods, see the Supported filter parameters section. Multiple filter conditions have logical <code>AND</code> relations. Only resources that meet all filter conditions are returned. The values of a filter condition have logical <code>OR</code> relations. Resources that meet any value of the filter condition are returned.</li>
     * <li>You can visit <a href="https://api.alibabacloud.com/api-tools/demo/ResourceCenter">Sample Code Center</a> to view more sample queries.</li>
     * </ul>
     * 
     * @param request the request parameters of SearchMultiAccountResources  SearchMultiAccountResourcesRequest
     * @return SearchMultiAccountResourcesResponse
     */
    CompletableFuture<SearchMultiAccountResourcesResponse> searchMultiAccountResources(SearchMultiAccountResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>  You can use this operation to search for only resources whose types are supported by Resource Center in services that work with Resource Center. For more information about the services and the resource types that are supported by Resource Center, see <a href="https://help.aliyun.com/document_detail/477798.html">Services that work with Resource Center</a>.</p>
     * <ul>
     * <li>By default, the operation returns a maximum of 20 entries. You can configure the <code>MaxResults</code> parameter to specify the maximum number of entries to return.</li>
     * <li>If the response does not contain the <code>NextToken</code> parameter, all entries are returned. Otherwise, more entries exist. If you want to obtain the entries, you can call the operation again to initiate another query request. In the request, set the <code>NextToken</code> parameter to the value of <code>NextToken</code> in the last response of the operation. If you do not configure the <code>NextToken</code> parameter, entries on the first page are returned by default.</li>
     * <li>You can specify one or more filter conditions to narrow the search scope. For more information about supported filter parameters and matching methods, see the Supported filter parameters section. Multiple filter conditions have logical <code>AND</code> relations. Only resources that meet all filter conditions are returned. The values of a filter condition have logical <code>OR</code> relations. Resources that meet any value of the filter condition are returned.</li>
     * <li>You can visit <a href="https://api.aliyun.com/api-tools/demo/ResourceCenter">Sample Code Center</a> to view more sample queries.</li>
     * </ul>
     * 
     * @param request the request parameters of SearchResources  SearchResourcesRequest
     * @return SearchResourcesResponse
     */
    CompletableFuture<SearchResourcesResponse> searchResources(SearchResourcesRequest request);

    /**
     * @param request the request parameters of UpdateFilter  UpdateFilterRequest
     * @return UpdateFilterResponse
     */
    CompletableFuture<UpdateFilterResponse> updateFilter(UpdateFilterRequest request);

    /**
     * @param request the request parameters of UpdateSavedQuery  UpdateSavedQueryRequest
     * @return UpdateSavedQueryResponse
     */
    CompletableFuture<UpdateSavedQueryResponse> updateSavedQuery(UpdateSavedQueryRequest request);

}
