// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBundleRequest} extends {@link RequestModel}
 *
 * <p>CreateBundleRequest</p>
 */
public class CreateBundleRequest extends Request {
    @Query
    @NameInMap("BundleName")
    private String bundleName;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DesktopType")
    @Validation(required = true)
    private String desktopType;

    @Query
    @NameInMap("ImageId")
    @Validation(required = true)
    private String imageId;

    @Query
    @NameInMap("Language")
    private String language;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RootDiskPerformanceLevel")
    private String rootDiskPerformanceLevel;

    @Query
    @NameInMap("RootDiskSizeGib")
    @Validation(required = true)
    private Integer rootDiskSizeGib;

    @Query
    @NameInMap("UserDiskPerformanceLevel")
    private String userDiskPerformanceLevel;

    @Query
    @NameInMap("UserDiskSizeGib")
    @Validation(required = true)
    private java.util.List < Integer > userDiskSizeGib;

    private CreateBundleRequest(Builder builder) {
        super(builder);
        this.bundleName = builder.bundleName;
        this.description = builder.description;
        this.desktopType = builder.desktopType;
        this.imageId = builder.imageId;
        this.language = builder.language;
        this.regionId = builder.regionId;
        this.rootDiskPerformanceLevel = builder.rootDiskPerformanceLevel;
        this.rootDiskSizeGib = builder.rootDiskSizeGib;
        this.userDiskPerformanceLevel = builder.userDiskPerformanceLevel;
        this.userDiskSizeGib = builder.userDiskSizeGib;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBundleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bundleName
     */
    public String getBundleName() {
        return this.bundleName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return desktopType
     */
    public String getDesktopType() {
        return this.desktopType;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return rootDiskPerformanceLevel
     */
    public String getRootDiskPerformanceLevel() {
        return this.rootDiskPerformanceLevel;
    }

    /**
     * @return rootDiskSizeGib
     */
    public Integer getRootDiskSizeGib() {
        return this.rootDiskSizeGib;
    }

    /**
     * @return userDiskPerformanceLevel
     */
    public String getUserDiskPerformanceLevel() {
        return this.userDiskPerformanceLevel;
    }

    /**
     * @return userDiskSizeGib
     */
    public java.util.List < Integer > getUserDiskSizeGib() {
        return this.userDiskSizeGib;
    }

    public static final class Builder extends Request.Builder<CreateBundleRequest, Builder> {
        private String bundleName; 
        private String description; 
        private String desktopType; 
        private String imageId; 
        private String language; 
        private String regionId; 
        private String rootDiskPerformanceLevel; 
        private Integer rootDiskSizeGib; 
        private String userDiskPerformanceLevel; 
        private java.util.List < Integer > userDiskSizeGib; 

        private Builder() {
            super();
        } 

        private Builder(CreateBundleRequest request) {
            super(request);
            this.bundleName = request.bundleName;
            this.description = request.description;
            this.desktopType = request.desktopType;
            this.imageId = request.imageId;
            this.language = request.language;
            this.regionId = request.regionId;
            this.rootDiskPerformanceLevel = request.rootDiskPerformanceLevel;
            this.rootDiskSizeGib = request.rootDiskSizeGib;
            this.userDiskPerformanceLevel = request.userDiskPerformanceLevel;
            this.userDiskSizeGib = request.userDiskSizeGib;
        } 

        /**
         * The name of the cloud computer template.
         */
        public Builder bundleName(String bundleName) {
            this.putQueryParameter("BundleName", bundleName);
            this.bundleName = bundleName;
            return this;
        }

        /**
         * The description of the cloud computer template.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The instance type of the cloud computers. You can call the [DescribeBundles](~~436974~~) operation to query cloud computer templates and obtain the instance types supported by the cloud computers from the `DesktopType` response parameter.
         * <p>
         * 
         * >  If you want the template to use a non-GPU-accelerated image, you can only select a non-GPU-accelerated instance type. If you want the template to use a GPU-accelerated image, you can only select a GPU-accelerated instance type.
         */
        public Builder desktopType(String desktopType) {
            this.putQueryParameter("DesktopType", desktopType);
            this.desktopType = desktopType;
            return this;
        }

        /**
         * The ID of the image.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The OS language. This parameter is available only for system images. Valid values:
         * <p>
         * 
         * *   zh-CN: Simplified Chinese
         * *   zh-HK: Traditional Chinese (Hong Kong)
         * *   en-US: American English
         * *   ja-JP: Japanese
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The performance level (PL) of the system disk. When the cloud computer instance type that is specified by the DesktopType parameter is set to a graphical instance type or instance type with a high clock speed, you can set the performance level of the disks. For more information about the differences among disks at different PLs, see [Enhanced SSDs](~~122389~~).
         * <p>
         * 
         * Valid values:
         * 
         * *   PL1
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   PL0
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   PL3
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   PL2
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder rootDiskPerformanceLevel(String rootDiskPerformanceLevel) {
            this.putQueryParameter("RootDiskPerformanceLevel", rootDiskPerformanceLevel);
            this.rootDiskPerformanceLevel = rootDiskPerformanceLevel;
            return this;
        }

        /**
         * The size of the system disk. Unit: GiB. The value of this parameter must be consistent with the system disk size supported by the cloud computer instance type. For more information, see [Overview](~~188609~~).
         */
        public Builder rootDiskSizeGib(Integer rootDiskSizeGib) {
            this.putQueryParameter("RootDiskSizeGib", rootDiskSizeGib);
            this.rootDiskSizeGib = rootDiskSizeGib;
            return this;
        }

        /**
         * The PL of the data disk. When the cloud computer instance type that is specified by the DesktopType parameter is set to a graphical instance type or instance type with a high clock speed, you can set the performance level of the disks. For more information about the differences among disks at different PLs, see [Enhanced SSDs](~~122389~~).
         * <p>
         * 
         * Valid values:
         * 
         * *   PL1
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   PL0
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   PL3
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   PL2
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder userDiskPerformanceLevel(String userDiskPerformanceLevel) {
            this.putQueryParameter("UserDiskPerformanceLevel", userDiskPerformanceLevel);
            this.userDiskPerformanceLevel = userDiskPerformanceLevel;
            return this;
        }

        /**
         * The data disk sizes. You can configure only one data disk.
         */
        public Builder userDiskSizeGib(java.util.List < Integer > userDiskSizeGib) {
            this.putQueryParameter("UserDiskSizeGib", userDiskSizeGib);
            this.userDiskSizeGib = userDiskSizeGib;
            return this;
        }

        @Override
        public CreateBundleRequest build() {
            return new CreateBundleRequest(this);
        } 

    } 

}
