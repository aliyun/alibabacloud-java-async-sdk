// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAvailableResourceResponseBody</p>
 */
public class DescribeAvailableResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvailableZones")
    private AvailableZones availableZones;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAvailableResourceResponseBody(Builder builder) {
        this.availableZones = builder.availableZones;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return availableZones
     */
    public AvailableZones getAvailableZones() {
        return this.availableZones;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AvailableZones availableZones; 
        private String requestId; 

        /**
         * Details of the zones.
         */
        public Builder availableZones(AvailableZones availableZones) {
            this.availableZones = availableZones;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAvailableResourceResponseBody build() {
            return new DescribeAvailableResourceResponseBody(this);
        } 

    } 

    public static class AvailableResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Capacity")
        private Long capacity;

        @com.aliyun.core.annotation.NameInMap("InstanceClass")
        private String instanceClass;

        @com.aliyun.core.annotation.NameInMap("InstanceClassRemark")
        private String instanceClassRemark;

        private AvailableResource(Builder builder) {
            this.capacity = builder.capacity;
            this.instanceClass = builder.instanceClass;
            this.instanceClassRemark = builder.instanceClassRemark;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableResource create() {
            return builder().build();
        }

        /**
         * @return capacity
         */
        public Long getCapacity() {
            return this.capacity;
        }

        /**
         * @return instanceClass
         */
        public String getInstanceClass() {
            return this.instanceClass;
        }

        /**
         * @return instanceClassRemark
         */
        public String getInstanceClassRemark() {
            return this.instanceClassRemark;
        }

        public static final class Builder {
            private Long capacity; 
            private String instanceClass; 
            private String instanceClassRemark; 

            /**
             * The memory size of the instance. Unit: MB.
             */
            public Builder capacity(Long capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * The code of the instance type. If you want to view the code of an instance type, you can search for the code of the instance type in Help Center.
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * The description of the instance type.
             */
            public Builder instanceClassRemark(String instanceClassRemark) {
                this.instanceClassRemark = instanceClassRemark;
                return this;
            }

            public AvailableResource build() {
                return new AvailableResource(this);
            } 

        } 

    }
    public static class AvailableResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableResource")
        private java.util.List < AvailableResource> availableResource;

        private AvailableResources(Builder builder) {
            this.availableResource = builder.availableResource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableResources create() {
            return builder().build();
        }

        /**
         * @return availableResource
         */
        public java.util.List < AvailableResource> getAvailableResource() {
            return this.availableResource;
        }

        public static final class Builder {
            private java.util.List < AvailableResource> availableResource; 

            /**
             * AvailableResource.
             */
            public Builder availableResource(java.util.List < AvailableResource> availableResource) {
                this.availableResource = availableResource;
                return this;
            }

            public AvailableResources build() {
                return new AvailableResources(this);
            } 

        } 

    }
    public static class SupportedNodeType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableResources")
        private AvailableResources availableResources;

        @com.aliyun.core.annotation.NameInMap("SupportedNodeType")
        private String supportedNodeType;

        private SupportedNodeType(Builder builder) {
            this.availableResources = builder.availableResources;
            this.supportedNodeType = builder.supportedNodeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedNodeType create() {
            return builder().build();
        }

        /**
         * @return availableResources
         */
        public AvailableResources getAvailableResources() {
            return this.availableResources;
        }

        /**
         * @return supportedNodeType
         */
        public String getSupportedNodeType() {
            return this.supportedNodeType;
        }

        public static final class Builder {
            private AvailableResources availableResources; 
            private String supportedNodeType; 

            /**
             * The available instance types.
             */
            public Builder availableResources(AvailableResources availableResources) {
                this.availableResources = availableResources;
                return this;
            }

            /**
             * The node type of the instance. Valid values:
             * <p>
             * 
             * *   **single**: standalone
             * *   **double**: master-replica
             */
            public Builder supportedNodeType(String supportedNodeType) {
                this.supportedNodeType = supportedNodeType;
                return this;
            }

            public SupportedNodeType build() {
                return new SupportedNodeType(this);
            } 

        } 

    }
    public static class SupportedNodeTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportedNodeType")
        private java.util.List < SupportedNodeType> supportedNodeType;

        private SupportedNodeTypes(Builder builder) {
            this.supportedNodeType = builder.supportedNodeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedNodeTypes create() {
            return builder().build();
        }

        /**
         * @return supportedNodeType
         */
        public java.util.List < SupportedNodeType> getSupportedNodeType() {
            return this.supportedNodeType;
        }

        public static final class Builder {
            private java.util.List < SupportedNodeType> supportedNodeType; 

            /**
             * The node type of the instance. Valid values:
             * <p>
             * 
             * *   **single**: standalone
             * *   **double**: master-replica
             */
            public Builder supportedNodeType(java.util.List < SupportedNodeType> supportedNodeType) {
                this.supportedNodeType = supportedNodeType;
                return this;
            }

            public SupportedNodeTypes build() {
                return new SupportedNodeTypes(this);
            } 

        } 

    }
    public static class SupportedShardNumber extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ShardNumber")
        private String shardNumber;

        @com.aliyun.core.annotation.NameInMap("SupportedNodeTypes")
        private SupportedNodeTypes supportedNodeTypes;

        private SupportedShardNumber(Builder builder) {
            this.shardNumber = builder.shardNumber;
            this.supportedNodeTypes = builder.supportedNodeTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedShardNumber create() {
            return builder().build();
        }

        /**
         * @return shardNumber
         */
        public String getShardNumber() {
            return this.shardNumber;
        }

        /**
         * @return supportedNodeTypes
         */
        public SupportedNodeTypes getSupportedNodeTypes() {
            return this.supportedNodeTypes;
        }

        public static final class Builder {
            private String shardNumber; 
            private SupportedNodeTypes supportedNodeTypes; 

            /**
             * The number of shards.
             */
            public Builder shardNumber(String shardNumber) {
                this.shardNumber = shardNumber;
                return this;
            }

            /**
             * The available node types.
             */
            public Builder supportedNodeTypes(SupportedNodeTypes supportedNodeTypes) {
                this.supportedNodeTypes = supportedNodeTypes;
                return this;
            }

            public SupportedShardNumber build() {
                return new SupportedShardNumber(this);
            } 

        } 

    }
    public static class SupportedShardNumbers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportedShardNumber")
        private java.util.List < SupportedShardNumber> supportedShardNumber;

        private SupportedShardNumbers(Builder builder) {
            this.supportedShardNumber = builder.supportedShardNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedShardNumbers create() {
            return builder().build();
        }

        /**
         * @return supportedShardNumber
         */
        public java.util.List < SupportedShardNumber> getSupportedShardNumber() {
            return this.supportedShardNumber;
        }

        public static final class Builder {
            private java.util.List < SupportedShardNumber> supportedShardNumber; 

            /**
             * SupportedShardNumber.
             */
            public Builder supportedShardNumber(java.util.List < SupportedShardNumber> supportedShardNumber) {
                this.supportedShardNumber = supportedShardNumber;
                return this;
            }

            public SupportedShardNumbers build() {
                return new SupportedShardNumbers(this);
            } 

        } 

    }
    public static class SupportedArchitectureType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Architecture")
        private String architecture;

        @com.aliyun.core.annotation.NameInMap("SupportedShardNumbers")
        private SupportedShardNumbers supportedShardNumbers;

        private SupportedArchitectureType(Builder builder) {
            this.architecture = builder.architecture;
            this.supportedShardNumbers = builder.supportedShardNumbers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedArchitectureType create() {
            return builder().build();
        }

        /**
         * @return architecture
         */
        public String getArchitecture() {
            return this.architecture;
        }

        /**
         * @return supportedShardNumbers
         */
        public SupportedShardNumbers getSupportedShardNumbers() {
            return this.supportedShardNumbers;
        }

        public static final class Builder {
            private String architecture; 
            private SupportedShardNumbers supportedShardNumbers; 

            /**
             * The architecture of the instance. Valid values:
             * <p>
             * 
             * *   **standard**: standard architecture
             * *   **cluster**: cluster architecture
             * *   **rwsplit**: read/write splitting architecture
             */
            public Builder architecture(String architecture) {
                this.architecture = architecture;
                return this;
            }

            /**
             * The numbers of shards that are allowed.
             */
            public Builder supportedShardNumbers(SupportedShardNumbers supportedShardNumbers) {
                this.supportedShardNumbers = supportedShardNumbers;
                return this;
            }

            public SupportedArchitectureType build() {
                return new SupportedArchitectureType(this);
            } 

        } 

    }
    public static class SupportedArchitectureTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportedArchitectureType")
        private java.util.List < SupportedArchitectureType> supportedArchitectureType;

        private SupportedArchitectureTypes(Builder builder) {
            this.supportedArchitectureType = builder.supportedArchitectureType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedArchitectureTypes create() {
            return builder().build();
        }

        /**
         * @return supportedArchitectureType
         */
        public java.util.List < SupportedArchitectureType> getSupportedArchitectureType() {
            return this.supportedArchitectureType;
        }

        public static final class Builder {
            private java.util.List < SupportedArchitectureType> supportedArchitectureType; 

            /**
             * SupportedArchitectureType.
             */
            public Builder supportedArchitectureType(java.util.List < SupportedArchitectureType> supportedArchitectureType) {
                this.supportedArchitectureType = supportedArchitectureType;
                return this;
            }

            public SupportedArchitectureTypes build() {
                return new SupportedArchitectureTypes(this);
            } 

        } 

    }
    public static class SupportedEngineVersion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportedArchitectureTypes")
        private SupportedArchitectureTypes supportedArchitectureTypes;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private SupportedEngineVersion(Builder builder) {
            this.supportedArchitectureTypes = builder.supportedArchitectureTypes;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedEngineVersion create() {
            return builder().build();
        }

        /**
         * @return supportedArchitectureTypes
         */
        public SupportedArchitectureTypes getSupportedArchitectureTypes() {
            return this.supportedArchitectureTypes;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private SupportedArchitectureTypes supportedArchitectureTypes; 
            private String version; 

            /**
             * The available instance architectures.
             */
            public Builder supportedArchitectureTypes(SupportedArchitectureTypes supportedArchitectureTypes) {
                this.supportedArchitectureTypes = supportedArchitectureTypes;
                return this;
            }

            /**
             * The engine version of the instance.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public SupportedEngineVersion build() {
                return new SupportedEngineVersion(this);
            } 

        } 

    }
    public static class SupportedEngineVersions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportedEngineVersion")
        private java.util.List < SupportedEngineVersion> supportedEngineVersion;

        private SupportedEngineVersions(Builder builder) {
            this.supportedEngineVersion = builder.supportedEngineVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedEngineVersions create() {
            return builder().build();
        }

        /**
         * @return supportedEngineVersion
         */
        public java.util.List < SupportedEngineVersion> getSupportedEngineVersion() {
            return this.supportedEngineVersion;
        }

        public static final class Builder {
            private java.util.List < SupportedEngineVersion> supportedEngineVersion; 

            /**
             * SupportedEngineVersion.
             */
            public Builder supportedEngineVersion(java.util.List < SupportedEngineVersion> supportedEngineVersion) {
                this.supportedEngineVersion = supportedEngineVersion;
                return this;
            }

            public SupportedEngineVersions build() {
                return new SupportedEngineVersions(this);
            } 

        } 

    }
    public static class SupportedSeriesType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SeriesType")
        private String seriesType;

        @com.aliyun.core.annotation.NameInMap("SupportedEngineVersions")
        private SupportedEngineVersions supportedEngineVersions;

        private SupportedSeriesType(Builder builder) {
            this.seriesType = builder.seriesType;
            this.supportedEngineVersions = builder.supportedEngineVersions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedSeriesType create() {
            return builder().build();
        }

        /**
         * @return seriesType
         */
        public String getSeriesType() {
            return this.seriesType;
        }

        /**
         * @return supportedEngineVersions
         */
        public SupportedEngineVersions getSupportedEngineVersions() {
            return this.supportedEngineVersions;
        }

        public static final class Builder {
            private String seriesType; 
            private SupportedEngineVersions supportedEngineVersions; 

            /**
             * The instance series. Valid values:
             * <p>
             * 
             * *   **enhanced_performance_type**: ApsaraDB for Redis Enhanced Edition (Tair) DRAM-based instance
             * *   **hybrid_storage**: ApsaraDB for Redis Community Edition hybrid-storage instance
             */
            public Builder seriesType(String seriesType) {
                this.seriesType = seriesType;
                return this;
            }

            /**
             * The available engine versions.
             */
            public Builder supportedEngineVersions(SupportedEngineVersions supportedEngineVersions) {
                this.supportedEngineVersions = supportedEngineVersions;
                return this;
            }

            public SupportedSeriesType build() {
                return new SupportedSeriesType(this);
            } 

        } 

    }
    public static class SupportedSeriesTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportedSeriesType")
        private java.util.List < SupportedSeriesType> supportedSeriesType;

        private SupportedSeriesTypes(Builder builder) {
            this.supportedSeriesType = builder.supportedSeriesType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedSeriesTypes create() {
            return builder().build();
        }

        /**
         * @return supportedSeriesType
         */
        public java.util.List < SupportedSeriesType> getSupportedSeriesType() {
            return this.supportedSeriesType;
        }

        public static final class Builder {
            private java.util.List < SupportedSeriesType> supportedSeriesType; 

            /**
             * SupportedSeriesType.
             */
            public Builder supportedSeriesType(java.util.List < SupportedSeriesType> supportedSeriesType) {
                this.supportedSeriesType = supportedSeriesType;
                return this;
            }

            public SupportedSeriesTypes build() {
                return new SupportedSeriesTypes(this);
            } 

        } 

    }
    public static class SupportedEditionType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EditionType")
        private String editionType;

        @com.aliyun.core.annotation.NameInMap("SupportedSeriesTypes")
        private SupportedSeriesTypes supportedSeriesTypes;

        private SupportedEditionType(Builder builder) {
            this.editionType = builder.editionType;
            this.supportedSeriesTypes = builder.supportedSeriesTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedEditionType create() {
            return builder().build();
        }

        /**
         * @return editionType
         */
        public String getEditionType() {
            return this.editionType;
        }

        /**
         * @return supportedSeriesTypes
         */
        public SupportedSeriesTypes getSupportedSeriesTypes() {
            return this.supportedSeriesTypes;
        }

        public static final class Builder {
            private String editionType; 
            private SupportedSeriesTypes supportedSeriesTypes; 

            /**
             * The edition of the instance. Valid values:
             * <p>
             * 
             * *   **Community**: Community Edition
             * *   **Enterprise**: Enhanced Edition (Tair)
             */
            public Builder editionType(String editionType) {
                this.editionType = editionType;
                return this;
            }

            /**
             * The available instance series.
             */
            public Builder supportedSeriesTypes(SupportedSeriesTypes supportedSeriesTypes) {
                this.supportedSeriesTypes = supportedSeriesTypes;
                return this;
            }

            public SupportedEditionType build() {
                return new SupportedEditionType(this);
            } 

        } 

    }
    public static class SupportedEditionTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportedEditionType")
        private java.util.List < SupportedEditionType> supportedEditionType;

        private SupportedEditionTypes(Builder builder) {
            this.supportedEditionType = builder.supportedEditionType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedEditionTypes create() {
            return builder().build();
        }

        /**
         * @return supportedEditionType
         */
        public java.util.List < SupportedEditionType> getSupportedEditionType() {
            return this.supportedEditionType;
        }

        public static final class Builder {
            private java.util.List < SupportedEditionType> supportedEditionType; 

            /**
             * SupportedEditionType.
             */
            public Builder supportedEditionType(java.util.List < SupportedEditionType> supportedEditionType) {
                this.supportedEditionType = supportedEditionType;
                return this;
            }

            public SupportedEditionTypes build() {
                return new SupportedEditionTypes(this);
            } 

        } 

    }
    public static class SupportedEngine extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("SupportedEditionTypes")
        private SupportedEditionTypes supportedEditionTypes;

        private SupportedEngine(Builder builder) {
            this.engine = builder.engine;
            this.supportedEditionTypes = builder.supportedEditionTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedEngine create() {
            return builder().build();
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return supportedEditionTypes
         */
        public SupportedEditionTypes getSupportedEditionTypes() {
            return this.supportedEditionTypes;
        }

        public static final class Builder {
            private String engine; 
            private SupportedEditionTypes supportedEditionTypes; 

            /**
             * The database engine of the instance.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * The available instance editions.
             */
            public Builder supportedEditionTypes(SupportedEditionTypes supportedEditionTypes) {
                this.supportedEditionTypes = supportedEditionTypes;
                return this;
            }

            public SupportedEngine build() {
                return new SupportedEngine(this);
            } 

        } 

    }
    public static class SupportedEngines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportedEngine")
        private java.util.List < SupportedEngine> supportedEngine;

        private SupportedEngines(Builder builder) {
            this.supportedEngine = builder.supportedEngine;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedEngines create() {
            return builder().build();
        }

        /**
         * @return supportedEngine
         */
        public java.util.List < SupportedEngine> getSupportedEngine() {
            return this.supportedEngine;
        }

        public static final class Builder {
            private java.util.List < SupportedEngine> supportedEngine; 

            /**
             * SupportedEngine.
             */
            public Builder supportedEngine(java.util.List < SupportedEngine> supportedEngine) {
                this.supportedEngine = supportedEngine;
                return this;
            }

            public SupportedEngines build() {
                return new SupportedEngines(this);
            } 

        } 

    }
    public static class AvailableZone extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SupportedEngines")
        private SupportedEngines supportedEngines;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        @com.aliyun.core.annotation.NameInMap("ZoneName")
        private String zoneName;

        private AvailableZone(Builder builder) {
            this.regionId = builder.regionId;
            this.supportedEngines = builder.supportedEngines;
            this.zoneId = builder.zoneId;
            this.zoneName = builder.zoneName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableZone create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return supportedEngines
         */
        public SupportedEngines getSupportedEngines() {
            return this.supportedEngines;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        /**
         * @return zoneName
         */
        public String getZoneName() {
            return this.zoneName;
        }

        public static final class Builder {
            private String regionId; 
            private SupportedEngines supportedEngines; 
            private String zoneId; 
            private String zoneName; 

            /**
             * The ID of the region.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The available database engines.
             */
            public Builder supportedEngines(SupportedEngines supportedEngines) {
                this.supportedEngines = supportedEngines;
                return this;
            }

            /**
             * The ID of the zone in which the instance is located.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * The name of the zone.
             */
            public Builder zoneName(String zoneName) {
                this.zoneName = zoneName;
                return this;
            }

            public AvailableZone build() {
                return new AvailableZone(this);
            } 

        } 

    }
    public static class AvailableZones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableZone")
        private java.util.List < AvailableZone> availableZone;

        private AvailableZones(Builder builder) {
            this.availableZone = builder.availableZone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableZones create() {
            return builder().build();
        }

        /**
         * @return availableZone
         */
        public java.util.List < AvailableZone> getAvailableZone() {
            return this.availableZone;
        }

        public static final class Builder {
            private java.util.List < AvailableZone> availableZone; 

            /**
             * AvailableZone.
             */
            public Builder availableZone(java.util.List < AvailableZone> availableZone) {
                this.availableZone = availableZone;
                return this;
            }

            public AvailableZones build() {
                return new AvailableZones(this);
            } 

        } 

    }
}
