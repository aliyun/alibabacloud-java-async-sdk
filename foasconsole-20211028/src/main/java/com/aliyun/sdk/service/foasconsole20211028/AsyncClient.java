// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20211028;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.foasconsole20211028.models.*;
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

    CompletableFuture<ConvertInstanceResponse> convertInstance(ConvertInstanceRequest request);

    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    CompletableFuture<CreateNamespaceResponse> createNamespace(CreateNamespaceRequest request);

    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    CompletableFuture<DeleteNamespaceResponse> deleteNamespace(DeleteNamespaceRequest request);

    CompletableFuture<DescribeInstancesResponse> describeInstances(DescribeInstancesRequest request);

    CompletableFuture<DescribeNamespacesResponse> describeNamespaces(DescribeNamespacesRequest request);

    CompletableFuture<DescribeSupportedRegionsResponse> describeSupportedRegions(DescribeSupportedRegionsRequest request);

    CompletableFuture<DescribeSupportedZonesResponse> describeSupportedZones(DescribeSupportedZonesRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ModifyPrepayInstanceSpecResponse> modifyPrepayInstanceSpec(ModifyPrepayInstanceSpecRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ModifyPrepayNamespaceSpecResponse> modifyPrepayNamespaceSpec(ModifyPrepayNamespaceSpecRequest request);

    CompletableFuture<QueryConvertInstancePriceResponse> queryConvertInstancePrice(QueryConvertInstancePriceRequest request);

    CompletableFuture<QueryCreateInstancePriceResponse> queryCreateInstancePrice(QueryCreateInstancePriceRequest request);

    CompletableFuture<QueryModifyInstancePriceResponse> queryModifyInstancePrice(QueryModifyInstancePriceRequest request);

    CompletableFuture<QueryRenewInstancePriceResponse> queryRenewInstancePrice(QueryRenewInstancePriceRequest request);

    CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

}
