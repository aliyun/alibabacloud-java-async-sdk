// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

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
 * {@link AssociateResponseBody} extends {@link TeaModel}
 *
 * <p>AssociateResponseBody</p>
 */
public class AssociateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Associate")
    private java.util.List<Associate> associate;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return associate
     */
    public java.util.List<Associate> getAssociate() {
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
        private java.util.List<Associate> associate; 
        private String messageId; 
        private String requestId; 
        private String sessionId; 

        private Builder() {
        } 

        private Builder(AssociateResponseBody model) {
            this.associate = model.associate;
            this.messageId = model.messageId;
            this.requestId = model.requestId;
            this.sessionId = model.sessionId;
        } 

        /**
         * <p>The list of associated suggestions.</p>
         */
        public Builder associate(java.util.List<Associate> associate) {
            this.associate = associate;
            return this;
        }

        /**
         * <p>The ID of the response message in the current session.</p>
         * 
         * <strong>example:</strong>
         * <p>5ADF0EBD-7C50-1922-A28B-43215B47CC1A</p>
         */
        public Builder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5C20F0D4-9721-178A-8236-3BF990634962</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the current session.</p>
         * 
         * <strong>example:</strong>
         * <p>1531ded6b3df4afca4be63943f708bb7</p>
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

            private Builder() {
            } 

            private Builder(Associate model) {
                this.meta = model.meta;
                this.title = model.title;
            } 

            /**
             * <p>The additional information.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder meta(String meta) {
                this.meta = meta;
                return this;
            }

            /**
             * <p>The title of the associated question.</p>
             * 
             * <strong>example:</strong>
             * <p>Housing fund withdrawal policy</p>
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
