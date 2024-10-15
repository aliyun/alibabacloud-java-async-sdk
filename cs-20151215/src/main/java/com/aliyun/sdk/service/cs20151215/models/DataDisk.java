// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DataDisk} extends {@link TeaModel}
 *
 * <p>DataDisk</p>
 */
public class DataDisk extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("auto_format")
    private Boolean autoFormat;

    @com.aliyun.core.annotation.NameInMap("auto_snapshot_policy_id")
    private String autoSnapshotPolicyId;

    @com.aliyun.core.annotation.NameInMap("bursting_enabled")
    private Boolean burstingEnabled;

    @com.aliyun.core.annotation.NameInMap("category")
    private String category;

    @com.aliyun.core.annotation.NameInMap("device")
    private String device;

    @com.aliyun.core.annotation.NameInMap("disk_name")
    private String diskName;

    @com.aliyun.core.annotation.NameInMap("encrypted")
    private String encrypted;

    @com.aliyun.core.annotation.NameInMap("file_system")
    private String fileSystem;

    @com.aliyun.core.annotation.NameInMap("kms_key_id")
    private String kmsKeyId;

    @com.aliyun.core.annotation.NameInMap("mount_target")
    private String mountTarget;

    @com.aliyun.core.annotation.NameInMap("performance_level")
    private String performanceLevel;

    @com.aliyun.core.annotation.NameInMap("provisioned_iops")
    private Long provisionedIops;

    @com.aliyun.core.annotation.NameInMap("size")
    private Long size;

    @com.aliyun.core.annotation.NameInMap("snapshot_id")
    private String snapshotId;

    private DataDisk(Builder builder) {
        this.autoFormat = builder.autoFormat;
        this.autoSnapshotPolicyId = builder.autoSnapshotPolicyId;
        this.burstingEnabled = builder.burstingEnabled;
        this.category = builder.category;
        this.device = builder.device;
        this.diskName = builder.diskName;
        this.encrypted = builder.encrypted;
        this.fileSystem = builder.fileSystem;
        this.kmsKeyId = builder.kmsKeyId;
        this.mountTarget = builder.mountTarget;
        this.performanceLevel = builder.performanceLevel;
        this.provisionedIops = builder.provisionedIops;
        this.size = builder.size;
        this.snapshotId = builder.snapshotId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataDisk create() {
        return builder().build();
    }

    /**
     * @return autoFormat
     */
    public Boolean getAutoFormat() {
        return this.autoFormat;
    }

    /**
     * @return autoSnapshotPolicyId
     */
    public String getAutoSnapshotPolicyId() {
        return this.autoSnapshotPolicyId;
    }

    /**
     * @return burstingEnabled
     */
    public Boolean getBurstingEnabled() {
        return this.burstingEnabled;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return device
     */
    public String getDevice() {
        return this.device;
    }

    /**
     * @return diskName
     */
    public String getDiskName() {
        return this.diskName;
    }

    /**
     * @return encrypted
     */
    public String getEncrypted() {
        return this.encrypted;
    }

    /**
     * @return fileSystem
     */
    public String getFileSystem() {
        return this.fileSystem;
    }

    /**
     * @return kmsKeyId
     */
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * @return mountTarget
     */
    public String getMountTarget() {
        return this.mountTarget;
    }

    /**
     * @return performanceLevel
     */
    public String getPerformanceLevel() {
        return this.performanceLevel;
    }

    /**
     * @return provisionedIops
     */
    public Long getProvisionedIops() {
        return this.provisionedIops;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    /**
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public static final class Builder {
        private Boolean autoFormat; 
        private String autoSnapshotPolicyId; 
        private Boolean burstingEnabled; 
        private String category; 
        private String device; 
        private String diskName; 
        private String encrypted; 
        private String fileSystem; 
        private String kmsKeyId; 
        private String mountTarget; 
        private String performanceLevel; 
        private Long provisionedIops; 
        private Long size; 
        private String snapshotId; 

        /**
         * auto_format.
         */
        public Builder autoFormat(Boolean autoFormat) {
            this.autoFormat = autoFormat;
            return this;
        }

        /**
         * auto_snapshot_policy_id.
         */
        public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }

        /**
         * bursting_enabled.
         */
        public Builder burstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }

        /**
         * category.
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * device.
         */
        public Builder device(String device) {
            this.device = device;
            return this;
        }

        /**
         * disk_name.
         */
        public Builder diskName(String diskName) {
            this.diskName = diskName;
            return this;
        }

        /**
         * encrypted.
         */
        public Builder encrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }

        /**
         * file_system.
         */
        public Builder fileSystem(String fileSystem) {
            this.fileSystem = fileSystem;
            return this;
        }

        /**
         * kms_key_id.
         */
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * mount_target.
         */
        public Builder mountTarget(String mountTarget) {
            this.mountTarget = mountTarget;
            return this;
        }

        /**
         * performance_level.
         */
        public Builder performanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }

        /**
         * provisioned_iops.
         */
        public Builder provisionedIops(Long provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }

        /**
         * size.
         */
        public Builder size(Long size) {
            this.size = size;
            return this;
        }

        /**
         * snapshot_id.
         */
        public Builder snapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }

        public DataDisk build() {
            return new DataDisk(this);
        } 

    } 

}
