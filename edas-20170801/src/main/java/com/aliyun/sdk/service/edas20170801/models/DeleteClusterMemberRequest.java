// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link DeleteClusterMemberRequest} extends {@link RequestModel}
 *
 * <p>DeleteClusterMemberRequest</p>
 */
public class DeleteClusterMemberRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterMemberId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterMemberId;

    private DeleteClusterMemberRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.clusterMemberId = builder.clusterMemberId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteClusterMemberRequest create() {
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
     * @return clusterMemberId
     */
    public String getClusterMemberId() {
        return this.clusterMemberId;
    }

    public static final class Builder extends Request.Builder<DeleteClusterMemberRequest, Builder> {
        private String clusterId; 
        private String clusterMemberId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteClusterMemberRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.clusterMemberId = request.clusterMemberId;
        } 

        /**
         * <p>The ID of the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>52984524-<strong><strong>-</strong></strong>-85f2-a34b0e5bb521</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The member ID of the ECS instance that you want to remove from the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-2zej4i2jdf3****jigng</p>
         */
        public Builder clusterMemberId(String clusterMemberId) {
            this.putQueryParameter("ClusterMemberId", clusterMemberId);
            this.clusterMemberId = clusterMemberId;
            return this;
        }

        @Override
        public DeleteClusterMemberRequest build() {
            return new DeleteClusterMemberRequest(this);
        } 

    } 

}
