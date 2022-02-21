// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBClusterForecastResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterForecastResponseBody</p>
 */
public class DescribeDBClusterForecastResponseBody extends TeaModel {
    @NameInMap("Performances")
    private java.util.List < Performances> performances;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDBClusterForecastResponseBody(Builder builder) {
        this.performances = builder.performances;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterForecastResponseBody create() {
        return builder().build();
    }

    /**
     * @return performances
     */
    public java.util.List < Performances> getPerformances() {
        return this.performances;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Performances> performances; 
        private String requestId; 

        /**
         * Performances.
         */
        public Builder performances(java.util.List < Performances> performances) {
            this.performances = performances;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBClusterForecastResponseBody build() {
            return new DescribeDBClusterForecastResponseBody(this);
        } 

    } 

    public static class Series extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Values")
        private String values;

        private Series(Builder builder) {
            this.name = builder.name;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Series create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return values
         */
        public String getValues() {
            return this.values;
        }

        public static final class Builder {
            private String name; 
            private String values; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Values.
             */
            public Builder values(String values) {
                this.values = values;
                return this;
            }

            public Series build() {
                return new Series(this);
            } 

        } 

    }
    public static class Performances extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Series")
        private java.util.List < Series> series;

        @NameInMap("Unit")
        private String unit;

        private Performances(Builder builder) {
            this.key = builder.key;
            this.series = builder.series;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Performances create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return series
         */
        public java.util.List < Series> getSeries() {
            return this.series;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private String key; 
            private java.util.List < Series> series; 
            private String unit; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Series.
             */
            public Builder series(java.util.List < Series> series) {
                this.series = series;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public Performances build() {
                return new Performances(this);
            } 

        } 

    }
}
