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
 * {@link DescribeFullBackupListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFullBackupListResponseBody</p>
 */
public class DescribeFullBackupListResponseBody extends TeaModel {
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

    private DescribeFullBackupListResponseBody(Builder builder) {
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

    public static DescribeFullBackupListResponseBody create() {
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

        private Builder(DescribeFullBackupListResponseBody model) {
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

        public DescribeFullBackupListResponseBody build() {
            return new DescribeFullBackupListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFullBackupListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFullBackupListResponseBody</p>
     */
    public static class FullBackupFile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupGatewayIdentifier")
        private String backupGatewayIdentifier;

        @com.aliyun.core.annotation.NameInMap("BackupObjects")
        private String backupObjects;

        @com.aliyun.core.annotation.NameInMap("BackupSetExpiredTime")
        private Long backupSetExpiredTime;

        @com.aliyun.core.annotation.NameInMap("BackupSetId")
        private String backupSetId;

        @com.aliyun.core.annotation.NameInMap("BackupSize")
        private Long backupSize;

        @com.aliyun.core.annotation.NameInMap("BackupStatus")
        private String backupStatus;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CrossAliyunId")
        private String crossAliyunId;

        @com.aliyun.core.annotation.NameInMap("CrossRoleName")
        private String crossRoleName;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("ErrMessage")
        private String errMessage;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private Long finishTime;

        @com.aliyun.core.annotation.NameInMap("LogicalFullBackupProgress")
        private Integer logicalFullBackupProgress;

        @com.aliyun.core.annotation.NameInMap("LogicalStructureBackupProgress")
        private Integer logicalStructureBackupProgress;

        @com.aliyun.core.annotation.NameInMap("SourceEndpointEnableSsl")
        private String sourceEndpointEnableSsl;

        @com.aliyun.core.annotation.NameInMap("SourceEndpointHost")
        private String sourceEndpointHost;

        @com.aliyun.core.annotation.NameInMap("SourceEndpointInstanceId")
        private String sourceEndpointInstanceId;

        @com.aliyun.core.annotation.NameInMap("SourceEndpointInstanceType")
        private String sourceEndpointInstanceType;

        @com.aliyun.core.annotation.NameInMap("SourceEndpointIpPort")
        private String sourceEndpointIpPort;

        @com.aliyun.core.annotation.NameInMap("SourceEndpointPort")
        private String sourceEndpointPort;

        @com.aliyun.core.annotation.NameInMap("SourceEndpointRegion")
        private String sourceEndpointRegion;

        @com.aliyun.core.annotation.NameInMap("SourceEndpointUserName")
        private String sourceEndpointUserName;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("StorageEncryptMethod")
        private String storageEncryptMethod;

        @com.aliyun.core.annotation.NameInMap("StorageMethod")
        private String storageMethod;

        private FullBackupFile(Builder builder) {
            this.backupGatewayIdentifier = builder.backupGatewayIdentifier;
            this.backupObjects = builder.backupObjects;
            this.backupSetExpiredTime = builder.backupSetExpiredTime;
            this.backupSetId = builder.backupSetId;
            this.backupSize = builder.backupSize;
            this.backupStatus = builder.backupStatus;
            this.createTime = builder.createTime;
            this.crossAliyunId = builder.crossAliyunId;
            this.crossRoleName = builder.crossRoleName;
            this.endTime = builder.endTime;
            this.errMessage = builder.errMessage;
            this.finishTime = builder.finishTime;
            this.logicalFullBackupProgress = builder.logicalFullBackupProgress;
            this.logicalStructureBackupProgress = builder.logicalStructureBackupProgress;
            this.sourceEndpointEnableSsl = builder.sourceEndpointEnableSsl;
            this.sourceEndpointHost = builder.sourceEndpointHost;
            this.sourceEndpointInstanceId = builder.sourceEndpointInstanceId;
            this.sourceEndpointInstanceType = builder.sourceEndpointInstanceType;
            this.sourceEndpointIpPort = builder.sourceEndpointIpPort;
            this.sourceEndpointPort = builder.sourceEndpointPort;
            this.sourceEndpointRegion = builder.sourceEndpointRegion;
            this.sourceEndpointUserName = builder.sourceEndpointUserName;
            this.startTime = builder.startTime;
            this.storageEncryptMethod = builder.storageEncryptMethod;
            this.storageMethod = builder.storageMethod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FullBackupFile create() {
            return builder().build();
        }

        /**
         * @return backupGatewayIdentifier
         */
        public String getBackupGatewayIdentifier() {
            return this.backupGatewayIdentifier;
        }

        /**
         * @return backupObjects
         */
        public String getBackupObjects() {
            return this.backupObjects;
        }

        /**
         * @return backupSetExpiredTime
         */
        public Long getBackupSetExpiredTime() {
            return this.backupSetExpiredTime;
        }

        /**
         * @return backupSetId
         */
        public String getBackupSetId() {
            return this.backupSetId;
        }

        /**
         * @return backupSize
         */
        public Long getBackupSize() {
            return this.backupSize;
        }

        /**
         * @return backupStatus
         */
        public String getBackupStatus() {
            return this.backupStatus;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
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
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return errMessage
         */
        public String getErrMessage() {
            return this.errMessage;
        }

        /**
         * @return finishTime
         */
        public Long getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return logicalFullBackupProgress
         */
        public Integer getLogicalFullBackupProgress() {
            return this.logicalFullBackupProgress;
        }

        /**
         * @return logicalStructureBackupProgress
         */
        public Integer getLogicalStructureBackupProgress() {
            return this.logicalStructureBackupProgress;
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
         * @return sourceEndpointInstanceId
         */
        public String getSourceEndpointInstanceId() {
            return this.sourceEndpointInstanceId;
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
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return storageEncryptMethod
         */
        public String getStorageEncryptMethod() {
            return this.storageEncryptMethod;
        }

        /**
         * @return storageMethod
         */
        public String getStorageMethod() {
            return this.storageMethod;
        }

        public static final class Builder {
            private String backupGatewayIdentifier; 
            private String backupObjects; 
            private Long backupSetExpiredTime; 
            private String backupSetId; 
            private Long backupSize; 
            private String backupStatus; 
            private Long createTime; 
            private String crossAliyunId; 
            private String crossRoleName; 
            private Long endTime; 
            private String errMessage; 
            private Long finishTime; 
            private Integer logicalFullBackupProgress; 
            private Integer logicalStructureBackupProgress; 
            private String sourceEndpointEnableSsl; 
            private String sourceEndpointHost; 
            private String sourceEndpointInstanceId; 
            private String sourceEndpointInstanceType; 
            private String sourceEndpointIpPort; 
            private String sourceEndpointPort; 
            private String sourceEndpointRegion; 
            private String sourceEndpointUserName; 
            private Long startTime; 
            private String storageEncryptMethod; 
            private String storageMethod; 

            private Builder() {
            } 

            private Builder(FullBackupFile model) {
                this.backupGatewayIdentifier = model.backupGatewayIdentifier;
                this.backupObjects = model.backupObjects;
                this.backupSetExpiredTime = model.backupSetExpiredTime;
                this.backupSetId = model.backupSetId;
                this.backupSize = model.backupSize;
                this.backupStatus = model.backupStatus;
                this.createTime = model.createTime;
                this.crossAliyunId = model.crossAliyunId;
                this.crossRoleName = model.crossRoleName;
                this.endTime = model.endTime;
                this.errMessage = model.errMessage;
                this.finishTime = model.finishTime;
                this.logicalFullBackupProgress = model.logicalFullBackupProgress;
                this.logicalStructureBackupProgress = model.logicalStructureBackupProgress;
                this.sourceEndpointEnableSsl = model.sourceEndpointEnableSsl;
                this.sourceEndpointHost = model.sourceEndpointHost;
                this.sourceEndpointInstanceId = model.sourceEndpointInstanceId;
                this.sourceEndpointInstanceType = model.sourceEndpointInstanceType;
                this.sourceEndpointIpPort = model.sourceEndpointIpPort;
                this.sourceEndpointPort = model.sourceEndpointPort;
                this.sourceEndpointRegion = model.sourceEndpointRegion;
                this.sourceEndpointUserName = model.sourceEndpointUserName;
                this.startTime = model.startTime;
                this.storageEncryptMethod = model.storageEncryptMethod;
                this.storageMethod = model.storageMethod;
            } 

            /**
             * BackupGatewayIdentifier.
             */
            public Builder backupGatewayIdentifier(String backupGatewayIdentifier) {
                this.backupGatewayIdentifier = backupGatewayIdentifier;
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
             * BackupSetExpiredTime.
             */
            public Builder backupSetExpiredTime(Long backupSetExpiredTime) {
                this.backupSetExpiredTime = backupSetExpiredTime;
                return this;
            }

            /**
             * BackupSetId.
             */
            public Builder backupSetId(String backupSetId) {
                this.backupSetId = backupSetId;
                return this;
            }

            /**
             * BackupSize.
             */
            public Builder backupSize(Long backupSize) {
                this.backupSize = backupSize;
                return this;
            }

            /**
             * BackupStatus.
             */
            public Builder backupStatus(String backupStatus) {
                this.backupStatus = backupStatus;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
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
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
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
             * FinishTime.
             */
            public Builder finishTime(Long finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * LogicalFullBackupProgress.
             */
            public Builder logicalFullBackupProgress(Integer logicalFullBackupProgress) {
                this.logicalFullBackupProgress = logicalFullBackupProgress;
                return this;
            }

            /**
             * LogicalStructureBackupProgress.
             */
            public Builder logicalStructureBackupProgress(Integer logicalStructureBackupProgress) {
                this.logicalStructureBackupProgress = logicalStructureBackupProgress;
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
             * SourceEndpointInstanceId.
             */
            public Builder sourceEndpointInstanceId(String sourceEndpointInstanceId) {
                this.sourceEndpointInstanceId = sourceEndpointInstanceId;
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
             * SourceEndpointPort.
             */
            public Builder sourceEndpointPort(String sourceEndpointPort) {
                this.sourceEndpointPort = sourceEndpointPort;
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

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * StorageEncryptMethod.
             */
            public Builder storageEncryptMethod(String storageEncryptMethod) {
                this.storageEncryptMethod = storageEncryptMethod;
                return this;
            }

            /**
             * StorageMethod.
             */
            public Builder storageMethod(String storageMethod) {
                this.storageMethod = storageMethod;
                return this;
            }

            public FullBackupFile build() {
                return new FullBackupFile(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFullBackupListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFullBackupListResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FullBackupFile")
        private java.util.List<FullBackupFile> fullBackupFile;

        private Items(Builder builder) {
            this.fullBackupFile = builder.fullBackupFile;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return fullBackupFile
         */
        public java.util.List<FullBackupFile> getFullBackupFile() {
            return this.fullBackupFile;
        }

        public static final class Builder {
            private java.util.List<FullBackupFile> fullBackupFile; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.fullBackupFile = model.fullBackupFile;
            } 

            /**
             * FullBackupFile.
             */
            public Builder fullBackupFile(java.util.List<FullBackupFile> fullBackupFile) {
                this.fullBackupFile = fullBackupFile;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
