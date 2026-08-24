// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kvcachestore20260617;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.kvcachestore20260617.models.*;
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
     * @param request the request parameters of AttachKVCacheStore  AttachKVCacheStoreRequest
     * @return AttachKVCacheStoreResponse
     */
    CompletableFuture<AttachKVCacheStoreResponse> attachKVCacheStore(AttachKVCacheStoreRequest request);

    /**
     * @param request the request parameters of CreateKVCacheStore  CreateKVCacheStoreRequest
     * @return CreateKVCacheStoreResponse
     */
    CompletableFuture<CreateKVCacheStoreResponse> createKVCacheStore(CreateKVCacheStoreRequest request);

    /**
     * @param request the request parameters of DeleteKVCacheStore  DeleteKVCacheStoreRequest
     * @return DeleteKVCacheStoreResponse
     */
    CompletableFuture<DeleteKVCacheStoreResponse> deleteKVCacheStore(DeleteKVCacheStoreRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of DescribeZones  DescribeZonesRequest
     * @return DescribeZonesResponse
     */
    CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request);

    /**
     * @param request the request parameters of DetachKVCacheStore  DetachKVCacheStoreRequest
     * @return DetachKVCacheStoreResponse
     */
    CompletableFuture<DetachKVCacheStoreResponse> detachKVCacheStore(DetachKVCacheStoreRequest request);

    /**
     * @param request the request parameters of GetKVCacheStore  GetKVCacheStoreRequest
     * @return GetKVCacheStoreResponse
     */
    CompletableFuture<GetKVCacheStoreResponse> getKVCacheStore(GetKVCacheStoreRequest request);

    /**
     * @param request the request parameters of ListKVCacheStoreAttachInfo  ListKVCacheStoreAttachInfoRequest
     * @return ListKVCacheStoreAttachInfoResponse
     */
    CompletableFuture<ListKVCacheStoreAttachInfoResponse> listKVCacheStoreAttachInfo(ListKVCacheStoreAttachInfoRequest request);

    /**
     * @param request the request parameters of ListKVCacheStoreAvailableHpnZones  ListKVCacheStoreAvailableHpnZonesRequest
     * @return ListKVCacheStoreAvailableHpnZonesResponse
     */
    CompletableFuture<ListKVCacheStoreAvailableHpnZonesResponse> listKVCacheStoreAvailableHpnZones(ListKVCacheStoreAvailableHpnZonesRequest request);

    /**
     * @param request the request parameters of ListKVCacheStores  ListKVCacheStoresRequest
     * @return ListKVCacheStoresResponse
     */
    CompletableFuture<ListKVCacheStoresResponse> listKVCacheStores(ListKVCacheStoresRequest request);

    /**
     * @param request the request parameters of UpdateKVCacheStore  UpdateKVCacheStoreRequest
     * @return UpdateKVCacheStoreResponse
     */
    CompletableFuture<UpdateKVCacheStoreResponse> updateKVCacheStore(UpdateKVCacheStoreRequest request);

}
