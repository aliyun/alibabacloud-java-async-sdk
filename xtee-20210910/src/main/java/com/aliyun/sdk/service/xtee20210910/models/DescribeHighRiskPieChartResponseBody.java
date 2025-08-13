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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeHighRiskPieChartResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
            this.success = model.success;
        } 

        /**
         * <p>Status code</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>HTTP status code</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Error details</p>
         * 
         * <strong>example:</strong>
         * <p>The input parameter data is not valid. order_storage_company_num component not found</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID</p>
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

        /**
         * <p>Whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeHighRiskPieChartResponseBody build() {
            return new DescribeHighRiskPieChartResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHighRiskPieChartResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHighRiskPieChartResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Grid model) {
                this.show = model.show;
            } 

            /**
             * <p>Chart flag, default false</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
    /**
     * 
     * {@link DescribeHighRiskPieChartResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHighRiskPieChartResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>Field name</p>
             * 
             * <strong>example:</strong>
             * <p>杭州市</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Data value</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link DescribeHighRiskPieChartResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHighRiskPieChartResponseBody</p>
     */
    public static class Series extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        private java.util.List<Data> data;

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
        public java.util.List<Data> getData() {
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
            private java.util.List<Data> data; 
            private String name; 
            private String roseType; 

            private Builder() {
            } 

            private Builder(Series model) {
                this.data = model.data;
                this.name = model.name;
                this.roseType = model.roseType;
            } 

            /**
             * <p>Returned data object</p>
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>Field name</p>
             * 
             * <strong>example:</strong>
             * <p>杭州市</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Chart identifier, default is false</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
    /**
     * 
     * {@link DescribeHighRiskPieChartResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHighRiskPieChartResponseBody</p>
     */
    public static class HighRiskIPCity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("animation")
        private Boolean animation;

        @com.aliyun.core.annotation.NameInMap("grid")
        private Grid grid;

        @com.aliyun.core.annotation.NameInMap("series")
        private java.util.List<Series> series;

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
        public java.util.List<Series> getSeries() {
            return this.series;
        }

        public static final class Builder {
            private Boolean animation; 
            private Grid grid; 
            private java.util.List<Series> series; 

            private Builder() {
            } 

            private Builder(HighRiskIPCity model) {
                this.animation = model.animation;
                this.grid = model.grid;
                this.series = model.series;
            } 

            /**
             * <p>Chart flag, default true</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder animation(Boolean animation) {
                this.animation = animation;
                return this;
            }

            /**
             * <p>Belonging grid.</p>
             */
            public Builder grid(Grid grid) {
                this.grid = grid;
                return this;
            }

            /**
             * <p>Chart data</p>
             */
            public Builder series(java.util.List<Series> series) {
                this.series = series;
                return this;
            }

            public HighRiskIPCity build() {
                return new HighRiskIPCity(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeHighRiskPieChartResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHighRiskPieChartResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(HighRiskIPProvinceGrid model) {
                this.show = model.show;
            } 

            /**
             * <p>Chart identifier, default is false</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
    /**
     * 
     * {@link DescribeHighRiskPieChartResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHighRiskPieChartResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(SeriesData model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>Variable name</p>
             * 
             * <strong>example:</strong>
             * <p>浙江省</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Data value</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link DescribeHighRiskPieChartResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHighRiskPieChartResponseBody</p>
     */
    public static class HighRiskIPProvinceSeries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        private java.util.List<SeriesData> data;

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
        public java.util.List<SeriesData> getData() {
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
            private java.util.List<SeriesData> data; 
            private String name; 
            private String roseType; 

            private Builder() {
            } 

            private Builder(HighRiskIPProvinceSeries model) {
                this.data = model.data;
                this.name = model.name;
                this.roseType = model.roseType;
            } 

            /**
             * <p>Returned data object</p>
             */
            public Builder data(java.util.List<SeriesData> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>Field name</p>
             * 
             * <strong>example:</strong>
             * <p>浙江省</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Chart identifier, default is false</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
    /**
     * 
     * {@link DescribeHighRiskPieChartResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHighRiskPieChartResponseBody</p>
     */
    public static class HighRiskIPProvince extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("animation")
        private Boolean animation;

        @com.aliyun.core.annotation.NameInMap("grid")
        private HighRiskIPProvinceGrid grid;

        @com.aliyun.core.annotation.NameInMap("series")
        private java.util.List<HighRiskIPProvinceSeries> series;

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
        public java.util.List<HighRiskIPProvinceSeries> getSeries() {
            return this.series;
        }

        public static final class Builder {
            private Boolean animation; 
            private HighRiskIPProvinceGrid grid; 
            private java.util.List<HighRiskIPProvinceSeries> series; 

            private Builder() {
            } 

            private Builder(HighRiskIPProvince model) {
                this.animation = model.animation;
                this.grid = model.grid;
                this.series = model.series;
            } 

            /**
             * <p>Chart identifier, default is true</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder animation(Boolean animation) {
                this.animation = animation;
                return this;
            }

            /**
             * <p>Belonging grid.</p>
             */
            public Builder grid(HighRiskIPProvinceGrid grid) {
                this.grid = grid;
                return this;
            }

            /**
             * <p>Chart data</p>
             */
            public Builder series(java.util.List<HighRiskIPProvinceSeries> series) {
                this.series = series;
                return this;
            }

            public HighRiskIPProvince build() {
                return new HighRiskIPProvince(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeHighRiskPieChartResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHighRiskPieChartResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(HighRiskMobileCityGrid model) {
                this.show = model.show;
            } 

            /**
             * <p>Chart flag, default is false</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
    /**
     * 
     * {@link DescribeHighRiskPieChartResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHighRiskPieChartResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(HighRiskMobileCitySeriesData model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>Field name</p>
             * 
             * <strong>example:</strong>
             * <p>杭州市</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Data value</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link DescribeHighRiskPieChartResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHighRiskPieChartResponseBody</p>
     */
    public static class HighRiskMobileCitySeries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        private java.util.List<HighRiskMobileCitySeriesData> data;

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
        public java.util.List<HighRiskMobileCitySeriesData> getData() {
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
            private java.util.List<HighRiskMobileCitySeriesData> data; 
            private String name; 
            private String roseType; 

            private Builder() {
            } 

            private Builder(HighRiskMobileCitySeries model) {
                this.data = model.data;
                this.name = model.name;
                this.roseType = model.roseType;
            } 

            /**
             * <p>Returned data object</p>
             */
            public Builder data(java.util.List<HighRiskMobileCitySeriesData> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>Field name</p>
             * 
             * <strong>example:</strong>
             * <p>杭州市</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Chart flag, default is false</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
    /**
     * 
     * {@link DescribeHighRiskPieChartResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHighRiskPieChartResponseBody</p>
     */
    public static class HighRiskMobileCity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("animation")
        private Boolean animation;

        @com.aliyun.core.annotation.NameInMap("grid")
        private HighRiskMobileCityGrid grid;

        @com.aliyun.core.annotation.NameInMap("series")
        private java.util.List<HighRiskMobileCitySeries> series;

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
        public java.util.List<HighRiskMobileCitySeries> getSeries() {
            return this.series;
        }

        public static final class Builder {
            private Boolean animation; 
            private HighRiskMobileCityGrid grid; 
            private java.util.List<HighRiskMobileCitySeries> series; 

            private Builder() {
            } 

            private Builder(HighRiskMobileCity model) {
                this.animation = model.animation;
                this.grid = model.grid;
                this.series = model.series;
            } 

            /**
             * <p>Chart flag, default is true</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder animation(Boolean animation) {
                this.animation = animation;
                return this;
            }

            /**
             * <p>Belongs to grid.</p>
             */
            public Builder grid(HighRiskMobileCityGrid grid) {
                this.grid = grid;
                return this;
            }

            /**
             * <p>Chart data</p>
             */
            public Builder series(java.util.List<HighRiskMobileCitySeries> series) {
                this.series = series;
                return this;
            }

            public HighRiskMobileCity build() {
                return new HighRiskMobileCity(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeHighRiskPieChartResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHighRiskPieChartResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(HighRiskMobileProvinceGrid model) {
                this.show = model.show;
            } 

            /**
             * <p>Chart flag, default is false</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
    /**
     * 
     * {@link DescribeHighRiskPieChartResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHighRiskPieChartResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(HighRiskMobileProvinceSeriesData model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>Field name</p>
             * 
             * <strong>example:</strong>
             * <p>浙江省</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Data value</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link DescribeHighRiskPieChartResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHighRiskPieChartResponseBody</p>
     */
    public static class HighRiskMobileProvinceSeries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        private java.util.List<HighRiskMobileProvinceSeriesData> data;

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
        public java.util.List<HighRiskMobileProvinceSeriesData> getData() {
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
            private java.util.List<HighRiskMobileProvinceSeriesData> data; 
            private String name; 
            private String roseType; 

            private Builder() {
            } 

            private Builder(HighRiskMobileProvinceSeries model) {
                this.data = model.data;
                this.name = model.name;
                this.roseType = model.roseType;
            } 

            /**
             * <p>High-risk position data.</p>
             */
            public Builder data(java.util.List<HighRiskMobileProvinceSeriesData> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>Display title</p>
             * 
             * <strong>example:</strong>
             * <p>分值区间占比</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Chart identifier, default false</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
    /**
     * 
     * {@link DescribeHighRiskPieChartResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHighRiskPieChartResponseBody</p>
     */
    public static class HighRiskMobileProvince extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("animation")
        private Boolean animation;

        @com.aliyun.core.annotation.NameInMap("grid")
        private HighRiskMobileProvinceGrid grid;

        @com.aliyun.core.annotation.NameInMap("series")
        private java.util.List<HighRiskMobileProvinceSeries> series;

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
        public java.util.List<HighRiskMobileProvinceSeries> getSeries() {
            return this.series;
        }

        public static final class Builder {
            private Boolean animation; 
            private HighRiskMobileProvinceGrid grid; 
            private java.util.List<HighRiskMobileProvinceSeries> series; 

            private Builder() {
            } 

            private Builder(HighRiskMobileProvince model) {
                this.animation = model.animation;
                this.grid = model.grid;
                this.series = model.series;
            } 

            /**
             * <p>Indicator, default true</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder animation(Boolean animation) {
                this.animation = animation;
                return this;
            }

            /**
             * <p>Belongs to grid.</p>
             */
            public Builder grid(HighRiskMobileProvinceGrid grid) {
                this.grid = grid;
                return this;
            }

            /**
             * <p>Chart data</p>
             */
            public Builder series(java.util.List<HighRiskMobileProvinceSeries> series) {
                this.series = series;
                return this;
            }

            public HighRiskMobileProvince build() {
                return new HighRiskMobileProvince(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeHighRiskPieChartResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHighRiskPieChartResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.highRiskIPCity = model.highRiskIPCity;
                this.highRiskIPProvince = model.highRiskIPProvince;
                this.highRiskMobileCity = model.highRiskMobileCity;
                this.highRiskMobileProvince = model.highRiskMobileProvince;
            } 

            /**
             * <p>High-risk IP city</p>
             */
            public Builder highRiskIPCity(HighRiskIPCity highRiskIPCity) {
                this.highRiskIPCity = highRiskIPCity;
                return this;
            }

            /**
             * <p>High-risk IP归属province</p>
             */
            public Builder highRiskIPProvince(HighRiskIPProvince highRiskIPProvince) {
                this.highRiskIPProvince = highRiskIPProvince;
                return this;
            }

            /**
             * <p>High-risk mobile phone归属city</p>
             */
            public Builder highRiskMobileCity(HighRiskMobileCity highRiskMobileCity) {
                this.highRiskMobileCity = highRiskMobileCity;
                return this;
            }

            /**
             * <p>High-risk mobile phone&quot;s province of origin</p>
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
