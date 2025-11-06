// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp20190901.models;

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
 * {@link GetSendTraceByConnectionAndChannelAndDeliveryTagResponseBody} extends {@link TeaModel}
 *
 * <p>GetSendTraceByConnectionAndChannelAndDeliveryTagResponseBody</p>
 */
public class GetSendTraceByConnectionAndChannelAndDeliveryTagResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetSendTraceByConnectionAndChannelAndDeliveryTagResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSendTraceByConnectionAndChannelAndDeliveryTagResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetSendTraceByConnectionAndChannelAndDeliveryTagResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetSendTraceByConnectionAndChannelAndDeliveryTagResponseBody build() {
            return new GetSendTraceByConnectionAndChannelAndDeliveryTagResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSendTraceByConnectionAndChannelAndDeliveryTagResponseBody} extends {@link TeaModel}
     *
     * <p>GetSendTraceByConnectionAndChannelAndDeliveryTagResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Delay")
        private String delay;

        @com.aliyun.core.annotation.NameInMap("Exchange")
        private String exchange;

        @com.aliyun.core.annotation.NameInMap("Expiration")
        private String expiration;

        @com.aliyun.core.annotation.NameInMap("MessageId")
        private String messageId;

        @com.aliyun.core.annotation.NameInMap("QueueMsgIdMap")
        private java.util.Map<String, ?> queueMsgIdMap;

        @com.aliyun.core.annotation.NameInMap("RemoteAddress")
        private String remoteAddress;

        @com.aliyun.core.annotation.NameInMap("RoutingKey")
        private String routingKey;

        @com.aliyun.core.annotation.NameInMap("SendErrorInfo")
        private String sendErrorInfo;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("Vhost")
        private String vhost;

        @com.aliyun.core.annotation.NameInMap("XDelay")
        private String xDelay;

        private Data(Builder builder) {
            this.code = builder.code;
            this.delay = builder.delay;
            this.exchange = builder.exchange;
            this.expiration = builder.expiration;
            this.messageId = builder.messageId;
            this.queueMsgIdMap = builder.queueMsgIdMap;
            this.remoteAddress = builder.remoteAddress;
            this.routingKey = builder.routingKey;
            this.sendErrorInfo = builder.sendErrorInfo;
            this.timeStamp = builder.timeStamp;
            this.userId = builder.userId;
            this.vhost = builder.vhost;
            this.xDelay = builder.xDelay;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return delay
         */
        public String getDelay() {
            return this.delay;
        }

        /**
         * @return exchange
         */
        public String getExchange() {
            return this.exchange;
        }

        /**
         * @return expiration
         */
        public String getExpiration() {
            return this.expiration;
        }

        /**
         * @return messageId
         */
        public String getMessageId() {
            return this.messageId;
        }

        /**
         * @return queueMsgIdMap
         */
        public java.util.Map<String, ?> getQueueMsgIdMap() {
            return this.queueMsgIdMap;
        }

        /**
         * @return remoteAddress
         */
        public String getRemoteAddress() {
            return this.remoteAddress;
        }

        /**
         * @return routingKey
         */
        public String getRoutingKey() {
            return this.routingKey;
        }

        /**
         * @return sendErrorInfo
         */
        public String getSendErrorInfo() {
            return this.sendErrorInfo;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return vhost
         */
        public String getVhost() {
            return this.vhost;
        }

        /**
         * @return xDelay
         */
        public String getXDelay() {
            return this.xDelay;
        }

        public static final class Builder {
            private String code; 
            private String delay; 
            private String exchange; 
            private String expiration; 
            private String messageId; 
            private java.util.Map<String, ?> queueMsgIdMap; 
            private String remoteAddress; 
            private String routingKey; 
            private String sendErrorInfo; 
            private String timeStamp; 
            private String userId; 
            private String vhost; 
            private String xDelay; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.code = model.code;
                this.delay = model.delay;
                this.exchange = model.exchange;
                this.expiration = model.expiration;
                this.messageId = model.messageId;
                this.queueMsgIdMap = model.queueMsgIdMap;
                this.remoteAddress = model.remoteAddress;
                this.routingKey = model.routingKey;
                this.sendErrorInfo = model.sendErrorInfo;
                this.timeStamp = model.timeStamp;
                this.userId = model.userId;
                this.vhost = model.vhost;
                this.xDelay = model.xDelay;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Delay.
             */
            public Builder delay(String delay) {
                this.delay = delay;
                return this;
            }

            /**
             * Exchange.
             */
            public Builder exchange(String exchange) {
                this.exchange = exchange;
                return this;
            }

            /**
             * Expiration.
             */
            public Builder expiration(String expiration) {
                this.expiration = expiration;
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
             * QueueMsgIdMap.
             */
            public Builder queueMsgIdMap(java.util.Map<String, ?> queueMsgIdMap) {
                this.queueMsgIdMap = queueMsgIdMap;
                return this;
            }

            /**
             * RemoteAddress.
             */
            public Builder remoteAddress(String remoteAddress) {
                this.remoteAddress = remoteAddress;
                return this;
            }

            /**
             * RoutingKey.
             */
            public Builder routingKey(String routingKey) {
                this.routingKey = routingKey;
                return this;
            }

            /**
             * SendErrorInfo.
             */
            public Builder sendErrorInfo(String sendErrorInfo) {
                this.sendErrorInfo = sendErrorInfo;
                return this;
            }

            /**
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * Vhost.
             */
            public Builder vhost(String vhost) {
                this.vhost = vhost;
                return this;
            }

            /**
             * XDelay.
             */
            public Builder xDelay(String xDelay) {
                this.xDelay = xDelay;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
