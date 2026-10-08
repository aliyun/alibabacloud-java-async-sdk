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
 * {@link ListHistoricalSkillGroupReportResponseBody} extends {@link TeaModel}
 *
 * <p>ListHistoricalSkillGroupReportResponseBody</p>
 */
public class ListHistoricalSkillGroupReportResponseBody extends TeaModel {
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

    private ListHistoricalSkillGroupReportResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHistoricalSkillGroupReportResponseBody create() {
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

        private Builder() {
        } 

        private Builder(ListHistoricalSkillGroupReportResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
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
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>26A34338-5CD9-4C95-A7A6-5BDCE76C6B94</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListHistoricalSkillGroupReportResponseBody build() {
            return new ListHistoricalSkillGroupReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListHistoricalSkillGroupReportResponseBody} extends {@link TeaModel}
     *
     * <p>ListHistoricalSkillGroupReportResponseBody</p>
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
             * <p>The agent answer rate.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder agentHandleRate(Float agentHandleRate) {
                this.agentHandleRate = agentHandleRate;
                return this;
            }

            /**
             * <p>The answer rate. Calculation formula: CallsAnswered/CallsDialed. The result may exceed 100% in some cases because answer events and response events may fall into different time ranges.</p>
             * 
             * <strong>example:</strong>
             * <p>0.6</p>
             */
            public Builder answerRate(Float answerRate) {
                this.answerRate = answerRate;
                return this;
            }

            /**
             * <p>The average ring time on the customer side, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder averageCustomerRingTime(Float averageCustomerRingTime) {
                this.averageCustomerRingTime = averageCustomerRingTime;
                return this;
            }

            /**
             * <p>The average ring time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder averageRingTime(Float averageRingTime) {
                this.averageRingTime = averageRingTime;
                return this;
            }

            /**
             * <p>The average talk time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder averageTalkTime(Float averageTalkTime) {
                this.averageTalkTime = averageTalkTime;
                return this;
            }

            /**
             * <p>The number of answered calls.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder callsAnswered(Long callsAnswered) {
                this.callsAnswered = callsAnswered;
                return this;
            }

            /**
             * <p>The number of calls answered by customers.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder callsCustomerAnswered(Long callsCustomerAnswered) {
                this.callsCustomerAnswered = callsCustomerAnswered;
                return this;
            }

            /**
             * <p>The number of dialed calls.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder callsDialed(Long callsDialed) {
                this.callsDialed = callsDialed;
                return this;
            }

            /**
             * <p>The customer answer rate.</p>
             * 
             * <strong>example:</strong>
             * <p>0.8</p>
             */
            public Builder customerAnswerRate(Float customerAnswerRate) {
                this.customerAnswerRate = customerAnswerRate;
                return this;
            }

            /**
             * <p>The maximum ring time on the customer side, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder maxCustomerRingTime(Long maxCustomerRingTime) {
                this.maxCustomerRingTime = maxCustomerRingTime;
                return this;
            }

            /**
             * <p>The maximum ring time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder maxRingTime(Long maxRingTime) {
                this.maxRingTime = maxRingTime;
                return this;
            }

            /**
             * <p>The maximum talk time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder maxTalkTime(Long maxTalkTime) {
                this.maxTalkTime = maxTalkTime;
                return this;
            }

            /**
             * <p>The total ring time on the customer side, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalCustomerRingTime(Long totalCustomerRingTime) {
                this.totalCustomerRingTime = totalCustomerRingTime;
                return this;
            }

            /**
             * <p>The total ring time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalRingTime(Long totalRingTime) {
                this.totalRingTime = totalRingTime;
                return this;
            }

            /**
             * <p>The total talk time, in seconds.</p>
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
     * {@link ListHistoricalSkillGroupReportResponseBody} extends {@link TeaModel}
     *
     * <p>ListHistoricalSkillGroupReportResponseBody</p>
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
             * <p>The channel type.</p>
             * 
             * <strong>example:</strong>
             * <p>Web</p>
             */
            public Builder accessChannelType(String accessChannelType) {
                this.accessChannelType = accessChannelType;
                return this;
            }

            /**
             * <p>The number of offered sessions.</p>
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
     * {@link ListHistoricalSkillGroupReportResponseBody} extends {@link TeaModel}
     *
     * <p>ListHistoricalSkillGroupReportResponseBody</p>
     */
    public static class Inbound extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AbandonRate")
        private Float abandonRate;

        @com.aliyun.core.annotation.NameInMap("AccessChannelTypeDetails")
        private java.util.List<AccessChannelTypeDetails> accessChannelTypeDetails;

        @com.aliyun.core.annotation.NameInMap("AverageAbandonTime")
        private Float averageAbandonTime;

        @com.aliyun.core.annotation.NameInMap("AverageAbandonedInQueueTime")
        private Float averageAbandonedInQueueTime;

        @com.aliyun.core.annotation.NameInMap("AverageAbandonedInRingTime")
        private Float averageAbandonedInRingTime;

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

        @com.aliyun.core.annotation.NameInMap("AverageWaitTime")
        private Float averageWaitTime;

        @com.aliyun.core.annotation.NameInMap("AverageWorkTime")
        private Float averageWorkTime;

        @com.aliyun.core.annotation.NameInMap("CallsAbandoned")
        private Long callsAbandoned;

        @com.aliyun.core.annotation.NameInMap("CallsAbandonedInQueue")
        private Long callsAbandonedInQueue;

        @com.aliyun.core.annotation.NameInMap("CallsAbandonedInRing")
        private Long callsAbandonedInRing;

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

        @com.aliyun.core.annotation.NameInMap("CallsOverflow")
        private Long callsOverflow;

        @com.aliyun.core.annotation.NameInMap("CallsQueued")
        private Long callsQueued;

        @com.aliyun.core.annotation.NameInMap("CallsQueuingFailed")
        private Long callsQueuingFailed;

        @com.aliyun.core.annotation.NameInMap("CallsQueuingOverflow")
        private Long callsQueuingOverflow;

        @com.aliyun.core.annotation.NameInMap("CallsQueuingTimeout")
        private Long callsQueuingTimeout;

        @com.aliyun.core.annotation.NameInMap("CallsRinged")
        private Long callsRinged;

        @com.aliyun.core.annotation.NameInMap("CallsTimeout")
        private Long callsTimeout;

        @com.aliyun.core.annotation.NameInMap("HandleRate")
        private Float handleRate;

        @com.aliyun.core.annotation.NameInMap("MaxAbandonTime")
        private Long maxAbandonTime;

        @com.aliyun.core.annotation.NameInMap("MaxAbandonedInQueueTime")
        private Long maxAbandonedInQueueTime;

        @com.aliyun.core.annotation.NameInMap("MaxAbandonedInRingTime")
        private Long maxAbandonedInRingTime;

        @com.aliyun.core.annotation.NameInMap("MaxHoldTime")
        private Long maxHoldTime;

        @com.aliyun.core.annotation.NameInMap("MaxRingTime")
        private Long maxRingTime;

        @com.aliyun.core.annotation.NameInMap("MaxTalkTime")
        private Long maxTalkTime;

        @com.aliyun.core.annotation.NameInMap("MaxWaitTime")
        private Long maxWaitTime;

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

        @com.aliyun.core.annotation.NameInMap("ServiceLevel20")
        private Float serviceLevel20;

        @com.aliyun.core.annotation.NameInMap("ServiceLevel30")
        private Float serviceLevel30;

        @com.aliyun.core.annotation.NameInMap("TotalAbandonTime")
        private Long totalAbandonTime;

        @com.aliyun.core.annotation.NameInMap("TotalAbandonedInQueueTime")
        private Long totalAbandonedInQueueTime;

        @com.aliyun.core.annotation.NameInMap("TotalAbandonedInRingTime")
        private Long totalAbandonedInRingTime;

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

        @com.aliyun.core.annotation.NameInMap("TotalWaitTime")
        private Long totalWaitTime;

        @com.aliyun.core.annotation.NameInMap("TotalWorkTime")
        private Long totalWorkTime;

        private Inbound(Builder builder) {
            this.abandonRate = builder.abandonRate;
            this.accessChannelTypeDetails = builder.accessChannelTypeDetails;
            this.averageAbandonTime = builder.averageAbandonTime;
            this.averageAbandonedInQueueTime = builder.averageAbandonedInQueueTime;
            this.averageAbandonedInRingTime = builder.averageAbandonedInRingTime;
            this.averageFirstResponseTime = builder.averageFirstResponseTime;
            this.averageHoldTime = builder.averageHoldTime;
            this.averageResponseTime = builder.averageResponseTime;
            this.averageRingTime = builder.averageRingTime;
            this.averageTalkTime = builder.averageTalkTime;
            this.averageWaitTime = builder.averageWaitTime;
            this.averageWorkTime = builder.averageWorkTime;
            this.callsAbandoned = builder.callsAbandoned;
            this.callsAbandonedInQueue = builder.callsAbandonedInQueue;
            this.callsAbandonedInRing = builder.callsAbandonedInRing;
            this.callsAttendedTransferIn = builder.callsAttendedTransferIn;
            this.callsAttendedTransferOut = builder.callsAttendedTransferOut;
            this.callsBlindTransferIn = builder.callsBlindTransferIn;
            this.callsBlindTransferOut = builder.callsBlindTransferOut;
            this.callsHandled = builder.callsHandled;
            this.callsHold = builder.callsHold;
            this.callsOffered = builder.callsOffered;
            this.callsOverflow = builder.callsOverflow;
            this.callsQueued = builder.callsQueued;
            this.callsQueuingFailed = builder.callsQueuingFailed;
            this.callsQueuingOverflow = builder.callsQueuingOverflow;
            this.callsQueuingTimeout = builder.callsQueuingTimeout;
            this.callsRinged = builder.callsRinged;
            this.callsTimeout = builder.callsTimeout;
            this.handleRate = builder.handleRate;
            this.maxAbandonTime = builder.maxAbandonTime;
            this.maxAbandonedInQueueTime = builder.maxAbandonedInQueueTime;
            this.maxAbandonedInRingTime = builder.maxAbandonedInRingTime;
            this.maxHoldTime = builder.maxHoldTime;
            this.maxRingTime = builder.maxRingTime;
            this.maxTalkTime = builder.maxTalkTime;
            this.maxWaitTime = builder.maxWaitTime;
            this.maxWorkTime = builder.maxWorkTime;
            this.satisfactionIndex = builder.satisfactionIndex;
            this.satisfactionRate = builder.satisfactionRate;
            this.satisfactionSurveysOffered = builder.satisfactionSurveysOffered;
            this.satisfactionSurveysResponded = builder.satisfactionSurveysResponded;
            this.serviceLevel15 = builder.serviceLevel15;
            this.serviceLevel20 = builder.serviceLevel20;
            this.serviceLevel30 = builder.serviceLevel30;
            this.totalAbandonTime = builder.totalAbandonTime;
            this.totalAbandonedInQueueTime = builder.totalAbandonedInQueueTime;
            this.totalAbandonedInRingTime = builder.totalAbandonedInRingTime;
            this.totalHoldTime = builder.totalHoldTime;
            this.totalMessagesSent = builder.totalMessagesSent;
            this.totalMessagesSentByAgent = builder.totalMessagesSentByAgent;
            this.totalMessagesSentByCustomer = builder.totalMessagesSentByCustomer;
            this.totalRingTime = builder.totalRingTime;
            this.totalTalkTime = builder.totalTalkTime;
            this.totalWaitTime = builder.totalWaitTime;
            this.totalWorkTime = builder.totalWorkTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Inbound create() {
            return builder().build();
        }

        /**
         * @return abandonRate
         */
        public Float getAbandonRate() {
            return this.abandonRate;
        }

        /**
         * @return accessChannelTypeDetails
         */
        public java.util.List<AccessChannelTypeDetails> getAccessChannelTypeDetails() {
            return this.accessChannelTypeDetails;
        }

        /**
         * @return averageAbandonTime
         */
        public Float getAverageAbandonTime() {
            return this.averageAbandonTime;
        }

        /**
         * @return averageAbandonedInQueueTime
         */
        public Float getAverageAbandonedInQueueTime() {
            return this.averageAbandonedInQueueTime;
        }

        /**
         * @return averageAbandonedInRingTime
         */
        public Float getAverageAbandonedInRingTime() {
            return this.averageAbandonedInRingTime;
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
         * @return averageWaitTime
         */
        public Float getAverageWaitTime() {
            return this.averageWaitTime;
        }

        /**
         * @return averageWorkTime
         */
        public Float getAverageWorkTime() {
            return this.averageWorkTime;
        }

        /**
         * @return callsAbandoned
         */
        public Long getCallsAbandoned() {
            return this.callsAbandoned;
        }

        /**
         * @return callsAbandonedInQueue
         */
        public Long getCallsAbandonedInQueue() {
            return this.callsAbandonedInQueue;
        }

        /**
         * @return callsAbandonedInRing
         */
        public Long getCallsAbandonedInRing() {
            return this.callsAbandonedInRing;
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
         * @return callsOverflow
         */
        public Long getCallsOverflow() {
            return this.callsOverflow;
        }

        /**
         * @return callsQueued
         */
        public Long getCallsQueued() {
            return this.callsQueued;
        }

        /**
         * @return callsQueuingFailed
         */
        public Long getCallsQueuingFailed() {
            return this.callsQueuingFailed;
        }

        /**
         * @return callsQueuingOverflow
         */
        public Long getCallsQueuingOverflow() {
            return this.callsQueuingOverflow;
        }

        /**
         * @return callsQueuingTimeout
         */
        public Long getCallsQueuingTimeout() {
            return this.callsQueuingTimeout;
        }

        /**
         * @return callsRinged
         */
        public Long getCallsRinged() {
            return this.callsRinged;
        }

        /**
         * @return callsTimeout
         */
        public Long getCallsTimeout() {
            return this.callsTimeout;
        }

        /**
         * @return handleRate
         */
        public Float getHandleRate() {
            return this.handleRate;
        }

        /**
         * @return maxAbandonTime
         */
        public Long getMaxAbandonTime() {
            return this.maxAbandonTime;
        }

        /**
         * @return maxAbandonedInQueueTime
         */
        public Long getMaxAbandonedInQueueTime() {
            return this.maxAbandonedInQueueTime;
        }

        /**
         * @return maxAbandonedInRingTime
         */
        public Long getMaxAbandonedInRingTime() {
            return this.maxAbandonedInRingTime;
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
         * @return maxWaitTime
         */
        public Long getMaxWaitTime() {
            return this.maxWaitTime;
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
         * @return serviceLevel20
         */
        public Float getServiceLevel20() {
            return this.serviceLevel20;
        }

        /**
         * @return serviceLevel30
         */
        public Float getServiceLevel30() {
            return this.serviceLevel30;
        }

        /**
         * @return totalAbandonTime
         */
        public Long getTotalAbandonTime() {
            return this.totalAbandonTime;
        }

        /**
         * @return totalAbandonedInQueueTime
         */
        public Long getTotalAbandonedInQueueTime() {
            return this.totalAbandonedInQueueTime;
        }

        /**
         * @return totalAbandonedInRingTime
         */
        public Long getTotalAbandonedInRingTime() {
            return this.totalAbandonedInRingTime;
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
         * @return totalWaitTime
         */
        public Long getTotalWaitTime() {
            return this.totalWaitTime;
        }

        /**
         * @return totalWorkTime
         */
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

        public static final class Builder {
            private Float abandonRate; 
            private java.util.List<AccessChannelTypeDetails> accessChannelTypeDetails; 
            private Float averageAbandonTime; 
            private Float averageAbandonedInQueueTime; 
            private Float averageAbandonedInRingTime; 
            private Float averageFirstResponseTime; 
            private Float averageHoldTime; 
            private Float averageResponseTime; 
            private Float averageRingTime; 
            private Float averageTalkTime; 
            private Float averageWaitTime; 
            private Float averageWorkTime; 
            private Long callsAbandoned; 
            private Long callsAbandonedInQueue; 
            private Long callsAbandonedInRing; 
            private Long callsAttendedTransferIn; 
            private Long callsAttendedTransferOut; 
            private Long callsBlindTransferIn; 
            private Long callsBlindTransferOut; 
            private Long callsHandled; 
            private Long callsHold; 
            private Long callsOffered; 
            private Long callsOverflow; 
            private Long callsQueued; 
            private Long callsQueuingFailed; 
            private Long callsQueuingOverflow; 
            private Long callsQueuingTimeout; 
            private Long callsRinged; 
            private Long callsTimeout; 
            private Float handleRate; 
            private Long maxAbandonTime; 
            private Long maxAbandonedInQueueTime; 
            private Long maxAbandonedInRingTime; 
            private Long maxHoldTime; 
            private Long maxRingTime; 
            private Long maxTalkTime; 
            private Long maxWaitTime; 
            private Long maxWorkTime; 
            private Float satisfactionIndex; 
            private Float satisfactionRate; 
            private Long satisfactionSurveysOffered; 
            private Long satisfactionSurveysResponded; 
            private Float serviceLevel15; 
            private Float serviceLevel20; 
            private Float serviceLevel30; 
            private Long totalAbandonTime; 
            private Long totalAbandonedInQueueTime; 
            private Long totalAbandonedInRingTime; 
            private Long totalHoldTime; 
            private Long totalMessagesSent; 
            private Long totalMessagesSentByAgent; 
            private Long totalMessagesSentByCustomer; 
            private Long totalRingTime; 
            private Long totalTalkTime; 
            private Long totalWaitTime; 
            private Long totalWorkTime; 

            private Builder() {
            } 

            private Builder(Inbound model) {
                this.abandonRate = model.abandonRate;
                this.accessChannelTypeDetails = model.accessChannelTypeDetails;
                this.averageAbandonTime = model.averageAbandonTime;
                this.averageAbandonedInQueueTime = model.averageAbandonedInQueueTime;
                this.averageAbandonedInRingTime = model.averageAbandonedInRingTime;
                this.averageFirstResponseTime = model.averageFirstResponseTime;
                this.averageHoldTime = model.averageHoldTime;
                this.averageResponseTime = model.averageResponseTime;
                this.averageRingTime = model.averageRingTime;
                this.averageTalkTime = model.averageTalkTime;
                this.averageWaitTime = model.averageWaitTime;
                this.averageWorkTime = model.averageWorkTime;
                this.callsAbandoned = model.callsAbandoned;
                this.callsAbandonedInQueue = model.callsAbandonedInQueue;
                this.callsAbandonedInRing = model.callsAbandonedInRing;
                this.callsAttendedTransferIn = model.callsAttendedTransferIn;
                this.callsAttendedTransferOut = model.callsAttendedTransferOut;
                this.callsBlindTransferIn = model.callsBlindTransferIn;
                this.callsBlindTransferOut = model.callsBlindTransferOut;
                this.callsHandled = model.callsHandled;
                this.callsHold = model.callsHold;
                this.callsOffered = model.callsOffered;
                this.callsOverflow = model.callsOverflow;
                this.callsQueued = model.callsQueued;
                this.callsQueuingFailed = model.callsQueuingFailed;
                this.callsQueuingOverflow = model.callsQueuingOverflow;
                this.callsQueuingTimeout = model.callsQueuingTimeout;
                this.callsRinged = model.callsRinged;
                this.callsTimeout = model.callsTimeout;
                this.handleRate = model.handleRate;
                this.maxAbandonTime = model.maxAbandonTime;
                this.maxAbandonedInQueueTime = model.maxAbandonedInQueueTime;
                this.maxAbandonedInRingTime = model.maxAbandonedInRingTime;
                this.maxHoldTime = model.maxHoldTime;
                this.maxRingTime = model.maxRingTime;
                this.maxTalkTime = model.maxTalkTime;
                this.maxWaitTime = model.maxWaitTime;
                this.maxWorkTime = model.maxWorkTime;
                this.satisfactionIndex = model.satisfactionIndex;
                this.satisfactionRate = model.satisfactionRate;
                this.satisfactionSurveysOffered = model.satisfactionSurveysOffered;
                this.satisfactionSurveysResponded = model.satisfactionSurveysResponded;
                this.serviceLevel15 = model.serviceLevel15;
                this.serviceLevel20 = model.serviceLevel20;
                this.serviceLevel30 = model.serviceLevel30;
                this.totalAbandonTime = model.totalAbandonTime;
                this.totalAbandonedInQueueTime = model.totalAbandonedInQueueTime;
                this.totalAbandonedInRingTime = model.totalAbandonedInRingTime;
                this.totalHoldTime = model.totalHoldTime;
                this.totalMessagesSent = model.totalMessagesSent;
                this.totalMessagesSentByAgent = model.totalMessagesSentByAgent;
                this.totalMessagesSentByCustomer = model.totalMessagesSentByCustomer;
                this.totalRingTime = model.totalRingTime;
                this.totalTalkTime = model.totalTalkTime;
                this.totalWaitTime = model.totalWaitTime;
                this.totalWorkTime = model.totalWorkTime;
            } 

            /**
             * <p>The abandon rate. Calculation formula: CallsAbandoned/CallsOffered. The result may exceed 100% in some cases because abandon events and allocation events may fall into different time ranges.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder abandonRate(Float abandonRate) {
                this.abandonRate = abandonRate;
                return this;
            }

            /**
             * <p>The statistical data for each channel.</p>
             */
            public Builder accessChannelTypeDetails(java.util.List<AccessChannelTypeDetails> accessChannelTypeDetails) {
                this.accessChannelTypeDetails = accessChannelTypeDetails;
                return this;
            }

            /**
             * <p>The average abandon time, in seconds. Calculation formula: TotalAbandonTime/CallsAbandoned.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder averageAbandonTime(Float averageAbandonTime) {
                this.averageAbandonTime = averageAbandonTime;
                return this;
            }

            /**
             * <p>The average abandon time in queue, in seconds. Calculation formula: TotalAbandonedInQueueTime/CallsAbandonedInQueue.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder averageAbandonedInQueueTime(Float averageAbandonedInQueueTime) {
                this.averageAbandonedInQueueTime = averageAbandonedInQueueTime;
                return this;
            }

            /**
             * <p>The average abandon time during ringing, in seconds. Calculation formula: TotalAbandonedInRingTime/CallsAbandonedInRing.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder averageAbandonedInRingTime(Float averageAbandonedInRingTime) {
                this.averageAbandonedInRingTime = averageAbandonedInRingTime;
                return this;
            }

            /**
             * <p>The average first response time for chat sessions, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder averageFirstResponseTime(Float averageFirstResponseTime) {
                this.averageFirstResponseTime = averageFirstResponseTime;
                return this;
            }

            /**
             * <p>The average hold time, in seconds. Calculation formula: TotalHoldTime/CallsHold.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder averageHoldTime(Float averageHoldTime) {
                this.averageHoldTime = averageHoldTime;
                return this;
            }

            /**
             * <p>The average response time for chat sessions.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder averageResponseTime(Float averageResponseTime) {
                this.averageResponseTime = averageResponseTime;
                return this;
            }

            /**
             * <p>The average ring time, in seconds. Calculation formula: TotalRingTime/CallsRinged.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder averageRingTime(Float averageRingTime) {
                this.averageRingTime = averageRingTime;
                return this;
            }

            /**
             * <p>The average talk time, in seconds. Calculation formula: TotalTalkTime/CallsHandled.</p>
             * 
             * <strong>example:</strong>
             * <p>64</p>
             */
            public Builder averageTalkTime(Float averageTalkTime) {
                this.averageTalkTime = averageTalkTime;
                return this;
            }

            /**
             * <p>The average wait time, which is the average time a caller waits before an agent answers the call. Calculation formula: TotalWaitTime/CallsHandled.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder averageWaitTime(Float averageWaitTime) {
                this.averageWaitTime = averageWaitTime;
                return this;
            }

            /**
             * <p>The average after-call work time, in seconds. Calculation formula: TotalWorkTime/CallsHandled.</p>
             * 
             * <strong>example:</strong>
             * <p>13</p>
             */
            public Builder averageWorkTime(Float averageWorkTime) {
                this.averageWorkTime = averageWorkTime;
                return this;
            }

            /**
             * <p>The number of abandoned calls. Calculation formula: CallsAbandonedInQueue + CallsAbandonedInRing.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsAbandoned(Long callsAbandoned) {
                this.callsAbandoned = callsAbandoned;
                return this;
            }

            /**
             * <p>The number of calls abandoned in queue, which refers to the number of calls hung up by customers while waiting in the queue after entering it.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsAbandonedInQueue(Long callsAbandonedInQueue) {
                this.callsAbandonedInQueue = callsAbandonedInQueue;
                return this;
            }

            /**
             * <p>The number of calls abandoned during ringing, which refers to the number of calls hung up by customers while the agent is ringing.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsAbandonedInRing(Long callsAbandonedInRing) {
                this.callsAbandonedInRing = callsAbandonedInRing;
                return this;
            }

            /**
             * <p>The number of attended transfers in, which refers to the number of calls transferred to this skill group from other skill groups through attended transfers. Transfers between agents within the same skill group are not counted. If an agent is signed in to multiple skill groups at the same time, the call is attributed to the first skill group the agent signed in to. If a call is transferred to this skill group multiple times from other skill groups, each transfer is counted as one. The same rule applies to similar metrics below.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsAttendedTransferIn(Long callsAttendedTransferIn) {
                this.callsAttendedTransferIn = callsAttendedTransferIn;
                return this;
            }

            /**
             * <p>The number of attended transfers out, which refers to the number of calls transferred from this skill group to other skill groups through attended transfers. Transfers between agents within the same skill group are not counted.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsAttendedTransferOut(Long callsAttendedTransferOut) {
                this.callsAttendedTransferOut = callsAttendedTransferOut;
                return this;
            }

            /**
             * <p>The number of blind transfers in, which refers to the number of calls transferred to this skill group from other skill groups through blind transfers. Transfers between agents within the same skill group are not counted. If an agent is signed in to multiple skill groups at the same time, the call is attributed to the first skill group the agent signed in to. If a call is transferred to this skill group multiple times from other skill groups, each transfer is counted as one. The same rule applies to similar metrics below.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsBlindTransferIn(Long callsBlindTransferIn) {
                this.callsBlindTransferIn = callsBlindTransferIn;
                return this;
            }

            /**
             * <p>The number of blind transfers out, which refers to the number of calls transferred from this skill group to other skill groups through blind transfers. Transfers between agents within the same skill group are not counted.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsBlindTransferOut(Long callsBlindTransferOut) {
                this.callsBlindTransferOut = callsBlindTransferOut;
                return this;
            }

            /**
             * <p>The number of handled calls, which refers to the number of times agents answer calls. If a call is answered by multiple agents after entering the queue each time, it is counted as one.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder callsHandled(Long callsHandled) {
                this.callsHandled = callsHandled;
                return this;
            }

            /**
             * <p>The number of held calls, which refers to the number of times calls are put on hold. If a call is put on hold multiple times after entering the queue each time, it is counted as one.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsHold(Long callsHold) {
                this.callsHold = callsHold;
                return this;
            }

            /**
             * <p>The number of offered calls, which refers to the number of calls assigned to this skill group, including calls assigned through queues and calls assigned through transfers (attended transfers and blind transfers). Calculation formula: CallsQueued + CallsBlindTransferIn + CallsAttendedTransferIn.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder callsOffered(Long callsOffered) {
                this.callsOffered = callsOffered;
                return this;
            }

            /**
             * <p>The number of overflowed calls, which refers to the number of calls that overflow from the queue or skill group. If a call enters the same queue multiple times and overflows each time, each overflow is counted as one.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsOverflow(Long callsOverflow) {
                this.callsOverflow = callsOverflow;
                return this;
            }

            /**
             * <p>The number of queued calls in inbound scenarios, which refers to the number of calls that enter the queue or skill group. If a call enters the same queue multiple times, each entry is counted as one.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder callsQueued(Long callsQueued) {
                this.callsQueued = callsQueued;
                return this;
            }

            /**
             * <p>The number of failed queue calls, which refers to the number of calls hung up by customers while waiting in the queue after entering it.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsQueuingFailed(Long callsQueuingFailed) {
                this.callsQueuingFailed = callsQueuingFailed;
                return this;
            }

            /**
             * <p>The number of calls that overflow from the queue, which refers to calls that overflow while waiting in the IVR queue.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsQueuingOverflow(Long callsQueuingOverflow) {
                this.callsQueuingOverflow = callsQueuingOverflow;
                return this;
            }

            /**
             * <p>The number of calls that time out during the queuing phase.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsQueuingTimeout(Long callsQueuingTimeout) {
                this.callsQueuingTimeout = callsQueuingTimeout;
                return this;
            }

            /**
             * <p>The number of ringing calls, which refers to the number of calls that trigger agent ringing. If a call is assigned to multiple agents and triggers ringing after entering the queue each time, it is counted as one.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder callsRinged(Long callsRinged) {
                this.callsRinged = callsRinged;
                return this;
            }

            /**
             * <p>The number of timed-out calls, which refers to the number of calls that time out in the queue or skill group. If a call enters the same queue multiple times and times out each time, each timeout is counted as one.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsTimeout(Long callsTimeout) {
                this.callsTimeout = callsTimeout;
                return this;
            }

            /**
             * <p>The handle rate. Calculation formula: CallsHandled/CallsOffered. The result may exceed 100% in some cases because handle events and offer events may fall into different time ranges.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder handleRate(Float handleRate) {
                this.handleRate = handleRate;
                return this;
            }

            /**
             * <p>The maximum abandon time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxAbandonTime(Long maxAbandonTime) {
                this.maxAbandonTime = maxAbandonTime;
                return this;
            }

            /**
             * <p>The maximum abandon time in queue, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxAbandonedInQueueTime(Long maxAbandonedInQueueTime) {
                this.maxAbandonedInQueueTime = maxAbandonedInQueueTime;
                return this;
            }

            /**
             * <p>The maximum abandon time during ringing, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxAbandonedInRingTime(Long maxAbandonedInRingTime) {
                this.maxAbandonedInRingTime = maxAbandonedInRingTime;
                return this;
            }

            /**
             * <p>The maximum hold time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxHoldTime(Long maxHoldTime) {
                this.maxHoldTime = maxHoldTime;
                return this;
            }

            /**
             * <p>The maximum ring time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder maxRingTime(Long maxRingTime) {
                this.maxRingTime = maxRingTime;
                return this;
            }

            /**
             * <p>The maximum talk time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxTalkTime(Long maxTalkTime) {
                this.maxTalkTime = maxTalkTime;
                return this;
            }

            /**
             * <p>The maximum wait time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>13</p>
             */
            public Builder maxWaitTime(Long maxWaitTime) {
                this.maxWaitTime = maxWaitTime;
                return this;
            }

            /**
             * <p>The maximum after-call work time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder maxWorkTime(Long maxWorkTime) {
                this.maxWorkTime = maxWorkTime;
                return this;
            }

            /**
             * <p>The satisfaction index, which is the average value of the satisfaction rating digits.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder satisfactionIndex(Float satisfactionIndex) {
                this.satisfactionIndex = satisfactionIndex;
                return this;
            }

            /**
             * <p>The satisfaction rate. Calculation formula: Number of satisfied ratings / Number of satisfaction survey responses.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder satisfactionRate(Float satisfactionRate) {
                this.satisfactionRate = satisfactionRate;
                return this;
            }

            /**
             * <p>The number of satisfaction surveys offered.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder satisfactionSurveysOffered(Long satisfactionSurveysOffered) {
                this.satisfactionSurveysOffered = satisfactionSurveysOffered;
                return this;
            }

            /**
             * <p>The number of satisfaction surveys responded to.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder satisfactionSurveysResponded(Long satisfactionSurveysResponded) {
                this.satisfactionSurveysResponded = satisfactionSurveysResponded;
                return this;
            }

            /**
             * <p>The 15-second service level.</p>
             * 
             * <strong>example:</strong>
             * <p>0.7</p>
             */
            public Builder serviceLevel15(Float serviceLevel15) {
                this.serviceLevel15 = serviceLevel15;
                return this;
            }

            /**
             * <p>The 20-second service level. Calculation formula: Number of calls with a wait time of less than or equal to 20 seconds / CallsQueued.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder serviceLevel20(Float serviceLevel20) {
                this.serviceLevel20 = serviceLevel20;
                return this;
            }

            /**
             * <p>The 30-second service level.</p>
             * 
             * <strong>example:</strong>
             * <p>0.9</p>
             */
            public Builder serviceLevel30(Float serviceLevel30) {
                this.serviceLevel30 = serviceLevel30;
                return this;
            }

            /**
             * <p>The total abandon time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalAbandonTime(Long totalAbandonTime) {
                this.totalAbandonTime = totalAbandonTime;
                return this;
            }

            /**
             * <p>The total abandon time in queue, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalAbandonedInQueueTime(Long totalAbandonedInQueueTime) {
                this.totalAbandonedInQueueTime = totalAbandonedInQueueTime;
                return this;
            }

            /**
             * <p>The total abandon time during ringing, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalAbandonedInRingTime(Long totalAbandonedInRingTime) {
                this.totalAbandonedInRingTime = totalAbandonedInRingTime;
                return this;
            }

            /**
             * <p>The total hold time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalHoldTime(Long totalHoldTime) {
                this.totalHoldTime = totalHoldTime;
                return this;
            }

            /**
             * <p>The total number of messages sent in chat sessions.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder totalMessagesSent(Long totalMessagesSent) {
                this.totalMessagesSent = totalMessagesSent;
                return this;
            }

            /**
             * <p>The total number of messages sent by agents in chat sessions.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder totalMessagesSentByAgent(Long totalMessagesSentByAgent) {
                this.totalMessagesSentByAgent = totalMessagesSentByAgent;
                return this;
            }

            /**
             * <p>The total number of messages sent by customers in chat sessions.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder totalMessagesSentByCustomer(Long totalMessagesSentByCustomer) {
                this.totalMessagesSentByCustomer = totalMessagesSentByCustomer;
                return this;
            }

            /**
             * <p>The total ring time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder totalRingTime(Long totalRingTime) {
                this.totalRingTime = totalRingTime;
                return this;
            }

            /**
             * <p>The total talk time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>447</p>
             */
            public Builder totalTalkTime(Long totalTalkTime) {
                this.totalTalkTime = totalTalkTime;
                return this;
            }

            /**
             * <p>The total wait time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>34</p>
             */
            public Builder totalWaitTime(Long totalWaitTime) {
                this.totalWaitTime = totalWaitTime;
                return this;
            }

            /**
             * <p>The total after-call work time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>85</p>
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
     * {@link ListHistoricalSkillGroupReportResponseBody} extends {@link TeaModel}
     *
     * <p>ListHistoricalSkillGroupReportResponseBody</p>
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
             * <p>The answer rate. Calculation formula: CallsAnswered/CallsDialed. The result may exceed 100% in some cases because answer events and response events may fall into different time ranges.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder answerRate(Float answerRate) {
                this.answerRate = answerRate;
                return this;
            }

            /**
             * <p>The average dialing time in seconds. Formula: TotalDialingTime/CallsDialed.</p>
             * 
             * <strong>example:</strong>
             * <p>37</p>
             */
            public Builder averageDialingTime(Float averageDialingTime) {
                this.averageDialingTime = averageDialingTime;
                return this;
            }

            /**
             * <p>The average hold time, in seconds. Calculation formula: TotalHoldTime/CallsHold.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder averageHoldTime(Float averageHoldTime) {
                this.averageHoldTime = averageHoldTime;
                return this;
            }

            /**
             * <p>The average ring time, in seconds. Calculation formula: TotalRingTime/CallsRinged.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder averageRingTime(Float averageRingTime) {
                this.averageRingTime = averageRingTime;
                return this;
            }

            /**
             * <p>The average talk time in seconds. Formula: TotalTalkTime/CallsAnswered.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder averageTalkTime(Float averageTalkTime) {
                this.averageTalkTime = averageTalkTime;
                return this;
            }

            /**
             * <p>The average after-call work time in seconds. Formula: TotalWorkTime/CallsDialed.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder averageWorkTime(Float averageWorkTime) {
                this.averageWorkTime = averageWorkTime;
                return this;
            }

            /**
             * <p>The number of answered calls.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder callsAnswered(Long callsAnswered) {
                this.callsAnswered = callsAnswered;
                return this;
            }

            /**
             * <p>The number of attended transfers in, which refers to the number of calls transferred to this skill group from other skill groups through attended transfers. Transfers between agents within the same skill group are not counted. If an agent is signed in to multiple skill groups at the same time, the call is attributed to the first skill group the agent signed in to. If a call is transferred to this skill group multiple times from other skill groups, each transfer is counted as one. The same rule applies to similar metrics below.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsAttendedTransferIn(Long callsAttendedTransferIn) {
                this.callsAttendedTransferIn = callsAttendedTransferIn;
                return this;
            }

            /**
             * <p>The number of attended transfers out, which refers to the number of calls transferred from this skill group to other skill groups through attended transfers. Transfers between agents within the same skill group are not counted.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsAttendedTransferOut(Long callsAttendedTransferOut) {
                this.callsAttendedTransferOut = callsAttendedTransferOut;
                return this;
            }

            /**
             * <p>The number of blind transfers in, which refers to the number of calls transferred to this skill group from other skill groups through blind transfers. Transfers between agents within the same skill group are not counted. If an agent is signed in to multiple skill groups at the same time, the call is attributed to the first skill group the agent signed in to. If a call is transferred to this skill group multiple times from other skill groups, each transfer is counted as one. The same rule applies to similar metrics below.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsBlindTransferIn(Long callsBlindTransferIn) {
                this.callsBlindTransferIn = callsBlindTransferIn;
                return this;
            }

            /**
             * <p>The number of blind transfers out, which refers to the number of calls transferred from this skill group to other skill groups through blind transfers. Transfers between agents within the same skill group are not counted.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsBlindTransferOut(Long callsBlindTransferOut) {
                this.callsBlindTransferOut = callsBlindTransferOut;
                return this;
            }

            /**
             * <p>The number of dialed calls.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder callsDialed(Long callsDialed) {
                this.callsDialed = callsDialed;
                return this;
            }

            /**
             * <p>The number of calls placed on hold. If a call is placed on hold multiple times before being transferred out of the current skill group, it is counted as one.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsHold(Long callsHold) {
                this.callsHold = callsHold;
                return this;
            }

            /**
             * <p>The number of ringing calls, which refers to the number of calls that trigger agent ringing. If a call is assigned to multiple agents and triggers ringing after entering the queue each time, it is counted as one.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsRinged(Long callsRinged) {
                this.callsRinged = callsRinged;
                return this;
            }

            /**
             * <p>The maximum dialing time in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder maxDialingTime(Long maxDialingTime) {
                this.maxDialingTime = maxDialingTime;
                return this;
            }

            /**
             * <p>The maximum hold time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxHoldTime(Long maxHoldTime) {
                this.maxHoldTime = maxHoldTime;
                return this;
            }

            /**
             * <p>The maximum ring time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxRingTime(Long maxRingTime) {
                this.maxRingTime = maxRingTime;
                return this;
            }

            /**
             * <p>The maximum talk time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxTalkTime(Long maxTalkTime) {
                this.maxTalkTime = maxTalkTime;
                return this;
            }

            /**
             * <p>The maximum after-call work time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxWorkTime(Long maxWorkTime) {
                this.maxWorkTime = maxWorkTime;
                return this;
            }

            /**
             * <p>The satisfaction index, which is the average value of the satisfaction rating digits.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder satisfactionIndex(Float satisfactionIndex) {
                this.satisfactionIndex = satisfactionIndex;
                return this;
            }

            /**
             * <p>The satisfaction rate. Calculation formula: Number of satisfied ratings / Number of satisfaction survey responses.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder satisfactionRate(Float satisfactionRate) {
                this.satisfactionRate = satisfactionRate;
                return this;
            }

            /**
             * <p>The number of satisfaction surveys offered.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder satisfactionSurveysOffered(Long satisfactionSurveysOffered) {
                this.satisfactionSurveysOffered = satisfactionSurveysOffered;
                return this;
            }

            /**
             * <p>The number of satisfaction surveys responded to.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder satisfactionSurveysResponded(Long satisfactionSurveysResponded) {
                this.satisfactionSurveysResponded = satisfactionSurveysResponded;
                return this;
            }

            /**
             * <p>The total dialing time in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>218</p>
             */
            public Builder totalDialingTime(Long totalDialingTime) {
                this.totalDialingTime = totalDialingTime;
                return this;
            }

            /**
             * <p>The total hold time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalHoldTime(Long totalHoldTime) {
                this.totalHoldTime = totalHoldTime;
                return this;
            }

            /**
             * <p>The total ring time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalRingTime(Long totalRingTime) {
                this.totalRingTime = totalRingTime;
                return this;
            }

            /**
             * <p>The total talk time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder totalTalkTime(Long totalTalkTime) {
                this.totalTalkTime = totalTalkTime;
                return this;
            }

            /**
             * <p>The total after-call work time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
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
     * {@link ListHistoricalSkillGroupReportResponseBody} extends {@link TeaModel}
     *
     * <p>ListHistoricalSkillGroupReportResponseBody</p>
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
             * <p>The break type code.</p>
             * 
             * <strong>example:</strong>
             * <p>Meeting</p>
             */
            public Builder breakCode(String breakCode) {
                this.breakCode = breakCode;
                return this;
            }

            /**
             * <p>The number of occurrences of this break type.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The total duration of this break type in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
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
     * {@link ListHistoricalSkillGroupReportResponseBody} extends {@link TeaModel}
     *
     * <p>ListHistoricalSkillGroupReportResponseBody</p>
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
                this.totalReadyTime = model.totalReadyTime;
                this.totalTalkTime = model.totalTalkTime;
                this.totalWorkTime = model.totalWorkTime;
            } 

            /**
             * <p>The average break time in seconds. Formula: TotalBreakTime/Number of breaks. The number of breaks is not a statistical field returned by the API.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder averageBreakTime(Float averageBreakTime) {
                this.averageBreakTime = averageBreakTime;
                return this;
            }

            /**
             * <p>The average hold time in seconds. Formula: TotalHoldTime/(Inbound CallsHold + Outbound CallsHold).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder averageHoldTime(Float averageHoldTime) {
                this.averageHoldTime = averageHoldTime;
                return this;
            }

            /**
             * <p>The average ready time in seconds. Formula: TotalReadyTime/Number of ready states. The number of ready states is not a statistical field returned by the API.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder averageReadyTime(Float averageReadyTime) {
                this.averageReadyTime = averageReadyTime;
                return this;
            }

            /**
             * <p>The average talk time in seconds. Formula: TotalTalkTime/(CallsAnswered + CallsHandled).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder averageTalkTime(Float averageTalkTime) {
                this.averageTalkTime = averageTalkTime;
                return this;
            }

            /**
             * <p>The average after-call work time in seconds. Formula: TotalWorkTime/TotalCalls.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder averageWorkTime(Float averageWorkTime) {
                this.averageWorkTime = averageWorkTime;
                return this;
            }

            /**
             * <p>The list of break details.</p>
             */
            public Builder breakCodeDetailList(java.util.List<BreakCodeDetailList> breakCodeDetailList) {
                this.breakCodeDetailList = breakCodeDetailList;
                return this;
            }

            /**
             * <p>The maximum break time in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder maxBreakTime(Long maxBreakTime) {
                this.maxBreakTime = maxBreakTime;
                return this;
            }

            /**
             * <p>The maximum hold time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxHoldTime(Long maxHoldTime) {
                this.maxHoldTime = maxHoldTime;
                return this;
            }

            /**
             * <p>The maximum ready time in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>19328</p>
             */
            public Builder maxReadyTime(Long maxReadyTime) {
                this.maxReadyTime = maxReadyTime;
                return this;
            }

            /**
             * <p>The maximum talk time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxTalkTime(Long maxTalkTime) {
                this.maxTalkTime = maxTalkTime;
                return this;
            }

            /**
             * <p>The maximum after-call work time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder maxWorkTime(Long maxWorkTime) {
                this.maxWorkTime = maxWorkTime;
                return this;
            }

            /**
             * <p>The agent occupancy rate. Formula: (TotalWorkTime + TotalTalkTime) / TotalLoggedInTime.</p>
             * 
             * <strong>example:</strong>
             * <p>0.02332222293912065</p>
             */
            public Builder occupancyRate(Float occupancyRate) {
                this.occupancyRate = occupancyRate;
                return this;
            }

            /**
             * <p>The satisfaction index, which is the average value of the satisfaction rating digits.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder satisfactionIndex(Float satisfactionIndex) {
                this.satisfactionIndex = satisfactionIndex;
                return this;
            }

            /**
             * <p>The satisfaction rate. Calculation formula: Number of satisfied ratings / Number of satisfaction survey responses.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder satisfactionRate(Float satisfactionRate) {
                this.satisfactionRate = satisfactionRate;
                return this;
            }

            /**
             * <p>The number of satisfaction surveys offered.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder satisfactionSurveysOffered(Long satisfactionSurveysOffered) {
                this.satisfactionSurveysOffered = satisfactionSurveysOffered;
                return this;
            }

            /**
             * <p>The number of satisfaction surveys responded to.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder satisfactionSurveysResponded(Long satisfactionSurveysResponded) {
                this.satisfactionSurveysResponded = satisfactionSurveysResponded;
                return this;
            }

            /**
             * <p>The total break time in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder totalBreakTime(Long totalBreakTime) {
                this.totalBreakTime = totalBreakTime;
                return this;
            }

            /**
             * <p>The total number of calls. Formula: CallsOffered + CallsDialed.</p>
             * 
             * <strong>example:</strong>
             * <p>13</p>
             */
            public Builder totalCalls(Long totalCalls) {
                this.totalCalls = totalCalls;
                return this;
            }

            /**
             * <p>The total hold time in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalHoldTime(Long totalHoldTime) {
                this.totalHoldTime = totalHoldTime;
                return this;
            }

            /**
             * <p>The total logged-in time in seconds.
             * <em>Note: Excludes offline and break time.</em></p>
             * 
             * <strong>example:</strong>
             * <p>23218</p>
             */
            public Builder totalLoggedInTime(Long totalLoggedInTime) {
                this.totalLoggedInTime = totalLoggedInTime;
                return this;
            }

            /**
             * <p>The total ready time in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>22428</p>
             */
            public Builder totalReadyTime(Long totalReadyTime) {
                this.totalReadyTime = totalReadyTime;
                return this;
            }

            /**
             * <p>The total talk time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>449</p>
             */
            public Builder totalTalkTime(Long totalTalkTime) {
                this.totalTalkTime = totalTalkTime;
                return this;
            }

            /**
             * <p>The total after-call work time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>94</p>
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
     * {@link ListHistoricalSkillGroupReportResponseBody} extends {@link TeaModel}
     *
     * <p>ListHistoricalSkillGroupReportResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Back2Back")
        private Back2Back back2Back;

        @com.aliyun.core.annotation.NameInMap("Inbound")
        private Inbound inbound;

        @com.aliyun.core.annotation.NameInMap("Outbound")
        private Outbound outbound;

        @com.aliyun.core.annotation.NameInMap("Overall")
        private Overall overall;

        @com.aliyun.core.annotation.NameInMap("SkillGroupId")
        private String skillGroupId;

        @com.aliyun.core.annotation.NameInMap("SkillGroupName")
        private String skillGroupName;

        private List(Builder builder) {
            this.back2Back = builder.back2Back;
            this.inbound = builder.inbound;
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
            private Back2Back back2Back; 
            private Inbound inbound; 
            private Outbound outbound; 
            private Overall overall; 
            private String skillGroupId; 
            private String skillGroupName; 

            private Builder() {
            } 

            private Builder(List model) {
                this.back2Back = model.back2Back;
                this.inbound = model.inbound;
                this.outbound = model.outbound;
                this.overall = model.overall;
                this.skillGroupId = model.skillGroupId;
                this.skillGroupName = model.skillGroupName;
            } 

            /**
             * <p>The back-to-back call metrics.</p>
             */
            public Builder back2Back(Back2Back back2Back) {
                this.back2Back = back2Back;
                return this;
            }

            /**
             * <p>The inbound call metrics.</p>
             */
            public Builder inbound(Inbound inbound) {
                this.inbound = inbound;
                return this;
            }

            /**
             * <p>The outbound metrics.</p>
             */
            public Builder outbound(Outbound outbound) {
                this.outbound = outbound;
                return this;
            }

            /**
             * <p>The overall metrics.</p>
             */
            public Builder overall(Overall overall) {
                this.overall = overall;
                return this;
            }

            /**
             * <p>The skill group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>skillgroup@ccc-test</p>
             */
            public Builder skillGroupId(String skillGroupId) {
                this.skillGroupId = skillGroupId;
                return this;
            }

            /**
             * <p>The skill group name.</p>
             * 
             * <strong>example:</strong>
             * <p>skillgroup</p>
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
     * {@link ListHistoricalSkillGroupReportResponseBody} extends {@link TeaModel}
     *
     * <p>ListHistoricalSkillGroupReportResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

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
        public java.util.List<List> getList() {
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
            private java.util.List<List> list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The list of historical data for the skill group.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The page number. Valid values: 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page. Valid values: 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total count.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
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
