// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNatIpsResponseBody} extends {@link TeaModel}
 *
 * <p>ListNatIpsResponseBody</p>
 */
public class ListNatIpsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NatIps")
    private java.util.List < NatIps> natIps;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private ListNatIpsResponseBody(Builder builder) {
        this.natIps = builder.natIps;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNatIpsResponseBody create() {
        return builder().build();
    }

    /**
     * @return natIps
     */
    public java.util.List < NatIps> getNatIps() {
        return this.natIps;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < NatIps> natIps; 
        private String nextToken; 
        private String requestId; 
        private String totalCount; 

        /**
         * The list of IP addresses of the NAT gateway.
         */
        public Builder natIps(java.util.List < NatIps> natIps) {
            this.natIps = natIps;
            return this;
        }

        /**
         * The token that is used for the next query. Valid values:
         * <p>
         * 
         * *   If the value of **NextToken** is not returned, it indicates that no next query is to be sent.
         * *   If the value of **NextToken** is returned, the value indicates the token that is used for the next query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * The number of IP addresses that are returned.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListNatIpsResponseBody build() {
            return new ListNatIpsResponseBody(this);
        } 

    } 

    public static class NatIps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("NatGatewayId")
        private String natGatewayId;

        @com.aliyun.core.annotation.NameInMap("NatIp")
        private String natIp;

        @com.aliyun.core.annotation.NameInMap("NatIpCidr")
        private String natIpCidr;

        @com.aliyun.core.annotation.NameInMap("NatIpDescription")
        private String natIpDescription;

        @com.aliyun.core.annotation.NameInMap("NatIpId")
        private String natIpId;

        @com.aliyun.core.annotation.NameInMap("NatIpName")
        private String natIpName;

        @com.aliyun.core.annotation.NameInMap("NatIpStatus")
        private String natIpStatus;

        private NatIps(Builder builder) {
            this.isDefault = builder.isDefault;
            this.natGatewayId = builder.natGatewayId;
            this.natIp = builder.natIp;
            this.natIpCidr = builder.natIpCidr;
            this.natIpDescription = builder.natIpDescription;
            this.natIpId = builder.natIpId;
            this.natIpName = builder.natIpName;
            this.natIpStatus = builder.natIpStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NatIps create() {
            return builder().build();
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return natGatewayId
         */
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        /**
         * @return natIp
         */
        public String getNatIp() {
            return this.natIp;
        }

        /**
         * @return natIpCidr
         */
        public String getNatIpCidr() {
            return this.natIpCidr;
        }

        /**
         * @return natIpDescription
         */
        public String getNatIpDescription() {
            return this.natIpDescription;
        }

        /**
         * @return natIpId
         */
        public String getNatIpId() {
            return this.natIpId;
        }

        /**
         * @return natIpName
         */
        public String getNatIpName() {
            return this.natIpName;
        }

        /**
         * @return natIpStatus
         */
        public String getNatIpStatus() {
            return this.natIpStatus;
        }

        public static final class Builder {
            private Boolean isDefault; 
            private String natGatewayId; 
            private String natIp; 
            private String natIpCidr; 
            private String natIpDescription; 
            private String natIpId; 
            private String natIpName; 
            private String natIpStatus; 

            /**
             * Indicates whether the IP address is the default IP address of the NAT gateway. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * The ID of the Virtual Private Cloud (VPC) NAT gateway to which the IP address is assigned.
             */
            public Builder natGatewayId(String natGatewayId) {
                this.natGatewayId = natGatewayId;
                return this;
            }

            /**
             * The IP address.
             */
            public Builder natIp(String natIp) {
                this.natIp = natIp;
                return this;
            }

            /**
             * The CIDR block to which the IP address belongs.
             */
            public Builder natIpCidr(String natIpCidr) {
                this.natIpCidr = natIpCidr;
                return this;
            }

            /**
             * The description of the IP address.
             */
            public Builder natIpDescription(String natIpDescription) {
                this.natIpDescription = natIpDescription;
                return this;
            }

            /**
             * The ID of the IP address.
             */
            public Builder natIpId(String natIpId) {
                this.natIpId = natIpId;
                return this;
            }

            /**
             * The name of the IP address.
             */
            public Builder natIpName(String natIpName) {
                this.natIpName = natIpName;
                return this;
            }

            /**
             * The status of the IP address. Valid values:
             * <p>
             * 
             * *   **Available**: available
             * *   **Deleted**: deleted
             * *   **Deleting**: deleting
             * *   **Creating**: creating
             * *   **Associated**: specified in an SNAT or DNAT entry
             * *   **Associating**: being specified in an SNAT or DNAT entry
             */
            public Builder natIpStatus(String natIpStatus) {
                this.natIpStatus = natIpStatus;
                return this;
            }

            public NatIps build() {
                return new NatIps(this);
            } 

        } 

    }
}
