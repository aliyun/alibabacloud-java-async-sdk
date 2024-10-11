// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListHistoricalAgentSkillGroupReportResponseBody} extends {@link TeaModel}
 *
 * <p>ListHistoricalAgentSkillGroupReportResponseBody</p>
 */
public class ListHistoricalAgentSkillGroupReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListHistoricalAgentSkillGroupReportResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHistoricalAgentSkillGroupReportResponseBody create() {
        return builder().build();
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 

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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public ListHistoricalAgentSkillGroupReportResponseBody build() {
            return new ListHistoricalAgentSkillGroupReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListHistoricalAgentSkillGroupReportResponseBody} extends {@link TeaModel}
     *
     * <p>ListHistoricalAgentSkillGroupReportResponseBody</p>
     */
    public static class Back2Back extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentAnswerRate")
        private Float agentAnswerRate;

        @com.aliyun.core.annotation.NameInMap("AgentHandleRate")
        private Float agentHandleRate;

        @com.aliyun.core.annotation.NameInMap("AnswerRate")
        private Float answerRate;

        @com.aliyun.core.annotation.NameInMap("AverageCustomerRingTime")
        private Float averageCustomerRingTime;

        @com.aliyun.core.annotation.NameInMap("AverageRingTime")
        private Float averageRingTime;

        @com.aliyun.core.annotation.NameInMap("AverageTalkTime")
        private Long averageTalkTime;

        @com.aliyun.core.annotation.NameInMap("CallsAgentHandled")
        private Long callsAgentHandled;

        @com.aliyun.core.annotation.NameInMap("CallsAnswered")
        private Long callsAnswered;

        @com.aliyun.core.annotation.NameInMap("CallsCustomerAnswered")
        private Long callsCustomerAnswered;

        @com.aliyun.core.annotation.NameInMap("CallsCustomerHandled")
        private Long callsCustomerHandled;

        @com.aliyun.core.annotation.NameInMap("CallsDialed")
        private Long callsDialed;

        @com.aliyun.core.annotation.NameInMap("CustomerAnswerRate")
        private Float customerAnswerRate;

        @com.aliyun.core.annotation.NameInMap("CustomerHandleRate")
        private Float customerHandleRate;

        @com.aliyun.core.annotation.NameInMap("MaxCustomerRingTime")
        private Long maxCustomerRingTime;

        @com.aliyun.core.annotation.NameInMap("MaxRingTime")
        private Long maxRingTime;

        @com.aliyun.core.annotation.NameInMap("MaxTalkTime")
        private Long maxTalkTime;

        @com.aliyun.core.annotation.NameInMap("TotalCustomerRingTime")
        private Long totalCustomerRingTime;

        @com.aliyun.core.annotation.NameInMap("TotalRingTime")
        private Long totalRingTime;

        @com.aliyun.core.annotation.NameInMap("TotalTalkTime")
        private Long totalTalkTime;

