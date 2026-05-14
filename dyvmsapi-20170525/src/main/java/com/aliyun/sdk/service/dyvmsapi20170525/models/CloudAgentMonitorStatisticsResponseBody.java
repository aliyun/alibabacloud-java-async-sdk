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
 * {@link CloudAgentMonitorStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>CloudAgentMonitorStatisticsResponseBody</p>
 */
public class CloudAgentMonitorStatisticsResponseBody extends TeaModel {
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

    private CloudAgentMonitorStatisticsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudAgentMonitorStatisticsResponseBody create() {
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

        private Builder(CloudAgentMonitorStatisticsResponseBody model) {
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

        public CloudAgentMonitorStatisticsResponseBody build() {
            return new CloudAgentMonitorStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CloudAgentMonitorStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>CloudAgentMonitorStatisticsResponseBody</p>
     */
    public static class AgentStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cno")
        private String cno;

        @com.aliyun.core.annotation.NameInMap("CurrentState")
        private String currentState;

        @com.aliyun.core.annotation.NameInMap("Gno")
        private String gno;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("Idle_count")
        private String idleCount;

        @com.aliyun.core.annotation.NameInMap("Idle_time")
        private String idleTime;

        @com.aliyun.core.annotation.NameInMap("Max_idle_time")
        private String maxIdleTime;

        @com.aliyun.core.annotation.NameInMap("Max_ob_bridge_time")
        private String maxObBridgeTime;

        @com.aliyun.core.annotation.NameInMap("Max_ob_calling_time")
        private String maxObCallingTime;

        @com.aliyun.core.annotation.NameInMap("Max_ob_wrapup_time")
        private String maxObWrapupTime;

        @com.aliyun.core.annotation.NameInMap("Min_idle_time")
        private String minIdleTime;

        @com.aliyun.core.annotation.NameInMap("Min_ob_bridge_time")
        private String minObBridgeTime;

        @com.aliyun.core.annotation.NameInMap("Min_ob_calling_time")
        private String minObCallingTime;

        @com.aliyun.core.annotation.NameInMap("Min_ob_wrapup_time")
        private String minObWrapupTime;

        @com.aliyun.core.annotation.NameInMap("Ob_bridge_count")
        private String obBridgeCount;

        @com.aliyun.core.annotation.NameInMap("Ob_bridge_time")
        private String obBridgeTime;

        @com.aliyun.core.annotation.NameInMap("Ob_calling_count")
        private String obCallingCount;

        @com.aliyun.core.annotation.NameInMap("Ob_calling_time")
        private String obCallingTime;

        @com.aliyun.core.annotation.NameInMap("Ob_wrapup_count")
        private String obWrapupCount;

        @com.aliyun.core.annotation.NameInMap("Ob_wrapup_time")
        private String obWrapupTime;

        @com.aliyun.core.annotation.NameInMap("Preview_ob_agent_answered_count")
        private String previewObAgentAnsweredCount;

        @com.aliyun.core.annotation.NameInMap("Preview_ob_both_answered_count")
        private String previewObBothAnsweredCount;

        @com.aliyun.core.annotation.NameInMap("Preview_ob_max_bridge_time")
        private String previewObMaxBridgeTime;

        @com.aliyun.core.annotation.NameInMap("Preview_ob_min_bridge_time")
        private String previewObMinBridgeTime;

        @com.aliyun.core.annotation.NameInMap("Preview_ob_total_bridge_time")
        private String previewObTotalBridgeTime;

        @com.aliyun.core.annotation.NameInMap("Preview_ob_total_count")
        private String previewObTotalCount;

        @com.aliyun.core.annotation.NameInMap("Preview_ob_valid_calls")
        private String previewObValidCalls;

        @com.aliyun.core.annotation.NameInMap("Preview_ob_valid_total_bridge_time")
        private String previewObValidTotalBridgeTime;

        @com.aliyun.core.annotation.NameInMap("QueueName")
        private String queueName;

        private AgentStatistics(Builder builder) {
            this.cno = builder.cno;
            this.currentState = builder.currentState;
            this.gno = builder.gno;
            this.groupName = builder.groupName;
            this.idleCount = builder.idleCount;
            this.idleTime = builder.idleTime;
            this.maxIdleTime = builder.maxIdleTime;
            this.maxObBridgeTime = builder.maxObBridgeTime;
            this.maxObCallingTime = builder.maxObCallingTime;
            this.maxObWrapupTime = builder.maxObWrapupTime;
            this.minIdleTime = builder.minIdleTime;
            this.minObBridgeTime = builder.minObBridgeTime;
            this.minObCallingTime = builder.minObCallingTime;
            this.minObWrapupTime = builder.minObWrapupTime;
            this.obBridgeCount = builder.obBridgeCount;
            this.obBridgeTime = builder.obBridgeTime;
            this.obCallingCount = builder.obCallingCount;
            this.obCallingTime = builder.obCallingTime;
            this.obWrapupCount = builder.obWrapupCount;
            this.obWrapupTime = builder.obWrapupTime;
            this.previewObAgentAnsweredCount = builder.previewObAgentAnsweredCount;
            this.previewObBothAnsweredCount = builder.previewObBothAnsweredCount;
            this.previewObMaxBridgeTime = builder.previewObMaxBridgeTime;
            this.previewObMinBridgeTime = builder.previewObMinBridgeTime;
            this.previewObTotalBridgeTime = builder.previewObTotalBridgeTime;
            this.previewObTotalCount = builder.previewObTotalCount;
            this.previewObValidCalls = builder.previewObValidCalls;
            this.previewObValidTotalBridgeTime = builder.previewObValidTotalBridgeTime;
            this.queueName = builder.queueName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentStatistics create() {
            return builder().build();
        }

        /**
         * @return cno
         */
        public String getCno() {
            return this.cno;
        }

        /**
         * @return currentState
         */
        public String getCurrentState() {
            return this.currentState;
        }

        /**
         * @return gno
         */
        public String getGno() {
            return this.gno;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return idleCount
         */
        public String getIdleCount() {
            return this.idleCount;
        }

        /**
         * @return idleTime
         */
        public String getIdleTime() {
            return this.idleTime;
        }

        /**
         * @return maxIdleTime
         */
        public String getMaxIdleTime() {
            return this.maxIdleTime;
        }

        /**
         * @return maxObBridgeTime
         */
        public String getMaxObBridgeTime() {
            return this.maxObBridgeTime;
        }

        /**
         * @return maxObCallingTime
         */
        public String getMaxObCallingTime() {
            return this.maxObCallingTime;
        }

        /**
         * @return maxObWrapupTime
         */
        public String getMaxObWrapupTime() {
            return this.maxObWrapupTime;
        }

        /**
         * @return minIdleTime
         */
        public String getMinIdleTime() {
            return this.minIdleTime;
        }

        /**
         * @return minObBridgeTime
         */
        public String getMinObBridgeTime() {
            return this.minObBridgeTime;
        }

        /**
         * @return minObCallingTime
         */
        public String getMinObCallingTime() {
            return this.minObCallingTime;
        }

        /**
         * @return minObWrapupTime
         */
        public String getMinObWrapupTime() {
            return this.minObWrapupTime;
        }

        /**
         * @return obBridgeCount
         */
        public String getObBridgeCount() {
            return this.obBridgeCount;
        }

        /**
         * @return obBridgeTime
         */
        public String getObBridgeTime() {
            return this.obBridgeTime;
        }

        /**
         * @return obCallingCount
         */
        public String getObCallingCount() {
            return this.obCallingCount;
        }

        /**
         * @return obCallingTime
         */
        public String getObCallingTime() {
            return this.obCallingTime;
        }

        /**
         * @return obWrapupCount
         */
        public String getObWrapupCount() {
            return this.obWrapupCount;
        }

        /**
         * @return obWrapupTime
         */
        public String getObWrapupTime() {
            return this.obWrapupTime;
        }

        /**
         * @return previewObAgentAnsweredCount
         */
        public String getPreviewObAgentAnsweredCount() {
            return this.previewObAgentAnsweredCount;
        }

        /**
         * @return previewObBothAnsweredCount
         */
        public String getPreviewObBothAnsweredCount() {
            return this.previewObBothAnsweredCount;
        }

        /**
         * @return previewObMaxBridgeTime
         */
        public String getPreviewObMaxBridgeTime() {
            return this.previewObMaxBridgeTime;
        }

        /**
         * @return previewObMinBridgeTime
         */
        public String getPreviewObMinBridgeTime() {
            return this.previewObMinBridgeTime;
        }

        /**
         * @return previewObTotalBridgeTime
         */
        public String getPreviewObTotalBridgeTime() {
            return this.previewObTotalBridgeTime;
        }

        /**
         * @return previewObTotalCount
         */
        public String getPreviewObTotalCount() {
            return this.previewObTotalCount;
        }

        /**
         * @return previewObValidCalls
         */
        public String getPreviewObValidCalls() {
            return this.previewObValidCalls;
        }

        /**
         * @return previewObValidTotalBridgeTime
         */
        public String getPreviewObValidTotalBridgeTime() {
            return this.previewObValidTotalBridgeTime;
        }

        /**
         * @return queueName
         */
        public String getQueueName() {
            return this.queueName;
        }

        public static final class Builder {
            private String cno; 
            private String currentState; 
            private String gno; 
            private String groupName; 
            private String idleCount; 
            private String idleTime; 
            private String maxIdleTime; 
            private String maxObBridgeTime; 
            private String maxObCallingTime; 
            private String maxObWrapupTime; 
            private String minIdleTime; 
            private String minObBridgeTime; 
            private String minObCallingTime; 
            private String minObWrapupTime; 
            private String obBridgeCount; 
            private String obBridgeTime; 
            private String obCallingCount; 
            private String obCallingTime; 
            private String obWrapupCount; 
            private String obWrapupTime; 
            private String previewObAgentAnsweredCount; 
            private String previewObBothAnsweredCount; 
            private String previewObMaxBridgeTime; 
            private String previewObMinBridgeTime; 
            private String previewObTotalBridgeTime; 
            private String previewObTotalCount; 
            private String previewObValidCalls; 
            private String previewObValidTotalBridgeTime; 
            private String queueName; 

            private Builder() {
            } 

            private Builder(AgentStatistics model) {
                this.cno = model.cno;
                this.currentState = model.currentState;
                this.gno = model.gno;
                this.groupName = model.groupName;
                this.idleCount = model.idleCount;
                this.idleTime = model.idleTime;
                this.maxIdleTime = model.maxIdleTime;
                this.maxObBridgeTime = model.maxObBridgeTime;
                this.maxObCallingTime = model.maxObCallingTime;
                this.maxObWrapupTime = model.maxObWrapupTime;
                this.minIdleTime = model.minIdleTime;
                this.minObBridgeTime = model.minObBridgeTime;
                this.minObCallingTime = model.minObCallingTime;
                this.minObWrapupTime = model.minObWrapupTime;
                this.obBridgeCount = model.obBridgeCount;
                this.obBridgeTime = model.obBridgeTime;
                this.obCallingCount = model.obCallingCount;
                this.obCallingTime = model.obCallingTime;
                this.obWrapupCount = model.obWrapupCount;
                this.obWrapupTime = model.obWrapupTime;
                this.previewObAgentAnsweredCount = model.previewObAgentAnsweredCount;
                this.previewObBothAnsweredCount = model.previewObBothAnsweredCount;
                this.previewObMaxBridgeTime = model.previewObMaxBridgeTime;
                this.previewObMinBridgeTime = model.previewObMinBridgeTime;
                this.previewObTotalBridgeTime = model.previewObTotalBridgeTime;
                this.previewObTotalCount = model.previewObTotalCount;
                this.previewObValidCalls = model.previewObValidCalls;
                this.previewObValidTotalBridgeTime = model.previewObValidTotalBridgeTime;
                this.queueName = model.queueName;
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
             * <p>status: 代表座席状态，状态每个值对应的含义: stateIdle: 置闲; statePause: 置忙; stateCalling: 呼叫中; stateInuse: 通话中; stateWrapup: 整理, loginTime: 代表座席登录时间, startTime: 代表开始通话的时间</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;state&quot;:&quot;stateIdle&quot;,&quot;startTime&quot;:&quot;1491462675&quot;}</p>
             */
            public Builder currentState(String currentState) {
                this.currentState = currentState;
                return this;
            }

            /**
             * <p>外呼组编号</p>
             * 
             * <strong>example:</strong>
             * <p>WH123</p>
             */
            public Builder gno(String gno) {
                this.gno = gno;
                return this;
            }

            /**
             * <p>外呼组名称</p>
             * 
             * <strong>example:</strong>
             * <p>gpname</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>总空闲次数</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder idleCount(String idleCount) {
                this.idleCount = idleCount;
                return this;
            }

            /**
             * <p>总空闲时长</p>
             * 
             * <strong>example:</strong>
             * <p>54344</p>
             */
            public Builder idleTime(String idleTime) {
                this.idleTime = idleTime;
                return this;
            }

            /**
             * <p>最大空闲时长</p>
             * 
             * <strong>example:</strong>
             * <p>52375</p>
             */
            public Builder maxIdleTime(String maxIdleTime) {
                this.maxIdleTime = maxIdleTime;
                return this;
            }

            /**
             * <p>外呼通话最大时长</p>
             * 
             * <strong>example:</strong>
             * <p>41</p>
             */
            public Builder maxObBridgeTime(String maxObBridgeTime) {
                this.maxObBridgeTime = maxObBridgeTime;
                return this;
            }

            /**
             * <p>外呼呼叫最大时长</p>
             * 
             * <strong>example:</strong>
             * <p>31</p>
             */
            public Builder maxObCallingTime(String maxObCallingTime) {
                this.maxObCallingTime = maxObCallingTime;
                return this;
            }

            /**
             * <p>外呼整理最大时长</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder maxObWrapupTime(String maxObWrapupTime) {
                this.maxObWrapupTime = maxObWrapupTime;
                return this;
            }

            /**
             * <p>最小空闲时长</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder minIdleTime(String minIdleTime) {
                this.minIdleTime = minIdleTime;
                return this;
            }

            /**
             * <p>外呼通话最小时长</p>
             * 
             * <strong>example:</strong>
             * <p>29</p>
             */
            public Builder minObBridgeTime(String minObBridgeTime) {
                this.minObBridgeTime = minObBridgeTime;
                return this;
            }

            /**
             * <p>外呼呼叫最小时长</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder minObCallingTime(String minObCallingTime) {
                this.minObCallingTime = minObCallingTime;
                return this;
            }

            /**
             * <p>外呼整理最小时长</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder minObWrapupTime(String minObWrapupTime) {
                this.minObWrapupTime = minObWrapupTime;
                return this;
            }

            /**
             * <p>总外呼通话次数</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder obBridgeCount(String obBridgeCount) {
                this.obBridgeCount = obBridgeCount;
                return this;
            }

            /**
             * <p>外呼通话时长</p>
             * 
             * <strong>example:</strong>
             * <p>144</p>
             */
            public Builder obBridgeTime(String obBridgeTime) {
                this.obBridgeTime = obBridgeTime;
                return this;
            }

            /**
             * <p>总外呼呼叫次数</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder obCallingCount(String obCallingCount) {
                this.obCallingCount = obCallingCount;
                return this;
            }

            /**
             * <p>外呼呼叫时长</p>
             * 
             * <strong>example:</strong>
             * <p>67</p>
             */
            public Builder obCallingTime(String obCallingTime) {
                this.obCallingTime = obCallingTime;
                return this;
            }

            /**
             * <p>总外呼整理次数</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder obWrapupCount(String obWrapupCount) {
                this.obWrapupCount = obWrapupCount;
                return this;
            }

            /**
             * <p>外呼整理时长</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder obWrapupTime(String obWrapupTime) {
                this.obWrapupTime = obWrapupTime;
                return this;
            }

            /**
             * <p>预览外呼座席接听数</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder previewObAgentAnsweredCount(String previewObAgentAnsweredCount) {
                this.previewObAgentAnsweredCount = previewObAgentAnsweredCount;
                return this;
            }

            /**
             * Preview_ob_both_answered_count.
             */
            public Builder previewObBothAnsweredCount(String previewObBothAnsweredCount) {
                this.previewObBothAnsweredCount = previewObBothAnsweredCount;
                return this;
            }

            /**
             * <p>双方接听最大通话时长</p>
             * 
             * <strong>example:</strong>
             * <p>41</p>
             */
            public Builder previewObMaxBridgeTime(String previewObMaxBridgeTime) {
                this.previewObMaxBridgeTime = previewObMaxBridgeTime;
                return this;
            }

            /**
             * <p>双方接听最小通话时长</p>
             * 
             * <strong>example:</strong>
             * <p>29</p>
             */
            public Builder previewObMinBridgeTime(String previewObMinBridgeTime) {
                this.previewObMinBridgeTime = previewObMinBridgeTime;
                return this;
            }

            /**
             * <p>双方接听总通话时长</p>
             * 
             * <strong>example:</strong>
             * <p>144</p>
             */
            public Builder previewObTotalBridgeTime(String previewObTotalBridgeTime) {
                this.previewObTotalBridgeTime = previewObTotalBridgeTime;
                return this;
            }

            /**
             * <p>预览外呼数</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder previewObTotalCount(String previewObTotalCount) {
                this.previewObTotalCount = previewObTotalCount;
                return this;
            }

            /**
             * <p>预览外呼有效通话次数</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder previewObValidCalls(String previewObValidCalls) {
                this.previewObValidCalls = previewObValidCalls;
                return this;
            }

            /**
             * <p>预览外呼有效通话总时长</p>
             * 
             * <strong>example:</strong>
             * <p>144</p>
             */
            public Builder previewObValidTotalBridgeTime(String previewObValidTotalBridgeTime) {
                this.previewObValidTotalBridgeTime = previewObValidTotalBridgeTime;
                return this;
            }

            /**
             * <p>队列名</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            public AgentStatistics build() {
                return new AgentStatistics(this);
            } 

        } 

    }
    /**
     * 
     * {@link CloudAgentMonitorStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>CloudAgentMonitorStatisticsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentStatistics")
        private java.util.List<AgentStatistics> agentStatistics;

        @com.aliyun.core.annotation.NameInMap("Date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("Total")
        private String total;

        private Data(Builder builder) {
            this.agentStatistics = builder.agentStatistics;
            this.date = builder.date;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentStatistics
         */
        public java.util.List<AgentStatistics> getAgentStatistics() {
            return this.agentStatistics;
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return total
         */
        public String getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<AgentStatistics> agentStatistics; 
            private String date; 
            private String total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentStatistics = model.agentStatistics;
                this.date = model.date;
                this.total = model.total;
            } 

            /**
             * <p>座席统计项数组</p>
             */
            public Builder agentStatistics(java.util.List<AgentStatistics> agentStatistics) {
                this.agentStatistics = agentStatistics;
                return this;
            }

            /**
             * <p>日期，格式为：yyyy-MM-dd</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-06</p>
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * <p>总计</p>
             * 
             * <strong>example:</strong>
             * <p>26</p>
             */
            public Builder total(String total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
