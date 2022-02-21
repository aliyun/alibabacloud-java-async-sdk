// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DirectDialogueResponseBody} extends {@link TeaModel}
 *
 * <p>DirectDialogueResponseBody</p>
 */
public class DirectDialogueResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Content")
    private String content;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("MessageId")
    private String messageId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SessionId")
    private String sessionId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Type")
    private String type;

    private DirectDialogueResponseBody(Builder builder) {
        this.code = builder.code;
        this.content = builder.content;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.messageId = builder.messageId;
        this.requestId = builder.requestId;
        this.sessionId = builder.sessionId;
        this.success = builder.success;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DirectDialogueResponseBody create() {
        return builder().build();
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
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
        private Integer httpStatusCode; 
        private String message; 
        private String messageId; 
        private String requestId; 
        private String sessionId; 
        private Boolean success; 
        private String type; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * MessageId.
         */
        public Builder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public DirectDialogueResponseBody build() {
            return new DirectDialogueResponseBody(this);
        } 

    } 

}
