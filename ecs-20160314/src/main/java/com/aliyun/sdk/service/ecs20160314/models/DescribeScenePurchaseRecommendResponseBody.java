// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScenePurchaseRecommendResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScenePurchaseRecommendResponseBody</p>
 */
public class DescribeScenePurchaseRecommendResponseBody extends TeaModel {
    @NameInMap("RecommendProducts")
    private RecommendProducts recommendProducts;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeScenePurchaseRecommendResponseBody(Builder builder) {
        this.recommendProducts = builder.recommendProducts;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScenePurchaseRecommendResponseBody create() {
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

        public DescribeScenePurchaseRecommendResponseBody build() {
            return new DescribeScenePurchaseRecommendResponseBody(this);
        } 

    } 

    public static class RecommendSpSpec extends TeaModel {
        @NameInMap("Duration")
        private Integer duration;

        @NameInMap("EffectiveDate")
        private String effectiveDate;

        @NameInMap("PayMode")
        private String payMode;

        @NameInMap("PricingCycle")
        private String pricingCycle;

        @NameInMap("RecommendReason")
        private String recommendReason;

        @NameInMap("Type")
        private String type;

        private RecommendSpSpec(Builder builder) {
            this.duration = builder.duration;
            this.effectiveDate = builder.effectiveDate;
            this.payMode = builder.payMode;
            this.pricingCycle = builder.pricingCycle;
            this.recommendReason = builder.recommendReason;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecommendSpSpec create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return effectiveDate
         */
        public String getEffectiveDate() {
            return this.effectiveDate;
        }

        /**
         * @return payMode
         */
        public String getPayMode() {
            return this.payMode;
        }

        /**
         * @return pricingCycle
         */
        public String getPricingCycle() {
            return this.pricingCycle;
        }

        /**
         * @return recommendReason
         */
        public String getRecommendReason() {
            return this.recommendReason;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer duration; 
            private String effectiveDate; 
            private String payMode; 
            private String pricingCycle; 
            private String recommendReason; 
            private String type; 

            /**
             * Duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * EffectiveDate.
             */
            public Builder effectiveDate(String effectiveDate) {
                this.effectiveDate = effectiveDate;
                return this;
            }

            /**
             * PayMode.
             */
            public Builder payMode(String payMode) {
                this.payMode = payMode;
                return this;
            }

            /**
             * PricingCycle.
             */
            public Builder pricingCycle(String pricingCycle) {
                this.pricingCycle = pricingCycle;
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RecommendSpSpec build() {
                return new RecommendSpSpec(this);
            } 

        } 

    }
    public static class RecommendSpSpecs extends TeaModel {
        @NameInMap("RecommendSpSpec")
        private java.util.List < RecommendSpSpec> recommendSpSpec;

        private RecommendSpSpecs(Builder builder) {
            this.recommendSpSpec = builder.recommendSpSpec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecommendSpSpecs create() {
            return builder().build();
        }

        /**
         * @return recommendSpSpec
         */
        public java.util.List < RecommendSpSpec> getRecommendSpSpec() {
            return this.recommendSpSpec;
        }

        public static final class Builder {
            private java.util.List < RecommendSpSpec> recommendSpSpec; 

            /**
             * RecommendSpSpec.
             */
            public Builder recommendSpSpec(java.util.List < RecommendSpSpec> recommendSpSpec) {
                this.recommendSpSpec = recommendSpSpec;
                return this;
            }

            public RecommendSpSpecs build() {
                return new RecommendSpSpecs(this);
            } 

        } 

    }
    public static class RecommendProduct extends TeaModel {
        @NameInMap("RecommendSpSpecs")
        private RecommendSpSpecs recommendSpSpecs;

        @NameInMap("RegionId")
        private String regionId;

        private RecommendProduct(Builder builder) {
            this.recommendSpSpecs = builder.recommendSpSpecs;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecommendProduct create() {
            return builder().build();
        }

        /**
         * @return recommendSpSpecs
         */
        public RecommendSpSpecs getRecommendSpSpecs() {
            return this.recommendSpSpecs;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private RecommendSpSpecs recommendSpSpecs; 
            private String regionId; 

            /**
             * RecommendSpSpecs.
             */
            public Builder recommendSpSpecs(RecommendSpSpecs recommendSpSpecs) {
                this.recommendSpSpecs = recommendSpSpecs;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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
