// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Regions")
    private Regions regions;

    private DescribeRegionsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.regions = builder.regions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRegionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return regions
     */
    public Regions getRegions() {
        return this.regions;
    }

    public static final class Builder {
        private String requestId; 
        private Regions regions; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The set of region information.
         */
        public Builder regions(Regions regions) {
            this.regions = regions;
            return this;
        }

        public DescribeRegionsResponseBody build() {
            return new DescribeRegionsResponseBody(this);
        } 

    } 

    public static class Region extends TeaModel {
        @NameInMap("Status")
        private String status;

        @NameInMap("RegionEndpoint")
        private String regionEndpoint;

        @NameInMap("LocalName")
        private String localName;

        @NameInMap("RegionId")
        private String regionId;

        private Region(Builder builder) {
            this.status = builder.status;
            this.regionEndpoint = builder.regionEndpoint;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return regionEndpoint
         */
        public String getRegionEndpoint() {
            return this.regionEndpoint;
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
            private String status; 
            private String regionEndpoint; 
            private String localName; 
            private String regionId; 

            /**
             * Indicates whether the cluster is sold out. Possible values:
             * <p>
             * 
             * -available
             * -soldOut
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The Endpoint of the region.
             */
            public Builder regionEndpoint(String regionEndpoint) {
                this.regionEndpoint = regionEndpoint;
                return this;
            }

            /**
             * The region name.
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * The ID of the region.
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
