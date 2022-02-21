// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstancePerformanceRestrictHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstancePerformanceRestrictHistoryResponseBody</p>
 */
public class DescribeInstancePerformanceRestrictHistoryResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("PerformanceRestrictHistories")
    private PerformanceRestrictHistories performanceRestrictHistories;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeInstancePerformanceRestrictHistoryResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.performanceRestrictHistories = builder.performanceRestrictHistories;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstancePerformanceRestrictHistoryResponseBody create() {
        return builder().build();
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
     * @return performanceRestrictHistories
     */
    public PerformanceRestrictHistories getPerformanceRestrictHistories() {
        return this.performanceRestrictHistories;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private PerformanceRestrictHistories performanceRestrictHistories; 
        private String requestId; 
        private Integer totalCount; 

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
         * PerformanceRestrictHistories.
         */
        public Builder performanceRestrictHistories(PerformanceRestrictHistories performanceRestrictHistories) {
            this.performanceRestrictHistories = performanceRestrictHistories;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstancePerformanceRestrictHistoryResponseBody build() {
            return new DescribeInstancePerformanceRestrictHistoryResponseBody(this);
        } 

    } 

    public static class Intervals extends TeaModel {
        @NameInMap("Interval")
        private java.util.List < String > interval;

        private Intervals(Builder builder) {
            this.interval = builder.interval;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Intervals create() {
            return builder().build();
        }

        /**
         * @return interval
         */
        public java.util.List < String > getInterval() {
            return this.interval;
        }

        public static final class Builder {
            private java.util.List < String > interval; 

            /**
             * Interval.
             */
            public Builder interval(java.util.List < String > interval) {
                this.interval = interval;
                return this;
            }

            public Intervals build() {
                return new Intervals(this);
            } 

        } 

    }
    public static class PerformanceRestrictHistory extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Intervals")
        private Intervals intervals;

        private PerformanceRestrictHistory(Builder builder) {
            this.instanceId = builder.instanceId;
            this.intervals = builder.intervals;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PerformanceRestrictHistory create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return intervals
         */
        public Intervals getIntervals() {
            return this.intervals;
        }

        public static final class Builder {
            private String instanceId; 
            private Intervals intervals; 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Intervals.
             */
            public Builder intervals(Intervals intervals) {
                this.intervals = intervals;
                return this;
            }

            public PerformanceRestrictHistory build() {
                return new PerformanceRestrictHistory(this);
            } 

        } 

    }
    public static class PerformanceRestrictHistories extends TeaModel {
        @NameInMap("PerformanceRestrictHistory")
        private java.util.List < PerformanceRestrictHistory> performanceRestrictHistory;

        private PerformanceRestrictHistories(Builder builder) {
            this.performanceRestrictHistory = builder.performanceRestrictHistory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PerformanceRestrictHistories create() {
            return builder().build();
        }

        /**
         * @return performanceRestrictHistory
         */
        public java.util.List < PerformanceRestrictHistory> getPerformanceRestrictHistory() {
            return this.performanceRestrictHistory;
        }

        public static final class Builder {
            private java.util.List < PerformanceRestrictHistory> performanceRestrictHistory; 

            /**
             * PerformanceRestrictHistory.
             */
            public Builder performanceRestrictHistory(java.util.List < PerformanceRestrictHistory> performanceRestrictHistory) {
                this.performanceRestrictHistory = performanceRestrictHistory;
                return this;
            }

            public PerformanceRestrictHistories build() {
                return new PerformanceRestrictHistories(this);
            } 

        } 

    }
}
