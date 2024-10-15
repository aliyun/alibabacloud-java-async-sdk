// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeletePolicyInstanceRequest} extends {@link RequestModel}
 *
 * <p>DeletePolicyInstanceRequest</p>
 */
public class DeletePolicyInstanceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("cluster_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("policy_name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instance_name")
    private String instanceName;

    private DeletePolicyInstanceRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.policyName = builder.policyName;
        this.instanceName = builder.instanceName;
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
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    public static final class Builder extends Request.Builder<DeletePolicyInstanceRequest, Builder> {
        private String clusterId; 
        private String policyName; 
        private String instanceName; 

        private Builder() {
            super();
        } 

        private Builder(DeletePolicyInstanceRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.policyName = request.policyName;
            this.instanceName = request.instanceName;
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
         * <p>The ID of the policy instance.</p>
         * 
         * <strong>example:</strong>
         * <p>allowed-repos-mqdsf</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("instance_name", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        @Override
        public DeletePolicyInstanceRequest build() {
            return new DeletePolicyInstanceRequest(this);
        } 

    } 

}
