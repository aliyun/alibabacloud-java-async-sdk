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
         * <p>Quantity.</p>
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
         * <p>Auto payment.</p>
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
         * <p>Auto-renewal.</p>
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
         * <p>bandwidth value, the NetworkStrategyType is valid for DirectIp. Unit: Mbps, range 2~100</p>
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
         * <p>Region.</p>
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
         * <p>The billing method.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>PrePaid: subscription</li>
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
         * <p>The list of data disks.</p>
         */
        public Builder dataDisk(java.util.List<DataDisk> dataDisk) {
            this.putBodyParameter("DataDisk", dataDisk);
            this.dataDisk = dataDisk;
            return this;
        }

        /**
         * HostName.
         */
        public Builder hostName(String hostName) {
            this.putBodyParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * <p>Idempotence token to ensure operation uniqueness</p>
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
         * <p>The ID of the image.</p>
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
         * MaxPrice.
         */
        public Builder maxPrice(Float maxPrice) {
            this.putBodyParameter("MaxPrice", maxPrice);
            this.maxPrice = maxPrice;
            return this;
        }

        /**
         * <p>The type of the network policy (in invitational preview).</p>
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
         * <p>The office network IDs.</p>
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
         * <p>Workstation login password.</p>
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
         * <p>The subscription period.</p>
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
         * <p>Valid values:</p>
         * <ul>
         * <li>Month</li>
         * <li>Year</li>
         * </ul>
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
         * <p> If PromotionId is set, it will try to apply the corresponding discount.</p>
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
         * SavingPlanId.
         */
        public Builder savingPlanId(String savingPlanId) {
            this.putBodyParameter("SavingPlanId", savingPlanId);
            this.savingPlanId = savingPlanId;
            return this;
        }

        /**
         * <p>Workstation specifications.</p>
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
         * ServerPortRange.
         */
        public Builder serverPortRange(String serverPortRange) {
            this.putBodyParameter("ServerPortRange", serverPortRange);
            this.serverPortRange = serverPortRange;
            return this;
        }

        /**
         * SubPayType.
         */
        public Builder subPayType(String subPayType) {
            this.putBodyParameter("SubPayType", subPayType);
            this.subPayType = subPayType;
            return this;
        }

        /**
         * <p>The system disk category.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>cloud_auto.</li>
         * </ul>
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
         * <p>The performance level (PL) of the system disk.</p>
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
         * <p>The size of the system disk. Unit: GB.</p>
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
         * VirtualNodePoolId.
         */
        public Builder virtualNodePoolId(String virtualNodePoolId) {
            this.putBodyParameter("VirtualNodePoolId", virtualNodePoolId);
            this.virtualNodePoolId = virtualNodePoolId;
            return this;
        }

        /**
         * <p>The name of the workstation. The numeric suffix is automatically added when multiple workstations are created.</p>
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
             * <p>The data disk category.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>cloud_auto.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cloud_auto</p>
             */
            public Builder dataDiskCategory(String dataDiskCategory) {
                this.dataDiskCategory = dataDiskCategory;
                return this;
            }

            /**
             * <p>The PL of the data disk.</p>
             * 
             * <strong>example:</strong>
             * <p>PL0</p>
             */
            public Builder dataDiskPerformanceLevel(String dataDiskPerformanceLevel) {
                this.dataDiskPerformanceLevel = dataDiskPerformanceLevel;
                return this;
            }

            /**
             * <p>The data disk size.</p>
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
