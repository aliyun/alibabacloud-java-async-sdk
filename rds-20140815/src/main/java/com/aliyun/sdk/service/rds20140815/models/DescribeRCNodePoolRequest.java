// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeRCNodePoolRequest} extends {@link RequestModel}
 *
 * <p>DescribeRCNodePoolRequest</p>
 */
public class DescribeRCNodePoolRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodePoolId")
    private String nodePoolId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DescribeRCNodePoolRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.nodePoolId = builder.nodePoolId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRCNodePoolRequest create() {
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

    /**
     * @return nodePoolId
     */
    public String getNodePoolId() {
        return this.nodePoolId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeRCNodePoolRequest, Builder> {
        private String clusterId; 
        private String nodePoolId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRCNodePoolRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.nodePoolId = request.nodePoolId;
            this.regionId = request.regionId;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * NodePoolId.
         */
        public Builder nodePoolId(String nodePoolId) {
            this.putQueryParameter("NodePoolId", nodePoolId);
            this.nodePoolId = nodePoolId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeRCNodePoolRequest build() {
            return new DescribeRCNodePoolRequest(this);
        } 

    } 

}
