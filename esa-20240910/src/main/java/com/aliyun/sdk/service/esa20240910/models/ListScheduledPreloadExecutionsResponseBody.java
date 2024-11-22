// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListScheduledPreloadExecutionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListScheduledPreloadExecutionsResponseBody</p>
 */
public class ListScheduledPreloadExecutionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Executions")
    private java.util.List < Executions> executions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListScheduledPreloadExecutionsResponseBody(Builder builder) {
        this.executions = builder.executions;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScheduledPreloadExecutionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return executions
     */
    public java.util.List < Executions> getExecutions() {
        return this.executions;
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
        private java.util.List < Executions> executions; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The information about prefetch plans returned.</p>
         */
        public Builder executions(java.util.List < Executions> executions) {
            this.executions = executions;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ET5BF670-09D5-4D0B-BEBY-D96A2A528000</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListScheduledPreloadExecutionsResponseBody build() {
            return new ListScheduledPreloadExecutionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListScheduledPreloadExecutionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListScheduledPreloadExecutionsResponseBody</p>
     */
    public static class Executions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private String aliUid;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private Integer interval;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("SliceLen")
        private Integer sliceLen;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Executions(Builder builder) {
            this.aliUid = builder.aliUid;
            this.endTime = builder.endTime;
            this.id = builder.id;
            this.interval = builder.interval;
            this.jobId = builder.jobId;
            this.sliceLen = builder.sliceLen;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Executions create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public String getAliUid() {
            return this.aliUid;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return sliceLen
         */
        public Integer getSliceLen() {
            return this.sliceLen;
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

        public static final class Builder {
            private String aliUid; 
            private String endTime; 
            private String id; 
            private Integer interval; 
            private String jobId; 
            private Integer sliceLen; 
            private String startTime; 
            private String status; 

            /**
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>15685865xxx14622</p>
             */
            public Builder aliUid(String aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The end time of the prefetch plan.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-05-31T18:10:48.849+08:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The ID of the prefetch plan.</p>
             * 
             * <strong>example:</strong>
             * <p>66599bd7397885b43804901c</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The time interval between each batch execution in the plan. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>The ID of the prefetch task.</p>
             * 
             * <strong>example:</strong>
             * <p>665d3af3621bccf3fe29e1a4</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The number of URLs prefetched in each batch.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder sliceLen(Integer sliceLen) {
                this.sliceLen = sliceLen;
                return this;
            }

            /**
             * <p>The start time of the prefetch plan.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-05-31T17:10:48.849+08:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the prefetch plan. Valid values:</p>
             * <ul>
             * <li><strong>waiting</strong></li>
             * <li><strong>running</strong></li>
             * <li><strong>finished</strong></li>
             * <li><strong>failed</strong></li>
             * <li><strong>stopped</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Executions build() {
                return new Executions(this);
            } 

        } 

    }
}
