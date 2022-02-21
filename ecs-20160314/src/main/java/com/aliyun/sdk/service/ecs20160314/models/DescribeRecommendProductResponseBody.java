// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRecommendProductResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRecommendProductResponseBody</p>
 */
public class DescribeRecommendProductResponseBody extends TeaModel {
    @NameInMap("RecommendProducts")
    private RecommendProducts recommendProducts;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeRecommendProductResponseBody(Builder builder) {
        this.recommendProducts = builder.recommendProducts;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRecommendProductResponseBody create() {
        return builder().build();
    }

    /**
     * @return recommendProducts
     */
    public RecommendProducts getRecommendProducts() {
        return this.recommendProducts;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private RecommendProducts recommendProducts; 
        private String requestId; 

        /**
         * RecommendProducts.
         */
        public Builder recommendProducts(RecommendProducts recommendProducts) {
            this.recommendProducts = recommendProducts;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRecommendProductResponseBody build() {
            return new DescribeRecommendProductResponseBody(this);
        } 

    } 

    public static class InstanceType extends TeaModel {
        @NameInMap("Cores")
        private Integer cores;

        @NameInMap("Generation")
        private String generation;

        @NameInMap("InstanceFamilyLevel")
        private String instanceFamilyLevel;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("InstanceTypeFamily")
        private String instanceTypeFamily;

        @NameInMap("Memory")
        private Integer memory;

        @NameInMap("SupportIoOptimized")
        private String supportIoOptimized;

        private InstanceType(Builder builder) {
            this.cores = builder.cores;
            this.generation = builder.generation;
            this.instanceFamilyLevel = builder.instanceFamilyLevel;
            this.instanceType = builder.instanceType;
            this.instanceTypeFamily = builder.instanceTypeFamily;
            this.memory = builder.memory;
            this.supportIoOptimized = builder.supportIoOptimized;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceType create() {
            return builder().build();
        }

        /**
         * @return cores
         */
        public Integer getCores() {
            return this.cores;
        }

        /**
         * @return generation
         */
        public String getGeneration() {
            return this.generation;
        }

        /**
         * @return instanceFamilyLevel
         */
        public String getInstanceFamilyLevel() {
            return this.instanceFamilyLevel;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return instanceTypeFamily
         */
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        /**
         * @return memory
         */
        public Integer getMemory() {
            return this.memory;
        }

        /**
         * @return supportIoOptimized
         */
        public String getSupportIoOptimized() {
            return this.supportIoOptimized;
        }

        public static final class Builder {
            private Integer cores; 
            private String generation; 
            private String instanceFamilyLevel; 
            private String instanceType; 
            private String instanceTypeFamily; 
            private Integer memory; 
            private String supportIoOptimized; 

            /**
             * Cores.
             */
            public Builder cores(Integer cores) {
                this.cores = cores;
                return this;
            }

            /**
             * Generation.
             */
            public Builder generation(String generation) {
                this.generation = generation;
                return this;
            }

            /**
             * InstanceFamilyLevel.
             */
            public Builder instanceFamilyLevel(String instanceFamilyLevel) {
                this.instanceFamilyLevel = instanceFamilyLevel;
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
             * InstanceTypeFamily.
             */
            public Builder instanceTypeFamily(String instanceTypeFamily) {
                this.instanceTypeFamily = instanceTypeFamily;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * SupportIoOptimized.
             */
            public Builder supportIoOptimized(String supportIoOptimized) {
                this.supportIoOptimized = supportIoOptimized;
                return this;
            }

            public InstanceType build() {
                return new InstanceType(this);
            } 

        } 

    }
    public static class RecommendInstanceType extends TeaModel {
        @NameInMap("CapacitySpecification")
        private String capacitySpecification;

        @NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @NameInMap("InstanceType")
        private InstanceType instanceType;

        @NameInMap("NetworkType")
        private String networkType;

        @NameInMap("Price")
        private Float price;

        @NameInMap("Priority")
        private Integer priority;

        @NameInMap("SpotStrategy")
        private String spotStrategy;

        private RecommendInstanceType(Builder builder) {
            this.capacitySpecification = builder.capacitySpecification;
            this.instanceChargeType = builder.instanceChargeType;
            this.instanceType = builder.instanceType;
            this.networkType = builder.networkType;
            this.price = builder.price;
            this.priority = builder.priority;
            this.spotStrategy = builder.spotStrategy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecommendInstanceType create() {
            return builder().build();
        }

        /**
         * @return capacitySpecification
         */
        public String getCapacitySpecification() {
            return this.capacitySpecification;
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
        public InstanceType getInstanceType() {
            return this.instanceType;
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
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return spotStrategy
         */
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public static final class Builder {
            private String capacitySpecification; 
            private String instanceChargeType; 
            private InstanceType instanceType; 
            private String networkType; 
            private Float price; 
            private Integer priority; 
            private String spotStrategy; 

            /**
             * CapacitySpecification.
             */
            public Builder capacitySpecification(String capacitySpecification) {
                this.capacitySpecification = capacitySpecification;
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
            public Builder instanceType(InstanceType instanceType) {
                this.instanceType = instanceType;
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
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * SpotStrategy.
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            public RecommendInstanceType build() {
                return new RecommendInstanceType(this);
            } 

        } 

    }
    public static class RecommendInstanceTypes extends TeaModel {
        @NameInMap("RecommendInstanceType")
        private java.util.List < RecommendInstanceType> recommendInstanceType;

        private RecommendInstanceTypes(Builder builder) {
            this.recommendInstanceType = builder.recommendInstanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecommendInstanceTypes create() {
            return builder().build();
        }

        /**
         * @return recommendInstanceType
         */
        public java.util.List < RecommendInstanceType> getRecommendInstanceType() {
            return this.recommendInstanceType;
        }

        public static final class Builder {
            private java.util.List < RecommendInstanceType> recommendInstanceType; 

            /**
             * RecommendInstanceType.
             */
            public Builder recommendInstanceType(java.util.List < RecommendInstanceType> recommendInstanceType) {
                this.recommendInstanceType = recommendInstanceType;
                return this;
            }

            public RecommendInstanceTypes build() {
                return new RecommendInstanceTypes(this);
            } 

        } 

    }
    public static class RecommendProduct extends TeaModel {
        @NameInMap("RecommendInstanceTypes")
        private RecommendInstanceTypes recommendInstanceTypes;

        @NameInMap("ZoneId")
        private String zoneId;

        private RecommendProduct(Builder builder) {
            this.recommendInstanceTypes = builder.recommendInstanceTypes;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecommendProduct create() {
            return builder().build();
        }

        /**
         * @return recommendInstanceTypes
         */
        public RecommendInstanceTypes getRecommendInstanceTypes() {
            return this.recommendInstanceTypes;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private RecommendInstanceTypes recommendInstanceTypes; 
            private String zoneId; 

            /**
             * RecommendInstanceTypes.
             */
            public Builder recommendInstanceTypes(RecommendInstanceTypes recommendInstanceTypes) {
                this.recommendInstanceTypes = recommendInstanceTypes;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public RecommendProduct build() {
                return new RecommendProduct(this);
            } 

        } 

    }
    public static class RecommendProducts extends TeaModel {
        @NameInMap("RecommendProduct")
        private java.util.List < RecommendProduct> recommendProduct;

        private RecommendProducts(Builder builder) {
            this.recommendProduct = builder.recommendProduct;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecommendProducts create() {
            return builder().build();
        }

        /**
         * @return recommendProduct
         */
        public java.util.List < RecommendProduct> getRecommendProduct() {
            return this.recommendProduct;
        }

        public static final class Builder {
            private java.util.List < RecommendProduct> recommendProduct; 

            /**
             * RecommendProduct.
             */
            public Builder recommendProduct(java.util.List < RecommendProduct> recommendProduct) {
                this.recommendProduct = recommendProduct;
                return this;
            }

            public RecommendProducts build() {
                return new RecommendProducts(this);
            } 

        } 

    }
}
