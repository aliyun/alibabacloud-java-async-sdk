// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMessagesResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMessagesResponseBody</p>
 */
public class QueryMessagesResponseBody extends TeaModel {
    @NameInMap("BizMessages")
    private BizMessages bizMessages;

    @NameInMap("Code")
    private String code;

    @NameInMap("LogsId")
    private String logsId;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SubCode")
    private String subCode;

    @NameInMap("SubMessage")
    private String subMessage;

    @NameInMap("Success")
    private Boolean success;

    private QueryMessagesResponseBody(Builder builder) {
        this.bizMessages = builder.bizMessages;
        this.code = builder.code;
        this.logsId = builder.logsId;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.subCode = builder.subCode;
        this.subMessage = builder.subMessage;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMessagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return bizMessages
     */
    public BizMessages getBizMessages() {
        return this.bizMessages;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return logsId
     */
    public String getLogsId() {
        return this.logsId;
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
     * @return subCode
     */
    public String getSubCode() {
        return this.subCode;
    }

    /**
     * @return subMessage
     */
    public String getSubMessage() {
        return this.subMessage;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private BizMessages bizMessages; 
        private String code; 
        private String logsId; 
        private String message; 
        private String requestId; 
        private String subCode; 
        private String subMessage; 
        private Boolean success; 

        /**
         * BizMessages.
         */
        public Builder bizMessages(BizMessages bizMessages) {
            this.bizMessages = bizMessages;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * LogsId.
         */
        public Builder logsId(String logsId) {
            this.logsId = logsId;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SubCode.
         */
        public Builder subCode(String subCode) {
            this.subCode = subCode;
            return this;
        }

        /**
         * SubMessage.
         */
        public Builder subMessage(String subMessage) {
            this.subMessage = subMessage;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryMessagesResponseBody build() {
            return new QueryMessagesResponseBody(this);
        } 

    } 

    public static class BizMessage extends TeaModel {
        @NameInMap("ContentMapJson")
        private String contentMapJson;

        @NameInMap("DataId")
        private Long dataId;

        @NameInMap("PubTime")
        private String pubTime;

        @NameInMap("Topic")
        private String topic;

        private BizMessage(Builder builder) {
            this.contentMapJson = builder.contentMapJson;
            this.dataId = builder.dataId;
            this.pubTime = builder.pubTime;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BizMessage create() {
            return builder().build();
        }

        /**
         * @return contentMapJson
         */
        public String getContentMapJson() {
            return this.contentMapJson;
        }

        /**
         * @return dataId
         */
        public Long getDataId() {
            return this.dataId;
        }

        /**
         * @return pubTime
         */
        public String getPubTime() {
            return this.pubTime;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private String contentMapJson; 
            private Long dataId; 
            private String pubTime; 
            private String topic; 

            /**
             * ContentMapJson.
             */
            public Builder contentMapJson(String contentMapJson) {
                this.contentMapJson = contentMapJson;
                return this;
            }

            /**
             * DataId.
             */
            public Builder dataId(Long dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * PubTime.
             */
            public Builder pubTime(String pubTime) {
                this.pubTime = pubTime;
                return this;
            }

            /**
             * Topic.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            public BizMessage build() {
                return new BizMessage(this);
            } 

        } 

    }
    public static class BizMessages extends TeaModel {
        @NameInMap("BizMessage")
        private java.util.List < BizMessage> bizMessage;

        private BizMessages(Builder builder) {
            this.bizMessage = builder.bizMessage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BizMessages create() {
            return builder().build();
        }

        /**
         * @return bizMessage
         */
        public java.util.List < BizMessage> getBizMessage() {
            return this.bizMessage;
        }

        public static final class Builder {
            private java.util.List < BizMessage> bizMessage; 

            /**
             * BizMessage.
             */
            public Builder bizMessage(java.util.List < BizMessage> bizMessage) {
                this.bizMessage = bizMessage;
                return this;
            }

            public BizMessages build() {
                return new BizMessages(this);
            } 

        } 

    }
}
