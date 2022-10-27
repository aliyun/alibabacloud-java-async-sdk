// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageGatewayConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageGatewayConfigRequest</p>
 */
public class DescribeImageGatewayConfigRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    private DescribeImageGatewayConfigRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageGatewayConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    public static final class Builder extends Request.Builder<DescribeImageGatewayConfigRequest, Builder> {
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImageGatewayConfigRequest request) {
            super(request);
            this.clusterId = request.clusterId;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        @Override
        public DescribeImageGatewayConfigRequest build() {
            return new DescribeImageGatewayConfigRequest(this);
        } 

    } 

}
