// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link CreateNetworkRequest} extends {@link RequestModel}
 *
 * <p>CreateNetworkRequest</p>
 */
public class CreateNetworkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CidrBlock")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cidrBlock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 256, minLength = 2)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableIpv6")
    private Boolean enableIpv6;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ensRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6Isp")
    private String ipv6Isp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkName")
    @com.aliyun.core.annotation.Validation(maxLength = 128, minLength = 2)
    private String networkName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private CreateNetworkRequest(Builder builder) {
        super(builder);
        this.cidrBlock = builder.cidrBlock;
        this.description = builder.description;
        this.enableIpv6 = builder.enableIpv6;
        this.ensRegionId = builder.ensRegionId;
        this.ipv6Isp = builder.ipv6Isp;
        this.networkName = builder.networkName;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNetworkRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cidrBlock
     */
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enableIpv6
     */
    public Boolean getEnableIpv6() {
        return this.enableIpv6;
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    /**
     * @return ipv6Isp
     */
    public String getIpv6Isp() {
        return this.ipv6Isp;
    }

    /**
     * @return networkName
     */
    public String getNetworkName() {
        return this.networkName;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateNetworkRequest, Builder> {
        private String cidrBlock; 
        private String description; 
        private Boolean enableIpv6; 
        private String ensRegionId; 
        private String ipv6Isp; 
        private String networkName; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateNetworkRequest request) {
            super(request);
            this.cidrBlock = request.cidrBlock;
            this.description = request.description;
            this.enableIpv6 = request.enableIpv6;
            this.ensRegionId = request.ensRegionId;
            this.ipv6Isp = request.ipv6Isp;
            this.networkName = request.networkName;
            this.tag = request.tag;
        } 

        /**
         * <p>The CIDR block of the network. You can use one of the following CIDR blocks or their subsets:</p>
         * <ul>
         * <li><p>10.0.0.0/8 (default).</p>
         * </li>
         * <li><p>172.16.0.0/12.</p>
         * </li>
         * <li><p>192.168.0.0/16.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/24</p>
         */
        public Builder cidrBlock(String cidrBlock) {
            this.putQueryParameter("CidrBlock", cidrBlock);
            this.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * <p>A description of the network.</p>
         * <p>Must be 2 to 256 characters long, start with a letter or a Chinese character, and cannot start with http\:// or https\://.</p>
         * 
         * <strong>example:</strong>
         * <p>this is my first network</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EnableIpv6.
         */
        public Builder enableIpv6(Boolean enableIpv6) {
            this.putQueryParameter("EnableIpv6", enableIpv6);
            this.enableIpv6 = enableIpv6;
            return this;
        }

        /**
         * <p>The node ID of ENS.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-telecom</p>
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * Ipv6Isp.
         */
        public Builder ipv6Isp(String ipv6Isp) {
            this.putQueryParameter("Ipv6Isp", ipv6Isp);
            this.ipv6Isp = ipv6Isp;
            return this;
        }

        /**
         * <p>The network name. Follow these naming rules:</p>
         * <ul>
         * <li><p>Must be 2 to 128 characters long, using English or Chinese characters.</p>
         * </li>
         * <li><p>Must start with a letter or a Chinese character. Cannot start with http\:// or https\://.</p>
         * </li>
         * <li><p>Can contain digits, colons (:), underscores (_), or hyphens (-).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder networkName(String networkName) {
            this.putQueryParameter("NetworkName", networkName);
            this.networkName = networkName;
            return this;
        }

        /**
         * <p>Resource tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateNetworkRequest build() {
            return new CreateNetworkRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateNetworkRequest} extends {@link TeaModel}
     *
     * <p>CreateNetworkRequest</p>
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key for the instance. N ranges from <strong>1</strong> to <strong>20</strong>.</p>
             * <ul>
             * <li><p>Cannot start with <code>aliyun</code>, <code>acs:</code>, <code>http://</code>, or <code>https://</code>.</p>
             * </li>
             * <li><p>Supports up to 64 characters.</p>
             * </li>
             * <li><p>Cannot be an empty string.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>key1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value for the resource. N ranges from 1 to 20. This value can be an empty string once provided. It supports up to 128 characters, cannot start with acs:, and cannot contain http\:// or https\://.</p>
             * 
             * <strong>example:</strong>
             * <p>tagValue</p>
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
}
