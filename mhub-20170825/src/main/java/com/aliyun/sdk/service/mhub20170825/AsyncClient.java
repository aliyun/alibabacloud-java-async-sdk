// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mhub20170825;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.mhub20170825.models.*;
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
     * @param request the request parameters of CreateApp  CreateAppRequest
     * @return CreateAppResponse
     */
    CompletableFuture<CreateAppResponse> createApp(CreateAppRequest request);

    /**
     * @param request the request parameters of CreateProduct  CreateProductRequest
     * @return CreateProductResponse
     */
    CompletableFuture<CreateProductResponse> createProduct(CreateProductRequest request);

    /**
     * @param request the request parameters of DeleteApp  DeleteAppRequest
     * @return DeleteAppResponse
     */
    CompletableFuture<DeleteAppResponse> deleteApp(DeleteAppRequest request);

    /**
     * @param request the request parameters of DeleteProduct  DeleteProductRequest
     * @return DeleteProductResponse
     */
    CompletableFuture<DeleteProductResponse> deleteProduct(DeleteProductRequest request);

    /**
     * @param request the request parameters of DescribeDashboard  DescribeDashboardRequest
     * @return DescribeDashboardResponse
     */
    CompletableFuture<DescribeDashboardResponse> describeDashboard(DescribeDashboardRequest request);

    /**
     * @param request the request parameters of ListApps  ListAppsRequest
     * @return ListAppsResponse
     */
    CompletableFuture<ListAppsResponse> listApps(ListAppsRequest request);

    /**
     * @param request the request parameters of ListProducts  ListProductsRequest
     * @return ListProductsResponse
     */
    CompletableFuture<ListProductsResponse> listProducts(ListProductsRequest request);

    /**
     * @param request the request parameters of ModifyApp  ModifyAppRequest
     * @return ModifyAppResponse
     */
    CompletableFuture<ModifyAppResponse> modifyApp(ModifyAppRequest request);

    /**
     * @param request the request parameters of ModifyProduct  ModifyProductRequest
     * @return ModifyProductResponse
     */
    CompletableFuture<ModifyProductResponse> modifyProduct(ModifyProductRequest request);

    /**
     * @param request the request parameters of OpenEmasService  OpenEmasServiceRequest
     * @return OpenEmasServiceResponse
     */
    CompletableFuture<OpenEmasServiceResponse> openEmasService(OpenEmasServiceRequest request);

    /**
     * @param request the request parameters of QueryAppInfo  QueryAppInfoRequest
     * @return QueryAppInfoResponse
     */
    CompletableFuture<QueryAppInfoResponse> queryAppInfo(QueryAppInfoRequest request);

    /**
     * @param request the request parameters of QueryAppSecurityInfo  QueryAppSecurityInfoRequest
     * @return QueryAppSecurityInfoResponse
     */
    CompletableFuture<QueryAppSecurityInfoResponse> queryAppSecurityInfo(QueryAppSecurityInfoRequest request);

    /**
     * @param request the request parameters of QueryProductInfo  QueryProductInfoRequest
     * @return QueryProductInfoResponse
     */
    CompletableFuture<QueryProductInfoResponse> queryProductInfo(QueryProductInfoRequest request);

}
