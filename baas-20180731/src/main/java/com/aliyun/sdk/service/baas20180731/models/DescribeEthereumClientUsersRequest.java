// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEthereumClientUsersRequest} extends {@link RequestModel}
 *
 * <p>DescribeEthereumClientUsersRequest</p>
 */
public class DescribeEthereumClientUsersRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("NodeId")
    @Validation(required = true)
    private String nodeId;

    private DescribeEthereumClientUsersRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.nodeId = builder.nodeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEthereumClientUsersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    public static final class Builder extends Request.Builder<DescribeEthereumClientUsersRequest, Builder> {
        private String regionId; 
        private String nodeId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEthereumClientUsersRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.nodeId = request.nodeId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * NodeId.
         */
        public Builder nodeId(String nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        @Override
        public DescribeEthereumClientUsersRequest build() {
            return new DescribeEthereumClientUsersRequest(this);
        } 

    } 

}
