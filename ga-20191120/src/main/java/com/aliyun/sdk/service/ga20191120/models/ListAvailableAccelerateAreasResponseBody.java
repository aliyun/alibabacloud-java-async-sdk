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
         * Areas.
         */
        public Builder areas(java.util.List < Areas> areas) {
            this.areas = areas;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("LocalName")
        private String localName;

        @NameInMap("RegionId")
        private String regionId;

        private RegionList(Builder builder) {
            this.localName = builder.localName;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionList create() {
            return builder().build();
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

        public static final class Builder {
            private String localName; 
            private String regionId; 

            /**
             * LocalName.
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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
             * AreaId.
             */
            public Builder areaId(String areaId) {
                this.areaId = areaId;
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
             * RegionList.
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
