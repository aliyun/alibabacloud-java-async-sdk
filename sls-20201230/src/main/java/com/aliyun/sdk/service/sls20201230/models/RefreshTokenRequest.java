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
         * <ul>
         * <li>The validity period of the access token. Unit: seconds. Default value: 86400, which specifies one day. Valid values: 0 to 86400.</li>
         * <li>The validity period of the access token is the smaller value between accessTokenExpirationTime and expirationTime.</li>
         * <li>If you use a Security Token Service (STS) token to call this operation, the validity period of the access token is the smallest value among accessTokenExpirationTime, expirationTime, and the validity period of the STS token.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>600</p>
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
