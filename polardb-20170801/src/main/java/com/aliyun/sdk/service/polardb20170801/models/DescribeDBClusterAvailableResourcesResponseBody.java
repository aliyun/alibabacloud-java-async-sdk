// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBClusterAvailableResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterAvailableResourcesResponseBody</p>
 */
public class DescribeDBClusterAvailableResourcesResponseBody extends TeaModel {
    @NameInMap("AvailableZones")
    private java.util.List < AvailableZones> availableZones;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDBClusterAvailableResourcesResponseBody(Builder builder) {
        this.availableZones = builder.availableZones;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterAvailableResourcesResponseBody create() {
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
         * The available zones of the cluster.
         */
        public Builder availableZones(java.util.List < AvailableZones> availableZones) {
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

        public DescribeDBClusterAvailableResourcesResponseBody build() {
            return new DescribeDBClusterAvailableResourcesResponseBody(this);
        } 

    } 

    public static class AvailableResources extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("DBNodeClass")
        private String DBNodeClass;

        private AvailableResources(Builder builder) {
            this.category = builder.category;
            this.DBNodeClass = builder.DBNodeClass;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableResources create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return DBNodeClass
         */
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        public static final class Builder {
            private String category; 
            private String DBNodeClass; 

            /**
             * The edition of the cluster. Valid values:
             * <p>
             * 
             * *   **Normal**: Cluster Edition.
             * *   **Basic**: Single Node Edition.
             * *   **ArchiveNormal**: X-Engine.
             * *   **NormalMultimaster**: Multi-master Cluster (Database/Table) Edition.
             * *   **SENormal**: Standard Edition.
             * 
             * >- Only PolarDB for MySQL supports Single Node Edition.
             * >- Only PolarDB for MySQL 8.0 supports X-Engine Edition and Multi-master Cluster (Database/Table) Edition.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The specifications of the node.
             */
            public Builder DBNodeClass(String DBNodeClass) {
                this.DBNodeClass = DBNodeClass;
                return this;
            }

            public AvailableResources build() {
                return new AvailableResources(this);
            } 

        } 

    }
    public static class SupportedEngines extends TeaModel {
        @NameInMap("AvailableResources")
        private java.util.List < AvailableResources> availableResources;

        @NameInMap("Engine")
        private String engine;

        private SupportedEngines(Builder builder) {
            this.availableResources = builder.availableResources;
            this.engine = builder.engine;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedEngines create() {
            return builder().build();
        }

        /**
         * @return availableResources
         */
        public java.util.List < AvailableResources> getAvailableResources() {
            return this.availableResources;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        public static final class Builder {
            private java.util.List < AvailableResources> availableResources; 
            private String engine; 

            /**
             * The available resources.
             */
            public Builder availableResources(java.util.List < AvailableResources> availableResources) {
                this.availableResources = availableResources;
                return this;
            }

            /**
             * The version of the database engine.
             */
            public Builder engine(String engine) {
                this.engine = engine;
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
             * The region ID of the cluster.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The database engines that the available resources support.
             */
            public Builder supportedEngines(java.util.List < SupportedEngines> supportedEngines) {
                this.supportedEngines = supportedEngines;
                return this;
            }

            /**
             * The zone ID of the cluster.
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
