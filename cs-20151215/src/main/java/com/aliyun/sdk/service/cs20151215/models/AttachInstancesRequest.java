// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachInstancesRequest} extends {@link RequestModel}
 *
 * <p>AttachInstancesRequest</p>
 */
public class AttachInstancesRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Body
    @NameInMap("instances")
    @Validation(required = true)
    private java.util.List < String > instances;

    @Body
    @NameInMap("key_pair")
    @Validation(required = true)
    private String keyPair;

    @Body
    @NameInMap("password")
    @Validation(required = true)
    private String password;

    @Body
    @NameInMap("format_disk")
    private Boolean formatDisk;

    @Body
    @NameInMap("keep_instance_name")
    private Boolean keepInstanceName;

    @Body
    @NameInMap("is_edge_worker")
    private Boolean isEdgeWorker;

    @Body
    @NameInMap("nodepool_id")
    private String nodepoolId;

    @Body
    @NameInMap("image_id")
    private String imageId;

    @Body
    @NameInMap("cpu_policy")
    private String cpuPolicy;

    @Body
    @NameInMap("user_data")
    private String userData;

    @Body
    @NameInMap("rds_instances")
    private java.util.List < String > rdsInstances;

    @Body
    @NameInMap("runtime")
    private Runtime runtime;

    @Body
    @NameInMap("tags")
    private java.util.List < Tag > tags;

    private AttachInstancesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.instances = builder.instances;
        this.keyPair = builder.keyPair;
        this.password = builder.password;
        this.formatDisk = builder.formatDisk;
        this.keepInstanceName = builder.keepInstanceName;
        this.isEdgeWorker = builder.isEdgeWorker;
        this.nodepoolId = builder.nodepoolId;
        this.imageId = builder.imageId;
        this.cpuPolicy = builder.cpuPolicy;
        this.userData = builder.userData;
        this.rdsInstances = builder.rdsInstances;
        this.runtime = builder.runtime;
        this.tags = builder.tags;
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
     * @return instances
     */
    public java.util.List < String > getInstances() {
        return this.instances;
    }

    /**
     * @return keyPair
     */
    public String getKeyPair() {
        return this.keyPair;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
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
     * @return isEdgeWorker
     */
    public Boolean getIsEdgeWorker() {
        return this.isEdgeWorker;
    }

    /**
     * @return nodepoolId
     */
    public String getNodepoolId() {
        return this.nodepoolId;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return cpuPolicy
     */
    public String getCpuPolicy() {
        return this.cpuPolicy;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
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

    public static final class Builder extends Request.Builder<AttachInstancesRequest, Builder> {
        private String clusterId; 
        private java.util.List < String > instances; 
        private String keyPair; 
        private String password; 
        private Boolean formatDisk; 
        private Boolean keepInstanceName; 
        private Boolean isEdgeWorker; 
        private String nodepoolId; 
        private String imageId; 
        private String cpuPolicy; 
        private String userData; 
        private java.util.List < String > rdsInstances; 
        private Runtime runtime; 
        private java.util.List < Tag > tags; 

        private Builder() {
            super();
        } 

        private Builder(AttachInstancesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.instances = request.instances;
            this.keyPair = request.keyPair;
            this.password = request.password;
            this.formatDisk = request.formatDisk;
            this.keepInstanceName = request.keepInstanceName;
            this.isEdgeWorker = request.isEdgeWorker;
            this.nodepoolId = request.nodepoolId;
            this.imageId = request.imageId;
            this.cpuPolicy = request.cpuPolicy;
            this.userData = request.userData;
            this.rdsInstances = request.rdsInstances;
            this.runtime = request.runtime;
            this.tags = request.tags;
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
         * The list of instances to be added.
         */
        public Builder instances(java.util.List < String > instances) {
            this.putBodyParameter("instances", instances);
            this.instances = instances;
            return this;
        }

        /**
         * The name of the key pair of the instance to be added. Select either login_password or login_password.
         * <p>
         * 
         * > this parameter is not supported when "nodepool_id" is specified.
         */
        public Builder keyPair(String keyPair) {
            this.putBodyParameter("key_pair", keyPair);
            this.keyPair = keyPair;
            return this;
        }

        /**
         * The SSH logon password of the instance to be added. Select either the SSH logon password or the key_pair password. The password must be 8 to 30 characters in length and contain at least three characters (uppercase and lowercase letters, numbers, and special characters). It cannot contain backslashes () and half-width double quotation marks (").
         * <p>
         * 
         * For security reasons, password transmission is encrypted.
         */
        public Builder password(String password) {
            this.putBodyParameter("password", password);
            this.password = password;
            return this;
        }

        /**
         * Specifies whether to store container data and images in a data disk. Valid values:
         * <p>
         * 
         * -"true": stores container data and images on data disks.
         * 
         * -"false": container data and images are not stored on data disks.
         * 
         * Default value: "false ".
         * 
         * 
         * Data disk Mount rules:
         * 
         * -If a data disk is attached to an ECS instance and the file system of the last data disk is not initialized, the system automatically formats the data disk as EXT4 to store/var/lib/docker,/var/lib/kubelet.
         * -If no data disk is attached to the ECS instance, no new data disk is attached.
         * > if you select to store data to a data disk and the ECS instance is attached to the data disk, the original data in the data disk will be lost.
         */
        public Builder formatDisk(Boolean formatDisk) {
            this.putBodyParameter("format_disk", formatDisk);
            this.formatDisk = formatDisk;
            return this;
        }

        /**
         * Specifies whether to retain the original instance name. Valid values:
         * <p>
         * 
         * -"true": retain the instance name.
         * 
         * -"false": the instance name is not retained.
         * 
         * Default value: "true ".
         */
        public Builder keepInstanceName(Boolean keepInstanceName) {
            this.putBodyParameter("keep_instance_name", keepInstanceName);
            this.keepInstanceName = keepInstanceName;
            return this;
        }

        /**
         * Indicates whether the node is an edge node. Valid values:
         * <p>
         * 
         * -"true": indicates that the added node is an edge node.
         * 
         * -"false": indicates whether the added node is an edge node.
         * 
         * Default value: "false ".
         * 
         * > If it is an edge node, the value must be "true", which is used to identify the node type as ENS node.
         */
        public Builder isEdgeWorker(Boolean isEdgeWorker) {
            this.putBodyParameter("is_edge_worker", isEdgeWorker);
            this.isEdgeWorker = isEdgeWorker;
            return this;
        }

        /**
         * The ID of the node pool. If this parameter is not specified, the node is added to the default node pool.
         */
        public Builder nodepoolId(String nodepoolId) {
            this.putBodyParameter("nodepool_id", nodepoolId);
            this.nodepoolId = nodepoolId;
            return this;
        }

        /**
         * The ID of the custom image. If you do not set this parameter, the default system image is used.
         * <p>
         * 
         * >-the system disk image of the instance will be replaced with this image.
         * -This parameter is not supported when "nodepool_id" is specified.
         * 
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("image_id", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The CPU management policy of the node. When the cluster version is 1.12.6 or later, the following two policies are supported:
         * <p>
         * 
         * -"static": allows you to enhance CPU affinity and exclusiveness for pods with certain resource characteristics on nodes.
         * -"none": indicates that the existing default CPU affinity solution is enabled.
         * 
         * Default value: "none ".
         * 
         * > This parameter is not supported when "nodepool_id" is specified.
         */
        public Builder cpuPolicy(String cpuPolicy) {
            this.putBodyParameter("cpu_policy", cpuPolicy);
            this.cpuPolicy = cpuPolicy;
            return this;
        }

        /**
         * Custom node data. For more information, see [generate instance custom data](~~ 49121 ~~).
         * <p>
         * 
         * > this parameter is not supported when "nodepool_id" is specified.
         */
        public Builder userData(String userData) {
            this.putBodyParameter("user_data", userData);
            this.userData = userData;
            return this;
        }

        /**
         * The list of RDS instances.
         * <p>
         * 
         */
        public Builder rdsInstances(java.util.List < String > rdsInstances) {
            this.putBodyParameter("rds_instances", rdsInstances);
            this.rdsInstances = rdsInstances;
            return this;
        }

        /**
         * Container Runtime.
         * <p>
         * > This parameter is not supported when "nodepool_id" is specified.
         */
        public Builder runtime(Runtime runtime) {
            this.putBodyParameter("runtime", runtime);
            this.runtime = runtime;
            return this;
        }

        /**
         * The tag of the node. Tag definition rules:
         * <p>
         * 
         * -A tag consists of case-sensitive key-value pairs. You can set up to 20 tags.
         * -The tag key cannot be repeated. It can be up to 64 characters in length. The tag value can be empty and can be up to 128 characters in length. The tag key and tag value cannot start with "aliyun", "acs:", "https://", or "http. For more information, see [Labels and Selectors](https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#syntax-and-character-set).
         * > This parameter is not supported when "nodepool_id" is specified.
         */
        public Builder tags(java.util.List < Tag > tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public AttachInstancesRequest build() {
            return new AttachInstancesRequest(this);
        } 

    } 

}
