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
 * {@link GetEffectiveImageByIdRequest} extends {@link RequestModel}
 *
 * <p>GetEffectiveImageByIdRequest</p>
 */
public class GetEffectiveImageByIdRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    private String bizRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContentLocale")
    private String contentLocale;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IgnoreFilter")
    private Boolean ignoreFilter;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageType")
    private String imageType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShowHidden")
    private String showHidden;

    private GetEffectiveImageByIdRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizRegionId = builder.bizRegionId;
        this.contentLocale = builder.contentLocale;
        this.ignoreFilter = builder.ignoreFilter;
        this.imageId = builder.imageId;
        this.imageType = builder.imageType;
        this.productType = builder.productType;
        this.showHidden = builder.showHidden;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEffectiveImageByIdRequest create() {
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
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return contentLocale
     */
    public String getContentLocale() {
        return this.contentLocale;
    }

    /**
     * @return ignoreFilter
     */
    public Boolean getIgnoreFilter() {
        return this.ignoreFilter;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return imageType
     */
    public String getImageType() {
        return this.imageType;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return showHidden
     */
    public String getShowHidden() {
        return this.showHidden;
    }

    public static final class Builder extends Request.Builder<GetEffectiveImageByIdRequest, Builder> {
        private String regionId; 
        private String bizRegionId; 
        private String contentLocale; 
        private Boolean ignoreFilter; 
        private String imageId; 
        private String imageType; 
        private String productType; 
        private String showHidden; 

        private Builder() {
            super();
        } 

        private Builder(GetEffectiveImageByIdRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizRegionId = request.bizRegionId;
            this.contentLocale = request.contentLocale;
            this.ignoreFilter = request.ignoreFilter;
            this.imageId = request.imageId;
            this.imageType = request.imageType;
            this.productType = request.productType;
            this.showHidden = request.showHidden;
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
         * <p>The ID of the business region to query. If this parameter is not specified, regions are not filtered by this parameter. The returned regions are still constrained by the product type and the visible scope of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putBodyParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * <p>The content language of the community image documentation in BCP 47 format, such as zh-CN and en-US. Default value: zh-CN.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder contentLocale(String contentLocale) {
            this.putBodyParameter("ContentLocale", contentLocale);
            this.contentLocale = contentLocale;
            return this;
        }

        /**
         * <p>Specifies whether to skip filtering based on the operating system and adaptation status of adapted applications. Default value: false. A value of false retains only applications that match the image operating system and have completed adaptation. A value of true skips these two filters. Application type filtering is still controlled by the API operation and the ShowHidden parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder ignoreFilter(Boolean ignoreFilter) {
            this.putBodyParameter("IgnoreFilter", ignoreFilter);
            this.ignoreFilter = ignoreFilter;
            return this;
        }

        /**
         * <p>The image ID. This parameter is required when querying effective versions.</p>
         * 
         * <strong>example:</strong>
         * <p>imgc-bp1example****</p>
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The image type. Valid values:</p>
         * <ul>
         * <li>System: system images.</li>
         * <li>User: custom images.</li>
         * <li>Shared: shared images.</li>
         * <li>Community: community images.</li>
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
         * <p>The product type, such as CloudDesktop (Cloud Desktop), CloudApp (Cloud App), and WuyingServer (workstation).</p>
         * 
         * <strong>example:</strong>
         * <p>CloudDesktop</p>
         */
        public Builder productType(String productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>Specifies the additional virtual application types to include in the response besides the default user and system applications. Valid values:</p>
         * <ul>
         * <li>VIRTUAL_DESKTOP_APP: desktop virtual applications.</li>
         * <li>ALL_VIRTUAL_APP: all virtual applications.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VIRTUAL_DESKTOP_APP</p>
         */
        public Builder showHidden(String showHidden) {
            this.putBodyParameter("ShowHidden", showHidden);
            this.showHidden = showHidden;
            return this;
        }

        @Override
        public GetEffectiveImageByIdRequest build() {
            return new GetEffectiveImageByIdRequest(this);
        } 

    } 

}
