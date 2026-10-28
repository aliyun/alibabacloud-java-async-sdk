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
     * <p>This is an asynchronous operation. A return status of Attaching indicates that the request has been accepted. Call ListKVCacheStoreAttachInfo to query mount records. A record status of Attached indicates that the mount is complete.</p>
     * <ul>
     * <li>The KVCacheStore must be in the Available or InUse state before it can be mounted.</li>
     * </ul>
     * 
     * @param request the request parameters of AttachKVCacheStore  AttachKVCacheStoreRequest
     * @return AttachKVCacheStoreResponse
     */
    CompletableFuture<AttachKVCacheStoreResponse> attachKVCacheStore(AttachKVCacheStoreRequest request);

    /**
     * <b>description</b> :
     * <p>This is an asynchronous operation. After the request is successful, the KVCacheStore enters the Creating state. You can call GetKVCacheStore or ListKVCacheStores to query the KVCacheStore status. The KVCacheStore is available after the status changes to Available.</p>
     * <ul>
     * <li>To ensure idempotency in case of network exceptions, use ClientToken. If you call this operation with the same ClientToken and the same request parameters, the same KVCacheStore ID and order ID are returned. If the request parameters change, an IdempotentParameterMismatch error is returned.</li>
     * <li>When a KVCacheStore is created, an order is generated at the same time. The OrderId is returned in the response. You can view the order in the Expenses and Costs console. For more information, see View and manage orders.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateKVCacheStore  CreateKVCacheStoreRequest
     * @return CreateKVCacheStoreResponse
     */
    CompletableFuture<CreateKVCacheStoreResponse> createKVCacheStore(CreateKVCacheStoreRequest request);

    /**
     * <b>description</b> :
     * <p>The delete operation is irreversible. Data in the KVCacheStore will be erased and cannot be recovered. Proceed with caution.</p>
     * <ul>
     * <li>Billing stops after the deletion begins.</li>
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
     * <p>This operation is asynchronous. A return value of Detaching indicates that the request has been accepted. Call ListKVCacheStoreAttachInfo to query attachment records. If no record is found for the specified KvcsId and VscId, the detachment is complete.</p>
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
     * <li>A KVCacheStore can be mounted to multiple VSCs. Multiple mount records may be returned for each KVCacheStore.</li>
     * <li>This operation supports batch queries. You can query up to 100 KVCacheStores in a single call.</li>
     * <li>This operation supports page number-based pagination (PageNumber and PageSize) and cursor-based pagination (NextToken and MaxResults). If both sets of pagination parameters are provided, cursor-based pagination takes precedence.</li>
     * </ul>
     * 
     * @param request the request parameters of ListKVCacheStoreAttachInfo  ListKVCacheStoreAttachInfoRequest
     * @return ListKVCacheStoreAttachInfoResponse
     */
    CompletableFuture<ListKVCacheStoreAttachInfoResponse> listKVCacheStoreAttachInfo(ListKVCacheStoreAttachInfoRequest request);

    /**
     * <b>description</b> :
     * <p>This operation queries available HpnZones by KVCacheStore instance. It is used to query optional HPN cluster IDs before scaling or migrating a KVCacheStore instance.</p>
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
     * <p>Two pagination methods are supported: page number-based pagination (PageNumber + PageSize) and cursor-based pagination (NextToken + MaxResults). If both are specified, page number-based pagination takes precedence.</p>
     * 
     * @param request the request parameters of ListKVCacheStores  ListKVCacheStoresRequest
     * @return ListKVCacheStoresResponse
     */
    CompletableFuture<ListKVCacheStoresResponse> listKVCacheStores(ListKVCacheStoresRequest request);

    /**
     * <b>description</b> :
     * <p>Supports modifying Name, Description, and Capacity. The cluster number (HpnZone) cannot be modified after creation.</p>
     * <ul>
     * <li>Modifying Capacity triggers a specification change order, and the operation returns an OrderId. Modifying only Name or Description does not generate an order.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateKVCacheStore  UpdateKVCacheStoreRequest
     * @return UpdateKVCacheStoreResponse
     */
    CompletableFuture<UpdateKVCacheStoreResponse> updateKVCacheStore(UpdateKVCacheStoreRequest request);

}
