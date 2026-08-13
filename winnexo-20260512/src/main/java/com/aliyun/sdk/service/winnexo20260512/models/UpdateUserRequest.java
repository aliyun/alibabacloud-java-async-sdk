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
 * {@link UpdateUserRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserRequest</p>
 */
public class UpdateUserRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("displayName")
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("isActive")
    private Boolean isActive;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("roleCodes")
    private java.util.List<String> roleCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userGroupIds")
    private java.util.List<String> userGroupIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("wnUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String wnUserId;

    private UpdateUserRequest(Builder builder) {
        super(builder);
        this.displayName = builder.displayName;
        this.isActive = builder.isActive;
        this.roleCodes = builder.roleCodes;
        this.tenantId = builder.tenantId;
        this.userGroupIds = builder.userGroupIds;
        this.wnUserId = builder.wnUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return isActive
     */
    public Boolean getIsActive() {
        return this.isActive;
    }

    /**
     * @return roleCodes
     */
    public java.util.List<String> getRoleCodes() {
        return this.roleCodes;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return userGroupIds
     */
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    /**
     * @return wnUserId
     */
    public String getWnUserId() {
        return this.wnUserId;
    }

    public static final class Builder extends Request.Builder<UpdateUserRequest, Builder> {
        private String displayName; 
        private Boolean isActive; 
        private java.util.List<String> roleCodes; 
        private String tenantId; 
        private java.util.List<String> userGroupIds; 
        private String wnUserId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserRequest request) {
            super(request);
            this.displayName = request.displayName;
            this.isActive = request.isActive;
            this.roleCodes = request.roleCodes;
            this.tenantId = request.tenantId;
            this.userGroupIds = request.userGroupIds;
            this.wnUserId = request.wnUserId;
        } 

        /**
         * <p>新的显示名称（不传不修改，传则不可为空，最多100字）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("displayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>启用/停用状态（不传不修改）。false=停用，true=启用</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isActive(Boolean isActive) {
            this.putBodyParameter("isActive", isActive);
            this.isActive = isActive;
            return this;
        }

        /**
         * <p>新的系统角色 code 列表（全量替换，至少包含一个角色）。可选值: SUPER_ADMIN / SYSTEM_ADMIN / SEMANTIC_ADMIN / SKILL_ADMIN / KB_ADMIN / AGENT_ADMIN / APPLICATION_USER</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder roleCodes(java.util.List<String> roleCodes) {
            String roleCodesShrink = shrink(roleCodes, "roleCodes", "json");
            this.putBodyParameter("roleCodes", roleCodesShrink);
            this.roleCodes = roleCodes;
            return this;
        }

        /**
         * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
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
         * <p>新的用户组ID列表（全量替换，不传不修改）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder userGroupIds(java.util.List<String> userGroupIds) {
            String userGroupIdsShrink = shrink(userGroupIds, "userGroupIds", "json");
            this.putBodyParameter("userGroupIds", userGroupIdsShrink);
            this.userGroupIds = userGroupIds;
            return this;
        }

        /**
         * <p>目标用户ID（WINNEXO 平台用户ID）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder wnUserId(String wnUserId) {
            this.putBodyParameter("wnUserId", wnUserId);
            this.wnUserId = wnUserId;
            return this;
        }

        @Override
        public UpdateUserRequest build() {
            return new UpdateUserRequest(this);
        } 

    } 

}
