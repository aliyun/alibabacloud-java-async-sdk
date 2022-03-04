// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterAttachScriptsRequest} extends {@link RequestModel}
 *
 * <p>DescribeClusterAttachScriptsRequest</p>
 */
public class DescribeClusterAttachScriptsRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Body
    @NameInMap("nodepool_id")
    private String nodepoolId;

    @Body
    @NameInMap("format_disk")
    private Boolean formatDisk;

    @Body
    @NameInMap("keep_instance_name")
    private Boolean keepInstanceName;

    @Body
    @NameInMap("rds_instances")
    private java.util.List < String > rdsInstances;

    @Body
    @NameInMap("arch")
    private String arch;

    @Body
    @NameInMap("options")
    private String options;

    private DescribeClusterAttachScriptsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.nodepoolId = builder.nodepoolId;
        this.formatDisk = builder.formatDisk;
        this.keepInstanceName = builder.keepInstanceName;
        this.rdsInstances = builder.rdsInstances;
        this.arch = builder.arch;
        this.options = builder.options;
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
     * @return keepInstanceName
     */
    public Boolean getKeepInstanceName() {
        return this.keepInstanceName;
    }

    /**
     * @return rdsInstances
     */
    public java.util.List < String > getRdsInstances() {
        return this.rdsInstances;
    }

    /**
     * @return arch
     */
    public String getArch() {
        return this.arch;
    }

    /**
     * @return options
     */
    public String getOptions() {
        return this.options;
    }

    public static final class Builder extends Request.Builder<DescribeClusterAttachScriptsRequest, Builder> {
        private String clusterId; 
        private String nodepoolId; 
        private Boolean formatDisk; 
        private Boolean keepInstanceName; 
        private java.util.List < String > rdsInstances; 
        private String arch; 
        private String options; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClusterAttachScriptsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.nodepoolId = request.nodepoolId;
            this.formatDisk = request.formatDisk;
            this.keepInstanceName = request.keepInstanceName;
            this.rdsInstances = request.rdsInstances;
            this.arch = request.arch;
            this.options = request.options;
        } 

        /**
         * The ID of the cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The ID of the node pool. When you add a node, you can add the node to the specified node pool.
         * <p>
         * 
         * > If you do not specify the node pool ID, the node is added to the default node pool by default.
         */
        public Builder nodepoolId(String nodepoolId) {
            this.putBodyParameter("nodepool_id", nodepoolId);
            this.nodepoolId = nodepoolId;
            return this;
        }

        /**
         * Specifies whether to attach a data disk to an existing instance and store containers and images on the data disk when you manually add the instance to the cluster. Valid values:
         * <p>
         * 
         * -"true": if you mount a data disk to an instance, the original data in the data disk will be lost. Note that you must back up the data.
         * -"false": no data disk is attached to the instance.
         * 
         * Default value: "false ".
         * 
         * Data mount rules:
         * 
         * -If a data disk is attached to an ECS instance and the file system of the last data disk is not initialized, the system automatically formats the data disk as ext4 to store/var/lib/docker,/var/lib/kubelet.
         * -If no data disk is attached to the ECS instance, no new data disk is attached.
         * 
         * 
         */
        public Builder formatDisk(Boolean formatDisk) {
            this.putBodyParameter("format_disk", formatDisk);
            this.formatDisk = formatDisk;
            return this;
        }

        /**
         * Specifies whether to retain the instance name when adding an existing cluster. If this parameter is not reserved, the instance name is in the format of "worker-k8s-for-cs-<clusterid>". Valid values:
         * <p>
         * 
         * -"true": retain the instance name.
         * -"false": the instance name is not retained and will be replaced by system rules.
         * 
         * Default value: "true ".
         */
        public Builder keepInstanceName(Boolean keepInstanceName) {
            this.putBodyParameter("keep_instance_name", keepInstanceName);
            this.keepInstanceName = keepInstanceName;
            return this;
        }

        /**
         * If the RDS instance list is specified, the cluster node ECS is automatically added to the RDS whitelist.
         */
        public Builder rdsInstances(java.util.List < String > rdsInstances) {
            this.putBodyParameter("rds_instances", rdsInstances);
            this.rdsInstances = rdsInstances;
            return this;
        }

        /**
         * The CPU architecture of the node. Supported CPU architectures include amd64", "arm", and "arm64 ".
         * <p>
         * 
         * Default value: "amd64 ".
         * 
         * > This parameter is required when the cluster type is Edge managed.
         */
        public Builder arch(String arch) {
            this.putBodyParameter("arch", arch);
            this.arch = arch;
            return this;
        }

        /**
         * The access configuration parameters of the node.
         * <p>
         * 
         * > This parameter is required when the cluster type is Edge managed.
         */
        public Builder options(String options) {
            this.putBodyParameter("options", options);
            this.options = options;
            return this;
        }

        @Override
        public DescribeClusterAttachScriptsRequest build() {
            return new DescribeClusterAttachScriptsRequest(this);
        } 

    } 

}
