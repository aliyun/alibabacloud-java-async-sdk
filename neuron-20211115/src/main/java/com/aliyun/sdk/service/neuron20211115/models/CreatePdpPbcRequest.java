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
 * {@link CreatePdpPbcRequest} extends {@link RequestModel}
 *
 * <p>CreatePdpPbcRequest</p>
 */
public class CreatePdpPbcRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private PdpPbc body;

    private CreatePdpPbcRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePdpPbcRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public PdpPbc getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreatePdpPbcRequest, Builder> {
        private PdpPbc body; 

        private Builder() {
            super();
        } 

        private Builder(CreatePdpPbcRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder body(PdpPbc body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreatePdpPbcRequest build() {
            return new CreatePdpPbcRequest(this);
        } 

    } 

}
