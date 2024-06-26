// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataExportOrderDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataExportOrderDetailResponseBody</p>
 */
public class GetDataExportOrderDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataExportOrderDetail")
    private DataExportOrderDetail dataExportOrderDetail;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetDataExportOrderDetailResponseBody(Builder builder) {
        this.dataExportOrderDetail = builder.dataExportOrderDetail;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataExportOrderDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataExportOrderDetail
     */
    public DataExportOrderDetail getDataExportOrderDetail() {
        return this.dataExportOrderDetail;
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
        private DataExportOrderDetail dataExportOrderDetail; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * The information about the data export ticket.
         */
        public Builder dataExportOrderDetail(DataExportOrderDetail dataExportOrderDetail) {
            this.dataExportOrderDetail = dataExportOrderDetail;
            return this;
        }

        /**
         * The error code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values: Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDataExportOrderDetailResponseBody build() {
            return new GetDataExportOrderDetailResponseBody(this);
        } 

    } 

    public static class KeyInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobStatus")
        private String jobStatus;

        @com.aliyun.core.annotation.NameInMap("PreCheckId")
        private Long preCheckId;

        private KeyInfo(Builder builder) {
            this.jobStatus = builder.jobStatus;
            this.preCheckId = builder.preCheckId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KeyInfo create() {
            return builder().build();
        }

        /**
         * @return jobStatus
         */
        public String getJobStatus() {
            return this.jobStatus;
        }

        /**
         * @return preCheckId
         */
        public Long getPreCheckId() {
            return this.preCheckId;
        }

        public static final class Builder {
            private String jobStatus; 
            private Long preCheckId; 

            /**
             * The state of the data export ticket. Valid values:
             * <p>
             * 
             * *   **PRE_CHECKING**: The ticket was being prechecked.
             * *   **PRE_CHECK_SUCCESS**: The ticket passed the precheck.
             * *   **PRE_CHECK_FAIL**: The ticket failed to pass the prechecked.
             * *   **WAITING_APPLY_AUDIT**: The ticket was to be submitted for approval.
             * *   **APPLY_AUDIT_SUCCESS**: The ticket was submitted for approval.
             * *   **ENABLE_EXPORT**: The ticket was approved. Data can be exported.
             * *   **WAITING_EXPORT**: Data was to be scheduled for export.
             * *   **DOING_EXPORT**: Data was being exported.
             * *   **EXPORT_FAIL**: Data failed to be exported.
             * *   **EXPORT_SUCCESS**: Data was exported.
             */
            public Builder jobStatus(String jobStatus) {
                this.jobStatus = jobStatus;
                return this;
            }

            /**
             * The precheck ID.
             */
            public Builder preCheckId(Long preCheckId) {
                this.preCheckId = preCheckId;
                return this;
            }

            public KeyInfo build() {
                return new KeyInfo(this);
            } 

        } 

    }
    public static class OrderDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActualAffectRows")
        private Long actualAffectRows;

        @com.aliyun.core.annotation.NameInMap("Classify")
        private String classify;

        @com.aliyun.core.annotation.NameInMap("Database")
        private String database;

        @com.aliyun.core.annotation.NameInMap("DbId")
        private Integer dbId;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("ExeSQL")
        private String exeSQL;

        @com.aliyun.core.annotation.NameInMap("IgnoreAffectRows")
        private Boolean ignoreAffectRows;

        @com.aliyun.core.annotation.NameInMap("IgnoreAffectRowsReason")
        private String ignoreAffectRowsReason;

        @com.aliyun.core.annotation.NameInMap("Logic")
        private Boolean logic;

        private OrderDetail(Builder builder) {
            this.actualAffectRows = builder.actualAffectRows;
            this.classify = builder.classify;
            this.database = builder.database;
            this.dbId = builder.dbId;
            this.envType = builder.envType;
            this.exeSQL = builder.exeSQL;
            this.ignoreAffectRows = builder.ignoreAffectRows;
            this.ignoreAffectRowsReason = builder.ignoreAffectRowsReason;
            this.logic = builder.logic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderDetail create() {
            return builder().build();
        }

        /**
         * @return actualAffectRows
         */
        public Long getActualAffectRows() {
            return this.actualAffectRows;
        }

        /**
         * @return classify
         */
        public String getClassify() {
            return this.classify;
        }

        /**
         * @return database
         */
        public String getDatabase() {
            return this.database;
        }

        /**
         * @return dbId
         */
        public Integer getDbId() {
            return this.dbId;
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return exeSQL
         */
        public String getExeSQL() {
            return this.exeSQL;
        }

        /**
         * @return ignoreAffectRows
         */
        public Boolean getIgnoreAffectRows() {
            return this.ignoreAffectRows;
        }

        /**
         * @return ignoreAffectRowsReason
         */
        public String getIgnoreAffectRowsReason() {
            return this.ignoreAffectRowsReason;
        }

        /**
         * @return logic
         */
        public Boolean getLogic() {
            return this.logic;
        }

        public static final class Builder {
            private Long actualAffectRows; 
            private String classify; 
            private String database; 
            private Integer dbId; 
            private String envType; 
            private String exeSQL; 
            private Boolean ignoreAffectRows; 
            private String ignoreAffectRowsReason; 
            private Boolean logic; 

            /**
             * The number of rows that were affected by the SQL statement.
             */
            public Builder actualAffectRows(Long actualAffectRows) {
                this.actualAffectRows = actualAffectRows;
                return this;
            }

            /**
             * The category of the reason for the data export.
             */
            public Builder classify(String classify) {
                this.classify = classify;
                return this;
            }

            /**
             * The name of the database from which data was exported.
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * The ID of the database from which data was exported.
             */
            public Builder dbId(Integer dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * The type of the environment to which the database belongs.
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * The SQL statement that was executed to export data.
             */
            public Builder exeSQL(String exeSQL) {
                this.exeSQL = exeSQL;
                return this;
            }

            /**
             * Indicates whether the affected rows are skipped.
             */
            public Builder ignoreAffectRows(Boolean ignoreAffectRows) {
                this.ignoreAffectRows = ignoreAffectRows;
                return this;
            }

            /**
             * The reason why the affected rows are skipped.
             */
            public Builder ignoreAffectRowsReason(String ignoreAffectRowsReason) {
                this.ignoreAffectRowsReason = ignoreAffectRowsReason;
                return this;
            }

            /**
             * Indicates whether the database is a logical database.
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            public OrderDetail build() {
                return new OrderDetail(this);
            } 

        } 

    }
    public static class DataExportOrderDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KeyInfo")
        private KeyInfo keyInfo;

        @com.aliyun.core.annotation.NameInMap("OrderDetail")
        private OrderDetail orderDetail;

        private DataExportOrderDetail(Builder builder) {
            this.keyInfo = builder.keyInfo;
            this.orderDetail = builder.orderDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataExportOrderDetail create() {
            return builder().build();
        }

        /**
         * @return keyInfo
         */
        public KeyInfo getKeyInfo() {
            return this.keyInfo;
        }

        /**
         * @return orderDetail
         */
        public OrderDetail getOrderDetail() {
            return this.orderDetail;
        }

        public static final class Builder {
            private KeyInfo keyInfo; 
            private OrderDetail orderDetail; 

            /**
             * The information about the ticket.
             */
            public Builder keyInfo(KeyInfo keyInfo) {
                this.keyInfo = keyInfo;
                return this;
            }

            /**
             * The details of the ticket.
             */
            public Builder orderDetail(OrderDetail orderDetail) {
                this.orderDetail = orderDetail;
                return this;
            }

            public DataExportOrderDetail build() {
                return new DataExportOrderDetail(this);
            } 

        } 

    }
}
