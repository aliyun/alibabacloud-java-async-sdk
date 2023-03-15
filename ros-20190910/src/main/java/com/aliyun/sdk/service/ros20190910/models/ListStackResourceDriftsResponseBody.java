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
         * The query token value returned in this call.
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
         * An array of resource drifts.
         */
        public Builder resourceDrifts(java.util.List < ResourceDrifts> resourceDrifts) {
            this.resourceDrifts = resourceDrifts;
            return this;
        }

        public ListStackResourceDriftsResponseBody build() {
            return new ListStackResourceDriftsResponseBody(this);
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
             * *   ADD: The value has been added to a resource property whose data type was Array or List.
             * *   REMOVE: The property has been deleted from the current resource configuration.
             * *   NOT_EQUAL: The current property value differs from the expected value defined in the stack template.
             */
            public Builder differenceType(String differenceType) {
                this.differenceType = differenceType;
                return this;
            }

            /**
             * The expected value of the resource property as defined in the template.
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
            private String physicalResourceId; 
            private java.util.List < PropertyDifferences> propertyDifferences; 
            private String resourceDriftStatus; 
            private String resourceType; 
            private String stackId; 

            /**
             * The actual resource properties in JSON format.
             */
            public Builder actualProperties(String actualProperties) {
                this.actualProperties = actualProperties;
                return this;
            }

            /**
             * The time when the resource drift detection operation was initiated.
             */
            public Builder driftDetectionTime(String driftDetectionTime) {
                this.driftDetectionTime = driftDetectionTime;
                return this;
            }

            /**
             * The resource properties as defined in the template, in JSON format.
             */
            public Builder expectedProperties(String expectedProperties) {
                this.expectedProperties = expectedProperties;
                return this;
            }

            /**
             * The logical ID of the resource as defined in the template.
             */
            public Builder logicalResourceId(String logicalResourceId) {
                this.logicalResourceId = logicalResourceId;
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
             * The property differences of the resource.
             */
            public Builder propertyDifferences(java.util.List < PropertyDifferences> propertyDifferences) {
                this.propertyDifferences = propertyDifferences;
                return this;
            }

            /**
             * The drift status of the resource. Valid values:
             * <p>
             * 
             * *   DELETED: The actual configuration of the resource differs from its expected template configuration because the resource had been deleted.
             * *   MODIFIED: The actual configuration of the resource differs from its expected template configuration.
             * *   NOT_CHECKED: ROS has not checked whether the actual configuration of the resource differs from its expected template configuration.
             * *   IN_SYNC: The actual configuration of the resource matches its expected template configuration.
             */
            public Builder resourceDriftStatus(String resourceDriftStatus) {
                this.resourceDriftStatus = resourceDriftStatus;
                return this;
            }

            /**
             * The type of the resource.
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

            public ResourceDrifts build() {
                return new ResourceDrifts(this);
            } 

        } 

    }
}
