// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeBackupPlanListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupPlanListResponseBody</p>
 */
public class DescribeBackupPlanListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalElements")
    private Integer totalElements;

    @com.aliyun.core.annotation.NameInMap("TotalPages")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeBackupPlanListResponseBody model) {
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.items = model.items;
            this.pageNum = model.pageNum;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalElements = model.totalElements;
            this.totalPages = model.totalPages;
        } 

        /**
         * <p>Error code.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameterValid</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>Error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified parameter %s value is not valid.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Details of the backup plans.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>Page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>Number of records per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4F1888AC-1138-4995-B9FE-D2734F61C058</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Whether the operation was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>Total number of backup plans.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalElements(Integer totalElements) {
            this.totalElements = totalElements;
            return this;
        }

        /**
         * <p>Total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public DescribeBackupPlanListResponseBody build() {
            return new DescribeBackupPlanListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBackupPlanListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupPlanListResponseBody</p>
     */
    public static class BackupPlanDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupGatewayId")
        private Long backupGatewayId;

        @com.aliyun.core.annotation.NameInMap("BackupGatewayIdentifier")
        private String backupGatewayIdentifier;

        @com.aliyun.core.annotation.NameInMap("BackupMethod")
        private String backupMethod;

        @com.aliyun.core.annotation.NameInMap("BackupObjects")
        private String backupObjects;

        @com.aliyun.core.annotation.NameInMap("BackupPeriod")
        private String backupPeriod;

        @com.aliyun.core.annotation.NameInMap("BackupPlanCreateTime")
        private Long backupPlanCreateTime;

        @com.aliyun.core.annotation.NameInMap("BackupPlanId")
        private String backupPlanId;

        @com.aliyun.core.annotation.NameInMap("BackupPlanName")
        private String backupPlanName;

        @com.aliyun.core.annotation.NameInMap("BackupPlanRegion")
        private String backupPlanRegion;

        @com.aliyun.core.annotation.NameInMap("BackupPlanStatus")
        private String backupPlanStatus;

        @com.aliyun.core.annotation.NameInMap("BackupRetentionPeriod")
        private Integer backupRetentionPeriod;

        @com.aliyun.core.annotation.NameInMap("BackupSetDownloadDir")
        private String backupSetDownloadDir;

        @com.aliyun.core.annotation.NameInMap("BackupSetDownloadFullDataFormat")
        private String backupSetDownloadFullDataFormat;

        @com.aliyun.core.annotation.NameInMap("BackupSetDownloadGatewayId")
        private Long backupSetDownloadGatewayId;

        @com.aliyun.core.annotation.NameInMap("BackupSetDownloadIncrementDataFormat")
        private String backupSetDownloadIncrementDataFormat;

        @com.aliyun.core.annotation.NameInMap("BackupSetDownloadTargetType")
        private String backupSetDownloadTargetType;

        @com.aliyun.core.annotation.NameInMap("BackupStartTime")
        private String backupStartTime;

        @com.aliyun.core.annotation.NameInMap("BackupStorageType")
        private String backupStorageType;

        @com.aliyun.core.annotation.NameInMap("BeginTimestampForRestore")
        private Long beginTimestampForRestore;

        @com.aliyun.core.annotation.NameInMap("CrossAliyunId")
        private String crossAliyunId;

        @com.aliyun.core.annotation.NameInMap("CrossRoleName")
        private String crossRoleName;

        @com.aliyun.core.annotation.NameInMap("DatabaseType")
        private String databaseType;

        @com.aliyun.core.annotation.NameInMap("DuplicationArchivePeriod")
        private Integer duplicationArchivePeriod;

        @com.aliyun.core.annotation.NameInMap("DuplicationInfrequentAccessPeriod")
        private Integer duplicationInfrequentAccessPeriod;

        @com.aliyun.core.annotation.NameInMap("EnableBackupLog")
        private Boolean enableBackupLog;

        @com.aliyun.core.annotation.NameInMap("EnableMysqlPhysicalBackupBinLog")
        private Boolean enableMysqlPhysicalBackupBinLog;

        @com.aliyun.core.annotation.NameInMap("EndTimestampForRestore")
        private Long endTimestampForRestore;

        @com.aliyun.core.annotation.NameInMap("ErrMessage")
        private String errMessage;

        @com.aliyun.core.annotation.NameInMap("IncrementBackupRetentionPeriod")
        private String incrementBackupRetentionPeriod;

        @com.aliyun.core.annotation.NameInMap("IncrementDuplicationArchivePeriod")
        private String incrementDuplicationArchivePeriod;

        @com.aliyun.core.annotation.NameInMap("IncrementDuplicationInfrequentAccessPeriod")
        private String incrementDuplicationInfrequentAccessPeriod;

        @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @com.aliyun.core.annotation.NameInMap("InstanceClass")
        private String instanceClass;

        @com.aliyun.core.annotation.NameInMap("InstanceExpiredTimestamp")
        private Long instanceExpiredTimestamp;

        @com.aliyun.core.annotation.NameInMap("LogBackupRetentionPeriod")
        private String logBackupRetentionPeriod;

        @com.aliyun.core.annotation.NameInMap("LogDuplicationArchivePeriod")
        private String logDuplicationArchivePeriod;

        @com.aliyun.core.annotation.NameInMap("LogDuplicationInfrequentAccessPeriod")
        private String logDuplicationInfrequentAccessPeriod;

        @com.aliyun.core.annotation.NameInMap("OSSBucketName")
        private String OSSBucketName;

        @com.aliyun.core.annotation.NameInMap("OSSBucketRegion")
        private String OSSBucketRegion;

        @com.aliyun.core.annotation.NameInMap("OpenBackupSetAutoDownload")
        private Boolean openBackupSetAutoDownload;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SourceEndpointDatabaseName")
        private String sourceEndpointDatabaseName;

        @com.aliyun.core.annotation.NameInMap("SourceEndpointEnableSsl")
        private String sourceEndpointEnableSsl;

        @com.aliyun.core.annotation.NameInMap("SourceEndpointHost")
        private String sourceEndpointHost;

        @com.aliyun.core.annotation.NameInMap("SourceEndpointInstanceID")
        private String sourceEndpointInstanceID;

        @com.aliyun.core.annotation.NameInMap("SourceEndpointInstanceType")
        private String sourceEndpointInstanceType;

        @com.aliyun.core.annotation.NameInMap("SourceEndpointIpPort")
        private String sourceEndpointIpPort;

        @com.aliyun.core.annotation.NameInMap("SourceEndpointOracleSID")
        private String sourceEndpointOracleSID;

        @com.aliyun.core.annotation.NameInMap("SourceEndpointPort")
        private String sourceEndpointPort;

        @com.aliyun.core.annotation.NameInMap("SourceEndpointRegion")
        private String sourceEndpointRegion;

        @com.aliyun.core.annotation.NameInMap("SourceEndpointUserName")
        private String sourceEndpointUserName;

        @com.aliyun.core.annotation.NameInMap("StorageEncryptMethod")
        private String storageEncryptMethod;

        private BackupPlanDetail(Builder builder) {
            this.backupGatewayId = builder.backupGatewayId;
            this.backupGatewayIdentifier = builder.backupGatewayIdentifier;
            this.backupMethod = builder.backupMethod;
            this.backupObjects = builder.backupObjects;
            this.backupPeriod = builder.backupPeriod;
            this.backupPlanCreateTime = builder.backupPlanCreateTime;
            this.backupPlanId = builder.backupPlanId;
            this.backupPlanName = builder.backupPlanName;
            this.backupPlanRegion = builder.backupPlanRegion;
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
            this.databaseType = builder.databaseType;
            this.duplicationArchivePeriod = builder.duplicationArchivePeriod;
            this.duplicationInfrequentAccessPeriod = builder.duplicationInfrequentAccessPeriod;
            this.enableBackupLog = builder.enableBackupLog;
            this.enableMysqlPhysicalBackupBinLog = builder.enableMysqlPhysicalBackupBinLog;
            this.endTimestampForRestore = builder.endTimestampForRestore;
            this.errMessage = builder.errMessage;
            this.incrementBackupRetentionPeriod = builder.incrementBackupRetentionPeriod;
            this.incrementDuplicationArchivePeriod = builder.incrementDuplicationArchivePeriod;
            this.incrementDuplicationInfrequentAccessPeriod = builder.incrementDuplicationInfrequentAccessPeriod;
            this.instanceChargeType = builder.instanceChargeType;
            this.instanceClass = builder.instanceClass;
            this.instanceExpiredTimestamp = builder.instanceExpiredTimestamp;
            this.logBackupRetentionPeriod = builder.logBackupRetentionPeriod;
            this.logDuplicationArchivePeriod = builder.logDuplicationArchivePeriod;
            this.logDuplicationInfrequentAccessPeriod = builder.logDuplicationInfrequentAccessPeriod;
            this.OSSBucketName = builder.OSSBucketName;
            this.OSSBucketRegion = builder.OSSBucketRegion;
            this.openBackupSetAutoDownload = builder.openBackupSetAutoDownload;
            this.resourceGroupId = builder.resourceGroupId;
            this.sourceEndpointDatabaseName = builder.sourceEndpointDatabaseName;
            this.sourceEndpointEnableSsl = builder.sourceEndpointEnableSsl;
            this.sourceEndpointHost = builder.sourceEndpointHost;
            this.sourceEndpointInstanceID = builder.sourceEndpointInstanceID;
            this.sourceEndpointInstanceType = builder.sourceEndpointInstanceType;
            this.sourceEndpointIpPort = builder.sourceEndpointIpPort;
            this.sourceEndpointOracleSID = builder.sourceEndpointOracleSID;
            this.sourceEndpointPort = builder.sourceEndpointPort;
            this.sourceEndpointRegion = builder.sourceEndpointRegion;
            this.sourceEndpointUserName = builder.sourceEndpointUserName;
            this.storageEncryptMethod = builder.storageEncryptMethod;
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
         * @return backupGatewayIdentifier
         */
        public String getBackupGatewayIdentifier() {
            return this.backupGatewayIdentifier;
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
         * @return backupPlanRegion
         */
        public String getBackupPlanRegion() {
            return this.backupPlanRegion;
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
         * @return databaseType
         */
        public String getDatabaseType() {
            return this.databaseType;
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
         * @return enableMysqlPhysicalBackupBinLog
         */
        public Boolean getEnableMysqlPhysicalBackupBinLog() {
            return this.enableMysqlPhysicalBackupBinLog;
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
         * @return incrementBackupRetentionPeriod
         */
        public String getIncrementBackupRetentionPeriod() {
            return this.incrementBackupRetentionPeriod;
        }

        /**
         * @return incrementDuplicationArchivePeriod
         */
        public String getIncrementDuplicationArchivePeriod() {
            return this.incrementDuplicationArchivePeriod;
        }

        /**
         * @return incrementDuplicationInfrequentAccessPeriod
         */
        public String getIncrementDuplicationInfrequentAccessPeriod() {
            return this.incrementDuplicationInfrequentAccessPeriod;
        }

        /**
         * @return instanceChargeType
         */
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        /**
         * @return instanceClass
         */
        public String getInstanceClass() {
            return this.instanceClass;
        }

        /**
         * @return instanceExpiredTimestamp
         */
        public Long getInstanceExpiredTimestamp() {
            return this.instanceExpiredTimestamp;
        }

        /**
         * @return logBackupRetentionPeriod
         */
        public String getLogBackupRetentionPeriod() {
            return this.logBackupRetentionPeriod;
        }

        /**
         * @return logDuplicationArchivePeriod
         */
        public String getLogDuplicationArchivePeriod() {
            return this.logDuplicationArchivePeriod;
        }

        /**
         * @return logDuplicationInfrequentAccessPeriod
         */
        public String getLogDuplicationInfrequentAccessPeriod() {
            return this.logDuplicationInfrequentAccessPeriod;
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
         * @return sourceEndpointEnableSsl
         */
        public String getSourceEndpointEnableSsl() {
            return this.sourceEndpointEnableSsl;
        }

        /**
         * @return sourceEndpointHost
         */
        public String getSourceEndpointHost() {
            return this.sourceEndpointHost;
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
         * @return sourceEndpointPort
         */
        public String getSourceEndpointPort() {
            return this.sourceEndpointPort;
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

        /**
         * @return storageEncryptMethod
         */
        public String getStorageEncryptMethod() {
            return this.storageEncryptMethod;
        }

        public static final class Builder {
            private Long backupGatewayId; 
            private String backupGatewayIdentifier; 
            private String backupMethod; 
            private String backupObjects; 
            private String backupPeriod; 
            private Long backupPlanCreateTime; 
            private String backupPlanId; 
            private String backupPlanName; 
            private String backupPlanRegion; 
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
            private String databaseType; 
            private Integer duplicationArchivePeriod; 
            private Integer duplicationInfrequentAccessPeriod; 
            private Boolean enableBackupLog; 
            private Boolean enableMysqlPhysicalBackupBinLog; 
            private Long endTimestampForRestore; 
            private String errMessage; 
            private String incrementBackupRetentionPeriod; 
            private String incrementDuplicationArchivePeriod; 
            private String incrementDuplicationInfrequentAccessPeriod; 
            private String instanceChargeType; 
            private String instanceClass; 
            private Long instanceExpiredTimestamp; 
            private String logBackupRetentionPeriod; 
            private String logDuplicationArchivePeriod; 
            private String logDuplicationInfrequentAccessPeriod; 
            private String OSSBucketName; 
            private String OSSBucketRegion; 
            private Boolean openBackupSetAutoDownload; 
            private String resourceGroupId; 
            private String sourceEndpointDatabaseName; 
            private String sourceEndpointEnableSsl; 
            private String sourceEndpointHost; 
            private String sourceEndpointInstanceID; 
            private String sourceEndpointInstanceType; 
            private String sourceEndpointIpPort; 
            private String sourceEndpointOracleSID; 
            private String sourceEndpointPort; 
            private String sourceEndpointRegion; 
            private String sourceEndpointUserName; 
            private String storageEncryptMethod; 

            private Builder() {
            } 

            private Builder(BackupPlanDetail model) {
                this.backupGatewayId = model.backupGatewayId;
                this.backupGatewayIdentifier = model.backupGatewayIdentifier;
                this.backupMethod = model.backupMethod;
                this.backupObjects = model.backupObjects;
                this.backupPeriod = model.backupPeriod;
                this.backupPlanCreateTime = model.backupPlanCreateTime;
                this.backupPlanId = model.backupPlanId;
                this.backupPlanName = model.backupPlanName;
                this.backupPlanRegion = model.backupPlanRegion;
                this.backupPlanStatus = model.backupPlanStatus;
                this.backupRetentionPeriod = model.backupRetentionPeriod;
                this.backupSetDownloadDir = model.backupSetDownloadDir;
                this.backupSetDownloadFullDataFormat = model.backupSetDownloadFullDataFormat;
                this.backupSetDownloadGatewayId = model.backupSetDownloadGatewayId;
                this.backupSetDownloadIncrementDataFormat = model.backupSetDownloadIncrementDataFormat;
                this.backupSetDownloadTargetType = model.backupSetDownloadTargetType;
                this.backupStartTime = model.backupStartTime;
                this.backupStorageType = model.backupStorageType;
                this.beginTimestampForRestore = model.beginTimestampForRestore;
                this.crossAliyunId = model.crossAliyunId;
                this.crossRoleName = model.crossRoleName;
                this.databaseType = model.databaseType;
                this.duplicationArchivePeriod = model.duplicationArchivePeriod;
                this.duplicationInfrequentAccessPeriod = model.duplicationInfrequentAccessPeriod;
                this.enableBackupLog = model.enableBackupLog;
                this.enableMysqlPhysicalBackupBinLog = model.enableMysqlPhysicalBackupBinLog;
                this.endTimestampForRestore = model.endTimestampForRestore;
                this.errMessage = model.errMessage;
                this.incrementBackupRetentionPeriod = model.incrementBackupRetentionPeriod;
                this.incrementDuplicationArchivePeriod = model.incrementDuplicationArchivePeriod;
                this.incrementDuplicationInfrequentAccessPeriod = model.incrementDuplicationInfrequentAccessPeriod;
                this.instanceChargeType = model.instanceChargeType;
                this.instanceClass = model.instanceClass;
                this.instanceExpiredTimestamp = model.instanceExpiredTimestamp;
                this.logBackupRetentionPeriod = model.logBackupRetentionPeriod;
                this.logDuplicationArchivePeriod = model.logDuplicationArchivePeriod;
                this.logDuplicationInfrequentAccessPeriod = model.logDuplicationInfrequentAccessPeriod;
                this.OSSBucketName = model.OSSBucketName;
                this.OSSBucketRegion = model.OSSBucketRegion;
                this.openBackupSetAutoDownload = model.openBackupSetAutoDownload;
                this.resourceGroupId = model.resourceGroupId;
                this.sourceEndpointDatabaseName = model.sourceEndpointDatabaseName;
                this.sourceEndpointEnableSsl = model.sourceEndpointEnableSsl;
                this.sourceEndpointHost = model.sourceEndpointHost;
                this.sourceEndpointInstanceID = model.sourceEndpointInstanceID;
                this.sourceEndpointInstanceType = model.sourceEndpointInstanceType;
                this.sourceEndpointIpPort = model.sourceEndpointIpPort;
                this.sourceEndpointOracleSID = model.sourceEndpointOracleSID;
                this.sourceEndpointPort = model.sourceEndpointPort;
                this.sourceEndpointRegion = model.sourceEndpointRegion;
                this.sourceEndpointUserName = model.sourceEndpointUserName;
                this.storageEncryptMethod = model.storageEncryptMethod;
            } 

            /**
             * <p>Backup gateway ID.</p>
             * 
             * <strong>example:</strong>
             * <p>827362187368736</p>
             */
            public Builder backupGatewayId(Long backupGatewayId) {
                this.backupGatewayId = backupGatewayId;
                return this;
            }

            /**
             * BackupGatewayIdentifier.
             */
            public Builder backupGatewayIdentifier(String backupGatewayIdentifier) {
                this.backupGatewayIdentifier = backupGatewayIdentifier;
                return this;
            }

            /**
             * <p>Backup method. The return values are as follows:</p>
             * <ul>
             * <li><strong>logical</strong>: Logical backup</li>
             * <li><strong>physical</strong>: Physical backup</li>
             * <li><strong>duplication</strong>: Replication backup</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>logical</p>
             */
            public Builder backupMethod(String backupMethod) {
                this.backupMethod = backupMethod;
                return this;
            }

            /**
             * <p>Backup objects.</p>
             */
            public Builder backupObjects(String backupObjects) {
                this.backupObjects = backupObjects;
                return this;
            }

            /**
             * <p>Full backup cycle. The return values are as follows:</p>
             * <ul>
             * <li><strong>Monday</strong>: Monday</li>
             * <li><strong>Tuesday</strong>: Tuesday</li>
             * <li><strong>Wednesday</strong>: Wednesday</li>
             * <li><strong>Thursday</strong>: Thursday</li>
             * <li><strong>Friday</strong>: Friday</li>
             * <li><strong>Saturday</strong>: Saturday</li>
             * <li><strong>Sunday</strong>: Sunday</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Monday</p>
             */
            public Builder backupPeriod(String backupPeriod) {
                this.backupPeriod = backupPeriod;
                return this;
            }

            /**
             * <p>Timestamp of the backup plan creation.</p>
             * 
             * <strong>example:</strong>
             * <p>1582527713000</p>
             */
            public Builder backupPlanCreateTime(Long backupPlanCreateTime) {
                this.backupPlanCreateTime = backupPlanCreateTime;
                return this;
            }

            /**
             * <p>Backup plan ID.</p>
             * 
             * <strong>example:</strong>
             * <p>dbstooi01eXXXX</p>
             */
            public Builder backupPlanId(String backupPlanId) {
                this.backupPlanId = backupPlanId;
                return this;
            }

            /**
             * <p>Backup plan name.</p>
             * 
             * <strong>example:</strong>
             * <p>dbstooi01e****</p>
             */
            public Builder backupPlanName(String backupPlanName) {
                this.backupPlanName = backupPlanName;
                return this;
            }

            /**
             * BackupPlanRegion.
             */
            public Builder backupPlanRegion(String backupPlanRegion) {
                this.backupPlanRegion = backupPlanRegion;
                return this;
            }

            /**
             * <p>Backup plan status. The return values are as follows:</p>
             * <ul>
             * <li><strong>wait</strong>: Not configured</li>
             * <li><strong>init</strong>: Not started (pre-check failed)</li>
             * <li><strong>running</strong>: Running</li>
             * <li><strong>stop</strong>: Failed</li>
             * <li><strong>pause</strong>: Paused</li>
             * <li><strong>locked</strong>: Locked</li>
             * <li><strong>check_pass</strong>: Pre-check passed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>init</p>
             */
            public Builder backupPlanStatus(String backupPlanStatus) {
                this.backupPlanStatus = backupPlanStatus;
                return this;
            }

            /**
             * <p>Backup data retention period, with a value range of 0 to 1825 days.</p>
             * 
             * <strong>example:</strong>
             * <p>365</p>
             */
            public Builder backupRetentionPeriod(Integer backupRetentionPeriod) {
                this.backupRetentionPeriod = backupRetentionPeriod;
                return this;
            }

            /**
             * <p>Download server directory of the backup set</p>
             */
            public Builder backupSetDownloadDir(String backupSetDownloadDir) {
                this.backupSetDownloadDir = backupSetDownloadDir;
                return this;
            }

            /**
             * <p>Full data format for backup set download:</p>
             * <ul>
             * <li><strong>Native</strong></li>
             * <li><strong>SQL</strong></li>
             * <li><strong>CSV</strong></li>
             * <li><strong>JSON</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SQL</p>
             */
            public Builder backupSetDownloadFullDataFormat(String backupSetDownloadFullDataFormat) {
                this.backupSetDownloadFullDataFormat = backupSetDownloadFullDataFormat;
                return this;
            }

            /**
             * <p>Backup set download backup gateway ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123123</p>
             */
            public Builder backupSetDownloadGatewayId(Long backupSetDownloadGatewayId) {
                this.backupSetDownloadGatewayId = backupSetDownloadGatewayId;
                return this;
            }

            /**
             * <p>Backup set download full data format:</p>
             * <ul>
             * <li><strong>Native</strong></li>
             * <li><strong>SQL</strong></li>
             * <li><strong>CSV</strong></li>
             * <li><strong>JSON</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SQL</p>
             */
            public Builder backupSetDownloadIncrementDataFormat(String backupSetDownloadIncrementDataFormat) {
                this.backupSetDownloadIncrementDataFormat = backupSetDownloadIncrementDataFormat;
                return this;
            }

            /**
             * <p>Backup set download target type.</p>
             * <blockquote>
             * <p>The only value is: agent, indicating that the backup gateway is installed.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>agent</p>
             */
            public Builder backupSetDownloadTargetType(String backupSetDownloadTargetType) {
                this.backupSetDownloadTargetType = backupSetDownloadTargetType;
                return this;
            }

            /**
             * <p>Full backup start time, in the format HH:mm.</p>
             * 
             * <strong>example:</strong>
             * <p>14:22</p>
             */
            public Builder backupStartTime(String backupStartTime) {
                this.backupStartTime = backupStartTime;
                return this;
            }

            /**
             * <p>Built-in storage type. The return values are as follows:</p>
             * <ul>
             * <li>Empty (default): Backup data is stored on the user&quot;s OSS.</li>
             * <li>system: Backup data is stored on the built-in OSS of DBS.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>system</p>
             */
            public Builder backupStorageType(String backupStorageType) {
                this.backupStorageType = backupStorageType;
                return this;
            }

            /**
             * <p>Start time for the database restore period, with a return value of 1554560477000.</p>
             * 
             * <strong>example:</strong>
             * <p>1554560477000</p>
             */
            public Builder beginTimestampForRestore(Long beginTimestampForRestore) {
                this.beginTimestampForRestore = beginTimestampForRestore;
                return this;
            }

            /**
             * <p>UID for cross-Aliyun account backup.</p>
             * 
             * <strong>example:</strong>
             * <p>2xxx7778xxxxxxxxxx</p>
             */
            public Builder crossAliyunId(String crossAliyunId) {
                this.crossAliyunId = crossAliyunId;
                return this;
            }

            /**
             * <p>RAM role name for cross-Aliyun account backup.</p>
             * 
             * <strong>example:</strong>
             * <p>test123</p>
             */
            public Builder crossRoleName(String crossRoleName) {
                this.crossRoleName = crossRoleName;
                return this;
            }

            /**
             * <p>Database type.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder databaseType(String databaseType) {
                this.databaseType = databaseType;
                return this;
            }

            /**
             * <p>Time (in days) to convert to archive cold backup storage.</p>
             * 
             * <strong>example:</strong>
             * <p>365</p>
             */
            public Builder duplicationArchivePeriod(Integer duplicationArchivePeriod) {
                this.duplicationArchivePeriod = duplicationArchivePeriod;
                return this;
            }

            /**
             * <p>Time (in days) to convert to infrequent access storage.</p>
             * 
             * <strong>example:</strong>
             * <p>180</p>
             */
            public Builder duplicationInfrequentAccessPeriod(Integer duplicationInfrequentAccessPeriod) {
                this.duplicationInfrequentAccessPeriod = duplicationInfrequentAccessPeriod;
                return this;
            }

            /**
             * <p>Indicates whether incremental log backup is enabled, with return values as follows:</p>
             * <ul>
             * <li><strong>true</strong>: Enabled</li>
             * <li><strong>false</strong>: Disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableBackupLog(Boolean enableBackupLog) {
                this.enableBackupLog = enableBackupLog;
                return this;
            }

            /**
             * EnableMysqlPhysicalBackupBinLog.
             */
            public Builder enableMysqlPhysicalBackupBinLog(Boolean enableMysqlPhysicalBackupBinLog) {
                this.enableMysqlPhysicalBackupBinLog = enableMysqlPhysicalBackupBinLog;
                return this;
            }

            /**
             * <p>End time of the database restorable period, in timestamp format.</p>
             * 
             * <strong>example:</strong>
             * <p>1554560477000</p>
             */
            public Builder endTimestampForRestore(Long endTimestampForRestore) {
                this.endTimestampForRestore = endTimestampForRestore;
                return this;
            }

            /**
             * <p>Pre-check task error message.</p>
             * 
             * <strong>example:</strong>
             * <p>can not connect to oracle instance orcl with user dbs</p>
             */
            public Builder errMessage(String errMessage) {
                this.errMessage = errMessage;
                return this;
            }

            /**
             * IncrementBackupRetentionPeriod.
             */
            public Builder incrementBackupRetentionPeriod(String incrementBackupRetentionPeriod) {
                this.incrementBackupRetentionPeriod = incrementBackupRetentionPeriod;
                return this;
            }

            /**
             * IncrementDuplicationArchivePeriod.
             */
            public Builder incrementDuplicationArchivePeriod(String incrementDuplicationArchivePeriod) {
                this.incrementDuplicationArchivePeriod = incrementDuplicationArchivePeriod;
                return this;
            }

            /**
             * IncrementDuplicationInfrequentAccessPeriod.
             */
            public Builder incrementDuplicationInfrequentAccessPeriod(String incrementDuplicationInfrequentAccessPeriod) {
                this.incrementDuplicationInfrequentAccessPeriod = incrementDuplicationInfrequentAccessPeriod;
                return this;
            }

            /**
             * InstanceChargeType.
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * <p>Instance class, with return values as follows:</p>
             * <ul>
             * <li><strong>micro</strong>: Entry-level</li>
             * <li><strong>small</strong>: Low-spec</li>
             * <li><strong>medium</strong>: Medium-spec</li>
             * <li><strong>large</strong>: High-spec</li>
             * <li><strong>xlarge</strong>: High-spec (no traffic limit)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>micro</p>
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * InstanceExpiredTimestamp.
             */
            public Builder instanceExpiredTimestamp(Long instanceExpiredTimestamp) {
                this.instanceExpiredTimestamp = instanceExpiredTimestamp;
                return this;
            }

            /**
             * LogBackupRetentionPeriod.
             */
            public Builder logBackupRetentionPeriod(String logBackupRetentionPeriod) {
                this.logBackupRetentionPeriod = logBackupRetentionPeriod;
                return this;
            }

            /**
             * LogDuplicationArchivePeriod.
             */
            public Builder logDuplicationArchivePeriod(String logDuplicationArchivePeriod) {
                this.logDuplicationArchivePeriod = logDuplicationArchivePeriod;
                return this;
            }

            /**
             * LogDuplicationInfrequentAccessPeriod.
             */
            public Builder logDuplicationInfrequentAccessPeriod(String logDuplicationInfrequentAccessPeriod) {
                this.logDuplicationInfrequentAccessPeriod = logDuplicationInfrequentAccessPeriod;
                return this;
            }

            /**
             * <p>OSS Bucket name.</p>
             * 
             * <strong>example:</strong>
             * <p>dbs-backup-1857XXXXX489</p>
             */
            public Builder OSSBucketName(String OSSBucketName) {
                this.OSSBucketName = OSSBucketName;
                return this;
            }

            /**
             * <p>OSS Bucket region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder OSSBucketRegion(String OSSBucketRegion) {
                this.OSSBucketRegion = OSSBucketRegion;
                return this;
            }

            /**
             * <p>Indicates whether the automatic backup set download feature is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder openBackupSetAutoDownload(Boolean openBackupSetAutoDownload) {
                this.openBackupSetAutoDownload = openBackupSetAutoDownload;
                return this;
            }

            /**
             * <p>Resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aekzecovzti****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>Database name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder sourceEndpointDatabaseName(String sourceEndpointDatabaseName) {
                this.sourceEndpointDatabaseName = sourceEndpointDatabaseName;
                return this;
            }

            /**
             * SourceEndpointEnableSsl.
             */
            public Builder sourceEndpointEnableSsl(String sourceEndpointEnableSsl) {
                this.sourceEndpointEnableSsl = sourceEndpointEnableSsl;
                return this;
            }

            /**
             * SourceEndpointHost.
             */
            public Builder sourceEndpointHost(String sourceEndpointHost) {
                this.sourceEndpointHost = sourceEndpointHost;
                return this;
            }

            /**
             * <p>Database instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder sourceEndpointInstanceID(String sourceEndpointInstanceID) {
                this.sourceEndpointInstanceID = sourceEndpointInstanceID;
                return this;
            }

            /**
             * <p>Location of the database, the return values are as follows:</p>
             * <ul>
             * <li><strong>rds</strong></li>
             * <li><strong>ecs</strong></li>
             * <li><strong>express</strong>: Database connected via dedicated line/VPN gateway/smart gateway</li>
             * <li><strong>agent</strong>: Database connected via backup gateway</li>
             * <li><strong>dds</strong>: Cloud MongoDB</li>
             * <li><strong>other</strong>: Database connected directly via IP:Port</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>rds</p>
             */
            public Builder sourceEndpointInstanceType(String sourceEndpointInstanceType) {
                this.sourceEndpointInstanceType = sourceEndpointInstanceType;
                return this;
            }

            /**
             * <p>Database connection address.</p>
             * 
             * <strong>example:</strong>
             * <p>100.<em>.</em>.10:33204</p>
             */
            public Builder sourceEndpointIpPort(String sourceEndpointIpPort) {
                this.sourceEndpointIpPort = sourceEndpointIpPort;
                return this;
            }

            /**
             * <p>Oracle SID name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder sourceEndpointOracleSID(String sourceEndpointOracleSID) {
                this.sourceEndpointOracleSID = sourceEndpointOracleSID;
                return this;
            }

            /**
             * SourceEndpointPort.
             */
            public Builder sourceEndpointPort(String sourceEndpointPort) {
                this.sourceEndpointPort = sourceEndpointPort;
                return this;
            }

            /**
             * <p>Database region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder sourceEndpointRegion(String sourceEndpointRegion) {
                this.sourceEndpointRegion = sourceEndpointRegion;
                return this;
            }

            /**
             * <p>Database username.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder sourceEndpointUserName(String sourceEndpointUserName) {
                this.sourceEndpointUserName = sourceEndpointUserName;
                return this;
            }

            /**
             * StorageEncryptMethod.
             */
            public Builder storageEncryptMethod(String storageEncryptMethod) {
                this.storageEncryptMethod = storageEncryptMethod;
                return this;
            }

            public BackupPlanDetail build() {
                return new BackupPlanDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBackupPlanListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupPlanListResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupPlanDetail")
        private java.util.List<BackupPlanDetail> backupPlanDetail;

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
        public java.util.List<BackupPlanDetail> getBackupPlanDetail() {
            return this.backupPlanDetail;
        }

        public static final class Builder {
            private java.util.List<BackupPlanDetail> backupPlanDetail; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.backupPlanDetail = model.backupPlanDetail;
            } 

            /**
             * BackupPlanDetail.
             */
            public Builder backupPlanDetail(java.util.List<BackupPlanDetail> backupPlanDetail) {
                this.backupPlanDetail = backupPlanDetail;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
