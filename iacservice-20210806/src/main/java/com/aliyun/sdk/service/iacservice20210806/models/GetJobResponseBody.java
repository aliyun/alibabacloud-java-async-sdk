// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link GetJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetJobResponseBody</p>
 */
public class GetJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("job")
    private Job job;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetJobResponseBody(Builder builder) {
        this.job = builder.job;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return job
     */
    public Job getJob() {
        return this.job;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Job job; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetJobResponseBody model) {
            this.job = model.job;
            this.requestId = model.requestId;
        } 

        /**
         * job.
         */
        public Builder job(Job job) {
            this.job = job;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetJobResponseBody build() {
            return new GetJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobResponseBody</p>
     */
    public static class AssertCheckDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("comparison")
        private String comparison;

        @com.aliyun.core.annotation.NameInMap("expectedValue")
        private String expectedValue;

        @com.aliyun.core.annotation.NameInMap("isPass")
        private Boolean isPass;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private AssertCheckDetail(Builder builder) {
            this.comparison = builder.comparison;
            this.expectedValue = builder.expectedValue;
            this.isPass = builder.isPass;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssertCheckDetail create() {
            return builder().build();
        }

        /**
         * @return comparison
         */
        public String getComparison() {
            return this.comparison;
        }

        /**
         * @return expectedValue
         */
        public String getExpectedValue() {
            return this.expectedValue;
        }

        /**
         * @return isPass
         */
        public Boolean getIsPass() {
            return this.isPass;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String comparison; 
            private String expectedValue; 
            private Boolean isPass; 
            private String type; 

            private Builder() {
            } 

            private Builder(AssertCheckDetail model) {
                this.comparison = model.comparison;
                this.expectedValue = model.expectedValue;
                this.isPass = model.isPass;
                this.type = model.type;
            } 

            /**
             * comparison.
             */
            public Builder comparison(String comparison) {
                this.comparison = comparison;
                return this;
            }

            /**
             * expectedValue.
             */
            public Builder expectedValue(String expectedValue) {
                this.expectedValue = expectedValue;
                return this;
            }

            /**
             * isPass.
             */
            public Builder isPass(Boolean isPass) {
                this.isPass = isPass;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public AssertCheckDetail build() {
                return new AssertCheckDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("autoApply")
        private Boolean autoApply;

        @com.aliyun.core.annotation.NameInMap("isDestroy")
        private Boolean isDestroy;

        @com.aliyun.core.annotation.NameInMap("moduleVersion")
        private String moduleVersion;

        @com.aliyun.core.annotation.NameInMap("resourcesChanged")
        private String resourcesChanged;

        @com.aliyun.core.annotation.NameInMap("subCommand")
        private String subCommand;

        private Config(Builder builder) {
            this.autoApply = builder.autoApply;
            this.isDestroy = builder.isDestroy;
            this.moduleVersion = builder.moduleVersion;
            this.resourcesChanged = builder.resourcesChanged;
            this.subCommand = builder.subCommand;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return autoApply
         */
        public Boolean getAutoApply() {
            return this.autoApply;
        }

        /**
         * @return isDestroy
         */
        public Boolean getIsDestroy() {
            return this.isDestroy;
        }

        /**
         * @return moduleVersion
         */
        public String getModuleVersion() {
            return this.moduleVersion;
        }

        /**
         * @return resourcesChanged
         */
        public String getResourcesChanged() {
            return this.resourcesChanged;
        }

        /**
         * @return subCommand
         */
        public String getSubCommand() {
            return this.subCommand;
        }

        public static final class Builder {
            private Boolean autoApply; 
            private Boolean isDestroy; 
            private String moduleVersion; 
            private String resourcesChanged; 
            private String subCommand; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.autoApply = model.autoApply;
                this.isDestroy = model.isDestroy;
                this.moduleVersion = model.moduleVersion;
                this.resourcesChanged = model.resourcesChanged;
                this.subCommand = model.subCommand;
            } 

            /**
             * autoApply.
             */
            public Builder autoApply(Boolean autoApply) {
                this.autoApply = autoApply;
                return this;
            }

            /**
             * isDestroy.
             */
            public Builder isDestroy(Boolean isDestroy) {
                this.isDestroy = isDestroy;
                return this;
            }

            /**
             * moduleVersion.
             */
            public Builder moduleVersion(String moduleVersion) {
                this.moduleVersion = moduleVersion;
                return this;
            }

            /**
             * resourcesChanged.
             */
            public Builder resourcesChanged(String resourcesChanged) {
                this.resourcesChanged = resourcesChanged;
                return this;
            }

            /**
             * subCommand.
             */
            public Builder subCommand(String subCommand) {
                this.subCommand = subCommand;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobResponseBody</p>
     */
    public static class Job extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("assertCheckDetail")
        private java.util.List<AssertCheckDetail> assertCheckDetail;

        @com.aliyun.core.annotation.NameInMap("config")
        private Config config;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("downloadUrl")
        private java.util.Map<String, ?> downloadUrl;

        @com.aliyun.core.annotation.NameInMap("elapsedTime")
        private Long elapsedTime;

        @com.aliyun.core.annotation.NameInMap("executeType")
        private String executeType;

        @com.aliyun.core.annotation.NameInMap("isPassAssertCheck")
        private Boolean isPassAssertCheck;

        @com.aliyun.core.annotation.NameInMap("jobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("output")
        private String output;

        @com.aliyun.core.annotation.NameInMap("parameters")
        private java.util.Map<String, String> parameters;

        @com.aliyun.core.annotation.NameInMap("runtimeType")
        private String runtimeType;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("statusDetail")
        private java.util.Map<String, JobStatusDetailValue> statusDetail;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("taskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("terraformProviderVersion")
        private String terraformProviderVersion;

        private Job(Builder builder) {
            this.assertCheckDetail = builder.assertCheckDetail;
            this.config = builder.config;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.downloadUrl = builder.downloadUrl;
            this.elapsedTime = builder.elapsedTime;
            this.executeType = builder.executeType;
            this.isPassAssertCheck = builder.isPassAssertCheck;
            this.jobId = builder.jobId;
            this.output = builder.output;
            this.parameters = builder.parameters;
            this.runtimeType = builder.runtimeType;
            this.status = builder.status;
            this.statusDetail = builder.statusDetail;
            this.taskId = builder.taskId;
            this.taskType = builder.taskType;
            this.terraformProviderVersion = builder.terraformProviderVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Job create() {
            return builder().build();
        }

        /**
         * @return assertCheckDetail
         */
        public java.util.List<AssertCheckDetail> getAssertCheckDetail() {
            return this.assertCheckDetail;
        }

        /**
         * @return config
         */
        public Config getConfig() {
            return this.config;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return downloadUrl
         */
        public java.util.Map<String, ?> getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return elapsedTime
         */
        public Long getElapsedTime() {
            return this.elapsedTime;
        }

        /**
         * @return executeType
         */
        public String getExecuteType() {
            return this.executeType;
        }

        /**
         * @return isPassAssertCheck
         */
        public Boolean getIsPassAssertCheck() {
            return this.isPassAssertCheck;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return output
         */
        public String getOutput() {
            return this.output;
        }

        /**
         * @return parameters
         */
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        /**
         * @return runtimeType
         */
        public String getRuntimeType() {
            return this.runtimeType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusDetail
         */
        public java.util.Map<String, JobStatusDetailValue> getStatusDetail() {
            return this.statusDetail;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        /**
         * @return terraformProviderVersion
         */
        public String getTerraformProviderVersion() {
            return this.terraformProviderVersion;
        }

        public static final class Builder {
            private java.util.List<AssertCheckDetail> assertCheckDetail; 
            private Config config; 
            private String createTime; 
            private String description; 
            private java.util.Map<String, ?> downloadUrl; 
            private Long elapsedTime; 
            private String executeType; 
            private Boolean isPassAssertCheck; 
            private String jobId; 
            private String output; 
            private java.util.Map<String, String> parameters; 
            private String runtimeType; 
            private String status; 
            private java.util.Map<String, JobStatusDetailValue> statusDetail; 
            private String taskId; 
            private String taskType; 
            private String terraformProviderVersion; 

            private Builder() {
            } 

            private Builder(Job model) {
                this.assertCheckDetail = model.assertCheckDetail;
                this.config = model.config;
                this.createTime = model.createTime;
                this.description = model.description;
                this.downloadUrl = model.downloadUrl;
                this.elapsedTime = model.elapsedTime;
                this.executeType = model.executeType;
                this.isPassAssertCheck = model.isPassAssertCheck;
                this.jobId = model.jobId;
                this.output = model.output;
                this.parameters = model.parameters;
                this.runtimeType = model.runtimeType;
                this.status = model.status;
                this.statusDetail = model.statusDetail;
                this.taskId = model.taskId;
                this.taskType = model.taskType;
                this.terraformProviderVersion = model.terraformProviderVersion;
            } 

            /**
             * assertCheckDetail.
             */
            public Builder assertCheckDetail(java.util.List<AssertCheckDetail> assertCheckDetail) {
                this.assertCheckDetail = assertCheckDetail;
                return this;
            }

            /**
             * config.
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * downloadUrl.
             */
            public Builder downloadUrl(java.util.Map<String, ?> downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * elapsedTime.
             */
            public Builder elapsedTime(Long elapsedTime) {
                this.elapsedTime = elapsedTime;
                return this;
            }

            /**
             * executeType.
             */
            public Builder executeType(String executeType) {
                this.executeType = executeType;
                return this;
            }

            /**
             * isPassAssertCheck.
             */
            public Builder isPassAssertCheck(Boolean isPassAssertCheck) {
                this.isPassAssertCheck = isPassAssertCheck;
                return this;
            }

            /**
             * jobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * output.
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            /**
             * parameters.
             */
            public Builder parameters(java.util.Map<String, String> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * runtimeType.
             */
            public Builder runtimeType(String runtimeType) {
                this.runtimeType = runtimeType;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * statusDetail.
             */
            public Builder statusDetail(java.util.Map<String, JobStatusDetailValue> statusDetail) {
                this.statusDetail = statusDetail;
                return this;
            }

            /**
             * taskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * taskType.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * terraformProviderVersion.
             */
            public Builder terraformProviderVersion(String terraformProviderVersion) {
                this.terraformProviderVersion = terraformProviderVersion;
                return this;
            }

            public Job build() {
                return new Job(this);
            } 

        } 

    }
}
