// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DelayTicketExpireTimeRequest} extends {@link RequestModel}
 *
 * <p>DelayTicketExpireTimeRequest</p>
 */
public class DelayTicketExpireTimeRequest extends Request {
    @Query
    @NameInMap("ExpireTime")
    @Validation(required = true)
    private Integer expireTime;

    @Query
    @NameInMap("Ticket")
    @Validation(required = true)
    private String ticket;

    private DelayTicketExpireTimeRequest(Builder builder) {
        super(builder);
        this.expireTime = builder.expireTime;
        this.ticket = builder.ticket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DelayTicketExpireTimeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expireTime
     */
    public Integer getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return ticket
     */
    public String getTicket() {
        return this.ticket;
    }

    public static final class Builder extends Request.Builder<DelayTicketExpireTimeRequest, Builder> {
        private Integer expireTime; 
        private String ticket; 

        private Builder() {
            super();
        } 

        private Builder(DelayTicketExpireTimeRequest request) {
            super(request);
            this.expireTime = request.expireTime;
            this.ticket = request.ticket;
        } 

        /**
         * ExpireTime.
         */
        public Builder expireTime(Integer expireTime) {
            this.putQueryParameter("ExpireTime", expireTime);
            this.expireTime = expireTime;
            return this;
        }

        /**
         * Ticket.
         */
        public Builder ticket(String ticket) {
            this.putQueryParameter("Ticket", ticket);
            this.ticket = ticket;
            return this;
        }

        @Override
        public DelayTicketExpireTimeRequest build() {
            return new DelayTicketExpireTimeRequest(this);
        } 

    } 

}
