// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceAggregationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceAggregationsResponseBody</p>
 */
public class DescribeResourceAggregationsResponseBody extends TeaModel {
    @NameInMap("Aggregations")
    private Aggregations aggregations;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeResourceAggregationsResponseBody(Builder builder) {
        this.aggregations = builder.aggregations;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceAggregationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return aggregations
     */
    public Aggregations getAggregations() {
        return this.aggregations;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Aggregations aggregations; 
        private String requestId; 

        /**
         * Aggregations.
         */
        public Builder aggregations(Aggregations aggregations) {
            this.aggregations = aggregations;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeResourceAggregationsResponseBody build() {
            return new DescribeResourceAggregationsResponseBody(this);
        } 

    } 

    public static class Aggregation extends TeaModel {
        @NameInMap("Count")
        private String count;

        @NameInMap("Keys")
        private String keys;

        private Aggregation(Builder builder) {
            this.count = builder.count;
            this.keys = builder.keys;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Aggregation create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public String getCount() {
            return this.count;
        }

        /**
         * @return keys
         */
        public String getKeys() {
            return this.keys;
        }

        public static final class Builder {
            private String count; 
            private String keys; 

            /**
             * Count.
             */
            public Builder count(String count) {
                this.count = count;
                return this;
            }

            /**
             * Keys.
             */
            public Builder keys(String keys) {
                this.keys = keys;
                return this;
            }

            public Aggregation build() {
                return new Aggregation(this);
            } 

        } 

    }
    public static class Aggregations extends TeaModel {
        @NameInMap("Aggregation")
        private java.util.List < Aggregation> aggregation;

        private Aggregations(Builder builder) {
            this.aggregation = builder.aggregation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Aggregations create() {
            return builder().build();
        }

        /**
         * @return aggregation
         */
        public java.util.List < Aggregation> getAggregation() {
            return this.aggregation;
        }

        public static final class Builder {
            private java.util.List < Aggregation> aggregation; 

            /**
             * Aggregation.
             */
            public Builder aggregation(java.util.List < Aggregation> aggregation) {
                this.aggregation = aggregation;
                return this;
            }

            public Aggregations build() {
                return new Aggregations(this);
            } 

        } 

    }
}
