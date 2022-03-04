// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRecommendInstanceTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRecommendInstanceTypeResponseBody</p>
 */
public class DescribeRecommendInstanceTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Data")
    private Data data;

    private DescribeRecommendInstanceTypeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRecommendInstanceTypeResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    public static final class Builder {
        private String requestId; 
        private Data data; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The recommended instance types.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        public DescribeRecommendInstanceTypeResponseBody build() {
            return new DescribeRecommendInstanceTypeResponseBody(this);
        } 

    } 

    public static class NetworkTypes extends TeaModel {
        @NameInMap("NetworkType")
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
    public static class Zone extends TeaModel {
        @NameInMap("ZoneNo")
        private String zoneNo;

        @NameInMap("NetworkTypes")
        private NetworkTypes networkTypes;

        private Zone(Builder builder) {
            this.zoneNo = builder.zoneNo;
            this.networkTypes = builder.networkTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Zone create() {
            return builder().build();
        }

        /**
         * @return zoneNo
         */
        public String getZoneNo() {
            return this.zoneNo;
        }

        /**
         * @return networkTypes
         */
        public NetworkTypes getNetworkTypes() {
            return this.networkTypes;
        }

        public static final class Builder {
            private String zoneNo; 
            private NetworkTypes networkTypes; 

            /**
             * The ID of the zone to which the instance type belongs.
             */
            public Builder zoneNo(String zoneNo) {
                this.zoneNo = zoneNo;
                return this;
            }

            /**
             * NetworkTypes.
             */
            public Builder networkTypes(NetworkTypes networkTypes) {
                this.networkTypes = networkTypes;
                return this;
            }

            public Zone build() {
                return new Zone(this);
            } 

        } 

    }
    public static class Zones extends TeaModel {
        @NameInMap("zone")
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
    public static class InstanceType extends TeaModel {
        @NameInMap("SupportIoOptimized")
        private String supportIoOptimized;

        @NameInMap("Cores")
        private Integer cores;

        @NameInMap("Memory")
        private Integer memory;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("InstanceTypeFamily")
        private String instanceTypeFamily;

        @NameInMap("Generation")
        private String generation;

        private InstanceType(Builder builder) {
            this.supportIoOptimized = builder.supportIoOptimized;
            this.cores = builder.cores;
            this.memory = builder.memory;
            this.instanceType = builder.instanceType;
            this.instanceTypeFamily = builder.instanceTypeFamily;
            this.generation = builder.generation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceType create() {
            return builder().build();
        }

        /**
         * @return supportIoOptimized
         */
        public String getSupportIoOptimized() {
            return this.supportIoOptimized;
        }

        /**
         * @return cores
         */
        public Integer getCores() {
            return this.cores;
        }

        /**
         * @return memory
         */
        public Integer getMemory() {
            return this.memory;
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
         * @return generation
         */
        public String getGeneration() {
            return this.generation;
        }

        public static final class Builder {
            private String supportIoOptimized; 
            private Integer cores; 
            private Integer memory; 
            private String instanceType; 
            private String instanceTypeFamily; 
            private String generation; 

            /**
             * Indicates whether the instance type supports I/O optimization.
             */
            public Builder supportIoOptimized(String supportIoOptimized) {
                this.supportIoOptimized = supportIoOptimized;
                return this;
            }

            /**
             * The number of vCPU cores of the instance type.
             */
            public Builder cores(Integer cores) {
                this.cores = cores;
                return this;
            }

            /**
             * The memory size of the instance type. Unit: MB.
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * The name of the instance type.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The instance type family.
             */
            public Builder instanceTypeFamily(String instanceTypeFamily) {
                this.instanceTypeFamily = instanceTypeFamily;
                return this;
            }

            /**
             * The instance type family.
             */
            public Builder generation(String generation) {
                this.generation = generation;
                return this;
            }

            public InstanceType build() {
                return new InstanceType(this);
            } 

        } 

    }
    public static class RecommendInstanceType extends TeaModel {
        @NameInMap("CommodityCode")
        private String commodityCode;

        @NameInMap("ZoneId")
        private String zoneId;

        @NameInMap("Priority")
        private Integer priority;

        @NameInMap("NetworkType")
        private String networkType;

        @NameInMap("Scene")
        private String scene;

        @NameInMap("SpotStrategy")
        private String spotStrategy;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @NameInMap("Zones")
        private Zones zones;

        @NameInMap("InstanceType")
        private InstanceType instanceType;

        private RecommendInstanceType(Builder builder) {
            this.commodityCode = builder.commodityCode;
            this.zoneId = builder.zoneId;
            this.priority = builder.priority;
            this.networkType = builder.networkType;
            this.scene = builder.scene;
            this.spotStrategy = builder.spotStrategy;
            this.regionId = builder.regionId;
            this.instanceChargeType = builder.instanceChargeType;
            this.zones = builder.zones;
            this.instanceType = builder.instanceType;
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
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return instanceChargeType
         */
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        /**
         * @return zones
         */
        public Zones getZones() {
            return this.zones;
        }

        /**
         * @return instanceType
         */
        public InstanceType getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private String commodityCode; 
            private String zoneId; 
            private Integer priority; 
            private String networkType; 
            private String scene; 
            private String spotStrategy; 
            private String regionId; 
            private String instanceChargeType; 
            private Zones zones; 
            private InstanceType instanceType; 

            /**
             * The product code of the instance type.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * The ID of the zone to which the instance type belongs.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * The priority of the order.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The network type of the ECS instance.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * The recommended instance type.
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * The preemptible policy of the preemptible instance.
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * The ID of the region to which the instance type belongs.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The billing method of the instance.
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * The list of zones where the instance type is located.
             */
            public Builder zones(Zones zones) {
                this.zones = zones;
                return this;
            }

            /**
             * The name of the instance type.
             */
            public Builder instanceType(InstanceType instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public RecommendInstanceType build() {
                return new RecommendInstanceType(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("RecommendInstanceType")
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
