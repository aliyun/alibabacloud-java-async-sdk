// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSupportedRegionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSupportedRegionsResponseBody</p>
 */
public class DescribeSupportedRegionsResponseBody extends TeaModel {
    @NameInMap("Regions")
    private java.util.List < Regions> regions;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeSupportedRegionsResponseBody(Builder builder) {
        this.regions = builder.regions;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSupportedRegionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return regions
     */
    public java.util.List < Regions> getRegions() {
        return this.regions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.List < Regions> regions; 
        private String requestId; 
        private Boolean success; 

        /**
         * Regions.
         */
        public Builder regions(java.util.List < Regions> regions) {
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeSupportedRegionsResponseBody build() {
            return new DescribeSupportedRegionsResponseBody(this);
        } 

    } 

    public static class Regions extends TeaModel {
        @NameInMap("Region")
        private String region;

        @NameInMap("RegionName")
        private String regionName;

        private Regions(Builder builder) {
            this.region = builder.region;
            this.regionName = builder.regionName;
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
        public String getRegion() {
            return this.region;
        }

        /**
         * @return regionName
         */
        public String getRegionName() {
            return this.regionName;
        }

        public static final class Builder {
            private String region; 
            private String regionName; 

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * RegionName.
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            public Regions build() {
                return new Regions(this);
            } 

        } 

    }
}
