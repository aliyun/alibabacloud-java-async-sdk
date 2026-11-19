// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.linkedmall20230930.models.*;
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
        this.version = "2023-09-30";
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

    /**
     * <b>description</b> :
     * <p>Cancels an after-sales ticket.</p>
     * 
     * @param request the request parameters of CancelRefundOrder  CancelRefundOrderRequest
     * @return CancelRefundOrderResponse
     */
    @Override
    public CompletableFuture<CancelRefundOrderResponse> cancelRefundOrder(CancelRefundOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CancelRefundOrder").setMethod(HttpMethod.POST).setPathRegex("/opensaas-s2b/opensaas-s2b-biz-trade/v2/refunds/{disputeId}/commands/cancel").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelRefundOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelRefundOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Confirms receipt.</p>
     * 
     * @param request the request parameters of ConfirmDisburse  ConfirmDisburseRequest
     * @return ConfirmDisburseResponse
     */
    @Override
    public CompletableFuture<ConfirmDisburseResponse> confirmDisburse(ConfirmDisburseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ConfirmDisburse").setMethod(HttpMethod.POST).setPathRegex("/opensaas-s2b/opensaas-s2b-biz-trade/v2/orders/commands/confirmDisburse").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ConfirmDisburseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ConfirmDisburseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Backfills the waybill information.</p>
     * 
     * @param request the request parameters of CreateGoodsShippingNotice  CreateGoodsShippingNoticeRequest
     * @return CreateGoodsShippingNoticeResponse
     */
    @Override
    public CompletableFuture<CreateGoodsShippingNoticeResponse> createGoodsShippingNotice(CreateGoodsShippingNoticeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateGoodsShippingNotice").setMethod(HttpMethod.POST).setPathRegex("/opensaas-s2b/opensaas-s2b-biz-trade/v2/refunds/command/createGoodsShippingNotice").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateGoodsShippingNoticeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateGoodsShippingNoticeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Creates a purchase order and returns the purchase order ID. The order creation result is notified through messages. After the order is created, you can query the orders associated with the purchase order by calling the order API.</p>
     * <blockquote>
     * <p>Warning: Because purchase order creation is an asynchronous task, if an error (such as a 503 error code) is returned when a distributor calls this API, do not immediately process consumer refunds on the business side. Wait for and consume the PurchaseOrderCreate message (the purchase order creation result message) to check the order status (for example, consume the order status synchronization message to check the order status) before you process business logic to prevent financial losses.
     * Notice: If you do not receive the PurchaseOrderCreate message (the purchase order creation result message) after you call the purchase order creation API, submit a ticket in the technical integration group to check the cause.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreatePurchaseOrder  CreatePurchaseOrderRequest
     * @return CreatePurchaseOrderResponse
     */
    @Override
    public CompletableFuture<CreatePurchaseOrderResponse> createPurchaseOrder(CreatePurchaseOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePurchaseOrder").setMethod(HttpMethod.POST).setPathRegex("/opensaas-s2b/opensaas-s2b-biz-trade/v2/purchaseOrders").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePurchaseOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePurchaseOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Creates an after-sales ticket.</p>
     * 
     * @param request the request parameters of CreateRefundOrder  CreateRefundOrderRequest
     * @return CreateRefundOrderResponse
     */
    @Override
    public CompletableFuture<CreateRefundOrderResponse> createRefundOrder(CreateRefundOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateRefundOrder").setMethod(HttpMethod.POST).setPathRegex("/opensaas-s2b/opensaas-s2b-biz-trade/v2/refunds").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRefundOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRefundOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetOrder  GetOrderRequest
     * @return GetOrderResponse
     */
    @Override
    public CompletableFuture<GetOrderResponse> getOrder(GetOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetOrder").setMethod(HttpMethod.GET).setPathRegex("/opensaas-s2b/opensaas-s2b-biz-trade/v2/orders/{orderId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the status of a transaction order.</p>
     * 
     * @param request the request parameters of GetPurchaseOrderStatus  GetPurchaseOrderStatusRequest
     * @return GetPurchaseOrderStatusResponse
     */
    @Override
    public CompletableFuture<GetPurchaseOrderStatusResponse> getPurchaseOrderStatus(GetPurchaseOrderStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetPurchaseOrderStatus").setMethod(HttpMethod.GET).setPathRegex("/opensaas-s2b/opensaas-s2b-biz-trade/v2/purchaseOrders/{purchaseOrderId}/status").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPurchaseOrderStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPurchaseOrderStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the purchaser store.</p>
     * 
     * @param request the request parameters of GetPurchaserShop  GetPurchaserShopRequest
     * @return GetPurchaserShopResponse
     */
    @Override
    public CompletableFuture<GetPurchaserShopResponse> getPurchaserShop(GetPurchaserShopRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetPurchaserShop").setMethod(HttpMethod.GET).setPathRegex("/opensaas-s2b/opensaas-s2b-biz-trade/v2/purchaserShops/{purchaserId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPurchaserShopResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPurchaserShopResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the details of an after-sales ticket.</p>
     * 
     * @param request the request parameters of GetRefundOrder  GetRefundOrderRequest
     * @return GetRefundOrderResponse
     */
    @Override
    public CompletableFuture<GetRefundOrderResponse> getRefundOrder(GetRefundOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetRefundOrder").setMethod(HttpMethod.GET).setPathRegex("/opensaas-s2b/opensaas-s2b-biz-trade/v2/refunds/{disputeId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRefundOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRefundOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the details of products in the selection pool by product ID. You can specify a division code to query the regional inventory of the product.</p>
     * 
     * @param request the request parameters of GetSelectionProduct  GetSelectionProductRequest
     * @return GetSelectionProductResponse
     */
    @Override
    public CompletableFuture<GetSelectionProductResponse> getSelectionProduct(GetSelectionProductRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetSelectionProduct").setMethod(HttpMethod.GET).setPathRegex("/opensaas-s2b/opensaas-s2b-biz-trade/v2/selectionPool/products/{productId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSelectionProductResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSelectionProductResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the sales information of products in the selection pool. Distributors can call this operation to query product sales information, such as product status. Pass the divisionCode parameter (a level-5 address code for a town or sub-district is recommended) to check whether the product is available for sale in the specified region.</p>
     * 
     * @param request the request parameters of GetSelectionProductSaleInfo  GetSelectionProductSaleInfoRequest
     * @return GetSelectionProductSaleInfoResponse
     */
    @Override
    public CompletableFuture<GetSelectionProductSaleInfoResponse> getSelectionProductSaleInfo(GetSelectionProductSaleInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetSelectionProductSaleInfo").setMethod(HttpMethod.GET).setPathRegex("/opensaas-s2b/opensaas-s2b-biz-trade/v2/selectionPool/products/{productId}/saleInfo").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSelectionProductSaleInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSelectionProductSaleInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries all subcategories based on a parent category ID, or queries category details based on a category ID. If the parent category ID (parentCategoryId) is set to 0, the first-level categories under the root category are returned.</p>
     * 
     * @param request the request parameters of ListCategories  ListCategoriesRequest
     * @return ListCategoriesResponse
     */
    @Override
    public CompletableFuture<ListCategoriesResponse> listCategories(ListCategoriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListCategories").setMethod(HttpMethod.POST).setPathRegex("/opensaas-s2b/opensaas-s2b-biz-trade/v2/categories/commands/list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCategoriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCategoriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the logistics information of an order.</p>
     * 
     * @param request the request parameters of ListLogisticsOrders  ListLogisticsOrdersRequest
     * @return ListLogisticsOrdersResponse
     */
    @Override
    public CompletableFuture<ListLogisticsOrdersResponse> listLogisticsOrders(ListLogisticsOrdersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListLogisticsOrders").setMethod(HttpMethod.GET).setPathRegex("/opensaas-s2b/opensaas-s2b-biz-trade/v2/orders/{orderId}/logisticsOrders").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLogisticsOrdersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLogisticsOrdersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Retrieves a list of purchaser shops.</p>
     * 
     * @param request the request parameters of ListPurchaserShops  ListPurchaserShopsRequest
     * @return ListPurchaserShopsResponse
     */
    @Override
    public CompletableFuture<ListPurchaserShopsResponse> listPurchaserShops(ListPurchaserShopsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPurchaserShops").setMethod(HttpMethod.GET).setPathRegex("/opensaas-s2b/opensaas-s2b-biz-trade/v2/purchaserShops").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPurchaserShopsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPurchaserShopsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the sales information of products in the selection pool in batches. Distributors can call this operation to batch query product sales information, such as product status. You can use the divisionCode parameter (we recommend passing a level-5 address code for a town or sub-district) to batch query whether a product is available for sale in a specific region.</p>
     * 
     * @param request the request parameters of ListSelectionProductSaleInfos  ListSelectionProductSaleInfosRequest
     * @return ListSelectionProductSaleInfosResponse
     */
    @Override
    public CompletableFuture<ListSelectionProductSaleInfosResponse> listSelectionProductSaleInfos(ListSelectionProductSaleInfosRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSelectionProductSaleInfos").setMethod(HttpMethod.POST).setPathRegex("/opensaas-s2b/opensaas-s2b-biz-trade/v2/selectionPool/products/saleInfo/commands/list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSelectionProductSaleInfosResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSelectionProductSaleInfosResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSelectionProducts  ListSelectionProductsRequest
     * @return ListSelectionProductsResponse
     */
    @Override
    public CompletableFuture<ListSelectionProductsResponse> listSelectionProducts(ListSelectionProductsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSelectionProducts").setMethod(HttpMethod.GET).setPathRegex("/opensaas-s2b/opensaas-s2b-biz-trade/v2/selectionPool/products").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSelectionProductsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSelectionProductsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Batch query of SKU sales information in a selection pool: Distributors can call this operation to query SKU sales information in batches, such as SKU status. You can use the divisionCode parameter to query whether SKUs are available for sale in a specific region in batches. We recommend that you specify a level-5 division code, such as a town or sub-district code.</p>
     * 
     * @param request the request parameters of ListSelectionSkuSaleInfos  ListSelectionSkuSaleInfosRequest
     * @return ListSelectionSkuSaleInfosResponse
     */
    @Override
    public CompletableFuture<ListSelectionSkuSaleInfosResponse> listSelectionSkuSaleInfos(ListSelectionSkuSaleInfosRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSelectionSkuSaleInfos").setMethod(HttpMethod.POST).setPathRegex("/opensaas-s2b/opensaas-s2b-biz-trade/v2/selectionPool/skus/saleInfo/commands/list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSelectionSkuSaleInfosResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSelectionSkuSaleInfosResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the sub-region codes.</p>
     * 
     * @param request the request parameters of QueryChildDivisionCode  QueryChildDivisionCodeRequest
     * @return QueryChildDivisionCodeResponse
     */
    @Override
    public CompletableFuture<QueryChildDivisionCodeResponse> queryChildDivisionCode(QueryChildDivisionCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryChildDivisionCode").setMethod(HttpMethod.POST).setPathRegex("/opensaas-s2b/opensaas-s2b-biz-trade/v2/division/commands/queryChildDivisionCode").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryChildDivisionCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryChildDivisionCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Lists orders.</p>
     * 
     * @param request the request parameters of QueryOrders  QueryOrdersRequest
     * @return QueryOrdersResponse
     */
    @Override
    public CompletableFuture<QueryOrdersResponse> queryOrders(QueryOrdersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryOrders").setMethod(HttpMethod.POST).setPathRegex("/opensaas-s2b/opensaas-s2b-biz-trade/v2/orders/commands/query").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryOrdersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryOrdersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Warning: 
     * This API will be offline soon. For purchase order rendering, use the SplitPurchaseOrder API, which supports both purchase order rendering and splitting.</p>
     * </blockquote>
     * 
     * @param request the request parameters of RenderPurchaseOrder  RenderPurchaseOrderRequest
     * @return RenderPurchaseOrderResponse
     */
    @Override
    public CompletableFuture<RenderPurchaseOrderResponse> renderPurchaseOrder(RenderPurchaseOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RenderPurchaseOrder").setMethod(HttpMethod.POST).setPathRegex("/opensaas-s2b/opensaas-s2b-biz-trade/v2/purchaseOrders/commands/render").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RenderPurchaseOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RenderPurchaseOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Renders an after-sales order.</p>
     * 
     * @param request the request parameters of RenderRefundOrder  RenderRefundOrderRequest
     * @return RenderRefundOrderResponse
     */
    @Override
    public CompletableFuture<RenderRefundOrderResponse> renderRefundOrder(RenderRefundOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RenderRefundOrder").setMethod(HttpMethod.POST).setPathRegex("/opensaas-s2b/opensaas-s2b-biz-trade/v2/refunds/commands/render").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RenderRefundOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RenderRefundOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Performs a paged query on the product list based on the page number and paging size.</p>
     * 
     * @param request the request parameters of SearchProducts  SearchProductsRequest
     * @return SearchProductsResponse
     */
    @Override
    public CompletableFuture<SearchProductsResponse> searchProducts(SearchProductsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SearchProducts").setMethod(HttpMethod.POST).setPathRegex("/opensaas-s2b/opensaas-s2b-biz-trade/v2/selectionPool/selection-group/product/command/searchProduct").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchProductsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchProductsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Distributors can use this API operation to add products to the selection pool.</p>
     * <blockquote>
     * <p>Integrate this API operation if you are a distributor customer who registered on or after January 1, 2025. For details about the import operations and their impacts, refer to <a href="https://www.alibabacloud.com/help/en/linkedmall/user-guide/product-interface-best-practices#lFENl">Product best practices</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of SelectionGroupAddProduct  SelectionGroupAddProductRequest
     * @return SelectionGroupAddProductResponse
     */
    @Override
    public CompletableFuture<SelectionGroupAddProductResponse> selectionGroupAddProduct(SelectionGroupAddProductRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SelectionGroupAddProduct").setMethod(HttpMethod.POST).setPathRegex("/opensaas-s2b/opensaas-s2b-biz-trade/v2/selectionPool/selection-group/product/command/addProduct").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SelectionGroupAddProductResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SelectionGroupAddProductResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Allows a distributor to dispatch products.</p>
     * 
     * @param request the request parameters of SelectionGroupRemoveProduct  SelectionGroupRemoveProductRequest
     * @return SelectionGroupRemoveProductResponse
     */
    @Override
    public CompletableFuture<SelectionGroupRemoveProductResponse> selectionGroupRemoveProduct(SelectionGroupRemoveProductRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SelectionGroupRemoveProduct").setMethod(HttpMethod.POST).setPathRegex("/opensaas-s2b/opensaas-s2b-biz-trade/v2/selectionPool/selection-group/product/command/removeProduct").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SelectionGroupRemoveProductResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SelectionGroupRemoveProductResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Call this API before creating a purchase order. It returns two lists: one for sellable items and one for unsellable items. The sellable items list follows the final parent-child order split structure.</p>
     * 
     * @param request the request parameters of SplitPurchaseOrder  SplitPurchaseOrderRequest
     * @return SplitPurchaseOrderResponse
     */
    @Override
    public CompletableFuture<SplitPurchaseOrderResponse> splitPurchaseOrder(SplitPurchaseOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SplitPurchaseOrder").setMethod(HttpMethod.POST).setPathRegex("/opensaas-s2b/opensaas-s2b-biz-trade/v2/purchaseOrders/commands/split").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SplitPurchaseOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SplitPurchaseOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
