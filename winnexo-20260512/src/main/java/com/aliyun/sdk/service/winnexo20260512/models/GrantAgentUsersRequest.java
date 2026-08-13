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
 * {@link GrantAgentUsersRequest} extends {@link RequestModel}
 *
 * <p>GrantAgentUsersRequest</p>
 */
public class GrantAgentUsersRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("expireDate")
    private Long expireDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operatingObjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operatingObjectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("permissions")
    private java.util.List<String> permissions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userGroupIds")
    private java.util.List<String> userGroupIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userIds")
    private java.util.List<String> userIds;

    private GrantAgentUsersRequest(Builder builder) {
        super(builder);
        this.expireDate = builder.expireDate;
        this.operatingObjectName = builder.operatingObjectName;
        this.permissions = builder.permissions;
        this.tenantId = builder.tenantId;
        this.userGroupIds = builder.userGroupIds;
        this.userIds = builder.userIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantAgentUsersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expireDate
     */
    public Long getExpireDate() {
        return this.expireDate;
    }

    /**
     * @return operatingObjectName
     */
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    /**
     * @return permissions
     */
    public java.util.List<String> getPermissions() {
        return this.permissions;
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
     * @return userIds
     */
    public java.util.List<String> getUserIds() {
        return this.userIds;
    }

    public static final class Builder extends Request.Builder<GrantAgentUsersRequest, Builder> {
        private Long expireDate; 
        private String operatingObjectName; 
        private java.util.List<String> permissions; 
        private String tenantId; 
        private java.util.List<String> userGroupIds; 
        private java.util.List<String> userIds; 

        private Builder() {
            super();
        } 

        private Builder(GrantAgentUsersRequest request) {
            super(request);
            this.expireDate = request.expireDate;
            this.operatingObjectName = request.operatingObjectName;
            this.permissions = request.permissions;
            this.tenantId = request.tenantId;
            this.userGroupIds = request.userGroupIds;
            this.userIds = request.userIds;
        } 

        /**
         * <p>授权截止时间戳（毫秒），不传表示永不过期</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder expireDate(Long expireDate) {
            this.putBodyParameter("expireDate", expireDate);
            this.expireDate = expireDate;
            return this;
        }

        /**
         * <p>数字员工名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder operatingObjectName(String operatingObjectName) {
            this.putBodyParameter("operatingObjectName", operatingObjectName);
            this.operatingObjectName = operatingObjectName;
            return this;
        }

        /**
         * <p>权限列表：USE（使用权限）和/或 MANAGE（管理权限），不传时默认仅 USE；不得为空列表</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder permissions(java.util.List<String> permissions) {
            String permissionsShrink = shrink(permissions, "permissions", "json");
            this.putBodyParameter("permissions", permissionsShrink);
            this.permissions = permissions;
            return this;
        }

        /**
         * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
         * 
         * <strong>example:</strong>
         * <p>676577544219585</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>被授权的用户组 ID 列表（16位 hex 字符串）</p>
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
         * <p>被授权的用户 ID 列表</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder userIds(java.util.List<String> userIds) {
            String userIdsShrink = shrink(userIds, "userIds", "json");
            this.putBodyParameter("userIds", userIdsShrink);
            this.userIds = userIds;
            return this;
        }

        @Override
        public GrantAgentUsersRequest build() {
            return new GrantAgentUsersRequest(this);
        } 

    } 

}
