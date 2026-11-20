// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link CreateWuyingServerRequest} extends {@link RequestModel}
 *
 * <p>CreateWuyingServerRequest</p>
 */
public class CreateWuyingServerRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Amount")
    private Integer amount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 2)
    private Integer bandwidth;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    private String bizRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataDisk")
    private java.util.List<DataDisk> dataDisk;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ErdmaEnabled")
    private Boolean erdmaEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GpuDriverVersion")
    private String gpuDriverVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HostName")
    private String hostName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdempotenceToken")
    private String idempotenceToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxPrice")
    private Float maxPrice;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NetworkStrategyType")
    private String networkStrategyType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    private String officeSiteId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PromotionId")
    private String promotionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SavingPlanId")
    private String savingPlanId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServerInstanceType")
    private String serverInstanceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServerPortRange")
    private String serverPortRange;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubPayType")
    private String subPayType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SystemDiskCategory")
    private String systemDiskCategory;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SystemDiskPerformanceLevel")
    private String systemDiskPerformanceLevel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
    private Integer systemDiskSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VSwitchIds")
    private java.util.List<String> vSwitchIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VirtualNodePoolId")
    private String virtualNodePoolId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WuyingServerName")
    private String wuyingServerName;

    private CreateWuyingServerRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.bandwidth = builder.bandwidth;
        this.bizRegionId = builder.bizRegionId;
        this.chargeType = builder.chargeType;
        this.dataDisk = builder.dataDisk;
        this.erdmaEnabled = builder.erdmaEnabled;
        this.gpuDriverVersion = builder.gpuDriverVersion;
        this.hostName = builder.hostName;
        this.idempotenceToken = builder.idempotenceToken;
        this.imageId = builder.imageId;
        this.maxPrice = builder.maxPrice;
        this.networkStrategyType = builder.networkStrategyType;
        this.officeSiteId = builder.officeSiteId;
        this.password = builder.password;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.promotionId = builder.promotionId;
        this.savingPlanId = builder.savingPlanId;
        this.serverInstanceType = builder.serverInstanceType;
        this.serverPortRange = builder.serverPortRange;
        this.subPayType = builder.subPayType;
        this.systemDiskCategory = builder.systemDiskCategory;
        this.systemDiskPerformanceLevel = builder.systemDiskPerformanceLevel;
        this.systemDiskSize = builder.systemDiskSize;
        this.vSwitchIds = builder.vSwitchIds;
        this.virtualNodePoolId = builder.virtualNodePoolId;
        this.wuyingServerName = builder.wuyingServerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWuyingServerRequest create() {
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
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
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
     * @return dataDisk
     */
    public java.util.List<DataDisk> getDataDisk() {
        return this.dataDisk;
    }

    /**
     * @return erdmaEnabled
     */
    public Boolean getErdmaEnabled() {
        return this.erdmaEnabled;
    }

    /**
     * @return gpuDriverVersion
     */
    public String getGpuDriverVersion() {
        return this.gpuDriverVersion;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return idempotenceToken
     */
    public String getIdempotenceToken() {
        return this.idempotenceToken;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return maxPrice
     */
    public Float getMaxPrice() {
        return this.maxPrice;
    }

    /**
     * @return networkStrategyType
     */
    public String getNetworkStrategyType() {
        return this.networkStrategyType;
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
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
     * @return promotionId
     */
    public String getPromotionId() {
        return this.promotionId;
    }

    /**
     * @return savingPlanId
     */
    public String getSavingPlanId() {
        return this.savingPlanId;
    }

    /**
     * @return serverInstanceType
     */
    public String getServerInstanceType() {
        return this.serverInstanceType;
    }

    /**
     * @return serverPortRange
     */
    public String getServerPortRange() {
        return this.serverPortRange;
    }

    /**
     * @return subPayType
     */
    public String getSubPayType() {
        return this.subPayType;
    }

    /**
     * @return systemDiskCategory
     */
    public String getSystemDiskCategory() {
        return this.systemDiskCategory;
    }

    /**
     * @return systemDiskPerformanceLevel
     */
    public String getSystemDiskPerformanceLevel() {
        return this.systemDiskPerformanceLevel;
    }

    /**
     * @return systemDiskSize
     */
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    /**
     * @return vSwitchIds
     */
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

    /**
     * @return virtualNodePoolId
     */
    public String getVirtualNodePoolId() {
        return this.virtualNodePoolId;
    }

    /**
     * @return wuyingServerName
     */
    public String getWuyingServerName() {
        return this.wuyingServerName;
    }

    public static final class Builder extends Request.Builder<CreateWuyingServerRequest, Builder> {
        private Integer amount; 
        private Boolean autoPay; 
        private Boolean autoRenew; 
        private Integer bandwidth; 
        private String bizRegionId; 
        private String chargeType; 
        private java.util.List<DataDisk> dataDisk; 
        private Boolean erdmaEnabled; 
        private String gpuDriverVersion; 
        private String hostName; 
        private String idempotenceToken; 
        private String imageId; 
        private Float maxPrice; 
        private String networkStrategyType; 
        private String officeSiteId; 
        private String password; 
        private Integer period; 
        private String periodUnit; 
        private String promotionId; 
        private String savingPlanId; 
        private String serverInstanceType; 
        private String serverPortRange; 
        private String subPayType; 
        private String systemDiskCategory; 
        private String systemDiskPerformanceLevel; 
        private Integer systemDiskSize; 
        private java.util.List<String> vSwitchIds; 
        private String virtualNodePoolId; 
        private String wuyingServerName; 

        private Builder() {
            super();
        } 

        private Builder(CreateWuyingServerRequest request) {
            super(request);
            this.amount = request.amount;
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.bandwidth = request.bandwidth;
            this.bizRegionId = request.bizRegionId;
            this.chargeType = request.chargeType;
            this.dataDisk = request.dataDisk;
            this.erdmaEnabled = request.erdmaEnabled;
            this.gpuDriverVersion = request.gpuDriverVersion;
            this.hostName = request.hostName;
            this.idempotenceToken = request.idempotenceToken;
            this.imageId = request.imageId;
            this.maxPrice = request.maxPrice;
            this.networkStrategyType = request.networkStrategyType;
            this.officeSiteId = request.officeSiteId;
            this.password = request.password;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.promotionId = request.promotionId;
            this.savingPlanId = request.savingPlanId;
            this.serverInstanceType = request.serverInstanceType;
            this.serverPortRange = request.serverPortRange;
            this.subPayType = request.subPayType;
            this.systemDiskCategory = request.systemDiskCategory;
            this.systemDiskPerformanceLevel = request.systemDiskPerformanceLevel;
            this.systemDiskSize = request.systemDiskSize;
            this.vSwitchIds = request.vSwitchIds;
            this.virtualNodePoolId = request.virtualNodePoolId;
            this.wuyingServerName = request.wuyingServerName;
        } 

        /**
         * <p>The number of workstations to create. Default value: 1. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder amount(Integer amount) {
            this.putBodyParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic payment. Default value: false.</p>
         * <ul>
         * <li>true: attempts to automatically pay when the order is placed.</li>
         * <li>false: manually pays after the order is created.</li>
         * </ul>
         * <p>A returned workstation ID does not indicate that the resource has been created. You must still confirm that the order payment is completed and query the workstation status.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putBodyParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto-renewal. Default value: false.</p>
         * <ul>
         * <li>true: enables auto-renewal.</li>
         * <li>false: disables auto-renewal.</li>
         * </ul>
         * <p>Whether this parameter can be configured depends on the sales rules of the selected billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putBodyParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The bandwidth. Unit: Mbit/s. If this parameter is specified, the value must be greater than 0 and cannot exceed 1000.</p>
         * <p>This parameter is required when NetworkStrategyType is set to DirectIp. The value must also meet the actual available configurations of the target region and office network.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putBodyParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putBodyParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * <p>The billing method. <strong>This parameter is required.</strong> If this parameter is not specified or an unrecognized value is passed, InvalidParameter.chargeType is returned.</p>
         * <ul>
         * <li>PrePaid: subscription. You must specify both Period and PeriodUnit, and use the matching SubPayType=prePaid.</li>
         * <li>PostPaid: pay-as-you-go. The sub-billing method and specification must support the corresponding sales method.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        public Builder chargeType(String chargeType) {
            this.putBodyParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The list of data cloud disks. This parameter is optional. You can specify up to 16 data cloud disks, and the number cannot exceed the maximum number supported by the selected workstation specification. The data cloud disk types and performance levels in the same request must be the same. The capacity of each data cloud disk is verified separately.</p>
         */
        public Builder dataDisk(java.util.List<DataDisk> dataDisk) {
            this.putBodyParameter("DataDisk", dataDisk);
            this.dataDisk = dataDisk;
            return this;
        }

        /**
         * <p>Specifies whether to enable the dedicated eRDMA NIC.</p>
         * <ul>
         * <li>true: enables the dedicated eRDMA NIC.</li>
         * <li>false: disables the dedicated eRDMA NIC.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder erdmaEnabled(Boolean erdmaEnabled) {
            this.putBodyParameter("ErdmaEnabled", erdmaEnabled);
            this.erdmaEnabled = erdmaEnabled;
            return this;
        }

        /**
         * <p>The configuration version of the GPU driver, such as grid19.</p>
         * 
         * <strong>example:</strong>
         * <p>grid19</p>
         */
        public Builder gpuDriverVersion(String gpuDriverVersion) {
            this.putBodyParameter("GpuDriverVersion", gpuDriverVersion);
            this.gpuDriverVersion = gpuDriverVersion;
            return this;
        }

        /**
         * <p>The hostname. The limits are as follows:</p>
         * <ul>
         * <li><p>The hostname cannot start or end with a period (.) or a hyphen (-). Consecutive periods or hyphens are not allowed.</p>
         * </li>
         * <li><p>Windows workstation: The hostname must be 2 to 15 characters in length. Periods (.) are not supported. Consecutive hyphens are not allowed. The hostname cannot contain only digits. It can contain uppercase and lowercase letters, digits, and hyphens (-).</p>
         * </li>
         * <li><p>Linux workstation:</p>
         * <ul>
         * <li><p>The hostname must be 2 to 64 characters in length. Multiple periods (.) are supported. The string between two periods is a segment. Each segment can contain uppercase and lowercase letters, digits, and hyphens (-).</p>
         * </li>
         * <li><p>You can use the ${instance_id} placeholder to write the instance ID into the HostName parameter. For example, if HostName=k8s-${instance_id} and the created ECS instance ID is i-123abc****, the hostname of the instance is k8s-i-123abc****.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>When you create multiple workstation instances at a time, you can use the name_prefix[begin_number,bits]name_suffix naming format to name the workstations uniformly. For example, if HostName is set to ecd-[1,4]-test, the hostname of the first workstation is ecd-0001-test, the hostname of the second workstation is ecd-0002-test, and so on.</p>
         * <ul>
         * <li><p>name_prefix: the prefix of the hostname.</p>
         * </li>
         * <li><p>[begin_number,bits]: the sequential number in the hostname.</p>
         * <ul>
         * <li><p>begin_number: the start number. Valid values: 0 to 999999. Default value: 0. If the specified value is invalid, 0 is used.</p>
         * </li>
         * <li><p>bits: the number of digits. Valid values: 1 to 6. Default value: 6. If the specified value is invalid, 6 is used.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>name_suffix: the suffix of the hostname.</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>testhost</p>
         */
        public Builder hostName(String hostName) {
            this.putBodyParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * <p>The idempotence token that ensures the uniqueness of the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>6a1b8c3d</p>
         */
        public Builder idempotenceToken(String idempotenceToken) {
            this.putBodyParameter("IdempotenceToken", idempotenceToken);
            this.idempotenceToken = idempotenceToken;
            return this;
        }

        /**
         * <p>The ID of the workstation image. <strong>This parameter is required when you create a workstation by calling this operation.</strong> If this parameter is not specified, InvalidParameter.imageId is returned.</p>
         * <p>You can call ListImage to obtain the image ID applicable to the target workstation.
         * <a href="~~ListImage~~">ListImage</a></p>
         * 
         * <strong>example:</strong>
         * <p>img-bp13mu****</p>
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The maximum bid for a preemptible workstation. This parameter is required when ChargeType is set to PostPaid and SubPayType is set to spot. If this parameter is not specified, InvalidParameter.maxPrice is returned. The final availability for purchase depends on the preemptible sales rules of the target specification.</p>
         * 
         * <strong>example:</strong>
         * <p>0.05</p>
         */
        public Builder maxPrice(Float maxPrice) {
            this.putBodyParameter("MaxPrice", maxPrice);
            this.maxPrice = maxPrice;
            return this;
        }

        /**
         * <p>The type of the network policy (invitational preview).</p>
         * 
         * <strong>example:</strong>
         * <p>DirectIp</p>
         */
        public Builder networkStrategyType(String networkStrategyType) {
            this.putBodyParameter("NetworkStrategyType", networkStrategyType);
            this.networkStrategyType = networkStrategyType;
            return this;
        }

        /**
         * <p>The ID of the office network. To specify an office network, specify the ID of an office network available for the current account in the target region.</p>
         * <p>If this parameter is not specified, the service attempts to reuse a valid office network configured for the current account in the region. If no reusable network is available, a default office network is created. If this process fails, the workstation creation fails.</p>
         * <p>The office network ID is different from the region ID and zone ID. You cannot use the zone ID returned by ListZones as a substitute.
         * <a href="~~ListZones~~">ListZones</a></p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-643067****</p>
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putBodyParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * <p>The logon password of the workstation. <strong>This parameter is required when you create a workstation by calling this operation.</strong> If this parameter is not specified, InvalidParameter.password is returned.</p>
         * <p>The password must be 8 to 30 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Spaces, Chinese characters, backslashes, and double quotation marks are not supported. The supported special characters are:</p>
         * <pre><code class="language-text">()`~!@#$%^&amp;*-_+=|{}[]:;\\&quot;&lt;&gt;,.?/
         * </code></pre>
         * <p>The password of a Windows workstation cannot start with a forward slash /.</p>
         * 
         * <strong>example:</strong>
         * <p>YourPassword123</p>
         */
        public Builder password(String password) {
            this.putBodyParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The numeric part of the subscription duration. This parameter is used together with PeriodUnit.</p>
         * <p><strong>This parameter is required when ChargeType is set to PrePaid, and you must also specify PeriodUnit. This parameter has no default value.</strong> If this parameter is not specified, InvalidParameter.period is returned (HTTP status code: 400). For example, Period=1 and PeriodUnit=Month indicate a subscription duration of one month.</p>
         * <p>The numeric value and unit are verified based on the requested combination and are not automatically converted to other periods. The subscription duration must comply with the sales rules of the target workstation commodity. If the order verification determines that the combination exceeds the allowed range, OrderPeriod.Invalid is returned (HTTP status code: 400).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder period(Integer period) {
            this.putBodyParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The unit of the subscription duration. This parameter is used together with Period.</p>
         * <p><strong>This parameter is required when ChargeType is set to PrePaid, and you must also specify Period.</strong> If this parameter is not specified or an unrecognized unit is passed, InvalidParameter.periodUnit is returned (HTTP status code: 400). The value is case-sensitive.</p>
         * <p>The units recognized by this operation are as follows:</p>
         * <ul>
         * <li>Hour: hour.</li>
         * <li>Day: day.</li>
         * <li>Week: week.</li>
         * <li>Month: month.</li>
         * <li>Year: year.</li>
         * </ul>
         * <p>The actual combinations of units and numeric values available for purchase must comply with the sales rules of the target workstation commodity. A recognizable unit does not mean that the combination is definitely available for purchase.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder periodUnit(String periodUnit) {
            this.putBodyParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * <p>The ID of the discount.</p>
         * <blockquote>
         * <p>If PromotionId is specified, the system attempts to apply the corresponding discount.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>17440009****</p>
         */
        public Builder promotionId(String promotionId) {
            this.putBodyParameter("PromotionId", promotionId);
            this.promotionId = promotionId;
            return this;
        }

        /**
         * <p>The ID of the savings plan.</p>
         * 
         * <strong>example:</strong>
         * <p>spn-ce3f5b4fk**46CY</p>
         */
        public Builder savingPlanId(String savingPlanId) {
            this.putBodyParameter("SavingPlanId", savingPlanId);
            this.savingPlanId = savingPlanId;
            return this;
        }

        /**
         * <p>The workstation specification. <strong>This parameter is required.</strong> If this parameter is not specified, InvalidParameter.serverInstanceType is returned.</p>
         * <p>You can call ListNodeInstanceType to query the specifications available for purchase in the target region and confirm that they support the selected billing method.
         * <a href="~~ListNodeInstanceType~~">ListNodeInstanceType</a></p>
         * 
         * <strong>example:</strong>
         * <p>eds.proworkstation_flagship_elite_ne.96c384g.192g4x</p>
         */
        public Builder serverInstanceType(String serverInstanceType) {
            this.putBodyParameter("ServerInstanceType", serverInstanceType);
            this.serverInstanceType = serverInstanceType;
            return this;
        }

        /**
         * <p>The service port range.</p>
         * 
         * <strong>example:</strong>
         * <p>22/22</p>
         */
        public Builder serverPortRange(String serverPortRange) {
            this.putBodyParameter("ServerPortRange", serverPortRange);
            this.serverPortRange = serverPortRange;
            return this;
        }

        /**
         * <p>The sub-billing method. This parameter must match ChargeType and the sales method of the target specification.</p>
         * <p>Billing combinations for Enterprise Edition workstations:</p>
         * <ul>
         * <li>ChargeType=PrePaid: use prePaid, which indicates subscription. It cannot be used with postPaid.</li>
         * <li>ChargeType=PostPaid: usually use postPaid, which indicates pay-as-you-go. If you use spot for preemptible billing, you must also specify MaxPrice, and the target specification must support this method.</li>
         * </ul>
         * <p>If this parameter is not specified, the default value for PrePaid is prePaid, and the default value for PostPaid is postPaid. Incompatible combinations may return InvalidOrder.CommodityCodeNotMatch.</p>
         * <p>The meanings of the enumerated values are as follows. The actual availability depends on the sales method of the target resource. You cannot arbitrarily combine different billing methods.</p>
         * <ul>
         * <li>prePaid: subscription.</li>
         * <li>postPaid: pay-as-you-go.</li>
         * <li>spot: preemptible billing.</li>
         * <li>duration: duration package.</li>
         * <li>mau: pay-as-you-go based on the number of monthly active users.</li>
         * <li>monthPackage: monthly package.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>prePaid</p>
         */
        public Builder subPayType(String subPayType) {
            this.putBodyParameter("SubPayType", subPayType);
            this.subPayType = subPayType;
            return this;
        }

        /**
         * <p>The type of the system cloud disk. Default value: cloud_auto.</p>
         * <ul>
         * <li>cloud: basic cloud disk.</li>
         * <li>cloud_efficiency: ultra cloud disk.</li>
         * <li>cloud_ssd: standard SSD cloud disk.</li>
         * <li>cloud_essd: ESSD cloud disk.</li>
         * <li>cloud_auto: ESSD AutoPL cloud disk.</li>
         * </ul>
         * <p>If you use cloud_essd, you must specify SystemDiskPerformanceLevel. The final availability is subject to the specification, region, and cloud disk capacity limits.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_auto</p>
         */
        public Builder systemDiskCategory(String systemDiskCategory) {
            this.putBodyParameter("SystemDiskCategory", systemDiskCategory);
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }

        /**
         * <p>The performance level of the ESSD system cloud disk. This parameter is required when SystemDiskCategory is set to cloud_essd.</p>
         * <ul>
         * <li>PL0: ESSD performance level 0.</li>
         * <li>PL1: ESSD performance level 1.</li>
         * <li>PL2: ESSD performance level 2.</li>
         * <li>PL3: ESSD performance level 3.</li>
         * </ul>
         * <p>The capacity must also meet the 10 GiB step size for the system cloud disk: at least 20 GiB for PL0 and PL1, at least 470 GiB for PL2, and at least 1270 GiB for PL3.</p>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        public Builder systemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
            this.putBodyParameter("SystemDiskPerformanceLevel", systemDiskPerformanceLevel);
            this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
            return this;
        }

        /**
         * <p>The size of the system cloud disk. Unit: GiB. Default value: 200. The value must be a multiple of 10. The general valid range is 20 to 65536. The value must also meet the capacity limits of the selected cloud disk type and performance level.</p>
         * <p>The maximum size of a basic cloud disk is 2000 GiB. The maximum size of a standard SSD cloud disk or ultra cloud disk is 32768 GiB. If the system cloud disk capacity required by the selected image is greater than the requested value, the capacity required by the image is used during creation.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder systemDiskSize(Integer systemDiskSize) {
            this.putBodyParameter("SystemDiskSize", systemDiskSize);
            this.systemDiskSize = systemDiskSize;
            return this;
        }

        /**
         * <p>The list of office network vSwitches.</p>
         */
        public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
            this.putBodyParameter("VSwitchIds", vSwitchIds);
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        /**
         * <p>The ID of the existing virtual node pool. This parameter is optional. If this parameter is specified, the node pool must exist and belong to the current account.</p>
         * <p>This operation associates the workstation with an existing node pool and does not create a node pool. If this parameter is not specified, this association is not established.</p>
         * 
         * <strong>example:</strong>
         * <p>vnp-0b************gyw</p>
         */
        public Builder virtualNodePoolId(String virtualNodePoolId) {
            this.putBodyParameter("VirtualNodePoolId", virtualNodePoolId);
            this.virtualNodePoolId = virtualNodePoolId;
            return this;
        }

        /**
         * <p>The name of the workstation. When multiple workstations are created, a numeric suffix is automatically added.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleServerName</p>
         */
        public Builder wuyingServerName(String wuyingServerName) {
            this.putBodyParameter("WuyingServerName", wuyingServerName);
            this.wuyingServerName = wuyingServerName;
            return this;
        }

        @Override
        public CreateWuyingServerRequest build() {
            return new CreateWuyingServerRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateWuyingServerRequest} extends {@link TeaModel}
     *
     * <p>CreateWuyingServerRequest</p>
     */
    public static class DataDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataDiskCategory")
        private String dataDiskCategory;

        @com.aliyun.core.annotation.NameInMap("DataDiskPerformanceLevel")
        private String dataDiskPerformanceLevel;

        @com.aliyun.core.annotation.NameInMap("DataDiskSize")
        private Integer dataDiskSize;

        private DataDisk(Builder builder) {
            this.dataDiskCategory = builder.dataDiskCategory;
            this.dataDiskPerformanceLevel = builder.dataDiskPerformanceLevel;
            this.dataDiskSize = builder.dataDiskSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDisk create() {
            return builder().build();
        }

        /**
         * @return dataDiskCategory
         */
        public String getDataDiskCategory() {
            return this.dataDiskCategory;
        }

        /**
         * @return dataDiskPerformanceLevel
         */
        public String getDataDiskPerformanceLevel() {
            return this.dataDiskPerformanceLevel;
        }

        /**
         * @return dataDiskSize
         */
        public Integer getDataDiskSize() {
            return this.dataDiskSize;
        }

        public static final class Builder {
            private String dataDiskCategory; 
            private String dataDiskPerformanceLevel; 
            private Integer dataDiskSize; 

            private Builder() {
            } 

            private Builder(DataDisk model) {
                this.dataDiskCategory = model.dataDiskCategory;
                this.dataDiskPerformanceLevel = model.dataDiskPerformanceLevel;
                this.dataDiskSize = model.dataDiskSize;
            } 

            /**
             * <p>The type of the data cloud disk.</p>
             * <ul>
             * <li>cloud: basic cloud disk.</li>
             * <li>cloud_efficiency: ultra cloud disk.</li>
             * <li>cloud_ssd: standard SSD cloud disk.</li>
             * <li>cloud_essd: ESSD cloud disk.</li>
             * <li>cloud_auto: ESSD AutoPL cloud disk.</li>
             * </ul>
             * <p>If this parameter is not specified, cloud is used. The final availability is subject to the specification, region, and cloud disk capacity limits.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_auto</p>
             */
            public Builder dataDiskCategory(String dataDiskCategory) {
                this.dataDiskCategory = dataDiskCategory;
                return this;
            }

            /**
             * <p>The performance level of the ESSD data cloud disk. This parameter takes effect when cloud_essd is used. Default value: PL1.</p>
             * <ul>
             * <li>PL0: ESSD performance level 0.</li>
             * <li>PL1: ESSD performance level 1.</li>
             * <li>PL2: ESSD performance level 2.</li>
             * <li>PL3: ESSD performance level 3.</li>
             * </ul>
             * <p>Based on the 10 GiB step size for data cloud disks, the minimum capacity is 10 GiB for PL0, 20 GiB for PL1, 470 GiB for PL2, and 1270 GiB for PL3.</p>
             * 
             * <strong>example:</strong>
             * <p>PL0</p>
             */
            public Builder dataDiskPerformanceLevel(String dataDiskPerformanceLevel) {
                this.dataDiskPerformanceLevel = dataDiskPerformanceLevel;
                return this;
            }

            /**
             * <p>The size of the data cloud disk. Unit: GiB. This parameter is required when you configure a data cloud disk. The value must be a positive integer and a multiple of 10, and cannot exceed 65536.</p>
             * <p>The value must also fall within the capacity range of the selected cloud disk type: up to 2000 GiB for a basic cloud disk, 20 to 32768 GiB for a standard SSD cloud disk or ultra cloud disk. An ESSD cloud disk must also meet the minimum capacity requirement of the performance level.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder dataDiskSize(Integer dataDiskSize) {
                this.dataDiskSize = dataDiskSize;
                return this;
            }

            public DataDisk build() {
                return new DataDisk(this);
            } 

        } 

    }
}
