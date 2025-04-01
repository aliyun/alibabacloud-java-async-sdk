// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link DescribeAutoScalingConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAutoScalingConfigResponseBody</p>
 */
public class DescribeAutoScalingConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeAutoScalingConfigResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The configurations of the auto scaling feature for instances.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <blockquote>
         * <p> If the request was successful, <strong>Successful</strong> is returned. If the request failed, an error message such as an error code is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeAutoScalingConfigResponseBody build() {
            return new DescribeAutoScalingConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAutoScalingConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAutoScalingConfigResponseBody</p>
     */
    public static class Bandwidth extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BandwidthUsageLowerThreshold")
        private Integer bandwidthUsageLowerThreshold;

        @com.aliyun.core.annotation.NameInMap("BandwidthUsageUpperThreshold")
        private Integer bandwidthUsageUpperThreshold;

        @com.aliyun.core.annotation.NameInMap("Downgrade")
        private Boolean downgrade;

        @com.aliyun.core.annotation.NameInMap("ObservationWindowSize")
        private String observationWindowSize;

        @com.aliyun.core.annotation.NameInMap("Upgrade")
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

            private Builder() {
            } 

            private Builder(Bandwidth model) {
                this.bandwidthUsageLowerThreshold = model.bandwidthUsageLowerThreshold;
                this.bandwidthUsageUpperThreshold = model.bandwidthUsageUpperThreshold;
                this.downgrade = model.downgrade;
                this.observationWindowSize = model.observationWindowSize;
                this.upgrade = model.upgrade;
            } 

            /**
             * <p>The average bandwidth usage threshold that triggers automatic bandwidth downgrade. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder bandwidthUsageLowerThreshold(Integer bandwidthUsageLowerThreshold) {
                this.bandwidthUsageLowerThreshold = bandwidthUsageLowerThreshold;
                return this;
            }

            /**
             * <p>The average bandwidth usage threshold that triggers automatic bandwidth adjustment. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>70</p>
             */
            public Builder bandwidthUsageUpperThreshold(Integer bandwidthUsageUpperThreshold) {
                this.bandwidthUsageUpperThreshold = bandwidthUsageUpperThreshold;
                return this;
            }

            /**
             * <p>Indicates whether the automatic bandwidth downgrade feature is enabled. Valid values:</p>
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
             * <p>The observation window of the automatic bandwidth adjustment feature. The return value consists of a numeric value and a time unit suffix. Valid values of the time unit suffix:</p>
             * <ul>
             * <li><strong>s</strong>: seconds.</li>
             * <li><strong>m</strong>: minutes.</li>
             * <li><strong>h</strong>: hours.</li>
             * <li><strong>d</strong>: days.</li>
             * </ul>
             * <blockquote>
             * <p> A value of <strong>5m</strong> indicates 5 minutes.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>5m</p>
             */
            public Builder observationWindowSize(String observationWindowSize) {
                this.observationWindowSize = observationWindowSize;
                return this;
            }

            /**
             * <p>Indicates whether the automatic bandwidth adjustment feature is enabled. Valid values:</p>
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
     * {@link DescribeAutoScalingConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAutoScalingConfigResponseBody</p>
     */
    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CpuStep")
        private Integer cpuStep;

        @com.aliyun.core.annotation.NameInMap("CpuUsageUpperThreshold")
        private Integer cpuUsageUpperThreshold;

        @com.aliyun.core.annotation.NameInMap("DowngradeObservationWindowSize")
        private String downgradeObservationWindowSize;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("UpgradeObservationWindowSize")
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

            private Builder() {
            } 

            private Builder(Resource model) {
                this.cpuStep = model.cpuStep;
                this.cpuUsageUpperThreshold = model.cpuUsageUpperThreshold;
                this.downgradeObservationWindowSize = model.downgradeObservationWindowSize;
                this.enable = model.enable;
                this.upgradeObservationWindowSize = model.upgradeObservationWindowSize;
            } 

            /**
             * <p>The scale-out step size of CPU.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cpuStep(Integer cpuStep) {
                this.cpuStep = cpuStep;
                return this;
            }

            /**
             * <p>The average CPU utilization threshold that triggers automatic scale-out of local resources. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>70</p>
             */
            public Builder cpuUsageUpperThreshold(Integer cpuUsageUpperThreshold) {
                this.cpuUsageUpperThreshold = cpuUsageUpperThreshold;
                return this;
            }

            /**
             * <p>The observation window of the automatic scale-in feature for local resources. The return value consists of a numeric value and a time unit suffix. Valid values of the time unit suffix:</p>
             * <ul>
             * <li><strong>s</strong>: seconds.</li>
             * <li><strong>m</strong>: minutes.</li>
             * <li><strong>h</strong>: hours.</li>
             * <li><strong>d</strong>: days.</li>
             * </ul>
             * <blockquote>
             * <p> A value of <strong>5m</strong> indicates 5 minutes.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>5m</p>
             */
            public Builder downgradeObservationWindowSize(String downgradeObservationWindowSize) {
                this.downgradeObservationWindowSize = downgradeObservationWindowSize;
                return this;
            }

            /**
             * <p>Indicates whether the auto scaling feature is enabled for local resources. Valid values:</p>
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
             * <p>The observation window of the automatic scale-out feature for local resources. The return value consists of a numeric value and a time unit suffix. Valid values of the time unit suffix:</p>
             * <ul>
             * <li><strong>s</strong>: seconds.</li>
             * <li><strong>m</strong>: minutes.</li>
             * <li><strong>h</strong>: hours.</li>
             * <li><strong>d</strong>: days.</li>
             * </ul>
             * <blockquote>
             * <p> A value of <strong>5m</strong> indicates 5 minutes.</p>
             * </blockquote>
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
     * {@link DescribeAutoScalingConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAutoScalingConfigResponseBody</p>
     */
    public static class Shard extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Downgrade")
        private Boolean downgrade;

        @com.aliyun.core.annotation.NameInMap("DowngradeObservationWindowSize")
        private String downgradeObservationWindowSize;

        @com.aliyun.core.annotation.NameInMap("MaxShards")
        private Integer maxShards;

        @com.aliyun.core.annotation.NameInMap("MemUsageLowerThreshold")
        private Integer memUsageLowerThreshold;

        @com.aliyun.core.annotation.NameInMap("MemUsageUpperThreshold")
        private Integer memUsageUpperThreshold;

        @com.aliyun.core.annotation.NameInMap("MinShards")
        private Integer minShards;

        @com.aliyun.core.annotation.NameInMap("Upgrade")
        private Boolean upgrade;

        @com.aliyun.core.annotation.NameInMap("UpgradeObservationWindowSize")
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

            private Builder() {
            } 

            private Builder(Shard model) {
                this.downgrade = model.downgrade;
                this.downgradeObservationWindowSize = model.downgradeObservationWindowSize;
                this.maxShards = model.maxShards;
                this.memUsageLowerThreshold = model.memUsageLowerThreshold;
                this.memUsageUpperThreshold = model.memUsageUpperThreshold;
                this.minShards = model.minShards;
                this.upgrade = model.upgrade;
                this.upgradeObservationWindowSize = model.upgradeObservationWindowSize;
            } 

            /**
             * <p>Indicates whether the feature of automatically removing shards is enabled. Valid values:</p>
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
             * <p>The observation window of the feature of automatically removing shards. The return value consists of a numeric value and a time unit suffix. Valid values of the time unit suffix:</p>
             * <ul>
             * <li><strong>s</strong>: seconds.</li>
             * <li><strong>m</strong>: minutes.</li>
             * <li><strong>h</strong>: hours.</li>
             * <li><strong>d</strong>: days.</li>
             * </ul>
             * <blockquote>
             * <p> A value of <strong>1d</strong> indicates one day.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1d</p>
             */
            public Builder downgradeObservationWindowSize(String downgradeObservationWindowSize) {
                this.downgradeObservationWindowSize = downgradeObservationWindowSize;
                return this;
            }

            /**
             * <p>The maximum number of shards in the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder maxShards(Integer maxShards) {
                this.maxShards = maxShards;
                return this;
            }

            /**
             * <p>The average memory usage threshold that triggers automatic removal of shards. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder memUsageLowerThreshold(Integer memUsageLowerThreshold) {
                this.memUsageLowerThreshold = memUsageLowerThreshold;
                return this;
            }

            /**
             * <p>The average memory usage threshold that triggers automatic adding of shards. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>70</p>
             */
            public Builder memUsageUpperThreshold(Integer memUsageUpperThreshold) {
                this.memUsageUpperThreshold = memUsageUpperThreshold;
                return this;
            }

            /**
             * <p>The minimum number of shards in the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder minShards(Integer minShards) {
                this.minShards = minShards;
                return this;
            }

            /**
             * <p>Indicates whether the feature of automatically adding shards is enabled. Valid values:</p>
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
             * <p>The observation window of the feature of automatically adding shards. The return value consists of a numeric value and a time unit suffix. Valid values of the time unit suffix:</p>
             * <ul>
             * <li><strong>s</strong>: seconds.</li>
             * <li><strong>m</strong>: minutes.</li>
             * <li><strong>h</strong>: hours.</li>
             * <li><strong>d</strong>: days.</li>
             * </ul>
             * <blockquote>
             * <p> A value of <strong>5m</strong> indicates 5 minutes.</p>
             * </blockquote>
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
     * {@link DescribeAutoScalingConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAutoScalingConfigResponseBody</p>
     */
    public static class Spec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CoolDownTime")
        private String coolDownTime;

        @com.aliyun.core.annotation.NameInMap("CpuUsageUpperThreshold")
        private Integer cpuUsageUpperThreshold;

        @com.aliyun.core.annotation.NameInMap("Downgrade")
        private Boolean downgrade;

        @com.aliyun.core.annotation.NameInMap("MaxReadOnlyNodes")
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

            private Builder() {
            } 

            private Builder(Spec model) {
                this.coolDownTime = model.coolDownTime;
                this.cpuUsageUpperThreshold = model.cpuUsageUpperThreshold;
                this.downgrade = model.downgrade;
                this.maxReadOnlyNodes = model.maxReadOnlyNodes;
                this.maxSpec = model.maxSpec;
                this.memUsageUpperThreshold = model.memUsageUpperThreshold;
                this.observationWindowSize = model.observationWindowSize;
                this.upgrade = model.upgrade;
            } 

            /**
             * <p>The quiescent period. The return value consists of a numeric value and a time unit suffix. Valid values of the time unit suffix:</p>
             * <ul>
             * <li><strong>s</strong>: seconds.</li>
             * <li><strong>m</strong>: minutes.</li>
             * <li><strong>h</strong>: hours.</li>
             * <li><strong>d</strong>: days.</li>
             * </ul>
             * <blockquote>
             * <p> A value of <strong>5m</strong> indicates 5 minutes.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>5m</p>
             */
            public Builder coolDownTime(String coolDownTime) {
                this.coolDownTime = coolDownTime;
                return this;
            }

            /**
             * <p>The average CPU utilization threshold that triggers automatic specification scale-up. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>70</p>
             */
            public Builder cpuUsageUpperThreshold(Integer cpuUsageUpperThreshold) {
                this.cpuUsageUpperThreshold = cpuUsageUpperThreshold;
                return this;
            }

            /**
             * <p>Indicates whether the automatic specification scale-down feature is enabled. Valid values:</p>
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
             * <p>The maximum number of read-only nodes of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxReadOnlyNodes(Integer maxReadOnlyNodes) {
                this.maxReadOnlyNodes = maxReadOnlyNodes;
                return this;
            }

            /**
             * <p>The maximum specifications to which the cluster can be scaled up. For more information about the specifications of each type of supported database instances, see the following topics:</p>
             * <ul>
             * <li>PolarDB for MySQL Cluster Edition instances: <a href="https://help.aliyun.com/document_detail/102542.html">Compute node specifications of PolarDB for MySQL Enterprise Edition</a></li>
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
             * <p>The average memory usage threshold that triggers automatic specification scale-up. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>70</p>
             */
            public Builder memUsageUpperThreshold(Integer memUsageUpperThreshold) {
                this.memUsageUpperThreshold = memUsageUpperThreshold;
                return this;
            }

            /**
             * <p>The observation window. The return value consists of a numeric value and a time unit suffix. Valid values of the time unit suffix:</p>
             * <ul>
             * <li><strong>s</strong>: seconds.</li>
             * <li><strong>m</strong>: minutes.</li>
             * <li><strong>h</strong>: hours.</li>
             * <li><strong>d</strong>: days.</li>
             * </ul>
             * <blockquote>
             * <p> A value of <strong>5m</strong> indicates 5 minutes.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>5m</p>
             */
            public Builder observationWindowSize(String observationWindowSize) {
                this.observationWindowSize = observationWindowSize;
                return this;
            }

            /**
             * <p>Indicates whether the automatic specification scale-up feature is enabled. Valid values:</p>
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
     * {@link DescribeAutoScalingConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAutoScalingConfigResponseBody</p>
     */
    public static class Storage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiskUsageUpperThreshold")
        private Integer diskUsageUpperThreshold;

        @com.aliyun.core.annotation.NameInMap("MaxStorage")
        private Integer maxStorage;

        @com.aliyun.core.annotation.NameInMap("Upgrade")
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

            private Builder() {
            } 

            private Builder(Storage model) {
                this.diskUsageUpperThreshold = model.diskUsageUpperThreshold;
                this.maxStorage = model.maxStorage;
                this.upgrade = model.upgrade;
            } 

            /**
             * <p>The average storage usage threshold that triggers automatic storage expansion. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>70</p>
             */
            public Builder diskUsageUpperThreshold(Integer diskUsageUpperThreshold) {
                this.diskUsageUpperThreshold = diskUsageUpperThreshold;
                return this;
            }

            /**
             * <p>The maximum storage size. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>32000</p>
             */
            public Builder maxStorage(Integer maxStorage) {
                this.maxStorage = maxStorage;
                return this;
            }

            /**
             * <p>Indicates whether the automatic storage expansion feature is enabled. Valid values:</p>
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
    /**
     * 
     * {@link DescribeAutoScalingConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAutoScalingConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Bandwidth bandwidth;

        @com.aliyun.core.annotation.NameInMap("Resource")
        private Resource resource;

        @com.aliyun.core.annotation.NameInMap("Shard")
        private Shard shard;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private Spec spec;

        @com.aliyun.core.annotation.NameInMap("Storage")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.bandwidth = model.bandwidth;
                this.resource = model.resource;
                this.shard = model.shard;
                this.spec = model.spec;
                this.storage = model.storage;
            } 

            /**
             * <p>The configurations of the automatic bandwidth adjustment feature.</p>
             */
            public Builder bandwidth(Bandwidth bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The configurations of the auto scaling feature for local resources.</p>
             */
            public Builder resource(Resource resource) {
                this.resource = resource;
                return this;
            }

            /**
             * <p>The configurations of the auto scaling feature for shards.</p>
             */
            public Builder shard(Shard shard) {
                this.shard = shard;
                return this;
            }

            /**
             * <p>The configurations of the auto scaling feature for specifications.</p>
             */
            public Builder spec(Spec spec) {
                this.spec = spec;
                return this;
            }

            /**
             * <p>The configurations of the automatic storage expansion feature.</p>
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
