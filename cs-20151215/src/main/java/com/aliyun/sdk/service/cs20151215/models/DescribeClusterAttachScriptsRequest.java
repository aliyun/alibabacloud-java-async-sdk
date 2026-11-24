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
 * {@link DescribeClusterAttachScriptsRequest} extends {@link RequestModel}
 *
 * <p>DescribeClusterAttachScriptsRequest</p>
 */
public class DescribeClusterAttachScriptsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("arch")
    private String arch;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("expired")
    private Long expired;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("format_disk")
    @Deprecated
    private Boolean formatDisk;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("format_disk_option")
    private String formatDiskOption;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("keep_instance_name")
    private Boolean keepInstanceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nodepool_id")
    private String nodepoolId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("one_time_token")
    private Boolean oneTimeToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("options")
    private String options;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("rds_instances")
    private java.util.List<String> rdsInstances;

    private DescribeClusterAttachScriptsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.arch = builder.arch;
        this.expired = builder.expired;
        this.formatDisk = builder.formatDisk;
        this.formatDiskOption = builder.formatDiskOption;
        this.keepInstanceName = builder.keepInstanceName;
        this.nodepoolId = builder.nodepoolId;
        this.oneTimeToken = builder.oneTimeToken;
        this.options = builder.options;
        this.rdsInstances = builder.rdsInstances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterAttachScriptsRequest create() {
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
     * @return arch
     */
    public String getArch() {
        return this.arch;
    }

    /**
     * @return expired
     */
    public Long getExpired() {
        return this.expired;
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
     * @return keepInstanceName
     */
    public Boolean getKeepInstanceName() {
        return this.keepInstanceName;
    }

    /**
     * @return nodepoolId
     */
    public String getNodepoolId() {
        return this.nodepoolId;
    }

    /**
     * @return oneTimeToken
     */
    public Boolean getOneTimeToken() {
        return this.oneTimeToken;
    }

    /**
     * @return options
     */
    public String getOptions() {
        return this.options;
    }

    /**
     * @return rdsInstances
     */
    public java.util.List<String> getRdsInstances() {
        return this.rdsInstances;
    }

    public static final class Builder extends Request.Builder<DescribeClusterAttachScriptsRequest, Builder> {
        private String clusterId; 
        private String arch; 
        private Long expired; 
        private Boolean formatDisk; 
        private String formatDiskOption; 
        private Boolean keepInstanceName; 
        private String nodepoolId; 
        private Boolean oneTimeToken; 
        private String options; 
        private java.util.List<String> rdsInstances; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClusterAttachScriptsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.arch = request.arch;
            this.expired = request.expired;
            this.formatDisk = request.formatDisk;
            this.formatDiskOption = request.formatDiskOption;
            this.keepInstanceName = request.keepInstanceName;
            this.nodepoolId = request.nodepoolId;
            this.oneTimeToken = request.oneTimeToken;
            this.options = request.options;
            this.rdsInstances = request.rdsInstances;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ca375a93a30474552ad2a0ebe183e****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The CPU architecture of the node. Valid values: <code>amd64</code>, <code>arm</code>, and <code>arm64</code>.</p>
         * <p>Default value: <code>amd64</code>.</p>
         * <blockquote>
         * <p>Required when the cluster type is ACK Edge.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>amd64</p>
         */
        public Builder arch(String arch) {
            this.putBodyParameter("arch", arch);
            this.arch = arch;
            return this;
        }

        /**
         * <p>The expiration time of the generated token. The time is in the UNIX timestamp format. For example, 1739980800 indicates 2025-02-20 00:00:00.</p>
         * 
         * <strong>example:</strong>
         * <p>1740037333</p>
         */
        public Builder expired(Long expired) {
            this.putBodyParameter("expired", expired);
            this.expired = expired;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> Use <code>format_disk_option</code> instead.</p>
         * <ul>
         * <li><code>true</code>: Equivalent to setting <code>format_disk_option</code> to <code>DataDisk</code>.</li>
         * <li><code>false</code>: Equivalent to setting <code>format_disk_option</code> to <code>SystemDisk</code>.</li>
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
         * <p>The disk formatting method. This parameter is mutually exclusive with <code>format_disk</code> when <code>format_disk</code> is set to <code>true</code>. Valid values:</p>
         * <ul>
         * <li><code>SystemDisk</code>: No additional initialization is performed. Container runtime data is stored on the system cloud disk or any disk that is already mounted to the relevant directory during import.</li>
         * <li><code>DataDisk</code>: If a data cloud disk or local disk is mounted, the last disk is formatted and mounted to store container runtime data.</li>
         * <li><code>NodePoolDiskConfig</code>: Initializes data cloud disks based on the configurations of the imported node pool. Cloud disks and elastic ephemeral disks are matched based on the <code>disk_name</code> field of the node pool and the <code>DiskName</code> field of the block storage. Local disks are matched sequentially based on the PCI address order. Node pool configurations that do not match any disk are ignored.</li>
         * </ul>
         * <blockquote>
         * <p>Warning: The <code>DataDisk</code> option is retained only for historical compatibility and is strongly discouraged.
         * This option uses the last disk in lexicographical order of device names under <code>/dev</code> (NVMe is preferred). Note that nvme9 takes precedence over nvme10. Operating systems with newer kernels such as Alinux 4 cannot guarantee a stable device order.</p>
         * </blockquote>
         * <p>Disks with a recognizable file system during import skip the formatting step and are directly mounted.</p>
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
         * <p>Specifies whether to retain the instance name when adding an existing instance to the cluster. If you do not retain the instance name, the instance name format is <code>worker-k8s-for-cs-&lt;clusterid&gt;</code>. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Retains the instance name.</li>
         * <li><code>false</code>: Does not retain the instance name. The instance name is replaced based on system rules.</li>
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
         * <p>The ID of the node pool. Specifies the node pool to which the node is added.</p>
         * <blockquote>
         * <p>If you do not specify a node pool ID, the node is added to the default node pool by default.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>np1c9229d9be2d432c93f77a88fca0****</p>
         */
        public Builder nodepoolId(String nodepoolId) {
            this.putBodyParameter("nodepool_id", nodepoolId);
            this.nodepoolId = nodepoolId;
            return this;
        }

        /**
         * one_time_token.
         */
        public Builder oneTimeToken(Boolean oneTimeToken) {
            this.putBodyParameter("one_time_token", oneTimeToken);
            this.oneTimeToken = oneTimeToken;
            return this;
        }

        /**
         * <p>The access configuration parameters for the node.</p>
         * <blockquote>
         * <p>Required when the cluster type is ACK Edge.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;enableIptables&quot;: true,&quot;manageRuntime&quot;: true,&quot;quiet&quot;: true,&quot;allowedClusterAddons&quot;: [&quot;kube-proxy&quot;,&quot;flannel&quot;,&quot;coredns&quot;]}</p>
         */
        public Builder options(String options) {
            this.putBodyParameter("options", options);
            this.options = options;
            return this;
        }

        /**
         * <p>If an ApsaraDB RDS instance list is specified, the ECS instances of the cluster nodes are automatically added to the RDS access whitelist.</p>
         */
        public Builder rdsInstances(java.util.List<String> rdsInstances) {
            this.putBodyParameter("rds_instances", rdsInstances);
            this.rdsInstances = rdsInstances;
            return this;
        }

        @Override
        public DescribeClusterAttachScriptsRequest build() {
            return new DescribeClusterAttachScriptsRequest(this);
        } 

    } 

}
