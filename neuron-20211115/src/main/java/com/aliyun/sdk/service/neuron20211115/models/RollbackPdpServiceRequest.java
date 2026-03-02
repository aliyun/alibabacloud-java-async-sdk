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
 * {@link RollbackPdpServiceRequest} extends {@link RequestModel}
 *
 * <p>RollbackPdpServiceRequest</p>
 */
public class RollbackPdpServiceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private DeploymentRollbackCmd body;

    private RollbackPdpServiceRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RollbackPdpServiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public DeploymentRollbackCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<RollbackPdpServiceRequest, Builder> {
        private DeploymentRollbackCmd body; 

        private Builder() {
            super();
        } 

        private Builder(RollbackPdpServiceRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder body(DeploymentRollbackCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public RollbackPdpServiceRequest build() {
            return new RollbackPdpServiceRequest(this);
        } 

    } 

}
