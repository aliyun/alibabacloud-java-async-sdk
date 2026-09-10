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
 * {@link GetTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetTaskResponseBody</p>
 */
public class GetTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("task")
    private Task task;

    private GetTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.task = builder.task;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return task
     */
    public Task getTask() {
        return this.task;
    }

    public static final class Builder {
        private String requestId; 
        private Task task; 

        private Builder() {
        } 

        private Builder(GetTaskResponseBody model) {
            this.requestId = model.requestId;
            this.task = model.task;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C24C498A-09CF-54D3-8972-8DC074CF8614</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The task information.</p>
         */
        public Builder task(Task task) {
            this.task = task;
            return this;
        }

        public GetTaskResponseBody build() {
            return new GetTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskResponseBody</p>
     */
    public static class GroupInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("groupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("groupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("projectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("projectName")
        private String projectName;

        private GroupInfo(Builder builder) {
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupInfo create() {
            return builder().build();
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        public static final class Builder {
            private String groupId; 
            private String groupName; 
            private String projectId; 
            private String projectName; 

            private Builder() {
            } 

            private Builder(GroupInfo model) {
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.projectId = model.projectId;
                this.projectName = model.projectName;
            } 

            /**
             * <p>The group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>g-59d8d22e78792ffe3d3eb6154d727</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The group name.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The project ID.</p>
             * 
             * <strong>example:</strong>
             * <p>p-433aead756057fff47ecbfd94d76</p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The project name.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            public GroupInfo build() {
                return new GroupInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("tagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("tagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The tag key of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskResponseBody</p>
     */
    public static class TaskBackend extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bucketEndpoint")
        private String bucketEndpoint;

        @com.aliyun.core.annotation.NameInMap("bucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("objectPath")
        private String objectPath;

        private TaskBackend(Builder builder) {
            this.bucketEndpoint = builder.bucketEndpoint;
            this.bucketName = builder.bucketName;
            this.objectPath = builder.objectPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskBackend create() {
            return builder().build();
        }

        /**
         * @return bucketEndpoint
         */
        public String getBucketEndpoint() {
            return this.bucketEndpoint;
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return objectPath
         */
        public String getObjectPath() {
            return this.objectPath;
        }

        public static final class Builder {
            private String bucketEndpoint; 
            private String bucketName; 
            private String objectPath; 

            private Builder() {
            } 

            private Builder(TaskBackend model) {
                this.bucketEndpoint = model.bucketEndpoint;
                this.bucketName = model.bucketName;
                this.objectPath = model.objectPath;
            } 

            /**
             * <p>The endpoint information.</p>
             * 
             * <strong>example:</strong>
             * <p>ss-cn-beijing.aliyuncs.com</p>
             */
            public Builder bucketEndpoint(String bucketEndpoint) {
                this.bucketEndpoint = bucketEndpoint;
                return this;
            }

            /**
             * <p>The bucket name.</p>
             * 
             * <strong>example:</strong>
             * <p>iac-runtime-test</p>
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * <p>The object path.</p>
             * 
             * <strong>example:</strong>
             * <p>/log</p>
             */
            public Builder objectPath(String objectPath) {
                this.objectPath = objectPath;
                return this;
            }

            public TaskBackend build() {
                return new TaskBackend(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskResponseBody</p>
     */
    public static class Task extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("autoApply")
        private Boolean autoApply;

        @com.aliyun.core.annotation.NameInMap("autoDestroy")
        private Boolean autoDestroy;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("currentJobId")
        private String currentJobId;

        @com.aliyun.core.annotation.NameInMap("currentJobStatus")
        private String currentJobStatus;

        @com.aliyun.core.annotation.NameInMap("deletionProtection")
        private Boolean deletionProtection;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("groupInfo")
        private GroupInfo groupInfo;

        @com.aliyun.core.annotation.NameInMap("initModuleState")
        private Boolean initModuleState;

        @com.aliyun.core.annotation.NameInMap("latestModuleVersion")
        private String latestModuleVersion;

        @com.aliyun.core.annotation.NameInMap("moduleId")
        private String moduleId;

        @com.aliyun.core.annotation.NameInMap("moduleName")
        private String moduleName;

        @com.aliyun.core.annotation.NameInMap("moduleVersion")
        private String moduleVersion;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("protectionStrategy")
        private java.util.List<String> protectionStrategy;

        @com.aliyun.core.annotation.NameInMap("ramRole")
        private String ramRole;

        @com.aliyun.core.annotation.NameInMap("skipPropertyValidation")
        private Boolean skipPropertyValidation;

        @com.aliyun.core.annotation.NameInMap("skipRegionValidation")
        private Boolean skipRegionValidation;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("taskBackend")
        private TaskBackend taskBackend;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("taskOutputPath")
        private String taskOutputPath;

        @com.aliyun.core.annotation.NameInMap("terraformVersion")
        private String terraformVersion;

        @com.aliyun.core.annotation.NameInMap("triggerStrategy")
        private String triggerStrategy;

        private Task(Builder builder) {
            this.autoApply = builder.autoApply;
            this.autoDestroy = builder.autoDestroy;
            this.createTime = builder.createTime;
            this.currentJobId = builder.currentJobId;
            this.currentJobStatus = builder.currentJobStatus;
            this.deletionProtection = builder.deletionProtection;
            this.description = builder.description;
            this.groupInfo = builder.groupInfo;
            this.initModuleState = builder.initModuleState;
            this.latestModuleVersion = builder.latestModuleVersion;
            this.moduleId = builder.moduleId;
            this.moduleName = builder.moduleName;
            this.moduleVersion = builder.moduleVersion;
            this.name = builder.name;
            this.protectionStrategy = builder.protectionStrategy;
            this.ramRole = builder.ramRole;
            this.skipPropertyValidation = builder.skipPropertyValidation;
            this.skipRegionValidation = builder.skipRegionValidation;
            this.status = builder.status;
            this.tags = builder.tags;
            this.taskBackend = builder.taskBackend;
            this.taskId = builder.taskId;
            this.taskOutputPath = builder.taskOutputPath;
            this.terraformVersion = builder.terraformVersion;
            this.triggerStrategy = builder.triggerStrategy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Task create() {
            return builder().build();
        }

        /**
         * @return autoApply
         */
        public Boolean getAutoApply() {
            return this.autoApply;
        }

        /**
         * @return autoDestroy
         */
        public Boolean getAutoDestroy() {
            return this.autoDestroy;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return currentJobId
         */
        public String getCurrentJobId() {
            return this.currentJobId;
        }

        /**
         * @return currentJobStatus
         */
        public String getCurrentJobStatus() {
            return this.currentJobStatus;
        }

        /**
         * @return deletionProtection
         */
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return groupInfo
         */
        public GroupInfo getGroupInfo() {
            return this.groupInfo;
        }

        /**
         * @return initModuleState
         */
        public Boolean getInitModuleState() {
            return this.initModuleState;
        }

        /**
         * @return latestModuleVersion
         */
        public String getLatestModuleVersion() {
            return this.latestModuleVersion;
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
         * @return protectionStrategy
         */
        public java.util.List<String> getProtectionStrategy() {
            return this.protectionStrategy;
        }

        /**
         * @return ramRole
         */
        public String getRamRole() {
            return this.ramRole;
        }

        /**
         * @return skipPropertyValidation
         */
        public Boolean getSkipPropertyValidation() {
            return this.skipPropertyValidation;
        }

        /**
         * @return skipRegionValidation
         */
        public Boolean getSkipRegionValidation() {
            return this.skipRegionValidation;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return taskBackend
         */
        public TaskBackend getTaskBackend() {
            return this.taskBackend;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskOutputPath
         */
        public String getTaskOutputPath() {
            return this.taskOutputPath;
        }

        /**
         * @return terraformVersion
         */
        public String getTerraformVersion() {
            return this.terraformVersion;
        }

        /**
         * @return triggerStrategy
         */
        public String getTriggerStrategy() {
            return this.triggerStrategy;
        }

        public static final class Builder {
            private Boolean autoApply; 
            private Boolean autoDestroy; 
            private String createTime; 
            private String currentJobId; 
            private String currentJobStatus; 
            private Boolean deletionProtection; 
            private String description; 
            private GroupInfo groupInfo; 
            private Boolean initModuleState; 
            private String latestModuleVersion; 
            private String moduleId; 
            private String moduleName; 
            private String moduleVersion; 
            private String name; 
            private java.util.List<String> protectionStrategy; 
            private String ramRole; 
            private Boolean skipPropertyValidation; 
            private Boolean skipRegionValidation; 
            private String status; 
            private java.util.List<Tags> tags; 
            private TaskBackend taskBackend; 
            private String taskId; 
            private String taskOutputPath; 
            private String terraformVersion; 
            private String triggerStrategy; 

            private Builder() {
            } 

            private Builder(Task model) {
                this.autoApply = model.autoApply;
                this.autoDestroy = model.autoDestroy;
                this.createTime = model.createTime;
                this.currentJobId = model.currentJobId;
                this.currentJobStatus = model.currentJobStatus;
                this.deletionProtection = model.deletionProtection;
                this.description = model.description;
                this.groupInfo = model.groupInfo;
                this.initModuleState = model.initModuleState;
                this.latestModuleVersion = model.latestModuleVersion;
                this.moduleId = model.moduleId;
                this.moduleName = model.moduleName;
                this.moduleVersion = model.moduleVersion;
                this.name = model.name;
                this.protectionStrategy = model.protectionStrategy;
                this.ramRole = model.ramRole;
                this.skipPropertyValidation = model.skipPropertyValidation;
                this.skipRegionValidation = model.skipRegionValidation;
                this.status = model.status;
                this.tags = model.tags;
                this.taskBackend = model.taskBackend;
                this.taskId = model.taskId;
                this.taskOutputPath = model.taskOutputPath;
                this.terraformVersion = model.terraformVersion;
                this.triggerStrategy = model.triggerStrategy;
            } 

            /**
             * <p>Indicates whether the task is automatically executed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoApply(Boolean autoApply) {
                this.autoApply = autoApply;
                return this;
            }

            /**
             * <p>Indicates whether automatic deletion is enabled. When enabled, resources are automatically destroyed after the task is completed.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder autoDestroy(Boolean autoDestroy) {
                this.autoDestroy = autoDestroy;
                return this;
            }

            /**
             * <p>The time when the task was created, in UTC in the ISO 8601 format of YYYY-MM-DDTHH:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-06-15T02:44:37Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The job ID of the current task.</p>
             * 
             * <strong>example:</strong>
             * <p>job-absdf</p>
             */
            public Builder currentJobId(String currentJobId) {
                this.currentJobId = currentJobId;
                return this;
            }

            /**
             * <p>The current job status.</p>
             * 
             * <strong>example:</strong>
             * <p>Planned</p>
             */
            public Builder currentJobStatus(String currentJobStatus) {
                this.currentJobStatus = currentJobStatus;
                return this;
            }

            /**
             * <p>Indicates whether deletion protection is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder deletionProtection(Boolean deletionProtection) {
                this.deletionProtection = deletionProtection;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>this is description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The group information.</p>
             */
            public Builder groupInfo(GroupInfo groupInfo) {
                this.groupInfo = groupInfo;
                return this;
            }

            /**
             * <p>Specifies whether to use a state file. Default value: false. This parameter applies to templates that originate from resource export. Only one task can use this parameter at a time.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder initModuleState(Boolean initModuleState) {
                this.initModuleState = initModuleState;
                return this;
            }

            /**
             * <p>The latest version number of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>v3</p>
             */
            public Builder latestModuleVersion(String latestModuleVersion) {
                this.latestModuleVersion = latestModuleVersion;
                return this;
            }

            /**
             * <p>The template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>mod-4267dcfbf1b6d14625614ddbe15</p>
             */
            public Builder moduleId(String moduleId) {
                this.moduleId = moduleId;
                return this;
            }

            /**
             * <p>The template name.</p>
             * 
             * <strong>example:</strong>
             * <p>moduleName</p>
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * <p>The template version.</p>
             * 
             * <strong>example:</strong>
             * <p>v2</p>
             */
            public Builder moduleVersion(String moduleVersion) {
                this.moduleVersion = moduleVersion;
                return this;
            }

            /**
             * <p>The task name.</p>
             * 
             * <strong>example:</strong>
             * <p>TaskName</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The list of resource protection strategies.</p>
             */
            public Builder protectionStrategy(java.util.List<String> protectionStrategy) {
                this.protectionStrategy = protectionStrategy;
                return this;
            }

            /**
             * <p>The RAM role.</p>
             * 
             * <strong>example:</strong>
             * <p>role</p>
             */
            public Builder ramRole(String ramRole) {
                this.ramRole = ramRole;
                return this;
            }

            /**
             * <p>Specifies whether to skip enumeration value validation. Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder skipPropertyValidation(Boolean skipPropertyValidation) {
                this.skipPropertyValidation = skipPropertyValidation;
                return this;
            }

            /**
             * <p>Specifies whether to skip region validation. Valid values: true and false.</p>
             */
            public Builder skipRegionValidation(Boolean skipRegionValidation) {
                this.skipRegionValidation = skipRegionValidation;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li>Available: the task is available and no job is running.</li>
             * <li>Running: the task is running and a job is in progress.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The list of task tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The task backend configuration. After this parameter is configured, runtime log information is saved to the specified OSS bucket.</p>
             */
            public Builder taskBackend(TaskBackend taskBackend) {
                this.taskBackend = taskBackend;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>task-433aead756057154bda7f1c2e98</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The task output path.</p>
             * 
             * <strong>example:</strong>
             * <p>/</p>
             */
            public Builder taskOutputPath(String taskOutputPath) {
                this.taskOutputPath = taskOutputPath;
                return this;
            }

            /**
             * <p>The Terraform version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.5.7</p>
             */
            public Builder terraformVersion(String terraformVersion) {
                this.terraformVersion = terraformVersion;
                return this;
            }

            /**
             * <p>The job trigger method. Valid values:</p>
             * <ul>
             * <li>Manual: manually triggered (default).</li>
             * <li>NewVersion: triggered when a new template version is published.</li>
             * <li>ParameterSetUpdated: triggered when the parameter set content changes or the parameter set attach relationship changes.</li>
             * <li>Auto: automatically triggered when the task properties change, such as task creation, execution version change, or job trigger policy change (when changed from another value to Auto).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Manual</p>
             */
            public Builder triggerStrategy(String triggerStrategy) {
                this.triggerStrategy = triggerStrategy;
                return this;
            }

            public Task build() {
                return new Task(this);
            } 

        } 

    }
}
