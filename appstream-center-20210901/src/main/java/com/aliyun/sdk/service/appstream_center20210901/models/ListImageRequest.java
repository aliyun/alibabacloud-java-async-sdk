// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ListImageRequest} extends {@link RequestModel}
 *
 * <p>ListImageRequest</p>
 */
public class ListImageRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizRegionIdList")
    private java.util.List<String> bizRegionIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizType")
    private Integer bizType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizTypeList")
    private java.util.List<Integer> bizTypeList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FeatureList")
    private java.util.List<String> featureList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FotaVersion")
    private String fotaVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageName")
    private String imageName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageType")
    private String imageType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LanguageType")
    private String languageType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OsType")
    private String osType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PackageType")
    private String packageType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlatformName")
    private String platformName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlatformNameList")
    private java.util.List<String> platformNameList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductTypeList")
    private java.util.List<String> productTypeList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProtocolType")
    private String protocolType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceInstanceType")
    private String resourceInstanceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagList")
    private java.util.List<TagList> tagList;

    private ListImageRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizRegionIdList = builder.bizRegionIdList;
        this.bizType = builder.bizType;
        this.bizTypeList = builder.bizTypeList;
        this.featureList = builder.featureList;
        this.fotaVersion = builder.fotaVersion;
        this.imageId = builder.imageId;
        this.imageName = builder.imageName;
        this.imageType = builder.imageType;
        this.languageType = builder.languageType;
        this.osType = builder.osType;
        this.packageType = builder.packageType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.platformName = builder.platformName;
        this.platformNameList = builder.platformNameList;
        this.productType = builder.productType;
        this.productTypeList = builder.productTypeList;
        this.protocolType = builder.protocolType;
        this.resourceInstanceType = builder.resourceInstanceType;
        this.status = builder.status;
        this.tagList = builder.tagList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListImageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return bizRegionIdList
     */
    public java.util.List<String> getBizRegionIdList() {
        return this.bizRegionIdList;
    }

    /**
     * @return bizType
     */
    public Integer getBizType() {
        return this.bizType;
    }

    /**
     * @return bizTypeList
     */
    public java.util.List<Integer> getBizTypeList() {
        return this.bizTypeList;
    }

    /**
     * @return featureList
     */
    public java.util.List<String> getFeatureList() {
        return this.featureList;
    }

    /**
     * @return fotaVersion
     */
    public String getFotaVersion() {
        return this.fotaVersion;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
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
     * @return osType
     */
    public String getOsType() {
        return this.osType;
    }

    /**
     * @return packageType
     */
    public String getPackageType() {
        return this.packageType;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return platformName
     */
    public String getPlatformName() {
        return this.platformName;
    }

    /**
     * @return platformNameList
     */
    public java.util.List<String> getPlatformNameList() {
        return this.platformNameList;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return productTypeList
     */
    public java.util.List<String> getProductTypeList() {
        return this.productTypeList;
    }

    /**
     * @return protocolType
     */
    public String getProtocolType() {
        return this.protocolType;
    }

    /**
     * @return resourceInstanceType
     */
    public String getResourceInstanceType() {
        return this.resourceInstanceType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tagList
     */
    public java.util.List<TagList> getTagList() {
        return this.tagList;
    }

    public static final class Builder extends Request.Builder<ListImageRequest, Builder> {
        private String regionId; 
        private java.util.List<String> bizRegionIdList; 
        private Integer bizType; 
        private java.util.List<Integer> bizTypeList; 
        private java.util.List<String> featureList; 
        private String fotaVersion; 
        private String imageId; 
        private String imageName; 
        private String imageType; 
        private String languageType; 
        private String osType; 
        private String packageType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String platformName; 
        private java.util.List<String> platformNameList; 
        private String productType; 
        private java.util.List<String> productTypeList; 
        private String protocolType; 
        private String resourceInstanceType; 
        private String status; 
        private java.util.List<TagList> tagList; 

        private Builder() {
            super();
        } 

        private Builder(ListImageRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizRegionIdList = request.bizRegionIdList;
            this.bizType = request.bizType;
            this.bizTypeList = request.bizTypeList;
            this.featureList = request.featureList;
            this.fotaVersion = request.fotaVersion;
            this.imageId = request.imageId;
            this.imageName = request.imageName;
            this.imageType = request.imageType;
            this.languageType = request.languageType;
            this.osType = request.osType;
            this.packageType = request.packageType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.platformName = request.platformName;
            this.platformNameList = request.platformNameList;
            this.productType = request.productType;
            this.productTypeList = request.productTypeList;
            this.protocolType = request.protocolType;
            this.resourceInstanceType = request.resourceInstanceType;
            this.status = request.status;
            this.tagList = request.tagList;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The regions that are supported. The EDS images are centralized. Use this parameter to query the regions where the image is deployed.</p>
         */
        public Builder bizRegionIdList(java.util.List<String> bizRegionIdList) {
            this.putBodyParameter("BizRegionIdList", bizRegionIdList);
            this.bizRegionIdList = bizRegionIdList;
            return this;
        }

        /**
         * <p>The service type. This parameter is not available publicly.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>1 (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder bizType(Integer bizType) {
            this.putBodyParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>The list of all service types. It is not available publicly.</p>
         */
        public Builder bizTypeList(java.util.List<Integer> bizTypeList) {
            this.putBodyParameter("BizTypeList", bizTypeList);
            this.bizTypeList = bizTypeList;
            return this;
        }

        /**
         * <p>The features supported by the image.</p>
         */
        public Builder featureList(java.util.List<String> featureList) {
            this.putBodyParameter("FeatureList", featureList);
            this.featureList = featureList;
            return this;
        }

        /**
         * <p>The image version.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0.3-xxxx</p>
         */
        public Builder fotaVersion(String fotaVersion) {
            this.putBodyParameter("FotaVersion", fotaVersion);
            this.fotaVersion = fotaVersion;
            return this;
        }

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>img-bp13mu****</p>
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The image name. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>DemoImage</p>
         */
        public Builder imageName(String imageName) {
            this.putBodyParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * <p>The type of the images.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>User: a custom image.</li>
         * <li>Shared: a shared image.</li>
         * <li>System: a system image.</li>
         * <li>Community: a community image.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>User</p>
         */
        public Builder imageType(String imageType) {
            this.putBodyParameter("ImageType", imageType);
            this.imageType = imageType;
            return this;
        }

        /**
         * <p>The language.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>en-US: English.</li>
         * <li>zh-HK: Chinese, Traditional (Hong Kong, China).</li>
         * <li>zh-CN: Simplified Chinese.</li>
         * <li>ja-JP: Japanese.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder languageType(String languageType) {
            this.putBodyParameter("LanguageType", languageType);
            this.languageType = languageType;
            return this;
        }

        /**
         * <p>The OS type of the image.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Linux</li>
         * <li>Unknown</li>
         * <li>Windows</li>
         * <li>Android</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        public Builder osType(String osType) {
            this.putBodyParameter("OsType", osType);
            this.osType = osType;
            return this;
        }

        /**
         * <p>The image encapsulation type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Ecs_Container: ECS and Docker image</li>
         * <li>Ecs: ECS image</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ecs</p>
         */
        public Builder packageType(String packageType) {
            this.putBodyParameter("PackageType", packageType);
            this.packageType = packageType;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Maximum value: 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The name of the operating system platform.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Ubuntu</li>
         * <li>Debian</li>
         * <li>Windows Server 2022</li>
         * <li>Windows Server 2019</li>
         * <li>Windows Server 2016</li>
         * <li>Windows 11</li>
         * <li>Windows 10</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Windows Server 2019</p>
         */
        public Builder platformName(String platformName) {
            this.putBodyParameter("PlatformName", platformName);
            this.platformName = platformName;
            return this;
        }

        /**
         * <p>The list of supported platform types. For valid values, refer to PlatformName above.</p>
         */
        public Builder platformNameList(java.util.List<String> platformNameList) {
            this.putBodyParameter("PlatformNameList", platformNameList);
            this.platformNameList = platformNameList;
            return this;
        }

        /**
         * <p>The product type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>CloudDesktop: Elastic Desktop Service</li>
         * <li>CloudApp: App Streaming</li>
         * <li>WuyingServer: Workstation</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CloudApp</p>
         */
        public Builder productType(String productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>The list of products that are supported when the image supports multiple products.</p>
         */
        public Builder productTypeList(java.util.List<String> productTypeList) {
            this.putBodyParameter("ProductTypeList", productTypeList);
            this.productTypeList = productTypeList;
            return this;
        }

        /**
         * <p>The protocol type of the image.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>HDX: the High-definition Experience (HDX) protocol</li>
         * <li>ASP: the Alibaba Cloud-developed ASP protocol</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ASP</p>
         */
        public Builder protocolType(String protocolType) {
            this.putBodyParameter("ProtocolType", protocolType);
            this.protocolType = protocolType;
            return this;
        }

        /**
         * <p>Find images with certain fixed specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>eds.enterprise_office.2c4g</p>
         */
        public Builder resourceInstanceType(String resourceInstanceType) {
            this.putBodyParameter("ResourceInstanceType", resourceInstanceType);
            this.resourceInstanceType = resourceInstanceType;
            return this;
        }

        /**
         * <p>The status of the image. You can query images in the specified status. By default, all images in the Not Deleted state are queried.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>AVAILABLE: The image is available.</li>
         * <li>INIT: The image is being initialized.</li>
         * <li>CREATE_FAILED: The image failed to be created.</li>
         * <li>CREATING: The image is being created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INIT</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The tags to query.</p>
         */
        public Builder tagList(java.util.List<TagList> tagList) {
            this.putQueryParameter("TagList", tagList);
            this.tagList = tagList;
            return this;
        }

        @Override
        public ListImageRequest build() {
            return new ListImageRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListImageRequest} extends {@link TeaModel}
     *
     * <p>ListImageRequest</p>
     */
    public static class TagList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private TagList(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagList create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(TagList model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the custom tag.</p>
             * 
             * <strong>example:</strong>
             * <p>env</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the custom tag.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TagList build() {
                return new TagList(this);
            } 

        } 

    }
}
