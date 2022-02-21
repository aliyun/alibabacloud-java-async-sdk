// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceAllocationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceAllocationResponseBody</p>
 */
public class DescribeResourceAllocationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourcePlanningResponse")
    private ResourcePlanningResponse resourcePlanningResponse;

    private DescribeResourceAllocationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourcePlanningResponse = builder.resourcePlanningResponse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceAllocationResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourcePlanningResponse
     */
    public ResourcePlanningResponse getResourcePlanningResponse() {
        return this.resourcePlanningResponse;
    }

    public static final class Builder {
        private String requestId; 
        private ResourcePlanningResponse resourcePlanningResponse; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourcePlanningResponse.
         */
        public Builder resourcePlanningResponse(ResourcePlanningResponse resourcePlanningResponse) {
            this.resourcePlanningResponse = resourcePlanningResponse;
            return this;
        }

        public DescribeResourceAllocationResponseBody build() {
            return new DescribeResourceAllocationResponseBody(this);
        } 

    } 

    public static class ResourceModel extends TeaModel {
        @NameInMap("Amount")
        private Integer amount;

        @NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("IoOptimized")
        private String ioOptimized;

        @NameInMap("NetworkType")
        private String networkType;

        @NameInMap("Price")
        private Float price;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SpotStrategy")
        private String spotStrategy;

        @NameInMap("ZoneId")
        private String zoneId;

        private ResourceModel(Builder builder) {
            this.amount = builder.amount;
            this.instanceChargeType = builder.instanceChargeType;
            this.instanceType = builder.instanceType;
            this.ioOptimized = builder.ioOptimized;
            this.networkType = builder.networkType;
            this.price = builder.price;
            this.regionId = builder.regionId;
            this.spotStrategy = builder.spotStrategy;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceModel create() {
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
         * @return ioOptimized
         */
        public String getIoOptimized() {
            return this.ioOptimized;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return price
         */
        public Float getPrice() {
            return this.price;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
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
            private String ioOptimized; 
            private String networkType; 
            private Float price; 
            private String regionId; 
            private String spotStrategy; 
            private String zoneId; 

            /**
             * Amount.
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * InstanceChargeType.
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * IoOptimized.
             */
            public Builder ioOptimized(String ioOptimized) {
                this.ioOptimized = ioOptimized;
                return this;
            }

            /**
             * NetworkType.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * Price.
             */
            public Builder price(Float price) {
                this.price = price;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * SpotStrategy.
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ResourceModel build() {
                return new ResourceModel(this);
            } 

        } 

    }
    public static class ResourceModels extends TeaModel {
        @NameInMap("ResourceModel")
        private java.util.List < ResourceModel> resourceModel;

        private ResourceModels(Builder builder) {
            this.resourceModel = builder.resourceModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceModels create() {
            return builder().build();
        }

        /**
         * @return resourceModel
         */
        public java.util.List < ResourceModel> getResourceModel() {
            return this.resourceModel;
        }

        public static final class Builder {
            private java.util.List < ResourceModel> resourceModel; 

            /**
             * ResourceModel.
             */
            public Builder resourceModel(java.util.List < ResourceModel> resourceModel) {
                this.resourceModel = resourceModel;
                return this;
            }

            public ResourceModels build() {
                return new ResourceModels(this);
            } 

        } 

    }
    public static class ResourcePlanningResponse extends TeaModel {
        @NameInMap("ResourceModels")
        private ResourceModels resourceModels;

        @NameInMap("SatisfiedAmount")
        private Integer satisfiedAmount;

        private ResourcePlanningResponse(Builder builder) {
            this.resourceModels = builder.resourceModels;
            this.satisfiedAmount = builder.satisfiedAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourcePlanningResponse create() {
            return builder().build();
        }

        /**
         * @return resourceModels
         */
        public ResourceModels getResourceModels() {
            return this.resourceModels;
        }

        /**
         * @return satisfiedAmount
         */
        public Integer getSatisfiedAmount() {
            return this.satisfiedAmount;
        }

        public static final class Builder {
            private ResourceModels resourceModels; 
            private Integer satisfiedAmount; 

            /**
             * ResourceModels.
             */
            public Builder resourceModels(ResourceModels resourceModels) {
                this.resourceModels = resourceModels;
                return this;
            }

            /**
             * SatisfiedAmount.
             */
            public Builder satisfiedAmount(Integer satisfiedAmount) {
                this.satisfiedAmount = satisfiedAmount;
                return this;
            }

            public ResourcePlanningResponse build() {
                return new ResourcePlanningResponse(this);
            } 

        } 

    }
}
