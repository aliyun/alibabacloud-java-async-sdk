// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeZonesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeZonesResponseBody</p>
 */
public class DescribeZonesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Zones")
    private Zones zones;

    private DescribeZonesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.zones = builder.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeZonesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return zones
     */
    public Zones getZones() {
        return this.zones;
    }

    public static final class Builder {
        private String requestId; 
        private Zones zones; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Zones.
         */
        public Builder zones(Zones zones) {
            this.zones = zones;
            return this;
        }

        public DescribeZonesResponseBody build() {
            return new DescribeZonesResponseBody(this);
        } 

    } 

    public static class AvailableDedicatedHostTypes extends TeaModel {
        @NameInMap("DedicatedHostType")
        private java.util.List < String > dedicatedHostType;

        private AvailableDedicatedHostTypes(Builder builder) {
            this.dedicatedHostType = builder.dedicatedHostType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableDedicatedHostTypes create() {
            return builder().build();
        }

        /**
         * @return dedicatedHostType
         */
        public java.util.List < String > getDedicatedHostType() {
            return this.dedicatedHostType;
        }

        public static final class Builder {
            private java.util.List < String > dedicatedHostType; 

            /**
             * DedicatedHostType.
             */
            public Builder dedicatedHostType(java.util.List < String > dedicatedHostType) {
                this.dedicatedHostType = dedicatedHostType;
                return this;
            }

            public AvailableDedicatedHostTypes build() {
                return new AvailableDedicatedHostTypes(this);
            } 

        } 

    }
    public static class AvailableDiskCategories extends TeaModel {
        @NameInMap("DiskCategories")
        private java.util.List < String > diskCategories;

        private AvailableDiskCategories(Builder builder) {
            this.diskCategories = builder.diskCategories;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableDiskCategories create() {
            return builder().build();
        }

        /**
         * @return diskCategories
         */
        public java.util.List < String > getDiskCategories() {
            return this.diskCategories;
        }

        public static final class Builder {
            private java.util.List < String > diskCategories; 

            /**
             * DiskCategories.
             */
            public Builder diskCategories(java.util.List < String > diskCategories) {
                this.diskCategories = diskCategories;
                return this;
            }

            public AvailableDiskCategories build() {
                return new AvailableDiskCategories(this);
            } 

        } 

    }
    public static class AvailableInstanceTypes extends TeaModel {
        @NameInMap("InstanceTypes")
        private java.util.List < String > instanceTypes;

        private AvailableInstanceTypes(Builder builder) {
            this.instanceTypes = builder.instanceTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableInstanceTypes create() {
            return builder().build();
        }

        /**
         * @return instanceTypes
         */
        public java.util.List < String > getInstanceTypes() {
            return this.instanceTypes;
        }

        public static final class Builder {
            private java.util.List < String > instanceTypes; 

            /**
             * InstanceTypes.
             */
            public Builder instanceTypes(java.util.List < String > instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            public AvailableInstanceTypes build() {
                return new AvailableInstanceTypes(this);
            } 

        } 

    }
    public static class AvailableResourceCreation extends TeaModel {
        @NameInMap("ResourceTypes")
        private java.util.List < String > resourceTypes;

        private AvailableResourceCreation(Builder builder) {
            this.resourceTypes = builder.resourceTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableResourceCreation create() {
            return builder().build();
        }

        /**
         * @return resourceTypes
         */
        public java.util.List < String > getResourceTypes() {
            return this.resourceTypes;
        }

        public static final class Builder {
            private java.util.List < String > resourceTypes; 

            /**
             * ResourceTypes.
             */
            public Builder resourceTypes(java.util.List < String > resourceTypes) {
                this.resourceTypes = resourceTypes;
                return this;
            }

            public AvailableResourceCreation build() {
                return new AvailableResourceCreation(this);
            } 

        } 

    }
    public static class DataDiskCategories extends TeaModel {
        @NameInMap("supportedDataDiskCategory")
        private java.util.List < String > supportedDataDiskCategory;

        private DataDiskCategories(Builder builder) {
            this.supportedDataDiskCategory = builder.supportedDataDiskCategory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDiskCategories create() {
            return builder().build();
        }

        /**
         * @return supportedDataDiskCategory
         */
        public java.util.List < String > getSupportedDataDiskCategory() {
            return this.supportedDataDiskCategory;
        }

        public static final class Builder {
            private java.util.List < String > supportedDataDiskCategory; 

            /**
             * supportedDataDiskCategory.
             */
            public Builder supportedDataDiskCategory(java.util.List < String > supportedDataDiskCategory) {
                this.supportedDataDiskCategory = supportedDataDiskCategory;
                return this;
            }

            public DataDiskCategories build() {
                return new DataDiskCategories(this);
            } 

        } 

    }
    public static class InstanceGenerations extends TeaModel {
        @NameInMap("supportedInstanceGeneration")
        private java.util.List < String > supportedInstanceGeneration;

        private InstanceGenerations(Builder builder) {
            this.supportedInstanceGeneration = builder.supportedInstanceGeneration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceGenerations create() {
            return builder().build();
        }

        /**
         * @return supportedInstanceGeneration
         */
        public java.util.List < String > getSupportedInstanceGeneration() {
            return this.supportedInstanceGeneration;
        }

        public static final class Builder {
            private java.util.List < String > supportedInstanceGeneration; 

            /**
             * supportedInstanceGeneration.
             */
            public Builder supportedInstanceGeneration(java.util.List < String > supportedInstanceGeneration) {
                this.supportedInstanceGeneration = supportedInstanceGeneration;
                return this;
            }

            public InstanceGenerations build() {
                return new InstanceGenerations(this);
            } 

        } 

    }
    public static class InstanceTypeFamilies extends TeaModel {
        @NameInMap("supportedInstanceTypeFamily")
        private java.util.List < String > supportedInstanceTypeFamily;

        private InstanceTypeFamilies(Builder builder) {
            this.supportedInstanceTypeFamily = builder.supportedInstanceTypeFamily;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTypeFamilies create() {
            return builder().build();
        }

        /**
         * @return supportedInstanceTypeFamily
         */
        public java.util.List < String > getSupportedInstanceTypeFamily() {
            return this.supportedInstanceTypeFamily;
        }

        public static final class Builder {
            private java.util.List < String > supportedInstanceTypeFamily; 

            /**
             * supportedInstanceTypeFamily.
             */
            public Builder supportedInstanceTypeFamily(java.util.List < String > supportedInstanceTypeFamily) {
                this.supportedInstanceTypeFamily = supportedInstanceTypeFamily;
                return this;
            }

            public InstanceTypeFamilies build() {
                return new InstanceTypeFamilies(this);
            } 

        } 

    }
    public static class InstanceTypes extends TeaModel {
        @NameInMap("supportedInstanceType")
        private java.util.List < String > supportedInstanceType;

        private InstanceTypes(Builder builder) {
            this.supportedInstanceType = builder.supportedInstanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTypes create() {
            return builder().build();
        }

        /**
         * @return supportedInstanceType
         */
        public java.util.List < String > getSupportedInstanceType() {
            return this.supportedInstanceType;
        }

        public static final class Builder {
            private java.util.List < String > supportedInstanceType; 

            /**
             * supportedInstanceType.
             */
            public Builder supportedInstanceType(java.util.List < String > supportedInstanceType) {
                this.supportedInstanceType = supportedInstanceType;
                return this;
            }

            public InstanceTypes build() {
                return new InstanceTypes(this);
            } 

        } 

    }
    public static class NetworkTypes extends TeaModel {
        @NameInMap("supportedNetworkCategory")
        private java.util.List < String > supportedNetworkCategory;

        private NetworkTypes(Builder builder) {
            this.supportedNetworkCategory = builder.supportedNetworkCategory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkTypes create() {
            return builder().build();
        }

        /**
         * @return supportedNetworkCategory
         */
        public java.util.List < String > getSupportedNetworkCategory() {
            return this.supportedNetworkCategory;
        }

        public static final class Builder {
            private java.util.List < String > supportedNetworkCategory; 

            /**
             * supportedNetworkCategory.
             */
            public Builder supportedNetworkCategory(java.util.List < String > supportedNetworkCategory) {
                this.supportedNetworkCategory = supportedNetworkCategory;
                return this;
            }

            public NetworkTypes build() {
                return new NetworkTypes(this);
            } 

        } 

    }
    public static class SystemDiskCategories extends TeaModel {
        @NameInMap("supportedSystemDiskCategory")
        private java.util.List < String > supportedSystemDiskCategory;

        private SystemDiskCategories(Builder builder) {
            this.supportedSystemDiskCategory = builder.supportedSystemDiskCategory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemDiskCategories create() {
            return builder().build();
        }

        /**
         * @return supportedSystemDiskCategory
         */
        public java.util.List < String > getSupportedSystemDiskCategory() {
            return this.supportedSystemDiskCategory;
        }

        public static final class Builder {
            private java.util.List < String > supportedSystemDiskCategory; 

            /**
             * supportedSystemDiskCategory.
             */
            public Builder supportedSystemDiskCategory(java.util.List < String > supportedSystemDiskCategory) {
                this.supportedSystemDiskCategory = supportedSystemDiskCategory;
                return this;
            }

            public SystemDiskCategories build() {
                return new SystemDiskCategories(this);
            } 

        } 

    }
    public static class ResourcesInfo extends TeaModel {
        @NameInMap("DataDiskCategories")
        private DataDiskCategories dataDiskCategories;

        @NameInMap("InstanceGenerations")
        private InstanceGenerations instanceGenerations;

        @NameInMap("InstanceTypeFamilies")
        private InstanceTypeFamilies instanceTypeFamilies;

        @NameInMap("InstanceTypes")
        private InstanceTypes instanceTypes;

        @NameInMap("IoOptimized")
        private Boolean ioOptimized;

        @NameInMap("NetworkTypes")
        private NetworkTypes networkTypes;

        @NameInMap("SystemDiskCategories")
        private SystemDiskCategories systemDiskCategories;

        private ResourcesInfo(Builder builder) {
            this.dataDiskCategories = builder.dataDiskCategories;
            this.instanceGenerations = builder.instanceGenerations;
            this.instanceTypeFamilies = builder.instanceTypeFamilies;
            this.instanceTypes = builder.instanceTypes;
            this.ioOptimized = builder.ioOptimized;
            this.networkTypes = builder.networkTypes;
            this.systemDiskCategories = builder.systemDiskCategories;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourcesInfo create() {
            return builder().build();
        }

        /**
         * @return dataDiskCategories
         */
        public DataDiskCategories getDataDiskCategories() {
            return this.dataDiskCategories;
        }

        /**
         * @return instanceGenerations
         */
        public InstanceGenerations getInstanceGenerations() {
            return this.instanceGenerations;
        }

        /**
         * @return instanceTypeFamilies
         */
        public InstanceTypeFamilies getInstanceTypeFamilies() {
            return this.instanceTypeFamilies;
        }

        /**
         * @return instanceTypes
         */
        public InstanceTypes getInstanceTypes() {
            return this.instanceTypes;
        }

        /**
         * @return ioOptimized
         */
        public Boolean getIoOptimized() {
            return this.ioOptimized;
        }

        /**
         * @return networkTypes
         */
        public NetworkTypes getNetworkTypes() {
            return this.networkTypes;
        }

        /**
         * @return systemDiskCategories
         */
        public SystemDiskCategories getSystemDiskCategories() {
            return this.systemDiskCategories;
        }

        public static final class Builder {
            private DataDiskCategories dataDiskCategories; 
            private InstanceGenerations instanceGenerations; 
            private InstanceTypeFamilies instanceTypeFamilies; 
            private InstanceTypes instanceTypes; 
            private Boolean ioOptimized; 
            private NetworkTypes networkTypes; 
            private SystemDiskCategories systemDiskCategories; 

            /**
             * DataDiskCategories.
             */
            public Builder dataDiskCategories(DataDiskCategories dataDiskCategories) {
                this.dataDiskCategories = dataDiskCategories;
                return this;
            }

            /**
             * InstanceGenerations.
             */
            public Builder instanceGenerations(InstanceGenerations instanceGenerations) {
                this.instanceGenerations = instanceGenerations;
                return this;
            }

            /**
             * InstanceTypeFamilies.
             */
            public Builder instanceTypeFamilies(InstanceTypeFamilies instanceTypeFamilies) {
                this.instanceTypeFamilies = instanceTypeFamilies;
                return this;
            }

            /**
             * InstanceTypes.
             */
            public Builder instanceTypes(InstanceTypes instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            /**
             * IoOptimized.
             */
            public Builder ioOptimized(Boolean ioOptimized) {
                this.ioOptimized = ioOptimized;
                return this;
            }

            /**
             * NetworkTypes.
             */
            public Builder networkTypes(NetworkTypes networkTypes) {
                this.networkTypes = networkTypes;
                return this;
            }

            /**
             * SystemDiskCategories.
             */
            public Builder systemDiskCategories(SystemDiskCategories systemDiskCategories) {
                this.systemDiskCategories = systemDiskCategories;
                return this;
            }

            public ResourcesInfo build() {
                return new ResourcesInfo(this);
            } 

        } 

    }
    public static class AvailableResources extends TeaModel {
        @NameInMap("ResourcesInfo")
        private java.util.List < ResourcesInfo> resourcesInfo;

        private AvailableResources(Builder builder) {
            this.resourcesInfo = builder.resourcesInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableResources create() {
            return builder().build();
        }

        /**
         * @return resourcesInfo
         */
        public java.util.List < ResourcesInfo> getResourcesInfo() {
            return this.resourcesInfo;
        }

        public static final class Builder {
            private java.util.List < ResourcesInfo> resourcesInfo; 

            /**
             * ResourcesInfo.
             */
            public Builder resourcesInfo(java.util.List < ResourcesInfo> resourcesInfo) {
                this.resourcesInfo = resourcesInfo;
                return this;
            }

            public AvailableResources build() {
                return new AvailableResources(this);
            } 

        } 

    }
    public static class AvailableVolumeCategories extends TeaModel {
        @NameInMap("VolumeCategories")
        private java.util.List < String > volumeCategories;

        private AvailableVolumeCategories(Builder builder) {
            this.volumeCategories = builder.volumeCategories;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableVolumeCategories create() {
            return builder().build();
        }

        /**
         * @return volumeCategories
         */
        public java.util.List < String > getVolumeCategories() {
            return this.volumeCategories;
        }

        public static final class Builder {
            private java.util.List < String > volumeCategories; 

            /**
             * VolumeCategories.
             */
            public Builder volumeCategories(java.util.List < String > volumeCategories) {
                this.volumeCategories = volumeCategories;
                return this;
            }

            public AvailableVolumeCategories build() {
                return new AvailableVolumeCategories(this);
            } 

        } 

    }
    public static class DedicatedHostGenerations extends TeaModel {
        @NameInMap("DedicatedHostGeneration")
        private java.util.List < String > dedicatedHostGeneration;

        private DedicatedHostGenerations(Builder builder) {
            this.dedicatedHostGeneration = builder.dedicatedHostGeneration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicatedHostGenerations create() {
            return builder().build();
        }

        /**
         * @return dedicatedHostGeneration
         */
        public java.util.List < String > getDedicatedHostGeneration() {
            return this.dedicatedHostGeneration;
        }

        public static final class Builder {
            private java.util.List < String > dedicatedHostGeneration; 

            /**
             * DedicatedHostGeneration.
             */
            public Builder dedicatedHostGeneration(java.util.List < String > dedicatedHostGeneration) {
                this.dedicatedHostGeneration = dedicatedHostGeneration;
                return this;
            }

            public DedicatedHostGenerations build() {
                return new DedicatedHostGenerations(this);
            } 

        } 

    }
    public static class Zone extends TeaModel {
        @NameInMap("AvailableDedicatedHostTypes")
        private AvailableDedicatedHostTypes availableDedicatedHostTypes;

        @NameInMap("AvailableDiskCategories")
        private AvailableDiskCategories availableDiskCategories;

        @NameInMap("AvailableInstanceTypes")
        private AvailableInstanceTypes availableInstanceTypes;

        @NameInMap("AvailableResourceCreation")
        private AvailableResourceCreation availableResourceCreation;

        @NameInMap("AvailableResources")
        private AvailableResources availableResources;

        @NameInMap("AvailableVolumeCategories")
        private AvailableVolumeCategories availableVolumeCategories;

        @NameInMap("DedicatedHostGenerations")
        private DedicatedHostGenerations dedicatedHostGenerations;

        @NameInMap("LocalName")
        private String localName;

        @NameInMap("ZoneId")
        private String zoneId;

        @NameInMap("ZoneType")
        private String zoneType;

        private Zone(Builder builder) {
            this.availableDedicatedHostTypes = builder.availableDedicatedHostTypes;
            this.availableDiskCategories = builder.availableDiskCategories;
            this.availableInstanceTypes = builder.availableInstanceTypes;
            this.availableResourceCreation = builder.availableResourceCreation;
            this.availableResources = builder.availableResources;
            this.availableVolumeCategories = builder.availableVolumeCategories;
            this.dedicatedHostGenerations = builder.dedicatedHostGenerations;
            this.localName = builder.localName;
            this.zoneId = builder.zoneId;
            this.zoneType = builder.zoneType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Zone create() {
            return builder().build();
        }

        /**
         * @return availableDedicatedHostTypes
         */
        public AvailableDedicatedHostTypes getAvailableDedicatedHostTypes() {
            return this.availableDedicatedHostTypes;
        }

        /**
         * @return availableDiskCategories
         */
        public AvailableDiskCategories getAvailableDiskCategories() {
            return this.availableDiskCategories;
        }

        /**
         * @return availableInstanceTypes
         */
        public AvailableInstanceTypes getAvailableInstanceTypes() {
            return this.availableInstanceTypes;
        }

        /**
         * @return availableResourceCreation
         */
        public AvailableResourceCreation getAvailableResourceCreation() {
            return this.availableResourceCreation;
        }

        /**
         * @return availableResources
         */
        public AvailableResources getAvailableResources() {
            return this.availableResources;
        }

        /**
         * @return availableVolumeCategories
         */
        public AvailableVolumeCategories getAvailableVolumeCategories() {
            return this.availableVolumeCategories;
        }

        /**
         * @return dedicatedHostGenerations
         */
        public DedicatedHostGenerations getDedicatedHostGenerations() {
            return this.dedicatedHostGenerations;
        }

        /**
         * @return localName
         */
        public String getLocalName() {
            return this.localName;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        /**
         * @return zoneType
         */
        public String getZoneType() {
            return this.zoneType;
        }

        public static final class Builder {
            private AvailableDedicatedHostTypes availableDedicatedHostTypes; 
            private AvailableDiskCategories availableDiskCategories; 
            private AvailableInstanceTypes availableInstanceTypes; 
            private AvailableResourceCreation availableResourceCreation; 
            private AvailableResources availableResources; 
            private AvailableVolumeCategories availableVolumeCategories; 
            private DedicatedHostGenerations dedicatedHostGenerations; 
            private String localName; 
            private String zoneId; 
            private String zoneType; 

            /**
             * AvailableDedicatedHostTypes.
             */
            public Builder availableDedicatedHostTypes(AvailableDedicatedHostTypes availableDedicatedHostTypes) {
                this.availableDedicatedHostTypes = availableDedicatedHostTypes;
                return this;
            }

            /**
             * AvailableDiskCategories.
             */
            public Builder availableDiskCategories(AvailableDiskCategories availableDiskCategories) {
                this.availableDiskCategories = availableDiskCategories;
                return this;
            }

            /**
             * AvailableInstanceTypes.
             */
            public Builder availableInstanceTypes(AvailableInstanceTypes availableInstanceTypes) {
                this.availableInstanceTypes = availableInstanceTypes;
                return this;
            }

            /**
             * AvailableResourceCreation.
             */
            public Builder availableResourceCreation(AvailableResourceCreation availableResourceCreation) {
                this.availableResourceCreation = availableResourceCreation;
                return this;
            }

            /**
             * AvailableResources.
             */
            public Builder availableResources(AvailableResources availableResources) {
                this.availableResources = availableResources;
                return this;
            }

            /**
             * AvailableVolumeCategories.
             */
            public Builder availableVolumeCategories(AvailableVolumeCategories availableVolumeCategories) {
                this.availableVolumeCategories = availableVolumeCategories;
                return this;
            }

            /**
             * DedicatedHostGenerations.
             */
            public Builder dedicatedHostGenerations(DedicatedHostGenerations dedicatedHostGenerations) {
                this.dedicatedHostGenerations = dedicatedHostGenerations;
                return this;
            }

            /**
             * LocalName.
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * ZoneType.
             */
            public Builder zoneType(String zoneType) {
                this.zoneType = zoneType;
                return this;
            }

            public Zone build() {
                return new Zone(this);
            } 

        } 

    }
    public static class Zones extends TeaModel {
        @NameInMap("Zone")
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
             * Zone.
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
}
