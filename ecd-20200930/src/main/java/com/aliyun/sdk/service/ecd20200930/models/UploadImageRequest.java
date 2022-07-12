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
         * DataDiskSize.
         */
        public Builder dataDiskSize(Integer dataDiskSize) {
            this.putQueryParameter("DataDiskSize", dataDiskSize);
            this.dataDiskSize = dataDiskSize;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EnableSecurityCheck.
         */
        public Builder enableSecurityCheck(Boolean enableSecurityCheck) {
            this.putQueryParameter("EnableSecurityCheck", enableSecurityCheck);
            this.enableSecurityCheck = enableSecurityCheck;
            return this;
        }

        /**
         * GpuCategory.
         */
        public Builder gpuCategory(Boolean gpuCategory) {
            this.putQueryParameter("GpuCategory", gpuCategory);
            this.gpuCategory = gpuCategory;
            return this;
        }

        /**
         * GpuDriverType.
         */
        public Builder gpuDriverType(String gpuDriverType) {
            this.putQueryParameter("GpuDriverType", gpuDriverType);
            this.gpuDriverType = gpuDriverType;
            return this;
        }

        /**
         * ImageName.
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * LicenseType.
         */
        public Builder licenseType(String licenseType) {
            this.putQueryParameter("LicenseType", licenseType);
            this.licenseType = licenseType;
            return this;
        }

        /**
         * OsType.
         */
        public Builder osType(String osType) {
            this.putQueryParameter("OsType", osType);
            this.osType = osType;
            return this;
        }

        /**
         * OssObjectPath.
         */
        public Builder ossObjectPath(String ossObjectPath) {
            this.putQueryParameter("OssObjectPath", ossObjectPath);
            this.ossObjectPath = ossObjectPath;
            return this;
        }

        /**
         * ProtocolType.
         */
        public Builder protocolType(String protocolType) {
            this.putQueryParameter("ProtocolType", protocolType);
            this.protocolType = protocolType;
            return this;
        }

        /**
         * RegionId.
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
