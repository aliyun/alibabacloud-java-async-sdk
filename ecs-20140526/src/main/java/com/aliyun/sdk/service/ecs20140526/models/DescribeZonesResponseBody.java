// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribeZonesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeZonesResponseBody</p>
 */
public class DescribeZonesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Zones")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeZonesResponseBody model) {
            this.requestId = model.requestId;
            this.zones = model.zones;
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

        /**
         * <p>Details about the zones and their supported resources.</p>
         */
        public Builder zones(Zones zones) {
            this.zones = zones;
            return this;
        }

        public DescribeZonesResponseBody build() {
            return new DescribeZonesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeZonesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeZonesResponseBody</p>
     */
    public static class AvailableDedicatedHostTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DedicatedHostType")
        private java.util.List<String> dedicatedHostType;

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
        public java.util.List<String> getDedicatedHostType() {
            return this.dedicatedHostType;
        }

        public static final class Builder {
            private java.util.List<String> dedicatedHostType; 

            private Builder() {
            } 

            private Builder(AvailableDedicatedHostTypes model) {
                this.dedicatedHostType = model.dedicatedHostType;
            } 

            /**
             * DedicatedHostType.
             */
            public Builder dedicatedHostType(java.util.List<String> dedicatedHostType) {
                this.dedicatedHostType = dedicatedHostType;
                return this;
            }

            public AvailableDedicatedHostTypes build() {
                return new AvailableDedicatedHostTypes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeZonesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeZonesResponseBody</p>
     */
    public static class AvailableDiskCategories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiskCategories")
        private java.util.List<String> diskCategories;

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
        public java.util.List<String> getDiskCategories() {
            return this.diskCategories;
        }

        public static final class Builder {
            private java.util.List<String> diskCategories; 

            private Builder() {
            } 

            private Builder(AvailableDiskCategories model) {
                this.diskCategories = model.diskCategories;
            } 

            /**
             * DiskCategories.
             */
            public Builder diskCategories(java.util.List<String> diskCategories) {
                this.diskCategories = diskCategories;
                return this;
            }

            public AvailableDiskCategories build() {
                return new AvailableDiskCategories(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeZonesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeZonesResponseBody</p>
     */
    public static class AvailableInstanceTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceTypes")
        private java.util.List<String> instanceTypes;

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
        public java.util.List<String> getInstanceTypes() {
            return this.instanceTypes;
        }

        public static final class Builder {
            private java.util.List<String> instanceTypes; 

            private Builder() {
            } 

            private Builder(AvailableInstanceTypes model) {
                this.instanceTypes = model.instanceTypes;
            } 

            /**
             * InstanceTypes.
             */
            public Builder instanceTypes(java.util.List<String> instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            public AvailableInstanceTypes build() {
                return new AvailableInstanceTypes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeZonesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeZonesResponseBody</p>
     */
    public static class AvailableResourceCreation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceTypes")
        private java.util.List<String> resourceTypes;

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
        public java.util.List<String> getResourceTypes() {
            return this.resourceTypes;
        }

        public static final class Builder {
            private java.util.List<String> resourceTypes; 

            private Builder() {
            } 

            private Builder(AvailableResourceCreation model) {
                this.resourceTypes = model.resourceTypes;
            } 

            /**
             * ResourceTypes.
             */
            public Builder resourceTypes(java.util.List<String> resourceTypes) {
                this.resourceTypes = resourceTypes;
                return this;
            }

            public AvailableResourceCreation build() {
                return new AvailableResourceCreation(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeZonesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeZonesResponseBody</p>
     */
    public static class DataDiskCategories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("supportedDataDiskCategory")
        private java.util.List<String> supportedDataDiskCategory;

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
        public java.util.List<String> getSupportedDataDiskCategory() {
            return this.supportedDataDiskCategory;
        }

        public static final class Builder {
            private java.util.List<String> supportedDataDiskCategory; 

            private Builder() {
            } 

            private Builder(DataDiskCategories model) {
                this.supportedDataDiskCategory = model.supportedDataDiskCategory;
            } 

            /**
             * supportedDataDiskCategory.
             */
            public Builder supportedDataDiskCategory(java.util.List<String> supportedDataDiskCategory) {
                this.supportedDataDiskCategory = supportedDataDiskCategory;
                return this;
            }

            public DataDiskCategories build() {
                return new DataDiskCategories(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeZonesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeZonesResponseBody</p>
     */
    public static class InstanceGenerations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("supportedInstanceGeneration")
        private java.util.List<String> supportedInstanceGeneration;

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
        public java.util.List<String> getSupportedInstanceGeneration() {
            return this.supportedInstanceGeneration;
        }

        public static final class Builder {
            private java.util.List<String> supportedInstanceGeneration; 

            private Builder() {
            } 

            private Builder(InstanceGenerations model) {
                this.supportedInstanceGeneration = model.supportedInstanceGeneration;
            } 

            /**
             * supportedInstanceGeneration.
             */
            public Builder supportedInstanceGeneration(java.util.List<String> supportedInstanceGeneration) {
                this.supportedInstanceGeneration = supportedInstanceGeneration;
                return this;
            }

            public InstanceGenerations build() {
                return new InstanceGenerations(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeZonesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeZonesResponseBody</p>
     */
    public static class InstanceTypeFamilies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("supportedInstanceTypeFamily")
        private java.util.List<String> supportedInstanceTypeFamily;

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
        public java.util.List<String> getSupportedInstanceTypeFamily() {
            return this.supportedInstanceTypeFamily;
        }

        public static final class Builder {
            private java.util.List<String> supportedInstanceTypeFamily; 

            private Builder() {
            } 

            private Builder(InstanceTypeFamilies model) {
                this.supportedInstanceTypeFamily = model.supportedInstanceTypeFamily;
            } 

            /**
             * supportedInstanceTypeFamily.
             */
            public Builder supportedInstanceTypeFamily(java.util.List<String> supportedInstanceTypeFamily) {
                this.supportedInstanceTypeFamily = supportedInstanceTypeFamily;
                return this;
            }

            public InstanceTypeFamilies build() {
                return new InstanceTypeFamilies(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeZonesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeZonesResponseBody</p>
     */
    public static class InstanceTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("supportedInstanceType")
        private java.util.List<String> supportedInstanceType;

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
        public java.util.List<String> getSupportedInstanceType() {
            return this.supportedInstanceType;
        }

        public static final class Builder {
            private java.util.List<String> supportedInstanceType; 

            private Builder() {
            } 

            private Builder(InstanceTypes model) {
                this.supportedInstanceType = model.supportedInstanceType;
            } 

            /**
             * supportedInstanceType.
             */
            public Builder supportedInstanceType(java.util.List<String> supportedInstanceType) {
                this.supportedInstanceType = supportedInstanceType;
                return this;
            }

            public InstanceTypes build() {
                return new InstanceTypes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeZonesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeZonesResponseBody</p>
     */
    public static class NetworkTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("supportedNetworkCategory")
        private java.util.List<String> supportedNetworkCategory;

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
        public java.util.List<String> getSupportedNetworkCategory() {
            return this.supportedNetworkCategory;
        }

        public static final class Builder {
            private java.util.List<String> supportedNetworkCategory; 

            private Builder() {
            } 

            private Builder(NetworkTypes model) {
                this.supportedNetworkCategory = model.supportedNetworkCategory;
            } 

            /**
             * supportedNetworkCategory.
             */
            public Builder supportedNetworkCategory(java.util.List<String> supportedNetworkCategory) {
                this.supportedNetworkCategory = supportedNetworkCategory;
                return this;
            }

            public NetworkTypes build() {
                return new NetworkTypes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeZonesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeZonesResponseBody</p>
     */
    public static class SystemDiskCategories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("supportedSystemDiskCategory")
        private java.util.List<String> supportedSystemDiskCategory;

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
        public java.util.List<String> getSupportedSystemDiskCategory() {
            return this.supportedSystemDiskCategory;
        }

        public static final class Builder {
            private java.util.List<String> supportedSystemDiskCategory; 

            private Builder() {
            } 

            private Builder(SystemDiskCategories model) {
                this.supportedSystemDiskCategory = model.supportedSystemDiskCategory;
            } 

            /**
             * supportedSystemDiskCategory.
             */
            public Builder supportedSystemDiskCategory(java.util.List<String> supportedSystemDiskCategory) {
                this.supportedSystemDiskCategory = supportedSystemDiskCategory;
                return this;
            }

            public SystemDiskCategories build() {
                return new SystemDiskCategories(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeZonesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeZonesResponseBody</p>
     */
    public static class ResourcesInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataDiskCategories")
        private DataDiskCategories dataDiskCategories;

        @com.aliyun.core.annotation.NameInMap("InstanceGenerations")
        private InstanceGenerations instanceGenerations;

        @com.aliyun.core.annotation.NameInMap("InstanceTypeFamilies")
        private InstanceTypeFamilies instanceTypeFamilies;

        @com.aliyun.core.annotation.NameInMap("InstanceTypes")
        private InstanceTypes instanceTypes;

        @com.aliyun.core.annotation.NameInMap("IoOptimized")
        private Boolean ioOptimized;

        @com.aliyun.core.annotation.NameInMap("NetworkTypes")
        private NetworkTypes networkTypes;

        @com.aliyun.core.annotation.NameInMap("SystemDiskCategories")
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

            private Builder() {
            } 

            private Builder(ResourcesInfo model) {
                this.dataDiskCategories = model.dataDiskCategories;
                this.instanceGenerations = model.instanceGenerations;
                this.instanceTypeFamilies = model.instanceTypeFamilies;
                this.instanceTypes = model.instanceTypes;
                this.ioOptimized = model.ioOptimized;
                this.networkTypes = model.networkTypes;
                this.systemDiskCategories = model.systemDiskCategories;
            } 

            /**
             * <p>The categories of data disks that can be created.</p>
             */
            public Builder dataDiskCategories(DataDiskCategories dataDiskCategories) {
                this.dataDiskCategories = dataDiskCategories;
                return this;
            }

            /**
             * <p>The supported generations of instance families.</p>
             */
            public Builder instanceGenerations(InstanceGenerations instanceGenerations) {
                this.instanceGenerations = instanceGenerations;
                return this;
            }

            /**
             * <p>The supported instance families.</p>
             */
            public Builder instanceTypeFamilies(InstanceTypeFamilies instanceTypeFamilies) {
                this.instanceTypeFamilies = instanceTypeFamilies;
                return this;
            }

            /**
             * <p>The supported instance types.</p>
             */
            public Builder instanceTypes(InstanceTypes instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            /**
             * <p>Indicates whether the instance is I/O optimized.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder ioOptimized(Boolean ioOptimized) {
                this.ioOptimized = ioOptimized;
                return this;
            }

            /**
             * <p>The supported network types.</p>
             */
            public Builder networkTypes(NetworkTypes networkTypes) {
                this.networkTypes = networkTypes;
                return this;
            }

            /**
             * <p>The categories of system disks that can be created.</p>
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
    /**
     * 
     * {@link DescribeZonesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeZonesResponseBody</p>
     */
    public static class AvailableResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourcesInfo")
        private java.util.List<ResourcesInfo> resourcesInfo;

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
        public java.util.List<ResourcesInfo> getResourcesInfo() {
            return this.resourcesInfo;
        }

        public static final class Builder {
            private java.util.List<ResourcesInfo> resourcesInfo; 

            private Builder() {
            } 

            private Builder(AvailableResources model) {
                this.resourcesInfo = model.resourcesInfo;
            } 

            /**
             * ResourcesInfo.
             */
            public Builder resourcesInfo(java.util.List<ResourcesInfo> resourcesInfo) {
                this.resourcesInfo = resourcesInfo;
                return this;
            }

            public AvailableResources build() {
                return new AvailableResources(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeZonesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeZonesResponseBody</p>
     */
    public static class AvailableVolumeCategories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VolumeCategories")
        private java.util.List<String> volumeCategories;

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
        public java.util.List<String> getVolumeCategories() {
            return this.volumeCategories;
        }

        public static final class Builder {
            private java.util.List<String> volumeCategories; 

            private Builder() {
            } 

            private Builder(AvailableVolumeCategories model) {
                this.volumeCategories = model.volumeCategories;
            } 

            /**
             * VolumeCategories.
             */
            public Builder volumeCategories(java.util.List<String> volumeCategories) {
                this.volumeCategories = volumeCategories;
                return this;
            }

            public AvailableVolumeCategories build() {
                return new AvailableVolumeCategories(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeZonesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeZonesResponseBody</p>
     */
    public static class DedicatedHostGenerations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DedicatedHostGeneration")
        private java.util.List<String> dedicatedHostGeneration;

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
        public java.util.List<String> getDedicatedHostGeneration() {
            return this.dedicatedHostGeneration;
        }

        public static final class Builder {
            private java.util.List<String> dedicatedHostGeneration; 

            private Builder() {
            } 

            private Builder(DedicatedHostGenerations model) {
                this.dedicatedHostGeneration = model.dedicatedHostGeneration;
            } 

            /**
             * DedicatedHostGeneration.
             */
            public Builder dedicatedHostGeneration(java.util.List<String> dedicatedHostGeneration) {
                this.dedicatedHostGeneration = dedicatedHostGeneration;
                return this;
            }

            public DedicatedHostGenerations build() {
                return new DedicatedHostGenerations(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeZonesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeZonesResponseBody</p>
     */
    public static class Zone extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableDedicatedHostTypes")
        private AvailableDedicatedHostTypes availableDedicatedHostTypes;

        @com.aliyun.core.annotation.NameInMap("AvailableDiskCategories")
        private AvailableDiskCategories availableDiskCategories;

        @com.aliyun.core.annotation.NameInMap("AvailableInstanceTypes")
        private AvailableInstanceTypes availableInstanceTypes;

        @com.aliyun.core.annotation.NameInMap("AvailableResourceCreation")
        private AvailableResourceCreation availableResourceCreation;

        @com.aliyun.core.annotation.NameInMap("AvailableResources")
        private AvailableResources availableResources;

        @com.aliyun.core.annotation.NameInMap("AvailableVolumeCategories")
        private AvailableVolumeCategories availableVolumeCategories;

        @com.aliyun.core.annotation.NameInMap("DedicatedHostGenerations")
        private DedicatedHostGenerations dedicatedHostGenerations;

        @com.aliyun.core.annotation.NameInMap("LocalName")
        private String localName;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        @com.aliyun.core.annotation.NameInMap("ZoneType")
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

            private Builder() {
            } 

            private Builder(Zone model) {
                this.availableDedicatedHostTypes = model.availableDedicatedHostTypes;
                this.availableDiskCategories = model.availableDiskCategories;
                this.availableInstanceTypes = model.availableInstanceTypes;
                this.availableResourceCreation = model.availableResourceCreation;
                this.availableResources = model.availableResources;
                this.availableVolumeCategories = model.availableVolumeCategories;
                this.dedicatedHostGenerations = model.dedicatedHostGenerations;
                this.localName = model.localName;
                this.zoneId = model.zoneId;
                this.zoneType = model.zoneType;
            } 

            /**
             * <p>The supported dedicated host types.</p>
             */
            public Builder availableDedicatedHostTypes(AvailableDedicatedHostTypes availableDedicatedHostTypes) {
                this.availableDedicatedHostTypes = availableDedicatedHostTypes;
                return this;
            }

            /**
             * <p>The categories of cloud disks that can be created. Valid values:</p>
             * <ul>
             * <li>cloud: basic disk</li>
             * <li>cloud_ssd: standard SSD</li>
             * <li>cloud_efficiency: ultra disk</li>
             * <li>cloud_essd: ESSD</li>
             * </ul>
             */
            public Builder availableDiskCategories(AvailableDiskCategories availableDiskCategories) {
                this.availableDiskCategories = availableDiskCategories;
                return this;
            }

            /**
             * <p>The supported instance types.</p>
             */
            public Builder availableInstanceTypes(AvailableInstanceTypes availableInstanceTypes) {
                this.availableInstanceTypes = availableInstanceTypes;
                return this;
            }

            /**
             * <p>The types of resources that can be created. Valid values:</p>
             * <ul>
             * <li>VSwitch: vSwitch</li>
             * <li>IoOptimized: I/O optimized instance</li>
             * <li>Instance: instance</li>
             * <li>DedicatedHost: dedicated host</li>
             * <li>disk: cloud disk</li>
             * </ul>
             */
            public Builder availableResourceCreation(AvailableResourceCreation availableResourceCreation) {
                this.availableResourceCreation = availableResourceCreation;
                return this;
            }

            /**
             * <p>Details about the resources that can be created in the zone.</p>
             */
            public Builder availableResources(AvailableResources availableResources) {
                this.availableResources = availableResources;
                return this;
            }

            /**
             * <p>The supported Shared Block Storage device categories.</p>
             */
            public Builder availableVolumeCategories(AvailableVolumeCategories availableVolumeCategories) {
                this.availableVolumeCategories = availableVolumeCategories;
                return this;
            }

            /**
             * <p>The supported generations of dedicated hosts.</p>
             */
            public Builder dedicatedHostGenerations(DedicatedHostGenerations dedicatedHostGenerations) {
                this.dedicatedHostGenerations = dedicatedHostGenerations;
                return this;
            }

            /**
             * <p>The name of the zone in the local language.</p>
             * 
             * <strong>example:</strong>
             * <p>Hangzhou Zone G</p>
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * <p>The ID of the zone.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-g</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * <p>The type of the zone. Valid values:</p>
             * <ul>
             * <li>AvailabilityZone: zone for the Alibaba Cloud public cloud</li>
             * <li>CloudBoxZone: zone for CloudBox</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AvailabilityZone</p>
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
    /**
     * 
     * {@link DescribeZonesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeZonesResponseBody</p>
     */
    public static class Zones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Zone")
        private java.util.List<Zone> zone;

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
        public java.util.List<Zone> getZone() {
            return this.zone;
        }

        public static final class Builder {
            private java.util.List<Zone> zone; 

            private Builder() {
            } 

            private Builder(Zones model) {
                this.zone = model.zone;
            } 

            /**
             * Zone.
             */
            public Builder zone(java.util.List<Zone> zone) {
                this.zone = zone;
                return this;
            }

            public Zones build() {
                return new Zones(this);
            } 

        } 

    }
}
