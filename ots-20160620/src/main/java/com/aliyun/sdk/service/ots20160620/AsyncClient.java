// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ots20160620;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ots20160620.models.*;
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

    CompletableFuture<BindInstance2VpcResponse> bindInstance2Vpc(BindInstance2VpcRequest request);

    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    CompletableFuture<DeleteTagsResponse> deleteTags(DeleteTagsRequest request);

    CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request);

    CompletableFuture<GetOtsServiceStatusResponse> getOtsServiceStatus(GetOtsServiceStatusRequest request);

    CompletableFuture<InsertInstanceResponse> insertInstance(InsertInstanceRequest request);

    CompletableFuture<InsertTagsResponse> insertTags(InsertTagsRequest request);

    CompletableFuture<ListClusterTypeResponse> listClusterType(ListClusterTypeRequest request);

    CompletableFuture<ListInstanceResponse> listInstance(ListInstanceRequest request);

    CompletableFuture<ListTagsResponse> listTags(ListTagsRequest request);

    CompletableFuture<ListVpcInfoByInstanceResponse> listVpcInfoByInstance(ListVpcInfoByInstanceRequest request);

    CompletableFuture<ListVpcInfoByVpcResponse> listVpcInfoByVpc(ListVpcInfoByVpcRequest request);

    CompletableFuture<OpenOtsServiceResponse> openOtsService(OpenOtsServiceRequest request);

    CompletableFuture<UnbindInstance2VpcResponse> unbindInstance2Vpc(UnbindInstance2VpcRequest request);

    CompletableFuture<UpdateInstanceResponse> updateInstance(UpdateInstanceRequest request);

}
