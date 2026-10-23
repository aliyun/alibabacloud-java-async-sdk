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
            this.permission = request.permission;
            this.resourceKey = request.resourceKey;
            this.resourceTenantId = request.resourceTenantId;
            this.resourceType = request.resourceType;
            this.targetUserId = request.targetUserId;
            this.targetUserTenantId = request.targetUserTenantId;
            this.tenantId = request.tenantId;
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
         * <p>The dot-separated resource key. The first segment is the APP application key.</p>
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
         * <p>The ID of the tenant to which the target user belongs. This parameter is required for cross-tenant targets.</p>
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
