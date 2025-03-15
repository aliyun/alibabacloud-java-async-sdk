// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeDBClusterAvailableResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterAvailableResourcesResponseBody</p>
 */
public class DescribeDBClusterAvailableResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvailableZones")
    private java.util.List<AvailableZones> availableZones;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return availableZones
     */
    public java.util.List<AvailableZones> getAvailableZones() {
        return this.availableZones;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<AvailableZones> availableZones; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDBClusterAvailableResourcesResponseBody model) {
            this.availableZones = model.availableZones;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The available zones of the cluster.</p>
         */
        public Builder availableZones(java.util.List<AvailableZones> availableZones) {
            this.availableZones = availableZones;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2B19F698-8FFC-4918-B9E2-58D878******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBClusterAvailableResourcesResponseBody build() {
            return new DescribeDBClusterAvailableResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBClusterAvailableResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterAvailableResourcesResponseBody</p>
     */
    public static class AvailableResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("DBNodeClass")
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

            private Builder() {
            } 

            private Builder(AvailableResources model) {
                this.category = model.category;
                this.DBNodeClass = model.DBNodeClass;
            } 

            /**
             * <p>The edition of the cluster. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong>: Cluster Edition.</li>
             * <li><strong>Basic</strong>: Single Node Edition.</li>
             * <li><strong>ArchiveNormal</strong>: X-Engine.</li>
             * <li><strong>NormalMultimaster</strong>: Multi-master Cluster (Database/Table) Edition.</li>
             * <li><strong>SENormal</strong>: Standard Edition.</li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li>Only PolarDB for MySQL supports Single Node Edition.</li>
             * <li>Only PolarDB for MySQL 8.0 supports X-Engine Edition and Multi-master Cluster (Database/Table) Edition.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The specifications of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>polar.mysql.x4.large</p>
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
    /**
     * 
     * {@link DescribeDBClusterAvailableResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterAvailableResourcesResponseBody</p>
     */
    public static class SupportedEngines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableResources")
        private java.util.List<AvailableResources> availableResources;

        @com.aliyun.core.annotation.NameInMap("Engine")
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
        public java.util.List<AvailableResources> getAvailableResources() {
            return this.availableResources;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        public static final class Builder {
            private java.util.List<AvailableResources> availableResources; 
            private String engine; 

            private Builder() {
            } 

            private Builder(SupportedEngines model) {
                this.availableResources = model.availableResources;
                this.engine = model.engine;
            } 

            /**
             * <p>The available resources.</p>
             */
            public Builder availableResources(java.util.List<AvailableResources> availableResources) {
                this.availableResources = availableResources;
                return this;
            }

            /**
             * <p>The version of the database engine.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql57</p>
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
    /**
     * 
     * {@link DescribeDBClusterAvailableResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterAvailableResourcesResponseBody</p>
     */
    public static class AvailableZones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SupportedEngines")
        private java.util.List<SupportedEngines> supportedEngines;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
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
        public java.util.List<SupportedEngines> getSupportedEngines() {
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
            private java.util.List<SupportedEngines> supportedEngines; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(AvailableZones model) {
                this.regionId = model.regionId;
                this.supportedEngines = model.supportedEngines;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The region ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The database engines that the available resources support.</p>
             */
            public Builder supportedEngines(java.util.List<SupportedEngines> supportedEngines) {
                this.supportedEngines = supportedEngines;
                return this;
            }

            /**
             * <p>The zone ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-i</p>
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
