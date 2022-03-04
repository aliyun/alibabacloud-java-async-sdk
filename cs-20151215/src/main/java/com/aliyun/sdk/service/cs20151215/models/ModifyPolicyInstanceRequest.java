// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPolicyInstanceRequest} extends {@link RequestModel}
 *
 * <p>ModifyPolicyInstanceRequest</p>
 */
public class ModifyPolicyInstanceRequest extends Request {
    @Path
    @NameInMap("policy_name")
    @Validation(required = true)
    private String policyName;

    @Path
    @NameInMap("cluster_id")
    @Validation(required = true)
    private String clusterId;

    @Body
    @NameInMap("action")
    private String action;

    @Body
    @NameInMap("instance_name")
    private String instanceName;

    @Body
    @NameInMap("namespace")
    private String namespace;

    @Body
    @NameInMap("parameters")
    private java.util.Map < String, ? > parameters;

    private ModifyPolicyInstanceRequest(Builder builder) {
        super(builder);
        this.policyName = builder.policyName;
        this.clusterId = builder.clusterId;
        this.action = builder.action;
        this.instanceName = builder.instanceName;
        this.namespace = builder.namespace;
        this.parameters = builder.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPolicyInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return parameters
     */
    public java.util.Map < String, ? > getParameters() {
        return this.parameters;
    }

    public static final class Builder extends Request.Builder<ModifyPolicyInstanceRequest, Builder> {
        private String policyName; 
        private String clusterId; 
        private String action; 
        private String instanceName; 
        private String namespace; 
        private java.util.Map < String, ? > parameters; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPolicyInstanceRequest request) {
            super(request);
            this.policyName = request.policyName;
            this.clusterId = request.clusterId;
            this.action = request.action;
            this.instanceName = request.instanceName;
            this.namespace = request.namespace;
            this.parameters = request.parameters;
        } 

        /**
         * Policy governance rule name
         */
        public Builder policyName(String policyName) {
            this.putPathParameter("policy_name", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * The ID of the target cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The rule governance action. Valid values:
         * <p>
         * 
         * -"Denounced: intercepts illegal deployment.
         * -"Ware": alerts
         */
        public Builder action(String action) {
            this.putBodyParameter("action", action);
            this.action = action;
            return this;
        }

        /**
         * The ID of the policy rule instance.
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("instance_name", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * Policy instance implementation scope:
         * <p>
         * The default value "" indicates all namespaces in the cluster.
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * Configuration parameters of the current rule instance
         */
        public Builder parameters(java.util.Map < String, ? > parameters) {
            this.putBodyParameter("parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        @Override
        public ModifyPolicyInstanceRequest build() {
            return new ModifyPolicyInstanceRequest(this);
        } 

    } 

}
