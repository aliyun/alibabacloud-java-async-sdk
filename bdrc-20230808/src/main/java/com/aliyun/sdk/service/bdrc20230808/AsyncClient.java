// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bdrc20230808;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.bdrc20230808.models.*;
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
     * @param request the request parameters of CheckRules  CheckRulesRequest
     * @return CheckRulesResponse
     */
    CompletableFuture<CheckRulesResponse> checkRules(CheckRulesRequest request);

    /**
     * @param request the request parameters of CloseBdrcService  CloseBdrcServiceRequest
     * @return CloseBdrcServiceResponse
     */
    CompletableFuture<CloseBdrcServiceResponse> closeBdrcService(CloseBdrcServiceRequest request);

    /**
     * @param request the request parameters of DescribeCheckDetails  DescribeCheckDetailsRequest
     * @return DescribeCheckDetailsResponse
     */
    CompletableFuture<DescribeCheckDetailsResponse> describeCheckDetails(DescribeCheckDetailsRequest request);

    /**
     * @param request the request parameters of DescribeProducts  DescribeProductsRequest
     * @return DescribeProductsResponse
     */
    CompletableFuture<DescribeProductsResponse> describeProducts(DescribeProductsRequest request);

    /**
     * @param request the request parameters of DescribeResources  DescribeResourcesRequest
     * @return DescribeResourcesResponse
     */
    CompletableFuture<DescribeResourcesResponse> describeResources(DescribeResourcesRequest request);

    /**
     * @param request the request parameters of DescribeRules  DescribeRulesRequest
     * @return DescribeRulesResponse
     */
    CompletableFuture<DescribeRulesResponse> describeRules(DescribeRulesRequest request);

    /**
     * @param request the request parameters of DescribeTask  DescribeTaskRequest
     * @return DescribeTaskResponse
     */
    CompletableFuture<DescribeTaskResponse> describeTask(DescribeTaskRequest request);

    /**
     * @param request the request parameters of DescribeTasks  DescribeTasksRequest
     * @return DescribeTasksResponse
     */
    CompletableFuture<DescribeTasksResponse> describeTasks(DescribeTasksRequest request);

    /**
     * @param request the request parameters of DescribeTopRiskyResources  DescribeTopRiskyResourcesRequest
     * @return DescribeTopRiskyResourcesResponse
     */
    CompletableFuture<DescribeTopRiskyResourcesResponse> describeTopRiskyResources(DescribeTopRiskyResourcesRequest request);

    /**
     * @param request the request parameters of DisableCheckProduct  DisableCheckProductRequest
     * @return DisableCheckProductResponse
     */
    CompletableFuture<DisableCheckProductResponse> disableCheckProduct(DisableCheckProductRequest request);

    /**
     * @param request the request parameters of DisableCheckResource  DisableCheckResourceRequest
     * @return DisableCheckResourceResponse
     */
    CompletableFuture<DisableCheckResourceResponse> disableCheckResource(DisableCheckResourceRequest request);

    /**
     * @param request the request parameters of EnableCheckProduct  EnableCheckProductRequest
     * @return EnableCheckProductResponse
     */
    CompletableFuture<EnableCheckProductResponse> enableCheckProduct(EnableCheckProductRequest request);

    /**
     * @param request the request parameters of EnableCheckResource  EnableCheckResourceRequest
     * @return EnableCheckResourceResponse
     */
    CompletableFuture<EnableCheckResourceResponse> enableCheckResource(EnableCheckResourceRequest request);

    /**
     * @param request the request parameters of GetBdrcService  GetBdrcServiceRequest
     * @return GetBdrcServiceResponse
     */
    CompletableFuture<GetBdrcServiceResponse> getBdrcService(GetBdrcServiceRequest request);

    /**
     * @param request the request parameters of OpenBdrcService  OpenBdrcServiceRequest
     * @return OpenBdrcServiceResponse
     */
    CompletableFuture<OpenBdrcServiceResponse> openBdrcService(OpenBdrcServiceRequest request);

    /**
     * @param request the request parameters of UpdateResources  UpdateResourcesRequest
     * @return UpdateResourcesResponse
     */
    CompletableFuture<UpdateResourcesResponse> updateResources(UpdateResourcesRequest request);

}
