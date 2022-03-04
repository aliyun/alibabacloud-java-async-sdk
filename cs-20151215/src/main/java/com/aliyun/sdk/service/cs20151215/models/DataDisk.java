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
    @NameInMap("category")
    private String category;

    @NameInMap("size")
    private Long size;

    @NameInMap("encrypted")
    private String encrypted;

    @NameInMap("auto_snapshot_policy_id")
    private String autoSnapshotPolicyId;

    @NameInMap("performance_level")
    private String performanceLevel;

    private DataDisk(Builder builder) {
        this.category = builder.category;
        this.size = builder.size;
        this.encrypted = builder.encrypted;
        this.autoSnapshotPolicyId = builder.autoSnapshotPolicyId;
        this.performanceLevel = builder.performanceLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataDisk create() {
        return builder().build();
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    /**
     * @return encrypted
     */
    public String getEncrypted() {
        return this.encrypted;
    }

    /**
     * @return autoSnapshotPolicyId
     */
    public String getAutoSnapshotPolicyId() {
        return this.autoSnapshotPolicyId;
    }

    /**
     * @return performanceLevel
     */
    public String getPerformanceLevel() {
        return this.performanceLevel;
    }

    public static final class Builder {
        private String category; 
        private Long size; 
        private String encrypted; 
        private String autoSnapshotPolicyId; 
        private String performanceLevel; 

        /**
         * Data disk type
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * The size of the data disk. Valid values: 40 to 32767.
         */
        public Builder size(Long size) {
            this.size = size;
            return this;
        }

        /**
         * Specifies whether to encrypt data disks.
         */
        public Builder encrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }

        /**
         * Enable the automatic backup policy for cloud disk backup.
         */
        public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }

        /**
         * The disk performance of the data disk. This parameter takes effect only for ESSD disks.
         */
        public Builder performanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }

        public DataDisk build() {
            return new DataDisk(this);
        } 

    } 

}
