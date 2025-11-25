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
 * {@link UpdateCheckPolicyRequest} extends {@link RequestModel}
 *
 * <p>UpdateCheckPolicyRequest</p>
 */
public class UpdateCheckPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DependentPolicyId")
    private Long dependentPolicyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyShowName")
    private String policyShowName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private UpdateCheckPolicyRequest(Builder builder) {
        super(builder);
        this.dependentPolicyId = builder.dependentPolicyId;
        this.policyId = builder.policyId;
        this.policyShowName = builder.policyShowName;
        this.policyType = builder.policyType;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCheckPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dependentPolicyId
     */
    public Long getDependentPolicyId() {
        return this.dependentPolicyId;
    }

    /**
     * @return policyId
     */
    public Long getPolicyId() {
        return this.policyId;
    }

    /**
     * @return policyShowName
     */
    public String getPolicyShowName() {
        return this.policyShowName;
    }

    /**
     * @return policyType
     */
    public String getPolicyType() {
        return this.policyType;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<UpdateCheckPolicyRequest, Builder> {
        private Long dependentPolicyId; 
        private Long policyId; 
        private String policyShowName; 
        private String policyType; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCheckPolicyRequest request) {
            super(request);
            this.dependentPolicyId = request.dependentPolicyId;
            this.policyId = request.policyId;
            this.policyShowName = request.policyShowName;
            this.policyType = request.policyType;
            this.type = request.type;
        } 

        /**
         * <p>ID of the associated parent policy.</p>
         * <p>(The specific dependency hierarchy, from low to high, is Section -&gt; Requirement -&gt; Standard).</p>
         * 
         * <strong>example:</strong>
         * <p>1000000000002</p>
         */
        public Builder dependentPolicyId(Long dependentPolicyId) {
            this.putQueryParameter("DependentPolicyId", dependentPolicyId);
            this.dependentPolicyId = dependentPolicyId;
            return this;
        }

        /**
         * <p>ID of the custom policy.</p>
         * <blockquote>
         * <p>You can obtain this parameter by calling the <a href="~~ListCheckPolicies~~">ListCheckPolicies</a> API.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000000001</p>
         */
        public Builder policyId(Long policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>Name of the custom classification.</p>
         * 
         * <strong>example:</strong>
         * <p>testPolicyName</p>
         */
        public Builder policyShowName(String policyShowName) {
            this.putQueryParameter("PolicyShowName", policyShowName);
            this.policyShowName = policyShowName;
            return this;
        }

        /**
         * <p>Classification type of the custom check item rule:</p>
         * <ul>
         * <li><strong>STANDARD</strong>: Add to standard.</li>
         * <li><strong>REQUIREMENT</strong>: Add to requirement.</li>
         * <li><strong>SECTION</strong>: Add to section.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        public Builder policyType(String policyType) {
            this.putQueryParameter("PolicyType", policyType);
            this.policyType = policyType;
            return this;
        }

        /**
         * <p>Name of the associated major policy category (required when PolicyType is STANDARD):</p>
         * <ul>
         * <li><strong>AISPM</strong>: AI Configuration Management (AISPM).</li>
         * <li><strong>RISK</strong>: Security Risk.</li>
         * <li><strong>COMPLIANCE</strong>: Compliance Risk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AISPM</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public UpdateCheckPolicyRequest build() {
            return new UpdateCheckPolicyRequest(this);
        } 

    } 

}
