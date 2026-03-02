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
 * {@link UpdatePdpConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdatePdpConfigRequest</p>
 */
public class UpdatePdpConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private PdpConfigUpdateCmd body;

    private UpdatePdpConfigRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePdpConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public PdpConfigUpdateCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdatePdpConfigRequest, Builder> {
        private PdpConfigUpdateCmd body; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePdpConfigRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder body(PdpConfigUpdateCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdatePdpConfigRequest build() {
            return new UpdatePdpConfigRequest(this);
        } 

    } 

}
