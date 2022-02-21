// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNatIpsResponseBody} extends {@link TeaModel}
 *
 * <p>ListNatIpsResponseBody</p>
 */
public class ListNatIpsResponseBody extends TeaModel {
    @NameInMap("NatIps")
    private java.util.List < NatIps> natIps;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * NatIps.
         */
        public Builder natIps(java.util.List < NatIps> natIps) {
            this.natIps = natIps;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * TotalCount.
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
        @NameInMap("IsDefault")
        private Boolean isDefault;

        @NameInMap("NatGatewayId")
        private String natGatewayId;

        @NameInMap("NatIp")
        private String natIp;

        @NameInMap("NatIpCidr")
        private String natIpCidr;

        @NameInMap("NatIpDescription")
        private String natIpDescription;

        @NameInMap("NatIpId")
        private String natIpId;

        @NameInMap("NatIpName")
        private String natIpName;

        @NameInMap("NatIpStatus")
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
             * IsDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * NatGatewayId.
             */
            public Builder natGatewayId(String natGatewayId) {
                this.natGatewayId = natGatewayId;
                return this;
            }

            /**
             * NatIp.
             */
            public Builder natIp(String natIp) {
                this.natIp = natIp;
                return this;
            }

            /**
             * NatIpCidr.
             */
            public Builder natIpCidr(String natIpCidr) {
                this.natIpCidr = natIpCidr;
                return this;
            }

            /**
             * NatIpDescription.
             */
            public Builder natIpDescription(String natIpDescription) {
                this.natIpDescription = natIpDescription;
                return this;
            }

            /**
             * NatIpId.
             */
            public Builder natIpId(String natIpId) {
                this.natIpId = natIpId;
                return this;
            }

            /**
             * NatIpName.
             */
            public Builder natIpName(String natIpName) {
                this.natIpName = natIpName;
                return this;
            }

            /**
             * NatIpStatus.
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
