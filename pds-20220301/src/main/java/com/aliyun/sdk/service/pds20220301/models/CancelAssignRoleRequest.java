// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelAssignRoleRequest} extends {@link RequestModel}
 *
 * <p>CancelAssignRoleRequest</p>
 */
public class CancelAssignRoleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("identity")
    @com.aliyun.core.annotation.Validation(required = true)
    private Identity identity;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("manage_resource_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String manageResourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("manage_resource_type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String manageResourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("role_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String roleId;

    private CancelAssignRoleRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.identity = builder.identity;
        this.manageResourceId = builder.manageResourceId;
        this.manageResourceType = builder.manageResourceType;
        this.roleId = builder.roleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelAssignRoleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return identity
     */
    public Identity getIdentity() {
        return this.identity;
    }

    /**
     * @return manageResourceId
     */
    public String getManageResourceId() {
        return this.manageResourceId;
    }

    /**
     * @return manageResourceType
     */
    public String getManageResourceType() {
        return this.manageResourceType;
    }

    /**
     * @return roleId
     */
    public String getRoleId() {
        return this.roleId;
    }

    public static final class Builder extends Request.Builder<CancelAssignRoleRequest, Builder> {
        private String domainId; 
        private Identity identity; 
        private String manageResourceId; 
        private String manageResourceType; 
        private String roleId; 

        private Builder() {
            super();
        } 

        private Builder(CancelAssignRoleRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.identity = request.identity;
            this.manageResourceId = request.manageResourceId;
            this.manageResourceType = request.manageResourceType;
            this.roleId = request.roleId;
        } 

        /**
         * A short description of struct
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * The unique identifier. You can cancel only the role assigned to a user.
         */
        public Builder identity(Identity identity) {
            this.putBodyParameter("identity", identity);
            this.identity = identity;
            return this;
        }

        /**
         * The ID of the resource that the role manages. Set the value to a group ID.
         */
        public Builder manageResourceId(String manageResourceId) {
            this.putBodyParameter("manage_resource_id", manageResourceId);
            this.manageResourceId = manageResourceId;
            return this;
        }

        /**
         * The type of the resource that the role manages. Set the value to RT_Group, which specifies group.
         */
        public Builder manageResourceType(String manageResourceType) {
            this.putBodyParameter("manage_resource_type", manageResourceType);
            this.manageResourceType = manageResourceType;
            return this;
        }

        /**
         * The ID of the role to be canceled. Set the value to SystemGroupAdmin, which is the ID of the group administrator role.
         */
        public Builder roleId(String roleId) {
            this.putBodyParameter("role_id", roleId);
            this.roleId = roleId;
            return this;
        }

        @Override
        public CancelAssignRoleRequest build() {
            return new CancelAssignRoleRequest(this);
        } 

    } 

}
