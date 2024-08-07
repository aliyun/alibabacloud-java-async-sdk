// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAccelerateAreasResponseBody} extends {@link TeaModel}
 *
 * <p>ListAccelerateAreasResponseBody</p>
 */
public class ListAccelerateAreasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Areas")
    private java.util.List < Areas> areas;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAccelerateAreasResponseBody(Builder builder) {
        this.areas = builder.areas;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAccelerateAreasResponseBody create() {
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
         * The information about the areas.
         */
        public Builder areas(java.util.List < Areas> areas) {
            this.areas = areas;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAccelerateAreasResponseBody build() {
            return new ListAccelerateAreasResponseBody(this);
        } 

    } 

    public static class RegionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LocalName")
        private String localName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
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
             * The name of the region.
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * The region ID.
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
        @com.aliyun.core.annotation.NameInMap("AreaId")
        private String areaId;

        @com.aliyun.core.annotation.NameInMap("LocalName")
        private String localName;

        @com.aliyun.core.annotation.NameInMap("RegionList")
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
             * The area ID.
             */
            public Builder areaId(String areaId) {
                this.areaId = areaId;
                return this;
            }

            /**
             * The name of the area.
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * The regions in the acceleration area.
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
