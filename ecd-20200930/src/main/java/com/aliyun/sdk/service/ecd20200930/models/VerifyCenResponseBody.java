// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyCenResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyCenResponseBody</p>
 */
public class VerifyCenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CidrBlocks")
    private java.util.List < String > cidrBlocks;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RouteEntries")
    private java.util.List < RouteEntries> routeEntries;

    @com.aliyun.core.annotation.NameInMap("Status")
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
         * The recommended IPv4 CIDR blocks. Three CIDR blocks are randomly recommended. This parameter is returned when the `Status` value is `Conflict`.
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
         * The routes provided by the CEN instance.
         */
        public Builder routeEntries(java.util.List < RouteEntries> routeEntries) {
            this.routeEntries = routeEntries;
            return this;
        }

        /**
         * The check result of CIDR block conflict.
         * <p>
         * 
         * Valid values:
         * 
         * *   InvalidCen.CenUidInvalid: The Alibaba Cloud account is invalid or the Alibaba Cloud account does not have the permission to access WUYING Workspace.
         * *   VerifyCode.InvalidTokenCode: The verification code is invalid.
         * *   VerifyCode.ReachTokenRetryTime: The maximum number of times for entering a verification code reaches the limit.
         * *   Conflict: A CIDR block conflict exists. If the verification result of at least one route is Conflict, Conflict is returned for this parameter.
         * *   Access: The verification is passed. If the verification result for all routes is Access, Access is returned for this parameter.
         * *   InvalidCen.ParameterCenInstanceId: The Alibaba Cloud account does not own the CEN instance.
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
        @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
        private String destinationCidrBlock;

        @com.aliyun.core.annotation.NameInMap("NextHopInstanceId")
        private String nextHopInstanceId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * The ID of the instance corresponding to the route.
             */
            public Builder nextHopInstanceId(String nextHopInstanceId) {
                this.nextHopInstanceId = nextHopInstanceId;
                return this;
            }

            /**
             * The region ID of the route.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The verification result of the route.
             * <p>
             * 
             * Valid values:
             * 
             * *   Conflict: A CIDR block conflict exists.
             * *   Access: The verification is passed.
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
