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
         * accessTokenExpirationTime.
         */
        public Builder accessTokenExpirationTime(Long accessTokenExpirationTime) {
            this.putQueryParameter("accessTokenExpirationTime", accessTokenExpirationTime);
            this.accessTokenExpirationTime = accessTokenExpirationTime;
            return this;
        }

        /**
         * <p>The validity period of the ticket that is used for logon-free access. Unit: seconds. Default value: 86400. Maximum value: 2592000. The value 86400 specifies one day.</p>
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
