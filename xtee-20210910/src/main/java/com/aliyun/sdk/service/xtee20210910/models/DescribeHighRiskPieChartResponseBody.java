// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHighRiskPieChartResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHighRiskPieChartResponseBody</p>
 */
public class DescribeHighRiskPieChartResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private ResultObject resultObject;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private DescribeHighRiskPieChartResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHighRiskPieChartResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String httpStatusCode; 
        private String message; 
        private String requestId; 
        private ResultObject resultObject; 
        private Boolean success; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

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

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeHighRiskPieChartResponseBody build() {
            return new DescribeHighRiskPieChartResponseBody(this);
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
        private String roseType;

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
        public String getRoseType() {
            return this.roseType;
        }

        public static final class Builder {
            private java.util.List < Data> data; 
            private String name; 
            private String roseType; 

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
            public Builder roseType(String roseType) {
                this.roseType = roseType;
                return this;
            }

            public Series build() {
                return new Series(this);
            } 

        } 

    }
    public static class HighRiskIPCity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("animation")
        private Boolean animation;

        @com.aliyun.core.annotation.NameInMap("grid")
        private Grid grid;

        @com.aliyun.core.annotation.NameInMap("series")
        private java.util.List < Series> series;

        private HighRiskIPCity(Builder builder) {
            this.animation = builder.animation;
            this.grid = builder.grid;
            this.series = builder.series;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HighRiskIPCity create() {
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

            public HighRiskIPCity build() {
                return new HighRiskIPCity(this);
            } 

        } 

    }
    public static class HighRiskIPProvinceGrid extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("show")
        private Boolean show;

        private HighRiskIPProvinceGrid(Builder builder) {
            this.show = builder.show;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HighRiskIPProvinceGrid create() {
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

            public HighRiskIPProvinceGrid build() {
                return new HighRiskIPProvinceGrid(this);
            } 

        } 

    }
    public static class SeriesData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private SeriesData(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SeriesData create() {
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

            public SeriesData build() {
                return new SeriesData(this);
            } 

        } 

    }
    public static class HighRiskIPProvinceSeries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        private java.util.List < SeriesData> data;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("roseType")
        private String roseType;

        private HighRiskIPProvinceSeries(Builder builder) {
            this.data = builder.data;
            this.name = builder.name;
            this.roseType = builder.roseType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HighRiskIPProvinceSeries create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List < SeriesData> getData() {
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
        public String getRoseType() {
            return this.roseType;
        }

        public static final class Builder {
            private java.util.List < SeriesData> data; 
            private String name; 
            private String roseType; 

            /**
             * data.
             */
            public Builder data(java.util.List < SeriesData> data) {
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
            public Builder roseType(String roseType) {
                this.roseType = roseType;
                return this;
            }

            public HighRiskIPProvinceSeries build() {
                return new HighRiskIPProvinceSeries(this);
            } 

        } 

    }
    public static class HighRiskIPProvince extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("animation")
        private Boolean animation;

        @com.aliyun.core.annotation.NameInMap("grid")
        private HighRiskIPProvinceGrid grid;

        @com.aliyun.core.annotation.NameInMap("series")
        private java.util.List < HighRiskIPProvinceSeries> series;

        private HighRiskIPProvince(Builder builder) {
            this.animation = builder.animation;
            this.grid = builder.grid;
            this.series = builder.series;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HighRiskIPProvince create() {
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
        public HighRiskIPProvinceGrid getGrid() {
            return this.grid;
        }

        /**
         * @return series
         */
        public java.util.List < HighRiskIPProvinceSeries> getSeries() {
            return this.series;
        }

        public static final class Builder {
            private Boolean animation; 
            private HighRiskIPProvinceGrid grid; 
            private java.util.List < HighRiskIPProvinceSeries> series; 

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
            public Builder grid(HighRiskIPProvinceGrid grid) {
                this.grid = grid;
                return this;
            }

            /**
             * series.
             */
            public Builder series(java.util.List < HighRiskIPProvinceSeries> series) {
                this.series = series;
                return this;
            }

            public HighRiskIPProvince build() {
                return new HighRiskIPProvince(this);
            } 

        } 

    }
    public static class HighRiskMobileCityGrid extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("show")
        private Boolean show;

        private HighRiskMobileCityGrid(Builder builder) {
            this.show = builder.show;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HighRiskMobileCityGrid create() {
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

            public HighRiskMobileCityGrid build() {
                return new HighRiskMobileCityGrid(this);
            } 

        } 

    }
    public static class HighRiskMobileCitySeriesData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private HighRiskMobileCitySeriesData(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HighRiskMobileCitySeriesData create() {
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

            public HighRiskMobileCitySeriesData build() {
                return new HighRiskMobileCitySeriesData(this);
            } 

        } 

    }
    public static class HighRiskMobileCitySeries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        private java.util.List < HighRiskMobileCitySeriesData> data;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("roseType")
        private String roseType;

        private HighRiskMobileCitySeries(Builder builder) {
            this.data = builder.data;
            this.name = builder.name;
            this.roseType = builder.roseType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HighRiskMobileCitySeries create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List < HighRiskMobileCitySeriesData> getData() {
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
        public String getRoseType() {
            return this.roseType;
        }

        public static final class Builder {
            private java.util.List < HighRiskMobileCitySeriesData> data; 
            private String name; 
            private String roseType; 

            /**
             * data.
             */
            public Builder data(java.util.List < HighRiskMobileCitySeriesData> data) {
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
            public Builder roseType(String roseType) {
                this.roseType = roseType;
                return this;
            }

            public HighRiskMobileCitySeries build() {
                return new HighRiskMobileCitySeries(this);
            } 

        } 

    }
    public static class HighRiskMobileCity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("animation")
        private Boolean animation;

        @com.aliyun.core.annotation.NameInMap("grid")
        private HighRiskMobileCityGrid grid;

        @com.aliyun.core.annotation.NameInMap("series")
        private java.util.List < HighRiskMobileCitySeries> series;

        private HighRiskMobileCity(Builder builder) {
            this.animation = builder.animation;
            this.grid = builder.grid;
            this.series = builder.series;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HighRiskMobileCity create() {
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
        public HighRiskMobileCityGrid getGrid() {
            return this.grid;
        }

        /**
         * @return series
         */
        public java.util.List < HighRiskMobileCitySeries> getSeries() {
            return this.series;
        }

        public static final class Builder {
            private Boolean animation; 
            private HighRiskMobileCityGrid grid; 
            private java.util.List < HighRiskMobileCitySeries> series; 

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
            public Builder grid(HighRiskMobileCityGrid grid) {
                this.grid = grid;
                return this;
            }

            /**
             * series.
             */
            public Builder series(java.util.List < HighRiskMobileCitySeries> series) {
                this.series = series;
                return this;
            }

            public HighRiskMobileCity build() {
                return new HighRiskMobileCity(this);
            } 

        } 

    }
    public static class HighRiskMobileProvinceGrid extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("show")
        private Boolean show;

        private HighRiskMobileProvinceGrid(Builder builder) {
            this.show = builder.show;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HighRiskMobileProvinceGrid create() {
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

            public HighRiskMobileProvinceGrid build() {
                return new HighRiskMobileProvinceGrid(this);
            } 

        } 

    }
    public static class HighRiskMobileProvinceSeriesData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private HighRiskMobileProvinceSeriesData(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HighRiskMobileProvinceSeriesData create() {
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

            public HighRiskMobileProvinceSeriesData build() {
                return new HighRiskMobileProvinceSeriesData(this);
            } 

        } 

    }
    public static class HighRiskMobileProvinceSeries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        private java.util.List < HighRiskMobileProvinceSeriesData> data;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("roseType")
        private String roseType;

        private HighRiskMobileProvinceSeries(Builder builder) {
            this.data = builder.data;
            this.name = builder.name;
            this.roseType = builder.roseType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HighRiskMobileProvinceSeries create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List < HighRiskMobileProvinceSeriesData> getData() {
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
        public String getRoseType() {
            return this.roseType;
        }

        public static final class Builder {
            private java.util.List < HighRiskMobileProvinceSeriesData> data; 
            private String name; 
            private String roseType; 

            /**
             * data.
             */
            public Builder data(java.util.List < HighRiskMobileProvinceSeriesData> data) {
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
            public Builder roseType(String roseType) {
                this.roseType = roseType;
                return this;
            }

            public HighRiskMobileProvinceSeries build() {
                return new HighRiskMobileProvinceSeries(this);
            } 

        } 

    }
    public static class HighRiskMobileProvince extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("animation")
        private Boolean animation;

        @com.aliyun.core.annotation.NameInMap("grid")
        private HighRiskMobileProvinceGrid grid;

        @com.aliyun.core.annotation.NameInMap("series")
        private java.util.List < HighRiskMobileProvinceSeries> series;

        private HighRiskMobileProvince(Builder builder) {
            this.animation = builder.animation;
            this.grid = builder.grid;
            this.series = builder.series;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HighRiskMobileProvince create() {
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
        public HighRiskMobileProvinceGrid getGrid() {
            return this.grid;
        }

        /**
         * @return series
         */
        public java.util.List < HighRiskMobileProvinceSeries> getSeries() {
            return this.series;
        }

        public static final class Builder {
            private Boolean animation; 
            private HighRiskMobileProvinceGrid grid; 
            private java.util.List < HighRiskMobileProvinceSeries> series; 

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
            public Builder grid(HighRiskMobileProvinceGrid grid) {
                this.grid = grid;
                return this;
            }

            /**
             * series.
             */
            public Builder series(java.util.List < HighRiskMobileProvinceSeries> series) {
                this.series = series;
                return this;
            }

            public HighRiskMobileProvince build() {
                return new HighRiskMobileProvince(this);
            } 

        } 

    }
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("highRiskIPCity")
        private HighRiskIPCity highRiskIPCity;

        @com.aliyun.core.annotation.NameInMap("highRiskIPProvince")
        private HighRiskIPProvince highRiskIPProvince;

        @com.aliyun.core.annotation.NameInMap("highRiskMobileCity")
        private HighRiskMobileCity highRiskMobileCity;

        @com.aliyun.core.annotation.NameInMap("highRiskMobileProvince")
        private HighRiskMobileProvince highRiskMobileProvince;

        private ResultObject(Builder builder) {
            this.highRiskIPCity = builder.highRiskIPCity;
            this.highRiskIPProvince = builder.highRiskIPProvince;
            this.highRiskMobileCity = builder.highRiskMobileCity;
            this.highRiskMobileProvince = builder.highRiskMobileProvince;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return highRiskIPCity
         */
        public HighRiskIPCity getHighRiskIPCity() {
            return this.highRiskIPCity;
        }

        /**
         * @return highRiskIPProvince
         */
        public HighRiskIPProvince getHighRiskIPProvince() {
            return this.highRiskIPProvince;
        }

        /**
         * @return highRiskMobileCity
         */
        public HighRiskMobileCity getHighRiskMobileCity() {
            return this.highRiskMobileCity;
        }

        /**
         * @return highRiskMobileProvince
         */
        public HighRiskMobileProvince getHighRiskMobileProvince() {
            return this.highRiskMobileProvince;
        }

        public static final class Builder {
            private HighRiskIPCity highRiskIPCity; 
            private HighRiskIPProvince highRiskIPProvince; 
            private HighRiskMobileCity highRiskMobileCity; 
            private HighRiskMobileProvince highRiskMobileProvince; 

            /**
             * highRiskIPCity.
             */
            public Builder highRiskIPCity(HighRiskIPCity highRiskIPCity) {
                this.highRiskIPCity = highRiskIPCity;
                return this;
            }

            /**
             * highRiskIPProvince.
             */
            public Builder highRiskIPProvince(HighRiskIPProvince highRiskIPProvince) {
                this.highRiskIPProvince = highRiskIPProvince;
                return this;
            }

            /**
             * highRiskMobileCity.
             */
            public Builder highRiskMobileCity(HighRiskMobileCity highRiskMobileCity) {
                this.highRiskMobileCity = highRiskMobileCity;
                return this;
            }

            /**
             * highRiskMobileProvince.
             */
            public Builder highRiskMobileProvince(HighRiskMobileProvince highRiskMobileProvince) {
                this.highRiskMobileProvince = highRiskMobileProvince;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
