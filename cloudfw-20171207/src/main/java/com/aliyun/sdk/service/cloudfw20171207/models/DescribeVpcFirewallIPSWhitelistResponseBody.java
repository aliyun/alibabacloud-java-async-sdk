// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcFirewallIPSWhitelistResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpcFirewallIPSWhitelistResponseBody</p>
 */
public class DescribeVpcFirewallIPSWhitelistResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Whitelists")
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The details of the IPS whitelist of the VPC firewall.
         */
        public Builder whitelists(java.util.List < Whitelists> whitelists) {
            this.whitelists = whitelists;
            return this;
        }

        public DescribeVpcFirewallIPSWhitelistResponseBody build() {
            return new DescribeVpcFirewallIPSWhitelistResponseBody(this);
        } 

    } 

    public static class Whitelists extends TeaModel {
        @NameInMap("ListType")
        private Long listType;

        @NameInMap("ListValue")
        private String listValue;

        @NameInMap("VpcFirewallId")
        private String vpcFirewallId;

        @NameInMap("WhiteListValue")
        private java.util.List < String > whiteListValue;

        @NameInMap("WhiteType")
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
             * The type of the list. Valid values:
             * <p>
             * 
             * *   **1**: user-defined
             * *   **2**: address book
             */
            public Builder listType(Long listType) {
                this.listType = listType;
                return this;
            }

            /**
             * The entries in the list.
             */
            public Builder listValue(String listValue) {
                this.listValue = listValue;
                return this;
            }

            /**
             * The instance ID of the VPC firewall.
             */
            public Builder vpcFirewallId(String vpcFirewallId) {
                this.vpcFirewallId = vpcFirewallId;
                return this;
            }

            /**
             * An array of entries in the list.
             */
            public Builder whiteListValue(java.util.List < String > whiteListValue) {
                this.whiteListValue = whiteListValue;
                return this;
            }

            /**
             * The type of the whitelist. Valid values:
             * <p>
             * 
             * *   **1**: destination
             * *   **2**: source
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
