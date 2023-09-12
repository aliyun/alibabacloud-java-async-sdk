// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20220531;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.linkedmall20220531.models.*;
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
        this.product = "linkedmall";
        this.version = "2022-05-31";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-hangzhou", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-shanghai", "linkedmall.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "linkedmall.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "linkedmall.aliyuncs.com"),
            new TeaPair("ap-south-1", "linkedmall.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "linkedmall.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "linkedmall.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "linkedmall.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-beijing", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-chengdu", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-edge-1", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-fujian", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-hongkong", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-qingdao", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-wuhan", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "linkedmall.aliyuncs.com"),
            new TeaPair("eu-central-1", "linkedmall.aliyuncs.com"),
            new TeaPair("eu-west-1", "linkedmall.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "linkedmall.aliyuncs.com"),
            new TeaPair("me-east-1", "linkedmall.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "linkedmall.aliyuncs.com"),
            new TeaPair("us-east-1", "linkedmall.aliyuncs.com"),
            new TeaPair("us-west-1", "linkedmall.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    @Override
    public CompletableFuture<ApplyCreateDistributionOrderResponse> applyCreateDistributionOrder(ApplyCreateDistributionOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ApplyCreateDistributionOrder").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApplyCreateDistributionOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApplyCreateDistributionOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ApplyRefund4DistributionResponse> applyRefund4Distribution(ApplyRefund4DistributionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ApplyRefund4Distribution").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApplyRefund4DistributionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApplyRefund4DistributionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CancelDistributionTradeResponse> cancelDistributionTrade(CancelDistributionTradeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelDistributionTrade").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelDistributionTradeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelDistributionTradeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CancelRefund4DistributionResponse> cancelRefund4Distribution(CancelRefund4DistributionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelRefund4Distribution").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelRefund4DistributionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelRefund4DistributionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ConfirmDisburse4DistributionResponse> confirmDisburse4Distribution(ConfirmDisburse4DistributionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ConfirmDisburse4Distribution").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ConfirmDisburse4DistributionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ConfirmDisburse4DistributionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<InitApplyRefund4DistributionResponse> initApplyRefund4Distribution(InitApplyRefund4DistributionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InitApplyRefund4Distribution").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InitApplyRefund4DistributionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InitApplyRefund4DistributionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<InitModifyRefund4DistributionResponse> initModifyRefund4Distribution(InitModifyRefund4DistributionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InitModifyRefund4Distribution").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InitModifyRefund4DistributionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InitModifyRefund4DistributionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListDistributionItemResponse> listDistributionItem(ListDistributionItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDistributionItem").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDistributionItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDistributionItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListDistributionItemWithoutCacheResponse> listDistributionItemWithoutCache(ListDistributionItemWithoutCacheRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDistributionItemWithoutCache").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDistributionItemWithoutCacheResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDistributionItemWithoutCacheResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListDistributionMallResponse> listDistributionMall(ListDistributionMallRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDistributionMall").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDistributionMallResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDistributionMallResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyRefund4DistributionResponse> modifyRefund4Distribution(ModifyRefund4DistributionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyRefund4Distribution").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyRefund4DistributionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyRefund4DistributionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<QueryChildDivisionCodeByIdResponse> queryChildDivisionCodeById(QueryChildDivisionCodeByIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryChildDivisionCodeById").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryChildDivisionCodeByIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryChildDivisionCodeByIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<QueryDistributionBillDetailResponse> queryDistributionBillDetail(QueryDistributionBillDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDistributionBillDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDistributionBillDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDistributionBillDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<QueryDistributionMallResponse> queryDistributionMall(QueryDistributionMallRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDistributionMall").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDistributionMallResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDistributionMallResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<QueryDistributionTradeStatusResponse> queryDistributionTradeStatus(QueryDistributionTradeStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDistributionTradeStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDistributionTradeStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDistributionTradeStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<QueryItemDetailResponse> queryItemDetail(QueryItemDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryItemDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryItemDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryItemDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<QueryItemDetailWithDivisionResponse> queryItemDetailWithDivision(QueryItemDetailWithDivisionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryItemDetailWithDivision").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryItemDetailWithDivisionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryItemDetailWithDivisionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<QueryItemGuideRetailPriceResponse> queryItemGuideRetailPrice(QueryItemGuideRetailPriceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryItemGuideRetailPrice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryItemGuideRetailPriceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryItemGuideRetailPriceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<QueryLogistics4DistributionResponse> queryLogistics4Distribution(QueryLogistics4DistributionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryLogistics4Distribution").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryLogistics4DistributionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryLogistics4DistributionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<QueryMallCategoryListResponse> queryMallCategoryList(QueryMallCategoryListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryMallCategoryList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryMallCategoryListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryMallCategoryListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<QueryOrderDetail4DistributionResponse> queryOrderDetail4Distribution(QueryOrderDetail4DistributionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryOrderDetail4Distribution").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryOrderDetail4DistributionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryOrderDetail4DistributionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<QueryOrderList4DistributionResponse> queryOrderList4Distribution(QueryOrderList4DistributionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryOrderList4Distribution").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryOrderList4DistributionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryOrderList4DistributionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<QueryRefundApplicationDetail4DistributionResponse> queryRefundApplicationDetail4Distribution(QueryRefundApplicationDetail4DistributionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryRefundApplicationDetail4Distribution").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryRefundApplicationDetail4DistributionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryRefundApplicationDetail4DistributionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<RenderDistributionOrderResponse> renderDistributionOrder(RenderDistributionOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RenderDistributionOrder").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RenderDistributionOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RenderDistributionOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<SubmitReturnGoodLogistics4DistributionResponse> submitReturnGoodLogistics4Distribution(SubmitReturnGoodLogistics4DistributionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitReturnGoodLogistics4Distribution").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitReturnGoodLogistics4DistributionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitReturnGoodLogistics4DistributionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
