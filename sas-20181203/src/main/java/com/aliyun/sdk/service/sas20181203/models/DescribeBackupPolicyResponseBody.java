// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeBackupPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupPolicyResponseBody</p>
 */
public class DescribeBackupPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackupPolicyDetail")
    private BackupPolicyDetail backupPolicyDetail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The details of the anti-ransomware policy.</p>
         */
        public Builder backupPolicyDetail(BackupPolicyDetail backupPolicyDetail) {
            this.backupPolicyDetail = backupPolicyDetail;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>A4EB8B1C-1DEC-5E18-BCD0-D1BBB3936FA7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBackupPolicyResponseBody build() {
            return new DescribeBackupPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBackupPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupPolicyResponseBody</p>
     */
    public static class BackupPolicyDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientStatus")
        private String clientStatus;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("PolicyVersion")
        private String policyVersion;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UuidList")
        private java.util.List<String> uuidList;

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
        public java.util.List<String> getUuidList() {
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
            private java.util.List<String> uuidList; 

            /**
             * <p>The status of the anti-ransomware agent. Valid values:</p>
             * <ul>
             * <li><strong>running</strong>: normal</li>
             * <li><strong>exception</strong>: abnormal</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder clientStatus(String clientStatus) {
                this.clientStatus = clientStatus;
                return this;
            }

            /**
             * <p>The ID of the anti-ransomware policy.</p>
             * 
             * <strong>example:</strong>
             * <p>51880</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the anti-ransomware policy.</p>
             * 
             * <strong>example:</strong>
             * <p>testBuckUp</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <ul>
             * <li><p><strong>IsDefault</strong>: the type of the anti-ransomware policy. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: recommended policy</li>
             * <li><strong>0</strong>: custom policy</li>
             * </ul>
             * </li>
             * <li><p><strong>Include</strong>: the format of the files that you want to protect. If you want to protect the files in all formats, set this field to [].</p>
             * </li>
             * <li><p><strong>Source</strong>: the directory that you want to protect. If you want to protect all directories, set this field to [].</p>
             * </li>
             * <li><p><strong>ExcludeSystemPath</strong>: specifies whether to exclude a specific directory from the anti-ransomware policy. If you want to exclude a directory, set this field to <strong>true</strong>. If you do not want to exclude a directory, leave this field empty.</p>
             * </li>
             * <li><p><strong>Exclude</strong>: the directory that you want to exclude from the anti-ransomware policy. If you do not want to exclude a directory, set this field to [].</p>
             * </li>
             * <li><p><strong>Schedule</strong>: the start time and interval of a data backup task. We recommend that you specify a start time that begins during off-peak hours but does not start on the hour. Examples:</p>
             * <ul>
             * <li>If you set this field to I|1583216092|P21D, the data backup task starts from 2020-03-03 14:14:52, and the task is run at an interval of three weeks.</li>
             * <li>If you set this field to I|1583216092|PT24H, the data backup task starts from 2020-03-03 14:14:52, and the task is run at an interval of 24 hours.</li>
             * </ul>
             * </li>
             * <li><p><strong>Retention</strong>: the period during which backup data is retained. Unit: days. If you set this field to 7, backup data is retained for a week. If you set this field to 365, backup data is retained for a year. If you set this field to -1, backup data is permanently retained.</p>
             * </li>
             * <li><p><strong>SpeedLimiter</strong>: the limit on the network bandwidth for data backup tasks. If you set this field to 0:24:30720, the maximum bandwidth for a data backup task is 30 MB/s from 00:00 to 24:00.</p>
             * </li>
             * <li><p><strong>UseVss</strong>: specifies whether to enable the VSS feature. The feature is available only for Windows servers. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * </li>
             * </ul>
             * <blockquote>
             * <p> The VSS feature is available only if you create the anti-ransomware policy for Windows servers. After you enable the feature, the number of backup failures due to running processes is significantly reduced. We recommend that you enable the VSS feature. After you enable the feature, the data of disks that are in the exFAT and FAT32 formats cannot be backed up.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{
             *       &quot;Exclude&quot;: [
             *             &quot;/bin/&quot;,
             *             &quot;/usr/bin/&quot;,
             *             &quot;/sbin/&quot;,
             *             &quot;/boot/&quot;,
             *             &quot;/proc/&quot;,
             *             &quot;/sys/&quot;,
             *             &quot;/srv/&quot;,
             *             &quot;/lib/&quot;,
             *             &quot;/selinux/&quot;,
             *             &quot;/usr/sbin/&quot;,
             *             &quot;/run/&quot;,
             *             &quot;/lib32/&quot;,
             *             &quot;/lib64/&quot;,
             *             &quot;/lost+found/&quot;,
             *             &quot;/var/lib/kubelet/&quot;,
             *             &quot;/var/lib/ntp/proc&quot;,
             *             &quot;/var/lib/container&quot;,
             *             &quot;Windows\&quot;,
             *             &quot;Python27\&quot;,
             *             &quot;Program Files (x86)\&quot;,
             *             &quot;Program Files\&quot;,
             *             &quot;Boot\&quot;,
             *             &quot;$RECYCLE.BIN&quot;,
             *             &quot;System Volume Information\&quot;,
             *             &quot;Users\Administrator\NTUSER.DAT*&quot;,
             *             &quot;ProgramData\&quot;,
             *             &quot;pagefile.sys&quot;,
             *             &quot;Users\Default\NTUSER.DAT*&quot;,
             *             &quot;Users\Administrator\ntuser.*&quot;
             *       ],
             *       &quot;ExcludeSystemPath&quot;: true,
             *       &quot;Include&quot;: [],
             *       &quot;IsDefault&quot;: 1,
             *       &quot;Retention&quot;: 7,
             *       &quot;Schedule&quot;: &quot;I|1630689360|PT24H&quot;,
             *       &quot;Source&quot;: [],
             *       &quot;SpeedLimiter&quot;: &quot;&quot;,
             *       &quot;UseVss&quot;: true
             * }</p>
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * <p>The version of the anti-ransomware policy.</p>
             * <ul>
             * <li><strong>1.0.0</strong></li>
             * <li><strong>2.0.0</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2.0.0</p>
             */
            public Builder policyVersion(String policyVersion) {
                this.policyVersion = policyVersion;
                return this;
            }

            /**
             * <p>The ID of the region in which backup data is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The status of the anti-ransomware policy. Valid values:</p>
             * <ul>
             * <li><strong>enabled</strong>: The anti-ransomware policy is manually enabled.</li>
             * <li><strong>disabled</strong>: The anti-ransomware policy is manually disabled. After an anti-ransomware policy is disabled, the data backup task that is running based on the policy stops.</li>
             * <li><strong>closed</strong>: The anti-ransomware policy automatically stops because the anti-ransomware capacity is insufficient.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>closed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>An array consisting of the UUIDs of the servers to which the anti-ransomware policy is applied.</p>
             */
            public Builder uuidList(java.util.List<String> uuidList) {
                this.uuidList = uuidList;
                return this;
            }

            public BackupPolicyDetail build() {
                return new BackupPolicyDetail(this);
            } 

        } 

    }
}
