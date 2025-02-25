// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AssociateResponseBody} extends {@link TeaModel}
 *
 * <p>AssociateResponseBody</p>
 */
public class AssociateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Associate")
    private java.util.List < Associate> associate;

    @com.aliyun.core.annotation.NameInMap("MessageId")
    private String messageId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    private AssociateResponseBody(Builder builder) {
        this.associate = builder.associate;
        this.messageId = builder.messageId;
        this.requestId = builder.requestId;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateResponseBody create() {
        return builder().build();
    }

    /**
     * @return associate
     */
    public java.util.List < Associate> getAssociate() {
        return this.associate;
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

    public static final class Builder {
        private java.util.List < Associate> associate; 
        private String messageId; 
        private String requestId; 
        private String sessionId; 

        /**
         * Associate.
         */
        public Builder associate(java.util.List < Associate> associate) {
            this.associate = associate;
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

        public AssociateResponseBody build() {
            return new AssociateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AssociateResponseBody} extends {@link TeaModel}
     *
     * <p>AssociateResponseBody</p>
     */
    public static class Associate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Meta")
        private String meta;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Associate(Builder builder) {
            this.meta = builder.meta;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Associate create() {
            return builder().build();
        }

        /**
         * @return meta
         */
        public String getMeta() {
            return this.meta;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String meta; 
            private String title; 

            /**
             * Meta.
             */
            public Builder meta(String meta) {
                this.meta = meta;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Associate build() {
                return new Associate(this);
            } 

        } 

    }
}
