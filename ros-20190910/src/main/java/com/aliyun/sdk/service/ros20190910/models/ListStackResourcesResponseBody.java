// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListStackResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListStackResourcesResponseBody</p>
 */
public class ListStackResourcesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Resources")
    private java.util.List < Resources> resources;

    private ListStackResourcesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resources = builder.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStackResourcesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resources
     */
    public java.util.List < Resources> getResources() {
        return this.resources;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Resources> resources; 

        /**
         * Details about resources.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The resources.
         */
        public Builder resources(java.util.List < Resources> resources) {
            this.resources = resources;
            return this;
        }

        public ListStackResourcesResponseBody build() {
            return new ListStackResourcesResponseBody(this);
        } 

    } 

    public static class ModuleInfo extends TeaModel {
        @NameInMap("LogicalIdHierarchy")
        private String logicalIdHierarchy;

        @NameInMap("TypeHierarchy")
        private String typeHierarchy;

        private ModuleInfo(Builder builder) {
            this.logicalIdHierarchy = builder.logicalIdHierarchy;
            this.typeHierarchy = builder.typeHierarchy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModuleInfo create() {
            return builder().build();
        }

        /**
         * @return logicalIdHierarchy
         */
        public String getLogicalIdHierarchy() {
            return this.logicalIdHierarchy;
        }

        /**
         * @return typeHierarchy
         */
        public String getTypeHierarchy() {
            return this.typeHierarchy;
        }

        public static final class Builder {
            private String logicalIdHierarchy; 
            private String typeHierarchy; 

            /**
             * The concatenated logical IDs of one or more modules that contain the resource. The modules are listed from the outermost layer and separated by forward slashes (`/`).
             * <p>
             * 
             * In the following example, the resource is created from Module B nested within Parent Module A:
             * 
             * `moduleA/moduleB`
             */
            public Builder logicalIdHierarchy(String logicalIdHierarchy) {
                this.logicalIdHierarchy = logicalIdHierarchy;
                return this;
            }

            /**
             * The concatenated types of one or more modules that contain the resource. The module types are listed from the outermost layer and separated by forward slashes (`/`).
             * <p>
             * 
             * In the following example, the resource is created from a module of the `MODULE::ROS::Child::Example` type that is nested within a parent module of the `MODULE::ROS::Parent::Example` type:
             * 
             * `MODULE::ROS::Parent::Example/MODULE::ROS::Child::Example`
             */
            public Builder typeHierarchy(String typeHierarchy) {
                this.typeHierarchy = typeHierarchy;
                return this;
            }

            public ModuleInfo build() {
                return new ModuleInfo(this);
            } 

        } 

    }
    public static class Resources extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DriftDetectionTime")
        private String driftDetectionTime;

        @NameInMap("LogicalResourceId")
        private String logicalResourceId;

        @NameInMap("ModuleInfo")
        private ModuleInfo moduleInfo;

        @NameInMap("PhysicalResourceId")
        private String physicalResourceId;

        @NameInMap("ResourceDriftStatus")
        private String resourceDriftStatus;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("StackId")
        private String stackId;

        @NameInMap("StackName")
        private String stackName;

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusReason")
        private String statusReason;

        @NameInMap("UpdateTime")
        private String updateTime;

        private Resources(Builder builder) {
            this.createTime = builder.createTime;
            this.driftDetectionTime = builder.driftDetectionTime;
            this.logicalResourceId = builder.logicalResourceId;
            this.moduleInfo = builder.moduleInfo;
            this.physicalResourceId = builder.physicalResourceId;
            this.resourceDriftStatus = builder.resourceDriftStatus;
            this.resourceType = builder.resourceType;
            this.stackId = builder.stackId;
            this.stackName = builder.stackName;
            this.status = builder.status;
            this.statusReason = builder.statusReason;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return driftDetectionTime
         */
        public String getDriftDetectionTime() {
            return this.driftDetectionTime;
        }

        /**
         * @return logicalResourceId
         */
        public String getLogicalResourceId() {
            return this.logicalResourceId;
        }

        /**
         * @return moduleInfo
         */
        public ModuleInfo getModuleInfo() {
            return this.moduleInfo;
        }

        /**
         * @return physicalResourceId
         */
        public String getPhysicalResourceId() {
            return this.physicalResourceId;
        }

        /**
         * @return resourceDriftStatus
         */
        public String getResourceDriftStatus() {
            return this.resourceDriftStatus;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return stackId
         */
        public String getStackId() {
            return this.stackId;
        }

        /**
         * @return stackName
         */
        public String getStackName() {
            return this.stackName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusReason
         */
        public String getStatusReason() {
            return this.statusReason;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String driftDetectionTime; 
            private String logicalResourceId; 
            private ModuleInfo moduleInfo; 
            private String physicalResourceId; 
            private String resourceDriftStatus; 
            private String resourceType; 
            private String stackId; 
            private String stackName; 
            private String status; 
            private String statusReason; 
            private String updateTime; 

            /**
             * The time when the resource was created. The time is displayed in UTC. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The time when the most recent successful drift detection was performed on the stack.
             */
            public Builder driftDetectionTime(String driftDetectionTime) {
                this.driftDetectionTime = driftDetectionTime;
                return this;
            }

            /**
             * The logical ID of the resource. The logical ID is the resource name that is defined in the template.
             */
            public Builder logicalResourceId(String logicalResourceId) {
                this.logicalResourceId = logicalResourceId;
                return this;
            }

            /**
             * The information about the modules from which the resource is created. This parameter is returned only if the resource is created from modules.
             */
            public Builder moduleInfo(ModuleInfo moduleInfo) {
                this.moduleInfo = moduleInfo;
                return this;
            }

            /**
             * The physical ID of the resource.
             */
            public Builder physicalResourceId(String physicalResourceId) {
                this.physicalResourceId = physicalResourceId;
                return this;
            }

            /**
             * The drift state of the resource in the most recent successful drift detection. Valid values:
             * <p>
             * 
             * *   DELETED: The actual configuration of the resource differs from its expected template configuration because the resource is deleted.
             * *   MODIFIED: The actual configuration of the resource differs from its expected template configuration.
             * *   NOT_CHECKED: Resource Orchestration Service (ROS) has not checked whether the actual configuration of the resource differs from its expected template configuration.
             * *   IN_SYNC: The actual configuration of the resource matches its expected template configuration.
             */
            public Builder resourceDriftStatus(String resourceDriftStatus) {
                this.resourceDriftStatus = resourceDriftStatus;
                return this;
            }

            /**
             * The resource type.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The stack ID.
             */
            public Builder stackId(String stackId) {
                this.stackId = stackId;
                return this;
            }

            /**
             * The stack name.\
             * <p>
             * The name can be up to 255 characters in length, and can contain digits, letters, hyphens (-), and underscores (\_). It must start with a digit or letter.
             */
            public Builder stackName(String stackName) {
                this.stackName = stackName;
                return this;
            }

            /**
             * The state of the resource. Valid values:
             * <p>
             * 
             * *   INIT_COMPLETE: The resource is pending to be created.
             * *   CREATE_COMPLETE: The resource is created.
             * *   CREATE_FAILED: The resource failed to be created.
             * *   CREATE_IN_PROGRESS: The resource is being created.
             * *   UPDATE_IN_PROGRESS: The resource is being updated.
             * *   UPDATE_FAILED: The resource failed to be updated.
             * *   UPDATE_COMPLETE: The resource is updated.
             * *   DELETE_IN_PROGRESS: The resource is being deleted.
             * *   DELETE_FAILED: The resource failed to be deleted.
             * *   DELETE_COMPLETE: The resource is deleted.
             * *   CHECK_IN_PROGRESS: The resource is being validated.
             * *   CHECK_FAILED: The resource failed to be validated.
             * *   CHECK_COMPLETE: The resource is validated.
             * *   IMPORT_IN_PROGRESS: The resource is being imported.
             * *   IMPORT_FAILED: The resource failed to be imported.
             * *   IMPORT_COMPLETE: The resource is imported.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The reason why the resource is in its current state.
             */
            public Builder statusReason(String statusReason) {
                this.statusReason = statusReason;
                return this;
            }

            /**
             * The time when the resource was updated. The time is displayed in UTC. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
}
