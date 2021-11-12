// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeBackupMachineStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupMachineStatusResponseBody</p>
 */
public class DescribeBackupMachineStatusResponseBody extends TeaModel {
    @NameInMap("BackupMachineStatus")
    private BackupMachineStatus backupMachineStatus;

    @NameInMap("RequestId")
    private String requestId;


    private DescribeBackupMachineStatusResponseBody(Builder builder) {
        this.backupMachineStatus = builder.backupMachineStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupMachineStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return backupMachineStatus
     */
    public BackupMachineStatus getBackupMachineStatus() {
        return this.backupMachineStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private BackupMachineStatus backupMachineStatus; 
        private String requestId; 

        /**
         * <p>BackupMachineStatus.</p>
         */
        public Builder backupMachineStatus(BackupMachineStatus backupMachineStatus) {
            this.backupMachineStatus = backupMachineStatus;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBackupMachineStatusResponseBody build() {
            return new DescribeBackupMachineStatusResponseBody(this);
        } 

    } 

    public static class ErrorList extends TeaModel {
        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorFile")
        private String errorFile;

        @NameInMap("ErrorFileUrl")
        private String errorFileUrl;

        @NameInMap("ErrorMsg")
        private String errorMsg;

        @NameInMap("ErrorStatus")
        private String errorStatus;

        @NameInMap("ErrorTime")
        private Long errorTime;

        @NameInMap("ErrorType")
        private String errorType;

        @NameInMap("Key")
        private String key;

        @NameInMap("Path")
        private String path;

        @NameInMap("RequestId")
        private String requestId;


        private ErrorList(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorFile = builder.errorFile;
            this.errorFileUrl = builder.errorFileUrl;
            this.errorMsg = builder.errorMsg;
            this.errorStatus = builder.errorStatus;
            this.errorTime = builder.errorTime;
            this.errorType = builder.errorType;
            this.key = builder.key;
            this.path = builder.path;
            this.requestId = builder.requestId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorList create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorFile
         */
        public String getErrorFile() {
            return this.errorFile;
        }

        /**
         * @return errorFileUrl
         */
        public String getErrorFileUrl() {
            return this.errorFileUrl;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return errorStatus
         */
        public String getErrorStatus() {
            return this.errorStatus;
        }

        /**
         * @return errorTime
         */
        public Long getErrorTime() {
            return this.errorTime;
        }

        /**
         * @return errorType
         */
        public String getErrorType() {
            return this.errorType;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorFile; 
            private String errorFileUrl; 
            private String errorMsg; 
            private String errorStatus; 
            private Long errorTime; 
            private String errorType; 
            private String key; 
            private String path; 
            private String requestId; 

            /**
             * <p>ErrorCode.</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>ErrorFile.</p>
             */
            public Builder errorFile(String errorFile) {
                this.errorFile = errorFile;
                return this;
            }

            /**
             * <p>ErrorFileUrl.</p>
             */
            public Builder errorFileUrl(String errorFileUrl) {
                this.errorFileUrl = errorFileUrl;
                return this;
            }

            /**
             * <p>ErrorMsg.</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>ErrorStatus.</p>
             */
            public Builder errorStatus(String errorStatus) {
                this.errorStatus = errorStatus;
                return this;
            }

            /**
             * <p>ErrorTime.</p>
             */
            public Builder errorTime(Long errorTime) {
                this.errorTime = errorTime;
                return this;
            }

            /**
             * <p>ErrorType.</p>
             */
            public Builder errorType(String errorType) {
                this.errorType = errorType;
                return this;
            }

            /**
             * <p>Key.</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>Path.</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>RequestId.</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            public ErrorList build() {
                return new ErrorList(this);
            } 

        } 

    }
    public static class BackupMachineStatus extends TeaModel {
        @NameInMap("ClientId")
        private String clientId;

        @NameInMap("ClientStatus")
        private String clientStatus;

        @NameInMap("ClientVersion")
        private String clientVersion;

        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorList")
        private java.util.List < ErrorList> errorList;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RequestId")
        private String requestId;

        @NameInMap("SavedBackupCount")
        private Integer savedBackupCount;

        @NameInMap("Status")
        private String status;

        @NameInMap("Uuid")
        private String uuid;

        @NameInMap("VaultId")
        private String vaultId;


        private BackupMachineStatus(Builder builder) {
            this.clientId = builder.clientId;
            this.clientStatus = builder.clientStatus;
            this.clientVersion = builder.clientVersion;
            this.errorCode = builder.errorCode;
            this.errorList = builder.errorList;
            this.instanceId = builder.instanceId;
            this.regionId = builder.regionId;
            this.requestId = builder.requestId;
            this.savedBackupCount = builder.savedBackupCount;
            this.status = builder.status;
            this.uuid = builder.uuid;
            this.vaultId = builder.vaultId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackupMachineStatus create() {
            return builder().build();
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return clientStatus
         */
        public String getClientStatus() {
            return this.clientStatus;
        }

        /**
         * @return clientVersion
         */
        public String getClientVersion() {
            return this.clientVersion;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorList
         */
        public java.util.List < ErrorList> getErrorList() {
            return this.errorList;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return savedBackupCount
         */
        public Integer getSavedBackupCount() {
            return this.savedBackupCount;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        /**
         * @return vaultId
         */
        public String getVaultId() {
            return this.vaultId;
        }

        public static final class Builder {
            private String clientId; 
            private String clientStatus; 
            private String clientVersion; 
            private String errorCode; 
            private java.util.List < ErrorList> errorList; 
            private String instanceId; 
            private String regionId; 
            private String requestId; 
            private Integer savedBackupCount; 
            private String status; 
            private String uuid; 
            private String vaultId; 

            /**
             * <p>ClientId.</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>ClientStatus.</p>
             */
            public Builder clientStatus(String clientStatus) {
                this.clientStatus = clientStatus;
                return this;
            }

            /**
             * <p>ClientVersion.</p>
             */
            public Builder clientVersion(String clientVersion) {
                this.clientVersion = clientVersion;
                return this;
            }

            /**
             * <p>ErrorCode.</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>ErrorList.</p>
             */
            public Builder errorList(java.util.List < ErrorList> errorList) {
                this.errorList = errorList;
                return this;
            }

            /**
             * <p>InstanceId.</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>RegionId.</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>RequestId.</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>SavedBackupCount.</p>
             */
            public Builder savedBackupCount(Integer savedBackupCount) {
                this.savedBackupCount = savedBackupCount;
                return this;
            }

            /**
             * <p>Status.</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Uuid.</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * <p>VaultId.</p>
             */
            public Builder vaultId(String vaultId) {
                this.vaultId = vaultId;
                return this;
            }

            public BackupMachineStatus build() {
                return new BackupMachineStatus(this);
            } 

        } 

    }
}
