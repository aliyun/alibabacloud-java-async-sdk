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
 * {@link CheckHealthResponseBody} extends {@link TeaModel}
 *
 * <p>CheckHealthResponseBody</p>
 */
public class CheckHealthResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("authSource")
    private String authSource;

    @com.aliyun.core.annotation.NameInMap("callerType")
    private String callerType;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("digitalEmployeeName")
    private String digitalEmployeeName;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("tenantId")
    private Long tenantId;

    @com.aliyun.core.annotation.NameInMap("userId")
    private Long userId;

    private CheckHealthResponseBody(Builder builder) {
        this.authSource = builder.authSource;
        this.callerType = builder.callerType;
        this.code = builder.code;
        this.digitalEmployeeName = builder.digitalEmployeeName;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.tenantId = builder.tenantId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckHealthResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authSource
     */
    public String getAuthSource() {
        return this.authSource;
    }

    /**
     * @return callerType
     */
    public String getCallerType() {
        return this.callerType;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return digitalEmployeeName
     */
    public String getDigitalEmployeeName() {
        return this.digitalEmployeeName;
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

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String authSource; 
        private String callerType; 
        private String code; 
        private String digitalEmployeeName; 
        private String message; 
        private String requestId; 
        private Long tenantId; 
        private Long userId; 

        private Builder() {
        } 

        private Builder(CheckHealthResponseBody model) {
            this.authSource = model.authSource;
            this.callerType = model.callerType;
            this.code = model.code;
            this.digitalEmployeeName = model.digitalEmployeeName;
            this.message = model.message;
            this.requestId = model.requestId;
            this.tenantId = model.tenantId;
            this.userId = model.userId;
        } 

        /**
         * <p>认证来源: bearer / aliyun_gateway</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_gateway</p>
         */
        public Builder authSource(String authSource) {
            this.authSource = authSource;
            return this;
        }

        /**
         * callerType.
         */
        public Builder callerType(String callerType) {
            this.callerType = callerType;
            return this;
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
         * <p>当前请求生效的数字员工名（运营对象）；未传且租户下无数字员工时为空</p>
         * 
         * <strong>example:</strong>
         * <p>pcitc-magent</p>
         */
        public Builder digitalEmployeeName(String digitalEmployeeName) {
            this.digitalEmployeeName = digitalEmployeeName;
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
         * <p>F4A9EB1C-6952-5CCC-B1DC-355576FC82A7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>生效租户ID</p>
         * 
         * <strong>example:</strong>
         * <p>21577</p>
         */
        public Builder tenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>平台用户ID</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        public CheckHealthResponseBody build() {
            return new CheckHealthResponseBody(this);
        } 

    } 

}
