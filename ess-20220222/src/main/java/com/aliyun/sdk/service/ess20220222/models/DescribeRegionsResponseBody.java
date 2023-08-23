// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

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
    private java.util.List < Regions> regions;

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
    public java.util.List < Regions> getRegions() {
        return this.regions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Regions> regions; 
        private String requestId; 

        /**
         * Details of the regions.
         */
        public Builder regions(java.util.List < Regions> regions) {
            this.regions = regions;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRegionsResponseBody build() {
            return new DescribeRegionsResponseBody(this);
        } 

    } 

    public static class Regions extends TeaModel {
        @NameInMap("ClassicUnavailable")
        private Boolean classicUnavailable;

        @NameInMap("LocalName")
        private String localName;

        @NameInMap("RegionEndpoint")
        private String regionEndpoint;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("VpcUnavailable")
        private Boolean vpcUnavailable;

        private Regions(Builder builder) {
            this.classicUnavailable = builder.classicUnavailable;
            this.localName = builder.localName;
            this.regionEndpoint = builder.regionEndpoint;
            this.regionId = builder.regionId;
            this.vpcUnavailable = builder.vpcUnavailable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Regions create() {
            return builder().build();
        }

        /**
         * @return classicUnavailable
         */
        public Boolean getClassicUnavailable() {
            return this.classicUnavailable;
        }

        /**
         * @return localName
         */
        public String getLocalName() {
            return this.localName;
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
         * @return vpcUnavailable
         */
        public Boolean getVpcUnavailable() {
            return this.vpcUnavailable;
        }

        public static final class Builder {
            private Boolean classicUnavailable; 
            private String localName; 
            private String regionEndpoint; 
            private String regionId; 
            private Boolean vpcUnavailable; 

            /**
             * Indicates whether the region supports scaling groups of the classic network type. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder classicUnavailable(Boolean classicUnavailable) {
                this.classicUnavailable = classicUnavailable;
                return this;
            }

            /**
             * The name of the region.
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * The endpoint of the region.
             */
            public Builder regionEndpoint(String regionEndpoint) {
                this.regionEndpoint = regionEndpoint;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Indicates whether the region supports scaling groups of the virtual private cloud (VPC) type. Valid values:
             * <p>
             * 
             * *   true: The region does not support scaling groups of the VPC type.
             * *   false: The region supports scaling groups of the VPC type.
             */
            public Builder vpcUnavailable(Boolean vpcUnavailable) {
                this.vpcUnavailable = vpcUnavailable;
                return this;
            }

            public Regions build() {
                return new Regions(this);
            } 

        } 

    }
}
