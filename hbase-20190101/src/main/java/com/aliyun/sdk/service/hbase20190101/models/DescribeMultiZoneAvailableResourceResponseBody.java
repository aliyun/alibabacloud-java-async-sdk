// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMultiZoneAvailableResourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMultiZoneAvailableResourceResponseBody</p>
 */
public class DescribeMultiZoneAvailableResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvailableZones")
    private AvailableZones availableZones;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeMultiZoneAvailableResourceResponseBody(Builder builder) {
        this.availableZones = builder.availableZones;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMultiZoneAvailableResourceResponseBody create() {
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
         * AvailableZones.
         */
        public Builder availableZones(AvailableZones availableZones) {
            this.availableZones = availableZones;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMultiZoneAvailableResourceResponseBody build() {
            return new DescribeMultiZoneAvailableResourceResponseBody(this);
        } 

    } 

    public static class InstanceTypeDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("Mem")
        private Integer mem;

        private InstanceTypeDetail(Builder builder) {
            this.cpu = builder.cpu;
            this.mem = builder.mem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTypeDetail create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return mem
         */
        public Integer getMem() {
            return this.mem;
        }

        public static final class Builder {
            private Integer cpu; 
            private Integer mem; 

            /**
             * Cpu.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * Mem.
             */
            public Builder mem(Integer mem) {
                this.mem = mem;
                return this;
            }

            public InstanceTypeDetail build() {
                return new InstanceTypeDetail(this);
            } 

        } 

    }
    public static class MasterResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("InstanceTypeDetail")
        private InstanceTypeDetail instanceTypeDetail;

        private MasterResource(Builder builder) {
            this.instanceType = builder.instanceType;
            this.instanceTypeDetail = builder.instanceTypeDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MasterResource create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return instanceTypeDetail
         */
        public InstanceTypeDetail getInstanceTypeDetail() {
            return this.instanceTypeDetail;
        }

        public static final class Builder {
            private String instanceType; 
            private InstanceTypeDetail instanceTypeDetail; 

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * InstanceTypeDetail.
             */
            public Builder instanceTypeDetail(InstanceTypeDetail instanceTypeDetail) {
                this.instanceTypeDetail = instanceTypeDetail;
                return this;
            }

            public MasterResource build() {
                return new MasterResource(this);
            } 

        } 

    }
    public static class MasterResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MasterResource")
        private java.util.List < MasterResource> masterResource;

        private MasterResources(Builder builder) {
            this.masterResource = builder.masterResource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MasterResources create() {
            return builder().build();
        }

        /**
         * @return masterResource
         */
        public java.util.List < MasterResource> getMasterResource() {
            return this.masterResource;
        }

        public static final class Builder {
            private java.util.List < MasterResource> masterResource; 

            /**
             * MasterResource.
             */
            public Builder masterResource(java.util.List < MasterResource> masterResource) {
                this.masterResource = masterResource;
                return this;
            }

            public MasterResources build() {
                return new MasterResources(this);
            } 

        } 

    }
    public static class DBInstanceStorageRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxSize")
        private Integer maxSize;

        @com.aliyun.core.annotation.NameInMap("MinSize")
        private Integer minSize;

        @com.aliyun.core.annotation.NameInMap("StepSize")
        private Integer stepSize;

        private DBInstanceStorageRange(Builder builder) {
            this.maxSize = builder.maxSize;
            this.minSize = builder.minSize;
            this.stepSize = builder.stepSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstanceStorageRange create() {
            return builder().build();
        }

        /**
         * @return maxSize
         */
        public Integer getMaxSize() {
            return this.maxSize;
        }

        /**
         * @return minSize
         */
        public Integer getMinSize() {
            return this.minSize;
        }

        /**
         * @return stepSize
         */
        public Integer getStepSize() {
            return this.stepSize;
        }

        public static final class Builder {
            private Integer maxSize; 
            private Integer minSize; 
            private Integer stepSize; 

            /**
             * MaxSize.
             */
            public Builder maxSize(Integer maxSize) {
                this.maxSize = maxSize;
                return this;
            }

            /**
             * MinSize.
             */
            public Builder minSize(Integer minSize) {
                this.minSize = minSize;
                return this;
            }

            /**
             * StepSize.
             */
            public Builder stepSize(Integer stepSize) {
                this.stepSize = stepSize;
                return this;
            }

            public DBInstanceStorageRange build() {
                return new DBInstanceStorageRange(this);
            } 

        } 

    }
    public static class CoreResourceInstanceTypeDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("Mem")
        private Integer mem;

        private CoreResourceInstanceTypeDetail(Builder builder) {
            this.cpu = builder.cpu;
            this.mem = builder.mem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CoreResourceInstanceTypeDetail create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return mem
         */
        public Integer getMem() {
            return this.mem;
        }

        public static final class Builder {
            private Integer cpu; 
            private Integer mem; 

            /**
             * Cpu.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * Mem.
             */
            public Builder mem(Integer mem) {
                this.mem = mem;
                return this;
            }

            public CoreResourceInstanceTypeDetail build() {
                return new CoreResourceInstanceTypeDetail(this);
            } 

        } 

    }
    public static class CoreResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceStorageRange")
        private DBInstanceStorageRange DBInstanceStorageRange;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("InstanceTypeDetail")
        private CoreResourceInstanceTypeDetail instanceTypeDetail;

        @com.aliyun.core.annotation.NameInMap("MaxCoreCount")
        private Integer maxCoreCount;

        private CoreResource(Builder builder) {
            this.DBInstanceStorageRange = builder.DBInstanceStorageRange;
            this.instanceType = builder.instanceType;
            this.instanceTypeDetail = builder.instanceTypeDetail;
            this.maxCoreCount = builder.maxCoreCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CoreResource create() {
            return builder().build();
        }

        /**
         * @return DBInstanceStorageRange
         */
        public DBInstanceStorageRange getDBInstanceStorageRange() {
            return this.DBInstanceStorageRange;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return instanceTypeDetail
         */
        public CoreResourceInstanceTypeDetail getInstanceTypeDetail() {
            return this.instanceTypeDetail;
        }

        /**
         * @return maxCoreCount
         */
        public Integer getMaxCoreCount() {
            return this.maxCoreCount;
        }

        public static final class Builder {
            private DBInstanceStorageRange DBInstanceStorageRange; 
            private String instanceType; 
            private CoreResourceInstanceTypeDetail instanceTypeDetail; 
            private Integer maxCoreCount; 

            /**
             * DBInstanceStorageRange.
             */
            public Builder DBInstanceStorageRange(DBInstanceStorageRange DBInstanceStorageRange) {
                this.DBInstanceStorageRange = DBInstanceStorageRange;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * InstanceTypeDetail.
             */
            public Builder instanceTypeDetail(CoreResourceInstanceTypeDetail instanceTypeDetail) {
                this.instanceTypeDetail = instanceTypeDetail;
                return this;
            }

            /**
             * MaxCoreCount.
             */
            public Builder maxCoreCount(Integer maxCoreCount) {
                this.maxCoreCount = maxCoreCount;
                return this;
            }

            public CoreResource build() {
                return new CoreResource(this);
            } 

        } 

    }
    public static class CoreResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CoreResource")
        private java.util.List < CoreResource> coreResource;

        private CoreResources(Builder builder) {
            this.coreResource = builder.coreResource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CoreResources create() {
            return builder().build();
        }

        /**
         * @return coreResource
         */
        public java.util.List < CoreResource> getCoreResource() {
            return this.coreResource;
        }

        public static final class Builder {
            private java.util.List < CoreResource> coreResource; 

            /**
             * CoreResource.
             */
            public Builder coreResource(java.util.List < CoreResource> coreResource) {
                this.coreResource = coreResource;
                return this;
            }

            public CoreResources build() {
                return new CoreResources(this);
            } 

        } 

    }
    public static class SupportedStorageType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CoreResources")
        private CoreResources coreResources;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        private SupportedStorageType(Builder builder) {
            this.coreResources = builder.coreResources;
            this.storageType = builder.storageType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedStorageType create() {
            return builder().build();
        }

        /**
         * @return coreResources
         */
        public CoreResources getCoreResources() {
            return this.coreResources;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        public static final class Builder {
            private CoreResources coreResources; 
            private String storageType; 

            /**
             * CoreResources.
             */
            public Builder coreResources(CoreResources coreResources) {
                this.coreResources = coreResources;
                return this;
            }

            /**
             * StorageType.
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            public SupportedStorageType build() {
                return new SupportedStorageType(this);
            } 

        } 

    }
    public static class SupportedStorageTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportedStorageType")
        private java.util.List < SupportedStorageType> supportedStorageType;

        private SupportedStorageTypes(Builder builder) {
            this.supportedStorageType = builder.supportedStorageType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedStorageTypes create() {
            return builder().build();
        }

        /**
         * @return supportedStorageType
         */
        public java.util.List < SupportedStorageType> getSupportedStorageType() {
            return this.supportedStorageType;
        }

        public static final class Builder {
            private java.util.List < SupportedStorageType> supportedStorageType; 

            /**
             * SupportedStorageType.
             */
            public Builder supportedStorageType(java.util.List < SupportedStorageType> supportedStorageType) {
                this.supportedStorageType = supportedStorageType;
                return this;
            }

            public SupportedStorageTypes build() {
                return new SupportedStorageTypes(this);
            } 

        } 

    }
    public static class SupportedCategories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("SupportedStorageTypes")
        private SupportedStorageTypes supportedStorageTypes;

        private SupportedCategories(Builder builder) {
            this.category = builder.category;
            this.supportedStorageTypes = builder.supportedStorageTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedCategories create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return supportedStorageTypes
         */
        public SupportedStorageTypes getSupportedStorageTypes() {
            return this.supportedStorageTypes;
        }

        public static final class Builder {
            private String category; 
            private SupportedStorageTypes supportedStorageTypes; 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * SupportedStorageTypes.
             */
            public Builder supportedStorageTypes(SupportedStorageTypes supportedStorageTypes) {
                this.supportedStorageTypes = supportedStorageTypes;
                return this;
            }

            public SupportedCategories build() {
                return new SupportedCategories(this);
            } 

        } 

    }
    public static class SupportedEngineVersionSupportedCategories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportedCategories")
        private java.util.List < SupportedCategories> supportedCategories;

        private SupportedEngineVersionSupportedCategories(Builder builder) {
            this.supportedCategories = builder.supportedCategories;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedEngineVersionSupportedCategories create() {
            return builder().build();
        }

        /**
         * @return supportedCategories
         */
        public java.util.List < SupportedCategories> getSupportedCategories() {
            return this.supportedCategories;
        }

        public static final class Builder {
            private java.util.List < SupportedCategories> supportedCategories; 

            /**
             * SupportedCategories.
             */
            public Builder supportedCategories(java.util.List < SupportedCategories> supportedCategories) {
                this.supportedCategories = supportedCategories;
                return this;
            }

            public SupportedEngineVersionSupportedCategories build() {
                return new SupportedEngineVersionSupportedCategories(this);
            } 

        } 

    }
    public static class SupportedEngineVersion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportedCategories")
        private SupportedEngineVersionSupportedCategories supportedCategories;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private SupportedEngineVersion(Builder builder) {
            this.supportedCategories = builder.supportedCategories;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedEngineVersion create() {
            return builder().build();
        }

        /**
         * @return supportedCategories
         */
        public SupportedEngineVersionSupportedCategories getSupportedCategories() {
            return this.supportedCategories;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private SupportedEngineVersionSupportedCategories supportedCategories; 
            private String version; 

            /**
             * SupportedCategories.
             */
            public Builder supportedCategories(SupportedEngineVersionSupportedCategories supportedCategories) {
                this.supportedCategories = supportedCategories;
                return this;
            }

            /**
             * Version.
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
    public static class SupportedEngine extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("SupportedEngineVersions")
        private SupportedEngineVersions supportedEngineVersions;

        private SupportedEngine(Builder builder) {
            this.engine = builder.engine;
            this.supportedEngineVersions = builder.supportedEngineVersions;
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
         * @return supportedEngineVersions
         */
        public SupportedEngineVersions getSupportedEngineVersions() {
            return this.supportedEngineVersions;
        }

        public static final class Builder {
            private String engine; 
            private SupportedEngineVersions supportedEngineVersions; 

            /**
             * Engine.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * SupportedEngineVersions.
             */
            public Builder supportedEngineVersions(SupportedEngineVersions supportedEngineVersions) {
                this.supportedEngineVersions = supportedEngineVersions;
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
        @com.aliyun.core.annotation.NameInMap("MasterResources")
        private MasterResources masterResources;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SupportedEngines")
        private SupportedEngines supportedEngines;

        @com.aliyun.core.annotation.NameInMap("ZoneCombination")
        private String zoneCombination;

        private AvailableZone(Builder builder) {
            this.masterResources = builder.masterResources;
            this.regionId = builder.regionId;
            this.supportedEngines = builder.supportedEngines;
            this.zoneCombination = builder.zoneCombination;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableZone create() {
            return builder().build();
        }

        /**
         * @return masterResources
         */
        public MasterResources getMasterResources() {
            return this.masterResources;
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
         * @return zoneCombination
         */
        public String getZoneCombination() {
            return this.zoneCombination;
        }

        public static final class Builder {
            private MasterResources masterResources; 
            private String regionId; 
            private SupportedEngines supportedEngines; 
            private String zoneCombination; 

            /**
             * MasterResources.
             */
            public Builder masterResources(MasterResources masterResources) {
                this.masterResources = masterResources;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * SupportedEngines.
             */
            public Builder supportedEngines(SupportedEngines supportedEngines) {
                this.supportedEngines = supportedEngines;
                return this;
            }

            /**
             * ZoneCombination.
             */
            public Builder zoneCombination(String zoneCombination) {
                this.zoneCombination = zoneCombination;
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
