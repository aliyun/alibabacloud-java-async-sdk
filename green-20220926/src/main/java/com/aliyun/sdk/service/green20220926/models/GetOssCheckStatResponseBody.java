// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetOssCheckStatResponseBody} extends {@link TeaModel}
 *
 * <p>GetOssCheckStatResponseBody</p>
 */
public class GetOssCheckStatResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BarChart")
    private BarChart barChart;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetOssCheckStatResponseBody(Builder builder) {
        this.barChart = builder.barChart;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOssCheckStatResponseBody create() {
        return builder().build();
    }

    /**
     * @return barChart
     */
    public BarChart getBarChart() {
        return this.barChart;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private BarChart barChart; 
        private String requestId; 

        /**
         * BarChart.
         */
        public Builder barChart(BarChart barChart) {
            this.barChart = barChart;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetOssCheckStatResponseBody build() {
            return new GetOssCheckStatResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetOssCheckStatResponseBody} extends {@link TeaModel}
     *
     * <p>GetOssCheckStatResponseBody</p>
     */
    public static class Y extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List < Long > data;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Y(Builder builder) {
            this.data = builder.data;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Y create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List < Long > getData() {
            return this.data;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List < Long > data; 
            private String name; 

            /**
             * Data.
             */
            public Builder data(java.util.List < Long > data) {
                this.data = data;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Y build() {
                return new Y(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOssCheckStatResponseBody} extends {@link TeaModel}
     *
     * <p>GetOssCheckStatResponseBody</p>
     */
    public static class BarChart extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("X")
        private java.util.List < String > x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private java.util.List < Y> y;

        private BarChart(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BarChart create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public java.util.List < String > getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public java.util.List < Y> getY() {
            return this.y;
        }

        public static final class Builder {
            private java.util.List < String > x; 
            private java.util.List < Y> y; 

            /**
             * X.
             */
            public Builder x(java.util.List < String > x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(java.util.List < Y> y) {
                this.y = y;
                return this;
            }

            public BarChart build() {
                return new BarChart(this);
            } 

        } 

    }
}
