// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.linkedmall20230930.models.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;

import java.util.concurrent.CompletableFuture;

public interface AsyncClient extends SdkAutoCloseable {

    static DefaultAsyncClientBuilder builder() {
        return new DefaultAsyncClientBuilder();
    }

    static AsyncClient create() {
        return builder().build();
    }

    /**
     * <b>description</b> :
     * <p>Cancels an after-sales ticket.</p>
     * 
     * @param request the request parameters of CancelRefundOrder  CancelRefundOrderRequest
     * @return CancelRefundOrderResponse
     */
    CompletableFuture<CancelRefundOrderResponse> cancelRefundOrder(CancelRefundOrderRequest request);

    /**
     * <b>description</b> :
     * <p>Confirms receipt.</p>
     * 
     * @param request the request parameters of ConfirmDisburse  ConfirmDisburseRequest
     * @return ConfirmDisburseResponse
     */
    CompletableFuture<ConfirmDisburseResponse> confirmDisburse(ConfirmDisburseRequest request);

    /**
     * <b>description</b> :
     * <p>Backfills the waybill information.</p>
     * 
     * @param request the request parameters of CreateGoodsShippingNotice  CreateGoodsShippingNoticeRequest
     * @return CreateGoodsShippingNoticeResponse
     */
    CompletableFuture<CreateGoodsShippingNoticeResponse> createGoodsShippingNotice(CreateGoodsShippingNoticeRequest request);

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
    CompletableFuture<CreatePurchaseOrderResponse> createPurchaseOrder(CreatePurchaseOrderRequest request);

    /**
     * <b>description</b> :
     * <p>Creates an after-sales ticket.</p>
     * 
     * @param request the request parameters of CreateRefundOrder  CreateRefundOrderRequest
     * @return CreateRefundOrderResponse
     */
    CompletableFuture<CreateRefundOrderResponse> createRefundOrder(CreateRefundOrderRequest request);

