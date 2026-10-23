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
 * {@link CountTodosResponseBody} extends {@link TeaModel}
 *
 * <p>CountTodosResponseBody</p>
 */
public class CountTodosResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("pendingCount")
    private Long pendingCount;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("unreadCount")
    private Long unreadCount;

    private CountTodosResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.pendingCount = builder.pendingCount;
        this.requestId = builder.requestId;
        this.unreadCount = builder.unreadCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CountTodosResponseBody create() {
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
     * @return pendingCount
     */
    public Long getPendingCount() {
        return this.pendingCount;
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

    public static final class Builder {
        private String code; 
        private String message; 
        private Long pendingCount; 
        private String requestId; 
        private Long unreadCount; 

        private Builder() {
        } 

        private Builder(CountTodosResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.pendingCount = model.pendingCount;
            this.requestId = model.requestId;
            this.unreadCount = model.unreadCount;
        } 

        /**
         * <p>The business status code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error description.</p>
         * 
         * <strong>example:</strong>
         * <p>The requested resource does not exist</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The number of pending items with the primary status of PENDING.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder pendingCount(Long pendingCount) {
            this.pendingCount = pendingCount;
            return this;
        }

        /**
         * <p>The request tracking ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of unread items where the readAt field of the handler is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder unreadCount(Long unreadCount) {
            this.unreadCount = unreadCount;
            return this;
        }

        public CountTodosResponseBody build() {
            return new CountTodosResponseBody(this);
        } 

    } 

}
