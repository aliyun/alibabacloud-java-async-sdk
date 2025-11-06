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
 * {@link GetConsumeTraceByQueueAndRocketMqMsgIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetConsumeTraceByQueueAndRocketMqMsgIdResponseBody</p>
 */
public class GetConsumeTraceByQueueAndRocketMqMsgIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetConsumeTraceByQueueAndRocketMqMsgIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConsumeTraceByQueueAndRocketMqMsgIdResponseBody create() {
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetConsumeTraceByQueueAndRocketMqMsgIdResponseBody model) {
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
        public Builder data(java.util.List<Data> data) {
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

        public GetConsumeTraceByQueueAndRocketMqMsgIdResponseBody build() {
            return new GetConsumeTraceByQueueAndRocketMqMsgIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetConsumeTraceByQueueAndRocketMqMsgIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetConsumeTraceByQueueAndRocketMqMsgIdResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoAckTag")
        private String autoAckTag;

        @com.aliyun.core.annotation.NameInMap("ClientAddress")
        private String clientAddress;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("ConsumeType")
        private String consumeType;

        @com.aliyun.core.annotation.NameInMap("ConsumerTag")
        private String consumerTag;

        @com.aliyun.core.annotation.NameInMap("CurrentStatus")
        private String currentStatus;

        @com.aliyun.core.annotation.NameInMap("DeliveryErrorInfo")
        private String deliveryErrorInfo;

        @com.aliyun.core.annotation.NameInMap("DeliveryTag")
        private String deliveryTag;

        @com.aliyun.core.annotation.NameInMap("DlqQueueMsgIdMap")
        private java.util.Map<String, ?> dlqQueueMsgIdMap;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("ShowAckIcon")
        private Boolean showAckIcon;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Data(Builder builder) {
            this.autoAckTag = builder.autoAckTag;
            this.clientAddress = builder.clientAddress;
            this.code = builder.code;
            this.consumeType = builder.consumeType;
            this.consumerTag = builder.consumerTag;
            this.currentStatus = builder.currentStatus;
            this.deliveryErrorInfo = builder.deliveryErrorInfo;
            this.deliveryTag = builder.deliveryTag;
            this.dlqQueueMsgIdMap = builder.dlqQueueMsgIdMap;
            this.reason = builder.reason;
            this.showAckIcon = builder.showAckIcon;
            this.timeStamp = builder.timeStamp;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return autoAckTag
         */
        public String getAutoAckTag() {
            return this.autoAckTag;
        }

        /**
         * @return clientAddress
         */
        public String getClientAddress() {
            return this.clientAddress;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return consumeType
         */
        public String getConsumeType() {
            return this.consumeType;
        }

        /**
         * @return consumerTag
         */
        public String getConsumerTag() {
            return this.consumerTag;
        }

        /**
         * @return currentStatus
         */
        public String getCurrentStatus() {
            return this.currentStatus;
        }

        /**
         * @return deliveryErrorInfo
         */
        public String getDeliveryErrorInfo() {
            return this.deliveryErrorInfo;
        }

        /**
         * @return deliveryTag
         */
        public String getDeliveryTag() {
            return this.deliveryTag;
        }

        /**
         * @return dlqQueueMsgIdMap
         */
        public java.util.Map<String, ?> getDlqQueueMsgIdMap() {
            return this.dlqQueueMsgIdMap;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return showAckIcon
         */
        public Boolean getShowAckIcon() {
            return this.showAckIcon;
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

        public static final class Builder {
            private String autoAckTag; 
            private String clientAddress; 
            private String code; 
            private String consumeType; 
            private String consumerTag; 
            private String currentStatus; 
            private String deliveryErrorInfo; 
            private String deliveryTag; 
            private java.util.Map<String, ?> dlqQueueMsgIdMap; 
            private String reason; 
            private Boolean showAckIcon; 
            private String timeStamp; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.autoAckTag = model.autoAckTag;
                this.clientAddress = model.clientAddress;
                this.code = model.code;
                this.consumeType = model.consumeType;
                this.consumerTag = model.consumerTag;
                this.currentStatus = model.currentStatus;
                this.deliveryErrorInfo = model.deliveryErrorInfo;
                this.deliveryTag = model.deliveryTag;
                this.dlqQueueMsgIdMap = model.dlqQueueMsgIdMap;
                this.reason = model.reason;
                this.showAckIcon = model.showAckIcon;
                this.timeStamp = model.timeStamp;
                this.userId = model.userId;
            } 

            /**
             * AutoAckTag.
             */
            public Builder autoAckTag(String autoAckTag) {
                this.autoAckTag = autoAckTag;
                return this;
            }

            /**
             * ClientAddress.
             */
            public Builder clientAddress(String clientAddress) {
                this.clientAddress = clientAddress;
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
             * ConsumeType.
             */
            public Builder consumeType(String consumeType) {
                this.consumeType = consumeType;
                return this;
            }

            /**
             * ConsumerTag.
             */
            public Builder consumerTag(String consumerTag) {
                this.consumerTag = consumerTag;
                return this;
            }

            /**
             * CurrentStatus.
             */
            public Builder currentStatus(String currentStatus) {
                this.currentStatus = currentStatus;
                return this;
            }

            /**
             * DeliveryErrorInfo.
             */
            public Builder deliveryErrorInfo(String deliveryErrorInfo) {
                this.deliveryErrorInfo = deliveryErrorInfo;
                return this;
            }

            /**
             * DeliveryTag.
             */
            public Builder deliveryTag(String deliveryTag) {
                this.deliveryTag = deliveryTag;
                return this;
            }

            /**
             * DlqQueueMsgIdMap.
             */
            public Builder dlqQueueMsgIdMap(java.util.Map<String, ?> dlqQueueMsgIdMap) {
                this.dlqQueueMsgIdMap = dlqQueueMsgIdMap;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * ShowAckIcon.
             */
            public Builder showAckIcon(Boolean showAckIcon) {
                this.showAckIcon = showAckIcon;
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
