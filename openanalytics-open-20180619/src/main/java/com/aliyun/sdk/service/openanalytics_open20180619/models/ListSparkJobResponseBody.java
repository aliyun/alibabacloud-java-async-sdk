// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openanalytics_open20180619.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSparkJobResponseBody} extends {@link TeaModel}
 *
 * <p>ListSparkJobResponseBody</p>
 */
public class ListSparkJobResponseBody extends TeaModel {
    @NameInMap("DataResult")
    private DataResult dataResult;

    @NameInMap("RequestId")
    private String requestId;

    private ListSparkJobResponseBody(Builder builder) {
        this.dataResult = builder.dataResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSparkJobResponseBody create() {
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

        public ListSparkJobResponseBody build() {
            return new ListSparkJobResponseBody(this);
        } 

    } 

    public static class JobList extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CreateTimeValue")
        private String createTimeValue;

        @NameInMap("Detail")
        private String detail;

        @NameInMap("DriverResourceSpec")
        private String driverResourceSpec;

        @NameInMap("ExecutorInstances")
        private String executorInstances;

        @NameInMap("ExecutorResourceSpec")
        private String executorResourceSpec;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("JobName")
        private String jobName;

        @NameInMap("SparkUI")
        private String sparkUI;

        @NameInMap("Status")
        private String status;

        @NameInMap("SubmitTime")
        private String submitTime;

        @NameInMap("SubmitTimeValue")
        private String submitTimeValue;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("UpdateTimeValue")
        private String updateTimeValue;

        @NameInMap("VcName")
        private String vcName;

        private JobList(Builder builder) {
            this.createTime = builder.createTime;
            this.createTimeValue = builder.createTimeValue;
            this.detail = builder.detail;
            this.driverResourceSpec = builder.driverResourceSpec;
            this.executorInstances = builder.executorInstances;
            this.executorResourceSpec = builder.executorResourceSpec;
            this.jobId = builder.jobId;
            this.jobName = builder.jobName;
            this.sparkUI = builder.sparkUI;
            this.status = builder.status;
            this.submitTime = builder.submitTime;
            this.submitTimeValue = builder.submitTimeValue;
            this.updateTime = builder.updateTime;
            this.updateTimeValue = builder.updateTimeValue;
            this.vcName = builder.vcName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobList create() {
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
         * @return driverResourceSpec
         */
        public String getDriverResourceSpec() {
            return this.driverResourceSpec;
        }

        /**
         * @return executorInstances
         */
        public String getExecutorInstances() {
            return this.executorInstances;
        }

        /**
         * @return executorResourceSpec
         */
        public String getExecutorResourceSpec() {
            return this.executorResourceSpec;
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
         * @return submitTime
         */
        public String getSubmitTime() {
            return this.submitTime;
        }

        /**
         * @return submitTimeValue
         */
        public String getSubmitTimeValue() {
            return this.submitTimeValue;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return updateTimeValue
         */
        public String getUpdateTimeValue() {
            return this.updateTimeValue;
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
            private String driverResourceSpec; 
            private String executorInstances; 
            private String executorResourceSpec; 
            private String jobId; 
            private String jobName; 
            private String sparkUI; 
            private String status; 
            private String submitTime; 
            private String submitTimeValue; 
            private String updateTime; 
            private String updateTimeValue; 
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
             * DriverResourceSpec.
             */
            public Builder driverResourceSpec(String driverResourceSpec) {
                this.driverResourceSpec = driverResourceSpec;
                return this;
            }

            /**
             * ExecutorInstances.
             */
            public Builder executorInstances(String executorInstances) {
                this.executorInstances = executorInstances;
                return this;
            }

            /**
             * ExecutorResourceSpec.
             */
            public Builder executorResourceSpec(String executorResourceSpec) {
                this.executorResourceSpec = executorResourceSpec;
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
             * SubmitTime.
             */
            public Builder submitTime(String submitTime) {
                this.submitTime = submitTime;
                return this;
            }

            /**
             * SubmitTimeValue.
             */
            public Builder submitTimeValue(String submitTimeValue) {
                this.submitTimeValue = submitTimeValue;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * UpdateTimeValue.
             */
            public Builder updateTimeValue(String updateTimeValue) {
                this.updateTimeValue = updateTimeValue;
                return this;
            }

            /**
             * VcName.
             */
            public Builder vcName(String vcName) {
                this.vcName = vcName;
                return this;
            }

            public JobList build() {
                return new JobList(this);
            } 

        } 

    }
    public static class DataResult extends TeaModel {
        @NameInMap("JobList")
        private java.util.List < JobList> jobList;

        @NameInMap("PageNumber")
        private String pageNumber;

        @NameInMap("PageSize")
        private String pageSize;

        @NameInMap("TotalCount")
        private String totalCount;

        private DataResult(Builder builder) {
            this.jobList = builder.jobList;
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
         * @return jobList
         */
        public java.util.List < JobList> getJobList() {
            return this.jobList;
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
            private java.util.List < JobList> jobList; 
            private String pageNumber; 
            private String pageSize; 
            private String totalCount; 

            /**
             * JobList.
             */
            public Builder jobList(java.util.List < JobList> jobList) {
                this.jobList = jobList;
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
