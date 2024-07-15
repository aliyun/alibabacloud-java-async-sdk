// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Uid.
         */
        public Builder uid(String uid) {
            this.putPathParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * Force.
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
