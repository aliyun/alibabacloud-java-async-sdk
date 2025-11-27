// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpcinstant20230701.models;

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
 * {@link GetImageRequest} extends {@link RequestModel}
 *
 * <p>GetImageRequest</p>
 */
public class GetImageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdditionalRegionIds")
    private java.util.List<String> additionalRegionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageCategory")
    private String imageCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageType")
    private String imageType;

    private GetImageRequest(Builder builder) {
        super(builder);
        this.additionalRegionIds = builder.additionalRegionIds;
        this.imageCategory = builder.imageCategory;
        this.imageId = builder.imageId;
        this.imageType = builder.imageType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return additionalRegionIds
     */
    public java.util.List<String> getAdditionalRegionIds() {
        return this.additionalRegionIds;
    }

    /**
     * @return imageCategory
     */
    public String getImageCategory() {
        return this.imageCategory;
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

    public static final class Builder extends Request.Builder<GetImageRequest, Builder> {
        private java.util.List<String> additionalRegionIds; 
        private String imageCategory; 
        private String imageId; 
        private String imageType; 

        private Builder() {
            super();
        } 

        private Builder(GetImageRequest request) {
            super(request);
            this.additionalRegionIds = request.additionalRegionIds;
            this.imageCategory = request.imageCategory;
            this.imageId = request.imageId;
            this.imageType = request.imageType;
        } 

        /**
         * AdditionalRegionIds.
         */
        public Builder additionalRegionIds(java.util.List<String> additionalRegionIds) {
            String additionalRegionIdsShrink = shrink(additionalRegionIds, "AdditionalRegionIds", "json");
            this.putQueryParameter("AdditionalRegionIds", additionalRegionIdsShrink);
            this.additionalRegionIds = additionalRegionIds;
            return this;
        }

        /**
         * <p>The source of the image. Valid values:</p>
         * <ul>
         * <li>Public: public images provided by Alibaba Cloud.</li>
         * <li>Custom: the custom image that you added.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        public Builder imageCategory(String imageCategory) {
            this.putQueryParameter("ImageCategory", imageCategory);
            this.imageCategory = imageCategory;
            return this;
        }

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>m-2ze74g5mvy4pjg*****</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The type of the images. Valid values:</p>
         * <ul>
         * <li>VM: virtual machine image.</li>
         * <li>Container: the container image.</li>
         * </ul>
         * <p>Default value: VM</p>
         * 
         * <strong>example:</strong>
         * <p>VM</p>
         */
        public Builder imageType(String imageType) {
            this.putQueryParameter("ImageType", imageType);
            this.imageType = imageType;
            return this;
        }

        @Override
        public GetImageRequest build() {
            return new GetImageRequest(this);
        } 

    } 

}
