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
 * {@link ObtainMqConsoleLinkRequest} extends {@link RequestModel}
 *
 * <p>ObtainMqConsoleLinkRequest</p>
 */
public class ObtainMqConsoleLinkRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private ObtainMqConsoleLinkCmd body;

    private ObtainMqConsoleLinkRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ObtainMqConsoleLinkRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public ObtainMqConsoleLinkCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<ObtainMqConsoleLinkRequest, Builder> {
        private ObtainMqConsoleLinkCmd body; 

        private Builder() {
            super();
        } 

        private Builder(ObtainMqConsoleLinkRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(ObtainMqConsoleLinkCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public ObtainMqConsoleLinkRequest build() {
            return new ObtainMqConsoleLinkRequest(this);
        } 

    } 

}
