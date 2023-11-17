// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRequestDiagnosisPageResponseBody} extends {@link TeaModel}
 *
 * <p>GetRequestDiagnosisPageResponseBody</p>
 */
public class GetRequestDiagnosisPageResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    private GetRequestDiagnosisPageResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRequestDiagnosisPageResponseBody create() {
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
         * >  If the request was successful, Successful is returned. If the request failed, an error message that contains information such as an error code is returned.
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

        public GetRequestDiagnosisPageResponseBody build() {
            return new GetRequestDiagnosisPageResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("accountId")
        private String accountId;

        @NameInMap("dbSchema")
        private String dbSchema;

        @NameInMap("engine")
        private String engine;

        @NameInMap("gmtCreate")
        private String gmtCreate;

        @NameInMap("gmtModified")
        private String gmtModified;

        @NameInMap("messageId")
        private String messageId;

        @NameInMap("param")
        private String param;

        @NameInMap("result")
        private String result;

        @NameInMap("sqlId")
        private String sqlId;

        @NameInMap("state")
        private Integer state;

        @NameInMap("uuid")
        private String uuid;

        private List(Builder builder) {
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

        public static List create() {
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
             * * **MySQL**
             * * **PostgreSQL**
             * * **SQLServer**
             * * **PolarDBMySQL**
             * * **PolarDBOracle**
             * * **MongoDB**
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * The time when the SQL diagnostics task was created. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
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
             * Additional information.
             */
            public Builder param(String param) {
                this.param = param;
                return this;
            }

            /**
             * The result of the SQL diagnostics task. The result includes the following information:
             * <p>
             * 
             * * **endTime**: the end time of the SQL diagnostics task.
             * * **errorCode**: indicates whether the SQL diagnostics task is complete. Valid values:
             *   * **0001**: The SQL diagnostics task is complete.
             *   * **0003**: The SQL diagnostics task failed.
             * 
             * * **errorMessage**: the error message.
             * * **estimateCost**: the estimated cost.
             *   * **cpu**: the estimated CPU utilization of the index.
             *   * **io**: the estimated I/O usage of the index.
             *   * **rows**: the estimated values of the rows returned for the index.
             * * **improvement**: the performance improvement ratio.
             * * **indexAdvices**: the index recommendations, which include the following information:
             *   * **columns**: the index columns.
             *   * **ddlAddIndex**: the DDL statement for the index.
             *   * **indexName**: the name of the index.
             *   * **schemaName**: the name of the database.
             *   * **tableName**: the name of the table.
             *   * **unique**: indicates whether the index is unique.
             * 
             * * **ip**: the IP address of the instance.
             * * **messageId**: the ID of the diagnostics task.
             * * **port**: the port used to connect to the instance.
             * * **sqlTag**: the SQL tag.
             * * **startTime**: the start time of the SQL diagnostics task.
             * * **success**: indicates whether the request was successful.
             * * **support**: indicates whether the SQL statement can be diagnosed. Valid values:
             *   * **true**: The SQL statement can be diagnosed.
             *   * **false**: The SQL statement cannot be diagnosed.
             * 
             * * **tuningAdvices**: the SQL rewrite suggestions.
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
             * The status of the diagnostics task. Valid values:
             * <p>
             * 
             * * **0**: The diagnostics task is in progress.
             * 
             * * **1**: A diagnostics error occurred.
             * 
             * * **2**: The diagnostics task is complete.
             * 
             * * **3**: An SQL error occurred.
             * 
             * * **4**: An engine error occurred.
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

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("extra")
        private String extra;

        @NameInMap("list")
        private java.util.List < List> list;

        @NameInMap("pageNo")
        private Long pageNo;

        @NameInMap("pageSize")
        private Long pageSize;

        @NameInMap("total")
        private Long total;

        private Data(Builder builder) {
            this.extra = builder.extra;
            this.list = builder.list;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return extra
         */
        public String getExtra() {
            return this.extra;
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return pageNo
         */
        public Long getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private String extra; 
            private java.util.List < List> list; 
            private Long pageNo; 
            private Long pageSize; 
            private Long total; 

            /**
             * Additional information.
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * The SQL diagnostics records returned.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * The page number. The value must be a positive integer. Default value: 1.
             */
            public Builder pageNo(Long pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * The number of entries per page. The value must be a positive integer. Default value: 10.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of returned entries.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
