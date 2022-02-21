// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAvailableResourceResponseBody</p>
 */
public class DescribeAvailableResourceResponseBody extends TeaModel {
    @NameInMap("AvailableZones")
    private AvailableZones availableZones;

    @NameInMap("RequestId")
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

        public DescribeAvailableResourceResponseBody build() {
            return new DescribeAvailableResourceResponseBody(this);
        } 

    } 

    public static class DBInstanceStorageRange extends TeaModel {
        @NameInMap("Max")
        private Integer max;

        @NameInMap("Min")
        private Integer min;

        @NameInMap("Step")
        private Integer step;

        private DBInstanceStorageRange(Builder builder) {
            this.max = builder.max;
            this.min = builder.min;
            this.step = builder.step;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstanceStorageRange create() {
            return builder().build();
        }

        /**
         * @return max
         */
        public Integer getMax() {
            return this.max;
        }

        /**
         * @return min
         */
        public Integer getMin() {
            return this.min;
        }

        /**
         * @return step
         */
        public Integer getStep() {
            return this.step;
        }

        public static final class Builder {
            private Integer max; 
            private Integer min; 
            private Integer step; 

            /**
             * Max.
             */
            public Builder max(Integer max) {
                this.max = max;
                return this;
            }

            /**
             * Min.
             */
            public Builder min(Integer min) {
                this.min = min;
                return this;
            }

            /**
             * Step.
             */
            public Builder step(Integer step) {
                this.step = step;
                return this;
            }

            public DBInstanceStorageRange build() {
                return new DBInstanceStorageRange(this);
            } 

        } 

    }
    public static class AvailableResource extends TeaModel {
        @NameInMap("DBInstanceClass")
        private String DBInstanceClass;

        @NameInMap("DBInstanceStorageRange")
        private DBInstanceStorageRange DBInstanceStorageRange;

        @NameInMap("StorageRange")
        private String storageRange;

        private AvailableResource(Builder builder) {
            this.DBInstanceClass = builder.DBInstanceClass;
            this.DBInstanceStorageRange = builder.DBInstanceStorageRange;
            this.storageRange = builder.storageRange;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableResource create() {
            return builder().build();
        }

        /**
         * @return DBInstanceClass
         */
        public String getDBInstanceClass() {
            return this.DBInstanceClass;
        }

        /**
         * @return DBInstanceStorageRange
         */
        public DBInstanceStorageRange getDBInstanceStorageRange() {
            return this.DBInstanceStorageRange;
        }

        /**
         * @return storageRange
         */
        public String getStorageRange() {
            return this.storageRange;
        }

        public static final class Builder {
            private String DBInstanceClass; 
            private DBInstanceStorageRange DBInstanceStorageRange; 
            private String storageRange; 

            /**
             * DBInstanceClass.
             */
            public Builder DBInstanceClass(String DBInstanceClass) {
                this.DBInstanceClass = DBInstanceClass;
                return this;
            }

            /**
             * DBInstanceStorageRange.
             */
            public Builder DBInstanceStorageRange(DBInstanceStorageRange DBInstanceStorageRange) {
                this.DBInstanceStorageRange = DBInstanceStorageRange;
                return this;
            }

            /**
             * StorageRange.
             */
            public Builder storageRange(String storageRange) {
                this.storageRange = storageRange;
                return this;
            }

            public AvailableResource build() {
                return new AvailableResource(this);
            } 

        } 

    }
    public static class AvailableResources extends TeaModel {
        @NameInMap("AvailableResource")
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
    public static class SupportedStorageType extends TeaModel {
        @NameInMap("AvailableResources")
        private AvailableResources availableResources;

        @NameInMap("StorageType")
        private String storageType;

        private SupportedStorageType(Builder builder) {
            this.availableResources = builder.availableResources;
            this.storageType = builder.storageType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedStorageType create() {
            return builder().build();
        }

        /**
         * @return availableResources
         */
        public AvailableResources getAvailableResources() {
            return this.availableResources;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        public static final class Builder {
            private AvailableResources availableResources; 
            private String storageType; 

            /**
             * AvailableResources.
             */
            public Builder availableResources(AvailableResources availableResources) {
                this.availableResources = availableResources;
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
        @NameInMap("SupportedStorageType")
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
    public static class SupportedCategory extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("SupportedStorageTypes")
        private SupportedStorageTypes supportedStorageTypes;

        private SupportedCategory(Builder builder) {
            this.category = builder.category;
            this.supportedStorageTypes = builder.supportedStorageTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedCategory create() {
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

            public SupportedCategory build() {
                return new SupportedCategory(this);
            } 

        } 

    }
    public static class SupportedCategorys extends TeaModel {
        @NameInMap("SupportedCategory")
        private java.util.List < SupportedCategory> supportedCategory;

        private SupportedCategorys(Builder builder) {
            this.supportedCategory = builder.supportedCategory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedCategorys create() {
            return builder().build();
        }

        /**
         * @return supportedCategory
         */
        public java.util.List < SupportedCategory> getSupportedCategory() {
            return this.supportedCategory;
        }

        public static final class Builder {
            private java.util.List < SupportedCategory> supportedCategory; 

            /**
             * SupportedCategory.
             */
            public Builder supportedCategory(java.util.List < SupportedCategory> supportedCategory) {
                this.supportedCategory = supportedCategory;
                return this;
            }

            public SupportedCategorys build() {
                return new SupportedCategorys(this);
            } 

        } 

    }
    public static class SupportedEngineVersion extends TeaModel {
        @NameInMap("SupportedCategorys")
        private SupportedCategorys supportedCategorys;

        @NameInMap("Version")
        private String version;

        private SupportedEngineVersion(Builder builder) {
            this.supportedCategorys = builder.supportedCategorys;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedEngineVersion create() {
            return builder().build();
        }

        /**
         * @return supportedCategorys
         */
        public SupportedCategorys getSupportedCategorys() {
            return this.supportedCategorys;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private SupportedCategorys supportedCategorys; 
            private String version; 

            /**
             * SupportedCategorys.
             */
            public Builder supportedCategorys(SupportedCategorys supportedCategorys) {
                this.supportedCategorys = supportedCategorys;
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
        @NameInMap("SupportedEngineVersion")
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
        @NameInMap("Engine")
        private String engine;

        @NameInMap("SupportedEngineVersions")
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
        @NameInMap("SupportedEngine")
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
        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Status")
        private String status;

        @NameInMap("SupportedEngines")
        private SupportedEngines supportedEngines;

        @NameInMap("ZoneId")
        private String zoneId;

        private AvailableZone(Builder builder) {
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.supportedEngines = builder.supportedEngines;
            this.zoneId = builder.zoneId;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
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

        public static final class Builder {
            private String regionId; 
            private String status; 
            private SupportedEngines supportedEngines; 
            private String zoneId; 

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
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
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public AvailableZone build() {
                return new AvailableZone(this);
            } 

        } 

    }
    public static class AvailableZones extends TeaModel {
        @NameInMap("AvailableZone")
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
