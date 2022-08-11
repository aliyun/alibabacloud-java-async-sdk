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
    @NameInMap("auto_snapshot_policy_id")
    private String autoSnapshotPolicyId;

    @NameInMap("category")
    private String category;

    @NameInMap("encrypted")
    private String encrypted;

    @NameInMap("performance_level")
    private String performanceLevel;

    @NameInMap("size")
    private Long size;

    private DataDisk(Builder builder) {
        this.autoSnapshotPolicyId = builder.autoSnapshotPolicyId;
        this.category = builder.category;
        this.encrypted = builder.encrypted;
        this.performanceLevel = builder.performanceLevel;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataDisk create() {
        return builder().build();
    }

    /**
     * @return autoSnapshotPolicyId
     */
    public String getAutoSnapshotPolicyId() {
        return this.autoSnapshotPolicyId;
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
     * @return performanceLevel
     */
    public String getPerformanceLevel() {
        return this.performanceLevel;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    public static final class Builder {
        private String autoSnapshotPolicyId; 
        private String category; 
        private String encrypted; 
        private String performanceLevel; 
        private Long size; 

        /**
         * 开启云盘备份时的自动备份策略。
         */
        public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }

        /**
         * 数据盘类型
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * 是否对数据盘加密。
         */
        public Builder encrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }

        /**
         * 数据盘磁盘性能，只针对ESSD磁盘生效
         */
        public Builder performanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }

        /**
         * 数据盘大小，取值范围：40～32767
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
