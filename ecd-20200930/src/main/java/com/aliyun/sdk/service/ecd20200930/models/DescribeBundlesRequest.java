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
    @NameInMap("ProtocolType")
    private String protocolType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

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
        this.protocolType = builder.protocolType;
        this.regionId = builder.regionId;
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
        private String protocolType; 
        private String regionId; 
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
            this.protocolType = request.protocolType;
            this.regionId = request.regionId;
            this.selectedBundle = request.selectedBundle;
            this.sessionType = request.sessionType;
            this.supportMultiSession = request.supportMultiSession;
            this.volumeEncryptionEnabled = request.volumeEncryptionEnabled;
        } 

        /**
         * The IDs of the desktop templates. You can specify 1 to 100 desktop templates.
         */
        public Builder bundleId(java.util.List < String > bundleId) {
            this.putQueryParameter("BundleId", bundleId);
            this.bundleId = bundleId;
            return this;
        }

        /**
         * The type of the desktop template.
         */
        public Builder bundleType(String bundleType) {
            this.putQueryParameter("BundleType", bundleType);
            this.bundleType = bundleType;
            return this;
        }

        /**
         * Specifies whether to query the inventory status of the desktop type.
         */
        public Builder checkStock(Boolean checkStock) {
            this.putQueryParameter("CheckStock", checkStock);
            this.checkStock = checkStock;
            return this;
        }

        /**
         * The number of vCPUs of the desktop type.
         */
        public Builder cpuCount(Integer cpuCount) {
            this.putQueryParameter("CpuCount", cpuCount);
            this.cpuCount = cpuCount;
            return this;
        }

        /**
         * The family of the desktop type.
         */
        public Builder desktopTypeFamily(String desktopTypeFamily) {
            this.putQueryParameter("DesktopTypeFamily", desktopTypeFamily);
            this.desktopTypeFamily = desktopTypeFamily;
            return this;
        }

        /**
         * This parameter is now in invitational preview and unavailable.
         */
        public Builder fotaChannel(String fotaChannel) {
            this.putQueryParameter("FotaChannel", fotaChannel);
            this.fotaChannel = fotaChannel;
            return this;
        }

        /**
         * Specifies whether the cloud desktop that uses the desktop template belongs to the desktop group. Default value: `false`.
         */
        public Builder fromDesktopGroup(Boolean fromDesktopGroup) {
            this.putQueryParameter("FromDesktopGroup", fromDesktopGroup);
            this.fromDesktopGroup = fromDesktopGroup;
            return this;
        }

        /**
         * The number of GPUs of the desktop type.
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
         * The number of entries to return on each page.
         * <p>
         * 
         * *   Maximum value: 100.
         * *   Default value: 10.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The memory size of the desktop type. Unit: GiB.
         */
        public Builder memorySize(Integer memorySize) {
            this.putQueryParameter("MemorySize", memorySize);
            this.memorySize = memorySize;
            return this;
        }

        /**
         * The token that determines the start point of the next query.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The type of the protocol.
         */
        public Builder protocolType(String protocolType) {
            this.putQueryParameter("ProtocolType", protocolType);
            this.protocolType = protocolType;
            return this;
        }

        /**
         * The ID of the region. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The desktop template that is selected based on specific criteria.
         */
        public Builder selectedBundle(Boolean selectedBundle) {
            this.putQueryParameter("SelectedBundle", selectedBundle);
            this.selectedBundle = selectedBundle;
            return this;
        }

        /**
         * The type of the session.
         */
        public Builder sessionType(String sessionType) {
            this.putQueryParameter("SessionType", sessionType);
            this.sessionType = sessionType;
            return this;
        }

        /**
         * Specifies whether to return multi-session desktop templates in this call. Default value: false.
         */
        public Builder supportMultiSession(Boolean supportMultiSession) {
            this.putQueryParameter("SupportMultiSession", supportMultiSession);
            this.supportMultiSession = supportMultiSession;
            return this;
        }

        /**
         * Specifies whether to enable disk encryption.
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
