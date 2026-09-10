// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link StatementResult} extends {@link TeaModel}
 *
 * <p>StatementResult</p>
 */
public class StatementResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("downloadUrl")
    private String downloadUrl;

    @com.aliyun.core.annotation.NameInMap("error")
    private String error;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("executionTime")
    private Long executionTime;

    @com.aliyun.core.annotation.NameInMap("index")
    private Integer index;

    @com.aliyun.core.annotation.NameInMap("rowCount")
    private Integer rowCount;

    @com.aliyun.core.annotation.NameInMap("schema")
    private java.util.List<Schema> schema;

    @com.aliyun.core.annotation.NameInMap("sql")
    private String sql;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private StatementResult(Builder builder) {
        this.downloadUrl = builder.downloadUrl;
        this.error = builder.error;
        this.errorCode = builder.errorCode;
        this.executionTime = builder.executionTime;
        this.index = builder.index;
        this.rowCount = builder.rowCount;
        this.schema = builder.schema;
        this.sql = builder.sql;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StatementResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return downloadUrl
     */
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    /**
     * @return error
     */
    public String getError() {
        return this.error;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return executionTime
     */
    public Long getExecutionTime() {
        return this.executionTime;
    }

    /**
     * @return index
     */
    public Integer getIndex() {
        return this.index;
    }

    /**
     * @return rowCount
     */
    public Integer getRowCount() {
        return this.rowCount;
    }

    /**
     * @return schema
     */
    public java.util.List<Schema> getSchema() {
        return this.schema;
    }

    /**
     * @return sql
     */
    public String getSql() {
        return this.sql;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String downloadUrl; 
        private String error; 
        private String errorCode; 
        private Long executionTime; 
        private Integer index; 
        private Integer rowCount; 
        private java.util.List<Schema> schema; 
        private String sql; 
        private String status; 

        private Builder() {
        } 

        private Builder(StatementResult model) {
            this.downloadUrl = model.downloadUrl;
            this.error = model.error;
            this.errorCode = model.errorCode;
            this.executionTime = model.executionTime;
            this.index = model.index;
            this.rowCount = model.rowCount;
            this.schema = model.schema;
            this.sql = model.sql;
            this.status = model.status;
        } 

        /**
         * <p>The presigned URL of the Arrow IPC file. This parameter is returned when a result set exists. The URL is valid for 1 hour and contains full data. The value is null for an empty result set (rowCount == 0).</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxx.oss-cn-hangzhou.aliyuncs.com/xxxx">https://xxx.oss-cn-hangzhou.aliyuncs.com/xxxx</a></p>
         */
        public Builder downloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }

        /**
         * <p>The error message. This parameter is returned only when the status is FAILED.</p>
         * 
         * <strong>example:</strong>
         * <p>SQL_ERROR</p>
         */
        public Builder error(String error) {
            this.error = error;
            return this;
        }

        /**
         * <p>The error code. This parameter is returned only when the status is FAILED.</p>
         * 
         * <strong>example:</strong>
         * <p>This feature is not implemented: xxx</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The execution duration of the statement, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder executionTime(Long executionTime) {
            this.executionTime = executionTime;
            return this;
        }

        /**
         * <p>The statement sequence number (0-based).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder index(Integer index) {
            this.index = index;
            return this;
        }

        /**
         * <p>The total number of rows in the result. The value is 0 for statements that do not return a result set.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder rowCount(Integer rowCount) {
            this.rowCount = rowCount;
            return this;
        }

        /**
         * <p>The result column information. This parameter is returned when a result set exists.</p>
         */
        public Builder schema(java.util.List<Schema> schema) {
            this.schema = schema;
            return this;
        }

        /**
         * <p>The SQL text of the statement.</p>
         * 
         * <strong>example:</strong>
         * <p>select * from table_name;</p>
         */
        public Builder sql(String sql) {
            this.sql = sql;
            return this;
        }

        /**
         * <p>The status of the statement. Valid values: COMPLETED and FAILED.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public StatementResult build() {
            return new StatementResult(this);
        } 

    } 

    /**
     * 
     * {@link StatementResult} extends {@link TeaModel}
     *
     * <p>StatementResult</p>
     */
    public static class Schema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Schema(Builder builder) {
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Schema create() {
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

        public static final class Builder {
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(Schema model) {
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * <p>The column name.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The data type.</p>
             * 
             * <strong>example:</strong>
             * <p>string</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Schema build() {
                return new Schema(this);
            } 

        } 

    }
}
