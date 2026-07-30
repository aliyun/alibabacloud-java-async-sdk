// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcontrol20220830;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cloudcontrol20220830.models.*;
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
     * <b>description</b> :
     * <p>Only tasks that are in the Pending or Running state can be canceled.
     * You can call the CancelTask operation to cancel a Cloud Control API task, but the tasks that have been started in the downstream Alibaba Cloud services cannot be canceled.</p>
     * 
     * @param request the request parameters of CancelTask  CancelTaskRequest
     * @return CancelTaskResponse
     */
    CompletableFuture<CancelTaskResponse> cancelTask(CancelTaskRequest request);

    /**
     * <b>description</b> :
     * <p>You can go to <a href="https://next.api.aliyun.com/cloudcontrol">OpenAPI Explorer</a> to view the documentation and try out Cloud Control API.</p>
     * 
     * @param request the request parameters of CreateResource  CreateResourceRequest
     * @return CreateResourceResponse
     */
    CompletableFuture<CreateResourceResponse> createResource(CreateResourceRequest request);

    /**
     * <b>description</b> :
     * <p>You can go to <a href="https://next.api.aliyun.com/cloudcontrol">OpenAPI Explorer</a> to view the documentation and try out Cloud Control API.</p>
     * 
     * @param request the request parameters of DeleteResource  DeleteResourceRequest
     * @return DeleteResourceResponse
     */
    CompletableFuture<DeleteResourceResponse> deleteResource(DeleteResourceRequest request);

    /**
     * @param request the request parameters of GetApiPrice  GetApiPriceRequest
     * @return GetApiPriceResponse
     */
    CompletableFuture<GetApiPriceResponse> getApiPrice(GetApiPriceRequest request);

    /**
     * @param request the request parameters of GetPrice  GetPriceRequest
     * @return GetPriceResponse
     */
    CompletableFuture<GetPriceResponse> getPrice(GetPriceRequest request);

    /**
     * @param request the request parameters of GetResourceType  GetResourceTypeRequest
     * @return GetResourceTypeResponse
     */
    CompletableFuture<GetResourceTypeResponse> getResourceType(GetResourceTypeRequest request);

    /**
     * <b>description</b> :
     * <p>You can go to <a href="https://next.api.aliyun.com/cloudcontrol">OpenAPI Explorer</a> to view the documentation and try out CloudControl API.
     * You can call this operation to query resources List and Get based on different request paths.</p>
     * 
     * @param request the request parameters of GetResources  GetResourcesRequest
     * @return GetResourcesResponse
     */
    CompletableFuture<GetResourcesResponse> getResources(GetResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>GET /api/v1/tasks/{taskId}.</p>
     * 
     * @param request the request parameters of GetTask  GetTaskRequest
     * @return GetTaskResponse
     */
    CompletableFuture<GetTaskResponse> getTask(GetTaskRequest request);

    /**
     * @param request the request parameters of ListDataSources  ListDataSourcesRequest
     * @return ListDataSourcesResponse
     */
    CompletableFuture<ListDataSourcesResponse> listDataSources(ListDataSourcesRequest request);

    /**
     * <b>description</b> :
     * <p>GET /api/v1/providers/{provider}/products.</p>
     * 
     * @param request the request parameters of ListProducts  ListProductsRequest
     * @return ListProductsResponse
     */
    CompletableFuture<ListProductsResponse> listProducts(ListProductsRequest request);

    /**
     * <b>description</b> :
     * <p>GET /api/v1/providers/{provider}/products/{product}/resourceTypes.</p>
     * 
     * @param request the request parameters of ListResourceTypes  ListResourceTypesRequest
     * @return ListResourceTypesResponse
     */
    CompletableFuture<ListResourceTypesResponse> listResourceTypes(ListResourceTypesRequest request);

    /**
     * @param request the request parameters of ListSupportedPricingApis  ListSupportedPricingApisRequest
     * @return ListSupportedPricingApisResponse
     */
    CompletableFuture<ListSupportedPricingApisResponse> listSupportedPricingApis(ListSupportedPricingApisRequest request);

    /**
     * <b>description</b> :
     * <p>You can go to <a href="https://next.api.aliyun.com/cloudcontrol">OpenAPI Explorer</a> to view the documentation and try out Cloud Control API.
     * If resources fail to be updated at any time, the Cloud Control API does not roll the resource back to the original status.
     * The resource APIs cannot be rolled back. If the API operation is partially failed to be called, you can call the GetResource operation to view the latest status of the resource. If necessary, you can call the UpdateResource or DeleteResource operation to manually compensate for the failure.</p>
     * 
     * @param request the request parameters of UpdateResource  UpdateResourceRequest
     * @return UpdateResourceResponse
     */
    CompletableFuture<UpdateResourceResponse> updateResource(UpdateResourceRequest request);

}
