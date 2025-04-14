// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

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
 * {@link GetTraceResponseBody} extends {@link TeaModel}
 *
 * <p>GetTraceResponseBody</p>
 */
public class GetTraceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("dynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("dynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetTraceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTraceResponseBody create() {
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
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private String code; 
        private Data data; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetTraceResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidConsumerGroupId</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The dynamic error code.</p>
         * 
         * <strong>example:</strong>
         * <p>InstanceId</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic error message.</p>
         * 
         * <strong>example:</strong>
         * <p>instanceId</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The instance cannot be found.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request. The system generates a unique ID for each request. You can troubleshoot issues based on the request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7779A8FC-1BCD-5A1D-A603-C4A9BD8ADC49</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetTraceResponseBody build() {
            return new GetTraceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTraceResponseBody} extends {@link TeaModel}
     *
     * <p>GetTraceResponseBody</p>
     */
    public static class Operations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("operateTime")
        private String operateTime;

        @com.aliyun.core.annotation.NameInMap("operateType")
        private String operateType;

        private Operations(Builder builder) {
            this.operateTime = builder.operateTime;
            this.operateType = builder.operateType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Operations create() {
            return builder().build();
        }

        /**
         * @return operateTime
         */
        public String getOperateTime() {
            return this.operateTime;
        }

        /**
         * @return operateType
         */
        public String getOperateType() {
            return this.operateType;
        }

        public static final class Builder {
            private String operateTime; 
            private String operateType; 

            private Builder() {
            } 

            private Builder(Operations model) {
                this.operateTime = model.operateTime;
                this.operateType = model.operateType;
            } 

            /**
             * <p>Operation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-22 12:17:08</p>
             */
            public Builder operateTime(String operateTime) {
                this.operateTime = operateTime;
                return this;
            }

            /**
             * <p>Operation type.</p>
             * 
             * <strong>example:</strong>
             * <p>ADD</p>
             */
            public Builder operateType(String operateType) {
                this.operateType = operateType;
                return this;
            }

            public Operations build() {
                return new Operations(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTraceResponseBody} extends {@link TeaModel}
     *
     * <p>GetTraceResponseBody</p>
     */
    public static class BrokerInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("delayStatus")
        private String delayStatus;

        @com.aliyun.core.annotation.NameInMap("operations")
        private java.util.List<Operations> operations;

        @com.aliyun.core.annotation.NameInMap("presetDelayTime")
        private String presetDelayTime;

        @com.aliyun.core.annotation.NameInMap("recallResult")
        private String recallResult;

        private BrokerInfo(Builder builder) {
            this.delayStatus = builder.delayStatus;
            this.operations = builder.operations;
            this.presetDelayTime = builder.presetDelayTime;
            this.recallResult = builder.recallResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BrokerInfo create() {
            return builder().build();
        }

        /**
         * @return delayStatus
         */
        public String getDelayStatus() {
            return this.delayStatus;
        }

        /**
         * @return operations
         */
        public java.util.List<Operations> getOperations() {
            return this.operations;
        }

        /**
         * @return presetDelayTime
         */
        public String getPresetDelayTime() {
            return this.presetDelayTime;
        }

        /**
         * @return recallResult
         */
        public String getRecallResult() {
            return this.recallResult;
        }

        public static final class Builder {
            private String delayStatus; 
            private java.util.List<Operations> operations; 
            private String presetDelayTime; 
            private String recallResult; 

            private Builder() {
            } 

            private Builder(BrokerInfo model) {
                this.delayStatus = model.delayStatus;
                this.operations = model.operations;
                this.presetDelayTime = model.presetDelayTime;
                this.recallResult = model.recallResult;
            } 

            /**
             * <p>Delay status.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder delayStatus(String delayStatus) {
                this.delayStatus = delayStatus;
                return this;
            }

            /**
             * <p>Operation list.</p>
             */
            public Builder operations(java.util.List<Operations> operations) {
                this.operations = operations;
                return this;
            }

            /**
             * <p>Preset delivery time.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-22 12:17:08</p>
             */
            public Builder presetDelayTime(String presetDelayTime) {
                this.presetDelayTime = presetDelayTime;
                return this;
            }

            /**
             * <p>Withdraw scheduled message request result</p>
             * 
             * <strong>example:</strong>
             * <p>RECALL_OK</p>
             */
            public Builder recallResult(String recallResult) {
                this.recallResult = recallResult;
                return this;
            }

            public BrokerInfo build() {
                return new BrokerInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTraceResponseBody} extends {@link TeaModel}
     *
     * <p>GetTraceResponseBody</p>
     */
    public static class DeadLetterInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("messageId")
        private String messageId;

        @com.aliyun.core.annotation.NameInMap("toDlqTime")
        private String toDlqTime;

        @com.aliyun.core.annotation.NameInMap("topicName")
        private String topicName;

        private DeadLetterInfo(Builder builder) {
            this.messageId = builder.messageId;
            this.toDlqTime = builder.toDlqTime;
            this.topicName = builder.topicName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeadLetterInfo create() {
            return builder().build();
        }

        /**
         * @return messageId
         */
        public String getMessageId() {
            return this.messageId;
        }

        /**
         * @return toDlqTime
         */
        public String getToDlqTime() {
            return this.toDlqTime;
        }

        /**
         * @return topicName
         */
        public String getTopicName() {
            return this.topicName;
        }

        public static final class Builder {
            private String messageId; 
            private String toDlqTime; 
            private String topicName; 

            private Builder() {
            } 

            private Builder(DeadLetterInfo model) {
                this.messageId = model.messageId;
                this.toDlqTime = model.toDlqTime;
                this.topicName = model.topicName;
            } 

            /**
             * <p>MessageId.</p>
             * 
             * <strong>example:</strong>
             * <p>7F000001001F7A4F0F29463F0376047D</p>
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
                return this;
            }

            /**
             * <p>Arrival time in the dead letter queue.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-22 12:17:08</p>
             */
            public Builder toDlqTime(String toDlqTime) {
                this.toDlqTime = toDlqTime;
                return this;
            }

            /**
             * <p>The topic name.</p>
             * 
             * <strong>example:</strong>
             * <p>Register_Sync</p>
             */
            public Builder topicName(String topicName) {
                this.topicName = topicName;
                return this;
            }

            public DeadLetterInfo build() {
                return new DeadLetterInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTraceResponseBody} extends {@link TeaModel}
     *
     * <p>GetTraceResponseBody</p>
     */
    public static class RecordsOperations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("deadMessage")
        private Boolean deadMessage;

        @com.aliyun.core.annotation.NameInMap("invisibleTime")
        private Long invisibleTime;

        @com.aliyun.core.annotation.NameInMap("operateTime")
        private String operateTime;

        @com.aliyun.core.annotation.NameInMap("operateType")
        private String operateType;

        private RecordsOperations(Builder builder) {
            this.deadMessage = builder.deadMessage;
            this.invisibleTime = builder.invisibleTime;
            this.operateTime = builder.operateTime;
            this.operateType = builder.operateType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordsOperations create() {
            return builder().build();
        }

        /**
         * @return deadMessage
         */
        public Boolean getDeadMessage() {
            return this.deadMessage;
        }

        /**
         * @return invisibleTime
         */
        public Long getInvisibleTime() {
            return this.invisibleTime;
        }

        /**
         * @return operateTime
         */
        public String getOperateTime() {
            return this.operateTime;
        }

        /**
         * @return operateType
         */
        public String getOperateType() {
            return this.operateType;
        }

        public static final class Builder {
            private Boolean deadMessage; 
            private Long invisibleTime; 
            private String operateTime; 
            private String operateType; 

            private Builder() {
            } 

            private Builder(RecordsOperations model) {
                this.deadMessage = model.deadMessage;
                this.invisibleTime = model.invisibleTime;
                this.operateTime = model.operateTime;
                this.operateType = model.operateType;
            } 

            /**
             * <p>Whether it is a dead letter message.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder deadMessage(Boolean deadMessage) {
                this.deadMessage = deadMessage;
                return this;
            }

            /**
             * <p>Invisible time, milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder invisibleTime(Long invisibleTime) {
                this.invisibleTime = invisibleTime;
                return this;
            }

            /**
             * <p>Operation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-22 12:17:08</p>
             */
            public Builder operateTime(String operateTime) {
                this.operateTime = operateTime;
                return this;
            }

            /**
             * <p>Operation type.</p>
             * 
             * <strong>example:</strong>
             * <p>ADD</p>
             */
            public Builder operateType(String operateType) {
                this.operateType = operateType;
                return this;
            }

            public RecordsOperations build() {
                return new RecordsOperations(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTraceResponseBody} extends {@link TeaModel}
     *
     * <p>GetTraceResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("clientHost")
        private String clientHost;

        @com.aliyun.core.annotation.NameInMap("consumeStatus")
        private String consumeStatus;

        @com.aliyun.core.annotation.NameInMap("fifoEnable")
        private Boolean fifoEnable;

        @com.aliyun.core.annotation.NameInMap("operations")
        private java.util.List<RecordsOperations> operations;

        @com.aliyun.core.annotation.NameInMap("popCk")
        private String popCk;

        @com.aliyun.core.annotation.NameInMap("userName")
        private String userName;

        private Records(Builder builder) {
            this.clientHost = builder.clientHost;
            this.consumeStatus = builder.consumeStatus;
            this.fifoEnable = builder.fifoEnable;
            this.operations = builder.operations;
            this.popCk = builder.popCk;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return clientHost
         */
        public String getClientHost() {
            return this.clientHost;
        }

        /**
         * @return consumeStatus
         */
        public String getConsumeStatus() {
            return this.consumeStatus;
        }

        /**
         * @return fifoEnable
         */
        public Boolean getFifoEnable() {
            return this.fifoEnable;
        }

        /**
         * @return operations
         */
        public java.util.List<RecordsOperations> getOperations() {
            return this.operations;
        }

        /**
         * @return popCk
         */
        public String getPopCk() {
            return this.popCk;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String clientHost; 
            private String consumeStatus; 
            private Boolean fifoEnable; 
            private java.util.List<RecordsOperations> operations; 
            private String popCk; 
            private String userName; 

            private Builder() {
            } 

            private Builder(Records model) {
                this.clientHost = model.clientHost;
                this.consumeStatus = model.consumeStatus;
                this.fifoEnable = model.fifoEnable;
                this.operations = model.operations;
                this.popCk = model.popCk;
                this.userName = model.userName;
            } 

            /**
             * <p>Client host.</p>
             * 
             * <strong>example:</strong>
             * <p>xx.xx.xx.xx</p>
             */
            public Builder clientHost(String clientHost) {
                this.clientHost = clientHost;
                return this;
            }

            /**
             * <p>Consume status.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder consumeStatus(String consumeStatus) {
                this.consumeStatus = consumeStatus;
                return this;
            }

            /**
             * <p>Whether to consume fifo.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder fifoEnable(Boolean fifoEnable) {
                this.fifoEnable = fifoEnable;
                return this;
            }

            /**
             * <p>Operation list.</p>
             */
            public Builder operations(java.util.List<RecordsOperations> operations) {
                this.operations = operations;
                return this;
            }

            /**
             * <p>POP_CK</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder popCk(String popCk) {
                this.popCk = popCk;
                return this;
            }

            /**
             * <p>Consumer name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTraceResponseBody} extends {@link TeaModel}
     *
     * <p>GetTraceResponseBody</p>
     */
    public static class ConsumerInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("consumeStatus")
        private String consumeStatus;

        @com.aliyun.core.annotation.NameInMap("consumerGroupId")
        private String consumerGroupId;

        @com.aliyun.core.annotation.NameInMap("deadLetterInfo")
        private DeadLetterInfo deadLetterInfo;

        @com.aliyun.core.annotation.NameInMap("deadMessage")
        private Boolean deadMessage;

        @com.aliyun.core.annotation.NameInMap("records")
        private java.util.List<Records> records;

        private ConsumerInfos(Builder builder) {
            this.consumeStatus = builder.consumeStatus;
            this.consumerGroupId = builder.consumerGroupId;
            this.deadLetterInfo = builder.deadLetterInfo;
            this.deadMessage = builder.deadMessage;
            this.records = builder.records;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsumerInfos create() {
            return builder().build();
        }

        /**
         * @return consumeStatus
         */
        public String getConsumeStatus() {
            return this.consumeStatus;
        }

        /**
         * @return consumerGroupId
         */
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        /**
         * @return deadLetterInfo
         */
        public DeadLetterInfo getDeadLetterInfo() {
            return this.deadLetterInfo;
        }

        /**
         * @return deadMessage
         */
        public Boolean getDeadMessage() {
            return this.deadMessage;
        }

        /**
         * @return records
         */
        public java.util.List<Records> getRecords() {
            return this.records;
        }

        public static final class Builder {
            private String consumeStatus; 
            private String consumerGroupId; 
            private DeadLetterInfo deadLetterInfo; 
            private Boolean deadMessage; 
            private java.util.List<Records> records; 

            private Builder() {
            } 

            private Builder(ConsumerInfos model) {
                this.consumeStatus = model.consumeStatus;
                this.consumerGroupId = model.consumerGroupId;
                this.deadLetterInfo = model.deadLetterInfo;
                this.deadMessage = model.deadMessage;
                this.records = model.records;
            } 

            /**
             * <p>Consume status.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder consumeStatus(String consumeStatus) {
                this.consumeStatus = consumeStatus;
                return this;
            }

            /**
             * <p>The consumer group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>GID_inspector_group</p>
             */
            public Builder consumerGroupId(String consumerGroupId) {
                this.consumerGroupId = consumerGroupId;
                return this;
            }

            /**
             * <p>Dead letter info.</p>
             */
            public Builder deadLetterInfo(DeadLetterInfo deadLetterInfo) {
                this.deadLetterInfo = deadLetterInfo;
                return this;
            }

            /**
             * <p>Whether it is a dead letter message.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder deadMessage(Boolean deadMessage) {
                this.deadMessage = deadMessage;
                return this;
            }

            /**
             * <p>Consumer record list.</p>
             */
            public Builder records(java.util.List<Records> records) {
                this.records = records;
                return this;
            }

            public ConsumerInfos build() {
                return new ConsumerInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTraceResponseBody} extends {@link TeaModel}
     *
     * <p>GetTraceResponseBody</p>
     */
    public static class MessageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("body")
        private String body;

        @com.aliyun.core.annotation.NameInMap("bornHost")
        private String bornHost;

        @com.aliyun.core.annotation.NameInMap("bornTime")
        private String bornTime;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("messageGroup")
        private String messageGroup;

        @com.aliyun.core.annotation.NameInMap("messageId")
        private String messageId;

        @com.aliyun.core.annotation.NameInMap("messageKeys")
        private java.util.List<String> messageKeys;

        @com.aliyun.core.annotation.NameInMap("messageTag")
        private String messageTag;

        @com.aliyun.core.annotation.NameInMap("messageType")
        private String messageType;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("storeHost")
        private String storeHost;

        @com.aliyun.core.annotation.NameInMap("storeTime")
        private String storeTime;

        @com.aliyun.core.annotation.NameInMap("topicName")
        private String topicName;

        @com.aliyun.core.annotation.NameInMap("transactionId")
        private String transactionId;

        @com.aliyun.core.annotation.NameInMap("userProperties")
        private java.util.Map<String, String> userProperties;

        private MessageInfo(Builder builder) {
            this.body = builder.body;
            this.bornHost = builder.bornHost;
            this.bornTime = builder.bornTime;
            this.instanceId = builder.instanceId;
            this.messageGroup = builder.messageGroup;
            this.messageId = builder.messageId;
            this.messageKeys = builder.messageKeys;
            this.messageTag = builder.messageTag;
            this.messageType = builder.messageType;
            this.regionId = builder.regionId;
            this.storeHost = builder.storeHost;
            this.storeTime = builder.storeTime;
            this.topicName = builder.topicName;
            this.transactionId = builder.transactionId;
            this.userProperties = builder.userProperties;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MessageInfo create() {
            return builder().build();
        }

        /**
         * @return body
         */
        public String getBody() {
            return this.body;
        }

        /**
         * @return bornHost
         */
        public String getBornHost() {
            return this.bornHost;
        }

        /**
         * @return bornTime
         */
        public String getBornTime() {
            return this.bornTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return messageGroup
         */
        public String getMessageGroup() {
            return this.messageGroup;
        }

        /**
         * @return messageId
         */
        public String getMessageId() {
            return this.messageId;
        }

        /**
         * @return messageKeys
         */
        public java.util.List<String> getMessageKeys() {
            return this.messageKeys;
        }

        /**
         * @return messageTag
         */
        public String getMessageTag() {
            return this.messageTag;
        }

        /**
         * @return messageType
         */
        public String getMessageType() {
            return this.messageType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return storeHost
         */
        public String getStoreHost() {
            return this.storeHost;
        }

        /**
         * @return storeTime
         */
        public String getStoreTime() {
            return this.storeTime;
        }

        /**
         * @return topicName
         */
        public String getTopicName() {
            return this.topicName;
        }

        /**
         * @return transactionId
         */
        public String getTransactionId() {
            return this.transactionId;
        }

        /**
         * @return userProperties
         */
        public java.util.Map<String, String> getUserProperties() {
            return this.userProperties;
        }

        public static final class Builder {
            private String body; 
            private String bornHost; 
            private String bornTime; 
            private String instanceId; 
            private String messageGroup; 
            private String messageId; 
            private java.util.List<String> messageKeys; 
            private String messageTag; 
            private String messageType; 
            private String regionId; 
            private String storeHost; 
            private String storeTime; 
            private String topicName; 
            private String transactionId; 
            private java.util.Map<String, String> userProperties; 

            private Builder() {
            } 

            private Builder(MessageInfo model) {
                this.body = model.body;
                this.bornHost = model.bornHost;
                this.bornTime = model.bornTime;
                this.instanceId = model.instanceId;
                this.messageGroup = model.messageGroup;
                this.messageId = model.messageId;
                this.messageKeys = model.messageKeys;
                this.messageTag = model.messageTag;
                this.messageType = model.messageType;
                this.regionId = model.regionId;
                this.storeHost = model.storeHost;
                this.storeTime = model.storeTime;
                this.topicName = model.topicName;
                this.transactionId = model.transactionId;
                this.userProperties = model.userProperties;
            } 

            /**
             * <p>Message body.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder body(String body) {
                this.body = body;
                return this;
            }

            /**
             * <p>Message born host.</p>
             * 
             * <strong>example:</strong>
             * <p>x.x.x.x</p>
             */
            public Builder bornHost(String bornHost) {
                this.bornHost = bornHost;
                return this;
            }

            /**
             * <p>Message born time.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-22 12:17:08</p>
             */
            public Builder bornTime(String bornTime) {
                this.bornTime = bornTime;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rmq-cn-u0t2ygjq505</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Message grpup.</p>
             * 
             * <strong>example:</strong>
             * <p>xx</p>
             */
            public Builder messageGroup(String messageGroup) {
                this.messageGroup = messageGroup;
                return this;
            }

            /**
             * <p>The message ID.</p>
             * 
             * <strong>example:</strong>
             * <p>0A79275A00207A4F0F2916C92F9A0B94</p>
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
                return this;
            }

            /**
             * <p>Message keys.</p>
             */
            public Builder messageKeys(java.util.List<String> messageKeys) {
                this.messageKeys = messageKeys;
                return this;
            }

            /**
             * <p>Message tag.</p>
             * 
             * <strong>example:</strong>
             * <p>xx</p>
             */
            public Builder messageTag(String messageTag) {
                this.messageTag = messageTag;
                return this;
            }

            /**
             * <p>Message type.</p>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder messageType(String messageType) {
                this.messageType = messageType;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Message store host.</p>
             * 
             * <strong>example:</strong>
             * <p>x.x.x.x</p>
             */
            public Builder storeHost(String storeHost) {
                this.storeHost = storeHost;
                return this;
            }

            /**
             * <p>Message store time.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-22 12:17:08</p>
             */
            public Builder storeTime(String storeTime) {
                this.storeTime = storeTime;
                return this;
            }

            /**
             * <p>The topic name.</p>
             * 
             * <strong>example:</strong>
             * <p>Topic_normal_inspector</p>
             */
            public Builder topicName(String topicName) {
                this.topicName = topicName;
                return this;
            }

            /**
             * <p>Message transaction id.</p>
             * 
             * <strong>example:</strong>
             * <p>xx</p>
             */
            public Builder transactionId(String transactionId) {
                this.transactionId = transactionId;
                return this;
            }

            /**
             * <p>Message user properties.</p>
             */
            public Builder userProperties(java.util.Map<String, String> userProperties) {
                this.userProperties = userProperties;
                return this;
            }

            public MessageInfo build() {
                return new MessageInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTraceResponseBody} extends {@link TeaModel}
     *
     * <p>GetTraceResponseBody</p>
     */
    public static class ProducerInfoRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arriveTime")
        private String arriveTime;

        @com.aliyun.core.annotation.NameInMap("clientHost")
        private String clientHost;

        @com.aliyun.core.annotation.NameInMap("dlqOriginMessageId")
        private String dlqOriginMessageId;

        @com.aliyun.core.annotation.NameInMap("dlqOriginTopic")
        private String dlqOriginTopic;

        @com.aliyun.core.annotation.NameInMap("messageSource")
        private String messageSource;

        @com.aliyun.core.annotation.NameInMap("produceDuration")
        private Long produceDuration;

        @com.aliyun.core.annotation.NameInMap("produceStatus")
        private String produceStatus;

        @com.aliyun.core.annotation.NameInMap("produceTime")
        private String produceTime;

        @com.aliyun.core.annotation.NameInMap("recallTime")
        private String recallTime;

        @com.aliyun.core.annotation.NameInMap("userName")
        private String userName;

        private ProducerInfoRecords(Builder builder) {
            this.arriveTime = builder.arriveTime;
            this.clientHost = builder.clientHost;
            this.dlqOriginMessageId = builder.dlqOriginMessageId;
            this.dlqOriginTopic = builder.dlqOriginTopic;
            this.messageSource = builder.messageSource;
            this.produceDuration = builder.produceDuration;
            this.produceStatus = builder.produceStatus;
            this.produceTime = builder.produceTime;
            this.recallTime = builder.recallTime;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProducerInfoRecords create() {
            return builder().build();
        }

        /**
         * @return arriveTime
         */
        public String getArriveTime() {
            return this.arriveTime;
        }

        /**
         * @return clientHost
         */
        public String getClientHost() {
            return this.clientHost;
        }

        /**
         * @return dlqOriginMessageId
         */
        public String getDlqOriginMessageId() {
            return this.dlqOriginMessageId;
        }

        /**
         * @return dlqOriginTopic
         */
        public String getDlqOriginTopic() {
            return this.dlqOriginTopic;
        }

        /**
         * @return messageSource
         */
        public String getMessageSource() {
            return this.messageSource;
        }

        /**
         * @return produceDuration
         */
        public Long getProduceDuration() {
            return this.produceDuration;
        }

        /**
         * @return produceStatus
         */
        public String getProduceStatus() {
            return this.produceStatus;
        }

        /**
         * @return produceTime
         */
        public String getProduceTime() {
            return this.produceTime;
        }

        /**
         * @return recallTime
         */
        public String getRecallTime() {
            return this.recallTime;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String arriveTime; 
            private String clientHost; 
            private String dlqOriginMessageId; 
            private String dlqOriginTopic; 
            private String messageSource; 
            private Long produceDuration; 
            private String produceStatus; 
            private String produceTime; 
            private String recallTime; 
            private String userName; 

            private Builder() {
            } 

            private Builder(ProducerInfoRecords model) {
                this.arriveTime = model.arriveTime;
                this.clientHost = model.clientHost;
                this.dlqOriginMessageId = model.dlqOriginMessageId;
                this.dlqOriginTopic = model.dlqOriginTopic;
                this.messageSource = model.messageSource;
                this.produceDuration = model.produceDuration;
                this.produceStatus = model.produceStatus;
                this.produceTime = model.produceTime;
                this.recallTime = model.recallTime;
                this.userName = model.userName;
            } 

            /**
             * <p>Arrive time.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-22 12:17:08</p>
             */
            public Builder arriveTime(String arriveTime) {
                this.arriveTime = arriveTime;
                return this;
            }

            /**
             * <p>Client host.</p>
             * 
             * <strong>example:</strong>
             * <p>xx.xx.xx.xx</p>
             */
            public Builder clientHost(String clientHost) {
                this.clientHost = clientHost;
                return this;
            }

            /**
             * <p>Dead-letter queue message ID.</p>
             * 
             * <strong>example:</strong>
             * <p>0A79275A00207A4F0F2916C92F9A0B94</p>
             */
            public Builder dlqOriginMessageId(String dlqOriginMessageId) {
                this.dlqOriginMessageId = dlqOriginMessageId;
                return this;
            }

            /**
             * <p>Dead-letter queue topic.</p>
             * 
             * <strong>example:</strong>
             * <p>test_topic</p>
             */
            public Builder dlqOriginTopic(String dlqOriginTopic) {
                this.dlqOriginTopic = dlqOriginTopic;
                return this;
            }

            /**
             * <p>Message source.</p>
             * 
             * <strong>example:</strong>
             * <p>CONSOLE</p>
             */
            public Builder messageSource(String messageSource) {
                this.messageSource = messageSource;
                return this;
            }

            /**
             * <p>Producer duration.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder produceDuration(Long produceDuration) {
                this.produceDuration = produceDuration;
                return this;
            }

            /**
             * <p>Producer status.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder produceStatus(String produceStatus) {
                this.produceStatus = produceStatus;
                return this;
            }

            /**
             * <p>Producer time.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-22 12:17:08</p>
             */
            public Builder produceTime(String produceTime) {
                this.produceTime = produceTime;
                return this;
            }

            /**
             * <p>The time when the scheduled message withdrawal request was initiated</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-22 12:17:08</p>
             */
            public Builder recallTime(String recallTime) {
                this.recallTime = recallTime;
                return this;
            }

            /**
             * <p>Producer name.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public ProducerInfoRecords build() {
                return new ProducerInfoRecords(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTraceResponseBody} extends {@link TeaModel}
     *
     * <p>GetTraceResponseBody</p>
     */
    public static class ProducerInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("records")
        private java.util.List<ProducerInfoRecords> records;

        private ProducerInfo(Builder builder) {
            this.records = builder.records;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProducerInfo create() {
            return builder().build();
        }

        /**
         * @return records
         */
        public java.util.List<ProducerInfoRecords> getRecords() {
            return this.records;
        }

        public static final class Builder {
            private java.util.List<ProducerInfoRecords> records; 

            private Builder() {
            } 

            private Builder(ProducerInfo model) {
                this.records = model.records;
            } 

            /**
             * <p>The production records.</p>
             */
            public Builder records(java.util.List<ProducerInfoRecords> records) {
                this.records = records;
                return this;
            }

            public ProducerInfo build() {
                return new ProducerInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTraceResponseBody} extends {@link TeaModel}
     *
     * <p>GetTraceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("brokerInfo")
        private BrokerInfo brokerInfo;

        @com.aliyun.core.annotation.NameInMap("consumerInfos")
        private java.util.List<ConsumerInfos> consumerInfos;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("messageInfo")
        private MessageInfo messageInfo;

        @com.aliyun.core.annotation.NameInMap("producerInfo")
        private ProducerInfo producerInfo;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("topicName")
        private String topicName;

        private Data(Builder builder) {
            this.brokerInfo = builder.brokerInfo;
            this.consumerInfos = builder.consumerInfos;
            this.instanceId = builder.instanceId;
            this.messageInfo = builder.messageInfo;
            this.producerInfo = builder.producerInfo;
            this.regionId = builder.regionId;
            this.topicName = builder.topicName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return brokerInfo
         */
        public BrokerInfo getBrokerInfo() {
            return this.brokerInfo;
        }

        /**
         * @return consumerInfos
         */
        public java.util.List<ConsumerInfos> getConsumerInfos() {
            return this.consumerInfos;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return messageInfo
         */
        public MessageInfo getMessageInfo() {
            return this.messageInfo;
        }

        /**
         * @return producerInfo
         */
        public ProducerInfo getProducerInfo() {
            return this.producerInfo;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return topicName
         */
        public String getTopicName() {
            return this.topicName;
        }

        public static final class Builder {
            private BrokerInfo brokerInfo; 
            private java.util.List<ConsumerInfos> consumerInfos; 
            private String instanceId; 
            private MessageInfo messageInfo; 
            private ProducerInfo producerInfo; 
            private String regionId; 
            private String topicName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.brokerInfo = model.brokerInfo;
                this.consumerInfos = model.consumerInfos;
                this.instanceId = model.instanceId;
                this.messageInfo = model.messageInfo;
                this.producerInfo = model.producerInfo;
                this.regionId = model.regionId;
                this.topicName = model.topicName;
            } 

            /**
             * <p>The broker trace.</p>
             */
            public Builder brokerInfo(BrokerInfo brokerInfo) {
                this.brokerInfo = brokerInfo;
                return this;
            }

            /**
             * <p>Consumer trace info.</p>
             */
            public Builder consumerInfos(java.util.List<ConsumerInfos> consumerInfos) {
                this.consumerInfos = consumerInfos;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rmq-cn-7e22ody****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The message information.</p>
             */
            public Builder messageInfo(MessageInfo messageInfo) {
                this.messageInfo = messageInfo;
                return this;
            }

            /**
             * <p>The producer trace.</p>
             */
            public Builder producerInfo(ProducerInfo producerInfo) {
                this.producerInfo = producerInfo;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The topic name.</p>
             * 
             * <strong>example:</strong>
             * <p>topic_test</p>
             */
            public Builder topicName(String topicName) {
                this.topicName = topicName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
