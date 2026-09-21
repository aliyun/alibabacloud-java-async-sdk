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
         * <p>The quantity.</p>
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
         * <p>Specifies whether to enable automatic payment.</p>
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
         * <p>Specifies whether to enable auto-renewal.</p>
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
         * <p>The bandwidth value. This parameter takes effect only when NetworkStrategyType is set to DirectIp. Unit: Mbit/s. Valid values: 2 to 100.</p>
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
         * <p>The billing type.</p>
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
         * <p>The list of data cloud disks.</p>
         */
        public Builder dataDisk(java.util.List<DataDisk> dataDisk) {
            this.putBodyParameter("DataDisk", dataDisk);
            this.dataDisk = dataDisk;
            return this;
        }

        /**
         * <p>Specifies whether to enable dedicated eRDMA network interfaces.</p>
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
         * <p>The GPU driver configuration version, such as grid19.</p>
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
         * <p>The hostname. The following limits apply:</p>
         * <ul>
         * <li><p>A period (.) or hyphen (-) cannot be used as the first or last character, and consecutive use is not allowed.</p>
         * </li>
         * <li><p>Windows workstations: The hostname must be 2 to 15 characters in length. It cannot contain periods (.), consecutive hyphens, or consist entirely of digits. It can contain uppercase and lowercase letters, digits, and hyphens (-).</p>
         * </li>
         * <li><p>Linux workstations:</p>
         * <ul>
         * <li><p>The hostname must be 2 to 64 characters in length and can contain multiple periods (.). Each segment between periods can contain uppercase and lowercase letters, digits, and hyphens (-).</p>
         * </li>
         * <li><p>You can use the placeholder <code>${instance_id}</code> to include the instance ID in the HostName parameter. For example, if you set <code>HostName=k8s-${instance_id}</code> and the created ECS instance ID is <code>i-123abc****</code>, the hostname of the instance is <code>k8s-i-123abc****</code>.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>When creating multiple workstation instances at a time, you can use the <code>name_prefix[begin_number,bits]name_suffix</code> naming format to uniformly name multiple workstations. For example, if you set Hostname to <code>ecd-[1,4]-test</code>, the hostname of the first workstation is <code>ecd-0001-test</code>, the hostname of the second workstation is <code>ecd-0002-test</code>, and so on.</p>
         * <ul>
         * <li><p><code>name_prefix</code>: The prefix of the hostname.</p>
         * </li>
         * <li><p><code>[begin_number,bits]</code>: The sequential number in the hostname.</p>
         * <ul>
         * <li><p><code>begin_number</code>: The starting number. Valid values: 0 to 999999. Default value: 0. If an invalid value is specified, the value is set to 0.</p>
         * </li>
         * <li><p><code>bits</code>: The number of digits. Valid values: 1 to 6. Default value: 6. If an invalid value is specified, the value is set to 6.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p><code>name_suffix</code>: The suffix of the hostname.</p>
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
         * <p>The idempotency token that ensures operation uniqueness.</p>
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
         * <p>The image ID.</p>
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
         * <p>The maximum price.</p>
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
         * <p>The network policy type (invite-only preview).</p>
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
         * <p>The office network ID.</p>
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
         * <p>The workstation logon password.</p>
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
         * <p>The subscription duration.</p>
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
         * <p>The time unit.</p>
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
         * <p>The discount ID.</p>
         * <blockquote>
         * <p>If PromotionId is specified, the corresponding discount is applied.</p>
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
         * <p>The savings plan ID.</p>
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
         * <p>The workstation instance type.</p>
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
         * <p>The sub-billing type.</p>
         * 
         * <strong>example:</strong>
         * <p>postPaid</p>
         */
        public Builder subPayType(String subPayType) {
            this.putBodyParameter("SubPayType", subPayType);
            this.subPayType = subPayType;
            return this;
        }

        /**
         * <p>The system cloud disk type.</p>
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
         * <p>The system cloud disk performance level.</p>
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
         * <p>The system cloud disk size. Unit: GB.</p>
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
         * <p>The virtual node pool ID.</p>
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
         * <p>The workstation name. When creating multiple workstations, a numeric suffix is automatically appended.</p>
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
             * <p>The data cloud disk type.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_auto</p>
             */
            public Builder dataDiskCategory(String dataDiskCategory) {
                this.dataDiskCategory = dataDiskCategory;
                return this;
            }

            /**
             * <p>The data cloud disk performance level.</p>
             * 
             * <strong>example:</strong>
             * <p>PL0</p>
             */
            public Builder dataDiskPerformanceLevel(String dataDiskPerformanceLevel) {
                this.dataDiskPerformanceLevel = dataDiskPerformanceLevel;
                return this;
            }

            /**
             * <p>The data cloud disk size.</p>
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
