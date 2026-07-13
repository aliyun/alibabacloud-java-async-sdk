// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bdrc20230808.models;

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
 * {@link GetMessageResponseBody} extends {@link TeaModel}
 *
 * <p>GetMessageResponseBody</p>
 */
public class GetMessageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetMessageResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMessageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetMessageResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMessageResponseBody build() {
            return new GetMessageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMessageResponseBody} extends {@link TeaModel}
     *
     * <p>GetMessageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MessageContent")
        private String messageContent;

        @com.aliyun.core.annotation.NameInMap("MessageId")
        private String messageId;

        @com.aliyun.core.annotation.NameInMap("MessageLevel")
        private String messageLevel;

        @com.aliyun.core.annotation.NameInMap("MessageName")
        private String messageName;

        @com.aliyun.core.annotation.NameInMap("MessageSourceId")
        private String messageSourceId;

        @com.aliyun.core.annotation.NameInMap("MessageSourceRegionId")
        private String messageSourceRegionId;

        @com.aliyun.core.annotation.NameInMap("MessageSourceType")
        private String messageSourceType;

        @com.aliyun.core.annotation.NameInMap("MessageTime")
        private Long messageTime;

        @com.aliyun.core.annotation.NameInMap("MessageType")
        private String messageType;

        private Data(Builder builder) {
            this.messageContent = builder.messageContent;
            this.messageId = builder.messageId;
            this.messageLevel = builder.messageLevel;
            this.messageName = builder.messageName;
            this.messageSourceId = builder.messageSourceId;
            this.messageSourceRegionId = builder.messageSourceRegionId;
            this.messageSourceType = builder.messageSourceType;
            this.messageTime = builder.messageTime;
            this.messageType = builder.messageType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return messageContent
         */
        public String getMessageContent() {
            return this.messageContent;
        }

        /**
         * @return messageId
         */
        public String getMessageId() {
            return this.messageId;
        }

        /**
         * @return messageLevel
         */
        public String getMessageLevel() {
            return this.messageLevel;
        }

        /**
         * @return messageName
         */
        public String getMessageName() {
            return this.messageName;
        }

        /**
         * @return messageSourceId
         */
        public String getMessageSourceId() {
            return this.messageSourceId;
        }

        /**
         * @return messageSourceRegionId
         */
        public String getMessageSourceRegionId() {
            return this.messageSourceRegionId;
        }

        /**
         * @return messageSourceType
         */
        public String getMessageSourceType() {
            return this.messageSourceType;
        }

        /**
         * @return messageTime
         */
        public Long getMessageTime() {
            return this.messageTime;
        }

        /**
         * @return messageType
         */
        public String getMessageType() {
            return this.messageType;
        }

        public static final class Builder {
            private String messageContent; 
            private String messageId; 
            private String messageLevel; 
            private String messageName; 
            private String messageSourceId; 
            private String messageSourceRegionId; 
            private String messageSourceType; 
            private Long messageTime; 
            private String messageType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.messageContent = model.messageContent;
                this.messageId = model.messageId;
                this.messageLevel = model.messageLevel;
                this.messageName = model.messageName;
                this.messageSourceId = model.messageSourceId;
                this.messageSourceRegionId = model.messageSourceRegionId;
                this.messageSourceType = model.messageSourceType;
                this.messageTime = model.messageTime;
                this.messageType = model.messageType;
            } 

            /**
             * MessageContent.
             */
            public Builder messageContent(String messageContent) {
                this.messageContent = messageContent;
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
             * MessageLevel.
             */
            public Builder messageLevel(String messageLevel) {
                this.messageLevel = messageLevel;
                return this;
            }

            /**
             * MessageName.
             */
            public Builder messageName(String messageName) {
                this.messageName = messageName;
                return this;
            }

            /**
             * MessageSourceId.
             */
            public Builder messageSourceId(String messageSourceId) {
                this.messageSourceId = messageSourceId;
                return this;
            }

            /**
             * MessageSourceRegionId.
             */
            public Builder messageSourceRegionId(String messageSourceRegionId) {
                this.messageSourceRegionId = messageSourceRegionId;
                return this;
            }

            /**
             * MessageSourceType.
             */
            public Builder messageSourceType(String messageSourceType) {
                this.messageSourceType = messageSourceType;
                return this;
            }

            /**
             * MessageTime.
             */
            public Builder messageTime(Long messageTime) {
                this.messageTime = messageTime;
                return this;
            }

            /**
             * MessageType.
             */
            public Builder messageType(String messageType) {
                this.messageType = messageType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
