// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai20240521;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.pai20240521.models.*;
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
     * @param request the request parameters of GetQuota  GetQuotaRequest
     * @return GetQuotaResponse
     */
    CompletableFuture<GetQuotaResponse> getQuota(GetQuotaRequest request);

    /**
     * @param request the request parameters of GetResourceGroup  GetResourceGroupRequest
     * @return GetResourceGroupResponse
     */
    CompletableFuture<GetResourceGroupResponse> getResourceGroup(GetResourceGroupRequest request);

    /**
     * @param request the request parameters of GetResourceGroupMachineGroup  GetResourceGroupMachineGroupRequest
     * @return GetResourceGroupMachineGroupResponse
     */
    CompletableFuture<GetResourceGroupMachineGroupResponse> getResourceGroupMachineGroup(GetResourceGroupMachineGroupRequest request);

    /**
     * @param request the request parameters of GetResourceGroupRequest  GetResourceGroupRequestRequest
     * @return GetResourceGroupRequestResponse
     */
    CompletableFuture<GetResourceGroupRequestResponse> getResourceGroupRequest(GetResourceGroupRequestRequest request);

    /**
     * @param request the request parameters of GetResourceGroupTotal  GetResourceGroupTotalRequest
     * @return GetResourceGroupTotalResponse
     */
    CompletableFuture<GetResourceGroupTotalResponse> getResourceGroupTotal(GetResourceGroupTotalRequest request);

    /**
     * @param request the request parameters of GetUserAliUidByInstanceId  GetUserAliUidByInstanceIdRequest
     * @return GetUserAliUidByInstanceIdResponse
     */
    CompletableFuture<GetUserAliUidByInstanceIdResponse> getUserAliUidByInstanceId(GetUserAliUidByInstanceIdRequest request);

    /**
     * @param request the request parameters of GetUserViewMetrics  GetUserViewMetricsRequest
     * @return GetUserViewMetricsResponse
     */
    CompletableFuture<GetUserViewMetricsResponse> getUserViewMetrics(GetUserViewMetricsRequest request);

    /**
     * @param request the request parameters of ListDataCacheServices  ListDataCacheServicesRequest
     * @return ListDataCacheServicesResponse
     */
    CompletableFuture<ListDataCacheServicesResponse> listDataCacheServices(ListDataCacheServicesRequest request);

    /**
     * @param request the request parameters of ListNodes  ListNodesRequest
     * @return ListNodesResponse
     */
    CompletableFuture<ListNodesResponse> listNodes(ListNodesRequest request);

    /**
     * @param request the request parameters of ListQuotas  ListQuotasRequest
     * @return ListQuotasResponse
     */
    CompletableFuture<ListQuotasResponse> listQuotas(ListQuotasRequest request);

    /**
     * @param request the request parameters of ListResourceGroupMachineGroups  ListResourceGroupMachineGroupsRequest
     * @return ListResourceGroupMachineGroupsResponse
     */
    CompletableFuture<ListResourceGroupMachineGroupsResponse> listResourceGroupMachineGroups(ListResourceGroupMachineGroupsRequest request);

    /**
     * @param request the request parameters of ListResourceGroups  ListResourceGroupsRequest
     * @return ListResourceGroupsResponse
     */
    CompletableFuture<ListResourceGroupsResponse> listResourceGroups(ListResourceGroupsRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of TagResourcesSystemTags  TagResourcesSystemTagsRequest
     * @return TagResourcesSystemTagsResponse
     */
    CompletableFuture<TagResourcesSystemTagsResponse> tagResourcesSystemTags(TagResourcesSystemTagsRequest request);

    /**
     * @param request the request parameters of UntagResourcesSystemTags  UntagResourcesSystemTagsRequest
     * @return UntagResourcesSystemTagsResponse
     */
    CompletableFuture<UntagResourcesSystemTagsResponse> untagResourcesSystemTags(UntagResourcesSystemTagsRequest request);

}
