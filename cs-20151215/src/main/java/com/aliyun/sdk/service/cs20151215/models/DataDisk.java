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
         * <p>Specifies whether to automatically mount the data disk.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoFormat(Boolean autoFormat) {
            this.autoFormat = autoFormat;
            return this;
        }

        /**
         * <p>The ID of the automatic snapshot policy. The system performs automatic backup for a cloud disk based on the specified automatic snapshot policy.</p>
         * <p>By default, this parameter is empty, which indicates that automatic backup is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-2zej1nogjvovnz4z****</p>
         */
        public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }

        /**
         * <p>Specifies whether to enable the burst feature for the data disk. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables the burst feature.</li>
         * <li><code>false</code>: disables the burst feature for the data disk.</li>
         * </ul>
         * <p>This parameter is available only if <code>DiskCategory</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder burstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }

        /**
         * <p>The category of data disk. Valid values:</p>
         * <ul>
         * <li><code>cloud</code>: basic disk.</li>
         * <li><code>cloud_efficiency</code>: ultra disk</li>
         * <li><code>cloud_ssd</code>: standard SSD.</li>
         * <li><code>cloud_essd</code>: Enterprise ESSD (ESSD).</li>
         * <li><code>cloud_auto</code>: ESSD AutoPL disk.</li>
         * <li><code>cloud_essd_entry</code>: ESSD Entry disk.</li>
         * <li><code>elastic_ephemeral_disk_premium</code>: premium elastic ephemeral disk.</li>
         * <li><code>elastic_ephemeral_disk_standard</code>: standard elastic ephemeral disk.</li>
         * </ul>
         * <p>Default value: <code>cloud_efficiency</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * <p>The mount target of the data disk. If you do not specify this parameter, the system automatically assigns a mount target when you create an Elastic Compute Service (ECS) instance. Valid values: /dev/xvdb to /dev/xvdz.</p>
         * 
         * <strong>example:</strong>
         * <p>/dev/xvdb</p>
         */
        public Builder device(String device) {
            this.device = device;
            return this;
        }

        /**
         * <p>The data disk name. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with http:// or https://. The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>DataDiskName</p>
         */
        public Builder diskName(String diskName) {
            this.diskName = diskName;
            return this;
        }

        /**
         * <p>Specifies whether to encrypt the data disk. Valid values:</p>
         * <ul>
         * <li><code>true</code>: encrypts the data disk.</li>
         * <li><code>false</code>: does not encrypt the data disk.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder encrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }

        /**
         * <p>The file system that is mounted. This parameter takes effect only if auto_format is set to true. Valid values: ext4 and xfs.</p>
         * 
         * <strong>example:</strong>
         * <p>ext4</p>
         */
        public Builder fileSystem(String fileSystem) {
            this.fileSystem = fileSystem;
            return this;
        }

        /**
         * <p>The ID of the Key Management Service (KMS) key that is used to encrypt the data disk.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * <p>The path to which the data disk is mounted. You must specify a valid path.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/path1</p>
         */
        public Builder mountTarget(String mountTarget) {
            this.mountTarget = mountTarget;
            return this;
        }

        /**
         * <p>The performance level (PL) of the data disk. This parameter takes effect only for an ESSD. This parameter is related to the disk size. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        public Builder performanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }

        /**
         * <p>The preset IOPS of the data disk. Valid values: 0 to min{50,000, 1,000 × Capacity - Baseline IOPS}. Baseline IOPS = min{1,800 + 50 × Capacity, 50,000}.</p>
         * <p>This parameter is available only if <code>DiskCategory</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder provisionedIops(Long provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }

        /**
         * <p>The size of the data disk. Unit: GiB.</p>
         * <p>Valid values: 40 to 32768.</p>
         * <p>Default value: <code>120</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        public Builder size(Long size) {
            this.size = size;
            return this;
        }

        /**
         * <p>The ID of the snapshot that you want to use to create the data disk. If this parameter is specified, the specified size of the data disk is ignored. The size of the disk equals the size of the specified snapshot. If the snapshot was created on or before July 15, 2013, the API request is rejected and the InvalidSnapshot.TooOld message is returned.</p>
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
