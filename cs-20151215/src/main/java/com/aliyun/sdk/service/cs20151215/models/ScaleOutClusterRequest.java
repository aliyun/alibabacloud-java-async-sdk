// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ScaleOutClusterRequest} extends {@link RequestModel}
 *
 * <p>ScaleOutClusterRequest</p>
 */
public class ScaleOutClusterRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cloud_monitor_flags")
    private Boolean cloudMonitorFlags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("count")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long count;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cpu_policy")
    private String cpuPolicy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("image_id")
    private String imageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("key_pair")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keyPair;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("login_password")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loginPassword;

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
    @com.aliyun.core.annotation.NameInMap("taints")
    private java.util.List < Taint > taints;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("user_data")
    private String userData;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("vswitch_ids")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > vswitchIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("worker_auto_renew")
    private Boolean workerAutoRenew;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("worker_auto_renew_period")
    private Long workerAutoRenewPeriod;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("worker_data_disks")
    private java.util.List < WorkerDataDisks> workerDataDisks;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("worker_instance_charge_type")
    private String workerInstanceChargeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("worker_instance_types")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > workerInstanceTypes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("worker_period")
    private Long workerPeriod;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("worker_period_unit")
    private String workerPeriodUnit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("worker_system_disk_category")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workerSystemDiskCategory;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("worker_system_disk_size")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long workerSystemDiskSize;

    private ScaleOutClusterRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.cloudMonitorFlags = builder.cloudMonitorFlags;
        this.count = builder.count;
        this.cpuPolicy = builder.cpuPolicy;
        this.imageId = builder.imageId;
        this.keyPair = builder.keyPair;
        this.loginPassword = builder.loginPassword;
        this.rdsInstances = builder.rdsInstances;
        this.runtime = builder.runtime;
        this.tags = builder.tags;
        this.taints = builder.taints;
        this.userData = builder.userData;
        this.vswitchIds = builder.vswitchIds;
        this.workerAutoRenew = builder.workerAutoRenew;
        this.workerAutoRenewPeriod = builder.workerAutoRenewPeriod;
        this.workerDataDisks = builder.workerDataDisks;
        this.workerInstanceChargeType = builder.workerInstanceChargeType;
        this.workerInstanceTypes = builder.workerInstanceTypes;
        this.workerPeriod = builder.workerPeriod;
        this.workerPeriodUnit = builder.workerPeriodUnit;
        this.workerSystemDiskCategory = builder.workerSystemDiskCategory;
        this.workerSystemDiskSize = builder.workerSystemDiskSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScaleOutClusterRequest create() {
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
     * @return cloudMonitorFlags
     */
    public Boolean getCloudMonitorFlags() {
        return this.cloudMonitorFlags;
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return cpuPolicy
     */
    public String getCpuPolicy() {
        return this.cpuPolicy;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return keyPair
     */
    public String getKeyPair() {
        return this.keyPair;
    }

    /**
     * @return loginPassword
     */
    public String getLoginPassword() {
        return this.loginPassword;
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
     * @return taints
     */
    public java.util.List < Taint > getTaints() {
        return this.taints;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    /**
     * @return vswitchIds
     */
    public java.util.List < String > getVswitchIds() {
        return this.vswitchIds;
    }

    /**
     * @return workerAutoRenew
     */
    public Boolean getWorkerAutoRenew() {
        return this.workerAutoRenew;
    }

    /**
     * @return workerAutoRenewPeriod
     */
    public Long getWorkerAutoRenewPeriod() {
        return this.workerAutoRenewPeriod;
    }

    /**
     * @return workerDataDisks
     */
    public java.util.List < WorkerDataDisks> getWorkerDataDisks() {
        return this.workerDataDisks;
    }

    /**
     * @return workerInstanceChargeType
     */
    public String getWorkerInstanceChargeType() {
        return this.workerInstanceChargeType;
    }

    /**
     * @return workerInstanceTypes
     */
    public java.util.List < String > getWorkerInstanceTypes() {
        return this.workerInstanceTypes;
    }

    /**
     * @return workerPeriod
     */
    public Long getWorkerPeriod() {
        return this.workerPeriod;
    }

    /**
     * @return workerPeriodUnit
     */
    public String getWorkerPeriodUnit() {
        return this.workerPeriodUnit;
    }

    /**
     * @return workerSystemDiskCategory
     */
    public String getWorkerSystemDiskCategory() {
        return this.workerSystemDiskCategory;
    }

    /**
     * @return workerSystemDiskSize
     */
    public Long getWorkerSystemDiskSize() {
        return this.workerSystemDiskSize;
    }

    public static final class Builder extends Request.Builder<ScaleOutClusterRequest, Builder> {
        private String clusterId; 
        private Boolean cloudMonitorFlags; 
        private Long count; 
        private String cpuPolicy; 
        private String imageId; 
        private String keyPair; 
        private String loginPassword; 
        private java.util.List < String > rdsInstances; 
        private Runtime runtime; 
        private java.util.List < Tag > tags; 
        private java.util.List < Taint > taints; 
        private String userData; 
        private java.util.List < String > vswitchIds; 
        private Boolean workerAutoRenew; 
        private Long workerAutoRenewPeriod; 
        private java.util.List < WorkerDataDisks> workerDataDisks; 
        private String workerInstanceChargeType; 
        private java.util.List < String > workerInstanceTypes; 
        private Long workerPeriod; 
        private String workerPeriodUnit; 
        private String workerSystemDiskCategory; 
        private Long workerSystemDiskSize; 

        private Builder() {
            super();
        } 

        private Builder(ScaleOutClusterRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.cloudMonitorFlags = request.cloudMonitorFlags;
            this.count = request.count;
            this.cpuPolicy = request.cpuPolicy;
            this.imageId = request.imageId;
            this.keyPair = request.keyPair;
            this.loginPassword = request.loginPassword;
            this.rdsInstances = request.rdsInstances;
            this.runtime = request.runtime;
            this.tags = request.tags;
            this.taints = request.taints;
            this.userData = request.userData;
            this.vswitchIds = request.vswitchIds;
            this.workerAutoRenew = request.workerAutoRenew;
            this.workerAutoRenewPeriod = request.workerAutoRenewPeriod;
            this.workerDataDisks = request.workerDataDisks;
            this.workerInstanceChargeType = request.workerInstanceChargeType;
            this.workerInstanceTypes = request.workerInstanceTypes;
            this.workerPeriod = request.workerPeriod;
            this.workerPeriodUnit = request.workerPeriodUnit;
            this.workerSystemDiskCategory = request.workerSystemDiskCategory;
            this.workerSystemDiskSize = request.workerSystemDiskSize;
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
         * <p>Specifies whether to install the CloudMonitor agent. Valid values:</p>
         * <ul>
         * <li><code>true</code>: installs the CloudMonitor agent.</li>
         * <li><code>false</code>: does not install the CloudMonitor agent.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder cloudMonitorFlags(Boolean cloudMonitorFlags) {
            this.putBodyParameter("cloud_monitor_flags", cloudMonitorFlags);
            this.cloudMonitorFlags = cloudMonitorFlags;
            return this;
        }

        /**
         * <p>The number of worker nodes that you want to add.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder count(Long count) {
            this.putBodyParameter("count", count);
            this.count = count;
            return this;
        }

        /**
         * <p>The CPU management policy of nodes. The following policies are supported if the Kubernetes version of the cluster is 1.12.6 or later:</p>
         * <ul>
         * <li><code>static</code>: allows pods with specific resource characteristics on the node to be granted with enhanced CPU affinity and exclusivity.</li>
         * <li><code>none</code>: specifies that the default CPU affinity is used.</li>
         * </ul>
         * <p>Default value: <code>none</code>.</p>
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
         * <p>Specifies a custom image for nodes. By default, the image provided by ACK is used. You can select a custom image to replace the default image. For more information, see <a href="https://help.aliyun.com/document_detail/146647.html">Custom images</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>m-bp16z7xko3vvv8gt****</p>
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("image_id", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The name of the key pair. You must configure this parameter or the <code>login_password</code> parameter.</p>
         * <p>This parameter is required.</p>
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
         * <p>The password for SSH logon. You must configure this parameter or the <code>key_pair</code> parameter. The password must be 8 to 30 characters in length, and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello@1234</p>
         */
        public Builder loginPassword(String loginPassword) {
            this.putBodyParameter("login_password", loginPassword);
            this.loginPassword = loginPassword;
            return this;
        }

        /**
         * <p>The ApsaraDB RDS instances. If you specify a list of ApsaraDB RDS instances, ECS instances in the cluster are automatically added to the whitelist of the ApsaraDB RDS instances.</p>
         */
        public Builder rdsInstances(java.util.List < String > rdsInstances) {
            this.putBodyParameter("rds_instances", rdsInstances);
            this.rdsInstances = rdsInstances;
            return this;
        }

        /**
         * <p>The container runtime.</p>
         */
        public Builder runtime(Runtime runtime) {
            this.putBodyParameter("runtime", runtime);
            this.runtime = runtime;
            return this;
        }

        /**
         * <p>The tags that you want to add to nodes. When you add labels to a node, the following rules apply:</p>
         * <ul>
         * <li>A label is a case-sensitive key-value pair. You can add up to 20 labels.</li>
         * <li>When you add a tag, you must specify a unique key but you can leave the value empty. A key cannot exceed 64 characters in length and a value cannot exceed 128 characters in length. Keys and values cannot start with aliyun, acs:, https://, or http://. For more information, see <a href="https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#syntax-and-character-set">Labels and Selectors</a>.</li>
         * </ul>
         */
        public Builder tags(java.util.List < Tag > tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The taints that you want to add to nodes. Taints can be used together with tolerations to prevent pods from being scheduled to specific nodes. For more information, see <a href="https://kubernetes.io/zh/docs/concepts/scheduling-eviction/taint-and-toleration/">taint-and-toleration</a>.</p>
         */
        public Builder taints(java.util.List < Taint > taints) {
            this.putBodyParameter("taints", taints);
            this.taints = taints;
            return this;
        }

        /**
         * <p>The user-defined data of the node pool. For more information, see <a href="https://help.aliyun.com/document_detail/49121.html">Generate user-defined data</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>IyEvdXNyL2Jpbi9iYXNoCmVjaG8gIkhlbGxvIEFD****</p>
         */
        public Builder userData(String userData) {
            this.putBodyParameter("user_data", userData);
            this.userData = userData;
            return this;
        }

        /**
         * <p>The vSwitch IDs. You can select one to three vSwitches when you create a cluster. To ensure the high availability of the cluster, we recommend that you select vSwitches in different zones.</p>
         * <p>This parameter is required.</p>
         */
        public Builder vswitchIds(java.util.List < String > vswitchIds) {
            this.putBodyParameter("vswitch_ids", vswitchIds);
            this.vswitchIds = vswitchIds;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto-renewal for worker nodes. This parameter takes effect and is required only if <code>worker_instance_charge_type</code> is set to <code>PrePaid</code>. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables auto-renewal.</li>
         * <li><code>false</code>: disables auto-renewal.</li>
         * </ul>
         * <p>Default value: <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder workerAutoRenew(Boolean workerAutoRenew) {
            this.putBodyParameter("worker_auto_renew", workerAutoRenew);
            this.workerAutoRenew = workerAutoRenew;
            return this;
        }

        /**
         * <p>The auto-renewal duration of worker nodes. This parameter takes effect and is required only if the subscription billing method is selected for worker nodes.</p>
         * <p>Valid values: 1, 2, 3, 6, and 12.</p>
         * <p>Default value: <code>1</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder workerAutoRenewPeriod(Long workerAutoRenewPeriod) {
            this.putBodyParameter("worker_auto_renew_period", workerAutoRenewPeriod);
            this.workerAutoRenewPeriod = workerAutoRenewPeriod;
            return this;
        }

        /**
         * <p>The configurations of the data disks that you want to mount to worker nodes. The configurations include the disk type and disk size.</p>
         */
        public Builder workerDataDisks(java.util.List < WorkerDataDisks> workerDataDisks) {
            this.putBodyParameter("worker_data_disks", workerDataDisks);
            this.workerDataDisks = workerDataDisks;
            return this;
        }

        /**
         * <p>The billing method of worker nodes. Valid values:</p>
         * <ul>
         * <li><code>PrePaid</code>: subscription.</li>
         * <li><code>PostPaid</code>: pay-as-you-go.</li>
         * </ul>
         * <p>Default value: <code>PostPaid</code></p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        public Builder workerInstanceChargeType(String workerInstanceChargeType) {
            this.putBodyParameter("worker_instance_charge_type", workerInstanceChargeType);
            this.workerInstanceChargeType = workerInstanceChargeType;
            return this;
        }

        /**
         * <p>The instance configurations of worker nodes.</p>
         * <p>This parameter is required.</p>
         */
        public Builder workerInstanceTypes(java.util.List < String > workerInstanceTypes) {
            this.putBodyParameter("worker_instance_types", workerInstanceTypes);
            this.workerInstanceTypes = workerInstanceTypes;
            return this;
        }

        /**
         * <p>The subscription duration of worker nodes. This parameter takes effect and is required only if <code>worker_instance_charge_type</code> is set to <code>PrePaid</code>.</p>
         * <p>Valid values: 1, 2, 3, 6, 12, 24, 36, 48, and 60.</p>
         * <p>Default value: 1</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder workerPeriod(Long workerPeriod) {
            this.putBodyParameter("worker_period", workerPeriod);
            this.workerPeriod = workerPeriod;
            return this;
        }

        /**
         * <p>The billing cycle of worker nodes. This parameter is required only if worker_instance_charge_type is set to <code>PrePaid</code>.</p>
         * <p>Set the value to <code>Month</code>. Worker nodes are billed only on a monthly basis.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder workerPeriodUnit(String workerPeriodUnit) {
            this.putBodyParameter("worker_period_unit", workerPeriodUnit);
            this.workerPeriodUnit = workerPeriodUnit;
            return this;
        }

        /**
         * <p>The system disk type of worker nodes. Valid values:</p>
         * <ul>
         * <li><code>cloud_efficiency</code>: ultra disk.</li>
         * <li><code>cloud_ssd</code>: standard SSD.</li>
         * <li><code>cloud_essd</code>: Enterprise SSD (ESSD).</li>
         * </ul>
         * <p>Default value: <code>cloud_ssd</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_efficiency</p>
         */
        public Builder workerSystemDiskCategory(String workerSystemDiskCategory) {
            this.putBodyParameter("worker_system_disk_category", workerSystemDiskCategory);
            this.workerSystemDiskCategory = workerSystemDiskCategory;
            return this;
        }

        /**
         * <p>The system disk size of worker nodes. Unit: GiB.</p>
         * <p>Valid values: 40 to 500.</p>
         * <p>Default value: <code>120</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        public Builder workerSystemDiskSize(Long workerSystemDiskSize) {
            this.putBodyParameter("worker_system_disk_size", workerSystemDiskSize);
            this.workerSystemDiskSize = workerSystemDiskSize;
            return this;
        }

        @Override
        public ScaleOutClusterRequest build() {
            return new ScaleOutClusterRequest(this);
        } 

    } 

    /**
     * 
     * {@link ScaleOutClusterRequest} extends {@link TeaModel}
     *
     * <p>ScaleOutClusterRequest</p>
     */
    public static class WorkerDataDisks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("auto_snapshot_policy_id")
        private String autoSnapshotPolicyId;

        @com.aliyun.core.annotation.NameInMap("category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("encrypted")
        private String encrypted;

        @com.aliyun.core.annotation.NameInMap("size")
        private String size;

        private WorkerDataDisks(Builder builder) {
            this.autoSnapshotPolicyId = builder.autoSnapshotPolicyId;
            this.category = builder.category;
            this.encrypted = builder.encrypted;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkerDataDisks create() {
            return builder().build();
        }

        /**
         * @return autoSnapshotPolicyId
         */
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return encrypted
         */
        public String getEncrypted() {
            return this.encrypted;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        public static final class Builder {
            private String autoSnapshotPolicyId; 
            private String category; 
            private String encrypted; 
            private String size; 

            /**
             * <p>The ID of the automatic snapshot policy. The system performs automatic backup for a cloud disk based on the specified automatic snapshot policy.</p>
             * <p>By default, this parameter is left empty, which indicates that automatic backup is disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>sp-bp14yziiuvu3s6jn****</p>
             */
            public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
                this.autoSnapshotPolicyId = autoSnapshotPolicyId;
                return this;
            }

            /**
             * <p>The type of the data disk.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_essd</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>Specifies whether to encrypt the data disks. Valid values:</p>
             * <ul>
             * <li><code>true</code>: encrypts the data disk.</li>
             * <li><code>false</code>: does not encrypt the data disk.</li>
             * </ul>
             * <p>Default value: <code>false</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder encrypted(String encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * <p>The size of the data disk. Valid values: 40 to 32767.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            public WorkerDataDisks build() {
                return new WorkerDataDisks(this);
            } 

        } 

    }
}
