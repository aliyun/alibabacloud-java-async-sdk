// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link DataDisk} extends {@link TeaModel}
 *
 * <p>DataDisk</p>
 */
public class DataDisk extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("auto_format")
    @Deprecated
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
    @Deprecated
    private String fileSystem;

    @com.aliyun.core.annotation.NameInMap("kms_key_id")
    private String kmsKeyId;

    @com.aliyun.core.annotation.NameInMap("mount_target")
    @Deprecated
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DataDisk model) {
            this.autoFormat = model.autoFormat;
            this.autoSnapshotPolicyId = model.autoSnapshotPolicyId;
            this.burstingEnabled = model.burstingEnabled;
            this.category = model.category;
            this.device = model.device;
            this.diskName = model.diskName;
            this.encrypted = model.encrypted;
            this.fileSystem = model.fileSystem;
            this.kmsKeyId = model.kmsKeyId;
            this.mountTarget = model.mountTarget;
            this.performanceLevel = model.performanceLevel;
            this.provisionedIops = model.provisionedIops;
            this.size = model.size;
            this.snapshotId = model.snapshotId;
        } 

        /**
         * <p>Specifies whether to mount the data cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoFormat(Boolean autoFormat) {
            this.autoFormat = autoFormat;
            return this;
        }

        /**
         * <p>The ID of the automatic snapshot policy. The cloud disk is automatically backed up based on the snapshot policy.</p>
         * <p>Default value: empty, which indicates that automatic backup is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-2zej1nogjvovnz4z****</p>
         */
        public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }

        /**
         * <p>Specifies whether to enable performance burst for the data cloud disk. Valid values:</p>
         * <ul>
         * <li>true: Yes.</li>
         * <li>false: No.</li>
         * </ul>
         * <p>This parameter is supported only when DiskCategory is set to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder burstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }

        /**
         * <p>The type of the data cloud disk. Valid values:</p>
         * <ul>
         * <li>cloud: Basic cloud disk.</li>
         * <li>cloud_efficiency: Ultra disk.</li>
         * <li>cloud_ssd: Standard SSD.</li>
         * <li>cloud_essd: ESSD.</li>
         * <li>cloud_auto: ESSD AutoPL cloud disk.</li>
         * <li>cloud_essd_entry: ESSD Entry cloud disk.</li>
         * <li>elastic_ephemeral_disk_premium: Premium elastic ephemeral disk.</li>
         * <li>elastic_ephemeral_disk_standard: Standard elastic ephemeral disk.</li>
         * </ul>
         * <p>Default value: cloud_efficiency.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * <p>The mount point of the data cloud disk. If you do not specify this parameter, the system will allocate a mount point by default during the automatic creation of an ECS instance. The mount point starts from /dev/xvdb and ends at /dev/xvdz.</p>
         * 
         * <strong>example:</strong>
         * <p>/dev/xvdb</p>
         */
        public Builder device(String device) {
            this.device = device;
            return this;
        }

        /**
         * <p>The name of the data cloud disk. The name must be 2 to 128 characters in length and can contain letters and Chinese characters. It must start with a letter or a Chinese character and cannot start with http:// or https://. It can contain digits, colons (:), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>DataDiskName</p>
         */
        public Builder diskName(String diskName) {
            this.diskName = diskName;
            return this;
        }

        /**
         * <p>Specifies whether to encrypt the data cloud disk. Valid values:</p>
         * <ul>
         * <li>true: Encrypts the data cloud disk.</li>
         * <li>false: Does not encrypt the data cloud disk.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder encrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }

        /**
         * <p>The type of the file system to be mounted. This parameter takes effect only when auto_format is set to true. Valid values: ext4 and xfs.</p>
         * 
         * <strong>example:</strong>
         * <p>ext4</p>
         */
        public Builder fileSystem(String fileSystem) {
            this.fileSystem = fileSystem;
            return this;
        }

        /**
         * <p>The ID of the Key Management Service (KMS) key used to encrypt the data cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * <p>The mount path. It must be a valid file path.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/path1</p>
         */
        public Builder mountTarget(String mountTarget) {
            this.mountTarget = mountTarget;
            return this;
        }

        /**
         * <p>The performance level of the node data cloud disk. This parameter takes effect only for ESSDs, not standard SSDs. The performance level is related to the disk size. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSD cloud disks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        public Builder performanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }

        /**
         * <p>The provisioned read and write IOPS of the data cloud disk. Valid values: 0 to min{50,000, 1000 × Capacity - Baseline performance}.
         * Baseline performance = min{1,800 + 50 × Capacity, 50,000}.</p>
         * <p>This parameter is supported only when DiskCategory is set to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder provisionedIops(Long provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }

        /**
         * <p>The size of the data cloud disk. Unit: GiB.</p>
         * <p>Valid values: 40 to 32768.</p>
         * <p>Default value: 120.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        public Builder size(Long size) {
            this.size = size;
            return this;
        }

        /**
         * <p>The ID of the snapshot used to create the data cloud disk. If you specify this parameter, the DataDisks.Size parameter is ignored, and the actual size of the created disk is the same as the size of the specified snapshot. If the snapshot was created on or before July 15, 2013, the call is rejected and the InvalidSnapshot.TooOld error code is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>s-280s7****</p>
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
