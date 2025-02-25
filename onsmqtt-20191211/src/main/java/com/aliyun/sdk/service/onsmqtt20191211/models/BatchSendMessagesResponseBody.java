// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20191211.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchSendMessagesResponseBody} extends {@link TeaModel}
 *
 * <p>BatchSendMessagesResponseBody</p>
 */
public class BatchSendMessagesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Responses")
    private java.util.List < Responses> responses;

    private BatchSendMessagesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.responses = builder.responses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchSendMessagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return responses
     */
    public java.util.List < Responses> getResponses() {
        return this.responses;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Responses> responses; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Responses.
         */
        public Builder responses(java.util.List < Responses> responses) {
            this.responses = responses;
            return this;
        }

        public BatchSendMessagesResponseBody build() {
            return new BatchSendMessagesResponseBody(this);
        } 

    } 

    public static class Responses extends TeaModel {
        @NameInMap("ErrorCode")
        private Integer errorCode;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Id")
        private Integer id;

        @NameInMap("MsgId")
        private String msgId;

        private Responses(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.id = builder.id;
            this.msgId = builder.msgId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Responses create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public Integer getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return msgId
         */
        public String getMsgId() {
            return this.msgId;
        }

        public static final class Builder {
            private Integer errorCode; 
            private String errorMessage; 
            private Integer id; 
            private String msgId; 

            /**
             * ErrorCode.
             */
            public Builder errorCode(Integer errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * MsgId.
             */
            public Builder msgId(String msgId) {
                this.msgId = msgId;
                return this;
            }

            public Responses build() {
                return new Responses(this);
            } 

        } 

    }
}
