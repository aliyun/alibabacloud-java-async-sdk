// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

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
         * The backup status of the server.
         */
        public Builder backupMachineStatus(BackupMachineStatus backupMachineStatus) {
            this.backupMachineStatus = backupMachineStatus;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
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

        @NameInMap("ErrorStatus")
        private String errorStatus;

        private ErrorList(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorStatus = builder.errorStatus;
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
         * @return errorStatus
         */
        public String getErrorStatus() {
            return this.errorStatus;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorStatus; 

            /**
             * The error code returned.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The error message returned.
             */
            public Builder errorStatus(String errorStatus) {
                this.errorStatus = errorStatus;
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
            private Integer savedBackupCount; 
            private String status; 
            private String uuid; 
            private String vaultId; 

            /**
             * The ID of the anti-ransomware agent.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * The status of the anti-ransomware agent. Valid values:
             * <p>
             * 
             * *   **ONLINE**: normal
             * *   **CLIENT_CONNECTION_ERROR**: abnormal
             * *   **UNINSTALLING**: being uninstalled
             * *   **UNINSTALL_FAILED**: failed to be uninstalled
             * *   **UPGRADING**: being upgraded
             * *   **UPGRADE_FAILED**: failed to be upgraded
             */
            public Builder clientStatus(String clientStatus) {
                this.clientStatus = clientStatus;
                return this;
            }

            /**
             * The version of the anti-ransomware agent.
             */
            public Builder clientVersion(String clientVersion) {
                this.clientVersion = clientVersion;
                return this;
            }

            /**
             * The error code returned.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * An array that consists of the error information reported by the backup server.
             */
            public Builder errorList(java.util.List < ErrorList> errorList) {
                this.errorList = errorList;
                return this;
            }

            /**
             * The ID of the server.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The ID of the region in which the server resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The number of backup versions.
             */
            public Builder savedBackupCount(Integer savedBackupCount) {
                this.savedBackupCount = savedBackupCount;
                return this;
            }

            /**
             * The status of the anti-ransomware agent. Valid values:
             * <p>
             * 
             * *   **NOT_INSTALLED**: not installed
             * *   **CLIENT_CONNECTION_ERROR**: abnormal
             * *   **ACTIVATED**: normal
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The UUID of the server.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * The ID of the backup vault in which the backup data is stored.
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
