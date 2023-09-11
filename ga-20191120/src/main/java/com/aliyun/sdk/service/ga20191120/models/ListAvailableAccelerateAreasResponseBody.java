// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAvailableAccelerateAreasResponseBody} extends {@link TeaModel}
 *
 * <p>ListAvailableAccelerateAreasResponseBody</p>
 */
public class ListAvailableAccelerateAreasResponseBody extends TeaModel {
    @NameInMap("Areas")
    private java.util.List < Areas> areas;

    @NameInMap("RequestId")
    private String requestId;

    private ListAvailableAccelerateAreasResponseBody(Builder builder) {
        this.areas = builder.areas;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAvailableAccelerateAreasResponseBody create() {
        return builder().build();
    }

    /**
     * @return areas
     */
    public java.util.List < Areas> getAreas() {
        return this.areas;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Areas> areas; 
        private String requestId; 

        /**
         * The information about acceleration areas.
         */
        public Builder areas(java.util.List < Areas> areas) {
            this.areas = areas;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAvailableAccelerateAreasResponseBody build() {
            return new ListAvailableAccelerateAreasResponseBody(this);
        } 

    } 

    public static class RegionList extends TeaModel {
        @NameInMap("ChinaMainland")
        private Boolean chinaMainland;

        @NameInMap("IspTypeList")
        private java.util.List < String > ispTypeList;

        @NameInMap("LocalName")
        private String localName;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SupportIpv6")
        private Boolean supportIpv6;

        private RegionList(Builder builder) {
            this.chinaMainland = builder.chinaMainland;
            this.ispTypeList = builder.ispTypeList;
            this.localName = builder.localName;
            this.regionId = builder.regionId;
            this.supportIpv6 = builder.supportIpv6;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionList create() {
            return builder().build();
        }

        /**
         * @return chinaMainland
         */
        public Boolean getChinaMainland() {
            return this.chinaMainland;
        }

        /**
         * @return ispTypeList
         */
        public java.util.List < String > getIspTypeList() {
            return this.ispTypeList;
        }

        /**
         * @return localName
         */
        public String getLocalName() {
            return this.localName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return supportIpv6
         */
        public Boolean getSupportIpv6() {
            return this.supportIpv6;
        }

        public static final class Builder {
            private Boolean chinaMainland; 
            private java.util.List < String > ispTypeList; 
            private String localName; 
            private String regionId; 
            private Boolean supportIpv6; 

            /**
             * Whether China Mainland.
             */
            public Builder chinaMainland(Boolean chinaMainland) {
                this.chinaMainland = chinaMainland;
                return this;
            }

            /**
             * The line types of EIPs in the acceleration region.
             * <p>
             * 
             * *   **BGP**: BGP (Multi-ISP) lines
             * *   **BGP_PRO**: BGP (Multi-ISP) Pro lines
             * 
             * If you have the permissions to use single-ISP bandwidth, one of the following values may be returned:
             * 
             * *   **ChinaTelecom**: China Telecom (single ISP)
             * *   **ChinaUnicom**: China Unicom (single ISP)
             * *   **ChinaMobile**: China Mobile (single ISP)
             * *   **ChinaTelecom_L2**: China Telecom_L2 (single ISP)
             * *   **ChinaUnicom_L2**: China Unicom_L2 (single ISP)
             * *   **ChinaMobile_L2**: China Mobile_L2 (single ISP)
             * 
             * > Different acceleration regions support different single-ISP BGP lines.
             */
            public Builder ispTypeList(java.util.List < String > ispTypeList) {
                this.ispTypeList = ispTypeList;
                return this;
            }

            /**
             * The name of the acceleration region.
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * The ID of the acceleration region.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Ipv6 supported, Valid values:
             * <p>
             * 
             * - true
             * - false
             */
            public Builder supportIpv6(Boolean supportIpv6) {
                this.supportIpv6 = supportIpv6;
                return this;
            }

            public RegionList build() {
                return new RegionList(this);
            } 

        } 

    }
    public static class Areas extends TeaModel {
        @NameInMap("AreaId")
        private String areaId;

        @NameInMap("LocalName")
        private String localName;

        @NameInMap("RegionList")
        private java.util.List < RegionList> regionList;

        private Areas(Builder builder) {
            this.areaId = builder.areaId;
            this.localName = builder.localName;
            this.regionList = builder.regionList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Areas create() {
            return builder().build();
        }

        /**
         * @return areaId
         */
        public String getAreaId() {
            return this.areaId;
        }

        /**
         * @return localName
         */
        public String getLocalName() {
            return this.localName;
        }

        /**
         * @return regionList
         */
        public java.util.List < RegionList> getRegionList() {
            return this.regionList;
        }

        public static final class Builder {
            private String areaId; 
            private String localName; 
            private java.util.List < RegionList> regionList; 

            /**
             * The ID of the acceleration area.
             */
            public Builder areaId(String areaId) {
                this.areaId = areaId;
                return this;
            }

            /**
             * The name of the acceleration area.
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * The information about acceleration regions.
             */
            public Builder regionList(java.util.List < RegionList> regionList) {
                this.regionList = regionList;
                return this;
            }

            public Areas build() {
                return new Areas(this);
            } 

        } 

    }
}
