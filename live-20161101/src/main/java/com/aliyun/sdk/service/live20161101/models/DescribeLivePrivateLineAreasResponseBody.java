// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLivePrivateLineAreasResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLivePrivateLineAreasResponseBody</p>
 */
public class DescribeLivePrivateLineAreasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LiveAreasList")
    private LiveAreasList liveAreasList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLivePrivateLineAreasResponseBody(Builder builder) {
        this.liveAreasList = builder.liveAreasList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLivePrivateLineAreasResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return liveAreasList
     */
    public LiveAreasList getLiveAreasList() {
        return this.liveAreasList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LiveAreasList liveAreasList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeLivePrivateLineAreasResponseBody model) {
            this.liveAreasList = model.liveAreasList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Details about the regions.</p>
         */
        public Builder liveAreasList(LiveAreasList liveAreasList) {
            this.liveAreasList = liveAreasList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C4865B85-664B-19D3-BB16-C62FB83C8226</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLivePrivateLineAreasResponseBody build() {
            return new DescribeLivePrivateLineAreasResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLivePrivateLineAreasResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLivePrivateLineAreasResponseBody</p>
     */
    public static class Region extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LocalName")
        private String localName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private Region(Builder builder) {
            this.localName = builder.localName;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Region create() {
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

            private Builder(Region model) {
                this.localName = model.localName;
                this.regionId = model.regionId;
            } 

            /**
             * <p>The region name.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shenzhen</p>
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shenzhen</p>
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
     * {@link DescribeLivePrivateLineAreasResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLivePrivateLineAreasResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Regions model) {
                this.region = model.region;
            } 

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
    /**
     * 
     * {@link DescribeLivePrivateLineAreasResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLivePrivateLineAreasResponseBody</p>
     */
    public static class LiveArea extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionType")
        private String regionType;

        @com.aliyun.core.annotation.NameInMap("Regions")
        private Regions regions;

        private LiveArea(Builder builder) {
            this.regionType = builder.regionType;
            this.regions = builder.regions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveArea create() {
            return builder().build();
        }

        /**
         * @return regionType
         */
        public String getRegionType() {
            return this.regionType;
        }

        /**
         * @return regions
         */
        public Regions getRegions() {
            return this.regions;
        }

        public static final class Builder {
            private String regionType; 
            private Regions regions; 

            private Builder() {
            } 

            private Builder(LiveArea model) {
                this.regionType = model.regionType;
                this.regions = model.regions;
            } 

            /**
             * <p>The region type. Valid values:</p>
             * <ul>
             * <li>domestic: in the Chinese mainland</li>
             * <li>overseas: outside the Chinese mainland</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>domestic</p>
             */
            public Builder regionType(String regionType) {
                this.regionType = regionType;
                return this;
            }

            /**
             * <p>The regions.</p>
             */
            public Builder regions(Regions regions) {
                this.regions = regions;
                return this;
            }

            public LiveArea build() {
                return new LiveArea(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLivePrivateLineAreasResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLivePrivateLineAreasResponseBody</p>
     */
    public static class LiveAreasList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LiveArea")
        private java.util.List<LiveArea> liveArea;

        private LiveAreasList(Builder builder) {
            this.liveArea = builder.liveArea;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveAreasList create() {
            return builder().build();
        }

        /**
         * @return liveArea
         */
        public java.util.List<LiveArea> getLiveArea() {
            return this.liveArea;
        }

        public static final class Builder {
            private java.util.List<LiveArea> liveArea; 

            private Builder() {
            } 

            private Builder(LiveAreasList model) {
                this.liveArea = model.liveArea;
            } 

            /**
             * LiveArea.
             */
            public Builder liveArea(java.util.List<LiveArea> liveArea) {
                this.liveArea = liveArea;
                return this;
            }

            public LiveAreasList build() {
                return new LiveAreasList(this);
            } 

        } 

    }
}
