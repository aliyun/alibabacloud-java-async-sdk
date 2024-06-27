// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScoreSectionPieChartResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScoreSectionPieChartResponseBody</p>
 */
public class DescribeScoreSectionPieChartResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private ResultObject resultObject;

    private DescribeScoreSectionPieChartResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScoreSectionPieChartResponseBody create() {
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
         * requestId.
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

        public DescribeScoreSectionPieChartResponseBody build() {
            return new DescribeScoreSectionPieChartResponseBody(this);
        } 

    } 

    public static class Grid extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("show")
        private Boolean show;

        private Grid(Builder builder) {
            this.show = builder.show;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Grid create() {
            return builder().build();
        }

        /**
         * @return show
         */
        public Boolean getShow() {
            return this.show;
        }

        public static final class Builder {
            private Boolean show; 

            /**
             * show.
             */
            public Builder show(Boolean show) {
                this.show = show;
                return this;
            }

            public Grid build() {
                return new Grid(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Data(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    public static class Series extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        private java.util.List < Data> data;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("roseType")
        private Boolean roseType;

        private Series(Builder builder) {
            this.data = builder.data;
            this.name = builder.name;
            this.roseType = builder.roseType;
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
        public java.util.List < Data> getData() {
            return this.data;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return roseType
         */
        public Boolean getRoseType() {
            return this.roseType;
        }

        public static final class Builder {
            private java.util.List < Data> data; 
            private String name; 
            private Boolean roseType; 

            /**
             * data.
             */
            public Builder data(java.util.List < Data> data) {
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

            /**
             * roseType.
             */
            public Builder roseType(Boolean roseType) {
                this.roseType = roseType;
                return this;
            }

            public Series build() {
                return new Series(this);
            } 

        } 

    }
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("animation")
        private Boolean animation;

        @com.aliyun.core.annotation.NameInMap("grid")
        private Grid grid;

        @com.aliyun.core.annotation.NameInMap("series")
        private java.util.List < Series> series;

        private ResultObject(Builder builder) {
            this.animation = builder.animation;
            this.grid = builder.grid;
            this.series = builder.series;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return animation
         */
        public Boolean getAnimation() {
            return this.animation;
        }

        /**
         * @return grid
         */
        public Grid getGrid() {
            return this.grid;
        }

        /**
         * @return series
         */
        public java.util.List < Series> getSeries() {
            return this.series;
        }

        public static final class Builder {
            private Boolean animation; 
            private Grid grid; 
            private java.util.List < Series> series; 

            /**
             * animation.
             */
            public Builder animation(Boolean animation) {
                this.animation = animation;
                return this;
            }

            /**
             * grid.
             */
            public Builder grid(Grid grid) {
                this.grid = grid;
                return this;
            }

            /**
             * series.
             */
            public Builder series(java.util.List < Series> series) {
                this.series = series;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
