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
 * {@link CreateVpdRequest} extends {@link RequestModel}
 *
 * <p>CreateVpdRequest</p>
 */
public class CreateVpdRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Cidr")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cidr;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Subnets")
    private java.util.List<Subnets> subnets;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpdName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpdName;

    private CreateVpdRequest(Builder builder) {
        super(builder);
        this.cidr = builder.cidr;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.subnets = builder.subnets;
        this.tag = builder.tag;
        this.vpdName = builder.vpdName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVpdRequest create() {
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return subnets
     */
    public java.util.List<Subnets> getSubnets() {
        return this.subnets;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return vpdName
     */
    public String getVpdName() {
        return this.vpdName;
    }

    public static final class Builder extends Request.Builder<CreateVpdRequest, Builder> {
        private String cidr; 
        private String regionId; 
        private String resourceGroupId; 
        private java.util.List<Subnets> subnets; 
        private java.util.List<Tag> tag; 
        private String vpdName; 

        private Builder() {
            super();
        } 

        private Builder(CreateVpdRequest request) {
            super(request);
            this.cidr = request.cidr;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.subnets = request.subnets;
            this.tag = request.tag;
            this.vpdName = request.vpdName;
        } 

        /**
         * <p>The CIDR block of the VPD.</p>
         * <ul>
         * <li>We recommend that you use an RFC private endpoint as the Lingjun CIDR block, such as 10.0.0.0/8,172.16.0.0/12,192.168.0.0/16. In scenarios where the Doringjun CIDR block is connected to each other or where the Lingjun CIDR block is connected to a VPC, make sure that the addresses do not conflict with each other.</li>
         * <li>You can also use a custom CIDR block other than 100.64.0.0/10, 224.0.0.0/4, 127.0.0.0/8, or 169.254.0.0/16 and their subnets as the primary IPv4 CIDR block of the VPD.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/8</p>
         */
        public Builder cidr(String cidr) {
            this.putBodyParameter("Cidr", cidr);
            this.cidr = cidr;
            return this;
        }

        /**
         * <p>The region ID of the disk.</p>
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
         * <p>The resource group ID.</p>
         * <p>For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/94475.htm?spm=a2c4g.11186623.0.0.29e15d7akXhpuu">Resource groups</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2l4sq6l7unhi</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Lingjun subnet information list</p>
         */
        public Builder subnets(java.util.List<Subnets> subnets) {
            this.putBodyParameter("Subnets", subnets);
            this.subnets = subnets;
            return this;
        }

        /**
         * <p>A tag.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putBodyParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>Lingjun CIDR block instance name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-1</p>
         */
        public Builder vpdName(String vpdName) {
            this.putBodyParameter("VpdName", vpdName);
            this.vpdName = vpdName;
            return this;
        }

        @Override
        public CreateVpdRequest build() {
            return new CreateVpdRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateVpdRequest} extends {@link TeaModel}
     *
     * <p>CreateVpdRequest</p>
     */
    public static class Subnets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cidr")
        private String cidr;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SubnetName")
        private String subnetName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Subnets(Builder builder) {
            this.cidr = builder.cidr;
            this.regionId = builder.regionId;
            this.subnetName = builder.subnetName;
            this.type = builder.type;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Subnets create() {
            return builder().build();
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
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String cidr; 
            private String regionId; 
            private String subnetName; 
            private String type; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(Subnets model) {
                this.cidr = model.cidr;
                this.regionId = model.regionId;
                this.subnetName = model.subnetName;
                this.type = model.type;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The CIDR block of the Subnet.</p>
             * <ul>
             * <li>The network segment of the subnet must be a proper subset of the network segment of Lingjun to which it belongs, and the mask must be between 16 bits and 29 bits, which can provide 8 to 65536 addresses. For example, the CIDR block of the Lingjun CIDR block is 192.168.0.0/16, and the CIDR blocks of the subnets under the Lingjun CIDR block are 192.168.0.0/17 to 192.168.0.0/29.</li>
             * <li>The first and last three IP addresses of each subnet segment are reserved by the system. For example, the CIDR blocks of the subnet are 192.168.1.0/24,192.168.1.0, 192.168.1.253, 192.168.1.254, and 192.168.1.255.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>10.1.0.0/16</p>
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * <p>The region in which the instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-wulanchabu</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Lingjun subnet instance name</p>
             * 
             * <strong>example:</strong>
             * <p>subnet-1</p>
             */
            public Builder subnetName(String subnetName) {
                this.subnetName = subnetName;
                return this;
            }

            /**
             * <p>Lingjun Subnet Usage Type; optional; optional. Valid values:</p>
             * <ul>
             * <li><strong>Generic type is not specified</strong>.</li>
             * <li><strong>OOB</strong> :OOB type</li>
             * <li><strong>LB</strong>: LB type</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OOB</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The zone ID of the disk.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-wulanchabu-b</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Subnets build() {
                return new Subnets(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateVpdRequest} extends {@link TeaModel}
     *
     * <p>CreateVpdRequest</p>
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
             * <p>vpd-wulanchabu</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the VPN connection.</p>
             * <p>The tag value can be empty or a string of up to 128 characters. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
             * <p>Each tag key corresponds to a tag value. You can enter a maximum of 20 tag values at a time.</p>
             * 
             * <strong>example:</strong>
             * <p>wulanchabu-a</p>
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
