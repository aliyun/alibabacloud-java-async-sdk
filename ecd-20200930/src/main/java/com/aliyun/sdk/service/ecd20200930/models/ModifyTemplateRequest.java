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
 * {@link ModifyTemplateRequest} extends {@link RequestModel}
 *
 * <p>ModifyTemplateRequest</p>
 */
public class ModifyTemplateRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

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
    @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
    private String policyGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionConfigList")
    private java.util.List<RegionConfigList> regionConfigList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceTagList")
    private java.util.List<ResourceTagList> resourceTagList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteConfigList")
    private java.util.List<SiteConfigList> siteConfigList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SystemDiskPerformanceLevel")
    private String systemDiskPerformanceLevel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
    @com.aliyun.core.annotation.Validation(maximum = 500, minimum = 40)
    private Integer systemDiskSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    @com.aliyun.core.annotation.Validation(maxLength = 126, minLength = 2)
    private String templateName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TimerGroupId")
    private String timerGroupId;

    private ModifyTemplateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.defaultLanguage = builder.defaultLanguage;
        this.description = builder.description;
        this.imageId = builder.imageId;
        this.policyGroupId = builder.policyGroupId;
        this.regionConfigList = builder.regionConfigList;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceTagList = builder.resourceTagList;
        this.siteConfigList = builder.siteConfigList;
        this.systemDiskPerformanceLevel = builder.systemDiskPerformanceLevel;
        this.systemDiskSize = builder.systemDiskSize;
        this.templateId = builder.templateId;
        this.templateName = builder.templateName;
        this.timerGroupId = builder.timerGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTemplateRequest create() {
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
     * @return policyGroupId
     */
    public String getPolicyGroupId() {
        return this.policyGroupId;
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
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
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

    public static final class Builder extends Request.Builder<ModifyTemplateRequest, Builder> {
        private String regionId; 
        private String defaultLanguage; 
        private String description; 
        private String imageId; 
        private String policyGroupId; 
        private java.util.List<RegionConfigList> regionConfigList; 
        private String resourceGroupId; 
        private java.util.List<ResourceTagList> resourceTagList; 
        private java.util.List<SiteConfigList> siteConfigList; 
        private String systemDiskPerformanceLevel; 
        private Integer systemDiskSize; 
        private String templateId; 
        private String templateName; 
        private String timerGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyTemplateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.defaultLanguage = request.defaultLanguage;
            this.description = request.description;
            this.imageId = request.imageId;
            this.policyGroupId = request.policyGroupId;
            this.regionConfigList = request.regionConfigList;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceTagList = request.resourceTagList;
            this.siteConfigList = request.siteConfigList;
            this.systemDiskPerformanceLevel = request.systemDiskPerformanceLevel;
            this.systemDiskSize = request.systemDiskSize;
            this.templateId = request.templateId;
            this.templateName = request.templateName;
            this.timerGroupId = request.timerGroupId;
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
         * DefaultLanguage.
         */
        public Builder defaultLanguage(String defaultLanguage) {
            this.putBodyParameter("DefaultLanguage", defaultLanguage);
            this.defaultLanguage = defaultLanguage;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * PolicyGroupId.
         */
        public Builder policyGroupId(String policyGroupId) {
            this.putBodyParameter("PolicyGroupId", policyGroupId);
            this.policyGroupId = policyGroupId;
            return this;
        }

        /**
         * RegionConfigList.
         */
        public Builder regionConfigList(java.util.List<RegionConfigList> regionConfigList) {
            this.putBodyParameter("RegionConfigList", regionConfigList);
            this.regionConfigList = regionConfigList;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ResourceTagList.
         */
        public Builder resourceTagList(java.util.List<ResourceTagList> resourceTagList) {
            this.putBodyParameter("ResourceTagList", resourceTagList);
            this.resourceTagList = resourceTagList;
            return this;
        }

        /**
         * SiteConfigList.
         */
        public Builder siteConfigList(java.util.List<SiteConfigList> siteConfigList) {
            this.putQueryParameter("SiteConfigList", siteConfigList);
            this.siteConfigList = siteConfigList;
            return this;
        }

        /**
         * SystemDiskPerformanceLevel.
         */
        public Builder systemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
            this.putBodyParameter("SystemDiskPerformanceLevel", systemDiskPerformanceLevel);
            this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
            return this;
        }

        /**
         * SystemDiskSize.
         */
        public Builder systemDiskSize(Integer systemDiskSize) {
            this.putBodyParameter("SystemDiskSize", systemDiskSize);
            this.systemDiskSize = systemDiskSize;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>b-0caoeogs88y*****</p>
         */
        public Builder templateId(String templateId) {
            this.putBodyParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.putBodyParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * TimerGroupId.
         */
        public Builder timerGroupId(String timerGroupId) {
            this.putBodyParameter("TimerGroupId", timerGroupId);
            this.timerGroupId = timerGroupId;
            return this;
        }

        @Override
        public ModifyTemplateRequest build() {
            return new ModifyTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyTemplateRequest} extends {@link TeaModel}
     *
     * <p>ModifyTemplateRequest</p>
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
             * OfficeSiteId.
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ResourceInstanceType.
             */
            public Builder resourceInstanceType(String resourceInstanceType) {
                this.resourceInstanceType = resourceInstanceType;
                return this;
            }

            /**
             * SnapshotPolicyId.
             */
            public Builder snapshotPolicyId(String snapshotPolicyId) {
                this.snapshotPolicyId = snapshotPolicyId;
                return this;
            }

            /**
             * SubnetId.
             */
            public Builder subnetId(String subnetId) {
                this.subnetId = subnetId;
                return this;
            }

            /**
             * VolumeEncryptionEnable.
             */
            public Builder volumeEncryptionEnable(Boolean volumeEncryptionEnable) {
                this.volumeEncryptionEnable = volumeEncryptionEnable;
                return this;
            }

            /**
             * VolumeEncryptionKey.
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
     * {@link ModifyTemplateRequest} extends {@link TeaModel}
     *
     * <p>ModifyTemplateRequest</p>
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
     * {@link ModifyTemplateRequest} extends {@link TeaModel}
     *
     * <p>ModifyTemplateRequest</p>
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
             * AppRuleId.
             */
            public Builder appRuleId(String appRuleId) {
                this.appRuleId = appRuleId;
                return this;
            }

            /**
             * SiteId.
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
