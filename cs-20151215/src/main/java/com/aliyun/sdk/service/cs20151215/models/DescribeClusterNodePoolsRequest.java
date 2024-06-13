// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterNodePoolsRequest} extends {@link RequestModel}
 *
 * <p>DescribeClusterNodePoolsRequest</p>
 */
public class DescribeClusterNodePoolsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodepoolName")
    private String nodepoolName;

    private DescribeClusterNodePoolsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.nodepoolName = builder.nodepoolName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterNodePoolsRequest create() {
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
     * @return nodepoolName
     */
    public String getNodepoolName() {
        return this.nodepoolName;
    }

    public static final class Builder extends Request.Builder<DescribeClusterNodePoolsRequest, Builder> {
        private String clusterId; 
        private String nodepoolName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClusterNodePoolsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.nodepoolName = request.nodepoolName;
        } 

        /**
         * The ID of the cluster that you want to query.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 节点池名称。
         */
        public Builder nodepoolName(String nodepoolName) {
            this.putQueryParameter("NodepoolName", nodepoolName);
            this.nodepoolName = nodepoolName;
            return this;
        }

        @Override
        public DescribeClusterNodePoolsRequest build() {
            return new DescribeClusterNodePoolsRequest(this);
        } 

    } 

}
