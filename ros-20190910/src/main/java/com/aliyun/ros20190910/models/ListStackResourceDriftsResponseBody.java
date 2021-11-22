// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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
         * <p>NextToken.</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>ResourceDrifts.</p>
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
             * <p>ActualValue.</p>
             */
            public Builder actualValue(String actualValue) {
                this.actualValue = actualValue;
                return this;
            }

            /**
             * <p>DifferenceType.</p>
             */
            public Builder differenceType(String differenceType) {
                this.differenceType = differenceType;
                return this;
            }

            /**
             * <p>ExpectedValue.</p>
             */
            public Builder expectedValue(String expectedValue) {
                this.expectedValue = expectedValue;
                return this;
            }

            /**
             * <p>PropertyPath.</p>
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
             * <p>ActualProperties.</p>
             */
            public Builder actualProperties(String actualProperties) {
                this.actualProperties = actualProperties;
                return this;
            }

            /**
             * <p>DriftDetectionTime.</p>
             */
            public Builder driftDetectionTime(String driftDetectionTime) {
                this.driftDetectionTime = driftDetectionTime;
                return this;
            }

            /**
             * <p>ExpectedProperties.</p>
             */
            public Builder expectedProperties(String expectedProperties) {
                this.expectedProperties = expectedProperties;
                return this;
            }

            /**
             * <p>LogicalResourceId.</p>
             */
            public Builder logicalResourceId(String logicalResourceId) {
                this.logicalResourceId = logicalResourceId;
                return this;
            }

            /**
             * <p>PhysicalResourceId.</p>
             */
            public Builder physicalResourceId(String physicalResourceId) {
                this.physicalResourceId = physicalResourceId;
                return this;
            }

            /**
             * <p>PropertyDifferences.</p>
             */
            public Builder propertyDifferences(java.util.List < PropertyDifferences> propertyDifferences) {
                this.propertyDifferences = propertyDifferences;
                return this;
            }

            /**
             * <p>ResourceDriftStatus.</p>
             */
            public Builder resourceDriftStatus(String resourceDriftStatus) {
                this.resourceDriftStatus = resourceDriftStatus;
                return this;
            }

            /**
             * <p>ResourceType.</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>StackId.</p>
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
