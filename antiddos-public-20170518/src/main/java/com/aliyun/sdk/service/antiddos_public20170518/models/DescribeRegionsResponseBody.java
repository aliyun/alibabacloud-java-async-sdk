// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antiddos_public20170518.models;

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

        public DescribeRegionsResponseBody build() {
            return new DescribeRegionsResponseBody(this);
        } 

    } 

    public static class Region extends TeaModel {
        @NameInMap("RegionEnName")
        private String regionEnName;

        @NameInMap("RegionName")
        private String regionName;

        @NameInMap("RegionNo")
        private String regionNo;

        @NameInMap("RegionNoAlias")
        private String regionNoAlias;

        private Region(Builder builder) {
            this.regionEnName = builder.regionEnName;
            this.regionName = builder.regionName;
            this.regionNo = builder.regionNo;
            this.regionNoAlias = builder.regionNoAlias;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Region create() {
            return builder().build();
        }

        /**
         * @return regionEnName
         */
        public String getRegionEnName() {
            return this.regionEnName;
        }

        /**
         * @return regionName
         */
        public String getRegionName() {
            return this.regionName;
        }

        /**
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
        }

        /**
         * @return regionNoAlias
         */
        public String getRegionNoAlias() {
            return this.regionNoAlias;
        }

        public static final class Builder {
            private String regionEnName; 
            private String regionName; 
            private String regionNo; 
            private String regionNoAlias; 

            /**
             * RegionEnName.
             */
            public Builder regionEnName(String regionEnName) {
                this.regionEnName = regionEnName;
                return this;
            }

            /**
             * RegionName.
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            /**
             * RegionNo.
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * RegionNoAlias.
             */
            public Builder regionNoAlias(String regionNoAlias) {
                this.regionNoAlias = regionNoAlias;
                return this;
            }

            public Region build() {
                return new Region(this);
            } 

        } 

    }
    public static class Regions extends TeaModel {
        @NameInMap("Region")
        private java.util.List < Region> region;

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
        public java.util.List < Region> getRegion() {
            return this.region;
        }

        public static final class Builder {
            private java.util.List < Region> region; 

            /**
             * Region.
             */
            public Builder region(java.util.List < Region> region) {
                this.region = region;
                return this;
            }

            public Regions build() {
                return new Regions(this);
            } 

        } 

    }
}
