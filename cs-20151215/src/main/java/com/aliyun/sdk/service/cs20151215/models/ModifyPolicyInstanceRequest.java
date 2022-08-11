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
    @NameInMap("cluster_id")
    @Validation(required = true)
    private String clusterId;

    @Path
    @NameInMap("policy_name")
    @Validation(required = true)
    private String policyName;

    @Body
    @NameInMap("action")
    private String action;

    @Body
    @NameInMap("instance_name")
    private String instanceName;

    @Body
    @NameInMap("namespaces")
    private java.util.List < String > namespaces;

    @Body
    @NameInMap("parameters")
    private java.util.Map < String, ? > parameters;

    private ModifyPolicyInstanceRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.policyName = builder.policyName;
        this.action = builder.action;
        this.instanceName = builder.instanceName;
        this.namespaces = builder.namespaces;
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
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
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

    public static final class Builder extends Request.Builder<ModifyPolicyInstanceRequest, Builder> {
        private String clusterId; 
        private String policyName; 
        private String action; 
        private String instanceName; 
        private java.util.List < String > namespaces; 
        private java.util.Map < String, ? > parameters; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPolicyInstanceRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.policyName = request.policyName;
            this.action = request.action;
            this.instanceName = request.instanceName;
            this.namespaces = request.namespaces;
            this.parameters = request.parameters;
        } 

        /**
         * 目标集群id
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 策略治理规则名称
         */
        public Builder policyName(String policyName) {
            this.putPathParameter("policy_name", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * 规则治理动作
         */
        public Builder action(String action) {
            this.putBodyParameter("action", action);
            this.action = action;
            return this;
        }

        /**
         * 策略规则实例id
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("instance_name", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * 限制策略实施的命名空间，为空时表示所有命名空间
         */
        public Builder namespaces(java.util.List < String > namespaces) {
            this.putBodyParameter("namespaces", namespaces);
            this.namespaces = namespaces;
            return this;
        }

        /**
         * 当前规则实例的配置参数
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
