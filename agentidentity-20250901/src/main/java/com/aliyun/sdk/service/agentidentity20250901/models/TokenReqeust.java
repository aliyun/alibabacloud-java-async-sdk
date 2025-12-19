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
 * {@link TokenReqeust} extends {@link TeaModel}
 *
 * <p>TokenReqeust</p>
 */
public class TokenReqeust extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Endpoint")
    private String endpoint;

    private TokenReqeust(Builder builder) {
        this.endpoint = builder.endpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TokenReqeust create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    public static final class Builder {
        private String endpoint; 

        private Builder() {
        } 

        private Builder(TokenReqeust model) {
            this.endpoint = model.endpoint;
        } 

        /**
         * Endpoint.
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public TokenReqeust build() {
            return new TokenReqeust(this);
        } 

    } 

}
