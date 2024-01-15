// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadImageRequest} extends {@link RequestModel}
 *
 * <p>UploadImageRequest</p>
 */
public class UploadImageRequest extends Request {
    @Query
    @NameInMap("DataDiskSize")
    @Validation(maximum = 500, minimum = 5)
    private Integer dataDiskSize;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("EnableSecurityCheck")
    private Boolean enableSecurityCheck;

    @Query
    @NameInMap("GpuCategory")
    private Boolean gpuCategory;

    @Query
    @NameInMap("GpuDriverType")
    private String gpuDriverType;

    @Query
    @NameInMap("ImageName")
    @Validation(required = true)
    private String imageName;

    @Query
    @NameInMap("LicenseType")
    private String licenseType;

    @Query
    @NameInMap("OsType")
    private String osType;

    @Query
    @NameInMap("OssObjectPath")
    @Validation(required = true)
    private String ossObjectPath;

    @Query
    @NameInMap("ProtocolType")
    private String protocolType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private UploadImageRequest(Builder builder) {
        super(builder);
        this.dataDiskSize = builder.dataDiskSize;
        this.description = builder.description;
        this.enableSecurityCheck = builder.enableSecurityCheck;
        this.gpuCategory = builder.gpuCategory;
        this.gpuDriverType = builder.gpuDriverType;
        this.imageName = builder.imageName;
        this.licenseType = builder.licenseType;
        this.osType = builder.osType;
        this.ossObjectPath = builder.ossObjectPath;
        this.protocolType = builder.protocolType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadImageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return protocolType
     */
    public String getProtocolType() {
        return this.protocolType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UploadImageRequest, Builder> {
        private Integer dataDiskSize; 
        private String description; 
        private Boolean enableSecurityCheck; 
        private Boolean gpuCategory; 
        private String gpuDriverType; 
        private String imageName; 
        private String licenseType; 
        private String osType; 
        private String ossObjectPath; 
        private String protocolType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UploadImageRequest request) {
            super(request);
            this.dataDiskSize = request.dataDiskSize;
            this.description = request.description;
            this.enableSecurityCheck = request.enableSecurityCheck;
            this.gpuCategory = request.gpuCategory;
            this.gpuDriverType = request.gpuDriverType;
            this.imageName = request.imageName;
            this.licenseType = request.licenseType;
            this.osType = request.osType;
            this.ossObjectPath = request.ossObjectPath;
            this.protocolType = request.protocolType;
            this.regionId = request.regionId;
        } 

        /**
         * The size of the data disk. Valid values: 80 to 500. Unit: GiB.
         */
        public Builder dataDiskSize(Integer dataDiskSize) {
            this.putQueryParameter("DataDiskSize", dataDiskSize);
            this.dataDiskSize = dataDiskSize;
            return this;
        }

        /**
         * The description of the custom image. The description must be 2 to 256 characters in length. It cannot start with `http://` or `https://`.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Specifies whether to enable security check.
         */
        public Builder enableSecurityCheck(Boolean enableSecurityCheck) {
            this.putQueryParameter("EnableSecurityCheck", enableSecurityCheck);
            this.enableSecurityCheck = enableSecurityCheck;
            return this;
        }

        /**
         * Specifies whether the image is a GPU-accelerated image.
         */
        public Builder gpuCategory(Boolean gpuCategory) {
            this.putQueryParameter("GpuCategory", gpuCategory);
            this.gpuCategory = gpuCategory;
            return this;
        }

        /**
         * The type of the pre-installed GPU driver. Valid values:
         * <p>
         * 
         * *   gpu_grid9: This value is applicable to a Graphics cloud desktop that uses 4 vCores, 23 GB memory, and 4 GB GPU memory and a Graphics cloud desktop that uses 10 vCores, 46 GB memory, and 8 GB GPU memory
         * *   gpu_grid12: This value is applicable to a cloud desktop other than a Graphics cloud desktop that uses 4 vCores, 23 GB memory, and 4 GB GPU memory and a Graphics cloud desktop that uses 10 vCores, 46 GB memory, and 8 GB GPU memory.
         * *   gpu_custom: You can install a driver later.
         */
        public Builder gpuDriverType(String gpuDriverType) {
            this.putQueryParameter("GpuDriverType", gpuDriverType);
            this.gpuDriverType = gpuDriverType;
            return this;
        }

        /**
         * The name of the custom image. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (\_), and hyphens (-). The name can contain letters, digits, colons (:), underscores (\_), and hyphens (-). The name must start with a letter and cannot start with `http://` or `https://`.
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * The type of the license that you want to use to activate the OS after the image is imported. Valid values:
         * <p>
         * 
         * *   Auto: Elastic Desktop Service (EDS) checks the source OS of the image and allocates a license to the OS. EDS first checks whether the OS distribution that is specified by `Platform` has a license allocated by using an official Alibaba Cloud channel. If yes, the allocated license is used. If no, the license of the source OS is used.
         * *   Aliyun: The license allocated by using an official Alibaba Cloud channel is used for the OS distribution that is specified by `Platform`.
         * *   BYOL: The license of the source OS is used. In this case, make sure that your license key can be used in Alibaba Cloud.
         * 
         * Default value: Auto.
         * 
         * > Windows 10 cannot be activated by using a license that is allocated by using an official Alibaba Cloud channel. In this case, you must set `LicenseType` to BYOL.
         */
        public Builder licenseType(String licenseType) {
            this.putQueryParameter("LicenseType", licenseType);
            this.licenseType = licenseType;
            return this;
        }

        /**
         * The type of the OS. Valid values:
         * <p>
         * 
         * *   Windows
         * *   Linux
         */
        public Builder osType(String osType) {
            this.putQueryParameter("OsType", osType);
            this.osType = osType;
            return this;
        }

        /**
         * The URL of the image object that you want to upload in Object Storage Service (OSS).
         */
        public Builder ossObjectPath(String ossObjectPath) {
            this.putQueryParameter("OssObjectPath", ossObjectPath);
            this.ossObjectPath = ossObjectPath;
            return this;
        }

        /**
         * The type of the protocol. Valid value: ASP.
         */
        public Builder protocolType(String protocolType) {
            this.putQueryParameter("ProtocolType", protocolType);
            this.protocolType = protocolType;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UploadImageRequest build() {
            return new UploadImageRequest(this);
        } 

    } 

}
