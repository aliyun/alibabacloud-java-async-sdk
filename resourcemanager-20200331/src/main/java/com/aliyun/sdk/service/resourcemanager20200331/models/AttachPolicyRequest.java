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
 * {@link AttachPolicyRequest} extends {@link RequestModel}
 *
 * <p>AttachPolicyRequest</p>
 */
public class AttachPolicyRequest extends Request {
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

    private AttachPolicyRequest(Builder builder) {
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

    public static AttachPolicyRequest create() {
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

    public static final class Builder extends Request.Builder<AttachPolicyRequest, Builder> {
        private String policyName; 
        private String policyType; 
        private String principalName; 
        private String principalType; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(AttachPolicyRequest request) {
            super(request);
            this.policyName = request.policyName;
            this.policyType = request.policyType;
            this.principalName = request.principalName;
            this.principalType = request.principalType;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>The name of the permission policy.</p>
         * <p>The name must be 1 to 128 characters in length and can contain letters, digits, and hyphens (-).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AdministratorAccess</p>
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * <p>The type of the permission policy. Valid values:</p>
         * <ul>
         * <li>Custom</li>
         * <li>System</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        public Builder policyType(String policyType) {
            this.putQueryParameter("PolicyType", policyType);
            this.policyType = policyType;
            return this;
        }

        /**
         * <p>The name of the object to which you want to attach the permission policy.</p>
         * <ul>
         * <li>If you want to attach the permission policy to a RAM user, specify the name in the @.onaliyun.com format. indicates the name of the RAM user, and indicates the alias of the Alibaba Cloud account to which the RAM user belongs.</li>
         * <li>If you want to attach the permission policy to a RAM user group, specify the name in the @group..onaliyun.com format. indicates the name of the RAM user group, and indicates the alias of the Alibaba Cloud account to which the RAM user group belongs.</li>
         * <li>If you want to attach the permission policy to a RAM role, specify the name in the @role..onaliyunservice.com format. indicates the name of the RAM role, and indicates the alias of the Alibaba Cloud account to which the RAM role belongs.</li>
         * </ul>
         * <blockquote>
         * <p> The alias of an Alibaba Cloud account is a part of the default domain name. You can call the <a href="https://help.aliyun.com/document_detail/186720.html">GetDefaultDomain</a> operation to obtain the alias of an Alibaba Cloud account.</p>
         * </blockquote>
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
         * <p>The type of the object to which you want to attach the permission policy. Valid values:</p>
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
         * <p>The effective scope of the permission policy. Valid values:</p>
         * <ul>
         * <li>ID of a resource group: indicates that the permission policy takes effect for the resources in the resource group.</li>
         * <li>ID of the Alibaba Cloud account to which the authorized object belongs: indicates that the permission policy takes effect for the resources within the Alibaba Cloud account.</li>
         * </ul>
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
        public AttachPolicyRequest build() {
            return new AttachPolicyRequest(this);
        } 

    } 

}
