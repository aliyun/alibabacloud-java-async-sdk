// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20200326;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.workorder20200326.models.*;
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
     * @deprecated OpenAPI CloseTicket is deprecated, please use Workorder::2021-06-10::CloseTicket instead.  * @param request  the request parameters of CloseTicket  CloseTicketRequest
     * @return CloseTicketResponse
     */
    @Deprecated
    CompletableFuture<CloseTicketResponse> closeTicket(CloseTicketRequest request);

    /**
     * @deprecated OpenAPI CreateTicket is deprecated, please use Workorder::2021-06-10::CreateTicket instead.  * @param request  the request parameters of CreateTicket  CreateTicketRequest
     * @return CreateTicketResponse
     */
    @Deprecated
    CompletableFuture<CreateTicketResponse> createTicket(CreateTicketRequest request);

    /**
     * @deprecated OpenAPI ListCategories is deprecated, please use Workorder::2021-06-10::ListCategories instead.  * @param request  the request parameters of ListCategories  ListCategoriesRequest
     * @return ListCategoriesResponse
     */
    @Deprecated
    CompletableFuture<ListCategoriesResponse> listCategories(ListCategoriesRequest request);

    /**
     * @deprecated OpenAPI ListProducts is deprecated, please use Workorder::2021-06-10::ListProducts instead.  * @param request  the request parameters of ListProducts  ListProductsRequest
     * @return ListProductsResponse
     */
    @Deprecated
    CompletableFuture<ListProductsResponse> listProducts(ListProductsRequest request);

    /**
     * @deprecated OpenAPI ListTicketNotes is deprecated, please use Workorder::2021-06-10::ListTicketNotes instead.  * @param request  the request parameters of ListTicketNotes  ListTicketNotesRequest
     * @return ListTicketNotesResponse
     */
    @Deprecated
    CompletableFuture<ListTicketNotesResponse> listTicketNotes(ListTicketNotesRequest request);

    /**
     * @deprecated OpenAPI ListTickets is deprecated, please use Workorder::2021-06-10::ListTickets instead.  * @param request  the request parameters of ListTickets  ListTicketsRequest
     * @return ListTicketsResponse
     */
    @Deprecated
    CompletableFuture<ListTicketsResponse> listTickets(ListTicketsRequest request);

}
