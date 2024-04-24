// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpcinstant20230701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListImagesRequest} extends {@link RequestModel}
 *
 * <p>ListImagesRequest</p>
 */
public class ListImagesRequest extends Request {
    @Query
    @NameInMap("ImageIds")
    private java.util.List < String > imageIds;

    @Query
    @NameInMap("ImageNames")
    private java.util.List < String > imageNames;

    @Query
    @NameInMap("PageNumber")
    private Long pageNumber;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    private ListImagesRequest(Builder builder) {
        super(builder);
        this.imageIds = builder.imageIds;
        this.imageNames = builder.imageNames;
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
     * @return imageIds
     */
    public java.util.List < String > getImageIds() {
        return this.imageIds;
    }

    /**
     * @return imageNames
     */
    public java.util.List < String > getImageNames() {
        return this.imageNames;
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
        private java.util.List < String > imageIds; 
        private java.util.List < String > imageNames; 
        private Long pageNumber; 
        private Long pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListImagesRequest request) {
            super(request);
            this.imageIds = request.imageIds;
            this.imageNames = request.imageNames;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * ImageIds.
         */
        public Builder imageIds(java.util.List < String > imageIds) {
            String imageIdsShrink = shrink(imageIds, "ImageIds", "json");
            this.putQueryParameter("ImageIds", imageIdsShrink);
            this.imageIds = imageIds;
            return this;
        }

        /**
         * ImageNames.
         */
        public Builder imageNames(java.util.List < String > imageNames) {
            String imageNamesShrink = shrink(imageNames, "ImageNames", "json");
            this.putQueryParameter("ImageNames", imageNamesShrink);
            this.imageNames = imageNames;
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
