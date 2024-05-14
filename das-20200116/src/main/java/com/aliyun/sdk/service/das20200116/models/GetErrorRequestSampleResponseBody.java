// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetErrorRequestSampleResponseBody} extends {@link TeaModel}
 *
 * <p>GetErrorRequestSampleResponseBody</p>
 */
public class GetErrorRequestSampleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetErrorRequestSampleResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetErrorRequestSampleResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code returned.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         * <p>
         * 
         * >  If the request was successful, **Successful** is returned. If the request failed, an error message such as an error code is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetErrorRequestSampleResponseBody build() {
            return new GetErrorRequestSampleResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("database")
        private String database;

        @com.aliyun.core.annotation.NameInMap("errorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("originHost")
        private String originHost;

        @com.aliyun.core.annotation.NameInMap("sql")
        private String sql;

        @com.aliyun.core.annotation.NameInMap("sqlId")
        private String sqlId;

        @com.aliyun.core.annotation.NameInMap("tables")
        private java.util.List < String > tables;

        @com.aliyun.core.annotation.NameInMap("timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("user")
        private String user;

        private Data(Builder builder) {
            this.database = builder.database;
            this.errorCode = builder.errorCode;
            this.instanceId = builder.instanceId;
            this.originHost = builder.originHost;
            this.sql = builder.sql;
            this.sqlId = builder.sqlId;
            this.tables = builder.tables;
            this.timestamp = builder.timestamp;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return database
         */
        public String getDatabase() {
            return this.database;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return originHost
         */
        public String getOriginHost() {
            return this.originHost;
        }

        /**
         * @return sql
         */
        public String getSql() {
            return this.sql;
        }

        /**
         * @return sqlId
         */
        public String getSqlId() {
            return this.sqlId;
        }

        /**
         * @return tables
         */
        public java.util.List < String > getTables() {
            return this.tables;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private String database; 
            private String errorCode; 
            private String instanceId; 
            private String originHost; 
            private String sql; 
            private String sqlId; 
            private java.util.List < String > tables; 
            private Long timestamp; 
            private String user; 

            /**
             * The database name.
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * The error code that is returned.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The IP address of the client that executes the SQL statement.
             */
            public Builder originHost(String originHost) {
                this.originHost = originHost;
                return this;
            }

            /**
             * The SQL statement.
             */
            public Builder sql(String sql) {
                this.sql = sql;
                return this;
            }

            /**
             * The SQL query ID.
             */
            public Builder sqlId(String sqlId) {
                this.sqlId = sqlId;
                return this;
            }

            /**
             * The table information.
             */
            public Builder tables(java.util.List < String > tables) {
                this.tables = tables;
                return this;
            }

            /**
             * The time when the SQL query was executed. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * The username of the account that is used to log on to the database.
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
