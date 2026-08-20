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
 * {@link SendChatMessageResponseBody} extends {@link TeaModel}
 *
 * <p>SendChatMessageResponseBody</p>
 */
public class SendChatMessageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    @Deprecated
    private String code;

    @com.aliyun.core.annotation.NameInMap("content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("data")
    private Object data;

    @com.aliyun.core.annotation.NameInMap("message")
    @Deprecated
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    @Deprecated
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private SendChatMessageResponseBody(Builder builder) {
        this.code = builder.code;
        this.content = builder.content;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendChatMessageResponseBody create() {
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
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return data
     */
    public Object getData() {
        return this.data;
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String code; 
        private String content; 
        private Object data; 
        private String message; 
        private String requestId; 
        private String type; 

        private Builder() {
        } 

        private Builder(SendChatMessageResponseBody model) {
            this.code = model.code;
            this.content = model.content;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.type = model.type;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Object data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public SendChatMessageResponseBody build() {
            return new SendChatMessageResponseBody(this);
        } 

    } 

}
