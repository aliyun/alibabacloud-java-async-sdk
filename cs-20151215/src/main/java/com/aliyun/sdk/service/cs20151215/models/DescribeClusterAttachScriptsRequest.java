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
    private java.util.List<String> rdsInstances;

    private DescribeClusterAttachScriptsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.arch = builder.arch;
        this.expired = builder.expired;
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
    public java.util.List<String> getRdsInstances() {
        return this.rdsInstances;
    }

    public static final class Builder extends Request.Builder<DescribeClusterAttachScriptsRequest, Builder> {
        private String clusterId; 
        private String arch; 
        private Long expired; 
        private Boolean formatDisk; 
        private Boolean keepInstanceName; 
        private String nodepoolId; 
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
            this.keepInstanceName = request.keepInstanceName;
            this.nodepoolId = request.nodepoolId;
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
         * <p> This parameter is required if you want to add the existing node to a Container Service for Kubernetes (ACK) Edge cluster.</p>
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
         * expired.
         */
        public Builder expired(Long expired) {
            this.putBodyParameter("expired", expired);
            this.expired = expired;
            return this;
        }

        /**
         * <p>Specifies whether to mount data disks to an existing instance when you add the instance to the cluster. You can add data disks to store container data and images. Valid values:</p>
         * <ul>
         * <li><code>true</code>: mounts data disks to the existing instance that you want to add. After a data disk is mounted, the original data on the disk is erased. Back up data before you mount a data disk.</li>
         * <li><code>false</code>: does not mount data disks to the existing instance.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * <p>How a data disk is mounted:</p>
         * <ul>
         * <li>If the Elastic Compute Service (ECS) instances are already mounted with data disks and the file system of the last data disk is not initialized, the system automatically formats this data disk to ext4 and mounts it to /var/lib/docker and /var/lib/kubelet.</li>
         * <li>If no data disk is mounted to the ECS instance, the system does not purchase a new data disk.</li>
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
         * <p>Specifies whether to retain the name of the existing instance when it is added to the cluster. If you do not retain the instance name, the instance is named in the <code>worker-k8s-for-cs-&lt;clusterid&gt;</code> format. Valid values:</p>
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
         * <p>The ID of the node pool to which you want to add an existing node.</p>
         * <blockquote>
         * <p> If you do not specify a node pool ID, the node is added to a default node pool.</p>
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
         * <p>The node configurations for the existing instance that you want to add as a node.</p>
         * <blockquote>
         * <p> This parameter is required if you want to add the existing node to an ACK Edge cluster.</p>
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
         * <p>The ApsaraDB RDS instances. If you specify a list of ApsaraDB RDS instances, ECS instances in the cluster are automatically added to the whitelist of the ApsaraDB RDS instances.</p>
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
