// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link BaseAssignmentResponse} extends {@link TeaModel}
 *
 * <p>BaseAssignmentResponse</p>
 */
public class BaseAssignmentResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("associated_role_tag_id")
    private String associatedRoleTagId;

    @com.aliyun.core.annotation.NameInMap("created_at")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("disinherit_sub_group")
    private Boolean disinheritSubGroup;

    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.NameInMap("identity")
    private Identity identity;

    @com.aliyun.core.annotation.NameInMap("manage_resource_id")
    private String manageResourceId;

    @com.aliyun.core.annotation.NameInMap("manage_resource_type")
    private String manageResourceType;

    @com.aliyun.core.annotation.NameInMap("role_id")
    private String roleId;

    @com.aliyun.core.annotation.NameInMap("updated_at")
    private String updatedAt;

    private BaseAssignmentResponse(BuilderImpl builder) {
        super(builder);
        this.associatedRoleTagId = builder.associatedRoleTagId;
        this.createdAt = builder.createdAt;
        this.creator = builder.creator;
        this.disinheritSubGroup = builder.disinheritSubGroup;
        this.domainId = builder.domainId;
        this.identity = builder.identity;
        this.manageResourceId = builder.manageResourceId;
        this.manageResourceType = builder.manageResourceType;
        this.roleId = builder.roleId;
        this.updatedAt = builder.updatedAt;
    }

    public static BaseAssignmentResponse create() {
        return new BuilderImpl().build();
    }

@Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return associatedRoleTagId
     */
    public String getAssociatedRoleTagId() {
        return this.associatedRoleTagId;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return disinheritSubGroup
     */
    public Boolean getDisinheritSubGroup() {
        return this.disinheritSubGroup;
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

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public interface Builder extends Response.Builder<BaseAssignmentResponse, Builder> {

        Builder associatedRoleTagId(String associatedRoleTagId);

        Builder createdAt(String createdAt);

        Builder creator(String creator);

        Builder disinheritSubGroup(Boolean disinheritSubGroup);

        Builder domainId(String domainId);

        Builder identity(Identity identity);

        Builder manageResourceId(String manageResourceId);

        Builder manageResourceType(String manageResourceType);

        Builder roleId(String roleId);

        Builder updatedAt(String updatedAt);

        @Override
        BaseAssignmentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BaseAssignmentResponse, Builder>
            implements Builder {
        private String associatedRoleTagId; 
        private String createdAt; 
        private String creator; 
        private Boolean disinheritSubGroup; 
        private String domainId; 
        private Identity identity; 
        private String manageResourceId; 
        private String manageResourceType; 
        private String roleId; 
        private String updatedAt; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BaseAssignmentResponse response) {
            super(response);
            this.associatedRoleTagId = response.associatedRoleTagId;
            this.createdAt = response.createdAt;
            this.creator = response.creator;
            this.disinheritSubGroup = response.disinheritSubGroup;
            this.domainId = response.domainId;
            this.identity = response.identity;
            this.manageResourceId = response.manageResourceId;
            this.manageResourceType = response.manageResourceType;
            this.roleId = response.roleId;
            this.updatedAt = response.updatedAt;
        } 

        /**
         * associated_role_tag_id.
         */
        @Override
        public Builder associatedRoleTagId(String associatedRoleTagId) {
            this.associatedRoleTagId = associatedRoleTagId;
            return this;
        }

        /**
         * created_at.
         */
        @Override
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * creator.
         */
        @Override
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * disinherit_sub_group.
         */
        @Override
        public Builder disinheritSubGroup(Boolean disinheritSubGroup) {
            this.disinheritSubGroup = disinheritSubGroup;
            return this;
        }

        /**
         * domain_id.
         */
        @Override
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            return this;
        }

        /**
         * identity.
         */
        @Override
        public Builder identity(Identity identity) {
            this.identity = identity;
            return this;
        }

        /**
         * manage_resource_id.
         */
        @Override
        public Builder manageResourceId(String manageResourceId) {
            this.manageResourceId = manageResourceId;
            return this;
        }

        /**
         * manage_resource_type.
         */
        @Override
        public Builder manageResourceType(String manageResourceType) {
            this.manageResourceType = manageResourceType;
            return this;
        }

        /**
         * role_id.
         */
        @Override
        public Builder roleId(String roleId) {
            this.roleId = roleId;
            return this;
        }

        /**
         * updated_at.
         */
        @Override
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        @Override
        public BaseAssignmentResponse build() {
            return new BaseAssignmentResponse(this);
        } 

    } 

}
