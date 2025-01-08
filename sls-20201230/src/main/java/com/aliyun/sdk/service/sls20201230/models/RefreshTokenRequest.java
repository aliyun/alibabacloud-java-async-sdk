// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link RefreshTokenRequest} extends {@link RequestModel}
 *
 * <p>RefreshTokenRequest</p>
 */
public class RefreshTokenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accessTokenExpirationTime")
    private Long accessTokenExpirationTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ticket")
    private String ticket;

    private RefreshTokenRequest(Builder builder) {
        super(builder);
        this.accessTokenExpirationTime = builder.accessTokenExpirationTime;
        this.ticket = builder.ticket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessTokenExpirationTime
     */
    public Long getAccessTokenExpirationTime() {
        return this.accessTokenExpirationTime;
    }

    /**
     * @return ticket
     */
    public String getTicket() {
        return this.ticket;
    }

    public static final class Builder extends Request.Builder<RefreshTokenRequest, Builder> {
        private Long accessTokenExpirationTime; 
        private String ticket; 

        private Builder() {
            super();
        } 

        private Builder(RefreshTokenRequest request) {
            super(request);
            this.accessTokenExpirationTime = request.accessTokenExpirationTime;
            this.ticket = request.ticket;
        } 

        /**
         * accessTokenExpirationTime.
         */
        public Builder accessTokenExpirationTime(Long accessTokenExpirationTime) {
            this.putQueryParameter("accessTokenExpirationTime", accessTokenExpirationTime);
            this.accessTokenExpirationTime = accessTokenExpirationTime;
            return this;
        }

        /**
         * <p>The ticket that is used for logon-free access.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJ***************.eyJ******************.KUT****************</p>
         */
        public Builder ticket(String ticket) {
            this.putQueryParameter("ticket", ticket);
            this.ticket = ticket;
            return this;
        }

        @Override
        public RefreshTokenRequest build() {
            return new RefreshTokenRequest(this);
        } 

    } 

}
