// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link CreateAndroidInstanceGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateAndroidInstanceGroupRequest</p>
 */
public class CreateAndroidInstanceGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Amount")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer amount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BandwidthPackageId")
    private String bandwidthPackageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BandwidthPackageType")
    private String bandwidthPackageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableIpv6")
    private Boolean enableIpv6;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GpuAcceleration")
    private Boolean gpuAcceleration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceGroupName")
    private String instanceGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceGroupSpec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceGroupSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6Bandwidth")
    private Integer ipv6Bandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyPairId")
    private String keyPairId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkInfo")
    private NetworkInfo networkInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkType")
    private String networkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NumberOfInstances")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 1)
    private Integer numberOfInstances;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    private String officeSiteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
    private String policyGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromotionId")
    private String promotionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamMode")
    private Integer streamMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    private CreateAndroidInstanceGroupRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.bandwidthPackageId = builder.bandwidthPackageId;
        this.bandwidthPackageType = builder.bandwidthPackageType;
        this.bizRegionId = builder.bizRegionId;
        this.chargeType = builder.chargeType;
        this.clientToken = builder.clientToken;
        this.enableIpv6 = builder.enableIpv6;
        this.gpuAcceleration = builder.gpuAcceleration;
        this.imageId = builder.imageId;
        this.instanceGroupName = builder.instanceGroupName;
        this.instanceGroupSpec = builder.instanceGroupSpec;
        this.ipv6Bandwidth = builder.ipv6Bandwidth;
        this.keyPairId = builder.keyPairId;
        this.networkInfo = builder.networkInfo;
        this.networkType = builder.networkType;
        this.numberOfInstances = builder.numberOfInstances;
        this.officeSiteId = builder.officeSiteId;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.policyGroupId = builder.policyGroupId;
        this.promotionId = builder.promotionId;
        this.streamMode = builder.streamMode;
        this.tag = builder.tag;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAndroidInstanceGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return amount
     */
    public Integer getAmount() {
        return this.amount;
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
     * @return bandwidthPackageId
     */
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    /**
     * @return bandwidthPackageType
     */
    public String getBandwidthPackageType() {
        return this.bandwidthPackageType;
    }

    /**
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
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
     * @return enableIpv6
     */
    public Boolean getEnableIpv6() {
        return this.enableIpv6;
    }

    /**
     * @return gpuAcceleration
     */
    public Boolean getGpuAcceleration() {
        return this.gpuAcceleration;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return instanceGroupName
     */
    public String getInstanceGroupName() {
        return this.instanceGroupName;
    }

    /**
     * @return instanceGroupSpec
     */
    public String getInstanceGroupSpec() {
        return this.instanceGroupSpec;
    }

    /**
     * @return ipv6Bandwidth
     */
    public Integer getIpv6Bandwidth() {
        return this.ipv6Bandwidth;
    }

    /**
     * @return keyPairId
     */
    public String getKeyPairId() {
        return this.keyPairId;
    }

    /**
     * @return networkInfo
     */
    public NetworkInfo getNetworkInfo() {
        return this.networkInfo;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return numberOfInstances
     */
    public Integer getNumberOfInstances() {
        return this.numberOfInstances;
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return policyGroupId
     */
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    /**
     * @return promotionId
     */
    public String getPromotionId() {
        return this.promotionId;
    }

    /**
     * @return streamMode
     */
    public Integer getStreamMode() {
        return this.streamMode;
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

    public static final class Builder extends Request.Builder<CreateAndroidInstanceGroupRequest, Builder> {
        private Integer amount; 
        private Boolean autoPay; 
        private Boolean autoRenew; 
        private String bandwidthPackageId; 
        private String bandwidthPackageType; 
        private String bizRegionId; 
        private String chargeType; 
        private String clientToken; 
        private Boolean enableIpv6; 
        private Boolean gpuAcceleration; 
        private String imageId; 
        private String instanceGroupName; 
        private String instanceGroupSpec; 
        private Integer ipv6Bandwidth; 
        private String keyPairId; 
        private NetworkInfo networkInfo; 
        private String networkType; 
        private Integer numberOfInstances; 
        private String officeSiteId; 
        private Integer period; 
        private String periodUnit; 
        private String policyGroupId; 
        private String promotionId; 
        private Integer streamMode; 
        private java.util.List<Tag> tag; 
        private String vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAndroidInstanceGroupRequest request) {
            super(request);
            this.amount = request.amount;
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.bandwidthPackageId = request.bandwidthPackageId;
            this.bandwidthPackageType = request.bandwidthPackageType;
            this.bizRegionId = request.bizRegionId;
            this.chargeType = request.chargeType;
            this.clientToken = request.clientToken;
            this.enableIpv6 = request.enableIpv6;
            this.gpuAcceleration = request.gpuAcceleration;
            this.imageId = request.imageId;
            this.instanceGroupName = request.instanceGroupName;
            this.instanceGroupSpec = request.instanceGroupSpec;
            this.ipv6Bandwidth = request.ipv6Bandwidth;
            this.keyPairId = request.keyPairId;
            this.networkInfo = request.networkInfo;
            this.networkType = request.networkType;
            this.numberOfInstances = request.numberOfInstances;
            this.officeSiteId = request.officeSiteId;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.policyGroupId = request.policyGroupId;
            this.promotionId = request.promotionId;
            this.streamMode = request.streamMode;
            this.tag = request.tag;
            this.vSwitchId = request.vSwitchId;
        } 

        /**
         * <p>The number of instance groups. Default value: 1. Maximum value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder amount(Integer amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic payment. Default value: false.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: enables automatic payment. Make sure that your Alibaba Cloud account has sufficient balance.</li>
         * <li>false: disables automatic payment. You must manually complete the payment.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto-renewal. Default value: false.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: automatically renew resource upon expiration.</li>
         * <li>false: manually renew resources upon expiration.</li>
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
         * BandwidthPackageId.
         */
        public Builder bandwidthPackageId(String bandwidthPackageId) {
            this.putQueryParameter("BandwidthPackageId", bandwidthPackageId);
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }

        /**
         * BandwidthPackageType.
         */
        public Builder bandwidthPackageType(String bandwidthPackageType) {
            this.putQueryParameter("BandwidthPackageType", bandwidthPackageType);
            this.bandwidthPackageType = bandwidthPackageType;
            return this;
        }

        /**
         * <p>The ID of the region. You can call the DescribeRegions operation to query the regions where Cloud Phone is supported.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>cn-shenzhen: China (Shenzhen).</li>
         * <li>cn-beijing: China (Beijing).</li>
         * <li>cn-shanghai: China (Shanghai).</li>
         * <li>cn-hongkong: China (Hong Kong).</li>
         * <li>ap-southeast-1: Singapore.</li>
         * <li>cn-hangzhou: China (Hangzhou).</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putQueryParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * <p>The billing method.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>PostPaid: pay-as-you-go.</li>
         * <li>PrePaid: subscription.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. The value cannot exceed 100 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>asadbuvwiabdbvchjsbj</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder enableIpv6(Boolean enableIpv6) {
            this.putQueryParameter("EnableIpv6", enableIpv6);
            this.enableIpv6 = enableIpv6;
            return this;
        }

        /**
         * <p>Specifies whether to enable GPU acceleration.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: enables GPU acceleration.</li>
         * <li>false (default): disables GPU acceleration.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder gpuAcceleration(Boolean gpuAcceleration) {
            this.putQueryParameter("GpuAcceleration", gpuAcceleration);
            this.gpuAcceleration = gpuAcceleration;
            return this;
        }

        /**
         * <p>The ID of the image. You can call the <a href="https://help.aliyun.com/document_detail/2807324.html">DescribeImageList</a> operation to query images.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>imgc-06zyt9m93zwax****</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The name of the instance group.</p>
         * <blockquote>
         * <p> The name can be up to 30 characters in length. It can contain letters, digits, colons (:), underscores (_), periods (.), or hyphens (-). It must start with letters but cannot start with <code>http://</code> or <code>https://</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>defaultInstanceGroup</p>
         */
        public Builder instanceGroupName(String instanceGroupName) {
            this.putQueryParameter("InstanceGroupName", instanceGroupName);
            this.instanceGroupName = instanceGroupName;
            return this;
        }

        /**
         * <p>The specifications of the instance group. You can call the <a href="https://help.aliyun.com/document_detail/2807299.html">DescribeSpec</a> operation to query the available specifications.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>acp.perf.large: Performance (8 vCPUs, 16 GiB of memory, and 32 GiB of storage.</li>
         * <li>acp.basic.small: Lightweight (2 vCPUs, 4 GiB of memory, and 32 GiB of storage).</li>
         * <li>acp.std.large: Standard (4 vCPUs, 8 GiB of memory, and 32 GiB of storage).</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acp.basic.small</p>
         */
        public Builder instanceGroupSpec(String instanceGroupSpec) {
            this.putQueryParameter("InstanceGroupSpec", instanceGroupSpec);
            this.instanceGroupSpec = instanceGroupSpec;
            return this;
        }

        /**
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder ipv6Bandwidth(Integer ipv6Bandwidth) {
            this.putQueryParameter("Ipv6Bandwidth", ipv6Bandwidth);
            this.ipv6Bandwidth = ipv6Bandwidth;
            return this;
        }

        /**
         * <p>The ID of the key pair. When you create an instance group and specify a valid key pair ID, all cloud phone instances within the group will automatically be bound to that key pair upon creation. This eliminates the need to manually bind key pairs to individual cloud phone instances.</p>
         * <blockquote>
         * <p> Binding key pairs to cloud phone instances is currently not supported during instance group resizing.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>kp-7o9xywwfutc1l****</p>
         */
        public Builder keyPairId(String keyPairId) {
            this.putQueryParameter("KeyPairId", keyPairId);
            this.keyPairId = keyPairId;
            return this;
        }

        /**
         * NetworkInfo.
         */
        public Builder networkInfo(NetworkInfo networkInfo) {
            String networkInfoShrink = shrink(networkInfo, "NetworkInfo", "json");
            this.putQueryParameter("NetworkInfo", networkInfoShrink);
            this.networkInfo = networkInfo;
            return this;
        }

        /**
         * NetworkType.
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("NetworkType", networkType);
            this.networkType = networkType;
            return this;
        }

        /**
         * <p>The number of cloud phones in the instance group. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder numberOfInstances(Integer numberOfInstances) {
            this.putQueryParameter("NumberOfInstances", numberOfInstances);
            this.numberOfInstances = numberOfInstances;
            return this;
        }

        /**
         * <p>The ID of the network.</p>
         * <ul>
         * <li>This parameter is required if you assign a shared network to cloud phones. You can go to the <a href="https://wya.wuying.aliyun.com/network">Network</a> page of the Cloud Phone console to retrieve the ID of a <strong>shared network</strong>. If no shared network is available in the Cloud Phone console, you can leave this parameter empty. The system automatically creates one when you create an instance group.</li>
         * <li>This parameter is required if you assign a virtual private cloud (VPC) to cloud phones. You can go to the <a href="https://wya.wuying.aliyun.com/network">Network</a> page of the Cloud Phone console to retrieve the ID of a <strong>VPC</strong>. If no VPC is available in the Cloud Phone console, you must first create one.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-745976****</p>
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * <p>The subscription duration. The unit is specified by PeriodUnit.</p>
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
         * <p>The unit of the subscription duration.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Month</li>
         * <li>Year</li>
         * <li>Hour (Note that this unit is supported only by pay-as-you-go.)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * <p>The ID of the policy. You can call the <a href="https://help.aliyun.com/document_detail/2807352.html">ListPolicyGroups</a> operation to query policies.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-b7bxrrwxkijjh****</p>
         */
        public Builder policyGroupId(String policyGroupId) {
            this.putQueryParameter("PolicyGroupId", policyGroupId);
            this.policyGroupId = policyGroupId;
            return this;
        }

        /**
         * PromotionId.
         */
        public Builder promotionId(String promotionId) {
            this.putQueryParameter("PromotionId", promotionId);
            this.promotionId = promotionId;
            return this;
        }

        /**
         * StreamMode.
         */
        public Builder streamMode(Integer streamMode) {
            this.putQueryParameter("StreamMode", streamMode);
            this.streamMode = streamMode;
            return this;
        }

        /**
         * <p>The tags</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The ID of the vSwitch. You can call the <a href="https://help.aliyun.com/document_detail/448774.html">DescribeVSwitches</a> operation to query vSwitches.</p>
         * <ul>
         * <li>This parameter is not required if you assign a shared network to cloud phones.</li>
         * <li>This parameter is required if you assign a VPC to cloud phones. The vSwitch specified by this parameter is used to create cloud phones.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf61uvzhz8ejaw776****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public CreateAndroidInstanceGroupRequest build() {
            return new CreateAndroidInstanceGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAndroidInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateAndroidInstanceGroupRequest</p>
     */
    public static class NetworkInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoPay")
        private Boolean autoPay;

        @com.aliyun.core.annotation.NameInMap("AutoRenew")
        private Boolean autoRenew;

        @com.aliyun.core.annotation.NameInMap("BandwidthPackageName")
        private String bandwidthPackageName;

        @com.aliyun.core.annotation.NameInMap("CidrBlock")
        private String cidrBlock;

        @com.aliyun.core.annotation.NameInMap("InternetChargeType")
        private String internetChargeType;

        @com.aliyun.core.annotation.NameInMap("IpRatio")
        private Integer ipRatio;

        @com.aliyun.core.annotation.NameInMap("Isp")
        private String isp;

        @com.aliyun.core.annotation.NameInMap("LimitedBandwidth")
        private Integer limitedBandwidth;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("Period")
        private Integer period;

        @com.aliyun.core.annotation.NameInMap("PeriodUnit")
        private String periodUnit;

        @com.aliyun.core.annotation.NameInMap("VisibleType")
        private String visibleType;

        private NetworkInfo(Builder builder) {
            this.autoPay = builder.autoPay;
            this.autoRenew = builder.autoRenew;
            this.bandwidthPackageName = builder.bandwidthPackageName;
            this.cidrBlock = builder.cidrBlock;
            this.internetChargeType = builder.internetChargeType;
            this.ipRatio = builder.ipRatio;
            this.isp = builder.isp;
            this.limitedBandwidth = builder.limitedBandwidth;
            this.payType = builder.payType;
            this.period = builder.period;
            this.periodUnit = builder.periodUnit;
            this.visibleType = builder.visibleType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInfo create() {
            return builder().build();
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
         * @return bandwidthPackageName
         */
        public String getBandwidthPackageName() {
            return this.bandwidthPackageName;
        }

        /**
         * @return cidrBlock
         */
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        /**
         * @return internetChargeType
         */
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        /**
         * @return ipRatio
         */
        public Integer getIpRatio() {
            return this.ipRatio;
        }

        /**
         * @return isp
         */
        public String getIsp() {
            return this.isp;
        }

        /**
         * @return limitedBandwidth
         */
        public Integer getLimitedBandwidth() {
            return this.limitedBandwidth;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return period
         */
        public Integer getPeriod() {
            return this.period;
        }

        /**
         * @return periodUnit
         */
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        /**
         * @return visibleType
         */
        public String getVisibleType() {
            return this.visibleType;
        }

        public static final class Builder {
            private Boolean autoPay; 
            private Boolean autoRenew; 
            private String bandwidthPackageName; 
            private String cidrBlock; 
            private String internetChargeType; 
            private Integer ipRatio; 
            private String isp; 
            private Integer limitedBandwidth; 
            private String payType; 
            private Integer period; 
            private String periodUnit; 
            private String visibleType; 

            private Builder() {
            } 

            private Builder(NetworkInfo model) {
                this.autoPay = model.autoPay;
                this.autoRenew = model.autoRenew;
                this.bandwidthPackageName = model.bandwidthPackageName;
                this.cidrBlock = model.cidrBlock;
                this.internetChargeType = model.internetChargeType;
                this.ipRatio = model.ipRatio;
                this.isp = model.isp;
                this.limitedBandwidth = model.limitedBandwidth;
                this.payType = model.payType;
                this.period = model.period;
                this.periodUnit = model.periodUnit;
                this.visibleType = model.visibleType;
            } 

            /**
             * <p>Specifies whether to enable automatic payment. Default value: false.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>true: enables automatic payment. Make sure that your Alibaba Cloud account has sufficient balance.</li>
             * <li>false: disables automatic payment. You must manually complete the payment.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder autoPay(Boolean autoPay) {
                this.autoPay = autoPay;
                return this;
            }

            /**
             * <p>Specifies whether to enable auto-renewal. Default value: false.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>true: automatically renew resource upon expiration.</li>
             * <li>false: manually renew resources upon expiration.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder autoRenew(Boolean autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * BandwidthPackageName.
             */
            public Builder bandwidthPackageName(String bandwidthPackageName) {
                this.bandwidthPackageName = bandwidthPackageName;
                return this;
            }

            /**
             * CidrBlock.
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * InternetChargeType.
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * IpRatio.
             */
            public Builder ipRatio(Integer ipRatio) {
                this.ipRatio = ipRatio;
                return this;
            }

            /**
             * Isp.
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * LimitedBandwidth.
             */
            public Builder limitedBandwidth(Integer limitedBandwidth) {
                this.limitedBandwidth = limitedBandwidth;
                return this;
            }

            /**
             * PayType.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The subscription duration. The unit is specified by PeriodUnit.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The unit of the subscription duration.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Month</li>
             * <li>Year</li>
             * <li>Hour (Note that this unit is supported only by pay-as-you-go.)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Month</p>
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * VisibleType.
             */
            public Builder visibleType(String visibleType) {
                this.visibleType = visibleType;
                return this;
            }

            public NetworkInfo build() {
                return new NetworkInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAndroidInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateAndroidInstanceGroupRequest</p>
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
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
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
