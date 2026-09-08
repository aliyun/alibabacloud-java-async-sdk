// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link ListIntervalAgentReportResponseBody} extends {@link TeaModel}
 *
 * <p>ListIntervalAgentReportResponseBody</p>
 */
public class ListIntervalAgentReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListIntervalAgentReportResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIntervalAgentReportResponseBody create() {
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListIntervalAgentReportResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>List of agent segment statistics.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Response message.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>943D8EF3-3321-471F-A104-51C96FCA94D6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListIntervalAgentReportResponseBody build() {
            return new ListIntervalAgentReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIntervalAgentReportResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntervalAgentReportResponseBody</p>
     */
    public static class Back2Back extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentHandleRate")
        private Float agentHandleRate;

        @com.aliyun.core.annotation.NameInMap("AnswerRate")
        private Float answerRate;

        @com.aliyun.core.annotation.NameInMap("AverageCustomerRingTime")
        private Float averageCustomerRingTime;

        @com.aliyun.core.annotation.NameInMap("AverageRingTime")
        private Float averageRingTime;

        @com.aliyun.core.annotation.NameInMap("AverageTalkTime")
        private Float averageTalkTime;

        @com.aliyun.core.annotation.NameInMap("CallsAgentHandled")
        private Long callsAgentHandled;

        @com.aliyun.core.annotation.NameInMap("CallsAnswered")
        private Long callsAnswered;

        @com.aliyun.core.annotation.NameInMap("CallsCustomerAnswered")
        private Long callsCustomerAnswered;

        @com.aliyun.core.annotation.NameInMap("CallsDialed")
        private Long callsDialed;

        @com.aliyun.core.annotation.NameInMap("CustomerAnswerRate")
        private Float customerAnswerRate;

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
            this.agentHandleRate = builder.agentHandleRate;
            this.answerRate = builder.answerRate;
            this.averageCustomerRingTime = builder.averageCustomerRingTime;
            this.averageRingTime = builder.averageRingTime;
            this.averageTalkTime = builder.averageTalkTime;
            this.callsAgentHandled = builder.callsAgentHandled;
            this.callsAnswered = builder.callsAnswered;
            this.callsCustomerAnswered = builder.callsCustomerAnswered;
            this.callsDialed = builder.callsDialed;
            this.customerAnswerRate = builder.customerAnswerRate;
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
        public Float getAverageTalkTime() {
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
            private Float agentHandleRate; 
            private Float answerRate; 
            private Float averageCustomerRingTime; 
            private Float averageRingTime; 
            private Float averageTalkTime; 
            private Long callsAgentHandled; 
            private Long callsAnswered; 
            private Long callsCustomerAnswered; 
            private Long callsDialed; 
            private Float customerAnswerRate; 
            private Long maxCustomerRingTime; 
            private Long maxRingTime; 
            private Long maxTalkTime; 
            private Long totalCustomerRingTime; 
            private Long totalRingTime; 
            private Long totalTalkTime; 

            private Builder() {
            } 

            private Builder(Back2Back model) {
                this.agentHandleRate = model.agentHandleRate;
                this.answerRate = model.answerRate;
                this.averageCustomerRingTime = model.averageCustomerRingTime;
                this.averageRingTime = model.averageRingTime;
                this.averageTalkTime = model.averageTalkTime;
                this.callsAgentHandled = model.callsAgentHandled;
                this.callsAnswered = model.callsAnswered;
                this.callsCustomerAnswered = model.callsCustomerAnswered;
                this.callsDialed = model.callsDialed;
                this.customerAnswerRate = model.customerAnswerRate;
                this.maxCustomerRingTime = model.maxCustomerRingTime;
                this.maxRingTime = model.maxRingTime;
                this.maxTalkTime = model.maxTalkTime;
                this.totalCustomerRingTime = model.totalCustomerRingTime;
                this.totalRingTime = model.totalRingTime;
                this.totalTalkTime = model.totalTalkTime;
            } 

            /**
             * <p>Agent acknowledgement rate.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder agentHandleRate(Float agentHandleRate) {
                this.agentHandleRate = agentHandleRate;
                return this;
            }

            /**
             * <p>Answer rate. Calculation Formula: CallsAnswered / CallsDialed. (Because answer events and acknowledgement events may fall into different time ranges, the result may exceed 100% in certain cases.)</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder answerRate(Float answerRate) {
                this.answerRate = answerRate;
                return this;
            }

            /**
             * <p>Average customer-side ring duration in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder averageCustomerRingTime(Float averageCustomerRingTime) {
                this.averageCustomerRingTime = averageCustomerRingTime;
                return this;
            }

            /**
             * <p>Average ring time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder averageRingTime(Float averageRingTime) {
                this.averageRingTime = averageRingTime;
                return this;
            }

            /**
             * <p>Average talk time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder averageTalkTime(Float averageTalkTime) {
                this.averageTalkTime = averageTalkTime;
                return this;
            }

            /**
             * <p>Number of calls answered by agents.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder callsAgentHandled(Long callsAgentHandled) {
                this.callsAgentHandled = callsAgentHandled;
                return this;
            }

            /**
             * <p>Number of answered calls.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder callsAnswered(Long callsAnswered) {
                this.callsAnswered = callsAnswered;
                return this;
            }

            /**
             * <p>Number of calls answered by customers.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder callsCustomerAnswered(Long callsCustomerAnswered) {
                this.callsCustomerAnswered = callsCustomerAnswered;
                return this;
            }

            /**
             * <p>Number of dial-up calls.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder callsDialed(Long callsDialed) {
                this.callsDialed = callsDialed;
                return this;
            }

            /**
             * <p>Customer answer rate.</p>
             * 
             * <strong>example:</strong>
             * <p>0.75</p>
             */
            public Builder customerAnswerRate(Float customerAnswerRate) {
                this.customerAnswerRate = customerAnswerRate;
                return this;
            }

            /**
             * <p>Maximum customer-side ring time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder maxCustomerRingTime(Long maxCustomerRingTime) {
                this.maxCustomerRingTime = maxCustomerRingTime;
                return this;
            }

            /**
             * <p>Maximum ring duration in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder maxRingTime(Long maxRingTime) {
                this.maxRingTime = maxRingTime;
                return this;
            }

            /**
             * <p>Maximum talk time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder maxTalkTime(Long maxTalkTime) {
                this.maxTalkTime = maxTalkTime;
                return this;
            }

            /**
             * <p>Total customer-side ring time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalCustomerRingTime(Long totalCustomerRingTime) {
                this.totalCustomerRingTime = totalCustomerRingTime;
                return this;
            }

            /**
             * <p>Total ring time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalRingTime(Long totalRingTime) {
                this.totalRingTime = totalRingTime;
                return this;
            }

            /**
             * <p>Total talk time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
     * {@link ListIntervalAgentReportResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntervalAgentReportResponseBody</p>
     */
    public static class AccessChannelTypeDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessChannelType")
        private String accessChannelType;

        @com.aliyun.core.annotation.NameInMap("CallsOffered")
        private Long callsOffered;

        private AccessChannelTypeDetails(Builder builder) {
            this.accessChannelType = builder.accessChannelType;
            this.callsOffered = builder.callsOffered;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessChannelTypeDetails create() {
            return builder().build();
        }

        /**
         * @return accessChannelType
         */
        public String getAccessChannelType() {
            return this.accessChannelType;
        }

        /**
         * @return callsOffered
         */
        public Long getCallsOffered() {
            return this.callsOffered;
        }

        public static final class Builder {
            private String accessChannelType; 
            private Long callsOffered; 

            private Builder() {
            } 

            private Builder(AccessChannelTypeDetails model) {
                this.accessChannelType = model.accessChannelType;
                this.callsOffered = model.callsOffered;
            } 

            /**
             * <p>Channel Type.</p>
             * 
             * <strong>example:</strong>
             * <p>Web</p>
             */
            public Builder accessChannelType(String accessChannelType) {
                this.accessChannelType = accessChannelType;
                return this;
            }

            /**
             * <p>Number of assigned sessions.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder callsOffered(Long callsOffered) {
                this.callsOffered = callsOffered;
                return this;
            }

            public AccessChannelTypeDetails build() {
                return new AccessChannelTypeDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListIntervalAgentReportResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntervalAgentReportResponseBody</p>
     */
    public static class Inbound extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessChannelTypeDetails")
        private java.util.List<AccessChannelTypeDetails> accessChannelTypeDetails;

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

        @com.aliyun.core.annotation.NameInMap("ServiceLevel15")
        private Float serviceLevel15;

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
            this.accessChannelTypeDetails = builder.accessChannelTypeDetails;
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
            this.serviceLevel15 = builder.serviceLevel15;
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
         * @return accessChannelTypeDetails
         */
        public java.util.List<AccessChannelTypeDetails> getAccessChannelTypeDetails() {
            return this.accessChannelTypeDetails;
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
         * @return serviceLevel15
         */
        public Float getServiceLevel15() {
            return this.serviceLevel15;
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
            private java.util.List<AccessChannelTypeDetails> accessChannelTypeDetails; 
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
            private Float serviceLevel15; 
            private Long totalHoldTime; 
            private Long totalMessagesSent; 
            private Long totalMessagesSentByAgent; 
            private Long totalMessagesSentByCustomer; 
            private Long totalRingTime; 
            private Long totalTalkTime; 
            private Long totalWorkTime; 

            private Builder() {
            } 

            private Builder(Inbound model) {
                this.accessChannelTypeDetails = model.accessChannelTypeDetails;
                this.averageFirstResponseTime = model.averageFirstResponseTime;
                this.averageHoldTime = model.averageHoldTime;
                this.averageResponseTime = model.averageResponseTime;
                this.averageRingTime = model.averageRingTime;
                this.averageTalkTime = model.averageTalkTime;
                this.averageWorkTime = model.averageWorkTime;
                this.callsAttendedTransferIn = model.callsAttendedTransferIn;
                this.callsAttendedTransferOut = model.callsAttendedTransferOut;
                this.callsBlindTransferIn = model.callsBlindTransferIn;
                this.callsBlindTransferOut = model.callsBlindTransferOut;
                this.callsHandled = model.callsHandled;
                this.callsHold = model.callsHold;
                this.callsOffered = model.callsOffered;
                this.callsRinged = model.callsRinged;
                this.handleRate = model.handleRate;
                this.maxHoldTime = model.maxHoldTime;
                this.maxRingTime = model.maxRingTime;
                this.maxTalkTime = model.maxTalkTime;
                this.maxWorkTime = model.maxWorkTime;
                this.satisfactionIndex = model.satisfactionIndex;
                this.satisfactionRate = model.satisfactionRate;
                this.satisfactionSurveysOffered = model.satisfactionSurveysOffered;
                this.satisfactionSurveysResponded = model.satisfactionSurveysResponded;
                this.serviceLevel15 = model.serviceLevel15;
                this.totalHoldTime = model.totalHoldTime;
                this.totalMessagesSent = model.totalMessagesSent;
                this.totalMessagesSentByAgent = model.totalMessagesSentByAgent;
                this.totalMessagesSentByCustomer = model.totalMessagesSentByCustomer;
                this.totalRingTime = model.totalRingTime;
                this.totalTalkTime = model.totalTalkTime;
                this.totalWorkTime = model.totalWorkTime;
            } 

            /**
             * <p>Statistics for each Channel.</p>
             */
            public Builder accessChannelTypeDetails(java.util.List<AccessChannelTypeDetails> accessChannelTypeDetails) {
                this.accessChannelTypeDetails = accessChannelTypeDetails;
                return this;
            }

            /**
             * <p>Average first response time for chat sessions, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder averageFirstResponseTime(Float averageFirstResponseTime) {
                this.averageFirstResponseTime = averageFirstResponseTime;
                return this;
            }

            /**
             * <p>Average hold time during calls, in seconds. Calculation Formula: TotalHoldTime / CallsHold.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder averageHoldTime(Float averageHoldTime) {
                this.averageHoldTime = averageHoldTime;
                return this;
            }

            /**
             * <p>Average response time for chat sessions.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder averageResponseTime(Float averageResponseTime) {
                this.averageResponseTime = averageResponseTime;
                return this;
            }

            /**
             * <p>Average ring time, in seconds. Calculation Formula: TotalRingTime / CallsRinged.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder averageRingTime(Float averageRingTime) {
                this.averageRingTime = averageRingTime;
                return this;
            }

            /**
             * <p>Average talk time, in seconds. Calculation Formula: TotalTalkTime / CallsHandled.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder averageTalkTime(Float averageTalkTime) {
                this.averageTalkTime = averageTalkTime;
                return this;
            }

            /**
             * <p>Average post-processing time, in seconds. Calculation Formula: TotalWorkTime / CallsHandled.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder averageWorkTime(Float averageWorkTime) {
                this.averageWorkTime = averageWorkTime;
                return this;
            }

            /**
             * <p>Number of attended transfer-ins. If a single call is transferred to the agent multiple times, each transfer counts as one.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsAttendedTransferIn(Long callsAttendedTransferIn) {
                this.callsAttendedTransferIn = callsAttendedTransferIn;
                return this;
            }

            /**
             * <p>Number of transfer-out calls. If a single call is transferred to other agents multiple times, each transfer counts as one.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsAttendedTransferOut(Long callsAttendedTransferOut) {
                this.callsAttendedTransferOut = callsAttendedTransferOut;
                return this;
            }

            /**
             * <p>Number of blind transfer-in calls. If a single call is transferred in to this agent multiple times, each transfer counts as one.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsBlindTransferIn(Long callsBlindTransferIn) {
                this.callsBlindTransferIn = callsBlindTransferIn;
                return this;
            }

            /**
             * <p>Number of blind transfer-out calls. If a single call is transferred out to other agents multiple times, each transfer counts as one.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsBlindTransferOut(Long callsBlindTransferOut) {
                this.callsBlindTransferOut = callsBlindTransferOut;
                return this;
            }

            /**
             * <p>Acknowledgement count, which is the number of times agents answered calls.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsHandled(Long callsHandled) {
                this.callsHandled = callsHandled;
                return this;
            }

            /**
             * <p>Number of calls placed on hold, that is, the count of occurrences where a call was held.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsHold(Long callsHold) {
                this.callsHold = callsHold;
                return this;
            }

            /**
             * <p>Assigned count, which refers to the number of calls assigned to this agent, including calls blindly transferred or consultatively transferred from other agents.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsOffered(Long callsOffered) {
                this.callsOffered = callsOffered;
                return this;
            }

            /**
             * <p>Number of calls that rang to the agent.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsRinged(Long callsRinged) {
                this.callsRinged = callsRinged;
                return this;
            }

            /**
             * <p>Acknowledgement rate. Calculation Formula: CallsHandled / CallsOffered (because acknowledgement events and assign events may fall into different time ranges, the result may exceed 100% in certain cases).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder handleRate(Float handleRate) {
                this.handleRate = handleRate;
                return this;
            }

            /**
             * <p>Maximum call hold duration, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxHoldTime(Long maxHoldTime) {
                this.maxHoldTime = maxHoldTime;
                return this;
            }

            /**
             * <p>Maximum ring time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxRingTime(Long maxRingTime) {
                this.maxRingTime = maxRingTime;
                return this;
            }

            /**
             * <p>Maximum talk time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxTalkTime(Long maxTalkTime) {
                this.maxTalkTime = maxTalkTime;
                return this;
            }

            /**
             * <p>Maximum post-processing duration, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxWorkTime(Long maxWorkTime) {
                this.maxWorkTime = maxWorkTime;
                return this;
            }

            /**
             * <p>Satisfaction Index, which is the average of the satisfaction rating digits (single-digit numbers) entered by users.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder satisfactionIndex(Float satisfactionIndex) {
                this.satisfactionIndex = satisfactionIndex;
                return this;
            }

            /**
             * <p>Satisfaction rate. Calculation Formula: Number of evaluations marked as satisfied / Count of satisfaction survey responses.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder satisfactionRate(Float satisfactionRate) {
                this.satisfactionRate = satisfactionRate;
                return this;
            }

            /**
             * <p>Sending Count of satisfaction surveys.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder satisfactionSurveysOffered(Long satisfactionSurveysOffered) {
                this.satisfactionSurveysOffered = satisfactionSurveysOffered;
                return this;
            }

            /**
             * <p>Response Count of satisfaction surveys.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder satisfactionSurveysResponded(Long satisfactionSurveysResponded) {
                this.satisfactionSurveysResponded = satisfactionSurveysResponded;
                return this;
            }

            /**
             * <p>Service level within 15 seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0.6</p>
             */
            public Builder serviceLevel15(Float serviceLevel15) {
                this.serviceLevel15 = serviceLevel15;
                return this;
            }

            /**
             * <p>Total hold time during calls, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalHoldTime(Long totalHoldTime) {
                this.totalHoldTime = totalHoldTime;
                return this;
            }

            /**
             * <p>Total number of messages sent in chat sessions.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder totalMessagesSent(Long totalMessagesSent) {
                this.totalMessagesSent = totalMessagesSent;
                return this;
            }

            /**
             * <p>Total number of messages sent by the agent in chat sessions.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalMessagesSentByAgent(Long totalMessagesSentByAgent) {
                this.totalMessagesSentByAgent = totalMessagesSentByAgent;
                return this;
            }

            /**
             * <p>Total number of messages sent by the Customer in chat sessions.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder totalMessagesSentByCustomer(Long totalMessagesSentByCustomer) {
                this.totalMessagesSentByCustomer = totalMessagesSentByCustomer;
                return this;
            }

            /**
             * <p>Total ring time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalRingTime(Long totalRingTime) {
                this.totalRingTime = totalRingTime;
                return this;
            }

            /**
             * <p>Total talk time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalTalkTime(Long totalTalkTime) {
                this.totalTalkTime = totalTalkTime;
                return this;
            }

            /**
             * <p>Total post-processing time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
     * {@link ListIntervalAgentReportResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntervalAgentReportResponseBody</p>
     */
    public static class Internal extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AverageTalkTime")
        private Float averageTalkTime;

        @com.aliyun.core.annotation.NameInMap("CallsAnswered")
        private Long callsAnswered;

        @com.aliyun.core.annotation.NameInMap("CallsDialed")
        private Long callsDialed;

        @com.aliyun.core.annotation.NameInMap("CallsHandled")
        private Long callsHandled;

        @com.aliyun.core.annotation.NameInMap("CallsOffered")
        private Long callsOffered;

        @com.aliyun.core.annotation.NameInMap("CallsTalked")
        private Long callsTalked;

        private Internal(Builder builder) {
            this.averageTalkTime = builder.averageTalkTime;
            this.callsAnswered = builder.callsAnswered;
            this.callsDialed = builder.callsDialed;
            this.callsHandled = builder.callsHandled;
            this.callsOffered = builder.callsOffered;
            this.callsTalked = builder.callsTalked;
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
        public Float getAverageTalkTime() {
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
         * @return callsTalked
         */
        public Long getCallsTalked() {
            return this.callsTalked;
        }

        public static final class Builder {
            private Float averageTalkTime; 
            private Long callsAnswered; 
            private Long callsDialed; 
            private Long callsHandled; 
            private Long callsOffered; 
            private Long callsTalked; 

            private Builder() {
            } 

            private Builder(Internal model) {
                this.averageTalkTime = model.averageTalkTime;
                this.callsAnswered = model.callsAnswered;
                this.callsDialed = model.callsDialed;
                this.callsHandled = model.callsHandled;
                this.callsOffered = model.callsOffered;
                this.callsTalked = model.callsTalked;
            } 

            /**
             * <p>Average talk time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder averageTalkTime(Float averageTalkTime) {
                this.averageTalkTime = averageTalkTime;
                return this;
            }

            /**
             * <p>Number of answered calls.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder callsAnswered(Long callsAnswered) {
                this.callsAnswered = callsAnswered;
                return this;
            }

            /**
             * <p>Number of dial-up calls.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder callsDialed(Long callsDialed) {
                this.callsDialed = callsDialed;
                return this;
            }

            /**
             * <p>Number of acknowledgements, which refers to the number of times the agent acknowledged a call.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder callsHandled(Long callsHandled) {
                this.callsHandled = callsHandled;
                return this;
            }

            /**
             * <p>Number of assigned calls, which refers to the count of calls assigned to this agent, including calls blindly transferred or consultatively transferred from other agents.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder callsOffered(Long callsOffered) {
                this.callsOffered = callsOffered;
                return this;
            }

            /**
             * <p>Number of calls participated in.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder callsTalked(Long callsTalked) {
                this.callsTalked = callsTalked;
                return this;
            }

            public Internal build() {
                return new Internal(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListIntervalAgentReportResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntervalAgentReportResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Outbound model) {
                this.answerRate = model.answerRate;
                this.averageDialingTime = model.averageDialingTime;
                this.averageHoldTime = model.averageHoldTime;
                this.averageRingTime = model.averageRingTime;
                this.averageTalkTime = model.averageTalkTime;
                this.averageWorkTime = model.averageWorkTime;
                this.callsAnswered = model.callsAnswered;
                this.callsAttendedTransferIn = model.callsAttendedTransferIn;
                this.callsAttendedTransferOut = model.callsAttendedTransferOut;
                this.callsBlindTransferIn = model.callsBlindTransferIn;
                this.callsBlindTransferOut = model.callsBlindTransferOut;
                this.callsDialed = model.callsDialed;
                this.callsHold = model.callsHold;
                this.callsRinged = model.callsRinged;
                this.maxDialingTime = model.maxDialingTime;
                this.maxHoldTime = model.maxHoldTime;
                this.maxRingTime = model.maxRingTime;
                this.maxTalkTime = model.maxTalkTime;
                this.maxWorkTime = model.maxWorkTime;
                this.satisfactionIndex = model.satisfactionIndex;
                this.satisfactionRate = model.satisfactionRate;
                this.satisfactionSurveysOffered = model.satisfactionSurveysOffered;
                this.satisfactionSurveysResponded = model.satisfactionSurveysResponded;
                this.totalDialingTime = model.totalDialingTime;
                this.totalHoldTime = model.totalHoldTime;
                this.totalRingTime = model.totalRingTime;
                this.totalTalkTime = model.totalTalkTime;
                this.totalWorkTime = model.totalWorkTime;
            } 

            /**
             * <p>Answer rate. Calculation Formula: CallsAnswered / CallsDialed. (Because answering events and acknowledgement events may fall into different Time Ranges, the Result may exceed 100% in certain cases.)</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder answerRate(Float answerRate) {
                this.answerRate = answerRate;
                return this;
            }

            /**
             * <p>Average dial-up duration, in seconds. Calculation Formula: TotalDialingTime / CallsDialed.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder averageDialingTime(Float averageDialingTime) {
                this.averageDialingTime = averageDialingTime;
                return this;
            }

            /**
             * <p>Average hold duration, in seconds. Calculation formula: TotalHoldTime / CallsHold.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder averageHoldTime(Float averageHoldTime) {
                this.averageHoldTime = averageHoldTime;
                return this;
            }

            /**
             * <p>Average ring time in seconds. Calculation Formula: TotalRingTime / CallsRinged.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder averageRingTime(Float averageRingTime) {
                this.averageRingTime = averageRingTime;
                return this;
            }

            /**
             * <p>Average talk time, in seconds. Calculation Formula: TotalTalkTime / CallsAnswered.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder averageTalkTime(Float averageTalkTime) {
                this.averageTalkTime = averageTalkTime;
                return this;
            }

            /**
             * <p>Average post-processing time in seconds. Calculation Formula: TotalWorkTime / CallsDialed.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder averageWorkTime(Float averageWorkTime) {
                this.averageWorkTime = averageWorkTime;
                return this;
            }

            /**
             * <p>Answered call count.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsAnswered(Long callsAnswered) {
                this.callsAnswered = callsAnswered;
                return this;
            }

            /**
             * <p>Number of attended transfer-in calls. If a single call is transferred to the agent multiple times, each transfer counts as one.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsAttendedTransferIn(Long callsAttendedTransferIn) {
                this.callsAttendedTransferIn = callsAttendedTransferIn;
                return this;
            }

            /**
             * <p>Number of transfer-out calls. If a single call is transferred out to other agents multiple times, each transfer-out counts as one.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsAttendedTransferOut(Long callsAttendedTransferOut) {
                this.callsAttendedTransferOut = callsAttendedTransferOut;
                return this;
            }

            /**
             * <p>Number of blind transfer-in calls. If a single call is transferred to the agent multiple times, each transfer counts as one.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsBlindTransferIn(Long callsBlindTransferIn) {
                this.callsBlindTransferIn = callsBlindTransferIn;
                return this;
            }

            /**
             * <p>Number of blind transfer-out calls. If a single call is transferred to other agents multiple times, each transfer counts as one.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsBlindTransferOut(Long callsBlindTransferOut) {
                this.callsBlindTransferOut = callsBlindTransferOut;
                return this;
            }

            /**
             * <p>Dial-up count.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder callsDialed(Long callsDialed) {
                this.callsDialed = callsDialed;
                return this;
            }

            /**
             * <p>Hold count, which is the number of times call hold occurred.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsHold(Long callsHold) {
                this.callsHold = callsHold;
                return this;
            }

            /**
             * <p>Number of calls that rang for the agent.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsRinged(Long callsRinged) {
                this.callsRinged = callsRinged;
                return this;
            }

            /**
             * <p>Maximum dial-up duration, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder maxDialingTime(Long maxDialingTime) {
                this.maxDialingTime = maxDialingTime;
                return this;
            }

            /**
             * <p>Maximum hold time during calls, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxHoldTime(Long maxHoldTime) {
                this.maxHoldTime = maxHoldTime;
                return this;
            }

            /**
             * <p>Maximum ring time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxRingTime(Long maxRingTime) {
                this.maxRingTime = maxRingTime;
                return this;
            }

            /**
             * <p>Maximum talk time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxTalkTime(Long maxTalkTime) {
                this.maxTalkTime = maxTalkTime;
                return this;
            }

            /**
             * <p>Maximum post-processing time in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder maxWorkTime(Long maxWorkTime) {
                this.maxWorkTime = maxWorkTime;
                return this;
            }

            /**
             * <p>Satisfaction index, which is the average value of the satisfaction key digits (single-digit numbers).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder satisfactionIndex(Float satisfactionIndex) {
                this.satisfactionIndex = satisfactionIndex;
                return this;
            }

            /**
             * <p>Satisfaction rate. Calculation Formula: Count of evaluations marked as satisfied / Count of satisfaction survey responses.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder satisfactionRate(Float satisfactionRate) {
                this.satisfactionRate = satisfactionRate;
                return this;
            }

            /**
             * <p>Sending Count of satisfaction surveys.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder satisfactionSurveysOffered(Long satisfactionSurveysOffered) {
                this.satisfactionSurveysOffered = satisfactionSurveysOffered;
                return this;
            }

            /**
             * <p>Count of satisfaction survey responses.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder satisfactionSurveysResponded(Long satisfactionSurveysResponded) {
                this.satisfactionSurveysResponded = satisfactionSurveysResponded;
                return this;
            }

            /**
             * <p>Total dial-up duration, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>148</p>
             */
            public Builder totalDialingTime(Long totalDialingTime) {
                this.totalDialingTime = totalDialingTime;
                return this;
            }

            /**
             * <p>Total hold duration, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalHoldTime(Long totalHoldTime) {
                this.totalHoldTime = totalHoldTime;
                return this;
            }

            /**
             * <p>Total ring time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalRingTime(Long totalRingTime) {
                this.totalRingTime = totalRingTime;
                return this;
            }

            /**
             * <p>Total talk time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalTalkTime(Long totalTalkTime) {
                this.totalTalkTime = totalTalkTime;
                return this;
            }

            /**
             * <p>Total post-processing duration, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
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
     * {@link ListIntervalAgentReportResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntervalAgentReportResponseBody</p>
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

            private Builder() {
            } 

            private Builder(BreakCodeDetailList model) {
                this.breakCode = model.breakCode;
                this.count = model.count;
                this.duration = model.duration;
            } 

            /**
             * <p>Break code.</p>
             * 
             * <strong>example:</strong>
             * <p>会议</p>
             */
            public Builder breakCode(String breakCode) {
                this.breakCode = breakCode;
                return this;
            }

            /**
             * <p>Quantity.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>Duration in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
     * {@link ListIntervalAgentReportResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntervalAgentReportResponseBody</p>
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
        private java.util.List<BreakCodeDetailList> breakCodeDetailList;

        @com.aliyun.core.annotation.NameInMap("FirstCheckInTime")
        private Long firstCheckInTime;

        @com.aliyun.core.annotation.NameInMap("LastCheckOutTime")
        private Long lastCheckOutTime;

        @com.aliyun.core.annotation.NameInMap("LastCheckoutTime")
        private Long lastCheckoutTime;

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

        @com.aliyun.core.annotation.NameInMap("TotalOffSiteLoggedInTime")
        private Long totalOffSiteLoggedInTime;

        @com.aliyun.core.annotation.NameInMap("TotalOffSiteOnlineTime")
        private Long totalOffSiteOnlineTime;

        @com.aliyun.core.annotation.NameInMap("TotalOfficePhoneLoggedInTime")
        private Long totalOfficePhoneLoggedInTime;

        @com.aliyun.core.annotation.NameInMap("TotalOfficePhoneOnlineTime")
        private Long totalOfficePhoneOnlineTime;

        @com.aliyun.core.annotation.NameInMap("TotalOnSiteLoggedInTime")
        private Long totalOnSiteLoggedInTime;

        @com.aliyun.core.annotation.NameInMap("TotalOnSiteOnlineTime")
        private Long totalOnSiteOnlineTime;

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
            this.lastCheckoutTime = builder.lastCheckoutTime;
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
            this.totalOffSiteLoggedInTime = builder.totalOffSiteLoggedInTime;
            this.totalOffSiteOnlineTime = builder.totalOffSiteOnlineTime;
            this.totalOfficePhoneLoggedInTime = builder.totalOfficePhoneLoggedInTime;
            this.totalOfficePhoneOnlineTime = builder.totalOfficePhoneOnlineTime;
            this.totalOnSiteLoggedInTime = builder.totalOnSiteLoggedInTime;
            this.totalOnSiteOnlineTime = builder.totalOnSiteOnlineTime;
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
        public java.util.List<BreakCodeDetailList> getBreakCodeDetailList() {
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
         * @return lastCheckoutTime
         */
        public Long getLastCheckoutTime() {
            return this.lastCheckoutTime;
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
         * @return totalOffSiteLoggedInTime
         */
        public Long getTotalOffSiteLoggedInTime() {
            return this.totalOffSiteLoggedInTime;
        }

        /**
         * @return totalOffSiteOnlineTime
         */
        public Long getTotalOffSiteOnlineTime() {
            return this.totalOffSiteOnlineTime;
        }

        /**
         * @return totalOfficePhoneLoggedInTime
         */
        public Long getTotalOfficePhoneLoggedInTime() {
            return this.totalOfficePhoneLoggedInTime;
        }

        /**
         * @return totalOfficePhoneOnlineTime
         */
        public Long getTotalOfficePhoneOnlineTime() {
            return this.totalOfficePhoneOnlineTime;
        }

        /**
         * @return totalOnSiteLoggedInTime
         */
        public Long getTotalOnSiteLoggedInTime() {
            return this.totalOnSiteLoggedInTime;
        }

        /**
         * @return totalOnSiteOnlineTime
         */
        public Long getTotalOnSiteOnlineTime() {
            return this.totalOnSiteOnlineTime;
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
            private java.util.List<BreakCodeDetailList> breakCodeDetailList; 
            private Long firstCheckInTime; 
            private Long lastCheckOutTime; 
            private Long lastCheckoutTime; 
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
            private Long totalOffSiteLoggedInTime; 
            private Long totalOffSiteOnlineTime; 
            private Long totalOfficePhoneLoggedInTime; 
            private Long totalOfficePhoneOnlineTime; 
            private Long totalOnSiteLoggedInTime; 
            private Long totalOnSiteOnlineTime; 
            private Long totalOutboundScenarioLoggedInTime; 
            private Long totalOutboundScenarioReadyTime; 
            private Long totalOutboundScenarioTime; 
            private Long totalReadyTime; 
            private Long totalTalkTime; 
            private Long totalWorkTime; 

            private Builder() {
            } 

            private Builder(Overall model) {
                this.averageBreakTime = model.averageBreakTime;
                this.averageHoldTime = model.averageHoldTime;
                this.averageReadyTime = model.averageReadyTime;
                this.averageTalkTime = model.averageTalkTime;
                this.averageWorkTime = model.averageWorkTime;
                this.breakCodeDetailList = model.breakCodeDetailList;
                this.firstCheckInTime = model.firstCheckInTime;
                this.lastCheckOutTime = model.lastCheckOutTime;
                this.lastCheckoutTime = model.lastCheckoutTime;
                this.maxBreakTime = model.maxBreakTime;
                this.maxHoldTime = model.maxHoldTime;
                this.maxReadyTime = model.maxReadyTime;
                this.maxTalkTime = model.maxTalkTime;
                this.maxWorkTime = model.maxWorkTime;
                this.occupancyRate = model.occupancyRate;
                this.satisfactionIndex = model.satisfactionIndex;
                this.satisfactionRate = model.satisfactionRate;
                this.satisfactionSurveysOffered = model.satisfactionSurveysOffered;
                this.satisfactionSurveysResponded = model.satisfactionSurveysResponded;
                this.totalBreakTime = model.totalBreakTime;
                this.totalCalls = model.totalCalls;
                this.totalHoldTime = model.totalHoldTime;
                this.totalLoggedInTime = model.totalLoggedInTime;
                this.totalOffSiteLoggedInTime = model.totalOffSiteLoggedInTime;
                this.totalOffSiteOnlineTime = model.totalOffSiteOnlineTime;
                this.totalOfficePhoneLoggedInTime = model.totalOfficePhoneLoggedInTime;
                this.totalOfficePhoneOnlineTime = model.totalOfficePhoneOnlineTime;
                this.totalOnSiteLoggedInTime = model.totalOnSiteLoggedInTime;
                this.totalOnSiteOnlineTime = model.totalOnSiteOnlineTime;
                this.totalOutboundScenarioLoggedInTime = model.totalOutboundScenarioLoggedInTime;
                this.totalOutboundScenarioReadyTime = model.totalOutboundScenarioReadyTime;
                this.totalOutboundScenarioTime = model.totalOutboundScenarioTime;
                this.totalReadyTime = model.totalReadyTime;
                this.totalTalkTime = model.totalTalkTime;
                this.totalWorkTime = model.totalWorkTime;
            } 

            /**
             * <p>Average break duration, in seconds. Calculation Formula: TotalBreakTime / Count of breaks. The count of breaks is not an API statistics field.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder averageBreakTime(Float averageBreakTime) {
                this.averageBreakTime = averageBreakTime;
                return this;
            }

            /**
             * <p>Average call hold duration, in seconds. Calculation Formula: TotalHoldTime / (Inbound CallsHold + Outbound CallsHold).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder averageHoldTime(Float averageHoldTime) {
                this.averageHoldTime = averageHoldTime;
                return this;
            }

            /**
             * <p>Average ready time, in seconds. Calculation Formula: TotalReadyTime / Count of ready events. The count of ready events is a non-API statistical field.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder averageReadyTime(Float averageReadyTime) {
                this.averageReadyTime = averageReadyTime;
                return this;
            }

            /**
             * <p>Average talk time, in seconds. Calculation Formula: TotalTalkTime / (CallsAnswered + CallsHandled).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder averageTalkTime(Float averageTalkTime) {
                this.averageTalkTime = averageTalkTime;
                return this;
            }

            /**
             * <p>Average post-processing duration per call, in seconds. Calculation Formula: TotalWorkTime / TotalCalls.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder averageWorkTime(Float averageWorkTime) {
                this.averageWorkTime = averageWorkTime;
                return this;
            }

            /**
             * <p>List of break details.</p>
             */
            public Builder breakCodeDetailList(java.util.List<BreakCodeDetailList> breakCodeDetailList) {
                this.breakCodeDetailList = breakCodeDetailList;
                return this;
            }

            /**
             * <p>This field has a value only when the input parameter Interval is Daily, representing the first publish time of the day.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder firstCheckInTime(Long firstCheckInTime) {
                this.firstCheckInTime = firstCheckInTime;
                return this;
            }

            /**
             * <p>This field has a value only when the input parameter Interval is Daily, representing the last unpublish time of the day.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder lastCheckOutTime(Long lastCheckOutTime) {
                this.lastCheckOutTime = lastCheckOutTime;
                return this;
            }

            /**
             * <p>This value is available only when the input parameter Interval is set to Daily, indicating the last unpublish time on that day.</p>
             * 
             * <strong>example:</strong>
             * <p>已弃用，请使用LastCheckOutTime代替此参数。</p>
             */
            public Builder lastCheckoutTime(Long lastCheckoutTime) {
                this.lastCheckoutTime = lastCheckoutTime;
                return this;
            }

            /**
             * <p>Maximum break time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder maxBreakTime(Long maxBreakTime) {
                this.maxBreakTime = maxBreakTime;
                return this;
            }

            /**
             * <p>Maximum call hold time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxHoldTime(Long maxHoldTime) {
                this.maxHoldTime = maxHoldTime;
                return this;
            }

            /**
             * <p>Maximum ready time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>435</p>
             */
            public Builder maxReadyTime(Long maxReadyTime) {
                this.maxReadyTime = maxReadyTime;
                return this;
            }

            /**
             * <p>Maximum talk time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxTalkTime(Long maxTalkTime) {
                this.maxTalkTime = maxTalkTime;
                return this;
            }

            /**
             * <p>Maximum post-processing duration in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder maxWorkTime(Long maxWorkTime) {
                this.maxWorkTime = maxWorkTime;
                return this;
            }

            /**
             * <p>Agent occupancy rate. Calculation Formula: (TotalWorkTime + TotalTalkTime) / TotalLoggedInTime.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder occupancyRate(Float occupancyRate) {
                this.occupancyRate = occupancyRate;
                return this;
            }

            /**
             * <p>Satisfaction index, which is the average value of the satisfaction keypress digits (single-digit numbers).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder satisfactionIndex(Float satisfactionIndex) {
                this.satisfactionIndex = satisfactionIndex;
                return this;
            }

            /**
             * <p>Satisfaction rate. Calculation Formula: Number of evaluations marked as satisfied / Count of satisfaction survey responses.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder satisfactionRate(Float satisfactionRate) {
                this.satisfactionRate = satisfactionRate;
                return this;
            }

            /**
             * <p>Sending Count of satisfaction surveys.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder satisfactionSurveysOffered(Long satisfactionSurveysOffered) {
                this.satisfactionSurveysOffered = satisfactionSurveysOffered;
                return this;
            }

            /**
             * <p>Response Count of satisfaction surveys.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder satisfactionSurveysResponded(Long satisfactionSurveysResponded) {
                this.satisfactionSurveysResponded = satisfactionSurveysResponded;
                return this;
            }

            /**
             * <p>Total break time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalBreakTime(Long totalBreakTime) {
                this.totalBreakTime = totalBreakTime;
                return this;
            }

            /**
             * <p>Total call volume. Calculation Formula: CallsOffered + CallsDialed.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder totalCalls(Long totalCalls) {
                this.totalCalls = totalCalls;
                return this;
            }

            /**
             * <p>Total hold time in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalHoldTime(Long totalHoldTime) {
                this.totalHoldTime = totalHoldTime;
                return this;
            }

            /**
             * <p>Total logon duration, in seconds. Note: Exclude offline and break durations.</p>
             * 
             * <strong>example:</strong>
             * <p>914</p>
             */
            public Builder totalLoggedInTime(Long totalLoggedInTime) {
                this.totalLoggedInTime = totalLoggedInTime;
                return this;
            }

            /**
             * <p>Total off-site logged-in duration, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalOffSiteLoggedInTime(Long totalOffSiteLoggedInTime) {
                this.totalOffSiteLoggedInTime = totalOffSiteLoggedInTime;
                return this;
            }

            /**
             * <p>Total off-site online duration, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>已弃用，请使用TotalOffSiteLoggedInTime代替此参数</p>
             */
            public Builder totalOffSiteOnlineTime(Long totalOffSiteOnlineTime) {
                this.totalOffSiteOnlineTime = totalOffSiteOnlineTime;
                return this;
            }

            /**
             * <p>Total office phone logged-in time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalOfficePhoneLoggedInTime(Long totalOfficePhoneLoggedInTime) {
                this.totalOfficePhoneLoggedInTime = totalOfficePhoneLoggedInTime;
                return this;
            }

            /**
             * <p>Total office phone online time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>已弃用，请使用TotalOfficePhoneLoggedInTime代替此参数</p>
             */
            public Builder totalOfficePhoneOnlineTime(Long totalOfficePhoneOnlineTime) {
                this.totalOfficePhoneOnlineTime = totalOfficePhoneOnlineTime;
                return this;
            }

            /**
             * <p>Total on-site logged-in duration, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalOnSiteLoggedInTime(Long totalOnSiteLoggedInTime) {
                this.totalOnSiteLoggedInTime = totalOnSiteLoggedInTime;
                return this;
            }

            /**
             * <p>Total on-site online duration, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>已弃用，请使用TotalOnSiteLoggedInTime代替此参数</p>
             */
            public Builder totalOnSiteOnlineTime(Long totalOnSiteOnlineTime) {
                this.totalOnSiteOnlineTime = totalOnSiteOnlineTime;
                return this;
            }

            /**
             * <p>Total online time for outbound-only scenarios, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalOutboundScenarioLoggedInTime(Long totalOutboundScenarioLoggedInTime) {
                this.totalOutboundScenarioLoggedInTime = totalOutboundScenarioLoggedInTime;
                return this;
            }

            /**
             * <p>Total idle time for outbound-only scenarios, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalOutboundScenarioReadyTime(Long totalOutboundScenarioReadyTime) {
                this.totalOutboundScenarioReadyTime = totalOutboundScenarioReadyTime;
                return this;
            }

            /**
             * <p>Total outbound-only scenario duration, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>已弃用，请使用TotalOutboundScenarioLoggedInTime代替此参数</p>
             */
            public Builder totalOutboundScenarioTime(Long totalOutboundScenarioTime) {
                this.totalOutboundScenarioTime = totalOutboundScenarioTime;
                return this;
            }

            /**
             * <p>Total ready time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>763</p>
             */
            public Builder totalReadyTime(Long totalReadyTime) {
                this.totalReadyTime = totalReadyTime;
                return this;
            }

            /**
             * <p>Total talk duration, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalTalkTime(Long totalTalkTime) {
                this.totalTalkTime = totalTalkTime;
                return this;
            }

            /**
             * <p>Total post-processing time in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
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
     * {@link ListIntervalAgentReportResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntervalAgentReportResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Back2Back")
        private Back2Back back2Back;

        @com.aliyun.core.annotation.NameInMap("Inbound")
        private Inbound inbound;

        @com.aliyun.core.annotation.NameInMap("Internal")
        private Internal internal;

        @com.aliyun.core.annotation.NameInMap("Outbound")
        private Outbound outbound;

        @com.aliyun.core.annotation.NameInMap("Overall")
        private Overall overall;

        @com.aliyun.core.annotation.NameInMap("StatsTime")
        private Long statsTime;

        private Data(Builder builder) {
            this.back2Back = builder.back2Back;
            this.inbound = builder.inbound;
            this.internal = builder.internal;
            this.outbound = builder.outbound;
            this.overall = builder.overall;
            this.statsTime = builder.statsTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return back2Back
         */
        public Back2Back getBack2Back() {
            return this.back2Back;
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
         * @return statsTime
         */
        public Long getStatsTime() {
            return this.statsTime;
        }

        public static final class Builder {
            private Back2Back back2Back; 
            private Inbound inbound; 
            private Internal internal; 
            private Outbound outbound; 
            private Overall overall; 
            private Long statsTime; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.back2Back = model.back2Back;
                this.inbound = model.inbound;
                this.internal = model.internal;
                this.outbound = model.outbound;
                this.overall = model.overall;
                this.statsTime = model.statsTime;
            } 

            /**
             * <p>Back-to-back call metric.</p>
             */
            public Builder back2Back(Back2Back back2Back) {
                this.back2Back = back2Back;
                return this;
            }

            /**
             * <p>Inbound metrics.</p>
             */
            public Builder inbound(Inbound inbound) {
                this.inbound = inbound;
                return this;
            }

            /**
             * <p>Internal call metrics.</p>
             */
            public Builder internal(Internal internal) {
                this.internal = internal;
                return this;
            }

            /**
             * <p>Outbound metrics.</p>
             */
            public Builder outbound(Outbound outbound) {
                this.outbound = outbound;
                return this;
            }

            /**
             * <p>Overall metrics.</p>
             */
            public Builder overall(Overall overall) {
                this.overall = overall;
                return this;
            }

            /**
             * <p>Start time of the time segment, formatted as a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1620291600000</p>
             */
            public Builder statsTime(Long statsTime) {
                this.statsTime = statsTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
