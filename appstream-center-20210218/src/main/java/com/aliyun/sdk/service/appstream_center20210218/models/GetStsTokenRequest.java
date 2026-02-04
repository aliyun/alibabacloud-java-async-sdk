// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210218.models;

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
 * {@link GetStsTokenRequest} extends {@link RequestModel}
 *
 * <p>GetStsTokenRequest</p>
 */
public class GetStsTokenRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Expiration")
    private Long expiration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExternalId")
    private String externalId;

    private GetStsTokenRequest(Builder builder) {
        super(builder);
        this.endUserId = builder.endUserId;
        this.expiration = builder.expiration;
        this.externalId = builder.externalId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStsTokenRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return expiration
     */
    public Long getExpiration() {
        return this.expiration;
    }

    /**
     * @return externalId
     */
    public String getExternalId() {
        return this.externalId;
    }

    public static final class Builder extends Request.Builder<GetStsTokenRequest, Builder> {
        private String endUserId; 
        private Long expiration; 
        private String externalId; 

        private Builder() {
            super();
        } 

        private Builder(GetStsTokenRequest request) {
            super(request);
            this.endUserId = request.endUserId;
            this.expiration = request.expiration;
            this.externalId = request.externalId;
        } 

        /**
         * EndUserId.
         */
        public Builder endUserId(String endUserId) {
            this.putBodyParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * Expiration.
         */
        public Builder expiration(Long expiration) {
            this.putBodyParameter("Expiration", expiration);
            this.expiration = expiration;
            return this;
        }

        /**
         * ExternalId.
         */
        public Builder externalId(String externalId) {
            this.putBodyParameter("ExternalId", externalId);
            this.externalId = externalId;
            return this;
        }

        @Override
        public GetStsTokenRequest build() {
            return new GetStsTokenRequest(this);
        } 

    } 

}
