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
 * {@link AttachInstancesToNodePoolRequest} extends {@link RequestModel}
 *
 * <p>AttachInstancesToNodePoolRequest</p>
 */
public class AttachInstancesToNodePoolRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("NodepoolId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodepoolId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("format_disk")
    private Boolean formatDisk;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instances")
    private java.util.List<String> instances;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("keep_instance_name")
    private Boolean keepInstanceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("password")
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
    public java.util.List<String> getInstances() {
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
        private java.util.List<String> instances; 
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
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c82e6987e2961451182edacd74faf****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The node pool ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>np31da1b38983f4511b490fc62108a****</p>
         */
        public Builder nodepoolId(String nodepoolId) {
            this.putPathParameter("NodepoolId", nodepoolId);
            this.nodepoolId = nodepoolId;
            return this;
        }

        /**
         * <p>Specifies whether to store container data and images on data disks. Valid values:</p>
         * <ul>
         * <li><code>true</code>: stores container data and images on data disks.</li>
         * <li><code>false</code>: does not store container data or images on data disks.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * <p>How to mount a data disk:</p>
         * <ul>
         * <li>If the ECS instances are already mounted with data disks and the file system of the last data disk is not initialized, the system automatically formats this data disk to ext4 and mounts it to /var/lib/docker and /var/lib/kubelet.</li>
         * <li>If no data disk is attached to the ECS instances, the system does not purchase a new data disk.</li>
         * </ul>
         * <blockquote>
         * <p>If you choose to store container data and images on a data disk and the data disk is already mounted to the ECS instance, the existing data on the data disk will be cleared. You can back up the disk to avoid data loss.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder formatDisk(Boolean formatDisk) {
            this.putBodyParameter("format_disk", formatDisk);
            this.formatDisk = formatDisk;
            return this;
        }

        /**
         * <p>The IDs of the instances to be added.</p>
         */
        public Builder instances(java.util.List<String> instances) {
            this.putBodyParameter("instances", instances);
            this.instances = instances;
            return this;
        }

        /**
         * <p>Specifies whether to retain the instance name. Valid values:</p>
         * <ul>
         * <li><code>true</code>: retains the instance name.</li>
         * <li><code>false</code>: does not retain the instance name.</li>
         * </ul>
         * <p>Default value: <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder keepInstanceName(Boolean keepInstanceName) {
            this.putBodyParameter("keep_instance_name", keepInstanceName);
            this.keepInstanceName = keepInstanceName;
            return this;
        }

        /**
         * <p>The SSH password that is used to log on to the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello1234</p>
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
