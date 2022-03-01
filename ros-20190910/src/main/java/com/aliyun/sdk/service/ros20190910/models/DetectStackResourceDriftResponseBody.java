// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetectStackResourceDriftResponseBody} extends {@link TeaModel}
 *
 * <p>DetectStackResourceDriftResponseBody</p>
 */
public class DetectStackResourceDriftResponseBody extends TeaModel {
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

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceDriftStatus")
    private String resourceDriftStatus;

    @NameInMap("ResourceType")
    private String resourceType;

    @NameInMap("StackId")
    private String stackId;

    private DetectStackResourceDriftResponseBody(Builder builder) {
        this.actualProperties = builder.actualProperties;
        this.driftDetectionTime = builder.driftDetectionTime;
        this.expectedProperties = builder.expectedProperties;
        this.logicalResourceId = builder.logicalResourceId;
        this.physicalResourceId = builder.physicalResourceId;
        this.propertyDifferences = builder.propertyDifferences;
        this.requestId = builder.requestId;
        this.resourceDriftStatus = builder.resourceDriftStatus;
        this.resourceType = builder.resourceType;
        this.stackId = builder.stackId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetectStackResourceDriftResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String requestId; 
        private String resourceDriftStatus; 
        private String resourceType; 
        private String stackId; 

        /**
         * ActualProperties.
         */
        public Builder actualProperties(String actualProperties) {
            this.actualProperties = actualProperties;
            return this;
        }

        /**
         * DriftDetectionTime.
         */
        public Builder driftDetectionTime(String driftDetectionTime) {
            this.driftDetectionTime = driftDetectionTime;
            return this;
        }

        /**
         * ExpectedProperties.
         */
        public Builder expectedProperties(String expectedProperties) {
            this.expectedProperties = expectedProperties;
            return this;
        }

        /**
         * LogicalResourceId.
         */
        public Builder logicalResourceId(String logicalResourceId) {
            this.logicalResourceId = logicalResourceId;
            return this;
        }

        /**
         * PhysicalResourceId.
         */
        public Builder physicalResourceId(String physicalResourceId) {
            this.physicalResourceId = physicalResourceId;
            return this;
        }

        /**
         * PropertyDifferences.
         */
        public Builder propertyDifferences(java.util.List < PropertyDifferences> propertyDifferences) {
            this.propertyDifferences = propertyDifferences;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceDriftStatus.
         */
        public Builder resourceDriftStatus(String resourceDriftStatus) {
            this.resourceDriftStatus = resourceDriftStatus;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * StackId.
         */
        public Builder stackId(String stackId) {
            this.stackId = stackId;
            return this;
        }

        public DetectStackResourceDriftResponseBody build() {
            return new DetectStackResourceDriftResponseBody(this);
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
             * ActualValue.
             */
            public Builder actualValue(String actualValue) {
                this.actualValue = actualValue;
                return this;
            }

            /**
             * DifferenceType.
             */
            public Builder differenceType(String differenceType) {
                this.differenceType = differenceType;
                return this;
            }

            /**
             * ExpectedValue.
             */
            public Builder expectedValue(String expectedValue) {
                this.expectedValue = expectedValue;
                return this;
            }

            /**
             * PropertyPath.
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
}
