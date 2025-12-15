// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
 * {@link CreateTairKVCacheVNodeRequest} extends {@link RequestModel}
 *
 * <p>CreateTairKVCacheVNodeRequest</p>
 */
public class CreateTairKVCacheVNodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenewPeriod")
    private String autoRenewPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoUseCoupon")
    private Boolean autoUseCoupon;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessInfo")
    private String businessInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComputeUnitNum")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 1, minimum = 1)
    private Integer computeUnitNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CouponNo")
    private String couponNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ElasticTimeRange")
    private String elasticTimeRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceClass")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    @com.aliyun.core.annotation.Validation(maximum = 4096, minimum = 1)
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VNodeType")
    private String vNodeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VkName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vkName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneId;

    private CreateTairKVCacheVNodeRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.autoRenewPeriod = builder.autoRenewPeriod;
        this.autoUseCoupon = builder.autoUseCoupon;
        this.businessInfo = builder.businessInfo;
        this.chargeType = builder.chargeType;
        this.clientToken = builder.clientToken;
        this.computeUnitNum = builder.computeUnitNum;
        this.couponNo = builder.couponNo;
        this.dryRun = builder.dryRun;
        this.elasticTimeRange = builder.elasticTimeRange;
        this.instanceClass = builder.instanceClass;
        this.instanceName = builder.instanceName;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.period = builder.period;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityToken = builder.securityToken;
        this.tag = builder.tag;
        this.vNodeType = builder.vNodeType;
        this.vSwitchId = builder.vSwitchId;
        this.vkName = builder.vkName;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTairKVCacheVNodeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return autoRenewPeriod
     */
    public String getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    /**
     * @return autoUseCoupon
     */
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    /**
     * @return businessInfo
     */
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return computeUnitNum
     */
    public Integer getComputeUnitNum() {
        return this.computeUnitNum;
    }

    /**
     * @return couponNo
     */
    public String getCouponNo() {
        return this.couponNo;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return elasticTimeRange
     */
    public String getElasticTimeRange() {
        return this.elasticTimeRange;
    }

    /**
     * @return instanceClass
     */
    public String getInstanceClass() {
        return this.instanceClass;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
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
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
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
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return vNodeType
     */
    public String getVNodeType() {
        return this.vNodeType;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vkName
     */
    public String getVkName() {
        return this.vkName;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateTairKVCacheVNodeRequest, Builder> {
        private Boolean autoPay; 
        private Boolean autoRenew; 
        private String autoRenewPeriod; 
        private Boolean autoUseCoupon; 
        private String businessInfo; 
        private String chargeType; 
        private String clientToken; 
        private Integer computeUnitNum; 
        private String couponNo; 
        private Boolean dryRun; 
        private String elasticTimeRange; 
        private String instanceClass; 
        private String instanceName; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer period; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityToken; 
        private java.util.List<Tag> tag; 
        private String vNodeType; 
        private String vSwitchId; 
        private String vkName; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateTairKVCacheVNodeRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.autoRenewPeriod = request.autoRenewPeriod;
            this.autoUseCoupon = request.autoUseCoupon;
            this.businessInfo = request.businessInfo;
            this.chargeType = request.chargeType;
            this.clientToken = request.clientToken;
            this.computeUnitNum = request.computeUnitNum;
            this.couponNo = request.couponNo;
            this.dryRun = request.dryRun;
            this.elasticTimeRange = request.elasticTimeRange;
            this.instanceClass = request.instanceClass;
            this.instanceName = request.instanceName;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.period = request.period;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityToken = request.securityToken;
            this.tag = request.tag;
            this.vNodeType = request.vNodeType;
            this.vSwitchId = request.vSwitchId;
            this.vkName = request.vkName;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>Specifies whether to enable automatic payment. Set the value to <strong>true</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto-renewal for the instance. Default value: false. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enabled</li>
         * <li><strong>false</strong>: disables auto-renewal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The subscription duration that is supported by auto-renewal. Unit: month. Valid values: <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>6</strong>, and <strong>12</strong>.</p>
         * <blockquote>
         * <p> This parameter is required if the <strong>AutoRenew</strong> parameter is set to <strong>true</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder autoRenewPeriod(String autoRenewPeriod) {
            this.putQueryParameter("AutoRenewPeriod", autoRenewPeriod);
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }

        /**
         * <p>Specifies whether to use a coupon. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: uses a coupon.</li>
         * <li><strong>false</strong>: does not use a coupon.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoUseCoupon(Boolean autoUseCoupon) {
            this.putQueryParameter("AutoUseCoupon", autoUseCoupon);
            this.autoUseCoupon = autoUseCoupon;
            return this;
        }

        /**
         * <p>The extended information such as the promotional event ID and business information.</p>
         * 
         * <strong>example:</strong>
         * <p>000000000</p>
         */
        public Builder businessInfo(String businessInfo) {
            this.putQueryParameter("BusinessInfo", businessInfo);
            this.businessInfo = businessInfo;
            return this;
        }

        /**
         * <p>The new billing method. Valid values:</p>
         * <ul>
         * <li><strong>PrePaid</strong>: subscription. If you set this parameter to PrePaid, you must also specify the <strong>Period</strong> parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests and is case-sensitive. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>ETnLKlblzczshOTUbOCz****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The number of compute units. Valid values: 1.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder computeUnitNum(Integer computeUnitNum) {
            this.putQueryParameter("ComputeUnitNum", computeUnitNum);
            this.computeUnitNum = computeUnitNum;
            return this;
        }

        /**
         * <p>The coupon code.</p>
         * 
         * <strong>example:</strong>
         * <p>youhuiquan_promotion_option_id_for_blank</p>
         */
        public Builder couponNo(String couponNo) {
            this.putQueryParameter("CouponNo", couponNo);
            this.couponNo = couponNo;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs a dry run and does not create the instance. The system prechecks the request parameters, request format, service limits, and available resources. If the request fails to pass the precheck, an error message is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong>: performs a dry run and performs the actual request. If the request passes the dry run, the instance is created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * ElasticTimeRange.
         */
        public Builder elasticTimeRange(String elasticTimeRange) {
            this.putQueryParameter("ElasticTimeRange", elasticTimeRange);
            this.elasticTimeRange = elasticTimeRange;
            return this;
        }

        /**
         * <p>Instance specification</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kvcache.cu.g4b.2</p>
         */
        public Builder instanceClass(String instanceClass) {
            this.putQueryParameter("InstanceClass", instanceClass);
            this.instanceClass = instanceClass;
            return this;
        }

        /**
         * <p>The name of the instance. The name must be 2 to 80 characters in length. The name must start with a letter and cannot contain spaces or the following special characters: <code>@ / : = &quot; &lt; &gt; { [ ] }</code></p>
         * 
         * <strong>example:</strong>
         * <p>vnodetest</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
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
         * <p>The subscription duration. Valid values: <strong>1</strong> to <strong>9</strong>, <strong>12</strong>, <strong>24</strong>, and <strong>36</strong>. Unit: months.</p>
         * <blockquote>
         * <p> This parameter is required only if the <strong>ChargeType</strong> parameter is set to <strong>PrePaid</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The ID of the region where the instance resides.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group that you want to manage.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>You can query resource group IDs in the console or by calling the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation. For more information, see <a href="https://help.aliyun.com/document_detail/151181.html">View the basic information about a resource group</a>.</p>
         * </li>
         * <li><p>Before you modify the resource group to which an instance belongs, you can call the <a href="https://help.aliyun.com/document_detail/158866.html">ListResources</a> operation to view the current resource group of the instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmyiu4ekp****</p>
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
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * <p>Details of the tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * VNodeType.
         */
        public Builder vNodeType(String vNodeType) {
            this.putQueryParameter("VNodeType", vNodeType);
            this.vNodeType = vNodeType;
            return this;
        }

        /**
         * <p>The ID of the vSwitch to which the instance belongs. The vSwitch must belong to the VPC of the VCluser. You can call the <a href="https://help.aliyun.com/document_detail/35739.html">DescribeVpcs</a> operation to query the VPC ID.</p>
         * <blockquote>
         * <p> The vSwitch and the instance must be deployed in the same zone.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1e7clcw529l773d****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The ID of the VCluster that contains the VNode.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tk-2ze4bba3c8fe****</p>
         */
        public Builder vkName(String vkName) {
            this.putQueryParameter("VkName", vkName);
            this.vkName = vkName;
            return this;
        }

        /**
         * <p>The zone ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-f</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateTairKVCacheVNodeRequest build() {
            return new CreateTairKVCacheVNodeRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateTairKVCacheVNodeRequest} extends {@link TeaModel}
     *
     * <p>CreateTairKVCacheVNodeRequest</p>
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
             * <p>The tag key.</p>
             * <blockquote>
             * <p> A maximum of five key-value pairs can be specified at a time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>value1_test</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N of the instance.</p>
             * <blockquote>
             * <p> <strong>N</strong> specifies the value of the nth tag. For example, <strong>Tag.1.Value</strong> specifies the value of the first tag, and <strong>Tag.2.Value</strong> specifies the value of the second tag.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>key1_test</p>
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
