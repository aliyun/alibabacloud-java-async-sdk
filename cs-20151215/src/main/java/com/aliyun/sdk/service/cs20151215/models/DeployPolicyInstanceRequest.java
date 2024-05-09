// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeployPolicyInstanceRequest} extends {@link RequestModel}
 *
 * <p>DeployPolicyInstanceRequest</p>
 */
public class DeployPolicyInstanceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("cluster_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("policy_name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("action")
    private String action;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("namespaces")
    private java.util.List < String > namespaces;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parameters")
    private java.util.Map < String, ? > parameters;

    private DeployPolicyInstanceRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.policyName = builder.policyName;
        this.action = builder.action;
        this.namespaces = builder.namespaces;
        this.parameters = builder.parameters;
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
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    /**
     * @return namespaces
     */
    public java.util.List < String > getNamespaces() {
        return this.namespaces;
    }

    /**
     * @return parameters
     */
    public java.util.Map < String, ? > getParameters() {
        return this.parameters;
    }

    public static final class Builder extends Request.Builder<DeployPolicyInstanceRequest, Builder> {
        private String clusterId; 
        private String policyName; 
        private String action; 
        private java.util.List < String > namespaces; 
        private java.util.Map < String, ? > parameters; 

        private Builder() {
            super();
        } 

        private Builder(DeployPolicyInstanceRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.policyName = request.policyName;
            this.action = request.action;
            this.namespaces = request.namespaces;
            this.parameters = request.parameters;
        } 

        /**
         * The ID of the cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The name of the policy.
         */
        public Builder policyName(String policyName) {
            this.putPathParameter("policy_name", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * The action of the policy. Valid values:
         * <p>
         * 
         * *   `deny`: Deployments that match the policy are denied.
         * *   `warn`: Alerts are generated for Deployments that match the policy.
         */
        public Builder action(String action) {
            this.putBodyParameter("action", action);
            this.action = action;
            return this;
        }

        /**
         * The applicable scope of the policy instance. If you leave this parameter empty, the policy instance is applicable to all namespaces.
         */
        public Builder namespaces(java.util.List < String > namespaces) {
            this.putBodyParameter("namespaces", namespaces);
            this.namespaces = namespaces;
            return this;
        }

        /**
         * The parameters of the policy instance.
         */
        public Builder parameters(java.util.Map < String, ? > parameters) {
            this.putBodyParameter("parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        @Override
        public DeployPolicyInstanceRequest build() {
            return new DeployPolicyInstanceRequest(this);
        } 

    } 

}
