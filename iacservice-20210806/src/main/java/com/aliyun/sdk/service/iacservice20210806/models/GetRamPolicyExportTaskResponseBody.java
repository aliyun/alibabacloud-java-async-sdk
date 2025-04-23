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
 * {@link GetRamPolicyExportTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetRamPolicyExportTaskResponseBody</p>
 */
public class GetRamPolicyExportTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ramPolicyExportTask")
    private RamPolicyExportTask ramPolicyExportTask;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetRamPolicyExportTaskResponseBody(Builder builder) {
        this.ramPolicyExportTask = builder.ramPolicyExportTask;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRamPolicyExportTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ramPolicyExportTask
     */
    public RamPolicyExportTask getRamPolicyExportTask() {
        return this.ramPolicyExportTask;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private RamPolicyExportTask ramPolicyExportTask; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetRamPolicyExportTaskResponseBody model) {
            this.ramPolicyExportTask = model.ramPolicyExportTask;
            this.requestId = model.requestId;
        } 

        /**
         * ramPolicyExportTask.
         */
        public Builder ramPolicyExportTask(RamPolicyExportTask ramPolicyExportTask) {
            this.ramPolicyExportTask = ramPolicyExportTask;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRamPolicyExportTaskResponseBody build() {
            return new GetRamPolicyExportTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRamPolicyExportTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetRamPolicyExportTaskResponseBody</p>
     */
    public static class RamPolicyExportTask extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("authorizationAccountIds")
        private java.util.List<Long> authorizationAccountIds;

        @com.aliyun.core.annotation.NameInMap("authorizationActions")
        private java.util.List<String> authorizationActions;

        @com.aliyun.core.annotation.NameInMap("authorizationRegionIds")
        private java.util.List<String> authorizationRegionIds;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("moduleId")
        private String moduleId;

        @com.aliyun.core.annotation.NameInMap("moduleVersion")
        private String moduleVersion;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ramPolicyExportTaskId")
        private String ramPolicyExportTaskId;

        @com.aliyun.core.annotation.NameInMap("ramRole")
        private String ramRole;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("taskOutputPath")
        private String taskOutputPath;

        @com.aliyun.core.annotation.NameInMap("terraformProviderVersion")
        private String terraformProviderVersion;

        @com.aliyun.core.annotation.NameInMap("triggerStrategy")
        private String triggerStrategy;

        private RamPolicyExportTask(Builder builder) {
            this.authorizationAccountIds = builder.authorizationAccountIds;
            this.authorizationActions = builder.authorizationActions;
            this.authorizationRegionIds = builder.authorizationRegionIds;
            this.createTime = builder.createTime;
            this.moduleId = builder.moduleId;
            this.moduleVersion = builder.moduleVersion;
            this.name = builder.name;
            this.ramPolicyExportTaskId = builder.ramPolicyExportTaskId;
            this.ramRole = builder.ramRole;
            this.status = builder.status;
            this.taskOutputPath = builder.taskOutputPath;
            this.terraformProviderVersion = builder.terraformProviderVersion;
            this.triggerStrategy = builder.triggerStrategy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RamPolicyExportTask create() {
            return builder().build();
        }

        /**
         * @return authorizationAccountIds
         */
        public java.util.List<Long> getAuthorizationAccountIds() {
            return this.authorizationAccountIds;
        }

        /**
         * @return authorizationActions
         */
        public java.util.List<String> getAuthorizationActions() {
            return this.authorizationActions;
        }

        /**
         * @return authorizationRegionIds
         */
        public java.util.List<String> getAuthorizationRegionIds() {
            return this.authorizationRegionIds;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
         * @return ramPolicyExportTaskId
         */
        public String getRamPolicyExportTaskId() {
            return this.ramPolicyExportTaskId;
        }

        /**
         * @return ramRole
         */
        public String getRamRole() {
            return this.ramRole;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskOutputPath
         */
        public String getTaskOutputPath() {
            return this.taskOutputPath;
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
            private java.util.List<Long> authorizationAccountIds; 
            private java.util.List<String> authorizationActions; 
            private java.util.List<String> authorizationRegionIds; 
            private String createTime; 
            private String moduleId; 
            private String moduleVersion; 
            private String name; 
            private String ramPolicyExportTaskId; 
            private String ramRole; 
            private String status; 
            private String taskOutputPath; 
            private String terraformProviderVersion; 
            private String triggerStrategy; 

            private Builder() {
            } 

            private Builder(RamPolicyExportTask model) {
                this.authorizationAccountIds = model.authorizationAccountIds;
                this.authorizationActions = model.authorizationActions;
                this.authorizationRegionIds = model.authorizationRegionIds;
                this.createTime = model.createTime;
                this.moduleId = model.moduleId;
                this.moduleVersion = model.moduleVersion;
                this.name = model.name;
                this.ramPolicyExportTaskId = model.ramPolicyExportTaskId;
                this.ramRole = model.ramRole;
                this.status = model.status;
                this.taskOutputPath = model.taskOutputPath;
                this.terraformProviderVersion = model.terraformProviderVersion;
                this.triggerStrategy = model.triggerStrategy;
            } 

            /**
             * authorizationAccountIds.
             */
            public Builder authorizationAccountIds(java.util.List<Long> authorizationAccountIds) {
                this.authorizationAccountIds = authorizationAccountIds;
                return this;
            }

            /**
             * authorizationActions.
             */
            public Builder authorizationActions(java.util.List<String> authorizationActions) {
                this.authorizationActions = authorizationActions;
                return this;
            }

            /**
             * authorizationRegionIds.
             */
            public Builder authorizationRegionIds(java.util.List<String> authorizationRegionIds) {
                this.authorizationRegionIds = authorizationRegionIds;
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
             * ramPolicyExportTaskId.
             */
            public Builder ramPolicyExportTaskId(String ramPolicyExportTaskId) {
                this.ramPolicyExportTaskId = ramPolicyExportTaskId;
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
             * status.
             */
            public Builder status(String status) {
                this.status = status;
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

            public RamPolicyExportTask build() {
                return new RamPolicyExportTask(this);
            } 

        } 

    }
}
