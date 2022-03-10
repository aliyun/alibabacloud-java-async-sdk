// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTicketNumRequest} extends {@link RequestModel}
 *
 * <p>UpdateTicketNumRequest</p>
 */
public class UpdateTicketNumRequest extends Request {
    @Query
    @NameInMap("Ticket")
    @Validation(required = true)
    private String ticket;

    @Query
    @NameInMap("TicketNum")
    @Validation(required = true)
    private Integer ticketNum;

    private UpdateTicketNumRequest(Builder builder) {
        super(builder);
        this.ticket = builder.ticket;
        this.ticketNum = builder.ticketNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTicketNumRequest create() {
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

    /**
     * @return ticketNum
     */
    public Integer getTicketNum() {
        return this.ticketNum;
    }

    public static final class Builder extends Request.Builder<UpdateTicketNumRequest, Builder> {
        private String ticket; 
        private Integer ticketNum; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTicketNumRequest request) {
            super(request);
            this.ticket = request.ticket;
            this.ticketNum = request.ticketNum;
        } 

        /**
         * Ticket.
         */
        public Builder ticket(String ticket) {
            this.putQueryParameter("Ticket", ticket);
            this.ticket = ticket;
            return this;
        }

        /**
         * TicketNum.
         */
        public Builder ticketNum(Integer ticketNum) {
            this.putQueryParameter("TicketNum", ticketNum);
            this.ticketNum = ticketNum;
            return this;
        }

        @Override
        public UpdateTicketNumRequest build() {
            return new UpdateTicketNumRequest(this);
        } 

    } 

}
