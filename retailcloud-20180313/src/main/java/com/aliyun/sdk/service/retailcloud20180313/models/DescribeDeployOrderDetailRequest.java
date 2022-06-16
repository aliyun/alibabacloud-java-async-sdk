// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeployOrderDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeDeployOrderDetailRequest</p>
 */
public class DescribeDeployOrderDetailRequest extends Request {
    @Query
    @NameInMap("DeployOrderId")
    @Validation(required = true)
    private Long deployOrderId;

    private DescribeDeployOrderDetailRequest(Builder builder) {
        super(builder);
        this.deployOrderId = builder.deployOrderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeployOrderDetailRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDeployOrderDetailRequest, Builder> {
        private Long deployOrderId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDeployOrderDetailRequest request) {
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
        public DescribeDeployOrderDetailRequest build() {
            return new DescribeDeployOrderDetailRequest(this);
        } 

    } 

}
