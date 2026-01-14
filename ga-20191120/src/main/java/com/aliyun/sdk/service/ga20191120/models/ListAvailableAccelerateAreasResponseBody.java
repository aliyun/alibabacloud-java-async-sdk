// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

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
 * {@link ListAvailableAccelerateAreasResponseBody} extends {@link TeaModel}
 *
 * <p>ListAvailableAccelerateAreasResponseBody</p>
 */
public class ListAvailableAccelerateAreasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Areas")
    private java.util.List<Areas> areas;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return areas
     */
    public java.util.List<Areas> getAreas() {
        return this.areas;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Areas> areas; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAvailableAccelerateAreasResponseBody model) {
            this.areas = model.areas;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about acceleration areas.</p>
         */
        public Builder areas(java.util.List<Areas> areas) {
            this.areas = areas;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A9B4E54C-9CCD-4002-91A9-D38C6C209192</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAvailableAccelerateAreasResponseBody build() {
            return new ListAvailableAccelerateAreasResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAvailableAccelerateAreasResponseBody} extends {@link TeaModel}
     *
     * <p>ListAvailableAccelerateAreasResponseBody</p>
     */
    public static class RegionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChinaMainland")
        private Boolean chinaMainland;

        @com.aliyun.core.annotation.NameInMap("IspTypeList")
        private java.util.List<String> ispTypeList;

        @com.aliyun.core.annotation.NameInMap("LocalName")
        private String localName;

        @com.aliyun.core.annotation.NameInMap("MultiAz")
        private Boolean multiAz;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SupportIpv6")
        private Boolean supportIpv6;

        private RegionList(Builder builder) {
            this.chinaMainland = builder.chinaMainland;
            this.ispTypeList = builder.ispTypeList;
            this.localName = builder.localName;
            this.multiAz = builder.multiAz;
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
        public java.util.List<String> getIspTypeList() {
            return this.ispTypeList;
        }

        /**
         * @return localName
         */
        public String getLocalName() {
            return this.localName;
        }

        /**
         * @return multiAz
         */
        public Boolean getMultiAz() {
            return this.multiAz;
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
            private java.util.List<String> ispTypeList; 
            private String localName; 
            private Boolean multiAz; 
            private String regionId; 
            private Boolean supportIpv6; 

            private Builder() {
            } 

            private Builder(RegionList model) {
                this.chinaMainland = model.chinaMainland;
                this.ispTypeList = model.ispTypeList;
                this.localName = model.localName;
                this.multiAz = model.multiAz;
                this.regionId = model.regionId;
                this.supportIpv6 = model.supportIpv6;
            } 

            /**
             * <p>Indicates whether the region is in the Chinese mainland. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder chinaMainland(Boolean chinaMainland) {
                this.chinaMainland = chinaMainland;
                return this;
            }

            /**
             * <p>The line type of the elastic IP address (EIP) in the acceleration region. Valid values:</p>
             * <ul>
             * <li><strong>BGP</strong>: BGP (Multi-ISP) lines.</li>
             * <li><strong>BGP_PRO</strong>: BGP (Multi-ISP) Pro lines.</li>
             * </ul>
             */
            public Builder ispTypeList(java.util.List<String> ispTypeList) {
                this.ispTypeList = ispTypeList;
                return this;
            }

            /**
             * <p>The acceleration region name.</p>
             * 
             * <strong>example:</strong>
             * <p>China (Qingdao)</p>
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * <p>Indicates whether multiple zones are supported. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder multiAz(Boolean multiAz) {
                this.multiAz = multiAz;
                return this;
            }

            /**
             * <p>The ID of the acceleration region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-qingdao</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Indicates whether IPv6 is supported. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link ListAvailableAccelerateAreasResponseBody} extends {@link TeaModel}
     *
     * <p>ListAvailableAccelerateAreasResponseBody</p>
     */
    public static class Areas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AreaId")
        private String areaId;

        @com.aliyun.core.annotation.NameInMap("LocalName")
        private String localName;

        @com.aliyun.core.annotation.NameInMap("RegionList")
        private java.util.List<RegionList> regionList;

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
        public java.util.List<RegionList> getRegionList() {
            return this.regionList;
        }

        public static final class Builder {
            private String areaId; 
            private String localName; 
            private java.util.List<RegionList> regionList; 

            private Builder() {
            } 

            private Builder(Areas model) {
                this.areaId = model.areaId;
                this.localName = model.localName;
                this.regionList = model.regionList;
            } 

            /**
             * <p>The ID of the acceleration area.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-huabei</p>
             */
            public Builder areaId(String areaId) {
                this.areaId = areaId;
                return this;
            }

            /**
             * <p>The acceleration area name.</p>
             * 
             * <strong>example:</strong>
             * <p>North China</p>
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * <p>The information about acceleration regions.</p>
             */
            public Builder regionList(java.util.List<RegionList> regionList) {
                this.regionList = regionList;
                return this;
            }

            public Areas build() {
                return new Areas(this);
            } 

        } 

    }
}
