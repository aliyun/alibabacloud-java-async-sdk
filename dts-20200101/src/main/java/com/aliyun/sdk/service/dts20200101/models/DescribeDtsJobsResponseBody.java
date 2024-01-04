// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDtsJobsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDtsJobsResponseBody</p>
 */
public class DescribeDtsJobsResponseBody extends TeaModel {
    @NameInMap("DtsJobList")
    private java.util.List < DtsJobList> dtsJobList;

    @NameInMap("DynamicCode")
    private String dynamicCode;

    @NameInMap("DynamicMessage")
    private String dynamicMessage;

    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("EtlDemoList")
    private java.util.List < EtlDemoList> etlDemoList;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeDtsJobsResponseBody(Builder builder) {
        this.dtsJobList = builder.dtsJobList;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.etlDemoList = builder.etlDemoList;
        this.httpStatusCode = builder.httpStatusCode;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDtsJobsResponseBody create() {
        return builder().build();
    }

    /**
     * @return dtsJobList
     */
    public java.util.List < DtsJobList> getDtsJobList() {
        return this.dtsJobList;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return etlDemoList
     */
    public java.util.List < EtlDemoList> getEtlDemoList() {
        return this.etlDemoList;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
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

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List < DtsJobList> dtsJobList; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private String errCode; 
        private String errMessage; 
        private java.util.List < EtlDemoList> etlDemoList; 
        private Integer httpStatusCode; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Boolean success; 
        private Integer totalRecordCount; 

        /**
         * The list of DTS tasks and the details of each task.
         */
        public Builder dtsJobList(java.util.List < DtsJobList> dtsJobList) {
            this.dtsJobList = dtsJobList;
            return this;
        }

        /**
         * The dynamic error code. This parameter will be removed in the future.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * The dynamic part in the error message. The value of this parameter is used to replace the **%s** variable in the value of the **ErrMessage** parameter.
         * <p>
         * 
         * >  For example, if the value of the **ErrMessage** parameter is **The Value of Input Parameter %s is not valid** and the value of the **DynamicMessage** parameter is **Type**, the specified **Type** parameter is invalid.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * The error code returned if the call failed.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * The error message returned if the call failed.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * The DTS tasks and the details of each task.
         */
        public Builder etlDemoList(java.util.List < EtlDemoList> etlDemoList) {
            this.etlDemoList = etlDemoList;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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
         * Indicates whether the call was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of DTS tasks that meet the query condition.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeDtsJobsResponseBody build() {
            return new DescribeDtsJobsResponseBody(this);
        } 

    } 

    public static class DataCloudStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
        private String status;

        private DataCloudStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.needUpgrade = builder.needUpgrade;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataCloudStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return needUpgrade
         */
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private Boolean needUpgrade; 
            private String percent; 
            private String progress; 
            private String status; 

            /**
             * The error message returned if the task failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * Indicates whether the instance needs to be upgraded. Valid values:
             * <p>
             * 
             * - **true** 
             * - **false**
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * The progress of the task. Unit: percentage.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The number of tables that have been migrated.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The state of the task. For more information about the valid values, see the description of the request parameter **Status**.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DataCloudStatus build() {
                return new DataCloudStatus(this);
            } 

        } 

    }
    public static class DataEtlStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
        private String status;

        private DataEtlStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataEtlStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private String percent; 
            private String progress; 
            private String status; 

            /**
             * The error message returned if the task failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The progress of the ETL task.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The number of records that have been processed by the ETL task.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The state of the ETL task. Valid values:
             * <p>
             * 
             * *   **NotStarted**: The task is not started.
             * *   **Migrating**: The task is in progress.
             * *   **Failed**: The task failed.
             * *   **Finished**: The task is complete.
             * *   **Catched**: The task is not delayed.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DataEtlStatus build() {
                return new DataEtlStatus(this);
            } 

        } 

    }
    public static class DataInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
        private String status;

        private DataInitializationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataInitializationStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private String percent; 
            private String progress; 
            private String status; 

            /**
             * The error message returned if full data synchronization failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The progress of full data synchronization. This is expressed as a percentage.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The number of records that have been synchronized during full data synchronization.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The state of full data synchronization. Valid values:
             * <p>
             * 
             * *   **NotStarted**: The task is not started.
             * *   **Migrating**: The task is in progress.
             * *   **Failed**: The task failed.
             * *   **Finished**: The task is complete.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DataInitializationStatus build() {
                return new DataInitializationStatus(this);
            } 

        } 

    }
    public static class DataSynchronizationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
        private String status;

        private DataSynchronizationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.needUpgrade = builder.needUpgrade;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSynchronizationStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return needUpgrade
         */
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private Boolean needUpgrade; 
            private String percent; 
            private String progress; 
            private String status; 

            /**
             * The error message returned if incremental data migration or synchronization failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * Indicates whether the instance needs to be upgraded. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             * 
             * >  To upgrade a DTS instance, call the [TransferInstanceClass](~~281093~~) operation.
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * The progress of incremental data migration or synchronization.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The number of records that have been migrated or synchronized during incremental data migration or synchronization.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The state of incremental data migration or synchronization. Valid values:
             * <p>
             * 
             * *   **NotStarted**: The task is not started.
             * *   **Migrating**: The task is in progress.
             * *   **Failed**: The task failed.
             * *   **Finished**: The task is complete.
             * *   **Catched**: The task is not delayed.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DataSynchronizationStatus build() {
                return new DataSynchronizationStatus(this);
            } 

        } 

    }
    public static class DestinationEndpoint extends TeaModel {
        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("EngineName")
        private String engineName;

        @NameInMap("InstanceID")
        private String instanceID;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("OracleSID")
        private String oracleSID;

        @NameInMap("Port")
        private String port;

        @NameInMap("Region")
        private String region;

        @NameInMap("SslSolutionEnum")
        private String sslSolutionEnum;

        @NameInMap("UserName")
        private String userName;

        private DestinationEndpoint(Builder builder) {
            this.databaseName = builder.databaseName;
            this.engineName = builder.engineName;
            this.instanceID = builder.instanceID;
            this.instanceType = builder.instanceType;
            this.ip = builder.ip;
            this.oracleSID = builder.oracleSID;
            this.port = builder.port;
            this.region = builder.region;
            this.sslSolutionEnum = builder.sslSolutionEnum;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DestinationEndpoint create() {
            return builder().build();
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return engineName
         */
        public String getEngineName() {
            return this.engineName;
        }

        /**
         * @return instanceID
         */
        public String getInstanceID() {
            return this.instanceID;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return oracleSID
         */
        public String getOracleSID() {
            return this.oracleSID;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return sslSolutionEnum
         */
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String databaseName; 
            private String engineName; 
            private String instanceID; 
            private String instanceType; 
            private String ip; 
            private String oracleSID; 
            private String port; 
            private String region; 
            private String sslSolutionEnum; 
            private String userName; 

            /**
             * The name of the database to which the migration object in the destination instance belongs.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * The database type of the destination instance.
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * The ID of the destination instance.
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * The type of the destination instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The endpoint of the destination instance.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The SID of the Oracle database.
             * <p>
             * 
             * >  This parameter is returned only if the **EngineName** parameter of the destination instance is set to **Oracle** and the Oracle database is deployed in a non-RAC architecture.
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
                return this;
            }

            /**
             * The database service port of the destination instance.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The ID of the region in which the destination instance resides. For more information, see [List of supported regions](~~141033~~).
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Indicates whether SSL encryption is enabled. Valid values:
             * <p>
             * 
             * *   **DISABLE**: SSL encryption is disabled.
             * *   **ENABLE_WITH_CERTIFICATE**: SSL encryption is enabled, and the CA certificate is uploaded.
             * *   **ENABLE_ONLY\_4\_MONGODB_ALTAS**: SSL encryption is enabled for the connection to an AWS MongoDB Altas database.
             * *   **ENABLE_ONLY\_4\_KAFKA_SCRAM_SHA\_256**: SCRAM-SHA-256 is used to encrypt the connection to a Kafka cluster.
             */
            public Builder sslSolutionEnum(String sslSolutionEnum) {
                this.sslSolutionEnum = sslSolutionEnum;
                return this;
            }

            /**
             * The database account of the destination instance.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public DestinationEndpoint build() {
                return new DestinationEndpoint(this);
            } 

        } 

    }
    public static class ErrorDetails extends TeaModel {
        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("HelpUrl")
        private String helpUrl;

        private ErrorDetails(Builder builder) {
            this.errorCode = builder.errorCode;
            this.helpUrl = builder.helpUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorDetails create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return helpUrl
         */
        public String getHelpUrl() {
            return this.helpUrl;
        }

        public static final class Builder {
            private String errorCode; 
            private String helpUrl; 

            /**
             * The error code returned.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The URL of the documentation.
             */
            public Builder helpUrl(String helpUrl) {
                this.helpUrl = helpUrl;
                return this;
            }

            public ErrorDetails build() {
                return new ErrorDetails(this);
            } 

        } 

    }
    public static class FullDataCheckStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
        private String status;

        private FullDataCheckStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FullDataCheckStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private String percent; 
            private String progress; 
            private String status; 

            /**
             * The error message returned if the task failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The progress of the full data verification task. Unit: percentage.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The progress of the full data verification task.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The state of the full data verification task. Valid values:
             * <p>
             * 
             * - **NotStarted**: The verification is not started. 
             * - **Checking**: The verification is in progress. 
             * - **Failed**: The verification failed. 
             * - **Finished**: The verification is complete.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public FullDataCheckStatus build() {
                return new FullDataCheckStatus(this);
            } 

        } 

    }
    public static class IncDataCheckStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
        private String status;

        private IncDataCheckStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IncDataCheckStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private String percent; 
            private String progress; 
            private String status; 

            /**
             * The error message returned if the task failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The progress of the incremental data verification task. Unit: percentage.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The progress of the incremental data verification task.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The state of the incremental data verification task. Valid values:
             * <p>
             * 
             * - **Catched**: The verification is delayed. 
             * - **NotStarted**: The verification is not started. 
             * - **Checking**: The verification is in progress. 
             * - **Failed**: The verification failed.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public IncDataCheckStatus build() {
                return new IncDataCheckStatus(this);
            } 

        } 

    }
    public static class MigrationMode extends TeaModel {
        @NameInMap("DataInitialization")
        private Boolean dataInitialization;

        @NameInMap("DataSynchronization")
        private Boolean dataSynchronization;

        @NameInMap("FullDataCheck")
        private Boolean fullDataCheck;

        @NameInMap("IncDataCheck")
        private Boolean incDataCheck;

        @NameInMap("StructureInitialization")
        private Boolean structureInitialization;

        private MigrationMode(Builder builder) {
            this.dataInitialization = builder.dataInitialization;
            this.dataSynchronization = builder.dataSynchronization;
            this.fullDataCheck = builder.fullDataCheck;
            this.incDataCheck = builder.incDataCheck;
            this.structureInitialization = builder.structureInitialization;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MigrationMode create() {
            return builder().build();
        }

        /**
         * @return dataInitialization
         */
        public Boolean getDataInitialization() {
            return this.dataInitialization;
        }

        /**
         * @return dataSynchronization
         */
        public Boolean getDataSynchronization() {
            return this.dataSynchronization;
        }

        /**
         * @return fullDataCheck
         */
        public Boolean getFullDataCheck() {
            return this.fullDataCheck;
        }

        /**
         * @return incDataCheck
         */
        public Boolean getIncDataCheck() {
            return this.incDataCheck;
        }

        /**
         * @return structureInitialization
         */
        public Boolean getStructureInitialization() {
            return this.structureInitialization;
        }

        public static final class Builder {
            private Boolean dataInitialization; 
            private Boolean dataSynchronization; 
            private Boolean fullDataCheck; 
            private Boolean incDataCheck; 
            private Boolean structureInitialization; 

            /**
             * Indicates whether full data migration or synchronization is performed. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder dataInitialization(Boolean dataInitialization) {
                this.dataInitialization = dataInitialization;
                return this;
            }

            /**
             * Indicates whether incremental data migration or synchronization is performed. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder dataSynchronization(Boolean dataSynchronization) {
                this.dataSynchronization = dataSynchronization;
                return this;
            }

            /**
             * Indicates whether full data verification is performed. Valid values:
             * <p>
             * -  **true**: yes
             * -   **false**: no
             */
            public Builder fullDataCheck(Boolean fullDataCheck) {
                this.fullDataCheck = fullDataCheck;
                return this;
            }

            /**
             * Indicates whether incremental data verification is performed. Valid values:
             * <p>
             * -  **true**: yes
             * -   **false**: no
             */
            public Builder incDataCheck(Boolean incDataCheck) {
                this.incDataCheck = incDataCheck;
                return this;
            }

            /**
             * Indicates whether schema migration or schema synchronization is performed. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder structureInitialization(Boolean structureInitialization) {
                this.structureInitialization = structureInitialization;
                return this;
            }

            public MigrationMode build() {
                return new MigrationMode(this);
            } 

        } 

    }
    public static class Performance extends TeaModel {
        @NameInMap("Flow")
        private String flow;

        @NameInMap("Rps")
        private String rps;

        private Performance(Builder builder) {
            this.flow = builder.flow;
            this.rps = builder.rps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Performance create() {
            return builder().build();
        }

        /**
         * @return flow
         */
        public String getFlow() {
            return this.flow;
        }

        /**
         * @return rps
         */
        public String getRps() {
            return this.rps;
        }

        public static final class Builder {
            private String flow; 
            private String rps; 

            /**
             * The size of data that is migrated or synchronized per second. Unit: MB/s.
             */
            public Builder flow(String flow) {
                this.flow = flow;
                return this;
            }

            /**
             * The number of times that SQL statements are migrated or synchronized per second, including BEGIN, COMMIT, DML, and DDL statements. DML statements include INSERT, DELETE, and UPDATE.
             */
            public Builder rps(String rps) {
                this.rps = rps;
                return this;
            }

            public Performance build() {
                return new Performance(this);
            } 

        } 

    }
    public static class Detail extends TeaModel {
        @NameInMap("CheckItem")
        private String checkItem;

        @NameInMap("CheckItemDescription")
        private String checkItemDescription;

        @NameInMap("CheckResult")
        private String checkResult;

        @NameInMap("FailedReason")
        private String failedReason;

        @NameInMap("RepairMethod")
        private String repairMethod;

        private Detail(Builder builder) {
            this.checkItem = builder.checkItem;
            this.checkItemDescription = builder.checkItemDescription;
            this.checkResult = builder.checkResult;
            this.failedReason = builder.failedReason;
            this.repairMethod = builder.repairMethod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Detail create() {
            return builder().build();
        }

        /**
         * @return checkItem
         */
        public String getCheckItem() {
            return this.checkItem;
        }

        /**
         * @return checkItemDescription
         */
        public String getCheckItemDescription() {
            return this.checkItemDescription;
        }

        /**
         * @return checkResult
         */
        public String getCheckResult() {
            return this.checkResult;
        }

        /**
         * @return failedReason
         */
        public String getFailedReason() {
            return this.failedReason;
        }

        /**
         * @return repairMethod
         */
        public String getRepairMethod() {
            return this.repairMethod;
        }

        public static final class Builder {
            private String checkItem; 
            private String checkItemDescription; 
            private String checkResult; 
            private String failedReason; 
            private String repairMethod; 

            /**
             * The name of the precheck item.
             */
            public Builder checkItem(String checkItem) {
                this.checkItem = checkItem;
                return this;
            }

            /**
             * The description of the precheck item.
             */
            public Builder checkItemDescription(String checkItemDescription) {
                this.checkItemDescription = checkItemDescription;
                return this;
            }

            /**
             * The precheck result. Valid values:
             * <p>
             * 
             * *   **Success**
             * *   **Failed**
             */
            public Builder checkResult(String checkResult) {
                this.checkResult = checkResult;
                return this;
            }

            /**
             * The error message returned if the task failed to pass the precheck.
             * <p>
             * 
             * >  This parameter is returned only if the value of the **CheckResult** parameter is **Failed**.
             */
            public Builder failedReason(String failedReason) {
                this.failedReason = failedReason;
                return this;
            }

            /**
             * The method to fix the precheck failure.
             * <p>
             * 
             * >  This parameter is returned only if the value of the **CheckResult** parameter is **Failed**.
             */
            public Builder repairMethod(String repairMethod) {
                this.repairMethod = repairMethod;
                return this;
            }

            public Detail build() {
                return new Detail(this);
            } 

        } 

    }
    public static class PrecheckStatus extends TeaModel {
        @NameInMap("Detail")
        private java.util.List < Detail> detail;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Status")
        private String status;

        private PrecheckStatus(Builder builder) {
            this.detail = builder.detail;
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrecheckStatus create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public java.util.List < Detail> getDetail() {
            return this.detail;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List < Detail> detail; 
            private String errorMessage; 
            private String percent; 
            private String status; 

            /**
             * The result of each precheck item.
             */
            public Builder detail(java.util.List < Detail> detail) {
                this.detail = detail;
                return this;
            }

            /**
             * The cause of the precheck failure.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The precheck progress. This is expressed as a percentage.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The precheck status. Valid values:
             * <p>
             * 
             * *   **NotStarted**
             * *   **Suspending**:
             * *   **Checking**
             * *   **Failed**
             * *   **Finished**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public PrecheckStatus build() {
                return new PrecheckStatus(this);
            } 

        } 

    }
    public static class RetryState extends TeaModel {
        @NameInMap("ErrMessage")
        private String errMessage;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("MaxRetryTime")
        private Integer maxRetryTime;

        @NameInMap("MigrationErrCode")
        private String migrationErrCode;

        @NameInMap("MigrationErrHelpDocId")
        private String migrationErrHelpDocId;

        @NameInMap("MigrationErrHelpDocKey")
        private String migrationErrHelpDocKey;

        @NameInMap("MigrationErrMsg")
        private String migrationErrMsg;

        @NameInMap("MigrationErrType")
        private String migrationErrType;

        @NameInMap("MigrationErrWorkaround")
        private String migrationErrWorkaround;

        @NameInMap("Module")
        private String module;

        @NameInMap("RetryCount")
        private Integer retryCount;

        @NameInMap("RetryTarget")
        private String retryTarget;

        @NameInMap("RetryTime")
        private Integer retryTime;

        @NameInMap("Retrying")
        private Boolean retrying;

        private RetryState(Builder builder) {
            this.errMessage = builder.errMessage;
            this.jobId = builder.jobId;
            this.maxRetryTime = builder.maxRetryTime;
            this.migrationErrCode = builder.migrationErrCode;
            this.migrationErrHelpDocId = builder.migrationErrHelpDocId;
            this.migrationErrHelpDocKey = builder.migrationErrHelpDocKey;
            this.migrationErrMsg = builder.migrationErrMsg;
            this.migrationErrType = builder.migrationErrType;
            this.migrationErrWorkaround = builder.migrationErrWorkaround;
            this.module = builder.module;
            this.retryCount = builder.retryCount;
            this.retryTarget = builder.retryTarget;
            this.retryTime = builder.retryTime;
            this.retrying = builder.retrying;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RetryState create() {
            return builder().build();
        }

        /**
         * @return errMessage
         */
        public String getErrMessage() {
            return this.errMessage;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return maxRetryTime
         */
        public Integer getMaxRetryTime() {
            return this.maxRetryTime;
        }

        /**
         * @return migrationErrCode
         */
        public String getMigrationErrCode() {
            return this.migrationErrCode;
        }

        /**
         * @return migrationErrHelpDocId
         */
        public String getMigrationErrHelpDocId() {
            return this.migrationErrHelpDocId;
        }

        /**
         * @return migrationErrHelpDocKey
         */
        public String getMigrationErrHelpDocKey() {
            return this.migrationErrHelpDocKey;
        }

        /**
         * @return migrationErrMsg
         */
        public String getMigrationErrMsg() {
            return this.migrationErrMsg;
        }

        /**
         * @return migrationErrType
         */
        public String getMigrationErrType() {
            return this.migrationErrType;
        }

        /**
         * @return migrationErrWorkaround
         */
        public String getMigrationErrWorkaround() {
            return this.migrationErrWorkaround;
        }

        /**
         * @return module
         */
        public String getModule() {
            return this.module;
        }

        /**
         * @return retryCount
         */
        public Integer getRetryCount() {
            return this.retryCount;
        }

        /**
         * @return retryTarget
         */
        public String getRetryTarget() {
            return this.retryTarget;
        }

        /**
         * @return retryTime
         */
        public Integer getRetryTime() {
            return this.retryTime;
        }

        /**
         * @return retrying
         */
        public Boolean getRetrying() {
            return this.retrying;
        }

        public static final class Builder {
            private String errMessage; 
            private String jobId; 
            private Integer maxRetryTime; 
            private String migrationErrCode; 
            private String migrationErrHelpDocId; 
            private String migrationErrHelpDocKey; 
            private String migrationErrMsg; 
            private String migrationErrType; 
            private String migrationErrWorkaround; 
            private String module; 
            private Integer retryCount; 
            private String retryTarget; 
            private Integer retryTime; 
            private Boolean retrying; 

            /**
             * The error message returned if these retries failed.
             */
            public Builder errMessage(String errMessage) {
                this.errMessage = errMessage;
                return this;
            }

            /**
             * The task ID.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * The maximum duration of a retry. Unit: seconds.
             */
            public Builder maxRetryTime(Integer maxRetryTime) {
                this.maxRetryTime = maxRetryTime;
                return this;
            }

            /**
             * The error code.
             */
            public Builder migrationErrCode(String migrationErrCode) {
                this.migrationErrCode = migrationErrCode;
                return this;
            }

            /**
             * The ID of the error code-related documentation.
             */
            public Builder migrationErrHelpDocId(String migrationErrHelpDocId) {
                this.migrationErrHelpDocId = migrationErrHelpDocId;
                return this;
            }

            /**
             * The key of the error code-related documentation.
             */
            public Builder migrationErrHelpDocKey(String migrationErrHelpDocKey) {
                this.migrationErrHelpDocKey = migrationErrHelpDocKey;
                return this;
            }

            /**
             * The error message.
             */
            public Builder migrationErrMsg(String migrationErrMsg) {
                this.migrationErrMsg = migrationErrMsg;
                return this;
            }

            /**
             * The type of the error code.
             */
            public Builder migrationErrType(String migrationErrType) {
                this.migrationErrType = migrationErrType;
                return this;
            }

            /**
             * The solution to the error.
             */
            public Builder migrationErrWorkaround(String migrationErrWorkaround) {
                this.migrationErrWorkaround = migrationErrWorkaround;
                return this;
            }

            /**
             * The progress of the instance when DTS retries.
             */
            public Builder module(String module) {
                this.module = module;
                return this;
            }

            /**
             * The number of retries that have been performed.
             */
            public Builder retryCount(Integer retryCount) {
                this.retryCount = retryCount;
                return this;
            }

            /**
             * The object on which these retries are performed. Valid values:
             * <p>
             * 
             * - **srcDB**: the source database 
             * - **destDB**: the destination database 
             * - **inner_module**: an internal module of DTS
             */
            public Builder retryTarget(String retryTarget) {
                this.retryTarget = retryTarget;
                return this;
            }

            /**
             * The time that has elapsed from the time when the first retry starts. Unit: seconds.
             */
            public Builder retryTime(Integer retryTime) {
                this.retryTime = retryTime;
                return this;
            }

            /**
             * Indicates whether the task is being retried. Valid values:
             * <p>
             * 
             * - **true**
             * - **false**
             */
            public Builder retrying(Boolean retrying) {
                this.retrying = retrying;
                return this;
            }

            public RetryState build() {
                return new RetryState(this);
            } 

        } 

    }
    public static class ReverseJobDataInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
        private String status;

        private ReverseJobDataInitializationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseJobDataInitializationStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private String percent; 
            private String progress; 
            private String status; 

            /**
             * The error message returned if initial full data synchronization failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The progress of initial full data synchronization. Unit: percentage.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The number of entries that have been synchronized during initial full data synchronization.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The state of initial full data synchronization. Valid values:
             * <p>
             * 
             * - **NotStarted**: The task is not started. 
             * - **Migrating**: The task is in progress. 
             * - **Failed**: The task failed. 
             * - **Finished**: The task is complete.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ReverseJobDataInitializationStatus build() {
                return new ReverseJobDataInitializationStatus(this);
            } 

        } 

    }
    public static class ReverseJobDataSynchronizationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
        private String status;

        private ReverseJobDataSynchronizationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.needUpgrade = builder.needUpgrade;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseJobDataSynchronizationStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return needUpgrade
         */
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private Boolean needUpgrade; 
            private String percent; 
            private String progress; 
            private String status; 

            /**
             * The error message returned if incremental data synchronization failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * Indicates whether the instance needs to be upgraded. Valid values:
             * <p>
             * 
             * - **true**
             * - **false**
             * 
             * > To upgrade a DTS instance, call the [TransferInstanceClass](~~281093~~) operation.
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * The progress of incremental data synchronization. Unit: percentage.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The number of entries that have been migrated or synchronized during incremental data migration or synchronization.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The state of incremental data synchronization.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ReverseJobDataSynchronizationStatus build() {
                return new ReverseJobDataSynchronizationStatus(this);
            } 

        } 

    }
    public static class ReverseJobDestinationEndpoint extends TeaModel {
        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("EngineName")
        private String engineName;

        @NameInMap("InstanceID")
        private String instanceID;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("OracleSID")
        private String oracleSID;

        @NameInMap("Port")
        private String port;

        @NameInMap("Region")
        private String region;

        @NameInMap("SslSolutionEnum")
        private String sslSolutionEnum;

        @NameInMap("UserName")
        private String userName;

        private ReverseJobDestinationEndpoint(Builder builder) {
            this.databaseName = builder.databaseName;
            this.engineName = builder.engineName;
            this.instanceID = builder.instanceID;
            this.instanceType = builder.instanceType;
            this.ip = builder.ip;
            this.oracleSID = builder.oracleSID;
            this.port = builder.port;
            this.region = builder.region;
            this.sslSolutionEnum = builder.sslSolutionEnum;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseJobDestinationEndpoint create() {
            return builder().build();
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return engineName
         */
        public String getEngineName() {
            return this.engineName;
        }

        /**
         * @return instanceID
         */
        public String getInstanceID() {
            return this.instanceID;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return oracleSID
         */
        public String getOracleSID() {
            return this.oracleSID;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return sslSolutionEnum
         */
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String databaseName; 
            private String engineName; 
            private String instanceID; 
            private String instanceType; 
            private String ip; 
            private String oracleSID; 
            private String port; 
            private String region; 
            private String sslSolutionEnum; 
            private String userName; 

            /**
             * The name of the database that contains the synchronized objects in the destination instance.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * The database engine of the destination instance.
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * The ID of the destination instance.
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * The type of the destination instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The endpoint of the destination instance.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The SID of the Oracle database. 
             * <p>
             * 
             * > This parameter is returned only if the returned value of **EngineName** of the destination instance is **Oracle** and the Oracle database is deployed in a non-RAC architecture.
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
                return this;
            }

            /**
             * The port number of the destination instance.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The ID of the region in which the destination instance resides. For more information, see [List of supported regions](~~141033~~).
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Indicates whether SSL encryption is enabled. Valid values:
             * <p>
             * 
             * - **DISABLE**: SSL encryption is disabled. 
             * - **ENABLE_WITH_CERTIFICATE**: SSL encryption is enabled and the CA certificate is uploaded. 
             * - **ENABLE_ONLY_4_MONGODB_ALTAS**: SSL encryption is enabled for the connection with an AWS MongoDB Altas database. 
             * - **ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256**: SCRAM-SHA-256 is used to encrypt the connection with a Kafka cluster.
             */
            public Builder sslSolutionEnum(String sslSolutionEnum) {
                this.sslSolutionEnum = sslSolutionEnum;
                return this;
            }

            /**
             * The database account of the destination instance.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public ReverseJobDestinationEndpoint build() {
                return new ReverseJobDestinationEndpoint(this);
            } 

        } 

    }
    public static class ReverseJobErrorDetails extends TeaModel {
        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("HelpUrl")
        private String helpUrl;

        private ReverseJobErrorDetails(Builder builder) {
            this.errorCode = builder.errorCode;
            this.helpUrl = builder.helpUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseJobErrorDetails create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return helpUrl
         */
        public String getHelpUrl() {
            return this.helpUrl;
        }

        public static final class Builder {
            private String errorCode; 
            private String helpUrl; 

            /**
             * The error code returned.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The URL of the documentation.
             */
            public Builder helpUrl(String helpUrl) {
                this.helpUrl = helpUrl;
                return this;
            }

            public ReverseJobErrorDetails build() {
                return new ReverseJobErrorDetails(this);
            } 

        } 

    }
    public static class ReverseJobFullDataCheckStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
        private String status;

        private ReverseJobFullDataCheckStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseJobFullDataCheckStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private String percent; 
            private String progress; 
            private String status; 

            /**
             * The error message returned if incremental data synchronization failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The progress of incremental data synchronization. Unit: percentage.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The number of entries that have been migrated or synchronized during incremental data migration or synchronization.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The state of incremental data synchronization.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ReverseJobFullDataCheckStatus build() {
                return new ReverseJobFullDataCheckStatus(this);
            } 

        } 

    }
    public static class ReverseJobIncDataCheckStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
        private String status;

        private ReverseJobIncDataCheckStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseJobIncDataCheckStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private String percent; 
            private String progress; 
            private String status; 

            /**
             * The error message returned if incremental data synchronization failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The progress of incremental data synchronization. Unit: percentage.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The number of entries that have been migrated or synchronized during incremental data migration or synchronization.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The state of incremental data synchronization.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ReverseJobIncDataCheckStatus build() {
                return new ReverseJobIncDataCheckStatus(this);
            } 

        } 

    }
    public static class ReverseJobMigrationMode extends TeaModel {
        @NameInMap("DataInitialization")
        private Boolean dataInitialization;

        @NameInMap("DataSynchronization")
        private Boolean dataSynchronization;

        @NameInMap("FullDataCheck")
        private Boolean fullDataCheck;

        @NameInMap("IncDataCheck")
        private Boolean incDataCheck;

        @NameInMap("StructureInitialization")
        private Boolean structureInitialization;

        private ReverseJobMigrationMode(Builder builder) {
            this.dataInitialization = builder.dataInitialization;
            this.dataSynchronization = builder.dataSynchronization;
            this.fullDataCheck = builder.fullDataCheck;
            this.incDataCheck = builder.incDataCheck;
            this.structureInitialization = builder.structureInitialization;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseJobMigrationMode create() {
            return builder().build();
        }

        /**
         * @return dataInitialization
         */
        public Boolean getDataInitialization() {
            return this.dataInitialization;
        }

        /**
         * @return dataSynchronization
         */
        public Boolean getDataSynchronization() {
            return this.dataSynchronization;
        }

        /**
         * @return fullDataCheck
         */
        public Boolean getFullDataCheck() {
            return this.fullDataCheck;
        }

        /**
         * @return incDataCheck
         */
        public Boolean getIncDataCheck() {
            return this.incDataCheck;
        }

        /**
         * @return structureInitialization
         */
        public Boolean getStructureInitialization() {
            return this.structureInitialization;
        }

        public static final class Builder {
            private Boolean dataInitialization; 
            private Boolean dataSynchronization; 
            private Boolean fullDataCheck; 
            private Boolean incDataCheck; 
            private Boolean structureInitialization; 

            /**
             * Indicates whether initial full data synchronization is performed. Valid values:
             * <p>
             * 
             * -  **true**
             * -  **false**
             */
            public Builder dataInitialization(Boolean dataInitialization) {
                this.dataInitialization = dataInitialization;
                return this;
            }

            /**
             * Indicates whether incremental data synchronization is performed. Valid values:
             * <p>
             * -  **true**
             * -  **false**
             */
            public Builder dataSynchronization(Boolean dataSynchronization) {
                this.dataSynchronization = dataSynchronization;
                return this;
            }

            /**
             * Indicates whether full data verification is performed. Valid values:
             * <p>
             * -  **true**: yes
             * -   **false**: no
             */
            public Builder fullDataCheck(Boolean fullDataCheck) {
                this.fullDataCheck = fullDataCheck;
                return this;
            }

            /**
             * Indicates whether incremental data verification is performed. Valid values:
             * <p>
             * -  **true**: yes
             * -   **false**: no
             */
            public Builder incDataCheck(Boolean incDataCheck) {
                this.incDataCheck = incDataCheck;
                return this;
            }

            /**
             * Indicates whether initial schema synchronization is performed. Valid values:
             * <p>
             * -  **true**
             * -  **false**
             */
            public Builder structureInitialization(Boolean structureInitialization) {
                this.structureInitialization = structureInitialization;
                return this;
            }

            public ReverseJobMigrationMode build() {
                return new ReverseJobMigrationMode(this);
            } 

        } 

    }
    public static class ReverseJobPerformance extends TeaModel {
        @NameInMap("Flow")
        private String flow;

        @NameInMap("Rps")
        private String rps;

        private ReverseJobPerformance(Builder builder) {
            this.flow = builder.flow;
            this.rps = builder.rps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseJobPerformance create() {
            return builder().build();
        }

        /**
         * @return flow
         */
        public String getFlow() {
            return this.flow;
        }

        /**
         * @return rps
         */
        public String getRps() {
            return this.rps;
        }

        public static final class Builder {
            private String flow; 
            private String rps; 

            /**
             * The size of data that is synchronized per second. Unit: MB/s.
             */
            public Builder flow(String flow) {
                this.flow = flow;
                return this;
            }

            /**
             * The number of times that SQL statements are synchronized per second, including BEGIN, COMMIT, DML, and DDL statements. DML statements include INSERT, DELETE, and UPDATE.
             */
            public Builder rps(String rps) {
                this.rps = rps;
                return this;
            }

            public ReverseJobPerformance build() {
                return new ReverseJobPerformance(this);
            } 

        } 

    }
    public static class PrecheckStatusDetail extends TeaModel {
        @NameInMap("CheckItem")
        private String checkItem;

        @NameInMap("CheckItemDescription")
        private String checkItemDescription;

        @NameInMap("CheckResult")
        private String checkResult;

        @NameInMap("FailedReason")
        private String failedReason;

        @NameInMap("RepairMethod")
        private String repairMethod;

        private PrecheckStatusDetail(Builder builder) {
            this.checkItem = builder.checkItem;
            this.checkItemDescription = builder.checkItemDescription;
            this.checkResult = builder.checkResult;
            this.failedReason = builder.failedReason;
            this.repairMethod = builder.repairMethod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrecheckStatusDetail create() {
            return builder().build();
        }

        /**
         * @return checkItem
         */
        public String getCheckItem() {
            return this.checkItem;
        }

        /**
         * @return checkItemDescription
         */
        public String getCheckItemDescription() {
            return this.checkItemDescription;
        }

        /**
         * @return checkResult
         */
        public String getCheckResult() {
            return this.checkResult;
        }

        /**
         * @return failedReason
         */
        public String getFailedReason() {
            return this.failedReason;
        }

        /**
         * @return repairMethod
         */
        public String getRepairMethod() {
            return this.repairMethod;
        }

        public static final class Builder {
            private String checkItem; 
            private String checkItemDescription; 
            private String checkResult; 
            private String failedReason; 
            private String repairMethod; 

            /**
             * The name of the precheck item.
             */
            public Builder checkItem(String checkItem) {
                this.checkItem = checkItem;
                return this;
            }

            /**
             * The description of the precheck item.
             */
            public Builder checkItemDescription(String checkItemDescription) {
                this.checkItemDescription = checkItemDescription;
                return this;
            }

            /**
             * The precheck result. Valid values:
             * <p>
             * 
             * - **Success**
             * - **Failed**
             */
            public Builder checkResult(String checkResult) {
                this.checkResult = checkResult;
                return this;
            }

            /**
             * The error message returned if the task failed to pass the precheck.
             */
            public Builder failedReason(String failedReason) {
                this.failedReason = failedReason;
                return this;
            }

            /**
             * The method to fix a precheck failure.
             */
            public Builder repairMethod(String repairMethod) {
                this.repairMethod = repairMethod;
                return this;
            }

            public PrecheckStatusDetail build() {
                return new PrecheckStatusDetail(this);
            } 

        } 

    }
    public static class ReverseJobPrecheckStatus extends TeaModel {
        @NameInMap("Detail")
        private java.util.List < PrecheckStatusDetail> detail;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Status")
        private String status;

        private ReverseJobPrecheckStatus(Builder builder) {
            this.detail = builder.detail;
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseJobPrecheckStatus create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public java.util.List < PrecheckStatusDetail> getDetail() {
            return this.detail;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List < PrecheckStatusDetail> detail; 
            private String errorMessage; 
            private String percent; 
            private String status; 

            /**
             * The result of each precheck item.
             */
            public Builder detail(java.util.List < PrecheckStatusDetail> detail) {
                this.detail = detail;
                return this;
            }

            /**
             * The error message returned if the precheck failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The precheck progress. Unit: percentage.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The precheck state. Valid values:
             * <p>
             * 
             * - **NotStarted**: The precheck is not started. 
             * - **Suspending**: The precheck is paused. 
             * - **Checking**: The precheck is in progress. 
             * - **Failed**: The precheck failed. 
             * - **Finished**: The precheck is complete.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ReverseJobPrecheckStatus build() {
                return new ReverseJobPrecheckStatus(this);
            } 

        } 

    }
    public static class SourceEndpoint extends TeaModel {
        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("EngineName")
        private String engineName;

        @NameInMap("InstanceID")
        private String instanceID;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("OracleSID")
        private String oracleSID;

        @NameInMap("Port")
        private String port;

        @NameInMap("Region")
        private String region;

        @NameInMap("SslSolutionEnum")
        private String sslSolutionEnum;

        @NameInMap("UserName")
        private String userName;

        private SourceEndpoint(Builder builder) {
            this.databaseName = builder.databaseName;
            this.engineName = builder.engineName;
            this.instanceID = builder.instanceID;
            this.instanceType = builder.instanceType;
            this.ip = builder.ip;
            this.oracleSID = builder.oracleSID;
            this.port = builder.port;
            this.region = builder.region;
            this.sslSolutionEnum = builder.sslSolutionEnum;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceEndpoint create() {
            return builder().build();
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return engineName
         */
        public String getEngineName() {
            return this.engineName;
        }

        /**
         * @return instanceID
         */
        public String getInstanceID() {
            return this.instanceID;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return oracleSID
         */
        public String getOracleSID() {
            return this.oracleSID;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return sslSolutionEnum
         */
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String databaseName; 
            private String engineName; 
            private String instanceID; 
            private String instanceType; 
            private String ip; 
            private String oracleSID; 
            private String port; 
            private String region; 
            private String sslSolutionEnum; 
            private String userName; 

            /**
             * The name of the database that contains the objects to be migrated from the source instance.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * The database engine of the source instance.
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * The ID of the source instance.
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * The type of the source instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The endpoint of the source instance.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The SID of the Oracle database. 
             * <p>
             * 
             * > This parameter is returned only if the returned value of **EngineName** of the source instance is **Oracle** and the Oracle database is deployed in a non-RAC architecture.
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
                return this;
            }

            /**
             * The port number of the source instance.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The ID of the region in which the source instance resides. For more information, see [Supported regions](~~141033~~).
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Indicates whether SSL encryption is enabled. Valid values:
             * <p>
             * 
             * - **DISABLE**: SSL encryption is disabled. 
             * - **ENABLE_WITH_CERTIFICATE**: SSL encryption is enabled and the CA certificate is uploaded. 
             * - **ENABLE_ONLY_4_MONGODB_ALTAS**: SSL encryption is enabled for the connection with an AWS MongoDB Altas database. 
             * - **ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256**: SCRAM-SHA-256 is used to encrypt the connection with a Kafka cluster.
             */
            public Builder sslSolutionEnum(String sslSolutionEnum) {
                this.sslSolutionEnum = sslSolutionEnum;
                return this;
            }

            /**
             * The database account of the source instance.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public SourceEndpoint build() {
                return new SourceEndpoint(this);
            } 

        } 

    }
    public static class StructureInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
        private String status;

        private StructureInitializationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StructureInitializationStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private String percent; 
            private String progress; 
            private String status; 

            /**
             * The error message returned if initial schema synchronization failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The progress of initial schema synchronization. Unit: percentage.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The number of tables that have been synchronized during initial schema synchronization.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The state of initial schema synchronization. Valid values:
             * <p>
             * 
             * - **NotStarted**: The task is not started. 
             * - **Migrating**: The task is in progress. 
             * - **Failed**: The task failed. 
             * - **Finished**: The task is complete.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public StructureInitializationStatus build() {
                return new StructureInitializationStatus(this);
            } 

        } 

    }
    public static class ReverseJob extends TeaModel {
        @NameInMap("Checkpoint")
        private String checkpoint;

        @NameInMap("CpuUsage")
        private String cpuUsage;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DataInitializationStatus")
        private ReverseJobDataInitializationStatus dataInitializationStatus;

        @NameInMap("DataSynchronizationStatus")
        private ReverseJobDataSynchronizationStatus dataSynchronizationStatus;

        @NameInMap("DbObject")
        private String dbObject;

        @NameInMap("DedicatedClusterId")
        private String dedicatedClusterId;

        @NameInMap("Delay")
        private Long delay;

        @NameInMap("DestinationEndpoint")
        private ReverseJobDestinationEndpoint destinationEndpoint;

        @NameInMap("DtsInstanceID")
        private String dtsInstanceID;

        @NameInMap("DtsJobClass")
        private String dtsJobClass;

        @NameInMap("DtsJobDirection")
        private String dtsJobDirection;

        @NameInMap("DtsJobId")
        private String dtsJobId;

        @NameInMap("DtsJobName")
        private String dtsJobName;

        @NameInMap("DuUsage")
        private Long duUsage;

        @NameInMap("ErrorDetails")
        private java.util.List < ReverseJobErrorDetails> errorDetails;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("EtlSafeCheckpoint")
        private String etlSafeCheckpoint;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("FullDataCheckStatus")
        private ReverseJobFullDataCheckStatus fullDataCheckStatus;

        @NameInMap("IncDataCheckStatus")
        private ReverseJobIncDataCheckStatus incDataCheckStatus;

        @NameInMap("MaxDu")
        private Double maxDu;

        @NameInMap("MemUsage")
        private String memUsage;

        @NameInMap("MigrationMode")
        private ReverseJobMigrationMode migrationMode;

        @NameInMap("MinDu")
        private Double minDu;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("Performance")
        private ReverseJobPerformance performance;

        @NameInMap("PrecheckStatus")
        private ReverseJobPrecheckStatus precheckStatus;

        @NameInMap("Reserved")
        private String reserved;

        @NameInMap("SourceEndpoint")
        private SourceEndpoint sourceEndpoint;

        @NameInMap("Status")
        private String status;

        @NameInMap("StructureInitializationStatus")
        private StructureInitializationStatus structureInitializationStatus;

        private ReverseJob(Builder builder) {
            this.checkpoint = builder.checkpoint;
            this.cpuUsage = builder.cpuUsage;
            this.createTime = builder.createTime;
            this.dataInitializationStatus = builder.dataInitializationStatus;
            this.dataSynchronizationStatus = builder.dataSynchronizationStatus;
            this.dbObject = builder.dbObject;
            this.dedicatedClusterId = builder.dedicatedClusterId;
            this.delay = builder.delay;
            this.destinationEndpoint = builder.destinationEndpoint;
            this.dtsInstanceID = builder.dtsInstanceID;
            this.dtsJobClass = builder.dtsJobClass;
            this.dtsJobDirection = builder.dtsJobDirection;
            this.dtsJobId = builder.dtsJobId;
            this.dtsJobName = builder.dtsJobName;
            this.duUsage = builder.duUsage;
            this.errorDetails = builder.errorDetails;
            this.errorMessage = builder.errorMessage;
            this.etlSafeCheckpoint = builder.etlSafeCheckpoint;
            this.expireTime = builder.expireTime;
            this.fullDataCheckStatus = builder.fullDataCheckStatus;
            this.incDataCheckStatus = builder.incDataCheckStatus;
            this.maxDu = builder.maxDu;
            this.memUsage = builder.memUsage;
            this.migrationMode = builder.migrationMode;
            this.minDu = builder.minDu;
            this.payType = builder.payType;
            this.performance = builder.performance;
            this.precheckStatus = builder.precheckStatus;
            this.reserved = builder.reserved;
            this.sourceEndpoint = builder.sourceEndpoint;
            this.status = builder.status;
            this.structureInitializationStatus = builder.structureInitializationStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseJob create() {
            return builder().build();
        }

        /**
         * @return checkpoint
         */
        public String getCheckpoint() {
            return this.checkpoint;
        }

        /**
         * @return cpuUsage
         */
        public String getCpuUsage() {
            return this.cpuUsage;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataInitializationStatus
         */
        public ReverseJobDataInitializationStatus getDataInitializationStatus() {
            return this.dataInitializationStatus;
        }

        /**
         * @return dataSynchronizationStatus
         */
        public ReverseJobDataSynchronizationStatus getDataSynchronizationStatus() {
            return this.dataSynchronizationStatus;
        }

        /**
         * @return dbObject
         */
        public String getDbObject() {
            return this.dbObject;
        }

        /**
         * @return dedicatedClusterId
         */
        public String getDedicatedClusterId() {
            return this.dedicatedClusterId;
        }

        /**
         * @return delay
         */
        public Long getDelay() {
            return this.delay;
        }

        /**
         * @return destinationEndpoint
         */
        public ReverseJobDestinationEndpoint getDestinationEndpoint() {
            return this.destinationEndpoint;
        }

        /**
         * @return dtsInstanceID
         */
        public String getDtsInstanceID() {
            return this.dtsInstanceID;
        }

        /**
         * @return dtsJobClass
         */
        public String getDtsJobClass() {
            return this.dtsJobClass;
        }

        /**
         * @return dtsJobDirection
         */
        public String getDtsJobDirection() {
            return this.dtsJobDirection;
        }

        /**
         * @return dtsJobId
         */
        public String getDtsJobId() {
            return this.dtsJobId;
        }

        /**
         * @return dtsJobName
         */
        public String getDtsJobName() {
            return this.dtsJobName;
        }

        /**
         * @return duUsage
         */
        public Long getDuUsage() {
            return this.duUsage;
        }

        /**
         * @return errorDetails
         */
        public java.util.List < ReverseJobErrorDetails> getErrorDetails() {
            return this.errorDetails;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return etlSafeCheckpoint
         */
        public String getEtlSafeCheckpoint() {
            return this.etlSafeCheckpoint;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return fullDataCheckStatus
         */
        public ReverseJobFullDataCheckStatus getFullDataCheckStatus() {
            return this.fullDataCheckStatus;
        }

        /**
         * @return incDataCheckStatus
         */
        public ReverseJobIncDataCheckStatus getIncDataCheckStatus() {
            return this.incDataCheckStatus;
        }

        /**
         * @return maxDu
         */
        public Double getMaxDu() {
            return this.maxDu;
        }

        /**
         * @return memUsage
         */
        public String getMemUsage() {
            return this.memUsage;
        }

        /**
         * @return migrationMode
         */
        public ReverseJobMigrationMode getMigrationMode() {
            return this.migrationMode;
        }

        /**
         * @return minDu
         */
        public Double getMinDu() {
            return this.minDu;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return performance
         */
        public ReverseJobPerformance getPerformance() {
            return this.performance;
        }

        /**
         * @return precheckStatus
         */
        public ReverseJobPrecheckStatus getPrecheckStatus() {
            return this.precheckStatus;
        }

        /**
         * @return reserved
         */
        public String getReserved() {
            return this.reserved;
        }

        /**
         * @return sourceEndpoint
         */
        public SourceEndpoint getSourceEndpoint() {
            return this.sourceEndpoint;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return structureInitializationStatus
         */
        public StructureInitializationStatus getStructureInitializationStatus() {
            return this.structureInitializationStatus;
        }

        public static final class Builder {
            private String checkpoint; 
            private String cpuUsage; 
            private String createTime; 
            private ReverseJobDataInitializationStatus dataInitializationStatus; 
            private ReverseJobDataSynchronizationStatus dataSynchronizationStatus; 
            private String dbObject; 
            private String dedicatedClusterId; 
            private Long delay; 
            private ReverseJobDestinationEndpoint destinationEndpoint; 
            private String dtsInstanceID; 
            private String dtsJobClass; 
            private String dtsJobDirection; 
            private String dtsJobId; 
            private String dtsJobName; 
            private Long duUsage; 
            private java.util.List < ReverseJobErrorDetails> errorDetails; 
            private String errorMessage; 
            private String etlSafeCheckpoint; 
            private String expireTime; 
            private ReverseJobFullDataCheckStatus fullDataCheckStatus; 
            private ReverseJobIncDataCheckStatus incDataCheckStatus; 
            private Double maxDu; 
            private String memUsage; 
            private ReverseJobMigrationMode migrationMode; 
            private Double minDu; 
            private String payType; 
            private ReverseJobPerformance performance; 
            private ReverseJobPrecheckStatus precheckStatus; 
            private String reserved; 
            private SourceEndpoint sourceEndpoint; 
            private String status; 
            private StructureInitializationStatus structureInitializationStatus; 

            /**
             * The start offset of incremental data synchronization. This value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder checkpoint(String checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * The CPU utilization of the instance. Unit: percentage.
             */
            public Builder cpuUsage(String cpuUsage) {
                this.cpuUsage = cpuUsage;
                return this;
            }

            /**
             * The time when the task was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The state of initial full data synchronization.
             */
            public Builder dataInitializationStatus(ReverseJobDataInitializationStatus dataInitializationStatus) {
                this.dataInitializationStatus = dataInitializationStatus;
                return this;
            }

            /**
             * The state of incremental data synchronization.
             */
            public Builder dataSynchronizationStatus(ReverseJobDataSynchronizationStatus dataSynchronizationStatus) {
                this.dataSynchronizationStatus = dataSynchronizationStatus;
                return this;
            }

            /**
             * The schema of the objects that you want to synchronize. The value is a JSON string and can contain regular expressions. For more information, see Objects of DTS tasks.
             */
            public Builder dbObject(String dbObject) {
                this.dbObject = dbObject;
                return this;
            }

            /**
             * The ID of the DTS dedicated cluster on which a DTS task runs.
             */
            public Builder dedicatedClusterId(String dedicatedClusterId) {
                this.dedicatedClusterId = dedicatedClusterId;
                return this;
            }

            /**
             * The latency of incremental data synchronization. Unit: seconds.
             */
            public Builder delay(Long delay) {
                this.delay = delay;
                return this;
            }

            /**
             * The connection settings of the destination instance.
             */
            public Builder destinationEndpoint(ReverseJobDestinationEndpoint destinationEndpoint) {
                this.destinationEndpoint = destinationEndpoint;
                return this;
            }

            /**
             * The ID of the data synchronization instance.
             */
            public Builder dtsInstanceID(String dtsInstanceID) {
                this.dtsInstanceID = dtsInstanceID;
                return this;
            }

            /**
             * The instance class. 
             * <p>
             * 
             * > For more information about the test performance of each instance class, see [Specifications of data synchronization instances](~~26605~~).
             */
            public Builder dtsJobClass(String dtsJobClass) {
                this.dtsJobClass = dtsJobClass;
                return this;
            }

            /**
             * The synchronization direction. **Reverse** is returned.
             */
            public Builder dtsJobDirection(String dtsJobDirection) {
                this.dtsJobDirection = dtsJobDirection;
                return this;
            }

            /**
             * The ID of the synchronization task.
             */
            public Builder dtsJobId(String dtsJobId) {
                this.dtsJobId = dtsJobId;
                return this;
            }

            /**
             * The name of the data synchronization task.
             */
            public Builder dtsJobName(String dtsJobName) {
                this.dtsJobName = dtsJobName;
                return this;
            }

            /**
             * The number of DUs that have been used.
             */
            public Builder duUsage(Long duUsage) {
                this.duUsage = duUsage;
                return this;
            }

            /**
             * The error message returned.
             */
            public Builder errorDetails(java.util.List < ReverseJobErrorDetails> errorDetails) {
                this.errorDetails = errorDetails;
                return this;
            }

            /**
             * The error message returned if the task failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The checkpoint of the ETL task.
             */
            public Builder etlSafeCheckpoint(String etlSafeCheckpoint) {
                this.etlSafeCheckpoint = etlSafeCheckpoint;
                return this;
            }

            /**
             * The time when the instance expires. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC. 
             * <p>
             * 
             * > This parameter is returned only if the returned value of **PayType** is **PrePaid**.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * FullDataCheckStatus.
             */
            public Builder fullDataCheckStatus(ReverseJobFullDataCheckStatus fullDataCheckStatus) {
                this.fullDataCheckStatus = fullDataCheckStatus;
                return this;
            }

            /**
             * IncDataCheckStatus.
             */
            public Builder incDataCheckStatus(ReverseJobIncDataCheckStatus incDataCheckStatus) {
                this.incDataCheckStatus = incDataCheckStatus;
                return this;
            }

            /**
             * MaxDu.
             */
            public Builder maxDu(Double maxDu) {
                this.maxDu = maxDu;
                return this;
            }

            /**
             * The memory that has been used. Unit: MB.
             */
            public Builder memUsage(String memUsage) {
                this.memUsage = memUsage;
                return this;
            }

            /**
             * The initial synchronization types.
             */
            public Builder migrationMode(ReverseJobMigrationMode migrationMode) {
                this.migrationMode = migrationMode;
                return this;
            }

            /**
             * MinDu.
             */
            public Builder minDu(Double minDu) {
                this.minDu = minDu;
                return this;
            }

            /**
             * The billing method of the DTS instance. Valid values:
             * <p>
             * 
             * - **PrePaid**: subscription
             * - **PostPaid**: pay-as-you-go
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * The performance of the data synchronization instance.
             */
            public Builder performance(ReverseJobPerformance performance) {
                this.performance = performance;
                return this;
            }

            /**
             * The precheck state.
             */
            public Builder precheckStatus(ReverseJobPrecheckStatus precheckStatus) {
                this.precheckStatus = precheckStatus;
                return this;
            }

            /**
             * The reserved parameter of DTS. The value is a JSON string. You can specify this parameter to meet specific requirements, for example, whether to automatically start a precheck. For more information, see [MigrationReserved](~~176470~~).
             */
            public Builder reserved(String reserved) {
                this.reserved = reserved;
                return this;
            }

            /**
             * The connection settings of the source instance.
             */
            public Builder sourceEndpoint(SourceEndpoint sourceEndpoint) {
                this.sourceEndpoint = sourceEndpoint;
                return this;
            }

            /**
             * The state of the DTS instance. For more information about the valid values, see the description of the request parameter **Status**.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The state of initial schema synchronization.
             */
            public Builder structureInitializationStatus(StructureInitializationStatus structureInitializationStatus) {
                this.structureInitializationStatus = structureInitializationStatus;
                return this;
            }

            public ReverseJob build() {
                return new ReverseJob(this);
            } 

        } 

    }
    public static class DtsJobListSourceEndpoint extends TeaModel {
        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("EngineName")
        private String engineName;

        @NameInMap("InstanceID")
        private String instanceID;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("OracleSID")
        private String oracleSID;

        @NameInMap("Port")
        private String port;

        @NameInMap("Region")
        private String region;

        @NameInMap("SslSolutionEnum")
        private String sslSolutionEnum;

        @NameInMap("UserName")
        private String userName;

        private DtsJobListSourceEndpoint(Builder builder) {
            this.databaseName = builder.databaseName;
            this.engineName = builder.engineName;
            this.instanceID = builder.instanceID;
            this.instanceType = builder.instanceType;
            this.ip = builder.ip;
            this.oracleSID = builder.oracleSID;
            this.port = builder.port;
            this.region = builder.region;
            this.sslSolutionEnum = builder.sslSolutionEnum;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DtsJobListSourceEndpoint create() {
            return builder().build();
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return engineName
         */
        public String getEngineName() {
            return this.engineName;
        }

        /**
         * @return instanceID
         */
        public String getInstanceID() {
            return this.instanceID;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return oracleSID
         */
        public String getOracleSID() {
            return this.oracleSID;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return sslSolutionEnum
         */
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String databaseName; 
            private String engineName; 
            private String instanceID; 
            private String instanceType; 
            private String ip; 
            private String oracleSID; 
            private String port; 
            private String region; 
            private String sslSolutionEnum; 
            private String userName; 

            /**
             * The name of the database that contains the objects to be migrated from the source instance.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * The database engine of the source instance.
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * The ID of the source instance.
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * The type of the source instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The endpoint of the source instance.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The SID of the Oracle database. 
             * <p>
             * 
             * > This parameter is returned only if the returned value of **EngineName** of the source instance is **Oracle** and the Oracle database is deployed in a non-RAC architecture.
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
                return this;
            }

            /**
             * The port number of the source instance.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The ID of the region in which the source instance resides. For more information, see [Supported regions](~~141033~~).
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Indicates whether SSL encryption is enabled. Valid values:
             * <p>
             * 
             * - **DISABLE**: SSL encryption is disabled. 
             * - **ENABLE_WITH_CERTIFICAT**E: SSL encryption is enabled and the CA certificate is uploaded. 
             * - **ENABLE_ONLY_4_MONGODB_ALTAS**: SSL encryption is enabled for the connection with an AWS MongoDB Altas database. 
             * - **ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256**: SCRAM-SHA-256 is used to encrypt the connection with a Kafka cluster.
             */
            public Builder sslSolutionEnum(String sslSolutionEnum) {
                this.sslSolutionEnum = sslSolutionEnum;
                return this;
            }

            /**
             * The database account of the source instance.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public DtsJobListSourceEndpoint build() {
                return new DtsJobListSourceEndpoint(this);
            } 

        } 

    }
    public static class DtsJobListStructureInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
        private String status;

        private DtsJobListStructureInitializationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DtsJobListStructureInitializationStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private String percent; 
            private String progress; 
            private String status; 

            /**
             * The error message returned if schema migration or initial schema synchronization failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The progress of schema migration or initial schema synchronization. Unit: percentage.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The number of tables that have been migrated or synchronized during schema migration or initial schema synchronization.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The state of schema migration or initial schema synchronization. Valid values:
             * <p>
             * 
             * - **NotStarted**: The task is not started. 
             * - **Migrating**: The task is in progress. 
             * - **Failed**: The task failed. 
             * - **Finished**: The task is complete.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DtsJobListStructureInitializationStatus build() {
                return new DtsJobListStructureInitializationStatus(this);
            } 

        } 

    }
    public static class TagList extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
        private String tagValue;

        private TagList(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagList create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * The key of the tag.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The value of the tag.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public TagList build() {
                return new TagList(this);
            } 

        } 

    }
    public static class DtsJobList extends TeaModel {
        @NameInMap("AppName")
        private String appName;

        @NameInMap("BeginTimestamp")
        private String beginTimestamp;

        @NameInMap("Checkpoint")
        private String checkpoint;

        @NameInMap("ConsumptionCheckpoint")
        private String consumptionCheckpoint;

        @NameInMap("ConsumptionClient")
        private String consumptionClient;

        @NameInMap("CpuUsage")
        private String cpuUsage;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DataCloudStatus")
        private DataCloudStatus dataCloudStatus;

        @NameInMap("DataEtlStatus")
        private DataEtlStatus dataEtlStatus;

        @NameInMap("DataInitializationStatus")
        private DataInitializationStatus dataInitializationStatus;

        @NameInMap("DataSynchronizationStatus")
        private DataSynchronizationStatus dataSynchronizationStatus;

        @NameInMap("DbObject")
        private String dbObject;

        @NameInMap("DedicatedClusterId")
        private String dedicatedClusterId;

        @NameInMap("Delay")
        private Long delay;

        @NameInMap("DestinationEndpoint")
        private DestinationEndpoint destinationEndpoint;

        @NameInMap("DtsBisLabel")
        private String dtsBisLabel;

        @NameInMap("DtsInstanceID")
        private String dtsInstanceID;

        @NameInMap("DtsJobClass")
        private String dtsJobClass;

        @NameInMap("DtsJobDirection")
        private String dtsJobDirection;

        @NameInMap("DtsJobId")
        private String dtsJobId;

        @NameInMap("DtsJobName")
        private String dtsJobName;

        @NameInMap("DuUsage")
        private Long duUsage;

        @NameInMap("EndTimestamp")
        private String endTimestamp;

        @NameInMap("ErrorDetails")
        private java.util.List < ErrorDetails> errorDetails;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("EtlSafeCheckpoint")
        private String etlSafeCheckpoint;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("FullDataCheckStatus")
        private FullDataCheckStatus fullDataCheckStatus;

        @NameInMap("IncDataCheckStatus")
        private IncDataCheckStatus incDataCheckStatus;

        @NameInMap("JobType")
        private String jobType;

        @NameInMap("MaxDu")
        private Double maxDu;

        @NameInMap("MemUsage")
        private String memUsage;

        @NameInMap("MigrationErrCode")
        private String migrationErrCode;

        @NameInMap("MigrationErrHelpDocId")
        private String migrationErrHelpDocId;

        @NameInMap("MigrationErrHelpDocKey")
        private String migrationErrHelpDocKey;

        @NameInMap("MigrationErrMsg")
        private String migrationErrMsg;

        @NameInMap("MigrationErrType")
        private String migrationErrType;

        @NameInMap("MigrationErrWorkaround")
        private String migrationErrWorkaround;

        @NameInMap("MigrationMode")
        private MigrationMode migrationMode;

        @NameInMap("MinDu")
        private Double minDu;

        @NameInMap("OriginType")
        private String originType;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("Performance")
        private Performance performance;

        @NameInMap("PrecheckStatus")
        private PrecheckStatus precheckStatus;

        @NameInMap("Reserved")
        private String reserved;

        @NameInMap("ResourceGroupDisplayName")
        private String resourceGroupDisplayName;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("RetryState")
        private RetryState retryState;

        @NameInMap("ReverseJob")
        private ReverseJob reverseJob;

        @NameInMap("SourceEndpoint")
        private DtsJobListSourceEndpoint sourceEndpoint;

        @NameInMap("Status")
        private String status;

        @NameInMap("StructureInitializationStatus")
        private DtsJobListStructureInitializationStatus structureInitializationStatus;

        @NameInMap("TagList")
        private java.util.List < TagList> tagList;

        private DtsJobList(Builder builder) {
            this.appName = builder.appName;
            this.beginTimestamp = builder.beginTimestamp;
            this.checkpoint = builder.checkpoint;
            this.consumptionCheckpoint = builder.consumptionCheckpoint;
            this.consumptionClient = builder.consumptionClient;
            this.cpuUsage = builder.cpuUsage;
            this.createTime = builder.createTime;
            this.dataCloudStatus = builder.dataCloudStatus;
            this.dataEtlStatus = builder.dataEtlStatus;
            this.dataInitializationStatus = builder.dataInitializationStatus;
            this.dataSynchronizationStatus = builder.dataSynchronizationStatus;
            this.dbObject = builder.dbObject;
            this.dedicatedClusterId = builder.dedicatedClusterId;
            this.delay = builder.delay;
            this.destinationEndpoint = builder.destinationEndpoint;
            this.dtsBisLabel = builder.dtsBisLabel;
            this.dtsInstanceID = builder.dtsInstanceID;
            this.dtsJobClass = builder.dtsJobClass;
            this.dtsJobDirection = builder.dtsJobDirection;
            this.dtsJobId = builder.dtsJobId;
            this.dtsJobName = builder.dtsJobName;
            this.duUsage = builder.duUsage;
            this.endTimestamp = builder.endTimestamp;
            this.errorDetails = builder.errorDetails;
            this.errorMessage = builder.errorMessage;
            this.etlSafeCheckpoint = builder.etlSafeCheckpoint;
            this.expireTime = builder.expireTime;
            this.fullDataCheckStatus = builder.fullDataCheckStatus;
            this.incDataCheckStatus = builder.incDataCheckStatus;
            this.jobType = builder.jobType;
            this.maxDu = builder.maxDu;
            this.memUsage = builder.memUsage;
            this.migrationErrCode = builder.migrationErrCode;
            this.migrationErrHelpDocId = builder.migrationErrHelpDocId;
            this.migrationErrHelpDocKey = builder.migrationErrHelpDocKey;
            this.migrationErrMsg = builder.migrationErrMsg;
            this.migrationErrType = builder.migrationErrType;
            this.migrationErrWorkaround = builder.migrationErrWorkaround;
            this.migrationMode = builder.migrationMode;
            this.minDu = builder.minDu;
            this.originType = builder.originType;
            this.payType = builder.payType;
            this.performance = builder.performance;
            this.precheckStatus = builder.precheckStatus;
            this.reserved = builder.reserved;
            this.resourceGroupDisplayName = builder.resourceGroupDisplayName;
            this.resourceGroupId = builder.resourceGroupId;
            this.retryState = builder.retryState;
            this.reverseJob = builder.reverseJob;
            this.sourceEndpoint = builder.sourceEndpoint;
            this.status = builder.status;
            this.structureInitializationStatus = builder.structureInitializationStatus;
            this.tagList = builder.tagList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DtsJobList create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return beginTimestamp
         */
        public String getBeginTimestamp() {
            return this.beginTimestamp;
        }

        /**
         * @return checkpoint
         */
        public String getCheckpoint() {
            return this.checkpoint;
        }

        /**
         * @return consumptionCheckpoint
         */
        public String getConsumptionCheckpoint() {
            return this.consumptionCheckpoint;
        }

        /**
         * @return consumptionClient
         */
        public String getConsumptionClient() {
            return this.consumptionClient;
        }

        /**
         * @return cpuUsage
         */
        public String getCpuUsage() {
            return this.cpuUsage;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataCloudStatus
         */
        public DataCloudStatus getDataCloudStatus() {
            return this.dataCloudStatus;
        }

        /**
         * @return dataEtlStatus
         */
        public DataEtlStatus getDataEtlStatus() {
            return this.dataEtlStatus;
        }

        /**
         * @return dataInitializationStatus
         */
        public DataInitializationStatus getDataInitializationStatus() {
            return this.dataInitializationStatus;
        }

        /**
         * @return dataSynchronizationStatus
         */
        public DataSynchronizationStatus getDataSynchronizationStatus() {
            return this.dataSynchronizationStatus;
        }

        /**
         * @return dbObject
         */
        public String getDbObject() {
            return this.dbObject;
        }

        /**
         * @return dedicatedClusterId
         */
        public String getDedicatedClusterId() {
            return this.dedicatedClusterId;
        }

        /**
         * @return delay
         */
        public Long getDelay() {
            return this.delay;
        }

        /**
         * @return destinationEndpoint
         */
        public DestinationEndpoint getDestinationEndpoint() {
            return this.destinationEndpoint;
        }

        /**
         * @return dtsBisLabel
         */
        public String getDtsBisLabel() {
            return this.dtsBisLabel;
        }

        /**
         * @return dtsInstanceID
         */
        public String getDtsInstanceID() {
            return this.dtsInstanceID;
        }

        /**
         * @return dtsJobClass
         */
        public String getDtsJobClass() {
            return this.dtsJobClass;
        }

        /**
         * @return dtsJobDirection
         */
        public String getDtsJobDirection() {
            return this.dtsJobDirection;
        }

        /**
         * @return dtsJobId
         */
        public String getDtsJobId() {
            return this.dtsJobId;
        }

        /**
         * @return dtsJobName
         */
        public String getDtsJobName() {
            return this.dtsJobName;
        }

        /**
         * @return duUsage
         */
        public Long getDuUsage() {
            return this.duUsage;
        }

        /**
         * @return endTimestamp
         */
        public String getEndTimestamp() {
            return this.endTimestamp;
        }

        /**
         * @return errorDetails
         */
        public java.util.List < ErrorDetails> getErrorDetails() {
            return this.errorDetails;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return etlSafeCheckpoint
         */
        public String getEtlSafeCheckpoint() {
            return this.etlSafeCheckpoint;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return fullDataCheckStatus
         */
        public FullDataCheckStatus getFullDataCheckStatus() {
            return this.fullDataCheckStatus;
        }

        /**
         * @return incDataCheckStatus
         */
        public IncDataCheckStatus getIncDataCheckStatus() {
            return this.incDataCheckStatus;
        }

        /**
         * @return jobType
         */
        public String getJobType() {
            return this.jobType;
        }

        /**
         * @return maxDu
         */
        public Double getMaxDu() {
            return this.maxDu;
        }

        /**
         * @return memUsage
         */
        public String getMemUsage() {
            return this.memUsage;
        }

        /**
         * @return migrationErrCode
         */
        public String getMigrationErrCode() {
            return this.migrationErrCode;
        }

        /**
         * @return migrationErrHelpDocId
         */
        public String getMigrationErrHelpDocId() {
            return this.migrationErrHelpDocId;
        }

        /**
         * @return migrationErrHelpDocKey
         */
        public String getMigrationErrHelpDocKey() {
            return this.migrationErrHelpDocKey;
        }

        /**
         * @return migrationErrMsg
         */
        public String getMigrationErrMsg() {
            return this.migrationErrMsg;
        }

        /**
         * @return migrationErrType
         */
        public String getMigrationErrType() {
            return this.migrationErrType;
        }

        /**
         * @return migrationErrWorkaround
         */
        public String getMigrationErrWorkaround() {
            return this.migrationErrWorkaround;
        }

        /**
         * @return migrationMode
         */
        public MigrationMode getMigrationMode() {
            return this.migrationMode;
        }

        /**
         * @return minDu
         */
        public Double getMinDu() {
            return this.minDu;
        }

        /**
         * @return originType
         */
        public String getOriginType() {
            return this.originType;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return performance
         */
        public Performance getPerformance() {
            return this.performance;
        }

        /**
         * @return precheckStatus
         */
        public PrecheckStatus getPrecheckStatus() {
            return this.precheckStatus;
        }

        /**
         * @return reserved
         */
        public String getReserved() {
            return this.reserved;
        }

        /**
         * @return resourceGroupDisplayName
         */
        public String getResourceGroupDisplayName() {
            return this.resourceGroupDisplayName;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return retryState
         */
        public RetryState getRetryState() {
            return this.retryState;
        }

        /**
         * @return reverseJob
         */
        public ReverseJob getReverseJob() {
            return this.reverseJob;
        }

        /**
         * @return sourceEndpoint
         */
        public DtsJobListSourceEndpoint getSourceEndpoint() {
            return this.sourceEndpoint;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return structureInitializationStatus
         */
        public DtsJobListStructureInitializationStatus getStructureInitializationStatus() {
            return this.structureInitializationStatus;
        }

        /**
         * @return tagList
         */
        public java.util.List < TagList> getTagList() {
            return this.tagList;
        }

        public static final class Builder {
            private String appName; 
            private String beginTimestamp; 
            private String checkpoint; 
            private String consumptionCheckpoint; 
            private String consumptionClient; 
            private String cpuUsage; 
            private String createTime; 
            private DataCloudStatus dataCloudStatus; 
            private DataEtlStatus dataEtlStatus; 
            private DataInitializationStatus dataInitializationStatus; 
            private DataSynchronizationStatus dataSynchronizationStatus; 
            private String dbObject; 
            private String dedicatedClusterId; 
            private Long delay; 
            private DestinationEndpoint destinationEndpoint; 
            private String dtsBisLabel; 
            private String dtsInstanceID; 
            private String dtsJobClass; 
            private String dtsJobDirection; 
            private String dtsJobId; 
            private String dtsJobName; 
            private Long duUsage; 
            private String endTimestamp; 
            private java.util.List < ErrorDetails> errorDetails; 
            private String errorMessage; 
            private String etlSafeCheckpoint; 
            private String expireTime; 
            private FullDataCheckStatus fullDataCheckStatus; 
            private IncDataCheckStatus incDataCheckStatus; 
            private String jobType; 
            private Double maxDu; 
            private String memUsage; 
            private String migrationErrCode; 
            private String migrationErrHelpDocId; 
            private String migrationErrHelpDocKey; 
            private String migrationErrMsg; 
            private String migrationErrType; 
            private String migrationErrWorkaround; 
            private MigrationMode migrationMode; 
            private Double minDu; 
            private String originType; 
            private String payType; 
            private Performance performance; 
            private PrecheckStatus precheckStatus; 
            private String reserved; 
            private String resourceGroupDisplayName; 
            private String resourceGroupId; 
            private RetryState retryState; 
            private ReverseJob reverseJob; 
            private DtsJobListSourceEndpoint sourceEndpoint; 
            private String status; 
            private DtsJobListStructureInitializationStatus structureInitializationStatus; 
            private java.util.List < TagList> tagList; 

            /**
             * Indicates whether the **new** change tracking feature is used.
             * <p>
             * 
             * >  This parameter is returned only for change tracking instances of the new version.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * The start of the time range for change tracking. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder beginTimestamp(String beginTimestamp) {
                this.beginTimestamp = beginTimestamp;
                return this;
            }

            /**
             * The start offset of incremental data synchronization. The value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
             */
            public Builder checkpoint(String checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * The consumption checkpoint of the change tracking instance. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder consumptionCheckpoint(String consumptionCheckpoint) {
                this.consumptionCheckpoint = consumptionCheckpoint;
                return this;
            }

            /**
             * The downstream client information, in the following format: \<IP address of the downstream client>:\<Random ID generated by DTS>.
             */
            public Builder consumptionClient(String consumptionClient) {
                this.consumptionClient = consumptionClient;
                return this;
            }

            /**
             * The CPU utilization of the instance. Unit: percentage.
             */
            public Builder cpuUsage(String cpuUsage) {
                this.cpuUsage = cpuUsage;
                return this;
            }

            /**
             * The point in time when the task was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The state of the physical gateway-based migration task.
             */
            public Builder dataCloudStatus(DataCloudStatus dataCloudStatus) {
                this.dataCloudStatus = dataCloudStatus;
                return this;
            }

            /**
             * The state of the extract, transform, and load (ETL) task. Valid values:
             * <p>
             * 
             * >  This parameter collection is returned only if an ETL task is configured.
             */
            public Builder dataEtlStatus(DataEtlStatus dataEtlStatus) {
                this.dataEtlStatus = dataEtlStatus;
                return this;
            }

            /**
             * The state of full data synchronization.
             */
            public Builder dataInitializationStatus(DataInitializationStatus dataInitializationStatus) {
                this.dataInitializationStatus = dataInitializationStatus;
                return this;
            }

            /**
             * The state of incremental data migration or synchronization.
             */
            public Builder dataSynchronizationStatus(DataSynchronizationStatus dataSynchronizationStatus) {
                this.dataSynchronizationStatus = dataSynchronizationStatus;
                return this;
            }

            /**
             * The objects that you want to synchronize. The value is a JSON string and can contain regular expressions. For more information, see "Objects of DTS tasks".
             */
            public Builder dbObject(String dbObject) {
                this.dbObject = dbObject;
                return this;
            }

            /**
             * The ID of the DTS dedicated cluster on which a DTS task runs.
             */
            public Builder dedicatedClusterId(String dedicatedClusterId) {
                this.dedicatedClusterId = dedicatedClusterId;
                return this;
            }

            /**
             * The latency of incremental data synchronization. Unit: seconds.
             */
            public Builder delay(Long delay) {
                this.delay = delay;
                return this;
            }

            /**
             * The connection settings of the destination instance.
             */
            public Builder destinationEndpoint(DestinationEndpoint destinationEndpoint) {
                this.destinationEndpoint = destinationEndpoint;
                return this;
            }

            /**
             * DtsBisLabel.
             */
            public Builder dtsBisLabel(String dtsBisLabel) {
                this.dtsBisLabel = dtsBisLabel;
                return this;
            }

            /**
             * The ID of the data synchronization instance.
             */
            public Builder dtsInstanceID(String dtsInstanceID) {
                this.dtsInstanceID = dtsInstanceID;
                return this;
            }

            /**
             * The instance class.
             * <p>
             * 
             * >  For more information about the test performance of each instance class, see [Specifications of data synchronization instances](~~26605~~).
             */
            public Builder dtsJobClass(String dtsJobClass) {
                this.dtsJobClass = dtsJobClass;
                return this;
            }

            /**
             * The synchronization direction. The value is **Reverse**.
             */
            public Builder dtsJobDirection(String dtsJobDirection) {
                this.dtsJobDirection = dtsJobDirection;
                return this;
            }

            /**
             * The ID of the data synchronization task.
             */
            public Builder dtsJobId(String dtsJobId) {
                this.dtsJobId = dtsJobId;
                return this;
            }

            /**
             * The name of the data synchronization task.
             */
            public Builder dtsJobName(String dtsJobName) {
                this.dtsJobName = dtsJobName;
                return this;
            }

            /**
             * The number of DUs that have been used.
             */
            public Builder duUsage(Long duUsage) {
                this.duUsage = duUsage;
                return this;
            }

            /**
             * The end of the time range for change tracking. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder endTimestamp(String endTimestamp) {
                this.endTimestamp = endTimestamp;
                return this;
            }

            /**
             * The error message returned.
             */
            public Builder errorDetails(java.util.List < ErrorDetails> errorDetails) {
                this.errorDetails = errorDetails;
                return this;
            }

            /**
             * The error message returned if the task failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The checkpoint of the ETL task.
             */
            public Builder etlSafeCheckpoint(String etlSafeCheckpoint) {
                this.etlSafeCheckpoint = etlSafeCheckpoint;
                return this;
            }

            /**
             * The point in time when the instance expires. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             * <p>
             * 
             * >  This parameter is returned only if the value of the **PayType** parameter is **PrePaid**.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * The state information about the full data verification task.
             */
            public Builder fullDataCheckStatus(FullDataCheckStatus fullDataCheckStatus) {
                this.fullDataCheckStatus = fullDataCheckStatus;
                return this;
            }

            /**
             * The state information about the incremental data verification task.
             */
            public Builder incDataCheckStatus(IncDataCheckStatus incDataCheckStatus) {
                this.incDataCheckStatus = incDataCheckStatus;
                return this;
            }

            /**
             * The type of the DTS task. Valid values:
             * <p>
             * 
             * - **MIGRATION**: data migration task 
             * - **SYNC**: data synchronization task 
             * - **SUBSCRIBE**: change tracking task
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * MaxDu.
             */
            public Builder maxDu(Double maxDu) {
                this.maxDu = maxDu;
                return this;
            }

            /**
             * The memory that has been used. Unit: MB.
             */
            public Builder memUsage(String memUsage) {
                this.memUsage = memUsage;
                return this;
            }

            /**
             * The error code.
             */
            public Builder migrationErrCode(String migrationErrCode) {
                this.migrationErrCode = migrationErrCode;
                return this;
            }

            /**
             * The ID of the error code-related documentation.
             */
            public Builder migrationErrHelpDocId(String migrationErrHelpDocId) {
                this.migrationErrHelpDocId = migrationErrHelpDocId;
                return this;
            }

            /**
             * The key of the error code-related documentation.
             */
            public Builder migrationErrHelpDocKey(String migrationErrHelpDocKey) {
                this.migrationErrHelpDocKey = migrationErrHelpDocKey;
                return this;
            }

            /**
             * The error message.
             */
            public Builder migrationErrMsg(String migrationErrMsg) {
                this.migrationErrMsg = migrationErrMsg;
                return this;
            }

            /**
             * The type of the error code.
             */
            public Builder migrationErrType(String migrationErrType) {
                this.migrationErrType = migrationErrType;
                return this;
            }

            /**
             * The solution to the error.
             */
            public Builder migrationErrWorkaround(String migrationErrWorkaround) {
                this.migrationErrWorkaround = migrationErrWorkaround;
                return this;
            }

            /**
             * The migration or synchronization modes.
             */
            public Builder migrationMode(MigrationMode migrationMode) {
                this.migrationMode = migrationMode;
                return this;
            }

            /**
             * MinDu.
             */
            public Builder minDu(Double minDu) {
                this.minDu = minDu;
                return this;
            }

            /**
             * The source of the task. Valid values:
             * <p>
             * 
             * *   **PTS**
             * *   **DMS**
             * *   **DTS**
             */
            public Builder originType(String originType) {
                this.originType = originType;
                return this;
            }

            /**
             * The billing method of the DTS instance. Valid values:
             * <p>
             * 
             * *   **PrePaid**: subscription
             * *   **PostPaid**: pay-as-you-go
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * The performance of the data migration or synchronization instance.
             */
            public Builder performance(Performance performance) {
                this.performance = performance;
                return this;
            }

            /**
             * The precheck state.
             */
            public Builder precheckStatus(PrecheckStatus precheckStatus) {
                this.precheckStatus = precheckStatus;
                return this;
            }

            /**
             * The reserved parameter of DTS. The value is a JSON string. You can specify this parameter to meet specific requirements, for example, whether to automatically start a precheck. For more information, see [MigrationReserved](~~176470~~).
             */
            public Builder reserved(String reserved) {
                this.reserved = reserved;
                return this;
            }

            /**
             * The name of the resource group.
             */
            public Builder resourceGroupDisplayName(String resourceGroupDisplayName) {
                this.resourceGroupDisplayName = resourceGroupDisplayName;
                return this;
            }

            /**
             * The resource group ID.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The information about the retries performed by DTS due to an exception.
             */
            public Builder retryState(RetryState retryState) {
                this.retryState = retryState;
                return this;
            }

            /**
             * The details of the data synchronization task in the reverse direction. 
             * <p>
             * 
             * > This parameter is returned only for two-way data synchronization tasks.
             */
            public Builder reverseJob(ReverseJob reverseJob) {
                this.reverseJob = reverseJob;
                return this;
            }

            /**
             * The connection settings of the source instance.
             */
            public Builder sourceEndpoint(DtsJobListSourceEndpoint sourceEndpoint) {
                this.sourceEndpoint = sourceEndpoint;
                return this;
            }

            /**
             * The state of the DTS instance. For more information about the valid values, see the description of the request parameter **Status**.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The state of schema migration or initial schema synchronization.
             */
            public Builder structureInitializationStatus(DtsJobListStructureInitializationStatus structureInitializationStatus) {
                this.structureInitializationStatus = structureInitializationStatus;
                return this;
            }

            /**
             * The tags of the task.
             */
            public Builder tagList(java.util.List < TagList> tagList) {
                this.tagList = tagList;
                return this;
            }

            public DtsJobList build() {
                return new DtsJobList(this);
            } 

        } 

    }
    public static class EtlDemoListDataEtlStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
        private String status;

        private EtlDemoListDataEtlStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EtlDemoListDataEtlStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private String percent; 
            private String progress; 
            private String status; 

            /**
             * The error message returned if the ETL task failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The progress of the ETL task. Unit: percentage.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The number of entries that have been processed by the ETL task.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The state of the ETL task. Valid values:
             * <p>
             * 
             * - **NotStarted**: The task is not started. 
             * - **Migrating**: The task is in progress. 
             * - **Failed**: The task failed. 
             * - **Finished**: The task is complete. 
             * - **Catched**: The task is not delayed.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public EtlDemoListDataEtlStatus build() {
                return new EtlDemoListDataEtlStatus(this);
            } 

        } 

    }
    public static class EtlDemoListDataInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
        private String status;

        private EtlDemoListDataInitializationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EtlDemoListDataInitializationStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private String percent; 
            private String progress; 
            private String status; 

            /**
             * The error message returned if full data migration or initial full data synchronization failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The progress of full data migration or initial full data synchronization. Unit: percentage.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The number of entries that have been migrated or synchronized during full data migration or initial full data synchronization.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The state of full data migration or initial full data synchronization. Valid values:
             * <p>
             * 
             * - **NotStarted**: The task is not started. 
             * - **Migrating**: The task is in progress. 
             * - **Failed**: The task failed. 
             * - **Finished**: The task is complete.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public EtlDemoListDataInitializationStatus build() {
                return new EtlDemoListDataInitializationStatus(this);
            } 

        } 

    }
    public static class EtlDemoListDataSynchronizationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
        private String status;

        private EtlDemoListDataSynchronizationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.needUpgrade = builder.needUpgrade;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EtlDemoListDataSynchronizationStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return needUpgrade
         */
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private Boolean needUpgrade; 
            private String percent; 
            private String progress; 
            private String status; 

            /**
             * The error message returned if incremental data migration or synchronization failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * Indicates whether the instance needs to be upgraded. Valid values:
             * <p>
             * 
             * - **true**
             * - **false**
             * 
             * > To upgrade a DTS instance, call the [TransferInstanceClass](~~281093~~) operation.
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * The progress of incremental data migration or synchronization. Unit: percentage.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The number of entries that have been migrated or synchronized during incremental data migration or synchronization.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The state of incremental data migration or synchronization. Valid values:
             * <p>
             * 
             * - **NotStarted**: The task is not started. 
             * - **Migrating**: The task is in progress. 
             * - **Failed**: The task failed. 
             * - **Finished**: The task is complete. 
             * - **Catched**: The task is not delayed.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public EtlDemoListDataSynchronizationStatus build() {
                return new EtlDemoListDataSynchronizationStatus(this);
            } 

        } 

    }
    public static class EtlDemoListDestinationEndpoint extends TeaModel {
        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("EngineName")
        private String engineName;

        @NameInMap("InstanceID")
        private String instanceID;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("OracleSID")
        private String oracleSID;

        @NameInMap("Port")
        private String port;

        @NameInMap("Region")
        private String region;

        @NameInMap("SslSolutionEnum")
        private String sslSolutionEnum;

        @NameInMap("UserName")
        private String userName;

        private EtlDemoListDestinationEndpoint(Builder builder) {
            this.databaseName = builder.databaseName;
            this.engineName = builder.engineName;
            this.instanceID = builder.instanceID;
            this.instanceType = builder.instanceType;
            this.ip = builder.ip;
            this.oracleSID = builder.oracleSID;
            this.port = builder.port;
            this.region = builder.region;
            this.sslSolutionEnum = builder.sslSolutionEnum;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EtlDemoListDestinationEndpoint create() {
            return builder().build();
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return engineName
         */
        public String getEngineName() {
            return this.engineName;
        }

        /**
         * @return instanceID
         */
        public String getInstanceID() {
            return this.instanceID;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return oracleSID
         */
        public String getOracleSID() {
            return this.oracleSID;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return sslSolutionEnum
         */
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String databaseName; 
            private String engineName; 
            private String instanceID; 
            private String instanceType; 
            private String ip; 
            private String oracleSID; 
            private String port; 
            private String region; 
            private String sslSolutionEnum; 
            private String userName; 

            /**
             * The name of the database that contains the migrated objects in the destination instance.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * The database engine of the destination instance.
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * The ID of the destination instance.
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * The type of the destination instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The endpoint of the destination instance.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The SID of the Oracle database. 
             * <p>
             * 
             * > This parameter is returned only if the returned value of **EngineName** of the destination instance is **Oracle** and the Oracle database is deployed in a non-RAC architecture.
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
                return this;
            }

            /**
             * The port number of the destination instance.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The ID of the region in which the destination instance resides. For more information, see [Supported regions](~~141033~~).
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Indicates whether SSL encryption is enabled. Valid values:
             * <p>
             * 
             * - **DISABLE**: SSL encryption is disabled. 
             * - **ENABLE_WITH_CERTIFICATE**: SSL encryption is enabled and the CA certificate is uploaded. 
             * - **ENABLE_ONLY_4_MONGODB_ALTAS**: SSL encryption is enabled for the connection with an AWS MongoDB Altas database. 
             * - **ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256**: SCRAM-SHA-256 is used to encrypt the connection with a Kafka cluster.
             */
            public Builder sslSolutionEnum(String sslSolutionEnum) {
                this.sslSolutionEnum = sslSolutionEnum;
                return this;
            }

            /**
             * The database account of the destination instance.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public EtlDemoListDestinationEndpoint build() {
                return new EtlDemoListDestinationEndpoint(this);
            } 

        } 

    }
    public static class EtlDemoListMigrationMode extends TeaModel {
        @NameInMap("DataInitialization")
        private Boolean dataInitialization;

        @NameInMap("DataSynchronization")
        private Boolean dataSynchronization;

        @NameInMap("StructureInitialization")
        private Boolean structureInitialization;

        private EtlDemoListMigrationMode(Builder builder) {
            this.dataInitialization = builder.dataInitialization;
            this.dataSynchronization = builder.dataSynchronization;
            this.structureInitialization = builder.structureInitialization;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EtlDemoListMigrationMode create() {
            return builder().build();
        }

        /**
         * @return dataInitialization
         */
        public Boolean getDataInitialization() {
            return this.dataInitialization;
        }

        /**
         * @return dataSynchronization
         */
        public Boolean getDataSynchronization() {
            return this.dataSynchronization;
        }

        /**
         * @return structureInitialization
         */
        public Boolean getStructureInitialization() {
            return this.structureInitialization;
        }

        public static final class Builder {
            private Boolean dataInitialization; 
            private Boolean dataSynchronization; 
            private Boolean structureInitialization; 

            /**
             * Indicates whether full data migration or initial full data synchronization is performed. Valid values:
             * <p>
             * 
             * - **true**
             * - **false**
             */
            public Builder dataInitialization(Boolean dataInitialization) {
                this.dataInitialization = dataInitialization;
                return this;
            }

            /**
             * Indicates whether incremental data migration or synchronization is performed. Valid values:
             * <p>
             * 
             * - **true**
             * - **false**
             */
            public Builder dataSynchronization(Boolean dataSynchronization) {
                this.dataSynchronization = dataSynchronization;
                return this;
            }

            /**
             * Indicates whether schema migration or initial schema synchronization is performed. Valid values:
             * <p>
             * 
             * - **true**
             * - **false**
             */
            public Builder structureInitialization(Boolean structureInitialization) {
                this.structureInitialization = structureInitialization;
                return this;
            }

            public EtlDemoListMigrationMode build() {
                return new EtlDemoListMigrationMode(this);
            } 

        } 

    }
    public static class EtlDemoListPerformance extends TeaModel {
        @NameInMap("Flow")
        private String flow;

        @NameInMap("Rps")
        private String rps;

        private EtlDemoListPerformance(Builder builder) {
            this.flow = builder.flow;
            this.rps = builder.rps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EtlDemoListPerformance create() {
            return builder().build();
        }

        /**
         * @return flow
         */
        public String getFlow() {
            return this.flow;
        }

        /**
         * @return rps
         */
        public String getRps() {
            return this.rps;
        }

        public static final class Builder {
            private String flow; 
            private String rps; 

            /**
             * The size of data that is migrated or synchronized per second. Unit: MB/s.
             */
            public Builder flow(String flow) {
                this.flow = flow;
                return this;
            }

            /**
             * The number of times that SQL statements are migrated or synchronized per second, including BEGIN, COMMIT, DML, and DDL statements. DML statements include INSERT, DELETE, and UPDATE.
             */
            public Builder rps(String rps) {
                this.rps = rps;
                return this;
            }

            public EtlDemoListPerformance build() {
                return new EtlDemoListPerformance(this);
            } 

        } 

    }
    public static class EtlDemoListPrecheckStatusDetail extends TeaModel {
        @NameInMap("CheckItem")
        private String checkItem;

        @NameInMap("CheckItemDescription")
        private String checkItemDescription;

        @NameInMap("CheckResult")
        private String checkResult;

        @NameInMap("FailedReason")
        private String failedReason;

        @NameInMap("RepairMethod")
        private String repairMethod;

        private EtlDemoListPrecheckStatusDetail(Builder builder) {
            this.checkItem = builder.checkItem;
            this.checkItemDescription = builder.checkItemDescription;
            this.checkResult = builder.checkResult;
            this.failedReason = builder.failedReason;
            this.repairMethod = builder.repairMethod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EtlDemoListPrecheckStatusDetail create() {
            return builder().build();
        }

        /**
         * @return checkItem
         */
        public String getCheckItem() {
            return this.checkItem;
        }

        /**
         * @return checkItemDescription
         */
        public String getCheckItemDescription() {
            return this.checkItemDescription;
        }

        /**
         * @return checkResult
         */
        public String getCheckResult() {
            return this.checkResult;
        }

        /**
         * @return failedReason
         */
        public String getFailedReason() {
            return this.failedReason;
        }

        /**
         * @return repairMethod
         */
        public String getRepairMethod() {
            return this.repairMethod;
        }

        public static final class Builder {
            private String checkItem; 
            private String checkItemDescription; 
            private String checkResult; 
            private String failedReason; 
            private String repairMethod; 

            /**
             * The name of the precheck item.
             */
            public Builder checkItem(String checkItem) {
                this.checkItem = checkItem;
                return this;
            }

            /**
             * The description of the precheck item.
             */
            public Builder checkItemDescription(String checkItemDescription) {
                this.checkItemDescription = checkItemDescription;
                return this;
            }

            /**
             * The precheck result. Valid values:
             * <p>
             * 
             * - **Success**
             * - **Failed**
             */
            public Builder checkResult(String checkResult) {
                this.checkResult = checkResult;
                return this;
            }

            /**
             * The error message returned if the task failed to pass the precheck. 
             * <p>
             * 
             * > This parameter is returned only if the returned value of **CheckResult** is **Failed**.
             */
            public Builder failedReason(String failedReason) {
                this.failedReason = failedReason;
                return this;
            }

            /**
             * The method to fix a precheck failure. 
             * <p>
             * 
             * > This parameter is returned only if the returned value of **CheckResult** is **Failed**.
             */
            public Builder repairMethod(String repairMethod) {
                this.repairMethod = repairMethod;
                return this;
            }

            public EtlDemoListPrecheckStatusDetail build() {
                return new EtlDemoListPrecheckStatusDetail(this);
            } 

        } 

    }
    public static class EtlDemoListPrecheckStatus extends TeaModel {
        @NameInMap("Detail")
        private java.util.List < EtlDemoListPrecheckStatusDetail> detail;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Status")
        private String status;

        private EtlDemoListPrecheckStatus(Builder builder) {
            this.detail = builder.detail;
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EtlDemoListPrecheckStatus create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public java.util.List < EtlDemoListPrecheckStatusDetail> getDetail() {
            return this.detail;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List < EtlDemoListPrecheckStatusDetail> detail; 
            private String errorMessage; 
            private String percent; 
            private String status; 

            /**
             * The result of each precheck item.
             */
            public Builder detail(java.util.List < EtlDemoListPrecheckStatusDetail> detail) {
                this.detail = detail;
                return this;
            }

            /**
             * The error message returned if the precheck failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The precheck progress. Unit: percentage.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The precheck state. Valid values:
             * <p>
             * 
             * - **NotStarted**: The precheck is not started. 
             * - **Suspending**: The precheck is paused. 
             * - **Checking**: The precheck is in progress. 
             * - **Failed**: The precheck failed. 
             * - **Finished**: The precheck is complete.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public EtlDemoListPrecheckStatus build() {
                return new EtlDemoListPrecheckStatus(this);
            } 

        } 

    }
    public static class EtlDemoListRetryState extends TeaModel {
        @NameInMap("ErrMessage")
        private String errMessage;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("MaxRetryTime")
        private Integer maxRetryTime;

        @NameInMap("Module")
        private String module;

        @NameInMap("RetryCount")
        private Integer retryCount;

        @NameInMap("RetryTarget")
        private String retryTarget;

        @NameInMap("RetryTime")
        private Integer retryTime;

        @NameInMap("Retrying")
        private Boolean retrying;

        private EtlDemoListRetryState(Builder builder) {
            this.errMessage = builder.errMessage;
            this.jobId = builder.jobId;
            this.maxRetryTime = builder.maxRetryTime;
            this.module = builder.module;
            this.retryCount = builder.retryCount;
            this.retryTarget = builder.retryTarget;
            this.retryTime = builder.retryTime;
            this.retrying = builder.retrying;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EtlDemoListRetryState create() {
            return builder().build();
        }

        /**
         * @return errMessage
         */
        public String getErrMessage() {
            return this.errMessage;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return maxRetryTime
         */
        public Integer getMaxRetryTime() {
            return this.maxRetryTime;
        }

        /**
         * @return module
         */
        public String getModule() {
            return this.module;
        }

        /**
         * @return retryCount
         */
        public Integer getRetryCount() {
            return this.retryCount;
        }

        /**
         * @return retryTarget
         */
        public String getRetryTarget() {
            return this.retryTarget;
        }

        /**
         * @return retryTime
         */
        public Integer getRetryTime() {
            return this.retryTime;
        }

        /**
         * @return retrying
         */
        public Boolean getRetrying() {
            return this.retrying;
        }

        public static final class Builder {
            private String errMessage; 
            private String jobId; 
            private Integer maxRetryTime; 
            private String module; 
            private Integer retryCount; 
            private String retryTarget; 
            private Integer retryTime; 
            private Boolean retrying; 

            /**
             * The error message returned if these retries failed.
             */
            public Builder errMessage(String errMessage) {
                this.errMessage = errMessage;
                return this;
            }

            /**
             * The task ID.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * The maximum duration of a retry. Unit: seconds.
             */
            public Builder maxRetryTime(Integer maxRetryTime) {
                this.maxRetryTime = maxRetryTime;
                return this;
            }

            /**
             * The progress of the instance when DTS retries.
             */
            public Builder module(String module) {
                this.module = module;
                return this;
            }

            /**
             * The number of retries that have been performed.
             */
            public Builder retryCount(Integer retryCount) {
                this.retryCount = retryCount;
                return this;
            }

            /**
             * The object on which these retries are performed. Valid values:
             * <p>
             * 
             * - **srcDB**: the source database 
             * - **destDB**: the destination database 
             * - **inner_module**: an internal module of DTS
             */
            public Builder retryTarget(String retryTarget) {
                this.retryTarget = retryTarget;
                return this;
            }

            /**
             * The time that has elapsed from the time when the first retry starts. Unit: seconds.
             */
            public Builder retryTime(Integer retryTime) {
                this.retryTime = retryTime;
                return this;
            }

            /**
             * Indicates whether the task is being retried. Valid values:
             * <p>
             * 
             * - **true**
             * - **false**
             */
            public Builder retrying(Boolean retrying) {
                this.retrying = retrying;
                return this;
            }

            public EtlDemoListRetryState build() {
                return new EtlDemoListRetryState(this);
            } 

        } 

    }
    public static class EtlDemoListReverseJobDataInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
        private String status;

        private EtlDemoListReverseJobDataInitializationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EtlDemoListReverseJobDataInitializationStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private String percent; 
            private String progress; 
            private String status; 

            /**
             * The error message returned if initial full data synchronization failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The progress of initial full data synchronization. Unit: percentage.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The number of entries that have been synchronized during initial full data synchronization.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The state of initial full data synchronization. Valid values:
             * <p>
             * 
             * - **NotStarted**: The task is not started. 
             * - **Migrating**: The task is in progress. 
             * - **Failed**: The task failed. 
             * - **Finished**: The task is complete.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public EtlDemoListReverseJobDataInitializationStatus build() {
                return new EtlDemoListReverseJobDataInitializationStatus(this);
            } 

        } 

    }
    public static class EtlDemoListReverseJobDataSynchronizationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
        private String status;

        private EtlDemoListReverseJobDataSynchronizationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.needUpgrade = builder.needUpgrade;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EtlDemoListReverseJobDataSynchronizationStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return needUpgrade
         */
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private Boolean needUpgrade; 
            private String percent; 
            private String progress; 
            private String status; 

            /**
             * The error message returned if incremental data synchronization failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * Indicates whether the instance needs to be upgraded. Valid values:
             * <p>
             * 
             * - **true**
             * - **false**
             * 
             * > To upgrade a DTS instance, call the [TransferInstanceClass](~~281093~~) operation.
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * The progress of incremental data synchronization. Unit: percentage.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The number of entries that have been migrated or synchronized during incremental data migration or synchronization.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The state of incremental data synchronization.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public EtlDemoListReverseJobDataSynchronizationStatus build() {
                return new EtlDemoListReverseJobDataSynchronizationStatus(this);
            } 

        } 

    }
    public static class EtlDemoListReverseJobDestinationEndpoint extends TeaModel {
        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("EngineName")
        private String engineName;

        @NameInMap("InstanceID")
        private String instanceID;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("OracleSID")
        private String oracleSID;

        @NameInMap("Port")
        private String port;

        @NameInMap("Region")
        private String region;

        @NameInMap("SslSolutionEnum")
        private String sslSolutionEnum;

        @NameInMap("UserName")
        private String userName;

        private EtlDemoListReverseJobDestinationEndpoint(Builder builder) {
            this.databaseName = builder.databaseName;
            this.engineName = builder.engineName;
            this.instanceID = builder.instanceID;
            this.instanceType = builder.instanceType;
            this.ip = builder.ip;
            this.oracleSID = builder.oracleSID;
            this.port = builder.port;
            this.region = builder.region;
            this.sslSolutionEnum = builder.sslSolutionEnum;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EtlDemoListReverseJobDestinationEndpoint create() {
            return builder().build();
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return engineName
         */
        public String getEngineName() {
            return this.engineName;
        }

        /**
         * @return instanceID
         */
        public String getInstanceID() {
            return this.instanceID;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return oracleSID
         */
        public String getOracleSID() {
            return this.oracleSID;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return sslSolutionEnum
         */
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String databaseName; 
            private String engineName; 
            private String instanceID; 
            private String instanceType; 
            private String ip; 
            private String oracleSID; 
            private String port; 
            private String region; 
            private String sslSolutionEnum; 
            private String userName; 

            /**
             * The name of the database that contains the synchronized objects in the destination instance.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * The database engine of the destination instance.
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * The ID of the destination instance.
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * The type of the destination instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The endpoint of the destination instance.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The SID of the Oracle database. 
             * <p>
             * 
             * > This parameter is returned only if the returned value of **EngineName** of the destination instance is **Oracle** and the Oracle database is deployed in a non-RAC architecture.
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
                return this;
            }

            /**
             * The port number of the destination instance.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The ID of the region in which the destination instance resides. For more information, see [Supported regions](~~141033~~).
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Indicates whether SSL encryption is enabled. Valid values:
             * <p>
             * 
             * - **DISABLE**: SSL encryption is disabled. 
             * - **ENABLE_WITH_CERTIFICATE**: SSL encryption is enabled and the CA certificate is uploaded. 
             * - **ENABLE_ONLY_4_MONGODB_ALTAS**: SSL encryption is enabled for the connection with an AWS MongoDB Altas database. 
             * - **ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256**: SCRAM-SHA-256 is used to encrypt the connection with a Kafka cluster.
             */
            public Builder sslSolutionEnum(String sslSolutionEnum) {
                this.sslSolutionEnum = sslSolutionEnum;
                return this;
            }

            /**
             * The database account of the destination instance.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public EtlDemoListReverseJobDestinationEndpoint build() {
                return new EtlDemoListReverseJobDestinationEndpoint(this);
            } 

        } 

    }
    public static class EtlDemoListReverseJobMigrationMode extends TeaModel {
        @NameInMap("DataInitialization")
        private Boolean dataInitialization;

        @NameInMap("DataSynchronization")
        private Boolean dataSynchronization;

        @NameInMap("StructureInitialization")
        private Boolean structureInitialization;

        private EtlDemoListReverseJobMigrationMode(Builder builder) {
            this.dataInitialization = builder.dataInitialization;
            this.dataSynchronization = builder.dataSynchronization;
            this.structureInitialization = builder.structureInitialization;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EtlDemoListReverseJobMigrationMode create() {
            return builder().build();
        }

        /**
         * @return dataInitialization
         */
        public Boolean getDataInitialization() {
            return this.dataInitialization;
        }

        /**
         * @return dataSynchronization
         */
        public Boolean getDataSynchronization() {
            return this.dataSynchronization;
        }

        /**
         * @return structureInitialization
         */
        public Boolean getStructureInitialization() {
            return this.structureInitialization;
        }

        public static final class Builder {
            private Boolean dataInitialization; 
            private Boolean dataSynchronization; 
            private Boolean structureInitialization; 

            /**
             * Indicates whether full data migration or initial full data synchronization is performed. Valid values:
             * <p>
             * 
             * - **true**
             * - **false**
             */
            public Builder dataInitialization(Boolean dataInitialization) {
                this.dataInitialization = dataInitialization;
                return this;
            }

            /**
             * Indicates whether incremental data migration or synchronization is performed. Valid values:
             * <p>
             * 
             * - **true**
             * - **false**
             */
            public Builder dataSynchronization(Boolean dataSynchronization) {
                this.dataSynchronization = dataSynchronization;
                return this;
            }

            /**
             * Indicates whether schema migration or initial schema synchronization is performed. Valid values:
             * <p>
             * 
             * - **true**
             * - **false**
             */
            public Builder structureInitialization(Boolean structureInitialization) {
                this.structureInitialization = structureInitialization;
                return this;
            }

            public EtlDemoListReverseJobMigrationMode build() {
                return new EtlDemoListReverseJobMigrationMode(this);
            } 

        } 

    }
    public static class EtlDemoListReverseJobPerformance extends TeaModel {
        @NameInMap("Flow")
        private String flow;

        @NameInMap("Rps")
        private String rps;

        private EtlDemoListReverseJobPerformance(Builder builder) {
            this.flow = builder.flow;
            this.rps = builder.rps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EtlDemoListReverseJobPerformance create() {
            return builder().build();
        }

        /**
         * @return flow
         */
        public String getFlow() {
            return this.flow;
        }

        /**
         * @return rps
         */
        public String getRps() {
            return this.rps;
        }

        public static final class Builder {
            private String flow; 
            private String rps; 

            /**
             * The size of data that is migrated or synchronized per second. Unit: MB/s.
             */
            public Builder flow(String flow) {
                this.flow = flow;
                return this;
            }

            /**
             * The number of times that SQL statements are migrated or synchronized per second, including BEGIN, COMMIT, DML, and DDL statements. DML statements include INSERT, DELETE, and UPDATE.
             */
            public Builder rps(String rps) {
                this.rps = rps;
                return this;
            }

            public EtlDemoListReverseJobPerformance build() {
                return new EtlDemoListReverseJobPerformance(this);
            } 

        } 

    }
    public static class ReverseJobPrecheckStatusDetail extends TeaModel {
        @NameInMap("CheckItem")
        private String checkItem;

        @NameInMap("CheckItemDescription")
        private String checkItemDescription;

        @NameInMap("CheckResult")
        private String checkResult;

        @NameInMap("FailedReason")
        private String failedReason;

        @NameInMap("RepairMethod")
        private String repairMethod;

        private ReverseJobPrecheckStatusDetail(Builder builder) {
            this.checkItem = builder.checkItem;
            this.checkItemDescription = builder.checkItemDescription;
            this.checkResult = builder.checkResult;
            this.failedReason = builder.failedReason;
            this.repairMethod = builder.repairMethod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseJobPrecheckStatusDetail create() {
            return builder().build();
        }

        /**
         * @return checkItem
         */
        public String getCheckItem() {
            return this.checkItem;
        }

        /**
         * @return checkItemDescription
         */
        public String getCheckItemDescription() {
            return this.checkItemDescription;
        }

        /**
         * @return checkResult
         */
        public String getCheckResult() {
            return this.checkResult;
        }

        /**
         * @return failedReason
         */
        public String getFailedReason() {
            return this.failedReason;
        }

        /**
         * @return repairMethod
         */
        public String getRepairMethod() {
            return this.repairMethod;
        }

        public static final class Builder {
            private String checkItem; 
            private String checkItemDescription; 
            private String checkResult; 
            private String failedReason; 
            private String repairMethod; 

            /**
             * The name of the precheck item.
             */
            public Builder checkItem(String checkItem) {
                this.checkItem = checkItem;
                return this;
            }

            /**
             * The description of the precheck item.
             */
            public Builder checkItemDescription(String checkItemDescription) {
                this.checkItemDescription = checkItemDescription;
                return this;
            }

            /**
             * The precheck result. Valid values:
             * <p>
             * 
             * - **Success**
             * - **Failed**
             */
            public Builder checkResult(String checkResult) {
                this.checkResult = checkResult;
                return this;
            }

            /**
             * The error message returned if the task failed to pass the precheck. 
             * <p>
             * 
             * > This parameter is returned only if the returned value of **CheckResult** is **Failed**.
             */
            public Builder failedReason(String failedReason) {
                this.failedReason = failedReason;
                return this;
            }

            /**
             * The method to fix a precheck failure. 
             * <p>
             * 
             * > This parameter is returned only if the returned value of **CheckResult** is **Failed**.
             */
            public Builder repairMethod(String repairMethod) {
                this.repairMethod = repairMethod;
                return this;
            }

            public ReverseJobPrecheckStatusDetail build() {
                return new ReverseJobPrecheckStatusDetail(this);
            } 

        } 

    }
    public static class EtlDemoListReverseJobPrecheckStatus extends TeaModel {
        @NameInMap("Detail")
        private java.util.List < ReverseJobPrecheckStatusDetail> detail;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Status")
        private String status;

        private EtlDemoListReverseJobPrecheckStatus(Builder builder) {
            this.detail = builder.detail;
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EtlDemoListReverseJobPrecheckStatus create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public java.util.List < ReverseJobPrecheckStatusDetail> getDetail() {
            return this.detail;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List < ReverseJobPrecheckStatusDetail> detail; 
            private String errorMessage; 
            private String percent; 
            private String status; 

            /**
             * The result of each precheck item.
             */
            public Builder detail(java.util.List < ReverseJobPrecheckStatusDetail> detail) {
                this.detail = detail;
                return this;
            }

            /**
             * The error message returned if the precheck failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The precheck progress. Unit: percentage.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The precheck state. Valid values:
             * <p>
             * 
             * - **NotStarted**: The precheck is not started. 
             * - **Suspending**: The precheck is paused. 
             * - **Checking**: The precheck is in progress. 
             * - **Failed**: The precheck failed. 
             * - **Finished**: The precheck is complete.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public EtlDemoListReverseJobPrecheckStatus build() {
                return new EtlDemoListReverseJobPrecheckStatus(this);
            } 

        } 

    }
    public static class ReverseJobSourceEndpoint extends TeaModel {
        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("EngineName")
        private String engineName;

        @NameInMap("InstanceID")
        private String instanceID;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("OracleSID")
        private String oracleSID;

        @NameInMap("Port")
        private String port;

        @NameInMap("Region")
        private String region;

        @NameInMap("SslSolutionEnum")
        private String sslSolutionEnum;

        @NameInMap("UserName")
        private String userName;

        private ReverseJobSourceEndpoint(Builder builder) {
            this.databaseName = builder.databaseName;
            this.engineName = builder.engineName;
            this.instanceID = builder.instanceID;
            this.instanceType = builder.instanceType;
            this.ip = builder.ip;
            this.oracleSID = builder.oracleSID;
            this.port = builder.port;
            this.region = builder.region;
            this.sslSolutionEnum = builder.sslSolutionEnum;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseJobSourceEndpoint create() {
            return builder().build();
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return engineName
         */
        public String getEngineName() {
            return this.engineName;
        }

        /**
         * @return instanceID
         */
        public String getInstanceID() {
            return this.instanceID;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return oracleSID
         */
        public String getOracleSID() {
            return this.oracleSID;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return sslSolutionEnum
         */
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String databaseName; 
            private String engineName; 
            private String instanceID; 
            private String instanceType; 
            private String ip; 
            private String oracleSID; 
            private String port; 
            private String region; 
            private String sslSolutionEnum; 
            private String userName; 

            /**
             * The name of the database that contains the objects to be migrated from the source instance.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * The database engine of the source instance.
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * The ID of the source instance.
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * The type of the source instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The endpoint of the source instance.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The SID of the Oracle database. 
             * <p>
             * 
             * > This parameter is returned only if the returned value of **EngineName** of the source instance is **Oracle** and the Oracle database is deployed in a non-RAC architecture.
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
                return this;
            }

            /**
             * The port number of the source instance.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The ID of the region in which the source instance resides. For more information, see [Supported regions](~~141033~~).
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Indicates whether SSL encryption is enabled. Valid values:
             * <p>
             * 
             * - **DISABLE**: SSL encryption is disabled. 
             * - **ENABLE_WITH_CERTIFICATE**: SSL encryption is enabled and the CA certificate is uploaded. 
             * - **ENABLE_ONLY_4_MONGODB_ALTAS**: SSL encryption is enabled for the connection with an AWS MongoDB Altas database. 
             * - **ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256**: SCRAM-SHA-256 is used to encrypt the connection with a Kafka cluster.
             */
            public Builder sslSolutionEnum(String sslSolutionEnum) {
                this.sslSolutionEnum = sslSolutionEnum;
                return this;
            }

            /**
             * The database account of the source instance.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public ReverseJobSourceEndpoint build() {
                return new ReverseJobSourceEndpoint(this);
            } 

        } 

    }
    public static class ReverseJobStructureInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
        private String status;

        private ReverseJobStructureInitializationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseJobStructureInitializationStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private String percent; 
            private String progress; 
            private String status; 

            /**
             * The error message returned if initial schema synchronization failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The progress of initial schema synchronization. Unit: percentage.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The number of tables that have been synchronized during initial schema synchronization.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The state of initial schema synchronization. Valid values:
             * <p>
             * 
             * - **NotStarted**: The task is not started. 
             * - **Migrating**: The task is in progress. 
             * - **Failed**: The task failed. 
             * - **Finished**: The task is complete.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ReverseJobStructureInitializationStatus build() {
                return new ReverseJobStructureInitializationStatus(this);
            } 

        } 

    }
    public static class EtlDemoListReverseJob extends TeaModel {
        @NameInMap("Checkpoint")
        private String checkpoint;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DataInitializationStatus")
        private EtlDemoListReverseJobDataInitializationStatus dataInitializationStatus;

        @NameInMap("DataSynchronizationStatus")
        private EtlDemoListReverseJobDataSynchronizationStatus dataSynchronizationStatus;

        @NameInMap("DbObject")
        private String dbObject;

        @NameInMap("Delay")
        private Long delay;

        @NameInMap("DestinationEndpoint")
        private EtlDemoListReverseJobDestinationEndpoint destinationEndpoint;

        @NameInMap("DtsInstanceID")
        private String dtsInstanceID;

        @NameInMap("DtsJobClass")
        private String dtsJobClass;

        @NameInMap("DtsJobDirection")
        private String dtsJobDirection;

        @NameInMap("DtsJobId")
        private String dtsJobId;

        @NameInMap("DtsJobName")
        private String dtsJobName;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("EtlSafeCheckpoint")
        private String etlSafeCheckpoint;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("MigrationMode")
        private EtlDemoListReverseJobMigrationMode migrationMode;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("Performance")
        private EtlDemoListReverseJobPerformance performance;

        @NameInMap("PrecheckStatus")
        private EtlDemoListReverseJobPrecheckStatus precheckStatus;

        @NameInMap("Reserved")
        private String reserved;

        @NameInMap("SourceEndpoint")
        private ReverseJobSourceEndpoint sourceEndpoint;

        @NameInMap("Status")
        private String status;

        @NameInMap("StructureInitializationStatus")
        private ReverseJobStructureInitializationStatus structureInitializationStatus;

        private EtlDemoListReverseJob(Builder builder) {
            this.checkpoint = builder.checkpoint;
            this.createTime = builder.createTime;
            this.dataInitializationStatus = builder.dataInitializationStatus;
            this.dataSynchronizationStatus = builder.dataSynchronizationStatus;
            this.dbObject = builder.dbObject;
            this.delay = builder.delay;
            this.destinationEndpoint = builder.destinationEndpoint;
            this.dtsInstanceID = builder.dtsInstanceID;
            this.dtsJobClass = builder.dtsJobClass;
            this.dtsJobDirection = builder.dtsJobDirection;
            this.dtsJobId = builder.dtsJobId;
            this.dtsJobName = builder.dtsJobName;
            this.errorMessage = builder.errorMessage;
            this.etlSafeCheckpoint = builder.etlSafeCheckpoint;
            this.expireTime = builder.expireTime;
            this.migrationMode = builder.migrationMode;
            this.payType = builder.payType;
            this.performance = builder.performance;
            this.precheckStatus = builder.precheckStatus;
            this.reserved = builder.reserved;
            this.sourceEndpoint = builder.sourceEndpoint;
            this.status = builder.status;
            this.structureInitializationStatus = builder.structureInitializationStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EtlDemoListReverseJob create() {
            return builder().build();
        }

        /**
         * @return checkpoint
         */
        public String getCheckpoint() {
            return this.checkpoint;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataInitializationStatus
         */
        public EtlDemoListReverseJobDataInitializationStatus getDataInitializationStatus() {
            return this.dataInitializationStatus;
        }

        /**
         * @return dataSynchronizationStatus
         */
        public EtlDemoListReverseJobDataSynchronizationStatus getDataSynchronizationStatus() {
            return this.dataSynchronizationStatus;
        }

        /**
         * @return dbObject
         */
        public String getDbObject() {
            return this.dbObject;
        }

        /**
         * @return delay
         */
        public Long getDelay() {
            return this.delay;
        }

        /**
         * @return destinationEndpoint
         */
        public EtlDemoListReverseJobDestinationEndpoint getDestinationEndpoint() {
            return this.destinationEndpoint;
        }

        /**
         * @return dtsInstanceID
         */
        public String getDtsInstanceID() {
            return this.dtsInstanceID;
        }

        /**
         * @return dtsJobClass
         */
        public String getDtsJobClass() {
            return this.dtsJobClass;
        }

        /**
         * @return dtsJobDirection
         */
        public String getDtsJobDirection() {
            return this.dtsJobDirection;
        }

        /**
         * @return dtsJobId
         */
        public String getDtsJobId() {
            return this.dtsJobId;
        }

        /**
         * @return dtsJobName
         */
        public String getDtsJobName() {
            return this.dtsJobName;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return etlSafeCheckpoint
         */
        public String getEtlSafeCheckpoint() {
            return this.etlSafeCheckpoint;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return migrationMode
         */
        public EtlDemoListReverseJobMigrationMode getMigrationMode() {
            return this.migrationMode;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return performance
         */
        public EtlDemoListReverseJobPerformance getPerformance() {
            return this.performance;
        }

        /**
         * @return precheckStatus
         */
        public EtlDemoListReverseJobPrecheckStatus getPrecheckStatus() {
            return this.precheckStatus;
        }

        /**
         * @return reserved
         */
        public String getReserved() {
            return this.reserved;
        }

        /**
         * @return sourceEndpoint
         */
        public ReverseJobSourceEndpoint getSourceEndpoint() {
            return this.sourceEndpoint;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return structureInitializationStatus
         */
        public ReverseJobStructureInitializationStatus getStructureInitializationStatus() {
            return this.structureInitializationStatus;
        }

        public static final class Builder {
            private String checkpoint; 
            private String createTime; 
            private EtlDemoListReverseJobDataInitializationStatus dataInitializationStatus; 
            private EtlDemoListReverseJobDataSynchronizationStatus dataSynchronizationStatus; 
            private String dbObject; 
            private Long delay; 
            private EtlDemoListReverseJobDestinationEndpoint destinationEndpoint; 
            private String dtsInstanceID; 
            private String dtsJobClass; 
            private String dtsJobDirection; 
            private String dtsJobId; 
            private String dtsJobName; 
            private String errorMessage; 
            private String etlSafeCheckpoint; 
            private String expireTime; 
            private EtlDemoListReverseJobMigrationMode migrationMode; 
            private String payType; 
            private EtlDemoListReverseJobPerformance performance; 
            private EtlDemoListReverseJobPrecheckStatus precheckStatus; 
            private String reserved; 
            private ReverseJobSourceEndpoint sourceEndpoint; 
            private String status; 
            private ReverseJobStructureInitializationStatus structureInitializationStatus; 

            /**
             * The start offset of incremental data synchronization. This value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder checkpoint(String checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * The time when the task was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The state of initial full data synchronization.
             */
            public Builder dataInitializationStatus(EtlDemoListReverseJobDataInitializationStatus dataInitializationStatus) {
                this.dataInitializationStatus = dataInitializationStatus;
                return this;
            }

            /**
             * The state of incremental data synchronization.
             */
            public Builder dataSynchronizationStatus(EtlDemoListReverseJobDataSynchronizationStatus dataSynchronizationStatus) {
                this.dataSynchronizationStatus = dataSynchronizationStatus;
                return this;
            }

            /**
             * The schema of the objects that you want to synchronize. The value is a JSON string and can contain regular expressions. For more information, see Objects of DTS tasks.
             */
            public Builder dbObject(String dbObject) {
                this.dbObject = dbObject;
                return this;
            }

            /**
             * The latency of incremental data synchronization. Unit: seconds.
             */
            public Builder delay(Long delay) {
                this.delay = delay;
                return this;
            }

            /**
             * The connection settings of the destination instance.
             */
            public Builder destinationEndpoint(EtlDemoListReverseJobDestinationEndpoint destinationEndpoint) {
                this.destinationEndpoint = destinationEndpoint;
                return this;
            }

            /**
             * The ID of the data synchronization instance.
             */
            public Builder dtsInstanceID(String dtsInstanceID) {
                this.dtsInstanceID = dtsInstanceID;
                return this;
            }

            /**
             * The instance class. 
             * <p>
             * 
             * > For more information about the test performance of each instance class, see [Specifications of data synchronization instances](~~26605~~).
             */
            public Builder dtsJobClass(String dtsJobClass) {
                this.dtsJobClass = dtsJobClass;
                return this;
            }

            /**
             * The synchronization direction. **Reverse** is returned.
             */
            public Builder dtsJobDirection(String dtsJobDirection) {
                this.dtsJobDirection = dtsJobDirection;
                return this;
            }

            /**
             * The ID of the synchronization task.
             */
            public Builder dtsJobId(String dtsJobId) {
                this.dtsJobId = dtsJobId;
                return this;
            }

            /**
             * The name of the data synchronization task.
             */
            public Builder dtsJobName(String dtsJobName) {
                this.dtsJobName = dtsJobName;
                return this;
            }

            /**
             * The error message returned if the task failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The checkpoint of the ETL task.
             */
            public Builder etlSafeCheckpoint(String etlSafeCheckpoint) {
                this.etlSafeCheckpoint = etlSafeCheckpoint;
                return this;
            }

            /**
             * The time when the instance expires. The time follows the ISO 8601 standard in the* yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC. 
             * <p>
             * 
             * > This parameter is returned only if the returned value of **PayType** is **PrePaid**.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * The migration types or initial synchronization types.
             */
            public Builder migrationMode(EtlDemoListReverseJobMigrationMode migrationMode) {
                this.migrationMode = migrationMode;
                return this;
            }

            /**
             * The billing method of the DTS instance. Valid values:
             * <p>
             * 
             * - **PrePaid**: subscription
             * - **PostPaid**: pay-as-you-go
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * The performance of the data migration or synchronization instance.
             */
            public Builder performance(EtlDemoListReverseJobPerformance performance) {
                this.performance = performance;
                return this;
            }

            /**
             * The precheck state.
             */
            public Builder precheckStatus(EtlDemoListReverseJobPrecheckStatus precheckStatus) {
                this.precheckStatus = precheckStatus;
                return this;
            }

            /**
             * The reserved parameter of DTS. The value is a JSON string. You can specify this parameter to meet specific requirements, for example, whether to automatically start a precheck. For more information, see [MigrationReserved](~~176470~~).
             */
            public Builder reserved(String reserved) {
                this.reserved = reserved;
                return this;
            }

            /**
             * The connection settings of the source instance.
             */
            public Builder sourceEndpoint(ReverseJobSourceEndpoint sourceEndpoint) {
                this.sourceEndpoint = sourceEndpoint;
                return this;
            }

            /**
             * The state of the DTS instance. For more information about the valid values, see the description of the request parameter **Status**.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The state of initial schema synchronization.
             */
            public Builder structureInitializationStatus(ReverseJobStructureInitializationStatus structureInitializationStatus) {
                this.structureInitializationStatus = structureInitializationStatus;
                return this;
            }

            public EtlDemoListReverseJob build() {
                return new EtlDemoListReverseJob(this);
            } 

        } 

    }
    public static class EtlDemoListSourceEndpoint extends TeaModel {
        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("EngineName")
        private String engineName;

        @NameInMap("InstanceID")
        private String instanceID;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("OracleSID")
        private String oracleSID;

        @NameInMap("Port")
        private String port;

        @NameInMap("Region")
        private String region;

        @NameInMap("SslSolutionEnum")
        private String sslSolutionEnum;

        @NameInMap("UserName")
        private String userName;

        private EtlDemoListSourceEndpoint(Builder builder) {
            this.databaseName = builder.databaseName;
            this.engineName = builder.engineName;
            this.instanceID = builder.instanceID;
            this.instanceType = builder.instanceType;
            this.ip = builder.ip;
            this.oracleSID = builder.oracleSID;
            this.port = builder.port;
            this.region = builder.region;
            this.sslSolutionEnum = builder.sslSolutionEnum;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EtlDemoListSourceEndpoint create() {
            return builder().build();
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return engineName
         */
        public String getEngineName() {
            return this.engineName;
        }

        /**
         * @return instanceID
         */
        public String getInstanceID() {
            return this.instanceID;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return oracleSID
         */
        public String getOracleSID() {
            return this.oracleSID;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return sslSolutionEnum
         */
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String databaseName; 
            private String engineName; 
            private String instanceID; 
            private String instanceType; 
            private String ip; 
            private String oracleSID; 
            private String port; 
            private String region; 
            private String sslSolutionEnum; 
            private String userName; 

            /**
             * The name of the database that contains the objects to be migrated from the source instance.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * The database engine of the source instance.
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * The ID of the source instance.
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * The type of the source instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The endpoint of the source instance.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The SID of the Oracle database. 
             * <p>
             * 
             * > This parameter is returned only if the returned value of **EngineName** of the source instance is **Oracle** and the Oracle database is deployed in a non-RAC architecture.
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
                return this;
            }

            /**
             * The port number of the source instance.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The ID of the region in which the source instance resides. For more information, see [Supported regions](~~141033~~).
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Indicates whether SSL encryption is enabled. Valid values:
             * <p>
             * 
             * - **DISABLE**: SSL encryption is disabled. 
             * - **ENABLE_WITH_CERTIFICATE**: SSL encryption is enabled and the CA certificate is uploaded. 
             * - **ENABLE_ONLY_4_MONGODB_ALTAS**: SSL encryption is enabled for the connection with an AWS MongoDB Altas database. 
             * - **ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256**: SCRAM-SHA-256 is used to encrypt the connection with a Kafka cluster.
             */
            public Builder sslSolutionEnum(String sslSolutionEnum) {
                this.sslSolutionEnum = sslSolutionEnum;
                return this;
            }

            /**
             * The database account of the source instance.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public EtlDemoListSourceEndpoint build() {
                return new EtlDemoListSourceEndpoint(this);
            } 

        } 

    }
    public static class EtlDemoListStructureInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
        private String status;

        private EtlDemoListStructureInitializationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EtlDemoListStructureInitializationStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private String percent; 
            private String progress; 
            private String status; 

            /**
             * The error message returned if schema migration or initial schema synchronization failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The progress of schema migration or initial schema synchronization. Unit: percentage.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The number of tables that have been migrated or synchronized during schema migration or initial schema synchronization.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The state of schema migration or initial schema synchronization. Valid values:
             * <p>
             * 
             * - **NotStarted**: The task is not started. 
             * - **Migrating**: The task is in progress. 
             * - **Failed**: The task failed. 
             * - **Finished**: The task is complete.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public EtlDemoListStructureInitializationStatus build() {
                return new EtlDemoListStructureInitializationStatus(this);
            } 

        } 

    }
    public static class EtlDemoListTagList extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
        private String tagValue;

        private EtlDemoListTagList(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EtlDemoListTagList create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * The tag key.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public EtlDemoListTagList build() {
                return new EtlDemoListTagList(this);
            } 

        } 

    }
    public static class EtlDemoList extends TeaModel {
        @NameInMap("AppName")
        private String appName;

        @NameInMap("BeginTimestamp")
        private String beginTimestamp;

        @NameInMap("Checkpoint")
        private String checkpoint;

        @NameInMap("ConsumptionCheckpoint")
        private String consumptionCheckpoint;

        @NameInMap("ConsumptionClient")
        private String consumptionClient;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DataEtlStatus")
        private EtlDemoListDataEtlStatus dataEtlStatus;

        @NameInMap("DataInitializationStatus")
        private EtlDemoListDataInitializationStatus dataInitializationStatus;

        @NameInMap("DataSynchronizationStatus")
        private EtlDemoListDataSynchronizationStatus dataSynchronizationStatus;

        @NameInMap("DbObject")
        private String dbObject;

        @NameInMap("Delay")
        private Long delay;

        @NameInMap("DestinationEndpoint")
        private EtlDemoListDestinationEndpoint destinationEndpoint;

        @NameInMap("DtsInstanceID")
        private String dtsInstanceID;

        @NameInMap("DtsJobClass")
        private String dtsJobClass;

        @NameInMap("DtsJobDirection")
        private String dtsJobDirection;

        @NameInMap("DtsJobId")
        private String dtsJobId;

        @NameInMap("DtsJobName")
        private String dtsJobName;

        @NameInMap("EndTimestamp")
        private String endTimestamp;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("EtlSafeCheckpoint")
        private String etlSafeCheckpoint;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("JobType")
        private String jobType;

        @NameInMap("MigrationMode")
        private EtlDemoListMigrationMode migrationMode;

        @NameInMap("OriginType")
        private String originType;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("Performance")
        private EtlDemoListPerformance performance;

        @NameInMap("PrecheckStatus")
        private EtlDemoListPrecheckStatus precheckStatus;

        @NameInMap("Reserved")
        private String reserved;

        @NameInMap("ResourceGroupDisplayName")
        private String resourceGroupDisplayName;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("RetryState")
        private EtlDemoListRetryState retryState;

        @NameInMap("ReverseJob")
        private EtlDemoListReverseJob reverseJob;

        @NameInMap("SourceEndpoint")
        private EtlDemoListSourceEndpoint sourceEndpoint;

        @NameInMap("Status")
        private String status;

        @NameInMap("StructureInitializationStatus")
        private EtlDemoListStructureInitializationStatus structureInitializationStatus;

        @NameInMap("TagList")
        private java.util.List < EtlDemoListTagList> tagList;

        private EtlDemoList(Builder builder) {
            this.appName = builder.appName;
            this.beginTimestamp = builder.beginTimestamp;
            this.checkpoint = builder.checkpoint;
            this.consumptionCheckpoint = builder.consumptionCheckpoint;
            this.consumptionClient = builder.consumptionClient;
            this.createTime = builder.createTime;
            this.dataEtlStatus = builder.dataEtlStatus;
            this.dataInitializationStatus = builder.dataInitializationStatus;
            this.dataSynchronizationStatus = builder.dataSynchronizationStatus;
            this.dbObject = builder.dbObject;
            this.delay = builder.delay;
            this.destinationEndpoint = builder.destinationEndpoint;
            this.dtsInstanceID = builder.dtsInstanceID;
            this.dtsJobClass = builder.dtsJobClass;
            this.dtsJobDirection = builder.dtsJobDirection;
            this.dtsJobId = builder.dtsJobId;
            this.dtsJobName = builder.dtsJobName;
            this.endTimestamp = builder.endTimestamp;
            this.errorMessage = builder.errorMessage;
            this.etlSafeCheckpoint = builder.etlSafeCheckpoint;
            this.expireTime = builder.expireTime;
            this.jobType = builder.jobType;
            this.migrationMode = builder.migrationMode;
            this.originType = builder.originType;
            this.payType = builder.payType;
            this.performance = builder.performance;
            this.precheckStatus = builder.precheckStatus;
            this.reserved = builder.reserved;
            this.resourceGroupDisplayName = builder.resourceGroupDisplayName;
            this.resourceGroupId = builder.resourceGroupId;
            this.retryState = builder.retryState;
            this.reverseJob = builder.reverseJob;
            this.sourceEndpoint = builder.sourceEndpoint;
            this.status = builder.status;
            this.structureInitializationStatus = builder.structureInitializationStatus;
            this.tagList = builder.tagList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EtlDemoList create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return beginTimestamp
         */
        public String getBeginTimestamp() {
            return this.beginTimestamp;
        }

        /**
         * @return checkpoint
         */
        public String getCheckpoint() {
            return this.checkpoint;
        }

        /**
         * @return consumptionCheckpoint
         */
        public String getConsumptionCheckpoint() {
            return this.consumptionCheckpoint;
        }

        /**
         * @return consumptionClient
         */
        public String getConsumptionClient() {
            return this.consumptionClient;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataEtlStatus
         */
        public EtlDemoListDataEtlStatus getDataEtlStatus() {
            return this.dataEtlStatus;
        }

        /**
         * @return dataInitializationStatus
         */
        public EtlDemoListDataInitializationStatus getDataInitializationStatus() {
            return this.dataInitializationStatus;
        }

        /**
         * @return dataSynchronizationStatus
         */
        public EtlDemoListDataSynchronizationStatus getDataSynchronizationStatus() {
            return this.dataSynchronizationStatus;
        }

        /**
         * @return dbObject
         */
        public String getDbObject() {
            return this.dbObject;
        }

        /**
         * @return delay
         */
        public Long getDelay() {
            return this.delay;
        }

        /**
         * @return destinationEndpoint
         */
        public EtlDemoListDestinationEndpoint getDestinationEndpoint() {
            return this.destinationEndpoint;
        }

        /**
         * @return dtsInstanceID
         */
        public String getDtsInstanceID() {
            return this.dtsInstanceID;
        }

        /**
         * @return dtsJobClass
         */
        public String getDtsJobClass() {
            return this.dtsJobClass;
        }

        /**
         * @return dtsJobDirection
         */
        public String getDtsJobDirection() {
            return this.dtsJobDirection;
        }

        /**
         * @return dtsJobId
         */
        public String getDtsJobId() {
            return this.dtsJobId;
        }

        /**
         * @return dtsJobName
         */
        public String getDtsJobName() {
            return this.dtsJobName;
        }

        /**
         * @return endTimestamp
         */
        public String getEndTimestamp() {
            return this.endTimestamp;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return etlSafeCheckpoint
         */
        public String getEtlSafeCheckpoint() {
            return this.etlSafeCheckpoint;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return jobType
         */
        public String getJobType() {
            return this.jobType;
        }

        /**
         * @return migrationMode
         */
        public EtlDemoListMigrationMode getMigrationMode() {
            return this.migrationMode;
        }

        /**
         * @return originType
         */
        public String getOriginType() {
            return this.originType;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return performance
         */
        public EtlDemoListPerformance getPerformance() {
            return this.performance;
        }

        /**
         * @return precheckStatus
         */
        public EtlDemoListPrecheckStatus getPrecheckStatus() {
            return this.precheckStatus;
        }

        /**
         * @return reserved
         */
        public String getReserved() {
            return this.reserved;
        }

        /**
         * @return resourceGroupDisplayName
         */
        public String getResourceGroupDisplayName() {
            return this.resourceGroupDisplayName;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return retryState
         */
        public EtlDemoListRetryState getRetryState() {
            return this.retryState;
        }

        /**
         * @return reverseJob
         */
        public EtlDemoListReverseJob getReverseJob() {
            return this.reverseJob;
        }

        /**
         * @return sourceEndpoint
         */
        public EtlDemoListSourceEndpoint getSourceEndpoint() {
            return this.sourceEndpoint;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return structureInitializationStatus
         */
        public EtlDemoListStructureInitializationStatus getStructureInitializationStatus() {
            return this.structureInitializationStatus;
        }

        /**
         * @return tagList
         */
        public java.util.List < EtlDemoListTagList> getTagList() {
            return this.tagList;
        }

        public static final class Builder {
            private String appName; 
            private String beginTimestamp; 
            private String checkpoint; 
            private String consumptionCheckpoint; 
            private String consumptionClient; 
            private String createTime; 
            private EtlDemoListDataEtlStatus dataEtlStatus; 
            private EtlDemoListDataInitializationStatus dataInitializationStatus; 
            private EtlDemoListDataSynchronizationStatus dataSynchronizationStatus; 
            private String dbObject; 
            private Long delay; 
            private EtlDemoListDestinationEndpoint destinationEndpoint; 
            private String dtsInstanceID; 
            private String dtsJobClass; 
            private String dtsJobDirection; 
            private String dtsJobId; 
            private String dtsJobName; 
            private String endTimestamp; 
            private String errorMessage; 
            private String etlSafeCheckpoint; 
            private String expireTime; 
            private String jobType; 
            private EtlDemoListMigrationMode migrationMode; 
            private String originType; 
            private String payType; 
            private EtlDemoListPerformance performance; 
            private EtlDemoListPrecheckStatus precheckStatus; 
            private String reserved; 
            private String resourceGroupDisplayName; 
            private String resourceGroupId; 
            private EtlDemoListRetryState retryState; 
            private EtlDemoListReverseJob reverseJob; 
            private EtlDemoListSourceEndpoint sourceEndpoint; 
            private String status; 
            private EtlDemoListStructureInitializationStatus structureInitializationStatus; 
            private java.util.List < EtlDemoListTagList> tagList; 

            /**
             * Indicates whether the **new** change tracking feature is used. 
             * <p>
             * 
             * > This parameter is returned only for change tracking instances of the new version.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * The start of the time range for change tracking. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder beginTimestamp(String beginTimestamp) {
                this.beginTimestamp = beginTimestamp;
                return this;
            }

            /**
             * The start offset of incremental data migration or data synchronization. This value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder checkpoint(String checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * The consumption checkpoint of the change tracking instance. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder consumptionCheckpoint(String consumptionCheckpoint) {
                this.consumptionCheckpoint = consumptionCheckpoint;
                return this;
            }

            /**
             * The downstream client information in the following format: <IP address of the downstream client>:<Random ID generated by DTS>.
             */
            public Builder consumptionClient(String consumptionClient) {
                this.consumptionClient = consumptionClient;
                return this;
            }

            /**
             * The time when the task was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:s*sZ format. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The state of the ETL task. 
             * <p>
             * 
             * > This parameter collection is returned only if an ETL task is configured.
             */
            public Builder dataEtlStatus(EtlDemoListDataEtlStatus dataEtlStatus) {
                this.dataEtlStatus = dataEtlStatus;
                return this;
            }

            /**
             * The state of full data migration or initial full data synchronization.
             */
            public Builder dataInitializationStatus(EtlDemoListDataInitializationStatus dataInitializationStatus) {
                this.dataInitializationStatus = dataInitializationStatus;
                return this;
            }

            /**
             * The state of incremental data migration or synchronization.
             */
            public Builder dataSynchronizationStatus(EtlDemoListDataSynchronizationStatus dataSynchronizationStatus) {
                this.dataSynchronizationStatus = dataSynchronizationStatus;
                return this;
            }

            /**
             * The objects of the data migration, data synchronization, or change tracking task. For more information, see [Objects of DTS tasks](~~209545~~).
             */
            public Builder dbObject(String dbObject) {
                this.dbObject = dbObject;
                return this;
            }

            /**
             * The latency of incremental data migration or synchronization. 
             * <p>
             * 
             * > If you query data migration tasks, the unit of this parameter is milliseconds. If you query data synchronization tasks, the unit of this parameter is seconds.
             */
            public Builder delay(Long delay) {
                this.delay = delay;
                return this;
            }

            /**
             * The connection settings of the destination instance.
             */
            public Builder destinationEndpoint(EtlDemoListDestinationEndpoint destinationEndpoint) {
                this.destinationEndpoint = destinationEndpoint;
                return this;
            }

            /**
             * The ID of the data migration, data synchronization, or change tracking instance.
             */
            public Builder dtsInstanceID(String dtsInstanceID) {
                this.dtsInstanceID = dtsInstanceID;
                return this;
            }

            /**
             * The instance class. 
             * <p>
             * 
             * > For more information about the test performance of each instance class, see [Specifications of data migration instances](~~26606~~) and [Specifications of data synchronization instances](~~26605~~).
             */
            public Builder dtsJobClass(String dtsJobClass) {
                this.dtsJobClass = dtsJobClass;
                return this;
            }

            /**
             * The synchronization direction. Valid values:
             * <p>
             * 
             * - **Forward**
             * - **Reverse**
             * 
             * > This parameter is returned only if the topology of the data synchronization instance is two-way synchronization.
             */
            public Builder dtsJobDirection(String dtsJobDirection) {
                this.dtsJobDirection = dtsJobDirection;
                return this;
            }

            /**
             * The ID of the data migration, data synchronization, or change tracking task.
             */
            public Builder dtsJobId(String dtsJobId) {
                this.dtsJobId = dtsJobId;
                return this;
            }

            /**
             * The name of the data migration, data synchronization, or change tracking task.
             */
            public Builder dtsJobName(String dtsJobName) {
                this.dtsJobName = dtsJobName;
                return this;
            }

            /**
             * The end of the time range for change tracking. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder endTimestamp(String endTimestamp) {
                this.endTimestamp = endTimestamp;
                return this;
            }

            /**
             * The error message returned if the task failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The checkpoint of the ETL task.
             */
            public Builder etlSafeCheckpoint(String etlSafeCheckpoint) {
                this.etlSafeCheckpoint = etlSafeCheckpoint;
                return this;
            }

            /**
             * The time when the instance expires. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             * <p>
             * 
             * > This parameter is returned only if the returned value of **PayType** is **PrePaid**.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * The type of the DTS task. Valid values:
             * <p>
             * 
             * - **MIGRATION**: data migration task 
             * - **SYNC**: data synchronization task 
             * - **SUBSCRIBE**: change tracking task
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * The migration types or initial synchronization types.
             */
            public Builder migrationMode(EtlDemoListMigrationMode migrationMode) {
                this.migrationMode = migrationMode;
                return this;
            }

            /**
             * The source of the task.
             * <p>
             * - **PTS**
             * - **DMS**
             * - **DTS**
             */
            public Builder originType(String originType) {
                this.originType = originType;
                return this;
            }

            /**
             * The billing method of the DTS instance. Valid values:
             * <p>
             * 
             * - **PrePaid**: subscription 
             * - **PostPaid**: pay-as-you-go
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * The performance of the data migration or synchronization instance.
             */
            public Builder performance(EtlDemoListPerformance performance) {
                this.performance = performance;
                return this;
            }

            /**
             * The precheck state.
             */
            public Builder precheckStatus(EtlDemoListPrecheckStatus precheckStatus) {
                this.precheckStatus = precheckStatus;
                return this;
            }

            /**
             * The reserved parameter of DTS. The value is a JSON string. You can specify this parameter to meet specific requirements, for example, whether to automatically start a precheck. For more information, see [MigrationReserved](~~176470~~).
             */
            public Builder reserved(String reserved) {
                this.reserved = reserved;
                return this;
            }

            /**
             * The name of the resource group.
             */
            public Builder resourceGroupDisplayName(String resourceGroupDisplayName) {
                this.resourceGroupDisplayName = resourceGroupDisplayName;
                return this;
            }

            /**
             * The resource group ID.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The information about the retries performed by DTS due to an exception.
             */
            public Builder retryState(EtlDemoListRetryState retryState) {
                this.retryState = retryState;
                return this;
            }

            /**
             * The details of the data synchronization task in the reverse direction. 
             * <p>
             * 
             * > This parameter is returned only for two-way data synchronization tasks.
             */
            public Builder reverseJob(EtlDemoListReverseJob reverseJob) {
                this.reverseJob = reverseJob;
                return this;
            }

            /**
             * The connection settings of the source instance.
             */
            public Builder sourceEndpoint(EtlDemoListSourceEndpoint sourceEndpoint) {
                this.sourceEndpoint = sourceEndpoint;
                return this;
            }

            /**
             * The state of the DTS instance. For more information about the valid values, see the description of the request parameter **Status**.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The state of schema migration or initial schema synchronization.
             */
            public Builder structureInitializationStatus(EtlDemoListStructureInitializationStatus structureInitializationStatus) {
                this.structureInitializationStatus = structureInitializationStatus;
                return this;
            }

            /**
             * The tags of the task.
             */
            public Builder tagList(java.util.List < EtlDemoListTagList> tagList) {
                this.tagList = tagList;
                return this;
            }

            public EtlDemoList build() {
                return new EtlDemoList(this);
            } 

        } 

    }
}
