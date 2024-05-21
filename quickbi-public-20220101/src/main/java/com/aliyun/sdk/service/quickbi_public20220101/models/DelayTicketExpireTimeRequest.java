// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DelayTicketExpireTimeRequest} extends {@link RequestModel}
 *
 * <p>DelayTicketExpireTimeRequest</p>
 */
public class DelayTicketExpireTimeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer expireTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ticket")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * The time to postpone.
         * <p>
         * 
         * *   Unit: minutes. Valid values: 0 to 240. Unit: minutes. Valid values: 4 hours.
         * *   Expired bills cannot be extended.
         */
        public Builder expireTime(Integer expireTime) {
            this.putQueryParameter("ExpireTime", expireTime);
            this.expireTime = expireTime;
            return this;
        }

        /**
         * The value of the third-party embedded ticket, that is, the accessTicket value in the URL.
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
