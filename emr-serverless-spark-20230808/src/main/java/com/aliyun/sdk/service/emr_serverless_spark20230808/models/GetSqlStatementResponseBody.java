// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSqlStatementResponseBody} extends {@link TeaModel}
 *
 * <p>GetSqlStatementResponseBody</p>
 */
public class GetSqlStatementResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetSqlStatementResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSqlStatementResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSqlStatementResponseBody build() {
            return new GetSqlStatementResponseBody(this);
        } 

    } 

    public static class SqlOutputs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("rows")
        private String rows;

        @com.aliyun.core.annotation.NameInMap("schema")
        private String schema;

        private SqlOutputs(Builder builder) {
            this.rows = builder.rows;
            this.schema = builder.schema;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SqlOutputs create() {
            return builder().build();
        }

        /**
         * @return rows
         */
        public String getRows() {
            return this.rows;
        }

        /**
         * @return schema
         */
        public String getSchema() {
            return this.schema;
        }

        public static final class Builder {
            private String rows; 
            private String schema; 

            /**
             * rows.
             */
            public Builder rows(String rows) {
                this.rows = rows;
                return this;
            }

            /**
             * schema.
             */
            public Builder schema(String schema) {
                this.schema = schema;
                return this;
            }

            public SqlOutputs build() {
                return new SqlOutputs(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("executionTime")
        private java.util.List < Long > executionTime;

        @com.aliyun.core.annotation.NameInMap("sqlErrorCode")
        private String sqlErrorCode;

        @com.aliyun.core.annotation.NameInMap("sqlErrorMessage")
        private String sqlErrorMessage;

        @com.aliyun.core.annotation.NameInMap("sqlOutputs")
        private java.util.List < SqlOutputs> sqlOutputs;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        @com.aliyun.core.annotation.NameInMap("statementId")
        private String statementId;

        private Data(Builder builder) {
            this.executionTime = builder.executionTime;
            this.sqlErrorCode = builder.sqlErrorCode;
            this.sqlErrorMessage = builder.sqlErrorMessage;
            this.sqlOutputs = builder.sqlOutputs;
            this.state = builder.state;
            this.statementId = builder.statementId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return executionTime
         */
        public java.util.List < Long > getExecutionTime() {
            return this.executionTime;
        }

        /**
         * @return sqlErrorCode
         */
        public String getSqlErrorCode() {
            return this.sqlErrorCode;
        }

        /**
         * @return sqlErrorMessage
         */
        public String getSqlErrorMessage() {
            return this.sqlErrorMessage;
        }

        /**
         * @return sqlOutputs
         */
        public java.util.List < SqlOutputs> getSqlOutputs() {
            return this.sqlOutputs;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return statementId
         */
        public String getStatementId() {
            return this.statementId;
        }

        public static final class Builder {
            private java.util.List < Long > executionTime; 
            private String sqlErrorCode; 
            private String sqlErrorMessage; 
            private java.util.List < SqlOutputs> sqlOutputs; 
            private String state; 
            private String statementId; 

            /**
             * executionTime.
             */
            public Builder executionTime(java.util.List < Long > executionTime) {
                this.executionTime = executionTime;
                return this;
            }

            /**
             * sqlErrorCode.
             */
            public Builder sqlErrorCode(String sqlErrorCode) {
                this.sqlErrorCode = sqlErrorCode;
                return this;
            }

            /**
             * sqlErrorMessage.
             */
            public Builder sqlErrorMessage(String sqlErrorMessage) {
                this.sqlErrorMessage = sqlErrorMessage;
                return this;
            }

            /**
             * sqlOutputs.
             */
            public Builder sqlOutputs(java.util.List < SqlOutputs> sqlOutputs) {
                this.sqlOutputs = sqlOutputs;
                return this;
            }

            /**
             * state.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * statementId.
             */
            public Builder statementId(String statementId) {
                this.statementId = statementId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
