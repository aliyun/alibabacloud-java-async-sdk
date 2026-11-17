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
 * {@link ImportImageRequest} extends {@link RequestModel}
 *
 * <p>ImportImageRequest</p>
 */
public class ImportImageRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    private String bizRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizType")
    private Integer bizType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BootMode")
    private String bootMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableSecurityCheck")
    private Boolean enableSecurityCheck;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GpuCategory")
    private Boolean gpuCategory;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GpuDriverType")
    private String gpuDriverType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageName")
    private String imageName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LicenseType")
    private String licenseType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OsType")
    private String osType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OssObjectPath")
    private String ossObjectPath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProtocolType")
    private String protocolType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
    private Integer systemDiskSize;

    private ImportImageRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizRegionId = builder.bizRegionId;
        this.bizType = builder.bizType;
        this.bootMode = builder.bootMode;
        this.description = builder.description;
        this.enableSecurityCheck = builder.enableSecurityCheck;
        this.gpuCategory = builder.gpuCategory;
        this.gpuDriverType = builder.gpuDriverType;
        this.imageName = builder.imageName;
        this.licenseType = builder.licenseType;
        this.osType = builder.osType;
        this.ossObjectPath = builder.ossObjectPath;
        this.productType = builder.productType;
        this.protocolType = builder.protocolType;
        this.systemDiskSize = builder.systemDiskSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportImageRequest create() {
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
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return bizType
     */
    public Integer getBizType() {
        return this.bizType;
    }

    /**
     * @return bootMode
     */
    public String getBootMode() {
        return this.bootMode;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enableSecurityCheck
     */
    public Boolean getEnableSecurityCheck() {
        return this.enableSecurityCheck;
    }

    /**
     * @return gpuCategory
     */
    public Boolean getGpuCategory() {
        return this.gpuCategory;
    }

    /**
     * @return gpuDriverType
     */
    public String getGpuDriverType() {
        return this.gpuDriverType;
    }

    /**
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * @return licenseType
     */
    public String getLicenseType() {
        return this.licenseType;
    }

    /**
     * @return osType
     */
    public String getOsType() {
        return this.osType;
    }

    /**
     * @return ossObjectPath
     */
    public String getOssObjectPath() {
        return this.ossObjectPath;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return protocolType
     */
    public String getProtocolType() {
        return this.protocolType;
    }

    /**
     * @return systemDiskSize
     */
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    public static final class Builder extends Request.Builder<ImportImageRequest, Builder> {
        private String regionId; 
        private String bizRegionId; 
        private Integer bizType; 
        private String bootMode; 
        private String description; 
        private Boolean enableSecurityCheck; 
        private Boolean gpuCategory; 
        private String gpuDriverType; 
        private String imageName; 
        private String licenseType; 
        private String osType; 
        private String ossObjectPath; 
        private String productType; 
        private String protocolType; 
        private Integer systemDiskSize; 

        private Builder() {
            super();
        } 

        private Builder(ImportImageRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizRegionId = request.bizRegionId;
            this.bizType = request.bizType;
            this.bootMode = request.bootMode;
            this.description = request.description;
            this.enableSecurityCheck = request.enableSecurityCheck;
            this.gpuCategory = request.gpuCategory;
            this.gpuDriverType = request.gpuDriverType;
            this.imageName = request.imageName;
            this.licenseType = request.licenseType;
            this.osType = request.osType;
            this.ossObjectPath = request.ossObjectPath;
            this.productType = request.productType;
            this.protocolType = request.protocolType;
            this.systemDiskSize = request.systemDiskSize;
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
         * <p>The business region ID, such as cn-hangzhou.</p>
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
         * <p>The business line to which the image belongs. Default value: 1.</p>
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
         * <p>The image boot mode. Valid values:</p>
         * <ul>
         * <li>BIOS: Legacy BIOS boot.</li>
         * <li>UEFI: UEFI boot.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UEFI</p>
         */
        public Builder bootMode(String bootMode) {
            this.putBodyParameter("BootMode", bootMode);
            this.bootMode = bootMode;
            return this;
        }

        /**
         * <p>The description of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom Cloud Desktop image</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to enable the image security check. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         */
        public Builder enableSecurityCheck(Boolean enableSecurityCheck) {
            this.putBodyParameter("EnableSecurityCheck", enableSecurityCheck);
            this.enableSecurityCheck = enableSecurityCheck;
            return this;
        }

        /**
         * <p>Specifies whether the image is a GPU image. Valid values:</p>
         * <ul>
         * <li>true: Yes.</li>
         * <li>false: No.</li>
         * </ul>
         */
        public Builder gpuCategory(Boolean gpuCategory) {
            this.putBodyParameter("GpuCategory", gpuCategory);
            this.gpuCategory = gpuCategory;
            return this;
        }

        /**
         * <p>The GPU driver type. Valid values:</p>
         * <ul>
         * <li>gpu_grid9: GRID 9 driver.</li>
         * <li>gpu_grid12: GRID 12 driver.</li>
         * <li>gpu_custom: Custom driver.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>gpu_grid12</p>
         */
        public Builder gpuDriverType(String gpuDriverType) {
            this.putBodyParameter("GpuDriverType", gpuDriverType);
            this.gpuDriverType = gpuDriverType;
            return this;
        }

        /**
         * <p>The name of the image after it is imported. This parameter cannot be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>DemoImage</p>
         */
        public Builder imageName(String imageName) {
            this.putBodyParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * <p>The operating system license type. Valid values:</p>
         * <ul>
         * <li>Auto: Automatically selected.</li>
         * <li>Aliyun: Provided by Alibaba Cloud.</li>
         * <li>BYOL: Bring your own license.
         * Default value: Auto.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Auto</p>
         */
        public Builder licenseType(String licenseType) {
            this.putBodyParameter("LicenseType", licenseType);
            this.licenseType = licenseType;
            return this;
        }

        /**
         * <p>The operating system type of the image file. It must be consistent with the actual operating system of the image, such as Windows or Linux.</p>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        public Builder osType(String osType) {
            this.putBodyParameter("OsType", osType);
            this.osType = osType;
            return this;
        }

        /**
         * <p>The complete OSS object URL of the image file to be imported, including the bucket domain name and file path. The file must be uploaded before you call this operation. Example: <a href="https://BucketName.oss-cn-hangzhou.aliyuncs.com/FilePath">https://BucketName.oss-cn-hangzhou.aliyuncs.com/FilePath</a>.</p>
         */
        public Builder ossObjectPath(String ossObjectPath) {
            this.putBodyParameter("OssObjectPath", ossObjectPath);
            this.ossObjectPath = ossObjectPath;
            return this;
        }

        /**
         * <p>The product type. Currently, only CloudDesktop (Cloud Desktop) is supported.</p>
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
         * <p>The image connection protocol. Valid values: ASP and HDX. Default value: ASP.</p>
         * 
         * <strong>example:</strong>
         * <p>ASP</p>
         */
        public Builder protocolType(String protocolType) {
            this.putBodyParameter("ProtocolType", protocolType);
            this.protocolType = protocolType;
            return this;
        }

        /**
         * <p>The size of the system cloud disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        public Builder systemDiskSize(Integer systemDiskSize) {
            this.putBodyParameter("SystemDiskSize", systemDiskSize);
            this.systemDiskSize = systemDiskSize;
            return this;
        }

        @Override
        public ImportImageRequest build() {
            return new ImportImageRequest(this);
        } 

    } 

}
