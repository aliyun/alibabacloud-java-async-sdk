// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link AuthorizeProductsRequest} extends {@link RequestModel}
 *
 * <p>AuthorizeProductsRequest</p>
 */
public class AuthorizeProductsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private AuthorizeProductsCmd body;

    private AuthorizeProductsRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthorizeProductsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public AuthorizeProductsCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<AuthorizeProductsRequest, Builder> {
        private AuthorizeProductsCmd body; 

        private Builder() {
            super();
        } 

        private Builder(AuthorizeProductsRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(AuthorizeProductsCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public AuthorizeProductsRequest build() {
            return new AuthorizeProductsRequest(this);
        } 

    } 

}
