// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link CreateTicketRequest} extends {@link RequestModel}
 *
 * <p>CreateTicketRequest</p>
 */
public class CreateTicketRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accessTokenExpirationTime")
    private Long accessTokenExpirationTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("expirationTime")
    private Long expirationTime;

    private CreateTicketRequest(Builder builder) {
        super(builder);
        this.accessTokenExpirationTime = builder.accessTokenExpirationTime;
        this.expirationTime = builder.expirationTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTicketRequest create() {
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
     * @return expirationTime
     */
    public Long getExpirationTime() {
        return this.expirationTime;
    }

    public static final class Builder extends Request.Builder<CreateTicketRequest, Builder> {
        private Long accessTokenExpirationTime; 
        private Long expirationTime; 

        private Builder() {
            super();
        } 

        private Builder(CreateTicketRequest request) {
            super(request);
            this.accessTokenExpirationTime = request.accessTokenExpirationTime;
            this.expirationTime = request.expirationTime;
        } 

        /**
         * <ul>
         * <li>Access token expiration time (in seconds), which is the expiration time for the user to access the page interface. The default value is 86400 seconds (one day), and the range of values is from 0 to 86400 seconds (one day).</li>
         * <li>The access token expiration time is the minimum value between <code>accessTokenExpirationTime</code> and <code>expirationTime</code>.</li>
         * <li>If called through STS, the access token expiration time (i.e., the time during which the user can access the page interface) is the minimum value among <code>accessTokenExpirationTime</code>, <code>expirationTime</code>, and the STS expiration time.</li>
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
         * <ul>
         * <li>Expiration time (in seconds), which is the expiration time for the embedded page URL. The default value is 86400 seconds (one day), and the range of values is from 0 to 2592000 seconds (30 days).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        public Builder expirationTime(Long expirationTime) {
            this.putQueryParameter("expirationTime", expirationTime);
            this.expirationTime = expirationTime;
            return this;
        }

        @Override
        public CreateTicketRequest build() {
            return new CreateTicketRequest(this);
        } 

    } 

}
