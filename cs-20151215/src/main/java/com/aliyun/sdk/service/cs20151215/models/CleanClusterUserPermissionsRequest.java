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
 * {@link CleanClusterUserPermissionsRequest} extends {@link RequestModel}
 *
 * <p>CleanClusterUserPermissionsRequest</p>
 */
public class CleanClusterUserPermissionsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("Uid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Force")
    private Boolean force;

    private CleanClusterUserPermissionsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.uid = builder.uid;
        this.force = builder.force;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CleanClusterUserPermissionsRequest create() {
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
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    public static final class Builder extends Request.Builder<CleanClusterUserPermissionsRequest, Builder> {
        private String clusterId; 
        private String uid; 
        private Boolean force; 

        private Builder() {
            super();
        } 

        private Builder(CleanClusterUserPermissionsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.uid = request.uid;
            this.force = request.force;
        } 

        /**
         * <p>The ID of the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c5b5e80b0b64a4bf6939d2d8fbbc5****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The ID of the specified Resource Access Management (RAM) user or RAM role within the Alibaba Cloud account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2xxxxxxxxxxxxxxxxxx</p>
         */
        public Builder uid(String uid) {
            this.putPathParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * <p>Specifies whether to forcefully delete the specified kubeconfig files. Valid values:</p>
         * <ul>
         * <li>false (default): checks the cluster access records within the previous seven days before deleting the kubeconfig files. The kubeconfig files are not deleted if cluster access records are found or fail to be retrieved.</li>
         * <li>true: forcefully deletes the kubeconfig files without checking the cluster access records.</li>
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
        public CleanClusterUserPermissionsRequest build() {
            return new CleanClusterUserPermissionsRequest(this);
        } 

    } 

}
