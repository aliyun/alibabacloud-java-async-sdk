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
 * {@link ListJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListJobsResponseBody</p>
 */
public class ListJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("jobs")
    private java.util.List<Jobs> jobs;

    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListJobsResponseBody(Builder builder) {
        this.jobs = builder.jobs;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobs
     */
    public java.util.List<Jobs> getJobs() {
        return this.jobs;
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
        private java.util.List<Jobs> jobs; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListJobsResponseBody model) {
            this.jobs = model.jobs;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of job information.</p>
         */
        public Builder jobs(java.util.List<Jobs> jobs) {
            this.jobs = jobs;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of results returned per page. Default value: 20. Minimum value: 1. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>882304F9-6DB1-5593-A719-33473D082B9C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListJobsResponseBody build() {
            return new ListJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobsResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("isDestroy")
        private Boolean isDestroy;

        @com.aliyun.core.annotation.NameInMap("moduleDescription")
        private String moduleDescription;

        @com.aliyun.core.annotation.NameInMap("moduleVersion")
        private String moduleVersion;

        @com.aliyun.core.annotation.NameInMap("resourcesChanged")
        private String resourcesChanged;

        @com.aliyun.core.annotation.NameInMap("subCommand")
        private String subCommand;

        private Config(Builder builder) {
            this.isDestroy = builder.isDestroy;
            this.moduleDescription = builder.moduleDescription;
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
         * @return isDestroy
         */
        public Boolean getIsDestroy() {
            return this.isDestroy;
        }

        /**
         * @return moduleDescription
         */
        public String getModuleDescription() {
            return this.moduleDescription;
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
            private Boolean isDestroy; 
            private String moduleDescription; 
            private String moduleVersion; 
            private String resourcesChanged; 
            private String subCommand; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.isDestroy = model.isDestroy;
                this.moduleDescription = model.moduleDescription;
                this.moduleVersion = model.moduleVersion;
                this.resourcesChanged = model.resourcesChanged;
                this.subCommand = model.subCommand;
            } 

            /**
             * <p>Indicates whether the job is a destroy job.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDestroy(Boolean isDestroy) {
                this.isDestroy = isDestroy;
                return this;
            }

            /**
             * <p>The template description.</p>
             * 
             * <strong>example:</strong>
             * <p>moduleDescription</p>
             */
            public Builder moduleDescription(String moduleDescription) {
                this.moduleDescription = moduleDescription;
                return this;
            }

            /**
             * <p>The template version.</p>
             * 
             * <strong>example:</strong>
             * <p>v4</p>
             */
            public Builder moduleVersion(String moduleVersion) {
                this.moduleVersion = moduleVersion;
                return this;
            }

            /**
             * <p>The resource change content.</p>
             * 
             * <strong>example:</strong>
             * <p>+0 ~0 -0</p>
             */
            public Builder resourcesChanged(String resourcesChanged) {
                this.resourcesChanged = resourcesChanged;
                return this;
            }

            /**
             * <p>The operation command.</p>
             * 
             * <strong>example:</strong>
             * <p>destroy</p>
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
     * {@link ListJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobsResponseBody</p>
     */
    public static class Jobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("config")
        private Config config;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("elapsedTime")
        private Long elapsedTime;

        @com.aliyun.core.annotation.NameInMap("executeType")
        private String executeType;

        @com.aliyun.core.annotation.NameInMap("isPassAssertCheck")
        private Boolean isPassAssertCheck;

        @com.aliyun.core.annotation.NameInMap("jobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("statusDetail")
        private java.util.Map<String, JobsStatusDetailValue> statusDetail;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("terraformProviderVersion")
        private String terraformProviderVersion;

        private Jobs(Builder builder) {
            this.config = builder.config;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.elapsedTime = builder.elapsedTime;
            this.executeType = builder.executeType;
            this.isPassAssertCheck = builder.isPassAssertCheck;
            this.jobId = builder.jobId;
            this.status = builder.status;
            this.statusDetail = builder.statusDetail;
            this.taskId = builder.taskId;
            this.terraformProviderVersion = builder.terraformProviderVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Jobs create() {
            return builder().build();
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusDetail
         */
        public java.util.Map<String, JobsStatusDetailValue> getStatusDetail() {
            return this.statusDetail;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return terraformProviderVersion
         */
        public String getTerraformProviderVersion() {
            return this.terraformProviderVersion;
        }

        public static final class Builder {
            private Config config; 
            private String createTime; 
            private String description; 
            private Long elapsedTime; 
            private String executeType; 
            private Boolean isPassAssertCheck; 
            private String jobId; 
            private String status; 
            private java.util.Map<String, JobsStatusDetailValue> statusDetail; 
            private String taskId; 
            private String terraformProviderVersion; 

            private Builder() {
            } 

            private Builder(Jobs model) {
                this.config = model.config;
                this.createTime = model.createTime;
                this.description = model.description;
                this.elapsedTime = model.elapsedTime;
                this.executeType = model.executeType;
                this.isPassAssertCheck = model.isPassAssertCheck;
                this.jobId = model.jobId;
                this.status = model.status;
                this.statusDetail = model.statusDetail;
                this.taskId = model.taskId;
                this.terraformProviderVersion = model.terraformProviderVersion;
            } 

            /**
             * <p>The job configuration.</p>
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The time when the job was created, in UTC in the ISO 8601 format of YYYY-MM-DDTHH:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-05T02:13:43Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The job description.</p>
             * 
             * <strong>example:</strong>
             * <p>plan</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The execution duration.</p>
             * 
             * <strong>example:</strong>
             * <p>5m</p>
             */
            public Builder elapsedTime(Long elapsedTime) {
                this.elapsedTime = elapsedTime;
                return this;
            }

            /**
             * <p>The execution type. Valid values:</p>
             * <ul>
             * <li>Manual: Manual execution (default).</li>
             * <li>Auto: Automatic execution.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Manual</p>
             */
            public Builder executeType(String executeType) {
                this.executeType = executeType;
                return this;
            }

            /**
             * <p>Indicates whether the assertion check passed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isPassAssertCheck(Boolean isPassAssertCheck) {
                this.isPassAssertCheck = isPassAssertCheck;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>job-433aff9e4dca57b147c</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The job status. Valid values:</p>
             * <ul>
             * <li>Pending: The initial status after the job is created.</li>
             * <li>PlanQueued: After the job is created, if no workflow is available, the job is queued.</li>
             * <li>Planning: The resource job is in the Plan execution phase.</li>
             * <li>ConfigProactiveInProgress: Compliance pre-check is in progress. The account must have the compliance pre-check feature enabled.</li>
             * <li>ConfigProactiveSuccess: Compliance pre-check succeeded. The account must have the compliance pre-check feature enabled.</li>
             * <li>Planned: The resource job has completed Plan execution.</li>
             * <li>PlannedAndFinished: After Plan execution is completed, no diff is found. This is a final status.</li>
             * <li>Confirmed: The resource job is waiting for confirmation after Plan execution is completed.</li>
             * <li>ApplyQueued: During job execution, if no workflow is available, the job is queued.</li>
             * <li>Applying: The resource job is in the Apply execution phase.</li>
             * <li>Applied: The resource job has completed Apply execution. This is a final status.</li>
             * <li>Errored: The job execution encountered an error. This is a final status.</li>
             * <li>Canceled: The job execution was canceled. This is a final status.</li>
             * <li>Discarded: The plan of the resource job was discarded. This is a final status.</li>
             * <li>ConfigProactiveFailure: Compliance pre-check failed. The account must have the compliance pre-check feature enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Errored</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The status details.</p>
             */
            public Builder statusDetail(java.util.Map<String, JobsStatusDetailValue> statusDetail) {
                this.statusDetail = statusDetail;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>task-518876866c2c3efb</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The Terraform provider version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.240.0</p>
             */
            public Builder terraformProviderVersion(String terraformProviderVersion) {
                this.terraformProviderVersion = terraformProviderVersion;
                return this;
            }

            public Jobs build() {
                return new Jobs(this);
            } 

        } 

    }
}
