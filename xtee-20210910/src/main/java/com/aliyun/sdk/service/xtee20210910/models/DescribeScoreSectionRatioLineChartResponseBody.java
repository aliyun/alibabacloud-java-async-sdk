// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScoreSectionRatioLineChartResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScoreSectionRatioLineChartResponseBody</p>
 */
public class DescribeScoreSectionRatioLineChartResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private ResultObject resultObject;

    private DescribeScoreSectionRatioLineChartResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScoreSectionRatioLineChartResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private ResultObject resultObject; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resultObject.
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeScoreSectionRatioLineChartResponseBody build() {
            return new DescribeScoreSectionRatioLineChartResponseBody(this);
        } 

    } 

    public static class Series extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        private java.util.List < String > data;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Series(Builder builder) {
            this.data = builder.data;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Series create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List < String > getData() {
            return this.data;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List < String > data; 
            private String name; 

            /**
             * data.
             */
            public Builder data(java.util.List < String > data) {
                this.data = data;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Series build() {
                return new Series(this);
            } 

        } 

    }
    public static class Xaxis extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        private java.util.List < String > data;

        private Xaxis(Builder builder) {
            this.data = builder.data;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Xaxis create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List < String > getData() {
            return this.data;
        }

        public static final class Builder {
            private java.util.List < String > data; 

            /**
             * data.
             */
            public Builder data(java.util.List < String > data) {
                this.data = data;
                return this;
            }

            public Xaxis build() {
                return new Xaxis(this);
            } 

        } 

    }
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("series")
        private java.util.List < Series> series;

        @com.aliyun.core.annotation.NameInMap("xaxis")
        private Xaxis xaxis;

        private ResultObject(Builder builder) {
            this.series = builder.series;
            this.xaxis = builder.xaxis;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return series
         */
        public java.util.List < Series> getSeries() {
            return this.series;
        }

        /**
         * @return xaxis
         */
        public Xaxis getXaxis() {
            return this.xaxis;
        }

        public static final class Builder {
            private java.util.List < Series> series; 
            private Xaxis xaxis; 

            /**
             * series.
             */
            public Builder series(java.util.List < Series> series) {
                this.series = series;
                return this;
            }

            /**
             * xaxis.
             */
            public Builder xaxis(Xaxis xaxis) {
                this.xaxis = xaxis;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
