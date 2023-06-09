// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.resourcecenter20221201.models.*;
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

    CompletableFuture<DisableMultiAccountResourceCenterResponse> disableMultiAccountResourceCenter(DisableMultiAccountResourceCenterRequest request);

    CompletableFuture<DisableResourceCenterResponse> disableResourceCenter(DisableResourceCenterRequest request);

    /**
      * If you have created a resource directory for your enterprise, you can enable the cross-account resource search feature by using the management account of the resource directory or a delegated administrator account of Resource Center to view the resources of members in the resource directory. For more information about a resource directory, see [Resource Directory overview](~~200506~~).
      *
     */
    CompletableFuture<EnableMultiAccountResourceCenterResponse> enableMultiAccountResourceCenter(EnableMultiAccountResourceCenterRequest request);

    CompletableFuture<EnableResourceCenterResponse> enableResourceCenter(EnableResourceCenterRequest request);

    CompletableFuture<GetMultiAccountResourceCenterServiceStatusResponse> getMultiAccountResourceCenterServiceStatus(GetMultiAccountResourceCenterServiceStatusRequest request);

    CompletableFuture<GetMultiAccountResourceConfigurationResponse> getMultiAccountResourceConfiguration(GetMultiAccountResourceConfigurationRequest request);

    CompletableFuture<GetResourceCenterServiceStatusResponse> getResourceCenterServiceStatus(GetResourceCenterServiceStatusRequest request);

    CompletableFuture<GetResourceConfigurationResponse> getResourceConfiguration(GetResourceConfigurationRequest request);

    CompletableFuture<GetResourceCountsResponse> getResourceCounts(GetResourceCountsRequest request);

    CompletableFuture<ListMultiAccountResourceGroupsResponse> listMultiAccountResourceGroups(ListMultiAccountResourceGroupsRequest request);

    CompletableFuture<ListMultiAccountTagKeysResponse> listMultiAccountTagKeys(ListMultiAccountTagKeysRequest request);

    CompletableFuture<ListMultiAccountTagValuesResponse> listMultiAccountTagValues(ListMultiAccountTagValuesRequest request);

    CompletableFuture<ListResourceTypesResponse> listResourceTypes(ListResourceTypesRequest request);

    CompletableFuture<ListTagKeysResponse> listTagKeys(ListTagKeysRequest request);

    CompletableFuture<ListTagValuesResponse> listTagValues(ListTagValuesRequest request);

    CompletableFuture<SearchMultiAccountResourcesResponse> searchMultiAccountResources(SearchMultiAccountResourcesRequest request);

    CompletableFuture<SearchResourcesResponse> searchResources(SearchResourcesRequest request);

}
