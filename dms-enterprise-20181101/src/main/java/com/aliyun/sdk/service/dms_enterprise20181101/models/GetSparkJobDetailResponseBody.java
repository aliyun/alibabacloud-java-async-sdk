// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkJobDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetSparkJobDetailResponseBody</p>
 */
public class GetSparkJobDetailResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("JobDetail")
    private JobDetail jobDetail;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetSparkJobDetailResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.jobDetail = builder.jobDetail;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSparkJobDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private JobDetail jobDetail; 
        private String requestId; 
        private Boolean success; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * Details of the spark job
         */
        public Builder jobDetail(JobDetail jobDetail) {
            this.jobDetail = jobDetail;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetSparkJobDetailResponseBody build() {
            return new GetSparkJobDetailResponseBody(this);
        } 

    } 

    public static class JobDetail extends TeaModel {
        @NameInMap("Arguments")
        private String arguments;

        @NameInMap("BeginTime")
        private String beginTime;

        @NameInMap("Configuration")
        private String configuration;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("MainClass")
        private String mainClass;

        @NameInMap("MainFile")
        private String mainFile;

        @NameInMap("Name")
        private String name;

        @NameInMap("Status")
        private String status;

        @NameInMap("SubmitTime")
        private String submitTime;

        private JobDetail(Builder builder) {
            this.arguments = builder.arguments;
            this.beginTime = builder.beginTime;
            this.configuration = builder.configuration;
            this.endTime = builder.endTime;
            this.jobId = builder.jobId;
            this.mainClass = builder.mainClass;
            this.mainFile = builder.mainFile;
            this.name = builder.name;
            this.status = builder.status;
            this.submitTime = builder.submitTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobDetail create() {
            return builder().build();
        }

        /**
         * @return arguments
         */
        public String getArguments() {
            return this.arguments;
        }

        /**
         * @return beginTime
         */
        public String getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return configuration
         */
        public String getConfiguration() {
            return this.configuration;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return mainClass
         */
        public String getMainClass() {
            return this.mainClass;
        }

        /**
         * @return mainFile
         */
        public String getMainFile() {
            return this.mainFile;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
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

        public static final class Builder {
            private String arguments; 
            private String beginTime; 
            private String configuration; 
            private String endTime; 
            private String jobId; 
            private String mainClass; 
            private String mainFile; 
            private String name; 
            private String status; 
            private String submitTime; 

            /**
             * Arguments.
             */
            public Builder arguments(String arguments) {
                this.arguments = arguments;
                return this;
            }

            /**
             * BeginTime.
             */
            public Builder beginTime(String beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * Configuration.
             */
            public Builder configuration(String configuration) {
                this.configuration = configuration;
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
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * MainClass.
             */
            public Builder mainClass(String mainClass) {
                this.mainClass = mainClass;
                return this;
            }

            /**
             * MainFile.
             */
            public Builder mainFile(String mainFile) {
                this.mainFile = mainFile;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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

            public JobDetail build() {
                return new JobDetail(this);
            } 

        } 

    }
}
