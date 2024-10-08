// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateScheduledPreloadExecutionsResponseBody} extends {@link TeaModel}
 *
 * <p>CreateScheduledPreloadExecutionsResponseBody</p>
 */
public class CreateScheduledPreloadExecutionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailedExecutions")
    private java.util.List < FailedExecutions> failedExecutions;

    @com.aliyun.core.annotation.NameInMap("FailedMessages")
    private java.util.List < String > failedMessages;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SuccessCount")
    private Integer successCount;

    @com.aliyun.core.annotation.NameInMap("SuccessExecutions")
    private java.util.List < SuccessExecutions> successExecutions;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private CreateScheduledPreloadExecutionsResponseBody(Builder builder) {
        this.failedExecutions = builder.failedExecutions;
        this.failedMessages = builder.failedMessages;
        this.requestId = builder.requestId;
        this.successCount = builder.successCount;
        this.successExecutions = builder.successExecutions;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScheduledPreloadExecutionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return failedExecutions
     */
    public java.util.List < FailedExecutions> getFailedExecutions() {
        return this.failedExecutions;
    }

    /**
     * @return failedMessages
     */
    public java.util.List < String > getFailedMessages() {
        return this.failedMessages;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return successCount
     */
    public Integer getSuccessCount() {
        return this.successCount;
    }

    /**
     * @return successExecutions
     */
    public java.util.List < SuccessExecutions> getSuccessExecutions() {
        return this.successExecutions;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < FailedExecutions> failedExecutions; 
        private java.util.List < String > failedMessages; 
        private String requestId; 
        private Integer successCount; 
        private java.util.List < SuccessExecutions> successExecutions; 
        private Integer totalCount; 

        /**
         * FailedExecutions.
         */
        public Builder failedExecutions(java.util.List < FailedExecutions> failedExecutions) {
            this.failedExecutions = failedExecutions;
            return this;
        }

        /**
         * FailedMessages.
         */
        public Builder failedMessages(java.util.List < String > failedMessages) {
            this.failedMessages = failedMessages;
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
         * SuccessCount.
         */
        public Builder successCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }

        /**
         * SuccessExecutions.
         */
        public Builder successExecutions(java.util.List < SuccessExecutions> successExecutions) {
            this.successExecutions = successExecutions;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public CreateScheduledPreloadExecutionsResponseBody build() {
            return new CreateScheduledPreloadExecutionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateScheduledPreloadExecutionsResponseBody} extends {@link TeaModel}
     *
     * <p>CreateScheduledPreloadExecutionsResponseBody</p>
     */
    public static class FailedExecutions extends TeaModel {
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

        private FailedExecutions(Builder builder) {
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

        public static FailedExecutions create() {
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

            public FailedExecutions build() {
                return new FailedExecutions(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateScheduledPreloadExecutionsResponseBody} extends {@link TeaModel}
     *
     * <p>CreateScheduledPreloadExecutionsResponseBody</p>
     */
    public static class SuccessExecutions extends TeaModel {
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

        private SuccessExecutions(Builder builder) {
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

        public static SuccessExecutions create() {
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

            public SuccessExecutions build() {
                return new SuccessExecutions(this);
            } 

        } 

    }
}
