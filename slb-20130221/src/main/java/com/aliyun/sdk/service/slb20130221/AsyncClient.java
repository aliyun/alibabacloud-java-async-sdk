// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20130221;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.slb20130221.models.*;
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
     * @param request the request parameters of AddBackendServers  AddBackendServersRequest
     * @return AddBackendServersResponse
     */
    CompletableFuture<AddBackendServersResponse> addBackendServers(AddBackendServersRequest request);

    /**
     * @param request the request parameters of CreateLoadBalancer  CreateLoadBalancerRequest
     * @return CreateLoadBalancerResponse
     */
    CompletableFuture<CreateLoadBalancerResponse> createLoadBalancer(CreateLoadBalancerRequest request);

    /**
     * @param request the request parameters of CreateLoadBalancerHTTPListener  CreateLoadBalancerHTTPListenerRequest
     * @return CreateLoadBalancerHTTPListenerResponse
     */
    CompletableFuture<CreateLoadBalancerHTTPListenerResponse> createLoadBalancerHTTPListener(CreateLoadBalancerHTTPListenerRequest request);

    /**
     * @param request the request parameters of CreateLoadBalancerTCPListener  CreateLoadBalancerTCPListenerRequest
     * @return CreateLoadBalancerTCPListenerResponse
     */
    CompletableFuture<CreateLoadBalancerTCPListenerResponse> createLoadBalancerTCPListener(CreateLoadBalancerTCPListenerRequest request);

    /**
     * @param request the request parameters of DeleteLoadBalancer  DeleteLoadBalancerRequest
     * @return DeleteLoadBalancerResponse
     */
    CompletableFuture<DeleteLoadBalancerResponse> deleteLoadBalancer(DeleteLoadBalancerRequest request);

    /**
     * @param request the request parameters of DeleteLoadBalancerListener  DeleteLoadBalancerListenerRequest
     * @return DeleteLoadBalancerListenerResponse
     */
    CompletableFuture<DeleteLoadBalancerListenerResponse> deleteLoadBalancerListener(DeleteLoadBalancerListenerRequest request);

    /**
     * @param request the request parameters of DescribeBackendServers  DescribeBackendServersRequest
     * @return DescribeBackendServersResponse
     */
    CompletableFuture<DescribeBackendServersResponse> describeBackendServers(DescribeBackendServersRequest request);

    /**
     * @param request the request parameters of DescribeLoadBalancerAttribute  DescribeLoadBalancerAttributeRequest
     * @return DescribeLoadBalancerAttributeResponse
     */
    CompletableFuture<DescribeLoadBalancerAttributeResponse> describeLoadBalancerAttribute(DescribeLoadBalancerAttributeRequest request);

    /**
     * @param request the request parameters of DescribeLoadBalancerHTTPListenerAttribute  DescribeLoadBalancerHTTPListenerAttributeRequest
     * @return DescribeLoadBalancerHTTPListenerAttributeResponse
     */
    CompletableFuture<DescribeLoadBalancerHTTPListenerAttributeResponse> describeLoadBalancerHTTPListenerAttribute(DescribeLoadBalancerHTTPListenerAttributeRequest request);

    /**
     * @param request the request parameters of DescribeLoadBalancerTCPListenerAttribute  DescribeLoadBalancerTCPListenerAttributeRequest
     * @return DescribeLoadBalancerTCPListenerAttributeResponse
     */
    CompletableFuture<DescribeLoadBalancerTCPListenerAttributeResponse> describeLoadBalancerTCPListenerAttribute(DescribeLoadBalancerTCPListenerAttributeRequest request);

    /**
     * @param request the request parameters of DescribeLoadBalancers  DescribeLoadBalancersRequest
     * @return DescribeLoadBalancersResponse
     */
    CompletableFuture<DescribeLoadBalancersResponse> describeLoadBalancers(DescribeLoadBalancersRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of RemoveBackendServers  RemoveBackendServersRequest
     * @return RemoveBackendServersResponse
     */
    CompletableFuture<RemoveBackendServersResponse> removeBackendServers(RemoveBackendServersRequest request);

    /**
     * @param request the request parameters of SetLoadBalancerHTTPListenerAttribute  SetLoadBalancerHTTPListenerAttributeRequest
     * @return SetLoadBalancerHTTPListenerAttributeResponse
     */
    CompletableFuture<SetLoadBalancerHTTPListenerAttributeResponse> setLoadBalancerHTTPListenerAttribute(SetLoadBalancerHTTPListenerAttributeRequest request);

    /**
     * @param request the request parameters of SetLoadBalancerListenerStatus  SetLoadBalancerListenerStatusRequest
     * @return SetLoadBalancerListenerStatusResponse
     */
    CompletableFuture<SetLoadBalancerListenerStatusResponse> setLoadBalancerListenerStatus(SetLoadBalancerListenerStatusRequest request);

    /**
     * @param request the request parameters of SetLoadBalancerName  SetLoadBalancerNameRequest
     * @return SetLoadBalancerNameResponse
     */
    CompletableFuture<SetLoadBalancerNameResponse> setLoadBalancerName(SetLoadBalancerNameRequest request);

    /**
     * @param request the request parameters of SetLoadBalancerStatus  SetLoadBalancerStatusRequest
     * @return SetLoadBalancerStatusResponse
     */
    CompletableFuture<SetLoadBalancerStatusResponse> setLoadBalancerStatus(SetLoadBalancerStatusRequest request);

    /**
     * @param request the request parameters of SetLoadBalancerTCPListenerAttribute  SetLoadBalancerTCPListenerAttributeRequest
     * @return SetLoadBalancerTCPListenerAttributeResponse
     */
    CompletableFuture<SetLoadBalancerTCPListenerAttributeResponse> setLoadBalancerTCPListenerAttribute(SetLoadBalancerTCPListenerAttributeRequest request);

}
