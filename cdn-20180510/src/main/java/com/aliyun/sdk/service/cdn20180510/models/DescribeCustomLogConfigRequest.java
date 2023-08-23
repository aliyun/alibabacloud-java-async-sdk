// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomLogConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeCustomLogConfigRequest</p>
 */
public class DescribeCustomLogConfigRequest extends Request {
    @Query
    @NameInMap("ConfigId")
    @Validation(required = true)
    private String configId;

    private DescribeCustomLogConfigRequest(Builder builder) {
        super(builder);
        this.configId = builder.configId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomLogConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configId
     */
    public String getConfigId() {
        return this.configId;
    }

    public static final class Builder extends Request.Builder<DescribeCustomLogConfigRequest, Builder> {
        private String configId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCustomLogConfigRequest request) {
            super(request);
            this.configId = request.configId;
        } 

        /**
         * The ID of the custom configuration.
         */
        public Builder configId(String configId) {
            this.putQueryParameter("ConfigId", configId);
            this.configId = configId;
            return this;
        }

        @Override
        public DescribeCustomLogConfigRequest build() {
            return new DescribeCustomLogConfigRequest(this);
        } 

    } 

}
