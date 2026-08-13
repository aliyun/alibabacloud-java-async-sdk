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
 * {@link UpdateAgentAuthModeResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateAgentAuthModeResponseBody</p>
 */
public class UpdateAgentAuthModeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("updated")
    private Boolean updated;

    private UpdateAgentAuthModeResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.updated = builder.updated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAgentAuthModeResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return updated
     */
    public Boolean getUpdated() {
        return this.updated;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Boolean updated; 

        private Builder() {
        } 

        private Builder(UpdateAgentAuthModeResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.updated = model.updated;
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

        /**
         * <p>是否更新成功</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder updated(Boolean updated) {
            this.updated = updated;
            return this;
        }

        public UpdateAgentAuthModeResponseBody build() {
            return new UpdateAgentAuthModeResponseBody(this);
        } 

    } 

}
