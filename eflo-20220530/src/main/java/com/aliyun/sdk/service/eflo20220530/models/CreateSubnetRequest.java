// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

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
 * {@link CreateSubnetRequest} extends {@link RequestModel}
 *
 * <p>CreateSubnetRequest</p>
 */
public class CreateSubnetRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Cidr")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cidr;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubnetName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subnetName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpdId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpdId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneId;

    private CreateSubnetRequest(Builder builder) {
        super(builder);
        this.cidr = builder.cidr;
        this.regionId = builder.regionId;
        this.subnetName = builder.subnetName;
        this.tag = builder.tag;
        this.type = builder.type;
        this.vpdId = builder.vpdId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSubnetRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cidr
     */
    public String getCidr() {
        return this.cidr;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return subnetName
     */
    public String getSubnetName() {
        return this.subnetName;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return vpdId
     */
    public String getVpdId() {
        return this.vpdId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateSubnetRequest, Builder> {
        private String cidr; 
        private String regionId; 
        private String subnetName; 
        private java.util.List<Tag> tag; 
        private String type; 
        private String vpdId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateSubnetRequest request) {
            super(request);
            this.cidr = request.cidr;
            this.regionId = request.regionId;
            this.subnetName = request.subnetName;
            this.tag = request.tag;
            this.type = request.type;
            this.vpdId = request.vpdId;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The CIDR block of the Subnet.</p>
         * <ul>
         * <li>The network segment of the subnet must be a proper subset of the network segment of Lingjun to which it belongs, and the mask must be between 16 bits and 29 bits, which can provide 8 to 65536 addresses. For example, the CIDR block of the Lingjun CIDR block is 192.168.0.0/16, and the CIDR blocks of the subnets under the Lingjun CIDR block are 192.168.0.0/17 to 192.168.0.0/29.</li>
         * <li>The first and last three IP addresses of each subnet segment are reserved by the system. For example, the CIDR blocks of the subnet are 192.168.1.0/24,192.168.1.0, 192.168.1.253, 192.168.1.254, and 192.168.1.255.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/16</p>
         */
        public Builder cidr(String cidr) {
            this.putBodyParameter("Cidr", cidr);
            this.cidr = cidr;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Lingjun subnet instance name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>subnet-1</p>
         */
        public Builder subnetName(String subnetName) {
            this.putBodyParameter("SubnetName", subnetName);
            this.subnetName = subnetName;
            return this;
        }

        /**
         * <p>The tag information.</p>
         * <p>You can specify up to 20 tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putBodyParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>Lingjun Subnet Usage Type; optional; optional. Valid values:</p>
         * <ul>
         * <li><strong>If you do not set this field for a common type</strong></li>
         * <li><strong>OOB</strong> :OOB type</li>
         * <li><strong>LB</strong>: LB type</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OOB</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The ID of the Lingjun CIDR block.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-xcuhjyrj</p>
         */
        public Builder vpdId(String vpdId) {
            this.putBodyParameter("VpdId", vpdId);
            this.vpdId = vpdId;
            return this;
        }

        /**
         * <p>The zone ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu-b</p>
         */
        public Builder zoneId(String zoneId) {
            this.putBodyParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateSubnetRequest build() {
            return new CreateSubnetRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateSubnetRequest} extends {@link TeaModel}
     *
     * <p>CreateSubnetRequest</p>
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
             * <p>The tag key of the VPN attachment.</p>
             * <p>You cannot specify an empty string as a tag key. It can be up to 64 characters in length and cannot start with aliyun or acs:. It cannot contain http:// or https://.</p>
             * <p>You can specify at most 20 tag keys in each call.</p>
             * 
             * <strong>example:</strong>
             * <p>tag-subnet</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the VPN connection.</p>
             * <p>The tag value can be empty or a string of up to 128 characters. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
             * <p>Each key-value pair must be unique. You can specify values for at most 20 tag keys in each call.</p>
             * 
             * <strong>example:</strong>
             * <p>subnet-tag-1</p>
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
