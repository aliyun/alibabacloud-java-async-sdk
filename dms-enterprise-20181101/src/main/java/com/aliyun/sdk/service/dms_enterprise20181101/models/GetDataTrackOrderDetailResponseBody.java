// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataTrackOrderDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataTrackOrderDetailResponseBody</p>
 */
public class GetDataTrackOrderDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataTrackOrderDetail")
    private DataTrackOrderDetail dataTrackOrderDetail;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * The details of the ticket.
         */
        public Builder dataTrackOrderDetail(DataTrackOrderDetail dataTrackOrderDetail) {
            this.dataTrackOrderDetail = dataTrackOrderDetail;
            return this;
        }

        /**
         * The error code returned if the request failed.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned if the request failed.
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
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**: The request was successful.
         * *   **false**: The request failed.
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
        @com.aliyun.core.annotation.NameInMap("DatabaseSearchName")
        private String databaseSearchName;

        @com.aliyun.core.annotation.NameInMap("DbId")
        private Long dbId;

        @com.aliyun.core.annotation.NameInMap("JobEndTime")
        private String jobEndTime;

        @com.aliyun.core.annotation.NameInMap("JobStartTime")
        private String jobStartTime;

        @com.aliyun.core.annotation.NameInMap("JobStatus")
        private String jobStatus;

        @com.aliyun.core.annotation.NameInMap("Logic")
        private Boolean logic;

        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("StatusDesc")
        private String statusDesc;

        @com.aliyun.core.annotation.NameInMap("TableNames")
        private java.util.List < String > tableNames;

        @com.aliyun.core.annotation.NameInMap("TrackTypes")
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
             * The name that is used to search for the database.
             */
            public Builder databaseSearchName(String databaseSearchName) {
                this.databaseSearchName = databaseSearchName;
                return this;
            }

            /**
             * The ID of the database.
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * The end time of the time range in which data operations are tracked. The time is in the yyyy-MM-dd HH:mm:ss format.
             */
            public Builder jobEndTime(String jobEndTime) {
                this.jobEndTime = jobEndTime;
                return this;
            }

            /**
             * The start time of the time range in which data operations are tracked. The time is in the yyyy-MM-dd HH:mm:ss format.
             */
            public Builder jobStartTime(String jobStartTime) {
                this.jobStartTime = jobStartTime;
                return this;
            }

            /**
             * The status of the data tracking task. Valid values:
             * <p>
             * 
             * *   **INIT**: The task is being initialized.
             * *   **LISTING**: The binary logs are being obtained.
             * *   **LIST_SUCCESS**: The binary logs are successfully obtained.
             * *   **DOWNLOADING**: The binary logs are being downloaded.
             * *   **DOWNLOAD_FAIL**: The binary logs failed to be downloaded.
             * *   **DOWNLOAD_SUCCESS**: The binary logs are successfully downloaded.
             * *   **FILTERING**: The binary logs are being parsed.
             * *   **FILTER_FAIL**: The binary logs failed to be parsed.
             * *   **FILTER_SUCCESS**: The binary logs are successfully parsed.
             */
            public Builder jobStatus(String jobStatus) {
                this.jobStatus = jobStatus;
                return this;
            }

            /**
             * Indicates whether the database is a logical database. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * The description of the task status.
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            /**
             * The names of the tables for which data operations are tracked.
             */
            public Builder tableNames(java.util.List < String > tableNames) {
                this.tableNames = tableNames;
                return this;
            }

            /**
             * The types of data operations that are tracked.
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
