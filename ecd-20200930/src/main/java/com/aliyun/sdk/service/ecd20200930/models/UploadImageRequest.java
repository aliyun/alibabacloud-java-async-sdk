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
         * <p>The size of the data disk. Valid values: 80 to 500. Unit: GiB.</p>
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
         * <p>Specifies whether the image is a GPU-accelerated image.</p>
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
         * <p>Valid values:</p>
         * <ul>
         * <li>gpu_grid9: This GPU driver is used on cloud computers of the following two specifications: graphics – 4 vCPUs, 23 GiB memory, 4 GiB GPU memory, and graphics – 10 vCPUs, 46 GiB memory, 8 GiB GPU memory.</li>
         * <li>gpu_custom: You can install the driver later.</li>
         * <li>gpu_grid12: This GPU driver is used on graphical cloud computers of specifications other than the following two specifications: graphics – 4 vCPUs, 23 GiB memory, &amp; 4 GiB GPU memory, and graphics – 10 vCPUs, 46 GiB memory, &amp; 8 GiB GPU memory.</li>
         * </ul>
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
         * <p>The name of the image. The name must be 2 to 128 characters in length. The name must start with a letter but cannot start with <code>http://</code> or <code>https://</code>. The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
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
         * <p>The type of the license that is used to activate the operating system after the image is imported. Valid values:</p>
         * <ul>
         * <li>Auto: Elastic Desktop Service detects the operating system of the image and allocates a license to the operating system. In this mode, the system first checks whether a license allocated by an official Alibaba Cloud channel is specified in the <code>Platform</code>. If a license allocated by an official Alibaba Cloud channel is specified, the system allocates the license to the imported image. If no such license is specified, the BYOL (Bring Your Own License) mode is used.</li>
         * <li>Aliyun: The license that is allocated by an official Alibaba Cloud channel and is specified by <code>Platform</code> is used for the operating system distribution.</li>
         * <li>BYOL: The license that comes with the source operating system is used. When you use the BYOL mode, make sure that your license key is supported by Alibaba Cloud.</li>
         * </ul>
         * <p>Default value: Auto.</p>
         * <blockquote>
         * <p> Windows 10 cannot be activated by Alibaba Cloud. Set the <code>LicenseType</code> to BYOL for Windows 10.</p>
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
         * <p>The type of the operating system.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>Linux</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>Windows</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
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
         * <p>The object path of the image file in Object Storage Service (OSS).</p>
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
         * <p>Valid values:</p>
         * <ul>
         * <li>ASP: in-house Adaptive Streaming Protocol (ASP)</li>
         * </ul>
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
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * SystemDiskSize.
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
