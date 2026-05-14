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
 * {@link CloudMonitorTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CloudMonitorTaskResponseBody</p>
 */
public class CloudMonitorTaskResponseBody extends TeaModel {
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

    private CloudMonitorTaskResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudMonitorTaskResponseBody create() {
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

        private Builder(CloudMonitorTaskResponseBody model) {
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

        public CloudMonitorTaskResponseBody build() {
            return new CloudMonitorTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CloudMonitorTaskResponseBody} extends {@link TeaModel}
     *
     * <p>CloudMonitorTaskResponseBody</p>
     */
    public static class AgentInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableCount")
        private Long availableCount;

        @com.aliyun.core.annotation.NameInMap("BridgeCount")
        private Long bridgeCount;

        @com.aliyun.core.annotation.NameInMap("OnlineCount")
        private Long onlineCount;

        @com.aliyun.core.annotation.NameInMap("RingingCount")
        private Long ringingCount;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        @com.aliyun.core.annotation.NameInMap("WrapupCount")
        private Long wrapupCount;

        private AgentInfo(Builder builder) {
            this.availableCount = builder.availableCount;
            this.bridgeCount = builder.bridgeCount;
            this.onlineCount = builder.onlineCount;
            this.ringingCount = builder.ringingCount;
            this.totalCount = builder.totalCount;
            this.wrapupCount = builder.wrapupCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentInfo create() {
            return builder().build();
        }

        /**
         * @return availableCount
         */
        public Long getAvailableCount() {
            return this.availableCount;
        }

        /**
         * @return bridgeCount
         */
        public Long getBridgeCount() {
            return this.bridgeCount;
        }

        /**
         * @return onlineCount
         */
        public Long getOnlineCount() {
            return this.onlineCount;
        }

        /**
         * @return ringingCount
         */
        public Long getRingingCount() {
            return this.ringingCount;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return wrapupCount
         */
        public Long getWrapupCount() {
            return this.wrapupCount;
        }

        public static final class Builder {
            private Long availableCount; 
            private Long bridgeCount; 
            private Long onlineCount; 
            private Long ringingCount; 
            private Long totalCount; 
            private Long wrapupCount; 

            private Builder() {
            } 

            private Builder(AgentInfo model) {
                this.availableCount = model.availableCount;
                this.bridgeCount = model.bridgeCount;
                this.onlineCount = model.onlineCount;
                this.ringingCount = model.ringingCount;
                this.totalCount = model.totalCount;
                this.wrapupCount = model.wrapupCount;
            } 

            /**
             * <p>可用座席数</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder availableCount(Long availableCount) {
                this.availableCount = availableCount;
                return this;
            }

            /**
             * <p>通话中的座席数</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder bridgeCount(Long bridgeCount) {
                this.bridgeCount = bridgeCount;
                return this;
            }

            /**
             * <p>当前在线座席数</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder onlineCount(Long onlineCount) {
                this.onlineCount = onlineCount;
                return this;
            }

            /**
             * <p>响铃中的座席数</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder ringingCount(Long ringingCount) {
                this.ringingCount = ringingCount;
                return this;
            }

            /**
             * <p>座席总数</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>整理中的座席数</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder wrapupCount(Long wrapupCount) {
                this.wrapupCount = wrapupCount;
                return this;
            }

            public AgentInfo build() {
                return new AgentInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CloudMonitorTaskResponseBody} extends {@link TeaModel}
     *
     * <p>CloudMonitorTaskResponseBody</p>
     */
    public static class AgentStatisticList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentAvgIdleTime")
        private Long agentAvgIdleTime;

        @com.aliyun.core.annotation.NameInMap("AgentStatus")
        private String agentStatus;

        @com.aliyun.core.annotation.NameInMap("AvgBridgeTime")
        private String avgBridgeTime;

        @com.aliyun.core.annotation.NameInMap("BridgeCount")
        private Long bridgeCount;

        @com.aliyun.core.annotation.NameInMap("BridgeIn2sRate")
        private Double bridgeIn2sRate;

        @com.aliyun.core.annotation.NameInMap("CallLimit")
        private Long callLimit;

        @com.aliyun.core.annotation.NameInMap("CalledCount")
        private Long calledCount;

        @com.aliyun.core.annotation.NameInMap("Cno")
        private String cno;

        @com.aliyun.core.annotation.NameInMap("EnterpriseCallLimit")
        private Long enterpriseCallLimit;

        @com.aliyun.core.annotation.NameInMap("EnterpriseTodayAnsweredCount")
        private Long enterpriseTodayAnsweredCount;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NoBridgeCount")
        private Long noBridgeCount;

        @com.aliyun.core.annotation.NameInMap("TodayAnsweredCount")
        private Long todayAnsweredCount;

        private AgentStatisticList(Builder builder) {
            this.agentAvgIdleTime = builder.agentAvgIdleTime;
            this.agentStatus = builder.agentStatus;
            this.avgBridgeTime = builder.avgBridgeTime;
            this.bridgeCount = builder.bridgeCount;
            this.bridgeIn2sRate = builder.bridgeIn2sRate;
            this.callLimit = builder.callLimit;
            this.calledCount = builder.calledCount;
            this.cno = builder.cno;
            this.enterpriseCallLimit = builder.enterpriseCallLimit;
            this.enterpriseTodayAnsweredCount = builder.enterpriseTodayAnsweredCount;
            this.name = builder.name;
            this.noBridgeCount = builder.noBridgeCount;
            this.todayAnsweredCount = builder.todayAnsweredCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentStatisticList create() {
            return builder().build();
        }

        /**
         * @return agentAvgIdleTime
         */
        public Long getAgentAvgIdleTime() {
            return this.agentAvgIdleTime;
        }

        /**
         * @return agentStatus
         */
        public String getAgentStatus() {
            return this.agentStatus;
        }

        /**
         * @return avgBridgeTime
         */
        public String getAvgBridgeTime() {
            return this.avgBridgeTime;
        }

        /**
         * @return bridgeCount
         */
        public Long getBridgeCount() {
            return this.bridgeCount;
        }

        /**
         * @return bridgeIn2sRate
         */
        public Double getBridgeIn2sRate() {
            return this.bridgeIn2sRate;
        }

        /**
         * @return callLimit
         */
        public Long getCallLimit() {
            return this.callLimit;
        }

        /**
         * @return calledCount
         */
        public Long getCalledCount() {
            return this.calledCount;
        }

        /**
         * @return cno
         */
        public String getCno() {
            return this.cno;
        }

        /**
         * @return enterpriseCallLimit
         */
        public Long getEnterpriseCallLimit() {
            return this.enterpriseCallLimit;
        }

        /**
         * @return enterpriseTodayAnsweredCount
         */
        public Long getEnterpriseTodayAnsweredCount() {
            return this.enterpriseTodayAnsweredCount;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return noBridgeCount
         */
        public Long getNoBridgeCount() {
            return this.noBridgeCount;
        }

        /**
         * @return todayAnsweredCount
         */
        public Long getTodayAnsweredCount() {
            return this.todayAnsweredCount;
        }

        public static final class Builder {
            private Long agentAvgIdleTime; 
            private String agentStatus; 
            private String avgBridgeTime; 
            private Long bridgeCount; 
            private Double bridgeIn2sRate; 
            private Long callLimit; 
            private Long calledCount; 
            private String cno; 
            private Long enterpriseCallLimit; 
            private Long enterpriseTodayAnsweredCount; 
            private String name; 
            private Long noBridgeCount; 
            private Long todayAnsweredCount; 

            private Builder() {
            } 

            private Builder(AgentStatisticList model) {
                this.agentAvgIdleTime = model.agentAvgIdleTime;
                this.agentStatus = model.agentStatus;
                this.avgBridgeTime = model.avgBridgeTime;
                this.bridgeCount = model.bridgeCount;
                this.bridgeIn2sRate = model.bridgeIn2sRate;
                this.callLimit = model.callLimit;
                this.calledCount = model.calledCount;
                this.cno = model.cno;
                this.enterpriseCallLimit = model.enterpriseCallLimit;
                this.enterpriseTodayAnsweredCount = model.enterpriseTodayAnsweredCount;
                this.name = model.name;
                this.noBridgeCount = model.noBridgeCount;
                this.todayAnsweredCount = model.todayAnsweredCount;
            } 

            /**
             * <p>座席平均进线时长,空闲时长/呼叫数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder agentAvgIdleTime(Long agentAvgIdleTime) {
                this.agentAvgIdleTime = agentAvgIdleTime;
                return this;
            }

            /**
             * <p>座席当前状态:  stateIdle(空闲)  statePause(置忙)  stateInuse(通话） stateCalling(呼叫中)  stateWrapup(整理)   为空代表该当前时间座席在该任务中没有相关状态，如：座席未被使用等</p>
             * 
             * <strong>example:</strong>
             * <p>stateIdle</p>
             */
            public Builder agentStatus(String agentStatus) {
                this.agentStatus = agentStatus;
                return this;
            }

            /**
             * <p>座席平均通话时长，单位秒数</p>
             * 
             * <strong>example:</strong>
             * <p>116</p>
             */
            public Builder avgBridgeTime(String avgBridgeTime) {
                this.avgBridgeTime = avgBridgeTime;
                return this;
            }

            /**
             * <p>接听数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder bridgeCount(Long bridgeCount) {
                this.bridgeCount = bridgeCount;
                return this;
            }

            /**
             * <p>座席自动应答率=(座席接通时间-开始呼叫座席时间)&lt;=2s的通话数/座席接通数</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder bridgeIn2sRate(Double bridgeIn2sRate) {
                this.bridgeIn2sRate = bridgeIn2sRate;
                return this;
            }

            /**
             * <p>任务级别，座席单日接听上限，-1代表未配置接听上限</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder callLimit(Long callLimit) {
                this.callLimit = callLimit;
                return this;
            }

            /**
             * <p>呼叫数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder calledCount(Long calledCount) {
                this.calledCount = calledCount;
                return this;
            }

            /**
             * <p>座席工号</p>
             * 
             * <strong>example:</strong>
             * <p>1111</p>
             */
            public Builder cno(String cno) {
                this.cno = cno;
                return this;
            }

            /**
             * <p>企业级别 座席单日接听上限，-1代表未配置接听上限</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder enterpriseCallLimit(Long enterpriseCallLimit) {
                this.enterpriseCallLimit = enterpriseCallLimit;
                return this;
            }

            /**
             * <p>企业级别 座席今日已接听数</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder enterpriseTodayAnsweredCount(Long enterpriseTodayAnsweredCount) {
                this.enterpriseTodayAnsweredCount = enterpriseTodayAnsweredCount;
                return this;
            }

            /**
             * <p>座席名称</p>
             * 
             * <strong>example:</strong>
             * <p>name2</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>座席未接听数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder noBridgeCount(Long noBridgeCount) {
                this.noBridgeCount = noBridgeCount;
                return this;
            }

            /**
             * <p>任务级别 座席今日已接听数</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder todayAnsweredCount(Long todayAnsweredCount) {
                this.todayAnsweredCount = todayAnsweredCount;
                return this;
            }

            public AgentStatisticList build() {
                return new AgentStatisticList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CloudMonitorTaskResponseBody} extends {@link TeaModel}
     *
     * <p>CloudMonitorTaskResponseBody</p>
     */
    public static class ChannelInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnswerCount")
        private Long answerCount;

        @com.aliyun.core.annotation.NameInMap("BridgedCount")
        private Long bridgedCount;

        @com.aliyun.core.annotation.NameInMap("ChannelCount")
        private Long channelCount;

        @com.aliyun.core.annotation.NameInMap("EnterpriseChannelCount")
        private Long enterpriseChannelCount;

        @com.aliyun.core.annotation.NameInMap("IvrCount")
        private Long ivrCount;

        @com.aliyun.core.annotation.NameInMap("WaitAgentCount")
        private Long waitAgentCount;

        @com.aliyun.core.annotation.NameInMap("WaitAnswerCount")
        private Long waitAnswerCount;

        private ChannelInfo(Builder builder) {
            this.answerCount = builder.answerCount;
            this.bridgedCount = builder.bridgedCount;
            this.channelCount = builder.channelCount;
            this.enterpriseChannelCount = builder.enterpriseChannelCount;
            this.ivrCount = builder.ivrCount;
            this.waitAgentCount = builder.waitAgentCount;
            this.waitAnswerCount = builder.waitAnswerCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChannelInfo create() {
            return builder().build();
        }

        /**
         * @return answerCount
         */
        public Long getAnswerCount() {
            return this.answerCount;
        }

        /**
         * @return bridgedCount
         */
        public Long getBridgedCount() {
            return this.bridgedCount;
        }

        /**
         * @return channelCount
         */
        public Long getChannelCount() {
            return this.channelCount;
        }

        /**
         * @return enterpriseChannelCount
         */
        public Long getEnterpriseChannelCount() {
            return this.enterpriseChannelCount;
        }

        /**
         * @return ivrCount
         */
        public Long getIvrCount() {
            return this.ivrCount;
        }

        /**
         * @return waitAgentCount
         */
        public Long getWaitAgentCount() {
            return this.waitAgentCount;
        }

        /**
         * @return waitAnswerCount
         */
        public Long getWaitAnswerCount() {
            return this.waitAnswerCount;
        }

        public static final class Builder {
            private Long answerCount; 
            private Long bridgedCount; 
            private Long channelCount; 
            private Long enterpriseChannelCount; 
            private Long ivrCount; 
            private Long waitAgentCount; 
            private Long waitAnswerCount; 

            private Builder() {
            } 

            private Builder(ChannelInfo model) {
                this.answerCount = model.answerCount;
                this.bridgedCount = model.bridgedCount;
                this.channelCount = model.channelCount;
                this.enterpriseChannelCount = model.enterpriseChannelCount;
                this.ivrCount = model.ivrCount;
                this.waitAgentCount = model.waitAgentCount;
                this.waitAnswerCount = model.waitAnswerCount;
            } 

            /**
             * <p>客户接通个数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder answerCount(Long answerCount) {
                this.answerCount = answerCount;
                return this;
            }

            /**
             * <p>桥接个数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder bridgedCount(Long bridgedCount) {
                this.bridgedCount = bridgedCount;
                return this;
            }

            /**
             * <p>任务当前通道数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder channelCount(Long channelCount) {
                this.channelCount = channelCount;
                return this;
            }

            /**
             * <p>企业预测外呼通道数</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder enterpriseChannelCount(Long enterpriseChannelCount) {
                this.enterpriseChannelCount = enterpriseChannelCount;
                return this;
            }

            /**
             * <p>溢出到ivr数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ivrCount(Long ivrCount) {
                this.ivrCount = ivrCount;
                return this;
            }

            /**
             * <p>等待转座席的个数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder waitAgentCount(Long waitAgentCount) {
                this.waitAgentCount = waitAgentCount;
                return this;
            }

            /**
             * <p>等待客户接听的个数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder waitAnswerCount(Long waitAnswerCount) {
                this.waitAnswerCount = waitAnswerCount;
                return this;
            }

            public ChannelInfo build() {
                return new ChannelInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CloudMonitorTaskResponseBody} extends {@link TeaModel}
     *
     * <p>CloudMonitorTaskResponseBody</p>
     */
    public static class RemovedAgentStatisticList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentAvgIdleTime")
        private Long agentAvgIdleTime;

        @com.aliyun.core.annotation.NameInMap("AgentStatus")
        private String agentStatus;

        @com.aliyun.core.annotation.NameInMap("AvgBridgeTime")
        private String avgBridgeTime;

        @com.aliyun.core.annotation.NameInMap("BridgeCount")
        private Long bridgeCount;

        @com.aliyun.core.annotation.NameInMap("BridgeIn2sRate")
        private Double bridgeIn2sRate;

        @com.aliyun.core.annotation.NameInMap("CallLimit")
        private Long callLimit;

        @com.aliyun.core.annotation.NameInMap("CalledCount")
        private Long calledCount;

        @com.aliyun.core.annotation.NameInMap("Cno")
        private String cno;

        @com.aliyun.core.annotation.NameInMap("EnterpriseCallLimit")
        private Long enterpriseCallLimit;

        @com.aliyun.core.annotation.NameInMap("EnterpriseTodayAnsweredCount")
        private Long enterpriseTodayAnsweredCount;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NoBridgeCount")
        private Long noBridgeCount;

        @com.aliyun.core.annotation.NameInMap("TodayAnsweredCount")
        private Long todayAnsweredCount;

        private RemovedAgentStatisticList(Builder builder) {
            this.agentAvgIdleTime = builder.agentAvgIdleTime;
            this.agentStatus = builder.agentStatus;
            this.avgBridgeTime = builder.avgBridgeTime;
            this.bridgeCount = builder.bridgeCount;
            this.bridgeIn2sRate = builder.bridgeIn2sRate;
            this.callLimit = builder.callLimit;
            this.calledCount = builder.calledCount;
            this.cno = builder.cno;
            this.enterpriseCallLimit = builder.enterpriseCallLimit;
            this.enterpriseTodayAnsweredCount = builder.enterpriseTodayAnsweredCount;
            this.name = builder.name;
            this.noBridgeCount = builder.noBridgeCount;
            this.todayAnsweredCount = builder.todayAnsweredCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemovedAgentStatisticList create() {
            return builder().build();
        }

        /**
         * @return agentAvgIdleTime
         */
        public Long getAgentAvgIdleTime() {
            return this.agentAvgIdleTime;
        }

        /**
         * @return agentStatus
         */
        public String getAgentStatus() {
            return this.agentStatus;
        }

        /**
         * @return avgBridgeTime
         */
        public String getAvgBridgeTime() {
            return this.avgBridgeTime;
        }

        /**
         * @return bridgeCount
         */
        public Long getBridgeCount() {
            return this.bridgeCount;
        }

        /**
         * @return bridgeIn2sRate
         */
        public Double getBridgeIn2sRate() {
            return this.bridgeIn2sRate;
        }

        /**
         * @return callLimit
         */
        public Long getCallLimit() {
            return this.callLimit;
        }

        /**
         * @return calledCount
         */
        public Long getCalledCount() {
            return this.calledCount;
        }

        /**
         * @return cno
         */
        public String getCno() {
            return this.cno;
        }

        /**
         * @return enterpriseCallLimit
         */
        public Long getEnterpriseCallLimit() {
            return this.enterpriseCallLimit;
        }

        /**
         * @return enterpriseTodayAnsweredCount
         */
        public Long getEnterpriseTodayAnsweredCount() {
            return this.enterpriseTodayAnsweredCount;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return noBridgeCount
         */
        public Long getNoBridgeCount() {
            return this.noBridgeCount;
        }

        /**
         * @return todayAnsweredCount
         */
        public Long getTodayAnsweredCount() {
            return this.todayAnsweredCount;
        }

        public static final class Builder {
            private Long agentAvgIdleTime; 
            private String agentStatus; 
            private String avgBridgeTime; 
            private Long bridgeCount; 
            private Double bridgeIn2sRate; 
            private Long callLimit; 
            private Long calledCount; 
            private String cno; 
            private Long enterpriseCallLimit; 
            private Long enterpriseTodayAnsweredCount; 
            private String name; 
            private Long noBridgeCount; 
            private Long todayAnsweredCount; 

            private Builder() {
            } 

            private Builder(RemovedAgentStatisticList model) {
                this.agentAvgIdleTime = model.agentAvgIdleTime;
                this.agentStatus = model.agentStatus;
                this.avgBridgeTime = model.avgBridgeTime;
                this.bridgeCount = model.bridgeCount;
                this.bridgeIn2sRate = model.bridgeIn2sRate;
                this.callLimit = model.callLimit;
                this.calledCount = model.calledCount;
                this.cno = model.cno;
                this.enterpriseCallLimit = model.enterpriseCallLimit;
                this.enterpriseTodayAnsweredCount = model.enterpriseTodayAnsweredCount;
                this.name = model.name;
                this.noBridgeCount = model.noBridgeCount;
                this.todayAnsweredCount = model.todayAnsweredCount;
            } 

            /**
             * <p>座席平均进线时长,空闲时长/呼叫数</p>
             * 
             * <strong>example:</strong>
             * <p>13</p>
             */
            public Builder agentAvgIdleTime(Long agentAvgIdleTime) {
                this.agentAvgIdleTime = agentAvgIdleTime;
                return this;
            }

            /**
             * <p>座席当前状态:  stateIdle(空闲)  statePause(置忙)  stateInuse(通话） stateCalling(呼叫中)  stateWrapup(整理)   为空代表该当前时间座席在该任务中没有相关状态，如：座席未被使用等</p>
             * 
             * <strong>example:</strong>
             * <p>stateIdle</p>
             */
            public Builder agentStatus(String agentStatus) {
                this.agentStatus = agentStatus;
                return this;
            }

            /**
             * <p>座席平均通话时长，单位秒数</p>
             * 
             * <strong>example:</strong>
             * <p>39</p>
             */
            public Builder avgBridgeTime(String avgBridgeTime) {
                this.avgBridgeTime = avgBridgeTime;
                return this;
            }

            /**
             * <p>接听数</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder bridgeCount(Long bridgeCount) {
                this.bridgeCount = bridgeCount;
                return this;
            }

            /**
             * <p>座席自动应答率=(座席接通时间-开始呼叫座席时间)&lt;=2s的通话数/座席接通数</p>
             * 
             * <strong>example:</strong>
             * <p>3.55</p>
             */
            public Builder bridgeIn2sRate(Double bridgeIn2sRate) {
                this.bridgeIn2sRate = bridgeIn2sRate;
                return this;
            }

            /**
             * <p>任务级别，座席单日接听上限，-1代表未配置接听上限</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder callLimit(Long callLimit) {
                this.callLimit = callLimit;
                return this;
            }

            /**
             * <p>呼叫数</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder calledCount(Long calledCount) {
                this.calledCount = calledCount;
                return this;
            }

            /**
             * <p>座席工号</p>
             * 
             * <strong>example:</strong>
             * <p>1111</p>
             */
            public Builder cno(String cno) {
                this.cno = cno;
                return this;
            }

            /**
             * <p>企业级别 座席单日接听上限，-1代表未配置接听上限</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder enterpriseCallLimit(Long enterpriseCallLimit) {
                this.enterpriseCallLimit = enterpriseCallLimit;
                return this;
            }

            /**
             * <p>企业级别 座席今日已接听数</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder enterpriseTodayAnsweredCount(Long enterpriseTodayAnsweredCount) {
                this.enterpriseTodayAnsweredCount = enterpriseTodayAnsweredCount;
                return this;
            }

            /**
             * <p>座席名称</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>座席未接听数</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder noBridgeCount(Long noBridgeCount) {
                this.noBridgeCount = noBridgeCount;
                return this;
            }

            /**
             * <p>任务级别 座席今日已接听数</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder todayAnsweredCount(Long todayAnsweredCount) {
                this.todayAnsweredCount = todayAnsweredCount;
                return this;
            }

            public RemovedAgentStatisticList build() {
                return new RemovedAgentStatisticList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CloudMonitorTaskResponseBody} extends {@link TeaModel}
     *
     * <p>CloudMonitorTaskResponseBody</p>
     */
    public static class CtiLinkTaskProperty extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OverTime")
        private String overTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        @com.aliyun.core.annotation.NameInMap("StatusDescription")
        private String statusDescription;

        private CtiLinkTaskProperty(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.overTime = builder.overTime;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.statusDescription = builder.statusDescription;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CtiLinkTaskProperty create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return overTime
         */
        public String getOverTime() {
            return this.overTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return statusDescription
         */
        public String getStatusDescription() {
            return this.statusDescription;
        }

        public static final class Builder {
            private Long id; 
            private String name; 
            private String overTime; 
            private String startTime; 
            private Long status; 
            private String statusDescription; 

            private Builder() {
            } 

            private Builder(CtiLinkTaskProperty model) {
                this.id = model.id;
                this.name = model.name;
                this.overTime = model.overTime;
                this.startTime = model.startTime;
                this.status = model.status;
                this.statusDescription = model.statusDescription;
            } 

            /**
             * <p>外呼任务Id</p>
             * 
             * <strong>example:</strong>
             * <p>12314</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>任务名称</p>
             * 
             * <strong>example:</strong>
             * <p>testTask</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>任务结束时间</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-20 11:00:00</p>
             */
            public Builder overTime(String overTime) {
                this.overTime = overTime;
                return this;
            }

            /**
             * <p>任务开始时间</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-20 10:00:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>任务状态，0.初始 1.运行中 2.暂停 3.结束</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * <p>任务状态描述</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder statusDescription(String statusDescription) {
                this.statusDescription = statusDescription;
                return this;
            }

            public CtiLinkTaskProperty build() {
                return new CtiLinkTaskProperty(this);
            } 

        } 

    }
    /**
     * 
     * {@link CloudMonitorTaskResponseBody} extends {@link TeaModel}
     *
     * <p>CloudMonitorTaskResponseBody</p>
     */
    public static class Statistic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentCount")
        private Long agentCount;

        @com.aliyun.core.annotation.NameInMap("AnswerCount")
        private Long answerCount;

        @com.aliyun.core.annotation.NameInMap("CallAgentCount")
        private Long callAgentCount;

        @com.aliyun.core.annotation.NameInMap("CalledCount")
        private Long calledCount;

        @com.aliyun.core.annotation.NameInMap("CtiLinkTaskProperty")
        private CtiLinkTaskProperty ctiLinkTaskProperty;

        @com.aliyun.core.annotation.NameInMap("UncalledCount")
        private Long uncalledCount;

        private Statistic(Builder builder) {
            this.agentCount = builder.agentCount;
            this.answerCount = builder.answerCount;
            this.callAgentCount = builder.callAgentCount;
            this.calledCount = builder.calledCount;
            this.ctiLinkTaskProperty = builder.ctiLinkTaskProperty;
            this.uncalledCount = builder.uncalledCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Statistic create() {
            return builder().build();
        }

        /**
         * @return agentCount
         */
        public Long getAgentCount() {
            return this.agentCount;
        }

        /**
         * @return answerCount
         */
        public Long getAnswerCount() {
            return this.answerCount;
        }

        /**
         * @return callAgentCount
         */
        public Long getCallAgentCount() {
            return this.callAgentCount;
        }

        /**
         * @return calledCount
         */
        public Long getCalledCount() {
            return this.calledCount;
        }

        /**
         * @return ctiLinkTaskProperty
         */
        public CtiLinkTaskProperty getCtiLinkTaskProperty() {
            return this.ctiLinkTaskProperty;
        }

        /**
         * @return uncalledCount
         */
        public Long getUncalledCount() {
            return this.uncalledCount;
        }

        public static final class Builder {
            private Long agentCount; 
            private Long answerCount; 
            private Long callAgentCount; 
            private Long calledCount; 
            private CtiLinkTaskProperty ctiLinkTaskProperty; 
            private Long uncalledCount; 

            private Builder() {
            } 

            private Builder(Statistic model) {
                this.agentCount = model.agentCount;
                this.answerCount = model.answerCount;
                this.callAgentCount = model.callAgentCount;
                this.calledCount = model.calledCount;
                this.ctiLinkTaskProperty = model.ctiLinkTaskProperty;
                this.uncalledCount = model.uncalledCount;
            } 

            /**
             * <p>座席数量</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder agentCount(Long agentCount) {
                this.agentCount = agentCount;
                return this;
            }

            /**
             * <p>应答数量</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder answerCount(Long answerCount) {
                this.answerCount = answerCount;
                return this;
            }

            /**
             * <p>呼叫坐席数</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder callAgentCount(Long callAgentCount) {
                this.callAgentCount = callAgentCount;
                return this;
            }

            /**
             * <p>已呼叫数量</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder calledCount(Long calledCount) {
                this.calledCount = calledCount;
                return this;
            }

            /**
             * <p>任务属性</p>
             */
            public Builder ctiLinkTaskProperty(CtiLinkTaskProperty ctiLinkTaskProperty) {
                this.ctiLinkTaskProperty = ctiLinkTaskProperty;
                return this;
            }

            /**
             * <p>未呼叫数量</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder uncalledCount(Long uncalledCount) {
                this.uncalledCount = uncalledCount;
                return this;
            }

            public Statistic build() {
                return new Statistic(this);
            } 

        } 

    }
    /**
     * 
     * {@link CloudMonitorTaskResponseBody} extends {@link TeaModel}
     *
     * <p>CloudMonitorTaskResponseBody</p>
     */
    public static class TodayStatisticCtiLinkTaskProperty extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OverTime")
        private String overTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusDescription")
        private String statusDescription;

        private TodayStatisticCtiLinkTaskProperty(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.overTime = builder.overTime;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.statusDescription = builder.statusDescription;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TodayStatisticCtiLinkTaskProperty create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return overTime
         */
        public String getOverTime() {
            return this.overTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusDescription
         */
        public String getStatusDescription() {
            return this.statusDescription;
        }

        public static final class Builder {
            private Long id; 
            private String name; 
            private String overTime; 
            private String startTime; 
            private String status; 
            private String statusDescription; 

            private Builder() {
            } 

            private Builder(TodayStatisticCtiLinkTaskProperty model) {
                this.id = model.id;
                this.name = model.name;
                this.overTime = model.overTime;
                this.startTime = model.startTime;
                this.status = model.status;
                this.statusDescription = model.statusDescription;
            } 

            /**
             * <p>外呼任务Id</p>
             * 
             * <strong>example:</strong>
             * <p>12314</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>任务名称</p>
             * 
             * <strong>example:</strong>
             * <p>testTask</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>任务结束时间</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-20 11:00:00</p>
             */
            public Builder overTime(String overTime) {
                this.overTime = overTime;
                return this;
            }

            /**
             * <p>任务开始时间</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-20 10:00:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>任务状态，0.初始 1.运行中 2.暂停 3.结束</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>任务状态描述</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder statusDescription(String statusDescription) {
                this.statusDescription = statusDescription;
                return this;
            }

            public TodayStatisticCtiLinkTaskProperty build() {
                return new TodayStatisticCtiLinkTaskProperty(this);
            } 

        } 

    }
    /**
     * 
     * {@link CloudMonitorTaskResponseBody} extends {@link TeaModel}
     *
     * <p>CloudMonitorTaskResponseBody</p>
     */
    public static class TodayStatistic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentCount")
        private Long agentCount;

        @com.aliyun.core.annotation.NameInMap("AnswerCount")
        private Long answerCount;

        @com.aliyun.core.annotation.NameInMap("CallAgentCount")
        private Long callAgentCount;

        @com.aliyun.core.annotation.NameInMap("CalledCount")
        private Long calledCount;

        @com.aliyun.core.annotation.NameInMap("CtiLinkTaskProperty")
        private TodayStatisticCtiLinkTaskProperty ctiLinkTaskProperty;

        @com.aliyun.core.annotation.NameInMap("UncalledCount")
        private Long uncalledCount;

        private TodayStatistic(Builder builder) {
            this.agentCount = builder.agentCount;
            this.answerCount = builder.answerCount;
            this.callAgentCount = builder.callAgentCount;
            this.calledCount = builder.calledCount;
            this.ctiLinkTaskProperty = builder.ctiLinkTaskProperty;
            this.uncalledCount = builder.uncalledCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TodayStatistic create() {
            return builder().build();
        }

        /**
         * @return agentCount
         */
        public Long getAgentCount() {
            return this.agentCount;
        }

        /**
         * @return answerCount
         */
        public Long getAnswerCount() {
            return this.answerCount;
        }

        /**
         * @return callAgentCount
         */
        public Long getCallAgentCount() {
            return this.callAgentCount;
        }

        /**
         * @return calledCount
         */
        public Long getCalledCount() {
            return this.calledCount;
        }

        /**
         * @return ctiLinkTaskProperty
         */
        public TodayStatisticCtiLinkTaskProperty getCtiLinkTaskProperty() {
            return this.ctiLinkTaskProperty;
        }

        /**
         * @return uncalledCount
         */
        public Long getUncalledCount() {
            return this.uncalledCount;
        }

        public static final class Builder {
            private Long agentCount; 
            private Long answerCount; 
            private Long callAgentCount; 
            private Long calledCount; 
            private TodayStatisticCtiLinkTaskProperty ctiLinkTaskProperty; 
            private Long uncalledCount; 

            private Builder() {
            } 

            private Builder(TodayStatistic model) {
                this.agentCount = model.agentCount;
                this.answerCount = model.answerCount;
                this.callAgentCount = model.callAgentCount;
                this.calledCount = model.calledCount;
                this.ctiLinkTaskProperty = model.ctiLinkTaskProperty;
                this.uncalledCount = model.uncalledCount;
            } 

            /**
             * <p>座席数量</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder agentCount(Long agentCount) {
                this.agentCount = agentCount;
                return this;
            }

            /**
             * <p>应答数量</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder answerCount(Long answerCount) {
                this.answerCount = answerCount;
                return this;
            }

            /**
             * <p>呼叫坐席数</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder callAgentCount(Long callAgentCount) {
                this.callAgentCount = callAgentCount;
                return this;
            }

            /**
             * <p>已呼叫数量</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder calledCount(Long calledCount) {
                this.calledCount = calledCount;
                return this;
            }

            /**
             * <p>任务属性</p>
             */
            public Builder ctiLinkTaskProperty(TodayStatisticCtiLinkTaskProperty ctiLinkTaskProperty) {
                this.ctiLinkTaskProperty = ctiLinkTaskProperty;
                return this;
            }

            /**
             * <p>未呼叫数量</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder uncalledCount(Long uncalledCount) {
                this.uncalledCount = uncalledCount;
                return this;
            }

            public TodayStatistic build() {
                return new TodayStatistic(this);
            } 

        } 

    }
    /**
     * 
     * {@link CloudMonitorTaskResponseBody} extends {@link TeaModel}
     *
     * <p>CloudMonitorTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentInfo")
        private AgentInfo agentInfo;

        @com.aliyun.core.annotation.NameInMap("AgentStatisticList")
        private java.util.List<AgentStatisticList> agentStatisticList;

        @com.aliyun.core.annotation.NameInMap("ChannelInfo")
        private ChannelInfo channelInfo;

        @com.aliyun.core.annotation.NameInMap("RemovedAgentStatisticList")
        private java.util.List<RemovedAgentStatisticList> removedAgentStatisticList;

        @com.aliyun.core.annotation.NameInMap("Statistic")
        private Statistic statistic;

        @com.aliyun.core.annotation.NameInMap("TodayStatistic")
        private TodayStatistic todayStatistic;

        private Data(Builder builder) {
            this.agentInfo = builder.agentInfo;
            this.agentStatisticList = builder.agentStatisticList;
            this.channelInfo = builder.channelInfo;
            this.removedAgentStatisticList = builder.removedAgentStatisticList;
            this.statistic = builder.statistic;
            this.todayStatistic = builder.todayStatistic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentInfo
         */
        public AgentInfo getAgentInfo() {
            return this.agentInfo;
        }

        /**
         * @return agentStatisticList
         */
        public java.util.List<AgentStatisticList> getAgentStatisticList() {
            return this.agentStatisticList;
        }

        /**
         * @return channelInfo
         */
        public ChannelInfo getChannelInfo() {
            return this.channelInfo;
        }

        /**
         * @return removedAgentStatisticList
         */
        public java.util.List<RemovedAgentStatisticList> getRemovedAgentStatisticList() {
            return this.removedAgentStatisticList;
        }

        /**
         * @return statistic
         */
        public Statistic getStatistic() {
            return this.statistic;
        }

        /**
         * @return todayStatistic
         */
        public TodayStatistic getTodayStatistic() {
            return this.todayStatistic;
        }

        public static final class Builder {
            private AgentInfo agentInfo; 
            private java.util.List<AgentStatisticList> agentStatisticList; 
            private ChannelInfo channelInfo; 
            private java.util.List<RemovedAgentStatisticList> removedAgentStatisticList; 
            private Statistic statistic; 
            private TodayStatistic todayStatistic; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentInfo = model.agentInfo;
                this.agentStatisticList = model.agentStatisticList;
                this.channelInfo = model.channelInfo;
                this.removedAgentStatisticList = model.removedAgentStatisticList;
                this.statistic = model.statistic;
                this.todayStatistic = model.todayStatistic;
            } 

            /**
             * <p>座席状态统计</p>
             */
            public Builder agentInfo(AgentInfo agentInfo) {
                this.agentInfo = agentInfo;
                return this;
            }

            /**
             * <p>座席统计详情</p>
             */
            public Builder agentStatisticList(java.util.List<AgentStatisticList> agentStatisticList) {
                this.agentStatisticList = agentStatisticList;
                return this;
            }

            /**
             * <p>通道监控信息</p>
             */
            public Builder channelInfo(ChannelInfo channelInfo) {
                this.channelInfo = channelInfo;
                return this;
            }

            /**
             * <p>已移除座席统计详情，仅当 <code>includeRemovedAgents=1</code> 时返回</p>
             */
            public Builder removedAgentStatisticList(java.util.List<RemovedAgentStatisticList> removedAgentStatisticList) {
                this.removedAgentStatisticList = removedAgentStatisticList;
                return this;
            }

            /**
             * <p>任务监控信息</p>
             */
            public Builder statistic(Statistic statistic) {
                this.statistic = statistic;
                return this;
            }

            /**
             * <p>当日任务监控信息</p>
             */
            public Builder todayStatistic(TodayStatistic todayStatistic) {
                this.todayStatistic = todayStatistic;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
