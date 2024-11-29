// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The configuration item of the bandwidth auto scaling feature.</p>
         */
        public Builder bandwidth(Bandwidth bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze8g2am97624****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The configuration item of the resource auto scaling feature.</p>
         */
        public Builder resource(Resource resource) {
            this.putQueryParameter("Resource", resource);
            this.resource = resource;
            return this;
        }

        /**
         * <p>The configuration item of the shard auto scaling feature.</p>
         */
        public Builder shard(Shard shard) {
            this.putQueryParameter("Shard", shard);
            this.shard = shard;
            return this;
        }

        /**
         * <p>The configuration item of the specification auto scaling feature.</p>
         */
        public Builder spec(Spec spec) {
            this.putQueryParameter("Spec", spec);
            this.spec = spec;
            return this;
        }

        /**
         * <p>The configuration item of the automatic storage expansion feature.</p>
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

    /**
     * 
     * {@link ModifyAutoScalingConfigRequest} extends {@link TeaModel}
     *
     * <p>ModifyAutoScalingConfigRequest</p>
     */
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
             * <p>Specifies whether to apply the <strong>Bandwidth</strong> configuration of the bandwidth auto scaling feature. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder apply(Boolean apply) {
                this.apply = apply;
                return this;
            }

            /**
             * <p>The average bandwidth usage threshold that triggers automatic bandwidth downgrade. Unit: %. Valid values:</p>
             * <ul>
             * <li><strong>10</strong></li>
             * <li><strong>20</strong></li>
             * <li><strong>30</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder bandwidthUsageLowerThreshold(Integer bandwidthUsageLowerThreshold) {
                this.bandwidthUsageLowerThreshold = bandwidthUsageLowerThreshold;
                return this;
            }

            /**
             * <p>The average bandwidth usage threshold that triggers automatic bandwidth upgrade. Unit: %. Valid values:</p>
             * <ul>
             * <li><strong>50</strong></li>
             * <li><strong>60</strong></li>
             * <li><strong>70</strong></li>
             * <li><strong>80</strong></li>
             * <li><strong>90</strong></li>
             * <li><strong>95</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>70</p>
             */
            public Builder bandwidthUsageUpperThreshold(Integer bandwidthUsageUpperThreshold) {
                this.bandwidthUsageUpperThreshold = bandwidthUsageUpperThreshold;
                return this;
            }

            /**
             * <p>Specifies whether to enable automatic bandwidth downgrade. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder downgrade(Boolean downgrade) {
                this.downgrade = downgrade;
                return this;
            }

            /**
             * <p>The observation window of the bandwidth auto scaling feature. The value of this parameter consists of a numeric value and a time unit suffix. The <strong>m</strong> time unit suffix specifies the minute. Valid values:</p>
             * <ul>
             * <li><strong>1m</strong></li>
             * <li><strong>5m</strong></li>
             * <li><strong>10m</strong></li>
             * <li><strong>15m</strong></li>
             * <li><strong>30m</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>5m</p>
             */
            public Builder observationWindowSize(String observationWindowSize) {
                this.observationWindowSize = observationWindowSize;
                return this;
            }

            /**
             * <p>Specifies whether to enable automatic bandwidth upgrade. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link ModifyAutoScalingConfigRequest} extends {@link TeaModel}
     *
     * <p>ModifyAutoScalingConfigRequest</p>
     */
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
             * <p>Specifies whether to apply the <strong>Resource</strong> configuration of the resource auto scaling feature. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder apply(Boolean apply) {
                this.apply = apply;
                return this;
            }

            /**
             * <p>The average CPU utilization threshold that triggers automatic resource scale-out. Unit: %. Valid values:</p>
             * <ul>
             * <li><strong>70</strong></li>
             * <li><strong>80</strong></li>
             * <li><strong>90</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>70</p>
             */
            public Builder cpuUsageUpperThreshold(Integer cpuUsageUpperThreshold) {
                this.cpuUsageUpperThreshold = cpuUsageUpperThreshold;
                return this;
            }

            /**
             * <p>The observation window of the automatic resource scale-in feature. The value of this parameter consists of a numeric value and a time unit suffix. The <strong>m</strong> time unit suffix specifies the minute. Valid values:</p>
             * <ul>
             * <li><strong>1m</strong></li>
             * <li><strong>3m</strong></li>
             * <li><strong>5m</strong></li>
             * <li><strong>10m</strong></li>
             * <li><strong>20m</strong></li>
             * <li><strong>30m</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>5m</p>
             */
            public Builder downgradeObservationWindowSize(String downgradeObservationWindowSize) {
                this.downgradeObservationWindowSize = downgradeObservationWindowSize;
                return this;
            }

            /**
             * <p>Specifies whether to enable resource auto scaling. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The observation window of the automatic resource scale-out feature. The value of this parameter consists of a numeric value and a time unit suffix. The <strong>m</strong> time unit suffix specifies the minute. Valid values:</p>
             * <ul>
             * <li><strong>1m</strong></li>
             * <li><strong>3m</strong></li>
             * <li><strong>5m</strong></li>
             * <li><strong>10m</strong></li>
             * <li><strong>20m</strong></li>
             * <li><strong>30m</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>5m</p>
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
    /**
     * 
     * {@link ModifyAutoScalingConfigRequest} extends {@link TeaModel}
     *
     * <p>ModifyAutoScalingConfigRequest</p>
     */
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
             * <p>Specifies whether to apply the <strong>Shard</strong> configuration of the shard auto scaling feature. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p> The shard auto scaling feature is available only for Tair (Redis OSS-compatible) cloud-native cluster instances on the China site (aliyun.com).</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder apply(Boolean apply) {
                this.apply = apply;
                return this;
            }

            /**
             * <p>Specifies whether to enable automatic shard removal. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p> The automatic shard removal feature is in a canary release.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder downgrade(Boolean downgrade) {
                this.downgrade = downgrade;
                return this;
            }

            /**
             * <p>The observation window of the automatic shard removal feature. The value of this parameter consists of a numeric value and a time unit suffix. The <strong>h</strong> time unit suffix specifies the hour. The <strong>d</strong> time unit suffix specifies the day. Valid values:</p>
             * <ul>
             * <li><strong>1h</strong></li>
             * <li><strong>2h</strong></li>
             * <li><strong>3h</strong></li>
             * <li><strong>1d</strong></li>
             * <li><strong>7d</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1h</p>
             */
            public Builder downgradeObservationWindowSize(String downgradeObservationWindowSize) {
                this.downgradeObservationWindowSize = downgradeObservationWindowSize;
                return this;
            }

            /**
             * <p>The maximum number of shards in the instance. The value must be a positive integer. Valid values: 4 to 32.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder maxShards(Integer maxShards) {
                this.maxShards = maxShards;
                return this;
            }

            /**
             * <p>The average memory usage threshold that triggers automatic shard removal. Unit: %. Valid values:</p>
             * <ul>
             * <li><strong>10</strong></li>
             * <li><strong>20</strong></li>
             * <li><strong>30</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder memUsageLowerThreshold(Integer memUsageLowerThreshold) {
                this.memUsageLowerThreshold = memUsageLowerThreshold;
                return this;
            }

            /**
             * <p>The average memory usage threshold that triggers automatic shard addition. Unit: %. Valid values:</p>
             * <ul>
             * <li><strong>50</strong></li>
             * <li><strong>60</strong></li>
             * <li><strong>70</strong></li>
             * <li><strong>80</strong></li>
             * <li><strong>90</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>70</p>
             */
            public Builder memUsageUpperThreshold(Integer memUsageUpperThreshold) {
                this.memUsageUpperThreshold = memUsageUpperThreshold;
                return this;
            }

            /**
             * <p>The minimum number of shards in the instance. The value must be a positive integer. Valid values: 4 to 32.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder minShards(Integer minShards) {
                this.minShards = minShards;
                return this;
            }

            /**
             * <p>Specifies whether to enable automatic shard addition. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder upgrade(Boolean upgrade) {
                this.upgrade = upgrade;
                return this;
            }

            /**
             * <p>The observation window of the automatic shard addition feature. The value of this parameter consists of a numeric value and a time unit suffix. The <strong>m</strong> time unit suffix specifies the minute. Valid values:</p>
             * <ul>
             * <li><strong>5m</strong></li>
             * <li><strong>10m</strong></li>
             * <li><strong>15m</strong></li>
             * <li><strong>30m</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>5m</p>
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
    /**
     * 
     * {@link ModifyAutoScalingConfigRequest} extends {@link TeaModel}
     *
     * <p>ModifyAutoScalingConfigRequest</p>
     */
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
             * <p>Specifies whether to apply the <strong>Spec</strong> configuration of the specification auto scaling feature. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder apply(Boolean apply) {
                this.apply = apply;
                return this;
            }

            /**
             * <p>The quiescent period. The value of this parameter consists of a numeric value and a time unit suffix. The <strong>m</strong> time unit suffix specifies the minute, the <strong>h</strong> time unit suffix specifies the hour, and the <strong>d</strong> time unit suffix specifies the day.</p>
             * <ul>
             * <li>Valid values for PolarDB for MySQL Cluster Edition instances: <strong>5m</strong>, <strong>10m</strong>, <strong>30m</strong>, <strong>1h</strong>, <strong>2h</strong>, <strong>3h</strong>, <strong>1d</strong>, and <strong>7d</strong>.</li>
             * <li>Valid values for ApsaraDB RDS for MySQL High-availability Edition instances that use standard SSDs or Enterprise SSDs (ESSDs): <strong>5m</strong>, <strong>10m</strong>, <strong>30m</strong>, <strong>1h</strong>, <strong>2h</strong>, <strong>3h</strong>, <strong>1d</strong>, and <strong>7d</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>5m</p>
             */
            public Builder coolDownTime(String coolDownTime) {
                this.coolDownTime = coolDownTime;
                return this;
            }

            /**
             * <p>The average CPU utilization threshold that triggers automatic specification scale-up. Unit: %. Valid values:</p>
             * <ul>
             * <li><strong>50</strong></li>
             * <li><strong>60</strong></li>
             * <li><strong>70</strong></li>
             * <li><strong>80</strong></li>
             * <li><strong>90</strong></li>
             * </ul>
             * <blockquote>
             * <p> This parameter must be specified if the database instance is a PolarDB for MySQL Cluster Edition instance or an ApsaraDB RDS for MySQL High-availability Edition instance that uses standard SSDs or ESSDs.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>70</p>
             */
            public Builder cpuUsageUpperThreshold(Integer cpuUsageUpperThreshold) {
                this.cpuUsageUpperThreshold = cpuUsageUpperThreshold;
                return this;
            }

            /**
             * <p>Specifies whether to enable automatic specification scale-down. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p> This parameter must be specified if the database instance is a PolarDB for MySQL Cluster Edition instance or an ApsaraDB RDS for MySQL High-availability Edition instance that uses standard SSDs or ESSDs.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder downgrade(Boolean downgrade) {
                this.downgrade = downgrade;
                return this;
            }

            /**
             * <p>The maximum number of read-only nodes of the instance.</p>
             * <blockquote>
             * <p> This parameter must be specified if the database instance is a PolarDB for MySQL Cluster Edition instance.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxReadOnlyNodes(Integer maxReadOnlyNodes) {
                this.maxReadOnlyNodes = maxReadOnlyNodes;
                return this;
            }

            /**
             * <p>The maximum specifications to which the database instance can be scaled up. The database instance can be upgraded only to a database instance of the same edition with higher specifications. For information about the specifications of different database instances, see the following topics:</p>
             * <ul>
             * <li>PolarDB for MySQL Cluster Edition instances: <a href="https://help.aliyun.com/document_detail/102542.html">Specifications of compute nodes</a></li>
             * <li>ApsaraDB RDS for MySQL High-availability Edition instances that use standard SSDs or ESSDs: <a href="https://help.aliyun.com/document_detail/276974.html">Specifications</a></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>polar.mysql.x8.12xlarge</p>
             */
            public Builder maxSpec(String maxSpec) {
                this.maxSpec = maxSpec;
                return this;
            }

            /**
             * <p>The average memory usage threshold that triggers automatic specification scale-up. Unit: %. Valid values:</p>
             * <ul>
             * <li><strong>50</strong></li>
             * <li><strong>60</strong></li>
             * <li><strong>70</strong></li>
             * <li><strong>80</strong></li>
             * <li><strong>90</strong></li>
             * </ul>
             * <blockquote>
             * <p> This parameter must be specified if the database instance is a Tair (Redis OSS-compatible) Community Edition cloud-native instance on the China site (aliyun.com).</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>70</p>
             */
            public Builder memUsageUpperThreshold(Integer memUsageUpperThreshold) {
                this.memUsageUpperThreshold = memUsageUpperThreshold;
                return this;
            }

            /**
             * <p>The observation window. The value of this parameter consists of a numeric value and a time unit suffix. The <strong>m</strong> time unit suffix specifies the minute and the <strong>h</strong> time unit suffix specifies the hour.</p>
             * <ul>
             * <li>Valid values for PolarDB for MySQL Cluster Edition instances: <strong>5m</strong>, <strong>10m</strong>, <strong>15m</strong>, and <strong>30m</strong>.</li>
             * <li>Valid values for ApsaraDB RDS for MySQL High-availability Edition instances that use standard SSDs or ESSDs: <strong>5m</strong>, <strong>20m</strong>, <strong>30m</strong>, <strong>40m</strong>, and <strong>1h</strong>.</li>
             * <li>Valid values for Tair (Redis OSS-compatible) Community Edition cloud-native instances: <strong>5m</strong>, <strong>10m</strong>, <strong>15m</strong>, and <strong>30m</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>5m</p>
             */
            public Builder observationWindowSize(String observationWindowSize) {
                this.observationWindowSize = observationWindowSize;
                return this;
            }

            /**
             * <p>Specifies whether to enable automatic specification scale-up. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link ModifyAutoScalingConfigRequest} extends {@link TeaModel}
     *
     * <p>ModifyAutoScalingConfigRequest</p>
     */
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
             * <p>Specifies whether to apply the <strong>Storage</strong> configuration of the automatic storage expansion feature. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder apply(Boolean apply) {
                this.apply = apply;
                return this;
            }

            /**
             * <p>The average storage usage threshold that triggers automatic storage expansion. Unit: %. Valid values:</p>
             * <ul>
             * <li><strong>50</strong></li>
             * <li><strong>60</strong></li>
             * <li><strong>70</strong></li>
             * <li><strong>80</strong></li>
             * <li><strong>90</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>70</p>
             */
            public Builder diskUsageUpperThreshold(Integer diskUsageUpperThreshold) {
                this.diskUsageUpperThreshold = diskUsageUpperThreshold;
                return this;
            }

            /**
             * <p>The maximum storage size of the database instance. Unit: GB. The value must be greater than or equal to the total storage size of the instance.</p>
             * <ul>
             * <li>If the instance uses ESSDs, the maximum value of this parameter can be 32000.</li>
             * <li>If the instance uses standard SSDs, the maximum value of this parameter can be 6000.</li>
             * </ul>
             * <blockquote>
             * <p> The standard SSD storage type is phased out. We recommend that you <a href="https://help.aliyun.com/document_detail/314678.html">upgrade the storage type of your instance from standard SSDs to ESSDs</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>32000</p>
             */
            public Builder maxStorage(Integer maxStorage) {
                this.maxStorage = maxStorage;
                return this;
            }

            /**
             * <p>Specifies whether to enable automatic storage expansion. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
