// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScaleClusterNodePoolRequest} extends {@link RequestModel}
 *
 * <p>ScaleClusterNodePoolRequest</p>
 */
public class ScaleClusterNodePoolRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Path
    @NameInMap("NodepoolId")
    @Validation(required = true)
    private String nodepoolId;

    @Body
    @NameInMap("count")
    private Long count;

    private ScaleClusterNodePoolRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.nodepoolId = builder.nodepoolId;
        this.count = builder.count;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScaleClusterNodePoolRequest create() {
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

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    public static final class Builder extends Request.Builder<ScaleClusterNodePoolRequest, Builder> {
        private String clusterId; 
        private String nodepoolId; 
        private Long count; 

        private Builder() {
            super();
        } 

        private Builder(ScaleClusterNodePoolRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.nodepoolId = request.nodepoolId;
            this.count = request.count;
        } 

        /**
         * 集群ID
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 节点池ID
         */
        public Builder nodepoolId(String nodepoolId) {
            this.putPathParameter("NodepoolId", nodepoolId);
            this.nodepoolId = nodepoolId;
            return this;
        }

        /**
         * 扩容节点数量
         */
        public Builder count(Long count) {
            this.putBodyParameter("count", count);
            this.count = count;
            return this;
        }

        @Override
        public ScaleClusterNodePoolRequest build() {
            return new ScaleClusterNodePoolRequest(this);
        } 

    } 

}
