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
 * {@link MarkTodosReadResponseBody} extends {@link TeaModel}
 *
 * <p>MarkTodosReadResponseBody</p>
 */
public class MarkTodosReadResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("unreadCount")
    private Long unreadCount;

    @com.aliyun.core.annotation.NameInMap("updatedCount")
    private Long updatedCount;

    private MarkTodosReadResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.unreadCount = builder.unreadCount;
        this.updatedCount = builder.updatedCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MarkTodosReadResponseBody create() {
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
     * @return unreadCount
     */
    public Long getUnreadCount() {
        return this.unreadCount;
    }

    /**
     * @return updatedCount
     */
    public Long getUpdatedCount() {
        return this.updatedCount;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Long unreadCount; 
        private Long updatedCount; 

        private Builder() {
        } 

        private Builder(MarkTodosReadResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.unreadCount = model.unreadCount;
            this.updatedCount = model.updatedCount;
        } 

        /**
         * <p>业务状态码；成功为200</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>错误描述</p>
         * 
         * <strong>example:</strong>
         * <p>请求的资源不存在</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>请求追踪ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>标记后剩余未读数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder unreadCount(Long unreadCount) {
            this.unreadCount = unreadCount;
            return this;
        }

        /**
         * <p>本次标记条数</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder updatedCount(Long updatedCount) {
            this.updatedCount = updatedCount;
            return this;
        }

        public MarkTodosReadResponseBody build() {
            return new MarkTodosReadResponseBody(this);
        } 

    } 

}
