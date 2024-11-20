// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetStackResourceResponseBody} extends {@link TeaModel}
 *
 * <p>GetStackResourceResponseBody</p>
 */
public class GetStackResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DriftDetectionTime")
    private String driftDetectionTime;

    @com.aliyun.core.annotation.NameInMap("LogicalResourceId")
    private String logicalResourceId;

    @com.aliyun.core.annotation.NameInMap("Metadata")
    private java.util.Map < String, ? > metadata;

    @com.aliyun.core.annotation.NameInMap("ModuleInfo")
    private ModuleInfo moduleInfo;

    @com.aliyun.core.annotation.NameInMap("PhysicalResourceId")
    private String physicalResourceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceAttributes")
    private java.util.List < java.util.Map<String, ?>> resourceAttributes;

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
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-08-01T06:01:23</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The reason why the resource is in its current state.</p>
         * 
         * <strong>example:</strong>
         * <p>no description</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the stack.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-02-27T07:47:47</p>
         */
        public Builder driftDetectionTime(String driftDetectionTime) {
            this.driftDetectionTime = driftDetectionTime;
            return this;
        }

        /**
         * <p>The time when the resource was updated.</p>
         * <p>The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>WebServer</p>
         */
        public Builder logicalResourceId(String logicalResourceId) {
            this.logicalResourceId = logicalResourceId;
            return this;
        }

        /**
         * <p>The list of the resource properties.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key&quot;: &quot;value&quot;}</p>
         */
        public Builder metadata(java.util.Map < String, ? > metadata) {
            this.metadata = metadata;
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
         * <p>The metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>d04af923-e6b7-4272-aeaa-47ec9777****</p>
         */
        public Builder physicalResourceId(String physicalResourceId) {
            this.physicalResourceId = physicalResourceId;
            return this;
        }

        /**
         * <p>The physical ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>B288A0BE-D927-4888-B0F7-B35EF84B6E6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the resource in the last successful drift detection. Valid values:</p>
         * <ul>
         * <li>DELETED: The actual configuration of the resource differs from its expected template configuration because the resource is deleted.</li>
         * <li>MODIFIED: The actual configuration of the resource differs from its expected template configuration.</li>
         * <li>NOT_CHECKED: ROS has not checked whether the actual configuration of the resource differs from its expected template configuration.</li>
         * <li>IN_SYNC: The actual configuration of the resource matches its expected template configuration.</li>
         * </ul>
         */
        public Builder resourceAttributes(java.util.List < java.util.Map<String, ?>> resourceAttributes) {
            this.resourceAttributes = resourceAttributes;
            return this;
        }

        /**
         * <p>The time when the last successful drift detection was performed on the stack.</p>
         * 
         * <strong>example:</strong>
         * <p>IN_SYNC</p>
         */
        public Builder resourceDriftStatus(String resourceDriftStatus) {
            this.resourceDriftStatus = resourceDriftStatus;
            return this;
        }

        /**
         * <p>The logical ID of the resource defined in the template.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN::ROS::WaitConditionHandle</p>
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The ID of the stack.</p>
         * 
         * <strong>example:</strong>
         * <p>efdf5c10-96a5-4fd7-ab89-68e7baa2****</p>
         */
        public Builder stackId(String stackId) {
            this.stackId = stackId;
            return this;
        }

        /**
         * <p>The name of the stack.</p>
         * 
         * <strong>example:</strong>
         * <p>test-describe-resource</p>
         */
        public Builder stackName(String stackName) {
            this.stackName = stackName;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE_COMPLETE</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The time when the resource was created.</p>
         * <p>The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>state changed</p>
         */
        public Builder statusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }

        /**
         * <p>The name of the stack.</p>
         * <p>The name can be up to 255 characters in length, and can contain digits, letters, hyphens (-), and underscores (_). The name must start with a digit or letter.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-08-01T06:01:29</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public GetStackResourceResponseBody build() {
            return new GetStackResourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetStackResourceResponseBody} extends {@link TeaModel}
     *
     * <p>GetStackResourceResponseBody</p>
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
}
