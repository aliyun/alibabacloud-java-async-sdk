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
 * {@link CreateBundleRequest} extends {@link RequestModel}
 *
 * <p>CreateBundleRequest</p>
 */
public class CreateBundleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BundleName")
    private String bundleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String desktopType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RootDiskPerformanceLevel")
    private String rootDiskPerformanceLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RootDiskSizeGib")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer rootDiskSizeGib;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserDiskPerformanceLevel")
    private String userDiskPerformanceLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserDiskSizeGib")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Integer> userDiskSizeGib;

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
    public java.util.List<Integer> getUserDiskSizeGib() {
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
        private java.util.List<Integer> userDiskSizeGib; 

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
         * <p>The name of the cloud computer template.</p>
         * 
         * <strong>example:</strong>
         * <p>testBundleName</p>
         */
        public Builder bundleName(String bundleName) {
            this.putQueryParameter("BundleName", bundleName);
            this.bundleName = bundleName;
            return this;
        }

        /**
         * <p>The description of the cloud computer template.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The cloud computer specifications. You can call <a href="https://help.aliyun.com/document_detail/436974.html">DescribeBundles</a> to query cloud computer templates and obtain the supported cloud computer specifications from the <code>DesktopType</code> parameter in the response.</p>
         * <blockquote>
         * <p>Non-GPU images can only use non-GPU specifications, and GPU images can only use GPU specifications.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eds.enterprise_office.2c4g</p>
         */
        public Builder desktopType(String desktopType) {
            this.putQueryParameter("DesktopType", desktopType);
            this.desktopType = desktopType;
            return this;
        }

        /**
         * <p>The image ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>m-4zfb6zj728hhr****</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The operating system language. Currently, only system images are supported. Valid values:</p>
         * <ul>
         * <li>zh-CN: Simplified Chinese.</li>
         * <li>zh-HK: Traditional Chinese (Hong Kong (China)).</li>
         * <li>en-US: English.</li>
         * <li>ja-JP: Japanese.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
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
         * <p>The performance level of the system cloud disk. When the cloud computer specifications are set to graphics or high frequency, you can configure the cloud disk performance level. For more information about the differences between performance levels, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSD cloud disks</a>. Settings: standard SSD and ESSD cloud disks are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        public Builder rootDiskPerformanceLevel(String rootDiskPerformanceLevel) {
            this.putQueryParameter("RootDiskPerformanceLevel", rootDiskPerformanceLevel);
            this.rootDiskPerformanceLevel = rootDiskPerformanceLevel;
            return this;
        }

        /**
         * <p>The system disk size. Unit: GiB. The supported system disk sizes correspond to the specifications. For more information, see <a href="https://help.aliyun.com/document_detail/188609.html">Overview of cloud computer specifications</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder rootDiskSizeGib(Integer rootDiskSizeGib) {
            this.putQueryParameter("RootDiskSizeGib", rootDiskSizeGib);
            this.rootDiskSizeGib = rootDiskSizeGib;
            return this;
        }

        /**
         * <p>The performance level of the data cloud disk. When the cloud computer specifications are set to graphics or high frequency, you can configure the cloud disk performance level. For more information about the differences between performance levels, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSD cloud disks</a>. Settings: standard SSD and ESSD cloud disks are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        public Builder userDiskPerformanceLevel(String userDiskPerformanceLevel) {
            this.putQueryParameter("UserDiskPerformanceLevel", userDiskPerformanceLevel);
            this.userDiskPerformanceLevel = userDiskPerformanceLevel;
            return this;
        }

        /**
         * <p>The list of data disk sizes. Currently, only one data disk can be configured.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         */
        public Builder userDiskSizeGib(java.util.List<Integer> userDiskSizeGib) {
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
