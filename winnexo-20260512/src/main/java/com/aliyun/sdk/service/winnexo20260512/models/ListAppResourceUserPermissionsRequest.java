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
 * {@link ListAppResourceUserPermissionsRequest} extends {@link RequestModel}
 *
 * <p>ListAppResourceUserPermissionsRequest</p>
 */
public class ListAppResourceUserPermissionsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("page")
    private Long page;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("permissions")
    private java.util.List<String> permissions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceKeyPrefix")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceKeyPrefix;

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

    private ListAppResourceUserPermissionsRequest(Builder builder) {
        super(builder);
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.permissions = builder.permissions;
        this.resourceKeyPrefix = builder.resourceKeyPrefix;
        this.resourceTenantId = builder.resourceTenantId;
        this.resourceType = builder.resourceType;
        this.targetUserId = builder.targetUserId;
        this.targetUserTenantId = builder.targetUserTenantId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppResourceUserPermissionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return permissions
     */
    public java.util.List<String> getPermissions() {
        return this.permissions;
    }

    /**
     * @return resourceKeyPrefix
     */
    public String getResourceKeyPrefix() {
        return this.resourceKeyPrefix;
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

    public static final class Builder extends Request.Builder<ListAppResourceUserPermissionsRequest, Builder> {
        private Long page; 
        private Long pageSize; 
        private java.util.List<String> permissions; 
        private String resourceKeyPrefix; 
        private String resourceTenantId; 
        private String resourceType; 
        private Long targetUserId; 
        private String targetUserTenantId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListAppResourceUserPermissionsRequest request) {
            super(request);
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.permissions = request.permissions;
            this.resourceKeyPrefix = request.resourceKeyPrefix;
            this.resourceTenantId = request.resourceTenantId;
            this.resourceType = request.resourceType;
            this.targetUserId = request.targetUserId;
            this.targetUserTenantId = request.targetUserTenantId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Long page) {
            this.putBodyParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The permission points to filter.</p>
         */
        public Builder permissions(java.util.List<String> permissions) {
            String permissionsShrink = shrink(permissions, "permissions", "json");
            this.putBodyParameter("permissions", permissionsShrink);
            this.permissions = permissions;
            return this;
        }

        /**
         * <p>The application key or its subpath.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app.demo</p>
         */
        public Builder resourceKeyPrefix(String resourceKeyPrefix) {
            this.putBodyParameter("resourceKeyPrefix", resourceKeyPrefix);
            this.resourceKeyPrefix = resourceKeyPrefix;
            return this;
        }

        /**
         * <p>The ID of the tenant to which the resource belongs. If you do not specify this parameter, the current tenant of the caller is used.</p>
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
         * <p>The tenant ID. This is a common parameter. If you do not specify this parameter, the default tenant of the caller is used.</p>
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
        public ListAppResourceUserPermissionsRequest build() {
            return new ListAppResourceUserPermissionsRequest(this);
        } 

    } 

}
