// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTicketInfoRequest} extends {@link RequestModel}
 *
 * <p>QueryTicketInfoRequest</p>
 */
public class QueryTicketInfoRequest extends Request {
    @Query
    @NameInMap("Ticket")
    @Validation(required = true)
    private String ticket;

    private QueryTicketInfoRequest(Builder builder) {
        super(builder);
        this.ticket = builder.ticket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTicketInfoRequest create() {
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

    public static final class Builder extends Request.Builder<QueryTicketInfoRequest, Builder> {
        private String ticket; 

        private Builder() {
            super();
        } 

        private Builder(QueryTicketInfoRequest request) {
            super(request);
            this.ticket = request.ticket;
        } 

        /**
         * Obtains the details of a specified ticket for a report that is not embedded in the report.
         */
        public Builder ticket(String ticket) {
            this.putQueryParameter("Ticket", ticket);
            this.ticket = ticket;
            return this;
        }

        @Override
        public QueryTicketInfoRequest build() {
            return new QueryTicketInfoRequest(this);
        } 

    } 

}
