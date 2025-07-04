// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

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
 * {@link DescribeRegionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRegionsResponseBody</p>
 */
public class DescribeRegionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Regions")
    private java.util.List<Regions> regions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regions
     */
    public java.util.List<Regions> getRegions() {
        return this.regions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Regions> regions; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeRegionsResponseBody model) {
            this.regions = model.regions;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of regions.</p>
         */
        public Builder regions(java.util.List<Regions> regions) {
            this.regions = regions;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>89945DD3-9072-47D0-A318-353284CFC7B3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRegionsResponseBody build() {
            return new DescribeRegionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRegionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRegionsResponseBody</p>
     */
    public static class Regions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RecommendZones")
        private java.util.List<String> recommendZones;

        @com.aliyun.core.annotation.NameInMap("RegionEndpoint")
        private String regionEndpoint;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("UnavailableZones")
        private java.util.List<String> unavailableZones;

        @com.aliyun.core.annotation.NameInMap("Zones")
        private java.util.List<String> zones;

        private Regions(Builder builder) {
            this.recommendZones = builder.recommendZones;
            this.regionEndpoint = builder.regionEndpoint;
            this.regionId = builder.regionId;
            this.unavailableZones = builder.unavailableZones;
            this.zones = builder.zones;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Regions create() {
            return builder().build();
        }

        /**
         * @return recommendZones
         */
        public java.util.List<String> getRecommendZones() {
            return this.recommendZones;
        }

        /**
         * @return regionEndpoint
         */
        public String getRegionEndpoint() {
            return this.regionEndpoint;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return unavailableZones
         */
        public java.util.List<String> getUnavailableZones() {
            return this.unavailableZones;
        }

        /**
         * @return zones
         */
        public java.util.List<String> getZones() {
            return this.zones;
        }

        public static final class Builder {
            private java.util.List<String> recommendZones; 
            private String regionEndpoint; 
            private String regionId; 
            private java.util.List<String> unavailableZones; 
            private java.util.List<String> zones; 

            private Builder() {
            } 

            private Builder(Regions model) {
                this.recommendZones = model.recommendZones;
                this.regionEndpoint = model.regionEndpoint;
                this.regionId = model.regionId;
                this.unavailableZones = model.unavailableZones;
                this.zones = model.zones;
            } 

            /**
             * <p>The list of recommended zones.</p>
             */
            public Builder recommendZones(java.util.List<String> recommendZones) {
                this.recommendZones = recommendZones;
                return this;
            }

            /**
             * <p>The endpoint for the region.</p>
             * 
             * <strong>example:</strong>
             * <p>eci.aliyuncs.com</p>
             */
            public Builder regionEndpoint(String regionEndpoint) {
                this.regionEndpoint = regionEndpoint;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The list of unavailable zones.</p>
             */
            public Builder unavailableZones(java.util.List<String> unavailableZones) {
                this.unavailableZones = unavailableZones;
                return this;
            }

            /**
             * <p>The queried zones.</p>
             */
            public Builder zones(java.util.List<String> zones) {
                this.zones = zones;
                return this;
            }

            public Regions build() {
                return new Regions(this);
            } 

        } 

    }
}
