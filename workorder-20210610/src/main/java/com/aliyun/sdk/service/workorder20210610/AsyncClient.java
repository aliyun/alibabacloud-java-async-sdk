// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20210610;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.workorder20210610.models.*;
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

    CompletableFuture<CloseTicketResponse> closeTicket(CloseTicketRequest request);

    CompletableFuture<CreateTicketResponse> createTicket(CreateTicketRequest request);

    CompletableFuture<EvaluateTicketResponse> evaluateTicket(EvaluateTicketRequest request);

    CompletableFuture<GetMqConsumerTagResponse> getMqConsumerTag(GetMqConsumerTagRequest request);

    CompletableFuture<ListCategoriesResponse> listCategories(ListCategoriesRequest request);

    CompletableFuture<ListProductsResponse> listProducts(ListProductsRequest request);

    CompletableFuture<ListTicketNotesResponse> listTicketNotes(ListTicketNotesRequest request);

    CompletableFuture<ListTicketsResponse> listTickets(ListTicketsRequest request);

    CompletableFuture<ReplyTicketResponse> replyTicket(ReplyTicketRequest request);

}
