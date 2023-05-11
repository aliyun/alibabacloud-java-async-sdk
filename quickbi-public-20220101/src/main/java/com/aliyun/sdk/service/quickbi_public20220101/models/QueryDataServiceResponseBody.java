// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDataServiceResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDataServiceResponseBody</p>
 */
public class QueryDataServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
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

        /**
         * The list of parameter names of the returned parameters. The value is a string of the List type.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * *   true: The request was successful.
         * *   false: The request failed.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * { "area": \["East China", "North China"], "shopping_date": "2019Q1", }
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryDataServiceResponseBody build() {
            return new QueryDataServiceResponseBody(this);
        } 

    } 

    public static class Headers extends TeaModel {
        @NameInMap("Aggregator")
        private String aggregator;

        @NameInMap("Column")
        private String column;

        @NameInMap("DataType")
        private String dataType;

        @NameInMap("Granularity")
        private String granularity;

        @NameInMap("Label")
        private String label;

        @NameInMap("Type")
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

            /**
             * The field name, which corresponds to the physical table field name.
             */
            public Builder aggregator(String aggregator) {
                this.aggregator = aggregator;
                return this;
            }

            /**
             * The granularity of the dimension field. This field is returned only when the requested field is a date dimension or a geographical dimension. Valid values:
             * <p>
             * 
             * *   Date granularity: yearRegion (year), monthRegion (month), weekRegion (week), dayRegion (day), hourRegion (hour), minRegion (minute), secRegion (second)
             * *   Geographic information granularity: COUNTRY (international level), PROVINCE (provincial level), CITY (municipal level), XIAN (district /county), and REGION (regional level)
             */
            public Builder column(String column) {
                this.column = column;
                return this;
            }

            /**
             * The column header.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * The field type, which is used to distinguish whether the field type is a dimension or a measure.
             */
            public Builder granularity(String granularity) {
                this.granularity = granularity;
                return this;
            }

            /**
             * The data type of the field. generally have number, string, date, datetime, time, and geographic.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * SELECT COMPANY_T\_1\_.\"area\" AS D_AREA\_2\_, COMPANY_T\_1\_.\"city\" AS D_CITY\_3\_, SUM(COMPANY_T\_1\_.\"profit_amt\") AS D_PROFIT\_4\_ FROM \"quickbi_test\".\"company_sales_record_copy\" AS COMPANY_T\_1\_ WHERE COMPANY_T\_1\_.\"area\" LIKE \"% China East %\" GROUP BY COMPANY_T\_1\_.\"area\", COMPANY_T\_1\_.\"city\" HAVING SUM(COMPANY_T\_1\_.\"order_amt\") > 1 LIMIT 0,10
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
    public static class Result extends TeaModel {
        @NameInMap("Headers")
        private java.util.List < Headers> headers;

        @NameInMap("Sql")
        private String sql;

        @NameInMap("Values")
        private java.util.List < java.util.Map<String, ?>> values;

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
        public java.util.List < Headers> getHeaders() {
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
        public java.util.List < java.util.Map<String, ?>> getValues() {
            return this.values;
        }

        public static final class Builder {
            private java.util.List < Headers> headers; 
            private String sql; 
            private java.util.List < java.util.Map<String, ?>> values; 

            /**
             * The SQL of the request query.
             */
            public Builder headers(java.util.List < Headers> headers) {
                this.headers = headers;
                return this;
            }

            /**
             * The ID of the request.
             */
            public Builder sql(String sql) {
                this.sql = sql;
                return this;
            }

            /**
             * Physical Field Name
             */
            public Builder values(java.util.List < java.util.Map<String, ?>> values) {
                this.values = values;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
