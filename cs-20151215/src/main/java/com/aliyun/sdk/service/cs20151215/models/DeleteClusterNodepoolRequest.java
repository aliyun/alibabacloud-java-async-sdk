// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteClusterNodepoolRequest} extends {@link RequestModel}
 *
 * <p>DeleteClusterNodepoolRequest</p>
 */
public class DeleteClusterNodepoolRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Path
    @NameInMap("NodepoolId")
    @Validation(required = true)
    private String nodepoolId;

    @Query
    @NameInMap("force")
    private Boolean force;

    private DeleteClusterNodepoolRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.nodepoolId = builder.nodepoolId;
        this.force = builder.force;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteClusterNodepoolRequest create() {
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
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    public static final class Builder extends Request.Builder<DeleteClusterNodepoolRequest, Builder> {
        private String clusterId; 
        private String nodepoolId; 
        private Boolean force; 

        private Builder() {
            super();
        } 

        private Builder(DeleteClusterNodepoolRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.nodepoolId = request.nodepoolId;
            this.force = request.force;
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
         * 节点池ID。
         */
        public Builder nodepoolId(String nodepoolId) {
            this.putPathParameter("NodepoolId", nodepoolId);
            this.nodepoolId = nodepoolId;
            return this;
        }

        /**
         * 是否强制删除。
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("force", force);
            this.force = force;
            return this;
        }

        @Override
        public DeleteClusterNodepoolRequest build() {
            return new DeleteClusterNodepoolRequest(this);
        } 

    } 

}
