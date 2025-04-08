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
 * {@link GetHistoricalInstanceReportResponseBody} extends {@link TeaModel}
 *
 * <p>GetHistoricalInstanceReportResponseBody</p>
 */
public class GetHistoricalInstanceReportResponseBody extends TeaModel {
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

    private GetHistoricalInstanceReportResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHistoricalInstanceReportResponseBody create() {
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

        private Builder(GetHistoricalInstanceReportResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
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

        public GetHistoricalInstanceReportResponseBody build() {
            return new GetHistoricalInstanceReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetHistoricalInstanceReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetHistoricalInstanceReportResponseBody</p>
     */
    public static class AccessChannelTypeDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessChannelType")
        private String accessChannelType;

        @com.aliyun.core.annotation.NameInMap("CallsOffered")
        private Long callsOffered;

        private AccessChannelTypeDetailList(Builder builder) {
            this.accessChannelType = builder.accessChannelType;
            this.callsOffered = builder.callsOffered;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessChannelTypeDetailList create() {
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

            private Builder(AccessChannelTypeDetailList model) {
                this.accessChannelType = model.accessChannelType;
                this.callsOffered = model.callsOffered;
            } 

            /**
             * AccessChannelType.
             */
            public Builder accessChannelType(String accessChannelType) {
                this.accessChannelType = accessChannelType;
                return this;
            }

            /**
             * CallsOffered.
             */
            public Builder callsOffered(Long callsOffered) {
                this.callsOffered = callsOffered;
                return this;
            }

            public AccessChannelTypeDetailList build() {
                return new AccessChannelTypeDetailList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetHistoricalInstanceReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetHistoricalInstanceReportResponseBody</p>
     */
    public static class Inbound extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AbandonRate")
        private Float abandonRate;

        @com.aliyun.core.annotation.NameInMap("AccessChannelTypeDetailList")
        private java.util.List<AccessChannelTypeDetailList> accessChannelTypeDetailList;

        @com.aliyun.core.annotation.NameInMap("AverageAbandonTime")
        private Float averageAbandonTime;

        @com.aliyun.core.annotation.NameInMap("AverageAbandonedInIVRTime")
        private Float averageAbandonedInIVRTime;

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

        @com.aliyun.core.annotation.NameInMap("CallsAbandonedInIVR")
        private Long callsAbandonedInIVR;

        @com.aliyun.core.annotation.NameInMap("CallsAbandonedInQueue")
        private Long callsAbandonedInQueue;

        @com.aliyun.core.annotation.NameInMap("CallsAbandonedInRing")
        private Long callsAbandonedInRing;

        @com.aliyun.core.annotation.NameInMap("CallsAbandonedInVoiceNavigator")
        private Long callsAbandonedInVoiceNavigator;

        @com.aliyun.core.annotation.NameInMap("CallsAttendedTransferred")
        private Long callsAttendedTransferred;

        @com.aliyun.core.annotation.NameInMap("CallsBlindTransferred")
        private Long callsBlindTransferred;

        @com.aliyun.core.annotation.NameInMap("CallsCausedIVRException")
        private Long callsCausedIVRException;

        @com.aliyun.core.annotation.NameInMap("CallsForwardToOutsideNumber")
        private Long callsForwardToOutsideNumber;

        @com.aliyun.core.annotation.NameInMap("CallsHandled")
        private Long callsHandled;

        @com.aliyun.core.annotation.NameInMap("CallsHold")
        private Long callsHold;

        @com.aliyun.core.annotation.NameInMap("CallsIVRException")
        private Long callsIVRException;

        @com.aliyun.core.annotation.NameInMap("CallsOffered")
        private Long callsOffered;

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

        @com.aliyun.core.annotation.NameInMap("CallsToVoicemail")
        private Long callsToVoicemail;

        @com.aliyun.core.annotation.NameInMap("CallsVoicemail")
        private Long callsVoicemail;

        @com.aliyun.core.annotation.NameInMap("HandleRate")
        private Float handleRate;

        @com.aliyun.core.annotation.NameInMap("MaxAbandonTime")
        private Long maxAbandonTime;

        @com.aliyun.core.annotation.NameInMap("MaxAbandonedInIVRTime")
        private Long maxAbandonedInIVRTime;

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

        @com.aliyun.core.annotation.NameInMap("TotalAbandonedInIVRTime")
        private Long totalAbandonedInIVRTime;

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
            this.accessChannelTypeDetailList = builder.accessChannelTypeDetailList;
            this.averageAbandonTime = builder.averageAbandonTime;
            this.averageAbandonedInIVRTime = builder.averageAbandonedInIVRTime;
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
            this.callsAbandonedInIVR = builder.callsAbandonedInIVR;
            this.callsAbandonedInQueue = builder.callsAbandonedInQueue;
            this.callsAbandonedInRing = builder.callsAbandonedInRing;
            this.callsAbandonedInVoiceNavigator = builder.callsAbandonedInVoiceNavigator;
            this.callsAttendedTransferred = builder.callsAttendedTransferred;
            this.callsBlindTransferred = builder.callsBlindTransferred;
            this.callsCausedIVRException = builder.callsCausedIVRException;
            this.callsForwardToOutsideNumber = builder.callsForwardToOutsideNumber;
            this.callsHandled = builder.callsHandled;
            this.callsHold = builder.callsHold;
            this.callsIVRException = builder.callsIVRException;
            this.callsOffered = builder.callsOffered;
            this.callsQueued = builder.callsQueued;
            this.callsQueuingFailed = builder.callsQueuingFailed;
            this.callsQueuingOverflow = builder.callsQueuingOverflow;
            this.callsQueuingTimeout = builder.callsQueuingTimeout;
            this.callsRinged = builder.callsRinged;
            this.callsToVoicemail = builder.callsToVoicemail;
            this.callsVoicemail = builder.callsVoicemail;
            this.handleRate = builder.handleRate;
            this.maxAbandonTime = builder.maxAbandonTime;
            this.maxAbandonedInIVRTime = builder.maxAbandonedInIVRTime;
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
            this.totalAbandonedInIVRTime = builder.totalAbandonedInIVRTime;
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
         * @return accessChannelTypeDetailList
         */
        public java.util.List<AccessChannelTypeDetailList> getAccessChannelTypeDetailList() {
            return this.accessChannelTypeDetailList;
        }

        /**
         * @return averageAbandonTime
         */
        public Float getAverageAbandonTime() {
            return this.averageAbandonTime;
        }

        /**
         * @return averageAbandonedInIVRTime
         */
        public Float getAverageAbandonedInIVRTime() {
            return this.averageAbandonedInIVRTime;
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
         * @return callsAbandonedInIVR
         */
        public Long getCallsAbandonedInIVR() {
            return this.callsAbandonedInIVR;
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
         * @return callsAbandonedInVoiceNavigator
         */
        public Long getCallsAbandonedInVoiceNavigator() {
            return this.callsAbandonedInVoiceNavigator;
        }

        /**
         * @return callsAttendedTransferred
         */
        public Long getCallsAttendedTransferred() {
            return this.callsAttendedTransferred;
        }

        /**
         * @return callsBlindTransferred
         */
        public Long getCallsBlindTransferred() {
            return this.callsBlindTransferred;
        }

        /**
         * @return callsCausedIVRException
         */
        public Long getCallsCausedIVRException() {
            return this.callsCausedIVRException;
        }

        /**
         * @return callsForwardToOutsideNumber
         */
        public Long getCallsForwardToOutsideNumber() {
            return this.callsForwardToOutsideNumber;
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
         * @return callsIVRException
         */
        public Long getCallsIVRException() {
            return this.callsIVRException;
        }

        /**
         * @return callsOffered
         */
        public Long getCallsOffered() {
            return this.callsOffered;
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
         * @return callsToVoicemail
         */
        public Long getCallsToVoicemail() {
            return this.callsToVoicemail;
        }

        /**
         * @return callsVoicemail
         */
        public Long getCallsVoicemail() {
            return this.callsVoicemail;
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
         * @return maxAbandonedInIVRTime
         */
        public Long getMaxAbandonedInIVRTime() {
            return this.maxAbandonedInIVRTime;
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
         * @return totalAbandonedInIVRTime
         */
        public Long getTotalAbandonedInIVRTime() {
            return this.totalAbandonedInIVRTime;
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
            private java.util.List<AccessChannelTypeDetailList> accessChannelTypeDetailList; 
            private Float averageAbandonTime; 
            private Float averageAbandonedInIVRTime; 
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
            private Long callsAbandonedInIVR; 
            private Long callsAbandonedInQueue; 
            private Long callsAbandonedInRing; 
            private Long callsAbandonedInVoiceNavigator; 
            private Long callsAttendedTransferred; 
            private Long callsBlindTransferred; 
            private Long callsCausedIVRException; 
            private Long callsForwardToOutsideNumber; 
            private Long callsHandled; 
            private Long callsHold; 
            private Long callsIVRException; 
            private Long callsOffered; 
            private Long callsQueued; 
            private Long callsQueuingFailed; 
            private Long callsQueuingOverflow; 
            private Long callsQueuingTimeout; 
            private Long callsRinged; 
            private Long callsToVoicemail; 
            private Long callsVoicemail; 
            private Float handleRate; 
            private Long maxAbandonTime; 
            private Long maxAbandonedInIVRTime; 
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
            private Long totalAbandonedInIVRTime; 
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
                this.accessChannelTypeDetailList = model.accessChannelTypeDetailList;
                this.averageAbandonTime = model.averageAbandonTime;
                this.averageAbandonedInIVRTime = model.averageAbandonedInIVRTime;
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
                this.callsAbandonedInIVR = model.callsAbandonedInIVR;
                this.callsAbandonedInQueue = model.callsAbandonedInQueue;
                this.callsAbandonedInRing = model.callsAbandonedInRing;
                this.callsAbandonedInVoiceNavigator = model.callsAbandonedInVoiceNavigator;
                this.callsAttendedTransferred = model.callsAttendedTransferred;
                this.callsBlindTransferred = model.callsBlindTransferred;
                this.callsCausedIVRException = model.callsCausedIVRException;
                this.callsForwardToOutsideNumber = model.callsForwardToOutsideNumber;
                this.callsHandled = model.callsHandled;
                this.callsHold = model.callsHold;
                this.callsIVRException = model.callsIVRException;
                this.callsOffered = model.callsOffered;
                this.callsQueued = model.callsQueued;
                this.callsQueuingFailed = model.callsQueuingFailed;
                this.callsQueuingOverflow = model.callsQueuingOverflow;
                this.callsQueuingTimeout = model.callsQueuingTimeout;
                this.callsRinged = model.callsRinged;
                this.callsToVoicemail = model.callsToVoicemail;
                this.callsVoicemail = model.callsVoicemail;
                this.handleRate = model.handleRate;
                this.maxAbandonTime = model.maxAbandonTime;
                this.maxAbandonedInIVRTime = model.maxAbandonedInIVRTime;
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
                this.totalAbandonedInIVRTime = model.totalAbandonedInIVRTime;
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
             * AbandonRate.
             */
            public Builder abandonRate(Float abandonRate) {
                this.abandonRate = abandonRate;
                return this;
            }

            /**
             * AccessChannelTypeDetailList.
             */
            public Builder accessChannelTypeDetailList(java.util.List<AccessChannelTypeDetailList> accessChannelTypeDetailList) {
                this.accessChannelTypeDetailList = accessChannelTypeDetailList;
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
             * AverageAbandonedInIVRTime.
             */
            public Builder averageAbandonedInIVRTime(Float averageAbandonedInIVRTime) {
                this.averageAbandonedInIVRTime = averageAbandonedInIVRTime;
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
             * CallsAbandonedInIVR.
             */
            public Builder callsAbandonedInIVR(Long callsAbandonedInIVR) {
                this.callsAbandonedInIVR = callsAbandonedInIVR;
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
             * CallsAbandonedInVoiceNavigator.
             */
            public Builder callsAbandonedInVoiceNavigator(Long callsAbandonedInVoiceNavigator) {
                this.callsAbandonedInVoiceNavigator = callsAbandonedInVoiceNavigator;
                return this;
            }

            /**
             * CallsAttendedTransferred.
             */
            public Builder callsAttendedTransferred(Long callsAttendedTransferred) {
                this.callsAttendedTransferred = callsAttendedTransferred;
                return this;
            }

            /**
             * CallsBlindTransferred.
             */
            public Builder callsBlindTransferred(Long callsBlindTransferred) {
                this.callsBlindTransferred = callsBlindTransferred;
                return this;
            }

            /**
             * CallsCausedIVRException.
             */
            public Builder callsCausedIVRException(Long callsCausedIVRException) {
                this.callsCausedIVRException = callsCausedIVRException;
                return this;
            }

            /**
             * CallsForwardToOutsideNumber.
             */
            public Builder callsForwardToOutsideNumber(Long callsForwardToOutsideNumber) {
                this.callsForwardToOutsideNumber = callsForwardToOutsideNumber;
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
             * CallsIVRException.
             */
            public Builder callsIVRException(Long callsIVRException) {
                this.callsIVRException = callsIVRException;
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
             * CallsQueued.
             */
            public Builder callsQueued(Long callsQueued) {
                this.callsQueued = callsQueued;
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
             * CallsQueuingOverflow.
             */
            public Builder callsQueuingOverflow(Long callsQueuingOverflow) {
                this.callsQueuingOverflow = callsQueuingOverflow;
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
             * CallsRinged.
             */
            public Builder callsRinged(Long callsRinged) {
                this.callsRinged = callsRinged;
                return this;
            }

            /**
             * CallsToVoicemail.
             */
            public Builder callsToVoicemail(Long callsToVoicemail) {
                this.callsToVoicemail = callsToVoicemail;
                return this;
            }

            /**
             * CallsVoicemail.
             */
            public Builder callsVoicemail(Long callsVoicemail) {
                this.callsVoicemail = callsVoicemail;
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
             * MaxAbandonedInIVRTime.
             */
            public Builder maxAbandonedInIVRTime(Long maxAbandonedInIVRTime) {
                this.maxAbandonedInIVRTime = maxAbandonedInIVRTime;
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
             * ServiceLevel15.
             */
            public Builder serviceLevel15(Float serviceLevel15) {
                this.serviceLevel15 = serviceLevel15;
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
             * ServiceLevel30.
             */
            public Builder serviceLevel30(Float serviceLevel30) {
                this.serviceLevel30 = serviceLevel30;
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
             * TotalAbandonedInIVRTime.
             */
            public Builder totalAbandonedInIVRTime(Long totalAbandonedInIVRTime) {
                this.totalAbandonedInIVRTime = totalAbandonedInIVRTime;
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
    /**
     * 
     * {@link GetHistoricalInstanceReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetHistoricalInstanceReportResponseBody</p>
     */
    public static class Internal extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallsAnswered")
        private Long callsAnswered;

        @com.aliyun.core.annotation.NameInMap("CallsDialed")
        private Long callsDialed;

        private Internal(Builder builder) {
            this.callsAnswered = builder.callsAnswered;
            this.callsDialed = builder.callsDialed;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Internal create() {
            return builder().build();
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

        public static final class Builder {
            private Long callsAnswered; 
            private Long callsDialed; 

            private Builder() {
            } 

            private Builder(Internal model) {
                this.callsAnswered = model.callsAnswered;
                this.callsDialed = model.callsDialed;
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

            public Internal build() {
                return new Internal(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetHistoricalInstanceReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetHistoricalInstanceReportResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("CallsAttendedTransferred")
        private Long callsAttendedTransferred;

        @com.aliyun.core.annotation.NameInMap("CallsBlindTransferred")
        private Long callsBlindTransferred;

        @com.aliyun.core.annotation.NameInMap("CallsDialed")
        private Long callsDialed;

        @com.aliyun.core.annotation.NameInMap("CallsHold")
        private Integer callsHold;

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
            this.callsAttendedTransferred = builder.callsAttendedTransferred;
            this.callsBlindTransferred = builder.callsBlindTransferred;
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
         * @return callsAttendedTransferred
         */
        public Long getCallsAttendedTransferred() {
            return this.callsAttendedTransferred;
        }

        /**
         * @return callsBlindTransferred
         */
        public Long getCallsBlindTransferred() {
            return this.callsBlindTransferred;
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
        public Integer getCallsHold() {
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
            private Long callsAttendedTransferred; 
            private Long callsBlindTransferred; 
            private Long callsDialed; 
            private Integer callsHold; 
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
                this.callsAttendedTransferred = model.callsAttendedTransferred;
                this.callsBlindTransferred = model.callsBlindTransferred;
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
             * CallsAttendedTransferred.
             */
            public Builder callsAttendedTransferred(Long callsAttendedTransferred) {
                this.callsAttendedTransferred = callsAttendedTransferred;
                return this;
            }

            /**
             * CallsBlindTransferred.
             */
            public Builder callsBlindTransferred(Long callsBlindTransferred) {
                this.callsBlindTransferred = callsBlindTransferred;
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
            public Builder callsHold(Integer callsHold) {
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
     * {@link GetHistoricalInstanceReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetHistoricalInstanceReportResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("MaxBreakTime")
        private Long maxBreakTime;

        @com.aliyun.core.annotation.NameInMap("MaxHoldTime")
        private Long maxHoldTime;

        @com.aliyun.core.annotation.NameInMap("MaxLoggedInAgents")
        private Long maxLoggedInAgents;

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
            this.maxBreakTime = builder.maxBreakTime;
            this.maxHoldTime = builder.maxHoldTime;
            this.maxLoggedInAgents = builder.maxLoggedInAgents;
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
         * @return maxLoggedInAgents
         */
        public Long getMaxLoggedInAgents() {
            return this.maxLoggedInAgents;
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
            private Long maxLoggedInAgents; 
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
                this.maxBreakTime = model.maxBreakTime;
                this.maxHoldTime = model.maxHoldTime;
                this.maxLoggedInAgents = model.maxLoggedInAgents;
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
             * MaxLoggedInAgents.
             */
            public Builder maxLoggedInAgents(Long maxLoggedInAgents) {
                this.maxLoggedInAgents = maxLoggedInAgents;
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
    /**
     * 
     * {@link GetHistoricalInstanceReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetHistoricalInstanceReportResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Inbound")
        private Inbound inbound;

        @com.aliyun.core.annotation.NameInMap("Internal")
        private Internal internal;

        @com.aliyun.core.annotation.NameInMap("Outbound")
        private Outbound outbound;

        @com.aliyun.core.annotation.NameInMap("Overall")
        private Overall overall;

        private Data(Builder builder) {
            this.inbound = builder.inbound;
            this.internal = builder.internal;
            this.outbound = builder.outbound;
            this.overall = builder.overall;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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

        public static final class Builder {
            private Inbound inbound; 
            private Internal internal; 
            private Outbound outbound; 
            private Overall overall; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.inbound = model.inbound;
                this.internal = model.internal;
                this.outbound = model.outbound;
                this.overall = model.overall;
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
