// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DetectStackResourceDriftResponseBody} extends {@link TeaModel}
 *
 * <p>DetectStackResourceDriftResponseBody</p>
 */
public class DetectStackResourceDriftResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActualProperties")
    private String actualProperties;

    @com.aliyun.core.annotation.NameInMap("DriftDetectionTime")
    private String driftDetectionTime;

    @com.aliyun.core.annotation.NameInMap("ExpectedProperties")
    private String expectedProperties;

    @com.aliyun.core.annotation.NameInMap("LogicalResourceId")
    private String logicalResourceId;

    @com.aliyun.core.annotation.NameInMap("PhysicalResourceId")
    private String physicalResourceId;

    @com.aliyun.core.annotation.NameInMap("PropertyDifferences")
    private java.util.List < PropertyDifferences> propertyDifferences;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceDriftStatus")
    private String resourceDriftStatus;

    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.NameInMap("StackId")
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
         * <p>The time when the resource drift detection was initiated.</p>
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
         * <p>The logical ID of the resource that is defined in the template.</p>
         * 
         * <strong>example:</strong>
         * <p>ScalingRule</p>
         */
        public Builder logicalResourceId(String logicalResourceId) {
            this.logicalResourceId = logicalResourceId;
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
         * <p>The drift status of the resource. Valid values:</p>
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
         * <p>The type of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN::ESS::ScalingRule</p>
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The ID of the stack.</p>
         * 
         * <strong>example:</strong>
         * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
         */
        public Builder stackId(String stackId) {
            this.stackId = stackId;
            return this;
        }

        public DetectStackResourceDriftResponseBody build() {
            return new DetectStackResourceDriftResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DetectStackResourceDriftResponseBody} extends {@link TeaModel}
     *
     * <p>DetectStackResourceDriftResponseBody</p>
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
             * <li>ADD: The property value has been added to a resource property whose data type was Array or List.</li>
             * <li>REMOVE: The property has been deleted from the current resource configuration.</li>
             * <li>NOT_EQUAL: The current property value differs from the expected value defined in the stack template.</li>
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
}
