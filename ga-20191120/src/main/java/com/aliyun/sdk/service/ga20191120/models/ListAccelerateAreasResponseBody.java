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
 * {@link ListAccelerateAreasResponseBody} extends {@link TeaModel}
 *
 * <p>ListAccelerateAreasResponseBody</p>
 */
public class ListAccelerateAreasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Areas")
    private java.util.List<Areas> areas;

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

        private Builder(ListAccelerateAreasResponseBody model) {
            this.areas = model.areas;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the areas.</p>
         */
        public Builder areas(java.util.List<Areas> areas) {
            this.areas = areas;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6FEA0CF3-D3B9-43E5-A304-D217037876A8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAccelerateAreasResponseBody build() {
            return new ListAccelerateAreasResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAccelerateAreasResponseBody} extends {@link TeaModel}
     *
     * <p>ListAccelerateAreasResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(RegionList model) {
                this.localName = model.localName;
                this.regionId = model.regionId;
            } 

            /**
             * <p>The name of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>China (Qingdao)</p>
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-qingdao</p>
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
    /**
     * 
     * {@link ListAccelerateAreasResponseBody} extends {@link TeaModel}
     *
     * <p>ListAccelerateAreasResponseBody</p>
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
             * <p>The area ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-huabei</p>
             */
            public Builder areaId(String areaId) {
                this.areaId = areaId;
                return this;
            }

            /**
             * <p>The name of the area.</p>
             * 
             * <strong>example:</strong>
             * <p>North China</p>
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * <p>The regions in the acceleration area.</p>
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
