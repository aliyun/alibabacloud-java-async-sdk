// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailableZonesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAvailableZonesResponseBody</p>
 */
public class DescribeAvailableZonesResponseBody extends TeaModel {
    @NameInMap("AvailableZones")
    private java.util.List < AvailableZones> availableZones;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAvailableZonesResponseBody(Builder builder) {
        this.availableZones = builder.availableZones;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableZonesResponseBody create() {
        return builder().build();
    }

    /**
     * @return availableZones
     */
    public java.util.List < AvailableZones> getAvailableZones() {
        return this.availableZones;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < AvailableZones> availableZones; 
        private String requestId; 

        /**
         * AvailableZones.
         */
        public Builder availableZones(java.util.List < AvailableZones> availableZones) {
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

        public DescribeAvailableZonesResponseBody build() {
            return new DescribeAvailableZonesResponseBody(this);
        } 

    } 

    public static class SupportedStorageTypes extends TeaModel {
        @NameInMap("StorageType")
        private String storageType;

        private SupportedStorageTypes(Builder builder) {
            this.storageType = builder.storageType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedStorageTypes create() {
            return builder().build();
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        public static final class Builder {
            private String storageType; 

            /**
             * StorageType.
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            public SupportedStorageTypes build() {
                return new SupportedStorageTypes(this);
            } 

        } 

    }
    public static class SupportedCategorys extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("SupportedStorageTypes")
        private java.util.List < SupportedStorageTypes> supportedStorageTypes;

        private SupportedCategorys(Builder builder) {
            this.category = builder.category;
            this.supportedStorageTypes = builder.supportedStorageTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedCategorys create() {
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
        public java.util.List < SupportedStorageTypes> getSupportedStorageTypes() {
            return this.supportedStorageTypes;
        }

        public static final class Builder {
            private String category; 
            private java.util.List < SupportedStorageTypes> supportedStorageTypes; 

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
            public Builder supportedStorageTypes(java.util.List < SupportedStorageTypes> supportedStorageTypes) {
                this.supportedStorageTypes = supportedStorageTypes;
                return this;
            }

            public SupportedCategorys build() {
                return new SupportedCategorys(this);
            } 

        } 

    }
    public static class SupportedEngineVersions extends TeaModel {
        @NameInMap("SupportedCategorys")
        private java.util.List < SupportedCategorys> supportedCategorys;

        @NameInMap("Version")
        private String version;

        private SupportedEngineVersions(Builder builder) {
            this.supportedCategorys = builder.supportedCategorys;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedEngineVersions create() {
            return builder().build();
        }

        /**
         * @return supportedCategorys
         */
        public java.util.List < SupportedCategorys> getSupportedCategorys() {
            return this.supportedCategorys;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private java.util.List < SupportedCategorys> supportedCategorys; 
            private String version; 

            /**
             * SupportedCategorys.
             */
            public Builder supportedCategorys(java.util.List < SupportedCategorys> supportedCategorys) {
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

            public SupportedEngineVersions build() {
                return new SupportedEngineVersions(this);
            } 

        } 

    }
    public static class SupportedEngines extends TeaModel {
        @NameInMap("Engine")
        private String engine;

        @NameInMap("SupportedEngineVersions")
        private java.util.List < SupportedEngineVersions> supportedEngineVersions;

        private SupportedEngines(Builder builder) {
            this.engine = builder.engine;
            this.supportedEngineVersions = builder.supportedEngineVersions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedEngines create() {
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
        public java.util.List < SupportedEngineVersions> getSupportedEngineVersions() {
            return this.supportedEngineVersions;
        }

        public static final class Builder {
            private String engine; 
            private java.util.List < SupportedEngineVersions> supportedEngineVersions; 

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
            public Builder supportedEngineVersions(java.util.List < SupportedEngineVersions> supportedEngineVersions) {
                this.supportedEngineVersions = supportedEngineVersions;
                return this;
            }

            public SupportedEngines build() {
                return new SupportedEngines(this);
            } 

        } 

    }
    public static class AvailableZones extends TeaModel {
        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SupportedEngines")
        private java.util.List < SupportedEngines> supportedEngines;

        @NameInMap("ZoneId")
        private String zoneId;

        private AvailableZones(Builder builder) {
            this.regionId = builder.regionId;
            this.supportedEngines = builder.supportedEngines;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableZones create() {
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
        public java.util.List < SupportedEngines> getSupportedEngines() {
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
            private java.util.List < SupportedEngines> supportedEngines; 
            private String zoneId; 

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
            public Builder supportedEngines(java.util.List < SupportedEngines> supportedEngines) {
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

            public AvailableZones build() {
                return new AvailableZones(this);
            } 

        } 

    }
}
