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
 * {@link RevertPdpServiceRequest} extends {@link RequestModel}
 *
 * <p>RevertPdpServiceRequest</p>
 */
public class RevertPdpServiceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private DeploymentRevertCmd body;

    private RevertPdpServiceRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevertPdpServiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public DeploymentRevertCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<RevertPdpServiceRequest, Builder> {
        private DeploymentRevertCmd body; 

        private Builder() {
            super();
        } 

        private Builder(RevertPdpServiceRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(DeploymentRevertCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public RevertPdpServiceRequest build() {
            return new RevertPdpServiceRequest(this);
        } 

    } 

}
