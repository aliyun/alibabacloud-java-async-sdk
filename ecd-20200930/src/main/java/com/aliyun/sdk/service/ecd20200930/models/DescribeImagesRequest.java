// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImagesRequest} extends {@link RequestModel}
 *
 * <p>DescribeImagesRequest</p>
 */
public class DescribeImagesRequest extends Request {
    @Query
    @NameInMap("DesktopInstanceType")
    private String desktopInstanceType;

    @Query
    @NameInMap("FotaVersion")
    private String fotaVersion;

    @Query
    @NameInMap("GpuCategory")
    private Boolean gpuCategory;

    @Query
    @NameInMap("GpuDriverVersion")
    private String gpuDriverVersion;

    @Query
    @NameInMap("ImageId")
    private java.util.List < String > imageId;

    @Query
    @NameInMap("ImageName")
    private String imageName;

    @Query
    @NameInMap("ImageStatus")
    private String imageStatus;

    @Query
    @NameInMap("ImageType")
    private String imageType;

    @Query
    @NameInMap("LanguageType")
    private String languageType;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 500)
    private Integer maxResults;

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
    @NameInMap("SessionType")
    private String sessionType;

    private DescribeImagesRequest(Builder builder) {
        super(builder);
        this.desktopInstanceType = builder.desktopInstanceType;
        this.fotaVersion = builder.fotaVersion;
        this.gpuCategory = builder.gpuCategory;
        this.gpuDriverVersion = builder.gpuDriverVersion;
        this.imageId = builder.imageId;
        this.imageName = builder.imageName;
        this.imageStatus = builder.imageStatus;
        this.imageType = builder.imageType;
        this.languageType = builder.languageType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.osType = builder.osType;
        this.protocolType = builder.protocolType;
        this.regionId = builder.regionId;
        this.sessionType = builder.sessionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImagesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopInstanceType
     */
    public String getDesktopInstanceType() {
        return this.desktopInstanceType;
    }

    /**
     * @return fotaVersion
     */
    public String getFotaVersion() {
        return this.fotaVersion;
    }

    /**
     * @return gpuCategory
     */
    public Boolean getGpuCategory() {
        return this.gpuCategory;
    }

    /**
     * @return gpuDriverVersion
     */
    public String getGpuDriverVersion() {
        return this.gpuDriverVersion;
    }

    /**
     * @return imageId
     */
    public java.util.List < String > getImageId() {
        return this.imageId;
    }

    /**
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * @return imageStatus
     */
    public String getImageStatus() {
        return this.imageStatus;
    }

    /**
     * @return imageType
     */
    public String getImageType() {
        return this.imageType;
    }

    /**
     * @return languageType
     */
    public String getLanguageType() {
        return this.languageType;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
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
     * @return sessionType
     */
    public String getSessionType() {
        return this.sessionType;
    }

    public static final class Builder extends Request.Builder<DescribeImagesRequest, Builder> {
        private String desktopInstanceType; 
        private String fotaVersion; 
        private Boolean gpuCategory; 
        private String gpuDriverVersion; 
        private java.util.List < String > imageId; 
        private String imageName; 
        private String imageStatus; 
        private String imageType; 
        private String languageType; 
        private Integer maxResults; 
        private String nextToken; 
        private String osType; 
        private String protocolType; 
        private String regionId; 
        private String sessionType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImagesRequest request) {
            super(request);
            this.desktopInstanceType = request.desktopInstanceType;
            this.fotaVersion = request.fotaVersion;
            this.gpuCategory = request.gpuCategory;
            this.gpuDriverVersion = request.gpuDriverVersion;
            this.imageId = request.imageId;
            this.imageName = request.imageName;
            this.imageStatus = request.imageStatus;
            this.imageType = request.imageType;
            this.languageType = request.languageType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.osType = request.osType;
            this.protocolType = request.protocolType;
            this.regionId = request.regionId;
            this.sessionType = request.sessionType;
        } 

        /**
         * The cloud desktop type. You can call the [DescribeBundles](~~188884~~) operation to query the available cloud desktop types.
         */
        public Builder desktopInstanceType(String desktopInstanceType) {
            this.putQueryParameter("DesktopInstanceType", desktopInstanceType);
            this.desktopInstanceType = desktopInstanceType;
            return this;
        }

        /**
         * The image version.
         */
        public Builder fotaVersion(String fotaVersion) {
            this.putQueryParameter("FotaVersion", fotaVersion);
            this.fotaVersion = fotaVersion;
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
         * The version of the GPU driver.
         */
        public Builder gpuDriverVersion(String gpuDriverVersion) {
            this.putQueryParameter("GpuDriverVersion", gpuDriverVersion);
            this.gpuDriverVersion = gpuDriverVersion;
            return this;
        }

        /**
         * The IDs of the images. You can specify one or more image IDs.
         */
        public Builder imageId(java.util.List < String > imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The image name.
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * The state of the image.
         */
        public Builder imageStatus(String imageStatus) {
            this.putQueryParameter("ImageStatus", imageStatus);
            this.imageStatus = imageStatus;
            return this;
        }

        /**
         * The type of the image.
         */
        public Builder imageType(String imageType) {
            this.putQueryParameter("ImageType", imageType);
            this.imageType = imageType;
            return this;
        }

        /**
         * The language of the OS.
         */
        public Builder languageType(String languageType) {
            this.putQueryParameter("LanguageType", languageType);
            this.languageType = languageType;
            return this;
        }

        /**
         * The maximum number of entries to return on each page.
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
         * The token that determines the start point of the next query. If you do not specify this parameter, all results are returned.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The type of the OS. Default value: `null`.
         */
        public Builder osType(String osType) {
            this.putQueryParameter("OsType", osType);
            this.osType = osType;
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
         * The session type.
         */
        public Builder sessionType(String sessionType) {
            this.putQueryParameter("SessionType", sessionType);
            this.sessionType = sessionType;
            return this;
        }

        @Override
        public DescribeImagesRequest build() {
            return new DescribeImagesRequest(this);
        } 

    } 

}
