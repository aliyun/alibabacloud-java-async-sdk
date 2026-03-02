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
 * {@link CreatePdpLaneRequest} extends {@link RequestModel}
 *
 * <p>CreatePdpLaneRequest</p>
 */
public class CreatePdpLaneRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private PdpLaneCreateCmd body;

    private CreatePdpLaneRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePdpLaneRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public PdpLaneCreateCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreatePdpLaneRequest, Builder> {
        private PdpLaneCreateCmd body; 

        private Builder() {
            super();
        } 

        private Builder(CreatePdpLaneRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder body(PdpLaneCreateCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreatePdpLaneRequest build() {
            return new CreatePdpLaneRequest(this);
        } 

    } 

}
