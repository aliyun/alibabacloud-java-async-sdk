// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStackResourceResponseBody} extends {@link TeaModel}
 *
 * <p>GetStackResourceResponseBody</p>
 */
public class GetStackResourceResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("Description")
    private String description;

    @NameInMap("DriftDetectionTime")
    private String driftDetectionTime;

    @NameInMap("LogicalResourceId")
    private String logicalResourceId;

    @NameInMap("Metadata")
    private java.util.Map < String, ? > metadata;

    @NameInMap("ModuleInfo")
    private ModuleInfo moduleInfo;

    @NameInMap("PhysicalResourceId")
    private String physicalResourceId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceAttributes")
    private java.util.List < java.util.Map<String, ?>> resourceAttributes;

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

    private GetStackResourceResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.driftDetectionTime = builder.driftDetectionTime;
        this.logicalResourceId = builder.logicalResourceId;
        this.metadata = builder.metadata;
        this.moduleInfo = builder.moduleInfo;
        this.physicalResourceId = builder.physicalResourceId;
        this.requestId = builder.requestId;
        this.resourceAttributes = builder.resourceAttributes;
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

    public static GetStackResourceResponseBody create() {
        return builder().build();
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
     * @return metadata
     */
    public java.util.Map < String, ? > getMetadata() {
        return this.metadata;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceAttributes
     */
    public java.util.List < java.util.Map<String, ?>> getResourceAttributes() {
        return this.resourceAttributes;
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
        private String description; 
        private String driftDetectionTime; 
        private String logicalResourceId; 
        private java.util.Map < String, ? > metadata; 
        private ModuleInfo moduleInfo; 
        private String physicalResourceId; 
        private String requestId; 
        private java.util.List < java.util.Map<String, ?>> resourceAttributes; 
        private String resourceDriftStatus; 
        private String resourceType; 
        private String stackId; 
        private String stackName; 
        private String status; 
        private String statusReason; 
        private String updateTime; 

        /**
         * The resource type.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * The reason why the resource is in its current state.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The ID of the stack.
         */
        public Builder driftDetectionTime(String driftDetectionTime) {
            this.driftDetectionTime = driftDetectionTime;
            return this;
        }

        /**
         * The time when the resource was updated.
         * <p>
         * 
         * The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.
         */
        public Builder logicalResourceId(String logicalResourceId) {
            this.logicalResourceId = logicalResourceId;
            return this;
        }

        /**
         * The list of the resource properties.
         */
        public Builder metadata(java.util.Map < String, ? > metadata) {
            this.metadata = metadata;
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
         * The metadata.
         */
        public Builder physicalResourceId(String physicalResourceId) {
            this.physicalResourceId = physicalResourceId;
            return this;
        }

        /**
         * The physical ID of the resource.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status of the resource in the last successful drift detection. Valid values:
         * <p>
         * 
         * *   DELETED: The actual configuration of the resource differs from its expected template configuration because the resource is deleted.
         * *   MODIFIED: The actual configuration of the resource differs from its expected template configuration.
         * *   NOT_CHECKED: ROS has not checked whether the actual configuration of the resource differs from its expected template configuration.
         * *   IN_SYNC: The actual configuration of the resource matches its expected template configuration.
         */
        public Builder resourceAttributes(java.util.List < java.util.Map<String, ?>> resourceAttributes) {
            this.resourceAttributes = resourceAttributes;
            return this;
        }

        /**
         * The time when the last successful drift detection was performed on the stack.
         */
        public Builder resourceDriftStatus(String resourceDriftStatus) {
            this.resourceDriftStatus = resourceDriftStatus;
            return this;
        }

        /**
         * The logical ID of the resource defined in the template.
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * The ID of the stack.
         */
        public Builder stackId(String stackId) {
            this.stackId = stackId;
            return this;
        }

        /**
         * The name of the stack.
         */
        public Builder stackName(String stackName) {
            this.stackName = stackName;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * The time when the resource was created.
         * <p>
         * 
         * The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.
         */
        public Builder statusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }

        /**
         * The name of the stack.
         * <p>
         * 
         * The name can be up to 255 characters in length, and can contain digits, letters, hyphens (-), and underscores (\_). The name must start with a digit or letter.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public GetStackResourceResponseBody build() {
            return new GetStackResourceResponseBody(this);
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
}
