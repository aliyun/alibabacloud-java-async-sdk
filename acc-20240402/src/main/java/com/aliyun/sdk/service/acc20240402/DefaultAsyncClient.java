// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.acc20240402;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.acc20240402.models.*;
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
        this.product = "acc";
        this.version = "2024-04-02";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("ap-northeast-2-pop", "acc.aliyuncs.com"),
            new TeaPair("ap-south-1", "acc.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "acc.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "acc.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "acc.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "acc.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "acc.aliyuncs.com"),
            new TeaPair("cn-edge-1", "acc.aliyuncs.com"),
            new TeaPair("cn-fujian", "acc.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "acc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "acc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "acc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "acc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "acc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "acc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "acc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "acc.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "acc.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "acc.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "acc.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "acc.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "acc.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "acc.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "acc.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "acc.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "acc.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "acc.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "acc.aliyuncs.com"),
            new TeaPair("cn-wuhan", "acc.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "acc.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "acc.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "acc.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "acc.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "acc.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "acc.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "acc.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of CreateImageCache  CreateImageCacheRequest
     * @return CreateImageCacheResponse
     */
    @Override
    public CompletableFuture<CreateImageCacheResponse> createImageCache(CreateImageCacheRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateImageCache").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateImageCacheResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateImageCacheResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteImageCache  DeleteImageCacheRequest
     * @return DeleteImageCacheResponse
     */
    @Override
    public CompletableFuture<DeleteImageCacheResponse> deleteImageCache(DeleteImageCacheRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteImageCache").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteImageCacheResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteImageCacheResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetImageCache  GetImageCacheRequest
     * @return GetImageCacheResponse
     */
    @Override
    public CompletableFuture<GetImageCacheResponse> getImageCache(GetImageCacheRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetImageCache").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetImageCacheResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetImageCacheResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListImageCaches  ListImageCachesRequest
     * @return ListImageCachesResponse
     */
    @Override
    public CompletableFuture<ListImageCachesResponse> listImageCaches(ListImageCachesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListImageCaches").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListImageCachesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListImageCachesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
