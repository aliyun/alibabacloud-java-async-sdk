// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceRecommendFiltersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceRecommendFiltersResponseBody</p>
 */
public class DescribeResourceRecommendFiltersResponseBody extends TeaModel {
    @NameInMap("RecommendFilters")
    private RecommendFilters recommendFilters;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeResourceRecommendFiltersResponseBody(Builder builder) {
        this.recommendFilters = builder.recommendFilters;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceRecommendFiltersResponseBody create() {
        return builder().build();
    }

    /**
     * @return recommendFilters
     */
    public RecommendFilters getRecommendFilters() {
        return this.recommendFilters;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private RecommendFilters recommendFilters; 
        private String requestId; 

        /**
         * RecommendFilters.
         */
        public Builder recommendFilters(RecommendFilters recommendFilters) {
            this.recommendFilters = recommendFilters;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeResourceRecommendFiltersResponseBody build() {
            return new DescribeResourceRecommendFiltersResponseBody(this);
        } 

    } 

    public static class RecommendFilter extends TeaModel {
        @NameInMap("AttributeName")
        private String attributeName;

        @NameInMap("AttributeValue")
        private String attributeValue;

        @NameInMap("Product")
        private String product;

        @NameInMap("ResourceType")
        private String resourceType;

        private RecommendFilter(Builder builder) {
            this.attributeName = builder.attributeName;
            this.attributeValue = builder.attributeValue;
            this.product = builder.product;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecommendFilter create() {
            return builder().build();
        }

        /**
         * @return attributeName
         */
        public String getAttributeName() {
            return this.attributeName;
        }

        /**
         * @return attributeValue
         */
        public String getAttributeValue() {
            return this.attributeValue;
        }

        /**
         * @return product
         */
        public String getProduct() {
            return this.product;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String attributeName; 
            private String attributeValue; 
            private String product; 
            private String resourceType; 

            /**
             * AttributeName.
             */
            public Builder attributeName(String attributeName) {
                this.attributeName = attributeName;
                return this;
            }

            /**
             * AttributeValue.
             */
            public Builder attributeValue(String attributeValue) {
                this.attributeValue = attributeValue;
                return this;
            }

            /**
             * Product.
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public RecommendFilter build() {
                return new RecommendFilter(this);
            } 

        } 

    }
    public static class RecommendFilters extends TeaModel {
        @NameInMap("RecommendFilter")
        private java.util.List < RecommendFilter> recommendFilter;

        private RecommendFilters(Builder builder) {
            this.recommendFilter = builder.recommendFilter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecommendFilters create() {
            return builder().build();
        }

        /**
         * @return recommendFilter
         */
        public java.util.List < RecommendFilter> getRecommendFilter() {
            return this.recommendFilter;
        }

        public static final class Builder {
            private java.util.List < RecommendFilter> recommendFilter; 

            /**
             * RecommendFilter.
             */
            public Builder recommendFilter(java.util.List < RecommendFilter> recommendFilter) {
                this.recommendFilter = recommendFilter;
                return this;
            }

            public RecommendFilters build() {
                return new RecommendFilters(this);
            } 

        } 

    }
}
