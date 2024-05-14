// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAutoScalingConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyAutoScalingConfigRequest</p>
 */
public class ModifyAutoScalingConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private Bandwidth bandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resource")
    private Resource resource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Shard")
    private Shard shard;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Spec")
    private Spec spec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Storage")
    private Storage storage;

    private ModifyAutoScalingConfigRequest(Builder builder) {
        super(builder);
        this.bandwidth = builder.bandwidth;
        this.instanceId = builder.instanceId;
        this.resource = builder.resource;
        this.shard = builder.shard;
        this.spec = builder.spec;
        this.storage = builder.storage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAutoScalingConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bandwidth
     */
    public Bandwidth getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return resource
     */
    public Resource getResource() {
        return this.resource;
    }

    /**
     * @return shard
     */
    public Shard getShard() {
        return this.shard;
    }

    /**
     * @return spec
     */
    public Spec getSpec() {
        return this.spec;
    }

    /**
     * @return storage
     */
    public Storage getStorage() {
        return this.storage;
    }

    public static final class Builder extends Request.Builder<ModifyAutoScalingConfigRequest, Builder> {
        private Bandwidth bandwidth; 
        private String instanceId; 
        private Resource resource; 
        private Shard shard; 
        private Spec spec; 
        private Storage storage; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAutoScalingConfigRequest request) {
            super(request);
            this.bandwidth = request.bandwidth;
            this.instanceId = request.instanceId;
            this.resource = request.resource;
            this.shard = request.shard;
            this.spec = request.spec;
            this.storage = request.storage;
        } 

        /**
         * The configuration item of the automatic bandwidth adjustment feature.
         */
        public Builder bandwidth(Bandwidth bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The configuration item of the auto scaling feature for resources.
         */
        public Builder resource(Resource resource) {
            this.putQueryParameter("Resource", resource);
            this.resource = resource;
            return this;
        }

        /**
         * The configuration item of the auto scaling feature for shards.
         */
        public Builder shard(Shard shard) {
            this.putQueryParameter("Shard", shard);
            this.shard = shard;
            return this;
        }

        /**
         * The configuration item of the auto scaling feature for specifications.
         */
        public Builder spec(Spec spec) {
            this.putQueryParameter("Spec", spec);
            this.spec = spec;
            return this;
        }

        /**
         * The configuration item of the automatic storage expansion feature.
         */
        public Builder storage(Storage storage) {
            this.putQueryParameter("Storage", storage);
            this.storage = storage;
            return this;
        }

        @Override
        public ModifyAutoScalingConfigRequest build() {
            return new ModifyAutoScalingConfigRequest(this);
        } 

    } 

    public static class Bandwidth extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Apply")
        private Boolean apply;

        @com.aliyun.core.annotation.NameInMap("BandwidthUsageLowerThreshold")
        @com.aliyun.core.annotation.Validation(maximum = 70, minimum = 10)
        private Integer bandwidthUsageLowerThreshold;

        @com.aliyun.core.annotation.NameInMap("BandwidthUsageUpperThreshold")
        @com.aliyun.core.annotation.Validation(maximum = 95, minimum = 50)
        private Integer bandwidthUsageUpperThreshold;

        @com.aliyun.core.annotation.NameInMap("Downgrade")
        private Boolean downgrade;

        @com.aliyun.core.annotation.NameInMap("ObservationWindowSize")
        private String observationWindowSize;

        @com.aliyun.core.annotation.NameInMap("Upgrade")
        private Boolean upgrade;

        private Bandwidth(Builder builder) {
            this.apply = builder.apply;
            this.bandwidthUsageLowerThreshold = builder.bandwidthUsageLowerThreshold;
            this.bandwidthUsageUpperThreshold = builder.bandwidthUsageUpperThreshold;
            this.downgrade = builder.downgrade;
            this.observationWindowSize = builder.observationWindowSize;
            this.upgrade = builder.upgrade;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Bandwidth create() {
            return builder().build();
        }

        /**
         * @return apply
         */
        public Boolean getApply() {
            return this.apply;
        }

        /**
         * @return bandwidthUsageLowerThreshold
         */
        public Integer getBandwidthUsageLowerThreshold() {
            return this.bandwidthUsageLowerThreshold;
        }

        /**
         * @return bandwidthUsageUpperThreshold
         */
        public Integer getBandwidthUsageUpperThreshold() {
            return this.bandwidthUsageUpperThreshold;
        }

        /**
         * @return downgrade
         */
        public Boolean getDowngrade() {
            return this.downgrade;
        }

        /**
         * @return observationWindowSize
         */
        public String getObservationWindowSize() {
            return this.observationWindowSize;
        }

        /**
         * @return upgrade
         */
        public Boolean getUpgrade() {
            return this.upgrade;
        }

        public static final class Builder {
            private Boolean apply; 
            private Integer bandwidthUsageLowerThreshold; 
            private Integer bandwidthUsageUpperThreshold; 
            private Boolean downgrade; 
            private String observationWindowSize; 
            private Boolean upgrade; 

            /**
             * Specifies whether to apply the **Bandwidth** configuration of the automatic bandwidth adjustment feature. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder apply(Boolean apply) {
                this.apply = apply;
                return this;
            }

            /**
             * The average bandwidth usage threshold that triggers automatic bandwidth downgrade. Unit: %. Valid values:
             * <p>
             * 
             * *   **10**
             * *   **20**
             * *   **30**
             */
            public Builder bandwidthUsageLowerThreshold(Integer bandwidthUsageLowerThreshold) {
                this.bandwidthUsageLowerThreshold = bandwidthUsageLowerThreshold;
                return this;
            }

            /**
             * The average bandwidth usage threshold that triggers automatic bandwidth upgrade. Unit: %. Valid values:
             * <p>
             * 
             * *   **50**
             * *   **60**
             * *   **70**
             * *   **80**
             * *   **90**
             * *   **95**
             */
            public Builder bandwidthUsageUpperThreshold(Integer bandwidthUsageUpperThreshold) {
                this.bandwidthUsageUpperThreshold = bandwidthUsageUpperThreshold;
                return this;
            }

            /**
             * Specifies whether to enable the automatic bandwidth downgrade feature. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder downgrade(Boolean downgrade) {
                this.downgrade = downgrade;
                return this;
            }

            /**
             * The observation window of the automatic bandwidth adjustment feature. The value of this parameter consists of a numeric value and a time unit suffix. The **m** time unit suffix specifies the minute. Valid values:
             * <p>
             * 
             * *   **1m**
             * *   **5m**
             * *   **10m**
             * *   **15m**
             * *   **30m**
             */
            public Builder observationWindowSize(String observationWindowSize) {
                this.observationWindowSize = observationWindowSize;
                return this;
            }

            /**
             * Specifies whether to enable the automatic bandwidth upgrade feature. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder upgrade(Boolean upgrade) {
                this.upgrade = upgrade;
                return this;
            }

            public Bandwidth build() {
                return new Bandwidth(this);
            } 

        } 

    }
    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Apply")
        private Boolean apply;

        @com.aliyun.core.annotation.NameInMap("CpuUsageUpperThreshold")
        private Integer cpuUsageUpperThreshold;

        @com.aliyun.core.annotation.NameInMap("DowngradeObservationWindowSize")
        private String downgradeObservationWindowSize;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("UpgradeObservationWindowSize")
        private String upgradeObservationWindowSize;

        private Resource(Builder builder) {
            this.apply = builder.apply;
            this.cpuUsageUpperThreshold = builder.cpuUsageUpperThreshold;
            this.downgradeObservationWindowSize = builder.downgradeObservationWindowSize;
            this.enable = builder.enable;
            this.upgradeObservationWindowSize = builder.upgradeObservationWindowSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resource create() {
            return builder().build();
        }

        /**
         * @return apply
         */
        public Boolean getApply() {
            return this.apply;
        }

        /**
         * @return cpuUsageUpperThreshold
         */
        public Integer getCpuUsageUpperThreshold() {
            return this.cpuUsageUpperThreshold;
        }

        /**
         * @return downgradeObservationWindowSize
         */
        public String getDowngradeObservationWindowSize() {
            return this.downgradeObservationWindowSize;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return upgradeObservationWindowSize
         */
        public String getUpgradeObservationWindowSize() {
            return this.upgradeObservationWindowSize;
        }

        public static final class Builder {
            private Boolean apply; 
            private Integer cpuUsageUpperThreshold; 
            private String downgradeObservationWindowSize; 
            private Boolean enable; 
            private String upgradeObservationWindowSize; 

            /**
             * Specifies whether to apply the **Resource** configuration of the auto scaling feature for resources. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder apply(Boolean apply) {
                this.apply = apply;
                return this;
            }

            /**
             * The average CPU utilization threshold that triggers automatic scale-out of resources. Unit: %. Valid values:
             * <p>
             * 
             * *   **70**
             * *   **80**
             * *   **90**
             */
            public Builder cpuUsageUpperThreshold(Integer cpuUsageUpperThreshold) {
                this.cpuUsageUpperThreshold = cpuUsageUpperThreshold;
                return this;
            }

            /**
             * The observation window of the automatic resource scale-in feature. The value of this parameter consists of a numeric value and a time unit suffix. The **m** time unit suffix specifies the minute. Valid values:
             * <p>
             * 
             * *   **1m**
             * *   **3m**
             * *   **5m**
             * *   **10m**
             * *   **20m**
             * *   **30m**
             */
            public Builder downgradeObservationWindowSize(String downgradeObservationWindowSize) {
                this.downgradeObservationWindowSize = downgradeObservationWindowSize;
                return this;
            }

            /**
             * Specifies whether to enable the auto scaling feature for resources. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * The observation window of the automatic resource scale-out feature. The value of this parameter consists of a numeric value and a time unit suffix. The **m** time unit suffix specifies the minute. Valid values:
             * <p>
             * 
             * *   **1m**
             * *   **3m**
             * *   **5m**
             * *   **10m**
             * *   **20m**
             * *   **30m**
             */
            public Builder upgradeObservationWindowSize(String upgradeObservationWindowSize) {
                this.upgradeObservationWindowSize = upgradeObservationWindowSize;
                return this;
            }

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
    public static class Shard extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Apply")
        private Boolean apply;

        @com.aliyun.core.annotation.NameInMap("Downgrade")
        private Boolean downgrade;

        @com.aliyun.core.annotation.NameInMap("DowngradeObservationWindowSize")
        private String downgradeObservationWindowSize;

        @com.aliyun.core.annotation.NameInMap("MaxShards")
        @com.aliyun.core.annotation.Validation(maximum = 64, minimum = 2)
        private Integer maxShards;

        @com.aliyun.core.annotation.NameInMap("MemUsageLowerThreshold")
        private Integer memUsageLowerThreshold;

        @com.aliyun.core.annotation.NameInMap("MemUsageUpperThreshold")
        private Integer memUsageUpperThreshold;

        @com.aliyun.core.annotation.NameInMap("MinShards")
        @com.aliyun.core.annotation.Validation(maximum = 64, minimum = 2)
        private Integer minShards;

        @com.aliyun.core.annotation.NameInMap("Upgrade")
        private Boolean upgrade;

        @com.aliyun.core.annotation.NameInMap("UpgradeObservationWindowSize")
        private String upgradeObservationWindowSize;

        private Shard(Builder builder) {
            this.apply = builder.apply;
            this.downgrade = builder.downgrade;
            this.downgradeObservationWindowSize = builder.downgradeObservationWindowSize;
            this.maxShards = builder.maxShards;
            this.memUsageLowerThreshold = builder.memUsageLowerThreshold;
            this.memUsageUpperThreshold = builder.memUsageUpperThreshold;
            this.minShards = builder.minShards;
            this.upgrade = builder.upgrade;
            this.upgradeObservationWindowSize = builder.upgradeObservationWindowSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Shard create() {
            return builder().build();
        }

        /**
         * @return apply
         */
        public Boolean getApply() {
            return this.apply;
        }

        /**
         * @return downgrade
         */
        public Boolean getDowngrade() {
            return this.downgrade;
        }

        /**
         * @return downgradeObservationWindowSize
         */
        public String getDowngradeObservationWindowSize() {
            return this.downgradeObservationWindowSize;
        }

        /**
         * @return maxShards
         */
        public Integer getMaxShards() {
            return this.maxShards;
        }

        /**
         * @return memUsageLowerThreshold
         */
        public Integer getMemUsageLowerThreshold() {
            return this.memUsageLowerThreshold;
        }

        /**
         * @return memUsageUpperThreshold
         */
        public Integer getMemUsageUpperThreshold() {
            return this.memUsageUpperThreshold;
        }

        /**
         * @return minShards
         */
        public Integer getMinShards() {
            return this.minShards;
        }

        /**
         * @return upgrade
         */
        public Boolean getUpgrade() {
            return this.upgrade;
        }

        /**
         * @return upgradeObservationWindowSize
         */
        public String getUpgradeObservationWindowSize() {
            return this.upgradeObservationWindowSize;
        }

        public static final class Builder {
            private Boolean apply; 
            private Boolean downgrade; 
            private String downgradeObservationWindowSize; 
            private Integer maxShards; 
            private Integer memUsageLowerThreshold; 
            private Integer memUsageUpperThreshold; 
            private Integer minShards; 
            private Boolean upgrade; 
            private String upgradeObservationWindowSize; 

            /**
             * Specifies whether to apply the **Shard** configuration of the auto scaling feature for shards. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             * 
             * > The auto scaling feature for shards is available only for ApsaraDB for Redis Community Edition cloud-native instances on the China site (aliyun.com).
             */
            public Builder apply(Boolean apply) {
                this.apply = apply;
                return this;
            }

            /**
             * Specifies whether to enable the feature of automatically removing shards. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             * 
             * >  The feature of automatically removing shards is in canary release.
             */
            public Builder downgrade(Boolean downgrade) {
                this.downgrade = downgrade;
                return this;
            }

            /**
             * The observation window of the feature of automatically removing shards. The value of this parameter consists of a numeric value and a time unit suffix. The **h** time unit suffix specifies the hour. The **d** time unit suffix specifies the day. Valid values:
             * <p>
             * 
             * *   **1h**
             * *   **2h**
             * *   **3h**
             * *   **1d**
             * *   **7d**
             */
            public Builder downgradeObservationWindowSize(String downgradeObservationWindowSize) {
                this.downgradeObservationWindowSize = downgradeObservationWindowSize;
                return this;
            }

            /**
             * The maximum number of shards in the instance. The value must be a positive integer. Valid values: 4 to 32.
             */
            public Builder maxShards(Integer maxShards) {
                this.maxShards = maxShards;
                return this;
            }

            /**
             * The average memory usage threshold that triggers automatic removal of shards. Unit: %. Valid values:
             * <p>
             * 
             * *   **10**
             * *   **20**
             * *   **30**
             */
            public Builder memUsageLowerThreshold(Integer memUsageLowerThreshold) {
                this.memUsageLowerThreshold = memUsageLowerThreshold;
                return this;
            }

            /**
             * The average memory usage threshold that triggers automatic adding of shards. Unit: %. Valid values:
             * <p>
             * 
             * *   **50**
             * *   **60**
             * *   **70**
             * *   **80**
             * *   **90**
             */
            public Builder memUsageUpperThreshold(Integer memUsageUpperThreshold) {
                this.memUsageUpperThreshold = memUsageUpperThreshold;
                return this;
            }

            /**
             * The minimum number of shards in the instance. The value must be a positive integer. Valid values: 4 to 32.
             */
            public Builder minShards(Integer minShards) {
                this.minShards = minShards;
                return this;
            }

            /**
             * Specifies whether to enable the feature of automatically adding shards. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder upgrade(Boolean upgrade) {
                this.upgrade = upgrade;
                return this;
            }

            /**
             * The observation window of the feature of automatically adding shards. The value of this parameter consists of a numeric value and a time unit suffix. The **m** time unit suffix specifies the minute. Valid values:
             * <p>
             * 
             * *   **5m**
             * *   **10m**
             * *   **15m**
             * *   **30m**
             */
            public Builder upgradeObservationWindowSize(String upgradeObservationWindowSize) {
                this.upgradeObservationWindowSize = upgradeObservationWindowSize;
                return this;
            }

            public Shard build() {
                return new Shard(this);
            } 

        } 

    }
    public static class Spec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Apply")
        private Boolean apply;

        @com.aliyun.core.annotation.NameInMap("CoolDownTime")
        private String coolDownTime;

        @com.aliyun.core.annotation.NameInMap("CpuUsageUpperThreshold")
        private Integer cpuUsageUpperThreshold;

        @com.aliyun.core.annotation.NameInMap("Downgrade")
        private Boolean downgrade;

        @com.aliyun.core.annotation.NameInMap("MaxReadOnlyNodes")
        @com.aliyun.core.annotation.Validation(maximum = 15, minimum = 1)
        private Integer maxReadOnlyNodes;

        @com.aliyun.core.annotation.NameInMap("MaxSpec")
        private String maxSpec;

        @com.aliyun.core.annotation.NameInMap("MemUsageUpperThreshold")
        private Integer memUsageUpperThreshold;

        @com.aliyun.core.annotation.NameInMap("ObservationWindowSize")
        private String observationWindowSize;

        @com.aliyun.core.annotation.NameInMap("Upgrade")
        private Boolean upgrade;

        private Spec(Builder builder) {
            this.apply = builder.apply;
            this.coolDownTime = builder.coolDownTime;
            this.cpuUsageUpperThreshold = builder.cpuUsageUpperThreshold;
            this.downgrade = builder.downgrade;
            this.maxReadOnlyNodes = builder.maxReadOnlyNodes;
            this.maxSpec = builder.maxSpec;
            this.memUsageUpperThreshold = builder.memUsageUpperThreshold;
            this.observationWindowSize = builder.observationWindowSize;
            this.upgrade = builder.upgrade;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Spec create() {
            return builder().build();
        }

        /**
         * @return apply
         */
        public Boolean getApply() {
            return this.apply;
        }

        /**
         * @return coolDownTime
         */
        public String getCoolDownTime() {
            return this.coolDownTime;
        }

        /**
         * @return cpuUsageUpperThreshold
         */
        public Integer getCpuUsageUpperThreshold() {
            return this.cpuUsageUpperThreshold;
        }

        /**
         * @return downgrade
         */
        public Boolean getDowngrade() {
            return this.downgrade;
        }

        /**
         * @return maxReadOnlyNodes
         */
        public Integer getMaxReadOnlyNodes() {
            return this.maxReadOnlyNodes;
        }

        /**
         * @return maxSpec
         */
        public String getMaxSpec() {
            return this.maxSpec;
        }

        /**
         * @return memUsageUpperThreshold
         */
        public Integer getMemUsageUpperThreshold() {
            return this.memUsageUpperThreshold;
        }

        /**
         * @return observationWindowSize
         */
        public String getObservationWindowSize() {
            return this.observationWindowSize;
        }

        /**
         * @return upgrade
         */
        public Boolean getUpgrade() {
            return this.upgrade;
        }

        public static final class Builder {
            private Boolean apply; 
            private String coolDownTime; 
            private Integer cpuUsageUpperThreshold; 
            private Boolean downgrade; 
            private Integer maxReadOnlyNodes; 
            private String maxSpec; 
            private Integer memUsageUpperThreshold; 
            private String observationWindowSize; 
            private Boolean upgrade; 

            /**
             * Specifies whether to apply the **Spec** configuration of the auto scaling feature for specifications. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder apply(Boolean apply) {
                this.apply = apply;
                return this;
            }

            /**
             * The quiescent period. The value of this parameter consists of a numeric value and a time unit suffix. The **m** time unit suffix specifies the minute, the **h** time unit suffix specifies the hour, and the **d** time suffix unit specifies the day.
             * <p>
             * 
             * *   Valid values for PolarDB for MySQL Cluster Edition instances: **5m**, **10m**, **30m**, **1h**, **2h**, **3h**, **1d**, and **7d**.
             * *   Valid values for ApsaraDB RDS for MySQL High-availability Edition instances that use standard SSDs or ESSDs: **5m**, **10m**, **30m**, **1h**, **2h**, **3h**, **1d**, and **7d**.
             */
            public Builder coolDownTime(String coolDownTime) {
                this.coolDownTime = coolDownTime;
                return this;
            }

            /**
             * The average CPU utilization threshold that triggers automatic specification scale-up. Unit: %. Valid values:
             * <p>
             * 
             * *   **50**
             * *   **60**
             * *   **70**
             * *   **80**
             * *   **90**
             * 
             * > This parameter must be specified if the database instance is a PolarDB for MySQL Cluster Edition instance or an ApsaraDB RDS for MySQL High-availability Edition instance that uses standard SSDs or ESSDs.
             */
            public Builder cpuUsageUpperThreshold(Integer cpuUsageUpperThreshold) {
                this.cpuUsageUpperThreshold = cpuUsageUpperThreshold;
                return this;
            }

            /**
             * Specifies whether to enable the automatic specification scale-down feature. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             * 
             * > This parameter must be specified if the database instance is a PolarDB for MySQL Cluster Edition instance or an ApsaraDB RDS for MySQL High-availability Edition instance that uses standard SSDs or ESSDs.
             */
            public Builder downgrade(Boolean downgrade) {
                this.downgrade = downgrade;
                return this;
            }

            /**
             * The maximum number of read-only nodes of the instance.
             * <p>
             * 
             * > This parameter must be specified if the database instance is a PolarDB for MySQL Cluster Edition instance.
             */
            public Builder maxReadOnlyNodes(Integer maxReadOnlyNodes) {
                this.maxReadOnlyNodes = maxReadOnlyNodes;
                return this;
            }

            /**
             * The maximum specifications to which the database instance can be scaled up. The database instance can be upgraded only to a database instance of the same edition with higher specifications. For information about the specifications of different database instances, see the following topics:
             * <p>
             * 
             * *   PolarDB for MySQL Cluster Edition instances: [Specifications of compute nodes](~~102542~~)
             * *   ApsaraDB RDS for MySQL High-availability Edition instances that use standard SSDs or ESSDs: [Specifications](~~276974~~)
             */
            public Builder maxSpec(String maxSpec) {
                this.maxSpec = maxSpec;
                return this;
            }

            /**
             * The average memory usage threshold that triggers automatic specification scale-up. Unit: %. Valid values:
             * <p>
             * 
             * *   **50**
             * *   **60**
             * *   **70**
             * *   **80**
             * *   **90**
             * 
             * > This parameter must be specified if the database instance is an ApsaraDB for Redis Community Edition cloud-native instance on the China site (aliyun.com).
             */
            public Builder memUsageUpperThreshold(Integer memUsageUpperThreshold) {
                this.memUsageUpperThreshold = memUsageUpperThreshold;
                return this;
            }

            /**
             * The observation window. The value of this parameter consists of a numeric value and a time unit suffix. The **m** time unit suffix specifies the minute and the **h** time unit suffix specifies the hour.
             * <p>
             * 
             * *   Valid values for PolarDB for MySQL Cluster Edition instances: **5m**, **10m**, **15m**, and **30m**.
             * *   Valid values for ApsaraDB RDS for MySQL High-availability Edition instances that use standard SSDs or ESSDs: **5m**, **20m**, **30m**, **40m**, and **1h**.
             * *   Valid values for ApsaraDB for Redis Community Edition cloud-native instances: **5m**, **10m**, **15m**, and **30m**.
             */
            public Builder observationWindowSize(String observationWindowSize) {
                this.observationWindowSize = observationWindowSize;
                return this;
            }

            /**
             * Specifies whether to enable the automatic specification scale-up feature. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder upgrade(Boolean upgrade) {
                this.upgrade = upgrade;
                return this;
            }

            public Spec build() {
                return new Spec(this);
            } 

        } 

    }
    public static class Storage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Apply")
        private Boolean apply;

        @com.aliyun.core.annotation.NameInMap("DiskUsageUpperThreshold")
        private Integer diskUsageUpperThreshold;

        @com.aliyun.core.annotation.NameInMap("MaxStorage")
        @com.aliyun.core.annotation.Validation(maximum = 32000, minimum = 20)
        private Integer maxStorage;

        @com.aliyun.core.annotation.NameInMap("Upgrade")
        private Boolean upgrade;

        private Storage(Builder builder) {
            this.apply = builder.apply;
            this.diskUsageUpperThreshold = builder.diskUsageUpperThreshold;
            this.maxStorage = builder.maxStorage;
            this.upgrade = builder.upgrade;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Storage create() {
            return builder().build();
        }

        /**
         * @return apply
         */
        public Boolean getApply() {
            return this.apply;
        }

        /**
         * @return diskUsageUpperThreshold
         */
        public Integer getDiskUsageUpperThreshold() {
            return this.diskUsageUpperThreshold;
        }

        /**
         * @return maxStorage
         */
        public Integer getMaxStorage() {
            return this.maxStorage;
        }

        /**
         * @return upgrade
         */
        public Boolean getUpgrade() {
            return this.upgrade;
        }

        public static final class Builder {
            private Boolean apply; 
            private Integer diskUsageUpperThreshold; 
            private Integer maxStorage; 
            private Boolean upgrade; 

            /**
             * Specifies whether to apply the **Storage** configuration of the automatic storage expansion feature. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder apply(Boolean apply) {
                this.apply = apply;
                return this;
            }

            /**
             * The average storage usage threshold that triggers automatic storage expansion. Unit: %. Valid values:
             * <p>
             * 
             * *   **50**
             * *   **60**
             * *   **70**
             * *   **80**
             * *   **90**
             */
            public Builder diskUsageUpperThreshold(Integer diskUsageUpperThreshold) {
                this.diskUsageUpperThreshold = diskUsageUpperThreshold;
                return this;
            }

            /**
             * The maximum storage size of the database instance. The value must be greater than or equal to the total storage size of the instance. Valid values of different types of instances:
             * <p>
             * 
             * *   If the ApsaraDB for RDS instance uses ESSDs, the value of this parameter can be set to 32000, in GB.
             * *   If the ApsaraDB for RDS instance uses standard SSDs, the value of this parameter can be set to 6000, in GB.
             * 
             * >  The ApsaraDB RDS for MySQL instances that use standard SSDs are discontinued. We recommend that you [upgrade the storage type of an ApsaraDB RDS for MySQL instance from standard SSDs to ESSDs](~~314678~~).
             */
            public Builder maxStorage(Integer maxStorage) {
                this.maxStorage = maxStorage;
                return this;
            }

            /**
             * Specifies whether to enable the automatic storage expansion feature. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder upgrade(Boolean upgrade) {
                this.upgrade = upgrade;
                return this;
            }

            public Storage build() {
                return new Storage(this);
            } 

        } 

    }
}
