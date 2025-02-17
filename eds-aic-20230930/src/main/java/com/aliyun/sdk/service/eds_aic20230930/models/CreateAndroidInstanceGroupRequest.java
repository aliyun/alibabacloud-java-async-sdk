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
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    private CreateAndroidInstanceGroupRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
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
        this.numberOfInstances = builder.numberOfInstances;
        this.officeSiteId = builder.officeSiteId;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.policyGroupId = builder.policyGroupId;
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
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<CreateAndroidInstanceGroupRequest, Builder> {
        private Integer amount; 
        private Boolean autoPay; 
        private Boolean autoRenew; 
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
        private Integer numberOfInstances; 
        private String officeSiteId; 
        private Integer period; 
        private String periodUnit; 
        private String policyGroupId; 
        private String vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAndroidInstanceGroupRequest request) {
            super(request);
            this.amount = request.amount;
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
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
            this.numberOfInstances = request.numberOfInstances;
            this.officeSiteId = request.officeSiteId;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.policyGroupId = request.policyGroupId;
            this.vSwitchId = request.vSwitchId;
        } 

        /**
         * <p>Number of instance groups. The default value is 1, and the maximum value is 100.</p>
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
         * <p>Whether to automatically pay. The default value is false.</p>
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
         * <p>Whether to enable auto-renewal. The default value is false.</p>
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
         * <p>Region ID. You can call <a href="~~DescribeRegions~~">DescribeRegions</a> to query the list of regions supported for purchasing cloud phones.</p>
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
         * <p>Billing type.</p>
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
         * <p>Used to ensure the idempotence of the request, preventing duplicate submissions. No more than 100 characters.</p>
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
         * EnableIpv6.
         */
        public Builder enableIpv6(Boolean enableIpv6) {
            this.putQueryParameter("EnableIpv6", enableIpv6);
            this.enableIpv6 = enableIpv6;
            return this;
        }

        /**
         * <p>Whether to enable GPU acceleration. The default value is false.</p>
         * <ul>
         * <li><p>true: Enable.</p>
         * </li>
         * <li><p>false: Disable.</p>
         * </li>
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
         * <p>Image ID. You can call <a href="~~DescribeImageList~~">DescribeImageList</a> to query the list of images for cloud phones.</p>
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
         * <p>Instance group name.</p>
         * <blockquote>
         * <ul>
         * <li>The length of the instance group name should not exceed 30 characters; it must start with uppercase/lowercase letters or Chinese characters, and cannot start with http:// or https://. Only Chinese, English, numbers, colons (:), underscores (_), periods (.), or hyphens (-) are supported.</li>
         * </ul>
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
         * <p>Instance group specification. You can call <a href="~~DescribeSpec~~">DescribeSpec</a> to query the specifications supported for purchasing cloud phones.</p>
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
         * Ipv6Bandwidth.
         */
        public Builder ipv6Bandwidth(Integer ipv6Bandwidth) {
            this.putQueryParameter("Ipv6Bandwidth", ipv6Bandwidth);
            this.ipv6Bandwidth = ipv6Bandwidth;
            return this;
        }

        /**
         * <p>Key pair ID. When creating an instance group, if a valid key pair ID is specified, the key pair will be bound to all instances created successfully, and there is no need to call the binding interface again.</p>
         * <p>Note: Binding key pairs during scaling is not currently supported.</p>
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
         * <p>Number of instances in the instance group. The maximum value is 100.</p>
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
         * <p>Network ID.</p>
         * <ul>
         * <li><p>For creating a shared network instance: The network ID is optional. Fill in the network ID of the <strong>Shared Network</strong> type from the <a href="https://wya.wuying.aliyun.com/network">Cloud Phone Console &gt; Network</a> page. If there is no shared network in the console, you do not need to fill it in, as a shared network will be automatically created when the instance group is created.</p>
         * </li>
         * <li><p>For creating a VPC network instance: The network ID is required. Fill in the network ID of the <strong>VPC Network</strong> type from the <a href="https://wya.wuying.aliyun.com/network">Cloud Phone Console &gt; Network</a> page. If there is no VPC network in the console, you need to create one first.</p>
         * </li>
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
         * <p>Duration of the purchased resources, specified by PeriodUnit.</p>
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
         * <p>Unit of the duration of the purchased resources.</p>
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
         * <p>Policy ID. You can call <a href="~~ListPolicyGroups~~">ListPolicyGroups</a> to query the list of policies.</p>
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
         * <p>VSwitch ID. You can call <a href="https://help.aliyun.com/document_detail/448774.html">DescribeVSwitches</a> to query the list of VSwitches.</p>
         * <ul>
         * <li><p>For creating a shared network instance: Do not fill in.</p>
         * </li>
         * <li><p>For creating a VPC network instance: The VSwitch ID is required. Select this VSwitch to create the instance.</p>
         * </li>
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

}
