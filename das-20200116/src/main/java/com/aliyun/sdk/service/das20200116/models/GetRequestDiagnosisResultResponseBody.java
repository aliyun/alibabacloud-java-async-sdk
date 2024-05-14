// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRequestDiagnosisResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetRequestDiagnosisResultResponseBody</p>
 */
public class GetRequestDiagnosisResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private GetRequestDiagnosisResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRequestDiagnosisResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * The HTTP status code returned.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         * <p>
         * 
         * >  If the request was successful, Successful is returned. If the request failed, an error message such as an error code is returned.
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
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetRequestDiagnosisResultResponseBody build() {
            return new GetRequestDiagnosisResultResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("dbSchema")
        private String dbSchema;

        @com.aliyun.core.annotation.NameInMap("engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("messageId")
        private String messageId;

        @com.aliyun.core.annotation.NameInMap("param")
        private String param;

        @com.aliyun.core.annotation.NameInMap("result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("sqlId")
        private String sqlId;

        @com.aliyun.core.annotation.NameInMap("state")
        private Integer state;

        @com.aliyun.core.annotation.NameInMap("uuid")
        private String uuid;

        private Data(Builder builder) {
            this.accountId = builder.accountId;
            this.dbSchema = builder.dbSchema;
            this.engine = builder.engine;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.messageId = builder.messageId;
            this.param = builder.param;
            this.result = builder.result;
            this.sqlId = builder.sqlId;
            this.state = builder.state;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return dbSchema
         */
        public String getDbSchema() {
            return this.dbSchema;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return messageId
         */
        public String getMessageId() {
            return this.messageId;
        }

        /**
         * @return param
         */
        public String getParam() {
            return this.param;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return sqlId
         */
        public String getSqlId() {
            return this.sqlId;
        }

        /**
         * @return state
         */
        public Integer getState() {
            return this.state;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String accountId; 
            private String dbSchema; 
            private String engine; 
            private String gmtCreate; 
            private String gmtModified; 
            private String messageId; 
            private String param; 
            private String result; 
            private String sqlId; 
            private Integer state; 
            private String uuid; 

            /**
             * The user ID.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder dbSchema(String dbSchema) {
                this.dbSchema = dbSchema;
                return this;
            }

            /**
             * The database engine. Valid values:
             * <p>
             * 
             * *   **MySQL**
             * *   **PostgreSQL**
             * *   **SQLServer**
             * *   **PolarDBMySQL**
             * *   **PolarDBOracle**
             * *   **MongoDB**
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * The time when the SQL diagnostics task was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The time when the SQL diagnostics task was modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The unique ID of the diagnostics task.
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
                return this;
            }

            /**
             * The additional information.
             */
            public Builder param(String param) {
                this.param = param;
                return this;
            }

            /**
             * The result of the SQL diagnostics task. The result includes the following information:
             * <p>
             * 
             * *   **endTime**: the end time of the SQL diagnostics task.
             * 
             * *   **errorCode**: the error code.
             * 
             *     *   **0001**: The SQL diagnostics task is complete.
             *     *   **0003**: The SQL diagnostics task failed.
             * 
             * *   **errorMessage**: the error message.
             * 
             * *   **estimateCost**: the estimated cost.
             * 
             *     *   **cpu**: the estimated CPU utilization of the index.
             *     *   **io**: the estimated I/O usage of the index.
             *     *   **rows**: the estimated values of the rows returned for the index.
             * 
             * *   **improvement**: the performance improvement ratio.
             * 
             * *   **indexAdvices**: the index recommendations, which include the following information:
             * 
             *     *   **columns**: the index columns.
             *     *   **ddlAddIndex**: the DDL statement for the index.
             *     *   **indexName**: the name of the index.
             *     *   **schemaName**: the name of the database.
             *     *   **tableName**: the name of the table.
             *     *   **unique**: indicates whether the index is unique.
             * 
             * *   **ip**: the IP address of the instance.
             * 
             * *   **messageId**: the ID of the diagnostics task.
             * 
             * *   **port**: the port used to connect to the instance.
             * 
             * *   **sqlTag**: the SQL tag.
             * 
             * *   **startTime**: the start time of the SQL diagnostics task.
             * 
             * *   **success**: indicates whether the request was successful.
             * 
             * *   **support**: indicates whether the SQL statement can be diagnosed. Valid values:
             * 
             *     *   **true**
             *     *   **false**
             * 
             * *   **tuningAdvices** : the SQL rewrite suggestions.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * The SQL template ID.
             */
            public Builder sqlId(String sqlId) {
                this.sqlId = sqlId;
                return this;
            }

            /**
             * The state of the diagnostics task. Valid values:
             * <p>
             * 
             * *   **0**: The diagnostics task is in progress.
             * *   **1**: A diagnostics error occurred.
             * *   **2**: The diagnostics task is complete.
             * *   **3**: An SQL error occurred.
             * *   **4**: An engine error occurred.
             */
            public Builder state(Integer state) {
                this.state = state;
                return this;
            }

            /**
             * The unique ID of the diagnostics instance.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
