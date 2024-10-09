// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeRecommendInstanceTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRecommendInstanceTypeResponseBody</p>
 */
public class DescribeRecommendInstanceTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRecommendInstanceTypeResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRecommendInstanceTypeResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * <p>The details of the recommended instance types.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRecommendInstanceTypeResponseBody build() {
            return new DescribeRecommendInstanceTypeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRecommendInstanceTypeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRecommendInstanceTypeResponseBody</p>
     */
    public static class InstanceType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cores")
        private Integer cores;

        @com.aliyun.core.annotation.NameInMap("Generation")
        private String generation;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("InstanceTypeFamily")
        private String instanceTypeFamily;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Integer memory;

        @com.aliyun.core.annotation.NameInMap("SupportIoOptimized")
        private String supportIoOptimized;

        private InstanceType(Builder builder) {
            this.cores = builder.cores;
            this.generation = builder.generation;
            this.instanceType = builder.instanceType;
            this.instanceTypeFamily = builder.instanceTypeFamily;
            this.memory = builder.memory;
            this.supportIoOptimized = builder.supportIoOptimized;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceType create() {
            return builder().build();
        }

        /**
         * @return cores
         */
        public Integer getCores() {
            return this.cores;
        }

        /**
         * @return generation
         */
        public String getGeneration() {
            return this.generation;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return instanceTypeFamily
         */
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        /**
         * @return memory
         */
        public Integer getMemory() {
            return this.memory;
        }

        /**
         * @return supportIoOptimized
         */
        public String getSupportIoOptimized() {
            return this.supportIoOptimized;
        }

        public static final class Builder {
            private Integer cores; 
            private String generation; 
            private String instanceType; 
            private String instanceTypeFamily; 
            private Integer memory; 
            private String supportIoOptimized; 

            /**
             * <p>The number of vCPUs of the instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cores(Integer cores) {
                this.cores = cores;
                return this;
            }

            /**
             * <p>The generation of the instance family.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs-4</p>
             */
            public Builder generation(String generation) {
                this.generation = generation;
                return this;
            }

            /**
             * <p>The name of the instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.hfg6.large</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The instance family.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.hfg6</p>
             */
            public Builder instanceTypeFamily(String instanceTypeFamily) {
                this.instanceTypeFamily = instanceTypeFamily;
                return this;
            }

            /**
             * <p>The memory size of the instance type. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>8192</p>
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>Indicates whether the instance type supports I/O optimization.</p>
             * 
             * <strong>example:</strong>
             * <p>optimized</p>
             */
            public Builder supportIoOptimized(String supportIoOptimized) {
                this.supportIoOptimized = supportIoOptimized;
                return this;
            }

            public InstanceType build() {
                return new InstanceType(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRecommendInstanceTypeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRecommendInstanceTypeResponseBody</p>
     */
    public static class NetworkTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private java.util.List < String > networkType;

        private NetworkTypes(Builder builder) {
            this.networkType = builder.networkType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkTypes create() {
            return builder().build();
        }

        /**
         * @return networkType
         */
        public java.util.List < String > getNetworkType() {
            return this.networkType;
        }

        public static final class Builder {
            private java.util.List < String > networkType; 

            /**
             * NetworkType.
             */
            public Builder networkType(java.util.List < String > networkType) {
                this.networkType = networkType;
                return this;
            }

            public NetworkTypes build() {
                return new NetworkTypes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRecommendInstanceTypeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRecommendInstanceTypeResponseBody</p>
     */
    public static class Zone extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetworkTypes")
        private NetworkTypes networkTypes;

        @com.aliyun.core.annotation.NameInMap("ZoneNo")
        private String zoneNo;

        private Zone(Builder builder) {
            this.networkTypes = builder.networkTypes;
            this.zoneNo = builder.zoneNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Zone create() {
            return builder().build();
        }

        /**
         * @return networkTypes
         */
        public NetworkTypes getNetworkTypes() {
            return this.networkTypes;
        }

        /**
         * @return zoneNo
         */
        public String getZoneNo() {
            return this.zoneNo;
        }

        public static final class Builder {
            private NetworkTypes networkTypes; 
            private String zoneNo; 

            /**
             * <p>The details of network types of instance types.</p>
             */
            public Builder networkTypes(NetworkTypes networkTypes) {
                this.networkTypes = networkTypes;
                return this;
            }

            /**
             * <p>The ID of the zone where the instance type is available.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-h</p>
             */
            public Builder zoneNo(String zoneNo) {
                this.zoneNo = zoneNo;
                return this;
            }

            public Zone build() {
                return new Zone(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRecommendInstanceTypeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRecommendInstanceTypeResponseBody</p>
     */
    public static class Zones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("zone")
        private java.util.List < Zone> zone;

        private Zones(Builder builder) {
            this.zone = builder.zone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Zones create() {
            return builder().build();
        }

        /**
         * @return zone
         */
        public java.util.List < Zone> getZone() {
            return this.zone;
        }

        public static final class Builder {
            private java.util.List < Zone> zone; 

            /**
             * zone.
             */
            public Builder zone(java.util.List < Zone> zone) {
                this.zone = zone;
                return this;
            }

            public Zones build() {
                return new Zones(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRecommendInstanceTypeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRecommendInstanceTypeResponseBody</p>
     */
    public static class RecommendInstanceType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private InstanceType instanceType;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("SpotStrategy")
        private String spotStrategy;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        @com.aliyun.core.annotation.NameInMap("Zones")
        private Zones zones;

        private RecommendInstanceType(Builder builder) {
            this.commodityCode = builder.commodityCode;
            this.instanceChargeType = builder.instanceChargeType;
            this.instanceType = builder.instanceType;
            this.networkType = builder.networkType;
            this.priority = builder.priority;
            this.regionId = builder.regionId;
            this.scene = builder.scene;
            this.spotStrategy = builder.spotStrategy;
            this.zoneId = builder.zoneId;
            this.zones = builder.zones;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecommendInstanceType create() {
            return builder().build();
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return instanceChargeType
         */
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        /**
         * @return instanceType
         */
        public InstanceType getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return spotStrategy
         */
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        /**
         * @return zones
         */
        public Zones getZones() {
            return this.zones;
        }

        public static final class Builder {
            private String commodityCode; 
            private String instanceChargeType; 
            private InstanceType instanceType; 
            private String networkType; 
            private Integer priority; 
            private String regionId; 
            private String scene; 
            private String spotStrategy; 
            private String zoneId; 
            private Zones zones; 

            /**
             * <p>The commodity code of the instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * <p>The billing method of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>PostPaid</p>
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * <p>The name of the instance type.</p>
             */
            public Builder instanceType(InstanceType instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The network type of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The priority based on which the system sorts the instance types.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The region ID of the instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The scenarios in which the instance type is recommended.</p>
             * 
             * <strong>example:</strong>
             * <p>CREATE</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>The bidding policy for the preemptible instance.</p>
             * 
             * <strong>example:</strong>
             * <p>NoSpot</p>
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * <p>The ID of the zone in which the instance type is available.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-h</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * <p>The details of the zones where the instance types resides.</p>
             */
            public Builder zones(Zones zones) {
                this.zones = zones;
                return this;
            }

            public RecommendInstanceType build() {
                return new RecommendInstanceType(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRecommendInstanceTypeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRecommendInstanceTypeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RecommendInstanceType")
        private java.util.List < RecommendInstanceType> recommendInstanceType;

        private Data(Builder builder) {
            this.recommendInstanceType = builder.recommendInstanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return recommendInstanceType
         */
        public java.util.List < RecommendInstanceType> getRecommendInstanceType() {
            return this.recommendInstanceType;
        }

        public static final class Builder {
            private java.util.List < RecommendInstanceType> recommendInstanceType; 

            /**
             * RecommendInstanceType.
             */
            public Builder recommendInstanceType(java.util.List < RecommendInstanceType> recommendInstanceType) {
                this.recommendInstanceType = recommendInstanceType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
