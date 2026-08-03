// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.airticketopen20230117.models.*;
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
        this.product = "airticketOpen";
        this.version = "2023-01-17";
        this.endpointRule = "regional";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AccountFlowList  AccountFlowListRequest
     * @return AccountFlowListResponse
     */
    @Override
    public CompletableFuture<AccountFlowListResponse> accountFlowList(AccountFlowListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AccountFlowList").setMethod(HttpMethod.GET).setPathRegex("/airticket/v1/account/flow-list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AccountFlowListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AccountFlowListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>search ancillary for selected solution, you should enter the solution_id returned by enrich.</p>
     * 
     * @param request the request parameters of AncillarySuggest  AncillarySuggestRequest
     * @return AncillarySuggestResponse
     */
    @Override
    public CompletableFuture<AncillarySuggestResponse> ancillarySuggest(AncillarySuggestRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AncillarySuggest").setMethod(HttpMethod.POST).setPathRegex("/airticket/v1/ancillary/action-suggest").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AncillarySuggestResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AncillarySuggestResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Enter solution_id returned by enrich, ancillary_id returned by ancillarySuggest(optional), passengers information and contact information, the book interface will create an order wait for pay.
     * There are two issues should be noticed:</p>
     * <ol>
     * <li>the solution_id must be processed by pricing.</li>
     * <li>the order created by book interface should be pay within 30 minutes, otherwise the order will be closed.</li>
     * </ol>
     * 
     * @param request the request parameters of Book  BookRequest
     * @return BookResponse
     */
    @Override
    public CompletableFuture<BookResponse> book(BookRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("Book").setMethod(HttpMethod.POST).setPathRegex("/airticket/v1/trade/action-book").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BookResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BookResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>close an unpaid order</p>
     * 
     * @param request the request parameters of Cancel  CancelRequest
     * @return CancelResponse
     */
    @Override
    public CompletableFuture<CancelResponse> cancel(CancelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("Cancel").setMethod(HttpMethod.POST).setPathRegex("/airticket/v1/trade/action-cancel").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChangeApply  ChangeApplyRequest
     * @return ChangeApplyResponse
     */
    @Override
    public CompletableFuture<ChangeApplyResponse> changeApply(ChangeApplyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ChangeApply").setMethod(HttpMethod.POST).setPathRegex("/airticket/v1/change/action-apply").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeApplyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeApplyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChangeCancel  ChangeCancelRequest
     * @return ChangeCancelResponse
     */
    @Override
    public CompletableFuture<ChangeCancelResponse> changeCancel(ChangeCancelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ChangeCancel").setMethod(HttpMethod.POST).setPathRegex("/airticket/v1/change/action-cancel").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeCancelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeCancelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChangeConfirm  ChangeConfirmRequest
     * @return ChangeConfirmResponse
     */
    @Override
    public CompletableFuture<ChangeConfirmResponse> changeConfirm(ChangeConfirmRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ChangeConfirm").setMethod(HttpMethod.POST).setPathRegex("/airticket/v1/change/action-confirm").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeConfirmResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeConfirmResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChangeDetail  ChangeDetailRequest
     * @return ChangeDetailResponse
     */
    @Override
    public CompletableFuture<ChangeDetailResponse> changeDetail(ChangeDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ChangeDetail").setMethod(HttpMethod.GET).setPathRegex("/airticket/v1/change/detail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChangeDetailListOfBuyer  ChangeDetailListOfBuyerRequest
     * @return ChangeDetailListOfBuyerResponse
     */
    @Override
    public CompletableFuture<ChangeDetailListOfBuyerResponse> changeDetailListOfBuyer(ChangeDetailListOfBuyerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ChangeDetailListOfBuyer").setMethod(HttpMethod.GET).setPathRegex("/airticket/v1/change/buyer/detail-list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeDetailListOfBuyerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeDetailListOfBuyerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChangeDetailListOfOrderNum  ChangeDetailListOfOrderNumRequest
     * @return ChangeDetailListOfOrderNumResponse
     */
    @Override
    public CompletableFuture<ChangeDetailListOfOrderNumResponse> changeDetailListOfOrderNum(ChangeDetailListOfOrderNumRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ChangeDetailListOfOrderNum").setMethod(HttpMethod.GET).setPathRegex("/airticket/v1/change/order-num/detail-list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeDetailListOfOrderNumResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeDetailListOfOrderNumResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CollectFlightLowestPrice  CollectFlightLowestPriceRequest
     * @return CollectFlightLowestPriceResponse
     */
    @Override
    public CompletableFuture<CollectFlightLowestPriceResponse> collectFlightLowestPrice(CollectFlightLowestPriceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CollectFlightLowestPrice").setMethod(HttpMethod.POST).setPathRegex("/airticket/v1/data-collect/flight-lowest-price").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CollectFlightLowestPriceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CollectFlightLowestPriceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Choose either <code>solution_id</code> or <code>journey_param_list</code> in the parameters, and <code>solution_id</code> needs to be obtained from the Search interface.</p>
     * 
     * @param request the request parameters of Enrich  EnrichRequest
     * @return EnrichResponse
     */
    @Override
    public CompletableFuture<EnrichResponse> enrich(EnrichRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("Enrich").setMethod(HttpMethod.POST).setPathRegex("/airticket/v1/trade/action-enrich").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnrichResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnrichResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FileUpload  FileUploadRequest
     * @return FileUploadResponse
     */
    @Override
    public CompletableFuture<FileUploadResponse> fileUpload(FileUploadRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FileUpload").setMethod(HttpMethod.POST).setPathRegex("/airticket/v1/attachment/action-upload").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FileUploadResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FileUploadResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FlightChangeOfOrder  FlightChangeOfOrderRequest
     * @return FlightChangeOfOrderResponse
     */
    @Override
    public CompletableFuture<FlightChangeOfOrderResponse> flightChangeOfOrder(FlightChangeOfOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FlightChangeOfOrder").setMethod(HttpMethod.GET).setPathRegex("/airticket/v1/flightchange/of-order").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FlightChangeOfOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FlightChangeOfOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetToken  GetTokenRequest
     * @return GetTokenResponse
     */
    @Override
    public CompletableFuture<GetTokenResponse> getToken(GetTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetToken").setMethod(HttpMethod.GET).setPathRegex("/airticket/v1/token").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of LuggageDirect  LuggageDirectRequest
     * @return LuggageDirectResponse
     */
    @Override
    public CompletableFuture<LuggageDirectResponse> luggageDirect(LuggageDirectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("LuggageDirect").setMethod(HttpMethod.GET).setPathRegex("/airticket/v1/flight-data/luggage-direct").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(LuggageDirectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<LuggageDirectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>query order detail</p>
     * 
     * @param request the request parameters of OrderDetail  OrderDetailRequest
     * @return OrderDetailResponse
     */
    @Override
    public CompletableFuture<OrderDetailResponse> orderDetail(OrderDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("OrderDetail").setMethod(HttpMethod.GET).setPathRegex("/airticket/v1/trade/order-detail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OrderDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OrderDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>query order list</p>
     * 
     * @param request the request parameters of OrderList  OrderListRequest
     * @return OrderListResponse
     */
    @Override
    public CompletableFuture<OrderListResponse> orderList(OrderListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("OrderList").setMethod(HttpMethod.GET).setPathRegex("/airticket/v1/trade/order-list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OrderListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OrderListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Check is price and remaining seats of solution you selected has changed. You should enter the solution_id returned by enrich.</p>
     * 
     * @param request the request parameters of Pricing  PricingRequest
     * @return PricingResponse
     */
    @Override
    public CompletableFuture<PricingResponse> pricing(PricingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("Pricing").setMethod(HttpMethod.POST).setPathRegex("/airticket/v1/trade/action-pricing").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PricingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PricingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RefundApply  RefundApplyRequest
     * @return RefundApplyResponse
     */
    @Override
    public CompletableFuture<RefundApplyResponse> refundApply(RefundApplyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RefundApply").setMethod(HttpMethod.POST).setPathRegex("/airticket/v1/refund/action-apply").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RefundApplyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RefundApplyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RefundDetail  RefundDetailRequest
     * @return RefundDetailResponse
     */
    @Override
    public CompletableFuture<RefundDetailResponse> refundDetail(RefundDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RefundDetail").setMethod(HttpMethod.GET).setPathRegex("/airticket/v1/refund/detail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RefundDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RefundDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RefundDetailList  RefundDetailListRequest
     * @return RefundDetailListResponse
     */
    @Override
    public CompletableFuture<RefundDetailListResponse> refundDetailList(RefundDetailListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RefundDetailList").setMethod(HttpMethod.GET).setPathRegex("/airticket/v1/refund/detail-list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RefundDetailListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RefundDetailListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Enter the information of departure, arrival, departure date, passenger number and cabin, return the lowest price for each flight.</p>
     * 
     * @param request the request parameters of Search  SearchRequest
     * @return SearchResponse
     */
    @Override
    public CompletableFuture<SearchResponse> search(SearchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("Search").setMethod(HttpMethod.POST).setPathRegex("/airticket/v1/trade/action-search").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StandardSearch  StandardSearchRequest
     * @return StandardSearchResponse
     */
    @Override
    public CompletableFuture<StandardSearchResponse> standardSearch(StandardSearchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StandardSearch").setMethod(HttpMethod.POST).setPathRegex("/airticket/v1/trade/action-standardsearch").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StandardSearchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StandardSearchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of Ticketing  TicketingRequest
     * @return TicketingResponse
     */
    @Override
    public CompletableFuture<TicketingResponse> ticketing(TicketingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("Ticketing").setMethod(HttpMethod.POST).setPathRegex("/airticket/v1/trade/action-ticketing").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TicketingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TicketingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Pre-check for Ticketing, this interface is optional to use.</p>
     * 
     * @param request the request parameters of TicketingCheck  TicketingCheckRequest
     * @return TicketingCheckResponse
     */
    @Override
    public CompletableFuture<TicketingCheckResponse> ticketingCheck(TicketingCheckRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TicketingCheck").setMethod(HttpMethod.POST).setPathRegex("/airticket/v1/trade/action-ticketing-check").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TicketingCheckResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TicketingCheckResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TransitVisa  TransitVisaRequest
     * @return TransitVisaResponse
     */
    @Override
    public CompletableFuture<TransitVisaResponse> transitVisa(TransitVisaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TransitVisa").setMethod(HttpMethod.GET).setPathRegex("/airticket/v1/flight-data/transit-visa").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TransitVisaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TransitVisaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of applyRefund  ApplyRefundRequest
     * @return ApplyRefundResponse
     */
    @Override
    public CompletableFuture<ApplyRefundResponse> applyRefund(ApplyRefundRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("applyRefund").setMethod(HttpMethod.POST).setPathRegex("/applyRefund").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApplyRefundResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApplyRefundResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of batchGetHotelDetail  BatchGetHotelDetailRequest
     * @return BatchGetHotelDetailResponse
     */
    @Override
    public CompletableFuture<BatchGetHotelDetailResponse> batchGetHotelDetail(BatchGetHotelDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("batchGetHotelDetail").setMethod(HttpMethod.POST).setPathRegex("/batchGetHotelDetail").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchGetHotelDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchGetHotelDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of cancelOrRefund  CancelOrRefundRequest
     * @return CancelOrRefundResponse
     */
    @Override
    public CompletableFuture<CancelOrRefundResponse> cancelOrRefund(CancelOrRefundRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("cancelOrRefund").setMethod(HttpMethod.POST).setPathRegex("/cancelOrRefund").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelOrRefundResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelOrRefundResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of cancelOrder  CancelOrderRequest
     * @return CancelOrderResponse
     */
    @Override
    public CompletableFuture<CancelOrderResponse> cancelOrder(CancelOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("cancelOrder").setMethod(HttpMethod.POST).setPathRegex("/cancelOrder").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of createAndPay  CreateAndPayRequest
     * @return CreateAndPayResponse
     */
    @Override
    public CompletableFuture<CreateAndPayResponse> createAndPay(CreateAndPayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("createAndPay").setMethod(HttpMethod.POST).setPathRegex("/createAndPay").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAndPayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAndPayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of createOrder  CreateOrderRequest
     * @return CreateOrderResponse
     */
    @Override
    public CompletableFuture<CreateOrderResponse> createOrder(CreateOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("createOrder").setMethod(HttpMethod.POST).setPathRegex("/createOrder").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of globalHotelApplyRefund  GlobalHotelApplyRefundRequest
     * @return GlobalHotelApplyRefundResponse
     */
    @Override
    public CompletableFuture<GlobalHotelApplyRefundResponse> globalHotelApplyRefund(GlobalHotelApplyRefundRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("globalHotelApplyRefund").setMethod(HttpMethod.POST).setPathRegex("/globalHotelApplyRefund").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GlobalHotelApplyRefundResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GlobalHotelApplyRefundResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of globalHotelBatchGetHotelDetail  GlobalHotelBatchGetHotelDetailRequest
     * @return GlobalHotelBatchGetHotelDetailResponse
     */
    @Override
    public CompletableFuture<GlobalHotelBatchGetHotelDetailResponse> globalHotelBatchGetHotelDetail(GlobalHotelBatchGetHotelDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("globalHotelBatchGetHotelDetail").setMethod(HttpMethod.POST).setPathRegex("/globalHotelBatchGetHotelDetail").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GlobalHotelBatchGetHotelDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GlobalHotelBatchGetHotelDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of globalHotelCancelOrRefund  GlobalHotelCancelOrRefundRequest
     * @return GlobalHotelCancelOrRefundResponse
     */
    @Override
    public CompletableFuture<GlobalHotelCancelOrRefundResponse> globalHotelCancelOrRefund(GlobalHotelCancelOrRefundRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("globalHotelCancelOrRefund").setMethod(HttpMethod.POST).setPathRegex("/globalHotelCancelOrRefund").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GlobalHotelCancelOrRefundResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GlobalHotelCancelOrRefundResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of globalHotelCancelOrder  GlobalHotelCancelOrderRequest
     * @return GlobalHotelCancelOrderResponse
     */
    @Override
    public CompletableFuture<GlobalHotelCancelOrderResponse> globalHotelCancelOrder(GlobalHotelCancelOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("globalHotelCancelOrder").setMethod(HttpMethod.POST).setPathRegex("/globalHotelCancelOrder").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GlobalHotelCancelOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GlobalHotelCancelOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of globalHotelCreateAndPay  GlobalHotelCreateAndPayRequest
     * @return GlobalHotelCreateAndPayResponse
     */
    @Override
    public CompletableFuture<GlobalHotelCreateAndPayResponse> globalHotelCreateAndPay(GlobalHotelCreateAndPayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("globalHotelCreateAndPay").setMethod(HttpMethod.POST).setPathRegex("/globalHotelCreateAndPay").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GlobalHotelCreateAndPayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GlobalHotelCreateAndPayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of globalHotelCreateOrder  GlobalHotelCreateOrderRequest
     * @return GlobalHotelCreateOrderResponse
     */
    @Override
    public CompletableFuture<GlobalHotelCreateOrderResponse> globalHotelCreateOrder(GlobalHotelCreateOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("globalHotelCreateOrder").setMethod(HttpMethod.POST).setPathRegex("/globalHotelCreateOrder").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GlobalHotelCreateOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GlobalHotelCreateOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of globalHotelPay  GlobalHotelPayRequest
     * @return GlobalHotelPayResponse
     */
    @Override
    public CompletableFuture<GlobalHotelPayResponse> globalHotelPay(GlobalHotelPayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("globalHotelPay").setMethod(HttpMethod.POST).setPathRegex("/globalHotelPay").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GlobalHotelPayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GlobalHotelPayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of globalHotelQueryAvailability  GlobalHotelQueryAvailabilityRequest
     * @return GlobalHotelQueryAvailabilityResponse
     */
    @Override
    public CompletableFuture<GlobalHotelQueryAvailabilityResponse> globalHotelQueryAvailability(GlobalHotelQueryAvailabilityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("globalHotelQueryAvailability").setMethod(HttpMethod.POST).setPathRegex("/globalHotelQueryAvailability").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GlobalHotelQueryAvailabilityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GlobalHotelQueryAvailabilityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of globalHotelQueryCalendarAvailability  GlobalHotelQueryCalendarAvailabilityRequest
     * @return GlobalHotelQueryCalendarAvailabilityResponse
     */
    @Override
    public CompletableFuture<GlobalHotelQueryCalendarAvailabilityResponse> globalHotelQueryCalendarAvailability(GlobalHotelQueryCalendarAvailabilityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("globalHotelQueryCalendarAvailability").setMethod(HttpMethod.POST).setPathRegex("/globalHotelQueryCalendarAvailability").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GlobalHotelQueryCalendarAvailabilityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GlobalHotelQueryCalendarAvailabilityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of globalHotelQueryOrder  GlobalHotelQueryOrderRequest
     * @return GlobalHotelQueryOrderResponse
     */
    @Override
    public CompletableFuture<GlobalHotelQueryOrderResponse> globalHotelQueryOrder(GlobalHotelQueryOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("globalHotelQueryOrder").setMethod(HttpMethod.POST).setPathRegex("/globalHotelQueryOrder").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GlobalHotelQueryOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GlobalHotelQueryOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of globalHotelSearchCityPage  GlobalHotelSearchCityPageRequest
     * @return GlobalHotelSearchCityPageResponse
     */
    @Override
    public CompletableFuture<GlobalHotelSearchCityPageResponse> globalHotelSearchCityPage(GlobalHotelSearchCityPageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("globalHotelSearchCityPage").setMethod(HttpMethod.POST).setPathRegex("/globalHotelSearchCityPage").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GlobalHotelSearchCityPageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GlobalHotelSearchCityPageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of globalHotelSearchHotelList  GlobalHotelSearchHotelListRequest
     * @return GlobalHotelSearchHotelListResponse
     */
    @Override
    public CompletableFuture<GlobalHotelSearchHotelListResponse> globalHotelSearchHotelList(GlobalHotelSearchHotelListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("globalHotelSearchHotelList").setMethod(HttpMethod.POST).setPathRegex("/globalHotelSearchHotelList").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GlobalHotelSearchHotelListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GlobalHotelSearchHotelListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of globalHotelValidatePrice  GlobalHotelValidatePriceRequest
     * @return GlobalHotelValidatePriceResponse
     */
    @Override
    public CompletableFuture<GlobalHotelValidatePriceResponse> globalHotelValidatePrice(GlobalHotelValidatePriceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("globalHotelValidatePrice").setMethod(HttpMethod.POST).setPathRegex("/globalHotelValidatePrice").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GlobalHotelValidatePriceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GlobalHotelValidatePriceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of pay  PayRequest
     * @return PayResponse
     */
    @Override
    public CompletableFuture<PayResponse> pay(PayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("pay").setMethod(HttpMethod.POST).setPathRegex("/pay").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of queryAvailability  QueryAvailabilityRequest
     * @return QueryAvailabilityResponse
     */
    @Override
    public CompletableFuture<QueryAvailabilityResponse> queryAvailability(QueryAvailabilityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("queryAvailability").setMethod(HttpMethod.POST).setPathRegex("/queryAvailability").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryAvailabilityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryAvailabilityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of queryCalendarAvailability  QueryCalendarAvailabilityRequest
     * @return QueryCalendarAvailabilityResponse
     */
    @Override
    public CompletableFuture<QueryCalendarAvailabilityResponse> queryCalendarAvailability(QueryCalendarAvailabilityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("queryCalendarAvailability").setMethod(HttpMethod.POST).setPathRegex("/queryCalendarAvailability").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryCalendarAvailabilityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryCalendarAvailabilityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of queryOrder  QueryOrderRequest
     * @return QueryOrderResponse
     */
    @Override
    public CompletableFuture<QueryOrderResponse> queryOrder(QueryOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("queryOrder").setMethod(HttpMethod.POST).setPathRegex("/queryOrder").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of searchCityPage  SearchCityPageRequest
     * @return SearchCityPageResponse
     */
    @Override
    public CompletableFuture<SearchCityPageResponse> searchCityPage(SearchCityPageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("searchCityPage").setMethod(HttpMethod.POST).setPathRegex("/searchCityPage").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchCityPageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchCityPageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of searchHotelList  SearchHotelListRequest
     * @return SearchHotelListResponse
     */
    @Override
    public CompletableFuture<SearchHotelListResponse> searchHotelList(SearchHotelListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("searchHotelList").setMethod(HttpMethod.POST).setPathRegex("/globalHotel/searchHotelList").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchHotelListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchHotelListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of validatePrice  ValidatePriceRequest
     * @return ValidatePriceResponse
     */
    @Override
    public CompletableFuture<ValidatePriceResponse> validatePrice(ValidatePriceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("validatePrice").setMethod(HttpMethod.POST).setPathRegex("/validatePrice").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ValidatePriceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ValidatePriceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
