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
 * {@link ListAgentRuntimeEndpointsResult} extends {@link TeaModel}
 *
 * <p>ListAgentRuntimeEndpointsResult</p>
 */
public class ListAgentRuntimeEndpointsResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private ListAgentRuntimeEndpointsOutput data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListAgentRuntimeEndpointsResult(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentRuntimeEndpointsResult create() {
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
    public ListAgentRuntimeEndpointsOutput getData() {
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
        private ListAgentRuntimeEndpointsOutput data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAgentRuntimeEndpointsResult model) {
            this.code = model.code;
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>SUCCESS 为成功，失败情况返回对应错误类型，比如 ERR_BAD_REQUEST ERR_VALIDATION_FAILED ERR_INTERNAL_SERVER_ERROR</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>智能体运行时端点列表的详细信息</p>
         */
        public Builder data(ListAgentRuntimeEndpointsOutput data) {
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

        public ListAgentRuntimeEndpointsResult build() {
            return new ListAgentRuntimeEndpointsResult(this);
        } 

    } 

}
