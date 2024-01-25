// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nbf_vpc_cloud20211115_131123360;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.nbf_vpc_cloud20211115_131123360.models.*;
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
        this.product = "NBF-VPC-Cloud";
        this.version = "2021-11-15_13-11-23-360";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    @Override
    public CompletableFuture<AdadaAResponse> adadaA(AdadaARequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AdadaA").setMethod(HttpMethod.POST).setPathRegex("/caihe_cloud_product_1/1_0_0/adadaA").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AdadaAResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AdadaAResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<YxTestApiResponse> yxTestApi(YxTestApiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("YxTestApi").setMethod(HttpMethod.POST).setPathRegex("/caihe_cloud_product_1/1_0_0/yxTestApi").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(YxTestApiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<YxTestApiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
