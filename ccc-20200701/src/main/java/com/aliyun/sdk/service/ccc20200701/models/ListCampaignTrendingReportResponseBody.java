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
 * {@link ListCampaignTrendingReportResponseBody} extends {@link TeaModel}
 *
 * <p>ListCampaignTrendingReportResponseBody</p>
 */
public class ListCampaignTrendingReportResponseBody extends TeaModel {
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

        private Builder(ListCampaignTrendingReportResponseBody model) {
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
         * <p>List of statistical data points.</p>
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
         * <p>6CCEF32F-8614-535F-A1D9-D85B8C0DC4F0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListCampaignTrendingReportResponseBody build() {
            return new ListCampaignTrendingReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCampaignTrendingReportResponseBody} extends {@link TeaModel}
     *
     * <p>ListCampaignTrendingReportResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BreakAgents")
        private Long breakAgents;

        @com.aliyun.core.annotation.NameInMap("BreakingAgents")
        private Long breakingAgents;

        @com.aliyun.core.annotation.NameInMap("Concurrency")
        private Long concurrency;

        @com.aliyun.core.annotation.NameInMap("Datetime")
        private Long datetime;

        @com.aliyun.core.annotation.NameInMap("LoggedInAgents")
        private Long loggedInAgents;

        @com.aliyun.core.annotation.NameInMap("OutboundScenarioBreakingAgents")
        private Long outboundScenarioBreakingAgents;

        @com.aliyun.core.annotation.NameInMap("OutboundScenarioReadyAgents")
        private Long outboundScenarioReadyAgents;

        @com.aliyun.core.annotation.NameInMap("OutboundScenarioTalkingAgents")
        private Long outboundScenarioTalkingAgents;

        @com.aliyun.core.annotation.NameInMap("OutboundScenarioWorkingAgents")
        private Long outboundScenarioWorkingAgents;

        @com.aliyun.core.annotation.NameInMap("ReadyAgents")
        private Long readyAgents;

        @com.aliyun.core.annotation.NameInMap("StatsTime")
        private Long statsTime;

        @com.aliyun.core.annotation.NameInMap("TalkAgents")
        private Long talkAgents;

        @com.aliyun.core.annotation.NameInMap("TalkingAgents")
        private Long talkingAgents;

        @com.aliyun.core.annotation.NameInMap("WorkAgents")
        private Long workAgents;

        @com.aliyun.core.annotation.NameInMap("WorkingAgents")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.breakAgents = model.breakAgents;
                this.breakingAgents = model.breakingAgents;
                this.concurrency = model.concurrency;
                this.datetime = model.datetime;
                this.loggedInAgents = model.loggedInAgents;
                this.outboundScenarioBreakingAgents = model.outboundScenarioBreakingAgents;
                this.outboundScenarioReadyAgents = model.outboundScenarioReadyAgents;
                this.outboundScenarioTalkingAgents = model.outboundScenarioTalkingAgents;
                this.outboundScenarioWorkingAgents = model.outboundScenarioWorkingAgents;
                this.readyAgents = model.readyAgents;
                this.statsTime = model.statsTime;
                this.talkAgents = model.talkAgents;
                this.talkingAgents = model.talkingAgents;
                this.workAgents = model.workAgents;
                this.workingAgents = model.workingAgents;
            } 

            /**
             * <p>Number of agents on break.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder breakAgents(Long breakAgents) {
                this.breakAgents = breakAgents;
                return this;
            }

            /**
             * <p>Number of agents in break status.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder breakingAgents(Long breakingAgents) {
                this.breakingAgents = breakingAgents;
                return this;
            }

            /**
             * <p>The concurrent call volume, which refers to the number of simultaneous outbound calls.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder concurrency(Long concurrency) {
                this.concurrency = concurrency;
                return this;
            }

            /**
             * <p>The timestamp for segmented statistics, formatted as a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1634037840000</p>
             */
            public Builder datetime(Long datetime) {
                this.datetime = datetime;
                return this;
            }

            /**
             * <p>The number of published agents.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder loggedInAgents(Long loggedInAgents) {
                this.loggedInAgents = loggedInAgents;
                return this;
            }

            /**
             * <p>The number of agents in outbound-only mode who are on a break.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder outboundScenarioBreakingAgents(Long outboundScenarioBreakingAgents) {
                this.outboundScenarioBreakingAgents = outboundScenarioBreakingAgents;
                return this;
            }

            /**
             * <p>Number of agents in idle status under outbound-only mode.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder outboundScenarioReadyAgents(Long outboundScenarioReadyAgents) {
                this.outboundScenarioReadyAgents = outboundScenarioReadyAgents;
                return this;
            }

            /**
             * <p>The number of agents in outbound-only mode who are currently on a call.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder outboundScenarioTalkingAgents(Long outboundScenarioTalkingAgents) {
                this.outboundScenarioTalkingAgents = outboundScenarioTalkingAgents;
                return this;
            }

            /**
             * <p>Number of agents in post-processing status under outbound-only mode.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder outboundScenarioWorkingAgents(Long outboundScenarioWorkingAgents) {
                this.outboundScenarioWorkingAgents = outboundScenarioWorkingAgents;
                return this;
            }

            /**
             * <p>Number of idle agents.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder readyAgents(Long readyAgents) {
                this.readyAgents = readyAgents;
                return this;
            }

            /**
             * <p>Time of the statistical data point, formatted as a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1604639129000</p>
             */
            public Builder statsTime(Long statsTime) {
                this.statsTime = statsTime;
                return this;
            }

            /**
             * <p>Deprecated. Refer to TalkAgents.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder talkAgents(Long talkAgents) {
                this.talkAgents = talkAgents;
                return this;
            }

            /**
             * <p>The number of agents in a call.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder talkingAgents(Long talkingAgents) {
                this.talkingAgents = talkingAgents;
                return this;
            }

            /**
             * <p>Deprecated. Refer to WorkingAgents.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder workAgents(Long workAgents) {
                this.workAgents = workAgents;
                return this;
            }

            /**
             * <p>Number of agents in post-processing status.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
