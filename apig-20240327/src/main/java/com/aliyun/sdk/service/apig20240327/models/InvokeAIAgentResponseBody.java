// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link InvokeAIAgentResponseBody} extends {@link TeaModel}
 *
 * <p>InvokeAIAgentResponseBody</p>
 */
public class InvokeAIAgentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private InvokeAIAgentResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvokeAIAgentResponseBody create() {
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
    public Data getData() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(InvokeAIAgentResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
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
         * <p>Id of the request</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public InvokeAIAgentResponseBody build() {
            return new InvokeAIAgentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link InvokeAIAgentResponseBody} extends {@link TeaModel}
     *
     * <p>InvokeAIAgentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("body")
        private String body;

        @com.aliyun.core.annotation.NameInMap("headers")
        private java.util.Map<String, String> headers;

        @com.aliyun.core.annotation.NameInMap("httpCode")
        private Integer httpCode;

        private Data(Builder builder) {
            this.body = builder.body;
            this.headers = builder.headers;
            this.httpCode = builder.httpCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return body
         */
        public String getBody() {
            return this.body;
        }

        /**
         * @return headers
         */
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        /**
         * @return httpCode
         */
        public Integer getHttpCode() {
            return this.httpCode;
        }

        public static final class Builder {
            private String body; 
            private java.util.Map<String, String> headers; 
            private Integer httpCode; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.body = model.body;
                this.headers = model.headers;
                this.httpCode = model.httpCode;
            } 

            /**
             * body.
             */
            public Builder body(String body) {
                this.body = body;
                return this;
            }

            /**
             * headers.
             */
            public Builder headers(java.util.Map<String, String> headers) {
                this.headers = headers;
                return this;
            }

            /**
             * httpCode.
             */
            public Builder httpCode(Integer httpCode) {
                this.httpCode = httpCode;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
