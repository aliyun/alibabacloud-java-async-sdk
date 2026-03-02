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
 * {@link CreatePbcInstructionRequest} extends {@link RequestModel}
 *
 * <p>CreatePbcInstructionRequest</p>
 */
public class CreatePbcInstructionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private PbcInstructionCreateCmd body;

    private CreatePbcInstructionRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePbcInstructionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public PbcInstructionCreateCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreatePbcInstructionRequest, Builder> {
        private PbcInstructionCreateCmd body; 

        private Builder() {
            super();
        } 

        private Builder(CreatePbcInstructionRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(PbcInstructionCreateCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreatePbcInstructionRequest build() {
            return new CreatePbcInstructionRequest(this);
        } 

    } 

}
