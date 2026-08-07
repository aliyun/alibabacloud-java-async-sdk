// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paimodelgallery20260603;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.paimodelgallery20260603.models.*;
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
        this.product = "PAIModelGallery";
        this.version = "2026-06-03";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("us-west-1", "paimodelgallery.us-west-1.aliyuncs.com"),
            new TeaPair("us-east-1", "paimodelgallery.us-east-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "paimodelgallery.eu-central-1.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "paimodelgallery.cn-wulanchabu.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "paimodelgallery.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-shanghai", "paimodelgallery.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-hongkong", "paimodelgallery.cn-hongkong.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "paimodelgallery.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-guangzhou", "paimodelgallery.cn-guangzhou.aliyuncs.com"),
            new TeaPair("cn-beijing", "paimodelgallery.cn-beijing.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "paimodelgallery.ap-southeast-5.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "paimodelgallery.ap-southeast-3.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "paimodelgallery.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-2", "paimodelgallery.ap-northeast-2.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "paimodelgallery.ap-northeast-1.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of ListModelGalleryModels  ListModelGalleryModelsRequest
     * @return ListModelGalleryModelsResponse
     */
    @Override
    public CompletableFuture<ListModelGalleryModelsResponse> listModelGalleryModels(ListModelGalleryModelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListModelGalleryModels").setMethod(HttpMethod.GET).setPathRegex("/api/v2/modelgallery/models").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListModelGalleryModelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListModelGalleryModelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
