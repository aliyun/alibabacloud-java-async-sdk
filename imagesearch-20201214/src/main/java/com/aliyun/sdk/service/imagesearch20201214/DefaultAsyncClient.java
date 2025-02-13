// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imagesearch20201214;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.imagesearch20201214.models.*;
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
        this.product = "ImageSearch";
        this.version = "2020-12-14";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>This operation deletes images from an Image Search instance.</p>
     * <blockquote>
     * <p> A success response is returned even if the specified image does not exist on the instance. Therefore, you cannot determine whether the image exists on the instance based on the response.</p>
     * </blockquote>
     * <h2>QPS limits</h2>
     * <p>By default, the maximum number of queries supported by this operation is 20. In this case, the system can process at most 20 requests every second.</p>
     * 
     * @param request the request parameters of DeleteImage  DeleteImageRequest
     * @return DeleteImageResponse
     */
    @Override
    public CompletableFuture<DeleteImageResponse> deleteImage(DeleteImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation queries instance details.</p>
     * <h2>QPS limits</h2>
     * <p>By default, the maximum number of queries supported by this operation is 1. In this case, the system can process only 1 request every second.</p>
     * 
     * @param request the request parameters of Detail  DetailRequest
     * @return DetailResponse
     */
    @Override
    public CompletableFuture<DetailResponse> detail(DetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("Detail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation creates a task for exporting metadata from an Image Search instance.</p>
     * <h2>QPS limits</h2>
     * <p>By default, the maximum number of queries supported by this operation is 1. In this case, the system can process at most 1 request every second.</p>
     * 
     * @param request the request parameters of DumpMeta  DumpMetaRequest
     * @return DumpMetaResponse
     */
    @Override
    public CompletableFuture<DumpMetaResponse> dumpMeta(DumpMetaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DumpMeta").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DumpMetaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DumpMetaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation queries tasks that are used for exporting metadata from an Image Search instance.</p>
     * <h2>QPS limits</h2>
     * <p>By default, the maximum number of queries supported by this operation is 1. In this case, the system can process at most 1 request every second.</p>
     * 
     * @param request the request parameters of DumpMetaList  DumpMetaListRequest
     * @return DumpMetaListResponse
     */
    @Override
    public CompletableFuture<DumpMetaListResponse> dumpMetaList(DumpMetaListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DumpMetaList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DumpMetaListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DumpMetaListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation creates a batch task on an Image Search instance.</p>
     * <h2>QPS limits</h2>
     * <p>By default, the maximum number of queries supported by this operation is 1. In this case, the system can process at most 1 request every second.</p>
     * 
     * @param request the request parameters of IncreaseInstance  IncreaseInstanceRequest
     * @return IncreaseInstanceResponse
     */
    @Override
    public CompletableFuture<IncreaseInstanceResponse> increaseInstance(IncreaseInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("IncreaseInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(IncreaseInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<IncreaseInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation queries batch tasks on an Image Search instance.</p>
     * <h2>QPS limits</h2>
     * <p>By default, the maximum number of queries supported by this operation is 1. In this case, the system can process at most 1 request every second.</p>
     * 
     * @param request the request parameters of IncreaseList  IncreaseListRequest
     * @return IncreaseListResponse
     */
    @Override
    public CompletableFuture<IncreaseListResponse> increaseList(IncreaseListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("IncreaseList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(IncreaseListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<IncreaseListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation searches for images by image name on an Image Search instance.</p>
     * <h2>QPS limits</h2>
     * <p>The maximum number of queries per second is displayed in the Image Search console. The upper limit is specified when you purchase the instance. You can set the upper limit to 5 QPS or 10 QPS.</p>
     * 
     * @param request the request parameters of SearchImageByName  SearchImageByNameRequest
     * @return SearchImageByNameResponse
     */
    @Override
    public CompletableFuture<SearchImageByNameResponse> searchImageByName(SearchImageByNameRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SearchImageByName").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchImageByNameResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchImageByNameResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation updates image information on an Image Search instance.</p>
     * <blockquote>
     * <ul>
     * <li>Limits are imposed on the instance creation time.</li>
     * <li>This operation is supported by instances that are created in the Singapore (Singapore) region after December 2021. This operation is not supported in other regions.</li>
     * </ul>
     * </blockquote>
     * <h2>QPS limits</h2>
     * <p>By default, the maximum number of queries supported by this operation is 20. In this case, the system can process at most 20 requests every second.</p>
     * 
     * @param request the request parameters of UpdateImage  UpdateImageRequest
     * @return UpdateImageResponse
     */
    @Override
    public CompletableFuture<UpdateImageResponse> updateImage(UpdateImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
