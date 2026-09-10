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
         * <li>The expiration time of the access token in seconds, which specifies how long the user can access page APIs. Default value: 86400 (one day). Valid values: 0 to 86400 (one day).</li>
         * <li>The actual access token expiration time is the minimum value of accessTokenExpirationTime and expirationTime.</li>
         * <li>If you call this operation by using a Security Token Service (STS) token, the actual access token expiration time is the minimum value of accessTokenExpirationTime, expirationTime, and the STS token expiration time.</li>
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
         * <li>The expiration time in seconds for the embedded page URL link. Default value: 86400 (one day). Valid values: 0 to 2592000 (30 days).</li>
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
