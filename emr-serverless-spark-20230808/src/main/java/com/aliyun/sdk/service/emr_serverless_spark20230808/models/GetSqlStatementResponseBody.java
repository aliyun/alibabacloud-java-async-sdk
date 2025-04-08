// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetSqlStatementResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response parameters.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSqlStatementResponseBody build() {
            return new GetSqlStatementResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSqlStatementResponseBody} extends {@link TeaModel}
     *
     * <p>GetSqlStatementResponseBody</p>
     */
    public static class SqlOutputs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("rows")
        private String rows;

        @com.aliyun.core.annotation.NameInMap("rowsFilePath")
        private String rowsFilePath;

        @com.aliyun.core.annotation.NameInMap("schema")
        private String schema;

        private SqlOutputs(Builder builder) {
            this.rows = builder.rows;
            this.rowsFilePath = builder.rowsFilePath;
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
         * @return rowsFilePath
         */
        public String getRowsFilePath() {
            return this.rowsFilePath;
        }

        /**
         * @return schema
         */
        public String getSchema() {
            return this.schema;
        }

        public static final class Builder {
            private String rows; 
            private String rowsFilePath; 
            private String schema; 

            private Builder() {
            } 

            private Builder(SqlOutputs model) {
                this.rows = model.rows;
                this.rowsFilePath = model.rowsFilePath;
                this.schema = model.schema;
            } 

            /**
             * <p>The queried data, which is a string in the JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;values&quot;:[&quot;test_db&quot;,&quot;test_table&quot;,false]}</p>
             */
            public Builder rows(String rows) {
                this.rows = rows;
                return this;
            }

            /**
             * rowsFilePath.
             */
            public Builder rowsFilePath(String rowsFilePath) {
                this.rowsFilePath = rowsFilePath;
                return this;
            }

            /**
             * <p>The information about the schema, which is a string in the JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;type&quot;:&quot;struct&quot;,&quot;fields&quot;:[{&quot;name&quot;:&quot;namespace&quot;,&quot;type&quot;:&quot;string&quot;,&quot;nullable&quot;:false,&quot;metadata&quot;:{}},{&quot;name&quot;:&quot;tableName&quot;,&quot;type&quot;:&quot;string&quot;,&quot;nullable&quot;:false,&quot;metadata&quot;:{}},{&quot;name&quot;:&quot;isTemporary&quot;,&quot;type&quot;:&quot;boolean&quot;,&quot;nullable&quot;:false,&quot;metadata&quot;:{}}]}</p>
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
    /**
     * 
     * {@link GetSqlStatementResponseBody} extends {@link TeaModel}
     *
     * <p>GetSqlStatementResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("executionTime")
        private java.util.List<Long> executionTime;

        @com.aliyun.core.annotation.NameInMap("sqlErrorCode")
        private String sqlErrorCode;

        @com.aliyun.core.annotation.NameInMap("sqlErrorMessage")
        private String sqlErrorMessage;

        @com.aliyun.core.annotation.NameInMap("sqlOutputs")
        private java.util.List<SqlOutputs> sqlOutputs;

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
        public java.util.List<Long> getExecutionTime() {
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
        public java.util.List<SqlOutputs> getSqlOutputs() {
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
            private java.util.List<Long> executionTime; 
            private String sqlErrorCode; 
            private String sqlErrorMessage; 
            private java.util.List<SqlOutputs> sqlOutputs; 
            private String state; 
            private String statementId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.executionTime = model.executionTime;
                this.sqlErrorCode = model.sqlErrorCode;
                this.sqlErrorMessage = model.sqlErrorMessage;
                this.sqlOutputs = model.sqlOutputs;
                this.state = model.state;
                this.statementId = model.statementId;
            } 

            /**
             * <p>The list of time that is consumed by SQL queries.</p>
             */
            public Builder executionTime(java.util.List<Long> executionTime) {
                this.executionTime = executionTime;
                return this;
            }

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>ERROR-102</p>
             */
            public Builder sqlErrorCode(String sqlErrorCode) {
                this.sqlErrorCode = sqlErrorCode;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>error message</p>
             */
            public Builder sqlErrorMessage(String sqlErrorMessage) {
                this.sqlErrorMessage = sqlErrorMessage;
                return this;
            }

            /**
             * <p>The query results.</p>
             */
            public Builder sqlOutputs(java.util.List<SqlOutputs> sqlOutputs) {
                this.sqlOutputs = sqlOutputs;
                return this;
            }

            /**
             * <p>The query status.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>running</li>
             * <li>available</li>
             * <li>cancelled</li>
             * <li>error</li>
             * <li>cancelling</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The query ID.</p>
             * 
             * <strong>example:</strong>
             * <p>st-1231311abadfaa</p>
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
