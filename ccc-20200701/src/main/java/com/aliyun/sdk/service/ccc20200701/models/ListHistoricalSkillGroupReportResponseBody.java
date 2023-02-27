// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHistoricalSkillGroupReportResponseBody} extends {@link TeaModel}
 *
 * <p>ListHistoricalSkillGroupReportResponseBody</p>
 */
public class ListHistoricalSkillGroupReportResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
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

        public ListHistoricalSkillGroupReportResponseBody build() {
            return new ListHistoricalSkillGroupReportResponseBody(this);
        } 

    } 

    public static class Inbound extends TeaModel {
        @NameInMap("AbandonRate")
        private Float abandonRate;

        @NameInMap("AverageAbandonTime")
        private Float averageAbandonTime;

        @NameInMap("AverageAbandonedInQueueTime")
        private Float averageAbandonedInQueueTime;

        @NameInMap("AverageAbandonedInRingTime")
        private Float averageAbandonedInRingTime;

        @NameInMap("AverageHoldTime")
        private Float averageHoldTime;

        @NameInMap("AverageRingTime")
        private Float averageRingTime;

        @NameInMap("AverageTalkTime")
        private Float averageTalkTime;

        @NameInMap("AverageWaitTime")
        private Float averageWaitTime;

        @NameInMap("AverageWorkTime")
        private Float averageWorkTime;

        @NameInMap("CallsAbandoned")
        private Long callsAbandoned;

        @NameInMap("CallsAbandonedInQueue")
        private Long callsAbandonedInQueue;

        @NameInMap("CallsAbandonedInRing")
        private Long callsAbandonedInRing;

        @NameInMap("CallsAttendedTransferIn")
        private Long callsAttendedTransferIn;

        @NameInMap("CallsAttendedTransferOut")
        private Long callsAttendedTransferOut;

        @NameInMap("CallsBlindTransferIn")
        private Long callsBlindTransferIn;

        @NameInMap("CallsBlindTransferOut")
        private Long callsBlindTransferOut;

        @NameInMap("CallsHandled")
        private Long callsHandled;

        @NameInMap("CallsHold")
        private Long callsHold;

        @NameInMap("CallsOffered")
        private Long callsOffered;

        @NameInMap("CallsOverflow")
        private Long callsOverflow;

        @NameInMap("CallsQueued")
        private Long callsQueued;

        @NameInMap("CallsRinged")
        private Long callsRinged;

        @NameInMap("CallsTimeout")
        private Long callsTimeout;

        @NameInMap("HandleRate")
        private Float handleRate;

        @NameInMap("MaxAbandonTime")
        private Long maxAbandonTime;

        @NameInMap("MaxAbandonedInQueueTime")
        private Long maxAbandonedInQueueTime;

        @NameInMap("MaxAbandonedInRingTime")
        private Long maxAbandonedInRingTime;

        @NameInMap("MaxHoldTime")
        private Long maxHoldTime;

        @NameInMap("MaxRingTime")
        private Long maxRingTime;

        @NameInMap("MaxTalkTime")
        private Long maxTalkTime;

        @NameInMap("MaxWaitTime")
        private Long maxWaitTime;

        @NameInMap("MaxWorkTime")
        private Long maxWorkTime;

        @NameInMap("SatisfactionIndex")
        private Float satisfactionIndex;

        @NameInMap("SatisfactionRate")
        private Float satisfactionRate;

        @NameInMap("SatisfactionSurveysOffered")
        private Long satisfactionSurveysOffered;

        @NameInMap("SatisfactionSurveysResponded")
        private Long satisfactionSurveysResponded;

        @NameInMap("ServiceLevel20")
        private Float serviceLevel20;

        @NameInMap("TotalAbandonTime")
        private Long totalAbandonTime;

        @NameInMap("TotalAbandonedInQueueTime")
        private Long totalAbandonedInQueueTime;

        @NameInMap("TotalAbandonedInRingTime")
        private Long totalAbandonedInRingTime;

        @NameInMap("TotalHoldTime")
        private Long totalHoldTime;

        @NameInMap("TotalRingTime")
        private Long totalRingTime;

        @NameInMap("TotalTalkTime")
        private Long totalTalkTime;

        @NameInMap("TotalWaitTime")
        private Long totalWaitTime;

        @NameInMap("TotalWorkTime")
        private Long totalWorkTime;

        private Inbound(Builder builder) {
            this.abandonRate = builder.abandonRate;
            this.averageAbandonTime = builder.averageAbandonTime;
            this.averageAbandonedInQueueTime = builder.averageAbandonedInQueueTime;
            this.averageAbandonedInRingTime = builder.averageAbandonedInRingTime;
            this.averageHoldTime = builder.averageHoldTime;
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
            this.serviceLevel20 = builder.serviceLevel20;
            this.totalAbandonTime = builder.totalAbandonTime;
            this.totalAbandonedInQueueTime = builder.totalAbandonedInQueueTime;
            this.totalAbandonedInRingTime = builder.totalAbandonedInRingTime;
            this.totalHoldTime = builder.totalHoldTime;
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
         * @return serviceLevel20
         */
        public Float getServiceLevel20() {
            return this.serviceLevel20;
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
            private Float averageAbandonTime; 
            private Float averageAbandonedInQueueTime; 
            private Float averageAbandonedInRingTime; 
            private Float averageHoldTime; 
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
            private Float serviceLevel20; 
            private Long totalAbandonTime; 
            private Long totalAbandonedInQueueTime; 
            private Long totalAbandonedInRingTime; 
            private Long totalHoldTime; 
            private Long totalRingTime; 
            private Long totalTalkTime; 
            private Long totalWaitTime; 
            private Long totalWorkTime; 

            /**
             * AbandonRate.
             */
            public Builder abandonRate(Float abandonRate) {
                this.abandonRate = abandonRate;
                return this;
            }

            /**
             * AverageAbandonTime.
             */
            public Builder averageAbandonTime(Float averageAbandonTime) {
                this.averageAbandonTime = averageAbandonTime;
                return this;
            }

            /**
             * AverageAbandonedInQueueTime.
             */
            public Builder averageAbandonedInQueueTime(Float averageAbandonedInQueueTime) {
                this.averageAbandonedInQueueTime = averageAbandonedInQueueTime;
                return this;
            }

            /**
             * AverageAbandonedInRingTime.
             */
            public Builder averageAbandonedInRingTime(Float averageAbandonedInRingTime) {
                this.averageAbandonedInRingTime = averageAbandonedInRingTime;
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
             * AverageWaitTime.
             */
            public Builder averageWaitTime(Float averageWaitTime) {
                this.averageWaitTime = averageWaitTime;
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
             * CallsAbandoned.
             */
            public Builder callsAbandoned(Long callsAbandoned) {
                this.callsAbandoned = callsAbandoned;
                return this;
            }

            /**
             * CallsAbandonedInQueue.
             */
            public Builder callsAbandonedInQueue(Long callsAbandonedInQueue) {
                this.callsAbandonedInQueue = callsAbandonedInQueue;
                return this;
            }

            /**
             * CallsAbandonedInRing.
             */
            public Builder callsAbandonedInRing(Long callsAbandonedInRing) {
                this.callsAbandonedInRing = callsAbandonedInRing;
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
             * CallsOverflow.
             */
            public Builder callsOverflow(Long callsOverflow) {
                this.callsOverflow = callsOverflow;
                return this;
            }

            /**
             * CallsQueued.
             */
            public Builder callsQueued(Long callsQueued) {
                this.callsQueued = callsQueued;
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
             * CallsTimeout.
             */
            public Builder callsTimeout(Long callsTimeout) {
                this.callsTimeout = callsTimeout;
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
             * MaxAbandonTime.
             */
            public Builder maxAbandonTime(Long maxAbandonTime) {
                this.maxAbandonTime = maxAbandonTime;
                return this;
            }

            /**
             * MaxAbandonedInQueueTime.
             */
            public Builder maxAbandonedInQueueTime(Long maxAbandonedInQueueTime) {
                this.maxAbandonedInQueueTime = maxAbandonedInQueueTime;
                return this;
            }

            /**
             * MaxAbandonedInRingTime.
             */
            public Builder maxAbandonedInRingTime(Long maxAbandonedInRingTime) {
                this.maxAbandonedInRingTime = maxAbandonedInRingTime;
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
             * MaxWaitTime.
             */
            public Builder maxWaitTime(Long maxWaitTime) {
                this.maxWaitTime = maxWaitTime;
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
             * ServiceLevel20.
             */
            public Builder serviceLevel20(Float serviceLevel20) {
                this.serviceLevel20 = serviceLevel20;
                return this;
            }

            /**
             * TotalAbandonTime.
             */
            public Builder totalAbandonTime(Long totalAbandonTime) {
                this.totalAbandonTime = totalAbandonTime;
                return this;
            }

            /**
             * TotalAbandonedInQueueTime.
             */
            public Builder totalAbandonedInQueueTime(Long totalAbandonedInQueueTime) {
                this.totalAbandonedInQueueTime = totalAbandonedInQueueTime;
                return this;
            }

            /**
             * TotalAbandonedInRingTime.
             */
            public Builder totalAbandonedInRingTime(Long totalAbandonedInRingTime) {
                this.totalAbandonedInRingTime = totalAbandonedInRingTime;
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
             * TotalWaitTime.
             */
            public Builder totalWaitTime(Long totalWaitTime) {
                this.totalWaitTime = totalWaitTime;
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
    public static class Outbound extends TeaModel {
        @NameInMap("AnswerRate")
        private Float answerRate;

        @NameInMap("AverageDialingTime")
        private Float averageDialingTime;

        @NameInMap("AverageHoldTime")
        private Float averageHoldTime;

        @NameInMap("AverageRingTime")
        private Float averageRingTime;

        @NameInMap("AverageTalkTime")
        private Float averageTalkTime;

        @NameInMap("AverageWorkTime")
        private Float averageWorkTime;

        @NameInMap("CallsAnswered")
        private Long callsAnswered;

        @NameInMap("CallsAttendedTransferIn")
        private Long callsAttendedTransferIn;

        @NameInMap("CallsAttendedTransferOut")
        private Long callsAttendedTransferOut;

        @NameInMap("CallsBlindTransferIn")
        private Long callsBlindTransferIn;

        @NameInMap("CallsBlindTransferOut")
        private Long callsBlindTransferOut;

        @NameInMap("CallsDialed")
        private Long callsDialed;

        @NameInMap("CallsHold")
        private Long callsHold;

        @NameInMap("CallsRinged")
        private Long callsRinged;

        @NameInMap("MaxDialingTime")
        private Long maxDialingTime;

        @NameInMap("MaxHoldTime")
        private Long maxHoldTime;

        @NameInMap("MaxRingTime")
        private Long maxRingTime;

        @NameInMap("MaxTalkTime")
        private Long maxTalkTime;

        @NameInMap("MaxWorkTime")
        private Long maxWorkTime;

        @NameInMap("SatisfactionIndex")
        private Float satisfactionIndex;

        @NameInMap("SatisfactionRate")
        private Float satisfactionRate;

        @NameInMap("SatisfactionSurveysOffered")
        private Long satisfactionSurveysOffered;

        @NameInMap("SatisfactionSurveysResponded")
        private Long satisfactionSurveysResponded;

        @NameInMap("TotalDialingTime")
        private Long totalDialingTime;

        @NameInMap("TotalHoldTime")
        private Long totalHoldTime;

        @NameInMap("TotalRingTime")
        private Long totalRingTime;

        @NameInMap("TotalTalkTime")
        private Long totalTalkTime;

        @NameInMap("TotalWorkTime")
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
    public static class Overall extends TeaModel {
        @NameInMap("AverageBreakTime")
        private Float averageBreakTime;

        @NameInMap("AverageHoldTime")
        private Float averageHoldTime;

        @NameInMap("AverageReadyTime")
        private Float averageReadyTime;

        @NameInMap("AverageTalkTime")
        private Float averageTalkTime;

        @NameInMap("AverageWorkTime")
        private Float averageWorkTime;

        @NameInMap("MaxBreakTime")
        private Long maxBreakTime;

        @NameInMap("MaxHoldTime")
        private Long maxHoldTime;

        @NameInMap("MaxReadyTime")
        private Long maxReadyTime;

        @NameInMap("MaxTalkTime")
        private Long maxTalkTime;

        @NameInMap("MaxWorkTime")
        private Long maxWorkTime;

        @NameInMap("OccupancyRate")
        private Float occupancyRate;

        @NameInMap("SatisfactionIndex")
        private Float satisfactionIndex;

        @NameInMap("SatisfactionRate")
        private Float satisfactionRate;

        @NameInMap("SatisfactionSurveysOffered")
        private Long satisfactionSurveysOffered;

        @NameInMap("SatisfactionSurveysResponded")
        private Long satisfactionSurveysResponded;

        @NameInMap("TotalBreakTime")
        private Long totalBreakTime;

        @NameInMap("TotalCalls")
        private Long totalCalls;

        @NameInMap("TotalHoldTime")
        private Long totalHoldTime;

        @NameInMap("TotalLoggedInTime")
        private Long totalLoggedInTime;

        @NameInMap("TotalReadyTime")
        private Long totalReadyTime;

        @NameInMap("TotalTalkTime")
        private Long totalTalkTime;

        @NameInMap("TotalWorkTime")
        private Long totalWorkTime;

        private Overall(Builder builder) {
            this.averageBreakTime = builder.averageBreakTime;
            this.averageHoldTime = builder.averageHoldTime;
            this.averageReadyTime = builder.averageReadyTime;
            this.averageTalkTime = builder.averageTalkTime;
            this.averageWorkTime = builder.averageWorkTime;
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
    public static class List extends TeaModel {
        @NameInMap("Inbound")
        private Inbound inbound;

        @NameInMap("Outbound")
        private Outbound outbound;

        @NameInMap("Overall")
        private Overall overall;

        @NameInMap("SkillGroupId")
        private String skillGroupId;

        @NameInMap("SkillGroupName")
        private String skillGroupName;

        private List(Builder builder) {
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
            private Inbound inbound; 
            private Outbound outbound; 
            private Overall overall; 
            private String skillGroupId; 
            private String skillGroupName; 

            /**
             * Inbound.
             */
            public Builder inbound(Inbound inbound) {
                this.inbound = inbound;
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
    public static class Data extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
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
