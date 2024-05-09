// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    @com.aliyun.core.annotation.NameInMap("format_disk")
    private Boolean formatDisk;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("keep_instance_name")
    private Boolean keepInstanceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nodepool_id")
    private String nodepoolId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("options")
    private String options;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("rds_instances")
    private java.util.List < String > rdsInstances;

    private DescribeClusterAttachScriptsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.arch = builder.arch;
        this.formatDisk = builder.formatDisk;
        this.keepInstanceName = builder.keepInstanceName;
        this.nodepoolId = builder.nodepoolId;
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
     * @return formatDisk
     */
    public Boolean getFormatDisk() {
        return this.formatDisk;
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
     * @return options
     */
    public String getOptions() {
        return this.options;
    }

    /**
     * @return rdsInstances
     */
    public java.util.List < String > getRdsInstances() {
        return this.rdsInstances;
    }

    public static final class Builder extends Request.Builder<DescribeClusterAttachScriptsRequest, Builder> {
        private String clusterId; 
        private String arch; 
        private Boolean formatDisk; 
        private Boolean keepInstanceName; 
        private String nodepoolId; 
        private String options; 
        private java.util.List < String > rdsInstances; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClusterAttachScriptsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.arch = request.arch;
            this.formatDisk = request.formatDisk;
            this.keepInstanceName = request.keepInstanceName;
            this.nodepoolId = request.nodepoolId;
            this.options = request.options;
            this.rdsInstances = request.rdsInstances;
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
         * The CPU architecture of the node. Valid values: `amd64`, `arm`, and `arm64`.
         * <p>
         * 
         * Default value: `amd64`.
         * 
         * >  This parameter is required if you want to add the existing node to a Container Service for Kubernetes (ACK) Edge cluster.
         */
        public Builder arch(String arch) {
            this.putBodyParameter("arch", arch);
            this.arch = arch;
            return this;
        }

        /**
         * Specifies whether to mount data disks to an existing instance when you add the instance to the cluster. You can add data disks to store container data and images. Valid values:
         * <p>
         * 
         * *   `true`: mounts data disks to the existing instance that you want to add. After a data disk is mounted, the original data on the disk is erased. Back up data before you mount a data disk.
         * *   `false`: does not mount data disks to the existing instance.
         * 
         * Default value: `false`.
         * 
         * How a data disk is mounted:
         * 
         * *   If the Elastic Compute Service (ECS) instances are already mounted with data disks and the file system of the last data disk is not initialized, the system automatically formats this data disk to ext4 and mounts it to /var/lib/docker and /var/lib/kubelet.
         * *   If no data disk is mounted to the ECS instance, the system does not purchase a new data disk.
         */
        public Builder formatDisk(Boolean formatDisk) {
            this.putBodyParameter("format_disk", formatDisk);
            this.formatDisk = formatDisk;
            return this;
        }

        /**
         * Specifies whether to retain the name of the existing instance when it is added to the cluster. If you do not retain the instance name, the instance is named in the `worker-k8s-for-cs-<clusterid>` format. Valid values:
         * <p>
         * 
         * *   `true`: retains the instance name.
         * *   `false`: does not retain the instance name.
         * 
         * Default value: `true`
         */
        public Builder keepInstanceName(Boolean keepInstanceName) {
            this.putBodyParameter("keep_instance_name", keepInstanceName);
            this.keepInstanceName = keepInstanceName;
            return this;
        }

        /**
         * The ID of the node pool to which you want to add an existing node. This parameter allows you to add an existing node to a specified node pool.
         * <p>
         * 
         * >  If you do not specify a node pool ID, the node is added to the default node pool.
         */
        public Builder nodepoolId(String nodepoolId) {
            this.putBodyParameter("nodepool_id", nodepoolId);
            this.nodepoolId = nodepoolId;
            return this;
        }

        /**
         * The node configurations for the existing instance that you want to add as a node.
         * <p>
         * 
         * >  This parameter is required if you want to add the existing node to an ACK Edge cluster.
         */
        public Builder options(String options) {
            this.putBodyParameter("options", options);
            this.options = options;
            return this;
        }

        /**
         * After you specify the list of RDS instances, the ECS instances in the cluster are automatically added to the whitelist of the RDS instances.
         */
        public Builder rdsInstances(java.util.List < String > rdsInstances) {
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
