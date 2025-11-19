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
 * {@link SandboxResult} extends {@link TeaModel}
 *
 * <p>SandboxResult</p>
 */
public class SandboxResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    @com.aliyun.core.annotation.Validation(required = true)
    private Sandbox data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private SandboxResult(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SandboxResult create() {
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
     * @return data
     */
    public Sandbox getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Sandbox data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(SandboxResult model) {
            this.code = model.code;
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>SUCCESS 为成功，失败情况返回对应错误类型</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>沙箱的详细信息</p>
         * <p>This parameter is required.</p>
         */
        public Builder data(Sandbox data) {
            this.data = data;
            return this;
        }

        /**
         * <p>唯一的请求标识符，用于问题追踪</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SandboxResult build() {
            return new SandboxResult(this);
        } 

    } 

}
