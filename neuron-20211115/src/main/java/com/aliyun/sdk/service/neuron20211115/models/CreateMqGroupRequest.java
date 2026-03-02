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
 * {@link CreateMqGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateMqGroupRequest</p>
 */
public class CreateMqGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private MqGroupCreateCmd body;

    private CreateMqGroupRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMqGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public MqGroupCreateCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateMqGroupRequest, Builder> {
        private MqGroupCreateCmd body; 

        private Builder() {
            super();
        } 

        private Builder(CreateMqGroupRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(MqGroupCreateCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateMqGroupRequest build() {
            return new CreateMqGroupRequest(this);
        } 

    } 

}
