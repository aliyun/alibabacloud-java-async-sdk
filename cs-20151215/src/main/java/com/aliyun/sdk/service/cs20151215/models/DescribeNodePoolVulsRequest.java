// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNodePoolVulsRequest} extends {@link RequestModel}
 *
 * <p>DescribeNodePoolVulsRequest</p>
 */
public class DescribeNodePoolVulsRequest extends Request {
    @Path
    @NameInMap("cluster_id")
    @Validation(required = true)
    private String clusterId;

    @Path
    @NameInMap("nodepool_id")
    @Validation(required = true)
    private String nodepoolId;

    private DescribeNodePoolVulsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.nodepoolId = builder.nodepoolId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNodePoolVulsRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeNodePoolVulsRequest, Builder> {
        private String clusterId; 
        private String nodepoolId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNodePoolVulsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.nodepoolId = request.nodepoolId;
        } 

        /**
         * cluster_id.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * nodepool_id.
         */
        public Builder nodepoolId(String nodepoolId) {
            this.putPathParameter("nodepool_id", nodepoolId);
            this.nodepoolId = nodepoolId;
            return this;
        }

        @Override
        public DescribeNodePoolVulsRequest build() {
            return new DescribeNodePoolVulsRequest(this);
        } 

    } 

}
