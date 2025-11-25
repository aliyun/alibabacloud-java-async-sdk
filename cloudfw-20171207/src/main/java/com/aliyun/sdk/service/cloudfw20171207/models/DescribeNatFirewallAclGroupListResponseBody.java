// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeNatFirewallAclGroupListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNatFirewallAclGroupListResponseBody</p>
 */
public class DescribeNatFirewallAclGroupListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NatFirewalls")
    private java.util.List<NatFirewalls> natFirewalls;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeNatFirewallAclGroupListResponseBody(Builder builder) {
        this.natFirewalls = builder.natFirewalls;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNatFirewallAclGroupListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return natFirewalls
     */
    public java.util.List<NatFirewalls> getNatFirewalls() {
        return this.natFirewalls;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<NatFirewalls> natFirewalls; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeNatFirewallAclGroupListResponseBody model) {
            this.natFirewalls = model.natFirewalls;
            this.requestId = model.requestId;
        } 

        /**
         * NatFirewalls.
         */
        public Builder natFirewalls(java.util.List<NatFirewalls> natFirewalls) {
            this.natFirewalls = natFirewalls;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeNatFirewallAclGroupListResponseBody build() {
            return new DescribeNatFirewallAclGroupListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNatFirewallAclGroupListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNatFirewallAclGroupListResponseBody</p>
     */
    public static class NatFirewalls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclRuleCount")
        private Integer aclRuleCount;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("NatGatewayId")
        private String natGatewayId;

        @com.aliyun.core.annotation.NameInMap("NatGatewayName")
        private String natGatewayName;

        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        private NatFirewalls(Builder builder) {
            this.aclRuleCount = builder.aclRuleCount;
            this.isDefault = builder.isDefault;
            this.natGatewayId = builder.natGatewayId;
            this.natGatewayName = builder.natGatewayName;
            this.regionNo = builder.regionNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NatFirewalls create() {
            return builder().build();
        }

        /**
         * @return aclRuleCount
         */
        public Integer getAclRuleCount() {
            return this.aclRuleCount;
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
         * @return natGatewayName
         */
        public String getNatGatewayName() {
            return this.natGatewayName;
        }

        /**
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
        }

        public static final class Builder {
            private Integer aclRuleCount; 
            private Boolean isDefault; 
            private String natGatewayId; 
            private String natGatewayName; 
            private String regionNo; 

            private Builder() {
            } 

            private Builder(NatFirewalls model) {
                this.aclRuleCount = model.aclRuleCount;
                this.isDefault = model.isDefault;
                this.natGatewayId = model.natGatewayId;
                this.natGatewayName = model.natGatewayName;
                this.regionNo = model.regionNo;
            } 

            /**
             * AclRuleCount.
             */
            public Builder aclRuleCount(Integer aclRuleCount) {
                this.aclRuleCount = aclRuleCount;
                return this;
            }

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
             * NatGatewayName.
             */
            public Builder natGatewayName(String natGatewayName) {
                this.natGatewayName = natGatewayName;
                return this;
            }

            /**
             * RegionNo.
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            public NatFirewalls build() {
                return new NatFirewalls(this);
            } 

        } 

    }
}
