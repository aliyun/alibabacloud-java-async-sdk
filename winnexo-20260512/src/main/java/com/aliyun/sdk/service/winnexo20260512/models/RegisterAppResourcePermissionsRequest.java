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
 * {@link RegisterAppResourcePermissionsRequest} extends {@link RequestModel}
 *
 * <p>RegisterAppResourcePermissionsRequest</p>
 */
public class RegisterAppResourcePermissionsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("items")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceTenantId")
    private String resourceTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private RegisterAppResourcePermissionsRequest(Builder builder) {
        super(builder);
        this.items = builder.items;
        this.resourceTenantId = builder.resourceTenantId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterAppResourcePermissionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return resourceTenantId
     */
    public String getResourceTenantId() {
        return this.resourceTenantId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<RegisterAppResourcePermissionsRequest, Builder> {
        private java.util.List<Items> items; 
        private String resourceTenantId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(RegisterAppResourcePermissionsRequest request) {
            super(request);
            this.items = request.items;
            this.resourceTenantId = request.resourceTenantId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>批量授权项</p>
         * <p>This parameter is required.</p>
         */
        public Builder items(java.util.List<Items> items) {
            String itemsShrink = shrink(items, "items", "json");
            this.putBodyParameter("items", itemsShrink);
            this.items = items;
            return this;
        }

        /**
         * <p>资源所属租户 ID；省略为调用人当前租户</p>
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

        @Override
        public RegisterAppResourcePermissionsRequest build() {
            return new RegisterAppResourcePermissionsRequest(this);
        } 

    } 

    /**
     * 
     * {@link RegisterAppResourcePermissionsRequest} extends {@link TeaModel}
     *
     * <p>RegisterAppResourcePermissionsRequest</p>
     */
    public static class Grantees extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("granteeId")
        private String granteeId;

        @com.aliyun.core.annotation.NameInMap("granteeTenantId")
        private String granteeTenantId;

        @com.aliyun.core.annotation.NameInMap("granteeType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String granteeType;

        private Grantees(Builder builder) {
            this.granteeId = builder.granteeId;
            this.granteeTenantId = builder.granteeTenantId;
            this.granteeType = builder.granteeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Grantees create() {
            return builder().build();
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

        public static final class Builder {
            private String granteeId; 
            private String granteeTenantId; 
            private String granteeType; 

            private Builder() {
            } 

            private Builder(Grantees model) {
                this.granteeId = model.granteeId;
                this.granteeTenantId = model.granteeTenantId;
                this.granteeType = model.granteeType;
            } 

            /**
             * <p>主体 ID；ALL_USERS 省略</p>
             * 
             * <strong>example:</strong>
             * <p>10086</p>
             */
            public Builder granteeId(String granteeId) {
                this.granteeId = granteeId;
                return this;
            }

            /**
             * <p>跨租户 USER 所属租户</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder granteeTenantId(String granteeTenantId) {
                this.granteeTenantId = granteeTenantId;
                return this;
            }

            /**
             * <p>主体类型</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>USER</p>
             */
            public Builder granteeType(String granteeType) {
                this.granteeType = granteeType;
                return this;
            }

            public Grantees build() {
                return new Grantees(this);
            } 

        } 

    }
    /**
     * 
     * {@link RegisterAppResourcePermissionsRequest} extends {@link TeaModel}
     *
     * <p>RegisterAppResourcePermissionsRequest</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("expireAt")
        private String expireAt;

        @com.aliyun.core.annotation.NameInMap("grantees")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Grantees> grantees;

        @com.aliyun.core.annotation.NameInMap("permissions")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> permissions;

        @com.aliyun.core.annotation.NameInMap("resourceKey")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceKey;

        @com.aliyun.core.annotation.NameInMap("resourceType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceType;

        private Items(Builder builder) {
            this.expireAt = builder.expireAt;
            this.grantees = builder.grantees;
            this.permissions = builder.permissions;
            this.resourceKey = builder.resourceKey;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return expireAt
         */
        public String getExpireAt() {
            return this.expireAt;
        }

        /**
         * @return grantees
         */
        public java.util.List<Grantees> getGrantees() {
            return this.grantees;
        }

        /**
         * @return permissions
         */
        public java.util.List<String> getPermissions() {
            return this.permissions;
        }

        /**
         * @return resourceKey
         */
        public String getResourceKey() {
            return this.resourceKey;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String expireAt; 
            private java.util.List<Grantees> grantees; 
            private java.util.List<String> permissions; 
            private String resourceKey; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.expireAt = model.expireAt;
                this.grantees = model.grantees;
                this.permissions = model.permissions;
                this.resourceKey = model.resourceKey;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>带时区的到期时间；省略表示永久</p>
             * 
             * <strong>example:</strong>
             * <p>2026-12-31T23:59:59+08:00</p>
             */
            public Builder expireAt(String expireAt) {
                this.expireAt = expireAt;
                return this;
            }

            /**
             * <p>被授权主体</p>
             * <p>This parameter is required.</p>
             */
            public Builder grantees(java.util.List<Grantees> grantees) {
                this.grantees = grantees;
                return this;
            }

            /**
             * <p>授权权限点</p>
             * <p>This parameter is required.</p>
             */
            public Builder permissions(java.util.List<String> permissions) {
                this.permissions = permissions;
                return this;
            }

            /**
             * <p>首段为 APP 应用键的点分资源键</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>app.demo.resource_1</p>
             */
            public Builder resourceKey(String resourceKey) {
                this.resourceKey = resourceKey;
                return this;
            }

            /**
             * <p>固定为 APP_RESOURCE</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>APP_RESOURCE</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
