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
 * {@link ListSkillGroupSummaryReportsSinceMidnightResponseBody} extends {@link TeaModel}
 *
 * <p>ListSkillGroupSummaryReportsSinceMidnightResponseBody</p>
 */
public class ListSkillGroupSummaryReportsSinceMidnightResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PagedSkillGroupSummaryReport")
    private PagedSkillGroupSummaryReport pagedSkillGroupSummaryReport;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListSkillGroupSummaryReportsSinceMidnightResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pagedSkillGroupSummaryReport = builder.pagedSkillGroupSummaryReport;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSkillGroupSummaryReportsSinceMidnightResponseBody create() {
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
     * @return pagedSkillGroupSummaryReport
     */
    public PagedSkillGroupSummaryReport getPagedSkillGroupSummaryReport() {
        return this.pagedSkillGroupSummaryReport;
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
        private Integer httpStatusCode; 
        private String message; 
        private PagedSkillGroupSummaryReport pagedSkillGroupSummaryReport; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListSkillGroupSummaryReportsSinceMidnightResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pagedSkillGroupSummaryReport = model.pagedSkillGroupSummaryReport;
            this.requestId = model.requestId;
            this.success = model.success;
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
         * <p>无</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder pagedSkillGroupSummaryReport(PagedSkillGroupSummaryReport pagedSkillGroupSummaryReport) {
            this.pagedSkillGroupSummaryReport = pagedSkillGroupSummaryReport;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2B36CEBC-6D11-5451-9E6B-C6D1927841C5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListSkillGroupSummaryReportsSinceMidnightResponseBody build() {
            return new ListSkillGroupSummaryReportsSinceMidnightResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSkillGroupSummaryReportsSinceMidnightResponseBody} extends {@link TeaModel}
     *
     * <p>ListSkillGroupSummaryReportsSinceMidnightResponseBody</p>
     */
    public static class Inbound extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AbandonedInQueueOfQueueCount")
        private Long abandonedInQueueOfQueueCount;

        @com.aliyun.core.annotation.NameInMap("AnsweredByAgentOfQueueCount")
        private Long answeredByAgentOfQueueCount;

        @com.aliyun.core.annotation.NameInMap("AnsweredByAgentOfQueueMaxWaitTimeDuration")
        private Long answeredByAgentOfQueueMaxWaitTimeDuration;

        @com.aliyun.core.annotation.NameInMap("AnsweredByAgentOfQueueWaitTimeDuration")
        private Long answeredByAgentOfQueueWaitTimeDuration;

        @com.aliyun.core.annotation.NameInMap("AverageRingTime")
        private Long averageRingTime;

        @com.aliyun.core.annotation.NameInMap("AverageTalkTime")
        private Long averageTalkTime;

        @com.aliyun.core.annotation.NameInMap("AverageWorkTime")
        private Long averageWorkTime;

        @com.aliyun.core.annotation.NameInMap("CallsAbandoned")
        private Long callsAbandoned;

        @com.aliyun.core.annotation.NameInMap("CallsAttendedTransferOut")
        private Long callsAttendedTransferOut;

        @com.aliyun.core.annotation.NameInMap("CallsBlindTransferOut")
        private Long callsBlindTransferOut;

        @com.aliyun.core.annotation.NameInMap("CallsHandled")
        private Long callsHandled;

        @com.aliyun.core.annotation.NameInMap("CallsOffered")
        private Long callsOffered;

        @com.aliyun.core.annotation.NameInMap("CallsOverflow")
        private String callsOverflow;

        @com.aliyun.core.annotation.NameInMap("CallsQueuingCanceled")
        private String callsQueuingCanceled;

        @com.aliyun.core.annotation.NameInMap("CallsQueuingFailure")
        private String callsQueuingFailure;

        @com.aliyun.core.annotation.NameInMap("CallsQueuingRerouted")
        private String callsQueuingRerouted;

        @com.aliyun.core.annotation.NameInMap("CallsQueuingTimeout")
        private Long callsQueuingTimeout;

        @com.aliyun.core.annotation.NameInMap("CallsServiceLevel10")
        private Long callsServiceLevel10;

        @com.aliyun.core.annotation.NameInMap("CallsServiceLevel20")
        private Long callsServiceLevel20;

        @com.aliyun.core.annotation.NameInMap("CallsServiceLevel30")
        private Long callsServiceLevel30;

        @com.aliyun.core.annotation.NameInMap("CallsTimeout")
        private Long callsTimeout;

        @com.aliyun.core.annotation.NameInMap("GiveUpByAgentOfQueueCount")
        private Long giveUpByAgentOfQueueCount;

        @com.aliyun.core.annotation.NameInMap("HandleRate")
        private Float handleRate;

        @com.aliyun.core.annotation.NameInMap("InComingQueueOfQueueCount")
        private Long inComingQueueOfQueueCount;

        @com.aliyun.core.annotation.NameInMap("MaxRingTime")
        private Long maxRingTime;

        @com.aliyun.core.annotation.NameInMap("MaxTalkTime")
        private String maxTalkTime;

        @com.aliyun.core.annotation.NameInMap("MaxWorkTime")
        private Long maxWorkTime;

        @com.aliyun.core.annotation.NameInMap("OverFlowInQueueOfQueueCount")
        private Long overFlowInQueueOfQueueCount;

        @com.aliyun.core.annotation.NameInMap("QueueMaxWaitTimeDuration")
        private Long queueMaxWaitTimeDuration;

        @com.aliyun.core.annotation.NameInMap("QueueWaitTimeDuration")
        private Long queueWaitTimeDuration;

        @com.aliyun.core.annotation.NameInMap("SatisfactionIndex")
        private Float satisfactionIndex;

        @com.aliyun.core.annotation.NameInMap("SatisfactionSurveysOffered")
        private Long satisfactionSurveysOffered;

        @com.aliyun.core.annotation.NameInMap("SatisfactionSurveysResponded")
        private Long satisfactionSurveysResponded;

        @com.aliyun.core.annotation.NameInMap("ServiceLevel20")
        private Float serviceLevel20;

        @com.aliyun.core.annotation.NameInMap("TotalRingTime")
        private Long totalRingTime;

        @com.aliyun.core.annotation.NameInMap("TotalTalkTime")
        private Long totalTalkTime;

        @com.aliyun.core.annotation.NameInMap("TotalWorkTime")
        private Long totalWorkTime;

        private Inbound(Builder builder) {
            this.abandonedInQueueOfQueueCount = builder.abandonedInQueueOfQueueCount;
            this.answeredByAgentOfQueueCount = builder.answeredByAgentOfQueueCount;
            this.answeredByAgentOfQueueMaxWaitTimeDuration = builder.answeredByAgentOfQueueMaxWaitTimeDuration;
            this.answeredByAgentOfQueueWaitTimeDuration = builder.answeredByAgentOfQueueWaitTimeDuration;
            this.averageRingTime = builder.averageRingTime;
            this.averageTalkTime = builder.averageTalkTime;
            this.averageWorkTime = builder.averageWorkTime;
            this.callsAbandoned = builder.callsAbandoned;
            this.callsAttendedTransferOut = builder.callsAttendedTransferOut;
            this.callsBlindTransferOut = builder.callsBlindTransferOut;
            this.callsHandled = builder.callsHandled;
            this.callsOffered = builder.callsOffered;
            this.callsOverflow = builder.callsOverflow;
            this.callsQueuingCanceled = builder.callsQueuingCanceled;
            this.callsQueuingFailure = builder.callsQueuingFailure;
            this.callsQueuingRerouted = builder.callsQueuingRerouted;
            this.callsQueuingTimeout = builder.callsQueuingTimeout;
            this.callsServiceLevel10 = builder.callsServiceLevel10;
            this.callsServiceLevel20 = builder.callsServiceLevel20;
            this.callsServiceLevel30 = builder.callsServiceLevel30;
            this.callsTimeout = builder.callsTimeout;
            this.giveUpByAgentOfQueueCount = builder.giveUpByAgentOfQueueCount;
            this.handleRate = builder.handleRate;
            this.inComingQueueOfQueueCount = builder.inComingQueueOfQueueCount;
            this.maxRingTime = builder.maxRingTime;
            this.maxTalkTime = builder.maxTalkTime;
            this.maxWorkTime = builder.maxWorkTime;
            this.overFlowInQueueOfQueueCount = builder.overFlowInQueueOfQueueCount;
            this.queueMaxWaitTimeDuration = builder.queueMaxWaitTimeDuration;
            this.queueWaitTimeDuration = builder.queueWaitTimeDuration;
            this.satisfactionIndex = builder.satisfactionIndex;
            this.satisfactionSurveysOffered = builder.satisfactionSurveysOffered;
            this.satisfactionSurveysResponded = builder.satisfactionSurveysResponded;
            this.serviceLevel20 = builder.serviceLevel20;
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
         * @return abandonedInQueueOfQueueCount
         */
        public Long getAbandonedInQueueOfQueueCount() {
            return this.abandonedInQueueOfQueueCount;
        }

        /**
         * @return answeredByAgentOfQueueCount
         */
        public Long getAnsweredByAgentOfQueueCount() {
            return this.answeredByAgentOfQueueCount;
        }

        /**
         * @return answeredByAgentOfQueueMaxWaitTimeDuration
         */
        public Long getAnsweredByAgentOfQueueMaxWaitTimeDuration() {
            return this.answeredByAgentOfQueueMaxWaitTimeDuration;
        }

        /**
         * @return answeredByAgentOfQueueWaitTimeDuration
         */
        public Long getAnsweredByAgentOfQueueWaitTimeDuration() {
            return this.answeredByAgentOfQueueWaitTimeDuration;
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
         * @return callsAbandoned
         */
        public Long getCallsAbandoned() {
            return this.callsAbandoned;
        }

        /**
         * @return callsAttendedTransferOut
         */
        public Long getCallsAttendedTransferOut() {
            return this.callsAttendedTransferOut;
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
         * @return callsOffered
         */
        public Long getCallsOffered() {
            return this.callsOffered;
        }

        /**
         * @return callsOverflow
         */
        public String getCallsOverflow() {
            return this.callsOverflow;
        }

        /**
         * @return callsQueuingCanceled
         */
        public String getCallsQueuingCanceled() {
            return this.callsQueuingCanceled;
        }

        /**
         * @return callsQueuingFailure
         */
        public String getCallsQueuingFailure() {
            return this.callsQueuingFailure;
        }

        /**
         * @return callsQueuingRerouted
         */
        public String getCallsQueuingRerouted() {
            return this.callsQueuingRerouted;
        }

        /**
         * @return callsQueuingTimeout
         */
        public Long getCallsQueuingTimeout() {
            return this.callsQueuingTimeout;
        }

        /**
         * @return callsServiceLevel10
         */
        public Long getCallsServiceLevel10() {
            return this.callsServiceLevel10;
        }

        /**
         * @return callsServiceLevel20
         */
        public Long getCallsServiceLevel20() {
            return this.callsServiceLevel20;
        }

        /**
         * @return callsServiceLevel30
         */
        public Long getCallsServiceLevel30() {
            return this.callsServiceLevel30;
        }

        /**
         * @return callsTimeout
         */
        public Long getCallsTimeout() {
            return this.callsTimeout;
        }

        /**
         * @return giveUpByAgentOfQueueCount
         */
        public Long getGiveUpByAgentOfQueueCount() {
            return this.giveUpByAgentOfQueueCount;
        }

        /**
         * @return handleRate
         */
        public Float getHandleRate() {
            return this.handleRate;
        }

        /**
         * @return inComingQueueOfQueueCount
         */
        public Long getInComingQueueOfQueueCount() {
            return this.inComingQueueOfQueueCount;
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
        public String getMaxTalkTime() {
            return this.maxTalkTime;
        }

        /**
         * @return maxWorkTime
         */
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        /**
         * @return overFlowInQueueOfQueueCount
         */
        public Long getOverFlowInQueueOfQueueCount() {
            return this.overFlowInQueueOfQueueCount;
        }

        /**
         * @return queueMaxWaitTimeDuration
         */
        public Long getQueueMaxWaitTimeDuration() {
            return this.queueMaxWaitTimeDuration;
        }

        /**
         * @return queueWaitTimeDuration
         */
        public Long getQueueWaitTimeDuration() {
            return this.queueWaitTimeDuration;
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
         * @return serviceLevel20
         */
        public Float getServiceLevel20() {
            return this.serviceLevel20;
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
            private Long abandonedInQueueOfQueueCount; 
            private Long answeredByAgentOfQueueCount; 
            private Long answeredByAgentOfQueueMaxWaitTimeDuration; 
            private Long answeredByAgentOfQueueWaitTimeDuration; 
            private Long averageRingTime; 
            private Long averageTalkTime; 
            private Long averageWorkTime; 
            private Long callsAbandoned; 
            private Long callsAttendedTransferOut; 
            private Long callsBlindTransferOut; 
            private Long callsHandled; 
            private Long callsOffered; 
            private String callsOverflow; 
            private String callsQueuingCanceled; 
            private String callsQueuingFailure; 
            private String callsQueuingRerouted; 
            private Long callsQueuingTimeout; 
            private Long callsServiceLevel10; 
            private Long callsServiceLevel20; 
            private Long callsServiceLevel30; 
            private Long callsTimeout; 
            private Long giveUpByAgentOfQueueCount; 
            private Float handleRate; 
            private Long inComingQueueOfQueueCount; 
            private Long maxRingTime; 
            private String maxTalkTime; 
            private Long maxWorkTime; 
            private Long overFlowInQueueOfQueueCount; 
            private Long queueMaxWaitTimeDuration; 
            private Long queueWaitTimeDuration; 
            private Float satisfactionIndex; 
            private Long satisfactionSurveysOffered; 
            private Long satisfactionSurveysResponded; 
            private Float serviceLevel20; 
            private Long totalRingTime; 
            private Long totalTalkTime; 
            private Long totalWorkTime; 

            private Builder() {
            } 

            private Builder(Inbound model) {
                this.abandonedInQueueOfQueueCount = model.abandonedInQueueOfQueueCount;
                this.answeredByAgentOfQueueCount = model.answeredByAgentOfQueueCount;
                this.answeredByAgentOfQueueMaxWaitTimeDuration = model.answeredByAgentOfQueueMaxWaitTimeDuration;
                this.answeredByAgentOfQueueWaitTimeDuration = model.answeredByAgentOfQueueWaitTimeDuration;
                this.averageRingTime = model.averageRingTime;
                this.averageTalkTime = model.averageTalkTime;
                this.averageWorkTime = model.averageWorkTime;
                this.callsAbandoned = model.callsAbandoned;
                this.callsAttendedTransferOut = model.callsAttendedTransferOut;
                this.callsBlindTransferOut = model.callsBlindTransferOut;
                this.callsHandled = model.callsHandled;
                this.callsOffered = model.callsOffered;
                this.callsOverflow = model.callsOverflow;
                this.callsQueuingCanceled = model.callsQueuingCanceled;
                this.callsQueuingFailure = model.callsQueuingFailure;
                this.callsQueuingRerouted = model.callsQueuingRerouted;
                this.callsQueuingTimeout = model.callsQueuingTimeout;
                this.callsServiceLevel10 = model.callsServiceLevel10;
                this.callsServiceLevel20 = model.callsServiceLevel20;
                this.callsServiceLevel30 = model.callsServiceLevel30;
                this.callsTimeout = model.callsTimeout;
                this.giveUpByAgentOfQueueCount = model.giveUpByAgentOfQueueCount;
                this.handleRate = model.handleRate;
                this.inComingQueueOfQueueCount = model.inComingQueueOfQueueCount;
                this.maxRingTime = model.maxRingTime;
                this.maxTalkTime = model.maxTalkTime;
                this.maxWorkTime = model.maxWorkTime;
                this.overFlowInQueueOfQueueCount = model.overFlowInQueueOfQueueCount;
                this.queueMaxWaitTimeDuration = model.queueMaxWaitTimeDuration;
                this.queueWaitTimeDuration = model.queueWaitTimeDuration;
                this.satisfactionIndex = model.satisfactionIndex;
                this.satisfactionSurveysOffered = model.satisfactionSurveysOffered;
                this.satisfactionSurveysResponded = model.satisfactionSurveysResponded;
                this.serviceLevel20 = model.serviceLevel20;
                this.totalRingTime = model.totalRingTime;
                this.totalTalkTime = model.totalTalkTime;
                this.totalWorkTime = model.totalWorkTime;
            } 

            /**
             * <p>The number of calls abandoned while waiting in the skill group queue.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder abandonedInQueueOfQueueCount(Long abandonedInQueueOfQueueCount) {
                this.abandonedInQueueOfQueueCount = abandonedInQueueOfQueueCount;
                return this;
            }

            /**
             * <p>The number of calls routed to the skill group and answered by an agent.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder answeredByAgentOfQueueCount(Long answeredByAgentOfQueueCount) {
                this.answeredByAgentOfQueueCount = answeredByAgentOfQueueCount;
                return this;
            }

            /**
             * <p>The maximum queue wait time for a call answered by an agent.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder answeredByAgentOfQueueMaxWaitTimeDuration(Long answeredByAgentOfQueueMaxWaitTimeDuration) {
                this.answeredByAgentOfQueueMaxWaitTimeDuration = answeredByAgentOfQueueMaxWaitTimeDuration;
                return this;
            }

            /**
             * <p>The total queue wait time for calls answered by an agent, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder answeredByAgentOfQueueWaitTimeDuration(Long answeredByAgentOfQueueWaitTimeDuration) {
                this.answeredByAgentOfQueueWaitTimeDuration = answeredByAgentOfQueueWaitTimeDuration;
                return this;
            }

            /**
             * <p>The average ring time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder averageRingTime(Long averageRingTime) {
                this.averageRingTime = averageRingTime;
                return this;
            }

            /**
             * <p>The average talk time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder averageTalkTime(Long averageTalkTime) {
                this.averageTalkTime = averageTalkTime;
                return this;
            }

            /**
             * <p>The average after-call work time, in seconds (<code>TotalWorkTime</code> / <code>CallsHandled</code>).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder averageWorkTime(Long averageWorkTime) {
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
             * <p>The number of attended transfers initiated. If a call is transferred multiple times, each transfer is counted separately.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsAttendedTransferOut(Long callsAttendedTransferOut) {
                this.callsAttendedTransferOut = callsAttendedTransferOut;
                return this;
            }

            /**
             * <p>The number of blind transfers initiated. If a call is transferred multiple times, each transfer is counted separately.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsBlindTransferOut(Long callsBlindTransferOut) {
                this.callsBlindTransferOut = callsBlindTransferOut;
                return this;
            }

            /**
             * <p>The number of handled inbound calls. Each call is counted once per queue entry, regardless of how many agents answer it.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsHandled(Long callsHandled) {
                this.callsHandled = callsHandled;
                return this;
            }

            /**
             * <p>The number of calls offered to the skill group.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsOffered(Long callsOffered) {
                this.callsOffered = callsOffered;
                return this;
            }

            /**
             * CallsOverflow.
             */
            public Builder callsOverflow(String callsOverflow) {
                this.callsOverflow = callsOverflow;
                return this;
            }

            /**
             * CallsQueuingCanceled.
             */
            public Builder callsQueuingCanceled(String callsQueuingCanceled) {
                this.callsQueuingCanceled = callsQueuingCanceled;
                return this;
            }

            /**
             * CallsQueuingFailure.
             */
            public Builder callsQueuingFailure(String callsQueuingFailure) {
                this.callsQueuingFailure = callsQueuingFailure;
                return this;
            }

            /**
             * CallsQueuingRerouted.
             */
            public Builder callsQueuingRerouted(String callsQueuingRerouted) {
                this.callsQueuingRerouted = callsQueuingRerouted;
                return this;
            }

            /**
             * CallsQueuingTimeout.
             */
            public Builder callsQueuingTimeout(Long callsQueuingTimeout) {
                this.callsQueuingTimeout = callsQueuingTimeout;
                return this;
            }

            /**
             * <p>The number of calls answered by an agent within 10 seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsServiceLevel10(Long callsServiceLevel10) {
                this.callsServiceLevel10 = callsServiceLevel10;
                return this;
            }

            /**
             * <p>The number of calls answered by an agent within 20 seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsServiceLevel20(Long callsServiceLevel20) {
                this.callsServiceLevel20 = callsServiceLevel20;
                return this;
            }

            /**
             * <p>The number of calls answered by an agent within 30 seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsServiceLevel30(Long callsServiceLevel30) {
                this.callsServiceLevel30 = callsServiceLevel30;
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
             * <p>The number of calls that were abandoned while an agent in the skill group was being alerted.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder giveUpByAgentOfQueueCount(Long giveUpByAgentOfQueueCount) {
                this.giveUpByAgentOfQueueCount = giveUpByAgentOfQueueCount;
                return this;
            }

            /**
             * <p>The handle rate (<code>CallsHandled</code> / <code>CallsOffered</code>). The value can exceed 100% because the handle and offer events might occur in different time windows.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder handleRate(Float handleRate) {
                this.handleRate = handleRate;
                return this;
            }

            /**
             * <p>The number of calls that entered the skill group queue.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder inComingQueueOfQueueCount(Long inComingQueueOfQueueCount) {
                this.inComingQueueOfQueueCount = inComingQueueOfQueueCount;
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
            public Builder maxTalkTime(String maxTalkTime) {
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
             * <p>The number of calls that overflowed from the skill group queue.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder overFlowInQueueOfQueueCount(Long overFlowInQueueOfQueueCount) {
                this.overFlowInQueueOfQueueCount = overFlowInQueueOfQueueCount;
                return this;
            }

            /**
             * <p>The maximum queue wait time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder queueMaxWaitTimeDuration(Long queueMaxWaitTimeDuration) {
                this.queueMaxWaitTimeDuration = queueMaxWaitTimeDuration;
                return this;
            }

            /**
             * <p>The queue wait time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder queueWaitTimeDuration(Long queueWaitTimeDuration) {
                this.queueWaitTimeDuration = queueWaitTimeDuration;
                return this;
            }

            /**
             * <p>The satisfaction index, calculated as the average of single-digit keypad inputs from satisfaction surveys.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder satisfactionIndex(Float satisfactionIndex) {
                this.satisfactionIndex = satisfactionIndex;
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
             * <p>The percentage of calls answered within 20 seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder serviceLevel20(Float serviceLevel20) {
                this.serviceLevel20 = serviceLevel20;
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
             * <p>The total talk time for inbound calls, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalTalkTime(Long totalTalkTime) {
                this.totalTalkTime = totalTalkTime;
                return this;
            }

            /**
             * <p>The total after-call work time, in seconds.</p>
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
     * {@link ListSkillGroupSummaryReportsSinceMidnightResponseBody} extends {@link TeaModel}
     *
     * <p>ListSkillGroupSummaryReportsSinceMidnightResponseBody</p>
     */
    public static class Outbound extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnswerRate")
        private Float answerRate;

        @com.aliyun.core.annotation.NameInMap("AverageDialingTime")
        private Long averageDialingTime;

        @com.aliyun.core.annotation.NameInMap("AverageTalkTime")
        private Long averageTalkTime;

        @com.aliyun.core.annotation.NameInMap("AverageWorkTime")
        private Long averageWorkTime;

        @com.aliyun.core.annotation.NameInMap("CallsAbandoned")
        private Long callsAbandoned;

        @com.aliyun.core.annotation.NameInMap("CallsAgentHandled")
        private Long callsAgentHandled;

        @com.aliyun.core.annotation.NameInMap("CallsAnswered")
        private Long callsAnswered;

        @com.aliyun.core.annotation.NameInMap("CallsDialed")
        private Long callsDialed;

        @com.aliyun.core.annotation.NameInMap("CallsOffered")
        private Long callsOffered;

        @com.aliyun.core.annotation.NameInMap("CallsQueuingCancelled")
        private Long callsQueuingCancelled;

        @com.aliyun.core.annotation.NameInMap("CallsQueuingFailed")
        private Long callsQueuingFailed;

        @com.aliyun.core.annotation.NameInMap("CallsQueuingFailure")
        private Long callsQueuingFailure;

        @com.aliyun.core.annotation.NameInMap("CallsQueuingOverflow")
        private Long callsQueuingOverflow;

        @com.aliyun.core.annotation.NameInMap("CallsQueuingRerouted")
        private Long callsQueuingRerouted;

        @com.aliyun.core.annotation.NameInMap("CallsQueuingTimeout")
        private Long callsQueuingTimeout;

        @com.aliyun.core.annotation.NameInMap("CallsServiceLevel30")
        private String callsServiceLevel30;

        @com.aliyun.core.annotation.NameInMap("CallsServiceLevel30V2")
        private Long callsServiceLevel30V2;

        @com.aliyun.core.annotation.NameInMap("MaxDialingTime")
        private Long maxDialingTime;

        @com.aliyun.core.annotation.NameInMap("MaxTalkTime")
        private Long maxTalkTime;

        @com.aliyun.core.annotation.NameInMap("MaxWorkTime")
        private Long maxWorkTime;

        @com.aliyun.core.annotation.NameInMap("SatisfactionIndex")
        private Float satisfactionIndex;

        @com.aliyun.core.annotation.NameInMap("SatisfactionSurveysOffered")
        private Long satisfactionSurveysOffered;

        @com.aliyun.core.annotation.NameInMap("SatisfactionSurveysResponded")
        private Long satisfactionSurveysResponded;

        @com.aliyun.core.annotation.NameInMap("TotalDialingTime")
        private Long totalDialingTime;

        @com.aliyun.core.annotation.NameInMap("TotalTalkTime")
        private Long totalTalkTime;

        @com.aliyun.core.annotation.NameInMap("TotalWaitTime")
        private Long totalWaitTime;

        @com.aliyun.core.annotation.NameInMap("TotalWorkTime")
        private Long totalWorkTime;

        private Outbound(Builder builder) {
            this.answerRate = builder.answerRate;
            this.averageDialingTime = builder.averageDialingTime;
            this.averageTalkTime = builder.averageTalkTime;
            this.averageWorkTime = builder.averageWorkTime;
            this.callsAbandoned = builder.callsAbandoned;
            this.callsAgentHandled = builder.callsAgentHandled;
            this.callsAnswered = builder.callsAnswered;
            this.callsDialed = builder.callsDialed;
            this.callsOffered = builder.callsOffered;
            this.callsQueuingCancelled = builder.callsQueuingCancelled;
            this.callsQueuingFailed = builder.callsQueuingFailed;
            this.callsQueuingFailure = builder.callsQueuingFailure;
            this.callsQueuingOverflow = builder.callsQueuingOverflow;
            this.callsQueuingRerouted = builder.callsQueuingRerouted;
            this.callsQueuingTimeout = builder.callsQueuingTimeout;
            this.callsServiceLevel30 = builder.callsServiceLevel30;
            this.callsServiceLevel30V2 = builder.callsServiceLevel30V2;
            this.maxDialingTime = builder.maxDialingTime;
            this.maxTalkTime = builder.maxTalkTime;
            this.maxWorkTime = builder.maxWorkTime;
            this.satisfactionIndex = builder.satisfactionIndex;
            this.satisfactionSurveysOffered = builder.satisfactionSurveysOffered;
            this.satisfactionSurveysResponded = builder.satisfactionSurveysResponded;
            this.totalDialingTime = builder.totalDialingTime;
            this.totalTalkTime = builder.totalTalkTime;
            this.totalWaitTime = builder.totalWaitTime;
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
         * @return callsAbandoned
         */
        public Long getCallsAbandoned() {
            return this.callsAbandoned;
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
         * @return callsDialed
         */
        public Long getCallsDialed() {
            return this.callsDialed;
        }

        /**
         * @return callsOffered
         */
        public Long getCallsOffered() {
            return this.callsOffered;
        }

        /**
         * @return callsQueuingCancelled
         */
        public Long getCallsQueuingCancelled() {
            return this.callsQueuingCancelled;
        }

        /**
         * @return callsQueuingFailed
         */
        public Long getCallsQueuingFailed() {
            return this.callsQueuingFailed;
        }

        /**
         * @return callsQueuingFailure
         */
        public Long getCallsQueuingFailure() {
            return this.callsQueuingFailure;
        }

        /**
         * @return callsQueuingOverflow
         */
        public Long getCallsQueuingOverflow() {
            return this.callsQueuingOverflow;
        }

        /**
         * @return callsQueuingRerouted
         */
        public Long getCallsQueuingRerouted() {
            return this.callsQueuingRerouted;
        }

        /**
         * @return callsQueuingTimeout
         */
        public Long getCallsQueuingTimeout() {
            return this.callsQueuingTimeout;
        }

        /**
         * @return callsServiceLevel30
         */
        public String getCallsServiceLevel30() {
            return this.callsServiceLevel30;
        }

        /**
         * @return callsServiceLevel30V2
         */
        public Long getCallsServiceLevel30V2() {
            return this.callsServiceLevel30V2;
        }

        /**
         * @return maxDialingTime
         */
        public Long getMaxDialingTime() {
            return this.maxDialingTime;
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
            private Float answerRate; 
            private Long averageDialingTime; 
            private Long averageTalkTime; 
            private Long averageWorkTime; 
            private Long callsAbandoned; 
            private Long callsAgentHandled; 
            private Long callsAnswered; 
            private Long callsDialed; 
            private Long callsOffered; 
            private Long callsQueuingCancelled; 
            private Long callsQueuingFailed; 
            private Long callsQueuingFailure; 
            private Long callsQueuingOverflow; 
            private Long callsQueuingRerouted; 
            private Long callsQueuingTimeout; 
            private String callsServiceLevel30; 
            private Long callsServiceLevel30V2; 
            private Long maxDialingTime; 
            private Long maxTalkTime; 
            private Long maxWorkTime; 
            private Float satisfactionIndex; 
            private Long satisfactionSurveysOffered; 
            private Long satisfactionSurveysResponded; 
            private Long totalDialingTime; 
            private Long totalTalkTime; 
            private Long totalWaitTime; 
            private Long totalWorkTime; 

            private Builder() {
            } 

            private Builder(Outbound model) {
                this.answerRate = model.answerRate;
                this.averageDialingTime = model.averageDialingTime;
                this.averageTalkTime = model.averageTalkTime;
                this.averageWorkTime = model.averageWorkTime;
                this.callsAbandoned = model.callsAbandoned;
                this.callsAgentHandled = model.callsAgentHandled;
                this.callsAnswered = model.callsAnswered;
                this.callsDialed = model.callsDialed;
                this.callsOffered = model.callsOffered;
                this.callsQueuingCancelled = model.callsQueuingCancelled;
                this.callsQueuingFailed = model.callsQueuingFailed;
                this.callsQueuingFailure = model.callsQueuingFailure;
                this.callsQueuingOverflow = model.callsQueuingOverflow;
                this.callsQueuingRerouted = model.callsQueuingRerouted;
                this.callsQueuingTimeout = model.callsQueuingTimeout;
                this.callsServiceLevel30 = model.callsServiceLevel30;
                this.callsServiceLevel30V2 = model.callsServiceLevel30V2;
                this.maxDialingTime = model.maxDialingTime;
                this.maxTalkTime = model.maxTalkTime;
                this.maxWorkTime = model.maxWorkTime;
                this.satisfactionIndex = model.satisfactionIndex;
                this.satisfactionSurveysOffered = model.satisfactionSurveysOffered;
                this.satisfactionSurveysResponded = model.satisfactionSurveysResponded;
                this.totalDialingTime = model.totalDialingTime;
                this.totalTalkTime = model.totalTalkTime;
                this.totalWaitTime = model.totalWaitTime;
                this.totalWorkTime = model.totalWorkTime;
            } 

            /**
             * <p>The answer rate, expressed as a percentage (%).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder answerRate(Float answerRate) {
                this.answerRate = answerRate;
                return this;
            }

            /**
             * <p>The average dialing time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder averageDialingTime(Long averageDialingTime) {
                this.averageDialingTime = averageDialingTime;
                return this;
            }

            /**
             * <p>The average talk time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder averageTalkTime(Long averageTalkTime) {
                this.averageTalkTime = averageTalkTime;
                return this;
            }

            /**
             * <p>The average after-call work time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder averageWorkTime(Long averageWorkTime) {
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
             * CallsAgentHandled.
             */
            public Builder callsAgentHandled(Long callsAgentHandled) {
                this.callsAgentHandled = callsAgentHandled;
                return this;
            }

            /**
             * <p>The number of answered outbound calls.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsAnswered(Long callsAnswered) {
                this.callsAnswered = callsAnswered;
                return this;
            }

            /**
             * <p>The number of outbound calls dialed.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsDialed(Long callsDialed) {
                this.callsDialed = callsDialed;
                return this;
            }

            /**
             * <p>The number of calls offered to the skill group.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsOffered(Long callsOffered) {
                this.callsOffered = callsOffered;
                return this;
            }

            /**
             * CallsQueuingCancelled.
             */
            public Builder callsQueuingCancelled(Long callsQueuingCancelled) {
                this.callsQueuingCancelled = callsQueuingCancelled;
                return this;
            }

            /**
             * CallsQueuingFailed.
             */
            public Builder callsQueuingFailed(Long callsQueuingFailed) {
                this.callsQueuingFailed = callsQueuingFailed;
                return this;
            }

            /**
             * CallsQueuingFailure.
             */
            public Builder callsQueuingFailure(Long callsQueuingFailure) {
                this.callsQueuingFailure = callsQueuingFailure;
                return this;
            }

            /**
             * CallsQueuingOverflow.
             */
            public Builder callsQueuingOverflow(Long callsQueuingOverflow) {
                this.callsQueuingOverflow = callsQueuingOverflow;
                return this;
            }

            /**
             * CallsQueuingRerouted.
             */
            public Builder callsQueuingRerouted(Long callsQueuingRerouted) {
                this.callsQueuingRerouted = callsQueuingRerouted;
                return this;
            }

            /**
             * CallsQueuingTimeout.
             */
            public Builder callsQueuingTimeout(Long callsQueuingTimeout) {
                this.callsQueuingTimeout = callsQueuingTimeout;
                return this;
            }

            /**
             * <p>The number of calls answered by an agent within 30 seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsServiceLevel30(String callsServiceLevel30) {
                this.callsServiceLevel30 = callsServiceLevel30;
                return this;
            }

            /**
             * CallsServiceLevel30V2.
             */
            public Builder callsServiceLevel30V2(Long callsServiceLevel30V2) {
                this.callsServiceLevel30V2 = callsServiceLevel30V2;
                return this;
            }

            /**
             * <p>The maximum dialing time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxDialingTime(Long maxDialingTime) {
                this.maxDialingTime = maxDialingTime;
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
             * <p>The satisfaction index, calculated as the average of single-digit keypad inputs from satisfaction surveys.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder satisfactionIndex(Float satisfactionIndex) {
                this.satisfactionIndex = satisfactionIndex;
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
             * <p>The total dialing time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalDialingTime(Long totalDialingTime) {
                this.totalDialingTime = totalDialingTime;
                return this;
            }

            /**
             * <p>The total talk time for outbound calls, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
             * <p>The total after-call work time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
     * {@link ListSkillGroupSummaryReportsSinceMidnightResponseBody} extends {@link TeaModel}
     *
     * <p>ListSkillGroupSummaryReportsSinceMidnightResponseBody</p>
     */
    public static class Overall extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AverageReadyTime")
        private Long averageReadyTime;

        @com.aliyun.core.annotation.NameInMap("AverageTalkTime")
        private Long averageTalkTime;

        @com.aliyun.core.annotation.NameInMap("AverageWorkTime")
        private Long averageWorkTime;

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

        @com.aliyun.core.annotation.NameInMap("SatisfactionSurveysOffered")
        private Long satisfactionSurveysOffered;

        @com.aliyun.core.annotation.NameInMap("SatisfactionSurveysResponded")
        private Long satisfactionSurveysResponded;

        @com.aliyun.core.annotation.NameInMap("TotalBreakTime")
        private Long totalBreakTime;

        @com.aliyun.core.annotation.NameInMap("TotalCalls")
        private Long totalCalls;

        @com.aliyun.core.annotation.NameInMap("TotalLoggedInTime")
        private Long totalLoggedInTime;

        @com.aliyun.core.annotation.NameInMap("TotalReadyTime")
        private Long totalReadyTime;

        @com.aliyun.core.annotation.NameInMap("TotalTalkTime")
        private Long totalTalkTime;

        @com.aliyun.core.annotation.NameInMap("TotalWorkTime")
        private Long totalWorkTime;

        private Overall(Builder builder) {
            this.averageReadyTime = builder.averageReadyTime;
            this.averageTalkTime = builder.averageTalkTime;
            this.averageWorkTime = builder.averageWorkTime;
            this.maxReadyTime = builder.maxReadyTime;
            this.maxTalkTime = builder.maxTalkTime;
            this.maxWorkTime = builder.maxWorkTime;
            this.occupancyRate = builder.occupancyRate;
            this.satisfactionIndex = builder.satisfactionIndex;
            this.satisfactionSurveysOffered = builder.satisfactionSurveysOffered;
            this.satisfactionSurveysResponded = builder.satisfactionSurveysResponded;
            this.totalBreakTime = builder.totalBreakTime;
            this.totalCalls = builder.totalCalls;
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
         * @return averageReadyTime
         */
        public Long getAverageReadyTime() {
            return this.averageReadyTime;
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
            private Long averageReadyTime; 
            private Long averageTalkTime; 
            private Long averageWorkTime; 
            private Long maxReadyTime; 
            private Long maxTalkTime; 
            private Long maxWorkTime; 
            private Float occupancyRate; 
            private Float satisfactionIndex; 
            private Long satisfactionSurveysOffered; 
            private Long satisfactionSurveysResponded; 
            private Long totalBreakTime; 
            private Long totalCalls; 
            private Long totalLoggedInTime; 
            private Long totalReadyTime; 
            private Long totalTalkTime; 
            private Long totalWorkTime; 

            private Builder() {
            } 

            private Builder(Overall model) {
                this.averageReadyTime = model.averageReadyTime;
                this.averageTalkTime = model.averageTalkTime;
                this.averageWorkTime = model.averageWorkTime;
                this.maxReadyTime = model.maxReadyTime;
                this.maxTalkTime = model.maxTalkTime;
                this.maxWorkTime = model.maxWorkTime;
                this.occupancyRate = model.occupancyRate;
                this.satisfactionIndex = model.satisfactionIndex;
                this.satisfactionSurveysOffered = model.satisfactionSurveysOffered;
                this.satisfactionSurveysResponded = model.satisfactionSurveysResponded;
                this.totalBreakTime = model.totalBreakTime;
                this.totalCalls = model.totalCalls;
                this.totalLoggedInTime = model.totalLoggedInTime;
                this.totalReadyTime = model.totalReadyTime;
                this.totalTalkTime = model.totalTalkTime;
                this.totalWorkTime = model.totalWorkTime;
            } 

            /**
             * <p>The average ready time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder averageReadyTime(Long averageReadyTime) {
                this.averageReadyTime = averageReadyTime;
                return this;
            }

            /**
             * <p>The average talk time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder averageTalkTime(Long averageTalkTime) {
                this.averageTalkTime = averageTalkTime;
                return this;
            }

            /**
             * <p>The average after-call work time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder averageWorkTime(Long averageWorkTime) {
                this.averageWorkTime = averageWorkTime;
                return this;
            }

            /**
             * <p>The maximum ready time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
             * <p>0</p>
             */
            public Builder maxWorkTime(Long maxWorkTime) {
                this.maxWorkTime = maxWorkTime;
                return this;
            }

            /**
             * <p>The agent occupancy rate, expressed as a percentage (%).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder occupancyRate(Float occupancyRate) {
                this.occupancyRate = occupancyRate;
                return this;
            }

            /**
             * <p>The satisfaction index, calculated as the average of single-digit keypad inputs from satisfaction surveys.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder satisfactionIndex(Float satisfactionIndex) {
                this.satisfactionIndex = satisfactionIndex;
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
             * <p>The total break time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalBreakTime(Long totalBreakTime) {
                this.totalBreakTime = totalBreakTime;
                return this;
            }

            /**
             * <p>The total number of calls (<code>CallsOffered</code> + <code>CallsDialed</code>).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalCalls(Long totalCalls) {
                this.totalCalls = totalCalls;
                return this;
            }

            /**
             * <p>The total logged-in time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalLoggedInTime(Long totalLoggedInTime) {
                this.totalLoggedInTime = totalLoggedInTime;
                return this;
            }

            /**
             * <p>The total ready time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalReadyTime(Long totalReadyTime) {
                this.totalReadyTime = totalReadyTime;
                return this;
            }

            /**
             * <p>The total talk time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalTalkTime(Long totalTalkTime) {
                this.totalTalkTime = totalTalkTime;
                return this;
            }

            /**
             * <p>The total after-call work time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
     * {@link ListSkillGroupSummaryReportsSinceMidnightResponseBody} extends {@link TeaModel}
     *
     * <p>ListSkillGroupSummaryReportsSinceMidnightResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Inbound")
        private Inbound inbound;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Outbound")
        private Outbound outbound;

        @com.aliyun.core.annotation.NameInMap("Overall")
        private Overall overall;

        @com.aliyun.core.annotation.NameInMap("SkillGroupId")
        private String skillGroupId;

        @com.aliyun.core.annotation.NameInMap("SkillGroupName")
        private String skillGroupName;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        private List(Builder builder) {
            this.inbound = builder.inbound;
            this.instanceId = builder.instanceId;
            this.outbound = builder.outbound;
            this.overall = builder.overall;
            this.skillGroupId = builder.skillGroupId;
            this.skillGroupName = builder.skillGroupName;
            this.timestamp = builder.timestamp;
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
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
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

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private Inbound inbound; 
            private String instanceId; 
            private Outbound outbound; 
            private Overall overall; 
            private String skillGroupId; 
            private String skillGroupName; 
            private String timestamp; 

            private Builder() {
            } 

            private Builder(List model) {
                this.inbound = model.inbound;
                this.instanceId = model.instanceId;
                this.outbound = model.outbound;
                this.overall = model.overall;
                this.skillGroupId = model.skillGroupId;
                this.skillGroupName = model.skillGroupName;
                this.timestamp = model.timestamp;
            } 

            /**
             * <p>Inbound call metrics.</p>
             */
            public Builder inbound(Inbound inbound) {
                this.inbound = inbound;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ccc-test</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Outbound call metrics.</p>
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
             * <p>The name of the skill group.</p>
             * 
             * <strong>example:</strong>
             * <p>测试技能组</p>
             */
            public Builder skillGroupName(String skillGroupName) {
                this.skillGroupName = skillGroupName;
                return this;
            }

            /**
             * <p>The timestamp when the metrics were collected.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-09-13 00:00:00</p>
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSkillGroupSummaryReportsSinceMidnightResponseBody} extends {@link TeaModel}
     *
     * <p>ListSkillGroupSummaryReportsSinceMidnightResponseBody</p>
     */
    public static class PagedSkillGroupSummaryReport extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PagedSkillGroupSummaryReport(Builder builder) {
            this.list = builder.list;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PagedSkillGroupSummaryReport create() {
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

            private Builder(PagedSkillGroupSummaryReport model) {
                this.list = model.list;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>A list of skill group summary reports.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The page number. The valid range is 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page. The valid range is 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PagedSkillGroupSummaryReport build() {
                return new PagedSkillGroupSummaryReport(this);
            } 

        } 

    }
}
