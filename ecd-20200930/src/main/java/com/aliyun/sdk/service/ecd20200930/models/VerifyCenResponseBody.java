// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyCenResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyCenResponseBody</p>
 */
public class VerifyCenResponseBody extends TeaModel {
    @NameInMap("CidrBlocks")
    private java.util.List < String > cidrBlocks;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RouteEntries")
    private java.util.List < RouteEntries> routeEntries;

    @NameInMap("Status")
    private String status;

    private VerifyCenResponseBody(Builder builder) {
        this.cidrBlocks = builder.cidrBlocks;
        this.requestId = builder.requestId;
        this.routeEntries = builder.routeEntries;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyCenResponseBody create() {
        return builder().build();
    }

    /**
     * @return cidrBlocks
     */
    public java.util.List < String > getCidrBlocks() {
        return this.cidrBlocks;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return routeEntries
     */
    public java.util.List < RouteEntries> getRouteEntries() {
        return this.routeEntries;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private java.util.List < String > cidrBlocks; 
        private String requestId; 
        private java.util.List < RouteEntries> routeEntries; 
        private String status; 

        /**
         * CidrBlocks.
         */
        public Builder cidrBlocks(java.util.List < String > cidrBlocks) {
            this.cidrBlocks = cidrBlocks;
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
         * RouteEntries.
         */
        public Builder routeEntries(java.util.List < RouteEntries> routeEntries) {
            this.routeEntries = routeEntries;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public VerifyCenResponseBody build() {
            return new VerifyCenResponseBody(this);
        } 

    } 

    public static class RouteEntries extends TeaModel {
        @NameInMap("DestinationCidrBlock")
        private String destinationCidrBlock;

        @NameInMap("NextHopInstanceId")
        private String nextHopInstanceId;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Status")
        private String status;

        private RouteEntries(Builder builder) {
            this.destinationCidrBlock = builder.destinationCidrBlock;
            this.nextHopInstanceId = builder.nextHopInstanceId;
            this.regionId = builder.regionId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteEntries create() {
            return builder().build();
        }

        /**
         * @return destinationCidrBlock
         */
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        /**
         * @return nextHopInstanceId
         */
        public String getNextHopInstanceId() {
            return this.nextHopInstanceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String destinationCidrBlock; 
            private String nextHopInstanceId; 
            private String regionId; 
            private String status; 

            /**
             * DestinationCidrBlock.
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

            /**
             * NextHopInstanceId.
             */
            public Builder nextHopInstanceId(String nextHopInstanceId) {
                this.nextHopInstanceId = nextHopInstanceId;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public RouteEntries build() {
                return new RouteEntries(this);
            } 

        } 

    }
}
