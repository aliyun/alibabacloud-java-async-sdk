// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AttachInstancesRequest} extends {@link RequestModel}
 *
 * <p>AttachInstancesRequest</p>
 */
public class AttachInstancesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cpu_policy")
    private String cpuPolicy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("format_disk")
    private Boolean formatDisk;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("image_id")
    private String imageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instances")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > instances;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("is_edge_worker")
    private Boolean isEdgeWorker;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("keep_instance_name")
    private Boolean keepInstanceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("key_pair")
    private String keyPair;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nodepool_id")
    private String nodepoolId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("password")
    private String password;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("rds_instances")
    private java.util.List < String > rdsInstances;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("runtime")
    private Runtime runtime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List < Tag > tags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("user_data")
    private String userData;

    private AttachInstancesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.cpuPolicy = builder.cpuPolicy;
        this.formatDisk = builder.formatDisk;
        this.imageId = builder.imageId;
        this.instances = builder.instances;
        this.isEdgeWorker = builder.isEdgeWorker;
        this.keepInstanceName = builder.keepInstanceName;
        this.keyPair = builder.keyPair;
        this.nodepoolId = builder.nodepoolId;
        this.password = builder.password;
        this.rdsInstances = builder.rdsInstances;
        this.runtime = builder.runtime;
        this.tags = builder.tags;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachInstancesRequest create() {
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
     * @return cpuPolicy
     */
    public String getCpuPolicy() {
        return this.cpuPolicy;
    }

    /**
     * @return formatDisk
     */
    public Boolean getFormatDisk() {
        return this.formatDisk;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return instances
     */
    public java.util.List < String > getInstances() {
        return this.instances;
    }

    /**
     * @return isEdgeWorker
     */
    public Boolean getIsEdgeWorker() {
        return this.isEdgeWorker;
    }

    /**
     * @return keepInstanceName
     */
    public Boolean getKeepInstanceName() {
        return this.keepInstanceName;
    }

    /**
     * @return keyPair
     */
    public String getKeyPair() {
        return this.keyPair;
    }

    /**
     * @return nodepoolId
     */
    public String getNodepoolId() {
        return this.nodepoolId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return rdsInstances
     */
    public java.util.List < String > getRdsInstances() {
        return this.rdsInstances;
    }

    /**
     * @return runtime
     */
    public Runtime getRuntime() {
        return this.runtime;
    }

    /**
     * @return tags
     */
    public java.util.List < Tag > getTags() {
        return this.tags;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<AttachInstancesRequest, Builder> {
        private String clusterId; 
        private String cpuPolicy; 
        private Boolean formatDisk; 
        private String imageId; 
        private java.util.List < String > instances; 
        private Boolean isEdgeWorker; 
        private Boolean keepInstanceName; 
        private String keyPair; 
        private String nodepoolId; 
        private String password; 
        private java.util.List < String > rdsInstances; 
        private Runtime runtime; 
        private java.util.List < Tag > tags; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(AttachInstancesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.cpuPolicy = request.cpuPolicy;
            this.formatDisk = request.formatDisk;
            this.imageId = request.imageId;
            this.instances = request.instances;
            this.isEdgeWorker = request.isEdgeWorker;
            this.keepInstanceName = request.keepInstanceName;
            this.keyPair = request.keyPair;
            this.nodepoolId = request.nodepoolId;
            this.password = request.password;
            this.rdsInstances = request.rdsInstances;
            this.runtime = request.runtime;
            this.tags = request.tags;
            this.userData = request.userData;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c106f377e16f34eb1808d6b9362c9****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The CPU management policy. The following policies are supported if the Kubernetes version of the cluster is 1.12.6 or later.</p>
         * <ul>
         * <li><code>static</code>: This policy allows pods with specific resource characteristics on the node to be configured with enhanced CPU affinity and exclusivity.</li>
         * <li><code>none</code>: The default CPU affinity is used.</li>
         * </ul>
         * <p>Default value: <code>none</code>.</p>
         * <blockquote>
         * <p> This parameter is not supported if you specify the <code>nodepool_id</code> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        public Builder cpuPolicy(String cpuPolicy) {
            this.putBodyParameter("cpu_policy", cpuPolicy);
            this.cpuPolicy = cpuPolicy;
            return this;
        }

        /**
         * <p>Specifies whether to store container data and images on data disks. Valid values:</p>
         * <ul>
         * <li><code>true</code>: stores container data and images on data disks.</li>
         * <li><code>false</code>: does not store container data or images on data disks.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * <p>How a data disk is mounted:</p>
         * <ul>
         * <li>If the ECS instances are already mounted with data disks and the file system of the last data disk is not initialized, the system automatically formats this data disk to ext4 and mounts it to /var/lib/docker and /var/lib/kubelet.</li>
         * <li>If no data disk is attached to the ECS instances, the system does not purchase a new data disk.</li>
         * </ul>
         * <blockquote>
         * <p> If you choose to store container data and images on data disks and a data disk is already mounted to the ECS instance, the original data on this data disk will be cleared. You can back up the disk to avoid data loss.</p>
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
         * <p>The ID of the custom image. If you do not set this parameter, the default system image is used.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If you specify a custom image, the custom image is used to deploy the operating systems on the system disks of the nodes.</p>
         * </li>
         * <li><p>This parameter is not supported after you specify <code>nodepool_id</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>aliyun_2_1903_x64_20G_alibase_20200529.vhd</p>
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("image_id", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The ECS instances to be added.</p>
         * <p>This parameter is required.</p>
         */
        public Builder instances(java.util.List < String > instances) {
            this.putBodyParameter("instances", instances);
            this.instances = instances;
            return this;
        }

        /**
         * <p>Specifies whether the nodes that you want to add are Edge Node Service (ENS) nodes. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The nodes that you want to add are ENS nodes.</li>
         * <li><code>false</code>: The nodes that you want to add are not ENS nodes.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * <blockquote>
         * <p> If the nodes that you want to add are ENS nodes, you must set this parameter to <code>true</code>. This allows you to identify these nodes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isEdgeWorker(Boolean isEdgeWorker) {
            this.putBodyParameter("is_edge_worker", isEdgeWorker);
            this.isEdgeWorker = isEdgeWorker;
            return this;
        }

        /**
         * <p>Specifies whether to retain the instance name. Valid values:</p>
         * <ul>
         * <li><code>true</code>: retains the instance name.</li>
         * <li><code>false</code>: does not retain the instance name.</li>
         * </ul>
         * <p>Default value: <code>true</code></p>
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
         * <p>The name of the key pair that is used to log on to the ECS instances. You must set key_pair or <code>login_password</code>.</p>
         * <blockquote>
         * <p> This parameter is not supported if you specify the <code>nodepool_id</code> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>secrity-key</p>
         */
        public Builder keyPair(String keyPair) {
            this.putBodyParameter("key_pair", keyPair);
            this.keyPair = keyPair;
            return this;
        }

        /**
         * <p>The node pool ID. If you do not set this parameter, the nodes are added to the default node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>np615c0e0966124216a0412e10afe0****</p>
         */
        public Builder nodepoolId(String nodepoolId) {
            this.putBodyParameter("nodepool_id", nodepoolId);
            this.nodepoolId = nodepoolId;
            return this;
        }

        /**
         * <p>The SSH logon password that is used to log on to the ECS instances. You must set login_password or <code>key_pair</code>. The password must be 8 to 30 characters in length, and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. It cannot contain backslashes (\) or double quotation marks (&quot;).</p>
         * <p>For security considerations, the password is encrypted during data transfer.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello1234</p>
         */
        public Builder password(String password) {
            this.putBodyParameter("password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>A list of ApsaraDB RDS instances.</p>
         */
        public Builder rdsInstances(java.util.List < String > rdsInstances) {
            this.putBodyParameter("rds_instances", rdsInstances);
            this.rdsInstances = rdsInstances;
            return this;
        }

        /**
         * <p>The container runtime.</p>
         * <blockquote>
         * <p> This parameter is not supported if you specify the <code>nodepool_id</code> parameter.</p>
         * </blockquote>
         */
        public Builder runtime(Runtime runtime) {
            this.putBodyParameter("runtime", runtime);
            this.runtime = runtime;
            return this;
        }

        /**
         * <p>The labels that you want to add to nodes. You must add labels based on the following rules:</p>
         * <ul>
         * <li>Each label is a case-sensitive key-value pair. You can add up to 20 labels.</li>
         * <li>A key must be unique and cannot exceed 64 characters in length. A value can be empty and cannot exceed 128 characters in length. Keys and values cannot start with <code>aliyun</code>, <code>acs:</code>, <code>https://</code>, or <code>http://</code>. For more information, see <a href="https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#syntax-and-character-set">Labels and Selectors</a>.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is not supported if you specify the <code>nodepool_id</code> parameter.</p>
         * </blockquote>
         */
        public Builder tags(java.util.List < Tag > tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>User-defined data. For more information, see <a href="https://help.aliyun.com/document_detail/49121.html">Generate user data</a>.</p>
         * <blockquote>
         * <p> This parameter is not supported if you specify the <code>nodepool_id</code> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>IyEvdXNyL2Jpbi9iYXNoCmVjaG8gIkhlbGxvIEFDSyEi</p>
         */
        public Builder userData(String userData) {
            this.putBodyParameter("user_data", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public AttachInstancesRequest build() {
            return new AttachInstancesRequest(this);
        } 

    } 

}
