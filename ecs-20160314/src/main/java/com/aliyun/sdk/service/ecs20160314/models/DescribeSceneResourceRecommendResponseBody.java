// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSceneResourceRecommendResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSceneResourceRecommendResponseBody</p>
 */
public class DescribeSceneResourceRecommendResponseBody extends TeaModel {
    @NameInMap("RecommendProducts")
    private RecommendProducts recommendProducts;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeSceneResourceRecommendResponseBody(Builder builder) {
        this.recommendProducts = builder.recommendProducts;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSceneResourceRecommendResponseBody create() {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSceneResourceRecommendResponseBody build() {
            return new DescribeSceneResourceRecommendResponseBody(this);
        } 

    } 

    public static class InstanceType extends TeaModel {
        @NameInMap("InstanceTypeFamily")
        private String instanceTypeFamily;

        @NameInMap("InstanceTypeName")
        private String instanceTypeName;

        @NameInMap("Priority")
        private Integer priority;

        private InstanceType(Builder builder) {
            this.instanceTypeFamily = builder.instanceTypeFamily;
            this.instanceTypeName = builder.instanceTypeName;
            this.priority = builder.priority;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceType create() {
            return builder().build();
        }

        /**
         * @return instanceTypeFamily
         */
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        /**
         * @return instanceTypeName
         */
        public String getInstanceTypeName() {
            return this.instanceTypeName;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        public static final class Builder {
            private String instanceTypeFamily; 
            private String instanceTypeName; 
            private Integer priority; 

            /**
             * InstanceTypeFamily.
             */
            public Builder instanceTypeFamily(String instanceTypeFamily) {
                this.instanceTypeFamily = instanceTypeFamily;
                return this;
            }

            /**
             * InstanceTypeName.
             */
            public Builder instanceTypeName(String instanceTypeName) {
                this.instanceTypeName = instanceTypeName;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            public InstanceType build() {
                return new InstanceType(this);
            } 

        } 

    }
    public static class InstanceTypes extends TeaModel {
        @NameInMap("InstanceType")
        private java.util.List < InstanceType> instanceType;

        private InstanceTypes(Builder builder) {
            this.instanceType = builder.instanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTypes create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public java.util.List < InstanceType> getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private java.util.List < InstanceType> instanceType; 

            /**
             * InstanceType.
             */
            public Builder instanceType(java.util.List < InstanceType> instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public InstanceTypes build() {
                return new InstanceTypes(this);
            } 

        } 

    }
    public static class RecommendInstanceSpec extends TeaModel {
        @NameInMap("Cores")
        private Integer cores;

        @NameInMap("InstanceTypes")
        private InstanceTypes instanceTypes;

        @NameInMap("Memory")
        private Float memory;

        private RecommendInstanceSpec(Builder builder) {
            this.cores = builder.cores;
            this.instanceTypes = builder.instanceTypes;
            this.memory = builder.memory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecommendInstanceSpec create() {
            return builder().build();
        }

        /**
         * @return cores
         */
        public Integer getCores() {
            return this.cores;
        }

        /**
         * @return instanceTypes
         */
        public InstanceTypes getInstanceTypes() {
            return this.instanceTypes;
        }

        /**
         * @return memory
         */
        public Float getMemory() {
            return this.memory;
        }

        public static final class Builder {
            private Integer cores; 
            private InstanceTypes instanceTypes; 
            private Float memory; 

            /**
             * Cores.
             */
            public Builder cores(Integer cores) {
                this.cores = cores;
                return this;
            }

            /**
             * InstanceTypes.
             */
            public Builder instanceTypes(InstanceTypes instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            public RecommendInstanceSpec build() {
                return new RecommendInstanceSpec(this);
            } 

        } 

    }
    public static class RecommendInstanceSpecs extends TeaModel {
        @NameInMap("RecommendInstanceSpec")
        private java.util.List < RecommendInstanceSpec> recommendInstanceSpec;

        private RecommendInstanceSpecs(Builder builder) {
            this.recommendInstanceSpec = builder.recommendInstanceSpec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecommendInstanceSpecs create() {
            return builder().build();
        }

        /**
         * @return recommendInstanceSpec
         */
        public java.util.List < RecommendInstanceSpec> getRecommendInstanceSpec() {
            return this.recommendInstanceSpec;
        }

        public static final class Builder {
            private java.util.List < RecommendInstanceSpec> recommendInstanceSpec; 

            /**
             * RecommendInstanceSpec.
             */
            public Builder recommendInstanceSpec(java.util.List < RecommendInstanceSpec> recommendInstanceSpec) {
                this.recommendInstanceSpec = recommendInstanceSpec;
                return this;
            }

            public RecommendInstanceSpecs build() {
                return new RecommendInstanceSpecs(this);
            } 

        } 

    }
    public static class RecommendProduct extends TeaModel {
        @NameInMap("RecommendInstanceSpecs")
        private RecommendInstanceSpecs recommendInstanceSpecs;

        @NameInMap("RecommendReason")
        private String recommendReason;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ZoneId")
        private String zoneId;

        private RecommendProduct(Builder builder) {
            this.recommendInstanceSpecs = builder.recommendInstanceSpecs;
            this.recommendReason = builder.recommendReason;
            this.regionId = builder.regionId;
            this.resourceId = builder.resourceId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecommendProduct create() {
            return builder().build();
        }

        /**
         * @return recommendInstanceSpecs
         */
        public RecommendInstanceSpecs getRecommendInstanceSpecs() {
            return this.recommendInstanceSpecs;
        }

        /**
         * @return recommendReason
         */
        public String getRecommendReason() {
            return this.recommendReason;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private RecommendInstanceSpecs recommendInstanceSpecs; 
            private String recommendReason; 
            private String regionId; 
            private String resourceId; 
            private String zoneId; 

            /**
             * RecommendInstanceSpecs.
             */
            public Builder recommendInstanceSpecs(RecommendInstanceSpecs recommendInstanceSpecs) {
                this.recommendInstanceSpecs = recommendInstanceSpecs;
                return this;
            }

            /**
             * RecommendReason.
             */
            public Builder recommendReason(String recommendReason) {
                this.recommendReason = recommendReason;
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
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
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
