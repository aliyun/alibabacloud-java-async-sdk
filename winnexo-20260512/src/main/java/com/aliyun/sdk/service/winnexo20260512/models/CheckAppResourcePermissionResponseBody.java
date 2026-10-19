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
 * {@link CheckAppResourcePermissionResponseBody} extends {@link TeaModel}
 *
 * <p>CheckAppResourcePermissionResponseBody</p>
 */
public class CheckAppResourcePermissionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("allowed")
    private Boolean allowed;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("permission")
    private String permission;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resourceKey")
    private String resourceKey;

    @com.aliyun.core.annotation.NameInMap("resourceType")
    private String resourceType;

    private CheckAppResourcePermissionResponseBody(Builder builder) {
        this.allowed = builder.allowed;
        this.code = builder.code;
        this.message = builder.message;
        this.permission = builder.permission;
        this.requestId = builder.requestId;
        this.resourceKey = builder.resourceKey;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckAppResourcePermissionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowed
     */
    public Boolean getAllowed() {
        return this.allowed;
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
     * @return permission
     */
    public String getPermission() {
        return this.permission;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private Boolean allowed; 
        private String code; 
        private String message; 
        private String permission; 
        private String requestId; 
        private String resourceKey; 
        private String resourceType; 

        private Builder() {
        } 

        private Builder(CheckAppResourcePermissionResponseBody model) {
            this.allowed = model.allowed;
            this.code = model.code;
            this.message = model.message;
            this.permission = model.permission;
            this.requestId = model.requestId;
            this.resourceKey = model.resourceKey;
            this.resourceType = model.resourceType;
        } 

        /**
         * <p>目标用户是否拥有该资源权限</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder allowed(Boolean allowed) {
            this.allowed = allowed;
            return this;
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
         * <p>目标权限点</p>
         * 
         * <strong>example:</strong>
         * <p>APP/VIEW</p>
         */
        public Builder permission(String permission) {
            this.permission = permission;
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

        /**
         * <p>首段为 APP 应用键的点分资源键</p>
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
         * 
         * <strong>example:</strong>
         * <p>APP_RESOURCE</p>
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public CheckAppResourcePermissionResponseBody build() {
            return new CheckAppResourcePermissionResponseBody(this);
        } 

    } 

}
