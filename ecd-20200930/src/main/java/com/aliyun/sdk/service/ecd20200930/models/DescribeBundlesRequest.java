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
 * {@link DescribeBundlesRequest} extends {@link RequestModel}
 *
 * <p>DescribeBundlesRequest</p>
 */
public class DescribeBundlesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BundleId")
    private java.util.List<String> bundleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BundleType")
    private String bundleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckStock")
    private Boolean checkStock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpuCount")
    private Integer cpuCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopTypeFamily")
    private String desktopTypeFamily;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FotaChannel")
    private String fotaChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FromDesktopGroup")
    private Boolean fromDesktopGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GpuCount")
    private Float gpuCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GpuDriverType")
    private String gpuDriverType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private java.util.List<String> imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 500)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemorySize")
    private Integer memorySize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OsType")
    private String osType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProtocolType")
    private String protocolType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scope")
    private String scope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SelectedBundle")
    private Boolean selectedBundle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionType")
    private String sessionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupportMultiSession")
    private Boolean supportMultiSession;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VolumeEncryptionEnabled")
    private Boolean volumeEncryptionEnabled;

    private DescribeBundlesRequest(Builder builder) {
        super(builder);
        this.bundleId = builder.bundleId;
        this.bundleType = builder.bundleType;
        this.checkStock = builder.checkStock;
        this.cpuCount = builder.cpuCount;
        this.desktopTypeFamily = builder.desktopTypeFamily;
        this.fotaChannel = builder.fotaChannel;
        this.fromDesktopGroup = builder.fromDesktopGroup;
        this.gpuCount = builder.gpuCount;
        this.gpuDriverType = builder.gpuDriverType;
        this.imageId = builder.imageId;
        this.maxResults = builder.maxResults;
        this.memorySize = builder.memorySize;
        this.nextToken = builder.nextToken;
        this.osType = builder.osType;
        this.protocolType = builder.protocolType;
        this.regionId = builder.regionId;
        this.scope = builder.scope;
        this.selectedBundle = builder.selectedBundle;
        this.sessionType = builder.sessionType;
        this.supportMultiSession = builder.supportMultiSession;
        this.volumeEncryptionEnabled = builder.volumeEncryptionEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBundlesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bundleId
     */
    public java.util.List<String> getBundleId() {
        return this.bundleId;
    }

    /**
     * @return bundleType
     */
    public String getBundleType() {
        return this.bundleType;
    }

    /**
     * @return checkStock
     */
    public Boolean getCheckStock() {
        return this.checkStock;
    }

    /**
     * @return cpuCount
     */
    public Integer getCpuCount() {
        return this.cpuCount;
    }

    /**
     * @return desktopTypeFamily
     */
    public String getDesktopTypeFamily() {
        return this.desktopTypeFamily;
    }

    /**
     * @return fotaChannel
     */
    public String getFotaChannel() {
        return this.fotaChannel;
    }

    /**
     * @return fromDesktopGroup
     */
    public Boolean getFromDesktopGroup() {
        return this.fromDesktopGroup;
    }

    /**
     * @return gpuCount
     */
    public Float getGpuCount() {
        return this.gpuCount;
    }

    /**
     * @return gpuDriverType
     */
    public String getGpuDriverType() {
        return this.gpuDriverType;
    }

    /**
     * @return imageId
     */
    public java.util.List<String> getImageId() {
        return this.imageId;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return memorySize
     */
    public Integer getMemorySize() {
        return this.memorySize;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return osType
     */
    public String getOsType() {
        return this.osType;
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
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return selectedBundle
     */
    public Boolean getSelectedBundle() {
        return this.selectedBundle;
    }

    /**
     * @return sessionType
     */
    public String getSessionType() {
        return this.sessionType;
    }

    /**
     * @return supportMultiSession
     */
    public Boolean getSupportMultiSession() {
        return this.supportMultiSession;
    }

    /**
     * @return volumeEncryptionEnabled
     */
    public Boolean getVolumeEncryptionEnabled() {
        return this.volumeEncryptionEnabled;
    }

    public static final class Builder extends Request.Builder<DescribeBundlesRequest, Builder> {
        private java.util.List<String> bundleId; 
        private String bundleType; 
        private Boolean checkStock; 
        private Integer cpuCount; 
        private String desktopTypeFamily; 
        private String fotaChannel; 
        private Boolean fromDesktopGroup; 
        private Float gpuCount; 
        private String gpuDriverType; 
        private java.util.List<String> imageId; 
        private Integer maxResults; 
        private Integer memorySize; 
        private String nextToken; 
        private String osType; 
        private String protocolType; 
        private String regionId; 
        private String scope; 
        private Boolean selectedBundle; 
        private String sessionType; 
        private Boolean supportMultiSession; 
        private Boolean volumeEncryptionEnabled; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBundlesRequest request) {
            super(request);
            this.bundleId = request.bundleId;
            this.bundleType = request.bundleType;
            this.checkStock = request.checkStock;
            this.cpuCount = request.cpuCount;
            this.desktopTypeFamily = request.desktopTypeFamily;
            this.fotaChannel = request.fotaChannel;
            this.fromDesktopGroup = request.fromDesktopGroup;
            this.gpuCount = request.gpuCount;
            this.gpuDriverType = request.gpuDriverType;
            this.imageId = request.imageId;
            this.maxResults = request.maxResults;
            this.memorySize = request.memorySize;
            this.nextToken = request.nextToken;
            this.osType = request.osType;
            this.protocolType = request.protocolType;
            this.regionId = request.regionId;
            this.scope = request.scope;
            this.selectedBundle = request.selectedBundle;
            this.sessionType = request.sessionType;
            this.supportMultiSession = request.supportMultiSession;
            this.volumeEncryptionEnabled = request.volumeEncryptionEnabled;
        } 

        /**
         * <p>The IDs of the cloud computer templates. You can specify 1 to 100 IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>bundle_ecd_graphics.2xlarge_s15d15_win2019</p>
         */
        public Builder bundleId(java.util.List<String> bundleId) {
            this.putQueryParameter("BundleId", bundleId);
            this.bundleId = bundleId;
            return this;
        }

        /**
         * <p>The type of the cloud computer template.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>SYSTEM: system template</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>CUSTOM: custom template</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        public Builder bundleType(String bundleType) {
            this.putQueryParameter("BundleType", bundleType);
            this.bundleType = bundleType;
            return this;
        }

        /**
         * <p>Specifies whether to query the inventory status of the cloud computer instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder checkStock(Boolean checkStock) {
            this.putQueryParameter("CheckStock", checkStock);
            this.checkStock = checkStock;
            return this;
        }

        /**
         * <p>The number of vCPUs contained in the cloud computer instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder cpuCount(Integer cpuCount) {
            this.putQueryParameter("CpuCount", cpuCount);
            this.cpuCount = cpuCount;
            return this;
        }

        /**
         * <p>The instance family of the cloud computers.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>eds.graphics: graphical instance families</li>
         * <li>eds.hf: instance families with high clock speeds</li>
         * <li>eds.general: general-purpose instance families</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>eds.general</p>
         */
        public Builder desktopTypeFamily(String desktopTypeFamily) {
            this.putQueryParameter("DesktopTypeFamily", desktopTypeFamily);
            this.desktopTypeFamily = desktopTypeFamily;
            return this;
        }

        /**
         * <blockquote>
         * <p> This parameter is not available for public use.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>This parameter is now in invitational preview and unavailable.</p>
         */
        public Builder fotaChannel(String fotaChannel) {
            this.putQueryParameter("FotaChannel", fotaChannel);
            this.fotaChannel = fotaChannel;
            return this;
        }

        /**
         * <p>Specifies whether the cloud computers in the template belong to a cloud computer pool.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>false</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder fromDesktopGroup(Boolean fromDesktopGroup) {
            this.putQueryParameter("FromDesktopGroup", fromDesktopGroup);
            this.fromDesktopGroup = fromDesktopGroup;
            return this;
        }

        /**
         * <p>The number of GPUs contained in the cloud computer instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder gpuCount(Float gpuCount) {
            this.putQueryParameter("GpuCount", gpuCount);
            this.gpuCount = gpuCount;
            return this;
        }

        /**
         * <p>The GPU driver type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>T4</li>
         * <li>A10</li>
         * <li>G28</li>
         * <li>G39</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>T4</p>
         */
        public Builder gpuDriverType(String gpuDriverType) {
            this.putQueryParameter("GpuDriverType", gpuDriverType);
            this.gpuDriverType = gpuDriverType;
            return this;
        }

        /**
         * <p>The image IDs.</p>
         */
        public Builder imageId(java.util.List<String> imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * <p>Maximum value: 100.</p>
         * <p>Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The memory size of the cloud computer instance type. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder memorySize(Integer memorySize) {
            this.putQueryParameter("MemorySize", memorySize);
            this.memorySize = memorySize;
            return this;
        }

        /**
         * <p>The token that is used to start the next query.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The type of the OS.</p>
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
         * <p>The protocol type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>HDX: High-definition Experience (HDX) protocol</li>
         * <li>ASP: in-house Adaptive Streaming Protocol (ASP) (recommend)</li>
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
         * <p>The region ID. You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to query the regions supported by Elastic Desktop Service (EDS).</p>
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
         * <p>The scenario to use the image.</p>
         * 
         * <strong>example:</strong>
         * <p>FastBuy</p>
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * <p>The desktop template that is selected based on specific criteria.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder selectedBundle(Boolean selectedBundle) {
            this.putQueryParameter("SelectedBundle", selectedBundle);
            this.selectedBundle = selectedBundle;
            return this;
        }

        /**
         * <p>The type of the session. Valide values:</p>
         * <ul>
         * <li>SingleSession</li>
         * <li>MultipleSession</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SingleSession</p>
         */
        public Builder sessionType(String sessionType) {
            this.putQueryParameter("SessionType", sessionType);
            this.sessionType = sessionType;
            return this;
        }

        /**
         * <p>Specifies whether to return multi-session cloud computer templates. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder supportMultiSession(Boolean supportMultiSession) {
            this.putQueryParameter("SupportMultiSession", supportMultiSession);
            this.supportMultiSession = supportMultiSession;
            return this;
        }

        /**
         * <p>Specifies whether to enable disk encryption.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder volumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
            this.putQueryParameter("VolumeEncryptionEnabled", volumeEncryptionEnabled);
            this.volumeEncryptionEnabled = volumeEncryptionEnabled;
            return this;
        }

        @Override
        public DescribeBundlesRequest build() {
            return new DescribeBundlesRequest(this);
        } 

    } 

}
