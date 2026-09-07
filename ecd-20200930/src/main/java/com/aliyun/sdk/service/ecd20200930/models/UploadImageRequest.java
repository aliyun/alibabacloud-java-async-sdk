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
 * {@link UploadImageRequest} extends {@link RequestModel}
 *
 * <p>UploadImageRequest</p>
 */
public class UploadImageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BootMode")
    private String bootMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataDiskSize")
    @com.aliyun.core.annotation.Validation(maximum = 500, minimum = 5)
    private Integer dataDiskSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableSecurityCheck")
    private Boolean enableSecurityCheck;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GpuCategory")
    private Boolean gpuCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GpuDriverType")
    private String gpuDriverType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LicenseType")
    private String licenseType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OsType")
    private String osType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssObjectPath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ossObjectPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProtocolType")
    private String protocolType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
    private String systemDiskSize;

    private UploadImageRequest(Builder builder) {
        super(builder);
        this.bootMode = builder.bootMode;
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
        this.systemDiskSize = builder.systemDiskSize;
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
     * @return bootMode
     */
    public String getBootMode() {
        return this.bootMode;
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

    /**
     * @return systemDiskSize
     */
    public String getSystemDiskSize() {
        return this.systemDiskSize;
    }

    public static final class Builder extends Request.Builder<UploadImageRequest, Builder> {
        private String bootMode; 
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
        private String systemDiskSize; 

        private Builder() {
            super();
        } 

        private Builder(UploadImageRequest request) {
            super(request);
            this.bootMode = request.bootMode;
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
            this.systemDiskSize = request.systemDiskSize;
        } 

        /**
         * <p>The boot mode of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>BIOS</p>
         */
        public Builder bootMode(String bootMode) {
            this.putQueryParameter("BootMode", bootMode);
            this.bootMode = bootMode;
            return this;
        }

        /**
         * <p>The data cloud disk size. Valid values: 80 to 500. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder dataDiskSize(Integer dataDiskSize) {
            this.putQueryParameter("DataDiskSize", dataDiskSize);
            this.dataDiskSize = dataDiskSize;
            return this;
        }

        /**
         * <p>The description of the image. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test description</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to enable security check.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableSecurityCheck(Boolean enableSecurityCheck) {
            this.putQueryParameter("EnableSecurityCheck", enableSecurityCheck);
            this.enableSecurityCheck = enableSecurityCheck;
            return this;
        }

        /**
         * <p>Specifies whether the image is a GPU-type image.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder gpuCategory(Boolean gpuCategory) {
            this.putQueryParameter("GpuCategory", gpuCategory);
            this.gpuCategory = gpuCategory;
            return this;
        }

        /**
         * <p>The type of the pre-installed GPU driver.</p>
         * 
         * <strong>example:</strong>
         * <p>gpu_grid9</p>
         */
        public Builder gpuDriverType(String gpuDriverType) {
            this.putQueryParameter("GpuDriverType", gpuDriverType);
            this.gpuDriverType = gpuDriverType;
            return this;
        }

        /**
         * <p>The image name. The name must be 2 to 128 characters in length. It must start with a letter or a Chinese character and cannot start with <code>http://</code> or <code>https://</code>. It can contain digits, colons (:), underscores (_), or hyphens (-).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Win10_Test</p>
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * <p>The license type used to activate the operating system after the image is imported. Valid values:</p>
         * <ul>
         * <li>Auto: Alibaba Cloud detects the source operating system and assigns a license. In automatic mode, the system first checks whether an Alibaba Cloud official license is available for the <code>Platform</code> you specified and assigns it to the imported image. If no such license is available, the system switches to BYOL (Bring Your Own License) mode.</li>
         * <li>Aliyun: Uses an Alibaba Cloud official license based on the <code>Platform</code> you specified.</li>
         * <li>BYOL: Uses the license that comes with the source operating system. When using BYOL, ensure that your license key supports use on Alibaba Cloud.</li>
         * </ul>
         * <p>Default value: Auto</p>
         * <blockquote>
         * <p>Systems such as Windows 10 cannot be activated through Alibaba Cloud. Set <code>LicenseType</code> to custom activation (BYOL).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Auto</p>
         */
        public Builder licenseType(String licenseType) {
            this.putQueryParameter("LicenseType", licenseType);
            this.licenseType = licenseType;
            return this;
        }

        /**
         * <p>The operating system type.</p>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        public Builder osType(String osType) {
            this.putQueryParameter("OsType", osType);
            this.osType = osType;
            return this;
        }

        /**
         * <p>The OSS object path of the image file.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://ossbucket:endpoint/object">https://ossbucket:endpoint/object</a></p>
         */
        public Builder ossObjectPath(String ossObjectPath) {
            this.putQueryParameter("OssObjectPath", ossObjectPath);
            this.ossObjectPath = ossObjectPath;
            return this;
        }

        /**
         * <p>The protocol type.</p>
         * 
         * <strong>example:</strong>
         * <p>ASP</p>
         */
        public Builder protocolType(String protocolType) {
            this.putQueryParameter("ProtocolType", protocolType);
            this.protocolType = protocolType;
            return this;
        }

        /**
         * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The system cloud disk size. Unit: GiB.</p>
         * <blockquote>
         * <p>The system cloud disk size cannot be smaller than the image file.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder systemDiskSize(String systemDiskSize) {
            this.putQueryParameter("SystemDiskSize", systemDiskSize);
            this.systemDiskSize = systemDiskSize;
            return this;
        }

        @Override
        public UploadImageRequest build() {
            return new UploadImageRequest(this);
        } 

    } 

}
