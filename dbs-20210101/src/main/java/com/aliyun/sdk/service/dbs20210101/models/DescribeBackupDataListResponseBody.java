// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupDataListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupDataListResponseBody</p>
 */
public class DescribeBackupDataListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private DescribeBackupDataListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupDataListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
     * @return message
     */
    public String getMessage() {
        return this.message;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errCode; 
        private String errMessage; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeBackupDataListResponseBody build() {
            return new DescribeBackupDataListResponseBody(this);
        } 

    } 

    public static class PolarSnapshot extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DumpId")
        private Long dumpId;

        @com.aliyun.core.annotation.NameInMap("DumpSize")
        private Long dumpSize;

        @com.aliyun.core.annotation.NameInMap("ExpectExpireTime")
        private String expectExpireTime;

        @com.aliyun.core.annotation.NameInMap("expectExpireType")
        private String expectExpireType;

        private PolarSnapshot(Builder builder) {
            this.dumpId = builder.dumpId;
            this.dumpSize = builder.dumpSize;
            this.expectExpireTime = builder.expectExpireTime;
            this.expectExpireType = builder.expectExpireType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolarSnapshot create() {
            return builder().build();
        }

        /**
         * @return dumpId
         */
        public Long getDumpId() {
            return this.dumpId;
        }

        /**
         * @return dumpSize
         */
        public Long getDumpSize() {
            return this.dumpSize;
        }

        /**
         * @return expectExpireTime
         */
        public String getExpectExpireTime() {
            return this.expectExpireTime;
        }

        /**
         * @return expectExpireType
         */
        public String getExpectExpireType() {
            return this.expectExpireType;
        }

        public static final class Builder {
            private Long dumpId; 
            private Long dumpSize; 
            private String expectExpireTime; 
            private String expectExpireType; 

            /**
             * DumpId.
             */
            public Builder dumpId(Long dumpId) {
                this.dumpId = dumpId;
                return this;
            }

            /**
             * DumpSize.
             */
            public Builder dumpSize(Long dumpSize) {
                this.dumpSize = dumpSize;
                return this;
            }

            /**
             * ExpectExpireTime.
             */
            public Builder expectExpireTime(String expectExpireTime) {
                this.expectExpireTime = expectExpireTime;
                return this;
            }

            /**
             * expectExpireType.
             */
            public Builder expectExpireType(String expectExpireType) {
                this.expectExpireType = expectExpireType;
                return this;
            }

            public PolarSnapshot build() {
                return new PolarSnapshot(this);
            } 

        } 

    }
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupDownloadURL")
        private String backupDownloadURL;

        @com.aliyun.core.annotation.NameInMap("BackupEndTime")
        private String backupEndTime;

        @com.aliyun.core.annotation.NameInMap("BackupId")
        private String backupId;

        @com.aliyun.core.annotation.NameInMap("BackupIntranetDownloadURL")
        private String backupIntranetDownloadURL;

        @com.aliyun.core.annotation.NameInMap("BackupLocation")
        private String backupLocation;

        @com.aliyun.core.annotation.NameInMap("BackupMethod")
        private String backupMethod;

        @com.aliyun.core.annotation.NameInMap("BackupMode")
        private String backupMode;

        @com.aliyun.core.annotation.NameInMap("BackupName")
        private String backupName;

        @com.aliyun.core.annotation.NameInMap("BackupScale")
        private String backupScale;

        @com.aliyun.core.annotation.NameInMap("BackupSize")
        private Long backupSize;

        @com.aliyun.core.annotation.NameInMap("BackupStartTime")
        private String backupStartTime;

        @com.aliyun.core.annotation.NameInMap("BackupStatus")
        private String backupStatus;

        @com.aliyun.core.annotation.NameInMap("BackupType")
        private String backupType;

        @com.aliyun.core.annotation.NameInMap("Checksum")
        private String checksum;

        @com.aliyun.core.annotation.NameInMap("ConsistentTime")
        private Long consistentTime;

        @com.aliyun.core.annotation.NameInMap("Encryption")
        private String encryption;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("ExpectExpireTime")
        private String expectExpireTime;

        @com.aliyun.core.annotation.NameInMap("ExpectExpireType")
        private String expectExpireType;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("IsAvail")
        private Integer isAvail;

        @com.aliyun.core.annotation.NameInMap("PolarSnapshot")
        private PolarSnapshot polarSnapshot;

        @com.aliyun.core.annotation.NameInMap("SupportDeletion")
        private Integer supportDeletion;

        private Content(Builder builder) {
            this.backupDownloadURL = builder.backupDownloadURL;
            this.backupEndTime = builder.backupEndTime;
            this.backupId = builder.backupId;
            this.backupIntranetDownloadURL = builder.backupIntranetDownloadURL;
            this.backupLocation = builder.backupLocation;
            this.backupMethod = builder.backupMethod;
            this.backupMode = builder.backupMode;
            this.backupName = builder.backupName;
            this.backupScale = builder.backupScale;
            this.backupSize = builder.backupSize;
            this.backupStartTime = builder.backupStartTime;
            this.backupStatus = builder.backupStatus;
            this.backupType = builder.backupType;
            this.checksum = builder.checksum;
            this.consistentTime = builder.consistentTime;
            this.encryption = builder.encryption;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.expectExpireTime = builder.expectExpireTime;
            this.expectExpireType = builder.expectExpireType;
            this.instanceName = builder.instanceName;
            this.isAvail = builder.isAvail;
            this.polarSnapshot = builder.polarSnapshot;
            this.supportDeletion = builder.supportDeletion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return backupDownloadURL
         */
        public String getBackupDownloadURL() {
            return this.backupDownloadURL;
        }

        /**
         * @return backupEndTime
         */
        public String getBackupEndTime() {
            return this.backupEndTime;
        }

        /**
         * @return backupId
         */
        public String getBackupId() {
            return this.backupId;
        }

        /**
         * @return backupIntranetDownloadURL
         */
        public String getBackupIntranetDownloadURL() {
            return this.backupIntranetDownloadURL;
        }

        /**
         * @return backupLocation
         */
        public String getBackupLocation() {
            return this.backupLocation;
        }

        /**
         * @return backupMethod
         */
        public String getBackupMethod() {
            return this.backupMethod;
        }

        /**
         * @return backupMode
         */
        public String getBackupMode() {
            return this.backupMode;
        }

        /**
         * @return backupName
         */
        public String getBackupName() {
            return this.backupName;
        }

        /**
         * @return backupScale
         */
        public String getBackupScale() {
            return this.backupScale;
        }

        /**
         * @return backupSize
         */
        public Long getBackupSize() {
            return this.backupSize;
        }

        /**
         * @return backupStartTime
         */
        public String getBackupStartTime() {
            return this.backupStartTime;
        }

        /**
         * @return backupStatus
         */
        public String getBackupStatus() {
            return this.backupStatus;
        }

        /**
         * @return backupType
         */
        public String getBackupType() {
            return this.backupType;
        }

        /**
         * @return checksum
         */
        public String getChecksum() {
            return this.checksum;
        }

        /**
         * @return consistentTime
         */
        public Long getConsistentTime() {
            return this.consistentTime;
        }

        /**
         * @return encryption
         */
        public String getEncryption() {
            return this.encryption;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return engineVersion
         */
        public String getEngineVersion() {
            return this.engineVersion;
        }

        /**
         * @return expectExpireTime
         */
        public String getExpectExpireTime() {
            return this.expectExpireTime;
        }

        /**
         * @return expectExpireType
         */
        public String getExpectExpireType() {
            return this.expectExpireType;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return isAvail
         */
        public Integer getIsAvail() {
            return this.isAvail;
        }

        /**
         * @return polarSnapshot
         */
        public PolarSnapshot getPolarSnapshot() {
            return this.polarSnapshot;
        }

        /**
         * @return supportDeletion
         */
        public Integer getSupportDeletion() {
            return this.supportDeletion;
        }

        public static final class Builder {
            private String backupDownloadURL; 
            private String backupEndTime; 
            private String backupId; 
            private String backupIntranetDownloadURL; 
            private String backupLocation; 
            private String backupMethod; 
            private String backupMode; 
            private String backupName; 
            private String backupScale; 
            private Long backupSize; 
            private String backupStartTime; 
            private String backupStatus; 
            private String backupType; 
            private String checksum; 
            private Long consistentTime; 
            private String encryption; 
            private String engine; 
            private String engineVersion; 
            private String expectExpireTime; 
            private String expectExpireType; 
            private String instanceName; 
            private Integer isAvail; 
            private PolarSnapshot polarSnapshot; 
            private Integer supportDeletion; 

            /**
             * BackupDownloadURL.
             */
            public Builder backupDownloadURL(String backupDownloadURL) {
                this.backupDownloadURL = backupDownloadURL;
                return this;
            }

            /**
             * BackupEndTime.
             */
            public Builder backupEndTime(String backupEndTime) {
                this.backupEndTime = backupEndTime;
                return this;
            }

            /**
             * BackupId.
             */
            public Builder backupId(String backupId) {
                this.backupId = backupId;
                return this;
            }

            /**
             * BackupIntranetDownloadURL.
             */
            public Builder backupIntranetDownloadURL(String backupIntranetDownloadURL) {
                this.backupIntranetDownloadURL = backupIntranetDownloadURL;
                return this;
            }

            /**
             * BackupLocation.
             */
            public Builder backupLocation(String backupLocation) {
                this.backupLocation = backupLocation;
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
             * BackupMode.
             */
            public Builder backupMode(String backupMode) {
                this.backupMode = backupMode;
                return this;
            }

            /**
             * BackupName.
             */
            public Builder backupName(String backupName) {
                this.backupName = backupName;
                return this;
            }

            /**
             * BackupScale.
             */
            public Builder backupScale(String backupScale) {
                this.backupScale = backupScale;
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
             * BackupStartTime.
             */
            public Builder backupStartTime(String backupStartTime) {
                this.backupStartTime = backupStartTime;
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
             * BackupType.
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * Checksum.
             */
            public Builder checksum(String checksum) {
                this.checksum = checksum;
                return this;
            }

            /**
             * ConsistentTime.
             */
            public Builder consistentTime(Long consistentTime) {
                this.consistentTime = consistentTime;
                return this;
            }

            /**
             * Encryption.
             */
            public Builder encryption(String encryption) {
                this.encryption = encryption;
                return this;
            }

            /**
             * Engine.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * EngineVersion.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * ExpectExpireTime.
             */
            public Builder expectExpireTime(String expectExpireTime) {
                this.expectExpireTime = expectExpireTime;
                return this;
            }

            /**
             * ExpectExpireType.
             */
            public Builder expectExpireType(String expectExpireType) {
                this.expectExpireType = expectExpireType;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * IsAvail.
             */
            public Builder isAvail(Integer isAvail) {
                this.isAvail = isAvail;
                return this;
            }

            /**
             * PolarSnapshot.
             */
            public Builder polarSnapshot(PolarSnapshot polarSnapshot) {
                this.polarSnapshot = polarSnapshot;
                return this;
            }

            /**
             * SupportDeletion.
             */
            public Builder supportDeletion(Integer supportDeletion) {
                this.supportDeletion = supportDeletion;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private java.util.List < Content> content;

        @com.aliyun.core.annotation.NameInMap("Extra")
        private String extra;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalElements")
        private Long totalElements;

        @com.aliyun.core.annotation.NameInMap("TotalPages")
        private Long totalPages;

        private Data(Builder builder) {
            this.content = builder.content;
            this.extra = builder.extra;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalElements = builder.totalElements;
            this.totalPages = builder.totalPages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public java.util.List < Content> getContent() {
            return this.content;
        }

        /**
         * @return extra
         */
        public String getExtra() {
            return this.extra;
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalElements
         */
        public Long getTotalElements() {
            return this.totalElements;
        }

        /**
         * @return totalPages
         */
        public Long getTotalPages() {
            return this.totalPages;
        }

        public static final class Builder {
            private java.util.List < Content> content; 
            private String extra; 
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalElements; 
            private Long totalPages; 

            /**
             * Content.
             */
            public Builder content(java.util.List < Content> content) {
                this.content = content;
                return this;
            }

            /**
             * Extra.
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalElements.
             */
            public Builder totalElements(Long totalElements) {
                this.totalElements = totalElements;
                return this;
            }

            /**
             * TotalPages.
             */
            public Builder totalPages(Long totalPages) {
                this.totalPages = totalPages;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
