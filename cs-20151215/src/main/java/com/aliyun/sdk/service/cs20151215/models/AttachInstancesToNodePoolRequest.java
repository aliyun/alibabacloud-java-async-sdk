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
    @Deprecated
    private Boolean formatDisk;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("format_disk_option")
    private String formatDiskOption;

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
        this.formatDiskOption = builder.formatDiskOption;
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
     * @return formatDiskOption
     */
    public String getFormatDiskOption() {
        return this.formatDiskOption;
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
        private String formatDiskOption; 
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
            this.formatDiskOption = request.formatDiskOption;
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
         * <p><strong>[Deprecated]</strong> Use <code>format_disk_option</code> instead. Valid values:</p>
         * <ul>
         * <li><code>true</code>: equivalent to setting <code>format_disk_option</code> to <code>DataDisk</code>.</li>
         * <li><code>false</code>: equivalent to setting <code>format_disk_option</code> to <code>SystemDisk</code>.</li>
         * </ul>
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
         * <p>The disk formatting method. This parameter is mutually exclusive with <code>format_disk</code> set to <code>true</code>. Valid values:</p>
         * <ul>
         * <li><code>SystemDisk</code>: No additional initialization is performed. Container runtime data is stored on the system cloud disk or any disk that is already mounted to the relevant directory during import.</li>
         * <li><code>DataDisk</code>: If a data cloud disk or local disk is mounted, the last disk is formatted and mounted to store container runtime data.</li>
         * <li><code>NodePoolDiskConfig</code>: Initializes data cloud disks based on the configuration of the imported node pool. Cloud disks and elastic ephemeral disks are matched based on the <code>disk_name</code> field of the node pool and the <code>DiskName</code> field of the block storage. Local disks are matched sequentially based on the PCI address order. Node pool configurations that do not match any disk are ignored.</li>
         * </ul>
         * <blockquote>
         * <p>Warning: The <code>DataDisk</code> option is retained only for historical compatibility and is strongly discouraged.
         * This option uses the last disk in lexicographical order of device names under <code>/dev</code> (NVMe is preferred). Note that nvme9 takes precedence over nvme10. Operating systems with newer kernels such as Alinux 4 cannot guarantee a stable device order.</p>
         * </blockquote>
         * <p>Disks with recognizable file systems during import skip the formatting step and are mounted directly.</p>
         * 
         * <strong>example:</strong>
         * <p>NodePoolDiskConfig</p>
         */
        public Builder formatDiskOption(String formatDiskOption) {
            this.putBodyParameter("format_disk_option", formatDiskOption);
            this.formatDiskOption = formatDiskOption;
            return this;
        }

        /**
         * <p>The list of ECS instances to be added.</p>
         */
        public Builder instances(java.util.List<String> instances) {
            this.putBodyParameter("instances", instances);
            this.instances = instances;
            return this;
        }

        /**
         * <p>Specifies whether to retain the original instance name. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Retains the instance name.</p>
         * </li>
         * <li><p><code>false</code>: Does not retain the instance name.</p>
         * </li>
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
         * <p>The SSH logon password for the instances to be added.</p>
         * 
         * <strong>example:</strong>
         * <hr>
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
