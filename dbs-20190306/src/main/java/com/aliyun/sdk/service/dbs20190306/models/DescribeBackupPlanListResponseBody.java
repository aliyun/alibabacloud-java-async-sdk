// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupPlanListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupPlanListResponseBody</p>
 */
public class DescribeBackupPlanListResponseBody extends TeaModel {
    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Items")
    private Items items;

    @NameInMap("PageNum")
    private Integer pageNum;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalElements")
    private Integer totalElements;

    @NameInMap("TotalPages")
    private Integer totalPages;

    private DescribeBackupPlanListResponseBody(Builder builder) {
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.items = builder.items;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalElements = builder.totalElements;
        this.totalPages = builder.totalPages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupPlanListResponseBody create() {
        return builder().build();
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
     * @return totalElements
     */
    public Integer getTotalElements() {
        return this.totalElements;
    }

    /**
     * @return totalPages
     */
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static final class Builder {
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private Items items; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalElements; 
        private Integer totalPages; 

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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

        /**
         * TotalElements.
         */
        public Builder totalElements(Integer totalElements) {
            this.totalElements = totalElements;
            return this;
        }

        /**
         * TotalPages.
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public DescribeBackupPlanListResponseBody build() {
            return new DescribeBackupPlanListResponseBody(this);
        } 

    } 

    public static class BackupPlanDetail extends TeaModel {
        @NameInMap("BackupGatewayId")
        private Long backupGatewayId;

        @NameInMap("BackupMethod")
        private String backupMethod;

        @NameInMap("BackupObjects")
        private String backupObjects;

        @NameInMap("BackupPeriod")
        private String backupPeriod;

        @NameInMap("BackupPlanCreateTime")
        private Long backupPlanCreateTime;

        @NameInMap("BackupPlanId")
        private String backupPlanId;

        @NameInMap("BackupPlanName")
        private String backupPlanName;

        @NameInMap("BackupPlanStatus")
        private String backupPlanStatus;

        @NameInMap("BackupRetentionPeriod")
        private Integer backupRetentionPeriod;

        @NameInMap("BackupSetDownloadDir")
        private String backupSetDownloadDir;

        @NameInMap("BackupSetDownloadFullDataFormat")
        private String backupSetDownloadFullDataFormat;

        @NameInMap("BackupSetDownloadGatewayId")
        private Long backupSetDownloadGatewayId;

        @NameInMap("BackupSetDownloadIncrementDataFormat")
        private String backupSetDownloadIncrementDataFormat;

        @NameInMap("BackupSetDownloadTargetType")
        private String backupSetDownloadTargetType;

        @NameInMap("BackupStartTime")
        private String backupStartTime;

        @NameInMap("BackupStorageType")
        private String backupStorageType;

        @NameInMap("BeginTimestampForRestore")
        private Long beginTimestampForRestore;

        @NameInMap("CrossAliyunId")
        private String crossAliyunId;

        @NameInMap("CrossRoleName")
        private String crossRoleName;

        @NameInMap("DuplicationArchivePeriod")
        private Integer duplicationArchivePeriod;

        @NameInMap("DuplicationInfrequentAccessPeriod")
        private Integer duplicationInfrequentAccessPeriod;

        @NameInMap("EnableBackupLog")
        private Boolean enableBackupLog;

        @NameInMap("EndTimestampForRestore")
        private Long endTimestampForRestore;

        @NameInMap("ErrMessage")
        private String errMessage;

        @NameInMap("InstanceClass")
        private String instanceClass;

        @NameInMap("OSSBucketName")
        private String OSSBucketName;

        @NameInMap("OSSBucketRegion")
        private String OSSBucketRegion;

        @NameInMap("OpenBackupSetAutoDownload")
        private Boolean openBackupSetAutoDownload;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("SourceEndpointDatabaseName")
        private String sourceEndpointDatabaseName;

        @NameInMap("SourceEndpointInstanceID")
        private String sourceEndpointInstanceID;

        @NameInMap("SourceEndpointInstanceType")
        private String sourceEndpointInstanceType;

        @NameInMap("SourceEndpointIpPort")
        private String sourceEndpointIpPort;

        @NameInMap("SourceEndpointOracleSID")
        private String sourceEndpointOracleSID;

        @NameInMap("SourceEndpointRegion")
        private String sourceEndpointRegion;

        @NameInMap("SourceEndpointUserName")
        private String sourceEndpointUserName;

        private BackupPlanDetail(Builder builder) {
            this.backupGatewayId = builder.backupGatewayId;
            this.backupMethod = builder.backupMethod;
            this.backupObjects = builder.backupObjects;
            this.backupPeriod = builder.backupPeriod;
            this.backupPlanCreateTime = builder.backupPlanCreateTime;
            this.backupPlanId = builder.backupPlanId;
            this.backupPlanName = builder.backupPlanName;
            this.backupPlanStatus = builder.backupPlanStatus;
            this.backupRetentionPeriod = builder.backupRetentionPeriod;
            this.backupSetDownloadDir = builder.backupSetDownloadDir;
            this.backupSetDownloadFullDataFormat = builder.backupSetDownloadFullDataFormat;
            this.backupSetDownloadGatewayId = builder.backupSetDownloadGatewayId;
            this.backupSetDownloadIncrementDataFormat = builder.backupSetDownloadIncrementDataFormat;
            this.backupSetDownloadTargetType = builder.backupSetDownloadTargetType;
            this.backupStartTime = builder.backupStartTime;
            this.backupStorageType = builder.backupStorageType;
            this.beginTimestampForRestore = builder.beginTimestampForRestore;
            this.crossAliyunId = builder.crossAliyunId;
            this.crossRoleName = builder.crossRoleName;
            this.duplicationArchivePeriod = builder.duplicationArchivePeriod;
            this.duplicationInfrequentAccessPeriod = builder.duplicationInfrequentAccessPeriod;
            this.enableBackupLog = builder.enableBackupLog;
            this.endTimestampForRestore = builder.endTimestampForRestore;
            this.errMessage = builder.errMessage;
            this.instanceClass = builder.instanceClass;
            this.OSSBucketName = builder.OSSBucketName;
            this.OSSBucketRegion = builder.OSSBucketRegion;
            this.openBackupSetAutoDownload = builder.openBackupSetAutoDownload;
            this.resourceGroupId = builder.resourceGroupId;
            this.sourceEndpointDatabaseName = builder.sourceEndpointDatabaseName;
            this.sourceEndpointInstanceID = builder.sourceEndpointInstanceID;
            this.sourceEndpointInstanceType = builder.sourceEndpointInstanceType;
            this.sourceEndpointIpPort = builder.sourceEndpointIpPort;
            this.sourceEndpointOracleSID = builder.sourceEndpointOracleSID;
            this.sourceEndpointRegion = builder.sourceEndpointRegion;
            this.sourceEndpointUserName = builder.sourceEndpointUserName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackupPlanDetail create() {
            return builder().build();
        }

        /**
         * @return backupGatewayId
         */
        public Long getBackupGatewayId() {
            return this.backupGatewayId;
        }

        /**
         * @return backupMethod
         */
        public String getBackupMethod() {
            return this.backupMethod;
        }

        /**
         * @return backupObjects
         */
        public String getBackupObjects() {
            return this.backupObjects;
        }

        /**
         * @return backupPeriod
         */
        public String getBackupPeriod() {
            return this.backupPeriod;
        }

        /**
         * @return backupPlanCreateTime
         */
        public Long getBackupPlanCreateTime() {
            return this.backupPlanCreateTime;
        }

        /**
         * @return backupPlanId
         */
        public String getBackupPlanId() {
            return this.backupPlanId;
        }

        /**
         * @return backupPlanName
         */
        public String getBackupPlanName() {
            return this.backupPlanName;
        }

        /**
         * @return backupPlanStatus
         */
        public String getBackupPlanStatus() {
            return this.backupPlanStatus;
        }

        /**
         * @return backupRetentionPeriod
         */
        public Integer getBackupRetentionPeriod() {
            return this.backupRetentionPeriod;
        }

        /**
         * @return backupSetDownloadDir
         */
        public String getBackupSetDownloadDir() {
            return this.backupSetDownloadDir;
        }

        /**
         * @return backupSetDownloadFullDataFormat
         */
        public String getBackupSetDownloadFullDataFormat() {
            return this.backupSetDownloadFullDataFormat;
        }

        /**
         * @return backupSetDownloadGatewayId
         */
        public Long getBackupSetDownloadGatewayId() {
            return this.backupSetDownloadGatewayId;
        }

        /**
         * @return backupSetDownloadIncrementDataFormat
         */
        public String getBackupSetDownloadIncrementDataFormat() {
            return this.backupSetDownloadIncrementDataFormat;
        }

        /**
         * @return backupSetDownloadTargetType
         */
        public String getBackupSetDownloadTargetType() {
            return this.backupSetDownloadTargetType;
        }

        /**
         * @return backupStartTime
         */
        public String getBackupStartTime() {
            return this.backupStartTime;
        }

        /**
         * @return backupStorageType
         */
        public String getBackupStorageType() {
            return this.backupStorageType;
        }

        /**
         * @return beginTimestampForRestore
         */
        public Long getBeginTimestampForRestore() {
            return this.beginTimestampForRestore;
        }

        /**
         * @return crossAliyunId
         */
        public String getCrossAliyunId() {
            return this.crossAliyunId;
        }

        /**
         * @return crossRoleName
         */
        public String getCrossRoleName() {
            return this.crossRoleName;
        }

        /**
         * @return duplicationArchivePeriod
         */
        public Integer getDuplicationArchivePeriod() {
            return this.duplicationArchivePeriod;
        }

        /**
         * @return duplicationInfrequentAccessPeriod
         */
        public Integer getDuplicationInfrequentAccessPeriod() {
            return this.duplicationInfrequentAccessPeriod;
        }

        /**
         * @return enableBackupLog
         */
        public Boolean getEnableBackupLog() {
            return this.enableBackupLog;
        }

        /**
         * @return endTimestampForRestore
         */
        public Long getEndTimestampForRestore() {
            return this.endTimestampForRestore;
        }

        /**
         * @return errMessage
         */
        public String getErrMessage() {
            return this.errMessage;
        }

        /**
         * @return instanceClass
         */
        public String getInstanceClass() {
            return this.instanceClass;
        }

        /**
         * @return OSSBucketName
         */
        public String getOSSBucketName() {
            return this.OSSBucketName;
        }

        /**
         * @return OSSBucketRegion
         */
        public String getOSSBucketRegion() {
            return this.OSSBucketRegion;
        }

        /**
         * @return openBackupSetAutoDownload
         */
        public Boolean getOpenBackupSetAutoDownload() {
            return this.openBackupSetAutoDownload;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return sourceEndpointDatabaseName
         */
        public String getSourceEndpointDatabaseName() {
            return this.sourceEndpointDatabaseName;
        }

        /**
         * @return sourceEndpointInstanceID
         */
        public String getSourceEndpointInstanceID() {
            return this.sourceEndpointInstanceID;
        }

        /**
         * @return sourceEndpointInstanceType
         */
        public String getSourceEndpointInstanceType() {
            return this.sourceEndpointInstanceType;
        }

        /**
         * @return sourceEndpointIpPort
         */
        public String getSourceEndpointIpPort() {
            return this.sourceEndpointIpPort;
        }

        /**
         * @return sourceEndpointOracleSID
         */
        public String getSourceEndpointOracleSID() {
            return this.sourceEndpointOracleSID;
        }

        /**
         * @return sourceEndpointRegion
         */
        public String getSourceEndpointRegion() {
            return this.sourceEndpointRegion;
        }

        /**
         * @return sourceEndpointUserName
         */
        public String getSourceEndpointUserName() {
            return this.sourceEndpointUserName;
        }

        public static final class Builder {
            private Long backupGatewayId; 
            private String backupMethod; 
            private String backupObjects; 
            private String backupPeriod; 
            private Long backupPlanCreateTime; 
            private String backupPlanId; 
            private String backupPlanName; 
            private String backupPlanStatus; 
            private Integer backupRetentionPeriod; 
            private String backupSetDownloadDir; 
            private String backupSetDownloadFullDataFormat; 
            private Long backupSetDownloadGatewayId; 
            private String backupSetDownloadIncrementDataFormat; 
            private String backupSetDownloadTargetType; 
            private String backupStartTime; 
            private String backupStorageType; 
            private Long beginTimestampForRestore; 
            private String crossAliyunId; 
            private String crossRoleName; 
            private Integer duplicationArchivePeriod; 
            private Integer duplicationInfrequentAccessPeriod; 
            private Boolean enableBackupLog; 
            private Long endTimestampForRestore; 
            private String errMessage; 
            private String instanceClass; 
            private String OSSBucketName; 
            private String OSSBucketRegion; 
            private Boolean openBackupSetAutoDownload; 
            private String resourceGroupId; 
            private String sourceEndpointDatabaseName; 
            private String sourceEndpointInstanceID; 
            private String sourceEndpointInstanceType; 
            private String sourceEndpointIpPort; 
            private String sourceEndpointOracleSID; 
            private String sourceEndpointRegion; 
            private String sourceEndpointUserName; 

            /**
             * BackupGatewayId.
             */
            public Builder backupGatewayId(Long backupGatewayId) {
                this.backupGatewayId = backupGatewayId;
                return this;
            }

            /**
             * BackupMethod.
             */
            public Builder backupMethod(String backupMethod) {
                this.backupMethod = backupMethod;
                return this;
            }

            /**
             * BackupObjects.
             */
            public Builder backupObjects(String backupObjects) {
                this.backupObjects = backupObjects;
                return this;
            }

            /**
             * BackupPeriod.
             */
            public Builder backupPeriod(String backupPeriod) {
                this.backupPeriod = backupPeriod;
                return this;
            }

            /**
             * BackupPlanCreateTime.
             */
            public Builder backupPlanCreateTime(Long backupPlanCreateTime) {
                this.backupPlanCreateTime = backupPlanCreateTime;
                return this;
            }

            /**
             * BackupPlanId.
             */
            public Builder backupPlanId(String backupPlanId) {
                this.backupPlanId = backupPlanId;
                return this;
            }

            /**
             * BackupPlanName.
             */
            public Builder backupPlanName(String backupPlanName) {
                this.backupPlanName = backupPlanName;
                return this;
            }

            /**
             * BackupPlanStatus.
             */
            public Builder backupPlanStatus(String backupPlanStatus) {
                this.backupPlanStatus = backupPlanStatus;
                return this;
            }

            /**
             * BackupRetentionPeriod.
             */
            public Builder backupRetentionPeriod(Integer backupRetentionPeriod) {
                this.backupRetentionPeriod = backupRetentionPeriod;
                return this;
            }

            /**
             * BackupSetDownloadDir.
             */
            public Builder backupSetDownloadDir(String backupSetDownloadDir) {
                this.backupSetDownloadDir = backupSetDownloadDir;
                return this;
            }

            /**
             * BackupSetDownloadFullDataFormat.
             */
            public Builder backupSetDownloadFullDataFormat(String backupSetDownloadFullDataFormat) {
                this.backupSetDownloadFullDataFormat = backupSetDownloadFullDataFormat;
                return this;
            }

            /**
             * BackupSetDownloadGatewayId.
             */
            public Builder backupSetDownloadGatewayId(Long backupSetDownloadGatewayId) {
                this.backupSetDownloadGatewayId = backupSetDownloadGatewayId;
                return this;
            }

            /**
             * BackupSetDownloadIncrementDataFormat.
             */
            public Builder backupSetDownloadIncrementDataFormat(String backupSetDownloadIncrementDataFormat) {
                this.backupSetDownloadIncrementDataFormat = backupSetDownloadIncrementDataFormat;
                return this;
            }

            /**
             * BackupSetDownloadTargetType.
             */
            public Builder backupSetDownloadTargetType(String backupSetDownloadTargetType) {
                this.backupSetDownloadTargetType = backupSetDownloadTargetType;
                return this;
            }

            /**
             * BackupStartTime.
             */
            public Builder backupStartTime(String backupStartTime) {
                this.backupStartTime = backupStartTime;
                return this;
            }

            /**
             * BackupStorageType.
             */
            public Builder backupStorageType(String backupStorageType) {
                this.backupStorageType = backupStorageType;
                return this;
            }

            /**
             * BeginTimestampForRestore.
             */
            public Builder beginTimestampForRestore(Long beginTimestampForRestore) {
                this.beginTimestampForRestore = beginTimestampForRestore;
                return this;
            }

            /**
             * CrossAliyunId.
             */
            public Builder crossAliyunId(String crossAliyunId) {
                this.crossAliyunId = crossAliyunId;
                return this;
            }

            /**
             * CrossRoleName.
             */
            public Builder crossRoleName(String crossRoleName) {
                this.crossRoleName = crossRoleName;
                return this;
            }

            /**
             * DuplicationArchivePeriod.
             */
            public Builder duplicationArchivePeriod(Integer duplicationArchivePeriod) {
                this.duplicationArchivePeriod = duplicationArchivePeriod;
                return this;
            }

            /**
             * DuplicationInfrequentAccessPeriod.
             */
            public Builder duplicationInfrequentAccessPeriod(Integer duplicationInfrequentAccessPeriod) {
                this.duplicationInfrequentAccessPeriod = duplicationInfrequentAccessPeriod;
                return this;
            }

            /**
             * EnableBackupLog.
             */
            public Builder enableBackupLog(Boolean enableBackupLog) {
                this.enableBackupLog = enableBackupLog;
                return this;
            }

            /**
             * EndTimestampForRestore.
             */
            public Builder endTimestampForRestore(Long endTimestampForRestore) {
                this.endTimestampForRestore = endTimestampForRestore;
                return this;
            }

            /**
             * ErrMessage.
             */
            public Builder errMessage(String errMessage) {
                this.errMessage = errMessage;
                return this;
            }

            /**
             * InstanceClass.
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * OSSBucketName.
             */
            public Builder OSSBucketName(String OSSBucketName) {
                this.OSSBucketName = OSSBucketName;
                return this;
            }

            /**
             * OSSBucketRegion.
             */
            public Builder OSSBucketRegion(String OSSBucketRegion) {
                this.OSSBucketRegion = OSSBucketRegion;
                return this;
            }

            /**
             * OpenBackupSetAutoDownload.
             */
            public Builder openBackupSetAutoDownload(Boolean openBackupSetAutoDownload) {
                this.openBackupSetAutoDownload = openBackupSetAutoDownload;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * SourceEndpointDatabaseName.
             */
            public Builder sourceEndpointDatabaseName(String sourceEndpointDatabaseName) {
                this.sourceEndpointDatabaseName = sourceEndpointDatabaseName;
                return this;
            }

            /**
             * SourceEndpointInstanceID.
             */
            public Builder sourceEndpointInstanceID(String sourceEndpointInstanceID) {
                this.sourceEndpointInstanceID = sourceEndpointInstanceID;
                return this;
            }

            /**
             * SourceEndpointInstanceType.
             */
            public Builder sourceEndpointInstanceType(String sourceEndpointInstanceType) {
                this.sourceEndpointInstanceType = sourceEndpointInstanceType;
                return this;
            }

            /**
             * SourceEndpointIpPort.
             */
            public Builder sourceEndpointIpPort(String sourceEndpointIpPort) {
                this.sourceEndpointIpPort = sourceEndpointIpPort;
                return this;
            }

            /**
             * SourceEndpointOracleSID.
             */
            public Builder sourceEndpointOracleSID(String sourceEndpointOracleSID) {
                this.sourceEndpointOracleSID = sourceEndpointOracleSID;
                return this;
            }

            /**
             * SourceEndpointRegion.
             */
            public Builder sourceEndpointRegion(String sourceEndpointRegion) {
                this.sourceEndpointRegion = sourceEndpointRegion;
                return this;
            }

            /**
             * SourceEndpointUserName.
             */
            public Builder sourceEndpointUserName(String sourceEndpointUserName) {
                this.sourceEndpointUserName = sourceEndpointUserName;
                return this;
            }

            public BackupPlanDetail build() {
                return new BackupPlanDetail(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @NameInMap("BackupPlanDetail")
        private java.util.List < BackupPlanDetail> backupPlanDetail;

        private Items(Builder builder) {
            this.backupPlanDetail = builder.backupPlanDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return backupPlanDetail
         */
        public java.util.List < BackupPlanDetail> getBackupPlanDetail() {
            return this.backupPlanDetail;
        }

        public static final class Builder {
            private java.util.List < BackupPlanDetail> backupPlanDetail; 

            /**
             * BackupPlanDetail.
             */
            public Builder backupPlanDetail(java.util.List < BackupPlanDetail> backupPlanDetail) {
                this.backupPlanDetail = backupPlanDetail;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
