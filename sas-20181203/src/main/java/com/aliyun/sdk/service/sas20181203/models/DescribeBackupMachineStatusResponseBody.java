// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeBackupMachineStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupMachineStatusResponseBody</p>
 */
public class DescribeBackupMachineStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackupMachineStatus")
    private BackupMachineStatus backupMachineStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The backup status of the server.</p>
         */
        public Builder backupMachineStatus(BackupMachineStatus backupMachineStatus) {
            this.backupMachineStatus = backupMachineStatus;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>09969D2C-4FAD-429E-BFBF-9A60DEF8****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBackupMachineStatusResponseBody build() {
            return new DescribeBackupMachineStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBackupMachineStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupMachineStatusResponseBody</p>
     */
    public static class ErrorList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorStatus")
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
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>TARGET_NOT_EXIST</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>FAILED</p>
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
    /**
     * 
     * {@link DescribeBackupMachineStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupMachineStatusResponseBody</p>
     */
    public static class BackupMachineStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("ClientStatus")
        private String clientStatus;

        @com.aliyun.core.annotation.NameInMap("ClientVersion")
        private String clientVersion;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorList")
        private java.util.List < ErrorList> errorList;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SavedBackupCount")
        private Integer savedBackupCount;

        @com.aliyun.core.annotation.NameInMap("ServiceStatus")
        private String serviceStatus;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        @com.aliyun.core.annotation.NameInMap("VaultId")
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
            this.serviceStatus = builder.serviceStatus;
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
         * @return serviceStatus
         */
        public String getServiceStatus() {
            return this.serviceStatus;
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
            private String serviceStatus; 
            private String status; 
            private String uuid; 
            private String vaultId; 

            /**
             * <p>The ID of the anti-ransomware agent.</p>
             * 
             * <strong>example:</strong>
             * <p>c-000dbefaw9f7gnbw****</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>The status of the anti-ransomware agent. Valid values:</p>
             * <ul>
             * <li><strong>ONLINE</strong>: normal</li>
             * <li><strong>CLIENT_CONNECTION_ERROR</strong>: abnormal</li>
             * <li><strong>UNINSTALLING</strong>: being uninstalled</li>
             * <li><strong>UNINSTALL_FAILED</strong>: failed to be uninstalled</li>
             * <li><strong>UPGRADING</strong>: being upgraded</li>
             * <li><strong>UPGRADE_FAILED</strong>: failed to be upgraded</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ONLINE</p>
             */
            public Builder clientStatus(String clientStatus) {
                this.clientStatus = clientStatus;
                return this;
            }

            /**
             * <p>The version of the anti-ransomware agent.</p>
             * 
             * <strong>example:</strong>
             * <p>2.11.0</p>
             */
            public Builder clientVersion(String clientVersion) {
                this.clientVersion = clientVersion;
                return this;
            }

            /**
             * <p>The error code returned.</p>
             * 
             * <strong>example:</strong>
             * <p>CLIENT_CONNECTION_ERROR</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>An array that consists of the error information reported by the backup server.</p>
             */
            public Builder errorList(java.util.List < ErrorList> errorList) {
                this.errorList = errorList;
                return this;
            }

            /**
             * <p>The ID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>i-2zeaqkb80vloxjcj****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The ID of the region in which the server resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shenzhen</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The number of backup versions.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder savedBackupCount(Integer savedBackupCount) {
                this.savedBackupCount = savedBackupCount;
                return this;
            }

            /**
             * <p>The status of the anti-ransomware service. Valid values:</p>
             * <ul>
             * <li><strong>SERVICE_EXCEPTION</strong>: Service exception</li>
             * <li><strong>RESTORING</strong>: Restoring</li>
             * <li><strong>BACKING_UP</strong>: Backup in process</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RESTORING</p>
             */
            public Builder serviceStatus(String serviceStatus) {
                this.serviceStatus = serviceStatus;
                return this;
            }

            /**
             * <p>The status of the anti-ransomware agent. Valid values:</p>
             * <ul>
             * <li><strong>NOT_INSTALLED</strong>: not installed</li>
             * <li><strong>CLIENT_CONNECTION_ERROR</strong>: abnormal</li>
             * <li><strong>ACTIVATED</strong>: normal</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ACTIVATED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The UUID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>eb2c782e-64f2-4590-a86c-d90164df****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * <p>The ID of the backup vault in which the backup data is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>v-0005i2qh5fcr6seo****</p>
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
