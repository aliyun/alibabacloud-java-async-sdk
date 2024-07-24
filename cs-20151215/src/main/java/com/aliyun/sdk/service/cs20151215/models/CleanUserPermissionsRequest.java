// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < String > clusterIds;

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
    public java.util.List < String > getClusterIds() {
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
        private java.util.List < String > clusterIds; 
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
         * The ID of the specified Resource Access Management (RAM) user or RAM role within the Alibaba Cloud account.
         */
        public Builder uid(String uid) {
            this.putPathParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * The cluster IDs.
         * <p>
         * 
         * *   If cluster IDs are specified, only the kubeconfig files of the specified clusters and the relevant RBAC permissions are deleted and revoked.
         */
        public Builder clusterIds(java.util.List < String > clusterIds) {
            String clusterIdsShrink = shrink(clusterIds, "ClusterIds", "simple");
            this.putQueryParameter("ClusterIds", clusterIdsShrink);
            this.clusterIds = clusterIds;
            return this;
        }

        /**
         * Specifies whether to forcefully delete the specified kubeconfig files. Valid values:
         * <p>
         * 
         * *   **false** (default): checks the cluster access records within the previous seven days before deleting the kubeconfig files. The kubeconfig files are not deleted if cluster access records are found or fail to be retrieved.
         * *   **true**: forcefully deletes the kubeconfig files without checking cluster access records.
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
