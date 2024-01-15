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
         * The three random IPv4 CIDR blocks that are recommended. If the returned value of the Status parameter is Conflict, this parameter is returned.
         */
        public Builder cidrBlocks(java.util.List < String > cidrBlocks) {
            this.cidrBlocks = cidrBlocks;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the routes of the CEN instance.
         */
        public Builder routeEntries(java.util.List < RouteEntries> routeEntries) {
            this.routeEntries = routeEntries;
            return this;
        }

        /**
         * The verification result. Valid values:
         * <p>
         * 
         * *   Access: The route verification succeeds. If the verification result for all routes succeeds, Access is returned for this parameter.
         * *   Conflict: A CIDR block conflict exists. If the verification result of at least one route is Conflict, Conflict is returned for this parameter.
         * *   InvalidCen.ParameterCenInstanceId: The ID of the CEN instance and the ID of the Alibaba Cloud account are invalid. The CEN instance does not belong to the Alibaba Cloud account.
         * *   InvalidCen.CenUidInvalid: The ID of the Alibaba Cloud account is invalid or the Alibaba Cloud account is not granted the required permissions to access Elastic Desktop Service (EDS).
         * *   VerifyCode.InvalidTokenCode: The verification code is invalid.
         * *   VerifyCode.ReachTokenRetryTime: The retries of entering the verification code reaches the upper limit.
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
             * The CIDR block of the route.
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

            /**
             * The ID of the network instance that is attached to the route.
             */
            public Builder nextHopInstanceId(String nextHopInstanceId) {
                this.nextHopInstanceId = nextHopInstanceId;
                return this;
            }

            /**
             * The ID of the region where the route resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The verification result for a route. Valid values:
             * <p>
             * 
             * *   Access: The route verification succeeds.
             * *   Conflict: A CIDR block conflict exists.
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
