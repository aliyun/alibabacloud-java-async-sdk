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
 * {@link CheckAppResourcePermissionsBatchRequest} extends {@link RequestModel}
 *
 * <p>CheckAppResourcePermissionsBatchRequest</p>
 */
public class CheckAppResourcePermissionsBatchRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("checks")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Checks> checks;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceTenantId")
    private String resourceTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetUserId")
    private Long targetUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetUserTenantId")
    private String targetUserTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private CheckAppResourcePermissionsBatchRequest(Builder builder) {
        super(builder);
        this.checks = builder.checks;
        this.resourceTenantId = builder.resourceTenantId;
        this.targetUserId = builder.targetUserId;
        this.targetUserTenantId = builder.targetUserTenantId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckAppResourcePermissionsBatchRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checks
     */
    public java.util.List<Checks> getChecks() {
        return this.checks;
    }

    /**
     * @return resourceTenantId
     */
    public String getResourceTenantId() {
        return this.resourceTenantId;
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

    public static final class Builder extends Request.Builder<CheckAppResourcePermissionsBatchRequest, Builder> {
        private java.util.List<Checks> checks; 
        private String resourceTenantId; 
        private Long targetUserId; 
        private String targetUserTenantId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(CheckAppResourcePermissionsBatchRequest request) {
            super(request);
            this.checks = request.checks;
            this.resourceTenantId = request.resourceTenantId;
            this.targetUserId = request.targetUserId;
            this.targetUserTenantId = request.targetUserTenantId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>检查项</p>
         * <p>This parameter is required.</p>
         */
        public Builder checks(java.util.List<Checks> checks) {
            String checksShrink = shrink(checks, "checks", "json");
            this.putBodyParameter("checks", checksShrink);
            this.checks = checks;
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
         * <p>目标平台用户 ID</p>
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
         * <p>目标用户所属租户；跨租户目标必填</p>
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
        public CheckAppResourcePermissionsBatchRequest build() {
            return new CheckAppResourcePermissionsBatchRequest(this);
        } 

    } 

    /**
     * 
     * {@link CheckAppResourcePermissionsBatchRequest} extends {@link TeaModel}
     *
     * <p>CheckAppResourcePermissionsBatchRequest</p>
     */
    public static class Checks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("permission")
        @com.aliyun.core.annotation.Validation(required = true)
        private String permission;

        @com.aliyun.core.annotation.NameInMap("resourceKey")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceKey;

        @com.aliyun.core.annotation.NameInMap("resourceType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceType;

        private Checks(Builder builder) {
            this.permission = builder.permission;
            this.resourceKey = builder.resourceKey;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Checks create() {
            return builder().build();
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
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String permission; 
            private String resourceKey; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(Checks model) {
                this.permission = model.permission;
                this.resourceKey = model.resourceKey;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>目标权限点</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>APP/VIEW</p>
             */
            public Builder permission(String permission) {
                this.permission = permission;
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

            public Checks build() {
                return new Checks(this);
            } 

        } 

    }
}
