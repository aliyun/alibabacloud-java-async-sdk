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
 * {@link CheckAppResourcePermissionRequest} extends {@link RequestModel}
 *
 * <p>CheckAppResourcePermissionRequest</p>
 */
public class CheckAppResourcePermissionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("appToken")
    private String appToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserCode")
    private String opsUserCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserId")
    private String opsUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("permission")
    @com.aliyun.core.annotation.Validation(required = true)
    private String permission;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceTenantId")
    private String resourceTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetUserId")
    private Long targetUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetUserTenantId")
    private String targetUserTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private CheckAppResourcePermissionRequest(Builder builder) {
        super(builder);
        this.appToken = builder.appToken;
        this.opsUserCode = builder.opsUserCode;
        this.opsUserId = builder.opsUserId;
        this.permission = builder.permission;
        this.resourceKey = builder.resourceKey;
        this.resourceTenantId = builder.resourceTenantId;
        this.resourceType = builder.resourceType;
        this.targetUserId = builder.targetUserId;
        this.targetUserTenantId = builder.targetUserTenantId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckAppResourcePermissionRequest create() {
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
     * @return permission
     */
    public String getPermission() {
        return this.permission;
    }

    /**
     * @return resourceKey
     */
    public String getResourceKey() {
        return this.resourceKey;
    }

    /**
     * @return resourceTenantId
     */
    public String getResourceTenantId() {
        return this.resourceTenantId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return targetUserId
     */
    public Long getTargetUserId() {
        return this.targetUserId;
    }

    /**
     * @return targetUserTenantId
     */
    public String getTargetUserTenantId() {
        return this.targetUserTenantId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<CheckAppResourcePermissionRequest, Builder> {
        private String appToken; 
        private String opsUserCode; 
        private String opsUserId; 
        private String permission; 
        private String resourceKey; 
        private String resourceTenantId; 
        private String resourceType; 
        private Long targetUserId; 
        private String targetUserTenantId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(CheckAppResourcePermissionRequest request) {
            super(request);
            this.appToken = request.appToken;
            this.opsUserCode = request.opsUserCode;
            this.opsUserId = request.opsUserId;
            this.permission = request.permission;
            this.resourceKey = request.resourceKey;
            this.resourceTenantId = request.resourceTenantId;
            this.resourceType = request.resourceType;
            this.targetUserId = request.targetUserId;
            this.targetUserTenantId = request.targetUserTenantId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>平台应用 Token（控制台签发）。传入后将以 opsUserId 或 opsUserCode 指定的用户身份执行</p>
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
         * <p>代理用户编码（租户内唯一），仅当应用凭证配置为 source_uid 时使用</p>
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
         * <p>代理用户ID（WINNEXO 平台用户ID），仅当应用凭证配置为 winnexo_uid 时使用</p>
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
         * <p>The permission to check.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>APP/VIEW</p>
         */
        public Builder permission(String permission) {
            this.putBodyParameter("permission", permission);
            this.permission = permission;
            return this;
        }

        /**
         * <p>The dot-separated resource key. The first segment is the application key.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app.demo.resource_1</p>
         */
        public Builder resourceKey(String resourceKey) {
            this.putBodyParameter("resourceKey", resourceKey);
            this.resourceKey = resourceKey;
            return this;
        }

        /**
         * <p>The ID of the tenant to which the resource belongs. If not specified, the current tenant of the caller is used.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder resourceTenantId(String resourceTenantId) {
            this.putBodyParameter("resourceTenantId", resourceTenantId);
            this.resourceTenantId = resourceTenantId;
            return this;
        }

        /**
         * <p>The resource type. Set the value to APP_RESOURCE.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>APP_RESOURCE</p>
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("resourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The ID of the target platform user.</p>
         * 
         * <strong>example:</strong>
         * <p>10086</p>
         */
        public Builder targetUserId(Long targetUserId) {
            this.putBodyParameter("targetUserId", targetUserId);
            this.targetUserId = targetUserId;
            return this;
        }

        /**
         * <p>The tenant to which the target user belongs. This parameter is required for cross-tenant targets.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder targetUserTenantId(String targetUserTenantId) {
            this.putBodyParameter("targetUserTenantId", targetUserTenantId);
            this.targetUserTenantId = targetUserTenantId;
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

        @Override
        public CheckAppResourcePermissionRequest build() {
            return new CheckAppResourcePermissionRequest(this);
        } 

    } 

}
