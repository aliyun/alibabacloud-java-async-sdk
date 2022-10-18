// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20210610.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTicketRequest} extends {@link RequestModel}
 *
 * <p>GetTicketRequest</p>
 */
public class GetTicketRequest extends Request {
    @Body
    @NameInMap("TicketId")
    @Validation(required = true)
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
         * TicketId.
         */
        public Builder ticketId(String ticketId) {
            this.putBodyParameter("TicketId", ticketId);
            this.ticketId = ticketId;
            return this;
        }

        @Override
        public GetTicketRequest build() {
            return new GetTicketRequest(this);
        } 

    } 

}
