// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

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
 * {@link UpdateSchemeTaskConfigResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateSchemeTaskConfigResponseBody</p>
 */
public class UpdateSchemeTaskConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Messages")
    private Messages messages;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private UpdateSchemeTaskConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.messages = builder.messages;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSchemeTaskConfigResponseBody create() {
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
     * @return messages
     */
    public Messages getMessages() {
        return this.messages;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private Messages messages; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(UpdateSchemeTaskConfigResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.messages = model.messages;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * Messages.
         */
        public Builder messages(Messages messages) {
            this.messages = messages;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UpdateSchemeTaskConfigResponseBody build() {
            return new UpdateSchemeTaskConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateSchemeTaskConfigResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateSchemeTaskConfigResponseBody</p>
     */
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private java.util.List<String> message;

        private Messages(Builder builder) {
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Messages create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public java.util.List<String> getMessage() {
            return this.message;
        }

        public static final class Builder {
            private java.util.List<String> message; 

            private Builder() {
            } 

            private Builder(Messages model) {
                this.message = model.message;
            } 

            /**
             * Message.
             */
            public Builder message(java.util.List<String> message) {
                this.message = message;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
}
