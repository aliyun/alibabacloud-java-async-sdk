// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DataDisk} extends {@link TeaModel}
 *
 * <p>DataDisk</p>
 */
public class DataDisk extends TeaModel {
    @NameInMap("auto_format")
    private Boolean autoFormat;

    @NameInMap("auto_snapshot_policy_id")
    private String autoSnapshotPolicyId;

    @NameInMap("bursting_enabled")
    private Boolean burstingEnabled;

    @NameInMap("category")
    private String category;

    @NameInMap("encrypted")
    private String encrypted;

    @NameInMap("file_system")
    private String fileSystem;

    @NameInMap("mount_target")
    private String mountTarget;

    @NameInMap("performance_level")
    private String performanceLevel;

    @NameInMap("provisioned_iops")
    private Long provisionedIops;

    @NameInMap("size")
    private Long size;

    private DataDisk(Builder builder) {
        this.autoFormat = builder.autoFormat;
        this.autoSnapshotPolicyId = builder.autoSnapshotPolicyId;
        this.burstingEnabled = builder.burstingEnabled;
        this.category = builder.category;
        this.encrypted = builder.encrypted;
        this.fileSystem = builder.fileSystem;
        this.mountTarget = builder.mountTarget;
        this.performanceLevel = builder.performanceLevel;
        this.provisionedIops = builder.provisionedIops;
        this.size = builder.size;
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

    public static final class Builder {
        private Boolean autoFormat; 
        private String autoSnapshotPolicyId; 
        private Boolean burstingEnabled; 
        private String category; 
        private String encrypted; 
        private String fileSystem; 
        private String mountTarget; 
        private String performanceLevel; 
        private Long provisionedIops; 
        private Long size; 

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

        public DataDisk build() {
            return new DataDisk(this);
        } 

    } 

}
