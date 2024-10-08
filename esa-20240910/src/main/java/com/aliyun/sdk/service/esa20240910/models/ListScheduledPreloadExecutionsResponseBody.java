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
         * Executions.
         */
        public Builder executions(java.util.List < Executions> executions) {
            this.executions = executions;
            return this;
        }

        /**
         * <p>Id of the request</p>
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
             * AliUid.
             */
            public Builder aliUid(String aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Interval.
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * SliceLen.
             */
            public Builder sliceLen(Integer sliceLen) {
                this.sliceLen = sliceLen;
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

            public Executions build() {
                return new Executions(this);
            } 

        } 

    }
}