    /**
     * @param request the request parameters of GetOrder  GetOrderRequest
     * @return GetOrderResponse
     */
    CompletableFuture<GetOrderResponse> getOrder(GetOrderRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the status of a transaction order.</p>
     * 
     * @param request the request parameters of GetPurchaseOrderStatus  GetPurchaseOrderStatusRequest
     * @return GetPurchaseOrderStatusResponse
     */
    CompletableFuture<GetPurchaseOrderStatusResponse> getPurchaseOrderStatus(GetPurchaseOrderStatusRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the purchaser store.</p>
     * 
     * @param request the request parameters of GetPurchaserShop  GetPurchaserShopRequest
     * @return GetPurchaserShopResponse
     */
    CompletableFuture<GetPurchaserShopResponse> getPurchaserShop(GetPurchaserShopRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the details of an after-sales ticket.</p>
     * 
     * @param request the request parameters of GetRefundOrder  GetRefundOrderRequest
     * @return GetRefundOrderResponse
     */
    CompletableFuture<GetRefundOrderResponse> getRefundOrder(GetRefundOrderRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the details of products in the selection pool by product ID. You can specify a division code to query the regional inventory of the product.</p>
     * 
     * @param request the request parameters of GetSelectionProduct  GetSelectionProductRequest
     * @return GetSelectionProductResponse
     */
    CompletableFuture<GetSelectionProductResponse> getSelectionProduct(GetSelectionProductRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the sales information of products in the selection pool. Distributors can call this operation to query product sales information, such as product status. Pass the divisionCode parameter (a level-5 address code for a town or sub-district is recommended) to check whether the product is available for sale in the specified region.</p>
     * 
     * @param request the request parameters of GetSelectionProductSaleInfo  GetSelectionProductSaleInfoRequest
     * @return GetSelectionProductSaleInfoResponse
     */
    CompletableFuture<GetSelectionProductSaleInfoResponse> getSelectionProductSaleInfo(GetSelectionProductSaleInfoRequest request);

    /**
     * <b>description</b> :
     * <p>Queries all subcategories based on a parent category ID, or queries category details based on a category ID. If the parent category ID (parentCategoryId) is set to 0, the first-level categories under the root category are returned.</p>
     * 
     * @param request the request parameters of ListCategories  ListCategoriesRequest
     * @return ListCategoriesResponse
     */
    CompletableFuture<ListCategoriesResponse> listCategories(ListCategoriesRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the logistics information of an order.</p>
     * 
     * @param request the request parameters of ListLogisticsOrders  ListLogisticsOrdersRequest
     * @return ListLogisticsOrdersResponse
     */
    CompletableFuture<ListLogisticsOrdersResponse> listLogisticsOrders(ListLogisticsOrdersRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves a list of purchaser shops.</p>
     * 
     * @param request the request parameters of ListPurchaserShops  ListPurchaserShopsRequest
     * @return ListPurchaserShopsResponse
     */
    CompletableFuture<ListPurchaserShopsResponse> listPurchaserShops(ListPurchaserShopsRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the sales information of products in the selection pool in batches. Distributors can call this operation to batch query product sales information, such as product status. You can use the divisionCode parameter (we recommend passing a level-5 address code for a town or sub-district) to batch query whether a product is available for sale in a specific region.</p>
     * 
     * @param request the request parameters of ListSelectionProductSaleInfos  ListSelectionProductSaleInfosRequest
     * @return ListSelectionProductSaleInfosResponse
     */
    CompletableFuture<ListSelectionProductSaleInfosResponse> listSelectionProductSaleInfos(ListSelectionProductSaleInfosRequest request);

    /**
     * @param request the request parameters of ListSelectionProducts  ListSelectionProductsRequest
     * @return ListSelectionProductsResponse
     */
    CompletableFuture<ListSelectionProductsResponse> listSelectionProducts(ListSelectionProductsRequest request);

    /**
     * <b>description</b> :
     * <p>Batch query of SKU sales information in a selection pool: Distributors can call this operation to query SKU sales information in batches, such as SKU status. You can use the divisionCode parameter to query whether SKUs are available for sale in a specific region in batches. We recommend that you specify a level-5 division code, such as a town or sub-district code.</p>
     * 
     * @param request the request parameters of ListSelectionSkuSaleInfos  ListSelectionSkuSaleInfosRequest
     * @return ListSelectionSkuSaleInfosResponse
     */
    CompletableFuture<ListSelectionSkuSaleInfosResponse> listSelectionSkuSaleInfos(ListSelectionSkuSaleInfosRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the sub-region codes.</p>
     * 
     * @param request the request parameters of QueryChildDivisionCode  QueryChildDivisionCodeRequest
     * @return QueryChildDivisionCodeResponse
     */
    CompletableFuture<QueryChildDivisionCodeResponse> queryChildDivisionCode(QueryChildDivisionCodeRequest request);

    /**
     * <b>description</b> :
     * <p>Lists orders.</p>
     * 
     * @param request the request parameters of QueryOrders  QueryOrdersRequest
     * @return QueryOrdersResponse
     */
    CompletableFuture<QueryOrdersResponse> queryOrders(QueryOrdersRequest request);

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
    CompletableFuture<RenderPurchaseOrderResponse> renderPurchaseOrder(RenderPurchaseOrderRequest request);

    /**
     * <b>description</b> :
     * <p>Renders an after-sales order.</p>
     * 
     * @param request the request parameters of RenderRefundOrder  RenderRefundOrderRequest
     * @return RenderRefundOrderResponse
     */
    CompletableFuture<RenderRefundOrderResponse> renderRefundOrder(RenderRefundOrderRequest request);

    /**
     * <b>description</b> :
     * <p>Performs a paged query on the product list based on the page number and paging size.</p>
     * 
     * @param request the request parameters of SearchProducts  SearchProductsRequest
     * @return SearchProductsResponse
     */
    CompletableFuture<SearchProductsResponse> searchProducts(SearchProductsRequest request);

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
    CompletableFuture<SelectionGroupAddProductResponse> selectionGroupAddProduct(SelectionGroupAddProductRequest request);

    /**
     * <b>description</b> :
     * <p>Allows a distributor to dispatch products.</p>
     * 
     * @param request the request parameters of SelectionGroupRemoveProduct  SelectionGroupRemoveProductRequest
     * @return SelectionGroupRemoveProductResponse
     */
    CompletableFuture<SelectionGroupRemoveProductResponse> selectionGroupRemoveProduct(SelectionGroupRemoveProductRequest request);

    /**
     * <b>description</b> :
     * <p>Call this API before creating a purchase order. It returns two lists: one for sellable items and one for unsellable items. The sellable items list follows the final parent-child order split structure.</p>
     * 
     * @param request the request parameters of SplitPurchaseOrder  SplitPurchaseOrderRequest
     * @return SplitPurchaseOrderResponse
     */
    CompletableFuture<SplitPurchaseOrderResponse> splitPurchaseOrder(SplitPurchaseOrderRequest request);

}
