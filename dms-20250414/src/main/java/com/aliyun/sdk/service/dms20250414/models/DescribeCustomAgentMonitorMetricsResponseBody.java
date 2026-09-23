// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link DescribeCustomAgentMonitorMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomAgentMonitorMetricsResponseBody</p>
 */
public class DescribeCustomAgentMonitorMetricsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeCustomAgentMonitorMetricsResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomAgentMonitorMetricsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeCustomAgentMonitorMetricsResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response struct.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned when the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidTid</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned when the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Specified parameter Tid is not valid.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>E0D21075-CD3E-4D98-8264-FD8AD04A63B6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request is successful.</li>
         * <li><strong>false</strong>: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeCustomAgentMonitorMetricsResponseBody build() {
            return new DescribeCustomAgentMonitorMetricsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCustomAgentMonitorMetricsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomAgentMonitorMetricsResponseBody</p>
     */
    public static class Trend extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveUserCount")
        private Long activeUserCount;

        @com.aliyun.core.annotation.NameInMap("DislikeCount")
        private Long dislikeCount;

        @com.aliyun.core.annotation.NameInMap("LikeCount")
        private Long likeCount;

        @com.aliyun.core.annotation.NameInMap("SessionCount")
        private Long sessionCount;

        @com.aliyun.core.annotation.NameInMap("StatTime")
        private String statTime;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        private Trend(Builder builder) {
            this.activeUserCount = builder.activeUserCount;
            this.dislikeCount = builder.dislikeCount;
            this.likeCount = builder.likeCount;
            this.sessionCount = builder.sessionCount;
            this.statTime = builder.statTime;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Trend create() {
            return builder().build();
        }

        /**
         * @return activeUserCount
         */
        public Long getActiveUserCount() {
            return this.activeUserCount;
        }

        /**
         * @return dislikeCount
         */
        public Long getDislikeCount() {
            return this.dislikeCount;
        }

        /**
         * @return likeCount
         */
        public Long getLikeCount() {
            return this.likeCount;
        }

        /**
         * @return sessionCount
         */
        public Long getSessionCount() {
            return this.sessionCount;
        }

        /**
         * @return statTime
         */
        public String getStatTime() {
            return this.statTime;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private Long activeUserCount; 
            private Long dislikeCount; 
            private Long likeCount; 
            private Long sessionCount; 
            private String statTime; 
            private Long timestamp; 

            private Builder() {
            } 

            private Builder(Trend model) {
                this.activeUserCount = model.activeUserCount;
                this.dislikeCount = model.dislikeCount;
                this.likeCount = model.likeCount;
                this.sessionCount = model.sessionCount;
                this.statTime = model.statTime;
                this.timestamp = model.timestamp;
            } 

            /**
             * <p>The number of active users within the statistical period.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder activeUserCount(Long activeUserCount) {
                this.activeUserCount = activeUserCount;
                return this;
            }

            /**
             * <p>The number of dislikes within the statistical period.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dislikeCount(Long dislikeCount) {
                this.dislikeCount = dislikeCount;
                return this;
            }

            /**
             * <p>The number of likes within the statistical period.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder likeCount(Long likeCount) {
                this.likeCount = likeCount;
                return this;
            }

            /**
             * <p>The number of sessions within the statistical period.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder sessionCount(Long sessionCount) {
                this.sessionCount = sessionCount;
                return this;
            }

            /**
             * <p>The statistical time. For daily granularity, the format is 2026-09-01. For hourly granularity, the format is 2026-09-01 13:00.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-01</p>
             */
            public Builder statTime(String statTime) {
                this.statTime = statTime;
                return this;
            }

            /**
             * <p>The start timestamp of the statistical period (epoch millis).</p>
             * 
             * <strong>example:</strong>
             * <p>1782835200000</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Trend build() {
                return new Trend(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCustomAgentMonitorMetricsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomAgentMonitorMetricsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveUserCount")
        private Long activeUserCount;

        @com.aliyun.core.annotation.NameInMap("CustomAgentId")
        private String customAgentId;

        @com.aliyun.core.annotation.NameInMap("DislikeCount")
        private Long dislikeCount;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("Granularity")
        private String granularity;

        @com.aliyun.core.annotation.NameInMap("LikeCount")
        private Long likeCount;

        @com.aliyun.core.annotation.NameInMap("SessionCount")
        private Long sessionCount;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Trend")
        private java.util.List<Trend> trend;

        private Data(Builder builder) {
            this.activeUserCount = builder.activeUserCount;
            this.customAgentId = builder.customAgentId;
            this.dislikeCount = builder.dislikeCount;
            this.endTime = builder.endTime;
            this.granularity = builder.granularity;
            this.likeCount = builder.likeCount;
            this.sessionCount = builder.sessionCount;
            this.startTime = builder.startTime;
            this.trend = builder.trend;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return activeUserCount
         */
        public Long getActiveUserCount() {
            return this.activeUserCount;
        }

        /**
         * @return customAgentId
         */
        public String getCustomAgentId() {
            return this.customAgentId;
        }

        /**
         * @return dislikeCount
         */
        public Long getDislikeCount() {
            return this.dislikeCount;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return granularity
         */
        public String getGranularity() {
            return this.granularity;
        }

        /**
         * @return likeCount
         */
        public Long getLikeCount() {
            return this.likeCount;
        }

        /**
         * @return sessionCount
         */
        public Long getSessionCount() {
            return this.sessionCount;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return trend
         */
        public java.util.List<Trend> getTrend() {
            return this.trend;
        }

        public static final class Builder {
            private Long activeUserCount; 
            private String customAgentId; 
            private Long dislikeCount; 
            private Long endTime; 
            private String granularity; 
            private Long likeCount; 
            private Long sessionCount; 
            private Long startTime; 
            private java.util.List<Trend> trend; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.activeUserCount = model.activeUserCount;
                this.customAgentId = model.customAgentId;
                this.dislikeCount = model.dislikeCount;
                this.endTime = model.endTime;
                this.granularity = model.granularity;
                this.likeCount = model.likeCount;
                this.sessionCount = model.sessionCount;
                this.startTime = model.startTime;
                this.trend = model.trend;
            } 

            /**
             * <p>The number of active users.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder activeUserCount(Long activeUserCount) {
                this.activeUserCount = activeUserCount;
                return this;
            }

            /**
             * <p>The custom agent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ca-4y3ca4khkcu**********ysf</p>
             */
            public Builder customAgentId(String customAgentId) {
                this.customAgentId = customAgentId;
                return this;
            }

            /**
             * <p>The total number of dislikes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dislikeCount(Long dislikeCount) {
                this.dislikeCount = dislikeCount;
                return this;
            }

            /**
             * <p>The end time of the statistical period (epoch millis).</p>
             * 
             * <strong>example:</strong>
             * <p>1756742400000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The aggregation granularity: DAY / HOUR.</p>
             * 
             * <strong>example:</strong>
             * <p>DAY</p>
             */
            public Builder granularity(String granularity) {
                this.granularity = granularity;
                return this;
            }

            /**
             * <p>The total number of likes.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder likeCount(Long likeCount) {
                this.likeCount = likeCount;
                return this;
            }

            /**
             * <p>The total number of sessions.</p>
             * 
             * <strong>example:</strong>
             * <p>102</p>
             */
            public Builder sessionCount(Long sessionCount) {
                this.sessionCount = sessionCount;
                return this;
            }

            /**
             * <p>The start time of the statistical period (epoch millis).</p>
             * 
             * <strong>example:</strong>
             * <p>1782835200000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The trend data aggregated by the specified granularity. Time points without data are filled with 0. The data is sorted in chronological order.</p>
             */
            public Builder trend(java.util.List<Trend> trend) {
                this.trend = trend;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
