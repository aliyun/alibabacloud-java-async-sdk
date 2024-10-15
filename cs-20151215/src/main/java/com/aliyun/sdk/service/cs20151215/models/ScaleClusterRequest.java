// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ScaleClusterRequest} extends {@link RequestModel}
 *
 * <p>ScaleClusterRequest</p>
 */
public class ScaleClusterRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cloud_monitor_flags")
    private Boolean cloudMonitorFlags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("count")
    private Long count;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cpu_policy")
    private String cpuPolicy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("disable_rollback")
    private Boolean disableRollback;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("key_pair")
    private String keyPair;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("login_password")
    private String loginPassword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List < Tags> tags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taints")
    private java.util.List < Taints> taints;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("vswitch_ids")
    private java.util.List < String > vswitchIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("worker_auto_renew")
    private Boolean workerAutoRenew;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("worker_auto_renew_period")
    private Long workerAutoRenewPeriod;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("worker_data_disk")
    private Boolean workerDataDisk;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("worker_data_disks")
    private java.util.List < WorkerDataDisks> workerDataDisks;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("worker_instance_charge_type")
    private String workerInstanceChargeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("worker_instance_types")
    private java.util.List < String > workerInstanceTypes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("worker_period")
    private Long workerPeriod;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("worker_period_unit")
    private String workerPeriodUnit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("worker_system_disk_category")
    private String workerSystemDiskCategory;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("worker_system_disk_size")
    private Long workerSystemDiskSize;

    private ScaleClusterRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.cloudMonitorFlags = builder.cloudMonitorFlags;
        this.count = builder.count;
        this.cpuPolicy = builder.cpuPolicy;
        this.disableRollback = builder.disableRollback;
        this.keyPair = builder.keyPair;
        this.loginPassword = builder.loginPassword;
        this.tags = builder.tags;
        this.taints = builder.taints;
        this.vswitchIds = builder.vswitchIds;
        this.workerAutoRenew = builder.workerAutoRenew;
        this.workerAutoRenewPeriod = builder.workerAutoRenewPeriod;
        this.workerDataDisk = builder.workerDataDisk;
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

    public static ScaleClusterRequest create() {
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
     * @return disableRollback
     */
    public Boolean getDisableRollback() {
        return this.disableRollback;
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
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    /**
     * @return taints
     */
    public java.util.List < Taints> getTaints() {
        return this.taints;
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
     * @return workerDataDisk
     */
    public Boolean getWorkerDataDisk() {
        return this.workerDataDisk;
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

    public static final class Builder extends Request.Builder<ScaleClusterRequest, Builder> {
        private String clusterId; 
        private Boolean cloudMonitorFlags; 
        private Long count; 
        private String cpuPolicy; 
        private Boolean disableRollback; 
        private String keyPair; 
        private String loginPassword; 
        private java.util.List < Tags> tags; 
        private java.util.List < Taints> taints; 
        private java.util.List < String > vswitchIds; 
        private Boolean workerAutoRenew; 
        private Long workerAutoRenewPeriod; 
        private Boolean workerDataDisk; 
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

        private Builder(ScaleClusterRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.cloudMonitorFlags = request.cloudMonitorFlags;
            this.count = request.count;
            this.cpuPolicy = request.cpuPolicy;
            this.disableRollback = request.disableRollback;
            this.keyPair = request.keyPair;
            this.loginPassword = request.loginPassword;
            this.tags = request.tags;
            this.taints = request.taints;
            this.vswitchIds = request.vswitchIds;
            this.workerAutoRenew = request.workerAutoRenew;
            this.workerAutoRenewPeriod = request.workerAutoRenewPeriod;
            this.workerDataDisk = request.workerDataDisk;
            this.workerDataDisks = request.workerDataDisks;
            this.workerInstanceChargeType = request.workerInstanceChargeType;
            this.workerInstanceTypes = request.workerInstanceTypes;
            this.workerPeriod = request.workerPeriod;
            this.workerPeriodUnit = request.workerPeriodUnit;
            this.workerSystemDiskCategory = request.workerSystemDiskCategory;
            this.workerSystemDiskSize = request.workerSystemDiskSize;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * cloud_monitor_flags.
         */
        public Builder cloudMonitorFlags(Boolean cloudMonitorFlags) {
            this.putBodyParameter("cloud_monitor_flags", cloudMonitorFlags);
            this.cloudMonitorFlags = cloudMonitorFlags;
            return this;
        }

        /**
         * count.
         */
        public Builder count(Long count) {
            this.putBodyParameter("count", count);
            this.count = count;
            return this;
        }

        /**
         * cpu_policy.
         */
        public Builder cpuPolicy(String cpuPolicy) {
            this.putBodyParameter("cpu_policy", cpuPolicy);
            this.cpuPolicy = cpuPolicy;
            return this;
        }

        /**
         * disable_rollback.
         */
        public Builder disableRollback(Boolean disableRollback) {
            this.putBodyParameter("disable_rollback", disableRollback);
            this.disableRollback = disableRollback;
            return this;
        }

        /**
         * key_pair.
         */
        public Builder keyPair(String keyPair) {
            this.putBodyParameter("key_pair", keyPair);
            this.keyPair = keyPair;
            return this;
        }

        /**
         * login_password.
         */
        public Builder loginPassword(String loginPassword) {
            this.putBodyParameter("login_password", loginPassword);
            this.loginPassword = loginPassword;
            return this;
        }

        /**
         * tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * taints.
         */
        public Builder taints(java.util.List < Taints> taints) {
            this.putBodyParameter("taints", taints);
            this.taints = taints;
            return this;
        }

        /**
         * vswitch_ids.
         */
        public Builder vswitchIds(java.util.List < String > vswitchIds) {
            this.putBodyParameter("vswitch_ids", vswitchIds);
            this.vswitchIds = vswitchIds;
            return this;
        }

        /**
         * worker_auto_renew.
         */
        public Builder workerAutoRenew(Boolean workerAutoRenew) {
            this.putBodyParameter("worker_auto_renew", workerAutoRenew);
            this.workerAutoRenew = workerAutoRenew;
            return this;
        }

        /**
         * worker_auto_renew_period.
         */
        public Builder workerAutoRenewPeriod(Long workerAutoRenewPeriod) {
            this.putBodyParameter("worker_auto_renew_period", workerAutoRenewPeriod);
            this.workerAutoRenewPeriod = workerAutoRenewPeriod;
            return this;
        }

        /**
         * worker_data_disk.
         */
        public Builder workerDataDisk(Boolean workerDataDisk) {
            this.putBodyParameter("worker_data_disk", workerDataDisk);
            this.workerDataDisk = workerDataDisk;
            return this;
        }

        /**
         * worker_data_disks.
         */
        public Builder workerDataDisks(java.util.List < WorkerDataDisks> workerDataDisks) {
            this.putBodyParameter("worker_data_disks", workerDataDisks);
            this.workerDataDisks = workerDataDisks;
            return this;
        }

        /**
         * worker_instance_charge_type.
         */
        public Builder workerInstanceChargeType(String workerInstanceChargeType) {
            this.putBodyParameter("worker_instance_charge_type", workerInstanceChargeType);
            this.workerInstanceChargeType = workerInstanceChargeType;
            return this;
        }

        /**
         * worker_instance_types.
         */
        public Builder workerInstanceTypes(java.util.List < String > workerInstanceTypes) {
            this.putBodyParameter("worker_instance_types", workerInstanceTypes);
            this.workerInstanceTypes = workerInstanceTypes;
            return this;
        }

        /**
         * worker_period.
         */
        public Builder workerPeriod(Long workerPeriod) {
            this.putBodyParameter("worker_period", workerPeriod);
            this.workerPeriod = workerPeriod;
            return this;
        }

        /**
         * worker_period_unit.
         */
        public Builder workerPeriodUnit(String workerPeriodUnit) {
            this.putBodyParameter("worker_period_unit", workerPeriodUnit);
            this.workerPeriodUnit = workerPeriodUnit;
            return this;
        }

        /**
         * worker_system_disk_category.
         */
        public Builder workerSystemDiskCategory(String workerSystemDiskCategory) {
            this.putBodyParameter("worker_system_disk_category", workerSystemDiskCategory);
            this.workerSystemDiskCategory = workerSystemDiskCategory;
            return this;
        }

        /**
         * worker_system_disk_size.
         */
        public Builder workerSystemDiskSize(Long workerSystemDiskSize) {
            this.putBodyParameter("worker_system_disk_size", workerSystemDiskSize);
            this.workerSystemDiskSize = workerSystemDiskSize;
            return this;
        }

        @Override
        public ScaleClusterRequest build() {
            return new ScaleClusterRequest(this);
        } 

    } 

    /**
     * 
     * {@link ScaleClusterRequest} extends {@link TeaModel}
     *
     * <p>ScaleClusterRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        private Tags(Builder builder) {
            this.key = builder.key;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        public static final class Builder {
            private String key; 

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ScaleClusterRequest} extends {@link TeaModel}
     *
     * <p>ScaleClusterRequest</p>
     */
    public static class Taints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("effect")
        private String effect;

        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Taints(Builder builder) {
            this.effect = builder.effect;
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Taints create() {
            return builder().build();
        }

        /**
         * @return effect
         */
        public String getEffect() {
            return this.effect;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String effect; 
            private String key; 
            private String value; 

            /**
             * effect.
             */
            public Builder effect(String effect) {
                this.effect = effect;
                return this;
            }

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Taints build() {
                return new Taints(this);
            } 

        } 

    }
    /**
     * 
     * {@link ScaleClusterRequest} extends {@link TeaModel}
     *
     * <p>ScaleClusterRequest</p>
     */
    public static class WorkerDataDisks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("encrypted")
        private String encrypted;

        @com.aliyun.core.annotation.NameInMap("size")
        private String size;

        private WorkerDataDisks(Builder builder) {
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
            private String category; 
            private String encrypted; 
            private String size; 

            /**
             * category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * encrypted.
             */
            public Builder encrypted(String encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * size.
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
