// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceSolutionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceSolutionsResponseBody</p>
 */
public class DescribeResourceSolutionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourcePlanningResponses")
    private ResourcePlanningResponses resourcePlanningResponses;

    private DescribeResourceSolutionsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourcePlanningResponses = builder.resourcePlanningResponses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceSolutionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourcePlanningResponses
     */
    public ResourcePlanningResponses getResourcePlanningResponses() {
        return this.resourcePlanningResponses;
    }

    public static final class Builder {
        private String requestId; 
        private ResourcePlanningResponses resourcePlanningResponses; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourcePlanningResponses.
         */
        public Builder resourcePlanningResponses(ResourcePlanningResponses resourcePlanningResponses) {
            this.resourcePlanningResponses = resourcePlanningResponses;
            return this;
        }

        public DescribeResourceSolutionsResponseBody build() {
            return new DescribeResourceSolutionsResponseBody(this);
        } 

    } 

    public static class RecommendReasons extends TeaModel {
        @NameInMap("RecommendReason")
        private java.util.List < String > recommendReason;

        private RecommendReasons(Builder builder) {
            this.recommendReason = builder.recommendReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecommendReasons create() {
            return builder().build();
        }

        /**
         * @return recommendReason
         */
        public java.util.List < String > getRecommendReason() {
            return this.recommendReason;
        }

        public static final class Builder {
            private java.util.List < String > recommendReason; 

            /**
             * RecommendReason.
             */
            public Builder recommendReason(java.util.List < String > recommendReason) {
                this.recommendReason = recommendReason;
                return this;
            }

            public RecommendReasons build() {
                return new RecommendReasons(this);
            } 

        } 

    }
    public static class ResourceModel extends TeaModel {
        @NameInMap("Amount")
        private Integer amount;

        @NameInMap("DeliveryTime")
        private String deliveryTime;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ZoneId")
        private String zoneId;

        private ResourceModel(Builder builder) {
            this.amount = builder.amount;
            this.deliveryTime = builder.deliveryTime;
            this.instanceType = builder.instanceType;
            this.regionId = builder.regionId;
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
         * @return deliveryTime
         */
        public String getDeliveryTime() {
            return this.deliveryTime;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Integer amount; 
            private String deliveryTime; 
            private String instanceType; 
            private String regionId; 
            private String zoneId; 

            /**
             * Amount.
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * DeliveryTime.
             */
            public Builder deliveryTime(String deliveryTime) {
                this.deliveryTime = deliveryTime;
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
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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
        @NameInMap("RecommendReasons")
        private RecommendReasons recommendReasons;

        @NameInMap("ResourceModels")
        private ResourceModels resourceModels;

        @NameInMap("SatisfiedAmount")
        private Integer satisfiedAmount;

        private ResourcePlanningResponse(Builder builder) {
            this.recommendReasons = builder.recommendReasons;
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
         * @return recommendReasons
         */
        public RecommendReasons getRecommendReasons() {
            return this.recommendReasons;
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
            private RecommendReasons recommendReasons; 
            private ResourceModels resourceModels; 
            private Integer satisfiedAmount; 

            /**
             * RecommendReasons.
             */
            public Builder recommendReasons(RecommendReasons recommendReasons) {
                this.recommendReasons = recommendReasons;
                return this;
            }

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
    public static class ResourcePlanningResponses extends TeaModel {
        @NameInMap("ResourcePlanningResponse")
        private java.util.List < ResourcePlanningResponse> resourcePlanningResponse;

        private ResourcePlanningResponses(Builder builder) {
            this.resourcePlanningResponse = builder.resourcePlanningResponse;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourcePlanningResponses create() {
            return builder().build();
        }

        /**
         * @return resourcePlanningResponse
         */
        public java.util.List < ResourcePlanningResponse> getResourcePlanningResponse() {
            return this.resourcePlanningResponse;
        }

        public static final class Builder {
            private java.util.List < ResourcePlanningResponse> resourcePlanningResponse; 

            /**
             * ResourcePlanningResponse.
             */
            public Builder resourcePlanningResponse(java.util.List < ResourcePlanningResponse> resourcePlanningResponse) {
                this.resourcePlanningResponse = resourcePlanningResponse;
                return this;
            }

            public ResourcePlanningResponses build() {
                return new ResourcePlanningResponses(this);
            } 

        } 

    }
}
