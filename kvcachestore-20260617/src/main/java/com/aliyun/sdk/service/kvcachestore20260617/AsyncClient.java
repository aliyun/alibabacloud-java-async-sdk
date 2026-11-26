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
     * <b>description</b> :
     * <p>This operation is asynchronous. A return value of Attaching indicates that the request is accepted. Call ListKVCacheStoreAttachInfo to query the mount records. When the record status changes to Attached, the mounting is complete.</p>
     * <ul>
     * <li>The KVCacheStore must be in the Available or InUse state to be mounted.</li>
     * </ul>
     * 
     * @param request the request parameters of AttachKVCacheStore  AttachKVCacheStoreRequest
     * @return AttachKVCacheStoreResponse
     */
    CompletableFuture<AttachKVCacheStoreResponse> attachKVCacheStore(AttachKVCacheStoreRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is asynchronous. After a successful response is returned, the KVCacheStore enters the Creating state. You can call the GetKVCacheStore or ListKVCacheStores operation to query the status of the KVCacheStore. The KVCacheStore becomes available after its status changes to Available.</p>
     * <ul>
     * <li>Use ClientToken to ensure request idempotence in case of network exceptions. If you make repeated calls with the same ClientToken and request parameters, the same KVCacheStore ID and order ID are returned. If the request parameters change, an IdempotentParameterMismatch error is returned.</li>
     * <li>Creating a KVCacheStore synchronously generates an order. The operation returns an OrderId. You can view the order in the Expenses and Costs console. For more information, see View and manage orders.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateKVCacheStore  CreateKVCacheStoreRequest
     * @return CreateKVCacheStoreResponse
     */
    CompletableFuture<CreateKVCacheStoreResponse> createKVCacheStore(CreateKVCacheStoreRequest request);

    /**
     * <b>description</b> :
     * <p>The delete operation is irreversible. Data in the KVCacheStore will be cleared and cannot be recovered. Proceed with caution.</p>
     * <ul>
     * <li>Billing stops after the deletion process starts.</li>
     * <li>The KVCacheStore to be deleted cannot be in the Creating state.</li>
     * <li>The KVCacheStore to be deleted cannot have mount records in the Attaching or Attached state.</li>
     * </ul>
     * 
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
     * <b>description</b> :
     * <p>This operation is asynchronous. A return value of Detaching indicates that the request is accepted. Call ListKVCacheStoreAttachInfo to query mount records. If no record is found for the specified KvcsId and VscId, the unmount operation is complete.</p>
     * 
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
     * <b>description</b> :
     * <p>This operation has no status restrictions on KVCacheStore. If a KVCacheStore is in the Creating state, an empty list is returned.</p>
     * <ul>
     * <li>A KVCacheStore can be attached to multiple VSCs. Multiple attachment records may be returned for each KVCacheStore.</li>
     * <li>This operation supports batch queries. You can query up to 100 KVCacheStores in a single request.</li>
     * <li>This operation supports page number-based pagination (PageNumber and PageSize) and cursor-based pagination (NextToken and MaxResults). If both sets of pagination parameters are specified, cursor-based pagination takes precedence.</li>
     * </ul>
     * 
     * @param request the request parameters of ListKVCacheStoreAttachInfo  ListKVCacheStoreAttachInfoRequest
     * @return ListKVCacheStoreAttachInfoResponse
     */
    CompletableFuture<ListKVCacheStoreAttachInfoResponse> listKVCacheStoreAttachInfo(ListKVCacheStoreAttachInfoRequest request);

    /**
     * <b>description</b> :
     * <p>This operation queries available HpnZones for a KVCacheStore instance. Use this operation to query optional HPN cluster IDs before you scale out or migrate a KVCacheStore instance.</p>
     * 
     * @param request the request parameters of ListKVCacheStoreAvailableHpnZones  ListKVCacheStoreAvailableHpnZonesRequest
     * @return ListKVCacheStoreAvailableHpnZonesResponse
     */
    CompletableFuture<ListKVCacheStoreAvailableHpnZonesResponse> listKVCacheStoreAvailableHpnZones(ListKVCacheStoreAvailableHpnZonesRequest request);

    /**
     * @param request the request parameters of ListKVCacheStoreAvailableVscs  ListKVCacheStoreAvailableVscsRequest
     * @return ListKVCacheStoreAvailableVscsResponse
     */
    CompletableFuture<ListKVCacheStoreAvailableVscsResponse> listKVCacheStoreAvailableVscs(ListKVCacheStoreAvailableVscsRequest request);

    /**
     * <b>description</b> :
     * <p>Supports two pagination methods: page number pagination (PageNumber + PageSize) and cursor pagination (NextToken + MaxResults). If both are provided, page number pagination takes precedence.</p>
     * 
     * @param request the request parameters of ListKVCacheStores  ListKVCacheStoresRequest
     * @return ListKVCacheStoresResponse
     */
    CompletableFuture<ListKVCacheStoresResponse> listKVCacheStores(ListKVCacheStoresRequest request);

    /**
     * <b>description</b> :
     * <p>You can modify the Name, Description, and Capacity. The cluster ID (HpnZone) cannot be modified after creation.</p>
     * <ul>
     * <li>Modifying the Capacity triggers a specification change order, and the API returns an OrderId. Modifying only the Name or Description does not generate an order.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateKVCacheStore  UpdateKVCacheStoreRequest
     * @return UpdateKVCacheStoreResponse
     */
    CompletableFuture<UpdateKVCacheStoreResponse> updateKVCacheStore(UpdateKVCacheStoreRequest request);

}
