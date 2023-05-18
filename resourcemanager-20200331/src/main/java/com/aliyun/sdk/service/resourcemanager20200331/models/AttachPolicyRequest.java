// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachPolicyRequest} extends {@link RequestModel}
 *
 * <p>AttachPolicyRequest</p>
 */
public class AttachPolicyRequest extends Request {
    @Query
    @NameInMap("PolicyName")
    @Validation(required = true)
    private String policyName;

    @Query
    @NameInMap("PolicyType")
    @Validation(required = true)
    private String policyType;

    @Query
    @NameInMap("PrincipalName")
    @Validation(required = true)
    private String principalName;

    @Query
    @NameInMap("PrincipalType")
    @Validation(required = true)
    private String principalType;

    @Query
    @NameInMap("ResourceGroupId")
    @Validation(required = true)
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
         * The name of the policy.
         * <p>
         * 
         * The name must be 1 to 128 characters in length and can contain letters, digits, and hyphens (-).
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * The type of the policy. Valid values:
         * <p>
         * 
         * *   Custom: custom policy
         * *   System: system policy
         */
        public Builder policyType(String policyType) {
            this.putQueryParameter("PolicyType", policyType);
            this.policyType = policyType;
            return this;
        }

        /**
         * The name of the object to which you want to attach the policy.
         * <p>
         * 
         * *   If you want to attach the policy to a RAM user, specify the name in the \<UserName>@\<AccountAlias>.onaliyun.com format. \<UserName> indicates the name of the RAM user, and \<AccountAlias> indicates the alias of the Alibaba Cloud account to which the RAM user belongs.
         * *   If you want to attach the policy to a RAM user group, specify the name in the \<GroupName>@group.\<AccountAlias>.onaliyun.com format. \<GroupName> indicates the name of the RAM user group, and \<AccountAlias> indicates the alias of the Alibaba Cloud account to which the RAM user group belongs.
         * *   If you want to attach the policy to a RAM role, specify the name in the \<RoleName>@role.\<AccountAlias>.onaliyun.com format. \<RoleName> indicates the name of the RAM role, and \<AccountAlias> indicates the alias of the Alibaba Cloud account to which the RAM role belongs.
         * 
         * >  The alias of an Alibaba Cloud account is a part of the default domain name. You can call the [GetDefaultDomain](~~186720~~) operation to obtain the alias of an Alibaba Cloud account.
         */
        public Builder principalName(String principalName) {
            this.putQueryParameter("PrincipalName", principalName);
            this.principalName = principalName;
            return this;
        }

        /**
         * The type of the object to which you want to attach the policy. Valid values:
         * <p>
         * 
         * *   IMSUser: RAM user
         * *   IMSGroup: RAM user group
         * *   ServiceRole: RAM role
         */
        public Builder principalType(String principalType) {
            this.putQueryParameter("PrincipalType", principalType);
            this.principalType = principalType;
            return this;
        }

        /**
         * The effective scope of the policy. You can set this parameter to one of the following items:
         * <p>
         * 
         * *   ID of a resource group: indicates that the policy takes effect for the resources in the resource group.
         * *   ID of the Alibaba Cloud account to which the authorized object belongs: indicates that the policy takes effect for the resources within the Alibaba Cloud account.
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
