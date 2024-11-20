// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListStackResourceDriftsResponseBody} extends {@link TeaModel}
 *
 * <p>ListStackResourceDriftsResponseBody</p>
 */
public class ListStackResourceDriftsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceDrifts")
    private java.util.List < ResourceDrifts> resourceDrifts;

    private ListStackResourceDriftsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.resourceDrifts = builder.resourceDrifts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStackResourceDriftsResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceDrifts
     */
    public java.util.List < ResourceDrifts> getResourceDrifts() {
        return this.resourceDrifts;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List < ResourceDrifts> resourceDrifts; 

        /**
         * <p>The query token returned in this call.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2****w==</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B288A0BE-D927-4888-B0F7-B35EF84B6E6F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resource drifts.</p>
         */
        public Builder resourceDrifts(java.util.List < ResourceDrifts> resourceDrifts) {
            this.resourceDrifts = resourceDrifts;
            return this;
        }

        public ListStackResourceDriftsResponseBody build() {
            return new ListStackResourceDriftsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListStackResourceDriftsResponseBody} extends {@link TeaModel}
     *
     * <p>ListStackResourceDriftsResponseBody</p>
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
     * {@link ListStackResourceDriftsResponseBody} extends {@link TeaModel}
     *
     * <p>ListStackResourceDriftsResponseBody</p>
     */
    public static class PropertyDifferences extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActualValue")
        private String actualValue;

        @com.aliyun.core.annotation.NameInMap("DifferenceType")
        private String differenceType;

        @com.aliyun.core.annotation.NameInMap("ExpectedValue")
        private String expectedValue;

        @com.aliyun.core.annotation.NameInMap("PropertyPath")
        private String propertyPath;

        private PropertyDifferences(Builder builder) {
            this.actualValue = builder.actualValue;
            this.differenceType = builder.differenceType;
            this.expectedValue = builder.expectedValue;
            this.propertyPath = builder.propertyPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PropertyDifferences create() {
            return builder().build();
        }

        /**
         * @return actualValue
         */
        public String getActualValue() {
            return this.actualValue;
        }

        /**
         * @return differenceType
         */
        public String getDifferenceType() {
            return this.differenceType;
        }

        /**
         * @return expectedValue
         */
        public String getExpectedValue() {
            return this.expectedValue;
        }

        /**
         * @return propertyPath
         */
        public String getPropertyPath() {
            return this.propertyPath;
        }

        public static final class Builder {
            private String actualValue; 
            private String differenceType; 
            private String expectedValue; 
            private String propertyPath; 

            /**
             * <p>The actual value of the resource property.</p>
             * 
             * <strong>example:</strong>
             * <p>test1</p>
             */
            public Builder actualValue(String actualValue) {
                this.actualValue = actualValue;
                return this;
            }

            /**
             * <p>The drift type of the resource property. Valid values:</p>
             * <ul>
             * <li>ADD: The value is added to a resource property whose data type is Array or List.</li>
             * <li>REMOVE: The property is deleted from the current resource configuration.</li>
             * <li>NOT_EQUAL: The current property value differs from the expected value that is defined in the stack template.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NOT_EQUAL</p>
             */
            public Builder differenceType(String differenceType) {
                this.differenceType = differenceType;
                return this;
            }

            /**
             * <p>The expected value of the resource property that is defined in the template.</p>
             * 
             * <strong>example:</strong>
             * <p>test2</p>
             */
            public Builder expectedValue(String expectedValue) {
                this.expectedValue = expectedValue;
                return this;
            }

            /**
             * <p>The path of the resource property.</p>
             * 
             * <strong>example:</strong>
             * <p>/ScalingRuleName</p>
             */
            public Builder propertyPath(String propertyPath) {
                this.propertyPath = propertyPath;
                return this;
            }

            public PropertyDifferences build() {
                return new PropertyDifferences(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListStackResourceDriftsResponseBody} extends {@link TeaModel}
     *
     * <p>ListStackResourceDriftsResponseBody</p>
     */
    public static class ResourceDrifts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActualProperties")
        private String actualProperties;

        @com.aliyun.core.annotation.NameInMap("DriftDetectionTime")
        private String driftDetectionTime;

        @com.aliyun.core.annotation.NameInMap("ExpectedProperties")
        private String expectedProperties;

        @com.aliyun.core.annotation.NameInMap("LogicalResourceId")
        private String logicalResourceId;

        @com.aliyun.core.annotation.NameInMap("ModuleInfo")
        private ModuleInfo moduleInfo;

        @com.aliyun.core.annotation.NameInMap("PhysicalResourceId")
        private String physicalResourceId;

        @com.aliyun.core.annotation.NameInMap("PropertyDifferences")
        private java.util.List < PropertyDifferences> propertyDifferences;

        @com.aliyun.core.annotation.NameInMap("ResourceDriftStatus")
        private String resourceDriftStatus;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("StackId")
        private String stackId;

        private ResourceDrifts(Builder builder) {
            this.actualProperties = builder.actualProperties;
            this.driftDetectionTime = builder.driftDetectionTime;
            this.expectedProperties = builder.expectedProperties;
            this.logicalResourceId = builder.logicalResourceId;
            this.moduleInfo = builder.moduleInfo;
            this.physicalResourceId = builder.physicalResourceId;
            this.propertyDifferences = builder.propertyDifferences;
            this.resourceDriftStatus = builder.resourceDriftStatus;
            this.resourceType = builder.resourceType;
            this.stackId = builder.stackId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceDrifts create() {
            return builder().build();
        }

        /**
         * @return actualProperties
         */
        public String getActualProperties() {
            return this.actualProperties;
        }

        /**
         * @return driftDetectionTime
         */
        public String getDriftDetectionTime() {
            return this.driftDetectionTime;
        }

        /**
         * @return expectedProperties
         */
        public String getExpectedProperties() {
            return this.expectedProperties;
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
         * @return propertyDifferences
         */
        public java.util.List < PropertyDifferences> getPropertyDifferences() {
            return this.propertyDifferences;
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

        public static final class Builder {
            private String actualProperties; 
            private String driftDetectionTime; 
            private String expectedProperties; 
            private String logicalResourceId; 
            private ModuleInfo moduleInfo; 
            private String physicalResourceId; 
            private java.util.List < PropertyDifferences> propertyDifferences; 
            private String resourceDriftStatus; 
            private String resourceType; 
            private String stackId; 

            /**
             * <p>The actual JSON-formatted resource properties.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;ScalingRuleName&quot;: &quot;test1&quot;}</p>
             */
            public Builder actualProperties(String actualProperties) {
                this.actualProperties = actualProperties;
                return this;
            }

            /**
             * <p>The time when the drift detection operation was performed on the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-02-27T07:47:47</p>
             */
            public Builder driftDetectionTime(String driftDetectionTime) {
                this.driftDetectionTime = driftDetectionTime;
                return this;
            }

            /**
             * <p>The JSON-formatted resource properties that are defined in the template.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;ScalingRuleName&quot;: &quot;test2&quot;}</p>
             */
            public Builder expectedProperties(String expectedProperties) {
                this.expectedProperties = expectedProperties;
                return this;
            }

            /**
             * <p>The logical ID of the resource. The logical ID indicates the name of the resource that is defined in the template.</p>
             * 
             * <strong>example:</strong>
             * <p>ScalingRule</p>
             */
            public Builder logicalResourceId(String logicalResourceId) {
                this.logicalResourceId = logicalResourceId;
                return this;
            }

            /**
             * <p>The information about the modules from which the resource was created. This parameter is returned only if the resource is created from modules.</p>
             */
            public Builder moduleInfo(ModuleInfo moduleInfo) {
                this.moduleInfo = moduleInfo;
                return this;
            }

            /**
             * <p>The physical ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>asr-2ze4zzc3kf9yz1kd****</p>
             */
            public Builder physicalResourceId(String physicalResourceId) {
                this.physicalResourceId = physicalResourceId;
                return this;
            }

            /**
             * <p>The property drifts of the resource.</p>
             */
            public Builder propertyDifferences(java.util.List < PropertyDifferences> propertyDifferences) {
                this.propertyDifferences = propertyDifferences;
                return this;
            }

            /**
             * <p>The drift state of the resource. Valid values:</p>
             * <ul>
             * <li>DELETED: The actual configuration of the resource differs from its expected template configuration because the resource is deleted.</li>
             * <li>MODIFIED: The actual configuration of the resource differs from its expected template configuration.</li>
             * <li>NOT_CHECKED: Resource Orchestration Service (ROS) has not checked whether the actual configuration of the resource differs from its expected template configuration.</li>
             * <li>IN_SYNC: The actual configuration of the resource matches its expected template configuration.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MODIFIED</p>
             */
            public Builder resourceDriftStatus(String resourceDriftStatus) {
                this.resourceDriftStatus = resourceDriftStatus;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN::ESS::ScalingRule</p>
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

            public ResourceDrifts build() {
                return new ResourceDrifts(this);
            } 

        } 

    }
}
