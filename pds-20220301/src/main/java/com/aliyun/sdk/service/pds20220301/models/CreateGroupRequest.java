// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateGroupRequest</p>
 */
public class CreateGroupRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("group_name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("is_root")
    private Boolean isRoot;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parent_group_id")
    private String parentGroupId;

    private CreateGroupRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.description = builder.description;
        this.groupName = builder.groupName;
        this.isRoot = builder.isRoot;
        this.parentGroupId = builder.parentGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGroupRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return isRoot
     */
    public Boolean getIsRoot() {
        return this.isRoot;
    }

    /**
     * @return parentGroupId
     */
    public String getParentGroupId() {
        return this.parentGroupId;
    }

    public static final class Builder extends Request.Builder<CreateGroupRequest, Builder> {
        private String domainId; 
        private String description; 
        private String groupName; 
        private Boolean isRoot; 
        private String parentGroupId; 

        private Builder() {
            super();
        } 

        private Builder(CreateGroupRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.description = request.description;
            this.groupName = request.groupName;
            this.isRoot = request.isRoot;
            this.parentGroupId = request.parentGroupId;
        } 

        /**
         * domain_id.
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * The description of the group. The description can be up to 1,024 characters in length.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * The name of the group. The name must be 1 to 128 characters in length.
         */
        public Builder groupName(String groupName) {
            this.putBodyParameter("group_name", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * Specifies whether the group is a root group. A root group cannot be added to any other group. In most cases, a root group is the top-level organization in the organizational structure.
         */
        public Builder isRoot(Boolean isRoot) {
            this.putBodyParameter("is_root", isRoot);
            this.isRoot = isRoot;
            return this;
        }

        /**
         * The ID of the parent group to which the group is added. If this parameter is specified, the system automatically adds the group to the specified parent group after the group is created.
         */
        public Builder parentGroupId(String parentGroupId) {
            this.putBodyParameter("parent_group_id", parentGroupId);
            this.parentGroupId = parentGroupId;
            return this;
        }

        @Override
        public CreateGroupRequest build() {
            return new CreateGroupRequest(this);
        } 

    } 

}
