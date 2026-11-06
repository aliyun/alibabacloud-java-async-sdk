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
 * {@link BuilderImageByParentRequest} extends {@link RequestModel}
 *
 * <p>BuilderImageByParentRequest</p>
 */
public class BuilderImageByParentRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizType")
    private Integer bizType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataDiskSize")
    private Integer dataDiskSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Distro")
    private String distro;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DriverIdList")
    private java.util.List<String> driverIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageCreateMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageCreateMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageName")
    private String imageName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeInstanceType")
    private String nodeInstanceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    private String officeSiteId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PackageType")
    private String packageType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ParentImageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parentImageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PerformanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String performanceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PropertyMap")
    private java.util.Map<String, String> propertyMap;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceList")
    private java.util.List<ResourceList> resourceList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RunMode")
    private String runMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceRegion")
    private String sourceRegion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer systemDiskSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VSwitchIdList")
    private java.util.List<String> vSwitchIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VersionName")
    private String versionName;

    private BuilderImageByParentRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizType = builder.bizType;
        this.dataDiskSize = builder.dataDiskSize;
        this.description = builder.description;
        this.distro = builder.distro;
        this.driverIdList = builder.driverIdList;
        this.imageCreateMode = builder.imageCreateMode;
        this.imageName = builder.imageName;
        this.language = builder.language;
        this.nodeInstanceType = builder.nodeInstanceType;
        this.officeSiteId = builder.officeSiteId;
        this.packageType = builder.packageType;
        this.parentImageId = builder.parentImageId;
        this.performanceType = builder.performanceType;
        this.productType = builder.productType;
        this.propertyMap = builder.propertyMap;
        this.resourceList = builder.resourceList;
        this.runMode = builder.runMode;
        this.sourceRegion = builder.sourceRegion;
        this.systemDiskSize = builder.systemDiskSize;
        this.vSwitchIdList = builder.vSwitchIdList;
        this.versionName = builder.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BuilderImageByParentRequest create() {
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
     * @return bizType
     */
    public Integer getBizType() {
        return this.bizType;
    }

    /**
     * @return dataDiskSize
     */
    public Integer getDataDiskSize() {
        return this.dataDiskSize;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return distro
     */
    public String getDistro() {
        return this.distro;
    }

    /**
     * @return driverIdList
     */
    public java.util.List<String> getDriverIdList() {
        return this.driverIdList;
    }

    /**
     * @return imageCreateMode
     */
    public String getImageCreateMode() {
        return this.imageCreateMode;
    }

    /**
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return nodeInstanceType
     */
    public String getNodeInstanceType() {
        return this.nodeInstanceType;
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return packageType
     */
    public String getPackageType() {
        return this.packageType;
    }

    /**
     * @return parentImageId
     */
    public String getParentImageId() {
        return this.parentImageId;
    }

    /**
     * @return performanceType
     */
    public String getPerformanceType() {
        return this.performanceType;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return propertyMap
     */
    public java.util.Map<String, String> getPropertyMap() {
        return this.propertyMap;
    }

    /**
     * @return resourceList
     */
    public java.util.List<ResourceList> getResourceList() {
        return this.resourceList;
    }

    /**
     * @return runMode
     */
    public String getRunMode() {
        return this.runMode;
    }

    /**
     * @return sourceRegion
     */
    public String getSourceRegion() {
        return this.sourceRegion;
    }

    /**
     * @return systemDiskSize
     */
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    /**
     * @return vSwitchIdList
     */
    public java.util.List<String> getVSwitchIdList() {
        return this.vSwitchIdList;
    }

    /**
     * @return versionName
     */
    public String getVersionName() {
        return this.versionName;
    }

    public static final class Builder extends Request.Builder<BuilderImageByParentRequest, Builder> {
        private String regionId; 
        private Integer bizType; 
        private Integer dataDiskSize; 
        private String description; 
        private String distro; 
        private java.util.List<String> driverIdList; 
        private String imageCreateMode; 
        private String imageName; 
        private String language; 
        private String nodeInstanceType; 
        private String officeSiteId; 
        private String packageType; 
        private String parentImageId; 
        private String performanceType; 
        private String productType; 
        private java.util.Map<String, String> propertyMap; 
        private java.util.List<ResourceList> resourceList; 
        private String runMode; 
        private String sourceRegion; 
        private Integer systemDiskSize; 
        private java.util.List<String> vSwitchIdList; 
        private String versionName; 

        private Builder() {
            super();
        } 

        private Builder(BuilderImageByParentRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizType = request.bizType;
            this.dataDiskSize = request.dataDiskSize;
            this.description = request.description;
            this.distro = request.distro;
            this.driverIdList = request.driverIdList;
            this.imageCreateMode = request.imageCreateMode;
            this.imageName = request.imageName;
            this.language = request.language;
            this.nodeInstanceType = request.nodeInstanceType;
            this.officeSiteId = request.officeSiteId;
            this.packageType = request.packageType;
            this.parentImageId = request.parentImageId;
            this.performanceType = request.performanceType;
            this.productType = request.productType;
            this.propertyMap = request.propertyMap;
            this.resourceList = request.resourceList;
            this.runMode = request.runMode;
            this.sourceRegion = request.sourceRegion;
            this.systemDiskSize = request.systemDiskSize;
            this.vSwitchIdList = request.vSwitchIdList;
            this.versionName = request.versionName;
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
         * <p>The business type to which the image belongs. <strong>Required</strong>. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Basic product.</li>
         * <li><strong>2</strong>: Personal cloud.</li>
         * <li><strong>3</strong>: Cloud office.</li>
         * <li><strong>4</strong>: Cloud Flow.</li>
         * <li><strong>10</strong>: Personal edition.</li>
         * <li><strong>20</strong>: Business edition.</li>
         * <li><strong>60</strong>: Linggou team edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder bizType(Integer bizType) {
            this.putBodyParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>The capacity of the data cloud disk in the creation environment. Unit: GiB. Specify this parameter when a data cloud disk is required, and ensure that it meets the disk requirements of the selected resource specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder dataDiskSize(Integer dataDiskSize) {
            this.putBodyParameter("DataDiskSize", dataDiskSize);
            this.dataDiskSize = dataDiskSize;
            return this;
        }

        /**
         * <p>The description of the new image, which facilitates subsequent queries and differentiation of images.</p>
         * 
         * <strong>example:</strong>
         * <p>Business image that includes office applications and standard configurations</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The operating system distribution information of the image. Enter the distribution identifier that is consistent with the parent image used.</p>
         * 
         * <strong>example:</strong>
         * <p>Ubuntu 22.04 64-bit</p>
         */
        public Builder distro(String distro) {
            this.putBodyParameter("Distro", distro);
            this.distro = distro;
            return this;
        }

        /**
         * <p>The list of driver IDs used when creating the image. A maximum of 200 items are supported. When you need to specify drivers, enter the IDs of existing drivers that are applicable to the target image.</p>
         * <p><strong>If PropertyMap.DRIVER_LIST is also specified, this parameter overwrites the driver list in it.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;6d4af751-f522-40d7-ab6c-4a0ae587****&quot;,&quot;b5bdf6c0-41de-4878-8963-e8324106****&quot;]</p>
         */
        public Builder driverIdList(java.util.List<String> driverIdList) {
            this.putBodyParameter("DriverIdList", driverIdList);
            this.driverIdList = driverIdList;
            return this;
        }

        /**
         * <p>The image creation mode. Use the following mode:</p>
         * <ul>
         * <li><strong>BUILDER_MANUAL</strong>: Manually enter the creation environment to install applications and configure the image.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BUILDER_MANUAL</p>
         */
        public Builder imageCreateMode(String imageCreateMode) {
            this.putBodyParameter("ImageCreateMode", imageCreateMode);
            this.imageCreateMode = imageCreateMode;
            return this;
        }

        /**
         * <p>The name of the new image. <strong>Required</strong>. The name must start with a letter or a Chinese character, and can contain letters, digits, Chinese characters, colons (:), underscores (_), periods (.), and hyphens (-). It cannot start with http:// or https://. The length is calculated as 3 for each Chinese character and 1 for each other character. The total length must be 2 to 64 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>OfficeImage_202611</p>
         */
        public Builder imageName(String imageName) {
            this.putBodyParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * <p>The language of the image. Valid values:</p>
         * <ul>
         * <li><strong>zh-CN</strong>: Simplified Chinese.</li>
         * <li><strong>zh-HK</strong>: Traditional Chinese (Hong Kong).</li>
         * <li><strong>en-US</strong>: English.</li>
         * <li><strong>ja-JP</strong>: Japanese.</li>
         * <li><strong>CN</strong>: Compatible value for Simplified Chinese.</li>
         * <li><strong>EN</strong>: Compatible value for English.</li>
         * <li><strong>JP</strong>: Compatible value for Japanese.</li>
         * <li><strong>CN-HK</strong>: Compatible value for Traditional Chinese (Hong Kong).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder language(String language) {
            this.putBodyParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>The ID of the node specifications for the creation resources. You can invoke ListNodeInstanceType to query the ID. Select a specification that is active in the creation region and under the associated product, and meets the CPU or GPU computing requirements.</p>
         * 
         * <strong>example:</strong>
         * <p>appstreaming.general.4c8g</p>
         */
        public Builder nodeInstanceType(String nodeInstanceType) {
            this.putBodyParameter("NodeInstanceType", nodeInstanceType);
            this.nodeInstanceType = nodeInstanceType;
            return this;
        }

        /**
         * <p>The ID of the office network used by the creation resources. Specify this parameter when a specific office network is required, and ensure that it is consistent with the creation region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-example****</p>
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putBodyParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * <p>The package type of the image. Keep it consistent with the selected parent image and creation scenario. Valid values:</p>
         * <ul>
         * <li><strong>Ecs</strong>: ECS instance image.</li>
         * <li><strong>Vhd</strong>: VHD application image.</li>
         * <li><strong>Container</strong>: Container image.</li>
         * <li><strong>Ecs_Container</strong>: ECS and container combined image.</li>
         * <li><strong>K8s_Node</strong>: Kubernetes node image.</li>
         * </ul>
         * <p><strong>This operation does not provide the BaseImageId parameter. You cannot explicitly specify the Vhd or Container type that requires a base image to be configured separately.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>Ecs</p>
         */
        public Builder packageType(String packageType) {
            this.putBodyParameter("PackageType", packageType);
            this.packageType = packageType;
            return this;
        }

        /**
         * <p>The ID of the parent image used to create the new image. <strong>Required</strong>. You can call ListImage to query the ID. An available distribution record of the parent image must exist in the region where the image is created.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>imgc-bp1parent****</p>
         */
        public Builder parentImageId(String parentImageId) {
            this.putBodyParameter("ParentImageId", parentImageId);
            this.parentImageId = parentImageId;
            return this;
        }

        /**
         * <p>The computing type of the creation resources.</p>
         * <ul>
         * <li><strong>CPU</strong>: Uses CPU compute resources.</li>
         * <li><strong>GPU</strong>: Uses GPU compute resources.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CPU</p>
         */
        public Builder performanceType(String performanceType) {
            this.putBodyParameter("PerformanceType", performanceType);
            this.performanceType = performanceType;
            return this;
        }

        /**
         * <p>The product to which the image belongs. <strong>Required</strong>. Use an activated product and keep it consistent with the selected parent image. Valid values:</p>
         * <ul>
         * <li><strong>CloudGame</strong>: Cloud game.</li>
         * <li><strong>CloudApp</strong>: Wuying Cloud App.</li>
         * <li><strong>CloudBrowser</strong>: Secure browser.</li>
         * <li><strong>CloudDesktop</strong>: Wuying Cloud Computer.</li>
         * <li><strong>ImageBuilder</strong>: Image creation resource.</li>
         * <li><strong>ImageValidate</strong>: Image validation resource.</li>
         * <li><strong>AndroidCloud</strong>: Android cloud.</li>
         * <li><strong>GpuRender</strong>: GPU rendering.</li>
         * <li><strong>AndroidGpuRender</strong>: Android cloud GPU rendering.</li>
         * <li><strong>WuyingServer</strong>: Enterprise edition workstation.</li>
         * <li><strong>GpuProxy</strong>: GPU remote rendering proxy.</li>
         * <li><strong>GpuCache</strong>: GPU remote rendering cache.</li>
         * <li><strong>AIAgent</strong>: AI agent service.</li>
         * <li><strong>HostedDesktop</strong>: Hosted computer.</li>
         * <li><strong>WuyingWorkstation</strong>: Personal edition container workstation.</li>
         * <li><strong>WuyingWorkstationBusiness</strong>: Business edition container workstation.</li>
         * <li><strong>WuyingWorkstationTeam</strong>: Linggou container workstation team edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CloudApp</p>
         */
        public Builder productType(String productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>The extended properties of the image. Both keys and values are strings. This parameter can be omitted when no extended configuration is required.</p>
         * <p>The property key for the driver list is DRIVER_LIST, and the value is a JSON string of an array of driver IDs. We recommend that you specify drivers by using DriverIdList. <strong>If both DriverIdList and PropertyMap.DRIVER_LIST are specified, DriverIdList takes precedence.</strong> Specify other extended properties only when their purposes and values are confirmed.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;DRIVER_LIST&quot;:&quot;[\&quot;6d4af751-f522-40d7-ab6c-4a0ae587****\&quot;,\&quot;b5bdf6c0-41de-4878-8963-e8324106****\&quot;]&quot;}</p>
         */
        public Builder propertyMap(java.util.Map<String, String> propertyMap) {
            String propertyMapShrink = shrink(propertyMap, "PropertyMap", "json");
            this.putBodyParameter("PropertyMap", propertyMapShrink);
            this.propertyMap = propertyMap;
            return this;
        }

        /**
         * <p>The list of resources required for image creation, such as the download URLs of applications to be installed. A maximum of 100 items are supported. The ResourceType and Resource of each item must correspond to each other.</p>
         */
        public Builder resourceList(java.util.List<ResourceList> resourceList) {
            this.putBodyParameter("ResourceList", resourceList);
            this.resourceList = resourceList;
            return this;
        }

        /**
         * <p>The running mode of the image creation environment. Valid values:</p>
         * <ul>
         * <li><strong>NORMAL</strong>: Normal running mode.</li>
         * <li><strong>COMPATIBLE</strong>: Compatible running mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder runMode(String runMode) {
            this.putBodyParameter("RunMode", runMode);
            this.runMode = runMode;
            return this;
        }

        /**
         * <p>The ID of the region where the image is created. The selected parent image must have been distributed to this region. Available regions are also affected by the region configurations of the account and product.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder sourceRegion(String sourceRegion) {
            this.putBodyParameter("SourceRegion", sourceRegion);
            this.sourceRegion = sourceRegion;
            return this;
        }

        /**
         * <p>The capacity of the system cloud disk in the creation environment. Unit: GiB. The capacity cannot be smaller than the system cloud disk capacity required by the parent image, and must meet the disk requirements of the selected resource specifications.</p>
         * <p>This parameter is required.</p>
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
         * <p>The list of vSwitch IDs used by the creation resources. A maximum of 100 items are supported. The vSwitches must belong to the selected office network and be located in the creation region.</p>
         */
        public Builder vSwitchIdList(java.util.List<String> vSwitchIdList) {
            this.putBodyParameter("VSwitchIdList", vSwitchIdList);
            this.vSwitchIdList = vSwitchIdList;
            return this;
        }

        /**
         * <p>The display name of the new image version, which is used to differentiate different versions of the same image.</p>
         * 
         * <strong>example:</strong>
         * <p>Office environment-202611</p>
         */
        public Builder versionName(String versionName) {
            this.putBodyParameter("VersionName", versionName);
            this.versionName = versionName;
            return this;
        }

        @Override
        public BuilderImageByParentRequest build() {
            return new BuilderImageByParentRequest(this);
        } 

    } 

    /**
     * 
     * {@link BuilderImageByParentRequest} extends {@link TeaModel}
     *
     * <p>BuilderImageByParentRequest</p>
     */
    public static class ResourceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Resource")
        private String resource;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private ResourceList(Builder builder) {
            this.resource = builder.resource;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceList create() {
            return builder().build();
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String resource; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(ResourceList model) {
                this.resource = model.resource;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The resource content corresponding to ResourceType. For the URL type, enter or return an accessible resource URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/apps/business/setup.exe">https://example.com/apps/business/setup.exe</a></p>
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * <p>The provision method of the resource content. Valid values:</p>
             * <ul>
             * <li><strong>HOSTED</strong>: Hosted resource.</li>
             * <li><strong>TEXT</strong>: Text resource.</li>
             * <li><strong>URL</strong>: Resource provided through a URL.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>URL</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public ResourceList build() {
                return new ResourceList(this);
            } 

        } 

    }
}
