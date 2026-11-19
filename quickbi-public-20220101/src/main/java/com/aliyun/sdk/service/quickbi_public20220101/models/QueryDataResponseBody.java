// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link QueryDataResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDataResponseBody</p>
 */
public class QueryDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryDataResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDataResponseBody create() {
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
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryDataResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>a4d1a221d-41za1-****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The execution result of the API. Valid values:</p>
         * <ul>
         * <li>true: The execution is successful.</li>
         * <li>false: The execution fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li>true: The request is successful.</li>
         * <li>false: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryDataResponseBody build() {
            return new QueryDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDataResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDataResponseBody</p>
     */
    public static class Headers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Aggregator")
        private String aggregator;

        @com.aliyun.core.annotation.NameInMap("Column")
        private String column;

        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("Granularity")
        private String granularity;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("OriginalColumn")
        private String originalColumn;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Headers(Builder builder) {
            this.aggregator = builder.aggregator;
            this.column = builder.column;
            this.dataType = builder.dataType;
            this.granularity = builder.granularity;
            this.label = builder.label;
            this.originalColumn = builder.originalColumn;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Headers create() {
            return builder().build();
        }

        /**
         * @return aggregator
         */
        public String getAggregator() {
            return this.aggregator;
        }

        /**
         * @return column
         */
        public String getColumn() {
            return this.column;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return granularity
         */
        public String getGranularity() {
            return this.granularity;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return originalColumn
         */
        public String getOriginalColumn() {
            return this.originalColumn;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String aggregator; 
            private String column; 
            private String dataType; 
            private String granularity; 
            private String label; 
            private String originalColumn; 
            private String type; 

            private Builder() {
            } 

            private Builder(Headers model) {
                this.aggregator = model.aggregator;
                this.column = model.column;
                this.dataType = model.dataType;
                this.granularity = model.granularity;
                this.label = model.label;
                this.originalColumn = model.originalColumn;
                this.type = model.type;
            } 

            /**
             * <p>The aggregation operator. This field is available only for measure fields, such as SUM, AVG, and MAX. Valid values:</p>
             * <ul>
             * <li>SUM: Sum.</li>
             * <li>MAX: Maximum value.</li>
             * <li>MIN: Minimum value.</li>
             * <li>AVG: Average value.</li>
             * <li>COUNT: Count.</li>
             * <li>COUNTD: Deduplicate count.</li>
             * <li>STDDEV_POP: Population standard deviation.</li>
             * <li>STDDEV_SAMP: Sample standard deviation.</li>
             * <li>VAR_POP: Population variance.</li>
             * <li>VAR_SAMP: Sample variance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUM</p>
             */
            public Builder aggregator(String aggregator) {
                this.aggregator = aggregator;
                return this;
            }

            /**
             * <p>The name of the field, which corresponds to the field name in the physical table.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder column(String column) {
                this.column = column;
                return this;
            }

            /**
             * <p>The data type of the field. Valid values:</p>
             * <ul>
             * <li>number: Numeric.</li>
             * <li>string: String.</li>
             * <li>date: Date.</li>
             * <li>time: Time.</li>
             * <li>datetime: Date and time.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>string</p>
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * <p>The granularity of the dimension field. This field is returned only when the requested field is a date dimension or a geographic dimension. Valid values:</p>
             * <ul>
             * <li><p>Date granularity: yearRegion (year), monthRegion (month), weekRegion (week), dayRegion (day), hourRegion (hour), minRegion (minute), and secRegion (second).</p>
             * </li>
             * <li><p>Geographic granularity: COUNTRY (country), PROVINCE (province), CITY (city), XIAN (district/county), and REGION (region).</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>REGION</p>
             */
            public Builder granularity(String granularity) {
                this.granularity = granularity;
                return this;
            }

            /**
             * <p>The alias of the field, which is the key of the map data row in the values result parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>area</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The original name of the corresponding field in the dataset.</p>
             * 
             * <strong>example:</strong>
             * <p>area</p>
             */
            public Builder originalColumn(String originalColumn) {
                this.originalColumn = originalColumn;
                return this;
            }

            /**
             * <p>The type of the field, which is used to distinguish whether the field is a dimension or a measure. Valid values:</p>
             * <ul>
             * <li>Dimension: Dimension.</li>
             * <li>Measure: Measure.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Dimension</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Headers build() {
                return new Headers(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryDataResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDataResponseBody</p>
     */
    public static class RowValue extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("L")
        private String l;

        @com.aliyun.core.annotation.NameInMap("R")
        private String r;

        @com.aliyun.core.annotation.NameInMap("V")
        private String v;

        private RowValue(Builder builder) {
            this.l = builder.l;
            this.r = builder.r;
            this.v = builder.v;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RowValue create() {
            return builder().build();
        }

        /**
         * @return l
         */
        public String getL() {
            return this.l;
        }

        /**
         * @return r
         */
        public String getR() {
            return this.r;
        }

        /**
         * @return v
         */
        public String getV() {
            return this.v;
        }

        public static final class Builder {
            private String l; 
            private String r; 
            private String v; 

            private Builder() {
            } 

            private Builder(RowValue model) {
                this.l = model.l;
                this.r = model.r;
                this.v = model.v;
            } 

            /**
             * <p>The field alias set in Data Service.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder l(String l) {
                this.l = l;
                return this;
            }

            /**
             * <p>The original value.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder r(String r) {
                this.r = r;
                return this;
            }

            /**
             * <p>The display value.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder v(String v) {
                this.v = v;
                return this;
            }

            public RowValue build() {
                return new RowValue(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryDataResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDataResponseBody</p>
     */
    public static class ValuesV2 extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RowValue")
        private java.util.List<RowValue> rowValue;

        private ValuesV2(Builder builder) {
            this.rowValue = builder.rowValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ValuesV2 create() {
            return builder().build();
        }

        /**
         * @return rowValue
         */
        public java.util.List<RowValue> getRowValue() {
            return this.rowValue;
        }

        public static final class Builder {
            private java.util.List<RowValue> rowValue; 

            private Builder() {
            } 

            private Builder(ValuesV2 model) {
                this.rowValue = model.rowValue;
            } 

            /**
             * <p>The row values.</p>
             */
            public Builder rowValue(java.util.List<RowValue> rowValue) {
                this.rowValue = rowValue;
                return this;
            }

            public ValuesV2 build() {
                return new ValuesV2(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryDataResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDataResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Headers")
        private java.util.List<Headers> headers;

        @com.aliyun.core.annotation.NameInMap("Sql")
        private String sql;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<java.util.Map<String, ?>> values;

        @com.aliyun.core.annotation.NameInMap("ValuesV2")
        private java.util.List<ValuesV2> valuesV2;

        private Result(Builder builder) {
            this.headers = builder.headers;
            this.sql = builder.sql;
            this.values = builder.values;
            this.valuesV2 = builder.valuesV2;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return headers
         */
        public java.util.List<Headers> getHeaders() {
            return this.headers;
        }

        /**
         * @return sql
         */
        public String getSql() {
            return this.sql;
        }

        /**
         * @return values
         */
        public java.util.List<java.util.Map<String, ?>> getValues() {
            return this.values;
        }

        /**
         * @return valuesV2
         */
        public java.util.List<ValuesV2> getValuesV2() {
            return this.valuesV2;
        }

        public static final class Builder {
            private java.util.List<Headers> headers; 
            private String sql; 
            private java.util.List<java.util.Map<String, ?>> values; 
            private java.util.List<ValuesV2> valuesV2; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.headers = model.headers;
                this.sql = model.sql;
                this.values = model.values;
                this.valuesV2 = model.valuesV2;
            } 

            /**
             * <p>The column headers.</p>
             */
            public Builder headers(java.util.List<Headers> headers) {
                this.headers = headers;
                return this;
            }

            /**
             * <p>The SQL statement of the query.</p>
             * <blockquote>
             * <p>In addition to the parameter conditions of the current API, the filter conditions in the returned SQL statement also include the row-level and column-level permission configurations.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>SELECT COMPANY_T_1_.<code>area</code> AS D_AREA_2_, COMPANY_T_1_.<code>city</code> AS D_CITY_3_, SUM(COMPANY_T_1_.<code>profit_amt</code>) AS D_PROFIT_4_ FROM <code>quickbi_test</code>.<code>company_sales_record_copy</code> AS COMPANY_T_1_ WHERE COMPANY_T_1_.<code>area</code> LIKE \&quot;%test%\&quot; GROUP BY COMPANY_T_1_.<code>area</code>, COMPANY_T_1_.<code>city</code> HAVING SUM(COMPANY_T_1_.<code>order_amt</code>) &gt; 1 LIMIT 0, 10</p>
             */
            public Builder sql(String sql) {
                this.sql = sql;
                return this;
            }

            /**
             * <p>The returned query results.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;area&quot;:&quot;test&quot;,&quot;city&quot;:&quot;test&quot;},{&quot;area&quot;:&quot;test&quot;,&quot;city&quot;:&quot;test&quot;}]</p>
             */
            public Builder values(java.util.List<java.util.Map<String, ?>> values) {
                this.values = values;
                return this;
            }

            /**
             * <p>The returned query results, including the original value fields.</p>
             */
            public Builder valuesV2(java.util.List<ValuesV2> valuesV2) {
                this.valuesV2 = valuesV2;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
