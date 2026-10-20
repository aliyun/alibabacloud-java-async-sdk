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
    private java.util.List<String> instances;

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
    private java.util.List<String> rdsInstances;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("runtime")
    private Runtime runtime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<Tag> tags;

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
    public java.util.List<String> getInstances() {
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
    public java.util.List<String> getRdsInstances() {
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
    public java.util.List<Tag> getTags() {
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
        private java.util.List<String> instances; 
        private Boolean isEdgeWorker; 
        private Boolean keepInstanceName; 
        private String keyPair; 
        private String nodepoolId; 
        private String password; 
        private java.util.List<String> rdsInstances; 
        private Runtime runtime; 
        private java.util.List<Tag> tags; 
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
         * <p>The CPU management policy of the node. The following policies are supported for clusters running version 1.12.6 or later:</p>
         * <ul>
         * <li><code>static</code>: Allows pods with certain resource characteristics on the node to be granted enhanced CPU affinity and exclusivity.</li>
         * <li><code>none</code>: Uses the existing default CPU affinity scheme.</li>
         * </ul>
         * <p>Default value: <code>none</code>.</p>
         * <blockquote>
         * <p>After you specify <code>nodepool_id</code>, this parameter is not supported.</p>
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
         * <p>Specifies whether to store container data and images on a data cloud disk. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Stores container data and images on a data cloud disk.</p>
         * </li>
         * <li><p><code>false</code>: Does not store container data and images on a data cloud disk.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * <p>Data cloud disk mounting rules:</p>
         * <ul>
         * <li>If the ECS instance has data cloud disks attached and the file system of the last data cloud disk is not initialized, the system automatically formats the data cloud disk to EXT4. The data cloud disk is then used to store the content of /var/lib/docker and /var/lib/kubelet, which are the default data directories for the Docker container runtime and the kubelet component, respectively.</li>
         * <li>If the ECS instance does not have data cloud disks attached, no new data cloud disk is mounted.<blockquote>
         * <p>If you choose to store data on a data cloud disk and the ECS instance already has data cloud disks attached, the existing data on the data cloud disk will be lost. Back up your data in advance.</p>
         * </blockquote>
         * </li>
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
         * <p>The custom image ID.</p>
         * <ul>
         * <li><p>If you specify a custom image ID, the system cloud disk image of the instance is replaced with the custom image.</p>
         * </li>
         * <li><p>If you do not specify this parameter, the default system image is used.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>After you specify <code>nodepool_id</code>, this parameter is not supported.</p>
         * </blockquote>
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
         * <p>The list of ECS instances to be added.</p>
         * <p>This parameter is required.</p>
         */
        public Builder instances(java.util.List<String> instances) {
            this.putBodyParameter("instances", instances);
            this.instances = instances;
            return this;
        }

        /**
         * <p>Specifies whether the node to be added is an edge node, which is an Edge Node Service (ENS) node. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: The node to be added is an edge node.</p>
         * </li>
         * <li><p><code>false</code>: The node to be added is not an edge node.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * <blockquote>
         * <p>If the node is an edge node, set this parameter to <code>true</code> to identify the node type as an ENS node.</p>
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
         * <p>Specifies whether to retain the original instance name. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Retains the instance name.</p>
         * </li>
         * <li><p><code>false</code>: Does not retain the instance name.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder keepInstanceName(Boolean keepInstanceName) {
            this.putBodyParameter("keep_instance_name", keepInstanceName);
            this.keepInstanceName = keepInstanceName;
            return this;
        }

        /**
         * <p>The name of the key pair for the instances to be added.
         * You need to specify only one of key_pair and password, or you can leave both parameters empty.</p>
         * <blockquote>
         * <p>After you specify <code>nodepool_id</code>, this parameter is not supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>security-key</p>
         */
        public Builder keyPair(String keyPair) {
            this.putBodyParameter("key_pair", keyPair);
            this.keyPair = keyPair;
            return this;
        }

        /**
         * <p>The node pool ID. If you do not specify this parameter, the node is added to the default node pool.</p>
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
         * <p>The SSH logon password for the instances to be added. You need to specify only one of key_pair and password, or you can leave both parameters empty.</p>
         * <p>The password must meet the following requirements:</p>
         * <ul>
         * <li>The password must be 8 to 30 characters in length.</li>
         * <li>The password must contain at least uppercase letters, lowercase letters, digits, and special characters.</li>
         * <li>The password cannot contain backslashes (\) or double quotation marks (&quot;).</li>
         * </ul>
         * <p>For security purposes, the password is encrypted during transmission.</p>
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
         * <p>The list of ApsaraDB RDS instances.</p>
         */
        public Builder rdsInstances(java.util.List<String> rdsInstances) {
            this.putBodyParameter("rds_instances", rdsInstances);
            this.rdsInstances = rdsInstances;
            return this;
        }

        /**
         * <p>The container runtime.</p>
         * <blockquote>
         * <p>After you specify <code>nodepool_id</code>, this parameter is not supported.</p>
         * </blockquote>
         * <p>name: the name of the container runtime. ACK supports the following three container runtimes:</p>
         * <ul>
         * <li>containerd: Recommended. Supported by all cluster versions.</li>
         * <li>Sandboxed-Container.runv: Sandboxed container that provides higher isolation. Supported by clusters running version 1.24 or earlier.</li>
         * <li>docker: Supported by clusters running version 1.22 or earlier.</li>
         * </ul>
         * <p>Default value: containerd.</p>
         * <p>containerd: the container runtime version. Default value: the latest version.</p>
         * <p>For more information about changes to the sandboxed container runtime, see <a href="https://help.aliyun.com/document_detail/160312.html">Sandboxed container runtime release notes</a>.</p>
         */
        public Builder runtime(Runtime runtime) {
            this.putBodyParameter("runtime", runtime);
            this.runtime = runtime;
            return this;
        }

        /**
         * <p>The node labels. Label definition rules:</p>
         * <ul>
         * <li>Labels are case-sensitive key-value pairs. You can configure up to 20 labels.</li>
         * <li>Label keys cannot be duplicate and can be up to 64 characters in length.</li>
         * <li>Label values can be empty and can be up to 128 characters in length.</li>
         * <li>Label keys and label values cannot start with <code>aliyun</code>, <code>acs:</code>, <code>https://</code>, or <code>http://</code>.</li>
         * </ul>
         * <p>For more information, see <a href="https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#syntax-and-character-set">Labels and Selectors</a>.</p>
         * <blockquote>
         * <p>After you specify <code>nodepool_id</code>, this parameter is not supported.</p>
         * </blockquote>
         */
        public Builder tags(java.util.List<Tag> tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The node user data. For more information, see <a href="https://help.aliyun.com/document_detail/49121.html">Generate instance user data</a>.</p>
         * <blockquote>
         * <p>After you specify <code>nodepool_id</code>, this parameter is not supported.</p>
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
