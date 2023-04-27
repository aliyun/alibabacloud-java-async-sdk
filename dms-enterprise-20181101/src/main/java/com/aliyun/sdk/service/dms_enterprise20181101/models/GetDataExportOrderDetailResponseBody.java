// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataExportOrderDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataExportOrderDetailResponseBody</p>
 */
public class GetDataExportOrderDetailResponseBody extends TeaModel {
    @NameInMap("DataExportOrderDetail")
    private DataExportOrderDetail dataExportOrderDetail;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * DataExportOrderDetail.
         */
        public Builder dataExportOrderDetail(DataExportOrderDetail dataExportOrderDetail) {
            this.dataExportOrderDetail = dataExportOrderDetail;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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

        public GetDataExportOrderDetailResponseBody build() {
            return new GetDataExportOrderDetailResponseBody(this);
        } 

    } 

    public static class KeyInfo extends TeaModel {
        @NameInMap("JobStatus")
        private String jobStatus;

        @NameInMap("PreCheckId")
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
             * JobStatus.
             */
            public Builder jobStatus(String jobStatus) {
                this.jobStatus = jobStatus;
                return this;
            }

            /**
             * PreCheckId.
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
        @NameInMap("ActualAffectRows")
        private Long actualAffectRows;

        @NameInMap("Classify")
        private String classify;

        @NameInMap("Database")
        private String database;

        @NameInMap("DbId")
        private Integer dbId;

        @NameInMap("EnvType")
        private String envType;

        @NameInMap("ExeSQL")
        private String exeSQL;

        @NameInMap("IgnoreAffectRows")
        private Boolean ignoreAffectRows;

        @NameInMap("IgnoreAffectRowsReason")
        private String ignoreAffectRowsReason;

        @NameInMap("Logic")
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
             * ActualAffectRows.
             */
            public Builder actualAffectRows(Long actualAffectRows) {
                this.actualAffectRows = actualAffectRows;
                return this;
            }

            /**
             * Classify.
             */
            public Builder classify(String classify) {
                this.classify = classify;
                return this;
            }

            /**
             * Database.
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * DbId.
             */
            public Builder dbId(Integer dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * EnvType.
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * ExeSQL.
             */
            public Builder exeSQL(String exeSQL) {
                this.exeSQL = exeSQL;
                return this;
            }

            /**
             * IgnoreAffectRows.
             */
            public Builder ignoreAffectRows(Boolean ignoreAffectRows) {
                this.ignoreAffectRows = ignoreAffectRows;
                return this;
            }

            /**
             * IgnoreAffectRowsReason.
             */
            public Builder ignoreAffectRowsReason(String ignoreAffectRowsReason) {
                this.ignoreAffectRowsReason = ignoreAffectRowsReason;
                return this;
            }

            /**
             * Logic.
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
        @NameInMap("KeyInfo")
        private KeyInfo keyInfo;

        @NameInMap("OrderDetail")
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
             * KeyInfo.
             */
            public Builder keyInfo(KeyInfo keyInfo) {
                this.keyInfo = keyInfo;
                return this;
            }

            /**
             * OrderDetail.
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
