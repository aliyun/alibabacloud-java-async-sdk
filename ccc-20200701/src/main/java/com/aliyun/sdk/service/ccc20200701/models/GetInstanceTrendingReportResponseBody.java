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
 * {@link GetInstanceTrendingReportResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceTrendingReportResponseBody</p>
 */
public class GetInstanceTrendingReportResponseBody extends TeaModel {
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

    private GetInstanceTrendingReportResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceTrendingReportResponseBody create() {
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

        private Builder(GetInstanceTrendingReportResponseBody model) {
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
         * <p>943D8EF3-3321-471F-A104-51C96FCA94D6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInstanceTrendingReportResponseBody build() {
            return new GetInstanceTrendingReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceTrendingReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceTrendingReportResponseBody</p>
     */
    public static class Inbound extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallsAbandonedInIVR")
        private Long callsAbandonedInIVR;

        @com.aliyun.core.annotation.NameInMap("CallsAbandonedInQueue")
        private Long callsAbandonedInQueue;

        @com.aliyun.core.annotation.NameInMap("CallsAbandonedInRing")
        private Long callsAbandonedInRing;

        @com.aliyun.core.annotation.NameInMap("CallsHandled")
        private Long callsHandled;

        @com.aliyun.core.annotation.NameInMap("CallsQueued")
        private Long callsQueued;

        @com.aliyun.core.annotation.NameInMap("StatsTime")
        private Long statsTime;

        @com.aliyun.core.annotation.NameInMap("TotalCalls")
        private Long totalCalls;

        private Inbound(Builder builder) {
            this.callsAbandonedInIVR = builder.callsAbandonedInIVR;
            this.callsAbandonedInQueue = builder.callsAbandonedInQueue;
            this.callsAbandonedInRing = builder.callsAbandonedInRing;
            this.callsHandled = builder.callsHandled;
            this.callsQueued = builder.callsQueued;
            this.statsTime = builder.statsTime;
            this.totalCalls = builder.totalCalls;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Inbound create() {
            return builder().build();
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
         * @return callsHandled
         */
        public Long getCallsHandled() {
            return this.callsHandled;
        }

        /**
         * @return callsQueued
         */
        public Long getCallsQueued() {
            return this.callsQueued;
        }

        /**
         * @return statsTime
         */
        public Long getStatsTime() {
            return this.statsTime;
        }

        /**
         * @return totalCalls
         */
        public Long getTotalCalls() {
            return this.totalCalls;
        }

        public static final class Builder {
            private Long callsAbandonedInIVR; 
            private Long callsAbandonedInQueue; 
            private Long callsAbandonedInRing; 
            private Long callsHandled; 
            private Long callsQueued; 
            private Long statsTime; 
            private Long totalCalls; 

            private Builder() {
            } 

            private Builder(Inbound model) {
                this.callsAbandonedInIVR = model.callsAbandonedInIVR;
                this.callsAbandonedInQueue = model.callsAbandonedInQueue;
                this.callsAbandonedInRing = model.callsAbandonedInRing;
                this.callsHandled = model.callsHandled;
                this.callsQueued = model.callsQueued;
                this.statsTime = model.statsTime;
                this.totalCalls = model.totalCalls;
            } 

            /**
             * <p>Number of calls abandoned in the IVR, meaning calls that were abandoned during the IVR flow after entering it.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsAbandonedInIVR(Long callsAbandonedInIVR) {
                this.callsAbandonedInIVR = callsAbandonedInIVR;
                return this;
            }

            /**
             * <p>Number of calls abandoned in the queue, meaning calls that were abandoned while waiting in the skill group queue after entering it.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsAbandonedInQueue(Long callsAbandonedInQueue) {
                this.callsAbandonedInQueue = callsAbandonedInQueue;
                return this;
            }

            /**
             * <p>Number of calls abandoned during ringing.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsAbandonedInRing(Long callsAbandonedInRing) {
                this.callsAbandonedInRing = callsAbandonedInRing;
                return this;
            }

            /**
             * <p>Number of calls answered by agents. If a single call is distributed to multiple agents, it is counted as one call.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsHandled(Long callsHandled) {
                this.callsHandled = callsHandled;
                return this;
            }

            /**
             * <p>Number of calls that entered the queue. If a single call enters the queue multiple times, it is counted as one call.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsQueued(Long callsQueued) {
                this.callsQueued = callsQueued;
                return this;
            }

            /**
             * <p>The start time of the segment statistics, in UNIX timestamp format, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1604639129000</p>
             */
            public Builder statsTime(Long statsTime) {
                this.statsTime = statsTime;
                return this;
            }

            /**
             * <p>Total number of incoming calls.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalCalls(Long totalCalls) {
                this.totalCalls = totalCalls;
                return this;
            }

            public Inbound build() {
                return new Inbound(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceTrendingReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceTrendingReportResponseBody</p>
     */
    public static class Outbound extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallsAnswered")
        private Long callsAnswered;

        @com.aliyun.core.annotation.NameInMap("StatsTime")
        private Long statsTime;

        @com.aliyun.core.annotation.NameInMap("TotalCalls")
        private Long totalCalls;

        private Outbound(Builder builder) {
            this.callsAnswered = builder.callsAnswered;
            this.statsTime = builder.statsTime;
            this.totalCalls = builder.totalCalls;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Outbound create() {
            return builder().build();
        }

        /**
         * @return callsAnswered
         */
        public Long getCallsAnswered() {
            return this.callsAnswered;
        }

        /**
         * @return statsTime
         */
        public Long getStatsTime() {
            return this.statsTime;
        }

        /**
         * @return totalCalls
         */
        public Long getTotalCalls() {
            return this.totalCalls;
        }

        public static final class Builder {
            private Long callsAnswered; 
            private Long statsTime; 
            private Long totalCalls; 

            private Builder() {
            } 

            private Builder(Outbound model) {
                this.callsAnswered = model.callsAnswered;
                this.statsTime = model.statsTime;
                this.totalCalls = model.totalCalls;
            } 

            /**
             * <p>Number of answered outbound calls.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callsAnswered(Long callsAnswered) {
                this.callsAnswered = callsAnswered;
                return this;
            }

            /**
             * <p>Start time of the segment, in UNIX timestamp format, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1604639129000</p>
             */
            public Builder statsTime(Long statsTime) {
                this.statsTime = statsTime;
                return this;
            }

            /**
             * <p>Total number of outbound calls.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalCalls(Long totalCalls) {
                this.totalCalls = totalCalls;
                return this;
            }

            public Outbound build() {
                return new Outbound(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceTrendingReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceTrendingReportResponseBody</p>
     */
    public static class Overall extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxLoggedInAgents")
        private Long maxLoggedInAgents;

        @com.aliyun.core.annotation.NameInMap("StatsTime")
        private Long statsTime;

        private Overall(Builder builder) {
            this.maxLoggedInAgents = builder.maxLoggedInAgents;
            this.statsTime = builder.statsTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Overall create() {
            return builder().build();
        }

        /**
         * @return maxLoggedInAgents
         */
        public Long getMaxLoggedInAgents() {
            return this.maxLoggedInAgents;
        }

        /**
         * @return statsTime
         */
        public Long getStatsTime() {
            return this.statsTime;
        }

        public static final class Builder {
            private Long maxLoggedInAgents; 
            private Long statsTime; 

            private Builder() {
            } 

            private Builder(Overall model) {
                this.maxLoggedInAgents = model.maxLoggedInAgents;
                this.statsTime = model.statsTime;
            } 

            /**
             * <p>Maximum number of agents logged on simultaneously during this time range.</p>
             * 
             * <strong>example:</strong>
             * <p>102</p>
             */
            public Builder maxLoggedInAgents(Long maxLoggedInAgents) {
                this.maxLoggedInAgents = maxLoggedInAgents;
                return this;
            }

            /**
             * <p>The start time of the segment statistics, in UNIX timestamp format, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1604639129000</p>
             */
            public Builder statsTime(Long statsTime) {
                this.statsTime = statsTime;
                return this;
            }

            public Overall build() {
                return new Overall(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceTrendingReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceTrendingReportResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Inbound")
        private java.util.List<Inbound> inbound;

        @com.aliyun.core.annotation.NameInMap("Outbound")
        private java.util.List<Outbound> outbound;

        @com.aliyun.core.annotation.NameInMap("Overall")
        private java.util.List<Overall> overall;

        private Data(Builder builder) {
            this.inbound = builder.inbound;
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
        public java.util.List<Inbound> getInbound() {
            return this.inbound;
        }

        /**
         * @return outbound
         */
        public java.util.List<Outbound> getOutbound() {
            return this.outbound;
        }

        /**
         * @return overall
         */
        public java.util.List<Overall> getOverall() {
            return this.overall;
        }

        public static final class Builder {
            private java.util.List<Inbound> inbound; 
            private java.util.List<Outbound> outbound; 
            private java.util.List<Overall> overall; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.inbound = model.inbound;
                this.outbound = model.outbound;
                this.overall = model.overall;
            } 

            /**
             * <p>Inbound metrics.</p>
             */
            public Builder inbound(java.util.List<Inbound> inbound) {
                this.inbound = inbound;
                return this;
            }

            /**
             * <p>Outbound metrics.</p>
             */
            public Builder outbound(java.util.List<Outbound> outbound) {
                this.outbound = outbound;
                return this;
            }

            /**
             * <p>Overall metrics.</p>
             */
            public Builder overall(java.util.List<Overall> overall) {
                this.overall = overall;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
