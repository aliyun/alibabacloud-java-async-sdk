// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20210610.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReopenTicketRequest} extends {@link RequestModel}
 *
 * <p>ReopenTicketRequest</p>
 */
public class ReopenTicketRequest extends Request {
    @Body
    @NameInMap("Content")
    @Validation(required = true)
    private String content;

    @Body
    @NameInMap("TicketId")
    @Validation(required = true)
    private String ticketId;

    private ReopenTicketRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.ticketId = builder.ticketId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReopenTicketRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return ticketId
     */
    public String getTicketId() {
        return this.ticketId;
    }

    public static final class Builder extends Request.Builder<ReopenTicketRequest, Builder> {
        private String content; 
        private String ticketId; 

        private Builder() {
            super();
        } 

        private Builder(ReopenTicketRequest request) {
            super(request);
            this.content = request.content;
            this.ticketId = request.ticketId;
        } 

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
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
        public ReopenTicketRequest build() {
            return new ReopenTicketRequest(this);
        } 

    } 

}
