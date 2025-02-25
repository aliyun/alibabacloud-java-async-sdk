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
    @com.aliyun.core.annotation.NameInMap("ImageCategory")
    private String imageCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageType")
    private String imageType;

    private GetImageRequest(Builder builder) {
        super(builder);
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
        private String imageCategory; 
        private String imageId; 
        private String imageType; 

        private Builder() {
            super();
        } 

        private Builder(GetImageRequest request) {
            super(request);
            this.imageCategory = request.imageCategory;
            this.imageId = request.imageId;
            this.imageType = request.imageType;
        } 

        /**
         * ImageCategory.
         */
        public Builder imageCategory(String imageCategory) {
            this.putQueryParameter("ImageCategory", imageCategory);
            this.imageCategory = imageCategory;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * ImageType.
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
