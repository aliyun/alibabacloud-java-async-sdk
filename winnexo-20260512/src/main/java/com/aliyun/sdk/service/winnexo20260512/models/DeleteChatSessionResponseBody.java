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
 * {@link DeleteChatSessionResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteChatSessionResponseBody</p>
 */
public class DeleteChatSessionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("deleted")
    private Boolean deleted;

    @com.aliyun.core.annotation.NameInMap("hardDelete")
    private Boolean hardDelete;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    private DeleteChatSessionResponseBody(Builder builder) {
        this.code = builder.code;
        this.deleted = builder.deleted;
        this.hardDelete = builder.hardDelete;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteChatSessionResponseBody create() {
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
     * @return deleted
     */
    public Boolean getDeleted() {
        return this.deleted;
    }

    /**
     * @return hardDelete
     */
    public Boolean getHardDelete() {
        return this.hardDelete;
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
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder {
        private String code; 
        private Boolean deleted; 
        private Boolean hardDelete; 
        private String message; 
        private String requestId; 
        private String sessionId; 

        private Builder() {
        } 

        private Builder(DeleteChatSessionResponseBody model) {
            this.code = model.code;
            this.deleted = model.deleted;
            this.hardDelete = model.hardDelete;
            this.message = model.message;
            this.requestId = model.requestId;
            this.sessionId = model.sessionId;
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
         * <p>是否删除成功</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder deleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }

        /**
         * <p>是否硬删除</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hardDelete(Boolean hardDelete) {
            this.hardDelete = hardDelete;
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
         * <p>会话 ID</p>
         * 
         * <strong>example:</strong>
         * <p>exampleSessionId</p>
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        public DeleteChatSessionResponseBody build() {
            return new DeleteChatSessionResponseBody(this);
        } 

    } 

}
