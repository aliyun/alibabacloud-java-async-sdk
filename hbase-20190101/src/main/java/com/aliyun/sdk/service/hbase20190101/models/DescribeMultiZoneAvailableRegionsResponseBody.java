// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

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
 * {@link DescribeMultiZoneAvailableRegionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMultiZoneAvailableRegionsResponseBody</p>
 */
public class DescribeMultiZoneAvailableRegionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Regions")
    private Regions regions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeMultiZoneAvailableRegionsResponseBody(Builder builder) {
        this.regions = builder.regions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMultiZoneAvailableRegionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return regions
     */
    public Regions getRegions() {
        return this.regions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Regions regions; 
        private String requestId; 

        /**
         * Regions.
         */
        public Builder regions(Regions regions) {
            this.regions = regions;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMultiZoneAvailableRegionsResponseBody build() {
            return new DescribeMultiZoneAvailableRegionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMultiZoneAvailableRegionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMultiZoneAvailableRegionsResponseBody</p>
     */
    public static class Zones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Zone")
        private java.util.List<String> zone;

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
        public java.util.List<String> getZone() {
            return this.zone;
        }

        public static final class Builder {
            private java.util.List<String> zone; 

            /**
             * Zone.
             */
            public Builder zone(java.util.List<String> zone) {
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
     * {@link DescribeMultiZoneAvailableRegionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMultiZoneAvailableRegionsResponseBody</p>
     */
    public static class AvailableCombine extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Zones")
        private Zones zones;

        private AvailableCombine(Builder builder) {
            this.id = builder.id;
            this.zones = builder.zones;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableCombine create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return zones
         */
        public Zones getZones() {
            return this.zones;
        }

        public static final class Builder {
            private String id; 
            private Zones zones; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Zones.
             */
            public Builder zones(Zones zones) {
                this.zones = zones;
                return this;
            }

            public AvailableCombine build() {
                return new AvailableCombine(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMultiZoneAvailableRegionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMultiZoneAvailableRegionsResponseBody</p>
     */
    public static class AvailableCombines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableCombine")
        private java.util.List<AvailableCombine> availableCombine;

        private AvailableCombines(Builder builder) {
            this.availableCombine = builder.availableCombine;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableCombines create() {
            return builder().build();
        }

        /**
         * @return availableCombine
         */
        public java.util.List<AvailableCombine> getAvailableCombine() {
            return this.availableCombine;
        }

        public static final class Builder {
            private java.util.List<AvailableCombine> availableCombine; 

            /**
             * AvailableCombine.
             */
            public Builder availableCombine(java.util.List<AvailableCombine> availableCombine) {
                this.availableCombine = availableCombine;
                return this;
            }

            public AvailableCombines build() {
                return new AvailableCombines(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMultiZoneAvailableRegionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMultiZoneAvailableRegionsResponseBody</p>
     */
    public static class Region extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableCombines")
        private AvailableCombines availableCombines;

        @com.aliyun.core.annotation.NameInMap("LocalName")
        private String localName;

        @com.aliyun.core.annotation.NameInMap("RegionEndpoint")
        private String regionEndpoint;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private Region(Builder builder) {
            this.availableCombines = builder.availableCombines;
            this.localName = builder.localName;
            this.regionEndpoint = builder.regionEndpoint;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Region create() {
            return builder().build();
        }

        /**
         * @return availableCombines
         */
        public AvailableCombines getAvailableCombines() {
            return this.availableCombines;
        }

        /**
         * @return localName
         */
        public String getLocalName() {
            return this.localName;
        }

        /**
         * @return regionEndpoint
         */
        public String getRegionEndpoint() {
            return this.regionEndpoint;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private AvailableCombines availableCombines; 
            private String localName; 
            private String regionEndpoint; 
            private String regionId; 

            /**
             * AvailableCombines.
             */
            public Builder availableCombines(AvailableCombines availableCombines) {
                this.availableCombines = availableCombines;
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
             * RegionEndpoint.
             */
            public Builder regionEndpoint(String regionEndpoint) {
                this.regionEndpoint = regionEndpoint;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public Region build() {
                return new Region(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMultiZoneAvailableRegionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMultiZoneAvailableRegionsResponseBody</p>
     */
    public static class Regions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Region")
        private java.util.List<Region> region;

        private Regions(Builder builder) {
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Regions create() {
            return builder().build();
        }

        /**
         * @return region
         */
        public java.util.List<Region> getRegion() {
            return this.region;
        }

        public static final class Builder {
            private java.util.List<Region> region; 

            /**
             * Region.
             */
            public Builder region(java.util.List<Region> region) {
                this.region = region;
                return this;
            }

            public Regions build() {
                return new Regions(this);
            } 

        } 

    }
}
