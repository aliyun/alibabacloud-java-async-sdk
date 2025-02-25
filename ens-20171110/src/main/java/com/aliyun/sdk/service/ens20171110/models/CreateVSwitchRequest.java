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
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ensRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkId")
    private String networkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchName")
    private String vSwitchName;

    private CreateVSwitchRequest(Builder builder) {
        super(builder);
        this.cidrBlock = builder.cidrBlock;
        this.description = builder.description;
        this.ensRegionId = builder.ensRegionId;
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
            this.networkId = request.networkId;
            this.tag = request.tag;
            this.vSwitchName = request.vSwitchName;
        } 

        /**
         * <p>The CIDR block of the vSwitch. Take note of the following limits:</p>
         * <ul>
         * <li>The subnet mask must be 16 to 29 bits in length.</li>
         * <li>The CIDR block of the vSwitch must fall within the CIDR block of the VPC to which the vSwitch belongs.</li>
         * <li>The CIDR block of the vSwitch cannot be the same as the destination CIDR block in a route entry of the VPC. However, it can be a subset of the destination CIDR block.</li>
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
         * <p>The description of the vSwitch.</p>
         * <p>The description must be 2 to 256 characters in length. It must start with a letter but cannot start with http:// or https://.</p>
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
         * <p>The ID of the edge node.</p>
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
         * <p>The ID of the network to which the vSwitch that you want to create belongs.</p>
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
         * Tag.
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The name of the vSwitch. The name must meet the following requirements:</p>
         * <ul>
         * <li>The name must be 2 to 128 characters in length.</li>
         * <li>The name must start with a letter and cannot start with http:// or https://. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).</li>
         * </ul>
         * <p>Default value: null.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
