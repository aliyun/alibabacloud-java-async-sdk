// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The information about the data export ticket.</p>
         */
        public Builder dataExportOrderDetail(DataExportOrderDetail dataExportOrderDetail) {
            this.dataExportOrderDetail = dataExportOrderDetail;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>427688B8-ADFB-4C4E-9D45-EF5C1FD6E23D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values: Valid values:</p>
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

        public GetDataExportOrderDetailResponseBody build() {
            return new GetDataExportOrderDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataExportOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataExportOrderDetailResponseBody</p>
     */
    public static class KeyInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobId")
        private Long jobId;

        @com.aliyun.core.annotation.NameInMap("JobStatus")
        private String jobStatus;

        @com.aliyun.core.annotation.NameInMap("PreCheckId")
        private Long preCheckId;

        private KeyInfo(Builder builder) {
            this.jobId = builder.jobId;
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
         * @return jobId
         */
        public Long getJobId() {
            return this.jobId;
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
            private Long jobId; 
            private String jobStatus; 
            private Long preCheckId; 

            /**
             * JobId.
             */
            public Builder jobId(Long jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The state of the data export ticket. Valid values:</p>
             * <ul>
             * <li><strong>PRE_CHECKING</strong>: The ticket was being prechecked.</li>
             * <li><strong>PRE_CHECK_SUCCESS</strong>: The ticket passed the precheck.</li>
             * <li><strong>PRE_CHECK_FAIL</strong>: The ticket failed to pass the prechecked.</li>
             * <li><strong>WAITING_APPLY_AUDIT</strong>: The ticket was to be submitted for approval.</li>
             * <li><strong>APPLY_AUDIT_SUCCESS</strong>: The ticket was submitted for approval.</li>
             * <li><strong>ENABLE_EXPORT</strong>: The ticket was approved. Data can be exported.</li>
             * <li><strong>WAITING_EXPORT</strong>: Data was to be scheduled for export.</li>
             * <li><strong>DOING_EXPORT</strong>: Data was being exported.</li>
             * <li><strong>EXPORT_FAIL</strong>: Data failed to be exported.</li>
             * <li><strong>EXPORT_SUCCESS</strong>: Data was exported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EXPORT_SUCCESS</p>
             */
            public Builder jobStatus(String jobStatus) {
                this.jobStatus = jobStatus;
                return this;
            }

            /**
             * <p>The precheck ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
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
    /**
     * 
     * {@link GetDataExportOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataExportOrderDetailResponseBody</p>
     */
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
             * <p>The number of rows that were affected by the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder actualAffectRows(Long actualAffectRows) {
                this.actualAffectRows = actualAffectRows;
                return this;
            }

            /**
             * <p>The category of the reason for the data export.</p>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder classify(String classify) {
                this.classify = classify;
                return this;
            }

            /**
             * <p>The name of the database from which data was exported.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx@xxx:3306</p>
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * <p>The ID of the database from which data was exported.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder dbId(Integer dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * <p>The type of the environment to which the database belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * <p>The SQL statement that was executed to export data.</p>
             * 
             * <strong>example:</strong>
             * <p>select 1</p>
             */
            public Builder exeSQL(String exeSQL) {
                this.exeSQL = exeSQL;
                return this;
            }

            /**
             * <p>Indicates whether the affected rows are skipped.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder ignoreAffectRows(Boolean ignoreAffectRows) {
                this.ignoreAffectRows = ignoreAffectRows;
                return this;
            }

            /**
             * <p>The reason why the affected rows are skipped.</p>
             * 
             * <strong>example:</strong>
             * <p>empty</p>
             */
            public Builder ignoreAffectRowsReason(String ignoreAffectRowsReason) {
                this.ignoreAffectRowsReason = ignoreAffectRowsReason;
                return this;
            }

            /**
             * <p>Indicates whether the database is a logical database.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
    /**
     * 
     * {@link GetDataExportOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataExportOrderDetailResponseBody</p>
     */
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
             * <p>The information about the ticket.</p>
             */
            public Builder keyInfo(KeyInfo keyInfo) {
                this.keyInfo = keyInfo;
                return this;
            }

            /**
             * <p>The details of the ticket.</p>
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
