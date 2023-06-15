// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRegionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRegionsResponseBody</p>
 */
public class DescribeRegionsResponseBody extends TeaModel {
    @NameInMap("Regions")
    private Regions regions;

    @NameInMap("RequestId")
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
         * An array that consists of the available regions and zones.
         */
        public Builder regions(Regions regions) {
            this.regions = regions;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRegionsResponseBody build() {
            return new DescribeRegionsResponseBody(this);
        } 

    } 

    public static class RDSRegion extends TeaModel {
        @NameInMap("LocalName")
        private String localName;

        @NameInMap("RegionEndpoint")
        private String regionEndpoint;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ZoneId")
        private String zoneId;

        @NameInMap("ZoneName")
        private String zoneName;

        private RDSRegion(Builder builder) {
            this.localName = builder.localName;
            this.regionEndpoint = builder.regionEndpoint;
            this.regionId = builder.regionId;
            this.zoneId = builder.zoneId;
            this.zoneName = builder.zoneName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RDSRegion create() {
            return builder().build();
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
            private String localName; 
            private String regionEndpoint; 
            private String regionId; 
            private String zoneId; 
            private String zoneName; 

            /**
             * The name of the region. The return value of the LocalName parameter is in the language that is specified by the **AcceptLanguage** parameter. For example, if the value of the RegionId parameter in the response is cn-hangzhou, the following values are returned for the LocalName parameter:
             * <p>
             * 
             * *   If the value of the **AcceptLanguage** parameter is **zh-CN**, the value 华东1（杭州） is returned for the LocalName parameter.
             * *   If the value of the **AcceptLanguage** parameter is **en-US**, the value China (Hangzhou) is returned for the LocalName parameter.
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * The endpoint that is used to connect to Alibaba Cloud services in the region. For more information, see [Request structure](~~26223~~).
             */
            public Builder regionEndpoint(String regionEndpoint) {
                this.regionEndpoint = regionEndpoint;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the zone.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * The name of the zone. The return value of the ZoneName parameter is in the language that is specified by the **AcceptLanguage** parameter. For example, if the value of the RegionId parameter in the response is cn-hangzhou-h, the following values are returned for the LocalName parameter:
             * <p>
             * 
             * *   If the value of the **AcceptLanguage** parameter is **zh-CN**, the value 杭州 可用区H is returned for the LocalName parameter.
             * *   If the value of the **AcceptLanguage** parameter is **en-US**, the value Hangzhou Zone H is returned for the LocalName parameter.
             */
            public Builder zoneName(String zoneName) {
                this.zoneName = zoneName;
                return this;
            }

            public RDSRegion build() {
                return new RDSRegion(this);
            } 

        } 

    }
    public static class Regions extends TeaModel {
        @NameInMap("RDSRegion")
        private java.util.List < RDSRegion> RDSRegion;

        private Regions(Builder builder) {
            this.RDSRegion = builder.RDSRegion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Regions create() {
            return builder().build();
        }

        /**
         * @return RDSRegion
         */
        public java.util.List < RDSRegion> getRDSRegion() {
            return this.RDSRegion;
        }

        public static final class Builder {
            private java.util.List < RDSRegion> RDSRegion; 

            /**
             * RDSRegion.
             */
            public Builder RDSRegion(java.util.List < RDSRegion> RDSRegion) {
                this.RDSRegion = RDSRegion;
                return this;
            }

            public Regions build() {
                return new Regions(this);
            } 

        } 

    }
}
