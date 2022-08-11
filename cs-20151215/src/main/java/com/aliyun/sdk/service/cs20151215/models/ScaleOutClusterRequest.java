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
    @NameInMap("cloud_monitor_flags")
    private Boolean cloudMonitorFlags;

    @Body
    @NameInMap("count")
    @Validation(required = true)
    private Long count;

    @Body
    @NameInMap("cpu_policy")
    private String cpuPolicy;

    @Body
    @NameInMap("image_id")
    private String imageId;

    @Body
    @NameInMap("key_pair")
    @Validation(required = true)
    private String keyPair;

    @Body
    @NameInMap("login_password")
    @Validation(required = true)
    private String loginPassword;

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
    @NameInMap("taints")
    private java.util.List < Taint > taints;

    @Body
    @NameInMap("user_data")
    private String userData;

    @Body
    @NameInMap("vswitch_ids")
    @Validation(required = true)
    private java.util.List < String > vswitchIds;

    @Body
    @NameInMap("worker_auto_renew")
    private Boolean workerAutoRenew;

    @Body
    @NameInMap("worker_auto_renew_period")
    private Long workerAutoRenewPeriod;

    @Body
    @NameInMap("worker_data_disks")
    private java.util.List < WorkerDataDisks> workerDataDisks;

    @Body
    @NameInMap("worker_instance_charge_type")
    private String workerInstanceChargeType;

    @Body
    @NameInMap("worker_instance_types")
    @Validation(required = true)
    private java.util.List < String > workerInstanceTypes;

    @Body
    @NameInMap("worker_period")
    private Long workerPeriod;

    @Body
    @NameInMap("worker_period_unit")
    private String workerPeriodUnit;

    @Body
    @NameInMap("worker_system_disk_category")
    @Validation(required = true)
    private String workerSystemDiskCategory;

    @Body
    @NameInMap("worker_system_disk_size")
    @Validation(required = true)
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
         * 扩容目标集群的集群ID。
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 在节点上安装云监控
         */
        public Builder cloudMonitorFlags(Boolean cloudMonitorFlags) {
            this.putBodyParameter("cloud_monitor_flags", cloudMonitorFlags);
            this.cloudMonitorFlags = cloudMonitorFlags;
            return this;
        }

        /**
         * 扩容节点数
         */
        public Builder count(Long count) {
            this.putBodyParameter("count", count);
            this.count = count;
            return this;
        }

        /**
         * CPU亲和性策略
         */
        public Builder cpuPolicy(String cpuPolicy) {
            this.putBodyParameter("cpu_policy", cpuPolicy);
            this.cpuPolicy = cpuPolicy;
            return this;
        }

        /**
         * 自定义镜像
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("image_id", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * keypair名称，和login_password二选一。
         */
        public Builder keyPair(String keyPair) {
            this.putBodyParameter("key_pair", keyPair);
            this.keyPair = keyPair;
            return this;
        }

        /**
         * SSH登录密码，和key_pair二选一。
         */
        public Builder loginPassword(String loginPassword) {
            this.putBodyParameter("login_password", loginPassword);
            this.loginPassword = loginPassword;
            return this;
        }

        /**
         * RDS白名单
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
         * 节点标签
         */
        public Builder tags(java.util.List < Tag > tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * 节点污点信息
         */
        public Builder taints(java.util.List < Taint > taints) {
            this.putBodyParameter("taints", taints);
            this.taints = taints;
            return this;
        }

        /**
         * 节点自定义数据
         */
        public Builder userData(String userData) {
            this.putBodyParameter("user_data", userData);
            this.userData = userData;
            return this;
        }

        /**
         * 虚拟交换机
         */
        public Builder vswitchIds(java.util.List < String > vswitchIds) {
            this.putBodyParameter("vswitch_ids", vswitchIds);
            this.vswitchIds = vswitchIds;
            return this;
        }

        /**
         * Worker节点到期是否自动续费
         */
        public Builder workerAutoRenew(Boolean workerAutoRenew) {
            this.putBodyParameter("worker_auto_renew", workerAutoRenew);
            this.workerAutoRenew = workerAutoRenew;
            return this;
        }

        /**
         * Worker节点自动续费时长
         */
        public Builder workerAutoRenewPeriod(Long workerAutoRenewPeriod) {
            this.putBodyParameter("worker_auto_renew_period", workerAutoRenewPeriod);
            this.workerAutoRenewPeriod = workerAutoRenewPeriod;
            return this;
        }

        /**
         * Worker节点数据盘配置
         */
        public Builder workerDataDisks(java.util.List < WorkerDataDisks> workerDataDisks) {
            this.putBodyParameter("worker_data_disks", workerDataDisks);
            this.workerDataDisks = workerDataDisks;
            return this;
        }

        /**
         * Worker节点付费类型
         */
        public Builder workerInstanceChargeType(String workerInstanceChargeType) {
            this.putBodyParameter("worker_instance_charge_type", workerInstanceChargeType);
            this.workerInstanceChargeType = workerInstanceChargeType;
            return this;
        }

        /**
         * Worker节点实例规格
         */
        public Builder workerInstanceTypes(java.util.List < String > workerInstanceTypes) {
            this.putBodyParameter("worker_instance_types", workerInstanceTypes);
            this.workerInstanceTypes = workerInstanceTypes;
            return this;
        }

        /**
         * Worker节点包年包月时长
         */
        public Builder workerPeriod(Long workerPeriod) {
            this.putBodyParameter("worker_period", workerPeriod);
            this.workerPeriod = workerPeriod;
            return this;
        }

        /**
         * Worker节点包年包月周期
         */
        public Builder workerPeriodUnit(String workerPeriodUnit) {
            this.putBodyParameter("worker_period_unit", workerPeriodUnit);
            this.workerPeriodUnit = workerPeriodUnit;
            return this;
        }

        /**
         * Worker节点系统盘类型
         */
        public Builder workerSystemDiskCategory(String workerSystemDiskCategory) {
            this.putBodyParameter("worker_system_disk_category", workerSystemDiskCategory);
            this.workerSystemDiskCategory = workerSystemDiskCategory;
            return this;
        }

        /**
         * Worker节点系统盘大小
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

    public static class WorkerDataDisks extends TeaModel {
        @NameInMap("auto_snapshot_policy_id")
        private String autoSnapshotPolicyId;

        @NameInMap("category")
        private String category;

        @NameInMap("encrypted")
        private String encrypted;

        @NameInMap("size")
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
             * 自动快照策略ID，云盘会按照快照策略自动备份。
             */
            public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
                this.autoSnapshotPolicyId = autoSnapshotPolicyId;
                return this;
            }

            /**
             * 数据盘类型,默认值：cloud_efficiency
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * 是否对数据盘加密
             */
            public Builder encrypted(String encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * 数据盘大小，单位为GiB。  取值范围：[40,32768]
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
