// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBundlesRequest} extends {@link RequestModel}
 *
 * <p>DescribeBundlesRequest</p>
 */
public class DescribeBundlesRequest extends Request {
    @Query
    @NameInMap("BundleId")
    private java.util.List < String > bundleId;

    @Query
    @NameInMap("BundleType")
    private String bundleType;

    @Query
    @NameInMap("CheckStock")
    private Boolean checkStock;

    @Query
    @NameInMap("CpuCount")
    private Integer cpuCount;

    @Query
    @NameInMap("DesktopTypeFamily")
    private String desktopTypeFamily;

    @Query
    @NameInMap("FotaChannel")
    private String fotaChannel;

    @Query
    @NameInMap("FromDesktopGroup")
    private Boolean fromDesktopGroup;

    @Query
    @NameInMap("GpuCount")
    private Float gpuCount;

    @Query
    @NameInMap("ImageId")
    private java.util.List < String > imageId;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 500)
    private Integer maxResults;

    @Query
    @NameInMap("MemorySize")
    private Integer memorySize;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("OsType")
    private String osType;

    @Query
    @NameInMap("ProtocolType")
    private String protocolType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Scope")
    private String scope;

    @Query
    @NameInMap("SelectedBundle")
    private Boolean selectedBundle;

    @Query
    @NameInMap("SessionType")
    private String sessionType;

    @Query
    @NameInMap("SupportMultiSession")
    private Boolean supportMultiSession;

    @Query
    @NameInMap("VolumeEncryptionEnabled")
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
    public java.util.List < String > getBundleId() {
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
     * @return imageId
     */
    public java.util.List < String > getImageId() {
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
        private java.util.List < String > bundleId; 
        private String bundleType; 
        private Boolean checkStock; 
        private Integer cpuCount; 
        private String desktopTypeFamily; 
        private String fotaChannel; 
        private Boolean fromDesktopGroup; 
        private Float gpuCount; 
        private java.util.List < String > imageId; 
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
         * BundleId.
         */
        public Builder bundleId(java.util.List < String > bundleId) {
            this.putQueryParameter("BundleId", bundleId);
            this.bundleId = bundleId;
            return this;
        }

        /**
         * BundleType.
         */
        public Builder bundleType(String bundleType) {
            this.putQueryParameter("BundleType", bundleType);
            this.bundleType = bundleType;
            return this;
        }

        /**
         * CheckStock.
         */
        public Builder checkStock(Boolean checkStock) {
            this.putQueryParameter("CheckStock", checkStock);
            this.checkStock = checkStock;
            return this;
        }

        /**
         * CpuCount.
         */
        public Builder cpuCount(Integer cpuCount) {
            this.putQueryParameter("CpuCount", cpuCount);
            this.cpuCount = cpuCount;
            return this;
        }

        /**
         * DesktopTypeFamily.
         */
        public Builder desktopTypeFamily(String desktopTypeFamily) {
            this.putQueryParameter("DesktopTypeFamily", desktopTypeFamily);
            this.desktopTypeFamily = desktopTypeFamily;
            return this;
        }

        /**
         * FotaChannel.
         */
        public Builder fotaChannel(String fotaChannel) {
            this.putQueryParameter("FotaChannel", fotaChannel);
            this.fotaChannel = fotaChannel;
            return this;
        }

        /**
         * FromDesktopGroup.
         */
        public Builder fromDesktopGroup(Boolean fromDesktopGroup) {
            this.putQueryParameter("FromDesktopGroup", fromDesktopGroup);
            this.fromDesktopGroup = fromDesktopGroup;
            return this;
        }

        /**
         * GpuCount.
         */
        public Builder gpuCount(Float gpuCount) {
            this.putQueryParameter("GpuCount", gpuCount);
            this.gpuCount = gpuCount;
            return this;
        }

        /**
         * ImageId.
         */
        public Builder imageId(java.util.List < String > imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * MemorySize.
         */
        public Builder memorySize(Integer memorySize) {
            this.putQueryParameter("MemorySize", memorySize);
            this.memorySize = memorySize;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
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

        /**
         * Scope.
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * SelectedBundle.
         */
        public Builder selectedBundle(Boolean selectedBundle) {
            this.putQueryParameter("SelectedBundle", selectedBundle);
            this.selectedBundle = selectedBundle;
            return this;
        }

        /**
         * SessionType.
         */
        public Builder sessionType(String sessionType) {
            this.putQueryParameter("SessionType", sessionType);
            this.sessionType = sessionType;
            return this;
        }

        /**
         * SupportMultiSession.
         */
        public Builder supportMultiSession(Boolean supportMultiSession) {
            this.putQueryParameter("SupportMultiSession", supportMultiSession);
            this.supportMultiSession = supportMultiSession;
            return this;
        }

        /**
         * VolumeEncryptionEnabled.
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
