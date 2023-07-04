// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNatIpCidrsResponseBody} extends {@link TeaModel}
 *
 * <p>ListNatIpCidrsResponseBody</p>
 */
public class ListNatIpCidrsResponseBody extends TeaModel {
    @NameInMap("NatIpCidrs")
    private java.util.List < NatIpCidrs> natIpCidrs;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private String totalCount;

    private ListNatIpCidrsResponseBody(Builder builder) {
        this.natIpCidrs = builder.natIpCidrs;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNatIpCidrsResponseBody create() {
        return builder().build();
    }

    /**
     * @return natIpCidrs
     */
    public java.util.List < NatIpCidrs> getNatIpCidrs() {
        return this.natIpCidrs;
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
        private java.util.List < NatIpCidrs> natIpCidrs; 
        private String nextToken; 
        private String requestId; 
        private String totalCount; 

        /**
         * The CIDR blocks of the NAT gateway.
         */
        public Builder natIpCidrs(java.util.List < NatIpCidrs> natIpCidrs) {
            this.natIpCidrs = natIpCidrs;
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
         * The number of CIDR blocks that are returned.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListNatIpCidrsResponseBody build() {
            return new ListNatIpCidrsResponseBody(this);
        } 

    } 

    public static class NatIpCidrs extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("IsDefault")
        private Boolean isDefault;

        @NameInMap("NatGatewayId")
        private String natGatewayId;

        @NameInMap("NatIpCidr")
        private String natIpCidr;

        @NameInMap("NatIpCidrDescription")
        private String natIpCidrDescription;

        @NameInMap("NatIpCidrId")
        private String natIpCidrId;

        @NameInMap("NatIpCidrName")
        private String natIpCidrName;

        @NameInMap("NatIpCidrStatus")
        private String natIpCidrStatus;

        private NatIpCidrs(Builder builder) {
            this.creationTime = builder.creationTime;
            this.isDefault = builder.isDefault;
            this.natGatewayId = builder.natGatewayId;
            this.natIpCidr = builder.natIpCidr;
            this.natIpCidrDescription = builder.natIpCidrDescription;
            this.natIpCidrId = builder.natIpCidrId;
            this.natIpCidrName = builder.natIpCidrName;
            this.natIpCidrStatus = builder.natIpCidrStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NatIpCidrs create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
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
         * @return natIpCidr
         */
        public String getNatIpCidr() {
            return this.natIpCidr;
        }

        /**
         * @return natIpCidrDescription
         */
        public String getNatIpCidrDescription() {
            return this.natIpCidrDescription;
        }

        /**
         * @return natIpCidrId
         */
        public String getNatIpCidrId() {
            return this.natIpCidrId;
        }

        /**
         * @return natIpCidrName
         */
        public String getNatIpCidrName() {
            return this.natIpCidrName;
        }

        /**
         * @return natIpCidrStatus
         */
        public String getNatIpCidrStatus() {
            return this.natIpCidrStatus;
        }

        public static final class Builder {
            private String creationTime; 
            private Boolean isDefault; 
            private String natGatewayId; 
            private String natIpCidr; 
            private String natIpCidrDescription; 
            private String natIpCidrId; 
            private String natIpCidrName; 
            private String natIpCidrStatus; 

            /**
             * The time when the CIDR block was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Indicates whether the CIDR block is the default CIDR block of the NAT gateway. Valid values:
             * <p>
             * 
             * *   **true**: The CIDR block is the default CIDR block of the NAT gateway.
             * *   **false**: The CIDR block is not the default CIDR block of the NAT gateway.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * The ID of the VPC NAT gateway.
             */
            public Builder natGatewayId(String natGatewayId) {
                this.natGatewayId = natGatewayId;
                return this;
            }

            /**
             * The CIDR block of the NAT gateway.
             */
            public Builder natIpCidr(String natIpCidr) {
                this.natIpCidr = natIpCidr;
                return this;
            }

            /**
             * The description of the CIDR block of the NAT gateway.
             */
            public Builder natIpCidrDescription(String natIpCidrDescription) {
                this.natIpCidrDescription = natIpCidrDescription;
                return this;
            }

            /**
             * The ID of the CIDR block of the NAT gateway.
             */
            public Builder natIpCidrId(String natIpCidrId) {
                this.natIpCidrId = natIpCidrId;
                return this;
            }

            /**
             * The name of the CIDR block of the NAT gateway.
             */
            public Builder natIpCidrName(String natIpCidrName) {
                this.natIpCidrName = natIpCidrName;
                return this;
            }

            /**
             * The status of the CIDR block of the NAT gateway. If **Available** is returned, it indicates that the CIDR block is available.
             */
            public Builder natIpCidrStatus(String natIpCidrStatus) {
                this.natIpCidrStatus = natIpCidrStatus;
                return this;
            }

            public NatIpCidrs build() {
                return new NatIpCidrs(this);
            } 

        } 

    }
}
