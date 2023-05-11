// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTicketRequest} extends {@link RequestModel}
 *
 * <p>DeleteTicketRequest</p>
 */
public class DeleteTicketRequest extends Request {
    @Query
    @NameInMap("Ticket")
    @Validation(required = true)
    private String ticket;

    private DeleteTicketRequest(Builder builder) {
        super(builder);
        this.ticket = builder.ticket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTicketRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ticket
     */
    public String getTicket() {
        return this.ticket;
    }

    public static final class Builder extends Request.Builder<DeleteTicketRequest, Builder> {
        private String ticket; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTicketRequest request) {
            super(request);
            this.ticket = request.ticket;
        } 

        /**
         * Deletes a specified ticket from an embedded report.
         */
        public Builder ticket(String ticket) {
            this.putQueryParameter("Ticket", ticket);
            this.ticket = ticket;
            return this;
        }

        @Override
        public DeleteTicketRequest build() {
            return new DeleteTicketRequest(this);
        } 

    } 

}
