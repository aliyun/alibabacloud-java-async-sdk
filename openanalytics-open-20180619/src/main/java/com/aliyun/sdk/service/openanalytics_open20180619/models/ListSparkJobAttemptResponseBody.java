// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openanalytics_open20180619.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListSparkJobAttemptResponseBody} extends {@link TeaModel}
 *
 * <p>ListSparkJobAttemptResponseBody</p>
 */
public class ListSparkJobAttemptResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataResult")
    private DataResult dataResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListSparkJobAttemptResponseBody(Builder builder) {
        this.dataResult = builder.dataResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSparkJobAttemptResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataResult
     */
    public DataResult getDataResult() {
        return this.dataResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DataResult dataResult; 
        private String requestId; 

        /**
         * DataResult.
         */
        public Builder dataResult(DataResult dataResult) {
            this.dataResult = dataResult;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListSparkJobAttemptResponseBody build() {
            return new ListSparkJobAttemptResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSparkJobAttemptResponseBody} extends {@link TeaModel}
     *
     * <p>ListSparkJobAttemptResponseBody</p>
     */
    public static class JobAttemptList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateTimeValue")
        private String createTimeValue;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("DurationTime")
        private String durationTime;

        @com.aliyun.core.annotation.NameInMap("DurationTimeValue")
        private String durationTimeValue;

        @com.aliyun.core.annotation.NameInMap("JobAttemptId")
        private String jobAttemptId;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("JobName")
        private String jobName;

        @com.aliyun.core.annotation.NameInMap("SparkUI")
        private String sparkUI;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TerminatedTime")
        private String terminatedTime;

        @com.aliyun.core.annotation.NameInMap("TerminatedTimeValue")
        private String terminatedTimeValue;

        @com.aliyun.core.annotation.NameInMap("VcName")
        private String vcName;

        private JobAttemptList(Builder builder) {
            this.createTime = builder.createTime;
            this.createTimeValue = builder.createTimeValue;
            this.detail = builder.detail;
            this.durationTime = builder.durationTime;
            this.durationTimeValue = builder.durationTimeValue;
            this.jobAttemptId = builder.jobAttemptId;
            this.jobId = builder.jobId;
            this.jobName = builder.jobName;
            this.sparkUI = builder.sparkUI;
            this.status = builder.status;
            this.terminatedTime = builder.terminatedTime;
            this.terminatedTimeValue = builder.terminatedTimeValue;
            this.vcName = builder.vcName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobAttemptList create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createTimeValue
         */
        public String getCreateTimeValue() {
            return this.createTimeValue;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return durationTime
         */
        public String getDurationTime() {
            return this.durationTime;
        }

        /**
         * @return durationTimeValue
         */
        public String getDurationTimeValue() {
            return this.durationTimeValue;
        }

        /**
         * @return jobAttemptId
         */
        public String getJobAttemptId() {
            return this.jobAttemptId;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        /**
         * @return sparkUI
         */
        public String getSparkUI() {
            return this.sparkUI;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return terminatedTime
         */
        public String getTerminatedTime() {
            return this.terminatedTime;
        }

        /**
         * @return terminatedTimeValue
         */
        public String getTerminatedTimeValue() {
            return this.terminatedTimeValue;
        }

        /**
         * @return vcName
         */
        public String getVcName() {
            return this.vcName;
        }

        public static final class Builder {
            private String createTime; 
            private String createTimeValue; 
            private String detail; 
            private String durationTime; 
            private String durationTimeValue; 
            private String jobAttemptId; 
            private String jobId; 
            private String jobName; 
            private String sparkUI; 
            private String status; 
            private String terminatedTime; 
            private String terminatedTimeValue; 
            private String vcName; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreateTimeValue.
             */
            public Builder createTimeValue(String createTimeValue) {
                this.createTimeValue = createTimeValue;
                return this;
            }

            /**
             * Detail.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * DurationTime.
             */
            public Builder durationTime(String durationTime) {
                this.durationTime = durationTime;
                return this;
            }

            /**
             * DurationTimeValue.
             */
            public Builder durationTimeValue(String durationTimeValue) {
                this.durationTimeValue = durationTimeValue;
                return this;
            }

            /**
             * JobAttemptId.
             */
            public Builder jobAttemptId(String jobAttemptId) {
                this.jobAttemptId = jobAttemptId;
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
             * JobName.
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * SparkUI.
             */
            public Builder sparkUI(String sparkUI) {
                this.sparkUI = sparkUI;
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
             * TerminatedTime.
             */
            public Builder terminatedTime(String terminatedTime) {
                this.terminatedTime = terminatedTime;
                return this;
            }

            /**
             * TerminatedTimeValue.
             */
            public Builder terminatedTimeValue(String terminatedTimeValue) {
                this.terminatedTimeValue = terminatedTimeValue;
                return this;
            }

            /**
             * VcName.
             */
            public Builder vcName(String vcName) {
                this.vcName = vcName;
                return this;
            }

            public JobAttemptList build() {
                return new JobAttemptList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSparkJobAttemptResponseBody} extends {@link TeaModel}
     *
     * <p>ListSparkJobAttemptResponseBody</p>
     */
    public static class DataResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobAttemptList")
        private java.util.List < JobAttemptList> jobAttemptList;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private String pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private String pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private String totalCount;

        private DataResult(Builder builder) {
            this.jobAttemptList = builder.jobAttemptList;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataResult create() {
            return builder().build();
        }

        /**
         * @return jobAttemptList
         */
        public java.util.List < JobAttemptList> getJobAttemptList() {
            return this.jobAttemptList;
        }

        /**
         * @return pageNumber
         */
        public String getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public String getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public String getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < JobAttemptList> jobAttemptList; 
            private String pageNumber; 
            private String pageSize; 
            private String totalCount; 

            /**
             * JobAttemptList.
             */
            public Builder jobAttemptList(java.util.List < JobAttemptList> jobAttemptList) {
                this.jobAttemptList = jobAttemptList;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(String pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(String pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(String totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public DataResult build() {
                return new DataResult(this);
            } 

        } 

    }
}
