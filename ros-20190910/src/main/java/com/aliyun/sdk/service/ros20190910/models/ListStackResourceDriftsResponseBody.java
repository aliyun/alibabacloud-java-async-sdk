// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListStackResourceDriftsResponseBody} extends {@link TeaModel}
 *
 * <p>ListStackResourceDriftsResponseBody</p>
 */
public class ListStackResourceDriftsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceDrifts")
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
         * The query token returned in this call.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The resource drifts.
         */
        public Builder resourceDrifts(java.util.List < ResourceDrifts> resourceDrifts) {
            this.resourceDrifts = resourceDrifts;
            return this;
        }

        public ListStackResourceDriftsResponseBody build() {
            return new ListStackResourceDriftsResponseBody(this);
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
    public static class PropertyDifferences extends TeaModel {
        @NameInMap("ActualValue")
        private String actualValue;

        @NameInMap("DifferenceType")
        private String differenceType;

        @NameInMap("ExpectedValue")
        private String expectedValue;

        @NameInMap("PropertyPath")
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
             * The actual value of the resource property.
             */
            public Builder actualValue(String actualValue) {
                this.actualValue = actualValue;
                return this;
            }

            /**
             * The drift type of the resource property. Valid values:
             * <p>
             * 
             * *   ADD: The value is added to a resource property whose data type is Array or List.
             * *   REMOVE: The property is deleted from the current resource configuration.
             * *   NOT_EQUAL: The current property value differs from the expected value that is defined in the stack template.
             */
            public Builder differenceType(String differenceType) {
                this.differenceType = differenceType;
                return this;
            }

            /**
             * The expected value of the resource property that is defined in the template.
             */
            public Builder expectedValue(String expectedValue) {
                this.expectedValue = expectedValue;
                return this;
            }

            /**
             * The path of the resource property.
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
    public static class ResourceDrifts extends TeaModel {
        @NameInMap("ActualProperties")
        private String actualProperties;

        @NameInMap("DriftDetectionTime")
        private String driftDetectionTime;

        @NameInMap("ExpectedProperties")
        private String expectedProperties;

        @NameInMap("LogicalResourceId")
        private String logicalResourceId;

        @NameInMap("ModuleInfo")
        private ModuleInfo moduleInfo;

        @NameInMap("PhysicalResourceId")
        private String physicalResourceId;

        @NameInMap("PropertyDifferences")
        private java.util.List < PropertyDifferences> propertyDifferences;

        @NameInMap("ResourceDriftStatus")
        private String resourceDriftStatus;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("StackId")
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
             * The actual JSON-formatted resource properties.
             */
            public Builder actualProperties(String actualProperties) {
                this.actualProperties = actualProperties;
                return this;
            }

            /**
             * The time when the drift detection operation was performed on the resource.
             */
            public Builder driftDetectionTime(String driftDetectionTime) {
                this.driftDetectionTime = driftDetectionTime;
                return this;
            }

            /**
             * The JSON-formatted resource properties that are defined in the template.
             */
            public Builder expectedProperties(String expectedProperties) {
                this.expectedProperties = expectedProperties;
                return this;
            }

            /**
             * The logical ID of the resource. The logical ID indicates the name of the resource that is defined in the template.
             */
            public Builder logicalResourceId(String logicalResourceId) {
                this.logicalResourceId = logicalResourceId;
                return this;
            }

            /**
             * The information about the modules from which the resource was created. This parameter is returned only if the resource is created from modules.
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
             * The property drifts of the resource.
             */
            public Builder propertyDifferences(java.util.List < PropertyDifferences> propertyDifferences) {
                this.propertyDifferences = propertyDifferences;
                return this;
            }

            /**
             * The drift state of the resource. Valid values:
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

            public ResourceDrifts build() {
                return new ResourceDrifts(this);
            } 

        } 

    }
}
