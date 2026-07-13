// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link RevokeAtiRegistrantRequest} extends {@link RequestModel}
 *
 * <p>RevokeAtiRegistrantRequest</p>
 */
public class RevokeAtiRegistrantRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistrantId")
    private String registrantId;

    private RevokeAtiRegistrantRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.registrantId = builder.registrantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeAtiRegistrantRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return registrantId
     */
    public String getRegistrantId() {
        return this.registrantId;
    }

    public static final class Builder extends Request.Builder<RevokeAtiRegistrantRequest, Builder> {
        private String clientToken; 
        private String registrantId; 

        private Builder() {
            super();
        } 

        private Builder(RevokeAtiRegistrantRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.registrantId = request.registrantId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * RegistrantId.
         */
        public Builder registrantId(String registrantId) {
            this.putQueryParameter("RegistrantId", registrantId);
            this.registrantId = registrantId;
            return this;
        }

        @Override
        public RevokeAtiRegistrantRequest build() {
            return new RevokeAtiRegistrantRequest(this);
        } 

    } 

}
