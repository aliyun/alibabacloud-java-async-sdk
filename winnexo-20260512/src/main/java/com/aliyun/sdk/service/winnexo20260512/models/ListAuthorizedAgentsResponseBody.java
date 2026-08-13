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
 * {@link ListAuthorizedAgentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAuthorizedAgentsResponseBody</p>
 */
public class ListAuthorizedAgentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agentNames")
    private java.util.List<String> agentNames;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListAuthorizedAgentsResponseBody(Builder builder) {
        this.agentNames = builder.agentNames;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuthorizedAgentsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentNames
     */
    public java.util.List<String> getAgentNames() {
        return this.agentNames;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> agentNames; 
        private String code; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAuthorizedAgentsResponseBody model) {
            this.agentNames = model.agentNames;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>有指定权限的数字员工名称列表</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder agentNames(java.util.List<String> agentNames) {
            this.agentNames = agentNames;
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

        public ListAuthorizedAgentsResponseBody build() {
            return new ListAuthorizedAgentsResponseBody(this);
        } 

    } 

}
