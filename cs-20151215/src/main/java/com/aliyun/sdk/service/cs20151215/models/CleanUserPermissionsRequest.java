// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link CleanUserPermissionsRequest} extends {@link RequestModel}
 *
 * <p>CleanUserPermissionsRequest</p>
 */
public class CleanUserPermissionsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("Uid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterIds")
    private java.util.List<String> clusterIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Force")
    private Boolean force;

    private CleanUserPermissionsRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.clusterIds = builder.clusterIds;
        this.force = builder.force;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CleanUserPermissionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return clusterIds
     */
    public java.util.List<String> getClusterIds() {
        return this.clusterIds;
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    public static final class Builder extends Request.Builder<CleanUserPermissionsRequest, Builder> {
        private String uid; 
        private java.util.List<String> clusterIds; 
        private Boolean force; 

        private Builder() {
            super();
        } 

        private Builder(CleanUserPermissionsRequest request) {
            super(request);
            this.uid = request.uid;
            this.clusterIds = request.clusterIds;
            this.force = request.force;
        } 

        /**
         * <p>The ID of the specified Resource Access Management (RAM) user or RAM role within the Alibaba Cloud account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>26562443851650****</p>
         */
        public Builder uid(String uid) {
            this.putPathParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * <p>The list of cluster IDs. If this list is specified, only the KubeConfig credentials and RBAC permissions of the current user in the specified clusters are cleaned up.</p>
         */
        public Builder clusterIds(java.util.List<String> clusterIds) {
            String clusterIdsShrink = shrink(clusterIds, "ClusterIds", "simple");
            this.putQueryParameter("ClusterIds", clusterIdsShrink);
            this.clusterIds = clusterIds;
            return this;
        }

        /**
         * <p>Specifies whether to force delete the specified KubeConfig. Valid values:</p>
         * <ul>
         * <li>false (default): Before deleting the KubeConfig, the system checks whether cluster access records exist within the last seven days. If access records exist or cannot be retrieved, the deletion is not allowed.</li>
         * <li>true: Force deletes the KubeConfig without checking cluster access records.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        @Override
        public CleanUserPermissionsRequest build() {
            return new CleanUserPermissionsRequest(this);
        } 

    } 

}
