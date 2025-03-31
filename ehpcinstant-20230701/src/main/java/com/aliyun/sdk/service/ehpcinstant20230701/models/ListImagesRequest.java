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
 * {@link ListImagesRequest} extends {@link RequestModel}
 *
 * <p>ListImagesRequest</p>
 */
public class ListImagesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageCategory")
    private String imageCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageIds")
    private java.util.List<String> imageIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageNames")
    private java.util.List<String> imageNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageType")
    private String imageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    private ListImagesRequest(Builder builder) {
        super(builder);
        this.imageCategory = builder.imageCategory;
        this.imageIds = builder.imageIds;
        this.imageNames = builder.imageNames;
        this.imageType = builder.imageType;
        this.mode = builder.mode;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListImagesRequest create() {
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
     * @return imageIds
     */
    public java.util.List<String> getImageIds() {
        return this.imageIds;
    }

    /**
     * @return imageNames
     */
    public java.util.List<String> getImageNames() {
        return this.imageNames;
    }

    /**
     * @return imageType
     */
    public String getImageType() {
        return this.imageType;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListImagesRequest, Builder> {
        private String imageCategory; 
        private java.util.List<String> imageIds; 
        private java.util.List<String> imageNames; 
        private String imageType; 
        private String mode; 
        private Long pageNumber; 
        private Long pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListImagesRequest request) {
            super(request);
            this.imageCategory = request.imageCategory;
            this.imageIds = request.imageIds;
            this.imageNames = request.imageNames;
            this.imageType = request.imageType;
            this.mode = request.mode;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
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
         * ImageIds.
         */
        public Builder imageIds(java.util.List<String> imageIds) {
            String imageIdsShrink = shrink(imageIds, "ImageIds", "json");
            this.putQueryParameter("ImageIds", imageIdsShrink);
            this.imageIds = imageIds;
            return this;
        }

        /**
         * ImageNames.
         */
        public Builder imageNames(java.util.List<String> imageNames) {
            String imageNamesShrink = shrink(imageNames, "ImageNames", "json");
            this.putQueryParameter("ImageNames", imageNamesShrink);
            this.imageNames = imageNames;
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
         * Mode.
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListImagesRequest build() {
            return new ListImagesRequest(this);
        } 

    } 

}
