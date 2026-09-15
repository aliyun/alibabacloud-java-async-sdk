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
 * {@link ListNatIpCidrsResponseBody} extends {@link TeaModel}
 *
 * <p>ListNatIpCidrsResponseBody</p>
 */
public class ListNatIpCidrsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NatIpCidrs")
    private java.util.List<NatIpCidrs> natIpCidrs;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return natIpCidrs
     */
    public java.util.List<NatIpCidrs> getNatIpCidrs() {
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
        private java.util.List<NatIpCidrs> natIpCidrs; 
        private String nextToken; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(ListNatIpCidrsResponseBody model) {
            this.natIpCidrs = model.natIpCidrs;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of NAT CIDR blocks.</p>
         */
        public Builder natIpCidrs(java.util.List<NatIpCidrs> natIpCidrs) {
            this.natIpCidrs = natIpCidrs;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no subsequent requests exist.</li>
         * <li>If <strong>NextToken</strong> is returned, the value indicates the token for the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7479A224-4A28-4895-9604-11F48BCE6A88</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of NAT CIDR block entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListNatIpCidrsResponseBody build() {
            return new ListNatIpCidrsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNatIpCidrsResponseBody} extends {@link TeaModel}
     *
     * <p>ListNatIpCidrsResponseBody</p>
     */
    public static class NatIpCidrs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("NatGatewayId")
        private String natGatewayId;

        @com.aliyun.core.annotation.NameInMap("NatIpCidr")
        private String natIpCidr;

        @com.aliyun.core.annotation.NameInMap("NatIpCidrDescription")
        private String natIpCidrDescription;

        @com.aliyun.core.annotation.NameInMap("NatIpCidrId")
        private String natIpCidrId;

        @com.aliyun.core.annotation.NameInMap("NatIpCidrName")
        private String natIpCidrName;

        @com.aliyun.core.annotation.NameInMap("NatIpCidrStatus")
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

            private Builder() {
            } 

            private Builder(NatIpCidrs model) {
                this.creationTime = model.creationTime;
                this.isDefault = model.isDefault;
                this.natGatewayId = model.natGatewayId;
                this.natIpCidr = model.natIpCidr;
                this.natIpCidrDescription = model.natIpCidrDescription;
                this.natIpCidrId = model.natIpCidrId;
                this.natIpCidrName = model.natIpCidrName;
                this.natIpCidrStatus = model.natIpCidrStatus;
            } 

            /**
             * <p>The time when the NAT CIDR block was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-28T20:50Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>Indicates whether the NAT CIDR block is the default NAT CIDR block. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The NAT CIDR block is the default NAT CIDR block.</li>
             * <li><strong>false</strong>: The NAT CIDR block is not the default NAT CIDR block.</li>
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
             * <p>The instance ID of the VPC NAT gateway to which the NAT CIDR block belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>ngw-gw8v16wgvtq26vh59****</p>
             */
            public Builder natGatewayId(String natGatewayId) {
                this.natGatewayId = natGatewayId;
                return this;
            }

            /**
             * <p>The NAT CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.0.0/24</p>
             */
            public Builder natIpCidr(String natIpCidr) {
                this.natIpCidr = natIpCidr;
                return this;
            }

            /**
             * <p>The description of the NAT CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder natIpCidrDescription(String natIpCidrDescription) {
                this.natIpCidrDescription = natIpCidrDescription;
                return this;
            }

            /**
             * <p>The instance ID of the NAT CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>vpcnatcidr-gw8ov42ei6xh1jys2****</p>
             */
            public Builder natIpCidrId(String natIpCidrId) {
                this.natIpCidrId = natIpCidrId;
                return this;
            }

            /**
             * <p>The name of the NAT CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>Name</p>
             */
            public Builder natIpCidrName(String natIpCidrName) {
                this.natIpCidrName = natIpCidrName;
                return this;
            }

            /**
             * <p>The status of the NAT CIDR block. The value is <strong>Available</strong>, which indicates that the NAT CIDR block is available.</p>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
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
