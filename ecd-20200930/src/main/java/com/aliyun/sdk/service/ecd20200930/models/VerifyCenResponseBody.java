// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link VerifyCenResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyCenResponseBody</p>
 */
public class VerifyCenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CidrBlocks")
    private java.util.List<String> cidrBlocks;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RouteEntries")
    private java.util.List<RouteEntries> routeEntries;

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
    public java.util.List<String> getCidrBlocks() {
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
    public java.util.List<RouteEntries> getRouteEntries() {
        return this.routeEntries;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private java.util.List<String> cidrBlocks; 
        private String requestId; 
        private java.util.List<RouteEntries> routeEntries; 
        private String status; 

        /**
         * <p>The recommended IPv4 CIDR blocks. Three CIDR blocks are randomly recommended. This parameter is returned when the <code>Status</code> value is <code>Conflict</code>.</p>
         */
        public Builder cidrBlocks(java.util.List<String> cidrBlocks) {
            this.cidrBlocks = cidrBlocks;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0AF9D857-AE96-53D6-B317-5DD665EC4EC0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The routes provided by the CEN instance.</p>
         */
        public Builder routeEntries(java.util.List<RouteEntries> routeEntries) {
            this.routeEntries = routeEntries;
            return this;
        }

        /**
         * <p>The check result of CIDR block conflict.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>InvalidCen.CenUidInvalid: The Alibaba Cloud account is invalid or the Alibaba Cloud account does not have the permission to access Elastic Desktop Service.</li>
         * <li>VerifyCode.InvalidTokenCode: The verification code is invalid.</li>
         * <li>VerifyCode.ReachTokenRetryTime: The maximum number of times for entering a verification code reaches the limit.</li>
         * <li>Conflict: A CIDR block conflict exists. If the verification result of at least one route is Conflict, Conflict is returned for this parameter.</li>
         * <li>Access: The verification is passed. If the verification result for all routes is Access, Access is returned for this parameter.</li>
         * <li>InvalidCen.ParameterCenInstanceId: The Alibaba Cloud account does not own the CEN instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Access</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public VerifyCenResponseBody build() {
            return new VerifyCenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link VerifyCenResponseBody} extends {@link TeaModel}
     *
     * <p>VerifyCenResponseBody</p>
     */
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
             * <p>The CIDR block of the route.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.111.3****</p>
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

            /**
             * <p>The ID of the instance corresponding to the route.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-uf62bu0xs5j8md54p****</p>
             */
            public Builder nextHopInstanceId(String nextHopInstanceId) {
                this.nextHopInstanceId = nextHopInstanceId;
                return this;
            }

            /**
             * <p>The region ID of the route.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The verification result of the route.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Conflict: A CIDR block conflict exists.</li>
             * <li>Access: The verification is passed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Access</p>
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
