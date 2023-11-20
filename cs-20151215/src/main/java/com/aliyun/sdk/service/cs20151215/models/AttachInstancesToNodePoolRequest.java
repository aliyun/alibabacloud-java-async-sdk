// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachInstancesToNodePoolRequest} extends {@link RequestModel}
 *
 * <p>AttachInstancesToNodePoolRequest</p>
 */
public class AttachInstancesToNodePoolRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Path
    @NameInMap("NodepoolId")
    @Validation(required = true)
    private String nodepoolId;

    @Body
    @NameInMap("format_disk")
    private Boolean formatDisk;

    @Body
    @NameInMap("instances")
    private java.util.List < String > instances;

    @Body
    @NameInMap("keep_instance_name")
    private Boolean keepInstanceName;

    @Body
    @NameInMap("password")
    private String password;

    private AttachInstancesToNodePoolRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.nodepoolId = builder.nodepoolId;
        this.formatDisk = builder.formatDisk;
        this.instances = builder.instances;
        this.keepInstanceName = builder.keepInstanceName;
        this.password = builder.password;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachInstancesToNodePoolRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return nodepoolId
     */
    public String getNodepoolId() {
        return this.nodepoolId;
    }

    /**
     * @return formatDisk
     */
    public Boolean getFormatDisk() {
        return this.formatDisk;
    }

    /**
     * @return instances
     */
    public java.util.List < String > getInstances() {
        return this.instances;
    }

    /**
     * @return keepInstanceName
     */
    public Boolean getKeepInstanceName() {
        return this.keepInstanceName;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    public static final class Builder extends Request.Builder<AttachInstancesToNodePoolRequest, Builder> {
        private String clusterId; 
        private String nodepoolId; 
        private Boolean formatDisk; 
        private java.util.List < String > instances; 
        private Boolean keepInstanceName; 
        private String password; 

        private Builder() {
            super();
        } 

        private Builder(AttachInstancesToNodePoolRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.nodepoolId = request.nodepoolId;
            this.formatDisk = request.formatDisk;
            this.instances = request.instances;
            this.keepInstanceName = request.keepInstanceName;
            this.password = request.password;
        } 

        /**
         * The cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The node pool ID.
         */
        public Builder nodepoolId(String nodepoolId) {
            this.putPathParameter("NodepoolId", nodepoolId);
            this.nodepoolId = nodepoolId;
            return this;
        }

        /**
         * Specifies whether to store container data and images on data disks. Valid values:
         * <p>
         * 
         * *   `true`: stores container data and images on data disks.
         * *   `false`: does not store container data or images on data disks.
         * 
         * Default value: `false`.
         * 
         * How to mount a data disk:
         * 
         * *   If the ECS instances are already mounted with data disks and the file system of the last data disk is not initialized, the system automatically formats this data disk to ext4 and mounts it to /var/lib/docker and /var/lib/kubelet.
         * *   If no data disk is attached to the ECS instances, the system does not purchase a new data disk.
         * 
         * > If you choose to store container data and images on a data disk and the data disk is already mounted to the ECS instance, the existing data on the data disk will be cleared. You can back up the disk to avoid data loss.
         */
        public Builder formatDisk(Boolean formatDisk) {
            this.putBodyParameter("format_disk", formatDisk);
            this.formatDisk = formatDisk;
            return this;
        }

        /**
         * The IDs of the instances to be added.
         */
        public Builder instances(java.util.List < String > instances) {
            this.putBodyParameter("instances", instances);
            this.instances = instances;
            return this;
        }

        /**
         * Specifies whether to retain the instance name. Valid values:
         * <p>
         * 
         * *   `true`: retains the instance name.
         * *   `false`: does not retain the instance name.
         * 
         * Default value: `true`.
         */
        public Builder keepInstanceName(Boolean keepInstanceName) {
            this.putBodyParameter("keep_instance_name", keepInstanceName);
            this.keepInstanceName = keepInstanceName;
            return this;
        }

        /**
         * The SSH password that is used to log on to the instance.
         */
        public Builder password(String password) {
            this.putBodyParameter("password", password);
            this.password = password;
            return this;
        }

        @Override
        public AttachInstancesToNodePoolRequest build() {
            return new AttachInstancesToNodePoolRequest(this);
        } 

    } 

}
