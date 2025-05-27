// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.accountcenter20241209;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.accountcenter20241209.models.*;
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
        this.product = "AccountCenter";
        this.version = "2024-12-09";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of EnterpriseOrgQueryLoadTree  EnterpriseOrgQueryLoadTreeRequest
     * @return EnterpriseOrgQueryLoadTreeResponse
     */
    @Override
    public CompletableFuture<EnterpriseOrgQueryLoadTreeResponse> enterpriseOrgQueryLoadTree(EnterpriseOrgQueryLoadTreeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnterpriseOrgQueryLoadTree").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnterpriseOrgQueryLoadTreeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnterpriseOrgQueryLoadTreeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnterpriseRegisterAccount  EnterpriseRegisterAccountRequest
     * @return EnterpriseRegisterAccountResponse
     */
    @Override
    public CompletableFuture<EnterpriseRegisterAccountResponse> enterpriseRegisterAccount(EnterpriseRegisterAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnterpriseRegisterAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnterpriseRegisterAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnterpriseRegisterAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
