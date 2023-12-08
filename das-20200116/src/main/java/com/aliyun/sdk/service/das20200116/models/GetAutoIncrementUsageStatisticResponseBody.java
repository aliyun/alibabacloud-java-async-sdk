// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAutoIncrementUsageStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>GetAutoIncrementUsageStatisticResponseBody</p>
 */
public class GetAutoIncrementUsageStatisticResponseBody extends TeaModel {
    @NameInMap("Code")
    private Long code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * Code.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAutoIncrementUsageStatisticResponseBody build() {
            return new GetAutoIncrementUsageStatisticResponseBody(this);
        } 

    } 

    public static class AutoIncrementUsageList extends TeaModel {
        @NameInMap("AutoIncrementCurrentValue")
        private Long autoIncrementCurrentValue;

        @NameInMap("AutoIncrementRatio")
        private Double autoIncrementRatio;

        @NameInMap("ColumnName")
        private String columnName;

        @NameInMap("DbName")
        private String dbName;

        @NameInMap("MaximumValue")
        private Long maximumValue;

        @NameInMap("TableName")
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
             * AutoIncrementCurrentValue.
             */
            public Builder autoIncrementCurrentValue(Long autoIncrementCurrentValue) {
                this.autoIncrementCurrentValue = autoIncrementCurrentValue;
                return this;
            }

            /**
             * AutoIncrementRatio.
             */
            public Builder autoIncrementRatio(Double autoIncrementRatio) {
                this.autoIncrementRatio = autoIncrementRatio;
                return this;
            }

            /**
             * ColumnName.
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * DbName.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * MaximumValue.
             */
            public Builder maximumValue(Long maximumValue) {
                this.maximumValue = maximumValue;
                return this;
            }

            /**
             * TableName.
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
    public static class Data extends TeaModel {
        @NameInMap("AutoIncrementUsageList")
        private java.util.List < AutoIncrementUsageList> autoIncrementUsageList;

        @NameInMap("ErrorInfo")
        private String errorInfo;

        @NameInMap("Finish")
        private Boolean finish;

        @NameInMap("TaskStatus")
        private String taskStatus;

        @NameInMap("Timestamp")
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
             * AutoIncrementUsageList.
             */
            public Builder autoIncrementUsageList(java.util.List < AutoIncrementUsageList> autoIncrementUsageList) {
                this.autoIncrementUsageList = autoIncrementUsageList;
                return this;
            }

            /**
             * ErrorInfo.
             */
            public Builder errorInfo(String errorInfo) {
                this.errorInfo = errorInfo;
                return this;
            }

            /**
             * Finish.
             */
            public Builder finish(Boolean finish) {
                this.finish = finish;
                return this;
            }

            /**
             * TaskStatus.
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * Timestamp.
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
