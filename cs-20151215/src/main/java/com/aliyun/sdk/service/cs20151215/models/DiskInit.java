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
 * {@link DiskInit} extends {@link TeaModel}
 *
 * <p>DiskInit</p>
 */
public class DiskInit extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("disk_name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String diskName;

    @com.aliyun.core.annotation.NameInMap("local_disk")
    private Boolean localDisk;

    @com.aliyun.core.annotation.NameInMap("mkfs_type")
    private String mkfsType;

    @com.aliyun.core.annotation.NameInMap("mount_for_runtime")
    private Boolean mountForRuntime;

    @com.aliyun.core.annotation.NameInMap("mount_target")
    private String mountTarget;

    private DiskInit(Builder builder) {
        this.diskName = builder.diskName;
        this.localDisk = builder.localDisk;
        this.mkfsType = builder.mkfsType;
        this.mountForRuntime = builder.mountForRuntime;
        this.mountTarget = builder.mountTarget;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DiskInit create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return diskName
     */
    public String getDiskName() {
        return this.diskName;
    }

    /**
     * @return localDisk
     */
    public Boolean getLocalDisk() {
        return this.localDisk;
    }

    /**
     * @return mkfsType
     */
    public String getMkfsType() {
        return this.mkfsType;
    }

    /**
     * @return mountForRuntime
     */
    public Boolean getMountForRuntime() {
        return this.mountForRuntime;
    }

    /**
     * @return mountTarget
     */
    public String getMountTarget() {
        return this.mountTarget;
    }

    public static final class Builder {
        private String diskName; 
        private Boolean localDisk; 
        private String mkfsType; 
        private Boolean mountForRuntime; 
        private String mountTarget; 

        private Builder() {
        } 

        private Builder(DiskInit model) {
            this.diskName = model.diskName;
            this.localDisk = model.localDisk;
            this.mkfsType = model.mkfsType;
            this.mountForRuntime = model.mountForRuntime;
            this.mountTarget = model.mountTarget;
        } 

        /**
         * <p>The unique identifier for a disk in the node pool.</p>
         * <ul>
         * <li>When local_disk is set to false, the value must match one of the disk_name values in scaling_group.data_disks.</li>
         * <li>When local_disk is set to true, the value must be different from all disk_name values in scaling_group.data_disks.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>disk0</p>
         */
        public Builder diskName(String diskName) {
            this.diskName = diskName;
            return this;
        }

        /**
         * <p>Specifies whether this configuration applies to a local disk. When this parameter is set to true:</p>
         * <ul>
         * <li>If the disk cannot be matched by using the ECS DiskName and symbolic links, the local disk can be matched.</li>
         * <li>If the disk is detected as uninitialized during boot, it is reinitialized.</li>
         * <li>Both mount_target and mkfs_type must be set or left empty at the same time.</li>
         * <li>When used in combination with mount_for_runtime, if the local disk is reinitialized, the node must be removed from and then re-added to the node pool.</li>
         * </ul>
         */
        public Builder localDisk(Boolean localDisk) {
            this.localDisk = localDisk;
            return this;
        }

        /**
         * <p>The type of the file system for automatic formatting. An empty value indicates that the disk is not formatted.</p>
         * 
         * <strong>example:</strong>
         * <p>ext4</p>
         */
        public Builder mkfsType(String mkfsType) {
            this.mkfsType = mkfsType;
            return this;
        }

        /**
         * <p>Specifies whether container runtime data is stored on the disk.</p>
         */
        public Builder mountForRuntime(Boolean mountForRuntime) {
            this.mountForRuntime = mountForRuntime;
            return this;
        }

        /**
         * <p>The mount directory. An empty value indicates that the disk is not mounted.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/disk0</p>
         */
        public Builder mountTarget(String mountTarget) {
            this.mountTarget = mountTarget;
            return this;
        }

        public DiskInit build() {
            return new DiskInit(this);
        } 

    } 

}
