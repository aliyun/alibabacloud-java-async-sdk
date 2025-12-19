// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link AuthorizationRequest} extends {@link RequestModel}
 *
 * <p>AuthorizationRequest</p>
 */
public class AuthorizationRequest extends Request {
    @com.aliyun.core.annotation.NameInMap("Endpoint")
    private String endpoint;

    private AuthorizationRequest(Builder builder) {
        super(builder);
        this.endpoint = builder.endpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthorizationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    public static final class Builder extends Request.Builder<AuthorizationRequest, Builder> {
        private String endpoint; 

        private Builder() {
            super();
        } 

        private Builder(AuthorizationRequest request) {
            super(request);
            this.endpoint = request.endpoint;
        } 

        /**
         * Endpoint.
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        @Override
        public AuthorizationRequest build() {
            return new AuthorizationRequest(this);
        } 

    } 

}
