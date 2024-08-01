// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRegionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRegionsResponseBody</p>
 */
public class DescribeRegionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Regions")
    private Regions regions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRegionsResponseBody(Builder builder) {
        this.regions = builder.regions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRegionsResponseBody create() {
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
         * The regions.
         */
        public Builder regions(Regions regions) {
            this.regions = regions;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRegionsResponseBody build() {
            return new DescribeRegionsResponseBody(this);
        } 

    } 

    public static class Zone extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VpcEnabled")
        private Boolean vpcEnabled;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        @com.aliyun.core.annotation.NameInMap("ZoneName")
        private String zoneName;

        private Zone(Builder builder) {
            this.vpcEnabled = builder.vpcEnabled;
            this.zoneId = builder.zoneId;
            this.zoneName = builder.zoneName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Zone create() {
            return builder().build();
        }

        /**
         * @return vpcEnabled
         */
        public Boolean getVpcEnabled() {
            return this.vpcEnabled;
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
            private Boolean vpcEnabled; 
            private String zoneId; 
            private String zoneName; 

            /**
             * Indicates whether a virtual private cloud (VPC) is supported. Valid values:
             * <p>
             * 
             * *   **true**: VPC is supported.
             * *   **false**: VPC is not supported.
             */
            public Builder vpcEnabled(Boolean vpcEnabled) {
                this.vpcEnabled = vpcEnabled;
                return this;
            }

            /**
             * The zone ID.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * The name of the zone.
             * <p>
             * 
             * The value of the ZoneName parameter is in the language that is specified by the **AcceptLanguage** parameter. For example, if the value of the ZoneId parameter in the response is **cn-hangzhou-h**, the following values are returned for the ZoneName parameter:
             * 
             * *   If the value of the **AcceptLanguage** parameter is **zh**, the value **H** is returned for the ZoneName parameter.
             * *   If the value of the **AcceptLanguage** parameter is **en**, the value **Hangzhou Zone H** is returned for the ZoneName parameter.
             */
            public Builder zoneName(String zoneName) {
                this.zoneName = zoneName;
                return this;
            }

            public Zone build() {
                return new Zone(this);
            } 

        } 

    }
    public static class Zones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Zone")
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
    public static class DdsRegion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndPoint")
        private String endPoint;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RegionName")
        private String regionName;

        @com.aliyun.core.annotation.NameInMap("Zones")
        private Zones zones;

        private DdsRegion(Builder builder) {
            this.endPoint = builder.endPoint;
            this.regionId = builder.regionId;
            this.regionName = builder.regionName;
            this.zones = builder.zones;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DdsRegion create() {
            return builder().build();
        }

        /**
         * @return endPoint
         */
        public String getEndPoint() {
            return this.endPoint;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return regionName
         */
        public String getRegionName() {
            return this.regionName;
        }

        /**
         * @return zones
         */
        public Zones getZones() {
            return this.zones;
        }

        public static final class Builder {
            private String endPoint; 
            private String regionId; 
            private String regionName; 
            private Zones zones; 

            /**
             * The public endpoint of the region.
             * <p>
             * 
             * For example, if the value of the RegionId parameter in the response is cn-hangzhou, the following value is returned for the EndPoint parameter:
             * 
             * *   mongodb.aliyuncs.com
             */
            public Builder endPoint(String endPoint) {
                this.endPoint = endPoint;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The name of the region.
             * <p>
             * 
             * The value of the LocalName parameter is in the language that is specified by the **AcceptLanguage** parameter. For example, if the value of the RegionId parameter in the response is **cn-hangzhou**, the following values are returned for the LocalName parameter:
             * 
             * *   If the value of the **AcceptLanguage** parameter is **zh**, the value **华东1（杭州）** is returned for the LocalName parameter.
             * *   If the value of the **AcceptLanguage** parameter is **en**, the value **China (Hangzhou)** is returned for the LocalName parameter.
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            /**
             * The zones.
             */
            public Builder zones(Zones zones) {
                this.zones = zones;
                return this;
            }

            public DdsRegion build() {
                return new DdsRegion(this);
            } 

        } 

    }
    public static class Regions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DdsRegion")
        private java.util.List < DdsRegion> ddsRegion;

        private Regions(Builder builder) {
            this.ddsRegion = builder.ddsRegion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Regions create() {
            return builder().build();
        }

        /**
         * @return ddsRegion
         */
        public java.util.List < DdsRegion> getDdsRegion() {
            return this.ddsRegion;
        }

        public static final class Builder {
            private java.util.List < DdsRegion> ddsRegion; 

            /**
             * DdsRegion.
             */
            public Builder ddsRegion(java.util.List < DdsRegion> ddsRegion) {
                this.ddsRegion = ddsRegion;
                return this;
            }

            public Regions build() {
                return new Regions(this);
            } 

        } 

    }
}
