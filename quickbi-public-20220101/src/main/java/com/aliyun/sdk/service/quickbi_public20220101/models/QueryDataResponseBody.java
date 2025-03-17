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
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>a4d1a221d-41za1-****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returns the result of the interface execution. Possible values:</p>
         * <ul>
         * <li>true: Execution succeeded</li>
         * <li>false: Execution failed</li>
         * </ul>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Possible values:</p>
         * <ul>
         * <li>true: Request succeeded</li>
         * <li>false: Request failed</li>
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

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Headers(Builder builder) {
            this.aggregator = builder.aggregator;
            this.column = builder.column;
            this.dataType = builder.dataType;
            this.granularity = builder.granularity;
            this.label = builder.label;
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
            private String type; 

            private Builder() {
            } 

            private Builder(Headers model) {
                this.aggregator = model.aggregator;
                this.column = model.column;
                this.dataType = model.dataType;
                this.granularity = model.granularity;
                this.label = model.label;
                this.type = model.type;
            } 

            /**
             * <p>Aggregation operator. Only present for measure fields, such as SUM, AVG, and MAX.</p>
             * <ul>
             * <li>SUM: Sum</li>
             * <li>MAX: Maximum value</li>
             * <li>MIN: Minimum value</li>
             * <li>AVG: Average</li>
             * <li>COUNT: Count</li>
             * <li>COUNTD: Distinct count</li>
             * <li>STDDEV_POP: Population standard deviation</li>
             * <li>STDDEV_SAMP: Sample standard deviation</li>
             * <li>VAR_POP: Population variance</li>
             * <li>VAR_SAMP: Sample variance</li>
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
             * <p>Field name, corresponding to the physical table field name.</p>
             * 
             * <strong>example:</strong>
             * <p>Specific physical field name</p>
             */
            public Builder column(String column) {
                this.column = column;
                return this;
            }

            /**
             * <p>字段的数据类型。一般有：</p>
             * <ul>
             * <li>number：数值</li>
             * <li>string：字符串</li>
             * <li>date：日期</li>
             * <li>time：时间</li>
             * <li>datetime：日期时间</li>
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
             * <p>The granularity of the dimension field.
             * This field is returned only when the requested field is a date or geographic dimension, with the following possible values:</p>
             * <ul>
             * <li><p>Date Granularity: yearRegion (year), monthRegion (month), weekRegion (week), dayRegion (day), hourRegion (hour), minRegion (minute), secRegion (second)</p>
             * </li>
             * <li><p>Geographic Granularity: COUNTRY (international level), PROVINCE (provincial level), CITY (city level), XIAN (district/county level), REGION (region)</p>
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
             * <p>Field alias, which serves as the key in the map data rows of the <code>values</code> parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>area</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>Field type, used to distinguish between dimension and measure fields.</p>
             * <ul>
             * <li>Dimension: dimension</li>
             * <li>Measure: measure</li>
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
             * <p>Column headers.</p>
             */
            public Builder headers(java.util.List<Headers> headers) {
                this.headers = headers;
                return this;
            }

            /**
             * <p>The SQL query that was executed.</p>
             * <blockquote>
             * <p>The filter conditions in the returned SQL statement include not only the parameters passed through this interface but also the row and column permission configurations.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>SELECT COMPANY_T_1_.<code>area</code> AS D_AREA_2_, COMPANY_T_1_.<code>city</code> AS D_CITY_3_, SUM(COMPANY_T_1_.<code>profit_amt</code>) AS D_PROFIT_4_ FROM <code>quickbi_test</code>.<code>company_sales_record_copy</code> AS COMPANY_T_1_ WHERE COMPANY_T_1_.<code>area</code> LIKE &quot;%华东%&quot; GROUP BY COMPANY_T_1_.<code>area</code>, COMPANY_T_1_.<code>city</code> HAVING SUM(COMPANY_T_1_.<code>order_amt</code>) &gt; 1 LIMIT 0, 10</p>
             */
            public Builder sql(String sql) {
                this.sql = sql;
                return this;
            }

            /**
             * <p>The results of the query.</p>
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
