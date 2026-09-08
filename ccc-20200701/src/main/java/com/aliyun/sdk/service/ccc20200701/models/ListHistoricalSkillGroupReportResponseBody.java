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
         * <p>Data.</p>
         */
        public Builder data(Data data) {
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
             * <p>Answer rate. Calculation Formula: CallsAnswered / CallsDialed. (Because acknowledgement events and answer events may fall into different time ranges, the result may exceed 100% in certain cases.)</p>
             * 
             * <strong>example:</strong>
             * <p>0.6</p>
             */
            public Builder answerRate(Float answerRate) {
                this.answerRate = answerRate;
                return this;
            }

            /**
             * <p>Average customer-side ring time, in seconds.</p>
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
             * <p>Number of calls answered by the customer.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
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
             * <p>0.8</p>
             */
            public Builder customerAnswerRate(Float customerAnswerRate) {
                this.customerAnswerRate = customerAnswerRate;
                return this;
            }

            /**
             * <p>Maximum Customer-side ring time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder maxCustomerRingTime(Long maxCustomerRingTime) {
                this.maxCustomerRingTime = maxCustomerRingTime;
                return this;
            }

            /**
             * <p>Maximum ring time, in seconds.</p>
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
             * <p>Total Customer-side ring time, in seconds.</p>
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
             * <p>Quantity of assigned sessions.</p>
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
             * <p>Abandon rate. Calculation Formula: CallsAbandoned / CallsOffered (Because abandonment events and assignment events may fall into different time ranges, the result may exceed 100% in certain cases).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder abandonRate(Float abandonRate) {
                this.abandonRate = abandonRate;
                return this;
            }

            /**
             * <p>Statistics for each channel.</p>
             */
            public Builder accessChannelTypeDetails(java.util.List<AccessChannelTypeDetails> accessChannelTypeDetails) {
                this.accessChannelTypeDetails = accessChannelTypeDetails;
                return this;
            }

            /**
             * <p>Average abandonment duration, in seconds. Calculation Formula: TotalAbandonTime / CallsAbandoned.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder averageAbandonTime(Float averageAbandonTime) {
                this.averageAbandonTime = averageAbandonTime;
                return this;
            }

            /**
             * <p>Average queue abandonment duration, in seconds. Calculation Formula: TotalAbandonedInQueueTime / CallsAbandonedInQueue.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder averageAbandonedInQueueTime(Float averageAbandonedInQueueTime) {
                this.averageAbandonedInQueueTime = averageAbandonedInQueueTime;
                return this;
            }

            /**
             * <p>Average ringing abandonment duration, in seconds. Calculation Formula: TotalAbandonedInRingTime / CallsAbandonedInRing.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder averageAbandonedInRingTime(Float averageAbandonedInRingTime) {
                this.averageAbandonedInRingTime = averageAbandonedInRingTime;
                return this;
            }

            /**
             * <p>Average first response time for chat sessions, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder averageFirstResponseTime(Float averageFirstResponseTime) {
                this.averageFirstResponseTime = averageFirstResponseTime;
                return this;
            }

            /**
             * <p>Average call hold duration, in seconds. Calculation Formula: TotalHoldTime / CallsHold.</p>
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
             * <p>8</p>
             */
            public Builder averageResponseTime(Float averageResponseTime) {
                this.averageResponseTime = averageResponseTime;
                return this;
            }

            /**
             * <p>Average ring time, in seconds. Calculation Formula: TotalRingTime / CallsRinged.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder averageRingTime(Float averageRingTime) {
                this.averageRingTime = averageRingTime;
                return this;
            }

            /**
             * <p>Average talk time, in seconds. Calculation Formula: TotalTalkTime / CallsHandled.</p>
             * 
             * <strong>example:</strong>
             * <p>64</p>
             */
            public Builder averageTalkTime(Float averageTalkTime) {
                this.averageTalkTime = averageTalkTime;
                return this;
            }

            /**
             * <p>Average wait time, which is the average duration a caller waits before an agent answers the call. Calculation Formula: TotalWaitTime / CallsHandled.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder averageWaitTime(Float averageWaitTime) {
                this.averageWaitTime = averageWaitTime;
                return this;
            }

            /**
             * <p>Average post-processing duration, in seconds. Calculation Formula: TotalWorkTime / CallsHandled.</p>
             * 
             * <strong>example:</strong>
             * <p>13</p>
             */
            public Builder averageWorkTime(Float averageWorkTime) {
                this.averageWorkTime = averageWorkTime;
                return this;
            }

            /**
             * <p>Quantity of abandoned calls. Calculation Formula: CallsAbandonedInQueue + CallsAbandonedInRing.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsAbandoned(Long callsAbandoned) {
                this.callsAbandoned = callsAbandoned;
                return this;
            }

            /**
             * <p>Number of calls abandoned in queue, which refers to the number of calls where the customer hung up after entering the queue but before being answered.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsAbandonedInQueue(Long callsAbandonedInQueue) {
                this.callsAbandonedInQueue = callsAbandonedInQueue;
                return this;
            }

            /**
             * <p>Ring abandonment count, which is the number of calls where the customer hung up while the agent\&quot;s phone was ringing.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsAbandonedInRing(Long callsAbandonedInRing) {
                this.callsAbandonedInRing = callsAbandonedInRing;
                return this;
            }

            /**
             * <p>Transfer-in volume, which refers to the number of calls transferred to this skill group from other skill groups. Transfers between agents within the same skill group are not counted. If an agent is signed into multiple skill groups simultaneously, the call is attributed to the first skill group the agent signed into. If a single call is transferred multiple times from other skill groups to this skill group, each transfer is counted separately. The same rule applies below.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsAttendedTransferIn(Long callsAttendedTransferIn) {
                this.callsAttendedTransferIn = callsAttendedTransferIn;
                return this;
            }

            /**
             * <p>Quantity of attended transfer-out calls, which refers to the number of calls transferred from this skill group to another skill group via consultation. Transfers between agents within the same skill group are not counted.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsAttendedTransferOut(Long callsAttendedTransferOut) {
                this.callsAttendedTransferOut = callsAttendedTransferOut;
                return this;
            }

            /**
             * <p>Number of blind transfer-in calls, which refers to the number of calls directly transferred to this skill group from other skill groups. Transfers between agents within the same skill group are not counted. If an agent is signed into multiple skill groups simultaneously, the call is attributed to the first skill group the agent signed into. If a single call is transferred multiple times from other skill groups to this skill group, each transfer is counted separately. The same rule applies below.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsBlindTransferIn(Long callsBlindTransferIn) {
                this.callsBlindTransferIn = callsBlindTransferIn;
                return this;
            }

            /**
             * <p>Number of blind transfer-out calls, which refers to the number of calls directly transferred from this skill group to another skill group. Transfers between agents within the same skill group are not counted.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsBlindTransferOut(Long callsBlindTransferOut) {
                this.callsBlindTransferOut = callsBlindTransferOut;
                return this;
            }

            /**
             * <p>Acknowledgement count, which is the number of times agents answered calls. For a single call that enters a queue multiple times, if it is answered by multiple agents after one queue entry, it is counted as one.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder callsHandled(Long callsHandled) {
                this.callsHandled = callsHandled;
                return this;
            }

            /**
             * <p>Hold count, which is the number of times calls were placed on hold. Each time a call enters the queue and experiences multiple holds, it counts as one.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsHold(Long callsHold) {
                this.callsHold = callsHold;
                return this;
            }

            /**
             * <p>Assigned call volume, which is the number of calls assigned to this skill group, including calls assigned through queues and calls assigned via transfers (consultation transfers and direct transfers). Calculation Formula: CallsQueued + CallsBlindTransferIn + CallsAttendedTransferIn.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder callsOffered(Long callsOffered) {
                this.callsOffered = callsOffered;
                return this;
            }

            /**
             * <p>Overflow count, which is the number of calls that experienced queue (skill group) overflow. If a single call enters the same queue multiple times, each overflow is counted separately.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsOverflow(Long callsOverflow) {
                this.callsOverflow = callsOverflow;
                return this;
            }

            /**
             * <p>Number of inbound calls entering a queue (skill group). If a single call enters the same queue multiple times, each entry is counted separately.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder callsQueued(Long callsQueued) {
                this.callsQueued = callsQueued;
                return this;
            }

            /**
             * <p>Queue Failure Quantity, which is the number of calls where the customer hung up after entering the queue but before being answered.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsQueuingFailed(Long callsQueuingFailed) {
                this.callsQueuingFailed = callsQueuingFailed;
                return this;
            }

            /**
             * <p>Quantity of calls that overflowed from the queue. Queue overflow refers to calls that overflow while queuing in IVR.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsQueuingOverflow(Long callsQueuingOverflow) {
                this.callsQueuingOverflow = callsQueuingOverflow;
                return this;
            }

            /**
             * <p>Number of calls that timed out during the queuing phase.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsQueuingTimeout(Long callsQueuingTimeout) {
                this.callsQueuingTimeout = callsQueuingTimeout;
                return this;
            }

            /**
             * <p>Number of calls that rang to agents. Each time a call enters the queue and is assigned to multiple agents, resulting in ringing, it counts as one.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder callsRinged(Long callsRinged) {
                this.callsRinged = callsRinged;
                return this;
            }

            /**
             * <p>Timeout count, which is the number of calls that experienced queue (skill group) timeout. If a single call enters the same queue multiple times, each timeout is counted separately.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsTimeout(Long callsTimeout) {
                this.callsTimeout = callsTimeout;
                return this;
            }

            /**
             * <p>Acknowledgement rate. Calculation Formula: CallsHandled / CallsOffered (because acknowledgement events and assign events may fall into different time ranges, the result may exceed 100% in certain cases).</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder handleRate(Float handleRate) {
                this.handleRate = handleRate;
                return this;
            }

            /**
             * <p>Maximum abandonment duration, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxAbandonTime(Long maxAbandonTime) {
                this.maxAbandonTime = maxAbandonTime;
                return this;
            }

            /**
             * <p>Maximum queue abandonment duration, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxAbandonedInQueueTime(Long maxAbandonedInQueueTime) {
                this.maxAbandonedInQueueTime = maxAbandonedInQueueTime;
                return this;
            }

            /**
             * <p>Maximum ring abandonment duration, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxAbandonedInRingTime(Long maxAbandonedInRingTime) {
                this.maxAbandonedInRingTime = maxAbandonedInRingTime;
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
             * <p>Maximum ring duration, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder maxRingTime(Long maxRingTime) {
                this.maxRingTime = maxRingTime;
                return this;
            }

            /**
             * <p>Maximum talk duration, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxTalkTime(Long maxTalkTime) {
                this.maxTalkTime = maxTalkTime;
                return this;
            }

            /**
             * <p>Maximum wait time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>13</p>
             */
            public Builder maxWaitTime(Long maxWaitTime) {
                this.maxWaitTime = maxWaitTime;
                return this;
            }

            /**
             * <p>Maximum post-processing duration, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder maxWorkTime(Long maxWorkTime) {
                this.maxWorkTime = maxWorkTime;
                return this;
            }

            /**
             * <p>Satisfaction index, which is the average of the satisfaction keypress digits (single-digit numbers).</p>
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
             * <p>Service level within 15 seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0.7</p>
             */
            public Builder serviceLevel15(Float serviceLevel15) {
                this.serviceLevel15 = serviceLevel15;
                return this;
            }

            /**
             * <p>Service level within 20 seconds: number of calls with wait time less than or equal to 20 seconds divided by CallsQueued.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder serviceLevel20(Float serviceLevel20) {
                this.serviceLevel20 = serviceLevel20;
                return this;
            }

            /**
             * <p>Service level within 30 seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0.9</p>
             */
            public Builder serviceLevel30(Float serviceLevel30) {
                this.serviceLevel30 = serviceLevel30;
                return this;
            }

            /**
             * <p>Total abandonment duration, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalAbandonTime(Long totalAbandonTime) {
                this.totalAbandonTime = totalAbandonTime;
                return this;
            }

            /**
             * <p>Total queue abandonment duration, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalAbandonedInQueueTime(Long totalAbandonedInQueueTime) {
                this.totalAbandonedInQueueTime = totalAbandonedInQueueTime;
                return this;
            }

            /**
             * <p>Total ring abandonment duration, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalAbandonedInRingTime(Long totalAbandonedInRingTime) {
                this.totalAbandonedInRingTime = totalAbandonedInRingTime;
                return this;
            }

            /**
             * <p>Total call hold duration, in seconds.</p>
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
             * <p>Total number of messages sent by agents in chat sessions.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder totalMessagesSentByAgent(Long totalMessagesSentByAgent) {
                this.totalMessagesSentByAgent = totalMessagesSentByAgent;
                return this;
            }

            /**
             * <p>Total number of messages sent by the customer in chat sessions.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder totalMessagesSentByCustomer(Long totalMessagesSentByCustomer) {
                this.totalMessagesSentByCustomer = totalMessagesSentByCustomer;
                return this;
            }

            /**
             * <p>Total ringing duration, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder totalRingTime(Long totalRingTime) {
                this.totalRingTime = totalRingTime;
                return this;
            }

            /**
             * <p>Total talk time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>447</p>
             */
            public Builder totalTalkTime(Long totalTalkTime) {
                this.totalTalkTime = totalTalkTime;
                return this;
            }

            /**
             * <p>Total waiting duration, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>34</p>
             */
            public Builder totalWaitTime(Long totalWaitTime) {
                this.totalWaitTime = totalWaitTime;
                return this;
            }

            /**
             * <p>Total post-processing time, in seconds.</p>
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
             * <p>Answer rate. Calculation Formula: CallsAnswered / CallsDialed. (Because the call answering event and the acknowledgement event may fall into different time ranges, the result may exceed 100% in certain cases.)</p>
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
             * <p>37</p>
             */
            public Builder averageDialingTime(Float averageDialingTime) {
                this.averageDialingTime = averageDialingTime;
                return this;
            }

            /**
             * <p>Average call hold duration, in seconds. Calculation Formula: TotalHoldTime / CallsHold.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder averageHoldTime(Float averageHoldTime) {
                this.averageHoldTime = averageHoldTime;
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
             * <p>Average talk time, in seconds. Calculation Formula: TotalTalkTime / CallsAnswered.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder averageTalkTime(Float averageTalkTime) {
                this.averageTalkTime = averageTalkTime;
                return this;
            }

            /**
             * <p>Average post-processing duration per call, in seconds. Calculation Formula: TotalWorkTime / CallsDialed</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder averageWorkTime(Float averageWorkTime) {
                this.averageWorkTime = averageWorkTime;
                return this;
            }

            /**
             * <p>Number of answered calls.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder callsAnswered(Long callsAnswered) {
                this.callsAnswered = callsAnswered;
                return this;
            }

            /**
             * <p>Transfer-in volume for consultation, which refers to the number of calls transferred to this skill group from other skill groups for consultation. Transfers between agents within the same skill group are not counted. If an agent joins multiple skill groups simultaneously, the call is attributed to the first skill group the agent signed into. If a single call is transferred multiple times from other skill groups to this skill group, each transfer is counted separately. The same rule applies below.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsAttendedTransferIn(Long callsAttendedTransferIn) {
                this.callsAttendedTransferIn = callsAttendedTransferIn;
                return this;
            }

            /**
             * <p>Quantity of attended transfer-out calls, which refers to the number of calls transferred from this skill group to another skill group for consultation. Transfers between agents within the same skill group are not counted.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsAttendedTransferOut(Long callsAttendedTransferOut) {
                this.callsAttendedTransferOut = callsAttendedTransferOut;
                return this;
            }

            /**
             * <p>Quantity of direct transfer-in calls, which refers to the number of calls directly transferred to this skill group from other skill groups. Transfers between agents within the same skill group are not counted. If an agent is signed into multiple skill groups simultaneously, the call is attributed to the first skill group the agent signed into. If a single call is transferred multiple times from other skill groups to this skill group, each transfer is counted separately. The same rule applies below.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsBlindTransferIn(Long callsBlindTransferIn) {
                this.callsBlindTransferIn = callsBlindTransferIn;
                return this;
            }

            /**
             * <p>Quantity of direct transfer-out calls, which refers to the number of calls directly transferred from this skill group to other skill groups. Transfers between agents within the same skill group are not counted.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsBlindTransferOut(Long callsBlindTransferOut) {
                this.callsBlindTransferOut = callsBlindTransferOut;
                return this;
            }

            /**
             * <p>Number of dialed calls.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder callsDialed(Long callsDialed) {
                this.callsDialed = callsDialed;
                return this;
            }

            /**
             * <p>Number of calls placed on hold. If a call is placed on hold multiple times before being transfer-out from the current skill group, it counts as one occurrence.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsHold(Long callsHold) {
                this.callsHold = callsHold;
                return this;
            }

            /**
             * <p>Number of calls that rang to agents. Each time a call enters the queue and is assigned to multiple agents, resulting in ringing, it counts as one occurrence.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsRinged(Long callsRinged) {
                this.callsRinged = callsRinged;
                return this;
            }

            /**
             * <p>Maximum dialing time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
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
             * <p>Maximum ring duration, in seconds.</p>
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
             * <p>Maximum post-processing duration per call, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxWorkTime(Long maxWorkTime) {
                this.maxWorkTime = maxWorkTime;
                return this;
            }

            /**
             * <p>Satisfaction index, which is the average value of the single-digit satisfaction key presses.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder satisfactionIndex(Float satisfactionIndex) {
                this.satisfactionIndex = satisfactionIndex;
                return this;
            }

            /**
             * <p>Satisfaction rate. Calculation Formula: Quantity of evaluations marked as satisfied divided by the Count of satisfaction survey responses.</p>
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
             * <p>Total dial-up duration, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>218</p>
             */
            public Builder totalDialingTime(Long totalDialingTime) {
                this.totalDialingTime = totalDialingTime;
                return this;
            }

            /**
             * <p>Total call hold duration, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalHoldTime(Long totalHoldTime) {
                this.totalHoldTime = totalHoldTime;
                return this;
            }

            /**
             * <p>Total ring duration, in seconds.</p>
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
             * <p>3</p>
             */
            public Builder totalTalkTime(Long totalTalkTime) {
                this.totalTalkTime = totalTalkTime;
                return this;
            }

            /**
             * <p>Total post-processing duration, in seconds.</p>
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
             * <p>Break type code.</p>
             * 
             * <strong>example:</strong>
             * <p>会议</p>
             */
            public Builder breakCode(String breakCode) {
                this.breakCode = breakCode;
                return this;
            }

            /**
             * <p>Number of occurrences of this break type.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>Total duration of this break type, in seconds.</p>
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
             * <p>Average break duration, in seconds. Calculation Formula: TotalBreakTime / Break Count. Break Count is a non-API statistical field.</p>
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
             * <p>Average ready time, in seconds. Calculation Formula: TotalReadyTime / Count of ready events. The count of ready events is not an API statistics field.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder averageReadyTime(Float averageReadyTime) {
                this.averageReadyTime = averageReadyTime;
                return this;
            }

            /**
             * <p>Average talk time, in seconds. Calculation formula: TotalTalkTime / (CallsAnswered + CallsHandled).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder averageTalkTime(Float averageTalkTime) {
                this.averageTalkTime = averageTalkTime;
                return this;
            }

            /**
             * <p>Average post-processing time, in seconds. Calculation Formula: TotalWorkTime / TotalCalls.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
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
             * <p>Maximum break duration, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder maxBreakTime(Long maxBreakTime) {
                this.maxBreakTime = maxBreakTime;
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
             * <p>Maximum ready time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>19328</p>
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
             * <p>Maximum post-processing duration, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder maxWorkTime(Long maxWorkTime) {
                this.maxWorkTime = maxWorkTime;
                return this;
            }

            /**
             * <p>Agent occupancy rate. Calculation formula: (TotalWorkTime + TotalTalkTime) / TotalLoggedInTime.</p>
             * 
             * <strong>example:</strong>
             * <p>0.02332222293912065</p>
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
             * <p>Satisfaction rate. Calculation Formula: Number of responses marked as satisfied / Count of satisfaction survey responses.</p>
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
             * <p>Total break time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder totalBreakTime(Long totalBreakTime) {
                this.totalBreakTime = totalBreakTime;
                return this;
            }

            /**
             * <p>Total call volume. Calculation Formula: CallsOffered + CallsDialed.</p>
             * 
             * <strong>example:</strong>
             * <p>13</p>
             */
            public Builder totalCalls(Long totalCalls) {
                this.totalCalls = totalCalls;
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
             * <p>Total logon time, in seconds.<br><em>Note: Excludes offline and short break durations.</em></p>
             * 
             * <strong>example:</strong>
             * <p>23218</p>
             */
            public Builder totalLoggedInTime(Long totalLoggedInTime) {
                this.totalLoggedInTime = totalLoggedInTime;
                return this;
            }

            /**
             * <p>Total ready time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>22428</p>
             */
            public Builder totalReadyTime(Long totalReadyTime) {
                this.totalReadyTime = totalReadyTime;
                return this;
            }

            /**
             * <p>Total talk time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>449</p>
             */
            public Builder totalTalkTime(Long totalTalkTime) {
                this.totalTalkTime = totalTalkTime;
                return this;
            }

            /**
             * <p>Total post-processing duration, in seconds.</p>
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
             * <p>Back-to-back metric.</p>
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
             * <p>Skill group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>skillgroup@ccc-test</p>
             */
            public Builder skillGroupId(String skillGroupId) {
                this.skillGroupId = skillGroupId;
                return this;
            }

            /**
             * <p>Skill group name.</p>
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
             * <p>List of historical data for skill groups.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>Page number, ranging from 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>Page size, ranging from 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Total count.</p>
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
