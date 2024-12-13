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
         * <p>The CPU management policy of the node. The following policies are supported if the Kubernetes version of the cluster is 1.12.6 or later:</p>
         * <ul>
         * <li><code>static</code>: allows pods with specific resource characteristics on the node to be granted enhanced CPU affinity and exclusivity.</li>
         * <li><code>none</code>: uses default CPU affinity.</li>
         * </ul>
         * <p>Default value: <code>none</code></p>
         * <blockquote>
         * <p> This parameter is not supported if you specify <code>nodepool_id</code>.</p>
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
         * <p>Specifies whether to store container data and images on data disks. Valid value:</p>
         * <ul>
         * <li><code>true</code>: stores container data and images on data disks.</li>
         * <li><code>false</code>: does not store container data or images on data disks.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * <p>How data disks are attached:</p>
         * <ul>
         * <li>If the ECS instance is already attached with data disks and the file system of the last data disk is not initialized, the system automatically formats this data disk to ext4. Then, the system uses the disk to store the data in the /var/lib/docker and /var/lib/kubelet directories.</li>
         * <li>If no data disk is attached to the ECS instance, the system does not purchase a new data disk.</li>
         * </ul>
         * <blockquote>
         * <p> If you choose to store container data and images on data disks and a data disk is already attached to the ECS instance, the original data on this data disk is cleared. You can back up the disk to prevent data loss.</p>
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
         * <p>The custom image ID. If you do not specify this parameter, the default system image is used.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If you specify a custom image, the custom image is used to deploy the operating system on the system disk of the node.</p>
         * </li>
         * <li><p>This parameter is not supported if you specify <code>nodepool_id</code>.</p>
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
         * <p>The ECS instances that you want to add.</p>
         * <p>This parameter is required.</p>
         */
        public Builder instances(java.util.List < String > instances) {
            this.putBodyParameter("instances", instances);
            this.instances = instances;
            return this;
        }

        /**
         * <p>Specifies whether the node that you want to add is an Edge Node Service (ENS) node. Valid value:</p>
         * <ul>
         * <li><code>true</code>: the node that you want to add is an ENS node.</li>
         * <li><code>false</code>: the node that you want to add is not an ENS node.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * <blockquote>
         * <p> If the node that you want to add is an ENS node, you must set the value to <code>true</code>. This allows you to identify the node.</p>
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
         * <p>Specifies whether to retain the instance name. Valid value:</p>
         * <ul>
         * <li><code>true</code>: retains the instance name.</li>
         * <li><code>false</code>: does not retain the instance name.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
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
         * <p>The name of the key pair used to log on to the ECS instances. You must specify this parameter or <code>login_password</code>.</p>
         * <blockquote>
         * <p> This parameter is not supported if you specify <code>nodepool_id</code>.</p>
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
         * <p>The ID of the node pool to which the node is added. If you do not specify this parameter, the node is added to the default node pool.</p>
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
         * <p>The SSH logon password used to log on to the ECS instances. You must specify this parameter or <code>key_pair</code>. The password must be 8 to 30 characters in length, and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. The password cannot contain backslashes (\) or double quotation marks (&quot;).</p>
         * <p>The password is encrypted during data transfer to ensure security.</p>
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
         * <p> This parameter is not supported if you specify <code>nodepool_id</code>.</p>
         * </blockquote>
         */
        public Builder runtime(Runtime runtime) {
            this.putBodyParameter("runtime", runtime);
            this.runtime = runtime;
            return this;
        }

        /**
         * <p>The labels that you want to add to the node. When you add labels to a node, the following rules apply:</p>
         * <ul>
         * <li>A label is a case-sensitive key-value pair. You can add up to 20 labels.</li>
         * <li>The key must be unique and cannot exceed 64 characters in length. The value can be empty and cannot exceed 128 characters in length. Keys and values cannot start with <code>aliyun</code>, <code>acs:</code>, <code>https://</code>, or <code>http://</code>. For more information, see <a href="https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#syntax-and-character-set">Labels and Selectors</a>.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is not supported if you specify <code>nodepool_id</code>.</p>
         * </blockquote>
         */
        public Builder tags(java.util.List < Tag > tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The user-defined data on the node. For more information, see <a href="https://help.aliyun.com/document_detail/49121.html">Use instance user data to automatically run commands or scripts on instance startup</a>.</p>
         * <blockquote>
         * <p> This parameter is not supported if you specify <code>nodepool_id</code>.</p>
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
