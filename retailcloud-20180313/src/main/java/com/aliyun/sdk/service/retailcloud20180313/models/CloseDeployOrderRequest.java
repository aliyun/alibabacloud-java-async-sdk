// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloseDeployOrderRequest} extends {@link RequestModel}
 *
 * <p>CloseDeployOrderRequest</p>
 */
public class CloseDeployOrderRequest extends Request {
    @Query
    @NameInMap("DeployOrderId")
    @Validation(required = true)
    private Long deployOrderId;

    private CloseDeployOrderRequest(Builder builder) {
        super(builder);
        this.deployOrderId = builder.deployOrderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloseDeployOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deployOrderId
     */
    public Long getDeployOrderId() {
        return this.deployOrderId;
    }

    public static final class Builder extends Request.Builder<CloseDeployOrderRequest, Builder> {
        private Long deployOrderId; 

        private Builder() {
            super();
        } 

        private Builder(CloseDeployOrderRequest request) {
            super(request);
            this.deployOrderId = request.deployOrderId;
        } 

        /**
         * DeployOrderId.
         */
        public Builder deployOrderId(Long deployOrderId) {
            this.putQueryParameter("DeployOrderId", deployOrderId);
            this.deployOrderId = deployOrderId;
            return this;
        }

        @Override
        public CloseDeployOrderRequest build() {
            return new CloseDeployOrderRequest(this);
        } 

    } 

}
