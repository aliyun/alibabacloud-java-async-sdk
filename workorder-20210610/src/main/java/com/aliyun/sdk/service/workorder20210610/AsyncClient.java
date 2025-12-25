// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20210610;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.workorder20210610.models.*;
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
     * @param request the request parameters of CloseTicket  CloseTicketRequest
     * @return CloseTicketResponse
     */
    CompletableFuture<CloseTicketResponse> closeTicket(CloseTicketRequest request);

    /**
     * @param request the request parameters of CreateTicket  CreateTicketRequest
     * @return CreateTicketResponse
     */
    CompletableFuture<CreateTicketResponse> createTicket(CreateTicketRequest request);

    /**
     * @param request the request parameters of EvaluateTicket  EvaluateTicketRequest
     * @return EvaluateTicketResponse
     */
    CompletableFuture<EvaluateTicketResponse> evaluateTicket(EvaluateTicketRequest request);

    /**
     * @param request the request parameters of GetAttachmentUploadUrl  GetAttachmentUploadUrlRequest
     * @return GetAttachmentUploadUrlResponse
     */
    CompletableFuture<GetAttachmentUploadUrlResponse> getAttachmentUploadUrl(GetAttachmentUploadUrlRequest request);

    /**
     * @param request the request parameters of GetMqConsumerTag  GetMqConsumerTagRequest
     * @return GetMqConsumerTagResponse
     */
    CompletableFuture<GetMqConsumerTagResponse> getMqConsumerTag(GetMqConsumerTagRequest request);

    /**
     * @param request the request parameters of GetTicket  GetTicketRequest
     * @return GetTicketResponse
     */
    CompletableFuture<GetTicketResponse> getTicket(GetTicketRequest request);

    /**
     * @param request the request parameters of ListCategories  ListCategoriesRequest
     * @return ListCategoriesResponse
     */
    CompletableFuture<ListCategoriesResponse> listCategories(ListCategoriesRequest request);

    /**
     * @param request the request parameters of ListProducts  ListProductsRequest
     * @return ListProductsResponse
     */
    CompletableFuture<ListProductsResponse> listProducts(ListProductsRequest request);

    /**
     * @param request the request parameters of ListTicketNotes  ListTicketNotesRequest
     * @return ListTicketNotesResponse
     */
    CompletableFuture<ListTicketNotesResponse> listTicketNotes(ListTicketNotesRequest request);

    /**
     * @param request the request parameters of ListTickets  ListTicketsRequest
     * @return ListTicketsResponse
     */
    CompletableFuture<ListTicketsResponse> listTickets(ListTicketsRequest request);

    /**
     * @param request the request parameters of ReopenTicket  ReopenTicketRequest
     * @return ReopenTicketResponse
     */
    CompletableFuture<ReopenTicketResponse> reopenTicket(ReopenTicketRequest request);

    /**
     * @param request the request parameters of ReplyTicket  ReplyTicketRequest
     * @return ReplyTicketResponse
     */
    CompletableFuture<ReplyTicketResponse> replyTicket(ReplyTicketRequest request);

}
