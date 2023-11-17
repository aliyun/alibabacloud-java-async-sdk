// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAutoScalingConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAutoScalingConfigResponseBody</p>
 */
public class DescribeAutoScalingConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    private DescribeAutoScalingConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAutoScalingConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * The HTTP status code returned.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The configurations of the auto scaling feature.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         * <p>
         * 
         * >  If the request was successful, **Successful** is returned. If the request failed, an error message such as an error code is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeAutoScalingConfigResponseBody build() {
            return new DescribeAutoScalingConfigResponseBody(this);
        } 

    } 

    public static class Bandwidth extends TeaModel {
        @NameInMap("BandwidthUsageLowerThreshold")
        private Integer bandwidthUsageLowerThreshold;

        @NameInMap("BandwidthUsageUpperThreshold")
        private Integer bandwidthUsageUpperThreshold;

        @NameInMap("Downgrade")
        private Boolean downgrade;

        @NameInMap("ObservationWindowSize")
        private String observationWindowSize;

        @NameInMap("Upgrade")
        private Boolean upgrade;

        private Bandwidth(Builder builder) {
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
            private Integer bandwidthUsageLowerThreshold; 
            private Integer bandwidthUsageUpperThreshold; 
            private Boolean downgrade; 
            private String observationWindowSize; 
            private Boolean upgrade; 

            /**
             * The average bandwidth usage threshold that triggers automatic bandwidth downgrade. Unit: %.
             */
            public Builder bandwidthUsageLowerThreshold(Integer bandwidthUsageLowerThreshold) {
                this.bandwidthUsageLowerThreshold = bandwidthUsageLowerThreshold;
                return this;
            }

            /**
             * The average bandwidth usage threshold that triggers automatic bandwidth adjustment. Unit: %.
             */
            public Builder bandwidthUsageUpperThreshold(Integer bandwidthUsageUpperThreshold) {
                this.bandwidthUsageUpperThreshold = bandwidthUsageUpperThreshold;
                return this;
            }

            /**
             * Indicates whether the automatic bandwidth downgrade feature is enabled. Valid values:
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
             * The observation window of the automatic bandwidth adjustment feature. The return value consists of a numeric value and a time unit suffix. Valid values of the time unit suffix:
             * <p>
             * 
             * *   **s**: seconds.
             * *   **m**: minutes.
             * *   **h**: hours.
             * *   **d**: days.
             * 
             * >  A value of **5m** indicates 5 minutes.
             */
            public Builder observationWindowSize(String observationWindowSize) {
                this.observationWindowSize = observationWindowSize;
                return this;
            }

            /**
             * Indicates whether the automatic bandwidth adjustment feature is enabled. Valid values:
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
        @NameInMap("CpuStep")
        private Integer cpuStep;

        @NameInMap("CpuUsageUpperThreshold")
        private Integer cpuUsageUpperThreshold;

        @NameInMap("DowngradeObservationWindowSize")
        private String downgradeObservationWindowSize;

        @NameInMap("Enable")
        private Boolean enable;

        @NameInMap("UpgradeObservationWindowSize")
        private String upgradeObservationWindowSize;

        private Resource(Builder builder) {
            this.cpuStep = builder.cpuStep;
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
         * @return cpuStep
         */
        public Integer getCpuStep() {
            return this.cpuStep;
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
            private Integer cpuStep; 
            private Integer cpuUsageUpperThreshold; 
            private String downgradeObservationWindowSize; 
            private Boolean enable; 
            private String upgradeObservationWindowSize; 

            /**
             * The scale-out step size of CPU.
             */
            public Builder cpuStep(Integer cpuStep) {
                this.cpuStep = cpuStep;
                return this;
            }

            /**
             * The average CPU utilization threshold that triggers automatic scale-out of local resources. Unit: %.
             */
            public Builder cpuUsageUpperThreshold(Integer cpuUsageUpperThreshold) {
                this.cpuUsageUpperThreshold = cpuUsageUpperThreshold;
                return this;
            }

            /**
             * The observation window of the automatic scale-in feature for local resources. The return value consists of a numeric value and a time unit suffix. Valid values of the time unit suffix:
             * <p>
             * 
             * *   **s**: seconds.
             * *   **m**: minutes.
             * *   **h**: hours.
             * *   **d**: days.
             * 
             * >  A value of **5m** indicates 5 minutes.
             */
            public Builder downgradeObservationWindowSize(String downgradeObservationWindowSize) {
                this.downgradeObservationWindowSize = downgradeObservationWindowSize;
                return this;
            }

            /**
             * Indicates whether the auto scaling feature is enabled for local resources. Valid values:
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
             * The observation window of the automatic scale-out feature for local resources. The return value consists of a numeric value and a time unit suffix. Valid values of the time unit suffix:
             * <p>
             * 
             * *   **s**: seconds.
             * *   **m**: minutes.
             * *   **h**: hours.
             * *   **d**: days.
             * 
             * >  A value of **5m** indicates 5 minutes.
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
        @NameInMap("Downgrade")
        private Boolean downgrade;

        @NameInMap("DowngradeObservationWindowSize")
        private String downgradeObservationWindowSize;

        @NameInMap("MaxShards")
        private Integer maxShards;

        @NameInMap("MemUsageLowerThreshold")
        private Integer memUsageLowerThreshold;

        @NameInMap("MemUsageUpperThreshold")
        private Integer memUsageUpperThreshold;

        @NameInMap("MinShards")
        private Integer minShards;

        @NameInMap("Upgrade")
        private Boolean upgrade;

        @NameInMap("UpgradeObservationWindowSize")
        private String upgradeObservationWindowSize;

        private Shard(Builder builder) {
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
            private Boolean downgrade; 
            private String downgradeObservationWindowSize; 
            private Integer maxShards; 
            private Integer memUsageLowerThreshold; 
            private Integer memUsageUpperThreshold; 
            private Integer minShards; 
            private Boolean upgrade; 
            private String upgradeObservationWindowSize; 

            /**
             * Indicates whether the feature of automatically removing shards is enabled. Valid values:
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
             * The observation window of the feature of automatically removing shards. The return value consists of a numeric value and a time unit suffix. Valid values of the time unit suffix:
             * <p>
             * 
             * *   **s**: seconds.
             * *   **m**: minutes.
             * *   **h**: hours.
             * *   **d**: days.
             * 
             * >  A value of **1d** indicates one day.
             */
            public Builder downgradeObservationWindowSize(String downgradeObservationWindowSize) {
                this.downgradeObservationWindowSize = downgradeObservationWindowSize;
                return this;
            }

            /**
             * The maximum number of shards in the instance.
             */
            public Builder maxShards(Integer maxShards) {
                this.maxShards = maxShards;
                return this;
            }

            /**
             * The average memory usage threshold that triggers automatic removal of shards. Unit: %.
             */
            public Builder memUsageLowerThreshold(Integer memUsageLowerThreshold) {
                this.memUsageLowerThreshold = memUsageLowerThreshold;
                return this;
            }

            /**
             * The average memory usage threshold that triggers automatic adding of shards. Unit: %.
             */
            public Builder memUsageUpperThreshold(Integer memUsageUpperThreshold) {
                this.memUsageUpperThreshold = memUsageUpperThreshold;
                return this;
            }

            /**
             * The minimum number of shards in the instance.
             */
            public Builder minShards(Integer minShards) {
                this.minShards = minShards;
                return this;
            }

            /**
             * Indicates whether the feature of automatically adding shards is enabled. Valid values:
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
             * The observation window of the feature of automatically adding shards. The return value consists of a numeric value and a time unit suffix. Valid values of the time unit suffix:
             * <p>
             * 
             * *   **s**: seconds.
             * *   **m**: minutes.
             * *   **h**: hours.
             * *   **d**: days.
             * 
             * >  A value of **5m** indicates 5 minutes.
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
        @NameInMap("CoolDownTime")
        private String coolDownTime;

        @NameInMap("CpuUsageUpperThreshold")
        private Integer cpuUsageUpperThreshold;

        @NameInMap("Downgrade")
        private Boolean downgrade;

        @NameInMap("MaxReadOnlyNodes")
        private Integer maxReadOnlyNodes;

        @NameInMap("MaxSpec")
        private String maxSpec;

        @NameInMap("MemUsageUpperThreshold")
        private Integer memUsageUpperThreshold;

        @NameInMap("ObservationWindowSize")
        private String observationWindowSize;

        @NameInMap("Upgrade")
        private Boolean upgrade;

        private Spec(Builder builder) {
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
            private String coolDownTime; 
            private Integer cpuUsageUpperThreshold; 
            private Boolean downgrade; 
            private Integer maxReadOnlyNodes; 
            private String maxSpec; 
            private Integer memUsageUpperThreshold; 
            private String observationWindowSize; 
            private Boolean upgrade; 

            /**
             * The quiescent period. The return value consists of a numeric value and a time unit suffix. Valid values of the time unit suffix:
             * <p>
             * 
             * *   **s**: seconds.
             * *   **m**: minutes.
             * *   **h**: hours.
             * *   **d**: days.
             * 
             * >  A value of **5m** indicates 5 minutes.
             */
            public Builder coolDownTime(String coolDownTime) {
                this.coolDownTime = coolDownTime;
                return this;
            }

            /**
             * The average CPU utilization threshold that triggers automatic specification scale-up. Unit: %.
             */
            public Builder cpuUsageUpperThreshold(Integer cpuUsageUpperThreshold) {
                this.cpuUsageUpperThreshold = cpuUsageUpperThreshold;
                return this;
            }

            /**
             * Indicates whether the automatic specification scale-down feature is enabled. Valid values:
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
             * The maximum number of read-only nodes of the instance.
             */
            public Builder maxReadOnlyNodes(Integer maxReadOnlyNodes) {
                this.maxReadOnlyNodes = maxReadOnlyNodes;
                return this;
            }

            /**
             * The maximum specifications to which the database instance can be upgraded. For more information about the specifications of each type of supported database instances, see the following topics:
             * <p>
             * 
             * *   PolarDB for MySQL Cluster Edition instances: [Specifications of compute nodes](~~102542~~).
             * *   ApsaraDB RDS for MySQL High-availability Edition instances that use standard SSDs or enhanced SSDs (ESSDs): [Specifications](~~276974~~).
             */
            public Builder maxSpec(String maxSpec) {
                this.maxSpec = maxSpec;
                return this;
            }

            /**
             * The average memory usage threshold that triggers automatic specification scale-up. Unit: %.
             */
            public Builder memUsageUpperThreshold(Integer memUsageUpperThreshold) {
                this.memUsageUpperThreshold = memUsageUpperThreshold;
                return this;
            }

            /**
             * The observation window. The return value consists of a numeric value and a time unit suffix. Valid values of the time unit suffix:
             * <p>
             * 
             * *   **s**: seconds.
             * *   **m**: minutes.
             * *   **h**: hours.
             * *   **d**: days.
             * 
             * >  A value of **5m** indicates 5 minutes.
             */
            public Builder observationWindowSize(String observationWindowSize) {
                this.observationWindowSize = observationWindowSize;
                return this;
            }

            /**
             * Indicates whether the automatic specification scale-up feature is enabled. Valid values:
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
        @NameInMap("DiskUsageUpperThreshold")
        private Integer diskUsageUpperThreshold;

        @NameInMap("MaxStorage")
        private Integer maxStorage;

        @NameInMap("Upgrade")
        private Boolean upgrade;

        private Storage(Builder builder) {
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
            private Integer diskUsageUpperThreshold; 
            private Integer maxStorage; 
            private Boolean upgrade; 

            /**
             * The average storage usage threshold that triggers automatic storage expansion. Unit: %.
             */
            public Builder diskUsageUpperThreshold(Integer diskUsageUpperThreshold) {
                this.diskUsageUpperThreshold = diskUsageUpperThreshold;
                return this;
            }

            /**
             * The maximum storage size. Unit: GB.
             */
            public Builder maxStorage(Integer maxStorage) {
                this.maxStorage = maxStorage;
                return this;
            }

            /**
             * Indicates whether the automatic storage expansion feature is enabled. Valid values:
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
    public static class Data extends TeaModel {
        @NameInMap("Bandwidth")
        private Bandwidth bandwidth;

        @NameInMap("Resource")
        private Resource resource;

        @NameInMap("Shard")
        private Shard shard;

        @NameInMap("Spec")
        private Spec spec;

        @NameInMap("Storage")
        private Storage storage;

        private Data(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.resource = builder.resource;
            this.shard = builder.shard;
            this.spec = builder.spec;
            this.storage = builder.storage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public Bandwidth getBandwidth() {
            return this.bandwidth;
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

        public static final class Builder {
            private Bandwidth bandwidth; 
            private Resource resource; 
            private Shard shard; 
            private Spec spec; 
            private Storage storage; 

            /**
             * The configurations of the automatic bandwidth adjustment feature.
             */
            public Builder bandwidth(Bandwidth bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The configurations of the auto scaling feature for local resources.
             */
            public Builder resource(Resource resource) {
                this.resource = resource;
                return this;
            }

            /**
             * The configurations of the auto scaling feature for shards.
             */
            public Builder shard(Shard shard) {
                this.shard = shard;
                return this;
            }

            /**
             * The configurations of the auto scaling feature for specifications.
             */
            public Builder spec(Spec spec) {
                this.spec = spec;
                return this;
            }

            /**
             * The configurations of the automatic storage expansion feature.
             */
            public Builder storage(Storage storage) {
                this.storage = storage;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
