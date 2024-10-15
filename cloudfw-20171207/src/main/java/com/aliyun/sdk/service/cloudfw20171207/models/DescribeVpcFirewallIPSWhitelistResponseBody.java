// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeVpcFirewallIPSWhitelistResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpcFirewallIPSWhitelistResponseBody</p>
 */
public class DescribeVpcFirewallIPSWhitelistResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Whitelists")
    private java.util.List < Whitelists> whitelists;

    private DescribeVpcFirewallIPSWhitelistResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.whitelists = builder.whitelists;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcFirewallIPSWhitelistResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return whitelists
     */
    public java.util.List < Whitelists> getWhitelists() {
        return this.whitelists;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Whitelists> whitelists; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B5EE02F9-4F21-56CA-AA49-F9F8D69483C1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the IPS whitelist of the VPC firewall.</p>
         */
        public Builder whitelists(java.util.List < Whitelists> whitelists) {
            this.whitelists = whitelists;
            return this;
        }

        public DescribeVpcFirewallIPSWhitelistResponseBody build() {
            return new DescribeVpcFirewallIPSWhitelistResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVpcFirewallIPSWhitelistResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcFirewallIPSWhitelistResponseBody</p>
     */
    public static class Whitelists extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ListType")
        private Long listType;

        @com.aliyun.core.annotation.NameInMap("ListValue")
        private String listValue;

        @com.aliyun.core.annotation.NameInMap("VpcFirewallId")
        private String vpcFirewallId;

        @com.aliyun.core.annotation.NameInMap("WhiteListValue")
        private java.util.List < String > whiteListValue;

        @com.aliyun.core.annotation.NameInMap("WhiteType")
        private Long whiteType;

        private Whitelists(Builder builder) {
            this.listType = builder.listType;
            this.listValue = builder.listValue;
            this.vpcFirewallId = builder.vpcFirewallId;
            this.whiteListValue = builder.whiteListValue;
            this.whiteType = builder.whiteType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Whitelists create() {
            return builder().build();
        }

        /**
         * @return listType
         */
        public Long getListType() {
            return this.listType;
        }

        /**
         * @return listValue
         */
        public String getListValue() {
            return this.listValue;
        }

        /**
         * @return vpcFirewallId
         */
        public String getVpcFirewallId() {
            return this.vpcFirewallId;
        }

        /**
         * @return whiteListValue
         */
        public java.util.List < String > getWhiteListValue() {
            return this.whiteListValue;
        }

        /**
         * @return whiteType
         */
        public Long getWhiteType() {
            return this.whiteType;
        }

        public static final class Builder {
            private Long listType; 
            private String listValue; 
            private String vpcFirewallId; 
            private java.util.List < String > whiteListValue; 
            private Long whiteType; 

            /**
             * <p>The type of the list. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: user-defined</li>
             * <li><strong>2</strong>: address book</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder listType(Long listType) {
                this.listType = listType;
                return this;
            }

            /**
             * <p>The entries in the list.</p>
             * 
             * <strong>example:</strong>
             * <p>10.10.200.4/32,10.10.200.25/32</p>
             */
            public Builder listValue(String listValue) {
                this.listValue = listValue;
                return this;
            }

            /**
             * <p>The instance ID of the VPC firewall.</p>
             * 
             * <strong>example:</strong>
             * <p>vfw-57431e9abe424852a578</p>
             */
            public Builder vpcFirewallId(String vpcFirewallId) {
                this.vpcFirewallId = vpcFirewallId;
                return this;
            }

            /**
             * <p>An array of entries in the list.</p>
             */
            public Builder whiteListValue(java.util.List < String > whiteListValue) {
                this.whiteListValue = whiteListValue;
                return this;
            }

            /**
             * <p>The type of the whitelist. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: destination</li>
             * <li><strong>2</strong>: source</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder whiteType(Long whiteType) {
                this.whiteType = whiteType;
                return this;
            }

            public Whitelists build() {
                return new Whitelists(this);
            } 

        } 

    }
}
