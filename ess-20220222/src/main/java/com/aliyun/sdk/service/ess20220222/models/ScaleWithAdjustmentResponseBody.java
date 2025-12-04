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
         * <p>The type of the scaling activity.</p>
         * <p>If <code>ActivityType</code> is set to <code>CapacityChange</code>, only the expected number of instances is changed during the scaling activity specified by ScalingActivityId and no scale-out is triggered.</p>
         * <p>This parameter is applicable to only scaling groups that have an expected number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>CapacityChange</p>
         */
        public Builder activityType(String activityType) {
            this.activityType = activityType;
            return this;
        }

        /**
         * <p>The elastic planning result returned when the ExecutionMode is set to PlanOnly.</p>
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
             * <p>The billing method of the instance. Valid values:</p>
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
             * <p>The spot policy of instances. Valid values:</p>
             * <ul>
             * <li>NoSpot: The instances are created as pay-as-you-go instances.</li>
             * <li>SpotWithPriceLimit: The instances are created as spot instances for which you can specify the maximum hourly price.</li>
             * <li>SpotAsPriceGo: The instances are spot instances for which the market price at the time of purchase is automatically used as the bid price.</li>
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
             * <p>The ID of the zone.</p>
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
             * <p>The resource allocation information in the elastic planning result.</p>
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
