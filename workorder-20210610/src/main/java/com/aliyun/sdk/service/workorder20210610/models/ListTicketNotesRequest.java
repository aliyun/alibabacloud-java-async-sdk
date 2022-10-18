// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20210610.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTicketNotesRequest} extends {@link RequestModel}
 *
 * <p>ListTicketNotesRequest</p>
 */
public class ListTicketNotesRequest extends Request {
    @Query
    @NameInMap("TicketId")
    @Validation(required = true)
    private String ticketId;

    private ListTicketNotesRequest(Builder builder) {
        super(builder);
        this.ticketId = builder.ticketId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTicketNotesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ticketId
     */
    public String getTicketId() {
        return this.ticketId;
    }

    public static final class Builder extends Request.Builder<ListTicketNotesRequest, Builder> {
        private String ticketId; 

        private Builder() {
            super();
        } 

        private Builder(ListTicketNotesRequest request) {
            super(request);
            this.ticketId = request.ticketId;
        } 

        /**
         * TicketId.
         */
        public Builder ticketId(String ticketId) {
            this.putQueryParameter("TicketId", ticketId);
            this.ticketId = ticketId;
            return this;
        }

        @Override
        public ListTicketNotesRequest build() {
            return new ListTicketNotesRequest(this);
        } 

    } 

}
