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
    @NameInMap("GpuCategory")
    private Boolean gpuCategory;

    @Query
    @NameInMap("GpuDriverVersion")
    private String gpuDriverVersion;

    @Query
    @NameInMap("ImageId")
    private java.util.List < String > imageId;

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

    private DescribeImagesRequest(Builder builder) {
        super(builder);
        this.desktopInstanceType = builder.desktopInstanceType;
        this.gpuCategory = builder.gpuCategory;
        this.gpuDriverVersion = builder.gpuDriverVersion;
        this.imageId = builder.imageId;
        this.imageStatus = builder.imageStatus;
        this.imageType = builder.imageType;
        this.languageType = builder.languageType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.osType = builder.osType;
        this.protocolType = builder.protocolType;
        this.regionId = builder.regionId;
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

    public static final class Builder extends Request.Builder<DescribeImagesRequest, Builder> {
        private String desktopInstanceType; 
        private Boolean gpuCategory; 
        private String gpuDriverVersion; 
        private java.util.List < String > imageId; 
        private String imageStatus; 
        private String imageType; 
        private String languageType; 
        private Integer maxResults; 
        private String nextToken; 
        private String osType; 
        private String protocolType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImagesRequest response) {
            super(response);
            this.desktopInstanceType = response.desktopInstanceType;
            this.gpuCategory = response.gpuCategory;
            this.gpuDriverVersion = response.gpuDriverVersion;
            this.imageId = response.imageId;
            this.imageStatus = response.imageStatus;
            this.imageType = response.imageType;
            this.languageType = response.languageType;
            this.maxResults = response.maxResults;
            this.nextToken = response.nextToken;
            this.osType = response.osType;
            this.protocolType = response.protocolType;
            this.regionId = response.regionId;
        } 

        /**
         * DesktopInstanceType.
         */
        public Builder desktopInstanceType(String desktopInstanceType) {
            this.putQueryParameter("DesktopInstanceType", desktopInstanceType);
            this.desktopInstanceType = desktopInstanceType;
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
         * GpuDriverVersion.
         */
        public Builder gpuDriverVersion(String gpuDriverVersion) {
            this.putQueryParameter("GpuDriverVersion", gpuDriverVersion);
            this.gpuDriverVersion = gpuDriverVersion;
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
         * ImageStatus.
         */
        public Builder imageStatus(String imageStatus) {
            this.putQueryParameter("ImageStatus", imageStatus);
            this.imageStatus = imageStatus;
            return this;
        }

        /**
         * ImageType.
         */
        public Builder imageType(String imageType) {
            this.putQueryParameter("ImageType", imageType);
            this.imageType = imageType;
            return this;
        }

        /**
         * LanguageType.
         */
        public Builder languageType(String languageType) {
            this.putQueryParameter("LanguageType", languageType);
            this.languageType = languageType;
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

        @Override
        public DescribeImagesRequest build() {
            return new DescribeImagesRequest(this);
        } 

    } 

}
