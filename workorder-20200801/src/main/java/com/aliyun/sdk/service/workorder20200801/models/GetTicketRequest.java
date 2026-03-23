// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20200801.models;

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
 * {@link GetTicketRequest} extends {@link RequestModel}
 *
 * <p>GetTicketRequest</p>
 */
public class GetTicketRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TicketId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ticketId;

    private GetTicketRequest(Builder builder) {
        super(builder);
        this.ticketId = builder.ticketId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTicketRequest create() {
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

    public static final class Builder extends Request.Builder<GetTicketRequest, Builder> {
        private String ticketId; 

        private Builder() {
            super();
        } 

        private Builder(GetTicketRequest request) {
            super(request);
            this.ticketId = request.ticketId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder ticketId(String ticketId) {
            this.putQueryParameter("TicketId", ticketId);
            this.ticketId = ticketId;
            return this;
        }

        @Override
        public GetTicketRequest build() {
            return new GetTicketRequest(this);
        } 

    } 

}
