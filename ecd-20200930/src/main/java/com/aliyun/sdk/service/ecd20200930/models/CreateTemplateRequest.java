// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link CreateTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateTemplateRequest</p>
 */
public class CreateTemplateRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataDiskList")
    private java.util.List<DataDiskList> dataDiskList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DefaultLanguage")
    private String defaultLanguage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 256, minLength = 2)
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Period")
    @com.aliyun.core.annotation.Validation(maximum = 6, minimum = 1)
    private Integer period;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
    private String policyGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PostPaidAfterUsedUp")
    private Boolean postPaidAfterUsedUp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionConfigList")
    private java.util.List<RegionConfigList> regionConfigList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceTagList")
    private java.util.List<ResourceTagList> resourceTagList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SiteConfigList")
    private java.util.List<SiteConfigList> siteConfigList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SystemDiskPerformanceLevel")
    private String systemDiskPerformanceLevel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
    @com.aliyun.core.annotation.Validation(maximum = 2040, minimum = 40)
    private Integer systemDiskSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 126, minLength = 2)
    private String templateName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TimerGroupId")
    private String timerGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserDuration")
    private Integer userDuration;

    private CreateTemplateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.bizType = builder.bizType;
        this.chargeType = builder.chargeType;
        this.dataDiskList = builder.dataDiskList;
        this.defaultLanguage = builder.defaultLanguage;
        this.description = builder.description;
        this.imageId = builder.imageId;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.policyGroupId = builder.policyGroupId;
        this.postPaidAfterUsedUp = builder.postPaidAfterUsedUp;
        this.productType = builder.productType;
        this.regionConfigList = builder.regionConfigList;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceTagList = builder.resourceTagList;
        this.siteConfigList = builder.siteConfigList;
        this.systemDiskPerformanceLevel = builder.systemDiskPerformanceLevel;
        this.systemDiskSize = builder.systemDiskSize;
        this.templateName = builder.templateName;
        this.timerGroupId = builder.timerGroupId;
        this.userDuration = builder.userDuration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return dataDiskList
     */
    public java.util.List<DataDiskList> getDataDiskList() {
        return this.dataDiskList;
    }

    /**
     * @return defaultLanguage
     */
    public String getDefaultLanguage() {
        return this.defaultLanguage;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
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
     * @return postPaidAfterUsedUp
     */
    public Boolean getPostPaidAfterUsedUp() {
        return this.postPaidAfterUsedUp;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return regionConfigList
     */
    public java.util.List<RegionConfigList> getRegionConfigList() {
        return this.regionConfigList;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceTagList
     */
    public java.util.List<ResourceTagList> getResourceTagList() {
        return this.resourceTagList;
    }

    /**
     * @return siteConfigList
     */
    public java.util.List<SiteConfigList> getSiteConfigList() {
        return this.siteConfigList;
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
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return timerGroupId
     */
    public String getTimerGroupId() {
        return this.timerGroupId;
    }

    /**
     * @return userDuration
     */
    public Integer getUserDuration() {
        return this.userDuration;
    }

    public static final class Builder extends Request.Builder<CreateTemplateRequest, Builder> {
        private String regionId; 
        private Boolean autoPay; 
        private Boolean autoRenew; 
        private String bizType; 
        private String chargeType; 
        private java.util.List<DataDiskList> dataDiskList; 
        private String defaultLanguage; 
        private String description; 
        private String imageId; 
        private Integer period; 
        private String periodUnit; 
        private String policyGroupId; 
        private Boolean postPaidAfterUsedUp; 
        private String productType; 
        private java.util.List<RegionConfigList> regionConfigList; 
        private String resourceGroupId; 
        private java.util.List<ResourceTagList> resourceTagList; 
        private java.util.List<SiteConfigList> siteConfigList; 
        private String systemDiskPerformanceLevel; 
        private Integer systemDiskSize; 
        private String templateName; 
        private String timerGroupId; 
        private Integer userDuration; 

        private Builder() {
            super();
        } 

        private Builder(CreateTemplateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.bizType = request.bizType;
            this.chargeType = request.chargeType;
            this.dataDiskList = request.dataDiskList;
            this.defaultLanguage = request.defaultLanguage;
            this.description = request.description;
            this.imageId = request.imageId;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.policyGroupId = request.policyGroupId;
            this.postPaidAfterUsedUp = request.postPaidAfterUsedUp;
            this.productType = request.productType;
            this.regionConfigList = request.regionConfigList;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceTagList = request.resourceTagList;
            this.siteConfigList = request.siteConfigList;
            this.systemDiskPerformanceLevel = request.systemDiskPerformanceLevel;
            this.systemDiskSize = request.systemDiskSize;
            this.templateName = request.templateName;
            this.timerGroupId = request.timerGroupId;
            this.userDuration = request.userDuration;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AutoPay.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putBodyParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * AutoRenew.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putBodyParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>1: the Enterprise edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder bizType(String bizType) {
            this.putBodyParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * ChargeType.
         */
        public Builder chargeType(String chargeType) {
            this.putBodyParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The data disks.</p>
         */
        public Builder dataDiskList(java.util.List<DataDiskList> dataDiskList) {
            this.putBodyParameter("DataDiskList", dataDiskList);
            this.dataDiskList = dataDiskList;
            return this;
        }

        /**
         * <p>The default language of cloud computers during startup. This parameter takes effect only when cloud computers are created from system images.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder defaultLanguage(String defaultLanguage) {
            this.putBodyParameter("DefaultLanguage", defaultLanguage);
            this.defaultLanguage = defaultLanguage;
            return this;
        }

        /**
         * <p>The template description. It must meet the following criteria:</p>
         * <ul>
         * <li>It can be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</li>
         * <li>It can contain letters, digits, and special characters, including spaces. Note: You can use carriage returns to break lines.</li>
         * </ul>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the cloud computer image. You can query image IDs on the Images page. System images and custom images are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>desktopimage-windows-server-2022-64-asp</p>
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(Integer period) {
            this.putBodyParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * PeriodUnit.
         */
        public Builder periodUnit(String periodUnit) {
            this.putBodyParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * <p>The ID of the policy group.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-8hlryfn331******</p>
         */
        public Builder policyGroupId(String policyGroupId) {
            this.putBodyParameter("PolicyGroupId", policyGroupId);
            this.policyGroupId = policyGroupId;
            return this;
        }

        /**
         * PostPaidAfterUsedUp.
         */
        public Builder postPaidAfterUsedUp(Boolean postPaidAfterUsedUp) {
            this.putBodyParameter("PostPaidAfterUsedUp", postPaidAfterUsedUp);
            this.postPaidAfterUsedUp = postPaidAfterUsedUp;
            return this;
        }

        /**
         * <p>The service type. Set the value to <code>CloudDesktop</code>.</p>
         * <ul>
         * <li></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CloudDesktop</p>
         */
        public Builder productType(String productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>The regions of the template. You can create cloud computers by using a template only within the same region as the template itself.</p>
         * <blockquote>
         * <p> You can specify up to 20 regions.</p>
         * </blockquote>
         */
        public Builder regionConfigList(java.util.List<RegionConfigList> regionConfigList) {
            this.putBodyParameter("RegionConfigList", regionConfigList);
            this.regionConfigList = regionConfigList;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-4knxmfneq1e******</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The tags added to cloud computers. Specify tags in key-value pairs. You can specify up to 20 tags.</p>
         */
        public Builder resourceTagList(java.util.List<ResourceTagList> resourceTagList) {
            this.putBodyParameter("ResourceTagList", resourceTagList);
            this.resourceTagList = resourceTagList;
            return this;
        }

        /**
         * <p>区域配置管理</p>
         */
        public Builder siteConfigList(java.util.List<SiteConfigList> siteConfigList) {
            this.putBodyParameter("SiteConfigList", siteConfigList);
            this.siteConfigList = siteConfigList;
            return this;
        }

        /**
         * <p>The performance level (PL) of the system disk.</p>
         * <blockquote>
         * <p> Only cloud computers of the Graphics or High Frequency type support Enterprise SSDs (ESSDs).</p>
         * </blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>PL1: a PL1 ESSD.</li>
         * <li>PL0: a PL0 ESSD.</li>
         * <li>AutoPL: an AutoPL ESSD.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AutoPL</p>
         */
        public Builder systemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
            this.putBodyParameter("SystemDiskPerformanceLevel", systemDiskPerformanceLevel);
            this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
            return this;
        }

        /**
         * <p>The size of the system disk. Unit: GiB. Valid values: 40 to 500. Increments: 10 GiB.</p>
         * <blockquote>
         * <p> The system disk size must be at least as large as the configured image size.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder systemDiskSize(Integer systemDiskSize) {
            this.putBodyParameter("SystemDiskSize", systemDiskSize);
            this.systemDiskSize = systemDiskSize;
            return this;
        }

        /**
         * <p>The template name. It must meet the following criteria:</p>
         * <ul>
         * <li>It can be 2 to 126 characters in length.</li>
         * <li>It must begin with a letter and cannot start with <code>http://</code> or <code>https://</code>.</li>
         * <li>It can contain letters, digits, colons (:), underscores (_), and hyphens (-). Note: Periods (.) are not supported in the name.</li>
         * </ul>
         * <p>This parameter is required.</p>
         */
        public Builder templateName(String templateName) {
            this.putBodyParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>The ID of the scheduled task group.</p>
         * 
         * <strong>example:</strong>
         * <p>ccg-0caoeogrk9m5****</p>
         */
        public Builder timerGroupId(String timerGroupId) {
            this.putBodyParameter("TimerGroupId", timerGroupId);
            this.timerGroupId = timerGroupId;
            return this;
        }

        /**
         * UserDuration.
         */
        public Builder userDuration(Integer userDuration) {
            this.putBodyParameter("UserDuration", userDuration);
            this.userDuration = userDuration;
            return this;
        }

        @Override
        public CreateTemplateRequest build() {
            return new CreateTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateTemplateRequest</p>
     */
    public static class DataDiskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
        private String performanceLevel;

        @com.aliyun.core.annotation.NameInMap("Size")
        @com.aliyun.core.annotation.Validation(maximum = 2040, minimum = 40)
        private Integer size;

        private DataDiskList(Builder builder) {
            this.performanceLevel = builder.performanceLevel;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDiskList create() {
            return builder().build();
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        public static final class Builder {
            private String performanceLevel; 
            private Integer size; 

            private Builder() {
            } 

            private Builder(DataDiskList model) {
                this.performanceLevel = model.performanceLevel;
                this.size = model.size;
            } 

            /**
             * <p>The PL of the data disk. Default value: <code>AutoPL</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>AutoPL</p>
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * <p>The size of the data disk. Unit: GiB. Valid values: 40 to 2040. Increments: 10 GiB.</p>
             * <p>**</p>
             * <p><strong>Keep in mind</strong> that the larger the ESSD disk capacity, the higher the available PL (for example, PL2 is available for disks larger than 460 GiB). A higher PL comes with a higher cost. Select an ESSD based on your specific needs.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            public DataDiskList build() {
                return new DataDiskList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateTemplateRequest</p>
     */
    public static class RegionConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
        private String officeSiteId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceInstanceType")
        private String resourceInstanceType;

        @com.aliyun.core.annotation.NameInMap("SnapshotPolicyId")
        private String snapshotPolicyId;

        @com.aliyun.core.annotation.NameInMap("SubnetId")
        private String subnetId;

        @com.aliyun.core.annotation.NameInMap("VolumeEncryptionEnable")
        private Boolean volumeEncryptionEnable;

        @com.aliyun.core.annotation.NameInMap("VolumeEncryptionKey")
        private String volumeEncryptionKey;

        private RegionConfigList(Builder builder) {
            this.officeSiteId = builder.officeSiteId;
            this.regionId = builder.regionId;
            this.resourceInstanceType = builder.resourceInstanceType;
            this.snapshotPolicyId = builder.snapshotPolicyId;
            this.subnetId = builder.subnetId;
            this.volumeEncryptionEnable = builder.volumeEncryptionEnable;
            this.volumeEncryptionKey = builder.volumeEncryptionKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionConfigList create() {
            return builder().build();
        }

        /**
         * @return officeSiteId
         */
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceInstanceType
         */
        public String getResourceInstanceType() {
            return this.resourceInstanceType;
        }

        /**
         * @return snapshotPolicyId
         */
        public String getSnapshotPolicyId() {
            return this.snapshotPolicyId;
        }

        /**
         * @return subnetId
         */
        public String getSubnetId() {
            return this.subnetId;
        }

        /**
         * @return volumeEncryptionEnable
         */
        public Boolean getVolumeEncryptionEnable() {
            return this.volumeEncryptionEnable;
        }

        /**
         * @return volumeEncryptionKey
         */
        public String getVolumeEncryptionKey() {
            return this.volumeEncryptionKey;
        }

        public static final class Builder {
            private String officeSiteId; 
            private String regionId; 
            private String resourceInstanceType; 
            private String snapshotPolicyId; 
            private String subnetId; 
            private Boolean volumeEncryptionEnable; 
            private String volumeEncryptionKey; 

            private Builder() {
            } 

            private Builder(RegionConfigList model) {
                this.officeSiteId = model.officeSiteId;
                this.regionId = model.regionId;
                this.resourceInstanceType = model.resourceInstanceType;
                this.snapshotPolicyId = model.snapshotPolicyId;
                this.subnetId = model.subnetId;
                this.volumeEncryptionEnable = model.volumeEncryptionEnable;
                this.volumeEncryptionKey = model.volumeEncryptionKey;
            } 

            /**
             * <p>The office network ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou+dir-709******</p>
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * <p>The region ID. You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to query the list of regions where Elastic Desktop Service (EDS) Enterprise is available.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the cloud computer type.</p>
             * 
             * <strong>example:</strong>
             * <p>eds.enterprise_office.8c16g</p>
             */
            public Builder resourceInstanceType(String resourceInstanceType) {
                this.resourceInstanceType = resourceInstanceType;
                return this;
            }

            /**
             * <p>The ID of the automatic snapshot policy.</p>
             * 
             * <strong>example:</strong>
             * <p>sp-35fvn8m21pnx2****</p>
             */
            public Builder snapshotPolicyId(String snapshotPolicyId) {
                this.snapshotPolicyId = snapshotPolicyId;
                return this;
            }

            /**
             * <p>The subnet ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1yiu**********</p>
             */
            public Builder subnetId(String subnetId) {
                this.subnetId = subnetId;
                return this;
            }

            /**
             * <p>Specifies whether to enable disk encryption.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>false (default): disables disk encryption.</li>
             * <li>true: enables disk encryption.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder volumeEncryptionEnable(Boolean volumeEncryptionEnable) {
                this.volumeEncryptionEnable = volumeEncryptionEnable;
                return this;
            }

            /**
             * <p>The ID of the Key Management Service (KMS) key that you want to use to encrypt disks. You can call the <a href="https://help.aliyun.com/document_detail/28951.html">ListKeys</a> operation to query KMS keys.</p>
             * 
             * <strong>example:</strong>
             * <p>a7b3c0c8-b3a2-4876-b1cc-*********</p>
             */
            public Builder volumeEncryptionKey(String volumeEncryptionKey) {
                this.volumeEncryptionKey = volumeEncryptionKey;
                return this;
            }

            public RegionConfigList build() {
                return new RegionConfigList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateTemplateRequest</p>
     */
    public static class ResourceTagList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ResourceTagList(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceTagList create() {
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

            private Builder(ResourceTagList model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>department</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>design</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ResourceTagList build() {
                return new ResourceTagList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateTemplateRequest</p>
     */
    public static class SiteConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppRuleId")
        private String appRuleId;

        @com.aliyun.core.annotation.NameInMap("SiteId")
        private String siteId;

        private SiteConfigList(Builder builder) {
            this.appRuleId = builder.appRuleId;
            this.siteId = builder.siteId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SiteConfigList create() {
            return builder().build();
        }

        /**
         * @return appRuleId
         */
        public String getAppRuleId() {
            return this.appRuleId;
        }

        /**
         * @return siteId
         */
        public String getSiteId() {
            return this.siteId;
        }

        public static final class Builder {
            private String appRuleId; 
            private String siteId; 

            private Builder() {
            } 

            private Builder(SiteConfigList model) {
                this.appRuleId = model.appRuleId;
                this.siteId = model.siteId;
            } 

            /**
             * <p>应用管控策略ID</p>
             * 
             * <strong>example:</strong>
             * <p>bwr-5a5371e0db954d********</p>
             */
            public Builder appRuleId(String appRuleId) {
                this.appRuleId = appRuleId;
                return this;
            }

            /**
             * <p>站点ID。</p>
             * 
             * <strong>example:</strong>
             * <p>mainland</p>
             */
            public Builder siteId(String siteId) {
                this.siteId = siteId;
                return this;
            }

            public SiteConfigList build() {
                return new SiteConfigList(this);
            } 

        } 

    }
}
