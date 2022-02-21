// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateAgentStatisticReportResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateAgentStatisticReportResponseBody</p>
 */
public class GenerateAgentStatisticReportResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("DataList")
    private DataList dataList;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GenerateAgentStatisticReportResponseBody(Builder builder) {
        this.code = builder.code;
        this.dataList = builder.dataList;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateAgentStatisticReportResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return dataList
     */
    public DataList getDataList() {
        return this.dataList;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private DataList dataList; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DataList.
         */
        public Builder dataList(DataList dataList) {
            this.dataList = dataList;
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GenerateAgentStatisticReportResponseBody build() {
            return new GenerateAgentStatisticReportResponseBody(this);
        } 

    } 

    public static class Inbound extends TeaModel {
        @NameInMap("AverageHoldTime")
        private Long averageHoldTime;

        @NameInMap("AverageRingTime")
        private Long averageRingTime;

        @NameInMap("AverageTalkTime")
        private Long averageTalkTime;

        @NameInMap("AverageWorkTime")
        private Long averageWorkTime;

        @NameInMap("CallsHandled")
        private Long callsHandled;

        @NameInMap("CallsOffered")
        private Long callsOffered;

        @NameInMap("HandleRate")
        private Float handleRate;

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

        @NameInMap("SatisfactionSurveysOffered")
        private Long satisfactionSurveysOffered;

        @NameInMap("SatisfactionSurveysResponded")
        private Long satisfactionSurveysResponded;

        @NameInMap("TotalHoldTime")
        private Long totalHoldTime;

        @NameInMap("TotalRingTime")
        private Long totalRingTime;

        @NameInMap("TotalTalkTime")
        private Long totalTalkTime;

        @NameInMap("TotalWorkTime")
        private Long totalWorkTime;

        private Inbound(Builder builder) {
            this.averageHoldTime = builder.averageHoldTime;
            this.averageRingTime = builder.averageRingTime;
            this.averageTalkTime = builder.averageTalkTime;
            this.averageWorkTime = builder.averageWorkTime;
            this.callsHandled = builder.callsHandled;
            this.callsOffered = builder.callsOffered;
            this.handleRate = builder.handleRate;
            this.maxHoldTime = builder.maxHoldTime;
            this.maxRingTime = builder.maxRingTime;
            this.maxTalkTime = builder.maxTalkTime;
            this.maxWorkTime = builder.maxWorkTime;
            this.satisfactionIndex = builder.satisfactionIndex;
            this.satisfactionSurveysOffered = builder.satisfactionSurveysOffered;
            this.satisfactionSurveysResponded = builder.satisfactionSurveysResponded;
            this.totalHoldTime = builder.totalHoldTime;
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
         * @return averageHoldTime
         */
        public Long getAverageHoldTime() {
            return this.averageHoldTime;
        }

        /**
         * @return averageRingTime
         */
        public Long getAverageRingTime() {
            return this.averageRingTime;
        }

        /**
         * @return averageTalkTime
         */
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        /**
         * @return averageWorkTime
         */
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
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
            private Long averageHoldTime; 
            private Long averageRingTime; 
            private Long averageTalkTime; 
            private Long averageWorkTime; 
            private Long callsHandled; 
            private Long callsOffered; 
            private Float handleRate; 
            private Long maxHoldTime; 
            private Long maxRingTime; 
            private Long maxTalkTime; 
            private Long maxWorkTime; 
            private Float satisfactionIndex; 
            private Long satisfactionSurveysOffered; 
            private Long satisfactionSurveysResponded; 
            private Long totalHoldTime; 
            private Long totalRingTime; 
            private Long totalTalkTime; 
            private Long totalWorkTime; 

            /**
             * AverageHoldTime.
             */
            public Builder averageHoldTime(Long averageHoldTime) {
                this.averageHoldTime = averageHoldTime;
                return this;
            }

            /**
             * AverageRingTime.
             */
            public Builder averageRingTime(Long averageRingTime) {
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
             * AverageWorkTime.
             */
            public Builder averageWorkTime(Long averageWorkTime) {
                this.averageWorkTime = averageWorkTime;
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
    public static class Outbound extends TeaModel {
        @NameInMap("AnswerRate")
        private Float answerRate;

        @NameInMap("AverageDialingTime")
        private Long averageDialingTime;

        @NameInMap("AverageHoldTime")
        private Long averageHoldTime;

        @NameInMap("AverageTalkTime")
        private Long averageTalkTime;

        @NameInMap("AverageWorkTime")
        private Long averageWorkTime;

        @NameInMap("CallsAnswered")
        private Long callsAnswered;

        @NameInMap("CallsDialed")
        private Long callsDialed;

        @NameInMap("MaxDialingTime")
        private Long maxDialingTime;

        @NameInMap("MaxHoldTime")
        private Long maxHoldTime;

        @NameInMap("MaxTalkTime")
        private Long maxTalkTime;

        @NameInMap("MaxWorkTime")
        private Long maxWorkTime;

        @NameInMap("SatisfactionIndex")
        private Float satisfactionIndex;

        @NameInMap("SatisfactionSurveysOffered")
        private Long satisfactionSurveysOffered;

        @NameInMap("SatisfactionSurveysResponded")
        private Long satisfactionSurveysResponded;

        @NameInMap("TotalDialingTime")
        private Long totalDialingTime;

        @NameInMap("TotalHoldTime")
        private Long totalHoldTime;

        @NameInMap("TotalTalkTime")
        private Long totalTalkTime;

        @NameInMap("TotalWorkTime")
        private Long totalWorkTime;

        private Outbound(Builder builder) {
            this.answerRate = builder.answerRate;
            this.averageDialingTime = builder.averageDialingTime;
            this.averageHoldTime = builder.averageHoldTime;
            this.averageTalkTime = builder.averageTalkTime;
            this.averageWorkTime = builder.averageWorkTime;
            this.callsAnswered = builder.callsAnswered;
            this.callsDialed = builder.callsDialed;
            this.maxDialingTime = builder.maxDialingTime;
            this.maxHoldTime = builder.maxHoldTime;
            this.maxTalkTime = builder.maxTalkTime;
            this.maxWorkTime = builder.maxWorkTime;
            this.satisfactionIndex = builder.satisfactionIndex;
            this.satisfactionSurveysOffered = builder.satisfactionSurveysOffered;
            this.satisfactionSurveysResponded = builder.satisfactionSurveysResponded;
            this.totalDialingTime = builder.totalDialingTime;
            this.totalHoldTime = builder.totalHoldTime;
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
        public Long getAverageDialingTime() {
            return this.averageDialingTime;
        }

        /**
         * @return averageHoldTime
         */
        public Long getAverageHoldTime() {
            return this.averageHoldTime;
        }

        /**
         * @return averageTalkTime
         */
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        /**
         * @return averageWorkTime
         */
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
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
            private Long averageDialingTime; 
            private Long averageHoldTime; 
            private Long averageTalkTime; 
            private Long averageWorkTime; 
            private Long callsAnswered; 
            private Long callsDialed; 
            private Long maxDialingTime; 
            private Long maxHoldTime; 
            private Long maxTalkTime; 
            private Long maxWorkTime; 
            private Float satisfactionIndex; 
            private Long satisfactionSurveysOffered; 
            private Long satisfactionSurveysResponded; 
            private Long totalDialingTime; 
            private Long totalHoldTime; 
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
            public Builder averageDialingTime(Long averageDialingTime) {
                this.averageDialingTime = averageDialingTime;
                return this;
            }

            /**
             * AverageHoldTime.
             */
            public Builder averageHoldTime(Long averageHoldTime) {
                this.averageHoldTime = averageHoldTime;
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
             * AverageWorkTime.
             */
            public Builder averageWorkTime(Long averageWorkTime) {
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
             * CallsDialed.
             */
            public Builder callsDialed(Long callsDialed) {
                this.callsDialed = callsDialed;
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
        @NameInMap("AverageHoldTime")
        private Long averageHoldTime;

        @NameInMap("AverageTalkTime")
        private Long averageTalkTime;

        @NameInMap("AverageWorkTime")
        private Long averageWorkTime;

        @NameInMap("MaxHoldTime")
        private Long maxHoldTime;

        @NameInMap("MaxTalkTime")
        private Long maxTalkTime;

        @NameInMap("MaxWorkTime")
        private Long maxWorkTime;

        @NameInMap("SatisfactionIndex")
        private Float satisfactionIndex;

        @NameInMap("SatisfactionSurveysOffered")
        private Long satisfactionSurveysOffered;

        @NameInMap("SatisfactionSurveysResponded")
        private Long satisfactionSurveysResponded;

        @NameInMap("TotalCalls")
        private Long totalCalls;

        @NameInMap("TotalHoldTime")
        private Long totalHoldTime;

        @NameInMap("TotalTalkTime")
        private Long totalTalkTime;

        @NameInMap("TotalWorkTime")
        private Long totalWorkTime;

        private Overall(Builder builder) {
            this.averageHoldTime = builder.averageHoldTime;
            this.averageTalkTime = builder.averageTalkTime;
            this.averageWorkTime = builder.averageWorkTime;
            this.maxHoldTime = builder.maxHoldTime;
            this.maxTalkTime = builder.maxTalkTime;
            this.maxWorkTime = builder.maxWorkTime;
            this.satisfactionIndex = builder.satisfactionIndex;
            this.satisfactionSurveysOffered = builder.satisfactionSurveysOffered;
            this.satisfactionSurveysResponded = builder.satisfactionSurveysResponded;
            this.totalCalls = builder.totalCalls;
            this.totalHoldTime = builder.totalHoldTime;
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
         * @return averageHoldTime
         */
        public Long getAverageHoldTime() {
            return this.averageHoldTime;
        }

        /**
         * @return averageTalkTime
         */
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        /**
         * @return averageWorkTime
         */
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        /**
         * @return maxHoldTime
         */
        public Long getMaxHoldTime() {
            return this.maxHoldTime;
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
            private Long averageHoldTime; 
            private Long averageTalkTime; 
            private Long averageWorkTime; 
            private Long maxHoldTime; 
            private Long maxTalkTime; 
            private Long maxWorkTime; 
            private Float satisfactionIndex; 
            private Long satisfactionSurveysOffered; 
            private Long satisfactionSurveysResponded; 
            private Long totalCalls; 
            private Long totalHoldTime; 
            private Long totalTalkTime; 
            private Long totalWorkTime; 

            /**
             * AverageHoldTime.
             */
            public Builder averageHoldTime(Long averageHoldTime) {
                this.averageHoldTime = averageHoldTime;
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
             * AverageWorkTime.
             */
            public Builder averageWorkTime(Long averageWorkTime) {
                this.averageWorkTime = averageWorkTime;
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
    public static class GenerateAgentStatistic extends TeaModel {
        @NameInMap("AgentId")
        private String agentId;

        @NameInMap("AgentName")
        private String agentName;

        @NameInMap("AverageReadyTime")
        private Long averageReadyTime;

        @NameInMap("Inbound")
        private Inbound inbound;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("LoginName")
        private String loginName;

        @NameInMap("MaxReadyTime")
        private Long maxReadyTime;

        @NameInMap("OccupancyRate")
        private Float occupancyRate;

        @NameInMap("Outbound")
        private Outbound outbound;

        @NameInMap("Overall")
        private Overall overall;

        @NameInMap("RecordDate")
        private String recordDate;

        @NameInMap("SkillGroupIds")
        private String skillGroupIds;

        @NameInMap("SkillGroupNames")
        private String skillGroupNames;

        @NameInMap("TotalBreakTime")
        private Long totalBreakTime;

        @NameInMap("TotalLoggedInTime")
        private Long totalLoggedInTime;

        @NameInMap("TotalReadyTime")
        private Long totalReadyTime;

        private GenerateAgentStatistic(Builder builder) {
            this.agentId = builder.agentId;
            this.agentName = builder.agentName;
            this.averageReadyTime = builder.averageReadyTime;
            this.inbound = builder.inbound;
            this.instanceId = builder.instanceId;
            this.loginName = builder.loginName;
            this.maxReadyTime = builder.maxReadyTime;
            this.occupancyRate = builder.occupancyRate;
            this.outbound = builder.outbound;
            this.overall = builder.overall;
            this.recordDate = builder.recordDate;
            this.skillGroupIds = builder.skillGroupIds;
            this.skillGroupNames = builder.skillGroupNames;
            this.totalBreakTime = builder.totalBreakTime;
            this.totalLoggedInTime = builder.totalLoggedInTime;
            this.totalReadyTime = builder.totalReadyTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GenerateAgentStatistic create() {
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
         * @return averageReadyTime
         */
        public Long getAverageReadyTime() {
            return this.averageReadyTime;
        }

        /**
         * @return inbound
         */
        public Inbound getInbound() {
            return this.inbound;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return loginName
         */
        public String getLoginName() {
            return this.loginName;
        }

        /**
         * @return maxReadyTime
         */
        public Long getMaxReadyTime() {
            return this.maxReadyTime;
        }

        /**
         * @return occupancyRate
         */
        public Float getOccupancyRate() {
            return this.occupancyRate;
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
         * @return recordDate
         */
        public String getRecordDate() {
            return this.recordDate;
        }

        /**
         * @return skillGroupIds
         */
        public String getSkillGroupIds() {
            return this.skillGroupIds;
        }

        /**
         * @return skillGroupNames
         */
        public String getSkillGroupNames() {
            return this.skillGroupNames;
        }

        /**
         * @return totalBreakTime
         */
        public Long getTotalBreakTime() {
            return this.totalBreakTime;
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

        public static final class Builder {
            private String agentId; 
            private String agentName; 
            private Long averageReadyTime; 
            private Inbound inbound; 
            private String instanceId; 
            private String loginName; 
            private Long maxReadyTime; 
            private Float occupancyRate; 
            private Outbound outbound; 
            private Overall overall; 
            private String recordDate; 
            private String skillGroupIds; 
            private String skillGroupNames; 
            private Long totalBreakTime; 
            private Long totalLoggedInTime; 
            private Long totalReadyTime; 

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
             * AverageReadyTime.
             */
            public Builder averageReadyTime(Long averageReadyTime) {
                this.averageReadyTime = averageReadyTime;
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
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * LoginName.
             */
            public Builder loginName(String loginName) {
                this.loginName = loginName;
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
             * OccupancyRate.
             */
            public Builder occupancyRate(Float occupancyRate) {
                this.occupancyRate = occupancyRate;
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
             * RecordDate.
             */
            public Builder recordDate(String recordDate) {
                this.recordDate = recordDate;
                return this;
            }

            /**
             * SkillGroupIds.
             */
            public Builder skillGroupIds(String skillGroupIds) {
                this.skillGroupIds = skillGroupIds;
                return this;
            }

            /**
             * SkillGroupNames.
             */
            public Builder skillGroupNames(String skillGroupNames) {
                this.skillGroupNames = skillGroupNames;
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

            public GenerateAgentStatistic build() {
                return new GenerateAgentStatistic(this);
            } 

        } 

    }
    public static class List extends TeaModel {
        @NameInMap("GenerateAgentStatistic")
        private java.util.List < GenerateAgentStatistic> generateAgentStatistic;

        private List(Builder builder) {
            this.generateAgentStatistic = builder.generateAgentStatistic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return generateAgentStatistic
         */
        public java.util.List < GenerateAgentStatistic> getGenerateAgentStatistic() {
            return this.generateAgentStatistic;
        }

        public static final class Builder {
            private java.util.List < GenerateAgentStatistic> generateAgentStatistic; 

            /**
             * GenerateAgentStatistic.
             */
            public Builder generateAgentStatistic(java.util.List < GenerateAgentStatistic> generateAgentStatistic) {
                this.generateAgentStatistic = generateAgentStatistic;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class DataList extends TeaModel {
        @NameInMap("List")
        private List list;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private DataList(Builder builder) {
            this.list = builder.list;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public List getList() {
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
            private List list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * List.
             */
            public Builder list(List list) {
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

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
}
