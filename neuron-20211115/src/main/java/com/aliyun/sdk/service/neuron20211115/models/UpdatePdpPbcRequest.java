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
 * {@link UpdatePdpPbcRequest} extends {@link RequestModel}
 *
 * <p>UpdatePdpPbcRequest</p>
 */
public class UpdatePdpPbcRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private PdpPbcUpdateCmd body;

    private UpdatePdpPbcRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePdpPbcRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public PdpPbcUpdateCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdatePdpPbcRequest, Builder> {
        private PdpPbcUpdateCmd body; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePdpPbcRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(PdpPbcUpdateCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdatePdpPbcRequest build() {
            return new UpdatePdpPbcRequest(this);
        } 

    } 

}
