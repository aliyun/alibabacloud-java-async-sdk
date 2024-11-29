// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCustomerGatewayResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomerGatewayResponseBody</p>
 */
public class DescribeCustomerGatewayResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Asn")
    private Long asn;

    @com.aliyun.core.annotation.NameInMap("AuthKey")
    private String authKey;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("CustomerGatewayId")
    private String customerGatewayId;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("IpAddress")
    private String ipAddress;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private Tags tags;

    private DescribeCustomerGatewayResponseBody(Builder builder) {
        this.asn = builder.asn;
        this.authKey = builder.authKey;
        this.createTime = builder.createTime;
        this.customerGatewayId = builder.customerGatewayId;
        this.description = builder.description;
        this.ipAddress = builder.ipAddress;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomerGatewayResponseBody create() {
        return builder().build();
    }

    /**
     * @return asn
     */
    public Long getAsn() {
        return this.asn;
    }

    /**
     * @return authKey
     */
    public String getAuthKey() {
        return this.authKey;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return customerGatewayId
     */
    public String getCustomerGatewayId() {
        return this.customerGatewayId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return ipAddress
     */
    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tags
     */
    public Tags getTags() {
        return this.tags;
    }

    public static final class Builder {
        private Long asn; 
        private String authKey; 
        private Long createTime; 
        private String customerGatewayId; 
        private String description; 
        private String ipAddress; 
        private String name; 
        private String requestId; 
        private String resourceGroupId; 
        private Tags tags; 

        /**
         * <p>The autonomous system number (ASN) of the gateway device in the data center.</p>
         * 
         * <strong>example:</strong>
         * <p>65535</p>
         */
        public Builder asn(Long asn) {
            this.asn = asn;
            return this;
        }

        /**
         * <p>The authentication key of the Border Gateway Protocol (BGP) routing protocol for the gateway device in the data center.</p>
         * 
         * <strong>example:</strong>
         * <p>AuthKey****</p>
         */
        public Builder authKey(String authKey) {
            this.authKey = authKey;
            return this;
        }

        /**
         * <p>The timestamp generated when the customer gateway was created. Unit: milliseconds.</p>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1492747187000</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The ID of the customer gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>cgw-bp1pvpl9r9adju6l5****</p>
         */
        public Builder customerGatewayId(String customerGatewayId) {
            this.customerGatewayId = customerGatewayId;
            return this;
        }

        /**
         * <p>The description of the customer gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>desctest</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The public IP address of the gateway device in the data center.</p>
         * 
         * <strong>example:</strong>
         * <p>139.32.XX.XX</p>
         */
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        /**
         * <p>The name of the customer gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A0457BC9-6C0F-4437-AB9D-FB2EABC1D6A2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the customer gateway belongs.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to query resource groups.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzs372yg****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The list of tags added to the customer gateway.</p>
         */
        public Builder tags(Tags tags) {
            this.tags = tags;
            return this;
        }

        public DescribeCustomerGatewayResponseBody build() {
            return new DescribeCustomerGatewayResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCustomerGatewayResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomerGatewayResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The key of tag N.</p>
             * 
             * <strong>example:</strong>
             * <p>TagKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N.</p>
             * 
             * <strong>example:</strong>
             * <p>TagValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCustomerGatewayResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomerGatewayResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
