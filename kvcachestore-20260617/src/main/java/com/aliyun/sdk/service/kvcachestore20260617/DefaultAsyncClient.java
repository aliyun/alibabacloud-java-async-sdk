// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kvcachestore20260617;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.kvcachestore20260617.models.*;
import darabonba.core.utils.*;
import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;

import java.util.concurrent.CompletableFuture;


/**
 * <p>Main client.</p>
 */
public final class DefaultAsyncClient implements AsyncClient {

    protected final String product;
    protected final String version;
    protected final String endpointRule;
    protected final java.util.Map<String, String> endpointMap;
    protected final TeaRequest REQUEST;
    protected final TeaAsyncHandler handler;

    protected DefaultAsyncClient(ClientConfiguration configuration) {
        this.handler = new TeaAsyncHandler(configuration);
        this.product = "Kvcachestore";
        this.version = "2026-06-17";
        this.endpointRule = "regional";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
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
    @Override
    public CompletableFuture<AttachKVCacheStoreResponse> attachKVCacheStore(AttachKVCacheStoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachKVCacheStore").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachKVCacheStoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachKVCacheStoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This is an asynchronous operation. After the request is successful, the KVCacheStore enters the Creating state. You can call GetKVCacheStore or ListKVCacheStores to query the KVCacheStore status. The KVCacheStore becomes available when its status changes to Available.</p>
     * <ul>
     * <li>To ensure idempotence in case of network exceptions, use ClientToken. If you call the operation with the same ClientToken and the same request parameters, the same KVCacheStore ID and order ID are returned. If the request parameters change, an IdempotentParameterMismatch error is returned.</li>
     * <li>Creating a KVCacheStore generates an order. The response includes OrderId, which you can view in the Expenses and Costs console. For more information, refer to View and manage orders.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateKVCacheStore  CreateKVCacheStoreRequest
     * @return CreateKVCacheStoreResponse
     */
    @Override
    public CompletableFuture<CreateKVCacheStoreResponse> createKVCacheStore(CreateKVCacheStoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateKVCacheStore").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateKVCacheStoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateKVCacheStoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteKVCacheStoreResponse> deleteKVCacheStore(DeleteKVCacheStoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteKVCacheStore").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteKVCacheStoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteKVCacheStoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    @Override
    public CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRegions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeZones  DescribeZonesRequest
     * @return DescribeZonesResponse
     */
    @Override
    public CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeZones").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeZonesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeZonesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This is an asynchronous operation. A return status of Detaching indicates that the request has been accepted. Call ListKVCacheStoreAttachInfo to query mount records. When no record corresponding to the specified KvcsId and VscId is found, the unmount operation is complete.</p>
     * 
     * @param request the request parameters of DetachKVCacheStore  DetachKVCacheStoreRequest
     * @return DetachKVCacheStoreResponse
     */
    @Override
    public CompletableFuture<DetachKVCacheStoreResponse> detachKVCacheStore(DetachKVCacheStoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachKVCacheStore").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachKVCacheStoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachKVCacheStoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetKVCacheStore  GetKVCacheStoreRequest
     * @return GetKVCacheStoreResponse
     */
    @Override
    public CompletableFuture<GetKVCacheStoreResponse> getKVCacheStore(GetKVCacheStoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetKVCacheStore").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetKVCacheStoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetKVCacheStoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation has no KVCacheStore status restrictions. If a KVCacheStore is in the Creating state, an empty list is returned.</p>
     * <ul>
     * <li>A KVCacheStore can be mounted to multiple VSCs, so each KVCacheStore may return multiple mount records.</li>
     * <li>This operation supports batch queries. You can query up to 100 KVCacheStores in a single request.</li>
     * <li>This operation supports page number-based pagination (PageNumber and PageSize) and cursor-based pagination (NextToken and MaxResults). If both sets of pagination parameters are specified, cursor-based pagination takes precedence.</li>
     * </ul>
     * 
     * @param request the request parameters of ListKVCacheStoreAttachInfo  ListKVCacheStoreAttachInfoRequest
     * @return ListKVCacheStoreAttachInfoResponse
     */
    @Override
    public CompletableFuture<ListKVCacheStoreAttachInfoResponse> listKVCacheStoreAttachInfo(ListKVCacheStoreAttachInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListKVCacheStoreAttachInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListKVCacheStoreAttachInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListKVCacheStoreAttachInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation queries available HpnZones by KVCacheStore. Use this operation to query available HPN cluster IDs before scaling or migrating a KVCacheStore.</p>
     * 
     * @param request the request parameters of ListKVCacheStoreAvailableHpnZones  ListKVCacheStoreAvailableHpnZonesRequest
     * @return ListKVCacheStoreAvailableHpnZonesResponse
     */
    @Override
    public CompletableFuture<ListKVCacheStoreAvailableHpnZonesResponse> listKVCacheStoreAvailableHpnZones(ListKVCacheStoreAvailableHpnZonesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListKVCacheStoreAvailableHpnZones").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListKVCacheStoreAvailableHpnZonesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListKVCacheStoreAvailableHpnZonesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListKVCacheStoreAvailableVscs  ListKVCacheStoreAvailableVscsRequest
     * @return ListKVCacheStoreAvailableVscsResponse
     */
    @Override
    public CompletableFuture<ListKVCacheStoreAvailableVscsResponse> listKVCacheStoreAvailableVscs(ListKVCacheStoreAvailableVscsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListKVCacheStoreAvailableVscs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListKVCacheStoreAvailableVscsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListKVCacheStoreAvailableVscsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Two pagination methods are supported: page number-based pagination (PageNumber + PageSize) and cursor-based pagination (NextToken + MaxResults). If both are specified, page number-based pagination takes precedence.</p>
     * 
     * @param request the request parameters of ListKVCacheStores  ListKVCacheStoresRequest
     * @return ListKVCacheStoresResponse
     */
    @Override
    public CompletableFuture<ListKVCacheStoresResponse> listKVCacheStores(ListKVCacheStoresRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListKVCacheStores").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListKVCacheStoresResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListKVCacheStoresResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<UpdateKVCacheStoreResponse> updateKVCacheStore(UpdateKVCacheStoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateKVCacheStore").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateKVCacheStoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateKVCacheStoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
