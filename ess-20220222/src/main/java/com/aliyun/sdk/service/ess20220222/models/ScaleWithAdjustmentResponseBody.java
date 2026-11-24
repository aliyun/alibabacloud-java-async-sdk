// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ScaleWithAdjustmentResponseBody} extends {@link TeaModel}
 *
 * <p>ScaleWithAdjustmentResponseBody</p>
 */
public class ScaleWithAdjustmentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActivityType")
    private String activityType;

    @com.aliyun.core.annotation.NameInMap("PlanResult")
    private PlanResult planResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScalingActivityId")
    private String scalingActivityId;

    private ScaleWithAdjustmentResponseBody(Builder builder) {
        this.activityType = builder.activityType;
        this.planResult = builder.planResult;
        this.requestId = builder.requestId;
        this.scalingActivityId = builder.scalingActivityId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScaleWithAdjustmentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return activityType
     */
    public String getActivityType() {
        return this.activityType;
    }

    /**
     * @return planResult
     */
    public PlanResult getPlanResult() {
        return this.planResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scalingActivityId
     */
    public String getScalingActivityId() {
        return this.scalingActivityId;
    }

    public static final class Builder {
        private String activityType; 
        private PlanResult planResult; 
        private String requestId; 
        private String scalingActivityId; 

        private Builder() {
        } 

        private Builder(ScaleWithAdjustmentResponseBody model) {
            this.activityType = model.activityType;
            this.planResult = model.planResult;
            this.requestId = model.requestId;
            this.scalingActivityId = model.scalingActivityId;
        } 

        /**
         * <p>The type of the scaling activity. If <code>ActivityType</code> is <code>CapacityChange</code>, the scaling activity corresponding to the returned <code>ScalingActivityId</code> only modifies the expected number of instances in the scaling group and does not immediately execute scale-out or scale-in. Applicable scope: scaling groups with the expected number of instances configured.</p>
         * 
         * <strong>example:</strong>
         * <p>CapacityChange</p>
         */
        public Builder activityType(String activityType) {
            this.activityType = activityType;
            return this;
        }

        /**
         * <p>The elastic planning results returned when ExecutionMode is set to PlanOnly.</p>
         */
        public Builder planResult(PlanResult planResult) {
            this.planResult = planResult;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the scaling activity.</p>
         * 
         * <strong>example:</strong>
         * <p>asa-bp175o6f6ego3r2j****</p>
         */
        public Builder scalingActivityId(String scalingActivityId) {
            this.scalingActivityId = scalingActivityId;
            return this;
        }

        public ScaleWithAdjustmentResponseBody build() {
            return new ScaleWithAdjustmentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ScaleWithAdjustmentResponseBody} extends {@link TeaModel}
     *
     * <p>ScaleWithAdjustmentResponseBody</p>
     */
    public static class ResourceAllocations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private Integer amount;

        @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("SpotStrategy")
        private String spotStrategy;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private ResourceAllocations(Builder builder) {
            this.amount = builder.amount;
            this.instanceChargeType = builder.instanceChargeType;
            this.instanceType = builder.instanceType;
            this.spotStrategy = builder.spotStrategy;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceAllocations create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Integer getAmount() {
            return this.amount;
        }

        /**
         * @return instanceChargeType
         */
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return spotStrategy
         */
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Integer amount; 
            private String instanceChargeType; 
            private String instanceType; 
            private String spotStrategy; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(ResourceAllocations model) {
                this.amount = model.amount;
                this.instanceChargeType = model.instanceChargeType;
                this.instanceType = model.instanceType;
                this.spotStrategy = model.spotStrategy;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The number of instances.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>The billing method. Valid values:</p>
             * <ul>
             * <li><strong>Prepaid</strong>: subscription.</li>
             * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PostPaid</p>
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * <p>The instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.u1-c1m8.large</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The preemption policy for the instance. Valid values:</p>
             * <ul>
             * <li>NoSpot: regular pay-as-you-go instance.</li>
             * <li>SpotWithPriceLimit: spot instance with a maximum price limit.</li>
             * <li>SpotAsPriceGo: spot instance whose price is automatically set by the system based on the current market price.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NoSpot</p>
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing-g</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ResourceAllocations build() {
                return new ResourceAllocations(this);
            } 

        } 

    }
    /**
     * 
     * {@link ScaleWithAdjustmentResponseBody} extends {@link TeaModel}
     *
     * <p>ScaleWithAdjustmentResponseBody</p>
     */
    public static class PlanResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceAllocations")
        private java.util.List<ResourceAllocations> resourceAllocations;

        private PlanResult(Builder builder) {
            this.resourceAllocations = builder.resourceAllocations;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PlanResult create() {
            return builder().build();
        }

        /**
         * @return resourceAllocations
         */
        public java.util.List<ResourceAllocations> getResourceAllocations() {
            return this.resourceAllocations;
        }

        public static final class Builder {
            private java.util.List<ResourceAllocations> resourceAllocations; 

            private Builder() {
            } 

            private Builder(PlanResult model) {
                this.resourceAllocations = model.resourceAllocations;
            } 

            /**
             * <p>The resource allocation information in the elastic planning results.</p>
             */
            public Builder resourceAllocations(java.util.List<ResourceAllocations> resourceAllocations) {
                this.resourceAllocations = resourceAllocations;
                return this;
            }

            public PlanResult build() {
                return new PlanResult(this);
            } 

        } 

    }
}
