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
 * {@link CreateVSwitchRequest} extends {@link RequestModel}
 *
 * <p>CreateVSwitchRequest</p>
 */
public class CreateVSwitchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CidrBlock")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cidrBlock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 256, minLength = 2)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ensRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6CidrBlock")
    private String ipv6CidrBlock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkId")
    private String networkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchName")
    @com.aliyun.core.annotation.Validation(maxLength = 128, minLength = 2)
    private String vSwitchName;

    private CreateVSwitchRequest(Builder builder) {
        super(builder);
        this.cidrBlock = builder.cidrBlock;
        this.description = builder.description;
        this.ensRegionId = builder.ensRegionId;
        this.ipv6CidrBlock = builder.ipv6CidrBlock;
        this.networkId = builder.networkId;
        this.tag = builder.tag;
        this.vSwitchName = builder.vSwitchName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVSwitchRequest create() {
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
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    /**
     * @return ipv6CidrBlock
     */
    public String getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }

    /**
     * @return networkId
     */
    public String getNetworkId() {
        return this.networkId;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return vSwitchName
     */
    public String getVSwitchName() {
        return this.vSwitchName;
    }

    public static final class Builder extends Request.Builder<CreateVSwitchRequest, Builder> {
        private String cidrBlock; 
        private String description; 
        private String ensRegionId; 
        private String ipv6CidrBlock; 
        private String networkId; 
        private java.util.List<Tag> tag; 
        private String vSwitchName; 

        private Builder() {
            super();
        } 

        private Builder(CreateVSwitchRequest request) {
            super(request);
            this.cidrBlock = request.cidrBlock;
            this.description = request.description;
            this.ensRegionId = request.ensRegionId;
            this.ipv6CidrBlock = request.ipv6CidrBlock;
            this.networkId = request.networkId;
            this.tag = request.tag;
            this.vSwitchName = request.vSwitchName;
        } 

        /**
         * <p>The CIDR block of the VSwitch. The following requirements apply:</p>
         * <ul>
         * <li><p>The prefix length must be an integer from 16 to 29.</p>
         * </li>
         * <li><p>The CIDR block of the VSwitch must be a subset of the CIDR block of the VPC to which the VSwitch belongs.</p>
         * </li>
         * <li><p>The CIDR block of the VSwitch cannot be the same as the destination CIDR block of an existing route in the VPC, but it can be a subset of the destination CIDR block.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.0.0/24</p>
         */
        public Builder cidrBlock(String cidrBlock) {
            this.putQueryParameter("CidrBlock", cidrBlock);
            this.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * <p>The description of the VSwitch.</p>
         * <p>The description must be 2 to 256 characters in length. It must start with a letter or a Chinese character, and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>This is my vswitch.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the ENS node.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-xian-unicom</p>
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * Ipv6CidrBlock.
         */
        public Builder ipv6CidrBlock(String ipv6CidrBlock) {
            this.putQueryParameter("Ipv6CidrBlock", ipv6CidrBlock);
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }

        /**
         * <p>The ID of the network to which the VSwitch belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>n-257gqcdfvx6n****</p>
         */
        public Builder networkId(String networkId) {
            this.putQueryParameter("NetworkId", networkId);
            this.networkId = networkId;
            return this;
        }

        /**
         * <p>The tags of the resource. You can specify up to 20 tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The name of the VSwitch. The following requirements apply:</p>
         * <ul>
         * <li><p>The name must be 2 to 128 characters in length.</p>
         * </li>
         * <li><p>The name must start with a letter or a Chinese character, and cannot start with <code>http://</code> or <code>https://</code>. The name can contain digits, colons (:), underscores (_), and hyphens (-).</p>
         * </li>
         * </ul>
         * <p>Default value: an empty string.</p>
         * 
         * <strong>example:</strong>
         * <p>Test vSwitch</p>
         */
        public Builder vSwitchName(String vSwitchName) {
            this.putQueryParameter("VSwitchName", vSwitchName);
            this.vSwitchName = vSwitchName;
            return this;
        }

        @Override
        public CreateVSwitchRequest build() {
            return new CreateVSwitchRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateVSwitchRequest} extends {@link TeaModel}
     *
     * <p>CreateVSwitchRequest</p>
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
             * <p>The key of the tag.</p>
             * <ul>
             * <li><p>The tag key cannot start with <code>aliyun</code>, <code>acs:</code>, <code>http://</code>, or <code>https://</code>.</p>
             * </li>
             * <li><p>The tag key can be up to 64 characters long.</p>
             * </li>
             * <li><p>The tag key cannot be an empty string.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>team</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag. It can be up to 128 characters long, can be an empty string, and cannot start with <code>acs:</code> or contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>Deep</p>
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
