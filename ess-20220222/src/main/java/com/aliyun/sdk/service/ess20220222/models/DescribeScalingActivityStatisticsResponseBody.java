// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

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
 * {@link DescribeScalingActivityStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScalingActivityStatisticsResponseBody</p>
 */
public class DescribeScalingActivityStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScalingActivityErrorCodeStatistics")
    private ScalingActivityErrorCodeStatistics scalingActivityErrorCodeStatistics;

    @com.aliyun.core.annotation.NameInMap("ScalingActivityStatusStatistics")
    private ScalingActivityStatusStatistics scalingActivityStatusStatistics;

    private DescribeScalingActivityStatisticsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.scalingActivityErrorCodeStatistics = builder.scalingActivityErrorCodeStatistics;
        this.scalingActivityStatusStatistics = builder.scalingActivityStatusStatistics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScalingActivityStatisticsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scalingActivityErrorCodeStatistics
     */
    public ScalingActivityErrorCodeStatistics getScalingActivityErrorCodeStatistics() {
        return this.scalingActivityErrorCodeStatistics;
    }

    /**
     * @return scalingActivityStatusStatistics
     */
    public ScalingActivityStatusStatistics getScalingActivityStatusStatistics() {
        return this.scalingActivityStatusStatistics;
    }

    public static final class Builder {
        private String requestId; 
        private ScalingActivityErrorCodeStatistics scalingActivityErrorCodeStatistics; 
        private ScalingActivityStatusStatistics scalingActivityStatusStatistics; 

        private Builder() {
        } 

        private Builder(DescribeScalingActivityStatisticsResponseBody model) {
            this.requestId = model.requestId;
            this.scalingActivityErrorCodeStatistics = model.scalingActivityErrorCodeStatistics;
            this.scalingActivityStatusStatistics = model.scalingActivityStatusStatistics;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A8F44B4D-BAB4-5176-8705-5984xxxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The error message statistics of the scaling activity.</p>
         */
        public Builder scalingActivityErrorCodeStatistics(ScalingActivityErrorCodeStatistics scalingActivityErrorCodeStatistics) {
            this.scalingActivityErrorCodeStatistics = scalingActivityErrorCodeStatistics;
            return this;
        }

        /**
         * <p>The statistical metrics of the scaling activity status.</p>
         */
        public Builder scalingActivityStatusStatistics(ScalingActivityStatusStatistics scalingActivityStatusStatistics) {
            this.scalingActivityStatusStatistics = scalingActivityStatusStatistics;
            return this;
        }

        public DescribeScalingActivityStatisticsResponseBody build() {
            return new DescribeScalingActivityStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeScalingActivityStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingActivityStatisticsResponseBody</p>
     */
    public static class ErrorStatistic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        private ErrorStatistic(Builder builder) {
            this.count = builder.count;
            this.errorCode = builder.errorCode;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorStatistic create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private Integer count; 
            private String errorCode; 
            private String time; 

            private Builder() {
            } 

            private Builder(ErrorStatistic model) {
                this.count = model.count;
                this.errorCode = model.errorCode;
                this.time = model.time;
            } 

            /**
             * <p>The number of failed scaling activities.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>Scaling Activity Error Codes</p>
             * 
             * <strong>example:</strong>
             * <p>QuotaExceeded.PrivateIpAddress</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The time when the statistics are generated. The time is in UTC. Format: yyyyMMddHH.</p>
             * 
             * <strong>example:</strong>
             * <p>2025121623</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public ErrorStatistic build() {
                return new ErrorStatistic(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeScalingActivityStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingActivityStatisticsResponseBody</p>
     */
    public static class ScalingActivityErrorCodeStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorStatistic")
        private java.util.List<ErrorStatistic> errorStatistic;

        private ScalingActivityErrorCodeStatistics(Builder builder) {
            this.errorStatistic = builder.errorStatistic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScalingActivityErrorCodeStatistics create() {
            return builder().build();
        }

        /**
         * @return errorStatistic
         */
        public java.util.List<ErrorStatistic> getErrorStatistic() {
            return this.errorStatistic;
        }

        public static final class Builder {
            private java.util.List<ErrorStatistic> errorStatistic; 

            private Builder() {
            } 

            private Builder(ScalingActivityErrorCodeStatistics model) {
                this.errorStatistic = model.errorStatistic;
            } 

            /**
             * ErrorStatistic.
             */
            public Builder errorStatistic(java.util.List<ErrorStatistic> errorStatistic) {
                this.errorStatistic = errorStatistic;
                return this;
            }

            public ScalingActivityErrorCodeStatistics build() {
                return new ScalingActivityErrorCodeStatistics(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeScalingActivityStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingActivityStatisticsResponseBody</p>
     */
    public static class Statistic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailedActivityCount")
        private Integer failedActivityCount;

        @com.aliyun.core.annotation.NameInMap("SuccessActivityCount")
        private Integer successActivityCount;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        @com.aliyun.core.annotation.NameInMap("WarningActivityCount")
        private Integer warningActivityCount;

        private Statistic(Builder builder) {
            this.failedActivityCount = builder.failedActivityCount;
            this.successActivityCount = builder.successActivityCount;
            this.time = builder.time;
            this.warningActivityCount = builder.warningActivityCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Statistic create() {
            return builder().build();
        }

        /**
         * @return failedActivityCount
         */
        public Integer getFailedActivityCount() {
            return this.failedActivityCount;
        }

        /**
         * @return successActivityCount
         */
        public Integer getSuccessActivityCount() {
            return this.successActivityCount;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return warningActivityCount
         */
        public Integer getWarningActivityCount() {
            return this.warningActivityCount;
        }

        public static final class Builder {
            private Integer failedActivityCount; 
            private Integer successActivityCount; 
            private String time; 
            private Integer warningActivityCount; 

            private Builder() {
            } 

            private Builder(Statistic model) {
                this.failedActivityCount = model.failedActivityCount;
                this.successActivityCount = model.successActivityCount;
                this.time = model.time;
                this.warningActivityCount = model.warningActivityCount;
            } 

            /**
             * <p>The number of failed scaling activities.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder failedActivityCount(Integer failedActivityCount) {
                this.failedActivityCount = failedActivityCount;
                return this;
            }

            /**
             * <p>The number of successful scaling activities.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder successActivityCount(Integer successActivityCount) {
                this.successActivityCount = successActivityCount;
                return this;
            }

            /**
             * <p>The time when the statistics are generated. The time is in UTC. Format: yyyyMMddHH.</p>
             * 
             * <strong>example:</strong>
             * <p>2025121623</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The number of partially executed scaling activities.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder warningActivityCount(Integer warningActivityCount) {
                this.warningActivityCount = warningActivityCount;
                return this;
            }

            public Statistic build() {
                return new Statistic(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeScalingActivityStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingActivityStatisticsResponseBody</p>
     */
    public static class ScalingActivityStatusStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Statistic")
        private java.util.List<Statistic> statistic;

        private ScalingActivityStatusStatistics(Builder builder) {
            this.statistic = builder.statistic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScalingActivityStatusStatistics create() {
            return builder().build();
        }

        /**
         * @return statistic
         */
        public java.util.List<Statistic> getStatistic() {
            return this.statistic;
        }

        public static final class Builder {
            private java.util.List<Statistic> statistic; 

            private Builder() {
            } 

            private Builder(ScalingActivityStatusStatistics model) {
                this.statistic = model.statistic;
            } 

            /**
             * Statistic.
             */
            public Builder statistic(java.util.List<Statistic> statistic) {
                this.statistic = statistic;
                return this;
            }

            public ScalingActivityStatusStatistics build() {
                return new ScalingActivityStatusStatistics(this);
            } 

        } 

    }
}
