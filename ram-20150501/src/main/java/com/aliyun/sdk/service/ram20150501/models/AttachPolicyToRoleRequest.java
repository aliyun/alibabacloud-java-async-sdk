// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

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
 * {@link AttachPolicyToRoleRequest} extends {@link RequestModel}
 *
 * <p>AttachPolicyToRoleRequest</p>
 */
public class AttachPolicyToRoleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyName")
    private String policyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyType")
    private String policyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleName")
    private String roleName;

    private AttachPolicyToRoleRequest(Builder builder) {
        super(builder);
        this.policyName = builder.policyName;
        this.policyType = builder.policyType;
        this.resourceGroupId = builder.resourceGroupId;
        this.roleName = builder.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachPolicyToRoleRequest create() {
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    public static final class Builder extends Request.Builder<AttachPolicyToRoleRequest, Builder> {
        private String policyName; 
        private String policyType; 
        private String resourceGroupId; 
        private String roleName; 

        private Builder() {
            super();
        } 

        private Builder(AttachPolicyToRoleRequest request) {
            super(request);
            this.policyName = request.policyName;
            this.policyType = request.policyType;
            this.resourceGroupId = request.resourceGroupId;
            this.roleName = request.roleName;
        } 

        /**
         * <p>The name of the policy.</p>
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
         * <p>The type of the policy. Valid values: <code>System</code> and <code>Custom</code>.</p>
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The name of the RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>OSSAdminRole</p>
         */
        public Builder roleName(String roleName) {
            this.putQueryParameter("RoleName", roleName);
            this.roleName = roleName;
            return this;
        }

        @Override
        public AttachPolicyToRoleRequest build() {
            return new AttachPolicyToRoleRequest(this);
        } 

    } 

}
