// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20200801;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.workorder20200801.models.*;
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
     * @deprecated OpenAPI CreateTicket is deprecated, please use Workorder::2021-06-10::CreateTicket instead.  * @param request  the request parameters of CreateTicket  CreateTicketRequest
     * @return CreateTicketResponse
     */
    @Deprecated
    CompletableFuture<CreateTicketResponse> createTicket(CreateTicketRequest request);

    /**
     * @param request the request parameters of GetAttachmentUploadUrl  GetAttachmentUploadUrlRequest
     * @return GetAttachmentUploadUrlResponse
     */
    CompletableFuture<GetAttachmentUploadUrlResponse> getAttachmentUploadUrl(GetAttachmentUploadUrlRequest request);

    /**
     * @param request the request parameters of GetAttachmentUrl  GetAttachmentUrlRequest
     * @return GetAttachmentUrlResponse
     */
    CompletableFuture<GetAttachmentUrlResponse> getAttachmentUrl(GetAttachmentUrlRequest request);

    /**
     * @deprecated OpenAPI GetTicket is deprecated, please use Workorder::2021-06-10::GetTicket instead.  * @param request  the request parameters of GetTicket  GetTicketRequest
     * @return GetTicketResponse
     */
    @Deprecated
    CompletableFuture<GetTicketResponse> getTicket(GetTicketRequest request);

    /**
     * @deprecated OpenAPI ListTickets is deprecated, please use Workorder::2021-06-10::ListTickets instead.  * @param request  the request parameters of ListTickets  ListTicketsRequest
     * @return ListTicketsResponse
     */
    @Deprecated
    CompletableFuture<ListTicketsResponse> listTickets(ListTicketsRequest request);

}
