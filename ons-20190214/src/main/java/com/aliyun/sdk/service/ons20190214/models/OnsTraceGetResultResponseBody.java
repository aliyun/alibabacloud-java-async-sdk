// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OnsTraceGetResultResponseBody} extends {@link TeaModel}
 *
 * <p>OnsTraceGetResultResponseBody</p>
 */
public class OnsTraceGetResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TraceData")
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
         * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>84EE24D2-851F-40D6-B99E-4D6AB909****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the message trace.</p>
         */
        public Builder traceData(TraceData traceData) {
            this.traceData = traceData;
            return this;
        }

        public OnsTraceGetResultResponseBody build() {
            return new OnsTraceGetResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link OnsTraceGetResultResponseBody} extends {@link TeaModel}
     *
     * <p>OnsTraceGetResultResponseBody</p>
     */
    public static class SubClientInfoDo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientHost")
        private String clientHost;

        @com.aliyun.core.annotation.NameInMap("CostTime")
        private Integer costTime;

        @com.aliyun.core.annotation.NameInMap("ReconsumeTimes")
        private Integer reconsumeTimes;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubGroupName")
        private String subGroupName;

        @com.aliyun.core.annotation.NameInMap("SubTime")
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
             * <p>The address of the consumer.</p>
             * 
             * <strong>example:</strong>
             * <p><code>30.5.**.**</code></p>
             */
            public Builder clientHost(String clientHost) {
                this.clientHost = clientHost;
                return this;
            }

            /**
             * <p>The period of time that the system took to consume the message. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>43</p>
             */
            public Builder costTime(Integer costTime) {
                this.costTime = costTime;
                return this;
            }

            /**
             * <p>The number of attempts that the ApsaraMQ for RocketMQ broker tried to send the message to the consumer.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder reconsumeTimes(Integer reconsumeTimes) {
                this.reconsumeTimes = reconsumeTimes;
                return this;
            }

            /**
             * <p>Indicates whether the message is consumed. Valid values:</p>
             * <ul>
             * <li><strong>CONSUME_FAILED</strong>: The message failed to be consumed.</li>
             * <li><strong>CONSUME_SUCCESS</strong>: The message is consumed.</li>
             * <li><strong>CONSUME_NOT_RETURN:</strong> No responses are returned.</li>
             * <li><strong>SEND_UNKNOWN:</strong> The message is a transactional message and is not committed.</li>
             * <li><strong>SEND_DELAY:</strong> The message is a scheduled or delayed message and is waiting to be consumed at the specified point in time.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CONSUME_SUCCESS</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the group that contains the consumer.</p>
             * 
             * <strong>example:</strong>
             * <p>GID_test</p>
             */
            public Builder subGroupName(String subGroupName) {
                this.subGroupName = subGroupName;
                return this;
            }

            /**
             * <p>The earliest point in time when the message was consumed.</p>
             * 
             * <strong>example:</strong>
             * <p>1570851590511</p>
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
    /**
     * 
     * {@link OnsTraceGetResultResponseBody} extends {@link TeaModel}
     *
     * <p>OnsTraceGetResultResponseBody</p>
     */
    public static class ClientList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SubClientInfoDo")
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
    /**
     * 
     * {@link OnsTraceGetResultResponseBody} extends {@link TeaModel}
     *
     * <p>OnsTraceGetResultResponseBody</p>
     */
    public static class SubMapDo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientList")
        private ClientList clientList;

        @com.aliyun.core.annotation.NameInMap("FailCount")
        private Integer failCount;

        @com.aliyun.core.annotation.NameInMap("SubGroupName")
        private String subGroupName;

        @com.aliyun.core.annotation.NameInMap("SuccessCount")
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
             * <p>The information about message consumption by consumers in the group.</p>
             */
            public Builder clientList(ClientList clientList) {
                this.clientList = clientList;
                return this;
            }

            /**
             * <p>The number of consumption failures.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder failCount(Integer failCount) {
                this.failCount = failCount;
                return this;
            }

            /**
             * <p>The ID of the consumer group.</p>
             * 
             * <strong>example:</strong>
             * <p>GID_test</p>
             */
            public Builder subGroupName(String subGroupName) {
                this.subGroupName = subGroupName;
                return this;
            }

            /**
             * <p>The number of successful consumptions.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link OnsTraceGetResultResponseBody} extends {@link TeaModel}
     *
     * <p>OnsTraceGetResultResponseBody</p>
     */
    public static class SubList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SubMapDo")
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
    /**
     * 
     * {@link OnsTraceGetResultResponseBody} extends {@link TeaModel}
     *
     * <p>OnsTraceGetResultResponseBody</p>
     */
    public static class TraceMapDo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BornHost")
        private String bornHost;

        @com.aliyun.core.annotation.NameInMap("CostTime")
        private Integer costTime;

        @com.aliyun.core.annotation.NameInMap("MsgId")
        private String msgId;

        @com.aliyun.core.annotation.NameInMap("MsgKey")
        private String msgKey;

        @com.aliyun.core.annotation.NameInMap("PubGroupName")
        private String pubGroupName;

        @com.aliyun.core.annotation.NameInMap("PubTime")
        private Long pubTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubList")
        private SubList subList;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("Topic")
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
             * <p>The address of the producer that generated the message.</p>
             * 
             * <strong>example:</strong>
             * <p><code>30.5.**.**</code></p>
             */
            public Builder bornHost(String bornHost) {
                this.bornHost = bornHost;
                return this;
            }

            /**
             * <p>The period of time that the system took to send the message. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>24</p>
             */
            public Builder costTime(Integer costTime) {
                this.costTime = costTime;
                return this;
            }

            /**
             * <p>The ID of the message.</p>
             * 
             * <strong>example:</strong>
             * <p>0BC1F01800002A9F000000531246****</p>
             */
            public Builder msgId(String msgId) {
                this.msgId = msgId;
                return this;
            }

            /**
             * <p>The key of the message.</p>
             * 
             * <strong>example:</strong>
             * <p>ORDERID_100</p>
             */
            public Builder msgKey(String msgKey) {
                this.msgKey = msgKey;
                return this;
            }

            /**
             * <p>The ID of the group that contains the producer.</p>
             * 
             * <strong>example:</strong>
             * <p>GID_test</p>
             */
            public Builder pubGroupName(String pubGroupName) {
                this.pubGroupName = pubGroupName;
                return this;
            }

            /**
             * <p>The point in time when the message was sent.</p>
             * 
             * <strong>example:</strong>
             * <p>1570850870478</p>
             */
            public Builder pubTime(Long pubTime) {
                this.pubTime = pubTime;
                return this;
            }

            /**
             * <p>Indicates whether the message is sent. Valid values:</p>
             * <ul>
             * <li><strong>SEND_SUCCESS</strong>: The message is sent.</li>
             * <li><strong>SEND_FAILED</strong>: The message failed to be sent.</li>
             * <li><strong>SEND_ROLLBACK:</strong> The message is a transactional message and is rolled back.</li>
             * <li><strong>SEND_UNKNOWN:</strong> The message is a transactional message and is not committed.</li>
             * <li><strong>SEND_DELAY:</strong> The message is a scheduled or delayed message and is waiting to be consumed at the specified point in time.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SEND_SUCCESS</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The consumption traces of the message.</p>
             */
            public Builder subList(SubList subList) {
                this.subList = subList;
                return this;
            }

            /**
             * <p>The tag of the message.</p>
             * 
             * <strong>example:</strong>
             * <p>TagA</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The topic to which the message belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
    /**
     * 
     * {@link OnsTraceGetResultResponseBody} extends {@link TeaModel}
     *
     * <p>OnsTraceGetResultResponseBody</p>
     */
    public static class TraceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TraceMapDo")
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
    /**
     * 
     * {@link OnsTraceGetResultResponseBody} extends {@link TeaModel}
     *
     * <p>OnsTraceGetResultResponseBody</p>
     */
    public static class TraceData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("MsgId")
        private String msgId;

        @com.aliyun.core.annotation.NameInMap("MsgKey")
        private String msgKey;

        @com.aliyun.core.annotation.NameInMap("QueryId")
        private String queryId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        @com.aliyun.core.annotation.NameInMap("TraceList")
        private TraceList traceList;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("UserId")
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
             * <p>The point in time when the task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1570966857000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the instance</p>
             * 
             * <strong>example:</strong>
             * <p>MQ_INST_111111111111_DOxxxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The ID of the message that is queried.</p>
             * 
             * <strong>example:</strong>
             * <p>1E05791C117818B4AAC23B1BB0CE****</p>
             */
            public Builder msgId(String msgId) {
                this.msgId = msgId;
                return this;
            }

            /**
             * <p>The key of the message that is queried.</p>
             * 
             * <strong>example:</strong>
             * <p>ORDERID_100</p>
             */
            public Builder msgKey(String msgKey) {
                this.msgKey = msgKey;
                return this;
            }

            /**
             * <p>The ID of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>272967562652883649157096685****</p>
             */
            public Builder queryId(String queryId) {
                this.queryId = queryId;
                return this;
            }

            /**
             * <p>The status of the task. Valid values:</p>
             * <ul>
             * <li><strong>finish</strong>: The task is complete.</li>
             * <li><strong>working</strong>: The task is in progress.</li>
             * <li><strong>removed</strong>: The task is deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>finish</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The topic in which the message is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * <p>The details of the message trace.</p>
             */
            public Builder traceList(TraceList traceList) {
                this.traceList = traceList;
                return this;
            }

            /**
             * <p>The most recent point in time when the task was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1570966877000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The ID of the user who created the task.</p>
             * 
             * <strong>example:</strong>
             * <p>27296756265288****</p>
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
