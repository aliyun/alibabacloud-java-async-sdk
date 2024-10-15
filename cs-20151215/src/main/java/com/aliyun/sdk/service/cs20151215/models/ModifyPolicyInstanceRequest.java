// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyPolicyInstanceRequest} extends {@link RequestModel}
 *
 * <p>ModifyPolicyInstanceRequest</p>
 */
public class ModifyPolicyInstanceRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("instance_name")
    private String instanceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("namespaces")
    private java.util.List < String > namespaces;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parameters")
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
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c8155823d057948c69a****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The name of the policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ACKAllowedRepos</p>
         */
        public Builder policyName(String policyName) {
            this.putPathParameter("policy_name", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * <p>The action of the policy. Valid values:</p>
         * <ul>
         * <li><code>deny</code>: Deployments that match the policy are denied.</li>
         * <li><code>warn</code>: Alerts are generated for deployments that match the policy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>deny</p>
         */
        public Builder action(String action) {
            this.putBodyParameter("action", action);
            this.action = action;
            return this;
        }

        /**
         * <p>The ID of the policy instance.</p>
         * 
         * <strong>example:</strong>
         * <p>allowed-repos-cbhhb</p>
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("instance_name", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The namespaces to which the policy is applied. The policy is applied to all namespaces if this parameter is left empty.</p>
         */
        public Builder namespaces(java.util.List < String > namespaces) {
            this.putBodyParameter("namespaces", namespaces);
            this.namespaces = namespaces;
            return this;
        }

        /**
         * <p>The parameters of the policy instance. For more information, see <a href="https://help.aliyun.com/document_detail/359819.html">Predefined security policies of ACK</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;restrictedNamespaces&quot;: [ &quot;test&quot; ]</p>
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
