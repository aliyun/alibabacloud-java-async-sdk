// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeployPolicyInstanceRequest} extends {@link RequestModel}
 *
 * <p>DeployPolicyInstanceRequest</p>
 */
public class DeployPolicyInstanceRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("ClusterIds")
    @Validation(required = true)
    private java.util.List < String > clusterIds;

    @Query
    @NameInMap("Namespaces")
    private java.util.List < String > namespaces;

    @Query
    @NameInMap("PolicyAction")
    @Validation(required = true)
    private String policyAction;

    @Query
    @NameInMap("PolicyName")
    @Validation(required = true)
    private String policyName;

    private DeployPolicyInstanceRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.clusterIds = builder.clusterIds;
        this.namespaces = builder.namespaces;
        this.policyAction = builder.policyAction;
        this.policyName = builder.policyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeployPolicyInstanceRequest create() {
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
     * @return namespaces
     */
    public java.util.List < String > getNamespaces() {
        return this.namespaces;
    }

    /**
     * @return policyAction
     */
    public String getPolicyAction() {
        return this.policyAction;
    }

    /**
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    public static final class Builder extends Request.Builder<DeployPolicyInstanceRequest, Builder> {
        private String clusterId; 
        private java.util.List < String > clusterIds; 
        private java.util.List < String > namespaces; 
        private String policyAction; 
        private String policyName; 

        private Builder() {
            super();
        } 

        private Builder(DeployPolicyInstanceRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.clusterIds = request.clusterIds;
            this.namespaces = request.namespaces;
            this.policyAction = request.policyAction;
            this.policyName = request.policyName;
        } 

        /**
         * The ID of the master instance.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * An array of JSON strings. The JSON strings in the array indicate the IDs of the associated clusters in which the policy instance is deployed.
         */
        public Builder clusterIds(java.util.List < String > clusterIds) {
            String clusterIdsShrink = shrink(clusterIds, "ClusterIds", "json");
            this.putQueryParameter("ClusterIds", clusterIdsShrink);
            this.clusterIds = clusterIds;
            return this;
        }

        /**
         * A list of namespaces.
         */
        public Builder namespaces(java.util.List < String > namespaces) {
            String namespacesShrink = shrink(namespaces, "Namespaces", "json");
            this.putQueryParameter("Namespaces", namespacesShrink);
            this.namespaces = namespaces;
            return this;
        }

        /**
         * The action of the policy. Valid values:
         * <p>
         * 
         * *   deny: blocks deployments that match the policy.
         * *   warn: generates alerts for deployments that match the policy.
         */
        public Builder policyAction(String policyAction) {
            this.putQueryParameter("PolicyAction", policyAction);
            this.policyAction = policyAction;
            return this;
        }

        /**
         * The name of the policy.
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        @Override
        public DeployPolicyInstanceRequest build() {
            return new DeployPolicyInstanceRequest(this);
        } 

    } 

}
