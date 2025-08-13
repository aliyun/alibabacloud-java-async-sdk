// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeTagsNumLineChartResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTagsNumLineChartResponseBody</p>
 */
public class DescribeTagsNumLineChartResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private ResultObject resultObject;

    private DescribeTagsNumLineChartResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTagsNumLineChartResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeTagsNumLineChartResponseBody model) {
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AE7E6105-7DEB-5125-9B24-DCBC139F6CD2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returned object</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeTagsNumLineChartResponseBody build() {
            return new DescribeTagsNumLineChartResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTagsNumLineChartResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTagsNumLineChartResponseBody</p>
     */
    public static class Series extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        private java.util.List<String> data;

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
        public java.util.List<String> getData() {
            return this.data;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List<String> data; 
            private String name; 

            private Builder() {
            } 

            private Builder(Series model) {
                this.data = model.data;
                this.name = model.name;
            } 

            /**
             * <p>Chart data list</p>
             */
            public Builder data(java.util.List<String> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>Series name.</p>
             * 
             * <strong>example:</strong>
             * <p>rn101</p>
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
    /**
     * 
     * {@link DescribeTagsNumLineChartResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTagsNumLineChartResponseBody</p>
     */
    public static class Xaxis extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        private java.util.List<String> data;

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
        public java.util.List<String> getData() {
            return this.data;
        }

        public static final class Builder {
            private java.util.List<String> data; 

            private Builder() {
            } 

            private Builder(Xaxis model) {
                this.data = model.data;
            } 

            /**
             * <p>Chart data list</p>
             */
            public Builder data(java.util.List<String> data) {
                this.data = data;
                return this;
            }

            public Xaxis build() {
                return new Xaxis(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeTagsNumLineChartResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTagsNumLineChartResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("series")
        private java.util.List<Series> series;

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
        public java.util.List<Series> getSeries() {
            return this.series;
        }

        /**
         * @return xaxis
         */
        public Xaxis getXaxis() {
            return this.xaxis;
        }

        public static final class Builder {
            private java.util.List<Series> series; 
            private Xaxis xaxis; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.series = model.series;
                this.xaxis = model.xaxis;
            } 

            /**
             * <p>Data list</p>
             */
            public Builder series(java.util.List<Series> series) {
                this.series = series;
                return this;
            }

            /**
             * <p>xaxis node.</p>
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
