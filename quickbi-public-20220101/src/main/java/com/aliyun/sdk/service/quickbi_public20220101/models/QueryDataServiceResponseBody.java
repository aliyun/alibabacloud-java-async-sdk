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
 * {@link QueryDataServiceResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDataServiceResponseBody</p>
 */
public class QueryDataServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryDataServiceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDataServiceResponseBody create() {
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

        private Builder(QueryDataServiceResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>78C1AA2D-9201-599E-A0BA-6FC462E57A95</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returns the result of the interface query.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Possible values:</p>
         * <ul>
         * <li><p>true: The request was successful</p>
         * </li>
         * <li><p>false: The request failed</p>
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

        public QueryDataServiceResponseBody build() {
            return new QueryDataServiceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDataServiceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDataServiceResponseBody</p>
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
             * <p>The alias of the field. The key of the map data row in the result parameter values.</p>
             */
            public Builder column(String column) {
                this.column = column;
                return this;
            }

            /**
             * <p>The data type of the field. Common types include number, string, date, datetime, time, and geographic.</p>
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
             * <li><p>Date granularity: yearRegion (year), monthRegion (month), weekRegion (week), dayRegion (day), hourRegion (hour), minRegion (minute), secRegion (second)</p>
             * </li>
             * <li><p>Geographic granularity: COUNTRY (country level), PROVINCE (province level), CITY (city level), XIAN (district/county level), REGION (region)</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>yearRegion</p>
             */
            public Builder granularity(String granularity) {
                this.granularity = granularity;
                return this;
            }

            /**
             * <p>字段别名，结果参数values中map数据行的key。</p>
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
             * 
             * <strong>example:</strong>
             * <p>StandardDimension</p>
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
     * {@link QueryDataServiceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDataServiceResponseBody</p>
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
             * <p>The SQL of the query request.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT COMPANY_T_1_.<code>area</code> AS D_AREA_2_, COMPANY_T_1_.<code>city</code> AS D_CITY_3_, SUM(COMPANY_T_1_.<code>profit_amt</code>) AS D_PROFIT_4_ FROM <code>quickbi_test</code>.<code>company_sales_record_copy</code> AS COMPANY_T_1_ WHERE COMPANY_T_1_.<code>area</code> LIKE &quot;%华东%&quot; GROUP BY COMPANY_T_1_.<code>area</code>, COMPANY_T_1_.<code>city</code> HAVING SUM(COMPANY_T_1_.<code>order_amt</code>) &gt; 1 LIMIT 0, 10</p>
             */
            public Builder sql(String sql) {
                this.sql = sql;
                return this;
            }

            /**
             * <p>The queried results returned.</p>
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
