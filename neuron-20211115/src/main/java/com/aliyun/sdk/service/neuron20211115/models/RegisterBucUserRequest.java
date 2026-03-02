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
 * {@link RegisterBucUserRequest} extends {@link RequestModel}
 *
 * <p>RegisterBucUserRequest</p>
 */
public class RegisterBucUserRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private RegisterBucUserCmd body;

    private RegisterBucUserRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterBucUserRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public RegisterBucUserCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<RegisterBucUserRequest, Builder> {
        private RegisterBucUserCmd body; 

        private Builder() {
            super();
        } 

        private Builder(RegisterBucUserRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(RegisterBucUserCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public RegisterBucUserRequest build() {
            return new RegisterBucUserRequest(this);
        } 

    } 

}
