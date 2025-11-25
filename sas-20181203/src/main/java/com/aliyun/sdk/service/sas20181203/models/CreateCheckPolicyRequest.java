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
 * {@link CreateCheckPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateCheckPolicyRequest</p>
 */
public class CreateCheckPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DependentPolicyId")
    private Long dependentPolicyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyShowName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyShowName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private CreateCheckPolicyRequest(Builder builder) {
        super(builder);
        this.dependentPolicyId = builder.dependentPolicyId;
        this.policyShowName = builder.policyShowName;
        this.policyType = builder.policyType;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCheckPolicyRequest create() {
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

    public static final class Builder extends Request.Builder<CreateCheckPolicyRequest, Builder> {
        private Long dependentPolicyId; 
        private String policyShowName; 
        private String policyType; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateCheckPolicyRequest request) {
            super(request);
            this.dependentPolicyId = request.dependentPolicyId;
            this.policyShowName = request.policyShowName;
            this.policyType = request.policyType;
            this.type = request.type;
        } 

        /**
         * <p>The ID of the parent policy.</p>
         * <p>(The specific dependency order from low to high is Section -&gt; Requirement -&gt; Standard)</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder dependentPolicyId(Long dependentPolicyId) {
            this.putQueryParameter("DependentPolicyId", dependentPolicyId);
            this.dependentPolicyId = dependentPolicyId;
            return this;
        }

        /**
         * <p>The name of the custom policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TestPolicyName</p>
         */
        public Builder policyShowName(String policyShowName) {
            this.putQueryParameter("PolicyShowName", policyShowName);
            this.policyShowName = policyShowName;
            return this;
        }

        /**
         * <p>The policy category type for custom check rules:</p>
         * <ul>
         * <li><strong>STANDARD</strong>: Add to a standard.</li>
         * <li><strong>REQUIREMENT</strong>: Add to a requirement.</li>
         * <li><strong>SECTION</strong>: Add to a section.</li>
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
         * <p>The name of the major policy category (required when PolicyType is STANDARD):</p>
         * <ul>
         * <li><strong>AISPM</strong>: AI Configuration Management (AISPM).</li>
         * <li><strong>IDENTITY_PERMISSION</strong>: Identity and Permission Management (CIEM).</li>
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
        public CreateCheckPolicyRequest build() {
            return new CreateCheckPolicyRequest(this);
        } 

    } 

}
