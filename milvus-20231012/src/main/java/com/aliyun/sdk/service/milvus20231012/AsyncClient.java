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

    CompletableFuture<DescribeAccessControlListResponse> describeAccessControlList(DescribeAccessControlListRequest request);

    CompletableFuture<DescribeInstanceConfigsResponse> describeInstanceConfigs(DescribeInstanceConfigsRequest request);

    CompletableFuture<GetInstanceDetailResponse> getInstanceDetail(GetInstanceDetailRequest request);

    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    CompletableFuture<ModifyInstanceConfigResponse> modifyInstanceConfig(ModifyInstanceConfigRequest request);

    CompletableFuture<UpdateAccessControlListResponse> updateAccessControlList(UpdateAccessControlListRequest request);

    CompletableFuture<UpdateInstanceNameResponse> updateInstanceName(UpdateInstanceNameRequest request);

    CompletableFuture<UpdatePublicNetworkStatusResponse> updatePublicNetworkStatus(UpdatePublicNetworkStatusRequest request);

}
