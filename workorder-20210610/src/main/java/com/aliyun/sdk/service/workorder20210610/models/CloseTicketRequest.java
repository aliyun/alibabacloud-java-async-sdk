// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20210610.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloseTicketRequest} extends {@link RequestModel}
 *
 * <p>CloseTicketRequest</p>
 */
public class CloseTicketRequest extends Request {
    @Body
    @NameInMap("TicketId")
    @Validation(required = true)
    private String ticketId;

    private CloseTicketRequest(Builder builder) {
        super(builder);
        this.ticketId = builder.ticketId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloseTicketRequest create() {
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

    public static final class Builder extends Request.Builder<CloseTicketRequest, Builder> {
        private String ticketId; 

        private Builder() {
            super();
        } 

        private Builder(CloseTicketRequest request) {
            super(request);
            this.ticketId = request.ticketId;
        } 

        /**
         * TicketId.
         */
        public Builder ticketId(String ticketId) {
            this.putBodyParameter("TicketId", ticketId);
            this.ticketId = ticketId;
            return this;
        }

        @Override
        public CloseTicketRequest build() {
            return new CloseTicketRequest(this);
        } 

    } 

}
