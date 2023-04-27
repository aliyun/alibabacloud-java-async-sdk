// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePolicyInstanceRequest} extends {@link RequestModel}
 *
 * <p>DeletePolicyInstanceRequest</p>
 */
public class DeletePolicyInstanceRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("ClusterIds")
    private java.util.List < String > clusterIds;

    @Query
    @NameInMap("PolicyName")
    @Validation(required = true)
    private String policyName;

    private DeletePolicyInstanceRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.clusterIds = builder.clusterIds;
        this.policyName = builder.policyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePolicyInstanceRequest create() {
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
     * @return clusterIds
     */
    public java.util.List < String > getClusterIds() {
        return this.clusterIds;
    }

    /**
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    public static final class Builder extends Request.Builder<DeletePolicyInstanceRequest, Builder> {
        private String clusterId; 
        private java.util.List < String > clusterIds; 
        private String policyName; 

        private Builder() {
            super();
        } 

        private Builder(DeletePolicyInstanceRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.clusterIds = request.clusterIds;
            this.policyName = request.policyName;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ClusterIds.
         */
        public Builder clusterIds(java.util.List < String > clusterIds) {
            String clusterIdsShrink = shrink(clusterIds, "ClusterIds", "json");
            this.putQueryParameter("ClusterIds", clusterIdsShrink);
            this.clusterIds = clusterIds;
            return this;
        }

        /**
         * PolicyName.
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        @Override
        public DeletePolicyInstanceRequest build() {
            return new DeletePolicyInstanceRequest(this);
        } 

    } 

}
