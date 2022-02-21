// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailableTimeRangeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAvailableTimeRangeResponseBody</p>
 */
public class DescribeAvailableTimeRangeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TimeRange")
    private TimeRange timeRange;

    private DescribeAvailableTimeRangeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.timeRange = builder.timeRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableTimeRangeResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return timeRange
     */
    public TimeRange getTimeRange() {
        return this.timeRange;
    }

    public static final class Builder {
        private String requestId; 
        private TimeRange timeRange; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TimeRange.
         */
        public Builder timeRange(TimeRange timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        public DescribeAvailableTimeRangeResponseBody build() {
            return new DescribeAvailableTimeRangeResponseBody(this);
        } 

    } 

    public static class TimeRangeTimeRange extends TeaModel {
        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("NodeId")
        private String nodeId;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("TaskId")
        private String taskId;

        private TimeRangeTimeRange(Builder builder) {
            this.endTime = builder.endTime;
            this.nodeId = builder.nodeId;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeRangeTimeRange create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String endTime; 
            private String nodeId; 
            private String startTime; 
            private String status; 
            private String taskId; 

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public TimeRangeTimeRange build() {
                return new TimeRangeTimeRange(this);
            } 

        } 

    }
    public static class TimeRange extends TeaModel {
        @NameInMap("TimeRange")
        private java.util.List < TimeRangeTimeRange> timeRange;

        private TimeRange(Builder builder) {
            this.timeRange = builder.timeRange;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeRange create() {
            return builder().build();
        }

        /**
         * @return timeRange
         */
        public java.util.List < TimeRangeTimeRange> getTimeRange() {
            return this.timeRange;
        }

        public static final class Builder {
            private java.util.List < TimeRangeTimeRange> timeRange; 

            /**
             * TimeRange.
             */
            public Builder timeRange(java.util.List < TimeRangeTimeRange> timeRange) {
                this.timeRange = timeRange;
                return this;
            }

            public TimeRange build() {
                return new TimeRange(this);
            } 

        } 

    }
}
