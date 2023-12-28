// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcontrol20220830;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cloudcontrol20220830.models.*;
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

    CompletableFuture<CancelTaskResponse> cancelTask(CancelTaskRequest request);

    CompletableFuture<CreateResourceResponse> createResource(CreateResourceRequest request);

    CompletableFuture<DeleteResourceResponse> deleteResource(DeleteResourceRequest request);

    CompletableFuture<GetPriceResponse> getPrice(GetPriceRequest request);

    CompletableFuture<GetResourceTypeResponse> getResourceType(GetResourceTypeRequest request);

    CompletableFuture<GetResourcesResponse> getResources(GetResourcesRequest request);

    /**
      * GET /api/v1/tasks/{taskId}。
      *
     */
    CompletableFuture<GetTaskResponse> getTask(GetTaskRequest request);

    CompletableFuture<ListDataSourcesResponse> listDataSources(ListDataSourcesRequest request);

    /**
      * GET /api/v1/providers/{provider}/products。
      *
     */
    CompletableFuture<ListProductsResponse> listProducts(ListProductsRequest request);

    /**
      * GET /api/v1/providers/{provider}/products/{product}/resourceTypes。
      *
     */
    CompletableFuture<ListResourceTypesResponse> listResourceTypes(ListResourceTypesRequest request);

    CompletableFuture<UpdateResourceResponse> updateResource(UpdateResourceRequest request);

}
