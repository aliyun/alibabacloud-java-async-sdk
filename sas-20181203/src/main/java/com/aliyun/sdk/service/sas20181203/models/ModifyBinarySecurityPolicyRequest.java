// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ModifyBinarySecurityPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyBinarySecurityPolicyRequest</p>
 */
public class ModifyBinarySecurityPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Clusters")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Policy")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ModifyBinarySecurityPolicyRequest(Builder builder) {
        super(builder);
        this.clusters = builder.clusters;
        this.name = builder.name;
        this.policy = builder.policy;
        this.remark = builder.remark;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceIp = builder.sourceIp;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBinarySecurityPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusters
     */
    public String getClusters() {
        return this.clusters;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ModifyBinarySecurityPolicyRequest, Builder> {
        private String clusters; 
        private String name; 
        private String policy; 
        private String remark; 
        private Long resourceOwnerId; 
        private String sourceIp; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBinarySecurityPolicyRequest request) {
            super(request);
            this.clusters = request.clusters;
            this.name = request.name;
            this.policy = request.policy;
            this.remark = request.remark;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sourceIp = request.sourceIp;
            this.status = request.status;
        } 

        /**
         * <p>Cluster information.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Namespaces&quot;:[&quot;default&quot;],&quot;ClusterId&quot;:&quot;c9f5b93a8da8f4341b77***********&quot;},{&quot;Namespaces&quot;:[&quot;default&quot;],&quot;ClusterId&quot;:&quot;cc12429dbb8f644f690b0***********&quot;}]</p>
         */
        public Builder clusters(String clusters) {
            this.putQueryParameter("Clusters", clusters);
            this.clusters = clusters;
            return this;
        }

        /**
         * <p>Policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-policy-04-11</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>Policy content. JSON format, Key values:</p>
         * <ul>
         * <li><strong>policyMode</strong>: Type of policy, default is requireAttestor.</li>
         * <li><strong>requiredAttestors</strong>: Required attestors.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;PolicyMode&quot;:&quot;requireAttestor&quot;,&quot;RequiredAttestors&quot;:[&quot;test-xcs-04-11-hhht&quot;]}</p>
         */
        public Builder policy(String policy) {
            this.putQueryParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * <p>Remark.</p>
         * 
         * <strong>example:</strong>
         * <p>Remark</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The IP address of the access source.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.3.4</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>Set to enable or disable the policy. Values:</p>
         * <ul>
         * <li><strong>enabled</strong>: Enable the protection policy.</li>
         * <li><strong>disabled</strong>: Disable the protection policy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ModifyBinarySecurityPolicyRequest build() {
            return new ModifyBinarySecurityPolicyRequest(this);
        } 

    } 

}
