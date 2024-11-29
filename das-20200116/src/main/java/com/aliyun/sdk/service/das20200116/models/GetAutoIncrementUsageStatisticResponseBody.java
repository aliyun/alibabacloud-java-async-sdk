// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetAutoIncrementUsageStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>GetAutoIncrementUsageStatisticResponseBody</p>
 */
public class GetAutoIncrementUsageStatisticResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetAutoIncrementUsageStatisticResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAutoIncrementUsageStatisticResponseBody create() {
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <blockquote>
         * <p> If the request is successful, <strong>Successful</strong> is returned. Otherwise, an error message such as an error code is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0A74B755-98B7-59DB-8724-1321B394****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAutoIncrementUsageStatisticResponseBody build() {
            return new GetAutoIncrementUsageStatisticResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAutoIncrementUsageStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>GetAutoIncrementUsageStatisticResponseBody</p>
     */
    public static class AutoIncrementUsageList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoIncrementCurrentValue")
        private Long autoIncrementCurrentValue;

        @com.aliyun.core.annotation.NameInMap("AutoIncrementRatio")
        private Double autoIncrementRatio;

        @com.aliyun.core.annotation.NameInMap("ColumnName")
        private String columnName;

        @com.aliyun.core.annotation.NameInMap("DbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("MaximumValue")
        private Long maximumValue;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private AutoIncrementUsageList(Builder builder) {
            this.autoIncrementCurrentValue = builder.autoIncrementCurrentValue;
            this.autoIncrementRatio = builder.autoIncrementRatio;
            this.columnName = builder.columnName;
            this.dbName = builder.dbName;
            this.maximumValue = builder.maximumValue;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoIncrementUsageList create() {
            return builder().build();
        }

        /**
         * @return autoIncrementCurrentValue
         */
        public Long getAutoIncrementCurrentValue() {
            return this.autoIncrementCurrentValue;
        }

        /**
         * @return autoIncrementRatio
         */
        public Double getAutoIncrementRatio() {
            return this.autoIncrementRatio;
        }

        /**
         * @return columnName
         */
        public String getColumnName() {
            return this.columnName;
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
        }

        /**
         * @return maximumValue
         */
        public Long getMaximumValue() {
            return this.maximumValue;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private Long autoIncrementCurrentValue; 
            private Double autoIncrementRatio; 
            private String columnName; 
            private String dbName; 
            private Long maximumValue; 
            private String tableName; 

            /**
             * <p>The latest auto-increment ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2147483647</p>
             */
            public Builder autoIncrementCurrentValue(Long autoIncrementCurrentValue) {
                this.autoIncrementCurrentValue = autoIncrementCurrentValue;
                return this;
            }

            /**
             * <p>The usage ratio of auto-increment IDs.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder autoIncrementRatio(Double autoIncrementRatio) {
                this.autoIncrementRatio = autoIncrementRatio;
                return this;
            }

            /**
             * <p>The column name.</p>
             * 
             * <strong>example:</strong>
             * <p>id</p>
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * <p>The database name.</p>
             * 
             * <strong>example:</strong>
             * <p>db01</p>
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * <p>The maximum auto-increment ID that is supported by the current data type.</p>
             * 
             * <strong>example:</strong>
             * <p>2147483647</p>
             */
            public Builder maximumValue(Long maximumValue) {
                this.maximumValue = maximumValue;
                return this;
            }

            /**
             * <p>The table name.</p>
             * 
             * <strong>example:</strong>
             * <p>test_table</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public AutoIncrementUsageList build() {
                return new AutoIncrementUsageList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAutoIncrementUsageStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>GetAutoIncrementUsageStatisticResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoIncrementUsageList")
        private java.util.List < AutoIncrementUsageList> autoIncrementUsageList;

        @com.aliyun.core.annotation.NameInMap("ErrorInfo")
        private String errorInfo;

        @com.aliyun.core.annotation.NameInMap("Finish")
        private Boolean finish;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private String taskStatus;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        private Data(Builder builder) {
            this.autoIncrementUsageList = builder.autoIncrementUsageList;
            this.errorInfo = builder.errorInfo;
            this.finish = builder.finish;
            this.taskStatus = builder.taskStatus;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return autoIncrementUsageList
         */
        public java.util.List < AutoIncrementUsageList> getAutoIncrementUsageList() {
            return this.autoIncrementUsageList;
        }

        /**
         * @return errorInfo
         */
        public String getErrorInfo() {
            return this.errorInfo;
        }

        /**
         * @return finish
         */
        public Boolean getFinish() {
            return this.finish;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private java.util.List < AutoIncrementUsageList> autoIncrementUsageList; 
            private String errorInfo; 
            private Boolean finish; 
            private String taskStatus; 
            private Long timestamp; 

            /**
             * <p>The usage details of auto-increment IDs.</p>
             */
            public Builder autoIncrementUsageList(java.util.List < AutoIncrementUsageList> autoIncrementUsageList) {
                this.autoIncrementUsageList = autoIncrementUsageList;
                return this;
            }

            /**
             * <p>The error message returned if the task fails.</p>
             * 
             * <strong>example:</strong>
             * <p>the given database name list invalid, none of the database names in the list exist on the instance</p>
             */
            public Builder errorInfo(String errorInfo) {
                this.errorInfo = errorInfo;
                return this;
            }

            /**
             * <p>Indicates whether the task is complete. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder finish(Boolean finish) {
                this.finish = finish;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li><strong>INIT</strong>: The task is being initialized.</li>
             * <li><strong>RUNNING</strong>: The task is being executed.</li>
             * <li><strong>SUCCESS</strong>: The task succeeds.</li>
             * <li><strong>FAIL</strong>: The task fails.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>INIT</p>
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * <p>The time when the request was made. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1697183353000</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
