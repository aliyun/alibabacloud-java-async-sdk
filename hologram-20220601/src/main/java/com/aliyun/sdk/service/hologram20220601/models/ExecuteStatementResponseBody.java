// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
 * {@link ExecuteStatementResponseBody} extends {@link TeaModel}
 *
 * <p>ExecuteStatementResponseBody</p>
 */
public class ExecuteStatementResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private String success;

    private ExecuteStatementResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteStatementResponseBody create() {
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
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private String httpStatusCode; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(ExecuteStatementResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>819A7F0F-2951-540F-BD94-6A41ECF0281F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public ExecuteStatementResponseBody build() {
            return new ExecuteStatementResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ExecuteStatementResponseBody} extends {@link TeaModel}
     *
     * <p>ExecuteStatementResponseBody</p>
     */
    public static class ColumnMetadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("nullable")
        private Boolean nullable;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private ColumnMetadata(Builder builder) {
            this.name = builder.name;
            this.nullable = builder.nullable;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ColumnMetadata create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nullable
         */
        public Boolean getNullable() {
            return this.nullable;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String name; 
            private Boolean nullable; 
            private String type; 

            private Builder() {
            } 

            private Builder(ColumnMetadata model) {
                this.name = model.name;
                this.nullable = model.nullable;
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
             * nullable.
             */
            public Builder nullable(Boolean nullable) {
                this.nullable = nullable;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ColumnMetadata build() {
                return new ColumnMetadata(this);
            } 

        } 

    }
    /**
     * 
     * {@link ExecuteStatementResponseBody} extends {@link TeaModel}
     *
     * <p>ExecuteStatementResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("columnMetadata")
        private java.util.List<ColumnMetadata> columnMetadata;

        @com.aliyun.core.annotation.NameInMap("count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("errorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("errorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("queryId")
        private String queryId;

        @com.aliyun.core.annotation.NameInMap("records")
        private java.util.List<java.util.List<String>> records;

        @com.aliyun.core.annotation.NameInMap("sql")
        private String sql;

        @com.aliyun.core.annotation.NameInMap("success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("truncated")
        private Boolean truncated;

        @com.aliyun.core.annotation.NameInMap("updateCount")
        private Integer updateCount;

        private Results(Builder builder) {
            this.columnMetadata = builder.columnMetadata;
            this.count = builder.count;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.queryId = builder.queryId;
            this.records = builder.records;
            this.sql = builder.sql;
            this.success = builder.success;
            this.truncated = builder.truncated;
            this.updateCount = builder.updateCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return columnMetadata
         */
        public java.util.List<ColumnMetadata> getColumnMetadata() {
            return this.columnMetadata;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return queryId
         */
        public String getQueryId() {
            return this.queryId;
        }

        /**
         * @return records
         */
        public java.util.List<java.util.List<String>> getRecords() {
            return this.records;
        }

        /**
         * @return sql
         */
        public String getSql() {
            return this.sql;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return truncated
         */
        public Boolean getTruncated() {
            return this.truncated;
        }

        /**
         * @return updateCount
         */
        public Integer getUpdateCount() {
            return this.updateCount;
        }

        public static final class Builder {
            private java.util.List<ColumnMetadata> columnMetadata; 
            private Integer count; 
            private String errorCode; 
            private String errorMessage; 
            private String queryId; 
            private java.util.List<java.util.List<String>> records; 
            private String sql; 
            private Boolean success; 
            private Boolean truncated; 
            private Integer updateCount; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.columnMetadata = model.columnMetadata;
                this.count = model.count;
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.queryId = model.queryId;
                this.records = model.records;
                this.sql = model.sql;
                this.success = model.success;
                this.truncated = model.truncated;
                this.updateCount = model.updateCount;
            } 

            /**
             * columnMetadata.
             */
            public Builder columnMetadata(java.util.List<ColumnMetadata> columnMetadata) {
                this.columnMetadata = columnMetadata;
                return this;
            }

            /**
             * count.
             */
            public Builder count(Integer count) {
                this.count = count;
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
             * errorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p><strong>Query ID</strong></p>
             * 
             * <strong>example:</strong>
             * <p>E3F4B2A7-1234-5678-9ABC-DEF012345678</p>
             */
            public Builder queryId(String queryId) {
                this.queryId = queryId;
                return this;
            }

            /**
             * records.
             */
            public Builder records(java.util.List<java.util.List<String>> records) {
                this.records = records;
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
             * success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * truncated.
             */
            public Builder truncated(Boolean truncated) {
                this.truncated = truncated;
                return this;
            }

            /**
             * updateCount.
             */
            public Builder updateCount(Integer updateCount) {
                this.updateCount = updateCount;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
    /**
     * 
     * {@link ExecuteStatementResponseBody} extends {@link TeaModel}
     *
     * <p>ExecuteStatementResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("errorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("errorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("results")
        private java.util.List<Results> results;

        @com.aliyun.core.annotation.NameInMap("success")
        private Boolean success;

        private Data(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.results = builder.results;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return results
         */
        public java.util.List<Results> getResults() {
            return this.results;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 
            private java.util.List<Results> results; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.results = model.results;
                this.success = model.success;
            } 

            /**
             * errorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * errorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * results.
             */
            public Builder results(java.util.List<Results> results) {
                this.results = results;
                return this;
            }

            /**
             * success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
