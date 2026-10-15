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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>a4d1a221d-41za1-****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result of the API call. Valid values:</p>
         * <ul>
         * <li><p>true: The call was successful.</p>
         * </li>
         * <li><p>false: The call failed.</p>
         * </li>
         * </ul>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Whether the request succeeded. Valid values:</p>
         * <ul>
         * <li><p>true: The request was successful.</p>
         * </li>
         * <li><p>false: The request failed.</p>
         * </li>
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
             * <p>The aggregate operator. Returned only for measure fields.</p>
             * <ul>
             * <li><p>SUM: The sum.</p>
             * </li>
             * <li><p>MAX: The maximum value.</p>
             * </li>
             * <li><p>MIN: The minimum value.</p>
             * </li>
             * <li><p>AVG: The average value.</p>
             * </li>
             * <li><p>COUNT: The count.</p>
             * </li>
             * <li><p>COUNTD: The count of unique values.</p>
             * </li>
             * <li><p>STDDEV_POP: The population standard deviation.</p>
             * </li>
             * <li><p>STDDEV_SAMP: The sample standard deviation.</p>
             * </li>
             * <li><p>VAR_POP: The population variance.</p>
             * </li>
             * <li><p>VAR_SAMP: The sample variance.</p>
             * </li>
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
             * <p>The physical table field name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder column(String column) {
                this.column = column;
                return this;
            }

            /**
             * <p>The field data type. Common types:</p>
             * <ul>
             * <li><p>number</p>
             * </li>
             * <li><p>string</p>
             * </li>
             * <li><p>date</p>
             * </li>
             * <li><p>time</p>
             * </li>
             * <li><p>datetime</p>
             * </li>
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
             * <p>The dimension granularity. Returned only for date or geographic dimensions. Valid values:</p>
             * <ul>
             * <li><p>Date granularity: yearRegion (year), monthRegion (month), weekRegion (week), dayRegion (day), hourRegion (hour), minRegion (minute), secRegion (second)</p>
             * </li>
             * <li><p>Geographic granularity: COUNTRY (country), PROVINCE (province), CITY (city), XIAN (county/district), REGION (region)</p>
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
             * <p>The field alias. Used as the key in each Values map entry.</p>
             * 
             * <strong>example:</strong>
             * <p>area</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The original field name in the dataset.</p>
             * 
             * <strong>example:</strong>
             * <p>area</p>
             */
            public Builder originalColumn(String originalColumn) {
                this.originalColumn = originalColumn;
                return this;
            }

            /**
             * <p>Whether the field is a dimension or measure.</p>
             * <ul>
             * <li><p>Dimension</p>
             * </li>
             * <li><p>Measure</p>
             * </li>
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
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Headers")
        private java.util.List<Headers> headers;

        @com.aliyun.core.annotation.NameInMap("Sql")
        private String sql;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<java.util.Map<String, ?>> values;

        private Result(Builder builder) {
            this.headers = builder.headers;
            this.sql = builder.sql;
            this.values = builder.values;
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

        public static final class Builder {
            private java.util.List<Headers> headers; 
            private String sql; 
            private java.util.List<java.util.Map<String, ?>> values; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.headers = model.headers;
                this.sql = model.sql;
                this.values = model.values;
            } 

            /**
             * <p>The column headers.</p>
             */
            public Builder headers(java.util.List<Headers> headers) {
                this.headers = headers;
                return this;
            }

            /**
             * <p>The SQL statement for the query.</p>
             * <blockquote>
             * <p>The returned SQL includes both the filter conditions from this call and any row-level or column-level permission rules.</p>
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
             * <p>The query results.</p>
             */
            public Builder values(java.util.List<java.util.Map<String, ?>> values) {
                this.values = values;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
