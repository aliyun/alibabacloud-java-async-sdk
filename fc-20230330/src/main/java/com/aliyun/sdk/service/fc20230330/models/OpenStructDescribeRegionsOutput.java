// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link OpenStructDescribeRegionsOutput} extends {@link TeaModel}
 *
 * <p>OpenStructDescribeRegionsOutput</p>
 */
public class OpenStructDescribeRegionsOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Regions")
    private Regions regions;

    private OpenStructDescribeRegionsOutput(Builder builder) {
        this.regions = builder.regions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenStructDescribeRegionsOutput create() {
        return builder().build();
    }

    /**
     * @return regions
     */
    public Regions getRegions() {
        return this.regions;
    }

    public static final class Builder {
        private Regions regions; 

        /**
         * Regions.
         */
        public Builder regions(Regions regions) {
            this.regions = regions;
            return this;
        }

        public OpenStructDescribeRegionsOutput build() {
            return new OpenStructDescribeRegionsOutput(this);
        } 

    } 

    /**
     * 
     * {@link OpenStructDescribeRegionsOutput} extends {@link TeaModel}
     *
     * <p>OpenStructDescribeRegionsOutput</p>
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

            public Region build() {
                return new Region(this);
            } 

        } 

    }
    /**
     * 
     * {@link OpenStructDescribeRegionsOutput} extends {@link TeaModel}
     *
     * <p>OpenStructDescribeRegionsOutput</p>
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
}
