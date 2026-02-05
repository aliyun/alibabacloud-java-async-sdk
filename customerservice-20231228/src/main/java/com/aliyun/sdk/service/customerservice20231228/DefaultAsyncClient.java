// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.customerservice20231228;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.customerservice20231228.models.*;
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
        this.product = "CustomerService";
        this.version = "2023-12-28";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of ListEnterpriseSupportPlan  ListEnterpriseSupportPlanRequest
     * @return ListEnterpriseSupportPlanResponse
     */
    @Override
    public CompletableFuture<ListEnterpriseSupportPlanResponse> listEnterpriseSupportPlan(ListEnterpriseSupportPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListEnterpriseSupportPlan").setMethod(HttpMethod.POST).setPathRegex("/customerWorkbench/pop/api/enterpriseSupport/listEnterpriseSupportPlan").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEnterpriseSupportPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEnterpriseSupportPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListEnterpriseSupportPlanSimple  ListEnterpriseSupportPlanSimpleRequest
     * @return ListEnterpriseSupportPlanSimpleResponse
     */
    @Override
    public CompletableFuture<ListEnterpriseSupportPlanSimpleResponse> listEnterpriseSupportPlanSimple(ListEnterpriseSupportPlanSimpleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListEnterpriseSupportPlanSimple").setMethod(HttpMethod.POST).setPathRegex("/customerWorkbench/pop/api/enterpriseSupport/listEnterpriseSupportPlanSimple").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEnterpriseSupportPlanSimpleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEnterpriseSupportPlanSimpleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListServiceApply  ListServiceApplyRequest
     * @return ListServiceApplyResponse
     */
    @Override
    public CompletableFuture<ListServiceApplyResponse> listServiceApply(ListServiceApplyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListServiceApply").setMethod(HttpMethod.POST).setPathRegex("/customerWorkbench/pop/api/expert/service/listServiceApply").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListServiceApplyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListServiceApplyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListYunQiTaskByUid  ListYunQiTaskByUidRequest
     * @return ListYunQiTaskByUidResponse
     */
    @Override
    public CompletableFuture<ListYunQiTaskByUidResponse> listYunQiTaskByUid(ListYunQiTaskByUidRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListYunQiTaskByUid").setMethod(HttpMethod.POST).setPathRegex("/customerWorkbench/pop/api/record/listYunQiTaskByUid").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListYunQiTaskByUidResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListYunQiTaskByUidResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
