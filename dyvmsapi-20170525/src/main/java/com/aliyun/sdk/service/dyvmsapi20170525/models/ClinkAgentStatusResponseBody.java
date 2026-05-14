// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link ClinkAgentStatusResponseBody} extends {@link TeaModel}
 *
 * <p>ClinkAgentStatusResponseBody</p>
 */
public class ClinkAgentStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ClinkAgentStatusResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClinkAgentStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ClinkAgentStatusResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
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

        public ClinkAgentStatusResponseBody build() {
            return new ClinkAgentStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ClinkAgentStatusResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkAgentStatusResponseBody</p>
     */
    public static class AgentStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentStatus")
        private String agentStatus;

        @com.aliyun.core.annotation.NameInMap("AgentStatusDetail")
        private String agentStatusDetail;

        @com.aliyun.core.annotation.NameInMap("BindTel")
        private String bindTel;

        @com.aliyun.core.annotation.NameInMap("BindType")
        private Long bindType;

        @com.aliyun.core.annotation.NameInMap("BridgeCallCount")
        private Long bridgeCallCount;

        @com.aliyun.core.annotation.NameInMap("ClientName")
        private String clientName;

        @com.aliyun.core.annotation.NameInMap("Cno")
        private String cno;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("CustomerNumber")
        private String customerNumber;

        @com.aliyun.core.annotation.NameInMap("CustomerNumberEncrypt")
        private String customerNumberEncrypt;

        @com.aliyun.core.annotation.NameInMap("CustomerStatus")
        private String customerStatus;

        @com.aliyun.core.annotation.NameInMap("IbAnsweredRingingDuration")
        private Long ibAnsweredRingingDuration;

        @com.aliyun.core.annotation.NameInMap("IbClientAnsweredCount")
        private Long ibClientAnsweredCount;

        @com.aliyun.core.annotation.NameInMap("IbClientAnsweredRate")
        private Double ibClientAnsweredRate;

        @com.aliyun.core.annotation.NameInMap("IbClientTotalCount")
        private Long ibClientTotalCount;

        @com.aliyun.core.annotation.NameInMap("IbClientUnansweredCount")
        private Long ibClientUnansweredCount;

        @com.aliyun.core.annotation.NameInMap("IdleTimeOut")
        private Long idleTimeOut;

        @com.aliyun.core.annotation.NameInMap("IncomingCallCount")
        private Long incomingCallCount;

        @com.aliyun.core.annotation.NameInMap("LoginDuration")
        private Long loginDuration;

        @com.aliyun.core.annotation.NameInMap("ObAvgBridgeDuration")
        private Long obAvgBridgeDuration;

        @com.aliyun.core.annotation.NameInMap("ObBridgeDuration")
        private Long obBridgeDuration;

        @com.aliyun.core.annotation.NameInMap("ObBridgeRate")
        private Double obBridgeRate;

        @com.aliyun.core.annotation.NameInMap("ObCallCount")
        private Long obCallCount;

        @com.aliyun.core.annotation.NameInMap("ObClientUnbridgeCount")
        private Long obClientUnbridgeCount;

        @com.aliyun.core.annotation.NameInMap("ObCustomerBridgeCount")
        private Long obCustomerBridgeCount;

        @com.aliyun.core.annotation.NameInMap("ObCustomerUnbridgeCount")
        private Long obCustomerUnbridgeCount;

        @com.aliyun.core.annotation.NameInMap("PauseDescription")
        private String pauseDescription;

        @com.aliyun.core.annotation.NameInMap("PauseType")
        private Long pauseType;

        @com.aliyun.core.annotation.NameInMap("PredictToCall")
        private Long predictToCall;

        @com.aliyun.core.annotation.NameInMap("QueueIncomingCallCount")
        private Long queueIncomingCallCount;

        @com.aliyun.core.annotation.NameInMap("QueueInfo")
        private String queueInfo;

        @com.aliyun.core.annotation.NameInMap("Queues")
        private String queues;

        @com.aliyun.core.annotation.NameInMap("QuickUnlinkCount")
        private Long quickUnlinkCount;

        @com.aliyun.core.annotation.NameInMap("StateDuration")
        private Long stateDuration;

        @com.aliyun.core.annotation.NameInMap("TagNames")
        private java.util.List<String> tagNames;

        private AgentStatus(Builder builder) {
            this.agentStatus = builder.agentStatus;
            this.agentStatusDetail = builder.agentStatusDetail;
            this.bindTel = builder.bindTel;
            this.bindType = builder.bindType;
            this.bridgeCallCount = builder.bridgeCallCount;
            this.clientName = builder.clientName;
            this.cno = builder.cno;
            this.code = builder.code;
            this.customerNumber = builder.customerNumber;
            this.customerNumberEncrypt = builder.customerNumberEncrypt;
            this.customerStatus = builder.customerStatus;
            this.ibAnsweredRingingDuration = builder.ibAnsweredRingingDuration;
            this.ibClientAnsweredCount = builder.ibClientAnsweredCount;
            this.ibClientAnsweredRate = builder.ibClientAnsweredRate;
            this.ibClientTotalCount = builder.ibClientTotalCount;
            this.ibClientUnansweredCount = builder.ibClientUnansweredCount;
            this.idleTimeOut = builder.idleTimeOut;
            this.incomingCallCount = builder.incomingCallCount;
            this.loginDuration = builder.loginDuration;
            this.obAvgBridgeDuration = builder.obAvgBridgeDuration;
            this.obBridgeDuration = builder.obBridgeDuration;
            this.obBridgeRate = builder.obBridgeRate;
            this.obCallCount = builder.obCallCount;
            this.obClientUnbridgeCount = builder.obClientUnbridgeCount;
            this.obCustomerBridgeCount = builder.obCustomerBridgeCount;
            this.obCustomerUnbridgeCount = builder.obCustomerUnbridgeCount;
            this.pauseDescription = builder.pauseDescription;
            this.pauseType = builder.pauseType;
            this.predictToCall = builder.predictToCall;
            this.queueIncomingCallCount = builder.queueIncomingCallCount;
            this.queueInfo = builder.queueInfo;
            this.queues = builder.queues;
            this.quickUnlinkCount = builder.quickUnlinkCount;
            this.stateDuration = builder.stateDuration;
            this.tagNames = builder.tagNames;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentStatus create() {
            return builder().build();
        }

        /**
         * @return agentStatus
         */
        public String getAgentStatus() {
            return this.agentStatus;
        }

        /**
         * @return agentStatusDetail
         */
        public String getAgentStatusDetail() {
            return this.agentStatusDetail;
        }

        /**
         * @return bindTel
         */
        public String getBindTel() {
            return this.bindTel;
        }

        /**
         * @return bindType
         */
        public Long getBindType() {
            return this.bindType;
        }

        /**
         * @return bridgeCallCount
         */
        public Long getBridgeCallCount() {
            return this.bridgeCallCount;
        }

        /**
         * @return clientName
         */
        public String getClientName() {
            return this.clientName;
        }

        /**
         * @return cno
         */
        public String getCno() {
            return this.cno;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return customerNumber
         */
        public String getCustomerNumber() {
            return this.customerNumber;
        }

        /**
         * @return customerNumberEncrypt
         */
        public String getCustomerNumberEncrypt() {
            return this.customerNumberEncrypt;
        }

        /**
         * @return customerStatus
         */
        public String getCustomerStatus() {
            return this.customerStatus;
        }

        /**
         * @return ibAnsweredRingingDuration
         */
        public Long getIbAnsweredRingingDuration() {
            return this.ibAnsweredRingingDuration;
        }

        /**
         * @return ibClientAnsweredCount
         */
        public Long getIbClientAnsweredCount() {
            return this.ibClientAnsweredCount;
        }

        /**
         * @return ibClientAnsweredRate
         */
        public Double getIbClientAnsweredRate() {
            return this.ibClientAnsweredRate;
        }

        /**
         * @return ibClientTotalCount
         */
        public Long getIbClientTotalCount() {
            return this.ibClientTotalCount;
        }

        /**
         * @return ibClientUnansweredCount
         */
        public Long getIbClientUnansweredCount() {
            return this.ibClientUnansweredCount;
        }

        /**
         * @return idleTimeOut
         */
        public Long getIdleTimeOut() {
            return this.idleTimeOut;
        }

        /**
         * @return incomingCallCount
         */
        public Long getIncomingCallCount() {
            return this.incomingCallCount;
        }

        /**
         * @return loginDuration
         */
        public Long getLoginDuration() {
            return this.loginDuration;
        }

        /**
         * @return obAvgBridgeDuration
         */
        public Long getObAvgBridgeDuration() {
            return this.obAvgBridgeDuration;
        }

        /**
         * @return obBridgeDuration
         */
        public Long getObBridgeDuration() {
            return this.obBridgeDuration;
        }

        /**
         * @return obBridgeRate
         */
        public Double getObBridgeRate() {
            return this.obBridgeRate;
        }

        /**
         * @return obCallCount
         */
        public Long getObCallCount() {
            return this.obCallCount;
        }

        /**
         * @return obClientUnbridgeCount
         */
        public Long getObClientUnbridgeCount() {
            return this.obClientUnbridgeCount;
        }

        /**
         * @return obCustomerBridgeCount
         */
        public Long getObCustomerBridgeCount() {
            return this.obCustomerBridgeCount;
        }

        /**
         * @return obCustomerUnbridgeCount
         */
        public Long getObCustomerUnbridgeCount() {
            return this.obCustomerUnbridgeCount;
        }

        /**
         * @return pauseDescription
         */
        public String getPauseDescription() {
            return this.pauseDescription;
        }

        /**
         * @return pauseType
         */
        public Long getPauseType() {
            return this.pauseType;
        }

        /**
         * @return predictToCall
         */
        public Long getPredictToCall() {
            return this.predictToCall;
        }

        /**
         * @return queueIncomingCallCount
         */
        public Long getQueueIncomingCallCount() {
            return this.queueIncomingCallCount;
        }

        /**
         * @return queueInfo
         */
        public String getQueueInfo() {
            return this.queueInfo;
        }

        /**
         * @return queues
         */
        public String getQueues() {
            return this.queues;
        }

        /**
         * @return quickUnlinkCount
         */
        public Long getQuickUnlinkCount() {
            return this.quickUnlinkCount;
        }

        /**
         * @return stateDuration
         */
        public Long getStateDuration() {
            return this.stateDuration;
        }

        /**
         * @return tagNames
         */
        public java.util.List<String> getTagNames() {
            return this.tagNames;
        }

        public static final class Builder {
            private String agentStatus; 
            private String agentStatusDetail; 
            private String bindTel; 
            private Long bindType; 
            private Long bridgeCallCount; 
            private String clientName; 
            private String cno; 
            private String code; 
            private String customerNumber; 
            private String customerNumberEncrypt; 
            private String customerStatus; 
            private Long ibAnsweredRingingDuration; 
            private Long ibClientAnsweredCount; 
            private Double ibClientAnsweredRate; 
            private Long ibClientTotalCount; 
            private Long ibClientUnansweredCount; 
            private Long idleTimeOut; 
            private Long incomingCallCount; 
            private Long loginDuration; 
            private Long obAvgBridgeDuration; 
            private Long obBridgeDuration; 
            private Double obBridgeRate; 
            private Long obCallCount; 
            private Long obClientUnbridgeCount; 
            private Long obCustomerBridgeCount; 
            private Long obCustomerUnbridgeCount; 
            private String pauseDescription; 
            private Long pauseType; 
            private Long predictToCall; 
            private Long queueIncomingCallCount; 
            private String queueInfo; 
            private String queues; 
            private Long quickUnlinkCount; 
            private Long stateDuration; 
            private java.util.List<String> tagNames; 

            private Builder() {
            } 

            private Builder(AgentStatus model) {
                this.agentStatus = model.agentStatus;
                this.agentStatusDetail = model.agentStatusDetail;
                this.bindTel = model.bindTel;
                this.bindType = model.bindType;
                this.bridgeCallCount = model.bridgeCallCount;
                this.clientName = model.clientName;
                this.cno = model.cno;
                this.code = model.code;
                this.customerNumber = model.customerNumber;
                this.customerNumberEncrypt = model.customerNumberEncrypt;
                this.customerStatus = model.customerStatus;
                this.ibAnsweredRingingDuration = model.ibAnsweredRingingDuration;
                this.ibClientAnsweredCount = model.ibClientAnsweredCount;
                this.ibClientAnsweredRate = model.ibClientAnsweredRate;
                this.ibClientTotalCount = model.ibClientTotalCount;
                this.ibClientUnansweredCount = model.ibClientUnansweredCount;
                this.idleTimeOut = model.idleTimeOut;
                this.incomingCallCount = model.incomingCallCount;
                this.loginDuration = model.loginDuration;
                this.obAvgBridgeDuration = model.obAvgBridgeDuration;
                this.obBridgeDuration = model.obBridgeDuration;
                this.obBridgeRate = model.obBridgeRate;
                this.obCallCount = model.obCallCount;
                this.obClientUnbridgeCount = model.obClientUnbridgeCount;
                this.obCustomerBridgeCount = model.obCustomerBridgeCount;
                this.obCustomerUnbridgeCount = model.obCustomerUnbridgeCount;
                this.pauseDescription = model.pauseDescription;
                this.pauseType = model.pauseType;
                this.predictToCall = model.predictToCall;
                this.queueIncomingCallCount = model.queueIncomingCallCount;
                this.queueInfo = model.queueInfo;
                this.queues = model.queues;
                this.quickUnlinkCount = model.quickUnlinkCount;
                this.stateDuration = model.stateDuration;
                this.tagNames = model.tagNames;
            } 

            /**
             * <p>座席状态</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder agentStatus(String agentStatus) {
                this.agentStatus = agentStatus;
                return this;
            }

            /**
             * <p>座席状态详情</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder agentStatusDetail(String agentStatusDetail) {
                this.agentStatusDetail = agentStatusDetail;
                return this;
            }

            /**
             * <p>绑定号码</p>
             * 
             * <strong>example:</strong>
             * <p>1327770</p>
             */
            public Builder bindTel(String bindTel) {
                this.bindTel = bindTel;
                return this;
            }

            /**
             * <p>电话类型，1:电话；2:IP话机；3:软电话</p>
             * 
             * <strong>example:</strong>
             * <p>19</p>
             */
            public Builder bindType(Long bindType) {
                this.bindType = bindType;
                return this;
            }

            /**
             * <p>座席来电接听次数</p>
             * 
             * <strong>example:</strong>
             * <p>59</p>
             */
            public Builder bridgeCallCount(Long bridgeCallCount) {
                this.bridgeCallCount = bridgeCallCount;
                return this;
            }

            /**
             * <p>座席名称</p>
             * 
             * <strong>example:</strong>
             * <p>name1</p>
             */
            public Builder clientName(String clientName) {
                this.clientName = clientName;
                return this;
            }

            /**
             * <p>座席号</p>
             * 
             * <strong>example:</strong>
             * <p>1111</p>
             */
            public Builder cno(String cno) {
                this.cno = cno;
                return this;
            }

            /**
             * <p>座席code</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>客户号码</p>
             * 
             * <strong>example:</strong>
             * <p>177xxxx7750</p>
             */
            public Builder customerNumber(String customerNumber) {
                this.customerNumber = customerNumber;
                return this;
            }

            /**
             * <p>客户来电号码加密串</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder customerNumberEncrypt(String customerNumberEncrypt) {
                this.customerNumberEncrypt = customerNumberEncrypt;
                return this;
            }

            /**
             * <p>客户状态，空闲，呼叫中，响铃，通话</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder customerStatus(String customerStatus) {
                this.customerStatus = customerStatus;
                return this;
            }

            /**
             * <p>呼入接听总响铃时长</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder ibAnsweredRingingDuration(Long ibAnsweredRingingDuration) {
                this.ibAnsweredRingingDuration = ibAnsweredRingingDuration;
                return this;
            }

            /**
             * <p>客户呼入接听数</p>
             * 
             * <strong>example:</strong>
             * <p>66</p>
             */
            public Builder ibClientAnsweredCount(Long ibClientAnsweredCount) {
                this.ibClientAnsweredCount = ibClientAnsweredCount;
                return this;
            }

            /**
             * <p>客户呼入接听率</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder ibClientAnsweredRate(Double ibClientAnsweredRate) {
                this.ibClientAnsweredRate = ibClientAnsweredRate;
                return this;
            }

            /**
             * <p>客户呼入数</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder ibClientTotalCount(Long ibClientTotalCount) {
                this.ibClientTotalCount = ibClientTotalCount;
                return this;
            }

            /**
             * <p>客户呼入未接听数</p>
             * 
             * <strong>example:</strong>
             * <p>71</p>
             */
            public Builder ibClientUnansweredCount(Long ibClientUnansweredCount) {
                this.ibClientUnansweredCount = ibClientUnansweredCount;
                return this;
            }

            /**
             * <p>空闲超时时间（单位分钟）</p>
             * 
             * <strong>example:</strong>
             * <p>83</p>
             */
            public Builder idleTimeOut(Long idleTimeOut) {
                this.idleTimeOut = idleTimeOut;
                return this;
            }

            /**
             * <p>座席来电次数</p>
             * 
             * <strong>example:</strong>
             * <p>29</p>
             */
            public Builder incomingCallCount(Long incomingCallCount) {
                this.incomingCallCount = incomingCallCount;
                return this;
            }

            /**
             * <p>登录时长</p>
             * 
             * <strong>example:</strong>
             * <p>97</p>
             */
            public Builder loginDuration(Long loginDuration) {
                this.loginDuration = loginDuration;
                return this;
            }

            /**
             * <p>外呼平均通话时长</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder obAvgBridgeDuration(Long obAvgBridgeDuration) {
                this.obAvgBridgeDuration = obAvgBridgeDuration;
                return this;
            }

            /**
             * <p>外呼通话时长</p>
             * 
             * <strong>example:</strong>
             * <p>59</p>
             */
            public Builder obBridgeDuration(Long obBridgeDuration) {
                this.obBridgeDuration = obBridgeDuration;
                return this;
            }

            /**
             * <p>外呼接听率</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder obBridgeRate(Double obBridgeRate) {
                this.obBridgeRate = obBridgeRate;
                return this;
            }

            /**
             * <p>座席外呼数</p>
             * 
             * <strong>example:</strong>
             * <p>96</p>
             */
            public Builder obCallCount(Long obCallCount) {
                this.obCallCount = obCallCount;
                return this;
            }

            /**
             * <p>外呼座席未接听数</p>
             * 
             * <strong>example:</strong>
             * <p>75</p>
             */
            public Builder obClientUnbridgeCount(Long obClientUnbridgeCount) {
                this.obClientUnbridgeCount = obClientUnbridgeCount;
                return this;
            }

            /**
             * <p>外呼客户接听数</p>
             * 
             * <strong>example:</strong>
             * <p>55</p>
             */
            public Builder obCustomerBridgeCount(Long obCustomerBridgeCount) {
                this.obCustomerBridgeCount = obCustomerBridgeCount;
                return this;
            }

            /**
             * <p>外呼客户未接听数</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder obCustomerUnbridgeCount(Long obCustomerUnbridgeCount) {
                this.obCustomerUnbridgeCount = obCustomerUnbridgeCount;
                return this;
            }

            /**
             * <p>置忙状态描述</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder pauseDescription(String pauseDescription) {
                this.pauseDescription = pauseDescription;
                return this;
            }

            /**
             * <p>置忙类型</p>
             * 
             * <strong>example:</strong>
             * <p>87</p>
             */
            public Builder pauseType(Long pauseType) {
                this.pauseType = pauseType;
                return this;
            }

            /**
             * <p>座席是否处于预测外呼状态 1：是 0：否</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder predictToCall(Long predictToCall) {
                this.predictToCall = predictToCall;
                return this;
            }

            /**
             * <p>队列来电接听数</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder queueIncomingCallCount(Long queueIncomingCallCount) {
                this.queueIncomingCallCount = queueIncomingCallCount;
                return this;
            }

            /**
             * <p>队列信息</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder queueInfo(String queueInfo) {
                this.queueInfo = queueInfo;
                return this;
            }

            /**
             * <p>队列编号</p>
             * 
             * <strong>example:</strong>
             * <p>0035</p>
             */
            public Builder queues(String queues) {
                this.queues = queues;
                return this;
            }

            /**
             * <p>客户速挂数</p>
             * 
             * <strong>example:</strong>
             * <p>63</p>
             */
            public Builder quickUnlinkCount(Long quickUnlinkCount) {
                this.quickUnlinkCount = quickUnlinkCount;
                return this;
            }

            /**
             * <p>状态时长</p>
             * 
             * <strong>example:</strong>
             * <p>89</p>
             */
            public Builder stateDuration(Long stateDuration) {
                this.stateDuration = stateDuration;
                return this;
            }

            /**
             * <p>座席标签</p>
             */
            public Builder tagNames(java.util.List<String> tagNames) {
                this.tagNames = tagNames;
                return this;
            }

            public AgentStatus build() {
                return new AgentStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link ClinkAgentStatusResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkAgentStatusResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentStatus")
        private java.util.List<AgentStatus> agentStatus;

        @com.aliyun.core.annotation.NameInMap("ClinkRequestId")
        private String clinkRequestId;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.agentStatus = builder.agentStatus;
            this.clinkRequestId = builder.clinkRequestId;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentStatus
         */
        public java.util.List<AgentStatus> getAgentStatus() {
            return this.agentStatus;
        }

        /**
         * @return clinkRequestId
         */
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<AgentStatus> agentStatus; 
            private String clinkRequestId; 
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentStatus = model.agentStatus;
                this.clinkRequestId = model.clinkRequestId;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>[座席状态详情] #座席状态详情</p>
             */
            public Builder agentStatus(java.util.List<AgentStatus> agentStatus) {
                this.agentStatus = agentStatus;
                return this;
            }

            /**
             * <p>请求 id</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder clinkRequestId(String clinkRequestId) {
                this.clinkRequestId = clinkRequestId;
                return this;
            }

            /**
             * <p>当前页码</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>一页展示条数</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>总条数</p>
             * 
             * <strong>example:</strong>
             * <p>63</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
