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
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("appToken")
    private String appToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("moveToRoot")
    private Boolean moveToRoot;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserCode")
    private String opsUserCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserId")
    private String opsUserId;

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
        this.appToken = builder.appToken;
        this.description = builder.description;
        this.moveToRoot = builder.moveToRoot;
        this.opsUserCode = builder.opsUserCode;
        this.opsUserId = builder.opsUserId;
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
     * @return appToken
     */
    public String getAppToken() {
        return this.appToken;
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
     * @return opsUserCode
     */
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    /**
     * @return opsUserId
     */
    public String getOpsUserId() {
        return this.opsUserId;
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
        private String appToken; 
        private String description; 
        private Boolean moveToRoot; 
        private String opsUserCode; 
        private String opsUserId; 
        private String parentId; 
        private String tenantId; 
        private String userGroupId; 
        private String userGroupName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserGroupRequest request) {
            super(request);
            this.appToken = request.appToken;
            this.description = request.description;
            this.moveToRoot = request.moveToRoot;
            this.opsUserCode = request.opsUserCode;
            this.opsUserId = request.opsUserId;
            this.parentId = request.parentId;
            this.tenantId = request.tenantId;
            this.userGroupId = request.userGroupId;
            this.userGroupName = request.userGroupName;
        } 

        /**
         * <p>The platform application token issued by the console. If specified, the operation is executed as the user identified by opsUserId or opsUserCode.</p>
         * 
         * <strong>example:</strong>
         * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
         */
        public Builder appToken(String appToken) {
            this.putQueryParameter("appToken", appToken);
            this.appToken = appToken;
            return this;
        }

        /**
         * <p>The new description of the user group. If this parameter is not specified, the description is not modified.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to move the user group to the root node. This parameter cannot be set at the same time as a non-null parentId.</p>
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
         * <p>The proxy user code, which is unique within the tenant. This parameter is used only when the application credential is configured as source_uid.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder opsUserCode(String opsUserCode) {
            this.putQueryParameter("opsUserCode", opsUserCode);
            this.opsUserCode = opsUserCode;
            return this;
        }

        /**
         * <p>The proxy user ID, which is the WINNEXO platform user ID. This parameter is used only when the application credential is configured as winnexo_uid.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder opsUserId(String opsUserId) {
            this.putQueryParameter("opsUserId", opsUserId);
            this.opsUserId = opsUserId;
            return this;
        }

        /**
         * <p>The ID of the new parent user group. If this parameter is not specified, the user group is not moved. If this parameter is explicitly set to null, the user group is moved to the root node.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder parentId(String parentId) {
            this.putBodyParameter("parentId", parentId);
            this.parentId = parentId;
            return this;
        }

        /**
         * <p>The tenant ID. This is a common parameter. For winnexo-cli, explicitly pass this parameter by using <code>--tenant-id</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
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
         * <p>string_value</p>
         */
        public Builder userGroupId(String userGroupId) {
            this.putBodyParameter("userGroupId", userGroupId);
            this.userGroupId = userGroupId;
            return this;
        }

        /**
         * <p>The new name of the user group. If this parameter is not specified, the name is not modified.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
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
