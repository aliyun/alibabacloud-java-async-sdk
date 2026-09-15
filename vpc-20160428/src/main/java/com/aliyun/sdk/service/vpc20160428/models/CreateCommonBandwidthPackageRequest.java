// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link CreateCommonBandwidthPackageRequest} extends {@link RequestModel}
 *
 * <p>CreateCommonBandwidthPackageRequest</p>
 */
public class CreateCommonBandwidthPackageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer bandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ISP")
    private String ISP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetChargeType")
    private String internetChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ratio")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer ratio;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityProtectionTypes")
    private java.util.List<String> securityProtectionTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Zone")
    private String zone;

    private CreateCommonBandwidthPackageRequest(Builder builder) {
        super(builder);
        this.bandwidth = builder.bandwidth;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.ISP = builder.ISP;
        this.internetChargeType = builder.internetChargeType;
        this.name = builder.name;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.ratio = builder.ratio;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityProtectionTypes = builder.securityProtectionTypes;
        this.tag = builder.tag;
        this.zone = builder.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCommonBandwidthPackageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return ISP
     */
    public String getISP() {
        return this.ISP;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return ratio
     */
    public Integer getRatio() {
        return this.ratio;
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
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return securityProtectionTypes
     */
    public java.util.List<String> getSecurityProtectionTypes() {
        return this.securityProtectionTypes;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return zone
     */
    public String getZone() {
        return this.zone;
    }

    public static final class Builder extends Request.Builder<CreateCommonBandwidthPackageRequest, Builder> {
        private Integer bandwidth; 
        private String clientToken; 
        private String description; 
        private String ISP; 
        private String internetChargeType; 
        private String name; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer ratio; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List<String> securityProtectionTypes; 
        private java.util.List<Tag> tag; 
        private String zone; 

        private Builder() {
            super();
        } 

        private Builder(CreateCommonBandwidthPackageRequest request) {
            super(request);
            this.bandwidth = request.bandwidth;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.ISP = request.ISP;
            this.internetChargeType = request.internetChargeType;
            this.name = request.name;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.ratio = request.ratio;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityProtectionTypes = request.securityProtectionTypes;
            this.tag = request.tag;
            this.zone = request.zone;
        } 

        /**
         * <p>The maximum bandwidth of the Internet Shared Bandwidth instance. Unit: Mbit/s. </p>
         * <p>&lt;props=&quot;intl&quot;&gt;<ph>Default value range: <strong>1</strong> to <strong>1000</strong>. Default value: <strong>1</strong>.</ph></p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li>If <strong>InternetChargeType</strong> is set to <strong>PayByBandwidth</strong>, which indicates the billing method is pay-by-bandwidth, the default value range of <strong>Bandwidth</strong> is <strong>2</strong> to <strong>20000</strong>.</li>
         * <li>If <strong>InternetChargeType</strong> is set to <strong>PayBy95</strong>, which indicates the billing method is enhanced 95th percentile, the default value range of <strong>Bandwidth</strong> is <strong>200</strong> to <strong>20000</strong>.</li>
         * <li>If <strong>InternetChargeType</strong> is set to <strong>PayByDominantTraffic</strong>, which indicates the billing method is pay-by-dominant-traffic, the default value range of <strong>Bandwidth</strong> is <strong>1</strong> to <strong>2000</strong>.</li>
         * </ul>
         * <p> Default value: <strong>1000</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4-130e-11e9-8e44-001****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the Internet Shared Bandwidth instance.</p>
         * <p>The description must be 0 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The line type. Valid values:</p>
         * <ul>
         * <li><strong>BGP</strong> (default): BGP (multi-ISP) lines. All regions support BGP (multi-ISP) lines.</li>
         * <li><strong>BGP_PRO</strong>: BGP (Multi-ISP) Pro lines. Currently, only Hong Kong (China), Singapore, Japan (Tokyo), Philippines (Manila), Malaysia (Kuala Lumpur), Indonesia (Jakarta), and Thailand (Bangkok) regions support BGP (Multi-ISP) Pro Internet Shared Bandwidth instances.</li>
         * </ul>
         * <p>If you are a single-ISP bandwidth whitelist user, you can also select the following types:</p>
         * <ul>
         * <li><strong>ChinaTelecom</strong>: China Telecom</li>
         * <li><strong>ChinaUnicom</strong>: China Unicom</li>
         * <li><strong>ChinaMobile</strong>: China Mobile</li>
         * <li><strong>ChinaTelecom_L2</strong>: China Telecom L2</li>
         * <li><strong>ChinaUnicom_L2</strong>: China Unicom L2</li>
         * <li><strong>ChinaMobile_L2</strong>: China Mobile L2</li>
         * </ul>
         * <p>If you are a China (Hangzhou) Finance Cloud user, this field is required. Set the value to <strong>BGP_FinanceCloud</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>BGP</p>
         */
        public Builder ISP(String ISP) {
            this.putQueryParameter("ISP", ISP);
            this.ISP = ISP;
            return this;
        }

        /**
         * <p>The billing method of the Internet Shared Bandwidth instance. Valid values:
         * &lt;props=&quot;intl&quot;&gt;<strong>PayByTraffic</strong> (pay-by-data-transfer).</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li><strong>PayByBandwidth</strong> (default): pay-by-bandwidth.</li>
         * <li><strong>PayBy95</strong>: enhanced 95th percentile.</li>
         * <li><strong>PayByDominantTraffic</strong>: pay-by-dominant-traffic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>For China site: PayByBandwidth, for International site: PayByTraffic</p>
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * <p>The name of the Internet Shared Bandwidth instance.</p>
         * <p>The name must be 0 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test123</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The minimum bandwidth commitment percentage of the Internet Shared Bandwidth instance. Set the value to <strong>20</strong>.</p>
         * <p> &lt;props=&quot;china&quot;&gt;<ph>This parameter is required when <strong>InternetChargeType</strong> is set to <strong>PayBy95</strong>.</ph></p>
         * <blockquote>
         * <p>Only the China site supports this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder ratio(Integer ratio) {
            this.putQueryParameter("Ratio", ratio);
            this.ratio = ratio;
            return this;
        }

        /**
         * <p>The region ID of the Internet Shared Bandwidth instance.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazdjdhd****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The security protection level.</p>
         * <ul>
         * <li><p>If you do not set this parameter, Anti-DDoS Origin Basic is used by default.</p>
         * </li>
         * <li><p>If you set this parameter to <strong>AntiDDoS_Enhanced</strong>, Anti-DDoS Origin Enhanced is used.</p>
         * </li>
         * </ul>
         * <p>&lt;props=&quot;china&quot;&gt;<ph>This parameter can be configured when <strong>InternetChargeType</strong> is set to <strong>PayBy95</strong>.</ph></p>
         * <p>You can specify up to 10 security protection levels.</p>
         * <blockquote>
         * <p><strong>[Deprecated]</strong> This parameter is deprecated.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>AntiDDoS_Enhanced</p>
         */
        public Builder securityProtectionTypes(java.util.List<String> securityProtectionTypes) {
            this.putQueryParameter("SecurityProtectionTypes", securityProtectionTypes);
            this.securityProtectionTypes = securityProtectionTypes;
            return this;
        }

        /**
         * <p>The list of tags for the Internet Shared Bandwidth instance.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The zone of the Internet Shared Bandwidth instance.
         * This parameter is required when you create an Internet Shared Bandwidth instance for a cloud box.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-southeast-1-lzdvn-cb</p>
         */
        public Builder zone(String zone) {
            this.putQueryParameter("Zone", zone);
            this.zone = zone;
            return this;
        }

        @Override
        public CreateCommonBandwidthPackageRequest build() {
            return new CreateCommonBandwidthPackageRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateCommonBandwidthPackageRequest} extends {@link TeaModel}
     *
     * <p>CreateCommonBandwidthPackageRequest</p>
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
             * <p>The tag key of the resource. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
             * <p>A tag key can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the resource. You can specify up to 20 tag values. The tag value can be an empty string.</p>
             * <p>The tag value can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceJoshua</p>
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
