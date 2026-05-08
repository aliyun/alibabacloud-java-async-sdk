// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketing_event20210101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryQwenConferenceSgTicketPopRequest} extends {@link RequestModel}
 *
 * <p>QueryQwenConferenceSgTicketPopRequest</p>
 */
public class QueryQwenConferenceSgTicketPopRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TicketToken")
    private String ticketToken;

    private QueryQwenConferenceSgTicketPopRequest(Builder builder) {
        super(builder);
        this.ticketToken = builder.ticketToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryQwenConferenceSgTicketPopRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ticketToken
     */
    public String getTicketToken() {
        return this.ticketToken;
    }

    public static final class Builder extends Request.Builder<QueryQwenConferenceSgTicketPopRequest, Builder> {
        private String ticketToken; 

        private Builder() {
            super();
        } 

        private Builder(QueryQwenConferenceSgTicketPopRequest request) {
            super(request);
            this.ticketToken = request.ticketToken;
        } 

        /**
         * TicketToken.
         */
        public Builder ticketToken(String ticketToken) {
            this.putQueryParameter("TicketToken", ticketToken);
            this.ticketToken = ticketToken;
            return this;
        }

        @Override
        public QueryQwenConferenceSgTicketPopRequest build() {
            return new QueryQwenConferenceSgTicketPopRequest(this);
        } 

    } 

}
