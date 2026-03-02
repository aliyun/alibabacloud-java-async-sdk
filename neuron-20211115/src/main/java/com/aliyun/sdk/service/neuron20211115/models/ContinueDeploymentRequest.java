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
 * {@link ContinueDeploymentRequest} extends {@link RequestModel}
 *
 * <p>ContinueDeploymentRequest</p>
 */
public class ContinueDeploymentRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private DeploymentContinueCmd body;

    private ContinueDeploymentRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ContinueDeploymentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public DeploymentContinueCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<ContinueDeploymentRequest, Builder> {
        private DeploymentContinueCmd body; 

        private Builder() {
            super();
        } 

        private Builder(ContinueDeploymentRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder body(DeploymentContinueCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public ContinueDeploymentRequest build() {
            return new ContinueDeploymentRequest(this);
        } 

    } 

}
