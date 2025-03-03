// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link DetachPolicyRequest} extends {@link RequestModel}
 *
 * <p>DetachPolicyRequest</p>
 */
public class DetachPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrincipalName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String principalName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrincipalType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String principalType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceGroupId;

    private DetachPolicyRequest(Builder builder) {
        super(builder);
        this.policyName = builder.policyName;
        this.policyType = builder.policyType;
        this.principalName = builder.principalName;
        this.principalType = builder.principalType;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachPolicyRequest create() {
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
     * @return policyType
     */
    public String getPolicyType() {
        return this.policyType;
    }

    /**
     * @return principalName
     */
    public String getPrincipalName() {
        return this.principalName;
    }

    /**
     * @return principalType
     */
    public String getPrincipalType() {
        return this.principalType;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<DetachPolicyRequest, Builder> {
        private String policyName; 
        private String policyType; 
        private String principalName; 
        private String principalType; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DetachPolicyRequest request) {
            super(request);
            this.policyName = request.policyName;
            this.policyType = request.policyType;
            this.principalName = request.principalName;
            this.principalType = request.principalType;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>The name of the policy.</p>
         * <p>The name must be 1 to 128 characters in length and can contain letters, digits, and hyphens (-).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS-Administrator</p>
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * <p>The type of the policy. Valid values:</p>
         * <ul>
         * <li>Custom: custom policy</li>
         * <li>System: system policy</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        public Builder policyType(String policyType) {
            this.putQueryParameter("PolicyType", policyType);
            this.policyType = policyType;
            return this;
        }

        /**
         * <p>The name of the object to which the policy is attached.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:alice@demo.onaliyun.com">alice@demo.onaliyun.com</a></p>
         */
        public Builder principalName(String principalName) {
            this.putQueryParameter("PrincipalName", principalName);
            this.principalName = principalName;
            return this;
        }

        /**
         * <p>The type of the object to which the policy is attached. Valid values:</p>
         * <ul>
         * <li>IMSUser: RAM user</li>
         * <li>IMSGroup: RAM user group</li>
         * <li>ServiceRole: RAM role</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>IMSUser</p>
         */
        public Builder principalType(String principalType) {
            this.putQueryParameter("PrincipalType", principalType);
            this.principalType = principalType;
            return this;
        }

        /**
         * <p>The ID of the resource group or the ID of the Alibaba Cloud account to which the resource group belongs.</p>
         * <p>This parameter specifies the resource group or Alibaba Cloud account for which you want to revoke permissions.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-9gLOoK****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public DetachPolicyRequest build() {
            return new DetachPolicyRequest(this);
        } 

    } 

}
