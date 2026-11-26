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
 * {@link ListAppResourcePermissionRecordsRequest} extends {@link RequestModel}
 *
 * <p>ListAppResourcePermissionRecordsRequest</p>
 */
public class ListAppResourcePermissionRecordsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("appToken")
    private String appToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("granteeId")
    private String granteeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("granteeTenantId")
    private String granteeTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("granteeType")
    private String granteeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserCode")
    private String opsUserCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserId")
    private String opsUserId;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private ListAppResourcePermissionRecordsRequest(Builder builder) {
        super(builder);
        this.appToken = builder.appToken;
        this.granteeId = builder.granteeId;
        this.granteeTenantId = builder.granteeTenantId;
        this.granteeType = builder.granteeType;
        this.opsUserCode = builder.opsUserCode;
        this.opsUserId = builder.opsUserId;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.permissions = builder.permissions;
        this.resourceKeyPrefix = builder.resourceKeyPrefix;
        this.resourceTenantId = builder.resourceTenantId;
        this.resourceType = builder.resourceType;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppResourcePermissionRecordsRequest create() {
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
     * @return granteeId
     */
    public String getGranteeId() {
        return this.granteeId;
    }

    /**
     * @return granteeTenantId
     */
    public String getGranteeTenantId() {
        return this.granteeTenantId;
    }

    /**
     * @return granteeType
     */
    public String getGranteeType() {
        return this.granteeType;
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
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ListAppResourcePermissionRecordsRequest, Builder> {
        private String appToken; 
        private String granteeId; 
        private String granteeTenantId; 
        private String granteeType; 
        private String opsUserCode; 
        private String opsUserId; 
        private Long page; 
        private Long pageSize; 
        private java.util.List<String> permissions; 
        private String resourceKeyPrefix; 
        private String resourceTenantId; 
        private String resourceType; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListAppResourcePermissionRecordsRequest request) {
            super(request);
            this.appToken = request.appToken;
            this.granteeId = request.granteeId;
            this.granteeTenantId = request.granteeTenantId;
            this.granteeType = request.granteeType;
            this.opsUserCode = request.opsUserCode;
            this.opsUserId = request.opsUserId;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.permissions = request.permissions;
            this.resourceKeyPrefix = request.resourceKeyPrefix;
            this.resourceTenantId = request.resourceTenantId;
            this.resourceType = request.resourceType;
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
         * <p>The tenant filter for cross-tenant users.</p>
         * 
         * <strong>example:</strong>
         * <p>10086</p>
         */
        public Builder granteeId(String granteeId) {
            this.putBodyParameter("granteeId", granteeId);
            this.granteeId = granteeId;
            return this;
        }

        /**
         * <p>The permission filter.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder granteeTenantId(String granteeTenantId) {
            this.putBodyParameter("granteeTenantId", granteeTenantId);
            this.granteeTenantId = granteeTenantId;
            return this;
        }

        /**
         * <p>The principal ID filter.</p>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        public Builder granteeType(String granteeType) {
            this.putBodyParameter("granteeType", granteeType);
            this.granteeType = granteeType;
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
         * <p>The number of items per page.</p>
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
         * <p>The principal type filter.</p>
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
         * <p>The permission filter.</p>
         */
        public Builder permissions(java.util.List<String> permissions) {
            String permissionsShrink = shrink(permissions, "permissions", "json");
            this.putBodyParameter("permissions", permissionsShrink);
            this.permissions = permissions;
            return this;
        }

        /**
         * <p>The page number.</p>
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
         * <p>The resource tenant ID. This parameter is fixed to APP_RESOURCE.</p>
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
         * <p>The application key or its subpath.</p>
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
         * <p>The ID of the tenant to which the resource belongs. If omitted, the current tenant of the caller is used.</p>
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
        public ListAppResourcePermissionRecordsRequest build() {
            return new ListAppResourcePermissionRecordsRequest(this);
        } 

    } 

}
