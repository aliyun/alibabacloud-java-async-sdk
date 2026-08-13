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
 * {@link GetInstanceExpireTimeResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceExpireTimeResponseBody</p>
 */
public class GetInstanceExpireTimeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("found")
    private Boolean found;

    @com.aliyun.core.annotation.NameInMap("instanceExpireTime")
    private String instanceExpireTime;

    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("instanceStatus")
    private String instanceStatus;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("tenantId")
    private Long tenantId;

    private GetInstanceExpireTimeResponseBody(Builder builder) {
        this.code = builder.code;
        this.found = builder.found;
        this.instanceExpireTime = builder.instanceExpireTime;
        this.instanceId = builder.instanceId;
        this.instanceStatus = builder.instanceStatus;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceExpireTimeResponseBody create() {
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
     * @return found
     */
    public Boolean getFound() {
        return this.found;
    }

    /**
     * @return instanceExpireTime
     */
    public String getInstanceExpireTime() {
        return this.instanceExpireTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceStatus
     */
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
    }

    public static final class Builder {
        private String code; 
        private Boolean found; 
        private String instanceExpireTime; 
        private String instanceId; 
        private String instanceStatus; 
        private String message; 
        private String requestId; 
        private Long tenantId; 

        private Builder() {
        } 

        private Builder(GetInstanceExpireTimeResponseBody model) {
            this.code = model.code;
            this.found = model.found;
            this.instanceExpireTime = model.instanceExpireTime;
            this.instanceId = model.instanceId;
            this.instanceStatus = model.instanceStatus;
            this.message = model.message;
            this.requestId = model.requestId;
            this.tenantId = model.tenantId;
        } 

        /**
         * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>是否找到标准包实例</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder found(Boolean found) {
            this.found = found;
            return this;
        }

        /**
         * <p>实例过期时间（ISO格式）</p>
         * 
         * <strong>example:</strong>
         * <p>2023-10-01T12:00:00Z</p>
         */
        public Builder instanceExpireTime(String instanceExpireTime) {
            this.instanceExpireTime = instanceExpireTime;
            return this;
        }

        /**
         * <p>实例ID</p>
         * 
         * <strong>example:</strong>
         * <p>exampleInstanceId</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>实例状态</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder instanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }

        /**
         * <p>错误描述，成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
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
         * <p>系统租户ID</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public GetInstanceExpireTimeResponseBody build() {
            return new GetInstanceExpireTimeResponseBody(this);
        } 

    } 

}
