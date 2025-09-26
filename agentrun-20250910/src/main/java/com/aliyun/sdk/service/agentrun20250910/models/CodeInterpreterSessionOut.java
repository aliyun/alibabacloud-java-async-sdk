// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link CodeInterpreterSessionOut} extends {@link TeaModel}
 *
 * <p>CodeInterpreterSessionOut</p>
 */
public class CodeInterpreterSessionOut extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("codeInterpreterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String codeInterpreterId;

    @com.aliyun.core.annotation.NameInMap("codeInterpreterName")
    private String codeInterpreterName;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("lastUpdatedAt")
    private String lastUpdatedAt;

    @com.aliyun.core.annotation.NameInMap("sessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    @com.aliyun.core.annotation.NameInMap("sessionIdleTimeoutSeconds")
    private Integer sessionIdleTimeoutSeconds;

    @com.aliyun.core.annotation.NameInMap("status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    private CodeInterpreterSessionOut(Builder builder) {
        this.codeInterpreterId = builder.codeInterpreterId;
        this.codeInterpreterName = builder.codeInterpreterName;
        this.createdAt = builder.createdAt;
        this.lastUpdatedAt = builder.lastUpdatedAt;
        this.sessionId = builder.sessionId;
        this.sessionIdleTimeoutSeconds = builder.sessionIdleTimeoutSeconds;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CodeInterpreterSessionOut create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return codeInterpreterId
     */
    public String getCodeInterpreterId() {
        return this.codeInterpreterId;
    }

    /**
     * @return codeInterpreterName
     */
    public String getCodeInterpreterName() {
        return this.codeInterpreterName;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return lastUpdatedAt
     */
    public String getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return sessionIdleTimeoutSeconds
     */
    public Integer getSessionIdleTimeoutSeconds() {
        return this.sessionIdleTimeoutSeconds;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String codeInterpreterId; 
        private String codeInterpreterName; 
        private String createdAt; 
        private String lastUpdatedAt; 
        private String sessionId; 
        private Integer sessionIdleTimeoutSeconds; 
        private String status; 

        private Builder() {
        } 

        private Builder(CodeInterpreterSessionOut model) {
            this.codeInterpreterId = model.codeInterpreterId;
            this.codeInterpreterName = model.codeInterpreterName;
            this.createdAt = model.createdAt;
            this.lastUpdatedAt = model.lastUpdatedAt;
            this.sessionId = model.sessionId;
            this.sessionIdleTimeoutSeconds = model.sessionIdleTimeoutSeconds;
            this.status = model.status;
        } 

        /**
         * <p>关联的代码解释器的唯一标识符</p>
         * <p>This parameter is required.</p>
         */
        public Builder codeInterpreterId(String codeInterpreterId) {
            this.codeInterpreterId = codeInterpreterId;
            return this;
        }

        /**
         * <p>代码解释器会话的名称</p>
         */
        public Builder codeInterpreterName(String codeInterpreterName) {
            this.codeInterpreterName = codeInterpreterName;
            return this;
        }

        /**
         * <p>代码解释器会话的创建时间，采用ISO 8601格式</p>
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>代码解释器会话的最后更新时间，采用ISO 8601格式</p>
         */
        public Builder lastUpdatedAt(String lastUpdatedAt) {
            this.lastUpdatedAt = lastUpdatedAt;
            return this;
        }

        /**
         * <p>代码解释器会话的唯一标识符</p>
         * <p>This parameter is required.</p>
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>代码解释器会话的空闲超时时间，单位为秒。实例没有会话请求后处于空闲状态，空闲态为闲置计费模式，超过此超时时间后会话自动过期，不可继续使用</p>
         */
        public Builder sessionIdleTimeoutSeconds(Integer sessionIdleTimeoutSeconds) {
            this.sessionIdleTimeoutSeconds = sessionIdleTimeoutSeconds;
            return this;
        }

        /**
         * <p>代码解释器会话的当前状态</p>
         * <p>This parameter is required.</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public CodeInterpreterSessionOut build() {
            return new CodeInterpreterSessionOut(this);
        } 

    } 

}
