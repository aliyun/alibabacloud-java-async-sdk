// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScaleOutClusterRequest} extends {@link RequestModel}
 *
 * <p>ScaleOutClusterRequest</p>
 */
public class ScaleOutClusterRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Body
    @NameInMap("count")
    @Validation(required = true)
    private Long count;

    @Body
    @NameInMap("key_pair")
    @Validation(required = true)
    private String keyPair;

    @Body
    @NameInMap("login_password")
    @Validation(required = true)
    private String loginPassword;

    @Body
    @NameInMap("vswitch_ids")
    @Validation(required = true)
    private java.util.List < String > vswitchIds;

    @Body
    @NameInMap("worker_instance_charge_type")
    private String workerInstanceChargeType;

    @Body
    @NameInMap("worker_period")
    private Long workerPeriod;

    @Body
    @NameInMap("worker_period_unit")
    private String workerPeriodUnit;

    @Body
    @NameInMap("worker_auto_renew")
    private Boolean workerAutoRenew;

    @Body
    @NameInMap("worker_auto_renew_period")
    private Long workerAutoRenewPeriod;

    @Body
    @NameInMap("worker_instance_types")
    @Validation(required = true)
    private java.util.List < String > workerInstanceTypes;

    @Body
    @NameInMap("worker_system_disk_category")
    @Validation(required = true)
    private String workerSystemDiskCategory;

    @Body
    @NameInMap("worker_system_disk_size")
    @Validation(required = true)
    private Long workerSystemDiskSize;

    @Body
    @NameInMap("worker_data_disks")
    private java.util.List < WorkerDataDisks> workerDataDisks;

    @Body
    @NameInMap("cloud_monitor_flags")
    private Boolean cloudMonitorFlags;

    @Body
    @NameInMap("cpu_policy")
    private String cpuPolicy;

    @Body
    @NameInMap("image_id")
    private String imageId;

    @Body
    @NameInMap("user_data")
    private String userData;

    @Body
    @NameInMap("rds_instances")
    private java.util.List < String > rdsInstances;

    @Body
    @NameInMap("tags")
    private java.util.List < Tag > tags;

    @Body
    @NameInMap("taints")
    private java.util.List < Taint > taints;

    @Body
    @NameInMap("runtime")
    private Runtime runtime;

    private ScaleOutClusterRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.count = builder.count;
        this.keyPair = builder.keyPair;
        this.loginPassword = builder.loginPassword;
        this.vswitchIds = builder.vswitchIds;
        this.workerInstanceChargeType = builder.workerInstanceChargeType;
        this.workerPeriod = builder.workerPeriod;
        this.workerPeriodUnit = builder.workerPeriodUnit;
        this.workerAutoRenew = builder.workerAutoRenew;
        this.workerAutoRenewPeriod = builder.workerAutoRenewPeriod;
        this.workerInstanceTypes = builder.workerInstanceTypes;
        this.workerSystemDiskCategory = builder.workerSystemDiskCategory;
        this.workerSystemDiskSize = builder.workerSystemDiskSize;
        this.workerDataDisks = builder.workerDataDisks;
        this.cloudMonitorFlags = builder.cloudMonitorFlags;
        this.cpuPolicy = builder.cpuPolicy;
        this.imageId = builder.imageId;
        this.userData = builder.userData;
        this.rdsInstances = builder.rdsInstances;
        this.tags = builder.tags;
        this.taints = builder.taints;
        this.runtime = builder.runtime;
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
     * @return count
     */
    public Long getCount() {
        return this.count;
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
     * @return vswitchIds
     */
    public java.util.List < String > getVswitchIds() {
        return this.vswitchIds;
    }

    /**
     * @return workerInstanceChargeType
     */
    public String getWorkerInstanceChargeType() {
        return this.workerInstanceChargeType;
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
     * @return workerInstanceTypes
     */
    public java.util.List < String > getWorkerInstanceTypes() {
        return this.workerInstanceTypes;
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

    /**
     * @return workerDataDisks
     */
    public java.util.List < WorkerDataDisks> getWorkerDataDisks() {
        return this.workerDataDisks;
    }

    /**
     * @return cloudMonitorFlags
     */
    public Boolean getCloudMonitorFlags() {
        return this.cloudMonitorFlags;
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
     * @return runtime
     */
    public Runtime getRuntime() {
        return this.runtime;
    }

    public static final class Builder extends Request.Builder<ScaleOutClusterRequest, Builder> {
        private String clusterId; 
        private Long count; 
        private String keyPair; 
        private String loginPassword; 
        private java.util.List < String > vswitchIds; 
        private String workerInstanceChargeType; 
        private Long workerPeriod; 
        private String workerPeriodUnit; 
        private Boolean workerAutoRenew; 
        private Long workerAutoRenewPeriod; 
        private java.util.List < String > workerInstanceTypes; 
        private String workerSystemDiskCategory; 
        private Long workerSystemDiskSize; 
        private java.util.List < WorkerDataDisks> workerDataDisks; 
        private Boolean cloudMonitorFlags; 
        private String cpuPolicy; 
        private String imageId; 
        private String userData; 
        private java.util.List < String > rdsInstances; 
        private java.util.List < Tag > tags; 
        private java.util.List < Taint > taints; 
        private Runtime runtime; 

        private Builder() {
            super();
        } 

        private Builder(ScaleOutClusterRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.count = request.count;
            this.keyPair = request.keyPair;
            this.loginPassword = request.loginPassword;
            this.vswitchIds = request.vswitchIds;
            this.workerInstanceChargeType = request.workerInstanceChargeType;
            this.workerPeriod = request.workerPeriod;
            this.workerPeriodUnit = request.workerPeriodUnit;
            this.workerAutoRenew = request.workerAutoRenew;
            this.workerAutoRenewPeriod = request.workerAutoRenewPeriod;
            this.workerInstanceTypes = request.workerInstanceTypes;
            this.workerSystemDiskCategory = request.workerSystemDiskCategory;
            this.workerSystemDiskSize = request.workerSystemDiskSize;
            this.workerDataDisks = request.workerDataDisks;
            this.cloudMonitorFlags = request.cloudMonitorFlags;
            this.cpuPolicy = request.cpuPolicy;
            this.imageId = request.imageId;
            this.userData = request.userData;
            this.rdsInstances = request.rdsInstances;
            this.tags = request.tags;
            this.taints = request.taints;
            this.runtime = request.runtime;
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
         * The number of nodes to be scaled out.
         */
        public Builder count(Long count) {
            this.putBodyParameter("count", count);
            this.count = count;
            return this;
        }

        /**
         * The name of the key pair, which must be either login_password or login_password.
         */
        public Builder keyPair(String keyPair) {
            this.putBodyParameter("key_pair", keyPair);
            this.keyPair = keyPair;
            return this;
        }

        /**
         * The SSH logon password. Select either the SSH logon password or the key_pair password. The password must be 8 to 30 characters in length and contain at least three characters (uppercase and lowercase letters, numbers, and special characters).
         */
        public Builder loginPassword(String loginPassword) {
            this.putBodyParameter("login_password", loginPassword);
            this.loginPassword = loginPassword;
            return this;
        }

        /**
         * The ID of the vSwitch. You can select one to three vswitches when creating a cluster. To ensure high availability of the cluster, we recommend that you select vswitches in different zones.
         */
        public Builder vswitchIds(java.util.List < String > vswitchIds) {
            this.putBodyParameter("vswitch_ids", vswitchIds);
            this.vswitchIds = vswitchIds;
            return this;
        }

        /**
         * The billing method of the Worker node. Valid values:
         * <p>
         * 
         * -"PrePaid": subscription.
         * -"PostPaid": pay-as-you-go.
         * 
         * Default value: "PostPaid ".
         */
        public Builder workerInstanceChargeType(String workerInstanceChargeType) {
            this.putBodyParameter("worker_instance_charge_type", workerInstanceChargeType);
            this.workerInstanceChargeType = workerInstanceChargeType;
            return this;
        }

        /**
         * The subscription duration of a Worker node. This parameter is required only when "worker_instance_charge_type" is set to "PrePaid.
         * <p>
         * 
         * Valid values:{1, 2, 3, 6, 12, 24, 36, 48, 60}.
         * 
         * Default value: 1.
         */
        public Builder workerPeriod(Long workerPeriod) {
            this.putBodyParameter("worker_period", workerPeriod);
            this.workerPeriod = workerPeriod;
            return this;
        }

        /**
         * The billing cycle of the Wroker node. You must specify the billing cycle when the billing type is "PrePaid.
         * <p>
         * 
         * Set the value to "month"". Currently, only months are supported.
         */
        public Builder workerPeriodUnit(String workerPeriodUnit) {
            this.putBodyParameter("worker_period_unit", workerPeriodUnit);
            this.workerPeriodUnit = workerPeriodUnit;
            return this;
        }

        /**
         * Specifies whether to enable automatic renewal for Worker nodes. This parameter takes effect only when "worker_instance_charge_type" is set to "PrePaid". Valid values:
         * <p>
         * 
         * -"true": auto renewal.
         * -"false": does not automatically renew the instance.
         * 
         * Default value: "true ".
         */
        public Builder workerAutoRenew(Boolean workerAutoRenew) {
            this.putBodyParameter("worker_auto_renew", workerAutoRenew);
            this.workerAutoRenew = workerAutoRenew;
            return this;
        }

        /**
         * The auto-renewal period of the Worker node. This parameter takes effect only when the subscription billing method is selected. This parameter is required.
         * <p>
         * 
         * Valid values:{1, 2, 3, 6, 12}.
         * 
         * Default value ".
         */
        public Builder workerAutoRenewPeriod(Long workerAutoRenewPeriod) {
            this.putBodyParameter("worker_auto_renew_period", workerAutoRenewPeriod);
            this.workerAutoRenewPeriod = workerAutoRenewPeriod;
            return this;
        }

        /**
         * Configure the Worker node instance.
         */
        public Builder workerInstanceTypes(java.util.List < String > workerInstanceTypes) {
            this.putBodyParameter("worker_instance_types", workerInstanceTypes);
            this.workerInstanceTypes = workerInstanceTypes;
            return this;
        }

        /**
         * The system disk type of the Worker node. Valid values:
         * <p>
         * 
         * -"Cloud_efficiency ": Ultra disk.
         * -"Cloud_ssd ":SSD cloud disk.
         * -"Cloud_essd": ESSD.
         * 
         * Default value: cloud_ssd ".
         */
        public Builder workerSystemDiskCategory(String workerSystemDiskCategory) {
            this.putBodyParameter("worker_system_disk_category", workerSystemDiskCategory);
            this.workerSystemDiskCategory = workerSystemDiskCategory;
            return this;
        }

        /**
         * The system disk size of the Worker node. Unit: GiB.
         * <p>
         * 
         * Valid values: [40,500].
         * 
         * Default value: "120 ".
         */
        public Builder workerSystemDiskSize(Long workerSystemDiskSize) {
            this.putBodyParameter("worker_system_disk_size", workerSystemDiskSize);
            this.workerSystemDiskSize = workerSystemDiskSize;
            return this;
        }

        /**
         * The combination of the data disk type and size of the Worker node.
         */
        public Builder workerDataDisks(java.util.List < WorkerDataDisks> workerDataDisks) {
            this.putBodyParameter("worker_data_disks", workerDataDisks);
            this.workerDataDisks = workerDataDisks;
            return this;
        }

        /**
         * Whether the cloudmonitor plug-in is installed on the cluster. Valid values:
         * <p>
         * 
         * -"true": install the cloudmonitor plug-in.
         * -"false": the cloudmonitor plug-in is not installed.
         * 
         * Default value: "false ".
         * 
         */
        public Builder cloudMonitorFlags(Boolean cloudMonitorFlags) {
            this.putBodyParameter("cloud_monitor_flags", cloudMonitorFlags);
            this.cloudMonitorFlags = cloudMonitorFlags;
            return this;
        }

        /**
         * The CPU management policy of the node. When the cluster version is 1.12.6 or later, the following two policies are supported:
         * <p>
         * 
         * -"static": Allows you to enhance CPU affinity and exclusiveness for pods with certain resource characteristics on nodes.
         * -"none": indicates that the existing default CPU affinity solution is enabled.
         * 
         * Default value: "none ".
         */
        public Builder cpuPolicy(String cpuPolicy) {
            this.putBodyParameter("cpu_policy", cpuPolicy);
            this.cpuPolicy = cpuPolicy;
            return this;
        }

        /**
         * The custom image of the node. The system image is used by default. If you select custom image, the default system image is replaced. For more information, see [custom image](~~ 146647 ~~).
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("image_id", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The custom data of the node pool. For more information, see [generate instance Custom Data](~~ 49121 ~~).
         */
        public Builder userData(String userData) {
            this.putBodyParameter("user_data", userData);
            this.userData = userData;
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
         * The tag of the node. Tag definition rules:
         * <p>
         * 
         * -A tag consists of case-sensitive key-value pairs. You can set up to 20 tags.
         * -The tag key cannot be repeated. It can be up to 64 characters in length. The tag value can be empty and can be up to 128 characters in length. The tag key and tag value cannot start with aliyun, acs:, https://, or http. For more information, see [Labels and Selectors](https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#syntax-and-character-set).
         */
        public Builder tags(java.util.List < Tag > tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * The taint information of the node. Taints and tolerance (Toleration) work together to prevent pods from being assigned to inappropriate nodes. For more information, see [taint-and-toleration](https://kubernetes.io/zh/docs/concepts/scheduling-eviction/taint-and-toleration/).
         */
        public Builder taints(java.util.List < Taint > taints) {
            this.putBodyParameter("taints", taints);
            this.taints = taints;
            return this;
        }

        /**
         * Container Runtime in the cluster.
         */
        public Builder runtime(Runtime runtime) {
            this.putBodyParameter("runtime", runtime);
            this.runtime = runtime;
            return this;
        }

        @Override
        public ScaleOutClusterRequest build() {
            return new ScaleOutClusterRequest(this);
        } 

    } 

    public static class WorkerDataDisks extends TeaModel {
        @NameInMap("category")
        private String category;

        @NameInMap("size")
        private String size;

        @NameInMap("encrypted")
        private String encrypted;

        @NameInMap("auto_snapshot_policy_id")
        private String autoSnapshotPolicyId;

        private WorkerDataDisks(Builder builder) {
            this.category = builder.category;
            this.size = builder.size;
            this.encrypted = builder.encrypted;
            this.autoSnapshotPolicyId = builder.autoSnapshotPolicyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkerDataDisks create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        /**
         * @return encrypted
         */
        public String getEncrypted() {
            return this.encrypted;
        }

        /**
         * @return autoSnapshotPolicyId
         */
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public static final class Builder {
            private String category; 
            private String size; 
            private String encrypted; 
            private String autoSnapshotPolicyId; 

            /**
             * The data disk type.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The size of the data disk. Valid values: 40 to 32767.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * Specifies whether to encrypt data disks. Valid values:
             * <p>
             * 
             * -"true": encrypts data disks.
             * -"false": The data disk is not encrypted.
             * 
             * Default value: "false ".
             */
            public Builder encrypted(String encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * Select the ID of the automatic snapshot policy. The disk is automatically backed up based on the snapshot policy.
             * <p>
             * 
             * Default value: NULL. Automatic backup is not performed.
             */
            public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
                this.autoSnapshotPolicyId = autoSnapshotPolicyId;
                return this;
            }

            public WorkerDataDisks build() {
                return new WorkerDataDisks(this);
            } 

        } 

    }
}
