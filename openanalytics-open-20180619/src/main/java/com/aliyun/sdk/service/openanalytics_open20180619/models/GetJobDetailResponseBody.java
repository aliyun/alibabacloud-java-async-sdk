// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openanalytics_open20180619.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJobDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetJobDetailResponseBody</p>
 */
public class GetJobDetailResponseBody extends TeaModel {
    @NameInMap("JobDetail")
    private JobDetail jobDetail;

    @NameInMap("RequestId")
    private String requestId;

    private GetJobDetailResponseBody(Builder builder) {
        this.jobDetail = builder.jobDetail;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return jobDetail
     */
    public JobDetail getJobDetail() {
        return this.jobDetail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private JobDetail jobDetail; 
        private String requestId; 

        /**
         * JobDetail.
         */
        public Builder jobDetail(JobDetail jobDetail) {
            this.jobDetail = jobDetail;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetJobDetailResponseBody build() {
            return new GetJobDetailResponseBody(this);
        } 

    } 

    public static class JobDetail extends TeaModel {
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

        @NameInMap("LastJobAttemptId")
        private String lastJobAttemptId;

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

        private JobDetail(Builder builder) {
            this.createTime = builder.createTime;
            this.createTimeValue = builder.createTimeValue;
            this.detail = builder.detail;
            this.driverResourceSpec = builder.driverResourceSpec;
            this.executorInstances = builder.executorInstances;
            this.executorResourceSpec = builder.executorResourceSpec;
            this.jobId = builder.jobId;
            this.jobName = builder.jobName;
            this.lastJobAttemptId = builder.lastJobAttemptId;
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

        public static JobDetail create() {
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
         * @return lastJobAttemptId
         */
        public String getLastJobAttemptId() {
            return this.lastJobAttemptId;
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
            private String lastJobAttemptId; 
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
             * LastJobAttemptId.
             */
            public Builder lastJobAttemptId(String lastJobAttemptId) {
                this.lastJobAttemptId = lastJobAttemptId;
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

            public JobDetail build() {
                return new JobDetail(this);
            } 

        } 

    }
}
