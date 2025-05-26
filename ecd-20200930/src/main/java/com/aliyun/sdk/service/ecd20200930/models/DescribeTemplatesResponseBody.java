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
 * {@link DescribeTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTemplatesResponseBody</p>
 */
public class DescribeTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeTemplatesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTemplatesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeTemplatesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeTemplatesResponseBody build() {
            return new DescribeTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTemplatesResponseBody</p>
     */
    public static class DataDiskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
        private String performanceLevel;

        @com.aliyun.core.annotation.NameInMap("Size")
        private String size;

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
        public String getSize() {
            return this.size;
        }

        public static final class Builder {
            private String performanceLevel; 
            private String size; 

            private Builder() {
            } 

            private Builder(DataDiskList model) {
                this.performanceLevel = model.performanceLevel;
                this.size = model.size;
            } 

            /**
             * PerformanceLevel.
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(String size) {
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
     * {@link DescribeTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTemplatesResponseBody</p>
     */
    public static class RegionConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CpuCount")
        private Integer cpuCount;

        @com.aliyun.core.annotation.NameInMap("GpuSpec")
        private String gpuSpec;

        @com.aliyun.core.annotation.NameInMap("MemorySize")
        private Long memorySize;

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
            this.cpuCount = builder.cpuCount;
            this.gpuSpec = builder.gpuSpec;
            this.memorySize = builder.memorySize;
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
         * @return cpuCount
         */
        public Integer getCpuCount() {
            return this.cpuCount;
        }

        /**
         * @return gpuSpec
         */
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        /**
         * @return memorySize
         */
        public Long getMemorySize() {
            return this.memorySize;
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
            private Integer cpuCount; 
            private String gpuSpec; 
            private Long memorySize; 
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
                this.cpuCount = model.cpuCount;
                this.gpuSpec = model.gpuSpec;
                this.memorySize = model.memorySize;
                this.officeSiteId = model.officeSiteId;
                this.regionId = model.regionId;
                this.resourceInstanceType = model.resourceInstanceType;
                this.snapshotPolicyId = model.snapshotPolicyId;
                this.subnetId = model.subnetId;
                this.volumeEncryptionEnable = model.volumeEncryptionEnable;
                this.volumeEncryptionKey = model.volumeEncryptionKey;
            } 

            /**
             * CpuCount.
             */
            public Builder cpuCount(Integer cpuCount) {
                this.cpuCount = cpuCount;
                return this;
            }

            /**
             * GpuSpec.
             */
            public Builder gpuSpec(String gpuSpec) {
                this.gpuSpec = gpuSpec;
                return this;
            }

            /**
             * MemorySize.
             */
            public Builder memorySize(Long memorySize) {
                this.memorySize = memorySize;
                return this;
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
     * {@link DescribeTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTemplatesResponseBody</p>
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
     * {@link DescribeTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTemplatesResponseBody</p>
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
    /**
     * 
     * {@link DescribeTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTemplatesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataDiskList")
        private java.util.List<DataDiskList> dataDiskList;

        @com.aliyun.core.annotation.NameInMap("DefaultLanguage")
        private String defaultLanguage;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageType")
        private String imageType;

        @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
        private String policyGroupId;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("RegionConfigList")
        private java.util.List<RegionConfigList> regionConfigList;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ResourceTagList")
        private java.util.List<ResourceTagList> resourceTagList;

        @com.aliyun.core.annotation.NameInMap("SiteConfigList")
        private java.util.List<SiteConfigList> siteConfigList;

        @com.aliyun.core.annotation.NameInMap("SystemDiskPerformanceLevel")
        private String systemDiskPerformanceLevel;

        @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("TemplateType")
        private String templateType;

        @com.aliyun.core.annotation.NameInMap("TimerGroupId")
        private String timerGroupId;

        private Data(Builder builder) {
            this.dataDiskList = builder.dataDiskList;
            this.defaultLanguage = builder.defaultLanguage;
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.imageId = builder.imageId;
            this.imageType = builder.imageType;
            this.policyGroupId = builder.policyGroupId;
            this.productType = builder.productType;
            this.regionConfigList = builder.regionConfigList;
            this.requestId = builder.requestId;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceTagList = builder.resourceTagList;
            this.siteConfigList = builder.siteConfigList;
            this.systemDiskPerformanceLevel = builder.systemDiskPerformanceLevel;
            this.systemDiskSize = builder.systemDiskSize;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.templateType = builder.templateType;
            this.timerGroupId = builder.timerGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return imageType
         */
        public String getImageType() {
            return this.imageType;
        }

        /**
         * @return policyGroupId
         */
        public String getPolicyGroupId() {
            return this.policyGroupId;
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
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
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
         * @return templateType
         */
        public String getTemplateType() {
            return this.templateType;
        }

        /**
         * @return timerGroupId
         */
        public String getTimerGroupId() {
            return this.timerGroupId;
        }

        public static final class Builder {
            private java.util.List<DataDiskList> dataDiskList; 
            private String defaultLanguage; 
            private String description; 
            private String gmtCreate; 
            private String gmtModified; 
            private String imageId; 
            private String imageType; 
            private String policyGroupId; 
            private String productType; 
            private java.util.List<RegionConfigList> regionConfigList; 
            private String requestId; 
            private String resourceGroupId; 
            private java.util.List<ResourceTagList> resourceTagList; 
            private java.util.List<SiteConfigList> siteConfigList; 
            private String systemDiskPerformanceLevel; 
            private Integer systemDiskSize; 
            private String templateId; 
            private String templateName; 
            private String templateType; 
            private String timerGroupId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.dataDiskList = model.dataDiskList;
                this.defaultLanguage = model.defaultLanguage;
                this.description = model.description;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.imageId = model.imageId;
                this.imageType = model.imageType;
                this.policyGroupId = model.policyGroupId;
                this.productType = model.productType;
                this.regionConfigList = model.regionConfigList;
                this.requestId = model.requestId;
                this.resourceGroupId = model.resourceGroupId;
                this.resourceTagList = model.resourceTagList;
                this.siteConfigList = model.siteConfigList;
                this.systemDiskPerformanceLevel = model.systemDiskPerformanceLevel;
                this.systemDiskSize = model.systemDiskSize;
                this.templateId = model.templateId;
                this.templateName = model.templateName;
                this.templateType = model.templateType;
                this.timerGroupId = model.timerGroupId;
            } 

            /**
             * DataDiskList.
             */
            public Builder dataDiskList(java.util.List<DataDiskList> dataDiskList) {
                this.dataDiskList = dataDiskList;
                return this;
            }

            /**
             * DefaultLanguage.
             */
            public Builder defaultLanguage(String defaultLanguage) {
                this.defaultLanguage = defaultLanguage;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * ImageType.
             */
            public Builder imageType(String imageType) {
                this.imageType = imageType;
                return this;
            }

            /**
             * PolicyGroupId.
             */
            public Builder policyGroupId(String policyGroupId) {
                this.policyGroupId = policyGroupId;
                return this;
            }

            /**
             * ProductType.
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * RegionConfigList.
             */
            public Builder regionConfigList(java.util.List<RegionConfigList> regionConfigList) {
                this.regionConfigList = regionConfigList;
                return this;
            }

            /**
             * RequestId.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * ResourceTagList.
             */
            public Builder resourceTagList(java.util.List<ResourceTagList> resourceTagList) {
                this.resourceTagList = resourceTagList;
                return this;
            }

            /**
             * SiteConfigList.
             */
            public Builder siteConfigList(java.util.List<SiteConfigList> siteConfigList) {
                this.siteConfigList = siteConfigList;
                return this;
            }

            /**
             * SystemDiskPerformanceLevel.
             */
            public Builder systemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
                this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
                return this;
            }

            /**
             * SystemDiskSize.
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * TemplateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * TemplateType.
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            /**
             * TimerGroupId.
             */
            public Builder timerGroupId(String timerGroupId) {
                this.timerGroupId = timerGroupId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
