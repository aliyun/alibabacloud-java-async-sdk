// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
 * {@link DescribeRegionsMixedResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRegionsMixedResponseBody</p>
 */
public class DescribeRegionsMixedResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Regions")
    private Regions regions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRegionsMixedResponseBody(Builder builder) {
        this.regions = builder.regions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRegionsMixedResponseBody create() {
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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Regions regions; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeRegionsMixedResponseBody model) {
            this.regions = model.regions;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The queried regions.</p>
         */
        public Builder regions(Regions regions) {
            this.regions = regions;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2E9450FF-F8AD-54C6-B3C3-009FBD7C0700</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRegionsMixedResponseBody build() {
            return new DescribeRegionsMixedResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRegionsMixedResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRegionsMixedResponseBody</p>
     */
    public static class Region extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Region(Builder builder) {
            this.regionId = builder.regionId;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Region create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String regionId; 
            private String version; 

            private Builder() {
            } 

            private Builder(Region model) {
                this.regionId = model.regionId;
                this.version = model.version;
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
             * <p>The version of the cluster.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>2.0</li>
             * <li>3.0</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3.0</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Region build() {
                return new Region(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRegionsMixedResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRegionsMixedResponseBody</p>
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
}
