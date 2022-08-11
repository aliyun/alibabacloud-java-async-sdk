// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterNodePoolDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeClusterNodePoolDetailRequest</p>
 */
public class DescribeClusterNodePoolDetailRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Path
    @NameInMap("NodepoolId")
    @Validation(required = true)
    private String nodepoolId;

    private DescribeClusterNodePoolDetailRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.nodepoolId = builder.nodepoolId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterNodePoolDetailRequest create() {
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
     * @return nodepoolId
     */
    public String getNodepoolId() {
        return this.nodepoolId;
    }

    public static final class Builder extends Request.Builder<DescribeClusterNodePoolDetailRequest, Builder> {
        private String clusterId; 
        private String nodepoolId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClusterNodePoolDetailRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.nodepoolId = request.nodepoolId;
        } 

        /**
         * 集群ID。
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 节点池ID。
         */
        public Builder nodepoolId(String nodepoolId) {
            this.putPathParameter("NodepoolId", nodepoolId);
            this.nodepoolId = nodepoolId;
            return this;
        }

        @Override
        public DescribeClusterNodePoolDetailRequest build() {
            return new DescribeClusterNodePoolDetailRequest(this);
        } 

    } 

}
