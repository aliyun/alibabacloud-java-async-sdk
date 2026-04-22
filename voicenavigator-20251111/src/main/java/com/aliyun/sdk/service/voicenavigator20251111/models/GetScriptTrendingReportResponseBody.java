// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20251111.models;

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
 * {@link GetScriptTrendingReportResponseBody} extends {@link TeaModel}
 *
 * <p>GetScriptTrendingReportResponseBody</p>
 */
public class GetScriptTrendingReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Params")
    private java.util.List<String> params;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetScriptTrendingReportResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.params = builder.params;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScriptTrendingReportResponseBody create() {
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
     * @return params
     */
    public java.util.List<String> getParams() {
        return this.params;
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
        private java.util.List<String> params; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetScriptTrendingReportResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.params = model.params;
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
        public Builder data(java.util.List<Data> data) {
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
         * Params.
         */
        public Builder params(java.util.List<String> params) {
            this.params = params;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>9DB8BA95-4513-54B9-9C67-A28909CFB4AD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetScriptTrendingReportResponseBody build() {
            return new GetScriptTrendingReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetScriptTrendingReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetScriptTrendingReportResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallsHandled")
        private Long callsHandled;

        @com.aliyun.core.annotation.NameInMap("CallsOffered")
        private Long callsOffered;

        @com.aliyun.core.annotation.NameInMap("CallsRejected")
        private Long callsRejected;

        @com.aliyun.core.annotation.NameInMap("CallsResolved")
        private Long callsResolved;

        @com.aliyun.core.annotation.NameInMap("ConfiguredConcurrency")
        private Long configuredConcurrency;

        @com.aliyun.core.annotation.NameInMap("LabelBreakDown")
        private String labelBreakDown;

        @com.aliyun.core.annotation.NameInMap("MaxTalkTime")
        private Long maxTalkTime;

        @com.aliyun.core.annotation.NameInMap("RejectionBreakdown")
        private String rejectionBreakdown;

        @com.aliyun.core.annotation.NameInMap("ReleaseReasonBreakdown")
        private String releaseReasonBreakdown;

        @com.aliyun.core.annotation.NameInMap("StatsTime")
        private Long statsTime;

        @com.aliyun.core.annotation.NameInMap("TalkTurnsDistribution")
        private String talkTurnsDistribution;

        @com.aliyun.core.annotation.NameInMap("TotalInputTokens")
        private Long totalInputTokens;

        @com.aliyun.core.annotation.NameInMap("TotalOutputTokens")
        private Long totalOutputTokens;

        @com.aliyun.core.annotation.NameInMap("TotalTalkTime")
        private Long totalTalkTime;

        @com.aliyun.core.annotation.NameInMap("TotalTokens")
        private Long totalTokens;

        @com.aliyun.core.annotation.NameInMap("UsedConcurrency")
        private Long usedConcurrency;

        private Data(Builder builder) {
            this.callsHandled = builder.callsHandled;
            this.callsOffered = builder.callsOffered;
            this.callsRejected = builder.callsRejected;
            this.callsResolved = builder.callsResolved;
            this.configuredConcurrency = builder.configuredConcurrency;
            this.labelBreakDown = builder.labelBreakDown;
            this.maxTalkTime = builder.maxTalkTime;
            this.rejectionBreakdown = builder.rejectionBreakdown;
            this.releaseReasonBreakdown = builder.releaseReasonBreakdown;
            this.statsTime = builder.statsTime;
            this.talkTurnsDistribution = builder.talkTurnsDistribution;
            this.totalInputTokens = builder.totalInputTokens;
            this.totalOutputTokens = builder.totalOutputTokens;
            this.totalTalkTime = builder.totalTalkTime;
            this.totalTokens = builder.totalTokens;
            this.usedConcurrency = builder.usedConcurrency;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return callsRejected
         */
        public Long getCallsRejected() {
            return this.callsRejected;
        }

        /**
         * @return callsResolved
         */
        public Long getCallsResolved() {
            return this.callsResolved;
        }

        /**
         * @return configuredConcurrency
         */
        public Long getConfiguredConcurrency() {
            return this.configuredConcurrency;
        }

        /**
         * @return labelBreakDown
         */
        public String getLabelBreakDown() {
            return this.labelBreakDown;
        }

        /**
         * @return maxTalkTime
         */
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        /**
         * @return rejectionBreakdown
         */
        public String getRejectionBreakdown() {
            return this.rejectionBreakdown;
        }

        /**
         * @return releaseReasonBreakdown
         */
        public String getReleaseReasonBreakdown() {
            return this.releaseReasonBreakdown;
        }

        /**
         * @return statsTime
         */
        public Long getStatsTime() {
            return this.statsTime;
        }

        /**
         * @return talkTurnsDistribution
         */
        public String getTalkTurnsDistribution() {
            return this.talkTurnsDistribution;
        }

        /**
         * @return totalInputTokens
         */
        public Long getTotalInputTokens() {
            return this.totalInputTokens;
        }

        /**
         * @return totalOutputTokens
         */
        public Long getTotalOutputTokens() {
            return this.totalOutputTokens;
        }

        /**
         * @return totalTalkTime
         */
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        /**
         * @return totalTokens
         */
        public Long getTotalTokens() {
            return this.totalTokens;
        }

        /**
         * @return usedConcurrency
         */
        public Long getUsedConcurrency() {
            return this.usedConcurrency;
        }

        public static final class Builder {
            private Long callsHandled; 
            private Long callsOffered; 
            private Long callsRejected; 
            private Long callsResolved; 
            private Long configuredConcurrency; 
            private String labelBreakDown; 
            private Long maxTalkTime; 
            private String rejectionBreakdown; 
            private String releaseReasonBreakdown; 
            private Long statsTime; 
            private String talkTurnsDistribution; 
            private Long totalInputTokens; 
            private Long totalOutputTokens; 
            private Long totalTalkTime; 
            private Long totalTokens; 
            private Long usedConcurrency; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.callsHandled = model.callsHandled;
                this.callsOffered = model.callsOffered;
                this.callsRejected = model.callsRejected;
                this.callsResolved = model.callsResolved;
                this.configuredConcurrency = model.configuredConcurrency;
                this.labelBreakDown = model.labelBreakDown;
                this.maxTalkTime = model.maxTalkTime;
                this.rejectionBreakdown = model.rejectionBreakdown;
                this.releaseReasonBreakdown = model.releaseReasonBreakdown;
                this.statsTime = model.statsTime;
                this.talkTurnsDistribution = model.talkTurnsDistribution;
                this.totalInputTokens = model.totalInputTokens;
                this.totalOutputTokens = model.totalOutputTokens;
                this.totalTalkTime = model.totalTalkTime;
                this.totalTokens = model.totalTokens;
                this.usedConcurrency = model.usedConcurrency;
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
             * CallsRejected.
             */
            public Builder callsRejected(Long callsRejected) {
                this.callsRejected = callsRejected;
                return this;
            }

            /**
             * CallsResolved.
             */
            public Builder callsResolved(Long callsResolved) {
                this.callsResolved = callsResolved;
                return this;
            }

            /**
             * ConfiguredConcurrency.
             */
            public Builder configuredConcurrency(Long configuredConcurrency) {
                this.configuredConcurrency = configuredConcurrency;
                return this;
            }

            /**
             * LabelBreakDown.
             */
            public Builder labelBreakDown(String labelBreakDown) {
                this.labelBreakDown = labelBreakDown;
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
             * RejectionBreakdown.
             */
            public Builder rejectionBreakdown(String rejectionBreakdown) {
                this.rejectionBreakdown = rejectionBreakdown;
                return this;
            }

            /**
             * ReleaseReasonBreakdown.
             */
            public Builder releaseReasonBreakdown(String releaseReasonBreakdown) {
                this.releaseReasonBreakdown = releaseReasonBreakdown;
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
             * TalkTurnsDistribution.
             */
            public Builder talkTurnsDistribution(String talkTurnsDistribution) {
                this.talkTurnsDistribution = talkTurnsDistribution;
                return this;
            }

            /**
             * TotalInputTokens.
             */
            public Builder totalInputTokens(Long totalInputTokens) {
                this.totalInputTokens = totalInputTokens;
                return this;
            }

            /**
             * TotalOutputTokens.
             */
            public Builder totalOutputTokens(Long totalOutputTokens) {
                this.totalOutputTokens = totalOutputTokens;
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
             * TotalTokens.
             */
            public Builder totalTokens(Long totalTokens) {
                this.totalTokens = totalTokens;
                return this;
            }

            /**
             * UsedConcurrency.
             */
            public Builder usedConcurrency(Long usedConcurrency) {
                this.usedConcurrency = usedConcurrency;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
