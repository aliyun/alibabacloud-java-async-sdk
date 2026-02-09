// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20200326;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.workorder20200326.models.*;
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
        this.product = "Workorder";
        this.version = "2020-03-26";
        this.endpointRule = "central";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("ap-northeast-1", "workorder.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "workorder.ap-southeast-1.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @deprecated OpenAPI CloseTicket is deprecated, please use Workorder::2021-06-10::CloseTicket instead.  * @param request  the request parameters of CloseTicket  CloseTicketRequest
     * @return CloseTicketResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<CloseTicketResponse> closeTicket(CloseTicketRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloseTicket").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloseTicketResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloseTicketResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI CreateTicket is deprecated, please use Workorder::2021-06-10::CreateTicket instead.  * @param request  the request parameters of CreateTicket  CreateTicketRequest
     * @return CreateTicketResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<CreateTicketResponse> createTicket(CreateTicketRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTicket").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTicketResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTicketResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI ListCategories is deprecated, please use Workorder::2021-06-10::ListCategories instead.  * @param request  the request parameters of ListCategories  ListCategoriesRequest
     * @return ListCategoriesResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<ListCategoriesResponse> listCategories(ListCategoriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCategories").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCategoriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCategoriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI ListProducts is deprecated, please use Workorder::2021-06-10::ListProducts instead.  * @param request  the request parameters of ListProducts  ListProductsRequest
     * @return ListProductsResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<ListProductsResponse> listProducts(ListProductsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListProducts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProductsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProductsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI ListTicketNotes is deprecated, please use Workorder::2021-06-10::ListTicketNotes instead.  * @param request  the request parameters of ListTicketNotes  ListTicketNotesRequest
     * @return ListTicketNotesResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<ListTicketNotesResponse> listTicketNotes(ListTicketNotesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTicketNotes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTicketNotesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTicketNotesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI ListTickets is deprecated, please use Workorder::2021-06-10::ListTickets instead.  * @param request  the request parameters of ListTickets  ListTicketsRequest
     * @return ListTicketsResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<ListTicketsResponse> listTickets(ListTicketsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTickets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTicketsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTicketsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
