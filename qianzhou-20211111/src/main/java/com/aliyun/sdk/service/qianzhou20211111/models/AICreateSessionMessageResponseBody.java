// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qianzhou20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AICreateSessionMessageResponseBody} extends {@link TeaModel}
 *
 * <p>AICreateSessionMessageResponseBody</p>
 */
public class AICreateSessionMessageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("answer")
    private String answer;

    @com.aliyun.core.annotation.NameInMap("code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("reference")
    private java.util.List < Reference> reference;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("session_id")
    private String sessionId;

    private AICreateSessionMessageResponseBody(Builder builder) {
        this.answer = builder.answer;
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.reference = builder.reference;
        this.requestId = builder.requestId;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AICreateSessionMessageResponseBody create() {
        return builder().build();
    }

    /**
     * @return answer
     */
    public String getAnswer() {
        return this.answer;
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return reference
     */
    public java.util.List < Reference> getReference() {
        return this.reference;
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
        private String answer; 
        private Long code; 
        private String data; 
        private String msg; 
        private java.util.List < Reference> reference; 
        private String requestId; 
        private String sessionId; 

        /**
         * answer.
         */
        public Builder answer(String answer) {
            this.answer = answer;
            return this;
        }

        /**
         * code.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * reference.
         */
        public Builder reference(java.util.List < Reference> reference) {
            this.reference = reference;
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
         * session_id.
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        public AICreateSessionMessageResponseBody build() {
            return new AICreateSessionMessageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AICreateSessionMessageResponseBody} extends {@link TeaModel}
     *
     * <p>AICreateSessionMessageResponseBody</p>
     */
    public static class Reference extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Reference(Builder builder) {
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Reference create() {
            return builder().build();
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String title; 
            private String url; 

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Reference build() {
                return new Reference(this);
            } 

        } 

    }
}
