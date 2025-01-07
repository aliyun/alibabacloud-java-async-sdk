// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeChartDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeChartDataResponseBody</p>
 */
public class DescribeChartDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AllChartSubTypeList")
    private java.util.List<AllChartSubTypeList> allChartSubTypeList;

    @com.aliyun.core.annotation.NameInMap("ChartDataType")
    private String chartDataType;

    @com.aliyun.core.annotation.NameInMap("ChartSubTypeList")
    private java.util.List<String> chartSubTypeList;

    @com.aliyun.core.annotation.NameInMap("ChartType")
    private String chartType;

    @com.aliyun.core.annotation.NameInMap("CoordinateData")
    private CoordinateData coordinateData;

    @com.aliyun.core.annotation.NameInMap("MultipleData")
    private java.util.List<MultipleData> multipleData;

    @com.aliyun.core.annotation.NameInMap("PropertyArrayValue")
    private String propertyArrayValue;

    @com.aliyun.core.annotation.NameInMap("PropertyValue")
    private String propertyValue;

    @com.aliyun.core.annotation.NameInMap("ProperyArrayValue")
    private String properyArrayValue;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SingleData")
    private SingleData singleData;

    private DescribeChartDataResponseBody(Builder builder) {
        this.allChartSubTypeList = builder.allChartSubTypeList;
        this.chartDataType = builder.chartDataType;
        this.chartSubTypeList = builder.chartSubTypeList;
        this.chartType = builder.chartType;
        this.coordinateData = builder.coordinateData;
        this.multipleData = builder.multipleData;
        this.propertyArrayValue = builder.propertyArrayValue;
        this.propertyValue = builder.propertyValue;
        this.properyArrayValue = builder.properyArrayValue;
        this.requestId = builder.requestId;
        this.singleData = builder.singleData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeChartDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return allChartSubTypeList
     */
    public java.util.List<AllChartSubTypeList> getAllChartSubTypeList() {
        return this.allChartSubTypeList;
    }

    /**
     * @return chartDataType
     */
    public String getChartDataType() {
        return this.chartDataType;
    }

    /**
     * @return chartSubTypeList
     */
    public java.util.List<String> getChartSubTypeList() {
        return this.chartSubTypeList;
    }

    /**
     * @return chartType
     */
    public String getChartType() {
        return this.chartType;
    }

    /**
     * @return coordinateData
     */
    public CoordinateData getCoordinateData() {
        return this.coordinateData;
    }

    /**
     * @return multipleData
     */
    public java.util.List<MultipleData> getMultipleData() {
        return this.multipleData;
    }

    /**
     * @return propertyArrayValue
     */
    public String getPropertyArrayValue() {
        return this.propertyArrayValue;
    }

    /**
     * @return propertyValue
     */
    public String getPropertyValue() {
        return this.propertyValue;
    }

    /**
     * @return properyArrayValue
     */
    public String getProperyArrayValue() {
        return this.properyArrayValue;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return singleData
     */
    public SingleData getSingleData() {
        return this.singleData;
    }

    public static final class Builder {
        private java.util.List<AllChartSubTypeList> allChartSubTypeList; 
        private String chartDataType; 
        private java.util.List<String> chartSubTypeList; 
        private String chartType; 
        private CoordinateData coordinateData; 
        private java.util.List<MultipleData> multipleData; 
        private String propertyArrayValue; 
        private String propertyValue; 
        private String properyArrayValue; 
        private String requestId; 
        private SingleData singleData; 

        /**
         * <p>The valid values for all subtypes of the chart.</p>
         */
        public Builder allChartSubTypeList(java.util.List<AllChartSubTypeList> allChartSubTypeList) {
            this.allChartSubTypeList = allChartSubTypeList;
            return this;
        }

        /**
         * <p>The data type of the chart. Valid values:</p>
         * <ul>
         * <li><strong>commonCoordinate</strong></li>
         * <li><strong>timeCoordinate</strong></li>
         * <li><strong>multipleValue</strong></li>
         * <li><strong>singleValue</strong></li>
         * <li><strong>propertyValue</strong></li>
         * <li><strong>propertyArrayValue</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>propertyArrayValue</p>
         */
        public Builder chartDataType(String chartDataType) {
            this.chartDataType = chartDataType;
            return this;
        }

        /**
         * <p>The subtype values in which the chart is selected.</p>
         */
        public Builder chartSubTypeList(java.util.List<String> chartSubTypeList) {
            this.chartSubTypeList = chartSubTypeList;
            return this;
        }

        /**
         * <p>The type of the chart. Valid values:</p>
         * <ul>
         * <li><strong>timeLine</strong></li>
         * <li><strong>timeBar</strong></li>
         * <li><strong>bar</strong></li>
         * <li><strong>line</strong></li>
         * <li><strong>pie</strong></li>
         * <li><strong>gauge</strong></li>
         * <li><strong>table</strong></li>
         * <li><strong>text</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>timeBar</p>
         */
        public Builder chartType(String chartType) {
            this.chartType = chartType;
            return this;
        }

        /**
         * <p>The coordinate data.</p>
         */
        public Builder coordinateData(CoordinateData coordinateData) {
            this.coordinateData = coordinateData;
            return this;
        }

        /**
         * <p>The values in the multi-value charts.</p>
         */
        public Builder multipleData(java.util.List<MultipleData> multipleData) {
            this.multipleData = multipleData;
            return this;
        }

        /**
         * <p>The attribute value of the array chart.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder propertyArrayValue(String propertyArrayValue) {
            this.propertyArrayValue = propertyArrayValue;
            return this;
        }

        /**
         * <p>The data of the chart.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;totalCount&quot;: &quot;0&quot;}</p>
         */
        public Builder propertyValue(String propertyValue) {
            this.propertyValue = propertyValue;
            return this;
        }

        /**
         * <p>The array data of the chart.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder properyArrayValue(String properyArrayValue) {
            this.properyArrayValue = properyArrayValue;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>50CCE62A-2BC4-5CF8-B976-E4F62A31****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The data of the single value chart.</p>
         */
        public Builder singleData(SingleData singleData) {
            this.singleData = singleData;
            return this;
        }

        public DescribeChartDataResponseBody build() {
            return new DescribeChartDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeChartDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeChartDataResponseBody</p>
     */
    public static class AllChartSubTypeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SubType")
        private String subType;

        @com.aliyun.core.annotation.NameInMap("SubTypeName")
        private String subTypeName;

        private AllChartSubTypeList(Builder builder) {
            this.subType = builder.subType;
            this.subTypeName = builder.subTypeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AllChartSubTypeList create() {
            return builder().build();
        }

        /**
         * @return subType
         */
        public String getSubType() {
            return this.subType;
        }

        /**
         * @return subTypeName
         */
        public String getSubTypeName() {
            return this.subTypeName;
        }

        public static final class Builder {
            private String subType; 
            private String subTypeName; 

            /**
             * <p>The subtype of the chart.</p>
             * 
             * <strong>example:</strong>
             * <p>CID_SUSPICIOUS_TREND-ALL</p>
             */
            public Builder subType(String subType) {
                this.subType = subType;
                return this;
            }

            /**
             * <p>The name of the chart subtype.</p>
             * 
             * <strong>example:</strong>
             * <p>All Alerts</p>
             */
            public Builder subTypeName(String subTypeName) {
                this.subTypeName = subTypeName;
                return this;
            }

            public AllChartSubTypeList build() {
                return new AllChartSubTypeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeChartDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeChartDataResponseBody</p>
     */
    public static class YAxisList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SubType")
        private String subType;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private java.util.List<String> value;

        private YAxisList(Builder builder) {
            this.name = builder.name;
            this.subType = builder.subType;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static YAxisList create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return subType
         */
        public String getSubType() {
            return this.subType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public java.util.List<String> getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String subType; 
            private String type; 
            private java.util.List<String> value; 

            /**
             * <p>The name of the data type.</p>
             * 
             * <strong>example:</strong>
             * <p>Port</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The subtype data of the chart.</p>
             * 
             * <strong>example:</strong>
             * <p>CID_SUSPICIOUS_TREND-AL</p>
             */
            public Builder subType(String subType) {
                this.subType = subType;
                return this;
            }

            /**
             * <p>The type of the data.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The values of the y-axis that corresponds to x-axis points.</p>
             */
            public Builder value(java.util.List<String> value) {
                this.value = value;
                return this;
            }

            public YAxisList build() {
                return new YAxisList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeChartDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeChartDataResponseBody</p>
     */
    public static class CoordinateData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("XAxis")
        private java.util.List<String> xAxis;

        @com.aliyun.core.annotation.NameInMap("YAxisList")
        private java.util.List<YAxisList> yAxisList;

        private CoordinateData(Builder builder) {
            this.xAxis = builder.xAxis;
            this.yAxisList = builder.yAxisList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CoordinateData create() {
            return builder().build();
        }

        /**
         * @return xAxis
         */
        public java.util.List<String> getXAxis() {
            return this.xAxis;
        }

        /**
         * @return yAxisList
         */
        public java.util.List<YAxisList> getYAxisList() {
            return this.yAxisList;
        }

        public static final class Builder {
            private java.util.List<String> xAxis; 
            private java.util.List<YAxisList> yAxisList; 

            /**
             * <p>The x-axis values.</p>
             */
            public Builder xAxis(java.util.List<String> xAxis) {
                this.xAxis = xAxis;
                return this;
            }

            /**
             * <p>The y-axis values.</p>
             */
            public Builder yAxisList(java.util.List<YAxisList> yAxisList) {
                this.yAxisList = yAxisList;
                return this;
            }

            public CoordinateData build() {
                return new CoordinateData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeChartDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeChartDataResponseBody</p>
     */
    public static class MultipleData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Color")
        private String color;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private MultipleData(Builder builder) {
            this.color = builder.color;
            this.name = builder.name;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MultipleData create() {
            return builder().build();
        }

        /**
         * @return color
         */
        public String getColor() {
            return this.color;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String color; 
            private String name; 
            private String type; 
            private Long value; 

            /**
             * <p>The font color, which is an RGBA value.</p>
             * 
             * <strong>example:</strong>
             * <p>#FFA800</p>
             */
            public Builder color(String color) {
                this.color = color;
                return this;
            }

            /**
             * <p>The name of the data type.</p>
             * 
             * <strong>example:</strong>
             * <p>Safety</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the data.</p>
             * 
             * <strong>example:</strong>
             * <p>safe</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The attribute value.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public MultipleData build() {
                return new MultipleData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeChartDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeChartDataResponseBody</p>
     */
    public static class SingleData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private SingleData(Builder builder) {
            this.name = builder.name;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SingleData create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String type; 
            private Long value; 

            /**
             * <p>The name of the data type.</p>
             * 
             * <strong>example:</strong>
             * <p>suspicious</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the data.</p>
             * 
             * <strong>example:</strong>
             * <p>suspicious</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The value in the single value chart.</p>
             * 
             * <strong>example:</strong>
             * <p>172</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public SingleData build() {
                return new SingleData(this);
            } 

        } 

    }
}
