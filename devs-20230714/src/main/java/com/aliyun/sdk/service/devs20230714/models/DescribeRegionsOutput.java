// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link DescribeRegionsOutput} extends {@link TeaModel}
 *
 * <p>DescribeRegionsOutput</p>
 */
public class DescribeRegionsOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("regions")
    private Regions regions;

    private DescribeRegionsOutput(Builder builder) {
        this.regions = builder.regions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRegionsOutput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regions
     */
    public Regions getRegions() {
        return this.regions;
    }

    public static final class Builder {
        private Regions regions; 

        private Builder() {
        } 

        private Builder(DescribeRegionsOutput model) {
            this.regions = model.regions;
        } 

        /**
         * regions.
         */
        public Builder regions(Regions regions) {
            this.regions = regions;
            return this;
        }

        public DescribeRegionsOutput build() {
            return new DescribeRegionsOutput(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRegionsOutput} extends {@link TeaModel}
     *
     * <p>DescribeRegionsOutput</p>
     */
    public static class Region extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("localName")
        private String localName;

        @com.aliyun.core.annotation.NameInMap("regionId")
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
             * localName.
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * regionId.
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
     * {@link DescribeRegionsOutput} extends {@link TeaModel}
     *
     * <p>DescribeRegionsOutput</p>
     */
    public static class Regions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("region")
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
             * region.
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
}
