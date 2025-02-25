// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidateDataSourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ValidateDataSourcesResponseBody</p>
 */
public class ValidateDataSourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List < Result> result;

    private ValidateDataSourcesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateDataSourcesResponseBody create() {
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
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The result returned.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ValidateDataSourcesResponseBody build() {
            return new ValidateDataSourcesResponseBody(this);
        } 

    } 

    public static class DataSource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("parameters")
        private java.util.Map < String, ? > parameters;

        @com.aliyun.core.annotation.NameInMap("tableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private DataSource(Builder builder) {
            this.parameters = builder.parameters;
            this.tableName = builder.tableName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSource create() {
            return builder().build();
        }

        /**
         * @return parameters
         */
        public java.util.Map < String, ? > getParameters() {
            return this.parameters;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.Map < String, ? > parameters; 
            private String tableName; 
            private String type; 

            /**
             * The parameters of the data source.
             */
            public Builder parameters(java.util.Map < String, ? > parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * The name of the table.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * The type of the data source.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DataSource build() {
                return new DataSource(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("dataSource")
        private DataSource dataSource;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        private Result(Builder builder) {
            this.code = builder.code;
            this.dataSource = builder.dataSource;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return dataSource
         */
        public DataSource getDataSource() {
            return this.dataSource;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String code; 
            private DataSource dataSource; 
            private String message; 

            /**
             * The code returned for the request.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The data source.
             */
            public Builder dataSource(DataSource dataSource) {
                this.dataSource = dataSource;
                return this;
            }

            /**
             * The status of the execution.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
