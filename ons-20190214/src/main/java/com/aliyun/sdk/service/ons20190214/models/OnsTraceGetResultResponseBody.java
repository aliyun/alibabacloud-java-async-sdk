// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsTraceGetResultResponseBody} extends {@link TeaModel}
 *
 * <p>OnsTraceGetResultResponseBody</p>
 */
public class OnsTraceGetResultResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TraceData")
    private TraceData traceData;

    private OnsTraceGetResultResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.traceData = builder.traceData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsTraceGetResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return traceData
     */
    public TraceData getTraceData() {
        return this.traceData;
    }

    public static final class Builder {
        private String requestId; 
        private TraceData traceData; 

        /**
         * The ID of the request. The system generates a unique ID for each request. You can troubleshoot issues based on the request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The details of the message trace.
         */
        public Builder traceData(TraceData traceData) {
            this.traceData = traceData;
            return this;
        }

        public OnsTraceGetResultResponseBody build() {
            return new OnsTraceGetResultResponseBody(this);
        } 

    } 

    public static class SubClientInfoDo extends TeaModel {
        @NameInMap("ClientHost")
        private String clientHost;

        @NameInMap("CostTime")
        private Integer costTime;

        @NameInMap("ReconsumeTimes")
        private Integer reconsumeTimes;

        @NameInMap("Status")
        private String status;

        @NameInMap("SubGroupName")
        private String subGroupName;

        @NameInMap("SubTime")
        private Long subTime;

        private SubClientInfoDo(Builder builder) {
            this.clientHost = builder.clientHost;
            this.costTime = builder.costTime;
            this.reconsumeTimes = builder.reconsumeTimes;
            this.status = builder.status;
            this.subGroupName = builder.subGroupName;
            this.subTime = builder.subTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubClientInfoDo create() {
            return builder().build();
        }

        /**
         * @return clientHost
         */
        public String getClientHost() {
            return this.clientHost;
        }

        /**
         * @return costTime
         */
        public Integer getCostTime() {
            return this.costTime;
        }

        /**
         * @return reconsumeTimes
         */
        public Integer getReconsumeTimes() {
            return this.reconsumeTimes;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subGroupName
         */
        public String getSubGroupName() {
            return this.subGroupName;
        }

        /**
         * @return subTime
         */
        public Long getSubTime() {
            return this.subTime;
        }

        public static final class Builder {
            private String clientHost; 
            private Integer costTime; 
            private Integer reconsumeTimes; 
            private String status; 
            private String subGroupName; 
            private Long subTime; 

            /**
             * The address of the consumer.
             */
            public Builder clientHost(String clientHost) {
                this.clientHost = clientHost;
                return this;
            }

            /**
             * The period of time that the system took to consume the message. Unit: milliseconds.
             */
            public Builder costTime(Integer costTime) {
                this.costTime = costTime;
                return this;
            }

            /**
             * The number of attempts that the Message Queue for Apache RocketMQ broker tried to send the message to the consumer.
             */
            public Builder reconsumeTimes(Integer reconsumeTimes) {
                this.reconsumeTimes = reconsumeTimes;
                return this;
            }

            /**
             * Indicates whether the message is consumed. Valid values:
             * <p>
             * 
             * *   **CONSUME_FAILED**: The message failed to be consumed.
             * *   **CONSUME_SUCCESS**: The message is consumed.
             * *   **CONSUME_NOT_RETURN:** No responses are returned.
             * *   **SEND_UNKNOWN:** The message is a transactional message and is not committed.
             * *   **SEND_DELAY:** The message is a scheduled or delayed message and is waiting to be consumed at the specified point in time.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the group that contains the consumer.
             */
            public Builder subGroupName(String subGroupName) {
                this.subGroupName = subGroupName;
                return this;
            }

            /**
             * The earliest point in time when the message was consumed.
             */
            public Builder subTime(Long subTime) {
                this.subTime = subTime;
                return this;
            }

            public SubClientInfoDo build() {
                return new SubClientInfoDo(this);
            } 

        } 

    }
    public static class ClientList extends TeaModel {
        @NameInMap("SubClientInfoDo")
        private java.util.List < SubClientInfoDo> subClientInfoDo;

        private ClientList(Builder builder) {
            this.subClientInfoDo = builder.subClientInfoDo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientList create() {
            return builder().build();
        }

        /**
         * @return subClientInfoDo
         */
        public java.util.List < SubClientInfoDo> getSubClientInfoDo() {
            return this.subClientInfoDo;
        }

        public static final class Builder {
            private java.util.List < SubClientInfoDo> subClientInfoDo; 

            /**
             * SubClientInfoDo.
             */
            public Builder subClientInfoDo(java.util.List < SubClientInfoDo> subClientInfoDo) {
                this.subClientInfoDo = subClientInfoDo;
                return this;
            }

            public ClientList build() {
                return new ClientList(this);
            } 

        } 

    }
    public static class SubMapDo extends TeaModel {
        @NameInMap("ClientList")
        private ClientList clientList;

        @NameInMap("FailCount")
        private Integer failCount;

        @NameInMap("SubGroupName")
        private String subGroupName;

        @NameInMap("SuccessCount")
        private Integer successCount;

        private SubMapDo(Builder builder) {
            this.clientList = builder.clientList;
            this.failCount = builder.failCount;
            this.subGroupName = builder.subGroupName;
            this.successCount = builder.successCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubMapDo create() {
            return builder().build();
        }

        /**
         * @return clientList
         */
        public ClientList getClientList() {
            return this.clientList;
        }

        /**
         * @return failCount
         */
        public Integer getFailCount() {
            return this.failCount;
        }

        /**
         * @return subGroupName
         */
        public String getSubGroupName() {
            return this.subGroupName;
        }

        /**
         * @return successCount
         */
        public Integer getSuccessCount() {
            return this.successCount;
        }

        public static final class Builder {
            private ClientList clientList; 
            private Integer failCount; 
            private String subGroupName; 
            private Integer successCount; 

            /**
             * The information about message consumption by consumers in the group.
             */
            public Builder clientList(ClientList clientList) {
                this.clientList = clientList;
                return this;
            }

            /**
             * The number of consumption failures.
             */
            public Builder failCount(Integer failCount) {
                this.failCount = failCount;
                return this;
            }

            /**
             * The ID of the consumer group.
             */
            public Builder subGroupName(String subGroupName) {
                this.subGroupName = subGroupName;
                return this;
            }

            /**
             * The number of successful consumptions.
             */
            public Builder successCount(Integer successCount) {
                this.successCount = successCount;
                return this;
            }

            public SubMapDo build() {
                return new SubMapDo(this);
            } 

        } 

    }
    public static class SubList extends TeaModel {
        @NameInMap("SubMapDo")
        private java.util.List < SubMapDo> subMapDo;

        private SubList(Builder builder) {
            this.subMapDo = builder.subMapDo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubList create() {
            return builder().build();
        }

        /**
         * @return subMapDo
         */
        public java.util.List < SubMapDo> getSubMapDo() {
            return this.subMapDo;
        }

        public static final class Builder {
            private java.util.List < SubMapDo> subMapDo; 

            /**
             * SubMapDo.
             */
            public Builder subMapDo(java.util.List < SubMapDo> subMapDo) {
                this.subMapDo = subMapDo;
                return this;
            }

            public SubList build() {
                return new SubList(this);
            } 

        } 

    }
    public static class TraceMapDo extends TeaModel {
        @NameInMap("BornHost")
        private String bornHost;

        @NameInMap("CostTime")
        private Integer costTime;

        @NameInMap("MsgId")
        private String msgId;

        @NameInMap("MsgKey")
        private String msgKey;

        @NameInMap("PubGroupName")
        private String pubGroupName;

        @NameInMap("PubTime")
        private Long pubTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("SubList")
        private SubList subList;

        @NameInMap("Tag")
        private String tag;

        @NameInMap("Topic")
        private String topic;

        private TraceMapDo(Builder builder) {
            this.bornHost = builder.bornHost;
            this.costTime = builder.costTime;
            this.msgId = builder.msgId;
            this.msgKey = builder.msgKey;
            this.pubGroupName = builder.pubGroupName;
            this.pubTime = builder.pubTime;
            this.status = builder.status;
            this.subList = builder.subList;
            this.tag = builder.tag;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TraceMapDo create() {
            return builder().build();
        }

        /**
         * @return bornHost
         */
        public String getBornHost() {
            return this.bornHost;
        }

        /**
         * @return costTime
         */
        public Integer getCostTime() {
            return this.costTime;
        }

        /**
         * @return msgId
         */
        public String getMsgId() {
            return this.msgId;
        }

        /**
         * @return msgKey
         */
        public String getMsgKey() {
            return this.msgKey;
        }

        /**
         * @return pubGroupName
         */
        public String getPubGroupName() {
            return this.pubGroupName;
        }

        /**
         * @return pubTime
         */
        public Long getPubTime() {
            return this.pubTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subList
         */
        public SubList getSubList() {
            return this.subList;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private String bornHost; 
            private Integer costTime; 
            private String msgId; 
            private String msgKey; 
            private String pubGroupName; 
            private Long pubTime; 
            private String status; 
            private SubList subList; 
            private String tag; 
            private String topic; 

            /**
             * The address of the producer that generated the message.
             */
            public Builder bornHost(String bornHost) {
                this.bornHost = bornHost;
                return this;
            }

            /**
             * The period of time that the system took to send the message. Unit: milliseconds.
             */
            public Builder costTime(Integer costTime) {
                this.costTime = costTime;
                return this;
            }

            /**
             * The ID of the message.
             */
            public Builder msgId(String msgId) {
                this.msgId = msgId;
                return this;
            }

            /**
             * The key of the message.
             */
            public Builder msgKey(String msgKey) {
                this.msgKey = msgKey;
                return this;
            }

            /**
             * The ID of the group that contains the producer.
             */
            public Builder pubGroupName(String pubGroupName) {
                this.pubGroupName = pubGroupName;
                return this;
            }

            /**
             * The point in time when the message was sent.
             */
            public Builder pubTime(Long pubTime) {
                this.pubTime = pubTime;
                return this;
            }

            /**
             * Indicates whether the message is sent. Valid values:
             * <p>
             * 
             * *   **SEND_SUCCESS**: The message is sent.
             * *   **SEND_FAILED**: The message failed to be sent.
             * *   **SEND_ROLLBACK:** The message is a transactional message and is rolled back.
             * *   **SEND_UNKNOWN:** The message is a transactional message and is not committed.
             * *   **SEND_DELAY:** The message is a scheduled or delayed message and is waiting to be sent at the specified point in time.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The consumption traces of the message.
             */
            public Builder subList(SubList subList) {
                this.subList = subList;
                return this;
            }

            /**
             * The tag of the message.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * The topic in which the message is stored.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            public TraceMapDo build() {
                return new TraceMapDo(this);
            } 

        } 

    }
    public static class TraceList extends TeaModel {
        @NameInMap("TraceMapDo")
        private java.util.List < TraceMapDo> traceMapDo;

        private TraceList(Builder builder) {
            this.traceMapDo = builder.traceMapDo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TraceList create() {
            return builder().build();
        }

        /**
         * @return traceMapDo
         */
        public java.util.List < TraceMapDo> getTraceMapDo() {
            return this.traceMapDo;
        }

        public static final class Builder {
            private java.util.List < TraceMapDo> traceMapDo; 

            /**
             * TraceMapDo.
             */
            public Builder traceMapDo(java.util.List < TraceMapDo> traceMapDo) {
                this.traceMapDo = traceMapDo;
                return this;
            }

            public TraceList build() {
                return new TraceList(this);
            } 

        } 

    }
    public static class TraceData extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("MsgId")
        private String msgId;

        @NameInMap("MsgKey")
        private String msgKey;

        @NameInMap("QueryId")
        private String queryId;

        @NameInMap("Status")
        private String status;

        @NameInMap("Topic")
        private String topic;

        @NameInMap("TraceList")
        private TraceList traceList;

        @NameInMap("UpdateTime")
        private Long updateTime;

        @NameInMap("UserId")
        private String userId;

        private TraceData(Builder builder) {
            this.createTime = builder.createTime;
            this.instanceId = builder.instanceId;
            this.msgId = builder.msgId;
            this.msgKey = builder.msgKey;
            this.queryId = builder.queryId;
            this.status = builder.status;
            this.topic = builder.topic;
            this.traceList = builder.traceList;
            this.updateTime = builder.updateTime;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TraceData create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return msgId
         */
        public String getMsgId() {
            return this.msgId;
        }

        /**
         * @return msgKey
         */
        public String getMsgKey() {
            return this.msgKey;
        }

        /**
         * @return queryId
         */
        public String getQueryId() {
            return this.queryId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        /**
         * @return traceList
         */
        public TraceList getTraceList() {
            return this.traceList;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Long createTime; 
            private String instanceId; 
            private String msgId; 
            private String msgKey; 
            private String queryId; 
            private String status; 
            private String topic; 
            private TraceList traceList; 
            private Long updateTime; 
            private String userId; 

            /**
             * The point in time when the task was created.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the instance that contains the message.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The ID of the message that is queried.
             */
            public Builder msgId(String msgId) {
                this.msgId = msgId;
                return this;
            }

            /**
             * The key of the message that is queried.
             */
            public Builder msgKey(String msgKey) {
                this.msgKey = msgKey;
                return this;
            }

            /**
             * The ID of the task.
             */
            public Builder queryId(String queryId) {
                this.queryId = queryId;
                return this;
            }

            /**
             * The status of the task. Valid values:
             * <p>
             * 
             * *   **finish**: The task is complete.
             * *   **working**: The task is in progress.
             * *   **removed**: The task is deleted.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The topic in which the message is stored.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * The details of the message trace.
             */
            public Builder traceList(TraceList traceList) {
                this.traceList = traceList;
                return this;
            }

            /**
             * The most recent point in time when the task was updated.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The ID of the user who created the task.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public TraceData build() {
                return new TraceData(this);
            } 

        } 

    }
}
