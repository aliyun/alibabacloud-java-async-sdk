// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link ListNatIpsResponseBody} extends {@link TeaModel}
 *
 * <p>ListNatIpsResponseBody</p>
 */
public class ListNatIpsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NatIps")
    private java.util.List<NatIps> natIps;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return natIps
     */
    public java.util.List<NatIps> getNatIps() {
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
        private java.util.List<NatIps> natIps; 
        private String nextToken; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(ListNatIpsResponseBody model) {
            this.natIps = model.natIps;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of IP addresses of the NAT gateway.</p>
         */
        public Builder natIps(java.util.List<NatIps> natIps) {
            this.natIps = natIps;
            return this;
        }

        /**
         * <p>The token that is used for the next query. Valid values:</p>
         * <ul>
         * <li>If the value of <strong>NextToken</strong> is not returned, it indicates that no next query is to be sent.</li>
         * <li>If the value of <strong>NextToken</strong> is returned, the value indicates the token that is used for the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7E78CEEA-BF8F-44D1-9DCD-D9141135B71E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of IP addresses that are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListNatIpsResponseBody build() {
            return new ListNatIpsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNatIpsResponseBody} extends {@link TeaModel}
     *
     * <p>ListNatIpsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(NatIps model) {
                this.isDefault = model.isDefault;
                this.natGatewayId = model.natGatewayId;
                this.natIp = model.natIp;
                this.natIpCidr = model.natIpCidr;
                this.natIpDescription = model.natIpDescription;
                this.natIpId = model.natIpId;
                this.natIpName = model.natIpName;
                this.natIpStatus = model.natIpStatus;
            } 

            /**
             * <p>Indicates whether the IP address is the default IP address of the NAT gateway. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The ID of the Virtual Private Cloud (VPC) NAT gateway to which the IP address is assigned.</p>
             * 
             * <strong>example:</strong>
             * <p>ngw-gw8v16wgvtq26vh59****</p>
             */
            public Builder natGatewayId(String natGatewayId) {
                this.natGatewayId = natGatewayId;
                return this;
            }

            /**
             * <p>The IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.126</p>
             */
            public Builder natIp(String natIp) {
                this.natIp = natIp;
                return this;
            }

            /**
             * <p>The CIDR block to which the IP address belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.0/24</p>
             */
            public Builder natIpCidr(String natIpCidr) {
                this.natIpCidr = natIpCidr;
                return this;
            }

            /**
             * <p>The description of the IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder natIpDescription(String natIpDescription) {
                this.natIpDescription = natIpDescription;
                return this;
            }

            /**
             * <p>The ID of the IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>vpcnatip-gw8a863sut1zijxh0****</p>
             */
            public Builder natIpId(String natIpId) {
                this.natIpId = natIpId;
                return this;
            }

            /**
             * <p>The name of the IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder natIpName(String natIpName) {
                this.natIpName = natIpName;
                return this;
            }

            /**
             * <p>The status of the IP address. Valid values:</p>
             * <ul>
             * <li><strong>Available</strong>: available</li>
             * <li><strong>Deleted</strong>: deleted</li>
             * <li><strong>Deleting</strong>: deleting</li>
             * <li><strong>Creating</strong>: creating</li>
             * <li><strong>Associated</strong>: specified in an SNAT or DNAT entry</li>
             * <li><strong>Associating</strong>: being specified in an SNAT or DNAT entry</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
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
