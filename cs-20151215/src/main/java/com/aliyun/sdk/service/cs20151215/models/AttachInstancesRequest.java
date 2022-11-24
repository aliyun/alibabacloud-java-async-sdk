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
    @NameInMap("cpu_policy")
    private String cpuPolicy;

    @Body
    @NameInMap("format_disk")
    private Boolean formatDisk;

    @Body
    @NameInMap("image_id")
    private String imageId;

    @Body
    @NameInMap("instances")
    @Validation(required = true)
    private java.util.List < String > instances;

    @Body
    @NameInMap("is_edge_worker")
    private Boolean isEdgeWorker;

    @Body
    @NameInMap("keep_instance_name")
    private Boolean keepInstanceName;

    @Body
    @NameInMap("key_pair")
    private String keyPair;

    @Body
    @NameInMap("nodepool_id")
    private String nodepoolId;

    @Body
    @NameInMap("password")
    private String password;

    @Body
    @NameInMap("rds_instances")
    private java.util.List < String > rdsInstances;

    @Body
    @NameInMap("runtime")
    private Runtime runtime;

    @Body
    @NameInMap("tags")
    private java.util.List < Tag > tags;

    @Body
    @NameInMap("user_data")
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
         * 集群ID。
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * CPU亲和策略。
         */
        public Builder cpuPolicy(String cpuPolicy) {
            this.putBodyParameter("cpu_policy", cpuPolicy);
            this.cpuPolicy = cpuPolicy;
            return this;
        }

        /**
         * 是否格式化数据盘。
         */
        public Builder formatDisk(Boolean formatDisk) {
            this.putBodyParameter("format_disk", formatDisk);
            this.formatDisk = formatDisk;
            return this;
        }

        /**
         * 自定义镜像ID。
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("image_id", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * 实例列表。
         */
        public Builder instances(java.util.List < String > instances) {
            this.putBodyParameter("instances", instances);
            this.instances = instances;
            return this;
        }

        /**
         * 是否为边缘节点。
         */
        public Builder isEdgeWorker(Boolean isEdgeWorker) {
            this.putBodyParameter("is_edge_worker", isEdgeWorker);
            this.isEdgeWorker = isEdgeWorker;
            return this;
        }

        /**
         * 是否保留实例名称。
         */
        public Builder keepInstanceName(Boolean keepInstanceName) {
            this.putBodyParameter("keep_instance_name", keepInstanceName);
            this.keepInstanceName = keepInstanceName;
            return this;
        }

        /**
         * key_pair名称，与login_password二选一
         */
        public Builder keyPair(String keyPair) {
            this.putBodyParameter("key_pair", keyPair);
            this.keyPair = keyPair;
            return this;
        }

        /**
         * 节点池ID，欲将节点添加到哪个节点池中。。
         */
        public Builder nodepoolId(String nodepoolId) {
            this.putBodyParameter("nodepool_id", nodepoolId);
            this.nodepoolId = nodepoolId;
            return this;
        }

        /**
         * password，与key_pair二选一。
         */
        public Builder password(String password) {
            this.putBodyParameter("password", password);
            this.password = password;
            return this;
        }

        /**
         * RDS实例列表。
         */
        public Builder rdsInstances(java.util.List < String > rdsInstances) {
            this.putBodyParameter("rds_instances", rdsInstances);
            this.rdsInstances = rdsInstances;
            return this;
        }

        /**
         * runtime.
         */
        public Builder runtime(Runtime runtime) {
            this.putBodyParameter("runtime", runtime);
            this.runtime = runtime;
            return this;
        }

        /**
         * 节点标签。
         */
        public Builder tags(java.util.List < Tag > tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * 节点自定义数据。
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
