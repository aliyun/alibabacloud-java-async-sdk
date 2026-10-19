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
 * {@link RegisterAppResourcePermissionsResponseBody} extends {@link TeaModel}
 *
 * <p>RegisterAppResourcePermissionsResponseBody</p>
 */
public class RegisterAppResourcePermissionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("records")
    private java.util.List<Records> records;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private RegisterAppResourcePermissionsResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.records = builder.records;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterAppResourcePermissionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return records
     */
    public java.util.List<Records> getRecords() {
        return this.records;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private java.util.List<Records> records; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(RegisterAppResourcePermissionsResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.records = model.records;
            this.requestId = model.requestId;
        } 

        /**
         * <p>业务状态码；成功为 200</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>错误描述；成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>请求的资源不存在</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>新建或幂等命中的权限记录</p>
         */
        public Builder records(java.util.List<Records> records) {
            this.records = records;
            return this;
        }

        /**
         * <p>请求追踪 ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RegisterAppResourcePermissionsResponseBody build() {
            return new RegisterAppResourcePermissionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RegisterAppResourcePermissionsResponseBody} extends {@link TeaModel}
     *
     * <p>RegisterAppResourcePermissionsResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("expireAt")
        private String expireAt;

        @com.aliyun.core.annotation.NameInMap("grantedBy")
        private String grantedBy;

        @com.aliyun.core.annotation.NameInMap("granteeId")
        private String granteeId;

        @com.aliyun.core.annotation.NameInMap("granteeName")
        private String granteeName;

        @com.aliyun.core.annotation.NameInMap("granteeTenantId")
        private String granteeTenantId;

        @com.aliyun.core.annotation.NameInMap("granteeType")
        private String granteeType;

        @com.aliyun.core.annotation.NameInMap("permission")
        private String permission;

        @com.aliyun.core.annotation.NameInMap("permissionId")
        private Long permissionId;

        @com.aliyun.core.annotation.NameInMap("resourceKey")
        private String resourceKey;

        @com.aliyun.core.annotation.NameInMap("resourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        private Records(Builder builder) {
            this.createdAt = builder.createdAt;
            this.expireAt = builder.expireAt;
            this.grantedBy = builder.grantedBy;
            this.granteeId = builder.granteeId;
            this.granteeName = builder.granteeName;
            this.granteeTenantId = builder.granteeTenantId;
            this.granteeType = builder.granteeType;
            this.permission = builder.permission;
            this.permissionId = builder.permissionId;
            this.resourceKey = builder.resourceKey;
            this.resourceType = builder.resourceType;
            this.updatedAt = builder.updatedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return expireAt
         */
        public String getExpireAt() {
            return this.expireAt;
        }

        /**
         * @return grantedBy
         */
        public String getGrantedBy() {
            return this.grantedBy;
        }

        /**
         * @return granteeId
         */
        public String getGranteeId() {
            return this.granteeId;
        }

        /**
         * @return granteeName
         */
        public String getGranteeName() {
            return this.granteeName;
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
         * @return permission
         */
        public String getPermission() {
            return this.permission;
        }

        /**
         * @return permissionId
         */
        public Long getPermissionId() {
            return this.permissionId;
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

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public static final class Builder {
            private String createdAt; 
            private String expireAt; 
            private String grantedBy; 
            private String granteeId; 
            private String granteeName; 
            private String granteeTenantId; 
            private String granteeType; 
            private String permission; 
            private Long permissionId; 
            private String resourceKey; 
            private String resourceType; 
            private String updatedAt; 

            private Builder() {
            } 

            private Builder(Records model) {
                this.createdAt = model.createdAt;
                this.expireAt = model.expireAt;
                this.grantedBy = model.grantedBy;
                this.granteeId = model.granteeId;
                this.granteeName = model.granteeName;
                this.granteeTenantId = model.granteeTenantId;
                this.granteeType = model.granteeType;
                this.permission = model.permission;
                this.permissionId = model.permissionId;
                this.resourceKey = model.resourceKey;
                this.resourceType = model.resourceType;
                this.updatedAt = model.updatedAt;
            } 

            /**
             * <p>创建时间</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-16T10:30:00+08:00</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>到期时间</p>
             * 
             * <strong>example:</strong>
             * <p>2026-12-31T23:59:59+08:00</p>
             */
            public Builder expireAt(String expireAt) {
                this.expireAt = expireAt;
                return this;
            }

            /**
             * <p>授权人平台用户 ID</p>
             * 
             * <strong>example:</strong>
             * <p>10086</p>
             */
            public Builder grantedBy(String grantedBy) {
                this.grantedBy = grantedBy;
                return this;
            }

            /**
             * <p>主体 ID</p>
             * 
             * <strong>example:</strong>
             * <p>10086</p>
             */
            public Builder granteeId(String granteeId) {
                this.granteeId = granteeId;
                return this;
            }

            /**
             * <p>主体名称</p>
             * 
             * <strong>example:</strong>
             * <p>张三</p>
             */
            public Builder granteeName(String granteeName) {
                this.granteeName = granteeName;
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
             * 
             * <strong>example:</strong>
             * <p>USER</p>
             */
            public Builder granteeType(String granteeType) {
                this.granteeType = granteeType;
                return this;
            }

            /**
             * <p>权限点</p>
             * 
             * <strong>example:</strong>
             * <p>APP/VIEW</p>
             */
            public Builder permission(String permission) {
                this.permission = permission;
                return this;
            }

            /**
             * <p>权限记录 ID</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder permissionId(Long permissionId) {
                this.permissionId = permissionId;
                return this;
            }

            /**
             * <p>资源键</p>
             * 
             * <strong>example:</strong>
             * <p>app.demo.resource_1</p>
             */
            public Builder resourceKey(String resourceKey) {
                this.resourceKey = resourceKey;
                return this;
            }

            /**
             * <p>资源类型</p>
             * 
             * <strong>example:</strong>
             * <p>APP_RESOURCE</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>更新时间</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-16T10:30:00+08:00</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
}