        private Back2Back(Builder builder) {
            this.agentAnswerRate = builder.agentAnswerRate;
            this.agentHandleRate = builder.agentHandleRate;
            this.answerRate = builder.answerRate;
            this.averageCustomerRingTime = builder.averageCustomerRingTime;
            this.averageRingTime = builder.averageRingTime;
            this.averageTalkTime = builder.averageTalkTime;
            this.callsAgentHandled = builder.callsAgentHandled;
            this.callsAnswered = builder.callsAnswered;
            this.callsCustomerAnswered = builder.callsCustomerAnswered;
            this.callsCustomerHandled = builder.callsCustomerHandled;
            this.callsDialed = builder.callsDialed;
            this.customerAnswerRate = builder.customerAnswerRate;
            this.customerHandleRate = builder.customerHandleRate;
            this.maxCustomerRingTime = builder.maxCustomerRingTime;
            this.maxRingTime = builder.maxRingTime;
            this.maxTalkTime = builder.maxTalkTime;
            this.totalCustomerRingTime = builder.totalCustomerRingTime;
            this.totalRingTime = builder.totalRingTime;
            this.totalTalkTime = builder.totalTalkTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Back2Back create() {
            return builder().build();
        }

        /**
         * @return agentAnswerRate
         */
        public Float getAgentAnswerRate() {
            return this.agentAnswerRate;
        }

        /**
         * @return agentHandleRate
         */
        public Float getAgentHandleRate() {
            return this.agentHandleRate;
        }

        /**
         * @return answerRate
         */
        public Float getAnswerRate() {
            return this.answerRate;
        }

        /**
         * @return averageCustomerRingTime
         */
        public Float getAverageCustomerRingTime() {
            return this.averageCustomerRingTime;
        }

        /**
         * @return averageRingTime
         */
        public Float getAverageRingTime() {
            return this.averageRingTime;
        }

        /**
         * @return averageTalkTime
         */
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        /**
         * @return callsAgentHandled
         */
        public Long getCallsAgentHandled() {
            return this.callsAgentHandled;
        }

        /**
         * @return callsAnswered
         */
        public Long getCallsAnswered() {
            return this.callsAnswered;
        }

        /**
         * @return callsCustomerAnswered
         */
        public Long getCallsCustomerAnswered() {
            return this.callsCustomerAnswered;
        }

        /**
         * @return callsCustomerHandled
         */
        public Long getCallsCustomerHandled() {
            return this.callsCustomerHandled;
        }

        /**
         * @return callsDialed
         */
        public Long getCallsDialed() {
            return this.callsDialed;
        }

        /**
         * @return customerAnswerRate
         */
        public Float getCustomerAnswerRate() {
            return this.customerAnswerRate;
        }

        /**
         * @return customerHandleRate
         */
        public Float getCustomerHandleRate() {
            return this.customerHandleRate;
        }

        /**
         * @return maxCustomerRingTime
         */
        public Long getMaxCustomerRingTime() {
            return this.maxCustomerRingTime;
        }

        /**
         * @return maxRingTime
         */
        public Long getMaxRingTime() {
            return this.maxRingTime;
        }

        /**
         * @return maxTalkTime
         */
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        /**
         * @return totalCustomerRingTime
         */
        public Long getTotalCustomerRingTime() {
            return this.totalCustomerRingTime;
        }

        /**
         * @return totalRingTime
         */
        public Long getTotalRingTime() {
            return this.totalRingTime;
        }

        /**
         * @return totalTalkTime
         */
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public static final class Builder {
            private Float agentAnswerRate; 
            private Float agentHandleRate; 
            private Float answerRate; 
            private Float averageCustomerRingTime; 
            private Float averageRingTime; 
            private Long averageTalkTime; 
            private Long callsAgentHandled; 
            private Long callsAnswered; 
            private Long callsCustomerAnswered; 
            private Long callsCustomerHandled; 
            private Long callsDialed; 
            private Float customerAnswerRate; 
            private Float customerHandleRate; 
            private Long maxCustomerRingTime; 
            private Long maxRingTime; 
            private Long maxTalkTime; 
            private Long totalCustomerRingTime; 
            private Long totalRingTime; 
            private Long totalTalkTime; 

            /**
             * AgentAnswerRate.
             */
            public Builder agentAnswerRate(Float agentAnswerRate) {
                this.agentAnswerRate = agentAnswerRate;
                return this;
            }

            /**
             * AgentHandleRate.
             */
            public Builder agentHandleRate(Float agentHandleRate) {
                this.agentHandleRate = agentHandleRate;
                return this;
            }

            /**
             * AnswerRate.
             */
            public Builder answerRate(Float answerRate) {
                this.answerRate = answerRate;
                return this;
            }

            /**
             * AverageCustomerRingTime.
             */
            public Builder averageCustomerRingTime(Float averageCustomerRingTime) {
                this.averageCustomerRingTime = averageCustomerRingTime;
                return this;
            }

            /**
             * AverageRingTime.
             */
            public Builder averageRingTime(Float averageRingTime) {
                this.averageRingTime = averageRingTime;
                return this;
            }

            /**
             * AverageTalkTime.
             */
            public Builder averageTalkTime(Long averageTalkTime) {
                this.averageTalkTime = averageTalkTime;
                return this;
            }

            /**
             * CallsAgentHandled.
             */
            public Builder callsAgentHandled(Long callsAgentHandled) {
                this.callsAgentHandled = callsAgentHandled;
                return this;
            }

            /**
             * CallsAnswered.
             */
            public Builder callsAnswered(Long callsAnswered) {
                this.callsAnswered = callsAnswered;
                return this;
            }

            /**
             * CallsCustomerAnswered.
             */
            public Builder callsCustomerAnswered(Long callsCustomerAnswered) {
                this.callsCustomerAnswered = callsCustomerAnswered;
                return this;
            }

            /**
             * CallsCustomerHandled.
             */
            public Builder callsCustomerHandled(Long callsCustomerHandled) {
                this.callsCustomerHandled = callsCustomerHandled;
                return this;
            }

            /**
             * CallsDialed.
             */
            public Builder callsDialed(Long callsDialed) {
                this.callsDialed = callsDialed;
                return this;
            }

            /**
             * CustomerAnswerRate.
             */
            public Builder customerAnswerRate(Float customerAnswerRate) {
                this.customerAnswerRate = customerAnswerRate;
                return this;
            }

            /**
             * CustomerHandleRate.
             */
            public Builder customerHandleRate(Float customerHandleRate) {
                this.customerHandleRate = customerHandleRate;
                return this;
            }

            /**
             * MaxCustomerRingTime.
             */
            public Builder maxCustomerRingTime(Long maxCustomerRingTime) {
                this.maxCustomerRingTime = maxCustomerRingTime;
                return this;
            }

            /**
             * MaxRingTime.
             */
            public Builder maxRingTime(Long maxRingTime) {
                this.maxRingTime = maxRingTime;
                return this;
            }

            /**
             * MaxTalkTime.
             */
            public Builder maxTalkTime(Long maxTalkTime) {
                this.maxTalkTime = maxTalkTime;
                return this;
            }

            /**
             * TotalCustomerRingTime.
             */
            public Builder totalCustomerRingTime(Long totalCustomerRingTime) {
                this.totalCustomerRingTime = totalCustomerRingTime;
                return this;
            }

            /**
             * TotalRingTime.
             */
            public Builder totalRingTime(Long totalRingTime) {
                this.totalRingTime = totalRingTime;
                return this;
            }

            /**
             * TotalTalkTime.
             */
            public Builder totalTalkTime(Long totalTalkTime) {
                this.totalTalkTime = totalTalkTime;
                return this;
            }

            public Back2Back build() {
                return new Back2Back(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListHistoricalAgentSkillGroupReportResponseBody} extends {@link TeaModel}
     *
     * <p>ListHistoricalAgentSkillGroupReportResponseBody</p>
     */
    public static class Inbound extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AverageFirstResponseTime")
        private Float averageFirstResponseTime;

        @com.aliyun.core.annotation.NameInMap("AverageHoldTime")
        private Float averageHoldTime;

        @com.aliyun.core.annotation.NameInMap("AverageResponseTime")
        private Float averageResponseTime;

        @com.aliyun.core.annotation.NameInMap("AverageRingTime")
        private Float averageRingTime;

        @com.aliyun.core.annotation.NameInMap("AverageTalkTime")
        private Float averageTalkTime;

        @com.aliyun.core.annotation.NameInMap("AverageWorkTime")
        private Float averageWorkTime;

        @com.aliyun.core.annotation.NameInMap("CallsAttendedTransferIn")
        private Long callsAttendedTransferIn;

        @com.aliyun.core.annotation.NameInMap("CallsAttendedTransferOut")
        private Long callsAttendedTransferOut;

        @com.aliyun.core.annotation.NameInMap("CallsBlindTransferIn")
        private Long callsBlindTransferIn;

        @com.aliyun.core.annotation.NameInMap("CallsBlindTransferOut")
        private Long callsBlindTransferOut;

        @com.aliyun.core.annotation.NameInMap("CallsHandled")
        private Long callsHandled;

        @com.aliyun.core.annotation.NameInMap("CallsHold")
        private Long callsHold;

        @com.aliyun.core.annotation.NameInMap("CallsOffered")
        private Long callsOffered;

        @com.aliyun.core.annotation.NameInMap("CallsRinged")
        private Long callsRinged;

        @com.aliyun.core.annotation.NameInMap("HandleRate")
        private Float handleRate;

        @com.aliyun.core.annotation.NameInMap("MaxHoldTime")
        private Long maxHoldTime;

        @com.aliyun.core.annotation.NameInMap("MaxRingTime")
        private Long maxRingTime;

        @com.aliyun.core.annotation.NameInMap("MaxTalkTime")
        private Long maxTalkTime;

        @com.aliyun.core.annotation.NameInMap("MaxWorkTime")
        private Long maxWorkTime;

        @com.aliyun.core.annotation.NameInMap("SatisfactionIndex")
        private Float satisfactionIndex;

        @com.aliyun.core.annotation.NameInMap("SatisfactionRate")
        private Float satisfactionRate;

        @com.aliyun.core.annotation.NameInMap("SatisfactionSurveysOffered")
        private Long satisfactionSurveysOffered;

        @com.aliyun.core.annotation.NameInMap("SatisfactionSurveysResponded")
        private Long satisfactionSurveysResponded;

        @com.aliyun.core.annotation.NameInMap("TotalHoldTime")
        private Long totalHoldTime;

        @com.aliyun.core.annotation.NameInMap("TotalMessagesSent")
        private Long totalMessagesSent;

        @com.aliyun.core.annotation.NameInMap("TotalMessagesSentByAgent")
        private Long totalMessagesSentByAgent;

        @com.aliyun.core.annotation.NameInMap("TotalMessagesSentByCustomer")
        private Long totalMessagesSentByCustomer;

        @com.aliyun.core.annotation.NameInMap("TotalRingTime")
        private Long totalRingTime;

        @com.aliyun.core.annotation.NameInMap("TotalTalkTime")
        private Long totalTalkTime;

        @com.aliyun.core.annotation.NameInMap("TotalWorkTime")
        private Long totalWorkTime;

        private Inbound(Builder builder) {
            this.averageFirstResponseTime = builder.averageFirstResponseTime;
            this.averageHoldTime = builder.averageHoldTime;
            this.averageResponseTime = builder.averageResponseTime;
            this.averageRingTime = builder.averageRingTime;
            this.averageTalkTime = builder.averageTalkTime;
            this.averageWorkTime = builder.averageWorkTime;
            this.callsAttendedTransferIn = builder.callsAttendedTransferIn;
            this.callsAttendedTransferOut = builder.callsAttendedTransferOut;
            this.callsBlindTransferIn = builder.callsBlindTransferIn;
            this.callsBlindTransferOut = builder.callsBlindTransferOut;
            this.callsHandled = builder.callsHandled;
            this.callsHold = builder.callsHold;
            this.callsOffered = builder.callsOffered;
            this.callsRinged = builder.callsRinged;
            this.handleRate = builder.handleRate;
            this.maxHoldTime = builder.maxHoldTime;
            this.maxRingTime = builder.maxRingTime;
            this.maxTalkTime = builder.maxTalkTime;
            this.maxWorkTime = builder.maxWorkTime;
            this.satisfactionIndex = builder.satisfactionIndex;
            this.satisfactionRate = builder.satisfactionRate;
            this.satisfactionSurveysOffered = builder.satisfactionSurveysOffered;
            this.satisfactionSurveysResponded = builder.satisfactionSurveysResponded;
            this.totalHoldTime = builder.totalHoldTime;
            this.totalMessagesSent = builder.totalMessagesSent;
            this.totalMessagesSentByAgent = builder.totalMessagesSentByAgent;
            this.totalMessagesSentByCustomer = builder.totalMessagesSentByCustomer;
            this.totalRingTime = builder.totalRingTime;
            this.totalTalkTime = builder.totalTalkTime;
            this.totalWorkTime = builder.totalWorkTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Inbound create() {
            return builder().build();
        }

        /**
         * @return averageFirstResponseTime
         */
        public Float getAverageFirstResponseTime() {
            return this.averageFirstResponseTime;
        }

        /**
         * @return averageHoldTime
         */
        public Float getAverageHoldTime() {
            return this.averageHoldTime;
        }

        /**
         * @return averageResponseTime
         */
        public Float getAverageResponseTime() {
            return this.averageResponseTime;
        }

        /**
         * @return averageRingTime
         */
        public Float getAverageRingTime() {
            return this.averageRingTime;
        }

        /**
         * @return averageTalkTime
         */
        public Float getAverageTalkTime() {
            return this.averageTalkTime;
        }

        /**
         * @return averageWorkTime
         */
        public Float getAverageWorkTime() {
            return this.averageWorkTime;
        }

        /**
         * @return callsAttendedTransferIn
         */
        public Long getCallsAttendedTransferIn() {
            return this.callsAttendedTransferIn;
        }

        /**
         * @return callsAttendedTransferOut
         */
        public Long getCallsAttendedTransferOut() {
            return this.callsAttendedTransferOut;
        }

        /**
         * @return callsBlindTransferIn
         */
        public Long getCallsBlindTransferIn() {
            return this.callsBlindTransferIn;
        }

        /**
         * @return callsBlindTransferOut
         */
        public Long getCallsBlindTransferOut() {
            return this.callsBlindTransferOut;
        }

        /**
         * @return callsHandled
         */
        public Long getCallsHandled() {
            return this.callsHandled;
        }

        /**
         * @return callsHold
         */
        public Long getCallsHold() {
            return this.callsHold;
        }

        /**
         * @return callsOffered
         */
        public Long getCallsOffered() {
            return this.callsOffered;
        }

        /**
         * @return callsRinged
         */
        public Long getCallsRinged() {
            return this.callsRinged;
        }

        /**
         * @return handleRate
         */
        public Float getHandleRate() {
            return this.handleRate;
        }

        /**
         * @return maxHoldTime
         */
        public Long getMaxHoldTime() {
            return this.maxHoldTime;
        }

        /**
         * @return maxRingTime
         */
        public Long getMaxRingTime() {
            return this.maxRingTime;
        }

        /**
         * @return maxTalkTime
         */
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        /**
         * @return maxWorkTime
         */
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        /**
         * @return satisfactionIndex
         */
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        /**
         * @return satisfactionRate
         */
        public Float getSatisfactionRate() {
            return this.satisfactionRate;
        }

        /**
         * @return satisfactionSurveysOffered
         */
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        /**
         * @return satisfactionSurveysResponded
         */
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        /**
         * @return totalHoldTime
         */
        public Long getTotalHoldTime() {
            return this.totalHoldTime;
        }

        /**
         * @return totalMessagesSent
         */
        public Long getTotalMessagesSent() {
            return this.totalMessagesSent;
        }

        /**
         * @return totalMessagesSentByAgent
         */
        public Long getTotalMessagesSentByAgent() {
            return this.totalMessagesSentByAgent;
        }

        /**
         * @return totalMessagesSentByCustomer
         */
        public Long getTotalMessagesSentByCustomer() {
            return this.totalMessagesSentByCustomer;
        }

        /**
         * @return totalRingTime
         */
        public Long getTotalRingTime() {
            return this.totalRingTime;
        }

        /**
         * @return totalTalkTime
         */
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        /**
         * @return totalWorkTime
         */
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

        public static final class Builder {
            private Float averageFirstResponseTime; 
            private Float averageHoldTime; 
            private Float averageResponseTime; 
            private Float averageRingTime; 
            private Float averageTalkTime; 
            private Float averageWorkTime; 
            private Long callsAttendedTransferIn; 
            private Long callsAttendedTransferOut; 
            private Long callsBlindTransferIn; 
            private Long callsBlindTransferOut; 
            private Long callsHandled; 
            private Long callsHold; 
            private Long callsOffered; 
            private Long callsRinged; 
            private Float handleRate; 
            private Long maxHoldTime; 
            private Long maxRingTime; 
            private Long maxTalkTime; 
            private Long maxWorkTime; 
            private Float satisfactionIndex; 
            private Float satisfactionRate; 
            private Long satisfactionSurveysOffered; 
            private Long satisfactionSurveysResponded; 
            private Long totalHoldTime; 
            private Long totalMessagesSent; 
            private Long totalMessagesSentByAgent; 
            private Long totalMessagesSentByCustomer; 
            private Long totalRingTime; 
            private Long totalTalkTime; 
            private Long totalWorkTime; 

            /**
             * AverageFirstResponseTime.
             */
            public Builder averageFirstResponseTime(Float averageFirstResponseTime) {
                this.averageFirstResponseTime = averageFirstResponseTime;
                return this;
            }

            /**
             * AverageHoldTime.
             */
            public Builder averageHoldTime(Float averageHoldTime) {
                this.averageHoldTime = averageHoldTime;
                return this;
            }

            /**
             * AverageResponseTime.
             */
            public Builder averageResponseTime(Float averageResponseTime) {
                this.averageResponseTime = averageResponseTime;
                return this;
            }

            /**
             * AverageRingTime.
             */
            public Builder averageRingTime(Float averageRingTime) {
                this.averageRingTime = averageRingTime;
                return this;
            }

            /**
             * AverageTalkTime.
             */
            public Builder averageTalkTime(Float averageTalkTime) {
                this.averageTalkTime = averageTalkTime;
                return this;
            }

            /**
             * AverageWorkTime.
             */
            public Builder averageWorkTime(Float averageWorkTime) {
                this.averageWorkTime = averageWorkTime;
                return this;
            }

            /**
             * CallsAttendedTransferIn.
             */
            public Builder callsAttendedTransferIn(Long callsAttendedTransferIn) {
                this.callsAttendedTransferIn = callsAttendedTransferIn;
                return this;
            }

            /**
             * CallsAttendedTransferOut.
             */
            public Builder callsAttendedTransferOut(Long callsAttendedTransferOut) {
                this.callsAttendedTransferOut = callsAttendedTransferOut;
                return this;
            }

            /**
             * CallsBlindTransferIn.
             */
            public Builder callsBlindTransferIn(Long callsBlindTransferIn) {
                this.callsBlindTransferIn = callsBlindTransferIn;
                return this;
            }

            /**
             * CallsBlindTransferOut.
             */
            public Builder callsBlindTransferOut(Long callsBlindTransferOut) {
                this.callsBlindTransferOut = callsBlindTransferOut;
                return this;
            }

            /**
             * CallsHandled.
             */
            public Builder callsHandled(Long callsHandled) {
                this.callsHandled = callsHandled;
                return this;
            }

            /**
             * CallsHold.
             */
            public Builder callsHold(Long callsHold) {
                this.callsHold = callsHold;
                return this;
            }

            /**
             * CallsOffered.
             */
            public Builder callsOffered(Long callsOffered) {
                this.callsOffered = callsOffered;
                return this;
            }

            /**
             * CallsRinged.
             */
            public Builder callsRinged(Long callsRinged) {
                this.callsRinged = callsRinged;
                return this;
            }

            /**
             * HandleRate.
             */
            public Builder handleRate(Float handleRate) {
                this.handleRate = handleRate;
                return this;
            }

            /**
             * MaxHoldTime.
             */
            public Builder maxHoldTime(Long maxHoldTime) {
                this.maxHoldTime = maxHoldTime;
                return this;
            }

            /**
             * MaxRingTime.
             */
            public Builder maxRingTime(Long maxRingTime) {
                this.maxRingTime = maxRingTime;
                return this;
            }

            /**
             * MaxTalkTime.
             */
            public Builder maxTalkTime(Long maxTalkTime) {
                this.maxTalkTime = maxTalkTime;
                return this;
            }

            /**
             * MaxWorkTime.
             */
            public Builder maxWorkTime(Long maxWorkTime) {
                this.maxWorkTime = maxWorkTime;
                return this;
            }

            /**
             * SatisfactionIndex.
             */
            public Builder satisfactionIndex(Float satisfactionIndex) {
                this.satisfactionIndex = satisfactionIndex;
                return this;
            }

            /**
             * SatisfactionRate.
             */
            public Builder satisfactionRate(Float satisfactionRate) {
                this.satisfactionRate = satisfactionRate;
                return this;
            }

            /**
             * SatisfactionSurveysOffered.
             */
            public Builder satisfactionSurveysOffered(Long satisfactionSurveysOffered) {
                this.satisfactionSurveysOffered = satisfactionSurveysOffered;
                return this;
            }

            /**
             * SatisfactionSurveysResponded.
             */
            public Builder satisfactionSurveysResponded(Long satisfactionSurveysResponded) {
                this.satisfactionSurveysResponded = satisfactionSurveysResponded;
                return this;
            }

            /**
             * TotalHoldTime.
             */
            public Builder totalHoldTime(Long totalHoldTime) {
                this.totalHoldTime = totalHoldTime;
                return this;
            }

            /**
             * TotalMessagesSent.
             */
            public Builder totalMessagesSent(Long totalMessagesSent) {
                this.totalMessagesSent = totalMessagesSent;
                return this;
            }

            /**
             * TotalMessagesSentByAgent.
             */
            public Builder totalMessagesSentByAgent(Long totalMessagesSentByAgent) {
                this.totalMessagesSentByAgent = totalMessagesSentByAgent;
                return this;
            }

            /**
             * TotalMessagesSentByCustomer.
             */
            public Builder totalMessagesSentByCustomer(Long totalMessagesSentByCustomer) {
                this.totalMessagesSentByCustomer = totalMessagesSentByCustomer;
                return this;
            }

            /**
             * TotalRingTime.
             */
            public Builder totalRingTime(Long totalRingTime) {
                this.totalRingTime = totalRingTime;
                return this;
            }

            /**
             * TotalTalkTime.
             */
            public Builder totalTalkTime(Long totalTalkTime) {
                this.totalTalkTime = totalTalkTime;
                return this;
            }

            /**
             * TotalWorkTime.
             */
            public Builder totalWorkTime(Long totalWorkTime) {
                this.totalWorkTime = totalWorkTime;
                return this;
            }

            public Inbound build() {
                return new Inbound(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListHistoricalAgentSkillGroupReportResponseBody} extends {@link TeaModel}
     *
     * <p>ListHistoricalAgentSkillGroupReportResponseBody</p>
     */
    public static class Internal extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AverageTalkTime")
        private Long averageTalkTime;

        @com.aliyun.core.annotation.NameInMap("CallsAnswered")
        private Long callsAnswered;

        @com.aliyun.core.annotation.NameInMap("CallsDialed")
        private Long callsDialed;

        @com.aliyun.core.annotation.NameInMap("CallsHandled")
        private Long callsHandled;

        @com.aliyun.core.annotation.NameInMap("CallsOffered")
        private Long callsOffered;

        @com.aliyun.core.annotation.NameInMap("CallsTalk")
        private Long callsTalk;

        @com.aliyun.core.annotation.NameInMap("CallsTalked")
        private Long callsTalked;

        @com.aliyun.core.annotation.NameInMap("MaxTalkTime")
        private Long maxTalkTime;

        @com.aliyun.core.annotation.NameInMap("TotalTalkTime")
        private Long totalTalkTime;

        private Internal(Builder builder) {
            this.averageTalkTime = builder.averageTalkTime;
            this.callsAnswered = builder.callsAnswered;
            this.callsDialed = builder.callsDialed;
            this.callsHandled = builder.callsHandled;
            this.callsOffered = builder.callsOffered;
            this.callsTalk = builder.callsTalk;
            this.callsTalked = builder.callsTalked;
            this.maxTalkTime = builder.maxTalkTime;
            this.totalTalkTime = builder.totalTalkTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Internal create() {
            return builder().build();
        }

        /**
         * @return averageTalkTime
         */
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        /**
         * @return callsAnswered
         */
        public Long getCallsAnswered() {
            return this.callsAnswered;
        }

        /**
         * @return callsDialed
         */
        public Long getCallsDialed() {
            return this.callsDialed;
        }

        /**
         * @return callsHandled
         */
        public Long getCallsHandled() {
            return this.callsHandled;
        }

        /**
         * @return callsOffered
         */
        public Long getCallsOffered() {
            return this.callsOffered;
        }

        /**
         * @return callsTalk
         */
        public Long getCallsTalk() {
            return this.callsTalk;
        }

        /**
         * @return callsTalked
         */
        public Long getCallsTalked() {
            return this.callsTalked;
        }

        /**
         * @return maxTalkTime
         */
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        /**
         * @return totalTalkTime
         */
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public static final class Builder {
            private Long averageTalkTime; 
            private Long callsAnswered; 
            private Long callsDialed; 
            private Long callsHandled; 
            private Long callsOffered; 
            private Long callsTalk; 
            private Long callsTalked; 
            private Long maxTalkTime; 
            private Long totalTalkTime; 

            /**
             * AverageTalkTime.
             */
            public Builder averageTalkTime(Long averageTalkTime) {
                this.averageTalkTime = averageTalkTime;
                return this;
            }

            /**
             * CallsAnswered.
             */
            public Builder callsAnswered(Long callsAnswered) {
                this.callsAnswered = callsAnswered;
                return this;
            }

            /**
             * CallsDialed.
             */
            public Builder callsDialed(Long callsDialed) {
                this.callsDialed = callsDialed;
                return this;
            }

            /**
             * CallsHandled.
             */
            public Builder callsHandled(Long callsHandled) {
                this.callsHandled = callsHandled;
                return this;
            }

            /**
             * CallsOffered.
             */
            public Builder callsOffered(Long callsOffered) {
                this.callsOffered = callsOffered;
                return this;
            }

            /**
             * CallsTalk.
             */
            public Builder callsTalk(Long callsTalk) {
                this.callsTalk = callsTalk;
                return this;
            }

            /**
             * CallsTalked.
             */
            public Builder callsTalked(Long callsTalked) {
                this.callsTalked = callsTalked;
                return this;
            }

            /**
             * MaxTalkTime.
             */
            public Builder maxTalkTime(Long maxTalkTime) {
                this.maxTalkTime = maxTalkTime;
                return this;
            }

            /**
             * TotalTalkTime.
             */
            public Builder totalTalkTime(Long totalTalkTime) {
                this.totalTalkTime = totalTalkTime;
                return this;
            }

            public Internal build() {
                return new Internal(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListHistoricalAgentSkillGroupReportResponseBody} extends {@link TeaModel}
     *
     * <p>ListHistoricalAgentSkillGroupReportResponseBody</p>
     */
    public static class Outbound extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnswerRate")
        private Float answerRate;

        @com.aliyun.core.annotation.NameInMap("AverageDialingTime")
        private Float averageDialingTime;

        @com.aliyun.core.annotation.NameInMap("AverageHoldTime")
        private Float averageHoldTime;

        @com.aliyun.core.annotation.NameInMap("AverageRingTime")
        private Float averageRingTime;

        @com.aliyun.core.annotation.NameInMap("AverageTalkTime")
        private Float averageTalkTime;

        @com.aliyun.core.annotation.NameInMap("AverageWorkTime")
        private Float averageWorkTime;

        @com.aliyun.core.annotation.NameInMap("CallsAnswered")
        private Long callsAnswered;

        @com.aliyun.core.annotation.NameInMap("CallsAttendedTransferIn")
        private Long callsAttendedTransferIn;

        @com.aliyun.core.annotation.NameInMap("CallsAttendedTransferOut")
        private Long callsAttendedTransferOut;

        @com.aliyun.core.annotation.NameInMap("CallsBlindTransferIn")
        private Long callsBlindTransferIn;

        @com.aliyun.core.annotation.NameInMap("CallsBlindTransferOut")
        private Long callsBlindTransferOut;

        @com.aliyun.core.annotation.NameInMap("CallsDialed")
        private Long callsDialed;

        @com.aliyun.core.annotation.NameInMap("CallsHold")
        private Long callsHold;

        @com.aliyun.core.annotation.NameInMap("CallsRinged")
        private Long callsRinged;

        @com.aliyun.core.annotation.NameInMap("MaxDialingTime")
        private Long maxDialingTime;

        @com.aliyun.core.annotation.NameInMap("MaxHoldTime")
        private Long maxHoldTime;

        @com.aliyun.core.annotation.NameInMap("MaxRingTime")
        private Long maxRingTime;

        @com.aliyun.core.annotation.NameInMap("MaxTalkTime")
        private Long maxTalkTime;

        @com.aliyun.core.annotation.NameInMap("MaxWorkTime")
        private Long maxWorkTime;

        @com.aliyun.core.annotation.NameInMap("SatisfactionIndex")
        private Float satisfactionIndex;

        @com.aliyun.core.annotation.NameInMap("SatisfactionRate")
        private Float satisfactionRate;

        @com.aliyun.core.annotation.NameInMap("SatisfactionSurveysOffered")
        private Long satisfactionSurveysOffered;

        @com.aliyun.core.annotation.NameInMap("SatisfactionSurveysResponded")
        private Long satisfactionSurveysResponded;

        @com.aliyun.core.annotation.NameInMap("TotalDialingTime")
        private Long totalDialingTime;

        @com.aliyun.core.annotation.NameInMap("TotalHoldTime")
        private Long totalHoldTime;

        @com.aliyun.core.annotation.NameInMap("TotalRingTime")
        private Long totalRingTime;

        @com.aliyun.core.annotation.NameInMap("TotalTalkTime")
        private Long totalTalkTime;

        @com.aliyun.core.annotation.NameInMap("TotalWorkTime")
        private Long totalWorkTime;

        private Outbound(Builder builder) {
            this.answerRate = builder.answerRate;
            this.averageDialingTime = builder.averageDialingTime;
            this.averageHoldTime = builder.averageHoldTime;
            this.averageRingTime = builder.averageRingTime;
            this.averageTalkTime = builder.averageTalkTime;
            this.averageWorkTime = builder.averageWorkTime;
            this.callsAnswered = builder.callsAnswered;
            this.callsAttendedTransferIn = builder.callsAttendedTransferIn;
            this.callsAttendedTransferOut = builder.callsAttendedTransferOut;
            this.callsBlindTransferIn = builder.callsBlindTransferIn;
            this.callsBlindTransferOut = builder.callsBlindTransferOut;
            this.callsDialed = builder.callsDialed;
            this.callsHold = builder.callsHold;
            this.callsRinged = builder.callsRinged;
            this.maxDialingTime = builder.maxDialingTime;
            this.maxHoldTime = builder.maxHoldTime;
            this.maxRingTime = builder.maxRingTime;
            this.maxTalkTime = builder.maxTalkTime;
            this.maxWorkTime = builder.maxWorkTime;
            this.satisfactionIndex = builder.satisfactionIndex;
            this.satisfactionRate = builder.satisfactionRate;
            this.satisfactionSurveysOffered = builder.satisfactionSurveysOffered;
            this.satisfactionSurveysResponded = builder.satisfactionSurveysResponded;
            this.totalDialingTime = builder.totalDialingTime;
            this.totalHoldTime = builder.totalHoldTime;
            this.totalRingTime = builder.totalRingTime;
            this.totalTalkTime = builder.totalTalkTime;
            this.totalWorkTime = builder.totalWorkTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Outbound create() {
            return builder().build();
        }

        /**
         * @return answerRate
         */
        public Float getAnswerRate() {
            return this.answerRate;
        }

        /**
         * @return averageDialingTime
         */
        public Float getAverageDialingTime() {
            return this.averageDialingTime;
        }

        /**
         * @return averageHoldTime
         */
        public Float getAverageHoldTime() {
            return this.averageHoldTime;
        }

        /**
         * @return averageRingTime
         */
        public Float getAverageRingTime() {
            return this.averageRingTime;
        }

        /**
         * @return averageTalkTime
         */
        public Float getAverageTalkTime() {
            return this.averageTalkTime;
        }

        /**
         * @return averageWorkTime
         */
        public Float getAverageWorkTime() {
            return this.averageWorkTime;
        }

        /**
         * @return callsAnswered
         */
        public Long getCallsAnswered() {
            return this.callsAnswered;
        }

        /**
         * @return callsAttendedTransferIn
         */
        public Long getCallsAttendedTransferIn() {
            return this.callsAttendedTransferIn;
        }

        /**
         * @return callsAttendedTransferOut
         */
        public Long getCallsAttendedTransferOut() {
            return this.callsAttendedTransferOut;
        }

        /**
         * @return callsBlindTransferIn
         */
        public Long getCallsBlindTransferIn() {
            return this.callsBlindTransferIn;
        }

        /**
         * @return callsBlindTransferOut
         */
        public Long getCallsBlindTransferOut() {
            return this.callsBlindTransferOut;
        }

        /**
         * @return callsDialed
         */
        public Long getCallsDialed() {
            return this.callsDialed;
        }

        /**
         * @return callsHold
         */
        public Long getCallsHold() {
            return this.callsHold;
        }

        /**
         * @return callsRinged
         */
        public Long getCallsRinged() {
            return this.callsRinged;
        }

        /**
         * @return maxDialingTime
         */
        public Long getMaxDialingTime() {
            return this.maxDialingTime;
        }

        /**
         * @return maxHoldTime
         */
        public Long getMaxHoldTime() {
            return this.maxHoldTime;
        }

        /**
         * @return maxRingTime
         */
        public Long getMaxRingTime() {
            return this.maxRingTime;
        }

        /**
         * @return maxTalkTime
         */
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        /**
         * @return maxWorkTime
         */
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        /**
         * @return satisfactionIndex
         */
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        /**
         * @return satisfactionRate
         */
        public Float getSatisfactionRate() {
            return this.satisfactionRate;
        }

        /**
         * @return satisfactionSurveysOffered
         */
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        /**
         * @return satisfactionSurveysResponded
         */
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        /**
         * @return totalDialingTime
         */
        public Long getTotalDialingTime() {
            return this.totalDialingTime;
        }

        /**
         * @return totalHoldTime
         */
        public Long getTotalHoldTime() {
            return this.totalHoldTime;
        }

        /**
         * @return totalRingTime
         */
        public Long getTotalRingTime() {
            return this.totalRingTime;
        }

        /**
         * @return totalTalkTime
         */
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        /**
         * @return totalWorkTime
         */
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

        public static final class Builder {
            private Float answerRate; 
            private Float averageDialingTime; 
            private Float averageHoldTime; 
            private Float averageRingTime; 
            private Float averageTalkTime; 
            private Float averageWorkTime; 
            private Long callsAnswered; 
            private Long callsAttendedTransferIn; 
            private Long callsAttendedTransferOut; 
            private Long callsBlindTransferIn; 
            private Long callsBlindTransferOut; 
            private Long callsDialed; 
            private Long callsHold; 
            private Long callsRinged; 
            private Long maxDialingTime; 
            private Long maxHoldTime; 
            private Long maxRingTime; 
            private Long maxTalkTime; 
            private Long maxWorkTime; 
            private Float satisfactionIndex; 
            private Float satisfactionRate; 
            private Long satisfactionSurveysOffered; 
            private Long satisfactionSurveysResponded; 
            private Long totalDialingTime; 
            private Long totalHoldTime; 
            private Long totalRingTime; 
            private Long totalTalkTime; 
            private Long totalWorkTime; 

            /**
             * AnswerRate.
             */
            public Builder answerRate(Float answerRate) {
                this.answerRate = answerRate;
                return this;
            }

            /**
             * AverageDialingTime.
             */
            public Builder averageDialingTime(Float averageDialingTime) {
                this.averageDialingTime = averageDialingTime;
                return this;
            }

            /**
             * AverageHoldTime.
             */
            public Builder averageHoldTime(Float averageHoldTime) {
                this.averageHoldTime = averageHoldTime;
                return this;
            }

            /**
             * AverageRingTime.
             */
            public Builder averageRingTime(Float averageRingTime) {
                this.averageRingTime = averageRingTime;
                return this;
            }

            /**
             * AverageTalkTime.
             */
            public Builder averageTalkTime(Float averageTalkTime) {
                this.averageTalkTime = averageTalkTime;
                return this;
            }

            /**
             * AverageWorkTime.
             */
            public Builder averageWorkTime(Float averageWorkTime) {
                this.averageWorkTime = averageWorkTime;
                return this;
            }

            /**
             * CallsAnswered.
             */
            public Builder callsAnswered(Long callsAnswered) {
                this.callsAnswered = callsAnswered;
                return this;
            }

            /**
             * CallsAttendedTransferIn.
             */
            public Builder callsAttendedTransferIn(Long callsAttendedTransferIn) {
                this.callsAttendedTransferIn = callsAttendedTransferIn;
                return this;
            }

            /**
             * CallsAttendedTransferOut.
             */
            public Builder callsAttendedTransferOut(Long callsAttendedTransferOut) {
                this.callsAttendedTransferOut = callsAttendedTransferOut;
                return this;
            }

            /**
             * CallsBlindTransferIn.
             */
            public Builder callsBlindTransferIn(Long callsBlindTransferIn) {
                this.callsBlindTransferIn = callsBlindTransferIn;
                return this;
            }

            /**
             * CallsBlindTransferOut.
             */
            public Builder callsBlindTransferOut(Long callsBlindTransferOut) {
                this.callsBlindTransferOut = callsBlindTransferOut;
                return this;
            }

            /**
             * CallsDialed.
             */
            public Builder callsDialed(Long callsDialed) {
                this.callsDialed = callsDialed;
                return this;
            }

            /**
             * CallsHold.
             */
            public Builder callsHold(Long callsHold) {
                this.callsHold = callsHold;
                return this;
            }

            /**
             * CallsRinged.
             */
            public Builder callsRinged(Long callsRinged) {
                this.callsRinged = callsRinged;
                return this;
            }

            /**
             * MaxDialingTime.
             */
            public Builder maxDialingTime(Long maxDialingTime) {
                this.maxDialingTime = maxDialingTime;
                return this;
            }

            /**
             * MaxHoldTime.
             */
            public Builder maxHoldTime(Long maxHoldTime) {
                this.maxHoldTime = maxHoldTime;
                return this;
            }

            /**
             * MaxRingTime.
             */
            public Builder maxRingTime(Long maxRingTime) {
                this.maxRingTime = maxRingTime;
                return this;
            }

            /**
             * MaxTalkTime.
             */
            public Builder maxTalkTime(Long maxTalkTime) {
                this.maxTalkTime = maxTalkTime;
                return this;
            }

            /**
             * MaxWorkTime.
             */
            public Builder maxWorkTime(Long maxWorkTime) {
                this.maxWorkTime = maxWorkTime;
                return this;
            }

            /**
             * SatisfactionIndex.
             */
            public Builder satisfactionIndex(Float satisfactionIndex) {
                this.satisfactionIndex = satisfactionIndex;
                return this;
            }

            /**
             * SatisfactionRate.
             */
            public Builder satisfactionRate(Float satisfactionRate) {
                this.satisfactionRate = satisfactionRate;
                return this;
            }

            /**
             * SatisfactionSurveysOffered.
             */
            public Builder satisfactionSurveysOffered(Long satisfactionSurveysOffered) {
                this.satisfactionSurveysOffered = satisfactionSurveysOffered;
                return this;
            }

            /**
             * SatisfactionSurveysResponded.
             */
            public Builder satisfactionSurveysResponded(Long satisfactionSurveysResponded) {
                this.satisfactionSurveysResponded = satisfactionSurveysResponded;
                return this;
            }

            /**
             * TotalDialingTime.
             */
            public Builder totalDialingTime(Long totalDialingTime) {
                this.totalDialingTime = totalDialingTime;
                return this;
            }

            /**
             * TotalHoldTime.
             */
            public Builder totalHoldTime(Long totalHoldTime) {
                this.totalHoldTime = totalHoldTime;
                return this;
            }

            /**
             * TotalRingTime.
             */
            public Builder totalRingTime(Long totalRingTime) {
                this.totalRingTime = totalRingTime;
                return this;
            }

            /**
             * TotalTalkTime.
             */
            public Builder totalTalkTime(Long totalTalkTime) {
                this.totalTalkTime = totalTalkTime;
                return this;
            }

            /**
             * TotalWorkTime.
             */
            public Builder totalWorkTime(Long totalWorkTime) {
                this.totalWorkTime = totalWorkTime;
                return this;
            }

            public Outbound build() {
                return new Outbound(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListHistoricalAgentSkillGroupReportResponseBody} extends {@link TeaModel}
     *
     * <p>ListHistoricalAgentSkillGroupReportResponseBody</p>
     */
    public static class BreakCodeDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BreakCode")
        private String breakCode;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        private BreakCodeDetailList(Builder builder) {
            this.breakCode = builder.breakCode;
            this.count = builder.count;
            this.duration = builder.duration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BreakCodeDetailList create() {
            return builder().build();
        }

        /**
         * @return breakCode
         */
        public String getBreakCode() {
            return this.breakCode;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        public static final class Builder {
            private String breakCode; 
            private Long count; 
            private Long duration; 

            /**
             * BreakCode.
             */
            public Builder breakCode(String breakCode) {
                this.breakCode = breakCode;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            public BreakCodeDetailList build() {
                return new BreakCodeDetailList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListHistoricalAgentSkillGroupReportResponseBody} extends {@link TeaModel}
     *
     * <p>ListHistoricalAgentSkillGroupReportResponseBody</p>
     */
    public static class Overall extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AverageBreakTime")
        private Float averageBreakTime;

        @com.aliyun.core.annotation.NameInMap("AverageHoldTime")
        private Float averageHoldTime;

        @com.aliyun.core.annotation.NameInMap("AverageReadyTime")
        private Float averageReadyTime;

        @com.aliyun.core.annotation.NameInMap("AverageTalkTime")
        private Float averageTalkTime;

        @com.aliyun.core.annotation.NameInMap("AverageWorkTime")
        private Float averageWorkTime;

        @com.aliyun.core.annotation.NameInMap("BreakCodeDetailList")
        private java.util.List < BreakCodeDetailList> breakCodeDetailList;

        @com.aliyun.core.annotation.NameInMap("FirstCheckInTime")
        private Long firstCheckInTime;

        @com.aliyun.core.annotation.NameInMap("LastCheckOutTime")
        private Long lastCheckOutTime;

        @com.aliyun.core.annotation.NameInMap("MaxBreakTime")
        private Long maxBreakTime;

        @com.aliyun.core.annotation.NameInMap("MaxHoldTime")
        private Long maxHoldTime;

        @com.aliyun.core.annotation.NameInMap("MaxReadyTime")
        private Long maxReadyTime;

        @com.aliyun.core.annotation.NameInMap("MaxTalkTime")
        private Long maxTalkTime;

        @com.aliyun.core.annotation.NameInMap("MaxWorkTime")
        private Long maxWorkTime;

        @com.aliyun.core.annotation.NameInMap("OccupancyRate")
        private Float occupancyRate;

        @com.aliyun.core.annotation.NameInMap("SatisfactionIndex")
        private Float satisfactionIndex;

        @com.aliyun.core.annotation.NameInMap("SatisfactionRate")
        private Float satisfactionRate;

        @com.aliyun.core.annotation.NameInMap("SatisfactionSurveysOffered")
        private Long satisfactionSurveysOffered;

        @com.aliyun.core.annotation.NameInMap("SatisfactionSurveysResponded")
        private Long satisfactionSurveysResponded;

        @com.aliyun.core.annotation.NameInMap("TotalBreakTime")
        private Long totalBreakTime;

        @com.aliyun.core.annotation.NameInMap("TotalCalls")
        private Long totalCalls;

        @com.aliyun.core.annotation.NameInMap("TotalHoldTime")
        private Long totalHoldTime;

        @com.aliyun.core.annotation.NameInMap("TotalLoggedInTime")
        private Long totalLoggedInTime;

        @com.aliyun.core.annotation.NameInMap("TotalOffSiteLggedInTime")
        private Long totalOffSiteLggedInTime;

        @com.aliyun.core.annotation.NameInMap("TotalOfficePhoneLoggedInTime")
        private Long totalOfficePhoneLoggedInTime;

        @com.aliyun.core.annotation.NameInMap("TotalOnSiteLoggedInTime")
        private String totalOnSiteLoggedInTime;

        @com.aliyun.core.annotation.NameInMap("TotalOutboundScenarioLoggedInTime")
        private Long totalOutboundScenarioLoggedInTime;

        @com.aliyun.core.annotation.NameInMap("TotalOutboundScenarioReadyTime")
        private Long totalOutboundScenarioReadyTime;

        @com.aliyun.core.annotation.NameInMap("TotalOutboundScenarioTime")
        private Long totalOutboundScenarioTime;

        @com.aliyun.core.annotation.NameInMap("TotalReadyTime")
        private Long totalReadyTime;

        @com.aliyun.core.annotation.NameInMap("TotalTalkTime")
        private Long totalTalkTime;

        @com.aliyun.core.annotation.NameInMap("TotalWorkTime")
        private Long totalWorkTime;

        private Overall(Builder builder) {
            this.averageBreakTime = builder.averageBreakTime;
            this.averageHoldTime = builder.averageHoldTime;
            this.averageReadyTime = builder.averageReadyTime;
            this.averageTalkTime = builder.averageTalkTime;
            this.averageWorkTime = builder.averageWorkTime;
            this.breakCodeDetailList = builder.breakCodeDetailList;
            this.firstCheckInTime = builder.firstCheckInTime;
            this.lastCheckOutTime = builder.lastCheckOutTime;
            this.maxBreakTime = builder.maxBreakTime;
            this.maxHoldTime = builder.maxHoldTime;
            this.maxReadyTime = builder.maxReadyTime;
            this.maxTalkTime = builder.maxTalkTime;
            this.maxWorkTime = builder.maxWorkTime;
            this.occupancyRate = builder.occupancyRate;
            this.satisfactionIndex = builder.satisfactionIndex;
            this.satisfactionRate = builder.satisfactionRate;
            this.satisfactionSurveysOffered = builder.satisfactionSurveysOffered;
            this.satisfactionSurveysResponded = builder.satisfactionSurveysResponded;
            this.totalBreakTime = builder.totalBreakTime;
            this.totalCalls = builder.totalCalls;
            this.totalHoldTime = builder.totalHoldTime;
            this.totalLoggedInTime = builder.totalLoggedInTime;
            this.totalOffSiteLggedInTime = builder.totalOffSiteLggedInTime;
            this.totalOfficePhoneLoggedInTime = builder.totalOfficePhoneLoggedInTime;
            this.totalOnSiteLoggedInTime = builder.totalOnSiteLoggedInTime;
            this.totalOutboundScenarioLoggedInTime = builder.totalOutboundScenarioLoggedInTime;
            this.totalOutboundScenarioReadyTime = builder.totalOutboundScenarioReadyTime;
            this.totalOutboundScenarioTime = builder.totalOutboundScenarioTime;
            this.totalReadyTime = builder.totalReadyTime;
            this.totalTalkTime = builder.totalTalkTime;
            this.totalWorkTime = builder.totalWorkTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Overall create() {
            return builder().build();
        }

        /**
         * @return averageBreakTime
         */
        public Float getAverageBreakTime() {
            return this.averageBreakTime;
        }

        /**
         * @return averageHoldTime
         */
        public Float getAverageHoldTime() {
            return this.averageHoldTime;
        }

        /**
         * @return averageReadyTime
         */
        public Float getAverageReadyTime() {
            return this.averageReadyTime;
        }

        /**
         * @return averageTalkTime
         */
        public Float getAverageTalkTime() {
            return this.averageTalkTime;
        }

        /**
         * @return averageWorkTime
         */
        public Float getAverageWorkTime() {
            return this.averageWorkTime;
        }

        /**
         * @return breakCodeDetailList
         */
        public java.util.List < BreakCodeDetailList> getBreakCodeDetailList() {
            return this.breakCodeDetailList;
        }

        /**
         * @return firstCheckInTime
         */
        public Long getFirstCheckInTime() {
            return this.firstCheckInTime;
        }

        /**
         * @return lastCheckOutTime
         */
        public Long getLastCheckOutTime() {
            return this.lastCheckOutTime;
        }

        /**
         * @return maxBreakTime
         */
        public Long getMaxBreakTime() {
            return this.maxBreakTime;
        }

        /**
         * @return maxHoldTime
         */
        public Long getMaxHoldTime() {
            return this.maxHoldTime;
        }

        /**
         * @return maxReadyTime
         */
        public Long getMaxReadyTime() {
            return this.maxReadyTime;
        }

        /**
         * @return maxTalkTime
         */
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        /**
         * @return maxWorkTime
         */
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        /**
         * @return occupancyRate
         */
        public Float getOccupancyRate() {
            return this.occupancyRate;
        }

        /**
         * @return satisfactionIndex
         */
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        /**
         * @return satisfactionRate
         */
        public Float getSatisfactionRate() {
            return this.satisfactionRate;
        }

        /**
         * @return satisfactionSurveysOffered
         */
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        /**
         * @return satisfactionSurveysResponded
         */
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        /**
         * @return totalBreakTime
         */
        public Long getTotalBreakTime() {
            return this.totalBreakTime;
        }

        /**
         * @return totalCalls
         */
        public Long getTotalCalls() {
            return this.totalCalls;
        }

        /**
         * @return totalHoldTime
         */
        public Long getTotalHoldTime() {
            return this.totalHoldTime;
        }

        /**
         * @return totalLoggedInTime
         */
        public Long getTotalLoggedInTime() {
            return this.totalLoggedInTime;
        }

        /**
         * @return totalOffSiteLggedInTime
         */
        public Long getTotalOffSiteLggedInTime() {
            return this.totalOffSiteLggedInTime;
        }

        /**
         * @return totalOfficePhoneLoggedInTime
         */
        public Long getTotalOfficePhoneLoggedInTime() {
            return this.totalOfficePhoneLoggedInTime;
        }

        /**
         * @return totalOnSiteLoggedInTime
         */
        public String getTotalOnSiteLoggedInTime() {
            return this.totalOnSiteLoggedInTime;
        }

        /**
         * @return totalOutboundScenarioLoggedInTime
         */
        public Long getTotalOutboundScenarioLoggedInTime() {
            return this.totalOutboundScenarioLoggedInTime;
        }

        /**
         * @return totalOutboundScenarioReadyTime
         */
        public Long getTotalOutboundScenarioReadyTime() {
            return this.totalOutboundScenarioReadyTime;
        }

        /**
         * @return totalOutboundScenarioTime
         */
        public Long getTotalOutboundScenarioTime() {
            return this.totalOutboundScenarioTime;
        }

        /**
         * @return totalReadyTime
         */
        public Long getTotalReadyTime() {
            return this.totalReadyTime;
        }

        /**
         * @return totalTalkTime
         */
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        /**
         * @return totalWorkTime
         */
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

        public static final class Builder {
            private Float averageBreakTime; 
            private Float averageHoldTime; 
            private Float averageReadyTime; 
            private Float averageTalkTime; 
            private Float averageWorkTime; 
            private java.util.List < BreakCodeDetailList> breakCodeDetailList; 
            private Long firstCheckInTime; 
            private Long lastCheckOutTime; 
            private Long maxBreakTime; 
            private Long maxHoldTime; 
            private Long maxReadyTime; 
            private Long maxTalkTime; 
            private Long maxWorkTime; 
            private Float occupancyRate; 
            private Float satisfactionIndex; 
            private Float satisfactionRate; 
            private Long satisfactionSurveysOffered; 
            private Long satisfactionSurveysResponded; 
            private Long totalBreakTime; 
            private Long totalCalls; 
            private Long totalHoldTime; 
            private Long totalLoggedInTime; 
            private Long totalOffSiteLggedInTime; 
            private Long totalOfficePhoneLoggedInTime; 
            private String totalOnSiteLoggedInTime; 
            private Long totalOutboundScenarioLoggedInTime; 
            private Long totalOutboundScenarioReadyTime; 
            private Long totalOutboundScenarioTime; 
            private Long totalReadyTime; 
            private Long totalTalkTime; 
            private Long totalWorkTime; 

            /**
             * AverageBreakTime.
             */
            public Builder averageBreakTime(Float averageBreakTime) {
                this.averageBreakTime = averageBreakTime;
                return this;
            }

            /**
             * AverageHoldTime.
             */
            public Builder averageHoldTime(Float averageHoldTime) {
                this.averageHoldTime = averageHoldTime;
                return this;
            }

            /**
             * AverageReadyTime.
             */
            public Builder averageReadyTime(Float averageReadyTime) {
                this.averageReadyTime = averageReadyTime;
                return this;
            }

            /**
             * AverageTalkTime.
             */
            public Builder averageTalkTime(Float averageTalkTime) {
                this.averageTalkTime = averageTalkTime;
                return this;
            }

            /**
             * AverageWorkTime.
             */
            public Builder averageWorkTime(Float averageWorkTime) {
                this.averageWorkTime = averageWorkTime;
                return this;
            }

            /**
             * BreakCodeDetailList.
             */
            public Builder breakCodeDetailList(java.util.List < BreakCodeDetailList> breakCodeDetailList) {
                this.breakCodeDetailList = breakCodeDetailList;
                return this;
            }

            /**
             * FirstCheckInTime.
             */
            public Builder firstCheckInTime(Long firstCheckInTime) {
                this.firstCheckInTime = firstCheckInTime;
                return this;
            }

            /**
             * LastCheckOutTime.
             */
            public Builder lastCheckOutTime(Long lastCheckOutTime) {
                this.lastCheckOutTime = lastCheckOutTime;
                return this;
            }

            /**
             * MaxBreakTime.
             */
            public Builder maxBreakTime(Long maxBreakTime) {
                this.maxBreakTime = maxBreakTime;
                return this;
            }

            /**
             * MaxHoldTime.
             */
            public Builder maxHoldTime(Long maxHoldTime) {
                this.maxHoldTime = maxHoldTime;
                return this;
            }

            /**
             * MaxReadyTime.
             */
            public Builder maxReadyTime(Long maxReadyTime) {
                this.maxReadyTime = maxReadyTime;
                return this;
            }

            /**
             * MaxTalkTime.
             */
            public Builder maxTalkTime(Long maxTalkTime) {
                this.maxTalkTime = maxTalkTime;
                return this;
            }

            /**
             * MaxWorkTime.
             */
            public Builder maxWorkTime(Long maxWorkTime) {
                this.maxWorkTime = maxWorkTime;
                return this;
            }

            /**
             * OccupancyRate.
             */
            public Builder occupancyRate(Float occupancyRate) {
                this.occupancyRate = occupancyRate;
                return this;
            }

            /**
             * SatisfactionIndex.
             */
            public Builder satisfactionIndex(Float satisfactionIndex) {
                this.satisfactionIndex = satisfactionIndex;
                return this;
            }

            /**
             * SatisfactionRate.
             */
            public Builder satisfactionRate(Float satisfactionRate) {
                this.satisfactionRate = satisfactionRate;
                return this;
            }

            /**
             * SatisfactionSurveysOffered.
             */
            public Builder satisfactionSurveysOffered(Long satisfactionSurveysOffered) {
                this.satisfactionSurveysOffered = satisfactionSurveysOffered;
                return this;
            }

            /**
             * SatisfactionSurveysResponded.
             */
            public Builder satisfactionSurveysResponded(Long satisfactionSurveysResponded) {
                this.satisfactionSurveysResponded = satisfactionSurveysResponded;
                return this;
            }

            /**
             * TotalBreakTime.
             */
            public Builder totalBreakTime(Long totalBreakTime) {
                this.totalBreakTime = totalBreakTime;
                return this;
            }

            /**
             * TotalCalls.
             */
            public Builder totalCalls(Long totalCalls) {
                this.totalCalls = totalCalls;
                return this;
            }

            /**
             * TotalHoldTime.
             */
            public Builder totalHoldTime(Long totalHoldTime) {
                this.totalHoldTime = totalHoldTime;
                return this;
            }

            /**
             * TotalLoggedInTime.
             */
            public Builder totalLoggedInTime(Long totalLoggedInTime) {
                this.totalLoggedInTime = totalLoggedInTime;
                return this;
            }

            /**
             * TotalOffSiteLggedInTime.
             */
            public Builder totalOffSiteLggedInTime(Long totalOffSiteLggedInTime) {
                this.totalOffSiteLggedInTime = totalOffSiteLggedInTime;
                return this;
            }

            /**
             * TotalOfficePhoneLoggedInTime.
             */
            public Builder totalOfficePhoneLoggedInTime(Long totalOfficePhoneLoggedInTime) {
                this.totalOfficePhoneLoggedInTime = totalOfficePhoneLoggedInTime;
                return this;
            }

            /**
             * TotalOnSiteLoggedInTime.
             */
            public Builder totalOnSiteLoggedInTime(String totalOnSiteLoggedInTime) {
                this.totalOnSiteLoggedInTime = totalOnSiteLoggedInTime;
                return this;
            }

            /**
             * TotalOutboundScenarioLoggedInTime.
             */
            public Builder totalOutboundScenarioLoggedInTime(Long totalOutboundScenarioLoggedInTime) {
                this.totalOutboundScenarioLoggedInTime = totalOutboundScenarioLoggedInTime;
                return this;
            }

            /**
             * TotalOutboundScenarioReadyTime.
             */
            public Builder totalOutboundScenarioReadyTime(Long totalOutboundScenarioReadyTime) {
                this.totalOutboundScenarioReadyTime = totalOutboundScenarioReadyTime;
                return this;
            }

            /**
             * TotalOutboundScenarioTime.
             */
            public Builder totalOutboundScenarioTime(Long totalOutboundScenarioTime) {
                this.totalOutboundScenarioTime = totalOutboundScenarioTime;
                return this;
            }

            /**
             * TotalReadyTime.
             */
            public Builder totalReadyTime(Long totalReadyTime) {
                this.totalReadyTime = totalReadyTime;
                return this;
            }

            /**
             * TotalTalkTime.
             */
            public Builder totalTalkTime(Long totalTalkTime) {
                this.totalTalkTime = totalTalkTime;
                return this;
            }

            /**
             * TotalWorkTime.
             */
            public Builder totalWorkTime(Long totalWorkTime) {
                this.totalWorkTime = totalWorkTime;
                return this;
            }

            public Overall build() {
                return new Overall(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListHistoricalAgentSkillGroupReportResponseBody} extends {@link TeaModel}
     *
     * <p>ListHistoricalAgentSkillGroupReportResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("AgentName")
        private String agentName;

        @com.aliyun.core.annotation.NameInMap("Back2Back")
        private Back2Back back2Back;

        @com.aliyun.core.annotation.NameInMap("DisplayId")
        private String displayId;

        @com.aliyun.core.annotation.NameInMap("Inbound")
        private Inbound inbound;

        @com.aliyun.core.annotation.NameInMap("Internal")
        private Internal internal;

        @com.aliyun.core.annotation.NameInMap("Outbound")
        private Outbound outbound;

        @com.aliyun.core.annotation.NameInMap("Overall")
        private Overall overall;

        @com.aliyun.core.annotation.NameInMap("SkillGroupId")
        private String skillGroupId;

        @com.aliyun.core.annotation.NameInMap("SkillGroupName")
        private String skillGroupName;

        private List(Builder builder) {
            this.agentId = builder.agentId;
            this.agentName = builder.agentName;
            this.back2Back = builder.back2Back;
            this.displayId = builder.displayId;
            this.inbound = builder.inbound;
            this.internal = builder.internal;
            this.outbound = builder.outbound;
            this.overall = builder.overall;
            this.skillGroupId = builder.skillGroupId;
            this.skillGroupName = builder.skillGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return agentName
         */
        public String getAgentName() {
            return this.agentName;
        }

        /**
         * @return back2Back
         */
        public Back2Back getBack2Back() {
            return this.back2Back;
        }

        /**
         * @return displayId
         */
        public String getDisplayId() {
            return this.displayId;
        }

        /**
         * @return inbound
         */
        public Inbound getInbound() {
            return this.inbound;
        }

        /**
         * @return internal
         */
        public Internal getInternal() {
            return this.internal;
        }

        /**
         * @return outbound
         */
        public Outbound getOutbound() {
            return this.outbound;
        }

        /**
         * @return overall
         */
        public Overall getOverall() {
            return this.overall;
        }

        /**
         * @return skillGroupId
         */
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        /**
         * @return skillGroupName
         */
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

        public static final class Builder {
            private String agentId; 
            private String agentName; 
            private Back2Back back2Back; 
            private String displayId; 
            private Inbound inbound; 
            private Internal internal; 
            private Outbound outbound; 
            private Overall overall; 
            private String skillGroupId; 
            private String skillGroupName; 

            /**
             * AgentId.
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * AgentName.
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * Back2Back.
             */
            public Builder back2Back(Back2Back back2Back) {
                this.back2Back = back2Back;
                return this;
            }

            /**
             * DisplayId.
             */
            public Builder displayId(String displayId) {
                this.displayId = displayId;
                return this;
            }

            /**
             * Inbound.
             */
            public Builder inbound(Inbound inbound) {
                this.inbound = inbound;
                return this;
            }

            /**
             * Internal.
             */
            public Builder internal(Internal internal) {
                this.internal = internal;
                return this;
            }

            /**
             * Outbound.
             */
            public Builder outbound(Outbound outbound) {
                this.outbound = outbound;
                return this;
            }

            /**
             * Overall.
             */
            public Builder overall(Overall overall) {
                this.overall = overall;
                return this;
            }

            /**
             * SkillGroupId.
             */
            public Builder skillGroupId(String skillGroupId) {
                this.skillGroupId = skillGroupId;
                return this;
            }

            /**
             * SkillGroupName.
             */
            public Builder skillGroupName(String skillGroupName) {
                this.skillGroupName = skillGroupName;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListHistoricalAgentSkillGroupReportResponseBody} extends {@link TeaModel}
     *
     * <p>ListHistoricalAgentSkillGroupReportResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List < List> list;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.list = builder.list;
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
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
