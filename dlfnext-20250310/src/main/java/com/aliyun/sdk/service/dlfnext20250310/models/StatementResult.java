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
         * downloadUrl.
         */
        public Builder downloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }

        /**
         * error.
         */
        public Builder error(String error) {
            this.error = error;
            return this;
        }

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * executionTime.
         */
        public Builder executionTime(Long executionTime) {
            this.executionTime = executionTime;
            return this;
        }

        /**
         * index.
         */
        public Builder index(Integer index) {
            this.index = index;
            return this;
        }

        /**
         * rowCount.
         */
        public Builder rowCount(Integer rowCount) {
            this.rowCount = rowCount;
            return this;
        }

        /**
         * schema.
         */
        public Builder schema(java.util.List<Schema> schema) {
            this.schema = schema;
            return this;
        }

        /**
         * sql.
         */
        public Builder sql(String sql) {
            this.sql = sql;
            return this;
        }

        /**
         * status.
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
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * type.
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
