// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupPolicyResponseBody</p>
 */
public class DescribeBackupPolicyResponseBody extends TeaModel {
    @NameInMap("BackupPolicyDetail")
    private BackupPolicyDetail backupPolicyDetail;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeBackupPolicyResponseBody(Builder builder) {
        this.backupPolicyDetail = builder.backupPolicyDetail;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return backupPolicyDetail
     */
    public BackupPolicyDetail getBackupPolicyDetail() {
        return this.backupPolicyDetail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private BackupPolicyDetail backupPolicyDetail; 
        private String requestId; 

        /**
         * The details of the anti-ransomware policy.
         */
        public Builder backupPolicyDetail(BackupPolicyDetail backupPolicyDetail) {
            this.backupPolicyDetail = backupPolicyDetail;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBackupPolicyResponseBody build() {
            return new DescribeBackupPolicyResponseBody(this);
        } 

    } 

    public static class BackupPolicyDetail extends TeaModel {
        @NameInMap("ClientStatus")
        private String clientStatus;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
        private String name;

        @NameInMap("Policy")
        private String policy;

        @NameInMap("PolicyVersion")
        private String policyVersion;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Status")
        private String status;

        @NameInMap("UuidList")
        private java.util.List < String > uuidList;

        private BackupPolicyDetail(Builder builder) {
            this.clientStatus = builder.clientStatus;
            this.id = builder.id;
            this.name = builder.name;
            this.policy = builder.policy;
            this.policyVersion = builder.policyVersion;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.uuidList = builder.uuidList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackupPolicyDetail create() {
            return builder().build();
        }

        /**
         * @return clientStatus
         */
        public String getClientStatus() {
            return this.clientStatus;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return policyVersion
         */
        public String getPolicyVersion() {
            return this.policyVersion;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return uuidList
         */
        public java.util.List < String > getUuidList() {
            return this.uuidList;
        }

        public static final class Builder {
            private String clientStatus; 
            private Long id; 
            private String name; 
            private String policy; 
            private String policyVersion; 
            private String regionId; 
            private String status; 
            private java.util.List < String > uuidList; 

            /**
             * The status of the anti-ransomware agent. Valid values:
             * <p>
             * 
             * *   **running**: normal
             * *   **exception**: abnormal
             */
            public Builder clientStatus(String clientStatus) {
                this.clientStatus = clientStatus;
                return this;
            }

            /**
             * The ID of the anti-ransomware policy.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the anti-ransomware policy.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * *   **IsDefault**: the type of the anti-ransomware policy. Valid values:
             * <p>
             * 
             *     *   **1**: recommended policy
             *     *   **0**: custom policy
             * 
             * *   **Include**: the format of the files that you want to protect. If you want to protect the files in all formats, set this field to \[].
             * 
             * *   **Source**: the directory that you want to protect. If you want to protect all directories, set this field to \[].
             * 
             * *   **ExcludeSystemPath**: specifies whether to exclude a specific directory from the anti-ransomware policy. If you want to exclude a directory, set this field to **true**. If you do not want to exclude a directory, leave this field empty.
             * 
             * *   **Exclude**: the directory that you want to exclude from the anti-ransomware policy. If you do not want to exclude a directory, set this field to \[].
             * 
             * *   **Schedule**: the start time and interval of a data backup task. We recommend that you specify a start time that begins during off-peak hours but does not start on the hour. Examples:
             * 
             *     *   If you set this field to I|1583216092|P21D, the data backup task starts from 2020-03-03 14:14:52, and the task is run at an interval of three weeks.
             *     *   If you set this field to I|1583216092|PT24H, the data backup task starts from 2020-03-03 14:14:52, and the task is run at an interval of 24 hours.
             * 
             * *   **Retention**: the period during which backup data is retained. Unit: days. If you set this field to 7, backup data is retained for a week. If you set this field to 365, backup data is retained for a year. If you set this field to -1, backup data is permanently retained.
             * 
             * *   **SpeedLimiter**: the limit on the network bandwidth for data backup tasks. If you set this field to 0:24:30720, the maximum bandwidth for a data backup task is 30 MB/s from 00:00 to 24:00.
             * 
             * *   **UseVss**: specifies whether to enable the VSS feature. The feature is available only for Windows servers. Valid values:
             * 
             *     *   **true**: yes
             *     *   **false**: no
             * 
             * >  The VSS feature is available only if you create the anti-ransomware policy for Windows servers. After you enable the feature, the number of backup failures due to running processes is significantly reduced. We recommend that you enable the VSS feature. After you enable the feature, the data of disks that are in the exFAT and FAT32 formats cannot be backed up.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * The version of the anti-ransomware policy.
             * <p>
             * 
             * *   **1.0.0**
             * *   **2.0.0**
             */
            public Builder policyVersion(String policyVersion) {
                this.policyVersion = policyVersion;
                return this;
            }

            /**
             * The ID of the region in which backup data is stored.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The status of the anti-ransomware policy. Valid values:
             * <p>
             * 
             * *   **enabled**: The anti-ransomware policy is manually enabled.
             * *   **disabled**: The anti-ransomware policy is manually disabled. After an anti-ransomware policy is disabled, the data backup task that is running based on the policy stops.
             * *   **closed**: The anti-ransomware policy automatically stops because the anti-ransomware capacity is insufficient.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * An array consisting of the UUIDs of the servers to which the anti-ransomware policy is applied.
             */
            public Builder uuidList(java.util.List < String > uuidList) {
                this.uuidList = uuidList;
                return this;
            }

            public BackupPolicyDetail build() {
                return new BackupPolicyDetail(this);
            } 

        } 

    }
}
