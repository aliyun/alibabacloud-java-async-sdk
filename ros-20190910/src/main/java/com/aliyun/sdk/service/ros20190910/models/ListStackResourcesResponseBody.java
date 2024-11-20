// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListStackResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListStackResourcesResponseBody</p>
 */
public class ListStackResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Resources")
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
         * <p>Details about resources.</p>
         * 
         * <strong>example:</strong>
         * <p>B288A0BE-D927-4888-B0F7-B35EF84B6E6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resources.</p>
         */
        public Builder resources(java.util.List < Resources> resources) {
            this.resources = resources;
            return this;
        }

        public ListStackResourcesResponseBody build() {
            return new ListStackResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListStackResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListStackResourcesResponseBody</p>
     */
    public static class ModuleInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogicalIdHierarchy")
        private String logicalIdHierarchy;

        @com.aliyun.core.annotation.NameInMap("TypeHierarchy")
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
             * <p>The concatenated logical IDs of one or more modules that contain the resource. The modules are listed from the outermost layer and separated by forward slashes (<code>/</code>).</p>
             * <p>In the following example, the resource is created from Module B nested within Parent Module A:</p>
             * <p><code>moduleA/moduleB</code></p>
             * 
             * <strong>example:</strong>
             * <p>moduleA/moduleB</p>
             */
            public Builder logicalIdHierarchy(String logicalIdHierarchy) {
                this.logicalIdHierarchy = logicalIdHierarchy;
                return this;
            }

            /**
             * <p>The concatenated types of one or more modules that contain the resource. The module types are listed from the outermost layer and separated by forward slashes (<code>/</code>).</p>
             * <p>In the following example, the resource is created from a module of the <code>MODULE::ROS::Child::Example</code> type that is nested within a parent module of the <code>MODULE::ROS::Parent::Example</code> type:</p>
             * <p><code>MODULE::ROS::Parent::Example/MODULE::ROS::Child::Example</code></p>
             * 
             * <strong>example:</strong>
             * <p>MODULE::ROS::Parent::Example/MODULE::ROS::Child::Example</p>
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
    /**
     * 
     * {@link ListStackResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListStackResourcesResponseBody</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DriftDetectionTime")
        private String driftDetectionTime;

        @com.aliyun.core.annotation.NameInMap("LogicalResourceId")
        private String logicalResourceId;

        @com.aliyun.core.annotation.NameInMap("ModuleInfo")
        private ModuleInfo moduleInfo;

        @com.aliyun.core.annotation.NameInMap("PhysicalResourceId")
        private String physicalResourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceDriftStatus")
        private String resourceDriftStatus;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("StackId")
        private String stackId;

        @com.aliyun.core.annotation.NameInMap("StackName")
        private String stackName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusReason")
        private String statusReason;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
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
             * <p>The time when the resource was created. The time is displayed in UTC. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-08-01T06:01:23</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the most recent successful drift detection was performed on the stack.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-02-27T07:47:47</p>
             */
            public Builder driftDetectionTime(String driftDetectionTime) {
                this.driftDetectionTime = driftDetectionTime;
                return this;
            }

            /**
             * <p>The logical ID of the resource. The logical ID is the resource name that is defined in the template.</p>
             * 
             * <strong>example:</strong>
             * <p>dummy</p>
             */
            public Builder logicalResourceId(String logicalResourceId) {
                this.logicalResourceId = logicalResourceId;
                return this;
            }

            /**
             * <p>The information about the modules from which the resource is created. This parameter is returned only if the resource is created from modules.</p>
             */
            public Builder moduleInfo(ModuleInfo moduleInfo) {
                this.moduleInfo = moduleInfo;
                return this;
            }

            /**
             * <p>The physical ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>d04af923-e6b7-4272-aeaa-47ec9777****</p>
             */
            public Builder physicalResourceId(String physicalResourceId) {
                this.physicalResourceId = physicalResourceId;
                return this;
            }

            /**
             * <p>The drift state of the resource in the most recent successful drift detection. Valid values:</p>
             * <ul>
             * <li>DELETED: The actual configuration of the resource differs from its expected template configuration because the resource is deleted.</li>
             * <li>MODIFIED: The actual configuration of the resource differs from its expected template configuration.</li>
             * <li>NOT_CHECKED: Resource Orchestration Service (ROS) has not checked whether the actual configuration of the resource differs from its expected template configuration.</li>
             * <li>IN_SYNC: The actual configuration of the resource matches its expected template configuration.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IN_SYNC</p>
             */
            public Builder resourceDriftStatus(String resourceDriftStatus) {
                this.resourceDriftStatus = resourceDriftStatus;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN::ROS::Stack</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The stack ID.</p>
             * 
             * <strong>example:</strong>
             * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
             */
            public Builder stackId(String stackId) {
                this.stackId = stackId;
                return this;
            }

            /**
             * <p>The stack name.<br>The name can be up to 255 characters in length, and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.</p>
             * 
             * <strong>example:</strong>
             * <p>test-describe-resource</p>
             */
            public Builder stackName(String stackName) {
                this.stackName = stackName;
                return this;
            }

            /**
             * <p>The state of the resource. Valid values:</p>
             * <ul>
             * <li>INIT_COMPLETE: The resource is pending to be created.</li>
             * <li>CREATE_COMPLETE: The resource is created.</li>
             * <li>CREATE_FAILED: The resource failed to be created.</li>
             * <li>CREATE_IN_PROGRESS: The resource is being created.</li>
             * <li>UPDATE_IN_PROGRESS: The resource is being updated.</li>
             * <li>UPDATE_FAILED: The resource failed to be updated.</li>
             * <li>UPDATE_COMPLETE: The resource is updated.</li>
             * <li>DELETE_IN_PROGRESS: The resource is being deleted.</li>
             * <li>DELETE_FAILED: The resource failed to be deleted.</li>
             * <li>DELETE_COMPLETE: The resource is deleted.</li>
             * <li>CHECK_IN_PROGRESS: The resource is being validated.</li>
             * <li>CHECK_FAILED: The resource failed to be validated.</li>
             * <li>CHECK_COMPLETE: The resource is validated.</li>
             * <li>IMPORT_IN_PROGRESS: The resource is being imported.</li>
             * <li>IMPORT_FAILED: The resource failed to be imported.</li>
             * <li>IMPORT_COMPLETE: The resource is imported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>UPDATE_COMPLETE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The reason why the resource is in its current state.</p>
             * 
             * <strong>example:</strong>
             * <p>state changed</p>
             */
            public Builder statusReason(String statusReason) {
                this.statusReason = statusReason;
                return this;
            }

            /**
             * <p>The time when the resource was updated. The time is displayed in UTC. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-08-01T06:01:29</p>
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
