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
 * {@link CreatePbcApiSchemaRequest} extends {@link RequestModel}
 *
 * <p>CreatePbcApiSchemaRequest</p>
 */
public class CreatePbcApiSchemaRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private PbcApiSchemaCreateCmd body;

    private CreatePbcApiSchemaRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePbcApiSchemaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public PbcApiSchemaCreateCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreatePbcApiSchemaRequest, Builder> {
        private PbcApiSchemaCreateCmd body; 

        private Builder() {
            super();
        } 

        private Builder(CreatePbcApiSchemaRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(PbcApiSchemaCreateCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreatePbcApiSchemaRequest build() {
            return new CreatePbcApiSchemaRequest(this);
        } 

    } 

}
