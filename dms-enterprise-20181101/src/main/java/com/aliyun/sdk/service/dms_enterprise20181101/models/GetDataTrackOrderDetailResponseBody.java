// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataTrackOrderDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataTrackOrderDetailResponseBody</p>
 */
public class GetDataTrackOrderDetailResponseBody extends TeaModel {
    @NameInMap("DataTrackOrderDetail")
    private DataTrackOrderDetail dataTrackOrderDetail;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetDataTrackOrderDetailResponseBody(Builder builder) {
        this.dataTrackOrderDetail = builder.dataTrackOrderDetail;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataTrackOrderDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataTrackOrderDetail
     */
    public DataTrackOrderDetail getDataTrackOrderDetail() {
        return this.dataTrackOrderDetail;
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
        private DataTrackOrderDetail dataTrackOrderDetail; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * DataTrackOrderDetail.
         */
        public Builder dataTrackOrderDetail(DataTrackOrderDetail dataTrackOrderDetail) {
            this.dataTrackOrderDetail = dataTrackOrderDetail;
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
         * Id of the request
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

        public GetDataTrackOrderDetailResponseBody build() {
            return new GetDataTrackOrderDetailResponseBody(this);
        } 

    } 

    public static class DataTrackOrderDetail extends TeaModel {
        @NameInMap("DatabaseSearchName")
        private String databaseSearchName;

        @NameInMap("DbId")
        private Long dbId;

        @NameInMap("JobEndTime")
        private String jobEndTime;

        @NameInMap("JobStartTime")
        private String jobStartTime;

        @NameInMap("JobStatus")
        private String jobStatus;

        @NameInMap("Logic")
        private Boolean logic;

        @NameInMap("SchemaName")
        private String schemaName;

        @NameInMap("StatusDesc")
        private String statusDesc;

        @NameInMap("TableNames")
        private java.util.List < String > tableNames;

        @NameInMap("TrackTypes")
        private java.util.List < String > trackTypes;

        private DataTrackOrderDetail(Builder builder) {
            this.databaseSearchName = builder.databaseSearchName;
            this.dbId = builder.dbId;
            this.jobEndTime = builder.jobEndTime;
            this.jobStartTime = builder.jobStartTime;
            this.jobStatus = builder.jobStatus;
            this.logic = builder.logic;
            this.schemaName = builder.schemaName;
            this.statusDesc = builder.statusDesc;
            this.tableNames = builder.tableNames;
            this.trackTypes = builder.trackTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataTrackOrderDetail create() {
            return builder().build();
        }

        /**
         * @return databaseSearchName
         */
        public String getDatabaseSearchName() {
            return this.databaseSearchName;
        }

        /**
         * @return dbId
         */
        public Long getDbId() {
            return this.dbId;
        }

        /**
         * @return jobEndTime
         */
        public String getJobEndTime() {
            return this.jobEndTime;
        }

        /**
         * @return jobStartTime
         */
        public String getJobStartTime() {
            return this.jobStartTime;
        }

        /**
         * @return jobStatus
         */
        public String getJobStatus() {
            return this.jobStatus;
        }

        /**
         * @return logic
         */
        public Boolean getLogic() {
            return this.logic;
        }

        /**
         * @return schemaName
         */
        public String getSchemaName() {
            return this.schemaName;
        }

        /**
         * @return statusDesc
         */
        public String getStatusDesc() {
            return this.statusDesc;
        }

        /**
         * @return tableNames
         */
        public java.util.List < String > getTableNames() {
            return this.tableNames;
        }

        /**
         * @return trackTypes
         */
        public java.util.List < String > getTrackTypes() {
            return this.trackTypes;
        }

        public static final class Builder {
            private String databaseSearchName; 
            private Long dbId; 
            private String jobEndTime; 
            private String jobStartTime; 
            private String jobStatus; 
            private Boolean logic; 
            private String schemaName; 
            private String statusDesc; 
            private java.util.List < String > tableNames; 
            private java.util.List < String > trackTypes; 

            /**
             * DatabaseSearchName.
             */
            public Builder databaseSearchName(String databaseSearchName) {
                this.databaseSearchName = databaseSearchName;
                return this;
            }

            /**
             * DbId.
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * JobEndTime.
             */
            public Builder jobEndTime(String jobEndTime) {
                this.jobEndTime = jobEndTime;
                return this;
            }

            /**
             * JobStartTime.
             */
            public Builder jobStartTime(String jobStartTime) {
                this.jobStartTime = jobStartTime;
                return this;
            }

            /**
             * JobStatus.
             */
            public Builder jobStatus(String jobStatus) {
                this.jobStatus = jobStatus;
                return this;
            }

            /**
             * Logic.
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * SchemaName.
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * StatusDesc.
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            /**
             * TableNames.
             */
            public Builder tableNames(java.util.List < String > tableNames) {
                this.tableNames = tableNames;
                return this;
            }

            /**
             * TrackTypes.
             */
            public Builder trackTypes(java.util.List < String > trackTypes) {
                this.trackTypes = trackTypes;
                return this;
            }

            public DataTrackOrderDetail build() {
                return new DataTrackOrderDetail(this);
            } 

        } 

    }
}
