// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TransformClusterMemberRequest} extends {@link RequestModel}
 *
 * <p>TransformClusterMemberRequest</p>
 */
public class TransformClusterMemberRequest extends Request {
    @Query
    @NameInMap("InstanceIds")
    @Validation(required = true)
    private String instanceIds;

    @Query
    @NameInMap("Password")
    @Validation(required = true)
    private String password;

    @Query
    @NameInMap("TargetClusterId")
    @Validation(required = true)
    private String targetClusterId;

    private TransformClusterMemberRequest(Builder builder) {
        super(builder);
        this.instanceIds = builder.instanceIds;
        this.password = builder.password;
        this.targetClusterId = builder.targetClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransformClusterMemberRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return targetClusterId
     */
    public String getTargetClusterId() {
        return this.targetClusterId;
    }

    public static final class Builder extends Request.Builder<TransformClusterMemberRequest, Builder> {
        private String instanceIds; 
        private String password; 
        private String targetClusterId; 

        private Builder() {
            super();
        } 

        private Builder(TransformClusterMemberRequest request) {
            super(request);
            this.instanceIds = request.instanceIds;
            this.password = request.password;
            this.targetClusterId = request.targetClusterId;
        } 

        /**
         * The ID of the instance that you want to import or migrate. Separate multiple IDs with commas (,).
         * <p>
         * 
         * *   An instance may not belong to a cluster, but an instance can belong to only one cluster at most.
         * *   The ECS instances and the destination cluster must be in the same virtual private cloud (VPC).
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * The logon password of the ECS instance that you want to import or migrate to the cluster.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * The ID of the destination cluster.
         */
        public Builder targetClusterId(String targetClusterId) {
            this.putQueryParameter("TargetClusterId", targetClusterId);
            this.targetClusterId = targetClusterId;
            return this;
        }

        @Override
        public TransformClusterMemberRequest build() {
            return new TransformClusterMemberRequest(this);
        } 

    } 

}
