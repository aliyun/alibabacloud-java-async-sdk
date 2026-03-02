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
 * {@link CreateSettledRequest} extends {@link RequestModel}
 *
 * <p>CreateSettledRequest</p>
 */
public class CreateSettledRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private SettledCreateCmd body;

    private CreateSettledRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSettledRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public SettledCreateCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateSettledRequest, Builder> {
        private SettledCreateCmd body; 

        private Builder() {
            super();
        } 

        private Builder(CreateSettledRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(SettledCreateCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateSettledRequest build() {
            return new CreateSettledRequest(this);
        } 

    } 

}
