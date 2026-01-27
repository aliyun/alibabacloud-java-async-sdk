// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeBackupDataListResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Request.Forbidden</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified parameter %s value is not valid.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified parameter %s value is not valid.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>95A5FFD0-7F46-5A7D-9DFE-6A376B4E2A28</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeBackupDataListResponseBody build() {
            return new DescribeBackupDataListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBackupDataListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupDataListResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(PolarSnapshot model) {
                this.dumpId = model.dumpId;
                this.dumpSize = model.dumpSize;
                this.expectExpireTime = model.expectExpireTime;
                this.expectExpireType = model.expectExpireType;
            } 

            /**
             * <p>The dump backup ID.</p>
             * 
             * <strong>example:</strong>
             * <p>abc****</p>
             */
            public Builder dumpId(Long dumpId) {
                this.dumpId = dumpId;
                return this;
            }

            /**
             * <p>The size of the dump backup. Unit: byte.</p>
             * 
             * <strong>example:</strong>
             * <p>25669140589</p>
             */
            public Builder dumpSize(Long dumpSize) {
                this.dumpSize = dumpSize;
                return this;
            }

            /**
             * <p>The time when the backup set expires. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-04-19T05:00:49Z</p>
             */
            public Builder expectExpireTime(String expectExpireTime) {
                this.expectExpireTime = expectExpireTime;
                return this;
            }

            /**
             * <p>Indicates whether the backup set expires. Valid values:</p>
             * <ul>
             * <li>NEVER: The backup set does not expire.</li>
             * <li>EXPIRED: The backup set expired.</li>
             * <li>DELAY: The backup set expires after a specific period of time.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DELAY</p>
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
    /**
     * 
     * {@link DescribeBackupDataListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupDataListResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Content model) {
                this.backupDownloadURL = model.backupDownloadURL;
                this.backupEndTime = model.backupEndTime;
                this.backupId = model.backupId;
                this.backupIntranetDownloadURL = model.backupIntranetDownloadURL;
                this.backupLocation = model.backupLocation;
                this.backupMethod = model.backupMethod;
                this.backupMode = model.backupMode;
                this.backupName = model.backupName;
                this.backupScale = model.backupScale;
                this.backupSize = model.backupSize;
                this.backupStartTime = model.backupStartTime;
                this.backupStatus = model.backupStatus;
                this.backupType = model.backupType;
                this.checksum = model.checksum;
                this.consistentTime = model.consistentTime;
                this.encryption = model.encryption;
                this.engine = model.engine;
                this.engineVersion = model.engineVersion;
                this.expectExpireTime = model.expectExpireTime;
                this.expectExpireType = model.expectExpireType;
                this.instanceName = model.instanceName;
                this.isAvail = model.isAvail;
                this.polarSnapshot = model.polarSnapshot;
                this.supportDeletion = model.supportDeletion;
            } 

            /**
             * <p>The URL that is used to download the backup set over the Internet.</p>
             * <blockquote>
             * <p> This parameter is returned only when the value of BackupMethod is <strong>Physical</strong> or <strong>Logical</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p><a href="http://oss.com/">http://oss.com/</a>****</p>
             */
            public Builder backupDownloadURL(String backupDownloadURL) {
                this.backupDownloadURL = backupDownloadURL;
                return this;
            }

            /**
             * <p>The end time of the backup. The time is in the yyyy-MM-ddTHH:mm:ssZ format. The time is in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-04-17T17:00:32Z</p>
             */
            public Builder backupEndTime(String backupEndTime) {
                this.backupEndTime = backupEndTime;
                return this;
            }

            /**
             * <p>The ID of the backup set.</p>
             * 
             * <strong>example:</strong>
             * <p>213088****</p>
             */
            public Builder backupId(String backupId) {
                this.backupId = backupId;
                return this;
            }

            /**
             * <p>The URL that is used to download the backup set over the internal network.</p>
             * <blockquote>
             * <p> This parameter is returned only when the value of BackupMethod is <strong>Physical</strong> or <strong>Logical</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p><a href="http://oss.com/">http://oss.com/</a>****</p>
             */
            public Builder backupIntranetDownloadURL(String backupIntranetDownloadURL) {
                this.backupIntranetDownloadURL = backupIntranetDownloadURL;
                return this;
            }

            /**
             * <p>The storage path of backup files.</p>
             * 
             * <strong>example:</strong>
             * <p>logic</p>
             */
            public Builder backupLocation(String backupLocation) {
                this.backupLocation = backupLocation;
                return this;
            }

            /**
             * <p>The backup method. Valid values:</p>
             * <ul>
             * <li><strong>Physical</strong></li>
             * <li><strong>Logical</strong></li>
             * <li><strong>Snapshot</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Snapshot</p>
             */
            public Builder backupMethod(String backupMethod) {
                this.backupMethod = backupMethod;
                return this;
            }

            /**
             * <p>The backup mode. Valid values:</p>
             * <ul>
             * <li><strong>Automated</strong></li>
             * <li><strong>Manual</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Automated</p>
             */
            public Builder backupMode(String backupMode) {
                this.backupMode = backupMode;
                return this;
            }

            /**
             * <p>The name of the backup set.</p>
             * 
             * <strong>example:</strong>
             * <p>logic_backup</p>
             */
            public Builder backupName(String backupName) {
                this.backupName = backupName;
                return this;
            }

            /**
             * <p>The backup scale. Valid values:</p>
             * <ul>
             * <li><strong>DBInstance</strong></li>
             * <li><strong>DBTable</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DBInstance</p>
             */
            public Builder backupScale(String backupScale) {
                this.backupScale = backupScale;
                return this;
            }

            /**
             * <p>The size of the backup set. Unit: byte.</p>
             * 
             * <strong>example:</strong>
             * <p>25669140480</p>
             */
            public Builder backupSize(Long backupSize) {
                this.backupSize = backupSize;
                return this;
            }

            /**
             * <p>The start time of the backup. The time is in the yyyy-MM-ddTHH:mm:ssZ format. The time is in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-04-17T17:00:16Z</p>
             */
            public Builder backupStartTime(String backupStartTime) {
                this.backupStartTime = backupStartTime;
                return this;
            }

            /**
             * <p>The status of the backup set. Valid values:</p>
             * <ul>
             * <li><strong>OK</strong>: The backup succeeded.</li>
             * <li><strong>ERROR</strong>: The backup failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
             */
            public Builder backupStatus(String backupStatus) {
                this.backupStatus = backupStatus;
                return this;
            }

            /**
             * <p>The backup type. Valid values:</p>
             * <ul>
             * <li><strong>FullBackup</strong></li>
             * <li><strong>IncrementBackup</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FullBackup</p>
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * <p>The checksum value.</p>
             * 
             * <strong>example:</strong>
             * <p>84a4c16431f969712e6895992719****</p>
             */
            public Builder checksum(String checksum) {
                this.checksum = checksum;
                return this;
            }

            /**
             * <p>The snapshot checkpoint time. This value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1713373221</p>
             */
            public Builder consistentTime(Long consistentTime) {
                this.consistentTime = consistentTime;
                return this;
            }

            /**
             * <p>The information about the encryption.</p>
             * 
             * <strong>example:</strong>
             * <p>psk2</p>
             */
            public Builder encryption(String encryption) {
                this.encryption = encryption;
                return this;
            }

            /**
             * <p>The type of the database engine.</p>
             * 
             * <strong>example:</strong>
             * <p>polardb_mysql</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The engine version.</p>
             * 
             * <strong>example:</strong>
             * <p>5.7</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>The time when the backup set expires. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-04-19T05:00:49Z</p>
             */
            public Builder expectExpireTime(String expectExpireTime) {
                this.expectExpireTime = expectExpireTime;
                return this;
            }

            /**
             * <p>Indicates whether the backup set expires. Valid values:</p>
             * <ul>
             * <li>NEVER: The backup set does not expire.</li>
             * <li>EXPIRED: The backup set expired.</li>
             * <li>DELAY: The backup set expires after a specific period of time.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DELAY</p>
             */
            public Builder expectExpireType(String expectExpireType) {
                this.expectExpireType = expectExpireType;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-2ze3nrr64c5******</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>Indicates whether the backup set is available. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: The backup set is available.</li>
             * <li><strong>0</strong>: The backup set is unavailable.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isAvail(Integer isAvail) {
                this.isAvail = isAvail;
                return this;
            }

            /**
             * <p>The information about the PolarDB level-2 dump.</p>
             * <blockquote>
             * <p> This parameter is returned only if the level-2 dump feature is enabled for the PolarDB for MySQL cluster and the level-1 backup is dumped.</p>
             * </blockquote>
             */
            public Builder polarSnapshot(PolarSnapshot polarSnapshot) {
                this.polarSnapshot = polarSnapshot;
                return this;
            }

            /**
             * <p>Indicates whether the backup set can be deleted. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The backup set can be deleted.</li>
             * <li><strong>1</strong>: The backup set cannot be deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link DescribeBackupDataListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupDataListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private java.util.List<Content> content;

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
        public java.util.List<Content> getContent() {
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
            private java.util.List<Content> content; 
            private String extra; 
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalElements; 
            private Long totalPages; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.content = model.content;
                this.extra = model.extra;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalElements = model.totalElements;
                this.totalPages = model.totalPages;
            } 

            /**
             * <p>The information about the task.</p>
             */
            public Builder content(java.util.List<Content> content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The additional information.</p>
             * 
             * <strong>example:</strong>
             * <p>dbtest</p>
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of backup sets.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalElements(Long totalElements) {
                this.totalElements = totalElements;
                return this;
            }

            /**
             * <p>The total number of pages returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
