// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link ListSuccessInstanceAmountResponseBody} extends {@link TeaModel}
 *
 * <p>ListSuccessInstanceAmountResponseBody</p>
 */
public class ListSuccessInstanceAmountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceStatusTrend")
    private InstanceStatusTrend instanceStatusTrend;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListSuccessInstanceAmountResponseBody(Builder builder) {
        this.instanceStatusTrend = builder.instanceStatusTrend;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSuccessInstanceAmountResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceStatusTrend
     */
    public InstanceStatusTrend getInstanceStatusTrend() {
        return this.instanceStatusTrend;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InstanceStatusTrend instanceStatusTrend; 
        private String requestId; 

        /**
         * <p>Indicates the trend of the number of auto triggered node instances that are successfully run every hour on the hour of the current day.</p>
         */
        public Builder instanceStatusTrend(InstanceStatusTrend instanceStatusTrend) {
            this.instanceStatusTrend = instanceStatusTrend;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>952795279527ab****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListSuccessInstanceAmountResponseBody build() {
            return new ListSuccessInstanceAmountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSuccessInstanceAmountResponseBody} extends {@link TeaModel}
     *
     * <p>ListSuccessInstanceAmountResponseBody</p>
     */
    public static class AvgTrend extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("TimePoint")
        private String timePoint;

        private AvgTrend(Builder builder) {
            this.count = builder.count;
            this.timePoint = builder.timePoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvgTrend create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return timePoint
         */
        public String getTimePoint() {
            return this.timePoint;
        }

        public static final class Builder {
            private Integer count; 
            private String timePoint; 

            /**
             * <p>The number of instances that are successfully run.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The point in time. The value is an exact hour that ranges from 00:00 to 23:00, such as 00:00, 01:00, or 02:00.</p>
             * 
             * <strong>example:</strong>
             * <p>01:00</p>
             */
            public Builder timePoint(String timePoint) {
                this.timePoint = timePoint;
                return this;
            }

            public AvgTrend build() {
                return new AvgTrend(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSuccessInstanceAmountResponseBody} extends {@link TeaModel}
     *
     * <p>ListSuccessInstanceAmountResponseBody</p>
     */
    public static class TodayTrend extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("TimePoint")
        private String timePoint;

        private TodayTrend(Builder builder) {
            this.count = builder.count;
            this.timePoint = builder.timePoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TodayTrend create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return timePoint
         */
        public String getTimePoint() {
            return this.timePoint;
        }

        public static final class Builder {
            private Integer count; 
            private String timePoint; 

            /**
             * <p>The number of instances that are successfully run.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The point in time. The value is an exact hour that ranges from 00:00 to 23:00, such as 00:00, 01:00, or 02:00.</p>
             * 
             * <strong>example:</strong>
             * <p>01:00</p>
             */
            public Builder timePoint(String timePoint) {
                this.timePoint = timePoint;
                return this;
            }

            public TodayTrend build() {
                return new TodayTrend(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSuccessInstanceAmountResponseBody} extends {@link TeaModel}
     *
     * <p>ListSuccessInstanceAmountResponseBody</p>
     */
    public static class YesterdayTrend extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("TimePoint")
        private String timePoint;

        private YesterdayTrend(Builder builder) {
            this.count = builder.count;
            this.timePoint = builder.timePoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static YesterdayTrend create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return timePoint
         */
        public String getTimePoint() {
            return this.timePoint;
        }

        public static final class Builder {
            private Integer count; 
            private String timePoint; 

            /**
             * <p>The number of instances that are successfully run.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The point in time. The value is an exact hour that ranges from 00:00 to 23:00, such as 00:00, 01:00, or 02:00.</p>
             * 
             * <strong>example:</strong>
             * <p>01:00</p>
             */
            public Builder timePoint(String timePoint) {
                this.timePoint = timePoint;
                return this;
            }

            public YesterdayTrend build() {
                return new YesterdayTrend(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSuccessInstanceAmountResponseBody} extends {@link TeaModel}
     *
     * <p>ListSuccessInstanceAmountResponseBody</p>
     */
    public static class InstanceStatusTrend extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvgTrend")
        private java.util.List<AvgTrend> avgTrend;

        @com.aliyun.core.annotation.NameInMap("TodayTrend")
        private java.util.List<TodayTrend> todayTrend;

        @com.aliyun.core.annotation.NameInMap("YesterdayTrend")
        private java.util.List<YesterdayTrend> yesterdayTrend;

        private InstanceStatusTrend(Builder builder) {
            this.avgTrend = builder.avgTrend;
            this.todayTrend = builder.todayTrend;
            this.yesterdayTrend = builder.yesterdayTrend;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceStatusTrend create() {
            return builder().build();
        }

        /**
         * @return avgTrend
         */
        public java.util.List<AvgTrend> getAvgTrend() {
            return this.avgTrend;
        }

        /**
         * @return todayTrend
         */
        public java.util.List<TodayTrend> getTodayTrend() {
            return this.todayTrend;
        }

        /**
         * @return yesterdayTrend
         */
        public java.util.List<YesterdayTrend> getYesterdayTrend() {
            return this.yesterdayTrend;
        }

        public static final class Builder {
            private java.util.List<AvgTrend> avgTrend; 
            private java.util.List<TodayTrend> todayTrend; 
            private java.util.List<YesterdayTrend> yesterdayTrend; 

            /**
             * <p>The average trend.</p>
             */
            public Builder avgTrend(java.util.List<AvgTrend> avgTrend) {
                this.avgTrend = avgTrend;
                return this;
            }

            /**
             * <p>The trend of the number of auto triggered node instances that are successfully run on the current day.</p>
             */
            public Builder todayTrend(java.util.List<TodayTrend> todayTrend) {
                this.todayTrend = todayTrend;
                return this;
            }

            /**
             * <p>The trend of the number of auto triggered node instances that are successfully run one day earlier than the current day.</p>
             */
            public Builder yesterdayTrend(java.util.List<YesterdayTrend> yesterdayTrend) {
                this.yesterdayTrend = yesterdayTrend;
                return this;
            }

            public InstanceStatusTrend build() {
                return new InstanceStatusTrend(this);
            } 

        } 

    }
}
