// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProjectBuildContextResponseBody} extends {@link TeaModel}
 *
 * <p>GetProjectBuildContextResponseBody</p>
 */
public class GetProjectBuildContextResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProjectBuild")
    private ProjectBuild projectBuild;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetProjectBuildContextResponseBody(Builder builder) {
        this.projectBuild = builder.projectBuild;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProjectBuildContextResponseBody create() {
        return builder().build();
    }

    /**
     * @return projectBuild
     */
    public ProjectBuild getProjectBuild() {
        return this.projectBuild;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ProjectBuild projectBuild; 
        private String requestId; 

        /**
         * ProjectBuild.
         */
        public Builder projectBuild(ProjectBuild projectBuild) {
            this.projectBuild = projectBuild;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetProjectBuildContextResponseBody build() {
            return new GetProjectBuildContextResponseBody(this);
        } 

    } 

    public static class JobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("elapsedTime")
        private Long elapsedTime;

        @com.aliyun.core.annotation.NameInMap("isDeleted")
        private Long isDeleted;

        @com.aliyun.core.annotation.NameInMap("isPassAssertCheck")
        private Boolean isPassAssertCheck;

        @com.aliyun.core.annotation.NameInMap("jobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("moduleId")
        private String moduleId;

        @com.aliyun.core.annotation.NameInMap("moduleName")
        private String moduleName;

        @com.aliyun.core.annotation.NameInMap("moduleVersion")
        private String moduleVersion;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("terraformProviderVersion")
        private String terraformProviderVersion;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private JobList(Builder builder) {
            this.elapsedTime = builder.elapsedTime;
            this.isDeleted = builder.isDeleted;
            this.isPassAssertCheck = builder.isPassAssertCheck;
            this.jobId = builder.jobId;
            this.moduleId = builder.moduleId;
            this.moduleName = builder.moduleName;
            this.moduleVersion = builder.moduleVersion;
            this.name = builder.name;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.terraformProviderVersion = builder.terraformProviderVersion;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobList create() {
            return builder().build();
        }

        /**
         * @return elapsedTime
         */
        public Long getElapsedTime() {
            return this.elapsedTime;
        }

        /**
         * @return isDeleted
         */
        public Long getIsDeleted() {
            return this.isDeleted;
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
         * @return moduleId
         */
        public String getModuleId() {
            return this.moduleId;
        }

        /**
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        /**
         * @return moduleVersion
         */
        public String getModuleVersion() {
            return this.moduleVersion;
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

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long elapsedTime; 
            private Long isDeleted; 
            private Boolean isPassAssertCheck; 
            private String jobId; 
            private String moduleId; 
            private String moduleName; 
            private String moduleVersion; 
            private String name; 
            private String status; 
            private String taskId; 
            private String terraformProviderVersion; 
            private String type; 

            /**
             * elapsedTime.
             */
            public Builder elapsedTime(Long elapsedTime) {
                this.elapsedTime = elapsedTime;
                return this;
            }

            /**
             * isDeleted.
             */
            public Builder isDeleted(Long isDeleted) {
                this.isDeleted = isDeleted;
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
             * moduleId.
             */
            public Builder moduleId(String moduleId) {
                this.moduleId = moduleId;
                return this;
            }

            /**
             * moduleName.
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
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
             * name.
             */
            public Builder name(String name) {
                this.name = name;
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
             * taskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * terraformProviderVersion.
             */
            public Builder terraformProviderVersion(String terraformProviderVersion) {
                this.terraformProviderVersion = terraformProviderVersion;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public JobList build() {
                return new JobList(this);
            } 

        } 

    }
    public static class ResourceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("info")
        private java.util.Map < String, String > info;

        @com.aliyun.core.annotation.NameInMap("resourceCnt")
        private Long resourceCnt;

        @com.aliyun.core.annotation.NameInMap("resourceType")
        private String resourceType;

        private ResourceList(Builder builder) {
            this.info = builder.info;
            this.resourceCnt = builder.resourceCnt;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceList create() {
            return builder().build();
        }

        /**
         * @return info
         */
        public java.util.Map < String, String > getInfo() {
            return this.info;
        }

        /**
         * @return resourceCnt
         */
        public Long getResourceCnt() {
            return this.resourceCnt;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private java.util.Map < String, String > info; 
            private Long resourceCnt; 
            private String resourceType; 

            /**
             * info.
             */
            public Builder info(java.util.Map < String, String > info) {
                this.info = info;
                return this;
            }

            /**
             * resourceCnt.
             */
            public Builder resourceCnt(Long resourceCnt) {
                this.resourceCnt = resourceCnt;
                return this;
            }

            /**
             * resourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public ResourceList build() {
                return new ResourceList(this);
            } 

        } 

    }
    public static class ProjectBuild extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("failCnt")
        private Long failCnt;

        @com.aliyun.core.annotation.NameInMap("jobList")
        private java.util.List < JobList> jobList;

        @com.aliyun.core.annotation.NameInMap("jobTotalCnt")
        private Long jobTotalCnt;

        @com.aliyun.core.annotation.NameInMap("projectBuildId")
        private String projectBuildId;

        @com.aliyun.core.annotation.NameInMap("projectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("resourceCnt")
        private Long resourceCnt;

        @com.aliyun.core.annotation.NameInMap("resourceList")
        private java.util.List < ResourceList> resourceList;

        @com.aliyun.core.annotation.NameInMap("resourceTypeCnt")
        private Long resourceTypeCnt;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("successCnt")
        private Long successCnt;

        @com.aliyun.core.annotation.NameInMap("terraformProviderVersion")
        private String terraformProviderVersion;

        @com.aliyun.core.annotation.NameInMap("triggerStrategy")
        private String triggerStrategy;

        private ProjectBuild(Builder builder) {
            this.endTime = builder.endTime;
            this.failCnt = builder.failCnt;
            this.jobList = builder.jobList;
            this.jobTotalCnt = builder.jobTotalCnt;
            this.projectBuildId = builder.projectBuildId;
            this.projectId = builder.projectId;
            this.resourceCnt = builder.resourceCnt;
            this.resourceList = builder.resourceList;
            this.resourceTypeCnt = builder.resourceTypeCnt;
            this.status = builder.status;
            this.successCnt = builder.successCnt;
            this.terraformProviderVersion = builder.terraformProviderVersion;
            this.triggerStrategy = builder.triggerStrategy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProjectBuild create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return failCnt
         */
        public Long getFailCnt() {
            return this.failCnt;
        }

        /**
         * @return jobList
         */
        public java.util.List < JobList> getJobList() {
            return this.jobList;
        }

        /**
         * @return jobTotalCnt
         */
        public Long getJobTotalCnt() {
            return this.jobTotalCnt;
        }

        /**
         * @return projectBuildId
         */
        public String getProjectBuildId() {
            return this.projectBuildId;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return resourceCnt
         */
        public Long getResourceCnt() {
            return this.resourceCnt;
        }

        /**
         * @return resourceList
         */
        public java.util.List < ResourceList> getResourceList() {
            return this.resourceList;
        }

        /**
         * @return resourceTypeCnt
         */
        public Long getResourceTypeCnt() {
            return this.resourceTypeCnt;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return successCnt
         */
        public Long getSuccessCnt() {
            return this.successCnt;
        }

        /**
         * @return terraformProviderVersion
         */
        public String getTerraformProviderVersion() {
            return this.terraformProviderVersion;
        }

        /**
         * @return triggerStrategy
         */
        public String getTriggerStrategy() {
            return this.triggerStrategy;
        }

        public static final class Builder {
            private String endTime; 
            private Long failCnt; 
            private java.util.List < JobList> jobList; 
            private Long jobTotalCnt; 
            private String projectBuildId; 
            private String projectId; 
            private Long resourceCnt; 
            private java.util.List < ResourceList> resourceList; 
            private Long resourceTypeCnt; 
            private String status; 
            private Long successCnt; 
            private String terraformProviderVersion; 
            private String triggerStrategy; 

            /**
             * endTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * failCnt.
             */
            public Builder failCnt(Long failCnt) {
                this.failCnt = failCnt;
                return this;
            }

            /**
             * jobList.
             */
            public Builder jobList(java.util.List < JobList> jobList) {
                this.jobList = jobList;
                return this;
            }

            /**
             * jobTotalCnt.
             */
            public Builder jobTotalCnt(Long jobTotalCnt) {
                this.jobTotalCnt = jobTotalCnt;
                return this;
            }

            /**
             * projectBuildId.
             */
            public Builder projectBuildId(String projectBuildId) {
                this.projectBuildId = projectBuildId;
                return this;
            }

            /**
             * projectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * resourceCnt.
             */
            public Builder resourceCnt(Long resourceCnt) {
                this.resourceCnt = resourceCnt;
                return this;
            }

            /**
             * resourceList.
             */
            public Builder resourceList(java.util.List < ResourceList> resourceList) {
                this.resourceList = resourceList;
                return this;
            }

            /**
             * resourceTypeCnt.
             */
            public Builder resourceTypeCnt(Long resourceTypeCnt) {
                this.resourceTypeCnt = resourceTypeCnt;
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
             * successCnt.
             */
            public Builder successCnt(Long successCnt) {
                this.successCnt = successCnt;
                return this;
            }

            /**
             * terraformProviderVersion.
             */
            public Builder terraformProviderVersion(String terraformProviderVersion) {
                this.terraformProviderVersion = terraformProviderVersion;
                return this;
            }

            /**
             * triggerStrategy.
             */
            public Builder triggerStrategy(String triggerStrategy) {
                this.triggerStrategy = triggerStrategy;
                return this;
            }

            public ProjectBuild build() {
                return new ProjectBuild(this);
            } 

        } 

    }
}
