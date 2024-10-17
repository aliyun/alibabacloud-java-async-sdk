// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The details of the ticket.</p>
         */
        public Builder dataTrackOrderDetail(DataTrackOrderDetail dataTrackOrderDetail) {
            this.dataTrackOrderDetail = dataTrackOrderDetail;
            return this;
        }

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
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
         * <p>283C461F-11D8-48AA-B695-DF092DA32AF3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDataTrackOrderDetailResponseBody build() {
            return new GetDataTrackOrderDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataTrackOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataTrackOrderDetailResponseBody</p>
     */
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
             * <p>The name that is used to search for the database.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx@yyy:3306</p>
             */
            public Builder databaseSearchName(String databaseSearchName) {
                this.databaseSearchName = databaseSearchName;
                return this;
            }

            /**
             * <p>The ID of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>3431****</p>
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * <p>The end time of the time range in which data operations are tracked. The time is in the yyyy-MM-dd HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-23 10:00:00</p>
             */
            public Builder jobEndTime(String jobEndTime) {
                this.jobEndTime = jobEndTime;
                return this;
            }

            /**
             * <p>The start time of the time range in which data operations are tracked. The time is in the yyyy-MM-dd HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-23 00:00:00</p>
             */
            public Builder jobStartTime(String jobStartTime) {
                this.jobStartTime = jobStartTime;
                return this;
            }

            /**
             * <p>The status of the data tracking task. Valid values:</p>
             * <ul>
             * <li><strong>INIT</strong>: The task is being initialized.</li>
             * <li><strong>LISTING</strong>: The binary logs are being obtained.</li>
             * <li><strong>LIST_SUCCESS</strong>: The binary logs are successfully obtained.</li>
             * <li><strong>DOWNLOADING</strong>: The binary logs are being downloaded.</li>
             * <li><strong>DOWNLOAD_FAIL</strong>: The binary logs failed to be downloaded.</li>
             * <li><strong>DOWNLOAD_SUCCESS</strong>: The binary logs are successfully downloaded.</li>
             * <li><strong>FILTERING</strong>: The binary logs are being parsed.</li>
             * <li><strong>FILTER_FAIL</strong>: The binary logs failed to be parsed.</li>
             * <li><strong>FILTER_SUCCESS</strong>: The binary logs are successfully parsed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FILTER_SUCCESS</p>
             */
            public Builder jobStatus(String jobStatus) {
                this.jobStatus = jobStatus;
                return this;
            }

            /**
             * <p>Indicates whether the database is a logical database. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>as_task</p>
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * <p>The description of the task status.</p>
             * 
             * <strong>example:</strong>
             * <p>searching success</p>
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            /**
             * <p>The names of the tables for which data operations are tracked.</p>
             */
            public Builder tableNames(java.util.List < String > tableNames) {
                this.tableNames = tableNames;
                return this;
            }

            /**
             * <p>The types of data operations that are tracked.</p>
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
