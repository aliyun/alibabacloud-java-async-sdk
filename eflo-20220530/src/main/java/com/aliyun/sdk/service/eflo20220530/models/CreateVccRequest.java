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
 * {@link CreateVccRequest} extends {@link RequestModel}
 *
 * <p>CreateVccRequest</p>
 */
public class CreateVccRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccessCouldService")
    private Boolean accessCouldService;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private Integer bandwidth;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BgpAsn")
    private Long bgpAsn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BgpCidr")
    private String bgpCidr;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CenId")
    private String cenId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CenOwnerId")
    private String cenOwnerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConnectionType")
    private String connectionType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VccId")
    private String vccId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VccName")
    private String vccName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpdId")
    private String vpdId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private CreateVccRequest(Builder builder) {
        super(builder);
        this.accessCouldService = builder.accessCouldService;
        this.bandwidth = builder.bandwidth;
        this.bgpAsn = builder.bgpAsn;
        this.bgpCidr = builder.bgpCidr;
        this.cenId = builder.cenId;
        this.cenOwnerId = builder.cenOwnerId;
        this.connectionType = builder.connectionType;
        this.description = builder.description;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.tag = builder.tag;
        this.vSwitchId = builder.vSwitchId;
        this.vccId = builder.vccId;
        this.vccName = builder.vccName;
        this.vpcId = builder.vpcId;
        this.vpdId = builder.vpdId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVccRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessCouldService
     */
    public Boolean getAccessCouldService() {
        return this.accessCouldService;
    }

    /**
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return bgpAsn
     */
    public Long getBgpAsn() {
        return this.bgpAsn;
    }

    /**
     * @return bgpCidr
     */
    public String getBgpCidr() {
        return this.bgpCidr;
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
    }

    /**
     * @return cenOwnerId
     */
    public String getCenOwnerId() {
        return this.cenOwnerId;
    }

    /**
     * @return connectionType
     */
    public String getConnectionType() {
        return this.connectionType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vccId
     */
    public String getVccId() {
        return this.vccId;
    }

    /**
     * @return vccName
     */
    public String getVccName() {
        return this.vccName;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
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

    public static final class Builder extends Request.Builder<CreateVccRequest, Builder> {
        private Boolean accessCouldService; 
        private Integer bandwidth; 
        private Long bgpAsn; 
        private String bgpCidr; 
        private String cenId; 
        private String cenOwnerId; 
        private String connectionType; 
        private String description; 
        private String regionId; 
        private String resourceGroupId; 
        private java.util.List<Tag> tag; 
        private String vSwitchId; 
        private String vccId; 
        private String vccName; 
        private String vpcId; 
        private String vpdId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateVccRequest request) {
            super(request);
            this.accessCouldService = request.accessCouldService;
            this.bandwidth = request.bandwidth;
            this.bgpAsn = request.bgpAsn;
            this.bgpCidr = request.bgpCidr;
            this.cenId = request.cenId;
            this.cenOwnerId = request.cenOwnerId;
            this.connectionType = request.connectionType;
            this.description = request.description;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.tag = request.tag;
            this.vSwitchId = request.vSwitchId;
            this.vccId = request.vccId;
            this.vccName = request.vccName;
            this.vpcId = request.vpcId;
            this.vpdId = request.vpdId;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>Enabled access to cloud services. Optional values:</p>
         * <ul>
         * <li><strong>true</strong>: Enable access to cloud services</li>
         * <li><strong>false</strong>: Do not enable access to cloud services</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder accessCouldService(Boolean accessCouldService) {
            this.putBodyParameter("AccessCouldService", accessCouldService);
            this.accessCouldService = accessCouldService;
            return this;
        }

        /**
         * <p>The bandwidth. Unit: Mbit /s. The minimum value is 1000, representing 1Gbps bandwidth; the maximum value is 400000, representing 400Gbps bandwidth.</p>
         * <blockquote>
         * <p> 1Gbps = 1000Mbps</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putBodyParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>bgp as number</p>
         * 
         * <strong>example:</strong>
         * <p>bgpAsn</p>
         */
        public Builder bgpAsn(Long bgpAsn) {
            this.putBodyParameter("BgpAsn", bgpAsn);
            this.bgpAsn = bgpAsn;
            return this;
        }

        /**
         * <p>Internet segment, on-premises input, off-premises default</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/24</p>
         */
        public Builder bgpCidr(String bgpCidr) {
            this.putBodyParameter("BgpCidr", bgpCidr);
            this.bgpCidr = bgpCidr;
            return this;
        }

        /**
         * <p>CEN Instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>cen-bkiw0x1347roekr7f2</p>
         */
        public Builder cenId(String cenId) {
            this.putBodyParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * <p>Account to which cen belongs</p>
         * 
         * <strong>example:</strong>
         * <p>1511928242963727</p>
         */
        public Builder cenOwnerId(String cenOwnerId) {
            this.putBodyParameter("CenOwnerId", cenOwnerId);
            this.cenOwnerId = cenOwnerId;
            return this;
        }

        /**
         * <p>The connection mode. Valid values:</p>
         * <ul>
         * <li><strong>VPC</strong></li>
         * <li><strong>CEN (CENTR)</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CENTR</p>
         */
        public Builder connectionType(String connectionType) {
            this.putBodyParameter("ConnectionType", connectionType);
            this.connectionType = connectionType;
            return this;
        }

        /**
         * <p>The description of the document.</p>
         * 
         * <strong>example:</strong>
         * <p>Description</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The region ID.</p>
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
         * <p>rg-aeky5f3qx6ceapq</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * <p>The ID of the vSwitch. <a href="https://help.aliyun.com/document_detail/100380.html">Virtual Private Cloud VSwitch</a>.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/35748.html">DescribeVSwitches</a> operation to query created vSwitches.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-t4nahb0pxckgktx1kot8q</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putBodyParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The ID of the Lingjun connection instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vcc-cn-zvp2w222001</p>
         */
        public Builder vccId(String vccId) {
            this.putBodyParameter("VccId", vccId);
            this.vccId = vccId;
            return this;
        }

        /**
         * <p>Lingjun Connection Name</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder vccName(String vccName) {
            this.putBodyParameter("VccName", vccName);
            this.vccName = vccName;
            return this;
        }

        /**
         * <p>Virtual Private Cloud IDs; <a href="https://help.aliyun.com/document_detail/34217.html">What is Virtual Private Cloud</a></p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/35739.html#demo-0">DescribeVpcs</a> operation to query the specified VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6aa4ddo97frj22tgp52</p>
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>Lingjun CIDR block instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-t2jseldp</p>
         */
        public Builder vpdId(String vpdId) {
            this.putBodyParameter("VpdId", vpdId);
            this.vpdId = vpdId;
            return this;
        }

        /**
         * <p>The zone ID of the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu-a</p>
         */
        public Builder zoneId(String zoneId) {
            this.putBodyParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateVccRequest build() {
            return new CreateVccRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateVccRequest} extends {@link TeaModel}
     *
     * <p>CreateVccRequest</p>
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
             * <p>The tag key of the VPN attachment.</p>
             * <p>You cannot specify an empty string as a tag key. It can be up to 64 characters in length and cannot start with aliyun or acs:. It cannot contain http:// or https://.</p>
             * <p>You can specify at most 20 tag keys in each call.</p>
             * 
             * <strong>example:</strong>
             * <p>tag-vcc</p>
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
             * <p>vcc-group-1</p>
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
