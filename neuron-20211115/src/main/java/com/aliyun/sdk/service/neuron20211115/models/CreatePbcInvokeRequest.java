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
 * {@link CreatePbcInvokeRequest} extends {@link RequestModel}
 *
 * <p>CreatePbcInvokeRequest</p>
 */
public class CreatePbcInvokeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private PbcInvokeCreateCmd body;

    private CreatePbcInvokeRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePbcInvokeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public PbcInvokeCreateCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreatePbcInvokeRequest, Builder> {
        private PbcInvokeCreateCmd body; 

        private Builder() {
            super();
        } 

        private Builder(CreatePbcInvokeRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(PbcInvokeCreateCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreatePbcInvokeRequest build() {
            return new CreatePbcInvokeRequest(this);
        } 

    } 

}
