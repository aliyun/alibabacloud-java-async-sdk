// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * task.
         */
        public Builder task(Task task) {
            this.task = task;
            return this;
        }

        public GetTaskResponseBody build() {
            return new GetTaskResponseBody(this);
        } 

    } 

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

            /**
             * groupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * groupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
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
             * projectName.
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
    public static class Task extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("autoApply")
        private Boolean autoApply;

        @com.aliyun.core.annotation.NameInMap("autoDestroy")
        private Boolean autoDestroy;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("currentJobId")
        private String currentJobId;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("groupInfo")
        private GroupInfo groupInfo;

        @com.aliyun.core.annotation.NameInMap("initModuleState")
        private Boolean initModuleState;

        @com.aliyun.core.annotation.NameInMap("moduleId")
        private String moduleId;

        @com.aliyun.core.annotation.NameInMap("moduleVersion")
        private String moduleVersion;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("parameters")
        private java.util.Map < String, String > parameters;

        @com.aliyun.core.annotation.NameInMap("protectionStrategy")
        private java.util.List < String > protectionStrategy;

        @com.aliyun.core.annotation.NameInMap("ramRole")
        private String ramRole;

        @com.aliyun.core.annotation.NameInMap("skipPropertyValidation")
        private Boolean skipPropertyValidation;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("taskOutputPath")
        private String taskOutputPath;

        @com.aliyun.core.annotation.NameInMap("terraformVersion")
        private String terraformVersion;

        @com.aliyun.core.annotation.NameInMap("triggerStrategy")
        private String triggerStrategy;

        @com.aliyun.core.annotation.NameInMap("triggerValue")
        private String triggerValue;

        private Task(Builder builder) {
            this.autoApply = builder.autoApply;
            this.autoDestroy = builder.autoDestroy;
            this.createTime = builder.createTime;
            this.currentJobId = builder.currentJobId;
            this.description = builder.description;
            this.groupInfo = builder.groupInfo;
            this.initModuleState = builder.initModuleState;
            this.moduleId = builder.moduleId;
            this.moduleVersion = builder.moduleVersion;
            this.name = builder.name;
            this.parameters = builder.parameters;
            this.protectionStrategy = builder.protectionStrategy;
            this.ramRole = builder.ramRole;
            this.skipPropertyValidation = builder.skipPropertyValidation;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.taskOutputPath = builder.taskOutputPath;
            this.terraformVersion = builder.terraformVersion;
            this.triggerStrategy = builder.triggerStrategy;
            this.triggerValue = builder.triggerValue;
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
         * @return moduleId
         */
        public String getModuleId() {
            return this.moduleId;
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
         * @return parameters
         */
        public java.util.Map < String, String > getParameters() {
            return this.parameters;
        }

        /**
         * @return protectionStrategy
         */
        public java.util.List < String > getProtectionStrategy() {
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

        /**
         * @return triggerValue
         */
        public String getTriggerValue() {
            return this.triggerValue;
        }

        public static final class Builder {
            private Boolean autoApply; 
            private Boolean autoDestroy; 
            private String createTime; 
            private String currentJobId; 
            private String description; 
            private GroupInfo groupInfo; 
            private Boolean initModuleState; 
            private String moduleId; 
            private String moduleVersion; 
            private String name; 
            private java.util.Map < String, String > parameters; 
            private java.util.List < String > protectionStrategy; 
            private String ramRole; 
            private Boolean skipPropertyValidation; 
            private String status; 
            private String taskId; 
            private String taskOutputPath; 
            private String terraformVersion; 
            private String triggerStrategy; 
            private String triggerValue; 

            /**
             * autoApply.
             */
            public Builder autoApply(Boolean autoApply) {
                this.autoApply = autoApply;
                return this;
            }

            /**
             * autoDestroy.
             */
            public Builder autoDestroy(Boolean autoDestroy) {
                this.autoDestroy = autoDestroy;
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
             * currentJobId.
             */
            public Builder currentJobId(String currentJobId) {
                this.currentJobId = currentJobId;
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
             * groupInfo.
             */
            public Builder groupInfo(GroupInfo groupInfo) {
                this.groupInfo = groupInfo;
                return this;
            }

            /**
             * initModuleState.
             */
            public Builder initModuleState(Boolean initModuleState) {
                this.initModuleState = initModuleState;
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
             * parameters.
             */
            public Builder parameters(java.util.Map < String, String > parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * protectionStrategy.
             */
            public Builder protectionStrategy(java.util.List < String > protectionStrategy) {
                this.protectionStrategy = protectionStrategy;
                return this;
            }

            /**
             * ramRole.
             */
            public Builder ramRole(String ramRole) {
                this.ramRole = ramRole;
                return this;
            }

            /**
             * skipPropertyValidation.
             */
            public Builder skipPropertyValidation(Boolean skipPropertyValidation) {
                this.skipPropertyValidation = skipPropertyValidation;
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
             * taskOutputPath.
             */
            public Builder taskOutputPath(String taskOutputPath) {
                this.taskOutputPath = taskOutputPath;
                return this;
            }

            /**
             * terraformVersion.
             */
            public Builder terraformVersion(String terraformVersion) {
                this.terraformVersion = terraformVersion;
                return this;
            }

            /**
             * triggerStrategy.
             */
            public Builder triggerStrategy(String triggerStrategy) {
                this.triggerStrategy = triggerStrategy;
                return this;
            }

            /**
             * triggerValue.
             */
            public Builder triggerValue(String triggerValue) {
                this.triggerValue = triggerValue;
                return this;
            }

            public Task build() {
                return new Task(this);
            } 

        } 

    }
}
