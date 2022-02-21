// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssociateResponseBody} extends {@link TeaModel}
 *
 * <p>AssociateResponseBody</p>
 */
public class AssociateResponseBody extends TeaModel {
    @NameInMap("Associate")
    private java.util.List < Associate> associate;

    @NameInMap("MessageId")
    private String messageId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SessionId")
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

    public static class Associate extends TeaModel {
        @NameInMap("Title")
        private String title;

        private Associate(Builder builder) {
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Associate create() {
            return builder().build();
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String title; 

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
