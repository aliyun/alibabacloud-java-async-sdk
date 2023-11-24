// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCampaignTrendingReportResponseBody} extends {@link TeaModel}
 *
 * <p>ListCampaignTrendingReportResponseBody</p>
 */
public class ListCampaignTrendingReportResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private ListCampaignTrendingReportResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCampaignTrendingReportResponseBody create() {
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
    public java.util.List < Data> getData() {
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
        private java.util.List < Data> data; 
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
        public Builder data(java.util.List < Data> data) {
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

        public ListCampaignTrendingReportResponseBody build() {
            return new ListCampaignTrendingReportResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("BreakAgents")
        private Long breakAgents;

        @NameInMap("BreakingAgents")
        private Long breakingAgents;

        @NameInMap("Concurrency")
        private Long concurrency;

        @NameInMap("Datetime")
        private Long datetime;

        @NameInMap("LoggedInAgents")
        private Long loggedInAgents;

        @NameInMap("OutboundScenarioBreakingAgents")
        private Long outboundScenarioBreakingAgents;

        @NameInMap("OutboundScenarioReadyAgents")
        private Long outboundScenarioReadyAgents;

        @NameInMap("OutboundScenarioTalkingAgents")
        private Long outboundScenarioTalkingAgents;

        @NameInMap("OutboundScenarioWorkingAgents")
        private Long outboundScenarioWorkingAgents;

        @NameInMap("ReadyAgents")
        private Long readyAgents;

        @NameInMap("StatsTime")
        private Long statsTime;

        @NameInMap("TalkAgents")
        private Long talkAgents;

        @NameInMap("TalkingAgents")
        private Long talkingAgents;

        @NameInMap("WorkAgents")
        private Long workAgents;

        @NameInMap("WorkingAgents")
        private Long workingAgents;

        private Data(Builder builder) {
            this.breakAgents = builder.breakAgents;
            this.breakingAgents = builder.breakingAgents;
            this.concurrency = builder.concurrency;
            this.datetime = builder.datetime;
            this.loggedInAgents = builder.loggedInAgents;
            this.outboundScenarioBreakingAgents = builder.outboundScenarioBreakingAgents;
            this.outboundScenarioReadyAgents = builder.outboundScenarioReadyAgents;
            this.outboundScenarioTalkingAgents = builder.outboundScenarioTalkingAgents;
            this.outboundScenarioWorkingAgents = builder.outboundScenarioWorkingAgents;
            this.readyAgents = builder.readyAgents;
            this.statsTime = builder.statsTime;
            this.talkAgents = builder.talkAgents;
            this.talkingAgents = builder.talkingAgents;
            this.workAgents = builder.workAgents;
            this.workingAgents = builder.workingAgents;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return breakAgents
         */
        public Long getBreakAgents() {
            return this.breakAgents;
        }

        /**
         * @return breakingAgents
         */
        public Long getBreakingAgents() {
            return this.breakingAgents;
        }

        /**
         * @return concurrency
         */
        public Long getConcurrency() {
            return this.concurrency;
        }

        /**
         * @return datetime
         */
        public Long getDatetime() {
            return this.datetime;
        }

        /**
         * @return loggedInAgents
         */
        public Long getLoggedInAgents() {
            return this.loggedInAgents;
        }

        /**
         * @return outboundScenarioBreakingAgents
         */
        public Long getOutboundScenarioBreakingAgents() {
            return this.outboundScenarioBreakingAgents;
        }

        /**
         * @return outboundScenarioReadyAgents
         */
        public Long getOutboundScenarioReadyAgents() {
            return this.outboundScenarioReadyAgents;
        }

        /**
         * @return outboundScenarioTalkingAgents
         */
        public Long getOutboundScenarioTalkingAgents() {
            return this.outboundScenarioTalkingAgents;
        }

        /**
         * @return outboundScenarioWorkingAgents
         */
        public Long getOutboundScenarioWorkingAgents() {
            return this.outboundScenarioWorkingAgents;
        }

        /**
         * @return readyAgents
         */
        public Long getReadyAgents() {
            return this.readyAgents;
        }

        /**
         * @return statsTime
         */
        public Long getStatsTime() {
            return this.statsTime;
        }

        /**
         * @return talkAgents
         */
        public Long getTalkAgents() {
            return this.talkAgents;
        }

        /**
         * @return talkingAgents
         */
        public Long getTalkingAgents() {
            return this.talkingAgents;
        }

        /**
         * @return workAgents
         */
        public Long getWorkAgents() {
            return this.workAgents;
        }

        /**
         * @return workingAgents
         */
        public Long getWorkingAgents() {
            return this.workingAgents;
        }

        public static final class Builder {
            private Long breakAgents; 
            private Long breakingAgents; 
            private Long concurrency; 
            private Long datetime; 
            private Long loggedInAgents; 
            private Long outboundScenarioBreakingAgents; 
            private Long outboundScenarioReadyAgents; 
            private Long outboundScenarioTalkingAgents; 
            private Long outboundScenarioWorkingAgents; 
            private Long readyAgents; 
            private Long statsTime; 
            private Long talkAgents; 
            private Long talkingAgents; 
            private Long workAgents; 
            private Long workingAgents; 

            /**
             * BreakAgents.
             */
            public Builder breakAgents(Long breakAgents) {
                this.breakAgents = breakAgents;
                return this;
            }

            /**
             * BreakingAgents.
             */
            public Builder breakingAgents(Long breakingAgents) {
                this.breakingAgents = breakingAgents;
                return this;
            }

            /**
             * Concurrency.
             */
            public Builder concurrency(Long concurrency) {
                this.concurrency = concurrency;
                return this;
            }

            /**
             * Datetime.
             */
            public Builder datetime(Long datetime) {
                this.datetime = datetime;
                return this;
            }

            /**
             * LoggedInAgents.
             */
            public Builder loggedInAgents(Long loggedInAgents) {
                this.loggedInAgents = loggedInAgents;
                return this;
            }

            /**
             * OutboundScenarioBreakingAgents.
             */
            public Builder outboundScenarioBreakingAgents(Long outboundScenarioBreakingAgents) {
                this.outboundScenarioBreakingAgents = outboundScenarioBreakingAgents;
                return this;
            }

            /**
             * OutboundScenarioReadyAgents.
             */
            public Builder outboundScenarioReadyAgents(Long outboundScenarioReadyAgents) {
                this.outboundScenarioReadyAgents = outboundScenarioReadyAgents;
                return this;
            }

            /**
             * OutboundScenarioTalkingAgents.
             */
            public Builder outboundScenarioTalkingAgents(Long outboundScenarioTalkingAgents) {
                this.outboundScenarioTalkingAgents = outboundScenarioTalkingAgents;
                return this;
            }

            /**
             * OutboundScenarioWorkingAgents.
             */
            public Builder outboundScenarioWorkingAgents(Long outboundScenarioWorkingAgents) {
                this.outboundScenarioWorkingAgents = outboundScenarioWorkingAgents;
                return this;
            }

            /**
             * ReadyAgents.
             */
            public Builder readyAgents(Long readyAgents) {
                this.readyAgents = readyAgents;
                return this;
            }

            /**
             * StatsTime.
             */
            public Builder statsTime(Long statsTime) {
                this.statsTime = statsTime;
                return this;
            }

            /**
             * TalkAgents.
             */
            public Builder talkAgents(Long talkAgents) {
                this.talkAgents = talkAgents;
                return this;
            }

            /**
             * TalkingAgents.
             */
            public Builder talkingAgents(Long talkingAgents) {
                this.talkingAgents = talkingAgents;
                return this;
            }

            /**
             * WorkAgents.
             */
            public Builder workAgents(Long workAgents) {
                this.workAgents = workAgents;
                return this;
            }

            /**
             * WorkingAgents.
             */
            public Builder workingAgents(Long workingAgents) {
                this.workingAgents = workingAgents;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
