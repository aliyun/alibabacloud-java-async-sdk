// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link UpdateUserGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserGroupRequest</p>
 */
public class UpdateUserGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("moveToRoot")
    private Boolean moveToRoot;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parentId")
    private String parentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userGroupName")
    private String userGroupName;

    private UpdateUserGroupRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.moveToRoot = builder.moveToRoot;
        this.parentId = builder.parentId;
        this.tenantId = builder.tenantId;
        this.userGroupId = builder.userGroupId;
        this.userGroupName = builder.userGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return moveToRoot
     */
    public Boolean getMoveToRoot() {
        return this.moveToRoot;
    }

    /**
     * @return parentId
     */
    public String getParentId() {
        return this.parentId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return userGroupId
     */
    public String getUserGroupId() {
        return this.userGroupId;
    }

    /**
     * @return userGroupName
     */
    public String getUserGroupName() {
        return this.userGroupName;
    }

    public static final class Builder extends Request.Builder<UpdateUserGroupRequest, Builder> {
        private String description; 
        private Boolean moveToRoot; 
        private String parentId; 
        private String tenantId; 
        private String userGroupId; 
        private String userGroupName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserGroupRequest request) {
            super(request);
            this.description = request.description;
            this.moveToRoot = request.moveToRoot;
            this.parentId = request.parentId;
            this.tenantId = request.tenantId;
            this.userGroupId = request.userGroupId;
            this.userGroupName = request.userGroupName;
        } 

        /**
         * <p>The new description of the user group. If not specified, the description is not modified.</p>
         * 
         * <strong>example:</strong>
         * <p>South China Sales Organization</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to move the user group to the root node. This parameter cannot be set together with parentId.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder moveToRoot(Boolean moveToRoot) {
            this.putBodyParameter("moveToRoot", moveToRoot);
            this.moveToRoot = moveToRoot;
            return this;
        }

        /**
         * <p>The ID of the new parent user group. If not specified, the user group is not moved.</p>
         * 
         * <strong>example:</strong>
         * <p>7ea8973f-7a5c-4e8a-956b-4fe0e7e2eb11</p>
         */
        public Builder parentId(String parentId) {
            this.putBodyParameter("parentId", parentId);
            this.parentId = parentId;
            return this;
        }

        /**
         * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The ID of the target user group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7ea8973f-7a5c-4e8a-956b-4fe0e7e2eb11</p>
         */
        public Builder userGroupId(String userGroupId) {
            this.putBodyParameter("userGroupId", userGroupId);
            this.userGroupId = userGroupId;
            return this;
        }

        /**
         * <p>The new name of the user group. If not specified, the name is not modified.</p>
         * 
         * <strong>example:</strong>
         * <p>South China Sales</p>
         */
        public Builder userGroupName(String userGroupName) {
            this.putBodyParameter("userGroupName", userGroupName);
            this.userGroupName = userGroupName;
            return this;
        }

        @Override
        public UpdateUserGroupRequest build() {
            return new UpdateUserGroupRequest(this);
        } 

    } 

}
