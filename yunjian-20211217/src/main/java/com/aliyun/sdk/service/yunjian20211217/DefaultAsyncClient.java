// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yunjian20211217;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.yunjian20211217.models.*;
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
        this.product = "yunjian";
        this.version = "2021-12-17";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of CreateDemandPlan  CreateDemandPlanRequest
     * @return CreateDemandPlanResponse
     */
    @Override
    public CompletableFuture<CreateDemandPlanResponse> createDemandPlan(CreateDemandPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateDemandPlan").setMethod(HttpMethod.POST).setPathRegex("/api/demand/urgent/saveUrgentDemandPlanItem").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDemandPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDemandPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDemandPlanV2  CreateDemandPlanV2Request
     * @return CreateDemandPlanV2Response
     */
    @Override
    public CompletableFuture<CreateDemandPlanV2Response> createDemandPlanV2(CreateDemandPlanV2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateDemandPlanV2").setMethod(HttpMethod.POST).setPathRegex("/api/demand/urgent/saveDemandPlan").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDemandPlanV2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDemandPlanV2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteUrgentDemandItem  DeleteUrgentDemandItemRequest
     * @return DeleteUrgentDemandItemResponse
     */
    @Override
    public CompletableFuture<DeleteUrgentDemandItemResponse> deleteUrgentDemandItem(DeleteUrgentDemandItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteUrgentDemandItem").setMethod(HttpMethod.POST).setPathRegex("/api/demand/urgent/deleteUrgentDemandItem").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteUrgentDemandItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteUrgentDemandItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteUrgentDemandPlan  DeleteUrgentDemandPlanRequest
     * @return DeleteUrgentDemandPlanResponse
     */
    @Override
    public CompletableFuture<DeleteUrgentDemandPlanResponse> deleteUrgentDemandPlan(DeleteUrgentDemandPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteUrgentDemandPlan").setMethod(HttpMethod.POST).setPathRegex("/api/demand/urgent/deleteUrgentDemandPlan").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteUrgentDemandPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteUrgentDemandPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeliveryItemDetailSyn  DeliveryItemDetailSynRequest
     * @return DeliveryItemDetailSynResponse
     */
    @Override
    public CompletableFuture<DeliveryItemDetailSynResponse> deliveryItemDetailSyn(DeliveryItemDetailSynRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeliveryItemDetailSyn").setMethod(HttpMethod.POST).setPathRegex("/api/supply/deliveryItemDataSync").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeliveryItemDetailSynResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeliveryItemDetailSynResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetUrgentDemandItemList  GetUrgentDemandItemListRequest
     * @return GetUrgentDemandItemListResponse
     */
    @Override
    public CompletableFuture<GetUrgentDemandItemListResponse> getUrgentDemandItemList(GetUrgentDemandItemListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetUrgentDemandItemList").setMethod(HttpMethod.POST).setPathRegex("/api/demand/urgent/getUrgentDemandItemList").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUrgentDemandItemListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUrgentDemandItemListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetUrgentDemandPlanDetail  GetUrgentDemandPlanDetailRequest
     * @return GetUrgentDemandPlanDetailResponse
     */
    @Override
    public CompletableFuture<GetUrgentDemandPlanDetailResponse> getUrgentDemandPlanDetail(GetUrgentDemandPlanDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetUrgentDemandPlanDetail").setMethod(HttpMethod.POST).setPathRegex("/api/demand/urgent/getUrgentDemandPlanDetail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUrgentDemandPlanDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUrgentDemandPlanDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetUrgentDemandPlanList  GetUrgentDemandPlanListRequest
     * @return GetUrgentDemandPlanListResponse
     */
    @Override
    public CompletableFuture<GetUrgentDemandPlanListResponse> getUrgentDemandPlanList(GetUrgentDemandPlanListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetUrgentDemandPlanList").setMethod(HttpMethod.POST).setPathRegex("/api/demand/urgent/getUrgentDemandPlanList").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUrgentDemandPlanListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUrgentDemandPlanListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PageDemandPlanWithDemandInfo  PageDemandPlanWithDemandInfoRequest
     * @return PageDemandPlanWithDemandInfoResponse
     */
    @Override
    public CompletableFuture<PageDemandPlanWithDemandInfoResponse> pageDemandPlanWithDemandInfo(PageDemandPlanWithDemandInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PageDemandPlanWithDemandInfo").setMethod(HttpMethod.POST).setPathRegex("/api/demand/getDemandPlanList").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PageDemandPlanWithDemandInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PageDemandPlanWithDemandInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PushResourcePlan  PushResourcePlanRequest
     * @return PushResourcePlanResponse
     */
    @Override
    public CompletableFuture<PushResourcePlanResponse> pushResourcePlan(PushResourcePlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PushResourcePlan").setMethod(HttpMethod.POST).setPathRegex("/api/supply/resourcePlan/push").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PushResourcePlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PushResourcePlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryDeliveredSupplyItems  QueryDeliveredSupplyItemsRequest
     * @return QueryDeliveredSupplyItemsResponse
     */
    @Override
    public CompletableFuture<QueryDeliveredSupplyItemsResponse> queryDeliveredSupplyItems(QueryDeliveredSupplyItemsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryDeliveredSupplyItems").setMethod(HttpMethod.GET).setPathRegex("/api/supply/queryDeliveredSupplyItems").setBodyType(BodyType.ARRAY).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDeliveredSupplyItemsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDeliveredSupplyItemsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryPeriodBudgetBill  QueryPeriodBudgetBillRequest
     * @return QueryPeriodBudgetBillResponse
     */
    @Override
    public CompletableFuture<QueryPeriodBudgetBillResponse> queryPeriodBudgetBill(QueryPeriodBudgetBillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryPeriodBudgetBill").setMethod(HttpMethod.GET).setPathRegex("/api/annual/budget/queryPeriodBudgetBill").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryPeriodBudgetBillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryPeriodBudgetBillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveUrgentDemandItem  SaveUrgentDemandItemRequest
     * @return SaveUrgentDemandItemResponse
     */
    @Override
    public CompletableFuture<SaveUrgentDemandItemResponse> saveUrgentDemandItem(SaveUrgentDemandItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SaveUrgentDemandItem").setMethod(HttpMethod.POST).setPathRegex("/api/demand/urgent/saveUrgentDemandItem").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveUrgentDemandItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveUrgentDemandItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitUrgentDemandPlan  SubmitUrgentDemandPlanRequest
     * @return SubmitUrgentDemandPlanResponse
     */
    @Override
    public CompletableFuture<SubmitUrgentDemandPlanResponse> submitUrgentDemandPlan(SubmitUrgentDemandPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SubmitUrgentDemandPlan").setMethod(HttpMethod.POST).setPathRegex("/api/demand/urgent/submitUrgentDemandPlan").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitUrgentDemandPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitUrgentDemandPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of acceptFulfillmentDecision  AcceptFulfillmentDecisionRequest
     * @return AcceptFulfillmentDecisionResponse
     */
    @Override
    public CompletableFuture<AcceptFulfillmentDecisionResponse> acceptFulfillmentDecision(AcceptFulfillmentDecisionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("acceptFulfillmentDecision").setMethod(HttpMethod.POST).setPathRegex("/acceptFulfillmentDecision").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AcceptFulfillmentDecisionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AcceptFulfillmentDecisionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
