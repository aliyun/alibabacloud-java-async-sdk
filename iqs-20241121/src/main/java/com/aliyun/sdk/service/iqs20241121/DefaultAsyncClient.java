// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241121;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.iqs20241121.models.*;
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
        this.product = "IQS";
        this.version = "2024-11-21";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of ExpandSearchExpiredTime  ExpandSearchExpiredTimeRequest
     * @return ExpandSearchExpiredTimeResponse
     */
    @Override
    public CompletableFuture<ExpandSearchExpiredTimeResponse> expandSearchExpiredTime(ExpandSearchExpiredTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExpandSearchExpiredTime").setMethod(HttpMethod.POST).setPathRegex("/linked-retrieval/linked-retrieval-admin/openService/v1/account/commands/expendExpiredTime").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExpandSearchExpiredTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExpandSearchExpiredTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ManageSearchAccountInfo  ManageSearchAccountInfoRequest
     * @return ManageSearchAccountInfoResponse
     */
    @Override
    public CompletableFuture<ManageSearchAccountInfoResponse> manageSearchAccountInfo(ManageSearchAccountInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ManageSearchAccountInfo").setMethod(HttpMethod.POST).setPathRegex("/linked-retrieval/linked-retrieval-admin/openService/v1/account/commands/manage").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ManageSearchAccountInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ManageSearchAccountInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
