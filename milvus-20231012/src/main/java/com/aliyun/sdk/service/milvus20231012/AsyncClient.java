// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.milvus20231012;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.milvus20231012.models.*;
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
     * @param request the request parameters of DescribeAccessControlList  DescribeAccessControlListRequest
     * @return DescribeAccessControlListResponse
     */
    CompletableFuture<DescribeAccessControlListResponse> describeAccessControlList(DescribeAccessControlListRequest request);

    /**
     * @param request the request parameters of DescribeInstanceConfigs  DescribeInstanceConfigsRequest
     * @return DescribeInstanceConfigsResponse
     */
    CompletableFuture<DescribeInstanceConfigsResponse> describeInstanceConfigs(DescribeInstanceConfigsRequest request);

    /**
     * @param request the request parameters of GetInstanceDetail  GetInstanceDetailRequest
     * @return GetInstanceDetailResponse
     */
    CompletableFuture<GetInstanceDetailResponse> getInstanceDetail(GetInstanceDetailRequest request);

    /**
     * @param request the request parameters of ListInstances  ListInstancesRequest
     * @return ListInstancesResponse
     */
    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    /**
     * @param request the request parameters of ModifyInstanceConfig  ModifyInstanceConfigRequest
     * @return ModifyInstanceConfigResponse
     */
    CompletableFuture<ModifyInstanceConfigResponse> modifyInstanceConfig(ModifyInstanceConfigRequest request);

    /**
     * @param request the request parameters of UpdateAccessControlList  UpdateAccessControlListRequest
     * @return UpdateAccessControlListResponse
     */
    CompletableFuture<UpdateAccessControlListResponse> updateAccessControlList(UpdateAccessControlListRequest request);

    /**
     * @param request the request parameters of UpdateInstanceName  UpdateInstanceNameRequest
     * @return UpdateInstanceNameResponse
     */
    CompletableFuture<UpdateInstanceNameResponse> updateInstanceName(UpdateInstanceNameRequest request);

    /**
     * @param request the request parameters of UpdatePublicNetworkStatus  UpdatePublicNetworkStatusRequest
     * @return UpdatePublicNetworkStatusResponse
     */
    CompletableFuture<UpdatePublicNetworkStatusResponse> updatePublicNetworkStatus(UpdatePublicNetworkStatusRequest request);

}
